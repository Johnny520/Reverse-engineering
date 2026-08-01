package com.google.gson.internal;

import java.lang.reflect.Method;
import p232.C8064;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3233 extends AbstractC3226 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f10887;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Method f10888;

    public C3233(Method method, Object obj) {
        this.f10888 = method;
        this.f10887 = obj;
    }

    @Override // com.google.gson.internal.AbstractC3226
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7337(Class cls) {
        String strM13519 = C8064.m13519(cls);
        if (strM13519 == null) {
            return this.f10888.invoke(this.f10887, cls);
        }
        C5919.m11243("UnsafeAllocator is used for non-instantiable type: ".concat(strM13519));
        return null;
    }
}
