package com.lxj.xpopup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import androidx.core.view.AbstractC2270;
import com.lxj.xpopup.enums.LayoutStatus;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class SmartDragLayout extends LinearLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public InterfaceC3789 f11931;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public View f11932;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f11933;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f11934;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f11935;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f11936;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f11937;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f11938;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f11939;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public LayoutStatus f11940;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f11941;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public VelocityTracker f11942;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f11943;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final OverScroller f11944;

    public SmartDragLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11943 = true;
        this.f11937 = true;
        this.f11936 = false;
        this.f11940 = LayoutStatus.Close;
        this.f11941 = 400;
        this.f11944 = new OverScroller(context);
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        OverScroller overScroller = this.f11944;
        if (overScroller.computeScrollOffset()) {
            scrollTo(overScroller.getCurrX(), overScroller.getCurrY());
            WeakHashMap weakHashMap = AbstractC2270.f6594;
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
        this.f11933 = false;
        this.f11936 = false;
        setTranslationY(0.0f);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f11936 = true;
        LayoutStatus layoutStatus = this.f11940;
        if (layoutStatus == LayoutStatus.Closing || layoutStatus == LayoutStatus.Opening) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.f11943) {
            int measuredWidth = (getMeasuredWidth() / 2) - (this.f11932.getMeasuredWidth() / 2);
            this.f11932.layout(measuredWidth, getMeasuredHeight() - this.f11932.getMeasuredHeight(), this.f11932.getMeasuredWidth() + measuredWidth, getMeasuredHeight());
            return;
        }
        View view = this.f11932;
        if (view == null) {
            return;
        }
        this.f11938 = view.getMeasuredHeight();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (this.f11932.getMeasuredWidth() / 2);
        this.f11932.layout(measuredWidth2, getMeasuredHeight(), this.f11932.getMeasuredWidth() + measuredWidth2, getMeasuredHeight() + this.f11938);
        if (this.f11940 == LayoutStatus.Open) {
            scrollTo(getScrollX(), getScrollY() - (this.f11939 - this.f11938));
        }
        this.f11939 = this.f11938;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (getScrollY() <= 0 || getScrollY() >= this.f11938 || f2 >= -1500.0f) {
            return false;
        }
        this.f11936 = true;
        post(new RunnableC3791(this, 1));
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
            if (scrollY < this.f11938) {
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
        this.f11944.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return i == 2 && this.f11943;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        m8116();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.widget.SmartDragLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f11932 = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void scrollTo(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f11938
            if (r7 <= r0) goto L5
            r7 = r0
        L5:
            r1 = 0
            if (r7 >= 0) goto L9
            r7 = r1
        L9:
            float r2 = (float) r7
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r3
            float r0 = (float) r0
            float r2 = r2 / r0
            int r0 = r5.getScrollY()
            if (r7 <= r0) goto L16
            r1 = 1
        L16:
            r5.f11933 = r1
            com.lxj.xpopup.widget.飘花落叶言子楪世兰哲苏 r0 = r5.f11931
            if (r0 == 0) goto L4d
            boolean r1 = r5.f11936
            if (r1 == 0) goto L3a
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L3a
            com.lxj.xpopup.enums.LayoutStatus r1 = r5.f11940
            com.lxj.xpopup.enums.LayoutStatus r4 = com.lxj.xpopup.enums.LayoutStatus.Close
            if (r1 == r4) goto L3a
            r5.f11940 = r4
            com.lxj.xpopup.core.飘花落叶言子楪世兰哲苏 r0 = (com.lxj.xpopup.core.C3775) r0
            com.lxj.xpopup.core.飘花落叶言子楪世兰苏哲 r0 = r0.f11805
            com.lxj.xpopup.core.飘花落叶言子楪苏世兰哲 r0 = (com.lxj.xpopup.core.AbstractC3781) r0
            r0.beforeDismiss()
            r0.doAfterDismiss()
            goto L46
        L3a:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 != 0) goto L46
            com.lxj.xpopup.enums.LayoutStatus r0 = r5.f11940
            com.lxj.xpopup.enums.LayoutStatus r1 = com.lxj.xpopup.enums.LayoutStatus.Open
            if (r0 == r1) goto L46
            r5.f11940 = r1
        L46:
            com.lxj.xpopup.widget.飘花落叶言子楪世兰哲苏 r0 = r5.f11931
            com.lxj.xpopup.core.飘花落叶言子楪世兰哲苏 r0 = (com.lxj.xpopup.core.C3775) r0
            r0.m8098(r2)
        L4d:
            super.scrollTo(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.widget.SmartDragLayout.scrollTo(int, int):void");
    }

    public void setDuration(int i) {
        this.f11941 = i;
    }

    public void setOnCloseListener(InterfaceC3789 interfaceC3789) {
        this.f11931 = interfaceC3789;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8116() {
        if (this.f11943) {
            boolean z = this.f11933;
            int i = this.f11938;
            if (!z) {
                i *= 2;
            }
            this.f11944.startScroll(getScrollX(), getScrollY(), 0, (getScrollY() > i / 3 ? this.f11938 : 0) - getScrollY(), this.f11941);
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            postInvalidateOnAnimation();
        }
    }
}
