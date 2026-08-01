package androidx.recyclerview.widget;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.compose.foundation.text.selection.C1758;
import androidx.core.view.AbstractC3103;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3313 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f7772;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Interpolator f7773;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f7774;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f7775;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f7776;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public OverScroller f7777;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f7778;

    public RunnableC3313(RecyclerView recyclerView) {
        this.f7775 = recyclerView;
        InterpolatorC3298 interpolatorC3298 = RecyclerView.f7520;
        this.f7773 = interpolatorC3298;
        this.f7772 = false;
        this.f7774 = false;
        this.f7777 = new OverScroller(recyclerView.getContext(), interpolatorC3298);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.f7775;
        int[] iArr = recyclerView.f7550;
        if (recyclerView.f7538 == null) {
            recyclerView.removeCallbacks(this);
            this.f7777.abortAnimation();
            return;
        }
        this.f7774 = false;
        this.f7772 = true;
        recyclerView.m5288();
        OverScroller overScroller = this.f7777;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f7778;
            int i6 = currY - this.f7776;
            this.f7778 = currX;
            this.f7776 = currY;
            int iM5256 = RecyclerView.m5256(i5, recyclerView.f7596, recyclerView.f7601, recyclerView.getWidth());
            int iM52562 = RecyclerView.m5256(i6, recyclerView.f7600, recyclerView.f7598, recyclerView.getHeight());
            int[] iArr2 = recyclerView.f7550;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.m5283(iM5256, iM52562, 1, iArr2, null)) {
                iM5256 -= iArr[0];
                iM52562 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m5290(iM5256, iM52562);
            }
            if (recyclerView.f7539 != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.m5307(iArr, iM5256, iM52562);
                int i7 = iArr[0];
                int i8 = iArr[1];
                int i9 = iM5256 - i7;
                int i10 = iM52562 - i8;
                C3292 c3292 = recyclerView.f7538.f7931;
                if (c3292 != null && !c3292.f7659 && c3292.f7658) {
                    int iM5585 = recyclerView.f7586.m5585();
                    if (iM5585 == 0) {
                        c3292.m5422();
                    } else if (c3292.f7662 >= iM5585) {
                        c3292.f7662 = iM5585 - 1;
                        c3292.m5421(i7, i8);
                    } else {
                        c3292.m5421(i7, i8);
                    }
                }
                i = i9;
                i3 = i7;
                i2 = i10;
                i4 = i8;
            } else {
                i = iM5256;
                i2 = iM52562;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f7548.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f7550;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m5284(i3, i4, i, i2, null, 1, iArr3);
            int i11 = i - iArr[0];
            int i12 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.m5275(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            C3292 c32922 = recyclerView.f7538.f7931;
            if ((c32922 == null || !c32922.f7659) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.m5273();
                        if (recyclerView.f7596.isFinished()) {
                            recyclerView.f7596.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.m5272();
                        if (recyclerView.f7601.isFinished()) {
                            recyclerView.f7601.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m5271();
                        if (recyclerView.f7600.isFinished()) {
                            recyclerView.f7600.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m5274();
                        if (recyclerView.f7598.isFinished()) {
                            recyclerView.f7598.onAbsorb(currVelocity);
                        }
                    }
                    if (i13 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f7516) {
                    C1758 c1758 = recyclerView.f7587;
                    int[] iArr4 = (int[]) c1758.f2955;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c1758.f2956 = 0;
                }
            } else {
                m5456();
                RunnableC3335 runnableC3335 = recyclerView.f7584;
                if (runnableC3335 != null) {
                    runnableC3335.m5525(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC3367.m5603(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        C3292 c32923 = recyclerView.f7538.f7931;
        if (c32923 != null && c32923.f7659) {
            c32923.m5421(0, 0);
        }
        this.f7772 = false;
        if (!this.f7774) {
            recyclerView.setScrollState(0);
            recyclerView.m5303(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            recyclerView.postOnAnimation(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5455(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.f7775;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.f7520;
        }
        if (this.f7773 != interpolator) {
            this.f7773 = interpolator;
            this.f7777 = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f7776 = 0;
        this.f7778 = 0;
        recyclerView.setScrollState(2);
        this.f7777.startScroll(0, 0, i, i2, i4);
        m5456();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5456() {
        if (this.f7772) {
            this.f7774 = true;
            return;
        }
        RecyclerView recyclerView = this.f7775;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        recyclerView.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5457(int i, int i2) {
        RecyclerView recyclerView = this.f7775;
        recyclerView.setScrollState(2);
        this.f7776 = 0;
        this.f7778 = 0;
        Interpolator interpolator = this.f7773;
        InterpolatorC3298 interpolatorC3298 = RecyclerView.f7520;
        if (interpolator != interpolatorC3298) {
            this.f7773 = interpolatorC3298;
            this.f7777 = new OverScroller(recyclerView.getContext(), interpolatorC3298);
        }
        this.f7777.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m5456();
    }
}
