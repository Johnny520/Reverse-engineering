package com.alibaba.fastjson2.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;
import p295.InterfaceC9195;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC9195(typeName = "java.lang.reflect.ParameterizedType")
public final class C3663 implements ParameterizedType {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Type f9156;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Type[] f9157;

    public C3663(Class cls, Type... typeArr) {
        this.f9156 = cls;
        this.f9157 = typeArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3663.class != obj.getClass()) {
            return false;
        }
        C3663 c3663 = (C3663) obj;
        if (Arrays.equals(this.f9157, c3663.f9157)) {
            return Objects.equals(this.f9156, c3663.f9156);
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f9157;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return null;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f9156;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f9157) * 961;
        Type type = this.f9156;
        return iHashCode + (type != null ? type.hashCode() : 0);
    }
}
