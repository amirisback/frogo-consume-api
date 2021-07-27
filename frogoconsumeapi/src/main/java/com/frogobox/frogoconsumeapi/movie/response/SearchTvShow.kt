package com.frogobox.frogoconsumeapi.movie.response

import com.frogobox.frogoconsumeapi.movie.model.SearchTvShowResult

data class SearchTvShow(
    val page: Int?,
    val results: List<SearchTvShowResult>?,
    val total_pages: Int?,
    val total_results: Int?
)