package p091g3;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: g3.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1300b0 {

    /* JADX INFO: renamed from: a */
    public AbstractC1298a0 f4355a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1300b0(int i9, Interpolator interpolator, long j3) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4355a = new C1340z(AbstractC1311h.m3475i(i9, interpolator, j3));
        } else {
            this.f4355a = new C1338x(i9, interpolator, j3);
        }
    }
}
