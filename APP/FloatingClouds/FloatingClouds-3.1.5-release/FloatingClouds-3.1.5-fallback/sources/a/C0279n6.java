package a;

/* JADX INFO: renamed from: a.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0279n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f595a;
    public static volatile int b;
    public static volatile boolean c;
    public static volatile java.lang.String d;
    public static volatile java.util.ArrayList e;
    public static volatile java.lang.Boolean f;
    public static volatile boolean g;
    public static volatile int h;
    public static volatile int i;
    public static volatile int j;
    public static volatile java.lang.String k;
    public static volatile int l;
    public static volatile boolean m;
    public static volatile boolean n;
    public static volatile java.util.LinkedHashMap o;
    public static volatile java.lang.String p;
    public static volatile boolean q;
    public static final java.util.LinkedHashMap<java.lang.String, a.C0279n6.b> r = null;
    public static volatile java.util.LinkedHashMap s;

    /* JADX INFO: renamed from: a.n6$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f596a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public a(java.lang.String r1, boolean r2, boolean r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.f596a = r1
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
                boolean r1 = r5 instanceof a.C0279n6.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.n6$a r5 = (a.C0279n6.a) r5
                java.lang.String r1 = r5.f596a
                java.lang.String r3 = r4.f596a
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
                java.lang.String r0 = r2.f596a
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
                java.lang.String r1 = "LayerStatus(name="
                r0.<init>(r1)
                java.lang.String r1 = r2.f596a
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

    /* JADX INFO: renamed from: a.n6$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f597a;
        public final long b;
        public final java.lang.String c;

        public b(java.lang.String r1, long r2, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.f597a = r1
                r0.b = r2
                r0.c = r4
                return
        }

        public final boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof a.C0279n6.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.n6$b r8 = (a.C0279n6.b) r8
                java.lang.String r1 = r8.f597a
                java.lang.String r3 = r7.f597a
                boolean r1 = a.C0193i9.a(r3, r1)
                if (r1 != 0) goto L17
                return r2
            L17:
                long r3 = r7.b
                long r5 = r8.b
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 == 0) goto L20
                return r2
            L20:
                java.lang.String r1 = r7.c
                java.lang.String r8 = r8.c
                boolean r8 = a.C0193i9.a(r1, r8)
                if (r8 != 0) goto L2b
                return r2
            L2b:
                return r0
        }

        public final int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f597a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                long r1 = r3.b
                int r1 = java.lang.Long.hashCode(r1)
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.String r0 = r3.c
                if (r0 != 0) goto L17
                r0 = 0
                goto L1b
            L17:
                int r0 = r0.hashCode()
            L1b:
                int r1 = r1 + r0
                return r1
        }

        public final java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "PartResult(status="
                r0.<init>(r1)
                java.lang.String r1 = r3.f597a
                r0.append(r1)
                java.lang.String r1 = ", durationMs="
                r0.append(r1)
                long r1 = r3.b
                r0.append(r1)
                java.lang.String r1 = ", error="
                r0.append(r1)
                java.lang.String r1 = r3.c
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            a.C0279n6.o = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            a.C0279n6.r = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            a.C0279n6.s = r0
            return
    }

    public static void a(android.content.Context r19) {
            java.lang.String r0 = "[DIAG-HEALTH] ==============================="
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.lang.String r0 = "[DIAG-HEALTH] Feature Health Report START"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.lang.String r0 = "[DIAG-HEALTH] ==============================="
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.util.List<java.lang.String> r0 = a.gh.b
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L5d
            java.util.List r0 = a.gh.a()
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L2d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r0.next()
            java.io.File r3 = (java.io.File) r3
            java.io.File[] r3 = r3.listFiles()
            if (r3 == 0) goto L5a
            int r4 = r3.length
            r5 = r1
            r6 = r5
        L42:
            if (r5 >= r4) goto L5b
            r7 = r3[r5]
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "getName(...)"
            a.C0193i9.d(r7, r8)
            boolean r7 = a.gh.c(r7)
            if (r7 == 0) goto L57
            int r6 = r6 + 1
        L57:
            int r5 = r5 + 1
            goto L42
        L5a:
            r6 = r1
        L5b:
            int r2 = r2 + r6
            goto L2d
        L5d:
            r2 = r1
        L5e:
            java.lang.String r0 = a.C0279n6.d
            if (r0 == 0) goto L65
            java.lang.String r0 = "FAIL"
            goto L6c
        L65:
            if (r2 <= 0) goto L6a
            java.lang.String r0 = "WARN"
            goto L6c
        L6a:
            java.lang.String r0 = "OK"
        L6c:
            boolean r3 = a.C0279n6.f595a
            int r4 = a.C0279n6.b
            boolean r5 = a.C0279n6.c
            java.lang.String r6 = a.C0279n6.d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "[DIAG-HEALTH] module=TinkerFix status="
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = " hadPatch="
            r7.append(r0)
            r7.append(r3)
            java.lang.String r0 = " deleted="
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = " blockEnabled="
            r7.append(r0)
            r7.append(r5)
            java.lang.String r0 = " remainingPatches="
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = " error="
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = r7.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.util.ArrayList r0 = a.C0279n6.e
            r2 = 0
            if (r0 != 0) goto Lb8
            goto L134
        Lb8:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto Lc0
            r4 = r1
            goto Lde
        Lc0:
            java.util.Iterator r3 = r0.iterator()
            r4 = r1
        Lc5:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lde
            java.lang.Object r5 = r3.next()
            a.n6$a r5 = (a.C0279n6.a) r5
            boolean r5 = r5.c
            if (r5 == 0) goto Lc5
            int r4 = r4 + 1
            if (r4 < 0) goto Lda
            goto Lc5
        Lda:
            a.C0294o3.f0()
            throw r2
        Lde:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto Le6
            r3 = r1
            goto L108
        Le6:
            java.util.Iterator r0 = r0.iterator()
            r3 = r1
        Leb:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L108
            java.lang.Object r5 = r0.next()
            a.n6$a r5 = (a.C0279n6.a) r5
            boolean r6 = r5.b
            if (r6 == 0) goto Leb
            boolean r5 = r5.c
            if (r5 != 0) goto Leb
            int r3 = r3 + 1
            if (r3 < 0) goto L104
            goto Leb
        L104:
            a.C0294o3.f0()
            throw r2
        L108:
            if (r3 <= 0) goto L10d
            java.lang.String r0 = "WARN"
            goto L10f
        L10d:
            java.lang.String r0 = "OK"
        L10f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[DIAG-HEALTH] module=TinkerFixLayers(healthCheck) status="
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = " ok="
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = " fail="
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = r5.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
        L134:
            java.lang.Boolean r0 = a.C0279n6.f
            if (r0 == 0) goto L150
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L141
            java.lang.String r0 = "OK"
            goto L143
        L141:
            java.lang.String r0 = "FAIL"
        L143:
            java.lang.String r3 = "[DIAG-HEALTH] module=TinkerFixTiming(healthCheck) status="
            java.lang.String r0 = r3.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
        L150:
            boolean r0 = a.C0279n6.g
            java.lang.String r3 = "WARN"
            if (r0 != 0) goto L157
            goto L15e
        L157:
            int r0 = a.C0279n6.i
            if (r0 <= 0) goto L15c
            goto L15e
        L15c:
            java.lang.String r3 = "OK"
        L15e:
            boolean r0 = a.C0279n6.g
            int r4 = a.C0279n6.j
            int r5 = a.C0279n6.h
            int r6 = a.C0279n6.i
            java.lang.String r7 = a.C0279n6.k
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "[DIAG-HEALTH] module=RCR status="
            r8.<init>(r9)
            r8.append(r3)
            java.lang.String r3 = " ready="
            r8.append(r3)
            r8.append(r0)
            java.lang.String r0 = " total="
            r8.append(r0)
            r8.append(r4)
            java.lang.String r0 = " cached="
            r8.append(r0)
            r8.append(r5)
            java.lang.String r0 = " fallback="
            r8.append(r0)
            r8.append(r6)
            java.lang.String r0 = " diag="
            r8.append(r0)
            r8.append(r7)
            java.lang.String r0 = r8.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            int r0 = a.C0279n6.l
            boolean r3 = a.C0279n6.m
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "[DIAG-HEALTH] module=DexKitCache selfKeys="
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " inkKeys=0 ready="
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.util.LinkedHashMap r3 = a.C0279n6.o
            monitor-enter(r3)
            java.util.LinkedHashMap r0 = a.C0279n6.o     // Catch: java.lang.Throwable -> L653
            java.util.Map r0 = a.C0067ba.H(r0)     // Catch: java.lang.Throwable -> L653
            monitor-exit(r3)
            java.util.Collection r3 = r0.values()
            if (r3 == 0) goto L1de
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L1de
            r4 = r1
            goto L200
        L1de:
            java.util.Iterator r3 = r3.iterator()
            r4 = r1
        L1e3:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L200
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "OK"
            boolean r5 = a.C0193i9.a(r5, r6)
            if (r5 == 0) goto L1e3
            int r4 = r4 + 1
            if (r4 < 0) goto L1fc
            goto L1e3
        L1fc:
            a.C0294o3.f0()
            throw r2
        L200:
            java.util.Collection r3 = r0.values()
            if (r3 == 0) goto L20e
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L20e
            r5 = r1
            goto L230
        L20e:
            java.util.Iterator r3 = r3.iterator()
            r5 = r1
        L213:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L230
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "FAIL"
            boolean r6 = a.C0193i9.a(r6, r7)
            if (r6 == 0) goto L213
            int r5 = r5 + 1
            if (r5 < 0) goto L22c
            goto L213
        L22c:
            a.C0294o3.f0()
            throw r2
        L230:
            boolean r3 = a.C0279n6.n
            if (r3 != 0) goto L237
            java.lang.String r3 = "PENDING"
            goto L243
        L237:
            if (r5 <= 0) goto L23c
            java.lang.String r3 = "WARN"
            goto L243
        L23c:
            if (r4 != 0) goto L241
            java.lang.String r3 = "FAIL"
            goto L243
        L241:
            java.lang.String r3 = "OK"
        L243:
            boolean r6 = a.C0279n6.n
            int r7 = r0.size()
            java.lang.String r8 = a.C0279n6.p
            java.util.Set r0 = r0.entrySet()
            java.lang.String r9 = ","
            a.g2 r10 = new a.g2
            r11 = 16
            r10.<init>(r11)
            r11 = 30
            java.lang.String r0 = a.C0383t3.p0(r0, r9, r10, r11)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "[DIAG-HEALTH] module=DexKitScan status="
            r9.<init>(r10)
            r9.append(r3)
            java.lang.String r3 = " completed="
            r9.append(r3)
            r9.append(r6)
            java.lang.String r3 = " tasksTotal="
            r9.append(r3)
            r9.append(r7)
            java.lang.String r3 = " ok="
            r9.append(r3)
            r9.append(r4)
            java.lang.String r3 = " fail="
            r9.append(r3)
            r9.append(r5)
            java.lang.String r3 = " error="
            r9.append(r3)
            r9.append(r8)
            java.lang.String r3 = " details="
            r9.append(r3)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.util.LinkedHashMap<java.lang.String, a.n6$b> r3 = a.C0279n6.r
            monitor-enter(r3)
            java.util.Map r0 = a.C0067ba.H(r3)     // Catch: java.lang.Throwable -> L650
            monitor-exit(r3)
            java.util.Collection r3 = r0.values()
            if (r3 == 0) goto L2b9
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L2b9
            r4 = r1
            goto L2dd
        L2b9:
            java.util.Iterator r3 = r3.iterator()
            r4 = r1
        L2be:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L2dd
            java.lang.Object r5 = r3.next()
            a.n6$b r5 = (a.C0279n6.b) r5
            java.lang.String r5 = r5.f597a
            java.lang.String r6 = "OK"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L2be
            int r4 = r4 + 1
            if (r4 < 0) goto L2d9
            goto L2be
        L2d9:
            a.C0294o3.f0()
            throw r2
        L2dd:
            java.util.Collection r3 = r0.values()
            if (r3 == 0) goto L2eb
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L2eb
            r5 = r1
            goto L30f
        L2eb:
            java.util.Iterator r3 = r3.iterator()
            r5 = r1
        L2f0:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L30f
            java.lang.Object r6 = r3.next()
            a.n6$b r6 = (a.C0279n6.b) r6
            java.lang.String r6 = r6.f597a
            java.lang.String r7 = "FAIL"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L2f0
            int r5 = r5 + 1
            if (r5 < 0) goto L30b
            goto L2f0
        L30b:
            a.C0294o3.f0()
            throw r2
        L30f:
            java.util.Collection r3 = r0.values()
            if (r3 == 0) goto L31d
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L31d
            r6 = r1
            goto L341
        L31d:
            java.util.Iterator r3 = r3.iterator()
            r6 = r1
        L322:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L341
            java.lang.Object r7 = r3.next()
            a.n6$b r7 = (a.C0279n6.b) r7
            java.lang.String r7 = r7.f597a
            java.lang.String r8 = "TIMEOUT"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L322
            int r6 = r6 + 1
            if (r6 < 0) goto L33d
            goto L322
        L33d:
            a.C0294o3.f0()
            throw r2
        L341:
            boolean r3 = a.C0279n6.q
            if (r3 != 0) goto L348
            java.lang.String r3 = "PENDING"
            goto L35d
        L348:
            if (r5 <= 0) goto L34d
            java.lang.String r3 = "FAIL"
            goto L35d
        L34d:
            if (r6 <= 0) goto L352
            java.lang.String r3 = "WARN"
            goto L35d
        L352:
            int r3 = r0.size()
            if (r4 != r3) goto L35b
            java.lang.String r3 = "OK"
            goto L35d
        L35b:
            java.lang.String r3 = "WARN"
        L35d:
            java.util.Set r7 = r0.entrySet()
            java.lang.String r8 = ";"
            a.g2 r9 = new a.g2
            r10 = 17
            r9.<init>(r10)
            java.lang.String r7 = a.C0383t3.p0(r7, r8, r9, r11)
            int r0 = r0.size()
            boolean r8 = a.C0279n6.q
            r9 = 200(0xc8, float:2.8E-43)
            java.lang.String r7 = a.Ce.X(r7, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "[DIAG-HEALTH] module=PartsInit status="
            r9.<init>(r10)
            r9.append(r3)
            java.lang.String r3 = " total="
            r9.append(r3)
            r9.append(r0)
            java.lang.String r0 = " ok="
            r9.append(r0)
            r9.append(r4)
            java.lang.String r0 = " fail="
            r9.append(r0)
            r9.append(r5)
            java.lang.String r0 = " timeout="
            r9.append(r0)
            r9.append(r6)
            java.lang.String r0 = " complete="
            r9.append(r0)
            r9.append(r8)
            java.lang.String r0 = " ["
            r9.append(r0)
            java.lang.String r0 = "]"
            java.lang.String r0 = a.C0487z.h(r9, r7, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.util.LinkedHashMap r3 = a.C0279n6.s
            monitor-enter(r3)
            java.util.LinkedHashMap r0 = a.C0279n6.s     // Catch: java.lang.Throwable -> L64d
            java.util.Map r0 = a.C0067ba.H(r0)     // Catch: java.lang.Throwable -> L64d
            monitor-exit(r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L3d0
            r4 = r1
            goto L3f6
        L3d0:
            java.util.Set r3 = r0.entrySet()
            java.util.Iterator r3 = r3.iterator()
            r4 = r1
        L3d9:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L3f6
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "FOUND"
            boolean r5 = a.Ae.H(r5, r6, r1)
            if (r5 == 0) goto L3d9
            int r4 = r4 + 1
            goto L3d9
        L3f6:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L3fe
            r5 = r1
            goto L422
        L3fe:
            java.util.Set r3 = r0.entrySet()
            java.util.Iterator r3 = r3.iterator()
            r5 = r1
        L407:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L422
            java.lang.Object r6 = r3.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.String r7 = "MISSING"
            boolean r6 = a.C0193i9.a(r6, r7)
            if (r6 == 0) goto L407
            int r5 = r5 + 1
            goto L407
        L422:
            if (r5 <= 0) goto L427
            java.lang.String r3 = "WARN"
            goto L42e
        L427:
            if (r4 <= 0) goto L42c
            java.lang.String r3 = "OK"
            goto L42e
        L42c:
            java.lang.String r3 = "PENDING"
        L42e:
            int r6 = r0.size()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L43f:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L463
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getValue()
            java.lang.String r10 = "MISSING"
            boolean r9 = a.C0193i9.a(r9, r10)
            if (r9 == 0) goto L43f
            java.lang.Object r9 = r8.getKey()
            java.lang.Object r8 = r8.getValue()
            r7.put(r9, r8)
            goto L43f
        L463:
            java.util.Set r0 = r7.keySet()
            java.lang.String r7 = ","
            r8 = 62
            java.lang.String r0 = a.C0383t3.p0(r0, r7, r2, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "[DIAG-HEALTH] module=ClassResolver status="
            r7.<init>(r9)
            r7.append(r3)
            java.lang.String r3 = " version=null total="
            r7.append(r3)
            r7.append(r6)
            java.lang.String r3 = " found="
            r7.append(r3)
            r7.append(r4)
            java.lang.String r3 = " miss="
            r7.append(r3)
            r7.append(r5)
            java.lang.String r3 = " missing="
            r7.append(r3)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.lang.String r0 = "top.mmjz.floatingclouds_preferences"
            r3 = r19
            android.content.SharedPreferences r0 = r3.getSharedPreferences(r0, r1)     // Catch: java.lang.Exception -> L57c
            java.lang.String r3 = "options"
            java.lang.String r3 = r0.getString(r3, r2)     // Catch: java.lang.Exception -> L57c
            if (r3 == 0) goto L52b
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L57c
            r4.<init>(r3)     // Catch: java.lang.Exception -> L57c
            java.lang.String r9 = "masterEnabled"
            java.lang.String r10 = "blockHotUpdate"
            java.lang.String r11 = "hideConversation"
            java.lang.String r12 = "hideMainConvList"
            java.lang.String r13 = "hideContactList"
            java.lang.String r14 = "hideMainSearch"
            java.lang.String r15 = "hideRecentForward"
            java.lang.String r16 = "hideSnsEntry"
            java.lang.String r17 = "blockEnterChat"
            java.lang.String r18 = "blockContactInfo"
            java.lang.String[] r3 = new java.lang.String[]{r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}     // Catch: java.lang.Exception -> L57c
            java.util.List r3 = a.C0294o3.d0(r3)     // Catch: java.lang.Exception -> L57c
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L57c
            r6 = 10
            int r6 = a.C0312p3.g0(r3, r6)     // Catch: java.lang.Exception -> L57c
            r5.<init>(r6)     // Catch: java.lang.Exception -> L57c
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L57c
        L4e4:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Exception -> L57c
            if (r6 == 0) goto L50c
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Exception -> L57c
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L57c
            boolean r7 = r4.optBoolean(r6, r1)     // Catch: java.lang.Exception -> L57c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L57c
            r9.<init>()     // Catch: java.lang.Exception -> L57c
            r9.append(r6)     // Catch: java.lang.Exception -> L57c
            java.lang.String r6 = "="
            r9.append(r6)     // Catch: java.lang.Exception -> L57c
            r9.append(r7)     // Catch: java.lang.Exception -> L57c
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Exception -> L57c
            r5.add(r6)     // Catch: java.lang.Exception -> L57c
            goto L4e4
        L50c:
            java.lang.String r3 = " "
            java.lang.String r3 = a.C0383t3.p0(r5, r3, r2, r8)     // Catch: java.lang.Exception -> L57c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L57c
            r4.<init>()     // Catch: java.lang.Exception -> L57c
            java.lang.String r5 = "[DIAG-HEALTH] module=Config status=OK "
            r4.append(r5)     // Catch: java.lang.Exception -> L57c
            r4.append(r3)     // Catch: java.lang.Exception -> L57c
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Exception -> L57c
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L57c
            a.C0453x1.b(r3)     // Catch: java.lang.Exception -> L57c
            goto L534
        L52b:
            java.lang.String r3 = "[DIAG-HEALTH] module=Config status=WARN options=null"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L57c
            a.C0453x1.e(r3)     // Catch: java.lang.Exception -> L57c
        L534:
            java.lang.String r3 = "maskList"
            java.lang.String r0 = r0.getString(r3, r2)     // Catch: java.lang.Exception -> L57c
            if (r0 == 0) goto L563
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L563
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L563
            r3.<init>()     // Catch: java.lang.Exception -> L563
            java.lang.String r4 = "{a:"
            r3.append(r4)     // Catch: java.lang.Exception -> L563
            r3.append(r0)     // Catch: java.lang.Exception -> L563
            java.lang.String r0 = "}"
            r3.append(r0)     // Catch: java.lang.Exception -> L563
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L563
            r2.<init>(r0)     // Catch: java.lang.Exception -> L563
            java.lang.String r0 = "a"
            org.json.JSONArray r0 = r2.optJSONArray(r0)     // Catch: java.lang.Exception -> L563
            if (r0 == 0) goto L563
            int r1 = r0.length()     // Catch: java.lang.Exception -> L563
        L563:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L57c
            r0.<init>()     // Catch: java.lang.Exception -> L57c
            java.lang.String r2 = "[DIAG-HEALTH] module=Config maskCount="
            r0.append(r2)     // Catch: java.lang.Exception -> L57c
            r0.append(r1)     // Catch: java.lang.Exception -> L57c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L57c
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> L57c
            a.C0453x1.b(r0)     // Catch: java.lang.Exception -> L57c
            goto L58e
        L57c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "[DIAG-HEALTH] module=Config status=FAIL error="
            java.lang.String r0 = a.C0487z.k(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.e(r0)
        L58e:
            java.lang.String r0 = "[DIAG-HEALTH] module=VersionSnapshot status="
            a.K3$a r1 = a.K3.f148a     // Catch: java.lang.Exception -> L61f
            r1.getClass()     // Catch: java.lang.Exception -> L61f
            a.ig r1 = a.K3.a.e()     // Catch: java.lang.Exception -> L61f
            a.ig r2 = a.K3.a.d()     // Catch: java.lang.Exception -> L61f
            if (r1 == 0) goto L615
            java.lang.String r3 = r1.b
            int r4 = r3.length()     // Catch: java.lang.Exception -> L61f
            if (r4 != 0) goto L5a8
            goto L615
        L5a8:
            boolean r4 = r1.a()     // Catch: java.lang.Exception -> L61f
            java.lang.String r5 = "WARN"
            if (r4 == 0) goto L5b1
            goto L5be
        L5b1:
            if (r2 == 0) goto L5bc
            java.lang.String r4 = r2.b     // Catch: java.lang.Exception -> L61f
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Exception -> L61f
            if (r4 != 0) goto L5bc
            goto L5be
        L5bc:
            java.lang.String r5 = "OK"
        L5be:
            int r4 = r1.c     // Catch: java.lang.Exception -> L61f
            boolean r6 = r1.a()     // Catch: java.lang.Exception -> L61f
            boolean r7 = r1.a()     // Catch: java.lang.Exception -> L61f
            java.lang.Boolean r1 = r1.l     // Catch: java.lang.Exception -> L61f
            if (r2 == 0) goto L5cf
            java.lang.String r2 = r2.b     // Catch: java.lang.Exception -> L61f
            goto L5d1
        L5cf:
            java.lang.String r2 = "none"
        L5d1:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L61f
            r8.<init>(r0)     // Catch: java.lang.Exception -> L61f
            r8.append(r5)     // Catch: java.lang.Exception -> L61f
            java.lang.String r0 = " ver="
            r8.append(r0)     // Catch: java.lang.Exception -> L61f
            r8.append(r3)     // Catch: java.lang.Exception -> L61f
            java.lang.String r0 = "("
            r8.append(r0)     // Catch: java.lang.Exception -> L61f
            r8.append(r4)     // Catch: java.lang.Exception -> L61f
            java.lang.String r0 = ") hotUpdated="
            r8.append(r0)     // Catch: java.lang.Exception -> L61f
            r8.append(r6)     // Catch: java.lang.Exception -> L61f
            java.lang.String r0 = " drift="
            r8.append(r0)     // Catch: java.lang.Exception -> L61f
            r8.append(r7)     // Catch: java.lang.Exception -> L61f
            java.lang.String r0 = " patchEnabled="
            r8.append(r0)     // Catch: java.lang.Exception -> L61f
            r8.append(r1)     // Catch: java.lang.Exception -> L61f
            java.lang.String r0 = " initial="
            r8.append(r0)     // Catch: java.lang.Exception -> L61f
            r8.append(r2)     // Catch: java.lang.Exception -> L61f
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Exception -> L61f
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> L61f
            a.C0453x1.b(r0)     // Catch: java.lang.Exception -> L61f
            goto L631
        L615:
            java.lang.String r0 = "[DIAG-HEALTH] module=VersionSnapshot status=WARN reason=no_snapshot_collected"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> L61f
            a.C0453x1.b(r0)     // Catch: java.lang.Exception -> L61f
            goto L631
        L61f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "[DIAG-HEALTH] module=VersionSnapshot status=FAIL error="
            java.lang.String r0 = a.C0487z.k(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.e(r0)
        L631:
            java.lang.String r0 = "[DIAG-HEALTH] ==============================="
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.lang.String r0 = "[DIAG-HEALTH] Feature Health Report END"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            java.lang.String r0 = "[DIAG-HEALTH] ==============================="
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            return
        L64d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L650:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L653:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public static void b(java.lang.String r4, java.lang.String r5, boolean r6) {
            java.lang.String r0 = "FOUND:"
            java.lang.String r1 = "key"
            a.C0193i9.e(r4, r1)
            java.util.LinkedHashMap r1 = a.C0279n6.s
            monitor-enter(r1)
            java.util.LinkedHashMap r2 = a.C0279n6.s     // Catch: java.lang.Throwable -> L1b
            if (r6 == 0) goto L1d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            r3.append(r5)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r4 = move-exception
            goto L45
        L1d:
            java.lang.String r0 = "MISSING"
        L1f:
            r2.put(r4, r0)     // Catch: java.lang.Throwable -> L1b
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r1)
            if (r6 != 0) goto L44
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "[DIAG-HEALTH] module=ClassResolver key="
            r6.<init>(r0)
            r6.append(r4)
            java.lang.String r4 = " status=MISSING class="
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            a.C0453x1.e(r4)
        L44:
            return
        L45:
            monitor-exit(r1)
            throw r4
    }

    public static void c(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "detail"
            a.C0193i9.e(r5, r0)
            java.util.LinkedHashMap r0 = a.C0279n6.o
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = a.C0279n6.o     // Catch: java.lang.Throwable -> L29
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L29
            a.Wf r1 = a.Wf.f330a     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)
            java.lang.String r0 = "[DIAG-HEALTH] module=DexKitScan task="
            java.lang.String r1 = " status="
            java.lang.String r2 = " "
            java.lang.StringBuilder r3 = a.C0487z.i(r0, r3, r1, r4, r2)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            a.C0453x1.b(r3)
            return
        L29:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public static void d(java.lang.String r3, java.lang.String r4, long r5, java.lang.String r7) {
            java.lang.String r0 = "partName"
            a.C0193i9.e(r3, r0)
            java.util.LinkedHashMap<java.lang.String, a.n6$b> r0 = a.C0279n6.r
            monitor-enter(r0)
            a.n6$b r1 = new a.n6$b     // Catch: java.lang.Throwable -> L46
            r1.<init>(r4, r5, r7)     // Catch: java.lang.Throwable -> L46
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L46
            a.Wf r1 = a.Wf.f330a     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)
            java.lang.String r0 = "FAIL"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L25
            java.lang.String r0 = "TIMEOUT"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L24
            goto L25
        L24:
            return
        L25:
            java.lang.String r0 = "[DIAG-HEALTH] module=PartsInit part="
            java.lang.String r1 = " status="
            java.lang.String r2 = " duration="
            java.lang.StringBuilder r3 = a.C0487z.i(r0, r3, r1, r4, r2)
            r3.append(r5)
            java.lang.String r4 = "ms error="
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            a.C0453x1.e(r3)
            return
        L46:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public static void e(boolean r1, int r2, int r3, int r4, java.lang.String r5) {
            a.C0279n6.g = r1
            a.C0279n6.h = r2
            a.C0279n6.i = r3
            a.C0279n6.j = r4
            a.C0279n6.k = r5
            if (r1 == 0) goto Lf
            java.lang.String r1 = "OK"
            goto L11
        Lf:
            java.lang.String r1 = "WARN"
        L11:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "[DIAG-HEALTH] module=RCR status="
            r5.<init>(r0)
            r5.append(r1)
            java.lang.String r1 = " total="
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = " cached="
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = " fallback="
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            a.C0453x1.b(r1)
            return
    }

    public static void f(boolean r3, int r4, boolean r5, java.lang.String r6) {
            a.C0279n6.f595a = r3
            a.C0279n6.b = r4
            a.C0279n6.c = r5
            a.C0279n6.d = r6
            if (r6 == 0) goto Ld
            java.lang.String r0 = "FAIL"
            goto Lf
        Ld:
            java.lang.String r0 = "OK"
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[DIAG-HEALTH] module=TinkerFix status="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " hadPatch="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = " deleted="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = " blockEnabled="
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = " error="
            r1.append(r3)
            r1.append(r6)
            java.lang.String r3 = r1.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            a.C0453x1.b(r3)
            return
    }
}
