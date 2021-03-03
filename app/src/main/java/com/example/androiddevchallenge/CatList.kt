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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun CatList(cats: List<Cat>, onCatClick: (Cat) -> Unit = {}) {
    LazyColumn(
        Modifier.background(MaterialTheme.colors.secondary),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(cats) { cat ->
            CatItem(
                cat,
                Modifier
                    .clickable {
                        onCatClick(cat)
                    }
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
fun CatItem(cat: Cat, modifier: Modifier = Modifier) {
    Card(modifier) {
        Row {
            Image(
                painterResource(cat.picture),
                "Picture of cat: ${cat.name}",
                Modifier.size(120.dp),
                contentScale = ContentScale.Crop
            )
            Column(Modifier.padding(8.dp)) {
                Text(cat.name, style = MaterialTheme.typography.h4)
                Text(cat.breed)
                Text(cat.location)
            }
        }
    }
}

@Preview
@Composable
fun CatListPreview() {
    val cats = listOf(
        Cat(
            "GaGa", "Ragdoll Siamese Mix", "北京",
            "Adult", "Female", R.drawable.img_kitten_gaga
        ),
        Cat(
            "MieMie", "Yellow White Long Hair", "广州",
            "Kitten", "Male", R.drawable.img_kitten_miemie
        ),
        Cat(
            "Five", "Idyllic", "山东",
            "Adult", "FeMale", R.drawable.img_kitten_five
        ),
    )
    MyTheme {
        CatList(cats)
    }
}

@Preview
@Composable
fun CatListPreviewDark() {
    val cats = listOf(
        Cat(
            "GaGa", "Ragdoll Siamese Mix", "北京",
            "Adult", "Female", R.drawable.img_kitten_gaga
        ),
        Cat(
            "MieMie", "Yellow White Long Hair", "广州",
            "Kitten", "Male", R.drawable.img_kitten_miemie
        ),
        Cat(
            "Five", "Idyllic", "山东",
            "Adult", "FeMale", R.drawable.img_kitten_five
        )
    )
    MyTheme(darkTheme = true) {
        CatList(cats)
    }
}

@Preview
@Composable
fun CatItemPreview() {
    MyTheme {
        CatItem(
            Cat(
                "GaGa", "Ragdoll Siamese Mix", "北京",
                "Adult", "Female", R.drawable.img_kitten_gaga
            )
        )
    }
}

@Preview
@Composable
fun CatItemPreviewDark() {
    MyTheme(darkTheme = true) {
        CatItem(
            Cat(
                "GaGa", "Ragdoll Siamese Mix", "北京",
                "Adult", "Female", R.drawable.img_kitten_gaga
            )
        )
    }
}
