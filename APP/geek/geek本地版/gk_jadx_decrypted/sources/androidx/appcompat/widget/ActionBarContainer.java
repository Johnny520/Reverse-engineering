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
import p000.AbstractC0910xy;
import p000.C0839w0;
import p000.ja0;
import p000.s90;
import p000.y10;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f224a;

    /* JADX INFO: renamed from: b */
    public View f225b;

    /* JADX INFO: renamed from: c */
    public View f226c;

    /* JADX INFO: renamed from: d */
    public Drawable f227d;

    /* JADX INFO: renamed from: e */
    public Drawable f228e;

    /* JADX INFO: renamed from: f */
    public Drawable f229f;

    /* JADX INFO: renamed from: g */
    public final boolean f230g;

    /* JADX INFO: renamed from: h */
    public boolean f231h;

    /* JADX INFO: renamed from: i */
    public final int f232i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0839w0 c0839w0 = new C0839w0(this);
        WeakHashMap weakHashMap = ja0.f2600a;
        s90.m2325q(this, c0839w0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0910xy.f5217a);
        boolean z = false;
        this.f227d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f228e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f232i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f230g = true;
            this.f229f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f230g ? !(this.f227d != null || this.f228e != null) : this.f229f == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f227d;
        if (drawable != null && drawable.isStateful()) {
            this.f227d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f228e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f228e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f229f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f229f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f227d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f228e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f229f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f225b = findViewById(R.id.action_bar);
        this.f226c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f224a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f230g) {
            Drawable drawable = this.f229f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f227d == null) {
                z2 = false;
            } else if (this.f225b.getVisibility() == 0) {
                this.f227d.setBounds(this.f225b.getLeft(), this.f225b.getTop(), this.f225b.getRight(), this.f225b.getBottom());
            } else {
                View view = this.f226c;
                if (view == null || view.getVisibility() != 0) {
                    this.f227d.setBounds(0, 0, 0, 0);
                } else {
                    this.f227d.setBounds(this.f226c.getLeft(), this.f226c.getTop(), this.f226c.getRight(), this.f226c.getBottom());
                }
            }
            this.f231h = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f225b == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f232i) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f225b == null) {
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
        Drawable drawable2 = this.f227d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f227d);
        }
        this.f227d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f225b;
            if (view != null) {
                this.f227d.setBounds(view.getLeft(), this.f225b.getTop(), this.f225b.getRight(), this.f225b.getBottom());
            }
        }
        boolean z = false;
        if (!this.f230g ? !(this.f227d != null || this.f228e != null) : this.f229f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f229f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f229f);
        }
        this.f229f = drawable;
        boolean z = this.f230g;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f229f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f227d != null || this.f228e != null) : this.f229f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f228e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f228e);
        }
        this.f228e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f231h && this.f228e != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f230g ? !(this.f227d != null || this.f228e != null) : this.f229f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.f224a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f227d;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f228e;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f229f;
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
        Drawable drawable2 = this.f227d;
        boolean z = this.f230g;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f228e && this.f231h) {
            return true;
        }
        return (drawable == this.f229f && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(y10 y10Var) {
    }
}
