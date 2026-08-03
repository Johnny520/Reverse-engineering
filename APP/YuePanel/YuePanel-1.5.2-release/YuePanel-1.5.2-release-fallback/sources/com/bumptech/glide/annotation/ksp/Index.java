package com.bumptech.glide.annotation.ksp;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@interface Index {
    java.lang.String[] modules() default {};
}
