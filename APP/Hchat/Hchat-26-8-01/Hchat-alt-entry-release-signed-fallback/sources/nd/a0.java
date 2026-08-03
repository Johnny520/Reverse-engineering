package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements oc.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final nd.a0 f9349h = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Set f9350g;

    static {
            nd.a0 r0 = new nd.a0
            java.util.Set r1 = java.util.Collections.EMPTY_SET
            r0.<init>(r1)
            nd.a0.f9349h = r0
            return
    }

    public a0(java.util.Set r1) {
            r0 = this;
            r0.<init>()
            r0.f9350g = r1
            return
    }

    @Override // oc.b
    public final /* bridge */ /* synthetic */ oc.a a() {
            r1 = this;
            md.b r0 = md.b.f8864s
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            nd.a0 r0 = nd.a0.f9349h
            if (r2 != r0) goto L7
            java.lang.String r0 = "TYPE_VARS: EMPTY"
            return r0
        L7:
            java.util.Set r0 = r2.f9350g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "TYPE_VARS: "
            java.lang.String r0 = r1.concat(r0)
            return r0
    }
}
