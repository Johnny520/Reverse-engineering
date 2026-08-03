package p099h;

import java.util.ArrayList;
import java.util.List;
import p293u2.C4242l;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4412n0;
import p308v1.InterfaceC4414o;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import tf.C4174u;

/* JADX INFO: renamed from: h.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1490v implements InterfaceC4412n0 {

    /* JADX INFO: renamed from: a */
    public final C1447c0 f4944a;

    /* JADX INFO: renamed from: b */
    public boolean f4945b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1490v(C1447c0 c1447c0) {
        this.f4944a = c1447c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: a */
    public final int mo3991a(InterfaceC4414o interfaceC4414o, List list, int i9) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo8830M = ((InterfaceC4409m0) list.get(0)).mo8830M(i9);
        int i10 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo8830M2 = ((InterfaceC4409m0) list.get(i10)).mo8830M(i9);
                if (iMo8830M2 > iMo8830M) {
                    iMo8830M = iMo8830M2;
                }
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        return iMo8830M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: c */
    public final int mo3992c(InterfaceC4414o interfaceC4414o, List list, int i9) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo8829G = ((InterfaceC4409m0) list.get(0)).mo8829G(i9);
        int i10 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo8829G2 = ((InterfaceC4409m0) list.get(i10)).mo8829G(i9);
                if (iMo8829G2 > iMo8829G) {
                    iMo8829G = iMo8829G2;
                }
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        return iMo8829G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: g */
    public final int mo3993g(InterfaceC4414o interfaceC4414o, List list, int i9) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo8832j = ((InterfaceC4409m0) list.get(0)).mo8832j(i9);
        int i10 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo8832j2 = ((InterfaceC4409m0) list.get(i10)).mo8832j(i9);
                if (iMo8832j2 > iMo8832j) {
                    iMo8832j = iMo8832j2;
                }
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        return iMo8832j;
    }

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
        boolean zMo8009u0 = interfaceC4418p0.mo8009u0();
        C1447c0 c1447c0 = this.f4944a;
        if (zMo8009u0) {
            this.f4945b = true;
            c1447c0.f4802a.setValue(new C4242l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.f4945b) {
            c1447c0.f4802a.setValue(new C4242l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return interfaceC4418p0.mo8010z(iMax, iMax2, C4174u.f13711g, new C1488u(0, arrayList));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: i */
    public final int mo3995i(InterfaceC4414o interfaceC4414o, List list, int i9) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo8833p0 = ((InterfaceC4409m0) list.get(0)).mo8833p0(i9);
        int i10 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo8833p02 = ((InterfaceC4409m0) list.get(i10)).mo8833p0(i9);
                if (iMo8833p02 > iMo8833p0) {
                    iMo8833p0 = iMo8833p02;
                }
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        return iMo8833p0;
    }
}
