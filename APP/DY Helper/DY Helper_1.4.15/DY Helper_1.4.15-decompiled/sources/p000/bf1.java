package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bf1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1696;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.ky1 f1697;

    public /* synthetic */ bf1(p000.ky1 r1, int r2) {
            r0 = this;
            r0.f1696 = r2
            r0.f1697 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f1696
            ky1 r3 = (p000.ky1) r3
            switch(r0) {
                case 0: goto L1f;
                default: goto L7;
            }
        L7:
            r3.getClass()
            ky1 r2 = r2.f1697
            if (r2 == 0) goto L19
            long r0 = r3.f6323
            long r2 = r2.f6323
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L19
        L17:
            r2 = 0
            goto L1a
        L19:
            r2 = 1
        L1a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L1f:
            r3.getClass()
            ky1 r2 = r2.f1697
            if (r2 == 0) goto L30
            long r0 = r3.f6323
            long r2 = r2.f6323
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L30
            r2 = 1
            goto L31
        L30:
            r2 = 0
        L31:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }
}
