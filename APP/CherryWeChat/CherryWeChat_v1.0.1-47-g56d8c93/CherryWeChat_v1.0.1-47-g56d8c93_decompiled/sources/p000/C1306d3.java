package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: d3 */
/* JADX INFO: loaded from: classes.dex */
public class C1306d3 extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d */
    public static final int[] f4753d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a */
    public final C1349e3 f4754a;

    /* JADX INFO: renamed from: b */
    public final C2175l4 f4755b;

    /* JADX INFO: renamed from: c */
    public final C0649P3 f4756c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306d3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, io.github.cherrywechat.R.attr.autoCompleteTextViewStyle);
        AbstractC1533iB.m2903a(context);
        AbstractC1042YA.m1987a(getContext(), this);
        C2656w4 c2656w4M5186A = C2656w4.m5186A(getContext(), attributeSet, f4753d, io.github.cherrywechat.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c2656w4M5186A.f9196b).hasValue(0)) {
            setDropDownBackgroundDrawable(c2656w4M5186A.m5210q(0));
        }
        c2656w4M5186A.m5195E();
        C1349e3 c1349e3 = new C1349e3(this);
        this.f4754a = c1349e3;
        c1349e3.m2603d(attributeSet, io.github.cherrywechat.R.attr.autoCompleteTextViewStyle);
        C2175l4 c2175l4 = new C2175l4(this);
        this.f4755b = c2175l4;
        c2175l4.m4378f(attributeSet, io.github.cherrywechat.R.attr.autoCompleteTextViewStyle);
        c2175l4.m4375b();
        C0649P3 c0649p3 = new C0649P3(this, 5);
        this.f4756c = c0649p3;
        c0649p3.mo1279J(attributeSet, io.github.cherrywechat.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM1273C = c0649p3.m1273C(keyListener);
        if (keyListenerM1273C == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM1273C);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1349e3 c1349e3 = this.f4754a;
        if (c1349e3 != null) {
            c1349e3.m2600a();
        }
        C2175l4 c2175l4 = this.f4755b;
        if (c2175l4 != null) {
            c2175l4.m4375b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 c1349e3 = this.f4754a;
        if (c1349e3 != null) {
            return c1349e3.m2601b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 c1349e3 = this.f4754a;
        if (c1349e3 != null) {
            return c1349e3.m2602c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4755b.m4376d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4755b.m4377e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0828TB.m1654x(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f4756c.m1280K(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1349e3 c1349e3 = this.f4754a;
        if (c1349e3 != null) {
            c1349e3.m2604e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1349e3 c1349e3 = this.f4754a;
        if (c1349e3 != null) {
            c1349e3.m2605f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2175l4 c2175l4 = this.f4755b;
        if (c2175l4 != null) {
            c2175l4.m4375b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2175l4 c2175l4 = this.f4755b;
        if (c2175l4 != null) {
            c2175l4.m4375b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC1406fG.m2695U(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f4756c.m1288S(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4756c.m1273C(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1349e3 c1349e3 = this.f4754a;
        if (c1349e3 != null) {
            c1349e3.m2607h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1349e3 c1349e3 = this.f4754a;
        if (c1349e3 != null) {
            c1349e3.m2608i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2175l4 c2175l4 = this.f4755b;
        c2175l4.m4380i(colorStateList);
        c2175l4.m4375b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2175l4 c2175l4 = this.f4755b;
        c2175l4.m4381j(mode);
        c2175l4.m4375b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2175l4 c2175l4 = this.f4755b;
        if (c2175l4 != null) {
            c2175l4.m4379g(context, i);
        }
    }
}
