package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.function.Function;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplValue<I, T> implements ObjectReader<T> {
    final Constructor<T> constructor;
    final Object emptyVariantArgs;
    final Method factoryMethod;
    final long features;
    final Function<I, T> function;
    final Class<I> valueClass;
    ObjectReader valueReader;
    final Type valueType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplValue(Class<T> cls, Type type, Class<I> cls2, long j3, String str, Object obj, Constructor<T> constructor, Method method, Function<I, T> function) {
        this.valueType = type;
        this.valueClass = cls2;
        this.features = j3;
        this.constructor = constructor;
        this.factoryMethod = method;
        this.function = function;
        if (method != null) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 2) {
                this.emptyVariantArgs = Array.newInstance(parameterTypes[1].getComponentType(), 0);
                return;
            }
        }
        this.emptyVariantArgs = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static <I, T> ObjectReaderImplValue<I, T> m1736of(Class<T> cls, Class<I> cls2, Method method) {
        return new ObjectReaderImplValue<>(cls, cls2, cls2, 0L, null, null, null, method, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        return readObject(jSONReader, type, obj, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (this.valueReader == null) {
            this.valueReader = jSONReader.getObjectReader(this.valueType);
        }
        Object object = this.valueReader.readObject(jSONReader, type, obj, j3 | this.features);
        if (object == null) {
            return null;
        }
        Function<I, T> function = this.function;
        if (function != null) {
            try {
                return function.apply((I) object);
            } catch (Exception e6) {
                C0086a.m465x(jSONReader.info("create object error"), e6);
                return null;
            }
        }
        Constructor<T> constructor = this.constructor;
        if (constructor != null) {
            try {
                return constructor.newInstance(object);
            } catch (Exception e7) {
                C0086a.m465x(jSONReader.info("create object error"), e7);
                return null;
            }
        }
        Method method = this.factoryMethod;
        if (method == null) {
            C0086a.m464w(jSONReader.info("create object error"));
            return null;
        }
        try {
            Object obj2 = this.emptyVariantArgs;
            return obj2 != null ? (T) method.invoke(null, object, obj2) : (T) method.invoke(null, object);
        } catch (Exception e10) {
            C0086a.m465x(jSONReader.info("create object error"), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: of */
    public static <I, T> ObjectReaderImplValue<I, T> m1737of(Class<T> cls, Class<I> cls2, Function<I, T> function) {
        return new ObjectReaderImplValue<>(cls, cls2, cls2, 0L, null, null, null, null, function);
    }
}
