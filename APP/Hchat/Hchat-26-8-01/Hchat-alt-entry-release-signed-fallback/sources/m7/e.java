package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends r7.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m7.c f8741p;

    public final void P() {
            r3 = this;
            int r0 = r3.f11551o
            int r0 = r0 + (-1)
            r1 = 0
            if (r0 < 0) goto L1e
            java.lang.Class<m7.t> r2 = m7.t.class
            k7.a r2 = r3.v(r2)
            m7.t r2 = (m7.t) r2
            if (r2 == 0) goto L14
            m7.d r2 = r2.f8769w
            goto L15
        L14:
            r2 = r1
        L15:
            if (r2 == 0) goto L1e
            k7.a r0 = r2.Q(r0)
            r1 = r0
            m7.c r1 = (m7.c) r1
        L1e:
            r3.f8741p = r1
            return
    }

    public final void Q(int r3) {
            r2 = this;
            r0 = -1
            if (r3 < r0) goto Le
            r0 = 65534(0xfffe, float:9.1833E-41)
            if (r3 > r0) goto Le
            int r3 = r3 + 1
            r2.k(r3)
            return
        Le:
            java.lang.String r0 = "Attribute position "
            java.lang.String r1 = " out of range, must be between -1 to 65534"
            java.lang.String r3 = eh.a.m(r3, r0, r1)
            okio.a.i(r3)
            return
    }

    public final void c() {
            r3 = this;
            m7.c r0 = r3.f8741p
            if (r0 == 0) goto L1d
            boolean r1 = r0.f7390i
            if (r1 != 0) goto L1d
            byte[] r1 = r0.f11553k
            r2 = 4
            int r1 = k7.a.s(r1, r2)
            if (r1 >= 0) goto L12
            goto L1d
        L12:
            k7.a r1 = r0.f7389h
            if (r1 != 0) goto L17
            goto L1d
        L17:
            int r0 = r0.f7388g
            r3.Q(r0)
            return
        L1d:
            r0 = 0
            r3.f8741p = r0
            r0 = -1
            r3.Q(r0)
            return
    }

    @Override // r7.a
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.f11551o
            int r1 = r1 + (-1)
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            m7.c r1 = r2.f8741p
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
