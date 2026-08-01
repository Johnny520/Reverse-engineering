package p216p;

import p041H0.AbstractC0601k;
import p041H0.InterfaceC0597i;
import p056K2.C0891q;
import p095T.C1305C;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p238t.AbstractC3204b;

/* JADX INFO: renamed from: p.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2833a implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8911d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2865v f8912e;

    public /* synthetic */ C2833a(C2865v c2865v, int i5) {
        this.f8911d = i5;
        this.f8912e = c2865v;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() throws ClassNotFoundException {
        InterfaceC0597i interfaceC0597i;
        switch (this.f8911d) {
            case 0:
                C1305C c1305c = AbstractC2816I.f8869a;
                C2865v c2865v = this.f8912e;
                InterfaceC2819L interfaceC2819L = (InterfaceC2819L) AbstractC0601k.m1032h(c2865v, c1305c);
                if (interfaceC2819L == null) {
                    AbstractC3204b.m5475a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + interfaceC2819L);
                }
                InterfaceC2819L interfaceC2819L2 = c2865v.f9033A;
                c2865v.f9033A = interfaceC2819L;
                if (interfaceC2819L2 != null && !AbstractC1665j.m2981a(interfaceC2819L, interfaceC2819L2) && ((interfaceC0597i = c2865v.f9034B) != null || !c2865v.f9041I)) {
                    if (interfaceC0597i != null) {
                        c2865v.m1022K0(interfaceC0597i);
                    }
                    c2865v.f9034B = null;
                    c2865v.m5066Q0();
                }
                return C0891q.f2780a;
            default:
                this.f8912e.f9051y.mo6a();
                return Boolean.TRUE;
        }
    }
}
