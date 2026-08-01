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
    public final C0803v2 f1873a;

    /* JADX INFO: renamed from: b */
    public final C0139d5 f1874b;

    /* JADX INFO: renamed from: c */
    public final C0138d4 f1875c;

    /* JADX INFO: renamed from: d */
    public C0879x3 f1876d;

    /* JADX INFO: renamed from: e */
    public boolean f1877e;

    /* JADX INFO: renamed from: f */
    public C0431l0 f1878f;

    /* JADX INFO: renamed from: g */
    public Future f1879g;

    public C0249g5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0879x3 getEmojiTextViewHelper() {
        if (this.f1876d == null) {
            this.f1876d = new C0879x3(this);
        }
        return this.f1876d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0803v2 c0803v2 = this.f1873a;
        if (c0803v2 != null) {
            c0803v2.m2533a();
        }
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (hb0.f2215b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            return Math.round(c0139d5.f1309i.f3228e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (hb0.f2215b) {
            return super.getAutoSizeMinTextSize();
        }
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            return Math.round(c0139d5.f1309i.f3227d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (hb0.f2215b) {
            return super.getAutoSizeStepGranularity();
        }
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            return Math.round(c0139d5.f1309i.f3226c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (hb0.f2215b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0139d5 c0139d5 = this.f1874b;
        return c0139d5 != null ? c0139d5.f1309i.f3229f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (hb0.f2215b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            return c0139d5.f1309i.f3224a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof u60 ? ((u60) customSelectionActionModeCallback).f4645a : customSelectionActionModeCallback;
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
        if (this.f1878f == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f1878f = new C0212f5(this);
            } else {
                this.f1878f = new C0431l0(4, this);
            }
        }
        return this.f1878f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0803v2 c0803v2 = this.f1873a;
        if (c0803v2 != null) {
            return c0803v2.m2534b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0803v2 c0803v2 = this.f1873a;
        if (c0803v2 != null) {
            return c0803v2.m2535c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1874b.m871d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1874b.m872e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f1879g;
        if (future != null) {
            try {
                this.f1879g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC0274gu.m1319t(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0138d4 c0138d4;
        if (Build.VERSION.SDK_INT >= 28 || (c0138d4 = this.f1875c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0138d4.f1298c;
        return textClassifier == null ? AbstractC0843w4.m2594a((TextView) c0138d4.f1297b) : textClassifier;
    }

    public C0241fy getTextMetricsParamsCompat() {
        return AbstractC0274gu.m1319t(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1874b.getClass();
        C0139d5.m868h(editorInfo, inputConnectionOnCreateInputConnection, this);
        g80.m1171B(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 == null || hb0.f2215b) {
            return;
        }
        c0139d5.f1309i.m1919a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f1879g;
        if (future != null) {
            try {
                this.f1879g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC0274gu.m1319t(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            C0510n5 c0510n5 = c0139d5.f1309i;
            if (hb0.f2215b || !c0510n5.m1921f()) {
                return;
            }
            c0510n5.m1919a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m2630b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (hb0.f2215b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            c0139d5.m875i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (hb0.f2215b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            c0139d5.m876j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (hb0.f2215b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            c0139d5.m877k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0803v2 c0803v2 = this.f1873a;
        if (c0803v2 != null) {
            c0803v2.m2537e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0803v2 c0803v2 = this.f1873a;
        if (c0803v2 != null) {
            c0803v2.m2538f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0274gu.m1308O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m2631c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0493mp) getEmojiTextViewHelper().f5159b.f2886b).mo1878r(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo967l(i);
        } else {
            AbstractC0274gu.m1304G(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo966j(i);
        } else {
            AbstractC0274gu.m1305H(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC0498mu.m1886c(i);
        if (i != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i - r0, 1.0f);
        }
    }

    public void setPrecomputedText(AbstractC0278gy abstractC0278gy) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0274gu.m1319t(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0803v2 c0803v2 = this.f1873a;
        if (c0803v2 != null) {
            c0803v2.m2540h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0803v2 c0803v2 = this.f1873a;
        if (c0803v2 != null) {
            c0803v2.m2541i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0139d5 c0139d5 = this.f1874b;
        c0139d5.m878l(colorStateList);
        c0139d5.m870b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0139d5 c0139d5 = this.f1874b;
        c0139d5.m879m(mode);
        c0139d5.m870b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            c0139d5.m874g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0138d4 c0138d4;
        if (Build.VERSION.SDK_INT >= 28 || (c0138d4 = this.f1875c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0138d4.f1298c = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC0278gy> future) {
        this.f1879g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0241fy c0241fy) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0241fy.f1846b;
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
        q60.m2128h(this, i);
        getPaint().set(c0241fy.f1845a);
        r60.m2260e(this, c0241fy.f1847c);
        r60.m2263h(this, c0241fy.f1848d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = hb0.f2215b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            C0510n5 c0510n5 = c0139d5.f1309i;
            if (z || c0510n5.m1921f()) {
                return;
            }
            c0510n5.m1922g(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f1877e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC0387ju abstractC0387ju = h80.f2140a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f1877e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f1877e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0249g5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d70.m881a(context);
        this.f1877e = false;
        this.f1878f = null;
        x60.m2635a(this, getContext());
        C0803v2 c0803v2 = new C0803v2(this);
        this.f1873a = c0803v2;
        c0803v2.m2536d(attributeSet, i);
        C0139d5 c0139d5 = new C0139d5(this);
        this.f1874b = c0139d5;
        c0139d5.m873f(attributeSet, i);
        c0139d5.m870b();
        C0138d4 c0138d4 = new C0138d4(4, false);
        c0138d4.f1297b = this;
        this.f1875c = c0138d4;
        getEmojiTextViewHelper().m2629a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC0259gf.m1261w(context, i) : null, i2 != 0 ? AbstractC0259gf.m1261w(context, i2) : null, i3 != 0 ? AbstractC0259gf.m1261w(context, i3) : null, i4 != 0 ? AbstractC0259gf.m1261w(context, i4) : null);
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC0259gf.m1261w(context, i) : null, i2 != 0 ? AbstractC0259gf.m1261w(context, i2) : null, i3 != 0 ? AbstractC0259gf.m1261w(context, i3) : null, i4 != 0 ? AbstractC0259gf.m1261w(context, i4) : null);
        C0139d5 c0139d5 = this.f1874b;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }
}
