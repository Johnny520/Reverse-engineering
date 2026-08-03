package com.kongzue.dialogx.databinding;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutDialogxPopnotificationMaterialBinding implements Yue.InterfaceC6791 {

    @Yue.InterfaceC4410
    public final com.kongzue.dialogx.util.views.MaxLinearLayout boxBody;

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
    public final android.widget.TextView txtDialogxPopMessage;

    @Yue.InterfaceC4410
    public final android.widget.TextView txtDialogxPopTitle;

    private LayoutDialogxPopnotificationMaterialBinding(@Yue.InterfaceC4410 com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1, @Yue.InterfaceC4410 com.kongzue.dialogx.util.views.MaxLinearLayout r2, @Yue.InterfaceC4410 android.widget.RelativeLayout r3, @Yue.InterfaceC4410 com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r4, @Yue.InterfaceC4410 android.widget.ImageView r5, @Yue.InterfaceC4410 android.widget.TextView r6, @Yue.InterfaceC4410 android.widget.TextView r7, @Yue.InterfaceC4410 android.widget.TextView r8) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.boxBody = r2
            r0.boxCustom = r3
            r0.boxRoot = r4
            r0.imgDialogxPopIcon = r5
            r0.txtDialogxButton = r6
            r0.txtDialogxPopMessage = r7
            r0.txtDialogxPopTitle = r8
            return
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxPopnotificationMaterialBinding bind(@Yue.InterfaceC4410 android.view.View r11) {
            int r0 = com.kongzue.dialogx.R.id.box_body
            android.view.View r1 = Yue.C6792.m26085(r11, r0)
            r4 = r1
            com.kongzue.dialogx.util.views.MaxLinearLayout r4 = (com.kongzue.dialogx.util.views.MaxLinearLayout) r4
            if (r4 == 0) goto L4d
            int r0 = com.kongzue.dialogx.R.id.box_custom
            android.view.View r1 = Yue.C6792.m26085(r11, r0)
            r5 = r1
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            if (r5 == 0) goto L4d
            r6 = r11
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r6
            int r0 = com.kongzue.dialogx.R.id.img_dialogx_pop_icon
            android.view.View r1 = Yue.C6792.m26085(r11, r0)
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L4d
            int r0 = com.kongzue.dialogx.R.id.txt_dialogx_button
            android.view.View r1 = Yue.C6792.m26085(r11, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L4d
            int r0 = com.kongzue.dialogx.R.id.txt_dialogx_pop_message
            android.view.View r1 = Yue.C6792.m26085(r11, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L4d
            int r0 = com.kongzue.dialogx.R.id.txt_dialogx_pop_title
            android.view.View r1 = Yue.C6792.m26085(r11, r0)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L4d
            com.kongzue.dialogx.databinding.LayoutDialogxPopnotificationMaterialBinding r11 = new com.kongzue.dialogx.databinding.LayoutDialogxPopnotificationMaterialBinding
            r2 = r11
            r3 = r6
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        L4d:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxPopnotificationMaterialBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.kongzue.dialogx.databinding.LayoutDialogxPopnotificationMaterialBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxPopnotificationMaterialBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2, @Yue.InterfaceC4544 android.view.ViewGroup r3, boolean r4) {
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_popnotification_material
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            com.kongzue.dialogx.databinding.LayoutDialogxPopnotificationMaterialBinding r2 = bind(r2)
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
