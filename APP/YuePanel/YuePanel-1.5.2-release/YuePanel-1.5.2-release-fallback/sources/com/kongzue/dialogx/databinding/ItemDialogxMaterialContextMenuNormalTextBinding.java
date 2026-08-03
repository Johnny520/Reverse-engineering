package com.kongzue.dialogx.databinding;

/* JADX INFO: loaded from: classes2.dex */
public final class ItemDialogxMaterialContextMenuNormalTextBinding implements Yue.InterfaceC6791 {

    @Yue.InterfaceC4410
    public final android.widget.LinearLayout boxItem;

    @Yue.InterfaceC4410
    public final android.widget.ImageView imgDialogxMenuIcon;

    @Yue.InterfaceC4410
    private final android.widget.LinearLayout rootView;

    @Yue.InterfaceC4410
    public final android.widget.Space spaceDialogxRightPadding;

    @Yue.InterfaceC4410
    public final android.widget.TextView txtDialogxMenuText;

    private ItemDialogxMaterialContextMenuNormalTextBinding(@Yue.InterfaceC4410 android.widget.LinearLayout r1, @Yue.InterfaceC4410 android.widget.LinearLayout r2, @Yue.InterfaceC4410 android.widget.ImageView r3, @Yue.InterfaceC4410 android.widget.Space r4, @Yue.InterfaceC4410 android.widget.TextView r5) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.boxItem = r2
            r0.imgDialogxMenuIcon = r3
            r0.spaceDialogxRightPadding = r4
            r0.txtDialogxMenuText = r5
            return
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.ItemDialogxMaterialContextMenuNormalTextBinding bind(@Yue.InterfaceC4410 android.view.View r6) {
            r2 = r6
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            int r0 = com.kongzue.dialogx.R.id.img_dialogx_menu_icon
            android.view.View r1 = Yue.C6792.m26085(r6, r0)
            r3 = r1
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r3 == 0) goto L2c
            int r0 = com.kongzue.dialogx.R.id.space_dialogx_right_padding
            android.view.View r1 = Yue.C6792.m26085(r6, r0)
            r4 = r1
            android.widget.Space r4 = (android.widget.Space) r4
            if (r4 == 0) goto L2c
            int r0 = com.kongzue.dialogx.R.id.txt_dialogx_menu_text
            android.view.View r1 = Yue.C6792.m26085(r6, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L2c
            com.kongzue.dialogx.databinding.ItemDialogxMaterialContextMenuNormalTextBinding r6 = new com.kongzue.dialogx.databinding.ItemDialogxMaterialContextMenuNormalTextBinding
            r0 = r6
            r1 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L2c:
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r6 = r6.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.ItemDialogxMaterialContextMenuNormalTextBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.kongzue.dialogx.databinding.ItemDialogxMaterialContextMenuNormalTextBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.ItemDialogxMaterialContextMenuNormalTextBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2, @Yue.InterfaceC4544 android.view.ViewGroup r3, boolean r4) {
            int r0 = com.kongzue.dialogx.R.layout.item_dialogx_material_context_menu_normal_text
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            com.kongzue.dialogx.databinding.ItemDialogxMaterialContextMenuNormalTextBinding r2 = bind(r2)
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
