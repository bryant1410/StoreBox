/*
 * Copyright 2015 Martin Bella
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
 
package net.orange_box.storebox.adapters.extra;

import net.orange_box.storebox.adapters.base.BaseLongTypeAdapter;

public class DoubleTypeAdapter extends BaseLongTypeAdapter<Double> {

    @Override
    public Long adaptForPreferences(Double value) {
        return Double.doubleToRawLongBits(value);
    }

    @Override
    public Double adaptFromPreferences(Long value) {
        return Double.longBitsToDouble(value);
    }
}
