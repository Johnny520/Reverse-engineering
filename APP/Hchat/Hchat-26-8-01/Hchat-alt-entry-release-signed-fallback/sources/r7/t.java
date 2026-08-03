package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements r7.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r7.u f11584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11585h;

    public t(r7.u r1) {
            r0 = this;
            r0.<init>()
            r0.f11584g = r1
            int r1 = r1.f7388g
            r0.f11585h = r1
            return
    }

    @Override // r7.m
    public final k7.a d(java.lang.Class r2) {
            r1 = this;
            r7.u r0 = r1.f11584g
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L9
            return r0
        L9:
            r2 = 0
            return r2
    }

    @Override // r7.g
    public final int get() {
            r1 = this;
            int r0 = r1.f11585h
            return r0
    }

    @Override // r7.g
    public final void k(int r1) {
            r0 = this;
            r0.f11585h = r1
            return
    }
}
