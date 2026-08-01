package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.p055lu.wxmask272.R;
import java.util.WeakHashMap;
import p058d.AbstractC0515a;
import p069i.AbstractC0641Q0;
import p069i.C0662b;
import p099y.AbstractC1048L;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public boolean f945b;

    /* JADX INFO: renamed from: c */
    public View f946c;

    /* JADX INFO: renamed from: d */
    public View f947d;

    /* JADX INFO: renamed from: e */
    public Drawable f948e;

    /* JADX INFO: renamed from: f */
    public Drawable f949f;

    /* JADX INFO: renamed from: g */
    public Drawable f950g;

    /* JADX INFO: renamed from: h */
    public final boolean f951h;

    /* JADX INFO: renamed from: i */
    public boolean f952i;

    /* JADX INFO: renamed from: j */
    public final int f953j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0662b c0662b = new C0662b(this);
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        setBackground(c0662b);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0515a.f1637a);
        boolean z2 = false;
        this.f948e = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f949f = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f953j = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f951h = true;
            this.f950g = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f951h ? !(this.f948e != null || this.f949f != null) : this.f950g == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f948e;
        if (drawable != null && drawable.isStateful()) {
            this.f948e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f949f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f949f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f950g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f950g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f948e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f949f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f950g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f946c = findViewById(R.id.action_bar);
        this.f947d = findViewById(R.id.action_context_bar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f945b || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = true;
        if (this.f951h) {
            Drawable drawable = this.f950g;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f948e == null) {
                z3 = false;
            } else if (this.f946c.getVisibility() == 0) {
                this.f948e.setBounds(this.f946c.getLeft(), this.f946c.getTop(), this.f946c.getRight(), this.f946c.getBottom());
            } else {
                View view = this.f947d;
                if (view == null || view.getVisibility() != 0) {
                    this.f948e.setBounds(0, 0, 0, 0);
                } else {
                    this.f948e.setBounds(this.f947d.getLeft(), this.f947d.getTop(), this.f947d.getRight(), this.f947d.getBottom());
                }
            }
            this.f952i = false;
        }
        if (z3) {
            invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f946c == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f953j) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f946c == null) {
            return;
        }
        View.MeasureSpec.getMode(i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f948e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f948e);
        }
        this.f948e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f946c;
            if (view != null) {
                this.f948e.setBounds(view.getLeft(), this.f946c.getTop(), this.f946c.getRight(), this.f946c.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f951h ? !(this.f948e != null || this.f949f != null) : this.f950g == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f950g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f950g);
        }
        this.f950g = drawable;
        boolean z2 = this.f951h;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f950g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f948e != null || this.f949f != null) : this.f950g == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f949f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f949f);
        }
        this.f949f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f952i && this.f949f != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f951h ? !(this.f948e != null || this.f949f != null) : this.f950g == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTransitioning(boolean z2) {
        this.f945b = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f948e;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f949f;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f950g;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f948e;
        boolean z2 = this.f951h;
        if (drawable == drawable2 && !z2) {
            return true;
        }
        if (drawable == this.f949f && this.f952i) {
            return true;
        }
        return (drawable == this.f950g && z2) || super.verifyDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void setTabContainer(AbstractC0641Q0 abstractC0641Q0) {
    }
}
