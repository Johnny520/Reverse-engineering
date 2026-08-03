package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends y0.n implements x1.z1 {
    public s.t0 A;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public fg.a f12121u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r.f f12122v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m.p1 f12123w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12124x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f2.j f12125y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final s.t0 f12126z;

    public w0(fg.a r1, r.f r2, m.p1 r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f12121u = r1
            r0.f12122v = r2
            r0.f12123w = r3
            r0.f12124x = r4
            s.t0 r1 = new s.t0
            r2 = 0
            r1.<init>(r0, r2)
            r0.f12126z = r1
            r0.k1()
            return
    }

    @Override // x1.z1
    public final void X0(f2.y r7) {
            r6 = this;
            f2.w.f(r7)
            s.t0 r0 = r6.f12126z
            f2.x r1 = f2.u.M
            r7.a(r1, r0)
            m.p1 r0 = r6.f12123w
            f2.j r1 = r6.f12125y
            java.lang.String r2 = "scrollAxisRange"
            r3 = 0
            m.p1 r4 = m.p1.f8324g
            if (r0 != r4) goto L27
            if (r1 == 0) goto L23
            f2.x r0 = f2.u.f3244v
            mg.d[] r2 = f2.w.f3251a
            r4 = 13
            r2 = r2[r4]
            r7.a(r0, r1)
            goto L34
        L23:
            gg.l.g(r2)
            throw r3
        L27:
            if (r1 == 0) goto L8d
            f2.x r0 = f2.u.f3243u
            mg.d[] r2 = f2.w.f3251a
            r4 = 12
            r2 = r2[r4]
            r7.a(r0, r1)
        L34:
            s.t0 r0 = r6.A
            if (r0 == 0) goto L42
            f2.x r1 = f2.l.f3183f
            f2.a r2 = new f2.a
            r2.<init>(r3, r0)
            r7.a(r1, r2)
        L42:
            s.u0 r0 = new s.u0
            r1 = 2
            r0.<init>(r6, r1)
            f2.x r1 = f2.l.C
            f2.a r2 = new f2.a
            b1.f r4 = new b1.f
            r5 = 10
            r4.<init>(r0, r5)
            r2.<init>(r3, r4)
            r7.a(r1, r2)
            r.f r0 = r6.f12122v
            boolean r1 = r0.f11164c
            i0.x r0 = r0.f11162a
            r2 = 1
            if (r1 == 0) goto L72
            f2.d r1 = new f2.d
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.<init>(r0, r2)
            goto L81
        L72:
            f2.d r1 = new f2.d
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.<init>(r2, r0)
        L81:
            f2.x r0 = f2.u.f3228f
            mg.d[] r2 = f2.w.f3251a
            r3 = 24
            r2 = r2[r3]
            r7.a(r0, r1)
            return
        L8d:
            gg.l.g(r2)
            throw r3
    }

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void k1() {
            r4 = this;
            f2.j r0 = new f2.j
            s.u0 r1 = new s.u0
            r2 = 0
            r1.<init>(r4, r2)
            s.u0 r2 = new s.u0
            r3 = 1
            r2.<init>(r4, r3)
            r0.<init>(r1, r2)
            r4.f12125y = r0
            boolean r0 = r4.f12124x
            if (r0 == 0) goto L1e
            s.t0 r0 = new s.t0
            r1 = 1
            r0.<init>(r4, r1)
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r4.A = r0
            return
    }
}
