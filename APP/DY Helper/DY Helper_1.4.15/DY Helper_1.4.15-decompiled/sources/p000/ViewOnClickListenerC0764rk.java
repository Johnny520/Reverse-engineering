package p000;

/* JADX INFO: renamed from: rk */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0764rk implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9391;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.C0552mk f9392;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.C0875uk f9393;

    public /* synthetic */ ViewOnClickListenerC0764rk(p000.C0552mk r2, p000.C0875uk r3) {
            r1 = this;
            r0 = 1
            r1.f9391 = r0
            r1.<init>()
            r1.f9392 = r2
            r1.f9393 = r3
            return
    }

    public /* synthetic */ ViewOnClickListenerC0764rk(p000.C0875uk r2, p000.C0552mk r3) {
            r1 = this;
            r0 = 0
            r1.f9391 = r0
            r1.<init>()
            r1.f9393 = r2
            r1.f9392 = r3
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r2.f9391
            uk r0 = r2.f9393
            mk r2 = r2.f9392
            switch(r3) {
                case 0: goto L50;
                default: goto L9;
            }
        L9:
            java.lang.Object r3 = p000.ui1.f10844
            java.lang.String r2 = r2.f7186
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "comment_control_"
            r3.<init>(r1)
            r3.append(r2)
            java.lang.String r1 = "_visible"
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r1 = 1
            p000.ui1.m5871(r3, r1)
            mk r3 = r0.f10866
            java.lang.String r3 = r3.f7186
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L31
            r0.m5921()
        L31:
            r0.m5922()
            r0.m5919()
            b8 r2 = r0.f10862
            if (r2 == 0) goto L49
            mk r3 = r0.f10866
            boolean r0 = p000.ui1.m5901()
            boolean r1 = p000.C0875uk.m5915()
            r2.m818(r3, r0, r1)
            return
        L49:
            java.lang.String r2 = "preview"
            p000.ln0.m3650(r2)
            r2 = 0
            throw r2
        L50:
            r0.m5923(r2)
            nk r2 = p000.EnumC0589nk.f7658
            r0.m5925(r2)
            return
    }
}
