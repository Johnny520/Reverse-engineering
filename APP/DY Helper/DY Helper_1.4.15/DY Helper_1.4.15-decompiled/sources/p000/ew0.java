package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ew0 extends p000.bh1 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3677;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f3678;

    public /* synthetic */ ew0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f3677 = r1
            r0.f3678 = r2
            r0.<init>()
            return
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: β */
    public final float mo586() {
            r1 = this;
            int r0 = r1.f3677
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f3678
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.p001ui.platform.AndroidComposeView) r1
            yr r1 = r1.getDensity()
            float r1 = r1.mo586()
            return r1
        L12:
            java.lang.Object r1 = r1.f3678
            dw0 r1 = (p000.dw0) r1
            float r1 = r1.mo586()
            return r1
    }

    @Override // p000.bh1
    /* JADX INFO: renamed from: δ */
    public float mo962(p000.te0 r8) {
            r7 = this;
            int r0 = r7.f3677
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            float r7 = super.mo962(r8)
            return r7
        La:
            e80 r0 = r8.f10344
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L20
            java.lang.Float r8 = java.lang.Float.valueOf(r1)
            java.lang.Object r7 = r0.invoke(r7, r8)
            java.lang.Number r7 = (java.lang.Number) r7
            float r1 = r7.floatValue()
            goto Lbd
        L20:
            java.lang.Object r7 = r7.f3678
            dw0 r7 = (p000.dw0) r7
            boolean r0 = r7.f3309
            if (r0 == 0) goto L2a
            goto Lbd
        L2a:
            r0 = r7
        L2b:
            o4 r2 = r0.f3311
            if (r2 == 0) goto L41
            java.lang.Object r3 = r2.f7940
            te0[] r3 = (p000.te0[]) r3
            int r3 = p000.AbstractC0312g7.m2254(r3, r8)
            if (r3 >= 0) goto L3a
            goto L41
        L3a:
            java.lang.Object r2 = r2.f7941
            float[] r2 = (float[]) r2
            r2 = r2[r3]
            goto L42
        L41:
            r2 = r1
        L42:
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 != 0) goto Lb0
            yp0 r1 = r7.mo1804()
            r0.m1811(r1, r8)
            mp0 r0 = r0.mo1817()
            mp0 r7 = r7.mo1817()
            int r8 = r8.f10345
            switch(r8) {
                case 0: goto L87;
                default: goto L5c;
            }
        L5c:
            long r3 = r0.mo2338()
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r8 = (int) r3
            float r8 = (float) r8
            r1 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r1
            int r1 = java.lang.Float.floatToRawIntBits(r2)
            long r1 = (long) r1
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r3 = (long) r8
            r8 = 32
            long r1 = r1 << r8
            long r3 = r3 & r5
            long r1 = r1 | r3
            long r0 = r7.mo2330(r0, r1)
            long r7 = r0 >> r8
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
        L85:
            r1 = r7
            goto Lbd
        L87:
            long r3 = r0.mo2338()
            r8 = 32
            long r3 = r3 >> r8
            int r1 = (int) r3
            float r1 = (float) r1
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r3 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r2)
            long r1 = (long) r1
            long r3 = r3 << r8
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            long r1 = r1 | r3
            long r7 = r7.mo2330(r0, r1)
            long r7 = r7 & r5
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            goto L85
        Lb0:
            dw0 r2 = r0.mo1806()
            if (r2 != 0) goto Lbe
            yp0 r7 = r7.mo1804()
            r0.m1811(r7, r8)
        Lbd:
            return r1
        Lbe:
            r0 = r2
            goto L2b
    }

    @Override // p000.bh1
    /* JADX INFO: renamed from: ζ */
    public final p000.np0 mo963() {
            r1 = this;
            int r0 = r1.f3677
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f3678
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.p001ui.platform.AndroidComposeView) r1
            np0 r1 = r1.getLayoutDirection()
            return r1
        Le:
            java.lang.Object r1 = r1.f3678
            dw0 r1 = (p000.dw0) r1
            np0 r1 = r1.getLayoutDirection()
            return r1
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: θ */
    public final float mo590() {
            r1 = this;
            int r0 = r1.f3677
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f3678
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.p001ui.platform.AndroidComposeView) r1
            yr r1 = r1.getDensity()
            float r1 = r1.mo590()
            return r1
        L12:
            java.lang.Object r1 = r1.f3678
            dw0 r1 = (p000.dw0) r1
            float r1 = r1.mo590()
            return r1
    }

    @Override // p000.bh1
    /* JADX INFO: renamed from: ι */
    public final int mo964() {
            r1 = this;
            int r0 = r1.f3677
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f3678
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.p001ui.platform.AndroidComposeView) r1
            yp0 r1 = r1.getRoot()
            bq0 r1 = r1.f12734
            ox0 r1 = r1.f1815
            int r1 = r1.f2115
            return r1
        L14:
            java.lang.Object r1 = r1.f3678
            dw0 r1 = (p000.dw0) r1
            int r1 = r1.mo1185()
            return r1
    }
}
