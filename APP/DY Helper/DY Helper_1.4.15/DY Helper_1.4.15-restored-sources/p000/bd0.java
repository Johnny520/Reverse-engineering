package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bd0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1659;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.nd0 f1660;

    public /* synthetic */ bd0(p000.nd0 r1, int r2) {
            r0 = this;
            r0.f1659 = r2
            r0.f1660 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f1659
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1d
            nd0 r4 = r4.f1660
            java.util.LinkedHashSet r4 = r4.f7527
            boolean r4 = r4.add(r5)
            if (r4 == 0) goto L1d
            r4 = 1
            goto L1e
        L1d:
            r4 = 0
        L1e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L23:
            pt r5 = (p000.C0699pt) r5
            r5.getClass()
            cd0 r0 = new cd0
            r1 = 0
            nd0 r4 = r4.f1660
            r0.<init>(r4, r5, r1)
            r4.m4029(r0)
            s62 r4 = p000.s62.f9751
            return r4
    }
}
