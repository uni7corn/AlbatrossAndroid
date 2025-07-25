/*
 * Copyright 2025 QingWan (qingwanmail@foxmail.com)
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

package qing.albatross.server;


import java.util.HashMap;
import java.util.Map;

public class RpcException extends Throwable {

  public Map<String, Object> map = new HashMap<>();

  public RpcException put(String key, Object value) {
    map.put(key, value);
    return this;
  }

  @Override
  public String toString() {
    return JsonFormatter.SKIP_PARSE + JsonFormatter.fmt(map,false);
  }
}
