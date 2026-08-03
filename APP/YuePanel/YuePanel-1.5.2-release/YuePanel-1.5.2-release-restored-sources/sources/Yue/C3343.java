package Yue;

import Yue.C6728;
import Yue.InterfaceC7144;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3343 extends TextView implements InterfaceC7838, InterfaceC7841, InterfaceC3499, InterfaceC4608 {
    private final C3278 mBackgroundTintHelper;

    @InterfaceC6391
    private C3308 mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;

    @InterfaceC6490
    private Future<C6728> mPrecomputedTextFuture;

    @InterfaceC6490
    private InterfaceC0114 mSuperCaller;
    private final C3336 mTextClassifierHelper;
    private final C3337 mTextHelper;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤ$ۥ */
    public interface InterfaceC0114 {
        int getAutoSizeMaxTextSize();

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int[] getAutoSizeTextAvailableSizes();

        int getAutoSizeTextType();

        void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i);

        void setAutoSizeTextTypeWithDefaults(int i);

        /* JADX INFO: renamed from: ۥ */
        TextClassifier mo419();

        /* JADX INFO: renamed from: ۥ۟ */
        void mo420(@InterfaceC6490 TextClassifier textClassifier);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        void mo6839(@InterfaceC6844 int i);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        void mo6840(@InterfaceC6844 int i);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        void mo6841(int i, @InterfaceC4885(from = 0.0d) float f);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤ$ۥ۟ */
    @InterfaceC7113(api = 26)
    public class C0115 implements InterfaceC0114 {
        public C0115() {
        }

        @Override // Yue.C3343.InterfaceC0114
        public int getAutoSizeMaxTextSize() {
            return C3343.super.getAutoSizeMaxTextSize();
        }

        @Override // Yue.C3343.InterfaceC0114
        public int getAutoSizeMinTextSize() {
            return C3343.super.getAutoSizeMinTextSize();
        }

        @Override // Yue.C3343.InterfaceC0114
        public int getAutoSizeStepGranularity() {
            return C3343.super.getAutoSizeStepGranularity();
        }

        @Override // Yue.C3343.InterfaceC0114
        public int[] getAutoSizeTextAvailableSizes() {
            return C3343.super.getAutoSizeTextAvailableSizes();
        }

        @Override // Yue.C3343.InterfaceC0114
        public int getAutoSizeTextType() {
            return C3343.super.getAutoSizeTextType();
        }

        @Override // Yue.C3343.InterfaceC0114
        public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
            C3343.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @Override // Yue.C3343.InterfaceC0114
        public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
            C3343.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @Override // Yue.C3343.InterfaceC0114
        public void setAutoSizeTextTypeWithDefaults(int i) {
            C3343.super.setAutoSizeTextTypeWithDefaults(i);
        }

        @Override // Yue.C3343.InterfaceC0114
        /* JADX INFO: renamed from: ۥ */
        public TextClassifier mo419() {
            return C3343.super.getTextClassifier();
        }

        @Override // Yue.C3343.InterfaceC0114
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo420(@InterfaceC6490 TextClassifier textClassifier) {
            C3343.super.setTextClassifier(textClassifier);
        }

        @Override // Yue.C3343.InterfaceC0114
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo6839(int i) {
        }

        @Override // Yue.C3343.InterfaceC0114
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo6840(int i) {
        }

        @Override // Yue.C3343.InterfaceC0114
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo6841(int i, float f) {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(api = 28)
    public class C3344 extends C0115 {
        public C3344() {
            super();
        }

        @Override // Yue.C3343.C0115, Yue.C3343.InterfaceC0114
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo6839(@InterfaceC6844 int i) {
            C3343.super.setLastBaselineToBottomHeight(i);
        }

        @Override // Yue.C3343.C0115, Yue.C3343.InterfaceC0114
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo6840(@InterfaceC6844 int i) {
            C3343.super.setFirstBaselineToTopHeight(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(api = 34)
    public class C3345 extends C3344 {
        public C3345() {
            super();
        }

        @Override // Yue.C3343.C0115, Yue.C3343.InterfaceC0114
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo6841(int i, float f) {
            C3343.super.setLineHeight(i, f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3343(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @InterfaceC6391
    private C3308 getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C3308(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m349();
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m410();
        }
    }

    @Override // android.widget.TextView, Yue.InterfaceC3499
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (C8370.f24972) {
            return getSuperCaller().getAutoSizeMaxTextSize();
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            return c3337.m6811();
        }
        return -1;
    }

    @Override // android.widget.TextView, Yue.InterfaceC3499
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (C8370.f24972) {
            return getSuperCaller().getAutoSizeMinTextSize();
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            return c3337.m6812();
        }
        return -1;
    }

    @Override // android.widget.TextView, Yue.InterfaceC3499
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (C8370.f24972) {
            return getSuperCaller().getAutoSizeStepGranularity();
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            return c3337.m6813();
        }
        return -1;
    }

    @Override // android.widget.TextView, Yue.InterfaceC3499
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (C8370.f24972) {
            return getSuperCaller().getAutoSizeTextAvailableSizes();
        }
        C3337 c3337 = this.mTextHelper;
        return c3337 != null ? c3337.m6814() : new int[0];
    }

    @Override // android.widget.TextView, Yue.InterfaceC3499
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C8370.f24972) {
            return getSuperCaller().getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            return c3337.m6815();
        }
        return 0;
    }

    @Override // android.widget.TextView
    @InterfaceC6490
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C7759.m24678(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C7759.m24655(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C7759.m24656(this);
    }

    @InterfaceC8086
    @InterfaceC7113(api = 26)
    public InterfaceC0114 getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.mSuperCaller = new C3345();
            } else if (i >= 28) {
                this.mSuperCaller = new C3344();
            } else {
                this.mSuperCaller = new C0115();
            }
        }
        return this.mSuperCaller;
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public ColorStateList getSupportBackgroundTintList() {
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            return c3278.m6723();
        }
        return null;
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            return c3278.m6724();
        }
        return null;
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m6816();
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m6817();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m6838();
        return super.getText();
    }

    @Override // android.widget.TextView
    @InterfaceC6391
    @InterfaceC7113(api = 26)
    public TextClassifier getTextClassifier() {
        C3336 c3336;
        return (Build.VERSION.SDK_INT >= 28 || (c3336 = this.mTextClassifierHelper) == null) ? getSuperCaller().mo419() : c3336.m406();
    }

    @InterfaceC6391
    public C6728.C1075 getTextMetricsParamsCompat() {
        return C7759.m24661(this);
    }

    @Override // Yue.InterfaceC4608
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().m377();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.m6824(this, inputConnectionOnCreateInputConnection, editorInfo);
        return C3309.m378(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6821(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m6838();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C3337 c3337 = this.mTextHelper;
        if (c3337 == null || C8370.f24972 || !c3337.m6818()) {
            return;
        }
        this.mTextHelper.m6810();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m6767(z);
    }

    @Override // android.widget.TextView, Yue.InterfaceC3499
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C8370.f24972) {
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6826(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, Yue.InterfaceC3499
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@InterfaceC6391 int[] iArr, int i) throws IllegalArgumentException {
        if (C8370.f24972) {
            getSuperCaller().setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6827(iArr, i);
        }
    }

    @Override // android.widget.TextView, Yue.InterfaceC3499
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C8370.f24972) {
            getSuperCaller().setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6828(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@InterfaceC6490 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m6726(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC4525 int i) {
        super.setBackgroundResource(i);
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m6727(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@InterfaceC6490 Drawable drawable, @InterfaceC6490 Drawable drawable2, @InterfaceC6490 Drawable drawable3, @InterfaceC6490 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6822();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@InterfaceC6490 Drawable drawable, @InterfaceC6490 Drawable drawable2, @InterfaceC6490 Drawable drawable3, @InterfaceC6490 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6822();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@InterfaceC6490 Drawable drawable, @InterfaceC6490 Drawable drawable2, @InterfaceC6490 Drawable drawable3, @InterfaceC6490 Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6822();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@InterfaceC6490 Drawable drawable, @InterfaceC6490 Drawable drawable2, @InterfaceC6490 Drawable drawable3, @InterfaceC6490 Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6822();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@InterfaceC6490 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C7759.m24679(this, callback));
    }

    @Override // Yue.InterfaceC4608
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m6768(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@InterfaceC6391 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m376(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@InterfaceC6844 @InterfaceC5459(from = 0) int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo6840(i);
        } else {
            C7759.m24671(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@InterfaceC6844 @InterfaceC5459(from = 0) int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo6839(i);
        } else {
            C7759.m24672(this, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setLineHeight(@InterfaceC6844 @InterfaceC5459(from = 0) int i) {
        C7759.m24673(this, i);
    }

    public void setPrecomputedText(@InterfaceC6391 C6728 c6728) {
        C7759.m24675(this, c6728);
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@InterfaceC6490 ColorStateList colorStateList) {
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m6729(colorStateList);
        }
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m6730(mode);
        }
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.mTextHelper.m6829(colorStateList);
        this.mTextHelper.m410();
    }

    @Override // Yue.InterfaceC7841
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        this.mTextHelper.m6830(mode);
        this.mTextHelper.m410();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6823(context, i);
        }
    }

    @Override // android.widget.TextView
    @InterfaceC7113(api = 26)
    public void setTextClassifier(@InterfaceC6490 TextClassifier textClassifier) {
        C3336 c3336;
        if (Build.VERSION.SDK_INT >= 28 || (c3336 = this.mTextClassifierHelper) == null) {
            getSuperCaller().mo420(textClassifier);
        } else {
            c3336.m407(textClassifier);
        }
    }

    public void setTextFuture(@InterfaceC6490 Future<C6728> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@InterfaceC6391 C6728.C1075 c1075) {
        C7759.m24677(this, c1075);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (C8370.f24972) {
            super.setTextSize(i, f);
            return;
        }
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6833(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(@InterfaceC6490 Typeface typeface, int i) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface typefaceM4043 = (typeface == null || i <= 0) ? null : C8023.m4043(getContext(), typeface, i);
        this.mIsSetTypefaceProcessing = true;
        if (typefaceM4043 != null) {
            typeface = typefaceM4043;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m6838() {
        Future<C6728> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                C7759.m24675(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3343(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.widget.TextView
    public void setLineHeight(int i, @InterfaceC4885(from = 0.0d) float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().mo6841(i, f);
        } else {
            C7759.m24674(this, i, f);
        }
    }

    public C3343(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(C7834.m3931(context), attributeSet, i);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        C7772.m3866(this, getContext());
        C3278 c3278 = new C3278(this);
        this.mBackgroundTintHelper = c3278;
        c3278.m6725(attributeSet, i);
        C3337 c3337 = new C3337(this);
        this.mTextHelper = c3337;
        c3337.m6819(attributeSet, i);
        c3337.m410();
        this.mTextClassifierHelper = new C3336(this);
        getEmojiTextViewHelper().m6766(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C3323.m396(context, i) : null, i2 != 0 ? C3323.m396(context, i2) : null, i3 != 0 ? C3323.m396(context, i3) : null, i4 != 0 ? C3323.m396(context, i4) : null);
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6822();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C3323.m396(context, i) : null, i2 != 0 ? C3323.m396(context, i2) : null, i3 != 0 ? C3323.m396(context, i3) : null, i4 != 0 ? C3323.m396(context, i4) : null);
        C3337 c3337 = this.mTextHelper;
        if (c3337 != null) {
            c3337.m6822();
        }
    }
}
