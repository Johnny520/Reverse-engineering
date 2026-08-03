package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends y0.n implements c2.a, x1.z1, q1.e, x1.v, x1.e2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b1.f f21985u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ y1.t f21986v;

    public k(y1.t r2) {
            r1 = this;
            r1.f21986v = r2
            r1.<init>()
            b1.f r2 = new b1.f
            r0 = 21
            r2.<init>(r1, r0)
            r1.f21985u = r2
            return
    }

    @Override // c2.a
    public final java.lang.Object A0(x1.i1 r3, c1.b r4, yf.c r5) {
            r2 = this;
            r0 = 0
            long r0 = r3.m0(r0)
            java.lang.Object r3 = r4.invoke()
            e1.c r3 = (e1.c) r3
            if (r3 == 0) goto L13
            e1.c r3 = r3.i(r0)
            goto L14
        L13:
            r3 = 0
        L14:
            if (r3 == 0) goto L2d
            android.graphics.Rect r4 = new android.graphics.Rect
            float r5 = r3.f2296a
            int r5 = (int) r5
            float r0 = r3.f2297b
            int r0 = (int) r0
            float r1 = r3.f2298c
            int r1 = (int) r1
            float r3 = r3.f2299d
            int r3 = (int) r3
            r4.<init>(r5, r0, r1, r3)
            r3 = 0
            y1.t r5 = r2.f21986v
            r5.requestRectangleOnScreen(r4, r3)
        L2d:
            sf.n r3 = sf.n.f12433a
            return r3
    }

    @Override // q1.e
    public final boolean C(android.view.KeyEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // x1.e2
    public final java.lang.Object F() {
            r1 = this;
            java.lang.String r0 = "androidx.compose.ui.layout.WindowInsetsRulers"
            return r0
    }

    @Override // q1.e
    public final boolean W(android.view.KeyEvent r10) {
            r9 = this;
            int[] r0 = d1.h.f1921a
            long r0 = q1.d.b(r10)
            long r2 = q1.a.f10572b
            boolean r2 = q1.a.a(r0, r2)
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L17
            d1.f r0 = new d1.f
            r0.<init>(r4)
            goto Lc9
        L17:
            long r5 = q1.a.f10573c
            boolean r2 = q1.a.a(r0, r5)
            if (r2 == 0) goto L26
            d1.f r0 = new d1.f
            r0.<init>(r3)
            goto Lc9
        L26:
            long r5 = q1.a.f10586p
            boolean r2 = q1.a.a(r0, r5)
            if (r2 == 0) goto L3f
            boolean r0 = r10.isShiftPressed()
            if (r0 == 0) goto L36
            r0 = r4
            goto L37
        L36:
            r0 = r3
        L37:
            d1.f r1 = new d1.f
            r1.<init>(r0)
            r0 = r1
            goto Lc9
        L3f:
            long r5 = q1.a.f10577g
            boolean r2 = q1.a.a(r0, r5)
            if (r2 == 0) goto L4f
            d1.f r0 = new d1.f
            r1 = 4
            r0.<init>(r1)
            goto Lc9
        L4f:
            long r5 = q1.a.f10576f
            boolean r2 = q1.a.a(r0, r5)
            if (r2 == 0) goto L5f
            d1.f r0 = new d1.f
            r1 = 3
            r0.<init>(r1)
            goto Lc9
        L5f:
            long r5 = q1.a.f10574d
            boolean r2 = q1.a.a(r0, r5)
            if (r2 != 0) goto Lc3
            long r5 = q1.a.C
            boolean r2 = q1.a.a(r0, r5)
            if (r2 == 0) goto L70
            goto Lc3
        L70:
            long r5 = q1.a.f10575e
            boolean r2 = q1.a.a(r0, r5)
            if (r2 != 0) goto Lbc
            long r5 = q1.a.D
            boolean r2 = q1.a.a(r0, r5)
            if (r2 == 0) goto L81
            goto Lbc
        L81:
            long r5 = q1.a.f10578h
            boolean r2 = q1.a.a(r0, r5)
            if (r2 != 0) goto Lb5
            long r5 = q1.a.f10588r
            boolean r2 = q1.a.a(r0, r5)
            if (r2 != 0) goto Lb5
            long r5 = q1.a.E
            boolean r2 = q1.a.a(r0, r5)
            if (r2 == 0) goto L9a
            goto Lb5
        L9a:
            long r5 = q1.a.f10571a
            boolean r2 = q1.a.a(r0, r5)
            if (r2 != 0) goto Lad
            long r5 = q1.a.f10591u
            boolean r0 = q1.a.a(r0, r5)
            if (r0 == 0) goto Lab
            goto Lad
        Lab:
            r0 = 0
            goto Lc9
        Lad:
            d1.f r0 = new d1.f
            r1 = 8
            r0.<init>(r1)
            goto Lc9
        Lb5:
            d1.f r0 = new d1.f
            r1 = 7
            r0.<init>(r1)
            goto Lc9
        Lbc:
            d1.f r0 = new d1.f
            r1 = 6
            r0.<init>(r1)
            goto Lc9
        Lc3:
            d1.f r0 = new d1.f
            r1 = 5
            r0.<init>(r1)
        Lc9:
            r1 = 0
            if (r0 == 0) goto L148
            int r2 = r0.f1920a
            int r10 = q1.d.c(r10)
            if (r10 != r4) goto L148
            y1.t r10 = r9.f21986v
            d1.l r5 = r10.getFocusOwner()
            d1.p r5 = (d1.p) r5
            d1.b0 r5 = r5.f()
            if (r5 == 0) goto Led
            boolean r5 = r5.f1903u
            if (r5 != r3) goto Led
            boolean r5 = r10.z(r2)
            if (r5 == 0) goto Led
            goto L10c
        Led:
            e1.c r5 = r10.getEmbeddedViewFocusRect()
            d1.l r6 = r10.getFocusOwner()
            b1.f r7 = new b1.f
            r8 = 20
            r7.<init>(r0, r8)
            d1.p r6 = (d1.p) r6
            java.lang.Boolean r0 = r6.e(r2, r5, r7)
            if (r0 == 0) goto L109
            boolean r0 = r0.booleanValue()
            goto L10a
        L109:
            r0 = r3
        L10a:
            if (r0 == 0) goto L10d
        L10c:
            return r3
        L10d:
            if (r2 != r3) goto L110
            goto L114
        L110:
            if (r2 != r4) goto L113
            goto L114
        L113:
            r3 = r1
        L114:
            if (r3 == 0) goto L148
            java.lang.Integer r0 = d1.h.c(r2)
            if (r0 == 0) goto L120
            int r4 = r0.intValue()
        L120:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r10.getRootView()
            r3.getClass()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r5 = r10.getView()
            android.view.View r0 = r0.findNextFocus(r3, r5, r4)
            if (r0 == 0) goto L13d
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L148
        L13d:
            d1.l r10 = r10.getFocusOwner()
            d1.p r10 = (d1.p) r10
            boolean r10 = r10.h(r2)
            return r10
        L148:
            return r1
    }

    @Override // x1.z1
    public final void X0(f2.y r1) {
            r0 = this;
            return
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r7, v1.m0 r8, long r9) {
            r6 = this;
            v1.b1 r8 = r8.Q(r9)
            int r1 = r8.f13900g
            int r2 = r8.f13901h
            c1.n r5 = new c1.n
            r9 = 5
            r5.<init>(r8, r9)
            tf.u r3 = tf.u.f13168g
            b1.f r4 = r6.f21985u
            r0 = r7
            v1.o0 r7 = r0.D0(r1, r2, r3, r4, r5)
            return r7
    }
}
