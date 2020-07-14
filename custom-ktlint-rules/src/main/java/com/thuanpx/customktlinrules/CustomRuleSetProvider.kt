package com.thuanpx.customktlinrules

import com.pinterest.ktlint.core.RuleSet
import com.pinterest.ktlint.core.RuleSetProvider

/**
 * Copyright © 2020 Neolab VN.
 * Created by ThuanPx on 7/11/20.
 */
class CustomRuleSetProvider : RuleSetProvider {
    override fun get(): RuleSet = RuleSet(
        "custom-ktlint-rules",
        NoVarCompanionRule()
    )
}
