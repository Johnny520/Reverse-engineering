package qd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends qd.l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f10905l;

    public n(long r4, qd.j r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L30
            boolean r0 = r6.v()
            if (r0 != 0) goto L10
            goto L30
        L10:
            af.g r0 = new af.g
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrong literal type: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = " for value: "
            r1.append(r6)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L30:
            r3.f10905l = r4
            r3.f10902i = r6
            return
    }

    @Override // qd.l
    public final qd.l H() {
            r4 = this;
            qd.n r0 = new qd.n
            long r1 = r4.f10905l
            qd.j r3 = r4.f10902i
            r0.<init>(r1, r3)
            r0.B(r4)
            ud.p r1 = r4.f10903j
            r0.V(r1)
            return r0
    }

    @Override // qd.l
    public final boolean R() {
            r4 = this;
            long r0 = r4.f10905l
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // qd.l
    public final void W(qd.j r1) {
            r0 = this;
            r0.f10902i = r1
            return
    }

    @Override // qd.l
    public final java.lang.String X() {
            r2 = this;
            long r0 = r2.f10905l
            java.lang.String r0 = java.lang.Long.toString(r0)
            return r0
    }

    public final boolean c0() {
            r3 = this;
            qd.j r0 = r3.f10902i
            qd.q r0 = r0.o()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto L1b
            r2 = 2
            if (r0 == r2) goto L1b
            r2 = 3
            if (r0 == r2) goto L1b
            r2 = 4
            if (r0 == r2) goto L1b
            r2 = 6
            if (r0 == r2) goto L1b
            r0 = 0
            return r0
        L1b:
            return r1
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L25
            java.lang.Class<qd.n> r2 = qd.n.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            qd.n r7 = (qd.n) r7
            long r2 = r6.f10905l
            long r4 = r7.f10905l
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L25
            qd.j r2 = r6.f10902i
            qd.j r7 = r7.f10902i
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L25
            return r0
        L25:
            return r1
    }

    public final int hashCode() {
            r5 = this;
            r0 = 32
            long r1 = r5.f10905l
            long r3 = r1 >>> r0
            long r0 = r1 ^ r3
            int r0 = (int) r0
            qd.j r1 = r5.f10902i
            int r1 = r1.f10893a
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r9 = this;
            java.lang.String r0 = ")"
            java.lang.String r1 = " "
            java.lang.String r2 = "("
            long r3 = r9.f10905l     // Catch: af.g -> L49
            qd.j r5 = r9.f10902i     // Catch: af.g -> L49
            xe.q r6 = xe.q.f21574b     // Catch: af.g -> L49
            r7 = 1
            r8 = 0
            java.lang.String r3 = fd.j.a(r3, r5, r6, r7, r8)     // Catch: af.g -> L49
            qd.j r4 = r9.f10902i     // Catch: af.g -> L49
            qd.g r5 = qd.j.f10869c     // Catch: af.g -> L49
            boolean r4 = r4.equals(r5)     // Catch: af.g -> L49
            if (r4 == 0) goto L2d
            java.lang.String r4 = "true"
            boolean r4 = r3.equals(r4)     // Catch: af.g -> L49
            if (r4 != 0) goto L2c
            java.lang.String r4 = "false"
            boolean r4 = r3.equals(r4)     // Catch: af.g -> L49
            if (r4 == 0) goto L2d
        L2c:
            return r3
        L2d:
            qd.j r4 = r9.f10902i     // Catch: af.g -> L49
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: af.g -> L49
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: af.g -> L49
            r5.<init>(r2)     // Catch: af.g -> L49
            r5.append(r3)     // Catch: af.g -> L49
            r5.append(r1)     // Catch: af.g -> L49
            r5.append(r4)     // Catch: af.g -> L49
            r5.append(r0)     // Catch: af.g -> L49
            java.lang.String r0 = r5.toString()     // Catch: af.g -> L49
            return r0
        L49:
            qd.j r3 = r9.f10902i
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            long r5 = r9.f10905l
            r4.append(r5)
            r4.append(r1)
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
    }
}
