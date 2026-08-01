package ad;

import p010a9.InterfaceC0184l;
import p375zc.AbstractC9939c;
import p375zc.AbstractC9957l;
import p376zd.C9987e;

/* JADX INFO: renamed from: ad.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0270k0 extends AbstractC0251e {

    /* JADX INFO: renamed from: g */
    public AbstractC9957l f662g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0270k0(AbstractC9939c abstractC9939c, InterfaceC0184l interfaceC0184l) {
        super(abstractC9939c, interfaceC0184l, null);
        abstractC9939c.getClass();
        interfaceC0184l.getClass();
        m37865Y("primitive");
    }

    @Override // ad.AbstractC0251e
    /* JADX INFO: renamed from: q0 */
    public AbstractC9957l mo736q0() {
        AbstractC9957l abstractC9957l = this.f662g;
        if (abstractC9957l != null) {
            return abstractC9957l;
        }
        C9987e.m38645a("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
        return null;
    }

    @Override // ad.AbstractC0251e
    /* JADX INFO: renamed from: u0 */
    public void mo740u0(String str, AbstractC9957l abstractC9957l) {
        str.getClass();
        abstractC9957l.getClass();
        if (str != "primitive") {
            C9987e.m38645a("This output can only consume primitives with 'primitive' tag");
        } else if (this.f662g != null) {
            C9987e.m38645a("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        } else {
            this.f662g = abstractC9957l;
            m737r0().mo27m(abstractC9957l);
        }
    }
}
