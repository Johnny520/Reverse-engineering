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
import android.text.PrecomputedText;
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
import java.util.concurrent.Future;

/* JADX INFO: renamed from: o4 */
/* JADX INFO: loaded from: classes.dex */
public class C2304o4 extends TextView {

    /* JADX INFO: renamed from: a */
    public final C1349e3 f8067a;

    /* JADX INFO: renamed from: b */
    public final C2175l4 f8068b;

    /* JADX INFO: renamed from: c */
    public C0391J3 f8069c;

    /* JADX INFO: renamed from: d */
    public boolean f8070d;

    /* JADX INFO: renamed from: e */
    public C0649P3 f8071e;

    /* JADX INFO: renamed from: f */
    public Future f8072f;

    public C2304o4(Context r2, AttributeSet r3) {
        this(r2, r3, R.attr.textViewStyle);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4681d(C2304o4 r0, int r1) {
        super.setFirstBaselineToTopHeight(r1);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m4682e(C2304o4 r0, int r1) {
        super.setLastBaselineToBottomHeight(r1);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m4683f(C2304o4 r0, int r1, float r2) {
        super.setLineHeight(r1, r2);
    }

    private C0391J3 getEmojiTextViewHelper() {
        if (this.f8069c != null) goto L6;
        this.f8069c = new C0391J3(this);
    L6:
        return this.f8069c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1349e3 r0 = this.f8067a;
        if (r0 == null) goto L5;
        r0.m2600a();
    L5:
        C2175l4 r02 = this.f8068b;
        if (r02 == null) goto L9;
        r02.m4375b();
        return;
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
        if (super.getAutoSizeTextType() != 1) goto L5;
        return 1;
    L5:
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC2218m4 getSuperCaller() {
        if (this.f8071e != null) goto L9;
        if (Build.VERSION.SDK_INT < 34) goto L7;
        this.f8071e = new C2261n4(this);
        goto L9
    L7:
        this.f8071e = new C0649P3(this);
    L9:
        return this.f8071e;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 r0 = this.f8067a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2601b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 r0 = this.f8067a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2602c();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8068b.m4376d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8068b.m4377e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future r0 = this.f8072f;
        if (r0 == null) goto L16;
        this.f8072f = null;     // Catch: Throwable -> L17
        if (r0.get() != null) goto L14;
        if (Build.VERSION.SDK_INT < 29) goto L11;
        throw null;     // Catch: Throwable -> L17
    L11:
        PrecomputedText.Params r02 = getTextMetricsParams();     // Catch: Throwable -> L17
        r02.getTextPaint();     // Catch: Throwable -> L17
        r02.getTextDirection();     // Catch: Throwable -> L17
        r02.getBreakStrategy();     // Catch: Throwable -> L17
        r02.getHyphenationFrequency();     // Catch: Throwable -> L17
        throw null;     // Catch: Throwable -> L17
    L14:
        throw new ClassCastException();     // Catch: Throwable -> L17
    L16:
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public C1235bu getTextMetricsParamsCompat() {
        return new C1235bu(getTextMetricsParams());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo r3) {
        InputConnection r0 = super.onCreateInputConnection(r3);
        this.f8068b.getClass();
        C2175l4.m4373h(r3, r0, this);
        AbstractC0828TB.m1654x(r3, r0, this);
        return r0;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 30) goto L5;
        return;
    L5:
        if (r0 < 33) goto L7;
        return;
    L7:
        if (onCheckIsTextEditor() == false) goto L12;
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        C2175l4 r22 = this.f8068b;
        if (r22 == null) goto L6;
        r22.getClass();
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r4, int r5) {
        Future r0 = this.f8072f;
        if (r0 != null) goto L18;
    L15:
        super.onMeasure(r4, r5);
        return;
    L18:
        this.f8072f = null;     // Catch: Throwable -> L17
        if (r0.get() != null) goto L14;
        if (Build.VERSION.SDK_INT < 29) goto L11;
        throw null;     // Catch: Throwable -> L17
    L11:
        PrecomputedText.Params r02 = getTextMetricsParams();     // Catch: Throwable -> L17
        r02.getTextPaint();     // Catch: Throwable -> L17
        r02.getTextDirection();     // Catch: Throwable -> L17
        r02.getBreakStrategy();     // Catch: Throwable -> L17
        r02.getHyphenationFrequency();     // Catch: Throwable -> L17
        throw null;     // Catch: Throwable -> L17
    L14:
        throw new ClassCastException();     // Catch: Throwable -> L17
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        super.onTextChanged(r1, r2, r3, r4);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        getEmojiTextViewHelper().m830c(r2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
        super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
        super.setAutoSizeTextTypeWithDefaults(r2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        C1349e3 r12 = this.f8067a;
        if (r12 == null) goto L6;
        r12.m2604e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C1349e3 r0 = this.f8067a;
        if (r0 == null) goto L6;
        r0.m2605f(r2);
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        C2175l4 r12 = this.f8068b;
        if (r12 == null) goto L6;
        r12.m4375b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        C2175l4 r12 = this.f8068b;
        if (r12 == null) goto L6;
        r12.m4375b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4);
        C2175l4 r12 = this.f8068b;
        if (r12 == null) goto L6;
        r12.m4375b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4);
        C2175l4 r12 = this.f8068b;
        if (r12 == null) goto L6;
        r12.m4375b();
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(r1);
    }

    public void setEmojiCompatEnabled(boolean r2) {
        getEmojiTextViewHelper().m831d(r2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] r2) {
        super.setFilters(getEmojiTextViewHelper().m828a(r2));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r2) {
        getSuperCaller().mo1294j(r2);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r2) {
        getSuperCaller().mo1292e(r2);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r1) {
        AbstractC0148Dc.m284r(this, r1);
    }

    public void setPrecomputedText(AbstractC1296cu r3) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        throw null;
    L5:
        PrecomputedText.Params r32 = getTextMetricsParams();
        r32.getTextPaint();
        r32.getTextDirection();
        r32.getBreakStrategy();
        r32.getHyphenationFrequency();
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        C1349e3 r0 = this.f8067a;
        if (r0 == null) goto L6;
        r0.m2607h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C1349e3 r0 = this.f8067a;
        if (r0 == null) goto L6;
        r0.m2608i(r2);
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        C2175l4 r0 = this.f8068b;
        r0.m4380i(r2);
        r0.m4375b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        C2175l4 r0 = this.f8068b;
        r0.m4381j(r2);
        r0.m4375b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context r2, int r3) {
        super.setTextAppearance(r2, r3);
        C2175l4 r0 = this.f8068b;
        if (r0 == null) goto L6;
        r0.m4379g(r2, r3);
        return;
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier r2) {
        super.setTextClassifier(r2);
    }

    public void setTextFuture(Future<AbstractC1296cu> r1) {
        this.f8072f = r1;
        if (r1 == null) goto L6;
        requestLayout();
        return;
    }

    public void setTextMetricsParamsCompat(C1235bu r6) {
        TextDirectionHeuristic r0 = r6.f4200b;
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
        setTextDirection(r2);
        getPaint().set(r6.f4199a);
        setBreakStrategy(r6.f4201c);
        setHyphenationFrequency(r6.f4202d);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface r3, int r4) {
        if (this.f8070d == false) goto L5;
        return;
    L5:
        if (r3 == null) goto L12;
        if (r4 <= 0) goto L12;
        Context r0 = getContext();
        AbstractC1293cr r1 = AbstractC0871UB.f2754a;
        if (r0 == null) goto L11;
        Typeface r02 = Typeface.create(r3, r4);
    L13:
        this.f8070d = true;
        if (r02 == null) goto L23;
        r3 = r02;
    L23:
        super.setTypeface(r3, r4);     // Catch: Throwable -> L20
        this.f8070d = false;
        return;
    L20:
        th = move-exception;
        this.f8070d = false;
        throw th;
    L11:
        throw new IllegalArgumentException("Context cannot be null");
    L12:
        r02 = null;
        goto L13
    }

    public C2304o4(Context r1, AttributeSet r2, int r3) {
        AbstractC1533iB.m2903a(r1);
        super(r1, r2, r3);
        this.f8070d = false;
        this.f8071e = null;
        AbstractC1042YA.m1987a(getContext(), this);
        C1349e3 r12 = new C1349e3(this);
        this.f8067a = r12;
        r12.m2603d(r2, r3);
        C2175l4 r13 = new C2175l4(this);
        this.f8068b = r13;
        r13.m4378f(r2, r3);
        r13.m4375b();
        getEmojiTextViewHelper().m829b(r2, r3);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int r3, float r4) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 34) goto L6;
        getSuperCaller().mo1295k(r3, r4);
        return;
    L6:
        if (r0 < 34) goto L9;
        AbstractC1031Y.m1961i(this, r3, r4);
        return;
    L9:
        AbstractC0148Dc.m284r(this, Math.round(TypedValue.applyDimension(r3, r4, getResources().getDisplayMetrics())));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
        Context r0 = getContext();
        Drawable r1 = null;
        if (r3 == 0) goto L5;
        Drawable r32 = AbstractC1406fG.m2695U(r0, r3);
    L6:
        if (r4 == 0) goto L8;
        Drawable r42 = AbstractC1406fG.m2695U(r0, r4);
    L9:
        if (r5 == 0) goto L11;
        Drawable r52 = AbstractC1406fG.m2695U(r0, r5);
    L12:
        if (r6 == 0) goto L14;
        r1 = AbstractC1406fG.m2695U(r0, r6);
    L14:
        setCompoundDrawablesRelativeWithIntrinsicBounds(r32, r42, r52, r1);
        C2175l4 r33 = this.f8068b;
        if (r33 == null) goto L18;
        r33.m4375b();
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
        Drawable r32 = AbstractC1406fG.m2695U(r0, r3);
    L6:
        if (r4 == 0) goto L8;
        Drawable r42 = AbstractC1406fG.m2695U(r0, r4);
    L9:
        if (r5 == 0) goto L11;
        Drawable r52 = AbstractC1406fG.m2695U(r0, r5);
    L12:
        if (r6 == 0) goto L14;
        r1 = AbstractC1406fG.m2695U(r0, r6);
    L14:
        setCompoundDrawablesWithIntrinsicBounds(r32, r42, r52, r1);
        C2175l4 r33 = this.f8068b;
        if (r33 == null) goto L18;
        r33.m4375b();
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
