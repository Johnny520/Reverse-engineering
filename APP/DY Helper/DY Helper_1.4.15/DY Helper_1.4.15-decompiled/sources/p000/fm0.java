package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fm0 extends p000.fw0 {
    @Override // p000.kx0
    /* JADX INFO: renamed from: ζ */
    public final p000.ch1 mo2146(long r7) {
            r6 = this;
            r6.m1189(r7)
            q31 r0 = r6.f4149
            yp0 r1 = r0.f8839
            k21 r1 = r1.m7009()
            java.lang.Object[] r2 = r1.f5716
            int r1 = r1.f5718
            r3 = 0
        L10:
            if (r3 >= r1) goto L24
            r4 = r2[r3]
            yp0 r4 = (p000.yp0) r4
            bq0 r4 = r4.f12734
            jw0 r4 = r4.f1816
            r4.getClass()
            wp0 r5 = p000.wp0.f11798
            r4.f5604 = r5
            int r3 = r3 + 1
            goto L10
        L24:
            yp0 r0 = r0.f8839
            px0 r1 = r0.f12725
            java.util.List r0 = r0.m6998()
            qx0 r7 = r1.mo1688(r6, r0, r7)
            p000.fw0.m2208(r6, r7)
            return r6
    }

    @Override // p000.fw0
    /* JADX INFO: renamed from: Л */
    public final void mo2147() {
            r0 = this;
            q31 r0 = r0.f4149
            yp0 r0 = r0.f8839
            bq0 r0 = r0.f12734
            jw0 r0 = r0.f1816
            r0.getClass()
            r0.m2994()
            return
    }

    @Override // p000.dw0
    /* JADX INFO: renamed from: ч */
    public final int mo1812(p000.re0 r7) {
            r6 = this;
            q31 r0 = r6.f4149
            yp0 r0 = r0.f8839
            bq0 r0 = r0.f12734
            jw0 r0 = r0.f1816
            r0.getClass()
            bq0 r1 = r0.f5600
            up0 r2 = r1.f1803
            zp0 r3 = r0.f5611
            r4 = 1
            up0 r5 = p000.up0.f10920
            if (r2 != r5) goto L21
            r3.f13241 = r4
            boolean r2 = r3.f13239
            if (r2 == 0) goto L23
            r1.f1805 = r4
            r1.f1806 = r4
            goto L23
        L21:
            r3.f13242 = r4
        L23:
            gm0 r1 = r0.mo1086()
            fm0 r1 = r1.f4420
            if (r1 == 0) goto L2d
            r1.f3309 = r4
        L2d:
            r0.mo1088()
            gm0 r0 = r0.mo1086()
            fm0 r0 = r0.f4420
            if (r0 == 0) goto L3b
            r1 = 0
            r0.f3309 = r1
        L3b:
            java.util.HashMap r0 = r3.f13244
            java.lang.Object r0 = r0.get(r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L4a
            int r0 = r0.intValue()
            goto L4c
        L4a:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L4c:
            u11 r6 = r6.f4154
            r6.m5779(r0, r7)
            return r0
    }
}
