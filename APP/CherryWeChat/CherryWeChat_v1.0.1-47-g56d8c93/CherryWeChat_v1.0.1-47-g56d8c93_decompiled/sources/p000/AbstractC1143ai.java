package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* JADX INFO: renamed from: ai */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1143ai extends AbstractC1465go {

    /* JADX INFO: renamed from: p */
    public Drawable f3630p;

    /* JADX INFO: renamed from: q */
    public final Rect f3631q;

    /* JADX INFO: renamed from: r */
    public final Rect f3632r;

    /* JADX INFO: renamed from: s */
    public int f3633s;

    /* JADX INFO: renamed from: t */
    public final boolean f3634t;

    /* JADX INFO: renamed from: u */
    public boolean f3635u;

    public AbstractC1143ai(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3631q = new Rect();
        this.f3632r = new Rect();
        this.f3633s = 119;
        this.f3634t = true;
        this.f3635u = false;
        AbstractC1293cr.m2547f(context, attributeSet, 0, 0);
        int[] iArr = AbstractC0939Vu.f2939h;
        AbstractC1293cr.m2549h(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f3633s = typedArrayObtainStyledAttributes.getInt(1, this.f3633s);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f3634t = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f3630p;
        if (drawable != null) {
            if (this.f3635u) {
                this.f3635u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.f3634t;
                Rect rect = this.f3631q;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f3633s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f3632r;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f3630p;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3630p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f3630p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f3630p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f3633s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3630p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p000.AbstractC1465go, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f3635u = z | this.f3635u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f3635u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f3630p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f3630p);
            }
            this.f3630p = drawable;
            this.f3635u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f3633s == 119) {
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
        if (this.f3633s != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f3633s = i;
            if (i == 119 && this.f3630p != null) {
                this.f3630p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3630p;
    }
}
