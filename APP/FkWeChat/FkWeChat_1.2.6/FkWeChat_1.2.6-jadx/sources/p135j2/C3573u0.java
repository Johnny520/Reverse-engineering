package p135j2;

import java.util.List;
import p024b9.AbstractC1061t;
import p166l2.AbstractC4603y0;

/* JADX INFO: renamed from: j2.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3573u0 implements InterfaceC3555o0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3570t0 f9935a;

    public C3573u0(InterfaceC3570t0 interfaceC3570t0) {
        this.f9935a = interfaceC3570t0;
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: b */
    public int mo3081b(InterfaceC3566s interfaceC3566s, List list, int i10) {
        return this.f9935a.mo13358b(interfaceC3566s, AbstractC4603y0.m18447a(interfaceC3566s), i10);
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: c */
    public InterfaceC3558p0 mo2920c(InterfaceC3561q0 interfaceC3561q0, List list, long j10) {
        return this.f9935a.mo13359c(interfaceC3561q0, AbstractC4603y0.m18447a(interfaceC3561q0), j10);
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: d */
    public int mo13327d(InterfaceC3566s interfaceC3566s, List list, int i10) {
        return this.f9935a.mo13360d(interfaceC3566s, AbstractC4603y0.m18447a(interfaceC3566s), i10);
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: e */
    public int mo13328e(InterfaceC3566s interfaceC3566s, List list, int i10) {
        return this.f9935a.mo13361e(interfaceC3566s, AbstractC4603y0.m18447a(interfaceC3566s), i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3573u0) && AbstractC1061t.m3842c(this.f9935a, ((C3573u0) obj).f9935a);
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: h */
    public int mo13329h(InterfaceC3566s interfaceC3566s, List list, int i10) {
        return this.f9935a.mo13362h(interfaceC3566s, AbstractC4603y0.m18447a(interfaceC3566s), i10);
    }

    public int hashCode() {
        return this.f9935a.hashCode();
    }

    public String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f9935a + ')';
    }
}
