package defpackage;

/* JADX INFO: renamed from: ᛲᛱᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0235 implements defpackage.InterfaceC1567 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.lang.CharSequence f1406;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public android.view.Window.Callback f1407;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public boolean f1408;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public java.lang.CharSequence f1409;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f1410;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f1411;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public defpackage.C1909 f1412;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f1413;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public android.view.View f1414;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public androidx.appcompat.widget.Toolbar f1415;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public java.lang.CharSequence f1416;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public int f1417;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f1418;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f1419;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f1420;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m844() {
            r2 = this;
            int r0 = r2.f1418
            r1 = r0 & 2
            if (r1 == 0) goto L15
            r0 = r0 & 1
            if (r0 == 0) goto L12
            android.graphics.drawable.Drawable r0 = r2.f1411
            if (r0 == 0) goto Lf
            goto L16
        Lf:
            android.graphics.drawable.Drawable r0 = r2.f1413
            goto L16
        L12:
            android.graphics.drawable.Drawable r0 = r2.f1413
            goto L16
        L15:
            r0 = 0
        L16:
            androidx.appcompat.widget.Toolbar r2 = r2.f1415
            r2.setLogo(r0)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m845(int r5) {
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f1415
            int r1 = r4.f1418
            r1 = r1 ^ r5
            r4.f1418 = r5
            if (r1 == 0) goto L5c
            r2 = r1 & 4
            r3 = 0
            if (r2 == 0) goto L29
            r2 = r5 & 4
            if (r2 == 0) goto L15
            r4.m846()
        L15:
            int r2 = r4.f1418
            r2 = r2 & 4
            if (r2 == 0) goto L26
            android.graphics.drawable.Drawable r2 = r4.f1419
            if (r2 == 0) goto L20
            goto L22
        L20:
            android.graphics.drawable.Drawable r2 = r4.f1410
        L22:
            r0.setNavigationIcon(r2)
            goto L29
        L26:
            r0.setNavigationIcon(r3)
        L29:
            r2 = r1 & 3
            if (r2 == 0) goto L30
            r4.m844()
        L30:
            r2 = r1 & 8
            if (r2 == 0) goto L49
            r2 = r5 & 8
            if (r2 == 0) goto L43
            java.lang.CharSequence r2 = r4.f1406
            r0.setTitle(r2)
            java.lang.CharSequence r2 = r4.f1409
            r0.setSubtitle(r2)
            goto L49
        L43:
            r0.setTitle(r3)
            r0.setSubtitle(r3)
        L49:
            r1 = r1 & 16
            if (r1 == 0) goto L5c
            android.view.View r4 = r4.f1414
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

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m846() {
            r2 = this;
            int r0 = r2.f1418
            r0 = r0 & 4
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r2.f1416
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            androidx.appcompat.widget.Toolbar r1 = r2.f1415
            if (r0 == 0) goto L16
            int r2 = r2.f1417
            r1.setNavigationContentDescription(r2)
            return
        L16:
            java.lang.CharSequence r2 = r2.f1416
            r1.setNavigationContentDescription(r2)
        L1b:
            return
    }
}
