package ac;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f186c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f188b;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            ac.n.f186c = r0
            return
    }

    public n(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L2c
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L2c
            if (r4 == 0) goto L25
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L25
            java.lang.String r0 = "/"
            boolean r1 = r3.endsWith(r0)
            if (r1 == 0) goto L1c
            goto L20
        L1c:
            java.lang.String r3 = r3.concat(r0)
        L20:
            r2.f187a = r3
            r2.f188b = r4
            return
        L25:
            java.lang.String r3 = "name is empty"
            j8.o.t(r3)
            r3 = 0
            throw r3
        L2c:
            java.lang.String r3 = "path is empty"
            j8.o.t(r3)
            r3 = 0
            throw r3
    }
}
