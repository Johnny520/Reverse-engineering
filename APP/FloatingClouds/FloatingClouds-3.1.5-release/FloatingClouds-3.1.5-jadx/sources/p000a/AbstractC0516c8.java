package p000a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0516c8<V extends View> extends C0145Hg<V> {

    /* JADX INFO: renamed from: c */
    public a f1881c;

    /* JADX INFO: renamed from: d */
    public OverScroller f1882d;

    /* JADX INFO: renamed from: e */
    public boolean f1883e;

    /* JADX INFO: renamed from: f */
    public int f1884f;

    /* JADX INFO: renamed from: g */
    public int f1885g;

    /* JADX INFO: renamed from: h */
    public int f1886h;

    /* JADX INFO: renamed from: i */
    public VelocityTracker f1887i;

    /* JADX INFO: renamed from: a.c8$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final CoordinatorLayout f1888a;

        /* JADX INFO: renamed from: b */
        public final V f1889b;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.f1888a = coordinatorLayout;
            this.f1889b = v;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC0516c8 abstractC0516c8;
            OverScroller overScroller;
            V v = this.f1889b;
            if (v == null || (overScroller = (abstractC0516c8 = AbstractC0516c8.this).f1882d) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.f1888a;
            if (!zComputeScrollOffset) {
                abstractC0516c8.mo1276y(coordinatorLayout, v);
                return;
            }
            abstractC0516c8.m1270A(coordinatorLayout, v, abstractC0516c8.f1882d.getCurrY());
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            v.postOnAnimation(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0516c8() {
        this.f1884f = -1;
        this.f1886h = -1;
    }

    /* JADX INFO: renamed from: A */
    public final void m1270A(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo1277z(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1271g(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int iFindPointerIndex;
        if (this.f1886h < 0) {
            this.f1886h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f1883e) {
            int i = this.f1884f;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y - this.f1885g) > this.f1886h) {
                    this.f1885g = y;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                }
                velocityTracker = this.f1887i;
                if (velocityTracker != null) {
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.f1884f = -1;
                int x = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                boolean z = mo1273v(v) && coordinatorLayout.m2446l(v, x, y2);
                this.f1883e = z;
                if (z) {
                    this.f1885g = y2;
                    this.f1884f = motionEvent.getPointerId(0);
                    if (this.f1887i == null) {
                        this.f1887i = VelocityTracker.obtain();
                    }
                    OverScroller overScroller = this.f1882d;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.f1882d.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.f1887i;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1272r(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1884f);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i = this.f1885g - y;
                    this.f1885g = y;
                    mo1277z(coordinatorLayout, v, mo373t() - i, mo1274w(v), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f1884f = motionEvent.getPointerId(i2);
                    this.f1885g = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.f1887i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f1883e || z;
        }
        VelocityTracker velocityTracker3 = this.f1887i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f1887i.computeCurrentVelocity(1000);
            float yVelocity = this.f1887i.getYVelocity(this.f1884f);
            int i3 = -mo1275x(v);
            Runnable runnable = this.f1881c;
            if (runnable != null) {
                v.removeCallbacks(runnable);
                this.f1881c = null;
            }
            if (this.f1882d == null) {
                this.f1882d = new OverScroller(v.getContext());
            }
            this.f1882d.fling(0, m372s(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (this.f1882d.computeScrollOffset()) {
                a aVar = new a(coordinatorLayout, v);
                this.f1881c = aVar;
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                v.postOnAnimation(aVar);
            } else {
                mo1276y(coordinatorLayout, v);
            }
            z = true;
        }
        this.f1883e = false;
        this.f1884f = -1;
        velocityTracker = this.f1887i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1887i = null;
        }
        velocityTracker2 = this.f1887i;
        if (velocityTracker2 != null) {
        }
        if (this.f1883e) {
        }
        z = false;
        this.f1883e = false;
        this.f1884f = -1;
        velocityTracker = this.f1887i;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.f1887i;
        if (velocityTracker2 != null) {
        }
        if (this.f1883e) {
        }
    }

    /* JADX INFO: renamed from: v */
    public boolean mo1273v(V v) {
        return false;
    }

    /* JADX INFO: renamed from: w */
    public int mo1274w(V v) {
        return -v.getHeight();
    }

    /* JADX INFO: renamed from: x */
    public int mo1275x(V v) {
        return v.getHeight();
    }

    /* JADX INFO: renamed from: y */
    public void mo1276y(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* JADX INFO: renamed from: z */
    public int mo1277z(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int iM1667j;
        int iM372s = m372s();
        if (i2 == 0 || iM372s < i2 || iM372s > i3 || iM372s == (iM1667j = C0726n9.m1667j(i, i2, i3))) {
            return 0;
        }
        C0305Qe c0305Qe = this.f503a;
        if (c0305Qe == null) {
            this.f504b = iM1667j;
        } else if (c0305Qe.f1104c != iM1667j) {
            c0305Qe.f1104c = iM1667j;
            c0305Qe.m850b();
        }
        return iM372s - iM1667j;
    }

    public AbstractC0516c8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1884f = -1;
        this.f1886h = -1;
    }
}
