package p069i;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p006D.AbstractC0079h;

/* JADX INFO: renamed from: i.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0693l0 extends ToggleButton {

    /* JADX INFO: renamed from: b */
    public final C0704p f2340b;

    /* JADX INFO: renamed from: c */
    public final C0666c0 f2341c;

    /* JADX INFO: renamed from: d */
    public C0723w f2342d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0693l0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC0670d1.m1297a(this, getContext());
        C0704p c0704p = new C0704p(this);
        this.f2340b = c0704p;
        c0704p.m1330d(attributeSet, R.attr.buttonStyleToggle);
        C0666c0 c0666c0 = new C0666c0(this);
        this.f2341c = c0666c0;
        c0666c0.m1284f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m1372a(attributeSet, R.attr.buttonStyleToggle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0723w getEmojiTextViewHelper() {
        if (this.f2342d == null) {
            this.f2342d = new C0723w(this);
        }
        return this.f2342d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0704p c0704p = this.f2340b;
        if (c0704p != null) {
            c0704p.m1327a();
        }
        C0666c0 c0666c0 = this.f2341c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportBackgroundTintList() {
        C0704p c0704p = this.f2340b;
        if (c0704p != null) {
            return c0704p.m1328b();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0704p c0704p = this.f2340b;
        if (c0704p != null) {
            return c0704p.m1329c();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2341c.m1282d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2341c.m1283e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m1373b(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0704p c0704p = this.f2340b;
        if (c0704p != null) {
            c0704p.m1331e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0704p c0704p = this.f2340b;
        if (c0704p != null) {
            c0704p.m1332f(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0666c0 c0666c0 = this.f2341c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0666c0 c0666c0 = this.f2341c;
        if (c0666c0 != null) {
            c0666c0.m1281b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m1374c(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0079h) getEmojiTextViewHelper().f2448b.f312c).mo209t(inputFilterArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0704p c0704p = this.f2340b;
        if (c0704p != null) {
            c0704p.m1334h(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0704p c0704p = this.f2340b;
        if (c0704p != null) {
            c0704p.m1335i(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0666c0 c0666c0 = this.f2341c;
        c0666c0.m1289l(colorStateList);
        c0666c0.m1281b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0666c0 c0666c0 = this.f2341c;
        c0666c0.m1290m(mode);
        c0666c0.m1281b();
    }
}
