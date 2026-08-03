package p081s0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p057g.AbstractC0903g0;
import p058g0.AbstractC0942a;

/* JADX INFO: renamed from: s0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1070d extends AbstractC0903g0 {

    /* JADX INFO: renamed from: p */
    public Drawable f4154p;

    /* JADX INFO: renamed from: q */
    public final Rect f4155q;

    /* JADX INFO: renamed from: r */
    public final Rect f4156r;

    /* JADX INFO: renamed from: s */
    public int f4157s;

    /* JADX INFO: renamed from: t */
    public final boolean f4158t;

    /* JADX INFO: renamed from: u */
    public boolean f4159u;

    public AbstractC1070d(Context r12, AttributeSet r13) {
        super(r12, r13);
        this.f4155q = new Rect();
        this.f4156r = new Rect();
        this.f4157s = 119;
        this.f4158t = true;
        this.f4159u = false;
        int[] r8 = AbstractC0942a.f3336h;
        AbstractC1077k.m2553a(r12, r13, 0, 0);
        AbstractC1077k.m2554b(r12, r13, r8, 0, 0, new int[0]);
        TypedArray r122 = r12.obtainStyledAttributes(r13, r8, 0, 0);
        this.f4157s = r122.getInt(1, this.f4157s);
        Drawable r132 = r122.getDrawable(0);
        if (r132 == null) goto L5;
        setForeground(r132);
    L5:
        this.f4158t = r122.getBoolean(2, true);
        r122.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas r8) {
        super.draw(r8);
        Drawable r02 = this.f4154p;
        if (r02 != null) goto L5;
        return;
    L5:
        if (this.f4159u == false) goto L11;
        this.f4159u = false;
        int r2 = getRight() - getLeft();
        int r3 = getBottom() - getTop();
        boolean r4 = this.f4158t;
        Rect r5 = this.f4155q;
        if (r4 == false) goto L9;
        r5.set(0, 0, r2, r3);
    L10:
        int r1 = this.f4157s;
        int r22 = r02.getIntrinsicWidth();
        int r32 = r02.getIntrinsicHeight();
        Rect r42 = this.f4156r;
        Gravity.apply(r1, r22, r32, r5, r42);
        r02.setBounds(r42);
        goto L11
    L9:
        r5.set(getPaddingLeft(), getPaddingTop(), r2 - getPaddingRight(), r3 - getPaddingBottom());
    L11:
        r02.draw(r8);
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float r2, float r3) {
        super.drawableHotspotChanged(r2, r3);
        Drawable r02 = this.f4154p;
        if (r02 == null) goto L6;
        r02.setHotspot(r2, r3);
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable r02 = this.f4154p;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.isStateful() == false) goto L9;
        this.f4154p.setState(getDrawableState());
        return;
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f4154p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f4157s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable r02 = this.f4154p;
        if (r02 == null) goto L6;
        r02.jumpToCurrentState();
        return;
    }

    @Override // p057g.AbstractC0903g0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        this.f4159u = r1 | this.f4159u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        this.f4159u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable r3) {
        Drawable r02 = this.f4154p;
        if (r02 == r3) goto L17;
        if (r02 == null) goto L6;
        r02.setCallback(null);
        unscheduleDrawable(this.f4154p);
    L6:
        this.f4154p = r3;
        this.f4159u = true;
        if (r3 == null) goto L14;
        setWillNotDraw(false);
        r3.setCallback(this);
        if (r3.isStateful() == false) goto L12;
        r3.setState(getDrawableState());
    L12:
        if (this.f4157s != 119) goto L15;
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
        if (this.f4157s != r2) goto L5;
        return;
    L5:
        if ((8388615 & r2) != 0) goto L8;
        r2 = r2 | 8388611;
    L8:
        if ((r2 & 112) != 0) goto L10;
        r2 = r2 | 48;
    L10:
        this.f4157s = r2;
        if (r2 == 119) goto L13;
    L15:
        requestLayout();
        return;
    L13:
        if (this.f4154p == null) goto L15;
        Rect r22 = new Rect();
        this.f4154p.getPadding(r22);
        goto L15
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable r2) {
        if (super.verifyDrawable(r2) == false) goto L5;
    L8:
        return true;
    L5:
        if (r2 == this.f4154p) goto L8;
        return false;
    }
}
