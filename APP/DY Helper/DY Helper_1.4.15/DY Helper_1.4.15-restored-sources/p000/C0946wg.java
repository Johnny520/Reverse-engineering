package p000;

/* JADX INFO: renamed from: wg */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0946wg implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11708;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.C1057zg f11709;

    public /* synthetic */ C0946wg(p000.C1057zg r1, int r2) {
            r0 = this;
            r0.f11708 = r2
            r0.f11709 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f11708
            s62 r1 = p000.s62.f9751
            java.lang.String r2 = "clean_misc_dialog"
            java.lang.String r3 = "clean_misc_control_"
            zg r7 = r7.f11709
            switch(r0) {
                case 0: goto L39;
                default: goto Ld;
            }
        Ld:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            bh r7 = r7.f13086
            java.lang.Object r0 = p000.ui1.f10844
            java.lang.String r0 = r7.f1716
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r0)
            java.lang.String r0 = "_follow_restore"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            p000.ui1.m5871(r4, r8)
            java.lang.String r7 = r7.f1716
            java.lang.String r7 = p000.lz1.m3674(r3, r7, r0)
            tg r8 = p000.AbstractC0871ug.f10771
            p000.C0834tg.m5649(r7, r2)
            return r1
        L39:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            bh r7 = r7.f13086
            java.lang.Object r0 = p000.ui1.f10844
            java.lang.String r0 = r7.f1716
            java.lang.String r4 = "_alpha"
            java.lang.String r0 = p000.lz1.m3674(r3, r0, r4)
            r5 = 0
            r6 = 100
            int r8 = p000.j81.m2906(r8, r5, r6)
            p000.ui1.m5873(r0, r8)
            java.lang.String r7 = r7.f1716
            java.lang.String r7 = p000.lz1.m3674(r3, r7, r4)
            tg r8 = p000.AbstractC0871ug.f10771
            p000.C0834tg.m5649(r7, r2)
            return r1
    }
}
