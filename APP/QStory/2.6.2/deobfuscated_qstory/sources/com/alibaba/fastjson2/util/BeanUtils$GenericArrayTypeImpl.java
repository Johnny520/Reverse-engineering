package com.alibaba.fastjson2.util;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class BeanUtils$GenericArrayTypeImpl implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type componentType;

    public BeanUtils$GenericArrayTypeImpl(Type type) {
        this.componentType = AbstractC2864.m5764(type);
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC2864.m5784(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.componentType;
    }

    public int hashCode() {
        return this.componentType.hashCode();
    }

    public String toString() {
        return AbstractC2864.m5738(this.componentType) + "[]";
    }
}
