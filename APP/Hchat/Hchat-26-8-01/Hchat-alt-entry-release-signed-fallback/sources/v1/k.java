package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends gg.m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v1.l[] f13977h;

    public /* synthetic */ k(v1.l[] r1, int r2) {
            r0 = this;
            r0.f13976g = r2
            r0.f13977h = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f13976g
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            v1.a1 r3 = (v1.a1) r3
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r0 = 0
            v1.l[] r1 = r2.f13977h
            float r3 = v1.w.d(r3, r0, r1, r4)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            return r3
        L19:
            v1.a1 r3 = (v1.a1) r3
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r0 = 1
            v1.l[] r1 = r2.f13977h
            float r3 = v1.w.d(r3, r0, r1, r4)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            return r3
    }
}
