package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements tg.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6928k;

    public /* synthetic */ c0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f6924g = r5
            r0.f6925h = r1
            r0.f6926i = r2
            r0.f6927j = r3
            r0.f6928k = r4
            r0.<init>()
            return
    }

    @Override // tg.e
    public final java.lang.Object e(java.lang.Object r7, wf.c r8) {
            r6 = this;
            int r0 = r6.f6924g
            switch(r0) {
                case 0: goto Lab;
                case 1: goto L33;
                default: goto L5;
            }
        L5:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.Object r8 = r6.f6927j
            h0.d1 r8 = (h0.d1) r8
            java.lang.Object r0 = r6.f6925h
            w.q0 r0 = (w.q0) r0
            if (r7 == 0) goto L2d
            boolean r7 = r0.b()
            if (r7 == 0) goto L2d
            java.lang.Object r7 = r6.f6926i
            n2.t r7 = (n2.t) r7
            n2.s r1 = r8.n()
            java.lang.Object r2 = r6.f6928k
            n2.j r2 = (n2.j) r2
            b5.k r8 = r8.f4848b
            w.s.y(r7, r0, r1, r2, r8)
            goto L30
        L2d:
            w.s.o(r0)
        L30:
            sf.n r7 = sf.n.f12433a
            return r7
        L33:
            boolean r0 = r8 instanceof ug.f
            if (r0 == 0) goto L46
            r0 = r8
            ug.f r0 = (ug.f) r0
            int r1 = r0.f13817k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L46
            int r1 = r1 - r2
            r0.f13817k = r1
            goto L4b
        L46:
            ug.f r0 = new ug.f
            r0.<init>(r6, r8)
        L4b:
            java.lang.Object r8 = r0.f13815i
            int r1 = r0.f13817k
            r2 = 1
            if (r1 == 0) goto L63
            if (r1 != r2) goto L5c
            java.lang.Object r7 = r0.f13814h
            k.c0 r0 = r0.f13813g
            f8.i.I0(r8)
            goto L8c
        L5c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r7)
            r7 = 0
            goto Laa
        L63:
            f8.i.I0(r8)
            java.lang.Object r8 = r6.f6925h
            gg.u r8 = (gg.u) r8
            java.lang.Object r8 = r8.f4564g
            qg.r0 r8 = (qg.r0) r8
            if (r8 == 0) goto L8b
            i.l0 r1 = new i.l0
            java.lang.String r3 = "Child of the scoped flow was cancelled"
            r4 = 1
            r1.<init>(r3, r4)
            r8.a(r1)
            r0.f13813g = r6
            r0.f13814h = r7
            r0.f13817k = r2
            java.lang.Object r8 = r8.g(r0)
            xf.a r0 = xf.a.f21579g
            if (r8 != r0) goto L8b
            r7 = r0
            goto Laa
        L8b:
            r0 = r6
        L8c:
            java.lang.Object r8 = r0.f6925h
            gg.u r8 = (gg.u) r8
            java.lang.Object r1 = r0.f6926i
            qg.t r1 = (qg.t) r1
            ug.e r3 = new ug.e
            java.lang.Object r4 = r0.f6927j
            ug.g r4 = (ug.g) r4
            java.lang.Object r0 = r0.f6928k
            tg.e r0 = (tg.e) r0
            r5 = 0
            r3.<init>(r4, r0, r7, r5)
            qg.e1 r7 = qg.v.q(r1, r5, r3, r2)
            r8.f4564g = r7
            sf.n r7 = sf.n.f12433a
        Laa:
            return r7
        Lab:
            n.j r7 = (n.j) r7
            java.lang.Object r8 = r6.f6927j
            gg.s r8 = (gg.s) r8
            java.lang.Object r0 = r6.f6926i
            gg.s r0 = (gg.s) r0
            java.lang.Object r1 = r6.f6925h
            gg.s r1 = (gg.s) r1
            boolean r2 = r7 instanceof n.m
            r3 = 1
            if (r2 == 0) goto Lc4
            int r7 = r1.f4562g
            int r7 = r7 + r3
            r1.f4562g = r7
            goto L103
        Lc4:
            boolean r2 = r7 instanceof n.n
            if (r2 == 0) goto Lcf
            int r7 = r1.f4562g
            int r7 = r7 + (-1)
            r1.f4562g = r7
            goto L103
        Lcf:
            boolean r2 = r7 instanceof n.l
            if (r2 == 0) goto Lda
            int r7 = r1.f4562g
            int r7 = r7 + (-1)
            r1.f4562g = r7
            goto L103
        Lda:
            boolean r2 = r7 instanceof n.h
            if (r2 == 0) goto Le4
            int r7 = r0.f4562g
            int r7 = r7 + r3
            r0.f4562g = r7
            goto L103
        Le4:
            boolean r2 = r7 instanceof n.i
            if (r2 == 0) goto Lef
            int r7 = r0.f4562g
            int r7 = r7 + (-1)
            r0.f4562g = r7
            goto L103
        Lef:
            boolean r2 = r7 instanceof n.f
            if (r2 == 0) goto Lf9
            int r7 = r8.f4562g
            int r7 = r7 + r3
            r8.f4562g = r7
            goto L103
        Lf9:
            boolean r7 = r7 instanceof n.g
            if (r7 == 0) goto L103
            int r7 = r8.f4562g
            int r7 = r7 + (-1)
            r8.f4562g = r7
        L103:
            int r7 = r1.f4562g
            r1 = 0
            if (r7 <= 0) goto L10a
            r7 = r3
            goto L10b
        L10a:
            r7 = r1
        L10b:
            int r0 = r0.f4562g
            if (r0 <= 0) goto L111
            r0 = r3
            goto L112
        L111:
            r0 = r1
        L112:
            int r8 = r8.f4562g
            if (r8 <= 0) goto L118
            r8 = r3
            goto L119
        L118:
            r8 = r1
        L119:
            java.lang.Object r2 = r6.f6928k
            k.d0 r2 = (k.d0) r2
            boolean r4 = r2.f6936v
            if (r4 == r7) goto L124
            r2.f6936v = r7
            r1 = r3
        L124:
            boolean r7 = r2.f6937w
            if (r7 == r0) goto L12b
            r2.f6937w = r0
            r1 = r3
        L12b:
            boolean r7 = r2.f6938x
            if (r7 == r8) goto L132
            r2.f6938x = r8
            goto L133
        L132:
            r3 = r1
        L133:
            if (r3 == 0) goto L138
            x1.k.l(r2)
        L138:
            sf.n r7 = sf.n.f12433a
            return r7
    }
}
