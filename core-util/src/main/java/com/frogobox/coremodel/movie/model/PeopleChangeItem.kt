package com.frogobox.coremodel.movie.model

data class PeopleChangeItem(
    val action: String?,
    val id: String?,
    val original_value: com.frogobox.coremodel.movie.model.PeopleChangeOriginalValue?,
    val time: String?
)