package p069i;

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
import p004C.C0064h;
import p052b1.AbstractC0503h;

/* JADX INFO: renamed from: i.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0608A extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: e */
    public static final int[] f2109e = {R.attr.popupBackground};

    /* JADX INFO: renamed from: b */
    public final C0704p f2110b;

    /* JADX INFO: renamed from: c */
    public final C0666c0 f2111c;

    /* JADX INFO: renamed from: d */
    public final C0612C f2112d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0608A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.p055lu.wxmask272.R.attr.autoCompleteTextViewStyle);
        AbstractC0673e1.m1303a(context);
        AbstractC0670d1.m1297a(this, getContext());
        C0064h c0064hM114t = C0064h.m114t(getContext(), attributeSet, f2109e, com.p055lu.wxmask272.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c0064hM114t.f309c).hasValue(0)) {
            setDropDownBackgroundDrawable(c0064hM114t.m123m(0));
        }
        c0064hM114t.m130v();
        C0704p c0704p = new C0704p(this);
        this.f2110b = c0704p;
        c0704p.m1330d(attributeSet, com.p055lu.wxmask272.R.attr.autoCompleteTextViewStyle);
        C0666c0 c0666c0 = new C0666c0(this);
        this.f2111c = c0666c0;
        c0666c0.m1284f(attributeSet, com.p055lu.wxmask272.R.attr.autoCompleteTextViewStyle);
        c0666c0.m1281b();
        C0612C c0612c = new C0612C(this);
        this.f2112d = c0612c;
        c0612c.mo1213b(attributeSet, com.p055lu.wxmask272.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM1212a = c0612c.m1212a(keyListener);
        if (keyListenerM1212a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM1212a);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0704p c0704p = this.f2110b;
        if (c0704p != null) {
            c0704p.m1327a();
        }
        C0666c0 c0666c0 = this.f2111c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportBackgroundTintList() {
        C0704p c0704p = this.f2110b;
        if (c0704p != null) {
            return c0704p.m1328b();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0704p c0704p = this.f2110b;
        if (c0704p != null) {
            return c0704p.m1329c();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2111c.m1282d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2111c.m1283e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0503h.m972H(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f2112d.m1214c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0704p c0704p = this.f2110b;
        if (c0704p != null) {
            c0704p.m1331e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0704p c0704p = this.f2110b;
        if (c0704p != null) {
            c0704p.m1332f(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0666c0 c0666c0 = this.f2111c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0666c0 c0666c0 = this.f2111c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(AbstractC0503h.m992y(getContext(), i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEmojiCompatEnabled(boolean z2) {
        this.f2112d.m1215d(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2112d.m1212a(keyListener));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0704p c0704p = this.f2110b;
        if (c0704p != null) {
            c0704p.m1334h(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0704p c0704p = this.f2110b;
        if (c0704p != null) {
            c0704p.m1335i(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0666c0 c0666c0 = this.f2111c;
        c0666c0.m1289l(colorStateList);
        c0666c0.m1281b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0666c0 c0666c0 = this.f2111c;
        c0666c0.m1290m(mode);
        c0666c0.m1281b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0666c0 c0666c0 = this.f2111c;
        if (c0666c0 != null) {
            c0666c0.m1285g(context, i2);
        }
    }
}
