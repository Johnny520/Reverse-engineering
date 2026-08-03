package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends p4.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v4.a f10110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10112h;

    public g(p4.j r1, u4.t r2, u4.p r3, v4.a r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            if (r4 == 0) goto Ld
            r0.f10110f = r4
            r1 = -1
            r0.f10111g = r1
            r0.f10112h = r1
            return
        Ld:
            java.lang.String r1 = "constant == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    @Override // p4.h
    public final java.lang.String a() {
            r1 = this;
            v4.a r0 = r1.f10110f
            java.lang.String r0 = r0.a()
            return r0
    }

    @Override // p4.h
    public final java.lang.String c() {
            r3 = this;
            int r0 = r3.f10111g
            if (r0 < 0) goto L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 20
            r0.<init>(r1)
            v4.a r1 = r3.f10110f
            java.lang.String r1 = r1.j()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r1 = r3.f10111g
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r1 >= r2) goto L27
            java.lang.String r1 = a.a.X0(r1)
            r0.append(r1)
            goto L2e
        L27:
            java.lang.String r1 = a.a.Y0(r1)
            r0.append(r1)
        L2e:
            java.lang.String r0 = r0.toString()
            return r0
        L33:
            java.lang.String r0 = ""
            return r0
    }

    @Override // p4.h
    public final java.lang.String d() {
            r2 = this;
            v4.a r0 = r2.f10110f
            boolean r1 = r0 instanceof v4.c0
            if (r1 == 0) goto Ld
            v4.c0 r0 = (v4.c0) r0
            java.lang.String r0 = r0.l()
            return r0
        Ld:
            java.lang.String r0 = r0.a()
            return r0
    }

    @Override // p4.l, p4.h
    public final p4.h i(p4.j r5) {
            r4 = this;
            p4.g r0 = new p4.g
            u4.p r1 = r4.f10116d
            v4.a r2 = r4.f10110f
            u4.t r3 = r4.f10115c
            r0.<init>(r5, r3, r1, r2)
            int r5 = r4.f10111g
            if (r5 < 0) goto L12
            r0.o(r5)
        L12:
            int r5 = r4.f10112h
            if (r5 < 0) goto L19
            r0.n(r5)
        L19:
            return r0
    }

    @Override // p4.h
    public final p4.h k(u4.p r5) {
            r4 = this;
            p4.g r0 = new p4.g
            u4.t r1 = r4.f10115c
            v4.a r2 = r4.f10110f
            p4.j r3 = r4.f10114b
            r0.<init>(r3, r1, r5, r2)
            int r5 = r4.f10111g
            if (r5 < 0) goto L12
            r0.o(r5)
        L12:
            int r5 = r4.f10112h
            if (r5 < 0) goto L19
            r0.n(r5)
        L19:
            return r0
    }

    public final int m() {
            r2 = this;
            int r0 = r2.f10111g
            if (r0 < 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "index not yet set for "
            v4.a r1 = r2.f10110f
            okio.a.l(r1, r0)
            r0 = 0
            return r0
    }

    public final void n(int r2) {
            r1 = this;
            if (r2 < 0) goto Lf
            int r0 = r1.f10112h
            if (r0 >= 0) goto L9
            r1.f10112h = r2
            return
        L9:
            java.lang.String r2 = "class index already set"
            j8.o.A(r2)
            return
        Lf:
            java.lang.String r2 = "index < 0"
            j8.o.t(r2)
            return
    }

    public final void o(int r2) {
            r1 = this;
            if (r2 < 0) goto Lf
            int r0 = r1.f10111g
            if (r0 >= 0) goto L9
            r1.f10111g = r2
            return
        L9:
            java.lang.String r2 = "index already set"
            j8.o.A(r2)
            return
        Lf:
            java.lang.String r2 = "index < 0"
            j8.o.t(r2)
            return
    }
}
