package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.TvOnTheAirResult

data class TvOnTheAir(
    val page: Int?,
    val results: List<TvOnTheAirResult>?,
    val total_pages: Int?,
    val total_results: Int?
)