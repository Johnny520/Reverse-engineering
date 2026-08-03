package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n4.a f10226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f10228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10233h;

    public u(n4.a r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f10226a = r1
            r0.f10227b = r3
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            r0.f10228c = r1
            r1 = -1
            r0.f10231f = r1
            r1 = 0
            r0.f10229d = r1
            r0.f10230e = r1
            r0.f10233h = r4
            return
    }

    public final void a(p4.h r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.f10228c
            r0.add(r2)
            boolean r0 = r1.f10229d
            if (r0 != 0) goto L12
            u4.t r0 = r2.f10115c
            int r0 = r0.f13518c
            if (r0 < 0) goto L12
            r0 = 1
            r1.f10229d = r0
        L12:
            boolean r0 = r1.f10230e
            if (r0 != 0) goto L1d
            boolean r2 = r2 instanceof p4.p
            if (r2 != 0) goto L1b
            return
        L1b:
            r2 = 0
            throw r2
        L1d:
            return
    }

    public final void b() {
            r14 = this;
            java.util.ArrayList r0 = r14.f10228c
            int r0 = r0.size()
            int r1 = r14.f10227b
            int r2 = r14.f10231f
            int r1 = r1 + r2
            int r2 = r14.f10232g
            int r1 = r1 + r2
            int r2 = r14.f10233h
            int r2 = r1 - r2
            a5.a r3 = new a5.a
            r4 = 11
            r3.<init>(r1, r4)
            r4 = 0
            r5 = r4
        L1b:
            r6 = 1
            if (r5 >= r1) goto L2c
            if (r5 < r2) goto L26
            int r7 = r5 + 1
            r3.d(r5, r7, r6)
            goto L29
        L26:
            r3.d(r5, r5, r6)
        L29:
            int r5 = r5 + 1
            goto L1b
        L2c:
            if (r4 >= r0) goto L87
            java.util.ArrayList r1 = r14.f10228c
            java.lang.Object r1 = r1.get(r4)
            p4.h r1 = (p4.h) r1
            boolean r2 = r1 instanceof p4.f
            if (r2 != 0) goto L84
            java.util.ArrayList r2 = r14.f10228c
            u4.p r5 = r1.f10116d
            java.lang.Object[] r7 = r5.f22543h
            int r7 = r7.length
            u4.p r8 = new u4.p
            r8.<init>(r7)
            r9 = 0
            r10 = r9
        L48:
            if (r10 >= r7) goto L73
            java.lang.Object r11 = r5.l(r10)
            u4.o r11 = (u4.o) r11
            if (r11 != 0) goto L54
        L52:
            r11 = 0
            goto L6d
        L54:
            java.lang.Object r12 = r3.f57i     // Catch: java.lang.IndexOutOfBoundsException -> L5f
            z4.g r12 = (z4.g) r12     // Catch: java.lang.IndexOutOfBoundsException -> L5f
            int r13 = r11.f13400g     // Catch: java.lang.IndexOutOfBoundsException -> L5f
            int r12 = r12.n(r13)     // Catch: java.lang.IndexOutOfBoundsException -> L5f
            goto L60
        L5f:
            r12 = -1
        L60:
            if (r12 < 0) goto L67
            u4.o r11 = r11.o(r12)
            goto L6d
        L67:
            java.lang.String r11 = "no mapping specified for register"
            bsh.j.g(r11)
            goto L52
        L6d:
            r8.m(r10, r11)
            int r10 = r10 + 1
            goto L48
        L73:
            r8.f22555g = r9
            boolean r7 = r8.equals(r5)
            if (r7 == 0) goto L7c
            goto L7d
        L7c:
            r5 = r8
        L7d:
            p4.h r1 = r1.k(r5)
            r2.set(r4, r1)
        L84:
            int r4 = r4 + 1
            goto L2c
        L87:
            int r0 = r14.f10232g
            int r0 = r0 + r6
            r14.f10232g = r0
            return
    }

    public final void c() {
            r5 = this;
            java.util.ArrayList r0 = r5.f10228c
            int r0 = r0.size()
            r1 = 0
        L7:
            r2 = 1
            if (r1 >= r0) goto L22
            java.util.ArrayList r3 = r5.f10228c
            java.lang.Object r3 = r3.get(r1)
            p4.h r3 = (p4.h) r3
            boolean r4 = r3 instanceof p4.f
            if (r4 != 0) goto L1f
            java.util.ArrayList r4 = r5.f10228c
            p4.h r2 = r3.j(r2)
            r4.set(r1, r2)
        L1f:
            int r1 = r1 + 1
            goto L7
        L22:
            int r0 = r5.f10231f
            int r0 = r0 + r2
            r5.f10231f = r0
            return
    }

    public final p4.j d(p4.h r5) {
            r4 = this;
            u4.p r0 = r5.f10116d
            p4.j r1 = r5.f10114b
            boolean r2 = r1.f10122e
            r3 = 0
            u4.p r0 = r0.r(r2, r3)
            p4.h r0 = r5.k(r0)
            p4.j r0 = r4.e(r0, r1)
            if (r0 == 0) goto L16
            return r0
        L16:
            e4.a r0 = new e4.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No expanded opcode for "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5, r3)
            throw r0
    }

    public final p4.j e(p4.h r3, p4.j r4) {
            r2 = this;
        L0:
            if (r4 == 0) goto L29
            f8.i r0 = r4.f10121d
            boolean r0 = r0.S(r3)
            if (r0 == 0) goto L10
            n4.a r3 = r2.f10226a
            r3.getClass()
            return r4
        L10:
            p4.j[] r0 = p4.k.f10123a
            int r4 = r4.f10120c
            r0 = -1
            r1 = 0
            if (r4 != r0) goto L1a
            r4 = r1
            goto L0
        L1a:
            int r4 = r4 + 1
            p4.j[] r0 = p4.k.f10123a     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L23
            r4 = r0[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L23
            if (r4 == 0) goto L23
            goto L0
        L23:
            java.lang.String r3 = "bogus opcode"
            j8.o.t(r3)
            return r1
        L29:
            return r4
    }

    public final boolean f(p4.j[] r15) {
            r14 = this;
            int r0 = r14.f10231f
            r1 = 0
            if (r0 >= 0) goto L6
            r0 = r1
        L6:
            r2 = r1
        L7:
            java.util.ArrayList r3 = r14.f10228c
            int r3 = r3.size()
            int r4 = r14.f10231f
            r5 = r1
        L10:
            if (r5 >= r3) goto L70
            java.util.ArrayList r6 = r14.f10228c
            java.lang.Object r6 = r6.get(r5)
            p4.h r6 = (p4.h) r6
            r7 = r15[r5]
            p4.j r8 = r14.e(r6, r7)
            if (r8 != 0) goto L68
            p4.j r7 = r14.d(r6)
            f8.i r7 = r7.f10121d
            java.util.BitSet r7 = r7.m(r6)
            p4.j r9 = r6.f10114b
            boolean r9 = r9.f10122e
            u4.p r6 = r6.f10116d
            java.lang.Object[] r10 = r6.f22543h
            int r10 = r10.length
            if (r9 == 0) goto L48
            boolean r11 = r7.get(r1)
            if (r11 != 0) goto L48
            java.lang.Object r11 = r6.l(r1)
            u4.o r11 = (u4.o) r11
            int r11 = r11.j()
            goto L49
        L48:
            r11 = r1
        L49:
            r12 = r1
        L4a:
            if (r9 >= r10) goto L60
            boolean r13 = r7.get(r9)
            if (r13 != 0) goto L5d
            java.lang.Object r13 = r6.l(r9)
            u4.o r13 = (u4.o) r13
            int r13 = r13.j()
            int r12 = r12 + r13
        L5d:
            int r9 = r9 + 1
            goto L4a
        L60:
            int r6 = java.lang.Math.max(r12, r11)
            if (r6 <= r4) goto L6b
            r4 = r6
            goto L6b
        L68:
            if (r7 != r8) goto L6b
            goto L6d
        L6b:
            r15[r5] = r8
        L6d:
            int r5 = r5 + 1
            goto L10
        L70:
            if (r0 < r4) goto L75
            r14.f10231f = r0
            return r2
        L75:
            int r0 = r4 - r0
            java.util.ArrayList r2 = r14.f10228c
            int r2 = r2.size()
            r3 = r1
        L7e:
            if (r3 >= r2) goto L98
            java.util.ArrayList r5 = r14.f10228c
            java.lang.Object r5 = r5.get(r3)
            p4.h r5 = (p4.h) r5
            boolean r6 = r5 instanceof p4.f
            if (r6 != 0) goto L95
            java.util.ArrayList r6 = r14.f10228c
            p4.h r5 = r5.j(r0)
            r6.set(r3, r5)
        L95:
            int r3 = r3 + 1
            goto L7e
        L98:
            r2 = 1
            r0 = r4
            goto L7
    }
}
