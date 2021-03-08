package patterns.singleton

import patterns.builder.Outfit

object ShoppingCart {
    private val outfitList = ArrayList<Outfit>()

    fun addToCart(outfit: Outfit){
        outfitList.add(outfit)
    }

    fun removeFromCart(outfit: Outfit){
        if (outfitList.contains(outfit))
           outfitList.remove(outfit)
    }
    fun checkout(){
        // pay now
    }
}