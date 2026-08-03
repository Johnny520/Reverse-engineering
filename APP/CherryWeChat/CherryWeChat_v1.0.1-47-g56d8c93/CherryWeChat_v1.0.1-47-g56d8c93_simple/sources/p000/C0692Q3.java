package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: Q3 */
/* JADX INFO: loaded from: classes.dex */
public class C0692Q3 extends RadioButton implements InterfaceC2182lB {

    /* JADX INFO: renamed from: a */
    public final C2082j3 f2228a;

    /* JADX INFO: renamed from: b */
    public final C1349e3 f2229b;

    /* JADX INFO: renamed from: c */
    public final C2175l4 f2230c;

    /* JADX INFO: renamed from: d */
    public C0391J3 f2231d;

    public C0692Q3(Context r2, AttributeSet r3) {
        AbstractC1533iB.m2903a(r2);
        super(r2, r3, R.attr.radioButtonStyle);
        AbstractC1042YA.m1987a(getContext(), this);
        C2082j3 r22 = new C2082j3(this);
        this.f2228a = r22;
        r22.m4248c(r3, R.attr.radioButtonStyle);
        C1349e3 r23 = new C1349e3(this);
        this.f2229b = r23;
        r23.m2603d(r3, R.attr.radioButtonStyle);
        C2175l4 r24 = new C2175l4(this);
        this.f2230c = r24;
        r24.m4378f(r3, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().m829b(r3, R.attr.radioButtonStyle);
    }

    private C0391J3 getEmojiTextViewHelper() {
        if (this.f2231d != null) goto L6;
        this.f2231d = new C0391J3(this);
    L6:
        return this.f2231d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1349e3 r0 = this.f2229b;
        if (r0 == null) goto L5;
        r0.m2600a();
    L5:
        C2175l4 r02 = this.f2230c;
        if (r02 == null) goto L9;
        r02.m4375b();
        return;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 r0 = this.f2229b;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2601b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 r0 = this.f2229b;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2602c();
    }

    @Override // p000.InterfaceC2182lB
    public ColorStateList getSupportButtonTintList() {
        C2082j3 r0 = this.f2228a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f7338a;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C2082j3 r0 = this.f2228a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f7339b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2230c.m4376d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2230c.m4377e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        getEmojiTextViewHelper().m830c(r2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        C1349e3 r12 = this.f2229b;
        if (r12 == null) goto L6;
        r12.m2604e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C1349e3 r0 = this.f2229b;
        if (r0 == null) goto L6;
        r0.m2605f(r2);
        return;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable r2) {
        super.setButtonDrawable(r2);
        C2082j3 r22 = this.f2228a;
        if (r22 != null) goto L5;
        return;
    L5:
        if (r22.f7342e == false) goto L8;
        r22.f7342e = false;
        return;
    L8:
        r22.f7342e = true;
        r22.m4246a();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        C2175l4 r12 = this.f2230c;
        if (r12 == null) goto L6;
        r12.m4375b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        C2175l4 r12 = this.f2230c;
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
        C1349e3 r0 = this.f2229b;
        if (r0 == null) goto L6;
        r0.m2607h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C1349e3 r0 = this.f2229b;
        if (r0 == null) goto L6;
        r0.m2608i(r2);
        return;
    }

    @Override // p000.InterfaceC2182lB
    public void setSupportButtonTintList(ColorStateList r2) {
        C2082j3 r0 = this.f2228a;
        if (r0 == null) goto L6;
        r0.f7338a = r2;
        r0.f7340c = true;
        r0.m4246a();
        return;
    }

    @Override // p000.InterfaceC2182lB
    public void setSupportButtonTintMode(PorterDuff.Mode r2) {
        C2082j3 r0 = this.f2228a;
        if (r0 == null) goto L6;
        r0.f7339b = r2;
        r0.f7341d = true;
        r0.m4246a();
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        C2175l4 r0 = this.f2230c;
        r0.m4380i(r2);
        r0.m4375b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        C2175l4 r0 = this.f2230c;
        r0.m4381j(r2);
        r0.m4375b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
        setButtonDrawable(AbstractC1406fG.m2695U(getContext(), r2));
    }
}
