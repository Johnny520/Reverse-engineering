package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fo1 extends AbstractC0602q2 implements k21 {

    /* JADX INFO: renamed from: i */
    public static final fo1 f3079i = new fo1(C0700sn.f10207K);

    @Override // p000.k21
    /* JADX INFO: renamed from: A */
    public final Object mo1701A(u00 u00Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // p000.k21
    /* JADX INFO: renamed from: B */
    public final ca0 mo1702B(boolean z, boolean z2, C0151e2 c0151e2) {
        return go1.f3642h;
    }

    @Override // p000.k21
    /* JADX INFO: renamed from: b */
    public final boolean mo1703b() {
        return true;
    }

    @Override // p000.k21
    /* JADX INFO: renamed from: j */
    public final InterfaceC0472ms mo1705j(r21 r21Var) {
        return go1.f3642h;
    }

    @Override // p000.k21
    /* JADX INFO: renamed from: q */
    public final CancellationException mo1706q() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p000.k21
    public final boolean start() {
        return false;
    }

    @Override // p000.k21
    /* JADX INFO: renamed from: t */
    public final ca0 mo1707t(in0 in0Var) {
        return go1.f3642h;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // p000.k21
    /* JADX INFO: renamed from: c */
    public final void mo1704c(CancellationException cancellationException) {
    }
}
