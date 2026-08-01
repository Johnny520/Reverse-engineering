package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class iw0 extends p000.bp0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5218;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.jw0 f5219;

    public /* synthetic */ iw0(p000.jw0 r1, int r2) {
            r0 = this;
            r0.f5218 = r2
            r0.f5219 = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r8 = this;
            int r0 = r8.f5218
            switch(r0) {
                case 0: goto L67;
                case 1: goto L1c;
                default: goto L5;
            }
        L5:
            jw0 r8 = r8.f5219
            bq0 r0 = r8.f5600
            q31 r0 = r0.m994()
            fw0 r0 = r0.mo2314()
            r0.getClass()
            long r1 = r8.f5596
            r0.mo2146(r1)
            s62 r8 = p000.s62.f9751
            return r8
        L1c:
            jw0 r8 = r8.f5219
            bq0 r0 = r8.f5600
            yp0 r1 = r0.f1800
            boolean r1 = p000.AbstractC1021yh.m6870(r1)
            r2 = 0
            if (r1 != 0) goto L3e
            boolean r1 = r0.f1802
            if (r1 != 0) goto L3e
            q31 r1 = r0.m994()
            q31 r1 = r1.f8841
            if (r1 == 0) goto L48
            fw0 r1 = r1.mo2314()
            if (r1 == 0) goto L48
            ew0 r2 = r1.f3310
            goto L48
        L3e:
            q31 r1 = r0.m994()
            q31 r1 = r1.f8841
            if (r1 == 0) goto L48
            ew0 r2 = r1.f3310
        L48:
            if (r2 != 0) goto L54
            yp0 r1 = r0.f1800
            androidx.compose.ui.platform.AndroidComposeView r1 = p000.ln0.m3646(r1)
            bh1 r2 = r1.getPlacementScope()
        L54:
            q31 r0 = r0.m994()
            fw0 r0 = r0.mo2314()
            r0.getClass()
            long r3 = r8.f5608
            p000.bh1.m959(r2, r0, r3)
            s62 r8 = p000.s62.f9751
            return r8
        L67:
            jw0 r8 = r8.f5219
            bq0 r0 = r8.f5600
            r1 = 0
            r0.f1807 = r1
            yp0 r2 = r0.f1800
            k21 r2 = r2.m7009()
            java.lang.Object[] r3 = r2.f5716
            int r2 = r2.f5718
            r4 = r1
        L79:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 >= r2) goto L9c
            r6 = r3[r4]
            yp0 r6 = (p000.yp0) r6
            bq0 r6 = r6.f12734
            jw0 r6 = r6.f1816
            r6.getClass()
            int r7 = r6.f5603
            r6.f5602 = r7
            r6.f5603 = r5
            wp0 r5 = r6.f5604
            wp0 r7 = p000.wp0.f11797
            if (r5 != r7) goto L99
            wp0 r5 = p000.wp0.f11798
            r6.f5604 = r5
        L99:
            int r4 = r4 + 1
            goto L79
        L9c:
            yp0 r2 = r0.f1800
            yp0 r0 = r0.f1800
            k21 r2 = r2.m7009()
            java.lang.Object[] r3 = r2.f5716
            int r2 = r2.f5718
            r4 = r1
        La9:
            if (r4 >= r2) goto Lbe
            r6 = r3[r4]
            yp0 r6 = (p000.yp0) r6
            bq0 r6 = r6.f12734
            jw0 r6 = r6.f1816
            r6.getClass()
            zp0 r6 = r6.f5611
            r6.getClass()
            int r4 = r4 + 1
            goto La9
        Lbe:
            gm0 r2 = r8.mo1086()
            fm0 r2 = r2.f4420
            if (r2 == 0) goto Lea
            boolean r2 = r2.f3309
            java.util.List r3 = r0.m6999()
            h21 r3 = (p000.h21) r3
            k21 r4 = r3.f4540
            int r4 = r4.f5718
            r6 = r1
        Ld3:
            if (r6 >= r4) goto Lea
            java.lang.Object r7 = r3.get(r6)
            yp0 r7 = (p000.yp0) r7
            k31 r7 = r7.f12733
            q31 r7 = r7.f5727
            fw0 r7 = r7.mo2314()
            if (r7 == 0) goto Le7
            r7.f3309 = r2
        Le7:
            int r6 = r6 + 1
            goto Ld3
        Lea:
            gm0 r2 = r8.mo1086()
            fm0 r2 = r2.f4420
            r2.getClass()
            qx0 r2 = r2.mo1805()
            r2.mo1622()
            gm0 r8 = r8.mo1086()
            fm0 r8 = r8.f4420
            if (r8 == 0) goto L124
            java.util.List r8 = r0.m6999()
            h21 r8 = (p000.h21) r8
            k21 r2 = r8.f4540
            int r2 = r2.f5718
            r3 = r1
        L10d:
            if (r3 >= r2) goto L124
            java.lang.Object r4 = r8.get(r3)
            yp0 r4 = (p000.yp0) r4
            k31 r4 = r4.f12733
            q31 r4 = r4.f5727
            fw0 r4 = r4.mo2314()
            if (r4 == 0) goto L121
            r4.f3309 = r1
        L121:
            int r3 = r3 + 1
            goto L10d
        L124:
            k21 r8 = r0.m7009()
            java.lang.Object[] r2 = r8.f5716
            int r8 = r8.f5718
            r3 = r1
        L12d:
            if (r3 >= r8) goto L149
            r4 = r2[r3]
            yp0 r4 = (p000.yp0) r4
            bq0 r4 = r4.f12734
            jw0 r4 = r4.f1816
            r4.getClass()
            int r6 = r4.f5602
            int r7 = r4.f5603
            if (r6 == r7) goto L146
            if (r7 != r5) goto L146
            r6 = 1
            r4.m2991(r6)
        L146:
            int r3 = r3 + 1
            goto L12d
        L149:
            k21 r8 = r0.m7009()
            java.lang.Object[] r0 = r8.f5716
            int r8 = r8.f5718
            r2 = r1
        L152:
            if (r2 >= r8) goto L169
            r3 = r0[r2]
            yp0 r3 = (p000.yp0) r3
            bq0 r3 = r3.f12734
            jw0 r3 = r3.f1816
            r3.getClass()
            zp0 r3 = r3.f5611
            r3.getClass()
            r3.f13240 = r1
            int r2 = r2 + 1
            goto L152
        L169:
            s62 r8 = p000.s62.f9751
            return r8
    }
}
