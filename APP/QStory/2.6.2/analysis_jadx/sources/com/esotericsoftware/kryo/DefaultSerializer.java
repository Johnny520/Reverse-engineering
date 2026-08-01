package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.SerializerFactory;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DefaultSerializer {
    Class<? extends SerializerFactory> serializerFactory() default SerializerFactory.ReflectionSerializerFactory.class;

    Class<? extends Serializer> value() default Serializer.class;
}
