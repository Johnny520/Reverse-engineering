package com.google.android.material.checkbox;

import Yue.C3235;
import Yue.C3287;
import Yue.C3323;
import Yue.C4068;
import Yue.C4520;
import Yue.C7837;
import Yue.InterfaceC3219;
import Yue.InterfaceC4525;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC7613;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.material.C1980R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCheckBox extends C3287 {
    private static final int[][] CHECKBOX_STATES;
    private static final int[] ERROR_STATE_SET;

    @SuppressLint({"DiscouragedApi"})
    private static final int FRAMEWORK_BUTTON_DRAWABLE_RES_ID;
    public static final int STATE_CHECKED = 1;
    public static final int STATE_INDETERMINATE = 2;
    public static final int STATE_UNCHECKED = 0;
    private boolean broadcasting;

    @InterfaceC6490
    private Drawable buttonDrawable;

    @InterfaceC6490
    private Drawable buttonIconDrawable;

    @InterfaceC6490
    ColorStateList buttonIconTintList;

    @InterfaceC6391
    private PorterDuff.Mode buttonIconTintMode;

    @InterfaceC6490
    ColorStateList buttonTintList;
    private boolean centerIfNoTextEnabled;
    private int checkedState;
    private int[] currentStateChecked;

    @InterfaceC6490
    private CharSequence customStateDescription;

    @InterfaceC6490
    private CharSequence errorAccessibilityLabel;
    private boolean errorShown;

    @InterfaceC6490
    private ColorStateList materialThemeColorsTintList;

    @InterfaceC6490
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener;

    @InterfaceC6391
    private final LinkedHashSet<OnCheckedStateChangedListener> onCheckedStateChangedListeners;

    @InterfaceC6391
    private final LinkedHashSet<OnErrorChangedListener> onErrorChangedListeners;

    @InterfaceC6490
    private final C3235 transitionToUnchecked;
    private final InterfaceC3219.AbstractC0084 transitionToUncheckedCallback;
    private boolean useMaterialThemeColors;
    private boolean usingMaterialButtonDrawable;
    private static final int DEF_STYLE_RES = C1980R.style.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[] INDETERMINATE_STATE_SET = {C1980R.attr.state_indeterminate};

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedState {
    }

    public interface OnCheckedStateChangedListener {
        void onCheckedStateChangedListener(@InterfaceC6391 MaterialCheckBox materialCheckBox, int i);
    }

    public interface OnErrorChangedListener {
        void onErrorChanged(@InterfaceC6391 MaterialCheckBox materialCheckBox, boolean z);
    }

    public static class SavedState extends View.BaseSavedState {

        @InterfaceC6391
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.checkbox.MaterialCheckBox.SavedState.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int checkedState;

        @InterfaceC6391
        private String getCheckedStateString() {
            int i = this.checkedState;
            return i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        @InterfaceC6391
        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + getCheckedStateString() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.checkedState));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.checkedState = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i = C1980R.attr.state_error;
        ERROR_STATE_SET = new int[]{i};
        CHECKBOX_STATES = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        FRAMEWORK_BUTTON_DRAWABLE_RES_ID = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    @InterfaceC6391
    private String getButtonStateDescription() {
        int i = this.checkedState;
        return i == 1 ? getResources().getString(C1980R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(C1980R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(C1980R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.materialThemeColorsTintList == null) {
            int[][] iArr = CHECKBOX_STATES;
            int[] iArr2 = new int[iArr.length];
            int color = MaterialColors.getColor(this, C1980R.attr.colorControlActivated);
            int color2 = MaterialColors.getColor(this, C1980R.attr.colorError);
            int color3 = MaterialColors.getColor(this, C1980R.attr.colorSurface);
            int color4 = MaterialColors.getColor(this, C1980R.attr.colorOnSurface);
            iArr2[0] = MaterialColors.layer(color3, color2, 1.0f);
            iArr2[1] = MaterialColors.layer(color3, color, 1.0f);
            iArr2[2] = MaterialColors.layer(color3, color4, 0.54f);
            iArr2[3] = MaterialColors.layer(color3, color4, 0.38f);
            iArr2[4] = MaterialColors.layer(color3, color4, 0.38f);
            this.materialThemeColorsTintList = new ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsTintList;
    }

    @InterfaceC6490
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.buttonTintList;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private boolean isButtonDrawableLegacy(C7837 c7837) {
        return c7837.m24888(C1980R.styleable.MaterialCheckBox_android_button, 0) == FRAMEWORK_BUTTON_DRAWABLE_RES_ID && c7837.m24888(C1980R.styleable.MaterialCheckBox_buttonCompat, 0) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.buttonIconDrawable.jumpToCurrentState();
    }

    private void refreshButtonDrawable() {
        this.buttonDrawable = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.buttonDrawable, this.buttonTintList, C4068.m11501(this));
        this.buttonIconDrawable = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.buttonIconDrawable, this.buttonIconTintList, this.buttonIconTintMode);
        setUpDefaultButtonDrawableAnimationIfNeeded();
        updateButtonTints();
        super.setButtonDrawable(DrawableUtils.compositeTwoLayeredDrawable(this.buttonDrawable, this.buttonIconDrawable));
        refreshDrawableState();
    }

    private void setDefaultStateDescription() {
        if (Build.VERSION.SDK_INT < 30 || this.customStateDescription != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void setUpDefaultButtonDrawableAnimationIfNeeded() {
        C3235 c3235;
        if (this.usingMaterialButtonDrawable) {
            C3235 c32352 = this.transitionToUnchecked;
            if (c32352 != null) {
                c32352.unregisterAnimationCallback(this.transitionToUncheckedCallback);
                this.transitionToUnchecked.registerAnimationCallback(this.transitionToUncheckedCallback);
            }
            Drawable drawable = this.buttonDrawable;
            if (!(drawable instanceof AnimatedStateListDrawable) || (c3235 = this.transitionToUnchecked) == null) {
                return;
            }
            ((AnimatedStateListDrawable) drawable).addTransition(C1980R.id.checked, C1980R.id.unchecked, c3235, false);
            ((AnimatedStateListDrawable) this.buttonDrawable).addTransition(C1980R.id.indeterminate, C1980R.id.unchecked, this.transitionToUnchecked, false);
        }
    }

    private void updateButtonTints() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.buttonDrawable;
        if (drawable != null && (colorStateList2 = this.buttonTintList) != null) {
            C4520.m13236(drawable, colorStateList2);
        }
        Drawable drawable2 = this.buttonIconDrawable;
        if (drawable2 == null || (colorStateList = this.buttonIconTintList) == null) {
            return;
        }
        C4520.m13236(drawable2, colorStateList);
    }

    private void updateIconTintIfNeeded() {
    }

    public void addOnCheckedStateChangedListener(@InterfaceC6391 OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.onCheckedStateChangedListeners.add(onCheckedStateChangedListener);
    }

    public void addOnErrorChangedListener(@InterfaceC6391 OnErrorChangedListener onErrorChangedListener) {
        this.onErrorChangedListeners.add(onErrorChangedListener);
    }

    public void clearOnCheckedStateChangedListeners() {
        this.onCheckedStateChangedListeners.clear();
    }

    public void clearOnErrorChangedListeners() {
        this.onErrorChangedListeners.clear();
    }

    @Override // android.widget.CompoundButton
    @InterfaceC6490
    public Drawable getButtonDrawable() {
        return this.buttonDrawable;
    }

    @InterfaceC6490
    public Drawable getButtonIconDrawable() {
        return this.buttonIconDrawable;
    }

    @InterfaceC6490
    public ColorStateList getButtonIconTintList() {
        return this.buttonIconTintList;
    }

    @InterfaceC6391
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.buttonIconTintMode;
    }

    @Override // android.widget.CompoundButton
    @InterfaceC6490
    public ColorStateList getButtonTintList() {
        return this.buttonTintList;
    }

    public int getCheckedState() {
        return this.checkedState;
    }

    @InterfaceC6490
    public CharSequence getErrorAccessibilityLabel() {
        return this.errorAccessibilityLabel;
    }

    public boolean isCenterIfNoTextEnabled() {
        return this.centerIfNoTextEnabled;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.checkedState == 1;
    }

    public boolean isErrorShown() {
        return this.errorShown;
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && this.buttonTintList == null && this.buttonIconTintList == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, INDETERMINATE_STATE_SET);
        }
        if (isErrorShown()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, ERROR_STATE_SET);
        }
        this.currentStateChecked = DrawableUtils.getCheckedState(iArrOnCreateDrawableState);
        updateIconTintIfNeeded();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawableM1021;
        if (!this.centerIfNoTextEnabled || !TextUtils.isEmpty(getText()) || (drawableM1021 = C4068.m1021(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableM1021.getIntrinsicWidth()) / 2) * (ViewUtils.isLayoutRtl(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableM1021.getBounds();
            C4520.m13233(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@InterfaceC6490 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && isErrorShown()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.errorAccessibilityLabel));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@InterfaceC6490 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.checkedState);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @InterfaceC6490
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.checkedState = getCheckedState();
        return savedState;
    }

    public void removeOnCheckedStateChangedListener(@InterfaceC6391 OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.onCheckedStateChangedListeners.remove(onCheckedStateChangedListener);
    }

    public void removeOnErrorChangedListener(@InterfaceC6391 OnErrorChangedListener onErrorChangedListener) {
        this.onErrorChangedListeners.remove(onErrorChangedListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.C3287, android.widget.CompoundButton
    public void setButtonDrawable(@InterfaceC4525 int i) {
        setButtonDrawable(C3323.m396(getContext(), i));
    }

    public void setButtonIconDrawable(@InterfaceC6490 Drawable drawable) {
        this.buttonIconDrawable = drawable;
        refreshButtonDrawable();
    }

    public void setButtonIconDrawableResource(@InterfaceC4525 int i) {
        setButtonIconDrawable(C3323.m396(getContext(), i));
    }

    public void setButtonIconTintList(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.buttonIconTintList == colorStateList) {
            return;
        }
        this.buttonIconTintList = colorStateList;
        refreshButtonDrawable();
    }

    public void setButtonIconTintMode(@InterfaceC6391 PorterDuff.Mode mode) {
        if (this.buttonIconTintMode == mode) {
            return;
        }
        this.buttonIconTintMode = mode;
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.buttonTintList == colorStateList) {
            return;
        }
        this.buttonTintList = colorStateList;
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        refreshButtonDrawable();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.centerIfNoTextEnabled = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.checkedState != i) {
            this.checkedState = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            setDefaultStateDescription();
            if (this.broadcasting) {
                return;
            }
            this.broadcasting = true;
            LinkedHashSet<OnCheckedStateChangedListener> linkedHashSet = this.onCheckedStateChangedListeners;
            if (linkedHashSet != null) {
                Iterator<OnCheckedStateChangedListener> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().onCheckedStateChangedListener(this, this.checkedState);
                }
            }
            if (this.checkedState != 2 && (onCheckedChangeListener = this.onCheckedChangeListener) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.broadcasting = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        updateIconTintIfNeeded();
    }

    public void setErrorAccessibilityLabel(@InterfaceC6490 CharSequence charSequence) {
        this.errorAccessibilityLabel = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@InterfaceC7613 int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.errorShown == z) {
            return;
        }
        this.errorShown = z;
        refreshDrawableState();
        Iterator<OnErrorChangedListener> it = this.onErrorChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onErrorChanged(this, this.errorShown);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@InterfaceC6490 CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @InterfaceC7113(30)
    public void setStateDescription(@InterfaceC6490 CharSequence charSequence) {
        this.customStateDescription = charSequence;
        if (charSequence == null) {
            setDefaultStateDescription();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        if (z) {
            C4068.m11502(this, getMaterialThemeColorsTintList());
        } else {
            C4068.m11502(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MaterialCheckBox(Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.checkboxStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.C3287, android.widget.CompoundButton
    public void setButtonDrawable(@InterfaceC6490 Drawable drawable) {
        this.buttonDrawable = drawable;
        this.usingMaterialButtonDrawable = false;
        refreshButtonDrawable();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.onErrorChangedListeners = new LinkedHashSet<>();
        this.onCheckedStateChangedListeners = new LinkedHashSet<>();
        this.transitionToUnchecked = C3235.m315(getContext(), C1980R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.transitionToUncheckedCallback = new InterfaceC3219.AbstractC0084() { // from class: com.google.android.material.checkbox.MaterialCheckBox.1
            @Override // Yue.InterfaceC3219.AbstractC0084
            public void onAnimationEnd(Drawable drawable) {
                super.onAnimationEnd(drawable);
                ColorStateList colorStateList = MaterialCheckBox.this.buttonTintList;
                if (colorStateList != null) {
                    C4520.m13236(drawable, colorStateList);
                }
            }

            @Override // Yue.InterfaceC3219.AbstractC0084
            public void onAnimationStart(Drawable drawable) {
                super.onAnimationStart(drawable);
                MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
                ColorStateList colorStateList = materialCheckBox.buttonTintList;
                if (colorStateList != null) {
                    C4520.m13235(drawable, colorStateList.getColorForState(materialCheckBox.currentStateChecked, MaterialCheckBox.this.buttonTintList.getDefaultColor()));
                }
            }
        };
        Context context2 = getContext();
        this.buttonDrawable = C4068.m1021(this);
        this.buttonTintList = getSuperButtonTintList();
        setSupportButtonTintList(null);
        C7837 c7837ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C1980R.styleable.MaterialCheckBox, i, i2, new int[0]);
        this.buttonIconDrawable = c7837ObtainTintedStyledAttributes.m24875(C1980R.styleable.MaterialCheckBox_buttonIcon);
        if (this.buttonDrawable != null && ThemeEnforcement.isMaterial3Theme(context2) && isButtonDrawableLegacy(c7837ObtainTintedStyledAttributes)) {
            super.setButtonDrawable((Drawable) null);
            this.buttonDrawable = C3323.m396(context2, C1980R.drawable.mtrl_checkbox_button);
            this.usingMaterialButtonDrawable = true;
            if (this.buttonIconDrawable == null) {
                this.buttonIconDrawable = C3323.m396(context2, C1980R.drawable.mtrl_checkbox_button_icon);
            }
        }
        this.buttonIconTintList = MaterialResources.getColorStateList(context2, c7837ObtainTintedStyledAttributes, C1980R.styleable.MaterialCheckBox_buttonIconTint);
        this.buttonIconTintMode = ViewUtils.parseTintMode(c7837ObtainTintedStyledAttributes.m24882(C1980R.styleable.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.useMaterialThemeColors = c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.MaterialCheckBox_useMaterialThemeColors, false);
        this.centerIfNoTextEnabled = c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.errorShown = c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.MaterialCheckBox_errorShown, false);
        this.errorAccessibilityLabel = c7837ObtainTintedStyledAttributes.m24891(C1980R.styleable.MaterialCheckBox_errorAccessibilityLabel);
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.MaterialCheckBox_checkedState)) {
            setCheckedState(c7837ObtainTintedStyledAttributes.m24882(C1980R.styleable.MaterialCheckBox_checkedState, 0));
        }
        c7837ObtainTintedStyledAttributes.m24899();
        refreshButtonDrawable();
    }
}
