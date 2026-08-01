package p000;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a00 implements Runnable {

    /* JADX INFO: renamed from: a */
    public int f3a;

    /* JADX INFO: renamed from: b */
    public int f4b;

    /* JADX INFO: renamed from: c */
    public OverScroller f5c;

    /* JADX INFO: renamed from: d */
    public Interpolator f6d;

    /* JADX INFO: renamed from: e */
    public boolean f7e;

    /* JADX INFO: renamed from: f */
    public boolean f8f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ RecyclerView f9g;

    public a00(RecyclerView recyclerView) {
        this.f9g = recyclerView;
        InterpolatorC0168dz interpolatorC0168dz = RecyclerView.f559u0;
        this.f6d = interpolatorC0168dz;
        this.f7e = false;
        this.f8f = false;
        this.f5c = new OverScroller(recyclerView.getContext(), interpolatorC0168dz);
    }

    /* JADX INFO: renamed from: a */
    public final void m3a() {
        if (this.f7e) {
            this.f8f = true;
            return;
        }
        RecyclerView recyclerView = this.f9g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = ja0.f2600a;
        s90.m2321m(recyclerView, this);
    }

    /* JADX INFO: renamed from: b */
    public final void m4b(int i, int i2, int i3, Interpolator interpolator) {
        int iRound;
        RecyclerView recyclerView = this.f9g;
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
            interpolator = RecyclerView.f559u0;
        }
        if (this.f6d != interpolator) {
            this.f6d = interpolator;
            this.f5c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f4b = 0;
        this.f3a = 0;
        recyclerView.setScrollState(2);
        this.f5c.startScroll(0, 0, i, i2, i5);
        m3a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.f9g;
        int[] iArr = recyclerView.f612o0;
        if (recyclerView.f605l == null) {
            recyclerView.removeCallbacks(this);
            this.f5c.abortAnimation();
            return;
        }
        this.f8f = false;
        this.f7e = true;
        recyclerView.m406m();
        OverScroller overScroller = this.f5c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f3a;
            int i6 = currY - this.f4b;
            this.f3a = currX;
            this.f4b = currY;
            int[] iArr2 = recyclerView.f612o0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.m411r(i5, i6, iArr2, null, 1)) {
                i = i5 - iArr[0];
                i2 = i6 - iArr[1];
            } else {
                i = i5;
                i2 = i6;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m405l(i, i2);
            }
            if (recyclerView.f603k != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.m394X(i, i2, iArr);
                i3 = iArr[0];
                i4 = iArr[1];
                i -= i3;
                i2 -= i4;
                C0939yq c0939yq = recyclerView.f605l.f3459e;
                if (c0939yq != null && !c0939yq.f5382d && c0939yq.f5383e) {
                    int iM2745b = recyclerView.f588c0.m2745b();
                    if (iM2745b == 0) {
                        c0939yq.m2737i();
                    } else if (c0939yq.f5379a >= iM2745b) {
                        c0939yq.f5379a = iM2745b - 1;
                        c0939yq.m2736g(i3, i4);
                    } else {
                        c0939yq.m2736g(i3, i4);
                    }
                }
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f607m.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f612o0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m412s(i3, i4, i, i2, null, 1, iArr3);
            int i7 = i - iArr[0];
            int i8 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.m413t(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i7 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i8 != 0));
            C0939yq c0939yq2 = recyclerView.f605l.f3459e;
            if ((c0939yq2 == null || !c0939yq2.f5382d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i9 = i7 < 0 ? -currVelocity : i7 > 0 ? currVelocity : 0;
                    if (i8 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i8 <= 0) {
                        currVelocity = 0;
                    }
                    if (i9 < 0) {
                        recyclerView.m415v();
                        if (recyclerView.f563D.isFinished()) {
                            recyclerView.f563D.onAbsorb(-i9);
                        }
                    } else if (i9 > 0) {
                        recyclerView.m416w();
                        if (recyclerView.f565F.isFinished()) {
                            recyclerView.f565F.onAbsorb(i9);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m417x();
                        if (recyclerView.f564E.isFinished()) {
                            recyclerView.f564E.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m414u();
                        if (recyclerView.f566G.isFinished()) {
                            recyclerView.f566G.onAbsorb(currVelocity);
                        }
                    }
                    if (i9 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = ja0.f2600a;
                        s90.m2319k(recyclerView);
                    }
                }
                C0074bn c0074bn = recyclerView.f586b0;
                int[] iArr4 = c0074bn.f815c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c0074bn.f816d = 0;
            } else {
                m3a();
                RunnableC0157dn runnableC0157dn = recyclerView.f584a0;
                if (runnableC0157dn != null) {
                    runnableC0157dn.m946a(recyclerView, i3, i4);
                }
            }
        }
        C0939yq c0939yq3 = recyclerView.f605l.f3459e;
        if (c0939yq3 != null && c0939yq3.f5382d) {
            c0939yq3.m2736g(0, 0);
        }
        this.f7e = false;
        if (!this.f8f) {
            recyclerView.setScrollState(0);
            recyclerView.m399c0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = ja0.f2600a;
            s90.m2321m(recyclerView, this);
        }
    }
}
