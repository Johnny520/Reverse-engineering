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
            AbstractC3698.m6368(z);
        }
        this.ownerType = type == null ? null : AbstractC3698.m6369(type);
        this.rawType = AbstractC3698.m6369(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.typeArguments = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            AbstractC3698.m6367(this.typeArguments[i]);
            Type[] typeArr3 = this.typeArguments;
            typeArr3[i] = AbstractC3698.m6369(typeArr3[i]);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC3698.m6389(this, (ParameterizedType) obj);
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
        Type[] typeArr = AbstractC3698.f9362;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public String toString() {
        int length = this.typeArguments.length;
        if (length == 0) {
            return AbstractC3698.m6343(this.rawType);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(AbstractC3698.m6343(this.rawType));
        sb.append("<");
        sb.append(AbstractC3698.m6343(this.typeArguments[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(AbstractC3698.m6343(this.typeArguments[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
