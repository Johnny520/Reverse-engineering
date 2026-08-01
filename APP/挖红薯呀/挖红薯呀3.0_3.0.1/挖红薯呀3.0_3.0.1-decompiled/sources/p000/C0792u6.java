package p000;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: u6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0792u6 implements nc1 {

    /* JADX INFO: renamed from: a */
    public final ViewConfiguration f6142a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0792u6(ViewConfiguration viewConfiguration) {
        this.f6142a = viewConfiguration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.nc1
    /* JADX INFO: renamed from: a */
    public final float mo2688a() {
        return this.f6142a.getScaledMaximumFlingVelocity();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.nc1
    /* JADX INFO: renamed from: b */
    public final long mo2689b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.nc1
    /* JADX INFO: renamed from: c */
    public final long mo2690c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.nc1
    /* JADX INFO: renamed from: d */
    public final float mo2691d() {
        return this.f6142a.getScaledTouchSlop();
    }
}
