package com.alibaba.fastjson2.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;
import p279.InterfaceC8365;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8365(typeName = "java.lang.reflect.ParameterizedType")
public final class C2829 implements ParameterizedType {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Type f8809;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Type[] f8810;

    public C2829(Class cls, Type... typeArr) {
        this.f8809 = cls;
        this.f8810 = typeArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2829.class != obj.getClass()) {
            return false;
        }
        C2829 c2829 = (C2829) obj;
        if (Arrays.equals(this.f8810, c2829.f8810)) {
            return Objects.equals(this.f8809, c2829.f8809);
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f8810;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return null;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f8809;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f8810) * 961;
        Type type = this.f8809;
        return iHashCode + (type != null ? type.hashCode() : 0);
    }
}
