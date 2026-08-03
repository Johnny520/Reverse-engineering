package ed;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mh.b f2700d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final qd.j[] f2701e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final qd.j[] f2702f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.u f2703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ed.b[] f2705c;

    static {
            java.lang.Class<ed.a> r0 = ed.a.class
            mh.b r0 = mh.d.b(r0)
            ed.a.f2700d = r0
            r0 = 0
            qd.j[] r1 = new qd.j[r0]
            ed.a.f2701e = r1
            r1 = 1
            qd.j[] r1 = new qd.j[r1]
            qd.e r2 = qd.j.f10877k
            r1[r0] = r2
            ed.a.f2702f = r1
            return
    }

    public a(ud.u r1) {
            r0 = this;
            r0.<init>()
            r0.f2703a = r1
            return
    }

    public static java.lang.String e(java.io.DataInputStream r5) {
            byte r0 = r5.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte[] r1 = new byte[r0]
            int r2 = r5.read(r1)
        Lc:
            if (r2 == r0) goto L20
            int r3 = r0 - r2
            int r3 = r5.read(r1, r2, r3)
            r4 = -1
            if (r3 == r4) goto L19
            int r2 = r2 + r3
            goto Lc
        L19:
            java.lang.String r5 = "String read error"
            j8.o.y(r5)
            r5 = 0
            return r5
        L20:
            java.lang.String r5 = new java.lang.String
            java.lang.String r0 = "US-ASCII"
            r5.<init>(r1, r0)
            return r5
    }

    public final void a(java.io.InputStream r10) {
            r9 = this;
            java.lang.String r0 = "Wrong jadx class set version, got: "
            java.io.DataInputStream r1 = new java.io.DataInputStream
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            r2.<init>(r10)
            r1.<init>(r2)
            r10 = 8
            byte[] r2 = new byte[r10]     // Catch: java.lang.Throwable -> L68
            int r3 = r1.read(r2)     // Catch: java.lang.Throwable -> L68
            if (r3 != r10) goto Lfc
            java.lang.String r10 = "jadx-cst"
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = "US-ASCII"
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L68
            boolean r10 = r10.equals(r3)     // Catch: java.lang.Throwable -> L68
            if (r10 == 0) goto Lfc
            byte r10 = r1.readByte()     // Catch: java.lang.Throwable -> L68
            r2 = 5
            if (r10 != r2) goto Le5
            int r10 = r1.readInt()     // Catch: java.lang.Throwable -> L68
            r9.f2704b = r10     // Catch: java.lang.Throwable -> L68
            int r10 = r1.readInt()     // Catch: java.lang.Throwable -> L68
            ed.b[] r0 = new ed.b[r10]     // Catch: java.lang.Throwable -> L68
            r9.f2705c = r0     // Catch: java.lang.Throwable -> L68
            r0 = 0
            r2 = r0
        L3c:
            if (r2 >= r10) goto L7f
            int r3 = r1.readInt()     // Catch: java.lang.Throwable -> L68
            byte r4 = r1.readByte()     // Catch: java.lang.Throwable -> L68
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 4
            int[] r5 = t3.c.c(r5)     // Catch: java.lang.Throwable -> L68
            if (r4 < 0) goto L6b
            int r6 = r5.length     // Catch: java.lang.Throwable -> L68
            if (r4 > r6) goto L6b
            r4 = r5[r4]     // Catch: java.lang.Throwable -> L68
            java.lang.String r5 = e(r1)     // Catch: java.lang.Throwable -> L68
            ed.b[] r6 = r9.f2705c     // Catch: java.lang.Throwable -> L68
            ed.b r7 = new ed.b     // Catch: java.lang.Throwable -> L68
            qd.j r5 = qd.j.x(r5)     // Catch: java.lang.Throwable -> L68
            r7.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L68
            r6[r2] = r7     // Catch: java.lang.Throwable -> L68
            int r2 = r2 + 1
            goto L3c
        L68:
            r10 = move-exception
            goto L104
        L6b:
            af.b r10 = new af.b     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "Wrong jadx source identifier: "
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L68
            r0.append(r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L68
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L68
            throw r10     // Catch: java.lang.Throwable -> L68
        L7f:
            r2 = r0
        L80:
            if (r2 >= r10) goto Le1
            ed.b[] r3 = r9.f2705c     // Catch: java.lang.Throwable -> L68
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L68
            ud.u r4 = r9.f2703a     // Catch: java.lang.Throwable -> L68
            qd.j r5 = r3.f2706a     // Catch: java.lang.Throwable -> L68
            od.a r4 = od.a.e(r4, r5)     // Catch: java.lang.Throwable -> L68
            byte r5 = r1.readByte()     // Catch: java.lang.Throwable -> L68
            r6 = -2
            if (r5 == r6) goto Lad
            r6 = -1
            if (r5 == r6) goto Lab
            if (r5 == 0) goto La8
            qd.j[] r6 = new qd.j[r5]     // Catch: java.lang.Throwable -> L68
            r7 = r0
        L9d:
            if (r7 >= r5) goto Laf
            qd.j r8 = r9.b(r1)     // Catch: java.lang.Throwable -> L68
            r6[r7] = r8     // Catch: java.lang.Throwable -> L68
            int r7 = r7 + 1
            goto L9d
        La8:
            qd.j[] r6 = ed.a.f2701e     // Catch: java.lang.Throwable -> L68
            goto Laf
        Lab:
            r6 = 0
            goto Laf
        Lad:
            qd.j[] r6 = ed.a.f2702f     // Catch: java.lang.Throwable -> L68
        Laf:
            r3.f2708c = r6     // Catch: java.lang.Throwable -> L68
            java.util.List r5 = r9.c(r1)     // Catch: java.lang.Throwable -> L68
            r3.f2710e = r5     // Catch: java.lang.Throwable -> L68
            java.util.ArrayList r4 = r9.d(r1, r4)     // Catch: java.lang.Throwable -> L68
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> L68
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L68
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L68
        Lc8:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r6 == 0) goto Ldc
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L68
            ed.d r6 = (ed.d) r6     // Catch: java.lang.Throwable -> L68
            od.d r7 = r6.f2718g     // Catch: java.lang.Throwable -> L68
            java.lang.String r7 = r7.f9781k     // Catch: java.lang.Throwable -> L68
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> L68
            goto Lc8
        Ldc:
            r3.f2709d = r5     // Catch: java.lang.Throwable -> L68
            int r2 = r2 + 1
            goto L80
        Le1:
            r1.close()
            return
        Le5:
            af.b r2 = new af.b     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L68
            r3.append(r10)     // Catch: java.lang.Throwable -> L68
            java.lang.String r10 = ", expect: 5"
            r3.append(r10)     // Catch: java.lang.Throwable -> L68
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> L68
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L68
            throw r2     // Catch: java.lang.Throwable -> L68
        Lfc:
            af.b r10 = new af.b     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = "Wrong jadx class set header"
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L68
            throw r10     // Catch: java.lang.Throwable -> L68
        L104:
            r1.close()     // Catch: java.lang.Throwable -> L108
            goto L10c
        L108:
            r0 = move-exception
            r10.addSuppressed(r0)
        L10c:
            throw r10
    }

    public final qd.j b(java.io.DataInputStream r4) {
            r3 = this;
            byte r0 = r4.readByte()
            r1 = -1
            if (r0 != r1) goto L9
            r4 = 0
            return r4
        L9:
            r1 = 7
            int[] r1 = t3.c.c(r1)
            r1 = r1[r0]
            int r1 = t3.c.b(r1)
            switch(r1) {
                case 0: goto L77;
                case 1: goto L64;
                case 2: goto L56;
                case 3: goto L44;
                case 4: goto L39;
                case 5: goto L2c;
                case 6: goto L22;
                default: goto L17;
            }
        L17:
            java.lang.String r4 = "Unsupported Arg Type: "
            java.lang.String r4 = eh.a.l(r0, r4)
            ah.a.k(r4)
            r4 = 0
            return r4
        L22:
            byte r4 = r4.readByte()
            char r4 = (char) r4
            qd.g r4 = qd.j.y(r4)
            return r4
        L2c:
            qd.j r4 = r3.b(r4)
            java.util.Objects.requireNonNull(r4)
            qd.a r0 = new qd.a
            r0.<init>(r4)
            return r0
        L39:
            ed.b[] r0 = r3.f2705c
            int r4 = r4.readInt()
            r4 = r0[r4]
            qd.j r4 = r4.f2706a
            return r4
        L44:
            qd.j r0 = r3.b(r4)
            qd.j r4 = r3.b(r4)
            qd.f r1 = new qd.f
            qd.e r0 = (qd.e) r0
            qd.e r4 = (qd.e) r4
            r1.<init>(r0, r4)
            return r1
        L56:
            java.lang.String r0 = e(r4)
            java.util.List r4 = r3.c(r4)
            qd.c r1 = new qd.c
            r1.<init>(r0, r4)
            return r1
        L64:
            ed.b[] r0 = r3.f2705c
            int r1 = r4.readInt()
            r0 = r0[r1]
            qd.j r0 = r0.f2706a
            java.util.List r4 = r3.c(r4)
            qd.b r4 = qd.j.e(r0, r4)
            return r4
        L77:
            byte r0 = r4.readByte()
            r1 = 2
            if (r0 != 0) goto L80
            r2 = r1
            goto L85
        L80:
            r2 = 1
            if (r0 != r2) goto L84
            goto L85
        L84:
            r2 = 3
        L85:
            if (r2 != r1) goto L8a
            qd.i r4 = qd.j.f10886t
            return r4
        L8a:
            qd.j r4 = r3.b(r4)
            qd.i r0 = new qd.i
            r0.<init>(r2, r4)
            return r0
    }

    public final java.util.List c(java.io.DataInputStream r5) {
            r4 = this;
            byte r0 = r5.readByte()
            if (r0 != 0) goto L9
            java.util.List r5 = java.util.Collections.EMPTY_LIST
            return r5
        L9:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        Lf:
            if (r2 >= r0) goto L1b
            qd.j r3 = r4.b(r5)
            r1.add(r3)
            int r2 = r2 + 1
            goto Lf
        L1b:
            return r1
    }

    public final java.util.ArrayList d(java.io.DataInputStream r17, od.a r18) {
            r16 = this;
            short r0 = r17.readShort()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L5a
            java.lang.String r3 = e(r17)
            java.util.List r4 = r16.c(r17)
            qd.j r5 = r16.b(r17)
            java.util.List r6 = r16.c(r17)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L2b
            boolean r7 = r6.equals(r4)
            if (r7 == 0) goto L29
            goto L2b
        L29:
            r10 = r6
            goto L2c
        L2b:
            r10 = r4
        L2c:
            qd.j r6 = r16.b(r17)
            boolean r7 = java.util.Objects.equals(r6, r5)
            if (r7 == 0) goto L38
            r11 = r5
            goto L39
        L38:
            r11 = r6
        L39:
            java.util.List r12 = r16.c(r17)
            int r14 = r17.readInt()
            java.util.List r13 = r16.c(r17)
            r6 = r16
            ud.u r7 = r6.f2703a
            r15 = r18
            od.d r9 = od.d.b(r7, r15, r3, r4, r5)
            ed.d r8 = new ed.d
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r1.add(r8)
            int r2 = r2 + 1
            goto La
        L5a:
            r6 = r16
            return r1
    }
}
