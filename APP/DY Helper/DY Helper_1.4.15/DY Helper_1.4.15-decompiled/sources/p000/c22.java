package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class c22 extends p000.y12 implements p000.e80 {

    /* JADX INFO: renamed from: ι */
    public int f1946;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ long f1947;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ p000.d22 f1948;

    public c22(long r1, p000.d22 r3, p000.InterfaceC0631op r4) {
            r0 = this;
            r0.f1947 = r1
            r0.f1948 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            bq r1 = (p000.InterfaceC0086bq) r1
            op r2 = (p000.InterfaceC0631op) r2
            op r0 = r0.mo1119(r2, r1)
            c22 r0 = (p000.c22) r0
            s62 r1 = p000.s62.f9751
            java.lang.Object r0 = r0.mo11(r1)
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r3, java.lang.Object r4) {
            r2 = this;
            c22 r4 = new c22
            long r0 = r2.f1947
            d22 r2 = r2.f1948
            r4.<init>(r0, r2, r3)
            return r4
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f1946
            r1 = 8
            long r3 = r10.f1947
            r5 = 2
            r6 = 1
            cq r7 = p000.EnumC0184cq.f2716
            if (r0 == 0) goto L1f
            if (r0 == r6) goto L1b
            if (r0 != r5) goto L14
            p000.i81.m2649(r11)
            goto L36
        L14:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r10)
            r10 = 0
            return r10
        L1b:
            p000.i81.m2649(r11)
            goto L2d
        L1f:
            p000.i81.m2649(r11)
            long r8 = r3 - r1
            r10.f1946 = r6
            java.lang.Object r11 = p000.jx0.m3053(r8, r10)
            if (r11 != r7) goto L2d
            goto L35
        L2d:
            r10.f1946 = r5
            java.lang.Object r11 = p000.jx0.m3053(r1, r10)
            if (r11 != r7) goto L36
        L35:
            return r7
        L36:
            d22 r10 = r10.f1948
            ae r10 = r10.f2864
            if (r10 == 0) goto L49
            xh1 r11 = new xh1
            r11.<init>(r3)
            eo1 r0 = new eo1
            r0.<init>(r11)
            r10.mo75(r0)
        L49:
            s62 r10 = p000.s62.f9751
            return r10
    }
}
