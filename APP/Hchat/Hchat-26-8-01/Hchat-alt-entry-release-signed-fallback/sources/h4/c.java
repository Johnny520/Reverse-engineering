package h4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h4.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i4.l f5076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i4.g f5077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h4.u f5078f;

    public c(int r3, int r4, i4.l r5, i4.g r6, h4.u r7) {
            r2 = this;
            java.lang.String r0 = "Code"
            r2.<init>(r0)
            if (r3 < 0) goto L42
            if (r4 < 0) goto L3b
            boolean r0 = r6.f22555g     // Catch: java.lang.NullPointerException -> L34
            r1 = 0
            if (r0 != 0) goto L2c
            boolean r0 = r7.f22555g     // Catch: java.lang.NullPointerException -> L25
            if (r0 != 0) goto L1d
            r2.f5074b = r3
            r2.f5075c = r4
            r2.f5076d = r5
            r2.f5077e = r6
            r2.f5078f = r7
            return
        L1d:
            e4.a r3 = new e4.a     // Catch: java.lang.NullPointerException -> L25
            java.lang.String r4 = "attributes.isMutable()"
            r3.<init>(r4, r1)     // Catch: java.lang.NullPointerException -> L25
            throw r3     // Catch: java.lang.NullPointerException -> L25
        L25:
            java.lang.String r3 = "attributes == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
        L2c:
            e4.a r3 = new e4.a     // Catch: java.lang.NullPointerException -> L34
            java.lang.String r4 = "catches.isMutable()"
            r3.<init>(r4, r1)     // Catch: java.lang.NullPointerException -> L34
            throw r3     // Catch: java.lang.NullPointerException -> L34
        L34:
            java.lang.String r3 = "catches == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
        L3b:
            java.lang.String r3 = "maxLocals < 0"
            j8.o.t(r3)
            r3 = 0
            throw r3
        L42:
            java.lang.String r3 = "maxStack < 0"
            j8.o.t(r3)
            r3 = 0
            throw r3
    }

    @Override // h4.s
    public final int a() {
            r6 = this;
            i4.l r0 = r6.f5076d
            java.lang.Object r0 = r0.f6465g
            g8.b r0 = (g8.b) r0
            int r0 = r0.f4344c
            int r0 = r0 + 14
            i4.g r1 = r6.f5077e
            java.lang.Object[] r1 = r1.f22543h
            int r1 = r1.length
            r2 = 8
            r3 = 2
            int r0 = p.a.g(r1, r2, r3, r0)
            h4.u r1 = r6.f5078f
            java.lang.Object[] r2 = r1.f22543h
            int r2 = r2.length
            r4 = 0
        L1c:
            if (r4 >= r2) goto L2c
            java.lang.Object r5 = r1.l(r4)
            h4.s r5 = (h4.s) r5
            int r5 = r5.a()
            int r3 = r3 + r5
            int r4 = r4 + 1
            goto L1c
        L2c:
            int r0 = r0 + r3
            return r0
    }
}
