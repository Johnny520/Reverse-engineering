package com.example.dyhelper.p002ui;

/* JADX INFO: renamed from: com.example.dyhelper.ui.δ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0161 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f2642;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ android.view.View f2643;

    public /* synthetic */ C0161(android.view.View r1, int r2) {
            r0 = this;
            r0.f2642 = r2
            r0.f2643 = r1
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r2) {
            r1 = this;
            int r0 = r1.f2642
            android.view.View r1 = r1.f2643
            switch(r0) {
                case 0: goto L6e;
                case 1: goto L54;
                case 2: goto L3a;
                case 3: goto L22;
                default: goto L7;
            }
        L7:
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeItemView r1 = (com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeItemView) r1
            int r0 = com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeItemView.f2601
            r2.getClass()
            java.lang.Object r2 = r2.getAnimatedValue()
            r2.getClass()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.f2612 = r2
            r2 = 0
            r1.m1577(r2, r2)
            return
        L22:
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeHostView r1 = (com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeHostView) r1
            int r0 = com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeHostView.f2587
            r2.getClass()
            java.lang.Object r2 = r2.getAnimatedValue()
            r2.getClass()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.m1570(r2)
            return
        L3a:
            com.example.dyhelper.ui.ColorPickerDialog$SvPanel r1 = (com.example.dyhelper.p002ui.ColorPickerDialog$SvPanel) r1
            int r0 = com.example.dyhelper.p002ui.ColorPickerDialog$SvPanel.f2504
            r2.getClass()
            java.lang.Object r2 = r2.getAnimatedValue()
            r2.getClass()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.f2520 = r2
            r1.invalidate()
            return
        L54:
            com.example.dyhelper.ui.ColorPickerDialog$HueBar r1 = (com.example.dyhelper.p002ui.ColorPickerDialog$HueBar) r1
            int r0 = com.example.dyhelper.p002ui.ColorPickerDialog$HueBar.f2491
            r2.getClass()
            java.lang.Object r2 = r2.getAnimatedValue()
            r2.getClass()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.f2501 = r2
            r1.invalidate()
            return
        L6e:
            com.example.dyhelper.ui.ColorPickerDialog$AlphaBar r1 = (com.example.dyhelper.p002ui.ColorPickerDialog$AlphaBar) r1
            int r0 = com.example.dyhelper.p002ui.ColorPickerDialog$AlphaBar.f2437
            r2.getClass()
            java.lang.Object r2 = r2.getAnimatedValue()
            r2.getClass()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.f2452 = r2
            r1.invalidate()
            return
    }
}
