package com.alibaba.fastjson2.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;
import p279.InterfaceC8366;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8366(typeName = "java.lang.reflect.ParameterizedType")
public final class C2830 implements ParameterizedType {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Type f8811;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Type[] f8812;

    public C2830(Class cls, Type... typeArr) {
        this.f8811 = cls;
        this.f8812 = typeArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2830.class != obj.getClass()) {
            return false;
        }
        C2830 c2830 = (C2830) obj;
        if (Arrays.equals(this.f8812, c2830.f8812)) {
            return Objects.equals(this.f8811, c2830.f8811);
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f8812;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return null;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f8811;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f8812) * 961;
        Type type = this.f8811;
        return iHashCode + (type != null ? type.hashCode() : 0);
    }
}
