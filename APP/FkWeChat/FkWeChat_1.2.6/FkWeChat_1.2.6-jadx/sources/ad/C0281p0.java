package ad;

import java.util.LinkedHashMap;
import java.util.Map;
import p010a9.InterfaceC0184l;
import p300uc.InterfaceC8662p;
import p329wc.InterfaceC9218f;
import p375zc.AbstractC9939c;
import p375zc.AbstractC9957l;
import p375zc.C9950h0;

/* JADX INFO: renamed from: ad.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C0281p0 extends AbstractC0251e {

    /* JADX INFO: renamed from: g */
    public final Map f686g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0281p0(AbstractC9939c abstractC9939c, InterfaceC0184l interfaceC0184l) {
        super(abstractC9939c, interfaceC0184l, null);
        abstractC9939c.getClass();
        interfaceC0184l.getClass();
        this.f686g = new LinkedHashMap();
    }

    @Override // p361yc.AbstractC9685d3, p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: o */
    public void mo646o(InterfaceC9218f interfaceC9218f, int i10, InterfaceC8662p interfaceC8662p, Object obj) {
        interfaceC9218f.getClass();
        interfaceC8662p.getClass();
        if (obj != null || this.f620d.m38557j()) {
            super.mo646o(interfaceC9218f, i10, interfaceC8662p, obj);
        }
    }

    @Override // ad.AbstractC0251e
    /* JADX INFO: renamed from: q0 */
    public AbstractC9957l mo736q0() {
        return new C9950h0(this.f686g);
    }

    @Override // ad.AbstractC0251e
    /* JADX INFO: renamed from: u0 */
    public void mo740u0(String str, AbstractC9957l abstractC9957l) {
        str.getClass();
        abstractC9957l.getClass();
        this.f686g.put(str, abstractC9957l);
    }

    /* JADX INFO: renamed from: v0 */
    public final Map m840v0() {
        return this.f686g;
    }
}
