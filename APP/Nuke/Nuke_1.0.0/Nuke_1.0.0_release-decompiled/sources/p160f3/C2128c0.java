package p160f3;

import java.util.concurrent.CancellationException;
import p000A.C0009E0;
import p074O2.AbstractC1043a;
import p084Q2.AbstractC1178c;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: f3.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2128c0 extends AbstractC1043a implements InterfaceC2115S {

    /* JADX INFO: renamed from: e */
    public static final C2128c0 f7069e = new C2128c0(C2155q.f7102e);

    @Override // p160f3.InterfaceC2115S
    /* JADX INFO: renamed from: b */
    public final boolean mo3904b() {
        return true;
    }

    @Override // p160f3.InterfaceC2115S
    /* JADX INFO: renamed from: l */
    public final InterfaceC2101D mo3906l(boolean z5, boolean z6, C0009E0 c0009e0) {
        return C2130d0.f7071d;
    }

    @Override // p160f3.InterfaceC2115S
    /* JADX INFO: renamed from: n */
    public final CancellationException mo3907n() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p160f3.InterfaceC2115S
    public final boolean start() {
        return false;
    }

    @Override // p160f3.InterfaceC2115S
    /* JADX INFO: renamed from: t */
    public final Object mo3908t(AbstractC1178c abstractC1178c) {
        throw new UnsupportedOperationException("This job is always active");
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // p160f3.InterfaceC2115S
    /* JADX INFO: renamed from: w */
    public final InterfaceC2101D mo3909w(InterfaceC1601c interfaceC1601c) {
        return C2130d0.f7071d;
    }

    @Override // p160f3.InterfaceC2115S
    /* JADX INFO: renamed from: x */
    public final InterfaceC2141j mo3910x(C2122Z c2122z) {
        return C2130d0.f7071d;
    }

    @Override // p160f3.InterfaceC2115S
    /* JADX INFO: renamed from: c */
    public final void mo3905c(CancellationException cancellationException) {
    }
}
