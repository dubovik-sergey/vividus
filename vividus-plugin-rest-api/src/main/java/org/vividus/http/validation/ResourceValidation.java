/*
 * Copyright 2019-2024 the original author or authors.
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

package org.vividus.http.validation;

import java.net.URI;

import org.apache.commons.lang3.tuple.Pair;

public class ResourceValidation extends AbstractResourceValidation<ResourceValidation>
{
    public ResourceValidation(URI resourceUri)
    {
        this(Pair.of(resourceUri, null));
    }

    private ResourceValidation(Pair<URI, String> uriOrError)
    {
        super(uriOrError);
    }

    @Override
    public ResourceValidation copy()
    {
        ResourceValidation newValidation = new ResourceValidation(getUriOrError());
        copyParameters(newValidation);
        return newValidation;
    }
}
