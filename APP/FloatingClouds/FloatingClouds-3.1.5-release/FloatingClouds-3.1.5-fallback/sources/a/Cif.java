package a;

/* JADX INFO: renamed from: a.if, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class Cif {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.Cif f512a = null;
    public static volatile java.lang.String b;
    public static volatile int c;
    public static volatile boolean d;
    public static volatile boolean e;
    public static volatile int f;
    public static volatile boolean g;
    public static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> h = null;
    public static volatile boolean i;
    public static volatile a.C0234kf j;

    /* JADX INFO: renamed from: a.if$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f513a;
        public final java.lang.String b;
        public final boolean c;
        public final java.lang.String d;

        public a(long r2, java.lang.String r4, boolean r5, java.lang.String r6) {
                r1 = this;
                java.lang.String r0 = "layer"
                a.C0193i9.e(r4, r0)
                java.lang.String r0 = "detail"
                a.C0193i9.e(r6, r0)
                r1.<init>()
                r1.f513a = r2
                r1.b = r4
                r1.c = r5
                r1.d = r6
                return
        }

        public final boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof a.Cif.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.if$a r8 = (a.Cif.a) r8
                long r3 = r8.f513a
                long r5 = r7.f513a
                int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r1 == 0) goto L15
                return r2
            L15:
                java.lang.String r1 = r7.b
                java.lang.String r3 = r8.b
                boolean r1 = a.C0193i9.a(r1, r3)
                if (r1 != 0) goto L20
                return r2
            L20:
                boolean r1 = r7.c
                boolean r3 = r8.c
                if (r1 == r3) goto L27
                return r2
            L27:
                java.lang.String r1 = r7.d
                java.lang.String r8 = r8.d
                boolean r8 = a.C0193i9.a(r1, r8)
                if (r8 != 0) goto L32
                return r2
            L32:
                return r0
        }

        public final int hashCode() {
                r3 = this;
                long r0 = r3.f513a
                int r0 = java.lang.Long.hashCode(r0)
                r1 = 31
                int r0 = r0 * r1
                java.lang.String r2 = r3.b
                int r0 = a.C0487z.b(r2, r0, r1)
                boolean r2 = r3.c
                int r2 = java.lang.Boolean.hashCode(r2)
                int r2 = r2 + r0
                int r2 = r2 * r1
                java.lang.String r0 = r3.d
                int r0 = r0.hashCode()
                int r0 = r0 + r2
                return r0
        }

        public final java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "InterceptEvent(timeMs="
                r0.<init>(r1)
                long r1 = r3.f513a
                r0.append(r1)
                java.lang.String r1 = ", layer="
                r0.append(r1)
                java.lang.String r1 = r3.b
                r0.append(r1)
                java.lang.String r1 = ", blocked="
                r0.append(r1)
                boolean r1 = r3.c
                r0.append(r1)
                java.lang.String r1 = ", detail="
                r0.append(r1)
                java.lang.String r1 = r3.d
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: a.if$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f514a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public b(java.lang.String r1, boolean r2, boolean r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.f514a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof a.Cif.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.if$b r5 = (a.Cif.b) r5
                java.lang.String r1 = r5.f514a
                java.lang.String r3 = r4.f514a
                boolean r1 = a.C0193i9.a(r3, r1)
                if (r1 != 0) goto L17
                return r2
            L17:
                boolean r1 = r4.b
                boolean r3 = r5.b
                if (r1 == r3) goto L1e
                return r2
            L1e:
                boolean r1 = r4.c
                boolean r3 = r5.c
                if (r1 == r3) goto L25
                return r2
            L25:
                boolean r1 = r4.d
                boolean r5 = r5.d
                if (r1 == r5) goto L2c
                return r2
            L2c:
                return r0
        }

        public final int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.f514a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                boolean r1 = r2.b
                int r1 = java.lang.Boolean.hashCode(r1)
                int r1 = r1 + r0
                int r1 = r1 * 31
                boolean r0 = r2.c
                int r0 = java.lang.Boolean.hashCode(r0)
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r2.d
                int r1 = java.lang.Boolean.hashCode(r1)
                int r1 = r1 + r0
                return r1
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "LayerStatusLocal(name="
                r0.<init>(r1)
                java.lang.String r1 = r2.f514a
                r0.append(r1)
                java.lang.String r1 = ", classExists="
                r0.append(r1)
                boolean r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = ", hooked="
                r0.append(r1)
                boolean r1 = r2.c
                r0.append(r1)
                java.lang.String r1 = ", blocked="
                r0.append(r1)
                boolean r1 = r2.d
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            a.if r0 = new a.if
            r0.<init>()
            a.Cif.f512a = r0
            java.lang.String r0 = "CACHE_MISS"
            a.Cif.b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            a.Cif.h = r0
            return
    }

    public static void a() {
            boolean r0 = g()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1b
            java.lang.String r0 = "[BlockHotUpdate] cleanupPatchFiles skipped (isActive=false)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
            java.lang.String r0 = "inactive"
            a.C0279n6.f(r2, r2, r2, r0)
            return
        L1b:
            java.util.List<java.lang.String> r0 = a.gh.b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3e
            java.lang.String r0 = a.Cif.b
            java.lang.String r3 = "[BlockHotUpdate] cleanupPatchFiles FAILED: tinker path segments not ready (locateState="
            java.lang.String r4 = ")"
            java.lang.String r0 = a.C0487z.g(r3, r0, r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.a(r0)
            java.lang.String r0 = "PATH_SEGMENTS_NOT_READY"
            a.C0279n6.f(r2, r2, r1, r0)
            return
        L3e:
            java.io.File r0 = a.gh.b()     // Catch: java.lang.Throwable -> L109
            java.util.List r3 = a.gh.a()     // Catch: java.lang.Throwable -> L109
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L109
            r4 = r2
            r5 = r4
        L4c:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L69
            java.lang.String r7 = "getName(...)"
            if (r6 == 0) goto Lb3
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L69
            java.io.File r6 = (java.io.File) r6     // Catch: java.lang.Throwable -> L69
            boolean r8 = r6.isDirectory()     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto L4c
            java.io.File[] r6 = r6.listFiles()     // Catch: java.lang.Throwable -> L69
            if (r6 != 0) goto L6d
            java.io.File[] r6 = new java.io.File[r2]     // Catch: java.lang.Throwable -> L69
            goto L6d
        L69:
            r0 = move-exception
            r2 = r4
            goto L10b
        L6d:
            int r8 = r6.length     // Catch: java.lang.Throwable -> L69
            r9 = r2
        L6f:
            if (r9 >= r8) goto L4c
            r10 = r6[r9]     // Catch: java.lang.Throwable -> L69
            java.lang.String r11 = r10.getName()     // Catch: java.lang.Throwable -> L69
            a.C0193i9.d(r11, r7)     // Catch: java.lang.Throwable -> L69
            boolean r11 = a.gh.c(r11)     // Catch: java.lang.Throwable -> L69
            if (r11 == 0) goto Lb0
            a.v6 r4 = new a.v6     // Catch: java.lang.Throwable -> Ldb
            r4.<init>(r10)     // Catch: java.lang.Throwable -> Ldb
            a.v6$b r10 = new a.v6$b     // Catch: java.lang.Throwable -> Ldb
            r10.<init>(r4)     // Catch: java.lang.Throwable -> Ldb
        L8a:
            r4 = r1
        L8b:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> Ldb
            if (r11 == 0) goto La8
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> Ldb
            java.io.File r11 = (java.io.File) r11     // Catch: java.lang.Throwable -> Ldb
            boolean r12 = r11.delete()     // Catch: java.lang.Throwable -> Ldb
            if (r12 != 0) goto La3
            boolean r11 = r11.exists()     // Catch: java.lang.Throwable -> Ldb
            if (r11 != 0) goto La6
        La3:
            if (r4 == 0) goto La6
            goto L8a
        La6:
            r4 = r2
            goto L8b
        La8:
            if (r4 == 0) goto Lac
            int r5 = r5 + 1
        Lac:
            r4 = r1
            goto Lb0
        Lae:
            r2 = r1
            goto L10b
        Lb0:
            int r9 = r9 + 1
            goto L6f
        Lb3:
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Le0
            int r3 = r0.length     // Catch: java.lang.Throwable -> L69
        Lba:
            if (r2 >= r3) goto Le0
            r6 = r0[r2]     // Catch: java.lang.Throwable -> L69
            boolean r8 = r6.isFile()     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto Ldd
            java.lang.String r8 = r6.getName()     // Catch: java.lang.Throwable -> L69
            a.C0193i9.d(r8, r7)     // Catch: java.lang.Throwable -> L69
            boolean r8 = a.gh.c(r8)     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto Ldd
            boolean r4 = r6.delete()     // Catch: java.lang.Throwable -> Ldb
            if (r4 == 0) goto Ld9
            int r5 = r5 + 1
        Ld9:
            r4 = r1
            goto Ldd
        Ldb:
            r0 = move-exception
            goto Lae
        Ldd:
            int r2 = r2 + 1
            goto Lba
        Le0:
            r2 = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L107
            r0.<init>()     // Catch: java.lang.Throwable -> L107
            java.lang.String r3 = "[BlockHotUpdate] cleanupPatchFiles hadPatch="
            r0.append(r3)     // Catch: java.lang.Throwable -> L107
            r0.append(r2)     // Catch: java.lang.Throwable -> L107
            java.lang.String r3 = " deleted="
            r0.append(r3)     // Catch: java.lang.Throwable -> L107
            r0.append(r5)     // Catch: java.lang.Throwable -> L107
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L107
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L107
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> L107
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L107
            r0 = 0
            goto L11e
        L107:
            r0 = move-exception
            goto L10b
        L109:
            r0 = move-exception
            r5 = r2
        L10b:
            java.lang.String r3 = r0.getMessage()
            java.lang.String r4 = "[BlockHotUpdate] cleanupPatchFiles error"
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}
            r4 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.e(r0)
            r0 = r3
        L11e:
            a.C0279n6.f(r2, r5, r1, r0)
            return
    }

    public static void b(java.lang.ClassLoader r11, a.J8 r12) {
            r0 = 1
            java.lang.String r1 = "cl"
            a.C0193i9.e(r11, r1)
            java.lang.String r12 = r12.b
            java.lang.String r1 = ":patch"
            boolean r12 = a.Ae.D(r12, r1)
            java.lang.String r1 = a.Cif.b
            java.util.List<java.lang.String> r2 = a.gh.b
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r0
            java.util.List<java.lang.String> r3 = a.gh.b
            int r3 = r3.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "[BlockHotUpdate] diagnose locateState="
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = " pathReady="
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = " segments="
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            a.C0453x1.b(r1)
            a.kf r1 = a.Cif.j
            r2 = 0
            if (r12 == 0) goto L7e
            if (r1 == 0) goto L5e
            java.lang.String r1 = r1.h
            if (r1 == 0) goto L5e
            a.if r3 = a.Cif.f512a
            r3.getClass()
            java.lang.Class r11 = a.A1.b(r11, r1)
            if (r11 == 0) goto L5e
            r11 = r0
            goto L5f
        L5e:
            r11 = r2
        L5f:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r1 = a.Cif.h
            java.lang.String r3 = "L4"
            java.lang.Object r1 = r1.get(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L70
            boolean r1 = r1.booleanValue()
            goto L71
        L70:
            r1 = r2
        L71:
            boolean r4 = a.Cif.g
            a.if$b r5 = new a.if$b
            r5.<init>(r3, r11, r1, r4)
            java.util.List r11 = a.C0435w1.K(r5)
            goto L12a
        L7e:
            a.if$b r3 = new a.if$b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r4 = a.Cif.h
            java.lang.String r5 = "L0"
            java.lang.Object r6 = r4.get(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L91
            boolean r6 = r6.booleanValue()
            goto L92
        L91:
            r6 = r2
        L92:
            int r7 = a.Cif.c
            if (r7 <= 0) goto L98
            r7 = r0
            goto L99
        L98:
            r7 = r2
        L99:
            r3.<init>(r5, r0, r6, r7)
            if (r1 == 0) goto Laf
            java.lang.String r5 = r1.f
            if (r5 == 0) goto Laf
            a.if r6 = a.Cif.f512a
            r6.getClass()
            java.lang.Class r5 = a.A1.b(r11, r5)
            if (r5 == 0) goto Laf
            r5 = r0
            goto Lb0
        Laf:
            r5 = r2
        Lb0:
            java.lang.String r6 = "L1"
            java.lang.Object r7 = r4.get(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto Lbf
            boolean r7 = r7.booleanValue()
            goto Lc0
        Lbf:
            r7 = r2
        Lc0:
            boolean r8 = a.Cif.d
            a.if$b r9 = new a.if$b
            r9.<init>(r6, r5, r7, r8)
            if (r1 == 0) goto Lda
            java.lang.String r5 = r1.f550a
            if (r5 == 0) goto Lda
            a.if r6 = a.Cif.f512a
            r6.getClass()
            java.lang.Class r5 = a.A1.b(r11, r5)
            if (r5 == 0) goto Lda
            r5 = r0
            goto Ldb
        Lda:
            r5 = r2
        Ldb:
            java.lang.String r6 = "L2"
            java.lang.Object r7 = r4.get(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto Lea
            boolean r7 = r7.booleanValue()
            goto Leb
        Lea:
            r7 = r2
        Leb:
            boolean r8 = a.Cif.e
            a.if$b r10 = new a.if$b
            r10.<init>(r6, r5, r7, r8)
            if (r1 == 0) goto L105
            java.lang.String r1 = r1.d
            if (r1 == 0) goto L105
            a.if r5 = a.Cif.f512a
            r5.getClass()
            java.lang.Class r11 = a.A1.b(r11, r1)
            if (r11 == 0) goto L105
            r11 = r0
            goto L106
        L105:
            r11 = r2
        L106:
            java.lang.String r1 = "L3"
            java.lang.Object r4 = r4.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L115
            boolean r4 = r4.booleanValue()
            goto L116
        L115:
            r4 = r2
        L116:
            int r5 = a.Cif.f
            if (r5 <= 0) goto L11c
            r5 = r0
            goto L11d
        L11c:
            r5 = r2
        L11d:
            a.if$b r6 = new a.if$b
            r6.<init>(r1, r11, r4, r5)
            a.if$b[] r11 = new a.Cif.b[]{r3, r9, r10, r6}
            java.util.List r11 = a.C0294o3.d0(r11)
        L12a:
            if (r12 == 0) goto L12f
            java.lang.String r12 = "patch"
            goto L131
        L12f:
            java.lang.String r12 = "main"
        L131:
            int r1 = r11.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[BlockHotUpdate] diagnose ("
            r3.<init>(r4)
            r3.append(r12)
            java.lang.String r12 = " process) layers="
            r3.append(r12)
            r3.append(r1)
            java.lang.String r12 = r3.toString()
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r0)
            a.C0453x1.b(r12)
            boolean r12 = a.C0279n6.f595a
            java.util.ArrayList r12 = new java.util.ArrayList
            r1 = 10
            int r1 = a.C0312p3.g0(r11, r1)
            r12.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L167:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L184
            java.lang.Object r1 = r11.next()
            a.if$b r1 = (a.Cif.b) r1
            a.n6$a r3 = new a.n6$a
            java.lang.String r4 = r1.f514a
            boolean r5 = r1.b
            boolean r6 = r1.c
            boolean r1 = r1.d
            r3.<init>(r4, r5, r6, r1)
            r12.add(r3)
            goto L167
        L184:
            a.C0279n6.e = r12
            boolean r11 = r12.isEmpty()
            r1 = 0
            if (r11 == 0) goto L18f
            r3 = r2
            goto L1ac
        L18f:
            java.util.Iterator r11 = r12.iterator()
            r3 = r2
        L194:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L1ac
            java.lang.Object r4 = r11.next()
            a.n6$a r4 = (a.C0279n6.a) r4
            boolean r4 = r4.c
            if (r4 == 0) goto L194
            int r3 = r3 + r0
            if (r3 < 0) goto L1a8
            goto L194
        L1a8:
            a.C0294o3.f0()
            throw r1
        L1ac:
            boolean r11 = r12.isEmpty()
            if (r11 == 0) goto L1b3
            goto L1d3
        L1b3:
            java.util.Iterator r11 = r12.iterator()
        L1b7:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L1d3
            java.lang.Object r4 = r11.next()
            a.n6$a r4 = (a.C0279n6.a) r4
            boolean r5 = r4.b
            if (r5 == 0) goto L1b7
            boolean r4 = r4.c
            if (r4 != 0) goto L1b7
            int r2 = r2 + r0
            if (r2 < 0) goto L1cf
            goto L1b7
        L1cf:
            a.C0294o3.f0()
            throw r1
        L1d3:
            java.lang.String r11 = "OK"
            java.lang.String r0 = "FAIL"
            if (r2 <= 0) goto L1dc
            java.lang.String r1 = "WARN"
            goto L1e1
        L1dc:
            if (r3 != 0) goto L1e0
            r1 = r0
            goto L1e1
        L1e0:
            r1 = r11
        L1e1:
            int r4 = r12.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[DIAG-HEALTH] module=TinkerFixLayers status="
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = " ok="
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = " fail="
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = " total="
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            a.C0453x1.b(r1)
            java.util.Iterator r12 = r12.iterator()
        L216:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L275
            java.lang.Object r1 = r12.next()
            a.n6$a r1 = (a.C0279n6.a) r1
            boolean r2 = r1.b
            if (r2 != 0) goto L229
            java.lang.String r3 = "CLASS_MISSING"
            goto L239
        L229:
            boolean r3 = r1.c
            if (r3 != 0) goto L230
            java.lang.String r3 = "NOT_HOOKED"
            goto L239
        L230:
            boolean r3 = r1.d
            if (r3 == 0) goto L237
            java.lang.String r3 = "BLOCKED"
            goto L239
        L237:
            java.lang.String r3 = "HOOKED_IDLE"
        L239:
            java.lang.String r4 = r1.f596a
            boolean r5 = r1.c
            boolean r1 = r1.d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[DIAG-HEALTH]   layer="
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = " classExists="
            r6.append(r4)
            r6.append(r2)
            java.lang.String r2 = " hooked="
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = " blocked="
            r6.append(r2)
            r6.append(r1)
            java.lang.String r1 = " state="
            r6.append(r1)
            r6.append(r3)
            java.lang.String r1 = r6.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            a.C0453x1.b(r1)
            goto L216
        L275:
            java.lang.String r12 = "[DIAG-HEALTH]   note=nonTinkerChannel(NOT_COVERED) reason=仅覆盖 Tinker / LegacyTinkerCore 热更新通道"
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            a.C0453x1.b(r12)
            boolean r12 = a.C0279n6.f595a
            boolean r12 = a.Cif.i
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            a.C0279n6.f = r1
            if (r12 == 0) goto L28b
            goto L28c
        L28b:
            r11 = r0
        L28c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[DIAG-HEALTH] module=TinkerFixTiming status="
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = " registeredBeforeTryLoad="
            r0.append(r11)
            r0.append(r12)
            java.lang.String r11 = " note=拦截层已在首次 tryLoad 前同步注册（onPackageReady）"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            a.C0453x1.b(r11)
            return
    }

    public static void c() {
            boolean r0 = g()
            if (r0 != 0) goto L7
            goto Lb
        L7:
            a.kf r0 = a.Cif.j
            if (r0 == 0) goto Lc
        Lb:
            return
        Lc:
            org.luckypray.dexkit.DexKitBridge r0 = a.C0435w1.l
            if (r0 == 0) goto L27
            java.lang.Thread r0 = new java.lang.Thread
            a.l0 r1 = new a.l0
            r2 = 4
            r1.<init>(r2)
            r0.<init>(r1)
            java.lang.String r1 = "TinkerSymbolLocate"
            r0.setName(r1)
            r1 = 1
            r0.setDaemon(r1)
            r0.start()
        L27:
            return
    }

    public static void d(a.J8 r13) {
            r0 = 2
            r1 = 3
            r2 = 0
            r3 = 1
            a.Cif.i = r3
            boolean r4 = g()
            if (r4 != 0) goto L1a
            java.lang.String r13 = "[BlockHotUpdate] install skipped (isActive=false)"
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r3)
            a.C0453x1.b(r13)
            return
        L1a:
            a.jf r4 = a.C0216jf.f536a
            a.kf r5 = a.C0216jf.c
            if (r5 == 0) goto L29
            r4.getClass()
            java.lang.String r4 = "CACHE"
            a.C0216jf.e = r4
            goto L12c
        L29:
            r4.getClass()
            android.content.Context r4 = a.C0435w1.p
            r5 = 0
            if (r4 == 0) goto Lb8
            java.lang.Object r4 = a.C0043a5.f384a
            if (r4 == 0) goto L46
            java.lang.String r6 = "tinker_symbols_v1"
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L40
            goto L46
        L40:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L46
            r6.<init>(r4)     // Catch: java.lang.Exception -> L46
            goto L47
        L46:
            r6 = r5
        L47:
            if (r6 != 0) goto L4b
        L49:
            r4 = r5
            goto L54
        L4b:
            a.kf$a r4 = a.C0234kf.m     // Catch: java.lang.Exception -> L49
            r4.getClass()     // Catch: java.lang.Exception -> L49
            a.kf r4 = a.C0234kf.a.a(r6)     // Catch: java.lang.Exception -> L49
        L54:
            if (r4 == 0) goto Lb8
            boolean r6 = r4.a()
            if (r6 == 0) goto Lb8
            a.jf r6 = a.C0216jf.f536a
            r6.getClass()
            boolean r6 = a.gh.f488a
            android.content.Context r6 = a.C0435w1.p
            r7 = 0
            if (r6 != 0) goto L6b
        L69:
            r9 = r7
            goto L7a
        L6b:
            android.content.pm.PackageManager r9 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L69
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Throwable -> L69
            android.content.pm.PackageInfo r6 = r9.getPackageInfo(r6, r2)     // Catch: java.lang.Throwable -> L69
            int r6 = r6.versionCode     // Catch: java.lang.Throwable -> L69
            long r9 = (long) r6
        L7a:
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 > 0) goto L80
        L7e:
            r6 = r3
            goto Lad
        L80:
            long r11 = r4.l
            int r6 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r6 > 0) goto L87
            goto L7e
        L87:
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 != 0) goto L8d
            r6 = r3
            goto L8e
        L8d:
            r6 = r2
        L8e:
            if (r6 != 0) goto Lad
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "[TinkerLocator] cache version mismatch: cached="
            r7.<init>(r8)
            r7.append(r11)
            java.lang.String r8 = " current="
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            a.C0453x1.e(r7)
        Lad:
            if (r6 == 0) goto Lb8
            a.C0216jf.c = r4
            java.lang.String r5 = "SP"
            a.C0216jf.e = r5
            r5 = r4
            goto L12c
        Lb8:
            java.lang.String r4 = "[TinkerLocator] file cache hit: "
            java.io.File r6 = a.C0216jf.a()     // Catch: java.lang.Throwable -> Le8
            boolean r7 = r6.isFile()     // Catch: java.lang.Throwable -> Le8
            if (r7 != 0) goto Lc6
        Lc4:
            r6 = r5
            goto L10a
        Lc6:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le8
            java.lang.String r6 = a.C0435w1.T(r6)     // Catch: java.lang.Throwable -> Le8
            r7.<init>(r6)     // Catch: java.lang.Throwable -> Le8
            a.kf$a r6 = a.C0234kf.m     // Catch: java.lang.Throwable -> Le8
            r6.getClass()     // Catch: java.lang.Throwable -> Le8
            a.kf r6 = a.C0234kf.a.a(r7)     // Catch: java.lang.Throwable -> Le8
            boolean r7 = r6.a()     // Catch: java.lang.Throwable -> Le8
            if (r7 != 0) goto Lea
            java.lang.String r4 = "[TinkerLocator] file cache incomplete, ignore"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> Le8
            a.C0453x1.e(r4)     // Catch: java.lang.Throwable -> Le8
            goto Lc4
        Le8:
            r4 = move-exception
            goto L100
        Lea:
            java.lang.String r7 = r6.f550a     // Catch: java.lang.Throwable -> Le8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le8
            r8.<init>(r4)     // Catch: java.lang.Throwable -> Le8
            r8.append(r7)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> Le8
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> Le8
            a.C0453x1.b(r4)     // Catch: java.lang.Throwable -> Le8
            goto L10a
        L100:
            java.lang.String r6 = "[TinkerLocator] loadFromFile failed"
            java.lang.Object[] r4 = new java.lang.Object[]{r6, r4}
            a.C0453x1.e(r4)
            goto Lc4
        L10a:
            if (r6 == 0) goto L11a
            boolean r4 = r6.a()
            if (r4 == 0) goto L11a
            a.C0216jf.c = r6
            java.lang.String r4 = "FILE"
            a.C0216jf.e = r4
            r5 = r6
            goto L12c
        L11a:
            org.luckypray.dexkit.DexKitBridge r4 = a.C0435w1.l
            if (r4 == 0) goto L120
            r4 = r3
            goto L121
        L120:
            r4 = r2
        L121:
            if (r4 != 0) goto L128
            java.lang.String r4 = "NONE"
            a.C0216jf.e = r4
            goto L12c
        L128:
            a.kf r5 = a.C0216jf.b()
        L12c:
            if (r5 != 0) goto L157
            a.jf r13 = a.C0216jf.f536a
            r13.getClass()
            boolean r13 = a.C0216jf.d
            if (r13 == 0) goto L13c
            java.lang.String r13 = "LOCATE_FAILED"
            a.Cif.b = r13
            goto L140
        L13c:
            java.lang.String r13 = "CACHE_MISS"
            a.Cif.b = r13
        L140:
            java.lang.String r13 = a.Cif.b
            java.lang.String r0 = "[BlockHotUpdate] install FAILED: symbols not located (state="
            java.lang.String r1 = ") — 本次会话不拦截，DkBridge 就绪后由 ensureAsyncLocate 补位，下次启动生效"
            java.lang.String r13 = a.C0487z.g(r0, r13, r1)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r3)
            a.C0453x1.a(r13)
            goto L355
        L157:
            a.jf r4 = a.C0216jf.f536a
            r4.getClass()
            java.lang.String r4 = a.C0216jf.e
            java.lang.String r6 = "DEXKIT"
            boolean r4 = a.C0193i9.a(r4, r6)
            if (r4 == 0) goto L169
            java.lang.String r4 = "LOCATE_OK"
            goto L16b
        L169:
            java.lang.String r4 = "CACHE_HIT"
        L16b:
            a.Cif.b = r4
            a.Cif.j = r5
            java.util.List<java.lang.String> r4 = r5.j
            boolean r6 = a.gh.f488a
            java.util.List<java.lang.String> r6 = a.gh.b
            java.util.ArrayList r4 = a.C0383t3.q0(r6, r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = a.C0312p3.g0(r4, r7)
            r6.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L188:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L1a3
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r8)
            java.lang.String r8 = "toLowerCase(...)"
            a.C0193i9.d(r7, r8)
            r6.add(r7)
            goto L188
        L1a3:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r6 = r6.iterator()
        L1ac:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L1c3
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            int r8 = r8.length()
            if (r8 <= 0) goto L1ac
            r4.add(r7)
            goto L1ac
        L1c3:
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>(r4)
            java.util.List r4 = a.C0383t3.w0(r6)
            a.gh.b = r4
            int r4 = r4.size()
            java.lang.String r6 = "WechatPaths: tinker path segments injected (count="
            java.lang.String r7 = ")"
            java.lang.String r4 = a.C0487z.c(r4, r6, r7)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            a.C0453x1.b(r4)
            java.lang.String r4 = r13.b
            java.lang.String r6 = ":patch"
            boolean r4 = a.Ae.D(r4, r6)
            if (r4 == 0) goto L237
            java.lang.String r0 = a.Cif.b
            java.lang.String r2 = "[BlockHotUpdate] install (patch process) -> L4 only, locateState="
            java.lang.String r0 = a.C0487z.k(r2, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            a.C0453x1.b(r0)
            java.lang.String r0 = r5.h
            java.lang.String r2 = "L4"
            if (r0 == 0) goto L221
            java.lang.String r4 = r5.i
            if (r4 != 0) goto L209
            goto L221
        L209:
            java.lang.Class<android.content.Intent> r3 = android.content.Intent.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}
            a.hf r5 = new a.hf
            r5.<init>(r1, r0, r4)
            io.github.libxposed.api.XposedInterface$HookHandle r13 = a.J8.a(r13, r0, r4, r3, r5)
            java.util.List r13 = a.C0435w1.K(r13)
            i(r2, r13)
            goto L355
        L221:
            java.lang.String r13 = "[BlockHotUpdate] L4 skipped (patch service not located — wx<8.0.71 or structure changed)"
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r3)
            a.C0453x1.b(r13)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r13 = a.Cif.h
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r13.put(r2, r0)
            goto L355
        L237:
            java.lang.String r4 = a.Cif.b
            java.lang.String r6 = "[BlockHotUpdate] install (main process) -> L0..L3, locateState="
            java.lang.String r4 = a.C0487z.k(r6, r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r3)
            a.C0453x1.b(r4)
            java.lang.Class[] r4 = new java.lang.Class[r2]
            a.kd r6 = new a.kd
            r7 = 22
            r6.<init>(r7)
            java.lang.String r7 = "mkdirs"
            java.lang.String r8 = "java.io.File"
            io.github.libxposed.api.XposedInterface$HookHandle r4 = a.J8.a(r13, r8, r7, r4, r6)
            java.lang.Class[] r6 = new java.lang.Class[r2]
            a.kd r7 = new a.kd
            r9 = 23
            r7.<init>(r9)
            java.lang.String r9 = "mkdir"
            io.github.libxposed.api.XposedInterface$HookHandle r6 = a.J8.a(r13, r8, r9, r6, r7)
            java.lang.Class[] r7 = new java.lang.Class[r2]
            a.kd r9 = new a.kd
            r10 = 24
            r9.<init>(r10)
            java.lang.String r10 = "createNewFile"
            io.github.libxposed.api.XposedInterface$HookHandle r7 = a.J8.a(r13, r8, r10, r7, r9)
            java.lang.Class<java.io.File> r8 = java.io.File.class
            java.lang.Class r9 = java.lang.Boolean.TYPE
            java.lang.Class[] r10 = new java.lang.Class[]{r8, r9}
            a.kd r11 = new a.kd
            r12 = 25
            r11.<init>(r12)
            io.github.libxposed.api.XposedInterface$HookHandle r10 = a.J8.c(r13, r10, r11)
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.Class[] r9 = new java.lang.Class[]{r11, r9}
            a.kd r11 = new a.kd
            r12 = 26
            r11.<init>(r12)
            io.github.libxposed.api.XposedInterface$HookHandle r9 = a.J8.c(r13, r9, r11)
            r11 = 5
            io.github.libxposed.api.XposedInterface$HookHandle[] r11 = new io.github.libxposed.api.XposedInterface.HookHandle[r11]
            r11[r2] = r4
            r11[r3] = r6
            r11[r0] = r7
            r11[r1] = r10
            r1 = 4
            r11[r1] = r9
            java.util.List r1 = a.C0294o3.d0(r11)
            java.lang.String r4 = "L0"
            i(r4, r1)
            java.lang.String r1 = r5.f
            java.lang.String r4 = "L1"
            if (r1 != 0) goto L2c0
            java.lang.String r1 = "security class not located"
            j(r4, r1)
            goto L2de
        L2c0:
            java.lang.String r6 = r5.g
            if (r6 != 0) goto L2ca
            java.lang.String r1 = "security method not located"
            j(r4, r1)
            goto L2de
        L2ca:
            java.lang.Class[] r7 = new java.lang.Class[]{r8}
            a.hf r8 = new a.hf
            r8.<init>(r2, r1, r6)
            io.github.libxposed.api.XposedInterface$HookHandle r1 = a.J8.a(r13, r1, r6, r7, r8)
            java.util.List r1 = a.C0435w1.K(r1)
            i(r4, r1)
        L2de:
            java.lang.String r1 = r5.f550a
            java.lang.String r2 = "L2"
            if (r1 != 0) goto L2ea
            java.lang.String r0 = "loader class not located"
            j(r2, r0)
            goto L324
        L2ea:
            java.lang.String r4 = r5.b
            if (r4 != 0) goto L2f4
            java.lang.String r0 = "loader method not located"
            j(r2, r0)
            goto L324
        L2f4:
            java.lang.String r6 = r5.c
            if (r6 != 0) goto L2fe
            java.lang.String r0 = "loader param type not located"
            j(r2, r0)
            goto L324
        L2fe:
            java.lang.ClassLoader r7 = r13.f136a
            java.lang.Class r7 = a.A1.b(r7, r6)
            if (r7 != 0) goto L310
            java.lang.String r0 = "param class load failed: "
            java.lang.String r0 = r0.concat(r6)
            j(r2, r0)
            goto L324
        L310:
            java.lang.Class[] r6 = new java.lang.Class[]{r7}
            a.hf r7 = new a.hf
            r7.<init>(r0, r1, r4)
            io.github.libxposed.api.XposedInterface$HookHandle r0 = a.J8.a(r13, r1, r4, r6, r7)
            java.util.List r0 = a.C0435w1.K(r0)
            i(r2, r0)
        L324:
            java.lang.String r0 = r5.d
            java.lang.String r1 = "L3"
            if (r0 != 0) goto L330
            java.lang.String r13 = "app class not located"
            j(r1, r13)
            goto L355
        L330:
            java.lang.String r2 = r5.e
            if (r2 != 0) goto L33a
            java.lang.String r13 = "app entry method not located"
            j(r1, r13)
            goto L355
        L33a:
            java.lang.Class r4 = java.lang.Long.TYPE
            a.C0193i9.b(r4)
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            java.lang.Class[] r4 = new java.lang.Class[]{r5, r4, r4}
            a.hf r5 = new a.hf
            r5.<init>(r3, r0, r2)
            io.github.libxposed.api.XposedInterface$HookHandle r13 = a.J8.a(r13, r0, r2, r4, r5)
            java.util.List r13 = a.C0435w1.K(r13)
            i(r1, r13)
        L355:
            return
    }

    public static java.lang.Object e(io.github.libxposed.api.XposedInterface.Chain r2) {
            boolean r0 = g()
            if (r0 != 0) goto Lb
            java.lang.Object r2 = r2.proceed()
            return r2
        Lb:
            java.lang.Object r0 = r2.getThisObject()
            boolean r1 = r0 instanceof java.io.File
            if (r1 == 0) goto L16
            java.io.File r0 = (java.io.File) r0
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L1f
            java.lang.String r0 = r0.getAbsolutePath()
            if (r0 != 0) goto L21
        L1f:
            java.lang.String r0 = ""
        L21:
            boolean r1 = a.gh.c(r0)
            if (r1 == 0) goto L46
            int r2 = a.Cif.c
            r1 = 1
            int r2 = r2 + r1
            a.Cif.c = r2
            java.lang.String r2 = "L0"
            h(r2, r0, r1)
            java.lang.String r2 = "[BlockHotUpdate] L0 blocked file create: "
            java.lang.String r2 = r2.concat(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            a.C0453x1.b(r2)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        L46:
            java.lang.Object r2 = r2.proceed()
            return r2
    }

    public static java.lang.Object f(io.github.libxposed.api.XposedInterface.Chain r5) {
            boolean r0 = g()
            if (r0 != 0) goto Lb
            java.lang.Object r5 = r5.proceed()
            return r5
        Lb:
            java.util.List r0 = r5.getArgs()
            java.lang.String r1 = "getArgs(...)"
            a.C0193i9.d(r0, r1)
            r2 = 0
            java.lang.Object r0 = a.C0383t3.o0(r0, r2)
            boolean r3 = r0 instanceof java.io.File
            r4 = 0
            if (r3 == 0) goto L21
            java.io.File r0 = (java.io.File) r0
            goto L22
        L21:
            r0 = r4
        L22:
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.getAbsolutePath()
            if (r0 != 0) goto L42
        L2a:
            java.util.List r0 = r5.getArgs()
            a.C0193i9.d(r0, r1)
            java.lang.Object r0 = a.C0383t3.o0(r0, r2)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L3c
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
        L3c:
            if (r4 != 0) goto L41
            java.lang.String r0 = ""
            goto L42
        L41:
            r0 = r4
        L42:
            boolean r1 = a.gh.c(r0)
            if (r1 != 0) goto L4d
            java.lang.Object r5 = r5.proceed()
            return r5
        L4d:
            int r5 = a.Cif.c
            r1 = 1
            int r5 = r5 + r1
            a.Cif.c = r5
            java.lang.String r5 = "L0"
            h(r5, r0, r1)
            java.lang.String r5 = "[BlockHotUpdate] L0 blocked FileOutputStream: "
            java.lang.String r5 = r5.concat(r0)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            a.C0453x1.b(r5)
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r1 = "blocked by FloatingClouds: "
            java.lang.String r0 = r1.concat(r0)
            r5.<init>(r0)
            throw r5
    }

    public static boolean g() {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            android.content.Context r0 = a.C0435w1.p
            if (r0 == 0) goto L10
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.M
            return r0
        L10:
            r0 = 1
            java.io.File r1 = a.gh.b()     // Catch: java.lang.Throwable -> L58
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "shared_prefs"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L58
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "fc_options.xml"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L58
            boolean r3 = r1.isFile()     // Catch: java.lang.Throwable -> L58
            r4 = 0
            if (r3 == 0) goto L2b
            goto L2c
        L2b:
            r1 = r4
        L2c:
            if (r1 != 0) goto L5a
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "fc_config.xml"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L58
            boolean r3 = r1.isFile()     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L3c
            goto L3d
        L3c:
            r1 = r4
        L3d:
            if (r1 != 0) goto L5a
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "mask_wechat_options.xml"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L58
            boolean r3 = r1.isFile()     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L4d
            goto L4e
        L4d:
            r1 = r4
        L4e:
            if (r1 != 0) goto L5a
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "mask_wechat_config.xml"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r1 = move-exception
            goto La7
        L5a:
            boolean r2 = r1.isFile()     // Catch: java.lang.Throwable -> L58
            if (r2 != 0) goto L61
            goto Lb0
        L61:
            java.lang.String r1 = a.C0435w1.T(r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "<boolean\\s+name=\"blockHotUpdate\"\\s+value=\"(true|false)\"\\s*/>"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "compile(...)"
            a.C0193i9.d(r2, r3)     // Catch: java.lang.Throwable -> L58
            java.util.regex.Matcher r2 = r2.matcher(r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "matcher(...)"
            a.C0193i9.d(r2, r3)     // Catch: java.lang.Throwable -> L58
            r3 = 0
            boolean r3 = r2.find(r3)     // Catch: java.lang.Throwable -> L58
            if (r3 != 0) goto L81
            goto L86
        L81:
            a.Z7 r4 = new a.Z7     // Catch: java.lang.Throwable -> L58
            r4.<init>(r2, r1)     // Catch: java.lang.Throwable -> L58
        L86:
            if (r4 == 0) goto Lb0
            java.lang.Object r1 = r4.b     // Catch: java.lang.Throwable -> L58
            a.xa r1 = (a.C0462xa) r1     // Catch: java.lang.Throwable -> L58
            if (r1 != 0) goto L95
            a.xa r1 = new a.xa     // Catch: java.lang.Throwable -> L58
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L58
            r4.b = r1     // Catch: java.lang.Throwable -> L58
        L95:
            java.lang.Object r1 = r4.b     // Catch: java.lang.Throwable -> L58
            a.xa r1 = (a.C0462xa) r1     // Catch: java.lang.Throwable -> L58
            a.C0193i9.b(r1)     // Catch: java.lang.Throwable -> L58
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "true"
            boolean r0 = a.C0193i9.a(r1, r2)     // Catch: java.lang.Throwable -> L58
            return r0
        La7:
            java.lang.String r2 = "ConfigUtil: readBooleanOptionFromDisk fail for blockHotUpdate"
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            a.C0453x1.e(r1)
        Lb0:
            return r0
    }

    public static void h(java.lang.String r6, java.lang.String r7, boolean r8) {
            a.K3$a r0 = a.K3.f148a
            long r1 = java.lang.System.currentTimeMillis()
            r0.getClass()
            java.lang.String r0 = "|"
            java.lang.String r3 = "detail"
            a.C0193i9.e(r7, r3)
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L60
            java.io.File r4 = a.gh.b()     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = "hotupdate_intercept_events.log"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r4.<init>()     // Catch: java.lang.Throwable -> L60
            r4.append(r1)     // Catch: java.lang.Throwable -> L60
            r4.append(r0)     // Catch: java.lang.Throwable -> L60
            r4.append(r6)     // Catch: java.lang.Throwable -> L60
            r4.append(r0)     // Catch: java.lang.Throwable -> L60
            r4.append(r8)     // Catch: java.lang.Throwable -> L60
            r4.append(r0)     // Catch: java.lang.Throwable -> L60
            r4.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = "\n"
            r4.append(r6)     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L60
            java.nio.charset.Charset r7 = a.V2.f298a     // Catch: java.lang.Throwable -> L60
            java.lang.String r8 = "text"
            a.C0193i9.e(r6, r8)     // Catch: java.lang.Throwable -> L60
            java.lang.String r8 = "charset"
            a.C0193i9.e(r7, r8)     // Catch: java.lang.Throwable -> L60
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L60
            r0 = 1
            r8.<init>(r3, r0)     // Catch: java.lang.Throwable -> L60
            a.C0435w1.Y(r8, r6, r7)     // Catch: java.lang.Throwable -> L59
            a.Wf r6 = a.Wf.f330a     // Catch: java.lang.Throwable -> L59
            r8.close()     // Catch: java.lang.Throwable -> L60
            return
        L59:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L5b
        L5b:
            r7 = move-exception
            a.C0435w1.e(r8, r6)     // Catch: java.lang.Throwable -> L60
            throw r7     // Catch: java.lang.Throwable -> L60
        L60:
            return
    }

    public static void i(java.lang.String r3, java.util.List r4) {
            boolean r0 = r4.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L9
            goto L1c
        L9:
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r4.next()
            io.github.libxposed.api.XposedInterface$HookHandle r0 = (io.github.libxposed.api.XposedInterface.HookHandle) r0
            if (r0 == 0) goto Ld
            r2 = r1
        L1c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r0 = a.Cif.h
            r0.put(r3, r4)
            java.lang.String r4 = "[BlockHotUpdate] "
            if (r2 == 0) goto L3b
            java.lang.String r0 = " OK (hooked)"
            java.lang.String r3 = a.C0487z.g(r4, r3, r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            a.C0453x1.b(r3)
            return
        L3b:
            java.lang.String r0 = " FAILED (method not found)"
            java.lang.String r3 = a.C0487z.g(r4, r3, r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            a.C0453x1.a(r3)
            return
    }

    public static void j(java.lang.String r2, java.lang.String r3) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r0 = a.Cif.h
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.put(r2, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[BlockHotUpdate] "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = " FAILED (reason="
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            a.C0453x1.a(r2)
            return
    }
}
