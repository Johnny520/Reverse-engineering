package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.l2 f4910h;

    public /* synthetic */ i0(i0.l2 r1, int r2) {
            r0 = this;
            r0.f4909g = r2
            r0.f4910h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f4909g
            i0.l2 r1 = r3.f4910h
            switch(r0) {
                case 0: goto L31;
                case 1: goto L21;
                case 2: goto L16;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L11:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L16:
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            goto L11
        L21:
            i.n r0 = h0.m0.f4942a
            java.lang.Object r0 = r1.getValue()
            e1.b r0 = (e1.b) r0
            long r0 = r0.f2294a
            e1.b r2 = new e1.b
            r2.<init>(r0)
            return r2
        L31:
            java.lang.Object r0 = r1.getValue()
            e1.b r0 = (e1.b) r0
            long r0 = r0.f2294a
            e1.b r2 = new e1.b
            r2.<init>(r0)
            return r2
    }
}
