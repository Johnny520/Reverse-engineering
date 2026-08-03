package s7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends s7.d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ce.n f12369p = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p7.k f12370o;

    static {
            ce.n r0 = new ce.n
            r1 = 26
            r0.<init>(r1)
            s7.b.f12369p = r0
            return
    }

    public b(p7.k r3, s7.c r4) {
            r2 = this;
            r7.f r0 = r3.f10301u
            okio.a r1 = v7.d.f14149l
            r2.<init>(r0, r4, r1)
            r2.f12370o = r3
            s7.a r4 = new s7.a
            r4.<init>(r2)
            r3.f10303w = r4
            return
    }

    @Override // o7.b
    public final void W(k7.a r2) {
            r1 = this;
            v7.d r2 = (v7.d) r2
            r0 = 0
            r2.N(r0)
            return
    }

    @Override // s7.d, o7.b
    public final void X() {
            r4 = this;
            super.X()
            p7.k r0 = r4.f12370o
            r7.c r0 = r0.f10299s
            int r1 = r0.get()
            r1 = r1 & (-4)
            o7.c r2 = r4.f12372n
            s7.c r2 = (s7.c) r2
            k7.f r2 = r2.f9564l
            okio.a r3 = r7.k.f11565n
            if (r2 != r3) goto L19
            r2 = 2
            goto L20
        L19:
            okio.a r3 = r7.k.f11567p
            if (r2 != r3) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            r1 = r1 | r2
            byte r1 = (byte) r1
            r0.P(r1)
            return
    }

    @Override // s7.d
    public final o7.c l0() {
            r1 = this;
            o7.c r0 = r1.f12372n
            s7.c r0 = (s7.c) r0
            return r0
    }

    public final v7.d m0(int r5) {
            r4 = this;
            o7.c r0 = r4.f12372n
            r1 = r0
            s7.c r1 = (s7.c) r1
            k7.f r1 = r1.f9564l
            okio.a r2 = r7.k.f11567p
            if (r1 != r2) goto L2f
            r1 = r0
            s7.c r1 = (s7.c) r1
            k7.f r1 = r1.f9564l
            if (r1 != r2) goto L2f
            s7.c r0 = (s7.c) r0
            z7.c r1 = r0.f9563k
            int r1 = r1.size()
            r2 = 0
        L1b:
            if (r2 >= r1) goto L2e
            k7.a r3 = r0.Q(r2)
            r7.k r3 = (r7.k) r3
            int r3 = r3.N()
            if (r5 != r3) goto L2b
            r5 = r2
            goto L2f
        L2b:
            int r2 = r2 + 1
            goto L1b
        L2e:
            r5 = -1
        L2f:
            k7.a r5 = r4.Q(r5)
            v7.d r5 = (v7.d) r5
            return r5
    }

    public final java.util.Iterator n0(boolean r3) {
            r2 = this;
            z7.c r0 = r2.f9563k
            if (r3 != 0) goto L9
            java.util.Iterator r3 = r0.iterator()
            return r3
        L9:
            java.util.Iterator r3 = r0.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L16
            z7.h r3 = z7.h.f22606g
            return r3
        L16:
            z7.k r0 = new z7.k
            ce.n r1 = s7.b.f12369p
            r0.<init>(r3, r1)
            return r0
    }
}
