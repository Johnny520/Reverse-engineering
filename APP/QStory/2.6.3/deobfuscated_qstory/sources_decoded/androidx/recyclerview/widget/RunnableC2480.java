package androidx.recyclerview.widget;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.compose.foundation.text.selection.C0920;
import androidx.core.view.AbstractC2270;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2480 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f7427;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Interpolator f7428;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f7429;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f7430;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f7431;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public OverScroller f7432;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f7433;

    public RunnableC2480(RecyclerView recyclerView) {
        this.f7430 = recyclerView;
        InterpolatorC2465 interpolatorC2465 = RecyclerView.f7175;
        this.f7428 = interpolatorC2465;
        this.f7427 = false;
        this.f7429 = false;
        this.f7432 = new OverScroller(recyclerView.getContext(), interpolatorC2465);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.f7430;
        int[] iArr = recyclerView.f7205;
        if (recyclerView.f7193 == null) {
            recyclerView.removeCallbacks(this);
            this.f7432.abortAnimation();
            return;
        }
        this.f7429 = false;
        this.f7427 = true;
        recyclerView.m4728();
        OverScroller overScroller = this.f7432;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f7433;
            int i6 = currY - this.f7431;
            this.f7433 = currX;
            this.f7431 = currY;
            int iM4696 = RecyclerView.m4696(i5, recyclerView.f7251, recyclerView.f7256, recyclerView.getWidth());
            int iM46962 = RecyclerView.m4696(i6, recyclerView.f7255, recyclerView.f7253, recyclerView.getHeight());
            int[] iArr2 = recyclerView.f7205;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.m4723(iM4696, iM46962, 1, iArr2, null)) {
                iM4696 -= iArr[0];
                iM46962 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m4730(iM4696, iM46962);
            }
            if (recyclerView.f7194 != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.m4747(iArr, iM4696, iM46962);
                int i7 = iArr[0];
                int i8 = iArr[1];
                int i9 = iM4696 - i7;
                int i10 = iM46962 - i8;
                C2459 c2459 = recyclerView.f7193.f7586;
                if (c2459 != null && !c2459.f7314 && c2459.f7313) {
                    int iM5025 = recyclerView.f7241.m5025();
                    if (iM5025 == 0) {
                        c2459.m4862();
                    } else if (c2459.f7317 >= iM5025) {
                        c2459.f7317 = iM5025 - 1;
                        c2459.m4861(i7, i8);
                    } else {
                        c2459.m4861(i7, i8);
                    }
                }
                i = i9;
                i3 = i7;
                i2 = i10;
                i4 = i8;
            } else {
                i = iM4696;
                i2 = iM46962;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f7203.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f7205;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m4724(i3, i4, i, i2, null, 1, iArr3);
            int i11 = i - iArr[0];
            int i12 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.m4715(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            C2459 c24592 = recyclerView.f7193.f7586;
            if ((c24592 == null || !c24592.f7314) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.m4713();
                        if (recyclerView.f7251.isFinished()) {
                            recyclerView.f7251.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.m4712();
                        if (recyclerView.f7256.isFinished()) {
                            recyclerView.f7256.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m4711();
                        if (recyclerView.f7255.isFinished()) {
                            recyclerView.f7255.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m4714();
                        if (recyclerView.f7253.isFinished()) {
                            recyclerView.f7253.onAbsorb(currVelocity);
                        }
                    }
                    if (i13 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f7171) {
                    C0920 c0920 = recyclerView.f7242;
                    int[] iArr4 = (int[]) c0920.f2610;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0920.f2611 = 0;
                }
            } else {
                m4896();
                RunnableC2502 runnableC2502 = recyclerView.f7239;
                if (runnableC2502 != null) {
                    runnableC2502.m4965(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC2534.m5043(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        C2459 c24593 = recyclerView.f7193.f7586;
        if (c24593 != null && c24593.f7314) {
            c24593.m4861(0, 0);
        }
        this.f7427 = false;
        if (!this.f7429) {
            recyclerView.setScrollState(0);
            recyclerView.m4743(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            recyclerView.postOnAnimation(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4895(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.f7430;
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
            interpolator = RecyclerView.f7175;
        }
        if (this.f7428 != interpolator) {
            this.f7428 = interpolator;
            this.f7432 = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f7431 = 0;
        this.f7433 = 0;
        recyclerView.setScrollState(2);
        this.f7432.startScroll(0, 0, i, i2, i4);
        m4896();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4896() {
        if (this.f7427) {
            this.f7429 = true;
            return;
        }
        RecyclerView recyclerView = this.f7430;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        recyclerView.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4897(int i, int i2) {
        RecyclerView recyclerView = this.f7430;
        recyclerView.setScrollState(2);
        this.f7431 = 0;
        this.f7433 = 0;
        Interpolator interpolator = this.f7428;
        InterpolatorC2465 interpolatorC2465 = RecyclerView.f7175;
        if (interpolator != interpolatorC2465) {
            this.f7428 = interpolatorC2465;
            this.f7432 = new OverScroller(recyclerView.getContext(), interpolatorC2465);
        }
        this.f7432.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m4896();
    }
}
