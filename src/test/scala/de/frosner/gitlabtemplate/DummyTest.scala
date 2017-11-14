/*
 * Copyright 2017 Frank Rosner
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

package de.frosner.gitlabtemplate

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

/**
  * docker run --rm \
    -p 443:443 \
    -p 80:80 \
    -p 22:22 \
    -v $(pwd)/gitlab/config:/etc/gitlab \
    -v $(pwd)/gitlab/logs:/var/log/gitlab \
    -v $(pwd)/gitlab/data:/var/opt/gitlab \
    gitlab/gitlab-ce:9.4.5-ce.0
  */
object DummyTest extends Properties("String") {

  property("substring") = forAll { (a: String, b: String, c: String) =>
    (a + b + c).substring(a.length, a.length + b.length) == b
  }

}