/*
 * Copyright (c) 2018.
 *
 * This file is part of XmlUtil.
 *
 * This file is licenced to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You should have received a copy of the license with the source distribution.
 * Alternatively, you may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package nl.adaptivity.xmlutil.core.impl.multiplatform

import nl.adaptivity.xmlutil.core.XmlUtilInternal
import kotlin.reflect.KClass

@XmlUtilInternal
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.CONSTRUCTOR
       )
expect annotation class Throws(vararg val exceptionClasses: KClass<out Throwable>)

@XmlUtilInternal
expect val KClass<*>.name: String

@XmlUtilInternal
expect fun assert(value: Boolean, lazyMessage: () -> String)

@XmlUtilInternal
expect fun assert(value: Boolean)

expect interface AutoCloseable {
    fun close()
}

expect interface Closeable : AutoCloseable

@XmlUtilInternal
expect val KClass<*>.maybeAnnotations: List<Annotation>


expect abstract class Writer
expect open class StringWriter(): Writer
