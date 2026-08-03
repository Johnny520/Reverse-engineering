package u4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements z4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h4.u f13366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z4.g f13367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13368d;

    public b(int r5, h4.u r6, z4.g r7, int r8) {
            r4 = this;
            r4.<init>()
            if (r5 < 0) goto L99
            r6.k()     // Catch: java.lang.NullPointerException -> L92
            java.lang.Object[] r0 = r6.f22543h
            int r0 = r0.length
            if (r0 == 0) goto L8b
            int r1 = r0 + (-2)
        Lf:
            r2 = 1
            if (r1 < 0) goto L2e
            java.lang.Object r3 = r6.l(r1)
            u4.i r3 = (u4.i) r3
            u4.r r3 = r3.f13382g
            int r3 = r3.f13410e
            if (r3 != r2) goto L21
            int r1 = r1 + (-1)
            goto Lf
        L21:
            java.lang.String r5 = "insns["
            java.lang.String r6 = "] is a branch or can throw"
            java.lang.String r5 = eh.a.m(r1, r5, r6)
            j8.o.t(r5)
            r5 = 0
            throw r5
        L2e:
            int r0 = r0 - r2
            java.lang.Object r0 = r6.l(r0)
            u4.i r0 = (u4.i) r0
            u4.r r0 = r0.f13382g
            int r0 = r0.f13410e
            if (r0 == r2) goto L84
            r7.k()     // Catch: java.lang.NullPointerException -> L7d
            r0 = -1
            if (r8 < r0) goto L76
            if (r8 < 0) goto L6d
            int r1 = r7.m(r8)
            if (r1 < 0) goto L4a
            r0 = r1
        L4a:
            if (r0 < 0) goto L4d
            goto L4e
        L4d:
            r2 = 0
        L4e:
            if (r2 == 0) goto L51
            goto L6d
        L51:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "primarySuccessor "
            r6.<init>(r0)
            r6.append(r8)
            java.lang.String r8 = " not in successors "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L6d:
            r4.f13365a = r5
            r4.f13366b = r6
            r4.f13367c = r7
            r4.f13368d = r8
            return
        L76:
            java.lang.String r5 = "primarySuccessor < -1"
            j8.o.t(r5)
            r5 = 0
            throw r5
        L7d:
            java.lang.String r5 = "successors == null"
            bsh.j.c(r5)
            r5 = 0
            throw r5
        L84:
            java.lang.String r5 = "insns does not end with a branch or throwing instruction"
            j8.o.t(r5)
            r5 = 0
            throw r5
        L8b:
            java.lang.String r5 = "insns.size() == 0"
            j8.o.t(r5)
            r5 = 0
            throw r5
        L92:
            java.lang.String r5 = "insns == null"
            bsh.j.c(r5)
            r5 = 0
            throw r5
        L99:
            java.lang.String r5 = "label < 0"
            j8.o.t(r5)
            r5 = 0
            throw r5
    }

    @Override // z4.h
    public final int a() {
            r1 = this;
            int r0 = r1.f13365a
            return r0
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r1 = this;
            int r0 = java.lang.System.identityHashCode(r1)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{"
            r0.<init>(r1)
            int r1 = r2.f13365a
            java.lang.String r1 = a.a.X0(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
