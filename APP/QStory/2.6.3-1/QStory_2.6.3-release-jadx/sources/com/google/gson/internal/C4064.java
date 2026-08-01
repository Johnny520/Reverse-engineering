package com.google.gson.internal;

import java.lang.reflect.Method;
import p248.C8894;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4064 extends AbstractC4059 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Method f11235;

    public C4064(Method method) {
        this.f11235 = method;
    }

    @Override // com.google.gson.internal.AbstractC4059
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7883(Class cls) {
        String strM14107 = C8894.m14107(cls);
        if (strM14107 == null) {
            return this.f11235.invoke(null, cls, Object.class);
        }
        C6755.m11863("UnsafeAllocator is used for non-instantiable type: ".concat(strM14107));
        return null;
    }
}
