package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class GsonTypes$GenericArrayTypeImpl implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type componentType;

    public GsonTypes$GenericArrayTypeImpl(Type type) {
        Objects.requireNonNull(type);
        this.componentType = AbstractC3220.m7326(type);
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC3220.m7322(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.componentType;
    }

    public int hashCode() {
        return this.componentType.hashCode();
    }

    public String toString() {
        return AbstractC3220.m7329(this.componentType) + "[]";
    }
}
