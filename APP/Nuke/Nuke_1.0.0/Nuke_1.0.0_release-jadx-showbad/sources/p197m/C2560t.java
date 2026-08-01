package p197m;

import java.util.ArrayList;
import java.util.List;
import p029F0.AbstractC0391b0;
import p029F0.C0399f0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0377O;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p029F0.InterfaceC0420q;
import p061L2.C0982v;
import p153e1.C2016l;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: m.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2560t implements InterfaceC0377O {

    /* JADX INFO: renamed from: a */
    public final C2565y f8175a;

    /* JADX INFO: renamed from: b */
    public boolean f8176b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2560t(C2565y c2565y) {
        this.f8175a = c2565y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: a */
    public final int mo651a(InterfaceC0420q interfaceC0420q, List list, int i5) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo649f = ((InterfaceC0376N) list.get(0)).mo649f(i5);
        int iM4208u = AbstractC2352g.m4208u(list);
        int i6 = 1;
        if (1 <= iM4208u) {
            while (true) {
                int iMo649f2 = ((InterfaceC0376N) list.get(i6)).mo649f(i5);
                if (iMo649f2 > iMo649f) {
                    iMo649f = iMo649f2;
                }
                if (i6 == iM4208u) {
                    break;
                }
                i6++;
            }
        }
        return iMo649f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: e */
    public final int mo652e(InterfaceC0420q interfaceC0420q, List list, int i5) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo645T = ((InterfaceC0376N) list.get(0)).mo645T(i5);
        int iM4208u = AbstractC2352g.m4208u(list);
        int i6 = 1;
        if (1 <= iM4208u) {
            while (true) {
                int iMo645T2 = ((InterfaceC0376N) list.get(i6)).mo645T(i5);
                if (iMo645T2 > iMo645T) {
                    iMo645T = iMo645T2;
                }
                if (i6 == iM4208u) {
                    break;
                }
                i6++;
            }
        }
        return iMo645T;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: f */
    public final int mo15f(InterfaceC0420q interfaceC0420q, List list, int i5) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo646X = ((InterfaceC0376N) list.get(0)).mo646X(i5);
        int iM4208u = AbstractC2352g.m4208u(list);
        int i6 = 1;
        if (1 <= iM4208u) {
            while (true) {
                int iMo646X2 = ((InterfaceC0376N) list.get(i6)).mo646X(i5);
                if (iMo646X2 > iMo646X) {
                    iMo646X = iMo646X2;
                }
                if (i6 == iM4208u) {
                    break;
                }
                i6++;
            }
        }
        return iMo646X;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: h */
    public final int mo653h(InterfaceC0420q interfaceC0420q, List list, int i5) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo647Z = ((InterfaceC0376N) list.get(0)).mo647Z(i5);
        int iM4208u = AbstractC2352g.m4208u(list);
        int i6 = 1;
        if (1 <= iM4208u) {
            while (true) {
                int iMo647Z2 = ((InterfaceC0376N) list.get(i6)).mo647Z(i5);
                if (iMo647Z2 > iMo647Z) {
                    iMo647Z = iMo647Z2;
                }
                if (i6 == iM4208u) {
                    break;
                }
                i6++;
            }
        }
        return iMo647Z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: i */
    public final InterfaceC0378P mo16i(InterfaceC0379Q interfaceC0379Q, List list, long j5) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC0391b0 abstractC0391b0Mo648e = ((InterfaceC0376N) list.get(i5)).mo648e(j5);
            iMax = Math.max(iMax, abstractC0391b0Mo648e.f1206d);
            iMax2 = Math.max(iMax2, abstractC0391b0Mo648e.f1207e);
            arrayList.add(abstractC0391b0Mo648e);
        }
        boolean zMo606z = interfaceC0379Q.mo606z();
        C2565y c2565y = this.f8175a;
        if (zMo606z) {
            this.f8176b = true;
            c2565y.f8187a.setValue(new C2016l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.f8176b) {
            c2565y.f8187a.setValue(new C2016l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return interfaceC0379Q.mo604f0(iMax, iMax2, C0982v.f3048d, new C0399f0(3, arrayList));
    }
}
