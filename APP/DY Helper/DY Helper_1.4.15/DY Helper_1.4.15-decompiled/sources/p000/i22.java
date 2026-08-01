package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class i22 extends p000.wb2 {

    /* JADX INFO: renamed from: ζ */
    public final java.util.HashMap f4883;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ androidx.core.view.insets.C0044 f4884;

    public i22(androidx.core.view.insets.C0044 r1) {
            r0 = this;
            r0.f4884 = r1
            r1 = 0
            r0.<init>(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f4883 = r1
            return
    }

    @Override // p000.wb2
    /* JADX INFO: renamed from: α */
    public final void mo2608(p000.yb2 r5) {
            r4 = this;
            androidx.core.view.insets.α r0 = r4.f4884
            java.util.ArrayList r0 = r0.f1021
            y21 r1 = r5.f12555
            java.lang.Object r1 = r1.f12428
            android.view.WindowInsetsAnimation r1 = (android.view.WindowInsetsAnimation) r1
            int r1 = r1.getTypeMask()
            r1 = r1 & 519(0x207, float:7.27E-43)
            if (r1 == 0) goto L46
            java.util.HashMap r4 = r4.f4883
            r4.remove(r5)
            int r4 = r0.size()
            r5 = 1
            int r4 = r4 - r5
        L1d:
            if (r4 < 0) goto L46
            java.lang.Object r1 = r0.get(r4)
            yj1 r1 = (p000.yj1) r1
            int r2 = r1.f12651
            if (r2 <= 0) goto L2b
            r3 = r5
            goto L2c
        L2b:
            r3 = 0
        L2c:
            int r2 = r2 + (-1)
            r1.f12651 = r2
            if (r3 == 0) goto L43
            if (r2 != 0) goto L43
            java.util.ArrayList r1 = r1.f12649
            int r2 = r1.size()
            int r2 = r2 - r5
            if (r2 >= 0) goto L3e
            goto L43
        L3e:
            java.lang.ClassCastException r4 = p000.lz1.m3685(r2, r1)
            throw r4
        L43:
            int r4 = r4 + (-1)
            goto L1d
        L46:
            return
    }

    @Override // p000.wb2
    /* JADX INFO: renamed from: β */
    public final void mo2609(p000.yb2 r3) {
            r2 = this;
            androidx.core.view.insets.α r2 = r2.f4884
            java.util.ArrayList r2 = r2.f1021
            y21 r3 = r3.f12555
            java.lang.Object r3 = r3.f12428
            android.view.WindowInsetsAnimation r3 = (android.view.WindowInsetsAnimation) r3
            int r3 = r3.getTypeMask()
            r3 = r3 & 519(0x207, float:7.27E-43)
            if (r3 == 0) goto L29
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L18:
            if (r3 < 0) goto L29
            java.lang.Object r0 = r2.get(r3)
            yj1 r0 = (p000.yj1) r0
            int r1 = r0.f12651
            int r1 = r1 + 1
            r0.f12651 = r1
            int r3 = r3 + (-1)
            goto L18
        L29:
            return
    }

    @Override // p000.wb2
    /* JADX INFO: renamed from: γ */
    public final p000.oc2 mo2610(p000.oc2 r7, java.util.List r8) {
            r6 = this;
            androidx.core.view.insets.α r0 = r6.f4884
            java.util.ArrayList r0 = r0.f1021
            android.graphics.RectF r1 = new android.graphics.RectF
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2, r2, r2, r2)
            int r2 = r8.size()
            int r2 = r2 + (-1)
        L11:
            if (r2 < 0) goto L4c
            java.lang.Object r3 = r8.get(r2)
            yb2 r3 = (p000.yb2) r3
            java.util.HashMap r4 = r6.f4883
            java.lang.Object r4 = r4.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L49
            int r4 = r4.intValue()
            y21 r3 = r3.f12555
            java.lang.Object r3 = r3.f12428
            android.view.WindowInsetsAnimation r3 = (android.view.WindowInsetsAnimation) r3
            float r3 = r3.getAlpha()
            r5 = r4 & 1
            if (r5 == 0) goto L37
            r1.left = r3
        L37:
            r5 = r4 & 2
            if (r5 == 0) goto L3d
            r1.top = r3
        L3d:
            r5 = r4 & 4
            if (r5 == 0) goto L43
            r1.right = r3
        L43:
            r4 = r4 & 8
            if (r4 == 0) goto L49
            r1.bottom = r3
        L49:
            int r2 = r2 + (-1)
            goto L11
        L4c:
            lc2 r6 = r7.f8033
            r8 = 519(0x207, float:7.27E-43)
            nm0 r8 = r6.mo1906(r8)
            r1 = 64
            nm0 r6 = r6.mo1906(r1)
            p000.nm0.m4079(r8, r6)
            int r6 = r0.size()
            int r6 = r6 + (-1)
        L63:
            if (r6 < 0) goto L7d
            java.lang.Object r8 = r0.get(r6)
            yj1 r8 = (p000.yj1) r8
            java.util.ArrayList r8 = r8.f12649
            int r1 = r8.size()
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L78
            int r6 = r6 + (-1)
            goto L63
        L78:
            java.lang.ClassCastException r6 = p000.lz1.m3685(r1, r8)
            throw r6
        L7d:
            return r7
    }

    @Override // p000.wb2
    /* JADX INFO: renamed from: δ */
    public final p000.cw1 mo2611(p000.yb2 r6, p000.cw1 r7) {
            r5 = this;
            y21 r0 = r6.f12555
            java.lang.Object r0 = r0.f12428
            android.view.WindowInsetsAnimation r0 = (android.view.WindowInsetsAnimation) r0
            int r0 = r0.getTypeMask()
            r0 = r0 & 519(0x207, float:7.27E-43)
            if (r0 == 0) goto L40
            java.lang.Object r0 = r7.f2790
            nm0 r0 = (p000.nm0) r0
            java.lang.Object r1 = r7.f2789
            nm0 r1 = (p000.nm0) r1
            int r2 = r0.f7674
            int r3 = r1.f7674
            if (r2 == r3) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            int r3 = r0.f7675
            int r4 = r1.f7675
            if (r3 == r4) goto L27
            r2 = r2 | 2
        L27:
            int r3 = r0.f7676
            int r4 = r1.f7676
            if (r3 == r4) goto L2f
            r2 = r2 | 4
        L2f:
            int r0 = r0.f7677
            int r1 = r1.f7677
            if (r0 == r1) goto L37
            r2 = r2 | 8
        L37:
            java.util.HashMap r5 = r5.f4883
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.put(r6, r0)
        L40:
            return r7
    }
}
