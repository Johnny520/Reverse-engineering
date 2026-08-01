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
public final class ma0 {

    /* JADX INFO: renamed from: v */
    public static final InterpolatorC0168dz f3163v = new InterpolatorC0168dz(1);

    /* JADX INFO: renamed from: a */
    public int f3164a;

    /* JADX INFO: renamed from: b */
    public final int f3165b;

    /* JADX INFO: renamed from: d */
    public float[] f3167d;

    /* JADX INFO: renamed from: e */
    public float[] f3168e;

    /* JADX INFO: renamed from: f */
    public float[] f3169f;

    /* JADX INFO: renamed from: g */
    public float[] f3170g;

    /* JADX INFO: renamed from: h */
    public int[] f3171h;

    /* JADX INFO: renamed from: i */
    public int[] f3172i;

    /* JADX INFO: renamed from: j */
    public int[] f3173j;

    /* JADX INFO: renamed from: k */
    public int f3174k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f3175l;

    /* JADX INFO: renamed from: m */
    public final float f3176m;

    /* JADX INFO: renamed from: n */
    public final float f3177n;

    /* JADX INFO: renamed from: o */
    public final int f3178o;

    /* JADX INFO: renamed from: p */
    public final OverScroller f3179p;

    /* JADX INFO: renamed from: q */
    public final AbstractC0273gt f3180q;

    /* JADX INFO: renamed from: r */
    public View f3181r;

    /* JADX INFO: renamed from: s */
    public boolean f3182s;

    /* JADX INFO: renamed from: t */
    public final CoordinatorLayout f3183t;

    /* JADX INFO: renamed from: c */
    public int f3166c = -1;

    /* JADX INFO: renamed from: u */
    public final RunnableC0919y6 f3184u = new RunnableC0919y6(12, this);

    public ma0(Context context, CoordinatorLayout coordinatorLayout, AbstractC0273gt abstractC0273gt) {
        if (abstractC0273gt == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f3183t = coordinatorLayout;
        this.f3180q = abstractC0273gt;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3178o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f3165b = viewConfiguration.getScaledTouchSlop();
        this.f3176m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3177n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3179p = new OverScroller(context, f3163v);
    }

    /* JADX INFO: renamed from: a */
    public final void m1801a() {
        this.f3166c = -1;
        float[] fArr = this.f3167d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3168e, 0.0f);
            Arrays.fill(this.f3169f, 0.0f);
            Arrays.fill(this.f3170g, 0.0f);
            Arrays.fill(this.f3171h, 0);
            Arrays.fill(this.f3172i, 0);
            Arrays.fill(this.f3173j, 0);
            this.f3174k = 0;
        }
        VelocityTracker velocityTracker = this.f3175l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3175l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1802b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f3183t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f3181r = view;
        this.f3166c = i;
        this.f3180q.mo1325r(view, i);
        m1814n(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1803c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            gt r1 = r3.f3180q
            int r4 = r1.mo1323l(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.mo1324m()
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
            int r4 = r3.f3165b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f3165b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f3165b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ma0.m1803c(android.view.View, float, float):boolean");
    }

    /* JADX INFO: renamed from: d */
    public final void m1804d(int i) {
        float[] fArr = this.f3167d;
        if (fArr != null) {
            int i2 = this.f3174k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f3168e[i] = 0.0f;
                this.f3169f[i] = 0.0f;
                this.f3170g[i] = 0.0f;
                this.f3171h[i] = 0;
                this.f3172i[i] = 0;
                this.f3173j[i] = 0;
                this.f3174k = (~i3) & i2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m1805e(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f3183t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1806f() {
        if (this.f3164a == 2) {
            OverScroller overScroller = this.f3179p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f3181r.getLeft();
            int top = currY - this.f3181r.getTop();
            if (left != 0) {
                View view = this.f3181r;
                WeakHashMap weakHashMap = ja0.f2600a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f3181r;
                WeakHashMap weakHashMap2 = ja0.f2600a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f3180q.mo1327t(this.f3181r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f3183t.post(this.f3184u);
            }
        }
        return this.f3164a == 2;
    }

    /* JADX INFO: renamed from: g */
    public final View m1807g(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.f3183t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f3180q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1808h(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f3181r.getLeft();
        int top = this.f3181r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f3179p;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m1814n(0);
            return false;
        }
        View view = this.f3181r;
        int i7 = (int) this.f3177n;
        int i8 = (int) this.f3176m;
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
        AbstractC0273gt abstractC0273gt = this.f3180q;
        overScroller.startScroll(left, top, i5, i6, (int) ((m1805e(i6, i4, abstractC0273gt.mo1324m()) * f6) + (m1805e(i5, i3, abstractC0273gt.mo1323l(view)) * f5)));
        m1814n(2);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1809i(int i) {
        if ((this.f3174k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m1810j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m1801a();
        }
        if (this.f3175l == null) {
            this.f3175l = VelocityTracker.obtain();
        }
        this.f3175l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM1807g = m1807g((int) x, (int) y);
            m1812l(x, y, pointerId);
            m1817q(viewM1807g, pointerId);
            int i3 = this.f3171h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f3164a == 1) {
                m1811k();
            }
            m1801a();
            return;
        }
        AbstractC0273gt abstractC0273gt = this.f3180q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f3164a == 1) {
                    this.f3182s = true;
                    abstractC0273gt.mo1328u(this.f3181r, 0.0f, 0.0f);
                    this.f3182s = false;
                    if (this.f3164a == 1) {
                        m1814n(0);
                    }
                }
                m1801a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m1812l(x2, y2, pointerId2);
                if (this.f3164a == 0) {
                    m1817q(m1807g((int) x2, (int) y2), pointerId2);
                    int i4 = this.f3171h[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.f3181r;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    m1817q(this.f3181r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f3164a == 1 && pointerId3 == this.f3166c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f3166c) {
                        View viewM1807g2 = m1807g((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f3181r;
                        if (viewM1807g2 == view2 && m1817q(view2, pointerId4)) {
                            i = this.f3166c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m1811k();
                }
            }
            m1804d(pointerId3);
            return;
        }
        if (this.f3164a == 1) {
            if (m1809i(this.f3166c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3166c);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f3169f;
                int i7 = this.f3166c;
                int i8 = (int) (x3 - fArr[i7]);
                int i9 = (int) (y3 - this.f3170g[i7]);
                int left = this.f3181r.getLeft() + i8;
                int top = this.f3181r.getTop() + i9;
                int left2 = this.f3181r.getLeft();
                int top2 = this.f3181r.getTop();
                if (i8 != 0) {
                    left = abstractC0273gt.mo1321b(this.f3181r, left);
                    WeakHashMap weakHashMap = ja0.f2600a;
                    this.f3181r.offsetLeftAndRight(left - left2);
                }
                if (i9 != 0) {
                    top = abstractC0273gt.mo1322c(this.f3181r, top);
                    WeakHashMap weakHashMap2 = ja0.f2600a;
                    this.f3181r.offsetTopAndBottom(top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    abstractC0273gt.mo1327t(this.f3181r, left, top);
                }
                m1813m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (m1809i(pointerId5)) {
                float x4 = motionEvent.getX(i2);
                float y4 = motionEvent.getY(i2);
                float f = x4 - this.f3167d[pointerId5];
                float f2 = y4 - this.f3168e[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i10 = this.f3171h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i11 = this.f3171h[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i12 = this.f3171h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i13 = this.f3171h[pointerId5];
                if (this.f3164a != 1) {
                    View viewM1807g3 = m1807g((int) x4, (int) y4);
                    if (m1803c(viewM1807g3, f, f2) && m1817q(viewM1807g3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        m1813m(motionEvent);
    }

    /* JADX INFO: renamed from: k */
    public final void m1811k() {
        VelocityTracker velocityTracker = this.f3175l;
        float f = this.f3176m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f3175l.getXVelocity(this.f3166c);
        float fAbs = Math.abs(xVelocity);
        float f2 = this.f3177n;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f3175l.getYVelocity(this.f3166c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f3182s = true;
        this.f3180q.mo1328u(this.f3181r, xVelocity, f);
        this.f3182s = false;
        if (this.f3164a == 1) {
            m1814n(0);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1812l(float f, float f2, int i) {
        float[] fArr = this.f3167d;
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
                float[] fArr6 = this.f3168e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3169f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3170g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3171h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3172i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3173j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3167d = fArr2;
            this.f3168e = fArr3;
            this.f3169f = fArr4;
            this.f3170g = fArr5;
            this.f3171h = iArr;
            this.f3172i = iArr2;
            this.f3173j = iArr3;
        }
        float[] fArr9 = this.f3167d;
        this.f3169f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f3168e;
        this.f3170g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f3171h;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.f3183t;
        int left = coordinatorLayout.getLeft();
        int i5 = this.f3178o;
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
        this.f3174k |= 1 << i;
    }

    /* JADX INFO: renamed from: m */
    public final void m1813m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m1809i(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f3169f[pointerId] = x;
                this.f3170g[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1814n(int i) {
        this.f3183t.removeCallbacks(this.f3184u);
        if (this.f3164a != i) {
            this.f3164a = i;
            this.f3180q.mo1326s(i);
            if (this.f3164a == 0) {
                this.f3181r = null;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1815o(int i, int i2) {
        if (this.f3182s) {
            return m1808h(i, i2, (int) this.f3175l.getXVelocity(this.f3166c), (int) this.f3175l.getYVelocity(this.f3166c));
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
    public final boolean m1816p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ma0.m1816p(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m1817q(View view, int i) {
        if (view == this.f3181r && this.f3166c == i) {
            return true;
        }
        if (view == null || !this.f3180q.mo1320H(view, i)) {
            return false;
        }
        this.f3166c = i;
        m1802b(view, i);
        return true;
    }
}
