package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bh implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15217i;

    public /* synthetic */ bh(java.lang.String r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f15215g = r3
            r0.f15216h = r1
            r0.f15217i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f15215g
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r3.f15216h
            i0.a1 r1 = r3.f15217i
            r1.setValue(r0)
        Lc:
            sf.n r0 = sf.n.f12433a
            return r0
        Lf:
            i0.a1 r0 = r3.f15217i
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r2 = r3.f15216h
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = tf.d0.S(r1, r2)
            goto L34
        L2a:
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = tf.d0.V(r1, r2)
        L34:
            r0.setValue(r1)
            goto Lc
    }
}
