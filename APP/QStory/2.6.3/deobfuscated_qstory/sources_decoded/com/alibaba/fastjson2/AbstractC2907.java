package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2865;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2907<T> {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f9253;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Type f9254;

    public AbstractC2907() {
        Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.f9254 = type;
        this.f9253 = AbstractC2865.m5795(type);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC2907 m6352(Type type) {
        return new C2908(type);
    }

    public AbstractC2907(Type type) {
        type.getClass();
        this.f9254 = AbstractC2865.m5809(type);
        this.f9253 = AbstractC2865.m5795(type);
    }
}
