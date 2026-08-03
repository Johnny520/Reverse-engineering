package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends gg.m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v1.e f13923g = null;

    static {
            v1.e r0 = new v1.e
            r1 = 2
            r0.<init>(r1)
            v1.e.f13923g = r0
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            i0.h0 r4 = (i0.h0) r4
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r0 = r5 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = 0
        L11:
            r5 = r5 & r2
            boolean r5 = r4.S(r5, r0)
            if (r5 == 0) goto L19
            goto L1c
        L19:
            r4.V()
        L1c:
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
