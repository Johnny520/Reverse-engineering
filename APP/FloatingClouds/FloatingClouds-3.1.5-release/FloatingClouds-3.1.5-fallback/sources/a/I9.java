package a;

/* JADX INFO: loaded from: classes.dex */
public final class I9 extends a.H9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.InterfaceC0479y9 f123a;
    public final a.I9.b b;

    public static class a<D> extends a.Bb<D> {
        @Override // androidx.lifecycle.LiveData
        public final void e() {
                r1 = this;
                r0 = 0
                throw r0
        }

        @Override // androidx.lifecycle.LiveData
        public final void f() {
                r1 = this;
                r0 = 0
                throw r0
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 64
                r0.<init>(r1)
                java.lang.String r1 = "LoaderInfo{"
                r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " #0 : "
                r0.append(r1)
                java.lang.String r1 = "null"
                r0.append(r1)
                java.lang.String r1 = "}}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class b extends a.Dg {
        public static final a.I9.b.a e = null;
        public final a.C0305oe<a.I9.a> d;

        public static class a implements androidx.lifecycle.q.b {
            @Override // androidx.lifecycle.q.b
            public final <T extends a.Dg> T a(java.lang.Class<T> r1) {
                    r0 = this;
                    a.I9$b r1 = new a.I9$b
                    r1.<init>()
                    return r1
            }
        }

        static {
                a.I9$b$a r0 = new a.I9$b$a
                r0.<init>()
                a.I9.b.e = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                a.oe r0 = new a.oe
                r0.<init>()
                r1.d = r0
                return
        }

        @Override // a.Dg
        public final void b() {
                r6 = this;
                a.oe<a.I9$a> r0 = r6.d
                int r1 = r0.c
                r2 = 0
                r3 = 0
                if (r1 > 0) goto L15
                java.lang.Object[] r4 = r0.b
                r5 = r3
            Lb:
                if (r5 >= r1) goto L12
                r4[r5] = r2
                int r5 = r5 + 1
                goto Lb
            L12:
                r0.c = r3
                return
            L15:
                java.lang.Object[] r0 = r0.b
                r0 = r0[r3]
                a.I9$a r0 = (a.I9.a) r0
                r0.getClass()
                throw r2
        }
    }

    public I9(a.InterfaceC0479y9 r3, a.Fg r4) {
            r2 = this;
            r2.<init>()
            r2.f123a = r3
            androidx.lifecycle.q r3 = new androidx.lifecycle.q
            a.I9$b$a r0 = a.I9.b.e
            r3.<init>(r4, r0)
            java.lang.Class<a.I9$b> r4 = a.I9.b.class
            java.lang.String r0 = r4.getCanonicalName()
            if (r0 == 0) goto L23
            java.lang.String r1 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r0 = r1.concat(r0)
            a.Dg r3 = r3.a(r4, r0)
            a.I9$b r3 = (a.I9.b) r3
            r2.b = r3
            return
        L23:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Local and anonymous classes can not be ViewModels"
            r3.<init>(r4)
            throw r3
    }

    @java.lang.Deprecated
    public final void a(java.lang.String r5, java.io.PrintWriter r6) {
            r4 = this;
            a.I9$b r0 = r4.b
            a.oe<a.I9$a> r0 = r0.d
            int r1 = r0.c
            if (r1 <= 0) goto L68
            r6.print(r5)
            java.lang.String r1 = "Loaders:"
            r6.println(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r2 = "    "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            int r2 = r0.c
            if (r2 > 0) goto L26
            goto L68
        L26:
            java.lang.Object[] r2 = r0.b
            r3 = 0
            r2 = r2[r3]
            a.I9$a r2 = (a.I9.a) r2
            r6.print(r5)
            java.lang.String r5 = "  #"
            r6.print(r5)
            int[] r5 = r0.f627a
            r5 = r5[r3]
            r6.print(r5)
            java.lang.String r5 = ": "
            r6.print(r5)
            java.lang.String r5 = r2.toString()
            r6.println(r5)
            r6.print(r1)
            java.lang.String r5 = "mId="
            r6.print(r5)
            r6.print(r3)
            java.lang.String r5 = " mArgs="
            r6.print(r5)
            r5 = 0
            r6.println(r5)
            r6.print(r1)
            java.lang.String r0 = "mLoader="
            r6.print(r0)
            r6.println(r5)
            throw r5
        L68:
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "LoaderManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            a.y9 r1 = r4.f123a
            if (r1 != 0) goto L26
            java.lang.String r1 = "null"
            r0.append(r1)
            goto L5d
        L26:
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getSimpleName()
            int r3 = r2.length()
            if (r3 > 0) goto L4a
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            r3 = 46
            int r3 = r2.lastIndexOf(r3)
            if (r3 <= 0) goto L4a
            int r3 = r3 + 1
            java.lang.String r2 = r2.substring(r3)
        L4a:
            r0.append(r2)
            r2 = 123(0x7b, float:1.72E-43)
            r0.append(r2)
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L5d:
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
