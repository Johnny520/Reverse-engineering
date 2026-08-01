package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.InterfaceC2298;
import com.bumptech.glide.AbstractC3054;
import com.davemorrissey.labs.subscaleview.R;
import p053.AbstractC6560;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C0132 extends RadioButton implements InterfaceC2298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0127 f579;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0191 f580;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0212 f581;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0194 f582;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0132(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        AbstractC0141.m596(context);
        AbstractC0152.m606(getContext(), this);
        C0194 c0194 = new C0194(this);
        this.f582 = c0194;
        c0194.m695(attributeSet, R.attr.radioButtonStyle);
        C0191 c0191 = new C0191(this);
        this.f580 = c0191;
        c0191.m665(attributeSet, R.attr.radioButtonStyle);
        C0212 c0212 = new C0212(this);
        this.f581 = c0212;
        c0212.m706(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().m534(attributeSet, R.attr.radioButtonStyle);
    }

    private C0127 getEmojiTextViewHelper() {
        if (this.f579 == null) {
            this.f579 = new C0127(this);
        }
        return this.f579;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0191 c0191 = this.f580;
        if (c0191 != null) {
            c0191.m677();
        }
        C0212 c0212 = this.f581;
        if (c0212 != null) {
            c0212.m709();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0191 c0191 = this.f580;
        if (c0191 != null) {
            return c0191.m680();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0191 c0191 = this.f580;
        if (c0191 != null) {
            return c0191.m681();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC2298
    public ColorStateList getSupportButtonTintList() {
        C0194 c0194 = this.f582;
        if (c0194 != null) {
            return (ColorStateList) c0194.f766;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0194 c0194 = this.f582;
        if (c0194 != null) {
            return (PorterDuff.Mode) c0194.f765;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f581.m708();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f581.m707();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m533(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0191 c0191 = this.f580;
        if (c0191 != null) {
            c0191.m663();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0191 c0191 = this.f580;
        if (c0191 != null) {
            c0191.m662(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0194 c0194 = this.f582;
        if (c0194 != null) {
            if (c0194.f762) {
                c0194.f762 = false;
            } else {
                c0194.f762 = true;
                c0194.m698();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f581;
        if (c0212 != null) {
            c0212.m709();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f581;
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
        C0191 c0191 = this.f580;
        if (c0191 != null) {
            c0191.m657(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0191 c0191 = this.f580;
        if (c0191 != null) {
            c0191.m660(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC2298
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0194 c0194 = this.f582;
        if (c0194 != null) {
            c0194.f766 = colorStateList;
            c0194.f764 = true;
            c0194.m698();
        }
    }

    @Override // androidx.core.widget.InterfaceC2298
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0194 c0194 = this.f582;
        if (c0194 != null) {
            c0194.f765 = mode;
            c0194.f763 = true;
            c0194.m698();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0212 c0212 = this.f581;
        c0212.m711(colorStateList);
        c0212.m709();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0212 c0212 = this.f581;
        c0212.m713(mode);
        c0212.m709();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC3054.m6607(getContext(), i));
    }
}
