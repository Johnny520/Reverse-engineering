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
import androidx.appcompat.app.C0960;
import androidx.core.widget.AbstractC3129;
import androidx.core.widget.ActionModeCallbackC3132;
import androidx.window.area.AbstractC3400;
import io.ktor.client.plugins.AbstractC4765;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p069.AbstractC7390;
import p168.AbstractC8421;
import p168.C8422;
import p180.AbstractC8492;
import p269.AbstractC9019;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1072 extends TextView {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f1189;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0974 f1190;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C0960 f1191;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Future f1192;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1059 f1193;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0980 f1194;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1038 f1195;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1072(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC0988.m1157(context);
        this.f1189 = false;
        this.f1191 = null;
        AbstractC0999.m1167(getContext(), this);
        C1038 c1038 = new C1038(this);
        this.f1195 = c1038;
        c1038.m1226(attributeSet, i);
        C1059 c1059 = new C1059(this);
        this.f1193 = c1059;
        c1059.m1267(attributeSet, i);
        c1059.m1270();
        C0980 c0980 = new C0980();
        c0980.f930 = this;
        this.f1194 = c0980;
        getEmojiTextViewHelper().m1095(attributeSet, i);
    }

    private C0974 getEmojiTextViewHelper() {
        if (this.f1190 == null) {
            this.f1190 = new C0974(this);
        }
        return this.f1190;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1038 c1038 = this.f1195;
        if (c1038 != null) {
            c1038.m1238();
        }
        C1059 c1059 = this.f1193;
        if (c1059 != null) {
            c1059.m1270();
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
        return customSelectionActionModeCallback instanceof ActionModeCallbackC3132 ? ((ActionModeCallbackC3132) customSelectionActionModeCallback).f7042 : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC1058 getSuperCaller() {
        if (this.f1191 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f1191 = new C1056(this);
            } else if (i >= 28) {
                this.f1191 = new C1057(this);
            } else {
                this.f1191 = new C0960(this, 3);
            }
        }
        return this.f1191;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1038 c1038 = this.f1195;
        if (c1038 != null) {
            return c1038.m1241();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1038 c1038 = this.f1195;
        if (c1038 != null) {
            return c1038.m1242();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1193.m1269();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1193.m1268();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f1192;
        if (future != null) {
            try {
                this.f1192 = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC7390.m12605(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0980 c0980;
        if (Build.VERSION.SDK_INT >= 28 || (c0980 = this.f1194) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0980.f929;
        return textClassifier == null ? AbstractC1078.m1294((TextView) c0980.f930) : textClassifier;
    }

    public C8422 getTextMetricsParamsCompat() {
        return AbstractC7390.m12605(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1193.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            AbstractC5894.m10579(editorInfo, getText());
        }
        AbstractC3400.m5623(editorInfo, inputConnectionOnCreateInputConnection, this);
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
        C1059 c1059 = this.f1193;
        if (c1059 != null) {
            c1059.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f1192;
        if (future != null) {
            try {
                this.f1192 = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC7390.m12605(this);
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
        getEmojiTextViewHelper().m1094(z);
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
        C1038 c1038 = this.f1195;
        if (c1038 != null) {
            c1038.m1224();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1038 c1038 = this.f1195;
        if (c1038 != null) {
            c1038.m1223(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1059 c1059 = this.f1193;
        if (c1059 != null) {
            c1059.m1270();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1059 c1059 = this.f1193;
        if (c1059 != null) {
            c1059.m1270();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC4765.m8871(context, i) : null, i2 != 0 ? AbstractC4765.m8871(context, i2) : null, i3 != 0 ? AbstractC4765.m8871(context, i3) : null, i4 != 0 ? AbstractC4765.m8871(context, i4) : null);
        C1059 c1059 = this.f1193;
        if (c1059 != null) {
            c1059.m1270();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC4765.m8871(context, i) : null, i2 != 0 ? AbstractC4765.m8871(context, i2) : null, i3 != 0 ? AbstractC4765.m8871(context, i3) : null, i4 != 0 ? AbstractC4765.m8871(context, i4) : null);
        C1059 c1059 = this.f1193;
        if (c1059 != null) {
            c1059.m1270();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC7390.m12619(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m1093(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC9019) getEmojiTextViewHelper().f906.f16359).mo13548(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1008(i);
        } else {
            AbstractC7390.m12615(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1013(i);
        } else {
            AbstractC7390.m12624(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().mo1007(i, f);
        } else if (i2 >= 34) {
            AbstractC3129.m4881(this, i, f);
        } else {
            AbstractC7390.m12625(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(AbstractC8421 abstractC8421) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC7390.m12605(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1038 c1038 = this.f1195;
        if (c1038 != null) {
            c1038.m1218(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1038 c1038 = this.f1195;
        if (c1038 != null) {
            c1038.m1221(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1059 c1059 = this.f1193;
        c1059.m1272(colorStateList);
        c1059.m1270();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1059 c1059 = this.f1193;
        c1059.m1274(mode);
        c1059.m1270();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1059 c1059 = this.f1193;
        if (c1059 != null) {
            c1059.m1273(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0980 c0980;
        if (Build.VERSION.SDK_INT >= 28 || (c0980 = this.f1194) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0980.f929 = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC8421> future) {
        this.f1192 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C8422 c8422) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c8422.f20925;
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
        getPaint().set(c8422.f20926);
        setBreakStrategy(c8422.f20924);
        setHyphenationFrequency(c8422.f20923);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f1189) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC7390 abstractC7390 = AbstractC8492.f21148;
            if (context == null) {
                C6755.m11869("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f1189 = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f1189 = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC7390.m12625(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1059 c1059 = this.f1193;
        if (c1059 != null) {
            c1059.m1270();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1059 c1059 = this.f1193;
        if (c1059 != null) {
            c1059.m1270();
        }
    }

    public C1072(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
