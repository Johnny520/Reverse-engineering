package p111ha;

import com.alibaba.fastjson2.internal.asm.ASMUtils;
import gb.AbstractC2706r0;
import java.util.Iterator;
import java.util.List;
import p024b9.AbstractC1061t;
import p111ha.AbstractC2932s;
import p185m8.AbstractC5081g0;
import p186m9.C5135p;
import p212o9.C5667c;
import p213oa.C5691b;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6000f1;
import p229p9.InterfaceC6016l;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6039s1;
import p229p9.InterfaceC6056z;
import p327wa.AbstractC9211e;
import p343xa.C9474d;
import p343xa.EnumC9476f;
import p358y9.AbstractC9646s0;
import p358y9.C9625i;
import sa.AbstractC7259i;

/* JADX INFO: renamed from: ha.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2909c0 {
    /* JADX INFO: renamed from: a */
    public static final void m10560a(StringBuilder sb2, AbstractC2706r0 abstractC2706r0) {
        sb2.append(m10566g(abstractC2706r0));
    }

    /* JADX INFO: renamed from: b */
    public static final String m10561b(InterfaceC6056z interfaceC6056z, boolean z10, boolean z11) {
        String strM23030c;
        interfaceC6056z.getClass();
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            if (interfaceC6056z instanceof InterfaceC6016l) {
                strM23030c = "<init>";
            } else {
                strM23030c = interfaceC6056z.getName().m23030c();
                strM23030c.getClass();
            }
            sb2.append(strM23030c);
        }
        sb2.append("(");
        InterfaceC5988b1 interfaceC5988b1Mo12682q0 = interfaceC6056z.mo12682q0();
        if (interfaceC5988b1Mo12682q0 != null) {
            AbstractC2706r0 type = interfaceC5988b1Mo12682q0.getType();
            type.getClass();
            m10560a(sb2, type);
        }
        Iterator it = interfaceC6056z.mo12680m().iterator();
        while (it.hasNext()) {
            AbstractC2706r0 type2 = ((InterfaceC6039s1) it.next()).getType();
            type2.getClass();
            m10560a(sb2, type2);
        }
        sb2.append(")");
        if (z10) {
            if (AbstractC2922j.m10659c(interfaceC6056z)) {
                sb2.append("V");
            } else {
                AbstractC2706r0 abstractC2706r0Mo12675f = interfaceC6056z.mo12675f();
                abstractC2706r0Mo12675f.getClass();
                m10560a(sb2, abstractC2706r0Mo12675f);
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m10562c(InterfaceC6056z interfaceC6056z, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return m10561b(interfaceC6056z, z10, z11);
    }

    /* JADX INFO: renamed from: d */
    public static final String m10563d(InterfaceC5983a interfaceC5983a) {
        interfaceC5983a.getClass();
        C2915f0 c2915f0 = C2915f0.f7680a;
        if (AbstractC7259i.m28739E(interfaceC5983a)) {
            return null;
        }
        InterfaceC6019m interfaceC6019mMo7443b = interfaceC5983a.mo7443b();
        InterfaceC5995e interfaceC5995e = interfaceC6019mMo7443b instanceof InterfaceC5995e ? (InterfaceC5995e) interfaceC6019mMo7443b : null;
        if (interfaceC5995e == null || interfaceC5995e.getName().m23033k()) {
            return null;
        }
        InterfaceC5983a interfaceC5983aMo12664a = interfaceC5983a.mo12664a();
        InterfaceC6000f1 interfaceC6000f1 = interfaceC5983aMo12664a instanceof InterfaceC6000f1 ? (InterfaceC6000f1) interfaceC5983aMo12664a : null;
        if (interfaceC6000f1 == null) {
            return null;
        }
        return AbstractC2907b0.m10559a(c2915f0, interfaceC5995e, m10562c(interfaceC6000f1, false, false, 3, null));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m10564e(InterfaceC5983a interfaceC5983a) {
        InterfaceC6056z interfaceC6056zM37648l;
        interfaceC5983a.getClass();
        if (!(interfaceC5983a instanceof InterfaceC6056z)) {
            return false;
        }
        InterfaceC6056z interfaceC6056z = (InterfaceC6056z) interfaceC5983a;
        if (AbstractC1061t.m3842c(interfaceC6056z.getName().m23030c(), "remove") && interfaceC6056z.mo12680m().size() == 1 && !AbstractC9646s0.m37720n((InterfaceC5986b) interfaceC5983a)) {
            List listMo12680m = interfaceC6056z.mo12664a().mo12680m();
            listMo12680m.getClass();
            AbstractC2706r0 type = ((InterfaceC6039s1) AbstractC5081g0.m20537I0(listMo12680m)).getType();
            type.getClass();
            AbstractC2932s abstractC2932sM10566g = m10566g(type);
            AbstractC2932s.d dVar = abstractC2932sM10566g instanceof AbstractC2932s.d ? (AbstractC2932s.d) abstractC2932sM10566g : null;
            if ((dVar != null ? dVar.m10713i() : null) != EnumC9476f.INT || (interfaceC6056zM37648l = C9625i.m37648l(interfaceC6056z)) == null) {
                return false;
            }
            List listMo12680m2 = interfaceC6056zM37648l.mo12664a().mo12680m();
            listMo12680m2.getClass();
            AbstractC2706r0 type2 = ((InterfaceC6039s1) AbstractC5081g0.m20537I0(listMo12680m2)).getType();
            type2.getClass();
            AbstractC2932s abstractC2932sM10566g2 = m10566g(type2);
            InterfaceC6019m interfaceC6019mMo7443b = interfaceC6056zM37648l.mo7443b();
            interfaceC6019mMo7443b.getClass();
            if (AbstractC1061t.m3842c(AbstractC9211e.m35861p(interfaceC6019mMo7443b), C5135p.a.f15583f0.m23002i()) && (abstractC2932sM10566g2 instanceof AbstractC2932s.c) && AbstractC1061t.m3842c(((AbstractC2932s.c) abstractC2932sM10566g2).m10712i(), ASMUtils.TYPE_OBJECT)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final String m10565f(InterfaceC5995e interfaceC5995e) {
        interfaceC5995e.getClass();
        C5691b c5691bM22893n = C5667c.f17796a.m22893n(AbstractC9211e.m35860o(interfaceC5995e).m23002i());
        if (c5691bM22893n == null) {
            return AbstractC2922j.m10658b(interfaceC5995e, null, 2, null);
        }
        String strM36906h = C9474d.m36906h(c5691bM22893n);
        strM36906h.getClass();
        return strM36906h;
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC2932s m10566g(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return (AbstractC2932s) AbstractC2922j.m10661e(abstractC2706r0, C2934u.f7764a, C2921i0.f7713o, C2919h0.f7708a, null, null, 32, null);
    }
}
