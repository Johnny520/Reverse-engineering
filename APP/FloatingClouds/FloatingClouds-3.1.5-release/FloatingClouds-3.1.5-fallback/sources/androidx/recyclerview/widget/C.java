package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.C0162ge<androidx.recyclerview.widget.RecyclerView.A, androidx.recyclerview.widget.C.a> f955a;
    public final a.U9<androidx.recyclerview.widget.RecyclerView.A> b;

    public static class a {
        public static final a.Cc d = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f956a;
        public androidx.recyclerview.widget.RecyclerView.i.b b;
        public androidx.recyclerview.widget.RecyclerView.i.b c;

        static {
                a.Cc r0 = new a.Cc
                r1 = 20
                r0.<init>(r1)
                androidx.recyclerview.widget.C.a.d = r0
                return
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public static androidx.recyclerview.widget.C.a a() {
                a.Cc r0 = androidx.recyclerview.widget.C.a.d
                java.lang.Object r0 = r0.a()
                androidx.recyclerview.widget.C$a r0 = (androidx.recyclerview.widget.C.a) r0
                if (r0 != 0) goto Lf
                androidx.recyclerview.widget.C$a r0 = new androidx.recyclerview.widget.C$a
                r0.<init>()
            Lf:
                return r0
        }
    }

    public C() {
            r1 = this;
            r1.<init>()
            a.ge r0 = new a.ge
            r0.<init>()
            r1.f955a = r0
            a.U9 r0 = new a.U9
            r0.<init>()
            r1.b = r0
            return
    }

    public final void a(androidx.recyclerview.widget.RecyclerView.A r3, androidx.recyclerview.widget.RecyclerView.i.b r4) {
            r2 = this;
            a.ge<androidx.recyclerview.widget.RecyclerView$A, androidx.recyclerview.widget.C$a> r0 = r2.f955a
            r1 = 0
            java.lang.Object r1 = r0.getOrDefault(r3, r1)
            androidx.recyclerview.widget.C$a r1 = (androidx.recyclerview.widget.C.a) r1
            if (r1 != 0) goto L12
            androidx.recyclerview.widget.C$a r1 = androidx.recyclerview.widget.C.a.a()
            r0.put(r3, r1)
        L12:
            r1.c = r4
            int r3 = r1.f956a
            r3 = r3 | 8
            r1.f956a = r3
            return
    }

    public final androidx.recyclerview.widget.RecyclerView.i.b b(androidx.recyclerview.widget.RecyclerView.A r6, int r7) {
            r5 = this;
            a.ge<androidx.recyclerview.widget.RecyclerView$A, androidx.recyclerview.widget.C$a> r0 = r5.f955a
            int r6 = r0.e(r6)
            r1 = 0
            if (r6 >= 0) goto La
            goto L44
        La:
            java.lang.Object r2 = r0.j(r6)
            androidx.recyclerview.widget.C$a r2 = (androidx.recyclerview.widget.C.a) r2
            if (r2 == 0) goto L44
            int r3 = r2.f956a
            r4 = r3 & r7
            if (r4 == 0) goto L44
            int r4 = ~r7
            r3 = r3 & r4
            r2.f956a = r3
            r4 = 4
            if (r7 != r4) goto L22
            androidx.recyclerview.widget.RecyclerView$i$b r7 = r2.b
            goto L28
        L22:
            r4 = 8
            if (r7 != r4) goto L3c
            androidx.recyclerview.widget.RecyclerView$i$b r7 = r2.c
        L28:
            r3 = r3 & 12
            if (r3 != 0) goto L3b
            r0.i(r6)
            r6 = 0
            r2.f956a = r6
            r2.b = r1
            r2.c = r1
            a.Cc r6 = androidx.recyclerview.widget.C.a.d
            r6.c(r2)
        L3b:
            return r7
        L3c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Must provide flag PRE or POST"
            r6.<init>(r7)
            throw r6
        L44:
            return r1
    }

    public final void c(androidx.recyclerview.widget.RecyclerView.A r3) {
            r2 = this;
            a.ge<androidx.recyclerview.widget.RecyclerView$A, androidx.recyclerview.widget.C$a> r0 = r2.f955a
            r1 = 0
            java.lang.Object r3 = r0.getOrDefault(r3, r1)
            androidx.recyclerview.widget.C$a r3 = (androidx.recyclerview.widget.C.a) r3
            if (r3 != 0) goto Lc
            return
        Lc:
            int r0 = r3.f956a
            r0 = r0 & (-2)
            r3.f956a = r0
            return
    }

    public final void d(androidx.recyclerview.widget.RecyclerView.A r7) {
            r6 = this;
            a.U9<androidx.recyclerview.widget.RecyclerView$A> r0 = r6.b
            int r1 = r0.e()
            r2 = 1
            int r1 = r1 - r2
        L8:
            if (r1 < 0) goto L20
            java.lang.Object r3 = r0.f(r1)
            if (r7 != r3) goto L1d
            java.lang.Object[] r3 = r0.c
            r4 = r3[r1]
            java.lang.Object r5 = a.U9.e
            if (r4 == r5) goto L20
            r3[r1] = r5
            r0.f290a = r2
            goto L20
        L1d:
            int r1 = r1 + (-1)
            goto L8
        L20:
            a.ge<androidx.recyclerview.widget.RecyclerView$A, androidx.recyclerview.widget.C$a> r0 = r6.f955a
            java.lang.Object r7 = r0.remove(r7)
            androidx.recyclerview.widget.C$a r7 = (androidx.recyclerview.widget.C.a) r7
            if (r7 == 0) goto L37
            r0 = 0
            r7.f956a = r0
            r0 = 0
            r7.b = r0
            r7.c = r0
            a.Cc r0 = androidx.recyclerview.widget.C.a.d
            r0.c(r7)
        L37:
            return
    }
}
