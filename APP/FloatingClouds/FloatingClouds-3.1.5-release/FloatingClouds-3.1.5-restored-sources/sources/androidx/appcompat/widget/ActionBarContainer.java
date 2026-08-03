package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.C0983R;
import p000a.C0218M;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f3877a;

    /* JADX INFO: renamed from: b */
    public C1040c f3878b;

    /* JADX INFO: renamed from: c */
    public View f3879c;

    /* JADX INFO: renamed from: d */
    public View f3880d;

    /* JADX INFO: renamed from: e */
    public Drawable f3881e;

    /* JADX INFO: renamed from: f */
    public Drawable f3882f;

    /* JADX INFO: renamed from: g */
    public Drawable f3883g;

    /* JADX INFO: renamed from: h */
    public final boolean f3884h;

    /* JADX INFO: renamed from: i */
    public boolean f3885i;

    /* JADX INFO: renamed from: j */
    public final int f3886j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0218M(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0983R.styleable.ActionBar);
        this.f3881e = typedArrayObtainStyledAttributes.getDrawable(C0983R.styleable.ActionBar_background);
        this.f3882f = typedArrayObtainStyledAttributes.getDrawable(C0983R.styleable.ActionBar_backgroundStacked);
        this.f3886j = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0983R.styleable.ActionBar_height, -1);
        boolean z = true;
        if (getId() == C0983R.id.split_action_bar) {
            this.f3884h = true;
            this.f3883g = typedArrayObtainStyledAttributes.getDrawable(C0983R.styleable.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f3884h ? this.f3881e != null || this.f3882f != null : this.f3883g != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* JADX INFO: renamed from: a */
    public static int m2347a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3881e;
        if (drawable != null && drawable.isStateful()) {
            this.f3881e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f3882f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f3882f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f3883g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f3883g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f3878b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3881e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3882f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f3883g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3879c = findViewById(C0983R.id.action_bar);
        this.f3880d = findViewById(C0983R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f3877a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[PHI: r1
  0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        C1040c c1040c = this.f3878b;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (c1040c == null || c1040c.getVisibility() == 8) ? false : true;
        if (c1040c != null && c1040c.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c1040c.getLayoutParams();
            int measuredHeight2 = measuredHeight - c1040c.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            c1040c.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.f3884h) {
            Drawable drawable2 = this.f3883g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = z3;
            }
        } else {
            if (this.f3881e != null) {
                if (this.f3879c.getVisibility() == 0) {
                    this.f3881e.setBounds(this.f3879c.getLeft(), this.f3879c.getTop(), this.f3879c.getRight(), this.f3879c.getBottom());
                } else {
                    View view = this.f3880d;
                    if (view == null || view.getVisibility() != 0) {
                        this.f3881e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f3881e.setBounds(this.f3880d.getLeft(), this.f3880d.getTop(), this.f3880d.getRight(), this.f3880d.getBottom());
                    }
                }
                z3 = true;
            }
            this.f3885i = z4;
            if (z4 && (drawable = this.f3882f) != null) {
                drawable.setBounds(c1040c.getLeft(), c1040c.getTop(), c1040c.getRight(), c1040c.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iM2347a;
        int i3;
        if (this.f3879c == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f3886j) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f3879c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        C1040c c1040c = this.f3878b;
        if (c1040c == null || c1040c.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.f3879c;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.f3880d;
            iM2347a = (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) ? 0 : m2347a(this.f3880d);
        } else {
            iM2347a = m2347a(this.f3879c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(m2347a(this.f3878b) + iM2347a, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f3881e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3881e);
        }
        this.f3881e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f3879c;
            if (view != null) {
                this.f3881e.setBounds(view.getLeft(), this.f3879c.getTop(), this.f3879c.getRight(), this.f3879c.getBottom());
            }
        }
        boolean z = false;
        if (!this.f3884h ? !(this.f3881e != null || this.f3882f != null) : this.f3883g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3883g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3883g);
        }
        this.f3883g = drawable;
        boolean z = this.f3884h;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f3883g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f3881e != null || this.f3882f != null) : this.f3883g == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3882f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3882f);
        }
        this.f3882f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3885i && (drawable2 = this.f3882f) != null) {
                drawable2.setBounds(this.f3878b.getLeft(), this.f3878b.getTop(), this.f3878b.getRight(), this.f3878b.getBottom());
            }
        }
        boolean z = false;
        if (!this.f3884h ? !(this.f3881e != null || this.f3882f != null) : this.f3883g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(C1040c c1040c) {
        C1040c c1040c2 = this.f3878b;
        if (c1040c2 != null) {
            removeView(c1040c2);
        }
        this.f3878b = c1040c;
        if (c1040c != null) {
            addView(c1040c);
            ViewGroup.LayoutParams layoutParams = c1040c.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c1040c.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f3877a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f3881e;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f3882f;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f3883g;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3881e;
        boolean z = this.f3884h;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f3882f && this.f3885i) {
            return true;
        }
        return (drawable == this.f3883g && z) || super.verifyDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
