package p021L;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.lang.reflect.Field;
import java.util.Arrays;
import p001A0.AbstractC0040p;
import p001A0.RunnableC0019E;
import p006D.AbstractC0080Q;

/* JADX INFO: renamed from: L.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0245e {

    /* JADX INFO: renamed from: v */
    public static final InterpolatorC0244d f502v = new InterpolatorC0244d(0);

    /* JADX INFO: renamed from: a */
    public int f503a;

    /* JADX INFO: renamed from: b */
    public final int f504b;

    /* JADX INFO: renamed from: d */
    public float[] f506d;

    /* JADX INFO: renamed from: e */
    public float[] f507e;

    /* JADX INFO: renamed from: f */
    public float[] f508f;

    /* JADX INFO: renamed from: g */
    public float[] f509g;

    /* JADX INFO: renamed from: h */
    public int[] f510h;

    /* JADX INFO: renamed from: i */
    public int[] f511i;

    /* JADX INFO: renamed from: j */
    public int[] f512j;

    /* JADX INFO: renamed from: k */
    public int f513k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f514l;

    /* JADX INFO: renamed from: m */
    public final float f515m;

    /* JADX INFO: renamed from: n */
    public final float f516n;

    /* JADX INFO: renamed from: o */
    public final int f517o;

    /* JADX INFO: renamed from: p */
    public final OverScroller f518p;

    /* JADX INFO: renamed from: q */
    public final AbstractC0040p f519q;

    /* JADX INFO: renamed from: r */
    public View f520r;

    /* JADX INFO: renamed from: s */
    public boolean f521s;

    /* JADX INFO: renamed from: t */
    public final ViewGroup f522t;

    /* JADX INFO: renamed from: c */
    public int f505c = -1;

    /* JADX INFO: renamed from: u */
    public final RunnableC0019E f523u = new RunnableC0019E(2, this);

    public C0245e(Context context, ViewGroup viewGroup, AbstractC0040p abstractC0040p) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0040p == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f522t = viewGroup;
        this.f519q = abstractC0040p;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f517o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f504b = viewConfiguration.getScaledTouchSlop();
        this.f515m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f516n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f518p = new OverScroller(context, f502v);
    }

    /* JADX INFO: renamed from: a */
    public final void m669a() {
        this.f505c = -1;
        float[] fArr = this.f506d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f507e, 0.0f);
            Arrays.fill(this.f508f, 0.0f);
            Arrays.fill(this.f509g, 0.0f);
            Arrays.fill(this.f510h, 0);
            Arrays.fill(this.f511i, 0);
            Arrays.fill(this.f512j, 0);
            this.f513k = 0;
        }
        VelocityTracker velocityTracker = this.f514l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f514l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m670b(View view, int i2) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f522t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f520r = view;
        this.f505c = i2;
        this.f519q.mo123K(view, i2);
        m681m(1);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m671c(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        AbstractC0040p abstractC0040p = this.f519q;
        boolean z2 = abstractC0040p.mo136z(view) > 0;
        boolean z3 = abstractC0040p.mo120A() > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f504b) : z3 && Math.abs(f3) > ((float) this.f504b);
        }
        float f4 = (f3 * f3) + (f2 * f2);
        int i2 = this.f504b;
        return f4 > ((float) (i2 * i2));
    }

    /* JADX INFO: renamed from: d */
    public final void m672d(int i2) {
        float[] fArr = this.f506d;
        if (fArr != null) {
            int i3 = this.f513k;
            int i4 = 1 << i2;
            if ((i3 & i4) != 0) {
                fArr[i2] = 0.0f;
                this.f507e[i2] = 0.0f;
                this.f508f[i2] = 0.0f;
                this.f509g[i2] = 0.0f;
                this.f510h[i2] = 0;
                this.f511i[i2] = 0;
                this.f512j[i2] = 0;
                this.f513k = (~i4) & i3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m673e(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        float width = this.f522t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i2) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i3);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m674f() {
        if (this.f503a == 2) {
            OverScroller overScroller = this.f518p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f520r.getLeft();
            int top = currY - this.f520r.getTop();
            if (left != 0) {
                View view = this.f520r;
                Field field = AbstractC0080Q.f219a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f520r;
                Field field2 = AbstractC0080Q.f219a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f519q.mo125M(this.f520r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f522t.post(this.f523u);
            }
        }
        return this.f503a == 2;
    }

    /* JADX INFO: renamed from: g */
    public final View m675g(int i2, int i3) {
        ViewGroup viewGroup = this.f522t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f519q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m676h(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.f520r.getLeft();
        int top = this.f520r.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        OverScroller overScroller = this.f518p;
        int i8 = 0;
        if (i6 == 0 && i7 == 0) {
            overScroller.abortAnimation();
            m681m(0);
            return false;
        }
        View view = this.f520r;
        int i9 = (int) this.f516n;
        int i10 = (int) this.f515m;
        int iAbs = Math.abs(i4);
        if (iAbs < i9) {
            i4 = 0;
        } else if (iAbs > i10) {
            i4 = i4 > 0 ? i10 : -i10;
        }
        int iAbs2 = Math.abs(i5);
        if (iAbs2 < i9) {
            i5 = i8;
        } else if (iAbs2 > i10) {
            if (i5 > 0) {
                i5 = i10;
            } else {
                i8 = -i10;
                i5 = i8;
            }
        }
        int iAbs3 = Math.abs(i6);
        int iAbs4 = Math.abs(i7);
        int iAbs5 = Math.abs(i4);
        int iAbs6 = Math.abs(i5);
        int i11 = iAbs5 + iAbs6;
        int i12 = iAbs3 + iAbs4;
        if (i4 != 0) {
            f2 = iAbs5;
            f3 = i11;
        } else {
            f2 = iAbs3;
            f3 = i12;
        }
        float f6 = f2 / f3;
        if (i5 != 0) {
            f4 = iAbs6;
            f5 = i11;
        } else {
            f4 = iAbs4;
            f5 = i12;
        }
        float f7 = f4 / f5;
        AbstractC0040p abstractC0040p = this.f519q;
        overScroller.startScroll(left, top, i6, i7, (int) ((m673e(i7, i5, abstractC0040p.mo120A()) * f7) + (m673e(i6, i4, abstractC0040p.mo136z(view)) * f6)));
        m681m(2);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m677i(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m669a();
        }
        if (this.f514l == null) {
            this.f514l = VelocityTracker.obtain();
        }
        this.f514l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM675g = m675g((int) x, (int) y);
            m679k(x, y, pointerId);
            m684p(viewM675g, pointerId);
            int i3 = this.f510h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f503a == 1) {
                m678j();
            }
            m669a();
            return;
        }
        AbstractC0040p abstractC0040p = this.f519q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f503a == 1) {
                    this.f521s = true;
                    abstractC0040p.mo126N(this.f520r, 0.0f, 0.0f);
                    this.f521s = false;
                    if (this.f503a == 1) {
                        m681m(0);
                    }
                }
                m669a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m679k(x2, y2, pointerId2);
                if (this.f503a == 0) {
                    m684p(m675g((int) x2, (int) y2), pointerId2);
                    int i4 = this.f510h[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.f520r;
                if ((view != null ? (i5 < view.getLeft() || i5 >= view.getRight() || i6 < view.getTop() || i6 >= view.getBottom()) ? 0 : 1 : 0) != 0) {
                    m684p(this.f520r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f503a == 1 && pointerId3 == this.f505c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i >= pointerCount) {
                        i2 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i);
                    if (pointerId4 != this.f505c) {
                        View viewM675g2 = m675g((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                        View view2 = this.f520r;
                        if (viewM675g2 == view2 && m684p(view2, pointerId4)) {
                            i2 = this.f505c;
                            break;
                        }
                    }
                    i++;
                }
                if (i2 == -1) {
                    m678j();
                }
            }
            m672d(pointerId3);
            return;
        }
        if (this.f503a == 1) {
            int i7 = this.f505c;
            if (((this.f513k & (1 << i7)) == 0 ? 0 : 1) == 0) {
                return;
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(i7);
            float x3 = motionEvent.getX(iFindPointerIndex);
            float y3 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f508f;
            int i8 = this.f505c;
            int i9 = (int) (x3 - fArr[i8]);
            int i10 = (int) (y3 - this.f509g[i8]);
            int left = this.f520r.getLeft() + i9;
            int top = this.f520r.getTop() + i10;
            int left2 = this.f520r.getLeft();
            int top2 = this.f520r.getTop();
            if (i9 != 0) {
                left = abstractC0040p.mo133k(this.f520r, left);
                Field field = AbstractC0080Q.f219a;
                this.f520r.offsetLeftAndRight(left - left2);
            }
            if (i10 != 0) {
                top = abstractC0040p.mo134l(this.f520r, top);
                Field field2 = AbstractC0080Q.f219a;
                this.f520r.offsetTopAndBottom(top - top2);
            }
            if (i9 != 0 || i10 != 0) {
                abstractC0040p.mo125M(this.f520r, left, top);
            }
            m680l(motionEvent);
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount2; i11++) {
            int pointerId5 = motionEvent.getPointerId(i11);
            if ((this.f513k & (1 << pointerId5)) != 0) {
                float x4 = motionEvent.getX(i11);
                float y4 = motionEvent.getY(i11);
                float f2 = x4 - this.f506d[pointerId5];
                float f3 = y4 - this.f507e[pointerId5];
                Math.abs(f2);
                Math.abs(f3);
                int i12 = this.f510h[pointerId5];
                Math.abs(f3);
                Math.abs(f2);
                int i13 = this.f510h[pointerId5];
                Math.abs(f2);
                Math.abs(f3);
                int i14 = this.f510h[pointerId5];
                Math.abs(f3);
                Math.abs(f2);
                int i15 = this.f510h[pointerId5];
                if (this.f503a == 1) {
                    break;
                }
                View viewM675g3 = m675g((int) x4, (int) y4);
                if (m671c(viewM675g3, f2, f3) && m684p(viewM675g3, pointerId5)) {
                    break;
                }
            }
        }
        m680l(motionEvent);
    }

    /* JADX INFO: renamed from: j */
    public final void m678j() {
        VelocityTracker velocityTracker = this.f514l;
        float f2 = this.f515m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.f514l.getXVelocity(this.f505c);
        float f3 = this.f516n;
        float fAbs = Math.abs(xVelocity);
        float f4 = 0.0f;
        if (fAbs < f3) {
            xVelocity = 0.0f;
        } else if (fAbs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f514l.getYVelocity(this.f505c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f3) {
            if (fAbs2 > f2) {
                if (yVelocity <= 0.0f) {
                    f2 = -f2;
                }
                f4 = f2;
            } else {
                f4 = yVelocity;
            }
        }
        this.f521s = true;
        this.f519q.mo126N(this.f520r, xVelocity, f4);
        this.f521s = false;
        if (this.f503a == 1) {
            m681m(0);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m679k(float f2, float f3, int i2) {
        float[] fArr = this.f506d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f507e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f508f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f509g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f510h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f511i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f512j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f506d = fArr2;
            this.f507e = fArr3;
            this.f508f = fArr4;
            this.f509g = fArr5;
            this.f510h = iArr;
            this.f511i = iArr2;
            this.f512j = iArr3;
        }
        float[] fArr9 = this.f506d;
        this.f508f[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.f507e;
        this.f509g[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.f510h;
        int i4 = (int) f2;
        int i5 = (int) f3;
        ViewGroup viewGroup = this.f522t;
        int left = viewGroup.getLeft();
        int i6 = this.f517o;
        int i7 = i4 < left + i6 ? 1 : 0;
        if (i5 < viewGroup.getTop() + i6) {
            i7 |= 4;
        }
        if (i4 > viewGroup.getRight() - i6) {
            i7 |= 2;
        }
        if (i5 > viewGroup.getBottom() - i6) {
            i7 |= 8;
        }
        iArr7[i2] = i7;
        this.f513k |= 1 << i2;
    }

    /* JADX INFO: renamed from: l */
    public final void m680l(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if ((this.f513k & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f508f[pointerId] = x;
                this.f509g[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m681m(int i2) {
        this.f522t.removeCallbacks(this.f523u);
        if (this.f503a != i2) {
            this.f503a = i2;
            this.f519q.mo124L(i2);
            if (this.f503a == 0) {
                this.f520r = null;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m682n(int i2, int i3) {
        if (this.f521s) {
            return m676h(i2, i3, (int) this.f514l.getXVelocity(this.f505c), (int) this.f514l.getYVelocity(this.f505c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m683o(MotionEvent motionEvent) {
        View viewM675g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m669a();
        }
        if (this.f514l == null) {
            this.f514l = VelocityTracker.obtain();
        }
        this.f514l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m679k(x, y, pointerId);
            View viewM675g2 = m675g((int) x, (int) y);
            if (viewM675g2 == this.f520r && this.f503a == 2) {
                m684p(viewM675g2, pointerId);
            }
            int i2 = this.f510h[pointerId];
        } else if (actionMasked == 1) {
            m669a();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x2 = motionEvent.getX(actionIndex);
                    float y2 = motionEvent.getY(actionIndex);
                    m679k(x2, y2, pointerId2);
                    int i3 = this.f503a;
                    if (i3 == 0) {
                        int i4 = this.f510h[pointerId2];
                    } else if (i3 == 2 && (viewM675g = m675g((int) x2, (int) y2)) == this.f520r) {
                        m684p(viewM675g, pointerId2);
                    }
                } else if (actionMasked == 6) {
                    m672d(motionEvent.getPointerId(actionIndex));
                }
            }
        } else if (this.f506d != null && this.f507e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i5 = 0; i5 < pointerCount; i5++) {
                int pointerId3 = motionEvent.getPointerId(i5);
                if ((this.f513k & (1 << pointerId3)) != 0) {
                    float x3 = motionEvent.getX(i5);
                    float y3 = motionEvent.getY(i5);
                    float f2 = x3 - this.f506d[pointerId3];
                    float f3 = y3 - this.f507e[pointerId3];
                    View viewM675g3 = m675g((int) x3, (int) y3);
                    boolean z2 = viewM675g3 != null && m671c(viewM675g3, f2, f3);
                    if (z2) {
                        int left = viewM675g3.getLeft();
                        AbstractC0040p abstractC0040p = this.f519q;
                        int iMo133k = abstractC0040p.mo133k(viewM675g3, ((int) f2) + left);
                        int top = viewM675g3.getTop();
                        int iMo134l = abstractC0040p.mo134l(viewM675g3, ((int) f3) + top);
                        int iMo136z = abstractC0040p.mo136z(viewM675g3);
                        int iMo120A = abstractC0040p.mo120A();
                        if ((iMo136z == 0 || (iMo136z > 0 && iMo133k == left)) && (iMo120A == 0 || (iMo120A > 0 && iMo134l == top))) {
                            break;
                        }
                        Math.abs(f2);
                        Math.abs(f3);
                        int i6 = this.f510h[pointerId3];
                        Math.abs(f3);
                        Math.abs(f2);
                        int i7 = this.f510h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f3);
                        int i8 = this.f510h[pointerId3];
                        Math.abs(f3);
                        Math.abs(f2);
                        int i9 = this.f510h[pointerId3];
                        if (this.f503a == 1 || (z2 && m684p(viewM675g3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m680l(motionEvent);
        }
        return this.f503a == 1;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m684p(View view, int i2) {
        if (view == this.f520r && this.f505c == i2) {
            return true;
        }
        if (view == null || !this.f519q.mo131d0(view, i2)) {
            return false;
        }
        this.f505c = i2;
        m670b(view, i2);
        return true;
    }
}
