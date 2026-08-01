package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nx0 extends p000.bp0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7811;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.ox0 f7812;

    public /* synthetic */ nx0(p000.ox0 r1, int r2) {
            r0 = this;
            r0.f7811 = r2
            r0.f7812 = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r9 = this;
            int r0 = r9.f7811
            switch(r0) {
                case 0: goto L63;
                case 1: goto L53;
                default: goto L5;
            }
        L5:
            ox0 r9 = r9.f7812
            bq0 r0 = r9.f8329
            q31 r1 = r0.m994()
            q31 r1 = r1.f8841
            if (r1 == 0) goto L15
            ew0 r1 = r1.f3310
            if (r1 != 0) goto L1f
        L15:
            yp0 r1 = r0.f1800
            androidx.compose.ui.platform.AndroidComposeView r1 = p000.ln0.m3646(r1)
            bh1 r1 = r1.getPlacementScope()
        L1f:
            a80 r2 = r9.f8325
            r3 = 0
            if (r2 != 0) goto L3b
            q31 r0 = r0.m994()
            long r4 = r9.f8326
            r1.getClass()
            p000.bh1.m957(r1, r0)
            long r1 = r0.f2119
            long r1 = p000.um0.m5940(r4, r1)
            r9 = 0
            r0.mo1187(r1, r3, r9)
            goto L50
        L3b:
            q31 r0 = r0.m994()
            long r4 = r9.f8326
            r1.getClass()
            p000.bh1.m957(r1, r0)
            long r6 = r0.f2119
            long r4 = p000.um0.m5940(r4, r6)
            r0.mo1187(r4, r3, r2)
        L50:
            s62 r9 = p000.s62.f9751
            return r9
        L53:
            ox0 r9 = r9.f7812
            bq0 r0 = r9.f8329
            q31 r0 = r0.m994()
            long r1 = r9.f8320
            r0.mo2146(r1)
            s62 r9 = p000.s62.f9751
            return r9
        L63:
            ox0 r9 = r9.f7812
            bq0 r0 = r9.f8329
            r1 = 0
            r0.f1808 = r1
            yp0 r2 = r0.f1800
            k21 r2 = r2.m7009()
            java.lang.Object[] r3 = r2.f5716
            int r2 = r2.f5718
            r4 = r1
        L75:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 >= r2) goto L97
            r6 = r3[r4]
            yp0 r6 = (p000.yp0) r6
            bq0 r6 = r6.f12734
            ox0 r6 = r6.f1815
            int r7 = r6.f8332
            r6.f8331 = r7
            r6.f8332 = r5
            r6.f8341 = r1
            wp0 r5 = r6.f8335
            wp0 r7 = p000.wp0.f11797
            if (r5 != r7) goto L94
            wp0 r5 = p000.wp0.f11798
            r6.f8335 = r5
        L94:
            int r4 = r4 + 1
            goto L75
        L97:
            yp0 r2 = r0.f1800
            yp0 r0 = r0.f1800
            k21 r2 = r2.m7009()
            java.lang.Object[] r3 = r2.f5716
            int r2 = r2.f5718
            r4 = r1
        La4:
            if (r4 >= r2) goto Lb6
            r6 = r3[r4]
            yp0 r6 = (p000.yp0) r6
            bq0 r6 = r6.f12734
            ox0 r6 = r6.f1815
            zp0 r6 = r6.f8316
            r6.getClass()
            int r4 = r4 + 1
            goto La4
        Lb6:
            gm0 r2 = r9.mo1086()
            boolean r2 = r2.f3309
            if (r2 == 0) goto Ldb
            java.util.List r2 = r0.m6999()
            h21 r2 = (p000.h21) r2
            k21 r3 = r2.f4540
            int r3 = r3.f5718
            r4 = r1
        Lc9:
            if (r4 >= r3) goto Ldb
            java.lang.Object r6 = r2.get(r4)
            yp0 r6 = (p000.yp0) r6
            k31 r6 = r6.f12733
            q31 r6 = r6.f5727
            r7 = 1
            r6.f3309 = r7
            int r4 = r4 + 1
            goto Lc9
        Ldb:
            gm0 r2 = r9.mo1086()
            qx0 r2 = r2.mo1805()
            r2.mo1622()
            gm0 r9 = r9.mo1086()
            boolean r9 = r9.f3309
            if (r9 == 0) goto L10a
            java.util.List r9 = r0.m6999()
            h21 r9 = (p000.h21) r9
            k21 r2 = r9.f4540
            int r2 = r2.f5718
            r3 = r1
        Lf9:
            if (r3 >= r2) goto L10a
            java.lang.Object r4 = r9.get(r3)
            yp0 r4 = (p000.yp0) r4
            k31 r4 = r4.f12733
            q31 r4 = r4.f5727
            r4.f3309 = r1
            int r3 = r3 + 1
            goto Lf9
        L10a:
            k21 r9 = r0.m7009()
            java.lang.Object[] r2 = r9.f5716
            int r9 = r9.f5718
            r3 = r1
        L113:
            if (r3 >= r9) goto L14b
            r4 = r2[r3]
            yp0 r4 = (p000.yp0) r4
            bq0 r6 = r4.f12734
            ox0 r7 = r6.f1815
            int r7 = r7.f8331
            int r8 = r4.m7006()
            if (r7 == r8) goto L148
            r0.m6983()
            r0.m6972()
            int r7 = r4.m7006()
            if (r7 != r5) goto L148
            boolean r7 = r6.f1802
            if (r7 != 0) goto L13b
            boolean r4 = p000.AbstractC1021yh.m6870(r4)
            if (r4 == 0) goto L143
        L13b:
            jw0 r4 = r6.f1816
            r4.getClass()
            r4.m2991(r1)
        L143:
            ox0 r4 = r6.f1815
            r4.m4331()
        L148:
            int r3 = r3 + 1
            goto L113
        L14b:
            k21 r9 = r0.m7009()
            java.lang.Object[] r0 = r9.f5716
            int r9 = r9.f5718
            r2 = r1
        L154:
            if (r2 >= r9) goto L168
            r3 = r0[r2]
            yp0 r3 = (p000.yp0) r3
            bq0 r3 = r3.f12734
            ox0 r3 = r3.f1815
            zp0 r3 = r3.f8316
            r3.getClass()
            r3.f13240 = r1
            int r2 = r2 + 1
            goto L154
        L168:
            s62 r9 = p000.s62.f9751
            return r9
    }
}
