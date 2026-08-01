package p000;

/* JADX INFO: renamed from: zt */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1070zt implements p000.g40 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13272;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.um1 f13273;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f13274;

    public C1070zt(p000.C0053au r1, p000.um1 r2, p000.g40 r3) {
            r0 = this;
            r1 = 0
            r0.f13272 = r1
            r0.<init>()
            r0.f13273 = r2
            r0.f13274 = r3
            return
    }

    public C1070zt(p000.e80 r2, p000.um1 r3) {
            r1 = this;
            r0 = 1
            r1.f13272 = r0
            r1.<init>()
            r1.f13274 = r2
            r1.f13273 = r3
            return
    }

    @Override // p000.g40
    /* JADX INFO: renamed from: δ */
    public final java.lang.Object mo1985(java.lang.Object r6, p000.InterfaceC0631op r7) {
            r5 = this;
            int r0 = r5.f13272
            switch(r0) {
                case 0: goto L61;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof p000.n40
            if (r0 == 0) goto L18
            r0 = r7
            n40 r0 = (p000.n40) r0
            int r1 = r0.f7381
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f7381 = r1
            goto L1d
        L18:
            n40 r0 = new n40
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.f7380
            int r1 = r0.f7381
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            java.lang.Object r6 = r0.f7383
            zt r5 = r0.f7379
            p000.i81.m2649(r7)
            goto L4c
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r5)
            r5 = 0
            goto L56
        L35:
            p000.i81.m2649(r7)
            java.lang.Object r7 = r5.f13274
            e80 r7 = (p000.e80) r7
            r0.f7379 = r5
            r0.f7383 = r6
            r0.f7381 = r2
            java.lang.Object r7 = r7.invoke(r6, r0)
            cq r0 = p000.EnumC0184cq.f2716
            if (r7 != r0) goto L4c
            r5 = r0
            goto L56
        L4c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L57
            s62 r5 = p000.s62.f9751
        L56:
            return r5
        L57:
            um1 r7 = r5.f13273
            r7.f10912 = r6
            δ r6 = new δ
            r6.<init>(r5)
            throw r6
        L61:
            boolean r0 = r7 instanceof p000.C1033yt
            if (r0 == 0) goto L74
            r0 = r7
            yt r0 = (p000.C1033yt) r0
            int r1 = r0.f12782
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L74
            int r1 = r1 - r2
            r0.f12782 = r1
            goto L79
        L74:
            yt r0 = new yt
            r0.<init>(r5, r7)
        L79:
            java.lang.Object r7 = r0.f12780
            int r1 = r0.f12782
            s62 r2 = p000.s62.f9751
            r3 = 1
            if (r1 == 0) goto L8f
            if (r1 != r3) goto L88
            p000.i81.m2649(r7)
            goto Lb1
        L88:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r5)
            r2 = 0
            goto Lb1
        L8f:
            p000.i81.m2649(r7)
            um1 r7 = r5.f13273
            java.lang.Object r1 = r7.f10912
            uy r4 = p000.AbstractC0978xb.f12108
            if (r1 == r4) goto La0
            boolean r1 = p000.ln0.m3626(r1, r6)
            if (r1 != 0) goto Lb1
        La0:
            r7.f10912 = r6
            java.lang.Object r5 = r5.f13274
            g40 r5 = (p000.g40) r5
            r0.f12782 = r3
            java.lang.Object r5 = r5.mo1985(r6, r0)
            cq r6 = p000.EnumC0184cq.f2716
            if (r5 != r6) goto Lb1
            r2 = r6
        Lb1:
            return r2
    }
}
