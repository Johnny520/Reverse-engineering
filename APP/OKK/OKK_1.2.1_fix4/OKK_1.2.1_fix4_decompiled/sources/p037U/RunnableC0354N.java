package p037U;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import p006D.AbstractC0080Q;
import p021L.InterpolatorC0244d;

/* JADX INFO: renamed from: U.N */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0354N implements Runnable {

    /* JADX INFO: renamed from: a */
    public int f703a;

    /* JADX INFO: renamed from: b */
    public int f704b;

    /* JADX INFO: renamed from: c */
    public OverScroller f705c;

    /* JADX INFO: renamed from: d */
    public Interpolator f706d;

    /* JADX INFO: renamed from: e */
    public boolean f707e;

    /* JADX INFO: renamed from: f */
    public boolean f708f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ RecyclerView f709g;

    public RunnableC0354N(RecyclerView recyclerView) {
        this.f709g = recyclerView;
        InterpolatorC0244d interpolatorC0244d = RecyclerView.f1538m0;
        this.f706d = interpolatorC0244d;
        this.f707e = false;
        this.f708f = false;
        this.f705c = new OverScroller(recyclerView.getContext(), interpolatorC0244d);
    }

    /* JADX INFO: renamed from: a */
    public final void m833a() {
        if (this.f707e) {
            this.f708f = true;
            return;
        }
        RecyclerView recyclerView = this.f709g;
        recyclerView.removeCallbacks(this);
        Field field = AbstractC0080Q.f219a;
        recyclerView.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m834b(int i2, int i3, int i4, Interpolator interpolator) {
        int iRound;
        RecyclerView recyclerView = this.f709g;
        if (i4 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i2);
            int iAbs2 = Math.abs(i3);
            boolean z2 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt(0);
            int iSqrt2 = (int) Math.sqrt((i3 * i3) + (i2 * i2));
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i5 = width / 2;
            float f2 = width;
            float f3 = i5;
            float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f2) + 1.0f) * 300.0f);
            }
            i4 = Math.min(iRound, 2000);
        }
        int i6 = i4;
        if (interpolator == null) {
            interpolator = RecyclerView.f1538m0;
        }
        if (this.f706d != interpolator) {
            this.f706d = interpolator;
            this.f705c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f704b = 0;
        this.f703a = 0;
        recyclerView.setScrollState(2);
        this.f705c.startScroll(0, 0, i2, i3, i6);
        m833a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f709g;
        if (recyclerView.f1580j == null) {
            recyclerView.removeCallbacks(this);
            this.f705c.abortAnimation();
            return;
        }
        this.f708f = false;
        this.f707e = true;
        recyclerView.m1315g();
        OverScroller overScroller = this.f705c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i2 = currX - this.f703a;
            int i3 = currY - this.f704b;
            this.f703a = currX;
            this.f704b = currY;
            int[] iArr = recyclerView.f1577h0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zM1318j = recyclerView.m1318j(i2, i3, iArr, null, 1);
            int[] iArr2 = recyclerView.f1577h0;
            if (zM1318j) {
                i2 -= iArr2[0];
                i3 -= iArr2[1];
            }
            int i4 = i2;
            int i5 = i3;
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m1314f(i4, i5);
            }
            if (!recyclerView.f1582k.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1577h0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m1319k(0, 0, i4, i5, null, 1, iArr3);
            int i6 = i4 - iArr2[0];
            int i7 = i5 - iArr2[1];
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
            recyclerView.f1580j.getClass();
            if (z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                    if (i7 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i7 <= 0) {
                        currVelocity = 0;
                    }
                    if (i8 < 0) {
                        recyclerView.m1321m();
                        if (recyclerView.f1540B.isFinished()) {
                            recyclerView.f1540B.onAbsorb(-i8);
                        }
                    } else if (i8 > 0) {
                        recyclerView.m1322n();
                        if (recyclerView.f1542D.isFinished()) {
                            recyclerView.f1542D.onAbsorb(i8);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m1323o();
                        if (recyclerView.f1541C.isFinished()) {
                            recyclerView.f1541C.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m1320l();
                        if (recyclerView.f1543E.isFinished()) {
                            recyclerView.f1543E.onAbsorb(currVelocity);
                        }
                    }
                    if (i8 != 0 || currVelocity != 0) {
                        Field field = AbstractC0080Q.f219a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C0376l c0376l = recyclerView.f1560V;
                c0376l.getClass();
                c0376l.f826c = 0;
            } else {
                m833a();
                RunnableC0378n runnableC0378n = recyclerView.f1559U;
                if (runnableC0378n != null) {
                    runnableC0378n.m958a(recyclerView, 0, 0);
                }
            }
        }
        recyclerView.f1580j.getClass();
        this.f707e = false;
        if (!this.f708f) {
            recyclerView.setScrollState(0);
            recyclerView.m1312K(1);
        } else {
            recyclerView.removeCallbacks(this);
            Field field2 = AbstractC0080Q.f219a;
            recyclerView.postOnAnimation(this);
        }
    }
}
