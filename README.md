# BaseViewPagerAdapterHelper

[![](https://jitpack.io/v/ALguojian/BaseViewPagerAdapterHelper.svg)](https://jitpack.io/#ALguojian/BaseViewPagerAdapterHelper)

1.Add it in your root build.gradle at the end of repositories:

```
allprojects {
	repositories {
		...
		maven { url 'https://www.jitpack.io' }
		}
	}
```

2.Add the dependency

```
		dependencies {
    	        compile 'com.github.ALguojian:BaseViewPagerAdapterHelper:1.2'
    	}


```

使用viewPager添加适配器只需要
```
viewPager.setAdapter(new BasePagerAdapter<ImageView>(list));

```

当`viewPager`和`TabLayout`一起使用时：`list`即`fragment`的集合，`string`是`title`集合`
```
 viewPager.setAdapter(new BaseFragmentPagerAdapter<>(this,list,strings));
```

添加滑动动画：boolean标识滑动是是否透明

```
 viewPager.setPageTransformer(false, new InPageTransformer());
 viewPager.setPageTransformer(false, new PageTransformer());
```
