package p000;

/* JADX INFO: renamed from: ho */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0366ho implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f4781;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.io.Serializable f4782;

    public /* synthetic */ ThreadFactoryC0366ho(int r1, java.io.Serializable r2) {
            r0 = this;
            r0.f4781 = r1
            r0.f4782 = r2
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            int r0 = r2.f4781
            java.io.Serializable r2 = r2.f4782
            switch(r0) {
                case 0: goto L1d;
                default: goto L7;
            }
        L7:
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2
            java.lang.Thread r0 = new java.lang.Thread
            int r2 = r2.incrementAndGet()
            java.lang.String r1 = "r25570f91c6c24e4f"
            java.lang.String r2 = p000.a12.m17(r1, r2)
            r0.<init>(r3, r2)
            r2 = 1
            r0.setDaemon(r2)
            return r0
        L1d:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r3, r2)
            r2 = 10
            r0.setPriority(r2)
            return r0
    }
}
