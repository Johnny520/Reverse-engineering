package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.WeakHashMap;
import yyds.AbstractC0631;
import yyds.AbstractC1592;
import yyds.AbstractC1640;
import yyds.C2105;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public Drawable f76;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final boolean f77;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public View f78;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public Drawable f79;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final int f80;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f81;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f82;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Drawable f83;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public View f84;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C2105 c2105 = new C2105(this);
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        setBackground(c2105);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1592.f8094);
        boolean z = false;
        this.f83 = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f79 = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f80 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f77 = true;
            this.f76 = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f77 ? !(this.f83 != null || this.f79 != null) : this.f76 == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f83;
        if (drawable != null && drawable.isStateful()) {
            this.f83.setState(getDrawableState());
        }
        Drawable drawable2 = this.f79;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f79.setState(getDrawableState());
        }
        Drawable drawable3 = this.f76;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f76.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f83;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f79;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f76;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f84 = findViewById(R.id.action_bar);
        this.f78 = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f82 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f77) {
            Drawable drawable = this.f76;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f83 == null) {
                z2 = false;
            } else if (this.f84.getVisibility() == 0) {
                this.f83.setBounds(this.f84.getLeft(), this.f84.getTop(), this.f84.getRight(), this.f84.getBottom());
            } else {
                View view = this.f78;
                if (view == null || view.getVisibility() != 0) {
                    this.f83.setBounds(0, 0, 0, 0);
                } else {
                    this.f83.setBounds(this.f78.getLeft(), this.f78.getTop(), this.f78.getRight(), this.f78.getBottom());
                }
            }
            this.f81 = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f84 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f80) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f84 == null) {
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
        Drawable drawable2 = this.f83;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f83);
        }
        this.f83 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f84;
            if (view != null) {
                this.f83.setBounds(view.getLeft(), this.f84.getTop(), this.f84.getRight(), this.f84.getBottom());
            }
        }
        boolean z = false;
        if (!this.f77 ? !(this.f83 != null || this.f79 != null) : this.f76 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f76;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f76);
        }
        this.f76 = drawable;
        boolean z = this.f77;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f76) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f83 != null || this.f79 != null) : this.f76 == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f79;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f79);
        }
        this.f79 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f81 && this.f79 != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f77 ? !(this.f83 != null || this.f79 != null) : this.f76 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(AbstractC0631 abstractC0631) {
    }

    public void setTransitioning(boolean z) {
        this.f82 = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f83;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f79;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f76;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f83;
        boolean z = this.f77;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f79 && this.f81) {
            return true;
        }
        return (drawable == this.f76 && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
