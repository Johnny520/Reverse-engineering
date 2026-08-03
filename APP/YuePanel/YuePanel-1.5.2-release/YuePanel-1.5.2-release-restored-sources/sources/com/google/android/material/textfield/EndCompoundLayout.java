package com.google.android.material.textfield;

import Yue.C3026;
import Yue.C3323;
import Yue.C3343;
import Yue.C4520;
import Yue.C5946;
import Yue.C7759;
import Yue.C7837;
import Yue.C8273;
import Yue.InterfaceC4525;
import Yue.InterfaceC5411;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7613;
import Yue.InterfaceC7651;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.C1980R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
class EndCompoundLayout extends LinearLayout {

    @InterfaceC6490
    private final AccessibilityManager accessibilityManager;
    private EditText editText;
    private final TextWatcher editTextWatcher;
    private final LinkedHashSet<TextInputLayout.OnEndIconChangedListener> endIconChangedListeners;
    private final EndIconDelegates endIconDelegates;

    @InterfaceC6391
    private final FrameLayout endIconFrame;
    private int endIconMinSize;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;

    @InterfaceC6391
    private ImageView.ScaleType endIconScaleType;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;

    @InterfaceC6391
    private final CheckableImageButton endIconView;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private PorterDuff.Mode errorIconTintMode;

    @InterfaceC6391
    private final CheckableImageButton errorIconView;
    private boolean hintExpanded;
    private final TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;

    @InterfaceC6490
    private CharSequence suffixText;

    @InterfaceC6391
    private final TextView suffixTextView;
    final TextInputLayout textInputLayout;

    @InterfaceC6490
    private C3026.InterfaceC3029 touchExplorationStateChangeListener;

    public static class EndIconDelegates {
        private final int customEndIconDrawableId;
        private final SparseArray<EndIconDelegate> delegates = new SparseArray<>();
        private final EndCompoundLayout endLayout;
        private final int passwordIconDrawableId;

        public EndIconDelegates(EndCompoundLayout endCompoundLayout, C7837 c7837) {
            this.endLayout = endCompoundLayout;
            this.customEndIconDrawableId = c7837.m24888(C1980R.styleable.TextInputLayout_endIconDrawable, 0);
            this.passwordIconDrawableId = c7837.m24888(C1980R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }

        private EndIconDelegate create(int i) {
            if (i == -1) {
                return new CustomEndIconDelegate(this.endLayout);
            }
            if (i == 0) {
                return new NoEndIconDelegate(this.endLayout);
            }
            if (i == 1) {
                return new PasswordToggleEndIconDelegate(this.endLayout, this.passwordIconDrawableId);
            }
            if (i == 2) {
                return new ClearTextEndIconDelegate(this.endLayout);
            }
            if (i == 3) {
                return new DropdownMenuEndIconDelegate(this.endLayout);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i);
        }

        public EndIconDelegate get(int i) {
            EndIconDelegate endIconDelegate = this.delegates.get(i);
            if (endIconDelegate != null) {
                return endIconDelegate;
            }
            EndIconDelegate endIconDelegateCreate = create(i);
            this.delegates.append(i, endIconDelegateCreate);
            return endIconDelegateCreate;
        }
    }

    public EndCompoundLayout(TextInputLayout textInputLayout, C7837 c7837) {
        super(textInputLayout.getContext());
        this.endIconMode = 0;
        this.endIconChangedListeners = new LinkedHashSet<>();
        this.editTextWatcher = new TextWatcherAdapter() { // from class: com.google.android.material.textfield.EndCompoundLayout.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                EndCompoundLayout.this.getEndIconDelegate().afterEditTextChanged(editable);
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                EndCompoundLayout.this.getEndIconDelegate().beforeEditTextChanged(charSequence, i, i2, i3);
            }
        };
        TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.2
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(@InterfaceC6391 TextInputLayout textInputLayout2) {
                if (EndCompoundLayout.this.editText == textInputLayout2.getEditText()) {
                    return;
                }
                if (EndCompoundLayout.this.editText != null) {
                    EndCompoundLayout.this.editText.removeTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                    if (EndCompoundLayout.this.editText.getOnFocusChangeListener() == EndCompoundLayout.this.getEndIconDelegate().getOnEditTextFocusChangeListener()) {
                        EndCompoundLayout.this.editText.setOnFocusChangeListener(null);
                    }
                }
                EndCompoundLayout.this.editText = textInputLayout2.getEditText();
                if (EndCompoundLayout.this.editText != null) {
                    EndCompoundLayout.this.editText.addTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                }
                EndCompoundLayout.this.getEndIconDelegate().onEditTextAttached(EndCompoundLayout.this.editText);
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                endCompoundLayout.setOnFocusChangeListenersIfNeeded(endCompoundLayout.getEndIconDelegate());
            }
        };
        this.onEditTextAttachedListener = onEditTextAttachedListener;
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.endIconFrame = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonCreateIconView = createIconView(this, layoutInflaterFrom, C1980R.id.text_input_error_icon);
        this.errorIconView = checkableImageButtonCreateIconView;
        CheckableImageButton checkableImageButtonCreateIconView2 = createIconView(frameLayout, layoutInflaterFrom, C1980R.id.text_input_end_icon);
        this.endIconView = checkableImageButtonCreateIconView2;
        this.endIconDelegates = new EndIconDelegates(this, c7837);
        C3343 c3343 = new C3343(getContext());
        this.suffixTextView = c3343;
        initErrorIconView(c7837);
        initEndIconView(c7837);
        initSuffixTextView(c7837);
        frameLayout.addView(checkableImageButtonCreateIconView2);
        addView(c3343);
        addView(frameLayout);
        addView(checkableImageButtonCreateIconView);
        textInputLayout.addOnEditTextAttachedListener(onEditTextAttachedListener);
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                EndCompoundLayout.this.addTouchExplorationStateChangeListenerIfNeeded();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                EndCompoundLayout.this.removeTouchExplorationStateChangeListenerIfNeeded();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTouchExplorationStateChangeListenerIfNeeded() {
        if (this.touchExplorationStateChangeListener == null || this.accessibilityManager == null || !C8273.m27397(this)) {
            return;
        }
        C3026.m92(this.accessibilityManager, this.touchExplorationStateChangeListener);
    }

    private CheckableImageButton createIconView(ViewGroup viewGroup, LayoutInflater layoutInflater, @InterfaceC5411 int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C1980R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            C5946.m18704((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void dispatchOnEndIconChanged(int i) {
        Iterator<TextInputLayout.OnEndIconChangedListener> it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEndIconChanged(this.textInputLayout, i);
        }
    }

    private int getIconResId(EndIconDelegate endIconDelegate) {
        int i = this.endIconDelegates.customEndIconDrawableId;
        return i == 0 ? endIconDelegate.getIconDrawableResId() : i;
    }

    private void initEndIconView(C7837 c7837) {
        if (!c7837.m24896(C1980R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (c7837.m24896(C1980R.styleable.TextInputLayout_endIconTint)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), c7837, C1980R.styleable.TextInputLayout_endIconTint);
            }
            if (c7837.m24896(C1980R.styleable.TextInputLayout_endIconTintMode)) {
                this.endIconTintMode = ViewUtils.parseTintMode(c7837.m24882(C1980R.styleable.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (c7837.m24896(C1980R.styleable.TextInputLayout_endIconMode)) {
            setEndIconMode(c7837.m24882(C1980R.styleable.TextInputLayout_endIconMode, 0));
            if (c7837.m24896(C1980R.styleable.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(c7837.m24891(C1980R.styleable.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(c7837.m3933(C1980R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (c7837.m24896(C1980R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (c7837.m24896(C1980R.styleable.TextInputLayout_passwordToggleTint)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), c7837, C1980R.styleable.TextInputLayout_passwordToggleTint);
            }
            if (c7837.m24896(C1980R.styleable.TextInputLayout_passwordToggleTintMode)) {
                this.endIconTintMode = ViewUtils.parseTintMode(c7837.m24882(C1980R.styleable.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            setEndIconMode(c7837.m3933(C1980R.styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconContentDescription(c7837.m24891(C1980R.styleable.TextInputLayout_passwordToggleContentDescription));
        }
        setEndIconMinSize(c7837.m24874(C1980R.styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(C1980R.dimen.mtrl_min_touch_target_size)));
        if (c7837.m24896(C1980R.styleable.TextInputLayout_endIconScaleType)) {
            setEndIconScaleType(IconHelper.convertScaleType(c7837.m24882(C1980R.styleable.TextInputLayout_endIconScaleType, -1)));
        }
    }

    private void initErrorIconView(C7837 c7837) {
        if (c7837.m24896(C1980R.styleable.TextInputLayout_errorIconTint)) {
            this.errorIconTintList = MaterialResources.getColorStateList(getContext(), c7837, C1980R.styleable.TextInputLayout_errorIconTint);
        }
        if (c7837.m24896(C1980R.styleable.TextInputLayout_errorIconTintMode)) {
            this.errorIconTintMode = ViewUtils.parseTintMode(c7837.m24882(C1980R.styleable.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (c7837.m24896(C1980R.styleable.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(c7837.m24875(C1980R.styleable.TextInputLayout_errorIconDrawable));
        }
        this.errorIconView.setContentDescription(getResources().getText(C1980R.string.error_icon_content_description));
        C8273.m27457(this.errorIconView, 2);
        this.errorIconView.setClickable(false);
        this.errorIconView.setPressable(false);
        this.errorIconView.setFocusable(false);
    }

    private void initSuffixTextView(C7837 c7837) {
        this.suffixTextView.setVisibility(8);
        this.suffixTextView.setId(C1980R.id.textinput_suffix_text);
        this.suffixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        C8273.m27441(this.suffixTextView, 1);
        setSuffixTextAppearance(c7837.m24888(C1980R.styleable.TextInputLayout_suffixTextAppearance, 0));
        if (c7837.m24896(C1980R.styleable.TextInputLayout_suffixTextColor)) {
            setSuffixTextColor(c7837.m24871(C1980R.styleable.TextInputLayout_suffixTextColor));
        }
        setSuffixText(c7837.m24891(C1980R.styleable.TextInputLayout_suffixText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTouchExplorationStateChangeListenerIfNeeded() {
        AccessibilityManager accessibilityManager;
        C3026.InterfaceC3029 interfaceC3029 = this.touchExplorationStateChangeListener;
        if (interfaceC3029 == null || (accessibilityManager = this.accessibilityManager) == null) {
            return;
        }
        C3026.m5943(accessibilityManager, interfaceC3029);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnFocusChangeListenersIfNeeded(EndIconDelegate endIconDelegate) {
        if (this.editText == null) {
            return;
        }
        if (endIconDelegate.getOnEditTextFocusChangeListener() != null) {
            this.editText.setOnFocusChangeListener(endIconDelegate.getOnEditTextFocusChangeListener());
        }
        if (endIconDelegate.getOnIconViewFocusChangeListener() != null) {
            this.endIconView.setOnFocusChangeListener(endIconDelegate.getOnIconViewFocusChangeListener());
        }
    }

    private void setUpDelegate(@InterfaceC6391 EndIconDelegate endIconDelegate) {
        endIconDelegate.setUp();
        this.touchExplorationStateChangeListener = endIconDelegate.getTouchExplorationStateChangeListener();
        addTouchExplorationStateChangeListenerIfNeeded();
    }

    private void tearDownDelegate(@InterfaceC6391 EndIconDelegate endIconDelegate) {
        removeTouchExplorationStateChangeListenerIfNeeded();
        this.touchExplorationStateChangeListener = null;
        endIconDelegate.tearDown();
    }

    private void tintEndIconOnError(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            return;
        }
        Drawable drawableMutate = C4520.m13239(getEndIconDrawable()).mutate();
        C4520.m13235(drawableMutate, this.textInputLayout.getErrorCurrentTextColors());
        this.endIconView.setImageDrawable(drawableMutate);
    }

    private void updateEndLayoutVisibility() {
        this.endIconFrame.setVisibility((this.endIconView.getVisibility() != 0 || isErrorIconVisible()) ? 8 : 0);
        setVisibility((isEndIconVisible() || isErrorIconVisible() || ((this.suffixText == null || this.hintExpanded) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void updateErrorIconVisibility() {
        this.errorIconView.setVisibility(getErrorIconDrawable() != null && this.textInputLayout.isErrorEnabled() && this.textInputLayout.shouldShowError() ? 0 : 8);
        updateEndLayoutVisibility();
        updateSuffixTextViewPadding();
        if (hasEndIcon()) {
            return;
        }
        this.textInputLayout.updateDummyDrawables();
    }

    private void updateSuffixTextVisibility() {
        int visibility = this.suffixTextView.getVisibility();
        int i = (this.suffixText == null || this.hintExpanded) ? 8 : 0;
        if (visibility != i) {
            getEndIconDelegate().onSuffixVisibilityChanged(i == 0);
        }
        updateEndLayoutVisibility();
        this.suffixTextView.setVisibility(i);
        this.textInputLayout.updateDummyDrawables();
    }

    public void addOnEndIconChangedListener(@InterfaceC6391 TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.add(onEndIconChangedListener);
    }

    public void checkEndIcon() {
        this.endIconView.performClick();
        this.endIconView.jumpDrawablesToCurrentState();
    }

    public void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    @InterfaceC6490
    public CheckableImageButton getCurrentEndIconView() {
        if (isErrorIconVisible()) {
            return this.errorIconView;
        }
        if (hasEndIcon() && isEndIconVisible()) {
            return this.endIconView;
        }
        return null;
    }

    @InterfaceC6490
    public CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public EndIconDelegate getEndIconDelegate() {
        return this.endIconDelegates.get(this.endIconMode);
    }

    @InterfaceC6490
    public Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.endIconMinSize;
    }

    public int getEndIconMode() {
        return this.endIconMode;
    }

    @InterfaceC6391
    public ImageView.ScaleType getEndIconScaleType() {
        return this.endIconScaleType;
    }

    public CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    public Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    @InterfaceC6490
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    @InterfaceC6490
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    @InterfaceC6490
    public CharSequence getSuffixText() {
        return this.suffixText;
    }

    @InterfaceC6490
    public ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    public int getSuffixTextEndOffset() {
        return C8273.m27366(this) + C8273.m27366(this.suffixTextView) + ((isEndIconVisible() || isErrorIconVisible()) ? this.endIconView.getMeasuredWidth() + C5946.m18699((ViewGroup.MarginLayoutParams) this.endIconView.getLayoutParams()) : 0);
    }

    public TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    public boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    public boolean isEndIconCheckable() {
        return this.endIconView.isCheckable();
    }

    public boolean isEndIconChecked() {
        return hasEndIcon() && this.endIconView.isChecked();
    }

    public boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    public boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    public void onHintStateChanged(boolean z) {
        this.hintExpanded = z;
        updateSuffixTextVisibility();
    }

    public void onTextInputBoxStateUpdated() {
        updateErrorIconVisibility();
        refreshErrorIconDrawableState();
        refreshEndIconDrawableState();
        if (getEndIconDelegate().shouldTintIconOnError()) {
            tintEndIconOnError(this.textInputLayout.shouldShowError());
        }
    }

    public void refreshEndIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.endIconView, this.endIconTintList);
    }

    public void refreshErrorIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.errorIconView, this.errorIconTintList);
    }

    public void refreshIconState(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean zIsChecked;
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        boolean z3 = true;
        if (!endIconDelegate.isIconCheckable() || (zIsChecked = this.endIconView.isChecked()) == endIconDelegate.isIconChecked()) {
            z2 = false;
        } else {
            this.endIconView.setChecked(!zIsChecked);
            z2 = true;
        }
        if (!endIconDelegate.isIconActivable() || (zIsActivated = this.endIconView.isActivated()) == endIconDelegate.isIconActivated()) {
            z3 = z2;
        } else {
            setEndIconActivated(!zIsActivated);
        }
        if (z || z3) {
            refreshEndIconDrawableState();
        }
    }

    public void removeOnEndIconChangedListener(@InterfaceC6391 TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.remove(onEndIconChangedListener);
    }

    public void setEndIconActivated(boolean z) {
        this.endIconView.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.endIconView.setCheckable(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconContentDescription(@InterfaceC7613 int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconDrawable(@InterfaceC4525 int i) {
        setEndIconDrawable(i != 0 ? C3323.m396(getContext(), i) : null);
    }

    public void setEndIconMinSize(@InterfaceC6844 int i) {
        if (i < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != this.endIconMinSize) {
            this.endIconMinSize = i;
            IconHelper.setIconMinSize(this.endIconView, i);
            IconHelper.setIconMinSize(this.errorIconView, i);
        }
    }

    public void setEndIconMode(int i) {
        if (this.endIconMode == i) {
            return;
        }
        tearDownDelegate(getEndIconDelegate());
        int i2 = this.endIconMode;
        this.endIconMode = i;
        dispatchOnEndIconChanged(i2);
        setEndIconVisible(i != 0);
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        setEndIconDrawable(getIconResId(endIconDelegate));
        setEndIconContentDescription(endIconDelegate.getIconContentDescriptionResId());
        setEndIconCheckable(endIconDelegate.isIconCheckable());
        if (!endIconDelegate.isBoxBackgroundModeSupported(this.textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        setUpDelegate(endIconDelegate);
        setEndIconOnClickListener(endIconDelegate.getOnIconClickListener());
        EditText editText = this.editText;
        if (editText != null) {
            endIconDelegate.onEditTextAttached(editText);
            setOnFocusChangeListenersIfNeeded(endIconDelegate);
        }
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
        refreshIconState(true);
    }

    public void setEndIconOnClickListener(@InterfaceC6490 View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    public void setEndIconOnLongClickListener(@InterfaceC6490 View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    public void setEndIconScaleType(@InterfaceC6391 ImageView.ScaleType scaleType) {
        this.endIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.endIconView, scaleType);
        IconHelper.setIconScaleType(this.errorIconView, scaleType);
    }

    public void setEndIconTintList(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
        }
    }

    public void setEndIconTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        if (isEndIconVisible() != z) {
            this.endIconView.setVisibility(z ? 0 : 8);
            updateEndLayoutVisibility();
            updateSuffixTextViewPadding();
            this.textInputLayout.updateDummyDrawables();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorIconDrawable(@InterfaceC4525 int i) {
        setErrorIconDrawable(i != 0 ? C3323.m396(getContext(), i) : null);
        refreshErrorIconDrawableState();
    }

    public void setErrorIconOnClickListener(@InterfaceC6490 View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.errorIconView, onClickListener, this.errorIconOnLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@InterfaceC6490 View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    public void setErrorIconTintList(@InterfaceC6490 ColorStateList colorStateList) {
        if (this.errorIconTintList != colorStateList) {
            this.errorIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, colorStateList, this.errorIconTintMode);
        }
    }

    public void setErrorIconTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        if (this.errorIconTintMode != mode) {
            this.errorIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPasswordVisibilityToggleContentDescription(@InterfaceC7613 int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPasswordVisibilityToggleDrawable(@InterfaceC4525 int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C3323.m396(getContext(), i) : null);
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.endIconMode != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    public void setPasswordVisibilityToggleTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
    }

    public void setPasswordVisibilityToggleTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
    }

    public void setSuffixText(@InterfaceC6490 CharSequence charSequence) {
        this.suffixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }

    public void setSuffixTextAppearance(@InterfaceC7651 int i) {
        C7759.m24676(this.suffixTextView, i);
    }

    public void setSuffixTextColor(@InterfaceC6391 ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    public void togglePasswordVisibilityToggle(boolean z) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    public void updateSuffixTextViewPadding() {
        if (this.textInputLayout.editText == null) {
            return;
        }
        C8273.m27471(this.suffixTextView, getContext().getResources().getDimensionPixelSize(C1980R.dimen.material_input_text_to_prefix_suffix_padding), this.textInputLayout.editText.getPaddingTop(), (isEndIconVisible() || isErrorIconVisible()) ? 0 : C8273.m27366(this.textInputLayout.editText), this.textInputLayout.editText.getPaddingBottom());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setEndIconContentDescription(@InterfaceC6490 CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setEndIconDrawable(@InterfaceC6490 Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            refreshEndIconDrawableState();
        }
    }

    public void setErrorIconDrawable(@InterfaceC6490 Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        updateErrorIconVisibility();
        IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, this.errorIconTintMode);
    }

    public void setPasswordVisibilityToggleContentDescription(@InterfaceC6490 CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleDrawable(@InterfaceC6490 Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }
}
