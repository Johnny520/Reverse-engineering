package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xb2 extends android.view.WindowInsetsAnimation.Callback {

    /* JADX INFO: renamed from: α */
    public final p000.wb2 f12123;

    /* JADX INFO: renamed from: β */
    public java.util.List f12124;

    /* JADX INFO: renamed from: γ */
    public java.util.ArrayList f12125;

    /* JADX INFO: renamed from: δ */
    public final java.util.HashMap f12126;

    public xb2(p000.wb2 r2) {
            r1 = this;
            int r0 = r2.f11663
            r1.<init>(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f12126 = r0
            r1.f12123 = r2
            return
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(android.view.WindowInsetsAnimation r3) {
            r2 = this;
            wb2 r0 = r2.f12123
            yb2 r1 = r2.m6606(r3)
            r0.mo2608(r1)
            java.util.HashMap r2 = r2.f12126
            r2.remove(r3)
            return
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(android.view.WindowInsetsAnimation r2) {
            r1 = this;
            wb2 r0 = r1.f12123
            yb2 r1 = r1.m6606(r2)
            r0.mo2609(r1)
            return
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final android.view.WindowInsets onProgress(android.view.WindowInsets r5, java.util.List r6) {
            r4 = this;
            java.util.ArrayList r0 = r4.f12125
            if (r0 != 0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            r4.f12125 = r0
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r4.f12124 = r0
            goto L19
        L16:
            r0.clear()
        L19:
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L1f:
            if (r0 < 0) goto L40
            java.lang.Object r1 = r6.get(r0)
            android.view.WindowInsetsAnimation r1 = (android.view.WindowInsetsAnimation) r1
            yb2 r2 = r4.m6606(r1)
            float r1 = r1.getFraction()
            y21 r3 = r2.f12555
            java.lang.Object r3 = r3.f12428
            android.view.WindowInsetsAnimation r3 = (android.view.WindowInsetsAnimation) r3
            r3.setFraction(r1)
            java.util.ArrayList r1 = r4.f12125
            r1.add(r2)
            int r0 = r0 + (-1)
            goto L1f
        L40:
            r6 = 0
            oc2 r5 = p000.oc2.m4220(r6, r5)
            java.util.List r6 = r4.f12124
            wb2 r4 = r4.f12123
            oc2 r4 = r4.mo2610(r5, r6)
            android.view.WindowInsets r4 = r4.m4226()
            return r4
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation r2, android.view.WindowInsetsAnimation.Bounds r3) {
            r1 = this;
            yb2 r2 = r1.m6606(r2)
            cw1 r0 = new cw1
            r0.<init>(r3)
            wb2 r1 = r1.f12123
            cw1 r1 = r1.mo2611(r2, r0)
            r1.getClass()
            android.view.WindowInsetsAnimation$Bounds r2 = new android.view.WindowInsetsAnimation$Bounds
            java.lang.Object r3 = r1.f2789
            nm0 r3 = (p000.nm0) r3
            android.graphics.Insets r3 = r3.m4082()
            java.lang.Object r1 = r1.f2790
            nm0 r1 = (p000.nm0) r1
            android.graphics.Insets r1 = r1.m4082()
            r2.<init>(r3, r1)
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final p000.yb2 m6606(android.view.WindowInsetsAnimation r7) {
            r6 = this;
            java.util.HashMap r6 = r6.f12126
            java.lang.Object r0 = r6.get(r7)
            yb2 r0 = (p000.yb2) r0
            if (r0 != 0) goto L22
            yb2 r0 = new yb2
            r0.<init>()
            android.view.WindowInsetsAnimation r1 = new android.view.WindowInsetsAnimation
            r2 = 0
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            y21 r1 = new y21
            r1.<init>(r7)
            r0.f12555 = r1
            r6.put(r7, r0)
        L22:
            return r0
    }
}
