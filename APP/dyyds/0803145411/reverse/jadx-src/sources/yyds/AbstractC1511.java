package yyds;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: yyds.ᛷᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1511 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static volatile boolean f7304 = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final boolean m3135(Member member) {
        Object c2658;
        boolean zBooleanValue;
        AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
        if (accessibleObject == null) {
            return false;
        }
        if (f7304) {
            try {
                c2658 = Boolean.valueOf(accessibleObject.trySetAccessible());
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
            if (C2248.m4249(c2658) != null) {
                f7304 = false;
                c2658 = Boolean.valueOf(m3136(accessibleObject));
            }
            zBooleanValue = ((Boolean) c2658).booleanValue();
        } else {
            zBooleanValue = m3136(accessibleObject);
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final boolean m3136(AccessibleObject accessibleObject) {
        Object c2658;
        try {
            if (!accessibleObject.isAccessible()) {
                accessibleObject.setAccessible(true);
            }
            c2658 = Boolean.TRUE;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Object obj = Boolean.FALSE;
        if (c2658 instanceof C2658) {
            c2658 = obj;
        }
        return ((Boolean) c2658).booleanValue();
    }
}
