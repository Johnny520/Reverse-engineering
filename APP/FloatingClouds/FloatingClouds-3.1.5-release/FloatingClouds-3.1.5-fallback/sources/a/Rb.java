package a;

/* JADX INFO: loaded from: classes.dex */
public final class Rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.Rb f246a = null;
    public static volatile java.util.Set<java.lang.Class<?>> b;
    public static final java.util.List<java.lang.String> c = null;
    public static volatile a.Rb.a d;
    public static volatile int e;
    public static volatile long f;
    public static final java.lang.Object g = null;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Class<?> f247a;
        public final java.lang.Class<?> b;
        public final java.lang.String c;

        public a(java.lang.Class<?> r2, java.lang.Class<?> r3, java.lang.String r4) {
                r1 = this;
                java.lang.String r0 = "storageInterface"
                a.C0193i9.e(r2, r0)
                r1.<init>()
                r1.f247a = r2
                r1.b = r3
                r1.c = r4
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof a.Rb.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.Rb$a r5 = (a.Rb.a) r5
                java.lang.Class<?> r1 = r5.f247a
                java.lang.Class<?> r3 = r4.f247a
                boolean r1 = a.C0193i9.a(r3, r1)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.Class<?> r1 = r4.b
                java.lang.Class<?> r3 = r5.b
                boolean r1 = a.C0193i9.a(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.lang.String r1 = r4.c
                java.lang.String r5 = r5.c
                boolean r5 = a.C0193i9.a(r1, r5)
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
        }

        public final int hashCode() {
                r2 = this;
                java.lang.Class<?> r0 = r2.f247a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.b
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.String r0 = r2.c
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public final java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ConvStoragePair(storageInterface="
                r0.<init>(r1)
                java.lang.Class<?> r1 = r3.f247a
                r0.append(r1)
                java.lang.String r1 = ", helper="
                r0.append(r1)
                java.lang.Class<?> r1 = r3.b
                r0.append(r1)
                java.lang.String r1 = ", convGetter="
                r0.append(r1)
                java.lang.String r1 = r3.c
                java.lang.String r2 = ")"
                java.lang.String r0 = a.C0487z.h(r0, r1, r2)
                return r0
        }
    }

    static {
            a.Rb r0 = new a.Rb
            r0.<init>()
            a.Rb.f246a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 8
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            java.lang.String r1 = "newSetFromMap(...)"
            a.C0193i9.d(r0, r1)
            a.Rb.b = r0
            java.lang.String r10 = "tk0.j1"
            java.lang.String r11 = "dl0.k1"
            java.lang.String r2 = "vg3.x3"
            java.lang.String r3 = "c25.e"
            java.lang.String r4 = "rv1.f"
            java.lang.String r5 = "i35.g"
            java.lang.String r6 = "zq1.a0"
            java.lang.String r7 = "pz2.a"
            java.lang.String r8 = "e42.k0"
            java.lang.String r9 = "yj0.j1"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.util.List r0 = a.C0294o3.d0(r0)
            a.Rb.c = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.Rb.g = r0
            return
    }

    public static long a() {
            int r0 = a.Rb.e
            r1 = 1
            if (r0 > r1) goto L8
            r0 = 5000(0x1388, double:2.4703E-320)
            return r0
        L8:
            int r0 = a.Rb.e
            r1 = 2
            if (r0 != r1) goto L10
            r0 = 15000(0x3a98, double:7.411E-320)
            return r0
        L10:
            r0 = 60000(0xea60, double:2.9644E-319)
            return r0
    }

    public static boolean b(java.lang.Class r6) {
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            java.lang.String r0 = "getDeclaredMethods(...)"
            a.C0193i9.d(r6, r0)
            int r0 = r6.length
            r1 = 0
            r2 = r1
        Lc:
            if (r2 >= r0) goto L32
            r3 = r6[r2]
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "s"
            boolean r4 = a.C0193i9.a(r4, r5)
            if (r4 == 0) goto L2f
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 == 0) goto L2f
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r3 = r3.length
            r4 = 1
            if (r3 != r4) goto L2f
            return r4
        L2f:
            int r2 = r2 + 1
            goto Lc
        L32:
            return r1
    }

    public static boolean c(java.lang.Object r6) {
            java.lang.Object r6 = l(r6)     // Catch: java.lang.Throwable -> L43
            r0 = 0
            if (r6 != 0) goto L8
            return r0
        L8:
            java.lang.String r1 = m(r6)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L15
            java.lang.String r6 = "rconversation"
            boolean r6 = r1.equalsIgnoreCase(r6)     // Catch: java.lang.Throwable -> L43
            return r6
        L15:
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L43
        L19:
            if (r6 == 0) goto L40
            java.lang.reflect.Field[] r1 = r6.getDeclaredFields()     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "getDeclaredFields(...)"
            a.C0193i9.d(r1, r2)     // Catch: java.lang.Throwable -> L43
            int r2 = r1.length     // Catch: java.lang.Throwable -> L43
            r3 = r0
        L26:
            if (r3 >= r2) goto L3b
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L43
            java.lang.String r5 = "field_parentRef"
            boolean r4 = a.C0193i9.a(r4, r5)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L38
            r6 = 1
            return r6
        L38:
            int r3 = r3 + 1
            goto L26
        L3b:
            java.lang.Class r6 = r6.getSuperclass()     // Catch: java.lang.Throwable -> L43
            goto L19
        L40:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L43
            goto L48
        L43:
            r6 = move-exception
            a.wd$a r6 = a.C0465xd.a(r6)
        L48:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r6 instanceof a.C0447wd.a
            if (r1 == 0) goto L4f
            r6 = r0
        L4f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
    }

    public static java.lang.Class d(java.lang.ClassLoader r3, java.util.List r4, a.D7 r5, a.InterfaceC0369s7 r6) {
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class r1 = a.A1.b(r3, r0)
            if (r1 != 0) goto L17
            goto L4
        L17:
            java.lang.Object r2 = r5.f(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L4
            java.lang.String r3 = "ObfResolv: DexKit 命中 "
            java.lang.String r3 = r3.concat(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r4 = 1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            a.C0453x1.b(r3)
            return r1
        L36:
            java.lang.Object r3 = r6.a()
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
    }

    public static java.lang.Class e(java.lang.ClassLoader r4) {
            java.lang.String r0 = "cl"
            a.C0193i9.e(r4, r0)
            java.util.List r0 = a.C0043a5.c()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class r2 = a.A1.b(r4, r1)
            if (r2 != 0) goto L20
            goto Ld
        L20:
            a.Rb r3 = a.Rb.f246a
            r3.getClass()
            boolean r3 = b(r2)
            if (r3 == 0) goto Ld
            java.lang.String r4 = "ObfResolv: DexKit 命中 "
            java.lang.String r4 = r4.concat(r1)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r0 = 1
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            a.C0453x1.b(r4)
            return r2
        L3e:
            java.lang.String r0 = "com.tencent.mm.storage.e4"
            java.lang.Class r0 = a.A1.b(r4, r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "com.tencent.mm.storage.l4"
            java.lang.Class r0 = a.A1.b(r4, r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "e3.x3"
            java.lang.Class r0 = a.A1.b(r4, r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "ge3.x3"
            java.lang.Class r0 = a.A1.b(r4, r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "sc3.x3"
            java.lang.Class r0 = a.A1.b(r4, r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "sc3.x"
            java.lang.Class r0 = a.A1.b(r4, r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "sc3.x0"
            java.lang.Class r4 = a.A1.b(r4, r0)
            return r4
        L75:
            return r0
    }

    public static java.lang.Class f(java.lang.ClassLoader r22) {
            r0 = r22
            java.lang.String r1 = "cl"
            a.C0193i9.e(r0, r1)
            java.lang.String r1 = "conv_storage_helper_v1"
            org.json.JSONObject r1 = a.C0043a5.d(r1)
            if (r1 == 0) goto L16
            java.lang.String r2 = "classNames"
            java.util.List r1 = a.C0043a5.g(r2, r1)
            goto L18
        L16:
            a.Y5 r1 = a.Y5.f351a
        L18:
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class r3 = a.A1.b(r0, r2)
            if (r3 != 0) goto L2f
            goto L1c
        L2f:
            a.Rb r4 = a.Rb.f246a
            r4.getClass()
            boolean r4 = b(r3)
            if (r4 == 0) goto L1c
            java.lang.String r0 = "ObfResolv: DexKit 命中 "
            java.lang.String r0 = r0.concat(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
            return r3
        L4d:
            java.lang.String r20 = "zg0.j1"
            java.lang.String r21 = "zf0.j1"
            java.lang.String r4 = "yj0.j1"
            java.lang.String r5 = "yj0.h1"
            java.lang.String r6 = "yj0.i1"
            java.lang.String r7 = "yj0.g1"
            java.lang.String r8 = "yj0.f1"
            java.lang.String r9 = "yj0.e1"
            java.lang.String r10 = "yj0.d1"
            java.lang.String r11 = "yj0.c1"
            java.lang.String r12 = "yj0.b1"
            java.lang.String r13 = "yj0.a1"
            java.lang.String r14 = "yk0.j1"
            java.lang.String r15 = "yk0.h1"
            java.lang.String r16 = "yk0.i1"
            java.lang.String r17 = "yj0.k1"
            java.lang.String r18 = "yj0.l1"
            java.lang.String r19 = "zh0.j1"
            java.lang.String[] r1 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}
            java.util.List r1 = a.C0294o3.d0(r1)
            java.util.Iterator r1 = r1.iterator()
        L7d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L90
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class r2 = a.A1.b(r0, r2)
            if (r2 == 0) goto L7d
            return r2
        L90:
            r0 = 0
            return r0
    }

    public static a.Rb.a g(java.lang.ClassLoader r12) {
            java.lang.String r0 = "cl"
            a.C0193i9.e(r12, r0)
            a.Rb$a r0 = a.Rb.d
            if (r0 == 0) goto La
            return r0
        La:
            long r0 = a.Rb.f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L23
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = a.Rb.f
            long r4 = r4 - r6
            long r6 = a()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L23
            return r1
        L23:
            java.lang.Object r0 = a.Rb.g
            monitor-enter(r0)
            a.Rb$a r4 = a.Rb.d     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L2c
            monitor-exit(r0)
            return r4
        L2c:
            long r4 = a.Rb.f     // Catch: java.lang.Throwable -> L48
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L4b
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L48
            long r6 = a.Rb.f     // Catch: java.lang.Throwable -> L48
            long r4 = r4 - r6
            a.Rb r6 = a.Rb.f246a     // Catch: java.lang.Throwable -> L48
            r6.getClass()     // Catch: java.lang.Throwable -> L48
            long r6 = a()     // Catch: java.lang.Throwable -> L48
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L4b
            monitor-exit(r0)
            return r1
        L48:
            r12 = move-exception
            goto L183
        L4b:
            java.util.Set<java.lang.Class<?>> r4 = a.Rb.b     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L48
        L51:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L69
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L48
            java.lang.Class r5 = (java.lang.Class) r5     // Catch: java.lang.Throwable -> L48
            a.Rb r6 = a.Rb.f246a     // Catch: java.lang.Throwable -> L48
            r6.getClass()     // Catch: java.lang.Throwable -> L48
            a.Rb$a r5 = j(r12, r5)     // Catch: java.lang.Throwable -> L48
            if (r5 != 0) goto L6a
            goto L51
        L69:
            r5 = r1
        L6a:
            r4 = 1
            if (r5 != 0) goto Laf
            java.util.List<java.lang.String> r6 = a.Rb.c     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L48
        L73:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r7 == 0) goto Laf
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L48
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L48
            java.lang.Class r8 = a.A1.b(r12, r7)     // Catch: java.lang.Throwable -> L48
            if (r8 != 0) goto L86
            goto L73
        L86:
            a.Rb r9 = a.Rb.f246a     // Catch: java.lang.Throwable -> L48
            r9.getClass()     // Catch: java.lang.Throwable -> L48
            a.Rb$a r8 = j(r12, r8)     // Catch: java.lang.Throwable -> L48
            if (r8 != 0) goto L92
            goto L73
        L92:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r5.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = "ObfResolv: 接口候选命中 "
            r5.append(r6)     // Catch: java.lang.Throwable -> L48
            r5.append(r7)     // Catch: java.lang.Throwable -> L48
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L48
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L48
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r4)     // Catch: java.lang.Throwable -> L48
            a.C0453x1.b(r5)     // Catch: java.lang.Throwable -> L48
            r5 = r8
        Laf:
            if (r5 != 0) goto L101
            java.util.List r6 = a.C0043a5.c()     // Catch: java.lang.Throwable -> L48
            java.lang.String r7 = "conv_storage_helper_v1"
            org.json.JSONObject r7 = a.C0043a5.d(r7)     // Catch: java.lang.Throwable -> L48
            if (r7 == 0) goto Lc4
            java.lang.String r8 = "classNames"
            java.util.List r7 = a.C0043a5.g(r8, r7)     // Catch: java.lang.Throwable -> L48
            goto Lc6
        Lc4:
            a.Y5 r7 = a.Y5.f351a     // Catch: java.lang.Throwable -> L48
        Lc6:
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L48
        Lca:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r8 == 0) goto L101
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L48
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L48
            java.lang.Class r8 = a.A1.b(r12, r8)     // Catch: java.lang.Throwable -> L48
            if (r8 != 0) goto Ldd
            goto Lca
        Ldd:
            java.util.Iterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L48
        Le1:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r10 == 0) goto Lca
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L48
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L48
            java.lang.Class r10 = a.A1.b(r12, r10)     // Catch: java.lang.Throwable -> L48
            if (r10 != 0) goto Lf4
            goto Le1
        Lf4:
            a.Rb r11 = a.Rb.f246a     // Catch: java.lang.Throwable -> L48
            r11.getClass()     // Catch: java.lang.Throwable -> L48
            a.Rb$a r10 = i(r10, r8)     // Catch: java.lang.Throwable -> L48
            if (r10 != 0) goto L100
            goto Le1
        L100:
            r5 = r10
        L101:
            if (r5 != 0) goto L138
            java.lang.String r6 = "all_j1_classes"
            org.json.JSONObject r6 = a.C0043a5.d(r6)     // Catch: java.lang.Throwable -> L48
            if (r6 == 0) goto L112
            java.lang.String r7 = "classes"
            java.util.List r6 = a.C0043a5.g(r7, r6)     // Catch: java.lang.Throwable -> L48
            goto L114
        L112:
            a.Y5 r6 = a.Y5.f351a     // Catch: java.lang.Throwable -> L48
        L114:
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L48
        L118:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r7 == 0) goto L138
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L48
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L48
            java.lang.Class r7 = a.A1.b(r12, r7)     // Catch: java.lang.Throwable -> L48
            if (r7 != 0) goto L12b
            goto L118
        L12b:
            a.Rb r8 = a.Rb.f246a     // Catch: java.lang.Throwable -> L48
            r8.getClass()     // Catch: java.lang.Throwable -> L48
            a.Rb$a r7 = i(r7, r1)     // Catch: java.lang.Throwable -> L48
            if (r7 != 0) goto L137
            goto L118
        L137:
            r5 = r7
        L138:
            if (r5 == 0) goto L142
            a.Rb.d = r5     // Catch: java.lang.Throwable -> L48
            r12 = 0
            a.Rb.e = r12     // Catch: java.lang.Throwable -> L48
            a.Rb.f = r2     // Catch: java.lang.Throwable -> L48
            goto L181
        L142:
            int r12 = a.Rb.e     // Catch: java.lang.Throwable -> L48
            int r12 = r12 + r4
            a.Rb.e = r12     // Catch: java.lang.Throwable -> L48
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L48
            a.Rb.f = r1     // Catch: java.lang.Throwable -> L48
            int r12 = a.Rb.e     // Catch: java.lang.Throwable -> L48
            a.Rb r1 = a.Rb.f246a     // Catch: java.lang.Throwable -> L48
            r1.getClass()     // Catch: java.lang.Throwable -> L48
            long r1 = a()     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r3.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = "ObfResolv: resolveConvStoragePair FAILED (count="
            r3.append(r6)     // Catch: java.lang.Throwable -> L48
            r3.append(r12)     // Catch: java.lang.Throwable -> L48
            java.lang.String r12 = ", backoff="
            r3.append(r12)     // Catch: java.lang.Throwable -> L48
            r3.append(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r12 = "ms)"
            r3.append(r12)     // Catch: java.lang.Throwable -> L48
            java.lang.String r12 = r3.toString()     // Catch: java.lang.Throwable -> L48
            java.lang.Object[] r12 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> L48
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r4)     // Catch: java.lang.Throwable -> L48
            a.C0453x1.e(r12)     // Catch: java.lang.Throwable -> L48
        L181:
            monitor-exit(r0)
            return r5
        L183:
            monitor-exit(r0)
            throw r12
    }

    public static java.lang.Class h(java.lang.ClassLoader r5) {
            java.lang.String r0 = "cl"
            a.C0193i9.e(r5, r0)
            java.lang.Object r0 = a.C0043a5.f384a
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.String r2 = "incoming_call_mgr_v1"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L15
            goto L1b
        L15:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1b
            r2.<init>(r0)     // Catch: java.lang.Exception -> L1b
            r1 = r2
        L1b:
            a.Y5 r0 = a.Y5.f351a
            if (r1 == 0) goto L59
            java.lang.String r2 = "classNames"
            org.json.JSONArray r1 = r1.optJSONArray(r2)
            if (r1 != 0) goto L28
            goto L59
        L28:
            r0 = 0
            int r2 = r1.length()
            a.f9 r0 = a.Oc.D(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = a.C0312p3.g0(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L40:
            r3 = r0
            a.e9 r3 = (a.C0121e9) r3
            boolean r3 = r3.c
            if (r3 == 0) goto L58
            r3 = r0
            a.c9 r3 = (a.AbstractC0085c9) r3
            int r3 = r3.a()
            java.lang.String r4 = ""
            java.lang.String r3 = r1.optString(r3, r4)
            r2.add(r3)
            goto L40
        L58:
            r0 = r2
        L59:
            a.O8 r1 = new a.O8
            r2 = 21
            r1.<init>(r2)
            a.Qb r2 = new a.Qb
            r3 = 1
            r2.<init>(r3, r5)
            java.lang.Class r5 = d(r5, r0, r1, r2)
            return r5
    }

    public static a.Rb.a i(java.lang.Class r25, java.lang.Class r26) {
            r1 = r25
            r0 = r26
            java.lang.String r2 = "getDeclaredMethods(...)"
            r3 = 0
            java.lang.reflect.Method[] r4 = r1.getDeclaredMethods()     // Catch: java.lang.Throwable -> L46
            a.C0193i9.d(r4, r2)     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            r5.<init>()     // Catch: java.lang.Throwable -> L46
            int r6 = r4.length     // Catch: java.lang.Throwable -> L46
            r7 = 0
            r8 = r7
        L16:
            r9 = 1
            java.lang.Class r10 = java.lang.Void.TYPE
            if (r8 >= r6) goto L4c
            r11 = r4[r8]     // Catch: java.lang.Throwable -> L46
            int r12 = r11.getModifiers()     // Catch: java.lang.Throwable -> L46
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)     // Catch: java.lang.Throwable -> L46
            if (r12 == 0) goto L49
            java.lang.Class[] r12 = r11.getParameterTypes()     // Catch: java.lang.Throwable -> L46
            int r12 = r12.length     // Catch: java.lang.Throwable -> L46
            if (r12 != r9) goto L49
            java.lang.Class r9 = r11.getReturnType()     // Catch: java.lang.Throwable -> L46
            boolean r9 = r9.isPrimitive()     // Catch: java.lang.Throwable -> L46
            if (r9 != 0) goto L49
            java.lang.Class r9 = r11.getReturnType()     // Catch: java.lang.Throwable -> L46
            boolean r9 = a.C0193i9.a(r9, r10)     // Catch: java.lang.Throwable -> L46
            if (r9 != 0) goto L49
            r5.add(r11)     // Catch: java.lang.Throwable -> L46
            goto L49
        L46:
            r0 = move-exception
            goto L3d4
        L49:
            int r8 = r8 + 1
            goto L16
        L4c:
            boolean r4 = r5.isEmpty()     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L55
            r0 = r3
            goto L3d8
        L55:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            r4.<init>()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L5f
            r4.add(r0)     // Catch: java.lang.Throwable -> L46
        L5f:
            java.util.Iterator r0 = r5.iterator()     // Catch: java.lang.Throwable -> L46
        L63:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L7f
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L46
            java.lang.Class[] r6 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L46
            r6 = r6[r7]     // Catch: java.lang.Throwable -> L46
            boolean r8 = r6.isInterface()     // Catch: java.lang.Throwable -> L46
            if (r8 == 0) goto L63
            r4.add(r6)     // Catch: java.lang.Throwable -> L46
            goto L63
        L7f:
            java.lang.String r0 = r1.getName()     // Catch: java.lang.Throwable -> L46
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r8.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = "ObfResolv: resolveViaHelperOnly helper="
            r8.append(r11)     // Catch: java.lang.Throwable -> L46
            r8.append(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = " ifaceCands="
            r8.append(r0)     // Catch: java.lang.Throwable -> L46
            r8.append(r6)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r9)     // Catch: java.lang.Throwable -> L46
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L46
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L46
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L46
            java.util.List r0 = a.C0383t3.w0(r0)     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L46
        Lb8:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L3d2
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L46
            r6 = r0
            java.lang.Class r6 = (java.lang.Class) r6     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r0 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList r8 = a.C0294o3.e0(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Constructor r0 = r6.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> Ld6
            java.lang.Object r0 = r0.newInstance(r3)     // Catch: java.lang.Throwable -> Ld6
            goto Ldb
        Ld6:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L46
        Ldb:
            boolean r11 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L46
            if (r11 == 0) goto Le0
            r0 = r3
        Le0:
            if (r0 == 0) goto Le5
            r8.add(r0)     // Catch: java.lang.Throwable -> L46
        Le5:
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L46
        Le9:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto Lb8
            java.lang.Object r11 = r8.next()     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r12 = r5.iterator()     // Catch: java.lang.Throwable -> L46
        Lf7:
            boolean r0 = r12.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L11d
            java.lang.Object r0 = r12.next()     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L46
            r0.setAccessible(r9)     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r13 = new java.lang.Object[]{r11}     // Catch: java.lang.Throwable -> L10f
            java.lang.Object r0 = r0.invoke(r3, r13)     // Catch: java.lang.Throwable -> L10f
            goto L114
        L10f:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L46
        L114:
            boolean r13 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L46
            if (r13 == 0) goto L119
            r0 = r3
        L119:
            if (r0 == 0) goto Lf7
            r12 = r0
            goto L11e
        L11d:
            r12 = r3
        L11e:
            if (r12 != 0) goto L121
            goto Le9
        L121:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            r13.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.Class r0 = r12.getClass()     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L46
            a.C0193i9.d(r0, r2)     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            r14.<init>()     // Catch: java.lang.Throwable -> L46
            int r15 = r0.length     // Catch: java.lang.Throwable -> L46
            r16 = r7
        L139:
            if (r7 >= r15) goto L169
            r3 = r0[r7]     // Catch: java.lang.Throwable -> L46
            java.lang.Class[] r9 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L46
            r26 = r0
            java.lang.String r0 = "getParameterTypes(...)"
            a.C0193i9.d(r9, r0)     // Catch: java.lang.Throwable -> L46
            int r0 = r9.length     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L162
            java.lang.Class r0 = r3.getReturnType()     // Catch: java.lang.Throwable -> L46
            boolean r0 = a.C0193i9.a(r0, r10)     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L162
            java.lang.Class r0 = r3.getReturnType()     // Catch: java.lang.Throwable -> L46
            boolean r0 = r0.isPrimitive()     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L162
            r14.add(r3)     // Catch: java.lang.Throwable -> L46
        L162:
            int r7 = r7 + 1
            r0 = r26
            r3 = 0
            r9 = 1
            goto L139
        L169:
            java.util.Iterator r3 = r14.iterator()     // Catch: java.lang.Throwable -> L46
        L16d:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L46
            java.lang.Class r7 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.String r15 = "n"
            if (r0 == 0) goto L1f6
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L46
            r14 = r0
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14     // Catch: java.lang.Throwable -> L46
            r18 = r3
            r3 = 1
            r14.setAccessible(r3)     // Catch: java.lang.Throwable -> L46
            r3 = 0
            java.lang.Object r0 = r14.invoke(r12, r3)     // Catch: java.lang.Throwable -> L18c
            goto L191
        L18c:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L46
        L191:
            boolean r3 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L196
            r0 = 0
        L196:
            if (r0 != 0) goto L19b
            r3 = r18
            goto L16d
        L19b:
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()     // Catch: java.lang.Throwable -> L46
            a.C0193i9.d(r3, r2)     // Catch: java.lang.Throwable -> L46
            r19 = r4
            int r4 = r3.length     // Catch: java.lang.Throwable -> L46
            r20 = r3
            r3 = r16
        L1ad:
            if (r3 >= r4) goto L1e9
            r21 = r20[r3]     // Catch: java.lang.Throwable -> L46
            r22 = r3
            java.lang.String r3 = r21.getName()     // Catch: java.lang.Throwable -> L46
            boolean r3 = a.C0193i9.a(r3, r15)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L1ef
            java.lang.Class[] r3 = r21.getParameterTypes()     // Catch: java.lang.Throwable -> L46
            int r3 = r3.length     // Catch: java.lang.Throwable -> L46
            r23 = r4
            r4 = 2
            if (r3 != r4) goto L1f1
            java.lang.Class[] r3 = r21.getParameterTypes()     // Catch: java.lang.Throwable -> L46
            r3 = r3[r16]     // Catch: java.lang.Throwable -> L46
            boolean r3 = a.C0193i9.a(r3, r9)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L1f1
            java.lang.Class[] r3 = r21.getParameterTypes()     // Catch: java.lang.Throwable -> L46
            r17 = 1
            r3 = r3[r17]     // Catch: java.lang.Throwable -> L46
            boolean r3 = a.C0193i9.a(r3, r7)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L1f1
            a.mc r3 = new a.mc     // Catch: java.lang.Throwable -> L46
            r3.<init>(r14, r0)     // Catch: java.lang.Throwable -> L46
            r13.add(r3)     // Catch: java.lang.Throwable -> L46
        L1e9:
            r3 = r18
            r4 = r19
            goto L16d
        L1ef:
            r23 = r4
        L1f1:
            int r3 = r22 + 1
            r4 = r23
            goto L1ad
        L1f6:
            r19 = r4
            java.util.Iterator r3 = r13.iterator()     // Catch: java.lang.Throwable -> L46
        L1fc:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "getName(...)"
            java.lang.String r14 = " iface="
            if (r0 == 0) goto L2d6
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L46
            a.mc r0 = (a.C0267mc) r0     // Catch: java.lang.Throwable -> L46
            r18 = r3
            A r3 = r0.f578a     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L46
            r20 = r3
            B r3 = r0.b     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = l(r3)     // Catch: java.lang.Throwable -> L221
            if (r0 == 0) goto L223
            java.lang.String r0 = m(r0)     // Catch: java.lang.Throwable -> L221
            goto L224
        L221:
            r0 = move-exception
            goto L227
        L223:
            r0 = 0
        L224:
            r21 = r3
            goto L22c
        L227:
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L46
            goto L224
        L22c:
            boolean r3 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L231
            r0 = 0
        L231:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = r20.getName()     // Catch: java.lang.Throwable -> L46
            java.lang.Class r22 = r21.getClass()     // Catch: java.lang.Throwable -> L46
            r23 = r5
            java.lang.String r5 = r22.getName()     // Catch: java.lang.Throwable -> L46
            r22 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r8.<init>()     // Catch: java.lang.Throwable -> L46
            r24 = r10
            java.lang.String r10 = "ObfResolv: 候选 getter="
            r8.append(r10)     // Catch: java.lang.Throwable -> L46
            r8.append(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = " convStore="
            r8.append(r3)     // Catch: java.lang.Throwable -> L46
            r8.append(r5)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = " sampleTable="
            r8.append(r3)     // Catch: java.lang.Throwable -> L46
            r8.append(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L46
            r3 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.Throwable -> L46
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L46
            boolean r0 = c(r21)     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L2cc
            java.lang.String r0 = r1.getName()     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = r6.getName()     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = r20.getName()     // Catch: java.lang.Throwable -> L46
            if (r11 != r6) goto L289
            java.lang.String r5 = "Class"
            goto L28b
        L289:
            java.lang.String r5 = "instance"
        L28b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r7.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r8 = "ObfResolv: 解析命中(已验证rconversation) helper="
            r7.append(r8)     // Catch: java.lang.Throwable -> L46
            r7.append(r0)     // Catch: java.lang.Throwable -> L46
            r7.append(r14)     // Catch: java.lang.Throwable -> L46
            r7.append(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = " getter="
            r7.append(r0)     // Catch: java.lang.Throwable -> L46
            r7.append(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = " viaArg="
            r7.append(r0)     // Catch: java.lang.Throwable -> L46
            r7.append(r5)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L46
            r3 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.Throwable -> L46
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L46
            a.Rb$a r0 = new a.Rb$a     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = r20.getName()     // Catch: java.lang.Throwable -> L46
            a.C0193i9.d(r2, r4)     // Catch: java.lang.Throwable -> L46
            r0.<init>(r6, r1, r2)     // Catch: java.lang.Throwable -> L46
            goto L3d8
        L2cc:
            r3 = r18
            r8 = r22
            r5 = r23
            r10 = r24
            goto L1fc
        L2d6:
            r23 = r5
            r22 = r8
            r24 = r10
            java.lang.Object r0 = a.C0383t3.n0(r13)     // Catch: java.lang.Throwable -> L46
            a.mc r0 = (a.C0267mc) r0     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L347
            A r2 = r0.f578a     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L46
            B r0 = r0.b     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = l(r0)     // Catch: java.lang.Throwable -> L2f9
            if (r0 == 0) goto L2fb
            java.lang.String r0 = m(r0)     // Catch: java.lang.Throwable -> L2f9
            goto L301
        L2f9:
            r0 = move-exception
            goto L2fd
        L2fb:
            r0 = 0
            goto L301
        L2fd:
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L46
        L301:
            boolean r5 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L306
            r0 = 0
        L306:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = r1.getName()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r7.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r8 = "ObfResolv: WARN 未验证到 rconversation 存储，回退首个 getter="
            r7.append(r8)     // Catch: java.lang.Throwable -> L46
            r7.append(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = " table="
            r7.append(r3)     // Catch: java.lang.Throwable -> L46
            r7.append(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = " (可能误选联系人存储) helper="
            r7.append(r0)     // Catch: java.lang.Throwable -> L46
            r7.append(r5)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L46
            r3 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.Throwable -> L46
            a.C0453x1.e(r0)     // Catch: java.lang.Throwable -> L46
            a.Rb$a r0 = new a.Rb$a     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L46
            a.C0193i9.d(r2, r4)     // Catch: java.lang.Throwable -> L46
            r0.<init>(r6, r1, r2)     // Catch: java.lang.Throwable -> L46
            goto L3d8
        L347:
            java.lang.Class r0 = r12.getClass()     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L46
            a.C0193i9.d(r0, r2)     // Catch: java.lang.Throwable -> L46
            int r3 = r0.length     // Catch: java.lang.Throwable -> L46
            r4 = r16
        L355:
            if (r4 >= r3) goto L3c4
            r5 = r0[r4]     // Catch: java.lang.Throwable -> L46
            java.lang.String r8 = r5.getName()     // Catch: java.lang.Throwable -> L46
            boolean r8 = a.C0193i9.a(r8, r15)     // Catch: java.lang.Throwable -> L46
            if (r8 == 0) goto L3bf
            java.lang.Class[] r8 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L46
            int r8 = r8.length     // Catch: java.lang.Throwable -> L46
            r10 = 2
            if (r8 != r10) goto L3bd
            java.lang.Class[] r8 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L46
            r8 = r8[r16]     // Catch: java.lang.Throwable -> L46
            boolean r8 = a.C0193i9.a(r8, r9)     // Catch: java.lang.Throwable -> L46
            if (r8 == 0) goto L3bd
            java.lang.Class[] r5 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L46
            r17 = 1
            r5 = r5[r17]     // Catch: java.lang.Throwable -> L46
            boolean r5 = a.C0193i9.a(r5, r7)     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L3bd
            java.lang.String r0 = r1.getName()     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = r6.getName()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r3.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "ObfResolv: 解析命中(旧链) helper="
            r3.append(r4)     // Catch: java.lang.Throwable -> L46
            r3.append(r0)     // Catch: java.lang.Throwable -> L46
            r3.append(r14)     // Catch: java.lang.Throwable -> L46
            r3.append(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = " getter=Tg"
            r3.append(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L46
            r5 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> L46
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L46
            a.Rb$a r0 = new a.Rb$a     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = "Tg"
            r0.<init>(r6, r1, r2)     // Catch: java.lang.Throwable -> L46
            goto L3d8
        L3bd:
            r5 = 1
            goto L3c1
        L3bf:
            r5 = 1
            r10 = 2
        L3c1:
            int r4 = r4 + 1
            goto L355
        L3c4:
            r7 = r16
            r4 = r19
            r8 = r22
            r5 = r23
            r10 = r24
            r3 = 0
            r9 = 1
            goto Le9
        L3d2:
            r0 = 0
            goto L3d8
        L3d4:
            a.wd$a r0 = a.C0465xd.a(r0)
        L3d8:
            boolean r1 = r0 instanceof a.C0447wd.a
            if (r1 == 0) goto L3de
            r3 = 0
            goto L3df
        L3de:
            r3 = r0
        L3df:
            a.Rb$a r3 = (a.Rb.a) r3
            return r3
    }

    public static a.Rb.a j(java.lang.ClassLoader r6, java.lang.Class r7) {
            java.lang.String r0 = "gm0.j1"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            java.util.ArrayList r1 = a.C0294o3.e0(r1)
            java.lang.String r2 = "all_j1_classes"
            org.json.JSONObject r2 = a.C0043a5.d(r2)
            if (r2 == 0) goto L19
            java.lang.String r3 = "classes"
            java.util.List r2 = a.C0043a5.g(r3, r2)
            goto L1b
        L19:
            a.Y5 r2 = a.Y5.f351a
        L1b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = a.C0193i9.a(r5, r0)
            if (r5 != 0) goto L24
            r3.add(r4)
            goto L24
        L3b:
            r1.addAll(r3)
            int r0 = r1.size()
            java.lang.String r2 = "ObfResolv: resolveViaInterface helperNames count="
            java.lang.String r0 = a.C0487z.e(r2, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r2 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.b(r0)
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class r1 = a.A1.b(r6, r1)
            if (r1 != 0) goto L6b
            goto L58
        L6b:
            a.Rb$a r1 = i(r1, r7)
            if (r1 == 0) goto L58
            return r1
        L72:
            r6 = 0
            return r6
    }

    public static java.lang.Class k(java.lang.ClassLoader r5) {
            java.lang.String r0 = "cl"
            a.C0193i9.e(r5, r0)
            java.lang.Object r0 = a.C0043a5.f384a
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.String r2 = "voip_mgr_class_v1"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L15
            goto L1b
        L15:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1b
            r2.<init>(r0)     // Catch: java.lang.Exception -> L1b
            r1 = r2
        L1b:
            a.Y5 r0 = a.Y5.f351a
            if (r1 == 0) goto L59
            java.lang.String r2 = "classNames"
            org.json.JSONArray r1 = r1.optJSONArray(r2)
            if (r1 != 0) goto L28
            goto L59
        L28:
            r0 = 0
            int r2 = r1.length()
            a.f9 r0 = a.Oc.D(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = a.C0312p3.g0(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L40:
            r3 = r0
            a.e9 r3 = (a.C0121e9) r3
            boolean r3 = r3.c
            if (r3 == 0) goto L58
            r3 = r0
            a.c9 r3 = (a.AbstractC0085c9) r3
            int r3 = r3.a()
            java.lang.String r4 = ""
            java.lang.String r3 = r1.optString(r3, r4)
            r2.add(r3)
            goto L40
        L58:
            r0 = r2
        L59:
            a.O8 r1 = new a.O8
            r2 = 20
            r1.<init>(r2)
            a.Qb r2 = new a.Qb
            r3 = 0
            r2.<init>(r3, r5)
            java.lang.Class r5 = d(r5, r0, r1, r2)
            return r5
    }

    public static java.lang.Object l(java.lang.Object r9) {
            r0 = 0
            java.lang.Class r1 = r9.getClass()     // Catch: java.lang.Throwable -> L47
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "getDeclaredMethods(...)"
            a.C0193i9.d(r1, r2)     // Catch: java.lang.Throwable -> L47
            int r2 = r1.length     // Catch: java.lang.Throwable -> L47
            r3 = 0
            r4 = r3
        L11:
            r5 = 1
            if (r4 >= r2) goto L4c
            r6 = r1[r4]     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L47
            java.lang.String r8 = "n"
            boolean r7 = a.C0193i9.a(r7, r8)     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L49
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L47
            int r7 = r7.length     // Catch: java.lang.Throwable -> L47
            r8 = 2
            if (r7 != r8) goto L49
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L47
            r7 = r7[r3]     // Catch: java.lang.Throwable -> L47
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r7 = a.C0193i9.a(r7, r8)     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L49
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L47
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L47
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L47
            boolean r7 = a.C0193i9.a(r7, r8)     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L49
            goto L4d
        L47:
            r9 = move-exception
            goto L60
        L49:
            int r4 = r4 + 1
            goto L11
        L4c:
            r6 = r0
        L4d:
            if (r6 != 0) goto L50
            return r0
        L50:
            r6.setAccessible(r5)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "filehelper"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L47
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.Throwable -> L47
            java.lang.Object r9 = r6.invoke(r9, r1)     // Catch: java.lang.Throwable -> L47
            goto L64
        L60:
            a.wd$a r9 = a.C0465xd.a(r9)
        L64:
            boolean r1 = r9 instanceof a.C0447wd.a
            if (r1 == 0) goto L69
            goto L6a
        L69:
            r0 = r9
        L6a:
            return r0
    }

    public static java.lang.String m(java.lang.Object r8) {
            r0 = 0
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.Throwable -> L3b
        L5:
            if (r1 == 0) goto L58
            java.lang.reflect.Method[] r2 = r1.getDeclaredMethods()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "getDeclaredMethods(...)"
            a.C0193i9.d(r2, r3)     // Catch: java.lang.Throwable -> L3b
            int r3 = r2.length     // Catch: java.lang.Throwable -> L3b
            r4 = 0
        L12:
            if (r4 >= r3) goto L40
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r7 = "getTableName"
            boolean r6 = a.C0193i9.a(r6, r7)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L3d
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r7 = "getParameterTypes(...)"
            a.C0193i9.d(r6, r7)     // Catch: java.lang.Throwable -> L3b
            int r6 = r6.length     // Catch: java.lang.Throwable -> L3b
            if (r6 != 0) goto L3d
            java.lang.Class r6 = r5.getReturnType()     // Catch: java.lang.Throwable -> L3b
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = a.C0193i9.a(r6, r7)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L3d
            goto L41
        L3b:
            r8 = move-exception
            goto L5a
        L3d:
            int r4 = r4 + 1
            goto L12
        L40:
            r5 = r0
        L41:
            if (r5 == 0) goto L53
            r1 = 1
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r8 = r5.invoke(r8, r0)     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r8 instanceof java.lang.String     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L52
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L3b
            return r8
        L52:
            return r0
        L53:
            java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.Throwable -> L3b
            goto L5
        L58:
            r8 = r0
            goto L5e
        L5a:
            a.wd$a r8 = a.C0465xd.a(r8)
        L5e:
            if (r8 == 0) goto L61
            goto L62
        L61:
            r0 = r8
        L62:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }
}
