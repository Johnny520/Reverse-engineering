package p000;

/* JADX INFO: renamed from: pe */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0684pe extends p000.y12 implements p000.e80 {

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ int f8530;

    /* JADX INFO: renamed from: κ */
    public int f8531;

    /* JADX INFO: renamed from: λ */
    public /* synthetic */ java.lang.Object f8532;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ p000.C0795se f8533;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ p000.g40 f8534;

    public C0684pe(p000.C0795se r2, p000.g40 r3, java.lang.Object r4, p000.InterfaceC0631op r5) {
            r1 = this;
            r0 = 0
            r1.f8530 = r0
            r1.f8533 = r2
            r1.f8534 = r3
            r1.f8532 = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    public C0684pe(p000.C0795se r2, p000.g40 r3, p000.InterfaceC0631op r4) {
            r1 = this;
            r0 = 1
            r1.f8530 = r0
            r1.f8533 = r2
            r1.f8534 = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f8530
            bq r2 = (p000.InterfaceC0086bq) r2
            op r3 = (p000.InterfaceC0631op) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            op r1 = r1.mo1119(r3, r2)
            pe r1 = (p000.C0684pe) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
        L16:
            op r1 = r1.mo1119(r3, r2)
            pe r1 = (p000.C0684pe) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f8530
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            pe r0 = new pe
            se r1 = r2.f8533
            g40 r2 = r2.f8534
            r0.<init>(r1, r2, r3)
            r0.f8532 = r4
            return r0
        L11:
            pe r4 = new pe
            g40 r0 = r2.f8534
            java.lang.Object r1 = r2.f8532
            se r2 = r2.f8533
            r4.<init>(r2, r0, r1, r3)
            return r4
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f8530
            switch(r0) {
                case 0: goto L3d;
                default: goto L5;
            }
        L5:
            int r0 = r6.f8531
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto L10
            p000.i81.m2649(r7)
            goto L3a
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r6)
            r6 = 0
            goto L3c
        L17:
            p000.i81.m2649(r7)
            java.lang.Object r7 = r6.f8532
            bq r7 = (p000.InterfaceC0086bq) r7
            um1 r0 = new um1
            r0.<init>()
            se r2 = r6.f8533
            f40 r3 = r2.f9871
            re r4 = new re
            g40 r5 = r6.f8534
            r4.<init>(r0, r7, r2, r5)
            r6.f8531 = r1
            java.lang.Object r6 = r3.mo601(r4, r6)
            cq r7 = p000.EnumC0184cq.f2716
            if (r6 != r7) goto L3a
            r6 = r7
            goto L3c
        L3a:
            s62 r6 = p000.s62.f9751
        L3c:
            return r6
        L3d:
            int r0 = r6.f8531
            r1 = 1
            if (r0 == 0) goto L4f
            if (r0 != r1) goto L48
            p000.i81.m2649(r7)
            goto L66
        L48:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r6)
            r6 = 0
            goto L68
        L4f:
            p000.i81.m2649(r7)
            se r7 = r6.f8533
            y12 r7 = r7.f9872
            java.lang.Object r0 = r6.f8532
            r6.f8531 = r1
            g40 r1 = r6.f8534
            java.lang.Object r6 = r7.mo10(r1, r0, r6)
            cq r7 = p000.EnumC0184cq.f2716
            if (r6 != r7) goto L66
            r6 = r7
            goto L68
        L66:
            s62 r6 = p000.s62.f9751
        L68:
            return r6
    }
}
