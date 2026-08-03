package a;

/* JADX INFO: renamed from: a.s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0366s4 implements top.mmjz.floatingclouds.plugin.IPlugin {
    public static volatile boolean F;
    public static volatile boolean G;
    public static volatile boolean H;
    public static a.C0366s4 I;
    public static volatile boolean J;
    public static volatile long K;
    public static volatile long L;
    public static volatile a.C0223k4 M;
    public static volatile java.lang.reflect.Method N;
    public static volatile java.lang.reflect.Field O;
    public static volatile java.lang.reflect.Field P;
    public static volatile java.lang.reflect.Method Q;
    public final a.C0203j2 A;
    public final java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> B;
    public final a.Me C;
    public boolean D;
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Field> E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile java.lang.Class<?> f678a;
    public volatile java.lang.Class<?> b;
    public volatile java.lang.Class<?> c;
    public volatile java.util.List<java.lang.String> d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public final android.os.Handler f;
    public a.RunnableC0205j4 g;
    public volatile boolean h;
    public android.view.View i;
    public java.lang.ref.WeakReference<android.widget.ListView> j;
    public java.lang.ClassLoader k;
    public final java.util.concurrent.CopyOnWriteArrayList<io.github.libxposed.api.XposedInterface.HookHandle> l;
    public final java.util.concurrent.ConcurrentHashMap<java.lang.Object, int[]> m;
    public final java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Boolean> n;
    public final java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Integer> o;
    public final java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Integer> p;
    public final java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Long> q;
    public final java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Long> r;
    public final java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.String> s;
    public final java.util.concurrent.atomic.AtomicInteger t;
    public final java.util.Set<java.lang.Class<?>> u;
    public final java.lang.ThreadLocal<java.lang.Boolean> v;
    public final java.util.Map<java.lang.Object, java.lang.String> w;
    public int x;
    public int y;
    public final java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, java.lang.Boolean> z;

    /* JADX INFO: renamed from: a.s4$a */
    public static final class a {

        /* JADX INFO: renamed from: a.s4$a$a, reason: collision with other inner class name */
        public static final class C0005a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a.C0366s4.a.C0005a f679a = null;

            /* JADX INFO: renamed from: a.s4$a$a$a, reason: collision with other inner class name */
            public enum EnumC0006a extends java.lang.Enum<a.C0366s4.a.C0005a.EnumC0006a> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a.C0366s4.a.C0005a.EnumC0006a f680a = null;
                public static final a.C0366s4.a.C0005a.EnumC0006a b = null;
                public static final a.C0366s4.a.C0005a.EnumC0006a c = null;
                public static final /* synthetic */ a.C0366s4.a.C0005a.EnumC0006a[] d = null;

                static {
                        a.s4$a$a$a r0 = new a.s4$a$a$a
                        java.lang.String r1 = "HIDDEN"
                        r2 = 0
                        r0.<init>(r1, r2)
                        a.C0366s4.a.C0005a.EnumC0006a.f680a = r0
                        a.s4$a$a$a r1 = new a.s4$a$a$a
                        java.lang.String r2 = "UNHIDDEN_USER"
                        r3 = 1
                        r1.<init>(r2, r3)
                        a.C0366s4.a.C0005a.EnumC0006a.b = r1
                        a.s4$a$a$a r2 = new a.s4$a$a$a
                        java.lang.String r3 = "UNHIDDEN_COMMAND"
                        r4 = 2
                        r2.<init>(r3, r4)
                        a.C0366s4.a.C0005a.EnumC0006a.c = r2
                        a.s4$a$a$a[] r0 = new a.C0366s4.a.C0005a.EnumC0006a[]{r0, r1, r2}
                        a.C0366s4.a.C0005a.EnumC0006a.d = r0
                        return
                }

                EnumC0006a() {
                        r0 = this;
                        r0 = 0
                        throw r0
                }

                public static a.C0366s4.a.C0005a.EnumC0006a valueOf(java.lang.String r1) {
                        java.lang.Class<a.s4$a$a$a> r0 = a.C0366s4.a.C0005a.EnumC0006a.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        a.s4$a$a$a r1 = (a.C0366s4.a.C0005a.EnumC0006a) r1
                        return r1
                }

                public static a.C0366s4.a.C0005a.EnumC0006a[] values() {
                        a.s4$a$a$a[] r0 = a.C0366s4.a.C0005a.EnumC0006a.d
                        java.lang.Object r0 = r0.clone()
                        a.s4$a$a$a[] r0 = (a.C0366s4.a.C0005a.EnumC0006a[]) r0
                        return r0
                }
            }

            static {
                    a.s4$a$a r0 = new a.s4$a$a
                    r0.<init>()
                    a.C0366s4.a.C0005a.f679a = r0
                    return
            }

            public static boolean a(a.C0366s4.a.C0005a.EnumC0006a r2) {
                    a.x8 r0 = a.C0460x8.f762a
                    int r2 = r2.ordinal()
                    r0 = 1
                    if (r2 == 0) goto L1a
                    if (r2 == r0) goto L17
                    r1 = 2
                    if (r2 != r1) goto L11
                    a.ca$b r2 = a.C0086ca.b.c
                    goto L1c
                L11:
                    a.Ob r2 = new a.Ob
                    r2.<init>()
                    throw r2
                L17:
                    a.ca$b r2 = a.C0086ca.b.b
                    goto L1c
                L1a:
                    a.ca$b r2 = a.C0086ca.b.f424a
                L1c:
                    a.ca$b r1 = a.C0460x8.b
                    if (r1 != r2) goto L21
                    return r0
                L21:
                    r2 = 0
                    return r2
            }

            public final java.lang.String toString() {
                    r1 = this;
                    a.x8 r0 = a.C0460x8.f762a
                    a.ca$b r0 = a.C0460x8.b
                    java.lang.String r0 = r0.name()
                    return r0
            }
        }

        /* JADX INFO: renamed from: a.s4$a$b */
        public enum b extends java.lang.Enum<a.C0366s4.a.b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a.C0366s4.a.b f681a = null;
            public static final a.C0366s4.a.b b = null;
            public static final a.C0366s4.a.b c = null;
            public static final /* synthetic */ a.C0366s4.a.b[] d = null;

            static {
                    a.s4$a$b r0 = new a.s4$a$b
                    java.lang.String r1 = "NONE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    a.C0366s4.a.b.f681a = r0
                    a.s4$a$b r1 = new a.s4$a$b
                    java.lang.String r2 = "USER_INTERACTION"
                    r3 = 1
                    r1.<init>(r2, r3)
                    a.C0366s4.a.b.b = r1
                    a.s4$a$b r2 = new a.s4$a$b
                    java.lang.String r3 = "COMMAND"
                    r4 = 2
                    r2.<init>(r3, r4)
                    a.C0366s4.a.b.c = r2
                    a.s4$a$b[] r0 = new a.C0366s4.a.b[]{r0, r1, r2}
                    a.C0366s4.a.b.d = r0
                    return
            }

            b() {
                    r0 = this;
                    r0 = 0
                    throw r0
            }

            public static a.C0366s4.a.b valueOf(java.lang.String r1) {
                    java.lang.Class<a.s4$a$b> r0 = a.C0366s4.a.b.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    a.s4$a$b r1 = (a.C0366s4.a.b) r1
                    return r1
            }

            public static a.C0366s4.a.b[] values() {
                    a.s4$a$b[] r0 = a.C0366s4.a.b.d
                    java.lang.Object r0 = r0.clone()
                    a.s4$a$b[] r0 = (a.C0366s4.a.b[]) r0
                    return r0
            }
        }

        public static void a() {
                a.s4 r0 = a.C0366s4.I
                if (r0 == 0) goto L63
                long r1 = java.lang.System.currentTimeMillis()
                long r3 = a.C0366s4.L
                long r3 = r1 - r3
                r5 = 500(0x1f4, double:2.47E-321)
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                r4 = 1
                r5 = 0
                if (r3 >= 0) goto L16
                r3 = r4
                goto L17
            L16:
                r3 = r5
            L17:
                a.C0366s4.L = r1
                if (r3 != 0) goto L29
                a.s4$a$a$a r1 = a.C0366s4.a.C0005a.EnumC0006a.b
                a.k4 r2 = new a.k4
                r3 = 5
                r2.<init>(r0, r3)
                r0.y(r5, r1, r2)
                r0.z(r5, r1)
            L29:
                java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Boolean> r1 = r0.n
                r1.clear()
                java.util.Map<java.lang.Object, java.lang.String> r1 = r0.w
                r1.clear()
                android.view.View r1 = r0.i
                if (r1 == 0) goto L40
                java.lang.Class r1 = r1.getClass()
                java.lang.String r1 = r1.getSimpleName()
                goto L41
            L40:
                r1 = 0
            L41:
                java.lang.String r2 = "HideMainUI: onStateUnhideUser immediate refresh rootView="
                java.lang.String r1 = a.C0487z.k(r2, r1)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
                a.C0453x1.b(r1)
                android.view.View r1 = r0.i
                if (r1 == 0) goto L60
                r0.d(r1)     // Catch: java.lang.Throwable -> L5c
                a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L5c
                goto L60
            L5c:
                r0 = move-exception
                a.C0465xd.a(r0)
            L60:
                a.C0366s4.x()
            L63:
                return
        }

        public static void b(a.C0366s4 r6) {
                java.lang.String r0 = "instance"
                a.C0193i9.e(r6, r0)
                a.x8 r0 = a.C0460x8.f762a
                a.ca$c r1 = a.C0086ca.c.d
                r0.b(r1)
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = a.C0366s4.K
                long r2 = r0 - r2
                r4 = 500(0x1f4, double:2.47E-321)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r3 = 1
                if (r2 >= 0) goto L1d
                r2 = r3
                goto L1e
            L1d:
                r2 = 0
            L1e:
                a.C0366s4.K = r0
                if (r2 != 0) goto L30
                a.s4$a$a$a r0 = a.C0366s4.a.C0005a.EnumC0006a.f680a
                r6.z(r3, r0)
                a.k4 r1 = new a.k4
                r2 = 4
                r1.<init>(r6, r2)
                r6.y(r3, r0, r1)
            L30:
                r6.h = r3
                a.C0366s4.x()
                r6.k()
                android.view.View r0 = r6.i
                if (r0 == 0) goto L46
                r6.c(r0)     // Catch: java.lang.Throwable -> L42
                a.Wf r6 = a.Wf.f330a     // Catch: java.lang.Throwable -> L42
                return
            L42:
                r6 = move-exception
                a.C0465xd.a(r6)
            L46:
                return
        }
    }

    /* JADX INFO: renamed from: a.s4$b */
    public static final class b extends java.util.IdentityHashMap<java.lang.Object, java.lang.String> {
        @Override // java.util.IdentityHashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(java.lang.Object r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r0 = 1
                goto L6
            L4:
                boolean r0 = r2 instanceof java.lang.String
            L6:
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                java.lang.String r2 = (java.lang.String) r2
                boolean r2 = super.containsValue(r2)
                return r2
        }

        @Override // java.util.IdentityHashMap, java.util.AbstractMap, java.util.Map
        public final java.lang.Object put(java.lang.Object r3, java.lang.Object r4) {
                r2 = this;
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r0 = "key"
                a.C0193i9.e(r3, r0)
                java.lang.String r0 = "value"
                a.C0193i9.e(r4, r0)
                int r0 = super.size()
                r1 = 1024(0x400, float:1.435E-42)
                if (r0 < r1) goto L17
                r2.clear()
            L17:
                java.lang.Object r3 = super.put(r3, r4)
                java.lang.String r3 = (java.lang.String) r3
                return r3
        }

        @Override // java.util.Map
        public final /* bridge */ boolean remove(java.lang.Object r2, java.lang.Object r3) {
                r1 = this;
                if (r3 != 0) goto L4
                r0 = 1
                goto L6
            L4:
                boolean r0 = r3 instanceof java.lang.String
            L6:
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                java.lang.String r3 = (java.lang.String) r3
                boolean r2 = super.remove(r2, r3)
                return r2
        }
    }

    public C0366s4() {
            r4 = this;
            r4.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r4.e = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            r4.f = r0
            int r0 = a.B1.f21a
            r2 = -1
            if (r0 != r2) goto L3c
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L2d
            a.C0193i9.b(r0)     // Catch: java.lang.Exception -> L2d
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L2d
            java.lang.String r3 = "com.tencent.mm"
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r1)     // Catch: java.lang.Exception -> L2d
            int r2 = r0.versionCode     // Catch: java.lang.Exception -> L2d
            goto L3a
        L2d:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.a(r0)
        L3a:
            a.B1.f21a = r2
        L3c:
            int r0 = a.B1.f21a
            r1 = 2140(0x85c, float:2.999E-42)
            if (r0 != r1) goto L43
            goto L50
        L43:
            if (r1 > r0) goto L4a
            r1 = 2481(0x9b1, float:3.477E-42)
            if (r0 >= r1) goto L4a
            goto L50
        L4a:
            r1 = 2589(0xa1d, float:3.628E-42)
            if (r0 == r1) goto L50
            r1 = 2600(0xa28, float:3.643E-42)
        L50:
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.l = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.m = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.n = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.o = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.p = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.q = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.r = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.s = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r4.t = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r4.u = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r4.v = r0
            a.s4$b r0 = new a.s4$b
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            java.lang.String r1 = "synchronizedMap(...)"
            a.C0193i9.d(r0, r1)
            r4.w = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.z = r0
            a.j2 r0 = new a.j2
            r1 = 1
            r0.<init>(r1, r4)
            r4.A = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r4.B = r0
            a.w3 r0 = new a.w3
            r1 = 3
            r0.<init>(r1)
            a.Me r1 = new a.Me
            r1.<init>(r0)
            r4.C = r1
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.E = r0
            return
    }

    public static final void A(java.util.HashSet r10, java.lang.Object r11, int r12) {
            r0 = 2
            if (r12 > r0) goto L11b
            java.lang.Class r1 = r11.getClass()
            boolean r1 = r10.contains(r1)
            if (r1 == 0) goto Lf
            goto L11b
        Lf:
            java.lang.Class r1 = r11.getClass()
            r10.add(r1)
            java.lang.Class r1 = r11.getClass()
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()
            java.lang.String r2 = "getDeclaredMethods(...)"
            a.C0193i9.d(r1, r2)
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L26:
            r5 = 1
            r6 = 0
            if (r4 >= r2) goto L5f
            r7 = r1[r4]
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = "k"
            boolean r8 = a.C0193i9.a(r8, r9)
            if (r8 == 0) goto L5c
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r8 = r8.length
            if (r8 != r0) goto L5c
            java.lang.Class[] r8 = r7.getParameterTypes()
            r8 = r8[r3]
            java.lang.Class r9 = java.lang.Integer.TYPE
            boolean r8 = a.C0193i9.a(r8, r9)
            if (r8 == 0) goto L5c
            java.lang.Class[] r8 = r7.getParameterTypes()
            r8 = r8[r5]
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            boolean r8 = a.C0193i9.a(r8, r9)
            if (r8 == 0) goto L5c
            goto L60
        L5c:
            int r4 = r4 + 1
            goto L26
        L5f:
            r7 = r6
        L60:
            if (r7 == 0) goto L93
            a.C0435w1.c(r11, r7)
            java.lang.Class r10 = r11.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "DataSource captured via adapter probe: "
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r10 = ".k(int,String)"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "msg"
            a.C0193i9.e(r10, r11)
            java.lang.String r11 = "[ConvRV] "
            java.lang.String r10 = r11.concat(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            a.C0453x1.b(r10)
            return
        L93:
            if (r12 >= r0) goto L11b
            java.lang.Class r0 = r11.getClass()
        L99:
            if (r0 == 0) goto L11b
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L11b
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()
            a.G1 r1 = a.C0435w1.I(r1)
        Lab:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L115
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class r4 = r2.getType()
            boolean r4 = r4.isPrimitive()
            if (r4 != 0) goto Lab
            java.lang.Class r4 = r2.getType()
            java.lang.String r4 = r4.getName()
            java.lang.String r7 = "android."
            boolean r4 = a.Ae.H(r4, r7, r3)
            if (r4 != 0) goto Lab
            java.lang.Class r4 = r2.getType()
            java.lang.String r4 = r4.getName()
            java.lang.String r7 = "java."
            boolean r4 = a.Ae.H(r4, r7, r3)
            if (r4 != 0) goto Lab
            java.lang.Class r4 = r2.getType()
            java.lang.String r4 = r4.getName()
            java.lang.String r7 = "kotlin."
            boolean r4 = a.Ae.H(r4, r7, r3)
            if (r4 == 0) goto Lf2
            goto Lab
        Lf2:
            r2.setAccessible(r5)
            java.lang.Object r2 = r2.get(r11)     // Catch: java.lang.Throwable -> Lfa
            goto Lff
        Lfa:
            r2 = move-exception
            a.wd$a r2 = a.C0465xd.a(r2)
        Lff:
            boolean r4 = r2 instanceof a.C0447wd.a
            if (r4 == 0) goto L104
            r2 = r6
        L104:
            if (r2 != 0) goto L107
            goto Lab
        L107:
            int r4 = r12 + 1
            A(r10, r2, r4)
            java.lang.Object r2 = a.C0435w1.r
            if (r2 == 0) goto Lab
            java.lang.reflect.Method r2 = a.C0435w1.s
            if (r2 == 0) goto Lab
            goto L11b
        L115:
            java.lang.Class r0 = r0.getSuperclass()
            goto L99
        L11b:
            return
    }

    public static java.lang.String e(java.lang.Object r4) {
            java.lang.Class r0 = r4.getClass()
        L4:
            if (r0 == 0) goto L4f
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L4f
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4f
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()
            a.G1 r1 = a.C0435w1.I(r1)
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r3 = r2.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 != 0) goto L1c
            r3 = 1
            r2.setAccessible(r3)
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Exception -> L1c
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> L1c
            if (r3 == 0) goto L1c
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L1c
            boolean r3 = a.yh.a(r3)     // Catch: java.lang.Exception -> L1c
            if (r3 == 0) goto L1c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L1c
            return r2
        L4a:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L4f:
            r4 = 0
            return r4
    }

    public static boolean j(java.lang.Class r5) {
            r0 = 0
            r1 = r0
        L2:
            if (r5 == 0) goto L38
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L38
            r2 = 5
            if (r1 >= r2) goto L38
            java.lang.reflect.Field[] r2 = r5.getDeclaredFields()
            a.G1 r2 = a.C0435w1.I(r2)
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "field_username"
            boolean r3 = a.C0193i9.a(r3, r4)
            if (r3 == 0) goto L17
            r5 = 1
            return r5
        L31:
            java.lang.Class r5 = r5.getSuperclass()
            int r1 = r1 + 1
            goto L2
        L38:
            return r0
    }

    public static java.lang.Class v(java.lang.ClassLoader r16) {
            java.lang.String r0 = "I"
            java.lang.String r2 = "Ljava/lang/String;"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}     // Catch: java.lang.Throwable -> L37
            java.util.List r0 = a.C0294o3.d0(r0)     // Catch: java.lang.Throwable -> L37
            java.util.List r0 = a.C0435w1.u(r0)     // Catch: java.lang.Throwable -> L37
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L37
            r2.<init>()     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L37
        L19:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L37
            r5 = 0
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L37
            r6 = r4
            a.Hf r6 = (a.Hf) r6     // Catch: java.lang.Throwable -> L37
            java.io.Serializable r6 = r6.f116a     // Catch: java.lang.Throwable -> L37
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L37
            java.lang.String r7 = "com.tencent.mm.ui.conversation"
            boolean r5 = a.Ae.H(r6, r7, r5)     // Catch: java.lang.Throwable -> L37
            if (r5 == 0) goto L19
            r2.add(r4)     // Catch: java.lang.Throwable -> L37
            goto L19
        L37:
            r0 = move-exception
            goto L11b
        L3a:
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = "] "
            java.lang.String r6 = "["
            java.lang.String r7 = "msg"
            java.lang.String r8 = "ConvRV"
            if (r3 == 0) goto L81
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r2.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = "resolveDataSourceViaDexKit: no (int,String) event method in conversation pkg (hits="
            r2.append(r3)     // Catch: java.lang.Throwable -> L37
            r2.append(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = ")"
            r2.append(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L37
            a.C0193i9.e(r0, r7)     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L37
            r2.append(r8)     // Catch: java.lang.Throwable -> L37
            r2.append(r4)     // Catch: java.lang.Throwable -> L37
            r2.append(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L37
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L37
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L37
        L7e:
            r10 = 0
            goto L11f
        L81:
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L37
        L85:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L37
            a.Hf r2 = (a.Hf) r2     // Catch: java.lang.Throwable -> L37
            java.io.Serializable r3 = r2.f116a     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L37
            java.io.Serializable r2 = r2.b     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L37
            r9 = r16
            java.lang.Class r10 = a.A1.b(r9, r3)     // Catch: java.lang.Throwable -> L37
            if (r10 != 0) goto La2
            goto L85
        La2:
            java.lang.reflect.Method[] r11 = r10.getDeclaredMethods()     // Catch: java.lang.Throwable -> L37
            java.lang.String r12 = "getDeclaredMethods(...)"
            a.C0193i9.d(r11, r12)     // Catch: java.lang.Throwable -> L37
            int r12 = r11.length     // Catch: java.lang.Throwable -> L37
            r13 = r5
        Lad:
            if (r13 >= r12) goto L85
            r14 = r11[r13]     // Catch: java.lang.Throwable -> L37
            java.lang.Class[] r15 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L37
            int r15 = r15.length     // Catch: java.lang.Throwable -> L37
            r1 = 2
            if (r15 != r1) goto L118
            java.lang.Class[] r1 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L37
            r1 = r1[r5]     // Catch: java.lang.Throwable -> L37
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L37
            boolean r1 = a.C0193i9.a(r1, r15)     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L118
            java.lang.Class[] r1 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L37
            r15 = 1
            r1 = r1[r15]     // Catch: java.lang.Throwable -> L37
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            boolean r1 = a.C0193i9.a(r1, r15)     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L118
            java.lang.Class r1 = r14.getReturnType()     // Catch: java.lang.Throwable -> L37
            java.lang.Class r14 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L37
            boolean r1 = a.C0193i9.a(r1, r14)     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L118
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r0.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "hookConvEventFilter: DataSource located via DexKit: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            r0.append(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "."
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            r0.append(r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L37
            a.C0193i9.e(r0, r7)     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L37
            r1.append(r8)     // Catch: java.lang.Throwable -> L37
            r1.append(r4)     // Catch: java.lang.Throwable -> L37
            r1.append(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L37
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L37
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L37
            goto L11f
        L118:
            int r13 = r13 + 1
            goto Lad
        L11b:
            a.wd$a r10 = a.C0465xd.a(r0)
        L11f:
            boolean r0 = r10 instanceof a.C0447wd.a
            if (r0 == 0) goto L125
            r1 = 0
            goto L126
        L125:
            r1 = r10
        L126:
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
    }

    public static java.lang.Class w(java.lang.ClassLoader r5) {
            r0 = 0
            java.lang.String r1 = "void"
            java.lang.String r2 = "java.util.List"
            java.util.List r2 = a.C0435w1.K(r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = "notifyDataSetChanged"
            r4 = 1
            java.util.List r1 = a.C0435w1.x(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L8d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8d
        L14:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L8d
            a.lb r2 = (a.C0248lb) r2     // Catch: java.lang.Throwable -> L8d
            a.f5 r2 = r2.b()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = r2.f469a     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = "com.tencent.mm.ui"
            r4 = 0
            boolean r3 = a.Ae.H(r2, r3, r4)     // Catch: java.lang.Throwable -> L8d
            if (r3 == 0) goto L14
            java.lang.String r3 = "com.tencent.mm.ui.contact"
            boolean r3 = a.Ae.H(r2, r3, r4)     // Catch: java.lang.Throwable -> L8d
            if (r3 != 0) goto L14
            java.lang.String r3 = "com.tencent.mm.ui.banner"
            boolean r3 = a.Ae.H(r2, r3, r4)     // Catch: java.lang.Throwable -> L8d
            if (r3 != 0) goto L14
            java.lang.String r3 = "com.tencent.mm.ui.tools"
            boolean r3 = a.Ae.H(r2, r3, r4)     // Catch: java.lang.Throwable -> L8d
            if (r3 != 0) goto L14
            java.lang.String r3 = "com.tencent.mm.ui.chatting"
            boolean r3 = a.Ae.H(r2, r3, r4)     // Catch: java.lang.Throwable -> L8d
            if (r3 == 0) goto L50
            goto L14
        L50:
            java.lang.Class r3 = a.A1.b(r5, r2)     // Catch: java.lang.Throwable -> L8d
            if (r3 != 0) goto L57
            goto L14
        L57:
            java.lang.String r5 = "ConvRV"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r1.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = "resolveSnapshotClassViaDexKit: candidate "
            r1.append(r4)     // Catch: java.lang.Throwable -> L8d
            r1.append(r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = "msg"
            a.C0193i9.e(r1, r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = "["
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L8d
            r2.append(r5)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = "] "
            r2.append(r5)     // Catch: java.lang.Throwable -> L8d
            r2.append(r1)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L8d
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L8d
            a.C0453x1.b(r5)     // Catch: java.lang.Throwable -> L8d
            goto L95
        L8d:
            r5 = move-exception
            goto L91
        L8f:
            r3 = r0
            goto L95
        L91:
            a.wd$a r3 = a.C0465xd.a(r5)
        L95:
            boolean r5 = r3 instanceof a.C0447wd.a
            if (r5 == 0) goto L9a
            goto L9b
        L9a:
            r0 = r3
        L9b:
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    public static void x() {
            a.h8 r0 = a.C0174h8.l
            if (r0 == 0) goto L7
            r0.j()
        L7:
            return
    }

    public final java.lang.String a(java.lang.Object r10) {
            r9 = this;
            java.util.Map<java.lang.Object, java.lang.String> r0 = r9.w
            java.lang.Object r0 = r0.get(r10)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.ClassLoader r0 = r9.k
            java.lang.String r1 = "field_username"
            r2 = 0
            if (r0 != 0) goto L59
            java.lang.Object r0 = a.A1.h(r10, r1)     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r0 = move-exception
            goto L43
        L1f:
            r0 = r2
        L20:
            if (r0 == 0) goto L2c
            boolean r1 = a.Be.P(r0)     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L29
            goto L2a
        L29:
            r0 = r2
        L2a:
            if (r0 != 0) goto L47
        L2c:
            java.lang.Object r0 = a.A1.g(r10)     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L37
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1d
            goto L38
        L37:
            r0 = r2
        L38:
            if (r0 == 0) goto L41
            boolean r1 = a.Be.P(r0)     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L41
            goto L47
        L41:
            r0 = r2
            goto L47
        L43:
            a.wd$a r0 = a.C0465xd.a(r0)
        L47:
            boolean r1 = r0 instanceof a.C0447wd.a
            if (r1 == 0) goto L4c
            goto L4d
        L4c:
            r2 = r0
        L4d:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L56
            java.util.Map<java.lang.Object, java.lang.String> r0 = r9.w
            r0.put(r10, r2)
        L56:
            a.Wf r10 = a.Wf.f330a
            return r2
        L59:
            java.lang.reflect.Method r0 = a.C0366s4.N
            r3 = 1
            if (r0 == 0) goto L5f
            goto Lc3
        L5f:
            java.lang.Class<android.widget.TextView> r0 = android.widget.TextView.class
            java.lang.String r4 = "setText"
            java.lang.Class<java.lang.CharSequence> r5 = java.lang.CharSequence.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.Exception -> Lc3
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> Lc3
            a.C0366s4.N = r0     // Catch: java.lang.Exception -> Lc3
            java.lang.reflect.Method r0 = a.C0366s4.N     // Catch: java.lang.Exception -> Lc3
            if (r0 == 0) goto L76
            r0.setAccessible(r3)     // Catch: java.lang.Exception -> Lc3
        L76:
            java.lang.Class r0 = r10.getClass()     // Catch: java.lang.Exception -> Lc3
        L7a:
            if (r0 == 0) goto L8f
            java.lang.reflect.Field r4 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L8a java.lang.Exception -> Lc3
            a.C0366s4.O = r4     // Catch: java.lang.NoSuchFieldException -> L8a java.lang.Exception -> Lc3
            java.lang.reflect.Field r4 = a.C0366s4.O     // Catch: java.lang.NoSuchFieldException -> L8a java.lang.Exception -> Lc3
            if (r4 == 0) goto L8f
            r4.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L8a java.lang.Exception -> Lc3
            goto L8f
        L8a:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Exception -> Lc3
            goto L7a
        L8f:
            java.lang.Class r0 = r10.getClass()     // Catch: java.lang.Exception -> Lc3
        L93:
            if (r0 == 0) goto Laa
            java.lang.String r4 = "field_content"
            java.lang.reflect.Field r4 = r0.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> La5 java.lang.Exception -> Lc3
            a.C0366s4.P = r4     // Catch: java.lang.NoSuchFieldException -> La5 java.lang.Exception -> Lc3
            java.lang.reflect.Field r4 = a.C0366s4.P     // Catch: java.lang.NoSuchFieldException -> La5 java.lang.Exception -> Lc3
            if (r4 == 0) goto Laa
            r4.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> La5 java.lang.Exception -> Lc3
            goto Laa
        La5:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Exception -> Lc3
            goto L93
        Laa:
            java.lang.Class r0 = r10.getClass()     // Catch: java.lang.Exception -> Lc3
            java.lang.String r4 = "getItem"
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> Lc3
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.Exception -> Lc3
            java.lang.reflect.Method r0 = r0.getMethod(r4, r5)     // Catch: java.lang.Exception -> Lc3
            a.C0366s4.Q = r0     // Catch: java.lang.Exception -> Lc3
            java.lang.reflect.Method r0 = a.C0366s4.Q     // Catch: java.lang.Exception -> Lc3
            if (r0 == 0) goto Lc3
            r0.setAccessible(r3)     // Catch: java.lang.Exception -> Lc3
        Lc3:
            java.lang.reflect.Field r0 = a.C0366s4.O     // Catch: java.lang.Throwable -> Lec
            if (r0 == 0) goto Lea
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> Ld2
            boolean r4 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> Ld2
            if (r4 == 0) goto Ld4
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Ld2
            goto Lda
        Ld2:
            r0 = move-exception
            goto Ld6
        Ld4:
            r0 = r2
            goto Lda
        Ld6:
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> Lec
        Lda:
            boolean r4 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> Lec
            if (r4 == 0) goto Ldf
            r0 = r2
        Ldf:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lec
            if (r0 == 0) goto Lea
            boolean r4 = a.Be.P(r0)     // Catch: java.lang.Throwable -> Lec
            if (r4 != 0) goto Lea
            goto Lf1
        Lea:
            r0 = r2
            goto Lf1
        Lec:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        Lf1:
            boolean r4 = r0 instanceof a.C0447wd.a
            if (r4 == 0) goto Lf6
            r0 = r2
        Lf6:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = a.A1.g(r10)     // Catch: java.lang.Throwable -> L103
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L103
            if (r5 == 0) goto L105
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L103
            goto L10b
        L103:
            r4 = move-exception
            goto L107
        L105:
            r4 = r2
            goto L10b
        L107:
            a.wd$a r4 = a.C0465xd.a(r4)
        L10b:
            boolean r5 = r4 instanceof a.C0447wd.a
            if (r5 == 0) goto L110
            r4 = r2
        L110:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L11b
            boolean r5 = a.Be.P(r4)
            if (r5 != 0) goto L11b
            goto L11c
        L11b:
            r4 = r2
        L11c:
            if (r0 != 0) goto L1ab
            if (r4 != 0) goto L1aa
            java.lang.String r5 = "d"
            java.lang.Object r5 = a.A1.h(r10, r5)     // Catch: java.lang.Throwable -> L136
            if (r5 != 0) goto L12b
            r5 = r2
            goto L1a0
        L12b:
            java.lang.Object r1 = a.A1.h(r5, r1)     // Catch: java.lang.Throwable -> L136
            boolean r6 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L136
            if (r6 == 0) goto L138
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L136
            goto L139
        L136:
            r0 = move-exception
            goto L19c
        L138:
            r1 = r2
        L139:
            if (r1 == 0) goto L142
            boolean r6 = a.yh.a(r1)     // Catch: java.lang.Throwable -> L136
            if (r6 == 0) goto L142
            goto L150
        L142:
            java.lang.String r5 = e(r5)     // Catch: java.lang.Throwable -> L136
            if (r5 != 0) goto L153
            if (r1 == 0) goto L152
            boolean r5 = a.Be.P(r1)     // Catch: java.lang.Throwable -> L136
            if (r5 != 0) goto L152
        L150:
            r5 = r1
            goto L153
        L152:
            r5 = r2
        L153:
            boolean r6 = r9.D     // Catch: java.lang.Throwable -> L136
            if (r6 != 0) goto L1a0
            java.lang.Class r6 = r10.getClass()     // Catch: java.lang.Throwable -> L136
            java.lang.String r6 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L136
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L136
            r7.<init>()     // Catch: java.lang.Throwable -> L136
            java.lang.String r8 = "[DIAG] extractChat: item="
            r7.append(r8)     // Catch: java.lang.Throwable -> L136
            r7.append(r6)     // Catch: java.lang.Throwable -> L136
            java.lang.String r6 = " cachedFieldUser="
            r7.append(r6)     // Catch: java.lang.Throwable -> L136
            r7.append(r0)     // Catch: java.lang.Throwable -> L136
            java.lang.String r0 = " origin="
            r7.append(r0)     // Catch: java.lang.Throwable -> L136
            r7.append(r4)     // Catch: java.lang.Throwable -> L136
            java.lang.String r0 = " l4.field="
            r7.append(r0)     // Catch: java.lang.Throwable -> L136
            r7.append(r1)     // Catch: java.lang.Throwable -> L136
            java.lang.String r0 = " final="
            r7.append(r0)     // Catch: java.lang.Throwable -> L136
            r7.append(r5)     // Catch: java.lang.Throwable -> L136
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L136
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L136
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.Throwable -> L136
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L136
            goto L1a0
        L19c:
            a.wd$a r5 = a.C0465xd.a(r0)
        L1a0:
            boolean r0 = r5 instanceof a.C0447wd.a
            if (r0 == 0) goto L1a5
            goto L1a6
        L1a5:
            r2 = r5
        L1a6:
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
            goto L1ab
        L1aa:
            r0 = r4
        L1ab:
            boolean r1 = r9.D
            if (r1 != 0) goto L1b1
            r9.D = r3
        L1b1:
            if (r0 == 0) goto L1b8
            java.util.Map<java.lang.Object, java.lang.String> r1 = r9.w
            r1.put(r10, r0)
        L1b8:
            return r0
    }

    public final java.lang.Object b(io.github.libxposed.api.XposedInterface.Chain r22) {
            r21 = this;
            r1 = r21
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.e
            boolean r0 = r0.get()
            r2 = 1
            if (r0 == 0) goto L18
            java.lang.String r0 = "[DIAG] filterGetCount blocked by isInBackAnimation=true"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.b(r0)
        L18:
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.jc r0 = a.K3.a.i()
            boolean r3 = r0.n
            if (r3 == 0) goto L3d3
            boolean r3 = a.K3.a.l()
            if (r3 != 0) goto L2d
            goto L3d3
        L2d:
            java.lang.Boolean r3 = a.K3.l
            if (r3 == 0) goto L36
            boolean r3 = r3.booleanValue()
            goto L44
        L36:
            java.util.ArrayList r3 = a.K3.a.f()
            boolean r3 = r3.isEmpty()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            a.K3.l = r4
        L44:
            if (r3 == 0) goto L4b
            java.lang.Object r0 = r22.proceed()
            return r0
        L4b:
            java.lang.ThreadLocal<java.lang.Boolean> r3 = r1.v
            java.lang.Object r3 = r3.get()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = a.C0193i9.a(r3, r4)
            if (r3 != 0) goto L3ce
            a.x8 r3 = a.C0460x8.f762a
            boolean r3 = a.C0460x8.a()
            if (r3 == 0) goto L63
            goto L3ce
        L63:
            java.lang.Object r3 = r22.getThisObject()
            if (r3 != 0) goto L6e
            java.lang.Object r0 = r22.proceed()
            return r0
        L6e:
            int r0 = r1.g(r3, r0)
            if (r0 != 0) goto L79
            java.lang.Object r0 = r22.proceed()
            return r0
        L79:
            java.lang.Object r0 = r22.proceed()
            boolean r5 = r0 instanceof java.lang.Integer
            if (r5 == 0) goto L85
            java.lang.Integer r0 = (java.lang.Integer) r0
            r5 = r0
            goto L86
        L85:
            r5 = 0
        L86:
            if (r5 == 0) goto L3cc
            int r7 = r5.intValue()
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Integer> r0 = r1.o
            java.lang.Object r0 = r0.get(r3)
            r8 = r0
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Integer> r0 = r1.p
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Boolean> r9 = r1.n
            java.lang.Object r9 = r9.get(r3)
            boolean r4 = a.C0193i9.a(r9, r4)
            java.lang.String r9 = "getItem"
            r10 = 0
            if (r4 != 0) goto Lff
            if (r8 == 0) goto Lff
            if (r0 == 0) goto Lff
            int r0 = r0.intValue()
            if (r0 != r7) goto Lff
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.String> r0 = r1.s
            java.lang.Object r0 = r0.get(r3)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto Lff
            java.lang.reflect.Method r0 = a.C0366s4.Q
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            if (r0 == 0) goto Ldd
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object r0 = r0.invoke(r3, r11)     // Catch: java.lang.Throwable -> Ld2
            goto Ld7
        Ld2:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        Ld7:
            boolean r11 = r0 instanceof a.C0447wd.a
            if (r11 == 0) goto Lf0
        Ldb:
            r0 = 0
            goto Lf0
        Ldd:
            java.lang.Object[] r0 = new java.lang.Object[]{r11}     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r0 = a.A1.a(r3, r9, r0)     // Catch: java.lang.Throwable -> Le6
            goto Leb
        Le6:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        Leb:
            boolean r11 = r0 instanceof a.C0447wd.a
            if (r11 == 0) goto Lf0
            goto Ldb
        Lf0:
            if (r0 == 0) goto Lf7
            java.lang.String r0 = r1.a(r0)
            goto Lf8
        Lf7:
            r0 = 0
        Lf8:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lff
            return r8
        Lff:
            if (r7 > 0) goto L11d
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, int[]> r0 = r1.m
            int[] r2 = new int[r10]
            r0.put(r3, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Integer> r0 = r1.o
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r0.put(r3, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Boolean> r0 = r1.n
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.put(r3, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            return r0
        L11d:
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r1.v
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r0.set(r4)
            long r11 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L158
            int[] r4 = new int[r7]     // Catch: java.lang.Throwable -> L158
            java.lang.reflect.Method r8 = a.C0366s4.Q     // Catch: java.lang.Throwable -> L158
            a.K3$a r0 = a.K3.f148a     // Catch: java.lang.Throwable -> L158
            r0.getClass()     // Catch: java.lang.Throwable -> L158
            java.util.ArrayList r0 = a.K3.a.f()     // Catch: java.lang.Throwable -> L158
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L158
            r14 = 10
            int r15 = a.C0312p3.g0(r0, r14)     // Catch: java.lang.Throwable -> L158
            r13.<init>(r15)     // Catch: java.lang.Throwable -> L158
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L158
        L144:
            boolean r15 = r0.hasNext()     // Catch: java.lang.Throwable -> L158
            if (r15 == 0) goto L15b
            java.lang.Object r15 = r0.next()     // Catch: java.lang.Throwable -> L158
            top.mmjz.floatingclouds.bean.MaskItemBean r15 = (top.mmjz.floatingclouds.bean.MaskItemBean) r15     // Catch: java.lang.Throwable -> L158
            java.lang.String r15 = r15.getMaskId()     // Catch: java.lang.Throwable -> L158
            r13.add(r15)     // Catch: java.lang.Throwable -> L158
            goto L144
        L158:
            r0 = move-exception
            goto L3c4
        L15b:
            java.util.HashSet r15 = new java.util.HashSet     // Catch: java.lang.Throwable -> L158
            r15.<init>(r13)     // Catch: java.lang.Throwable -> L158
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L158
            r13.<init>()     // Catch: java.lang.Throwable -> L158
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L158
            r6.<init>()     // Catch: java.lang.Throwable -> L158
            r17 = r2
            r2 = r10
            r18 = r2
            r19 = r18
            r16 = 0
        L173:
            if (r2 >= r7) goto L20b
            if (r8 == 0) goto L18f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L184
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L184
            java.lang.Object r0 = r8.invoke(r3, r0)     // Catch: java.lang.Throwable -> L184
            goto L189
        L184:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L158
        L189:
            boolean r14 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L158
            if (r14 == 0) goto L1a6
        L18d:
            r0 = 0
            goto L1a6
        L18f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L19c
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L19c
            java.lang.Object r0 = a.A1.a(r3, r9, r0)     // Catch: java.lang.Throwable -> L19c
            goto L1a1
        L19c:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L158
        L1a1:
            boolean r14 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L158
            if (r14 == 0) goto L1a6
            goto L18d
        L1a6:
            if (r0 == 0) goto L1fa
            java.lang.String r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L158
            if (r0 != 0) goto L1b0
            int r10 = r10 + 1
        L1b0:
            if (r2 != 0) goto L1b4
            r16 = r0
        L1b4:
            if (r0 == 0) goto L1ce
            boolean r14 = r15.contains(r0)     // Catch: java.lang.Throwable -> L158
            if (r14 == 0) goto L1ce
            int r14 = r13.size()     // Catch: java.lang.Throwable -> L158
            r20 = r8
            r8 = 10
            if (r14 >= r8) goto L1c9
            r13.add(r0)     // Catch: java.lang.Throwable -> L158
        L1c9:
            r14 = r18
        L1cb:
            r18 = r2
            goto L201
        L1ce:
            r20 = r8
            r8 = r19
            int r19 = r8 + 1
            r4[r8] = r2     // Catch: java.lang.Throwable -> L158
            r8 = 5
            r14 = r18
            if (r14 >= r8) goto L1cb
            if (r0 == 0) goto L1cb
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L158
            r8.<init>()     // Catch: java.lang.Throwable -> L158
            r8.append(r2)     // Catch: java.lang.Throwable -> L158
            r18 = r2
            java.lang.String r2 = ":"
            r8.append(r2)     // Catch: java.lang.Throwable -> L158
            r8.append(r0)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L158
            r6.add(r0)     // Catch: java.lang.Throwable -> L158
            int r0 = r14 + 1
            r14 = r0
            goto L201
        L1fa:
            r20 = r8
            r14 = r18
            r8 = r19
            goto L1cb
        L201:
            int r2 = r18 + 1
            r18 = r14
            r8 = r20
            r14 = 10
            goto L173
        L20b:
            r8 = r19
            if (r10 <= 0) goto L2a0
            int r0 = r10 * 100
            int r0 = r0 / r7
            r2 = 50
            java.lang.String r9 = "/"
            if (r0 < r2) goto L266
            java.lang.Class r2 = r3.getClass()     // Catch: java.lang.Throwable -> L158
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L158
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L158
            r14.<init>()     // Catch: java.lang.Throwable -> L158
            r18 = r11
            java.lang.String r11 = "⚠️ LEAK-RISK: wxid 提取失败率 "
            r14.append(r11)     // Catch: java.lang.Throwable -> L158
            r14.append(r0)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = "% ("
            r14.append(r0)     // Catch: java.lang.Throwable -> L158
            r14.append(r10)     // Catch: java.lang.Throwable -> L158
            r14.append(r9)     // Catch: java.lang.Throwable -> L158
            r14.append(r7)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = ") adapter="
            r14.append(r0)     // Catch: java.lang.Throwable -> L158
            r14.append(r2)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = " — 密友可能全部可见，请检查解析链/微信版本！"
            r14.append(r0)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Throwable -> L158
            a.C0435w1.k(r0)     // Catch: java.lang.Throwable -> L158
            java.util.concurrent.atomic.AtomicInteger r0 = r1.t     // Catch: java.lang.Throwable -> L158
            int r0 = r0.incrementAndGet()     // Catch: java.lang.Throwable -> L158
            r2 = 3
            if (r0 < r2) goto L2a8
            java.lang.String r0 = "🚨 LEAK-ALERT: 连续 3 次扫描提取失败率≥50%，解析链可能已失效，密友会话可能全部泄露！"
            a.C0435w1.k(r0)     // Catch: java.lang.Throwable -> L158
            java.util.concurrent.atomic.AtomicInteger r0 = r1.t     // Catch: java.lang.Throwable -> L158
            r2 = 0
            r0.set(r2)     // Catch: java.lang.Throwable -> L158
            goto L2a8
        L266:
            r18 = r11
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L158
            r2.<init>()     // Catch: java.lang.Throwable -> L158
            java.lang.String r11 = "[DIAG-FILTER] wxid 提取失败 "
            r2.append(r11)     // Catch: java.lang.Throwable -> L158
            r2.append(r10)     // Catch: java.lang.Throwable -> L158
            r2.append(r9)     // Catch: java.lang.Throwable -> L158
            r2.append(r7)     // Catch: java.lang.Throwable -> L158
            java.lang.String r9 = " ("
            r2.append(r9)     // Catch: java.lang.Throwable -> L158
            r2.append(r0)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = "%)"
            r2.append(r0)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L158
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L158
            r2 = r17
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.lang.Throwable -> L158
            a.C0453x1.e(r0)     // Catch: java.lang.Throwable -> L158
            java.util.concurrent.atomic.AtomicInteger r0 = r1.t     // Catch: java.lang.Throwable -> L158
            r2 = 0
            r0.set(r2)     // Catch: java.lang.Throwable -> L158
            goto L2a8
        L2a0:
            r18 = r11
            java.util.concurrent.atomic.AtomicInteger r0 = r1.t     // Catch: java.lang.Throwable -> L158
            r2 = 0
            r0.set(r2)     // Catch: java.lang.Throwable -> L158
        L2a8:
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.String> r0 = r1.s     // Catch: java.lang.Throwable -> L158
            if (r16 != 0) goto L2ae
            java.lang.String r16 = ""
        L2ae:
            r2 = r16
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L158
            long r9 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L158
            long r9 = r9 - r18
            r0 = 1000(0x3e8, float:1.401E-42)
            long r11 = (long) r0     // Catch: java.lang.Throwable -> L158
            long r9 = r9 / r11
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L158
            int r2 = r7 - r8
            int r11 = r15.size()     // Catch: java.lang.Throwable -> L158
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L158
            r12.<init>()     // Catch: java.lang.Throwable -> L158
            java.lang.String r14 = "[DIAG-FILTER] adapter="
            r12.append(r14)     // Catch: java.lang.Throwable -> L158
            r12.append(r0)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = " total="
            r12.append(r0)     // Catch: java.lang.Throwable -> L158
            r12.append(r7)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = " vis="
            r12.append(r0)     // Catch: java.lang.Throwable -> L158
            r12.append(r8)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = " filtered="
            r12.append(r0)     // Catch: java.lang.Throwable -> L158
            r12.append(r2)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = " masks="
            r12.append(r0)     // Catch: java.lang.Throwable -> L158
            r12.append(r11)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = " "
            r12.append(r0)     // Catch: java.lang.Throwable -> L158
            r12.append(r9)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = "μs"
            r12.append(r0)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = r12.toString()     // Catch: java.lang.Throwable -> L158
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L158
            r7 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)     // Catch: java.lang.Throwable -> L158
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L158
            boolean r0 = r13.isEmpty()     // Catch: java.lang.Throwable -> L158
            r7 = 62
            java.lang.String r9 = ","
            if (r0 != 0) goto L341
            r10 = 0
            java.lang.String r0 = a.C0383t3.p0(r13, r9, r10, r7)     // Catch: java.lang.Throwable -> L158
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L158
            r10.<init>()     // Catch: java.lang.Throwable -> L158
            java.lang.String r11 = "[DIAG-FILTER] matched (hidden): "
            r10.append(r11)     // Catch: java.lang.Throwable -> L158
            r10.append(r0)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L158
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L158
            r10 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r10)     // Catch: java.lang.Throwable -> L158
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L158
        L341:
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L158
            if (r0 != 0) goto L369
            r10 = 0
            java.lang.String r0 = a.C0383t3.p0(r6, r9, r10, r7)     // Catch: java.lang.Throwable -> L158
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L158
            r6.<init>()     // Catch: java.lang.Throwable -> L158
            java.lang.String r10 = "[DIAG-FILTER] unmatched sample: "
            r6.append(r10)     // Catch: java.lang.Throwable -> L158
            r6.append(r0)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L158
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L158
            r10 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r10)     // Catch: java.lang.Throwable -> L158
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L158
        L369:
            if (r2 <= 0) goto L393
            r2 = 10
            java.util.List r0 = a.C0383t3.s0(r2, r15)     // Catch: java.lang.Throwable -> L158
            r10 = 0
            java.lang.String r0 = a.C0383t3.p0(r0, r9, r10, r7)     // Catch: java.lang.Throwable -> L158
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L158
            r2.<init>()     // Catch: java.lang.Throwable -> L158
            java.lang.String r6 = "[DIAG-FILTER] maskSet items: "
            r2.append(r6)     // Catch: java.lang.Throwable -> L158
            r2.append(r0)     // Catch: java.lang.Throwable -> L158
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L158
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L158
            r10 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r10)     // Catch: java.lang.Throwable -> L158
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L158
        L393:
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, int[]> r0 = r1.m     // Catch: java.lang.Throwable -> L158
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L158
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L158
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Integer> r2 = r1.o     // Catch: java.lang.Throwable -> L158
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L158
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Integer> r0 = r1.p     // Catch: java.lang.Throwable -> L158
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L158
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Boolean> r0 = r1.n     // Catch: java.lang.Throwable -> L158
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L158
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L158
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Long> r0 = r1.r     // Catch: java.lang.Throwable -> L158
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L158
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L158
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L158
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L158
            java.lang.ThreadLocal<java.lang.Boolean> r3 = r1.v
            r3.set(r2)
            return r0
        L3c4:
            java.lang.ThreadLocal<java.lang.Boolean> r2 = r1.v
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.set(r3)
            throw r0
        L3cc:
            r10 = 0
            return r10
        L3ce:
            java.lang.Object r0 = r22.proceed()
            return r0
        L3d3:
            java.lang.Object r0 = r22.proceed()
            return r0
    }

    public final void c(android.view.View r5) {
            r4 = this;
            boolean r0 = r5 instanceof android.widget.ListView
            if (r0 == 0) goto L15
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            r4.j = r0
            android.widget.ListView r5 = (android.widget.ListView) r5
            android.widget.ListAdapter r5 = r5.getAdapter()
            r4.t(r5)
            return
        L15:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "RecyclerView"
            r2 = 0
            boolean r0 = a.Be.I(r0, r1, r2)
            if (r0 == 0) goto L2a
            r4.u(r5)
            return
        L2a:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L45
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
        L34:
            if (r2 >= r0) goto L45
            android.view.View r1 = r5.getChildAt(r2)
            java.lang.String r3 = "getChildAt(...)"
            a.C0193i9.d(r1, r3)
            r4.c(r1)
            int r2 = r2 + 1
            goto L34
        L45:
            return
    }

    public final void d(android.view.View r5) {
            r4 = this;
            boolean r0 = r5 instanceof android.widget.ListView
            if (r0 == 0) goto Le
            android.widget.ListView r5 = (android.widget.ListView) r5
            android.widget.ListAdapter r5 = r5.getAdapter()
            r4.t(r5)
            return
        Le:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "RecyclerView"
            r2 = 0
            boolean r0 = a.Be.I(r0, r1, r2)
            if (r0 == 0) goto L23
            r4.u(r5)
            return
        L23:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L3e
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
        L2d:
            if (r2 >= r0) goto L3e
            android.view.View r1 = r5.getChildAt(r2)
            java.lang.String r3 = "getChildAt(...)"
            a.C0193i9.d(r1, r3)
            r4.d(r1)
            int r2 = r2 + 1
            goto L2d
        L3e:
            return
    }

    public final void f() {
            r6 = this;
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r6.B
            java.lang.Object r1 = r0.poll()
            java.lang.String r1 = (java.lang.String) r1
        L8:
            if (r1 == 0) goto L53
            r2 = 1
            boolean r3 = a.C0134f4.b(r1, r2)
            a.Gb r4 = a.Gb.f99a
            r4.getClass()
            a.Me r4 = a.Gb.l
            java.lang.Object r4 = r4.a()
            android.os.Handler r4 = (android.os.Handler) r4
            a.Fb r5 = new a.Fb
            r5.<init>(r1, r2)
            r4.post(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "MSG-REHIDE flush: talker="
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r1 = " ok="
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "msg"
            a.C0193i9.e(r1, r2)
            java.lang.String r2 = "[ConvRV] "
            java.lang.String r1 = r2.concat(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            a.C0453x1.b(r1)
            java.lang.Object r1 = r0.poll()
            java.lang.String r1 = (java.lang.String) r1
            goto L8
        L53:
            return
    }

    public final int g(java.lang.Object r4, a.C0213jc r5) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.tencent.mm.ui.contact"
            r2 = 0
            boolean r0 = a.Ae.H(r0, r1, r2)
            if (r0 == 0) goto L12
            goto L26
        L12:
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, int[]> r0 = r3.m
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L1d
            boolean r4 = r5.n
            return r4
        L1d:
            boolean r4 = r3.s(r4)
            if (r4 == 0) goto L26
            boolean r4 = r5.n
            return r4
        L26:
            return r2
    }

    public final void h(a.J8 r17) {
            r16 = this;
            r1 = r16
            r2 = r17
            int r0 = a.B1.f21a
            r3 = 1
            r4 = 0
            r5 = -1
            if (r0 != r5) goto L2b
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L1d
            a.C0193i9.b(r0)     // Catch: java.lang.Exception -> L1d
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L1d
            java.lang.String r6 = "com.tencent.mm"
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r6, r4)     // Catch: java.lang.Exception -> L1d
            int r5 = r0.versionCode     // Catch: java.lang.Exception -> L1d
            goto L29
        L1d:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            a.C0453x1.a(r0)
        L29:
            a.B1.f21a = r5
        L2b:
            int r0 = a.B1.f21a
            r5 = 2560(0xa00, float:3.587E-42)
            if (r0 < r5) goto L1d3
            java.lang.String r0 = ")"
            java.lang.String r5 = "getMethods(...)"
            java.lang.String r6 = "msg"
            java.lang.String r7 = "hookRecyclerView entered"
            a.C0435w1.C(r7)
            java.lang.String r7 = "androidx.recyclerview.widget.RecyclerView"
            java.lang.ClassLoader r8 = r2.f136a     // Catch: java.lang.Throwable -> L4f
            java.lang.Class r7 = a.A1.b(r8, r7)     // Catch: java.lang.Throwable -> L4f
            java.lang.ClassLoader r8 = r2.f136a
            if (r7 != 0) goto L52
            java.lang.String r7 = "android.support.v7.widget.RecyclerView"
            java.lang.Class r7 = a.A1.b(r8, r7)     // Catch: java.lang.Throwable -> L4f
            goto L52
        L4f:
            r0 = move-exception
            goto L1a7
        L52:
            if (r7 != 0) goto L5b
            java.lang.String r0 = "RecyclerView class not found"
            a.C0435w1.C(r0)     // Catch: java.lang.Throwable -> L4f
            goto L1d3
        L5b:
            java.lang.reflect.Method[] r9 = r7.getMethods()     // Catch: java.lang.Throwable -> L4f
            a.C0193i9.d(r9, r5)     // Catch: java.lang.Throwable -> L4f
            int r10 = r9.length     // Catch: java.lang.Throwable -> L4f
            r11 = r4
        L64:
            java.lang.String r13 = "setAdapter"
            if (r11 >= r10) goto L7f
            r14 = r9[r11]     // Catch: java.lang.Throwable -> L4f
            java.lang.String r15 = r14.getName()     // Catch: java.lang.Throwable -> L4f
            boolean r15 = a.C0193i9.a(r15, r13)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L7c
            java.lang.Class[] r15 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L4f
            int r15 = r15.length     // Catch: java.lang.Throwable -> L4f
            if (r15 != r3) goto L7c
            goto L80
        L7c:
            int r11 = r11 + 1
            goto L64
        L7f:
            r14 = 0
        L80:
            java.lang.String r9 = "ConvRV"
            java.lang.String r10 = "] "
            java.lang.String r11 = "["
            if (r14 != 0) goto La5
            java.lang.String r0 = "RecyclerView.setAdapter method not found"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L4f
            r3.append(r9)     // Catch: java.lang.Throwable -> L4f
            r3.append(r10)     // Catch: java.lang.Throwable -> L4f
            r3.append(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L4f
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L4f
            goto L1d3
        La5:
            java.lang.Class[] r15 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L4f
            r15 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            java.lang.String r15 = r15.getName()     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r4.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r12 = "hooked RecyclerView.setAdapter (param="
            r4.append(r12)     // Catch: java.lang.Throwable -> L4f
            r4.append(r15)     // Catch: java.lang.Throwable -> L4f
            r4.append(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4f
            a.C0435w1.C(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = "RecyclerView"
            r1.r(r2, r14, r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = "com.tencent.mm.view.recyclerview.WxRecyclerView"
            java.lang.Class r4 = a.A1.b(r8, r4)     // Catch: java.lang.Throwable -> Lf2
            if (r4 == 0) goto L15e
            java.lang.reflect.Method[] r4 = r4.getMethods()     // Catch: java.lang.Throwable -> Lf2
            a.C0193i9.d(r4, r5)     // Catch: java.lang.Throwable -> Lf2
            int r5 = r4.length     // Catch: java.lang.Throwable -> Lf2
            r8 = 0
        Ldc:
            if (r8 >= r5) goto Lf7
            r12 = r4[r8]     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r14 = r12.getName()     // Catch: java.lang.Throwable -> Lf2
            boolean r14 = a.C0193i9.a(r14, r13)     // Catch: java.lang.Throwable -> Lf2
            if (r14 == 0) goto Lf4
            java.lang.Class[] r14 = r12.getParameterTypes()     // Catch: java.lang.Throwable -> Lf2
            int r14 = r14.length     // Catch: java.lang.Throwable -> Lf2
            if (r14 != r3) goto Lf4
            goto Lf8
        Lf2:
            r0 = move-exception
            goto L166
        Lf4:
            int r8 = r8 + 1
            goto Ldc
        Lf7:
            r12 = 0
        Lf8:
            if (r12 == 0) goto L142
            java.lang.Class r3 = r12.getDeclaringClass()     // Catch: java.lang.Throwable -> Lf2
            boolean r3 = a.C0193i9.a(r3, r7)     // Catch: java.lang.Throwable -> Lf2
            if (r3 != 0) goto L142
            java.lang.String r3 = "WxRecyclerView"
            r1.r(r2, r12, r3)     // Catch: java.lang.Throwable -> Lf2
            java.lang.Class r3 = r12.getDeclaringClass()     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> Lf2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf2
            r4.<init>()     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r5 = "hooked WxRecyclerView.setAdapter (override in "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lf2
            r4.append(r3)     // Catch: java.lang.Throwable -> Lf2
            r4.append(r0)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Lf2
            a.C0193i9.e(r0, r6)     // Catch: java.lang.Throwable -> Lf2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf2
            r3.<init>(r11)     // Catch: java.lang.Throwable -> Lf2
            r3.append(r9)     // Catch: java.lang.Throwable -> Lf2
            r3.append(r10)     // Catch: java.lang.Throwable -> Lf2
            r3.append(r0)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lf2
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> Lf2
            goto L163
        L142:
            java.lang.String r0 = "WxRecyclerView: no override or class not found, parent hook sufficient"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf2
            r3.<init>(r11)     // Catch: java.lang.Throwable -> Lf2
            r3.append(r9)     // Catch: java.lang.Throwable -> Lf2
            r3.append(r10)     // Catch: java.lang.Throwable -> Lf2
            r3.append(r0)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lf2
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> Lf2
            goto L163
        L15e:
            java.lang.String r0 = "WxRecyclerView class not found"
            a.C0435w1.C(r0)     // Catch: java.lang.Throwable -> Lf2
        L163:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lf2
            goto L16a
        L166:
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L4f
        L16a:
            java.lang.Throwable r3 = a.C0447wd.a(r0)     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L1a1
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r4.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = "WxRecyclerView hook failed: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L4f
            r4.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L4f
            a.C0193i9.e(r3, r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r4.<init>(r11)     // Catch: java.lang.Throwable -> L4f
            r4.append(r9)     // Catch: java.lang.Throwable -> L4f
            r4.append(r10)     // Catch: java.lang.Throwable -> L4f
            r4.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L4f
            a.C0453x1.b(r3)     // Catch: java.lang.Throwable -> L4f
        L1a1:
            a.wd r3 = new a.wd     // Catch: java.lang.Throwable -> L4f
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L4f
            goto L1ab
        L1a7:
            a.wd$a r3 = a.C0465xd.a(r0)
        L1ab:
            java.lang.Throwable r0 = a.C0447wd.a(r3)
            if (r0 == 0) goto L1d3
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "hookRecyclerView FAILED: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            a.C0193i9.e(r0, r6)
            java.lang.String r3 = "[ConvRV] "
            java.lang.String r0 = r3.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
        L1d3:
            r16.q(r17)
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r19) {
            r18 = this;
            r1 = r18
            r2 = r19
            r4 = 2
            r5 = 3
            r6 = 0
            r7 = 1
            java.lang.String r8 = "com.tencent.mm.ui.chatting.BaseChattingUIFragment"
            java.lang.String r9 = "com.tencent.mm.ui.chatting.ChattingUI"
            java.lang.String r10 = "com.tencent.mm.ui.LauncherUI"
            java.lang.String r11 = "android.app.Activity"
            java.lang.String r0 = "session"
            a.C0193i9.e(r2, r0)
            a.C0366s4.I = r1
            java.lang.ClassLoader r0 = r2.f136a
            r1.k = r0
            a.k4 r0 = new a.k4
            r0.<init>(r1, r5)
            a.C0366s4.M = r0
            java.lang.String r0 = a.B1.a.a()
            java.lang.String r12 = "=== HideMainUIListPluginPart handleHook START, wxVer="
            java.lang.String r13 = " ==="
            java.lang.String r0 = a.C0487z.g(r12, r0, r13)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            a.C0453x1.b(r0)
            a.fd r0 = new a.fd
            int r12 = a.B1.a.b()
            java.lang.ClassLoader r13 = r2.f136a
            r0.<init>(r12, r13)
            a.hd r12 = a.C0179hd.f499a
            r12.getClass()
            java.lang.String r12 = "conv_list_classes"
            a.gd r0 = a.C0179hd.a(r12, r0)
            java.lang.Class<?> r12 = r0.b
            r1.f678a = r12
            java.lang.String r12 = "dataSourceClass"
            java.lang.Class r12 = r0.a(r12)
            r1.b = r12
            java.lang.String r12 = "snapshotClass"
            java.lang.Class r12 = r0.a(r12)
            r1.c = r12
            java.util.Map<java.lang.String, java.lang.Object> r12 = r0.g
            if (r12 == 0) goto L6e
            java.lang.String r14 = "adapterNames"
            java.lang.Object r12 = r12.get(r14)
            goto L6f
        L6e:
            r12 = 0
        L6f:
            boolean r14 = r12 instanceof java.util.List
            if (r14 == 0) goto L76
            java.util.List r12 = (java.util.List) r12
            goto L77
        L76:
            r12 = 0
        L77:
            r1.d = r12
            a.cd r0 = r0.d
            java.lang.Class<?> r12 = r1.f678a
            if (r12 == 0) goto L84
            java.lang.String r12 = r12.getName()
            goto L85
        L84:
            r12 = 0
        L85:
            java.lang.Class<?> r14 = r1.b
            if (r14 == 0) goto L8e
            java.lang.String r14 = r14.getName()
            goto L8f
        L8e:
            r14 = 0
        L8f:
            java.lang.Class<?> r15 = r1.c
            if (r15 == 0) goto L98
            java.lang.String r15 = r15.getName()
            goto L99
        L98:
            r15 = 0
        L99:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r3 = "[HideMainUI] conv_list_classes via="
            r13.<init>(r3)
            r13.append(r0)
            java.lang.String r0 = " adapter="
            r13.append(r0)
            r13.append(r12)
            java.lang.String r0 = " ds="
            r13.append(r0)
            r13.append(r14)
            java.lang.String r0 = " snapshot="
            r13.append(r0)
            r13.append(r15)
            java.lang.String r0 = r13.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            a.C0453x1.b(r0)
            java.lang.ClassLoader r0 = r2.f136a     // Catch: java.lang.Throwable -> Ldf
            java.lang.Class r0 = a.A1.b(r0, r10)     // Catch: java.lang.Throwable -> Ldf
            if (r0 == 0) goto Le1
            java.lang.String r3 = r0.getName()     // Catch: java.lang.Throwable -> Ldf
            java.lang.String[] r3 = new java.lang.String[]{r3, r11}     // Catch: java.lang.Throwable -> Ldf
            java.util.List r3 = a.C0294o3.d0(r3)     // Catch: java.lang.Throwable -> Ldf
            goto Le5
        Ldf:
            r0 = move-exception
            goto L132
        Le1:
            java.util.List r3 = a.C0435w1.K(r11)     // Catch: java.lang.Throwable -> Ldf
        Le5:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Ldf
        Le9:
            boolean r12 = r3.hasNext()     // Catch: java.lang.Throwable -> Ldf
            if (r12 == 0) goto L126
            java.lang.Object r12 = r3.next()     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> Ldf
            a.C0193i9.b(r12)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r13 = "onKeyDown"
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Ldf
            java.lang.Class<android.view.KeyEvent> r15 = android.view.KeyEvent.class
            java.lang.Class[] r14 = new java.lang.Class[]{r14, r15}     // Catch: java.lang.Throwable -> Ldf
            a.r4 r15 = new a.r4     // Catch: java.lang.Throwable -> Ldf
            r15.<init>(r0, r1, r6)     // Catch: java.lang.Throwable -> Ldf
            io.github.libxposed.api.XposedInterface$HookHandle r13 = a.J8.a(r2, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Ldf
            if (r13 == 0) goto Le9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldf
            r0.<init>()     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r3 = "[DIAG] onKeyDown hooked on "
            r0.append(r3)     // Catch: java.lang.Throwable -> Ldf
            r0.append(r12)     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ldf
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Ldf
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> Ldf
            goto L12f
        L126:
            java.lang.String r0 = "[DIAG] onKeyDown hook failed on all candidates"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Ldf
            a.C0453x1.a(r0)     // Catch: java.lang.Throwable -> Ldf
        L12f:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> Ldf
            goto L136
        L132:
            a.wd$a r0 = a.C0465xd.a(r0)
        L136:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L145
            java.lang.String r3 = "onKeyDown hook fail"
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            a.C0453x1.a(r0)
        L145:
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            java.util.ArrayList r0 = a.K3.a.f()
            boolean r3 = r0.isEmpty()
            a.K3.a.i()
            java.lang.ClassLoader r0 = r2.f136a
            a.A1.b(r0, r10)
            r18.q(r19)     // Catch: java.lang.Throwable -> L160
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L160
            goto L165
        L160:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L165:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L174
            java.lang.String r12 = "hook ListView.setAdapter fail"
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r0}
            a.C0453x1.a(r0)
        L174:
            r18.h(r19)     // Catch: java.lang.Throwable -> L17a
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L17a
            goto L17f
        L17a:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L17f:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L1f5
            java.lang.String r12 = "hide mainUI listview fail, try to old function."
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r0}
            a.C0453x1.a(r0)
            int r0 = a.B1.a.b()
            r12 = 2140(0x85c, float:2.999E-42)
            if (r0 != r12) goto L199
            java.lang.String r0 = "com.tencent.mm.ui.conversation.k"
            goto L1d1
        L199:
            r12 = 2300(0x8fc, float:3.223E-42)
            java.lang.String r13 = "com.tencent.mm.ui.conversation.r"
            if (r12 > r0) goto L1b4
            r12 = 2341(0x925, float:3.28E-42)
            if (r0 >= r12) goto L1b4
            java.lang.String r0 = a.B1.a.c()
            java.lang.String r12 = "8.0.35"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L1b1
        L1af:
            r0 = r13
            goto L1d1
        L1b1:
            java.lang.String r0 = "com.tencent.mm.ui.conversation.p"
            goto L1d1
        L1b4:
            r12 = 2360(0x938, float:3.307E-42)
            if (r0 != r12) goto L1b9
            goto L1af
        L1b9:
            if (r12 > r0) goto L1c2
            r12 = 2442(0x98a, float:3.422E-42)
            if (r0 >= r12) goto L1c2
            java.lang.String r0 = "com.tencent.mm.ui.conversation.x"
            goto L1d1
        L1c2:
            r12 = 2560(0xa00, float:3.587E-42)
            if (r0 != r12) goto L1c9
            java.lang.String r0 = "com.tencent.mm.ui.conversation.p3"
            goto L1d1
        L1c9:
            r12 = 2701(0xa8d, float:3.785E-42)
            if (r0 != r12) goto L1d0
            java.lang.String r0 = "com.tencent.mm.ui.conversation.q3"
            goto L1d1
        L1d0:
            r0 = 0
        L1d1:
            if (r0 == 0) goto L1e3
            java.lang.ClassLoader r12 = r2.f136a
            if (r12 != 0) goto L1d9
            r13 = 0
            goto L1dd
        L1d9:
            java.lang.Class r13 = a.A1.b(r12, r0)
        L1dd:
            if (r13 == 0) goto L1e3
            r1.p(r2, r13)
            goto L1f5
        L1e3:
            java.lang.Class<android.widget.ListAdapter> r0 = android.widget.ListAdapter.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            a.g4 r12 = new a.g4
            r12.<init>(r1, r2, r6)
            java.lang.String r13 = "android.widget.ListView"
            java.lang.String r14 = "setAdapter"
            a.J8.a(r2, r13, r14, r0, r12)
        L1f5:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L1f8
            goto L1fd
        L1f8:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L1fd:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L210
            java.lang.String r12 = "hookConvDataSource fail"
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.a(r0)
        L210:
            java.lang.ClassLoader r0 = r2.f136a
            java.lang.Class r10 = a.A1.b(r0, r10)
            if (r10 == 0) goto L21d
            java.lang.String r0 = r10.getName()
            goto L21f
        L21d:
            java.lang.String r0 = "NULL"
        L21f:
            java.lang.String r12 = "[DIAG-T2-1] LauncherUI class lookup: "
            java.lang.String r0 = r12.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.lang.String r12 = "onResume"
            if (r10 == 0) goto L23f
            java.lang.String r0 = r10.getName()     // Catch: java.lang.Throwable -> L23d
            java.lang.String[] r0 = new java.lang.String[]{r0, r11}     // Catch: java.lang.Throwable -> L23d
            java.util.List r0 = a.C0294o3.d0(r0)     // Catch: java.lang.Throwable -> L23d
            goto L243
        L23d:
            r0 = move-exception
            goto L288
        L23f:
            java.util.List r0 = a.C0435w1.K(r11)     // Catch: java.lang.Throwable -> L23d
        L243:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L23d
        L247:
            boolean r13 = r0.hasNext()     // Catch: java.lang.Throwable -> L23d
            if (r13 == 0) goto L27c
            java.lang.Object r13 = r0.next()     // Catch: java.lang.Throwable -> L23d
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L23d
            a.C0193i9.b(r13)     // Catch: java.lang.Throwable -> L23d
            java.lang.Class[] r14 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L23d
            a.r4 r15 = new a.r4     // Catch: java.lang.Throwable -> L23d
            r15.<init>(r10, r1, r7)     // Catch: java.lang.Throwable -> L23d
            io.github.libxposed.api.XposedInterface$HookHandle r14 = a.J8.a(r2, r13, r12, r14, r15)     // Catch: java.lang.Throwable -> L23d
            if (r14 == 0) goto L247
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23d
            r0.<init>()     // Catch: java.lang.Throwable -> L23d
            java.lang.String r14 = "[DIAG-T2-1] onResume hooked on "
            r0.append(r14)     // Catch: java.lang.Throwable -> L23d
            r0.append(r13)     // Catch: java.lang.Throwable -> L23d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23d
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L23d
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L23d
            goto L285
        L27c:
            java.lang.String r0 = "[DIAG-T2-1] onResume hook failed on all candidates"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L23d
            a.C0453x1.a(r0)     // Catch: java.lang.Throwable -> L23d
        L285:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L23d
            goto L28c
        L288:
            a.wd$a r0 = a.C0465xd.a(r0)
        L28c:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L29b
            java.lang.String r13 = "LauncherUI.onResume hook fail"
            java.lang.Object[] r0 = new java.lang.Object[]{r13, r0}
            a.C0453x1.a(r0)
        L29b:
            if (r10 == 0) goto L2ac
            java.lang.String r0 = r10.getName()     // Catch: java.lang.Throwable -> L2aa
            java.lang.String[] r0 = new java.lang.String[]{r0, r11}     // Catch: java.lang.Throwable -> L2aa
            java.util.List r0 = a.C0294o3.d0(r0)     // Catch: java.lang.Throwable -> L2aa
            goto L2b0
        L2aa:
            r0 = move-exception
            goto L2f9
        L2ac:
            java.util.List r0 = a.C0435w1.K(r11)     // Catch: java.lang.Throwable -> L2aa
        L2b0:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2aa
        L2b4:
            boolean r13 = r0.hasNext()     // Catch: java.lang.Throwable -> L2aa
            if (r13 == 0) goto L2ed
            java.lang.Object r13 = r0.next()     // Catch: java.lang.Throwable -> L2aa
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L2aa
            a.C0193i9.b(r13)     // Catch: java.lang.Throwable -> L2aa
            java.lang.String r14 = "onPause"
            java.lang.Class[] r15 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L2aa
            a.r4 r7 = new a.r4     // Catch: java.lang.Throwable -> L2aa
            r7.<init>(r10, r1, r4)     // Catch: java.lang.Throwable -> L2aa
            io.github.libxposed.api.XposedInterface$HookHandle r7 = a.J8.a(r2, r13, r14, r15, r7)     // Catch: java.lang.Throwable -> L2aa
            if (r7 == 0) goto L2eb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2aa
            r0.<init>()     // Catch: java.lang.Throwable -> L2aa
            java.lang.String r7 = "[DIAG] onPause hooked on "
            r0.append(r7)     // Catch: java.lang.Throwable -> L2aa
            r0.append(r13)     // Catch: java.lang.Throwable -> L2aa
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2aa
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L2aa
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L2aa
            goto L2f6
        L2eb:
            r7 = 1
            goto L2b4
        L2ed:
            java.lang.String r0 = "[DIAG] onPause hook failed on all candidates"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L2aa
            a.C0453x1.a(r0)     // Catch: java.lang.Throwable -> L2aa
        L2f6:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L2aa
            goto L2fd
        L2f9:
            a.wd$a r0 = a.C0465xd.a(r0)
        L2fd:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L310
            java.lang.String r7 = "Activity.onPause hook fail"
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.b(r0)
        L310:
            if (r10 == 0) goto L321
            java.lang.String r0 = r10.getName()     // Catch: java.lang.Throwable -> L31f
            java.lang.String[] r0 = new java.lang.String[]{r0, r11}     // Catch: java.lang.Throwable -> L31f
            java.util.List r0 = a.C0294o3.d0(r0)     // Catch: java.lang.Throwable -> L31f
            goto L325
        L31f:
            r0 = move-exception
            goto L370
        L321:
            java.util.List r0 = a.C0435w1.K(r11)     // Catch: java.lang.Throwable -> L31f
        L325:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L31f
        L329:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L31f
            if (r7 == 0) goto L364
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L31f
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L31f
            a.C0193i9.b(r7)     // Catch: java.lang.Throwable -> L31f
            java.lang.String r13 = "onWindowFocusChanged"
            java.lang.Class r14 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L31f
            java.lang.Class[] r14 = new java.lang.Class[]{r14}     // Catch: java.lang.Throwable -> L31f
            a.r4 r15 = new a.r4     // Catch: java.lang.Throwable -> L31f
            r15.<init>(r10, r1, r5)     // Catch: java.lang.Throwable -> L31f
            io.github.libxposed.api.XposedInterface$HookHandle r13 = a.J8.a(r2, r7, r13, r14, r15)     // Catch: java.lang.Throwable -> L31f
            if (r13 == 0) goto L329
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31f
            r0.<init>()     // Catch: java.lang.Throwable -> L31f
            java.lang.String r5 = "[DIAG] onWindowFocusChanged hooked on "
            r0.append(r5)     // Catch: java.lang.Throwable -> L31f
            r0.append(r7)     // Catch: java.lang.Throwable -> L31f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L31f
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L31f
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L31f
            goto L36d
        L364:
            java.lang.String r0 = "[DIAG] onWindowFocusChanged hook failed on all candidates"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L31f
            a.C0453x1.a(r0)     // Catch: java.lang.Throwable -> L31f
        L36d:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L31f
            goto L374
        L370:
            a.wd$a r0 = a.C0465xd.a(r0)
        L374:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L387
            java.lang.String r5 = "hook onWindowFocusChanged fail"
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.b(r0)
        L387:
            if (r10 == 0) goto L398
            java.lang.String r0 = r10.getName()     // Catch: java.lang.Throwable -> L396
            java.lang.String[] r0 = new java.lang.String[]{r0, r11}     // Catch: java.lang.Throwable -> L396
            java.util.List r0 = a.C0294o3.d0(r0)     // Catch: java.lang.Throwable -> L396
            goto L39c
        L396:
            r0 = move-exception
            goto L3cc
        L398:
            java.util.List r0 = a.C0435w1.K(r11)     // Catch: java.lang.Throwable -> L396
        L39c:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L396
        L3a0:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L396
            if (r5 == 0) goto L3c0
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L396
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L396
            a.C0193i9.b(r5)     // Catch: java.lang.Throwable -> L396
            java.lang.String r7 = "onStop"
            java.lang.Class[] r11 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L396
            a.r4 r13 = new a.r4     // Catch: java.lang.Throwable -> L396
            r14 = 4
            r13.<init>(r10, r1, r14)     // Catch: java.lang.Throwable -> L396
            io.github.libxposed.api.XposedInterface$HookHandle r5 = a.J8.a(r2, r5, r7, r11, r13)     // Catch: java.lang.Throwable -> L396
            if (r5 == 0) goto L3a0
            goto L3c9
        L3c0:
            java.lang.String r0 = "[DIAG] onStop hook failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L396
            a.C0453x1.a(r0)     // Catch: java.lang.Throwable -> L396
        L3c9:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L396
            goto L3d0
        L3cc:
            a.wd$a r0 = a.C0465xd.a(r0)
        L3d0:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L3e3
            java.lang.String r5 = "hook onStop fail"
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.b(r0)
        L3e3:
            java.lang.String r5 = "com.tencent.mm.ui.SingleChatInfoUI"
            java.lang.String r7 = "com.tencent.mm.chatroom.ui.ChatroomInfoUI"
            java.lang.String r10 = "com.tencent.mm.plugin.profile.ui.ContactInfoUI"
            java.lang.String[] r0 = new java.lang.String[]{r5, r7, r10}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.Iterator r11 = r0.iterator()
        L3f5:
            boolean r0 = r11.hasNext()
            java.lang.String r13 = "onCreate"
            java.lang.Class<android.os.Bundle> r14 = android.os.Bundle.class
            if (r0 == 0) goto L43a
            java.lang.Object r0 = r11.next()
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            java.lang.ClassLoader r0 = r2.f136a     // Catch: java.lang.Throwable -> L41c
            java.lang.Class r0 = a.A1.b(r0, r15)     // Catch: java.lang.Throwable -> L41c
            if (r0 == 0) goto L41e
            java.lang.Class[] r0 = new java.lang.Class[]{r14}     // Catch: java.lang.Throwable -> L41c
            a.g2 r14 = new a.g2     // Catch: java.lang.Throwable -> L41c
            r4 = 5
            r14.<init>(r4, r15)     // Catch: java.lang.Throwable -> L41c
            a.J8.a(r2, r15, r13, r0, r14)     // Catch: java.lang.Throwable -> L41c
            goto L41e
        L41c:
            r0 = move-exception
            goto L421
        L41e:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L41c
            goto L425
        L421:
            a.wd$a r0 = a.C0465xd.a(r0)
        L425:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L438
            java.lang.String r4 = "hook info page onCreate fail: "
            java.lang.String r4 = a.C0487z.k(r4, r15)
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}
            a.C0453x1.a(r0)
        L438:
            r4 = 2
            goto L3f5
        L43a:
            java.lang.ClassLoader r0 = r2.f136a     // Catch: java.lang.Throwable -> L450
            java.lang.Class r0 = a.A1.b(r0, r10)     // Catch: java.lang.Throwable -> L450
            if (r0 == 0) goto L452
            java.lang.Class[] r0 = new java.lang.Class[]{r14}     // Catch: java.lang.Throwable -> L450
            a.g2 r4 = new a.g2     // Catch: java.lang.Throwable -> L450
            r11 = 6
            r4.<init>(r11)     // Catch: java.lang.Throwable -> L450
            a.J8.a(r2, r10, r13, r0, r4)     // Catch: java.lang.Throwable -> L450
            goto L452
        L450:
            r0 = move-exception
            goto L455
        L452:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L450
            goto L459
        L455:
            a.wd$a r0 = a.C0465xd.a(r0)
        L459:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L468
            java.lang.String r4 = "hook ContactInfoUI.onCreate (whitelist) fail"
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}
            a.C0453x1.a(r0)
        L468:
            java.lang.String[] r0 = new java.lang.String[]{r5, r7}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.Iterator r4 = r0.iterator()
        L474:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4b4
            java.lang.Object r0 = r4.next()
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.ClassLoader r0 = r2.f136a     // Catch: java.lang.Throwable -> L497
            java.lang.Class r0 = a.A1.b(r0, r5)     // Catch: java.lang.Throwable -> L497
            if (r0 == 0) goto L499
            java.lang.Class[] r0 = new java.lang.Class[]{r14}     // Catch: java.lang.Throwable -> L497
            a.J3 r7 = new a.J3     // Catch: java.lang.Throwable -> L497
            r10 = 1
            r7.<init>(r5, r10)     // Catch: java.lang.Throwable -> L497
            a.J8.a(r2, r5, r13, r0, r7)     // Catch: java.lang.Throwable -> L497
            goto L499
        L497:
            r0 = move-exception
            goto L49c
        L499:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L497
            goto L4a0
        L49c:
            a.wd$a r0 = a.C0465xd.a(r0)
        L4a0:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L474
            java.lang.String r7 = "hook chat info page onCreate (whitelist) fail: "
            java.lang.String r5 = a.C0487z.k(r7, r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0}
            a.C0453x1.a(r0)
            goto L474
        L4b4:
            java.lang.ClassLoader r0 = r2.f136a     // Catch: java.lang.Throwable -> L4c8
            java.lang.Class r0 = a.A1.b(r0, r9)     // Catch: java.lang.Throwable -> L4c8
            if (r0 == 0) goto L4ca
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L4c8
            a.t r5 = new a.t     // Catch: java.lang.Throwable -> L4c8
            r10 = 1
            r5.<init>(r10, r0)     // Catch: java.lang.Throwable -> L4c8
            a.J8.a(r2, r9, r12, r4, r5)     // Catch: java.lang.Throwable -> L4c8
            goto L4ca
        L4c8:
            r0 = move-exception
            goto L4cd
        L4ca:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L4c8
            goto L4d1
        L4cd:
            a.wd$a r0 = a.C0465xd.a(r0)
        L4d1:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L4e0
            java.lang.String r4 = "hook ChattingUI.onResume fail"
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}
            a.C0453x1.a(r0)
        L4e0:
            java.lang.String r0 = "com.tencent.mm.ui.chatting.ChattingUIProxy"
            java.lang.ClassLoader r4 = r2.f136a     // Catch: java.lang.Throwable -> L501
            java.lang.Class r0 = a.A1.b(r4, r0)     // Catch: java.lang.Throwable -> L501
            if (r0 == 0) goto L503
            java.lang.String r4 = "onEnterBegin"
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L501
            java.lang.reflect.Method r4 = a.A1.d(r0, r4, r5)     // Catch: java.lang.Throwable -> L501
            if (r4 == 0) goto L503
            io.github.libxposed.api.XposedInterface$HookBuilder r4 = r2.f(r4)     // Catch: java.lang.Throwable -> L501
            a.q4 r5 = new a.q4     // Catch: java.lang.Throwable -> L501
            r5.<init>(r1, r2, r0)     // Catch: java.lang.Throwable -> L501
            r4.intercept(r5)     // Catch: java.lang.Throwable -> L501
            goto L503
        L501:
            r0 = move-exception
            goto L506
        L503:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L501
            goto L50a
        L506:
            a.wd$a r0 = a.C0465xd.a(r0)
        L50a:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L51e
            java.lang.String r4 = "ChattingUIProxy.onEnterBegin hook fail"
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}
            r4 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.b(r0)
        L51e:
            java.lang.ClassLoader r0 = r2.f136a     // Catch: java.lang.Throwable -> L536
            java.lang.Class r0 = a.A1.b(r0, r8)     // Catch: java.lang.Throwable -> L536
            if (r0 == 0) goto L538
            java.lang.String r0 = "onActivityCreated"
            java.lang.Class[] r4 = new java.lang.Class[]{r14}     // Catch: java.lang.Throwable -> L536
            a.h4 r5 = new a.h4     // Catch: java.lang.Throwable -> L536
            r7 = 5
            r5.<init>(r1, r7)     // Catch: java.lang.Throwable -> L536
            a.J8.a(r2, r8, r0, r4, r5)     // Catch: java.lang.Throwable -> L536
            goto L538
        L536:
            r0 = move-exception
            goto L53b
        L538:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L536
            goto L53f
        L53b:
            a.wd$a r0 = a.C0465xd.a(r0)
        L53f:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L553
            java.lang.String r4 = "hook BaseChattingUIFragment.onActivityCreated fail"
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}
            r4 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.b(r0)
        L553:
            a.u4 r0 = a.C0402u4.f707a
            java.lang.Class<?> r4 = r1.b
            r0.d(r2, r4)
            java.util.concurrent.CopyOnWriteArrayList<a.ca$d> r0 = a.C0086ca.f421a
            a.j2 r0 = r1.A
            a.C0086ca.b(r0)
            java.lang.String r0 = "[ConvRV] hookMessageInsertReHide: subscribed to MaskEventBus (no direct hook)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.lang.String r4 = "[ConvRV] "
            java.lang.String r0 = "] "
            java.lang.String r5 = "["
            java.lang.String r7 = "msg"
            java.lang.String r8 = "ConvRV"
            java.lang.String r9 = "hookConvSnapshotFilter: snapshot located via DexKit: "
            java.lang.ClassLoader r10 = r2.f136a     // Catch: java.lang.Throwable -> L599
            java.lang.Class<?> r11 = r1.c     // Catch: java.lang.Throwable -> L599
            if (r11 != 0) goto L59c
            java.lang.Class r11 = w(r10)     // Catch: java.lang.Throwable -> L599
            if (r11 == 0) goto L59c
            java.lang.String r10 = r11.getName()     // Catch: java.lang.Throwable -> L599
            java.lang.String r9 = r9.concat(r10)     // Catch: java.lang.Throwable -> L599
            a.C0193i9.e(r9, r7)     // Catch: java.lang.Throwable -> L599
            java.lang.String r9 = r4.concat(r9)     // Catch: java.lang.Throwable -> L599
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L599
            a.C0453x1.b(r9)     // Catch: java.lang.Throwable -> L599
            goto L59c
        L599:
            r0 = move-exception
            goto L654
        L59c:
            if (r11 != 0) goto L5a9
            java.lang.String r0 = "[ConvRV] hookConvSnapshotFilter: no snapshot class, skip"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L599
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L599
            goto L67e
        L5a9:
            java.lang.reflect.Method[] r9 = r11.getDeclaredMethods()     // Catch: java.lang.Throwable -> L599
            java.lang.String r10 = "getDeclaredMethods(...)"
            a.C0193i9.d(r9, r10)     // Catch: java.lang.Throwable -> L599
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L599
            r10.<init>()     // Catch: java.lang.Throwable -> L599
            int r12 = r9.length     // Catch: java.lang.Throwable -> L599
            r13 = r6
        L5b9:
            if (r13 >= r12) goto L5eb
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L599
            java.lang.Class[] r15 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L599
            int r15 = r15.length     // Catch: java.lang.Throwable -> L599
            r17 = r6
            r6 = 1
            if (r15 != r6) goto L5e4
            java.lang.Class[] r6 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L599
            r6 = r6[r17]     // Catch: java.lang.Throwable -> L599
            boolean r6 = r6.isPrimitive()     // Catch: java.lang.Throwable -> L599
            if (r6 != 0) goto L5e4
            java.lang.Class[] r6 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L599
            r6 = r6[r17]     // Catch: java.lang.Throwable -> L599
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            boolean r6 = a.C0193i9.a(r6, r15)     // Catch: java.lang.Throwable -> L599
            if (r6 != 0) goto L5e4
            r10.add(r14)     // Catch: java.lang.Throwable -> L599
        L5e4:
            r16 = 1
            int r13 = r13 + 1
            r6 = r17
            goto L5b9
        L5eb:
            r17 = r6
            java.util.Iterator r6 = r10.iterator()     // Catch: java.lang.Throwable -> L599
        L5f1:
            boolean r9 = r6.hasNext()     // Catch: java.lang.Throwable -> L599
            if (r9 == 0) goto L60f
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L599
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch: java.lang.Throwable -> L599
            java.lang.String r12 = "F001"
            a.C0193i9.b(r9)     // Catch: java.lang.Throwable -> L599
            a.h4 r13 = new a.h4     // Catch: java.lang.Throwable -> L599
            r14 = r17
            r13.<init>(r1, r14)     // Catch: java.lang.Throwable -> L599
            a.J8.h(r2, r12, r9, r13)     // Catch: java.lang.Throwable -> L599
            r17 = r14
            goto L5f1
        L60f:
            int r6 = r10.size()     // Catch: java.lang.Throwable -> L599
            java.lang.String r9 = r11.getName()     // Catch: java.lang.Throwable -> L599
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L599
            r10.<init>()     // Catch: java.lang.Throwable -> L599
            java.lang.String r11 = "hookConvSnapshotFilter: hooked "
            r10.append(r11)     // Catch: java.lang.Throwable -> L599
            r10.append(r6)     // Catch: java.lang.Throwable -> L599
            java.lang.String r6 = " methods on "
            r10.append(r6)     // Catch: java.lang.Throwable -> L599
            r10.append(r9)     // Catch: java.lang.Throwable -> L599
            java.lang.String r6 = " (non-destructive)"
            r10.append(r6)     // Catch: java.lang.Throwable -> L599
            java.lang.String r6 = r10.toString()     // Catch: java.lang.Throwable -> L599
            a.C0193i9.e(r6, r7)     // Catch: java.lang.Throwable -> L599
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L599
            r9.<init>(r5)     // Catch: java.lang.Throwable -> L599
            r9.append(r8)     // Catch: java.lang.Throwable -> L599
            r9.append(r0)     // Catch: java.lang.Throwable -> L599
            r9.append(r6)     // Catch: java.lang.Throwable -> L599
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L599
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L599
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L599
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L599
            goto L658
        L654:
            a.wd$a r0 = a.C0465xd.a(r0)
        L658:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L67e
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "hookConvSnapshotFilter FAILED: "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            a.C0193i9.e(r0, r7)
            java.lang.String r0 = r4.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
        L67e:
            r18.o(r19)
            if (r3 != 0) goto L693
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.n
            if (r0 == 0) goto L693
            r10 = 1
            r1.h = r10
        L693:
            return
    }

    public final void i(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.jc r0 = a.K3.a.i()
            a.x8 r1 = a.C0460x8.f762a
            boolean r1 = a.C0460x8.a()
            boolean r2 = r0.N
            java.lang.String r3 = "enter chatting ["
            java.lang.String r4 = "], Chat_User="
            java.lang.String r5 = ", tempUnhide="
            java.lang.StringBuilder r8 = a.C0487z.i(r3, r8, r4, r7, r5)
            r8.append(r1)
            java.lang.String r1 = " rehideOnLeaveChat="
            r8.append(r1)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            r1 = 1
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r1)
            a.C0453x1.b(r8)
            if (r7 == 0) goto L92
            java.util.concurrent.ExecutorService r8 = a.fh.G
            boolean r8 = a.fh.a.a(r7)
            if (r8 == 0) goto L92
            boolean r7 = r0.N
            if (r7 == 0) goto L5f
            boolean r7 = a.C0366s4.G
            if (r7 != 0) goto L5f
            boolean r7 = a.C0366s4.H
            if (r7 != 0) goto L5f
            a.C0366s4.F = r1
            a.C0366s4.a.b(r6)
            java.lang.String r7 = "enter masked chat, rehideOnLeaveChat=true → rehiding"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r1)
            a.C0453x1.b(r7)
            return
        L5f:
            boolean r7 = a.C0366s4.G
            if (r7 != 0) goto L67
            boolean r7 = a.C0366s4.H
            if (r7 == 0) goto Lbc
        L67:
            boolean r7 = a.C0366s4.G
            boolean r8 = a.C0366s4.H
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "enter masked chat from whitelisted page, skip enter-rehide (profile="
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r7 = " chatInfo="
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = ")"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r1)
            a.C0453x1.b(r7)
            return
        L92:
            if (r7 != 0) goto Lb2
            boolean r7 = a.C0460x8.a()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Chat_User is null, keep tempUnhide="
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r1)
            a.C0453x1.e(r7)
            return
        Lb2:
            boolean r7 = r0.N
            if (r7 == 0) goto Lbc
            a.C0366s4.a.b(r6)
            r7 = 0
            a.C0366s4.F = r7
        Lbc:
            return
    }

    public final void k() {
            r17 = this;
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = r17
            java.lang.ref.WeakReference<android.widget.ListView> r0 = r2.j
            if (r0 == 0) goto L162
            java.lang.Object r0 = r0.get()
            r3 = r0
            android.widget.ListView r3 = (android.widget.ListView) r3
            if (r3 != 0) goto L13
            goto L162
        L13:
            android.os.IBinder r0 = r3.getWindowToken()
            if (r0 != 0) goto L1b
            goto L162
        L1b:
            android.widget.ListAdapter r4 = r3.getAdapter()
            if (r4 != 0) goto L23
            goto L162
        L23:
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            java.util.ArrayList r0 = a.K3.a.f()
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = a.C0312p3.g0(r0, r6)
            r5.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L3b:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L4f
            java.lang.Object r6 = r0.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r6 = (top.mmjz.floatingclouds.bean.MaskItemBean) r6
            java.lang.String r6 = r6.getMaskId()
            r5.add(r6)
            goto L3b
        L4f:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r5)
            r5 = 1
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L71
        L59:
            if (r0 == 0) goto L78
            boolean r8 = r0.equals(r1)     // Catch: java.lang.Throwable -> L71
            if (r8 != 0) goto L78
            java.lang.String r8 = "getItem"
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            java.lang.reflect.Method r8 = r0.getDeclaredMethod(r8, r9)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            r8.setAccessible(r5)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            goto L7e
        L71:
            r0 = move-exception
            goto L7a
        L73:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L71
            goto L59
        L78:
            r8 = 0
            goto L7e
        L7a:
            a.wd$a r8 = a.C0465xd.a(r0)
        L7e:
            boolean r0 = r8 instanceof a.C0447wd.a
            if (r0 == 0) goto L83
            r8 = 0
        L83:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            if (r8 != 0) goto L89
            goto L162
        L89:
            int r9 = r3.getChildCount()
            r10 = 0
            r11 = r10
            r12 = r11
        L90:
            if (r11 >= r9) goto L14c
            android.view.View r13 = r3.getChildAt(r11)
            if (r13 != 0) goto L9a
            goto L147
        L9a:
            int r0 = r3.getPositionForView(r13)
            if (r0 < 0) goto L147
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r0 = r8.invoke(r4, r0)     // Catch: java.lang.Throwable -> Lad
            goto Lb2
        Lad:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        Lb2:
            boolean r14 = r0 instanceof a.C0447wd.a
            if (r14 == 0) goto Lb7
            r0 = 0
        Lb7:
            if (r0 != 0) goto Lbb
            goto L147
        Lbb:
            java.lang.String r14 = "d"
            java.lang.Object r14 = a.A1.h(r0, r14)     // Catch: java.lang.Exception -> Lda
            if (r14 == 0) goto Lda
            java.lang.String r15 = "field_username"
            java.lang.Object r14 = a.A1.h(r14, r15)     // Catch: java.lang.Exception -> Lda
            boolean r15 = r14 instanceof java.lang.String     // Catch: java.lang.Exception -> Lda
            if (r15 == 0) goto Ld0
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Exception -> Lda
            goto Ld1
        Ld0:
            r14 = 0
        Ld1:
            if (r14 == 0) goto Lda
            boolean r15 = a.yh.a(r14)     // Catch: java.lang.Exception -> Lda
            if (r15 == 0) goto Lda
            goto L12e
        Lda:
            java.lang.Class r14 = r0.getClass()
        Lde:
            if (r14 == 0) goto L12d
            boolean r15 = r14.equals(r1)
            if (r15 != 0) goto L12d
            boolean r15 = r14.equals(r1)
            if (r15 != 0) goto L12d
            java.lang.reflect.Field[] r15 = r14.getDeclaredFields()
            a.G1 r15 = a.C0435w1.I(r15)
        Lf4:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L127
            java.lang.Object r16 = r15.next()
            r7 = r16
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            int r16 = r7.getModifiers()
            boolean r16 = java.lang.reflect.Modifier.isStatic(r16)
            if (r16 != 0) goto Lf4
            r7.setAccessible(r5)
            java.lang.Object r7 = r7.get(r0)     // Catch: java.lang.Exception -> L125
            boolean r5 = r7 instanceof java.lang.String     // Catch: java.lang.Exception -> L125
            if (r5 == 0) goto L125
            r5 = r7
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L125
            boolean r5 = a.yh.a(r5)     // Catch: java.lang.Exception -> L125
            if (r5 == 0) goto L125
            r5 = r7
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L125
            r14 = r5
            goto L12e
        L125:
            r5 = 1
            goto Lf4
        L127:
            java.lang.Class r14 = r14.getSuperclass()
            r5 = 1
            goto Lde
        L12d:
            r14 = 0
        L12e:
            if (r14 != 0) goto L131
            goto L147
        L131:
            boolean r0 = r6.contains(r14)
            if (r0 == 0) goto L147
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            r0.height = r10
            r13.setLayoutParams(r0)
            r0 = 8
            r13.setVisibility(r0)
            int r12 = r12 + 1
        L147:
            int r11 = r11 + 1
            r5 = 1
            goto L90
        L14c:
            if (r12 <= 0) goto L162
            java.lang.String r0 = "[DIAG] hideMaskedConvViewsSync: hid "
            java.lang.String r1 = " masked views in ListView"
            java.lang.String r0 = a.C0487z.c(r12, r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
        L162:
            return
    }

    public final void l(android.view.View r12) {
            r11 = this;
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = r11.e
            boolean r1 = r1.get()
            if (r1 == 0) goto Lb
            goto L93
        Lb:
            java.lang.reflect.Method r1 = a.C0366s4.N
            if (r1 != 0) goto L11
            goto L93
        L11:
            java.lang.Class r2 = r12.getClass()     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L63
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Field> r3 = r11.E     // Catch: java.lang.Throwable -> L63
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L63
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.Throwable -> L63
            r4 = 0
            if (r3 != 0) goto L72
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Field> r5 = r11.E     // Catch: java.lang.Throwable -> L63
            boolean r5 = r5.containsKey(r2)     // Catch: java.lang.Throwable -> L63
            if (r5 != 0) goto L72
            java.lang.Class r3 = r12.getClass()     // Catch: java.lang.Throwable -> L63
            java.lang.reflect.Field[] r3 = r3.getDeclaredFields()     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = "getDeclaredFields(...)"
            a.C0193i9.d(r3, r5)     // Catch: java.lang.Throwable -> L63
            int r5 = r3.length     // Catch: java.lang.Throwable -> L63
            r6 = 0
            r7 = r6
        L3c:
            if (r7 >= r5) goto L67
            r8 = r3[r7]     // Catch: java.lang.Throwable -> L63
            java.lang.Class r9 = r8.getType()     // Catch: java.lang.Throwable -> L63
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> L63
            java.lang.String r10 = "NoMeasuredTextView"
            boolean r9 = a.Be.I(r9, r10, r6)     // Catch: java.lang.Throwable -> L63
            if (r9 != 0) goto L65
            java.lang.Class r9 = r8.getType()     // Catch: java.lang.Throwable -> L63
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> L63
            java.lang.String r10 = "TextView"
            boolean r9 = a.Be.I(r9, r10, r6)     // Catch: java.lang.Throwable -> L63
            if (r9 == 0) goto L61
            goto L65
        L61:
            int r7 = r7 + r0
            goto L3c
        L63:
            r12 = move-exception
            goto L90
        L65:
            r3 = r8
            goto L68
        L67:
            r3 = r4
        L68:
            if (r3 == 0) goto L6d
            r3.setAccessible(r0)     // Catch: java.lang.Throwable -> L63
        L6d:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Field> r0 = r11.E     // Catch: java.lang.Throwable -> L63
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L63
        L72:
            if (r3 == 0) goto L79
            java.lang.Object r12 = r3.get(r12)     // Catch: java.lang.Throwable -> L63
            goto L7a
        L79:
            r12 = r4
        L7a:
            boolean r0 = r12 instanceof android.view.View     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L81
            r4 = r12
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> L63
        L81:
            if (r4 != 0) goto L84
            goto L8d
        L84:
            java.lang.String r12 = ""
            java.lang.Object[] r12 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> L63
            r1.invoke(r4, r12)     // Catch: java.lang.Throwable -> L63
        L8d:
            a.Wf r12 = a.Wf.f330a     // Catch: java.lang.Throwable -> L63
            return
        L90:
            a.C0465xd.a(r12)
        L93:
            return
    }

    public final void m(android.view.View r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.e
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            goto L59
        L9:
            int r0 = a.B1.a.b()
            r1 = 2429(0x97d, float:3.404E-42)
            if (r0 < 0) goto L18
            r2 = 2141(0x85d, float:3.0E-42)
            if (r0 >= r2) goto L18
            java.lang.String r0 = "tipcnt_tv"
            goto L26
        L18:
            if (r0 != r1) goto L1d
            java.lang.String r0 = "oqu"
            goto L26
        L1d:
            r2 = 2140(0x85c, float:2.999E-42)
            java.lang.String r3 = "kmv"
            if (r2 > r0) goto L25
            r2 = 2442(0x98a, float:3.422E-42)
        L25:
            r0 = r3
        L26:
            int r0 = a.C0070bd.a(r0)
            r2 = 4
            if (r0 == 0) goto L36
            android.view.View r0 = r5.findViewById(r0)
            if (r0 == 0) goto L36
            r0.setVisibility(r2)
        L36:
            int r0 = a.B1.a.b()
            if (r0 < 0) goto L43
            r3 = 2421(0x975, float:3.393E-42)
            if (r0 >= r3) goto L43
            java.lang.String r0 = "a2f"
            goto L4a
        L43:
            if (r0 != r1) goto L48
            java.lang.String r0 = "a_w"
            goto L4a
        L48:
            java.lang.String r0 = "o_u"
        L4a:
            int r0 = a.C0070bd.a(r0)
            if (r0 == 0) goto L59
            android.view.View r5 = r5.findViewById(r0)
            if (r5 == 0) goto L59
            r5.setVisibility(r2)
        L59:
            return
    }

    public final void n(a.J8 r9, java.lang.Class<?> r10) {
            r8 = this;
            r0 = 2
            java.lang.String r1 = "F001"
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.util.concurrent.CopyOnWriteArrayList<io.github.libxposed.api.XposedInterface$HookHandle> r3 = r8.l
            java.util.Set<java.lang.Class<?>> r4 = r8.u
            boolean r5 = r4.contains(r10)
            if (r5 == 0) goto L11
            goto La4
        L11:
            r4.add(r10)
            r4 = 0
            java.lang.String r5 = "getCount"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Method r5 = a.A1.d(r10, r5, r6)     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L2e
            a.h4 r6 = new a.h4     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r8, r9, r0)     // Catch: java.lang.Throwable -> L2c
            io.github.libxposed.api.XposedInterface$HookHandle r5 = a.J8.h(r9, r1, r5, r6)     // Catch: java.lang.Throwable -> L2c
            r3.add(r5)     // Catch: java.lang.Throwable -> L2c
            goto L3d
        L2c:
            r5 = move-exception
            goto L3a
        L2e:
            java.lang.Class r5 = r10.getSuperclass()     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L3d
            r8.n(r9, r5)     // Catch: java.lang.Throwable -> L2c
            a.Wf r5 = a.Wf.f330a     // Catch: java.lang.Throwable -> L2c
            goto L3d
        L3a:
            a.C0465xd.a(r5)
        L3d:
            java.lang.String r5 = "getItem"
            java.lang.Object[] r6 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L57
            java.lang.reflect.Method r5 = a.A1.d(r10, r5, r6)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L59
            a.h4 r6 = new a.h4     // Catch: java.lang.Throwable -> L57
            r7 = 3
            r6.<init>(r8, r9, r7)     // Catch: java.lang.Throwable -> L57
            io.github.libxposed.api.XposedInterface$HookHandle r5 = a.J8.h(r9, r1, r5, r6)     // Catch: java.lang.Throwable -> L57
            r3.add(r5)     // Catch: java.lang.Throwable -> L57
            goto L59
        L57:
            r5 = move-exception
            goto L5c
        L59:
            a.Wf r5 = a.Wf.f330a     // Catch: java.lang.Throwable -> L57
            goto L5f
        L5c:
            a.C0465xd.a(r5)
        L5f:
            java.lang.String r5 = "getView"
            java.lang.Class<android.view.View> r6 = android.view.View.class
            java.lang.Class<android.view.ViewGroup> r7 = android.view.ViewGroup.class
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r6, r7}     // Catch: java.lang.Throwable -> L7c
            java.lang.reflect.Method r2 = a.A1.d(r10, r5, r2)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L7e
            a.g4 r5 = new a.g4     // Catch: java.lang.Throwable -> L7c
            r5.<init>(r8, r9, r0)     // Catch: java.lang.Throwable -> L7c
            io.github.libxposed.api.XposedInterface$HookHandle r0 = a.J8.h(r9, r1, r2, r5)     // Catch: java.lang.Throwable -> L7c
            r3.add(r0)     // Catch: java.lang.Throwable -> L7c
            goto L7e
        L7c:
            r0 = move-exception
            goto L81
        L7e:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L7c
            goto L84
        L81:
            a.C0465xd.a(r0)
        L84:
            java.lang.String r0 = "notifyDataSetChanged"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L9c
            java.lang.reflect.Method r10 = a.A1.d(r10, r0, r2)     // Catch: java.lang.Throwable -> L9c
            if (r10 == 0) goto L9e
            a.h4 r0 = new a.h4     // Catch: java.lang.Throwable -> L9c
            r2 = 4
            r0.<init>(r8, r2)     // Catch: java.lang.Throwable -> L9c
            io.github.libxposed.api.XposedInterface$HookHandle r9 = a.J8.h(r9, r1, r10, r0)     // Catch: java.lang.Throwable -> L9c
            r3.add(r9)     // Catch: java.lang.Throwable -> L9c
            goto L9e
        L9c:
            r9 = move-exception
            goto La1
        L9e:
            a.Wf r9 = a.Wf.f330a     // Catch: java.lang.Throwable -> L9c
            goto La4
        La1:
            a.C0465xd.a(r9)
        La4:
            return
    }

    public final void o(a.J8 r24) {
            r23 = this;
            r1 = r23
            r0 = r24
            java.lang.String r2 = "F001"
            java.lang.String r3 = "msg"
            java.lang.ClassLoader r4 = r0.f136a     // Catch: java.lang.Throwable -> L90
            java.lang.Class<?> r5 = r1.b     // Catch: java.lang.Throwable -> L90
            java.lang.String r8 = "] "
            java.lang.String r9 = "["
            java.lang.String r10 = "ConvRV"
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.Class r12 = java.lang.Integer.TYPE
            java.lang.String r13 = "getDeclaredMethods(...)"
            if (r5 != 0) goto L1e2
            java.lang.String r16 = "[ConvRV] hookConvEventFilter: dataSourceClass not resolved, probing from adapter class"
            java.lang.Object[] r16 = new java.lang.Object[]{r16}     // Catch: java.lang.Throwable -> L90
            a.C0453x1.b(r16)     // Catch: java.lang.Throwable -> L90
            r16 = 1
            java.lang.Class<?> r6 = r1.f678a     // Catch: java.lang.Throwable -> L90
            if (r6 == 0) goto L1d5
            java.util.LinkedHashSet r15 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L90
            r15.<init>()     // Catch: java.lang.Throwable -> L90
        L2e:
            if (r6 == 0) goto L12a
            java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
            boolean r14 = r6.equals(r14)     // Catch: java.lang.Throwable -> L90
            if (r14 != 0) goto L12a
            java.lang.reflect.Field[] r14 = r6.getDeclaredFields()     // Catch: java.lang.Throwable -> L90
            a.G1 r14 = a.C0435w1.I(r14)     // Catch: java.lang.Throwable -> L90
        L40:
            boolean r17 = r14.hasNext()     // Catch: java.lang.Throwable -> L90
            java.lang.String r7 = "android."
            r19 = r4
            java.lang.String r4 = "java."
            if (r17 == 0) goto L96
            java.lang.Object r17 = r14.next()     // Catch: java.lang.Throwable -> L90
            java.lang.reflect.Field r17 = (java.lang.reflect.Field) r17     // Catch: java.lang.Throwable -> L90
            java.lang.Class r20 = r17.getType()     // Catch: java.lang.Throwable -> L90
            boolean r20 = r20.isPrimitive()     // Catch: java.lang.Throwable -> L90
            if (r20 != 0) goto L93
            java.lang.Class r20 = r17.getType()     // Catch: java.lang.Throwable -> L90
            r21 = r5
            java.lang.String r5 = r20.getName()     // Catch: java.lang.Throwable -> L90
            r20 = r6
            r6 = 0
            boolean r4 = a.Ae.H(r5, r4, r6)     // Catch: java.lang.Throwable -> L90
            if (r4 != 0) goto L89
            java.lang.Class r4 = r17.getType()     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L90
            boolean r4 = a.Ae.H(r4, r7, r6)     // Catch: java.lang.Throwable -> L90
            if (r4 != 0) goto L89
            java.lang.Class r4 = r17.getType()     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = "getType(...)"
            a.C0193i9.d(r4, r5)     // Catch: java.lang.Throwable -> L90
            r15.add(r4)     // Catch: java.lang.Throwable -> L90
        L89:
            r4 = r19
            r6 = r20
            r5 = r21
            goto L40
        L90:
            r0 = move-exception
            goto L306
        L93:
            r4 = r19
            goto L40
        L96:
            r21 = r5
            r20 = r6
            java.lang.reflect.Method[] r5 = r20.getDeclaredMethods()     // Catch: java.lang.Throwable -> L90
            a.G1 r5 = a.C0435w1.I(r5)     // Catch: java.lang.Throwable -> L90
        La2:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L90
            if (r6 == 0) goto L120
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L90
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L90
            java.lang.Class r14 = r6.getReturnType()     // Catch: java.lang.Throwable -> L90
            boolean r14 = r14.isPrimitive()     // Catch: java.lang.Throwable -> L90
            if (r14 != 0) goto Le4
            java.lang.Class r14 = r6.getReturnType()     // Catch: java.lang.Throwable -> L90
            java.lang.String r14 = r14.getName()     // Catch: java.lang.Throwable -> L90
            r17 = r5
            r5 = 0
            boolean r14 = a.Ae.H(r14, r4, r5)     // Catch: java.lang.Throwable -> L90
            if (r14 != 0) goto Le6
            java.lang.Class r14 = r6.getReturnType()     // Catch: java.lang.Throwable -> L90
            java.lang.String r14 = r14.getName()     // Catch: java.lang.Throwable -> L90
            boolean r14 = a.Ae.H(r14, r7, r5)     // Catch: java.lang.Throwable -> L90
            if (r14 != 0) goto Le6
            java.lang.Class r5 = r6.getReturnType()     // Catch: java.lang.Throwable -> L90
            java.lang.String r14 = "getReturnType(...)"
            a.C0193i9.d(r5, r14)     // Catch: java.lang.Throwable -> L90
            r15.add(r5)     // Catch: java.lang.Throwable -> L90
            goto Le6
        Le4:
            r17 = r5
        Le6:
            java.lang.Class[] r5 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L90
            a.G1 r5 = a.C0435w1.I(r5)     // Catch: java.lang.Throwable -> L90
        Lee:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L90
            if (r6 == 0) goto L11d
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L90
            java.lang.Class r6 = (java.lang.Class) r6     // Catch: java.lang.Throwable -> L90
            boolean r14 = r6.isPrimitive()     // Catch: java.lang.Throwable -> L90
            if (r14 != 0) goto Lee
            java.lang.String r14 = r6.getName()     // Catch: java.lang.Throwable -> L90
            r22 = r5
            r5 = 0
            boolean r14 = a.Ae.H(r14, r4, r5)     // Catch: java.lang.Throwable -> L90
            if (r14 != 0) goto L11a
            java.lang.String r14 = r6.getName()     // Catch: java.lang.Throwable -> L90
            boolean r14 = a.Ae.H(r14, r7, r5)     // Catch: java.lang.Throwable -> L90
            if (r14 != 0) goto L11a
            r15.add(r6)     // Catch: java.lang.Throwable -> L90
        L11a:
            r5 = r22
            goto Lee
        L11d:
            r5 = r17
            goto La2
        L120:
            java.lang.Class r6 = r20.getSuperclass()     // Catch: java.lang.Throwable -> L90
            r4 = r19
            r5 = r21
            goto L2e
        L12a:
            r19 = r4
            r21 = r5
            java.util.Iterator r4 = r15.iterator()     // Catch: java.lang.Throwable -> L90
        L132:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L90
            if (r5 == 0) goto L1d9
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L90
            java.lang.Class r5 = (java.lang.Class) r5     // Catch: java.lang.Throwable -> L90
            java.lang.reflect.Method[] r6 = r5.getDeclaredMethods()     // Catch: java.lang.Throwable -> L90
            a.C0193i9.d(r6, r13)     // Catch: java.lang.Throwable -> L90
            int r7 = r6.length     // Catch: java.lang.Throwable -> L90
            r14 = 0
        L147:
            if (r14 >= r7) goto L185
            r15 = r6[r14]     // Catch: java.lang.Throwable -> L90
            r17 = r4
            java.lang.Class[] r4 = r15.getParameterTypes()     // Catch: java.lang.Throwable -> L90
            int r4 = r4.length     // Catch: java.lang.Throwable -> L90
            r20 = r5
            r5 = 2
            if (r4 != r5) goto L17e
            java.lang.Class[] r4 = r15.getParameterTypes()     // Catch: java.lang.Throwable -> L90
            r18 = 0
            r4 = r4[r18]     // Catch: java.lang.Throwable -> L90
            boolean r4 = a.C0193i9.a(r4, r12)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L17e
            java.lang.Class[] r4 = r15.getParameterTypes()     // Catch: java.lang.Throwable -> L90
            r4 = r4[r16]     // Catch: java.lang.Throwable -> L90
            boolean r4 = a.C0193i9.a(r4, r11)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L17e
            java.lang.Class r4 = r15.getReturnType()     // Catch: java.lang.Throwable -> L90
            java.lang.Class r5 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L90
            boolean r4 = a.C0193i9.a(r4, r5)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L17e
            goto L18a
        L17e:
            int r14 = r14 + 1
            r4 = r17
            r5 = r20
            goto L147
        L185:
            r17 = r4
            r20 = r5
            r15 = 0
        L18a:
            if (r15 == 0) goto L1d1
            java.lang.String r4 = r20.getName()     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = r15.getName()     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r6.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.String r7 = "hookConvEventFilter: found DataSource via adapter probe: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L90
            r6.append(r4)     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = "."
            r6.append(r4)     // Catch: java.lang.Throwable -> L90
            r6.append(r5)     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = "(int,String)"
            r6.append(r4)     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L90
            a.C0193i9.e(r4, r3)     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L90
            r5.append(r10)     // Catch: java.lang.Throwable -> L90
            r5.append(r8)     // Catch: java.lang.Throwable -> L90
            r5.append(r4)     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L90
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L90
            a.C0453x1.b(r4)     // Catch: java.lang.Throwable -> L90
            r5 = r20
            goto L1db
        L1d1:
            r4 = r17
            goto L132
        L1d5:
            r19 = r4
            r21 = r5
        L1d9:
            r5 = r21
        L1db:
            if (r5 != 0) goto L1e6
            java.lang.Class r5 = v(r19)     // Catch: java.lang.Throwable -> L90
            goto L1e6
        L1e2:
            r21 = r5
            r16 = 1
        L1e6:
            if (r5 != 0) goto L204
            java.lang.String r0 = "hookConvEventFilter: no DataSource class found, event-layer SKIPPED (rely on memory/render layers)"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L90
            r2.append(r10)     // Catch: java.lang.Throwable -> L90
            r2.append(r8)     // Catch: java.lang.Throwable -> L90
            r2.append(r0)     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L90
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L90
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L90
            return
        L204:
            java.lang.reflect.Method[] r4 = r5.getDeclaredMethods()     // Catch: java.lang.Throwable -> L90
            a.C0193i9.d(r4, r13)     // Catch: java.lang.Throwable -> L90
            int r6 = r4.length     // Catch: java.lang.Throwable -> L90
            r7 = 0
        L20d:
            if (r7 >= r6) goto L23b
            r14 = r4[r7]     // Catch: java.lang.Throwable -> L90
            java.lang.Class[] r15 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L90
            int r15 = r15.length     // Catch: java.lang.Throwable -> L90
            r17 = r4
            r4 = 2
            if (r15 != r4) goto L236
            java.lang.Class[] r15 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L90
            r18 = 0
            r15 = r15[r18]     // Catch: java.lang.Throwable -> L90
            boolean r15 = a.C0193i9.a(r15, r12)     // Catch: java.lang.Throwable -> L90
            if (r15 == 0) goto L236
            java.lang.Class[] r15 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L90
            r15 = r15[r16]     // Catch: java.lang.Throwable -> L90
            boolean r15 = a.C0193i9.a(r15, r11)     // Catch: java.lang.Throwable -> L90
            if (r15 == 0) goto L236
            goto L23c
        L236:
            int r7 = r7 + 1
            r4 = r17
            goto L20d
        L23b:
            r14 = 0
        L23c:
            if (r14 != 0) goto L270
            java.lang.String r0 = r5.getName()     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r2.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = "hookConvEventFilter: k(int,String) not found on "
            r2.append(r4)     // Catch: java.lang.Throwable -> L90
            r2.append(r0)     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L90
            a.C0193i9.e(r0, r3)     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L90
            r2.append(r10)     // Catch: java.lang.Throwable -> L90
            r2.append(r8)     // Catch: java.lang.Throwable -> L90
            r2.append(r0)     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L90
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L90
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L90
            return
        L270:
            a.l4 r4 = new a.l4     // Catch: java.lang.Throwable -> L90
            r5 = 0
            r4.<init>(r14, r5, r1)     // Catch: java.lang.Throwable -> L90
            a.J8.h(r0, r2, r14, r4)     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = "hookConvEventFilter: hooked fh5.w.k(int,String)"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L90
            r5.append(r10)     // Catch: java.lang.Throwable -> L90
            r5.append(r8)     // Catch: java.lang.Throwable -> L90
            r5.append(r4)     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L90
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L90
            a.C0453x1.b(r4)     // Catch: java.lang.Throwable -> L90
            java.lang.Class<?> r4 = r1.f678a     // Catch: java.lang.Throwable -> L2ca
            if (r4 != 0) goto L299
            goto L2f9
        L299:
            java.lang.reflect.Method[] r4 = r4.getDeclaredMethods()     // Catch: java.lang.Throwable -> L2ca
            a.C0193i9.d(r4, r13)     // Catch: java.lang.Throwable -> L2ca
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2ca
            r6 = 0
        L2a2:
            if (r6 >= r5) goto L2d1
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L2ca
            java.lang.String r11 = r7.getName()     // Catch: java.lang.Throwable -> L2ca
            java.lang.String r13 = "i"
            boolean r11 = a.C0193i9.a(r11, r13)     // Catch: java.lang.Throwable -> L2ca
            if (r11 == 0) goto L2cc
            java.lang.Class[] r11 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L2ca
            int r11 = r11.length     // Catch: java.lang.Throwable -> L2ca
            r13 = 3
            if (r11 != r13) goto L2cc
            java.lang.Class[] r11 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L2ca
            r18 = 0
            r11 = r11[r18]     // Catch: java.lang.Throwable -> L2ca
            boolean r11 = a.C0193i9.a(r11, r12)     // Catch: java.lang.Throwable -> L2ca
            if (r11 == 0) goto L2ce
            r15 = r7
            goto L2d2
        L2ca:
            r0 = move-exception
            goto L2fc
        L2cc:
            r18 = 0
        L2ce:
            int r6 = r6 + 1
            goto L2a2
        L2d1:
            r15 = 0
        L2d2:
            if (r15 != 0) goto L2d5
            goto L2f9
        L2d5:
            a.h4 r4 = new a.h4     // Catch: java.lang.Throwable -> L2ca
            r5 = 1
            r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> L2ca
            a.J8.h(r0, r2, r15, r4)     // Catch: java.lang.Throwable -> L2ca
            java.lang.String r0 = "hookConvEventFilter: also hooked fh5.w0.i(int,a1,Object)"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ca
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L2ca
            r2.append(r10)     // Catch: java.lang.Throwable -> L2ca
            r2.append(r8)     // Catch: java.lang.Throwable -> L2ca
            r2.append(r0)     // Catch: java.lang.Throwable -> L2ca
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L2ca
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L2ca
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L2ca
        L2f9:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L2ca
            goto L300
        L2fc:
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L90
        L300:
            a.wd r2 = new a.wd     // Catch: java.lang.Throwable -> L90
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L90
            goto L30a
        L306:
            a.wd$a r2 = a.C0465xd.a(r0)
        L30a:
            java.lang.Throwable r0 = a.C0447wd.a(r2)
            if (r0 == 0) goto L332
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "hookConvEventFilter FAILED: "
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            a.C0193i9.e(r0, r3)
            java.lang.String r2 = "[ConvRV] "
            java.lang.String r0 = r2.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
        L332:
            return
    }

    public final void p(a.J8 r4, java.lang.Class<?> r5) {
            r3 = this;
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<android.view.View> r2 = android.view.View.class
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r0}
            java.lang.String r1 = "getView"
            java.lang.reflect.Method r5 = a.A1.d(r5, r1, r0)
            if (r5 != 0) goto L13
            return
        L13:
            java.lang.ClassLoader r0 = a.C0435w1.g
            if (r0 != 0) goto L18
            goto L1d
        L18:
            java.lang.String r1 = "com.tencent.mm.autogen.table.BaseConversation"
            a.A1.b(r0, r1)
        L1d:
            io.github.libxposed.api.XposedInterface$HookBuilder r4 = r4.f(r5)
            a.p4 r5 = new a.p4
            r0 = 0
            r5.<init>(r3, r0)
            r4.intercept(r5)
            return
    }

    public final void q(a.J8 r8) {
            r7 = this;
            java.lang.String r0 = "[DIAG-T3-LV] hooking ListView.setAdapter"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.lang.Class<android.widget.ListAdapter> r0 = android.widget.ListAdapter.class
            java.lang.Class[] r5 = new java.lang.Class[]{r0}
            a.g4 r6 = new a.g4
            r0 = 1
            r6.<init>(r7, r8, r0)
            java.lang.String r3 = "android.widget.ListView"
            java.lang.String r4 = "setAdapter"
            java.lang.String r2 = "F001"
            r1 = r8
            a.J8.d(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void r(a.J8 r3, java.lang.reflect.Method r4, java.lang.String r5) {
            r2 = this;
            io.github.libxposed.api.XposedInterface$HookBuilder r4 = r3.f(r4)     // Catch: java.lang.Throwable -> Lf
            a.o4 r0 = new a.o4     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            r0.<init>(r2, r1, r3)     // Catch: java.lang.Throwable -> Lf
            io.github.libxposed.api.XposedInterface$HookHandle r3 = r4.intercept(r0)     // Catch: java.lang.Throwable -> Lf
            goto L14
        Lf:
            r3 = move-exception
            a.wd$a r3 = a.C0465xd.a(r3)
        L14:
            java.lang.Throwable r3 = a.C0447wd.a(r3)
            if (r3 == 0) goto L2e
            java.lang.String r4 = "installConvSetAdapterHook("
            java.lang.String r0 = ") fail"
            java.lang.String r4 = a.C0487z.g(r4, r5, r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r3}
            r4 = 2
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            a.C0453x1.b(r3)
        L2e:
            return
    }

    public final boolean s(java.lang.Object r11) {
            r10 = this;
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getName()
            java.util.List<java.lang.String> r1 = r10.d
            r2 = 1
            if (r1 == 0) goto L14
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L14
            goto L1d
        L14:
            java.lang.String r1 = "com.tencent.mm.ui.conversation"
            r3 = 0
            boolean r0 = a.Ae.H(r0, r1, r3)
            if (r0 == 0) goto L1e
        L1d:
            return r2
        L1e:
            java.lang.Class r11 = r11.getClass()
            java.lang.String r0 = "getMethods(...)"
            java.lang.String r1 = r11.getName()
            java.lang.String r4 = "com.tencent.mm.ui.contact"
            boolean r1 = a.Ae.H(r1, r4, r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, java.lang.Boolean> r4 = r10.z
            if (r1 == 0) goto L38
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.put(r11, r0)
            return r3
        L38:
            java.lang.Object r1 = r4.get(r11)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L45
            boolean r11 = r1.booleanValue()
            return r11
        L45:
            java.lang.reflect.Method[] r1 = r11.getMethods()     // Catch: java.lang.Throwable -> L6b
            a.C0193i9.d(r1, r0)     // Catch: java.lang.Throwable -> L6b
            int r5 = r1.length     // Catch: java.lang.Throwable -> L6b
            r6 = r3
        L4e:
            if (r6 >= r5) goto L7f
            r7 = r1[r6]     // Catch: java.lang.Throwable -> L6b
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r9 = "getCount"
            boolean r8 = a.C0193i9.a(r8, r9)     // Catch: java.lang.Throwable -> L6b
            if (r8 != 0) goto L6e
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r9 = "getItemCount"
            boolean r8 = a.C0193i9.a(r8, r9)     // Catch: java.lang.Throwable -> L6b
            if (r8 == 0) goto L7c
            goto L6e
        L6b:
            r0 = move-exception
            goto L145
        L6e:
            java.lang.Class[] r7 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r8 = "getParameterTypes(...)"
            a.C0193i9.d(r7, r8)     // Catch: java.lang.Throwable -> L6b
            int r7 = r7.length     // Catch: java.lang.Throwable -> L6b
            if (r7 != 0) goto L7c
            r1 = r2
            goto L80
        L7c:
            int r6 = r6 + 1
            goto L4e
        L7f:
            r1 = r3
        L80:
            java.lang.reflect.Method[] r5 = r11.getMethods()     // Catch: java.lang.Throwable -> L6b
            a.C0193i9.d(r5, r0)     // Catch: java.lang.Throwable -> L6b
            int r0 = r5.length     // Catch: java.lang.Throwable -> L6b
            r6 = r3
        L89:
            if (r6 >= r0) goto Lb3
            r7 = r5[r6]     // Catch: java.lang.Throwable -> L6b
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r9 = "getItem"
            boolean r8 = a.C0193i9.a(r8, r9)     // Catch: java.lang.Throwable -> L6b
            if (r8 == 0) goto Lb0
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L6b
            int r8 = r8.length     // Catch: java.lang.Throwable -> L6b
            if (r8 != r2) goto Lb0
            java.lang.Class[] r7 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L6b
            r7 = r7[r3]     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L6b
            boolean r7 = a.C0193i9.a(r7, r8)     // Catch: java.lang.Throwable -> L6b
            if (r7 == 0) goto Lb0
            r0 = r2
            goto Lb4
        Lb0:
            int r6 = r6 + 1
            goto L89
        Lb3:
            r0 = r3
        Lb4:
            if (r1 != 0) goto Lba
            if (r0 != 0) goto Lba
            goto L140
        Lba:
            r0 = r11
            r1 = r3
        Lbc:
            if (r0 == 0) goto L140
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            boolean r5 = r0.equals(r5)     // Catch: java.lang.Throwable -> L6b
            if (r5 != 0) goto L140
            r5 = 4
            if (r1 >= r5) goto L140
            java.lang.reflect.Field[] r5 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L6b
            a.G1 r5 = a.C0435w1.I(r5)     // Catch: java.lang.Throwable -> L6b
        Ld1:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r6 == 0) goto Lf6
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L6b
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6     // Catch: java.lang.Throwable -> L6b
            int r7 = r6.getModifiers()     // Catch: java.lang.Throwable -> L6b
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)     // Catch: java.lang.Throwable -> L6b
            if (r7 != 0) goto Ld1
            java.lang.Class r6 = r6.getType()     // Catch: java.lang.Throwable -> L6b
            a.C0193i9.b(r6)     // Catch: java.lang.Throwable -> L6b
            boolean r6 = j(r6)     // Catch: java.lang.Throwable -> L6b
            if (r6 == 0) goto Ld1
        Lf4:
            r3 = r2
            goto L140
        Lf6:
            java.lang.reflect.Method[] r5 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L6b
            a.G1 r5 = a.C0435w1.I(r5)     // Catch: java.lang.Throwable -> L6b
        Lfe:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r6 == 0) goto L138
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L6b
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r7 = r6.getReturnType()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r8 = "getReturnType(...)"
            a.C0193i9.d(r7, r8)     // Catch: java.lang.Throwable -> L6b
            boolean r7 = j(r7)     // Catch: java.lang.Throwable -> L6b
            if (r7 == 0) goto L11a
            goto Lf4
        L11a:
            java.lang.Class[] r6 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L6b
            a.G1 r6 = a.C0435w1.I(r6)     // Catch: java.lang.Throwable -> L6b
        L122:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r7 == 0) goto Lfe
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r7 = (java.lang.Class) r7     // Catch: java.lang.Throwable -> L6b
            a.C0193i9.b(r7)     // Catch: java.lang.Throwable -> L6b
            boolean r7 = j(r7)     // Catch: java.lang.Throwable -> L6b
            if (r7 == 0) goto L122
            goto Lf4
        L138:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L6b
            int r1 = r1 + 1
            goto Lbc
        L140:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L6b
            goto L149
        L145:
            a.wd$a r0 = a.C0465xd.a(r0)
        L149:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r3 = r0 instanceof a.C0447wd.a
            if (r3 == 0) goto L150
            r0 = r1
        L150:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r4.put(r11, r0)
            if (r1 == 0) goto L170
            java.lang.String r11 = r11.getName()
            java.lang.String r0 = "[DIAG-PROBE] probeIsConvAdapter=true: "
            java.lang.String r11 = r0.concat(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r2)
            a.C0453x1.b(r11)
        L170:
            return r1
    }

    public final void t(android.widget.ListAdapter r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L33
        L3:
            r0 = 0
            java.lang.String r1 = "getWrappedAdapter"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r1 = a.A1.a(r4, r1, r2)     // Catch: java.lang.Throwable -> Ld
            goto L12
        Ld:
            r1 = move-exception
            a.wd$a r1 = a.C0465xd.a(r1)     // Catch: java.lang.Throwable -> L2f
        L12:
            boolean r2 = r1 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L17
            r1 = 0
        L17:
            if (r1 != 0) goto L1a
            goto L1b
        L1a:
            r4 = r1
        L1b:
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Boolean> r1 = r3.n     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2f
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L2f
            java.util.Map<java.lang.Object, java.lang.String> r1 = r3.w     // Catch: java.lang.Throwable -> L2f
            r1.clear()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "notifyDataSetChanged"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L2f
            a.A1.a(r4, r1, r0)     // Catch: java.lang.Throwable -> L2f
            goto L33
        L2f:
            r4 = move-exception
            a.C0465xd.a(r4)
        L33:
            return
    }

    public final void u(android.view.View r4) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "getAdapter"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r0.invoke(r4, r2)     // Catch: java.lang.Throwable -> L27
            if (r4 != 0) goto L12
            goto L2b
        L12:
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Boolean> r0 = r3.n     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L27
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L27
            java.util.Map<java.lang.Object, java.lang.String> r0 = r3.w     // Catch: java.lang.Throwable -> L27
            r0.clear()     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = "notifyDataSetChanged"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L27
            a.A1.a(r4, r0, r1)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r4 = move-exception
            a.C0465xd.a(r4)
        L2b:
            return
    }

    public final void y(boolean r3, a.C0366s4.a.C0005a.EnumC0006a r4, a.InterfaceC0369s7<a.Wf> r5) {
            r2 = this;
            a.Me r0 = r2.C
            java.lang.Object r0 = r0.a()
            android.os.Handler r0 = (android.os.Handler) r0
            a.j0 r1 = new a.j0
            r1.<init>(r4, r3, r2, r5)
            r0.post(r1)
            return
    }

    public final void z(boolean r4, a.C0366s4.a.C0005a.EnumC0006a r5) {
            r3 = this;
            a.Me r0 = r3.C
            java.lang.Object r0 = r0.a()
            android.os.Handler r0 = (android.os.Handler) r0
            a.m4 r1 = new a.m4
            r2 = 0
            r1.<init>(r5, r4, r3, r2)
            r0.post(r1)
            return
    }
}
