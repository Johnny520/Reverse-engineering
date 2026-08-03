package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static int a(androidx.recyclerview.widget.RecyclerView.w r0, androidx.recyclerview.widget.s r1, android.view.View r2, android.view.View r3, androidx.recyclerview.widget.RecyclerView.l r4, boolean r5) {
            int r4 = r4.v()
            if (r4 == 0) goto L35
            int r0 = r0.b()
            if (r0 == 0) goto L35
            if (r2 == 0) goto L35
            if (r3 != 0) goto L11
            goto L35
        L11:
            if (r5 != 0) goto L23
            int r0 = androidx.recyclerview.widget.RecyclerView.l.H(r2)
            int r1 = androidx.recyclerview.widget.RecyclerView.l.H(r3)
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 + 1
            return r0
        L23:
            int r0 = r1.b(r3)
            int r2 = r1.e(r2)
            int r0 = r0 - r2
            int r1 = r1.l()
            int r0 = java.lang.Math.min(r1, r0)
            return r0
        L35:
            r0 = 0
            return r0
    }

    public static int b(androidx.recyclerview.widget.RecyclerView.w r3, androidx.recyclerview.widget.s r4, android.view.View r5, android.view.View r6, androidx.recyclerview.widget.RecyclerView.l r7, boolean r8, boolean r9) {
            int r7 = r7.v()
            r0 = 0
            if (r7 == 0) goto L70
            int r7 = r3.b()
            if (r7 == 0) goto L70
            if (r5 == 0) goto L70
            if (r6 != 0) goto L12
            goto L70
        L12:
            int r7 = androidx.recyclerview.widget.RecyclerView.l.H(r5)
            int r1 = androidx.recyclerview.widget.RecyclerView.l.H(r6)
            int r7 = java.lang.Math.min(r7, r1)
            int r1 = androidx.recyclerview.widget.RecyclerView.l.H(r5)
            int r2 = androidx.recyclerview.widget.RecyclerView.l.H(r6)
            int r1 = java.lang.Math.max(r1, r2)
            if (r9 == 0) goto L38
            int r3 = r3.b()
            int r3 = r3 - r1
            int r3 = r3 + (-1)
            int r3 = java.lang.Math.max(r0, r3)
            goto L3c
        L38:
            int r3 = java.lang.Math.max(r0, r7)
        L3c:
            if (r8 != 0) goto L3f
            return r3
        L3f:
            int r7 = r4.b(r6)
            int r8 = r4.e(r5)
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r8 = androidx.recyclerview.widget.RecyclerView.l.H(r5)
            int r6 = androidx.recyclerview.widget.RecyclerView.l.H(r6)
            int r8 = r8 - r6
            int r6 = java.lang.Math.abs(r8)
            int r6 = r6 + 1
            float r7 = (float) r7
            float r6 = (float) r6
            float r7 = r7 / r6
            float r3 = (float) r3
            float r3 = r3 * r7
            int r6 = r4.k()
            int r4 = r4.e(r5)
            int r6 = r6 - r4
            float r4 = (float) r6
            float r3 = r3 + r4
            int r3 = java.lang.Math.round(r3)
            return r3
        L70:
            return r0
    }

    public static int c(androidx.recyclerview.widget.RecyclerView.w r0, androidx.recyclerview.widget.s r1, android.view.View r2, android.view.View r3, androidx.recyclerview.widget.RecyclerView.l r4, boolean r5) {
            int r4 = r4.v()
            if (r4 == 0) goto L3b
            int r4 = r0.b()
            if (r4 == 0) goto L3b
            if (r2 == 0) goto L3b
            if (r3 != 0) goto L11
            goto L3b
        L11:
            if (r5 != 0) goto L18
            int r0 = r0.b()
            return r0
        L18:
            int r4 = r1.b(r3)
            int r1 = r1.e(r2)
            int r4 = r4 - r1
            int r1 = androidx.recyclerview.widget.RecyclerView.l.H(r2)
            int r2 = androidx.recyclerview.widget.RecyclerView.l.H(r3)
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            int r1 = r1 + 1
            float r2 = (float) r4
            float r1 = (float) r1
            float r2 = r2 / r1
            int r0 = r0.b()
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = (int) r2
            return r0
        L3b:
            r0 = 0
            return r0
    }
}
