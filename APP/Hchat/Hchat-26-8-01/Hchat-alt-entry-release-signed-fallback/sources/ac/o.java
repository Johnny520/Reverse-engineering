package ac;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements android.content.SharedPreferences, android.content.SharedPreferences.Editor {
    public static final int A = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte[] f189y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f190z = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ac.k f198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ac.q f203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f205o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f206p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final android.os.Handler f207q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.nio.channels.FileChannel f208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public java.nio.channels.FileChannel f209s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public java.nio.MappedByteBuffer f210t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public java.nio.MappedByteBuffer f211u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f212v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f213w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f214x;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            ac.o.f189y = r0
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x003c: FILL_ARRAY_DATA , data: [0, 1, 4, 4, 8, 8} // fill-array
            ac.o.f190z = r0
            java.lang.String r0 = "sun.misc.Unsafe"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "theUnsafe"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L36
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "pageSize"
            r4 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L36
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.invoke(r1, r4)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L36
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r0 = 16384(0x4000, float:2.2959E-41)
        L38:
            ac.o.A = r0
            return
    }

    public o(java.lang.String r4, java.lang.String r5, ac.s[] r6, int r7) {
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f196f = r0
            r0 = 0
            r3.f197g = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f201k = r1
            r3.f202l = r0
            ac.q r1 = new ac.q
            r1.<init>()
            r3.f203m = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f205o = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f206p = r1
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r3.f207q = r1
            r1 = 1
            r3.f214x = r1
            r3.f191a = r4
            r3.f192b = r5
            r3.f213w = r7
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            if (r6 == 0) goto L62
            int r5 = r6.length
        L47:
            if (r0 >= r5) goto L62
            r7 = r6[r0]
            r7.getClass()
            java.lang.String r1 = "StringSet"
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L5c
            java.lang.String r7 = "duplicate encoder tag:StringSet"
            g4.a.m(r3, r7)
            goto L5f
        L5c:
            r4.put(r1, r7)
        L5f:
            int r0 = r0 + 1
            goto L47
        L62:
            ac.s r5 = ac.s.f221a
            java.lang.String r6 = "StringSet"
            r4.put(r6, r5)
            r3.f193c = r4
            java.util.HashMap r4 = r3.f196f
            monitor-enter(r4)
            java.util.concurrent.Executor r5 = ac.p.w()     // Catch: java.lang.Throwable -> L85
            ac.m r6 = new ac.m     // Catch: java.lang.Throwable -> L85
            r7 = 1
            r6.<init>(r3, r7)     // Catch: java.lang.Throwable -> L85
            r5.execute(r6)     // Catch: java.lang.Throwable -> L85
            boolean r5 = r3.f197g     // Catch: java.lang.Throwable -> L85
            if (r5 != 0) goto L87
            java.util.HashMap r5 = r3.f196f     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            r5.wait()     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            goto L87
        L85:
            r5 = move-exception
            goto L89
        L87:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L85
            return
        L89:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L85
            throw r5
    }

    public static void b(java.lang.String r0) {
            if (r0 == 0) goto L9
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.String r0 = "key is empty"
            j8.o.t(r0)
            return
    }

    public final void a(java.lang.String r7, java.lang.Object r8, byte[] r9, ac.j r10, byte r11) {
            r6 = this;
            if (r10 != 0) goto L33
            int r2 = r6.o(r7, r9, r11)
            if (r2 <= 0) goto Lfb
            int r4 = r9.length
            int r1 = r6.f199i
            r9 = 6
            if (r11 != r9) goto L18
            ac.i r0 = new ac.i
            r3 = r8
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            goto L2a
        L18:
            r9 = 7
            if (r11 != r9) goto L23
            ac.a r0 = new ac.a
            r5 = 0
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L2a
        L23:
            r3 = r8
            ac.h r0 = new ac.h
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
        L2a:
            java.util.HashMap r8 = r6.f196f
            r8.put(r7, r0)
            r6.l()
            return
        L33:
            r3 = r8
            boolean r8 = r10.f175e
            r11 = 0
            if (r8 != 0) goto L9d
            int r8 = r10.f174d
            int r0 = r9.length
            if (r8 != r0) goto L9d
            int r7 = r10.f166a
            int r8 = r9.length
            long r0 = r6.f195e
            ac.k r2 = r6.f198h
            long r4 = r2.m(r7, r8)
            long r0 = r0 ^ r4
            r6.f195e = r0
            ac.k r0 = r6.f198h
            r0.f177h = r7
            r0.C(r9)
            long r0 = r6.f195e
            ac.k r2 = r6.f198h
            long r4 = r2.m(r7, r8)
            long r0 = r0 ^ r4
            r6.f195e = r0
            int r8 = r6.f213w
            r2 = 4
            if (r8 != 0) goto L95
            java.nio.MappedByteBuffer r8 = r6.f210t
            r0 = -1
            r8.putInt(r11, r0)
            java.nio.MappedByteBuffer r8 = r6.f210t
            long r0 = r6.f195e
            r8.putLong(r2, r0)
            java.nio.MappedByteBuffer r8 = r6.f210t
            r8.position(r7)
            java.nio.MappedByteBuffer r8 = r6.f210t
            r8.put(r9)
            java.nio.MappedByteBuffer r8 = r6.f210t
            int r0 = r6.f194d
            int r0 = r0 + (-12)
            r8.putInt(r11, r0)
            java.nio.MappedByteBuffer r8 = r6.f211u
            long r0 = r6.f195e
            r8.putLong(r2, r0)
            java.nio.MappedByteBuffer r8 = r6.f211u
            r8.position(r7)
            java.nio.MappedByteBuffer r7 = r6.f211u
            r7.put(r9)
            goto L9a
        L95:
            ac.k r7 = r6.f198h
            r7.F(r2, r0)
        L9a:
            r10.f172b = r3
            return
        L9d:
            byte r8 = r10.a()
            int r7 = r6.o(r7, r9, r8)
            if (r7 <= 0) goto Lfb
            boolean r8 = r10.f175e
            if (r8 == 0) goto Lb0
            java.lang.Object r8 = r10.f172b
            java.lang.String r8 = (java.lang.String) r8
            goto Lb1
        Lb0:
            r8 = 0
        Lb1:
            byte r0 = r10.a()
            int r1 = r10.f173c
            int r2 = r10.f166a
            int r4 = r10.f174d
            int r2 = r2 + r4
            r6.i(r0, r1, r2)
            int r0 = r6.f199i
            r10.f173c = r0
            r10.f166a = r7
            r10.f175e = r11
            r10.f172b = r3
            int r7 = r9.length
            r10.f174d = r7
            r6.l()
            int r7 = r6.f204n
            r9 = 8192(0x2000, float:1.148E-41)
            if (r7 >= r9) goto Ldf
            java.util.ArrayList r7 = r6.f205o
            int r7 = r7.size()
            r9 = 100
            if (r7 < r9) goto Le2
        Ldf:
            fb.v0.s(r6, r11)
        Le2:
            if (r8 == 0) goto Lfb
            int r7 = r6.f213w
            if (r7 != 0) goto Lf6
            java.util.concurrent.Executor r7 = ac.p.w()
            a1.d r9 = new a1.d
            r10 = 1
            r9.<init>(r6, r10, r8)
            r7.execute(r9)
            return
        Lf6:
            java.util.ArrayList r7 = r6.f201k
            r7.add(r8)
        Lfb:
            return
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f202l     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return
        L7:
            r0 = 1
            r1.f214x = r0     // Catch: java.lang.Throwable -> Lf
            r1.d()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Lf:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public final synchronized void c() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f202l     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L6
            goto L29
        L6:
            r0 = 1
            r4.f202l = r0     // Catch: java.lang.Throwable -> L4a
            int r1 = r4.f213w     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L29
            java.nio.channels.FileChannel r1 = r4.f208r     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L14
            r1.force(r0)     // Catch: java.io.IOException -> L14 java.lang.Throwable -> L4a
        L14:
            java.nio.channels.FileChannel r1 = r4.f208r     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L1b
            r1.close()     // Catch: java.io.IOException -> L1b java.lang.Throwable -> L4a
        L1b:
            java.nio.channels.FileChannel r1 = r4.f209s     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L22
            r1.force(r0)     // Catch: java.io.IOException -> L22 java.lang.Throwable -> L4a
        L22:
            java.nio.channels.FileChannel r0 = r4.f209s     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L29
            r0.close()     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L4a
        L29:
            java.lang.Class<ac.n> r0 = ac.n.class
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L4a
            java.util.concurrent.ConcurrentHashMap r1 = ac.n.f186c     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r2.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = r4.f191a     // Catch: java.lang.Throwable -> L47
            r2.append(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = r4.f192b     // Catch: java.lang.Throwable -> L47
            r2.append(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L47
            r1.remove(r2)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r4)
            return
        L47:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r1     // Catch: java.lang.Throwable -> L4a
        L4a:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4a
            throw r0
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized android.content.SharedPreferences.Editor clear() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f202l     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return r1
        L7:
            f8.i.i(r1)     // Catch: java.lang.Throwable -> L12
            int r0 = r1.f213w     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            f8.i.r(r1)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r0 = move-exception
            goto L1a
        L14:
            r0 = 0
            r1.g(r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return r1
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized boolean commit() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f202l     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L8
            monitor-exit(r1)
            r0 = 0
            return r0
        L8:
            r0 = 1
            r1.f214x = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r1.d()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    @Override // android.content.SharedPreferences
    public final synchronized boolean contains(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap r0 = r1.f196f     // Catch: java.lang.Throwable -> L9
            boolean r2 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public final boolean d() {
            r3 = this;
            int r0 = r3.f213w
            r1 = 1
            if (r0 != r1) goto L11
            ac.m r0 = new ac.m
            r2 = 0
            r0.<init>(r3, r2)
            ac.q r2 = r3.f203m
            r2.execute(r0)
            return r1
        L11:
            r2 = 2
            if (r0 != r2) goto L19
            boolean r0 = f8.i.T0(r3)
            return r0
        L19:
            return r1
    }

    public final synchronized java.lang.Object e(java.lang.String r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.HashMap r0 = r4.f196f     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L26
            ac.b r0 = (ac.b) r0     // Catch: java.lang.Throwable -> L26
            r1 = 0
            if (r0 == 0) goto L33
            byte r2 = r0.a()     // Catch: java.lang.Throwable -> L26
            r3 = 8
            if (r2 == r3) goto L15
            goto L33
        L15:
            ac.h r0 = (ac.h) r0     // Catch: java.lang.Throwable -> L26
            boolean r2 = r0.f175e     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L2f
            java.util.LinkedHashSet r2 = f8.i.H(r4, r0)     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L28
            r4.remove(r5)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r4)
            return r1
        L26:
            r5 = move-exception
            goto L35
        L28:
            r0.f172b = r2     // Catch: java.lang.Throwable -> L26
            r5 = 0
            r0.f175e = r5     // Catch: java.lang.Throwable -> L26
            monitor-exit(r4)
            return r2
        L2f:
            java.lang.Object r5 = r0.f172b     // Catch: java.lang.Throwable -> L26
            monitor-exit(r4)
            return r5
        L33:
            monitor-exit(r4)
            return r1
        L35:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L26
            throw r5
    }

    @Override // android.content.SharedPreferences
    public final android.content.SharedPreferences.Editor edit() {
            r0 = this;
            return r0
    }

    public final void f(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f213w
            if (r0 == 0) goto Lb
            boolean r0 = r1.f214x
            if (r0 == 0) goto Lb
            r1.d()
        Lb:
            r1.g(r2)
            return
    }

    public final synchronized void g(java.lang.String r6) {
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = r5.f206p     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            java.util.ArrayList r0 = r5.f206p     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L29
        L11:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L29
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r1 = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) r1     // Catch: java.lang.Throwable -> L29
            android.os.Handler r2 = r5.f207q     // Catch: java.lang.Throwable -> L29
            ac.l r3 = new ac.l     // Catch: java.lang.Throwable -> L29
            r4 = 0
            r3.<init>(r5, r1, r6, r4)     // Catch: java.lang.Throwable -> L29
            r2.post(r3)     // Catch: java.lang.Throwable -> L29
            goto L11
        L29:
            r6 = move-exception
            goto L2d
        L2b:
            monitor-exit(r5)
            return
        L2d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L29
            throw r6
    }

    @Override // android.content.SharedPreferences
    public final synchronized java.util.Map getAll() {
            r9 = this;
            monitor-enter(r9)
            java.util.HashMap r0 = r9.f196f     // Catch: java.lang.Throwable -> L10
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L13
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L10
            r0.<init>()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r9)
            return r0
        L10:
            r0 = move-exception
            goto Ld3
        L13:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L10
            int r0 = r0 * 4
            int r0 = r0 / 3
            int r0 = r0 + 1
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L10
            java.util.HashMap r0 = r9.f196f     // Catch: java.lang.Throwable -> L10
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L10
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L10
        L28:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto Ld1
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L10
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L10
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L10
            ac.b r2 = (ac.b) r2     // Catch: java.lang.Throwable -> L10
            byte r4 = r2.a()     // Catch: java.lang.Throwable -> L10
            r5 = 0
            switch(r4) {
                case 1: goto Lc2;
                case 2: goto Lb9;
                case 3: goto Lb0;
                case 4: goto La7;
                case 5: goto L9e;
                case 6: goto L90;
                case 7: goto L5d;
                case 8: goto L4a;
                default: goto L48;
            }     // Catch: java.lang.Throwable -> L10
        L48:
            goto Lca
        L4a:
            r4 = r2
            ac.h r4 = (ac.h) r4     // Catch: java.lang.Throwable -> L10
            boolean r5 = r4.f175e     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L58
            java.util.LinkedHashSet r2 = f8.i.H(r9, r4)     // Catch: java.lang.Throwable -> L10
        L55:
            r5 = r2
            goto Lca
        L58:
            ac.h r2 = (ac.h) r2     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r2.f172b     // Catch: java.lang.Throwable -> L10
            goto L55
        L5d:
            ac.a r2 = (ac.a) r2     // Catch: java.lang.Throwable -> L10
            boolean r4 = r2.f175e     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L8d
            java.lang.String r4 = r9.f192b     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r2.f172b     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L10
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L86
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L86
            r7.<init>()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L86
            java.lang.String r8 = r9.f191a     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L86
            r7.append(r8)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L86
            r7.append(r4)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L86
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L86
            r6.<init>(r7, r2)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L86
            byte[] r2 = ig.a.u(r6)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L86
            if (r2 == 0) goto Lca
            goto L55
        L86:
            r2 = move-exception
            java.lang.String r6 = "FastKV"
            android.util.Log.e(r6, r4, r2)     // Catch: java.lang.Throwable -> L10
            goto Lca
        L8d:
            java.lang.Object r2 = r2.f172b     // Catch: java.lang.Throwable -> L10
            goto L55
        L90:
            ac.i r2 = (ac.i) r2     // Catch: java.lang.Throwable -> L10
            boolean r4 = r2.f175e     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L9b
            java.lang.String r2 = f8.i.J(r9, r2)     // Catch: java.lang.Throwable -> L10
            goto L55
        L9b:
            java.lang.Object r2 = r2.f172b     // Catch: java.lang.Throwable -> L10
            goto L55
        L9e:
            ac.d r2 = (ac.d) r2     // Catch: java.lang.Throwable -> L10
            double r4 = r2.f168b     // Catch: java.lang.Throwable -> L10
            java.lang.Double r5 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Throwable -> L10
            goto Lca
        La7:
            ac.g r2 = (ac.g) r2     // Catch: java.lang.Throwable -> L10
            long r4 = r2.f171b     // Catch: java.lang.Throwable -> L10
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L10
            goto Lca
        Lb0:
            ac.e r2 = (ac.e) r2     // Catch: java.lang.Throwable -> L10
            float r2 = r2.f169b     // Catch: java.lang.Throwable -> L10
            java.lang.Float r5 = java.lang.Float.valueOf(r2)     // Catch: java.lang.Throwable -> L10
            goto Lca
        Lb9:
            ac.f r2 = (ac.f) r2     // Catch: java.lang.Throwable -> L10
            int r2 = r2.f170b     // Catch: java.lang.Throwable -> L10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L10
            goto Lca
        Lc2:
            ac.c r2 = (ac.c) r2     // Catch: java.lang.Throwable -> L10
            boolean r2 = r2.f167b     // Catch: java.lang.Throwable -> L10
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L10
        Lca:
            if (r5 == 0) goto L28
            r1.put(r3, r5)     // Catch: java.lang.Throwable -> L10
            goto L28
        Ld1:
            monitor-exit(r9)
            return r1
        Ld3:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    @Override // android.content.SharedPreferences
    public final synchronized boolean getBoolean(java.lang.String r2, boolean r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap r0 = r1.f196f     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L12
            ac.b r2 = (ac.b) r2     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto Lc
            goto L10
        Lc:
            boolean r3 = r2.b()     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r1)
            return r3
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    @Override // android.content.SharedPreferences
    public final synchronized float getFloat(java.lang.String r2, float r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap r0 = r1.f196f     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L12
            ac.b r2 = (ac.b) r2     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto Lc
            goto L10
        Lc:
            float r3 = r2.c()     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r1)
            return r3
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    @Override // android.content.SharedPreferences
    public final synchronized int getInt(java.lang.String r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap r0 = r1.f196f     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L12
            ac.b r2 = (ac.b) r2     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto Lc
            goto L10
        Lc:
            int r3 = r2.d()     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r1)
            return r3
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    @Override // android.content.SharedPreferences
    public final synchronized long getLong(java.lang.String r2, long r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap r0 = r1.f196f     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L12
            ac.b r2 = (ac.b) r2     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto Lc
            goto L10
        Lc:
            long r3 = r2.e()     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r1)
            return r3
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    @Override // android.content.SharedPreferences
    public final synchronized java.lang.String getString(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.HashMap r0 = r3.f196f     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L2f
            ac.b r0 = (ac.b) r0     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto Ld
            monitor-exit(r3)
            return r5
        Ld:
            byte r1 = r0.a()     // Catch: java.lang.Throwable -> L2f
            r2 = 6
            if (r1 != r2) goto L36
            r1 = r0
            ac.i r1 = (ac.i) r1     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r1.f175e     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L36
            java.lang.String r0 = f8.i.J(r3, r1)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L31
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L28
            goto L31
        L28:
            r1.f172b = r0     // Catch: java.lang.Throwable -> L2f
            r4 = 0
            r1.f175e = r4     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r3)
            return r0
        L2f:
            r4 = move-exception
            goto L3c
        L31:
            r3.remove(r4)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r3)
            return r5
        L36:
            java.lang.String r4 = r0.f()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r3)
            return r4
        L3c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r4
    }

    @Override // android.content.SharedPreferences
    public final java.util.Set getStringSet(java.lang.String r1, java.util.Set r2) {
            r0 = this;
            monitor-enter(r0)
            java.lang.Object r1 = r0.e(r1)     // Catch: java.lang.Throwable -> Lc
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            if (r1 == 0) goto Lb
            return r1
        Lb:
            return r2
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    public final synchronized void h(java.lang.String r9, java.lang.Object r10, ac.s r11) {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.f202l     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L7
            monitor-exit(r8)
            return
        L7:
            b(r9)     // Catch: java.lang.Throwable -> L89
            if (r11 == 0) goto L95
            java.lang.String r11 = "StringSet"
            java.util.HashMap r0 = r8.f193c     // Catch: java.lang.Throwable -> L89
            boolean r0 = r0.containsKey(r11)     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L8c
            if (r10 != 0) goto L22
            r8.remove(r9)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r8)
            return
        L1d:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L9e
        L22:
            r1 = 0
            byte[] r0 = ac.s.b(r10)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L28
            goto L31
        L28:
            r0 = move-exception
            java.lang.String r2 = "FastKV"
            java.lang.String r3 = r8.f192b     // Catch: java.lang.Throwable -> L89
            android.util.Log.e(r2, r3, r0)     // Catch: java.lang.Throwable -> L89
            r0 = r1
        L31:
            if (r0 != 0) goto L38
            r8.remove(r9)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r8)
            return
        L38:
            java.util.HashMap r2 = r8.f196f     // Catch: java.lang.Throwable -> L89
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.Throwable -> L89
            ac.b r2 = (ac.b) r2     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L4e
            byte r3 = r2.a()     // Catch: java.lang.Throwable -> L1d
            r4 = 8
            if (r3 == r4) goto L4e
            r8.remove(r9)     // Catch: java.lang.Throwable -> L1d
            goto L4f
        L4e:
            r1 = r2
        L4f:
            r6 = r1
            ac.h r6 = (ac.h) r6     // Catch: java.lang.Throwable -> L89
            int r1 = ac.k.x(r11)     // Catch: java.lang.Throwable -> L89
            ac.k r2 = new ac.k     // Catch: java.lang.Throwable -> L89
            int r3 = r1 + 1
            int r4 = r0.length     // Catch: java.lang.Throwable -> L89
            int r3 = r3 + r4
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L89
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L89
            java.lang.Object r3 = r2.f179j     // Catch: java.lang.Throwable -> L89
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L89
            r4 = 1
            r2.f177h = r4     // Catch: java.lang.Throwable -> L89
            r4 = 0
            r3[r4] = r1     // Catch: java.lang.Throwable -> L89
            r2.G(r11)     // Catch: java.lang.Throwable -> L89
            r2.C(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.Object r11 = r2.f179j     // Catch: java.lang.Throwable -> L89
            r5 = r11
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Throwable -> L89
            if (r5 != 0) goto L79
            monitor-exit(r8)
            return
        L79:
            r7 = 8
            r2 = r8
            r3 = r9
            r4 = r10
            r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L86
            r8.f(r3)     // Catch: java.lang.Throwable -> L86
            monitor-exit(r8)
            return
        L86:
            r0 = move-exception
        L87:
            r9 = r0
            goto L9e
        L89:
            r0 = move-exception
            r2 = r8
            goto L87
        L8c:
            r2 = r8
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L86
            java.lang.String r10 = "Encoder hasn't been registered"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L86
            throw r9     // Catch: java.lang.Throwable -> L86
        L95:
            r2 = r8
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L86
            java.lang.String r10 = "Encoder is null"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L86
            throw r9     // Catch: java.lang.Throwable -> L86
        L9e:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L86
            throw r9
    }

    public final void i(byte r9, int r10, int r11) {
            r8 = this;
            int r0 = r8.f204n
            int r1 = r11 - r10
            int r1 = r1 + r0
            r8.f204n = r1
            ac.r r0 = new ac.r
            r0.<init>()
            r0.f219g = r10
            r0.f220h = r11
            java.util.ArrayList r11 = r8.f205o
            r11.add(r0)
            r9 = r9 | (-128(0xffffffffffffff80, float:NaN))
            byte r9 = (byte) r9
            ac.k r11 = r8.f198h
            java.lang.Object r11 = r11.f179j
            byte[] r11 = (byte[]) r11
            r0 = r11[r10]
            r1 = r10 & 7
            int r1 = r1 << 3
            long r2 = r8.f195e
            r0 = r0 ^ r9
            long r4 = (long) r0
            r6 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r6
            long r0 = r4 << r1
            long r0 = r0 ^ r2
            r8.f195e = r0
            r11[r10] = r9
            r8.f212v = r10
            return
    }

    public final void j(java.nio.MappedByteBuffer r4) {
            r3 = this;
            r0 = 4
            long r1 = r3.f195e
            r4.putLong(r0, r1)
            int r0 = r3.f212v
            if (r0 == 0) goto L15
            ac.k r1 = r3.f198h
            java.lang.Object r1 = r1.f179j
            byte[] r1 = (byte[]) r1
            r1 = r1[r0]
            r4.put(r0, r1)
        L15:
            int r0 = r3.f200j
            if (r0 == 0) goto L2b
            int r0 = r3.f199i
            r4.position(r0)
            ac.k r0 = r3.f198h
            java.lang.Object r0 = r0.f179j
            byte[] r0 = (byte[]) r0
            int r1 = r3.f199i
            int r2 = r3.f200j
            r4.put(r0, r1, r2)
        L2b:
            return
    }

    public final void k(byte r5, int r6) {
            r4 = this;
            long r0 = r4.f195e
            r2 = 1
            long r2 = f8.i.H0(r6, r2)
            long r0 = r0 ^ r2
            r4.f195e = r0
            int r2 = r4.f213w
            r3 = 4
            if (r2 != 0) goto L27
            java.nio.MappedByteBuffer r2 = r4.f210t
            r2.putLong(r3, r0)
            java.nio.MappedByteBuffer r0 = r4.f210t
            r0.put(r6, r5)
            java.nio.MappedByteBuffer r0 = r4.f211u
            long r1 = r4.f195e
            r0.putLong(r3, r1)
            java.nio.MappedByteBuffer r0 = r4.f211u
            r0.put(r6, r5)
            goto L2c
        L27:
            ac.k r2 = r4.f198h
            r2.F(r3, r0)
        L2c:
            ac.k r0 = r4.f198h
            java.lang.Object r0 = r0.f179j
            byte[] r0 = (byte[]) r0
            r0[r6] = r5
            return
    }

    public final void l() {
            r5 = this;
            long r0 = r5.f195e
            ac.k r2 = r5.f198h
            int r3 = r5.f199i
            int r4 = r5.f200j
            long r2 = r2.m(r3, r4)
            long r0 = r0 ^ r2
            r5.f195e = r0
            int r0 = r5.f194d
            int r0 = r0 + (-12)
            int r1 = r5.f213w
            r2 = 0
            if (r1 != 0) goto L33
            java.nio.MappedByteBuffer r1 = r5.f210t
            r3 = -1
            r1.putInt(r2, r3)
            java.nio.MappedByteBuffer r1 = r5.f210t
            r5.j(r1)
            java.nio.MappedByteBuffer r1 = r5.f210t
            r1.putInt(r2, r0)
            java.nio.MappedByteBuffer r1 = r5.f211u
            r1.putInt(r2, r0)
            java.nio.MappedByteBuffer r0 = r5.f211u
            r5.j(r0)
            goto L40
        L33:
            ac.k r1 = r5.f198h
            r1.E(r2, r0)
            ac.k r0 = r5.f198h
            r1 = 4
            long r3 = r5.f195e
            r0.F(r1, r3)
        L40:
            r5.f212v = r2
            r5.f200j = r2
            return
    }

    public final void m(int r5, int r6, long r7) {
            r4 = this;
            long r0 = r4.f195e
            long r7 = f8.i.H0(r6, r7)
            long r7 = r7 ^ r0
            r4.f195e = r7
            int r0 = r4.f213w
            r1 = 4
            if (r0 != 0) goto L25
            java.nio.MappedByteBuffer r0 = r4.f210t
            r0.putLong(r1, r7)
            java.nio.MappedByteBuffer r7 = r4.f210t
            r7.putInt(r6, r5)
            java.nio.MappedByteBuffer r7 = r4.f211u
            long r2 = r4.f195e
            r7.putLong(r1, r2)
            java.nio.MappedByteBuffer r7 = r4.f211u
            r7.putInt(r6, r5)
            goto L2a
        L25:
            ac.k r0 = r4.f198h
            r0.F(r1, r7)
        L2a:
            ac.k r7 = r4.f198h
            r7.E(r6, r5)
            return
    }

    public final void n(long r5, long r7, int r9) {
            r4 = this;
            long r0 = r4.f195e
            long r7 = f8.i.H0(r9, r7)
            long r7 = r7 ^ r0
            r4.f195e = r7
            int r0 = r4.f213w
            r1 = 4
            if (r0 != 0) goto L25
            java.nio.MappedByteBuffer r0 = r4.f210t
            r0.putLong(r1, r7)
            java.nio.MappedByteBuffer r7 = r4.f210t
            r7.putLong(r9, r5)
            java.nio.MappedByteBuffer r7 = r4.f211u
            long r2 = r4.f195e
            r7.putLong(r1, r2)
            java.nio.MappedByteBuffer r7 = r4.f211u
            r7.putLong(r9, r5)
            goto L2a
        L25:
            ac.k r0 = r4.f198h
            r0.F(r1, r7)
        L2a:
            ac.k r7 = r4.f198h
            r7.F(r9, r5)
            return
    }

    public final int o(java.lang.String r7, byte[] r8, byte r9) {
            r6 = this;
            int r0 = r8.length
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            r1 = 8
            if (r0 == 0) goto L1e
            r2 = 6
            if (r9 == r2) goto L1c
            r2 = 7
            if (r9 == r2) goto L19
            if (r9 == r1) goto L16
            goto L1e
        L16:
            r9 = 11
            goto L1e
        L19:
            r9 = 10
            goto L1e
        L1c:
            r9 = 9
        L1e:
            r2 = 2
            if (r0 == 0) goto L23
            r3 = 4
            goto L24
        L23:
            r3 = r2
        L24:
            int r4 = r8.length
            int r3 = r3 + r4
            r6.p(r9, r3, r7)
            ac.k r7 = r6.f198h
            if (r0 == 0) goto L32
            int r9 = r8.length
            r7.D(r9)
            goto L49
        L32:
            int r9 = r8.length
            short r9 = (short) r9
            java.lang.Object r0 = r7.f179j
            byte[] r0 = (byte[]) r0
            int r3 = r7.f177h
            int r4 = r3 + 1
            r7.f177h = r4
            byte r5 = (byte) r9
            r0[r3] = r5
            int r3 = r3 + r2
            r7.f177h = r3
            int r7 = r9 >> 8
            byte r7 = (byte) r7
            r0[r4] = r7
        L49:
            ac.k r7 = r6.f198h
            int r9 = r7.f177h
            r7.C(r8)
            return r9
    }

    public final void p(byte r7, int r8, java.lang.String r9) {
            r6 = this;
            int r0 = ac.k.x(r9)
            r1 = 255(0xff, float:3.57E-43)
            if (r0 > r1) goto Lb0
            int r1 = r0 + 2
            int r1 = r1 + r8
            r6.f200j = r1
            ac.k r8 = r6.f198h
            java.lang.Object r8 = r8.f179j
            byte[] r8 = (byte[]) r8
            int r8 = r8.length
            int r2 = r6.f194d
            int r2 = r2 + r1
            r3 = 0
            if (r2 < r8) goto L77
            int r4 = r6.f204n
            if (r4 <= r1) goto L26
            r5 = 8192(0x2000, float:1.148E-41)
            if (r4 <= r5) goto L26
            fb.v0.s(r6, r1)
            goto L77
        L26:
            int r8 = f8.i.G(r8, r2)
            byte[] r1 = new byte[r8]
            ac.k r2 = r6.f198h
            java.lang.Object r2 = r2.f179j
            byte[] r2 = (byte[]) r2
            int r4 = r6.f194d
            java.lang.System.arraycopy(r2, r3, r1, r3, r4)
            ac.k r2 = r6.f198h
            r2.f179j = r1
            int r1 = r6.f213w
            if (r1 != 0) goto L77
            java.nio.channels.FileChannel r1 = r6.f208r
            java.nio.MappedByteBuffer r1 = f8.i.v0(r1, r8)
            java.nio.channels.FileChannel r2 = r6.f209s
            java.nio.MappedByteBuffer r8 = f8.i.v0(r2, r8)
            if (r1 == 0) goto L55
            if (r8 != 0) goto L50
            goto L55
        L50:
            r6.f210t = r1
            r6.f211u = r8
            goto L77
        L55:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r1 = "map failed"
            r8.<init>(r1)
            java.lang.String r1 = "FastKV"
            java.lang.String r2 = r6.f192b
            android.util.Log.e(r1, r2, r8)
            int r8 = r6.f194d
            int r8 = r8 + (-12)
            ac.k r1 = r6.f198h
            r1.E(r3, r8)
            ac.k r8 = r6.f198h
            r1 = 4
            long r4 = r6.f195e
            r8.F(r1, r4)
            f8.i.J0(r6)
        L77:
            int r8 = r6.f194d
            r6.f199i = r8
            int r1 = r6.f200j
            int r1 = r1 + r8
            r6.f194d = r1
            ac.k r1 = r6.f198h
            java.lang.Object r2 = r1.f179j
            byte[] r2 = (byte[]) r2
            int r4 = r8 + 1
            r1.f177h = r4
            r2[r8] = r7
            byte r7 = (byte) r0
            int r8 = r8 + 2
            r1.f177h = r8
            r2[r4] = r7
            int r7 = r9.length()
            ac.k r8 = r6.f198h
            if (r0 != r7) goto Lac
            java.lang.Object r7 = r8.f179j
            byte[] r7 = (byte[]) r7
            int r8 = r8.f177h
            r9.getBytes(r3, r0, r7, r8)
            ac.k r7 = r6.f198h
            int r8 = r7.f177h
            int r8 = r8 + r0
            r7.f177h = r8
            goto Laf
        Lac:
            r8.G(r9)
        Laf:
            return
        Lb0:
            java.lang.String r7 = "key's length must less than 256"
            j8.o.t(r7)
            return
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized android.content.SharedPreferences.Editor putBoolean(java.lang.String r6, boolean r7) {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f202l     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return r5
        L7:
            b(r6)     // Catch: java.lang.Throwable -> L20
            java.util.HashMap r0 = r5.f196f     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L20
            ac.b r0 = (ac.b) r0     // Catch: java.lang.Throwable -> L20
            r1 = 1
            if (r0 == 0) goto L22
            byte r2 = r0.a()     // Catch: java.lang.Throwable -> L20
            if (r2 == r1) goto L22
            r5.remove(r6)     // Catch: java.lang.Throwable -> L20
            r0 = 0
            goto L22
        L20:
            r6 = move-exception
            goto L5e
        L22:
            ac.c r0 = (ac.c) r0     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L4d
            int[] r0 = ac.o.f190z     // Catch: java.lang.Throwable -> L20
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L20
            r5.p(r1, r0, r6)     // Catch: java.lang.Throwable -> L20
            ac.k r0 = r5.f198h     // Catch: java.lang.Throwable -> L20
            int r1 = r0.f177h     // Catch: java.lang.Throwable -> L20
            byte r2 = (byte) r7     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r0.f179j     // Catch: java.lang.Throwable -> L20
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L20
            int r4 = r1 + 1
            r0.f177h = r4     // Catch: java.lang.Throwable -> L20
            r3[r1] = r2     // Catch: java.lang.Throwable -> L20
            r5.l()     // Catch: java.lang.Throwable -> L20
            java.util.HashMap r0 = r5.f196f     // Catch: java.lang.Throwable -> L20
            ac.c r2 = new ac.c     // Catch: java.lang.Throwable -> L20
            r2.<init>(r1, r7)     // Catch: java.lang.Throwable -> L20
            r0.put(r6, r2)     // Catch: java.lang.Throwable -> L20
            r5.f(r6)     // Catch: java.lang.Throwable -> L20
            goto L5c
        L4d:
            boolean r1 = r0.f167b     // Catch: java.lang.Throwable -> L20
            if (r1 == r7) goto L5c
            r0.f167b = r7     // Catch: java.lang.Throwable -> L20
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L20
            int r0 = r0.f166a     // Catch: java.lang.Throwable -> L20
            r5.k(r7, r0)     // Catch: java.lang.Throwable -> L20
            r5.f(r6)     // Catch: java.lang.Throwable -> L20
        L5c:
            monitor-exit(r5)
            return r5
        L5e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L20
            throw r6
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized android.content.SharedPreferences.Editor putFloat(java.lang.String r9, float r10) {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.f202l     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L7
            monitor-exit(r8)
            return r8
        L7:
            b(r9)     // Catch: java.lang.Throwable -> L20
            java.util.HashMap r0 = r8.f196f     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L20
            ac.b r0 = (ac.b) r0     // Catch: java.lang.Throwable -> L20
            r1 = 3
            if (r0 == 0) goto L22
            byte r2 = r0.a()     // Catch: java.lang.Throwable -> L20
            if (r2 == r1) goto L22
            r8.remove(r9)     // Catch: java.lang.Throwable -> L20
            r0 = 0
            goto L22
        L20:
            r9 = move-exception
            goto L8a
        L22:
            ac.e r0 = (ac.e) r0     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L49
            int[] r0 = ac.o.f190z     // Catch: java.lang.Throwable -> L20
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L20
            r8.p(r1, r0, r9)     // Catch: java.lang.Throwable -> L20
            ac.k r0 = r8.f198h     // Catch: java.lang.Throwable -> L20
            int r1 = r0.f177h     // Catch: java.lang.Throwable -> L20
            int r2 = java.lang.Float.floatToRawIntBits(r10)     // Catch: java.lang.Throwable -> L20
            r0.D(r2)     // Catch: java.lang.Throwable -> L20
            r8.l()     // Catch: java.lang.Throwable -> L20
            java.util.HashMap r0 = r8.f196f     // Catch: java.lang.Throwable -> L20
            ac.e r2 = new ac.e     // Catch: java.lang.Throwable -> L20
            r2.<init>(r1, r10)     // Catch: java.lang.Throwable -> L20
            r0.put(r9, r2)     // Catch: java.lang.Throwable -> L20
            r8.f(r9)     // Catch: java.lang.Throwable -> L20
            goto L88
        L49:
            float r1 = r0.f169b     // Catch: java.lang.Throwable -> L20
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 == 0) goto L88
            int r1 = java.lang.Float.floatToRawIntBits(r10)     // Catch: java.lang.Throwable -> L20
            ac.k r2 = r8.f198h     // Catch: java.lang.Throwable -> L20
            int r3 = r0.f166a     // Catch: java.lang.Throwable -> L20
            java.lang.Object r2 = r2.f179j     // Catch: java.lang.Throwable -> L20
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> L20
            int r4 = r3 + 1
            r5 = r2[r3]     // Catch: java.lang.Throwable -> L20
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r6 = r3 + 2
            r4 = r2[r4]     // Catch: java.lang.Throwable -> L20
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r4 = r4 | r5
            int r5 = r3 + 3
            r6 = r2[r6]     // Catch: java.lang.Throwable -> L20
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r4 = r4 | r6
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L20
            int r2 = r2 << 24
            r2 = r2 | r4
            r2 = r2 ^ r1
            long r4 = (long) r2     // Catch: java.lang.Throwable -> L20
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            r0.f169b = r10     // Catch: java.lang.Throwable -> L20
            r8.m(r1, r3, r4)     // Catch: java.lang.Throwable -> L20
            r8.f(r9)     // Catch: java.lang.Throwable -> L20
        L88:
            monitor-exit(r8)
            return r8
        L8a:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L20
            throw r9
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized android.content.SharedPreferences.Editor putInt(java.lang.String r6, int r7) {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f202l     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return r5
        L7:
            b(r6)     // Catch: java.lang.Throwable -> L20
            java.util.HashMap r0 = r5.f196f     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L20
            ac.b r0 = (ac.b) r0     // Catch: java.lang.Throwable -> L20
            r1 = 2
            if (r0 == 0) goto L22
            byte r2 = r0.a()     // Catch: java.lang.Throwable -> L20
            if (r2 == r1) goto L22
            r5.remove(r6)     // Catch: java.lang.Throwable -> L20
            r0 = 0
            goto L22
        L20:
            r6 = move-exception
            goto L5d
        L22:
            ac.f r0 = (ac.f) r0     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L45
            int[] r0 = ac.o.f190z     // Catch: java.lang.Throwable -> L20
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L20
            r5.p(r1, r0, r6)     // Catch: java.lang.Throwable -> L20
            ac.k r0 = r5.f198h     // Catch: java.lang.Throwable -> L20
            int r1 = r0.f177h     // Catch: java.lang.Throwable -> L20
            r0.D(r7)     // Catch: java.lang.Throwable -> L20
            r5.l()     // Catch: java.lang.Throwable -> L20
            java.util.HashMap r0 = r5.f196f     // Catch: java.lang.Throwable -> L20
            ac.f r2 = new ac.f     // Catch: java.lang.Throwable -> L20
            r2.<init>(r1, r7)     // Catch: java.lang.Throwable -> L20
            r0.put(r6, r2)     // Catch: java.lang.Throwable -> L20
            r5.f(r6)     // Catch: java.lang.Throwable -> L20
            goto L5b
        L45:
            int r1 = r0.f170b     // Catch: java.lang.Throwable -> L20
            if (r1 == r7) goto L5b
            r1 = r1 ^ r7
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L20
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r0.f170b = r7     // Catch: java.lang.Throwable -> L20
            int r0 = r0.f166a     // Catch: java.lang.Throwable -> L20
            r5.m(r7, r0, r1)     // Catch: java.lang.Throwable -> L20
            r5.f(r6)     // Catch: java.lang.Throwable -> L20
        L5b:
            monitor-exit(r5)
            return r5
        L5d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L20
            throw r6
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized android.content.SharedPreferences.Editor putLong(java.lang.String r11, long r12) {
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.f202l     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L7
            monitor-exit(r10)
            return r10
        L7:
            b(r11)     // Catch: java.lang.Throwable -> L66
            java.util.HashMap r0 = r10.f196f     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.Throwable -> L66
            ac.b r0 = (ac.b) r0     // Catch: java.lang.Throwable -> L66
            r1 = 4
            if (r0 == 0) goto L24
            byte r2 = r0.a()     // Catch: java.lang.Throwable -> L20
            if (r2 == r1) goto L24
            r10.remove(r11)     // Catch: java.lang.Throwable -> L20
            r0 = 0
            goto L24
        L20:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L6b
        L24:
            ac.g r0 = (ac.g) r0     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L4e
            int[] r0 = ac.o.f190z     // Catch: java.lang.Throwable -> L20
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L20
            r10.p(r1, r0, r11)     // Catch: java.lang.Throwable -> L20
            ac.k r0 = r10.f198h     // Catch: java.lang.Throwable -> L20
            int r1 = r0.f177h     // Catch: java.lang.Throwable -> L20
            r0.F(r1, r12)     // Catch: java.lang.Throwable -> L20
            int r2 = r0.f177h     // Catch: java.lang.Throwable -> L20
            int r2 = r2 + 8
            r0.f177h = r2     // Catch: java.lang.Throwable -> L20
            r10.l()     // Catch: java.lang.Throwable -> L20
            java.util.HashMap r0 = r10.f196f     // Catch: java.lang.Throwable -> L20
            ac.g r2 = new ac.g     // Catch: java.lang.Throwable -> L20
            r2.<init>(r1, r12)     // Catch: java.lang.Throwable -> L20
            r0.put(r11, r2)     // Catch: java.lang.Throwable -> L20
            r10.f(r11)     // Catch: java.lang.Throwable -> L20
        L4c:
            r4 = r10
            goto L69
        L4e:
            long r1 = r0.f171b     // Catch: java.lang.Throwable -> L66
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 == 0) goto L4c
            long r7 = r12 ^ r1
            r0.f171b = r12     // Catch: java.lang.Throwable -> L66
            int r9 = r0.f166a     // Catch: java.lang.Throwable -> L66
            r4 = r10
            r5 = r12
            r4.n(r5, r7, r9)     // Catch: java.lang.Throwable -> L63
            r10.f(r11)     // Catch: java.lang.Throwable -> L63
            goto L69
        L63:
            r0 = move-exception
        L64:
            r11 = r0
            goto L6b
        L66:
            r0 = move-exception
            r4 = r10
            goto L64
        L69:
            monitor-exit(r10)
            return r4
        L6b:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L63
            throw r11
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized android.content.SharedPreferences.Editor putString(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f202l     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L7
            monitor-exit(r7)
            return r7
        L7:
            b(r8)     // Catch: java.lang.Throwable -> L6f
            if (r9 != 0) goto L15
            r7.remove(r8)     // Catch: java.lang.Throwable -> L11
            r1 = r7
            goto L6a
        L11:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L72
        L15:
            java.util.HashMap r0 = r7.f196f     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L6f
            ac.b r0 = (ac.b) r0     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L2a
            byte r1 = r0.a()     // Catch: java.lang.Throwable -> L11
            r2 = 6
            if (r1 == r2) goto L2a
            r7.remove(r8)     // Catch: java.lang.Throwable -> L11
            r0 = 0
        L2a:
            r5 = r0
            ac.i r5 = (ac.i) r5     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto L3d
            boolean r0 = r5.f175e     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L3d
            java.lang.Object r0 = r5.f172b     // Catch: java.lang.Throwable -> L11
            boolean r0 = r9.equals(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L3d
            monitor-exit(r7)
            return r7
        L3d:
            boolean r0 = r9.isEmpty()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L47
            byte[] r0 = ac.o.f189y     // Catch: java.lang.Throwable -> L11
        L45:
            r4 = r0
            goto L4e
        L47:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L6f
            byte[] r0 = r9.getBytes(r0)     // Catch: java.lang.Throwable -> L6f
            goto L45
        L4e:
            if (r4 != 0) goto L60
            java.lang.Exception r8 = new java.lang.Exception     // Catch: java.lang.Throwable -> L11
            java.lang.String r9 = "Encrypt failed"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L11
            java.lang.String r9 = "FastKV"
            java.lang.String r0 = r7.f192b     // Catch: java.lang.Throwable -> L11
            android.util.Log.e(r9, r0, r8)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r7)
            return r7
        L60:
            r6 = 6
            r1 = r7
            r2 = r8
            r3 = r9
            r1.a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6c
            r7.f(r2)     // Catch: java.lang.Throwable -> L6c
        L6a:
            monitor-exit(r7)
            return r1
        L6c:
            r0 = move-exception
        L6d:
            r8 = r0
            goto L72
        L6f:
            r0 = move-exception
            r1 = r7
            goto L6d
        L72:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6c
            throw r8
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized android.content.SharedPreferences.Editor putStringSet(java.lang.String r2, java.util.Set r3) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f202l     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return r1
        L7:
            if (r3 != 0) goto Lf
            r1.remove(r2)     // Catch: java.lang.Throwable -> Ld
            goto L14
        Ld:
            r2 = move-exception
            goto L16
        Lf:
            ac.s r0 = ac.s.f221a     // Catch: java.lang.Throwable -> Ld
            r1.h(r2, r3, r0)     // Catch: java.lang.Throwable -> Ld
        L14:
            monitor-exit(r1)
            return r1
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    @Override // android.content.SharedPreferences
    public final synchronized void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r2) {
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L5
            monitor-exit(r1)
            return
        L5:
            java.util.ArrayList r0 = r1.f206p     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L15
            java.util.ArrayList r0 = r1.f206p     // Catch: java.lang.Throwable -> L13
            r0.add(r2)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r1)
            return
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized android.content.SharedPreferences.Editor remove(java.lang.String r7) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f202l     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L7
            monitor-exit(r6)
            return r6
        L7:
            java.util.HashMap r0 = r6.f196f     // Catch: java.lang.Throwable -> L31
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L31
            ac.b r0 = (ac.b) r0     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto Laf
            java.util.HashMap r1 = r6.f196f     // Catch: java.lang.Throwable -> L31
            r1.remove(r7)     // Catch: java.lang.Throwable -> L31
            byte r1 = r0.a()     // Catch: java.lang.Throwable -> L31
            r2 = 5
            r3 = 0
            if (r1 > r2) goto L34
            int r7 = ac.k.x(r7)     // Catch: java.lang.Throwable -> L31
            int r0 = r0.f166a     // Catch: java.lang.Throwable -> L31
            int r7 = r7 + 2
            int r7 = r0 - r7
            int[] r2 = ac.o.f190z     // Catch: java.lang.Throwable -> L31
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L31
            int r0 = r0 + r2
            r6.i(r1, r7, r0)     // Catch: java.lang.Throwable -> L31
            goto L49
        L31:
            r7 = move-exception
            goto Lb1
        L34:
            ac.j r0 = (ac.j) r0     // Catch: java.lang.Throwable -> L31
            int r7 = r0.f173c     // Catch: java.lang.Throwable -> L31
            int r2 = r0.f166a     // Catch: java.lang.Throwable -> L31
            int r4 = r0.f174d     // Catch: java.lang.Throwable -> L31
            int r2 = r2 + r4
            r6.i(r1, r7, r2)     // Catch: java.lang.Throwable -> L31
            boolean r7 = r0.f175e     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L49
            java.lang.Object r7 = r0.f172b     // Catch: java.lang.Throwable -> L31
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L31
        L49:
            r7 = r1 | (-128(0xffffffffffffff80, float:NaN))
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L31
            int r0 = r6.f213w     // Catch: java.lang.Throwable -> L31
            r1 = 4
            if (r0 != 0) goto L6e
            java.nio.MappedByteBuffer r0 = r6.f210t     // Catch: java.lang.Throwable -> L31
            long r4 = r6.f195e     // Catch: java.lang.Throwable -> L31
            r0.putLong(r1, r4)     // Catch: java.lang.Throwable -> L31
            java.nio.MappedByteBuffer r0 = r6.f210t     // Catch: java.lang.Throwable -> L31
            int r2 = r6.f212v     // Catch: java.lang.Throwable -> L31
            r0.put(r2, r7)     // Catch: java.lang.Throwable -> L31
            java.nio.MappedByteBuffer r0 = r6.f211u     // Catch: java.lang.Throwable -> L31
            long r4 = r6.f195e     // Catch: java.lang.Throwable -> L31
            r0.putLong(r1, r4)     // Catch: java.lang.Throwable -> L31
            java.nio.MappedByteBuffer r0 = r6.f211u     // Catch: java.lang.Throwable -> L31
            int r1 = r6.f212v     // Catch: java.lang.Throwable -> L31
            r0.put(r1, r7)     // Catch: java.lang.Throwable -> L31
            goto L75
        L6e:
            ac.k r7 = r6.f198h     // Catch: java.lang.Throwable -> L31
            long r4 = r6.f195e     // Catch: java.lang.Throwable -> L31
            r7.F(r1, r4)     // Catch: java.lang.Throwable -> L31
        L75:
            r7 = 0
            r6.f212v = r7     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L91
            int r0 = r6.f213w     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L8c
            java.util.concurrent.Executor r0 = ac.p.w()     // Catch: java.lang.Throwable -> L31
            a1.d r1 = new a1.d     // Catch: java.lang.Throwable -> L31
            r2 = 1
            r1.<init>(r6, r2, r3)     // Catch: java.lang.Throwable -> L31
            r0.execute(r1)     // Catch: java.lang.Throwable -> L31
            goto L91
        L8c:
            java.util.ArrayList r0 = r6.f201k     // Catch: java.lang.Throwable -> L31
            r0.add(r3)     // Catch: java.lang.Throwable -> L31
        L91:
            int r0 = r6.f204n     // Catch: java.lang.Throwable -> L31
            r1 = 8192(0x2000, float:1.148E-41)
            if (r0 >= r1) goto La1
            java.util.ArrayList r0 = r6.f205o     // Catch: java.lang.Throwable -> L31
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L31
            r1 = 100
            if (r0 < r1) goto La4
        La1:
            fb.v0.s(r6, r7)     // Catch: java.lang.Throwable -> L31
        La4:
            int r7 = r6.f213w     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto Laf
            boolean r7 = r6.f214x     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto Laf
            r6.d()     // Catch: java.lang.Throwable -> L31
        Laf:
            monitor-exit(r6)
            return r6
        Lb1:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L31
            throw r7
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FastKV: path:"
            r0.<init>(r1)
            java.lang.String r1 = r2.f191a
            r0.append(r1)
            java.lang.String r1 = " name:"
            r0.append(r1)
            java.lang.String r1 = r2.f192b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.content.SharedPreferences
    public final synchronized void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.ArrayList r0 = r1.f206p     // Catch: java.lang.Throwable -> L8
            r0.remove(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }
}
