package p057g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import org.luckypray.dexkit.C1031R;
import p001A0.AbstractC0040p;
import p006D.AbstractC0080Q;
import p017J.AbstractC0213b;
import p018J0.C0234d;
import p037U.AbstractC0358S;
import p048b.AbstractC0550a;

/* JADX INFO: renamed from: g.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0920p extends CheckBox {

    /* JADX INFO: renamed from: a */
    public final C0922q f3273a;

    /* JADX INFO: renamed from: b */
    public final C0916n f3274b;

    /* JADX INFO: renamed from: c */
    public final C0860G f3275c;

    /* JADX INFO: renamed from: d */
    public C0932v f3276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0920p(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, C1031R.attr.chipStyle);
        AbstractC0851B0.m2165a(context);
        AbstractC0849A0.m2159a(this, getContext());
        this.f3273a = new C0922q(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0550a.f1625j;
        C0234d c0234dM638s = C0234d.m638s(context2, attributeSet, iArr, C1031R.attr.chipStyle, 0);
        TypedArray typedArray = (TypedArray) c0234dM638s.f475c;
        AbstractC0080Q.m290i(this, getContext(), iArr, attributeSet, (TypedArray) c0234dM638s.f475c, C1031R.attr.chipStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setButtonDrawable(AbstractC0358S.m916w(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setButtonDrawable(AbstractC0358S.m916w(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setButtonDrawable(AbstractC0358S.m916w(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0213b.m595c(this, c0234dM638s.m645h(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC0213b.m596d(this, AbstractC0886W.m2221c(typedArray.getInt(3, -1), null));
            }
            c0234dM638s.m657u();
            C0916n c0916n = new C0916n(this);
            this.f3274b = c0916n;
            c0916n.m2243d(attributeSet, C1031R.attr.chipStyle);
            C0860G c0860g = new C0860G(this);
            this.f3275c = c0860g;
            c0860g.m2177d(attributeSet, C1031R.attr.chipStyle);
            getEmojiTextViewHelper().m2262a(attributeSet, C1031R.attr.chipStyle);
        } catch (Throwable th) {
            c0234dM638s.m657u();
            throw th;
        }
    }

    private C0932v getEmojiTextViewHelper() {
        if (this.f3276d == null) {
            this.f3276d = new C0932v(this);
        }
        return this.f3276d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0916n c0916n = this.f3274b;
        if (c0916n != null) {
            c0916n.m2240a();
        }
        C0860G c0860g = this.f3275c;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0916n c0916n = this.f3274b;
        if (c0916n != null) {
            return c0916n.m2241b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0916n c0916n = this.f3274b;
        if (c0916n != null) {
            return c0916n.m2242c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0922q c0922q = this.f3273a;
        if (c0922q != null) {
            return c0922q.f3278b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0922q c0922q = this.f3273a;
        if (c0922q != null) {
            return c0922q.f3279c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0853C0 c0853c0 = this.f3275c.f3098h;
        if (c0853c0 != null) {
            return c0853c0.f3084a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0853C0 c0853c0 = this.f3275c.f3098h;
        if (c0853c0 != null) {
            return c0853c0.f3085b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        ((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo127Q(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0916n c0916n = this.f3274b;
        if (c0916n != null) {
            c0916n.m2244e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0916n c0916n = this.f3274b;
        if (c0916n != null) {
            c0916n.m2245f(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0922q c0922q = this.f3273a;
        if (c0922q != null) {
            if (c0922q.f3282f) {
                c0922q.f3282f = false;
            } else {
                c0922q.f3282f = true;
                c0922q.m2250a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0860G c0860g = this.f3275c;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0860G c0860g = this.f3275c;
        if (c0860g != null) {
            c0860g.m2176b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo128R(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo135w(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0916n c0916n = this.f3274b;
        if (c0916n != null) {
            c0916n.m2247h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0916n c0916n = this.f3274b;
        if (c0916n != null) {
            c0916n.m2248i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0922q c0922q = this.f3273a;
        if (c0922q != null) {
            c0922q.f3278b = colorStateList;
            c0922q.f3280d = true;
            c0922q.m2250a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0922q c0922q = this.f3273a;
        if (c0922q != null) {
            c0922q.f3279c = mode;
            c0922q.f3281e = true;
            c0922q.m2250a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0860G c0860g = this.f3275c;
        c0860g.m2182j(colorStateList);
        c0860g.m2176b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0860G c0860g = this.f3275c;
        c0860g.m2183k(mode);
        c0860g.m2176b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(AbstractC0358S.m916w(getContext(), i2));
    }
}
