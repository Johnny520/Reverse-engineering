package p130ic;

import p024b9.AbstractC1043k;
import p099gc.EnumC2732a;
import p113hc.InterfaceC2972c;
import p113hc.InterfaceC2974d;
import p172l8.C4700i0;
import p228p8.C5981k;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;

/* JADX INFO: renamed from: ic.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3390h extends AbstractC3389g {
    public /* synthetic */ C3390h(InterfaceC2972c interfaceC2972c, InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a, int i11, AbstractC1043k abstractC1043k) {
        this(interfaceC2972c, (i11 & 2) != 0 ? C5981k.f18917q : interfaceC5980j, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? EnumC2732a.f7138q : enumC2732a);
    }

    @Override // p130ic.AbstractC3387e
    /* JADX INFO: renamed from: k */
    public AbstractC3387e mo12727k(InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a) {
        return new C3390h(this.f9351t, interfaceC5980j, i10, enumC2732a);
    }

    @Override // p130ic.AbstractC3387e
    /* JADX INFO: renamed from: l */
    public InterfaceC2972c mo12728l() {
        return this.f9351t;
    }

    @Override // p130ic.AbstractC3389g
    /* JADX INFO: renamed from: s */
    public Object mo12740s(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
        Object objMo399b = this.f9351t.mo399b(interfaceC2974d, interfaceC5976f);
        return objMo399b == AbstractC6325c.m24992g() ? objMo399b : C4700i0.f13910a;
    }

    public C3390h(InterfaceC2972c interfaceC2972c, InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a) {
        super(interfaceC2972c, interfaceC5980j, i10, enumC2732a);
    }
}
