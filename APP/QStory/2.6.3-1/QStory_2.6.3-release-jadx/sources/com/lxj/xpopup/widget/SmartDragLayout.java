package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import androidx.core.view.AbstractC3103;
import com.google.protobuf.DescriptorProtos$Edition;
import com.lxj.xpopup.core.AbstractC4613;
import com.lxj.xpopup.core.C4607;
import com.lxj.xpopup.enums.LayoutStatus;
import com.lxj.xpopup.util.AbstractC4620;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class SmartDragLayout extends LinearLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public InterfaceC4621 f12276;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public View f12277;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f12278;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f12279;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f12280;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f12281;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f12282;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f12283;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f12284;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public LayoutStatus f12285;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f12286;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public VelocityTracker f12287;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f12288;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final OverScroller f12289;

    public SmartDragLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f12288 = true;
        this.f12282 = true;
        this.f12281 = false;
        this.f12285 = LayoutStatus.Close;
        this.f12286 = 400;
        this.f12289 = new OverScroller(context);
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        OverScroller overScroller = this.f12289;
        if (overScroller.computeScrollOffset()) {
            scrollTo(overScroller.getCurrX(), overScroller.getCurrY());
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12278 = false;
        this.f12281 = false;
        setTranslationY(0.0f);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f12281 = true;
        LayoutStatus layoutStatus = this.f12285;
        if (layoutStatus == LayoutStatus.Closing || layoutStatus == LayoutStatus.Opening) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.f12288) {
            int measuredWidth = (getMeasuredWidth() / 2) - (this.f12277.getMeasuredWidth() / 2);
            this.f12277.layout(measuredWidth, getMeasuredHeight() - this.f12277.getMeasuredHeight(), this.f12277.getMeasuredWidth() + measuredWidth, getMeasuredHeight());
            return;
        }
        View view = this.f12277;
        if (view == null) {
            return;
        }
        this.f12283 = view.getMeasuredHeight();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (this.f12277.getMeasuredWidth() / 2);
        this.f12277.layout(measuredWidth2, getMeasuredHeight(), this.f12277.getMeasuredWidth() + measuredWidth2, getMeasuredHeight() + this.f12283);
        if (this.f12285 == LayoutStatus.Open) {
            scrollTo(getScrollX(), getScrollY() - (this.f12284 - this.f12283));
        }
        this.f12284 = this.f12283;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (getScrollY() <= 0 || getScrollY() >= this.f12283 || f2 >= -1500.0f) {
            return false;
        }
        this.f12281 = true;
        post(new RunnableC4623(this, 1));
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            int scrollY = getScrollY() + i2;
            if (scrollY < this.f12283) {
                iArr[1] = i2;
            }
            scrollTo(getScrollX(), scrollY);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        scrollTo(getScrollX(), getScrollY() + i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f12289.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return i == 2 && this.f12288;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        m8675();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        LayoutStatus layoutStatus = this.f12285;
        if (layoutStatus == LayoutStatus.Closing || layoutStatus == LayoutStatus.Opening) {
            return false;
        }
        int i = 1;
        if (this.f12288 && (this.f12289.computeScrollOffset() || this.f12285 == LayoutStatus.Close)) {
            this.f12280 = 0.0f;
            this.f12279 = 0.0f;
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f12288) {
                VelocityTracker velocityTracker3 = this.f12287;
                if (velocityTracker3 != null) {
                    velocityTracker3.clear();
                }
                this.f12287 = VelocityTracker.obtain();
            }
            this.f12280 = motionEvent.getX();
            this.f12279 = motionEvent.getY();
        } else if (action == 1) {
            Rect rect = new Rect();
            this.f12277.getGlobalVisibleRect(rect);
            if (!AbstractC4620.m8667(motionEvent.getRawX(), motionEvent.getRawY(), rect) && this.f12282) {
                if (((float) Math.sqrt(Math.pow(motionEvent.getY() - this.f12279, 2.0d) + Math.pow(motionEvent.getX() - this.f12280, 2.0d))) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    performClick();
                }
            }
            if (this.f12288 && (velocityTracker = this.f12287) != null) {
                if (velocityTracker.getYVelocity() > 1500.0f) {
                    this.f12281 = true;
                    post(new RunnableC4623(this, i));
                } else {
                    m8675();
                }
                this.f12287 = null;
            }
        } else if (action != 2) {
            if (action == 3) {
            }
        } else if (this.f12288 && (velocityTracker2 = this.f12287) != null) {
            velocityTracker2.addMovement(motionEvent);
            this.f12287.computeCurrentVelocity(DescriptorProtos$Edition.EDITION_2023_VALUE);
            scrollTo(getScrollX(), getScrollY() - ((int) (motionEvent.getY() - this.f12279)));
            this.f12279 = motionEvent.getY();
        }
        return this.f12288;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f12277 = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void scrollTo(int i, int i2) {
        int i3 = this.f12283;
        if (i2 > i3) {
            i2 = i3;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        float f = (i2 * 1.0f) / i3;
        this.f12278 = i2 > getScrollY();
        InterfaceC4621 interfaceC4621 = this.f12276;
        if (interfaceC4621 != null) {
            if (this.f12281 && f == 0.0f) {
                LayoutStatus layoutStatus = this.f12285;
                LayoutStatus layoutStatus2 = LayoutStatus.Close;
                if (layoutStatus != layoutStatus2) {
                    this.f12285 = layoutStatus2;
                    AbstractC4613 abstractC4613 = (AbstractC4613) ((C4607) interfaceC4621).f12150;
                    abstractC4613.beforeDismiss();
                    abstractC4613.doAfterDismiss();
                }
                ((C4607) this.f12276).m8657(f);
            } else {
                if (f == 1.0f) {
                    LayoutStatus layoutStatus3 = this.f12285;
                    LayoutStatus layoutStatus4 = LayoutStatus.Open;
                    if (layoutStatus3 != layoutStatus4) {
                        this.f12285 = layoutStatus4;
                    }
                }
                ((C4607) this.f12276).m8657(f);
            }
        }
        super.scrollTo(i, i2);
    }

    public void setDuration(int i) {
        this.f12286 = i;
    }

    public void setOnCloseListener(InterfaceC4621 interfaceC4621) {
        this.f12276 = interfaceC4621;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8675() {
        if (this.f12288) {
            boolean z = this.f12278;
            int i = this.f12283;
            if (!z) {
                i *= 2;
            }
            this.f12289.startScroll(getScrollX(), getScrollY(), 0, (getScrollY() > i / 3 ? this.f12283 : 0) - getScrollY(), this.f12286);
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            postInvalidateOnAnimation();
        }
    }
}
