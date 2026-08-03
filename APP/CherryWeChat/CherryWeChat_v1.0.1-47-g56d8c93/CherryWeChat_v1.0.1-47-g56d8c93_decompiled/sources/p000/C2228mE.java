package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.youth.banner.config.BannerConfig;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: mE */
/* JADX INFO: loaded from: classes.dex */
public final class C2228mE {

    /* JADX INFO: renamed from: v */
    public static final InterpolatorC0844Tl f7748v = new InterpolatorC0844Tl(3);

    /* JADX INFO: renamed from: a */
    public int f7749a;

    /* JADX INFO: renamed from: b */
    public final int f7750b;

    /* JADX INFO: renamed from: d */
    public float[] f7752d;

    /* JADX INFO: renamed from: e */
    public float[] f7753e;

    /* JADX INFO: renamed from: f */
    public float[] f7754f;

    /* JADX INFO: renamed from: g */
    public float[] f7755g;

    /* JADX INFO: renamed from: h */
    public int[] f7756h;

    /* JADX INFO: renamed from: i */
    public int[] f7757i;

    /* JADX INFO: renamed from: j */
    public int[] f7758j;

    /* JADX INFO: renamed from: k */
    public int f7759k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f7760l;

    /* JADX INFO: renamed from: m */
    public final float f7761m;

    /* JADX INFO: renamed from: n */
    public final float f7762n;

    /* JADX INFO: renamed from: o */
    public final int f7763o;

    /* JADX INFO: renamed from: p */
    public final OverScroller f7764p;

    /* JADX INFO: renamed from: q */
    public final AbstractC1293cr f7765q;

    /* JADX INFO: renamed from: r */
    public View f7766r;

    /* JADX INFO: renamed from: s */
    public boolean f7767s;

    /* JADX INFO: renamed from: t */
    public final CoordinatorLayout f7768t;

    /* JADX INFO: renamed from: c */
    public int f7751c = -1;

    /* JADX INFO: renamed from: u */
    public final RunnableC0431K0 f7769u = new RunnableC0431K0(18, this);

    public C2228mE(Context context, CoordinatorLayout coordinatorLayout, AbstractC1293cr abstractC1293cr) {
        if (abstractC1293cr == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f7768t = coordinatorLayout;
        this.f7765q = abstractC1293cr;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7763o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f7750b = viewConfiguration.getScaledTouchSlop();
        this.f7761m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f7762n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7764p = new OverScroller(context, f7748v);
    }

    /* JADX INFO: renamed from: a */
    public final void m4486a() {
        this.f7751c = -1;
        float[] fArr = this.f7752d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f7753e, 0.0f);
            Arrays.fill(this.f7754f, 0.0f);
            Arrays.fill(this.f7755g, 0.0f);
            Arrays.fill(this.f7756h, 0);
            Arrays.fill(this.f7757i, 0);
            Arrays.fill(this.f7758j, 0);
            this.f7759k = 0;
        }
        VelocityTracker velocityTracker = this.f7760l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7760l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4487b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f7768t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f7766r = view;
        this.f7751c = i;
        this.f7765q.mo1386J(view, i);
        m4498m(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4488c(View view, float f, float f2) {
        if (view != null) {
            AbstractC1293cr abstractC1293cr = this.f7765q;
            boolean z = abstractC1293cr.mo1385B(view) > 0;
            boolean z2 = abstractC1293cr.mo2017C() > 0;
            if (z && z2) {
                float f3 = (f2 * f2) + (f * f);
                int i = this.f7750b;
                if (f3 > i * i) {
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= this.f7750b) : Math.abs(f) > this.f7750b) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m4489d(int i) {
        float[] fArr = this.f7752d;
        if (fArr != null) {
            int i2 = this.f7759k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f7753e[i] = 0.0f;
                this.f7754f[i] = 0.0f;
                this.f7755g[i] = 0.0f;
                this.f7756h[i] = 0;
                this.f7757i[i] = 0;
                this.f7758j[i] = 0;
                this.f7759k = (~i3) & i2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m4490e(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f7768t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), BannerConfig.SCROLL_TIME);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4491f() {
        if (this.f7749a == 2) {
            OverScroller overScroller = this.f7764p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f7766r.getLeft();
            int top = currY - this.f7766r.getTop();
            if (left != 0) {
                View view = this.f7766r;
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f7766r;
                WeakHashMap weakHashMap2 = AbstractC2185lE.f7617a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f7765q.mo1388L(this.f7766r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f7768t.post(this.f7769u);
            }
        }
        return this.f7749a == 2;
    }

    /* JADX INFO: renamed from: g */
    public final View m4492g(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.f7768t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f7765q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4493h(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f7766r.getLeft();
        int top = this.f7766r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f7764p;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m4498m(0);
            return false;
        }
        View view = this.f7766r;
        int i7 = (int) this.f7762n;
        int i8 = (int) this.f7761m;
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
        AbstractC1293cr abstractC1293cr = this.f7765q;
        overScroller.startScroll(left, top, i5, i6, (int) ((m4490e(i6, i4, abstractC1293cr.mo2017C()) * f6) + (m4490e(i5, i3, abstractC1293cr.mo1385B(view)) * f5)));
        m4498m(2);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m4494i(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m4486a();
        }
        if (this.f7760l == null) {
            this.f7760l = VelocityTracker.obtain();
        }
        this.f7760l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM4492g = m4492g((int) x, (int) y);
            m4496k(x, y, pointerId);
            m4501p(viewM4492g, pointerId);
            int i2 = this.f7756h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f7749a == 1) {
                m4495j();
            }
            m4486a();
            return;
        }
        AbstractC1293cr abstractC1293cr = this.f7765q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f7749a == 1) {
                    this.f7767s = true;
                    abstractC1293cr.mo1389M(this.f7766r, 0.0f, 0.0f);
                    this.f7767s = false;
                    if (this.f7749a == 1) {
                        m4498m(0);
                    }
                }
                m4486a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m4496k(x2, y2, pointerId2);
                if (this.f7749a == 0) {
                    m4501p(m4492g((int) x2, (int) y2), pointerId2);
                    int i3 = this.f7756h[pointerId2];
                    return;
                }
                int i4 = (int) x2;
                int i5 = (int) y2;
                View view = this.f7766r;
                if (view != null && i4 >= view.getLeft() && i4 < view.getRight() && i5 >= view.getTop() && i5 < view.getBottom()) {
                    i = 1;
                }
                if (i != 0) {
                    m4501p(this.f7766r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f7749a == 1 && pointerId3 == this.f7751c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i);
                    if (pointerId4 != this.f7751c) {
                        View viewM4492g2 = m4492g((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                        View view2 = this.f7766r;
                        if (viewM4492g2 == view2 && m4501p(view2, pointerId4)) {
                            i = this.f7751c;
                            break;
                        }
                    }
                    i++;
                }
                if (i == -1) {
                    m4495j();
                }
            }
            m4489d(pointerId3);
            return;
        }
        if (this.f7749a == 1) {
            int i6 = this.f7751c;
            if (((this.f7759k & (1 << i6)) != 0 ? 1 : 0) == 0) {
                return;
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(i6);
            float x3 = motionEvent.getX(iFindPointerIndex);
            float y3 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f7754f;
            int i7 = this.f7751c;
            int i8 = (int) (x3 - fArr[i7]);
            int i9 = (int) (y3 - this.f7755g[i7]);
            int left = this.f7766r.getLeft() + i8;
            int top = this.f7766r.getTop() + i9;
            int left2 = this.f7766r.getLeft();
            int top2 = this.f7766r.getTop();
            if (i8 != 0) {
                left = abstractC1293cr.mo1391j(this.f7766r, left);
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                this.f7766r.offsetLeftAndRight(left - left2);
            }
            if (i9 != 0) {
                top = abstractC1293cr.mo1392k(this.f7766r, top);
                WeakHashMap weakHashMap2 = AbstractC2185lE.f7617a;
                this.f7766r.offsetTopAndBottom(top - top2);
            }
            if (i8 != 0 || i9 != 0) {
                abstractC1293cr.mo1388L(this.f7766r, left, top);
            }
            m4497l(motionEvent);
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount2; i10++) {
            int pointerId5 = motionEvent.getPointerId(i10);
            if ((this.f7759k & (1 << pointerId5)) != 0) {
                float x4 = motionEvent.getX(i10);
                float y4 = motionEvent.getY(i10);
                float f = x4 - this.f7752d[pointerId5];
                float f2 = y4 - this.f7753e[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i11 = this.f7756h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i12 = this.f7756h[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i13 = this.f7756h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i14 = this.f7756h[pointerId5];
                if (this.f7749a == 1) {
                    break;
                }
                View viewM4492g3 = m4492g((int) x4, (int) y4);
                if (m4488c(viewM4492g3, f, f2) && m4501p(viewM4492g3, pointerId5)) {
                    break;
                }
            }
        }
        m4497l(motionEvent);
    }

    /* JADX INFO: renamed from: j */
    public final void m4495j() {
        VelocityTracker velocityTracker = this.f7760l;
        float f = this.f7761m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f7760l.getXVelocity(this.f7751c);
        float fAbs = Math.abs(xVelocity);
        float f2 = this.f7762n;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f7760l.getYVelocity(this.f7751c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f7767s = true;
        this.f7765q.mo1389M(this.f7766r, xVelocity, f);
        this.f7767s = false;
        if (this.f7749a == 1) {
            m4498m(0);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4496k(float f, float f2, int i) {
        float[] fArr = this.f7752d;
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
                float[] fArr6 = this.f7753e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f7754f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f7755g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f7756h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f7757i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f7758j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f7752d = fArr2;
            this.f7753e = fArr3;
            this.f7754f = fArr4;
            this.f7755g = fArr5;
            this.f7756h = iArr;
            this.f7757i = iArr2;
            this.f7758j = iArr3;
        }
        float[] fArr9 = this.f7752d;
        this.f7754f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f7753e;
        this.f7755g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f7756h;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.f7768t;
        int left = coordinatorLayout.getLeft();
        int i5 = this.f7763o;
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
        this.f7759k |= 1 << i;
    }

    /* JADX INFO: renamed from: l */
    public final void m4497l(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.f7759k & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f7754f[pointerId] = x;
                this.f7755g[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4498m(int i) {
        this.f7768t.removeCallbacks(this.f7769u);
        if (this.f7749a != i) {
            this.f7749a = i;
            this.f7765q.mo1387K(i);
            if (this.f7749a == 0) {
                this.f7766r = null;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m4499n(int i, int i2) {
        if (this.f7767s) {
            return m4493h(i, i2, (int) this.f7760l.getXVelocity(this.f7751c), (int) this.f7760l.getYVelocity(this.f7751c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4500o(MotionEvent motionEvent) {
        View viewM4492g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m4486a();
        }
        if (this.f7760l == null) {
            this.f7760l = VelocityTracker.obtain();
        }
        this.f7760l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m4496k(x, y, pointerId);
            View viewM4492g2 = m4492g((int) x, (int) y);
            if (viewM4492g2 == this.f7766r && this.f7749a == 2) {
                m4501p(viewM4492g2, pointerId);
            }
            int i = this.f7756h[pointerId];
        } else if (actionMasked == 1) {
            m4486a();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x2 = motionEvent.getX(actionIndex);
                    float y2 = motionEvent.getY(actionIndex);
                    m4496k(x2, y2, pointerId2);
                    int i2 = this.f7749a;
                    if (i2 == 0) {
                        int i3 = this.f7756h[pointerId2];
                    } else if (i2 == 2 && (viewM4492g = m4492g((int) x2, (int) y2)) == this.f7766r) {
                        m4501p(viewM4492g, pointerId2);
                    }
                } else if (actionMasked == 6) {
                    m4489d(motionEvent.getPointerId(actionIndex));
                }
            }
        } else if (this.f7752d != null && this.f7753e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if ((this.f7759k & (1 << pointerId3)) != 0) {
                    float x3 = motionEvent.getX(i4);
                    float y3 = motionEvent.getY(i4);
                    float f = x3 - this.f7752d[pointerId3];
                    float f2 = y3 - this.f7753e[pointerId3];
                    View viewM4492g3 = m4492g((int) x3, (int) y3);
                    boolean z = viewM4492g3 != null && m4488c(viewM4492g3, f, f2);
                    if (z) {
                        int left = viewM4492g3.getLeft();
                        AbstractC1293cr abstractC1293cr = this.f7765q;
                        int iMo1391j = abstractC1293cr.mo1391j(viewM4492g3, ((int) f) + left);
                        int top = viewM4492g3.getTop();
                        int iMo1392k = abstractC1293cr.mo1392k(viewM4492g3, ((int) f2) + top);
                        int iMo1385B = abstractC1293cr.mo1385B(viewM4492g3);
                        int iMo2017C = abstractC1293cr.mo2017C();
                        if ((iMo1385B == 0 || (iMo1385B > 0 && iMo1391j == left)) && (iMo2017C == 0 || (iMo2017C > 0 && iMo1392k == top))) {
                            break;
                        }
                        Math.abs(f);
                        Math.abs(f2);
                        int i5 = this.f7756h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i6 = this.f7756h[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i7 = this.f7756h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i8 = this.f7756h[pointerId3];
                        if (this.f7749a == 1 || (z && m4501p(viewM4492g3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m4497l(motionEvent);
        }
        return this.f7749a == 1;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4501p(View view, int i) {
        if (view == this.f7766r && this.f7751c == i) {
            return true;
        }
        if (view == null || !this.f7765q.mo1390W(view, i)) {
            return false;
        }
        this.f7751c = i;
        m4487b(view, i);
        return true;
    }
}
