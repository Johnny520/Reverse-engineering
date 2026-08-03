package l7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends l7.a implements java.lang.Iterable, java.lang.Comparable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s7.b f7890o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r7.y f7891p;

    public m() {
            r3 = this;
            p7.k r0 = new p7.k
            r0.<init>()
            r1 = 2
            r3.<init>(r0, r1)
            s7.c r1 = new s7.c
            r7.f r2 = r0.f10300t
            r1.<init>(r2)
            s7.b r2 = new s7.b
            r2.<init>(r0, r1)
            r3.f7890o = r2
            r3.P(r1)
            r3.P(r2)
            return
    }

    public static java.lang.String W(java.lang.String r2) {
        L0:
            int r0 = r2.length()
            if (r0 <= 0) goto L1e
            r0 = 0
            char r0 = r2.charAt(r0)
            r1 = 42
            if (r0 == r1) goto L18
            r1 = 43
            if (r0 == r1) goto L18
            r1 = 94
            if (r0 == r1) goto L18
            goto L1e
        L18:
            r0 = 1
            java.lang.String r2 = r2.substring(r0)
            goto L0
        L1e:
            return r2
    }

    @Override // k7.c
    public final void M() {
            r1 = this;
            p7.a r0 = r1.f7869m
            p7.k r0 = (p7.k) r0
            v7.y r0 = r0.f10302v
            r0.c()
            return
    }

    @Override // l7.a
    public final void S() {
            r0 = this;
            return
    }

    public final int U(l7.m r7) {
            r6 = this;
            p7.a r0 = r6.f7869m
            r1 = r0
            p7.k r1 = (p7.k) r1
            r7.c r1 = r1.f10298r
            int r1 = r1.get()
            p7.a r2 = r7.f7869m
            p7.a r7 = r7.f7869m
            p7.k r2 = (p7.k) r2
            r7.c r2 = r2.f10298r
            int r2 = r2.get()
            if (r1 == r2) goto L1e
            int r7 = y7.a.b(r1, r2)
            return r7
        L1e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r0
            p7.k r2 = (p7.k) r2
            r7.c r2 = r2.f10299s
            int r2 = r2.get()
            r2 = r2 & 3
            r3 = 1
            java.lang.String r4 = "0"
            java.lang.String r5 = "1"
            if (r2 != r3) goto L37
            r2 = r5
            goto L38
        L37:
            r2 = r4
        L38:
            r1.append(r2)
            p7.k r0 = (p7.k) r0
            v7.y r0 = r0.f10302v
            java.lang.String r0 = r0.T()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r7
            p7.k r2 = (p7.k) r2
            r7.c r2 = r2.f10299s
            int r2 = r2.get()
            r2 = r2 & 3
            if (r2 != r3) goto L5d
            r4 = r5
        L5d:
            r1.append(r4)
            p7.k r7 = (p7.k) r7
            v7.y r7 = r7.f10302v
            java.lang.String r7 = r7.T()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            int r7 = r0.compareTo(r7)
            return r7
    }

    public final java.lang.String V() {
            r5 = this;
            r7.y r0 = r5.f7891p
            p7.a r1 = r5.f7869m
            r2 = 0
            if (r0 == 0) goto L2e
            java.lang.Class<u7.d> r3 = u7.d.class
            k7.a r3 = r0.u(r3)
            u7.d r3 = (u7.d) r3
            int r0 = r0.f7388g
            if (r3 == 0) goto L1b
            int r0 = r0 + 1
            r7.f r3 = r3.f13535t
            int r3 = r3.f11560n
            int r0 = r0 + r3
            goto L1d
        L1b:
            int r0 = r0 + 1
        L1d:
            r3 = r1
            p7.k r3 = (p7.k) r3
            r7.c r3 = r3.f10298r
            byte[] r3 = r3.f11553k
            r4 = 0
            r3 = r3[r4]
            if (r0 != r3) goto L2c
            r7.y r0 = r5.f7891p
            goto L56
        L2c:
            r5.f7891p = r2
        L2e:
            java.lang.Class<o7.j> r0 = o7.j.class
            k7.a r0 = r5.u(r0)
            o7.j r0 = (o7.j) r0
            if (r0 == 0) goto L41
            java.lang.Class<l7.f> r3 = l7.f.class
            k7.a r0 = r0.u(r3)
            l7.f r0 = (l7.f) r0
            goto L42
        L41:
            r0 = r2
        L42:
            if (r0 != 0) goto L46
            r0 = r2
            goto L56
        L46:
            u7.d r0 = r0.f7876o
            p7.k r1 = (p7.k) r1
            r7.c r1 = r1.f10298r
            int r1 = r1.get()
            r7.y r0 = r0.c0(r1)
            r5.f7891p = r0
        L56:
            if (r0 == 0) goto L5b
            java.lang.String r0 = r0.f11578m
            return r0
        L5b:
            return r2
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            l7.m r1 = (l7.m) r1
            int r1 = r0.U(r1)
            return r1
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            s7.b r0 = r2.f7890o
            r1 = 0
            java.util.Iterator r0 = r0.n0(r1)
            return r0
    }

    @Override // k7.c, k7.a
    public final byte[] r() {
            r1 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1.K(r0)     // Catch: java.io.IOException -> Lb
            r0.close()     // Catch: java.io.IOException -> Lb
        Lb:
            byte[] r0 = r0.toByteArray()
            return r0
    }

    @Override // l7.a
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.V()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            p7.a r1 = r2.f7869m
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
