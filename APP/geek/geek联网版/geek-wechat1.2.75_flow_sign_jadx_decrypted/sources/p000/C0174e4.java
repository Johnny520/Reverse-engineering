package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0174e4 extends RadioButton implements g70 {

    /* JADX INFO: renamed from: a */
    public final C0004a3 f1501a;

    /* JADX INFO: renamed from: b */
    public final C0803v2 f1502b;

    /* JADX INFO: renamed from: c */
    public final C0139d5 f1503c;

    /* JADX INFO: renamed from: d */
    public C0879x3 f1504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0174e4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        d70.m881a(context);
        x60.m2635a(this, getContext());
        C0004a3 c0004a3 = new C0004a3(this);
        this.f1501a = c0004a3;
        c0004a3.m21d(attributeSet, R.attr.radioButtonStyle);
        C0803v2 c0803v2 = new C0803v2(this);
        this.f1502b = c0803v2;
        c0803v2.m2536d(attributeSet, R.attr.radioButtonStyle);
        C0139d5 c0139d5 = new C0139d5(this);
        this.f1503c = c0139d5;
        c0139d5.m873f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().m2629a(attributeSet, R.attr.radioButtonStyle);
    }

    private C0879x3 getEmojiTextViewHelper() {
        if (this.f1504d == null) {
            this.f1504d = new C0879x3(this);
        }
        return this.f1504d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0803v2 c0803v2 = this.f1502b;
        if (c0803v2 != null) {
            c0803v2.m2533a();
        }
        C0139d5 c0139d5 = this.f1503c;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0004a3 c0004a3 = this.f1501a;
        if (c0004a3 != null) {
            c0004a3.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0803v2 c0803v2 = this.f1502b;
        if (c0803v2 != null) {
            return c0803v2.m2534b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0803v2 c0803v2 = this.f1502b;
        if (c0803v2 != null) {
            return c0803v2.m2535c();
        }
        return null;
    }

    @Override // p000.g70
    public ColorStateList getSupportButtonTintList() {
        C0004a3 c0004a3 = this.f1501a;
        if (c0004a3 != null) {
            return (ColorStateList) c0004a3.f13a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0004a3 c0004a3 = this.f1501a;
        if (c0004a3 != null) {
            return (PorterDuff.Mode) c0004a3.f14b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1503c.m871d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1503c.m872e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m2630b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0803v2 c0803v2 = this.f1502b;
        if (c0803v2 != null) {
            c0803v2.m2537e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0803v2 c0803v2 = this.f1502b;
        if (c0803v2 != null) {
            c0803v2.m2538f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0004a3 c0004a3 = this.f1501a;
        if (c0004a3 != null) {
            if (c0004a3.f17e) {
                c0004a3.f17e = false;
            } else {
                c0004a3.f17e = true;
                c0004a3.m18a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f1503c;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f1503c;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m2631c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0493mp) getEmojiTextViewHelper().f5159b.f2886b).mo1878r(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0803v2 c0803v2 = this.f1502b;
        if (c0803v2 != null) {
            c0803v2.m2540h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0803v2 c0803v2 = this.f1502b;
        if (c0803v2 != null) {
            c0803v2.m2541i(mode);
        }
    }

    @Override // p000.g70
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0004a3 c0004a3 = this.f1501a;
        if (c0004a3 != null) {
            c0004a3.f13a = colorStateList;
            c0004a3.f15c = true;
            c0004a3.m18a();
        }
    }

    @Override // p000.g70
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0004a3 c0004a3 = this.f1501a;
        if (c0004a3 != null) {
            c0004a3.f14b = mode;
            c0004a3.f16d = true;
            c0004a3.m18a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0139d5 c0139d5 = this.f1503c;
        c0139d5.m878l(colorStateList);
        c0139d5.m870b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0139d5 c0139d5 = this.f1503c;
        c0139d5.m879m(mode);
        c0139d5.m870b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0259gf.m1261w(getContext(), i));
    }
}
