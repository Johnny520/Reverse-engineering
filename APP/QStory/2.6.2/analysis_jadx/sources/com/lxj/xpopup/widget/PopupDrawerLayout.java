package com.lxj.xpopup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC2270;
import com.lxj.xpopup.enums.PopupPosition;
import java.util.WeakHashMap;
import p169.C7716;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class PopupDrawerLayout extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f11912;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f11913;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public float f11914;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f11915;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f11916;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public View f11917;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C7716 f11918;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f11919;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public float f11920;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public View f11921;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f11922;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f11923;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f11924;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public PopupPosition f11925;

    public PopupDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11925 = PopupPosition.Left;
        this.f11923 = true;
        this.f11924 = true;
        this.f11922 = false;
        this.f11919 = false;
        this.f11918 = new C7716(getContext(), this, new C3793(this, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m8127(android.view.ViewGroup r10, float r11, float r12, int r13) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.getChildCount()
            if (r1 >= r2) goto L82
            android.view.View r2 = r10.getChildAt(r1)
            r3 = 2
            int[] r3 = new int[r3]
            r2.getLocationInWindow(r3)
            android.graphics.Rect r4 = new android.graphics.Rect
            r5 = r3[r0]
            r6 = 1
            r7 = r3[r6]
            int r8 = r2.getWidth()
            int r8 = r8 + r5
            r3 = r3[r6]
            int r9 = r2.getHeight()
            int r9 = r9 + r3
            r4.<init>(r5, r7, r8, r9)
            boolean r3 = com.lxj.xpopup.util.AbstractC3787.m8121(r11, r12, r4)
            if (r3 == 0) goto L7f
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L74
            boolean r10 = r2 instanceof p150.AbstractC7582
            if (r10 == 0) goto L39
            飘花落叶言子兰苏楪哲世.飘花落叶言子楪苏世兰哲 r2 = (p150.AbstractC7582) r2
            return r0
        L39:
            boolean r10 = r2 instanceof android.widget.HorizontalScrollView
            r1 = -1
            if (r10 == 0) goto L54
            android.widget.HorizontalScrollView r2 = (android.widget.HorizontalScrollView) r2
            if (r13 != 0) goto L4f
            boolean r10 = r2.canScrollHorizontally(r1)
            if (r10 != 0) goto L7e
            boolean r10 = r2.canScrollHorizontally(r6)
            if (r10 == 0) goto L82
            goto L7e
        L4f:
            boolean r10 = r2.canScrollHorizontally(r13)
            return r10
        L54:
            boolean r10 = r2 instanceof androidx.viewpager2.widget.C2549
            if (r10 == 0) goto L6d
            androidx.viewpager2.widget.飘花落叶言子楪哲兰苏世 r2 = (androidx.viewpager2.widget.C2549) r2
            android.view.View r10 = r2.getChildAt(r0)
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            boolean r11 = r10.canScrollHorizontally(r1)
            if (r11 != 0) goto L7e
            boolean r10 = r10.canScrollHorizontally(r6)
            if (r10 == 0) goto L82
            goto L7e
        L6d:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            boolean r10 = m8127(r2, r11, r12, r13)
            return r10
        L74:
            boolean r3 = r2 instanceof android.widget.AbsSeekBar
            if (r3 == 0) goto L7f
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L7f
        L7e:
            return r6
        L7f:
            int r1 = r1 + 1
            goto L2
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.widget.PopupDrawerLayout.m8127(android.view.ViewGroup, float, float, int):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m8128(PopupDrawerLayout popupDrawerLayout, int i) {
        PopupPosition popupPosition = popupDrawerLayout.f11925;
        if (popupPosition == PopupPosition.Left) {
            if (i < (-popupDrawerLayout.f11921.getMeasuredWidth())) {
                i = -popupDrawerLayout.f11921.getMeasuredWidth();
            }
            if (i > 0) {
                return 0;
            }
            return i;
        }
        if (popupPosition == PopupPosition.Right) {
            if (i < popupDrawerLayout.getMeasuredWidth() - popupDrawerLayout.f11921.getMeasuredWidth()) {
                i = popupDrawerLayout.getMeasuredWidth() - popupDrawerLayout.f11921.getMeasuredWidth();
            }
            if (i > popupDrawerLayout.getMeasuredWidth()) {
                return popupDrawerLayout.getMeasuredWidth();
            }
        }
        return i;
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.f11918.m12988(true)) {
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getTranslationY();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f11917 = getChildAt(0);
        this.f11921 = getChildAt(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.f11923
            if (r0 != 0) goto L9
            boolean r6 = super.onInterceptTouchEvent(r7)
            return r6
        L9:
            飘花落叶言子哲苏楪兰世.飘花落叶言子楪世兰苏哲 r0 = r6.f11918
            r1 = 1
            boolean r2 = r0.m12988(r1)
            if (r2 != 0) goto L9f
            com.lxj.xpopup.enums.LayoutStatus r2 = com.lxj.xpopup.enums.LayoutStatus.Close
            if (r2 != 0) goto L18
            goto L9f
        L18:
            float r2 = r7.getX()
            float r3 = r6.f11920
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r3 = 0
            if (r2 >= 0) goto L25
            r2 = r1
            goto L26
        L25:
            r2 = r3
        L26:
            r6.f11913 = r2
            float r2 = r7.getX()
            r6.f11920 = r2
            float r2 = r7.getY()
            r6.f11916 = r2
            int r2 = r7.getAction()
            if (r2 == 0) goto L60
            if (r2 == r1) goto L5a
            r4 = 2
            if (r2 == r4) goto L43
            r4 = 3
            if (r2 == r4) goto L5a
            goto L6c
        L43:
            float r2 = r6.f11920
            float r4 = r6.f11915
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            float r4 = r6.f11916
            float r5 = r6.f11914
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L6c
            return r3
        L5a:
            r2 = 0
            r6.f11920 = r2
            r6.f11916 = r2
            goto L6c
        L60:
            float r2 = r7.getX()
            r6.f11915 = r2
            float r2 = r7.getY()
            r6.f11914 = r2
        L6c:
            float r2 = r7.getX()
            float r4 = r7.getY()
            boolean r1 = m8127(r6, r2, r4, r1)
            r6.f11912 = r1
            boolean r0 = r0.m12997(r7)
            r6.f11919 = r0
            boolean r1 = r6.f11913
            if (r1 == 0) goto L89
            boolean r1 = r6.f11912
            if (r1 != 0) goto L89
            return r0
        L89:
            float r0 = r7.getX()
            float r1 = r7.getY()
            boolean r0 = m8127(r6, r0, r1, r3)
            if (r0 != 0) goto L9a
            boolean r6 = r6.f11919
            return r6
        L9a:
            boolean r6 = super.onInterceptTouchEvent(r7)
            return r6
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.widget.PopupDrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f11917.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        if (this.f11922) {
            View view = this.f11921;
            view.layout(view.getLeft(), this.f11921.getTop(), this.f11921.getRight(), this.f11921.getMeasuredHeight());
            return;
        }
        PopupPosition popupPosition = this.f11925;
        PopupPosition popupPosition2 = PopupPosition.Left;
        View view2 = this.f11921;
        if (popupPosition == popupPosition2) {
            view2.layout(-view2.getMeasuredWidth(), 0, 0, getMeasuredHeight());
        } else {
            view2.layout(getMeasuredWidth(), 0, this.f11921.getMeasuredWidth() + getMeasuredWidth(), getMeasuredHeight());
        }
        this.f11922 = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f11923) {
            return super.onTouchEvent(motionEvent);
        }
        C7716 c7716 = this.f11918;
        if (c7716.m12988(true)) {
            return true;
        }
        c7716.m13003(motionEvent);
        return true;
    }

    public void setDrawerPosition(PopupPosition popupPosition) {
        this.f11925 = popupPosition;
    }

    public void setOnCloseListener(InterfaceC3792 interfaceC3792) {
    }
}
