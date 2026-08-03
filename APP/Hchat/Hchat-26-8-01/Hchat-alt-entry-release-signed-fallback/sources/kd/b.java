package kd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final mh.b f7575f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.nio.charset.Charset f7576g = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.nio.file.Path f7577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f7578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f7579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f7580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f7581e;

    static {
            java.lang.Class<kd.b> r0 = kd.b.class
            mh.b r0 = mh.d.b(r0)
            kd.b.f7575f = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            kd.b.f7576g = r0
            return
    }

    public b(java.nio.file.Path r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f7578b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f7579c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f7580d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f7581e = r0
            r1.f7577a = r2
            return
    }

    public static kd.b a(ud.u r5) {
            bc.g r0 = r5.f13742a
            r0.getClass()
            java.util.ArrayList r0 = r0.f712g
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.io.File r0 = (java.io.File) r0
            java.nio.file.Path r0 = r0.toPath()
            java.nio.file.Path r0 = r0.toAbsolutePath()
            mh.b r2 = bf.b.f857a
            java.nio.file.Path r2 = r0.getFileName()
            java.lang.String r2 = r2.toString()
            r3 = 46
            int r3 = r2.lastIndexOf(r3)
            r4 = -1
            if (r3 != r4) goto L2a
            goto L2e
        L2a:
            java.lang.String r2 = r2.substring(r1, r3)
        L2e:
            java.nio.file.Path r0 = r0.getParent()
            java.lang.String r1 = ".jobf"
            java.lang.String r1 = r2.concat(r1)
            java.nio.file.Path r0 = r0.resolve(r1)
            bc.g r5 = r5.f13742a
            int r5 = r5.S
            r1 = 4
            if (r5 == r1) goto L4a
            mh.b r5 = kd.b.f7575f
            java.lang.String r1 = "Deobfuscation map file set to: {}"
            r5.x(r0, r1)
        L4a:
            kd.b r5 = new kd.b
            r5.<init>(r0)
            return r5
    }

    public final void b(ud.u r9) {
            r8 = this;
            java.util.ArrayList r0 = r9.f13757p
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            ud.s r1 = (ud.s) r1
            java.util.ArrayList r2 = r1.f13736n
            od.e r3 = r1.f13734l
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L6
            od.e r2 = r1.f13738p
            r4 = 0
            if (r3 != r2) goto L23
            r2 = r4
            goto L2d
        L23:
            od.e r5 = r3.f9785a
            od.e r2 = r2.f9785a
            boolean r2 = java.util.Objects.equals(r5, r2)
            r2 = r2 ^ 1
        L2d:
            java.util.HashMap r5 = r8.f7578b
            if (r2 == 0) goto L3b
            java.lang.String r2 = r3.f9786b
            od.e r1 = r1.f13738p
            java.lang.String r1 = r1.f9786b
            r5.put(r2, r1)
            goto L6
        L3b:
            od.e r2 = r1.f13738p
            if (r3 != r2) goto L40
            goto L4a
        L40:
            java.lang.String r4 = r3.f9787c
            java.lang.String r2 = r2.f9787c
            boolean r2 = r4.equals(r2)
            r4 = r2 ^ 1
        L4a:
            if (r4 == 0) goto L6
            java.lang.String r2 = r3.f9786b
            od.e r1 = r1.f13738p
            java.lang.String r1 = r1.f9787c
            r5.put(r2, r1)
            goto L6
        L56:
            java.util.ArrayList r9 = r9.f13755n
            java.util.Iterator r9 = r9.iterator()
        L5c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Ldf
            java.lang.Object r0 = r9.next()
            ud.e r0 = (ud.e) r0
            od.a r1 = r0.f13690m
            boolean r2 = r1.n()
            if (r2 == 0) goto L7d
            java.lang.String r2 = r1.q()
            java.lang.String r1 = r1.k()
            java.util.HashMap r3 = r8.f7579c
            r3.put(r2, r1)
        L7d:
            java.util.List r1 = r0.f13698u
            java.util.Iterator r1 = r1.iterator()
        L83:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r1.next()
            ud.g r2 = (ud.g) r2
            od.c r3 = r2.f13707l
            boolean r4 = r3.b()
            if (r4 == 0) goto L83
            od.a r4 = r3.f9773g
            java.lang.String r4 = r4.q()
            java.lang.String r5 = r3.f9774h
            qd.j r3 = r3.f9775i
            java.lang.String r3 = fd.j.b(r3)
            java.lang.String r6 = "."
            java.lang.String r7 = ":"
            java.lang.String r3 = bc.e.v(r4, r6, r5, r7, r3)
            od.c r2 = r2.f13707l
            java.lang.String r2 = r2.f9776j
            java.util.HashMap r4 = r8.f7580d
            r4.put(r3, r2)
            goto L83
        Lb7:
            java.util.List r0 = r0.f13697t
            java.util.Iterator r0 = r0.iterator()
        Lbd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r0.next()
            ud.r r1 = (ud.r) r1
            od.d r1 = r1.f13717k
            java.lang.String r2 = r1.f9777g
            java.lang.String r3 = r1.f9784n
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lbd
            java.lang.String r2 = r1.f9782l
            java.lang.String r1 = r1.f9784n
            java.util.HashMap r3 = r8.f7581e
            r3.put(r2, r1)
            goto Lbd
        Ldf:
            return
    }

    public final void c() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap r1 = r5.f7578b
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r3 = "p %s = %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.add(r2)
            goto Lf
        L31:
            java.util.HashMap r1 = r5.f7579c
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r3 = "c %s = %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.add(r2)
            goto L3b
        L5d:
            java.util.HashMap r1 = r5.f7580d
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L67:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L89
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r3 = "f %s = %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.add(r2)
            goto L67
        L89:
            java.util.HashMap r1 = r5.f7581e
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L93:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r3 = "m %s = %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.add(r2)
            goto L93
        Lb5:
            java.util.Collections.sort(r0)
            boolean r1 = r0.isEmpty()
            mh.b r2 = kd.b.f7575f
            if (r1 == 0) goto Lcc
            boolean r0 = r2.d()
            if (r0 == 0) goto Lcb
            java.lang.String r0 = "Deobfuscation map is empty, not saving it"
            r2.l(r0)
        Lcb:
            return
        Lcc:
            r1 = 3
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]
            java.nio.file.StandardOpenOption r3 = java.nio.file.StandardOpenOption.WRITE
            r4 = 0
            r1[r4] = r3
            java.nio.file.StandardOpenOption r3 = java.nio.file.StandardOpenOption.CREATE
            r4 = 1
            r1[r4] = r3
            java.nio.file.StandardOpenOption r3 = java.nio.file.StandardOpenOption.TRUNCATE_EXISTING
            r4 = 2
            r1[r4] = r3
            java.nio.file.Path r3 = r5.f7577a
            java.nio.charset.Charset r4 = kd.b.f7576g
            java.nio.file.Files.write(r3, r0, r4, r1)
            java.lang.String r0 = "Deobfuscation map file saved as: {}"
            r2.a(r3, r0)
            return
    }
}
