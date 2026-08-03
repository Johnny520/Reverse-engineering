package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: U3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0863U3 extends C0649P3 {

    /* JADX INFO: renamed from: e */
    public final C0820T3 f2726e;

    /* JADX INFO: renamed from: f */
    public Drawable f2727f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f2728g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f2729h;

    /* JADX INFO: renamed from: i */
    public boolean f2730i;

    /* JADX INFO: renamed from: j */
    public boolean f2731j;

    public C0863U3(C0820T3 r2) {
        super(r2);
        this.f2728g = null;
        this.f2729h = null;
        this.f2730i = false;
        this.f2731j = false;
        this.f2726e = r2;
    }

    @Override // p000.C0649P3
    /* JADX INFO: renamed from: J */
    public final void mo1279J(AttributeSet r8, int r9) {
        super.mo1279J(r8, R.attr.seekBarStyle);
        C0820T3 r0 = this.f2726e;
        Context r92 = r0.getContext();
        int[] r2 = AbstractC0982Wu.f3072g;
        C2656w4 r93 = C2656w4.m5186A(r92, r8, r2, R.attr.seekBarStyle);
        TypedArray r6 = (TypedArray) r93.f9196b;
        AbstractC2185lE.m4398k(r0, r0.getContext(), r2, r8, (TypedArray) r93.f9196b, R.attr.seekBarStyle);
        Drawable r82 = r93.m5211r(0);
        if (r82 == null) goto L5;
        r0.setThumb(r82);
    L5:
        Drawable r1 = r93.m5210q(1);
        Drawable r22 = this.f2727f;
        if (r22 == null) goto L8;
        r22.setCallback(null);
    L8:
        this.f2727f = r1;
        if (r1 == null) goto L14;
        r1.setCallback(r0);
        r1.setLayoutDirection(r0.getLayoutDirection());
        if (r1.isStateful() == false) goto L13;
        r1.setState(r0.getDrawableState());
    L13:
        m1705V();
    L14:
        r0.invalidate();
        if (r6.hasValue(3) == false) goto L18;
        this.f2729h = AbstractC0107Ce.m161c(r6.getInt(3, -1), this.f2729h);
        this.f2731j = true;
    L18:
        if (r6.hasValue(2) == false) goto L20;
        this.f2728g = r93.m5209p(2);
        this.f2730i = true;
    L20:
        r93.m5195E();
        m1705V();
    }

    /* JADX INFO: renamed from: V */
    public final void m1705V() {
        Drawable r0 = this.f2727f;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.f2730i == false) goto L7;
    L8:
        Drawable r02 = r0.mutate();
        this.f2727f = r02;
        if (this.f2730i == false) goto L12;
        r02.setTintList(this.f2728g);
    L12:
        if (this.f2731j == false) goto L15;
        this.f2727f.setTintMode(this.f2729h);
    L15:
        if (this.f2727f.isStateful() == false) goto L20;
        this.f2727f.setState(this.f2726e.getDrawableState());
        return;
    L20:
        return;
    L7:
        if (this.f2731j == true) goto L8;
    }

    /* JADX INFO: renamed from: W */
    public final void m1706W(Canvas r8) {
        if (this.f2727f == null) goto L18;
        int r1 = this.f2726e.getMax();
        int r2 = 1;
        if (r1 <= 1) goto L19;
        int r3 = this.f2727f.getIntrinsicWidth();
        int r4 = this.f2727f.getIntrinsicHeight();
        if (r3 < 0) goto L9;
        int r32 = r3 / 2;
    L10:
        if (r4 < 0) goto L12;
        r2 = r4 / 2;
    L12:
        this.f2727f.setBounds(-r32, -r2, r32, r2);
        float r22 = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / r1;
        int r33 = r8.save();
        r8.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
        int r0 = 0;
    L13:
        if (r0 > r1) goto L15;
        this.f2727f.draw(r8);
        r8.translate(r22, 0.0f);
        r0 = r0 + 1;
        goto L13
    L15:
        r8.restoreToCount(r33);
        return;
    L9:
        r32 = 1;
        goto L10
    L19:
        return;
    }
}
