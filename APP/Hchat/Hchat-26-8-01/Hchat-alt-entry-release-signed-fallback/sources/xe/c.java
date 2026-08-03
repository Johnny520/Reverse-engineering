package xe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.j f21554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ud.h f21555b;

    public c(ud.h r1, ud.j r2) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r2)
            ud.j r2 = (ud.j) r2
            r0.f21554a = r2
            java.util.Objects.requireNonNull(r1)
            ud.h r1 = (ud.h) r1
            r0.f21555b = r1
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            ud.h r0 = r5.f21555b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            ud.j r1 = r5.f21554a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = ", parent="
            java.lang.String r3 = "}"
            java.lang.String r4 = "BlockParentContainer{"
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
    }
}
