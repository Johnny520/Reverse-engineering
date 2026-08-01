package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ov1 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f8276;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.sv1 f8277;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ p000.n71 f8278;

    public /* synthetic */ ov1(p000.sv1 r1, p000.n71 r2, int r3) {
            r0 = this;
            r0.f8276 = r3
            r0.f8277 = r1
            r0.f8278 = r2
            r0.<init>()
            return
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton r2, boolean r3) {
            r1 = this;
            int r0 = r1.f8276
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            r2.getClass()
            n71 r2 = r1.f8278
            java.lang.String r2 = r2.f7446
            sv1 r1 = r1.f8277
            r1.m5577(r2, r3)
            return
        L12:
            r2.getClass()
            n71 r2 = r1.f8278
            java.lang.String r2 = r2.f7446
            sv1 r1 = r1.f8277
            r1.m5577(r2, r3)
            return
    }
}
