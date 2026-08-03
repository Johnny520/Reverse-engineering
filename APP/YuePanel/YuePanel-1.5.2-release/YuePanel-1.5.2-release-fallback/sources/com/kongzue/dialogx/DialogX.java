package com.kongzue.dialogx;

/* JADX INFO: loaded from: classes2.dex */
public class DialogX {
    public static boolean DEBUGMODE = true;
    public static final java.lang.String ERROR_INIT_TIPS = "DialogX.init: 初始化异常，context 为 null 或未初始化，详情请查看 https://github.com/kongzue/DialogX/wiki";
    public static boolean autoGC;
    public static boolean autoRunOnUIThread;
    public static boolean autoShowInputKeyboard;
    public static java.lang.Integer backgroundColor;
    public static int bottomDialogNavbarColor;
    public static com.kongzue.dialogx.util.TextInfo buttonTextInfo;
    public static java.lang.String cancelButtonText;
    public static boolean cancelable;
    public static boolean cancelableTipDialog;
    public static int defaultBottomDialogBackgroundRadius;
    public static int defaultFullScreenDialogBackgroundRadius;
    public static int defaultMessageDialogBackgroundRadius;
    public static java.lang.CharSequence defaultMessageDialogTitleText;
    public static int defaultPopMenuBackgroundRadius;
    public static int defaultPopNotificationBackgroundRadius;
    public static int defaultPopTipBackgroundRadius;
    public static java.lang.CharSequence defaultTipDialogErrorText;
    public static java.lang.CharSequence defaultTipDialogSuccessText;
    public static java.lang.CharSequence defaultTipDialogWarningText;
    public static int defaultWaitAndTipDialogBackgroundRadius;
    public static java.lang.CharSequence defaultWaitDialogWaitingText;
    public static com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.interfaces.BaseDialog> dialogLifeCycleListener;
    public static int dialogMaxHeight;
    public static int dialogMaxWidth;
    public static int dialogMinHeight;
    public static int dialogMinWidth;
    public static boolean enableImmersiveMode;
    public static long enterAnimDuration;
    public static long exitAnimDuration;
    public static boolean globalHoverWindow;
    public static com.kongzue.dialogx.interfaces.DialogXStyle globalStyle;
    public static com.kongzue.dialogx.DialogX.THEME globalTheme;
    public static boolean ignoreUnsafeInsetsHorizontal;
    public static com.kongzue.dialogx.DialogX.IMPL_MODE implIMPLMode;
    public static com.kongzue.dialogx.util.InputInfo inputInfo;
    public static com.kongzue.dialogx.util.TextInfo menuTextInfo;
    public static com.kongzue.dialogx.util.TextInfo menuTitleInfo;
    public static com.kongzue.dialogx.util.TextInfo messageTextInfo;
    public static com.kongzue.dialogx.util.TextInfo okButtonTextInfo;
    public static boolean onlyOnePopNotification;
    public static boolean onlyOnePopTip;
    public static com.kongzue.dialogx.util.TextInfo popTextInfo;
    public static java.lang.Integer tipBackgroundColor;
    public static java.lang.Integer tipProgressColor;
    public static com.kongzue.dialogx.util.TextInfo tipTextInfo;
    public static com.kongzue.dialogx.DialogX.THEME tipTheme;
    public static com.kongzue.dialogx.util.TextInfo titleTextInfo;
    public static int touchSlideTriggerThreshold;
    public static java.lang.String[] unsupportedActivitiesPackageNames;

    @java.lang.Deprecated
    public static boolean useActivityLayoutTranslationNavigationBar;
    public static boolean useHaptic;

    public enum IMPL_MODE extends java.lang.Enum<com.kongzue.dialogx.DialogX.IMPL_MODE> {
        private static final /* synthetic */ com.kongzue.dialogx.DialogX.IMPL_MODE[] $VALUES = null;
        public static final com.kongzue.dialogx.DialogX.IMPL_MODE DIALOG_FRAGMENT = null;
        public static final com.kongzue.dialogx.DialogX.IMPL_MODE FLOATING_ACTIVITY = null;
        public static final com.kongzue.dialogx.DialogX.IMPL_MODE VIEW = null;
        public static final com.kongzue.dialogx.DialogX.IMPL_MODE WINDOW = null;

        static {
                com.kongzue.dialogx.DialogX$IMPL_MODE r0 = new com.kongzue.dialogx.DialogX$IMPL_MODE
                java.lang.String r1 = "VIEW"
                r2 = 0
                r0.<init>(r1, r2)
                com.kongzue.dialogx.DialogX.IMPL_MODE.VIEW = r0
                com.kongzue.dialogx.DialogX$IMPL_MODE r1 = new com.kongzue.dialogx.DialogX$IMPL_MODE
                java.lang.String r2 = "WINDOW"
                r3 = 1
                r1.<init>(r2, r3)
                com.kongzue.dialogx.DialogX.IMPL_MODE.WINDOW = r1
                com.kongzue.dialogx.DialogX$IMPL_MODE r2 = new com.kongzue.dialogx.DialogX$IMPL_MODE
                java.lang.String r3 = "DIALOG_FRAGMENT"
                r4 = 2
                r2.<init>(r3, r4)
                com.kongzue.dialogx.DialogX.IMPL_MODE.DIALOG_FRAGMENT = r2
                com.kongzue.dialogx.DialogX$IMPL_MODE r3 = new com.kongzue.dialogx.DialogX$IMPL_MODE
                java.lang.String r4 = "FLOATING_ACTIVITY"
                r5 = 3
                r3.<init>(r4, r5)
                com.kongzue.dialogx.DialogX.IMPL_MODE.FLOATING_ACTIVITY = r3
                com.kongzue.dialogx.DialogX$IMPL_MODE[] r0 = new com.kongzue.dialogx.DialogX.IMPL_MODE[]{r0, r1, r2, r3}
                com.kongzue.dialogx.DialogX.IMPL_MODE.$VALUES = r0
                return
        }

        IMPL_MODE(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.kongzue.dialogx.DialogX.IMPL_MODE valueOf(java.lang.String r1) {
                java.lang.Class<com.kongzue.dialogx.DialogX$IMPL_MODE> r0 = com.kongzue.dialogx.DialogX.IMPL_MODE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kongzue.dialogx.DialogX$IMPL_MODE r1 = (com.kongzue.dialogx.DialogX.IMPL_MODE) r1
                return r1
        }

        public static com.kongzue.dialogx.DialogX.IMPL_MODE[] values() {
                com.kongzue.dialogx.DialogX$IMPL_MODE[] r0 = com.kongzue.dialogx.DialogX.IMPL_MODE.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kongzue.dialogx.DialogX$IMPL_MODE[] r0 = (com.kongzue.dialogx.DialogX.IMPL_MODE[]) r0
                return r0
        }
    }

    public enum THEME extends java.lang.Enum<com.kongzue.dialogx.DialogX.THEME> {
        private static final /* synthetic */ com.kongzue.dialogx.DialogX.THEME[] $VALUES = null;
        public static final com.kongzue.dialogx.DialogX.THEME AUTO = null;
        public static final com.kongzue.dialogx.DialogX.THEME DARK = null;
        public static final com.kongzue.dialogx.DialogX.THEME LIGHT = null;

        static {
                com.kongzue.dialogx.DialogX$THEME r0 = new com.kongzue.dialogx.DialogX$THEME
                java.lang.String r1 = "LIGHT"
                r2 = 0
                r0.<init>(r1, r2)
                com.kongzue.dialogx.DialogX.THEME.LIGHT = r0
                com.kongzue.dialogx.DialogX$THEME r1 = new com.kongzue.dialogx.DialogX$THEME
                java.lang.String r2 = "DARK"
                r3 = 1
                r1.<init>(r2, r3)
                com.kongzue.dialogx.DialogX.THEME.DARK = r1
                com.kongzue.dialogx.DialogX$THEME r2 = new com.kongzue.dialogx.DialogX$THEME
                java.lang.String r3 = "AUTO"
                r4 = 2
                r2.<init>(r3, r4)
                com.kongzue.dialogx.DialogX.THEME.AUTO = r2
                com.kongzue.dialogx.DialogX$THEME[] r0 = new com.kongzue.dialogx.DialogX.THEME[]{r0, r1, r2}
                com.kongzue.dialogx.DialogX.THEME.$VALUES = r0
                return
        }

        THEME(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.kongzue.dialogx.DialogX.THEME valueOf(java.lang.String r1) {
                java.lang.Class<com.kongzue.dialogx.DialogX$THEME> r0 = com.kongzue.dialogx.DialogX.THEME.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kongzue.dialogx.DialogX$THEME r1 = (com.kongzue.dialogx.DialogX.THEME) r1
                return r1
        }

        public static com.kongzue.dialogx.DialogX.THEME[] values() {
                com.kongzue.dialogx.DialogX$THEME[] r0 = com.kongzue.dialogx.DialogX.THEME.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kongzue.dialogx.DialogX$THEME[] r0 = (com.kongzue.dialogx.DialogX.THEME[]) r0
                return r0
        }
    }

    static {
            com.kongzue.dialogx.style.MaterialStyle r0 = com.kongzue.dialogx.style.MaterialStyle.style()
            com.kongzue.dialogx.DialogX.globalStyle = r0
            com.kongzue.dialogx.DialogX$THEME r0 = com.kongzue.dialogx.DialogX.THEME.LIGHT
            com.kongzue.dialogx.DialogX.globalTheme = r0
            com.kongzue.dialogx.DialogX$IMPL_MODE r0 = com.kongzue.dialogx.DialogX.IMPL_MODE.VIEW
            com.kongzue.dialogx.DialogX.implIMPLMode = r0
            r0 = 1
            com.kongzue.dialogx.DialogX.autoShowInputKeyboard = r0
            r1 = 0
            com.kongzue.dialogx.DialogX.onlyOnePopTip = r1
            com.kongzue.dialogx.DialogX.onlyOnePopNotification = r0
            r2 = 0
            com.kongzue.dialogx.DialogX.backgroundColor = r2
            com.kongzue.dialogx.DialogX.tipBackgroundColor = r2
            com.kongzue.dialogx.DialogX.tipProgressColor = r2
            com.kongzue.dialogx.DialogX.cancelable = r0
            com.kongzue.dialogx.DialogX.cancelableTipDialog = r1
            r2 = -1
            com.kongzue.dialogx.DialogX.enterAnimDuration = r2
            com.kongzue.dialogx.DialogX.exitAnimDuration = r2
            com.kongzue.dialogx.DialogX.autoRunOnUIThread = r0
            com.kongzue.dialogx.DialogX.useHaptic = r0
            com.kongzue.dialogx.DialogX.useActivityLayoutTranslationNavigationBar = r1
            com.kongzue.dialogx.DialogX.bottomDialogNavbarColor = r1
            r2 = 1108082688(0x420c0000, float:35.0)
            int r2 = dip2px(r2)
            com.kongzue.dialogx.DialogX.touchSlideTriggerThreshold = r2
            com.kongzue.dialogx.DialogX.globalHoverWindow = r1
            java.lang.String r2 = "com.mobile.auth.gatewayauth"
            java.lang.String r3 = "com.google.android.gms.ads"
            java.lang.String r4 = "com.bytedance.sdk.openadsdk.stub.activity"
            java.lang.String[] r2 = new java.lang.String[]{r4, r2, r3}
            com.kongzue.dialogx.DialogX.unsupportedActivitiesPackageNames = r2
            r2 = -1
            com.kongzue.dialogx.DialogX.defaultMessageDialogBackgroundRadius = r2
            com.kongzue.dialogx.DialogX.defaultBottomDialogBackgroundRadius = r2
            com.kongzue.dialogx.DialogX.defaultFullScreenDialogBackgroundRadius = r2
            com.kongzue.dialogx.DialogX.defaultWaitAndTipDialogBackgroundRadius = r2
            com.kongzue.dialogx.DialogX.defaultPopMenuBackgroundRadius = r2
            com.kongzue.dialogx.DialogX.defaultPopTipBackgroundRadius = r2
            com.kongzue.dialogx.DialogX.defaultPopNotificationBackgroundRadius = r2
            com.kongzue.dialogx.DialogX.enableImmersiveMode = r0
            com.kongzue.dialogx.DialogX.ignoreUnsafeInsetsHorizontal = r1
            return
    }

    public DialogX() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int dip2px(float r1) {
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r1 = (int) r1
            return r1
    }

    public static void error(java.lang.Object r1) {
            boolean r0 = com.kongzue.dialogx.DialogX.DEBUGMODE
            if (r0 == 0) goto Ld
            java.lang.String r0 = ">>>"
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1)
        Ld:
            return
    }

    public static void init(android.content.Context r0) {
            if (r0 != 0) goto L8
            java.lang.String r0 = "DialogX.init: 初始化异常，context 为 null 或未初始化，详情请查看 https://github.com/kongzue/DialogX/wiki"
            error(r0)
            return
        L8:
            com.kongzue.dialogx.interfaces.BaseDialog.init(r0)
            return
    }

    public static com.kongzue.dialogx.util.DialogListBuilder showDialogList(com.kongzue.dialogx.interfaces.BaseDialog... r0) {
            com.kongzue.dialogx.util.DialogListBuilder r0 = com.kongzue.dialogx.util.DialogListBuilder.create(r0)
            com.kongzue.dialogx.util.DialogListBuilder r0 = r0.show()
            return r0
    }
}
