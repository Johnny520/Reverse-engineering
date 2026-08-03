package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements oc.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ud.a f9373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ud.a f9374i;

    public h0(int r1, ud.a r2, ud.a r3) {
            r0 = this;
            r0.<init>()
            r0.f9372g = r1
            r0.f9373h = r2
            r0.f9374i = r3
            return
    }

    @Override // oc.b
    public final /* bridge */ /* synthetic */ oc.a a() {
            r1 = this;
            md.b r0 = md.b.B
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            r0 = 1
            int r1 = r5.f9372g
            if (r1 == r0) goto Le
            r0 = 2
            if (r1 == r0) goto Lb
            java.lang.String r0 = "null"
            goto L10
        Lb:
            java.lang.String r0 = "CROSS_EDGE"
            goto L10
        Le:
            java.lang.String r0 = "BACK_EDGE"
        L10:
            ud.a r1 = r5.f9373h
            java.lang.String r1 = java.lang.String.valueOf(r1)
            ud.a r2 = r5.f9374i
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = ": "
            java.lang.String r4 = " -> "
            java.lang.String r0 = bc.e.v(r0, r3, r1, r4, r2)
            return r0
    }
}
