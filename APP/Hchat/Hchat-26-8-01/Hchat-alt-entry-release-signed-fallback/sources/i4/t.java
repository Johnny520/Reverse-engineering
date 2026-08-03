package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends i4.s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i4.u f6486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f6487i;

    public t(int r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            r1.<init>(r0)
            i4.u r0 = new i4.u
            r0.<init>(r2)
            r1.f6486h = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f6487i = r2
            return
    }

    public t(i4.t r6) {
            r5 = this;
            i4.u r0 = r6.f6486h
            w4.d[] r0 = r0.f6488h
            int r1 = r0.length
            r2 = 0
            if (r1 <= 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = r2
        Lb:
            r5.<init>(r1)
            i4.u r1 = new i4.u
            int r3 = r0.length
            r1.<init>(r3)
            w4.d[] r3 = r1.f6488h
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r2, r3, r2, r4)
            r5.f6486h = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList r1 = r6.f6487i
            int r1 = r1.size()
            r0.<init>(r1)
            r5.f6487i = r0
            java.util.ArrayList r0 = r6.f6487i
            int r0 = r0.size()
        L2f:
            if (r2 >= r0) goto L4c
            java.util.ArrayList r1 = r6.f6487i
            java.lang.Object r1 = r1.get(r2)
            i4.s r1 = (i4.s) r1
            java.util.ArrayList r3 = r5.f6487i
            if (r1 != 0) goto L42
            r1 = 0
            r3.add(r1)
            goto L49
        L42:
            i4.s r1 = r1.m()
            r3.add(r1)
        L49:
            int r2 = r2 + 1
            goto L2f
        L4c:
            return
    }

    public t(i4.u r2, java.util.ArrayList r3) {
            r1 = this;
            w4.d[] r0 = r2.f6488h
            int r0 = r0.length
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r0)
            r1.f6486h = r2
            r1.f6487i = r3
            return
    }

    @Override // z4.k
    public final java.lang.String a() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "(locals array set; primary)\n"
            r0.<init>(r1)
            i4.u r1 = r8.f6486h
            java.lang.String r1 = r1.a()
            r0.append(r1)
            r1 = 10
            r0.append(r1)
            java.util.ArrayList r2 = r8.f6487i
            int r3 = r2.size()
            r4 = 0
        L1c:
            if (r4 >= r3) goto L51
            java.lang.Object r5 = r2.get(r4)
            i4.s r5 = (i4.s) r5
            if (r5 == 0) goto L4e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "(locals array set: primary for caller "
            r6.<init>(r7)
            java.lang.String r7 = a.a.X0(r4)
            r6.append(r7)
            java.lang.String r7 = ")\n"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r0.append(r6)
            i4.u r5 = r5.o()
            java.lang.String r5 = r5.a()
            r0.append(r5)
            r0.append(r1)
        L4e:
            int r4 = r4 + 1
            goto L1c
        L51:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // z4.j
    public final void i() {
            r3 = this;
            i4.u r0 = r3.f6486h
            r1 = 0
            r0.f22555g = r1
            java.util.ArrayList r0 = r3.f6487i
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r0.next()
            i4.s r2 = (i4.s) r2
            if (r2 == 0) goto Lb
            r2.i()
            goto Lb
        L1d:
            r3.f22555g = r1
            return
    }

    @Override // i4.s
    public final void l(i4.b0 r7) {
            r6 = this;
            java.lang.String r0 = "(locals array set; primary)"
            r7.a(r0)
            i4.u r0 = r6.f6486h
            r0.l(r7)
            java.util.ArrayList r0 = r6.f6487i
            int r1 = r0.size()
            r2 = 0
        L11:
            if (r2 >= r1) goto L3f
            java.lang.Object r3 = r0.get(r2)
            i4.s r3 = (i4.s) r3
            if (r3 == 0) goto L3c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "(locals array set: primary for caller "
            r4.<init>(r5)
            java.lang.String r5 = a.a.X0(r2)
            r4.append(r5)
            r5 = 41
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r7.a(r4)
            i4.u r3 = r3.o()
            r3.l(r7)
        L3c:
            int r2 = r2 + 1
            goto L11
        L3f:
            return
    }

    @Override // i4.s
    public final i4.s m() {
            r1 = this;
            i4.t r0 = new i4.t
            r0.<init>(r1)
            return r0
    }

    @Override // i4.s
    public final w4.d n(int r2) {
            r1 = this;
            i4.u r0 = r1.f6486h
            w4.d r2 = r0.n(r2)
            return r2
    }

    @Override // i4.s
    public final i4.u o() {
            r1 = this;
            i4.u r0 = r1.f6486h
            return r0
    }

    @Override // i4.s
    public final void p(w4.c r3) {
            r2 = this;
            i4.u r0 = r2.f6486h
            w4.d[] r1 = r0.f6488h
            int r1 = r1.length
            if (r1 != 0) goto L8
            goto L26
        L8:
            r2.j()
            r0.p(r3)
            java.util.ArrayList r0 = r2.f6487i
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            i4.s r1 = (i4.s) r1
            if (r1 == 0) goto L14
            r1.p(r3)
            goto L14
        L26:
            return
    }

    @Override // i4.s
    public final i4.s q(i4.s r3) {
            r2 = this;
            boolean r0 = r3 instanceof i4.t     // Catch: i4.b0 -> Lc
            if (r0 == 0) goto Le
            r0 = r3
            i4.t r0 = (i4.t) r0     // Catch: i4.b0 -> Lc
            i4.t r3 = r2.v(r0)     // Catch: i4.b0 -> Lc
            goto L15
        Lc:
            r0 = move-exception
            goto L19
        Le:
            r0 = r3
            i4.u r0 = (i4.u) r0     // Catch: i4.b0 -> Lc
            i4.t r3 = r2.u(r0)     // Catch: i4.b0 -> Lc
        L15:
            r3.i()
            return r3
        L19:
            java.lang.String r1 = "underlay locals:"
            r0.a(r1)
            r2.l(r0)
            java.lang.String r1 = "overlay locals:"
            r0.a(r1)
            r3.l(r0)
            throw r0
    }

    @Override // i4.s
    public final i4.t r(i4.s r10, int r11) {
            r9 = this;
            java.util.ArrayList r0 = r9.f6487i
            int r1 = r0.size()
            r2 = 0
            if (r11 < r1) goto Lb
            r1 = r2
            goto L11
        Lb:
            java.lang.Object r1 = r0.get(r11)
            i4.s r1 = (i4.s) r1
        L11:
            i4.u r3 = r10.o()
            i4.u r4 = r9.f6486h
            i4.u r3 = r4.u(r3)
            if (r1 != r10) goto L1f
            r10 = r1
            goto L26
        L1f:
            if (r1 != 0) goto L22
            goto L26
        L22:
            i4.s r10 = r1.q(r10)
        L26:
            if (r10 != r1) goto L2b
            if (r3 != r4) goto L2b
            return r9
        L2b:
            int r1 = r0.size()
            int r3 = r11 + 1
            int r3 = java.lang.Math.max(r3, r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r5 = 0
            r6 = r2
        L3c:
            if (r5 >= r3) goto L63
            if (r5 != r11) goto L42
            r7 = r10
            goto L4c
        L42:
            if (r5 >= r1) goto L4b
            java.lang.Object r7 = r0.get(r5)
            i4.s r7 = (i4.s) r7
            goto L4c
        L4b:
            r7 = r2
        L4c:
            if (r7 == 0) goto L5d
            if (r6 != 0) goto L55
            i4.u r6 = r7.o()
            goto L5d
        L55:
            i4.u r8 = r7.o()
            i4.u r6 = r6.u(r8)
        L5d:
            r4.add(r7)
            int r5 = r5 + 1
            goto L3c
        L63:
            i4.t r10 = new i4.t
            r10.<init>(r6, r4)
            r10.i()
            return r10
    }

    @Override // i4.s
    public final void s(int r3, w4.d r4) {
            r2 = this;
            r2.j()
            i4.u r0 = r2.f6486h
            r0.s(r3, r4)
            java.util.ArrayList r0 = r2.f6487i
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            i4.s r1 = (i4.s) r1
            if (r1 == 0) goto Le
            r1.s(r3, r4)
            goto Le
        L20:
            return
    }

    @Override // i4.s
    public final void t(u4.o r2) {
            r1 = this;
            int r0 = r2.f13400g
            r1.s(r0, r2)
            return
    }

    public final i4.t u(i4.u r13) {
            r12 = this;
            r13.getClass()
            i4.u r0 = r12.f6486h
            i4.u r1 = r0.u(r13)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList r3 = r12.f6487i
            int r4 = r3.size()
            r2.<init>(r4)
            int r4 = r3.size()
            r5 = 0
            r6 = r5
            r7 = r6
        L1b:
            if (r6 >= r4) goto L47
            java.lang.Object r8 = r3.get(r6)
            i4.s r8 = (i4.s) r8
            if (r8 == 0) goto L38
            i4.s r9 = r8.q(r13)     // Catch: i4.b0 -> L2a
            goto L39
        L2a:
            r9 = move-exception
            java.lang.String r10 = a.a.X0(r6)
            java.lang.String r11 = "Merging one locals against caller block "
            java.lang.String r10 = r11.concat(r10)
            r9.a(r10)
        L38:
            r9 = 0
        L39:
            if (r7 != 0) goto L40
            if (r8 == r9) goto L3e
            goto L40
        L3e:
            r7 = r5
            goto L41
        L40:
            r7 = 1
        L41:
            r2.add(r9)
            int r6 = r6 + 1
            goto L1b
        L47:
            if (r0 != r1) goto L4c
            if (r7 != 0) goto L4c
            return r12
        L4c:
            i4.t r13 = new i4.t
            r13.<init>(r1, r2)
            return r13
    }

    public final i4.t v(i4.t r17) {
            r16 = this;
            r1 = r16
            r0 = r17
            i4.u r2 = r0.f6486h
            i4.u r3 = r1.f6486h
            i4.u r2 = r3.u(r2)
            java.util.ArrayList r4 = r1.f6487i
            int r5 = r4.size()
            java.util.ArrayList r6 = r0.f6487i
            int r7 = r6.size()
            int r8 = java.lang.Math.max(r5, r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r8)
            r11 = 0
            r12 = 0
        L23:
            if (r11 >= r8) goto L68
            r13 = 0
            if (r11 >= r5) goto L30
            java.lang.Object r0 = r4.get(r11)
            i4.s r0 = (i4.s) r0
            r14 = r0
            goto L31
        L30:
            r14 = r13
        L31:
            if (r11 >= r7) goto L3a
            java.lang.Object r0 = r6.get(r11)
            i4.s r0 = (i4.s) r0
            goto L3b
        L3a:
            r0 = r13
        L3b:
            if (r14 != r0) goto L3e
            goto L44
        L3e:
            if (r14 != 0) goto L42
            r13 = r0
            goto L59
        L42:
            if (r0 != 0) goto L46
        L44:
            r13 = r14
            goto L59
        L46:
            i4.s r13 = r14.q(r0)     // Catch: i4.b0 -> L4b
            goto L59
        L4b:
            r0 = move-exception
            java.lang.String r15 = a.a.X0(r11)
            java.lang.String r10 = "Merging locals set for caller block "
            java.lang.String r10 = r10.concat(r15)
            r0.a(r10)
        L59:
            if (r12 != 0) goto L60
            if (r14 == r13) goto L5e
            goto L60
        L5e:
            r12 = 0
            goto L62
        L60:
            r0 = 1
            r12 = r0
        L62:
            r9.add(r13)
            int r11 = r11 + 1
            goto L23
        L68:
            if (r3 != r2) goto L6d
            if (r12 != 0) goto L6d
            return r1
        L6d:
            i4.t r0 = new i4.t
            r0.<init>(r2, r9)
            return r0
    }
}
