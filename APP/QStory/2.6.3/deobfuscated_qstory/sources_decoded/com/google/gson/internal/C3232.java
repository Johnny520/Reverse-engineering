package com.google.gson.internal;

import java.lang.reflect.Method;
import p232.C8065;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3232 extends AbstractC3227 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Method f10890;

    public C3232(Method method) {
        this.f10890 = method;
    }

    @Override // com.google.gson.internal.AbstractC3227
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7324(Class cls) {
        String strM13548 = C8065.m13548(cls);
        if (strM13548 == null) {
            return this.f10890.invoke(null, cls, Object.class);
        }
        C5925.m11304("UnsafeAllocator is used for non-instantiable type: ".concat(strM13548));
        return null;
    }
}
