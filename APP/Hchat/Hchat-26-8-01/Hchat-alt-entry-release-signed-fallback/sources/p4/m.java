package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends p4.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p4.z[] f10214f;

    public m(u4.t r1, u4.p r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.Object[] r1 = r2.f22543h
            int r1 = r1.length
            if (r1 == 0) goto Lc
            r1 = 0
            r0.f10214f = r1
            return
        Lc:
            java.lang.String r1 = "registers.size() == 0"
            j8.o.t(r1)
            r1 = 0
            throw r1
    }

    @Override // p4.h
    public final java.lang.String a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p4.l, p4.h
    public final int b() {
            r5 = this;
            r5.m()
            p4.z[] r0 = r5.f10214f
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L8:
            if (r2 >= r1) goto L14
            r4 = r0[r2]
            int r4 = r4.b()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L8
        L14:
            return r3
    }

    @Override // p4.l, p4.h
    public final java.lang.String g() {
            r9 = this;
            u4.p r0 = r9.f10116d
            java.lang.Object[] r1 = r0.f22543h
            int r1 = r1.length
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 100
            r2.<init>(r3)
            r3 = 0
            r4 = r3
        Le:
            if (r3 >= r1) goto L3d
            java.lang.Object r5 = r0.l(r3)
            u4.o r5 = (u4.o) r5
            u4.t r6 = u4.t.f13515d
            w4.d r7 = r5.f13401h
            w4.c r7 = r7.getType()
            r8 = 0
            u4.o r7 = u4.o.k(r4, r7, r8)
            p4.z r6 = p4.h.h(r6, r7, r5)
            if (r3 == 0) goto L2e
            r7 = 10
            r2.append(r7)
        L2e:
            java.lang.String r6 = r6.g()
            r2.append(r6)
            int r5 = r5.j()
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto Le
        L3d:
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // p4.h
    public final p4.h k(u4.p r3) {
            r2 = this;
            p4.m r0 = new p4.m
            u4.t r1 = r2.f10115c
            r0.<init>(r1, r3)
            return r0
    }

    @Override // p4.l, p4.h
    public final void l(z4.d r5) {
            r4 = this;
            r4.m()
            p4.z[] r0 = r4.f10214f
            int r1 = r0.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L11
            r3 = r0[r2]
            r3.l(r5)
            int r2 = r2 + 1
            goto L7
        L11:
            return
    }

    public final void m() {
            r9 = this;
            p4.z[] r0 = r9.f10214f
            if (r0 == 0) goto L5
            goto L35
        L5:
            u4.p r0 = r9.f10116d
            java.lang.Object[] r1 = r0.f22543h
            int r1 = r1.length
            p4.z[] r2 = new p4.z[r1]
            r9.f10214f = r2
            r2 = 0
            r3 = r2
        L10:
            if (r2 >= r1) goto L35
            java.lang.Object r4 = r0.l(r2)
            u4.o r4 = (u4.o) r4
            p4.z[] r5 = r9.f10214f
            u4.t r6 = u4.t.f13515d
            w4.d r7 = r4.f13401h
            w4.c r7 = r7.getType()
            r8 = 0
            u4.o r7 = u4.o.k(r3, r7, r8)
            p4.z r6 = p4.h.h(r6, r7, r4)
            r5[r2] = r6
            int r4 = r4.j()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L10
        L35:
            return
    }
}
