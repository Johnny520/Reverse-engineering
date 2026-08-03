package ac;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ac.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f170b;

    public f(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f166a = r1
            r0.f170b = r2
            return
    }

    @Override // ac.b
    public final byte a() {
            r1 = this;
            r0 = 2
            return r0
    }

    @Override // ac.b
    public final boolean b() {
            r1 = this;
            int r0 = r1.f170b
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // ac.b
    public final float c() {
            r1 = this;
            int r0 = r1.f170b
            float r0 = (float) r0
            return r0
    }

    @Override // ac.b
    public final int d() {
            r1 = this;
            int r0 = r1.f170b
            return r0
    }

    @Override // ac.b
    public final long e() {
            r2 = this;
            int r0 = r2.f170b
            long r0 = (long) r0
            return r0
    }

    @Override // ac.b
    public final java.lang.String f() {
            r1 = this;
            int r0 = r1.f170b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
