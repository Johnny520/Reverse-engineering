package p358y2;

import java.util.ArrayList;
import java.util.List;
import p028c1.C0384n;
import p099h.C1488u;
import p293u2.C4231a;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4412n0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import tf.C4174u;

/* JADX INFO: renamed from: y2.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5970e implements InterfaceC4412n0 {

    /* JADX INFO: renamed from: b */
    public static final C5970e f24264b = new C5970e(0);

    /* JADX INFO: renamed from: c */
    public static final C5970e f24265c = new C5970e(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24266a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [y2.e.<clinit>():void] */
    public /* synthetic */ C5970e(int i9) {
        this.f24266a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: h */
    public final InterfaceC4415o0 mo3994h(InterfaceC4418p0 interfaceC4418p0, List list, long j3) {
        switch (this.f24266a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iM8506j = 0;
                int iM8505i = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    AbstractC4377b1 abstractC4377b1Mo8831Q = ((InterfaceC4409m0) list.get(i9)).mo8831Q(j3);
                    iM8506j = Math.max(iM8506j, abstractC4377b1Mo8831Q.f14593g);
                    iM8505i = Math.max(iM8505i, abstractC4377b1Mo8831Q.f14594h);
                    arrayList.add(abstractC4377b1Mo8831Q);
                }
                if (list.isEmpty()) {
                    iM8506j = C4231a.m8506j(j3);
                    iM8505i = C4231a.m8505i(j3);
                }
                return interfaceC4418p0.mo8010z(iM8506j, iM8505i, C4174u.f13711g, new C1488u(2, arrayList));
            default:
                int size2 = list.size();
                C4174u c4174u = C4174u.f13711g;
                if (size2 == 0) {
                    return interfaceC4418p0.mo8010z(0, 0, c4174u, C5966c.f24247l);
                }
                if (size2 == 1) {
                    AbstractC4377b1 abstractC4377b1Mo8831Q2 = ((InterfaceC4409m0) list.get(0)).mo8831Q(j3);
                    return interfaceC4418p0.mo8010z(abstractC4377b1Mo8831Q2.f14593g, abstractC4377b1Mo8831Q2.f14594h, c4174u, new C0384n(abstractC4377b1Mo8831Q2, 6));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i10 = 0; i10 < size3; i10++) {
                    AbstractC4377b1 abstractC4377b1Mo8831Q3 = ((InterfaceC4409m0) list.get(i10)).mo8831Q(j3);
                    iMax = Math.max(iMax, abstractC4377b1Mo8831Q3.f14593g);
                    iMax2 = Math.max(iMax2, abstractC4377b1Mo8831Q3.f14594h);
                    arrayList2.add(abstractC4377b1Mo8831Q3);
                }
                return interfaceC4418p0.mo8010z(iMax, iMax2, c4174u, new C1488u(3, arrayList2));
        }
    }
}
