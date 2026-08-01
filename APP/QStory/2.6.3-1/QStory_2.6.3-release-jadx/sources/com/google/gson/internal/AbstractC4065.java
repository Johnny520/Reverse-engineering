package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4065 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC4065 f11236;

    static {
        AbstractC4065 c4062;
        if (AbstractC4068.f11244 >= 9) {
            try {
                c4062 = new C4062(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
                c4062 = null;
            }
        } else {
            c4062 = null;
        }
        if (c4062 == null) {
            c4062 = new C4061();
        }
        f11236 = c4062;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract boolean mo7884(Object obj, AccessibleObject accessibleObject);
}
