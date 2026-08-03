package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends gg.m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f4635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y0.o f4636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0.d f4637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4641n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4642o;

    public d(i.k1 r2, fg.l r3, y0.o r4, h.r0 r5, h.s0 r6, fg.p r7, s0.d r8, int r9) {
            r1 = this;
            r0 = 1
            r1.f4634g = r0
            r1.f4639l = r2
            r1.f4635h = r3
            r1.f4636i = r4
            r1.f4640m = r5
            r1.f4641n = r6
            r1.f4642o = r7
            r1.f4637j = r8
            r1.f4638k = r9
            r2 = 2
            r1.<init>(r2)
            return
    }

    public d(java.lang.Object r2, y0.o r3, fg.l r4, y0.c r5, java.lang.String r6, fg.l r7, s0.d r8, int r9) {
            r1 = this;
            r0 = 0
            r1.f4634g = r0
            r1.f4639l = r2
            r1.f4636i = r3
            r1.f4635h = r4
            r1.f4641n = r5
            r1.f4642o = r6
            r1.f4640m = r7
            r1.f4637j = r8
            r1.f4638k = r9
            r2 = 2
            r1.<init>(r2)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.f4634g
            switch(r0) {
                case 0: goto L35;
                default: goto L5;
            }
        L5:
            r8 = r11
            i0.h0 r8 = (i0.h0) r8
            java.lang.Number r12 = (java.lang.Number) r12
            r12.intValue()
            java.lang.Object r11 = r10.f4639l
            r1 = r11
            i.k1 r1 = (i.k1) r1
            java.lang.Object r11 = r10.f4640m
            r4 = r11
            h.r0 r4 = (h.r0) r4
            java.lang.Object r11 = r10.f4641n
            r5 = r11
            h.s0 r5 = (h.s0) r5
            java.lang.Object r11 = r10.f4642o
            r6 = r11
            fg.p r6 = (fg.p) r6
            int r11 = r10.f4638k
            r11 = r11 | 1
            int r9 = i0.r.C(r11)
            fg.l r2 = r10.f4635h
            y0.o r3 = r10.f4636i
            s0.d r7 = r10.f4637j
            h.a0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            sf.n r11 = sf.n.f12433a
            return r11
        L35:
            r7 = r11
            i0.h0 r7 = (i0.h0) r7
            java.lang.Number r12 = (java.lang.Number) r12
            r12.intValue()
            java.lang.Object r11 = r10.f4641n
            r3 = r11
            y0.c r3 = (y0.c) r3
            java.lang.Object r11 = r10.f4642o
            r4 = r11
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r11 = r10.f4640m
            r5 = r11
            fg.l r5 = (fg.l) r5
            int r11 = r10.f4638k
            r11 = r11 | 1
            int r8 = i0.r.C(r11)
            java.lang.Object r0 = r10.f4639l
            y0.o r1 = r10.f4636i
            fg.l r2 = r10.f4635h
            s0.d r6 = r10.f4637j
            h.k.b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            sf.n r11 = sf.n.f12433a
            return r11
    }
}
