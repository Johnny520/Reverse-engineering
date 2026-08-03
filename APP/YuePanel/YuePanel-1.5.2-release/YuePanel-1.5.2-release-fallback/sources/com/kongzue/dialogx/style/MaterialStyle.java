package com.kongzue.dialogx.style;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialStyle extends com.kongzue.dialogx.interfaces.DialogXStyle {

    public class DefaultBottomDialogRes extends com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes {
        final /* synthetic */ com.kongzue.dialogx.style.MaterialStyle this$0;

        public DefaultBottomDialogRes(com.kongzue.dialogx.style.MaterialStyle r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public float overrideBottomDialogMaxHeight() {
                r1 = this;
                r0 = 1058642330(0x3f19999a, float:0.6)
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public int overrideDialogLayout(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L5
                int r1 = com.kongzue.dialogx.R.layout.layout_dialogx_bottom_material
                goto L7
            L5:
                int r1 = com.kongzue.dialogx.R.layout.layout_dialogx_bottom_material_dark
            L7:
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public int overrideMenuDividerDrawableRes(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L5
                int r1 = com.kongzue.dialogx.R.drawable.rect_dialogx_material_menu_split_divider
                goto L7
            L5:
                int r1 = com.kongzue.dialogx.R.drawable.rect_dialogx_material_menu_split_divider_night
            L7:
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public int overrideMenuDividerHeight(boolean r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public int overrideMenuItemLayout(boolean r1, int r2, int r3, boolean r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public int overrideMenuTextColor(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L5
                int r1 = com.kongzue.dialogx.R.color.black90
                goto L7
            L5:
                int r1 = com.kongzue.dialogx.R.color.white90
            L7:
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public int overrideMultiSelectionImage(boolean r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L5
                int r1 = com.kongzue.dialogx.R.mipmap.img_dialogx_bottom_menu_material_item_multi_selection
                goto L7
            L5:
                int r1 = com.kongzue.dialogx.R.mipmap.img_dialogx_bottom_menu_material_item_non_multi_select
            L7:
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public int overrideSelectionImage(boolean r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L5
                int r1 = com.kongzue.dialogx.R.mipmap.img_dialogx_bottom_menu_material_item_selection
                goto L7
            L5:
                int r1 = com.kongzue.dialogx.R.mipmap.img_dialogx_bottom_menu_material_item_non_select
            L7:
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public int overrideSelectionMenuBackgroundColor(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public boolean selectionImageTint(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public boolean touchSlide() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public class DefaultHorizontalButtonRes extends com.kongzue.dialogx.interfaces.DialogXStyle.HorizontalButtonRes {
        final /* synthetic */ com.kongzue.dialogx.style.MaterialStyle this$0;

        public DefaultHorizontalButtonRes(com.kongzue.dialogx.style.MaterialStyle r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.HorizontalButtonRes
        public int overrideHorizontalCancelButtonBackgroundRes(int r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L5
                int r1 = com.kongzue.dialogx.R.drawable.button_dialogx_material_light
                goto L7
            L5:
                int r1 = com.kongzue.dialogx.R.drawable.button_dialogx_material_night
            L7:
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.HorizontalButtonRes
        public int overrideHorizontalOkButtonBackgroundRes(int r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L5
                int r1 = com.kongzue.dialogx.R.drawable.button_dialogx_material_light
                goto L7
            L5:
                int r1 = com.kongzue.dialogx.R.drawable.button_dialogx_material_night
            L7:
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.HorizontalButtonRes
        public int overrideHorizontalOtherButtonBackgroundRes(int r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L5
                int r1 = com.kongzue.dialogx.R.drawable.button_dialogx_material_light
                goto L7
            L5:
                int r1 = com.kongzue.dialogx.R.drawable.button_dialogx_material_night
            L7:
                return r1
        }
    }

    public class DefaultPopMenuSettings extends com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings {
        final /* synthetic */ com.kongzue.dialogx.style.MaterialStyle this$0;

        public DefaultPopMenuSettings(com.kongzue.dialogx.style.MaterialStyle r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int backgroundMaskColorRes() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public com.kongzue.dialogx.interfaces.DialogXStyle.BlurBackgroundSetting blurBackgroundSettings() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int layout(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L5
                int r1 = com.kongzue.dialogx.R.layout.layout_dialogx_popmenu_material
                goto L7
            L5:
                int r1 = com.kongzue.dialogx.R.layout.layout_dialogx_popmenu_material_dark
            L7:
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int overrideMenuDividerDrawableRes(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int overrideMenuDividerHeight(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int overrideMenuItemBackgroundRes(boolean r1, int r2, int r3, boolean r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int overrideMenuItemLayoutRes(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int overrideMenuTextColor(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L5
                int r1 = com.kongzue.dialogx.R.color.black90
                goto L7
            L5:
                int r1 = com.kongzue.dialogx.R.color.white90
            L7:
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int overrideSelectionMenuBackgroundColor(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int paddingVertical() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public boolean selectionImageTint(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public class DefaultPopNotificationSettings extends com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings {
        final /* synthetic */ com.kongzue.dialogx.style.MaterialStyle this$0;

        public DefaultPopNotificationSettings(com.kongzue.dialogx.style.MaterialStyle r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings
        public com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN align() {
                r1 = this;
                com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r0 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.TOP
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings
        public int enterAnimResId(boolean r1) {
                r0 = this;
                int r1 = com.kongzue.dialogx.R.anim.anim_dialogx_notification_enter
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings
        public int exitAnimResId(boolean r1) {
                r0 = this;
                int r1 = com.kongzue.dialogx.R.anim.anim_dialogx_notification_exit
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings
        public int layout(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L5
                int r1 = com.kongzue.dialogx.R.layout.layout_dialogx_popnotification_material
                goto L7
            L5:
                int r1 = com.kongzue.dialogx.R.layout.layout_dialogx_popnotification_material_dark
            L7:
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings
        public boolean tintIcon() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public class DefaultPopTipSettings extends com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings {
        final /* synthetic */ com.kongzue.dialogx.style.MaterialStyle this$0;

        public DefaultPopTipSettings(com.kongzue.dialogx.style.MaterialStyle r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings
        public com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN align() {
                r1 = this;
                com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r0 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.BOTTOM
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings
        public int enterAnimResId(boolean r1) {
                r0 = this;
                int r1 = com.kongzue.dialogx.R.anim.anim_dialogx_default_enter
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings
        public int exitAnimResId(boolean r1) {
                r0 = this;
                int r1 = com.kongzue.dialogx.R.anim.anim_dialogx_default_exit
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings
        public int layout(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L5
                int r1 = com.kongzue.dialogx.R.layout.layout_dialogx_poptip_material
                goto L7
            L5:
                int r1 = com.kongzue.dialogx.R.layout.layout_dialogx_poptip_material_dark
            L7:
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings
        public boolean tintIcon() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public class DefaultVerticalButtonRes extends com.kongzue.dialogx.interfaces.DialogXStyle.VerticalButtonRes {
        final /* synthetic */ com.kongzue.dialogx.style.MaterialStyle this$0;

        public DefaultVerticalButtonRes(com.kongzue.dialogx.style.MaterialStyle r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.VerticalButtonRes
        public int overrideVerticalCancelButtonBackgroundRes(int r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L5
                int r1 = com.kongzue.dialogx.R.drawable.button_dialogx_material_light
                goto L7
            L5:
                int r1 = com.kongzue.dialogx.R.drawable.button_dialogx_material_night
            L7:
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.VerticalButtonRes
        public int overrideVerticalOkButtonBackgroundRes(int r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L5
                int r1 = com.kongzue.dialogx.R.drawable.button_dialogx_material_light
                goto L7
            L5:
                int r1 = com.kongzue.dialogx.R.drawable.button_dialogx_material_night
            L7:
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.VerticalButtonRes
        public int overrideVerticalOtherButtonBackgroundRes(int r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L5
                int r1 = com.kongzue.dialogx.R.drawable.button_dialogx_material_light
                goto L7
            L5:
                int r1 = com.kongzue.dialogx.R.drawable.button_dialogx_material_night
            L7:
                return r1
        }
    }

    public class DefaultWaitTipRes extends com.kongzue.dialogx.interfaces.DialogXStyle.WaitTipRes {
        final /* synthetic */ com.kongzue.dialogx.style.MaterialStyle this$0;

        public DefaultWaitTipRes(com.kongzue.dialogx.style.MaterialStyle r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.WaitTipRes
        public boolean blurBackground() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.WaitTipRes
        public int overrideBackgroundColorRes(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.WaitTipRes
        public int overrideRadiusPx() {
                r1 = this;
                r0 = -1
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.WaitTipRes
        public int overrideTextColorRes(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L5
                int r1 = com.kongzue.dialogx.R.color.white
                goto L7
            L5:
                int r1 = com.kongzue.dialogx.R.color.black
            L7:
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.WaitTipRes
        public int overrideWaitLayout(boolean r1) {
                r0 = this;
                int r1 = com.kongzue.dialogx.R.layout.layout_dialogx_wait
                return r1
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.WaitTipRes
        public com.kongzue.dialogx.interfaces.ProgressViewInterface overrideWaitView(android.content.Context r1, boolean r2) {
                r0 = this;
                com.kongzue.dialogx.util.views.ProgressView r2 = new com.kongzue.dialogx.util.views.ProgressView
                r2.<init>(r1)
                return r2
        }
    }

    public MaterialStyle() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kongzue.dialogx.style.MaterialStyle style() {
            com.kongzue.dialogx.style.MaterialStyle r0 = new com.kongzue.dialogx.style.MaterialStyle
            r0.<init>()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public int enterAnimResId() {
            r1 = this;
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_default_enter
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public int exitAnimResId() {
            r1 = this;
            int r0 = com.kongzue.dialogx.R.anim.anim_dialogx_default_exit
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public int[] horizontalButtonOrder() {
            r4 = this;
            r0 = 2
            r1 = 1
            r2 = 3
            r3 = 4
            int[] r0 = new int[]{r2, r3, r0, r1}
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public int layout(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            int r1 = com.kongzue.dialogx.R.layout.layout_dialogx_material
            goto L7
        L5:
            int r1 = com.kongzue.dialogx.R.layout.layout_dialogx_material_dark
        L7:
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public com.kongzue.dialogx.interfaces.DialogXStyle.BlurBackgroundSetting messageDialogBlurSettings() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes overrideBottomDialogRes() {
            r1 = this;
            com.kongzue.dialogx.style.MaterialStyle$DefaultBottomDialogRes r0 = new com.kongzue.dialogx.style.MaterialStyle$DefaultBottomDialogRes
            r0.<init>(r1)
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public com.kongzue.dialogx.interfaces.DialogXStyle.HorizontalButtonRes overrideHorizontalButtonRes() {
            r1 = this;
            com.kongzue.dialogx.style.MaterialStyle$DefaultHorizontalButtonRes r0 = new com.kongzue.dialogx.style.MaterialStyle$DefaultHorizontalButtonRes
            r0.<init>(r1)
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public com.kongzue.dialogx.interfaces.DialogXStyle.VerticalButtonRes overrideVerticalButtonRes() {
            r1 = this;
            com.kongzue.dialogx.style.MaterialStyle$DefaultVerticalButtonRes r0 = new com.kongzue.dialogx.style.MaterialStyle$DefaultVerticalButtonRes
            r0.<init>(r1)
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public com.kongzue.dialogx.interfaces.DialogXStyle.WaitTipRes overrideWaitTipRes() {
            r1 = this;
            com.kongzue.dialogx.style.MaterialStyle$DefaultWaitTipRes r0 = new com.kongzue.dialogx.style.MaterialStyle$DefaultWaitTipRes
            r0.<init>(r1)
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings popMenuSettings() {
            r1 = this;
            com.kongzue.dialogx.style.MaterialStyle$DefaultPopMenuSettings r0 = new com.kongzue.dialogx.style.MaterialStyle$DefaultPopMenuSettings
            r0.<init>(r1)
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings popNotificationSettings() {
            r1 = this;
            com.kongzue.dialogx.style.MaterialStyle$DefaultPopNotificationSettings r0 = new com.kongzue.dialogx.style.MaterialStyle$DefaultPopNotificationSettings
            r0.<init>(r1)
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings popTipSettings() {
            r1 = this;
            com.kongzue.dialogx.style.MaterialStyle$DefaultPopTipSettings r0 = new com.kongzue.dialogx.style.MaterialStyle$DefaultPopTipSettings
            r0.<init>(r1)
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public int splitColorRes(boolean r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public int splitWidthPx() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public boolean tintButtonBackground() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public int[] verticalButtonOrder() {
            r3 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            int[] r0 = new int[]{r2, r0, r1}
            return r0
    }
}
