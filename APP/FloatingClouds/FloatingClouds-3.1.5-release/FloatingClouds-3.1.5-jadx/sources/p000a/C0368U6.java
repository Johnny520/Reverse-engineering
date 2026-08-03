package p000a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C1039b;
import com.google.android.material.C1247R;

/* JADX INFO: renamed from: a.U6 */
/* JADX INFO: loaded from: classes.dex */
public class C0368U6 extends C1039b {

    /* JADX INFO: renamed from: p */
    public Drawable f1377p;

    /* JADX INFO: renamed from: q */
    public final Rect f1378q;

    /* JADX INFO: renamed from: r */
    public final Rect f1379r;

    /* JADX INFO: renamed from: s */
    public int f1380s;

    /* JADX INFO: renamed from: t */
    public final boolean f1381t;

    /* JADX INFO: renamed from: u */
    public boolean f1382u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0368U6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f1377p;
        if (drawable != null) {
            if (this.f1382u) {
                this.f1382u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.f1381t;
                Rect rect = this.f1378q;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f1380s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f1379r;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1377p;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1377p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f1377p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f1377p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f1380s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1377p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.C1039b, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1382u = z | this.f1382u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f1382u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f1377p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f1377p);
            }
            this.f1377p = drawable;
            this.f1382u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f1380s == 119) {
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
        if (this.f1380s != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1380s = i;
            if (i == 119 && this.f1377p != null) {
                this.f1377p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1377p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0368U6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f1378q = new Rect();
        this.f1379r = new Rect();
        this.f1380s = 119;
        this.f1381t = true;
        this.f1382u = false;
        int[] iArr = C1247R.styleable.ForegroundLinearLayout;
        C0523cf.m1298a(context, attributeSet, 0, 0);
        C0523cf.m1299b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f1380s = typedArrayObtainStyledAttributes.getInt(C1247R.styleable.ForegroundLinearLayout_android_foregroundGravity, this.f1380s);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C1247R.styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f1381t = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
