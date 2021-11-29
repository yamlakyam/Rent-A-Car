package com.example.rentcar.feed

import com.example.rentcar.R

class Car(
    val id: Int,
    val name: String,
    val location: String,
    val picture: Int,
    val price: String
)

val CARS = listOf<Car>(
    Car(
        id = 1,
        name = "Jeep",
        location = "Addis Ababa",
        picture = R.drawable.car_1,
        price = "1500ETB"
    ),
    Car(
        id = 2,
        name = "SportsCar",
        location = "Addis Ababa",
        picture = R.drawable.car_2,
        price = "2000ETB"
    ),
    Car(
        id = 3,
        name = "SUV",
        location = "Addis Ababa",
        picture = R.drawable.car_3,
        price = "2000ETB"
    )


)
