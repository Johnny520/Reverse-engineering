package u7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends u7.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f13529t;

    public /* synthetic */ b(boolean r1, boolean r2, okio.a r3, int r4) {
            r0 = this;
            r0.f13529t = r4
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // u7.c
    public final void W() {
            r1 = this;
            int r0 = r1.f13529t
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            super.W()
            java.lang.Class<l7.l> r0 = l7.l.class
            k7.a r0 = r1.v(r0)
            l7.l r0 = (l7.l) r0
            if (r0 == 0) goto L15
            r0.Y(r1)
        L15:
            return
        L16:
            super.W()
            java.lang.Class<l7.f> r0 = l7.f.class
            k7.a r0 = r1.u(r0)
            l7.f r0 = (l7.f) r0
            if (r0 == 0) goto L26
            r0.Z(r1)
        L26:
            return
    }
}
