package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wy1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11903;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.um1 f11904;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.widget.TextView f11905;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.String f11906;

    public /* synthetic */ wy1(android.widget.TextView r2, p000.um1 r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.f11903 = r0
            r1.<init>()
            r1.f11905 = r2
            r1.f11904 = r3
            r1.f11906 = r4
            return
    }

    public /* synthetic */ wy1(p000.um1 r2, android.widget.TextView r3, java.lang.String r4) {
            r1 = this;
            r0 = 1
            r1.f11903 = r0
            r1.<init>()
            r1.f11904 = r2
            r1.f11905 = r3
            r1.f11906 = r4
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f11903
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            um1 r0 = r1.f11904
            r0.f10912 = r2
            java.lang.String r2 = r1.f11906
            java.lang.String r2 = p000.jz1.m3103(r0, r2)
            java.lang.String r0 = "投喂食物："
            java.lang.String r2 = r0.concat(r2)
            android.widget.TextView r1 = r1.f11905
            r1.setText(r2)
            s62 r1 = p000.s62.f9751
            return r1
        L22:
            fo1 r2 = (p000.fo1) r2
            java.lang.Object r2 = r2.f4054
            boolean r0 = r2 instanceof p000.eo1
            if (r0 != 0) goto L3f
            ef1 r2 = (p000.ef1) r2
            um1 r2 = r1.f11904
            java.lang.String r0 = r1.f11906
            java.lang.String r2 = p000.jz1.m3103(r2, r0)
            java.lang.String r0 = "投喂食物："
            java.lang.String r2 = r0.concat(r2)
            android.widget.TextView r1 = r1.f11905
            r1.setText(r2)
        L3f:
            s62 r1 = p000.s62.f9751
            return r1
    }
}
