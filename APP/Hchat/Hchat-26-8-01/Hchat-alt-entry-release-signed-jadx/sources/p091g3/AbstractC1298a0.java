package p091g3;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: g3.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1298a0 {

    /* JADX INFO: renamed from: a */
    public final int f4348a;

    /* JADX INFO: renamed from: b */
    public float f4349b;

    /* JADX INFO: renamed from: c */
    public final Interpolator f4350c;

    /* JADX INFO: renamed from: d */
    public final long f4351d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1298a0(int i9, Interpolator interpolator, long j3) {
        this.f4348a = i9;
        this.f4350c = interpolator;
        this.f4351d = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public float mo3444a() {
        return 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public long mo3445b() {
        return this.f4351d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public float mo3446c() {
        float f3 = this.f4349b;
        Interpolator interpolator = this.f4350c;
        return interpolator != null ? interpolator.getInterpolation(f3) : f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public int mo3447d() {
        return this.f4348a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void mo3448e(float f3) {
        this.f4349b = f3;
    }
}
