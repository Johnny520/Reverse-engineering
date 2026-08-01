package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p053.AbstractC6560;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0223 extends ToggleButton {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0212 f833;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C0127 f834;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0191 f835;

    public C0223(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC0152.m606(getContext(), this);
        C0191 c0191 = new C0191(this);
        this.f835 = c0191;
        c0191.m665(attributeSet, R.attr.buttonStyleToggle);
        C0212 c0212 = new C0212(this);
        this.f833 = c0212;
        c0212.m706(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m534(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0127 getEmojiTextViewHelper() {
        if (this.f834 == null) {
            this.f834 = new C0127(this);
        }
        return this.f834;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0191 c0191 = this.f835;
        if (c0191 != null) {
            c0191.m677();
        }
        C0212 c0212 = this.f833;
        if (c0212 != null) {
            c0212.m709();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0191 c0191 = this.f835;
        if (c0191 != null) {
            return c0191.m680();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0191 c0191 = this.f835;
        if (c0191 != null) {
            return c0191.m681();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f833.m708();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f833.m707();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m533(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0191 c0191 = this.f835;
        if (c0191 != null) {
            c0191.m663();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0191 c0191 = this.f835;
        if (c0191 != null) {
            c0191.m662(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f833;
        if (c0212 != null) {
            c0212.m709();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f833;
        if (c0212 != null) {
            c0212.m709();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m532(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC6560) getEmojiTextViewHelper().f561.f16007).mo12045(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0191 c0191 = this.f835;
        if (c0191 != null) {
            c0191.m657(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0191 c0191 = this.f835;
        if (c0191 != null) {
            c0191.m660(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0212 c0212 = this.f833;
        c0212.m711(colorStateList);
        c0212.m709();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0212 c0212 = this.f833;
        c0212.m713(mode);
        c0212.m709();
    }
}
