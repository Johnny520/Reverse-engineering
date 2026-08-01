package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.ljx.wechatmod.R;

/* JADX INFO: loaded from: classes.dex */
public class e4 extends RadioButton implements a70 {
    public final a3 a;
    public final v2 b;
    public final d5 c;
    public x3 d;

    public e4(Context r2, AttributeSet r3) {
        x60.a(r2);
        super(r2, r3, R.attr.radioButtonStyle);
        r60.a(this, getContext());
        a3 r22 = new a3(this);
        this.a = r22;
        r22.d(r3, R.attr.radioButtonStyle);
        v2 r23 = new v2(this);
        this.b = r23;
        r23.d(r3, R.attr.radioButtonStyle);
        d5 r24 = new d5(this);
        this.c = r24;
        r24.f(r3, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(r3, R.attr.radioButtonStyle);
    }

    private x3 getEmojiTextViewHelper() {
        if (this.d != null) goto L6;
        this.d = new x3(this);
    L6:
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        v2 r0 = this.b;
        if (r0 == null) goto L5;
        r0.a();
    L5:
        d5 r02 = this.c;
        if (r02 == null) goto L9;
        r02.b();
        return;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int r0 = super.getCompoundPaddingLeft();
        a3 r1 = this.a;
        if (r1 == null) goto L5;
        r1.getClass();
    L5:
        return r0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        v2 r0 = this.b;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        v2 r0 = this.b;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.c();
    }

    @Override // defpackage.a70
    public ColorStateList getSupportButtonTintList() {
        a3 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return (ColorStateList) r0.a;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        a3 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return (PorterDuff.Mode) r0.b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        getEmojiTextViewHelper().b(r2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        v2 r12 = this.b;
        if (r12 == null) goto L6;
        r12.e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        v2 r0 = this.b;
        if (r0 == null) goto L6;
        r0.f(r2);
        return;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable r2) {
        super.setButtonDrawable(r2);
        a3 r22 = this.a;
        if (r22 != null) goto L5;
        return;
    L5:
        if (r22.e == false) goto L8;
        r22.e = false;
        return;
    L8:
        r22.e = true;
        r22.a();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        d5 r12 = this.c;
        if (r12 == null) goto L6;
        r12.b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        d5 r12 = this.c;
        if (r12 == null) goto L6;
        r12.b();
        return;
    }

    public void setEmojiCompatEnabled(boolean r2) {
        getEmojiTextViewHelper().c(r2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] r2) {
        super.setFilters(((a80) getEmojiTextViewHelper().b.b).l(r2));
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        v2 r0 = this.b;
        if (r0 == null) goto L6;
        r0.h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        v2 r0 = this.b;
        if (r0 == null) goto L6;
        r0.i(r2);
        return;
    }

    @Override // defpackage.a70
    public void setSupportButtonTintList(ColorStateList r2) {
        a3 r0 = this.a;
        if (r0 == null) goto L6;
        r0.a = r2;
        r0.c = true;
        r0.a();
        return;
    }

    @Override // defpackage.a70
    public void setSupportButtonTintMode(PorterDuff.Mode r2) {
        a3 r0 = this.a;
        if (r0 == null) goto L6;
        r0.b = r2;
        r0.d = true;
        r0.a();
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        d5 r0 = this.c;
        r0.l(r2);
        r0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        d5 r0 = this.c;
        r0.m(r2);
        r0.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
        setButtonDrawable(ff.r(getContext(), r2));
    }
}
