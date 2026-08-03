package com.kongzue.dialogx.style;

import android.content.Context;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.interfaces.DialogXStyle;
import com.kongzue.dialogx.interfaces.ProgressViewInterface;
import com.kongzue.dialogx.util.views.ProgressView;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialStyle extends DialogXStyle {

    public class DefaultBottomDialogRes extends DialogXStyle.BottomDialogRes {
        public DefaultBottomDialogRes() {
            super();
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public float overrideBottomDialogMaxHeight() {
            return 0.6f;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public int overrideDialogLayout(boolean z) {
            return z ? C2413R.layout.layout_dialogx_bottom_material : C2413R.layout.layout_dialogx_bottom_material_dark;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public int overrideMenuDividerDrawableRes(boolean z) {
            return z ? C2413R.drawable.rect_dialogx_material_menu_split_divider : C2413R.drawable.rect_dialogx_material_menu_split_divider_night;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public int overrideMenuDividerHeight(boolean z) {
            return 1;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public int overrideMenuItemLayout(boolean z, int i, int i2, boolean z2) {
            return 0;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public int overrideMenuTextColor(boolean z) {
            return z ? C2413R.color.black90 : C2413R.color.white90;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public int overrideMultiSelectionImage(boolean z, boolean z2) {
            return z2 ? C2413R.mipmap.img_dialogx_bottom_menu_material_item_multi_selection : C2413R.mipmap.img_dialogx_bottom_menu_material_item_non_multi_select;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public int overrideSelectionImage(boolean z, boolean z2) {
            return z2 ? C2413R.mipmap.img_dialogx_bottom_menu_material_item_selection : C2413R.mipmap.img_dialogx_bottom_menu_material_item_non_select;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public int overrideSelectionMenuBackgroundColor(boolean z) {
            return 0;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public boolean selectionImageTint(boolean z) {
            return false;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes
        public boolean touchSlide() {
            return true;
        }
    }

    public class DefaultHorizontalButtonRes extends DialogXStyle.HorizontalButtonRes {
        public DefaultHorizontalButtonRes() {
            super();
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.HorizontalButtonRes
        public int overrideHorizontalCancelButtonBackgroundRes(int i, boolean z) {
            return z ? C2413R.drawable.button_dialogx_material_light : C2413R.drawable.button_dialogx_material_night;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.HorizontalButtonRes
        public int overrideHorizontalOkButtonBackgroundRes(int i, boolean z) {
            return z ? C2413R.drawable.button_dialogx_material_light : C2413R.drawable.button_dialogx_material_night;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.HorizontalButtonRes
        public int overrideHorizontalOtherButtonBackgroundRes(int i, boolean z) {
            return z ? C2413R.drawable.button_dialogx_material_light : C2413R.drawable.button_dialogx_material_night;
        }
    }

    public class DefaultPopMenuSettings extends DialogXStyle.PopMenuSettings {
        public DefaultPopMenuSettings() {
            super();
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int backgroundMaskColorRes() {
            return 0;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public DialogXStyle.BlurBackgroundSetting blurBackgroundSettings() {
            return null;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int layout(boolean z) {
            return z ? C2413R.layout.layout_dialogx_popmenu_material : C2413R.layout.layout_dialogx_popmenu_material_dark;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int overrideMenuDividerDrawableRes(boolean z) {
            return 0;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int overrideMenuDividerHeight(boolean z) {
            return 0;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int overrideMenuItemBackgroundRes(boolean z, int i, int i2, boolean z2) {
            return 0;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int overrideMenuItemLayoutRes(boolean z) {
            return 0;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int overrideMenuTextColor(boolean z) {
            return z ? C2413R.color.black90 : C2413R.color.white90;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int overrideSelectionMenuBackgroundColor(boolean z) {
            return 0;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public int paddingVertical() {
            return 0;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings
        public boolean selectionImageTint(boolean z) {
            return false;
        }
    }

    public class DefaultPopNotificationSettings extends DialogXStyle.PopNotificationSettings {
        public DefaultPopNotificationSettings() {
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings
        public DialogXStyle.PopNotificationSettings.ALIGN align() {
            return DialogXStyle.PopNotificationSettings.ALIGN.TOP;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings
        public int enterAnimResId(boolean z) {
            return C2413R.anim.anim_dialogx_notification_enter;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings
        public int exitAnimResId(boolean z) {
            return C2413R.anim.anim_dialogx_notification_exit;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings
        public int layout(boolean z) {
            return z ? C2413R.layout.layout_dialogx_popnotification_material : C2413R.layout.layout_dialogx_popnotification_material_dark;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings
        public boolean tintIcon() {
            return false;
        }
    }

    public class DefaultPopTipSettings extends DialogXStyle.PopTipSettings {
        public DefaultPopTipSettings() {
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings
        public DialogXStyle.PopTipSettings.ALIGN align() {
            return DialogXStyle.PopTipSettings.ALIGN.BOTTOM;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings
        public int enterAnimResId(boolean z) {
            return C2413R.anim.anim_dialogx_default_enter;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings
        public int exitAnimResId(boolean z) {
            return C2413R.anim.anim_dialogx_default_exit;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings
        public int layout(boolean z) {
            return z ? C2413R.layout.layout_dialogx_poptip_material : C2413R.layout.layout_dialogx_poptip_material_dark;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings
        public boolean tintIcon() {
            return true;
        }
    }

    public class DefaultVerticalButtonRes extends DialogXStyle.VerticalButtonRes {
        public DefaultVerticalButtonRes() {
            super();
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.VerticalButtonRes
        public int overrideVerticalCancelButtonBackgroundRes(int i, boolean z) {
            return z ? C2413R.drawable.button_dialogx_material_light : C2413R.drawable.button_dialogx_material_night;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.VerticalButtonRes
        public int overrideVerticalOkButtonBackgroundRes(int i, boolean z) {
            return z ? C2413R.drawable.button_dialogx_material_light : C2413R.drawable.button_dialogx_material_night;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.VerticalButtonRes
        public int overrideVerticalOtherButtonBackgroundRes(int i, boolean z) {
            return z ? C2413R.drawable.button_dialogx_material_light : C2413R.drawable.button_dialogx_material_night;
        }
    }

    public class DefaultWaitTipRes extends DialogXStyle.WaitTipRes {
        public DefaultWaitTipRes() {
            super();
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.WaitTipRes
        public boolean blurBackground() {
            return false;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.WaitTipRes
        public int overrideBackgroundColorRes(boolean z) {
            return 0;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.WaitTipRes
        public int overrideRadiusPx() {
            return -1;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.WaitTipRes
        public int overrideTextColorRes(boolean z) {
            return z ? C2413R.color.white : C2413R.color.black;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.WaitTipRes
        public int overrideWaitLayout(boolean z) {
            return C2413R.layout.layout_dialogx_wait;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogXStyle.WaitTipRes
        public ProgressViewInterface overrideWaitView(Context context, boolean z) {
            return new ProgressView(context);
        }
    }

    public static MaterialStyle style() {
        return new MaterialStyle();
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public int enterAnimResId() {
        return C2413R.anim.anim_dialogx_default_enter;
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public int exitAnimResId() {
        return C2413R.anim.anim_dialogx_default_exit;
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public int[] horizontalButtonOrder() {
        return new int[]{3, 4, 2, 1};
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public int layout(boolean z) {
        return z ? C2413R.layout.layout_dialogx_material : C2413R.layout.layout_dialogx_material_dark;
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public DialogXStyle.BlurBackgroundSetting messageDialogBlurSettings() {
        return null;
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public DialogXStyle.BottomDialogRes overrideBottomDialogRes() {
        return new DefaultBottomDialogRes();
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public DialogXStyle.HorizontalButtonRes overrideHorizontalButtonRes() {
        return new DefaultHorizontalButtonRes();
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public DialogXStyle.VerticalButtonRes overrideVerticalButtonRes() {
        return new DefaultVerticalButtonRes();
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public DialogXStyle.WaitTipRes overrideWaitTipRes() {
        return new DefaultWaitTipRes();
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public DialogXStyle.PopMenuSettings popMenuSettings() {
        return new DefaultPopMenuSettings();
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public DialogXStyle.PopNotificationSettings popNotificationSettings() {
        return new DefaultPopNotificationSettings();
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public DialogXStyle.PopTipSettings popTipSettings() {
        return new DefaultPopTipSettings();
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public int splitColorRes(boolean z) {
        return 0;
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public int splitWidthPx() {
        return 1;
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public boolean tintButtonBackground() {
        return true;
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXStyle
    public int[] verticalButtonOrder() {
        return new int[]{1, 3, 2};
    }
}
