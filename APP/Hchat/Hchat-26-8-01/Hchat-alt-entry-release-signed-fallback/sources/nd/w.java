package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends oc.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final nd.w f9399i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ud.p f9400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f9401h;

    static {
            nd.w r0 = new nd.w
            r1 = 0
            r0.<init>(r1, r1)
            nd.w.f9399i = r0
            return
    }

    public w(ud.p r1, int[] r2) {
            r0 = this;
            r0.<init>()
            r0.f9400g = r1
            r0.f9401h = r2
            return
    }

    @Override // oc.b
    public final /* bridge */ /* synthetic */ oc.a a() {
            r1 = this;
            md.b r0 = md.b.f8859n
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            ud.p r0 = r2.f9400g
            if (r0 != 0) goto L7
            java.lang.String r0 = "INLINE_NOT_NEEDED"
            return r0
        L7:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "INLINE: "
            java.lang.String r0 = r1.concat(r0)
            return r0
    }
}
