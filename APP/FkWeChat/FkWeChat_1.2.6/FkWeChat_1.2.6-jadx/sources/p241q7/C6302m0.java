package p241q7;

import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p034c7.InterfaceC1368h0;
import p185m8.AbstractC5081g0;
import p241q7.AbstractC6296j0;
import p376zd.C9987e;

/* JADX INFO: renamed from: q7.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6302m0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1368h0 f19772a;

    /* JADX INFO: renamed from: b */
    public final List f19773b;

    /* JADX INFO: renamed from: c */
    public final C6314s0 f19774c;

    /* JADX INFO: renamed from: d */
    public C6304n0 f19775d;

    /* JADX INFO: renamed from: e */
    public AbstractC6296j0 f19776e;

    /* JADX INFO: renamed from: f */
    public final List f19777f;

    public C6302m0(InterfaceC1368h0 interfaceC1368h0, List list) {
        interfaceC1368h0.getClass();
        list.getClass();
        this.f19772a = interfaceC1368h0;
        this.f19773b = list;
        this.f19774c = new C6314s0();
        this.f19777f = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m24929a(List list) {
        list.getClass();
        return AbstractC5081g0.m20585s0(list, " -> ", "  ", null, 0, null, new InterfaceC0184l() { // from class: q7.l0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C6302m0.m24930b((AbstractC6296j0.b) obj);
            }
        }, 28, null);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m24930b(AbstractC6296j0.b bVar) {
        bVar.getClass();
        return "\"" + bVar.m24903a().m24982Z() + '\"';
    }

    /* JADX INFO: renamed from: c */
    public final void m24931c(List list) {
        list.getClass();
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add((AbstractC6296j0.b) list.get(i10));
        }
        this.f19777f.add(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public final void m24932d(C6319w c6319w, int i10) {
        c6319w.getClass();
        this.f19774c.m24971d(new C6304n0(c6319w, i10, null, 4, null));
    }

    /* JADX INFO: renamed from: e */
    public final String m24933e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(toString());
        sb2.append('\n');
        C6304n0 c6304n0 = this.f19775d;
        if (c6304n0 != null) {
            c6304n0.m24941b(sb2, 0);
        }
        if (this.f19776e != null) {
            sb2.append("Matched routes:");
            sb2.append('\n');
            if (this.f19777f.isEmpty()) {
                sb2.append("  No results");
                sb2.append('\n');
            } else {
                sb2.append(AbstractC5081g0.m20585s0(this.f19777f, "\n", null, null, 0, null, new InterfaceC0184l() { // from class: q7.k0
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj) {
                        return C6302m0.m24929a((List) obj);
                    }
                }, 30, null));
                sb2.append('\n');
            }
            sb2.append("Routing resolve result:");
            sb2.append('\n');
            StringBuilder sb3 = new StringBuilder("  ");
            AbstractC6296j0 abstractC6296j0 = this.f19776e;
            if (abstractC6296j0 == null) {
                AbstractC1061t.m3851l("finalResult");
                abstractC6296j0 = null;
            }
            sb3.append(abstractC6296j0);
            sb2.append(sb3.toString());
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: f */
    public final void m24934f(C6319w c6319w, int i10, AbstractC6296j0 abstractC6296j0) {
        c6319w.getClass();
        abstractC6296j0.getClass();
        C6304n0 c6304n0 = (C6304n0) this.f19774c.m24970c();
        if (!AbstractC1061t.m3842c(c6304n0.m24942c(), c6319w)) {
            C9987e.m38645a("end should be called for the same route as begin");
        } else if (c6304n0.m24943d() != i10) {
            C9987e.m38645a("end should be called for the same segmentIndex as begin");
        } else {
            c6304n0.m24944e(abstractC6296j0);
            m24935g(c6304n0);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m24935g(C6304n0 c6304n0) {
        if (this.f19774c.m24968a()) {
            this.f19775d = c6304n0;
        } else {
            ((C6304n0) this.f19774c.m24969b()).m24940a(c6304n0);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m24936h(AbstractC6296j0 abstractC6296j0) {
        abstractC6296j0.getClass();
        this.f19776e = abstractC6296j0;
    }

    /* JADX INFO: renamed from: i */
    public final void m24937i(C6319w c6319w, int i10, AbstractC6296j0 abstractC6296j0) {
        c6319w.getClass();
        abstractC6296j0.getClass();
        m24935g(new C6304n0(c6319w, i10, abstractC6296j0));
    }

    public String toString() {
        return "Trace for " + this.f19773b;
    }
}
