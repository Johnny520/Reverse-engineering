package ad;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements rf.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mh.b f224c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Set f225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rf.b f226b;

    static {
            java.lang.Class<ad.c> r0 = ad.c.class
            mh.b r0 = mh.d.b(r0)
            ad.c.f224c = r0
            return
    }

    public c(java.util.EnumSet r2) {
            r1 = this;
            r1.<init>()
            r1.f225a = r2
            zc.a r0 = zc.a.f22660i
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L13
            rf.c r2 = new rf.c
            r2.<init>()
            goto L15
        L13:
            rf.a r2 = rf.a.f11949a
        L15:
            r1.f226b = r2
            return
    }

    @Override // rf.b
    public final boolean a(nf.a r2) {
            r1 = this;
            rf.b r0 = r1.f226b
            boolean r2 = r0.a(r2)
            return r2
    }

    @Override // rf.b
    public final int b() {
            r1 = this;
            rf.b r0 = r1.f226b
            int r0 = r0.b()
            return r0
    }

    @Override // rf.b
    public final boolean c(java.lang.String r2) {
            r1 = this;
            rf.b r0 = r1.f226b
            boolean r2 = r0.c(r2)
            return r2
    }

    @Override // rf.b
    public final boolean d() {
            r1 = this;
            rf.b r0 = r1.f226b
            boolean r0 = r0.d()
            return r0
    }
}
