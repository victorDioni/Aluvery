package com.victordionizio.aluvery.dao

import com.victordionizio.aluvery.sampladata.sampleProducts

class ProductDao {

    companion object {
        private val products = sampleProducts.toMutableList()
    }

    fun products() = products.toList()

}