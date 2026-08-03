package u7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends u7.c {
    @Override // u7.c, k7.c
    public final void M() {
            r1 = this;
            r1.U()
            r1.U()
            s7.g r0 = r1.f13531p
            r0.m0()
            return
    }

    @Override // u7.c, l7.a
    public final void R() {
            r0 = this;
            super.R()
            r0.c0()
            return
    }

    @Override // u7.c
    public final void Y(int r2, r7.s r3) {
            r1 = this;
            r7.o r3 = (r7.o) r3
            java.lang.Class<m7.f> r3 = m7.f.class
            k7.a r3 = r1.v(r3)
            m7.f r3 = (m7.f) r3
            if (r3 == 0) goto L13
            k7.c r3 = r3.f8760k
            m7.g r3 = (m7.g) r3
            m7.n r3 = r3.f8745p
            goto L14
        L13:
            r3 = 0
        L14:
            s7.f r3 = r3.f8757o
            z7.c r0 = r3.f9563k
            int r0 = r0.size()
            int r0 = r0 + (-1)
            if (r2 >= r0) goto L23
            r3.O(r2)
        L23:
            return
    }

    @Override // u7.c
    public final void Z() {
            r1 = this;
            super.Z()
            java.lang.Class<m7.f> r0 = m7.f.class
            k7.a r0 = r1.v(r0)
            m7.f r0 = (m7.f) r0
            if (r0 == 0) goto L14
            k7.c r0 = r0.f8760k
            m7.g r0 = (m7.g) r0
            m7.n r0 = r0.f8745p
            goto L15
        L14:
            r0 = 0
        L15:
            s7.f r0 = r0.f8757o
            r0.k0()
            return
    }

    public final void c0() {
            r7 = this;
            java.lang.Class<m7.f> r0 = m7.f.class
            k7.a r0 = r7.v(r0)
            m7.f r0 = (m7.f) r0
            if (r0 == 0) goto L11
            k7.c r0 = r0.f8760k
            m7.g r0 = (m7.g) r0
            m7.n r0 = r0.f8745p
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L15
            goto L56
        L15:
            s7.f r0 = r0.f8757o
            z7.c r1 = r0.f9563k
            int r1 = r1.size()
            s7.g r2 = r7.f13531p
            z7.c r3 = r2.f9563k
            int r3 = r3.size()
            if (r1 >= r3) goto L28
            goto L29
        L28:
            r1 = r3
        L29:
            r3 = 0
        L2a:
            if (r3 >= r1) goto L56
            k7.a r4 = r2.Q(r3)
            r7.o r4 = (r7.o) r4
            k7.a r5 = r0.Q(r3)
            r7.n r5 = (r7.n) r5
            if (r5 == 0) goto L4e
            r7.n r6 = r4.f11574t
            if (r6 != r5) goto L3f
            goto L45
        L3f:
            if (r6 != 0) goto L48
            r4.f11574t = r5
            r5.f11573p = r4
        L45:
            int r3 = r3 + 1
            goto L2a
        L48:
            java.lang.String r0 = "Resource id string item is already linked"
            j8.o.A(r0)
            return
        L4e:
            r4.getClass()
            java.lang.String r0 = "Can not link null id item"
            bsh.j.c(r0)
        L56:
            return
    }
}
