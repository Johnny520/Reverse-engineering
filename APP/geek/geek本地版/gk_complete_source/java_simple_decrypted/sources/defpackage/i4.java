package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.ljx.wechatmod.R;

/* JADX INFO: loaded from: classes.dex */
public final class i4 extends d4 {
    public final h4 e;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public boolean i;
    public boolean j;

    public i4(h4 r2) {
        super(r2);
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.e = r2;
    }

    public final void M() {
        Drawable r0 = this.f;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.i == false) goto L7;
    L8:
        Drawable r02 = r0.mutate();
        this.f = r02;
        if (this.i == false) goto L12;
        ch.h(r02, this.g);
    L12:
        if (this.j == false) goto L15;
        ch.i(this.f, this.h);
    L15:
        if (this.f.isStateful() == false) goto L20;
        this.f.setState(this.e.getDrawableState());
        return;
    L20:
        return;
    L7:
        if (this.j == true) goto L8;
    }

    public final void N(Canvas r8) {
        if (this.f == null) goto L18;
        int r1 = this.e.getMax();
        int r2 = 1;
        if (r1 <= 1) goto L19;
        int r3 = this.f.getIntrinsicWidth();
        int r4 = this.f.getIntrinsicHeight();
        if (r3 < 0) goto L9;
        int r32 = r3 / 2;
    L10:
        if (r4 < 0) goto L12;
        r2 = r4 / 2;
    L12:
        this.f.setBounds(-r32, -r2, r32, r2);
        float r22 = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / r1;
        int r33 = r8.save();
        r8.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
        int r0 = 0;
    L13:
        if (r0 > r1) goto L15;
        this.f.draw(r8);
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

    @Override // defpackage.d4
    public final void z(AttributeSet r8, int r9) {
        super.z(r8, R.attr.seekBarStyle);
        h4 r0 = this.e;
        Context r92 = r0.getContext();
        int[] r2 = xy.g;
        r5 r93 = r5.y(r92, r8, r2, R.attr.seekBarStyle);
        TypedArray r6 = (TypedArray) r93.b;
        ja0.k(r0, r0.getContext(), r2, r8, (TypedArray) r93.b, R.attr.seekBarStyle);
        Drawable r82 = r93.n(0);
        if (r82 == null) goto L5;
        r0.setThumb(r82);
    L5:
        Drawable r1 = r93.m(1);
        Drawable r22 = this.f;
        if (r22 == null) goto L8;
        r22.setCallback(null);
    L8:
        this.f = r1;
        if (r1 == null) goto L14;
        r1.setCallback(r0);
        dh.b(r1, t90.d(r0));
        if (r1.isStateful() == false) goto L13;
        r1.setState(r0.getDrawableState());
    L13:
        M();
    L14:
        r0.invalidate();
        if (r6.hasValue(3) == false) goto L18;
        this.h = eh.b(r6.getInt(3, -1), this.h);
        this.j = true;
    L18:
        if (r6.hasValue(2) == false) goto L20;
        this.g = r93.l(2);
        this.i = true;
    L20:
        r93.z();
        M();
    }
}
