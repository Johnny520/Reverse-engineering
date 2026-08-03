package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a extends gg.j implements fg.p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final v1.a f13887n = null;

    static {
            v1.a r0 = new v1.a
            java.lang.String r4 = "min(II)I"
            r5 = 1
            r1 = 2
            java.lang.Class<ig.a> r2 = ig.a.class
            java.lang.String r3 = "min"
            r0.<init>(r1, r2, r3, r4, r5)
            v1.a.f13887n = r0
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r1 = java.lang.Math.min(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }
}
