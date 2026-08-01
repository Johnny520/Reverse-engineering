package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.davemorrissey.labs.subscaleview.C0328R;
import net.bytebuddy.jar.asm.Opcodes;
import p204.AbstractC8602;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Drawable f734;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Drawable f735;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f736;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int f737;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Drawable f738;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f739;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public View f740;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public View f741;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f742;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1036(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8602.f21434);
        boolean z = false;
        this.f735 = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f734 = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f737 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == C0328R.id.split_action_bar) {
            this.f739 = true;
            this.f738 = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f739 ? !(this.f735 != null || this.f734 != null) : this.f738 == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f735;
        if (drawable != null && drawable.isStateful()) {
            this.f735.setState(getDrawableState());
        }
        Drawable drawable2 = this.f734;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f734.setState(getDrawableState());
        }
        Drawable drawable3 = this.f738;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f738.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f735;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f734;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f738;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f740 = findViewById(C0328R.id.action_bar);
        this.f741 = findViewById(C0328R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f742 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f739) {
            Drawable drawable = this.f738;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f735 == null) {
                z2 = false;
            } else if (this.f740.getVisibility() == 0) {
                this.f735.setBounds(this.f740.getLeft(), this.f740.getTop(), this.f740.getRight(), this.f740.getBottom());
            } else {
                View view = this.f741;
                if (view == null || view.getVisibility() != 0) {
                    this.f735.setBounds(0, 0, 0, 0);
                } else {
                    this.f735.setBounds(this.f741.getLeft(), this.f741.getTop(), this.f741.getRight(), this.f741.getBottom());
                }
            }
            this.f736 = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f740 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f737) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f740 == null) {
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
        Drawable drawable2 = this.f735;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f735);
        }
        this.f735 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f740;
            if (view != null) {
                this.f735.setBounds(view.getLeft(), this.f740.getTop(), this.f740.getRight(), this.f740.getBottom());
            }
        }
        boolean z = false;
        if (!this.f739 ? !(this.f735 != null || this.f734 != null) : this.f738 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f738;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f738);
        }
        this.f738 = drawable;
        boolean z = this.f739;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f738) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f735 != null || this.f734 != null) : this.f738 == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f734;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f734);
        }
        this.f734 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f736 && this.f734 != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f739 ? !(this.f735 != null || this.f734 != null) : this.f738 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.f742 = z;
        setDescendantFocusability(z ? Opcodes.ASM6 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f735;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f734;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f738;
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
        Drawable drawable2 = this.f735;
        boolean z = this.f739;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f734 && this.f736) {
            return true;
        }
        return (drawable == this.f738 && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(AbstractC1000 abstractC1000) {
    }
}
