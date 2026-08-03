package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends gg.m implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x1.e f20876h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x1.e f20877i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x1.e f20878j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x1.e f20879k = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20880g;

    static {
            x1.e r0 = new x1.e
            r1 = 2
            r2 = 0
            r0.<init>(r1, r2)
            x1.e.f20876h = r0
            x1.e r0 = new x1.e
            r2 = 1
            r0.<init>(r1, r2)
            x1.e.f20877i = r0
            x1.e r0 = new x1.e
            r2 = 2
            r0.<init>(r1, r2)
            x1.e.f20878j = r0
            x1.e r0 = new x1.e
            r2 = 3
            r0.<init>(r1, r2)
            x1.e.f20879k = r0
            return
    }

    public /* synthetic */ e(int r1, int r2) {
            r0 = this;
            r0.f20880g = r2
            r0.<init>(r1)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f20880g
            switch(r0) {
                case 0: goto Le5;
                case 1: goto Ld9;
                case 2: goto Lcd;
                default: goto L5;
            }
        L5:
            x1.g r8 = (x1.g) r8
            i0.t r9 = (i0.t) r9
            x1.f0 r8 = (x1.f0) r8
            r8.H = r9
            x1.b1 r0 = r8.L
            i0.m2 r1 = y1.h1.f21946h
            s0.h r9 = (s0.h) r9
            r9.getClass()
            java.lang.Object r1 = i0.r.v(r9, r1)
            u2.c r1 = (u2.c) r1
            r8.Z(r1)
            i0.m2 r1 = y1.h1.f21952n
            java.lang.Object r1 = i0.r.v(r9, r1)
            u2.m r1 = (u2.m) r1
            u2.m r2 = r8.F
            if (r2 == r1) goto L50
            r8.F = r1
            r8.D()
            x1.f0 r1 = r8.u()
            if (r1 == 0) goto L3a
            r1.B()
            goto L43
        L3a:
            x1.r1 r1 = r8.f20902t
            if (r1 == 0) goto L43
            y1.t r1 = (y1.t) r1
            r1.invalidate()
        L43:
            r8.C()
            y0.n r1 = r0.f20844f
        L48:
            if (r1 == 0) goto L50
            r1.k0()
            y0.n r1 = r1.f21824l
            goto L48
        L50:
            i0.m2 r1 = y1.h1.f21958t
            java.lang.Object r9 = i0.r.v(r9, r1)
            y1.l2 r9 = (y1.l2) r9
            r8.e0(r9)
            y0.n r8 = r0.f20844f
            int r9 = r8.f21822j
            r0 = 32768(0x8000, float:4.5918E-41)
            r9 = r9 & r0
            if (r9 == 0) goto Lca
        L65:
            if (r8 == 0) goto Lca
            int r9 = r8.f21821i
            r9 = r9 & r0
            if (r9 == 0) goto Lc2
            r9 = 0
            r1 = r8
            r2 = r9
        L6f:
            if (r1 == 0) goto Lc2
            boolean r3 = r1 instanceof x1.h
            r4 = 1
            if (r3 == 0) goto L87
            x1.h r1 = (x1.h) r1
            y0.n r1 = (y0.n) r1
            y0.n r1 = r1.f21819g
            boolean r3 = r1.f21832t
            if (r3 == 0) goto L84
            x1.j1.c(r1)
            goto Lbd
        L84:
            r1.f21828p = r4
            goto Lbd
        L87:
            int r3 = r1.f21821i
            r3 = r3 & r0
            if (r3 == 0) goto Lbd
            boolean r3 = r1 instanceof x1.j
            if (r3 == 0) goto Lbd
            r3 = r1
            x1.j r3 = (x1.j) r3
            y0.n r3 = r3.f20950v
            r5 = 0
        L96:
            if (r3 == 0) goto Lba
            int r6 = r3.f21821i
            r6 = r6 & r0
            if (r6 == 0) goto Lb7
            int r5 = r5 + 1
            if (r5 != r4) goto La3
            r1 = r3
            goto Lb7
        La3:
            if (r2 != 0) goto Lae
            j0.b r2 = new j0.b
            r6 = 16
            y0.n[] r6 = new y0.n[r6]
            r2.<init>(r6)
        Lae:
            if (r1 == 0) goto Lb4
            r2.b(r1)
            r1 = r9
        Lb4:
            r2.b(r3)
        Lb7:
            y0.n r3 = r3.f21824l
            goto L96
        Lba:
            if (r5 != r4) goto Lbd
            goto L6f
        Lbd:
            y0.n r1 = x1.k.e(r2)
            goto L6f
        Lc2:
            int r9 = r8.f21822j
            r9 = r9 & r0
            if (r9 == 0) goto Lca
            y0.n r8 = r8.f21824l
            goto L65
        Lca:
            sf.n r8 = sf.n.f12433a
            return r8
        Lcd:
            x1.g r8 = (x1.g) r8
            y0.o r9 = (y0.o) r9
            x1.f0 r8 = (x1.f0) r8
            r8.d0(r9)
            sf.n r8 = sf.n.f12433a
            return r8
        Ld9:
            x1.g r8 = (x1.g) r8
            v1.n0 r9 = (v1.n0) r9
            x1.f0 r8 = (x1.f0) r8
            r8.c0(r9)
            sf.n r8 = sf.n.f12433a
            return r8
        Le5:
            x1.g r8 = (x1.g) r8
            java.lang.Number r9 = (java.lang.Number) r9
            r9.intValue()
            x1.f0 r8 = (x1.f0) r8
            r8.getClass()
            sf.n r8 = sf.n.f12433a
            return r8
    }
}
