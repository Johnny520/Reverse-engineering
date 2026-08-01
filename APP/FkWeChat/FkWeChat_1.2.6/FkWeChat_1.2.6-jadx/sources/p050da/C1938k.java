package p050da;

import androidx.compose.runtime.C0503h0;
import gb.AbstractC2650c1;
import gb.AbstractC2673i0;
import gb.AbstractC2706r0;
import gb.C2704q1;
import gb.C2731z1;
import gb.InterfaceC2643a2;
import gb.InterfaceC2646b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lb.AbstractC4734d;
import p024b9.AbstractC1061t;
import p112hb.AbstractC2949h;
import p112hb.InterfaceC2947f;
import p172l8.C4711r;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p259ra.AbstractC6569n;
import p259ra.InterfaceC6578w;
import p299ub.AbstractC8621f0;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: da.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1938k extends AbstractC2673i0 implements InterfaceC2646b1 {
    public C1938k(AbstractC2650c1 abstractC2650c1, AbstractC2650c1 abstractC2650c12, boolean z10) {
        super(abstractC2650c1, abstractC2650c12);
        if (z10) {
            return;
        }
        InterfaceC2947f.f7782a.mo10840b(abstractC2650c1, abstractC2650c12);
    }

    /* JADX INFO: renamed from: h1 */
    public static final CharSequence m7027h1(String str) {
        str.getClass();
        return "(raw) " + str;
    }

    /* JADX INFO: renamed from: i1 */
    public static final boolean m7028i1(String str, String str2) {
        return AbstractC1061t.m3842c(str, AbstractC8621f0.m33102I0(str2, "out ")) || AbstractC1061t.m3842c(str2, "*");
    }

    /* JADX INFO: renamed from: j1 */
    public static final List m7029j1(AbstractC6569n abstractC6569n, AbstractC2706r0 abstractC2706r0) {
        List listMo9330R0 = abstractC2706r0.mo9330R0();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listMo9330R0, 10));
        Iterator it = listMo9330R0.iterator();
        while (it.hasNext()) {
            arrayList.add(abstractC6569n.mo25912T((InterfaceC2643a2) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k1 */
    public static final String m7030k1(String str, String str2) {
        if (!AbstractC8621f0.m33124Z(str, '<', false, 2, null)) {
            return str;
        }
        return AbstractC8621f0.m33153n1(str, '<', null, 2, null) + '<' + str2 + '>' + AbstractC8621f0.m33145j1(str, '>', null, 2, null);
    }

    @Override // gb.AbstractC2673i0
    /* JADX INFO: renamed from: a1 */
    public AbstractC2650c1 mo7035a1() {
        return m9451b1();
    }

    @Override // gb.AbstractC2673i0
    /* JADX INFO: renamed from: d1 */
    public String mo7036d1(AbstractC6569n abstractC6569n, InterfaceC6578w interfaceC6578w) {
        abstractC6569n.getClass();
        interfaceC6578w.getClass();
        String strMo25911S = abstractC6569n.mo25911S(m9451b1());
        String strMo25911S2 = abstractC6569n.mo25911S(m9452c1());
        if (interfaceC6578w.mo26043n()) {
            return "raw (" + strMo25911S + ".." + strMo25911S2 + ')';
        }
        if (m9452c1().mo9330R0().isEmpty()) {
            return abstractC6569n.mo25908P(strMo25911S, strMo25911S2, AbstractC4734d.m18919n(this));
        }
        List listM7029j1 = m7029j1(abstractC6569n, m9451b1());
        List listM7029j12 = m7029j1(abstractC6569n, m9452c1());
        String strM20585s0 = AbstractC5081g0.m20585s0(listM7029j1, ", ", null, null, 0, null, C1937j.f5415q, 30, null);
        List<C4711r> listM20574h1 = AbstractC5081g0.m20574h1(listM7029j1, listM7029j12);
        if (listM20574h1 == null || !listM20574h1.isEmpty()) {
            for (C4711r c4711r : listM20574h1) {
                if (!m7028i1((String) c4711r.m18795e(), (String) c4711r.m18796f())) {
                    break;
                }
            }
            strMo25911S2 = m7030k1(strMo25911S2, strM20585s0);
        } else {
            strMo25911S2 = m7030k1(strMo25911S2, strM20585s0);
        }
        String strM7030k1 = m7030k1(strMo25911S, strM20585s0);
        return AbstractC1061t.m3842c(strM7030k1, strMo25911S2) ? strM7030k1 : abstractC6569n.mo25908P(strM7030k1, strMo25911S2, AbstractC4734d.m18919n(this));
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public C1938k mo7032X0(boolean z10) {
        return new C1938k(m9451b1().mo7032X0(z10), m9452c1().mo7032X0(z10));
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public AbstractC2673i0 mo9325d1(AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        AbstractC2706r0 abstractC2706r0Mo9586a = abstractC2949h.mo9586a(m9451b1());
        abstractC2706r0Mo9586a.getClass();
        AbstractC2706r0 abstractC2706r0Mo9586a2 = abstractC2949h.mo9586a(m9452c1());
        abstractC2706r0Mo9586a2.getClass();
        return new C1938k((AbstractC2650c1) abstractC2706r0Mo9586a, (AbstractC2650c1) abstractC2706r0Mo9586a2, true);
    }

    @Override // gb.AbstractC2687l2
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public C1938k mo7034Z0(C2704q1 c2704q1) {
        c2704q1.getClass();
        return new C1938k(m9451b1().mo7034Z0(c2704q1), m9452c1().mo7034Z0(c2704q1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gb.AbstractC2673i0, gb.AbstractC2706r0
    /* JADX INFO: renamed from: v */
    public InterfaceC9913k mo7040v() {
        InterfaceC6004h interfaceC6004hMo5602u = mo9332T0().mo5602u();
        C2731z1 c2731z1 = null;
        Object[] objArr = 0;
        InterfaceC5995e interfaceC5995e = interfaceC6004hMo5602u instanceof InterfaceC5995e ? (InterfaceC5995e) interfaceC6004hMo5602u : null;
        if (interfaceC5995e == null) {
            C0503h0.m1691a("Incorrect classifier: ", mo9332T0().mo5602u());
            return null;
        }
        InterfaceC9913k interfaceC9913kMo23998O0 = interfaceC5995e.mo23998O0(new C1936i(c2731z1, 1, objArr == true ? 1 : 0));
        interfaceC9913kMo23998O0.getClass();
        return interfaceC9913kMo23998O0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1938k(AbstractC2650c1 abstractC2650c1, AbstractC2650c1 abstractC2650c12) {
        this(abstractC2650c1, abstractC2650c12, false);
        abstractC2650c1.getClass();
        abstractC2650c12.getClass();
    }
}
