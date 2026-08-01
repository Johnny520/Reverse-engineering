package com.google.gson.internal;

import androidx.collection.C0276;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3230 extends AbstractC3233 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Method f10887;

    public C3230(Method method) {
        this.f10887 = method;
    }

    @Override // com.google.gson.internal.AbstractC3233
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo7325(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f10887.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            C0276.m848("Failed invoking canAccess", e);
            return false;
        }
    }
}
