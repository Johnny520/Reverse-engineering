package ke;

import ae.C0075f;
import ae.C0077h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import md.EnumC2824a;
import p077f8.AbstractC1089i;
import p259r9.AbstractC3754e0;
import p302ud.C4305a;
import p302ud.InterfaceC4313i;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;
import p350xd.AbstractC5774a;
import p350xd.C5775b;
import p350xd.C5779f;
import p383zd.C6138c;

/* JADX INFO: renamed from: ke.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2400i extends AbstractC3754e0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public static boolean m5739t0(InterfaceC4318n interfaceC4318n, C0077h c0077h, C4305a c4305a) {
        ArrayList<InterfaceC4314j> arrayList;
        List<C0075f> list = c0077h.f244h;
        if (interfaceC4318n != null) {
            if (interfaceC4318n instanceof C6138c) {
                return m5739t0(((C6138c) interfaceC4318n).f24728q, c0077h, c4305a);
            }
            if (interfaceC4318n instanceof InterfaceC4313i) {
                return m5739t0(((AbstractC5774a) interfaceC4318n).f23506i, c0077h, c4305a);
            }
            C5775b c5775b = new C5775b(interfaceC4318n);
            List listMo8675u = interfaceC4318n.mo8675u();
            Iterator it = listMo8675u.iterator();
            loop0: while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = c5775b.f23507k;
                if (!zHasNext) {
                    break;
                }
                InterfaceC4314j interfaceC4314j = (InterfaceC4314j) it.next();
                if (AbstractC1089i.m2743O(c4305a, interfaceC4314j)) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C4305a c4305a2 = ((C0075f) it2.next()).f234c;
                        if (c4305a2 != null) {
                            if (!c4305a2.f9217g.mo6235a(EnumC2824a.f9168u) && AbstractC1089i.m2743O(c4305a2, interfaceC4314j)) {
                                break loop0;
                            }
                        }
                    }
                    arrayList.add(interfaceC4314j);
                }
            }
            if (!arrayList.isEmpty()) {
                C5779f c5779f = new C5779f(interfaceC4318n, c5775b);
                c5775b.f23506i = c5779f;
                c5779f.f23519n = c0077h;
                c5779f.f23517l = new LinkedHashMap(list.size());
                for (C0075f c0075f : list) {
                    C5775b c5775b2 = c0075f.f236e;
                    if (c5775b2 != null) {
                        if (c0075f.f239h) {
                            c5779f.f23518m = c5775b2;
                        } else {
                            c5779f.f23517l.put(c0075f, c5775b2);
                        }
                    }
                }
                if (interfaceC4318n.mo8674l((InterfaceC4314j) arrayList.get(0), c5779f)) {
                    listMo8675u.removeAll(arrayList);
                    for (InterfaceC4314j interfaceC4314j2 : arrayList) {
                        if (interfaceC4314j2 instanceof AbstractC5774a) {
                            ((AbstractC5774a) interfaceC4314j2).f23506i = c5775b;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
