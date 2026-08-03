package com.kongzue.dialogx.databinding;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutDialogxPopmenuMaterialDarkBinding implements Yue.InterfaceC6791 {

    @Yue.InterfaceC4410
    public final com.kongzue.dialogx.util.views.MaxRelativeLayout boxBody;

    @Yue.InterfaceC4410
    public final android.widget.RelativeLayout boxCustom;

    @Yue.InterfaceC4410
    public final com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout boxRoot;

    @Yue.InterfaceC4410
    public final com.kongzue.dialogx.util.views.PopMenuListView listMenu;

    @Yue.InterfaceC4410
    private final com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout rootView;

    private LayoutDialogxPopmenuMaterialDarkBinding(@Yue.InterfaceC4410 com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1, @Yue.InterfaceC4410 com.kongzue.dialogx.util.views.MaxRelativeLayout r2, @Yue.InterfaceC4410 android.widget.RelativeLayout r3, @Yue.InterfaceC4410 com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r4, @Yue.InterfaceC4410 com.kongzue.dialogx.util.views.PopMenuListView r5) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.boxBody = r2
            r0.boxCustom = r3
            r0.boxRoot = r4
            r0.listMenu = r5
            return
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxPopmenuMaterialDarkBinding bind(@Yue.InterfaceC4410 android.view.View r8) {
            int r0 = com.kongzue.dialogx.R.id.box_body
            android.view.View r1 = Yue.C6792.m26085(r8, r0)
            r4 = r1
            com.kongzue.dialogx.util.views.MaxRelativeLayout r4 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r4
            if (r4 == 0) goto L2c
            int r0 = com.kongzue.dialogx.R.id.box_custom
            android.view.View r1 = Yue.C6792.m26085(r8, r0)
            r5 = r1
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            if (r5 == 0) goto L2c
            r6 = r8
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r6
            int r0 = com.kongzue.dialogx.R.id.listMenu
            android.view.View r1 = Yue.C6792.m26085(r8, r0)
            r7 = r1
            com.kongzue.dialogx.util.views.PopMenuListView r7 = (com.kongzue.dialogx.util.views.PopMenuListView) r7
            if (r7 == 0) goto L2c
            com.kongzue.dialogx.databinding.LayoutDialogxPopmenuMaterialDarkBinding r8 = new com.kongzue.dialogx.databinding.LayoutDialogxPopmenuMaterialDarkBinding
            r2 = r8
            r3 = r6
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
        L2c:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxPopmenuMaterialDarkBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.kongzue.dialogx.databinding.LayoutDialogxPopmenuMaterialDarkBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxPopmenuMaterialDarkBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2, @Yue.InterfaceC4544 android.view.ViewGroup r3, boolean r4) {
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_popmenu_material_dark
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            com.kongzue.dialogx.databinding.LayoutDialogxPopmenuMaterialDarkBinding r2 = bind(r2)
            return r2
    }

    @Override // Yue.InterfaceC6791
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r1.getRoot()
            return r0
    }

    @Override // Yue.InterfaceC6791
    @Yue.InterfaceC4410
    public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout getRoot() {
            r1 = this;
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r1.rootView
            return r0
    }
}
