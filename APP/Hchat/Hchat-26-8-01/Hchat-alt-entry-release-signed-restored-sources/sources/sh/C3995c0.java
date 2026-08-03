package sh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p100h0.C1541o0;
import p259r9.AbstractC3754e0;
import p293u2.C4231a;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4412n0;
import p308v1.InterfaceC4414o;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import tf.AbstractC4166m;
import tf.C4174u;

/* JADX INFO: renamed from: sh.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3995c0 implements InterfaceC4412n0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: h */
    public final InterfaceC4415o0 mo3994h(InterfaceC4418p0 interfaceC4418p0, List list, long j3) {
        Iterator it = AbstractC4166m.m8403L1(Math.min(8, list.size()), list).iterator();
        int i9 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            int iMo8830M = ((InterfaceC4409m0) it.next()).mo8830M(C4231a.m8503g(j3));
            if (iMo8830M > i10) {
                i10 = iMo8830M;
            }
        }
        int iM7909r = AbstractC3754e0.m7909r(i10, interfaceC4418p0.mo1590G0(200), interfaceC4418p0.mo1590G0(288));
        long jM8497a = C4231a.m8497a(j3, iM7909r, iM7909r, 0, 0, 8);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC4409m0) it2.next()).mo8831Q(jM8497a));
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            i9 += ((AbstractC4377b1) it3.next()).f14594h;
        }
        return interfaceC4418p0.mo8010z(iM7909r, i9, C4174u.f13711g, new C1541o0(1, arrayList));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: i */
    public final int mo3995i(InterfaceC4414o interfaceC4414o, List list, int i9) {
        interfaceC4414o.getClass();
        Iterator it = AbstractC4166m.m8403L1(Math.min(8, list.size()), list).iterator();
        int iMo8833p0 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            int iMo8830M = ((InterfaceC4409m0) it.next()).mo8830M(Integer.MAX_VALUE);
            if (iMo8830M > i10) {
                i10 = iMo8830M;
            }
        }
        int iM7909r = AbstractC3754e0.m7909r(i10, interfaceC4414o.mo1590G0(200), interfaceC4414o.mo1590G0(288));
        Iterator it2 = AbstractC4166m.m8403L1(Math.min(8, list.size()), list).iterator();
        while (it2.hasNext()) {
            iMo8833p0 += ((InterfaceC4409m0) it2.next()).mo8833p0(iM7909r);
        }
        return iMo8833p0;
    }
}
