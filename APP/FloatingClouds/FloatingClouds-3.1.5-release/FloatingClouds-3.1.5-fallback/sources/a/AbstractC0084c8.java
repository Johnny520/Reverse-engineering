package a;

import android.view.View;

/* JADX INFO: renamed from: a.c8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0084c8<V extends android.view.View> extends a.Hg<V> {
    public a.AbstractC0084c8.a c;
    public android.widget.OverScroller d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public android.view.VelocityTracker i;

    /* JADX INFO: renamed from: a.c8$a */
    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.coordinatorlayout.widget.CoordinatorLayout f420a;
        public final V b;
        public final /* synthetic */ a.AbstractC0084c8 c;

        public a(a.AbstractC0084c8 r1, androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                r0.f420a = r2
                r0.b = r3
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                V extends android.view.View r0 = r4.b
                if (r0 == 0) goto L24
                a.c8 r1 = r4.c
                android.widget.OverScroller r2 = r1.d
                if (r2 == 0) goto L24
                boolean r2 = r2.computeScrollOffset()
                androidx.coordinatorlayout.widget.CoordinatorLayout r3 = r4.f420a
                if (r2 == 0) goto L21
                android.widget.OverScroller r2 = r1.d
                int r2 = r2.getCurrY()
                r1.A(r3, r0, r2)
                java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                r0.postOnAnimation(r4)
                return
            L21:
                r1.y(r3, r0)
            L24:
                return
        }
    }

    public AbstractC0084c8() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f = r0
            r1.h = r0
            return
    }

    public AbstractC0084c8(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -1
            r0.f = r1
            r0.h = r1
            return
    }

    public final void A(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, int r9) {
            r6 = this;
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.z(r1, r2, r3, r4, r5)
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, android.view.MotionEvent r9) {
            r6 = this;
            int r0 = r6.h
            if (r0 >= 0) goto L12
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.h = r0
        L12:
            int r0 = r9.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L40
            boolean r0 = r6.e
            if (r0 == 0) goto L40
            int r0 = r6.f
            if (r0 != r3) goto L25
            goto L8e
        L25:
            int r0 = r9.findPointerIndex(r0)
            if (r0 != r3) goto L2c
            goto L8e
        L2c:
            float r0 = r9.getY(r0)
            int r0 = (int) r0
            int r1 = r6.g
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r6.h
            if (r1 <= r5) goto L40
            r6.g = r0
            return r2
        L40:
            int r0 = r9.getActionMasked()
            if (r0 != 0) goto L87
            r6.f = r3
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            boolean r3 = r6.v(r8)
            if (r3 == 0) goto L60
            boolean r7 = r7.l(r8, r0, r1)
            if (r7 == 0) goto L60
            r7 = r2
            goto L61
        L60:
            r7 = r4
        L61:
            r6.e = r7
            if (r7 == 0) goto L87
            r6.g = r1
            int r7 = r9.getPointerId(r4)
            r6.f = r7
            android.view.VelocityTracker r7 = r6.i
            if (r7 != 0) goto L77
            android.view.VelocityTracker r7 = android.view.VelocityTracker.obtain()
            r6.i = r7
        L77:
            android.widget.OverScroller r7 = r6.d
            if (r7 == 0) goto L87
            boolean r7 = r7.isFinished()
            if (r7 != 0) goto L87
            android.widget.OverScroller r7 = r6.d
            r7.abortAnimation()
            return r2
        L87:
            android.view.VelocityTracker r7 = r6.i
            if (r7 == 0) goto L8e
            r7.addMovement(r9)
        L8e:
            return r4
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r19, V r20, android.view.MotionEvent r21) {
            r18 = this;
            r0 = r18
            r2 = r20
            r6 = r21
            int r1 = r6.getActionMasked()
            r3 = 0
            r4 = -1
            r7 = 1
            r8 = 0
            if (r1 == r7) goto L5b
            r5 = 2
            if (r1 == r5) goto L34
            r2 = 3
            if (r1 == r2) goto Lc1
            r2 = 6
            if (r1 == r2) goto L1a
            goto L58
        L1a:
            int r1 = r6.getActionIndex()
            if (r1 != 0) goto L22
            r1 = r7
            goto L23
        L22:
            r1 = r8
        L23:
            int r2 = r6.getPointerId(r1)
            r0.f = r2
            float r1 = r6.getY(r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.g = r1
            goto L58
        L34:
            int r1 = r0.f
            int r1 = r6.findPointerIndex(r1)
            if (r1 != r4) goto L3e
            goto Ldd
        L3e:
            float r1 = r6.getY(r1)
            int r1 = (int) r1
            int r3 = r0.g
            int r3 = r3 - r1
            r0.g = r1
            int r4 = r0.w(r2)
            int r1 = r0.t()
            int r3 = r1 - r3
            r5 = 0
            r1 = r19
            r0.z(r1, r2, r3, r4, r5)
        L58:
            r1 = r8
            goto Lcf
        L5b:
            android.view.VelocityTracker r1 = r0.i
            if (r1 == 0) goto Lc1
            r1.addMovement(r6)
            android.view.VelocityTracker r1 = r0.i
            r5 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r5)
            android.view.VelocityTracker r1 = r0.i
            int r5 = r0.f
            float r1 = r1.getYVelocity(r5)
            int r5 = r0.x(r2)
            int r5 = -r5
            a.c8$a r9 = r0.c
            if (r9 == 0) goto L7f
            r2.removeCallbacks(r9)
            r0.c = r3
        L7f:
            android.widget.OverScroller r9 = r0.d
            if (r9 != 0) goto L8e
            android.widget.OverScroller r9 = new android.widget.OverScroller
            android.content.Context r10 = r2.getContext()
            r9.<init>(r10)
            r0.d = r9
        L8e:
            android.widget.OverScroller r9 = r0.d
            int r11 = r0.s()
            int r13 = java.lang.Math.round(r1)
            r15 = 0
            r17 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = r5
            r9.fling(r10, r11, r12, r13, r14, r15, r16, r17)
            android.widget.OverScroller r1 = r0.d
            boolean r1 = r1.computeScrollOffset()
            if (r1 == 0) goto Lba
            a.c8$a r1 = new a.c8$a
            r5 = r19
            r1.<init>(r0, r5, r2)
            r0.c = r1
            java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
            r2.postOnAnimation(r1)
            goto Lbf
        Lba:
            r5 = r19
            r18.y(r19, r20)
        Lbf:
            r1 = r7
            goto Lc2
        Lc1:
            r1 = r8
        Lc2:
            r0.e = r8
            r0.f = r4
            android.view.VelocityTracker r2 = r0.i
            if (r2 == 0) goto Lcf
            r2.recycle()
            r0.i = r3
        Lcf:
            android.view.VelocityTracker r2 = r0.i
            if (r2 == 0) goto Ld6
            r2.addMovement(r6)
        Ld6:
            boolean r2 = r0.e
            if (r2 != 0) goto Lde
            if (r1 == 0) goto Ldd
            goto Lde
        Ldd:
            return r8
        Lde:
            return r7
    }

    public boolean v(V r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public int w(V r1) {
            r0 = this;
            int r1 = r1.getHeight()
            int r1 = -r1
            return r1
    }

    public int x(V r1) {
            r0 = this;
            int r1 = r1.getHeight()
            return r1
    }

    public void y(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2) {
            r0 = this;
            return
    }

    public int z(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = r0.s()
            if (r4 == 0) goto L22
            if (r1 < r4) goto L22
            if (r1 > r5) goto L22
            int r2 = a.C0282n9.j(r3, r4, r5)
            if (r1 == r2) goto L22
            a.Qe r3 = r0.f117a
            if (r3 == 0) goto L1e
            int r4 = r3.c
            if (r4 == r2) goto L20
            r3.c = r2
            r3.b()
            goto L20
        L1e:
            r0.b = r2
        L20:
            int r1 = r1 - r2
            return r1
        L22:
            r1 = 0
            return r1
    }
}
