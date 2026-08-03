package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class u extends androidx.recyclerview.widget.A {
    public androidx.recyclerview.widget.r c;
    public androidx.recyclerview.widget.q d;

    public static int c(android.view.View r1, androidx.recyclerview.widget.s r2) {
            int r0 = r2.e(r1)
            int r1 = r2.c(r1)
            int r1 = r1 / 2
            int r1 = r1 + r0
            int r0 = r2.k()
            int r2 = r2.l()
            int r2 = r2 / 2
            int r2 = r2 + r0
            int r1 = r1 - r2
            return r1
    }

    public static android.view.View d(androidx.recyclerview.widget.RecyclerView.l r8, androidx.recyclerview.widget.s r9) {
            int r0 = r8.v()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r9.k()
            int r3 = r9.l()
            int r3 = r3 / 2
            int r3 = r3 + r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
        L17:
            if (r4 >= r0) goto L34
            android.view.View r5 = r8.u(r4)
            int r6 = r9.e(r5)
            int r7 = r9.c(r5)
            int r7 = r7 / 2
            int r7 = r7 + r6
            int r7 = r7 - r3
            int r6 = java.lang.Math.abs(r7)
            if (r6 >= r2) goto L31
            r1 = r5
            r2 = r6
        L31:
            int r4 = r4 + 1
            goto L17
        L34:
            return r1
    }

    @Override // androidx.recyclerview.widget.A
    public final int[] a(androidx.recyclerview.widget.RecyclerView.l r5, android.view.View r6) {
            r4 = this;
            r0 = 2
            int[] r0 = new int[r0]
            boolean r1 = r5.d()
            r2 = 0
            if (r1 == 0) goto L15
            androidx.recyclerview.widget.s r1 = r4.e(r5)
            int r1 = c(r6, r1)
            r0[r2] = r1
            goto L17
        L15:
            r0[r2] = r2
        L17:
            boolean r1 = r5.e()
            r3 = 1
            if (r1 == 0) goto L29
            androidx.recyclerview.widget.s r5 = r4.f(r5)
            int r5 = c(r6, r5)
            r0[r3] = r5
            return r0
        L29:
            r0[r3] = r2
            return r0
    }

    public final androidx.recyclerview.widget.s e(androidx.recyclerview.widget.RecyclerView.l r2) {
            r1 = this;
            androidx.recyclerview.widget.q r0 = r1.d
            if (r0 == 0) goto L8
            androidx.recyclerview.widget.RecyclerView$l r0 = r0.f1014a
            if (r0 == r2) goto Lf
        L8:
            androidx.recyclerview.widget.q r0 = new androidx.recyclerview.widget.q
            r0.<init>(r2)
            r1.d = r0
        Lf:
            androidx.recyclerview.widget.q r2 = r1.d
            return r2
    }

    public final androidx.recyclerview.widget.s f(androidx.recyclerview.widget.RecyclerView.l r2) {
            r1 = this;
            androidx.recyclerview.widget.r r0 = r1.c
            if (r0 == 0) goto L8
            androidx.recyclerview.widget.RecyclerView$l r0 = r0.f1014a
            if (r0 == r2) goto Lf
        L8:
            androidx.recyclerview.widget.r r0 = new androidx.recyclerview.widget.r
            r0.<init>(r2)
            r1.c = r0
        Lf:
            androidx.recyclerview.widget.r r2 = r1.c
            return r2
    }
}
