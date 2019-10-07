/*
 * Copyright (c) 2017-2019 TIBCO Software Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You
 * may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. See accompanying
 * LICENSE file.
 */

package io.snappydata.gemxd.remotestore

import com.gemstone.gemfire.internal.cache.DiskEntry
import com.google.common.cache.CacheBuilder

import scala.reflect.io.File

class RemoteDataService {
  private[this] lazy val entryCache = {
    val x = CacheBuilder.newBuilder().maximumSize(10000).build[DiskEntry, File]()
  }

  lazy val client: RemoteDataClient = null

  def getValues(diskptrs: Array[DiskEntry]): Array[Byte] = {
    null
  }
}

object RemoteDataService {
}
