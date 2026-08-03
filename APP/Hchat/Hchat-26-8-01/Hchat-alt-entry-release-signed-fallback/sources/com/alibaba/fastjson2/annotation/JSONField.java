package com.alibaba.fastjson2.annotation;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface JSONField {
    java.lang.String[] alternateNames() default {};

    java.lang.Class<?> arrayToMapDuplicateHandler() default java.lang.Void.class;

    java.lang.String arrayToMapKey() default "";

    java.lang.Class<?> contentAs() default java.lang.Void.class;

    java.lang.String defaultValue() default "";

    boolean deserialize() default true;

    com.alibaba.fastjson2.JSONReader.Feature[] deserializeFeatures() default {};

    java.lang.Class deserializeUsing() default java.lang.Void.class;

    java.lang.String format() default "";

    boolean jsonDirect() default false;

    java.lang.String label() default "";

    java.lang.String locale() default "";

    java.lang.String name() default "";

    int ordinal() default 0;

    boolean required() default false;

    java.lang.String schema() default "";

    boolean serialize() default true;

    com.alibaba.fastjson2.JSONWriter.Feature[] serializeFeatures() default {};

    java.lang.Class serializeUsing() default java.lang.Void.class;

    boolean unwrapped() default false;

    boolean value() default false;

    @java.lang.Deprecated
    java.lang.Class writeUsing() default java.lang.Void.class;
}
