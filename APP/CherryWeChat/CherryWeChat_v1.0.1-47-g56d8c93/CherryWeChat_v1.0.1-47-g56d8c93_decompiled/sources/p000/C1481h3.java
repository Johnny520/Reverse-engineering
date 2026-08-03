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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1481h3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1533iB.m2903a(context);
        AbstractC1042YA.m1987a(getContext(), this);
        C2082j3 c2082j3 = new C2082j3(this);
        this.f5228a = c2082j3;
        c2082j3.m4248c(attributeSet, i);
        C1349e3 c1349e3 = new C1349e3(this);
        this.f5229b = c1349e3;
        c1349e3.m2603d(attributeSet, i);
        C2175l4 c2175l4 = new C2175l4(this);
        this.f5230c = c2175l4;
        c2175l4.m4378f(attributeSet, i);
        getEmojiTextViewHelper().m829b(attributeSet, i);
    }

    private C0391J3 getEmojiTextViewHelper() {
        if (this.f5231d == null) {
            this.f5231d = new C0391J3(this);
        }
        return this.f5231d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1349e3 c1349e3 = this.f5229b;
        if (c1349e3 != null) {
            c1349e3.m2600a();
        }
        C2175l4 c2175l4 = this.f5230c;
        if (c2175l4 != null) {
            c2175l4.m4375b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 c1349e3 = this.f5229b;
        if (c1349e3 != null) {
            return c1349e3.m2601b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 c1349e3 = this.f5229b;
        if (c1349e3 != null) {
            return c1349e3.m2602c();
        }
        return null;
    }

    @Override // p000.InterfaceC2182lB
    public ColorStateList getSupportButtonTintList() {
        C2082j3 c2082j3 = this.f5228a;
        if (c2082j3 != null) {
            return c2082j3.f7338a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C2082j3 c2082j3 = this.f5228a;
        if (c2082j3 != null) {
            return c2082j3.f7339b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5230c.m4376d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5230c.m4377e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m830c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1349e3 c1349e3 = this.f5229b;
        if (c1349e3 != null) {
            c1349e3.m2604e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1349e3 c1349e3 = this.f5229b;
        if (c1349e3 != null) {
            c1349e3.m2605f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C2082j3 c2082j3 = this.f5228a;
        if (c2082j3 != null) {
            if (c2082j3.f7342e) {
                c2082j3.f7342e = false;
            } else {
                c2082j3.f7342e = true;
                c2082j3.m4246a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2175l4 c2175l4 = this.f5230c;
        if (c2175l4 != null) {
            c2175l4.m4375b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2175l4 c2175l4 = this.f5230c;
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
        C1349e3 c1349e3 = this.f5229b;
        if (c1349e3 != null) {
            c1349e3.m2607h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1349e3 c1349e3 = this.f5229b;
        if (c1349e3 != null) {
            c1349e3.m2608i(mode);
        }
    }

    @Override // p000.InterfaceC2182lB
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C2082j3 c2082j3 = this.f5228a;
        if (c2082j3 != null) {
            c2082j3.f7338a = colorStateList;
            c2082j3.f7340c = true;
            c2082j3.m4246a();
        }
    }

    @Override // p000.InterfaceC2182lB
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C2082j3 c2082j3 = this.f5228a;
        if (c2082j3 != null) {
            c2082j3.f7339b = mode;
            c2082j3.f7341d = true;
            c2082j3.m4246a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2175l4 c2175l4 = this.f5230c;
        c2175l4.m4380i(colorStateList);
        c2175l4.m4375b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2175l4 c2175l4 = this.f5230c;
        c2175l4.m4381j(mode);
        c2175l4.m4375b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC1406fG.m2695U(getContext(), i));
    }
}
