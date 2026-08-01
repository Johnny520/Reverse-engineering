package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* JADX INFO: loaded from: classes.dex */
public abstract class hl extends tq {
    public Drawable p;
    public final Rect q;
    public final Rect r;
    public int s;
    public final boolean t;
    public boolean u;

    public hl(Context r9, AttributeSet r10) {
        super(r9, r10, 0);
        this.q = new Rect();
        this.r = new Rect();
        this.s = 119;
        this.t = true;
        this.u = false;
        a80.c(r9, r10, 0, 0);
        int[] r2 = wy.h;
        a80.e(r9, r10, r2, 0, 0, new int[0]);
        TypedArray r92 = r9.obtainStyledAttributes(r10, r2, 0, 0);
        this.s = r92.getInt(1, this.s);
        Drawable r102 = r92.getDrawable(0);
        if (r102 == null) goto L5;
        setForeground(r102);
    L5:
        this.t = r92.getBoolean(2, true);
        r92.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas r8) {
        super.draw(r8);
        Drawable r0 = this.p;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.u == false) goto L11;
        this.u = false;
        int r2 = getRight() - getLeft();
        int r3 = getBottom() - getTop();
        boolean r4 = this.t;
        Rect r5 = this.q;
        if (r4 == false) goto L9;
        r5.set(0, 0, r2, r3);
    L10:
        int r1 = this.s;
        int r22 = r0.getIntrinsicWidth();
        int r32 = r0.getIntrinsicHeight();
        Rect r42 = this.r;
        Gravity.apply(r1, r22, r32, r5, r42);
        r0.setBounds(r42);
        goto L11
    L9:
        r5.set(getPaddingLeft(), getPaddingTop(), r2 - getPaddingRight(), r3 - getPaddingBottom());
    L11:
        r0.draw(r8);
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float r2, float r3) {
        super.drawableHotspotChanged(r2, r3);
        Drawable r0 = this.p;
        if (r0 == null) goto L6;
        r0.setHotspot(r2, r3);
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable r0 = this.p;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isStateful() == false) goto L9;
        this.p.setState(getDrawableState());
        return;
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable r0 = this.p;
        if (r0 == null) goto L6;
        r0.jumpToCurrentState();
        return;
    }

    @Override // defpackage.tq, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        this.u = r1 | this.u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        this.u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable r3) {
        Drawable r0 = this.p;
        if (r0 == r3) goto L17;
        if (r0 == null) goto L6;
        r0.setCallback(null);
        unscheduleDrawable(this.p);
    L6:
        this.p = r3;
        this.u = true;
        if (r3 == null) goto L14;
        setWillNotDraw(false);
        r3.setCallback(this);
        if (r3.isStateful() == false) goto L12;
        r3.setState(getDrawableState());
    L12:
        if (this.s != 119) goto L15;
        r3.getPadding(new Rect());
    L15:
        requestLayout();
        invalidate();
        return;
    L14:
        setWillNotDraw(true);
        goto L15
    }

    @Override // android.view.View
    public void setForegroundGravity(int r2) {
        if (this.s != r2) goto L5;
        return;
    L5:
        if ((8388615 & r2) != 0) goto L8;
        r2 = r2 | 8388611;
    L8:
        if ((r2 & 112) != 0) goto L10;
        r2 = r2 | 48;
    L10:
        this.s = r2;
        if (r2 == 119) goto L13;
    L15:
        requestLayout();
        return;
    L13:
        if (this.p == null) goto L15;
        Rect r22 = new Rect();
        this.p.getPadding(r22);
        goto L15
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable r2) {
        if (super.verifyDrawable(r2) == false) goto L5;
        return true;
    L5:
        if (r2 == this.p) goto L11;
        return false;
    L11:
        return true;
    }
}
