package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.SerializerFactory;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DefaultSerializer {
    Class<? extends SerializerFactory> serializerFactory() default SerializerFactory.ReflectionSerializerFactory.class;

    Class<? extends Serializer> value() default Serializer.class;
}
