package p111ha;

import ga.AbstractC2625s1;
import gb.InterfaceC2667g2;
import java.util.Iterator;
import java.util.List;
import p024b9.AbstractC1061t;
import p160kb.InterfaceC4229i;
import p160kb.InterfaceC4236p;
import p186m9.EnumC5132m;
import p212o9.C5667c;
import p213oa.C5691b;
import p213oa.C5693d;
import p343xa.C9474d;
import p343xa.EnumC9476f;

/* JADX INFO: renamed from: ha.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2923j0 {
    /* JADX INFO: renamed from: a */
    public static final Object m10662a(InterfaceC2933t interfaceC2933t, Object obj, boolean z10) {
        interfaceC2933t.getClass();
        obj.getClass();
        return z10 ? interfaceC2933t.mo10717d(obj) : obj;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m10663b(InterfaceC2667g2 interfaceC2667g2, InterfaceC4229i interfaceC4229i, InterfaceC2933t interfaceC2933t, C2921i0 c2921i0) {
        List listM22888i;
        interfaceC2667g2.getClass();
        interfaceC4229i.getClass();
        interfaceC2933t.getClass();
        c2921i0.getClass();
        InterfaceC4236p interfaceC4236pMo10897I = interfaceC2667g2.mo10897I(interfaceC4229i);
        if (!interfaceC2667g2.mo10886B(interfaceC4236pMo10897I)) {
            return null;
        }
        EnumC5132m enumC5132mMo9442I0 = interfaceC2667g2.mo9442I0(interfaceC4236pMo10897I);
        if (enumC5132mMo9442I0 != null) {
            return m10662a(interfaceC2933t, interfaceC2933t.mo10719f(enumC5132mMo9442I0), interfaceC2667g2.mo10924i0(interfaceC4229i) || AbstractC2625s1.m9320c(interfaceC2667g2, interfaceC4229i));
        }
        EnumC5132m enumC5132mMo9446l0 = interfaceC2667g2.mo9446l0(interfaceC4236pMo10897I);
        if (enumC5132mMo9446l0 != null) {
            return interfaceC2933t.mo10715b("[" + EnumC9476f.m36913g(enumC5132mMo9446l0).m36914h());
        }
        if (interfaceC2667g2.mo9441G(interfaceC4236pMo10897I)) {
            C5693d c5693dMo9439A = interfaceC2667g2.mo9439A(interfaceC4236pMo10897I);
            C5691b c5691bM22893n = c5693dMo9439A != null ? C5667c.f17796a.m22893n(c5693dMo9439A) : null;
            if (c5691bM22893n != null) {
                if (!c2921i0.m10650a() && ((listM22888i = C5667c.f17796a.m22888i()) == null || !listM22888i.isEmpty())) {
                    Iterator it = listM22888i.iterator();
                    while (it.hasNext()) {
                        if (AbstractC1061t.m3842c(((C5667c.a) it.next()).m22899d(), c5691bM22893n)) {
                            return null;
                        }
                    }
                }
                String strM36906h = C9474d.m36906h(c5691bM22893n);
                strM36906h.getClass();
                return interfaceC2933t.mo10716c(strM36906h);
            }
        }
        return null;
    }
}
