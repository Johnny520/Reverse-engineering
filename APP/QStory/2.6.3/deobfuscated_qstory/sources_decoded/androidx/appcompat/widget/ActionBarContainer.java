package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.davemorrissey.labs.subscaleview.R;
import net.bytebuddy.jar.asm.Opcodes;
import p188.AbstractC7773;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Drawable f389;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Drawable f390;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f391;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int f392;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Drawable f393;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f394;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public View f395;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public View f396;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f397;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0189(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7773.f21089);
        boolean z = false;
        this.f390 = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f389 = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f392 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f394 = true;
            this.f393 = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f394 ? !(this.f390 != null || this.f389 != null) : this.f393 == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f390;
        if (drawable != null && drawable.isStateful()) {
            this.f390.setState(getDrawableState());
        }
        Drawable drawable2 = this.f389;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f389.setState(getDrawableState());
        }
        Drawable drawable3 = this.f393;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f393.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f390;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f389;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f393;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f395 = findViewById(R.id.action_bar);
        this.f396 = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f397 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f394) {
            Drawable drawable = this.f393;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f390 == null) {
                z2 = false;
            } else if (this.f395.getVisibility() == 0) {
                this.f390.setBounds(this.f395.getLeft(), this.f395.getTop(), this.f395.getRight(), this.f395.getBottom());
            } else {
                View view = this.f396;
                if (view == null || view.getVisibility() != 0) {
                    this.f390.setBounds(0, 0, 0, 0);
                } else {
                    this.f390.setBounds(this.f396.getLeft(), this.f396.getTop(), this.f396.getRight(), this.f396.getBottom());
                }
            }
            this.f391 = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f395 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f392) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f395 == null) {
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
        Drawable drawable2 = this.f390;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f390);
        }
        this.f390 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f395;
            if (view != null) {
                this.f390.setBounds(view.getLeft(), this.f395.getTop(), this.f395.getRight(), this.f395.getBottom());
            }
        }
        boolean z = false;
        if (!this.f394 ? !(this.f390 != null || this.f389 != null) : this.f393 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f393;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f393);
        }
        this.f393 = drawable;
        boolean z = this.f394;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f393) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f390 != null || this.f389 != null) : this.f393 == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f389;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f389);
        }
        this.f389 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f391 && this.f389 != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f394 ? !(this.f390 != null || this.f389 != null) : this.f393 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.f397 = z;
        setDescendantFocusability(z ? Opcodes.ASM6 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f390;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f389;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f393;
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
        Drawable drawable2 = this.f390;
        boolean z = this.f394;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f389 && this.f391) {
            return true;
        }
        return (drawable == this.f393 && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(AbstractC0153 abstractC0153) {
    }
}
