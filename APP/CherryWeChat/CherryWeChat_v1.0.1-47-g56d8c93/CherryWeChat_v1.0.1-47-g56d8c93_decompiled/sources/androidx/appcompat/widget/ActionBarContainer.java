package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import io.github.cherrywechat.R;
import p000.AbstractC0982Wu;
import p000.AbstractC2562tx;
import p000.C2300o0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f3716a;

    /* JADX INFO: renamed from: b */
    public View f3717b;

    /* JADX INFO: renamed from: c */
    public View f3718c;

    /* JADX INFO: renamed from: d */
    public Drawable f3719d;

    /* JADX INFO: renamed from: e */
    public Drawable f3720e;

    /* JADX INFO: renamed from: f */
    public Drawable f3721f;

    /* JADX INFO: renamed from: g */
    public final boolean f3722g;

    /* JADX INFO: renamed from: h */
    public boolean f3723h;

    /* JADX INFO: renamed from: i */
    public final int f3724i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C2300o0(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0982Wu.f3066a);
        boolean z = false;
        this.f3719d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f3720e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f3724i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f3722g = true;
            this.f3721f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f3722g ? !(this.f3719d != null || this.f3720e != null) : this.f3721f == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3719d;
        if (drawable != null && drawable.isStateful()) {
            this.f3719d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f3720e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f3720e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f3721f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f3721f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3719d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3720e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f3721f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3717b = findViewById(R.id.action_bar);
        this.f3718c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f3716a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f3722g) {
            Drawable drawable = this.f3721f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f3719d == null) {
                z2 = false;
            } else if (this.f3717b.getVisibility() == 0) {
                this.f3719d.setBounds(this.f3717b.getLeft(), this.f3717b.getTop(), this.f3717b.getRight(), this.f3717b.getBottom());
            } else {
                View view = this.f3718c;
                if (view == null || view.getVisibility() != 0) {
                    this.f3719d.setBounds(0, 0, 0, 0);
                } else {
                    this.f3719d.setBounds(this.f3718c.getLeft(), this.f3718c.getTop(), this.f3718c.getRight(), this.f3718c.getBottom());
                }
            }
            this.f3723h = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f3717b == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f3724i) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f3717b == null) {
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
        Drawable drawable2 = this.f3719d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3719d);
        }
        this.f3719d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f3717b;
            if (view != null) {
                this.f3719d.setBounds(view.getLeft(), this.f3717b.getTop(), this.f3717b.getRight(), this.f3717b.getBottom());
            }
        }
        boolean z = false;
        if (!this.f3722g ? !(this.f3719d != null || this.f3720e != null) : this.f3721f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3721f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3721f);
        }
        this.f3721f = drawable;
        boolean z = this.f3722g;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f3721f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f3719d != null || this.f3720e != null) : this.f3721f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f3720e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3720e);
        }
        this.f3720e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3723h && this.f3720e != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f3722g ? !(this.f3719d != null || this.f3720e != null) : this.f3721f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(AbstractC2562tx abstractC2562tx) {
    }

    public void setTransitioning(boolean z) {
        this.f3716a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f3719d;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f3720e;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f3721f;
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
        Drawable drawable2 = this.f3719d;
        boolean z = this.f3722g;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f3720e && this.f3723h) {
            return true;
        }
        return (drawable == this.f3721f && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
