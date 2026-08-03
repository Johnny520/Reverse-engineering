package a;

/* JADX INFO: renamed from: a.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0422v6 implements a.Pd<java.io.File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.io.File f733a;
    public final a.EnumC0440w6 b;

    /* JADX INFO: renamed from: a.v6$a */
    public static abstract class a extends a.C0422v6.c {
    }

    /* JADX INFO: renamed from: a.v6$b */
    public final class b extends a.AbstractC0415v<java.io.File> {
        public final java.util.ArrayDeque<a.C0422v6.c> c;
        public final /* synthetic */ a.C0422v6 d;

        /* JADX INFO: renamed from: a.v6$b$a */
        public final class a extends a.C0422v6.a {
            public boolean b;
            public java.io.File[] c;
            public int d;
            public boolean e;
            public final /* synthetic */ a.C0422v6.b f;

            public a(a.C0422v6.b r2, java.io.File r3) {
                    r1 = this;
                    java.lang.String r0 = "rootDir"
                    a.C0193i9.e(r3, r0)
                    r1.f = r2
                    r1.<init>(r3)
                    return
            }

            @Override // a.C0422v6.c
            public final java.io.File a() {
                    r6 = this;
                    boolean r0 = r6.e
                    java.io.File r1 = r6.f734a
                    r2 = 1
                    a.v6$b r3 = r6.f
                    if (r0 != 0) goto L21
                    java.io.File[] r0 = r6.c
                    if (r0 != 0) goto L21
                    a.v6 r0 = r3.d
                    r0.getClass()
                    java.io.File[] r0 = r1.listFiles()
                    r6.c = r0
                    if (r0 != 0) goto L21
                    a.v6 r0 = r3.d
                    r0.getClass()
                    r6.e = r2
                L21:
                    java.io.File[] r0 = r6.c
                    if (r0 == 0) goto L36
                    int r4 = r6.d
                    int r5 = r0.length
                    if (r4 >= r5) goto L36
                    a.C0193i9.b(r0)
                    int r1 = r6.d
                    int r2 = r1 + 1
                    r6.d = r2
                    r0 = r0[r1]
                    return r0
                L36:
                    boolean r0 = r6.b
                    if (r0 != 0) goto L3d
                    r6.b = r2
                    return r1
                L3d:
                    a.v6 r0 = r3.d
                    r0.getClass()
                    r0 = 0
                    return r0
            }
        }

        /* JADX INFO: renamed from: a.v6$b$b, reason: collision with other inner class name */
        public final class C0007b extends a.C0422v6.c {
            public boolean b;

            @Override // a.C0422v6.c
            public final java.io.File a() {
                    r1 = this;
                    boolean r0 = r1.b
                    if (r0 == 0) goto L6
                    r0 = 0
                    return r0
                L6:
                    r0 = 1
                    r1.b = r0
                    java.io.File r0 = r1.f734a
                    return r0
            }
        }

        /* JADX INFO: renamed from: a.v6$b$c */
        public final class c extends a.C0422v6.a {
            public boolean b;
            public java.io.File[] c;
            public int d;
            public final /* synthetic */ a.C0422v6.b e;

            public c(a.C0422v6.b r2, java.io.File r3) {
                    r1 = this;
                    java.lang.String r0 = "rootDir"
                    a.C0193i9.e(r3, r0)
                    r1.e = r2
                    r1.<init>(r3)
                    return
            }

            @Override // a.C0422v6.c
            public final java.io.File a() {
                    r6 = this;
                    boolean r0 = r6.b
                    java.io.File r1 = r6.f734a
                    a.v6$b r2 = r6.e
                    if (r0 != 0) goto L11
                    a.v6 r0 = r2.d
                    r0.getClass()
                    r0 = 1
                    r6.b = r0
                    return r1
                L11:
                    java.io.File[] r0 = r6.c
                    r3 = 0
                    if (r0 == 0) goto L22
                    int r4 = r6.d
                    int r5 = r0.length
                    if (r4 >= r5) goto L1c
                    goto L22
                L1c:
                    a.v6 r0 = r2.d
                    r0.getClass()
                    return r3
                L22:
                    if (r0 != 0) goto L3e
                    java.io.File[] r0 = r1.listFiles()
                    r6.c = r0
                    if (r0 != 0) goto L31
                    a.v6 r0 = r2.d
                    r0.getClass()
                L31:
                    java.io.File[] r0 = r6.c
                    if (r0 == 0) goto L38
                    int r0 = r0.length
                    if (r0 != 0) goto L3e
                L38:
                    a.v6 r0 = r2.d
                    r0.getClass()
                    return r3
                L3e:
                    java.io.File[] r0 = r6.c
                    a.C0193i9.b(r0)
                    int r1 = r6.d
                    int r2 = r1 + 1
                    r6.d = r2
                    r0 = r0[r1]
                    return r0
            }
        }

        public b(a.C0422v6 r4) {
                r3 = this;
                r3.<init>()
                r3.d = r4
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
                r3.c = r0
                java.io.File r1 = r4.f733a
                boolean r1 = r1.isDirectory()
                if (r1 == 0) goto L1e
                java.io.File r4 = r4.f733a
                a.v6$a r4 = r3.b(r4)
                r0.push(r4)
                return
            L1e:
                java.io.File r1 = r4.f733a
                boolean r1 = r1.isFile()
                if (r1 == 0) goto L36
                a.v6$b$b r1 = new a.v6$b$b
                java.io.File r4 = r4.f733a
                java.lang.String r2 = "rootFile"
                a.C0193i9.e(r4, r2)
                r1.<init>(r4)
                r0.push(r1)
                return
            L36:
                r4 = 2
                r3.f726a = r4
                return
        }

        public final a.C0422v6.a b(java.io.File r3) {
                r2 = this;
                a.v6 r0 = r2.d
                a.w6 r0 = r0.b
                int r0 = r0.ordinal()
                if (r0 == 0) goto L19
                r1 = 1
                if (r0 != r1) goto L13
                a.v6$b$a r0 = new a.v6$b$a
                r0.<init>(r2, r3)
                return r0
            L13:
                a.Ob r3 = new a.Ob
                r3.<init>()
                throw r3
            L19:
                a.v6$b$c r0 = new a.v6$b$c
                r0.<init>(r2, r3)
                return r0
        }
    }

    /* JADX INFO: renamed from: a.v6$c */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.io.File f734a;

        public c(java.io.File r2) {
                r1 = this;
                java.lang.String r0 = "root"
                a.C0193i9.e(r2, r0)
                r1.<init>()
                r1.f734a = r2
                return
        }

        public abstract java.io.File a();
    }

    public C0422v6(java.io.File r2) {
            r1 = this;
            a.w6 r0 = a.EnumC0440w6.f748a
            r1.<init>()
            r1.f733a = r2
            r1.b = r0
            return
    }

    @Override // a.Pd
    public final java.util.Iterator<java.io.File> iterator() {
            r1 = this;
            a.v6$b r0 = new a.v6$b
            r0.<init>(r1)
            return r0
    }
}
