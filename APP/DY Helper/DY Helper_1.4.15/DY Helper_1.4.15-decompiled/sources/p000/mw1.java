package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class mw1 extends p000.do1 implements p000.e80 {

    /* JADX INFO: renamed from: η */
    public java.lang.Object f7298;

    /* JADX INFO: renamed from: θ */
    public java.util.Iterator f7299;

    /* JADX INFO: renamed from: ι */
    public int f7300;

    /* JADX INFO: renamed from: κ */
    public int f7301;

    /* JADX INFO: renamed from: λ */
    public int f7302;

    /* JADX INFO: renamed from: μ */
    public /* synthetic */ java.lang.Object f7303;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ int f7304;

    /* JADX INFO: renamed from: ξ */
    public final /* synthetic */ int f7305;

    /* JADX INFO: renamed from: ο */
    public final /* synthetic */ java.util.Iterator f7306;

    public mw1(int r1, int r2, java.util.Iterator r3, p000.InterfaceC0631op r4) {
            r0 = this;
            r0.f7304 = r1
            r0.f7305 = r2
            r0.f7306 = r3
            r0.<init>(r4)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ts1 r1 = (p000.ts1) r1
            op r2 = (p000.InterfaceC0631op) r2
            op r0 = r0.mo1119(r2, r1)
            mw1 r0 = (p000.mw1) r0
            s62 r1 = p000.s62.f9751
            java.lang.Object r0 = r0.mo11(r1)
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r4, java.lang.Object r5) {
            r3 = this;
            mw1 r0 = new mw1
            int r1 = r3.f7305
            java.util.Iterator r2 = r3.f7306
            int r3 = r3.f7304
            r0.<init>(r3, r1, r2, r4)
            r0.f7303 = r5
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            java.lang.Object r1 = r0.f7303
            ts1 r1 = (p000.ts1) r1
            int r2 = r0.f7302
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            int r7 = r0.f7305
            r8 = 1
            int r9 = r0.f7304
            r10 = 0
            cq r11 = p000.EnumC0184cq.f2716
            if (r2 == 0) goto L6b
            if (r2 == r8) goto L57
            if (r2 == r6) goto L52
            if (r2 == r5) goto L40
            if (r2 == r4) goto L30
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.f7298
            ro1 r0 = (p000.ro1) r0
        L24:
            p000.i81.m2649(r20)
            goto L16c
        L29:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r0)
        L2e:
            r0 = 0
            return r0
        L30:
            int r2 = r0.f7301
            int r5 = r0.f7300
            java.lang.Object r6 = r0.f7298
            ro1 r6 = (p000.ro1) r6
            p000.i81.m2649(r20)
            r6.m5118(r7)
            goto L13c
        L40:
            int r2 = r0.f7301
            int r6 = r0.f7300
            java.util.Iterator r12 = r0.f7299
            java.lang.Object r13 = r0.f7298
            ro1 r13 = (p000.ro1) r13
            p000.i81.m2649(r20)
            r13.m5118(r7)
            goto Lcf
        L52:
            java.lang.Object r0 = r0.f7298
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            goto L24
        L57:
            int r2 = r0.f7301
            int r3 = r0.f7300
            java.util.Iterator r4 = r0.f7299
            java.lang.Object r5 = r0.f7298
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            p000.i81.m2649(r20)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r9)
            r12 = r2
            goto L83
        L6b:
            p000.i81.m2649(r20)
            r2 = 1024(0x400, float:1.435E-42)
            if (r9 <= r2) goto L73
            goto L74
        L73:
            r2 = r9
        L74:
            int r12 = r7 - r9
            java.util.Iterator r13 = r0.f7306
            r14 = 0
            if (r12 < 0) goto Lc1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
            r3 = r2
            r4 = r13
            r2 = r14
        L83:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto Lab
            java.lang.Object r7 = r4.next()
            if (r2 <= 0) goto L92
            int r2 = r2 + (-1)
            goto L83
        L92:
            r5.add(r7)
            int r7 = r5.size()
            if (r7 != r9) goto L83
            r0.f7303 = r1
            r0.f7298 = r5
            r0.f7299 = r4
            r0.f7300 = r3
            r0.f7301 = r12
            r0.f7302 = r8
            r1.m5740(r0, r5)
            return r11
        Lab:
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L16c
            r0.f7303 = r10
            r0.f7298 = r10
            r0.f7299 = r10
            r0.f7300 = r3
            r0.f7301 = r12
            r0.f7302 = r6
            r1.m5740(r0, r5)
            return r11
        Lc1:
            ro1 r6 = new ro1
            java.lang.Object[] r15 = new java.lang.Object[r2]
            r6.<init>(r14, r15)
            r18 = r6
            r6 = r2
            r2 = r12
            r12 = r13
            r13 = r18
        Lcf:
            int r14 = r13.f9427
            java.lang.Object[] r15 = r13.f9426
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L13a
            java.lang.Object r16 = r12.next()
            r17 = r8
            int r8 = r13.mo2340()
            if (r8 == r14) goto L133
            int r8 = r13.f9428
            int r3 = r13.f9429
            int r8 = r8 + r3
            int r8 = r8 % r14
            r15[r8] = r16
            int r3 = r3 + 1
            r13.f9429 = r3
            int r3 = r13.mo2340()
            if (r3 != r14) goto L11a
            int r3 = r13.f9429
            if (r3 >= r9) goto L11e
            int r3 = r14 >> 1
            int r14 = r14 + r3
            int r14 = r14 + 1
            if (r14 <= r9) goto L103
            r14 = r9
        L103:
            int r3 = r13.f9428
            if (r3 != 0) goto L10c
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r15, r14)
            goto L112
        L10c:
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.Object[] r3 = r13.toArray(r3)
        L112:
            ro1 r8 = new ro1
            int r13 = r13.f9429
            r8.<init>(r13, r3)
            r13 = r8
        L11a:
            r8 = r17
            r3 = 5
            goto Lcf
        L11e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r13)
            r0.f7303 = r1
            r0.f7298 = r13
            r0.f7299 = r12
            r0.f7300 = r6
            r0.f7301 = r2
            r0.f7302 = r5
            r1.m5740(r0, r3)
            return r11
        L133:
            java.lang.String r0 = "ring buffer is full"
            p000.C1080.m7279(r0)
            goto L2e
        L13a:
            r5 = r6
            r6 = r13
        L13c:
            int r3 = r6.f9429
            if (r3 <= r7) goto L155
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r6)
            r0.f7303 = r1
            r0.f7298 = r6
            r0.f7299 = r10
            r0.f7300 = r5
            r0.f7301 = r2
            r0.f7302 = r4
            r1.m5740(r0, r3)
            return r11
        L155:
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L16c
            r0.f7303 = r10
            r0.f7298 = r10
            r0.f7299 = r10
            r0.f7300 = r5
            r0.f7301 = r2
            r2 = 5
            r0.f7302 = r2
            r1.m5740(r0, r6)
            return r11
        L16c:
            s62 r0 = p000.s62.f9751
            return r0
    }
}
