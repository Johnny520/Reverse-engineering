package ug;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements tg.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wf.g f13818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final sg.a f13820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tg.d f13821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final yf.i f13822k;

    public g(fg.q r1, tg.d r2, wf.g r3, int r4, sg.a r5) {
            r0 = this;
            r0.<init>()
            r0.f13818g = r3
            r0.f13819h = r4
            r0.f13820i = r5
            r0.f13821j = r2
            yf.i r1 = (yf.i) r1
            r0.f13822k = r1
            return
    }

    public final java.lang.Object a(tg.e r3, yf.c r4) {
            r2 = this;
            ug.e r0 = new ug.e
            r1 = 0
            r0.<init>(r2, r3, r1)
            java.lang.Object r3 = qg.v.e(r0, r4)
            xf.a r4 = xf.a.f21579g
            if (r3 != r4) goto Lf
            return r3
        Lf:
            sf.n r3 = sf.n.f12433a
            return r3
    }

    @Override // tg.d
    public final java.lang.Object b(tg.e r6, wf.c r7) {
            r5 = this;
            int r0 = r5.f13819h
            r1 = -3
            xf.a r2 = xf.a.f21579g
            if (r0 != r1) goto L71
            wf.g r0 = r7.getContext()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            i2.y r3 = new i2.y
            r4 = 13
            r3.<init>(r4)
            wf.g r4 = r5.f13818g
            java.lang.Object r1 = r4.k(r3, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L27
            wf.g r1 = r0.e(r4)
            goto L2c
        L27:
            r1 = 0
            wf.g r1 = qg.v.h(r0, r4, r1)
        L2c:
            boolean r3 = gg.l.a(r1, r0)
            if (r3 == 0) goto L3b
            yf.c r7 = (yf.c) r7
            java.lang.Object r6 = r5.a(r6, r7)
            if (r6 != r2) goto L87
            return r6
        L3b:
            wf.d r3 = wf.d.f20785g
            wf.e r4 = r1.s(r3)
            wf.e r0 = r0.s(r3)
            boolean r0 = gg.l.a(r4, r0)
            if (r0 == 0) goto L71
            wf.g r0 = r7.getContext()
            boolean r3 = r6 instanceof ug.n
            if (r3 != 0) goto L5e
            boolean r3 = r6 instanceof ug.j
            if (r3 == 0) goto L58
            goto L5e
        L58:
            h.w r3 = new h.w
            r3.<init>(r6, r0)
            r6 = r3
        L5e:
            ci.j r0 = new ci.j
            r3 = 0
            r4 = 16
            r0.<init>(r5, r3, r4)
            java.lang.Object r3 = vg.a.k(r1)
            java.lang.Object r6 = ug.c.a(r1, r6, r3, r0, r7)
            if (r6 != r2) goto L87
            return r6
        L71:
            c0.m r0 = new c0.m
            r1 = 0
            r3 = 17
            r0.<init>(r6, r5, r1, r3)
            java.lang.Object r6 = qg.v.e(r0, r7)
            xf.a r7 = xf.a.f21579g
            if (r6 != r7) goto L82
            goto L84
        L82:
            sf.n r6 = sf.n.f12433a
        L84:
            if (r6 != r2) goto L87
            return r6
        L87:
            sf.n r6 = sf.n.f12433a
            return r6
    }

    public final java.lang.String c() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            wf.h r1 = wf.h.f20786g
            wf.g r2 = r7.f13818g
            if (r2 == r1) goto L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "context="
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L1d:
            r1 = -3
            int r2 = r7.f13819h
            if (r2 == r1) goto L33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "capacity="
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L33:
            sg.a r1 = sg.a.f12436g
            sg.a r2 = r7.f13820i
            if (r2 == r1) goto L4a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "onBufferOverflow="
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L4a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r6.append(r1)
            r1 = 91
            r6.append(r1)
            r4 = 0
            r5 = 62
            java.lang.String r1 = ", "
            r2 = 0
            r3 = 0
            java.lang.String r0 = tf.m.A1(r0, r1, r2, r3, r4, r5)
            r1 = 93
            java.lang.String r0 = eh.a.q(r6, r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            tg.d r1 = r2.f13821j
            r0.append(r1)
            java.lang.String r1 = " -> "
            r0.append(r1)
            java.lang.String r1 = r2.c()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
