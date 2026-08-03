package p357y1;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: y1.q0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5923q0 implements InterfaceC5905l2 {

    /* JADX INFO: renamed from: a */
    public final ViewConfiguration f24033a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5923q0(ViewConfiguration viewConfiguration) {
        this.f24033a = viewConfiguration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.InterfaceC5905l2
    /* JADX INFO: renamed from: a */
    public final long mo10225a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.InterfaceC5905l2
    /* JADX INFO: renamed from: b */
    public final long mo10226b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.InterfaceC5905l2
    /* JADX INFO: renamed from: c */
    public final float mo10619c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f24033a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.InterfaceC5905l2
    /* JADX INFO: renamed from: e */
    public final float mo10620e() {
        return this.f24033a.getScaledMaximumFlingVelocity();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.InterfaceC5905l2
    /* JADX INFO: renamed from: f */
    public final float mo10228f() {
        return this.f24033a.getScaledTouchSlop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.InterfaceC5905l2
    /* JADX INFO: renamed from: g */
    public final float mo10621g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f24033a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
