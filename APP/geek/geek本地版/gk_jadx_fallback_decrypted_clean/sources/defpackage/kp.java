package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class kp {
    public static final java.lang.Integer a = null;

    static {
            r0 = 0
            java.lang.String r1 = "android.os.Build$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "SDK_INT"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L18
            boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L18
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L18
            goto L19
        L18:
            r1 = r0
        L19:
            if (r1 == 0) goto L22
            int r2 = r1.intValue()
            if (r2 <= 0) goto L22
            r0 = r1
        L22:
            defpackage.kp.a = r0
            return
    }
}
