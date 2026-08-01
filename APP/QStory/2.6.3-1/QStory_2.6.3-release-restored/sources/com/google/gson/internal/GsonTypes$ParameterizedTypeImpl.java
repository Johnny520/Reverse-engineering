package com.google.gson.internal;

import androidx.activity.AbstractC0900;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class GsonTypes$ParameterizedTypeImpl implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type ownerType;
    private final Type rawType;
    private final Type[] typeArguments;

    public GsonTypes$ParameterizedTypeImpl(Type type, Class<?> cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            C6755.m11869(AbstractC0900.m714(cls, "Must specify owner type for "));
            throw null;
        }
        this.ownerType = type != null ? AbstractC4053.m7872(type) : null;
        this.rawType = AbstractC4053.m7872(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.typeArguments = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.typeArguments[i]);
            AbstractC4053.m7870(this.typeArguments[i]);
            Type[] typeArr3 = this.typeArguments;
            typeArr3[i] = AbstractC4053.m7872(typeArr3[i]);
        }
    }

    private static int hashCodeOrZero(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC4053.m7868(this, (ParameterizedType) obj);
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
            return AbstractC4053.m7875(this.rawType);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(AbstractC4053.m7875(this.rawType));
        sb.append("<");
        sb.append(AbstractC4053.m7875(this.typeArguments[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(AbstractC4053.m7875(this.typeArguments[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
