package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class w30 extends p000.q01 implements p000.qp0 {

    /* JADX INFO: renamed from: τ */
    public p000.EnumC0297ft f11554;

    /* JADX INFO: renamed from: υ */
    public float f11555;

    @Override // p000.qp0
    /* JADX INFO: renamed from: Φ */
    public final p000.qx0 mo605(p000.dw0 r6, p000.kx0 r7, long r8) {
            r5 = this;
            boolean r0 = p000.C1028yo.m6949(r8)
            if (r0 == 0) goto L29
            ft r0 = r5.f11554
            ft r1 = p000.EnumC0297ft.f4122
            if (r0 == r1) goto L29
            int r0 = p000.C1028yo.m6953(r8)
            float r0 = (float) r0
            float r1 = r5.f11555
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r1 = p000.C1028yo.m6955(r8)
            int r2 = p000.C1028yo.m6953(r8)
            if (r0 >= r1) goto L23
            r0 = r1
        L23:
            if (r0 <= r2) goto L26
            goto L27
        L26:
            r2 = r0
        L27:
            r0 = r2
            goto L31
        L29:
            int r2 = p000.C1028yo.m6955(r8)
            int r0 = p000.C1028yo.m6953(r8)
        L31:
            boolean r1 = p000.C1028yo.m6948(r8)
            if (r1 == 0) goto L5a
            ft r1 = r5.f11554
            ft r3 = p000.EnumC0297ft.f4123
            if (r1 == r3) goto L5a
            int r1 = p000.C1028yo.m6952(r8)
            float r1 = (float) r1
            float r5 = r5.f11555
            float r1 = r1 * r5
            int r5 = java.lang.Math.round(r1)
            int r1 = p000.C1028yo.m6954(r8)
            int r8 = p000.C1028yo.m6952(r8)
            if (r5 >= r1) goto L54
            r5 = r1
        L54:
            if (r5 <= r8) goto L57
            goto L58
        L57:
            r8 = r5
        L58:
            r5 = r8
            goto L65
        L5a:
            int r5 = p000.C1028yo.m6954(r8)
            int r8 = p000.C1028yo.m6952(r8)
            r4 = r8
            r8 = r5
            r5 = r4
        L65:
            long r8 = p000.AbstractC1065zo.m7207(r2, r0, r8, r5)
            ch1 r5 = r7.mo2146(r8)
            int r7 = r5.f2115
            int r8 = r5.f2116
            v30 r9 = new v30
            r0 = 0
            r9.<init>(r5, r0)
            kz r5 = p000.C0493kz.f6332
            qx0 r5 = r6.mo1612(r7, r8, r5, r9)
            return r5
    }
}
