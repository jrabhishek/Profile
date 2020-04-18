package com.elabs.www

data class PersonResponce(
    val results: List<Person>
)
data class Person(
    val name: Name,
    val cell: String,
    val email: String
)

data class Name(
    val first: String,
    val last: String,
    val title: String
)