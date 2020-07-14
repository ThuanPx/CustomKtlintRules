package com.thuanpx.customktlinrules

import com.pinterest.ktlint.core.Rule
import org.jetbrains.kotlin.KtNodeTypes
import org.jetbrains.kotlin.com.intellij.lang.ASTNode
import org.jetbrains.kotlin.com.intellij.psi.impl.source.tree.ElementType
import org.jetbrains.kotlin.com.intellij.psi.tree.TokenSet
import org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes

/**
 * Copyright © 2020 Neolab VN.
 * Created by ThuanPx on 7/12/20.
 */
class NoVarCompanionRule : Rule("no-var-companion") {
    override fun visit(
        node: ASTNode,
        autoCorrect: Boolean,
        emit: (offset: Int, errorMessage: String, canBeAutoCorrected: Boolean) -> Unit
    ) {
        if (node.elementType == KtStubElementTypes.OBJECT_DECLARATION) {
            val childs = node.findChildByType(KtNodeTypes.CLASS_BODY)?.getChildren(TokenSet.create(KtNodeTypes.PROPERTY))
           childs?.forEach { child ->
                val listtest = child.text.split(" ")
                if (listtest.contains("var")) {
                    emit(node.startOffset, "Not used var in companion object!", false)
                }
           }
        }
    }
}