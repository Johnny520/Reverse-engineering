package com.kongzue.dialogx.databinding;

/* JADX INFO: loaded from: classes2.dex */
public final class ItemDialogxMaterialBottomMenuNormalTextBinding implements Yue.InterfaceC6791 {

    @Yue.InterfaceC4410
    public final android.widget.ImageView imgDialogxMenuIcon;

    @Yue.InterfaceC4410
    public final android.widget.ImageView imgDialogxMenuSelection;

    @Yue.InterfaceC4410
    private final android.widget.LinearLayout rootView;

    @Yue.InterfaceC4410
    public final android.widget.Space spaceDialogxRightPadding;

    @Yue.InterfaceC4410
    public final android.widget.TextView txtDialogxMenuText;

    private ItemDialogxMaterialBottomMenuNormalTextBinding(@Yue.InterfaceC4410 android.widget.LinearLayout r1, @Yue.InterfaceC4410 android.widget.ImageView r2, @Yue.InterfaceC4410 android.widget.ImageView r3, @Yue.InterfaceC4410 android.widget.Space r4, @Yue.InterfaceC4410 android.widget.TextView r5) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.imgDialogxMenuIcon = r2
            r0.imgDialogxMenuSelection = r3
            r0.spaceDialogxRightPadding = r4
            r0.txtDialogxMenuText = r5
            return
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.ItemDialogxMaterialBottomMenuNormalTextBinding bind(@Yue.InterfaceC4410 android.view.View r8) {
            int r0 = com.kongzue.dialogx.R.id.img_dialogx_menu_icon
            android.view.View r1 = Yue.C6792.m26085(r8, r0)
            r4 = r1
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L36
            int r0 = com.kongzue.dialogx.R.id.img_dialogx_menu_selection
            android.view.View r1 = Yue.C6792.m26085(r8, r0)
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L36
            int r0 = com.kongzue.dialogx.R.id.space_dialogx_right_padding
            android.view.View r1 = Yue.C6792.m26085(r8, r0)
            r6 = r1
            android.widget.Space r6 = (android.widget.Space) r6
            if (r6 == 0) goto L36
            int r0 = com.kongzue.dialogx.R.id.txt_dialogx_menu_text
            android.view.View r1 = Yue.C6792.m26085(r8, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L36
            com.kongzue.dialogx.databinding.ItemDialogxMaterialBottomMenuNormalTextBinding r0 = new com.kongzue.dialogx.databinding.ItemDialogxMaterialBottomMenuNormalTextBinding
            r3 = r8
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L36:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.ItemDialogxMaterialBottomMenuNormalTextBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.kongzue.dialogx.databinding.ItemDialogxMaterialBottomMenuNormalTextBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.ItemDialogxMaterialBottomMenuNormalTextBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2, @Yue.InterfaceC4544 android.view.ViewGroup r3, boolean r4) {
            int r0 = com.kongzue.dialogx.R.layout.item_dialogx_material_bottom_menu_normal_text
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            com.kongzue.dialogx.databinding.ItemDialogxMaterialBottomMenuNormalTextBinding r2 = bind(r2)
            return r2
    }

    @Override // Yue.InterfaceC6791
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.getRoot()
            return r0
    }

    @Override // Yue.InterfaceC6791
    @Yue.InterfaceC4410
    public android.widget.LinearLayout getRoot() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.rootView
            return r0
    }
}
