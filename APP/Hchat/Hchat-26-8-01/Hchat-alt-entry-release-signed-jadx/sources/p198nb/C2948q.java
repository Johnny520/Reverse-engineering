package p198nb;

import android.media.VolumeProvider;
import p070f0.RunnableC0972d;

/* JADX INFO: renamed from: nb.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2948q extends VolumeProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2954w f9663a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2948q(int i9, int i10, C2954w c2954w) {
        super(1, i9, i10);
        this.f9663a = c2954w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i9) {
        C2954w c2954w = this.f9663a;
        c2954w.f9675b.post(new RunnableC0972d(i9, 1, c2954w));
    }
}
