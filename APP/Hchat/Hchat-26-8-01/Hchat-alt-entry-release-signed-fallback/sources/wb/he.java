package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class he implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16555i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16556j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16557k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16558l;

    public /* synthetic */ he(i0.a1 r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, int r6) {
            r0 = this;
            r0.f16553g = r6
            r0.f16554h = r1
            r0.f16555i = r2
            r0.f16556j = r3
            r0.f16557k = r4
            r0.f16558l = r5
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
            r9 = this;
            int r0 = r9.f16553g
            r.d r10 = (r.d) r10
            i0.h0 r11 = (i0.h0) r11
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r10.getClass()
            r10 = r12 & 17
            switch(r0) {
                case 0: goto L47;
                default: goto L14;
            }
        L14:
            r0 = 16
            r1 = 1
            if (r10 == r0) goto L1b
            r10 = r1
            goto L1c
        L1b:
            r10 = 0
        L1c:
            r12 = r12 & r1
            boolean r10 = r11.S(r12, r10)
            if (r10 == 0) goto L41
            wb.t8 r2 = new wb.t8
            r8 = 0
            i0.a1 r3 = r9.f16554h
            i0.a1 r4 = r9.f16555i
            i0.a1 r5 = r9.f16556j
            i0.a1 r6 = r9.f16557k
            i0.a1 r7 = r9.f16558l
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = 230167888(0xdb81550, float:1.1345006E-30)
            s0.d r10 = s0.i.e(r10, r2, r11)
            r12 = 48
            r0 = 0
            wb.ho.C3(r0, r10, r11, r12, r1)
            goto L44
        L41:
            r11.V()
        L44:
            sf.n r10 = sf.n.f12433a
            return r10
        L47:
            r0 = 16
            r1 = 1
            if (r10 == r0) goto L4e
            r10 = r1
            goto L4f
        L4e:
            r10 = 0
        L4f:
            r12 = r12 & r1
            boolean r10 = r11.S(r12, r10)
            if (r10 == 0) goto L74
            wb.t8 r2 = new wb.t8
            r8 = 1
            i0.a1 r3 = r9.f16554h
            i0.a1 r4 = r9.f16555i
            i0.a1 r5 = r9.f16556j
            i0.a1 r6 = r9.f16557k
            i0.a1 r7 = r9.f16558l
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = -531655167(0xffffffffe04f9601, float:-5.9832577E19)
            s0.d r10 = s0.i.e(r10, r2, r11)
            r12 = 48
            r0 = 0
            wb.ho.C3(r0, r10, r11, r12, r1)
            goto L77
        L74:
            r11.V()
        L77:
            sf.n r10 = sf.n.f12433a
            return r10
    }
}
