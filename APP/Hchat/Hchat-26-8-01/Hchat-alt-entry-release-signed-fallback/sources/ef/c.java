package ef;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f2754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f2755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f2756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f2757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b5.k f2758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f2759g;

    public c(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.f2753a = r1
            r0.f2754b = r2
            r0.f2755c = r3
            r0.f2756d = r4
            r0.f2757e = r5
            return
    }

    public final ef.c a(java.lang.String r8) {
            r7 = this;
            int r0 = r7.f2753a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r0}
            java.lang.String r0 = "%s_res_0x%08x"
            java.lang.String r5 = java.lang.String.format(r0, r8)
            ef.c r1 = new ef.c
            java.lang.String r4 = r7.f2755c
            java.lang.String r6 = r7.f2757e
            int r2 = r7.f2753a
            java.lang.String r3 = r7.f2754b
            r1.<init>(r2, r3, r4, r5, r6)
            b5.k r8 = r7.f2758f
            r1.f2758f = r8
            java.util.ArrayList r8 = r7.f2759g
            r1.f2759g = r8
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.f2753a
            java.lang.String r1 = java.lang.Integer.toHexString(r0)
            java.lang.String r2 = " ("
            java.lang.String r3 = ")"
            java.lang.String r4 = "  0x"
            java.lang.StringBuilder r0 = eh.a.u(r0, r4, r1, r2, r3)
            java.lang.String r1 = " = "
            java.lang.String r2 = "."
            java.lang.String r3 = r5.f2757e
            java.lang.String r4 = r5.f2755c
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f2756d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
