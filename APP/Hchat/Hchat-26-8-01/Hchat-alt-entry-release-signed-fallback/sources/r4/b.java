package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r4.l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t4.b f11355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r4.a[] f11356l;

    public b(t4.b r5, r4.p r6) {
            r4 = this;
            java.util.TreeMap r0 = r5.f13074h     // Catch: java.lang.NullPointerException -> L3c
            int r1 = r0.size()     // Catch: java.lang.NullPointerException -> L3c
            r2 = 4
            int r1 = r1 * r2
            int r1 = r1 + r2
            r4.<init>(r2, r1)
            r4.f11355k = r5
            int r5 = r0.size()
            r4.a[] r5 = new r4.a[r5]
            r4.f11356l = r5
            java.util.Collection r5 = r0.values()
            java.util.Collection r5 = java.util.Collections.unmodifiableCollection(r5)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        L23:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r5.next()
            t4.a r1 = (t4.a) r1
            r4.a[] r2 = r4.f11356l
            r4.a r3 = new r4.a
            r3.<init>(r6, r1)
            r2[r0] = r3
            int r0 = r0 + 1
            goto L23
        L3b:
            return
        L3c:
            java.lang.String r5 = "list == null"
            bsh.j.c(r5)
            r5 = 0
            throw r5
    }

    @Override // r4.a0
    public final void a(r4.p r5) {
            r4 = this;
            r4.k0 r5 = r5.f11490o
            r4.a[] r0 = r4.f11356l
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L15
            r3 = r0[r2]
            r4.l0 r3 = r5.l(r3)
            r4.a r3 = (r4.a) r3
            r0[r2] = r3
            int r2 = r2 + 1
            goto L6
        L15:
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.f11369v
            return r0
    }

    @Override // r4.l0
    public final int e(r4.l0 r2) {
            r1 = this;
            r4.b r2 = (r4.b) r2
            t4.b r0 = r1.f11355k
            t4.b r2 = r2.f11355k
            int r2 = r0.o(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            t4.b r0 = r1.f11355k
            java.util.TreeMap r0 = r0.f13074h
            int r0 = r0.hashCode()
            return r0
    }

    @Override // r4.l0
    public final void j(r4.k0 r1, int r2) {
            r0 = this;
            r4.a[] r1 = r0.f11356l
            a9.h r2 = r4.a.f11351n
            java.util.Arrays.sort(r1, r2)
            return
    }

    @Override // r4.l0
    public final java.lang.String l() {
            r1 = this;
            t4.b r0 = r1.f11355k
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // r4.l0
    public final void m(r4.p r12, z4.d r13) {
            r11 = this;
            boolean r12 = r13.d()
            r4.a[] r0 = r11.f11356l
            int r1 = r0.length
            r2 = 4
            r3 = 0
            if (r12 == 0) goto L25
            java.lang.String r4 = r11.g()
            java.lang.String r5 = " annotation set"
            java.lang.String r4 = r4.concat(r5)
            r13.b(r3, r4)
            java.lang.String r4 = a.a.Y0(r1)
            java.lang.String r5 = "  size: "
            java.lang.String r4 = r5.concat(r4)
            r13.b(r2, r4)
        L25:
            r13.k(r1)
            r4 = r3
        L29:
            if (r4 >= r1) goto Lca
            r5 = r0[r4]
            int r5 = r5.f()
            if (r12 == 0) goto Lc3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "  entries["
            r6.<init>(r7)
            java.lang.String r7 = java.lang.Integer.toHexString(r4)
            r6.append(r7)
            java.lang.String r7 = "]: "
            r6.append(r7)
            java.lang.String r7 = a.a.Y0(r5)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r13.b(r2, r6)
            r6 = r0[r4]
            r6.getClass()
            t4.a r6 = r6.f11352k
            int r7 = r6.f13071i
            java.lang.String r7 = p.a.c(r7)
            java.lang.String r8 = "    visibility: "
            java.lang.String r7 = r8.concat(r7)
            r13.b(r3, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "    type: "
            r7.<init>(r8)
            v4.d0 r8 = r6.f13070h
            w4.c r8 = r8.f14088g
            java.lang.String r8 = r8.a()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r13.b(r3, r7)
            java.util.TreeMap r6 = r6.f13072j
            java.util.Collection r6 = r6.values()
            java.util.Collection r6 = java.util.Collections.unmodifiableCollection(r6)
            java.util.Iterator r6 = r6.iterator()
        L91:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lc3
            java.lang.Object r7 = r6.next()
            t4.d r7 = (t4.d) r7
            v4.c0 r8 = r7.f13076g
            v4.a r7 = r7.f13077h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "    "
            r9.<init>(r10)
            java.lang.String r8 = r8.a()
            r9.append(r8)
            java.lang.String r8 = ": "
            r9.append(r8)
            java.lang.String r7 = p4.t.q(r7)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r13.b(r3, r7)
            goto L91
        Lc3:
            r13.k(r5)
            int r4 = r4 + 1
            goto L29
        Lca:
            return
    }
}
