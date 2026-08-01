package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class on1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public p000.q50 f8160;

    /* JADX INFO: renamed from: ζ */
    public p000.r50 f8161;

    /* JADX INFO: renamed from: η */
    public android.os.Handler f8162;

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            q50 r0 = r5.f8160     // Catch: java.lang.Exception -> L7
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            r50 r1 = r5.f8161
            android.os.Handler r5 = r5.f8162
            ｓ r2 = new ｓ
            r3 = 5
            r4 = 0
            r2.<init>(r3, r1, r0, r4)
            r5.post(r2)
            return
    }
}
