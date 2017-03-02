![alt tag](http://i.imgur.com/PyhMw4q.png)
# KeyHide

Easy way to hide Android keyboard on background tap without any effort.


## Download

Grab via Gradle:
```
compile 'com.irozon.keyhide:keyhide:1.0.0'
```
Or Maven:
```
<dependency>
  <groupId>com.irozon.keyhide</groupId>
  <artifactId>keyhide</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

## How do i use KeyHide?
To hide keybaord on background click just initialize KeyHide.
For activity:
```
HideKey.initialize(this);
```
In Fragment pass the inflated view along with the activity context.
```
HideKey.initialize(getActivity(), view);
```

## Authors

* **Hammad Akram** - (https://github.com/hamadakram)
* **Shafqat Jamil** - (https://github.com/shafqatjamil)

## Licence
```
Copyright 2013 Irozon, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
