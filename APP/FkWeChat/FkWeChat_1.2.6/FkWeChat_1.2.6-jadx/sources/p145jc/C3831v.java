package p145jc;

import ec.AbstractC2149k0;
import ec.AbstractC2189u0;
import ec.InterfaceC2126e1;
import ec.InterfaceC2156m;
import ec.InterfaceC2201x0;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: jc.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3831v extends AbstractC2149k0 implements InterfaceC2201x0 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC2201x0 f11021s;

    /* JADX INFO: renamed from: t */
    public final AbstractC2149k0 f11022t;

    /* JADX INFO: renamed from: u */
    public final String f11023u;

    /* JADX WARN: Multi-variable type inference failed */
    public C3831v(AbstractC2149k0 abstractC2149k0, String str) {
        InterfaceC2201x0 interfaceC2201x0 = abstractC2149k0 instanceof InterfaceC2201x0 ? (InterfaceC2201x0) abstractC2149k0 : null;
        this.f11021s = interfaceC2201x0 == null ? AbstractC2189u0.m7911a() : interfaceC2201x0;
        this.f11022t = abstractC2149k0;
        this.f11023u = str;
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: F */
    public void mo7820F(InterfaceC5980j interfaceC5980j, Runnable runnable) {
        this.f11022t.mo7820F(interfaceC5980j, runnable);
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: V */
    public boolean mo7821V(InterfaceC5980j interfaceC5980j) {
        return this.f11022t.mo7821V(interfaceC5980j);
    }

    @Override // ec.InterfaceC2201x0
    /* JADX INFO: renamed from: k */
    public InterfaceC2126e1 mo7800k(long j10, Runnable runnable, InterfaceC5980j interfaceC5980j) {
        return this.f11021s.mo7800k(j10, runnable, interfaceC5980j);
    }

    @Override // ec.InterfaceC2201x0
    /* JADX INFO: renamed from: m */
    public void mo7803m(long j10, InterfaceC2156m interfaceC2156m) {
        this.f11021s.mo7803m(j10, interfaceC2156m);
    }

    @Override // ec.AbstractC2149k0
    public String toString() {
        return this.f11023u;
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: x */
    public void mo7807x(InterfaceC5980j interfaceC5980j, Runnable runnable) {
        this.f11022t.mo7807x(interfaceC5980j, runnable);
    }
}
