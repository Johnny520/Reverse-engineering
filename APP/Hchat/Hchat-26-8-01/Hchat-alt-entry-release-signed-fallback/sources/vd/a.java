package vd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f14308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14311d;

    static {
            java.lang.Class<vd.a> r0 = vd.a.class
            mh.d.b(r0)
            return
    }

    public a(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f14308a = r1
            int r1 = r1.length()
            r0.f14309b = r1
            r1 = -1
            r0.f14310c = r1
            r1 = 0
            r0.f14311d = r1
            return
    }

    public static vd.a g(nd.b0 r1) {
            oc.c r0 = oc.c.f9756b
            md.f r1 = r1.f8877g
            oc.b r1 = r1.c(r0)
            pc.j r1 = (pc.j) r1
            r0 = 0
            if (r1 != 0) goto Lf
            r1 = r0
            goto L11
        Lf:
            java.lang.String r1 = r1.f10472g
        L11:
            if (r1 != 0) goto L14
            return r0
        L14:
            vd.a r0 = new vd.a
            r0.<init>(r1)
            return r0
    }

    public final void a(char r6) {
            r5 = this;
            char r0 = r5.j()
            if (r6 != r0) goto L7
            return
        L7:
            af.g r1 = new af.g
            java.lang.String r2 = r5.f()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Consume wrong char: '"
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = "' != '"
            r3.append(r0)
            r3.append(r6)
            java.lang.String r6 = "', sign: "
            r3.append(r6)
            r3.append(r2)
            java.lang.String r6 = r3.toString()
            r1.<init>(r6)
            throw r1
    }

    public final java.util.List b() {
            r6 = this;
            r0 = 60
            boolean r1 = r6.i(r0)
            if (r1 != 0) goto Lb
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        Lb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.a(r0)
        L13:
            r0 = 62
            boolean r2 = r6.i(r0)
            if (r2 != 0) goto L89
            char r2 = r6.j()
            if (r2 != 0) goto L22
            goto L89
        L22:
            int r2 = r6.f14310c
            r6.f14311d = r2
        L26:
            r0 = 58
            boolean r3 = r6.i(r0)
            if (r3 == 0) goto L33
            java.lang.String r2 = r6.h()
            goto L3c
        L33:
            char r3 = r6.j()
            if (r3 != 0) goto L26
            r6.f14310c = r2
            r2 = 0
        L3c:
            if (r2 == 0) goto L83
            r6.a(r0)
            boolean r3 = r6.i(r0)
            if (r3 == 0) goto L4a
            r6.j()
        L4a:
            java.util.List r3 = java.util.Collections.EMPTY_LIST
        L4c:
            qd.j r4 = r6.e()
            if (r4 == 0) goto L7c
            qd.e r5 = qd.j.f10877k
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L68
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L65
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L65:
            r3.add(r4)
        L68:
            boolean r4 = r6.i(r0)
            if (r4 == 0) goto L71
            r6.a(r0)
        L71:
            if (r4 != 0) goto L4c
            qd.c r0 = new qd.c
            r0.<init>(r2, r3)
            r1.add(r0)
            goto L13
        L7c:
            java.lang.String r0 = "Unexpected end of signature"
            ah.a.k(r0)
        L81:
            r0 = 0
            return r0
        L83:
            java.lang.String r0 = "Failed to parse generic types map"
            ah.a.k(r0)
            goto L81
        L89:
            r6.a(r0)
            return r1
    }

    public final java.util.List c(int r4) {
            r3 = this;
            r0 = 40
            r3.a(r0)
            r0 = 41
            boolean r1 = r3.i(r0)
            if (r1 == 0) goto L13
            r3.a(r0)
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            return r4
        L13:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r4)
            int r4 = r4 + 10
        L1a:
            qd.j r2 = r3.e()
            if (r2 == 0) goto L42
            r1.add(r2)
            int r2 = r1.size()
            if (r2 > r4) goto L33
            boolean r2 = r3.i(r0)
            if (r2 == 0) goto L1a
            r3.a(r0)
            return r1
        L33:
            int r4 = r1.size()
            java.lang.String r0 = "Arguments count limit reached: "
            java.lang.String r4 = eh.a.l(r4, r0)
            ah.a.k(r4)
            r4 = 0
            return r4
        L42:
            java.lang.String r4 = "Unexpected end of signature"
            ah.a.k(r4)
            r4 = 0
            return r4
    }

    public final qd.j d(boolean r10) {
            r9 = this;
            int r0 = r9.f14310c
            r9.f14311d = r0
        L4:
            r0 = 46
            if (r10 == 0) goto L17
            boolean r1 = r9.i(r0)
            if (r1 == 0) goto L17
            java.lang.String r10 = r9.h()
            qd.j r10 = qd.j.x(r10)
            return r10
        L17:
            char r1 = r9.j()
            r2 = 0
            if (r1 != 0) goto L1f
            return r2
        L1f:
            r3 = 60
            r4 = 59
            if (r1 == r3) goto L27
            if (r1 != r4) goto L4
        L27:
            java.lang.String r3 = r9.f14308a
            java.lang.String r5 = ""
            r6 = 0
            r7 = -1
            r8 = 47
            if (r1 != r4) goto L50
            if (r10 == 0) goto L47
            int r10 = r9.f14311d
            if (r10 != r7) goto L38
            goto L39
        L38:
            r6 = r10
        L39:
            int r10 = r9.f14310c
            if (r6 < r10) goto L3e
            goto L42
        L3e:
            java.lang.String r5 = r3.substring(r6, r10)
        L42:
            java.lang.String r10 = r5.replace(r8, r0)
            goto L4b
        L47:
            java.lang.String r10 = r9.h()
        L4b:
            qd.j r10 = qd.j.x(r10)
            return r10
        L50:
            int r1 = r9.f14311d
            if (r1 != r7) goto L55
            goto L56
        L55:
            r6 = r1
        L56:
            int r1 = r9.f14310c
            if (r6 < r1) goto L5b
            goto L5f
        L5b:
            java.lang.String r5 = r3.substring(r6, r1)
        L5f:
            if (r10 != 0) goto L68
            java.lang.String r10 = ";"
            java.lang.String r10 = r5.concat(r10)
            goto L6c
        L68:
            java.lang.String r10 = r5.replace(r8, r0)
        L6c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L71:
            r3 = 42
            boolean r3 = r9.i(r3)
            r5 = 1
            if (r3 == 0) goto L88
            r9.j()
            qd.g r3 = qd.j.f10868b
            qd.i r3 = new qd.i
            qd.e r6 = qd.j.f10877k
            r7 = 2
            r3.<init>(r7, r6)
            goto Lbc
        L88:
            r3 = 43
            boolean r3 = r9.i(r3)
            if (r3 == 0) goto La0
            r9.j()
            qd.j r3 = r9.e()
            qd.g r6 = qd.j.f10868b
            qd.i r6 = new qd.i
            r6.<init>(r5, r3)
        L9e:
            r3 = r6
            goto Lbc
        La0:
            r3 = 45
            boolean r3 = r9.i(r3)
            if (r3 == 0) goto Lb8
            r9.j()
            qd.j r3 = r9.e()
            qd.g r6 = qd.j.f10868b
            qd.i r6 = new qd.i
            r7 = 3
            r6.<init>(r7, r3)
            goto L9e
        Lb8:
            qd.j r3 = r9.e()
        Lbc:
            if (r3 == 0) goto Lc1
            r1.add(r3)
        Lc1:
            r6 = 62
            if (r3 == 0) goto Lcb
            boolean r3 = r9.i(r6)
            if (r3 == 0) goto L71
        Lcb:
            r9.a(r6)
            qd.g r3 = qd.j.f10868b
            qd.b r3 = new qd.b
            java.lang.String r10 = xe.s.b(r10)
            r3.<init>(r10, r1)
            boolean r10 = r9.i(r0)
            if (r10 != 0) goto Le3
            r9.a(r4)
            return r3
        Le3:
            r9.a(r0)
            r9.j()
            qd.j r10 = r9.d(r5)
            if (r10 == 0) goto L120
        Lef:
            boolean r1 = r9.i(r0)
            if (r1 == 0) goto L118
            qd.f r1 = new qd.f
            qd.e r10 = (qd.e) r10
            r1.<init>(r3, r10)
            r9.a(r0)
            r9.j()
            qd.j r10 = r9.d(r5)
            if (r10 == 0) goto L10a
            r3 = r1
            goto Lef
        L10a:
            java.lang.String r10 = r9.f()
            java.lang.String r0 = "Unexpected inner type found: "
            java.lang.String r10 = wb.en.g(r0, r10)
            ah.a.k(r10)
            return r2
        L118:
            qd.f r0 = new qd.f
            qd.e r10 = (qd.e) r10
            r0.<init>(r3, r10)
            return r0
        L120:
            java.lang.String r10 = r9.f()
            java.lang.String r0 = "No inner type found: "
            java.lang.String r10 = wb.en.g(r0, r10)
            ah.a.k(r10)
            return r2
    }

    public final qd.j e() {
            r5 = this;
            char r0 = r5.j()
            r1 = 0
            if (r0 == 0) goto L8c
            r2 = 76
            if (r0 == r2) goto L64
            r2 = 84
            if (r0 == r2) goto L26
            r1 = 91
            if (r0 == r1) goto L1a
            qd.g r1 = qd.j.y(r0)
            if (r1 == 0) goto L6c
            return r1
        L1a:
            qd.j r0 = r5.e()
            qd.g r1 = qd.j.f10868b
            qd.a r1 = new qd.a
            r1.<init>(r0)
            return r1
        L26:
            r5.j()
            int r2 = r5.f14310c
            r5.f14311d = r2
        L2d:
            r3 = 59
            boolean r4 = r5.i(r3)
            if (r4 == 0) goto L3a
            java.lang.String r2 = r5.h()
            goto L43
        L3a:
            char r4 = r5.j()
            if (r4 != 0) goto L2d
            r5.f14310c = r2
            r2 = r1
        L43:
            if (r2 == 0) goto L6c
            r5.a(r3)
            java.lang.String r0 = ")"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L5a
            qd.g r0 = qd.j.f10868b
            qd.c r0 = new qd.c
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r0.<init>(r2, r1)
            return r0
        L5a:
            java.lang.String r0 = "Bad name for type variable: "
            java.lang.String r0 = r0.concat(r2)
            ah.a.k(r0)
            return r1
        L64:
            r1 = 0
            qd.j r1 = r5.d(r1)
            if (r1 == 0) goto L6c
            return r1
        L6c:
            af.g r1 = new af.g
            java.lang.String r2 = r5.f()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't parse type: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = ", unexpected: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L8c:
            return r1
    }

    public final java.lang.String f() {
            r4 = this;
            int r0 = r4.f14310c
            java.lang.String r1 = r4.f14308a
            int r2 = r1.length()
            if (r0 < r2) goto Lb
            return r1
        Lb:
            int r0 = r4.f14310c
            char r2 = r1.charAt(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " at position "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = " ('"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = "')"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }

    public final java.lang.String h() {
            r3 = this;
            int r0 = r3.f14311d
            r1 = -1
            if (r0 != r1) goto L6
            r0 = 0
        L6:
            int r1 = r3.f14310c
            int r1 = r1 + 1
            if (r0 < r1) goto Lf
            java.lang.String r0 = ""
            return r0
        Lf:
            java.lang.String r2 = r3.f14308a
            java.lang.String r0 = r2.substring(r0, r1)
            return r0
    }

    public final boolean i(char r4) {
            r3 = this;
            int r0 = r3.f14310c
            r1 = 1
            int r0 = r0 + r1
            int r2 = r3.f14309b
            if (r0 >= r2) goto L11
            java.lang.String r2 = r3.f14308a
            char r0 = r2.charAt(r0)
            if (r0 != r4) goto L11
            return r1
        L11:
            r4 = 0
            return r4
    }

    public final char j() {
            r2 = this;
            int r0 = r2.f14310c
            int r0 = r0 + 1
            r2.f14310c = r0
            int r1 = r2.f14309b
            if (r0 < r1) goto Lc
            r0 = 0
            return r0
        Lc:
            java.lang.String r1 = r2.f14308a
            char r0 = r1.charAt(r0)
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.f14310c
            r1 = -1
            java.lang.String r2 = r5.f14308a
            if (r0 != r1) goto L8
            return r2
        L8:
            r0 = 0
            int r1 = r5.f14311d
            java.lang.String r0 = r2.substring(r0, r1)
            int r1 = r5.f14311d
            int r3 = r5.f14310c
            java.lang.String r1 = r2.substring(r1, r3)
            int r3 = r5.f14310c
            java.lang.String r2 = r2.substring(r3)
            java.lang.String r3 = "{"
            java.lang.String r4 = "}"
            java.lang.String r0 = bc.e.v(r0, r3, r1, r4, r2)
            return r0
    }
}
