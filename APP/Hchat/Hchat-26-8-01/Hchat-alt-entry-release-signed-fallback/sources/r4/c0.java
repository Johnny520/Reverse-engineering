package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends r4.l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r4.b0 f11378k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r4.o0 f11379l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r4.a0 f11380m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f11381n;

    public c0(r4.b0 r3, r4.o0 r4, r4.a0 r5, r4.a0 r6, int r7) {
            r2 = this;
            r0 = 4
            r1 = 12
            r2.<init>(r0, r1)
            if (r3 == 0) goto L2c
            if (r5 == 0) goto L25
            if (r6 == 0) goto L1e
            if (r7 <= 0) goto L17
            r2.f11378k = r3
            r2.f11379l = r4
            r2.f11380m = r5
            r2.f11381n = r7
            return
        L17:
            java.lang.String r3 = "itemCount <= 0"
            j8.o.t(r3)
            r3 = 0
            throw r3
        L1e:
            java.lang.String r3 = "lastItem == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
        L25:
            java.lang.String r3 = "firstItem == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
        L2c:
            java.lang.String r3 = "type == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
    }

    public c0(r4.k0 r3) {
            r2 = this;
            r0 = 4
            r1 = 12
            r2.<init>(r0, r1)
            if (r3 == 0) goto L15
            r4.b0 r0 = r4.b0.f11366s
            r2.f11378k = r0
            r2.f11379l = r3
            r3 = 0
            r2.f11380m = r3
            r3 = 1
            r2.f11381n = r3
            return
        L15:
            java.lang.String r3 = "section == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
    }

    public static void n(r4.o0[] r13, r4.k0 r14) {
            if (r13 == 0) goto L72
            java.util.ArrayList r0 = r14.f11433f
            int r0 = r0.size()
            if (r0 != 0) goto L6c
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 50
            r0.<init>(r1)
            int r1 = r13.length
            r2 = 0
            r3 = r2
        L14:
            if (r3 >= r1) goto L61
            r6 = r13[r3]
            java.util.Collection r4 = r6.c()
            java.util.Iterator r10 = r4.iterator()
            r4 = 0
            r9 = r2
            r5 = r4
            r7 = r5
            r8 = r7
        L25:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L49
            java.lang.Object r4 = r10.next()
            r11 = r4
            r4.a0 r11 = (r4.a0) r11
            r4.b0 r12 = r11.b()
            if (r12 == r5) goto L45
            if (r9 == 0) goto L42
            r4.c0 r4 = new r4.c0
            r4.<init>(r5, r6, r7, r8, r9)
            r0.add(r4)
        L42:
            r9 = r2
            r7 = r11
            r5 = r12
        L45:
            int r9 = r9 + 1
            r8 = r11
            goto L25
        L49:
            if (r9 == 0) goto L54
            r4.c0 r4 = new r4.c0
            r4.<init>(r5, r6, r7, r8, r9)
            r0.add(r4)
            goto L5e
        L54:
            if (r6 != r14) goto L5e
            r4.c0 r4 = new r4.c0
            r4.<init>(r14)
            r0.add(r4)
        L5e:
            int r3 = r3 + 1
            goto L14
        L61:
            r4.v0 r13 = new r4.v0
            r4.b0 r1 = r4.b0.f11366s
            r13.<init>(r1, r0)
            r14.k(r13)
            return
        L6c:
            java.lang.String r13 = "mapSection.items().size() != 0"
            j8.o.t(r13)
            return
        L72:
            java.lang.String r13 = "sections == null"
            bsh.j.c(r13)
            return
    }

    @Override // r4.a0
    public final void a(r4.p r1) {
            r0 = this;
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.D
            return r0
    }

    @Override // r4.l0
    public final java.lang.String l() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // r4.l0
    public final void m(r4.p r7, z4.d r8) {
            r6 = this;
            r4.b0 r7 = r6.f11378k
            int r0 = r7.f11374g
            r4.a0 r1 = r6.f11380m
            r4.o0 r2 = r6.f11379l
            if (r1 != 0) goto Lf
            int r1 = r2.b()
            goto L13
        Lf:
            int r1 = r2.a(r1)
        L13:
            boolean r2 = r8.d()
            int r3 = r6.f11381n
            r4 = 0
            if (r2 == 0) goto L80
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r6.g()
            r2.append(r5)
            r5 = 32
            r2.append(r5)
            java.lang.String r5 = r7.f11375h
            r2.append(r5)
            java.lang.String r5 = " map"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r8.b(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "  type:   "
            r2.<init>(r5)
            java.lang.String r5 = a.a.X0(r0)
            r2.append(r5)
            java.lang.String r5 = " // "
            r2.append(r5)
            java.lang.String r7 = r7.toString()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r2 = 2
            r8.b(r2, r7)
            java.lang.String r7 = "  unused: 0"
            r8.b(r2, r7)
            java.lang.String r7 = a.a.Y0(r3)
            java.lang.String r2 = "  size:   "
            java.lang.String r7 = r2.concat(r7)
            r2 = 4
            r8.b(r2, r7)
            java.lang.String r7 = a.a.Y0(r1)
            java.lang.String r5 = "  offset: "
            java.lang.String r7 = r5.concat(r7)
            r8.b(r2, r7)
        L80:
            r8.l(r0)
            r8.l(r4)
            r8.k(r3)
            r8.k(r1)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.Class<r4.c0> r1 = r4.c0.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r4.o0 r1 = r3.f11379l
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            r4.b0 r1 = r3.f11378k
            java.lang.String r1 = r1.f11376i
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = eh.a.q(r0, r1, r2)
            return r0
    }
}
