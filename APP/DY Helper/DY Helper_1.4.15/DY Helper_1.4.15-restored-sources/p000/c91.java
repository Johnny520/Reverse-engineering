package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class c91 extends p000.q01 implements p000.qp0 {

    /* JADX INFO: renamed from: τ */
    public float f2016;

    /* JADX INFO: renamed from: υ */
    public float f2017;

    /* JADX INFO: renamed from: φ */
    public float f2018;

    /* JADX INFO: renamed from: χ */
    public float f2019;

    /* JADX INFO: renamed from: ψ */
    public boolean f2020;

    @Override // p000.qp0
    /* JADX INFO: renamed from: Φ */
    public final p000.qx0 mo605(p000.dw0 r10, p000.kx0 r11, long r12) {
            r9 = this;
            float r0 = r9.f2016
            int r0 = r10.mo583(r0)
            float r1 = r9.f2018
            int r1 = r10.mo583(r1)
            int r1 = r1 + r0
            float r0 = r9.f2017
            int r0 = r10.mo583(r0)
            float r2 = r9.f2019
            int r2 = r10.mo583(r2)
            int r2 = r2 + r0
            int r0 = -r1
            int r3 = -r2
            int r4 = p000.C1028yo.m6955(r12)
            int r4 = r4 + r0
            r5 = 0
            if (r4 >= 0) goto L25
            r4 = r5
        L25:
            int r6 = p000.C1028yo.m6953(r12)
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 != r7) goto L2f
            goto L33
        L2f:
            int r6 = r6 + r0
            if (r6 >= 0) goto L33
            r6 = r5
        L33:
            int r0 = p000.C1028yo.m6954(r12)
            int r0 = r0 + r3
            if (r0 >= 0) goto L3b
            r0 = r5
        L3b:
            int r8 = p000.C1028yo.m6952(r12)
            if (r8 != r7) goto L43
        L41:
            r5 = r8
            goto L46
        L43:
            int r8 = r8 + r3
            if (r8 >= 0) goto L41
        L46:
            long r3 = p000.AbstractC1065zo.m7207(r4, r6, r0, r5)
            ch1 r11 = r11.mo2146(r3)
            int r0 = r11.f2115
            int r0 = r0 + r1
            int r0 = p000.AbstractC1065zo.m7212(r0, r12)
            int r1 = r11.f2116
            int r1 = r1 + r2
            int r12 = p000.AbstractC1065zo.m7211(r1, r12)
            wa r13 = new wa
            r1 = 24
            r13.<init>(r9, r1, r11)
            kz r9 = p000.C0493kz.f6332
            qx0 r9 = r10.mo1612(r0, r12, r9, r13)
            return r9
    }
}
