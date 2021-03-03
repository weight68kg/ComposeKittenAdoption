/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val cats by mutableStateOf(
        listOf(
            Cat(
                "GaGa", "Ragdoll Siamese Mix", "北京",
                "Adult", "Female", R.drawable.img_kitten_gaga
            ),
            Cat(
                "MieMie", "Yellow White Long Hair", "广州",
                "Young", "Male", R.drawable.img_kitten_miemie
            ),
            Cat(
                "Five", "Idyllic", "山东",
                "Adult", "FeMale", R.drawable.img_kitten_five
            ),
            Cat(
                "ZhaZha", "American Short Hair", "广东",
                "Kitten", "Female", R.drawable.img_kitten_zhazha
            ),
            Cat(
                "Max", "White Short", "天津",
                "Adult", "Female", R.drawable.img_kitten_max
            ),
            Cat(
                "YuHuan", "Felis Silvestris", "天津",
                "Adult", "Female", R.drawable.img_kitten_yuhuan
            ),
            Cat(
                "YuZhuo", "Yellow White Mix Short", "天津",
                "Adult", "Female", R.drawable.img_kitten_yuzhuo
            ),
        )
    )

    var currentCat: Cat? by mutableStateOf(null)

    fun showCat(cat: Cat) {
        currentCat = cat
    }

    fun closeCat() {
        currentCat = null
    }
}
