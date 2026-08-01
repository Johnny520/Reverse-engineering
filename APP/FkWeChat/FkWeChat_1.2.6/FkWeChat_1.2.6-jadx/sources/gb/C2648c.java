package gb;

import gb.C2713t1;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import p024b9.AbstractC1061t;
import p160kb.InterfaceC4224d;
import p160kb.InterfaceC4229i;
import p160kb.InterfaceC4230j;
import p160kb.InterfaceC4236p;
import p160kb.InterfaceC4238r;

/* JADX INFO: renamed from: gb.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2648c {

    /* JADX INFO: renamed from: a */
    public static final C2648c f6963a = new C2648c();

    /* JADX INFO: renamed from: a */
    public final boolean m9342a(C2713t1 c2713t1, InterfaceC4230j interfaceC4230j, C2713t1.c cVar) {
        c2713t1.getClass();
        interfaceC4230j.getClass();
        cVar.getClass();
        InterfaceC4238r interfaceC4238rM9606j = c2713t1.m9606j();
        if ((interfaceC4238rM9606j.mo10955z(interfaceC4230j) && !interfaceC4238rM9606j.mo10953y(interfaceC4230j)) || interfaceC4238rM9606j.mo10938q(interfaceC4230j)) {
            return true;
        }
        c2713t1.m9607k();
        ArrayDeque arrayDequeM9604h = c2713t1.m9604h();
        arrayDequeM9604h.getClass();
        Set setM9605i = c2713t1.m9605i();
        setM9605i.getClass();
        arrayDequeM9604h.push(interfaceC4230j);
        while (!arrayDequeM9604h.isEmpty()) {
            InterfaceC4230j interfaceC4230j2 = (InterfaceC4230j) arrayDequeM9604h.pop();
            interfaceC4230j2.getClass();
            if (setM9605i.add(interfaceC4230j2)) {
                C2713t1.c cVar2 = interfaceC4238rM9606j.mo10953y(interfaceC4230j2) ? C2713t1.c.C10086c.f7102a : cVar;
                if (AbstractC1061t.m3842c(cVar2, C2713t1.c.C10086c.f7102a)) {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    continue;
                } else {
                    InterfaceC4238r interfaceC4238rM9606j2 = c2713t1.m9606j();
                    Iterator it = interfaceC4238rM9606j2.mo10929l(interfaceC4238rM9606j2.mo10763e(interfaceC4230j2)).iterator();
                    while (it.hasNext()) {
                        InterfaceC4230j interfaceC4230jMo9618a = cVar2.mo9618a(c2713t1, (InterfaceC4229i) it.next());
                        if ((interfaceC4238rM9606j.mo10955z(interfaceC4230jMo9618a) && !interfaceC4238rM9606j.mo10953y(interfaceC4230jMo9618a)) || interfaceC4238rM9606j.mo10938q(interfaceC4230jMo9618a)) {
                            c2713t1.m9601e();
                            return true;
                        }
                        arrayDequeM9604h.add(interfaceC4230jMo9618a);
                    }
                }
            }
        }
        c2713t1.m9601e();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9343b(C2713t1 c2713t1, InterfaceC4230j interfaceC4230j, InterfaceC4236p interfaceC4236p) {
        c2713t1.getClass();
        interfaceC4230j.getClass();
        interfaceC4236p.getClass();
        InterfaceC4238r interfaceC4238rM9606j = c2713t1.m9606j();
        if (f6963a.m9344c(c2713t1, interfaceC4230j, interfaceC4236p)) {
            return true;
        }
        c2713t1.m9607k();
        ArrayDeque arrayDequeM9604h = c2713t1.m9604h();
        arrayDequeM9604h.getClass();
        Set setM9605i = c2713t1.m9605i();
        setM9605i.getClass();
        arrayDequeM9604h.push(interfaceC4230j);
        while (!arrayDequeM9604h.isEmpty()) {
            InterfaceC4230j interfaceC4230j2 = (InterfaceC4230j) arrayDequeM9604h.pop();
            interfaceC4230j2.getClass();
            if (setM9605i.add(interfaceC4230j2)) {
                C2713t1.c cVar = interfaceC4238rM9606j.mo10953y(interfaceC4230j2) ? C2713t1.c.C10086c.f7102a : C2713t1.c.b.f7101a;
                if (AbstractC1061t.m3842c(cVar, C2713t1.c.C10086c.f7102a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    InterfaceC4238r interfaceC4238rM9606j2 = c2713t1.m9606j();
                    Iterator it = interfaceC4238rM9606j2.mo10929l(interfaceC4238rM9606j2.mo10763e(interfaceC4230j2)).iterator();
                    while (it.hasNext()) {
                        InterfaceC4230j interfaceC4230jMo9618a = cVar.mo9618a(c2713t1, (InterfaceC4229i) it.next());
                        if (f6963a.m9344c(c2713t1, interfaceC4230jMo9618a, interfaceC4236p)) {
                            c2713t1.m9601e();
                            return true;
                        }
                        arrayDequeM9604h.add(interfaceC4230jMo9618a);
                    }
                }
            }
        }
        c2713t1.m9601e();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9344c(C2713t1 c2713t1, InterfaceC4230j interfaceC4230j, InterfaceC4236p interfaceC4236p) {
        InterfaceC4238r interfaceC4238rM9606j = c2713t1.m9606j();
        if (interfaceC4238rM9606j.mo10891E(interfaceC4230j)) {
            return true;
        }
        if (interfaceC4238rM9606j.mo10953y(interfaceC4230j)) {
            return false;
        }
        if (c2713t1.m9611o() && interfaceC4238rM9606j.mo10908S(interfaceC4230j)) {
            return true;
        }
        return interfaceC4238rM9606j.mo10923h0(interfaceC4238rM9606j.mo10763e(interfaceC4230j), interfaceC4236p);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9345d(C2713t1 c2713t1, InterfaceC4230j interfaceC4230j, InterfaceC4230j interfaceC4230j2) {
        c2713t1.getClass();
        interfaceC4230j.getClass();
        interfaceC4230j2.getClass();
        return m9346e(c2713t1, interfaceC4230j, interfaceC4230j2);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9346e(C2713t1 c2713t1, InterfaceC4230j interfaceC4230j, InterfaceC4230j interfaceC4230j2) {
        InterfaceC4238r interfaceC4238rM9606j = c2713t1.m9606j();
        if (C2664g.f6997b) {
            if (!interfaceC4238rM9606j.mo10762d(interfaceC4230j) && !interfaceC4238rM9606j.mo10951x(interfaceC4238rM9606j.mo10763e(interfaceC4230j))) {
                c2713t1.m9608l(interfaceC4230j);
            }
            if (!interfaceC4238rM9606j.mo10762d(interfaceC4230j2)) {
                c2713t1.m9608l(interfaceC4230j2);
            }
        }
        if (interfaceC4238rM9606j.mo10953y(interfaceC4230j2) || interfaceC4238rM9606j.mo10938q(interfaceC4230j) || interfaceC4238rM9606j.mo10910U(interfaceC4230j)) {
            return true;
        }
        if ((interfaceC4230j instanceof InterfaceC4224d) && interfaceC4238rM9606j.mo10922g0((InterfaceC4224d) interfaceC4230j)) {
            return true;
        }
        C2648c c2648c = f6963a;
        if (c2648c.m9342a(c2713t1, interfaceC4230j, C2713t1.c.b.f7101a)) {
            return true;
        }
        if (interfaceC4238rM9606j.mo10938q(interfaceC4230j2) || c2648c.m9342a(c2713t1, interfaceC4230j2, C2713t1.c.d.f7103a) || interfaceC4238rM9606j.mo10955z(interfaceC4230j)) {
            return false;
        }
        return c2648c.m9343b(c2713t1, interfaceC4230j, interfaceC4238rM9606j.mo10763e(interfaceC4230j2));
    }
}
