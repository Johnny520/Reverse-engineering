package com.alibaba.fastjson2.introspect;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.Type;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FunctionAccessor<T> implements PropertyAccessor {
    protected final BiFunction<PropertyAccessor, Throwable, RuntimeException> exceptionHandler;
    protected final Object getter;
    protected final String name;
    protected final Class<?> propertyClass;
    protected final Type propertyType;
    protected final Object setter;

    public FunctionAccessor(String str, Type type, Class<?> cls, Object obj, Object obj2, BiFunction<PropertyAccessor, Throwable, RuntimeException> biFunction) {
        this.name = str;
        this.propertyType = type;
        this.propertyClass = cls;
        this.getter = obj;
        this.setter = obj2;
        this.exceptionHandler = biFunction;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ RuntimeException m6281a(PropertyAccessor propertyAccessor, Throwable th) {
        return (RuntimeException) th;
    }

    public final JSONException errorForGet(Throwable th) {
        return new JSONException(this.name.concat(" get error"), th);
    }

    public RuntimeException errorForSet(Throwable th) {
        BiFunction<PropertyAccessor, Throwable, RuntimeException> biFunction = this.exceptionHandler;
        return biFunction != null ? biFunction.apply(this, th) : new JSONException(this.name.concat(" set error"), th);
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
    public final String name() {
        return this.name;
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
    public final Class<?> propertyClass() {
        return this.propertyClass;
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
    public final Type propertyType() {
        return this.propertyType;
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
    public final boolean supportGet() {
        return this.getter != null;
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
    public final boolean supportSet() {
        return this.setter != null;
    }

    public FunctionAccessor(String str, Type type, Class<?> cls, Object obj, Object obj2) {
        this(str, type, cls, obj, obj2, new BiFunction() { // from class: com.alibaba.fastjson2.introspect.a
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj3, Object obj4) {
                return FunctionAccessor.m6281a((PropertyAccessor) obj3, (Throwable) obj4);
            }
        });
    }
}
