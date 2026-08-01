package ad;

import java.util.Map;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p215oc.C5729x;
import p375zc.AbstractC9939c;
import p375zc.AbstractC9956k0;
import p375zc.AbstractC9957l;
import p375zc.C9941d;
import p375zc.C9945f;
import p375zc.C9950h0;
import p375zc.C9954j0;

/* JADX INFO: renamed from: ad.t0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0289t0 extends C0281p0 {

    /* JADX INFO: renamed from: h */
    public String f698h;

    /* JADX INFO: renamed from: i */
    public boolean f699i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0289t0(AbstractC9939c abstractC9939c, InterfaceC0184l interfaceC0184l) {
        super(abstractC9939c, interfaceC0184l);
        abstractC9939c.getClass();
        interfaceC0184l.getClass();
        this.f699i = true;
    }

    @Override // ad.C0281p0, ad.AbstractC0251e
    /* JADX INFO: renamed from: q0 */
    public AbstractC9957l mo736q0() {
        return new C9950h0(m840v0());
    }

    @Override // ad.C0281p0, ad.AbstractC0251e
    /* JADX INFO: renamed from: u0 */
    public void mo740u0(String str, AbstractC9957l abstractC9957l) {
        str.getClass();
        abstractC9957l.getClass();
        if (!this.f699i) {
            Map mapM840v0 = m840v0();
            String str2 = this.f698h;
            if (str2 == null) {
                AbstractC1061t.m3851l("tag");
                str2 = null;
            }
            mapM840v0.put(str2, abstractC9957l);
            this.f699i = true;
            return;
        }
        if (abstractC9957l instanceof AbstractC9956k0) {
            this.f698h = ((AbstractC9956k0) abstractC9957l).mo38506a();
            this.f699i = false;
        } else {
            if (abstractC9957l instanceof C9950h0) {
                throw AbstractC0246c0.m698d(C9954j0.f33538a.mo15953a());
            }
            if (abstractC9957l instanceof C9941d) {
                throw AbstractC0246c0.m698d(C9945f.f33494a.mo15953a());
            }
            C5729x.m23182a();
        }
    }
}
