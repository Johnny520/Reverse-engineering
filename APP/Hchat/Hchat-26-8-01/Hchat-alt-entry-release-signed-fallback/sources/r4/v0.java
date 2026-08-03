package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends r4.l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r4.b0 f11512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f11513l;

    public v0(r4.b0 r4, java.util.ArrayList r5) {
            r3 = this;
            int r0 = n(r5)
            r1 = 0
            java.lang.Object r1 = r5.get(r1)
            r4.l0 r1 = (r4.l0) r1
            int r2 = r5.size()
            int r1 = r1.c()
            int r1 = r1 * r2
            int r2 = n(r5)
            int r2 = r2 + r1
            r3.<init>(r0, r2)
            if (r4 == 0) goto L23
            r3.f11513l = r5
            r3.f11512k = r4
            return
        L23:
            java.lang.String r4 = "itemType == null"
            bsh.j.c(r4)
            r4 = 0
            throw r4
    }

    public static int n(java.util.ArrayList r1) {
            r0 = 0
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.NullPointerException -> Lf java.lang.IndexOutOfBoundsException -> L16
            r4.l0 r1 = (r4.l0) r1     // Catch: java.lang.NullPointerException -> Lf java.lang.IndexOutOfBoundsException -> L16
            int r1 = r1.f11443g     // Catch: java.lang.NullPointerException -> Lf java.lang.IndexOutOfBoundsException -> L16
            r0 = 4
            int r1 = java.lang.Math.max(r0, r1)     // Catch: java.lang.NullPointerException -> Lf java.lang.IndexOutOfBoundsException -> L16
            return r1
        Lf:
            java.lang.String r1 = "items == null"
            bsh.j.c(r1)
        L14:
            r1 = 0
            return r1
        L16:
            java.lang.String r1 = "items.size() == 0"
            j8.o.t(r1)
            goto L14
    }

    @Override // r4.a0
    public final void a(r4.p r3) {
            r2 = this;
            java.util.ArrayList r0 = r2.f11513l
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            r4.l0 r1 = (r4.l0) r1
            r1.a(r3)
            goto L6
        L16:
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r1.f11512k
            return r0
    }

    @Override // r4.l0
    public final void j(r4.k0 r8, int r9) {
            r7 = this;
            int r0 = r7.f11443g
            int r9 = r9 + r0
            java.util.ArrayList r0 = r7.f11513l
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
            r2 = -1
            r3 = r2
        Lc:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r0.next()
            r4.l0 r4 = (r4.l0) r4
            int r5 = r4.c()
            int r6 = r4.f11443g
            if (r1 == 0) goto L24
            r1 = 0
            r2 = r5
            r3 = r6
            goto L28
        L24:
            if (r5 != r2) goto L34
            if (r6 != r3) goto L2e
        L28:
            int r9 = r4.i(r8, r9)
            int r9 = r9 + r5
            goto Lc
        L2e:
            java.lang.String r8 = "item alignment mismatch"
            j8.o.w(r8)
            return
        L34:
            java.lang.String r8 = "item size mismatch"
            j8.o.w(r8)
        L39:
            return
    }

    @Override // r4.l0
    public final java.lang.String l() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            java.util.ArrayList r1 = r5.f11513l
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L13:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r1.next()
            r4.l0 r3 = (r4.l0) r3
            if (r2 == 0) goto L23
            r2 = 0
            goto L28
        L23:
            java.lang.String r4 = ", "
            r0.append(r4)
        L28:
            java.lang.String r3 = r3.l()
            r0.append(r3)
            goto L13
        L30:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // r4.l0
    public final void m(r4.p r5, z4.d r6) {
            r4 = this;
            java.util.ArrayList r0 = r4.f11513l
            int r1 = r0.size()
            boolean r2 = r6.d()
            if (r2 == 0) goto L3a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.g()
            r2.append(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            r4.b0 r3 = r4.f11512k
            java.lang.String r3 = r3.f11376i
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            r6.b(r3, r2)
            java.lang.String r2 = a.a.Y0(r1)
            java.lang.String r3 = "  size: "
            java.lang.String r2 = r3.concat(r2)
            r3 = 4
            r6.b(r3, r2)
        L3a:
            r6.k(r1)
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.next()
            r4.l0 r1 = (r4.l0) r1
            r1.d(r5, r6)
            goto L41
        L51:
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.Class<r4.v0> r1 = r4.v0.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.util.ArrayList r1 = r2.f11513l
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
