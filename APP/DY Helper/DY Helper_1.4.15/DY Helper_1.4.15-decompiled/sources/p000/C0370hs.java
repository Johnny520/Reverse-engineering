package p000;

/* JADX INFO: renamed from: hs */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0370hs {

    /* JADX INFO: renamed from: α */
    public final java.util.concurrent.Executor f4790;

    /* JADX INFO: renamed from: β */
    public final p000.hj1 f4791;

    /* JADX INFO: renamed from: γ */
    public final byte[] f4792;

    /* JADX INFO: renamed from: δ */
    public final java.io.File f4793;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f4794;

    /* JADX INFO: renamed from: ζ */
    public boolean f4795;

    /* JADX INFO: renamed from: η */
    public p000.C0698ps[] f4796;

    /* JADX INFO: renamed from: θ */
    public byte[] f4797;

    public C0370hs(android.content.res.AssetManager r1, java.util.concurrent.Executor r2, p000.hj1 r3, java.lang.String r4, java.io.File r5) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.f4795 = r1
            r0.f4790 = r2
            r0.f4791 = r3
            r0.f4794 = r4
            r0.f4793 = r5
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L17
            byte[] r1 = p000.AbstractC1021yh.f12621
            goto L1f
        L17:
            r2 = 30
            if (r1 == r2) goto L1d
            r1 = 0
            goto L1f
        L1d:
            byte[] r1 = p000.AbstractC1021yh.f12622
        L1f:
            r0.f4792 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final java.io.FileInputStream m2526(android.content.res.AssetManager r1, java.lang.String r2) {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = r1.openFd(r2)     // Catch: java.io.FileNotFoundException -> L9
            java.io.FileInputStream r0 = r1.createInputStream()     // Catch: java.io.FileNotFoundException -> L9
            return r0
        L9:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            if (r1 == 0) goto L1d
            java.lang.String r2 = "compressed"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L1d
            hj1 r0 = r0.f4791
            r0.mo2511()
        L1d:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final void m2527(int r3, java.io.Serializable r4) {
            r2 = this;
            gs r0 = new gs
            r1 = 0
            r0.<init>(r3, r1, r2, r4)
            java.util.concurrent.Executor r2 = r2.f4790
            r2.execute(r0)
            return
    }
}
