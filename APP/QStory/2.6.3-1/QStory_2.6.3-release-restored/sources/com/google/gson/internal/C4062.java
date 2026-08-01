package com.google.gson.internal;

import androidx.collection.C1123;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4062 extends AbstractC4065 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Method f11232;

    public C4062(Method method) {
        this.f11232 = method;
    }

    @Override // com.google.gson.internal.AbstractC4065
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo7884(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f11232.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            C1123.m1408("Failed invoking canAccess", e);
            return false;
        }
    }
}
