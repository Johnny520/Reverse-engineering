package com.kongzue.dialogx.databinding;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutDialogxFullscreenDarkBinding implements Yue.InterfaceC6791 {

    @Yue.InterfaceC4410
    public final com.kongzue.dialogx.util.views.MaxRelativeLayout bkg;

    @Yue.InterfaceC4410
    public final android.widget.RelativeLayout boxBkg;

    @Yue.InterfaceC4410
    public final android.widget.RelativeLayout boxCustom;

    @Yue.InterfaceC4410
    public final com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout boxRoot;

    @Yue.InterfaceC4410
    public final com.kongzue.dialogx.util.views.ActivityScreenShotImageView imgZoomActivity;

    @Yue.InterfaceC4410
    private final android.widget.RelativeLayout rootView;

    private LayoutDialogxFullscreenDarkBinding(@Yue.InterfaceC4410 android.widget.RelativeLayout r1, @Yue.InterfaceC4410 com.kongzue.dialogx.util.views.MaxRelativeLayout r2, @Yue.InterfaceC4410 android.widget.RelativeLayout r3, @Yue.InterfaceC4410 android.widget.RelativeLayout r4, @Yue.InterfaceC4410 com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r5, @Yue.InterfaceC4410 com.kongzue.dialogx.util.views.ActivityScreenShotImageView r6) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.bkg = r2
            r0.boxBkg = r3
            r0.boxCustom = r4
            r0.boxRoot = r5
            r0.imgZoomActivity = r6
            return
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxFullscreenDarkBinding bind(@Yue.InterfaceC4410 android.view.View r9) {
            int r0 = com.kongzue.dialogx.R.id.bkg
            android.view.View r1 = Yue.C6792.m26085(r9, r0)
            r4 = r1
            com.kongzue.dialogx.util.views.MaxRelativeLayout r4 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r4
            if (r4 == 0) goto L41
            int r0 = com.kongzue.dialogx.R.id.box_bkg
            android.view.View r1 = Yue.C6792.m26085(r9, r0)
            r5 = r1
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            if (r5 == 0) goto L41
            int r0 = com.kongzue.dialogx.R.id.box_custom
            android.view.View r1 = Yue.C6792.m26085(r9, r0)
            r6 = r1
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            if (r6 == 0) goto L41
            int r0 = com.kongzue.dialogx.R.id.box_root
            android.view.View r1 = Yue.C6792.m26085(r9, r0)
            r7 = r1
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r7 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r7
            if (r7 == 0) goto L41
            int r0 = com.kongzue.dialogx.R.id.img_zoom_activity
            android.view.View r1 = Yue.C6792.m26085(r9, r0)
            r8 = r1
            com.kongzue.dialogx.util.views.ActivityScreenShotImageView r8 = (com.kongzue.dialogx.util.views.ActivityScreenShotImageView) r8
            if (r8 == 0) goto L41
            com.kongzue.dialogx.databinding.LayoutDialogxFullscreenDarkBinding r0 = new com.kongzue.dialogx.databinding.LayoutDialogxFullscreenDarkBinding
            r3 = r9
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L41:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxFullscreenDarkBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.kongzue.dialogx.databinding.LayoutDialogxFullscreenDarkBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxFullscreenDarkBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2, @Yue.InterfaceC4544 android.view.ViewGroup r3, boolean r4) {
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_fullscreen_dark
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            com.kongzue.dialogx.databinding.LayoutDialogxFullscreenDarkBinding r2 = bind(r2)
            return r2
    }

    @Override // Yue.InterfaceC6791
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            android.widget.RelativeLayout r0 = r1.getRoot()
            return r0
    }

    @Override // Yue.InterfaceC6791
    @Yue.InterfaceC4410
    public android.widget.RelativeLayout getRoot() {
            r1 = this;
            android.widget.RelativeLayout r0 = r1.rootView
            return r0
    }
}
