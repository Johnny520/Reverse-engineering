package qb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qb.k f10799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f10800i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f10801j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b.e f10802k;

    public /* synthetic */ b(qb.k r1, android.app.Activity r2, java.util.ArrayList r3, b.e r4, int r5) {
            r0 = this;
            r0.f10798g = r5
            r0.f10799h = r1
            r0.f10800i = r2
            r0.f10801j = r3
            r0.f10802k = r4
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f10798g
            switch(r0) {
                case 0: goto L2d;
                default: goto L5;
            }
        L5:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r0 = 1
            qb.k r1 = r7.f10799h
            android.app.Activity r2 = r7.f10800i
            java.util.ArrayList r3 = r7.f10801j
            b.e r5 = r7.f10802k
            if (r8 != r0) goto L1d
            r4 = 1
            tf.t r6 = tf.t.f13167g
            r1.w(r2, r3, r4, r5, r6)
            goto L2a
        L1d:
            qb.b r8 = new qb.b
            r6 = 0
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r2.I(r3, r4, r5, r1)
        L2a:
            sf.n r8 = sf.n.f12433a
            return r8
        L2d:
            r5 = r8
            java.util.List r5 = (java.util.List) r5
            r5.getClass()
            r3 = 0
            qb.k r0 = r7.f10799h
            android.app.Activity r1 = r7.f10800i
            java.util.ArrayList r2 = r7.f10801j
            b.e r4 = r7.f10802k
            r0.w(r1, r2, r3, r4, r5)
            sf.n r8 = sf.n.f12433a
            return r8
    }
}
