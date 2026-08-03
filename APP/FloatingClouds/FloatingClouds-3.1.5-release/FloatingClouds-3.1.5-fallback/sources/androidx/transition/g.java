package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.P1 f1028a = null;
    public static final java.lang.ThreadLocal<java.lang.ref.WeakReference<a.J1<android.view.ViewGroup, java.util.ArrayList<androidx.transition.e>>>> b = null;
    public static final java.util.ArrayList<android.view.ViewGroup> c = null;

    public static class a implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.transition.e f1029a;
        public android.widget.FrameLayout b;

        /* JADX INFO: renamed from: androidx.transition.g$a$a, reason: collision with other inner class name */
        public class C0027a extends androidx.transition.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.J1 f1030a;
            public final /* synthetic */ androidx.transition.g.a b;

            public C0027a(androidx.transition.g.a r1, a.J1 r2) {
                    r0 = this;
                    r0.<init>()
                    r0.b = r1
                    r0.f1030a = r2
                    return
            }

            @Override // androidx.transition.f, androidx.transition.e.f
            public final void f(androidx.transition.e r4) {
                    r3 = this;
                    androidx.transition.g$a r0 = r3.b
                    android.widget.FrameLayout r0 = r0.b
                    a.J1 r1 = r3.f1030a
                    r2 = 0
                    java.lang.Object r0 = r1.getOrDefault(r0, r2)
                    java.util.ArrayList r0 = (java.util.ArrayList) r0
                    r0.remove(r4)
                    r4.y(r3)
                    return
            }
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
                r19 = this;
                r0 = r19
                android.widget.FrameLayout r1 = r0.b
                android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
                r2.removeOnPreDrawListener(r0)
                r1.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = androidx.transition.g.c
                android.widget.FrameLayout r3 = r0.b
                boolean r1 = r1.remove(r3)
                r8 = 1
                if (r1 != 0) goto L1a
                return r8
            L1a:
                a.J1 r1 = androidx.transition.g.b()
                r2 = 0
                java.lang.Object r4 = r1.getOrDefault(r3, r2)
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                if (r4 != 0) goto L31
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r1.put(r3, r4)
            L2f:
                r5 = r2
                goto L3c
            L31:
                int r5 = r4.size()
                if (r5 <= 0) goto L2f
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r4)
            L3c:
                androidx.transition.e r6 = r0.f1029a
                r4.add(r6)
                androidx.transition.g$a$a r4 = new androidx.transition.g$a$a
                r4.<init>(r0, r1)
                r6.a(r4)
                r1 = 0
                r6.h(r3, r1)
                if (r5 == 0) goto L63
                java.util.Iterator r4 = r5.iterator()
            L53:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L63
                java.lang.Object r5 = r4.next()
                androidx.transition.e r5 = (androidx.transition.e) r5
                r5.z(r3)
                goto L53
            L63:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r6.k = r4
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r6.l = r4
                a.A2 r4 = r6.g
                a.A2 r5 = r6.h
                a.J1 r7 = new a.J1
                java.lang.Object r9 = r4.f7a
                a.J1 r9 = (a.J1) r9
                r7.<init>(r9)
                a.J1 r9 = new a.J1
                java.lang.Object r10 = r5.f7a
                a.J1 r10 = (a.J1) r10
                r9.<init>(r10)
                r10 = r1
            L88:
                int[] r11 = r6.j
                int r12 = r11.length
                if (r10 >= r12) goto L1ff
                r11 = r11[r10]
                if (r11 == r8) goto L1ba
                r12 = 2
                if (r11 == r12) goto L166
                r12 = 3
                if (r11 == r12) goto L10c
                r12 = 4
                if (r11 == r12) goto L9f
            L9a:
                r16 = r8
                r15 = r9
                goto L1f4
            L9f:
                java.lang.Object r11 = r4.c
                a.U9 r11 = (a.U9) r11
                int r12 = r11.e()
                r13 = r1
            La8:
                if (r13 >= r12) goto L9a
                java.lang.Object r14 = r11.f(r13)
                android.view.View r14 = (android.view.View) r14
                if (r14 == 0) goto L101
                boolean r15 = r6.u(r14)
                if (r15 == 0) goto L101
                boolean r15 = r11.f290a
                if (r15 == 0) goto Lbf
                r11.b()
            Lbf:
                long[] r15 = r11.b
                r16 = r8
                r17 = r9
                r8 = r15[r13]
                java.lang.Object r15 = r5.c
                a.U9 r15 = (a.U9) r15
                java.lang.Object r8 = r15.c(r8, r2)
                android.view.View r8 = (android.view.View) r8
                if (r8 == 0) goto Lfe
                boolean r9 = r6.u(r8)
                if (r9 == 0) goto Lfe
                java.lang.Object r9 = r7.getOrDefault(r14, r2)
                a.Ff r9 = (a.Ff) r9
                r15 = r17
                java.lang.Object r17 = r15.getOrDefault(r8, r2)
                r1 = r17
                a.Ff r1 = (a.Ff) r1
                if (r9 == 0) goto L104
                if (r1 == 0) goto L104
                java.util.ArrayList<a.Ff> r2 = r6.k
                r2.add(r9)
                java.util.ArrayList<a.Ff> r2 = r6.l
                r2.add(r1)
                r7.remove(r14)
                r15.remove(r8)
                goto L104
            Lfe:
                r15 = r17
                goto L104
            L101:
                r16 = r8
                r15 = r9
            L104:
                int r13 = r13 + 1
                r9 = r15
                r8 = r16
                r1 = 0
                r2 = 0
                goto La8
            L10c:
                r16 = r8
                r15 = r9
                java.lang.Object r1 = r4.b
                android.util.SparseArray r1 = (android.util.SparseArray) r1
                java.lang.Object r2 = r5.b
                android.util.SparseArray r2 = (android.util.SparseArray) r2
                int r8 = r1.size()
                r9 = 0
            L11c:
                if (r9 >= r8) goto L1f4
                java.lang.Object r11 = r1.valueAt(r9)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L161
                boolean r12 = r6.u(r11)
                if (r12 == 0) goto L161
                int r12 = r1.keyAt(r9)
                java.lang.Object r12 = r2.get(r12)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L161
                boolean r13 = r6.u(r12)
                if (r13 == 0) goto L161
                r13 = 0
                java.lang.Object r14 = r7.getOrDefault(r11, r13)
                a.Ff r14 = (a.Ff) r14
                java.lang.Object r18 = r15.getOrDefault(r12, r13)
                r13 = r18
                a.Ff r13 = (a.Ff) r13
                if (r14 == 0) goto L161
                if (r13 == 0) goto L161
                java.util.ArrayList<a.Ff> r0 = r6.k
                r0.add(r14)
                java.util.ArrayList<a.Ff> r0 = r6.l
                r0.add(r13)
                r7.remove(r11)
                r15.remove(r12)
            L161:
                int r9 = r9 + 1
                r0 = r19
                goto L11c
            L166:
                r16 = r8
                r15 = r9
                java.lang.Object r0 = r4.d
                a.J1 r0 = (a.J1) r0
                int r1 = r0.c
                r2 = 0
            L170:
                if (r2 >= r1) goto L1f4
                java.lang.Object r8 = r0.j(r2)
                android.view.View r8 = (android.view.View) r8
                if (r8 == 0) goto L1b7
                boolean r9 = r6.u(r8)
                if (r9 == 0) goto L1b7
                java.lang.Object r9 = r0.h(r2)
                java.lang.Object r11 = r5.d
                a.J1 r11 = (a.J1) r11
                r13 = 0
                java.lang.Object r9 = r11.getOrDefault(r9, r13)
                android.view.View r9 = (android.view.View) r9
                if (r9 == 0) goto L1b7
                boolean r11 = r6.u(r9)
                if (r11 == 0) goto L1b7
                java.lang.Object r11 = r7.getOrDefault(r8, r13)
                a.Ff r11 = (a.Ff) r11
                java.lang.Object r12 = r15.getOrDefault(r9, r13)
                a.Ff r12 = (a.Ff) r12
                if (r11 == 0) goto L1b7
                if (r12 == 0) goto L1b7
                java.util.ArrayList<a.Ff> r13 = r6.k
                r13.add(r11)
                java.util.ArrayList<a.Ff> r11 = r6.l
                r11.add(r12)
                r7.remove(r8)
                r15.remove(r9)
            L1b7:
                int r2 = r2 + 1
                goto L170
            L1ba:
                r16 = r8
                r15 = r9
                int r0 = r7.c
                int r0 = r0 + (-1)
            L1c1:
                if (r0 < 0) goto L1f4
                java.lang.Object r1 = r7.h(r0)
                android.view.View r1 = (android.view.View) r1
                if (r1 == 0) goto L1f1
                boolean r2 = r6.u(r1)
                if (r2 == 0) goto L1f1
                java.lang.Object r1 = r15.remove(r1)
                a.Ff r1 = (a.Ff) r1
                if (r1 == 0) goto L1f1
                android.view.View r2 = r1.b
                boolean r2 = r6.u(r2)
                if (r2 == 0) goto L1f1
                java.lang.Object r2 = r7.i(r0)
                a.Ff r2 = (a.Ff) r2
                java.util.ArrayList<a.Ff> r8 = r6.k
                r8.add(r2)
                java.util.ArrayList<a.Ff> r2 = r6.l
                r2.add(r1)
            L1f1:
                int r0 = r0 + (-1)
                goto L1c1
            L1f4:
                int r10 = r10 + 1
                r0 = r19
                r9 = r15
                r8 = r16
                r1 = 0
                r2 = 0
                goto L88
            L1ff:
                r16 = r8
                r15 = r9
                r0 = 0
            L203:
                int r1 = r7.c
                if (r0 >= r1) goto L223
                java.lang.Object r1 = r7.j(r0)
                a.Ff r1 = (a.Ff) r1
                android.view.View r2 = r1.b
                boolean r2 = r6.u(r2)
                if (r2 == 0) goto L220
                java.util.ArrayList<a.Ff> r2 = r6.k
                r2.add(r1)
                java.util.ArrayList<a.Ff> r1 = r6.l
                r13 = 0
                r1.add(r13)
            L220:
                int r0 = r0 + 1
                goto L203
            L223:
                r1 = 0
            L224:
                int r0 = r15.c
                if (r1 >= r0) goto L244
                java.lang.Object r0 = r15.j(r1)
                a.Ff r0 = (a.Ff) r0
                android.view.View r2 = r0.b
                boolean r2 = r6.u(r2)
                if (r2 == 0) goto L241
                java.util.ArrayList<a.Ff> r2 = r6.l
                r2.add(r0)
                java.util.ArrayList<a.Ff> r0 = r6.k
                r13 = 0
                r0.add(r13)
            L241:
                int r1 = r1 + 1
                goto L224
            L244:
                a.J1 r0 = androidx.transition.e.p()
                int r1 = r0.c
                android.view.WindowId r2 = r3.getWindowId()
                int r1 = r1 + (-1)
            L250:
                if (r1 < 0) goto L2bd
                java.lang.Object r4 = r0.h(r1)
                android.animation.Animator r4 = (android.animation.Animator) r4
                if (r4 == 0) goto L2b7
                r13 = 0
                java.lang.Object r5 = r0.getOrDefault(r4, r13)
                androidx.transition.e$b r5 = (androidx.transition.e.b) r5
                if (r5 == 0) goto L2b7
                android.view.View r7 = r5.f1025a
                if (r7 == 0) goto L2b7
                android.view.WindowId r8 = r5.d
                boolean r8 = r2.equals(r8)
                if (r8 == 0) goto L2b7
                r8 = r16
                a.Ff r9 = r6.r(r7, r8)
                a.Ff r10 = r6.n(r7, r8)
                if (r9 != 0) goto L28c
                if (r10 != 0) goto L28c
                a.A2 r8 = r6.h
                java.lang.Object r8 = r8.f7a
                a.J1 r8 = (a.J1) r8
                r13 = 0
                java.lang.Object r7 = r8.getOrDefault(r7, r13)
                r10 = r7
                a.Ff r10 = (a.Ff) r10
                goto L28d
            L28c:
                r13 = 0
            L28d:
                if (r9 != 0) goto L291
                if (r10 == 0) goto L2b8
            L291:
                a.Ff r7 = r5.c
                androidx.transition.e r5 = r5.e
                boolean r7 = r5.t(r7, r10)
                if (r7 == 0) goto L2b8
                androidx.transition.e r5 = r5.o()
                r5.getClass()
                boolean r5 = r4.isRunning()
                if (r5 != 0) goto L2b3
                boolean r5 = r4.isStarted()
                if (r5 == 0) goto L2af
                goto L2b3
            L2af:
                r0.remove(r4)
                goto L2b8
            L2b3:
                r4.cancel()
                goto L2b8
            L2b7:
                r13 = 0
            L2b8:
                int r1 = r1 + (-1)
                r16 = 1
                goto L250
            L2bd:
                a.A2 r4 = r6.g
                a.A2 r5 = r6.h
                java.util.ArrayList<a.Ff> r0 = r6.k
                java.util.ArrayList<a.Ff> r7 = r6.l
                r2 = r6
                r6 = r0
                r2.l(r3, r4, r5, r6, r7)
                r2.A()
                r16 = 1
                return r16
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(android.view.View r3) {
                r2 = this;
                android.widget.FrameLayout r3 = r2.b
                android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()
                r0.removeOnPreDrawListener(r2)
                r3.removeOnAttachStateChangeListener(r2)
                java.util.ArrayList<android.view.ViewGroup> r3 = androidx.transition.g.c
                android.widget.FrameLayout r0 = r2.b
                r3.remove(r0)
                a.J1 r3 = androidx.transition.g.b()
                r1 = 0
                java.lang.Object r3 = r3.getOrDefault(r0, r1)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                if (r3 == 0) goto L3a
                int r1 = r3.size()
                if (r1 <= 0) goto L3a
                java.util.Iterator r3 = r3.iterator()
            L2a:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L3a
                java.lang.Object r1 = r3.next()
                androidx.transition.e r1 = (androidx.transition.e) r1
                r1.z(r0)
                goto L2a
            L3a:
                androidx.transition.e r3 = r2.f1029a
                r0 = 1
                r3.i(r0)
                return
        }
    }

    static {
            a.P1 r0 = new a.P1
            r0.<init>()
            r1 = 0
            r0.D = r1
            androidx.transition.c r1 = new androidx.transition.c
            r2 = 2
            r1.<init>(r2)
            r0.K(r1)
            androidx.transition.a r1 = new androidx.transition.a
            r1.<init>()
            r0.K(r1)
            androidx.transition.c r1 = new androidx.transition.c
            r2 = 1
            r1.<init>(r2)
            r0.K(r1)
            androidx.transition.g.f1028a = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.transition.g.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.transition.g.c = r0
            return
    }

    public static void a(android.widget.FrameLayout r3, androidx.transition.e r4) {
            java.util.ArrayList<android.view.ViewGroup> r0 = androidx.transition.g.c
            boolean r1 = r0.contains(r3)
            if (r1 != 0) goto L68
            boolean r1 = r3.isLaidOut()
            if (r1 == 0) goto L68
            r0.add(r3)
            if (r4 != 0) goto L15
            a.P1 r4 = androidx.transition.g.f1028a
        L15:
            androidx.transition.e r4 = r4.j()
            a.J1 r0 = b()
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r3, r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L40
            int r2 = r0.size()
            if (r2 <= 0) goto L40
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r0.next()
            androidx.transition.e r2 = (androidx.transition.e) r2
            r2.w(r3)
            goto L30
        L40:
            r0 = 1
            r4.h(r3, r0)
            int r0 = androidx.transition.R.id.transition_current_scene
            java.lang.Object r0 = r3.getTag(r0)
            androidx.transition.d r0 = (androidx.transition.d) r0
            if (r0 != 0) goto L67
            int r0 = androidx.transition.R.id.transition_current_scene
            r3.setTag(r0, r1)
            androidx.transition.g$a r0 = new androidx.transition.g$a
            r0.<init>()
            r0.f1029a = r4
            r0.b = r3
            r3.addOnAttachStateChangeListener(r0)
            android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
            r3.addOnPreDrawListener(r0)
            return
        L67:
            throw r1
        L68:
            return
    }

    public static a.J1<android.view.ViewGroup, java.util.ArrayList<androidx.transition.e>> b() {
            java.lang.ThreadLocal<java.lang.ref.WeakReference<a.J1<android.view.ViewGroup, java.util.ArrayList<androidx.transition.e>>>> r0 = androidx.transition.g.b
            java.lang.Object r1 = r0.get()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L13
            java.lang.Object r1 = r1.get()
            a.J1 r1 = (a.J1) r1
            if (r1 == 0) goto L13
            return r1
        L13:
            a.J1 r1 = new a.J1
            r1.<init>()
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.set(r2)
            return r1
    }
}
