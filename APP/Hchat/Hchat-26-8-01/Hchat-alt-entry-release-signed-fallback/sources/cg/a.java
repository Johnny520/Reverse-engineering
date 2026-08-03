package cg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Integer f1662a = null;

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
            cg.a.f1662a = r0
            return
    }
}
