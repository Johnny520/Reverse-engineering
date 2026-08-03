package com.google.android.material.textfield;

import Yue.AbstractC2967;
import Yue.C3024;
import Yue.C3055;
import Yue.C3304;
import Yue.C3323;
import Yue.C3343;
import Yue.C3530;
import Yue.C4187;
import Yue.C4520;
import Yue.C4533;
import Yue.C4786;
import Yue.C5946;
import Yue.C7759;
import Yue.C7837;
import Yue.C7986;
import Yue.C8273;
import Yue.InterfaceC3897;
import Yue.InterfaceC3906;
import Yue.InterfaceC4398;
import Yue.InterfaceC4525;
import Yue.InterfaceC5459;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC7613;
import Yue.InterfaceC7651;
import Yue.InterfaceC8392;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.C1980R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEFAULT_PLACEHOLDER_FADE_DURATION = 87;
    private static final int DEF_STYLE_RES = C1980R.style.Widget_Design_TextInputLayout;
    private static final int[][] EDIT_TEXT_BACKGROUND_RIPPLE_STATE = {new int[]{R.attr.state_pressed}, new int[0]};
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private static final int NO_WIDTH = -1;
    private static final int PLACEHOLDER_START_DELAY = 67;
    private ValueAnimator animator;
    private boolean areCornerRadiiRtl;

    @InterfaceC6490
    private MaterialShapeDrawable boxBackground;
    private boolean boxBackgroundApplied;

    @InterfaceC3897
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;

    @InterfaceC3897
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;

    @InterfaceC6490
    private MaterialShapeDrawable boxUnderlineDefault;

    @InterfaceC6490
    private MaterialShapeDrawable boxUnderlineFocused;
    final CollapsingTextHelper collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;

    @InterfaceC6490
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;

    @InterfaceC6490
    private ColorStateList counterTextColor;

    @InterfaceC6490
    private TextView counterView;

    @InterfaceC6490
    private ColorStateList cursorColor;

    @InterfaceC6490
    private ColorStateList cursorErrorColor;

    @InterfaceC3897
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;

    @InterfaceC3897
    private int defaultStrokeColor;

    @InterfaceC3897
    private int disabledColor;

    @InterfaceC3897
    private int disabledFilledBackgroundColor;
    EditText editText;
    private final LinkedHashSet<OnEditTextAttachedListener> editTextAttachedListeners;

    @InterfaceC6490
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;

    @InterfaceC6391
    private final EndCompoundLayout endLayout;
    private boolean expandedHintEnabled;
    private StateListDrawable filledDropDownMenuBackground;

    @InterfaceC3897
    private int focusedFilledBackgroundColor;

    @InterfaceC3897
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private boolean globalLayoutListenerAdded;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;

    @InterfaceC3897
    private int hoveredFilledBackgroundColor;

    @InterfaceC3897
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final IndicatorViewController indicatorViewController;

    @InterfaceC6391
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;

    @InterfaceC6391
    private LengthCounter lengthCounter;
    private int maxEms;
    private int maxWidth;
    private int minEms;
    private int minWidth;
    private Drawable originalEditTextEndDrawable;
    int originalEditTextMinimumHeight;
    private CharSequence originalHint;
    private MaterialShapeDrawable outlinedDropDownMenuBackground;
    private boolean placeholderEnabled;

    @InterfaceC6490
    private C4786 placeholderFadeIn;

    @InterfaceC6490
    private C4786 placeholderFadeOut;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;

    @InterfaceC6490
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private boolean restoringSavedState;

    @InterfaceC6391
    private ShapeAppearanceModel shapeAppearanceModel;

    @InterfaceC6490
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;

    @InterfaceC6391
    private final StartCompoundLayout startLayout;
    private ColorStateList strokeErrorColor;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    public static class AccessibilityDelegate extends C3024 {
        private final TextInputLayout layout;

        public AccessibilityDelegate(@InterfaceC6391 TextInputLayout textInputLayout) {
            this.layout = textInputLayout;
        }

        @Override // Yue.C3024
        public void onInitializeAccessibilityNodeInfo(@InterfaceC6391 View view, @InterfaceC6391 C3055 c3055) {
            super.onInitializeAccessibilityNodeInfo(view, c3055);
            EditText editText = this.layout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.layout.getHint();
            CharSequence error = this.layout.getError();
            CharSequence placeholderText = this.layout.getPlaceholderText();
            int counterMaxLength = this.layout.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.layout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean z = !zIsEmpty;
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !this.layout.isHintExpanded();
            boolean z5 = !TextUtils.isEmpty(error);
            if (!z5 && TextUtils.isEmpty(counterOverflowDescription)) {
                z2 = false;
            }
            String string = z3 ? hint.toString() : "";
            this.layout.startLayout.setupAccessibilityNodeInfo(c3055);
            if (z) {
                c3055.m6103(text);
            } else if (!TextUtils.isEmpty(string)) {
                c3055.m6103(string);
                if (z4 && placeholderText != null) {
                    c3055.m6103(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                c3055.m6103(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                c3055.m6074(string);
                c3055.m6099(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            c3055.m6083(counterMaxLength);
            if (z2) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                c3055.m6069(error);
            }
            View helperTextView = this.layout.indicatorViewController.getHelperTextView();
            if (helperTextView != null) {
                c3055.m6077(helperTextView);
            }
            this.layout.endLayout.getEndIconDelegate().onInitializeAccessibilityNodeInfo(view, c3055);
        }

        @Override // Yue.C3024
        public void onPopulateAccessibilityEvent(@InterfaceC6391 View view, @InterfaceC6391 AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.layout.endLayout.getEndIconDelegate().onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface EndIconMode {
    }

    public interface LengthCounter {
        int countLength(@InterfaceC6490 Editable editable);
    }

    public interface OnEditTextAttachedListener {
        void onEditTextAttached(@InterfaceC6391 TextInputLayout textInputLayout);
    }

    public interface OnEndIconChangedListener {
        void onEndIconChanged(@InterfaceC6391 TextInputLayout textInputLayout, int i);
    }

    public static class SavedState extends AbstractC2967 {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.textfield.TextInputLayout.SavedState.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @InterfaceC6391
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @InterfaceC6391
            public SavedState createFromParcel(@InterfaceC6391 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @InterfaceC6490
            public SavedState createFromParcel(@InterfaceC6391 Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        @InterfaceC6490
        CharSequence error;
        boolean isEndIconChecked;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @InterfaceC6391
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.error) + "}";
        }

        @Override // Yue.AbstractC2967, android.os.Parcelable
        public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.error, parcel, i);
            parcel.writeInt(this.isEndIconChecked ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(@InterfaceC6391 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.error = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.isEndIconChecked = parcel.readInt() == 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TextInputLayout(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private void addPlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            this.inputFrame.addView(textView);
            this.placeholderTextView.setVisibility(0);
        }
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
        if (this.editText == null || this.boxBackgroundMode != 1) {
            return;
        }
        if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
            EditText editText = this.editText;
            C8273.m27471(editText, C8273.m27367(editText), getResources().getDimensionPixelSize(C1980R.dimen.material_filled_edittext_font_2_0_padding_top), C8273.m27366(this.editText), getResources().getDimensionPixelSize(C1980R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            EditText editText2 = this.editText;
            C8273.m27471(editText2, C8273.m27367(editText2), getResources().getDimensionPixelSize(C1980R.dimen.material_filled_edittext_font_1_3_padding_top), C8273.m27366(this.editText), getResources().getDimensionPixelSize(C1980R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private void applyBoxAttributes() {
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null) {
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        ShapeAppearanceModel shapeAppearanceModel2 = this.shapeAppearanceModel;
        if (shapeAppearanceModel != shapeAppearanceModel2) {
            this.boxBackground.setShapeAppearanceModel(shapeAppearanceModel2);
        }
        if (canDrawOutlineStroke()) {
            this.boxBackground.setStroke(this.boxStrokeWidthPx, this.boxStrokeColor);
        }
        int iCalculateBoxBackgroundColor = calculateBoxBackgroundColor();
        this.boxBackgroundColor = iCalculateBoxBackgroundColor;
        this.boxBackground.setFillColor(ColorStateList.valueOf(iCalculateBoxBackgroundColor));
        applyBoxUnderlineAttributes();
        updateEditTextBoxBackgroundIfNeeded();
    }

    private void applyBoxUnderlineAttributes() {
        if (this.boxUnderlineDefault == null || this.boxUnderlineFocused == null) {
            return;
        }
        if (canDrawStroke()) {
            this.boxUnderlineDefault.setFillColor(this.editText.isFocused() ? ColorStateList.valueOf(this.defaultStrokeColor) : ColorStateList.valueOf(this.boxStrokeColor));
            this.boxUnderlineFocused.setFillColor(ColorStateList.valueOf(this.boxStrokeColor));
        }
        invalidate();
    }

    private void applyCutoutPadding(@InterfaceC6391 RectF rectF) {
        float f = rectF.left;
        int i = this.boxLabelCutoutPaddingPx;
        rectF.left = f - i;
        rectF.right += i;
    }

    private void assignBoxBackgroundByMode() {
        int i = this.boxBackgroundMode;
        if (i == 0) {
            this.boxBackground = null;
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
            return;
        }
        if (i == 1) {
            this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            this.boxUnderlineDefault = new MaterialShapeDrawable();
            this.boxUnderlineFocused = new MaterialShapeDrawable();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.boxBackgroundMode + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.hintEnabled || (this.boxBackground instanceof CutoutDrawable)) {
                this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            } else {
                this.boxBackground = CutoutDrawable.create(this.shapeAppearanceModel);
            }
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
        }
    }

    private int calculateBoxBackgroundColor() {
        return this.boxBackgroundMode == 1 ? MaterialColors.layer(MaterialColors.getColor(this, C1980R.attr.colorSurface, 0), this.boxBackgroundColor) : this.boxBackgroundColor;
    }

    @InterfaceC6391
    private Rect calculateCollapsedTextBounds(@InterfaceC6391 Rect rect) {
        if (this.editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.tmpBoundsRect;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        rect2.bottom = rect.bottom;
        int i = this.boxBackgroundMode;
        if (i == 1) {
            rect2.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(rect.left, zIsLayoutRtl);
            rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
            rect2.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, zIsLayoutRtl);
            return rect2;
        }
        if (i != 2) {
            rect2.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(rect.left, zIsLayoutRtl);
            rect2.top = getPaddingTop();
            rect2.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, zIsLayoutRtl);
            return rect2;
        }
        rect2.left = rect.left + this.editText.getPaddingLeft();
        rect2.top = rect.top - calculateLabelMarginTop();
        rect2.right = rect.right - this.editText.getPaddingRight();
        return rect2;
    }

    private int calculateExpandedLabelBottom(@InterfaceC6391 Rect rect, @InterfaceC6391 Rect rect2, float f) {
        return isSingleLineFilledTextField() ? (int) (rect2.top + f) : rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private int calculateExpandedLabelTop(@InterfaceC6391 Rect rect, float f) {
        return isSingleLineFilledTextField() ? (int) (rect.centerY() - (f / 2.0f)) : rect.top + this.editText.getCompoundPaddingTop();
    }

    @InterfaceC6391
    private Rect calculateExpandedTextBounds(@InterfaceC6391 Rect rect) {
        if (this.editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.tmpBoundsRect;
        float expandedTextHeight = this.collapsingTextHelper.getExpandedTextHeight();
        rect2.left = rect.left + this.editText.getCompoundPaddingLeft();
        rect2.top = calculateExpandedLabelTop(rect, expandedTextHeight);
        rect2.right = rect.right - this.editText.getCompoundPaddingRight();
        rect2.bottom = calculateExpandedLabelBottom(rect, rect2, expandedTextHeight);
        return rect2;
    }

    private int calculateLabelMarginTop() {
        float collapsedTextHeight;
        if (!this.hintEnabled) {
            return 0;
        }
        int i = this.boxBackgroundMode;
        if (i == 0) {
            collapsedTextHeight = this.collapsingTextHelper.getCollapsedTextHeight();
        } else {
            if (i != 2) {
                return 0;
            }
            collapsedTextHeight = this.collapsingTextHelper.getCollapsedTextHeight() / 2.0f;
        }
        return (int) collapsedTextHeight;
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((CutoutDrawable) this.boxBackground).removeCutout();
        }
    }

    private void collapseHint(boolean z) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z && this.hintAnimationEnabled) {
            animateToExpansionFraction(1.0f);
        } else {
            this.collapsingTextHelper.setExpansionFraction(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        updatePlaceholderText();
        this.startLayout.onHintStateChanged(false);
        this.endLayout.onHintStateChanged(false);
    }

    private C4786 createPlaceholderFadeTransition() {
        C4786 c4786 = new C4786();
        c4786.setDuration(MotionUtils.resolveThemeDuration(getContext(), C1980R.attr.motionDurationShort2, 87));
        c4786.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), C1980R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR));
        return c4786;
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof CutoutDrawable);
    }

    private void dispatchOnEditTextAttached() {
        Iterator<OnEditTextAttachedListener> it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEditTextAttached(this);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        if (this.boxUnderlineFocused == null || (materialShapeDrawable = this.boxUnderlineDefault) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.editText.isFocused()) {
            Rect bounds = this.boxUnderlineFocused.getBounds();
            Rect bounds2 = this.boxUnderlineDefault.getBounds();
            float expansionFraction = this.collapsingTextHelper.getExpansionFraction();
            int iCenterX = bounds2.centerX();
            bounds.left = AnimationUtils.lerp(iCenterX, bounds2.left, expansionFraction);
            bounds.right = AnimationUtils.lerp(iCenterX, bounds2.right, expansionFraction);
            this.boxUnderlineFocused.draw(canvas);
        }
    }

    private void drawHint(@InterfaceC6391 Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.draw(canvas);
        }
    }

    private void expandHint(boolean z) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z && this.hintAnimationEnabled) {
            animateToExpansionFraction(0.0f);
        } else {
            this.collapsingTextHelper.setExpansionFraction(0.0f);
        }
        if (cutoutEnabled() && ((CutoutDrawable) this.boxBackground).hasCutout()) {
            closeCutout();
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        this.startLayout.onHintStateChanged(true);
        this.endLayout.onHintStateChanged(true);
    }

    private MaterialShapeDrawable getDropDownMaterialShapeDrawable(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(C1980R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.editText;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(C1980R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C1980R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setTopLeftCornerSize(f).setTopRightCornerSize(f).setBottomLeftCornerSize(dimensionPixelOffset).setBottomRightCornerSize(dimensionPixelOffset).build();
        EditText editText2 = this.editText;
        MaterialShapeDrawable materialShapeDrawableCreateWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        materialShapeDrawableCreateWithElevationOverlay.setShapeAppearanceModel(shapeAppearanceModelBuild);
        materialShapeDrawableCreateWithElevationOverlay.setPadding(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return materialShapeDrawableCreateWithElevationOverlay;
    }

    @InterfaceC6490
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.editText;
        if (!(editText instanceof AutoCompleteTextView) || EditTextUtils.isEditable(editText)) {
            return this.boxBackground;
        }
        int color = MaterialColors.getColor(this.editText, C1980R.attr.colorControlHighlight);
        int i = this.boxBackgroundMode;
        if (i == 2) {
            return getOutlinedBoxBackgroundWithRipple(getContext(), this.boxBackground, color, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        }
        if (i == 1) {
            return getFilledBoxBackgroundWithRipple(this.boxBackground, this.boxBackgroundColor, color, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        }
        return null;
    }

    private static Drawable getFilledBoxBackgroundWithRipple(MaterialShapeDrawable materialShapeDrawable, int i, int i2, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{MaterialColors.layer(i2, i, 0.1f), i}), materialShapeDrawable, materialShapeDrawable);
    }

    private int getLabelLeftBoundAlignedWithPrefixAndSuffix(int i, boolean z) {
        return i + ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.editText.getCompoundPaddingLeft() : this.endLayout.getSuffixTextEndOffset() : this.startLayout.getPrefixTextStartOffset());
    }

    private int getLabelRightBoundAlignedWithPrefixAndSuffix(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.editText.getCompoundPaddingRight() : this.startLayout.getPrefixTextStartOffset() : this.endLayout.getSuffixTextEndOffset());
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.filledDropDownMenuBackground == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.filledDropDownMenuBackground = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.filledDropDownMenuBackground.addState(new int[0], getDropDownMaterialShapeDrawable(false));
        }
        return this.filledDropDownMenuBackground;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.outlinedDropDownMenuBackground == null) {
            this.outlinedDropDownMenuBackground = getDropDownMaterialShapeDrawable(true);
        }
        return this.outlinedDropDownMenuBackground;
    }

    private static Drawable getOutlinedBoxBackgroundWithRipple(Context context, MaterialShapeDrawable materialShapeDrawable, int i, int[][] iArr) {
        int color = MaterialColors.getColor(context, C1980R.attr.colorSurface, LOG_TAG);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        int iLayer = MaterialColors.layer(i, color, 0.1f);
        materialShapeDrawable2.setFillColor(new ColorStateList(iArr, new int[]{iLayer, 0}));
        materialShapeDrawable2.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iLayer, color});
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        materialShapeDrawable3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
    }

    private void hidePlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView == null || !this.placeholderEnabled) {
            return;
        }
        textView.setText((CharSequence) null);
        C7986.m3997(this.inputFrame, this.placeholderFadeOut);
        this.placeholderTextView.setVisibility(4);
    }

    private boolean isOnError() {
        return shouldShowError() || (this.counterView != null && this.counterOverflowed);
    }

    private boolean isSingleLineFilledTextField() {
        return this.boxBackgroundMode == 1 && this.editText.getMinLines() <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGlobalLayout$1() {
        this.editText.requestLayout();
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        updateEditTextBoxBackgroundIfNeeded();
        updateTextInputBoxState();
        updateBoxCollapsedPaddingTop();
        adjustFilledEditTextPaddingForLargeFont();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
        setDropDownMenuBackgroundIfNeeded();
    }

    private void openCutout() {
        if (cutoutEnabled()) {
            RectF rectF = this.tmpRectF;
            this.collapsingTextHelper.getCollapsedTextActualBounds(rectF, this.editText.getWidth(), this.editText.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            applyCutoutPadding(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.boxStrokeWidthPx);
            ((CutoutDrawable) this.boxBackground).setCutout(rectF);
        }
    }

    private void recalculateCutout() {
        if (!cutoutEnabled() || this.hintExpanded) {
            return;
        }
        closeCutout();
        openCutout();
    }

    private static void recursiveSetEnabled(@InterfaceC6391 ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z);
            }
        }
    }

    private void removePlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void setDropDownMenuBackgroundIfNeeded() {
        EditText editText = this.editText;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i = this.boxBackgroundMode;
                if (i == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.editText != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i(LOG_TAG, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.editText = editText;
        int i = this.minEms;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.minWidth);
        }
        int i2 = this.maxEms;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.maxWidth);
        }
        this.boxBackgroundApplied = false;
        onApplyBoxBackgroundMode();
        setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
        this.collapsingTextHelper.setTypefaces(this.editText.getTypeface());
        this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
        int i3 = Build.VERSION.SDK_INT;
        this.collapsingTextHelper.setExpandedLetterSpacing(this.editText.getLetterSpacing());
        int gravity = this.editText.getGravity();
        this.collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
        this.collapsingTextHelper.setExpandedTextGravity(gravity);
        this.originalEditTextMinimumHeight = C8273.m27361(editText);
        this.editText.addTextChangedListener(new TextWatcher(editText) { // from class: com.google.android.material.textfield.TextInputLayout.1
            int previousLineCount;
            final /* synthetic */ EditText val$editText;

            {
                this.val$editText = editText;
                this.previousLineCount = editText.getLineCount();
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(@InterfaceC6391 Editable editable) {
                TextInputLayout.this.updateLabelState(!r0.restoringSavedState);
                TextInputLayout textInputLayout = TextInputLayout.this;
                if (textInputLayout.counterEnabled) {
                    textInputLayout.updateCounter(editable);
                }
                if (TextInputLayout.this.placeholderEnabled) {
                    TextInputLayout.this.updatePlaceholderText(editable);
                }
                int lineCount = this.val$editText.getLineCount();
                int i4 = this.previousLineCount;
                if (lineCount != i4) {
                    if (lineCount < i4) {
                        int iM27361 = C8273.m27361(this.val$editText);
                        int i5 = TextInputLayout.this.originalEditTextMinimumHeight;
                        if (iM27361 != i5) {
                            this.val$editText.setMinimumHeight(i5);
                        }
                    }
                    this.previousLineCount = lineCount;
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }
        });
        if (this.defaultHintTextColor == null) {
            this.defaultHintTextColor = this.editText.getHintTextColors();
        }
        if (this.hintEnabled) {
            if (TextUtils.isEmpty(this.hint)) {
                CharSequence hint = this.editText.getHint();
                this.originalHint = hint;
                setHint(hint);
                this.editText.setHint((CharSequence) null);
            }
            this.isProvidingHint = true;
        }
        if (i3 >= 29) {
            updateCursorColor();
        }
        if (this.counterView != null) {
            updateCounter(this.editText.getText());
        }
        updateEditTextBackground();
        this.indicatorViewController.adjustIndicatorPadding();
        this.startLayout.bringToFront();
        this.endLayout.bringToFront();
        dispatchOnEditTextAttached();
        this.endLayout.updateSuffixTextViewPadding();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        updateLabelState(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.hint)) {
            return;
        }
        this.hint = charSequence;
        this.collapsingTextHelper.setText(charSequence);
        if (this.hintExpanded) {
            return;
        }
        openCutout();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.placeholderEnabled == z) {
            return;
        }
        if (z) {
            addPlaceholderTextView();
        } else {
            removePlaceholderTextView();
            this.placeholderTextView = null;
        }
        this.placeholderEnabled = z;
    }

    private boolean shouldUpdateEndDummyDrawable() {
        return (this.endLayout.isErrorIconVisible() || ((this.endLayout.hasEndIcon() && isEndIconVisible()) || this.endLayout.getSuffixText() != null)) && this.endLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUpdateStartDummyDrawable() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.startLayout.getMeasuredWidth() > 0;
    }

    private void showPlaceholderText() {
        if (this.placeholderTextView == null || !this.placeholderEnabled || TextUtils.isEmpty(this.placeholderText)) {
            return;
        }
        this.placeholderTextView.setText(this.placeholderText);
        C7986.m3997(this.inputFrame, this.placeholderFadeIn);
        this.placeholderTextView.setVisibility(0);
        this.placeholderTextView.bringToFront();
        announceForAccessibility(this.placeholderText);
    }

    private void updateBoxCollapsedPaddingTop() {
        if (this.boxBackgroundMode == 1) {
            if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(C1980R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(C1980R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private void updateBoxUnderlineBounds(@InterfaceC6391 Rect rect) {
        MaterialShapeDrawable materialShapeDrawable = this.boxUnderlineDefault;
        if (materialShapeDrawable != null) {
            int i = rect.bottom;
            materialShapeDrawable.setBounds(rect.left, i - this.boxStrokeWidthDefaultPx, rect.right, i);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.boxUnderlineFocused;
        if (materialShapeDrawable2 != null) {
            int i2 = rect.bottom;
            materialShapeDrawable2.setBounds(rect.left, i2 - this.boxStrokeWidthFocusedPx, rect.right, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void updateCounter() {
        if (this.counterView != null) {
            EditText editText = this.editText;
            updateCounter(editText == null ? null : editText.getText());
        }
    }

    private static void updateCounterContentDescription(@InterfaceC6391 Context context, @InterfaceC6391 TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? C1980R.string.character_counter_overflowed_content_description : C1980R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void updateCounterTextAppearanceAndColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.counterView;
        if (textView != null) {
            setTextAppearanceCompatWithErrorFallback(textView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (!this.counterOverflowed || (colorStateList = this.counterOverflowTextColor) == null) {
                return;
            }
            this.counterView.setTextColor(colorStateList);
        }
    }

    @InterfaceC7113(29)
    private void updateCursorColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateListOrNull = this.cursorColor;
        if (colorStateListOrNull == null) {
            colorStateListOrNull = MaterialColors.getColorStateListOrNull(getContext(), C1980R.attr.colorControlActivated);
        }
        EditText editText = this.editText;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = C4520.m13239(this.editText.getTextCursorDrawable()).mutate();
        if (isOnError() && (colorStateList = this.cursorErrorColor) != null) {
            colorStateListOrNull = colorStateList;
        }
        C4520.m13236(drawableMutate, colorStateListOrNull);
    }

    private void updateEditTextBoxBackground() {
        C8273.m27447(this.editText, getEditTextBoxBackground());
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int iMax;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (iMax = Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(iMax);
        return true;
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int iCalculateLabelMarginTop = calculateLabelMarginTop();
            if (iCalculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = iCalculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        EditText editText;
        if (this.placeholderTextView == null || (editText = this.editText) == null) {
            return;
        }
        this.placeholderTextView.setGravity(editText.getGravity());
        this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void updatePlaceholderText() {
        EditText editText = this.editText;
        updatePlaceholderText(editText == null ? null : editText.getText());
    }

    private void updateStrokeErrorColor(boolean z, boolean z2) {
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.boxStrokeColor = colorForState2;
        } else if (z2) {
            this.boxStrokeColor = colorForState;
        } else {
            this.boxStrokeColor = defaultColor;
        }
    }

    public void addOnEditTextAttachedListener(@InterfaceC6391 OnEditTextAttachedListener onEditTextAttachedListener) {
        this.editTextAttachedListeners.add(onEditTextAttachedListener);
        if (this.editText != null) {
            onEditTextAttachedListener.onEditTextAttached(this);
        }
    }

    public void addOnEndIconChangedListener(@InterfaceC6391 OnEndIconChangedListener onEndIconChangedListener) {
        this.endLayout.addOnEndIconChangedListener(onEndIconChangedListener);
    }

    @Override // android.view.ViewGroup
    public void addView(@InterfaceC6391 View view, int i, @InterfaceC6391 ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.inputFrame.addView(view, layoutParams2);
        this.inputFrame.setLayoutParams(layoutParams);
        updateInputLayoutMargins();
        setEditText((EditText) view);
    }

    @InterfaceC8392
    public void animateToExpansionFraction(float f) {
        if (this.collapsingTextHelper.getExpansionFraction() == f) {
            return;
        }
        if (this.animator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.animator = valueAnimator;
            valueAnimator.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), C1980R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            this.animator.setDuration(MotionUtils.resolveThemeDuration(getContext(), C1980R.attr.motionDurationMedium4, 167));
            this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.TextInputLayout.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@InterfaceC6391 ValueAnimator valueAnimator2) {
                    TextInputLayout.this.collapsingTextHelper.setExpansionFraction(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.animator.setFloatValues(this.collapsingTextHelper.getExpansionFraction(), f);
        this.animator.start();
    }

    public void clearOnEditTextAttachedListeners() {
        this.editTextAttachedListeners.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.endLayout.clearOnEndIconChangedListeners();
    }

    @InterfaceC8392
    public boolean cutoutIsOpen() {
        return cutoutEnabled() && ((CutoutDrawable) this.boxBackground).hasCutout();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@InterfaceC6391 ViewStructure viewStructure, int i) {
        EditText editText = this.editText;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.originalHint != null) {
            boolean z = this.isProvidingHint;
            this.isProvidingHint = false;
            CharSequence hint = editText.getHint();
            this.editText.setHint(this.originalHint);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.editText.setHint(hint);
                this.isProvidingHint = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.inputFrame.getChildCount());
        for (int i2 = 0; i2 < this.inputFrame.getChildCount(); i2++) {
            View childAt = this.inputFrame.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.editText) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@InterfaceC6391 SparseArray<Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    @Override // android.view.View
    public void draw(@InterfaceC6391 Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.inDrawableStateChanged) {
            return;
        }
        this.inDrawableStateChanged = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        boolean state = collapsingTextHelper != null ? collapsingTextHelper.setState(drawableState) : false;
        if (this.editText != null) {
            updateLabelState(C8273.m27404(this) && isEnabled());
        }
        updateEditTextBackground();
        updateTextInputBoxState();
        if (state) {
            invalidate();
        }
        this.inDrawableStateChanged = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.editText;
        return editText != null ? editText.getBaseline() + getPaddingTop() + calculateLabelMarginTop() : super.getBaseline();
    }

    @InterfaceC6391
    public MaterialShapeDrawable getBoxBackground() {
        int i = this.boxBackgroundMode;
        if (i == 1 || i == 2) {
            return this.boxBackground;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.boxCollapsedPaddingTopPx;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return ViewUtils.isLayoutRtl(this) ? this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF) : this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        return ViewUtils.isLayoutRtl(this) ? this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF) : this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        return ViewUtils.isLayoutRtl(this) ? this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF) : this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopStart() {
        return ViewUtils.isLayoutRtl(this) ? this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF) : this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    @InterfaceC6490
    public ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    @InterfaceC6490
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.counterEnabled && this.counterOverflowed && (textView = this.counterView) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @InterfaceC6490
    public ColorStateList getCounterOverflowTextColor() {
        return this.counterOverflowTextColor;
    }

    @InterfaceC6490
    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    @InterfaceC6490
    @InterfaceC7113(29)
    public ColorStateList getCursorColor() {
        return this.cursorColor;
    }

    @InterfaceC6490
    @InterfaceC7113(29)
    public ColorStateList getCursorErrorColor() {
        return this.cursorErrorColor;
    }

    @InterfaceC6490
    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    @InterfaceC6490
    public EditText getEditText() {
        return this.editText;
    }

    @InterfaceC6490
    public CharSequence getEndIconContentDescription() {
        return this.endLayout.getEndIconContentDescription();
    }

    @InterfaceC6490
    public Drawable getEndIconDrawable() {
        return this.endLayout.getEndIconDrawable();
    }

    public int getEndIconMinSize() {
        return this.endLayout.getEndIconMinSize();
    }

    public int getEndIconMode() {
        return this.endLayout.getEndIconMode();
    }

    @InterfaceC6391
    public ImageView.ScaleType getEndIconScaleType() {
        return this.endLayout.getEndIconScaleType();
    }

    @InterfaceC6391
    public CheckableImageButton getEndIconView() {
        return this.endLayout.getEndIconView();
    }

    @InterfaceC6490
    public CharSequence getError() {
        if (this.indicatorViewController.isErrorEnabled()) {
            return this.indicatorViewController.getErrorText();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.indicatorViewController.getErrorAccessibilityLiveRegion();
    }

    @InterfaceC6490
    public CharSequence getErrorContentDescription() {
        return this.indicatorViewController.getErrorContentDescription();
    }

    @InterfaceC3897
    public int getErrorCurrentTextColors() {
        return this.indicatorViewController.getErrorViewCurrentTextColor();
    }

    @InterfaceC6490
    public Drawable getErrorIconDrawable() {
        return this.endLayout.getErrorIconDrawable();
    }

    @InterfaceC6490
    public CharSequence getHelperText() {
        if (this.indicatorViewController.isHelperTextEnabled()) {
            return this.indicatorViewController.getHelperText();
        }
        return null;
    }

    @InterfaceC3897
    public int getHelperTextCurrentTextColor() {
        return this.indicatorViewController.getHelperTextViewCurrentTextColor();
    }

    @InterfaceC6490
    public CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    @InterfaceC8392
    public final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.getCollapsedTextHeight();
    }

    @InterfaceC8392
    public final int getHintCurrentCollapsedTextColor() {
        return this.collapsingTextHelper.getCurrentCollapsedTextColor();
    }

    @InterfaceC6490
    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    @InterfaceC6391
    public LengthCounter getLengthCounter() {
        return this.lengthCounter;
    }

    public int getMaxEms() {
        return this.maxEms;
    }

    @InterfaceC6844
    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getMinEms() {
        return this.minEms;
    }

    @InterfaceC6844
    public int getMinWidth() {
        return this.minWidth;
    }

    @InterfaceC6490
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endLayout.getPasswordVisibilityToggleContentDescription();
    }

    @InterfaceC6490
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endLayout.getPasswordVisibilityToggleDrawable();
    }

    @InterfaceC6490
    public CharSequence getPlaceholderText() {
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        return null;
    }

    @InterfaceC7651
    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    @InterfaceC6490
    public ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    @InterfaceC6490
    public CharSequence getPrefixText() {
        return this.startLayout.getPrefixText();
    }

    @InterfaceC6490
    public ColorStateList getPrefixTextColor() {
        return this.startLayout.getPrefixTextColor();
    }

    @InterfaceC6391
    public TextView getPrefixTextView() {
        return this.startLayout.getPrefixTextView();
    }

    @InterfaceC6391
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @InterfaceC6490
    public CharSequence getStartIconContentDescription() {
        return this.startLayout.getStartIconContentDescription();
    }

    @InterfaceC6490
    public Drawable getStartIconDrawable() {
        return this.startLayout.getStartIconDrawable();
    }

    public int getStartIconMinSize() {
        return this.startLayout.getStartIconMinSize();
    }

    @InterfaceC6391
    public ImageView.ScaleType getStartIconScaleType() {
        return this.startLayout.getStartIconScaleType();
    }

    @InterfaceC6490
    public CharSequence getSuffixText() {
        return this.endLayout.getSuffixText();
    }

    @InterfaceC6490
    public ColorStateList getSuffixTextColor() {
        return this.endLayout.getSuffixTextColor();
    }

    @InterfaceC6391
    public TextView getSuffixTextView() {
        return this.endLayout.getSuffixTextView();
    }

    @InterfaceC6490
    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public boolean isEndIconCheckable() {
        return this.endLayout.isEndIconCheckable();
    }

    public boolean isEndIconVisible() {
        return this.endLayout.isEndIconVisible();
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.isErrorEnabled();
    }

    public boolean isExpandedHintEnabled() {
        return this.expandedHintEnabled;
    }

    @InterfaceC8392
    public final boolean isHelperTextDisplayed() {
        return this.indicatorViewController.helperTextIsDisplayed();
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.isHelperTextEnabled();
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    public final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endLayout.isPasswordVisibilityToggleEnabled();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public boolean isStartIconCheckable() {
        return this.startLayout.isStartIconCheckable();
    }

    public boolean isStartIconVisible() {
        return this.startLayout.isStartIconVisible();
    }

    @Override // android.view.View
    public void onConfigurationChanged(@InterfaceC6391 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.endLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.globalLayoutListenerAdded = false;
        boolean zUpdateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean zUpdateDummyDrawables = updateDummyDrawables();
        if (zUpdateEditTextHeightBasedOnIcon || zUpdateDummyDrawables) {
            this.editText.post(new Runnable() { // from class: Yue.ۥۢۡ۠ۤ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23289.lambda$onGlobalLayout$1();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.editText;
        if (editText != null) {
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(this, editText, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
                int gravity = this.editText.getGravity();
                this.collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
                this.collapsingTextHelper.setExpandedTextGravity(gravity);
                this.collapsingTextHelper.setCollapsedBounds(calculateCollapsedTextBounds(rect));
                this.collapsingTextHelper.setExpandedBounds(calculateExpandedTextBounds(rect));
                this.collapsingTextHelper.recalculate();
                if (!cutoutEnabled() || this.hintExpanded) {
                    return;
                }
                openCutout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.globalLayoutListenerAdded) {
            this.endLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.globalLayoutListenerAdded = true;
        }
        updatePlaceholderMeasurementsBasedOnEditText();
        this.endLayout.updateSuffixTextViewPadding();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@InterfaceC6490 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.error);
        if (savedState.isEndIconChecked) {
            post(new Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.2
                @Override // java.lang.Runnable
                public void run() {
                    TextInputLayout.this.endLayout.checkEndIcon();
                }
            });
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.areCornerRadiiRtl) {
            float cornerSize = this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize2 = this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
            ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setTopLeftCorner(this.shapeAppearanceModel.getTopRightCorner()).setTopRightCorner(this.shapeAppearanceModel.getTopLeftCorner()).setBottomLeftCorner(this.shapeAppearanceModel.getBottomRightCorner()).setBottomRightCorner(this.shapeAppearanceModel.getBottomLeftCorner()).setTopLeftCornerSize(cornerSize2).setTopRightCornerSize(cornerSize).setBottomLeftCornerSize(this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF)).setBottomRightCornerSize(this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF)).build();
            this.areCornerRadiiRtl = z;
            setShapeAppearanceModel(shapeAppearanceModelBuild);
        }
    }

    @Override // android.view.View
    @InterfaceC6490
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (shouldShowError()) {
            savedState.error = getError();
        }
        savedState.isEndIconChecked = this.endLayout.isEndIconChecked();
        return savedState;
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z) {
        this.endLayout.togglePasswordVisibilityToggle(z);
    }

    public void refreshEndIconDrawableState() {
        this.endLayout.refreshEndIconDrawableState();
    }

    public void refreshErrorIconDrawableState() {
        this.endLayout.refreshErrorIconDrawableState();
    }

    public void refreshStartIconDrawableState() {
        this.startLayout.refreshStartIconDrawableState();
    }

    public void removeOnEditTextAttachedListener(@InterfaceC6391 OnEditTextAttachedListener onEditTextAttachedListener) {
        this.editTextAttachedListeners.remove(onEditTextAttachedListener);
    }

    public void removeOnEndIconChangedListener(@InterfaceC6391 OnEndIconChangedListener onEndIconChangedListener) {
        this.endLayout.removeOnEndIconChangedListener(onEndIconChangedListener);
    }

    public void setBoxBackgroundColor(@InterfaceC3897 int i) {
        if (this.boxBackgroundColor != i) {
            this.boxBackgroundColor = i;
            this.defaultFilledBackgroundColor = i;
            this.focusedFilledBackgroundColor = i;
            this.hoveredFilledBackgroundColor = i;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(@InterfaceC3906 int i) {
        setBoxBackgroundColor(C4187.m12060(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(@InterfaceC6391 ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        applyBoxAttributes();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.boxBackgroundMode) {
            return;
        }
        this.boxBackgroundMode = i;
        if (this.editText != null) {
            onApplyBoxBackgroundMode();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.boxCollapsedPaddingTopPx = i;
    }

    public void setBoxCornerFamily(int i) {
        this.shapeAppearanceModel = this.shapeAppearanceModel.toBuilder().setTopLeftCorner(i, this.shapeAppearanceModel.getTopLeftCornerSize()).setTopRightCorner(i, this.shapeAppearanceModel.getTopRightCornerSize()).setBottomLeftCorner(i, this.shapeAppearanceModel.getBottomLeftCornerSize()).setBottomRightCorner(i, this.shapeAppearanceModel.getBottomRightCornerSize()).build();
        applyBoxAttributes();
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        this.areCornerRadiiRtl = zIsLayoutRtl;
        float f5 = zIsLayoutRtl ? f2 : f;
        if (!zIsLayoutRtl) {
            f = f2;
        }
        float f6 = zIsLayoutRtl ? f4 : f3;
        if (!zIsLayoutRtl) {
            f3 = f4;
        }
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable != null && materialShapeDrawable.getTopLeftCornerResolvedSize() == f5 && this.boxBackground.getTopRightCornerResolvedSize() == f && this.boxBackground.getBottomLeftCornerResolvedSize() == f6 && this.boxBackground.getBottomRightCornerResolvedSize() == f3) {
            return;
        }
        this.shapeAppearanceModel = this.shapeAppearanceModel.toBuilder().setTopLeftCornerSize(f5).setTopRightCornerSize(f).setBottomLeftCornerSize(f6).setBottomRightCornerSize(f3).build();
        applyBoxAttributes();
    }

    public void setBoxCornerRadiiResources(@InterfaceC4398 int i, @InterfaceC4398 int i2, @InterfaceC4398 int i3, @InterfaceC4398 int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(@InterfaceC3897 int i) {
        if (this.focusedStrokeColor != i) {
            this.focusedStrokeColor = i;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeColorStateList(@InterfaceC6391 ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.defaultStrokeColor = colorStateList.getDefaultColor();
            this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.focusedStrokeColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
            this.focusedStrokeColor = colorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.strokeErrorColor != colorStateList) {
            this.strokeErrorColor = colorStateList;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.boxStrokeWidthDefaultPx = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.boxStrokeWidthFocusedPx = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocusedResource(@InterfaceC4398 int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(@InterfaceC4398 int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.counterEnabled != z) {
            if (z) {
                C3343 c3343 = new C3343(getContext());
                this.counterView = c3343;
                c3343.setId(C1980R.id.textinput_counter);
                Typeface typeface = this.typeface;
                if (typeface != null) {
                    this.counterView.setTypeface(typeface);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.addIndicator(this.counterView, 2);
                C5946.m18704((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams(), getResources().getDimensionPixelOffset(C1980R.dimen.mtrl_textinput_counter_margin_start));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.removeIndicator(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.counterMaxLength != i) {
            if (i > 0) {
                this.counterMaxLength = i;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.counterOverflowTextAppearance != i) {
            this.counterOverflowTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.counterTextAppearance != i) {
            this.counterTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    @InterfaceC7113(29)
    public void setCursorColor(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.cursorColor != colorStateList) {
            this.cursorColor = colorStateList;
            updateCursorColor();
        }
    }

    @InterfaceC7113(29)
    public void setCursorErrorColor(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.cursorErrorColor != colorStateList) {
            this.cursorErrorColor = colorStateList;
            if (isOnError()) {
                updateCursorColor();
            }
        }
    }

    public void setDefaultHintTextColor(@InterfaceC6490 ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        recursiveSetEnabled(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.endLayout.setEndIconActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.endLayout.setEndIconCheckable(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconContentDescription(@InterfaceC7613 int i) {
        this.endLayout.setEndIconContentDescription(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconDrawable(@InterfaceC4525 int i) {
        this.endLayout.setEndIconDrawable(i);
    }

    public void setEndIconMinSize(@InterfaceC5459(from = 0) int i) {
        this.endLayout.setEndIconMinSize(i);
    }

    public void setEndIconMode(int i) {
        this.endLayout.setEndIconMode(i);
    }

    public void setEndIconOnClickListener(@InterfaceC6490 View.OnClickListener onClickListener) {
        this.endLayout.setEndIconOnClickListener(onClickListener);
    }

    public void setEndIconOnLongClickListener(@InterfaceC6490 View.OnLongClickListener onLongClickListener) {
        this.endLayout.setEndIconOnLongClickListener(onLongClickListener);
    }

    public void setEndIconScaleType(@InterfaceC6391 ImageView.ScaleType scaleType) {
        this.endLayout.setEndIconScaleType(scaleType);
    }

    public void setEndIconTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.endLayout.setEndIconTintList(colorStateList);
    }

    public void setEndIconTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        this.endLayout.setEndIconTintMode(mode);
    }

    public void setEndIconVisible(boolean z) {
        this.endLayout.setEndIconVisible(z);
    }

    public void setError(@InterfaceC6490 CharSequence charSequence) {
        if (!this.indicatorViewController.isErrorEnabled()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.indicatorViewController.hideError();
        } else {
            this.indicatorViewController.showError(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        this.indicatorViewController.setErrorAccessibilityLiveRegion(i);
    }

    public void setErrorContentDescription(@InterfaceC6490 CharSequence charSequence) {
        this.indicatorViewController.setErrorContentDescription(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.indicatorViewController.setErrorEnabled(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorIconDrawable(@InterfaceC4525 int i) {
        this.endLayout.setErrorIconDrawable(i);
    }

    public void setErrorIconOnClickListener(@InterfaceC6490 View.OnClickListener onClickListener) {
        this.endLayout.setErrorIconOnClickListener(onClickListener);
    }

    public void setErrorIconOnLongClickListener(@InterfaceC6490 View.OnLongClickListener onLongClickListener) {
        this.endLayout.setErrorIconOnLongClickListener(onLongClickListener);
    }

    public void setErrorIconTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.endLayout.setErrorIconTintList(colorStateList);
    }

    public void setErrorIconTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        this.endLayout.setErrorIconTintMode(mode);
    }

    public void setErrorTextAppearance(@InterfaceC7651 int i) {
        this.indicatorViewController.setErrorTextAppearance(i);
    }

    public void setErrorTextColor(@InterfaceC6490 ColorStateList colorStateList) {
        this.indicatorViewController.setErrorViewTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.expandedHintEnabled != z) {
            this.expandedHintEnabled = z;
            updateLabelState(false);
        }
    }

    public void setHelperText(@InterfaceC6490 CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!isHelperTextEnabled()) {
                setHelperTextEnabled(true);
            }
            this.indicatorViewController.showHelper(charSequence);
        }
    }

    public void setHelperTextColor(@InterfaceC6490 ColorStateList colorStateList) {
        this.indicatorViewController.setHelperTextViewTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.indicatorViewController.setHelperTextEnabled(z);
    }

    public void setHelperTextTextAppearance(@InterfaceC7651 int i) {
        this.indicatorViewController.setHelperTextAppearance(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHint(@InterfaceC6490 CharSequence charSequence) {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.hintAnimationEnabled = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.hintEnabled) {
            this.hintEnabled = z;
            if (z) {
                CharSequence hint = this.editText.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            } else {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal(null);
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintTextAppearance(@InterfaceC7651 int i) {
        this.collapsingTextHelper.setCollapsedTextAppearance(i);
        this.focusedTextColor = this.collapsingTextHelper.getCollapsedTextColor();
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    public void setLengthCounter(@InterfaceC6391 LengthCounter lengthCounter) {
        this.lengthCounter = lengthCounter;
    }

    public void setMaxEms(int i) {
        this.maxEms = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(@InterfaceC6844 int i) {
        this.maxWidth = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(@InterfaceC4398 int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.minEms = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(@InterfaceC6844 int i) {
        this.minWidth = i;
        EditText editText = this.editText;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(@InterfaceC4398 int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@InterfaceC7613 int i) {
        this.endLayout.setPasswordVisibilityToggleContentDescription(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@InterfaceC4525 int i) {
        this.endLayout.setPasswordVisibilityToggleDrawable(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.endLayout.setPasswordVisibilityToggleEnabled(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.endLayout.setPasswordVisibilityToggleTintList(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        this.endLayout.setPasswordVisibilityToggleTintMode(mode);
    }

    public void setPlaceholderText(@InterfaceC6490 CharSequence charSequence) {
        if (this.placeholderTextView == null) {
            C3343 c3343 = new C3343(getContext());
            this.placeholderTextView = c3343;
            c3343.setId(C1980R.id.textinput_placeholder);
            C8273.m27457(this.placeholderTextView, 2);
            C4786 c4786CreatePlaceholderFadeTransition = createPlaceholderFadeTransition();
            this.placeholderFadeIn = c4786CreatePlaceholderFadeTransition;
            c4786CreatePlaceholderFadeTransition.setStartDelay(67L);
            this.placeholderFadeOut = createPlaceholderFadeTransition();
            setPlaceholderTextAppearance(this.placeholderTextAppearance);
            setPlaceholderTextColor(this.placeholderTextColor);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = charSequence;
        }
        updatePlaceholderText();
    }

    public void setPlaceholderTextAppearance(@InterfaceC7651 int i) {
        this.placeholderTextAppearance = i;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            C7759.m24676(textView, i);
        }
    }

    public void setPlaceholderTextColor(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.placeholderTextColor != colorStateList) {
            this.placeholderTextColor = colorStateList;
            TextView textView = this.placeholderTextView;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@InterfaceC6490 CharSequence charSequence) {
        this.startLayout.setPrefixText(charSequence);
    }

    public void setPrefixTextAppearance(@InterfaceC7651 int i) {
        this.startLayout.setPrefixTextAppearance(i);
    }

    public void setPrefixTextColor(@InterfaceC6391 ColorStateList colorStateList) {
        this.startLayout.setPrefixTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@InterfaceC6391 ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null || materialShapeDrawable.getShapeAppearanceModel() == shapeAppearanceModel) {
            return;
        }
        this.shapeAppearanceModel = shapeAppearanceModel;
        applyBoxAttributes();
    }

    public void setStartIconCheckable(boolean z) {
        this.startLayout.setStartIconCheckable(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartIconContentDescription(@InterfaceC7613 int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartIconDrawable(@InterfaceC4525 int i) {
        setStartIconDrawable(i != 0 ? C3323.m396(getContext(), i) : null);
    }

    public void setStartIconMinSize(@InterfaceC5459(from = 0) int i) {
        this.startLayout.setStartIconMinSize(i);
    }

    public void setStartIconOnClickListener(@InterfaceC6490 View.OnClickListener onClickListener) {
        this.startLayout.setStartIconOnClickListener(onClickListener);
    }

    public void setStartIconOnLongClickListener(@InterfaceC6490 View.OnLongClickListener onLongClickListener) {
        this.startLayout.setStartIconOnLongClickListener(onLongClickListener);
    }

    public void setStartIconScaleType(@InterfaceC6391 ImageView.ScaleType scaleType) {
        this.startLayout.setStartIconScaleType(scaleType);
    }

    public void setStartIconTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.startLayout.setStartIconTintList(colorStateList);
    }

    public void setStartIconTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        this.startLayout.setStartIconTintMode(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.startLayout.setStartIconVisible(z);
    }

    public void setSuffixText(@InterfaceC6490 CharSequence charSequence) {
        this.endLayout.setSuffixText(charSequence);
    }

    public void setSuffixTextAppearance(@InterfaceC7651 int i) {
        this.endLayout.setSuffixTextAppearance(i);
    }

    public void setSuffixTextColor(@InterfaceC6391 ColorStateList colorStateList) {
        this.endLayout.setSuffixTextColor(colorStateList);
    }

    public void setTextAppearanceCompatWithErrorFallback(@InterfaceC6391 TextView textView, @InterfaceC7651 int i) {
        try {
            C7759.m24676(textView, i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        C7759.m24676(textView, C1980R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(C4187.m12060(getContext(), C1980R.color.design_error));
    }

    public void setTextInputAccessibilityDelegate(@InterfaceC6490 AccessibilityDelegate accessibilityDelegate) {
        EditText editText = this.editText;
        if (editText != null) {
            C8273.m27439(editText, accessibilityDelegate);
        }
    }

    public void setTypeface(@InterfaceC6490 Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            this.collapsingTextHelper.setTypefaces(typeface);
            this.indicatorViewController.setTypefaces(typeface);
            TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public boolean shouldShowError() {
        return this.indicatorViewController.errorShouldBeShown();
    }

    public boolean updateDummyDrawables() {
        boolean z;
        if (this.editText == null) {
            return false;
        }
        boolean z2 = true;
        if (shouldUpdateStartDummyDrawable()) {
            int measuredWidth = this.startLayout.getMeasuredWidth() - this.editText.getPaddingLeft();
            if (this.startDummyDrawable == null || this.startDummyDrawableWidth != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.startDummyDrawable = colorDrawable;
                this.startDummyDrawableWidth = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrM24654 = C7759.m24654(this.editText);
            Drawable drawable = drawableArrM24654[0];
            Drawable drawable2 = this.startDummyDrawable;
            if (drawable != drawable2) {
                C7759.m24667(this.editText, drawable2, drawableArrM24654[1], drawableArrM24654[2], drawableArrM24654[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.startDummyDrawable != null) {
                Drawable[] drawableArrM246542 = C7759.m24654(this.editText);
                C7759.m24667(this.editText, null, drawableArrM246542[1], drawableArrM246542[2], drawableArrM246542[3]);
                this.startDummyDrawable = null;
                z = true;
            }
            z = false;
        }
        if (shouldUpdateEndDummyDrawable()) {
            int measuredWidth2 = this.endLayout.getSuffixTextView().getMeasuredWidth() - this.editText.getPaddingRight();
            CheckableImageButton currentEndIconView = this.endLayout.getCurrentEndIconView();
            if (currentEndIconView != null) {
                measuredWidth2 = measuredWidth2 + currentEndIconView.getMeasuredWidth() + C5946.m18699((ViewGroup.MarginLayoutParams) currentEndIconView.getLayoutParams());
            }
            Drawable[] drawableArrM246543 = C7759.m24654(this.editText);
            Drawable drawable3 = this.endDummyDrawable;
            if (drawable3 == null || this.endDummyDrawableWidth == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.endDummyDrawable = colorDrawable2;
                    this.endDummyDrawableWidth = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrM246543[2];
                Drawable drawable5 = this.endDummyDrawable;
                if (drawable4 != drawable5) {
                    this.originalEditTextEndDrawable = drawable4;
                    C7759.m24667(this.editText, drawableArrM246543[0], drawableArrM246543[1], drawable5, drawableArrM246543[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.endDummyDrawableWidth = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                C7759.m24667(this.editText, drawableArrM246543[0], drawableArrM246543[1], this.endDummyDrawable, drawableArrM246543[3]);
            }
        } else {
            if (this.endDummyDrawable == null) {
                return z;
            }
            Drawable[] drawableArrM246544 = C7759.m24654(this.editText);
            if (drawableArrM246544[2] == this.endDummyDrawable) {
                C7759.m24667(this.editText, drawableArrM246544[0], drawableArrM246544[1], this.originalEditTextEndDrawable, drawableArrM246544[3]);
            } else {
                z2 = z;
            }
            this.endDummyDrawable = null;
        }
        return z2;
    }

    public void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        EditText editText = this.editText;
        if (editText == null || this.boxBackgroundMode != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (C4533.m1468(background)) {
            background = background.mutate();
        }
        if (shouldShowError()) {
            background.setColorFilter(C3304.m6742(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            background.setColorFilter(C3304.m6742(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            C4520.m13224(background);
            this.editText.refreshDrawableState();
        }
    }

    public void updateEditTextBoxBackgroundIfNeeded() {
        EditText editText = this.editText;
        if (editText == null || this.boxBackground == null) {
            return;
        }
        if ((this.boxBackgroundApplied || editText.getBackground() == null) && this.boxBackgroundMode != 0) {
            updateEditTextBoxBackground();
            this.boxBackgroundApplied = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void updateLabelState(boolean z) {
        updateLabelState(z, false);
    }

    public void updateTextInputBoxState() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.boxBackground == null || this.boxBackgroundMode == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.editText) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.editText) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.boxStrokeColor = this.disabledColor;
        } else if (shouldShowError()) {
            if (this.strokeErrorColor != null) {
                updateStrokeErrorColor(z2, z);
            } else {
                this.boxStrokeColor = getErrorCurrentTextColors();
            }
        } else if (!this.counterOverflowed || (textView = this.counterView) == null) {
            if (z2) {
                this.boxStrokeColor = this.focusedStrokeColor;
            } else if (z) {
                this.boxStrokeColor = this.hoveredStrokeColor;
            } else {
                this.boxStrokeColor = this.defaultStrokeColor;
            }
        } else if (this.strokeErrorColor != null) {
            updateStrokeErrorColor(z2, z);
        } else {
            this.boxStrokeColor = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            updateCursorColor();
        }
        this.endLayout.onTextInputBoxStateUpdated();
        refreshStartIconDrawableState();
        if (this.boxBackgroundMode == 2) {
            int i = this.boxStrokeWidthPx;
            if (z2 && isEnabled()) {
                this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
            } else {
                this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
            }
            if (this.boxStrokeWidthPx != i) {
                recalculateCutout();
            }
        }
        if (this.boxBackgroundMode == 1) {
            if (!isEnabled()) {
                this.boxBackgroundColor = this.disabledFilledBackgroundColor;
            } else if (z && !z2) {
                this.boxBackgroundColor = this.hoveredFilledBackgroundColor;
            } else if (z2) {
                this.boxBackgroundColor = this.focusedFilledBackgroundColor;
            } else {
                this.boxBackgroundColor = this.defaultFilledBackgroundColor;
            }
        }
        applyBoxAttributes();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public TextInputLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.textInputStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private void updateLabelState(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.editText;
        boolean z3 = false;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.editText;
        if (editText2 != null && editText2.hasFocus()) {
            z3 = true;
        }
        ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.defaultHintTextColor;
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.disabledColor) : this.disabledColor));
        } else if (shouldShowError()) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(this.indicatorViewController.getErrorViewTextColors());
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(textView.getTextColors());
        } else if (z3 && (colorStateList = this.focusedTextColor) != null) {
            this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
        }
        if (z4 || !this.expandedHintEnabled || (isEnabled() && z3)) {
            if (z2 || this.hintExpanded) {
                collapseHint(z);
                return;
            }
            return;
        }
        if (z2 || !this.hintExpanded) {
            expandHint(z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaceholderText(@InterfaceC6490 Editable editable) {
        if (this.lengthCounter.countLength(editable) != 0 || this.hintExpanded) {
            hidePlaceholderText();
        } else {
            showPlaceholderText();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setEndIconContentDescription(@InterfaceC6490 CharSequence charSequence) {
        this.endLayout.setEndIconContentDescription(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setEndIconDrawable(@InterfaceC6490 Drawable drawable) {
        this.endLayout.setEndIconDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setErrorIconDrawable(@InterfaceC6490 Drawable drawable) {
        this.endLayout.setErrorIconDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@InterfaceC6490 CharSequence charSequence) {
        this.endLayout.setPasswordVisibilityToggleContentDescription(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@InterfaceC6490 Drawable drawable) {
        this.endLayout.setPasswordVisibilityToggleDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setStartIconContentDescription(@InterfaceC6490 CharSequence charSequence) {
        this.startLayout.setStartIconContentDescription(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setStartIconDrawable(@InterfaceC6490 Drawable drawable) {
        this.startLayout.setStartIconDrawable(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.minEms = -1;
        this.maxEms = -1;
        this.minWidth = -1;
        this.maxWidth = -1;
        this.indicatorViewController = new IndicatorViewController(this);
        this.lengthCounter = new LengthCounter() { // from class: Yue.ۥۢۡ۠ۥ
            @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
            public final int countLength(Editable editable) {
                return TextInputLayout.lambda$new$0(editable);
            }
        };
        this.tmpRect = new Rect();
        this.tmpBoundsRect = new Rect();
        this.tmpRectF = new RectF();
        this.editTextAttachedListeners = new LinkedHashSet<>();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.collapsingTextHelper = collapsingTextHelper;
        this.globalLayoutListenerAdded = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.inputFrame = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        collapsingTextHelper.setTextSizeInterpolator(timeInterpolator);
        collapsingTextHelper.setPositionInterpolator(timeInterpolator);
        collapsingTextHelper.setCollapsedTextGravity(8388659);
        C7837 c7837ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C1980R.styleable.TextInputLayout, i, i2, C1980R.styleable.TextInputLayout_counterTextAppearance, C1980R.styleable.TextInputLayout_counterOverflowTextAppearance, C1980R.styleable.TextInputLayout_errorTextAppearance, C1980R.styleable.TextInputLayout_helperTextTextAppearance, C1980R.styleable.TextInputLayout_hintTextAppearance);
        StartCompoundLayout startCompoundLayout = new StartCompoundLayout(this, c7837ObtainTintedStyledAttributes);
        this.startLayout = startCompoundLayout;
        this.hintEnabled = c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.TextInputLayout_hintEnabled, true);
        setHint(c7837ObtainTintedStyledAttributes.m24891(C1980R.styleable.TextInputLayout_android_hint));
        this.hintAnimationEnabled = c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.TextInputLayout_hintAnimationEnabled, true);
        this.expandedHintEnabled = c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.TextInputLayout_expandedHintEnabled, true);
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.TextInputLayout_android_minEms)) {
            setMinEms(c7837ObtainTintedStyledAttributes.m24882(C1980R.styleable.TextInputLayout_android_minEms, -1));
        } else if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.TextInputLayout_android_minWidth)) {
            setMinWidth(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.TextInputLayout_android_minWidth, -1));
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.TextInputLayout_android_maxEms)) {
            setMaxEms(c7837ObtainTintedStyledAttributes.m24882(C1980R.styleable.TextInputLayout_android_maxEms, -1));
        } else if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.TextInputLayout_android_maxWidth)) {
            setMaxWidth(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.TextInputLayout_android_maxWidth, -1));
        }
        this.shapeAppearanceModel = ShapeAppearanceModel.builder(context2, attributeSet, i, i2).build();
        this.boxLabelCutoutPaddingPx = context2.getResources().getDimensionPixelOffset(C1980R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.boxCollapsedPaddingTopPx = c7837ObtainTintedStyledAttributes.m24873(C1980R.styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.boxStrokeWidthDefaultPx = c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(C1980R.dimen.mtrl_textinput_box_stroke_width_default));
        this.boxStrokeWidthFocusedPx = c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(C1980R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
        float fM24872 = c7837ObtainTintedStyledAttributes.m24872(C1980R.styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float fM248722 = c7837ObtainTintedStyledAttributes.m24872(C1980R.styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float fM248723 = c7837ObtainTintedStyledAttributes.m24872(C1980R.styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float fM248724 = c7837ObtainTintedStyledAttributes.m24872(C1980R.styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
        if (fM24872 >= 0.0f) {
            builder.setTopLeftCornerSize(fM24872);
        }
        if (fM248722 >= 0.0f) {
            builder.setTopRightCornerSize(fM248722);
        }
        if (fM248723 >= 0.0f) {
            builder.setBottomRightCornerSize(fM248723);
        }
        if (fM248724 >= 0.0f) {
            builder.setBottomLeftCornerSize(fM248724);
        }
        this.shapeAppearanceModel = builder.build();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, c7837ObtainTintedStyledAttributes, C1980R.styleable.TextInputLayout_boxBackgroundColor);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            this.defaultFilledBackgroundColor = defaultColor;
            this.boxBackgroundColor = defaultColor;
            if (colorStateList.isStateful()) {
                this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.focusedFilledBackgroundColor = this.defaultFilledBackgroundColor;
                ColorStateList colorStateListM395 = C3323.m395(context2, C1980R.color.mtrl_filled_background_color);
                this.disabledFilledBackgroundColor = colorStateListM395.getColorForState(new int[]{-16842910}, -1);
                this.hoveredFilledBackgroundColor = colorStateListM395.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.boxBackgroundColor = 0;
            this.defaultFilledBackgroundColor = 0;
            this.disabledFilledBackgroundColor = 0;
            this.focusedFilledBackgroundColor = 0;
            this.hoveredFilledBackgroundColor = 0;
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateListM24871 = c7837ObtainTintedStyledAttributes.m24871(C1980R.styleable.TextInputLayout_android_textColorHint);
            this.focusedTextColor = colorStateListM24871;
            this.defaultHintTextColor = colorStateListM24871;
        }
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context2, c7837ObtainTintedStyledAttributes, C1980R.styleable.TextInputLayout_boxStrokeColor);
        this.focusedStrokeColor = c7837ObtainTintedStyledAttributes.m24870(C1980R.styleable.TextInputLayout_boxStrokeColor, 0);
        this.defaultStrokeColor = C4187.m12060(context2, C1980R.color.mtrl_textinput_default_box_stroke_color);
        this.disabledColor = C4187.m12060(context2, C1980R.color.mtrl_textinput_disabled_color);
        this.hoveredStrokeColor = C4187.m12060(context2, C1980R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateList2 != null) {
            setBoxStrokeColorStateList(colorStateList2);
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(MaterialResources.getColorStateList(context2, c7837ObtainTintedStyledAttributes, C1980R.styleable.TextInputLayout_boxStrokeErrorColor));
        }
        if (c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.TextInputLayout_hintTextAppearance, 0));
        }
        this.cursorColor = c7837ObtainTintedStyledAttributes.m24871(C1980R.styleable.TextInputLayout_cursorColor);
        this.cursorErrorColor = c7837ObtainTintedStyledAttributes.m24871(C1980R.styleable.TextInputLayout_cursorErrorColor);
        int iM24888 = c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.TextInputLayout_errorTextAppearance, 0);
        CharSequence charSequenceM24891 = c7837ObtainTintedStyledAttributes.m24891(C1980R.styleable.TextInputLayout_errorContentDescription);
        int iM24882 = c7837ObtainTintedStyledAttributes.m24882(C1980R.styleable.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean zM3933 = c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.TextInputLayout_errorEnabled, false);
        int iM248882 = c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.TextInputLayout_helperTextTextAppearance, 0);
        boolean zM39332 = c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.TextInputLayout_helperTextEnabled, false);
        CharSequence charSequenceM248912 = c7837ObtainTintedStyledAttributes.m24891(C1980R.styleable.TextInputLayout_helperText);
        int iM248883 = c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence charSequenceM248913 = c7837ObtainTintedStyledAttributes.m24891(C1980R.styleable.TextInputLayout_placeholderText);
        boolean zM39333 = c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(c7837ObtainTintedStyledAttributes.m24882(C1980R.styleable.TextInputLayout_counterMaxLength, -1));
        this.counterTextAppearance = c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.TextInputLayout_counterTextAppearance, 0);
        this.counterOverflowTextAppearance = c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
        setBoxBackgroundMode(c7837ObtainTintedStyledAttributes.m24882(C1980R.styleable.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(charSequenceM24891);
        setErrorAccessibilityLiveRegion(iM24882);
        setCounterOverflowTextAppearance(this.counterOverflowTextAppearance);
        setHelperTextTextAppearance(iM248882);
        setErrorTextAppearance(iM24888);
        setCounterTextAppearance(this.counterTextAppearance);
        setPlaceholderText(charSequenceM248913);
        setPlaceholderTextAppearance(iM248883);
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.TextInputLayout_errorTextColor)) {
            setErrorTextColor(c7837ObtainTintedStyledAttributes.m24871(C1980R.styleable.TextInputLayout_errorTextColor));
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(c7837ObtainTintedStyledAttributes.m24871(C1980R.styleable.TextInputLayout_helperTextTextColor));
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.TextInputLayout_hintTextColor)) {
            setHintTextColor(c7837ObtainTintedStyledAttributes.m24871(C1980R.styleable.TextInputLayout_hintTextColor));
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.TextInputLayout_counterTextColor)) {
            setCounterTextColor(c7837ObtainTintedStyledAttributes.m24871(C1980R.styleable.TextInputLayout_counterTextColor));
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(c7837ObtainTintedStyledAttributes.m24871(C1980R.styleable.TextInputLayout_counterOverflowTextColor));
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(c7837ObtainTintedStyledAttributes.m24871(C1980R.styleable.TextInputLayout_placeholderTextColor));
        }
        EndCompoundLayout endCompoundLayout = new EndCompoundLayout(this, c7837ObtainTintedStyledAttributes);
        this.endLayout = endCompoundLayout;
        boolean zM39334 = c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.TextInputLayout_android_enabled, true);
        c7837ObtainTintedStyledAttributes.m24899();
        C8273.m27457(this, 2);
        C8273.m27459(this, 1);
        frameLayout.addView(startCompoundLayout);
        frameLayout.addView(endCompoundLayout);
        addView(frameLayout);
        setEnabled(zM39334);
        setHelperTextEnabled(zM39332);
        setErrorEnabled(zM3933);
        setCounterEnabled(zM39333);
        setHelperText(charSequenceM248912);
    }

    public void updateCounter(@InterfaceC6490 Editable editable) {
        int iCountLength = this.lengthCounter.countLength(editable);
        boolean z = this.counterOverflowed;
        int i = this.counterMaxLength;
        if (i == -1) {
            this.counterView.setText(String.valueOf(iCountLength));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = iCountLength > i;
            updateCounterContentDescription(getContext(), this.counterView, iCountLength, this.counterMaxLength, this.counterOverflowed);
            if (z != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            this.counterView.setText(C3530.m9457().m9471(getContext().getString(C1980R.string.character_counter_pattern, Integer.valueOf(iCountLength), Integer.valueOf(this.counterMaxLength))));
        }
        if (this.editText == null || z == this.counterOverflowed) {
            return;
        }
        updateLabelState(false);
        updateTextInputBoxState();
        updateEditTextBackground();
    }

    public void setHint(@InterfaceC7613 int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
