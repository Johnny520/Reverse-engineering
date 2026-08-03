package a7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class c implements java.io.Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f61g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c7.f f62h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f63i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f64j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l7.l f65k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c7.e f66l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m7.a f67m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c7.e f68n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f69o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c7.a f70p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z7.c f71q;

    public c(java.lang.String r9, c7.f r10) {
            r8 = this;
            r8.<init>()
            r0 = 1
            r8.f63i = r0
            r1 = 0
            r8.f64j = r1
            r8.f61g = r9
            r8.f62h = r10
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            c7.e[] r10 = r10.c()
            int r2 = r10.length
            r3 = r1
        L1d:
            if (r3 >= r2) goto L5d
            r4 = r10[r3]
            int r5 = r4.f1038c
            r6 = 8
            if (r5 == r6) goto L5a
            java.lang.String r4 = r4.a()
            int r5 = r4.length()
            r6 = 0
            if (r5 != 0) goto L33
            goto L54
        L33:
            char r5 = java.io.File.separatorChar
            r7 = 47
            java.lang.String r4 = r4.replace(r5, r7)
            java.lang.String r4 = r4.trim()
        L3f:
            java.lang.String r5 = "/"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L4c
            java.lang.String r4 = r4.substring(r0)
            goto L3f
        L4c:
            int r5 = r4.length()
            if (r5 != 0) goto L53
            goto L54
        L53:
            r6 = r4
        L54:
            if (r6 != 0) goto L57
            goto L5a
        L57:
            r9.add(r6)
        L5a:
            int r3 = r3 + 1
            goto L1d
        L5d:
            z7.c r9 = new z7.c
            r9.<init>(r1)
            r8.f71q = r9
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            return
    }

    public static boolean l(l7.l r2) {
            boolean r0 = r2 instanceof t7.a
            if (r0 == 0) goto L29
            t7.a r2 = (t7.a) r2
            java.lang.String r0 = "android"
            java.lang.String r1 = r2.b0()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L29
            int r0 = r2.f13082v
            if (r0 == 0) goto L17
            goto L25
        L17:
            l7.f r0 = r2.Z()
            if (r0 == 0) goto L23
            int r0 = r0.U()
            r2.f13082v = r0
        L23:
            int r0 = r2.f13082v
        L25:
            r2 = 1
            if (r0 != r2) goto L29
            return r2
        L29:
            r2 = 0
            return r2
    }

    public final void a() {
            r4 = this;
            l7.l r0 = r4.f65k
            if (r0 != 0) goto L5
            goto L56
        L5:
            m7.a r1 = r4.f67m
            if (r1 != 0) goto La
            goto L56
        La:
            l7.f r2 = r1.i()
            if (r2 == 0) goto L17
            l7.l r2 = r2.Y()
            if (r2 != r0) goto L17
            goto L56
        L17:
            int r2 = r1.Y()
            j7.b r3 = r0.f7886p
            z7.c r3 = r3.f9563k
            l7.f r2 = j7.b.k0(r3, r2)
            if (r2 != 0) goto L29
            l7.f r2 = r0.Z()
        L29:
            if (r2 == 0) goto L31
            k7.c r0 = r1.f8760k
            m7.g r0 = (m7.g) r0
            r0.f8747r = r2
        L31:
            r1.f8742m = r4
            boolean r0 = r4.f64j
            if (r0 == 0) goto L38
            goto L56
        L38:
            l7.l r0 = r4.f65k
            if (r0 == 0) goto L56
            boolean r1 = r0 instanceof t7.a
            if (r1 != 0) goto L56
            boolean r1 = l(r0)
            if (r1 == 0) goto L47
            goto L56
        L47:
            m7.a r1 = r4.f67m
            if (r1 == 0) goto L56
            z7.c r1 = r0.f7887q
            int r1 = r1.f22586i
            if (r1 == 0) goto L52
            goto L56
        L52:
            r1 = 0
            r4.k(r0, r1)     // Catch: java.io.IOException -> L56
        L56:
            return
    }

    public final java.lang.Integer b() {
            r6 = this;
            m7.a r0 = r6.f67m
            r1 = 0
            if (r0 != 0) goto L11
            c7.f r0 = r6.f62h
            java.lang.String r2 = "AndroidManifest.xml"
            c7.e r0 = r0.b(r2)
            if (r0 == 0) goto L10
            goto L11
        L10:
            return r1
        L11:
            m7.a r0 = r6.c()
            r2 = 16844146(0x1010572, float:2.3697465E-38)
            java.lang.Integer r2 = r0.V(r2)
            v7.k0 r3 = v7.k0.f14171n
            java.lang.String r4 = "manifest"
            if (r2 != 0) goto L41
            m7.j r2 = r0.O(r4)
            if (r2 != 0) goto L2a
        L28:
            r2 = r1
            goto L41
        L2a:
            java.lang.String r5 = "platformBuildVersionCode"
            m7.c r2 = r2.W(r5)
            if (r2 == 0) goto L28
            v7.k0 r5 = r2.T()
            if (r5 == r3) goto L39
            goto L28
        L39:
            int r2 = r2.O()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L41:
            m7.j r0 = r0.O(r4)
            if (r0 != 0) goto L48
            goto L69
        L48:
            java.lang.String r4 = "uses-sdk"
            m7.j r0 = r0.O(r4)
            if (r0 != 0) goto L51
            goto L69
        L51:
            r4 = 16843376(0x1010270, float:2.3695307E-38)
            m7.c r0 = r0.X(r4)
            if (r0 == 0) goto L69
            v7.k0 r4 = r0.T()
            if (r4 == r3) goto L61
            goto L69
        L61:
            int r0 = r0.O()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L69:
            if (r2 != 0) goto L6c
            goto L78
        L6c:
            if (r1 == 0) goto L79
            int r0 = r1.intValue()
            int r3 = r2.intValue()
            if (r0 <= r3) goto L79
        L78:
            return r1
        L79:
            return r2
    }

    public final m7.a c() {
            r6 = this;
            m7.a r0 = r6.f67m
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "AndroidManifest.xml"
            c7.f r1 = r6.f62h
            c7.e r0 = r1.b(r0)
            if (r0 != 0) goto L11
            r0 = 0
            return r0
        L11:
            c7.e r2 = r6.f68n
            if (r2 != 0) goto L1b
            boolean r2 = r0 instanceof c7.d
            if (r2 != 0) goto L1b
            r6.f68n = r0
        L1b:
            java.io.InputStream r2 = r0.b()     // Catch: java.io.IOException -> L62
            m7.a r3 = new m7.a     // Catch: java.io.IOException -> L62
            r3.<init>()     // Catch: java.io.IOException -> L62
            k7.c r4 = r3.f8760k     // Catch: java.io.IOException -> L62
            m7.g r4 = (m7.g) r4     // Catch: java.io.IOException -> L62
            u7.a r4 = r4.f8744o     // Catch: java.io.IOException -> L62
            p7.a r4 = r4.f7869m     // Catch: java.io.IOException -> L62
            p7.i r4 = (p7.i) r4     // Catch: java.io.IOException -> L62
            r5 = 0
            r4.T(r5)     // Catch: java.io.IOException -> L62
            q7.b r4 = new q7.b     // Catch: java.io.IOException -> L62
            r4.<init>(r2)     // Catch: java.io.IOException -> L62
            r3.G(r4)     // Catch: java.io.IOException -> L62
            r2.close()     // Catch: java.io.IOException -> L62
            r6.f67m = r3     // Catch: java.io.IOException -> L62
            c7.d r2 = new c7.d     // Catch: java.io.IOException -> L62
            java.lang.String r4 = r0.f1036a     // Catch: java.io.IOException -> L62
            r2.<init>(r4, r3)     // Catch: java.io.IOException -> L62
            if (r0 == r2) goto L56
            int r4 = r0.f1039d     // Catch: java.io.IOException -> L62
            r2.f1039d = r4     // Catch: java.io.IOException -> L62
            int r4 = r0.f1038c     // Catch: java.io.IOException -> L62
            r2.f1038c = r4     // Catch: java.io.IOException -> L62
            java.lang.String r0 = r0.a()     // Catch: java.io.IOException -> L62
            r2.f1037b = r0     // Catch: java.io.IOException -> L62
        L56:
            r1.a(r2)     // Catch: java.io.IOException -> L62
            r6.a()     // Catch: java.io.IOException -> L62
            r6.q(r3)     // Catch: java.io.IOException -> L62
            m7.a r0 = r6.f67m
            return r0
        L62:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            c7.a r0 = r1.f70p
            if (r0 == 0) goto L7
            r0.close()
        L7:
            return
    }

    public l7.l e() {
            r1 = this;
            l7.l r0 = r1.f65k
            return r0
    }

    public l7.l g() {
            r4 = this;
            l7.l r0 = r4.f65k
            if (r0 == 0) goto L5
            return r0
        L5:
            boolean r0 = r4.f64j
            r1 = 1
            if (r0 != 0) goto L13
            z7.c r0 = r4.f71q
            int r0 = r0.f22586i
            if (r0 != 0) goto L11
            goto L13
        L11:
            r4.f64j = r1
        L13:
            boolean r0 = r4.f64j
            if (r0 != 0) goto L3a
            m7.a r0 = r4.c()
            if (r0 != 0) goto L1e
            goto L3a
        L1e:
            java.lang.Boolean r2 = r0.Z()
            if (r2 == 0) goto L3a
            java.lang.String r2 = "android"
            java.lang.String r3 = r0.X()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L31
            goto L3a
        L31:
            int r0 = r0.Y()
            if (r0 == r1) goto L38
            goto L3a
        L38:
            r4.f64j = r1
        L3a:
            boolean r0 = r4.f64j
            r0 = r0 ^ r1
            l7.l r0 = r4.h(r0)
            return r0
    }

    public final l7.l h(boolean r5) {
            r4 = this;
            l7.l r0 = r4.f65k
            if (r0 != 0) goto L51
            boolean r0 = r4.i()
            if (r0 != 0) goto Lc
            r5 = 0
            return r5
        Lc:
            l7.l r0 = r4.o()     // Catch: java.io.IOException -> L20
            r4.f65k = r0     // Catch: java.io.IOException -> L20
            if (r5 == 0) goto L22
            boolean r5 = r4.f63i     // Catch: java.io.IOException -> L20
            if (r5 == 0) goto L22
            java.lang.Integer r5 = r4.b()     // Catch: java.io.IOException -> L20
            r4.k(r0, r5)     // Catch: java.io.IOException -> L20
            goto L22
        L20:
            r5 = move-exception
            goto L4b
        L22:
            l7.l r5 = r4.f65k     // Catch: java.io.IOException -> L20
            if (r5 != 0) goto L27
            goto L47
        L27:
            z7.c r1 = r4.f71q     // Catch: java.io.IOException -> L20
            java.util.Iterator r1 = r1.iterator()     // Catch: java.io.IOException -> L20
        L2d:
            boolean r2 = r1.hasNext()     // Catch: java.io.IOException -> L20
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()     // Catch: java.io.IOException -> L20
            l7.l r2 = (l7.l) r2     // Catch: java.io.IOException -> L20
            if (r2 == 0) goto L2d
            boolean r3 = r5.U(r2)     // Catch: java.io.IOException -> L20
            if (r3 != 0) goto L2d
            z7.c r3 = r5.f7887q     // Catch: java.io.IOException -> L20
            r3.add(r2)     // Catch: java.io.IOException -> L20
            goto L2d
        L47:
            r4.a()
            return r0
        L4b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L51:
            return r0
    }

    public final boolean i() {
            r2 = this;
            l7.l r0 = r2.f65k
            if (r0 != 0) goto L11
            c7.f r0 = r2.f62h
            java.lang.String r1 = "resources.arsc"
            c7.e r0 = r0.b(r1)
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    public final void k(l7.l r8, java.lang.Integer r9) {
            r7 = this;
            boolean r0 = r7.f64j
            if (r0 != 0) goto L169
            if (r8 == 0) goto L169
            boolean r0 = l(r8)
            if (r0 == 0) goto Le
            goto L169
        Le:
            z7.c r0 = new z7.c
            r1 = 0
            r0.<init>(r1)
            boolean r2 = r7.i()
            if (r2 != 0) goto L1b
            goto L24
        L1b:
            l7.l r2 = r7.h(r1)
            z7.c r2 = r2.f7887q
            r0.addAll(r2)
        L24:
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r0.next()
            l7.l r2 = (l7.l) r2
            boolean r3 = r2 instanceof t7.a
            if (r3 != 0) goto L39
            goto L28
        L39:
            t7.a r2 = (t7.a) r2
            boolean r3 = l(r2)
            if (r3 != 0) goto L42
            goto L28
        L42:
            if (r9 == 0) goto L52
            int r3 = r2.c0()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L28
        L52:
            a7.c r0 = r2.f7888r
            a7.d r0 = (a7.d) r0
            goto L58
        L57:
            r0 = 0
        L58:
            if (r0 == 0) goto L5c
            goto L169
        L5c:
            if (r9 != 0) goto Lc3
            java.lang.Class<a7.a> r0 = a7.a.class
            monitor-enter(r0)
            b7.a r9 = a7.a.f59a     // Catch: java.lang.Throwable -> L6a
            if (r9 != 0) goto L6c
            b7.a r9 = b7.a.f501c     // Catch: java.lang.Throwable -> L6a
            a7.a.f59a = r9     // Catch: java.lang.Throwable -> L6a
            goto L6c
        L6a:
            r8 = move-exception
            goto Lc1
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.Class<a7.a> r2 = a7.a.class
            monitor-enter(r2)
            java.util.Map r0 = r9.b()     // Catch: java.lang.Throwable -> La4
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> La4
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> La4
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La4
        L7e:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> La4
            if (r3 == 0) goto L95
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> La4
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> La4
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> La4
            if (r1 != 0) goto L92
        L90:
            r1 = r3
            goto L7e
        L92:
            if (r3 <= r1) goto L7e
            goto L90
        L95:
            a7.d r0 = r9.a()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto La6
            int r3 = r0.u()     // Catch: java.lang.Throwable -> La4
            if (r1 != r3) goto La6
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La4
            goto L142
        La4:
            r8 = move-exception
            goto Lbf
        La6:
            a7.d r1 = r9.c(r1)     // Catch: java.lang.Throwable -> La4 java.io.IOException -> Lb8
            if (r0 != 0) goto Lb4
            monitor-enter(r9)     // Catch: java.lang.Throwable -> La4
            r9.f502a = r1     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lb1
            goto Lb4
        Lb1:
            r8 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lb1
            throw r8     // Catch: java.lang.Throwable -> La4
        Lb4:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La4
            r0 = r1
            goto L142
        Lb8:
            r8 = move-exception
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> La4
            r9.<init>(r8)     // Catch: java.lang.Throwable -> La4
            throw r9     // Catch: java.lang.Throwable -> La4
        Lbf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La4
            throw r8
        Lc1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            throw r8
        Lc3:
            int r9 = r9.intValue()
            java.lang.Class<a7.a> r0 = a7.a.class
            monitor-enter(r0)
            b7.a r1 = a7.a.f59a     // Catch: java.lang.Throwable -> Ld3
            if (r1 != 0) goto Ld6
            b7.a r1 = b7.a.f501c     // Catch: java.lang.Throwable -> Ld3
            a7.a.f59a = r1     // Catch: java.lang.Throwable -> Ld3
            goto Ld6
        Ld3:
            r8 = move-exception
            goto L167
        Ld6:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld3
            java.util.Map r0 = r1.b()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto Lec
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L125
        Lec:
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
            r4 = r3
        Lf7:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L121
            java.lang.Object r5 = r0.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r3 != 0) goto L110
            int r2 = r9 * 2
            int r4 = r2 + 1000
            r2 = r5
            r3 = r2
            goto Lf7
        L110:
            if (r5 <= r3) goto L113
            r3 = r5
        L113:
            int r6 = r5 - r9
            if (r6 >= 0) goto L118
            int r6 = -r6
        L118:
            if (r6 < r4) goto L11e
            if (r6 != r4) goto Lf7
            if (r5 <= r2) goto Lf7
        L11e:
            r2 = r5
            r4 = r6
            goto Lf7
        L121:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
        L125:
            java.lang.Class<a7.a> r2 = a7.a.class
            monitor-enter(r2)
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L13a
            a7.d r0 = r1.a()     // Catch: java.lang.Throwable -> L13a
            if (r0 == 0) goto L13c
            int r3 = r0.u()     // Catch: java.lang.Throwable -> L13a
            if (r9 != r3) goto L13c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13a
            goto L142
        L13a:
            r8 = move-exception
            goto L165
        L13c:
            a7.d r9 = r1.c(r9)     // Catch: java.lang.Throwable -> L13a java.io.IOException -> L15e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13a
            r0 = r9
        L142:
            t7.a r9 = r0.t()
            if (r9 == 0) goto L153
            boolean r1 = r8.U(r9)
            if (r1 != 0) goto L153
            z7.c r8 = r8.f7887q
            r8.add(r9)
        L153:
            r0.s()
            java.lang.String r8 = r0.f74t
            if (r8 != 0) goto L169
            r0.w()
            return
        L15e:
            r8 = move-exception
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L13a
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L13a
            throw r9     // Catch: java.lang.Throwable -> L13a
        L165:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13a
            throw r8
        L167:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld3
            throw r8
        L169:
            return
    }

    public final m7.f m(java.lang.String r7) {
            r6 = this;
            c7.f r0 = r6.f62h
            c7.e r0 = r0.b(r7)
            if (r0 == 0) goto L89
            boolean r7 = r0 instanceof c7.d
            r1 = 0
            if (r7 == 0) goto L23
            r7 = r0
            c7.d r7 = (c7.d) r7
            k7.a r7 = r7.f1035e
            boolean r2 = r7 instanceof k7.e
            if (r2 == 0) goto L1c
            r2 = r7
            k7.e r2 = (k7.e) r2
            r2.c()
        L1c:
            boolean r2 = r7 instanceof m7.f
            if (r2 == 0) goto L23
            m7.f r7 = (m7.f) r7
            goto L24
        L23:
            r7 = r1
        L24:
            if (r7 != 0) goto L37
            m7.f r7 = new m7.f
            r7.<init>()
            java.io.InputStream r2 = r0.b()
            q7.b r3 = new q7.b
            r3.<init>(r2)
            r7.G(r3)
        L37:
            r7.f8742m = r6
            l7.f r2 = r7.i()
            if (r2 != 0) goto L88
            java.lang.String r0 = r0.a()
            l7.l r2 = r6.g()
            if (r2 != 0) goto L4a
            goto L82
        L4a:
            j7.b r3 = r2.f7886p
            z7.c r4 = r3.f9563k
            int r4 = r4.size()
            r5 = 1
            if (r4 != r5) goto L5e
            r0 = 0
            k7.a r0 = r3.Q(r0)
            r1 = r0
            l7.f r1 = (l7.f) r1
            goto L82
        L5e:
            u7.b r3 = r2.f7885o
            l7.d r4 = new l7.d
            r3.U()
            f1.h r3 = r3.f13533r
            java.util.Iterator r0 = r3.o(r0)
            r3 = 3
            r4.<init>(r0, r3)
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L76
            goto L7a
        L76:
            java.lang.Object r1 = r4.next()
        L7a:
            l7.f r1 = (l7.f) r1
            if (r1 != 0) goto L82
            l7.f r1 = r2.Z()
        L82:
            k7.c r0 = r7.f8760k
            m7.g r0 = (m7.g) r0
            r0.f8747r = r1
        L88:
            return r7
        L89:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "No such file in apk: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
    }

    public l7.l o() {
            r5 = this;
            c7.f r0 = r5.f62h
            java.lang.String r1 = "resources.arsc"
            c7.e r1 = r0.b(r1)
            if (r1 == 0) goto L5a
            boolean r2 = r1 instanceof c7.d
            if (r2 == 0) goto L20
            r2 = r1
            c7.d r2 = (c7.d) r2
            k7.a r2 = r2.f1035e
            boolean r3 = r2 instanceof k7.e
            if (r3 == 0) goto L1d
            r3 = r2
            k7.e r3 = (k7.e) r3
            r3.c()
        L1d:
            l7.l r2 = (l7.l) r2
            goto L3d
        L20:
            c7.e r3 = r5.f66l
            if (r3 != 0) goto L28
            if (r2 != 0) goto L28
            r5.f66l = r1
        L28:
            java.io.InputStream r2 = r1.b()
            l7.l r3 = new l7.l
            r3.<init>()
            q7.b r4 = new q7.b
            r4.<init>(r2)
            r3.G(r4)
            r2.close()
            r2 = r3
        L3d:
            c7.d r3 = new c7.d
            java.lang.String r4 = r1.f1036a
            r3.<init>(r4, r2)
            if (r1 == r3) goto L54
            int r4 = r1.f1039d
            r3.f1039d = r4
            int r4 = r1.f1038c
            r3.f1038c = r4
            java.lang.String r1 = r1.a()
            r3.f1037b = r1
        L54:
            r0.a(r3)
            r2.f7888r = r5
            return r2
        L5a:
            java.lang.String r0 = "Entry not found: resources.arsc"
            j8.o.y(r0)
            r0 = 0
            return r0
    }

    public final void q(m7.a r5) {
            r4 = this;
            int r0 = r4.f69o
            if (r0 == 0) goto L6
            goto L99
        L6:
            java.lang.String r0 = "manifest"
            m7.j r1 = r5.O(r0)
            if (r1 != 0) goto Lf
            goto L1a
        Lf:
            java.lang.String r2 = "split"
            m7.c r1 = r1.W(r2)
            if (r1 == 0) goto L1a
            r5 = 2
            goto L95
        L1a:
            java.lang.Boolean r1 = r5.Z()
            if (r1 == 0) goto L29
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L29
            r5 = 3
            goto L95
        L29:
            java.lang.String r1 = "activity"
            java.lang.String r2 = "application"
            java.lang.String[] r1 = new java.lang.String[]{r0, r2, r1}
            java.util.Iterator r1 = r5.P(r1)
            java.lang.String r3 = "activity-alias"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2, r3}
            java.util.Iterator r5 = r5.P(r0)
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto L47
            r1 = r5
            goto L54
        L47:
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L4e
            goto L54
        L4e:
            z7.f r0 = new z7.f
            r0.<init>(r1, r5)
            r1 = r0
        L54:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r1.next()
            m7.j r5 = (m7.j) r5
            java.lang.String r0 = "intent-filter"
            java.lang.String r2 = "action"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}
            java.util.Iterator r0 = r5.P(r0)
        L6c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r0.next()
            m7.j r2 = (m7.j) r2
            r3 = 16842755(0x1010003, float:2.3693566E-38)
            m7.c r2 = r2.X(r3)
            if (r2 != 0) goto L82
            goto L6c
        L82:
            java.lang.String r3 = "android.intent.action.MAIN"
            java.lang.String r2 = r2.S()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L6c
            goto L90
        L8f:
            r5 = 0
        L90:
            if (r5 == 0) goto L94
            r5 = 1
            goto L95
        L94:
            r5 = 0
        L95:
            if (r5 == 0) goto L99
            r4.f69o = r5
        L99:
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f61g
            return r0
    }
}
