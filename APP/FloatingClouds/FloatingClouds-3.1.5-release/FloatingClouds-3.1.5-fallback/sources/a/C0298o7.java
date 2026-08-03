package a;

/* JADX INFO: renamed from: a.o7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0298o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0298o7.b f620a = null;

    /* JADX INFO: renamed from: a.o7$a */
    public enum a extends java.lang.Enum<a.C0298o7.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.C0298o7.a f621a = null;
        public static final a.C0298o7.a b = null;
        public static final a.C0298o7.a c = null;
        public static final a.C0298o7.a d = null;
        public static final /* synthetic */ a.C0298o7.a[] e = null;

        static {
                a.o7$a r0 = new a.o7$a
                java.lang.String r1 = "PENALTY_LOG"
                r2 = 0
                r0.<init>(r1, r2)
                a.o7$a r1 = new a.o7$a
                java.lang.String r2 = "PENALTY_DEATH"
                r3 = 1
                r1.<init>(r2, r3)
                a.o7$a r2 = new a.o7$a
                java.lang.String r3 = "DETECT_FRAGMENT_REUSE"
                r4 = 2
                r2.<init>(r3, r4)
                a.C0298o7.a.f621a = r2
                a.o7$a r3 = new a.o7$a
                java.lang.String r4 = "DETECT_FRAGMENT_TAG_USAGE"
                r5 = 3
                r3.<init>(r4, r5)
                a.C0298o7.a.b = r3
                a.o7$a r4 = new a.o7$a
                java.lang.String r5 = "DETECT_WRONG_NESTED_HIERARCHY"
                r6 = 4
                r4.<init>(r5, r6)
                a.C0298o7.a.c = r4
                a.o7$a r5 = new a.o7$a
                java.lang.String r6 = "DETECT_RETAIN_INSTANCE_USAGE"
                r7 = 5
                r5.<init>(r6, r7)
                a.o7$a r6 = new a.o7$a
                java.lang.String r7 = "DETECT_SET_USER_VISIBLE_HINT"
                r8 = 6
                r6.<init>(r7, r8)
                a.o7$a r7 = new a.o7$a
                java.lang.String r8 = "DETECT_TARGET_FRAGMENT_USAGE"
                r9 = 7
                r7.<init>(r8, r9)
                a.o7$a r8 = new a.o7$a
                java.lang.String r9 = "DETECT_WRONG_FRAGMENT_CONTAINER"
                r10 = 8
                r8.<init>(r9, r10)
                a.C0298o7.a.d = r8
                a.o7$a[] r0 = new a.C0298o7.a[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
                a.C0298o7.a.e = r0
                return
        }

        a() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public static a.C0298o7.a valueOf(java.lang.String r1) {
                java.lang.Class<a.o7$a> r0 = a.C0298o7.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                a.o7$a r1 = (a.C0298o7.a) r1
                return r1
        }

        public static a.C0298o7.a[] values() {
                a.o7$a[] r0 = a.C0298o7.a.e
                java.lang.Object r0 = r0.clone()
                a.o7$a[] r0 = (a.C0298o7.a[]) r0
                return r0
        }
    }

    /* JADX INFO: renamed from: a.o7$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.C0298o7.b f622a = null;

        static {
                a.o7$b r0 = new a.o7$b
                r0.<init>()
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                a.C0298o7.b.f622a = r0
                return
        }
    }

    static {
            a.o7$b r0 = a.C0298o7.b.f622a
            a.C0298o7.f620a = r0
            return
    }

    public static a.C0298o7.b a(androidx.fragment.app.b r1) {
        L0:
            if (r1 == 0) goto Le
            boolean r0 = r1.i()
            if (r0 == 0) goto Lb
            r1.f()
        Lb:
            androidx.fragment.app.b r1 = r1.w
            goto L0
        Le:
            a.o7$b r1 = a.C0298o7.f620a
            return r1
    }

    public static void b(a.C0262m7 r2) {
            r0 = 3
            boolean r0 = a.AbstractC0119e7.J(r0)
            if (r0 == 0) goto L1c
            androidx.fragment.app.b r0 = r2.f573a
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "StrictMode violation in "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0, r2)
        L1c:
            return
    }

    public static final void c(androidx.fragment.app.b r3, java.lang.String r4) {
            java.lang.String r0 = "fragment"
            a.C0193i9.e(r3, r0)
            java.lang.String r0 = "previousFragmentId"
            a.C0193i9.e(r4, r0)
            a.m7 r0 = new a.m7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempting to reuse fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " with previous ID "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r3, r4)
            b(r0)
            a.o7$b r3 = a(r3)
            r3.getClass()
            return
    }
}
