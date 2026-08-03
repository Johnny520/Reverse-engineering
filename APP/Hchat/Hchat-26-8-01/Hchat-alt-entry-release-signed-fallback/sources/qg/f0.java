package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements qg.o0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11045g;

    public f0(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f11045g = r1
            return
    }

    @Override // qg.o0
    public final boolean b() {
            r1 = this;
            boolean r0 = r1.f11045g
            return r0
    }

    @Override // qg.o0
    public final qg.a1 d() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Empty{"
            r0.<init>(r1)
            boolean r1 = r3.f11045g
            if (r1 == 0) goto Le
            java.lang.String r1 = "Active"
            goto L10
        Le:
            java.lang.String r1 = "New"
        L10:
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = eh.a.q(r0, r1, r2)
            return r0
    }
}
