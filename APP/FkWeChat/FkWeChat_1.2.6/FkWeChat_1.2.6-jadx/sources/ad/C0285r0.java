package ad;

import java.util.ArrayList;
import p010a9.InterfaceC0184l;
import p329wc.InterfaceC9218f;
import p375zc.AbstractC9939c;
import p375zc.AbstractC9957l;
import p375zc.C9941d;

/* JADX INFO: renamed from: ad.r0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0285r0 extends AbstractC0251e {

    /* JADX INFO: renamed from: g */
    public final ArrayList f692g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0285r0(AbstractC9939c abstractC9939c, InterfaceC0184l interfaceC0184l) {
        super(abstractC9939c, interfaceC0184l, null);
        abstractC9939c.getClass();
        interfaceC0184l.getClass();
        this.f692g = new ArrayList();
    }

    @Override // ad.AbstractC0251e, p361yc.AbstractC9753r1
    /* JADX INFO: renamed from: a0 */
    public String mo723a0(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return String.valueOf(i10);
    }

    @Override // ad.AbstractC0251e
    /* JADX INFO: renamed from: q0 */
    public AbstractC9957l mo736q0() {
        return new C9941d(this.f692g);
    }

    @Override // ad.AbstractC0251e
    /* JADX INFO: renamed from: u0 */
    public void mo740u0(String str, AbstractC9957l abstractC9957l) {
        str.getClass();
        abstractC9957l.getClass();
        this.f692g.add(Integer.parseInt(str), abstractC9957l);
    }
}
