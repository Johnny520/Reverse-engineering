package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0507b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.v f992a;
    public final androidx.recyclerview.widget.C0507b.a b;
    public final java.util.ArrayList c;
    public int d;
    public android.view.View e;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f993a;
        public androidx.recyclerview.widget.C0507b.a b;

        public a() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f993a = r0
                return
        }

        public final void a(int r5) {
                r4 = this;
                r0 = 64
                if (r5 < r0) goto Ld
                androidx.recyclerview.widget.b$a r1 = r4.b
                if (r1 == 0) goto Lc
                int r5 = r5 - r0
                r1.a(r5)
            Lc:
                return
            Ld:
                long r0 = r4.f993a
                r2 = 1
                long r2 = r2 << r5
                long r2 = ~r2
                long r0 = r0 & r2
                r4.f993a = r0
                return
        }

        public final int b(int r7) {
                r6 = this;
                androidx.recyclerview.widget.b$a r0 = r6.b
                r1 = 64
                r2 = 1
                if (r0 != 0) goto L1c
                if (r7 < r1) goto L11
                long r0 = r6.f993a
                int r7 = java.lang.Long.bitCount(r0)
                return r7
            L11:
                long r0 = r6.f993a
                long r4 = r2 << r7
                long r4 = r4 - r2
                long r0 = r0 & r4
                int r7 = java.lang.Long.bitCount(r0)
                return r7
            L1c:
                if (r7 >= r1) goto L29
                long r0 = r6.f993a
                long r4 = r2 << r7
                long r4 = r4 - r2
                long r0 = r0 & r4
                int r7 = java.lang.Long.bitCount(r0)
                return r7
            L29:
                int r7 = r7 - r1
                int r7 = r0.b(r7)
                long r0 = r6.f993a
                int r0 = java.lang.Long.bitCount(r0)
                int r0 = r0 + r7
                return r0
        }

        public final void c() {
                r1 = this;
                androidx.recyclerview.widget.b$a r0 = r1.b
                if (r0 != 0) goto Lb
                androidx.recyclerview.widget.b$a r0 = new androidx.recyclerview.widget.b$a
                r0.<init>()
                r1.b = r0
            Lb:
                return
        }

        public final boolean d(int r5) {
                r4 = this;
                r0 = 64
                if (r5 < r0) goto Lf
                r4.c()
                androidx.recyclerview.widget.b$a r1 = r4.b
                int r5 = r5 - r0
                boolean r5 = r1.d(r5)
                return r5
            Lf:
                long r0 = r4.f993a
                r2 = 1
                long r2 = r2 << r5
                long r0 = r0 & r2
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L1d
                r5 = 1
                return r5
            L1d:
                r5 = 0
                return r5
        }

        public final void e(int r10, boolean r11) {
                r9 = this;
                r0 = 64
                if (r10 < r0) goto Le
                r9.c()
                androidx.recyclerview.widget.b$a r1 = r9.b
                int r10 = r10 - r0
                r1.e(r10, r11)
                return
            Le:
                long r0 = r9.f993a
                r2 = -9223372036854775808
                long r2 = r2 & r0
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L1d
                r2 = r4
                goto L1e
            L1d:
                r2 = r3
            L1e:
                r5 = 1
                long r7 = r5 << r10
                long r7 = r7 - r5
                long r5 = r0 & r7
                long r7 = ~r7
                long r0 = r0 & r7
                long r0 = r0 << r4
                long r0 = r0 | r5
                r9.f993a = r0
                if (r11 == 0) goto L31
                r9.h(r10)
                goto L34
            L31:
                r9.a(r10)
            L34:
                if (r2 != 0) goto L3c
                androidx.recyclerview.widget.b$a r10 = r9.b
                if (r10 == 0) goto L3b
                goto L3c
            L3b:
                return
            L3c:
                r9.c()
                androidx.recyclerview.widget.b$a r10 = r9.b
                r10.e(r3, r2)
                return
        }

        public final boolean f(int r11) {
                r10 = this;
                r0 = 64
                if (r11 < r0) goto Lf
                r10.c()
                androidx.recyclerview.widget.b$a r1 = r10.b
                int r11 = r11 - r0
                boolean r11 = r1.f(r11)
                return r11
            Lf:
                r0 = 1
                long r2 = r0 << r11
                long r4 = r10.f993a
                long r6 = r4 & r2
                r8 = 0
                int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                r6 = 1
                r7 = 0
                if (r11 == 0) goto L21
                r11 = r6
                goto L22
            L21:
                r11 = r7
            L22:
                long r8 = ~r2
                long r4 = r4 & r8
                r10.f993a = r4
                long r2 = r2 - r0
                long r0 = r4 & r2
                long r2 = ~r2
                long r2 = r2 & r4
                long r2 = java.lang.Long.rotateRight(r2, r6)
                long r0 = r0 | r2
                r10.f993a = r0
                androidx.recyclerview.widget.b$a r0 = r10.b
                if (r0 == 0) goto L46
                boolean r0 = r0.d(r7)
                if (r0 == 0) goto L41
                r0 = 63
                r10.h(r0)
            L41:
                androidx.recyclerview.widget.b$a r0 = r10.b
                r0.f(r7)
            L46:
                return r11
        }

        public final void g() {
                r2 = this;
                r0 = 0
                r2.f993a = r0
                androidx.recyclerview.widget.b$a r0 = r2.b
                if (r0 == 0) goto Lb
                r0.g()
            Lb:
                return
        }

        public final void h(int r5) {
                r4 = this;
                r0 = 64
                if (r5 < r0) goto Le
                r4.c()
                androidx.recyclerview.widget.b$a r1 = r4.b
                int r5 = r5 - r0
                r1.h(r5)
                return
            Le:
                long r0 = r4.f993a
                r2 = 1
                long r2 = r2 << r5
                long r0 = r0 | r2
                r4.f993a = r0
                return
        }

        public final java.lang.String toString() {
                r3 = this;
                androidx.recyclerview.widget.b$a r0 = r3.b
                if (r0 != 0) goto Lb
                long r0 = r3.f993a
                java.lang.String r0 = java.lang.Long.toBinaryString(r0)
                return r0
            Lb:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                androidx.recyclerview.widget.b$a r1 = r3.b
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "xx"
                r0.append(r1)
                long r1 = r3.f993a
                java.lang.String r1 = java.lang.Long.toBinaryString(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public C0507b(androidx.recyclerview.widget.v r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r1.f992a = r2
            androidx.recyclerview.widget.b$a r2 = new androidx.recyclerview.widget.b$a
            r2.<init>()
            r1.b = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.c = r2
            return
    }

    public final void a(android.view.View r3, int r4, boolean r5) {
            r2 = this;
            androidx.recyclerview.widget.v r0 = r2.f992a
            androidx.recyclerview.widget.RecyclerView r0 = r0.f1015a
            if (r4 >= 0) goto Lb
            int r4 = r0.getChildCount()
            goto Lf
        Lb:
            int r4 = r2.f(r4)
        Lf:
            androidx.recyclerview.widget.b$a r1 = r2.b
            r1.e(r4, r5)
            if (r5 == 0) goto L19
            r2.i(r3)
        L19:
            r0.addView(r3, r4)
            androidx.recyclerview.widget.RecyclerView.L(r3)
            return
    }

    public final void b(android.view.View r4, int r5, android.view.ViewGroup.LayoutParams r6, boolean r7) {
            r3 = this;
            androidx.recyclerview.widget.v r0 = r3.f992a
            androidx.recyclerview.widget.RecyclerView r0 = r0.f1015a
            if (r5 >= 0) goto Lb
            int r5 = r0.getChildCount()
            goto Lf
        Lb:
            int r5 = r3.f(r5)
        Lf:
            androidx.recyclerview.widget.b$a r1 = r3.b
            r1.e(r5, r7)
            if (r7 == 0) goto L19
            r3.i(r4)
        L19:
            androidx.recyclerview.widget.RecyclerView$A r7 = androidx.recyclerview.widget.RecyclerView.L(r4)
            if (r7 == 0) goto L5e
            boolean r1 = r7.j()
            if (r1 != 0) goto L40
            boolean r1 = r7.o()
            if (r1 == 0) goto L2c
            goto L40
        L2c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Called attach on a child which is not detached: "
            r5.<init>(r6)
            r5.append(r7)
            java.lang.String r5 = a.C0487z.d(r0, r5)
            r4.<init>(r5)
            throw r4
        L40:
            boolean r1 = androidx.recyclerview.widget.RecyclerView.z0
            if (r1 == 0) goto L57
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "reAttach "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RecyclerView"
            android.util.Log.d(r2, r1)
        L57:
            int r1 = r7.j
            r1 = r1 & (-257(0xfffffffffffffeff, float:NaN))
            r7.j = r1
            goto L62
        L5e:
            boolean r7 = androidx.recyclerview.widget.RecyclerView.y0
            if (r7 != 0) goto L66
        L62:
            androidx.recyclerview.widget.RecyclerView.a(r0, r4, r5, r6)
            return
        L66:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "No ViewHolder found for child: "
            r7.<init>(r1)
            r7.append(r4)
            java.lang.String r4 = ", index: "
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = a.C0487z.d(r0, r7)
            r6.<init>(r4)
            throw r6
    }

    public final void c(int r5) {
            r4 = this;
            int r5 = r4.f(r5)
            androidx.recyclerview.widget.b$a r0 = r4.b
            r0.f(r5)
            androidx.recyclerview.widget.v r0 = r4.f992a
            androidx.recyclerview.widget.RecyclerView r0 = r0.f1015a
            android.view.View r1 = r0.getChildAt(r5)
            if (r1 == 0) goto L57
            androidx.recyclerview.widget.RecyclerView$A r1 = androidx.recyclerview.widget.RecyclerView.L(r1)
            if (r1 == 0) goto L5b
            boolean r2 = r1.j()
            if (r2 == 0) goto L3a
            boolean r2 = r1.o()
            if (r2 == 0) goto L26
            goto L3a
        L26:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "called detach on an already detached child "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r0 = a.C0487z.d(r0, r2)
            r5.<init>(r0)
            throw r5
        L3a:
            boolean r2 = androidx.recyclerview.widget.RecyclerView.z0
            if (r2 == 0) goto L51
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "tmpDetach "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RecyclerView"
            android.util.Log.d(r3, r2)
        L51:
            r2 = 256(0x100, float:3.59E-43)
            r1.a(r2)
            goto L5b
        L57:
            boolean r1 = androidx.recyclerview.widget.RecyclerView.y0
            if (r1 != 0) goto L5f
        L5b:
            androidx.recyclerview.widget.RecyclerView.b(r0, r5)
            return
        L5f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "No view at offset "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = a.C0487z.d(r0, r2)
            r1.<init>(r5)
            throw r1
    }

    public final android.view.View d(int r2) {
            r1 = this;
            int r2 = r1.f(r2)
            androidx.recyclerview.widget.v r0 = r1.f992a
            androidx.recyclerview.widget.RecyclerView r0 = r0.f1015a
            android.view.View r2 = r0.getChildAt(r2)
            return r2
    }

    public final int e() {
            r2 = this;
            androidx.recyclerview.widget.v r0 = r2.f992a
            androidx.recyclerview.widget.RecyclerView r0 = r0.f1015a
            int r0 = r0.getChildCount()
            java.util.ArrayList r1 = r2.c
            int r1 = r1.size()
            int r0 = r0 - r1
            return r0
    }

    public final int f(int r5) {
            r4 = this;
            if (r5 >= 0) goto L3
            goto L26
        L3:
            androidx.recyclerview.widget.v r0 = r4.f992a
            androidx.recyclerview.widget.RecyclerView r0 = r0.f1015a
            int r0 = r0.getChildCount()
            r1 = r5
        Lc:
            if (r1 >= r0) goto L26
            androidx.recyclerview.widget.b$a r2 = r4.b
            int r3 = r2.b(r1)
            int r3 = r1 - r3
            int r3 = r5 - r3
            if (r3 != 0) goto L24
        L1a:
            boolean r5 = r2.d(r1)
            if (r5 == 0) goto L23
            int r1 = r1 + 1
            goto L1a
        L23:
            return r1
        L24:
            int r1 = r1 + r3
            goto Lc
        L26:
            r5 = -1
            return r5
    }

    public final android.view.View g(int r2) {
            r1 = this;
            androidx.recyclerview.widget.v r0 = r1.f992a
            androidx.recyclerview.widget.RecyclerView r0 = r0.f1015a
            android.view.View r2 = r0.getChildAt(r2)
            return r2
    }

    public final int h() {
            r1 = this;
            androidx.recyclerview.widget.v r0 = r1.f992a
            androidx.recyclerview.widget.RecyclerView r0 = r0.f1015a
            int r0 = r0.getChildCount()
            return r0
    }

    public final void i(android.view.View r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.c
            r0.add(r5)
            androidx.recyclerview.widget.v r0 = r4.f992a
            androidx.recyclerview.widget.RecyclerView$A r5 = androidx.recyclerview.widget.RecyclerView.L(r5)
            if (r5 == 0) goto L35
            int r1 = r5.q
            r2 = -1
            android.view.View r3 = r5.f963a
            if (r1 == r2) goto L17
            r5.p = r1
            goto L1f
        L17:
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            int r1 = r3.getImportantForAccessibility()
            r5.p = r1
        L1f:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f1015a
            boolean r1 = r0.O()
            r2 = 4
            if (r1 == 0) goto L30
            r5.q = r2
            java.util.ArrayList r0 = r0.s0
            r0.add(r5)
            return
        L30:
            java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
            r3.setImportantForAccessibility(r2)
        L35:
            return
    }

    public final void j(android.view.View r4) {
            r3 = this;
            java.util.ArrayList r0 = r3.c
            boolean r0 = r0.remove(r4)
            if (r0 == 0) goto L2c
            androidx.recyclerview.widget.v r0 = r3.f992a
            androidx.recyclerview.widget.RecyclerView$A r4 = androidx.recyclerview.widget.RecyclerView.L(r4)
            if (r4 == 0) goto L2c
            int r1 = r4.p
            androidx.recyclerview.widget.RecyclerView r0 = r0.f1015a
            boolean r2 = r0.O()
            if (r2 == 0) goto L22
            r4.q = r1
            java.util.ArrayList r0 = r0.s0
            r0.add(r4)
            goto L29
        L22:
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            android.view.View r0 = r4.f963a
            r0.setImportantForAccessibility(r1)
        L29:
            r0 = 0
            r4.p = r0
        L2c:
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            androidx.recyclerview.widget.b$a r1 = r2.b
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ", hidden list:"
            r0.append(r1)
            java.util.ArrayList r1 = r2.c
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
