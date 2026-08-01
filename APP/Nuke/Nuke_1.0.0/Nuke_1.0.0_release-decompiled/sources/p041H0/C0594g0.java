package p041H0;

import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p211o0.InterfaceC2760s;

/* JADX INFO: renamed from: H0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0594g0 extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1910e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC0596h0 f1911f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0594g0(AbstractC0596h0 abstractC0596h0, int i5) {
        super(0);
        this.f1910e = i5;
        this.f1911f = abstractC0596h0;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f1910e) {
            case 0:
                AbstractC0596h0 abstractC0596h0 = this.f1911f;
                InterfaceC2760s interfaceC2760s = abstractC0596h0.f1927K;
                AbstractC1665j.m2982b(interfaceC2760s);
                abstractC0596h0.m975L0(interfaceC2760s, abstractC0596h0.f1926J);
                break;
            default:
                AbstractC0596h0 abstractC0596h02 = this.f1911f.f1934t;
                if (abstractC0596h02 != null) {
                    abstractC0596h02.m988Y0();
                }
                break;
        }
        return C0891q.f2780a;
    }
}
