package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aj0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f277;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.dj0 f278;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.cj0 f279;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f280;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ p000.xi0 f281;

    public /* synthetic */ aj0(p000.dj0 r1, p000.cj0 r2, java.util.concurrent.atomic.AtomicBoolean r3, p000.xi0 r4, int r5) {
            r0 = this;
            r0.f277 = r5
            r0.f278 = r1
            r0.f279 = r2
            r0.f280 = r3
            r0.f281 = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            int r0 = r6.f277
            xi0 r1 = r6.f281
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.f280
            cj0 r3 = r6.f279
            dj0 r6 = r6.f278
            switch(r0) {
                case 0: goto L1c;
                default: goto Ld;
            }
        Ld:
            hj0 r0 = new hj0
            yi0 r4 = p000.yi0.f12635
            java.lang.String r5 = ""
            r0.<init>(r1, r4, r5)
            java.util.concurrent.ScheduledExecutorService r1 = p000.dj0.f3185
            r6.m1753(r3, r2, r0)
            return
        L1c:
            hj0 r0 = new hj0
            yi0 r4 = p000.yi0.f12637
            java.lang.String r5 = "等待宿主服务端回调超时"
            r0.<init>(r1, r4, r5)
            r6.m1753(r3, r2, r0)
            return
    }
}
