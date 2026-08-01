package p000;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ra0 {

    /* JADX INFO: renamed from: v */
    public static final InterpolatorC0429kz f4089v = new InterpolatorC0429kz(1);

    /* JADX INFO: renamed from: a */
    public int f4090a;

    /* JADX INFO: renamed from: b */
    public final int f4091b;

    /* JADX INFO: renamed from: d */
    public float[] f4093d;

    /* JADX INFO: renamed from: e */
    public float[] f4094e;

    /* JADX INFO: renamed from: f */
    public float[] f4095f;

    /* JADX INFO: renamed from: g */
    public float[] f4096g;

    /* JADX INFO: renamed from: h */
    public int[] f4097h;

    /* JADX INFO: renamed from: i */
    public int[] f4098i;

    /* JADX INFO: renamed from: j */
    public int[] f4099j;

    /* JADX INFO: renamed from: k */
    public int f4100k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f4101l;

    /* JADX INFO: renamed from: m */
    public final float f4102m;

    /* JADX INFO: renamed from: n */
    public final float f4103n;

    /* JADX INFO: renamed from: o */
    public final int f4104o;

    /* JADX INFO: renamed from: p */
    public final OverScroller f4105p;

    /* JADX INFO: renamed from: q */
    public final AbstractC0498mu f4106q;

    /* JADX INFO: renamed from: r */
    public View f4107r;

    /* JADX INFO: renamed from: s */
    public boolean f4108s;

    /* JADX INFO: renamed from: t */
    public final CoordinatorLayout f4109t;

    /* JADX INFO: renamed from: c */
    public int f4092c = -1;

    /* JADX INFO: renamed from: u */
    public final RunnableC0325i7 f4110u = new RunnableC0325i7(12, this);

    public ra0(Context context, CoordinatorLayout coordinatorLayout, AbstractC0498mu abstractC0498mu) {
        if (abstractC0498mu == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f4109t = coordinatorLayout;
        this.f4106q = abstractC0498mu;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4104o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f4091b = viewConfiguration.getScaledTouchSlop();
        this.f4102m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4103n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4105p = new OverScroller(context, f4089v);
    }

    /* JADX INFO: renamed from: a */
    public final void m2266a() {
        this.f4092c = -1;
        float[] fArr = this.f4093d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f4094e, 0.0f);
            Arrays.fill(this.f4095f, 0.0f);
            Arrays.fill(this.f4096g, 0.0f);
            Arrays.fill(this.f4097h, 0);
            Arrays.fill(this.f4098i, 0);
            Arrays.fill(this.f4099j, 0);
            this.f4100k = 0;
        }
        VelocityTracker velocityTracker = this.f4101l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4101l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2267b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f4109t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f4107r = view;
        this.f4092c = i;
        this.f4106q.mo1903y(view, i);
        m2279n(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2268c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            mu r1 = r3.f4106q
            int r4 = r1.mo593q(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.mo594r()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.f4091b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f4091b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f4091b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ra0.m2268c(android.view.View, float, float):boolean");
    }

    /* JADX INFO: renamed from: d */
    public final void m2269d(int i) {
        float[] fArr = this.f4093d;
        if (fArr != null) {
            int i2 = this.f4100k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f4094e[i] = 0.0f;
                this.f4095f[i] = 0.0f;
                this.f4096g[i] = 0.0f;
                this.f4097h[i] = 0;
                this.f4098i[i] = 0;
                this.f4099j[i] = 0;
                this.f4100k = (~i3) & i2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m2270e(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f4109t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2271f() {
        if (this.f4090a == 2) {
            OverScroller overScroller = this.f4105p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f4107r.getLeft();
            int top = currY - this.f4107r.getTop();
            if (left != 0) {
                View view = this.f4107r;
                WeakHashMap weakHashMap = oa0.f3426a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f4107r;
                WeakHashMap weakHashMap2 = oa0.f3426a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f4106q.mo588A(this.f4107r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f4109t.post(this.f4110u);
            }
        }
        return this.f4090a == 2;
    }

    /* JADX INFO: renamed from: g */
    public final View m2272g(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.f4109t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f4106q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2273h(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f4107r.getLeft();
        int top = this.f4107r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f4105p;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m2279n(0);
            return false;
        }
        View view = this.f4107r;
        int i7 = (int) this.f4103n;
        int i8 = (int) this.f4102m;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i7) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i9 = iAbs5 + iAbs6;
        int i10 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i9;
        } else {
            f = iAbs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i9;
        } else {
            f3 = iAbs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        AbstractC0498mu abstractC0498mu = this.f4106q;
        overScroller.startScroll(left, top, i5, i6, (int) ((m2270e(i6, i4, abstractC0498mu.mo594r()) * f6) + (m2270e(i5, i3, abstractC0498mu.mo593q(view)) * f5)));
        m2279n(2);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2274i(int i) {
        if ((this.f4100k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m2275j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2266a();
        }
        if (this.f4101l == null) {
            this.f4101l = VelocityTracker.obtain();
        }
        this.f4101l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM2272g = m2272g((int) x, (int) y);
            m2277l(x, y, pointerId);
            m2282q(viewM2272g, pointerId);
            int i3 = this.f4097h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f4090a == 1) {
                m2276k();
            }
            m2266a();
            return;
        }
        AbstractC0498mu abstractC0498mu = this.f4106q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f4090a == 1) {
                    this.f4108s = true;
                    abstractC0498mu.mo589B(this.f4107r, 0.0f, 0.0f);
                    this.f4108s = false;
                    if (this.f4090a == 1) {
                        m2279n(0);
                    }
                }
                m2266a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m2277l(x2, y2, pointerId2);
                if (this.f4090a == 0) {
                    m2282q(m2272g((int) x2, (int) y2), pointerId2);
                    int i4 = this.f4097h[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.f4107r;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    m2282q(this.f4107r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f4090a == 1 && pointerId3 == this.f4092c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f4092c) {
                        View viewM2272g2 = m2272g((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f4107r;
                        if (viewM2272g2 == view2 && m2282q(view2, pointerId4)) {
                            i = this.f4092c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m2276k();
                }
            }
            m2269d(pointerId3);
            return;
        }
        if (this.f4090a == 1) {
            if (m2274i(this.f4092c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4092c);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f4095f;
                int i7 = this.f4092c;
                int i8 = (int) (x3 - fArr[i7]);
                int i9 = (int) (y3 - this.f4096g[i7]);
                int left = this.f4107r.getLeft() + i8;
                int top = this.f4107r.getTop() + i9;
                int left2 = this.f4107r.getLeft();
                int top2 = this.f4107r.getTop();
                if (i8 != 0) {
                    left = abstractC0498mu.mo591e(this.f4107r, left);
                    WeakHashMap weakHashMap = oa0.f3426a;
                    this.f4107r.offsetLeftAndRight(left - left2);
                }
                if (i9 != 0) {
                    top = abstractC0498mu.mo592f(this.f4107r, top);
                    WeakHashMap weakHashMap2 = oa0.f3426a;
                    this.f4107r.offsetTopAndBottom(top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    abstractC0498mu.mo588A(this.f4107r, left, top);
                }
                m2278m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (m2274i(pointerId5)) {
                float x4 = motionEvent.getX(i2);
                float y4 = motionEvent.getY(i2);
                float f = x4 - this.f4093d[pointerId5];
                float f2 = y4 - this.f4094e[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i10 = this.f4097h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i11 = this.f4097h[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i12 = this.f4097h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i13 = this.f4097h[pointerId5];
                if (this.f4090a != 1) {
                    View viewM2272g3 = m2272g((int) x4, (int) y4);
                    if (m2268c(viewM2272g3, f, f2) && m2282q(viewM2272g3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        m2278m(motionEvent);
    }

    /* JADX INFO: renamed from: k */
    public final void m2276k() {
        VelocityTracker velocityTracker = this.f4101l;
        float f = this.f4102m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f4101l.getXVelocity(this.f4092c);
        float fAbs = Math.abs(xVelocity);
        float f2 = this.f4103n;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f4101l.getYVelocity(this.f4092c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f4108s = true;
        this.f4106q.mo589B(this.f4107r, xVelocity, f);
        this.f4108s = false;
        if (this.f4090a == 1) {
            m2279n(0);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2277l(float f, float f2, int i) {
        float[] fArr = this.f4093d;
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
                float[] fArr6 = this.f4094e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f4095f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f4096g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f4097h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f4098i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f4099j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f4093d = fArr2;
            this.f4094e = fArr3;
            this.f4095f = fArr4;
            this.f4096g = fArr5;
            this.f4097h = iArr;
            this.f4098i = iArr2;
            this.f4099j = iArr3;
        }
        float[] fArr9 = this.f4093d;
        this.f4095f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f4094e;
        this.f4096g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f4097h;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.f4109t;
        int left = coordinatorLayout.getLeft();
        int i5 = this.f4104o;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < coordinatorLayout.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > coordinatorLayout.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > coordinatorLayout.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.f4100k |= 1 << i;
    }

    /* JADX INFO: renamed from: m */
    public final void m2278m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m2274i(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f4095f[pointerId] = x;
                this.f4096g[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2279n(int i) {
        this.f4109t.removeCallbacks(this.f4110u);
        if (this.f4090a != i) {
            this.f4090a = i;
            this.f4106q.mo595z(i);
            if (this.f4090a == 0) {
                this.f4107r = null;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2280o(int i, int i2) {
        if (this.f4108s) {
            return m2273h(i, i2, (int) this.f4101l.getXVelocity(this.f4092c), (int) this.f4101l.getYVelocity(this.f4092c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2281p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ra0.m2281p(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m2282q(View view, int i) {
        if (view == this.f4107r && this.f4092c == i) {
            return true;
        }
        if (view == null || !this.f4106q.mo590I(view, i)) {
            return false;
        }
        this.f4092c = i;
        m2267b(view, i);
        return true;
    }
}
