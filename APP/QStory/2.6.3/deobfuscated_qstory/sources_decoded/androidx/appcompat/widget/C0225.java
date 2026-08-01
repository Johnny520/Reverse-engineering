package androidx.appcompat.widget;

import android.R;
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
import androidx.appcompat.app.C0113;
import androidx.core.widget.AbstractC2296;
import androidx.core.widget.ActionModeCallbackC2299;
import androidx.window.area.AbstractC2567;
import io.ktor.client.plugins.AbstractC3933;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p053.AbstractC6561;
import p152.AbstractC7592;
import p152.C7593;
import p164.AbstractC7663;
import p253.AbstractC8190;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0225 extends TextView {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f844;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0127 f845;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C0113 f846;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Future f847;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0212 f848;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0133 f849;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0191 f850;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0225(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC0141.m597(context);
        this.f844 = false;
        this.f846 = null;
        AbstractC0152.m607(getContext(), this);
        C0191 c0191 = new C0191(this);
        this.f850 = c0191;
        c0191.m666(attributeSet, i);
        C0212 c0212 = new C0212(this);
        this.f848 = c0212;
        c0212.m707(attributeSet, i);
        c0212.m710();
        C0133 c0133 = new C0133();
        c0133.f585 = this;
        this.f849 = c0133;
        getEmojiTextViewHelper().m535(attributeSet, i);
    }

    private C0127 getEmojiTextViewHelper() {
        if (this.f845 == null) {
            this.f845 = new C0127(this);
        }
        return this.f845;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0191 c0191 = this.f850;
        if (c0191 != null) {
            c0191.m678();
        }
        C0212 c0212 = this.f848;
        if (c0212 != null) {
            c0212.m710();
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
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC2299 ? ((ActionModeCallbackC2299) customSelectionActionModeCallback).f6697 : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0211 getSuperCaller() {
        if (this.f846 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f846 = new C0209(this);
            } else if (i >= 28) {
                this.f846 = new C0210(this);
            } else {
                this.f846 = new C0113(this, 3);
            }
        }
        return this.f846;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0191 c0191 = this.f850;
        if (c0191 != null) {
            return c0191.m681();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0191 c0191 = this.f850;
        if (c0191 != null) {
            return c0191.m682();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f848.m709();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f848.m708();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f847;
        if (future != null) {
            try {
                this.f847 = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC6561.m12046(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0133 c0133;
        if (Build.VERSION.SDK_INT >= 28 || (c0133 = this.f849) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0133.f584;
        return textClassifier == null ? AbstractC0231.m734((TextView) c0133.f585) : textClassifier;
    }

    public C7593 getTextMetricsParamsCompat() {
        return AbstractC6561.m12046(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f848.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            AbstractC5062.m10020(editorInfo, getText());
        }
        AbstractC2567.m5063(editorInfo, inputConnectionOnCreateInputConnection, this);
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
        C0212 c0212 = this.f848;
        if (c0212 != null) {
            c0212.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f847;
        if (future != null) {
            try {
                this.f847 = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC6561.m12046(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m534(z);
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
        C0191 c0191 = this.f850;
        if (c0191 != null) {
            c0191.m664();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0191 c0191 = this.f850;
        if (c0191 != null) {
            c0191.m663(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f848;
        if (c0212 != null) {
            c0212.m710();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f848;
        if (c0212 != null) {
            c0212.m710();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC3933.m8312(context, i) : null, i2 != 0 ? AbstractC3933.m8312(context, i2) : null, i3 != 0 ? AbstractC3933.m8312(context, i3) : null, i4 != 0 ? AbstractC3933.m8312(context, i4) : null);
        C0212 c0212 = this.f848;
        if (c0212 != null) {
            c0212.m710();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC3933.m8312(context, i) : null, i2 != 0 ? AbstractC3933.m8312(context, i2) : null, i3 != 0 ? AbstractC3933.m8312(context, i3) : null, i4 != 0 ? AbstractC3933.m8312(context, i4) : null);
        C0212 c0212 = this.f848;
        if (c0212 != null) {
            c0212.m710();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC6561.m12060(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m533(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC8190) getEmojiTextViewHelper().f561.f16014).mo12989(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo448(i);
        } else {
            AbstractC6561.m12056(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo453(i);
        } else {
            AbstractC6561.m12065(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().mo447(i, f);
        } else if (i2 >= 34) {
            AbstractC2296.m4321(this, i, f);
        } else {
            AbstractC6561.m12066(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(AbstractC7592 abstractC7592) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC6561.m12046(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0191 c0191 = this.f850;
        if (c0191 != null) {
            c0191.m658(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0191 c0191 = this.f850;
        if (c0191 != null) {
            c0191.m661(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0212 c0212 = this.f848;
        c0212.m712(colorStateList);
        c0212.m710();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0212 c0212 = this.f848;
        c0212.m714(mode);
        c0212.m710();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0212 c0212 = this.f848;
        if (c0212 != null) {
            c0212.m713(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0133 c0133;
        if (Build.VERSION.SDK_INT >= 28 || (c0133 = this.f849) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0133.f584 = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC7592> future) {
        this.f847 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C7593 c7593) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c7593.f20580;
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
        getPaint().set(c7593.f20581);
        setBreakStrategy(c7593.f20579);
        setHyphenationFrequency(c7593.f20578);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f844) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC6561 abstractC6561 = AbstractC7663.f20803;
            if (context == null) {
                C5925.m11310("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f844 = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f844 = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC6561.m12066(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f848;
        if (c0212 != null) {
            c0212.m710();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f848;
        if (c0212 != null) {
            c0212.m710();
        }
    }

    public C0225(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
