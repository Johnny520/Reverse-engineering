package m6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f8727a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m6.e f8728b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m6.e f8729c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m6.a.C0000a f8730d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m6.b.a f8731e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m6.c f8732f = null;

    static {
            java.lang.String r0 = "java.sql.Date"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            m6.f.f8727a = r0
            if (r0 == 0) goto L2b
            m6.e r0 = new m6.e
            java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
            r0.<init>(r1)
            m6.f.f8728b = r0
            m6.e r0 = new m6.e
            java.lang.Class<java.sql.Timestamp> r1 = java.sql.Timestamp.class
            r0.<init>(r1)
            m6.f.f8729c = r0
            m6.a$a r0 = m6.a.f8721b
            m6.f.f8730d = r0
            m6.b$a r0 = m6.b.f8723b
            m6.f.f8731e = r0
            m6.c r0 = m6.d.f8725b
            m6.f.f8732f = r0
            goto L36
        L2b:
            r0 = 0
            m6.f.f8728b = r0
            m6.f.f8729c = r0
            m6.f.f8730d = r0
            m6.f.f8731e = r0
            m6.f.f8732f = r0
        L36:
            return
    }
}
