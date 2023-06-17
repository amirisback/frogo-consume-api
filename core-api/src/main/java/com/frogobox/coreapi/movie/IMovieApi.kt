package com.frogobox.coreapi.movie


import com.frogobox.coresdk.response.FrogoDataResponse
import okhttp3.Interceptor


/*
 * Created by faisalamir on 07/04/22
 * FrogoConsumeApi
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 Frogobox Media Inc.      
 * All rights reserved
 *
 */

interface IMovieApi {

    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(isDebug: Boolean, chuckerInterceptor: Interceptor): IMovieApi

    // ---------------------------------------------------------------------------------------------

    // CERTIFICATIONS
    // Get Movie Certifications
    fun getMovieCertifications(callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Certifications<com.frogobox.coreutil.movie.model.CertificationMovie>>)

    // CERTIFICATIONS
    // Get TV Certifications
    fun getTvCertifications(callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Certifications<com.frogobox.coreutil.movie.model.CertificationTv>>)

    // ---------------------------------------------------------------------------------------------

    // CHANGES
    // Get Movie Change List
    fun getMovieChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Changes>
    )

    // CHANGES
    // Get TV Change List
    fun getTvChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Changes>
    )

    // CHANGES
    // Get Person Change List
    fun getPersonChangeList(
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Changes>
    )

    // ---------------------------------------------------------------------------------------------

    // COLLECTION
    // Get Details
    fun getCollectionDetails(
        collection_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.CollectionsDetail>
    )

    // COLLECTION
    // Get Images
    fun getCollectionImages(
        collection_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.CollectionsImage>
    )

    // COLLECTION
    // Get Translations
    fun getCollectionTranslations(
        collection_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.CollectionsTranslation>
    )

    // ---------------------------------------------------------------------------------------------

    // COMPANIES
    // Get Details
    fun getCompaniesDetails(
        company_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.CompaniesDetail>
    )

    // COMPANIES
    // Get Alternative Names
    fun getCompaniesAlternativeName(
        company_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.CompaniesAlternateName>
    )

    // COMPANIES
    // Get Images
    fun getCompaniesImage(
        company_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.CompaniesImage>
    )

    // ---------------------------------------------------------------------------------------------

    // CONFIGURATION
    // Get API Configuration
    fun getConfigurationApi(callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.ConfigurationApi>)

    // CONFIGURATION
    // Get Countries
    fun getConfigurationCountries(callback: FrogoDataResponse<List<com.frogobox.coreutil.movie.model.ConfigurationCountry>>)

    // CONFIGURATION
    // Get Jobs
    fun getConfigurationJobs(callback: FrogoDataResponse<List<com.frogobox.coreutil.movie.model.ConfigurationJob>>)

    // CONFIGURATION
    // Get Languages
    fun getConfigurationLanguages(callback: FrogoDataResponse<List<com.frogobox.coreutil.movie.model.ConfigurationLanguage>>)

    // CONFIGURATION
    // Get Primary Translations
    fun getConfigurationTranslations(callback: FrogoDataResponse<List<String>>)

    // CONFIGURATION
    // Get Timezones
    fun getConfigurationTimezones(callback: FrogoDataResponse<List<com.frogobox.coreutil.movie.model.ConfigurationTimezone>>)

    // ---------------------------------------------------------------------------------------------

    // CREDITS
    // Get Details
    fun getCreditsDetails(credit_id: String, callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Credits>)

    // ---------------------------------------------------------------------------------------------

    // DISCOVER
    // Movie Discover
    fun getDiscoverMovie(
        language: String?,
        region: String?,
        sort_by: String?,
        certification_country: String?,
        certification: String?,
        certification_lte: String?,
        certification_gte: String?,
        include_adult: Boolean?,
        include_video: Boolean?,
        page: Int?,
        primary_release_year: Int?,
        primary_release_date_gte: String?,
        primary_release_date_lte: String?,
        release_date_gte: String?,
        release_date_lte: String?,
        with_release_type: Int?,
        year: Int?,
        vote_count_gte: Int?,
        vote_count_lte: Int?,
        vote_average_gte: Double?,
        vote_average_lte: Double?,
        with_cast: String?,
        with_crew: String?,
        with_people: String?,
        with_companies: String?,
        with_genres: String?,
        without_genres: String?,
        with_keywords: String?,
        without_keywords: String?,
        with_runtime_gte: Double?,
        with_runtime_lte: Double?,
        with_original_language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Discover<com.frogobox.coreutil.movie.model.DiscoverMovie>>
    )

    // DISCOVER
    // TV Discover
    fun getDiscoverTv(
        language: String?,
        sort_by: String?,
        air_date_gte: String?,
        air_date_lte: String?,
        first_air_date_gte: String?,
        first_air_date_lte: String?,
        first_air_date_year: Int?,
        page: Int?,
        timezone: String?,
        vote_average_gte: Double?,
        vote_count_gte: Int?,
        with_genres: String?,
        with_networks: String?,
        without_genres: String?,
        with_runtime_gte: Double?,
        with_runtime_lte: Double?,
        include_null_first_air_dates: String?,
        with_original_language: String?,
        without_keywords: String?,
        screened_theatrically: String?,
        with_companies: String?,
        with_keywords: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Discover<com.frogobox.coreutil.movie.model.DiscoverTv>>
    )

    // ---------------------------------------------------------------------------------------------

    // FIND
    // Find by ID
    fun getFindById(
        external_id: String,
        external_source: String,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Find>
    )

    // ---------------------------------------------------------------------------------------------

    // GENRES
    // Get Movie List
    fun getGenresMovie(
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Genres>
    )

    // GENRES
    // Get TV List
    fun getGenresTv(
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Genres>
    )

    // ---------------------------------------------------------------------------------------------

    // KEYWORDS
    // Get Details
    fun getKeywordsDetail(
        keyword_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.KeywordsDetail>
    )

    // KEYWORDS
    // Get Movies
    fun getKeywordsMovie(
        keyword_id: Int,
        language: String?,
        include_adult: Boolean?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.KeywordsMovies>
    )

    // ---------------------------------------------------------------------------------------------

    // MOVIES
    // Get Details
    fun getMoviesDetails(
        movie_id: Int,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieDetail>
    )

    // MOVIES
    // Get Account States
    fun getMoviesAccountState(
        movie_id: Int,
        session_id: String,
        guest_session_id: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieAccountState>
    )

    // MOVIES
    // Get Alternative Titles
    fun getMoviesAlternativeTitles(
        movie_id: Int,
        country: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieAlternativeTitle>
    )

    // MOVIES
    // Get Changes
    fun getMoviesChanges(
        movie_id: Int,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieChanges>
    )

    // MOVIES
    // Get Credits
    fun getMoviesCredits(
        movie_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieCredit>
    )

    // MOVIES
    // Get External Ids
    fun getMoviesExternalIds(
        movie_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieExternalId>
    )

    // MOVIES
    // Get Images
    fun getMoviesImages(
        movie_id: Int,
        language: String?,
        include_image_language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieImages>
    )

    // MOVIES
    // Get Keywords
    fun getMoviesKeywords(
        movie_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieKeywords>
    )

    // MOVIES
    // Get Release Dates
    fun getMoviesReleaseDates(
        movie_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieReleaseDates>
    )

    // MOVIES
    // Get Videos
    fun getMoviesVideos(
        movie_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieVideos>
    )

    // MOVIES
    // Get Translations
    fun getMoviesTranslations(
        movie_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieTranslations>
    )

    // MOVIES
    // Get Recommendations
    fun getMoviesRecommendations(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieRecommendations>
    )

    // MOVIES
    // Get Similar Movies
    fun getMoviesSimilarMovies(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieSimilarMovies>
    )

    // MOVIES
    // Get Reviews
    fun getMoviesReviews(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieReviews>
    )

    // MOVIES
    // Get Lists
    fun getMoviesLists(
        movie_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieLists>
    )

    // MOVIES
    // Get Latest
    fun getMoviesLatest(
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieLatest>
    )

    // MOVIES
    // Get Now Playing
    fun getMoviesNowPlaying(
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieNowPlayings>
    )

    // MOVIES
    // Get Popular
    fun getMoviesPopular(
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MoviePopulars>
    )

    // MOVIES
    // Get Top Rated
    fun getMoviesTopRated(
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieTopRated>
    )

    // MOVIES
    // Get Upcoming
    fun getMoviesUpcoming(
        language: String?,
        page: Int?,
        region: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.MovieUpcoming>
    )

    // ---------------------------------------------------------------------------------------------

    // TRENDING
    // Get Trending All Day
    fun getTrendingAllDay(
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Trending<com.frogobox.coreutil.movie.model.TrendingAll>>
    )

    // TRENDING
    // Get Trending All Week
    fun getTrendingAllWeek(
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Trending<com.frogobox.coreutil.movie.model.TrendingAll>>
    )

    // TRENDING
    // Get Trending Movie Day
    fun getTrendingMovieDay(
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Trending<com.frogobox.coreutil.movie.model.TrendingMovie>>
    )

    // TRENDING
    // Get Trending Movie Week
    fun getTrendingMovieWeek(
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Trending<com.frogobox.coreutil.movie.model.TrendingMovie>>
    )

    // TRENDING
    // Get Trending Person Day
    fun getTrendingPersonDay(
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Trending<com.frogobox.coreutil.movie.model.TrendingPerson>>
    )

    // TRENDING
    // Get Trending Person Week
    fun getTrendingPersonWeek(
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Trending<com.frogobox.coreutil.movie.model.TrendingPerson>>
    )

    // TRENDING
    // Get Trending TV Day
    fun getTrendingTvDay(
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Trending<com.frogobox.coreutil.movie.model.TrendingTv>>
    )

    // TRENDING
    // Get Trending TV Week
    fun getTrendingTvWeek(
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Trending<com.frogobox.coreutil.movie.model.TrendingTv>>
    )

    // ---------------------------------------------------------------------------------------------

    // REVIEWS
    // Get Details
    fun getReviews(
        review_id: String,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.Reviews>
    )

    // ---------------------------------------------------------------------------------------------

    // NETWORKS
    // Get Details
    fun getNetworkDetail(
        network_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.NetworkDetail>
    )

    // NETWORKS
    // Get Alternative Names
    fun getNetworkAlternativeName(
        network_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.NetworkAlternativeName>
    )

    // NETWORKS
    // Get Images
    fun getNetworkImage(
        network_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.NetworkImage>
    )

    // ---------------------------------------------------------------------------------------------

    // SEARCH
    // Search Companies
    fun searchCompanies(
        query: String,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.SearchCompanies>
    )

    // SEARCH
    // Search Collections
    fun searchCollections(
        query: String,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.SearchCollections>
    )

    // SEARCH
    // Search Keywords
    fun searchKeywords(
        query: String,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.SearchKeywords>
    )

    // SEARCH
    // Search Movies
    fun searchMovies(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        year: Int?,
        primary_release_year: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.SearchMovies>
    )

    // SEARCH
    // Multi Search
    fun searchMultiSearch(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.SearchMulti>
    )

    // SEARCH
    // Search People
    fun searchPeople(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.SearchPeople>
    )

    // SEARCH
    // Search Tv Shows
    fun searchTvShows(
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        first_air_date_year: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.SearchMovies>
    )

    // ---------------------------------------------------------------------------------------------

    // TV
    // Get Details
    fun getTvDetails(
        tv_id: Int,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvDetails>
    )

    // TV
    // Get Account States
    fun getTvAccountStates(
        tv_id: Int,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvAccountStates>
    )

    // TV
    // Get Alternative Titles
    fun getTvAlternativeTitles(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvAlternativeTitles>
    )

    // TV
    // Get Changes
    fun getTvChanges(
        tv_id: Int,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvChanges>
    )

    // TV
    // Get Content Ratings
    fun getTvContentRatings(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvContentRatings>
    )

    // TV
    // Get Credits
    fun getTvCredits(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvCredits>
    )

    // TV
    // Get Episode Groups
    fun getTvEpisodeGroups(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeGroups>
    )

    // TV
    // Get External IDs
    fun getTvExternalIds(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvExternalIds>
    )

    // TV
    // Get Images
    fun getTvImages(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvImages>
    )

    // TV
    // Get Keyword
    fun getTvKeyword(
        tv_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvKeywords>
    )

    // TV
    // Get Recommendations
    fun getTvRecommendations(
        tv_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvRecommendations>
    )

    // TV
    // Get Reviews
    fun getTvReviews(
        tv_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvReviews>
    )

    // TV
    // Get Screened Theatrically
    fun getTvScreenedTheatrically(
        tv_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvScreenedTheatrically>
    )

    // TV
    // Get Similar TV Shows
    fun getTvSimilarTvShows(
        tv_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvSimilarTVShows>
    )

    // TV
    // Get Translations
    fun getTvTranslations(
        tv_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvTranslations>
    )

    // TV
    // Get Videos
    fun getTvVideos(
        tv_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvVideos>
    )

    // TV
    // Get Latest
    fun getTvLatest(
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvLatest>
    )

    // TV
    // Get TV Airing Today
    fun getTvAiringToday(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvAiringToday>
    )

    // TV
    // Get TV On The Air
    fun getTvOnTheAir(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvOnTheAir>
    )

    // TV
    // Get Popular
    fun getTvPopular(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvPopular>
    )

    // TV
    // Get Top Rated
    fun getTvTopRated(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvTopRated>
    )

    // ---------------------------------------------------------------------------------------------

    // TV SEASONS
    // Get Details
    fun getTvSeasonsDetails(
        tv_id: Int,
        season_number: Int,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvSeasonsDetails>
    )

    // TV SEASONS
    // Get Changes
    fun getTvSeasonsChanges(
        season_id: Int,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvSeasonsChanges>
    )

    // TV SEASONS
    // Get Account States
    fun getTvSeasonsAccountStates(
        tv_id: Int,
        season_number: Int,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvSeasonsAccountStates>
    )

    // TV SEASONS
    // Get Credits
    fun getTvSeasonsCredits(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvSeasonsCredits>
    )

    // TV SEASONS
    // Get External Ids
    fun getTvSeasonsExternalIds(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvSeasonsExternalIds>
    )

    // TV SEASONS
    // Get Images
    fun getTvSeasonsImages(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvSeasonsImages>
    )

    // TV SEASONS
    // Get Videos
    fun getTvSeasonsVideos(
        tv_id: Int,
        season_number: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvSeasonsVideos>
    )

    // ---------------------------------------------------------------------------------------------

    // TV EPISODE
    // Get Details
    fun getTvEpisodeDetails(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        language: String?,
        append_to_response: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeDetails>
    )

    // TV EPISODE
    // Get Changes
    fun getTvEpisodeChanges(
        episode_id: Int,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeChanges>
    )

    // TV EPISODE
    // Get Account States
    fun getTvEpisodeAccountStates(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        guest_session_id: String?,
        session_id: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeAccountStates>
    )

    // TV EPISODE
    // Get Credits
    fun getTvEpisodeCredits(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeCredits>
    )

    // TV EPISODE
    // Get External IDs
    fun getTvEpisodeExternalIds(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeExternalIds>
    )

    // TV EPISODE
    // Get Images
    fun getTvEpisodeImages(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeImages>
    )

    // TV EPISODE
    // Get Translations
    fun getTvEpisodeTranslations(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.model.TvEpisodeTranslation>
    )

    // TV EPISODE
    // Get Videos
    fun getTvEpisodeVideos(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeVideos>
    )

    // ---------------------------------------------------------------------------------------------

    // TV EPISODE GROUPS
    // Get Details
    fun getTvEpisodeGroupsDetails(
        id: String?,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.TvEpisodeGroupsDetails>
    )

    // ---------------------------------------------------------------------------------------------

    // PEOPLE
    // Get Details
    fun getPeopleDetails(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleDetails>
    )

    // PEOPLE
    // Get Changes
    fun getPeopleChanges(
        person_id: Int,
        endDate: String?,
        page: Int?,
        startDate: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleChanges>
    )

    // PEOPLE
    // Get Movie Credits
    fun getPeopleMovieCredits(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleMovieCredits>
    )

    // PEOPLE
    // Get TV Credits
    fun getPeopleTvCredits(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleTvCredits>
    )

    // PEOPLE
    // Get Combined Credits
    fun getPeopleCombinedCredits(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleCombinedCredits>
    )

    // PEOPLE
    // Get External IDs
    fun getPeopleExternalIds(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleExternalIds>
    )

    // PEOPLE
    // Get Images
    fun getPeopleImages(
        person_id: Int,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleImages>
    )

    // PEOPLE
    // Get Tagged Images
    fun getPeopleTaggedImages(
        person_id: Int,
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleTaggedImages>
    )

    // PEOPLE
    // Get Translations
    fun getPeopleTranslations(
        person_id: Int,
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleTranslations>
    )

    // PEOPLE
    // Get Latest
    fun getPeopleLatest(
        language: String?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeopleLatest>
    )

    // PEOPLE
    // Get Popular
    fun getPeoplePopular(
        language: String?,
        page: Int?,
        callback: FrogoDataResponse<com.frogobox.coreutil.movie.response.PeoplePopular>
    )


}