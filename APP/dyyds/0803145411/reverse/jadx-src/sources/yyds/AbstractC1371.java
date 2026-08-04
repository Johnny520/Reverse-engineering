package yyds;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: yyds.ᛶᛷᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1371 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ int f6399 = 0;

    static {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final Class m2790(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            classLoader = AbstractC2408.f11843;
        }
        Class<?> cls = classLoader != null ? Class.forName(str, false, classLoader) : Class.forName(str);
        if (cls != null) {
            return cls;
        }
        C0188.m791(str, "JVM class not resolved: ");
        return null;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static /* synthetic */ Class m2791(String str, ClassLoader classLoader, int i) {
        if ((i & 1) != 0) {
            classLoader = null;
        }
        return m2790(classLoader, str);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static Class m2792(String str, ClassLoader classLoader, int i) {
        Object c2658;
        if ((i & 1) != 0) {
            classLoader = null;
        }
        try {
            c2658 = m2790(classLoader, str);
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        return (Class) (c2658 instanceof C2658 ? null : c2658);
    }
}
