/*
 * Copyright 2018 The GraphicsFuzz Project Authors
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

package com.graphicsfuzz.common.glslversion;

final class Glsl120 extends CompositeShadingLanguageVersion {

  static final ShadingLanguageVersion INSTANCE = new Glsl120(Glsl110.INSTANCE);

  private Glsl120(ShadingLanguageVersion prototype) {
    super(prototype);
    // Singleton
  }

  @Override
  public String getVersionString() {
    return "120";
  }

  @Override
  public boolean supportedArrayConstructors() {
    return true;
  }

  @Override
  public boolean supportedMatrixCompMultNonSquare() {
    return true;
  }

  @Override
  public boolean supportedNonSquareMatrices() {
    return true;
  }

  @Override
  public boolean supportedOuterProduct() {
    return true;
  }

  @Override
  public boolean supportedTranspose() {
    return true;
  }

}