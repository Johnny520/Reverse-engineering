package bc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements java.io.Closeable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final mh.b f737s = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bc.g f738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te.a f739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m.a f741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ud.u f742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.util.ArrayList f743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bc.q f744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ue.a f749r;

    static {
            java.lang.Class<bc.k> r0 = bc.k.class
            mh.b r0 = mh.d.b(r0)
            bc.k.f737s = r0
            return
    }

    public k(bc.g r5) {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f740i = r0
            xe.f r0 = new xe.f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f745n = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f746o = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.f747p = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f748q = r0
            ue.a r0 = new ue.a
            r0.<init>()
            r4.f749r = r0
            r4.f738g = r5
            te.a r0 = new te.a
            r0.<init>(r4)
            r4.f739h = r0
            bc.q r0 = new bc.q
            r0.<init>(r4)
            r4.f744m = r0
            m.a r0 = new m.a
            ad.c r5 = r5.K
            b.e r1 = new b.e
            java.lang.Class<nf.d> r2 = nf.d.class
            java.util.EnumSet r2 = java.util.EnumSet.noneOf(r2)
            r3 = 29
            r1.<init>(r5, r3, r2)
            r5 = 7
            r0.<init>(r1, r5)
            r4.f741j = r0
            return
    }

    public static void a(java.util.ArrayList r5) {
            java.util.Iterator r0 = r5.iterator()     // Catch: java.lang.Throwable -> L14
        L4:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L14
            java.io.Closeable r1 = (java.io.Closeable) r1     // Catch: java.lang.Throwable -> L14
            r1.close()     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
            goto L4
        L14:
            r0 = move-exception
            goto L23
        L16:
            r2 = move-exception
            mh.b r3 = bc.k.f737s     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "Fail to close '{}'"
            r3.s(r1, r4, r2)     // Catch: java.lang.Throwable -> L14
            goto L4
        L1f:
            r5.clear()
            return
        L23:
            r5.clear()
            throw r0
    }

    public final synchronized bc.l b(ud.e r3) {
            r2 = this;
            monitor-enter(r2)
            bc.l r0 = r3.E     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L20
            boolean r0 = r3.d0()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            bc.l r0 = new bc.l     // Catch: java.lang.Throwable -> L17
            ud.e r1 = r3.f13701x     // Catch: java.lang.Throwable -> L17
            bc.l r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L17
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L17
            goto L1e
        L17:
            r3 = move-exception
            goto L22
        L19:
            bc.l r0 = new bc.l     // Catch: java.lang.Throwable -> L17
            r0.<init>(r3, r2)     // Catch: java.lang.Throwable -> L17
        L1e:
            r3.E = r0     // Catch: java.lang.Throwable -> L17
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    public final synchronized bc.n c(ud.r r3) {
            r2 = this;
            monitor-enter(r2)
            bc.n r0 = r3.I     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            bc.n r0 = new bc.n     // Catch: java.lang.Throwable -> L12
            ud.e r1 = r3.f13718l     // Catch: java.lang.Throwable -> L12
            r2.b(r1)     // Catch: java.lang.Throwable -> L12
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L12
            r3.I = r0     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r3 = move-exception
            goto L16
        L14:
            monitor-exit(r2)
            return r0
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r6 = this;
            r6.g()
            java.util.ArrayList r0 = r6.f740i
            a(r0)
            java.util.ArrayList r0 = r6.f745n
            a(r0)
            java.util.ArrayList r0 = r6.f746o
            a(r0)
            java.util.ArrayList r0 = r6.f748q
            a(r0)
            bc.g r0 = r6.f738g
            ve.b r1 = r0.J
            r1.getClass()
            java.lang.String r1 = "tmp"
            java.nio.file.Path r2 = ve.a.f14312a
            java.nio.file.Path r1 = r2.resolve(r1)
            mh.b r2 = bf.b.f857a
            if (r1 == 0) goto L31
            java.io.File r2 = r1.toFile()
            bf.b.c(r2)
        L31:
            r2 = 0
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r2]
            boolean r3 = java.nio.file.Files.exists(r1, r3)
            if (r3 == 0) goto L4a
            bf.b.b(r1, r2)     // Catch: java.lang.Exception -> L3e
            goto L4a
        L3e:
            r3 = move-exception
            mh.b r4 = bf.b.f857a
            java.lang.String r5 = "Failed to delete dir: {}"
            java.nio.file.Path r1 = r1.toAbsolutePath()
            r4.n(r1, r5, r3)
        L4a:
            r0.close()
            java.nio.file.Path r0 = bf.b.f858b
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r2]
            boolean r0 = java.nio.file.Files.isDirectory(r0, r1)
            if (r0 == 0) goto L6f
            java.nio.file.Path r0 = bf.b.f858b
            r1 = 1
            bf.b.b(r0, r1)     // Catch: java.lang.Exception -> L5e
            goto L6f
        L5e:
            r1 = move-exception
            af.g r2 = new af.g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "Failed to clear directory "
            java.lang.String r0 = r3.concat(r0)
            r2.<init>(r0, r1)
            throw r2
        L6f:
            return
    }

    public final void e() {
            r17 = this;
            r1 = r17
            r1.g()
            mh.b r0 = bc.h.f732a
            bc.g r2 = r1.f738g
            java.util.ArrayList r3 = r2.f712g
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L22
            java.util.ArrayList r4 = r1.f745n
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L1a
            goto L22
        L1a:
            af.d r0 = new af.d
            java.lang.String r2 = "Please specify input file"
            r0.<init>(r2)
            throw r0
        L22:
            java.util.Iterator r3 = r3.iterator()
        L26:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L49
            java.lang.Object r4 = r3.next()
            java.io.File r4 = (java.io.File) r4
            boolean r5 = r4.exists()
            if (r5 == 0) goto L39
            goto L26
        L39:
            af.d r0 = new af.d
            java.lang.String r2 = r4.getAbsolutePath()
            java.lang.String r3 = "File not found "
            java.lang.String r2 = wb.en.g(r3, r2)
            r0.<init>(r2)
            throw r0
        L49:
            java.io.File r3 = r2.f713h
            java.io.File r4 = r2.f714i
            java.io.File r5 = r2.f715j
            r6 = 46
            r7 = 0
            if (r3 != 0) goto L8f
            if (r4 == 0) goto L58
            r8 = r4
            goto L8d
        L58:
            if (r5 == 0) goto L5c
            r8 = r5
            goto L8d
        L5c:
            java.util.ArrayList r3 = r2.f712g
            boolean r8 = r3.isEmpty()
            if (r8 == 0) goto L67
            java.lang.String r3 = "jadx-output"
            goto L83
        L67:
            java.lang.Object r3 = r3.get(r7)
            java.io.File r3 = (java.io.File) r3
            java.lang.String r3 = r3.getName()
            int r8 = r3.lastIndexOf(r6)
            r9 = -1
            if (r8 == r9) goto L7d
            java.lang.String r3 = r3.substring(r7, r8)
            goto L83
        L7d:
            java.lang.String r8 = "-jadx-output"
            java.lang.String r3 = r3.concat(r8)
        L83:
            java.lang.String r8 = "output directory: {}"
            r0.a(r3, r8)
            java.io.File r8 = new java.io.File
            r8.<init>(r3)
        L8d:
            r2.f713h = r8
        L8f:
            if (r4 != 0) goto L9c
            java.io.File r3 = new java.io.File
            java.io.File r4 = r2.f713h
            java.lang.String r8 = "sources"
            r3.<init>(r4, r8)
            r2.f714i = r3
        L9c:
            if (r5 != 0) goto La9
            java.io.File r3 = new java.io.File
            java.io.File r4 = r2.f713h
            java.lang.String r5 = "resources"
            r3.<init>(r4, r5)
            r2.f715j = r3
        La9:
            java.io.File r3 = r2.f713h
            java.lang.String r4 = "Output"
            bc.h.a(r3, r4)
            java.io.File r3 = r2.f714i
            java.lang.String r4 = "Source output"
            bc.h.a(r3, r4)
            java.io.File r3 = r2.f715j
            java.lang.String r4 = "Resources output"
            bc.h.a(r3, r4)
            boolean r3 = r0.d()
            if (r3 == 0) goto Lc9
            java.lang.String r3 = "Effective jadx args: {}"
            r0.x(r2, r3)
        Lc9:
            mh.b r0 = bc.k.f737s
            r0.b()
            bc.g r0 = r1.f738g
            ve.b r0 = r0.J
            r0.getClass()
            java.lang.String r0 = "tmp"
            java.nio.file.Path r2 = ve.a.f14312a
            java.nio.file.Path r0 = r2.resolve(r0)
            mh.b r2 = bf.b.f857a
            if (r0 == 0) goto Le8
            java.io.File r2 = r0.toFile()
            bf.b.c(r2)
        Le8:
            java.lang.Class<bf.b> r2 = bf.b.class
            monitor-enter(r2)
            if (r0 == 0) goto Lf4
            java.io.File r3 = r0.toFile()     // Catch: java.lang.Throwable -> L751 java.lang.Exception -> L753
            bf.b.c(r3)     // Catch: java.lang.Throwable -> L751 java.lang.Exception -> L753
        Lf4:
            java.lang.String r3 = "jadx-instance-"
            java.nio.file.attribute.FileAttribute[] r4 = new java.nio.file.attribute.FileAttribute[r7]     // Catch: java.lang.Throwable -> L751 java.lang.Exception -> L753
            java.nio.file.Path r0 = java.nio.file.Files.createTempDirectory(r0, r3, r4)     // Catch: java.lang.Throwable -> L751 java.lang.Exception -> L753
            bf.b.f858b = r0     // Catch: java.lang.Throwable -> L751 java.lang.Exception -> L753
            java.io.File r0 = r0.toFile()     // Catch: java.lang.Throwable -> L751 java.lang.Exception -> L753
            r0.deleteOnExit()     // Catch: java.lang.Throwable -> L751 java.lang.Exception -> L753
            monitor-exit(r2)
            te.a r0 = r1.f739h
            java.lang.String r2 = "java-input"
            bc.g r3 = r1.f738g
            r3.getClass()
            java.lang.String r3 = "java-input"
            java.util.TreeMap r0 = r0.f13127e
            r0.put(r2, r3)
            te.a r3 = r1.f739h
            bc.g r0 = r1.f738g
            uc.b r0 = r0.O
            java.util.TreeSet r2 = r3.f13125c
            r2.clear()
            we.a r2 = new we.a
            java.lang.String r2 = dd.a.b()
            java.lang.String r4 = "r"
            r2.startsWith(r4)
            java.lang.String r4 = "dev"
            r2.equals(r4)
            java.util.List r0 = r0.j()
            java.util.Iterator r0 = r0.iterator()
        L139:
            boolean r2 = r0.hasNext()
            r4 = 20
            if (r2 == 0) goto L191
            java.lang.Object r2 = r0.next()
            ff.c r2 = (ff.c) r2
            te.b r5 = new te.b
            bc.k r8 = r3.f13123a
            r5.<init>(r8, r2)
            java.util.HashSet r2 = r3.f13124b
            r5.a()
            java.lang.String r8 = "dex-input"
            boolean r2 = r2.contains(r8)
            if (r2 == 0) goto L15c
            goto L139
        L15c:
            a2.a r2 = r5.f13131i
            r2.getClass()
            mh.b r2 = te.a.f13122g
            java.lang.String r8 = "Loading plugin: {}"
            r2.x(r5, r8)
            java.util.TreeSet r2 = r3.f13125c
            boolean r2 = r2.add(r5)
            if (r2 == 0) goto L17b
            java.util.ArrayList r2 = r3.f13128f
            ae.g r8 = new ae.g
            r8.<init>(r5, r4)
            r2.forEach(r8)
            goto L139
        L17b:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.Class<ff.c> r2 = ff.c.class
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Duplicate plugin id: "
            java.lang.String r4 = ", class "
            java.lang.String r0 = bc.e.j(r3, r0, r4, r2)
            j8.o.t(r0)
            return
        L191:
            monitor-enter(r3)
            java.util.TreeSet r0 = r3.f13125c     // Catch: java.lang.Throwable -> L74e
            java.util.stream.Stream r0 = r0.stream()     // Catch: java.lang.Throwable -> L74e
            me.a r2 = new me.a     // Catch: java.lang.Throwable -> L74e
            r5 = 13
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L74e
            java.util.stream.Collector r2 = java.util.stream.Collectors.groupingBy(r2)     // Catch: java.lang.Throwable -> L74e
            java.lang.Object r0 = r0.collect(r2)     // Catch: java.lang.Throwable -> L74e
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L74e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L74e
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L74e
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L74e
            be.f0 r5 = new be.f0     // Catch: java.lang.Throwable -> L74e
            r8 = 3
            r5.<init>(r3, r8, r2)     // Catch: java.lang.Throwable -> L74e
            r0.forEach(r5)     // Catch: java.lang.Throwable -> L74e
            java.util.TreeSet r0 = r3.f13126d     // Catch: java.lang.Throwable -> L74e
            r0.clear()     // Catch: java.lang.Throwable -> L74e
            java.util.TreeSet r0 = r3.f13126d     // Catch: java.lang.Throwable -> L74e
            r0.addAll(r2)     // Catch: java.lang.Throwable -> L74e
            monitor-exit(r3)
            mh.b r0 = bc.k.f737s
            boolean r2 = r0.d()
            if (r2 == 0) goto L1d7
            java.lang.String r2 = "Resolved plugins: {}"
            te.a r3 = r1.f739h
            java.util.TreeSet r3 = r3.f13126d
            r0.x(r3, r2)
        L1d7:
            te.a r0 = r1.f739h
            java.util.TreeSet r2 = r0.f13126d
            java.lang.String r3 = "dex-input"
            l3.w r5 = new l3.w
            r9 = 28
            r5.<init>(r9)
            bc.k r0 = r0.f13123a
            bc.g r0 = r0.f738g
            ve.b r0 = r0.J
            java.util.Iterator r9 = r2.iterator()
        L1ee:
            boolean r0 = r9.hasNext()
            r10 = 1
            if (r0 == 0) goto L258
            java.lang.Object r0 = r9.next()
            r11 = r0
            te.b r11 = (te.b) r11
            l3.w r0 = r11.f13133k     // Catch: java.lang.Exception -> L203
            if (r0 != 0) goto L205
            r11.f13133k = r5     // Catch: java.lang.Exception -> L203
            goto L205
        L203:
            r0 = move-exception
            goto L24b
        L205:
            java.lang.Thread r12 = java.lang.Thread.currentThread()     // Catch: java.lang.Exception -> L203
            java.lang.ClassLoader r13 = r12.getContextClassLoader()     // Catch: java.lang.Exception -> L203
            java.lang.ClassLoader r0 = r11.f13132j     // Catch: java.lang.Exception -> L203
            r12.setContextClassLoader(r0)     // Catch: java.lang.Exception -> L203
            ff.c r0 = r11.f13130h     // Catch: java.lang.Throwable -> L246
            fd.h r14 = r0.f3928a     // Catch: java.lang.Throwable -> L246
            bc.k r15 = r11.f13129g     // Catch: java.lang.Throwable -> L246
            java.util.Objects.requireNonNull(r14)     // Catch: java.lang.Exception -> L23a java.lang.Throwable -> L246
            r11.f13135m = r14     // Catch: java.lang.Exception -> L23a java.lang.Throwable -> L246
            bc.g r4 = r15.f738g     // Catch: java.lang.Exception -> L23a java.lang.Throwable -> L246
            java.util.HashMap r4 = r4.M     // Catch: java.lang.Exception -> L23a java.lang.Throwable -> L246
            r14.c(r4)     // Catch: java.lang.Exception -> L23a java.lang.Throwable -> L246
            ff.b r4 = new ff.b     // Catch: java.lang.Throwable -> L246
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L246
            java.util.ArrayList r14 = r11.f13134l     // Catch: java.lang.Throwable -> L246
            r14.add(r4)     // Catch: java.lang.Throwable -> L246
            ff.a r0 = r0.f3929b     // Catch: java.lang.Throwable -> L246
            m.a r4 = r15.f741j     // Catch: java.lang.Throwable -> L246
            r0.f3926b = r4     // Catch: java.lang.Throwable -> L246
            r11.f13136n = r10     // Catch: java.lang.Throwable -> L246
            r12.setContextClassLoader(r13)     // Catch: java.lang.Exception -> L203
            goto L255
        L23a:
            r0 = move-exception
            af.g r4 = new af.g     // Catch: java.lang.Throwable -> L246
            r11.a()     // Catch: java.lang.Throwable -> L246
            java.lang.String r10 = "Failed to apply options for plugin: dex-input"
            r4.<init>(r10, r0)     // Catch: java.lang.Throwable -> L246
            throw r4     // Catch: java.lang.Throwable -> L246
        L246:
            r0 = move-exception
            r12.setContextClassLoader(r13)     // Catch: java.lang.Exception -> L203
            throw r0     // Catch: java.lang.Exception -> L203
        L24b:
            mh.b r4 = te.a.f13122g
            java.lang.String r10 = "Failed to init plugin: {}"
            r11.a()
            r4.n(r3, r10, r0)
        L255:
            r4 = 20
            goto L1ee
        L258:
            java.util.Iterator r0 = r2.iterator()
        L25c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L28a
            java.lang.Object r2 = r0.next()
            te.b r2 = (te.b) r2
            fd.h r3 = r2.f13135m
            if (r3 == 0) goto L25c
            r2.a()
            java.lang.Object r2 = r3.f3919h
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            if (r2 == 0) goto L284
            ae.e r3 = new ae.e
            r4 = 27
            r3.<init>(r4)
            r2.forEach(r3)
            goto L25c
        L284:
            java.lang.String r0 = "Null option descriptions in plugin id: dex-input"
            j8.o.t(r0)
            return
        L28a:
            mh.b r2 = bc.k.f737s
            boolean r0 = r2.d()
            r3 = 5
            if (r0 == 0) goto L2c7
            java.util.HashMap r0 = r1.f747p
            java.util.Collection r0 = r0.values()
            java.util.stream.Stream r0 = r0.stream()
            ae.d r4 = new ae.d
            r5 = 4
            r4.<init>(r5)
            java.util.stream.Stream r0 = r0.flatMap(r4)
            ae.d r4 = new ae.d
            r4.<init>(r3)
            java.util.stream.Stream r0 = r0.map(r4)
            java.util.stream.Collector r4 = java.util.stream.Collectors.toList()
            java.lang.Object r0 = r0.collect(r4)
            java.util.List r0 = (java.util.List) r0
            java.lang.String r4 = "Loaded custom passes: {} {}"
            int r5 = r0.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.y(r5, r4, r0)
        L2c7:
            java.util.ArrayList r4 = r1.f740i
            r4.clear()
            bc.g r0 = r1.f738g
            java.util.ArrayList r0 = r0.f712g
            ae.d r5 = new ae.d
            r9 = 6
            r5.<init>(r9)
            java.util.List r0 = xe.s.c(r0, r5)
            mh.b r5 = bf.b.f857a
            java.util.ArrayList r5 = new java.util.ArrayList
            int r9 = r0.size()
            r5.<init>(r9)
            java.util.Iterator r9 = r0.iterator()
        L2e9:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L33a
            java.lang.Object r0 = r9.next()
            r11 = r0
            java.nio.file.Path r11 = (java.nio.file.Path) r11
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r7]
            boolean r0 = java.nio.file.Files.isDirectory(r11, r0)
            if (r0 == 0) goto L336
            java.nio.file.FileVisitOption r0 = java.nio.file.FileVisitOption.FOLLOW_LINKS     // Catch: java.lang.Exception -> L31f
            java.nio.file.FileVisitOption[] r0 = new java.nio.file.FileVisitOption[]{r0}     // Catch: java.lang.Exception -> L31f
            java.util.stream.Stream r12 = java.nio.file.Files.walk(r11, r0)     // Catch: java.lang.Exception -> L31f
            a7.b r0 = new a7.b     // Catch: java.lang.Throwable -> L321
            r13 = 21
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L321
            java.util.stream.Stream r0 = r12.filter(r0)     // Catch: java.lang.Throwable -> L321
            be.m0 r13 = new be.m0     // Catch: java.lang.Throwable -> L321
            r13.<init>(r10, r5)     // Catch: java.lang.Throwable -> L321
            r0.forEach(r13)     // Catch: java.lang.Throwable -> L321
            r12.close()     // Catch: java.lang.Exception -> L31f
            goto L2e9
        L31f:
            r0 = move-exception
            goto L32e
        L321:
            r0 = move-exception
            r13 = r0
            if (r12 == 0) goto L32d
            r12.close()     // Catch: java.lang.Throwable -> L329
            goto L32d
        L329:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch: java.lang.Exception -> L31f
        L32d:
            throw r13     // Catch: java.lang.Exception -> L31f
        L32e:
            mh.b r12 = bf.b.f857a
            java.lang.String r13 = "Failed to list files in directory: {}"
            r12.n(r11, r13, r0)
            goto L2e9
        L336:
            r5.add(r11)
            goto L2e9
        L33a:
            long r11 = java.lang.System.currentTimeMillis()
            te.a r0 = r1.f739h
            java.util.TreeSet r0 = r0.f13126d
            java.util.Iterator r9 = r0.iterator()
        L346:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L37a
            java.lang.Object r0 = r9.next()
            r13 = r0
            te.b r13 = (te.b) r13
            java.util.ArrayList r0 = r13.f13134l
            java.util.Iterator r14 = r0.iterator()
        L359:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L346
            java.lang.Object r0 = r14.next()
            ff.b r0 = (ff.b) r0
            lc.a r0 = r0.a(r5)     // Catch: java.lang.Exception -> L373
            boolean r15 = r0.isEmpty()     // Catch: java.lang.Exception -> L373
            if (r15 != 0) goto L359
            r4.add(r0)     // Catch: java.lang.Exception -> L373
            goto L359
        L373:
            r0 = move-exception
            java.lang.String r15 = "Failed to load code for plugin: {}"
            r2.s(r13, r15, r0)
            goto L359
        L37a:
            java.util.ArrayList r0 = r1.f745n
            r4.addAll(r0)
            boolean r0 = r2.d()
            if (r0 == 0) goto L39b
            java.lang.String r0 = "Loaded using {} inputs plugin in {} ms"
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r11
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            r2.y(r4, r0, r5)
        L39b:
            ud.u r0 = new ud.u
            r0.<init>(r1)
            r1.f742k = r0
            bc.g r0 = r0.f13742a
            r0.getClass()
            java.util.EnumSet r2 = r0.D
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3b8
            kd.a r2 = r0.A
            r2.getClass()
            int r0 = r0.f730y
            r2.f7574e = r0
        L3b8:
            ud.u r0 = r1.f742k
            java.util.ArrayList r2 = r1.f740i
            r0.getClass()
            java.util.Iterator r2 = r2.iterator()
        L3c3:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3d8
            java.lang.Object r4 = r2.next()
            lc.a r4 = (lc.a) r4
            ud.t r5 = new ud.t
            r5.<init>(r0, r10)
            r4.n(r5)
            goto L3c3
        L3d8:
            ud.u r2 = r1.f742k
            bc.q r0 = r1.f744m
            monitor-enter(r17)
            java.util.ArrayList r4 = r1.f743l     // Catch: java.lang.Throwable -> L3e9
            if (r4 != 0) goto L3f4
            ud.u r4 = r1.f742k     // Catch: java.lang.Throwable -> L3e9
            if (r4 != 0) goto L3ec
            java.util.List r4 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L3e9
            monitor-exit(r17)
            goto L3f7
        L3e9:
            r0 = move-exception
            goto L74c
        L3ec:
            bc.q r5 = r1.f744m     // Catch: java.lang.Throwable -> L3e9
            java.util.ArrayList r4 = r5.b(r4)     // Catch: java.lang.Throwable -> L3e9
            r1.f743l = r4     // Catch: java.lang.Throwable -> L3e9
        L3f4:
            java.util.ArrayList r4 = r1.f743l     // Catch: java.lang.Throwable -> L3e9
            monitor-exit(r17)
        L3f7:
            r2.getClass()
            java.util.Iterator r5 = r4.iterator()
        L3fe:
            boolean r9 = r5.hasNext()
            r11 = 0
            if (r9 == 0) goto L412
            java.lang.Object r9 = r5.next()
            bc.o r9 = (bc.o) r9
            bc.p r12 = r9.f758b
            bc.p r13 = bc.p.f761i
            if (r12 != r13) goto L3fe
            goto L413
        L412:
            r9 = r11
        L413:
            if (r9 != 0) goto L41d
            mh.b r0 = ud.u.f13741v
            java.lang.String r2 = "'resources.arsc' or 'resources.pb' file not found"
            r0.l(r2)
            goto L457
        L41d:
            e9.a r5 = new e9.a     // Catch: java.lang.Exception -> L44c
            r12 = 10
            r5.<init>(r0, r12, r9)     // Catch: java.lang.Exception -> L44c
            java.lang.Object r0 = bc.q.a(r9, r5)     // Catch: java.lang.Exception -> L44c
            df.g r0 = (df.g) r0     // Catch: java.lang.Exception -> L44c
            if (r0 == 0) goto L457
            df.i r5 = r0.f2227e     // Catch: java.lang.Exception -> L44c
            r2.d(r5)     // Catch: java.lang.Exception -> L44c
            r2.k(r0, r4)     // Catch: java.lang.Exception -> L44c
            monitor-enter(r2)     // Catch: java.lang.Exception -> L44c
            df.c r4 = r2.f13762u     // Catch: java.lang.Throwable -> L445
            if (r4 != 0) goto L447
            df.c r4 = new df.c     // Catch: java.lang.Throwable -> L445
            bc.g r5 = r2.f13742a     // Catch: java.lang.Throwable -> L445
            ad.c r5 = r5.K     // Catch: java.lang.Throwable -> L445
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L445
            r2.f13762u = r4     // Catch: java.lang.Throwable -> L445
            goto L447
        L445:
            r0 = move-exception
            goto L44e
        L447:
            monitor-exit(r2)     // Catch: java.lang.Exception -> L44c
            r4.d(r0)     // Catch: java.lang.Exception -> L44c
            goto L457
        L44c:
            r0 = move-exception
            goto L450
        L44e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L445
            throw r0     // Catch: java.lang.Exception -> L44c
        L450:
            mh.b r2 = ud.u.f13741v
            java.lang.String r4 = "Failed to parse 'resources.pb'/'.arsc' file"
            r2.e(r4, r0)
        L457:
            ud.u r0 = r1.f742k
            java.util.ArrayList r2 = r0.f13757p
            java.util.ArrayList r4 = r0.f13755n
            int r4 = r4.size()
            java.util.HashMap r5 = r0.f13753l
            int r9 = r5.size()
            r12 = 15
            if (r4 == r9) goto L49a
            java.util.ArrayList r4 = r0.f13755n
            java.util.stream.Stream r4 = r4.stream()
            me.a r9 = new me.a
            r9.<init>(r12)
            java.util.stream.Collector r9 = java.util.stream.Collectors.groupingBy(r9)
            java.lang.Object r4 = r4.collect(r9)
            java.util.Map r4 = (java.util.Map) r4
            java.util.Set r4 = r4.entrySet()
            java.util.stream.Stream r4 = r4.stream()
            ud.b r9 = new ud.b
            r13 = 2
            r9.<init>(r13)
            java.util.stream.Stream r4 = r4.filter(r9)
            ud.t r9 = new ud.t
            r9.<init>(r0, r7)
            r4.forEach(r9)
        L49a:
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.Collection r5 = r5.values()
            r4.<init>(r5)
            r0.f13755n = r4
            java.util.stream.Stream r4 = r4.stream()
            ae.a r5 = new ae.a
            r9 = 14
            r5.<init>(r9)
            java.util.stream.IntStream r4 = r4.mapToInt(r5)
            int r4 = r4.sum()
            java.util.ArrayList r5 = r0.f13755n
            java.util.stream.Stream r5 = r5.stream()
            me.a r9 = new me.a
            r13 = 17
            r9.<init>(r13)
            java.util.stream.Stream r5 = r5.flatMap(r9)
            ae.a r9 = new ae.a
            r9.<init>(r12)
            java.util.stream.IntStream r5 = r5.mapToInt(r9)
            int r5 = r5.sum()
            mh.b r9 = ud.u.f13741v
            java.util.ArrayList r12 = r0.f13755n
            int r12 = r12.size()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r12, r4, r5}
            r9.z(r4)
            java.util.ArrayList r4 = r0.f13755n
            me.a r5 = new me.a
            r9 = 18
            r5.<init>(r9)
            java.util.Comparator r5 = java.util.Comparator.comparing(r5)
            r4.sort(r5)
            bc.g r4 = r0.f13742a
            boolean r4 = r4.f727v
            if (r4 == 0) goto L5fa
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = r0.f13755n
            java.util.Iterator r5 = r5.iterator()
        L512:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L52a
            java.lang.Object r9 = r5.next()
            ud.e r9 = (ud.e) r9
            od.a r12 = r9.f13690m
            boolean r12 = r12.o()
            if (r12 == 0) goto L512
            r4.add(r9)
            goto L512
        L52a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L533:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L5b1
            java.lang.Object r9 = r4.next()
            ud.e r9 = (ud.e) r9
            od.a r12 = r9.f13690m
            od.a r13 = r12.f9769k
            ud.e r14 = r0.f(r13)
            if (r14 != 0) goto L585
            if (r13 == 0) goto L585
            java.lang.String r13 = r13.f9768j
            int r15 = r13.lastIndexOf(r6)
            if (r15 <= 0) goto L585
            int r16 = r13.length()
            int r6 = r16 + (-1)
            if (r15 == r6) goto L585
            int r6 = r15 + 1
            java.lang.String r6 = r13.substring(r6)
            java.lang.String r13 = r13.substring(r7, r15)
            qd.j r13 = qd.j.x(r13)
            od.a r13 = od.a.e(r0, r13)
            ud.e r13 = r0.f(r13)
            if (r13 == 0) goto L585
            ud.r r6 = r13.n0(r6)
            if (r6 == 0) goto L585
            ud.u r6 = r13.f13688k
            qd.j r14 = r12.f9765g
            r12.r(r6, r14, r10)
            od.a r6 = r13.f13690m
            r12.f9769k = r6
            r14 = r13
        L585:
            if (r14 != 0) goto L598
            r5.add(r9)
            od.a r6 = r9.f13690m
            ud.u r12 = r9.f13688k
            qd.j r13 = r6.f9765g
            r6.r(r12, r13, r7)
            r6.f9769k = r11
            r9.f13701x = r9
            goto L5ae
        L598:
            java.util.List r6 = r14.f13699v
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L5a7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r3)
            r14.f13699v = r6
        L5a7:
            java.util.List r6 = r14.f13699v
            r6.add(r9)
            r9.f13701x = r14
        L5ae:
            r6 = 46
            goto L533
        L5b1:
            java.util.Iterator r3 = r5.iterator()
        L5b5:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5df
            java.lang.Object r4 = r3.next()
            ud.e r4 = (ud.e) r4
            java.util.List r4 = r4.f13699v
            java.util.Iterator r4 = r4.iterator()
        L5c7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5b5
            java.lang.Object r5 = r4.next()
            ud.e r5 = (ud.e) r5
            od.a r5 = r5.f13690m
            qd.j r6 = r5.f9765g
            boolean r7 = r5.o()
            r5.r(r0, r6, r7)
            goto L5c7
        L5df:
            java.util.Iterator r0 = r2.iterator()
        L5e3:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5fa
            java.lang.Object r3 = r0.next()
            ud.s r3 = (ud.s) r3
            java.util.ArrayList r3 = r3.f13737o
            ud.b r4 = new ud.b
            r4.<init>(r8)
            r3.removeIf(r4)
            goto L5e3
        L5fa:
            java.util.Collections.sort(r2)
            ud.u r0 = r1.f742k
            r0.getClass()
            ed.c r2 = r0.f13760s     // Catch: java.lang.Exception -> L615
            if (r2 != 0) goto L622
            ed.c r2 = new ed.c     // Catch: java.lang.Exception -> L615
            r2.<init>(r0)     // Catch: java.lang.Exception -> L615
            bc.g r3 = r0.f13742a     // Catch: java.lang.Exception -> L615
            boolean r3 = r3.P     // Catch: java.lang.Exception -> L615
            if (r3 == 0) goto L618
            r2.f()     // Catch: java.lang.Exception -> L615
            goto L618
        L615:
            r0 = move-exception
            goto L744
        L618:
            java.util.ArrayList r3 = r0.f13755n     // Catch: java.lang.Exception -> L615
            r2.a(r3)     // Catch: java.lang.Exception -> L615
            r2.e()     // Catch: java.lang.Exception -> L615
            r0.f13760s = r2     // Catch: java.lang.Exception -> L615
        L622:
            ud.u r0 = r1.f742k
            java.util.HashMap r2 = r1.f747p
            bc.g r3 = r0.f13742a
            bc.b r4 = r3.E
            bc.b r5 = bc.b.f705i
            if (r4 == r5) goto L685
            bc.b r5 = bc.b.f704h
            if (r4 != r5) goto L633
            goto L685
        L633:
            xe.l r4 = new xe.l
            java.util.ArrayList r5 = r0.f13758q
            r4.<init>(r5)
            xc.c r5 = xc.d.f21536a
            java.lang.Object r5 = r2.get(r5)
            java.util.List r5 = (java.util.List) r5
            me.a r6 = new me.a
            r7 = 19
            r6.<init>(r7)
            r4.b(r5, r6)
            xe.l r4 = new xe.l
            dd.b r5 = r0.f13759r
            java.util.ArrayList r5 = r5.f2204a
            r4.<init>(r5)
            xc.c r5 = xc.b.f21534a
            java.lang.Object r2 = r2.get(r5)
            java.util.List r2 = (java.util.List) r2
            me.a r5 = new me.a
            r6 = 20
            r5.<init>(r6)
            r4.b(r2, r5)
            java.util.ArrayList r2 = r3.L
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L685
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r2)
            le.d r2 = new le.d
            r2.<init>(r3, r10)
            java.util.ArrayList r3 = r0.f13758q
            r3.removeIf(r2)
            dd.b r0 = r0.f13759r
            java.util.ArrayList r0 = r0.f2204a
            r0.removeIf(r2)
        L685:
            ud.u r2 = r1.f742k
            r2.getClass()
            mh.b r3 = ud.u.f13741v
            boolean r4 = r3.d()
            java.util.ArrayList r0 = r2.f13758q
            java.util.Iterator r5 = r0.iterator()
        L696:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6ef
            java.lang.Object r0 = r5.next()
            r6 = r0
            be.a r6 = (be.a) r6
            xe.s.a()
            if (r4 == 0) goto L6ad
            long r7 = java.lang.System.currentTimeMillis()
            goto L6af
        L6ad:
            r7 = 0
        L6af:
            r6.f(r2)     // Catch: java.lang.Exception -> L6b3
            goto L6c1
        L6b3:
            r0 = move-exception
            java.lang.String r9 = "Visitor init failed: {}"
            java.lang.Class r10 = r6.getClass()
            java.lang.String r10 = r10.getSimpleName()
            r3.n(r10, r9, r0)
        L6c1:
            java.util.ArrayList r0 = r2.f13755n
            java.util.Iterator r0 = r0.iterator()
        L6c7:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L6de
            java.lang.Object r9 = r0.next()
            ud.e r9 = (ud.e) r9
            boolean r10 = r9.d0()
            if (r10 == 0) goto L6da
            goto L6c7
        L6da:
            be.h.h0(r6, r9)
            goto L6c7
        L6de:
            if (r4 == 0) goto L696
            java.lang.String r0 = "Prepare pass: '{}' - {}ms"
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r7
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r3.y(r6, r0, r7)
            goto L696
        L6ef:
            ud.u r2 = r1.f742k
            dd.b r0 = r2.f13759r
            java.util.ArrayList r0 = r0.f2204a
            java.util.Iterator r3 = r0.iterator()
        L6f9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L71b
            java.lang.Object r0 = r3.next()
            r4 = r0
            be.a r4 = (be.a) r4
            r4.f(r2)     // Catch: java.lang.Exception -> L70a
            goto L6f9
        L70a:
            r0 = move-exception
            mh.b r5 = dd.b.f2202b
            java.lang.String r6 = "Visitor init failed: {}"
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r5.n(r4, r6, r0)
            goto L6f9
        L71b:
            mh.b r0 = bc.k.f737s
            java.lang.String r2 = "Load finished"
            r0.l(r2)
            java.util.HashMap r0 = r1.f747p
            xc.c r2 = xc.a.f21533a
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L743
            java.util.Iterator r0 = r0.iterator()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L739
            goto L743
        L739:
            java.lang.Object r0 = r0.next()
            r0.getClass()
            ah.a.d()
        L743:
            return
        L744:
            af.g r2 = new af.g
            java.lang.String r3 = "Error loading jadx class set"
            r2.<init>(r3, r0)
            throw r2
        L74c:
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L3e9
            throw r0
        L74e:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L74e
            throw r0
        L751:
            r0 = move-exception
            goto L75c
        L753:
            r0 = move-exception
            af.g r3 = new af.g     // Catch: java.lang.Throwable -> L751
            java.lang.String r4 = "Failed to update temp root directory"
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L751
            throw r3     // Catch: java.lang.Throwable -> L751
        L75c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L751
            throw r0
    }

    public final void g() {
            r5 = this;
            te.a r0 = r5.f739h
            java.util.TreeSet r0 = r0.f13126d
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()
            te.b r1 = (te.b) r1
            boolean r2 = r1.f13136n     // Catch: java.lang.Exception -> L2e
            if (r2 == 0) goto L8
            ff.c r2 = r1.f13130h     // Catch: java.lang.Exception -> L2e
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Exception -> L2e
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Exception -> L2e
            java.lang.ClassLoader r3 = r2.getContextClassLoader()     // Catch: java.lang.Exception -> L2e
            java.lang.ClassLoader r4 = r1.f13132j     // Catch: java.lang.Exception -> L2e
            r2.setContextClassLoader(r4)     // Catch: java.lang.Exception -> L2e
            r2.setContextClassLoader(r3)     // Catch: java.lang.Exception -> L2e
            goto L8
        L2e:
            r2 = move-exception
            mh.b r3 = te.a.f13122g
            java.lang.String r4 = "Failed to unload plugin: {}"
            r1.a()
            java.lang.String r1 = "dex-input"
            r3.s(r1, r4, r2)
            goto L8
        L3c:
            r0 = 0
            r5.f742k = r0
            r5.f743l = r0
            ue.a r0 = r5.f749r
            m.a r0 = r0.f13763a
            monitor-enter(r0)
            java.lang.Object r1 = r0.f8069h     // Catch: java.lang.Throwable -> L4f
            java.util.IdentityHashMap r1 = (java.util.IdentityHashMap) r1     // Catch: java.lang.Throwable -> L4f
            r1.clear()     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            return
        L4f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = dd.a.b()
            java.lang.String r1 = "jadx decompiler "
            java.lang.String r0 = wb.en.g(r1, r0)
            return r0
    }
}
