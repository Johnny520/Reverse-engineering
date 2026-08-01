package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.core.view.AbstractC3103;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C3382;
import com.lxj.xpopup.enums.LayoutStatus;
import com.lxj.xpopup.enums.PopupPosition;
import com.lxj.xpopup.util.AbstractC4620;
import java.util.WeakHashMap;
import p166.AbstractC8412;
import p185.C8546;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class PopupDrawerLayout extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f12262;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f12263;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public float f12264;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f12265;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f12266;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public View f12267;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C8546 f12268;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f12269;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public float f12270;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public View f12271;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f12272;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f12273;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f12274;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public PopupPosition f12275;

    public PopupDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f12275 = PopupPosition.Left;
        this.f12273 = true;
        this.f12274 = true;
        this.f12272 = false;
        this.f12269 = false;
        this.f12268 = new C8546(getContext(), this, new C4626(this, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m8673(ViewGroup viewGroup, float f, float f2, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= viewGroup.getChildCount()) {
                break;
            }
            View childAt = viewGroup.getChildAt(i2);
            int[] iArr = new int[2];
            childAt.getLocationInWindow(iArr);
            int i3 = iArr[0];
            if (AbstractC4620.m8667(f, f2, new Rect(i3, iArr[1], childAt.getWidth() + i3, childAt.getHeight() + iArr[1]))) {
                if (!(childAt instanceof ViewGroup)) {
                    if ((childAt instanceof AbsSeekBar) && childAt.isEnabled()) {
                        break;
                    }
                } else {
                    if (childAt instanceof AbstractC8412) {
                        return false;
                    }
                    if (childAt instanceof HorizontalScrollView) {
                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) childAt;
                        if (i != 0) {
                            return horizontalScrollView.canScrollHorizontally(i);
                        }
                        if (horizontalScrollView.canScrollHorizontally(-1) || horizontalScrollView.canScrollHorizontally(1)) {
                            break;
                        }
                    } else {
                        if (!(childAt instanceof C3382)) {
                            return m8673((ViewGroup) childAt, f, f2, i);
                        }
                        RecyclerView recyclerView = (RecyclerView) ((C3382) childAt).getChildAt(0);
                        if (recyclerView.canScrollHorizontally(-1) || recyclerView.canScrollHorizontally(1)) {
                            break;
                        }
                    }
                }
            }
            i2++;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m8674(PopupDrawerLayout popupDrawerLayout, int i) {
        PopupPosition popupPosition = popupDrawerLayout.f12275;
        if (popupPosition == PopupPosition.Left) {
            if (i < (-popupDrawerLayout.f12271.getMeasuredWidth())) {
                i = -popupDrawerLayout.f12271.getMeasuredWidth();
            }
            if (i > 0) {
                return 0;
            }
            return i;
        }
        if (popupPosition == PopupPosition.Right) {
            if (i < popupDrawerLayout.getMeasuredWidth() - popupDrawerLayout.f12271.getMeasuredWidth()) {
                i = popupDrawerLayout.getMeasuredWidth() - popupDrawerLayout.f12271.getMeasuredWidth();
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
        if (this.f12268.m13577(true)) {
            WeakHashMap weakHashMap = AbstractC3103.f6939;
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
        this.f12267 = getChildAt(0);
        this.f12271 = getChildAt(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f12273) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        C8546 c8546 = this.f12268;
        if (c8546.m13577(true) || LayoutStatus.Close == null) {
            return true;
        }
        this.f12263 = motionEvent.getX() < this.f12270;
        this.f12270 = motionEvent.getX();
        this.f12266 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f12265 = motionEvent.getX();
            this.f12264 = motionEvent.getY();
        } else if (action == 1) {
            this.f12270 = 0.0f;
            this.f12266 = 0.0f;
        } else if (action == 2) {
            if (Math.abs(this.f12266 - this.f12264) > Math.abs(this.f12270 - this.f12265)) {
                return false;
            }
        } else if (action == 3) {
        }
        this.f12262 = m8673(this, motionEvent.getX(), motionEvent.getY(), 1);
        boolean zM13586 = c8546.m13586(motionEvent);
        this.f12269 = zM13586;
        return (!this.f12263 || this.f12262) ? !m8673(this, motionEvent.getX(), motionEvent.getY(), 0) ? this.f12269 : super.onInterceptTouchEvent(motionEvent) : zM13586;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f12267.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        if (this.f12272) {
            View view = this.f12271;
            view.layout(view.getLeft(), this.f12271.getTop(), this.f12271.getRight(), this.f12271.getMeasuredHeight());
            return;
        }
        PopupPosition popupPosition = this.f12275;
        PopupPosition popupPosition2 = PopupPosition.Left;
        View view2 = this.f12271;
        if (popupPosition == popupPosition2) {
            view2.layout(-view2.getMeasuredWidth(), 0, 0, getMeasuredHeight());
        } else {
            view2.layout(getMeasuredWidth(), 0, this.f12271.getMeasuredWidth() + getMeasuredWidth(), getMeasuredHeight());
        }
        this.f12272 = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f12273) {
            return super.onTouchEvent(motionEvent);
        }
        C8546 c8546 = this.f12268;
        if (c8546.m13577(true)) {
            return true;
        }
        c8546.m13592(motionEvent);
        return true;
    }

    public void setDrawerPosition(PopupPosition popupPosition) {
        this.f12275 = popupPosition;
    }

    public void setOnCloseListener(InterfaceC4625 interfaceC4625) {
    }
}
