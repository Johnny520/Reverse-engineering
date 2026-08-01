package com.alibaba.fastjson2.util;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class BeanUtils$ParameterizedTypeImpl implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type ownerType;
    private final Type rawType;
    private final Type[] typeArguments;

    public BeanUtils$ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z = true;
            boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z2) {
                z = false;
            }
            AbstractC2865.m5808(z);
        }
        this.ownerType = type == null ? null : AbstractC2865.m5809(type);
        this.rawType = AbstractC2865.m5809(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.typeArguments = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            AbstractC2865.m5807(this.typeArguments[i]);
            Type[] typeArr3 = this.typeArguments;
            typeArr3[i] = AbstractC2865.m5809(typeArr3[i]);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC2865.m5829(this, (ParameterizedType) obj);
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
        int iHashCode = Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode();
        Type type = this.ownerType;
        Type[] typeArr = AbstractC2865.f9017;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public String toString() {
        int length = this.typeArguments.length;
        if (length == 0) {
            return AbstractC2865.m5783(this.rawType);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(AbstractC2865.m5783(this.rawType));
        sb.append("<");
        sb.append(AbstractC2865.m5783(this.typeArguments[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(AbstractC2865.m5783(this.typeArguments[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
