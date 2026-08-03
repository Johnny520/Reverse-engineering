package p308v1;

import java.util.ArrayList;
import java.util.List;
import p028c1.C0384n;
import p099h.C1488u;
import p293u2.AbstractC4232b;
import p293u2.C4231a;
import p339x1.AbstractC5590c0;
import tf.C4174u;

/* JADX INFO: renamed from: v1.e1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4386e1 extends AbstractC5590c0 {

    /* JADX INFO: renamed from: b */
    public static final C4386e1 f14622b = new C4386e1("Undefined intrinsics block and it is required");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: h */
    public final InterfaceC4415o0 mo3994h(InterfaceC4418p0 interfaceC4418p0, List list, long j3) {
        int size = list.size();
        C4174u c4174u = C4174u.f13711g;
        if (size == 0) {
            return interfaceC4418p0.mo8010z(C4231a.m8506j(j3), C4231a.m8505i(j3), c4174u, C4380c1.f14608i);
        }
        if (size == 1) {
            AbstractC4377b1 abstractC4377b1Mo8831Q = ((InterfaceC4409m0) list.get(0)).mo8831Q(j3);
            return interfaceC4418p0.mo8010z(AbstractC4232b.m8514g(abstractC4377b1Mo8831Q.f14593g, j3), AbstractC4232b.m8513f(abstractC4377b1Mo8831Q.f14594h, j3), c4174u, new C0384n(abstractC4377b1Mo8831Q, 4));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i9 = 0; i9 < size2; i9++) {
            AbstractC4377b1 abstractC4377b1Mo8831Q2 = ((InterfaceC4409m0) list.get(i9)).mo8831Q(j3);
            iMax = Math.max(abstractC4377b1Mo8831Q2.f14593g, iMax);
            iMax2 = Math.max(abstractC4377b1Mo8831Q2.f14594h, iMax2);
            arrayList.add(abstractC4377b1Mo8831Q2);
        }
        return interfaceC4418p0.mo8010z(AbstractC4232b.m8514g(iMax, j3), AbstractC4232b.m8513f(iMax2, j3), c4174u, new C1488u(1, arrayList));
    }
}
