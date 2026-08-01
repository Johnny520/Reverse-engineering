package com.google.gson.internal;

import androidx.collection.C0276;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3229 extends AbstractC3232 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Method f10882;

    public C3229(Method method) {
        this.f10882 = method;
    }

    @Override // com.google.gson.internal.AbstractC3232
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo7338(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f10882.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            C0276.m847("Failed invoking canAccess", e);
            return false;
        }
    }
}
