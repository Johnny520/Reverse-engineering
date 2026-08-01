package com.alibaba.fastjson2.util;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
            AbstractC2864.m5763(z);
        }
        this.ownerType = type == null ? null : AbstractC2864.m5764(type);
        this.rawType = AbstractC2864.m5764(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.typeArguments = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            AbstractC2864.m5762(this.typeArguments[i]);
            Type[] typeArr3 = this.typeArguments;
            typeArr3[i] = AbstractC2864.m5764(typeArr3[i]);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC2864.m5784(this, (ParameterizedType) obj);
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
        Type[] typeArr = AbstractC2864.f9015;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public String toString() {
        int length = this.typeArguments.length;
        if (length == 0) {
            return AbstractC2864.m5738(this.rawType);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(AbstractC2864.m5738(this.rawType));
        sb.append("<");
        sb.append(AbstractC2864.m5738(this.typeArguments[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(AbstractC2864.m5738(this.typeArguments[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
