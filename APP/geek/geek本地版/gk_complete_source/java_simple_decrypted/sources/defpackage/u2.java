package defpackage;

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

/* JADX INFO: loaded from: classes.dex */
public class u2 extends AutoCompleteTextView {
    public static final int[] d = null;
    public final v2 a;
    public final d5 b;
    public final d4 c;

    static {
        d = new int[]{R.attr.popupBackground};
    }

    public u2(Context r5, AttributeSet r6) {
        x60.a(r5);
        super(r5, r6, com.ljx.wechatmod.R.attr.autoCompleteTextViewStyle);
        r60.a(this, getContext());
        r5 r52 = r5.y(getContext(), r6, d, com.ljx.wechatmod.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) r52.b).hasValue(0) == false) goto L5;
        setDropDownBackgroundDrawable(r52.m(0));
    L5:
        r52.z();
        v2 r53 = new v2(this);
        this.a = r53;
        r53.d(r6, com.ljx.wechatmod.R.attr.autoCompleteTextViewStyle);
        d5 r54 = new d5(this);
        this.b = r54;
        r54.f(r6, com.ljx.wechatmod.R.attr.autoCompleteTextViewStyle);
        r54.b();
        d4 r55 = new d4(this, 3);
        this.c = r55;
        r55.z(r6, com.ljx.wechatmod.R.attr.autoCompleteTextViewStyle);
        KeyListener r62 = getKeyListener();
        if ((r62 instanceof NumberKeyListener) == true) goto L12;
        boolean r0 = super.isFocusable();
        boolean r1 = super.isClickable();
        boolean r2 = super.isLongClickable();
        int r3 = super.getInputType();
        KeyListener r56 = r55.u(r62);
        if (r56 == r62) goto L13;
        super.setKeyListener(r56);
        super.setRawInputType(r3);
        super.setFocusable(r0);
        super.setClickable(r1);
        super.setLongClickable(r2);
        return;
    L13:
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        v2 r0 = this.a;
        if (r0 == null) goto L5;
        r0.a();
    L5:
        d5 r02 = this.b;
        if (r02 == null) goto L9;
        r02.b();
        return;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback r0 = super.getCustomSelectionActionModeCallback();
        if ((r0 instanceof o60) == true) goto L5;
        return r0;
    L5:
        return ((o60) r0).a;
    }

    public ColorStateList getSupportBackgroundTintList() {
        v2 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        v2 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.c();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo r3) {
        InputConnection r0 = super.onCreateInputConnection(r3);
        a80.v(r3, r0, this);
        return this.c.C(r0, r3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        v2 r12 = this.a;
        if (r12 == null) goto L6;
        r12.e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.f(r2);
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        d5 r12 = this.b;
        if (r12 == null) goto L6;
        r12.b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        d5 r12 = this.b;
        if (r12 == null) goto L6;
        r12.b();
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(zt.S(r1, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int r2) {
        setDropDownBackgroundDrawable(ff.r(getContext(), r2));
    }

    public void setEmojiCompatEnabled(boolean r2) {
        this.c.K(r2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener r2) {
        super.setKeyListener(this.c.u(r2));
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.i(r2);
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        d5 r0 = this.b;
        r0.l(r2);
        r0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        d5 r0 = this.b;
        r0.m(r2);
        r0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context r2, int r3) {
        super.setTextAppearance(r2, r3);
        d5 r0 = this.b;
        if (r0 == null) goto L6;
        r0.g(r2, r3);
        return;
    }
}
