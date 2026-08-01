package p000;

/* JADX INFO: renamed from: tb */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0829tb implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10268;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.util.LinkedHashSet f10269;

    public /* synthetic */ C0829tb(java.util.LinkedHashSet r1, int r2) {
            r0 = this;
            r0.f10268 = r2
            r0.f10269 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f10268
            java.util.LinkedHashSet r1 = r1.f10269
            switch(r0) {
                case 0: goto L1d;
                default: goto L7;
            }
        L7:
            id1 r2 = (p000.id1) r2
            r2.getClass()
            int r2 = r2.f5015
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r2)
            r1 = r1 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L1d:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.getClass()
            java.util.List r0 = p000.C0903vb.f11215
            int r1 = p000.C0903vb.m6165(r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            l91 r0 = new l91
            r0.<init>(r2, r1)
            return r0
    }
}
