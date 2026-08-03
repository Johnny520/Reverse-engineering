package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: renamed from: h3 */
/* JADX INFO: loaded from: classes.dex */
public class C1481h3 extends CheckBox implements InterfaceC2182lB {

    /* JADX INFO: renamed from: a */
    public final C2082j3 f5228a;

    /* JADX INFO: renamed from: b */
    public final C1349e3 f5229b;

    /* JADX INFO: renamed from: c */
    public final C2175l4 f5230c;

    /* JADX INFO: renamed from: d */
    public C0391J3 f5231d;

    public C1481h3(Context r1, AttributeSet r2, int r3) {
        AbstractC1533iB.m2903a(r1);
        super(r1, r2, r3);
        AbstractC1042YA.m1987a(getContext(), this);
        C2082j3 r12 = new C2082j3(this);
        this.f5228a = r12;
        r12.m4248c(r2, r3);
        C1349e3 r13 = new C1349e3(this);
        this.f5229b = r13;
        r13.m2603d(r2, r3);
        C2175l4 r14 = new C2175l4(this);
        this.f5230c = r14;
        r14.m4378f(r2, r3);
        getEmojiTextViewHelper().m829b(r2, r3);
    }

    private C0391J3 getEmojiTextViewHelper() {
        if (this.f5231d != null) goto L6;
        this.f5231d = new C0391J3(this);
    L6:
        return this.f5231d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1349e3 r0 = this.f5229b;
        if (r0 == null) goto L5;
        r0.m2600a();
    L5:
        C2175l4 r02 = this.f5230c;
        if (r02 == null) goto L9;
        r02.m4375b();
        return;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 r0 = this.f5229b;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2601b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 r0 = this.f5229b;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2602c();
    }

    @Override // p000.InterfaceC2182lB
    public ColorStateList getSupportButtonTintList() {
        C2082j3 r0 = this.f5228a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f7338a;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C2082j3 r0 = this.f5228a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.f7339b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5230c.m4376d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5230c.m4377e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        getEmojiTextViewHelper().m830c(r2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        C1349e3 r12 = this.f5229b;
        if (r12 == null) goto L6;
        r12.m2604e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C1349e3 r0 = this.f5229b;
        if (r0 == null) goto L6;
        r0.m2605f(r2);
        return;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable r2) {
        super.setButtonDrawable(r2);
        C2082j3 r22 = this.f5228a;
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
    public void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        C2175l4 r12 = this.f5230c;
        if (r12 == null) goto L6;
        r12.m4375b();
        return;
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        C2175l4 r12 = this.f5230c;
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
        C1349e3 r0 = this.f5229b;
        if (r0 == null) goto L6;
        r0.m2607h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C1349e3 r0 = this.f5229b;
        if (r0 == null) goto L6;
        r0.m2608i(r2);
        return;
    }

    @Override // p000.InterfaceC2182lB
    public void setSupportButtonTintList(ColorStateList r2) {
        C2082j3 r0 = this.f5228a;
        if (r0 == null) goto L6;
        r0.f7338a = r2;
        r0.f7340c = true;
        r0.m4246a();
        return;
    }

    @Override // p000.InterfaceC2182lB
    public void setSupportButtonTintMode(PorterDuff.Mode r2) {
        C2082j3 r0 = this.f5228a;
        if (r0 == null) goto L6;
        r0.f7339b = r2;
        r0.f7341d = true;
        r0.m4246a();
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        C2175l4 r0 = this.f5230c;
        r0.m4380i(r2);
        r0.m4375b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        C2175l4 r0 = this.f5230c;
        r0.m4381j(r2);
        r0.m4375b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
        setButtonDrawable(AbstractC1406fG.m2695U(getContext(), r2));
    }
}
