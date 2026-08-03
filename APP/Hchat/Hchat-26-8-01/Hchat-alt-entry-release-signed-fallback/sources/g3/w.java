package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements android.view.View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3.s f4245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g3.r0 f4246b;

    public w(android.view.View r2, g3.s r3) {
            r1 = this;
            r1.<init>()
            r1.f4245a = r3
            int r3 = g3.q.f4227a
            g3.r0 r2 = g3.n.a(r2)
            if (r2 == 0) goto L37
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r3 < r0) goto L19
            g3.f0 r3 = new g3.f0
            r3.<init>(r2)
            goto L32
        L19:
            r0 = 30
            if (r3 < r0) goto L23
            g3.e0 r3 = new g3.e0
            r3.<init>(r2)
            goto L32
        L23:
            r0 = 29
            if (r3 < r0) goto L2d
            g3.d0 r3 = new g3.d0
            r3.<init>(r2)
            goto L32
        L2d:
            g3.c0 r3 = new g3.c0
            r3.<init>(r2)
        L32:
            g3.r0 r2 = r3.b()
            goto L38
        L37:
            r2 = 0
        L38:
            r1.f4246b = r2
            return
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View r21, android.view.WindowInsets r22) {
            r20 = this;
            r0 = r20
            r6 = r21
            r7 = r22
            boolean r1 = r6.isLaidOut()
            r8 = 2131099749(0x7f060065, float:1.781186E38)
            if (r1 != 0) goto L21
            g3.r0 r1 = g3.r0.c(r7, r6)
            r0.f4246b = r1
            java.lang.Object r1 = r6.getTag(r8)
            if (r1 == 0) goto L1c
            return r7
        L1c:
            android.view.WindowInsets r1 = r21.onApplyWindowInsets(r22)
            return r1
        L21:
            g3.r0 r3 = g3.r0.c(r7, r6)
            g3.n0 r1 = r3.f4230a
            g3.r0 r2 = r0.f4246b
            if (r2 != 0) goto L33
            int r2 = g3.q.f4227a
            g3.r0 r2 = g3.n.a(r6)
            r0.f4246b = r2
        L33:
            g3.r0 r2 = r0.f4246b
            if (r2 != 0) goto L46
            r0.f4246b = r3
            java.lang.Object r1 = r6.getTag(r8)
            if (r1 == 0) goto L41
            goto L1b7
        L41:
            android.view.WindowInsets r1 = r21.onApplyWindowInsets(r22)
            return r1
        L46:
            g3.s r2 = g3.x.j(r6)
            if (r2 == 0) goto L63
            java.lang.Object r2 = r2.f4233i
            g3.r0 r2 = (g3.r0) r2
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L63
            java.lang.Object r1 = r6.getTag(r8)
            if (r1 == 0) goto L5e
            goto L1b7
        L5e:
            android.view.WindowInsets r1 = r21.onApplyWindowInsets(r22)
            return r1
        L63:
            r2 = 1
            int[] r4 = new int[r2]
            int[] r5 = new int[r2]
            g3.r0 r9 = r0.f4246b
            r10 = r2
        L6b:
            r11 = 512(0x200, float:7.17E-43)
            if (r10 > r11) goto Lc5
            b3.a r11 = r1.g(r10)
            g3.n0 r13 = r9.f4230a
            b3.a r13 = r13.g(r10)
            int r14 = r11.f445a
            int r15 = r11.f448d
            int r2 = r11.f447c
            int r11 = r11.f446b
            r17 = 0
            int r12 = r13.f445a
            int r8 = r13.f448d
            r18 = r4
            int r4 = r13.f447c
            int r13 = r13.f446b
            if (r14 > r12) goto L9b
            if (r11 > r13) goto L9b
            if (r2 > r4) goto L9b
            if (r15 <= r8) goto L96
            goto L9b
        L96:
            r19 = r5
            r5 = r17
            goto L9e
        L9b:
            r19 = r5
            r5 = 1
        L9e:
            if (r14 < r12) goto Laa
            if (r11 < r13) goto Laa
            if (r2 < r4) goto Laa
            if (r15 >= r8) goto La7
            goto Laa
        La7:
            r2 = r17
            goto Lab
        Laa:
            r2 = 1
        Lab:
            if (r5 == r2) goto Lba
            if (r5 == 0) goto Lb5
            r2 = r18[r17]
            r2 = r2 | r10
            r18[r17] = r2
            goto Lba
        Lb5:
            r2 = r19[r17]
            r2 = r2 | r10
            r19[r17] = r2
        Lba:
            int r10 = r10 << 1
            r4 = r18
            r5 = r19
            r2 = 1
            r8 = 2131099749(0x7f060065, float:1.781186E38)
            goto L6b
        Lc5:
            r18 = r4
            r19 = r5
            r17 = 0
            r2 = r18[r17]
            r4 = r19[r17]
            r5 = r2 | r4
            if (r5 != 0) goto Le5
            r0.f4246b = r3
            r1 = 2131099749(0x7f060065, float:1.781186E38)
            java.lang.Object r1 = r6.getTag(r1)
            if (r1 == 0) goto Le0
            goto L1b7
        Le0:
            android.view.WindowInsets r1 = r21.onApplyWindowInsets(r22)
            return r1
        Le5:
            g3.r0 r8 = r0.f4246b
            r9 = r2 & 8
            if (r9 == 0) goto Lee
            android.view.animation.PathInterpolator r2 = g3.x.f4247e
            goto L104
        Lee:
            r9 = r4 & 8
            if (r9 == 0) goto Lf5
            n3.a r2 = g3.x.f4248f
            goto L104
        Lf5:
            r2 = r2 & 519(0x207, float:7.27E-43)
            if (r2 == 0) goto Lfc
            android.view.animation.DecelerateInterpolator r2 = g3.x.f4249g
            goto L104
        Lfc:
            r2 = r4 & 519(0x207, float:7.27E-43)
            if (r2 == 0) goto L103
            android.view.animation.AccelerateInterpolator r2 = g3.x.f4250h
            goto L104
        L103:
            r2 = 0
        L104:
            g3.b0 r4 = new g3.b0
            r9 = r5 & 8
            if (r9 == 0) goto L10d
            r9 = 160(0xa0, double:7.9E-322)
            goto L10f
        L10d:
            r9 = 250(0xfa, double:1.235E-321)
        L10f:
            r4.<init>(r5, r2, r9)
            g3.a0 r2 = r4.f4187a
            r9 = 0
            r2.e(r9)
            r2 = 2
            float[] r2 = new float[r2]
            r2 = {x01be: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            g3.a0 r9 = r4.f4187a
            long r9 = r9.b()
            android.animation.ValueAnimator r9 = r2.setDuration(r9)
            b3.a r1 = r1.g(r5)
            g3.n0 r2 = r8.f4230a
            b3.a r2 = r2.g(r5)
            int r10 = r1.f445a
            int r11 = r2.f445a
            int r10 = java.lang.Math.min(r10, r11)
            int r11 = r1.f446b
            int r12 = r2.f446b
            int r13 = java.lang.Math.min(r11, r12)
            int r14 = r1.f447c
            int r15 = r2.f447c
            r16 = r5
            int r5 = java.lang.Math.min(r14, r15)
            int r7 = r1.f448d
            r18 = r8
            int r8 = r2.f448d
            int r0 = java.lang.Math.min(r7, r8)
            b3.a r0 = b3.a.b(r10, r13, r5, r0)
            int r1 = r1.f445a
            int r2 = r2.f445a
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = java.lang.Math.max(r11, r12)
            int r5 = java.lang.Math.max(r14, r15)
            int r7 = java.lang.Math.max(r7, r8)
            b3.a r1 = b3.a.b(r1, r2, r5, r7)
            b.e r7 = new b.e
            r2 = 6
            r7.<init>(r0, r2, r1)
            r0 = r17
            g3.x.g(r6, r4, r3, r0)
            g3.t r1 = new g3.t
            r2 = r4
            r5 = r16
            r4 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            r9.addUpdateListener(r1)
            g3.u r0 = new g3.u
            r0.<init>(r6, r2)
            r9.addListener(r0)
            g3.v r0 = new g3.v
            r0.<init>(r6, r2, r7, r9)
            g3.f r1 = new g3.f
            r1.<init>(r6, r0)
            android.view.ViewTreeObserver r0 = r6.getViewTreeObserver()
            r0.addOnPreDrawListener(r1)
            r6.addOnAttachStateChangeListener(r1)
            r0 = r20
            r0.f4246b = r3
            r1 = 2131099749(0x7f060065, float:1.781186E38)
            java.lang.Object r1 = r6.getTag(r1)
            if (r1 == 0) goto L1b8
        L1b7:
            return r22
        L1b8:
            android.view.WindowInsets r1 = r21.onApplyWindowInsets(r22)
            return r1
    }
}
