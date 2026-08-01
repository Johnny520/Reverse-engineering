package p151k2;

import p120i2.AbstractC3167a;

/* JADX INFO: renamed from: k2.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3934a extends AbstractC3940g {

    /* JADX INFO: renamed from: a */
    public InterfaceC3943j f11408a;

    public C3934a(InterfaceC3943j interfaceC3943j) {
        super(null);
        this.f11408a = interfaceC3943j;
    }

    @Override // p151k2.AbstractC3940g
    /* JADX INFO: renamed from: a */
    public boolean mo15632a(AbstractC3936c abstractC3936c) {
        return abstractC3936c == this.f11408a.getKey();
    }

    @Override // p151k2.AbstractC3940g
    /* JADX INFO: renamed from: b */
    public Object mo15633b(AbstractC3936c abstractC3936c) {
        if (!(abstractC3936c == this.f11408a.getKey())) {
            AbstractC3167a.m11956b("Check failed.");
        }
        return this.f11408a.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m15634c(InterfaceC3943j interfaceC3943j) {
        this.f11408a = interfaceC3943j;
    }
}
