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
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: renamed from: b4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0055b4 extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: d */
    public static final int[] f671d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a */
    public final C0803v2 f672a;

    /* JADX INFO: renamed from: b */
    public final C0139d5 f673b;

    /* JADX INFO: renamed from: c */
    public final C0138d4 f674c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0055b4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ljx.wechatmod.R.attr.autoCompleteTextViewStyle);
        d70.m881a(context);
        x60.m2635a(this, getContext());
        C0658r5 c0658r5M2226y = C0658r5.m2226y(getContext(), attributeSet, f671d, com.ljx.wechatmod.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c0658r5M2226y.f4064b).hasValue(0)) {
            setDropDownBackgroundDrawable(c0658r5M2226y.m2241m(0));
        }
        c0658r5M2226y.m2252z();
        C0803v2 c0803v2 = new C0803v2(this);
        this.f672a = c0803v2;
        c0803v2.m2536d(attributeSet, com.ljx.wechatmod.R.attr.autoCompleteTextViewStyle);
        C0139d5 c0139d5 = new C0139d5(this);
        this.f673b = c0139d5;
        c0139d5.m873f(attributeSet, com.ljx.wechatmod.R.attr.autoCompleteTextViewStyle);
        c0139d5.m870b();
        C0138d4 c0138d4 = new C0138d4(this, 3);
        this.f674c = c0138d4;
        c0138d4.mo864z(attributeSet, com.ljx.wechatmod.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM860u = c0138d4.m860u(keyListener);
        if (keyListenerM860u == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM860u);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0803v2 c0803v2 = this.f672a;
        if (c0803v2 != null) {
            c0803v2.m2533a();
        }
        C0139d5 c0139d5 = this.f673b;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0803v2 c0803v2 = this.f672a;
        if (c0803v2 != null) {
            return c0803v2.m2534b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0803v2 c0803v2 = this.f672a;
        if (c0803v2 != null) {
            return c0803v2.m2535c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f673b.m871d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f673b.m872e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        g80.m1171B(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f674c.m831C(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0803v2 c0803v2 = this.f672a;
        if (c0803v2 != null) {
            c0803v2.m2537e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0803v2 c0803v2 = this.f672a;
        if (c0803v2 != null) {
            c0803v2.m2538f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f673b;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f673b;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC0259gf.m1261w(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f674c.m839K(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f674c.m860u(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0803v2 c0803v2 = this.f672a;
        if (c0803v2 != null) {
            c0803v2.m2540h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0803v2 c0803v2 = this.f672a;
        if (c0803v2 != null) {
            c0803v2.m2541i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0139d5 c0139d5 = this.f673b;
        c0139d5.m878l(colorStateList);
        c0139d5.m870b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0139d5 c0139d5 = this.f673b;
        c0139d5.m879m(mode);
        c0139d5.m870b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0139d5 c0139d5 = this.f673b;
        if (c0139d5 != null) {
            c0139d5.m874g(context, i);
        }
    }
}
