package androidx.appcompat.widget;

import Yue.C3083;
import Yue.C6898;
import Yue.InterfaceC6391;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import net.bytebuddy.jar.asm.Opcodes;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f26108;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public View f26109;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public View f26110;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public View f26111;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Drawable f26112;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Drawable f26113;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public Drawable f26114;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f26115;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean f26116;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int f26117;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarContainer$ۥ */
    @InterfaceC7113(21)
    public static class C1611 {
        /* JADX INFO: renamed from: ۥ */
        public static void m4656(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionBarContainer(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f26112;
        if (drawable != null && drawable.isStateful()) {
            this.f26112.setState(getDrawableState());
        }
        Drawable drawable2 = this.f26113;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f26113.setState(getDrawableState());
        }
        Drawable drawable3 = this.f26114;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f26114.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f26109;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f26112;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f26113;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f26114;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f26110 = findViewById(C6898.C6903.f2448);
        this.f26111 = findViewById(C6898.C6903.f18892);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f26108 || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r0
  0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f26109;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            view.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.f26115) {
            Drawable drawable2 = this.f26114;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = z3;
            }
        } else {
            if (this.f26112 != null) {
                if (this.f26110.getVisibility() == 0) {
                    this.f26112.setBounds(this.f26110.getLeft(), this.f26110.getTop(), this.f26110.getRight(), this.f26110.getBottom());
                } else {
                    View view2 = this.f26111;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f26112.setBounds(0, 0, 0, 0);
                    } else {
                        this.f26112.setBounds(this.f26111.getLeft(), this.f26111.getTop(), this.f26111.getRight(), this.f26111.getBottom());
                    }
                }
                z3 = true;
            }
            this.f26116 = z4;
            if (z4 && (drawable = this.f26113) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.f26110 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f26117) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f26110 == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.f26109;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!m4655(this.f26110) ? m4654(this.f26110) : !m4655(this.f26111) ? m4654(this.f26111) : 0) + m4654(this.f26109), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f26112;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f26112);
        }
        this.f26112 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f26110;
            if (view != null) {
                this.f26112.setBounds(view.getLeft(), this.f26110.getTop(), this.f26110.getRight(), this.f26110.getBottom());
            }
        }
        boolean z = false;
        if (!this.f26115 ? !(this.f26112 != null || this.f26113 != null) : this.f26114 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        C1611.m4656(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f26114;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f26114);
        }
        this.f26114 = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f26115 && (drawable2 = this.f26114) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f26115 ? !(this.f26112 != null || this.f26113 != null) : this.f26114 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        C1611.m4656(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f26113;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f26113);
        }
        this.f26113 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f26116 && (drawable2 = this.f26113) != null) {
                drawable2.setBounds(this.f26109.getLeft(), this.f26109.getTop(), this.f26109.getRight(), this.f26109.getBottom());
            }
        }
        boolean z = false;
        if (!this.f26115 ? !(this.f26112 != null || this.f26113 != null) : this.f26114 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        C1611.m4656(this);
    }

    public void setTabContainer(C8756 c8756) {
        View view = this.f26109;
        if (view != null) {
            removeView(view);
        }
        this.f26109 = c8756;
        if (c8756 != null) {
            addView(c8756);
            ViewGroup.LayoutParams layoutParams = c8756.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c8756.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f26108 = z;
        setDescendantFocusability(z ? Opcodes.ASM6 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f26112;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f26113;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f26114;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(@InterfaceC6391 Drawable drawable) {
        return (drawable == this.f26112 && !this.f26115) || (drawable == this.f26113 && this.f26116) || ((drawable == this.f26114 && this.f26115) || super.verifyDrawable(drawable));
    }

    /* JADX INFO: renamed from: ۥ */
    public final int m4654(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m4655(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C3083(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6898.C6909.f2460);
        this.f26112 = typedArrayObtainStyledAttributes.getDrawable(C6898.C6909.f2461);
        this.f26113 = typedArrayObtainStyledAttributes.getDrawable(C6898.C6909.f19368);
        this.f26117 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6898.C6909.f19379, -1);
        boolean z = true;
        if (getId() == C6898.C6903.f18946) {
            this.f26115 = true;
            this.f26114 = typedArrayObtainStyledAttributes.getDrawable(C6898.C6909.f19367);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f26115 ? this.f26112 != null || this.f26113 != null : this.f26114 != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
