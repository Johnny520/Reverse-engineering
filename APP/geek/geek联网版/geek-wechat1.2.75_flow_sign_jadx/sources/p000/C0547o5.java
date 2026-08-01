package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: o5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0547o5 extends ToggleButton {

    /* JADX INFO: renamed from: a */
    public final C0803v2 f3402a;

    /* JADX INFO: renamed from: b */
    public final C0139d5 f3403b;

    /* JADX INFO: renamed from: c */
    public C0879x3 f3404c;

    public C0547o5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        x60.m2635a(this, getContext());
        C0803v2 c0803v2 = new C0803v2(this);
        this.f3402a = c0803v2;
        c0803v2.m2536d(attributeSet, R.attr.buttonStyleToggle);
        C0139d5 c0139d5 = new C0139d5(this);
        this.f3403b = c0139d5;
        c0139d5.m873f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m2629a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0879x3 getEmojiTextViewHelper() {
        if (this.f3404c == null) {
            this.f3404c = new C0879x3(this);
        }
        return this.f3404c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0803v2 c0803v2 = this.f3402a;
        if (c0803v2 != null) {
            c0803v2.m2533a();
        }
        C0139d5 c0139d5 = this.f3403b;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0803v2 c0803v2 = this.f3402a;
        if (c0803v2 != null) {
            return c0803v2.m2534b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0803v2 c0803v2 = this.f3402a;
        if (c0803v2 != null) {
            return c0803v2.m2535c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3403b.m871d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3403b.m872e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m2630b(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0803v2 c0803v2 = this.f3402a;
        if (c0803v2 != null) {
            c0803v2.m2537e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0803v2 c0803v2 = this.f3402a;
        if (c0803v2 != null) {
            c0803v2.m2538f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f3403b;
        if (c0139d5 != null) {
            c0139d5.m870b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0139d5 c0139d5 = this.f3403b;
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
        C0803v2 c0803v2 = this.f3402a;
        if (c0803v2 != null) {
            c0803v2.m2540h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0803v2 c0803v2 = this.f3402a;
        if (c0803v2 != null) {
            c0803v2.m2541i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0139d5 c0139d5 = this.f3403b;
        c0139d5.m878l(colorStateList);
        c0139d5.m870b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0139d5 c0139d5 = this.f3403b;
        c0139d5.m879m(mode);
        c0139d5.m870b();
    }
}
