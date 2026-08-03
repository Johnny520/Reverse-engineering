package m0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends m0.j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0.a0 f8438c = null;

    static {
            m0.a0 r0 = new m0.a0
            r1 = 0
            r2 = 3
            r0.<init>(r1, r1, r2)
            m0.a0.f8438c = r0
            return
    }

    @Override // m0.j0
    public final void a(h0.s r1, i0.a r2, l0.k r3, b5.i r4, m0.k0 r5) {
            r0 = this;
            int r1 = r3.f7707n
            if (r1 != 0) goto L5
            goto La
        L5:
            java.lang.String r1 = "Cannot reset when inserting"
            i0.m.a(r1)
        La:
            r3.G()
            r1 = 0
            r3.f7713t = r1
            int r2 = r3.o()
            int r4 = r3.f7701h
            int r2 = r2 - r4
            r3.f7714u = r2
            r3.f7702i = r1
            r3.f7703j = r1
            r3.f7708o = r1
            return
    }
}
