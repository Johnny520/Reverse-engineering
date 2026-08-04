package yyds;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛵᲀᛲᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1177 implements Runnable {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f5405;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1213 f5406;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public OverScroller f5407;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f5408;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f5409;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Interpolator f5410;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f5411;

    public RunnableC1177(C1213 c1213) {
        this.f5406 = c1213;
        InterpolatorC2694 interpolatorC2694 = C1213.f5513;
        this.f5410 = interpolatorC2694;
        this.f5408 = false;
        this.f5405 = false;
        this.f5407 = new OverScroller(c1213.getContext(), interpolatorC2694);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        C1213 c1213 = this.f5406;
        int[] iArr = c1213.f5569;
        if (c1213.f5583 == null) {
            c1213.removeCallbacks(this);
            this.f5407.abortAnimation();
            return;
        }
        this.f5405 = false;
        this.f5408 = true;
        c1213.m2433();
        OverScroller overScroller = this.f5407;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f5409;
            int i6 = currY - this.f5411;
            this.f5409 = currX;
            this.f5411 = currY;
            int iM2406 = C1213.m2406(i5, c1213.f5521, c1213.f5580, c1213.getWidth());
            int iM24062 = C1213.m2406(i6, c1213.f5566, c1213.f5556, c1213.getHeight());
            int[] iArr2 = c1213.f5569;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (c1213.m2451(iM2406, iM24062, 1, iArr2, null)) {
                iM2406 -= iArr[0];
                iM24062 -= iArr[1];
            }
            if (c1213.getOverScrollMode() != 2) {
                c1213.m2423(iM2406, iM24062);
            }
            if (c1213.f5537 != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                c1213.m2459(iM2406, iM24062, iArr);
                int i7 = iArr[0];
                int i8 = iArr[1];
                int i9 = iM2406 - i7;
                int i10 = iM24062 - i8;
                C0053 c0053 = c1213.f5583.f12597;
                if (c0053 != null && !c0053.f567 && c0053.f556) {
                    int iM4742 = c1213.f5568.m4742();
                    if (iM4742 == 0) {
                        c0053.m412();
                    } else if (c0053.f557 >= iM4742) {
                        c0053.f557 = iM4742 - 1;
                        c0053.m410(i7, i8);
                    } else {
                        c0053.m410(i7, i8);
                    }
                }
                i = i9;
                i3 = i7;
                i2 = i10;
                i4 = i8;
            } else {
                i = iM2406;
                i2 = iM24062;
                i3 = 0;
                i4 = 0;
            }
            if (!c1213.f5544.isEmpty()) {
                c1213.invalidate();
            }
            int[] iArr3 = c1213.f5569;
            iArr3[0] = 0;
            iArr3[1] = 0;
            c1213.m2449(i3, i4, i, i2, null, 1, iArr3);
            int i11 = i - iArr[0];
            int i12 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                c1213.m2442(i3, i4);
            }
            if (!c1213.awakenScrollBars()) {
                c1213.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            C0053 c00532 = c1213.f5583.f12597;
            if ((c00532 == null || !c00532.f567) && z) {
                if (c1213.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        c1213.m2472();
                        if (c1213.f5521.isFinished()) {
                            c1213.f5521.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        c1213.m2441();
                        if (c1213.f5580.isFinished()) {
                            c1213.f5580.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        c1213.m2424();
                        if (c1213.f5566.isFinished()) {
                            c1213.f5566.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        c1213.m2427();
                        if (c1213.f5556.isFinished()) {
                            c1213.f5556.onAbsorb(currVelocity);
                        }
                    }
                    if (i13 != 0 || currVelocity != 0) {
                        c1213.postInvalidateOnAnimation();
                    }
                }
                if (C1213.f5514) {
                    C2347 c2347 = c1213.f22;
                    int[] iArr4 = c2347.f11527;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c2347.f11529 = 0;
                }
            } else {
                m2372();
                RunnableC0737 runnableC0737 = c1213.f5564;
                if (runnableC0737 != null) {
                    runnableC0737.m1695(c1213, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC1242.m2531(c1213, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        C0053 c00533 = c1213.f5583.f12597;
        if (c00533 != null && c00533.f567) {
            c00533.m410(0, 0);
        }
        this.f5408 = false;
        if (!this.f5405) {
            c1213.setScrollState(0);
            c1213.m2469(1);
        } else {
            c1213.removeCallbacks(this);
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            c1213.postOnAnimation(this);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m2371(int i, int i2) {
        C1213 c1213 = this.f5406;
        c1213.setScrollState(2);
        this.f5411 = 0;
        this.f5409 = 0;
        Interpolator interpolator = this.f5410;
        InterpolatorC2694 interpolatorC2694 = C1213.f5513;
        if (interpolator != interpolatorC2694) {
            this.f5410 = interpolatorC2694;
            this.f5407 = new OverScroller(c1213.getContext(), interpolatorC2694);
        }
        this.f5407.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m2372();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m2372() {
        if (this.f5408) {
            this.f5405 = true;
            return;
        }
        C1213 c1213 = this.f5406;
        c1213.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        c1213.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m2373(int i, int i2, int i3, Interpolator interpolator) {
        C1213 c1213 = this.f5406;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? c1213.getWidth() : c1213.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = C1213.f5513;
        }
        if (this.f5410 != interpolator) {
            this.f5410 = interpolator;
            this.f5407 = new OverScroller(c1213.getContext(), interpolator);
        }
        this.f5411 = 0;
        this.f5409 = 0;
        c1213.setScrollState(2);
        this.f5407.startScroll(0, 0, i, i2, i4);
        m2372();
    }
}
