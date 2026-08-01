package p000;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h00 implements Runnable {

    /* JADX INFO: renamed from: a */
    public int f2080a;

    /* JADX INFO: renamed from: b */
    public int f2081b;

    /* JADX INFO: renamed from: c */
    public OverScroller f2082c;

    /* JADX INFO: renamed from: d */
    public Interpolator f2083d;

    /* JADX INFO: renamed from: e */
    public boolean f2084e;

    /* JADX INFO: renamed from: f */
    public boolean f2085f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ RecyclerView f2086g;

    public h00(RecyclerView recyclerView) {
        this.f2086g = recyclerView;
        InterpolatorC0429kz interpolatorC0429kz = RecyclerView.f522u0;
        this.f2083d = interpolatorC0429kz;
        this.f2084e = false;
        this.f2085f = false;
        this.f2082c = new OverScroller(recyclerView.getContext(), interpolatorC0429kz);
    }

    /* JADX INFO: renamed from: a */
    public final void m1349a() {
        if (this.f2084e) {
            this.f2085f = true;
            return;
        }
        RecyclerView recyclerView = this.f2086g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = oa0.f3426a;
        x90.m2665m(recyclerView, this);
    }

    /* JADX INFO: renamed from: b */
    public final void m1350b(int i, int i2, int i3, Interpolator interpolator) {
        int iRound;
        RecyclerView recyclerView = this.f2086g;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt(0);
            int iSqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i4 = width / 2;
            float f = width;
            float f2 = i4;
            float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f) + 1.0f) * 300.0f);
            }
            i3 = Math.min(iRound, 2000);
        }
        int i5 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.f522u0;
        }
        if (this.f2083d != interpolator) {
            this.f2083d = interpolator;
            this.f2082c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2081b = 0;
        this.f2080a = 0;
        recyclerView.setScrollState(2);
        this.f2082c.startScroll(0, 0, i, i2, i5);
        m1349a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.f2086g;
        int[] iArr = recyclerView.f575o0;
        if (recyclerView.f568l == null) {
            recyclerView.removeCallbacks(this);
            this.f2082c.abortAnimation();
            return;
        }
        this.f2085f = false;
        this.f2084e = true;
        recyclerView.m391m();
        OverScroller overScroller = this.f2082c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f2080a;
            int i6 = currY - this.f2081b;
            this.f2080a = currX;
            this.f2081b = currY;
            int[] iArr2 = recyclerView.f575o0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.m396r(i5, i6, iArr2, null, 1)) {
                i = i5 - iArr[0];
                i2 = i6 - iArr[1];
            } else {
                i = i5;
                i2 = i6;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m390l(i, i2);
            }
            if (recyclerView.f566k != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.m379X(i, i2, iArr);
                i3 = iArr[0];
                i4 = iArr[1];
                i -= i3;
                i2 -= i4;
                C0124cr c0124cr = recyclerView.f568l.f4859e;
                if (c0124cr != null && !c0124cr.f1239d && c0124cr.f1240e) {
                    int iM1068b = recyclerView.f551c0.m1068b();
                    if (iM1068b == 0) {
                        c0124cr.m778i();
                    } else if (c0124cr.f1236a >= iM1068b) {
                        c0124cr.f1236a = iM1068b - 1;
                        c0124cr.m776g(i3, i4);
                    } else {
                        c0124cr.m776g(i3, i4);
                    }
                }
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f570m.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f575o0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m397s(i3, i4, i, i2, null, 1, iArr3);
            int i7 = i - iArr[0];
            int i8 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.m398t(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i7 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i8 != 0));
            C0124cr c0124cr2 = recyclerView.f568l.f4859e;
            if ((c0124cr2 == null || !c0124cr2.f1239d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i9 = i7 < 0 ? -currVelocity : i7 > 0 ? currVelocity : 0;
                    if (i8 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i8 <= 0) {
                        currVelocity = 0;
                    }
                    if (i9 < 0) {
                        recyclerView.m400v();
                        if (recyclerView.f526D.isFinished()) {
                            recyclerView.f526D.onAbsorb(-i9);
                        }
                    } else if (i9 > 0) {
                        recyclerView.m401w();
                        if (recyclerView.f528F.isFinished()) {
                            recyclerView.f528F.onAbsorb(i9);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m402x();
                        if (recyclerView.f527E.isFinished()) {
                            recyclerView.f527E.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m399u();
                        if (recyclerView.f529G.isFinished()) {
                            recyclerView.f529G.onAbsorb(currVelocity);
                        }
                    }
                    if (i9 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = oa0.f3426a;
                        x90.m2663k(recyclerView);
                    }
                }
                C0157dn c0157dn = recyclerView.f549b0;
                int[] iArr4 = c0157dn.f1398c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c0157dn.f1399d = 0;
            } else {
                m1349a();
                RunnableC0230fn runnableC0230fn = recyclerView.f547a0;
                if (runnableC0230fn != null) {
                    runnableC0230fn.m1105a(recyclerView, i3, i4);
                }
            }
        }
        C0124cr c0124cr3 = recyclerView.f568l.f4859e;
        if (c0124cr3 != null && c0124cr3.f1239d) {
            c0124cr3.m776g(0, 0);
        }
        this.f2084e = false;
        if (!this.f2085f) {
            recyclerView.setScrollState(0);
            recyclerView.m384c0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = oa0.f3426a;
            x90.m2665m(recyclerView, this);
        }
    }
}
