package patterns

import patterns.builder.OutfitBuilder
import patterns.builder.Pants
import patterns.builder.Shirt
import patterns.builder.Shoes
import patterns.decorator.OutfitWithPromotion
import patterns.factory.OutFitStyle
import patterns.factory.OutfitFactory
import patterns.singleton.ShoppingCart

fun main() {
    val outfitBuilder = OutfitBuilder()
        .setPants(Pants(size = "small"))
        .setShirt(Shirt(size = "medium"))
        .setShoes(Shoes(size = "small"))

    println(outfitBuilder.build().toString())

    // generic builder
    val genericBuilder = OutfitBuilder()
        .addClothing(Pants("XL"))
        .addClothing(Shirt("XL"))
        .addClothing(Shoes("XL"))

    println(genericBuilder.build().toString())

    ShoppingCart.addToCart(outfitBuilder.build())
    ShoppingCart.addToCart(genericBuilder.build())
    ShoppingCart.checkout()

    // factory
    val sportShirt = OutfitFactory.getCloths(OutFitStyle.SPORT)
    println(sportShirt)
    // decorator
    val outfitWithPromotion = OutfitWithPromotion(outfit = genericBuilder.build() , discount = 10.50f)
    println(outfitWithPromotion.discount)
}