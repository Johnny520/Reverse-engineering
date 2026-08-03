package u4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends z4.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u4.o[] f13404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13405i;

    static {
            u4.q r0 = new u4.q
            r1 = 0
            r0.<init>(r1)
            return
    }

    public q(int r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2.<init>(r1)
            u4.o[] r3 = new u4.o[r3]
            r2.f13404h = r3
            r2.f13405i = r0
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof u4.q
            r1 = 0
            if (r0 != 0) goto L6
            goto L33
        L6:
            u4.q r7 = (u4.q) r7
            u4.o[] r0 = r7.f13404h
            u4.o[] r2 = r6.f13404h
            int r3 = r2.length
            int r4 = r0.length
            if (r3 != r4) goto L33
            int r4 = r6.size()
            int r7 = r7.size()
            if (r4 == r7) goto L1b
            goto L33
        L1b:
            r7 = r1
        L1c:
            if (r7 >= r3) goto L31
            r4 = r2[r7]
            r5 = r0[r7]
            if (r4 != r5) goto L25
            goto L2e
        L25:
            if (r4 == 0) goto L33
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L2e
            goto L33
        L2e:
            int r7 = r7 + 1
            goto L1c
        L31:
            r7 = 1
            return r7
        L33:
            return r1
    }

    public final int hashCode() {
            r6 = this;
            u4.o[] r0 = r6.f13404h
            int r1 = r0.length
            r2 = 0
            r3 = r2
            r4 = r3
        L6:
            if (r3 >= r1) goto L18
            r5 = r0[r3]
            if (r5 != 0) goto Le
            r5 = r2
            goto L12
        Le:
            int r5 = r5.hashCode()
        L12:
            int r4 = r4 * 31
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L6
        L18:
            return r4
    }

    public final u4.o l(int r2) {
            r1 = this;
            u4.o[] r0 = r1.f13404h     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5
            r2 = r0[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5
            return r2
        L5:
            java.lang.String r2 = "bogus reg"
            j8.o.t(r2)
            r2 = 0
            return r2
    }

    public final void m(u4.o r7) {
            r6 = this;
            u4.o[] r0 = r6.f13404h
            r6.j()
            if (r7 == 0) goto L31
            r1 = -1
            r6.f13405i = r1
            int r1 = r7.f13400g     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
            r0[r1] = r7     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
            r2 = 0
            r3 = 2
            if (r1 <= 0) goto L20
            int r4 = r1 + (-1)
            r5 = r0[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
            if (r5 == 0) goto L20
            int r5 = r5.j()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
            if (r5 != r3) goto L20
            r0[r4] = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
        L20:
            int r7 = r7.j()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
            if (r7 != r3) goto L2a
            int r1 = r1 + 1
            r0[r1] = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
        L2a:
            return
        L2b:
            java.lang.String r7 = "spec.getReg() out of range"
            j8.o.t(r7)
            return
        L31:
            java.lang.String r7 = "spec == null"
            bsh.j.c(r7)
            return
    }

    public final void n(u4.o r3) {
            r2 = this;
            u4.o[] r0 = r2.f13404h     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r3 = r3.f13400g     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            r1 = 0
            r0[r3] = r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            r3 = -1
            r2.f13405i = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            return
        Lb:
            java.lang.String r3 = "bogus reg"
            j8.o.t(r3)
            return
    }

    public final int size() {
            r5 = this;
            int r0 = r5.f13405i
            if (r0 >= 0) goto L17
            u4.o[] r0 = r5.f13404h
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L9:
            if (r2 >= r1) goto L14
            r4 = r0[r2]
            if (r4 == 0) goto L11
            int r3 = r3 + 1
        L11:
            int r2 = r2 + 1
            goto L9
        L14:
            r5.f13405i = r3
            return r3
        L17:
            return r0
    }

    public final java.lang.String toString() {
            r7 = this;
            u4.o[] r0 = r7.f13404h
            int r1 = r0.length
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r1 * 25
            r2.<init>(r3)
            r3 = 123(0x7b, float:1.72E-43)
            r2.append(r3)
            r3 = 0
            r4 = r3
        L11:
            if (r3 >= r1) goto L26
            r5 = r0[r3]
            if (r5 == 0) goto L23
            if (r4 == 0) goto L1f
            java.lang.String r6 = ", "
            r2.append(r6)
            goto L20
        L1f:
            r4 = 1
        L20:
            r2.append(r5)
        L23:
            int r3 = r3 + 1
            goto L11
        L26:
            r0 = 125(0x7d, float:1.75E-43)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
