package p069i;

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
import p006D.AbstractC0079h;
import p006D.AbstractC0088q;
import p006D.InterfaceC0074c;
import p052b1.AbstractC0503h;
import p085r.AbstractC0814f;
import p095w.AbstractC1031b;
import p095w.C1030a;

/* JADX INFO: renamed from: i.d0 */
/* JADX INFO: loaded from: classes.dex */
public class C0669d0 extends TextView implements InterfaceC0074c {

    /* JADX INFO: renamed from: b */
    public final C0704p f2273b;

    /* JADX INFO: renamed from: c */
    public final C0666c0 f2274c;

    /* JADX INFO: renamed from: d */
    public final C0612C f2275d;

    /* JADX INFO: renamed from: e */
    public C0723w f2276e;

    /* JADX INFO: renamed from: f */
    public boolean f2277f;

    /* JADX INFO: renamed from: g */
    public Future f2278g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0669d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0723w getEmojiTextViewHelper() {
        if (this.f2276e == null) {
            this.f2276e = new C0723w(this);
        }
        return this.f2276e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1296d() {
        Future future = this.f2278g;
        if (future == null) {
            return;
        }
        try {
            this.f2278g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC0079h.m195w(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0704p c0704p = this.f2273b;
        if (c0704p != null) {
            c0704p.m1327a();
        }
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0074c.f337a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 != null) {
            return Math.round(c0666c0.f2249i.f2331e);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0074c.f337a) {
            return super.getAutoSizeMinTextSize();
        }
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 != null) {
            return Math.round(c0666c0.f2249i.f2330d);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0074c.f337a) {
            return super.getAutoSizeStepGranularity();
        }
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 != null) {
            return Math.round(c0666c0.f2249i.f2329c);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0074c.f337a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0666c0 c0666c0 = this.f2274c;
        return c0666c0 != null ? c0666c0.f2249i.f2332f : new int[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC0074c.f337a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 != null) {
            return c0666c0.f2249i.f2327a;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0079h.m177V(super.getCustomSelectionActionModeCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportBackgroundTintList() {
        C0704p c0704p = this.f2273b;
        if (c0704p != null) {
            return c0704p.m1328b();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0704p c0704p = this.f2273b;
        if (c0704p != null) {
            return c0704p.m1329c();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2274c.m1282d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2274c.m1283e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public CharSequence getText() {
        m1296d();
        return super.getText();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0612C c0612c;
        if (Build.VERSION.SDK_INT >= 28 || (c0612c = this.f2275d) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0612c.f2116c;
        return textClassifier == null ? AbstractC0649V.m1265a((TextView) c0612c.f2115b) : textClassifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1030a getTextMetricsParamsCompat() {
        return AbstractC0079h.m195w(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2274c.getClass();
        C0666c0.m1279h(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC0503h.m972H(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 == null || InterfaceC0074c.f337a) {
            return;
        }
        c0666c0.f2249i.m1315a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        m1296d();
        super.onMeasure(i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 == null || InterfaceC0074c.f337a) {
            return;
        }
        C0690k0 c0690k0 = c0666c0.f2249i;
        if (c0690k0.m1317f()) {
            c0690k0.m1315a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m1373b(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (InterfaceC0074c.f337a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 != null) {
            c0666c0.m1286i(i2, i3, i4, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (InterfaceC0074c.f337a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 != null) {
            c0666c0.m1287j(iArr, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (InterfaceC0074c.f337a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 != null) {
            c0666c0.m1288k(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0704p c0704p = this.f2273b;
        if (c0704p != null) {
            c0704p.m1331e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0704p c0704p = this.f2273b;
        if (c0704p != null) {
            c0704p.m1332f(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0079h.m178W(callback, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m1374c(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0079h) getEmojiTextViewHelper().f2448b.f312c).mo209t(inputFilterArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            AbstractC0079h.m173R(this, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            AbstractC0079h.m174S(this, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i2 - r0, 1.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPrecomputedText(AbstractC1031b abstractC1031b) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0079h.m195w(this);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0704p c0704p = this.f2273b;
        if (c0704p != null) {
            c0704p.m1334h(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0704p c0704p = this.f2273b;
        if (c0704p != null) {
            c0704p.m1335i(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0666c0 c0666c0 = this.f2274c;
        c0666c0.m1289l(colorStateList);
        c0666c0.m1281b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0666c0 c0666c0 = this.f2274c;
        c0666c0.m1290m(mode);
        c0666c0.m1281b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 != null) {
            c0666c0.m1285g(context, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0612C c0612c;
        if (Build.VERSION.SDK_INT >= 28 || (c0612c = this.f2275d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0612c.f2116c = textClassifier;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextFuture(Future<AbstractC1031b> future) {
        this.f2278g = future;
        if (future != null) {
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextMetricsParamsCompat(C1030a c1030a) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c1030a.f3647b;
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
        getPaint().set(c1030a.f3646a);
        AbstractC0088q.m232e(this, c1030a.f3648c);
        AbstractC0088q.m235h(this, c1030a.f3649d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f) {
        boolean z2 = InterfaceC0074c.f337a;
        if (z2) {
            super.setTextSize(i2, f);
            return;
        }
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 == null || z2) {
            return;
        }
        C0690k0 c0690k0 = c0666c0.f2249i;
        if (c0690k0.m1317f()) {
            return;
        }
        c0690k0.m1318g(i2, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typefaceCreate;
        if (this.f2277f) {
            return;
        }
        if (typeface == null || i2 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC0503h abstractC0503h = AbstractC0814f.f2717a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i2);
        }
        this.f2277f = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i2);
        } finally {
            this.f2277f = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0669d0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AbstractC0673e1.m1303a(context);
        this.f2277f = false;
        AbstractC0670d1.m1297a(this, getContext());
        C0704p c0704p = new C0704p(this);
        this.f2273b = c0704p;
        c0704p.m1330d(attributeSet, i2);
        C0666c0 c0666c0 = new C0666c0(this);
        this.f2274c = c0666c0;
        c0666c0.m1284f(attributeSet, i2);
        c0666c0.m1281b();
        C0612C c0612c = new C0612C();
        c0612c.f2115b = this;
        this.f2275d = c0612c;
        getEmojiTextViewHelper().m1372a(attributeSet, i2);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? AbstractC0503h.m992y(context, i2) : null, i3 != 0 ? AbstractC0503h.m992y(context, i3) : null, i4 != 0 ? AbstractC0503h.m992y(context, i4) : null, i5 != 0 ? AbstractC0503h.m992y(context, i5) : null);
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? AbstractC0503h.m992y(context, i2) : null, i3 != 0 ? AbstractC0503h.m992y(context, i3) : null, i4 != 0 ? AbstractC0503h.m992y(context, i4) : null, i5 != 0 ? AbstractC0503h.m992y(context, i5) : null);
        C0666c0 c0666c0 = this.f2274c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }
}
