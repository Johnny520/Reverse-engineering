package ic;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements hc.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ic.d f6660g;

    public e(ic.d r1) {
            r0 = this;
            r0.<init>()
            r0.f6660g = r1
            return
    }

    @Override // hc.a
    public final int j() {
            r1 = this;
            r0 = 6
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            ic.d r0 = r6.f6660g
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r2 = r0.f6657j
            ud.r r0 = r0.f6654g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = ", name="
            java.lang.String r4 = ", mth="
            java.lang.String r5 = "VarRef{"
            java.lang.StringBuilder r1 = bc.e.p(r5, r1, r3, r2, r4)
            java.lang.String r2 = "}"
            java.lang.String r0 = eh.a.r(r1, r0, r2)
            return r0
    }
}
