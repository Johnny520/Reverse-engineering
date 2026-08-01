package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pv1 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8736;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ boolean f8737;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f8738;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f8739;

    public /* synthetic */ pv1(int r1, java.lang.Object r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            r0.f8736 = r1
            r0.f8737 = r4
            r0.f8738 = r2
            r0.f8739 = r3
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r2.f8736
            switch(r3) {
                case 0: goto L20;
                default: goto L5;
            }
        L5:
            java.lang.Object r3 = r2.f8738
            gz1 r3 = (p000.gz1) r3
            java.lang.Object r0 = r2.f8739
            cu1 r0 = (p000.cu1) r0
            java.util.LinkedHashSet r1 = p000.jz1.f5676
            java.lang.String r3 = r3.f4508
            boolean r2 = r2.f8737
            if (r2 == 0) goto L19
            r1.remove(r3)
            goto L1c
        L19:
            r1.add(r3)
        L1c:
            r0.invoke()
            return
        L20:
            java.lang.Object r3 = r2.f8738
            sv1 r3 = (p000.sv1) r3
            java.lang.Object r0 = r2.f8739
            n71 r0 = (p000.n71) r0
            boolean r2 = r2.f8737
            if (r2 == 0) goto L3f
            android.content.Context r2 = r3.f10051
            java.lang.String r3 = r0.f7447
            java.lang.String r0 = "需要内测资格"
            java.lang.String r3 = r3.concat(r0)
            r0 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
            r2.show()
            goto L4c
        L3f:
            java.lang.String r2 = r0.f7446
            java.util.LinkedHashSet r0 = r3.f10055
            boolean r0 = r0.contains(r2)
            r0 = r0 ^ 1
            r3.m5577(r2, r0)
        L4c:
            return
    }
}
