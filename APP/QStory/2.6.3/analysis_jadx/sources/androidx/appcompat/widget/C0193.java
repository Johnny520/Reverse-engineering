package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.appcompat.app.C0108;
import androidx.core.view.AbstractC2270;
import androidx.core.widget.ActionModeCallbackC2299;
import androidx.window.area.AbstractC2567;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.AbstractC3933;
import p053.AbstractC6561;
import p188.AbstractC7773;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0193 extends CheckedTextView {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0127 f757;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0191 f758;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0212 f759;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0194 f760;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0193(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC0141.m597(context);
        AbstractC0152.m607(getContext(), this);
        C0212 c0212 = new C0212(this);
        this.f759 = c0212;
        c0212.m707(attributeSet, R.attr.checkedTextViewStyle);
        c0212.m710();
        C0191 c0191 = new C0191(this);
        this.f758 = c0191;
        c0191.m666(attributeSet, R.attr.checkedTextViewStyle);
        this.f760 = new C0194(this);
        Context context2 = getContext();
        int[] iArr = AbstractC7773.f21105;
        C0108 c0108M354 = C0108.m354(R.attr.checkedTextViewStyle, 0, context2, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0108M354.f320;
        AbstractC2270.m4243(this, getContext(), iArr, attributeSet, (TypedArray) c0108M354.f320, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC3933.m8312(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(AbstractC3933.m8312(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC3933.m8312(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c0108M354.m385(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC0216.m722(typedArray.getInt(3, -1), null));
            }
            c0108M354.m363();
            getEmojiTextViewHelper().m535(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c0108M354.m363();
            throw th;
        }
    }

    private C0127 getEmojiTextViewHelper() {
        if (this.f757 == null) {
            this.f757 = new C0127(this);
        }
        return this.f757;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0212 c0212 = this.f759;
        if (c0212 != null) {
            c0212.m710();
        }
        C0191 c0191 = this.f758;
        if (c0191 != null) {
            c0191.m678();
        }
        C0194 c0194 = this.f760;
        if (c0194 != null) {
            c0194.m698();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC2299 ? ((ActionModeCallbackC2299) customSelectionActionModeCallback).f6697 : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0191 c0191 = this.f758;
        if (c0191 != null) {
            return c0191.m681();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0191 c0191 = this.f758;
        if (c0191 != null) {
            return c0191.m682();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0194 c0194 = this.f760;
        if (c0194 != null) {
            return (ColorStateList) c0194.f766;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0194 c0194 = this.f760;
        if (c0194 != null) {
            return (PorterDuff.Mode) c0194.f765;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f759.m709();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f759.m708();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC2567.m5063(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m534(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0191 c0191 = this.f758;
        if (c0191 != null) {
            c0191.m664();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0191 c0191 = this.f758;
        if (c0191 != null) {
            c0191.m663(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0194 c0194 = this.f760;
        if (c0194 != null) {
            if (c0194.f762) {
                c0194.f762 = false;
            } else {
                c0194.f762 = true;
                c0194.m698();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f759;
        if (c0212 != null) {
            c0212.m710();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f759;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0191 c0191 = this.f758;
        if (c0191 != null) {
            c0191.m658(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0191 c0191 = this.f758;
        if (c0191 != null) {
            c0191.m661(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0194 c0194 = this.f760;
        if (c0194 != null) {
            c0194.f766 = colorStateList;
            c0194.f764 = true;
            c0194.m698();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0194 c0194 = this.f760;
        if (c0194 != null) {
            c0194.f765 = mode;
            c0194.f763 = true;
            c0194.m698();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0212 c0212 = this.f759;
        c0212.m712(colorStateList);
        c0212.m710();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0212 c0212 = this.f759;
        c0212.m714(mode);
        c0212.m710();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0212 c0212 = this.f759;
        if (c0212 != null) {
            c0212.m713(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC3933.m8312(getContext(), i));
    }
}
