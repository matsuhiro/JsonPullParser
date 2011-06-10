/*
 * Copyright 2011 vvakame <vvakame@gmail.com>
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

package net.vvakame.util.jsonpullparser.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * オリジナルのJSONを保持させるアノテーション
 * 
 * @author vvakame
 */
@Retention(RetentionPolicy.SOURCE)
@Target({
	ElementType.FIELD
})
public @interface SaveOriginal {

	/**
	 * オリジナルのJSONを保持しない設定になっていた場合の挙動.<br>
	 * 値が {@code true} なら {@link IllegalStateException}.<br>
	 * 値が {@code false} ならオリジナルのJSONを保存しない.
	 * @return ログを保存していない場合にエラーにするか
	 * @author vvakame
	 */
	public boolean treatLogDisabledAsError() default false;
}
