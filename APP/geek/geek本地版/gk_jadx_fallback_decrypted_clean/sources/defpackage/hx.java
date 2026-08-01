package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hx extends defpackage.pz {
    public androidx.recyclerview.widget.RecyclerView a;
    public final defpackage.w30 b;
    public defpackage.ex c;
    public defpackage.ex d;

    public hx() {
            r1 = this;
            r1.<init>()
            w30 r0 = new w30
            r0.<init>(r1)
            r1.b = r0
            return
    }

    public static int b(android.view.View r1, defpackage.ai r2) {
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

    public static android.view.View c(defpackage.nz r8, defpackage.ai r9) {
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

    public final int[] a(defpackage.nz r5, android.view.View r6) {
            r4 = this;
            r0 = 2
            int[] r0 = new int[r0]
            boolean r1 = r5.d()
            r2 = 0
            if (r1 == 0) goto L15
            ai r1 = r4.d(r5)
            int r1 = b(r6, r1)
            r0[r2] = r1
            goto L17
        L15:
            r0[r2] = r2
        L17:
            boolean r1 = r5.e()
            r3 = 1
            if (r1 == 0) goto L29
            ai r5 = r4.e(r5)
            int r5 = b(r6, r5)
            r0[r3] = r5
            return r0
        L29:
            r0[r3] = r2
            return r0
    }

    public final defpackage.ai d(defpackage.nz r3) {
            r2 = this;
            ex r0 = r2.d
            if (r0 == 0) goto La
            java.lang.Object r0 = r0.b
            nz r0 = (defpackage.nz) r0
            if (r0 == r3) goto L12
        La:
            ex r0 = new ex
            r1 = 0
            r0.<init>(r3, r1)
            r2.d = r0
        L12:
            ex r3 = r2.d
            return r3
    }

    public final defpackage.ai e(defpackage.nz r3) {
            r2 = this;
            ex r0 = r2.c
            if (r0 == 0) goto La
            java.lang.Object r0 = r0.b
            nz r0 = (defpackage.nz) r0
            if (r0 == r3) goto L12
        La:
            ex r0 = new ex
            r1 = 1
            r0.<init>(r3, r1)
            r2.c = r0
        L12:
            ex r3 = r2.c
            return r3
    }

    public final void f() {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.a
            if (r0 != 0) goto L5
            goto L3d
        L5:
            nz r0 = r0.getLayoutManager()
            if (r0 != 0) goto Lc
            goto L3d
        Lc:
            boolean r1 = r0.e()
            if (r1 == 0) goto L1b
            ai r1 = r5.e(r0)
            android.view.View r1 = c(r0, r1)
            goto L2b
        L1b:
            boolean r1 = r0.d()
            if (r1 == 0) goto L2a
            ai r1 = r5.d(r0)
            android.view.View r1 = c(r0, r1)
            goto L2b
        L2a:
            r1 = 0
        L2b:
            if (r1 != 0) goto L2e
            goto L3d
        L2e:
            int[] r0 = r5.a(r0, r1)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L3e
            r4 = r0[r3]
            if (r4 == 0) goto L3d
            goto L3e
        L3d:
            return
        L3e:
            androidx.recyclerview.widget.RecyclerView r4 = r5.a
            r0 = r0[r3]
            r4.Z(r2, r0, r1)
            return
    }
}
