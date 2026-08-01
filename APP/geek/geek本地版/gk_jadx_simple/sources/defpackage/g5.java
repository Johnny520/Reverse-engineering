package defpackage;

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
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class g5 extends TextView {
    public final v2 a;
    public final d5 b;
    public final d4 c;
    public x3 d;
    public boolean e;
    public l0 f;
    public Future g;

    public g5(Context r2, AttributeSet r3) {
        this(r2, r3, R.attr.textViewStyle);
    }

    public static /* synthetic */ void d(g5 r0, int r1) {
        super.setFirstBaselineToTopHeight(r1);
    }

    public static /* synthetic */ void e(g5 r0, int r1) {
        super.setLastBaselineToBottomHeight(r1);
    }

    private x3 getEmojiTextViewHelper() {
        if (this.d != null) goto L6;
        this.d = new x3(this);
    L6:
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        v2 r0 = this.a;
        if (r0 == null) goto L5;
        r0.a();
    L5:
        d5 r02 = this.b;
        if (r02 == null) goto L9;
        r02.b();
        return;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (cb0.b == true) goto L5;
        d5 r0 = this.b;
        if (r0 != null) goto L9;
        return -1;
    L9:
        return Math.round(r0.i.e);
    L5:
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (cb0.b == true) goto L5;
        d5 r0 = this.b;
        if (r0 != null) goto L9;
        return -1;
    L9:
        return Math.round(r0.i.d);
    L5:
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (cb0.b == true) goto L5;
        d5 r0 = this.b;
        if (r0 != null) goto L9;
        return -1;
    L9:
        return Math.round(r0.i.c);
    L5:
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (cb0.b == true) goto L5;
        d5 r0 = this.b;
        if (r0 == null) goto L11;
        return r0.i.f;
    L11:
        return new int[0];
    L5:
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (cb0.b == true) goto L5;
        d5 r0 = this.b;
        if (r0 != null) goto L10;
        return 0;
    L10:
        return r0.i.a;
    L5:
        if (super.getAutoSizeTextType() != 1) goto L11;
        return 1;
    L11:
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback r0 = super.getCustomSelectionActionModeCallback();
        if ((r0 instanceof o60) == true) goto L5;
        return r0;
    L5:
        return ((o60) r0).a;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public e5 getSuperCaller() {
        if (this.f != null) goto L9;
        if (Build.VERSION.SDK_INT < 28) goto L7;
        this.f = new f5(this);
        goto L9
    L7:
        this.f = new l0(4, this);
    L9:
        return this.f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        v2 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        v2 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.c();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future r0 = this.g;
        if (r0 == null) goto L16;
        this.g = null;     // Catch: Throwable -> L17
        if (r0.get() != null) goto L14;
        if (Build.VERSION.SDK_INT < 29) goto L11;
        throw null;     // Catch: Throwable -> L17
    L11:
        zt.w(this);     // Catch: Throwable -> L17
        throw null;     // Catch: Throwable -> L17
    L14:
        throw new ClassCastException();     // Catch: Throwable -> L17
    L16:
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        if (Build.VERSION.SDK_INT >= 28) goto L13;
        d4 r0 = this.c;
        if (r0 == null) goto L13;
        TextClassifier r1 = (TextClassifier) r0.c;
        if (r1 == null) goto L10;
        return r1;
    L10:
        return w4.a((TextView) r0.b);
    L13:
        return super.getTextClassifier();
    }

    public wx getTextMetricsParamsCompat() {
        return zt.w(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo r3) {
        InputConnection r0 = super.onCreateInputConnection(r3);
        this.b.getClass();
        d5.h(r3, r0, this);
        a80.v(r3, r0, this);
        return r0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        d5 r22 = this.b;
        if (r22 != null) goto L5;
        return;
    L5:
        if (cb0.b == true) goto L9;
        r22.i.a();
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r4, int r5) {
        Future r0 = this.g;
        if (r0 != null) goto L18;
    L15:
        super.onMeasure(r4, r5);
        return;
    L18:
        this.g = null;     // Catch: Throwable -> L17
        if (r0.get() != null) goto L14;
        if (Build.VERSION.SDK_INT < 29) goto L11;
        throw null;     // Catch: Throwable -> L17
    L11:
        zt.w(this);     // Catch: Throwable -> L17
        throw null;     // Catch: Throwable -> L17
    L14:
        throw new ClassCastException();     // Catch: Throwable -> L17
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        super.onTextChanged(r1, r2, r3, r4);
        d5 r12 = this.b;
        if (r12 == null) goto L10;
        n5 r13 = r12.i;
        if (cb0.b == false) goto L7;
        return;
    L7:
        if (r13.f() == false) goto L12;
        r13.a();
        return;
    L12:
        return;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        getEmojiTextViewHelper().b(r2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
        if (cb0.b == false) goto L6;
        super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5);
        return;
    L6:
        d5 r0 = this.b;
        if (r0 == null) goto L10;
        r0.i(r2, r3, r4, r5);
        return;
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
        if (cb0.b == false) goto L6;
        super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3);
        return;
    L6:
        d5 r0 = this.b;
        if (r0 == null) goto L10;
        r0.j(r2, r3);
        return;
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
        if (cb0.b == false) goto L6;
        super.setAutoSizeTextTypeWithDefaults(r2);
        return;
    L6:
        d5 r0 = this.b;
        if (r0 == null) goto L10;
        r0.k(r2);
        return;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        v2 r12 = this.a;
        if (r12 == null) goto L6;
        r12.e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.f(r2);
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        d5 r12 = this.b;
        if (r12 == null) goto L6;
        r12.b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        d5 r12 = this.b;
        if (r12 == null) goto L6;
        r12.b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4);
        d5 r12 = this.b;
        if (r12 == null) goto L6;
        r12.b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4);
        d5 r12 = this.b;
        if (r12 == null) goto L6;
        r12.b();
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(zt.S(r1, this));
    }

    public void setEmojiCompatEnabled(boolean r2) {
        getEmojiTextViewHelper().c(r2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] r2) {
        super.setFilters(((a80) getEmojiTextViewHelper().b.b).l(r2));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r3) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        getSuperCaller().l(r3);
        return;
    L6:
        zt.L(this, r3);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r3) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        getSuperCaller().j(r3);
        return;
    L6:
        zt.M(this, r3);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r3) {
        zt.e(r3);
        if (r3 == getPaint().getFontMetricsInt(null)) goto L6;
        setLineSpacing(r3 - r0, 1.0f);
        return;
    }

    public void setPrecomputedText(xx r3) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        throw null;
    L5:
        zt.w(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.i(r2);
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        d5 r0 = this.b;
        r0.l(r2);
        r0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        d5 r0 = this.b;
        r0.m(r2);
        r0.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context r2, int r3) {
        super.setTextAppearance(r2, r3);
        d5 r0 = this.b;
        if (r0 == null) goto L6;
        r0.g(r2, r3);
        return;
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier r3) {
        if (Build.VERSION.SDK_INT >= 28) goto L9;
        d4 r0 = this.c;
        if (r0 == null) goto L9;
        r0.c = r3;
        return;
    L9:
        super.setTextClassifier(r3);
    }

    public void setTextFuture(Future<xx> r1) {
        this.g = r1;
        if (r1 == null) goto L6;
        requestLayout();
        return;
    }

    public void setTextMetricsParamsCompat(wx r6) {
        TextDirectionHeuristic r0 = r6.b;
        TextDirectionHeuristic r1 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int r2 = 1;
        if (r0 == r1) goto L24;
        TextDirectionHeuristic r3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (r0 == r3) goto L24;
        if (r0 != TextDirectionHeuristics.ANYRTL_LTR) goto L12;
        r2 = 2;
        goto L24
    L12:
        if (r0 != TextDirectionHeuristics.LTR) goto L15;
        r2 = 3;
        goto L24
    L15:
        if (r0 != TextDirectionHeuristics.RTL) goto L18;
        r2 = 4;
        goto L24
    L18:
        if (r0 != TextDirectionHeuristics.LOCALE) goto L20;
        r2 = 5;
        goto L24
    L20:
        if (r0 != r3) goto L22;
        r2 = 6;
        goto L24
    L22:
        if (r0 != r1) goto L24;
        r2 = 7;
    L24:
        k60.h(this, r2);
        getPaint().set(r6.a);
        l60.e(this, r6.c);
        l60.h(this, r6.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r3, float r4) {
        boolean r0 = cb0.b;
        if (r0 == false) goto L6;
        super.setTextSize(r3, r4);
        return;
    L6:
        d5 r1 = this.b;
        if (r1 == null) goto L14;
        n5 r12 = r1.i;
        if (r0 == false) goto L11;
        return;
    L11:
        if (r12.f() == true) goto L16;
        r12.g(r3, r4);
        return;
    L16:
        return;
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface r3, int r4) {
        if (this.e == false) goto L5;
        return;
    L5:
        if (r3 == null) goto L12;
        if (r4 <= 0) goto L12;
        Context r0 = getContext();
        ct r1 = b80.a;
        if (r0 == null) goto L11;
        Typeface r02 = Typeface.create(r3, r4);
    L13:
        this.e = true;
        if (r02 == null) goto L23;
        r3 = r02;
    L23:
        super.setTypeface(r3, r4);     // Catch: Throwable -> L20
        this.e = false;
        return;
    L20:
        th = move-exception;
        this.e = false;
        throw th;
    L11:
        throw new IllegalArgumentException("Context cannot be null");
    L12:
        r02 = null;
        goto L13
    }

    public g5(Context r3, AttributeSet r4, int r5) {
        x60.a(r3);
        super(r3, r4, r5);
        this.e = false;
        this.f = null;
        r60.a(this, getContext());
        v2 r32 = new v2(this);
        this.a = r32;
        r32.d(r4, r5);
        d5 r33 = new d5(this);
        this.b = r33;
        r33.f(r4, r5);
        r33.b();
        d4 r34 = new d4(4, false);
        r34.b = this;
        this.c = r34;
        getEmojiTextViewHelper().a(r4, r5);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
        Context r0 = getContext();
        Drawable r1 = null;
        if (r3 == 0) goto L5;
        Drawable r32 = ff.r(r0, r3);
    L6:
        if (r4 == 0) goto L8;
        Drawable r42 = ff.r(r0, r4);
    L9:
        if (r5 == 0) goto L11;
        Drawable r52 = ff.r(r0, r5);
    L12:
        if (r6 == 0) goto L14;
        r1 = ff.r(r0, r6);
    L14:
        setCompoundDrawablesRelativeWithIntrinsicBounds(r32, r42, r52, r1);
        d5 r33 = this.b;
        if (r33 == null) goto L18;
        r33.b();
        return;
    L18:
        return;
    L11:
        r52 = null;
        goto L12
    L8:
        r42 = null;
        goto L9
    L5:
        r32 = null;
        goto L6
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
        Context r0 = getContext();
        Drawable r1 = null;
        if (r3 == 0) goto L5;
        Drawable r32 = ff.r(r0, r3);
    L6:
        if (r4 == 0) goto L8;
        Drawable r42 = ff.r(r0, r4);
    L9:
        if (r5 == 0) goto L11;
        Drawable r52 = ff.r(r0, r5);
    L12:
        if (r6 == 0) goto L14;
        r1 = ff.r(r0, r6);
    L14:
        setCompoundDrawablesWithIntrinsicBounds(r32, r42, r52, r1);
        d5 r33 = this.b;
        if (r33 == null) goto L18;
        r33.b();
        return;
    L18:
        return;
    L11:
        r52 = null;
        goto L12
    L8:
        r42 = null;
        goto L9
    L5:
        r32 = null;
        goto L6
    }
}
