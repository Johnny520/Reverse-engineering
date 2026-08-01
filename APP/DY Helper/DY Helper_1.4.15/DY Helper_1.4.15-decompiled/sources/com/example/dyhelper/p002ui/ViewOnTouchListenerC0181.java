package com.example.dyhelper.p002ui;

/* JADX INFO: renamed from: com.example.dyhelper.ui.ω */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC0181 implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2692;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.view.View f2693;

    public /* synthetic */ ViewOnTouchListenerC0181(android.view.View r1, int r2) {
            r0 = this;
            r0.f2692 = r2
            r0.f2693 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
            r6 = this;
            int r7 = r6.f2692
            r0 = 3
            r1 = 1
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.View r6 = r6.f2693
            switch(r7) {
                case 0: goto L5c;
                default: goto Lc;
            }
        Lc:
            com.example.dyhelper.ui.TopDownloadNotificationManager$CloseButtonView r6 = (com.example.dyhelper.p002ui.TopDownloadNotificationManager$CloseButtonView) r6
            int r7 = com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeItemView.f2601
            int r7 = r8.getActionMasked()
            if (r7 == 0) goto L3a
            if (r7 == r1) goto L1b
            if (r7 == r0) goto L1b
            goto L5b
        L1b:
            android.view.ViewParent r7 = r6.getParent()
            if (r7 == 0) goto L24
            r7.requestDisallowInterceptTouchEvent(r2)
        L24:
            android.view.ViewPropertyAnimator r6 = r6.animate()
            android.view.ViewPropertyAnimator r6 = r6.scaleX(r3)
            android.view.ViewPropertyAnimator r6 = r6.scaleY(r3)
            r7 = 130(0x82, double:6.4E-322)
            android.view.ViewPropertyAnimator r6 = r6.setDuration(r7)
            r6.start()
            goto L5b
        L3a:
            android.view.ViewParent r7 = r6.getParent()
            if (r7 == 0) goto L43
            r7.requestDisallowInterceptTouchEvent(r1)
        L43:
            android.view.ViewPropertyAnimator r6 = r6.animate()
            r7 = 1063339950(0x3f6147ae, float:0.88)
            android.view.ViewPropertyAnimator r6 = r6.scaleX(r7)
            android.view.ViewPropertyAnimator r6 = r6.scaleY(r7)
            r7 = 90
            android.view.ViewPropertyAnimator r6 = r6.setDuration(r7)
            r6.start()
        L5b:
            return r2
        L5c:
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeHostView r6 = (com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeHostView) r6
            int r7 = com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeHostView.f2587
            r8.getClass()
            int r7 = r8.getActionMasked()
            if (r7 == 0) goto L124
            r4 = 0
            if (r7 == r1) goto Lb2
            r5 = 2
            if (r7 == r5) goto L74
            if (r7 == r0) goto Lb2
            r1 = r2
            goto L13c
        L74:
            boolean r7 = r6.f2598
            if (r7 != 0) goto L7a
            goto L13c
        L7a:
            float r7 = r8.getRawY()
            float r8 = r6.f2597
            float r7 = r7 - r8
            boolean r8 = r6.f2596
            if (r8 == 0) goto L9b
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 >= 0) goto L9b
            r8 = 1119879168(0x42c00000, float:96.0)
            int r8 = r6.m1571(r8)
            float r8 = (float) r8
            float r7 = r7 / r8
            float r7 = r7 + r3
            float r7 = p000.j81.m2905(r7, r4, r3)
            r6.m1570(r7)
            goto L13c
        L9b:
            if (r8 != 0) goto L13c
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 <= 0) goto L13c
            r8 = 1120927744(0x42d00000, float:104.0)
            int r8 = r6.m1571(r8)
            float r8 = (float) r8
            float r7 = r7 / r8
            float r7 = p000.j81.m2905(r7, r4, r3)
            r6.m1570(r7)
            goto L13c
        Lb2:
            float r7 = r8.getRawY()
            float r8 = r6.f2597
            float r7 = r7 - r8
            r6.f2598 = r2
            android.view.ViewParent r8 = r6.getParent()
            if (r8 == 0) goto Lc4
            r8.requestDisallowInterceptTouchEvent(r2)
        Lc4:
            boolean r8 = r6.f2596
            if (r8 == 0) goto Le3
            r8 = 1099956224(0x41900000, float:18.0)
            int r8 = r6.m1571(r8)
            int r8 = -r8
            float r8 = (float) r8
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 < 0) goto Ldd
            float r8 = r6.f2600
            r0 = 1060655596(0x3f3851ec, float:0.72)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto Le3
        Ldd:
            r6.f2596 = r2
            r6.m1569(r4)
            goto L13c
        Le3:
            boolean r8 = r6.f2596
            if (r8 != 0) goto L101
            r8 = 1101004800(0x41a00000, float:20.0)
            int r8 = r6.m1571(r8)
            float r8 = (float) r8
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 > 0) goto Lfb
            float r8 = r6.f2600
            r0 = 1050924810(0x3ea3d70a, float:0.32)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto L101
        Lfb:
            r6.f2596 = r1
            r6.m1569(r3)
            goto L13c
        L101:
            float r7 = java.lang.Math.abs(r7)
            r8 = 1090519040(0x41000000, float:8.0)
            int r8 = r6.m1571(r8)
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L11a
            boolean r7 = r6.f2596
            if (r7 != 0) goto L11a
            r6.f2596 = r1
            r6.m1569(r3)
            goto L13c
        L11a:
            boolean r7 = r6.f2596
            if (r7 == 0) goto L11f
            goto L120
        L11f:
            r3 = r4
        L120:
            r6.m1569(r3)
            goto L13c
        L124:
            float r7 = r8.getRawY()
            r6.f2597 = r7
            r6.f2598 = r1
            android.animation.ValueAnimator r7 = r6.f2599
            if (r7 == 0) goto L133
            r7.cancel()
        L133:
            android.view.ViewParent r6 = r6.getParent()
            if (r6 == 0) goto L13c
            r6.requestDisallowInterceptTouchEvent(r1)
        L13c:
            return r1
    }
}
