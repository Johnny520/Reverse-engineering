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
import com.abc.core.runtime.AbstractC0805P;
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

    public C0868K(Context r2, AttributeSet r3) {
        this(r2, r3, R.attr.textViewStyle);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m2189d(C0868K r02, int r1) {
        super.setFirstBaselineToTopHeight(r1);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m2190e(C0868K r02, int r1) {
        super.setLastBaselineToBottomHeight(r1);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m2191f(C0868K r02, int r1, float r2) {
        super.setLineHeight(r1, r2);
    }

    private C0932v getEmojiTextViewHelper() {
        if (this.f3116d != null) goto L6;
        this.f3116d = new C0932v(this);
    L6:
        return this.f3116d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0916n r02 = this.f3113a;
        if (r02 == null) goto L5;
        r02.m2240a();
    L5:
        C0860G r03 = this.f3114b;
        if (r03 == null) goto L9;
        r03.m2176b();
        return;
    }

    /* JADX INFO: renamed from: g */
    public final void m2192g() {
        Future r02 = this.f3119g;
        if (r02 != null) goto L13;
        return;
    L13:
        this.f3119g = null;     // Catch: Throwable -> L12
        AbstractC0324d.m726i(r02.get());     // Catch: Throwable -> L12
        if (Build.VERSION.SDK_INT < 29) goto L9;
        throw null;     // Catch: Throwable -> L12
    L9:
        AbstractC0040p.m119y(this);     // Catch: Throwable -> L12
        throw null;     // Catch: Throwable -> L12
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC0881Q0.f3149a == true) goto L5;
        C0860G r02 = this.f3114b;
        if (r02 != null) goto L9;
        return -1;
    L9:
        return Math.round(r02.f3099i.f3142e);
    L5:
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC0881Q0.f3149a == true) goto L5;
        C0860G r02 = this.f3114b;
        if (r02 != null) goto L9;
        return -1;
    L9:
        return Math.round(r02.f3099i.f3141d);
    L5:
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC0881Q0.f3149a == true) goto L5;
        C0860G r02 = this.f3114b;
        if (r02 != null) goto L9;
        return -1;
    L9:
        return Math.round(r02.f3099i.f3140c);
    L5:
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC0881Q0.f3149a == true) goto L5;
        C0860G r02 = this.f3114b;
        if (r02 == null) goto L11;
        return r02.f3099i.f3143f;
    L11:
        return new int[0];
    L5:
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC0881Q0.f3149a == true) goto L5;
        C0860G r02 = this.f3114b;
        if (r02 != null) goto L11;
        return 0;
    L11:
        return r02.f3099i.f3138a;
    L5:
        if (super.getAutoSizeTextType() == 1) goto L7;
        return 0;
    L7:
        return 1;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback r02 = super.getCustomSelectionActionModeCallback();
        if ((r02 instanceof ActionModeCallbackC0229r) == true) goto L5;
        return r02;
    L5:
        return ((ActionModeCallbackC0229r) r02).f465a;
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
        if (this.f3118f != null) goto L12;
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 34) goto L8;
        this.f3118f = new C0866J(this);
        goto L12
    L8:
        if (r02 < 28) goto L10;
        this.f3118f = new C0864I(this);
        goto L12
    L10:
        this.f3118f = new C0095d(19, this);
    L12:
        return this.f3118f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0916n r02 = this.f3113a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.m2241b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0916n r02 = this.f3113a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.m2242c();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0853C0 r02 = this.f3114b.f3098h;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3084a;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0853C0 r02 = this.f3114b.f3098h;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3085b;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m2192g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        if (Build.VERSION.SDK_INT >= 28) goto L12;
        C0002c r02 = this.f3115c;
        if (r02 == null) goto L12;
        TextClassifier r1 = (TextClassifier) r02.f8c;
        if (r1 == null) goto L10;
        return r1;
    L10:
        return AbstractC0848A.m2158a((TextView) r02.f7b);
    L12:
        return super.getTextClassifier();
    }

    public C0054d getTextMetricsParamsCompat() {
        return AbstractC0040p.m119y(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo r3) {
        InputConnection r02 = super.onCreateInputConnection(r3);
        this.f3114b.getClass();
        C0860G.m2174f(this, r02, r3);
        AbstractC0805P.m2036L(r02, r3, this);
        return r02;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 30) goto L5;
        return;
    L5:
        if (r02 < 33) goto L7;
        return;
    L7:
        if (onCheckIsTextEditor() == false) goto L12;
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        C0860G r12 = this.f3114b;
        if (r12 != null) goto L5;
        return;
    L5:
        if (AbstractC0881Q0.f3149a == true) goto L9;
        r12.f3099i.m2203a();
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r1, int r2) {
        m2192g();
        super.onMeasure(r1, r2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        super.onTextChanged(r1, r2, r3, r4);
        C0860G r12 = this.f3114b;
        if (r12 != null) goto L5;
        return;
    L5:
        if (AbstractC0881Q0.f3149a == true) goto L11;
        C0878P r13 = r12.f3099i;
        if (r13.m2205f() == false) goto L12;
        r13.m2203a();
        return;
    L12:
        return;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        ((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo127Q(r2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
        if (AbstractC0881Q0.f3149a == false) goto L5;
        super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5);
        return;
    L5:
        C0860G r02 = this.f3114b;
        if (r02 == null) goto L10;
        r02.m2179g(r2, r3, r4, r5);
        return;
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
        if (AbstractC0881Q0.f3149a == false) goto L5;
        super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3);
        return;
    L5:
        C0860G r02 = this.f3114b;
        if (r02 == null) goto L10;
        r02.m2180h(r2, r3);
        return;
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
        if (AbstractC0881Q0.f3149a == false) goto L5;
        super.setAutoSizeTextTypeWithDefaults(r2);
        return;
    L5:
        C0860G r02 = this.f3114b;
        if (r02 == null) goto L10;
        r02.m2181i(r2);
        return;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        C0916n r12 = this.f3113a;
        if (r12 == null) goto L6;
        r12.m2244e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C0916n r02 = this.f3113a;
        if (r02 == null) goto L6;
        r02.m2245f(r2);
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        C0860G r12 = this.f3114b;
        if (r12 == null) goto L6;
        r12.m2176b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        C0860G r12 = this.f3114b;
        if (r12 == null) goto L6;
        r12.m2176b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4);
        C0860G r12 = this.f3114b;
        if (r12 == null) goto L6;
        r12.m2176b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4);
        C0860G r12 = this.f3114b;
        if (r12 == null) goto L6;
        r12.m2176b();
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(AbstractC0040p.m102e0(r1, this));
    }

    public void setEmojiCompatEnabled(boolean r2) {
        ((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo128R(r2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] r2) {
        super.setFilters(((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo135w(r2));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r3) {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        getSuperCaller().mo341d(r3);
        return;
    L5:
        AbstractC0040p.m88S(this, r3);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r3) {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        getSuperCaller().mo356v(r3);
        return;
    L5:
        AbstractC0040p.m90U(this, r3);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r1) {
        AbstractC0040p.m91V(this, r1);
    }

    public void setPrecomputedText(AbstractC0055e r3) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        throw null;
    L5:
        AbstractC0040p.m119y(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        C0916n r02 = this.f3113a;
        if (r02 == null) goto L6;
        r02.m2247h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C0916n r02 = this.f3113a;
        if (r02 == null) goto L6;
        r02.m2248i(r2);
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        C0860G r02 = this.f3114b;
        r02.m2182j(r2);
        r02.m2176b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        C0860G r02 = this.f3114b;
        r02.m2183k(r2);
        r02.m2176b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context r2, int r3) {
        super.setTextAppearance(r2, r3);
        C0860G r02 = this.f3114b;
        if (r02 == null) goto L6;
        r02.m2178e(r2, r3);
        return;
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier r3) {
        if (Build.VERSION.SDK_INT >= 28) goto L9;
        C0002c r02 = this.f3115c;
        if (r02 == null) goto L9;
        r02.f8c = r3;
        return;
    L9:
        super.setTextClassifier(r3);
    }

    public void setTextFuture(Future<AbstractC0055e> r1) {
        this.f3119g = r1;
        if (r1 == null) goto L6;
        requestLayout();
        return;
    }

    public void setTextMetricsParamsCompat(C0054d r6) {
        TextDirectionHeuristic r02 = r6.f193b;
        TextDirectionHeuristic r1 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int r2 = 1;
        if (r02 == r1) goto L24;
        TextDirectionHeuristic r3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (r02 == r3) goto L24;
        if (r02 != TextDirectionHeuristics.ANYRTL_LTR) goto L12;
        r2 = 2;
        goto L24
    L12:
        if (r02 != TextDirectionHeuristics.LTR) goto L15;
        r2 = 3;
        goto L24
    L15:
        if (r02 != TextDirectionHeuristics.RTL) goto L18;
        r2 = 4;
        goto L24
    L18:
        if (r02 != TextDirectionHeuristics.LOCALE) goto L20;
        r2 = 5;
        goto L24
    L20:
        if (r02 != r3) goto L22;
        r2 = 6;
        goto L24
    L22:
        if (r02 != r1) goto L24;
        r2 = 7;
    L24:
        setTextDirection(r2);
        getPaint().set(r6.f192a);
        AbstractC0225n.m620e(this, r6.f194c);
        AbstractC0225n.m623h(this, r6.f195d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r3, float r4) {
        boolean r02 = AbstractC0881Q0.f3149a;
        if (r02 == false) goto L5;
        super.setTextSize(r3, r4);
        return;
    L5:
        C0860G r1 = this.f3114b;
        if (r1 == null) goto L13;
        if (r02 == true) goto L14;
        C0878P r03 = r1.f3099i;
        if (r03.m2205f() == true) goto L15;
        r03.m2206g(r3, r4);
        return;
    L15:
        return;
    L14:
        return;
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface r3, int r4) {
        if (this.f3117e == false) goto L5;
        return;
    L5:
        if (r3 == null) goto L12;
        if (r4 <= 0) goto L12;
        Context r02 = getContext();
        AbstractC0805P r1 = AbstractC1106g.f4256a;
        if (r02 == null) goto L11;
        Typeface r03 = Typeface.create(r3, r4);
    L13:
        this.f3117e = true;
        if (r03 == null) goto L23;
        r3 = r03;
    L23:
        super.setTypeface(r3, r4);     // Catch: Throwable -> L20
        this.f3117e = false;
        return;
    L20:
        th = move-exception;
        this.f3117e = false;
        throw th;
    L11:
        throw new IllegalArgumentException("Context cannot be null");
    L12:
        r03 = null;
        goto L13
    }

    public C0868K(Context r2, AttributeSet r3, int r4) {
        AbstractC0851B0.m2165a(r2);
        super(r2, r3, r4);
        this.f3117e = false;
        this.f3118f = null;
        AbstractC0849A0.m2159a(this, getContext());
        C0916n r22 = new C0916n(this);
        this.f3113a = r22;
        r22.m2243d(r3, r4);
        C0860G r23 = new C0860G(this);
        this.f3114b = r23;
        r23.m2177d(r3, r4);
        r23.m2176b();
        C0002c r24 = new C0002c(9);
        r24.f7b = this;
        this.f3115c = r24;
        getEmojiTextViewHelper().m2262a(r3, r4);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int r3, float r4) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 34) goto L5;
        getSuperCaller().mo352r(r3, r4);
        return;
    L5:
        if (r02 < 34) goto L7;
        AbstractC0228q.m629a(this, r3, r4);
        return;
    L7:
        AbstractC0040p.m91V(this, Math.round(TypedValue.applyDimension(r3, r4, getResources().getDisplayMetrics())));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
        Context r02 = getContext();
        Drawable r1 = null;
        if (r3 == 0) goto L5;
        Drawable r32 = AbstractC0358S.m916w(r02, r3);
    L6:
        if (r4 == 0) goto L8;
        Drawable r42 = AbstractC0358S.m916w(r02, r4);
    L9:
        if (r5 == 0) goto L11;
        Drawable r52 = AbstractC0358S.m916w(r02, r5);
    L12:
        if (r6 == 0) goto L14;
        r1 = AbstractC0358S.m916w(r02, r6);
    L14:
        setCompoundDrawablesRelativeWithIntrinsicBounds(r32, r42, r52, r1);
        C0860G r33 = this.f3114b;
        if (r33 == null) goto L18;
        r33.m2176b();
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
        Context r02 = getContext();
        Drawable r1 = null;
        if (r3 == 0) goto L5;
        Drawable r32 = AbstractC0358S.m916w(r02, r3);
    L6:
        if (r4 == 0) goto L8;
        Drawable r42 = AbstractC0358S.m916w(r02, r4);
    L9:
        if (r5 == 0) goto L11;
        Drawable r52 = AbstractC0358S.m916w(r02, r5);
    L12:
        if (r6 == 0) goto L14;
        r1 = AbstractC0358S.m916w(r02, r6);
    L14:
        setCompoundDrawablesWithIntrinsicBounds(r32, r42, r52, r1);
        C0860G r33 = this.f3114b;
        if (r33 == null) goto L18;
        r33.m2176b();
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
