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

    public AbstractC1070d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4155q = new Rect();
        this.f4156r = new Rect();
        this.f4157s = 119;
        this.f4158t = true;
        this.f4159u = false;
        int[] iArr = AbstractC0942a.f3336h;
        AbstractC1077k.m2553a(context, attributeSet, 0, 0);
        AbstractC1077k.m2554b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f4157s = typedArrayObtainStyledAttributes.getInt(1, this.f4157s);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f4158t = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f4154p;
        if (drawable != null) {
            if (this.f4159u) {
                this.f4159u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.f4158t;
                Rect rect = this.f4155q;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i2 = this.f4157s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f4156r;
                Gravity.apply(i2, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f4154p;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4154p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f4154p.setState(getDrawableState());
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
        Drawable drawable = this.f4154p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p057g.AbstractC0903g0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.f4159u = z2 | this.f4159u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f4159u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f4154p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f4154p);
            }
            this.f4154p = drawable;
            this.f4159u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f4157s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i2) {
        if (this.f4157s != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f4157s = i2;
            if (i2 == 119 && this.f4154p != null) {
                this.f4154p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4154p;
    }
}
