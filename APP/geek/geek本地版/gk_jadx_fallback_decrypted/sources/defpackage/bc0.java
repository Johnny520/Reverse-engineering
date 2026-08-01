package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bc0 implements android.view.View.OnApplyWindowInsetsListener {
    public final defpackage.ad a;
    public defpackage.wc0 b;

    public bc0(android.view.View r2, defpackage.ad r3) {
            r1 = this;
            r1.<init>()
            r1.a = r3
            java.util.WeakHashMap r3 = defpackage.ja0.a
            wc0 r2 = defpackage.z90.a(r2)
            if (r2 == 0) goto L2d
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r3 < r0) goto L19
            lc0 r3 = new lc0
            r3.<init>(r2)
            goto L28
        L19:
            r0 = 29
            if (r3 < r0) goto L23
            kc0 r3 = new kc0
            r3.<init>(r2)
            goto L28
        L23:
            ic0 r3 = new ic0
            r3.<init>(r2)
        L28:
            wc0 r2 = r3.b()
            goto L2e
        L2d:
            r2 = 0
        L2e:
            r1.b = r2
            return
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View r21, android.view.WindowInsets r22) {
            r20 = this;
            r0 = r20
            r6 = r21
            r7 = r22
            boolean r1 = r6.isLaidOut()
            if (r1 != 0) goto L17
            wc0 r1 = defpackage.wc0.g(r21, r22)
            r0.b = r1
            android.view.WindowInsets r1 = defpackage.cc0.i(r21, r22)
            return r1
        L17:
            wc0 r3 = defpackage.wc0.g(r21, r22)
            tc0 r1 = r3.a
            wc0 r2 = r0.b
            if (r2 != 0) goto L29
            java.util.WeakHashMap r2 = defpackage.ja0.a
            wc0 r2 = defpackage.z90.a(r6)
            r0.b = r2
        L29:
            wc0 r2 = r0.b
            if (r2 != 0) goto L34
            r0.b = r3
            android.view.WindowInsets r1 = defpackage.cc0.i(r21, r22)
            return r1
        L34:
            ad r2 = defpackage.cc0.j(r6)
            if (r2 == 0) goto L49
            java.lang.Object r2 = r2.b
            android.view.WindowInsets r2 = (android.view.WindowInsets) r2
            boolean r2 = java.util.Objects.equals(r2, r7)
            if (r2 == 0) goto L49
            android.view.WindowInsets r1 = defpackage.cc0.i(r21, r22)
            return r1
        L49:
            wc0 r2 = r0.b
            r5 = 1
            r8 = 0
        L4d:
            r9 = 256(0x100, float:3.59E-43)
            if (r5 > r9) goto L65
            ep r9 = r1.f(r5)
            tc0 r10 = r2.a
            ep r10 = r10.f(r5)
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L62
            r8 = r8 | r5
        L62:
            int r5 = r5 << 1
            goto L4d
        L65:
            if (r8 != 0) goto L6c
            android.view.WindowInsets r1 = defpackage.cc0.i(r21, r22)
            return r1
        L6c:
            wc0 r2 = r0.b
            gc0 r5 = new gc0
            android.view.animation.DecelerateInterpolator r9 = new android.view.animation.DecelerateInterpolator
            r9.<init>()
            r10 = 160(0xa0, double:7.9E-322)
            r5.<init>(r8, r9, r10)
            fc0 r9 = r5.a
            r10 = 0
            r9.d(r10)
            r9 = 2
            float[] r10 = new float[r9]
            r10 = {x0116: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofFloat(r10)
            fc0 r11 = r5.a
            long r11 = r11.a()
            android.animation.ValueAnimator r10 = r10.setDuration(r11)
            ep r1 = r1.f(r8)
            tc0 r11 = r2.a
            ep r11 = r11.f(r8)
            int r12 = r1.a
            int r13 = r11.a
            int r12 = java.lang.Math.min(r12, r13)
            int r13 = r1.b
            int r14 = r11.b
            int r15 = java.lang.Math.min(r13, r14)
            int r9 = r1.c
            int r4 = r11.c
            r16 = r2
            int r2 = java.lang.Math.min(r9, r4)
            r17 = r3
            int r3 = r1.d
            r18 = r5
            int r5 = r11.d
            r19 = r8
            int r8 = java.lang.Math.min(r3, r5)
            ep r2 = defpackage.ep.b(r12, r15, r2, r8)
            int r1 = r1.a
            int r8 = r11.a
            int r1 = java.lang.Math.max(r1, r8)
            int r8 = java.lang.Math.max(r13, r14)
            int r4 = java.lang.Math.max(r9, r4)
            int r3 = java.lang.Math.max(r3, r5)
            ep r1 = defpackage.ep.b(r1, r8, r4, r3)
            d4 r8 = new d4
            r3 = 21
            r4 = 0
            r8.<init>(r2, r1, r3, r4)
            defpackage.cc0.f(r6, r7, r4)
            ac0 r1 = new ac0
            r4 = r16
            r3 = r17
            r2 = r18
            r5 = r19
            r1.<init>(r2, r3, r4, r5, r6)
            r10.addUpdateListener(r1)
            o70 r1 = new o70
            r4 = 2
            r1.<init>(r2, r6, r4)
            r10.addListener(r1)
            s00 r1 = new s00
            r1.<init>(r6, r2, r8, r10)
            defpackage.cx.a(r6, r1)
            r0.b = r3
            android.view.WindowInsets r1 = defpackage.cc0.i(r21, r22)
            return r1
    }
}
