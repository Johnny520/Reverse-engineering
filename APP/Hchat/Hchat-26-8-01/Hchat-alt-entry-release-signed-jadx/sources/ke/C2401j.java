package ke;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import md.AbstractC2828e;
import md.C2829f;
import md.EnumC2824a;
import p012ah.C0086a;
import p071f1.AbstractC1018n0;
import p302ud.C4305a;
import p302ud.C4322r;
import p302ud.InterfaceC4312h;
import p302ud.InterfaceC4313i;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;
import p350xd.C5777d;
import p383zd.C6138c;

/* JADX INFO: renamed from: ke.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2401j extends AbstractC1018n0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: ud.h */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static boolean m5740p(InterfaceC4314j interfaceC4314j) {
        if (interfaceC4314j instanceof InterfaceC4312h) {
            InterfaceC4312h interfaceC4312h = (InterfaceC4312h) interfaceC4314j;
            return interfaceC4312h.mo8643g().isEmpty() || ((AbstractC2828e) interfaceC4312h).f9217g.mo6235a(EnumC2824a.f9161n);
        }
        if (!(interfaceC4314j instanceof InterfaceC4318n)) {
            C0086a.m452k("Unknown container type: ".concat(String.valueOf(interfaceC4314j.getClass())));
            return false;
        }
        Iterator it = ((InterfaceC4318n) interfaceC4314j).mo8675u().iterator();
        while (it.hasNext()) {
            if (!m5740p((InterfaceC4314j) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1018n0, ke.InterfaceC2396e
    /* JADX INFO: renamed from: a */
    public final boolean mo2614a(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        super.mo2614a(c4322r, interfaceC4318n);
        return !(interfaceC4318n instanceof C5777d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1018n0
    /* JADX INFO: renamed from: l */
    public final void mo2623l(C4322r c4322r, InterfaceC4312h interfaceC4312h, InterfaceC4318n interfaceC4318n) {
        InterfaceC4314j interfaceC4314j;
        ArrayDeque<InterfaceC4318n> arrayDeque = (ArrayDeque) this.f3204g;
        if (interfaceC4312h.getClass() != C4305a.class) {
            return;
        }
        C4305a c4305a = (C4305a) interfaceC4312h;
        C2829f c2829f = c4305a.f9217g;
        EnumC2824a enumC2824a = EnumC2824a.f9161n;
        if (c2829f.mo6235a(enumC2824a)) {
            ArrayList arrayList = c4305a.f14351l;
            if (arrayList.size() == 1) {
                if (c4322r.f14406F.size() != 0) {
                    if (c4322r.m8696U(c4305a) != null) {
                        return;
                    }
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC4318n) it.next()).getClass() == C6138c.class) {
                            return;
                        }
                    }
                }
                InterfaceC4314j interfaceC4314j2 = c4305a;
                for (InterfaceC4318n interfaceC4318n2 : arrayDeque) {
                    if (!(interfaceC4318n2 instanceof InterfaceC4313i)) {
                        List listMo8675u = interfaceC4318n2.mo8675u();
                        if (listMo8675u.isEmpty()) {
                            continue;
                        } else {
                            ListIterator listIterator = listMo8675u.listIterator(listMo8675u.size());
                            while (listIterator.hasPrevious() && (interfaceC4314j = (InterfaceC4314j) listIterator.previous()) != interfaceC4314j2) {
                                if (!m5740p(interfaceC4314j)) {
                                    return;
                                }
                            }
                        }
                    }
                    interfaceC4314j2 = interfaceC4318n2;
                }
                arrayList.remove(0);
                c4305a.m6227D(enumC2824a);
            }
        }
    }
}
