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

    public C2527t4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC1042YA.m1987a(getContext(), this);
        C1349e3 c1349e3 = new C1349e3(this);
        this.f8825a = c1349e3;
        c1349e3.m2603d(attributeSet, R.attr.buttonStyleToggle);
        C2175l4 c2175l4 = new C2175l4(this);
        this.f8826b = c2175l4;
        c2175l4.m4378f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m829b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0391J3 getEmojiTextViewHelper() {
        if (this.f8827c == null) {
            this.f8827c = new C0391J3(this);
        }
        return this.f8827c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1349e3 c1349e3 = this.f8825a;
        if (c1349e3 != null) {
            c1349e3.m2600a();
        }
        C2175l4 c2175l4 = this.f8826b;
        if (c2175l4 != null) {
            c2175l4.m4375b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 c1349e3 = this.f8825a;
        if (c1349e3 != null) {
            return c1349e3.m2601b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 c1349e3 = this.f8825a;
        if (c1349e3 != null) {
            return c1349e3.m2602c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8826b.m4376d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8826b.m4377e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m830c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1349e3 c1349e3 = this.f8825a;
        if (c1349e3 != null) {
            c1349e3.m2604e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1349e3 c1349e3 = this.f8825a;
        if (c1349e3 != null) {
            c1349e3.m2605f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2175l4 c2175l4 = this.f8826b;
        if (c2175l4 != null) {
            c2175l4.m4375b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2175l4 c2175l4 = this.f8826b;
        if (c2175l4 != null) {
            c2175l4.m4375b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m831d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m828a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1349e3 c1349e3 = this.f8825a;
        if (c1349e3 != null) {
            c1349e3.m2607h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1349e3 c1349e3 = this.f8825a;
        if (c1349e3 != null) {
            c1349e3.m2608i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2175l4 c2175l4 = this.f8826b;
        c2175l4.m4380i(colorStateList);
        c2175l4.m4375b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2175l4 c2175l4 = this.f8826b;
        c2175l4.m4381j(mode);
        c2175l4.m4375b();
    }
}
