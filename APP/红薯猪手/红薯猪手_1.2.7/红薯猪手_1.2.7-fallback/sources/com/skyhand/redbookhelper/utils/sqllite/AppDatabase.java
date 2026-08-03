package com.skyhand.redbookhelper.utils.sqllite;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppDatabase extends p000.a9 {

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public static final com.skyhand.redbookhelper.utils.sqllite.AppDatabase.c f77 = null;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public static volatile com.skyhand.redbookhelper.utils.sqllite.AppDatabase f78;

    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public static final com.skyhand.redbookhelper.utils.sqllite.AppDatabase.a f79 = null;

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public static final com.skyhand.redbookhelper.utils.sqllite.AppDatabase.b f80 = null;

    public static final class a extends p000.t5 {
        public a() {
                r2 = this;
                r0 = 1
                r1 = 2
                r2.<init>(r0, r1)
                return
        }

        @Override // p000.t5
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void mo14(p000.b3 r4) {
                r3 = this;
                r0 = 8
                byte[] r0 = new byte[r0]
                r0 = {x0028: FILL_ARRAY_DATA , data: [-4, 105, -57, 43, -14, -58, -21, 109} // fill-array
                r1 = 6
                byte[] r2 = new byte[r1]
                r2 = {x0030: FILL_ARRAY_DATA , data: [-104, 8, -77, 74, -112, -89} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r2)
                p000.h4.m189(r0, r4)
                r0 = 64
                byte[] r0 = new byte[r0]
                r0 = {x0038: FILL_ARRAY_DATA , data: [61, -64, 45, -99, -52, 77, 40, -51, 59, -108, -37, 77, 20, -7, 10, -67, -20, 77, 61, -56, 61, -8, -35, 34, 48, -39, 52, -106, -66, 4, 12, -64, 22, -69, -1, 25, 21, -29, 23, -8, -54, 40, 36, -40, 89, -106, -47, 57, 92, -62, 44, -108, -46, 77, 56, -55, 63, -103, -53, 33, 40, -84, 94, -1} // fill-array
                byte[] r1 = new byte[r1]
                r1 = {x005c: FILL_ARRAY_DATA , data: [124, -116, 121, -40, -98, 109} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r1)
                r4.mo42(r0)
                return
        }
    }

    public static final class b extends p000.t5 {
        public b() {
                r2 = this;
                r0 = 2
                r1 = 3
                r2.<init>(r0, r1)
                return
        }

        @Override // p000.t5
        /* JADX INFO: renamed from: ۥ */
        public final void mo14(p000.b3 r3) {
                r2 = this;
                r0 = 8
                byte[] r0 = new byte[r0]
                r0 = {x0016: FILL_ARRAY_DATA , data: [75, -72, 6, 70, -103, 67, 92, -68} // fill-array
                r1 = 6
                byte[] r1 = new byte[r1]
                r1 = {x001e: FILL_ARRAY_DATA , data: [47, -39, 114, 39, -5, 34} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r1)
                p000.h4.m189(r0, r3)
                return
        }
    }

    public static final class c {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static com.skyhand.redbookhelper.utils.sqllite.AppDatabase m15(android.content.Context r16) {
                java.lang.Class<com.skyhand.redbookhelper.utils.sqllite.AppDatabase> r0 = com.skyhand.redbookhelper.utils.sqllite.AppDatabase.class
                r1 = 10
                byte[] r2 = new byte[r1]
                r2 = {x02f8: FILL_ARRAY_DATA , data: [75, -23, -43, -53, 78, -48, 85, -4, -44, -26} // fill-array
                r3 = 6
                byte[] r4 = new byte[r3]
                r4 = {x0302: FILL_ARRAY_DATA , data: [57, -116, -79, -108, 38, -75} // fill-array
                java.lang.String r7 = p000.oa.m332(r2, r4)
                java.lang.String r2 = r7.trim()
                int r2 = r2.length()
                if (r2 == 0) goto L2ef
                ۟.a9$b r9 = new ۟.a9$b
                r9.<init>()
                r2 = 2
                ۟.t5[] r4 = new p000.t5[r2]
                com.skyhand.redbookhelper.utils.sqllite.AppDatabase$a r5 = com.skyhand.redbookhelper.utils.sqllite.AppDatabase.f79
                r13 = 0
                r4[r13] = r5
                com.skyhand.redbookhelper.utils.sqllite.AppDatabase$b r5 = com.skyhand.redbookhelper.utils.sqllite.AppDatabase.f80
                r14 = 1
                r4[r14] = r5
                java.util.HashSet r5 = new java.util.HashSet
                r5.<init>()
                r6 = r13
            L35:
                if (r6 >= r2) goto L4e
                r8 = r4[r6]
                int r10 = r8.f1035
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r5.add(r10)
                int r8 = r8.f1036
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r5.add(r8)
                int r6 = r6 + 1
                goto L35
            L4e:
                r9.m39(r4)
                r4 = 3
                ۟.s$a r12 = p000.s.f948
                ۟.d3 r8 = new ۟.d3
                r8.<init>()
                ۟.f1 r15 = new ۟.f1
                java.lang.String r5 = "activity"
                r6 = r16
                java.lang.Object r5 = r6.getSystemService(r5)
                android.app.ActivityManager r5 = (android.app.ActivityManager) r5
                if (r5 == 0) goto L6f
                boolean r5 = r5.isLowRamDevice()
                if (r5 != 0) goto L6f
                r10 = r4
                goto L70
            L6f:
                r10 = r2
            L70:
                r5 = r15
                r6 = r16
                r11 = r12
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                java.lang.Package r2 = r0.getPackage()
                java.lang.String r2 = r2.getName()
                java.lang.String r5 = r0.getCanonicalName()
                boolean r6 = r2.isEmpty()
                if (r6 == 0) goto L8a
                goto L93
            L8a:
                int r6 = r2.length()
                int r6 = r6 + r14
                java.lang.String r5 = r5.substring(r6)
            L93:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r7 = 46
                r8 = 95
                java.lang.String r5 = r5.replace(r7, r8)
                r6.append(r5)
                java.lang.String r5 = "_Impl"
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                boolean r6 = r2.isEmpty()     // Catch: java.lang.InstantiationException -> L29d java.lang.IllegalAccessException -> L2b4 java.lang.ClassNotFoundException -> L2cb
                if (r6 == 0) goto Lb4
                r2 = r5
                goto Lc8
            Lb4:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.InstantiationException -> L29d java.lang.IllegalAccessException -> L2b4 java.lang.ClassNotFoundException -> L2cb
                r6.<init>()     // Catch: java.lang.InstantiationException -> L29d java.lang.IllegalAccessException -> L2b4 java.lang.ClassNotFoundException -> L2cb
                r6.append(r2)     // Catch: java.lang.InstantiationException -> L29d java.lang.IllegalAccessException -> L2b4 java.lang.ClassNotFoundException -> L2cb
                java.lang.String r2 = "."
                r6.append(r2)     // Catch: java.lang.InstantiationException -> L29d java.lang.IllegalAccessException -> L2b4 java.lang.ClassNotFoundException -> L2cb
                r6.append(r5)     // Catch: java.lang.InstantiationException -> L29d java.lang.IllegalAccessException -> L2b4 java.lang.ClassNotFoundException -> L2cb
                java.lang.String r2 = r6.toString()     // Catch: java.lang.InstantiationException -> L29d java.lang.IllegalAccessException -> L2b4 java.lang.ClassNotFoundException -> L2cb
            Lc8:
                java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch: java.lang.InstantiationException -> L29d java.lang.IllegalAccessException -> L2b4 java.lang.ClassNotFoundException -> L2cb
                java.lang.Class r2 = java.lang.Class.forName(r2, r14, r6)     // Catch: java.lang.InstantiationException -> L29d java.lang.IllegalAccessException -> L2b4 java.lang.ClassNotFoundException -> L2cb
                java.lang.Object r0 = r2.newInstance()     // Catch: java.lang.InstantiationException -> L29d java.lang.IllegalAccessException -> L2b4 java.lang.ClassNotFoundException -> L2cb
                ۟.a9 r0 = (p000.a9) r0
                ۟.bb r2 = r0.mo17(r15)
                r0.f102 = r2
                java.util.Set r2 = r0.mo19()
                java.util.BitSet r5 = new java.util.BitSet
                r5.<init>()
                java.util.Iterator r2 = r2.iterator()
            Le9:
                boolean r6 = r2.hasNext()
                r7 = -1
                if (r6 == 0) goto L143
                java.lang.Object r6 = r2.next()
                java.lang.Class r6 = (java.lang.Class) r6
                java.util.List<۟.z> r8 = r15.f331
                int r8 = r8.size()
                int r8 = r8 - r14
            Lfd:
                if (r8 < 0) goto L117
                java.util.List<۟.z> r9 = r15.f331
                java.lang.Object r9 = r9.get(r8)
                java.lang.Class r9 = r9.getClass()
                boolean r9 = r6.isAssignableFrom(r9)
                if (r9 == 0) goto L114
                r5.set(r8)
                r7 = r8
                goto L117
            L114:
                int r8 = r8 + (-1)
                goto Lfd
            L117:
                if (r7 < 0) goto L127
                java.util.HashMap r8 = r0.f106
                java.util.List<۟.z> r9 = r15.f331
                java.lang.Object r7 = r9.get(r7)
                ۟.z r7 = (p000.z) r7
                r8.put(r6, r7)
                goto Le9
            L127:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "A required auto migration spec ("
                java.lang.StringBuilder r1 = p000.c4.m108(r1)
                java.lang.String r2 = r6.getCanonicalName()
                r1.append(r2)
                java.lang.String r2 = ") is missing in the database configuration."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L143:
                java.util.List<۟.z> r2 = r15.f331
                int r2 = r2.size()
                int r2 = r2 - r14
            L14a:
                if (r2 < 0) goto L15d
                boolean r6 = r5.get(r2)
                if (r6 == 0) goto L155
                int r2 = r2 + (-1)
                goto L14a
            L155:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
                r0.<init>(r1)
                throw r0
            L15d:
                java.util.List r2 = r0.mo18()
                java.util.Iterator r2 = r2.iterator()
            L165:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L18f
                java.lang.Object r5 = r2.next()
                ۟.t5 r5 = (p000.t5) r5
                ۟.a9$b r6 = r15.f329
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, ۟.t5>> r6 = r6.f110
                java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)
                int r8 = r5.f1035
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                boolean r6 = r6.containsKey(r8)
                if (r6 != 0) goto L165
                ۟.a9$b r6 = r15.f329
                ۟.t5[] r8 = new p000.t5[r14]
                r8[r13] = r5
                r6.m39(r8)
                goto L165
            L18f:
                java.lang.Class<۟.d9> r2 = p000.d9.class
                ۟.bb r5 = r0.f102
                java.lang.Object r2 = p000.a9.m34(r2, r5)
                ۟.d9 r2 = (p000.d9) r2
                if (r2 == 0) goto L19d
                r2.f294 = r15
            L19d:
                java.lang.Class<۟.x> r2 = p000.x.class
                ۟.bb r5 = r0.f102
                java.lang.Object r2 = p000.a9.m34(r2, r5)
                ۟.x r2 = (p000.x) r2
                r5 = 0
                if (r2 != 0) goto L297
                int r2 = r15.f332
                if (r2 != r4) goto L1b0
                r2 = r14
                goto L1b1
            L1b0:
                r2 = r13
            L1b1:
                ۟.bb r4 = r0.f102
                r4.setWriteAheadLoggingEnabled(r2)
                r0.f105 = r5
                java.util.concurrent.Executor r2 = r15.f333
                r0.f101 = r2
                java.util.ArrayDeque r2 = new java.util.ArrayDeque
                r2.<init>()
                r0.f104 = r13
                java.util.Map r2 = r0.mo20()
                java.util.BitSet r4 = new java.util.BitSet
                r4.<init>()
                java.util.Set r2 = r2.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L1d4:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L253
                java.lang.Object r5 = r2.next()
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r6 = r5.getKey()
                java.lang.Class r6 = (java.lang.Class) r6
                java.lang.Object r5 = r5.getValue()
                java.util.List r5 = (java.util.List) r5
                java.util.Iterator r5 = r5.iterator()
            L1f0:
                boolean r8 = r5.hasNext()
                if (r8 == 0) goto L1d4
                java.lang.Object r8 = r5.next()
                java.lang.Class r8 = (java.lang.Class) r8
                java.util.List<java.lang.Object> r9 = r15.f330
                int r9 = r9.size()
                int r9 = r9 - r14
            L203:
                if (r9 < 0) goto L21c
                java.util.List<java.lang.Object> r10 = r15.f330
                java.lang.Object r10 = r10.get(r9)
                java.lang.Class r10 = r10.getClass()
                boolean r10 = r8.isAssignableFrom(r10)
                if (r10 == 0) goto L219
                r4.set(r9)
                goto L21d
            L219:
                int r9 = r9 + (-1)
                goto L203
            L21c:
                r9 = r7
            L21d:
                if (r9 < 0) goto L22b
                java.util.HashMap r10 = r0.f109
                java.util.List<java.lang.Object> r11 = r15.f330
                java.lang.Object r9 = r11.get(r9)
                r10.put(r8, r9)
                goto L1f0
            L22b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "A required type converter ("
                r1.append(r2)
                r1.append(r8)
                java.lang.String r2 = ") for "
                r1.append(r2)
                java.lang.String r2 = r6.getCanonicalName()
                r1.append(r2)
                java.lang.String r2 = " is missing in the database configuration."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L253:
                java.util.List<java.lang.Object> r2 = r15.f330
                int r2 = r2.size()
                int r2 = r2 - r14
            L25a:
                if (r2 < 0) goto L287
                boolean r5 = r4.get(r2)
                if (r5 == 0) goto L265
                int r2 = r2 + (-1)
                goto L25a
            L265:
                java.util.List<java.lang.Object> r0 = r15.f330
                java.lang.Object r0 = r0.get(r2)
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unexpected type converter "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L287:
                byte[] r1 = new byte[r1]
                r1 = {x030a: FILL_ARRAY_DATA , data: [43, 27, -77, -127, 9, -98, 103, 64, -12, -60} // fill-array
                byte[] r2 = new byte[r3]
                r2 = {x0314: FILL_ARRAY_DATA , data: [73, 110, -38, -19, 109, -74} // fill-array
                p000.oa.m332(r1, r2)
                com.skyhand.redbookhelper.utils.sqllite.AppDatabase r0 = (com.skyhand.redbookhelper.utils.sqllite.AppDatabase) r0
                return r0
            L297:
                ۟.k4 r0 = r0.f103
                r0.getClass()
                throw r5
            L29d:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Failed to create an instance of "
                java.lang.StringBuilder r2 = p000.c4.m108(r2)
                java.lang.String r0 = r0.getCanonicalName()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L2b4:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Cannot access the constructor"
                java.lang.StringBuilder r2 = p000.c4.m108(r2)
                java.lang.String r0 = r0.getCanonicalName()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L2cb:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "cannot find implementation for "
                java.lang.StringBuilder r2 = p000.c4.m108(r2)
                java.lang.String r0 = r0.getCanonicalName()
                r2.append(r0)
                java.lang.String r0 = ". "
                r2.append(r0)
                r2.append(r5)
                java.lang.String r0 = " does not exist"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L2ef:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase$c r0 = new com.skyhand.redbookhelper.utils.sqllite.AppDatabase$c
            r0.<init>()
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase.f77 = r0
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase$a r0 = new com.skyhand.redbookhelper.utils.sqllite.AppDatabase$a
            r0.<init>()
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase.f79 = r0
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase$b r0 = new com.skyhand.redbookhelper.utils.sqllite.AppDatabase$b
            r0.<init>()
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase.f80 = r0
            return
    }

    public AppDatabase() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public abstract p000.yb mo13();
}
