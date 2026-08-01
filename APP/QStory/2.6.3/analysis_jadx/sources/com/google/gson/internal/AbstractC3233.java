package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3233 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC3233 f10891;

    static {
        AbstractC3233 c3230;
        if (AbstractC3236.f10899 >= 9) {
            try {
                c3230 = new C3230(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
                c3230 = null;
            }
        } else {
            c3230 = null;
        }
        if (c3230 == null) {
            c3230 = new C3229();
        }
        f10891 = c3230;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract boolean mo7325(Object obj, AccessibleObject accessibleObject);
}
