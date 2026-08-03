package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: t4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2527t4 extends ToggleButton {

    /* JADX INFO: renamed from: a */
    public final C1349e3 f8825a;

    /* JADX INFO: renamed from: b */
    public final C2175l4 f8826b;

    /* JADX INFO: renamed from: c */
    public C0391J3 f8827c;

    public C2527t4(Context r2, AttributeSet r3) {
        super(r2, r3, R.attr.buttonStyleToggle);
        AbstractC1042YA.m1987a(getContext(), this);
        C1349e3 r22 = new C1349e3(this);
        this.f8825a = r22;
        r22.m2603d(r3, R.attr.buttonStyleToggle);
        C2175l4 r23 = new C2175l4(this);
        this.f8826b = r23;
        r23.m4378f(r3, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m829b(r3, R.attr.buttonStyleToggle);
    }

    private C0391J3 getEmojiTextViewHelper() {
        if (this.f8827c != null) goto L6;
        this.f8827c = new C0391J3(this);
    L6:
        return this.f8827c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1349e3 r0 = this.f8825a;
        if (r0 == null) goto L5;
        r0.m2600a();
    L5:
        C2175l4 r02 = this.f8826b;
        if (r02 == null) goto L9;
        r02.m4375b();
        return;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 r0 = this.f8825a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2601b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 r0 = this.f8825a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2602c();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8826b.m4376d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8826b.m4377e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        getEmojiTextViewHelper().m830c(r2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        C1349e3 r12 = this.f8825a;
        if (r12 == null) goto L6;
        r12.m2604e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C1349e3 r0 = this.f8825a;
        if (r0 == null) goto L6;
        r0.m2605f(r2);
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        C2175l4 r12 = this.f8826b;
        if (r12 == null) goto L6;
        r12.m4375b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        C2175l4 r12 = this.f8826b;
        if (r12 == null) goto L6;
        r12.m4375b();
        return;
    }

    public void setEmojiCompatEnabled(boolean r2) {
        getEmojiTextViewHelper().m831d(r2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] r2) {
        super.setFilters(getEmojiTextViewHelper().m828a(r2));
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        C1349e3 r0 = this.f8825a;
        if (r0 == null) goto L6;
        r0.m2607h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C1349e3 r0 = this.f8825a;
        if (r0 == null) goto L6;
        r0.m2608i(r2);
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        C2175l4 r0 = this.f8826b;
        r0.m4380i(r2);
        r0.m4375b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        C2175l4 r0 = this.f8826b;
        r0.m4381j(r2);
        r0.m4375b();
    }
}
