package com.alibaba.fastjson2.annotation;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface JSONType {
    boolean alphabetic() default true;

    java.lang.Class<? extends com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler> autoTypeBeforeHandler() default com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler.class;

    java.lang.Class<?> builder() default void.class;

    com.alibaba.fastjson2.JSONReader.Feature[] deserializeFeatures() default {};

    java.lang.Class<?> deserializer() default java.lang.Void.class;

    boolean disableArrayMapping() default false;

    boolean disableAutoType() default false;

    boolean disableJSONB() default false;

    boolean disableReferenceDetect() default false;

    boolean disableSmartMatch() default false;

    java.lang.String format() default "";

    java.lang.String[] ignores() default {};

    java.lang.String[] includes() default {};

    java.lang.String locale() default "";

    com.alibaba.fastjson2.PropertyNamingStrategy naming() default com.alibaba.fastjson2.PropertyNamingStrategy.NeverUseThisValueExceptDefaultValue;

    java.lang.String[] orders() default {};

    java.lang.String rootName() default "";

    java.lang.String schema() default "";

    java.lang.Class<?>[] seeAlso() default {};

    java.lang.Class<?> seeAlsoDefault() default java.lang.Void.class;

    com.alibaba.fastjson2.JSONWriter.Feature[] serializeFeatures() default {};

    java.lang.Class<? extends com.alibaba.fastjson2.filter.Filter>[] serializeFilters() default {};

    java.lang.Class<?> serializer() default java.lang.Void.class;

    java.lang.String typeKey() default "";

    java.lang.String typeName() default "";

    boolean writeEnumAsJavaBean() default false;
}
