/*
 * Copyright (C) 2015 Hannes Dorfmann
 * Copyright (C) 2015 Tickaroo, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.tickaroo.tikxml;

/**
 * As the name already suggests, a type adapter is responsible to convert a xml element to a java
 * object and vice versa. For simple "primitive alike" data classes like "java.util.Date" you can
 * use {@link TypeConverter}
 *
 * @author Hannes Dorfmann
 * @see TypeConverter
 * @since 1.0
 */
public interface TypeAdapter<T> {


  /**
   * This name will be used as class suffix for the generated TypeAdapter by annotation processing
   */
  static final String GENERATED_CLASS_SUFFIX = "$TikXmlTypeAdapter";


  /**
   * Read a java object from xml document
   *
   * @param reader The {@link XmlReader} to read the xml document
   * @param config The {@link TikXmlConfig} where you can access {@link TypeConverter} etc.
   * @return The instantiated java object of type T
   */
  public T fromXml(XmlReader reader, TikXmlConfig config);

  /**
   * @param writer The {@link XmlWriter} to write xml
   * @param config The {@link TikXmlConfig} where you can access {@link TypeConverter} etc.
   * @param value The value to write as xml
   */
  public void toXml(XmlWriter writer, TikXmlConfig config, T value);
}