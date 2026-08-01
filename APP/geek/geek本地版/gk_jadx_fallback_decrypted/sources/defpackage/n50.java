package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n50 extends defpackage.gt {
    public int a;
    public int b;
    public final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior c;

    public n50(com.google.android.material.behavior.SwipeDismissBehavior r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r1 = -1
            r0.b = r1
            return
    }

    @Override // defpackage.gt
    public final boolean H(android.view.View r3, int r4) {
            r2 = this;
            int r0 = r2.b
            r1 = -1
            if (r0 == r1) goto L7
            if (r0 != r4) goto L11
        L7:
            com.google.android.material.behavior.SwipeDismissBehavior r4 = r2.c
            boolean r3 = r4.r(r3)
            if (r3 == 0) goto L11
            r3 = 1
            return r3
        L11:
            r3 = 0
            return r3
    }

    @Override // defpackage.gt
    public final int b(android.view.View r4, int r5) {
            r3 = this;
            java.util.WeakHashMap r0 = defpackage.ja0.a
            int r0 = defpackage.t90.d(r4)
            r1 = 1
            if (r0 != r1) goto Lb
            r0 = r1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r3.c
            int r2 = r2.d
            if (r2 != 0) goto L26
            if (r0 == 0) goto L1e
            int r0 = r3.a
            int r4 = r4.getWidth()
            int r0 = r0 - r4
            int r4 = r3.a
            goto L49
        L1e:
            int r0 = r3.a
            int r4 = r4.getWidth()
        L24:
            int r4 = r4 + r0
            goto L49
        L26:
            if (r2 != r1) goto L3b
            if (r0 == 0) goto L31
            int r0 = r3.a
            int r4 = r4.getWidth()
            goto L24
        L31:
            int r0 = r3.a
            int r4 = r4.getWidth()
            int r0 = r0 - r4
            int r4 = r3.a
            goto L49
        L3b:
            int r0 = r3.a
            int r1 = r4.getWidth()
            int r0 = r0 - r1
            int r1 = r3.a
            int r4 = r4.getWidth()
            int r4 = r4 + r1
        L49:
            int r5 = java.lang.Math.max(r0, r5)
            int r4 = java.lang.Math.min(r5, r4)
            return r4
    }

    @Override // defpackage.gt
    public final int c(android.view.View r1, int r2) {
            r0 = this;
            int r1 = r1.getTop()
            return r1
    }

    @Override // defpackage.gt
    public final int l(android.view.View r1) {
            r0 = this;
            int r1 = r1.getWidth()
            return r1
    }

    @Override // defpackage.gt
    public final void r(android.view.View r2, int r3) {
            r1 = this;
            r1.b = r3
            int r3 = r2.getLeft()
            r1.a = r3
            android.view.ViewParent r2 = r2.getParent()
            if (r2 == 0) goto L19
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r1.c
            r0 = 1
            r3.c = r0
            r2.requestDisallowInterceptTouchEvent(r0)
            r2 = 0
            r3.c = r2
        L19:
            return
    }

    @Override // defpackage.gt
    public final void s(int r1) {
            r0 = this;
            return
    }

    @Override // defpackage.gt
    public final void t(android.view.View r5, int r6, int r7) {
            r4 = this;
            int r7 = r5.getWidth()
            float r7 = (float) r7
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r4.c
            float r1 = r0.e
            float r7 = r7 * r1
            int r1 = r5.getWidth()
            float r1 = (float) r1
            float r0 = r0.f
            float r1 = r1 * r0
            int r0 = r4.a
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            float r6 = (float) r6
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 > 0) goto L24
            r5.setAlpha(r2)
            return
        L24:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r3 = 0
            if (r0 < 0) goto L2d
            r5.setAlpha(r3)
            return
        L2d:
            float r6 = r6 - r7
            float r1 = r1 - r7
            float r6 = r6 / r1
            float r6 = r2 - r6
            float r6 = java.lang.Math.max(r3, r6)
            float r6 = java.lang.Math.min(r6, r2)
            r5.setAlpha(r6)
            return
    }

    @Override // defpackage.gt
    public final void u(android.view.View r9, float r10, float r11) {
            r8 = this;
            r11 = -1
            r8.b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.c
            r4 = 1
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = defpackage.ja0.a
            int r5 = defpackage.t90.d(r9)
            if (r5 != r4) goto L1a
            r5 = r4
            goto L1b
        L1a:
            r5 = r2
        L1b:
            int r6 = r3.d
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L67
            goto L52
        L2a:
            if (r1 <= 0) goto L67
            goto L52
        L2d:
            if (r6 != r4) goto L67
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L67
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L67
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L67
        L52:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L61
            int r10 = r9.getLeft()
            int r0 = r8.a
            if (r10 >= r0) goto L5f
            goto L61
        L5f:
            int r0 = r0 + r11
            goto L65
        L61:
            int r10 = r8.a
            int r0 = r10 - r11
        L65:
            r2 = r4
            goto L69
        L67:
            int r0 = r8.a
        L69:
            ma0 r10 = r3.a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L7f
            h1 r10 = new h1
            r10.<init>(r3, r9, r2)
            java.util.WeakHashMap r11 = defpackage.ja0.a
            defpackage.s90.m(r9, r10)
        L7f:
            return
    }
}
