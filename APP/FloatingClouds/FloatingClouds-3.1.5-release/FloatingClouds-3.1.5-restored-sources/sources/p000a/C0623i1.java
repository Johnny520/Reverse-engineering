package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* JADX INFO: renamed from: a.i1 */
/* JADX INFO: loaded from: classes.dex */
public class C0623i1 extends RadioButton implements InterfaceC0770pf {

    /* JADX INFO: renamed from: a */
    public final C0219M0 f2298a;

    /* JADX INFO: renamed from: b */
    public final C0111G0 f2299b;

    /* JADX INFO: renamed from: c */
    public final C0756p1 f2300c;

    /* JADX INFO: renamed from: d */
    public C0490b1 f2301d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0623i1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0694lf.m1563a(context);
        C0542df.m1311a(this, getContext());
        C0219M0 c0219m0 = new C0219M0(this);
        this.f2298a = c0219m0;
        c0219m0.m597b(attributeSet, i);
        C0111G0 c0111g0 = new C0111G0(this);
        this.f2299b = c0111g0;
        c0111g0.m299d(attributeSet, i);
        C0756p1 c0756p1 = new C0756p1(this);
        this.f2300c = c0756p1;
        c0756p1.m1786f(attributeSet, i);
        getEmojiTextViewHelper().m1190b(attributeSet, i);
    }

    private C0490b1 getEmojiTextViewHelper() {
        if (this.f2301d == null) {
            this.f2301d = new C0490b1(this);
        }
        return this.f2301d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0111G0 c0111g0 = this.f2299b;
        if (c0111g0 != null) {
            c0111g0.m296a();
        }
        C0756p1 c0756p1 = this.f2300c;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0111G0 c0111g0 = this.f2299b;
        if (c0111g0 != null) {
            return c0111g0.m297b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0111G0 c0111g0 = this.f2299b;
        if (c0111g0 != null) {
            return c0111g0.m298c();
        }
        return null;
    }

    @Override // p000a.InterfaceC0770pf
    public ColorStateList getSupportButtonTintList() {
        C0219M0 c0219m0 = this.f2298a;
        if (c0219m0 != null) {
            return c0219m0.f735b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0219M0 c0219m0 = this.f2298a;
        if (c0219m0 != null) {
            return c0219m0.f736c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2300c.m1784d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2300c.m1785e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m1191c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0111G0 c0111g0 = this.f2299b;
        if (c0111g0 != null) {
            c0111g0.m300e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0111G0 c0111g0 = this.f2299b;
        if (c0111g0 != null) {
            c0111g0.m301f(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0219M0 c0219m0 = this.f2298a;
        if (c0219m0 != null) {
            if (c0219m0.f739f) {
                c0219m0.f739f = false;
            } else {
                c0219m0.f739f = true;
                c0219m0.m596a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0756p1 c0756p1 = this.f2300c;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0756p1 c0756p1 = this.f2300c;
        if (c0756p1 != null) {
            c0756p1.m1783b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m1192d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m1189a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0111G0 c0111g0 = this.f2299b;
        if (c0111g0 != null) {
            c0111g0.m303h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0111G0 c0111g0 = this.f2299b;
        if (c0111g0 != null) {
            c0111g0.m304i(mode);
        }
    }

    @Override // p000a.InterfaceC0770pf
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0219M0 c0219m0 = this.f2298a;
        if (c0219m0 != null) {
            c0219m0.f735b = colorStateList;
            c0219m0.f737d = true;
            c0219m0.m596a();
        }
    }

    @Override // p000a.InterfaceC0770pf
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0219M0 c0219m0 = this.f2298a;
        if (c0219m0 != null) {
            c0219m0.f736c = mode;
            c0219m0.f738e = true;
            c0219m0.m596a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0756p1 c0756p1 = this.f2300c;
        c0756p1.m1788i(colorStateList);
        c0756p1.m1783b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0756p1 c0756p1 = this.f2300c;
        c0756p1.m1789j(mode);
        c0756p1.m1783b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0889w1.m2115A(getContext(), i));
    }
}
