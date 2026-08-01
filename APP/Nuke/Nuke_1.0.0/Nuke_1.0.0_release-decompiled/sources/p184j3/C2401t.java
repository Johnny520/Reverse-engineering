package p184j3;

import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p084Q2.InterfaceC1179d;

/* JADX INFO: renamed from: j3.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2401t implements InterfaceC1046d, InterfaceC1179d {

    /* JADX INFO: renamed from: d */
    public final InterfaceC1046d f7763d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1051i f7764e;

    public C2401t(InterfaceC1046d interfaceC1046d, InterfaceC1051i interfaceC1051i) {
        this.f7763d = interfaceC1046d;
        this.f7764e = interfaceC1051i;
    }

    @Override // p084Q2.InterfaceC1179d
    /* JADX INFO: renamed from: d */
    public final InterfaceC1179d mo2123d() {
        InterfaceC1046d interfaceC1046d = this.f7763d;
        if (interfaceC1046d instanceof InterfaceC1179d) {
            return (InterfaceC1179d) interfaceC1046d;
        }
        return null;
    }

    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: e */
    public final InterfaceC1051i mo275e() {
        return this.f7764e;
    }

    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: i */
    public final void mo278i(Object obj) {
        this.f7763d.mo278i(obj);
    }
}
