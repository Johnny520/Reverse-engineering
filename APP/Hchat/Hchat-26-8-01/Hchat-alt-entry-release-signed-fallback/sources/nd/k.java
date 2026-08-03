package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends oc.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f9379h;

    public k(od.a r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f9378g = r0
            r1.f9379h = r2
            return
    }

    public k(qd.l r2) {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.f9378g = r0
            r1.f9379h = r2
            return
    }

    @Override // oc.b
    public final /* bridge */ /* synthetic */ oc.a a() {
            r1 = this;
            md.b r0 = md.b.f8857l
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            r0 = 1
            int r1 = r4.f9378g
            if (r1 == r0) goto Le
            r0 = 2
            if (r1 == r0) goto Lb
            java.lang.String r0 = "null"
            goto L10
        Lb:
            java.lang.String r0 = "VAR"
            goto L10
        Le:
            java.lang.String r0 = "CLASS_INSTANCE"
        L10:
            java.lang.Object r1 = r4.f9379h
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "REPLACE: "
            java.lang.String r3 = " "
            java.lang.String r0 = bc.e.j(r2, r0, r3, r1)
            return r0
    }
}
