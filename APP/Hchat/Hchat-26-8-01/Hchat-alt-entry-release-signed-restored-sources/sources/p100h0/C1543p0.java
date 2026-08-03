package p100h0;

import java.util.ArrayList;
import java.util.List;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4412n0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import tf.C4174u;

/* JADX INFO: renamed from: h0.p0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1543p0 implements InterfaceC4412n0 {

    /* JADX INFO: renamed from: a */
    public static final C1543p0 f5150a = new C1543p0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: h */
    public final InterfaceC4415o0 mo3994h(InterfaceC4418p0 interfaceC4418p0, List list, long j3) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC4377b1 abstractC4377b1Mo8831Q = ((InterfaceC4409m0) list.get(i9)).mo8831Q(j3);
            iMax = Math.max(iMax, abstractC4377b1Mo8831Q.f14593g);
            iMax2 = Math.max(iMax2, abstractC4377b1Mo8831Q.f14594h);
            arrayList.add(abstractC4377b1Mo8831Q);
        }
        return interfaceC4418p0.mo8010z(iMax, iMax2, C4174u.f13711g, new C1541o0(0, arrayList));
    }
}
