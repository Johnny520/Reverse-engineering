package yyds;

/* JADX INFO: renamed from: yyds.ᛸᛱᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1700 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1476 f8634;

    static {
        C1476 c1476 = null;
        try {
            c1476 = (C1476) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c1476 == null) {
            c1476 = new C1476();
        }
        f8634 = c1476;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C2234 m3448(Class cls) {
        f8634.getClass();
        return new C2234(cls);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m3449(C2677 c2677) {
        f8634.getClass();
    }
}
