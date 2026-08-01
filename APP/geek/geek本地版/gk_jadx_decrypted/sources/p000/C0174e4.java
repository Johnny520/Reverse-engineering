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
public class C0174e4 extends RadioButton implements a70 {

    /* JADX INFO: renamed from: a */
    public final C0004a3 f1705a;

    /* JADX INFO: renamed from: b */
    public final C0804v2 f1706b;

    /* JADX INFO: renamed from: c */
    public final C0139d5 f1707c;

    /* JADX INFO: renamed from: d */
    public C0879x3 f1708d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0174e4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        x60.m2614a(context);
        r60.m2247a(this, getContext());
        C0004a3 c0004a3 = new C0004a3(this);
        this.f1705a = c0004a3;
        c0004a3.m8d(attributeSet, R.attr.radioButtonStyle);
        C0804v2 c0804v2 = new C0804v2(this);
        this.f1706b = c0804v2;
        c0804v2.m2482d(attributeSet, R.attr.radioButtonStyle);
        C0139d5 c0139d5 = new C0139d5(this);
        this.f1707c = c0139d5;
        c0139d5.m916f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().m2605a(attributeSet, R.attr.radioButtonStyle);
    }

    private C0879x3 getEmojiTextViewHelper() {
        if (this.f1708d == null) {
            this.f1708d = new C0879x3(this);
        }
        return this.f1708d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0804v2 c0804v2 = this.f1706b;
        if (c0804v2 != null) {
            c0804v2.m2479a();
        }
        C0139d5 c0139d5 = this.f1707c;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0004a3 c0004a3 = this.f1705a;
        if (c0004a3 != null) {
            c0004a3.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0804v2 c0804v2 = this.f1706b;
        if (c0804v2 != null) {
            return c0804v2.m2480b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0804v2 c0804v2 = this.f1706b;
        if (c0804v2 != null) {
            return c0804v2.m2481c();
        }
        return null;
    }

    @Override // p000.a70
    public ColorStateList getSupportButtonTintList() {
        C0004a3 c0004a3 = this.f1705a;
        if (c0004a3 != null) {
            return (ColorStateList) c0004a3.f16a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0004a3 c0004a3 = this.f1705a;
        if (c0004a3 != null) {
            return (PorterDuff.Mode) c0004a3.f17b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1707c.m914d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1707c.m915e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m2606b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0804v2 c0804v2 = this.f1706b;
        if (c0804v2 != null) {
            c0804v2.m2483e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0804v2 c0804v2 = this.f1706b;
        if (c0804v2 != null) {
            c0804v2.m2484f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0004a3 c0004a3 = this.f1705a;
        if (c0004a3 != null) {
            if (c0004a3.f20e) {
                c0004a3.f20e = false;
            } else {
                c0004a3.f20e = true;
                c0004a3.m5a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f1707c;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f1707c;
        if (c0139d5 != null) {
            c0139d5.m913b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m2607c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((a80) getEmojiTextViewHelper().f5089b.f2980b).mo64l(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0804v2 c0804v2 = this.f1706b;
        if (c0804v2 != null) {
            c0804v2.m2486h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0804v2 c0804v2 = this.f1706b;
        if (c0804v2 != null) {
            c0804v2.m2487i(mode);
        }
    }

    @Override // p000.a70
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0004a3 c0004a3 = this.f1705a;
        if (c0004a3 != null) {
            c0004a3.f16a = colorStateList;
            c0004a3.f18c = true;
            c0004a3.m5a();
        }
    }

    @Override // p000.a70
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0004a3 c0004a3 = this.f1705a;
        if (c0004a3 != null) {
            c0004a3.f17b = mode;
            c0004a3.f19d = true;
            c0004a3.m5a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0139d5 c0139d5 = this.f1707c;
        c0139d5.m921l(colorStateList);
        c0139d5.m913b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0139d5 c0139d5 = this.f1707c;
        c0139d5.m922m(mode);
        c0139d5.m913b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0222ff.m1196r(getContext(), i));
    }
}
