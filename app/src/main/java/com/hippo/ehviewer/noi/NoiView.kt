/*
 * Copyright 2017 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.ehviewer.noi

import android.content.Context
import android.net.Uri
import android.util.AttributeSet
import android.view.View

/*
 * Created by Hippo on 2017/7/28.
 */

class NoiView : View {

  constructor(context: Context): super(context)

  constructor(context: Context, attrs: AttributeSet?): super(context, attrs)

  fun load(uri: String) = load(Uri.parse(uri))

  fun load(uri: Uri) {


    when (uri.scheme) {




    }
  }
}