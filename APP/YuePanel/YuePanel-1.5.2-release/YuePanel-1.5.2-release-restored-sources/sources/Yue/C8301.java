package Yue;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥۢۤۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8301 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final String f24728 = "ViewDragHelper";

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f24729 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f24730 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f24731 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f24732 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f24733 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f24734 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f24735 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f24736 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f24737 = 15;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f24738 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f24739 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f24740 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f24741 = 20;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f24742 = 256;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f24743 = 600;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final Interpolator f24744 = new InterpolatorC1475();

    /* JADX INFO: renamed from: ۥ */
    public int f3390;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f3391;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float[] f24746;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float[] f24747;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float[] f24748;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float[] f24749;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int[] f24750;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int[] f24751;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int[] f24752;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int f24753;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public VelocityTracker f24754;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public float f24755;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public float f24756;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int f24757;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final int f24758;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int f24759;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public OverScroller f24760;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final AbstractC8302 f24761;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public View f24762;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f24763;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final ViewGroup f24764;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f24745 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final Runnable f24765 = new RunnableC1476();

    /* JADX INFO: renamed from: Yue.ۥۢۤۥ۠$ۥ */
    public class InterpolatorC1475 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۥ۠$ۥ۟ */
    public class RunnableC1476 implements Runnable {
        public RunnableC1476() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8301.this.m27645(0);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۥ۠$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractC8302 {
        public int clampViewPositionHorizontal(@InterfaceC6391 View view, int i, int i2) {
            return 0;
        }

        public int clampViewPositionVertical(@InterfaceC6391 View view, int i, int i2) {
            return 0;
        }

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public int getViewHorizontalDragRange(@InterfaceC6391 View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@InterfaceC6391 View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(@InterfaceC6391 View view, int i) {
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onViewPositionChanged(@InterfaceC6391 View view, int i, int i2, @InterfaceC6844 int i3, @InterfaceC6844 int i4) {
        }

        public void onViewReleased(@InterfaceC6391 View view, float f, float f2) {
        }

        public abstract boolean tryCaptureView(@InterfaceC6391 View view, int i);
    }

    public C8301(@InterfaceC6391 Context context, @InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 AbstractC8302 abstractC8302) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC8302 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f24764 = viewGroup;
        this.f24761 = abstractC8302;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f24758 = i;
        this.f24757 = i;
        this.f3391 = viewConfiguration.getScaledTouchSlop();
        this.f24755 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f24756 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f24760 = new OverScroller(context, f24744);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static C8301 m27604(@InterfaceC6391 ViewGroup viewGroup, float f, @InterfaceC6391 AbstractC8302 abstractC8302) {
        C8301 c8301M27605 = m27605(viewGroup, abstractC8302);
        c8301M27605.f3391 = (int) (c8301M27605.f3391 * (1.0f / f));
        return c8301M27605;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static C8301 m27605(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 AbstractC8302 abstractC8302) {
        return new C8301(viewGroup.getContext(), viewGroup, abstractC8302);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4279() {
        m27606();
        if (this.f3390 == 2) {
            int currX = this.f24760.getCurrX();
            int currY = this.f24760.getCurrY();
            this.f24760.abortAnimation();
            int currX2 = this.f24760.getCurrX();
            int currY2 = this.f24760.getCurrY();
            this.f24761.onViewPositionChanged(this.f24762, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m27645(0);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m4280(@InterfaceC6391 View view, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && m4280(childAt, true, i, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && (view.canScrollHorizontally(-i) || view.canScrollVertically(-i2));
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m27606() {
        this.f24745 = -1;
        m27614();
        VelocityTracker velocityTracker = this.f24754;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f24754 = null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m27607(@InterfaceC6391 View view, int i) {
        if (view.getParent() == this.f24764) {
            this.f24762 = view;
            this.f24745 = i;
            this.f24761.onViewCaptured(view, i);
            m27645(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f24764 + ")");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m27608(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f24750[i] & i2) != i2 || (this.f24759 & i2) == 0 || (this.f24752[i] & i2) == i2 || (this.f24751[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f3391;
        if (fAbs <= i3 && fAbs2 <= i3) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f24761.onEdgeLock(i2)) {
            return (this.f24751[i] & i2) == 0 && fAbs > ((float) this.f3391);
        }
        int[] iArr = this.f24752;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m27609(int i) {
        int length = this.f24746.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m27610(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m27610(int i, int i2) {
        if (!m27637(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f24748[i2] - this.f24746[i2];
        float f2 = this.f24749[i2] - this.f24747[i2];
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f3391) : z2 && Math.abs(f2) > ((float) this.f3391);
        }
        float f3 = (f * f) + (f2 * f2);
        int i3 = this.f3391;
        return f3 > ((float) (i3 * i3));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m27611(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f24761.getViewHorizontalDragRange(view) > 0;
        boolean z2 = this.f24761.getViewVerticalDragRange(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f3391) : z2 && Math.abs(f2) > ((float) this.f3391);
        }
        float f3 = (f * f) + (f2 * f2);
        int i = this.f3391;
        return f3 > ((float) (i * i));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final float m27612(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        return fAbs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final int m27613(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        return iAbs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m27614() {
        float[] fArr = this.f24746;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f24747, 0.0f);
        Arrays.fill(this.f24748, 0.0f);
        Arrays.fill(this.f24749, 0.0f);
        Arrays.fill(this.f24750, 0);
        Arrays.fill(this.f24751, 0);
        Arrays.fill(this.f24752, 0);
        this.f24753 = 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m27615(int i) {
        if (this.f24746 == null || !m27637(i)) {
            return;
        }
        this.f24746[i] = 0.0f;
        this.f24747[i] = 0.0f;
        this.f24748[i] = 0.0f;
        this.f24749[i] = 0.0f;
        this.f24750[i] = 0;
        this.f24751[i] = 0;
        this.f24752[i] = 0;
        this.f24753 = (~(1 << i)) & this.f24753;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int m27616(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f24764.getWidth();
        float f = width / 2;
        float fM27620 = f + (m27620(Math.min(1.0f, Math.abs(i) / width)) * f);
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fM27620 / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final int m27617(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int iM27613 = m27613(i3, (int) this.f24756, (int) this.f24755);
        int iM276132 = m27613(i4, (int) this.f24756, (int) this.f24755);
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i2);
        int iAbs3 = Math.abs(iM27613);
        int iAbs4 = Math.abs(iM276132);
        int i5 = iAbs3 + iAbs4;
        int i6 = iAbs + iAbs2;
        if (iM27613 != 0) {
            f = iAbs3;
            f2 = i5;
        } else {
            f = iAbs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (iM276132 != 0) {
            f3 = iAbs4;
            f4 = i5;
        } else {
            f3 = iAbs2;
            f4 = i6;
        }
        return (int) ((m27616(i, iM27613, this.f24761.getViewHorizontalDragRange(view)) * f5) + (m27616(i2, iM276132, this.f24761.getViewVerticalDragRange(view)) * (f3 / f4)));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m27618(boolean z) {
        if (this.f3390 == 2) {
            boolean zComputeScrollOffset = this.f24760.computeScrollOffset();
            int currX = this.f24760.getCurrX();
            int currY = this.f24760.getCurrY();
            int left = currX - this.f24762.getLeft();
            int top = currY - this.f24762.getTop();
            if (left != 0) {
                C8273.m27414(this.f24762, left);
            }
            if (top != 0) {
                C8273.m27415(this.f24762, top);
            }
            if (left != 0 || top != 0) {
                this.f24761.onViewPositionChanged(this.f24762, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f24760.getFinalX() && currY == this.f24760.getFinalY()) {
                this.f24760.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.f24764.post(this.f24765);
                } else {
                    m27645(0);
                }
            }
        }
        return this.f3390 == 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m27619(float f, float f2) {
        this.f24763 = true;
        this.f24761.onViewReleased(this.f24762, f, f2);
        this.f24763 = false;
        if (this.f3390 == 1) {
            m27645(0);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final float m27620(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m27621(int i, int i2, int i3, int i4) {
        int left = this.f24762.getLeft();
        int top = this.f24762.getTop();
        if (i3 != 0) {
            i = this.f24761.clampViewPositionHorizontal(this.f24762, i, i3);
            C8273.m27414(this.f24762, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f24761.clampViewPositionVertical(this.f24762, i2, i4);
            C8273.m27415(this.f24762, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f24761.onViewPositionChanged(this.f24762, i5, i6, i5 - left, i6 - top);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m27622(int i) {
        float[] fArr = this.f24746;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f24747;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f24748;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f24749;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f24750;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f24751;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f24752;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f24746 = fArr2;
            this.f24747 = fArr3;
            this.f24748 = fArr4;
            this.f24749 = fArr5;
            this.f24750 = iArr;
            this.f24751 = iArr2;
            this.f24752 = iArr3;
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public View m27623(int i, int i2) {
        for (int childCount = this.f24764.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f24764.getChildAt(this.f24761.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m27624(int i, int i2, int i3, int i4) {
        if (!this.f24763) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.f24760.fling(this.f24762.getLeft(), this.f24762.getTop(), (int) this.f24754.getXVelocity(this.f24745), (int) this.f24754.getYVelocity(this.f24745), i, i3, i2, i4);
        m27645(2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean m27625(int i, int i2, int i3, int i4) {
        int left = this.f24762.getLeft();
        int top = this.f24762.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f24760.abortAnimation();
            m27645(0);
            return false;
        }
        this.f24760.startScroll(left, top, i5, i6, m27617(this.f24762, i5, i6, i3, i4));
        m27645(2);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int m27626() {
        return this.f24745;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public View m27627() {
        return this.f24762;
    }

    @InterfaceC6844
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int m27628() {
        return this.f24758;
    }

    @InterfaceC6844
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int m27629() {
        return this.f24757;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final int m27630(int i, int i2) {
        int i3 = i < this.f24764.getLeft() + this.f24757 ? 1 : 0;
        if (i2 < this.f24764.getTop() + this.f24757) {
            i3 |= 4;
        }
        if (i > this.f24764.getRight() - this.f24757) {
            i3 |= 2;
        }
        return i2 > this.f24764.getBottom() - this.f24757 ? i3 | 8 : i3;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public float m27631() {
        return this.f24756;
    }

    @InterfaceC6844
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int m27632() {
        return this.f3391;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public int m27633() {
        return this.f3390;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean m27634(int i, int i2) {
        return m27639(this.f24762, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean m27635(int i) {
        int length = this.f24750.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m27636(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean m27636(int i, int i2) {
        return m27637(i2) && (i & this.f24750[i2]) != 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean m27637(int i) {
        return ((1 << i) & this.f24753) != 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final boolean m27638(int i) {
        if (m27637(i)) {
            return true;
        }
        Log.e(f24728, "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public boolean m27639(@InterfaceC6490 View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public void m27640(@InterfaceC6391 MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m27606();
        }
        if (this.f24754 == null) {
            this.f24754 = VelocityTracker.obtain();
        }
        this.f24754.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM27623 = m27623((int) x, (int) y);
            m27643(x, y, pointerId);
            m27652(viewM27623, pointerId);
            int i3 = this.f24750[pointerId];
            int i4 = this.f24759;
            if ((i3 & i4) != 0) {
                this.f24761.onEdgeTouched(i3 & i4, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f3390 == 1) {
                m27641();
            }
            m27606();
            return;
        }
        if (actionMasked == 2) {
            if (this.f3390 == 1) {
                if (m27638(this.f24745)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f24745);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f24748;
                    int i5 = this.f24745;
                    int i6 = (int) (x2 - fArr[i5]);
                    int i7 = (int) (y2 - this.f24749[i5]);
                    m27621(this.f24762.getLeft() + i6, this.f24762.getTop() + i7, i6, i7);
                    m27644(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i2 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i2);
                if (m27638(pointerId2)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f24746[pointerId2];
                    float f2 = y3 - this.f24747[pointerId2];
                    m27642(f, f2, pointerId2);
                    if (this.f3390 != 1) {
                        View viewM276232 = m27623((int) x3, (int) y3);
                        if (m27611(viewM276232, f, f2) && m27652(viewM276232, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m27644(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f3390 == 1) {
                m27619(0.0f, 0.0f);
            }
            m27606();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            m27643(x4, y4, pointerId3);
            if (this.f3390 != 0) {
                if (m27634((int) x4, (int) y4)) {
                    m27652(this.f24762, pointerId3);
                    return;
                }
                return;
            } else {
                m27652(m27623((int) x4, (int) y4), pointerId3);
                int i8 = this.f24750[pointerId3];
                int i9 = this.f24759;
                if ((i8 & i9) != 0) {
                    this.f24761.onEdgeTouched(i8 & i9, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f3390 == 1 && pointerId4 == this.f24745) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.f24745) {
                    View viewM276233 = m27623((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view = this.f24762;
                    if (viewM276233 == view && m27652(view, pointerId5)) {
                        i = this.f24745;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                m27641();
            }
        }
        m27615(pointerId4);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final void m27641() {
        this.f24754.computeCurrentVelocity(1000, this.f24755);
        m27619(m27612(this.f24754.getXVelocity(this.f24745), this.f24756, this.f24755), m27612(this.f24754.getYVelocity(this.f24745), this.f24756, this.f24755));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [Yue.ۥۢۤۥ۠$ۥ۟۟] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final void m27642(float f, float f2, int i) {
        boolean zM27608 = m27608(f, f2, i, 1);
        ?? r0 = zM27608;
        if (m27608(f2, f, i, 4)) {
            r0 = (zM27608 ? 1 : 0) | 4;
        }
        ?? r02 = r0;
        if (m27608(f, f2, i, 2)) {
            r02 = (r0 == true ? 1 : 0) | 2;
        }
        ?? r03 = r02;
        if (m27608(f2, f, i, 8)) {
            r03 = (r02 == true ? 1 : 0) | 8;
        }
        if (r03 != 0) {
            int[] iArr = this.f24751;
            iArr[i] = iArr[i] | r03;
            this.f24761.onEdgeDragStarted(r03, i);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final void m27643(float f, float f2, int i) {
        m27622(i);
        float[] fArr = this.f24746;
        this.f24748[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f24747;
        this.f24749[i] = f2;
        fArr2[i] = f2;
        this.f24750[i] = m27630((int) f, (int) f2);
        this.f24753 |= 1 << i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final void m27644(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m27638(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f24748[pointerId] = x;
                this.f24749[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public void m27645(int i) {
        this.f24764.removeCallbacks(this.f24765);
        if (this.f3390 != i) {
            this.f3390 = i;
            this.f24761.onViewDragStateChanged(i);
            if (this.f3390 == 0) {
                this.f24762 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m27646(@InterfaceC6844 @InterfaceC5459(from = 0) int i) {
        this.f24757 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public void m27647(int i) {
        this.f24759 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m27648(float f) {
        this.f24756 = f;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public boolean m27649(int i, int i2) {
        if (this.f24763) {
            return m27625(i, i2, (int) this.f24754.getXVelocity(this.f24745), (int) this.f24754.getYVelocity(this.f24745));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m27650(@InterfaceC6391 MotionEvent motionEvent) {
        boolean z;
        View viewM27623;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m27606();
        }
        if (this.f24754 == null) {
            this.f24754 = VelocityTracker.obtain();
        }
        this.f24754.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            z = false;
            int pointerId = motionEvent.getPointerId(0);
            m27643(x, y, pointerId);
            View viewM276232 = m27623((int) x, (int) y);
            if (viewM276232 == this.f24762 && this.f3390 == 2) {
                m27652(viewM276232, pointerId);
            }
            int i = this.f24750[pointerId];
            int i2 = this.f24759;
            if ((i & i2) != 0) {
                this.f24761.onEdgeTouched(i & i2, pointerId);
            }
        } else if (actionMasked == 1) {
            m27606();
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x2 = motionEvent.getX(actionIndex);
                        float y2 = motionEvent.getY(actionIndex);
                        m27643(x2, y2, pointerId2);
                        int i3 = this.f3390;
                        if (i3 == 0) {
                            int i4 = this.f24750[pointerId2];
                            int i5 = this.f24759;
                            if ((i4 & i5) != 0) {
                                this.f24761.onEdgeTouched(i4 & i5, pointerId2);
                            }
                        } else if (i3 == 2 && (viewM27623 = m27623((int) x2, (int) y2)) == this.f24762) {
                            m27652(viewM27623, pointerId2);
                        }
                    } else if (actionMasked == 6) {
                        m27615(motionEvent.getPointerId(actionIndex));
                    }
                }
            } else if (this.f24746 != null && this.f24747 != null) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i6 = 0; i6 < pointerCount; i6++) {
                    int pointerId3 = motionEvent.getPointerId(i6);
                    if (m27638(pointerId3)) {
                        float x3 = motionEvent.getX(i6);
                        float y3 = motionEvent.getY(i6);
                        float f = x3 - this.f24746[pointerId3];
                        float f2 = y3 - this.f24747[pointerId3];
                        View viewM276233 = m27623((int) x3, (int) y3);
                        boolean z2 = viewM276233 != null && m27611(viewM276233, f, f2);
                        if (z2) {
                            int left = viewM276233.getLeft();
                            int i7 = (int) f;
                            int iClampViewPositionHorizontal = this.f24761.clampViewPositionHorizontal(viewM276233, left + i7, i7);
                            int top = viewM276233.getTop();
                            int i8 = (int) f2;
                            int iClampViewPositionVertical = this.f24761.clampViewPositionVertical(viewM276233, top + i8, i8);
                            int viewHorizontalDragRange = this.f24761.getViewHorizontalDragRange(viewM276233);
                            int viewVerticalDragRange = this.f24761.getViewVerticalDragRange(viewM276233);
                            if ((viewHorizontalDragRange == 0 || (viewHorizontalDragRange > 0 && iClampViewPositionHorizontal == left)) && (viewVerticalDragRange == 0 || (viewVerticalDragRange > 0 && iClampViewPositionVertical == top))) {
                                break;
                            }
                            m27642(f, f2, pointerId3);
                            if (this.f3390 == 1 || (z2 && m27652(viewM276233, pointerId3))) {
                                break;
                            }
                        }
                    }
                }
                m27644(motionEvent);
            }
            z = false;
        }
        if (this.f3390 == 1) {
            return true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean m27651(@InterfaceC6391 View view, int i, int i2) {
        this.f24762 = view;
        this.f24745 = -1;
        boolean zM27625 = m27625(i, i2, 0, 0);
        if (!zM27625 && this.f3390 == 0 && this.f24762 != null) {
            this.f24762 = null;
        }
        return zM27625;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean m27652(View view, int i) {
        if (view == this.f24762 && this.f24745 == i) {
            return true;
        }
        if (view == null || !this.f24761.tryCaptureView(view, i)) {
            return false;
        }
        this.f24745 = i;
        m27607(view, i);
        return true;
    }
}
