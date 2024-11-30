package com.example.planetapp.models

import com.example.planetapp.R

data class Planet(
    val id: Int,
    val name: String,
    val type: String,
    val galaxy: String,
    val distanceFromSun: String,
    val diameter: String,
    val characteristics: String,
    val imageRes: Int,
    var isFavorite: Boolean = false
)

val planetList = mutableListOf(
    Planet(
        id = 1,
        name = "Earth",
        type = "Terrestrial",
        galaxy = "Milky Way",
        distanceFromSun = "149.6 million km",
        diameter = "12,742 km",
        characteristics = "Supports life, has water and atmosphere.",
        imageRes = R.drawable.terra
    ),
    Planet(
        id = 2,
        name = "Mars",
        type = "Terrestrial",
        galaxy = "Milky Way",
        distanceFromSun = "227.9 million km",
        diameter = "6,779 km",
        characteristics = "Known as the Red Planet, has a thin atmosphere.",
        imageRes = R.drawable.marte
    ),
    Planet(
        id = 3,
        name = "Jupiter",
        type = "Gas Giant",
        galaxy = "Milky Way",
        distanceFromSun = "778.5 million km",
        diameter = "139,820 km",
        characteristics = "Has a massive storm called the Great Red Spot.",
        imageRes = R.drawable.jupiter
    ),
    Planet(
        id = 4,
        name = "Venus",
        type = "Terrestrial",
        galaxy = "Milky Way",
        distanceFromSun = "108.2 million km",
        diameter = "12,104 km",
        characteristics = "Known for its thick, toxic atmosphere.",
        imageRes = R.drawable.venus
    ),
    Planet(
        id = 5,
        name = "Saturn",
        type = "Gas Giant",
        galaxy = "Milky Way",
        distanceFromSun = "1.43 billion km",
        diameter = "116,460 km",
        characteristics = "Has a prominent ring system.",
        imageRes = R.drawable.saturno
    ),
    Planet(
        id = 6,
        name = "Neptune",
        type = "Ice Giant",
        galaxy = "Milky Way",
        distanceFromSun = "4.5 billion km",
        diameter = "49,244 km",
        characteristics = "Has a blue color due to its density.",
        imageRes = R.drawable.netuno
    ),
    Planet(
        id = 7,
        name = "Mercury",
        type = "Terrestrial",
        galaxy = "Milky Way",
        distanceFromSun = "57.9 million km",
        diameter = "4,879 km",
        characteristics = "Closest planet to the Sun.",
        imageRes = R.drawable.mercurio
    ),
    Planet(
        id = 8,
        name = "Uranus",
        type = "Ice Giant",
        galaxy = "Milky Way",
        distanceFromSun = "2.9 billion km",
        diameter = "50,724 km",
        characteristics = "Has a unique sideways rotation.",
        imageRes = R.drawable.urano
    ),
    Planet(
        id = 9,
        name = "Pluto",
        type = "Dwarf",
        galaxy = "Milky Way",
        distanceFromSun = "5.9 billion km",
        diameter = "2,376 km",
        characteristics = "Named after the Roman god of the underworld.",
        imageRes = R.drawable.plutao
    )
)
