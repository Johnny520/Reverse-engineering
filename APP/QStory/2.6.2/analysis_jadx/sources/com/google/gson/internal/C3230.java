package com.google.gson.internal;

import java.lang.reflect.Method;
import p232.C8064;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3230 extends AbstractC3226 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f10883;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Method f10884;

    public C3230(Method method, int i) {
        this.f10884 = method;
        this.f10883 = i;
    }

    @Override // com.google.gson.internal.AbstractC3226
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7337(Class cls) {
        String strM13519 = C8064.m13519(cls);
        if (strM13519 == null) {
            return this.f10884.invoke(null, cls, Integer.valueOf(this.f10883));
        }
        C5919.m11243("UnsafeAllocator is used for non-instantiable type: ".concat(strM13519));
        return null;
    }
}
