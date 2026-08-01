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

/* JADX INFO: renamed from: u2 */
/* JADX INFO: loaded from: classes.dex */
public class C0767u2 extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d */
    public static final int[] f4646d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a */
    public final C0804v2 f4647a;

    /* JADX INFO: renamed from: b */
    public final C0139d5 f4648b;

    /* JADX INFO: renamed from: c */
    public final C0138d4 f4649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0767u2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ljx.wechatmod.R.attr.autoCompleteTextViewStyle);
        x60.m2614a(context);
        r60.m2247a(this, getContext());
        C0659r5 c0659r5M2219y = C0659r5.m2219y(getContext(), attributeSet, f4646d, com.ljx.wechatmod.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c0659r5M2219y.f4209b).hasValue(0)) {
            setDropDownBackgroundDrawable(c0659r5M2219y.m2234m(0));
        }
        c0659r5M2219y.m2245z();
        C0804v2 c0804v2 = new C0804v2(this);
        this.f4647a = c0804v2;
        c0804v2.m2482d(attributeSet, com.ljx.wechatmod.R.attr.autoCompleteTextViewStyle);
        C0139d5 c0139d5 = new C0139d5(this);
        this.f4648b = c0139d5;
        c0139d5.m916f(attributeSet, com.ljx.wechatmod.R.attr.autoCompleteTextViewStyle);
        c0139d5.m913b();
        C0138d4 c0138d4 = new C0138d4(this, 3);
        this.f4649c = c0138d4;
        c0138d4.mo904z(attributeSet, com.ljx.wechatmod.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM900u = c0138d4.m900u(keyListener);
        if (keyListenerM900u == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM900u);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0804v2 c0804v2 = this.f4647a;
        if (c0804v2 != null) {
            c0804v2.m2479a();
        }
        C0139d5 c0139d5 = this.f4648b;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof o60 ? ((o60) customSelectionActionModeCallback).f3499a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0804v2 c0804v2 = this.f4647a;
        if (c0804v2 != null) {
            return c0804v2.m2480b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0804v2 c0804v2 = this.f4647a;
        if (c0804v2 != null) {
            return c0804v2.m2481c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4648b.m914d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4648b.m915e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a80.m57v(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f4649c.m872C(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0804v2 c0804v2 = this.f4647a;
        if (c0804v2 != null) {
            c0804v2.m2483e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0804v2 c0804v2 = this.f4647a;
        if (c0804v2 != null) {
            c0804v2.m2484f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f4648b;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f4648b;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0979zt.m2822S(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC0222ff.m1196r(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f4649c.m880K(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4649c.m900u(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0804v2 c0804v2 = this.f4647a;
        if (c0804v2 != null) {
            c0804v2.m2486h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0804v2 c0804v2 = this.f4647a;
        if (c0804v2 != null) {
            c0804v2.m2487i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0139d5 c0139d5 = this.f4648b;
        c0139d5.m921l(colorStateList);
        c0139d5.m913b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0139d5 c0139d5 = this.f4648b;
        c0139d5.m922m(mode);
        c0139d5.m913b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0139d5 c0139d5 = this.f4648b;
        if (c0139d5 != null) {
            c0139d5.m917g(context, i);
        }
    }
}
