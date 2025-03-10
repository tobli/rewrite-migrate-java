/*
 * Copyright 2024 the original author or authors.
 * <p>
 * Licensed under the Moderne Source Available License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://docs.moderne.io/licensing/moderne-source-available-license
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openrewrite.java.migrate.guava;

import org.jspecify.annotations.Nullable;

public class NoGuavaImmutableSetOf extends AbstractNoGuavaImmutableOf {
    public NoGuavaImmutableSetOf() {
        super("com.google.common.collect.ImmutableSet", "java.util.Set");
    }

    public NoGuavaImmutableSetOf(@Nullable Boolean convertReturnType) {
        super("com.google.common.collect.ImmutableSet", "java.util.Set", convertReturnType);
    }
}
