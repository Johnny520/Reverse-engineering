package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.widget.InterfaceC2298;
import io.ktor.client.plugins.AbstractC3933;
import p253.AbstractC8190;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0196 extends CheckBox implements InterfaceC2298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0127 f770;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0191 f771;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0212 f772;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0194 f773;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0196(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC0141.m597(context);
        AbstractC0152.m607(getContext(), this);
        C0194 c0194 = new C0194(this);
        this.f773 = c0194;
        c0194.m696(attributeSet, i);
        C0191 c0191 = new C0191(this);
        this.f771 = c0191;
        c0191.m666(attributeSet, i);
        C0212 c0212 = new C0212(this);
        this.f772 = c0212;
        c0212.m707(attributeSet, i);
        getEmojiTextViewHelper().m535(attributeSet, i);
    }

    private C0127 getEmojiTextViewHelper() {
        if (this.f770 == null) {
            this.f770 = new C0127(this);
        }
        return this.f770;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0191 c0191 = this.f771;
        if (c0191 != null) {
            c0191.m678();
        }
        C0212 c0212 = this.f772;
        if (c0212 != null) {
            c0212.m710();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0191 c0191 = this.f771;
        if (c0191 != null) {
            return c0191.m681();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0191 c0191 = this.f771;
        if (c0191 != null) {
            return c0191.m682();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC2298
    public ColorStateList getSupportButtonTintList() {
        C0194 c0194 = this.f773;
        if (c0194 != null) {
            return (ColorStateList) c0194.f766;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0194 c0194 = this.f773;
        if (c0194 != null) {
            return (PorterDuff.Mode) c0194.f765;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f772.m709();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f772.m708();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m534(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0191 c0191 = this.f771;
        if (c0191 != null) {
            c0191.m664();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0191 c0191 = this.f771;
        if (c0191 != null) {
            c0191.m663(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0194 c0194 = this.f773;
        if (c0194 != null) {
            if (c0194.f762) {
                c0194.f762 = false;
            } else {
                c0194.f762 = true;
                c0194.m699();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f772;
        if (c0212 != null) {
            c0212.m710();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0212 c0212 = this.f772;
        if (c0212 != null) {
            c0212.m710();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m533(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC8190) getEmojiTextViewHelper().f561.f16014).mo12989(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0191 c0191 = this.f771;
        if (c0191 != null) {
            c0191.m658(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0191 c0191 = this.f771;
        if (c0191 != null) {
            c0191.m661(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC2298
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0194 c0194 = this.f773;
        if (c0194 != null) {
            c0194.f766 = colorStateList;
            c0194.f764 = true;
            c0194.m699();
        }
    }

    @Override // androidx.core.widget.InterfaceC2298
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0194 c0194 = this.f773;
        if (c0194 != null) {
            c0194.f765 = mode;
            c0194.f763 = true;
            c0194.m699();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0212 c0212 = this.f772;
        c0212.m712(colorStateList);
        c0212.m710();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0212 c0212 = this.f772;
        c0212.m714(mode);
        c0212.m710();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC3933.m8312(getContext(), i));
    }
}
