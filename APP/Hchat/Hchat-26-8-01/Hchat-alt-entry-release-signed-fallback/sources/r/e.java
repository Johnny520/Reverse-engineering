package r;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r.z f11161h;

    public /* synthetic */ e(r.z r1, int r2) {
            r0 = this;
            r0.f11160g = r2
            r0.f11161h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r6 = this;
            int r0 = r6.f11160g
            switch(r0) {
                case 0: goto L44;
                default: goto L5;
            }
        L5:
            r.z r0 = r6.f11161h
            m.r r1 = r0.f11289j
            boolean r1 = r1.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r.p r0 = r0.j()
            int r2 = r0.f11232n
            r3 = 1
            if (r2 != 0) goto L1b
            goto L3a
        L1b:
            java.lang.Object r2 = r0.f11229k
            java.lang.Object r2 = tf.m.C1(r2)
            r.q r2 = (r.q) r2
            if (r2 == 0) goto L3a
            int r4 = r2.f11236a
            int r5 = r0.f11232n
            int r5 = r5 - r3
            if (r4 >= r5) goto L2d
            goto L39
        L2d:
            int r4 = r2.f11250o
            int r2 = r2.f11251p
            int r4 = r4 + r2
            int r0 = r0.f11231m
            int r0 = r0 + 120
            if (r4 > r0) goto L39
            goto L3a
        L39:
            r3 = 0
        L3a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            sf.e r2 = new sf.e
            r2.<init>(r1, r0)
            return r2
        L44:
            r.z r0 = r6.f11161h
            r.p r0 = r0.j()
            int r0 = r0.f11232n
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }
}
