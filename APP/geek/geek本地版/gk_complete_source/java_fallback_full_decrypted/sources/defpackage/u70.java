package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u70 implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
    public defpackage.r70 a;
    public android.view.ViewGroup b;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
            r19 = this;
            r0 = r19
            r70 r1 = r0.a
            android.view.ViewGroup r2 = r0.b
            android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()
            r3.removeOnPreDrawListener(r0)
            r2.removeOnAttachStateChangeListener(r0)
            java.util.ArrayList r3 = defpackage.v70.c
            boolean r3 = r3.remove(r2)
            r7 = 1
            if (r3 != 0) goto L1a
            return r7
        L1a:
            n6 r3 = defpackage.v70.b()
            r4 = 0
            java.lang.Object r5 = r3.getOrDefault(r2, r4)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 != 0) goto L31
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.put(r2, r5)
        L2f:
            r6 = r4
            goto L3c
        L31:
            int r6 = r5.size()
            if (r6 <= 0) goto L2f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
        L3c:
            r5.add(r1)
            t70 r5 = new t70
            r5.<init>(r0, r3)
            r1.a(r5)
            r3 = 0
            r1.g(r2, r3)
            if (r6 == 0) goto L60
            int r5 = r6.size()
            r8 = r3
        L52:
            if (r8 >= r5) goto L60
            java.lang.Object r9 = r6.get(r8)
            int r8 = r8 + 1
            r70 r9 = (defpackage.r70) r9
            r9.v(r2)
            goto L52
        L60:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.k = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.l = r5
            a8 r5 = r1.g
            a8 r6 = r1.h
            n6 r8 = new n6
            java.lang.Object r9 = r5.a
            n6 r9 = (defpackage.n6) r9
            r8.<init>(r9)
            n6 r9 = new n6
            java.lang.Object r10 = r6.a
            n6 r10 = (defpackage.n6) r10
            r9.<init>(r10)
            r10 = r3
        L85:
            int[] r11 = r1.j
            int r12 = r11.length
            if (r10 >= r12) goto L1fa
            r11 = r11[r10]
            if (r11 == r7) goto L1b5
            r12 = 2
            if (r11 == r12) goto L161
            r12 = 3
            if (r11 == r12) goto L10b
            r12 = 4
            if (r11 == r12) goto L9c
        L97:
            r17 = r7
            r7 = r8
            goto L1ef
        L9c:
            java.lang.Object r11 = r5.c
            bs r11 = (defpackage.bs) r11
            java.lang.Object r12 = r6.c
            bs r12 = (defpackage.bs) r12
            int r13 = r11.e()
            r14 = r3
        La9:
            if (r14 >= r13) goto L97
            java.lang.Object r15 = r11.f(r14)
            android.view.View r15 = (android.view.View) r15
            if (r15 == 0) goto Lfe
            boolean r16 = r1.r(r15)
            if (r16 == 0) goto Lfe
            boolean r3 = r11.a
            if (r3 == 0) goto Lc0
            r11.b()
        Lc0:
            long[] r3 = r11.b
            r17 = r7
            r18 = r8
            r7 = r3[r14]
            java.lang.Object r3 = r12.c(r7, r4)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto Lfb
            boolean r7 = r1.r(r3)
            if (r7 == 0) goto Lfb
            r7 = r18
            java.lang.Object r8 = r7.getOrDefault(r15, r4)
            x70 r8 = (defpackage.x70) r8
            java.lang.Object r18 = r9.getOrDefault(r3, r4)
            r4 = r18
            x70 r4 = (defpackage.x70) r4
            if (r8 == 0) goto L101
            if (r4 == 0) goto L101
            java.util.ArrayList r0 = r1.k
            r0.add(r8)
            java.util.ArrayList r0 = r1.l
            r0.add(r4)
            r7.remove(r15)
            r9.remove(r3)
            goto L101
        Lfb:
            r7 = r18
            goto L101
        Lfe:
            r17 = r7
            r7 = r8
        L101:
            int r14 = r14 + 1
            r0 = r19
            r8 = r7
            r7 = r17
            r3 = 0
            r4 = 0
            goto La9
        L10b:
            r17 = r7
            r7 = r8
            java.lang.Object r0 = r5.b
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r3 = r6.b
            android.util.SparseArray r3 = (android.util.SparseArray) r3
            int r4 = r0.size()
            r8 = 0
        L11b:
            if (r8 >= r4) goto L1ef
            java.lang.Object r11 = r0.valueAt(r8)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L15e
            boolean r12 = r1.r(r11)
            if (r12 == 0) goto L15e
            int r12 = r0.keyAt(r8)
            java.lang.Object r12 = r3.get(r12)
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L15e
            boolean r13 = r1.r(r12)
            if (r13 == 0) goto L15e
            r13 = 0
            java.lang.Object r14 = r7.getOrDefault(r11, r13)
            x70 r14 = (defpackage.x70) r14
            java.lang.Object r15 = r9.getOrDefault(r12, r13)
            x70 r15 = (defpackage.x70) r15
            if (r14 == 0) goto L15e
            if (r15 == 0) goto L15e
            java.util.ArrayList r13 = r1.k
            r13.add(r14)
            java.util.ArrayList r13 = r1.l
            r13.add(r15)
            r7.remove(r11)
            r9.remove(r12)
        L15e:
            int r8 = r8 + 1
            goto L11b
        L161:
            r17 = r7
            r7 = r8
            java.lang.Object r0 = r5.d
            n6 r0 = (defpackage.n6) r0
            java.lang.Object r3 = r6.d
            n6 r3 = (defpackage.n6) r3
            int r4 = r0.c
            r8 = 0
        L16f:
            if (r8 >= r4) goto L1ef
            java.lang.Object r11 = r0.j(r8)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L1b2
            boolean r12 = r1.r(r11)
            if (r12 == 0) goto L1b2
            java.lang.Object r12 = r0.h(r8)
            r13 = 0
            java.lang.Object r12 = r3.getOrDefault(r12, r13)
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L1b2
            boolean r14 = r1.r(r12)
            if (r14 == 0) goto L1b2
            java.lang.Object r14 = r7.getOrDefault(r11, r13)
            x70 r14 = (defpackage.x70) r14
            java.lang.Object r15 = r9.getOrDefault(r12, r13)
            x70 r15 = (defpackage.x70) r15
            if (r14 == 0) goto L1b2
            if (r15 == 0) goto L1b2
            java.util.ArrayList r13 = r1.k
            r13.add(r14)
            java.util.ArrayList r13 = r1.l
            r13.add(r15)
            r7.remove(r11)
            r9.remove(r12)
        L1b2:
            int r8 = r8 + 1
            goto L16f
        L1b5:
            r17 = r7
            r7 = r8
            int r0 = r7.c
            int r0 = r0 + (-1)
        L1bc:
            if (r0 < 0) goto L1ef
            java.lang.Object r3 = r7.h(r0)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L1ec
            boolean r4 = r1.r(r3)
            if (r4 == 0) goto L1ec
            java.lang.Object r3 = r9.remove(r3)
            x70 r3 = (defpackage.x70) r3
            if (r3 == 0) goto L1ec
            android.view.View r4 = r3.b
            boolean r4 = r1.r(r4)
            if (r4 == 0) goto L1ec
            java.lang.Object r4 = r7.i(r0)
            x70 r4 = (defpackage.x70) r4
            java.util.ArrayList r8 = r1.k
            r8.add(r4)
            java.util.ArrayList r4 = r1.l
            r4.add(r3)
        L1ec:
            int r0 = r0 + (-1)
            goto L1bc
        L1ef:
            int r10 = r10 + 1
            r0 = r19
            r8 = r7
            r7 = r17
            r3 = 0
            r4 = 0
            goto L85
        L1fa:
            r17 = r7
            r7 = r8
            r0 = 0
        L1fe:
            int r3 = r7.c
            if (r0 >= r3) goto L21e
            java.lang.Object r3 = r7.j(r0)
            x70 r3 = (defpackage.x70) r3
            android.view.View r4 = r3.b
            boolean r4 = r1.r(r4)
            if (r4 == 0) goto L21b
            java.util.ArrayList r4 = r1.k
            r4.add(r3)
            java.util.ArrayList r3 = r1.l
            r13 = 0
            r3.add(r13)
        L21b:
            int r0 = r0 + 1
            goto L1fe
        L21e:
            r3 = 0
        L21f:
            int r0 = r9.c
            if (r3 >= r0) goto L23f
            java.lang.Object r0 = r9.j(r3)
            x70 r0 = (defpackage.x70) r0
            android.view.View r4 = r0.b
            boolean r4 = r1.r(r4)
            if (r4 == 0) goto L23c
            java.util.ArrayList r4 = r1.l
            r4.add(r0)
            java.util.ArrayList r0 = r1.k
            r13 = 0
            r0.add(r13)
        L23c:
            int r3 = r3 + 1
            goto L21f
        L23f:
            n6 r0 = defpackage.r70.n()
            int r3 = r0.c
            db0 r4 = defpackage.bb0.a
            android.view.WindowId r4 = r2.getWindowId()
            int r3 = r3 + (-1)
        L24d:
            if (r3 < 0) goto L2b5
            java.lang.Object r5 = r0.h(r3)
            android.animation.Animator r5 = (android.animation.Animator) r5
            if (r5 == 0) goto L2af
            r13 = 0
            java.lang.Object r6 = r0.getOrDefault(r5, r13)
            p70 r6 = (defpackage.p70) r6
            if (r6 == 0) goto L2af
            android.view.View r7 = r6.a
            if (r7 == 0) goto L2af
            zb0 r8 = r6.d
            android.view.WindowId r8 = r8.a
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L2af
            x70 r8 = r6.c
            r9 = r17
            x70 r10 = r1.p(r7, r9)
            x70 r11 = r1.m(r7, r9)
            if (r10 != 0) goto L28d
            if (r11 != 0) goto L28d
            a8 r9 = r1.h
            java.lang.Object r9 = r9.a
            n6 r9 = (defpackage.n6) r9
            r13 = 0
            java.lang.Object r7 = r9.getOrDefault(r7, r13)
            r11 = r7
            x70 r11 = (defpackage.x70) r11
            goto L28e
        L28d:
            r13 = 0
        L28e:
            if (r10 != 0) goto L292
            if (r11 == 0) goto L2b0
        L292:
            r70 r6 = r6.e
            boolean r6 = r6.q(r8, r11)
            if (r6 == 0) goto L2b0
            boolean r6 = r5.isRunning()
            if (r6 != 0) goto L2ab
            boolean r6 = r5.isStarted()
            if (r6 == 0) goto L2a7
            goto L2ab
        L2a7:
            r0.remove(r5)
            goto L2b0
        L2ab:
            r5.cancel()
            goto L2b0
        L2af:
            r13 = 0
        L2b0:
            int r3 = r3 + (-1)
            r17 = 1
            goto L24d
        L2b5:
            a8 r3 = r1.g
            a8 r4 = r1.h
            java.util.ArrayList r5 = r1.k
            java.util.ArrayList r6 = r1.l
            r1.k(r2, r3, r4, r5, r6)
            r1.w()
            r17 = 1
            return r17
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r5) {
            r4 = this;
            android.view.ViewGroup r5 = r4.b
            android.view.ViewTreeObserver r0 = r5.getViewTreeObserver()
            r0.removeOnPreDrawListener(r4)
            r5.removeOnAttachStateChangeListener(r4)
            java.util.ArrayList r0 = defpackage.v70.c
            r0.remove(r5)
            n6 r0 = defpackage.v70.b()
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r5, r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L37
            int r1 = r0.size()
            if (r1 <= 0) goto L37
            int r1 = r0.size()
            r2 = 0
        L29:
            if (r2 >= r1) goto L37
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            r70 r3 = (defpackage.r70) r3
            r3.v(r5)
            goto L29
        L37:
            r70 r5 = r4.a
            r0 = 1
            r5.h(r0)
            return
    }
}
