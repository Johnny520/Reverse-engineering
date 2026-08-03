package h6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h6.a f5099d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h6.a f5100e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f5101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f5102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5103c;

    static {
            h6.a r0 = new h6.a
            java.lang.String r1 = ""
            r2 = 0
            r0.<init>(r1, r1, r2)
            h6.a.f5099d = r0
            h6.a r0 = new h6.a
            java.lang.String r1 = "  "
            r2 = 1
            java.lang.String r3 = "\n"
            r0.<init>(r3, r1, r2)
            h6.a.f5100e = r0
            return
    }

    public a(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "[\r\n]*"
            boolean r0 = r2.matches(r0)
            if (r0 == 0) goto L21
            java.lang.String r0 = "[ \t]*"
            boolean r0 = r3.matches(r0)
            if (r0 == 0) goto L1a
            r1.f5101a = r2
            r1.f5102b = r3
            r1.f5103c = r4
            return
        L1a:
            java.lang.String r2 = "Only combinations of spaces and tabs are allowed in indent."
            j8.o.t(r2)
            r2 = 0
            throw r2
        L21:
            java.lang.String r2 = "Only combinations of \\n and \\r are allowed in newline."
            j8.o.t(r2)
            r2 = 0
            throw r2
    }
}
