package p091g3;

import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: g3.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1340z extends AbstractC1298a0 {

    /* JADX INFO: renamed from: e */
    public final WindowInsetsAnimation f4423e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1340z(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f4423e = windowInsetsAnimation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1298a0
    /* JADX INFO: renamed from: a */
    public final float mo3444a() {
        return this.f4423e.getAlpha();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1298a0
    /* JADX INFO: renamed from: b */
    public final long mo3445b() {
        return this.f4423e.getDurationMillis();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1298a0
    /* JADX INFO: renamed from: c */
    public final float mo3446c() {
        return this.f4423e.getInterpolatedFraction();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1298a0
    /* JADX INFO: renamed from: d */
    public final int mo3447d() {
        return this.f4423e.getTypeMask();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1298a0
    /* JADX INFO: renamed from: e */
    public final void mo3448e(float f3) {
        this.f4423e.setFraction(f3);
    }
}
