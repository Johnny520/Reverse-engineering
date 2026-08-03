package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends android.media.VolumeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nb.w f9301a;

    public q(int r1, int r2, nb.w r3) {
            r0 = this;
            r0.f9301a = r3
            r3 = 1
            r0.<init>(r3, r1, r2)
            return
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int r5) {
            r4 = this;
            nb.w r0 = r4.f9301a
            android.os.Handler r1 = r0.f9312b
            f0.d r2 = new f0.d
            r3 = 1
            r2.<init>(r5, r3, r0)
            r1.post(r2)
            return
    }
}
