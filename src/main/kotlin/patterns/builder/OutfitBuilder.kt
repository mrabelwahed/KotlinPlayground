package patterns.builder

class OutfitBuilder{
    lateinit var shoes: Shoes
    lateinit var pants: Pants
    lateinit var shirt: Shirt

    private val clothingList = ArrayList<Clothing>()

    fun setPants(pants: Pants):OutfitBuilder{
        this.pants = pants
        return this
    }

    fun setShoes(shoes: Shoes):OutfitBuilder{
        this.shoes = shoes
        return this
    }

    fun setShirt(shirt: Shirt):OutfitBuilder{
        this.shirt =shirt
        return this
    }

    fun addClothing(clothing: Clothing) : OutfitBuilder{
        clothingList.add(clothing)
        return this
    }

    fun build() :Outfit{
        clothingList.forEach{
            when (it) {
                is Shirt -> shirt = it
                is Shoes -> shoes = it
                is Pants -> pants = it
            }
        }
        return Outfit(shoes = shoes ,
            pants = pants,
            shirt = shirt
            )
    }
}