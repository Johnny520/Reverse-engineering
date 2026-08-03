package a;

/* JADX INFO: loaded from: classes.dex */
public final class M3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.HashSet<a.M3> f171a;
    public final a.N3 b;
    public final a.M3.a c;
    public a.M3 d;
    public int e;
    public int f;
    public a.C0251le g;

    public enum a extends java.lang.Enum<a.M3.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.M3.a f172a = null;
        public static final a.M3.a b = null;
        public static final a.M3.a c = null;
        public static final a.M3.a d = null;
        public static final a.M3.a e = null;
        public static final a.M3.a f = null;
        public static final a.M3.a g = null;
        public static final a.M3.a h = null;
        public static final /* synthetic */ a.M3.a[] i = null;

        static {
                a.M3$a r0 = new a.M3$a
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                a.M3$a r1 = new a.M3$a
                java.lang.String r2 = "LEFT"
                r3 = 1
                r1.<init>(r2, r3)
                a.M3.a.f172a = r1
                a.M3$a r2 = new a.M3$a
                java.lang.String r3 = "TOP"
                r4 = 2
                r2.<init>(r3, r4)
                a.M3.a.b = r2
                a.M3$a r3 = new a.M3$a
                java.lang.String r4 = "RIGHT"
                r5 = 3
                r3.<init>(r4, r5)
                a.M3.a.c = r3
                a.M3$a r4 = new a.M3$a
                java.lang.String r5 = "BOTTOM"
                r6 = 4
                r4.<init>(r5, r6)
                a.M3.a.d = r4
                a.M3$a r5 = new a.M3$a
                java.lang.String r6 = "BASELINE"
                r7 = 5
                r5.<init>(r6, r7)
                a.M3.a.e = r5
                a.M3$a r6 = new a.M3$a
                java.lang.String r7 = "CENTER"
                r8 = 6
                r6.<init>(r7, r8)
                a.M3.a.f = r6
                a.M3$a r7 = new a.M3$a
                java.lang.String r8 = "CENTER_X"
                r9 = 7
                r7.<init>(r8, r9)
                a.M3.a.g = r7
                a.M3$a r8 = new a.M3$a
                java.lang.String r9 = "CENTER_Y"
                r10 = 8
                r8.<init>(r9, r10)
                a.M3.a.h = r8
                a.M3$a[] r0 = new a.M3.a[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
                a.M3.a.i = r0
                return
        }

        a() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public static a.M3.a valueOf(java.lang.String r1) {
                java.lang.Class<a.M3$a> r0 = a.M3.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                a.M3$a r1 = (a.M3.a) r1
                return r1
        }

        public static a.M3.a[] values() {
                a.M3$a[] r0 = a.M3.a.i
                java.lang.Object r0 = r0.clone()
                a.M3$a[] r0 = (a.M3.a[]) r0
                return r0
        }
    }

    public M3(a.N3 r2, a.M3.a r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f171a = r0
            r0 = 0
            r1.e = r0
            r0 = -1
            r1.f = r0
            r1.b = r2
            r1.c = r3
            return
    }

    public final void a(a.M3 r3, int r4) {
            r2 = this;
            r0 = -1
            r1 = 0
            r2.b(r3, r4, r0, r1)
            return
    }

    public final boolean b(a.M3 r3, int r4, int r5, boolean r6) {
            r2 = this;
            r0 = 1
            if (r3 != 0) goto L7
            r2.h()
            return r0
        L7:
            r1 = 0
            if (r6 != 0) goto L11
            boolean r6 = r2.g(r3)
            if (r6 != 0) goto L11
            return r1
        L11:
            r2.d = r3
            java.util.HashSet<a.M3> r6 = r3.f171a
            if (r6 != 0) goto L1e
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r3.f171a = r6
        L1e:
            a.M3 r3 = r2.d
            java.util.HashSet<a.M3> r3 = r3.f171a
            r3.add(r2)
            if (r4 <= 0) goto L2a
            r2.e = r4
            goto L2c
        L2a:
            r2.e = r1
        L2c:
            r2.f = r5
            return r0
    }

    public final int c() {
            r3 = this;
            a.N3 r0 = r3.b
            int r0 = r0.X
            r1 = 8
            if (r0 != r1) goto La
            r0 = 0
            return r0
        La:
            int r0 = r3.f
            r2 = -1
            if (r0 <= r2) goto L1a
            a.M3 r2 = r3.d
            if (r2 == 0) goto L1a
            a.N3 r2 = r2.b
            int r2 = r2.X
            if (r2 != r1) goto L1a
            return r0
        L1a:
            int r0 = r3.e
            return r0
    }

    public final a.M3 d() {
            r3 = this;
            a.M3$a r0 = r3.c
            int r1 = r0.ordinal()
            a.N3 r2 = r3.b
            switch(r1) {
                case 0: goto L21;
                case 1: goto L1e;
                case 2: goto L1b;
                case 3: goto L18;
                case 4: goto L15;
                case 5: goto L21;
                case 6: goto L21;
                case 7: goto L21;
                case 8: goto L21;
                default: goto Lb;
            }
        Lb:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r0 = r0.name()
            r1.<init>(r0)
            throw r1
        L15:
            a.M3 r0 = r2.z
            return r0
        L18:
            a.M3 r0 = r2.y
            return r0
        L1b:
            a.M3 r0 = r2.B
            return r0
        L1e:
            a.M3 r0 = r2.A
            return r0
        L21:
            r0 = 0
            return r0
    }

    public final boolean e() {
            r3 = this;
            java.util.HashSet<a.M3> r0 = r3.f171a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r0.next()
            a.M3 r2 = (a.M3) r2
            a.M3 r2 = r2.d()
            boolean r2 = r2.f()
            if (r2 == 0) goto La
            r0 = 1
            return r0
        L22:
            return r1
    }

    public final boolean f() {
            r1 = this;
            a.M3 r0 = r1.d
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean g(a.M3 r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            a.M3$a r1 = a.M3.a.e
            a.M3$a r2 = r8.c
            r3 = 1
            a.N3 r4 = r9.b
            a.M3$a r9 = r9.c
            if (r9 != r2) goto L1d
            if (r2 != r1) goto L1c
            boolean r9 = r4.w
            if (r9 == 0) goto L1b
            a.N3 r9 = r8.b
            boolean r9 = r9.w
            if (r9 != 0) goto L1c
        L1b:
            return r0
        L1c:
            return r3
        L1d:
            int r5 = r2.ordinal()
            a.M3$a r6 = a.M3.a.g
            a.M3$a r7 = a.M3.a.h
            switch(r5) {
                case 0: goto L6a;
                case 1: goto L52;
                case 2: goto L3a;
                case 3: goto L52;
                case 4: goto L3a;
                case 5: goto L6a;
                case 6: goto L32;
                case 7: goto L6a;
                case 8: goto L6a;
                default: goto L28;
            }
        L28:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r0 = r2.name()
            r9.<init>(r0)
            throw r9
        L32:
            if (r9 == r1) goto L39
            if (r9 == r6) goto L39
            if (r9 == r7) goto L39
            return r3
        L39:
            return r0
        L3a:
            a.M3$a r1 = a.M3.a.b
            if (r9 == r1) goto L45
            a.M3$a r1 = a.M3.a.d
            if (r9 != r1) goto L43
            goto L45
        L43:
            r1 = r0
            goto L46
        L45:
            r1 = r3
        L46:
            boolean r2 = r4 instanceof a.C0046a8
            if (r2 == 0) goto L51
            if (r1 != 0) goto L50
            if (r9 != r7) goto L4f
            goto L50
        L4f:
            return r0
        L50:
            return r3
        L51:
            return r1
        L52:
            a.M3$a r1 = a.M3.a.f172a
            if (r9 == r1) goto L5d
            a.M3$a r1 = a.M3.a.c
            if (r9 != r1) goto L5b
            goto L5d
        L5b:
            r1 = r0
            goto L5e
        L5d:
            r1 = r3
        L5e:
            boolean r2 = r4 instanceof a.C0046a8
            if (r2 == 0) goto L69
            if (r1 != 0) goto L68
            if (r9 != r6) goto L67
            goto L68
        L67:
            return r0
        L68:
            return r3
        L69:
            return r1
        L6a:
            return r0
    }

    public final void h() {
            r1 = this;
            a.M3 r0 = r1.d
            if (r0 == 0) goto Lb
            java.util.HashSet<a.M3> r0 = r0.f171a
            if (r0 == 0) goto Lb
            r0.remove(r1)
        Lb:
            r0 = 0
            r1.d = r0
            r0 = 0
            r1.e = r0
            r0 = -1
            r1.f = r0
            return
    }

    public final void i() {
            r2 = this;
            a.le r0 = r2.g
            if (r0 != 0) goto Le
            a.le r0 = new a.le
            a.le$a r1 = a.C0251le.a.f564a
            r0.<init>(r1)
            r2.g = r0
            return
        Le:
            r0.c()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            a.N3 r1 = r2.b
            java.lang.String r1 = r1.Y
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            a.M3$a r1 = r2.c
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
