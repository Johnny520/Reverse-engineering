package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class x11 extends p000.do1 implements p000.e80 {

    /* JADX INFO: renamed from: η */
    public p000.f90 f11985;

    /* JADX INFO: renamed from: θ */
    public p000.y11 f11986;

    /* JADX INFO: renamed from: ι */
    public long[] f11987;

    /* JADX INFO: renamed from: κ */
    public int f11988;

    /* JADX INFO: renamed from: λ */
    public int f11989;

    /* JADX INFO: renamed from: μ */
    public /* synthetic */ java.lang.Object f11990;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ p000.y11 f11991;

    /* JADX INFO: renamed from: ξ */
    public final /* synthetic */ p000.f90 f11992;

    public x11(p000.y11 r1, p000.f90 r2, p000.InterfaceC0631op r3) {
            r0 = this;
            r0.f11991 = r1
            r0.f11992 = r2
            r0.<init>(r3)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ts1 r1 = (p000.ts1) r1
            op r2 = (p000.InterfaceC0631op) r2
            op r0 = r0.mo1119(r2, r1)
            x11 r0 = (p000.x11) r0
            s62 r1 = p000.s62.f9751
            java.lang.Object r0 = r0.mo11(r1)
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r3, java.lang.Object r4) {
            r2 = this;
            x11 r0 = new x11
            y11 r1 = r2.f11991
            f90 r2 = r2.f11992
            r0.<init>(r1, r2, r3)
            r0.f11990 = r4
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f11989
            r1 = 1
            if (r0 == 0) goto L1e
            if (r0 != r1) goto L17
            int r0 = r10.f11988
            long[] r2 = r10.f11987
            y11 r3 = r10.f11986
            f90 r4 = r10.f11985
            java.lang.Object r5 = r10.f11990
            ts1 r5 = (p000.ts1) r5
            p000.i81.m2649(r11)
            goto L30
        L17:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r10)
            r10 = 0
            return r10
        L1e:
            p000.i81.m2649(r11)
            java.lang.Object r11 = r10.f11990
            r5 = r11
            ts1 r5 = (p000.ts1) r5
            y11 r3 = r10.f11991
            w11 r11 = r3.f12426
            long[] r2 = r11.f11521
            int r0 = r11.f11523
            f90 r4 = r10.f11992
        L30:
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r11) goto L59
            r6 = r2[r0]
            r11 = 31
            long r6 = r6 >> r11
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r6 = r6 & r8
            int r11 = (int) r6
            r4.f3829 = r0
            w11 r6 = r3.f12426
            java.lang.Object[] r6 = r6.f11520
            r0 = r6[r0]
            r10.f11990 = r5
            r10.f11985 = r4
            r10.f11986 = r3
            r10.f11987 = r2
            r10.f11988 = r11
            r10.f11989 = r1
            r5.m5740(r10, r0)
            cq r10 = p000.EnumC0184cq.f2716
            return r10
        L59:
            s62 r10 = p000.s62.f9751
            return r10
    }
}
