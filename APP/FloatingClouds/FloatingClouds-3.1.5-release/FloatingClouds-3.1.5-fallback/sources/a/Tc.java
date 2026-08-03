package a;

/* JADX INFO: loaded from: classes.dex */
public final class Tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.Uc f281a = null;
    public static final a.InterfaceC0318p9[] b = null;

    static {
            r0 = 0
            java.lang.String r1 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Throwable -> Le
            a.Uc r1 = (a.Uc) r1     // Catch: java.lang.Throwable -> Le
            r0 = r1
        Le:
            if (r0 == 0) goto L11
            goto L16
        L11:
            a.Uc r0 = new a.Uc
            r0.<init>()
        L16:
            a.Tc.f281a = r0
            r0 = 0
            a.p9[] r0 = new a.InterfaceC0318p9[r0]
            a.Tc.b = r0
            return
    }
}
