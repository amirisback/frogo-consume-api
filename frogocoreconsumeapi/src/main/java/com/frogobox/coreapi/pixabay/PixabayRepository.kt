package com.frogobox.coreapi.pixabay

import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.pixabay.model.PixabayImage
import com.frogobox.coreapi.pixabay.model.PixabayVideo
import com.frogobox.coreapi.pixabay.response.Response
import com.frogobox.coresdk.FrogoApiClient
import com.frogobox.coresdk.ext.doApiRequest
import io.reactivex.rxjava3.core.Scheduler
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

object PixabayRepository : PixabayDataSource {

    private val TAG = PixabayRepository::class.java.simpleName
    private var pixabayApiService = FrogoApiClient.create<PixabayApiService>(PixabayUrl.BASE_URL)

    override fun usingChuckInterceptor(chuckerInterceptor: Interceptor) {
        pixabayApiService = FrogoApiClient.createWithInterceptor(PixabayUrl.BASE_URL, chuckerInterceptor)
    }

    override fun searchImage(
        scheduler: Scheduler?,
        apiKey: String,
        q: String,
        lang: String?,
        id: String?,
        imageType: String?,
        orientation: String?,
        category: String?,
        minWidth: Int?,
        minHeight: Int?,
        colors: String?,
        editorsChoice: Boolean?,
        safeSearch: Boolean?,
        order: String?,
        page: Int?,
        perPage: Int?,
        callback: ConsumeApiResponse<Response<PixabayImage>>
    ) {
        if (scheduler != null) {
            pixabayApiService.searchImage(
                apiKey,
                q,
                lang,
                id,
                imageType,
                orientation,
                category,
                minWidth,
                minHeight,
                colors,
                editorsChoice,
                safeSearch,
                order,
                page,
                perPage
            ).doApiRequest(scheduler, callback)
        } else {
            pixabayApiService.searchImage(
                apiKey,
                q,
                lang,
                id,
                imageType,
                orientation,
                category,
                minWidth,
                minHeight,
                colors,
                editorsChoice,
                safeSearch,
                order,
                page,
                perPage
            ).doApiRequest(callback)
        }
    }

    override fun searchVideo(
        scheduler: Scheduler?,
        apiKey: String,
        q: String,
        lang: String?,
        id: String?,
        videoType: String?,
        category: String?,
        minWidth: Int?,
        minHeight: Int?,
        editorsChoice: Boolean?,
        safeSearch: Boolean?,
        order: String?,
        page: Int?,
        perPage: Int?,
        callback: ConsumeApiResponse<Response<PixabayVideo>>
    ) {
        if (scheduler != null) {
            pixabayApiService.searchVideo(
                apiKey,
                q,
                lang,
                id,
                videoType,
                category,
                minWidth,
                minHeight,
                editorsChoice,
                safeSearch,
                order,
                page,
                perPage
            ).doApiRequest(scheduler, callback)
        } else {
            pixabayApiService.searchVideo(
                apiKey,
                q,
                lang,
                id,
                videoType,
                category,
                minWidth,
                minHeight,
                editorsChoice,
                safeSearch,
                order,
                page,
                perPage
            ).doApiRequest(callback)
        }
    }
}