package com.kongzue.dialogx.databinding;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutDialogxMaterialDarkBinding implements Yue.InterfaceC6791 {

    @Yue.InterfaceC4410
    public final com.kongzue.dialogx.util.views.MaxRelativeLayout bkg;

    @Yue.InterfaceC4410
    public final android.widget.LinearLayout boxButton;

    @Yue.InterfaceC4410
    public final android.widget.RelativeLayout boxCustom;

    @Yue.InterfaceC4410
    public final android.widget.FrameLayout boxList;

    @Yue.InterfaceC4410
    public final com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout boxRoot;

    @Yue.InterfaceC4410
    public final android.widget.TextView btnSelectNegative;

    @Yue.InterfaceC4410
    public final android.widget.TextView btnSelectOther;

    @Yue.InterfaceC4410
    public final android.widget.TextView btnSelectPositive;

    @Yue.InterfaceC4410
    private final com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout rootView;

    @Yue.InterfaceC4410
    public final com.kongzue.dialogx.util.views.DialogScrollView scrollView;

    @Yue.InterfaceC4410
    public final android.widget.Space spaceOtherButton;

    @Yue.InterfaceC4410
    public final android.widget.TextView txtDialogTip;

    @Yue.InterfaceC4410
    public final android.widget.TextView txtDialogTitle;

    @Yue.InterfaceC4410
    public final android.widget.EditText txtInput;

    private LayoutDialogxMaterialDarkBinding(@Yue.InterfaceC4410 com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1, @Yue.InterfaceC4410 com.kongzue.dialogx.util.views.MaxRelativeLayout r2, @Yue.InterfaceC4410 android.widget.LinearLayout r3, @Yue.InterfaceC4410 android.widget.RelativeLayout r4, @Yue.InterfaceC4410 android.widget.FrameLayout r5, @Yue.InterfaceC4410 com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r6, @Yue.InterfaceC4410 android.widget.TextView r7, @Yue.InterfaceC4410 android.widget.TextView r8, @Yue.InterfaceC4410 android.widget.TextView r9, @Yue.InterfaceC4410 com.kongzue.dialogx.util.views.DialogScrollView r10, @Yue.InterfaceC4410 android.widget.Space r11, @Yue.InterfaceC4410 android.widget.TextView r12, @Yue.InterfaceC4410 android.widget.TextView r13, @Yue.InterfaceC4410 android.widget.EditText r14) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.bkg = r2
            r0.boxButton = r3
            r0.boxCustom = r4
            r0.boxList = r5
            r0.boxRoot = r6
            r0.btnSelectNegative = r7
            r0.btnSelectOther = r8
            r0.btnSelectPositive = r9
            r0.scrollView = r10
            r0.spaceOtherButton = r11
            r0.txtDialogTip = r12
            r0.txtDialogTitle = r13
            r0.txtInput = r14
            return
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxMaterialDarkBinding bind(@Yue.InterfaceC4410 android.view.View r18) {
            r0 = r18
            int r1 = com.kongzue.dialogx.R.id.bkg
            android.view.View r2 = Yue.C6792.m26085(r0, r1)
            r5 = r2
            com.kongzue.dialogx.util.views.MaxRelativeLayout r5 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r5
            if (r5 == 0) goto L93
            int r1 = com.kongzue.dialogx.R.id.box_button
            android.view.View r2 = Yue.C6792.m26085(r0, r1)
            r6 = r2
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L93
            int r1 = com.kongzue.dialogx.R.id.box_custom
            android.view.View r2 = Yue.C6792.m26085(r0, r1)
            r7 = r2
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            if (r7 == 0) goto L93
            int r1 = com.kongzue.dialogx.R.id.box_list
            android.view.View r2 = Yue.C6792.m26085(r0, r1)
            r8 = r2
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            if (r8 == 0) goto L93
            r9 = r0
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r9 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r9
            int r1 = com.kongzue.dialogx.R.id.btn_selectNegative
            android.view.View r2 = Yue.C6792.m26085(r0, r1)
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L93
            int r1 = com.kongzue.dialogx.R.id.btn_selectOther
            android.view.View r2 = Yue.C6792.m26085(r0, r1)
            r11 = r2
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L93
            int r1 = com.kongzue.dialogx.R.id.btn_selectPositive
            android.view.View r2 = Yue.C6792.m26085(r0, r1)
            r12 = r2
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L93
            int r1 = com.kongzue.dialogx.R.id.scrollView
            android.view.View r2 = Yue.C6792.m26085(r0, r1)
            r13 = r2
            com.kongzue.dialogx.util.views.DialogScrollView r13 = (com.kongzue.dialogx.util.views.DialogScrollView) r13
            if (r13 == 0) goto L93
            int r1 = com.kongzue.dialogx.R.id.space_other_button
            android.view.View r2 = Yue.C6792.m26085(r0, r1)
            r14 = r2
            android.widget.Space r14 = (android.widget.Space) r14
            if (r14 == 0) goto L93
            int r1 = com.kongzue.dialogx.R.id.txt_dialog_tip
            android.view.View r2 = Yue.C6792.m26085(r0, r1)
            r15 = r2
            android.widget.TextView r15 = (android.widget.TextView) r15
            if (r15 == 0) goto L93
            int r1 = com.kongzue.dialogx.R.id.txt_dialog_title
            android.view.View r2 = Yue.C6792.m26085(r0, r1)
            r16 = r2
            android.widget.TextView r16 = (android.widget.TextView) r16
            if (r16 == 0) goto L93
            int r1 = com.kongzue.dialogx.R.id.txt_input
            android.view.View r2 = Yue.C6792.m26085(r0, r1)
            r17 = r2
            android.widget.EditText r17 = (android.widget.EditText) r17
            if (r17 == 0) goto L93
            com.kongzue.dialogx.databinding.LayoutDialogxMaterialDarkBinding r0 = new com.kongzue.dialogx.databinding.LayoutDialogxMaterialDarkBinding
            r3 = r0
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        L93:
            android.content.res.Resources r0 = r18.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxMaterialDarkBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.kongzue.dialogx.databinding.LayoutDialogxMaterialDarkBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxMaterialDarkBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2, @Yue.InterfaceC4544 android.view.ViewGroup r3, boolean r4) {
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_material_dark
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            com.kongzue.dialogx.databinding.LayoutDialogxMaterialDarkBinding r2 = bind(r2)
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
