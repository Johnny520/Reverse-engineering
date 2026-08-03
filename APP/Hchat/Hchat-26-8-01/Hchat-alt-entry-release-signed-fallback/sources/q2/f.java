package q2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends android.text.TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f1.h f10620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t2.l f10621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f1.q0 f10623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f1.w f10624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f1.s f10625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i0.x f10626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e1.e f10627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h1.c f10628i;

    public final f1.h a() {
            r1 = this;
            f1.h r0 = r1.f10620a
            if (r0 == 0) goto L5
            return r0
        L5:
            f1.h r0 = new f1.h
            r0.<init>(r1)
            r1.f10620a = r0
            return r0
    }

    public final void b(int r2) {
            r1 = this;
            int r0 = r1.f10622c
            if (r2 != r0) goto L5
            return
        L5:
            f1.h r0 = r1.a()
            r0.v(r2)
            r1.f10622c = r2
            return
    }

    public final void c(f1.s r6, long r7, float r9) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.f10626g = r0
            r5.f10625f = r0
            r5.f10627h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof f1.t0
            if (r1 == 0) goto L1d
            f1.t0 r6 = (f1.t0) r6
            long r6 = r6.f3121a
            long r6 = ig.a.N(r6, r9)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof f1.p0
            if (r1 == 0) goto L72
            f1.s r1 = r5.f10625f
            boolean r1 = gg.l.a(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            e1.e r1 = r5.f10627h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.f2308a
            boolean r1 = e1.e.a(r3, r7)
        L36:
            if (r1 != 0) goto L59
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L59
            r5.f10625f = r6
            e1.e r1 = new e1.e
            r1.<init>(r7)
            r5.f10627h = r1
            q2.e r1 = new q2.e
            r2 = 0
            r1.<init>(r6, r7, r2)
            i0.x r6 = i0.r.p(r1)
            r5.f10626g = r6
        L59:
            f1.h r6 = r5.a()
            i0.x r7 = r5.f10626g
            if (r7 == 0) goto L68
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L69
        L68:
            r7 = r0
        L69:
            r6.z(r7)
            r5.f10624e = r0
            q2.j.c(r5, r9)
            return
        L72:
            okio.a.k()
            return
    }

    public final void d(long r5) {
            r4 = this;
            f1.w r0 = r4.f10624e
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Ld
        L7:
            long r2 = r0.f3133a
            boolean r0 = f1.w.c(r2, r5)
        Ld:
            if (r0 != 0) goto L30
            r2 = 16
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            r1 = 1
        L16:
            if (r1 == 0) goto L30
            f1.w r0 = new f1.w
            r0.<init>(r5)
            r4.f10624e = r0
            int r5 = f1.c0.w(r5)
            r4.setColor(r5)
            r5 = 0
            r4.f10626g = r5
            r4.f10625f = r5
            r4.f10627h = r5
            r4.setShader(r5)
        L30:
            return
    }

    public final void e(h1.c r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L61
        L3:
            h1.c r0 = r2.f10628i
            boolean r0 = gg.l.a(r0, r3)
            if (r0 != 0) goto L61
            r2.f10628i = r3
            h1.f r0 = h1.f.f5043b
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1b
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            return
        L1b:
            boolean r0 = r3 instanceof h1.g
            if (r0 == 0) goto L5e
            f1.h r0 = r2.a()
            r1 = 1
            r0.D(r1)
            f1.h r0 = r2.a()
            h1.g r3 = (h1.g) r3
            float r1 = r3.f5044b
            r0.C(r1)
            f1.h r0 = r2.a()
            float r1 = r3.f5045c
            java.lang.Object r0 = r0.f3058i
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setStrokeMiter(r1)
            f1.h r0 = r2.a()
            int r1 = r3.f5047e
            r0.B(r1)
            f1.h r0 = r2.a()
            int r3 = r3.f5046d
            r0.A(r3)
            f1.h r3 = r2.a()
            java.lang.Object r3 = r3.f3058i
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            r0 = 0
            r3.setPathEffect(r0)
            return
        L5e:
            okio.a.k()
        L61:
            return
    }

    public final void f(f1.q0 r6) {
            r5 = this;
            if (r6 != 0) goto L3
            goto L47
        L3:
            f1.q0 r0 = r5.f10623d
            boolean r0 = gg.l.a(r0, r6)
            if (r0 != 0) goto L47
            r5.f10623d = r6
            f1.q0 r0 = f1.q0.f3108d
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L19
            r5.clearShadowLayer()
            return
        L19:
            f1.q0 r6 = r5.f10623d
            float r0 = r6.f3111c
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L23
            r0 = 1
        L23:
            long r1 = r6.f3110b
            r6 = 32
            long r1 = r1 >> r6
            int r6 = (int) r1
            float r6 = java.lang.Float.intBitsToFloat(r6)
            f1.q0 r1 = r5.f10623d
            long r1 = r1.f3110b
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            f1.q0 r2 = r5.f10623d
            long r2 = r2.f3109a
            int r2 = f1.c0.w(r2)
            r5.setShadowLayer(r0, r6, r1, r2)
        L47:
            return
    }

    public final void g(t2.l r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L27
        L3:
            t2.l r0 = r3.f10621b
            boolean r0 = gg.l.a(r0, r4)
            if (r0 != 0) goto L27
            r3.f10621b = r4
            int r4 = r4.f13018a
            r0 = r4 | 1
            r1 = 0
            r2 = 1
            if (r0 != r4) goto L17
            r4 = r2
            goto L18
        L17:
            r4 = r1
        L18:
            r3.setUnderlineText(r4)
            t2.l r4 = r3.f10621b
            int r4 = r4.f13018a
            r0 = r4 | 2
            if (r0 != r4) goto L24
            r1 = r2
        L24:
            r3.setStrikeThruText(r1)
        L27:
            return
    }
}
