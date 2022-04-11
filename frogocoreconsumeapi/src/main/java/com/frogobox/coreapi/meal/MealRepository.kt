package com.frogobox.coreapi.meal

import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.meal.model.*
import com.frogobox.coreapi.meal.response.CategoryResponse
import com.frogobox.coreapi.meal.response.MealResponse
import com.frogobox.coresdk.ext.doApiRequest
import com.frogobox.coresdk.source.FrogoApiClient
import io.reactivex.rxjava3.core.Scheduler
import okhttp3.Interceptor

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * consumable-code-the-meal-db-api
 * Copyright (C) 15/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogomealsapi.data.source
 *
 */
object MealRepository : MealDataSource {

    private val TAG = MealRepository::class.java.simpleName
    private var mealApiService = FrogoApiClient.create<MealApiService>(MealUrl.BASE_URL)

    override fun usingChuckInterceptor(chuckerInterceptor: Interceptor) {
        mealApiService = FrogoApiClient.createWithInterceptor(MealUrl.BASE_URL, chuckerInterceptor)
    }

    override fun searchMeal(
        scheduler: Scheduler?, apiKey: String,
        mealName: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        mealApiService.searchMeal(apiKey, mealName).doApiRequest(scheduler, callback) {}
    }

    override fun listAllMeal(
        scheduler: Scheduler?, apiKey: String,
        firstLetter: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        mealApiService.listAllMeal(apiKey, firstLetter).doApiRequest(scheduler, callback) {}
    }

    override fun lookupFullMeal(
        scheduler: Scheduler?, apiKey: String,
        idMeal: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        mealApiService.lookupFullMeal(apiKey, idMeal).doApiRequest(scheduler, callback) {}
    }

    override fun lookupRandomMeal(
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Meal>>
    ) {
        mealApiService.lookupRandomMeal(apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun listMealCategories(
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<CategoryResponse>
    ) {
        mealApiService.listMealCategories(apiKey).doApiRequest(scheduler, callback) {}
    }

    override fun listAllCateories(
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Category>>
    ) {
        mealApiService.listAllCateories(apiKey, MealConstant.VALUE_LIST)
            .doApiRequest(scheduler, callback) {}
    }

    override fun listAllArea(
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Area>>
    ) {
        mealApiService.listAllArea(apiKey, MealConstant.VALUE_LIST)
            .doApiRequest(scheduler, callback) {}
    }

    override fun listAllIngredients(
        scheduler: Scheduler?, apiKey: String,
        callback: ConsumeApiResponse<MealResponse<Ingredient>>
    ) {
        mealApiService.listAllIngredients(apiKey, MealConstant.VALUE_LIST)
            .doApiRequest(scheduler, callback) {}
    }

    override fun filterByIngredient(
        scheduler: Scheduler?, apiKey: String,
        ingredient: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        mealApiService.filterByIngredient(apiKey, ingredient).doApiRequest(scheduler, callback) {}
    }

    override fun filterByCategory(
        scheduler: Scheduler?, apiKey: String,
        category: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        mealApiService.filterByCategory(apiKey, category).doApiRequest(scheduler, callback) {}
    }

    override fun filterByArea(
        scheduler: Scheduler?, apiKey: String,
        area: String,
        callback: ConsumeApiResponse<MealResponse<MealFilter>>
    ) {
        mealApiService.filterByArea(apiKey, area).doApiRequest(scheduler, callback) {}
    }
}