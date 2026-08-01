package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class j00 {
    public static final defpackage.k00 a = null;

    static {
            r0 = 0
            java.lang.String r1 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Throwable -> Le
            k00 r1 = (defpackage.k00) r1     // Catch: java.lang.Throwable -> Le
            r0 = r1
        Le:
            if (r0 == 0) goto L11
            goto L16
        L11:
            k00 r0 = new k00
            r0.<init>()
        L16:
            defpackage.j00.a = r0
            return
    }
}
