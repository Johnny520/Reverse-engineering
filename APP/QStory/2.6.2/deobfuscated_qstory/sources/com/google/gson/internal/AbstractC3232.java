package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3232 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC3232 f10886;

    static {
        AbstractC3232 c3229;
        if (AbstractC3235.f10894 >= 9) {
            try {
                c3229 = new C3229(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
                c3229 = null;
            }
        } else {
            c3229 = null;
        }
        if (c3229 == null) {
            c3229 = new C3228();
        }
        f10886 = c3229;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract boolean mo7338(Object obj, AccessibleObject accessibleObject);
}
