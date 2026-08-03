package p057g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageView;
import p037U.AbstractC0358S;
import p050c0.C0691r1;

/* JADX INFO: renamed from: g.x */
/* JADX INFO: loaded from: classes.dex */
public class C0936x extends ImageView {

    /* JADX INFO: renamed from: a */
    public final C0916n f3318a;

    /* JADX INFO: renamed from: b */
    public final C0691r1 f3319b;

    /* JADX INFO: renamed from: c */
    public boolean f3320c;

    public C0936x(Context r2, int r3) {
        AbstractC0851B0.m2165a(r2);
        super(r2, null, r3);
        this.f3320c = false;
        AbstractC0849A0.m2159a(this, getContext());
        C0916n r22 = new C0916n(this);
        this.f3318a = r22;
        r22.m2243d(null, r3);
        C0691r1 r23 = new C0691r1(this);
        this.f3319b = r23;
        r23.m1787b(null, r3);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0916n r02 = this.f3318a;
        if (r02 == null) goto L5;
        r02.m2240a();
    L5:
        C0691r1 r03 = this.f3319b;
        if (r03 == null) goto L9;
        r03.m1786a();
        return;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0916n r02 = this.f3318a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.m2241b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0916n r02 = this.f3318a;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.m2242c();
    }

    public ColorStateList getSupportImageTintList() {
        C0691r1 r1 = this.f3319b;
        if (r1 == null) goto L8;
        C0853C0 r12 = (C0853C0) r1.f2185c;
        if (r12 != null) goto L7;
        return null;
    L7:
        return r12.f3084a;
    L8:
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0691r1 r1 = this.f3319b;
        if (r1 == null) goto L8;
        C0853C0 r12 = (C0853C0) r1.f2185c;
        if (r12 != null) goto L7;
        return null;
    L7:
        return r12.f3085b;
    L8:
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(((ImageView) this.f3319b.f2184b).getBackground() instanceof RippleDrawable)) == true) goto L5;
    L7:
        return false;
    L5:
        if (super.hasOverlappingRendering() == false) goto L7;
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        C0916n r12 = this.f3318a;
        if (r12 == null) goto L6;
        r12.m2244e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C0916n r02 = this.f3318a;
        if (r02 == null) goto L6;
        r02.m2245f(r2);
        return;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap r1) {
        super.setImageBitmap(r1);
        C0691r1 r12 = this.f3319b;
        if (r12 == null) goto L6;
        r12.m1786a();
        return;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable r3) {
        C0691r1 r02 = this.f3319b;
        if (r02 == null) goto L8;
        if (r3 == null) goto L8;
        if (this.f3320c == true) goto L8;
        r02.f2183a = r3.getLevel();
    L8:
        super.setImageDrawable(r3);
        if (r02 == null) goto L16;
        r02.m1786a();
        if (this.f3320c == true) goto L17;
        ImageView r32 = (ImageView) r02.f2184b;
        if (r32.getDrawable() == null) goto L18;
        r32.getDrawable().setLevel(r02.f2183a);
        return;
    L18:
        return;
    L17:
        return;
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int r1) {
        super.setImageLevel(r1);
        this.f3320c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r4) {
        C0691r1 r02 = this.f3319b;
        if (r02 == null) goto L13;
        ImageView r1 = (ImageView) r02.f2184b;
        if (r4 == 0) goto L10;
        Drawable r42 = AbstractC0358S.m916w(r1.getContext(), r4);
        if (r42 == null) goto L9;
        AbstractC0886W.m2219a(r42);
    L9:
        r1.setImageDrawable(r42);
    L11:
        r02.m1786a();
        return;
    L10:
        r1.setImageDrawable(null);
        goto L11
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri r1) {
        super.setImageURI(r1);
        C0691r1 r12 = this.f3319b;
        if (r12 == null) goto L6;
        r12.m1786a();
        return;
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        C0916n r02 = this.f3318a;
        if (r02 == null) goto L6;
        r02.m2247h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C0916n r02 = this.f3318a;
        if (r02 == null) goto L6;
        r02.m2248i(r2);
        return;
    }

    public void setSupportImageTintList(ColorStateList r3) {
        C0691r1 r02 = this.f3319b;
        if (r02 != null) goto L5;
        return;
    L5:
        if (((C0853C0) r02.f2185c) != null) goto L7;
        r02.f2185c = new C0853C0();
    L7:
        C0853C0 r1 = (C0853C0) r02.f2185c;
        r1.f3084a = r3;
        r1.f3087d = true;
        r02.m1786a();
    }

    public void setSupportImageTintMode(PorterDuff.Mode r3) {
        C0691r1 r02 = this.f3319b;
        if (r02 != null) goto L5;
        return;
    L5:
        if (((C0853C0) r02.f2185c) != null) goto L7;
        r02.f2185c = new C0853C0();
    L7:
        C0853C0 r1 = (C0853C0) r02.f2185c;
        r1.f3085b = r3;
        r1.f3086c = true;
        r02.m1786a();
    }
}
