package com.olivadevelop.coreutils.annotation;

import com.olivadevelop.coreutils.activity.BasicActivity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreFromView {
    Class<BasicActivity<?, ?>>[] value();
}
