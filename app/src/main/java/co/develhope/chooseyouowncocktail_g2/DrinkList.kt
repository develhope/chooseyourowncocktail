package co.develhope.chooseyouowncocktail_g2

import co.develhope.chooseyouowncocktail_g2.domain.model.Drink
import java.util.*


object DrinkList {

    private var drinks = listOf<Drink>()




    fun drinkList(): List<Drink> {
        return drinks
    }


    fun List<Drink>.setList() {
        drinks = this
    }


    fun getByID(id: Int): Drink? {
        return drinkList().firstOrNull() { it.id == id }
    }

    fun setFavorite(drink: Drink, bool: Boolean) {
        Collections.replaceAll(
            drinks,
            drink,
            drink.copy(favourite = bool)
        )
    }

}