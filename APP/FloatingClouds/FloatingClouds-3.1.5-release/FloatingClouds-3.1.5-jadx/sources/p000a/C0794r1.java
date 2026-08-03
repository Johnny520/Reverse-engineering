package p000a;

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
import p000a.C0123Gc;
import p000a.C0466Ze;

/* JADX INFO: renamed from: a.r1 */
/* JADX INFO: loaded from: classes.dex */
public class C0794r1 extends TextView {

    /* JADX INFO: renamed from: a */
    public final C0111G0 f3120a;

    /* JADX INFO: renamed from: b */
    public final C0756p1 f3121b;

    /* JADX INFO: renamed from: c */
    public C0490b1 f3122c;

    /* JADX INFO: renamed from: d */
    public boolean f3123d;

    /* JADX INFO: renamed from: e */
    public c f3124e;

    /* JADX INFO: renamed from: f */
    public Future<C0123Gc> f3125f;

    /* JADX INFO: renamed from: a.r1$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1853a(int i);

        /* JADX INFO: renamed from: b */
        void mo1854b(int i);

        /* JADX INFO: renamed from: c */
        void mo1855c(int i, float f);
    }

    /* JADX INFO: renamed from: a.r1$b */
    public class b implements a {
        public b() {
        }

        @Override // p000a.C0794r1.a
        /* JADX INFO: renamed from: c */
        public void mo1855c(int i, float f) {
        }
    }

    /* JADX INFO: renamed from: a.r1$c */
    public class c extends b {
        public c() {
            super();
        }

        @Override // p000a.C0794r1.a
        /* JADX INFO: renamed from: a */
        public final void mo1853a(int i) {
            C0794r1.super.setLastBaselineToBottomHeight(i);
        }

        @Override // p000a.C0794r1.a
        /* JADX INFO: renamed from: b */
        public final void mo1854b(int i) {
            C0794r1.super.setFirstBaselineToTopHeight(i);
        }
    }

    /* JADX INFO: renamed from: a.r1$d */
    public class d extends c {
        public d() {
            super();
        }

        @Override // p000a.C0794r1.b, p000a.C0794r1.a
        /* JADX INFO: renamed from: c */
        public final void mo1855c(int i, float f) {
            C0794r1.super.setLineHeight(i, f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0794r1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0490b1 getEmojiTextViewHelper() {
        if (this.f3122c == null) {
            this.f3122c = new C0490b1(this);
        }
        return this.f3122c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0111G0 c0111g0 = this.f3120a;
        if (c0111g0 != null) {
            c0111g0.m296a();
        }
        C0756p1 c0756p1 = this.f3121b;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1852g() {
        Future<C0123Gc> future = this.f3125f;
        if (future != null) {
            try {
                this.f3125f = null;
                C0123Gc c0123Gc = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    c0123Gc.getClass();
                    setText(C0466Ze.b.m1130a(null));
                } else {
                    C0123Gc.a aVar = new C0123Gc.a(C0466Ze.b.m1132c(this));
                    c0123Gc.getClass();
                    aVar.m323a(null);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0466Ze.m1121b(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        if (this.f3124e == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.f3124e = new d();
            } else {
                this.f3124e = new c();
            }
        }
        return this.f3124e;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0111G0 c0111g0 = this.f3120a;
        if (c0111g0 != null) {
            return c0111g0.m297b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0111G0 c0111g0 = this.f3120a;
        if (c0111g0 != null) {
            return c0111g0.m298c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3121b.m1784d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3121b.m1785e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m1852g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public C0123Gc.a getTextMetricsParamsCompat() {
        return new C0123Gc.a(C0466Ze.b.m1132c(this));
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3121b.getClass();
        C0756p1.m1781h(editorInfo, inputConnectionOnCreateInputConnection, this);
        C0889w1.m2125L(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0756p1 c0756p1 = this.f3121b;
        if (c0756p1 != null) {
            c0756p1.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m1852g();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m1191c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0111G0 c0111g0 = this.f3120a;
        if (c0111g0 != null) {
            c0111g0.m300e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0111G0 c0111g0 = this.f3120a;
        if (c0111g0 != null) {
            c0111g0.m301f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0756p1 c0756p1 = this.f3121b;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0756p1 c0756p1 = this.f3121b;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0756p1 c0756p1 = this.f3121b;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0756p1 c0756p1 = this.f3121b;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m1192d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m1189a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        getSuperCaller().mo1854b(i);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        getSuperCaller().mo1853a(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C0466Ze.m1120a(this, i);
    }

    public void setPrecomputedText(C0123Gc c0123Gc) {
        if (Build.VERSION.SDK_INT >= 29) {
            c0123Gc.getClass();
            setText(C0466Ze.b.m1130a(null));
        } else {
            C0123Gc.a aVar = new C0123Gc.a(C0466Ze.b.m1132c(this));
            c0123Gc.getClass();
            aVar.m323a(null);
            throw null;
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0111G0 c0111g0 = this.f3120a;
        if (c0111g0 != null) {
            c0111g0.m303h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0111G0 c0111g0 = this.f3120a;
        if (c0111g0 != null) {
            c0111g0.m304i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0756p1 c0756p1 = this.f3121b;
        c0756p1.m1788i(colorStateList);
        c0756p1.m1783b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0756p1 c0756p1 = this.f3121b;
        c0756p1.m1789j(mode);
        c0756p1.m1783b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0756p1 c0756p1 = this.f3121b;
        if (c0756p1 != null) {
            c0756p1.m1787g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<C0123Gc> future) {
        this.f3125f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0123Gc.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f402b;
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
        setTextDirection(i);
        getPaint().set(aVar.f401a);
        C0466Ze.a.m1126e(this, aVar.f403c);
        C0466Ze.a.m1129h(this, aVar.f404d);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f3123d) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            C0323Rf c0323Rf = C0234Mf.f777a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f3123d = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f3123d = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0794r1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0694lf.m1563a(context);
        this.f3123d = false;
        this.f3124e = null;
        C0542df.m1311a(this, getContext());
        C0111G0 c0111g0 = new C0111G0(this);
        this.f3120a = c0111g0;
        c0111g0.m299d(attributeSet, i);
        C0756p1 c0756p1 = new C0756p1(this);
        this.f3121b = c0756p1;
        c0756p1.m1786f(attributeSet, i);
        c0756p1.m1783b();
        getEmojiTextViewHelper().m1190b(attributeSet, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().mo1855c(i, f);
        } else if (i2 >= 34) {
            C0466Ze.c.m1134a(this, i, f);
        } else {
            C0466Ze.m1120a(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C0889w1.m2115A(context, i) : null, i2 != 0 ? C0889w1.m2115A(context, i2) : null, i3 != 0 ? C0889w1.m2115A(context, i3) : null, i4 != 0 ? C0889w1.m2115A(context, i4) : null);
        C0756p1 c0756p1 = this.f3121b;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C0889w1.m2115A(context, i) : null, i2 != 0 ? C0889w1.m2115A(context, i2) : null, i3 != 0 ? C0889w1.m2115A(context, i3) : null, i4 != 0 ? C0889w1.m2115A(context, i4) : null);
        C0756p1 c0756p1 = this.f3121b;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }
}
