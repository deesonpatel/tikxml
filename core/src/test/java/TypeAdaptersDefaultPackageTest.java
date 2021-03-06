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

import com.tickaroo.tikxml.DefaultPackageClassTestAccessor;
import com.tickaroo.tikxml.typeadapter.TypeAdapter;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Hannes Dorfmann
 */
public class TypeAdaptersDefaultPackageTest {

  @Test
  public void instantiateOverReflectionsDefaultPackage() throws IOException {
    TypeAdapter<DefaultPackageClass> adapter = DefaultPackageClassTestAccessor.getTypeAdapter(DefaultPackageClass.class);
    Assert.assertTrue(adapter instanceof DefaultPackageClass.$TypeAdapter);
    Assert.assertSame(adapter, DefaultPackageClassTestAccessor.getTypeAdapter(DefaultPackageClass.class));
  }
}
