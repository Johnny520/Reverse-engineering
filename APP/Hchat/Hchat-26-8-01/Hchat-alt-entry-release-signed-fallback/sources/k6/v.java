package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends k6.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f7376e = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Constructor f7377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object[] f7378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f7379d;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.lang.Byte r2 = java.lang.Byte.valueOf(r1)
            java.lang.Class r3 = java.lang.Byte.TYPE
            r0.put(r3, r2)
            java.lang.Class r2 = java.lang.Short.TYPE
            java.lang.Short r3 = java.lang.Short.valueOf(r1)
            r0.put(r2, r3)
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r3)
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Class r3 = java.lang.Long.TYPE
            r0.put(r3, r2)
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Class r3 = java.lang.Float.TYPE
            r0.put(r3, r2)
            r2 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Class r3 = java.lang.Double.TYPE
            r0.put(r3, r2)
            java.lang.Class r2 = java.lang.Character.TYPE
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r0.put(r2, r1)
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.put(r1, r2)
            k6.v.f7376e = r0
            return
    }

    public v(java.lang.Class r5, k6.u r6) {
            r4 = this;
            r4.<init>(r6)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r4.f7379d = r6
            f8.i r6 = l6.c.f7868a
            java.lang.reflect.Constructor r0 = r6.A(r5)
            r4.f7377b = r0
            l6.c.f(r0)
            java.lang.String[] r5 = r6.I(r5)
            r6 = 0
            r0 = r6
        L1b:
            int r1 = r5.length
            if (r0 >= r1) goto L2c
            java.util.HashMap r1 = r4.f7379d
            r2 = r5[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r3)
            int r0 = r0 + 1
            goto L1b
        L2c:
            java.lang.reflect.Constructor r5 = r4.f7377b
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r0 = r5.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r4.f7378c = r0
        L37:
            int r0 = r5.length
            if (r6 >= r0) goto L49
            java.lang.Object[] r0 = r4.f7378c
            java.util.HashMap r1 = k6.v.f7376e
            r2 = r5[r6]
            java.lang.Object r1 = r1.get(r2)
            r0[r6] = r1
            int r6 = r6 + 1
            goto L37
        L49:
            return
    }
}
