package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;
import p383.AbstractC9032;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class GsonTypes$ParameterizedTypeImpl implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type ownerType;
    private final Type rawType;
    private final Type[] typeArguments;

    public GsonTypes$ParameterizedTypeImpl(Type type, Class<?> cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            C5919.m11249(AbstractC9032.m14590(cls, "Must specify owner type for "));
            throw null;
        }
        this.ownerType = type != null ? AbstractC3220.m7326(type) : null;
        this.rawType = AbstractC3220.m7326(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.typeArguments = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.typeArguments[i]);
            AbstractC3220.m7324(this.typeArguments[i]);
            Type[] typeArr3 = this.typeArguments;
            typeArr3[i] = AbstractC3220.m7326(typeArr3[i]);
        }
    }

    private static int hashCodeOrZero(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC3220.m7322(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return (Type[]) this.typeArguments.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.ownerType;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.rawType;
    }

    public int hashCode() {
        return hashCodeOrZero(this.ownerType) ^ (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode());
    }

    public String toString() {
        int length = this.typeArguments.length;
        if (length == 0) {
            return AbstractC3220.m7329(this.rawType);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(AbstractC3220.m7329(this.rawType));
        sb.append("<");
        sb.append(AbstractC3220.m7329(this.typeArguments[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(AbstractC3220.m7329(this.typeArguments[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
