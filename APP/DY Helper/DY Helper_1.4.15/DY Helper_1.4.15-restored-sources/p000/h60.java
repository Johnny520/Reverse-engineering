package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class h60 extends p000.do1 implements p000.e80 {

    /* JADX INFO: renamed from: η */
    public int f4583;

    /* JADX INFO: renamed from: θ */
    public /* synthetic */ java.lang.Object f4584;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ p000.InterfaceC0880up f4585;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ p000.do1 f4586;

    public h60(p000.InterfaceC0880up r1, p000.e80 r2, p000.InterfaceC0631op r3) {
            r0 = this;
            r0.f4585 = r1
            do1 r2 = (p000.do1) r2
            r0.f4586 = r2
            r0.<init>(r3)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            d22 r1 = (p000.d22) r1
            op r2 = (p000.InterfaceC0631op) r2
            op r0 = r0.mo1119(r2, r1)
            h60 r0 = (p000.h60) r0
            s62 r1 = p000.s62.f9751
            java.lang.Object r0 = r0.mo11(r1)
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r3, java.lang.Object r4) {
            r2 = this;
            h60 r0 = new h60
            up r1 = r2.f4585
            do1 r2 = r2.f4586
            r0.<init>(r1, r2, r3)
            r0.f4584 = r4
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f4583
            wh1 r1 = p000.wh1.f11722
            up r2 = r9.f4585
            r3 = 3
            r4 = 2
            r5 = 1
            cq r6 = p000.EnumC0184cq.f2716
            if (r0 == 0) goto L35
            if (r0 == r5) goto L2d
            if (r0 == r4) goto L22
            if (r0 != r3) goto L1b
            java.lang.Object r0 = r9.f4584
            d22 r0 = (p000.d22) r0
            p000.i81.m2649(r10)
            goto L29
        L1b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r9)
            r9 = 0
            return r9
        L22:
            java.lang.Object r0 = r9.f4584
            d22 r0 = (p000.d22) r0
            p000.i81.m2649(r10)     // Catch: java.util.concurrent.CancellationException -> L2b
        L29:
            r10 = r0
            goto L3c
        L2b:
            r10 = move-exception
            goto L5f
        L2d:
            java.lang.Object r0 = r9.f4584
            d22 r0 = (p000.d22) r0
            p000.i81.m2649(r10)     // Catch: java.util.concurrent.CancellationException -> L2b
            goto L50
        L35:
            p000.i81.m2649(r10)
            java.lang.Object r10 = r9.f4584
            d22 r10 = (p000.d22) r10
        L3c:
            boolean r0 = p000.AbstractC1021yh.m6867(r2)
            if (r0 == 0) goto L71
            do1 r0 = r9.f4586     // Catch: java.util.concurrent.CancellationException -> L5b
            r9.f4584 = r10     // Catch: java.util.concurrent.CancellationException -> L5b
            r9.f4583 = r5     // Catch: java.util.concurrent.CancellationException -> L5b
            java.lang.Object r0 = r0.invoke(r10, r9)     // Catch: java.util.concurrent.CancellationException -> L5b
            if (r0 != r6) goto L4f
            goto L6f
        L4f:
            r0 = r10
        L50:
            r9.f4584 = r0     // Catch: java.util.concurrent.CancellationException -> L2b
            r9.f4583 = r4     // Catch: java.util.concurrent.CancellationException -> L2b
            java.lang.Object r10 = p000.pd2.m4485(r0, r1, r9)     // Catch: java.util.concurrent.CancellationException -> L2b
            if (r10 != r6) goto L29
            goto L6f
        L5b:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        L5f:
            boolean r7 = p000.AbstractC1021yh.m6867(r2)
            if (r7 == 0) goto L70
            r9.f4584 = r0
            r9.f4583 = r3
            java.lang.Object r10 = p000.pd2.m4485(r0, r1, r9)
            if (r10 != r6) goto L29
        L6f:
            return r6
        L70:
            throw r10
        L71:
            s62 r9 = p000.s62.f9751
            return r9
    }
}
