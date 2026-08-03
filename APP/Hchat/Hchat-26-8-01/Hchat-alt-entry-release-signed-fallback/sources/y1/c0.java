package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements android.view.translation.ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1.c0 f21862a = null;

    static {
            y1.c0 r0 = new y1.c0
            r0.<init>()
            y1.c0.f21862a = r0
            return
    }

    public final boolean onClearTranslation(android.view.View r14) {
            r13 = this;
            r14.getClass()
            y1.t r14 = (y1.t) r14
            a1.i r14 = r14.getContentCaptureManager$ui()
            r14.getClass()
            a1.b r0 = a1.b.f13g
            r14.f34l = r0
            f.k r14 = r14.h()
            java.lang.Object[] r0 = r14.f2845c
            long[] r14 = r14.f2843a
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L82
            r2 = 0
            r3 = r2
        L1f:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L7d
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L39:
            if (r8 >= r6) goto L7b
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L77
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            f2.r r9 = (f2.r) r9
            f2.q r9 = r9.f3216a
            f2.m r9 = r9.f3213d
            f.k0 r9 = r9.f3204g
            f2.x r10 = f2.u.D
            java.lang.Object r10 = r9.g(r10)
            r11 = 0
            if (r10 != 0) goto L5b
            r10 = r11
        L5b:
            if (r10 == 0) goto L77
            f2.x r10 = f2.l.f3191n
            java.lang.Object r9 = r9.g(r10)
            if (r9 != 0) goto L66
            goto L67
        L66:
            r11 = r9
        L67:
            f2.a r11 = (f2.a) r11
            if (r11 == 0) goto L77
            sf.b r9 = r11.f3138b
            fg.a r9 = (fg.a) r9
            if (r9 == 0) goto L77
            java.lang.Object r9 = r9.invoke()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
        L77:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L39
        L7b:
            if (r6 != r7) goto L82
        L7d:
            if (r3 == r1) goto L82
            int r3 = r3 + 1
            goto L1f
        L82:
            r14 = 1
            return r14
    }

    public final boolean onHideTranslation(android.view.View r14) {
            r13 = this;
            r14.getClass()
            y1.t r14 = (y1.t) r14
            a1.i r14 = r14.getContentCaptureManager$ui()
            r14.getClass()
            a1.b r0 = a1.b.f13g
            r14.f34l = r0
            f.k r14 = r14.h()
            java.lang.Object[] r0 = r14.f2845c
            long[] r14 = r14.f2843a
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L8a
            r2 = 0
            r3 = r2
        L1f:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L85
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L39:
            if (r8 >= r6) goto L83
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L7f
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            f2.r r9 = (f2.r) r9
            f2.q r9 = r9.f3216a
            f2.m r9 = r9.f3213d
            f.k0 r9 = r9.f3204g
            f2.x r10 = f2.u.D
            java.lang.Object r10 = r9.g(r10)
            r11 = 0
            if (r10 != 0) goto L5b
            r10 = r11
        L5b:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r10 = gg.l.a(r10, r12)
            if (r10 == 0) goto L7f
            f2.x r10 = f2.l.f3190m
            java.lang.Object r9 = r9.g(r10)
            if (r9 != 0) goto L6c
            goto L6d
        L6c:
            r11 = r9
        L6d:
            f2.a r11 = (f2.a) r11
            if (r11 == 0) goto L7f
            sf.b r9 = r11.f3138b
            fg.l r9 = (fg.l) r9
            if (r9 == 0) goto L7f
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            java.lang.Object r9 = r9.invoke(r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
        L7f:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L39
        L83:
            if (r6 != r7) goto L8a
        L85:
            if (r3 == r1) goto L8a
            int r3 = r3 + 1
            goto L1f
        L8a:
            r14 = 1
            return r14
    }

    public final boolean onShowTranslation(android.view.View r14) {
            r13 = this;
            r14.getClass()
            y1.t r14 = (y1.t) r14
            a1.i r14 = r14.getContentCaptureManager$ui()
            r14.getClass()
            a1.b r0 = a1.b.f14h
            r14.f34l = r0
            f.k r14 = r14.h()
            java.lang.Object[] r0 = r14.f2845c
            long[] r14 = r14.f2843a
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L8a
            r2 = 0
            r3 = r2
        L1f:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L85
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L39:
            if (r8 >= r6) goto L83
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L7f
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            f2.r r9 = (f2.r) r9
            f2.q r9 = r9.f3216a
            f2.m r9 = r9.f3213d
            f.k0 r9 = r9.f3204g
            f2.x r10 = f2.u.D
            java.lang.Object r10 = r9.g(r10)
            r11 = 0
            if (r10 != 0) goto L5b
            r10 = r11
        L5b:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            boolean r10 = gg.l.a(r10, r12)
            if (r10 == 0) goto L7f
            f2.x r10 = f2.l.f3190m
            java.lang.Object r9 = r9.g(r10)
            if (r9 != 0) goto L6c
            goto L6d
        L6c:
            r11 = r9
        L6d:
            f2.a r11 = (f2.a) r11
            if (r11 == 0) goto L7f
            sf.b r9 = r11.f3138b
            fg.l r9 = (fg.l) r9
            if (r9 == 0) goto L7f
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            java.lang.Object r9 = r9.invoke(r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
        L7f:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L39
        L83:
            if (r6 != r7) goto L8a
        L85:
            if (r3 == r1) goto L8a
            int r3 = r3 + 1
            goto L1f
        L8a:
            r14 = 1
            return r14
    }
}
