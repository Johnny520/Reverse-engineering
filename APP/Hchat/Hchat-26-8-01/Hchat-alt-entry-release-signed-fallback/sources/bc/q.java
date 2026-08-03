package bc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bc.k f767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f769c;

    static {
            java.lang.Class<bc.q> r0 = bc.q.class
            mh.d.b(r0)
            return
    }

    public q(bc.k r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f768b = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f769c = r1
            r2.f767a = r3
            df.h r3 = new df.h
            r3.<init>()
            r0.add(r3)
            return
    }

    public static java.lang.Object a(bc.o r4, e9.a r5) {
            java.lang.String r0 = r4.f757a
            nf.a r4 = r4.f759c     // Catch: java.lang.Exception -> L18
            if (r4 == 0) goto L27
            java.io.InputStream r1 = r4.b()     // Catch: java.lang.Exception -> L18
            long r2 = r4.c()     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r4 = r5.c(r1, r2)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1a
            r1.close()     // Catch: java.lang.Exception -> L18
            return r4
        L18:
            r4 = move-exception
            goto L4c
        L1a:
            return r4
        L1b:
            r4 = move-exception
            if (r1 == 0) goto L26
            r1.close()     // Catch: java.lang.Throwable -> L22
            goto L26
        L22:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.lang.Exception -> L18
        L26:
            throw r4     // Catch: java.lang.Exception -> L18
        L27:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L18
            r4.<init>(r0)     // Catch: java.lang.Exception -> L18
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L18
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L18
            r2.<init>(r4)     // Catch: java.lang.Exception -> L18
            r1.<init>(r2)     // Catch: java.lang.Exception -> L18
            long r2 = r4.length()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r4 = r5.c(r1, r2)     // Catch: java.lang.Throwable -> L42
            r1.close()     // Catch: java.lang.Exception -> L18
            return r4
        L42:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.lang.Exception -> L18
        L4b:
            throw r4     // Catch: java.lang.Exception -> L18
        L4c:
            af.e r5 = new af.e
            java.lang.String r1 = "Error decode: "
            java.lang.String r0 = wb.en.g(r1, r0)
            r5.<init>(r0, r4)
            throw r5
    }

    public final java.util.ArrayList b(ud.u r11) {
            r10 = this;
            java.util.ArrayList r0 = r10.f768b
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            df.h r1 = (df.h) r1
            r1.f2229a = r11     // Catch: java.lang.Exception -> L16
            goto L6
        L16:
            java.lang.String r11 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Failed to init res table provider: "
            java.lang.String r11 = r0.concat(r11)
            ah.a.k(r11)
            return r2
        L24:
            java.util.ArrayList r11 = r10.f769c
            java.util.Iterator r11 = r11.iterator()
            boolean r0 = r11.hasNext()
            if (r0 != 0) goto L117
            bc.k r11 = r10.f767a
            bc.g r0 = r11.f738g
            java.util.ArrayList r0 = r0.f712g
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r0.size()
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L43:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L116
            java.lang.Object r3 = r0.next()
            java.io.File r3 = (java.io.File) r3
            if (r3 == 0) goto L43
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L58
            goto L43
        L58:
            java.util.ArrayList r4 = r11.f746o
            java.util.Iterator r4 = r4.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L10b
            mh.b r4 = bf.b.f857a
            r4 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L87
            r5.<init>(r3)     // Catch: java.lang.Exception -> L87
            byte[] r6 = bf.b.f861e     // Catch: java.lang.Throwable -> L7f
            int r7 = r6.length     // Catch: java.lang.Throwable -> L7f
            byte[] r8 = new byte[r7]     // Catch: java.lang.Throwable -> L7f
            int r9 = r5.read(r8)     // Catch: java.lang.Throwable -> L7f
            if (r9 != r7) goto L81
            boolean r6 = java.util.Arrays.equals(r8, r6)     // Catch: java.lang.Throwable -> L7f
            if (r6 == 0) goto L81
            r6 = 1
            goto L82
        L7f:
            r6 = move-exception
            goto L89
        L81:
            r6 = r4
        L82:
            r5.close()     // Catch: java.lang.Exception -> L87
            r4 = r6
            goto L9d
        L87:
            r5 = move-exception
            goto L92
        L89:
            r5.close()     // Catch: java.lang.Throwable -> L8d
            goto L91
        L8d:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch: java.lang.Exception -> L87
        L91:
            throw r6     // Catch: java.lang.Exception -> L87
        L92:
            mh.b r6 = bf.b.f857a
            java.lang.String r7 = "Failed to read zip file: {}"
            java.lang.String r8 = r3.getAbsolutePath()
            r6.n(r8, r7, r5)
        L9d:
            if (r4 == 0) goto Lf5
            m.a r4 = r11.f741j     // Catch: java.lang.Exception -> Le6
            nf.c r4 = r4.r(r3)     // Catch: java.lang.Exception -> Le6
            java.util.ArrayList r5 = r11.f748q     // Catch: java.lang.Exception -> Le6
            r5.add(r4)     // Catch: java.lang.Exception -> Le6
            java.util.ArrayList r4 = r4.f9416h     // Catch: java.lang.Exception -> Le6
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> Le6
        Lb0:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> Le6
            if (r5 == 0) goto L43
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> Le6
            nf.a r5 = (nf.a) r5     // Catch: java.lang.Exception -> Le6
            boolean r6 = r5.isDirectory()     // Catch: java.lang.Exception -> Le6
            if (r6 == 0) goto Lc3
            goto Lb0
        Lc3:
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Exception -> Le6
            bc.p r7 = bc.p.a(r6)     // Catch: java.lang.Exception -> Le6
            bc.g r8 = r11.f738g     // Catch: java.lang.Exception -> Le6
            ad.c r8 = r8.K     // Catch: java.lang.Exception -> Le6
            rf.b r8 = r8.f226b     // Catch: java.lang.Exception -> Le6
            boolean r8 = r8.c(r6)     // Catch: java.lang.Exception -> Le6
            if (r8 != 0) goto Ld9
            r8 = r2
            goto Lde
        Ld9:
            bc.o r8 = new bc.o     // Catch: java.lang.Exception -> Le6
            r8.<init>(r6, r7)     // Catch: java.lang.Exception -> Le6
        Lde:
            if (r8 == 0) goto Lb0
            r8.f759c = r5     // Catch: java.lang.Exception -> Le6
            r1.add(r8)     // Catch: java.lang.Exception -> Le6
            goto Lb0
        Le6:
            r11 = move-exception
            java.lang.String r0 = r3.getAbsolutePath()
            java.lang.String r1 = "Failed to open zip file: "
            java.lang.String r0 = wb.en.g(r1, r0)
            ah.a.p(r0, r11)
            return r2
        Lf5:
            java.lang.String r4 = r3.getAbsolutePath()
            bc.p r4 = bc.p.a(r4)
            bc.o r5 = new bc.o
            java.lang.String r3 = r3.getAbsolutePath()
            r5.<init>(r3, r4)
            r1.add(r5)
            goto L43
        L10b:
            java.lang.Object r11 = r4.next()
            r11.getClass()
            ah.a.d()
            return r2
        L116:
            return r1
        L117:
            java.lang.Object r11 = r11.next()
            if (r11 == 0) goto L121
            ah.a.d()
            return r2
        L121:
            throw r2     // Catch: java.lang.Exception -> L122
        L122:
            java.lang.String r11 = "null"
            java.lang.String r0 = "Failed to init res container factory: "
            java.lang.String r11 = r0.concat(r11)
            ah.a.k(r11)
            return r2
    }
}
