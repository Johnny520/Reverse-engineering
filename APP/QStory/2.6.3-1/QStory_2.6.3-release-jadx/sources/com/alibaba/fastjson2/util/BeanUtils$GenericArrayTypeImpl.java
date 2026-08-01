package com.alibaba.fastjson2.util;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class BeanUtils$GenericArrayTypeImpl implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type componentType;

    public BeanUtils$GenericArrayTypeImpl(Type type) {
        this.componentType = AbstractC3698.m6369(type);
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC3698.m6389(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.componentType;
    }

    public int hashCode() {
        return this.componentType.hashCode();
    }

    public String toString() {
        return AbstractC3698.m6343(this.componentType) + "[]";
    }
}
