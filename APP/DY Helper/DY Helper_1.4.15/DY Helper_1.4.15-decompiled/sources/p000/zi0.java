package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zi0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13100;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.cj0 f13101;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.dj0 f13102;

    public /* synthetic */ zi0(p000.cj0 r2, p000.dj0 r3) {
            r1 = this;
            r0 = 1
            r1.f13100 = r0
            r1.<init>()
            r1.f13101 = r2
            r1.f13102 = r3
            return
    }

    public /* synthetic */ zi0(p000.dj0 r2, p000.cj0 r3) {
            r1 = this;
            r0 = 0
            r1.f13100 = r0
            r1.<init>()
            r1.f13102 = r2
            r1.f13101 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f13100
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            r0 = 1
            cj0 r1 = r2.f13101
            r1.f2164 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f2166
            if (r0 != 0) goto L13
            dj0 r2 = r2.f13102
            r2.m1754(r1)
        L13:
            return
        L14:
            dj0 r0 = r2.f13102
            cj0 r2 = r2.f13101
            r0.m1754(r2)
            return
    }
}
