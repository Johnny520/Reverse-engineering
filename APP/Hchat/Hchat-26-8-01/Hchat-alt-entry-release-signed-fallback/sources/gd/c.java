package gd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mh.b f4487a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h6.f f4488b = null;

    static {
            java.lang.Class<gd.c> r0 = gd.c.class
            mh.b r0 = mh.d.b(r0)
            gd.c.f4487a = r0
            h6.g r0 = ac.p.p()
            r1 = 6
            r0.f5121c = r1
            r1 = 0
            r0.f5127i = r1
            h6.f r0 = r0.a()
            gd.c.f4488b = r0
            return
    }

    public static void a(ud.u r8) {
            id.a r0 = new id.a
            r0.<init>()
            java.util.ArrayList r1 = r8.f13755n
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            r0.f6661a = r2
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld3
            java.lang.Object r2 = r1.next()
            ud.e r2 = (ud.e) r2
            od.a r3 = r2.f13690m
            b.e r4 = new b.e
            r5 = 14
            r6 = 0
            r4.<init>(r5, r6)
            qd.j r5 = r3.f9765g
            r5.l()
            r3.f()
            ud.e r5 = r2.a0()
            od.a r5 = r5.f13690m
            r5.g()
            boolean r3 = r3.o()
            if (r3 == 0) goto L4b
            ud.e r3 = r2.a0()
            od.a r3 = r3.f13690m
            java.lang.String r3 = r3.f9768j
        L4b:
            java.util.List r3 = r2.f13698u
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L54
            goto L82
        L54:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r3.size()
            r5.<init>(r6)
            r4.f332h = r5
            java.util.Iterator r3 = r3.iterator()
        L63:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L82
            java.lang.Object r5 = r3.next()
            ud.g r5 = (ud.g) r5
            a2.a r6 = new a2.a
            r7 = 20
            r6.<init>(r7)
            od.c r5 = r5.f13707l
            java.lang.String r5 = r5.f9774h
            java.lang.Object r5 = r4.f332h
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r6)
            goto L63
        L82:
            java.util.List r2 = r2.f13697t
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L8b
            goto Lcc
        L8b:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r2.size()
            r3.<init>(r5)
            r4.f333i = r3
            java.util.Iterator r2 = r2.iterator()
        L9a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lcc
            java.lang.Object r3 = r2.next()
            ud.r r3 = (ud.r) r3
            a2.a r5 = new a2.a
            r6 = 21
            r5.<init>(r6)
            od.d r6 = r3.f13717k
            java.lang.String r6 = r6.f9781k
            boolean r6 = r3.f13722p
            if (r6 == 0) goto Lb8
            r6 = 0
            goto Lc1
        Lb8:
            a5.a r3 = r3.f13720n
            java.lang.Object r3 = r3.f57i
            ac.k r3 = (ac.k) r3
            int r3 = r3.f177h
            long r6 = (long) r3
        Lc1:
            java.lang.Long.toHexString(r6)
            java.lang.Object r3 = r4.f333i
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r5)
            goto L9a
        Lcc:
            java.util.ArrayList r2 = r0.f6661a
            r2.add(r4)
            goto L16
        Ld3:
            bc.g r8 = r8.f13742a
            java.io.File r8 = r8.f714i
            java.io.File r8 = r8.getAbsoluteFile()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "mapping.json"
            r1.<init>(r8, r2)
            mh.b r8 = bf.b.f857a
            java.io.File r8 = r1.getParentFile()
            bf.b.c(r8)
            java.io.FileWriter r8 = new java.io.FileWriter     // Catch: java.lang.Exception -> L11f
            r8.<init>(r1)     // Catch: java.lang.Exception -> L11f
            h6.f r2 = gd.c.f4488b     // Catch: java.lang.Throwable -> L10d
            r2.getClass()     // Catch: java.lang.Throwable -> L10d
            java.lang.Class<id.a> r3 = id.a.class
            o6.a r4 = r2.c(r8)     // Catch: java.lang.Throwable -> L10d java.io.IOException -> L10f
            r2.d(r0, r3, r4)     // Catch: java.lang.Throwable -> L10d java.io.IOException -> L10f
            mh.b r0 = gd.c.f4487a     // Catch: java.lang.Throwable -> L10d
            java.lang.String r2 = "Save mappings to {}"
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L10d
            r0.a(r1, r2)     // Catch: java.lang.Throwable -> L10d
            r8.close()     // Catch: java.lang.Exception -> L11f
            return
        L10d:
            r0 = move-exception
            goto L116
        L10f:
            r0 = move-exception
            af.d r1 = new af.d     // Catch: java.lang.Throwable -> L10d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L10d
            throw r1     // Catch: java.lang.Throwable -> L10d
        L116:
            r8.close()     // Catch: java.lang.Throwable -> L11a
            goto L11e
        L11a:
            r8 = move-exception
            r0.addSuppressed(r8)     // Catch: java.lang.Exception -> L11f
        L11e:
            throw r0     // Catch: java.lang.Exception -> L11f
        L11f:
            r8 = move-exception
            af.g r0 = new af.g
            java.lang.String r1 = "Failed to save mapping json"
            r0.<init>(r1, r8)
            throw r0
    }
}
