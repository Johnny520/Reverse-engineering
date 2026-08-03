package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends gg.m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i.k1 f4678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f4680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h.t f4681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w0.p f4682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s0.d f4683l;

    public h(i.k1 r1, java.lang.Object r2, fg.l r3, h.t r4, w0.p r5, s0.d r6) {
            r0 = this;
            r0.f4678g = r1
            r0.f4679h = r2
            r0.f4680i = r3
            r0.f4681j = r4
            r0.f4682k = r5
            r0.f4683l = r6
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            r10 = this;
            r7 = r11
            i0.h0 r7 = (i0.h0) r7
            java.lang.Number r12 = (java.lang.Number) r12
            int r11 = r12.intValue()
            r12 = r11 & 3
            r0 = 2
            r1 = 1
            if (r12 == r0) goto L11
            r12 = r1
            goto L12
        L11:
            r12 = 0
        L12:
            r11 = r11 & r1
            boolean r11 = r7.S(r11, r12)
            if (r11 == 0) goto L104
            java.lang.Object r11 = r7.P()
            fg.l r12 = r10.f4680i
            h.t r0 = r10.f4681j
            i0.e r1 = i0.l.f5952a
            if (r11 != r1) goto L2e
            java.lang.Object r11 = r12.invoke(r0)
            h.e0 r11 = (h.e0) r11
            r7.k0(r11)
        L2e:
            h.e0 r11 = (h.e0) r11
            r2 = r0
            i.k1 r0 = r10.f4678g
            i.e1 r3 = r0.f()
            i0.j1 r4 = r0.f5710d
            java.lang.Object r3 = r3.c()
            java.lang.Object r5 = r10.f4679h
            boolean r3 = gg.l.a(r3, r5)
            boolean r3 = r7.g(r3)
            java.lang.Object r6 = r7.P()
            if (r3 != 0) goto L4f
            if (r6 != r1) goto L6d
        L4f:
            i.e1 r3 = r0.f()
            java.lang.Object r3 = r3.c()
            boolean r3 = gg.l.a(r3, r5)
            if (r3 == 0) goto L61
            h.s0 r12 = h.s0.f4751b
        L5f:
            r6 = r12
            goto L6a
        L61:
            java.lang.Object r12 = r12.invoke(r2)
            h.e0 r12 = (h.e0) r12
            h.s0 r12 = r12.f4651b
            goto L5f
        L6a:
            r7.k0(r6)
        L6d:
            h.s0 r6 = (h.s0) r6
            java.lang.Object r12 = r7.P()
            if (r12 != r1) goto L85
            h.o r12 = new h.o
            java.lang.Object r3 = r4.getValue()
            boolean r3 = gg.l.a(r5, r3)
            r12.<init>(r3)
            r7.k0(r12)
        L85:
            h.o r12 = (h.o) r12
            h.r0 r3 = r11.f4650a
            boolean r8 = r7.h(r11)
            java.lang.Object r9 = r7.P()
            if (r8 != 0) goto L95
            if (r9 != r1) goto L9d
        L95:
            h.e r9 = new h.e
            r9.<init>(r11)
            r7.k0(r9)
        L9d:
            fg.q r9 = (fg.q) r9
            y0.l r11 = y0.l.f21818a
            y0.o r11 = v1.w.k(r11, r9)
            java.lang.Object r4 = r4.getValue()
            boolean r4 = gg.l.a(r5, r4)
            i0.j1 r8 = r12.f4725a
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r8.setValue(r4)
            y0.o r11 = r11.d(r12)
            boolean r12 = r7.h(r5)
            java.lang.Object r4 = r7.P()
            if (r12 != 0) goto Lc6
            if (r4 != r1) goto Ld0
        Lc6:
            b1.f r4 = new b1.f
            r12 = 11
            r4.<init>(r5, r12)
            r7.k0(r4)
        Ld0:
            fg.l r4 = (fg.l) r4
            boolean r12 = r7.f(r6)
            java.lang.Object r8 = r7.P()
            if (r12 != 0) goto Lde
            if (r8 != r1) goto Le7
        Lde:
            a1.h r8 = new a1.h
            r12 = 1
            r8.<init>(r6, r12)
            r7.k0(r8)
        Le7:
            fg.p r8 = (fg.p) r8
            h.g r12 = new h.g
            w0.p r1 = r10.f4682k
            s0.d r9 = r10.f4683l
            r12.<init>(r1, r5, r2, r9)
            r1 = -143346359(0xfffffffff774b549, float:-4.9632708E33)
            s0.d r12 = s0.i.e(r1, r12, r7)
            r5 = r8
            r8 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r11
            r1 = r4
            r4 = r6
            r6 = r12
            h.a0.a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L107
        L104:
            r7.V()
        L107:
            sf.n r11 = sf.n.f12433a
            return r11
    }
}
