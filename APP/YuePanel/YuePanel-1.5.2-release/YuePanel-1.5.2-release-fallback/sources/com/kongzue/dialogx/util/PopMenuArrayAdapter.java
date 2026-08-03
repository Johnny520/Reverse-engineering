package com.kongzue.dialogx.util;

/* JADX INFO: loaded from: classes2.dex */
public class PopMenuArrayAdapter extends android.widget.BaseAdapter {
    public android.content.Context context;
    android.view.LayoutInflater mInflater;
    public java.util.List<java.lang.CharSequence> menuList;
    private com.kongzue.dialogx.dialogs.PopMenu popMenu;

    public class ViewHolder {
        android.widget.LinearLayout boxItem;
        android.widget.ImageView imgDialogxMenuIcon;
        android.widget.Space spaceDialogxRightPadding;
        final /* synthetic */ com.kongzue.dialogx.util.PopMenuArrayAdapter this$0;
        android.widget.TextView txtDialogxMenuText;

        public ViewHolder(com.kongzue.dialogx.util.PopMenuArrayAdapter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }
    }

    public PopMenuArrayAdapter(com.kongzue.dialogx.dialogs.PopMenu r1, android.content.Context r2, java.util.List<java.lang.CharSequence> r3) {
            r0 = this;
            r0.<init>()
            r0.popMenu = r1
            r0.menuList = r3
            r0.context = r2
            android.view.LayoutInflater r1 = com.kongzue.dialogx.wrapper.ModuleUtil.getLayoutInflater(r2)
            r0.mInflater = r1
            return
    }

    private boolean isHaveProperties(int r1, int r2) {
            r0 = this;
            r1 = r1 & r2
            if (r1 != r2) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            return r1
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            java.util.List<java.lang.CharSequence> r0 = r1.menuList
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.menuList = r0
        Lb:
            java.util.List<java.lang.CharSequence> r0 = r1.menuList
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int r2) {
            r1 = this;
            java.util.List<java.lang.CharSequence> r0 = r1.menuList
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    public java.util.List<java.lang.CharSequence> getMenuList() {
            r1 = this;
            java.util.List<java.lang.CharSequence> r0 = r1.menuList
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
            r9 = this;
            if (r11 != 0) goto L62
            com.kongzue.dialogx.util.PopMenuArrayAdapter$ViewHolder r11 = new com.kongzue.dialogx.util.PopMenuArrayAdapter$ViewHolder
            r11.<init>(r9)
            int r0 = com.kongzue.dialogx.R.layout.item_dialogx_material_context_menu_normal_text
            com.kongzue.dialogx.dialogs.PopMenu r1 = r9.popMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r1.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r1 = r1.popMenuSettings()
            if (r1 == 0) goto L2c
            com.kongzue.dialogx.dialogs.PopMenu r1 = r9.popMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r1.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r1 = r1.popMenuSettings()
            com.kongzue.dialogx.dialogs.PopMenu r2 = r9.popMenu
            boolean r2 = r2.isLightTheme()
            int r1 = r1.overrideMenuItemLayoutRes(r2)
            if (r1 == 0) goto L2c
            r0 = r1
        L2c:
            android.view.LayoutInflater r1 = r9.mInflater
            r2 = 0
            android.view.View r0 = r1.inflate(r0, r2)
            int r1 = com.kongzue.dialogx.R.id.box_item
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r11.boxItem = r1
            int r1 = com.kongzue.dialogx.R.id.img_dialogx_menu_icon
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r11.imgDialogxMenuIcon = r1
            int r1 = com.kongzue.dialogx.R.id.txt_dialogx_menu_text
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r11.txtDialogxMenuText = r1
            int r1 = com.kongzue.dialogx.R.id.space_dialogx_right_padding
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Space r1 = (android.widget.Space) r1
            r11.spaceDialogxRightPadding = r1
            r0.setTag(r11)
            r8 = r0
            r0 = r11
            r11 = r8
            goto L68
        L62:
            java.lang.Object r0 = r11.getTag()
            com.kongzue.dialogx.util.PopMenuArrayAdapter$ViewHolder r0 = (com.kongzue.dialogx.util.PopMenuArrayAdapter.ViewHolder) r0
        L68:
            com.kongzue.dialogx.dialogs.PopMenu r1 = r9.popMenu
            boolean r1 = r1.isMenuItemEnable(r10)
            if (r1 != 0) goto L77
            r1 = 1053609165(0x3ecccccd, float:0.4)
            r11.setAlpha(r1)
            goto L7c
        L77:
            r1 = 1065353216(0x3f800000, float:1.0)
            r11.setAlpha(r1)
        L7c:
            com.kongzue.dialogx.dialogs.PopMenu r1 = r9.popMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r1.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r1 = r1.popMenuSettings()
            r2 = 0
            if (r1 != 0) goto L8b
            r1 = r2
            goto La3
        L8b:
            com.kongzue.dialogx.dialogs.PopMenu r1 = r9.popMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r1.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r1 = r1.popMenuSettings()
            com.kongzue.dialogx.dialogs.PopMenu r3 = r9.popMenu
            boolean r3 = r3.isLightTheme()
            int r4 = r9.getCount()
            int r1 = r1.overrideMenuItemBackgroundRes(r3, r10, r4, r2)
        La3:
            if (r1 == 0) goto La8
            r11.setBackgroundResource(r1)
        La8:
            android.widget.LinearLayout r1 = r0.boxItem
            if (r1 == 0) goto Lce
            com.kongzue.dialogx.dialogs.PopMenu r1 = r9.popMenu
            int r1 = r1.getPressedIndex()
            if (r1 != r10) goto Lc7
            android.widget.LinearLayout r1 = r0.boxItem
            com.kongzue.dialogx.dialogs.PopMenu r3 = r9.popMenu
            boolean r3 = r3.isLightTheme()
            if (r3 == 0) goto Lc1
            int r3 = com.kongzue.dialogx.R.color.black5
            goto Lc3
        Lc1:
            int r3 = com.kongzue.dialogx.R.color.white5
        Lc3:
            r1.setBackgroundResource(r3)
            goto Lce
        Lc7:
            android.widget.LinearLayout r1 = r0.boxItem
            int r3 = com.kongzue.dialogx.R.color.empty
            r1.setBackgroundResource(r3)
        Lce:
            android.widget.ImageView r1 = r0.imgDialogxMenuIcon
            r3 = 8
            r1.setVisibility(r3)
            android.widget.TextView r1 = r0.txtDialogxMenuText
            java.util.List<java.lang.CharSequence> r4 = r9.menuList
            java.lang.Object r4 = r4.get(r10)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r1.setText(r4)
            com.kongzue.dialogx.dialogs.PopMenu r1 = r9.popMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r1.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r1 = r1.popMenuSettings()
            r4 = 1
            if (r1 == 0) goto L12f
            com.kongzue.dialogx.dialogs.PopMenu r1 = r9.popMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r1.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r1 = r1.popMenuSettings()
            int r1 = r1.paddingVertical()
            if (r1 == 0) goto L12f
            if (r10 != 0) goto L113
            com.kongzue.dialogx.dialogs.PopMenu r1 = r9.popMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r1.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r1 = r1.popMenuSettings()
            int r1 = r1.paddingVertical()
            r11.setPadding(r2, r1, r2, r2)
            goto L12f
        L113:
            int r1 = r9.getCount()
            int r1 = r1 - r4
            if (r10 != r1) goto L12c
            com.kongzue.dialogx.dialogs.PopMenu r1 = r9.popMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r1.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r1 = r1.popMenuSettings()
            int r1 = r1.paddingVertical()
            r11.setPadding(r2, r2, r2, r1)
            goto L12f
        L12c:
            r11.setPadding(r2, r2, r2, r2)
        L12f:
            com.kongzue.dialogx.dialogs.PopMenu r1 = r9.popMenu
            boolean r1 = r1.isLightTheme()
            if (r1 == 0) goto L13a
            int r1 = com.kongzue.dialogx.R.color.black90
            goto L13c
        L13a:
            int r1 = com.kongzue.dialogx.R.color.white90
        L13c:
            android.widget.TextView r5 = r0.txtDialogxMenuText
            android.content.Context r6 = r9.context
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getColor(r1)
            r5.setTextColor(r6)
            com.kongzue.dialogx.dialogs.PopMenu r5 = r9.popMenu
            com.kongzue.dialogx.util.TextInfo r5 = r5.getMenuTextInfo()
            if (r5 == 0) goto L15e
            android.widget.TextView r5 = r0.txtDialogxMenuText
            com.kongzue.dialogx.dialogs.PopMenu r6 = r9.popMenu
            com.kongzue.dialogx.util.TextInfo r6 = r6.getMenuTextInfo()
            com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r5, r6)
        L15e:
            com.kongzue.dialogx.dialogs.PopMenu r5 = r9.popMenu
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack r5 = r5.getOnIconChangeCallBack()
            if (r5 == 0) goto L269
            com.kongzue.dialogx.dialogs.PopMenu r5 = r9.popMenu
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack r5 = r5.getOnIconChangeCallBack()
            boolean r5 = r5 instanceof com.kongzue.dialogx.interfaces.MenuIconAdapter
            if (r5 == 0) goto L1e0
            com.kongzue.dialogx.dialogs.PopMenu r4 = r9.popMenu
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack r4 = r4.getOnIconChangeCallBack()
            com.kongzue.dialogx.interfaces.MenuIconAdapter r4 = (com.kongzue.dialogx.interfaces.MenuIconAdapter) r4
            com.kongzue.dialogx.dialogs.PopMenu r5 = r9.popMenu
            java.util.List<java.lang.CharSequence> r6 = r9.menuList
            java.lang.Object r6 = r6.get(r10)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r6 = r6.toString()
            android.widget.ImageView r7 = r0.imgDialogxMenuIcon
            boolean r4 = r4.applyIcon(r5, r10, r6, r7)
            com.kongzue.dialogx.dialogs.PopMenu r5 = r9.popMenu
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack r5 = r5.getOnIconChangeCallBack()
            java.lang.Boolean r5 = r5.isAutoTintIconInLightOrDarkMode()
            if (r5 != 0) goto L19f
            com.kongzue.dialogx.dialogs.PopMenu r5 = r9.popMenu
            boolean r5 = r5.isAutoTintIconInLightOrDarkMode()
            goto L1ad
        L19f:
            com.kongzue.dialogx.dialogs.PopMenu r5 = r9.popMenu
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack r5 = r5.getOnIconChangeCallBack()
            java.lang.Boolean r5 = r5.isAutoTintIconInLightOrDarkMode()
            boolean r5 = r5.booleanValue()
        L1ad:
            android.widget.ImageView r6 = r0.imgDialogxMenuIcon
            if (r4 == 0) goto L1b3
            r7 = r2
            goto L1b4
        L1b3:
            r7 = r3
        L1b4:
            r6.setVisibility(r7)
            if (r4 == 0) goto L1d7
            if (r5 == 0) goto L1ce
            android.widget.ImageView r3 = r0.imgDialogxMenuIcon
            android.content.Context r4 = r9.context
            android.content.res.Resources r4 = r4.getResources()
            int r1 = r4.getColor(r1)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r3.setImageTintList(r1)
        L1ce:
            android.widget.Space r0 = r0.spaceDialogxRightPadding
            if (r0 == 0) goto L2bf
            r0.setVisibility(r2)
            goto L2bf
        L1d7:
            android.widget.Space r0 = r0.spaceDialogxRightPadding
            if (r0 == 0) goto L2bf
            r0.setVisibility(r3)
            goto L2bf
        L1e0:
            com.kongzue.dialogx.dialogs.PopMenu r5 = r9.popMenu
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack r5 = r5.getOnIconChangeCallBack()
            com.kongzue.dialogx.dialogs.PopMenu r6 = r9.popMenu
            java.util.List<java.lang.CharSequence> r7 = r9.menuList
            java.lang.Object r7 = r7.get(r10)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r7 = r7.toString()
            int r5 = r5.getIcon(r6, r10, r7)
            com.kongzue.dialogx.dialogs.PopMenu r6 = r9.popMenu
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack r6 = r6.getOnIconChangeCallBack()
            java.lang.Boolean r6 = r6.isAutoTintIconInLightOrDarkMode()
            if (r6 != 0) goto L20b
            com.kongzue.dialogx.dialogs.PopMenu r6 = r9.popMenu
            boolean r6 = r6.isAutoTintIconInLightOrDarkMode()
            goto L219
        L20b:
            com.kongzue.dialogx.dialogs.PopMenu r6 = r9.popMenu
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack r6 = r6.getOnIconChangeCallBack()
            java.lang.Boolean r6 = r6.isAutoTintIconInLightOrDarkMode()
            boolean r6 = r6.booleanValue()
        L219:
            if (r5 == 0) goto L25c
            android.widget.ImageView r3 = r0.imgDialogxMenuIcon
            r3.setVisibility(r2)
            android.widget.ImageView r3 = r0.imgDialogxMenuIcon
            r3.setImageResource(r5)
            android.widget.TextView r3 = r0.txtDialogxMenuText
            int r3 = r3.getGravity()
            r5 = 17
            boolean r3 = r9.isHaveProperties(r3, r5)
            if (r3 != 0) goto L23f
            android.widget.TextView r3 = r0.txtDialogxMenuText
            int r3 = r3.getGravity()
            boolean r3 = r9.isHaveProperties(r3, r4)
            if (r3 == 0) goto L246
        L23f:
            android.widget.Space r3 = r0.spaceDialogxRightPadding
            if (r3 == 0) goto L246
            r3.setVisibility(r2)
        L246:
            if (r6 == 0) goto L2bf
            android.widget.ImageView r0 = r0.imgDialogxMenuIcon
            android.content.Context r2 = r9.context
            android.content.res.Resources r2 = r2.getResources()
            int r1 = r2.getColor(r1)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setImageTintList(r1)
            goto L2bf
        L25c:
            android.widget.ImageView r1 = r0.imgDialogxMenuIcon
            r1.setVisibility(r3)
            android.widget.Space r0 = r0.spaceDialogxRightPadding
            if (r0 == 0) goto L2bf
            r0.setVisibility(r3)
            goto L2bf
        L269:
            com.kongzue.dialogx.dialogs.PopMenu r4 = r9.popMenu
            java.util.List r4 = r4.getIconResIds()
            if (r4 == 0) goto L2b3
            com.kongzue.dialogx.dialogs.PopMenu r4 = r9.popMenu
            int r4 = r4.getIconResIds(r10)
            com.kongzue.dialogx.dialogs.PopMenu r5 = r9.popMenu
            boolean r5 = r5.isAutoTintIconInLightOrDarkMode()
            if (r4 == 0) goto L2a6
            android.widget.ImageView r3 = r0.imgDialogxMenuIcon
            r3.setVisibility(r2)
            android.widget.ImageView r3 = r0.imgDialogxMenuIcon
            r3.setImageResource(r4)
            android.widget.Space r3 = r0.spaceDialogxRightPadding
            if (r3 == 0) goto L290
            r3.setVisibility(r2)
        L290:
            if (r5 == 0) goto L2bf
            android.widget.ImageView r0 = r0.imgDialogxMenuIcon
            android.content.Context r2 = r9.context
            android.content.res.Resources r2 = r2.getResources()
            int r1 = r2.getColor(r1)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setImageTintList(r1)
            goto L2bf
        L2a6:
            android.widget.ImageView r1 = r0.imgDialogxMenuIcon
            r1.setVisibility(r3)
            android.widget.Space r0 = r0.spaceDialogxRightPadding
            if (r0 == 0) goto L2bf
            r0.setVisibility(r3)
            goto L2bf
        L2b3:
            android.widget.ImageView r1 = r0.imgDialogxMenuIcon
            r1.setVisibility(r3)
            android.widget.Space r0 = r0.spaceDialogxRightPadding
            if (r0 == 0) goto L2bf
            r0.setVisibility(r3)
        L2bf:
            com.kongzue.dialogx.dialogs.PopMenu r0 = r9.popMenu
            com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback r0 = r0.getMenuMenuItemLayoutRefreshCallback()
            if (r0 == 0) goto L2d2
            com.kongzue.dialogx.dialogs.PopMenu r0 = r9.popMenu
            com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback r0 = r0.getMenuMenuItemLayoutRefreshCallback()
            com.kongzue.dialogx.dialogs.PopMenu r1 = r9.popMenu
            r0.getView(r1, r10, r11, r12)
        L2d2:
            return r11
    }
}
