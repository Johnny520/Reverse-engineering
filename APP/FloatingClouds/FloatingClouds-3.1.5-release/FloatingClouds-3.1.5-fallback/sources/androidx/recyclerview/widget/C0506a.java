package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0506a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.Cc f990a;
    public final java.util.ArrayList<androidx.recyclerview.widget.C0506a.C0023a> b;
    public final java.util.ArrayList<androidx.recyclerview.widget.C0506a.C0023a> c;
    public final androidx.recyclerview.widget.w d;
    public final androidx.recyclerview.widget.p e;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public static final class C0023a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f991a;
        public int b;
        public int c;

        public final boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                goto L2d
            L4:
                boolean r1 = r4 instanceof androidx.recyclerview.widget.C0506a.C0023a
                if (r1 != 0) goto L9
                goto L3b
            L9:
                androidx.recyclerview.widget.a$a r4 = (androidx.recyclerview.widget.C0506a.C0023a) r4
                int r1 = r3.f991a
                int r2 = r4.f991a
                if (r1 == r2) goto L12
                goto L3b
            L12:
                r2 = 8
                if (r1 != r2) goto L2e
                int r1 = r3.c
                int r2 = r3.b
                int r1 = r1 - r2
                int r1 = java.lang.Math.abs(r1)
                if (r1 != r0) goto L2e
                int r1 = r3.c
                int r2 = r4.b
                if (r1 != r2) goto L2e
                int r1 = r3.b
                int r2 = r4.c
                if (r1 != r2) goto L2e
            L2d:
                return r0
            L2e:
                int r1 = r3.c
                int r2 = r4.c
                if (r1 == r2) goto L35
                goto L3b
            L35:
                int r1 = r3.b
                int r4 = r4.b
                if (r1 == r4) goto L3d
            L3b:
                r4 = 0
                return r4
            L3d:
                return r0
        }

        public final int hashCode() {
                r2 = this;
                int r0 = r2.f991a
                int r0 = r0 * 31
                int r1 = r2.b
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.c
                int r0 = r0 + r1
                return r0
        }

        public final java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = java.lang.System.identityHashCode(r3)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = "["
                r0.append(r1)
                int r1 = r3.f991a
                r2 = 1
                if (r1 == r2) goto L30
                r2 = 2
                if (r1 == r2) goto L2d
                r2 = 4
                if (r1 == r2) goto L2a
                r2 = 8
                if (r1 == r2) goto L27
                java.lang.String r1 = "??"
                goto L32
            L27:
                java.lang.String r1 = "mv"
                goto L32
            L2a:
                java.lang.String r1 = "up"
                goto L32
            L2d:
                java.lang.String r1 = "rm"
                goto L32
            L30:
                java.lang.String r1 = "add"
            L32:
                r0.append(r1)
                java.lang.String r1 = ",s:"
                r0.append(r1)
                int r1 = r3.b
                r0.append(r1)
                java.lang.String r1 = "c:"
                r0.append(r1)
                int r1 = r3.c
                r0.append(r1)
                java.lang.String r1 = ",p:null]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public C0506a(androidx.recyclerview.widget.w r3) {
            r2 = this;
            r2.<init>()
            a.Cc r0 = new a.Cc
            r1 = 30
            r0.<init>(r1)
            r2.f990a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.c = r0
            r2.d = r3
            androidx.recyclerview.widget.p r3 = new androidx.recyclerview.widget.p
            r3.<init>(r2)
            r2.e = r3
            return
    }

    public final boolean a(int r9) {
            r8 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$a> r0 = r8.c
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L3a
            java.lang.Object r4 = r0.get(r3)
            androidx.recyclerview.widget.a$a r4 = (androidx.recyclerview.widget.C0506a.C0023a) r4
            int r5 = r4.f991a
            r6 = 8
            r7 = 1
            if (r5 != r6) goto L22
            int r4 = r4.c
            int r5 = r3 + 1
            int r4 = r8.e(r4, r5)
            if (r4 != r9) goto L37
            goto L33
        L22:
            if (r5 != r7) goto L37
            int r5 = r4.b
            int r4 = r4.c
            int r4 = r4 + r5
        L29:
            if (r5 >= r4) goto L37
            int r6 = r3 + 1
            int r6 = r8.e(r5, r6)
            if (r6 != r9) goto L34
        L33:
            return r7
        L34:
            int r5 = r5 + 1
            goto L29
        L37:
            int r3 = r3 + 1
            goto L8
        L3a:
            return r2
    }

    public final void b() {
            r8 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$a> r0 = r8.c
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L17
            java.lang.Object r3 = r0.get(r2)
            androidx.recyclerview.widget.a$a r3 = (androidx.recyclerview.widget.C0506a.C0023a) r3
            androidx.recyclerview.widget.w r4 = r8.d
            r4.a(r3)
            int r2 = r2 + 1
            goto L7
        L17:
            r8.i(r0)
            java.util.ArrayList<androidx.recyclerview.widget.a$a> r0 = r8.b
            int r1 = r0.size()
            r2 = 0
        L21:
            if (r2 >= r1) goto L74
            java.lang.Object r3 = r0.get(r2)
            androidx.recyclerview.widget.a$a r3 = (androidx.recyclerview.widget.C0506a.C0023a) r3
            int r4 = r3.f991a
            r5 = 1
            androidx.recyclerview.widget.w r6 = r8.d
            if (r4 == r5) goto L67
            r7 = 2
            if (r4 == r7) goto L51
            r5 = 4
            if (r4 == r5) goto L46
            r5 = 8
            if (r4 == r5) goto L3b
            goto L71
        L3b:
            r6.a(r3)
            int r4 = r3.b
            int r3 = r3.c
            r6.e(r4, r3)
            goto L71
        L46:
            r6.a(r3)
            int r4 = r3.b
            int r3 = r3.c
            r6.c(r4, r3)
            goto L71
        L51:
            r6.a(r3)
            int r4 = r3.b
            int r3 = r3.c
            androidx.recyclerview.widget.RecyclerView r6 = r6.f1016a
            r6.R(r4, r3, r5)
            r6.i0 = r5
            androidx.recyclerview.widget.RecyclerView$w r4 = r6.f0
            int r5 = r4.c
            int r5 = r5 + r3
            r4.c = r5
            goto L71
        L67:
            r6.a(r3)
            int r4 = r3.b
            int r3 = r3.c
            r6.d(r4, r3)
        L71:
            int r2 = r2 + 1
            goto L21
        L74:
            r8.i(r0)
            return
    }

    public final void c(androidx.recyclerview.widget.C0506a.C0023a r13) {
            r12 = this;
            int r0 = r13.f991a
            r1 = 1
            if (r0 == r1) goto L7a
            r2 = 8
            if (r0 == r2) goto L7a
            int r2 = r13.b
            int r0 = r12.j(r2, r0)
            int r2 = r13.b
            int r3 = r13.f991a
            r4 = 2
            r5 = 4
            if (r3 == r4) goto L2f
            if (r3 != r5) goto L1b
            r3 = r1
            goto L30
        L1b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "op should be remove or update."
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L2f:
            r3 = 0
        L30:
            r6 = r1
            r7 = r6
        L32:
            int r8 = r13.c
            a.Cc r9 = r12.f990a
            if (r6 >= r8) goto L68
            int r8 = r13.b
            int r10 = r3 * r6
            int r10 = r10 + r8
            int r8 = r13.f991a
            int r8 = r12.j(r10, r8)
            int r10 = r13.f991a
            if (r10 == r4) goto L4f
            if (r10 == r5) goto L4a
            goto L54
        L4a:
            int r11 = r0 + 1
            if (r8 != r11) goto L54
            goto L51
        L4f:
            if (r8 != r0) goto L54
        L51:
            int r7 = r7 + 1
            goto L65
        L54:
            androidx.recyclerview.widget.a$a r0 = r12.g(r10, r0, r7)
            r12.d(r0, r2)
            r9.c(r0)
            int r0 = r13.f991a
            if (r0 != r5) goto L63
            int r2 = r2 + r7
        L63:
            r7 = r1
            r0 = r8
        L65:
            int r6 = r6 + 1
            goto L32
        L68:
            r9.c(r13)
            if (r7 <= 0) goto L79
            int r13 = r13.f991a
            androidx.recyclerview.widget.a$a r13 = r12.g(r13, r0, r7)
            r12.d(r13, r2)
            r9.c(r13)
        L79:
            return
        L7a:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "should not dispatch add or move for pre layout"
            r13.<init>(r0)
            throw r13
    }

    public final void d(androidx.recyclerview.widget.C0506a.C0023a r4, int r5) {
            r3 = this;
            androidx.recyclerview.widget.w r0 = r3.d
            r0.a(r4)
            int r1 = r4.f991a
            r2 = 2
            if (r1 == r2) goto L1b
            r2 = 4
            if (r1 != r2) goto L13
            int r4 = r4.c
            r0.c(r5, r4)
            return
        L13:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "only remove and update ops can be dispatched in first pass"
            r4.<init>(r5)
            throw r4
        L1b:
            int r4 = r4.c
            androidx.recyclerview.widget.RecyclerView r0 = r0.f1016a
            r1 = 1
            r0.R(r5, r4, r1)
            r0.i0 = r1
            androidx.recyclerview.widget.RecyclerView$w r5 = r0.f0
            int r0 = r5.c
            int r0 = r0 + r4
            r5.c = r0
            return
    }

    public final int e(int r7, int r8) {
            r6 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$a> r0 = r6.c
            int r1 = r0.size()
        L6:
            if (r8 >= r1) goto L3f
            java.lang.Object r2 = r0.get(r8)
            androidx.recyclerview.widget.a$a r2 = (androidx.recyclerview.widget.C0506a.C0023a) r2
            int r3 = r2.f991a
            r4 = 8
            if (r3 != r4) goto L26
            int r3 = r2.b
            if (r3 != r7) goto L1b
            int r7 = r2.c
            goto L3c
        L1b:
            if (r3 >= r7) goto L1f
            int r7 = r7 + (-1)
        L1f:
            int r2 = r2.c
            if (r2 > r7) goto L3c
            int r7 = r7 + 1
            goto L3c
        L26:
            int r4 = r2.b
            if (r4 > r7) goto L3c
            r5 = 2
            if (r3 != r5) goto L36
            int r2 = r2.c
            int r4 = r4 + r2
            if (r7 >= r4) goto L34
            r7 = -1
            return r7
        L34:
            int r7 = r7 - r2
            goto L3c
        L36:
            r4 = 1
            if (r3 != r4) goto L3c
            int r2 = r2.c
            int r7 = r7 + r2
        L3c:
            int r8 = r8 + 1
            goto L6
        L3f:
            return r7
    }

    public final boolean f() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$a> r0 = r1.b
            int r0 = r0.size()
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final androidx.recyclerview.widget.C0506a.C0023a g(int r2, int r3, int r4) {
            r1 = this;
            a.Cc r0 = r1.f990a
            java.lang.Object r0 = r0.a()
            androidx.recyclerview.widget.a$a r0 = (androidx.recyclerview.widget.C0506a.C0023a) r0
            if (r0 != 0) goto L16
            androidx.recyclerview.widget.a$a r0 = new androidx.recyclerview.widget.a$a
            r0.<init>()
            r0.f991a = r2
            r0.b = r3
            r0.c = r4
            return r0
        L16:
            r0.f991a = r2
            r0.b = r3
            r0.c = r4
            return r0
    }

    public final void h(androidx.recyclerview.widget.C0506a.C0023a r5) {
            r4 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$a> r0 = r4.c
            r0.add(r5)
            int r0 = r5.f991a
            r1 = 1
            androidx.recyclerview.widget.w r2 = r4.d
            if (r0 == r1) goto L47
            r3 = 2
            if (r0 == r3) goto L3a
            r1 = 4
            if (r0 == r1) goto L32
            r1 = 8
            if (r0 != r1) goto L1e
            int r0 = r5.b
            int r5 = r5.c
            r2.e(r0, r5)
            return
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown update op type for "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L32:
            int r0 = r5.b
            int r5 = r5.c
            r2.c(r0, r5)
            return
        L3a:
            int r0 = r5.b
            int r5 = r5.c
            androidx.recyclerview.widget.RecyclerView r2 = r2.f1016a
            r3 = 0
            r2.R(r0, r5, r3)
            r2.i0 = r1
            return
        L47:
            int r0 = r5.b
            int r5 = r5.c
            r2.d(r0, r5)
            return
    }

    public final void i(java.util.ArrayList r5) {
            r4 = this;
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L18
            java.lang.Object r2 = r5.get(r1)
            androidx.recyclerview.widget.a$a r2 = (androidx.recyclerview.widget.C0506a.C0023a) r2
            r2.getClass()
            a.Cc r3 = r4.f990a
            r3.c(r2)
            int r1 = r1 + 1
            goto L5
        L18:
            r5.clear()
            return
    }

    public final int j(int r10, int r11) {
            r9 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$a> r0 = r9.c
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
        L8:
            r3 = 8
            if (r1 < 0) goto L80
            java.lang.Object r4 = r0.get(r1)
            androidx.recyclerview.widget.a$a r4 = (androidx.recyclerview.widget.C0506a.C0023a) r4
            int r5 = r4.f991a
            r6 = 2
            if (r5 != r3) goto L60
            int r3 = r4.b
            int r5 = r4.c
            if (r3 >= r5) goto L20
            r7 = r3
            r8 = r5
            goto L22
        L20:
            r8 = r3
            r7 = r5
        L22:
            if (r10 < r7) goto L48
            if (r10 > r8) goto L48
            if (r7 != r3) goto L38
            if (r11 != r2) goto L2f
            int r5 = r5 + 1
            r4.c = r5
            goto L35
        L2f:
            if (r11 != r6) goto L35
            int r5 = r5 + (-1)
            r4.c = r5
        L35:
            int r10 = r10 + 1
            goto L7d
        L38:
            if (r11 != r2) goto L3f
            int r3 = r3 + 1
            r4.b = r3
            goto L45
        L3f:
            if (r11 != r6) goto L45
            int r3 = r3 + (-1)
            r4.b = r3
        L45:
            int r10 = r10 + (-1)
            goto L7d
        L48:
            if (r10 >= r3) goto L7d
            if (r11 != r2) goto L55
            int r3 = r3 + 1
            r4.b = r3
            int r5 = r5 + 1
            r4.c = r5
            goto L7d
        L55:
            if (r11 != r6) goto L7d
            int r3 = r3 + (-1)
            r4.b = r3
            int r5 = r5 + (-1)
            r4.c = r5
            goto L7d
        L60:
            int r3 = r4.b
            if (r3 > r10) goto L70
            if (r5 != r2) goto L6a
            int r3 = r4.c
            int r10 = r10 - r3
            goto L7d
        L6a:
            if (r5 != r6) goto L7d
            int r3 = r4.c
            int r10 = r10 + r3
            goto L7d
        L70:
            if (r11 != r2) goto L77
            int r3 = r3 + 1
            r4.b = r3
            goto L7d
        L77:
            if (r11 != r6) goto L7d
            int r3 = r3 + (-1)
            r4.b = r3
        L7d:
            int r1 = r1 + (-1)
            goto L8
        L80:
            int r11 = r0.size()
            int r11 = r11 - r2
        L85:
            if (r11 < 0) goto Laf
            java.lang.Object r1 = r0.get(r11)
            androidx.recyclerview.widget.a$a r1 = (androidx.recyclerview.widget.C0506a.C0023a) r1
            int r2 = r1.f991a
            a.Cc r4 = r9.f990a
            if (r2 != r3) goto La2
            int r2 = r1.c
            int r5 = r1.b
            if (r2 == r5) goto L9b
            if (r2 >= 0) goto Lac
        L9b:
            r0.remove(r11)
            r4.c(r1)
            goto Lac
        La2:
            int r2 = r1.c
            if (r2 > 0) goto Lac
            r0.remove(r11)
            r4.c(r1)
        Lac:
            int r11 = r11 + (-1)
            goto L85
        Laf:
            return r10
    }
}
