package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;
import p000.AbstractC0205ez;
import p000.C0838w0;
import p000.f20;
import p000.oa0;
import p000.x90;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f187a;

    /* JADX INFO: renamed from: b */
    public View f188b;

    /* JADX INFO: renamed from: c */
    public View f189c;

    /* JADX INFO: renamed from: d */
    public Drawable f190d;

    /* JADX INFO: renamed from: e */
    public Drawable f191e;

    /* JADX INFO: renamed from: f */
    public Drawable f192f;

    /* JADX INFO: renamed from: g */
    public final boolean f193g;

    /* JADX INFO: renamed from: h */
    public boolean f194h;

    /* JADX INFO: renamed from: i */
    public final int f195i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0838w0 c0838w0 = new C0838w0(this);
        WeakHashMap weakHashMap = oa0.f3426a;
        x90.m2669q(this, c0838w0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0205ez.f1677a);
        boolean z = false;
        this.f190d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f191e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f195i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f193g = true;
            this.f192f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f193g ? !(this.f190d != null || this.f191e != null) : this.f192f == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f190d;
        if (drawable != null && drawable.isStateful()) {
            this.f190d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f191e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f191e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f192f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f192f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f190d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f191e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f192f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f188b = findViewById(R.id.action_bar);
        this.f189c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f187a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f193g) {
            Drawable drawable = this.f192f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f190d == null) {
                z2 = false;
            } else if (this.f188b.getVisibility() == 0) {
                this.f190d.setBounds(this.f188b.getLeft(), this.f188b.getTop(), this.f188b.getRight(), this.f188b.getBottom());
            } else {
                View view = this.f189c;
                if (view == null || view.getVisibility() != 0) {
                    this.f190d.setBounds(0, 0, 0, 0);
                } else {
                    this.f190d.setBounds(this.f189c.getLeft(), this.f189c.getTop(), this.f189c.getRight(), this.f189c.getBottom());
                }
            }
            this.f194h = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f188b == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f195i) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f188b == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f190d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f190d);
        }
        this.f190d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f188b;
            if (view != null) {
                this.f190d.setBounds(view.getLeft(), this.f188b.getTop(), this.f188b.getRight(), this.f188b.getBottom());
            }
        }
        boolean z = false;
        if (!this.f193g ? !(this.f190d != null || this.f191e != null) : this.f192f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f192f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f192f);
        }
        this.f192f = drawable;
        boolean z = this.f193g;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f192f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f190d != null || this.f191e != null) : this.f192f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f191e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f191e);
        }
        this.f191e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f194h && this.f191e != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f193g ? !(this.f190d != null || this.f191e != null) : this.f192f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.f187a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f190d;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f191e;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f192f;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f190d;
        boolean z = this.f193g;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f191e && this.f194h) {
            return true;
        }
        return (drawable == this.f192f && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(f20 f20Var) {
    }
}
