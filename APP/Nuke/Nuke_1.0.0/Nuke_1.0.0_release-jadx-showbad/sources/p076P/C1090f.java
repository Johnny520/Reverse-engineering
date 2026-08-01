package p076P;

import java.util.ArrayList;
import java.util.List;
import p000A.C0056d0;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0377O;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p061L2.AbstractC0973m;
import p061L2.C0982v;
import p117X2.C1673r;
import p153e1.C2005a;

/* JADX INFO: renamed from: P.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1090f implements InterfaceC0377O {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m2147b(ArrayList arrayList, C1673r c1673r, InterfaceC0379Q interfaceC0379Q, ArrayList arrayList2, ArrayList arrayList3, C1673r c1673r2, ArrayList arrayList4, C1673r c1673r3, C1673r c1673r4) {
        float f2 = AbstractC1096i.f3520d;
        if (!arrayList.isEmpty()) {
            c1673r.f5707d = interfaceC0379Q.mo270S(f2) + c1673r.f5707d;
        }
        arrayList.add(0, AbstractC0973m.m2024e0(arrayList2));
        arrayList3.add(Integer.valueOf(c1673r2.f5707d));
        arrayList4.add(Integer.valueOf(c1673r.f5707d));
        c1673r.f5707d += c1673r2.f5707d;
        c1673r3.f5707d = Math.max(c1673r3.f5707d, c1673r4.f5707d);
        arrayList2.clear();
        c1673r4.f5707d = 0;
        c1673r2.f5707d = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: i */
    public final InterfaceC0378P mo16i(InterfaceC0379Q interfaceC0379Q, List list, long j5) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C1673r c1673r = new C1673r();
        C1673r c1673r2 = new C1673r();
        ArrayList arrayList6 = new ArrayList();
        C1673r c1673r3 = new C1673r();
        C1673r c1673r4 = new C1673r();
        float f2 = AbstractC1096i.f3519c;
        float f5 = AbstractC1096i.f3517a;
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            AbstractC0391b0 abstractC0391b0Mo648e = ((InterfaceC0376N) list.get(i5)).mo648e(j5);
            if (!arrayList6.isEmpty()) {
                ArrayList arrayList7 = arrayList3;
                C1673r c1673r5 = c1673r2;
                if (interfaceC0379Q.mo270S(f2) + c1673r3.f5707d + abstractC0391b0Mo648e.f1206d <= C2005a.m3680h(j5)) {
                    arrayList3 = arrayList7;
                    c1673r2 = c1673r5;
                } else {
                    arrayList3 = arrayList7;
                    c1673r2 = c1673r5;
                    m2147b(arrayList3, c1673r2, interfaceC0379Q, arrayList6, arrayList4, c1673r4, arrayList5, c1673r, c1673r3);
                }
            }
            if (arrayList6.isEmpty()) {
                arrayList2 = arrayList3;
            } else {
                arrayList2 = arrayList3;
                c1673r3.f5707d = interfaceC0379Q.mo270S(f2) + c1673r3.f5707d;
            }
            arrayList6.add(abstractC0391b0Mo648e);
            c1673r3.f5707d += abstractC0391b0Mo648e.f1206d;
            c1673r4.f5707d = Math.max(c1673r4.f5707d, abstractC0391b0Mo648e.f1207e);
            i5++;
            arrayList3 = arrayList2;
        }
        ArrayList arrayList8 = arrayList3;
        if (arrayList6.isEmpty()) {
            arrayList = arrayList8;
        } else {
            float f6 = AbstractC1096i.f3517a;
            arrayList = arrayList8;
            m2147b(arrayList, c1673r2, interfaceC0379Q, arrayList6, arrayList4, c1673r4, arrayList5, c1673r, c1673r3);
        }
        int iMax = Math.max(c1673r.f5707d, C2005a.m3682j(j5));
        int iMax2 = Math.max(c1673r2.f5707d, C2005a.m3681i(j5));
        float f7 = AbstractC1096i.f3517a;
        return interfaceC0379Q.mo604f0(iMax, iMax2, C0982v.f3048d, new C0056d0(arrayList, interfaceC0379Q, iMax, arrayList5));
    }
}
