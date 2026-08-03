package p057g;

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
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p000A.C0002c;
import p001A0.AbstractC0040p;
import p002B.AbstractC0055e;
import p002B.C0054d;
import p006D.C0095d;
import p017J.AbstractC0225n;
import p017J.AbstractC0228q;
import p017J.ActionModeCallbackC0229r;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p056f0.AbstractC0805P;
import p085v.AbstractC1106g;

/* JADX INFO: renamed from: g.K */
/* JADX INFO: loaded from: classes.dex */
public class C0868K extends TextView {

    /* JADX INFO: renamed from: a */
    public final C0916n f3113a;

    /* JADX INFO: renamed from: b */
    public final C0860G f3114b;

    /* JADX INFO: renamed from: c */
    public final C0002c f3115c;

    /* JADX INFO: renamed from: d */
    public C0932v f3116d;

    /* JADX INFO: renamed from: e */
    public boolean f3117e;

    /* JADX INFO: renamed from: f */
    public C0095d f3118f;

    /* JADX INFO: renamed from: g */
    public Future f3119g;

    public C0868K(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0932v getEmojiTextViewHelper() {
        if (this.f3116d == null) {
            this.f3116d = new C0932v(this);
        }
        return this.f3116d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0916n c0916n = this.f3113a;
        if (c0916n != null) {
            c0916n.m2240a();
        }
        C0860G c0860g = this.f3114b;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2192g() {
        Future future = this.f3119g;
        if (future == null) {
            return;
        }
        try {
            this.f3119g = null;
            AbstractC0324d.m726i(future.get());
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC0040p.m119y(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC0881Q0.f3149a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0860G c0860g = this.f3114b;
        if (c0860g != null) {
            return Math.round(c0860g.f3099i.f3142e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC0881Q0.f3149a) {
            return super.getAutoSizeMinTextSize();
        }
        C0860G c0860g = this.f3114b;
        if (c0860g != null) {
            return Math.round(c0860g.f3099i.f3141d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC0881Q0.f3149a) {
            return super.getAutoSizeStepGranularity();
        }
        C0860G c0860g = this.f3114b;
        if (c0860g != null) {
            return Math.round(c0860g.f3099i.f3140c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC0881Q0.f3149a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0860G c0860g = this.f3114b;
        return c0860g != null ? c0860g.f3099i.f3143f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC0881Q0.f3149a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0860G c0860g = this.f3114b;
        if (c0860g != null) {
            return c0860g.f3099i.f3138a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC0229r ? ((ActionModeCallbackC0229r) customSelectionActionModeCallback).f465a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0862H getSuperCaller() {
        if (this.f3118f == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                this.f3118f = new C0866J(this);
            } else if (i2 >= 28) {
                this.f3118f = new C0864I(this);
            } else {
                this.f3118f = new C0095d(19, this);
            }
        }
        return this.f3118f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0916n c0916n = this.f3113a;
        if (c0916n != null) {
            return c0916n.m2241b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0916n c0916n = this.f3113a;
        if (c0916n != null) {
            return c0916n.m2242c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0853C0 c0853c0 = this.f3114b.f3098h;
        if (c0853c0 != null) {
            return c0853c0.f3084a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0853C0 c0853c0 = this.f3114b.f3098h;
        if (c0853c0 != null) {
            return c0853c0.f3085b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m2192g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0002c c0002c;
        if (Build.VERSION.SDK_INT >= 28 || (c0002c = this.f3115c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0002c.f8c;
        return textClassifier == null ? AbstractC0848A.m2158a((TextView) c0002c.f7b) : textClassifier;
    }

    public C0054d getTextMetricsParamsCompat() {
        return AbstractC0040p.m119y(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3114b.getClass();
        C0860G.m2174f(this, inputConnectionOnCreateInputConnection, editorInfo);
        AbstractC0805P.m2036L(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 || i2 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0860G c0860g = this.f3114b;
        if (c0860g == null || AbstractC0881Q0.f3149a) {
            return;
        }
        c0860g.f3099i.m2203a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        m2192g();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0860G c0860g = this.f3114b;
        if (c0860g == null || AbstractC0881Q0.f3149a) {
            return;
        }
        C0878P c0878p = c0860g.f3099i;
        if (c0878p.m2205f()) {
            c0878p.m2203a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        ((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo127Q(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (AbstractC0881Q0.f3149a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0860G c0860g = this.f3114b;
        if (c0860g != null) {
            c0860g.m2179g(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (AbstractC0881Q0.f3149a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0860G c0860g = this.f3114b;
        if (c0860g != null) {
            c0860g.m2180h(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (AbstractC0881Q0.f3149a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0860G c0860g = this.f3114b;
        if (c0860g != null) {
            c0860g.m2181i(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0916n c0916n = this.f3113a;
        if (c0916n != null) {
            c0916n.m2244e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0916n c0916n = this.f3113a;
        if (c0916n != null) {
            c0916n.m2245f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0860G c0860g = this.f3114b;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0860G c0860g = this.f3114b;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0860G c0860g = this.f3114b;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0860G c0860g = this.f3114b;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0040p.m102e0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo128R(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo135w(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo341d(i2);
        } else {
            AbstractC0040p.m88S(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo356v(i2);
        } else {
            AbstractC0040p.m90U(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        AbstractC0040p.m91V(this, i2);
    }

    public void setPrecomputedText(AbstractC0055e abstractC0055e) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0040p.m119y(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0916n c0916n = this.f3113a;
        if (c0916n != null) {
            c0916n.m2247h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0916n c0916n = this.f3113a;
        if (c0916n != null) {
            c0916n.m2248i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0860G c0860g = this.f3114b;
        c0860g.m2182j(colorStateList);
        c0860g.m2176b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0860G c0860g = this.f3114b;
        c0860g.m2183k(mode);
        c0860g.m2176b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0860G c0860g = this.f3114b;
        if (c0860g != null) {
            c0860g.m2178e(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0002c c0002c;
        if (Build.VERSION.SDK_INT >= 28 || (c0002c = this.f3115c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0002c.f8c = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC0055e> future) {
        this.f3119g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0054d c0054d) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0054d.f193b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i2 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        getPaint().set(c0054d.f192a);
        AbstractC0225n.m620e(this, c0054d.f194c);
        AbstractC0225n.m623h(this, c0054d.f195d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) {
        boolean z2 = AbstractC0881Q0.f3149a;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        C0860G c0860g = this.f3114b;
        if (c0860g == null || z2) {
            return;
        }
        C0878P c0878p = c0860g.f3099i;
        if (c0878p.m2205f()) {
            return;
        }
        c0878p.m2206g(i2, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typefaceCreate;
        if (this.f3117e) {
            return;
        }
        if (typeface == null || i2 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC0805P abstractC0805P = AbstractC1106g.f4256a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i2);
        }
        this.f3117e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i2);
        } finally {
            this.f3117e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0868K(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AbstractC0851B0.m2165a(context);
        this.f3117e = false;
        this.f3118f = null;
        AbstractC0849A0.m2159a(this, getContext());
        C0916n c0916n = new C0916n(this);
        this.f3113a = c0916n;
        c0916n.m2243d(attributeSet, i2);
        C0860G c0860g = new C0860G(this);
        this.f3114b = c0860g;
        c0860g.m2177d(attributeSet, i2);
        c0860g.m2176b();
        C0002c c0002c = new C0002c(9);
        c0002c.f7b = this;
        this.f3115c = c0002c;
        getEmojiTextViewHelper().m2262a(attributeSet, i2);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i2, float f2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            getSuperCaller().mo352r(i2, f2);
        } else if (i3 >= 34) {
            AbstractC0228q.m629a(this, i2, f2);
        } else {
            AbstractC0040p.m91V(this, Math.round(TypedValue.applyDimension(i2, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? AbstractC0358S.m916w(context, i2) : null, i3 != 0 ? AbstractC0358S.m916w(context, i3) : null, i4 != 0 ? AbstractC0358S.m916w(context, i4) : null, i5 != 0 ? AbstractC0358S.m916w(context, i5) : null);
        C0860G c0860g = this.f3114b;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? AbstractC0358S.m916w(context, i2) : null, i3 != 0 ? AbstractC0358S.m916w(context, i3) : null, i4 != 0 ? AbstractC0358S.m916w(context, i4) : null, i5 != 0 ? AbstractC0358S.m916w(context, i5) : null);
        C0860G c0860g = this.f3114b;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }
}
