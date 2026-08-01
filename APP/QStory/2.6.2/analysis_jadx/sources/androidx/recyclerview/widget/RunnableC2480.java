package androidx.recyclerview.widget;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.compose.foundation.text.selection.C0920;
import androidx.core.view.AbstractC2270;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2480 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f7426;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Interpolator f7427;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f7428;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f7429;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f7430;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public OverScroller f7431;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f7432;

    public RunnableC2480(RecyclerView recyclerView) {
        this.f7429 = recyclerView;
        InterpolatorC2465 interpolatorC2465 = RecyclerView.f7174;
        this.f7427 = interpolatorC2465;
        this.f7426 = false;
        this.f7428 = false;
        this.f7431 = new OverScroller(recyclerView.getContext(), interpolatorC2465);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.f7429;
        int[] iArr = recyclerView.f7204;
        if (recyclerView.f7192 == null) {
            recyclerView.removeCallbacks(this);
            this.f7431.abortAnimation();
            return;
        }
        this.f7428 = false;
        this.f7426 = true;
        recyclerView.m4718();
        OverScroller overScroller = this.f7431;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f7432;
            int i6 = currY - this.f7430;
            this.f7432 = currX;
            this.f7430 = currY;
            int iM4686 = RecyclerView.m4686(i5, recyclerView.f7250, recyclerView.f7255, recyclerView.getWidth());
            int iM46862 = RecyclerView.m4686(i6, recyclerView.f7254, recyclerView.f7252, recyclerView.getHeight());
            int[] iArr2 = recyclerView.f7204;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.m4713(iM4686, iM46862, 1, iArr2, null)) {
                iM4686 -= iArr[0];
                iM46862 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m4720(iM4686, iM46862);
            }
            if (recyclerView.f7193 != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.m4737(iArr, iM4686, iM46862);
                int i7 = iArr[0];
                int i8 = iArr[1];
                int i9 = iM4686 - i7;
                int i10 = iM46862 - i8;
                C2459 c2459 = recyclerView.f7192.f7585;
                if (c2459 != null && !c2459.f7313 && c2459.f7312) {
                    int iM5015 = recyclerView.f7240.m5015();
                    if (iM5015 == 0) {
                        c2459.m4852();
                    } else if (c2459.f7316 >= iM5015) {
                        c2459.f7316 = iM5015 - 1;
                        c2459.m4851(i7, i8);
                    } else {
                        c2459.m4851(i7, i8);
                    }
                }
                i = i9;
                i3 = i7;
                i2 = i10;
                i4 = i8;
            } else {
                i = iM4686;
                i2 = iM46862;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f7202.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f7204;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m4714(i3, i4, i, i2, null, 1, iArr3);
            int i11 = i - iArr[0];
            int i12 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.m4705(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            C2459 c24592 = recyclerView.f7192.f7585;
            if ((c24592 == null || !c24592.f7313) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.m4703();
                        if (recyclerView.f7250.isFinished()) {
                            recyclerView.f7250.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.m4702();
                        if (recyclerView.f7255.isFinished()) {
                            recyclerView.f7255.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m4701();
                        if (recyclerView.f7254.isFinished()) {
                            recyclerView.f7254.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m4704();
                        if (recyclerView.f7252.isFinished()) {
                            recyclerView.f7252.onAbsorb(currVelocity);
                        }
                    }
                    if (i13 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f7170) {
                    C0920 c0920 = recyclerView.f7241;
                    int[] iArr4 = (int[]) c0920.f2609;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0920.f2610 = 0;
                }
            } else {
                m4886();
                RunnableC2502 runnableC2502 = recyclerView.f7238;
                if (runnableC2502 != null) {
                    runnableC2502.m4955(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC2534.m5033(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        C2459 c24593 = recyclerView.f7192.f7585;
        if (c24593 != null && c24593.f7313) {
            c24593.m4851(0, 0);
        }
        this.f7426 = false;
        if (!this.f7428) {
            recyclerView.setScrollState(0);
            recyclerView.m4733(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            recyclerView.postOnAnimation(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4885(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.f7429;
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
            interpolator = RecyclerView.f7174;
        }
        if (this.f7427 != interpolator) {
            this.f7427 = interpolator;
            this.f7431 = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f7430 = 0;
        this.f7432 = 0;
        recyclerView.setScrollState(2);
        this.f7431.startScroll(0, 0, i, i2, i4);
        m4886();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4886() {
        if (this.f7426) {
            this.f7428 = true;
            return;
        }
        RecyclerView recyclerView = this.f7429;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        recyclerView.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4887(int i, int i2) {
        RecyclerView recyclerView = this.f7429;
        recyclerView.setScrollState(2);
        this.f7430 = 0;
        this.f7432 = 0;
        Interpolator interpolator = this.f7427;
        InterpolatorC2465 interpolatorC2465 = RecyclerView.f7174;
        if (interpolator != interpolatorC2465) {
            this.f7427 = interpolatorC2465;
            this.f7431 = new OverScroller(recyclerView.getContext(), interpolatorC2465);
        }
        this.f7431.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m4886();
    }
}
