package com.elabs.www

data class ProfileResponce(
    val results: List<Profile>
)
data class Profile(
    val cell: String,
    val email: String,
    val name: Name
)

data class Name(
    val first: String,
    val last: String,
    val title: String
)