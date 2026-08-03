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

    public AbstractC0920p(Context r10, AttributeSet r11) {
        AbstractC0851B0.m2165a(r10);
        super(r10, r11, C1031R.attr.chipStyle);
        AbstractC0849A0.m2159a(this, getContext());
        this.f3273a = new C0922q(this);
        Context r102 = getContext();
        int[] r2 = AbstractC0550a.f1625j;
        C0234d r103 = C0234d.m638s(r102, r11, r2, C1031R.attr.chipStyle, 0);
        TypedArray r8 = (TypedArray) r103.f475c;
        AbstractC0080Q.m290i(this, getContext(), r2, r11, (TypedArray) r103.f475c, C1031R.attr.chipStyle);
    L9:
        th = move-exception;
        r103.m657u();
        throw th;
    L4:
        if (r8.hasValue(1) == false) goto L12;
        int r02 = r8.getResourceId(1, 0);     // Catch: Throwable -> L9
        if (r02 == 0) goto L12;
        setButtonDrawable(AbstractC0358S.m916w(getContext(), r02));     // Catch: Throwable -> L9 Resources.NotFoundException -> L26
    L17:
        if (r8.hasValue(2) == false) goto L20;
        AbstractC0213b.m595c(this, r103.m645h(2));     // Catch: Throwable -> L9
    L20:
        if (r8.hasValue(3) == false) goto L22;
        AbstractC0213b.m596d(this, AbstractC0886W.m2221c(r8.getInt(3, -1), null));     // Catch: Throwable -> L9
    L22:
        r103.m657u();
        C0916n r104 = new C0916n(this);
        this.f3274b = r104;
        r104.m2243d(r11, C1031R.attr.chipStyle);
        C0860G r105 = new C0860G(this);
        this.f3275c = r105;
        r105.m2177d(r11, C1031R.attr.chipStyle);
        getEmojiTextViewHelper().m2262a(r11, C1031R.attr.chipStyle);
        return;
    L12:
        if (r8.hasValue(0) == false) goto L17;
        int r03 = r8.getResourceId(0, 0);     // Catch: Throwable -> L9
        if (r03 == 0) goto L17;
        setButtonDrawable(AbstractC0358S.m916w(getContext(), r03));     // Catch: Throwable -> L9
        goto L17
    }

    private C0932v getEmojiTextViewHelper() {
        if (this.f3276d != null) goto L6;
        this.f3276d = new C0932v(this);
    L6:
        return this.f3276d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0916n r02 = this.f3274b;
        if (r02 == null) goto L5;
        r02.m2240a();
    L5:
        C0860G r03 = this.f3275c;
        if (r03 == null) goto L9;
        r03.m2176b();
        return;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0916n r02 = this.f3274b;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.m2241b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0916n r02 = this.f3274b;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.m2242c();
    }

    public ColorStateList getSupportButtonTintList() {
        C0922q r02 = this.f3273a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3278b;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0922q r02 = this.f3273a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3279c;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0853C0 r02 = this.f3275c.f3098h;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3084a;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0853C0 r02 = this.f3275c.f3098h;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f3085b;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        ((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo127Q(r2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        C0916n r12 = this.f3274b;
        if (r12 == null) goto L6;
        r12.m2244e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C0916n r02 = this.f3274b;
        if (r02 == null) goto L6;
        r02.m2245f(r2);
        return;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable r2) {
        super.setButtonDrawable(r2);
        C0922q r22 = this.f3273a;
        if (r22 != null) goto L5;
        return;
    L5:
        if (r22.f3282f == false) goto L7;
        r22.f3282f = false;
        return;
    L7:
        r22.f3282f = true;
        r22.m2250a();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        C0860G r12 = this.f3275c;
        if (r12 == null) goto L6;
        r12.m2176b();
        return;
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        C0860G r12 = this.f3275c;
        if (r12 == null) goto L6;
        r12.m2176b();
        return;
    }

    public void setEmojiCompatEnabled(boolean r2) {
        ((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo128R(r2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] r2) {
        super.setFilters(((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo135w(r2));
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        C0916n r02 = this.f3274b;
        if (r02 == null) goto L6;
        r02.m2247h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C0916n r02 = this.f3274b;
        if (r02 == null) goto L6;
        r02.m2248i(r2);
        return;
    }

    public void setSupportButtonTintList(ColorStateList r2) {
        C0922q r02 = this.f3273a;
        if (r02 == null) goto L6;
        r02.f3278b = r2;
        r02.f3280d = true;
        r02.m2250a();
        return;
    }

    public void setSupportButtonTintMode(PorterDuff.Mode r2) {
        C0922q r02 = this.f3273a;
        if (r02 == null) goto L6;
        r02.f3279c = r2;
        r02.f3281e = true;
        r02.m2250a();
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r2) {
        C0860G r02 = this.f3275c;
        r02.m2182j(r2);
        r02.m2176b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r2) {
        C0860G r02 = this.f3275c;
        r02.m2183k(r2);
        r02.m2176b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
        setButtonDrawable(AbstractC0358S.m916w(getContext(), r2));
    }
}
