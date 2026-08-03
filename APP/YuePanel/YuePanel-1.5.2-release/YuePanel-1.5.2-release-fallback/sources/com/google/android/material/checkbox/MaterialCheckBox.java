package com.google.android.material.checkbox;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCheckBox extends Yue.C0439 {
    private static final int[][] CHECKBOX_STATES = null;
    private static final int DEF_STYLE_RES = 0;
    private static final int[] ERROR_STATE_SET = null;

    @android.annotation.SuppressLint({"DiscouragedApi"})
    private static final int FRAMEWORK_BUTTON_DRAWABLE_RES_ID = 0;
    private static final int[] INDETERMINATE_STATE_SET = null;
    public static final int STATE_CHECKED = 1;
    public static final int STATE_INDETERMINATE = 2;
    public static final int STATE_UNCHECKED = 0;
    private boolean broadcasting;

    @Yue.InterfaceC4544
    private android.graphics.drawable.Drawable buttonDrawable;

    @Yue.InterfaceC4544
    private android.graphics.drawable.Drawable buttonIconDrawable;

    @Yue.InterfaceC4544
    android.content.res.ColorStateList buttonIconTintList;

    @Yue.InterfaceC4410
    private android.graphics.PorterDuff.Mode buttonIconTintMode;

    @Yue.InterfaceC4544
    android.content.res.ColorStateList buttonTintList;
    private boolean centerIfNoTextEnabled;
    private int checkedState;
    private int[] currentStateChecked;

    @Yue.InterfaceC4544
    private java.lang.CharSequence customStateDescription;

    @Yue.InterfaceC4544
    private java.lang.CharSequence errorAccessibilityLabel;
    private boolean errorShown;

    @Yue.InterfaceC4544
    private android.content.res.ColorStateList materialThemeColorsTintList;

    @Yue.InterfaceC4544
    private android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener;

    @Yue.InterfaceC4410
    private final java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox.OnCheckedStateChangedListener> onCheckedStateChangedListeners;

    @Yue.InterfaceC4410
    private final java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox.OnErrorChangedListener> onErrorChangedListeners;

    @Yue.InterfaceC4544
    private final Yue.C0374 transitionToUnchecked;
    private final Yue.InterfaceC0354.AbstractC0355 transitionToUncheckedCallback;
    private boolean useMaterialThemeColors;
    private boolean usingMaterialButtonDrawable;


    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CheckedState {
    }

    public interface OnCheckedStateChangedListener {
        void onCheckedStateChangedListener(@Yue.InterfaceC4410 com.google.android.material.checkbox.MaterialCheckBox r1, int r2);
    }

    public interface OnErrorChangedListener {
        void onErrorChanged(@Yue.InterfaceC4410 com.google.android.material.checkbox.MaterialCheckBox r1, boolean r2);
    }

    public static class SavedState extends android.view.View.BaseSavedState {

        @Yue.InterfaceC4410
        public static final android.os.Parcelable.Creator<com.google.android.material.checkbox.MaterialCheckBox.SavedState> CREATOR = null;
        int checkedState;


        static {
                com.google.android.material.checkbox.MaterialCheckBox$SavedState$1 r0 = new com.google.android.material.checkbox.MaterialCheckBox$SavedState$1
                r0.<init>()
                com.google.android.material.checkbox.MaterialCheckBox.SavedState.CREATOR = r0
                return
        }

        private SavedState(android.os.Parcel r2) {
                r1 = this;
                r1.<init>(r2)
                java.lang.Class r0 = r1.getClass()
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.lang.Object r2 = r2.readValue(r0)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.checkedState = r2
                return
        }

        public /* synthetic */ SavedState(android.os.Parcel r1, com.google.android.material.checkbox.MaterialCheckBox.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Yue.InterfaceC4410
        private java.lang.String getCheckedStateString() {
                r2 = this;
                int r0 = r2.checkedState
                r1 = 1
                if (r0 == r1) goto Le
                r1 = 2
                if (r0 == r1) goto Lb
                java.lang.String r0 = "unchecked"
                return r0
            Lb:
                java.lang.String r0 = "indeterminate"
                return r0
            Le:
                java.lang.String r0 = "checked"
                return r0
        }

        @Yue.InterfaceC4410
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "MaterialCheckBox.SavedState{"
                r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " CheckedState="
                r0.append(r1)
                java.lang.String r1 = r2.getCheckedStateString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.checkedState
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.writeValue(r2)
                return
        }
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_CompoundButton_CheckBox
            com.google.android.material.checkbox.MaterialCheckBox.DEF_STYLE_RES = r0
            int r0 = com.google.android.material.R.attr.state_indeterminate
            int[] r0 = new int[]{r0}
            com.google.android.material.checkbox.MaterialCheckBox.INDETERMINATE_STATE_SET = r0
            int r0 = com.google.android.material.R.attr.state_error
            int[] r1 = new int[]{r0}
            com.google.android.material.checkbox.MaterialCheckBox.ERROR_STATE_SET = r1
            r1 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r1, r0}
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r3 = new int[]{r1, r2}
            r4 = -16842912(0xfffffffffefeff60, float:-1.6947495E38)
            int[] r1 = new int[]{r1, r4}
            r5 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r2 = new int[]{r5, r2}
            int[] r4 = new int[]{r5, r4}
            int[][] r0 = new int[][]{r0, r3, r1, r2, r4}
            com.google.android.material.checkbox.MaterialCheckBox.CHECKBOX_STATES = r0
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            java.lang.String r1 = "drawable"
            java.lang.String r2 = "android"
            java.lang.String r3 = "btn_check_material_anim"
            int r0 = r0.getIdentifier(r3, r1, r2)
            com.google.android.material.checkbox.MaterialCheckBox.FRAMEWORK_BUTTON_DRAWABLE_RES_ID = r0
            return
    }

    public MaterialCheckBox(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialCheckBox(android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.checkboxStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialCheckBox(android.content.Context r9, @Yue.InterfaceC4544 android.util.AttributeSet r10, int r11) {
            r8 = this;
            int r4 = com.google.android.material.checkbox.MaterialCheckBox.DEF_STYLE_RES
            android.content.Context r9 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.onErrorChangedListeners = r9
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.onCheckedStateChangedListeners = r9
            android.content.Context r9 = r8.getContext()
            int r0 = com.google.android.material.R.drawable.mtrl_checkbox_button_checked_unchecked
            Yue.ۥ۟۠ۦۦ r9 = Yue.C0374.m1483(r9, r0)
            r8.transitionToUnchecked = r9
            com.google.android.material.checkbox.MaterialCheckBox$1 r9 = new com.google.android.material.checkbox.MaterialCheckBox$1
            r9.<init>(r8)
            r8.transitionToUncheckedCallback = r9
            android.content.Context r9 = r8.getContext()
            android.graphics.drawable.Drawable r0 = Yue.C1435.m7078(r8)
            r8.buttonDrawable = r0
            android.content.res.ColorStateList r0 = r8.getSuperButtonTintList()
            r8.buttonTintList = r0
            r6 = 0
            r8.setSupportButtonTintList(r6)
            int[] r2 = com.google.android.material.R.styleable.MaterialCheckBox
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r10
            r3 = r11
            Yue.ۥۢۡۥۦ r10 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r11 = com.google.android.material.R.styleable.MaterialCheckBox_buttonIcon
            android.graphics.drawable.Drawable r11 = r10.m23347(r11)
            r8.buttonIconDrawable = r11
            android.graphics.drawable.Drawable r11 = r8.buttonDrawable
            r0 = 1
            if (r11 == 0) goto L7c
            boolean r11 = com.google.android.material.internal.ThemeEnforcement.isMaterial3Theme(r9)
            if (r11 == 0) goto L7c
            boolean r11 = r8.isButtonDrawableLegacy(r10)
            if (r11 == 0) goto L7c
            super.setButtonDrawable(r6)
            int r11 = com.google.android.material.R.drawable.mtrl_checkbox_button
            android.graphics.drawable.Drawable r11 = Yue.C0479.m1737(r9, r11)
            r8.buttonDrawable = r11
            r8.usingMaterialButtonDrawable = r0
            android.graphics.drawable.Drawable r11 = r8.buttonIconDrawable
            if (r11 != 0) goto L7c
            int r11 = com.google.android.material.R.drawable.mtrl_checkbox_button_icon
            android.graphics.drawable.Drawable r11 = Yue.C0479.m1737(r9, r11)
            r8.buttonIconDrawable = r11
        L7c:
            int r11 = com.google.android.material.R.styleable.MaterialCheckBox_buttonIconTint
            android.content.res.ColorStateList r9 = com.google.android.material.resources.MaterialResources.getColorStateList(r9, r10, r11)
            r8.buttonIconTintList = r9
            int r9 = com.google.android.material.R.styleable.MaterialCheckBox_buttonIconTintMode
            r11 = -1
            int r9 = r10.m23354(r9, r11)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.ViewUtils.parseTintMode(r9, r11)
            r8.buttonIconTintMode = r9
            int r9 = com.google.android.material.R.styleable.MaterialCheckBox_useMaterialThemeColors
            boolean r9 = r10.m23340(r9, r7)
            r8.useMaterialThemeColors = r9
            int r9 = com.google.android.material.R.styleable.MaterialCheckBox_centerIfNoTextEnabled
            boolean r9 = r10.m23340(r9, r0)
            r8.centerIfNoTextEnabled = r9
            int r9 = com.google.android.material.R.styleable.MaterialCheckBox_errorShown
            boolean r9 = r10.m23340(r9, r7)
            r8.errorShown = r9
            int r9 = com.google.android.material.R.styleable.MaterialCheckBox_errorAccessibilityLabel
            java.lang.CharSequence r9 = r10.m23363(r9)
            r8.errorAccessibilityLabel = r9
            int r9 = com.google.android.material.R.styleable.MaterialCheckBox_checkedState
            boolean r9 = r10.m23368(r9)
            if (r9 == 0) goto Lc4
            int r9 = com.google.android.material.R.styleable.MaterialCheckBox_checkedState
            int r9 = r10.m23354(r9, r7)
            r8.setCheckedState(r9)
        Lc4:
            r10.m23371()
            r8.refreshButtonDrawable()
            return
    }

    public static /* synthetic */ int[] access$000(com.google.android.material.checkbox.MaterialCheckBox r0) {
            int[] r0 = r0.currentStateChecked
            return r0
    }

    @Yue.InterfaceC4410
    private java.lang.String getButtonStateDescription() {
            r2 = this;
            int r0 = r2.checkedState
            r1 = 1
            if (r0 != r1) goto L10
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.R.string.mtrl_checkbox_state_description_checked
            java.lang.String r0 = r0.getString(r1)
            return r0
        L10:
            if (r0 != 0) goto L1d
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.R.string.mtrl_checkbox_state_description_unchecked
            java.lang.String r0 = r0.getString(r1)
            return r0
        L1d:
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.R.string.mtrl_checkbox_state_description_indeterminate
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
            r8 = this;
            android.content.res.ColorStateList r0 = r8.materialThemeColorsTintList
            if (r0 != 0) goto L53
            int[][] r0 = com.google.android.material.checkbox.MaterialCheckBox.CHECKBOX_STATES
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r2 = com.google.android.material.R.attr.colorControlActivated
            int r2 = com.google.android.material.color.MaterialColors.getColor(r8, r2)
            int r3 = com.google.android.material.R.attr.colorError
            int r3 = com.google.android.material.color.MaterialColors.getColor(r8, r3)
            int r4 = com.google.android.material.R.attr.colorSurface
            int r4 = com.google.android.material.color.MaterialColors.getColor(r8, r4)
            int r5 = com.google.android.material.R.attr.colorOnSurface
            int r5 = com.google.android.material.color.MaterialColors.getColor(r8, r5)
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            int r3 = com.google.android.material.color.MaterialColors.layer(r4, r3, r7)
            r1[r6] = r3
            r3 = 1
            int r2 = com.google.android.material.color.MaterialColors.layer(r4, r2, r7)
            r1[r3] = r2
            r2 = 1057635697(0x3f0a3d71, float:0.54)
            int r2 = com.google.android.material.color.MaterialColors.layer(r4, r5, r2)
            r3 = 2
            r1[r3] = r2
            r2 = 3
            r3 = 1052938076(0x3ec28f5c, float:0.38)
            int r6 = com.google.android.material.color.MaterialColors.layer(r4, r5, r3)
            r1[r2] = r6
            r2 = 4
            int r3 = com.google.android.material.color.MaterialColors.layer(r4, r5, r3)
            r1[r2] = r3
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r0, r1)
            r8.materialThemeColorsTintList = r2
        L53:
            android.content.res.ColorStateList r0 = r8.materialThemeColorsTintList
            return r0
    }

    @Yue.InterfaceC4544
    private android.content.res.ColorStateList getSuperButtonTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.buttonTintList
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.res.ColorStateList r0 = super.getButtonTintList()
            if (r0 == 0) goto L10
            android.content.res.ColorStateList r0 = super.getButtonTintList()
            return r0
        L10:
            android.content.res.ColorStateList r0 = r1.getSupportButtonTintList()
            return r0
    }

    private boolean isButtonDrawableLegacy(Yue.C6264 r4) {
            r3 = this;
            int r0 = com.google.android.material.R.styleable.MaterialCheckBox_android_button
            r1 = 0
            int r0 = r4.m23360(r0, r1)
            int r2 = com.google.android.material.R.styleable.MaterialCheckBox_buttonCompat
            int r4 = r4.m23360(r2, r1)
            int r2 = com.google.android.material.checkbox.MaterialCheckBox.FRAMEWORK_BUTTON_DRAWABLE_RES_ID
            if (r0 != r2) goto L14
            if (r4 != 0) goto L14
            r1 = 1
        L14:
            return r1
    }

    private /* synthetic */ void lambda$new$0() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.buttonIconDrawable
            r0.jumpToCurrentState()
            return
    }

    private void refreshButtonDrawable() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.buttonDrawable
            android.content.res.ColorStateList r1 = r3.buttonTintList
            android.graphics.PorterDuff$Mode r2 = Yue.C1435.m7080(r3)
            android.graphics.drawable.Drawable r0 = com.google.android.material.drawable.DrawableUtils.createTintableMutatedDrawableIfNeeded(r0, r1, r2)
            r3.buttonDrawable = r0
            android.graphics.drawable.Drawable r0 = r3.buttonIconDrawable
            android.content.res.ColorStateList r1 = r3.buttonIconTintList
            android.graphics.PorterDuff$Mode r2 = r3.buttonIconTintMode
            android.graphics.drawable.Drawable r0 = com.google.android.material.drawable.DrawableUtils.createTintableMutatedDrawableIfNeeded(r0, r1, r2)
            r3.buttonIconDrawable = r0
            r3.setUpDefaultButtonDrawableAnimationIfNeeded()
            r3.updateButtonTints()
            android.graphics.drawable.Drawable r0 = r3.buttonDrawable
            android.graphics.drawable.Drawable r1 = r3.buttonIconDrawable
            android.graphics.drawable.Drawable r0 = com.google.android.material.drawable.DrawableUtils.compositeTwoLayeredDrawable(r0, r1)
            super.setButtonDrawable(r0)
            r3.refreshDrawableState()
            return
    }

    private void setDefaultStateDescription() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            java.lang.CharSequence r0 = r2.customStateDescription
            if (r0 != 0) goto L11
            java.lang.String r0 = r2.getButtonStateDescription()
            super.setStateDescription(r0)
        L11:
            return
    }

    private void setUpDefaultButtonDrawableAnimationIfNeeded() {
            r5 = this;
            boolean r0 = r5.usingMaterialButtonDrawable
            if (r0 != 0) goto L5
            return
        L5:
            Yue.ۥ۟۠ۦۦ r0 = r5.transitionToUnchecked
            if (r0 == 0) goto L15
            Yue.ۥ۟۠ۥۧ$ۥ r1 = r5.transitionToUncheckedCallback
            r0.unregisterAnimationCallback(r1)
            Yue.ۥ۟۠ۦۦ r0 = r5.transitionToUnchecked
            Yue.ۥ۟۠ۥۧ$ۥ r1 = r5.transitionToUncheckedCallback
            r0.registerAnimationCallback(r1)
        L15:
            android.graphics.drawable.Drawable r0 = r5.buttonDrawable
            boolean r1 = r0 instanceof android.graphics.drawable.AnimatedStateListDrawable
            if (r1 == 0) goto L36
            Yue.ۥ۟۠ۦۦ r1 = r5.transitionToUnchecked
            if (r1 == 0) goto L36
            android.graphics.drawable.AnimatedStateListDrawable r0 = (android.graphics.drawable.AnimatedStateListDrawable) r0
            int r2 = com.google.android.material.R.id.checked
            int r3 = com.google.android.material.R.id.unchecked
            r4 = 0
            r0.addTransition(r2, r3, r1, r4)
            android.graphics.drawable.Drawable r0 = r5.buttonDrawable
            android.graphics.drawable.AnimatedStateListDrawable r0 = (android.graphics.drawable.AnimatedStateListDrawable) r0
            int r1 = com.google.android.material.R.id.indeterminate
            int r2 = com.google.android.material.R.id.unchecked
            Yue.ۥ۟۠ۦۦ r3 = r5.transitionToUnchecked
            r0.addTransition(r1, r2, r3, r4)
        L36:
            return
    }

    private void updateButtonTints() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.buttonDrawable
            if (r0 == 0) goto Lb
            android.content.res.ColorStateList r1 = r2.buttonTintList
            if (r1 == 0) goto Lb
            Yue.C1995.m9232(r0, r1)
        Lb:
            android.graphics.drawable.Drawable r0 = r2.buttonIconDrawable
            if (r0 == 0) goto L16
            android.content.res.ColorStateList r1 = r2.buttonIconTintList
            if (r1 == 0) goto L16
            Yue.C1995.m9232(r0, r1)
        L16:
            return
    }

    private void updateIconTintIfNeeded() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m30409(com.google.android.material.checkbox.MaterialCheckBox r0) {
            r0.lambda$new$0()
            return
    }

    public void addOnCheckedStateChangedListener(@Yue.InterfaceC4410 com.google.android.material.checkbox.MaterialCheckBox.OnCheckedStateChangedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox$OnCheckedStateChangedListener> r0 = r1.onCheckedStateChangedListeners
            r0.add(r2)
            return
    }

    public void addOnErrorChangedListener(@Yue.InterfaceC4410 com.google.android.material.checkbox.MaterialCheckBox.OnErrorChangedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox$OnErrorChangedListener> r0 = r1.onErrorChangedListeners
            r0.add(r2)
            return
    }

    public void clearOnCheckedStateChangedListeners() {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox$OnCheckedStateChangedListener> r0 = r1.onCheckedStateChangedListeners
            r0.clear()
            return
    }

    public void clearOnErrorChangedListeners() {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox$OnErrorChangedListener> r0 = r1.onErrorChangedListeners
            r0.clear()
            return
    }

    @Override // android.widget.CompoundButton
    @Yue.InterfaceC4544
    public android.graphics.drawable.Drawable getButtonDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.buttonDrawable
            return r0
    }

    @Yue.InterfaceC4544
    public android.graphics.drawable.Drawable getButtonIconDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.buttonIconDrawable
            return r0
    }

    @Yue.InterfaceC4544
    public android.content.res.ColorStateList getButtonIconTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.buttonIconTintList
            return r0
    }

    @Yue.InterfaceC4410
    public android.graphics.PorterDuff.Mode getButtonIconTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.buttonIconTintMode
            return r0
    }

    @Override // android.widget.CompoundButton
    @Yue.InterfaceC4544
    public android.content.res.ColorStateList getButtonTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.buttonTintList
            return r0
    }

    public int getCheckedState() {
            r1 = this;
            int r0 = r1.checkedState
            return r0
    }

    @Yue.InterfaceC4544
    public java.lang.CharSequence getErrorAccessibilityLabel() {
            r1 = this;
            java.lang.CharSequence r0 = r1.errorAccessibilityLabel
            return r0
    }

    public boolean isCenterIfNoTextEnabled() {
            r1 = this;
            boolean r0 = r1.centerIfNoTextEnabled
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
            r2 = this;
            int r0 = r2.checkedState
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public boolean isErrorShown() {
            r1 = this;
            boolean r0 = r1.errorShown
            return r0
    }

    public boolean isUseMaterialThemeColors() {
            r1 = this;
            boolean r0 = r1.useMaterialThemeColors
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.useMaterialThemeColors
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = r1.buttonTintList
            if (r0 != 0) goto L13
            android.content.res.ColorStateList r0 = r1.buttonIconTintList
            if (r0 != 0) goto L13
            r0 = 1
            r1.setUseMaterialThemeColors(r0)
        L13:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int r3) {
            r2 = this;
            r0 = 2
            int r3 = r3 + r0
            int[] r3 = super.onCreateDrawableState(r3)
            int r1 = r2.getCheckedState()
            if (r1 != r0) goto L11
            int[] r0 = com.google.android.material.checkbox.MaterialCheckBox.INDETERMINATE_STATE_SET
            android.view.View.mergeDrawableStates(r3, r0)
        L11:
            boolean r0 = r2.isErrorShown()
            if (r0 == 0) goto L1c
            int[] r0 = com.google.android.material.checkbox.MaterialCheckBox.ERROR_STATE_SET
            android.view.View.mergeDrawableStates(r3, r0)
        L1c:
            int[] r0 = com.google.android.material.drawable.DrawableUtils.getCheckedState(r3)
            r2.currentStateChecked = r0
            r2.updateIconTintIfNeeded()
            return r3
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas r6) {
            r5 = this;
            boolean r0 = r5.centerIfNoTextEnabled
            if (r0 == 0) goto L54
            java.lang.CharSequence r0 = r5.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L54
            android.graphics.drawable.Drawable r0 = Yue.C1435.m7078(r5)
            if (r0 == 0) goto L54
            boolean r1 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r5)
            if (r1 == 0) goto L1c
            r1 = -1
            goto L1d
        L1c:
            r1 = 1
        L1d:
            int r2 = r5.getWidth()
            int r3 = r0.getIntrinsicWidth()
            int r2 = r2 - r3
            int r2 = r2 / 2
            int r2 = r2 * r1
            int r1 = r6.save()
            float r3 = (float) r2
            r4 = 0
            r6.translate(r3, r4)
            super.onDraw(r6)
            r6.restoreToCount(r1)
            android.graphics.drawable.Drawable r6 = r5.getBackground()
            if (r6 == 0) goto L53
            android.graphics.Rect r6 = r0.getBounds()
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            int r1 = r6.left
            int r1 = r1 + r2
            int r3 = r6.top
            int r4 = r6.right
            int r4 = r4 + r2
            int r6 = r6.bottom
            Yue.C1995.m9229(r0, r1, r3, r4, r6)
        L53:
            return
        L54:
            super.onDraw(r6)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@Yue.InterfaceC4544 android.view.accessibility.AccessibilityNodeInfo r3) {
            r2 = this;
            super.onInitializeAccessibilityNodeInfo(r3)
            if (r3 != 0) goto L6
            return
        L6:
            boolean r0 = r2.isErrorShown()
            if (r0 == 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.CharSequence r1 = r3.getText()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.CharSequence r1 = r2.errorAccessibilityLabel
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setText(r0)
        L29:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@Yue.InterfaceC4544 android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.checkbox.MaterialCheckBox.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.checkbox.MaterialCheckBox$SavedState r2 = (com.google.android.material.checkbox.MaterialCheckBox.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            int r2 = r2.checkedState
            r1.setCheckedState(r2)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @Yue.InterfaceC4544
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.checkbox.MaterialCheckBox$SavedState r1 = new com.google.android.material.checkbox.MaterialCheckBox$SavedState
            r1.<init>(r0)
            int r0 = r2.getCheckedState()
            r1.checkedState = r0
            return r1
    }

    public void removeOnCheckedStateChangedListener(@Yue.InterfaceC4410 com.google.android.material.checkbox.MaterialCheckBox.OnCheckedStateChangedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox$OnCheckedStateChangedListener> r0 = r1.onCheckedStateChangedListeners
            r0.remove(r2)
            return
    }

    public void removeOnErrorChangedListener(@Yue.InterfaceC4410 com.google.android.material.checkbox.MaterialCheckBox.OnErrorChangedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox$OnErrorChangedListener> r0 = r1.onErrorChangedListeners
            r0.remove(r2)
            return
    }

    @Override // Yue.C0439, android.widget.CompoundButton
    public void setButtonDrawable(@Yue.InterfaceC2004 int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = Yue.C0479.m1737(r0, r2)
            r1.setButtonDrawable(r2)
            return
    }

    @Override // Yue.C0439, android.widget.CompoundButton
    public void setButtonDrawable(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.buttonDrawable = r1
            r1 = 0
            r0.usingMaterialButtonDrawable = r1
            r0.refreshButtonDrawable()
            return
    }

    public void setButtonIconDrawable(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.buttonIconDrawable = r1
            r0.refreshButtonDrawable()
            return
    }

    public void setButtonIconDrawableResource(@Yue.InterfaceC2004 int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = Yue.C0479.m1737(r0, r2)
            r1.setButtonIconDrawable(r2)
            return
    }

    public void setButtonIconTintList(@Yue.InterfaceC4544 android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.buttonIconTintList
            if (r0 != r2) goto L5
            return
        L5:
            r1.buttonIconTintList = r2
            r1.refreshButtonDrawable()
            return
    }

    public void setButtonIconTintMode(@Yue.InterfaceC4410 android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.buttonIconTintMode
            if (r0 != r2) goto L5
            return
        L5:
            r1.buttonIconTintMode = r2
            r1.refreshButtonDrawable()
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Yue.InterfaceC4544 android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.buttonTintList
            if (r0 != r2) goto L5
            return
        L5:
            r1.buttonTintList = r2
            r1.refreshButtonDrawable()
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.setSupportButtonTintMode(r1)
            r0.refreshButtonDrawable()
            return
    }

    public void setCenterIfNoTextEnabled(boolean r1) {
            r0 = this;
            r0.centerIfNoTextEnabled = r1
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r1) {
            r0 = this;
            r0.setCheckedState(r1)
            return
    }

    public void setCheckedState(int r4) {
            r3 = this;
            int r0 = r3.checkedState
            if (r0 == r4) goto L5a
            r3.checkedState = r4
            r0 = 0
            r1 = 1
            if (r4 != r1) goto Lc
            r4 = r1
            goto Ld
        Lc:
            r4 = r0
        Ld:
            super.setChecked(r4)
            r3.refreshDrawableState()
            r3.setDefaultStateDescription()
            boolean r4 = r3.broadcasting
            if (r4 == 0) goto L1b
            return
        L1b:
            r3.broadcasting = r1
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox$OnCheckedStateChangedListener> r4 = r3.onCheckedStateChangedListeners
            if (r4 == 0) goto L37
            java.util.Iterator r4 = r4.iterator()
        L25:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r4.next()
            com.google.android.material.checkbox.MaterialCheckBox$OnCheckedStateChangedListener r1 = (com.google.android.material.checkbox.MaterialCheckBox.OnCheckedStateChangedListener) r1
            int r2 = r3.checkedState
            r1.onCheckedStateChangedListener(r3, r2)
            goto L25
        L37:
            int r4 = r3.checkedState
            r1 = 2
            if (r4 == r1) goto L47
            android.widget.CompoundButton$OnCheckedChangeListener r4 = r3.onCheckedChangeListener
            if (r4 == 0) goto L47
            boolean r1 = r3.isChecked()
            r4.onCheckedChanged(r3, r1)
        L47:
            android.content.Context r4 = r3.getContext()
            java.lang.Class<android.view.autofill.AutofillManager> r1 = android.view.autofill.AutofillManager.class
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.autofill.AutofillManager r4 = (android.view.autofill.AutofillManager) r4
            if (r4 == 0) goto L58
            r4.notifyValueChanged(r3)
        L58:
            r3.broadcasting = r0
        L5a:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean r1) {
            r0 = this;
            super.setEnabled(r1)
            r0.updateIconTintIfNeeded()
            return
    }

    public void setErrorAccessibilityLabel(@Yue.InterfaceC4544 java.lang.CharSequence r1) {
            r0 = this;
            r0.errorAccessibilityLabel = r1
            return
    }

    public void setErrorAccessibilityLabelResource(@Yue.InterfaceC5971 int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setErrorAccessibilityLabel(r2)
            return
    }

    public void setErrorShown(boolean r3) {
            r2 = this;
            boolean r0 = r2.errorShown
            if (r0 != r3) goto L5
            return
        L5:
            r2.errorShown = r3
            r2.refreshDrawableState()
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox$OnErrorChangedListener> r3 = r2.onErrorChangedListeners
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            com.google.android.material.checkbox.MaterialCheckBox$OnErrorChangedListener r0 = (com.google.android.material.checkbox.MaterialCheckBox.OnErrorChangedListener) r0
            boolean r1 = r2.errorShown
            r0.onErrorChanged(r2, r1)
            goto L10
        L22:
            return
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Yue.InterfaceC4544 android.widget.CompoundButton.OnCheckedChangeListener r1) {
            r0 = this;
            r0.onCheckedChangeListener = r1
            return
    }

    @Override // android.widget.CompoundButton, android.view.View
    @Yue.InterfaceC5336(30)
    public void setStateDescription(@Yue.InterfaceC4544 java.lang.CharSequence r1) {
            r0 = this;
            r0.customStateDescription = r1
            if (r1 != 0) goto L8
            r0.setDefaultStateDescription()
            goto Lb
        L8:
            super.setStateDescription(r1)
        Lb:
            return
    }

    public void setUseMaterialThemeColors(boolean r1) {
            r0 = this;
            r0.useMaterialThemeColors = r1
            if (r1 == 0) goto Lc
            android.content.res.ColorStateList r1 = r0.getMaterialThemeColorsTintList()
            Yue.C1435.m7081(r0, r1)
            goto L10
        Lc:
            r1 = 0
            Yue.C1435.m7081(r0, r1)
        L10:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
            r1 = this;
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }
}
