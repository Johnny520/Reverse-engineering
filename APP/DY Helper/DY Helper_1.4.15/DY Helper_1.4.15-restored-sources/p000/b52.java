package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class b52 implements p000.InterfaceC1030yq {

    /* JADX INFO: renamed from: α */
    public androidx.appcompat.widget.Toolbar f1484;

    /* JADX INFO: renamed from: β */
    public int f1485;

    /* JADX INFO: renamed from: γ */
    public android.view.View f1486;

    /* JADX INFO: renamed from: δ */
    public android.graphics.drawable.Drawable f1487;

    /* JADX INFO: renamed from: ε */
    public android.graphics.drawable.Drawable f1488;

    /* JADX INFO: renamed from: ζ */
    public android.graphics.drawable.Drawable f1489;

    /* JADX INFO: renamed from: η */
    public boolean f1490;

    /* JADX INFO: renamed from: θ */
    public java.lang.CharSequence f1491;

    /* JADX INFO: renamed from: ι */
    public java.lang.CharSequence f1492;

    /* JADX INFO: renamed from: κ */
    public java.lang.CharSequence f1493;

    /* JADX INFO: renamed from: λ */
    public android.view.Window.Callback f1494;

    /* JADX INFO: renamed from: μ */
    public boolean f1495;

    /* JADX INFO: renamed from: ν */
    public androidx.appcompat.widget.C0030 f1496;

    /* JADX INFO: renamed from: ξ */
    public int f1497;

    /* JADX INFO: renamed from: ο */
    public android.graphics.drawable.Drawable f1498;

    /* JADX INFO: renamed from: α */
    public final void m744(int r5) {
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f1484
            int r1 = r4.f1485
            r1 = r1 ^ r5
            r4.f1485 = r5
            if (r1 == 0) goto L5c
            r2 = r1 & 4
            r3 = 0
            if (r2 == 0) goto L29
            r2 = r5 & 4
            if (r2 == 0) goto L15
            r4.m745()
        L15:
            int r2 = r4.f1485
            r2 = r2 & 4
            if (r2 == 0) goto L26
            android.graphics.drawable.Drawable r2 = r4.f1489
            if (r2 == 0) goto L20
            goto L22
        L20:
            android.graphics.drawable.Drawable r2 = r4.f1498
        L22:
            r0.setNavigationIcon(r2)
            goto L29
        L26:
            r0.setNavigationIcon(r3)
        L29:
            r2 = r1 & 3
            if (r2 == 0) goto L30
            r4.m746()
        L30:
            r2 = r1 & 8
            if (r2 == 0) goto L49
            r2 = r5 & 8
            if (r2 == 0) goto L43
            java.lang.CharSequence r2 = r4.f1491
            r0.setTitle(r2)
            java.lang.CharSequence r2 = r4.f1492
            r0.setSubtitle(r2)
            goto L49
        L43:
            r0.setTitle(r3)
            r0.setSubtitle(r3)
        L49:
            r1 = r1 & 16
            if (r1 == 0) goto L5c
            android.view.View r4 = r4.f1486
            if (r4 == 0) goto L5c
            r5 = r5 & 16
            if (r5 == 0) goto L59
            r0.addView(r4)
            return
        L59:
            r0.removeView(r4)
        L5c:
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m745() {
            r2 = this;
            int r0 = r2.f1485
            r0 = r0 & 4
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r2.f1493
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            androidx.appcompat.widget.Toolbar r1 = r2.f1484
            if (r0 == 0) goto L16
            int r2 = r2.f1497
            r1.setNavigationContentDescription(r2)
            return
        L16:
            java.lang.CharSequence r2 = r2.f1493
            r1.setNavigationContentDescription(r2)
        L1b:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m746() {
            r2 = this;
            int r0 = r2.f1485
            r1 = r0 & 2
            if (r1 == 0) goto L15
            r0 = r0 & 1
            if (r0 == 0) goto L12
            android.graphics.drawable.Drawable r0 = r2.f1488
            if (r0 == 0) goto Lf
            goto L16
        Lf:
            android.graphics.drawable.Drawable r0 = r2.f1487
            goto L16
        L12:
            android.graphics.drawable.Drawable r0 = r2.f1487
            goto L16
        L15:
            r0 = 0
        L16:
            androidx.appcompat.widget.Toolbar r2 = r2.f1484
            r2.setLogo(r0)
            return
    }
}
