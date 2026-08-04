package yyds;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛲᛷᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0408 extends RadioButton {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1495 f2134;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0328 f2135;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C0286 f2136;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1231 f2137;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0408(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        AbstractC2790.m4904(context);
        AbstractC2251.m4251(getContext(), this);
        C0328 c0328 = new C0328(this);
        this.f2135 = c0328;
        c0328.m999(attributeSet, R.attr.radioButtonStyle);
        C1231 c1231 = new C1231(this);
        this.f2137 = c1231;
        c1231.m2518(attributeSet, R.attr.radioButtonStyle);
        C1495 c1495 = new C1495(this);
        this.f2134 = c1495;
        c1495.m3012(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().m936(attributeSet, R.attr.radioButtonStyle);
    }

    private C0286 getEmojiTextViewHelper() {
        C0286 c0286 = this.f2136;
        if (c0286 != null) {
            return c0286;
        }
        C0286 c02862 = new C0286(this);
        this.f2136 = c02862;
        return c02862;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1231 c1231 = this.f2137;
        if (c1231 != null) {
            c1231.m2510();
        }
        C1495 c1495 = this.f2134;
        if (c1495 != null) {
            c1495.m3009();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0328 c0328 = this.f2135;
        if (c0328 != null) {
            c0328.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1231 c1231 = this.f2137;
        if (c1231 != null) {
            return c1231.m2506();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1231 c1231 = this.f2137;
        if (c1231 != null) {
            return c1231.m2508();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0328 c0328 = this.f2135;
        if (c0328 != null) {
            return (ColorStateList) c0328.f1718;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0328 c0328 = this.f2135;
        if (c0328 != null) {
            return (PorterDuff.Mode) c0328.f1719;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2134.m3013();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2134.m3007();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m937(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1231 c1231 = this.f2137;
        if (c1231 != null) {
            c1231.m2507();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1231 c1231 = this.f2137;
        if (c1231 != null) {
            c1231.m2505(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0328 c0328 = this.f2135;
        if (c0328 != null) {
            if (c0328.f1717) {
                c0328.f1717 = false;
            } else {
                c0328.f1717 = true;
                c0328.m996();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1495 c1495 = this.f2134;
        if (c1495 != null) {
            c1495.m3009();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1495 c1495 = this.f2134;
        if (c1495 != null) {
            c1495.m3009();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m938(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0427) getEmojiTextViewHelper().f1531.f551).mo760(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1231 c1231 = this.f2137;
        if (c1231 != null) {
            c1231.m2511(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1231 c1231 = this.f2137;
        if (c1231 != null) {
            c1231.m2517(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0328 c0328 = this.f2135;
        if (c0328 != null) {
            c0328.f1718 = colorStateList;
            c0328.f1720 = true;
            c0328.m996();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0328 c0328 = this.f2135;
        if (c0328 != null) {
            c0328.f1719 = mode;
            c0328.f1722 = true;
            c0328.m996();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1495 c1495 = this.f2134;
        c1495.m3005(colorStateList);
        c1495.m3009();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1495 c1495 = this.f2134;
        c1495.m3006(mode);
        c1495.m3009();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC1367.m2767(getContext(), i));
    }
}
