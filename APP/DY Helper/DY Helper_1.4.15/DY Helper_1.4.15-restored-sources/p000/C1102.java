package p000;

/* JADX INFO: renamed from: а */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1102 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13426;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.util.Collection f13427;

    public /* synthetic */ C1102(int r1, java.util.Collection r2) {
            r0 = this;
            r0.f13426 = r1
            r0.f13427 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f13426
            java.util.Collection r1 = r1.f13427
            switch(r0) {
                case 0: goto L17;
                case 1: goto L12;
                default: goto L7;
            }
        L7:
            java.util.List r2 = (java.util.List) r2
            boolean r1 = r2.retainAll(r1)
        Ld:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L12:
            boolean r1 = r1.contains(r2)
            goto Ld
        L17:
            boolean r1 = r1.contains(r2)
            goto Ld
    }
}
