package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bj0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1735;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.dj0 f1736;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.cj0 f1737;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f1738;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ p000.xi0 f1739;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.String f1740;

    public /* synthetic */ bj0(p000.dj0 r1, p000.cj0 r2, java.util.concurrent.atomic.AtomicBoolean r3, p000.xi0 r4, java.lang.String r5, int r6) {
            r0 = this;
            r0.f1735 = r6
            r0.f1736 = r1
            r0.f1737 = r2
            r0.f1738 = r3
            r0.f1739 = r4
            r0.f1740 = r5
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f1735
            yi0 r1 = p000.yi0.f12636
            java.lang.String r2 = r7.f1740
            xi0 r3 = r7.f1739
            java.util.concurrent.atomic.AtomicBoolean r4 = r7.f1738
            cj0 r5 = r7.f1737
            dj0 r7 = r7.f1736
            switch(r0) {
                case 0: goto L24;
                default: goto L11;
            }
        L11:
            boolean r0 = p000.q02.m4671(r2)
            if (r0 == 0) goto L19
            java.lang.String r2 = "宿主删除接口返回失败"
        L19:
            hj0 r0 = new hj0
            r0.<init>(r3, r1, r2)
            java.util.concurrent.ScheduledExecutorService r1 = p000.dj0.f3185
            r7.m1753(r5, r4, r0)
            return
        L24:
            hj0 r0 = new hj0
            java.lang.String r6 = "调用宿主删除接口失败："
            java.lang.String r2 = r6.concat(r2)
            r0.<init>(r3, r1, r2)
            r7.m1753(r5, r4, r0)
            return
    }
}
