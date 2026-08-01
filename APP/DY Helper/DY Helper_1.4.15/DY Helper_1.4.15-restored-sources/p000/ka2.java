package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ka2 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5827;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f5828;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f5829;

    public /* synthetic */ ka2(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f5827 = r2
            r0.f5828 = r1
            r0.f5829 = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f5827
            switch(r0) {
                case 0: goto L46;
                case 1: goto L23;
                case 2: goto L17;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f5828
            hd2 r0 = (p000.hd2) r0
            java.lang.Object r3 = r3.f5829
            jr0 r3 = (p000.jr0) r3
            boolean r1 = r0.f4700
            if (r1 != 0) goto L16
            r0.f4701 = r3
            r3.m2980(r0)
        L16:
            return
        L17:
            java.lang.Object r0 = r3.f5828
            gc r0 = (p000.C0317gc) r0
            java.lang.Object r3 = r3.f5829
            cb2 r3 = (p000.cb2) r3
            r0.invoke(r3)
            return
        L23:
            java.lang.Object r0 = r3.f5828
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r3 = r3.f5829
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "语音替换失败: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r1 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r0, r3, r1)
            r3.show()
            return
        L46:
            java.lang.Object r0 = r3.f5828
            la2 r0 = (p000.la2) r0
            java.lang.Object r3 = r3.f5829
            qa2 r3 = (p000.qa2) r3
            r0.invoke(r3)
            return
    }
}
