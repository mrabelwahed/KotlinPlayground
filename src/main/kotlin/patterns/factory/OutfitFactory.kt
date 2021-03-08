package patterns.factory

import patterns.builder.Clothing
import patterns.builder.Shirt
import java.lang.Exception

class OutfitFactory{
    companion object{
        fun getCloths(style: OutFitStyle) : Clothing{
            return  when(style){
                OutFitStyle.SPORT -> Shirt(size = "sport-size")
                OutFitStyle.SUMMER -> Shirt(size = "sport-size")
                OutFitStyle.AUTUMN -> Shirt(size = "sport-size")
                else -> throw Exception("Not Supported class")
            }
        }
    }
}