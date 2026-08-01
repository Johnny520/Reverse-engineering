package p179m2;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: m2.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4894q0 implements InterfaceC4862j3 {

    /* JADX INFO: renamed from: a */
    public final ViewConfiguration f14602a;

    public C4894q0(ViewConfiguration viewConfiguration) {
        this.f14602a = viewConfiguration;
    }

    @Override // p179m2.InterfaceC4862j3
    /* JADX INFO: renamed from: a */
    public long mo17977a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // p179m2.InterfaceC4862j3
    /* JADX INFO: renamed from: b */
    public long mo17978b() {
        return 40L;
    }

    @Override // p179m2.InterfaceC4862j3
    /* JADX INFO: renamed from: c */
    public long mo17979c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // p179m2.InterfaceC4862j3
    /* JADX INFO: renamed from: d */
    public float mo19407d() {
        return Build.VERSION.SDK_INT >= 34 ? C4909t0.f14758a.m19694b(this.f14602a) : super.mo19407d();
    }

    @Override // p179m2.InterfaceC4862j3
    /* JADX INFO: renamed from: f */
    public float mo19408f() {
        return this.f14602a.getScaledMaximumFlingVelocity();
    }

    @Override // p179m2.InterfaceC4862j3
    /* JADX INFO: renamed from: g */
    public float mo17981g() {
        return this.f14602a.getScaledTouchSlop();
    }

    @Override // p179m2.InterfaceC4862j3
    /* JADX INFO: renamed from: h */
    public float mo19409h() {
        return Build.VERSION.SDK_INT >= 34 ? C4909t0.f14758a.m19693a(this.f14602a) : super.mo19409h();
    }
}
