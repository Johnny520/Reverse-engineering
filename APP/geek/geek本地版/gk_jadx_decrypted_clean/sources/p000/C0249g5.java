package p000;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: g5 */
/* JADX INFO: loaded from: classes.dex */
public class C0249g5 extends TextView {

    /* JADX INFO: renamed from: a */
    public final C0804v2 f2022a;

    /* JADX INFO: renamed from: b */
    public final C0139d5 f2023b;

    /* JADX INFO: renamed from: c */
    public final C0138d4 f2024c;

    /* JADX INFO: renamed from: d */
    public C0879x3 f2025d;

    /* JADX INFO: renamed from: e */
    public boolean f2026e;

    /* JADX INFO: renamed from: f */
    public C0431l0 f2027f;

    /* JADX INFO: renamed from: g */
    public Future f2028g;

    public C0249g5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0879x3 getEmojiTextViewHelper() {
        if (this.f2025d == null) {
            this.f2025d = new C0879x3(this);
        }
        return this.f2025d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0804v2 c0804v2 = this.f2022a;
        if (c0804v2 != null) {
            c0804v2.m2479a();
        }
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (cb0.f943b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            return Math.round(c0139d5.f1375i.f3338e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (cb0.f943b) {
            return super.getAutoSizeMinTextSize();
        }
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            return Math.round(c0139d5.f1375i.f3337d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (cb0.f943b) {
            return super.getAutoSizeStepGranularity();
        }
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            return Math.round(c0139d5.f1375i.f3336c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (cb0.f943b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0139d5 c0139d5 = this.f2023b;
        return c0139d5 != null ? c0139d5.f1375i.f3339f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (cb0.f943b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            return c0139d5.f1375i.f3334a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof o60 ? ((o60) customSelectionActionModeCallback).f3499a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0175e5 getSuperCaller() {
        if (this.f2027f == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f2027f = new C0212f5(this);
            } else {
                this.f2027f = new C0431l0(4, this);
            }
        }
        return this.f2027f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0804v2 c0804v2 = this.f2022a;
        if (c0804v2 != null) {
            return c0804v2.m2480b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0804v2 c0804v2 = this.f2022a;
        if (c0804v2 != null) {
            return c0804v2.m2481c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2023b.m914d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2023b.m915e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f2028g;
        if (future != null) {
            try {
                this.f2028g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC0979zt.m2835w(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0138d4 c0138d4;
        if (Build.VERSION.SDK_INT >= 28 || (c0138d4 = this.f2024c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0138d4.f1364c;
        return textClassifier == null ? AbstractC0843w4.m2545a((TextView) c0138d4.f1363b) : textClassifier;
    }

    public C0872wx getTextMetricsParamsCompat() {
        return AbstractC0979zt.m2835w(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2023b.getClass();
        C0139d5.m911h(editorInfo, inputConnectionOnCreateInputConnection, this);
        a80.m57v(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 == null || cb0.f943b) {
            return;
        }
        c0139d5.f1375i.m1908a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f2028g;
        if (future != null) {
            try {
                this.f2028g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC0979zt.m2835w(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            C0510n5 c0510n5 = c0139d5.f1375i;
            if (cb0.f943b || !c0510n5.m1910f()) {
                return;
            }
            c0510n5.m1908a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m2606b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (cb0.f943b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            c0139d5.m918i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (cb0.f943b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            c0139d5.m919j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (cb0.f943b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            c0139d5.m920k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0804v2 c0804v2 = this.f2022a;
        if (c0804v2 != null) {
            c0804v2.m2483e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0804v2 c0804v2 = this.f2022a;
        if (c0804v2 != null) {
            c0804v2.m2484f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0979zt.m2822S(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m2607c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((a80) getEmojiTextViewHelper().f5089b.f2980b).mo64l(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo987l(i);
        } else {
            AbstractC0979zt.m2819L(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo986j(i);
        } else {
            AbstractC0979zt.m2820M(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC0979zt.m2824e(i);
        if (i != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i - r0, 1.0f);
        }
    }

    public void setPrecomputedText(AbstractC0909xx abstractC0909xx) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0979zt.m2835w(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0804v2 c0804v2 = this.f2022a;
        if (c0804v2 != null) {
            c0804v2.m2486h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0804v2 c0804v2 = this.f2022a;
        if (c0804v2 != null) {
            c0804v2.m2487i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0139d5 c0139d5 = this.f2023b;
        c0139d5.m921l(colorStateList);
        c0139d5.m913b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0139d5 c0139d5 = this.f2023b;
        c0139d5.m922m(mode);
        c0139d5.m913b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            c0139d5.m917g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0138d4 c0138d4;
        if (Build.VERSION.SDK_INT >= 28 || (c0138d4 = this.f2024c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0138d4.f1364c = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC0909xx> future) {
        this.f2028g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0872wx c0872wx) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0872wx.f5037b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        k60.m1639h(this, i);
        getPaint().set(c0872wx.f5036a);
        l60.m1748e(this, c0872wx.f5038c);
        l60.m1751h(this, c0872wx.f5039d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = cb0.f943b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            C0510n5 c0510n5 = c0139d5.f1375i;
            if (z || c0510n5.m1910f()) {
                return;
            }
            c0510n5.m1911g(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f2026e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC0126ct abstractC0126ct = b80.f779a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f2026e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f2026e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0249g5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        x60.m2614a(context);
        this.f2026e = false;
        this.f2027f = null;
        r60.m2247a(this, getContext());
        C0804v2 c0804v2 = new C0804v2(this);
        this.f2022a = c0804v2;
        c0804v2.m2482d(attributeSet, i);
        C0139d5 c0139d5 = new C0139d5(this);
        this.f2023b = c0139d5;
        c0139d5.m916f(attributeSet, i);
        c0139d5.m913b();
        C0138d4 c0138d4 = new C0138d4(4, false);
        c0138d4.f1363b = this;
        this.f2024c = c0138d4;
        getEmojiTextViewHelper().m2605a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC0222ff.m1196r(context, i) : null, i2 != 0 ? AbstractC0222ff.m1196r(context, i2) : null, i3 != 0 ? AbstractC0222ff.m1196r(context, i3) : null, i4 != 0 ? AbstractC0222ff.m1196r(context, i4) : null);
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC0222ff.m1196r(context, i) : null, i2 != 0 ? AbstractC0222ff.m1196r(context, i2) : null, i3 != 0 ? AbstractC0222ff.m1196r(context, i3) : null, i4 != 0 ? AbstractC0222ff.m1196r(context, i4) : null);
        C0139d5 c0139d5 = this.f2023b;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }
}
