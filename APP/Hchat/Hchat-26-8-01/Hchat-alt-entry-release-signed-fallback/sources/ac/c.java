package ac;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ac.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f167b;

    public c(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f166a = r1
            r0.f167b = r2
            return
    }

    @Override // ac.b
    public final byte a() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // ac.b
    public final boolean b() {
            r1 = this;
            boolean r0 = r1.f167b
            return r0
    }

    @Override // ac.b
    public final float c() {
            r1 = this;
            boolean r0 = r1.f167b
            if (r0 == 0) goto L7
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // ac.b
    public final int d() {
            r1 = this;
            boolean r0 = r1.f167b
            return r0
    }

    @Override // ac.b
    public final long e() {
            r2 = this;
            boolean r0 = r2.f167b
            if (r0 == 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // ac.b
    public final java.lang.String f() {
            r1 = this;
            boolean r0 = r1.f167b
            if (r0 == 0) goto L7
            java.lang.String r0 = "true"
            return r0
        L7:
            java.lang.String r0 = "false"
            return r0
    }
}
