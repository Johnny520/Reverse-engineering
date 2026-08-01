package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n40 {
    public final java.util.ArrayList a;
    public int b;
    public int c;
    public int d;
    public final int e;
    public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager f;

    public n40(androidx.recyclerview.widget.StaggeredGridLayoutManager r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.a = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.b = r1
            r0.c = r1
            r1 = 0
            r0.d = r1
            r0.e = r2
            return
    }

    public final void a() {
            r3 = this;
            java.util.ArrayList r0 = r3.a
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            k40 r1 = (defpackage.k40) r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r3.f
            ai r2 = r2.r
            int r0 = r2.b(r0)
            r3.c = r0
            r1.getClass()
            return
    }

    public final void b() {
            r1 = this;
            java.util.ArrayList r0 = r1.a
            r0.clear()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.b = r0
            r1.c = r0
            r0 = 0
            r1.d = r0
            return
    }

    public final int c() {
            r2 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r2.f
            boolean r0 = r0.w
            java.util.ArrayList r1 = r2.a
            if (r0 == 0) goto L14
            int r0 = r1.size()
            int r0 = r0 + (-1)
            r1 = -1
            int r0 = r2.e(r0, r1)
            return r0
        L14:
            r0 = 0
            int r1 = r1.size()
            int r0 = r2.e(r0, r1)
            return r0
    }

    public final int d() {
            r2 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r2.f
            boolean r0 = r0.w
            java.util.ArrayList r1 = r2.a
            if (r0 == 0) goto L12
            r0 = 0
            int r1 = r1.size()
            int r0 = r2.e(r0, r1)
            return r0
        L12:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            r1 = -1
            int r0 = r2.e(r0, r1)
            return r0
    }

    public final int e(int r12, int r13) {
            r11 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r11.f
            ai r1 = r0.r
            int r1 = r1.k()
            ai r2 = r0.r
            int r2 = r2.g()
            r3 = -1
            r4 = 1
            if (r13 <= r12) goto L14
            r5 = r4
            goto L15
        L14:
            r5 = r3
        L15:
            if (r12 == r13) goto L43
            java.util.ArrayList r6 = r11.a
            java.lang.Object r6 = r6.get(r12)
            android.view.View r6 = (android.view.View) r6
            ai r7 = r0.r
            int r7 = r7.e(r6)
            ai r8 = r0.r
            int r8 = r8.b(r6)
            r9 = 0
            if (r7 > r2) goto L30
            r10 = r4
            goto L31
        L30:
            r10 = r9
        L31:
            if (r8 < r1) goto L34
            r9 = r4
        L34:
            if (r10 == 0) goto L41
            if (r9 == 0) goto L41
            if (r7 < r1) goto L3c
            if (r8 <= r2) goto L41
        L3c:
            int r12 = defpackage.nz.F(r6)
            return r12
        L41:
            int r12 = r12 + r5
            goto L15
        L43:
            return r3
    }

    public final int f(int r3) {
            r2 = this;
            int r0 = r2.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            java.util.ArrayList r0 = r2.a
            int r0 = r0.size()
            if (r0 != 0) goto L10
            return r3
        L10:
            r2.a()
            int r3 = r2.c
            return r3
    }

    public final android.view.View g(int r7, int r8) {
            r6 = this;
            r0 = -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r6.f
            java.util.ArrayList r2 = r6.a
            r3 = 0
            if (r8 != r0) goto L35
            int r8 = r2.size()
            r0 = 0
        Ld:
            if (r0 >= r8) goto L34
            java.lang.Object r4 = r2.get(r0)
            android.view.View r4 = (android.view.View) r4
            boolean r5 = r1.w
            if (r5 == 0) goto L1f
            int r5 = defpackage.nz.F(r4)
            if (r5 <= r7) goto L34
        L1f:
            boolean r5 = r1.w
            if (r5 != 0) goto L2a
            int r5 = defpackage.nz.F(r4)
            if (r5 < r7) goto L2a
            goto L34
        L2a:
            boolean r5 = r4.hasFocusable()
            if (r5 == 0) goto L34
            int r0 = r0 + 1
            r3 = r4
            goto Ld
        L34:
            return r3
        L35:
            int r8 = r2.size()
            int r8 = r8 + (-1)
        L3b:
            if (r8 < 0) goto L62
            java.lang.Object r0 = r2.get(r8)
            android.view.View r0 = (android.view.View) r0
            boolean r4 = r1.w
            if (r4 == 0) goto L4d
            int r4 = defpackage.nz.F(r0)
            if (r4 >= r7) goto L62
        L4d:
            boolean r4 = r1.w
            if (r4 != 0) goto L58
            int r4 = defpackage.nz.F(r0)
            if (r4 > r7) goto L58
            goto L62
        L58:
            boolean r4 = r0.hasFocusable()
            if (r4 == 0) goto L62
            int r8 = r8 + (-1)
            r3 = r0
            goto L3b
        L62:
            return r3
    }

    public final int h(int r3) {
            r2 = this;
            int r0 = r2.b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            java.util.ArrayList r0 = r2.a
            int r1 = r0.size()
            if (r1 != 0) goto L10
            return r3
        L10:
            r3 = 0
            java.lang.Object r3 = r0.get(r3)
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            k40 r0 = (defpackage.k40) r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r2.f
            ai r1 = r1.r
            int r3 = r1.e(r3)
            r2.b = r3
            r0.getClass()
            int r3 = r2.b
            return r3
    }
}
