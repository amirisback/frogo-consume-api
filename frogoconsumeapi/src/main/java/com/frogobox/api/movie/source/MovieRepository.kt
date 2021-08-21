package com.frogobox.api.movie.source

import android.content.Context
import com.frogobox.api.movie.model.*
import com.frogobox.api.movie.response.*
import com.frogobox.api.movie.util.MovieUrl
import com.frogobox.sdk.core.FrogoApiCallback
import com.frogobox.sdk.core.FrogoApiClient
import com.frogobox.api.core.ConsumeApiResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TMDBAPI
 * Copyright (C) 10/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.movie.data.source
 *
 */
object MovieRepository : MovieDataSource {

    private var movieApiService = FrogoApiClient.create<MovieApiService>(MovieUrl.BASE_URL)

    override fun usingChuckInterceptor(context: Context) {
        movieApiService = FrogoApiClient.create(MovieUrl.BASE_URL, context)
    }

    override fun getMovieCertifications(
        apiKey: String,
        callback: ConsumeApiResponse<Certifications<CertificationMovie>>
    ) {
        movieApiService
            .getMovieCertifications(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Certifications<CertificationMovie>>() {
                override fun onSuccess(data: Certifications<CertificationMovie>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvCertifications(
        apiKey: String,
        callback: ConsumeApiResponse<Certifications<CertificationTv>>
    ) {
        movieApiService
            .getTvCertifications(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Certifications<CertificationTv>>() {
                override fun onSuccess(data: Certifications<CertificationTv>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMovieChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    ) {
        movieApiService
            .getMovieChangeList(apiKey, endDate, startDate, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Changes>() {
                override fun onSuccess(data: Changes) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    ) {
        movieApiService
            .getTvChangeList(apiKey, endDate, startDate, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Changes>() {
                override fun onSuccess(data: Changes) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getPersonChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<Changes>
    ) {
        movieApiService
            .getPersonChangeList(apiKey, endDate, startDate, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Changes>() {
                override fun onSuccess(data: Changes) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getCollectionDetails(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<CollectionsDetail>
    ) {
        movieApiService
            .getCollectionDetails(collection_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<CollectionsDetail>() {
                override fun onSuccess(data: CollectionsDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getCollectionImages(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<CollectionsImage>
    ) {
        movieApiService
            .getCollectionImages(collection_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<CollectionsImage>() {
                override fun onSuccess(data: CollectionsImage) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getCollectionTranslations(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<CollectionsTranslation>
    ) {
        movieApiService
            .getCollectionTranslations(collection_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<CollectionsTranslation>() {
                override fun onSuccess(data: CollectionsTranslation) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getCompaniesDetails(
        company_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<CompaniesDetail>
    ) {
        movieApiService
            .getCompaniesDetails(company_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<CompaniesDetail>() {
                override fun onSuccess(data: CompaniesDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getCompaniesAlternativeName(
        company_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<CompaniesAlternateName>
    ) {
        movieApiService
            .getCompaniesAlternativeName(company_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<CompaniesAlternateName>() {
                override fun onSuccess(data: CompaniesAlternateName) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getCompaniesImage(
        company_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<CompaniesImage>
    ) {
        movieApiService
            .getCompaniesImage(company_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<CompaniesImage>() {
                override fun onSuccess(data: CompaniesImage) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getConfigurationApi(
        apiKey: String,
        callback: ConsumeApiResponse<ConfigurationApi>
    ) {
        movieApiService
            .getConfigurationApi(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<ConfigurationApi>() {
                override fun onSuccess(data: ConfigurationApi) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getConfigurationCountries(
        apiKey: String,
        callback: ConsumeApiResponse<List<ConfigurationCountry>>
    ) {
        movieApiService
            .getConfigurationCountries(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<List<ConfigurationCountry>>() {
                override fun onSuccess(data: List<ConfigurationCountry>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getConfigurationJobs(
        apiKey: String,
        callback: ConsumeApiResponse<List<ConfigurationJob>>
    ) {
        movieApiService
            .getConfigurationJobs(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<List<ConfigurationJob>>() {
                override fun onSuccess(data: List<ConfigurationJob>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getConfigurationLanguages(
        apiKey: String,
        callback: ConsumeApiResponse<List<ConfigurationLanguage>>
    ) {
        movieApiService
            .getConfigurationLanguages(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<List<ConfigurationLanguage>>() {
                override fun onSuccess(data: List<ConfigurationLanguage>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getConfigurationTranslations(
        apiKey: String,
        callback: ConsumeApiResponse<List<String>>
    ) {
        movieApiService
            .getConfigurationTranslations(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<List<String>>() {
                override fun onSuccess(data: List<String>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getConfigurationTimezones(
        apiKey: String,
        callback: ConsumeApiResponse<List<ConfigurationTimezone>>
    ) {
        movieApiService
            .getConfigurationTimezones(apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<List<ConfigurationTimezone>>() {
                override fun onSuccess(data: List<ConfigurationTimezone>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getCreditsDetails(
        credit_id: String,
        apiKey: String,
        callback: ConsumeApiResponse<Credits>
    ) {
        movieApiService
            .getCreditsDetails(credit_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Credits>() {
                override fun onSuccess(data: Credits) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getDiscoverMovie(
        apiKey: String,
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
        callback: ConsumeApiResponse<Discover<DiscoverMovie>>
    ) {
        movieApiService
            .getDiscoverMovie(
                apiKey,
                language,
                region,
                sort_by,
                certification_country,
                certification,
                certification_lte,
                certification_gte,
                include_adult,
                include_video,
                page,
                primary_release_year,
                primary_release_date_gte,
                primary_release_date_lte,
                release_date_gte,
                release_date_lte,
                with_release_type,
                year,
                vote_count_gte,
                vote_count_lte,
                vote_average_gte,
                vote_average_lte,
                with_cast,
                with_crew,
                with_people,
                with_companies,
                with_genres,
                without_genres,
                with_keywords,
                without_keywords,
                with_runtime_gte,
                with_runtime_lte,
                with_original_language
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Discover<DiscoverMovie>>() {
                override fun onSuccess(data: Discover<DiscoverMovie>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getDiscoverTv(
        apiKey: String,
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
        callback: ConsumeApiResponse<Discover<DiscoverTv>>
    ) {
        movieApiService
            .getDiscoverTv(
                apiKey,
                language,
                sort_by,
                air_date_gte,
                air_date_lte,
                first_air_date_gte,
                first_air_date_lte,
                first_air_date_year,
                page,
                timezone,
                vote_average_gte,
                vote_count_gte,
                with_genres,
                with_networks,
                without_genres,
                with_runtime_gte,
                with_runtime_lte,
                include_null_first_air_dates,
                with_original_language,
                without_keywords,
                screened_theatrically,
                with_companies,
                with_keywords
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Discover<DiscoverTv>>() {
                override fun onSuccess(data: Discover<DiscoverTv>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getFindById(
        external_id: String,
        apiKey: String,
        external_source: String,
        language: String?,
        callback: ConsumeApiResponse<Find>
    ) {
        movieApiService
            .getFindById(external_id, apiKey, external_source, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Find>() {
                override fun onSuccess(data: Find) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getGenresMovie(
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<Genres>
    ) {
        movieApiService
            .getGenresMovie(apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Genres>() {
                override fun onSuccess(data: Genres) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getGenresTv(
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<Genres>
    ) {
        movieApiService
            .getGenresTv(apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Genres>() {
                override fun onSuccess(data: Genres) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getKeywordsDetail(
        keyword_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<KeywordsDetail>
    ) {
        movieApiService
            .getKeywordsDetail(keyword_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<KeywordsDetail>() {
                override fun onSuccess(data: KeywordsDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getKeywordsMovie(
        keyword_id: Int,
        apiKey: String,
        language: String?,
        include_adult: Boolean?,
        callback: ConsumeApiResponse<KeywordsMovies>
    ) {
        movieApiService
            .getKeywordsMovie(keyword_id, apiKey, language, include_adult)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<KeywordsMovies>() {
                override fun onSuccess(data: KeywordsMovies) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesDetails(
        movie_id: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<MovieDetail>
    ) {
        movieApiService
            .getMoviesDetails(movie_id, apiKey, language, append_to_response)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieDetail>() {
                override fun onSuccess(data: MovieDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesAccountState(
        movie_id: Int,
        apiKey: String,
        session_id: String,
        guest_session_id: String?,
        callback: ConsumeApiResponse<MovieAccountState>
    ) {
        movieApiService
            .getMoviesAccountState(movie_id, apiKey, session_id, guest_session_id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieAccountState>() {
                override fun onSuccess(data: MovieAccountState) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesAlternativeTitles(
        movie_id: Int,
        apiKey: String,
        country: String?,
        callback: ConsumeApiResponse<MovieAlternativeTitle>
    ) {
        movieApiService
            .getMoviesAlternativeTitles(movie_id, apiKey, country)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieAlternativeTitle>() {
                override fun onSuccess(data: MovieAlternativeTitle) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesChanges(
        movie_id: Int,
        apiKey: String,
        start_date: String?,
        end_date: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieChanges>
    ) {
        movieApiService
            .getMoviesChanges(movie_id, apiKey, start_date, end_date, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieChanges>() {
                override fun onSuccess(data: MovieChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesCredits(
        movie_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<MovieCredit>
    ) {
        movieApiService
            .getMoviesCredits(movie_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieCredit>() {
                override fun onSuccess(data: MovieCredit) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesExternalIds(
        movie_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<MovieExternalId>
    ) {
        movieApiService.getMoviesExternalIds(movie_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieExternalId>() {
                override fun onSuccess(data: MovieExternalId) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesImages(
        movie_id: Int,
        apiKey: String,
        language: String?,
        include_image_language: String?,
        callback: ConsumeApiResponse<MovieImages>
    ) {
        movieApiService.getMoviesImages(
            movie_id,
            apiKey,
            language,
            include_image_language
        )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieImages>() {
                override fun onSuccess(data: MovieImages) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesKeywords(
        movie_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<MovieKeywords>
    ) {
        movieApiService.getMoviesKeywords(movie_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieKeywords>() {
                override fun onSuccess(data: MovieKeywords) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesReleaseDates(
        movie_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<MovieReleaseDates>
    ) {
        movieApiService.getMoviesReleaseDates(movie_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieReleaseDates>() {
                override fun onSuccess(data: MovieReleaseDates) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesVideos(
        movie_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<MovieVideos>
    ) {
        movieApiService.getMoviesVideos(movie_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieVideos>() {
                override fun onSuccess(data: MovieVideos) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesTranslations(
        movie_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<MovieTranslations>
    ) {
        movieApiService.getMoviesTranslations(movie_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieTranslations>() {
                override fun onSuccess(data: MovieTranslations) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesRecommendations(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieRecommendations>
    ) {
        movieApiService.getMoviesRecommendations(movie_id, apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieRecommendations>() {
                override fun onSuccess(data: MovieRecommendations) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesSimilarMovies(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieSimilarMovies>
    ) {
        movieApiService.getMoviesSimilarMovies(movie_id, apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieSimilarMovies>() {
                override fun onSuccess(data: MovieSimilarMovies) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesReviews(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieReviews>
    ) {
        movieApiService.getMoviesReviews(movie_id, apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieReviews>() {
                override fun onSuccess(data: MovieReviews) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesLists(
        movie_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<MovieLists>
    ) {
        movieApiService.getMoviesLists(movie_id, apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieLists>() {
                override fun onSuccess(data: MovieLists) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesLatest(
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<MovieLatest>
    ) {
        movieApiService.getMoviesLatest(apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieLatest>() {
                override fun onSuccess(data: MovieLatest) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesNowPlaying(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieNowPlayings>
    ) {
        movieApiService.getMoviesNowPlaying(apiKey, language, page, region)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieNowPlayings>() {
                override fun onSuccess(data: MovieNowPlayings) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesPopular(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MoviePopulars>
    ) {
        movieApiService.getMoviesPopular(apiKey, language, page, region)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MoviePopulars>() {
                override fun onSuccess(data: MoviePopulars) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesTopRated(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieTopRated>
    ) {
        movieApiService.getMoviesTopRated(apiKey, language, page, region)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieTopRated>() {
                override fun onSuccess(data: MovieTopRated) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getMoviesUpcoming(
        apiKey: String,
        language: String?,
        page: Int?,
        region: String?,
        callback: ConsumeApiResponse<MovieUpcoming>
    ) {
        movieApiService.getMoviesUpcoming(apiKey, language, page, region)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<MovieUpcoming>() {
                override fun onSuccess(data: MovieUpcoming) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTrendingAll(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: ConsumeApiResponse<Trending<TrendingAll>>
    ) {
        movieApiService
            .getTrendingAll(media_type, time_window, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Trending<TrendingAll>>() {
                override fun onSuccess(data: Trending<TrendingAll>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTrendingMovie(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: ConsumeApiResponse<Trending<TrendingMovie>>
    ) {
        movieApiService
            .getTrendingMovie(media_type, time_window, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Trending<TrendingMovie>>() {
                override fun onSuccess(data: Trending<TrendingMovie>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTrendingPerson(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: ConsumeApiResponse<Trending<TrendingPerson>>
    ) {
        movieApiService
            .getTrendingPerson(media_type, time_window, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Trending<TrendingPerson>>() {
                override fun onSuccess(data: Trending<TrendingPerson>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTrendingTv(
        media_type: String,
        time_window: String,
        apiKey: String,
        callback: ConsumeApiResponse<Trending<TrendingTv>>
    ) {
        movieApiService
            .getTrendingTv(media_type, time_window, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Trending<TrendingTv>>() {
                override fun onSuccess(data: Trending<TrendingTv>) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getReviews(
        review_id: String,
        apiKey: String,
        callback: ConsumeApiResponse<Reviews>
    ) {
        movieApiService
            .getReviews(review_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<Reviews>() {
                override fun onSuccess(data: Reviews) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getNetworkDetail(
        network_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<NetworkDetail>
    ) {
        movieApiService
            .getNetworkDetail(network_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<NetworkDetail>() {
                override fun onSuccess(data: NetworkDetail) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getNetworkAlternativeName(
        network_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<NetworkAlternativeName>
    ) {
        movieApiService
            .getNetworkAlternativeName(network_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<NetworkAlternativeName>() {
                override fun onSuccess(data: NetworkAlternativeName) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getNetworkImage(
        network_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<NetworkImage>
    ) {
        movieApiService
            .getNetworkImage(network_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<NetworkImage>() {
                override fun onSuccess(data: NetworkImage) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchCompanies(
        apiKey: String,
        query: String,
        page: Int?,
        callback: ConsumeApiResponse<SearchCompanies>
    ) {
        movieApiService
            .searchCompanies(apiKey, query, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<SearchCompanies>() {
                override fun onSuccess(data: SearchCompanies) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchCollections(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<SearchCollections>
    ) {
        movieApiService
            .searchCollections(apiKey, query, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<SearchCollections>() {
                override fun onSuccess(data: SearchCollections) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchKeywords(
        apiKey: String,
        query: String,
        page: Int?,
        callback: ConsumeApiResponse<SearchKeywords>
    ) {
        movieApiService
            .searchKeywords(apiKey, query, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<SearchKeywords>() {
                override fun onSuccess(data: SearchKeywords) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchMovies(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        year: Int?,
        primary_release_year: Int?,
        callback: ConsumeApiResponse<SearchMovies>
    ) {
        movieApiService
            .searchMovies(
                apiKey,
                query,
                language,
                page,
                include_adult,
                region,
                year,
                primary_release_year
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<SearchMovies>() {
                override fun onSuccess(data: SearchMovies) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchMultiSearch(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: ConsumeApiResponse<SearchMulti>
    ) {
        movieApiService
            .searchMultiSearch(apiKey, query, language, page, include_adult, region)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<SearchMulti>() {
                override fun onSuccess(data: SearchMulti) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchPeople(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        region: String?,
        callback: ConsumeApiResponse<SearchPeople>
    ) {
        movieApiService
            .searchPeople(apiKey, query, language, page, include_adult, region)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<SearchPeople>() {
                override fun onSuccess(data: SearchPeople) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun searchTvShows(
        apiKey: String,
        query: String,
        language: String?,
        page: Int?,
        include_adult: Boolean?,
        first_air_date_year: Int?,
        callback: ConsumeApiResponse<SearchMovies>
    ) {
        movieApiService
            .searchTvShows(apiKey, query, language, page, include_adult, first_air_date_year)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<SearchMovies>() {
                override fun onSuccess(data: SearchMovies) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvDetails(
        tv_id: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<TvDetails>
    ) {
        movieApiService
            .getTvDetails(tv_id, apiKey, language, append_to_response)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvDetails>() {
                override fun onSuccess(data: TvDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvAccountStates(
        tv_id: Int,
        apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: ConsumeApiResponse<TvAccountStates>
    ) {
        movieApiService
            .getTvAccountStates(tv_id, apiKey, language, guest_session_id, session_id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvAccountStates>() {
                override fun onSuccess(data: TvAccountStates) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvAlternativeTitles(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvAlternativeTitles>
    ) {
        movieApiService
            .getTvAlternativeTitles(tv_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvAlternativeTitles>() {
                override fun onSuccess(data: TvAlternativeTitles) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvChanges(
        tv_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvChanges>
    ) {
        movieApiService
            .getTvChanges(tv_id, apiKey, startDate, endDate, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvChanges>() {
                override fun onSuccess(data: TvChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvContentRatings(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvContentRatings>
    ) {
        movieApiService
            .getTvContentRatings(tv_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvContentRatings>() {
                override fun onSuccess(data: TvContentRatings) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvCredits(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvCredits>
    ) {
        movieApiService
            .getTvCredits(tv_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvCredits>() {
                override fun onSuccess(data: TvCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvEpisodeGroups(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeGroups>
    ) {
        movieApiService
            .getTvEpisodeGroups(tv_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvEpisodeGroups>() {
                override fun onSuccess(data: TvEpisodeGroups) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvExternalIds(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvExternalIds>
    ) {
        movieApiService
            .getTvExternalIds(tv_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvExternalIds>() {
                override fun onSuccess(data: TvExternalIds) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvImages(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvImages>
    ) {
        movieApiService
            .getTvImages(tv_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvImages>() {
                override fun onSuccess(data: TvImages) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvKeyword(
        tv_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvKeywords>
    ) {
        movieApiService
            .getTvKeyword(tv_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvKeywords>() {
                override fun onSuccess(data: TvKeywords) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvRecommendations(
        tv_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvRecommendations>
    ) {
        movieApiService
            .getTvRecommendations(tv_id, apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvRecommendations>() {
                override fun onSuccess(data: TvRecommendations) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvReviews(
        tv_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvReviews>
    ) {
        movieApiService
            .getTvReviews(tv_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvReviews>() {
                override fun onSuccess(data: TvReviews) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvScreenedTheatrically(
        tv_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvScreenedTheatrically>
    ) {
        movieApiService
            .getTvScreenedTheatrically(tv_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvScreenedTheatrically>() {
                override fun onSuccess(data: TvScreenedTheatrically) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvSimilarTvShows(
        tv_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvSimilarTVShows>
    ) {
        movieApiService
            .getTvSimilarTvShows(tv_id, apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvSimilarTVShows>() {
                override fun onSuccess(data: TvSimilarTVShows) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvTranslations(
        tv_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvTranslations>
    ) {
        movieApiService
            .getTvTranslations(tv_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvTranslations>() {
                override fun onSuccess(data: TvTranslations) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvVideos(
        tv_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvVideos>
    ) {
        movieApiService
            .getTvVideos(tv_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvVideos>() {
                override fun onSuccess(data: TvVideos) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvLatest(
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvLatest>
    ) {
        movieApiService
            .getTvLatest(apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvLatest>() {
                override fun onSuccess(data: TvLatest) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvAiringToday(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvAiringToday>
    ) {
        movieApiService
            .getTvAiringToday(apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvAiringToday>() {
                override fun onSuccess(data: TvAiringToday) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvOnTheAir(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvOnTheAir>
    ) {
        movieApiService
            .getTvOnTheAir(apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvOnTheAir>() {
                override fun onSuccess(data: TvOnTheAir) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvPopular(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvPopular>
    ) {
        movieApiService
            .getTvPopular(apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvPopular>() {
                override fun onSuccess(data: TvPopular) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvTopRated(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvTopRated>
    ) {
        movieApiService
            .getTvTopRated(apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvTopRated>() {
                override fun onSuccess(data: TvTopRated) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvSeasonsDetails(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<TvSeasonsDetails>
    ) {
        movieApiService
            .getTvSeasonsDetails(tv_id, season_number, apiKey, language, append_to_response)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvSeasonsDetails>() {
                override fun onSuccess(data: TvSeasonsDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvSeasonsChanges(
        season_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvSeasonsChanges>
    ) {
        movieApiService
            .getTvSeasonsChanges(season_id, apiKey, startDate, endDate, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvSeasonsChanges>() {
                override fun onSuccess(data: TvSeasonsChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvSeasonsAccountStates(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        guest_session_id: String?,
        session_id: String?,
        callback: ConsumeApiResponse<TvSeasonsAccountStates>
    ) {
        movieApiService
            .getTvSeasonsAccountStates(
                tv_id,
                season_number,
                apiKey,
                language,
                guest_session_id,
                session_id
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvSeasonsAccountStates>() {
                override fun onSuccess(data: TvSeasonsAccountStates) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvSeasonsCredits(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsCredits>
    ) {
        movieApiService
            .getTvSeasonsCredits(tv_id, season_number, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvSeasonsCredits>() {
                override fun onSuccess(data: TvSeasonsCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvSeasonsExternalIds(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsExternalIds>
    ) {
        movieApiService
            .getTvSeasonsExternalIds(tv_id, season_number, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvSeasonsExternalIds>() {
                override fun onSuccess(data: TvSeasonsExternalIds) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvSeasonsImages(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsImages>
    ) {
        movieApiService
            .getTvSeasonsImages(tv_id, season_number, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvSeasonsImages>() {
                override fun onSuccess(data: TvSeasonsImages) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvSeasonsVideos(
        tv_id: Int,
        season_number: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvSeasonsVideos>
    ) {
        movieApiService
            .getTvSeasonsVideos(tv_id, season_number, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvSeasonsVideos>() {
                override fun onSuccess(data: TvSeasonsVideos) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvEpisodeDetails(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        language: String?,
        append_to_response: String?,
        callback: ConsumeApiResponse<TvEpisodeDetails>
    ) {
        movieApiService
            .getTvEpisodeDetails(
                tv_id,
                season_number,
                episode_number,
                apiKey,
                language,
                append_to_response
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvEpisodeDetails>() {
                override fun onSuccess(data: TvEpisodeDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvEpisodeChanges(
        episode_id: Int,
        apiKey: String,
        startDate: String?,
        endDate: String?,
        page: Int?,
        callback: ConsumeApiResponse<TvEpisodeChanges>
    ) {
        movieApiService
            .getTvEpisodeChanges(episode_id, apiKey, startDate, endDate, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvEpisodeChanges>() {
                override fun onSuccess(data: TvEpisodeChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvEpisodeAccountStates(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        guest_session_id: String?,
        session_id: String?,
        callback: ConsumeApiResponse<TvEpisodeAccountStates>
    ) {
        movieApiService
            .getTvEpisodeAccountStates(
                tv_id,
                season_number,
                episode_number,
                apiKey,
                guest_session_id,
                session_id
            )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvEpisodeAccountStates>() {
                override fun onSuccess(data: TvEpisodeAccountStates) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvEpisodeCredits(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvEpisodeCredits>
    ) {
        movieApiService
            .getTvEpisodeCredits(tv_id, season_number, episode_number, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvEpisodeCredits>() {
                override fun onSuccess(data: TvEpisodeCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvEpisodeExternalIds(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvEpisodeExternalIds>
    ) {
        movieApiService
            .getTvEpisodeExternalIds(tv_id, season_number, episode_number, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvEpisodeExternalIds>() {
                override fun onSuccess(data: TvEpisodeExternalIds) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvEpisodeImages(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvEpisodeImages>
    ) {
        movieApiService
            .getTvEpisodeImages(tv_id, season_number, episode_number, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvEpisodeImages>() {
                override fun onSuccess(data: TvEpisodeImages) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvEpisodeTranslations(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        callback: ConsumeApiResponse<TvEpisodeTranslation>
    ) {
        movieApiService
            .getTvEpisodeTranslations(tv_id, season_number, episode_number, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvEpisodeTranslation>() {
                override fun onSuccess(data: TvEpisodeTranslation) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvEpisodeVideos(
        tv_id: Int,
        season_number: Int,
        episode_number: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeVideos>
    ) {
        movieApiService
            .getTvEpisodeVideos(tv_id, season_number, episode_number, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvEpisodeVideos>() {
                override fun onSuccess(data: TvEpisodeVideos) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getTvEpisodeGroupsDetails(
        id: String?,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<TvEpisodeGroupsDetails>
    ) {
        movieApiService
            .getTvEpisodeGroupsDetails(id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<TvEpisodeGroupsDetails>() {
                override fun onSuccess(data: TvEpisodeGroupsDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getPeopleDetails(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleDetails>
    ) {
        movieApiService
            .getPeopleDetails(person_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<PeopleDetails>() {
                override fun onSuccess(data: PeopleDetails) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getPeopleChanges(
        person_id: Int,
        apiKey: String,
        endDate: String?,
        page: Int?,
        startDate: String?,
        callback: ConsumeApiResponse<PeopleChanges>
    ) {
        movieApiService
            .getPeopleChanges(person_id, apiKey, endDate, page, startDate)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<PeopleChanges>() {
                override fun onSuccess(data: PeopleChanges) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getPeopleMovieCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleMovieCredits>
    ) {
        movieApiService
            .getPeopleMovieCredits(person_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<PeopleMovieCredits>() {
                override fun onSuccess(data: PeopleMovieCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getPeopleTvCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleTvCredits>
    ) {
        movieApiService
            .getPeopleTvCredits(person_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<PeopleTvCredits>() {
                override fun onSuccess(data: PeopleTvCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getPeopleCombinedCredits(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleCombinedCredits>
    ) {
        movieApiService
            .getPeopleCombinedCredits(person_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<PeopleCombinedCredits>() {
                override fun onSuccess(data: PeopleCombinedCredits) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getPeopleExternalIds(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleExternalIds>
    ) {
        movieApiService
            .getPeopleExternalIds(person_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<PeopleExternalIds>() {
                override fun onSuccess(data: PeopleExternalIds) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getPeopleImages(
        person_id: Int,
        apiKey: String,
        callback: ConsumeApiResponse<PeopleImages>
    ) {
        movieApiService
            .getPeopleImages(person_id, apiKey)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<PeopleImages>() {
                override fun onSuccess(data: PeopleImages) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getPeopleTaggedImages(
        person_id: Int,
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<PeopleTaggedImages>
    ) {
        movieApiService
            .getPeopleTaggedImages(person_id, apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<PeopleTaggedImages>() {
                override fun onSuccess(data: PeopleTaggedImages) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getPeopleTranslations(
        person_id: Int,
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleTranslations>
    ) {
        movieApiService
            .getPeopleTranslations(person_id, apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<PeopleTranslations>() {
                override fun onSuccess(data: PeopleTranslations) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getPeopleLatest(
        apiKey: String,
        language: String?,
        callback: ConsumeApiResponse<PeopleLatest>
    ) {
        movieApiService
            .getPeopleLatest(apiKey, language)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<PeopleLatest>() {
                override fun onSuccess(data: PeopleLatest) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }

    override fun getPeoplePopular(
        apiKey: String,
        language: String?,
        page: Int?,
        callback: ConsumeApiResponse<PeoplePopular>
    ) {
        movieApiService
            .getPeoplePopular(apiKey, language, page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
            .subscribe(object : FrogoApiCallback<PeoplePopular>() {
                override fun onSuccess(data: PeoplePopular) {
                    callback.onSuccess(data)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }
            })
    }
}