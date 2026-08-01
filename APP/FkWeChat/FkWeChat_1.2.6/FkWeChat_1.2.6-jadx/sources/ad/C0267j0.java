package ad;

import p024b9.AbstractC1043k;
import p329wc.InterfaceC9218f;
import p375zc.AbstractC9939c;
import p375zc.AbstractC9957l;
import p376zd.C9987e;

/* JADX INFO: renamed from: ad.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0267j0 extends AbstractC0245c {

    /* JADX INFO: renamed from: h */
    public final AbstractC9957l f651h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0267j0(AbstractC9939c abstractC9939c, AbstractC9957l abstractC9957l, String str) {
        super(abstractC9939c, abstractC9957l, str, null);
        abstractC9939c.getClass();
        abstractC9957l.getClass();
        this.f651h = abstractC9957l;
        m37839b0("primitive");
    }

    @Override // ad.AbstractC0245c
    /* JADX INFO: renamed from: k0 */
    public AbstractC9957l mo678k0(String str) {
        str.getClass();
        if (str == "primitive") {
            return mo693y0();
        }
        C9987e.m38645a("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: v */
    public int mo788v(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        return 0;
    }

    @Override // ad.AbstractC0245c
    /* JADX INFO: renamed from: y0 */
    public AbstractC9957l mo693y0() {
        return this.f651h;
    }

    public /* synthetic */ C0267j0(AbstractC9939c abstractC9939c, AbstractC9957l abstractC9957l, String str, int i10, AbstractC1043k abstractC1043k) {
        this(abstractC9939c, abstractC9957l, (i10 & 4) != 0 ? null : str);
    }
}
