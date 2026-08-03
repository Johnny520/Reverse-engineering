package ag;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Method f250a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Method f251b = null;

    static {
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.reflect.Method[] r1 = r0.getMethods()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lc:
            r5 = 0
            if (r4 >= r2) goto L36
            r6 = r1[r4]
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "addSuppressed"
            boolean r7 = gg.l.a(r7, r8)
            if (r7 == 0) goto L33
            java.lang.Class[] r7 = r6.getParameterTypes()
            r7.getClass()
            int r8 = r7.length
            r9 = 1
            if (r8 != r9) goto L2b
            r7 = r7[r3]
            goto L2c
        L2b:
            r7 = r5
        L2c:
            boolean r7 = gg.l.a(r7, r0)
            if (r7 == 0) goto L33
            goto L37
        L33:
            int r4 = r4 + 1
            goto Lc
        L36:
            r6 = r5
        L37:
            ag.a.f250a = r6
            int r0 = r1.length
        L3a:
            if (r3 >= r0) goto L4f
            r2 = r1[r3]
            java.lang.String r4 = r2.getName()
            java.lang.String r6 = "getSuppressed"
            boolean r4 = gg.l.a(r4, r6)
            if (r4 == 0) goto L4c
            r5 = r2
            goto L4f
        L4c:
            int r3 = r3 + 1
            goto L3a
        L4f:
            ag.a.f251b = r5
            return
    }
}
