package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC3698;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3740<T> {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f9598;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Type f9599;

    public AbstractC3740() {
        Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.f9599 = type;
        this.f9598 = AbstractC3698.m6355(type);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC3740 m6912(Type type) {
        return new C3741(type);
    }

    public AbstractC3740(Type type) {
        type.getClass();
        this.f9599 = AbstractC3698.m6369(type);
        this.f9598 = AbstractC3698.m6355(type);
    }
}
