package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class V6 implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f302a;
    public final int b;
    public final int c;
    public final android.view.View d;
    public a.V6.a e;
    public a.V6.b f;
    public boolean g;
    public int h;
    public final int[] i;

    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.V6 f303a;

        public a(a.V6 r1) {
                r0 = this;
                r0.<init>()
                r0.f303a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                a.V6 r0 = r2.f303a
                android.view.View r0 = r0.d
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto Le
                r1 = 1
                r0.requestDisallowInterceptTouchEvent(r1)
            Le:
                return
        }
    }

    public class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.V6 f304a;

        public b(a.V6 r1) {
                r0 = this;
                r0.<init>()
                r0.f304a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r12 = this;
                a.V6 r0 = r12.f304a
                r0.a()
                android.view.View r1 = r0.d
                boolean r2 = r1.isEnabled()
                if (r2 == 0) goto L38
                boolean r2 = r1.isLongClickable()
                if (r2 == 0) goto L14
                goto L38
            L14:
                boolean r2 = r0.c()
                if (r2 != 0) goto L1b
                goto L38
            L1b:
                android.view.ViewParent r2 = r1.getParent()
                r3 = 1
                r2.requestDisallowInterceptTouchEvent(r3)
                long r4 = android.os.SystemClock.uptimeMillis()
                r8 = 3
                r9 = 0
                r10 = 0
                r11 = 0
                r6 = r4
                android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
                r1.onTouchEvent(r2)
                r2.recycle()
                r0.g = r3
            L38:
                return
        }
    }

    public V6(android.view.View r3) {
            r2 = this;
            r2.<init>()
            r0 = 2
            int[] r1 = new int[r0]
            r2.i = r1
            r2.d = r3
            r1 = 1
            r3.setLongClickable(r1)
            r3.addOnAttachStateChangeListener(r2)
            android.content.Context r3 = r3.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledTouchSlop()
            float r3 = (float) r3
            r2.f302a = r3
            int r3 = android.view.ViewConfiguration.getTapTimeout()
            r2.b = r3
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            int r1 = r1 + r3
            int r1 = r1 / r0
            r2.c = r1
            return
    }

    public final void a() {
            r2 = this;
            a.V6$b r0 = r2.f
            android.view.View r1 = r2.d
            if (r0 == 0) goto L9
            r1.removeCallbacks(r0)
        L9:
            a.V6$a r0 = r2.e
            if (r0 == 0) goto L10
            r1.removeCallbacks(r0)
        L10:
            return
    }

    public abstract a.InterfaceC0108de b();

    public abstract boolean c();

    public boolean d() {
            r2 = this;
            a.de r0 = r2.b()
            if (r0 == 0) goto Lf
            boolean r1 = r0.b()
            if (r1 == 0) goto Lf
            r0.dismiss()
        Lf:
            r0 = 1
            return r0
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
            r12 = this;
            boolean r13 = r12.g
            android.view.View r0 = r12.d
            r1 = 3
            r2 = 1
            r3 = 0
            if (r13 == 0) goto L68
            a.de r4 = r12.b()
            if (r4 == 0) goto L5c
            boolean r5 = r4.b()
            if (r5 != 0) goto L16
            goto L5c
        L16:
            a.A5 r4 = r4.k()
            if (r4 == 0) goto L5c
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L23
            goto L5c
        L23:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r14)
            int[] r6 = r12.i
            r0.getLocationOnScreen(r6)
            r0 = r6[r3]
            float r0 = (float) r0
            r7 = r6[r2]
            float r7 = (float) r7
            r5.offsetLocation(r0, r7)
            r4.getLocationOnScreen(r6)
            r0 = r6[r3]
            int r0 = -r0
            float r0 = (float) r0
            r6 = r6[r2]
            int r6 = -r6
            float r6 = (float) r6
            r5.offsetLocation(r0, r6)
            int r0 = r12.h
            boolean r0 = r4.b(r5, r0)
            r5.recycle()
            int r14 = r14.getActionMasked()
            if (r14 == r2) goto L56
            if (r14 == r1) goto L56
            r14 = r2
            goto L57
        L56:
            r14 = r3
        L57:
            if (r0 == 0) goto L5c
            if (r14 == 0) goto L5c
            goto L62
        L5c:
            boolean r14 = r12.d()
            if (r14 != 0) goto L65
        L62:
            r14 = r2
            goto L111
        L65:
            r14 = r3
            goto L111
        L68:
            boolean r4 = r0.isEnabled()
            if (r4 != 0) goto L70
            goto Lfb
        L70:
            int r4 = r14.getActionMasked()
            if (r4 == 0) goto Lcf
            if (r4 == r2) goto Lcb
            r5 = 2
            if (r4 == r5) goto L7f
            if (r4 == r1) goto Lcb
            goto Lfb
        L7f:
            int r1 = r12.h
            int r1 = r14.findPointerIndex(r1)
            if (r1 < 0) goto Lfb
            float r4 = r14.getX(r1)
            float r14 = r14.getY(r1)
            float r1 = r12.f302a
            float r5 = -r1
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto Lb9
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 < 0) goto Lb9
            int r5 = r0.getRight()
            int r6 = r0.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r1
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto Lb9
            int r4 = r0.getBottom()
            int r5 = r0.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r1
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto Lb9
            goto Lfb
        Lb9:
            r12.a()
            android.view.ViewParent r14 = r0.getParent()
            r14.requestDisallowInterceptTouchEvent(r2)
            boolean r14 = r12.c()
            if (r14 == 0) goto Lfb
            r14 = r2
            goto Lfc
        Lcb:
            r12.a()
            goto Lfb
        Lcf:
            int r14 = r14.getPointerId(r3)
            r12.h = r14
            a.V6$a r14 = r12.e
            if (r14 != 0) goto Le0
            a.V6$a r14 = new a.V6$a
            r14.<init>(r12)
            r12.e = r14
        Le0:
            a.V6$a r14 = r12.e
            int r1 = r12.b
            long r4 = (long) r1
            r0.postDelayed(r14, r4)
            a.V6$b r14 = r12.f
            if (r14 != 0) goto Lf3
            a.V6$b r14 = new a.V6$b
            r14.<init>(r12)
            r12.f = r14
        Lf3:
            a.V6$b r14 = r12.f
            int r1 = r12.c
            long r4 = (long) r1
            r0.postDelayed(r14, r4)
        Lfb:
            r14 = r3
        Lfc:
            if (r14 == 0) goto L111
            long r4 = android.os.SystemClock.uptimeMillis()
            r8 = 3
            r9 = 0
            r10 = 0
            r11 = 0
            r6 = r4
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            r0.onTouchEvent(r1)
            r1.recycle()
        L111:
            r12.g = r14
            if (r14 != 0) goto L119
            if (r13 == 0) goto L118
            goto L119
        L118:
            return r3
        L119:
            return r2
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            r2 = 0
            r1.g = r2
            r2 = -1
            r1.h = r2
            a.V6$a r2 = r1.e
            if (r2 == 0) goto Lf
            android.view.View r0 = r1.d
            r0.removeCallbacks(r2)
        Lf:
            return
    }
}
