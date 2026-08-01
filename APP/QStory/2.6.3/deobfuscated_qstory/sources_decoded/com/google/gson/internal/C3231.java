package com.google.gson.internal;

import java.lang.reflect.Method;
import p232.C8065;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3231 extends AbstractC3227 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f10888;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Method f10889;

    public C3231(Method method, int i) {
        this.f10889 = method;
        this.f10888 = i;
    }

    @Override // com.google.gson.internal.AbstractC3227
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7324(Class cls) {
        String strM13548 = C8065.m13548(cls);
        if (strM13548 == null) {
            return this.f10889.invoke(null, cls, Integer.valueOf(this.f10888));
        }
        C5925.m11304("UnsafeAllocator is used for non-instantiable type: ".concat(strM13548));
        return null;
    }
}
