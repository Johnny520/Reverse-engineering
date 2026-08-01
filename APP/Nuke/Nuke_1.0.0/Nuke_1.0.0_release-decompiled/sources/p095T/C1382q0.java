package p095T;

import p074O2.InterfaceC1051i;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: T.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1382q0 implements InterfaceC1347Y, InterfaceC2160t {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC1347Y f4861d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1051i f4862e;

    public C1382q0(InterfaceC1347Y interfaceC1347Y, InterfaceC1051i interfaceC1051i) {
        this.f4861d = interfaceC1347Y;
        this.f4862e = interfaceC1051i;
    }

    @Override // p160f3.InterfaceC2160t
    /* JADX INFO: renamed from: f */
    public final InterfaceC1051i mo1202f() {
        return this.f4862e;
    }

    @Override // p095T.InterfaceC1339T0
    public final Object getValue() {
        return this.f4861d.getValue();
    }

    @Override // p095T.InterfaceC1347Y
    public final void setValue(Object obj) {
        this.f4861d.setValue(obj);
    }
}
