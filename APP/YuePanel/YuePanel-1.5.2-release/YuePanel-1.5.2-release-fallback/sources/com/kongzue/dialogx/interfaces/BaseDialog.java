package com.kongzue.dialogx.interfaces;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseDialog implements androidx.lifecycle.LifecycleOwner {
    private static java.lang.ref.WeakReference<android.app.Activity> activityWeakReference;
    static java.lang.ref.WeakReference<android.os.Handler> mMainHandler;
    private static java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> runningDialogList;
    private static java.lang.Thread uiThread;
    private static java.util.Map<java.lang.String, com.kongzue.dialogx.util.ActivityRunnable> waitRunDialogX;
    protected static android.view.WindowInsets windowInsets;
    protected boolean autoShowInputKeyboard;
    protected java.lang.Integer backgroundColor;
    protected boolean cancelable;
    protected int[] customDialogLayoutResId;
    protected java.util.Map<java.lang.String, java.lang.Object> data;
    protected java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> dialogActionRunnableMap;
    protected com.kongzue.dialogx.DialogX.IMPL_MODE dialogImplMode;

    @Yue.InterfaceC4544
    private com.kongzue.dialogx.util.DialogListBuilder dialogListBuilder;
    private java.lang.ref.WeakReference<android.view.View> dialogView;
    protected boolean dismissAnimFlag;
    protected boolean enableImmersiveMode;
    protected long enterAnimDuration;
    protected long exitAnimDuration;
    protected java.lang.ref.WeakReference<com.kongzue.dialogx.util.DialogXFloatingWindowActivity> floatingWindowActivity;
    protected int isHapticFeedbackEnabled;
    protected boolean isHide;
    protected boolean isShow;
    protected androidx.lifecycle.LifecycleRegistry lifecycle;
    protected int maxHeight;
    protected int maxWidth;
    protected int minHeight;
    protected int minWidth;
    protected com.kongzue.dialogx.interfaces.DialogXRunnable onDismissRunnable;
    protected com.kongzue.dialogx.interfaces.DialogXRunnable onShowRunnable;
    protected java.lang.ref.WeakReference<android.app.Activity> ownActivity;
    protected java.lang.ref.WeakReference<com.kongzue.dialogx.impl.DialogFragmentImpl> ownDialogFragmentImpl;
    protected boolean preShow;
    private java.lang.ref.WeakReference<android.widget.FrameLayout> rootFrameLayout;
    protected int[] screenPaddings;
    protected com.kongzue.dialogx.interfaces.DialogXStyle style;
    protected com.kongzue.dialogx.DialogX.THEME theme;
    protected int thisOrderIndex;









    /* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.BaseDialog$9, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] $SwitchMap$com$kongzue$dialogx$DialogX$IMPL_MODE = null;

        static {
                com.kongzue.dialogx.DialogX$IMPL_MODE[] r0 = com.kongzue.dialogx.DialogX.IMPL_MODE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.kongzue.dialogx.interfaces.BaseDialog.AnonymousClass9.$SwitchMap$com$kongzue$dialogx$DialogX$IMPL_MODE = r0
                com.kongzue.dialogx.DialogX$IMPL_MODE r1 = com.kongzue.dialogx.DialogX.IMPL_MODE.WINDOW     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.kongzue.dialogx.interfaces.BaseDialog.AnonymousClass9.$SwitchMap$com$kongzue$dialogx$DialogX$IMPL_MODE     // Catch: java.lang.NoSuchFieldError -> L1d
                com.kongzue.dialogx.DialogX$IMPL_MODE r1 = com.kongzue.dialogx.DialogX.IMPL_MODE.DIALOG_FRAGMENT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.kongzue.dialogx.interfaces.BaseDialog.AnonymousClass9.$SwitchMap$com$kongzue$dialogx$DialogX$IMPL_MODE     // Catch: java.lang.NoSuchFieldError -> L28
                com.kongzue.dialogx.DialogX$IMPL_MODE r1 = com.kongzue.dialogx.DialogX.IMPL_MODE.FLOATING_ACTIVITY     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public enum BOOLEAN extends java.lang.Enum<com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN> {
        private static final /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN[] $VALUES = null;
        public static final com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN FALSE = null;
        public static final com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN TRUE = null;

        static {
                com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r0 = new com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN
                java.lang.String r1 = "TRUE"
                r2 = 0
                r0.<init>(r1, r2)
                com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.TRUE = r0
                com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r1 = new com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN
                java.lang.String r2 = "FALSE"
                r3 = 1
                r1.<init>(r2, r3)
                com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.FALSE = r1
                com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN[] r0 = new com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN[]{r0, r1}
                com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.$VALUES = r0
                return
        }

        BOOLEAN(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN valueOf(java.lang.String r1) {
                java.lang.Class<com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN> r0 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r1 = (com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN) r1
                return r1
        }

        public static com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN[] values() {
                com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN[] r0 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN[] r0 = (com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN[]) r0
                return r0
        }
    }

    public enum BUTTON_SELECT_RESULT extends java.lang.Enum<com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT> {
        private static final /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT[] $VALUES = null;
        public static final com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT BUTTON_CANCEL = null;
        public static final com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT BUTTON_OK = null;
        public static final com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT BUTTON_OTHER = null;
        public static final com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT NONE = null;

        static {
                com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r0 = new com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.NONE = r0
                com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = new com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT
                java.lang.String r2 = "BUTTON_OK"
                r3 = 1
                r1.<init>(r2, r3)
                com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.BUTTON_OK = r1
                com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r2 = new com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT
                java.lang.String r3 = "BUTTON_CANCEL"
                r4 = 2
                r2.<init>(r3, r4)
                com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.BUTTON_CANCEL = r2
                com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r3 = new com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT
                java.lang.String r4 = "BUTTON_OTHER"
                r5 = 3
                r3.<init>(r4, r5)
                com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.BUTTON_OTHER = r3
                com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT[] r0 = new com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT[]{r0, r1, r2, r3}
                com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.$VALUES = r0
                return
        }

        BUTTON_SELECT_RESULT(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT valueOf(java.lang.String r1) {
                java.lang.Class<com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT> r0 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT r1 = (com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT) r1
                return r1
        }

        public static com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT[] values() {
                com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT[] r0 = com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kongzue.dialogx.interfaces.BaseDialog$BUTTON_SELECT_RESULT[] r0 = (com.kongzue.dialogx.interfaces.BaseDialog.BUTTON_SELECT_RESULT[]) r0
                return r0
        }
    }

    public BaseDialog() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.isHapticFeedbackEnabled = r0
            com.kongzue.dialogx.DialogX$IMPL_MODE r0 = com.kongzue.dialogx.DialogX.implIMPLMode
            r2.dialogImplMode = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r2)
            r2.lifecycle = r0
            r0 = 1
            r2.enableImmersiveMode = r0
            r1 = 0
            r2.thisOrderIndex = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.dialogActionRunnableMap = r1
            r1 = 2
            int[] r1 = new int[r1]
            r2.customDialogLayoutResId = r1
            r2.cancelable = r0
            r0 = 0
            r2.backgroundColor = r0
            r0 = -1
            r2.enterAnimDuration = r0
            r2.exitAnimDuration = r0
            r0 = 4
            int[] r0 = new int[r0]
            r2.screenPaddings = r0
            boolean r0 = com.kongzue.dialogx.DialogX.cancelable
            r2.cancelable = r0
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = com.kongzue.dialogx.DialogX.globalStyle
            r2.style = r0
            com.kongzue.dialogx.DialogX$THEME r0 = com.kongzue.dialogx.DialogX.globalTheme
            r2.theme = r0
            long r0 = com.kongzue.dialogx.DialogX.enterAnimDuration
            r2.enterAnimDuration = r0
            long r0 = com.kongzue.dialogx.DialogX.exitAnimDuration
            r2.exitAnimDuration = r0
            boolean r0 = com.kongzue.dialogx.DialogX.autoShowInputKeyboard
            r2.autoShowInputKeyboard = r0
            boolean r0 = com.kongzue.dialogx.DialogX.enableImmersiveMode
            r2.enableImmersiveMode = r0
            return
    }

    public static /* synthetic */ void access$000(android.app.Activity r0) {
            initActivityContext(r0)
            return
    }

    public static /* synthetic */ void access$100() {
            requestDialogFocus()
            return
    }

    private static void addDialogToRunningList(com.kongzue.dialogx.interfaces.BaseDialog r1) {
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r0 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            if (r0 != 0) goto Lb
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList = r0
        Lb:
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r0 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            r0.add(r1)
            return
    }

    public static void cleanAll() {
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r0 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            if (r0 == 0) goto L2d
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r1 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            com.kongzue.dialogx.interfaces.BaseDialog r1 = (com.kongzue.dialogx.interfaces.BaseDialog) r1
            boolean r2 = r1.isShow()
            if (r2 == 0) goto L24
            r1.shutdown()
        L24:
            r1.cleanActivityContext()
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r2 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            r2.remove(r1)
            goto Lf
        L2d:
            return
    }

    public static void cleanContext() {
            java.lang.ref.WeakReference<android.app.Activity> r0 = com.kongzue.dialogx.interfaces.BaseDialog.activityWeakReference
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r0 = 0
            com.kongzue.dialogx.interfaces.BaseDialog.activityWeakReference = r0
            gc()
            return
    }

    public static void dismiss(android.view.View r4) {
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r4.getTag()
            com.kongzue.dialogx.interfaces.BaseDialog r0 = (com.kongzue.dialogx.interfaces.BaseDialog) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.dialogKey()
            r1.append(r2)
            java.lang.String r2 = ".dismiss"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            log(r1)
            removeDialogToRunningList(r0)
            java.lang.ref.WeakReference<android.view.View> r1 = r0.dialogView
            if (r1 == 0) goto L2b
            r1.clear()
        L2b:
            r0.onDialogDismiss()
            int[] r1 = com.kongzue.dialogx.interfaces.BaseDialog.AnonymousClass9.$SwitchMap$com$kongzue$dialogx$DialogX$IMPL_MODE
            com.kongzue.dialogx.DialogX$IMPL_MODE r2 = r0.dialogImplMode
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L8e
            r3 = 2
            if (r1 == r3) goto L78
            r3 = 3
            if (r1 == r3) goto L4a
            com.kongzue.dialogx.interfaces.BaseDialog$6 r1 = new com.kongzue.dialogx.interfaces.BaseDialog$6
            r1.<init>(r4, r0)
            runOnMain(r1, r2)
            goto L91
        L4a:
            java.lang.ref.WeakReference<com.kongzue.dialogx.util.DialogXFloatingWindowActivity> r1 = r0.floatingWindowActivity
            if (r1 == 0) goto L91
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L91
            java.lang.ref.WeakReference<com.kongzue.dialogx.util.DialogXFloatingWindowActivity> r1 = r0.floatingWindowActivity
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            android.widget.FrameLayout r1 = getDecorView(r1)
            if (r1 == 0) goto L65
            r1.removeView(r4)
        L65:
            java.lang.ref.WeakReference<com.kongzue.dialogx.util.DialogXFloatingWindowActivity> r4 = r0.floatingWindowActivity
            java.lang.Object r4 = r4.get()
            com.kongzue.dialogx.util.DialogXFloatingWindowActivity r4 = (com.kongzue.dialogx.util.DialogXFloatingWindowActivity) r4
            java.lang.String r1 = r0.dialogKey()
            r4.finish(r1)
            requestDialogFocus()
            goto L91
        L78:
            java.lang.ref.WeakReference<com.kongzue.dialogx.impl.DialogFragmentImpl> r4 = r0.ownDialogFragmentImpl
            if (r4 == 0) goto L91
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L91
            java.lang.ref.WeakReference<com.kongzue.dialogx.impl.DialogFragmentImpl> r4 = r0.ownDialogFragmentImpl
            java.lang.Object r4 = r4.get()
            com.kongzue.dialogx.impl.DialogFragmentImpl r4 = (com.kongzue.dialogx.impl.DialogFragmentImpl) r4
            r4.dismiss()
            goto L91
        L8e:
            com.kongzue.dialogx.util.WindowUtil.dismiss(r4)
        L91:
            com.kongzue.dialogx.util.DialogListBuilder r4 = r0.getDialogListBuilder()
            if (r4 == 0) goto Lac
            com.kongzue.dialogx.util.DialogListBuilder r4 = r0.getDialogListBuilder()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto La5
            r0.cleanDialogList()
            goto Lac
        La5:
            com.kongzue.dialogx.util.DialogListBuilder r4 = r0.getDialogListBuilder()
            r4.showNext()
        Lac:
            return
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

    public static void gc() {
            boolean r0 = com.kongzue.dialogx.DialogX.autoGC
            if (r0 == 0) goto L7
            java.lang.System.gc()
        L7:
            return
    }

    public static com.kongzue.dialogx.util.ActivityRunnable getActivityRunnable(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.util.Map<java.lang.String, com.kongzue.dialogx.util.ActivityRunnable> r0 = com.kongzue.dialogx.interfaces.BaseDialog.waitRunDialogX
            java.lang.Object r1 = r0.get(r1)
            com.kongzue.dialogx.util.ActivityRunnable r1 = (com.kongzue.dialogx.util.ActivityRunnable) r1
            return r1
    }

    public static android.content.Context getApplicationContext() {
            android.app.Application r0 = com.kongzue.dialogx.impl.ActivityLifecycleImpl.getApplicationContext()
            return r0
    }

    @java.lang.Deprecated
    public static android.content.Context getContext() {
            android.content.Context r0 = getPrivateContext()
            return r0
    }

    public static android.widget.FrameLayout getDecorView(android.app.Activity r1) {
            if (r1 == 0) goto L20
            android.view.Window r0 = r1.getWindow()
            if (r0 == 0) goto L20
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0 instanceof android.widget.FrameLayout
            if (r0 != 0) goto L15
            goto L20
        L15:
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            return r1
        L20:
            r1 = 0
            return r1
    }

    private static android.os.Handler getMainHandler() {
            java.lang.ref.WeakReference<android.os.Handler> r0 = com.kongzue.dialogx.interfaces.BaseDialog.mMainHandler
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L13
            java.lang.ref.WeakReference<android.os.Handler> r0 = com.kongzue.dialogx.interfaces.BaseDialog.mMainHandler
            java.lang.Object r0 = r0.get()
            android.os.Handler r0 = (android.os.Handler) r0
            return r0
        L13:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.mMainHandler = r0
            java.lang.Object r0 = r0.get()
            android.os.Handler r0 = (android.os.Handler) r0
            return r0
    }

    private static android.content.Context getPrivateContext() {
            android.app.Activity r0 = getTopActivity()
            if (r0 != 0) goto L12
            android.content.Context r0 = getApplicationContext()
            if (r0 != 0) goto L12
            java.lang.String r0 = "DialogX 未初始化(E2)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            error(r0)
            r0 = 0
        L12:
            return r0
    }

    public static java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> getRunningDialogList() {
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r0 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            if (r0 != 0) goto La
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        La:
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r1 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            r0.<init>(r1)
            return r0
    }

    public static java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> getRunningDialogList(android.app.Activity r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r1 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            com.kongzue.dialogx.interfaces.BaseDialog r2 = (com.kongzue.dialogx.interfaces.BaseDialog) r2
            if (r2 == 0) goto Lb
            boolean r3 = r2.isShow
            if (r3 == 0) goto Lb
            android.app.Activity r3 = r2.getOwnActivity()
            if (r3 != r4) goto Lb
            r0.add(r2)
            goto Lb
        L27:
            return r0
    }

    private static androidx.fragment.app.FragmentManager getSupportFragmentManager(android.app.Activity r1) {
            boolean r0 = r1 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto Lb
            androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1
            androidx.fragment.app.FragmentManager r1 = r1.getSupportFragmentManager()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    public static android.app.Activity getTopActivity() {
            java.lang.ref.WeakReference<android.app.Activity> r0 = com.kongzue.dialogx.interfaces.BaseDialog.activityWeakReference
            if (r0 == 0) goto L14
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lb
            goto L14
        Lb:
            java.lang.ref.WeakReference<android.app.Activity> r0 = com.kongzue.dialogx.interfaces.BaseDialog.activityWeakReference
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L14:
            r0 = 0
            init(r0)
            java.lang.ref.WeakReference<android.app.Activity> r0 = com.kongzue.dialogx.interfaces.BaseDialog.activityWeakReference
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L23
            goto L2c
        L23:
            java.lang.ref.WeakReference<android.app.Activity> r0 = com.kongzue.dialogx.interfaces.BaseDialog.activityWeakReference
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L2c:
            android.app.Activity r0 = com.kongzue.dialogx.impl.ActivityLifecycleImpl.getTopActivity()
            init(r0)
            return r0
    }

    public static java.lang.Thread getUiThread() {
            java.lang.Thread r0 = com.kongzue.dialogx.interfaces.BaseDialog.uiThread
            if (r0 != 0) goto Le
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            com.kongzue.dialogx.interfaces.BaseDialog.uiThread = r0
        Le:
            java.lang.Thread r0 = com.kongzue.dialogx.interfaces.BaseDialog.uiThread
            return r0
    }

    public static void init(android.content.Context r1) {
            if (r1 != 0) goto L6
            android.app.Activity r1 = com.kongzue.dialogx.impl.ActivityLifecycleImpl.getTopActivity()
        L6:
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L10
            r0 = r1
            android.app.Activity r0 = (android.app.Activity) r0
            initActivityContext(r0)
        L10:
            com.kongzue.dialogx.interfaces.BaseDialog$1 r0 = new com.kongzue.dialogx.interfaces.BaseDialog$1
            r0.<init>()
            com.kongzue.dialogx.impl.ActivityLifecycleImpl.init(r1, r0)
            return
    }

    private static void initActivityContext(android.app.Activity r1) {
            boolean r0 = com.kongzue.dialogx.impl.ActivityLifecycleImpl.isExemptActivities(r1)
            if (r0 == 0) goto L7
            return
        L7:
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Exception -> L19
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Exception -> L19
            com.kongzue.dialogx.interfaces.BaseDialog.uiThread = r0     // Catch: java.lang.Exception -> L19
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> L19
            r0.<init>(r1)     // Catch: java.lang.Exception -> L19
            com.kongzue.dialogx.interfaces.BaseDialog.activityWeakReference = r0     // Catch: java.lang.Exception -> L19
            goto L22
        L19:
            r1 = move-exception
            r1.printStackTrace()
            java.lang.String r1 = "DialogX.init: 初始化异常，找不到Activity的根布局"
            error(r1)
        L22:
            return
    }

    public static boolean isActivityDestroyed(android.app.Activity r1) {
            if (r1 == 0) goto L23
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L23
            boolean r0 = r1.isDestroyed()
            if (r0 != 0) goto L23
            boolean r0 = r1 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L21
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r1.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 != r0) goto L21
            goto L23
        L21:
            r1 = 0
            goto L24
        L23:
            r1 = 1
        L24:
            return r1
    }

    private boolean isActivityImplMode() {
            r2 = this;
            com.kongzue.dialogx.DialogX$IMPL_MODE r0 = r2.getDialogImplMode()
            com.kongzue.dialogx.DialogX$IMPL_MODE r1 = com.kongzue.dialogx.DialogX.IMPL_MODE.VIEW
            if (r0 == r1) goto L1b
            com.kongzue.dialogx.DialogX$IMPL_MODE r0 = r2.getDialogImplMode()
            com.kongzue.dialogx.DialogX$IMPL_MODE r1 = com.kongzue.dialogx.DialogX.IMPL_MODE.FLOATING_ACTIVITY
            if (r0 == r1) goto L1b
            com.kongzue.dialogx.DialogX$IMPL_MODE r0 = r2.getDialogImplMode()
            com.kongzue.dialogx.DialogX$IMPL_MODE r1 = com.kongzue.dialogx.DialogX.IMPL_MODE.DIALOG_FRAGMENT
            if (r0 != r1) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            return r0
    }

    public static boolean isNull(java.lang.CharSequence r1) {
            java.lang.String r0 = java.lang.String.valueOf(r1)
            if (r1 == 0) goto L23
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L23
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L23
            java.lang.String r1 = "(null)"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L21
            goto L23
        L21:
            r1 = 0
            return r1
        L23:
            r1 = 1
            return r1
    }

    public static boolean isNull(java.lang.String r1) {
            if (r1 == 0) goto L1f
            java.lang.String r0 = r1.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1f
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "(null)"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1d
            goto L1f
        L1d:
            r1 = 0
            return r1
        L1f:
            r1 = 1
            return r1
    }

    public static void log(java.lang.Object r1) {
            boolean r0 = com.kongzue.dialogx.DialogX.DEBUGMODE
            if (r0 == 0) goto Ld
            java.lang.String r0 = ">>>"
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r0, r1)
        Ld:
            return
    }

    public static void onActivityResume(android.app.Activity r4) {
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r0 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            if (r0 == 0) goto L46
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r1 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            r0.<init>(r1)
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L11:
            if (r1 < 0) goto L46
            java.lang.Object r2 = r0.get(r1)
            com.kongzue.dialogx.interfaces.BaseDialog r2 = (com.kongzue.dialogx.interfaces.BaseDialog) r2
            android.app.Activity r3 = r2.getOwnActivity()
            if (r3 != r4) goto L43
            boolean r3 = r2.isShow
            if (r3 == 0) goto L43
            android.view.View r3 = r2.getDialogView()
            if (r3 == 0) goto L43
            android.view.View r2 = r2.getDialogView()
            int r3 = com.kongzue.dialogx.R.id.box_root
            android.view.View r2 = r2.findViewById(r3)
            boolean r3 = r2 instanceof com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout
            if (r3 == 0) goto L43
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r2
            boolean r3 = r2.isBaseFocusable()
            if (r3 == 0) goto L43
            r2.requestFocusOnResume()
            return
        L43:
            int r1 = r1 + (-1)
            goto L11
        L46:
            return
    }

    public static android.view.WindowInsets publicWindowInsets() {
            android.view.WindowInsets r0 = com.kongzue.dialogx.interfaces.BaseDialog.windowInsets
            return r0
    }

    public static void recycleDialog(android.app.Activity r3) {
            int[] r0 = com.kongzue.dialogx.interfaces.BaseDialog.AnonymousClass9.$SwitchMap$com$kongzue$dialogx$DialogX$IMPL_MODE
            com.kongzue.dialogx.DialogX$IMPL_MODE r1 = com.kongzue.dialogx.DialogX.implIMPLMode
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L8c
            r1 = 2
            if (r0 == r1) goto L46
            r1 = 3
            if (r0 == r1) goto Lca
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r0 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            if (r0 == 0) goto Lca
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r1 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lca
            java.lang.Object r1 = r0.next()
            com.kongzue.dialogx.interfaces.BaseDialog r1 = (com.kongzue.dialogx.interfaces.BaseDialog) r1
            android.app.Activity r2 = r1.getOwnActivity()
            if (r2 != r3) goto L22
            r1.cleanActivityContext()
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r2 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            r2.remove(r1)
            boolean r2 = r1 instanceof com.kongzue.dialogx.dialogs.WaitDialog
            if (r2 == 0) goto L22
            com.kongzue.dialogx.dialogs.WaitDialog r1 = (com.kongzue.dialogx.dialogs.WaitDialog) r1
            r1.cleanInstance()
            goto L22
        L46:
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r0 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            if (r0 == 0) goto Lca
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r1 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L55:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lca
            java.lang.Object r1 = r0.next()
            com.kongzue.dialogx.interfaces.BaseDialog r1 = (com.kongzue.dialogx.interfaces.BaseDialog) r1
            android.app.Activity r2 = r1.getOwnActivity()
            if (r2 != r3) goto L55
            java.lang.ref.WeakReference<com.kongzue.dialogx.impl.DialogFragmentImpl> r2 = r1.ownDialogFragmentImpl
            if (r2 == 0) goto L55
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L55
            java.lang.ref.WeakReference<com.kongzue.dialogx.impl.DialogFragmentImpl> r2 = r1.ownDialogFragmentImpl
            java.lang.Object r2 = r2.get()
            com.kongzue.dialogx.impl.DialogFragmentImpl r2 = (com.kongzue.dialogx.impl.DialogFragmentImpl) r2
            r2.dismiss()
            boolean r2 = r1 instanceof com.kongzue.dialogx.dialogs.WaitDialog
            if (r2 == 0) goto L86
            r2 = r1
            com.kongzue.dialogx.dialogs.WaitDialog r2 = (com.kongzue.dialogx.dialogs.WaitDialog) r2
            r2.cleanInstance()
        L86:
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r2 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            r2.remove(r1)
            goto L55
        L8c:
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r0 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            if (r0 == 0) goto Lca
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r1 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L9b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lca
            java.lang.Object r1 = r0.next()
            com.kongzue.dialogx.interfaces.BaseDialog r1 = (com.kongzue.dialogx.interfaces.BaseDialog) r1
            android.app.Activity r2 = r1.getOwnActivity()
            if (r2 != r3) goto L9b
            java.lang.ref.WeakReference<android.view.View> r2 = r1.dialogView
            if (r2 == 0) goto L9b
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            com.kongzue.dialogx.util.WindowUtil.dismiss(r2)
            boolean r2 = r1 instanceof com.kongzue.dialogx.dialogs.WaitDialog
            if (r2 == 0) goto Lc4
            r2 = r1
            com.kongzue.dialogx.dialogs.WaitDialog r2 = (com.kongzue.dialogx.dialogs.WaitDialog) r2
            r2.cleanInstance()
        Lc4:
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r2 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            r2.remove(r1)
            goto L9b
        Lca:
            android.app.Activity r0 = getTopActivity()
            if (r3 != r0) goto Ld3
            cleanContext()
        Ld3:
            return
    }

    private static void removeDialogToRunningList(com.kongzue.dialogx.interfaces.BaseDialog r1) {
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r0 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            if (r0 == 0) goto L7
            r0.remove(r1)
        L7:
            return
    }

    private static void requestDialogFocus() {
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r0 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            if (r0 == 0) goto L4b
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r1 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            r0.<init>(r1)
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L11:
            if (r1 < 0) goto L4b
            java.lang.Object r2 = r0.get(r1)
            com.kongzue.dialogx.interfaces.BaseDialog r2 = (com.kongzue.dialogx.interfaces.BaseDialog) r2
            android.app.Activity r3 = r2.getOwnActivity()
            android.app.Activity r4 = getTopActivity()
            if (r3 != r4) goto L48
            boolean r3 = r2.isShow
            if (r3 == 0) goto L48
            android.view.View r3 = r2.getDialogView()
            if (r3 == 0) goto L48
            android.view.View r2 = r2.getDialogView()
            int r3 = com.kongzue.dialogx.R.id.box_root
            android.view.View r2 = r2.findViewById(r3)
            boolean r3 = r2 instanceof com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout
            if (r3 == 0) goto L48
            r3 = r2
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r3
            boolean r3 = r3.isBaseFocusable()
            if (r3 == 0) goto L48
            r2.requestFocus()
            return
        L48:
            int r1 = r1 + (-1)
            goto L11
        L4b:
            return
    }

    public static void runOnMain(java.lang.Runnable r2) {
            boolean r0 = com.kongzue.dialogx.DialogX.autoRunOnUIThread
            if (r0 == 0) goto L1a
            java.lang.Thread r0 = getUiThread()
            if (r0 == 0) goto L15
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread r1 = getUiThread()
            if (r0 != r1) goto L15
            goto L1a
        L15:
            r0 = 1
            runOnMain(r2, r0)
            return
        L1a:
            r2.run()
            return
    }

    public static void runOnMain(java.lang.Runnable r0, boolean r1) {
            android.os.Handler r1 = getMainHandler()
            r1.post(r0)
            return
    }

    public static void runOnMainDelay(java.lang.Runnable r2, long r3) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L7
            return
        L7:
            boolean r0 = com.kongzue.dialogx.DialogX.autoRunOnUIThread
            if (r0 != 0) goto Le
            r2.run()
        Le:
            android.os.Handler r0 = getMainHandler()
            r0.postDelayed(r2, r3)
            return
    }

    private void setOwnActivity(android.app.Activity r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.ownActivity = r0
            return
    }

    public static void show(android.app.Activity r5, android.view.View r6) {
            if (r5 == 0) goto L14c
            if (r6 != 0) goto L6
            goto L14c
        L6:
            java.lang.ref.WeakReference<android.app.Activity> r0 = com.kongzue.dialogx.interfaces.BaseDialog.activityWeakReference
            if (r0 == 0) goto L16
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L16
            android.app.Application r0 = com.kongzue.dialogx.impl.ActivityLifecycleImpl.getApplicationContext()
            if (r0 != 0) goto L1d
        L16:
            android.content.Context r0 = r5.getApplicationContext()
            init(r0)
        L1d:
            java.lang.Object r0 = r6.getTag()
            com.kongzue.dialogx.interfaces.BaseDialog r0 = (com.kongzue.dialogx.interfaces.BaseDialog) r0
            if (r0 == 0) goto L14c
            r0.setOwnActivity(r5)
            android.view.View r1 = r0.getDialogView()
            r2 = 0
            if (r1 == 0) goto L36
            android.view.View r1 = r0.getDialogView()
            r1.setVisibility(r2)
        L36:
            boolean r1 = r0.isShow
            if (r1 == 0) goto L59
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Object r6 = r6.getTag()
            com.kongzue.dialogx.interfaces.BaseDialog r6 = (com.kongzue.dialogx.interfaces.BaseDialog) r6
            java.lang.String r6 = r6.dialogKey()
            r5.append(r6)
            java.lang.String r6 = "已处于显示状态，请勿重复执行 show() 指令。"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            error(r5)
            return
        L59:
            boolean r1 = r5.isDestroyed()
            if (r1 == 0) goto L7e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Object r6 = r6.getTag()
            com.kongzue.dialogx.interfaces.BaseDialog r6 = (com.kongzue.dialogx.interfaces.BaseDialog) r6
            java.lang.String r6 = r6.dialogKey()
            r5.append(r6)
            java.lang.String r6 = ".show ERROR: activity is Destroyed."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            error(r5)
            return
        L7e:
            boolean r1 = r0.preShow(r0)
            if (r1 == 0) goto L85
            return
        L85:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r6)
            r0.dialogView = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r3 = ".show on "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            log(r1)
            addDialogToRunningList(r0)
            int[] r1 = com.kongzue.dialogx.interfaces.BaseDialog.AnonymousClass9.$SwitchMap$com$kongzue$dialogx$DialogX$IMPL_MODE
            com.kongzue.dialogx.DialogX$IMPL_MODE r3 = r0.dialogImplMode
            int r3 = r3.ordinal()
            r1 = r1[r3]
            r3 = 1
            if (r1 == r3) goto L146
            r3 = 2
            if (r1 == r3) goto L130
            r3 = 3
            if (r1 == r3) goto Lca
            android.widget.FrameLayout r5 = getDecorView(r5)
            if (r5 != 0) goto Lc0
            return
        Lc0:
            com.kongzue.dialogx.interfaces.BaseDialog$5 r1 = new com.kongzue.dialogx.interfaces.BaseDialog$5
            r1.<init>(r6, r0, r5)
            runOnMain(r1)
            goto L14c
        Lca:
            java.util.Map<java.lang.String, com.kongzue.dialogx.util.ActivityRunnable> r1 = com.kongzue.dialogx.interfaces.BaseDialog.waitRunDialogX
            if (r1 != 0) goto Ld5
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.kongzue.dialogx.interfaces.BaseDialog.waitRunDialogX = r1
        Ld5:
            java.util.Map<java.lang.String, com.kongzue.dialogx.util.ActivityRunnable> r1 = com.kongzue.dialogx.interfaces.BaseDialog.waitRunDialogX
            java.lang.String r3 = r0.dialogKey()
            com.kongzue.dialogx.interfaces.BaseDialog$4 r4 = new com.kongzue.dialogx.interfaces.BaseDialog$4
            r4.<init>(r0, r6)
            r1.put(r3, r4)
            com.kongzue.dialogx.util.DialogXFloatingWindowActivity r6 = com.kongzue.dialogx.util.DialogXFloatingWindowActivity.getDialogXFloatingWindowActivity()
            if (r6 == 0) goto Lfb
            int r1 = r5.hashCode()
            boolean r1 = r6.isSameFrom(r1)
            if (r1 == 0) goto Lfb
            java.lang.String r5 = r0.dialogKey()
            r6.showDialogX(r5)
            return
        Lfb:
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<com.kongzue.dialogx.util.DialogXFloatingWindowActivity> r1 = com.kongzue.dialogx.util.DialogXFloatingWindowActivity.class
            r6.<init>(r5, r1)
            java.lang.String r1 = "dialogXKey"
            java.lang.String r0 = r0.dialogKey()
            r6.putExtra(r1, r0)
            java.lang.String r0 = "from"
            int r1 = r5.hashCode()
            r6.putExtra(r0, r1)
            android.widget.FrameLayout r0 = getDecorView(r5)
            if (r0 != 0) goto L11c
            r0 = r2
            goto L124
        L11c:
            android.widget.FrameLayout r0 = getDecorView(r5)
            int r0 = r0.getSystemUiVisibility()
        L124:
            java.lang.String r1 = "fromActivityUiStatus"
            r6.putExtra(r1, r0)
            r5.startActivity(r6)
            r5.overridePendingTransition(r2, r2)
            goto L14c
        L130:
            com.kongzue.dialogx.impl.DialogFragmentImpl r1 = new com.kongzue.dialogx.impl.DialogFragmentImpl
            r1.<init>(r0, r6)
            androidx.fragment.app.FragmentManager r5 = getSupportFragmentManager(r5)
            java.lang.String r6 = "DialogX"
            r1.show(r5, r6)
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r1)
            r0.ownDialogFragmentImpl = r5
            goto L14c
        L146:
            boolean r0 = r0 instanceof com.kongzue.dialogx.interfaces.NoTouchInterface
            r0 = r0 ^ r3
            com.kongzue.dialogx.util.WindowUtil.show(r5, r6, r0)
        L14c:
            return
    }

    public static void show(android.view.View r5) {
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r5.getTag()
            com.kongzue.dialogx.interfaces.BaseDialog r0 = (com.kongzue.dialogx.interfaces.BaseDialog) r0
            if (r0 == 0) goto L158
            boolean r1 = r0.isShow
            r2 = 0
            if (r1 == 0) goto L3d
            android.view.View r1 = r0.getDialogView()
            if (r1 == 0) goto L1e
            android.view.View r5 = r0.getDialogView()
            r5.setVisibility(r2)
            return
        L1e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r5 = r5.getTag()
            com.kongzue.dialogx.interfaces.BaseDialog r5 = (com.kongzue.dialogx.interfaces.BaseDialog) r5
            java.lang.String r5 = r5.dialogKey()
            r0.append(r5)
            java.lang.String r5 = "已处于显示状态，请勿重复执行 show() 指令。"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            error(r5)
            return
        L3d:
            boolean r1 = r0.preShow(r0)
            if (r1 == 0) goto L44
            return
        L44:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r5)
            r0.dialogView = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r0.dialogKey()
            r1.append(r3)
            java.lang.String r3 = ".show on "
            r1.append(r3)
            boolean r3 = r0.isActivityImplMode()
            if (r3 == 0) goto L67
            android.app.Activity r3 = r0.getOwnActivity()
            goto L69
        L67:
            java.lang.String r3 = "window"
        L69:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            log(r1)
            addDialogToRunningList(r0)
            int[] r1 = com.kongzue.dialogx.interfaces.BaseDialog.AnonymousClass9.$SwitchMap$com$kongzue$dialogx$DialogX$IMPL_MODE
            com.kongzue.dialogx.DialogX$IMPL_MODE r3 = r0.dialogImplMode
            int r3 = r3.ordinal()
            r1 = r1[r3]
            r3 = 1
            if (r1 == r3) goto L14e
            r3 = 2
            if (r1 == r3) goto L134
            r3 = 3
            if (r1 == r3) goto L9a
            android.widget.FrameLayout r1 = r0.getRootFrameLayout()
            if (r1 != 0) goto L90
            return
        L90:
            com.kongzue.dialogx.interfaces.BaseDialog$3 r1 = new com.kongzue.dialogx.interfaces.BaseDialog$3
            r1.<init>(r5, r0)
            runOnMain(r1)
            goto L158
        L9a:
            java.util.Map<java.lang.String, com.kongzue.dialogx.util.ActivityRunnable> r1 = com.kongzue.dialogx.interfaces.BaseDialog.waitRunDialogX
            if (r1 != 0) goto La5
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.kongzue.dialogx.interfaces.BaseDialog.waitRunDialogX = r1
        La5:
            java.util.Map<java.lang.String, com.kongzue.dialogx.util.ActivityRunnable> r1 = com.kongzue.dialogx.interfaces.BaseDialog.waitRunDialogX
            java.lang.String r3 = r0.dialogKey()
            com.kongzue.dialogx.interfaces.BaseDialog$2 r4 = new com.kongzue.dialogx.interfaces.BaseDialog$2
            r4.<init>(r0, r5)
            r1.put(r3, r4)
            com.kongzue.dialogx.util.DialogXFloatingWindowActivity r5 = com.kongzue.dialogx.util.DialogXFloatingWindowActivity.getDialogXFloatingWindowActivity()
            if (r5 == 0) goto Lcf
            android.app.Activity r1 = r0.getOwnActivity()
            int r1 = r1.hashCode()
            boolean r1 = r5.isSameFrom(r1)
            if (r1 == 0) goto Lcf
            java.lang.String r0 = r0.dialogKey()
            r5.showDialogX(r0)
            return
        Lcf:
            android.content.Intent r5 = new android.content.Intent
            android.content.Context r1 = getPrivateContext()
            java.lang.Class<com.kongzue.dialogx.util.DialogXFloatingWindowActivity> r3 = com.kongzue.dialogx.util.DialogXFloatingWindowActivity.class
            r5.<init>(r1, r3)
            android.app.Activity r1 = r0.getOwnActivity()
            if (r1 != 0) goto Le5
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r5.addFlags(r1)
        Le5:
            java.lang.String r1 = "dialogXKey"
            java.lang.String r3 = r0.dialogKey()
            r5.putExtra(r1, r3)
            android.app.Activity r1 = r0.getOwnActivity()
            if (r1 != 0) goto Lf6
        Lf4:
            r1 = r2
            goto L10d
        Lf6:
            android.app.Activity r1 = r0.getOwnActivity()
            android.widget.FrameLayout r1 = getDecorView(r1)
            if (r1 != 0) goto L101
            goto Lf4
        L101:
            android.app.Activity r1 = r0.getOwnActivity()
            android.widget.FrameLayout r1 = getDecorView(r1)
            int r1 = r1.getSystemUiVisibility()
        L10d:
            java.lang.String r3 = "fromActivityUiStatus"
            r5.putExtra(r3, r1)
            android.content.Context r1 = getPrivateContext()
            int r1 = r1.hashCode()
            java.lang.String r3 = "from"
            r5.putExtra(r3, r1)
            android.content.Context r1 = getPrivateContext()
            r1.startActivity(r5)
            android.app.Activity r5 = r0.getOwnActivity()
            if (r5 == 0) goto L158
            android.app.Activity r5 = r0.getOwnActivity()
            r5.overridePendingTransition(r2, r2)
            goto L158
        L134:
            com.kongzue.dialogx.impl.DialogFragmentImpl r1 = new com.kongzue.dialogx.impl.DialogFragmentImpl
            r1.<init>(r0, r5)
            android.app.Activity r5 = r0.getOwnActivity()
            androidx.fragment.app.FragmentManager r5 = getSupportFragmentManager(r5)
            java.lang.String r2 = "DialogX"
            r1.show(r5, r2)
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r1)
            r0.ownDialogFragmentImpl = r5
            goto L158
        L14e:
            android.app.Activity r1 = r0.getOwnActivity()
            boolean r0 = r0 instanceof com.kongzue.dialogx.interfaces.NoTouchInterface
            r0 = r0 ^ r3
            com.kongzue.dialogx.util.WindowUtil.show(r1, r5, r0)
        L158:
            return
    }

    public static void useTextInfo(android.widget.TextView r2, com.kongzue.dialogx.util.TextInfo r3) {
            if (r3 != 0) goto L3
            return
        L3:
            if (r2 != 0) goto L6
            return
        L6:
            int r0 = r3.getFontSize()
            if (r0 <= 0) goto L18
            int r0 = r3.getFontSizeComplexUnit()
            int r1 = r3.getFontSize()
            float r1 = (float) r1
            r2.setTextSize(r0, r1)
        L18:
            int r0 = r3.getFontColor()
            r1 = 1
            if (r0 == r1) goto L26
            int r0 = r3.getFontColor()
            r2.setTextColor(r0)
        L26:
            int r0 = r3.getGravity()
            r1 = -1
            if (r0 == r1) goto L34
            int r0 = r3.getGravity()
            r2.setGravity(r0)
        L34:
            boolean r0 = r3.isShowEllipsis()
            if (r0 == 0) goto L40
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r0)
            goto L44
        L40:
            r0 = 0
            r2.setEllipsize(r0)
        L44:
            int r0 = r3.getMaxLines()
            if (r0 == r1) goto L52
            int r0 = r3.getMaxLines()
            r2.setMaxLines(r0)
            goto L58
        L52:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.setMaxLines(r0)
        L58:
            android.graphics.Typeface r0 = r3.getTypeface()
            if (r0 == 0) goto L65
            android.graphics.Typeface r0 = r3.getTypeface()
            r2.setTypeface(r0)
        L65:
            android.text.TextPaint r2 = r2.getPaint()
            boolean r3 = r3.isBold()
            r2.setFakeBoldText(r3)
            return
    }

    public void beforeShow() {
            r3 = this;
            r0 = 1
            r3.preShow = r0
            r0 = 0
            r3.dismissAnimFlag = r0
            android.app.Activity r0 = getTopActivity()
            r3.setOwnActivity(r0)
            android.app.Activity r0 = r3.getOwnActivity()
            if (r0 != 0) goto L29
            boolean r0 = r3.isActivityImplMode()
            if (r0 == 0) goto L29
            r0 = 0
            init(r0)
            android.app.Activity r0 = r3.getOwnActivity()
            if (r0 != 0) goto L29
            java.lang.String r0 = "DialogX 未初始化(E5)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            error(r0)
            return
        L29:
            com.kongzue.dialogx.DialogX$IMPL_MODE r0 = r3.dialogImplMode
            com.kongzue.dialogx.DialogX$IMPL_MODE r1 = com.kongzue.dialogx.DialogX.IMPL_MODE.VIEW
            if (r0 == r1) goto L49
            android.app.Activity r0 = r3.getOwnActivity()
            boolean r0 = r0 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L49
            android.app.Activity r0 = r3.getOwnActivity()
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            com.kongzue.dialogx.interfaces.BaseDialog$7 r1 = new com.kongzue.dialogx.interfaces.BaseDialog$7
            r1.<init>(r3)
            r0.addObserver(r1)
        L49:
            boolean r0 = r3 instanceof com.kongzue.dialogx.interfaces.NoTouchInterface
            if (r0 != 0) goto L6b
            android.app.Activity r0 = r3.getOwnActivity()
            android.view.View r0 = r0.getCurrentFocus()
            if (r0 == 0) goto L6b
            android.app.Activity r1 = r3.getOwnActivity()
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            android.os.IBinder r0 = r0.getWindowToken()
            r2 = 2
            r1.hideSoftInputFromWindow(r0, r2)
        L6b:
            return
    }

    public void bindDismissWithLifecycleOwnerPrivate(androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            com.kongzue.dialogx.interfaces.BaseDialog$8 r0 = new com.kongzue.dialogx.interfaces.BaseDialog$8
            r0.<init>(r1)
            r2.addObserver(r0)
            return
    }

    public void bindFloatingActivity(com.kongzue.dialogx.util.DialogXFloatingWindowActivity r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.floatingWindowActivity = r0
            return
    }

    public abstract void callDialogDismiss();

    public void cleanActivityContext() {
            r1 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.ownActivity
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r0 = 0
            r1.dialogView = r0
            r1.ownActivity = r0
            return
    }

    public void cleanDialogList() {
            r1 = this;
            com.kongzue.dialogx.util.DialogListBuilder r0 = r1.dialogListBuilder
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r0 = 0
            r1.dialogListBuilder = r0
            return
    }

    public android.view.View createView(int r3) {
            r2 = this;
            boolean r0 = r2.isActivityImplMode()
            r1 = 0
            if (r0 == 0) goto L20
            android.app.Activity r0 = r2.getOwnActivity()
            if (r0 != 0) goto L13
            java.lang.String r3 = "DialogX 未初始化(E3)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            error(r3)
            return r1
        L13:
            android.app.Activity r0 = r2.getOwnActivity()
            android.view.LayoutInflater r0 = com.kongzue.dialogx.wrapper.ModuleUtil.getLayoutInflater(r0)
            android.view.View r3 = r0.inflate(r3, r1)
            return r3
        L20:
            android.content.Context r0 = getApplicationContext()
            android.view.LayoutInflater r0 = com.kongzue.dialogx.wrapper.ModuleUtil.getLayoutInflater(r0)
            android.view.View r3 = r0.inflate(r3, r1)
            return r3
    }

    public abstract java.lang.String dialogKey();

    public int dip2px(float r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.View r0 = r1.getDialogView()
            if (r0 != 0) goto L1f
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.ownActivity
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L1d
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.ownActivity
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r0.dispatchTouchEvent(r2)
            return r2
        L1d:
            r2 = 0
            return r2
        L1f:
            android.view.View r0 = r1.getDialogView()
            boolean r2 = r0.dispatchTouchEvent(r2)
            return r2
    }

    public java.util.List<android.view.View> findAllBlurView(android.view.View r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r4 instanceof com.kongzue.dialogx.interfaces.BlurViewType
            if (r1 == 0) goto Lc
            r0.add(r4)
        Lc:
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 == 0) goto L29
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r1 = 0
        L13:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L29
            android.view.View r2 = r4.getChildAt(r1)
            java.util.List r2 = r3.findAllBlurView(r2)
            if (r2 == 0) goto L26
            r0.addAll(r2)
        L26:
            int r1 = r1 + 1
            goto L13
        L29:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L30
            return r0
        L30:
            r4 = 0
            return r4
    }

    public int getColor(int r2) {
            r1 = this;
            android.content.Context r0 = getApplicationContext()
            if (r0 != 0) goto Le
            java.lang.String r2 = "DialogX 未初始化(E7)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            error(r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            return r2
        Le:
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getColor(r2)
            return r2
    }

    public java.lang.Integer getColorNullable(java.lang.Integer r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            goto L10
        L4:
            int r1 = r1.intValue()
            int r1 = r0.getColor(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L10:
            return r1
    }

    public java.lang.Integer getColorNullable(java.lang.Integer r1, java.lang.Integer r2) {
            r0 = this;
            if (r1 != 0) goto Lb
            int r1 = r2.intValue()
        L6:
            int r1 = r0.getColor(r1)
            goto L10
        Lb:
            int r1 = r1.intValue()
            goto L6
        L10:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    public int getCustomDialogLayoutResId(boolean r2) {
            r1 = this;
            int[] r0 = r1.customDialogLayoutResId
            r2 = r2 ^ 1
            r2 = r0[r2]
            return r2
    }

    public <T> T getData(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.data
            if (r0 != 0) goto L6
            r2 = 0
            goto La
        L6:
            java.lang.Object r2 = r0.get(r2)
        La:
            return r2
    }

    public com.kongzue.dialogx.DialogX.IMPL_MODE getDialogImplMode() {
            r1 = this;
            com.kongzue.dialogx.DialogX$IMPL_MODE r0 = r1.dialogImplMode
            return r0
    }

    @Yue.InterfaceC4544
    public com.kongzue.dialogx.util.DialogListBuilder getDialogListBuilder() {
            r1 = this;
            com.kongzue.dialogx.util.DialogListBuilder r0 = r1.dialogListBuilder
            return r0
    }

    public android.view.View getDialogView() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.dialogView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            return r0
    }

    public java.lang.Float getFloatStyleAttr(java.lang.Float r3) {
            r2 = this;
            float r0 = r3.floatValue()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto La
            r3 = 0
        La:
            return r3
    }

    public java.lang.Float getFloatStyleAttr(java.lang.Float r3, java.lang.Float r4) {
            r2 = this;
            float r0 = r3.floatValue()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto La
            return r4
        La:
            return r3
    }

    public int getHighestOrderIndex() {
            r1 = this;
            android.app.Activity r0 = r1.getOwnActivity()
            if (r0 == 0) goto L1d
            android.app.Activity r0 = r1.getOwnActivity()
            android.widget.FrameLayout r0 = getDecorView(r0)
            if (r0 == 0) goto L1d
            android.app.Activity r0 = r1.getOwnActivity()
            android.widget.FrameLayout r0 = getDecorView(r0)
            int r0 = r0.getChildCount()
            return r0
        L1d:
            java.util.List<com.kongzue.dialogx.interfaces.BaseDialog> r0 = com.kongzue.dialogx.interfaces.BaseDialog.runningDialogList
            if (r0 != 0) goto L23
            r0 = 1
            goto L27
        L23:
            int r0 = r0.size()
        L27:
            return r0
    }

    public java.lang.Integer getIntStyleAttr(java.lang.Integer r2) {
            r1 = this;
            int r0 = r2.intValue()
            if (r0 > 0) goto L7
            r2 = 0
        L7:
            return r2
    }

    public java.lang.Integer getIntStyleAttr(java.lang.Integer r2, java.lang.Integer r3) {
            r1 = this;
            int r0 = r2.intValue()
            if (r0 > 0) goto L7
            r2 = r3
        L7:
            return r2
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @Yue.InterfaceC4410
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.lifecycle
            return r0
    }

    public int getMaxHeight() {
            r1 = this;
            int r0 = r1.maxHeight
            if (r0 != 0) goto L6
            int r0 = com.kongzue.dialogx.DialogX.dialogMaxHeight
        L6:
            return r0
    }

    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.maxWidth
            if (r0 != 0) goto L6
            int r0 = com.kongzue.dialogx.DialogX.dialogMaxWidth
        L6:
            return r0
    }

    public int getMinHeight() {
            r1 = this;
            int r0 = r1.minHeight
            if (r0 != 0) goto L6
            int r0 = com.kongzue.dialogx.DialogX.dialogMinHeight
        L6:
            return r0
    }

    public int getMinWidth() {
            r1 = this;
            int r0 = r1.minWidth
            if (r0 != 0) goto L6
            int r0 = com.kongzue.dialogx.DialogX.dialogMinWidth
        L6:
            return r0
    }

    public android.app.Activity getOwnActivity() {
            r1 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.ownActivity
            if (r0 == 0) goto La
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L11
        La:
            android.app.Activity r0 = getTopActivity()
            r1.setOwnActivity(r0)
        L11:
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.ownActivity
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
    }

    public android.content.res.Resources getResources() {
            r1 = this;
            android.app.Activity r0 = r1.getOwnActivity()
            if (r0 == 0) goto L13
            android.app.Activity r0 = r1.getOwnActivity()
            android.content.Context r0 = com.kongzue.dialogx.wrapper.ModuleUtil.getContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            return r0
        L13:
            android.content.Context r0 = getApplicationContext()
            if (r0 != 0) goto L1e
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            return r0
        L1e:
            android.content.Context r0 = getApplicationContext()
            android.content.Context r0 = com.kongzue.dialogx.wrapper.ModuleUtil.getContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            return r0
    }

    @Yue.InterfaceC4544
    public android.widget.FrameLayout getRootFrameLayout() {
            r4 = this;
            android.app.Activity r0 = r4.getOwnActivity()
            boolean r1 = r4.isActivityImplMode()
            r2 = 0
            if (r1 == 0) goto L21
            if (r0 != 0) goto L1c
            android.app.Activity r0 = getTopActivity()
            if (r0 != 0) goto L19
            java.lang.String r0 = "DialogX 错误：在 getRootFrameLayout() 时无法获取绑定的 activity，请确认是否正确初始化：\nDialogX.init(context);\n\n或者使用 .show(activity) 启动对话框\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            error(r0)
            return r2
        L19:
            r4.setOwnActivity(r0)
        L1c:
            android.widget.FrameLayout r1 = getDecorView(r0)
            goto L2b
        L21:
            android.view.View r1 = r4.getDialogView()
            android.view.ViewParent r1 = r1.getParent()
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
        L2b:
            if (r1 != 0) goto L47
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "DialogX 错误：在 getRootFrameLayout() 时无法获 activity("
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = ") 的 decorView，请检查该 activity 是否正常显示且可以使 DialogX 基于其显示。\n若该 activity 不可用，可通过以下代码配置豁免 DialogX 对话框绑定至该 activity，例如：\nDialogX.unsupportedActivitiesPackageNames = new String[]{\n        \"com.bytedance.sdk.openadsdk.stub.activity\",\n        \"com.mobile.auth.gatewayauth\",\n        \"com.google.android.gms.ads\"\n};\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            error(r0)
            return r2
        L47:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r4.rootFrameLayout = r0
            java.lang.Object r0 = r0.get()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            return r0
    }

    public java.lang.String getString(int r2) {
            r1 = this;
            android.content.Context r0 = getApplicationContext()
            if (r0 != 0) goto Ld
            java.lang.String r2 = "DialogX 未初始化(E6)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            error(r2)
            r2 = 0
            return r2
        Ld:
            if (r2 != 0) goto L12
            java.lang.String r2 = ""
            return r2
        L12:
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    public com.kongzue.dialogx.interfaces.DialogXStyle getStyle() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r1.style
            return r0
    }

    public com.kongzue.dialogx.DialogX.THEME getTheme() {
            r1 = this;
            com.kongzue.dialogx.DialogX$THEME r0 = r1.theme
            return r0
    }

    public int getThisOrderIndex() {
            r1 = this;
            int r0 = r1.thisOrderIndex
            return r0
    }

    public void haptic(android.view.View r4) {
            r3 = this;
            if (r4 == 0) goto L18
            boolean r0 = com.kongzue.dialogx.DialogX.useHaptic
            r1 = 3
            if (r0 == 0) goto L10
            int r0 = r3.isHapticFeedbackEnabled
            r2 = -1
            if (r0 != r2) goto L10
            r4.performHapticFeedback(r1)
            goto L18
        L10:
            int r0 = r3.isHapticFeedbackEnabled
            r2 = 1
            if (r0 != r2) goto L18
            r4.performHapticFeedback(r1)
        L18:
            return
    }

    public void imeShow(android.widget.EditText r3, boolean r4) {
            r2 = this;
            android.app.Activity r0 = r2.getOwnActivity()
            if (r0 != 0) goto L7
            return
        L7:
            android.app.Activity r0 = r2.getOwnActivity()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r1 = 0
            if (r4 == 0) goto L1a
            r0.showSoftInput(r3, r1)
            goto L21
        L1a:
            android.os.IBinder r3 = r3.getWindowToken()
            r0.hideSoftInputFromWindow(r3, r1)
        L21:
            return
    }

    public abstract boolean isCancelable();

    public boolean isEnableImmersiveMode() {
            r1 = this;
            boolean r0 = r1.enableImmersiveMode
            return r0
    }

    public boolean isHide() {
            r1 = this;
            boolean r0 = r1.isHide
            return r0
    }

    public boolean isLightTheme() {
            r4 = this;
            com.kongzue.dialogx.DialogX$THEME r0 = r4.theme
            com.kongzue.dialogx.DialogX$THEME r1 = com.kongzue.dialogx.DialogX.THEME.AUTO
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L28
            android.content.Context r0 = getApplicationContext()
            if (r0 != 0) goto L16
            com.kongzue.dialogx.DialogX$THEME r0 = r4.theme
            com.kongzue.dialogx.DialogX$THEME r1 = com.kongzue.dialogx.DialogX.THEME.LIGHT
            if (r0 != r1) goto L15
            r2 = r3
        L15:
            return r2
        L16:
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 16
            if (r0 != r1) goto L27
            r2 = r3
        L27:
            return r2
        L28:
            com.kongzue.dialogx.DialogX$THEME r1 = com.kongzue.dialogx.DialogX.THEME.LIGHT
            if (r0 != r1) goto L2d
            r2 = r3
        L2d:
            return r2
    }

    public boolean isPreShow() {
            r1 = this;
            boolean r0 = r1.preShow
            return r0
    }

    public boolean isShow() {
            r1 = this;
            boolean r0 = r1.isShow
            return r0
    }

    public void onDialogDismiss() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXRunnable r0 = r1.onDismissRunnable
            if (r0 == 0) goto L7
            r0.run(r1)
        L7:
            return
    }

    public void onDialogInit() {
            r0 = this;
            return
    }

    public void onDialogRefreshUI() {
            r0 = this;
            return
    }

    public void onDialogShow() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXRunnable r0 = r1.onShowRunnable
            if (r0 == 0) goto L7
            r0.run(r1)
        L7:
            return
    }

    public boolean preDismiss(com.kongzue.dialogx.interfaces.BaseDialog r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean preShow(com.kongzue.dialogx.interfaces.BaseDialog r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void refreshUI() {
            r0 = this;
            return
    }

    public abstract void restartDialog();

    public boolean runAction(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.kongzue.dialogx.interfaces.DialogXRunnable r2 = (com.kongzue.dialogx.interfaces.DialogXRunnable) r2
            if (r2 == 0) goto L13
            r2.run(r1)
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    public com.kongzue.dialogx.interfaces.BaseDialog setData(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.data
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.data = r0
        Lb:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.data
            r0.put(r2, r3)
            return r1
    }

    public void setDialogListBuilder(@Yue.InterfaceC4410 com.kongzue.dialogx.util.DialogListBuilder r1) {
            r0 = this;
            r0.dialogListBuilder = r1
            return
    }

    public void setDialogView(android.view.View r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.dialogView = r0
            return
    }

    public com.kongzue.dialogx.interfaces.BaseDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            r0.enableImmersiveMode = r1
            r0.refreshUI()
            return r0
    }

    public void setLifecycleState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.lifecycle
            if (r0 == 0) goto La
            if (r2 != 0) goto L7
            goto La
        L7:
            r0.setCurrentState(r2)     // Catch: java.lang.Exception -> La
        La:
            return
    }

    public com.kongzue.dialogx.interfaces.BaseDialog setThisOrderIndex(int r1) {
            r0 = this;
            r0.thisOrderIndex = r1
            return r0
    }

    public abstract <D extends com.kongzue.dialogx.interfaces.BaseDialog> D show();

    public void showText(android.widget.TextView r2, java.lang.CharSequence r3) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            boolean r0 = isNull(r3)
            if (r0 == 0) goto L14
            r3 = 8
            r2.setVisibility(r3)
            java.lang.String r3 = ""
            r2.setText(r3)
            goto L1b
        L14:
            r0 = 0
            r2.setVisibility(r0)
            r2.setText(r3)
        L1b:
            return
    }

    public abstract void shutdown();

    public void tintColor(android.view.View r1, int r2) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r1.setBackgroundTintList(r2)
            return
    }
}
