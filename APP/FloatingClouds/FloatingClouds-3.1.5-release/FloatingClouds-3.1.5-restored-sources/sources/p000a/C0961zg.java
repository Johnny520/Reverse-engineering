package p000a;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.zg */
/* JADX INFO: loaded from: classes.dex */
public final class C0961zg {

    /* JADX INFO: renamed from: v */
    public static final a f3570v = new a();

    /* JADX INFO: renamed from: a */
    public int f3571a;

    /* JADX INFO: renamed from: b */
    public final int f3572b;

    /* JADX INFO: renamed from: d */
    public float[] f3574d;

    /* JADX INFO: renamed from: e */
    public float[] f3575e;

    /* JADX INFO: renamed from: f */
    public float[] f3576f;

    /* JADX INFO: renamed from: g */
    public float[] f3577g;

    /* JADX INFO: renamed from: h */
    public int[] f3578h;

    /* JADX INFO: renamed from: i */
    public int[] f3579i;

    /* JADX INFO: renamed from: j */
    public int[] f3580j;

    /* JADX INFO: renamed from: k */
    public int f3581k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f3582l;

    /* JADX INFO: renamed from: m */
    public final float f3583m;

    /* JADX INFO: renamed from: n */
    public final float f3584n;

    /* JADX INFO: renamed from: o */
    public final int f3585o;

    /* JADX INFO: renamed from: p */
    public final OverScroller f3586p;

    /* JADX INFO: renamed from: q */
    public final c f3587q;

    /* JADX INFO: renamed from: r */
    public View f3588r;

    /* JADX INFO: renamed from: s */
    public boolean f3589s;

    /* JADX INFO: renamed from: t */
    public final CoordinatorLayout f3590t;

    /* JADX INFO: renamed from: c */
    public int f3573c = -1;

    /* JADX INFO: renamed from: u */
    public final b f3591u = new b();

    /* JADX INFO: renamed from: a.zg$a */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: a.zg$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0961zg.this.m2263n(0);
        }
    }

    /* JADX INFO: renamed from: a.zg$c */
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public abstract int mo2267a(View view, int i);

        /* JADX INFO: renamed from: b */
        public abstract int mo2268b(View view, int i);

        /* JADX INFO: renamed from: c */
        public int mo2269c(View view) {
            return 0;
        }

        /* JADX INFO: renamed from: d */
        public int mo2270d() {
            return 0;
        }

        /* JADX INFO: renamed from: e */
        public void mo2271e(View view, int i) {
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo2272f(int i);

        /* JADX INFO: renamed from: g */
        public abstract void mo2273g(View view, int i, int i2);

        /* JADX INFO: renamed from: h */
        public abstract void mo2274h(View view, float f, float f2);

        /* JADX INFO: renamed from: i */
        public abstract boolean mo2275i(View view, int i);
    }

    public C0961zg(Context context, CoordinatorLayout coordinatorLayout, c cVar) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f3590t = coordinatorLayout;
        this.f3587q = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3585o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f3572b = viewConfiguration.getScaledTouchSlop();
        this.f3583m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3584n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3586p = new OverScroller(context, f3570v);
    }

    /* JADX INFO: renamed from: a */
    public final void m2250a() {
        this.f3573c = -1;
        float[] fArr = this.f3574d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3575e, 0.0f);
            Arrays.fill(this.f3576f, 0.0f);
            Arrays.fill(this.f3577g, 0.0f);
            Arrays.fill(this.f3578h, 0);
            Arrays.fill(this.f3579i, 0);
            Arrays.fill(this.f3580j, 0);
            this.f3581k = 0;
        }
        VelocityTracker velocityTracker = this.f3582l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3582l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2251b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f3590t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f3588r = view;
        this.f3573c = i;
        this.f3587q.mo2271e(view, i);
        m2263n(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2252c(View view, float f, float f2) {
        if (view != null) {
            c cVar = this.f3587q;
            boolean z = cVar.mo2269c(view) > 0;
            boolean z2 = cVar.mo2270d() > 0;
            if (z && z2) {
                float f3 = (f2 * f2) + (f * f);
                int i = this.f3572b;
                if (f3 > i * i) {
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= this.f3572b) : Math.abs(f) > this.f3572b) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m2253d(int i) {
        float[] fArr = this.f3574d;
        if (fArr != null) {
            int i2 = this.f3581k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f3575e[i] = 0.0f;
                this.f3576f[i] = 0.0f;
                this.f3577g[i] = 0.0f;
                this.f3578h[i] = 0;
                this.f3579i[i] = 0;
                this.f3580j[i] = 0;
                this.f3581k = (~i3) & i2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m2254e(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f3590t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2255f() {
        if (this.f3571a == 2) {
            OverScroller overScroller = this.f3586p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f3588r.getLeft();
            int top2 = currY - this.f3588r.getTop();
            if (left != 0) {
                View view = this.f3588r;
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                view.offsetLeftAndRight(left);
            }
            if (top2 != 0) {
                View view2 = this.f3588r;
                WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                view2.offsetTopAndBottom(top2);
            }
            if (left != 0 || top2 != 0) {
                this.f3587q.mo2273g(this.f3588r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f3590t.post(this.f3591u);
            }
        }
        return this.f3571a == 2;
    }

    /* JADX INFO: renamed from: g */
    public final View m2256g(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.f3590t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f3587q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2257h(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f3588r.getLeft();
        int top2 = this.f3588r.getTop();
        int i5 = i - left;
        int i6 = i2 - top2;
        OverScroller overScroller = this.f3586p;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m2263n(0);
            return false;
        }
        View view = this.f3588r;
        int i7 = (int) this.f3584n;
        int i8 = (int) this.f3583m;
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
        c cVar = this.f3587q;
        overScroller.startScroll(left, top2, i5, i6, (int) ((m2254e(i6, i4, cVar.mo2270d()) * f6) + (m2254e(i5, i3, cVar.mo2269c(view)) * f5)));
        m2263n(2);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2258i(int i) {
        if ((this.f3581k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m2259j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2250a();
        }
        if (this.f3582l == null) {
            this.f3582l = VelocityTracker.obtain();
        }
        this.f3582l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM2256g = m2256g((int) x, (int) y);
            m2261l(x, y, pointerId);
            m2266q(viewM2256g, pointerId);
            int i3 = this.f3578h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f3571a == 1) {
                m2260k();
            }
            m2250a();
            return;
        }
        c cVar = this.f3587q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f3571a == 1) {
                    this.f3589s = true;
                    cVar.mo2274h(this.f3588r, 0.0f, 0.0f);
                    this.f3589s = false;
                    if (this.f3571a == 1) {
                        m2263n(0);
                    }
                }
                m2250a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m2261l(x2, y2, pointerId2);
                if (this.f3571a == 0) {
                    m2266q(m2256g((int) x2, (int) y2), pointerId2);
                    int i4 = this.f3578h[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.f3588r;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    m2266q(this.f3588r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f3571a == 1 && pointerId3 == this.f3573c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f3573c) {
                        View viewM2256g2 = m2256g((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f3588r;
                        if (viewM2256g2 == view2 && m2266q(view2, pointerId4)) {
                            i = this.f3573c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m2260k();
                }
            }
            m2253d(pointerId3);
            return;
        }
        if (this.f3571a == 1) {
            if (m2258i(this.f3573c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3573c);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f3576f;
                int i7 = this.f3573c;
                int i8 = (int) (x3 - fArr[i7]);
                int i9 = (int) (y3 - this.f3577g[i7]);
                int left = this.f3588r.getLeft() + i8;
                int top2 = this.f3588r.getTop() + i9;
                int left2 = this.f3588r.getLeft();
                int top3 = this.f3588r.getTop();
                if (i8 != 0) {
                    left = cVar.mo2267a(this.f3588r, left);
                    WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                    this.f3588r.offsetLeftAndRight(left - left2);
                }
                if (i9 != 0) {
                    top2 = cVar.mo2268b(this.f3588r, top2);
                    WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                    this.f3588r.offsetTopAndBottom(top2 - top3);
                }
                if (i8 != 0 || i9 != 0) {
                    cVar.mo2273g(this.f3588r, left, top2);
                }
                m2262m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (m2258i(pointerId5)) {
                float x4 = motionEvent.getX(i2);
                float y4 = motionEvent.getY(i2);
                float f = x4 - this.f3574d[pointerId5];
                float f2 = y4 - this.f3575e[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i10 = this.f3578h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i11 = this.f3578h[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i12 = this.f3578h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i13 = this.f3578h[pointerId5];
                if (this.f3571a != 1) {
                    View viewM2256g3 = m2256g((int) x4, (int) y4);
                    if (m2252c(viewM2256g3, f, f2) && m2266q(viewM2256g3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        m2262m(motionEvent);
    }

    /* JADX INFO: renamed from: k */
    public final void m2260k() {
        VelocityTracker velocityTracker = this.f3582l;
        float f = this.f3583m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f3582l.getXVelocity(this.f3573c);
        float f2 = this.f3584n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f3582l.getYVelocity(this.f3573c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f3589s = true;
        this.f3587q.mo2274h(this.f3588r, xVelocity, f);
        this.f3589s = false;
        if (this.f3571a == 1) {
            m2263n(0);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2261l(float f, float f2, int i) {
        float[] fArr = this.f3574d;
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
                float[] fArr6 = this.f3575e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3576f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3577g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3578h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3579i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3580j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3574d = fArr2;
            this.f3575e = fArr3;
            this.f3576f = fArr4;
            this.f3577g = fArr5;
            this.f3578h = iArr;
            this.f3579i = iArr2;
            this.f3580j = iArr3;
        }
        float[] fArr9 = this.f3574d;
        this.f3576f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f3575e;
        this.f3577g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f3578h;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.f3590t;
        int left = coordinatorLayout.getLeft();
        int i5 = this.f3585o;
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
        this.f3581k |= 1 << i;
    }

    /* JADX INFO: renamed from: m */
    public final void m2262m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m2258i(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f3576f[pointerId] = x;
                this.f3577g[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2263n(int i) {
        this.f3590t.removeCallbacks(this.f3591u);
        if (this.f3571a != i) {
            this.f3571a = i;
            this.f3587q.mo2272f(i);
            if (this.f3571a == 0) {
                this.f3588r = null;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2264o(int i, int i2) {
        if (this.f3589s) {
            return m2257h(i, i2, (int) this.f3582l.getXVelocity(this.f3573c), (int) this.f3582l.getYVelocity(this.f3573c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2265p(MotionEvent motionEvent) {
        View viewM2256g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2250a();
        }
        if (this.f3582l == null) {
            this.f3582l = VelocityTracker.obtain();
        }
        this.f3582l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m2261l(x, y, pointerId);
            View viewM2256g2 = m2256g((int) x, (int) y);
            if (viewM2256g2 == this.f3588r && this.f3571a == 2) {
                m2266q(viewM2256g2, pointerId);
            }
            int i = this.f3578h[pointerId];
        } else if (actionMasked == 1) {
            m2250a();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x2 = motionEvent.getX(actionIndex);
                    float y2 = motionEvent.getY(actionIndex);
                    m2261l(x2, y2, pointerId2);
                    int i2 = this.f3571a;
                    if (i2 == 0) {
                        int i3 = this.f3578h[pointerId2];
                    } else if (i2 == 2 && (viewM2256g = m2256g((int) x2, (int) y2)) == this.f3588r) {
                        m2266q(viewM2256g, pointerId2);
                    }
                } else if (actionMasked == 6) {
                    m2253d(motionEvent.getPointerId(actionIndex));
                }
            }
        } else if (this.f3574d != null && this.f3575e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if (m2258i(pointerId3)) {
                    float x3 = motionEvent.getX(i4);
                    float y3 = motionEvent.getY(i4);
                    float f = x3 - this.f3574d[pointerId3];
                    float f2 = y3 - this.f3575e[pointerId3];
                    View viewM2256g3 = m2256g((int) x3, (int) y3);
                    boolean z = viewM2256g3 != null && m2252c(viewM2256g3, f, f2);
                    if (z) {
                        int left = viewM2256g3.getLeft();
                        c cVar = this.f3587q;
                        int iMo2267a = cVar.mo2267a(viewM2256g3, ((int) f) + left);
                        int top2 = viewM2256g3.getTop();
                        int iMo2268b = cVar.mo2268b(viewM2256g3, ((int) f2) + top2);
                        int iMo2269c = cVar.mo2269c(viewM2256g3);
                        int iMo2270d = cVar.mo2270d();
                        if ((iMo2269c == 0 || (iMo2269c > 0 && iMo2267a == left)) && (iMo2270d == 0 || (iMo2270d > 0 && iMo2268b == top2))) {
                            break;
                        }
                        Math.abs(f);
                        Math.abs(f2);
                        int i5 = this.f3578h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i6 = this.f3578h[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i7 = this.f3578h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i8 = this.f3578h[pointerId3];
                        if (this.f3571a == 1 || (z && m2266q(viewM2256g3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m2262m(motionEvent);
        }
        return this.f3571a == 1;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m2266q(View view, int i) {
        if (view == this.f3588r && this.f3573c == i) {
            return true;
        }
        if (view == null || !this.f3587q.mo2275i(view, i)) {
            return false;
        }
        this.f3573c = i;
        m2251b(view, i);
        return true;
    }
}
