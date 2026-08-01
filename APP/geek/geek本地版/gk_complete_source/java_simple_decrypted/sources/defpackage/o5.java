package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes.dex */
public final class o5 extends ToggleButton {
    public final v2 a;
    public final d5 b;
    public x3 c;

    public o5(Context r2, AttributeSet r3) {
        super(r2, r3, R.attr.buttonStyleToggle);
        r60.a(this, getContext());
        v2 r22 = new v2(this);
        this.a = r22;
        r22.d(r3, R.attr.buttonStyleToggle);
        d5 r23 = new d5(this);
        this.b = r23;
        r23.f(r3, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(r3, R.attr.buttonStyleToggle);
    }

    private x3 getEmojiTextViewHelper() {
        if (this.c != null) goto L6;
        this.c = new x3(this);
    L6:
        return this.c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        getEmojiTextViewHelper().b(r2);
    }

    @Override // android.widget.ToggleButton, android.view.View
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

    public void setEmojiCompatEnabled(boolean r2) {
        getEmojiTextViewHelper().c(r2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] r2) {
        super.setFilters(((a80) getEmojiTextViewHelper().b.b).l(r2));
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
}
