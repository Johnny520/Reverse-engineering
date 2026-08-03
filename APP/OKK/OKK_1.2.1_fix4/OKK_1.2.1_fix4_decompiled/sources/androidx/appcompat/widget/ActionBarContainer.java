package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.luckypray.dexkit.C1031R;
import p048b.AbstractC0550a;
import p057g.AbstractC0939y0;
import p057g.C0890a;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f1092a;

    /* JADX INFO: renamed from: b */
    public View f1093b;

    /* JADX INFO: renamed from: c */
    public View f1094c;

    /* JADX INFO: renamed from: d */
    public Drawable f1095d;

    /* JADX INFO: renamed from: e */
    public Drawable f1096e;

    /* JADX INFO: renamed from: f */
    public Drawable f1097f;

    /* JADX INFO: renamed from: g */
    public final boolean f1098g;

    /* JADX INFO: renamed from: h */
    public boolean f1099h;

    /* JADX INFO: renamed from: i */
    public final int f1100i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0890a(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0550a.f1616a);
        boolean z2 = false;
        this.f1095d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f1096e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f1100i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == C1031R.id.split_action_bar) {
            this.f1098g = true;
            this.f1097f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1098g ? !(this.f1095d != null || this.f1096e != null) : this.f1097f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1095d;
        if (drawable != null && drawable.isStateful()) {
            this.f1095d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1096e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1096e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1097f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1097f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1095d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1096e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1097f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1093b = findViewById(C1031R.id.action_bar);
        this.f1094c = findViewById(C1031R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1092a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = true;
        if (this.f1098g) {
            Drawable drawable = this.f1097f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f1095d == null) {
                z3 = false;
            } else if (this.f1093b.getVisibility() == 0) {
                this.f1095d.setBounds(this.f1093b.getLeft(), this.f1093b.getTop(), this.f1093b.getRight(), this.f1093b.getBottom());
            } else {
                View view = this.f1094c;
                if (view == null || view.getVisibility() != 0) {
                    this.f1095d.setBounds(0, 0, 0, 0);
                } else {
                    this.f1095d.setBounds(this.f1094c.getLeft(), this.f1094c.getTop(), this.f1094c.getRight(), this.f1094c.getBottom());
                }
            }
            this.f1099h = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1093b == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f1100i) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f1093b == null) {
            return;
        }
        View.MeasureSpec.getMode(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1095d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1095d);
        }
        this.f1095d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1093b;
            if (view != null) {
                this.f1095d.setBounds(view.getLeft(), this.f1093b.getTop(), this.f1093b.getRight(), this.f1093b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f1098g ? !(this.f1095d != null || this.f1096e != null) : this.f1097f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1097f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1097f);
        }
        this.f1097f = drawable;
        boolean z2 = this.f1098g;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f1097f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f1095d != null || this.f1096e != null) : this.f1097f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1096e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1096e);
        }
        this.f1096e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1099h && this.f1096e != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f1098g ? !(this.f1095d != null || this.f1096e != null) : this.f1097f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(AbstractC0939y0 abstractC0939y0) {
    }

    public void setTransitioning(boolean z2) {
        this.f1092a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f1095d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f1096e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f1097f;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1095d;
        boolean z2 = this.f1098g;
        return (drawable == drawable2 && !z2) || (drawable == this.f1096e && this.f1099h) || ((drawable == this.f1097f && z2) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }
}
