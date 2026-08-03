package com.google.android.material.snackbar;

/* JADX INFO: loaded from: classes.dex */
public class Snackbar extends com.google.android.material.snackbar.BaseTransientBottomBar<com.google.android.material.snackbar.Snackbar> {
    private static final int[] SNACKBAR_BUTTON_STYLE_ATTR = null;
    private static final int[] SNACKBAR_CONTENT_STYLE_ATTRS = null;

    @Yue.InterfaceC4544
    private final android.view.accessibility.AccessibilityManager accessibilityManager;

    @Yue.InterfaceC4544
    private com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<com.google.android.material.snackbar.Snackbar> callback;
    private boolean hasAction;

    public static class Callback extends com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<com.google.android.material.snackbar.Snackbar> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        public Callback() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: onDismissed, reason: avoid collision after fix types in other method */
        public void onDismissed2(com.google.android.material.snackbar.Snackbar r1, int r2) {
                r0 = this;
                return
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public /* bridge */ /* synthetic */ void onDismissed(com.google.android.material.snackbar.Snackbar r1, int r2) {
                r0 = this;
                com.google.android.material.snackbar.Snackbar r1 = (com.google.android.material.snackbar.Snackbar) r1
                r0.onDismissed2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: onShown, reason: avoid collision after fix types in other method */
        public void onShown2(com.google.android.material.snackbar.Snackbar r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public /* bridge */ /* synthetic */ void onShown(com.google.android.material.snackbar.Snackbar r1) {
                r0 = this;
                com.google.android.material.snackbar.Snackbar r1 = (com.google.android.material.snackbar.Snackbar) r1
                r0.onShown2(r1)
                return
        }
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public static final class SnackbarLayout extends com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(android.content.Context r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public SnackbarLayout(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        public void onMeasure(int r6, int r7) {
                r5 = this;
                super.onMeasure(r6, r7)
                int r6 = r5.getChildCount()
                int r7 = r5.getMeasuredWidth()
                int r0 = r5.getPaddingLeft()
                int r7 = r7 - r0
                int r0 = r5.getPaddingRight()
                int r7 = r7 - r0
                r0 = 0
            L16:
                if (r0 >= r6) goto L39
                android.view.View r1 = r5.getChildAt(r0)
                android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
                int r2 = r2.width
                r3 = -1
                if (r2 != r3) goto L36
                r2 = 1073741824(0x40000000, float:2.0)
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r2)
                int r4 = r1.getMeasuredHeight()
                int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
                r1.measure(r3, r2)
            L36:
                int r0 = r0 + 1
                goto L16
            L39:
                return
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
                r0 = this;
                super.setBackground(r1)
                return
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
                r0 = this;
                super.setBackgroundDrawable(r1)
                return
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@Yue.InterfaceC4544 android.content.res.ColorStateList r1) {
                r0 = this;
                super.setBackgroundTintList(r1)
                return
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r1) {
                r0 = this;
                super.setBackgroundTintMode(r1)
                return
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                super.setLayoutParams(r1)
                return
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@Yue.InterfaceC4544 android.view.View.OnClickListener r1) {
                r0 = this;
                super.setOnClickListener(r1)
                return
        }
    }

    static {
            int r0 = com.google.android.material.R.attr.snackbarButtonStyle
            int[] r1 = new int[]{r0}
            com.google.android.material.snackbar.Snackbar.SNACKBAR_BUTTON_STYLE_ATTR = r1
            int r1 = com.google.android.material.R.attr.snackbarTextViewStyle
            int[] r0 = new int[]{r0, r1}
            com.google.android.material.snackbar.Snackbar.SNACKBAR_CONTENT_STYLE_ATTRS = r0
            return
    }

    private Snackbar(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.view.ViewGroup r2, @Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4410 com.google.android.material.snackbar.ContentViewCallback r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            android.content.Context r1 = r2.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r0.accessibilityManager = r1
            return
    }

    @Yue.InterfaceC4544
    private static android.view.ViewGroup findSuitableParent(android.view.View r3) {
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r3 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r2 == 0) goto L9
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
        L9:
            boolean r2 = r3 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L1c
            int r1 = r3.getId()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 != r2) goto L19
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
        L19:
            r1 = r3
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L1c:
            if (r3 == 0) goto L2a
            android.view.ViewParent r3 = r3.getParent()
            boolean r2 = r3 instanceof android.view.View
            if (r2 == 0) goto L29
            android.view.View r3 = (android.view.View) r3
            goto L2a
        L29:
            r3 = r0
        L2a:
            if (r3 != 0) goto L2
            return r1
    }

    private android.widget.Button getActionView() {
            r1 = this;
            com.google.android.material.snackbar.SnackbarContentLayout r0 = r1.getContentLayout()
            android.widget.Button r0 = r0.getActionView()
            return r0
    }

    private com.google.android.material.snackbar.SnackbarContentLayout getContentLayout() {
            r2 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            com.google.android.material.snackbar.SnackbarContentLayout r0 = (com.google.android.material.snackbar.SnackbarContentLayout) r0
            return r0
    }

    private android.widget.TextView getMessageView() {
            r1 = this;
            com.google.android.material.snackbar.SnackbarContentLayout r0 = r1.getContentLayout()
            android.widget.TextView r0 = r0.getMessageView()
            return r0
    }

    @java.lang.Deprecated
    public static boolean hasSnackbarButtonStyleAttr(@Yue.InterfaceC4410 android.content.Context r3) {
            int[] r0 = com.google.android.material.snackbar.Snackbar.SNACKBAR_BUTTON_STYLE_ATTR
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r0)
            r0 = 0
            r1 = -1
            int r2 = r3.getResourceId(r0, r1)
            r3.recycle()
            if (r2 == r1) goto L12
            r0 = 1
        L12:
            return r0
    }

    private static boolean hasSnackbarContentStyleAttrs(@Yue.InterfaceC4410 android.content.Context r5) {
            int[] r0 = com.google.android.material.snackbar.Snackbar.SNACKBAR_CONTENT_STYLE_ATTRS
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r0)
            r0 = 0
            r1 = -1
            int r2 = r5.getResourceId(r0, r1)
            r3 = 1
            int r4 = r5.getResourceId(r3, r1)
            r5.recycle()
            if (r2 == r1) goto L19
            if (r4 == r1) goto L19
            r0 = r3
        L19:
            return r0
    }

    private /* synthetic */ void lambda$setAction$0(android.view.View.OnClickListener r1, android.view.View r2) {
            r0 = this;
            r1.onClick(r2)
            r1 = 1
            r0.dispatchDismiss(r1)
            return
    }

    @Yue.InterfaceC4410
    public static com.google.android.material.snackbar.Snackbar make(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 java.lang.CharSequence r2, int r3) {
            com.google.android.material.snackbar.Snackbar r0 = makeInternal(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    public static com.google.android.material.snackbar.Snackbar make(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC5971 int r2, int r3) {
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            com.google.android.material.snackbar.Snackbar r1 = make(r1, r2, r3)
            return r1
    }

    @Yue.InterfaceC4410
    public static com.google.android.material.snackbar.Snackbar make(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 java.lang.CharSequence r2, int r3) {
            r0 = 0
            com.google.android.material.snackbar.Snackbar r1 = makeInternal(r0, r1, r2, r3)
            return r1
    }

    @Yue.InterfaceC4410
    private static com.google.android.material.snackbar.Snackbar makeInternal(@Yue.InterfaceC4544 android.content.Context r3, @Yue.InterfaceC4410 android.view.View r4, @Yue.InterfaceC4410 java.lang.CharSequence r5, int r6) {
            android.view.ViewGroup r4 = findSuitableParent(r4)
            if (r4 == 0) goto L2e
            if (r3 != 0) goto Lc
            android.content.Context r3 = r4.getContext()
        Lc:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r3)
            boolean r1 = hasSnackbarContentStyleAttrs(r3)
            if (r1 == 0) goto L19
            int r1 = com.google.android.material.R.layout.mtrl_layout_snackbar_include
            goto L1b
        L19:
            int r1 = com.google.android.material.R.layout.design_layout_snackbar_include
        L1b:
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r4, r2)
            com.google.android.material.snackbar.SnackbarContentLayout r0 = (com.google.android.material.snackbar.SnackbarContentLayout) r0
            com.google.android.material.snackbar.Snackbar r1 = new com.google.android.material.snackbar.Snackbar
            r1.<init>(r3, r4, r0, r0)
            r1.setText(r5)
            r1.setDuration(r6)
            return r1
        L2e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "No suitable parent found from the given view. Please provide a valid view."
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m30616(com.google.android.material.snackbar.Snackbar r0, android.view.View.OnClickListener r1, android.view.View r2) {
            r0.lambda$setAction$0(r1, r2)
            return
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void dismiss() {
            r0 = this;
            super.dismiss()
            return
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int getDuration() {
            r4 = this;
            int r0 = super.getDuration()
            r1 = -2
            if (r0 != r1) goto L8
            return r1
        L8:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L1e
            boolean r1 = r4.hasAction
            if (r1 == 0) goto L14
            r1 = 4
            goto L15
        L14:
            r1 = 0
        L15:
            android.view.accessibility.AccessibilityManager r2 = r4.accessibilityManager
            r1 = r1 | 3
            int r0 = Yue.C5816.m21663(r2, r0, r1)
            return r0
        L1e:
            boolean r2 = r4.hasAction
            if (r2 == 0) goto L2b
            android.view.accessibility.AccessibilityManager r2 = r4.accessibilityManager
            boolean r2 = r2.isTouchExplorationEnabled()
            if (r2 == 0) goto L2b
            r0 = r1
        L2b:
            return r0
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean isShown() {
            r1 = this;
            boolean r0 = super.isShown()
            return r0
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.snackbar.Snackbar setAction(@Yue.InterfaceC5971 int r2, android.view.View.OnClickListener r3) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            com.google.android.material.snackbar.Snackbar r2 = r1.setAction(r2, r3)
            return r2
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.snackbar.Snackbar setAction(@Yue.InterfaceC4544 java.lang.CharSequence r4, @Yue.InterfaceC4544 android.view.View.OnClickListener r5) {
            r3 = this;
            android.widget.Button r0 = r3.getActionView()
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            r2 = 0
            if (r1 != 0) goto L20
            if (r5 != 0) goto Le
            goto L20
        Le:
            r1 = 1
            r3.hasAction = r1
            r0.setVisibility(r2)
            r0.setText(r4)
            Yue.ۥۢ۟ۢۡ r4 = new Yue.ۥۢ۟ۢۡ
            r4.<init>(r3, r5)
            r0.setOnClickListener(r4)
            goto L2b
        L20:
            r4 = 8
            r0.setVisibility(r4)
            r4 = 0
            r0.setOnClickListener(r4)
            r3.hasAction = r2
        L2b:
            return r3
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.snackbar.Snackbar setActionTextColor(@Yue.InterfaceC1230 int r2) {
            r1 = this;
            android.widget.Button r0 = r1.getActionView()
            r0.setTextColor(r2)
            return r1
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.snackbar.Snackbar setActionTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.widget.Button r0 = r1.getActionView()
            r0.setTextColor(r2)
            return r1
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.snackbar.Snackbar setBackgroundTint(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            com.google.android.material.snackbar.Snackbar r1 = r0.setBackgroundTintList(r1)
            return r1
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.snackbar.Snackbar setBackgroundTintList(@Yue.InterfaceC4544 android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r1.view
            r0.setBackgroundTintList(r2)
            return r1
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.snackbar.Snackbar setBackgroundTintMode(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r1.view
            r0.setBackgroundTintMode(r2)
            return r1
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public com.google.android.material.snackbar.Snackbar setCallback(@Yue.InterfaceC4544 com.google.android.material.snackbar.Snackbar.Callback r2) {
            r1 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback<com.google.android.material.snackbar.Snackbar> r0 = r1.callback
            if (r0 == 0) goto L7
            r1.removeCallback(r0)
        L7:
            if (r2 == 0) goto Lc
            r1.addCallback(r2)
        Lc:
            r1.callback = r2
            return r1
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.snackbar.Snackbar setMaxInlineActionWidth(@Yue.InterfaceC1849 int r2) {
            r1 = this;
            com.google.android.material.snackbar.SnackbarContentLayout r0 = r1.getContentLayout()
            r0.setMaxInlineActionWidth(r2)
            return r1
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.snackbar.Snackbar setText(@Yue.InterfaceC5971 int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            com.google.android.material.snackbar.Snackbar r2 = r1.setText(r2)
            return r2
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.snackbar.Snackbar setText(@Yue.InterfaceC4410 java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.getMessageView()
            r0.setText(r2)
            return r1
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.snackbar.Snackbar setTextColor(@Yue.InterfaceC1230 int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.getMessageView()
            r0.setTextColor(r2)
            return r1
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.snackbar.Snackbar setTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.widget.TextView r0 = r1.getMessageView()
            r0.setTextColor(r2)
            return r1
    }

    @Yue.InterfaceC4410
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.snackbar.Snackbar setTextMaxLines(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.getMessageView()
            r0.setMaxLines(r2)
            return r1
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void show() {
            r0 = this;
            super.show()
            return
    }
}
