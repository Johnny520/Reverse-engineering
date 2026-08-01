package com.example.dyhelper.p002ui;

/* JADX INFO: renamed from: com.example.dyhelper.ui.κ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0167 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2652;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f2653;

    public /* synthetic */ RunnableC0167(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2652 = r1
            r0.f2653 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f2652
            java.lang.Object r2 = r2.f2653
            switch(r0) {
                case 0: goto L29;
                case 1: goto L21;
                case 2: goto L19;
                case 3: goto Lf;
                default: goto L7;
            }
        L7:
            com.example.dyhelper.ui.β r2 = (com.example.dyhelper.p002ui.C0159) r2
            int r0 = com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeItemView.f2601
            r2.invoke()
            return
        Lf:
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeHostView r2 = (com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeHostView) r2
            android.widget.TextView r2 = r2.f2595
            r0 = 8
            r2.setVisibility(r0)
            return
        L19:
            p70 r2 = (p000.p70) r2
            int r0 = com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeHostView.f2587
            r2.invoke()
            return
        L21:
            com.example.dyhelper.ui.ImageCropHelper$CropOverlayView r2 = (com.example.dyhelper.p002ui.ImageCropHelper$CropOverlayView) r2
            int r0 = com.example.dyhelper.p002ui.ImageCropHelper$CropOverlayView.f2550
            r2.invalidate()
            return
        L29:
            android.view.View r2 = (android.view.View) r2
            ym1 r0 = com.example.dyhelper.p002ui.ColorPickerDialog$ColorPickerView.f2454
            android.view.ViewPropertyAnimator r2 = r2.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r2.scaleX(r0)
            android.view.ViewPropertyAnimator r2 = r2.scaleY(r0)
            r0 = 100
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            r2.start()
            return
    }
}
