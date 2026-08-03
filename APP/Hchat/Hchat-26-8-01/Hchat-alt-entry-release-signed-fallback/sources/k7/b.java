package k7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends o7.b implements k7.f {
    public b() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.b0(r1)
            return
    }

    @Override // k7.a
    public void B(q7.b r1) {
            r0 = this;
            r0.Y(r1)
            return
    }

    @Override // o7.b
    public final void W(k7.a r2) {
            r1 = this;
            r0 = 0
            r2.J(r0)
            r0 = -1
            r2.H(r0)
            return
    }

    @Override // o7.b
    public final void c0(int r4) {
            r3 = this;
            z7.c r0 = r3.f9563k
            int r0 = r0.size()
            r1 = r4
        L7:
            if (r1 >= r0) goto L13
            k7.a r2 = r3.Q(r1)
            r3.W(r2)
            int r1 = r1 + 1
            goto L7
        L13:
            r0 = 0
            r3.d0(r4, r0)
            return
    }

    public final java.util.Iterator j0(boolean r3) {
            r2 = this;
            z7.c r0 = r2.f9563k
            if (r3 == 0) goto L1e
            ce.n r3 = new ce.n
            r1 = 9
            r3.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L18
            z7.h r3 = z7.h.f22606g
            return r3
        L18:
            z7.k r1 = new z7.k
            r1.<init>(r0, r3)
            return r1
        L1e:
            java.util.Iterator r3 = r0.iterator()
            return r3
    }
}
