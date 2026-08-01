package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.appcompat.app.C0108;
import androidx.window.area.AbstractC2567;
import io.ktor.client.plugins.AbstractC3933;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0135 extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final int[] f587 = {R.attr.popupBackground};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0212 f588;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0133 f589;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0191 f590;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0135(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.autoCompleteTextViewStyle);
        AbstractC0141.m597(context);
        AbstractC0152.m607(getContext(), this);
        C0108 c0108M354 = C0108.m354(com.davemorrissey.labs.subscaleview.R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, f587);
        if (((TypedArray) c0108M354.f320).hasValue(0)) {
            setDropDownBackgroundDrawable(c0108M354.m390(0));
        }
        c0108M354.m363();
        C0191 c0191 = new C0191(this);
        this.f590 = c0191;
        c0191.m666(attributeSet, com.davemorrissey.labs.subscaleview.R.attr.autoCompleteTextViewStyle);
        C0212 c0212 = new C0212(this);
        this.f588 = c0212;
        c0212.m707(attributeSet, com.davemorrissey.labs.subscaleview.R.attr.autoCompleteTextViewStyle);
        c0212.m710();
        C0133 c0133 = new C0133(this);
        this.f589 = c0133;
        c0133.mo531(attributeSet, com.davemorrissey.labs.subscaleview.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM559 = c0133.m559(keyListener);
        if (keyListenerM559 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM559);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0191 c0191 = this.f590;
        if (c0191 != null) {
            c0191.m678();
        }
        C0212 c0212 = this.f588;
        if (c0212 != null) {
            c0212.m710();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0191 c0191 = this.f590;
        if (c0191 != null) {
            return c0191.m681();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0191 c0191 = this.f590;
        if (c0191 != null) {
            return c0191.m682();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f588.m709();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f588.m708();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC2567.m5063(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f589.m558(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0191 c0191 = this.f590;
        if (c0191 != null) {
            c0191.m664();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0191 c0191 = this.f590;
        if (c0191 != null) {
            c0191.m663(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f588;
        if (c0212 != null) {
            c0212.m710();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f588;
        if (c0212 != null) {
            c0212.m710();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC3933.m8312(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f589.m557(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f589.m559(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0191 c0191 = this.f590;
        if (c0191 != null) {
            c0191.m658(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0191 c0191 = this.f590;
        if (c0191 != null) {
            c0191.m661(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0212 c0212 = this.f588;
        c0212.m712(colorStateList);
        c0212.m710();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0212 c0212 = this.f588;
        c0212.m714(mode);
        c0212.m710();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0212 c0212 = this.f588;
        if (c0212 != null) {
            c0212.m713(context, i);
        }
    }
}
