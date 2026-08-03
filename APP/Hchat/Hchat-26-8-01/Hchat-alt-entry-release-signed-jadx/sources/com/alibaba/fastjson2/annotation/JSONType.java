package com.alibaba.fastjson2.annotation;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.filter.Filter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JSONType {
    boolean alphabetic() default true;

    Class<? extends JSONReader.AutoTypeBeforeHandler> autoTypeBeforeHandler() default JSONReader.AutoTypeBeforeHandler.class;

    Class<?> builder() default void.class;

    JSONReader.Feature[] deserializeFeatures() default {};

    Class<?> deserializer() default Void.class;

    boolean disableArrayMapping() default false;

    boolean disableAutoType() default false;

    boolean disableJSONB() default false;

    boolean disableReferenceDetect() default false;

    boolean disableSmartMatch() default false;

    String format() default "";

    String[] ignores() default {};

    String[] includes() default {};

    String locale() default "";

    PropertyNamingStrategy naming() default PropertyNamingStrategy.NeverUseThisValueExceptDefaultValue;

    String[] orders() default {};

    String rootName() default "";

    String schema() default "";

    Class<?>[] seeAlso() default {};

    Class<?> seeAlsoDefault() default Void.class;

    JSONWriter.Feature[] serializeFeatures() default {};

    Class<? extends Filter>[] serializeFilters() default {};

    Class<?> serializer() default Void.class;

    String typeKey() default "";

    String typeName() default "";

    boolean writeEnumAsJavaBean() default false;
}
