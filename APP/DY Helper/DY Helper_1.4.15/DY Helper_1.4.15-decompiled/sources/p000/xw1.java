package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xw1 extends p000.do1 implements p000.e80 {

    /* JADX INFO: renamed from: η */
    public long[] f12342;

    /* JADX INFO: renamed from: θ */
    public int f12343;

    /* JADX INFO: renamed from: ι */
    public int f12344;

    /* JADX INFO: renamed from: κ */
    public int f12345;

    /* JADX INFO: renamed from: λ */
    public /* synthetic */ java.lang.Object f12346;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ p000.yw1 f12347;

    public xw1(p000.yw1 r1, p000.InterfaceC0631op r2) {
            r0 = this;
            r0.f12347 = r1
            r0.<init>(r2)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ts1 r1 = (p000.ts1) r1
            op r2 = (p000.InterfaceC0631op) r2
            op r0 = r0.mo1119(r2, r1)
            xw1 r0 = (p000.xw1) r0
            s62 r1 = p000.s62.f9751
            java.lang.Object r0 = r0.mo11(r1)
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r2, java.lang.Object r3) {
            r1 = this;
            xw1 r0 = new xw1
            yw1 r1 = r1.f12347
            r0.<init>(r1, r2)
            r0.f12346 = r3
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r23) {
            r22 = this;
            r0 = r22
            yw1 r1 = r0.f12347
            long r2 = r1.f12862
            long r4 = r1.f12864
            long r6 = r1.f12863
            int r8 = r0.f12345
            r9 = 0
            r12 = 3
            r13 = 2
            r14 = 64
            r16 = 0
            r18 = 1
            r10 = 1
            cq r11 = p000.EnumC0184cq.f2716
            if (r8 == 0) goto L4c
            if (r8 == r10) goto L3d
            if (r8 == r13) goto L33
            if (r8 != r12) goto L2c
            int r1 = r0.f12343
            java.lang.Object r6 = r0.f12346
            ts1 r6 = (p000.ts1) r6
            p000.i81.m2649(r23)
            r7 = r12
            goto Lbe
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
        L33:
            int r1 = r0.f12343
            java.lang.Object r8 = r0.f12346
            ts1 r8 = (p000.ts1) r8
            p000.i81.m2649(r23)
            goto L94
        L3d:
            int r1 = r0.f12344
            int r8 = r0.f12343
            long[] r15 = r0.f12342
            java.lang.Object r12 = r0.f12346
            ts1 r12 = (p000.ts1) r12
            p000.i81.m2649(r23)
            int r8 = r8 + r10
            goto L5a
        L4c:
            p000.i81.m2649(r23)
            java.lang.Object r8 = r0.f12346
            r12 = r8
            ts1 r12 = (p000.ts1) r12
            long[] r15 = r1.f12865
            if (r15 == 0) goto L71
            int r1 = r15.length
            r8 = 0
        L5a:
            if (r8 >= r1) goto L71
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.f12346 = r12
            r0.f12342 = r15
            r0.f12343 = r8
            r0.f12344 = r1
            r0.f12345 = r10
            r12.m5740(r0, r4)
            return r11
        L71:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L97
            r8 = r12
            r1 = 0
        L77:
            if (r1 >= r14) goto L96
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r12 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r12 == 0) goto L94
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.f12346 = r8
            r0.f12342 = r9
            r0.f12343 = r1
            r0.f12345 = r13
            r8.m5740(r0, r2)
            return r11
        L94:
            int r1 = r1 + r10
            goto L77
        L96:
            r12 = r8
        L97:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc1
            r6 = r12
            r15 = 0
        L9d:
            if (r15 >= r14) goto Lc1
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbc
            long r1 = (long) r15
            long r4 = r4 + r1
            long r1 = (long) r14
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.f12346 = r6
            r0.f12342 = r9
            r0.f12343 = r15
            r7 = 3
            r0.f12345 = r7
            r6.m5740(r0, r1)
            return r11
        Lbc:
            r7 = 3
            r1 = r15
        Lbe:
            int r15 = r1 + 1
            goto L9d
        Lc1:
            s62 r0 = p000.s62.f9751
            return r0
    }
}
