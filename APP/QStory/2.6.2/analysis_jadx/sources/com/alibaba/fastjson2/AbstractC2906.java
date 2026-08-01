package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2864;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2906<T> {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f9251;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Type f9252;

    public AbstractC2906() {
        Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.f9252 = type;
        this.f9251 = AbstractC2864.m5750(type);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC2906 m6294(Type type) {
        return new C2907(type);
    }

    public AbstractC2906(Type type) {
        type.getClass();
        this.f9252 = AbstractC2864.m5764(type);
        this.f9251 = AbstractC2864.m5750(type);
    }
}
