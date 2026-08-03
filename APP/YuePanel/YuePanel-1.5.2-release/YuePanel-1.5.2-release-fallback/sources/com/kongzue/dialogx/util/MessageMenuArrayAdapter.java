package com.kongzue.dialogx.util;

/* JADX INFO: loaded from: classes2.dex */
public class MessageMenuArrayAdapter extends android.widget.BaseAdapter {
    public android.content.Context context;
    com.kongzue.dialogx.util.TextInfo defaultMenuTextInfo;
    private com.kongzue.dialogx.dialogs.MessageMenu messageMenu;
    public java.util.List<java.lang.CharSequence> objects;

    public class ViewHolder {
        android.widget.ImageView imgDialogxMenuIcon;
        android.widget.ImageView imgDialogxMenuSelection;
        android.widget.Space spaceDialogxRightPadding;
        final /* synthetic */ com.kongzue.dialogx.util.MessageMenuArrayAdapter this$0;
        android.widget.TextView txtDialogxMenuText;

        public ViewHolder(com.kongzue.dialogx.util.MessageMenuArrayAdapter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }
    }

    public MessageMenuArrayAdapter(com.kongzue.dialogx.dialogs.MessageMenu r1, android.content.Context r2, java.util.List<java.lang.CharSequence> r3) {
            r0 = this;
            r0.<init>()
            r0.objects = r3
            r0.context = r2
            r0.messageMenu = r1
            return
    }

    private int px2dip(float r2) {
            r1 = this;
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            java.util.List<java.lang.CharSequence> r0 = r1.objects
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.CharSequence getItem(int r2) {
            r1 = this;
            java.util.List<java.lang.CharSequence> r0 = r1.objects
            java.lang.Object r2 = r0.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            return r2
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            java.lang.CharSequence r1 = r0.getItem(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
            r11 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            if (r13 != 0) goto La8
            com.kongzue.dialogx.util.MessageMenuArrayAdapter$ViewHolder r13 = new com.kongzue.dialogx.util.MessageMenuArrayAdapter$ViewHolder
            r13.<init>(r11)
            android.content.Context r3 = r11.context
            android.view.LayoutInflater r3 = com.kongzue.dialogx.wrapper.ModuleUtil.getLayoutInflater(r3)
            int r4 = com.kongzue.dialogx.R.layout.item_dialogx_material_bottom_menu_normal_text
            com.kongzue.dialogx.dialogs.MessageMenu r5 = r11.messageMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r5 = r5.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r5 = r5.overrideBottomDialogRes()
            if (r5 == 0) goto L75
            com.kongzue.dialogx.dialogs.MessageMenu r4 = r11.messageMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r4 = r4.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r4 = r4.overrideBottomDialogRes()
            com.kongzue.dialogx.dialogs.MessageMenu r5 = r11.messageMenu
            boolean r5 = r5.isLightTheme()
            int r6 = r11.getCount()
            int r4 = r4.overrideMenuItemLayout(r5, r12, r6, r2)
            if (r4 != 0) goto L3b
            int r4 = com.kongzue.dialogx.R.layout.item_dialogx_material_bottom_menu_normal_text
            goto L75
        L3b:
            com.kongzue.dialogx.dialogs.MessageMenu r5 = r11.messageMenu
            java.lang.CharSequence r5 = r5.getTitle()
            boolean r5 = com.kongzue.dialogx.interfaces.BaseDialog.isNull(r5)
            if (r5 == 0) goto L5b
            com.kongzue.dialogx.dialogs.MessageMenu r5 = r11.messageMenu
            java.lang.CharSequence r5 = r5.getMessage()
            boolean r5 = com.kongzue.dialogx.interfaces.BaseDialog.isNull(r5)
            if (r5 == 0) goto L5b
            com.kongzue.dialogx.dialogs.MessageMenu r5 = r11.messageMenu
            android.view.View r5 = r5.getCustomView()
            if (r5 == 0) goto L75
        L5b:
            if (r12 != 0) goto L75
            com.kongzue.dialogx.dialogs.MessageMenu r4 = r11.messageMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r4 = r4.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r4 = r4.overrideBottomDialogRes()
            com.kongzue.dialogx.dialogs.MessageMenu r5 = r11.messageMenu
            boolean r5 = r5.isLightTheme()
            int r6 = r11.getCount()
            int r4 = r4.overrideMenuItemLayout(r5, r12, r6, r1)
        L75:
            android.view.View r3 = r3.inflate(r4, r0)
            int r4 = com.kongzue.dialogx.R.id.img_dialogx_menu_icon
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r13.imgDialogxMenuIcon = r4
            int r4 = com.kongzue.dialogx.R.id.img_dialogx_menu_selection
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r13.imgDialogxMenuSelection = r4
            int r4 = com.kongzue.dialogx.R.id.txt_dialogx_menu_text
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r13.txtDialogxMenuText = r4
            int r4 = com.kongzue.dialogx.R.id.space_dialogx_right_padding
            android.view.View r4 = r3.findViewById(r4)
            android.widget.Space r4 = (android.widget.Space) r4
            r13.spaceDialogxRightPadding = r4
            r3.setTag(r13)
            r10 = r3
            r3 = r13
            r13 = r10
            goto Lae
        La8:
            java.lang.Object r3 = r13.getTag()
            com.kongzue.dialogx.util.MessageMenuArrayAdapter$ViewHolder r3 = (com.kongzue.dialogx.util.MessageMenuArrayAdapter.ViewHolder) r3
        Lae:
            com.kongzue.dialogx.dialogs.MessageMenu r4 = r11.messageMenu
            boolean r4 = r4.isMenuItemEnable(r12)
            if (r4 != 0) goto Lbd
            r4 = 1053609165(0x3ecccccd, float:0.4)
            r13.setAlpha(r4)
            goto Lc2
        Lbd:
            r4 = 1065353216(0x3f800000, float:1.0)
            r13.setAlpha(r4)
        Lc2:
            com.kongzue.dialogx.dialogs.MessageMenu r4 = r11.messageMenu
            com.kongzue.dialogx.interfaces.SELECT_MODE r4 = r4.getSelectMode()
            com.kongzue.dialogx.interfaces.SELECT_MODE r5 = com.kongzue.dialogx.interfaces.SELECT_MODE.SINGLE
            r6 = 4
            r7 = 8
            if (r4 != r5) goto L125
            android.widget.ImageView r4 = r3.imgDialogxMenuSelection
            if (r4 == 0) goto L190
            com.kongzue.dialogx.dialogs.MessageMenu r4 = r11.messageMenu
            int r4 = r4.getSelection()
            if (r4 != r12) goto Lfd
            android.widget.ImageView r4 = r3.imgDialogxMenuSelection
            r4.setVisibility(r2)
            com.kongzue.dialogx.dialogs.MessageMenu r4 = r11.messageMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r4 = r4.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r4 = r4.overrideBottomDialogRes()
            com.kongzue.dialogx.dialogs.MessageMenu r5 = r11.messageMenu
            boolean r5 = r5.isLightTheme()
            int r4 = r4.overrideSelectionImage(r5, r1)
            if (r4 == 0) goto L190
            android.widget.ImageView r5 = r3.imgDialogxMenuSelection
            r5.setImageResource(r4)
            goto L190
        Lfd:
            com.kongzue.dialogx.dialogs.MessageMenu r4 = r11.messageMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r4 = r4.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r4 = r4.overrideBottomDialogRes()
            com.kongzue.dialogx.dialogs.MessageMenu r5 = r11.messageMenu
            boolean r5 = r5.isLightTheme()
            int r4 = r4.overrideSelectionImage(r5, r2)
            if (r4 == 0) goto L11f
            android.widget.ImageView r5 = r3.imgDialogxMenuSelection
            r5.setVisibility(r2)
            android.widget.ImageView r5 = r3.imgDialogxMenuSelection
            r5.setImageResource(r4)
            goto L190
        L11f:
            android.widget.ImageView r4 = r3.imgDialogxMenuSelection
            r4.setVisibility(r6)
            goto L190
        L125:
            com.kongzue.dialogx.dialogs.MessageMenu r4 = r11.messageMenu
            com.kongzue.dialogx.interfaces.SELECT_MODE r4 = r4.getSelectMode()
            com.kongzue.dialogx.interfaces.SELECT_MODE r5 = com.kongzue.dialogx.interfaces.SELECT_MODE.MULTIPLE
            if (r4 != r5) goto L18b
            android.widget.ImageView r4 = r3.imgDialogxMenuSelection
            if (r4 == 0) goto L190
            com.kongzue.dialogx.dialogs.MessageMenu r4 = r11.messageMenu
            java.util.ArrayList r4 = r4.getSelectionList()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L164
            android.widget.ImageView r4 = r3.imgDialogxMenuSelection
            r4.setVisibility(r2)
            com.kongzue.dialogx.dialogs.MessageMenu r4 = r11.messageMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r4 = r4.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r4 = r4.overrideBottomDialogRes()
            com.kongzue.dialogx.dialogs.MessageMenu r5 = r11.messageMenu
            boolean r5 = r5.isLightTheme()
            int r4 = r4.overrideMultiSelectionImage(r5, r1)
            if (r4 == 0) goto L190
            android.widget.ImageView r5 = r3.imgDialogxMenuSelection
            r5.setImageResource(r4)
            goto L190
        L164:
            com.kongzue.dialogx.dialogs.MessageMenu r4 = r11.messageMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r4 = r4.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r4 = r4.overrideBottomDialogRes()
            com.kongzue.dialogx.dialogs.MessageMenu r5 = r11.messageMenu
            boolean r5 = r5.isLightTheme()
            int r4 = r4.overrideMultiSelectionImage(r5, r2)
            if (r4 == 0) goto L185
            android.widget.ImageView r5 = r3.imgDialogxMenuSelection
            r5.setVisibility(r2)
            android.widget.ImageView r5 = r3.imgDialogxMenuSelection
            r5.setImageResource(r4)
            goto L190
        L185:
            android.widget.ImageView r4 = r3.imgDialogxMenuSelection
            r4.setVisibility(r6)
            goto L190
        L18b:
            android.widget.ImageView r4 = r3.imgDialogxMenuSelection
            r4.setVisibility(r7)
        L190:
            com.kongzue.dialogx.dialogs.MessageMenu r4 = r11.messageMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r4 = r4.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r4 = r4.overrideBottomDialogRes()
            if (r4 == 0) goto L1b1
            com.kongzue.dialogx.dialogs.MessageMenu r4 = r11.messageMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r4 = r4.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r4 = r4.overrideBottomDialogRes()
            com.kongzue.dialogx.dialogs.MessageMenu r5 = r11.messageMenu
            boolean r5 = r5.isLightTheme()
            int r4 = r4.overrideSelectionMenuBackgroundColor(r5)
            goto L1b2
        L1b1:
            r4 = r2
        L1b2:
            com.kongzue.dialogx.dialogs.MessageMenu r5 = r11.messageMenu
            int r5 = r5.getSelection()
            if (r5 != r12) goto L1cd
            if (r4 == 0) goto L1cd
            android.content.Context r5 = r11.context
            android.content.res.Resources r5 = r5.getResources()
            int r4 = r5.getColor(r4)
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
            r13.setBackgroundTintList(r4)
        L1cd:
            java.util.List<java.lang.CharSequence> r4 = r11.objects
            java.lang.Object r4 = r4.get(r12)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            com.kongzue.dialogx.dialogs.MessageMenu r5 = r11.messageMenu
            boolean r5 = r5.isLightTheme()
            if (r5 == 0) goto L1e0
            int r5 = com.kongzue.dialogx.R.color.black90
            goto L1e2
        L1e0:
            int r5 = com.kongzue.dialogx.R.color.white90
        L1e2:
            com.kongzue.dialogx.dialogs.MessageMenu r6 = r11.messageMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r6 = r6.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r6 = r6.overrideBottomDialogRes()
            if (r6 == 0) goto L218
            com.kongzue.dialogx.dialogs.MessageMenu r6 = r11.messageMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r6 = r6.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r6 = r6.overrideBottomDialogRes()
            com.kongzue.dialogx.dialogs.MessageMenu r8 = r11.messageMenu
            boolean r8 = r8.isLightTheme()
            int r6 = r6.overrideMenuTextColor(r8)
            if (r6 == 0) goto L218
            com.kongzue.dialogx.dialogs.MessageMenu r5 = r11.messageMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r5 = r5.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r5 = r5.overrideBottomDialogRes()
            com.kongzue.dialogx.dialogs.MessageMenu r6 = r11.messageMenu
            boolean r6 = r6.isLightTheme()
            int r5 = r5.overrideMenuTextColor(r6)
        L218:
            if (r4 == 0) goto L44c
            com.kongzue.dialogx.util.TextInfo r6 = r11.defaultMenuTextInfo
            if (r6 != 0) goto L273
            com.kongzue.dialogx.util.TextInfo r6 = new com.kongzue.dialogx.util.TextInfo
            r6.<init>()
            android.widget.TextView r8 = r3.txtDialogxMenuText
            android.text.TextUtils$TruncateAt r8 = r8.getEllipsize()
            android.text.TextUtils$TruncateAt r9 = android.text.TextUtils.TruncateAt.END
            if (r8 != r9) goto L22e
            goto L22f
        L22e:
            r1 = r2
        L22f:
            com.kongzue.dialogx.util.TextInfo r1 = r6.setShowEllipsis(r1)
            android.widget.TextView r6 = r3.txtDialogxMenuText
            android.content.res.ColorStateList r6 = r6.getTextColors()
            int r6 = r6.getDefaultColor()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setFontColor(r6)
            android.widget.TextView r6 = r3.txtDialogxMenuText
            android.text.TextPaint r6 = r6.getPaint()
            boolean r6 = r6.isFakeBoldText()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setBold(r6)
            android.widget.TextView r6 = r3.txtDialogxMenuText
            float r6 = r6.getTextSize()
            int r6 = r11.px2dip(r6)
            com.kongzue.dialogx.util.TextInfo r1 = r1.setFontSize(r6)
            android.widget.TextView r6 = r3.txtDialogxMenuText
            int r6 = r6.getGravity()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setGravity(r6)
            android.widget.TextView r6 = r3.txtDialogxMenuText
            int r6 = r6.getMaxLines()
            com.kongzue.dialogx.util.TextInfo r1 = r1.setMaxLines(r6)
            r11.defaultMenuTextInfo = r1
        L273:
            android.widget.TextView r1 = r3.txtDialogxMenuText
            r1.setText(r4)
            android.widget.TextView r1 = r3.txtDialogxMenuText
            android.content.Context r6 = r11.context
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getColor(r5)
            r1.setTextColor(r6)
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r11.messageMenu
            com.kongzue.dialogx.interfaces.MenuItemTextInfoInterceptor r1 = r1.getMenuItemTextInfoInterceptor()
            if (r1 == 0) goto L2c3
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r11.messageMenu
            com.kongzue.dialogx.interfaces.MenuItemTextInfoInterceptor r1 = r1.getMenuItemTextInfoInterceptor()
            com.kongzue.dialogx.dialogs.MessageMenu r6 = r11.messageMenu
            java.lang.String r8 = r4.toString()
            com.kongzue.dialogx.util.TextInfo r1 = r1.menuItemTextInfo(r6, r12, r8)
            if (r1 == 0) goto L2a7
            android.widget.TextView r6 = r3.txtDialogxMenuText
            com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r6, r1)
            goto L2d6
        L2a7:
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r11.messageMenu
            com.kongzue.dialogx.util.TextInfo r1 = r1.getMenuTextInfo()
            if (r1 == 0) goto L2bb
            android.widget.TextView r1 = r3.txtDialogxMenuText
            com.kongzue.dialogx.dialogs.MessageMenu r6 = r11.messageMenu
            com.kongzue.dialogx.util.TextInfo r6 = r6.getMenuTextInfo()
            com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r1, r6)
            goto L2d6
        L2bb:
            android.widget.TextView r1 = r3.txtDialogxMenuText
            com.kongzue.dialogx.util.TextInfo r6 = r11.defaultMenuTextInfo
            com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r1, r6)
            goto L2d6
        L2c3:
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r11.messageMenu
            com.kongzue.dialogx.util.TextInfo r1 = r1.getMenuTextInfo()
            if (r1 == 0) goto L2d6
            android.widget.TextView r1 = r3.txtDialogxMenuText
            com.kongzue.dialogx.dialogs.MessageMenu r6 = r11.messageMenu
            com.kongzue.dialogx.util.TextInfo r6 = r6.getMenuTextInfo()
            com.kongzue.dialogx.interfaces.BaseDialog.useTextInfo(r1, r6)
        L2d6:
            android.widget.ImageView r1 = r3.imgDialogxMenuSelection
            if (r1 == 0) goto L315
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r11.messageMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r1.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r1 = r1.overrideBottomDialogRes()
            if (r1 == 0) goto L310
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r11.messageMenu
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r1.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r1 = r1.overrideBottomDialogRes()
            com.kongzue.dialogx.dialogs.MessageMenu r6 = r11.messageMenu
            boolean r6 = r6.isLightTheme()
            boolean r1 = r1.selectionImageTint(r6)
            if (r1 == 0) goto L310
            android.widget.ImageView r0 = r3.imgDialogxMenuSelection
            android.content.Context r1 = r11.context
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r5)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setImageTintList(r1)
            goto L315
        L310:
            android.widget.ImageView r1 = r3.imgDialogxMenuSelection
            r1.setImageTintList(r0)
        L315:
            com.kongzue.dialogx.dialogs.MessageMenu r0 = r11.messageMenu
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack r0 = r0.getOnIconChangeCallBack()
            if (r0 == 0) goto L3f6
            com.kongzue.dialogx.dialogs.MessageMenu r0 = r11.messageMenu
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack r0 = r0.getOnIconChangeCallBack()
            boolean r0 = r0 instanceof com.kongzue.dialogx.interfaces.MenuIconAdapter
            if (r0 == 0) goto L38f
            com.kongzue.dialogx.dialogs.MessageMenu r0 = r11.messageMenu
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack r0 = r0.getOnIconChangeCallBack()
            com.kongzue.dialogx.interfaces.MenuIconAdapter r0 = (com.kongzue.dialogx.interfaces.MenuIconAdapter) r0
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r11.messageMenu
            java.lang.String r4 = r4.toString()
            android.widget.ImageView r6 = r3.imgDialogxMenuIcon
            boolean r0 = r0.applyIcon(r1, r12, r4, r6)
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r11.messageMenu
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack r1 = r1.getOnIconChangeCallBack()
            java.lang.Boolean r1 = r1.isAutoTintIconInLightOrDarkMode()
            if (r1 != 0) goto L34e
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r11.messageMenu
            boolean r1 = r1.isAutoTintIconInLightOrDarkMode()
            goto L35c
        L34e:
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r11.messageMenu
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack r1 = r1.getOnIconChangeCallBack()
            java.lang.Boolean r1 = r1.isAutoTintIconInLightOrDarkMode()
            boolean r1 = r1.booleanValue()
        L35c:
            android.widget.ImageView r4 = r3.imgDialogxMenuIcon
            if (r0 == 0) goto L362
            r6 = r2
            goto L363
        L362:
            r6 = r7
        L363:
            r4.setVisibility(r6)
            if (r0 == 0) goto L386
            if (r1 == 0) goto L37d
            android.widget.ImageView r0 = r3.imgDialogxMenuIcon
            android.content.Context r1 = r11.context
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r5)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setImageTintList(r1)
        L37d:
            android.widget.Space r0 = r3.spaceDialogxRightPadding
            if (r0 == 0) goto L44c
            r0.setVisibility(r2)
            goto L44c
        L386:
            android.widget.Space r0 = r3.spaceDialogxRightPadding
            if (r0 == 0) goto L44c
            r0.setVisibility(r7)
            goto L44c
        L38f:
            com.kongzue.dialogx.dialogs.MessageMenu r0 = r11.messageMenu
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack r0 = r0.getOnIconChangeCallBack()
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r11.messageMenu
            java.lang.String r4 = r4.toString()
            int r0 = r0.getIcon(r1, r12, r4)
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r11.messageMenu
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack r1 = r1.getOnIconChangeCallBack()
            java.lang.Boolean r1 = r1.isAutoTintIconInLightOrDarkMode()
            if (r1 != 0) goto L3b2
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r11.messageMenu
            boolean r1 = r1.isAutoTintIconInLightOrDarkMode()
            goto L3c0
        L3b2:
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r11.messageMenu
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack r1 = r1.getOnIconChangeCallBack()
            java.lang.Boolean r1 = r1.isAutoTintIconInLightOrDarkMode()
            boolean r1 = r1.booleanValue()
        L3c0:
            if (r0 == 0) goto L3e9
            android.widget.ImageView r4 = r3.imgDialogxMenuIcon
            r4.setVisibility(r2)
            android.widget.ImageView r4 = r3.imgDialogxMenuIcon
            r4.setImageResource(r0)
            android.widget.Space r0 = r3.spaceDialogxRightPadding
            if (r0 == 0) goto L3d3
            r0.setVisibility(r2)
        L3d3:
            if (r1 == 0) goto L44c
            android.widget.ImageView r0 = r3.imgDialogxMenuIcon
            android.content.Context r1 = r11.context
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r5)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setImageTintList(r1)
            goto L44c
        L3e9:
            android.widget.ImageView r0 = r3.imgDialogxMenuIcon
            r0.setVisibility(r7)
            android.widget.Space r0 = r3.spaceDialogxRightPadding
            if (r0 == 0) goto L44c
            r0.setVisibility(r7)
            goto L44c
        L3f6:
            com.kongzue.dialogx.dialogs.MessageMenu r0 = r11.messageMenu
            java.util.List r0 = r0.getIconResIds()
            if (r0 == 0) goto L440
            com.kongzue.dialogx.dialogs.MessageMenu r0 = r11.messageMenu
            int r0 = r0.getIconResIds(r12)
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r11.messageMenu
            boolean r1 = r1.isAutoTintIconInLightOrDarkMode()
            if (r0 == 0) goto L433
            android.widget.ImageView r4 = r3.imgDialogxMenuIcon
            r4.setVisibility(r2)
            android.widget.ImageView r4 = r3.imgDialogxMenuIcon
            r4.setImageResource(r0)
            android.widget.Space r0 = r3.spaceDialogxRightPadding
            if (r0 == 0) goto L41d
            r0.setVisibility(r2)
        L41d:
            if (r1 == 0) goto L44c
            android.widget.ImageView r0 = r3.imgDialogxMenuIcon
            android.content.Context r1 = r11.context
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r5)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setImageTintList(r1)
            goto L44c
        L433:
            android.widget.ImageView r0 = r3.imgDialogxMenuIcon
            r0.setVisibility(r7)
            android.widget.Space r0 = r3.spaceDialogxRightPadding
            if (r0 == 0) goto L44c
            r0.setVisibility(r7)
            goto L44c
        L440:
            android.widget.ImageView r0 = r3.imgDialogxMenuIcon
            r0.setVisibility(r7)
            android.widget.Space r0 = r3.spaceDialogxRightPadding
            if (r0 == 0) goto L44c
            r0.setVisibility(r7)
        L44c:
            com.kongzue.dialogx.dialogs.MessageMenu r0 = r11.messageMenu
            com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback r0 = r0.getMenuMenuItemLayoutRefreshCallback()
            if (r0 == 0) goto L45f
            com.kongzue.dialogx.dialogs.MessageMenu r0 = r11.messageMenu
            com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback r0 = r0.getMenuMenuItemLayoutRefreshCallback()
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r11.messageMenu
            r0.getView(r1, r12, r13, r14)
        L45f:
            return r13
    }
}
