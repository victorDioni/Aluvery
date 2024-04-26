package com.victordionizio.aluvery.extensions

import java.math.BigDecimal
import java.text.NumberFormat
import java.util.Locale

// Converter um bigDecical para uma moeda brasileira
// Qualquer bigDecimal pode chamar esse método
fun BigDecimal.toBrazilianCurrency() : String{
    return NumberFormat
        .getCurrencyInstance(Locale("pt", "br"))
        .format(this)
}