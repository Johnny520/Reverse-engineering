package com.kongzue.dialogx.util.views;

/* JADX INFO: loaded from: classes2.dex */
public class DialogXBaseRelativeLayout extends android.widget.RelativeLayout {
    public static boolean debugMode;
    private boolean autoUnsafePlacePadding;
    int[] extraPadding;
    private com.kongzue.dialogx.util.views.FitSystemBarUtils fitSystemBarUtils;
    private boolean focusable;
    private boolean interceptBack;
    private boolean isInited;
    boolean isLightMode;
    float nowBkgAlphaValue;
    Yue.AbstractC4607 onBackPressedCallback;
    private com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.PrivateBackPressedListener onBackPressedListener;
    private com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack onLifecycleCallBack;
    private com.kongzue.dialogx.interfaces.OnSafeInsetsChangeListener onSafeInsetsChangeListener;
    private java.lang.ref.WeakReference<com.kongzue.dialogx.interfaces.BaseDialog> parentDialog;
    private java.lang.ref.WeakReference<android.view.View> requestFocusView;
    boolean touch;
    float touchDownX;
    float touchDownY;
    protected android.graphics.Rect unsafePlace;



    /* JADX INFO: renamed from: com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$kongzue$dialogx$util$views$FitSystemBarUtils$Orientation = null;

        static {
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation[] r0 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.AnonymousClass3.$SwitchMap$com$kongzue$dialogx$util$views$FitSystemBarUtils$Orientation = r0
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r1 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.Start     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.AnonymousClass3.$SwitchMap$com$kongzue$dialogx$util$views$FitSystemBarUtils$Orientation     // Catch: java.lang.NoSuchFieldError -> L1d
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r1 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.Top     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.AnonymousClass3.$SwitchMap$com$kongzue$dialogx$util$views$FitSystemBarUtils$Orientation     // Catch: java.lang.NoSuchFieldError -> L28
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r1 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.End     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.AnonymousClass3.$SwitchMap$com$kongzue$dialogx$util$views$FitSystemBarUtils$Orientation     // Catch: java.lang.NoSuchFieldError -> L33
                com.kongzue.dialogx.util.views.FitSystemBarUtils$Orientation r1 = com.kongzue.dialogx.util.views.FitSystemBarUtils.Orientation.Bottom     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public static abstract class OnLifecycleCallBack {
        public OnLifecycleCallBack() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void onDismiss();

        public void onShow() {
                r0 = this;
                return
        }
    }

    public interface PrivateBackPressedListener {
        boolean onBackPressed();
    }

    static {
            return
    }

    public DialogXBaseRelativeLayout(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 1
            r1.autoUnsafePlacePadding = r2
            r1.focusable = r2
            r1.interceptBack = r2
            r0 = 0
            r1.isInited = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.unsafePlace = r0
            r1.isLightMode = r2
            r2 = 4
            int[] r2 = new int[r2]
            r1.extraPadding = r2
            r2 = 0
            r1.init(r2)
            return
    }

    public DialogXBaseRelativeLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 1
            r1.autoUnsafePlacePadding = r2
            r1.focusable = r2
            r1.interceptBack = r2
            r0 = 0
            r1.isInited = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.unsafePlace = r0
            r1.isLightMode = r2
            r2 = 4
            int[] r2 = new int[r2]
            r1.extraPadding = r2
            r1.init(r3)
            return
    }

    public DialogXBaseRelativeLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.autoUnsafePlacePadding = r1
            r0.focusable = r1
            r0.interceptBack = r1
            r3 = 0
            r0.isInited = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r0.unsafePlace = r3
            r0.isLightMode = r1
            r1 = 4
            int[] r1 = new int[r1]
            r0.extraPadding = r1
            r0.init(r2)
            return
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.OnSafeInsetsChangeListener access$000(com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0) {
            com.kongzue.dialogx.interfaces.OnSafeInsetsChangeListener r0 = r0.onSafeInsetsChangeListener
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.PrivateBackPressedListener access$100(com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0) {
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout$PrivateBackPressedListener r0 = r0.onBackPressedListener
            return r0
    }

    public static /* synthetic */ java.lang.ref.WeakReference access$200(com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0) {
            java.lang.ref.WeakReference<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r0.parentDialog
            return r0
    }

    private void init(android.util.AttributeSet r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto La
            Yue.C1841.m8600(r4, r2)
        La:
            boolean r0 = r4.isInited
            if (r0 != 0) goto L74
            r0 = 1
            if (r5 == 0) goto L38
            android.content.Context r1 = r4.getContext()
            int[] r3 = com.kongzue.dialogx.R.styleable.DialogXBaseRelativeLayout
            android.content.res.TypedArray r5 = r1.obtainStyledAttributes(r5, r3)
            int r1 = com.kongzue.dialogx.R.styleable.DialogXBaseRelativeLayout_baseFocusable
            boolean r1 = r5.getBoolean(r1, r0)
            r4.focusable = r1
            int r1 = com.kongzue.dialogx.R.styleable.DialogXBaseRelativeLayout_autoSafeArea
            boolean r1 = r5.getBoolean(r1, r0)
            r4.autoUnsafePlacePadding = r1
            int r1 = com.kongzue.dialogx.R.styleable.DialogXBaseRelativeLayout_interceptBack
            boolean r1 = r5.getBoolean(r1, r0)
            r4.interceptBack = r1
            r5.recycle()
            r4.isInited = r0
        L38:
            boolean r5 = r4.focusable
            if (r5 == 0) goto L42
            r4.setFocusable(r0)
            r4.setFocusableInTouchMode(r0)
        L42:
            r5 = 0
            r4.setBkgAlpha(r5)
            com.kongzue.dialogx.interfaces.BaseDialog r5 = r4.getParentDialog()
            if (r5 == 0) goto L5b
            com.kongzue.dialogx.interfaces.BaseDialog r5 = r4.getParentDialog()
            com.kongzue.dialogx.DialogX$IMPL_MODE r5 = r5.getDialogImplMode()
            com.kongzue.dialogx.DialogX$IMPL_MODE r1 = com.kongzue.dialogx.DialogX.IMPL_MODE.VIEW
            if (r5 == r1) goto L5b
            r4.setFitsSystemWindows(r0)
        L5b:
            r4.setClipChildren(r2)
            r4.setClipToPadding(r2)
            r4.setDefaultFocusHighlightEnabled(r2)
            java.lang.String r5 = "KONGZUE DEBUG DIALOGX: create fitSystemBarUtils"
            r4.log(r5)
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout$1 r5 = new com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout$1
            r5.<init>(r4)
            com.kongzue.dialogx.util.views.FitSystemBarUtils r5 = com.kongzue.dialogx.util.views.FitSystemBarUtils.attachView(r4, r5)
            r4.fitSystemBarUtils = r5
        L74:
            return
    }

    private boolean isAlignBottomDialog(com.kongzue.dialogx.interfaces.BaseDialog r1) {
            r0 = this;
            com.kongzue.dialogx.interfaces.BaseDialog r1 = r0.getParentDialog()
            boolean r1 = r1 instanceof com.kongzue.dialogx.interfaces.DialogXBaseBottomDialog
            if (r1 != 0) goto L15
            java.lang.String r1 = "DialogXSafetyArea"
            android.view.View r1 = r0.findViewWithTag(r1)
            boolean r1 = r1 instanceof com.kongzue.dialogx.interfaces.DialogXSafetyModeInterface
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            goto L16
        L15:
            r1 = 1
        L16:
            return r1
    }

    private void setBackPressedDispatcher(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L1f
            Yue.ۥۣۡۡۥ r4 = Yue.C6917.m26782(r3)
            if (r4 != 0) goto L9
            return
        L9:
            androidx.activity.OnBackPressedDispatcher r4 = r4.getOnBackPressedDispatcher()
            android.content.Context r0 = r3.getContext()
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout$2 r1 = new com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout$2
            r2 = 1
            r1.<init>(r3, r2)
            r3.onBackPressedCallback = r1
            r4.m27753(r0, r1)
            goto L26
        L1f:
            Yue.ۥۣۡۡۢ r4 = r3.onBackPressedCallback
            if (r4 == 0) goto L26
            r4.remove()
        L26:
            return
    }

    public void bindFocusView(android.view.View r2) {
            r1 = this;
            if (r2 == r1) goto L9
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.requestFocusView = r0
        L9:
            return
    }

    @Override // android.view.View
    public boolean callOnClick() {
            r1 = this;
            boolean r0 = r1.isEnabled()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            boolean r0 = super.callOnClick()
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "#dispatchKeyEvent: KeyCode="
            r0.append(r1)
            int r1 = r3.getKeyCode()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.log(r0)
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L49
            int r0 = r3.getAction()
            r1 = 1
            if (r0 != r1) goto L49
            int r0 = r3.getKeyCode()
            r1 = 4
            if (r0 != r1) goto L49
            boolean r0 = r2.interceptBack
            if (r0 == 0) goto L49
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout$PrivateBackPressedListener r0 = r2.onBackPressedListener
            if (r0 == 0) goto L49
            java.lang.ref.WeakReference<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r2.parentDialog
            java.lang.Object r0 = r0.get()
            com.kongzue.dialogx.interfaces.BaseDialog r0 = (com.kongzue.dialogx.interfaces.BaseDialog) r0
            boolean r0 = r0.isHide()
            if (r0 != 0) goto L49
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout$PrivateBackPressedListener r3 = r2.onBackPressedListener
            boolean r3 = r3.onBackPressed()
            return r3
        L49:
            boolean r3 = super.dispatchKeyEvent(r3)
            return r3
    }

    public com.kongzue.dialogx.util.views.FitSystemBarUtils getFitSystemBarUtils() {
            r1 = this;
            com.kongzue.dialogx.util.views.FitSystemBarUtils r0 = r1.fitSystemBarUtils
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnSafeInsetsChangeListener getOnSafeInsetsChangeListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnSafeInsetsChangeListener r0 = r1.onSafeInsetsChangeListener
            return r0
    }

    public com.kongzue.dialogx.interfaces.BaseDialog getParentDialog() {
            r1 = this;
            java.lang.ref.WeakReference<com.kongzue.dialogx.interfaces.BaseDialog> r0 = r1.parentDialog
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            java.lang.Object r0 = r0.get()
            com.kongzue.dialogx.interfaces.BaseDialog r0 = (com.kongzue.dialogx.interfaces.BaseDialog) r0
        Lc:
            return r0
    }

    public int getRootPaddingBottom() {
            r2 = this;
            int[] r0 = r2.extraPadding
            r1 = 3
            r0 = r0[r1]
            return r0
    }

    public int getRootPaddingLeft() {
            r2 = this;
            int[] r0 = r2.extraPadding
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    public int getRootPaddingRight() {
            r2 = this;
            int[] r0 = r2.extraPadding
            r1 = 2
            r0 = r0[r1]
            return r0
    }

    public int getRootPaddingTop() {
            r2 = this;
            int[] r0 = r2.extraPadding
            r1 = 1
            r0 = r0[r1]
            return r0
    }

    public float getSafeHeight() {
            r3 = this;
            int r0 = r3.getMeasuredHeight()
            android.graphics.Rect r1 = r3.unsafePlace
            int r2 = r1.bottom
            int r0 = r0 - r2
            int r1 = r1.top
            int r0 = r0 - r1
            float r0 = (float) r0
            return r0
    }

    public android.graphics.Rect getUnsafePlace() {
            r1 = this;
            android.graphics.Rect r0 = r1.unsafePlace
            return r0
    }

    public int getUseAreaHeight() {
            r2 = this;
            int r0 = r2.getHeight()
            int r1 = r2.getRootPaddingBottom()
            int r0 = r0 - r1
            return r0
    }

    public int getUseAreaWidth() {
            r2 = this;
            int r0 = r2.getWidth()
            int r1 = r2.getRootPaddingRight()
            int r0 = r0 - r1
            return r0
    }

    public boolean isAutoUnsafePlacePadding() {
            r1 = this;
            boolean r0 = r1.autoUnsafePlacePadding
            return r0
    }

    public boolean isBaseFocusable() {
            r1 = this;
            boolean r0 = r1.focusable
            return r0
    }

    public boolean isInterceptBack() {
            r1 = this;
            boolean r0 = r1.interceptBack
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

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r3 = this;
            super.onAttachedToWindow()
            r0 = 1
            r3.setBackPressedDispatcher(r0)
            boolean r1 = r3.isInEditMode()
            if (r1 != 0) goto L41
            com.kongzue.dialogx.interfaces.BaseDialog r1 = r3.getParentDialog()
            if (r1 == 0) goto L41
            com.kongzue.dialogx.interfaces.BaseDialog r1 = r3.getParentDialog()
            android.app.Activity r1 = r1.getOwnActivity()
            if (r1 != 0) goto L1e
            goto L41
        L1e:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout$OnLifecycleCallBack r1 = r3.onLifecycleCallBack
            if (r1 == 0) goto L25
            r1.onShow()
        L25:
            android.content.res.Resources r1 = r3.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            r2 = 16
            if (r1 != r2) goto L36
            goto L37
        L36:
            r0 = 0
        L37:
            r3.isLightMode = r0
            boolean r0 = r3.focusable
            if (r0 == 0) goto L41
            r3.requestFocus()
        L41:
            return
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            int r2 = r2.uiMode
            r2 = r2 & 48
            r0 = 16
            if (r2 != r0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            boolean r0 = r1.isLightMode
            if (r0 == r2) goto L25
            com.kongzue.dialogx.DialogX$THEME r2 = com.kongzue.dialogx.DialogX.globalTheme
            com.kongzue.dialogx.DialogX$THEME r0 = com.kongzue.dialogx.DialogX.THEME.AUTO
            if (r2 != r0) goto L25
            com.kongzue.dialogx.interfaces.BaseDialog r2 = r1.getParentDialog()
            if (r2 == 0) goto L25
            com.kongzue.dialogx.interfaces.BaseDialog r2 = r1.getParentDialog()
            r2.restartDialog()
        L25:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout$OnLifecycleCallBack r0 = r1.onLifecycleCallBack
            if (r0 == 0) goto L7
            r0.onDismiss()
        L7:
            com.kongzue.dialogx.util.views.FitSystemBarUtils r0 = r1.fitSystemBarUtils
            if (r0 == 0) goto Le
            r0.recycle()
        Le:
            r0 = 0
            r1.setBackPressedDispatcher(r0)
            r0 = 0
            r1.fitSystemBarUtils = r0
            r1.onSafeInsetsChangeListener = r0
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L47
            if (r0 == r1) goto La
            goto L55
        La:
            boolean r0 = r3.touch
            if (r0 == 0) goto L55
            android.view.View r0 = r3.findFocus()
            if (r0 == r3) goto L55
            com.kongzue.dialogx.interfaces.BaseDialog r0 = r3.getParentDialog()
            if (r0 == 0) goto L55
            com.kongzue.dialogx.interfaces.BaseDialog r0 = r3.getParentDialog()
            r1 = 1084227584(0x40a00000, float:5.0)
            int r0 = r0.dip2px(r1)
            float r0 = (float) r0
            float r1 = r4.getX()
            float r2 = r3.touchDownX
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 > 0) goto L55
            float r1 = r4.getY()
            float r2 = r3.touchDownY
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L55
            r3.callOnClick()
            goto L55
        L47:
            r3.touch = r1
            float r0 = r4.getX()
            r3.touchDownX = r0
            float r0 = r4.getY()
            r3.touchDownY = r0
        L55:
            com.kongzue.dialogx.interfaces.BaseDialog r0 = r3.getParentDialog()
            boolean r0 = r0 instanceof com.kongzue.dialogx.interfaces.NoTouchInterface
            if (r0 == 0) goto L62
            boolean r4 = super.onTouchEvent(r4)
            return r4
        L62:
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            android.os.IBinder r1 = r3.getWindowToken()
            r2 = 2
            r0.hideSoftInputFromWindow(r1, r2)
            boolean r4 = super.onTouchEvent(r4)
            return r4
    }

    @Override // android.view.View
    public boolean performClick() {
            r1 = this;
            boolean r0 = r1.isEnabled()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            boolean r0 = super.performClick()
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int r2, android.graphics.Rect r3) {
            r1 = this;
            com.kongzue.dialogx.interfaces.BaseDialog r0 = r1.getParentDialog()
            if (r0 == 0) goto L10
            com.kongzue.dialogx.interfaces.BaseDialog r0 = r1.getParentDialog()
            boolean r0 = r0 instanceof com.kongzue.dialogx.interfaces.NoTouchInterface
            if (r0 == 0) goto L10
            r2 = 0
            return r2
        L10:
            r0 = 130(0x82, float:1.82E-43)
            if (r2 != r0) goto L33
            java.lang.ref.WeakReference<android.view.View> r0 = r1.requestFocusView
            if (r0 == 0) goto L33
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L33
            java.lang.ref.WeakReference<android.view.View> r0 = r1.requestFocusView
            java.lang.Object r0 = r0.get()
            if (r0 == r1) goto L33
            java.lang.ref.WeakReference<android.view.View> r2 = r1.requestFocusView
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            boolean r2 = r2.requestFocus()
            return r2
        L33:
            android.view.View r0 = r1.findFocus()
            if (r0 == 0) goto L40
            if (r0 == r1) goto L40
            r0.requestFocus()
            r2 = 1
            return r2
        L40:
            boolean r2 = super.requestFocus(r2, r3)
            return r2
    }

    public void requestFocusOnResume() {
            r1 = this;
            android.view.View r0 = r1.findFocus()
            if (r0 == 0) goto Lc
            if (r0 == r1) goto Lc
            r0.requestFocus()
            return
        Lc:
            r1.requestFocus()
            return
    }

    public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout setAutoUnsafePlacePadding(boolean r1) {
            r0 = this;
            r0.autoUnsafePlacePadding = r1
            return r0
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r3) {
            r2 = this;
            float r0 = r2.nowBkgAlphaValue
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r3.setAlpha(r0)
            super.setBackground(r3)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setBackground(r0)
            return
    }

    public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout setBkgAlpha(float r3) {
            r2 = this;
            r2.nowBkgAlphaValue = r3
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            if (r0 == 0) goto L17
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r1 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r1
            int r3 = (int) r3
            r0.setAlpha(r3)
        L17:
            return r2
    }

    public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout setInterceptBack(boolean r1) {
            r0 = this;
            r0.interceptBack = r1
            return r0
    }

    public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout setOnBackPressedListener(com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.PrivateBackPressedListener r1) {
            r0 = this;
            r0.onBackPressedListener = r1
            return r0
    }

    public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout setOnLifecycleCallBack(com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack r1) {
            r0 = this;
            r0.onLifecycleCallBack = r1
            return r0
    }

    public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout setOnSafeInsetsChangeListener(com.kongzue.dialogx.interfaces.OnSafeInsetsChangeListener r1) {
            r0 = this;
            r0.onSafeInsetsChangeListener = r1
            return r0
    }

    public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout setParentDialog(com.kongzue.dialogx.interfaces.BaseDialog r4) {
            r3 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.parentDialog = r0
            if (r4 == 0) goto L15
            com.kongzue.dialogx.DialogX$IMPL_MODE r4 = r4.getDialogImplMode()
            com.kongzue.dialogx.DialogX$IMPL_MODE r0 = com.kongzue.dialogx.DialogX.IMPL_MODE.VIEW
            if (r4 == r0) goto L15
            r4 = 1
            r3.setFitsSystemWindows(r4)
        L15:
            android.graphics.Rect r4 = r3.unsafePlace
            if (r4 == 0) goto L3f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "KONGZUE DEBUG DIALOGX: setParentDialog()="
            r4.append(r0)
            com.kongzue.dialogx.interfaces.BaseDialog r0 = r3.getParentDialog()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.log(r4)
            android.graphics.Rect r4 = r3.unsafePlace
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r4 = r4.bottom
            r3.setUnsafePadding(r0, r1, r2, r4)
            goto L44
        L3f:
            java.lang.String r4 = "KONGZUE DEBUG DIALOGX: setParentDialog() unsafePlace is null"
            r3.log(r4)
        L44:
            return r3
    }

    public void setRootPadding(int r3, int r4, int r5, int r6) {
            r2 = this;
            int[] r0 = r2.extraPadding
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            return
    }

    public void setUnsafePadding(@Yue.InterfaceC4992 int r12, @Yue.InterfaceC4992 int r13, @Yue.InterfaceC4992 int r14, @Yue.InterfaceC4992 int r15) {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "KONGZUE DEBUG DIALOGX: setUnsafePadding="
            r0.append(r1)
            com.kongzue.dialogx.interfaces.BaseDialog r1 = r11.getParentDialog()
            r0.append(r1)
            java.lang.String r1 = " t="
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = " b="
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r11.log(r0)
            boolean r0 = com.kongzue.dialogx.DialogX.ignoreUnsafeInsetsHorizontal
            r2 = 0
            if (r0 == 0) goto L34
            java.lang.String r12 = "  KONGZUE DEBUG DIALOGX: ignoreUnsafeInsetsHorizontal, start and end set 0"
            r11.log(r12)
            r12 = r2
            r14 = r12
        L34:
            com.kongzue.dialogx.interfaces.BaseDialog r0 = r11.getParentDialog()
            boolean r0 = r11.isAlignBottomDialog(r0)
            if (r0 == 0) goto Lf5
            java.lang.String r0 = "  KONGZUE DEBUG DIALOGX: Dialog is align bottom"
            r11.log(r0)
            java.lang.String r0 = "DialogXSafetyArea"
            android.view.View r0 = r11.findViewWithTag(r0)
            boolean r3 = r0 instanceof com.kongzue.dialogx.interfaces.DialogXSafetyModeInterface
            if (r3 == 0) goto Lc7
            r3 = r0
            com.kongzue.dialogx.interfaces.DialogXSafetyModeInterface r3 = (com.kongzue.dialogx.interfaces.DialogXSafetyModeInterface) r3
            int r3 = r3.getDialogXSafetyMode()
            r4 = r3 & 1
            r5 = 1
            if (r4 == 0) goto L5b
            r4 = r5
            goto L5c
        L5b:
            r4 = r2
        L5c:
            r6 = r3 & 2
            if (r6 == 0) goto L62
            r6 = r5
            goto L63
        L62:
            r6 = r2
        L63:
            r7 = r3 & 4
            if (r7 == 0) goto L69
            r7 = r5
            goto L6a
        L69:
            r7 = r2
        L6a:
            r3 = r3 & 8
            if (r3 == 0) goto L6f
            goto L70
        L6f:
            r5 = r2
        L70:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "    KONGZUE DEBUG DIALOGX: dialogXSafetyArea"
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = " hasLeft="
            r3.append(r8)
            r3.append(r6)
            java.lang.String r8 = "hasTop="
            r3.append(r8)
            r3.append(r4)
            java.lang.String r8 = " hasRight="
            r3.append(r8)
            r3.append(r5)
            java.lang.String r8 = " hasBottom="
            r3.append(r8)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r11.log(r3)
            if (r6 == 0) goto La8
            r3 = r12
            goto La9
        La8:
            r3 = r2
        La9:
            if (r4 == 0) goto Lad
            r8 = r13
            goto Lae
        Lad:
            r8 = r2
        Lae:
            if (r5 == 0) goto Lb2
            r9 = r14
            goto Lb3
        Lb2:
            r9 = r2
        Lb3:
            if (r7 == 0) goto Lb7
            r10 = r15
            goto Lb8
        Lb7:
            r10 = r2
        Lb8:
            r0.setPadding(r3, r8, r9, r10)
            if (r4 == 0) goto Lbe
            r13 = r2
        Lbe:
            if (r6 == 0) goto Lc1
            r12 = r2
        Lc1:
            if (r5 == 0) goto Lc4
            r14 = r2
        Lc4:
            if (r7 == 0) goto Lf5
            goto Lf4
        Lc7:
            int r0 = com.kongzue.dialogx.R.id.bkg
            android.view.View r0 = r11.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.kongzue.dialogx.interfaces.BaseDialog r3 = r11.getParentDialog()
            com.kongzue.dialogx.interfaces.DialogXBaseBottomDialog r3 = (com.kongzue.dialogx.interfaces.DialogXBaseBottomDialog) r3
            boolean r3 = r3.isBottomNonSafetyAreaBySelf()
            if (r3 != 0) goto Lf4
            if (r0 == 0) goto Lf4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "    KONGZUE DEBUG DIALOGX: bkgView.setPadding b="
            r3.append(r4)
            r3.append(r15)
            java.lang.String r3 = r3.toString()
            r11.log(r3)
            r0.setPadding(r2, r2, r2, r15)
        Lf4:
            r15 = r2
        Lf5:
            boolean r0 = r11.isAutoUnsafePlacePadding()
            if (r0 == 0) goto L118
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "  KONGZUE DEBUG DIALOGX: root.setPadding t="
            r0.append(r2)
            r0.append(r13)
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r11.log(r0)
            r11.setPadding(r12, r13, r14, r15)
        L118:
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            r0 = 8
            if (r3 != r0) goto L13
            float r0 = r2.getAlpha()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            r0 = 1008981770(0x3c23d70a, float:0.01)
            r2.setAlpha(r0)
        L13:
            super.setVisibility(r3)
            return
    }
}
