package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends p4.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p4.f f10103f;

    public b0(p4.j r1, u4.t r2, u4.p r3, p4.f r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            if (r4 == 0) goto L8
            r0.f10103f = r4
            return
        L8:
            java.lang.String r1 = "target == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    @Override // p4.h
    public final java.lang.String a() {
            r1 = this;
            p4.f r0 = r1.f10103f
            if (r0 != 0) goto L7
            java.lang.String r0 = "????"
            return r0
        L7:
            java.lang.String r0 = r0.f()
            return r0
    }

    @Override // p4.l, p4.h
    public final p4.h i(p4.j r5) {
            r4 = this;
            p4.b0 r0 = new p4.b0
            u4.p r1 = r4.f10116d
            p4.f r2 = r4.f10103f
            u4.t r3 = r4.f10115c
            r0.<init>(r5, r3, r1, r2)
            return r0
    }

    @Override // p4.h
    public final p4.h k(u4.p r5) {
            r4 = this;
            p4.b0 r0 = new p4.b0
            u4.t r1 = r4.f10115c
            p4.f r2 = r4.f10103f
            p4.j r3 = r4.f10114b
            r0.<init>(r3, r1, r5, r2)
            return r0
    }

    public final int m() {
            r2 = this;
            p4.f r0 = r2.f10103f
            int r0 = r0.e()
            int r1 = r2.e()
            int r0 = r0 - r1
            return r0
    }

    public final boolean n() {
            r1 = this;
            int r0 = r1.f10113a
            if (r0 < 0) goto Lc
            p4.f r0 = r1.f10103f
            int r0 = r0.f10113a
            if (r0 < 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final p4.b0 o(p4.f r5) {
            r4 = this;
            p4.j r0 = r4.f10114b
            int r1 = r0.f10118a
            switch(r1) {
                case 50: goto L2f;
                case 51: goto L2c;
                case 52: goto L29;
                case 53: goto L26;
                case 54: goto L23;
                case 55: goto L20;
                case 56: goto L1d;
                case 57: goto L1a;
                case 58: goto L17;
                case 59: goto L14;
                case 60: goto L11;
                case 61: goto Le;
                default: goto L7;
            }
        L7:
            java.lang.String r5 = "bogus opcode: "
            g1.d.f(r0, r5)
            r5 = 0
            return r5
        Le:
            p4.j r0 = p4.k.f10124a0
            goto L31
        L11:
            p4.j r0 = p4.k.f10128b0
            goto L31
        L14:
            p4.j r0 = p4.k.Y
            goto L31
        L17:
            p4.j r0 = p4.k.Z
            goto L31
        L1a:
            p4.j r0 = p4.k.W
            goto L31
        L1d:
            p4.j r0 = p4.k.X
            goto L31
        L20:
            p4.j r0 = p4.k.U
            goto L31
        L23:
            p4.j r0 = p4.k.V
            goto L31
        L26:
            p4.j r0 = p4.k.S
            goto L31
        L29:
            p4.j r0 = p4.k.T
            goto L31
        L2c:
            p4.j r0 = p4.k.Q
            goto L31
        L2f:
            p4.j r0 = p4.k.R
        L31:
            p4.b0 r1 = new p4.b0
            u4.t r2 = r4.f10115c
            u4.p r3 = r4.f10116d
            r1.<init>(r0, r2, r3, r5)
            return r1
    }
}
