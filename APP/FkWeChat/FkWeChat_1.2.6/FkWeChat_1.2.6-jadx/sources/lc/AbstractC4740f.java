package lc;

import ec.AbstractC2170p1;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: lc.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4740f extends AbstractC2170p1 {

    /* JADX INFO: renamed from: t */
    public final int f14050t;

    /* JADX INFO: renamed from: u */
    public final int f14051u;

    /* JADX INFO: renamed from: v */
    public final long f14052v;

    /* JADX INFO: renamed from: w */
    public final String f14053w;

    /* JADX INFO: renamed from: x */
    public ExecutorC4735a f14054x = m18977q0();

    public AbstractC4740f(int i10, int i11, long j10, String str) {
        this.f14050t = i10;
        this.f14051u = i11;
        this.f14052v = j10;
        this.f14053w = str;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m18976E0(Runnable runnable, boolean z10, boolean z11) {
        this.f14054x.m18952l(runnable, z10, z11);
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: F */
    public void mo7820F(InterfaceC5980j interfaceC5980j, Runnable runnable) {
        ExecutorC4735a.m18934m(this.f14054x, runnable, false, true, 2, null);
    }

    /* JADX INFO: renamed from: q0 */
    public final ExecutorC4735a m18977q0() {
        return new ExecutorC4735a(this.f14050t, this.f14051u, this.f14052v, this.f14053w);
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: x */
    public void mo7807x(InterfaceC5980j interfaceC5980j, Runnable runnable) {
        ExecutorC4735a.m18934m(this.f14054x, runnable, false, false, 6, null);
    }
}
