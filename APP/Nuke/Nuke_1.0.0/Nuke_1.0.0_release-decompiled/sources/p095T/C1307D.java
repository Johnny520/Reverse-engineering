package p095T;

import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: T.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1307D implements InterfaceC1345W0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1601c f4671a;

    public C1307D(InterfaceC1601c interfaceC1601c) {
        this.f4671a = interfaceC1601c;
    }

    @Override // p095T.InterfaceC1345W0
    /* JADX INFO: renamed from: a */
    public final Object mo2404a(InterfaceC1378o0 interfaceC1378o0) {
        return this.f4671a.mo1h(interfaceC1378o0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1307D) && AbstractC1665j.m2981a(this.f4671a, ((C1307D) obj).f4671a);
    }

    public final int hashCode() {
        return this.f4671a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f4671a + ')';
    }
}
