package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes.dex */
abstract class EndIconDelegate {
    final android.content.Context context;
    final com.google.android.material.internal.CheckableImageButton endIconView;
    final com.google.android.material.textfield.EndCompoundLayout endLayout;
    final com.google.android.material.textfield.TextInputLayout textInputLayout;

    public EndIconDelegate(@Yue.InterfaceC4410 com.google.android.material.textfield.EndCompoundLayout r2) {
            r1 = this;
            r1.<init>()
            com.google.android.material.textfield.TextInputLayout r0 = r2.textInputLayout
            r1.textInputLayout = r0
            r1.endLayout = r2
            android.content.Context r0 = r2.getContext()
            r1.context = r0
            com.google.android.material.internal.CheckableImageButton r2 = r2.getEndIconView()
            r1.endIconView = r2
            return
    }

    public void afterEditTextChanged(android.text.Editable r1) {
            r0 = this;
            return
    }

    public void beforeEditTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Yue.InterfaceC5971
    public int getIconContentDescriptionResId() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Yue.InterfaceC2004
    public int getIconDrawableResId() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.view.View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.view.View.OnClickListener getOnIconClickListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.view.View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    public Yue.C0109.InterfaceC0114 getTouchExplorationStateChangeListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isBoxBackgroundModeSupported(int r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public boolean isIconActivable() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isIconActivated() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isIconCheckable() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isIconChecked() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void onEditTextAttached(@Yue.InterfaceC4544 android.widget.EditText r1) {
            r0 = this;
            return
    }

    public void onInitializeAccessibilityNodeInfo(android.view.View r1, @Yue.InterfaceC4410 Yue.C0140 r2) {
            r0 = this;
            return
    }

    public void onPopulateAccessibilityEvent(android.view.View r1, @Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            return
    }

    public void onSuffixVisibilityChanged(boolean r1) {
            r0 = this;
            return
    }

    public final void refreshIconState() {
            r2 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r2.endLayout
            r1 = 0
            r0.refreshIconState(r1)
            return
    }

    public void setUp() {
            r0 = this;
            return
    }

    public boolean shouldTintIconOnError() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void tearDown() {
            r0 = this;
            return
    }
}
