package a;

/* JADX INFO: renamed from: a.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0263m8 implements top.mmjz.floatingclouds.plugin.IPlugin {
    public static volatile a.C0263m8 l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile java.lang.String f574a;
    public volatile java.lang.String b;
    public volatile java.lang.String c;
    public volatile java.lang.Object d;
    public volatile java.lang.Object e;
    public volatile boolean f;
    public final java.util.Map<java.lang.Object, java.lang.String> g;
    public volatile java.lang.Object h;
    public volatile java.util.ArrayList i;
    public volatile java.lang.String j;
    public volatile boolean k;

    /* JADX INFO: renamed from: a.m8$a */
    public static final class a {
        public static void a() {
                a.m8 r0 = a.C0263m8.l
                if (r0 == 0) goto L2f
                boolean r1 = a.C0263m8.m()
                if (r1 != 0) goto Lb
                goto L2f
            Lb:
                java.util.Set r1 = a.C0263m8.k()
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L16
                goto L2f
            L16:
                java.lang.String r1 = r0.j()
                if (r1 != 0) goto L1d
                goto L2f
            L1d:
                android.os.Handler r2 = new android.os.Handler
                android.os.Looper r3 = android.os.Looper.getMainLooper()
                r2.<init>(r3)
                a.P0 r3 = new a.P0
                r4 = 6
                r3.<init>(r0, r4, r1)
                r2.post(r3)
            L2f:
                return
        }

        public static void b() {
                a.m8 r0 = a.C0263m8.l
                if (r0 == 0) goto L31
                java.lang.Object r1 = r0.h
                if (r1 != 0) goto L9
                goto L31
            L9:
                java.util.ArrayList r2 = r0.i
                if (r2 != 0) goto Le
                goto L31
            Le:
                boolean r3 = a.C0263m8.m()
                if (r3 != 0) goto L15
                goto L31
            L15:
                java.util.Set r3 = a.C0263m8.k()
                boolean r4 = r3.isEmpty()
                if (r4 == 0) goto L20
                goto L31
            L20:
                android.os.Handler r4 = new android.os.Handler
                android.os.Looper r5 = android.os.Looper.getMainLooper()
                r4.<init>(r5)
                a.k8 r5 = new a.k8
                r5.<init>(r0, r2, r3, r1)
                r4.post(r5)
            L31:
                return
        }
    }

    /* JADX INFO: renamed from: a.m8$b */
    public final class b extends android.database.CursorWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.database.Cursor f575a;
        public final java.util.Set<java.lang.String> b;
        public final int[] c;
        public final java.lang.String[] d;
        public final int e;
        public final /* synthetic */ a.C0263m8 f;

        public b(a.C0263m8 r10, android.database.Cursor r11, java.util.Set<java.lang.String> r12) {
                r9 = this;
                r9.f = r10
                r9.<init>(r11)
                r9.f575a = r11
                r9.b = r12
                java.lang.String r10 = "snsID"
                int r10 = r11.getColumnIndex(r10)
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                int r1 = r11.getPosition()
                r2 = 0
                if (r10 < 0) goto L96
                boolean r11 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L8f
                if (r11 == 0) goto L96
                r11 = r2
            L27:
                int r11 = r11 + 1
                android.database.Cursor r3 = r9.f575a     // Catch: java.lang.Throwable -> L90
                long r3 = r3.getLong(r10)     // Catch: java.lang.Throwable -> L90
                a.m8 r5 = r9.f     // Catch: java.lang.Throwable -> L90
                java.lang.String r5 = a.C0263m8.a(r5, r3)     // Catch: java.lang.Throwable -> L90
                int r6 = r5.length()     // Catch: java.lang.Throwable -> L90
                if (r6 != 0) goto L3e
                java.lang.String r5 = "?"
                goto L47
            L3e:
                a.m8 r6 = r9.f     // Catch: java.lang.Throwable -> L90
                r6.getClass()     // Catch: java.lang.Throwable -> L90
                java.lang.String r5 = a.C0263m8.o(r5)     // Catch: java.lang.Throwable -> L90
            L47:
                java.util.Set<java.lang.String> r6 = r9.b     // Catch: java.lang.Throwable -> L90
                boolean r6 = r6.contains(r5)     // Catch: java.lang.Throwable -> L90
                java.lang.String r3 = java.lang.Long.toHexString(r3)     // Catch: java.lang.Throwable -> L90
                if (r6 == 0) goto L56
                java.lang.String r4 = "[HIDDEN]"
                goto L58
            L56:
                java.lang.String r4 = ""
            L58:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
                r7.<init>()     // Catch: java.lang.Throwable -> L90
                java.lang.String r8 = "0x"
                r7.append(r8)     // Catch: java.lang.Throwable -> L90
                r7.append(r3)     // Catch: java.lang.Throwable -> L90
                java.lang.String r3 = "->"
                r7.append(r3)     // Catch: java.lang.Throwable -> L90
                r7.append(r5)     // Catch: java.lang.Throwable -> L90
                r7.append(r4)     // Catch: java.lang.Throwable -> L90
                java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L90
                r0.add(r3)     // Catch: java.lang.Throwable -> L90
                if (r6 != 0) goto L86
                android.database.Cursor r3 = r9.f575a     // Catch: java.lang.Throwable -> L90
                int r3 = r3.getPosition()     // Catch: java.lang.Throwable -> L90
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L90
                r12.add(r3)     // Catch: java.lang.Throwable -> L90
            L86:
                android.database.Cursor r3 = r9.f575a     // Catch: java.lang.Throwable -> L90
                boolean r3 = r3.moveToNext()     // Catch: java.lang.Throwable -> L90
                if (r3 != 0) goto L27
                goto L90
            L8f:
                r11 = r2
            L90:
                android.database.Cursor r10 = r9.f575a     // Catch: java.lang.Throwable -> L98
                r10.moveToPosition(r1)     // Catch: java.lang.Throwable -> L98
                goto L98
            L96:
                r11 = r2
                goto L90
            L98:
                int[] r10 = a.C0383t3.v0(r12)
                r9.c = r10
                r9.e = r11
                java.lang.String[] r10 = new java.lang.String[r2]
                java.lang.Object[] r10 = r0.toArray(r10)
                java.lang.String[] r10 = (java.lang.String[]) r10
                r9.d = r10
                return
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public final int getCount() {
                r1 = this;
                int[] r0 = r1.c
                int r0 = r0.length
                return r0
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public final boolean move(int r2) {
                r1 = this;
                int r0 = r1.getPosition()
                int r0 = r0 + r2
                boolean r2 = r1.moveToPosition(r0)
                return r2
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public final boolean moveToFirst() {
                r1 = this;
                r0 = 0
                boolean r0 = r1.moveToPosition(r0)
                return r0
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public final boolean moveToLast() {
                r1 = this;
                int[] r0 = r1.c
                int r0 = r0.length
                int r0 = r0 + (-1)
                boolean r0 = r1.moveToPosition(r0)
                return r0
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public final boolean moveToNext() {
                r1 = this;
                int r0 = r1.getPosition()
                int r0 = r0 + 1
                boolean r0 = r1.moveToPosition(r0)
                return r0
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public final boolean moveToPosition(int r3) {
                r2 = this;
                r0 = -1
                if (r3 < r0) goto L13
                int[] r0 = r2.c
                int r1 = r0.length
                if (r3 < r1) goto L9
                goto L13
            L9:
                if (r3 >= 0) goto Lc
                goto Le
            Lc:
                r3 = r0[r3]
            Le:
                boolean r3 = super.moveToPosition(r3)
                return r3
            L13:
                r3 = 0
                return r3
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public final boolean moveToPrevious() {
                r1 = this;
                int r0 = r1.getPosition()
                int r0 = r0 + (-1)
                boolean r0 = r1.moveToPosition(r0)
                return r0
        }
    }

    public C0263m8() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "xc4.k"
            r1.f574a = r0
            java.lang.String r0 = "xc4.i"
            r1.b = r0
            java.lang.String r0 = "zc4.b"
            r1.c = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r1.g = r0
            return
    }

    public static final java.lang.String a(a.C0263m8 r2, long r3) {
            r2.getClass()
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            java.lang.String r0 = ""
            if (r2 != 0) goto Lc
            return r0
        Lc:
            java.math.BigInteger r2 = new java.math.BigInteger
            java.lang.String r3 = java.lang.Long.toBinaryString(r3)
            r4 = 2
            r2.<init>(r3, r4)
            r3 = 10
            java.lang.String r2 = r2.toString(r3)
            int r3 = r2.length()
            r4 = 22
            if (r3 < r4) goto L25
            return r2
        L25:
            int r3 = r2.length()
            int r4 = r4 - r3
            if (r4 < 0) goto L4b
            if (r4 == 0) goto L46
            r3 = 1
            java.lang.String r0 = "0"
            if (r4 == r3) goto L46
            r3 = 0
            char r0 = r0.charAt(r3)
            char[] r1 = new char[r4]
        L3a:
            if (r3 >= r4) goto L41
            r1[r3] = r0
            int r3 = r3 + 1
            goto L3a
        L41:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L46:
            java.lang.String r2 = r0.concat(r2)
            return r2
        L4b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Count 'n' must be non-negative, but was "
            r2.<init>(r3)
            r2.append(r4)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static void b(a.C0263m8 r0, java.util.ArrayList r1, java.lang.String r2) {
            r0.getClass()
            if (r2 == 0) goto L1f
            boolean r0 = a.Be.P(r2)
            if (r0 == 0) goto Lc
            goto L1f
        Lc:
            boolean r0 = a.Be.P(r2)
            if (r0 != 0) goto L1f
            java.lang.String r0 = o(r2)
            int r2 = r0.length()
            if (r2 <= 0) goto L1f
            r1.add(r0)
        L1f:
            return
    }

    public static java.lang.Object c(java.lang.Object r4, java.lang.String r5) {
            r0 = 0
            if (r4 != 0) goto L4
            goto L24
        L4:
            java.lang.Class r1 = r4.getClass()
        L8:
            if (r1 == 0) goto L24
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L24
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r5, r0)     // Catch: java.lang.NoSuchMethodException -> L1f
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L1f
            java.lang.Object r4 = r2.invoke(r4, r0)     // Catch: java.lang.NoSuchMethodException -> L1f
            return r4
        L1f:
            java.lang.Class r1 = r1.getSuperclass()
            goto L8
        L24:
            return r0
    }

    public static void d(java.lang.Object r6, java.lang.String r7, java.util.ArrayList r8) {
            if (r6 != 0) goto L3
            goto L5f
        L3:
            java.lang.Class r0 = r6.getClass()
        L7:
            if (r0 == 0) goto L5f
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5f
            java.lang.reflect.Method[] r1 = r0.getDeclaredMethods()
            a.G1 r1 = a.C0435w1.I(r1)
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.String r3 = r2.getName()
            boolean r3 = a.C0193i9.a(r3, r7)
            if (r3 == 0) goto L19
            java.lang.Class[] r3 = r2.getParameterTypes()
            int r3 = r3.length
            r4 = 1
            if (r3 != r4) goto L19
            java.lang.Class[] r3 = r2.getParameterTypes()
            r5 = 0
            r3 = r3[r5]
            java.lang.Class<java.util.List> r5 = java.util.List.class
            boolean r3 = a.C0193i9.a(r3, r5)
            if (r3 == 0) goto L19
            r2.setAccessible(r4)
            java.lang.Object[] r7 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L52
            java.lang.Object r6 = r2.invoke(r6, r7)     // Catch: java.lang.Throwable -> L52
            goto L57
        L52:
            r6 = move-exception
            a.wd$a r6 = a.C0465xd.a(r6)
        L57:
            boolean r6 = r6 instanceof a.C0447wd.a
            goto L5f
        L5a:
            java.lang.Class r0 = r0.getSuperclass()
            goto L7
        L5f:
            return
    }

    public static int e(java.util.List r3) {
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L5:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r3.next()
            java.lang.String r2 = "a"
            java.lang.Object r1 = i(r1, r2)
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L1c
            java.util.List r1 = (java.util.List) r1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r1 != 0) goto L20
            goto L5
        L20:
            int r1 = r1.size()
            int r0 = r0 + r1
            goto L5
        L26:
            return r0
    }

    public static java.lang.reflect.Method g(java.lang.Object r4) {
            if (r4 != 0) goto L3
            goto L4f
        L3:
            java.lang.Class r4 = r4.getClass()
        L7:
            if (r4 == 0) goto L4f
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L4f
            java.lang.reflect.Method[] r0 = r4.getDeclaredMethods()
            a.G1 r0 = a.C0435w1.I(r0)
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            java.lang.String r3 = "getParameterTypes(...)"
            a.C0193i9.d(r2, r3)
            int r2 = r2.length
            if (r2 != 0) goto L19
            java.lang.Class r2 = r1.getReturnType()
            java.lang.Class r3 = java.lang.Void.TYPE
            boolean r2 = a.C0193i9.a(r2, r3)
            if (r2 == 0) goto L19
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "notifyDataSetChanged"
            boolean r2 = a.C0193i9.a(r2, r3)
            if (r2 == 0) goto L19
            return r1
        L4a:
            java.lang.Class r4 = r4.getSuperclass()
            goto L7
        L4f:
            r4 = 0
            return r4
    }

    public static java.util.List h(java.lang.Object r4) {
            r0 = 0
            if (r4 == 0) goto L8
            java.lang.Class r1 = r4.getClass()
            goto L9
        L8:
            r1 = r0
        L9:
            if (r1 == 0) goto L30
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L30
            java.lang.String r2 = "data"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L2b
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L2b
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.NoSuchFieldException -> L2b
            boolean r3 = a.Kf.b(r2)     // Catch: java.lang.NoSuchFieldException -> L2b
            if (r3 == 0) goto L2a
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.NoSuchFieldException -> L2b
            r0 = r2
        L2a:
            return r0
        L2b:
            java.lang.Class r1 = r1.getSuperclass()
            goto L9
        L30:
            return r0
    }

    public static java.lang.Object i(java.lang.Object r3, java.lang.String r4) {
            if (r3 != 0) goto L3
            goto L23
        L3:
            java.lang.Class r0 = r3.getClass()
        L7:
            if (r0 == 0) goto L23
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L23
            java.lang.reflect.Field r1 = r0.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L1e
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L1e
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.NoSuchFieldException -> L1e
            return r3
        L1e:
            java.lang.Class r0 = r0.getSuperclass()
            goto L7
        L23:
            r3 = 0
            return r3
    }

    public static java.util.Set k() {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            java.util.LinkedHashSet r0 = a.K3.a.c()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = a.C0312p3.g0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = o(r2)
            r1.add(r2)
            goto L18
        L2c:
            java.util.Set r0 = a.C0383t3.A0(r1)
            return r0
    }

    public static boolean m() {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto L15
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.j
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    public static boolean n(java.lang.String r1) {
            boolean r0 = a.Be.P(r1)
            if (r0 == 0) goto L7
            goto L1d
        L7:
            java.lang.String r0 = "sns_table_"
            java.lang.String r1 = a.Be.S(r1, r0)
            java.lang.String r0 = "ad_table_"
            java.lang.String r1 = a.Be.S(r1, r0)
            java.lang.String r1 = o(r1)
            int r0 = r1.length()
            if (r0 != 0) goto L1f
        L1d:
            r1 = 0
            return r1
        L1f:
            java.util.Set r0 = k()
            boolean r1 = r0.contains(r1)
            return r1
    }

    public static java.lang.String o(java.lang.String r9) {
            r0 = 0
            r1 = 1
            java.lang.String r2 = ""
            if (r9 == 0) goto L4b
            int r3 = r9.length()
            if (r3 != 0) goto Ld
            goto L4b
        Ld:
            char[] r3 = new char[r1]
            r4 = 48
            r3[r0] = r4
            int r4 = r9.length()
            r5 = r0
        L18:
            if (r5 >= r4) goto L3b
            char r6 = r9.charAt(r5)
            r7 = r0
        L1f:
            if (r7 >= r1) goto L28
            char r8 = r3[r7]
            if (r6 != r8) goto L26
            goto L29
        L26:
            int r7 = r7 + r1
            goto L1f
        L28:
            r7 = -1
        L29:
            if (r7 < 0) goto L2d
            r6 = r1
            goto L2e
        L2d:
            r6 = r0
        L2e:
            if (r6 != 0) goto L39
            int r2 = r9.length()
            java.lang.CharSequence r2 = r9.subSequence(r5, r2)
            goto L3b
        L39:
            int r5 = r5 + r1
            goto L18
        L3b:
            java.lang.String r9 = r2.toString()
            int r2 = r9.length()
            if (r2 != 0) goto L46
            r0 = r1
        L46:
            if (r0 == 0) goto L4a
            java.lang.String r9 = "0"
        L4a:
            return r9
        L4b:
            return r2
    }

    public static void p(java.lang.Object r2) {
            if (r2 != 0) goto L3
            goto L17
        L3:
            java.lang.reflect.Method r0 = g(r2)
            if (r0 != 0) goto La
            goto L17
        La:
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L13
            r1 = 0
            r0.invoke(r2, r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r2 = move-exception
            a.C0465xd.a(r2)
        L17:
            return
    }

    public static java.lang.String q(java.lang.Object r3, java.lang.String r4) {
            r0 = 0
            if (r3 != 0) goto L4
            goto L3e
        L4:
            java.lang.Class r1 = r3.getClass()
        L8:
            if (r1 == 0) goto L1c
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L1c
            java.lang.reflect.Field r4 = r1.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L17
            goto L1d
        L17:
            java.lang.Class r1 = r1.getSuperclass()
            goto L8
        L1c:
            r4 = r0
        L1d:
            if (r4 == 0) goto L3e
            r1 = 1
            r4.setAccessible(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2e
            goto L36
        L2e:
            r3 = move-exception
            goto L32
        L30:
            r3 = r0
            goto L36
        L32:
            a.wd$a r3 = a.C0465xd.a(r3)
        L36:
            boolean r4 = r3 instanceof a.C0447wd.a
            if (r4 == 0) goto L3b
            goto L3c
        L3b:
            r0 = r3
        L3c:
            java.lang.String r0 = (java.lang.String) r0
        L3e:
            return r0
    }

    public static void t(java.lang.Object r3, java.util.ArrayList r4) {
            if (r3 == 0) goto L7
            java.lang.Class r0 = r3.getClass()
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto L25
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L25
            java.lang.String r1 = "data"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L20
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L20
            r1.set(r3, r4)     // Catch: java.lang.NoSuchFieldException -> L20
            goto L25
        L20:
            java.lang.Class r0 = r0.getSuperclass()
            goto L8
        L25:
            return
    }

    public static void u(java.lang.Object r3, java.lang.Object r4, java.lang.String r5) {
            java.lang.Class r0 = r3.getClass()
        L4:
            if (r0 == 0) goto L1f
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L1f
            java.lang.reflect.Field r1 = r0.getDeclaredField(r5)     // Catch: java.lang.NoSuchFieldException -> L1a
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L1a
            r1.set(r3, r4)     // Catch: java.lang.NoSuchFieldException -> L1a
            goto L1f
        L1a:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L1f:
            return
    }

    public final void f(java.util.List<?> r5, java.util.Set<java.lang.String> r6) {
            r4 = this;
            java.util.ListIterator r5 = r5.listIterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r5.next()
            if (r0 != 0) goto L11
            goto L4
        L11:
            java.lang.String r1 = "b"
            java.lang.Object r1 = i(r0, r1)
            boolean r2 = r1 instanceof java.lang.String
            r3 = 0
            if (r2 == 0) goto L1f
            java.lang.String r1 = (java.lang.String) r1
            goto L20
        L1f:
            r1 = r3
        L20:
            java.lang.String r2 = "a"
            java.lang.Object r0 = i(r0, r2)
            boolean r2 = a.Kf.b(r0)
            if (r2 == 0) goto L2f
            r3 = r0
            java.util.List r3 = (java.util.List) r3
        L2f:
            if (r3 != 0) goto L32
            goto L4
        L32:
            java.util.Iterator r0 = r3.iterator()
        L36:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r0.next()
            boolean r2 = r4.v(r2, r6)
            if (r2 == 0) goto L36
            r0.remove()
            goto L36
        L4a:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L4
            java.lang.String r0 = "loading"
            boolean r0 = a.C0193i9.a(r1, r0)
            if (r0 != 0) goto L4
            java.lang.String r0 = "my_timeline"
            boolean r0 = a.C0193i9.a(r1, r0)
            if (r0 != 0) goto L4
            r5.remove()
            goto L4
        L64:
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r8) {
            r7 = this;
            java.lang.String r0 = "session"
            a.C0193i9.e(r8, r0)
            a.C0263m8.l = r7
            java.lang.ClassLoader r0 = r8.f136a
            java.lang.String r1 = "HideOwnSns: handleHook START (album+timeline+profile data-layer)"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            a.C0453x1.b(r1)
            a.fd r1 = new a.fd
            int r3 = a.B1.f21a
            r4 = -1
            if (r3 != r4) goto L3f
            android.content.Context r3 = a.C0435w1.p     // Catch: java.lang.Exception -> L31
            a.C0193i9.b(r3)     // Catch: java.lang.Exception -> L31
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Exception -> L31
            java.lang.String r5 = "com.tencent.mm"
            r6 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r5, r6)     // Catch: java.lang.Exception -> L31
            int r4 = r3.versionCode     // Catch: java.lang.Exception -> L31
            goto L3d
        L31:
            r3 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)
            a.C0453x1.a(r3)
        L3d:
            a.B1.f21a = r4
        L3f:
            int r3 = a.B1.f21a
            r1.<init>(r3, r0)
            a.hd r0 = a.C0179hd.f499a
            r0.getClass()
            java.lang.String r0 = "sns_album_classes"
            a.gd r0 = a.C0179hd.a(r0, r1)
            java.lang.String r1 = "albumHelper"
            java.lang.Class r1 = r0.a(r1)
            if (r1 == 0) goto L5c
            java.lang.String r1 = r1.getName()
            goto L5e
        L5c:
            java.lang.String r1 = "xc4.k"
        L5e:
            r7.f574a = r1
            java.lang.String r1 = "albumAdapter"
            java.lang.Class r1 = r0.a(r1)
            if (r1 == 0) goto L6d
            java.lang.String r1 = r1.getName()
            goto L6f
        L6d:
            java.lang.String r1 = "xc4.i"
        L6f:
            r7.b = r1
            java.lang.String r1 = "viewHolderSuffix"
            java.lang.String r1 = r0.b(r1)
            if (r1 != 0) goto L7b
            java.lang.String r1 = "zc4.b"
        L7b:
            r7.c = r1
            a.cd r0 = r0.d
            java.lang.String r1 = r7.f574a
            java.lang.String r3 = r7.b
            java.lang.String r4 = r7.c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "HideOwnSns: sns_album via="
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = " helper="
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = " adapter="
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = " vh="
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.b(r0)
            a.g2 r0 = new a.g2
            r1 = 28
            r0.<init>(r1)
            a.i8 r1 = new a.i8
            r3 = 3
            r1.<init>(r7, r3)
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.component.h2"
            java.util.ArrayList r0 = a.J8.b(r8, r3, r0, r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ldd
            java.lang.String r0 = "HideOwnSns: hooked com.tencent.mm.plugin.sns.ui.improve.component.h2.e(o0)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.b(r0)
            goto Lea
        Ldd:
            java.lang.String r0 = "HideOwnSns: com.tencent.mm.plugin.sns.ui.improve.component.h2.e(o0) NOT hooked"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.e(r0)
        Lea:
            java.lang.String r0 = r7.f574a
            a.g2 r1 = new a.g2
            r3 = 22
            r1.<init>(r3)
            a.i8 r3 = new a.i8
            r4 = 0
            r3.<init>(r7, r4)
            java.util.ArrayList r0 = a.J8.b(r8, r0, r1, r3)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L111
            java.lang.String r0 = "HideOwnSns: hooked xc4.k.c(List)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.b(r0)
            goto L11e
        L111:
            java.lang.String r0 = "HideOwnSns: xc4.k.c(List) NOT hooked"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.e(r0)
        L11e:
            a.g2 r0 = new a.g2
            r1 = 23
            r0.<init>(r1)
            a.i8 r1 = new a.i8
            r3 = 1
            r1.<init>(r7, r3)
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.lp"
            java.util.ArrayList r0 = a.J8.b(r8, r3, r0, r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L145
            java.lang.String r0 = "HideOwnSns: hooked com.tencent.mm.plugin.sns.ui.lp.c(List)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.b(r0)
            goto L152
        L145:
            java.lang.String r0 = "HideOwnSns: com.tencent.mm.plugin.sns.ui.lp.c(List) NOT hooked"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.e(r0)
        L152:
            java.lang.String r0 = "com.tencent.mm.view.recyclerview.WxRecyclerView"
            java.lang.String r1 = "androidx.recyclerview.widget.RecyclerView"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.Iterator r0 = r0.iterator()
        L162:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c2
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            a.g2 r3 = new a.g2
            r4 = 29
            r3.<init>(r4)
            a.i8 r4 = new a.i8
            r5 = 4
            r4.<init>(r7, r5)
            java.util.ArrayList r3 = a.J8.b(r8, r1, r3, r4)
            boolean r4 = r3.isEmpty()
            java.lang.String r5 = "HideOwnSns: "
            if (r4 != 0) goto L1b0
            int r3 = r3.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = ".setAdapter hooked ("
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = ")"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            a.C0453x1.b(r1)
            goto L162
        L1b0:
            java.lang.String r3 = ".setAdapter hook FAILED"
            java.lang.String r1 = a.C0487z.g(r5, r1, r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            a.C0453x1.e(r1)
            goto L162
        L1c2:
            a.l8 r0 = new a.l8
            r1 = 0
            r0.<init>(r1)
            a.i8 r1 = new a.i8
            r3 = 5
            r1.<init>(r7, r3)
            java.lang.String r3 = "com.tencent.mm.pluginsdk.ui.preference.SnsPreference"
            a.J8.b(r8, r3, r0, r1)
            a.l8 r0 = new a.l8
            r1 = 1
            r0.<init>(r1)
            a.i8 r1 = new a.i8
            r4 = 6
            r1.<init>(r7, r4)
            a.J8.b(r8, r3, r0, r1)
            a.g2 r0 = new a.g2
            r1 = 24
            r0.<init>(r1)
            a.g2 r1 = new a.g2
            r3 = 25
            r1.<init>(r3, r7)
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"
            a.J8.b(r8, r3, r0, r1)
            a.g2 r0 = new a.g2
            r1 = 26
            r0.<init>(r1)
            a.g2 r1 = new a.g2
            r4 = 27
            r1.<init>(r4, r7)
            a.J8.b(r8, r3, r0, r1)
            a.g2 r0 = new a.g2
            r1 = 21
            r0.<init>(r1)
            a.i8 r1 = new a.i8
            r3 = 2
            r1.<init>(r7, r3)
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.bm"
            java.util.ArrayList r8 = a.J8.b(r8, r3, r0, r1)
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L22d
            java.lang.String r8 = "HideOwnSns: hooked com.tencent.mm.plugin.sns.ui.bm.q() (notify list filter)"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r2)
            a.C0453x1.b(r8)
            goto L23a
        L22d:
            java.lang.String r8 = "HideOwnSns: com.tencent.mm.plugin.sns.ui.bm.q() NOT hooked"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r2)
            a.C0453x1.e(r8)
        L23a:
            java.lang.String r8 = "HideOwnSns: handleHook DONE"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r2)
            a.C0453x1.b(r8)
            java.lang.String r8 = "album+timeline+profile"
            java.lang.String r0 = "F008"
            java.lang.String r1 = "hideOwnSns"
            a.E8.b(r0, r1, r8)
            return
    }

    public final java.lang.String j() {
            r4 = this;
            boolean r0 = r4.k
            if (r0 == 0) goto L7
            java.lang.String r0 = r4.j
            return r0
        L7:
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "currentApplication"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r1 instanceof android.content.Context     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L21
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L1f
            goto L22
        L1f:
            r1 = move-exception
            goto L38
        L21:
            r1 = r0
        L22:
            if (r1 == 0) goto L2c
            java.lang.String r2 = "com.tencent.mm_preferences"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)     // Catch: java.lang.Throwable -> L1f
            goto L2d
        L2c:
            r1 = r0
        L2d:
            if (r1 == 0) goto L36
            java.lang.String r2 = "login_weixin_username"
            java.lang.String r1 = r1.getString(r2, r0)     // Catch: java.lang.Throwable -> L1f
            goto L3c
        L36:
            r1 = r0
            goto L3c
        L38:
            a.wd$a r1 = a.C0465xd.a(r1)
        L3c:
            boolean r2 = r1 instanceof a.C0447wd.a
            if (r2 == 0) goto L41
            goto L42
        L41:
            r0 = r1
        L42:
            java.lang.String r0 = (java.lang.String) r0
            r4.j = r0
            r1 = 1
            r4.k = r1
            return r0
    }

    public final void l(io.github.libxposed.api.XposedInterface.Chain r8) {
            r7 = this;
            boolean r0 = m()
            if (r0 != 0) goto L7
            goto L2f
        L7:
            java.util.Set r0 = k()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L12
            goto L2f
        L12:
            java.lang.Object r8 = r8.getThisObject()
            if (r8 != 0) goto L19
            goto L2f
        L19:
            java.lang.String r1 = "f212584f"
            java.lang.Object r2 = i(r8, r1)
            boolean r3 = r2 instanceof android.database.Cursor
            r4 = 0
            if (r3 == 0) goto L27
            android.database.Cursor r2 = (android.database.Cursor) r2
            goto L28
        L27:
            r2 = r4
        L28:
            if (r2 != 0) goto L2b
            goto L2f
        L2b:
            boolean r3 = r2 instanceof a.C0263m8.b
            if (r3 == 0) goto L30
        L2f:
            return
        L30:
            a.m8$b r3 = new a.m8$b
            r3.<init>(r7, r2, r0)
            u(r8, r3, r1)
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "f212587i"
            u(r8, r1, r2)
            java.lang.String r1 = "f212585g"
            u(r8, r4, r1)
            p(r8)
            int[] r8 = r3.c
            int r1 = r8.length
            int r8 = r8.length
            int r2 = r3.e
            int r8 = r2 - r8
            int r0 = r0.size()
            java.lang.String r5 = " | "
            r6 = 62
            java.lang.String[] r3 = r3.d
            java.lang.String r3 = a.N1.e0(r3, r5, r4, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "HideOwnSns: SnsMsgUI notify scan: total="
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " kept="
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = " removed="
            r4.append(r1)
            r4.append(r8)
            java.lang.String r8 = " hiddenSet="
            r4.append(r8)
            r4.append(r0)
            java.lang.String r8 = " candidates="
            r4.append(r8)
            r4.append(r3)
            java.lang.String r8 = r4.toString()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            r0 = 1
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r0)
            a.C0453x1.b(r8)
            return
    }

    public final void r() {
            r5 = this;
            java.lang.Object r0 = r5.d
            if (r0 != 0) goto L5
            goto L16
        L5:
            boolean r1 = m()
            if (r1 != 0) goto Lc
            goto L16
        Lc:
            java.util.Set r1 = k()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L17
        L16:
            return
        L17:
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            a.j8 r3 = new a.j8
            r4 = 1
            r3.<init>(r5, r0, r1, r4)
            r2.post(r3)
            return
    }

    public final void s() {
            r5 = this;
            java.lang.Object r0 = r5.e
            if (r0 != 0) goto L5
            goto L16
        L5:
            boolean r1 = m()
            if (r1 != 0) goto Lc
            goto L16
        Lc:
            java.util.Set r1 = k()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L17
        L16:
            return
        L17:
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            a.j8 r3 = new a.j8
            r4 = 0
            r3.<init>(r5, r0, r1, r4)
            r2.post(r3)
            return
    }

    public final boolean v(java.lang.Object r11, java.util.Set<java.lang.String> r12) {
            r10 = this;
            if (r11 != 0) goto L4
            goto L182
        L4:
            a.Y5 r0 = a.Y5.f351a
            java.lang.Class r1 = r11.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = r10.c
            boolean r2 = r1.endsWith(r2)
            java.lang.String r3 = "ad_table_"
            java.lang.String r4 = "sns_table_"
            r5 = 0
            java.lang.String r6 = "field_stringSeq"
            java.lang.String r7 = "field_snsId"
            if (r2 != 0) goto Lb4
            java.lang.String r2 = r10.c
            java.lang.String r8 = "$"
            java.lang.String r9 = "."
            java.lang.String r2 = a.Ae.G(r2, r9, r8)
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L31
            goto Lb4
        L31:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = q(r11, r7)
            if (r1 == 0) goto L5e
            boolean r2 = a.Be.P(r1)
            if (r2 == 0) goto L43
            goto L5e
        L43:
            java.lang.String r1 = a.Be.S(r1, r4)
            java.lang.String r1 = a.Be.S(r1, r3)
            boolean r2 = a.Be.P(r1)
            if (r2 != 0) goto L5e
            java.lang.String r1 = o(r1)
            int r2 = r1.length()
            if (r2 <= 0) goto L5e
            r0.add(r1)
        L5e:
            java.lang.String r1 = q(r11, r6)
            b(r10, r0, r1)
            java.lang.Class r1 = r11.getClass()
        L69:
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r3 = "localid"
            if (r1 == 0) goto L7f
            boolean r4 = r1.equals(r2)
            if (r4 != 0) goto L7f
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L7a
            goto L80
        L7a:
            java.lang.Class r1 = r1.getSuperclass()
            goto L69
        L7f:
            r1 = r5
        L80:
            if (r1 == 0) goto L84
        L82:
            r5 = r3
            goto La0
        L84:
            java.lang.Class r1 = r11.getClass()
        L88:
            java.lang.String r3 = "field_localId"
            if (r1 == 0) goto L9c
            boolean r4 = r1.equals(r2)
            if (r4 != 0) goto L9c
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L97
            goto L9d
        L97:
            java.lang.Class r1 = r1.getSuperclass()
            goto L88
        L9c:
            r1 = r5
        L9d:
            if (r1 == 0) goto La0
            goto L82
        La0:
            if (r5 == 0) goto La9
            java.lang.String r11 = q(r11, r5)
            b(r10, r0, r11)
        La9:
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>(r0)
            java.util.List r0 = a.C0383t3.w0(r11)
            goto L163
        Lb4:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "n"
            java.lang.Object r11 = c(r11, r2)
            if (r11 != 0) goto Lc3
            goto L163
        Lc3:
            java.lang.String r0 = "l1"
            java.lang.Object r0 = i(r11, r0)
            java.lang.String r2 = "getValue"
            if (r0 == 0) goto Ld2
            java.lang.Object r0 = c(r0, r2)
            goto Ld3
        Ld2:
            r0 = r5
        Ld3:
            if (r0 == 0) goto L104
            java.lang.String r7 = q(r0, r7)
            if (r7 == 0) goto Lfd
            boolean r8 = a.Be.P(r7)
            if (r8 == 0) goto Le2
            goto Lfd
        Le2:
            java.lang.String r7 = a.Be.S(r7, r4)
            java.lang.String r7 = a.Be.S(r7, r3)
            boolean r8 = a.Be.P(r7)
            if (r8 != 0) goto Lfd
            java.lang.String r7 = o(r7)
            int r8 = r7.length()
            if (r8 <= 0) goto Lfd
            r1.add(r7)
        Lfd:
            java.lang.String r0 = q(r0, r6)
            b(r10, r1, r0)
        L104:
            java.lang.String r0 = "y0"
            java.lang.Object r0 = i(r11, r0)
            if (r0 == 0) goto L111
            java.lang.Object r0 = c(r0, r2)
            goto L112
        L111:
            r0 = r5
        L112:
            if (r0 == 0) goto L11b
            java.lang.String r0 = r0.toString()
            b(r10, r1, r0)
        L11b:
            java.lang.String r0 = "v"
            java.lang.Object r0 = c(r11, r0)
            if (r0 == 0) goto L127
            java.lang.String r5 = r0.toString()
        L127:
            if (r5 == 0) goto L14b
            boolean r0 = a.Be.P(r5)
            if (r0 == 0) goto L130
            goto L14b
        L130:
            java.lang.String r0 = a.Be.S(r5, r4)
            java.lang.String r0 = a.Be.S(r0, r3)
            boolean r2 = a.Be.P(r0)
            if (r2 != 0) goto L14b
            java.lang.String r0 = o(r0)
            int r2 = r0.length()
            if (r2 <= 0) goto L14b
            r1.add(r0)
        L14b:
            java.lang.String r0 = "U0"
            java.lang.Object r11 = c(r11, r0)
            if (r11 == 0) goto L15a
            java.lang.String r11 = r11.toString()
            b(r10, r1, r11)
        L15a:
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>(r1)
            java.util.List r0 = a.C0383t3.w0(r11)
        L163:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L16a
            goto L182
        L16a:
            java.util.Iterator r11 = r0.iterator()
        L16e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L182
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L16e
            r11 = 1
            return r11
        L182:
            r11 = 0
            return r11
    }
}
