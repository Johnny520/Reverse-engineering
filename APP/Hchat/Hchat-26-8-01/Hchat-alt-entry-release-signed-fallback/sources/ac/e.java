package ac;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ac.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f169b;

    public e(int r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f166a = r1
            r0.f169b = r2
            return
    }

    @Override // ac.b
    public final byte a() {
            r1 = this;
            r0 = 3
            return r0
    }

    @Override // ac.b
    public final boolean b() {
            r2 = this;
            float r0 = r2.f169b
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // ac.b
    public final float c() {
            r1 = this;
            float r0 = r1.f169b
            return r0
    }

    @Override // ac.b
    public final int d() {
            r1 = this;
            float r0 = r1.f169b
            int r0 = (int) r0
            return r0
    }

    @Override // ac.b
    public final long e() {
            r2 = this;
            float r0 = r2.f169b
            long r0 = (long) r0
            return r0
    }

    @Override // ac.b
    public final java.lang.String f() {
            r1 = this;
            float r0 = r1.f169b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
