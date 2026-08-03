package com.kongzue.dialogx.databinding;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutDialogxPoptipMaterialDarkBinding implements Yue.InterfaceC6791 {

    @Yue.InterfaceC4410
    public final android.widget.LinearLayout boxBody;

    @Yue.InterfaceC4410
    public final android.widget.RelativeLayout boxCustom;

    @Yue.InterfaceC4410
    public final com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout boxRoot;

    @Yue.InterfaceC4410
    public final android.widget.ImageView imgDialogxPopIcon;

    @Yue.InterfaceC4410
    private final com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout rootView;

    @Yue.InterfaceC4410
    public final android.widget.TextView txtDialogxButton;

    @Yue.InterfaceC4410
    public final android.widget.TextView txtDialogxPopText;

    private LayoutDialogxPoptipMaterialDarkBinding(@Yue.InterfaceC4410 com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1, @Yue.InterfaceC4410 android.widget.LinearLayout r2, @Yue.InterfaceC4410 android.widget.RelativeLayout r3, @Yue.InterfaceC4410 com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r4, @Yue.InterfaceC4410 android.widget.ImageView r5, @Yue.InterfaceC4410 android.widget.TextView r6, @Yue.InterfaceC4410 android.widget.TextView r7) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.boxBody = r2
            r0.boxCustom = r3
            r0.boxRoot = r4
            r0.imgDialogxPopIcon = r5
            r0.txtDialogxButton = r6
            r0.txtDialogxPopText = r7
            return
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxPoptipMaterialDarkBinding bind(@Yue.InterfaceC4410 android.view.View r10) {
            int r0 = com.kongzue.dialogx.R.id.box_body
            android.view.View r1 = Yue.C6792.m26085(r10, r0)
            r4 = r1
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L42
            int r0 = com.kongzue.dialogx.R.id.box_custom
            android.view.View r1 = Yue.C6792.m26085(r10, r0)
            r5 = r1
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            if (r5 == 0) goto L42
            r6 = r10
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r6
            int r0 = com.kongzue.dialogx.R.id.img_dialogx_pop_icon
            android.view.View r1 = Yue.C6792.m26085(r10, r0)
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L42
            int r0 = com.kongzue.dialogx.R.id.txt_dialogx_button
            android.view.View r1 = Yue.C6792.m26085(r10, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L42
            int r0 = com.kongzue.dialogx.R.id.txt_dialogx_pop_text
            android.view.View r1 = Yue.C6792.m26085(r10, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L42
            com.kongzue.dialogx.databinding.LayoutDialogxPoptipMaterialDarkBinding r10 = new com.kongzue.dialogx.databinding.LayoutDialogxPoptipMaterialDarkBinding
            r2 = r10
            r3 = r6
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r10
        L42:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxPoptipMaterialDarkBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.kongzue.dialogx.databinding.LayoutDialogxPoptipMaterialDarkBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxPoptipMaterialDarkBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2, @Yue.InterfaceC4544 android.view.ViewGroup r3, boolean r4) {
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_poptip_material_dark
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            com.kongzue.dialogx.databinding.LayoutDialogxPoptipMaterialDarkBinding r2 = bind(r2)
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
