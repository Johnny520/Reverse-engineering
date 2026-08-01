package com.google.gson.internal;

import java.lang.reflect.Method;
import p248.C8894;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4066 extends AbstractC4059 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f11237;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Method f11238;

    public C4066(Method method, Object obj) {
        this.f11238 = method;
        this.f11237 = obj;
    }

    @Override // com.google.gson.internal.AbstractC4059
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7883(Class cls) {
        String strM14107 = C8894.m14107(cls);
        if (strM14107 == null) {
            return this.f11238.invoke(this.f11237, cls);
        }
        C6755.m11863("UnsafeAllocator is used for non-instantiable type: ".concat(strM14107));
        return null;
    }
}
