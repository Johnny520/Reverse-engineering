package p099h;

import gg.AbstractC1417m;
import p028c1.C0384n;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p116i.C1765k1;
import p293u2.C4231a;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4418p0;
import tf.C4174u;

/* JADX INFO: renamed from: h.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1496y extends AbstractC1417m implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC1231l f4961g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1765k1 f4962h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1496y(InterfaceC1231l interfaceC1231l, C1765k1 c1765k1) {
        super(3);
        this.f4961g = interfaceC1231l;
        this.f4962h = c1765k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        long j3;
        InterfaceC4418p0 interfaceC4418p0 = (InterfaceC4418p0) obj;
        AbstractC4377b1 abstractC4377b1Mo8831Q = ((InterfaceC4409m0) obj2).mo8831Q(((C4231a) obj3).f13903a);
        if (interfaceC4418p0.mo8009u0()) {
            if (((Boolean) this.f4961g.invoke(this.f4962h.f5892d.getValue())).booleanValue()) {
                j3 = (((long) abstractC4377b1Mo8831Q.f14593g) << 32) | (((long) abstractC4377b1Mo8831Q.f14594h) & 4294967295L);
            } else {
                j3 = 0;
            }
        }
        return interfaceC4418p0.mo8010z((int) (j3 >> 32), (int) (4294967295L & j3), C4174u.f13711g, new C0384n(abstractC4377b1Mo8831Q, 1));
    }
}
