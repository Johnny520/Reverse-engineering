package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r4.l0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a9.h f11351n = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t4.a f11352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r4.s0 f11353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f11354m;

    static {
            a9.h r0 = new a9.h
            r1 = 29
            r0.<init>(r1)
            r4.a.f11351n = r0
            return
    }

    public a(r4.p r3, t4.a r4) {
            r2 = this;
            r0 = 1
            r1 = -1
            r2.<init>(r0, r1)
            if (r4 == 0) goto L12
            r2.f11352k = r4
            r4 = 0
            r2.f11353l = r4
            r2.f11354m = r4
            r2.a(r3)
            return
        L12:
            java.lang.String r3 = "annotation == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
    }

    @Override // r4.a0
    public final void a(r4.p r4) {
            r3 = this;
            r4.h0 r0 = r4.f11482g
            t4.a r1 = r3.f11352k
            v4.d0 r2 = r1.f13070h
            r4.s0 r0 = r0.p(r2)
            r3.f11353l = r0
            p4.t.i(r4, r1)
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.A
            return r0
    }

    @Override // r4.l0
    public final int e(r4.l0 r2) {
            r1 = this;
            r4.a r2 = (r4.a) r2
            t4.a r0 = r1.f11352k
            t4.a r2 = r2.f11352k
            int r2 = r0.m(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            t4.a r0 = r1.f11352k
            int r0 = r0.hashCode()
            return r0
    }

    @Override // r4.l0
    public final void j(r4.k0 r3, int r4) {
            r2 = this;
            z4.d r4 = new z4.d
            r4.<init>()
            p4.t r0 = new p4.t
            r4.p r3 = r3.f11472b
            r0.<init>(r3, r4)
            t4.a r3 = r2.f11352k
            r1 = 0
            r0.I(r3, r1)
            byte[] r3 = r4.h()
            r2.f11354m = r3
            int r3 = r3.length
            int r3 = r3 + 1
            r2.k(r3)
            return
    }

    @Override // r4.l0
    public final java.lang.String l() {
            r1 = this;
            t4.a r0 = r1.f11352k
            java.lang.String r0 = r0.a()
            return r0
    }

    @Override // r4.l0
    public final void m(r4.p r8, z4.d r9) {
            r7 = this;
            boolean r0 = r9.d()
            t4.a r1 = r7.f11352k
            int r2 = r1.f13071i
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L3c
            java.lang.String r5 = r7.g()
            java.lang.String r6 = " annotation"
            java.lang.String r5 = r5.concat(r6)
            r9.b(r3, r5)
            r5 = 1
            if (r2 == r5) goto L31
            r5 = 2
            if (r2 == r5) goto L2e
            r5 = 3
            if (r2 == r5) goto L2b
            r5 = 4
            if (r2 == r5) goto L28
            java.lang.String r5 = "null"
            goto L33
        L28:
            java.lang.String r5 = "EMBEDDED"
            goto L33
        L2b:
            java.lang.String r5 = "SYSTEM"
            goto L33
        L2e:
            java.lang.String r5 = "BUILD"
            goto L33
        L31:
            java.lang.String r5 = "RUNTIME"
        L33:
            java.lang.String r6 = "  visibility: VISBILITY_"
            java.lang.String r5 = r6.concat(r5)
            r9.b(r4, r5)
        L3c:
            int r2 = t3.c.b(r2)
            if (r2 == 0) goto L55
            if (r2 == r4) goto L51
            r3 = 2
            if (r2 != r3) goto L4b
            r9.j(r3)
            goto L58
        L4b:
            java.lang.String r8 = "shouldn't happen"
            bsh.j.g(r8)
            return
        L51:
            r9.j(r3)
            goto L58
        L55:
            r9.j(r4)
        L58:
            if (r0 == 0) goto L63
            p4.t r0 = new p4.t
            r0.<init>(r8, r9)
            r0.I(r1, r4)
            return
        L63:
            byte[] r8 = r7.f11354m
            r9.i(r8)
            return
    }
}
