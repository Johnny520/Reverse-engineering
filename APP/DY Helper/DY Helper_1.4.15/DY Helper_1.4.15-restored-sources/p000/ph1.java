package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ph1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8568;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ float f8569;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ long f8570;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ float f8571;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ android.app.Activity f8572;

    public /* synthetic */ ph1(float r2, long r3, float r5, android.app.Activity r6) {
            r1 = this;
            r0 = 0
            r1.f8568 = r0
            r1.<init>()
            r1.f8569 = r2
            r1.f8570 = r3
            r1.f8571 = r5
            r1.f8572 = r6
            return
    }

    public /* synthetic */ ph1(p000.sh1 r1, float r2, long r3, float r5, android.app.Activity r6) {
            r0 = this;
            r1 = 1
            r0.f8568 = r1
            r0.<init>()
            r0.f8569 = r2
            r0.f8570 = r3
            r0.f8571 = r5
            r0.f8572 = r6
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f8568
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            float r6 = r7.f8569
            long r1 = r7.f8570
            float r3 = r7.f8571
            android.app.Activity r4 = r7.f8572
            r5 = 1
            p000.sh1.m5516(r1, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L11
        L11:
            r7 = 0
            p000.sh1.f9913 = r7
            return
        L15:
            float r5 = r7.f8569
            long r0 = r7.f8570
            float r2 = r7.f8571
            android.app.Activity r3 = r7.f8572
            r4 = 2
            p000.sh1.m5516(r0, r2, r3, r4, r5)
            return
    }
}
