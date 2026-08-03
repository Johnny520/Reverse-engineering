package com.kongzue.dialogx.util.views;

/* JADX INFO: loaded from: classes2.dex */
public class FitSystemBarUtils {
    private com.kongzue.dialogx.util.views.FitSystemBarUtils.CallBack callBack;
    private android.view.View contentView;
    private com.kongzue.dialogx.interfaces.BaseDialog dialog;
    private boolean inSmoothingPadding;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    com.kongzue.dialogx.util.views.FitSystemBarUtils.RelativePadding relativePaddingCache;
    android.view.View.OnLayoutChangeListener rootViewLayoutChangeListener;
    public boolean safeCutOutPadding;
    public boolean smoothPadding;
    private boolean specialMode;
    private int specialModeImeHeight;






    /* JADX INFO: renamed from: com.kongzue.dialogx.util.views.FitSystemBarUtils$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$com$kongzue$dialogx$util$views$FitSystemBarUtils$Orientation = null;

        static {
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation[] r0 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.kongzue.dialogx.util.views.FitSystemBarUtils.AnonymousClass6.$SwitchMap$com$kongzue$dialogx$util$views$FitSystemBarUtils$Orientation = r0
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r1 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.Start     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.kongzue.dialogx.util.views.FitSystemBarUtils.AnonymousClass6.$SwitchMap$com$kongzue$dialogx$util$views$FitSystemBarUtils$Orientation     // Catch: java.lang.NoSuchFieldError -> L1d
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r1 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.Top     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.kongzue.dialogx.util.views.FitSystemBarUtils.AnonymousClass6.$SwitchMap$com$kongzue$dialogx$util$views$FitSystemBarUtils$Orientation     // Catch: java.lang.NoSuchFieldError -> L28
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r1 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.End     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.kongzue.dialogx.util.views.FitSystemBarUtils.AnonymousClass6.$SwitchMap$com$kongzue$dialogx$util$views$FitSystemBarUtils$Orientation     // Catch: java.lang.NoSuchFieldError -> L33
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r1 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.Bottom     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public interface CallBack {
        int initialPadding(com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation r1);

        boolean isEnable(com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation r1);

        void unsafeRect(int r1, int r2, int r3, int r4);
    }

    public enum Orientation extends java.lang.Enum<com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation> {
        private static final /* synthetic */ com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation[] $VALUES = null;
        public static final com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation Bottom = null;
        public static final com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation End = null;
        public static final com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation Start = null;
        public static final com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation Top = null;

        static {
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r0 = new com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation
                java.lang.String r1 = "Start"
                r2 = 0
                r0.<init>(r1, r2)
                com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.Start = r0
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r1 = new com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation
                java.lang.String r2 = "Top"
                r3 = 1
                r1.<init>(r2, r3)
                com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.Top = r1
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r2 = new com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation
                java.lang.String r3 = "End"
                r4 = 2
                r2.<init>(r3, r4)
                com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.End = r2
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r3 = new com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation
                java.lang.String r4 = "Bottom"
                r5 = 3
                r3.<init>(r4, r5)
                com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.Bottom = r3
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation[] r0 = new com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation[]{r0, r1, r2, r3}
                com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.$VALUES = r0
                return
        }

        Orientation(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation valueOf(java.lang.String r1) {
                java.lang.Class<com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation> r0 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r1 = (com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation) r1
                return r1
        }

        public static com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation[] values() {
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation[] r0 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation[] r0 = (com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation[]) r0
                return r0
        }
    }

    public static class RelativePadding {
        int bottom;
        int end;
        int start;
        int top;

        public RelativePadding(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.start = r1
                r0.top = r2
                r0.end = r3
                r0.bottom = r4
                return
        }

        public RelativePadding(com.kongzue.dialogx.util.views.FitSystemBarUtils.RelativePadding r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.start
                r1.start = r0
                int r0 = r2.top
                r1.top = r0
                int r0 = r2.end
                r1.end = r0
                int r2 = r2.bottom
                r1.bottom = r2
                return
        }

        public void applyToView(android.view.View r5) {
                r4 = this;
                boolean r0 = r5 instanceof com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout
                if (r0 == 0) goto L5
                goto L10
            L5:
                int r0 = r4.start
                int r1 = r4.top
                int r2 = r4.end
                int r3 = r4.bottom
                Yue.C6794.m26255(r5, r0, r1, r2, r3)
            L10:
                return
        }
    }

    private FitSystemBarUtils() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.inSmoothingPadding = r0
            r0 = 1
            r1.safeCutOutPadding = r0
            r1.smoothPadding = r0
            return
    }

    public FitSystemBarUtils(android.view.View r2, com.kongzue.dialogx.util.views.FitSystemBarUtils.CallBack r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.inSmoothingPadding = r0
            r0 = 1
            r1.safeCutOutPadding = r0
            r1.smoothPadding = r0
            r1.contentView = r2
            r1.callBack = r3
            boolean r3 = r2 instanceof com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout
            if (r3 == 0) goto L1b
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r2
            com.kongzue.dialogx.interfaces.BaseDialog r2 = r2.getParentDialog()
            r1.dialog = r2
        L1b:
            r1.applyWindowInsets()
            return
    }

    public static /* synthetic */ void access$000(com.kongzue.dialogx.util.views.FitSystemBarUtils r0, Yue.C7065 r1, com.kongzue.dialogx.util.views.FitSystemBarUtils.RelativePadding r2) {
            r0.formatInsets(r1, r2)
            return
    }

    public static /* synthetic */ boolean access$102(com.kongzue.dialogx.util.views.FitSystemBarUtils r0, boolean r1) {
            r0.inSmoothingPadding = r1
            return r1
    }

    public static /* synthetic */ int access$200(com.kongzue.dialogx.util.views.FitSystemBarUtils r0) {
            int r0 = r0.getAppTargetSDKVersion()
            return r0
    }

    public static /* synthetic */ int access$300(com.kongzue.dialogx.util.views.FitSystemBarUtils r0) {
            int r0 = r0.checkOrientationAndStatusBarSide()
            return r0
    }

    public static /* synthetic */ void access$400(com.kongzue.dialogx.util.views.FitSystemBarUtils r0, com.kongzue.dialogx.util.views.FitSystemBarUtils.RelativePadding r1) {
            r0.applyCallBack(r1)
            return
    }

    public static /* synthetic */ android.view.View access$500(com.kongzue.dialogx.util.views.FitSystemBarUtils r0) {
            android.view.View r0 = r0.getDecorView()
            return r0
    }

    public static /* synthetic */ int access$600(com.kongzue.dialogx.util.views.FitSystemBarUtils r0) {
            int r0 = r0.specialModeImeHeight
            return r0
    }

    public static /* synthetic */ int access$602(com.kongzue.dialogx.util.views.FitSystemBarUtils r0, int r1) {
            r0.specialModeImeHeight = r1
            return r1
    }

    public static /* synthetic */ void access$700(com.kongzue.dialogx.util.views.FitSystemBarUtils r0) {
            r0.applyCallBack()
            return
    }

    private void addListenerWhenImeHeightChanged() {
            r3 = this;
            r0 = 1
            r3.specialMode = r0
            android.view.View r0 = r3.getDecorView()
            if (r0 != 0) goto La
            return
        La:
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r3.onGlobalLayoutListener
            if (r1 == 0) goto L17
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = r3.onGlobalLayoutListener
            r1.removeOnGlobalLayoutListener(r2)
        L17:
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            com.kongzue.dialogx.util.views.FitSystemBarUtils$5 r2 = new com.kongzue.dialogx.util.views.FitSystemBarUtils$5
            r2.<init>(r3, r0)
            r3.onGlobalLayoutListener = r2
            r1.addOnGlobalLayoutListener(r2)
            return
    }

    private void applyCallBack() {
            r1 = this;
            com.kongzue.dialogx.util.views.FitSystemBarUtils$RelativePadding r0 = r1.relativePaddingCache
            if (r0 == 0) goto L7
            r1.applyCallBack(r0)
        L7:
            return
    }

    private void applyCallBack(com.kongzue.dialogx.util.views.FitSystemBarUtils.RelativePadding r6) {
            r5 = this;
            com.kongzue.dialogx.util.views.FitSystemBarUtils$CallBack r0 = r5.callBack
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r6.start
            com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r2 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.Start
            int r0 = r0.initialPadding(r2)
            int r1 = r1 + r0
            r6.start = r1
            int r0 = r6.top
            com.kongzue.dialogx.util.views.FitSystemBarUtils$CallBack r1 = r5.callBack
            com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r2 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.Top
            int r1 = r1.initialPadding(r2)
            int r0 = r0 + r1
            r6.top = r0
            int r0 = r6.end
            com.kongzue.dialogx.util.views.FitSystemBarUtils$CallBack r1 = r5.callBack
            com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r2 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.End
            int r1 = r1.initialPadding(r2)
            int r0 = r0 + r1
            r6.end = r0
            int r0 = r6.bottom
            com.kongzue.dialogx.util.views.FitSystemBarUtils$CallBack r1 = r5.callBack
            com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r2 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.Bottom
            int r1 = r1.initialPadding(r2)
            int r0 = r0 + r1
            r6.bottom = r0
            android.view.View r0 = r5.contentView
            r6.applyToView(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "    KONGZUE DEBUG DIALOGX FitSystemBarUtils callBack: left="
            r0.append(r1)
            int r1 = r6.start
            r0.append(r1)
            java.lang.String r1 = " top="
            r0.append(r1)
            int r1 = r6.top
            r0.append(r1)
            java.lang.String r1 = " right="
            r0.append(r1)
            int r1 = r6.end
            r0.append(r1)
            java.lang.String r1 = " bottom="
            r0.append(r1)
            int r1 = r6.bottom
            r0.append(r1)
            java.lang.String r1 = " specialMode="
            r0.append(r1)
            boolean r1 = r5.specialMode
            r0.append(r1)
            java.lang.String r1 = " specialModeImeHeight="
            r0.append(r1)
            int r1 = r5.specialModeImeHeight
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.log(r0)
            com.kongzue.dialogx.util.views.FitSystemBarUtils$CallBack r0 = r5.callBack
            int r1 = r6.start
            int r2 = r6.top
            int r3 = r6.end
            int r6 = r6.bottom
            boolean r4 = r5.specialMode
            if (r4 == 0) goto L95
            int r4 = r5.specialModeImeHeight
            goto L96
        L95:
            r4 = 0
        L96:
            int r6 = r6 + r4
            r0.unsafeRect(r1, r2, r3, r6)
            return
    }

    public static com.kongzue.dialogx.util.views.FitSystemBarUtils attachView(android.view.View r1) {
            com.kongzue.dialogx.util.views.FitSystemBarUtils$1 r0 = new com.kongzue.dialogx.util.views.FitSystemBarUtils$1
            r0.<init>()
            com.kongzue.dialogx.util.views.FitSystemBarUtils r1 = attachView(r1, r0)
            return r1
    }

    public static com.kongzue.dialogx.util.views.FitSystemBarUtils attachView(android.view.View r1, com.kongzue.dialogx.util.views.FitSystemBarUtils.CallBack r2) {
            com.kongzue.dialogx.util.views.FitSystemBarUtils r0 = new com.kongzue.dialogx.util.views.FitSystemBarUtils
            r0.<init>(r1, r2)
            return r0
    }

    public static com.kongzue.dialogx.util.views.FitSystemBarUtils attachView(android.view.View r1, boolean r2, boolean r3, boolean r4, boolean r5) {
            com.kongzue.dialogx.util.views.FitSystemBarUtils$2 r0 = new com.kongzue.dialogx.util.views.FitSystemBarUtils$2
            r0.<init>(r2, r3, r4, r5)
            com.kongzue.dialogx.util.views.FitSystemBarUtils r1 = attachView(r1, r0)
            return r1
    }

    private int checkOrientationAndStatusBarSide() {
            r4 = this;
            android.app.Activity r0 = r4.getActivity()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.content.res.Resources r2 = r0.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.orientation
            r3 = 2
            if (r2 != r3) goto L2b
            android.view.WindowManager r0 = r0.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            r2 = 1
            if (r0 == r2) goto L29
            r3 = 3
            if (r0 == r3) goto L28
            return r1
        L28:
            return r2
        L29:
            r0 = -1
            return r0
        L2b:
            return r1
    }

    private void formatInsets(Yue.C7065 r14, com.kongzue.dialogx.util.views.FitSystemBarUtils.RelativePadding r15) {
            r13 = this;
            android.view.View r0 = r13.contentView
            if (r0 == 0) goto L139
            if (r14 == 0) goto L139
            if (r15 != 0) goto La
            goto L139
        La:
            r13.relativePaddingCache = r15
            boolean r0 = r13.safeCutOutPadding
            r1 = 0
            if (r0 == 0) goto L28
            Yue.ۥۣ۠۟۠ r0 = r14.m27282()
            if (r0 == 0) goto L28
            int r2 = r0.m8826()
            int r3 = r0.m8824()
            int r4 = r0.m8825()
            int r0 = r0.m8825()
            goto L2c
        L28:
            r0 = r1
            r2 = r0
            r3 = r2
            r4 = r3
        L2c:
            int r5 = Yue.C7065.C7078.m27366()
            int r6 = Yue.C7065.C7078.m27371()
            r5 = r5 | r6
            Yue.ۥ۠ۥۣۡ r5 = r14.m27283(r5)
            int r6 = r5.f10681
            int r7 = r5.f10683
            android.view.View r8 = r13.contentView
            android.view.View r8 = r8.getRootView()
            int r8 = r8.getWindowSystemUiVisibility()
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 30
            r11 = 1
            if (r9 >= r10) goto L55
            r12 = r8 & 4
            if (r12 != 0) goto L53
            goto L55
        L53:
            r12 = r1
            goto L56
        L55:
            r12 = r11
        L56:
            if (r9 >= r10) goto L5c
            r8 = r8 & 2
            if (r8 != 0) goto L71
        L5c:
            int r8 = Yue.C7065.C7078.m27366()
            boolean r8 = r14.m27305(r8)
            if (r8 != 0) goto L73
            int r8 = Yue.C7065.C7078.m27369()
            boolean r8 = r14.m27305(r8)
            if (r8 == 0) goto L71
            goto L73
        L71:
            r8 = r1
            goto L75
        L73:
            int r8 = r5.f10684
        L75:
            if (r12 == 0) goto L84
            int r9 = Yue.C7065.C7078.m27370()
            boolean r14 = r14.m27305(r9)
            if (r14 == 0) goto L84
            int r14 = r5.f10682
            goto L85
        L84:
            r14 = r1
        L85:
            boolean r5 = r13.isWrongInsets(r5)
            if (r5 == 0) goto Lc7
            java.lang.String r14 = "    FitSystemBarUtils: isWrongInsets try special mode..."
            r13.log(r14)
            int r14 = r13.checkOrientationAndStatusBarSide()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "    FitSystemBarUtils: deviceOrientation = "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            r13.log(r0)
            if (r14 == r11) goto Lb7
            int r14 = r13.getStatusBarHeight()
            r15.top = r14
            int r14 = r13.getNavigationBarHeight()
            r15.bottom = r14
            goto Lc3
        Lb7:
            int r14 = r13.getStatusBarHeight()
            r15.end = r14
            int r14 = r13.getNavigationBarHeight()
            r15.start = r14
        Lc3:
            r13.addListenerWhenImeHeightChanged()
            goto L136
        Lc7:
            r13.specialMode = r1
            com.kongzue.dialogx.util.views.FitSystemBarUtils$CallBack r5 = r13.callBack
            com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r9 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.Top
            boolean r5 = r5.isEnable(r9)
            if (r5 == 0) goto Ldc
            int r5 = r15.top
            int r14 = java.lang.Math.max(r14, r2)
            int r5 = r5 + r14
            r15.top = r5
        Ldc:
            com.kongzue.dialogx.util.views.FitSystemBarUtils$CallBack r14 = r13.callBack
            com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r2 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.Bottom
            boolean r14 = r14.isEnable(r2)
            if (r14 == 0) goto Lef
            int r14 = r15.bottom
            int r0 = java.lang.Math.max(r8, r0)
            int r14 = r14 + r0
            r15.bottom = r14
        Lef:
            android.view.View r14 = r13.contentView
            int r14 = Yue.C6794.m26140(r14)
            if (r14 != r11) goto Lf8
            r1 = r11
        Lf8:
            com.kongzue.dialogx.util.views.FitSystemBarUtils$CallBack r14 = r13.callBack
            com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r0 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.Start
            boolean r14 = r14.isEnable(r0)
            if (r14 == 0) goto L117
            if (r1 == 0) goto L10e
            int r14 = r15.start
            int r0 = java.lang.Math.max(r7, r4)
            int r14 = r14 + r0
            r15.start = r14
            goto L117
        L10e:
            int r14 = r15.start
            int r0 = java.lang.Math.max(r6, r3)
            int r14 = r14 + r0
            r15.start = r14
        L117:
            com.kongzue.dialogx.util.views.FitSystemBarUtils$CallBack r14 = r13.callBack
            com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r0 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.End
            boolean r14 = r14.isEnable(r0)
            if (r14 == 0) goto L136
            if (r1 == 0) goto L12d
            int r14 = r15.end
            int r0 = java.lang.Math.max(r6, r3)
            int r14 = r14 + r0
            r15.end = r14
            goto L136
        L12d:
            int r14 = r15.end
            int r0 = java.lang.Math.max(r7, r4)
            int r14 = r14 + r0
            r15.end = r14
        L136:
            r13.applyCallBack(r15)
        L139:
            return
    }

    private android.app.Activity getActivity() {
            r1 = this;
            com.kongzue.dialogx.interfaces.BaseDialog r0 = r1.dialog
            if (r0 != 0) goto L9
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
            return r0
        L9:
            android.app.Activity r0 = r0.getOwnActivity()
            return r0
    }

    private int getAppTargetSDKVersion() {
            r4 = this;
            r0 = -1
            android.content.Context r1 = com.kongzue.dialogx.interfaces.BaseDialog.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            if (r1 != 0) goto L8
            return r0
        L8:
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            r3 = 0
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            int r0 = r1.targetSdkVersion     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            return r0
        L18:
            r1 = move-exception
            r1.printStackTrace()
            return r0
    }

    private android.view.View getDecorView() {
            r1 = this;
            android.app.Activity r0 = r1.getActivity()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            return r0
    }

    private int getNavigationBarHeight() {
            r5 = this;
            boolean r0 = r5.isFullScreen()
            r1 = 0
            if (r0 != 0) goto L5a
            android.view.View r0 = r5.getDecorView()
            if (r0 != 0) goto Le
            goto L5a
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L1d
            android.view.View r3 = r5.getDecorView()
            android.view.WindowInsetsController r3 = Yue.C5827.m21677(r3)
            goto L1e
        L1d:
            r3 = 0
        L1e:
            if (r0 < r2) goto L30
            if (r3 == 0) goto L30
            int r0 = Yue.C7124.m27444(r3)
            r0 = r0 & 16
            if (r0 != 0) goto L30
            java.lang.String r0 = "getNavigationBarHeight =0"
            r5.log(r0)
            return r1
        L30:
            android.view.View r0 = r5.contentView
            if (r0 == 0) goto L46
            android.content.Context r0 = r0.getContext()
            if (r0 != 0) goto L3b
            goto L46
        L3b:
            android.view.View r0 = r5.contentView
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            goto L4a
        L46:
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
        L4a:
            java.lang.String r2 = "dimen"
            java.lang.String r3 = "android"
            java.lang.String r4 = "navigation_bar_height"
            int r2 = r0.getIdentifier(r4, r2, r3)
            if (r2 <= 0) goto L5a
            int r1 = r0.getDimensionPixelSize(r2)
        L5a:
            return r1
    }

    private int getStatusBarHeight() {
            r5 = this;
            boolean r0 = r5.isFullScreen()
            r1 = 0
            if (r0 != 0) goto L55
            android.view.View r0 = r5.getDecorView()
            if (r0 != 0) goto Le
            goto L55
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L1d
            android.view.View r3 = r5.getDecorView()
            android.view.WindowInsetsController r3 = Yue.C5827.m21677(r3)
            goto L1e
        L1d:
            r3 = 0
        L1e:
            if (r0 < r2) goto L2b
            if (r3 == 0) goto L2b
            int r0 = Yue.C7124.m27444(r3)
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 != 0) goto L2b
            return r1
        L2b:
            android.view.View r0 = r5.contentView
            if (r0 == 0) goto L41
            android.content.Context r0 = r0.getContext()
            if (r0 != 0) goto L36
            goto L41
        L36:
            android.view.View r0 = r5.contentView
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            goto L45
        L41:
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
        L45:
            java.lang.String r2 = "dimen"
            java.lang.String r3 = "android"
            java.lang.String r4 = "status_bar_height"
            int r2 = r0.getIdentifier(r4, r2, r3)
            if (r2 <= 0) goto L55
            int r1 = r0.getDimensionPixelSize(r2)
        L55:
            return r1
    }

    private boolean isFullScreen() {
            r4 = this;
            android.app.Activity r0 = r4.getActivity()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.Window r2 = r0.getWindow()
            android.view.WindowManager$LayoutParams r2 = r2.getAttributes()
            int r2 = r2.flags
            r2 = r2 & 1024(0x400, float:1.435E-42)
            r3 = 1
            if (r2 == 0) goto L18
            return r3
        L18:
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            int r0 = r0.getSystemUiVisibility()
            r0 = r0 & 4
            if (r0 == 0) goto L29
            return r3
        L29:
            return r1
    }

    private boolean isWrongInsets(Yue.C3267 r2) {
            r1 = this;
            int r0 = r2.f10682
            if (r0 != 0) goto L12
            int r0 = r2.f10684
            if (r0 != 0) goto L12
            int r0 = r2.f10681
            if (r0 != 0) goto L12
            int r2 = r2.f10683
            if (r2 != 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    private /* synthetic */ Yue.C7065 lambda$applyWindowInsets$0(com.kongzue.dialogx.util.views.FitSystemBarUtils.RelativePadding r1, android.view.View r2, Yue.C7065 r3) {
            r0 = this;
            boolean r2 = r0.inSmoothingPadding
            if (r2 == 0) goto L5
            return r3
        L5:
            com.kongzue.dialogx.util.views.FitSystemBarUtils$RelativePadding r2 = new com.kongzue.dialogx.util.views.FitSystemBarUtils$RelativePadding
            r2.<init>(r1)
            r0.formatInsets(r3, r2)
            return r3
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ Yue.C7065 m30646(com.kongzue.dialogx.util.views.FitSystemBarUtils r0, com.kongzue.dialogx.util.views.FitSystemBarUtils.RelativePadding r1, android.view.View r2, Yue.C7065 r3) {
            Yue.ۥۢۥۦ r0 = r0.lambda$applyWindowInsets$0(r1, r2, r3)
            return r0
    }

    public void applyWindowInsets() {
            r5 = this;
            com.kongzue.dialogx.util.views.FitSystemBarUtils$RelativePadding r0 = new com.kongzue.dialogx.util.views.FitSystemBarUtils$RelativePadding
            android.view.View r1 = r5.contentView
            int r1 = Yue.C6794.m26151(r1)
            android.view.View r2 = r5.contentView
            int r2 = r2.getPaddingTop()
            android.view.View r3 = r5.contentView
            int r3 = Yue.C6794.m26150(r3)
            android.view.View r4 = r5.contentView
            int r4 = r4.getPaddingBottom()
            r0.<init>(r1, r2, r3, r4)
            android.view.View r1 = r5.contentView
            Yue.ۥ۠ۢۡۦ r2 = new Yue.ۥ۠ۢۡۦ
            r2.<init>(r5, r0)
            Yue.C6794.m26252(r1, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L3d
            java.lang.String r1 = "FitSystemBarUtils: setWindowInsetsAnimationCallback"
            r5.log(r1)
            android.view.View r1 = r5.contentView
            com.kongzue.dialogx.util.views.FitSystemBarUtils$3 r2 = new com.kongzue.dialogx.util.views.FitSystemBarUtils$3
            r3 = 1
            r2.<init>(r5, r3, r0)
            Yue.C6794.m26275(r1, r2)
        L3d:
            android.view.View r1 = r5.contentView
            boolean r1 = Yue.C6794.m26181(r1)
            if (r1 == 0) goto L50
            java.lang.String r0 = "FitSystemBarUtils: AttachedToWindow ok"
            r5.log(r0)
            android.view.View r0 = r5.contentView
            Yue.C6794.m26217(r0)
            goto L5f
        L50:
            java.lang.String r1 = "FitSystemBarUtils: wait AttachedToWindow"
            r5.log(r1)
            android.view.View r1 = r5.contentView
            com.kongzue.dialogx.util.views.FitSystemBarUtils$4 r2 = new com.kongzue.dialogx.util.views.FitSystemBarUtils$4
            r2.<init>(r5, r0)
            r1.addOnAttachStateChangeListener(r2)
        L5f:
            return
    }

    public boolean isInSmoothingPadding() {
            r1 = this;
            boolean r0 = r1.inSmoothingPadding
            return r0
    }

    public void log(java.lang.String r2) {
            r1 = this;
            boolean r0 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.debugMode
            if (r0 == 0) goto Ld
            boolean r0 = com.kongzue.dialogx.DialogX.DEBUGMODE
            if (r0 == 0) goto Ld
            java.lang.String r0 = ">>>"
            android.util.Log.e(r0, r2)
        Ld:
            return
    }

    public void recycle() {
            r2 = this;
            android.view.View r0 = r2.getDecorView()
            if (r0 == 0) goto L13
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.onGlobalLayoutListener
            if (r1 == 0) goto L13
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.onGlobalLayoutListener
            r0.removeOnGlobalLayoutListener(r1)
        L13:
            r0 = 0
            r2.onGlobalLayoutListener = r0
            r2.callBack = r0
            r2.contentView = r0
            r2.dialog = r0
            return
    }
}
