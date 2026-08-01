package p176i1;

import java.util.ArrayList;
import java.util.List;
import p029F0.AbstractC0391b0;
import p029F0.C0397e0;
import p029F0.C0399f0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0377O;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p061L2.C0982v;
import p153e1.C2005a;

/* JADX INFO: renamed from: i1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2289e implements InterfaceC0377O {

    /* JADX INFO: renamed from: b */
    public static final C2289e f7461b = new C2289e(0);

    /* JADX INFO: renamed from: c */
    public static final C2289e f7462c = new C2289e(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7463a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [i1.e.<clinit>():void] */
    public /* synthetic */ C2289e(int i5) {
        this.f7463a = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: i */
    public final InterfaceC0378P mo16i(InterfaceC0379Q interfaceC0379Q, List list, long j5) {
        switch (this.f7463a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iM3682j = 0;
                int iM3681i = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    AbstractC0391b0 abstractC0391b0Mo648e = ((InterfaceC0376N) list.get(i5)).mo648e(j5);
                    iM3682j = Math.max(iM3682j, abstractC0391b0Mo648e.f1206d);
                    iM3681i = Math.max(iM3681i, abstractC0391b0Mo648e.f1207e);
                    arrayList.add(abstractC0391b0Mo648e);
                }
                if (list.isEmpty()) {
                    iM3682j = C2005a.m3682j(j5);
                    iM3681i = C2005a.m3681i(j5);
                }
                return interfaceC0379Q.mo604f0(iM3682j, iM3681i, C0982v.f3048d, new C0399f0(1, arrayList));
            default:
                int size2 = list.size();
                C0982v c0982v = C0982v.f3048d;
                if (size2 == 0) {
                    return interfaceC0379Q.mo604f0(0, 0, c0982v, C2287c.f7453j);
                }
                if (size2 == 1) {
                    AbstractC0391b0 abstractC0391b0Mo648e2 = ((InterfaceC0376N) list.get(0)).mo648e(j5);
                    return interfaceC0379Q.mo604f0(abstractC0391b0Mo648e2.f1206d, abstractC0391b0Mo648e2.f1207e, c0982v, new C0397e0(abstractC0391b0Mo648e2, 2));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i6 = 0; i6 < size3; i6++) {
                    AbstractC0391b0 abstractC0391b0Mo648e3 = ((InterfaceC0376N) list.get(i6)).mo648e(j5);
                    iMax = Math.max(iMax, abstractC0391b0Mo648e3.f1206d);
                    iMax2 = Math.max(iMax2, abstractC0391b0Mo648e3.f1207e);
                    arrayList2.add(abstractC0391b0Mo648e3);
                }
                return interfaceC0379Q.mo604f0(iMax, iMax2, c0982v, new C0399f0(2, arrayList2));
        }
    }
}
