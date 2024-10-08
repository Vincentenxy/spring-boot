/*
 * Copyright 2012-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.wx;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;

/**
 *  desc:
 */
public class Test {

	public static void main(String[] args) {

		SpringApplication springApplication = new SpringApplication(Test.class);

		// 这里可以调用 SpringApplication 提供的 setXX 或 addXX 方法来定制化设置

		springApplication.run(args);
	}


	public void test() {
		int[] nums = new int[5];
		Arrays.sort(nums);
		List<List<Integer>> arr =  new ArrayList<>();
		arr.add(Arrays.asList(1, 2, 3));

	}

}
