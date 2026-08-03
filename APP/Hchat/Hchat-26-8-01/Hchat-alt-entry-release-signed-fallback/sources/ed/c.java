package ed;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.Set f2712f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.u f2713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.HashMap f2714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.util.HashMap f2715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.util.HashMap f2716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f2717e;

    static {
            java.lang.Class<ed.c> r0 = ed.c.class
            mh.d.b(r0)
            java.lang.String r0 = "java.lang.Object"
            java.util.Set r0 = java.util.Collections.singleton(r0)
            ed.c.f2712f = r0
            return
    }

    public c(ud.u r2) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f2717e = r0
            r1.f2713a = r2
            return
    }

    public final void a(java.util.ArrayList r8) {
            r7 = this;
            java.util.HashMap r0 = r7.f2714b
            if (r0 != 0) goto Lf
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r8.size()
            r0.<init>(r1)
            r7.f2714b = r0
        Lf:
            java.util.Iterator r8 = r8.iterator()
        L13:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r8.next()
            ud.e r0 = (ud.e) r0
            od.a r1 = r0.f13690m
            qd.j r1 = r1.f9765g
            java.lang.String r2 = r1.l()
            ed.b r3 = new ed.b
            b5.k r4 = r0.f13692o
            int r4 = r4.f488b
            r5 = 1
            r3.<init>(r4, r5, r1)
            mh.b r1 = ed.a.f2700d
            qd.j r1 = r0.f13693p
            if (r1 != 0) goto L3a
            qd.j[] r0 = ed.a.f2701e
            goto L68
        L3a:
            java.util.List r4 = r0.f13694q
            int r4 = r4.size()
            if (r4 != 0) goto L49
            qd.e r6 = qd.j.f10877k
            if (r1 != r6) goto L49
            qd.j[] r0 = ed.a.f2702f
            goto L68
        L49:
            int r4 = r4 + 1
            qd.j[] r4 = new qd.j[r4]
            r6 = 0
            r4[r6] = r1
            java.util.List r0 = r0.f13694q
            java.util.Iterator r0 = r0.iterator()
            r1 = r5
        L57:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L67
            java.lang.Object r6 = r0.next()
            qd.j r6 = (qd.j) r6
            r4[r1] = r6
            int r1 = r1 + r5
            goto L57
        L67:
            r0 = r4
        L68:
            r3.f2708c = r0
            java.util.HashMap r0 = r7.f2714b
            r0.put(r2, r3)
            goto L13
        L70:
            return
    }

    public final void b(ed.b r7, java.util.HashSet r8) {
            r6 = this;
            qd.j[] r7 = r7.f2708c
            int r0 = r7.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L3e
            r2 = r7[r1]
            if (r2 != 0) goto Lb
            goto L3b
        Lb:
            java.util.HashMap r3 = r6.f2714b
            java.lang.String r4 = r2.l()
            java.lang.Object r3 = r3.get(r4)
            ed.b r3 = (ed.b) r3
            if (r3 != 0) goto L22
            java.util.HashSet r4 = r6.f2717e
            java.lang.String r5 = r2.l()
            r4.add(r5)
        L22:
            if (r3 == 0) goto L34
            qd.j r2 = r3.f2706a
            java.lang.String r2 = r2.l()
            boolean r2 = r8.add(r2)
            if (r2 == 0) goto L3b
            r6.b(r3, r8)
            goto L3b
        L34:
            java.lang.String r2 = r2.l()
            r8.add(r2)
        L3b:
            int r1 = r1 + 1
            goto L4
        L3e:
            return
    }

    public final ed.b c(qd.j r2) {
            r1 = this;
            java.util.HashMap r0 = r1.f2714b
            java.lang.String r2 = r2.l()
            java.lang.Object r2 = r0.get(r2)
            ed.b r2 = (ed.b) r2
            return r2
    }

    public final java.util.Set d(java.lang.String r2) {
            r1 = this;
            java.util.HashMap r0 = r1.f2715c
            java.lang.Object r2 = r0.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto Lc
            java.util.Set r2 = java.util.Collections.EMPTY_SET
        Lc:
            return r2
    }

    public final void e() {
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            java.util.HashMap r1 = r7.f2714b
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashMap r2 = r7.f2714b
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            ed.b r3 = (ed.b) r3
            r1.clear()
            r7.b(r3, r1)
            int r4 = r1.size()
            if (r4 == 0) goto L5b
            r5 = 1
            if (r4 == r5) goto L41
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r1)
            goto L5d
        L41:
            java.util.Iterator r4 = r1.iterator()
            java.lang.Object r4 = r4.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "java.lang.Object"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L56
            java.util.Set r4 = ed.c.f2712f
            goto L5d
        L56:
            java.util.Set r4 = java.util.Collections.singleton(r4)
            goto L5d
        L5b:
            java.util.Set r4 = java.util.Collections.EMPTY_SET
        L5d:
            qd.j r3 = r3.f2706a
            java.lang.String r3 = r3.l()
            r0.put(r3, r4)
            goto L1a
        L67:
            r7.f2715c = r0
            java.util.HashMap r0 = new java.util.HashMap
            java.util.HashMap r1 = r7.f2714b
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.HashMap r2 = r7.f2714b
            java.util.Set r2 = r2.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            java.util.Iterator r1 = r1.iterator()
        L86:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Set r3 = r7.d(r2)
            java.util.Iterator r3 = r3.iterator()
        L9a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L86
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.alibaba.fastjson2.writer.b r5 = new com.alibaba.fastjson2.writer.b
            r6 = 15
            r5.<init>(r6)
            java.lang.Object r4 = r0.computeIfAbsent(r4, r5)
            java.util.List r4 = (java.util.List) r4
            r4.add(r2)
            goto L9a
        Lb7:
            r7.f2716d = r0
            return
    }

    public final void f() {
            r7 = this;
            ed.a r0 = new ed.a
            ud.u r1 = r7.f2713a
            r0.<init>(r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Class<ed.a> r3 = ed.a.class
            java.lang.String r4 = "/clst/core.jcst"
            java.io.InputStream r3 = r3.getResourceAsStream(r4)
            if (r3 == 0) goto L86
            r0.a(r3)     // Catch: java.lang.Throwable -> L84
            r3.close()
            mh.b r3 = ed.a.f2700d
            boolean r4 = r3.d()
            if (r4 == 0) goto L5b
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r1
            ed.b[] r1 = r0.f2705c
            java.util.stream.Stream r1 = java.util.stream.Stream.of(r1)
            ae.a r2 = new ae.a
            r6 = 8
            r2.<init>(r6)
            java.util.stream.IntStream r1 = r1.mapToInt(r2)
            int r1 = r1.sum()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            int r4 = r0.f2704b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            ed.b[] r5 = r0.f2705c
            int r5 = r5.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r4, r5, r1}
            java.lang.String r2 = "Clst file loaded in {}ms, android api: {}, classes: {}, methods: {}"
            r3.o(r2, r1)
        L5b:
            java.util.HashMap r1 = r7.f2714b
            if (r1 != 0) goto L7e
            java.util.HashMap r1 = new java.util.HashMap
            ed.b[] r2 = r0.f2705c
            int r2 = r2.length
            r1.<init>(r2)
            r7.f2714b = r1
            ed.b[] r0 = r0.f2705c
            int r2 = r0.length
            r3 = 0
        L6d:
            if (r3 >= r2) goto L7d
            r4 = r0[r3]
            qd.j r5 = r4.f2706a
            java.lang.String r5 = r5.l()
            r1.put(r5, r4)
            int r3 = r3 + 1
            goto L6d
        L7d:
            return
        L7e:
            java.lang.String r0 = "Classpath already loaded"
            ah.a.k(r0)
            return
        L84:
            r0 = move-exception
            goto L8e
        L86:
            af.g r0 = new af.g     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = "Can't load classpath file: /clst/core.jcst"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L84
            throw r0     // Catch: java.lang.Throwable -> L84
        L8e:
            if (r3 == 0) goto L98
            r3.close()     // Catch: java.lang.Throwable -> L94
            goto L98
        L94:
            r1 = move-exception
            r0.addSuppressed(r1)
        L98:
            throw r0
    }
}
