package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends i4.s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4.d[] f6488h;

    public u(int r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            r1.<init>(r0)
            w4.d[] r2 = new w4.d[r2]
            r1.f6488h = r2
            return
    }

    @Override // z4.k
    public final java.lang.String a() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            w4.d[] r2 = r5.f6488h
            int r3 = r2.length
            if (r1 >= r3) goto L3b
            r2 = r2[r1]
            if (r2 != 0) goto L12
            java.lang.String r2 = "<invalid>"
            goto L16
        L12:
            java.lang.String r2 = r2.toString()
        L16:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "locals["
            r3.<init>(r4)
            java.lang.String r4 = a.a.X0(r1)
            r3.append(r4)
            java.lang.String r4 = "]: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = "\n"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L3b:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // i4.s
    public final void l(i4.b0 r5) {
            r4 = this;
            r0 = 0
        L1:
            w4.d[] r1 = r4.f6488h
            int r2 = r1.length
            if (r0 >= r2) goto L31
            r1 = r1[r0]
            if (r1 != 0) goto Ld
            java.lang.String r1 = "<invalid>"
            goto L11
        Ld:
            java.lang.String r1 = r1.toString()
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "locals["
            r2.<init>(r3)
            java.lang.String r3 = a.a.X0(r0)
            r2.append(r3)
            java.lang.String r3 = "]: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.a(r1)
            int r0 = r0 + 1
            goto L1
        L31:
            return
    }

    @Override // i4.s
    public final i4.s m() {
            r5 = this;
            i4.u r0 = new i4.u
            w4.d[] r1 = r5.f6488h
            int r2 = r1.length
            r0.<init>(r2)
            w4.d[] r2 = r0.f6488h
            int r3 = r1.length
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r2, r4, r3)
            return r0
    }

    @Override // i4.s
    public final w4.d n(int r4) {
            r3 = this;
            w4.d[] r0 = r3.f6488h
            r0 = r0[r4]
            if (r0 == 0) goto L7
            return r0
        L7:
            i4.b0 r0 = new i4.b0
            java.lang.String r4 = a.a.X0(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "local "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ": invalid"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r1 = 0
            r0.<init>(r4, r1)
            throw r0
    }

    @Override // i4.s
    public final i4.u o() {
            r0 = this;
            return r0
    }

    @Override // i4.s
    public final void p(w4.c r6) {
            r5 = this;
            w4.d[] r0 = r5.f6488h
            int r1 = r0.length
            if (r1 != 0) goto L6
            goto L19
        L6:
            r5.j()
            w4.c r2 = r6.l()
            r3 = 0
        Le:
            if (r3 >= r1) goto L19
            r4 = r0[r3]
            if (r4 != r6) goto L16
            r0[r3] = r2
        L16:
            int r3 = r3 + 1
            goto Le
        L19:
            return
    }

    @Override // i4.s
    public final i4.s q(i4.s r2) {
            r1 = this;
            boolean r0 = r2 instanceof i4.u
            if (r0 == 0) goto Lb
            i4.u r2 = (i4.u) r2
            i4.u r2 = r1.u(r2)
            return r2
        Lb:
            i4.s r2 = r2.q(r1)
            return r2
    }

    @Override // i4.s
    public final i4.t r(i4.s r3, int r4) {
            r2 = this;
            i4.t r0 = new i4.t
            w4.d[] r1 = r2.f6488h
            int r1 = r1.length
            r0.<init>(r1)
            i4.t r3 = r0.r(r3, r4)
            return r3
    }

    @Override // i4.s
    public final void s(int r4, w4.d r5) {
            r3 = this;
            r3.j()
            w4.d r5 = r5.g()     // Catch: java.lang.NullPointerException -> L37
            if (r4 < 0) goto L31
            w4.c r0 = r5.getType()
            boolean r0 = r0.r()
            r1 = 0
            w4.d[] r2 = r3.f6488h
            if (r0 == 0) goto L1a
            int r0 = r4 + 1
            r2[r0] = r1
        L1a:
            r2[r4] = r5
            if (r4 == 0) goto L30
            int r4 = r4 + (-1)
            r5 = r2[r4]
            if (r5 == 0) goto L30
            w4.c r5 = r5.getType()
            boolean r5 = r5.r()
            if (r5 == 0) goto L30
            r2[r4] = r1
        L30:
            return
        L31:
            java.lang.String r4 = "idx < 0"
            okio.a.i(r4)
            return
        L37:
            java.lang.String r4 = "type == null"
            bsh.j.c(r4)
            return
    }

    @Override // i4.s
    public final void t(u4.o r2) {
            r1 = this;
            int r0 = r2.f13400g
            r1.s(r0, r2)
            return
    }

    public final i4.u u(i4.u r3) {
            r2 = this;
            i4.u r3 = x6.d.M(r2, r3)     // Catch: i4.b0 -> L5
            return r3
        L5:
            r0 = move-exception
            java.lang.String r1 = "underlay locals:"
            r0.a(r1)
            r2.l(r0)
            java.lang.String r1 = "overlay locals:"
            r0.a(r1)
            r3.l(r0)
            throw r0
    }
}
