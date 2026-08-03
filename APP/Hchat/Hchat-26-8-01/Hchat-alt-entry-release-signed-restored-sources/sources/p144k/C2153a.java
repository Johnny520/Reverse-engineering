package p144k;

import gg.AbstractC1416l;
import p085fg.InterfaceC1220a;
import p117i0.C1883u;
import p201o.AbstractC3026b;
import p276sf.C3967n;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5612i;

/* JADX INFO: renamed from: k.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2153a implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7123g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC2171g f7124h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2153a(AbstractC2171g abstractC2171g, int i9) {
        this.f7123g = i9;
        this.f7124h = abstractC2171g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        InterfaceC5612i interfaceC5612i;
        switch (this.f7123g) {
            case 0:
                C1883u c1883u = AbstractC2217v0.f7345a;
                AbstractC2171g abstractC2171g = this.f7124h;
                InterfaceC2226y0 interfaceC2226y0 = (InterfaceC2226y0) AbstractC5618k.m10152h(abstractC2171g, c1883u);
                if (interfaceC2226y0 == null) {
                    AbstractC3026b.m6428a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + interfaceC2226y0);
                }
                InterfaceC2226y0 interfaceC2226y02 = abstractC2171g.f7193E;
                abstractC2171g.f7193E = interfaceC2226y0;
                if (interfaceC2226y02 != null && !AbstractC1416l.m3825a(interfaceC2226y0, interfaceC2226y02) && ((interfaceC5612i = abstractC2171g.f7196H) != null || !abstractC2171g.f7202N)) {
                    if (interfaceC5612i != null) {
                        abstractC2171g.m10123l1(interfaceC5612i);
                    }
                    abstractC2171g.f7196H = null;
                    abstractC2171g.m5397v1();
                }
                return C3967n.f12976a;
            default:
                this.f7124h.f7191C.invoke();
                return Boolean.TRUE;
        }
    }
}
