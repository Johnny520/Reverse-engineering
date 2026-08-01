package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* JADX INFO: renamed from: hl */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0302hl extends AbstractC0754tq {

    /* JADX INFO: renamed from: p */
    public Drawable f2283p;

    /* JADX INFO: renamed from: q */
    public final Rect f2284q;

    /* JADX INFO: renamed from: r */
    public final Rect f2285r;

    /* JADX INFO: renamed from: s */
    public int f2286s;

    /* JADX INFO: renamed from: t */
    public final boolean f2287t;

    /* JADX INFO: renamed from: u */
    public boolean f2288u;

    public AbstractC0302hl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2284q = new Rect();
        this.f2285r = new Rect();
        this.f2286s = 119;
        this.f2287t = true;
        this.f2288u = false;
        a80.m39c(context, attributeSet, 0, 0);
        int[] iArr = AbstractC0873wy.f5049h;
        a80.m41e(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f2286s = typedArrayObtainStyledAttributes.getInt(1, this.f2286s);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f2287t = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f2283p;
        if (drawable != null) {
            if (this.f2288u) {
                this.f2288u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.f2287t;
                Rect rect = this.f2284q;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f2286s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f2285r;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f2283p;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2283p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f2283p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f2283p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f2286s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2283p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p000.AbstractC0754tq, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f2288u = z | this.f2288u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f2288u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f2283p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f2283p);
            }
            this.f2283p = drawable;
            this.f2288u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f2286s == 119) {
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
    public void setForegroundGravity(int i) {
        if (this.f2286s != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2286s = i;
            if (i == 119 && this.f2283p != null) {
                this.f2283p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2283p;
    }
}
