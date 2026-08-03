package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jc implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17015l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17016m;

    public /* synthetic */ jc(i0.a1 r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, int r7) {
            r0 = this;
            r0.f17010g = r7
            r0.f17011h = r1
            r0.f17012i = r2
            r0.f17013j = r3
            r0.f17014k = r4
            r0.f17015l = r5
            r0.f17016m = r6
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r10 = this;
            int r0 = r10.f17010g
            r.d r11 = (r.d) r11
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11.getClass()
            r11 = r13 & 17
            switch(r0) {
                case 0: goto L49;
                default: goto L14;
            }
        L14:
            r0 = 16
            r1 = 1
            if (r11 == r0) goto L1b
            r11 = r1
            goto L1c
        L1b:
            r11 = 0
        L1c:
            r13 = r13 & r1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto L43
            wb.te r2 = new wb.te
            r9 = 0
            i0.a1 r3 = r10.f17011h
            i0.a1 r4 = r10.f17012i
            i0.a1 r5 = r10.f17013j
            i0.a1 r6 = r10.f17014k
            i0.a1 r7 = r10.f17015l
            i0.a1 r8 = r10.f17016m
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11 = -499035752(0xffffffffe2415198, float:-8.9152526E20)
            s0.d r11 = s0.i.e(r11, r2, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto L46
        L43:
            r12.V()
        L46:
            sf.n r11 = sf.n.f12433a
            return r11
        L49:
            r0 = 16
            r1 = 1
            if (r11 == r0) goto L50
            r11 = r1
            goto L51
        L50:
            r11 = 0
        L51:
            r13 = r13 & r1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto L78
            wb.te r2 = new wb.te
            r9 = 1
            i0.a1 r3 = r10.f17011h
            i0.a1 r4 = r10.f17012i
            i0.a1 r5 = r10.f17013j
            i0.a1 r6 = r10.f17014k
            i0.a1 r7 = r10.f17015l
            i0.a1 r8 = r10.f17016m
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11 = 1761065436(0x68f7b9dc, float:9.358824E24)
            s0.d r11 = s0.i.e(r11, r2, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto L7b
        L78:
            r12.V()
        L7b:
            sf.n r11 = sf.n.f12433a
            return r11
    }
}
