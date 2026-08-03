package com.kongzue.dialogx.interfaces;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DialogXStyle {
    public static final int BUTTON_CANCEL = 2;
    public static final int BUTTON_OK = 1;
    public static final int BUTTON_OTHER = 3;
    public static final int SPACE = 4;
    public static final int SPLIT = 5;
    public static final int styleVer = 6;

    public abstract class BlurBackgroundSetting {
        final /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle this$0;

        public BlurBackgroundSetting(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public boolean blurBackground() {
                r1 = this;
                r0 = 0
                return r0
        }

        public int blurBackgroundRoundRadiusPx() {
                r1 = this;
                r0 = 0
                return r0
        }

        public int blurForwardColorRes(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public abstract class BottomDialogRes {
        final /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle this$0;

        public BottomDialogRes(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public float overrideBottomDialogMaxHeight() {
                r1 = this;
                r0 = 0
                return r0
        }

        public int overrideDialogLayout(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideMenuDividerDrawableRes(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideMenuDividerHeight(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideMenuItemLayout(boolean r1, int r2, int r3, boolean r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideMenuTextColor(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideMultiSelectionImage(boolean r1, boolean r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideSelectionImage(boolean r1, boolean r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideSelectionMenuBackgroundColor(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean selectionImageTint(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean touchSlide() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public abstract class HorizontalButtonRes {
        final /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle this$0;

        public HorizontalButtonRes(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public int overrideHorizontalCancelButtonBackgroundRes(int r1, boolean r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideHorizontalOkButtonBackgroundRes(int r1, boolean r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideHorizontalOtherButtonBackgroundRes(int r1, boolean r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public abstract class PopMenuSettings {
        final /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle this$0;

        public PopMenuSettings(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public int backgroundMaskColorRes() {
                r1 = this;
                r0 = 0
                return r0
        }

        public com.kongzue.dialogx.interfaces.DialogXStyle.BlurBackgroundSetting blurBackgroundSettings() {
                r1 = this;
                r0 = 0
                return r0
        }

        public int layout(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideMenuDividerDrawableRes(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideMenuDividerHeight(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideMenuItemBackgroundRes(boolean r1, int r2, int r3, boolean r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideMenuItemLayoutRes(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideMenuTextColor(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideSelectionMenuBackgroundColor(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int paddingVertical() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean selectionImageTint(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public static abstract class PopNotificationSettings {

        public enum ALIGN extends java.lang.Enum<com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN> {
            private static final /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN[] $VALUES = null;
            public static final com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN BOTTOM = null;
            public static final com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN BOTTOM_INSIDE = null;
            public static final com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN CENTER = null;
            public static final com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN TOP = null;
            public static final com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN TOP_INSIDE = null;

            private static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN[] $values() {
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r0 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.CENTER
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.TOP
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r2 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.BOTTOM
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r3 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.TOP_INSIDE
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r4 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.BOTTOM_INSIDE
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN[] r0 = new com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN[]{r0, r1, r2, r3, r4}
                    return r0
            }

            static {
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r0 = new com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN
                    java.lang.String r1 = "CENTER"
                    r2 = 0
                    r0.<init>(r1, r2)
                    com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.CENTER = r0
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r0 = new com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN
                    java.lang.String r1 = "TOP"
                    r2 = 1
                    r0.<init>(r1, r2)
                    com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.TOP = r0
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r0 = new com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN
                    java.lang.String r1 = "BOTTOM"
                    r2 = 2
                    r0.<init>(r1, r2)
                    com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.BOTTOM = r0
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r0 = new com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN
                    java.lang.String r1 = "TOP_INSIDE"
                    r2 = 3
                    r0.<init>(r1, r2)
                    com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.TOP_INSIDE = r0
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r0 = new com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN
                    java.lang.String r1 = "BOTTOM_INSIDE"
                    r2 = 4
                    r0.<init>(r1, r2)
                    com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.BOTTOM_INSIDE = r0
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN[] r0 = $values()
                    com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.$VALUES = r0
                    return
            }

            ALIGN(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN valueOf(java.lang.String r1) {
                    java.lang.Class<com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN> r0 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r1 = (com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN) r1
                    return r1
            }

            public static com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN[] values() {
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN[] r0 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.$VALUES
                    java.lang.Object r0 = r0.clone()
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN[] r0 = (com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN[]) r0
                    return r0
            }
        }

        public PopNotificationSettings() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN align() {
                r1 = this;
                com.kongzue.dialogx.interfaces.DialogXStyle$PopNotificationSettings$ALIGN r0 = com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings.ALIGN.CENTER
                return r0
        }

        public com.kongzue.dialogx.interfaces.DialogXStyle.BlurBackgroundSetting blurBackgroundSettings() {
                r1 = this;
                r0 = 0
                return r0
        }

        public int defaultIconError() {
                r1 = this;
                r0 = 0
                return r0
        }

        public int defaultIconSuccess() {
                r1 = this;
                r0 = 0
                return r0
        }

        public int defaultIconWarning() {
                r1 = this;
                r0 = 0
                return r0
        }

        public int enterAnimResId(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int exitAnimResId(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int layout(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean tintIcon() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public static abstract class PopTipSettings {

        public enum ALIGN extends java.lang.Enum<com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN> {
            private static final /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN[] $VALUES = null;
            public static final com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN BOTTOM = null;
            public static final com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN BOTTOM_INSIDE = null;
            public static final com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN CENTER = null;
            public static final com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN TOP = null;
            public static final com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN TOP_INSIDE = null;

            private static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN[] $values() {
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r0 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.CENTER
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.TOP
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r2 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.BOTTOM
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r3 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.TOP_INSIDE
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r4 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.BOTTOM_INSIDE
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN[] r0 = new com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN[]{r0, r1, r2, r3, r4}
                    return r0
            }

            static {
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r0 = new com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN
                    java.lang.String r1 = "CENTER"
                    r2 = 0
                    r0.<init>(r1, r2)
                    com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.CENTER = r0
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r0 = new com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN
                    java.lang.String r1 = "TOP"
                    r2 = 1
                    r0.<init>(r1, r2)
                    com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.TOP = r0
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r0 = new com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN
                    java.lang.String r1 = "BOTTOM"
                    r2 = 2
                    r0.<init>(r1, r2)
                    com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.BOTTOM = r0
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r0 = new com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN
                    java.lang.String r1 = "TOP_INSIDE"
                    r2 = 3
                    r0.<init>(r1, r2)
                    com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.TOP_INSIDE = r0
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r0 = new com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN
                    java.lang.String r1 = "BOTTOM_INSIDE"
                    r2 = 4
                    r0.<init>(r1, r2)
                    com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.BOTTOM_INSIDE = r0
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN[] r0 = $values()
                    com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.$VALUES = r0
                    return
            }

            ALIGN(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN valueOf(java.lang.String r1) {
                    java.lang.Class<com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN> r0 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = (com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN) r1
                    return r1
            }

            public static com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN[] values() {
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN[] r0 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.$VALUES
                    java.lang.Object r0 = r0.clone()
                    com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN[] r0 = (com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN[]) r0
                    return r0
            }
        }

        public PopTipSettings() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN align() {
                r1 = this;
                com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r0 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.CENTER
                return r0
        }

        public int defaultIconError() {
                r1 = this;
                r0 = 0
                return r0
        }

        public int defaultIconSuccess() {
                r1 = this;
                r0 = 0
                return r0
        }

        public int defaultIconWarning() {
                r1 = this;
                r0 = 0
                return r0
        }

        public int enterAnimResId(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int exitAnimResId(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int layout(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean tintIcon() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public abstract class VerticalButtonRes {
        final /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle this$0;

        public VerticalButtonRes(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public int overrideVerticalCancelButtonBackgroundRes(int r1, boolean r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideVerticalOkButtonBackgroundRes(int r1, boolean r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideVerticalOtherButtonBackgroundRes(int r1, boolean r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public abstract class WaitTipRes {
        final /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle this$0;

        public WaitTipRes(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public boolean blurBackground() {
                r1 = this;
                r0 = 0
                return r0
        }

        public int overrideBackgroundColorRes(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideRadiusPx() {
                r1 = this;
                r0 = 0
                return r0
        }

        public int overrideTextColorRes(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int overrideWaitLayout(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public com.kongzue.dialogx.interfaces.ProgressViewInterface overrideWaitView(android.content.Context r1, boolean r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public DialogXStyle() {
            r0 = this;
            r0.<init>()
            return
    }

    public int enterAnimResId() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int exitAnimResId() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int[] horizontalButtonOrder() {
            r3 = this;
            r0 = 2
            r1 = 1
            r2 = 3
            int[] r0 = new int[]{r2, r0, r1}
            return r0
    }

    public int layout(boolean r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public com.kongzue.dialogx.interfaces.DialogXStyle.BlurBackgroundSetting messageDialogBlurSettings() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogXStyle.BottomDialogRes overrideBottomDialogRes() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogXStyle.HorizontalButtonRes overrideHorizontalButtonRes() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogXStyle.VerticalButtonRes overrideVerticalButtonRes() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogXStyle.WaitTipRes overrideWaitTipRes() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogXStyle.PopMenuSettings popMenuSettings() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogXStyle.PopNotificationSettings popNotificationSettings() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings popTipSettings() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int splitColorRes(boolean r1) {
            r0 = this;
            r1 = 436207616(0x1a000000, float:2.646978E-23)
            return r1
    }

    public int splitWidthPx() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean tintButtonBackground() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int[] verticalButtonOrder() {
            r4 = this;
            r0 = 2
            r1 = 1
            r2 = 3
            r3 = 5
            int[] r0 = new int[]{r2, r3, r0, r1}
            return r0
    }
}
