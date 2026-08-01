package p142j9;

import gb.AbstractC2706r0;
import java.util.List;
import p098g9.InterfaceC2556j;
import p185m8.AbstractC5081g0;
import p213oa.C5695f;
import p215oc.C5729x;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC6039s1;
import p229p9.InterfaceC6055y0;
import p229p9.InterfaceC6056z;
import p259ra.AbstractC6569n;
import p314vb.C8897d;

/* JADX INFO: renamed from: j9.f3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3679f3 {

    /* JADX INFO: renamed from: a */
    public static final C3679f3 f10193a = new C3679f3();

    /* JADX INFO: renamed from: b */
    public static final AbstractC6569n f10194b = AbstractC6569n.f20552h;

    /* JADX INFO: renamed from: j9.f3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10195a;

        static {
            int[] iArr = new int[InterfaceC2556j.a.values().length];
            try {
                iArr[InterfaceC2556j.a.f6814s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC2556j.a.f6812q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC2556j.a.f6815t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10195a = iArr;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final CharSequence m13706g(InterfaceC6039s1 interfaceC6039s1) {
        C3679f3 c3679f3 = f10193a;
        AbstractC2706r0 type = interfaceC6039s1.getType();
        type.getClass();
        return c3679f3.m13715l(type);
    }

    /* JADX INFO: renamed from: i */
    public static final CharSequence m13707i(InterfaceC6039s1 interfaceC6039s1) {
        C3679f3 c3679f3 = f10193a;
        AbstractC2706r0 type = interfaceC6039s1.getType();
        type.getClass();
        return c3679f3.m13715l(type);
    }

    /* JADX INFO: renamed from: c */
    public final void m13708c(StringBuilder sb2, InterfaceC5988b1 interfaceC5988b1) {
        if (interfaceC5988b1 != null) {
            AbstractC2706r0 type = interfaceC5988b1.getType();
            type.getClass();
            sb2.append(m13715l(type));
            sb2.append(".");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m13709d(StringBuilder sb2, InterfaceC5983a interfaceC5983a) {
        InterfaceC5988b1 interfaceC5988b1M13813j = AbstractC3714m3.m13813j(interfaceC5983a);
        InterfaceC5988b1 interfaceC5988b1Mo12682q0 = interfaceC5983a.mo12682q0();
        m13708c(sb2, interfaceC5988b1M13813j);
        boolean z10 = (interfaceC5988b1M13813j == null || interfaceC5988b1Mo12682q0 == null) ? false : true;
        if (z10) {
            sb2.append("(");
        }
        m13708c(sb2, interfaceC5988b1Mo12682q0);
        if (z10) {
            sb2.append(")");
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m13710e(InterfaceC5983a interfaceC5983a) {
        if (interfaceC5983a instanceof InterfaceC6055y0) {
            return m13714k((InterfaceC6055y0) interfaceC5983a);
        }
        if (interfaceC5983a instanceof InterfaceC6056z) {
            return m13711f((InterfaceC6056z) interfaceC5983a);
        }
        C8897d.m34134a("Illegal callable: ", interfaceC5983a);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final String m13711f(InterfaceC6056z interfaceC6056z) {
        interfaceC6056z.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        C3679f3 c3679f3 = f10193a;
        c3679f3.m13709d(sb2, interfaceC6056z);
        AbstractC6569n abstractC6569n = f10194b;
        C5695f name = interfaceC6056z.getName();
        name.getClass();
        sb2.append(abstractC6569n.mo25910R(name, true));
        List listMo12680m = interfaceC6056z.mo12680m();
        listMo12680m.getClass();
        AbstractC5081g0.m20583q0(listMo12680m, sb2, ", ", "(", ")", 0, null, C3669d3.f10170q, 48, null);
        sb2.append(": ");
        AbstractC2706r0 abstractC2706r0Mo12675f = interfaceC6056z.mo12675f();
        abstractC2706r0Mo12675f.getClass();
        sb2.append(c3679f3.m13715l(abstractC2706r0Mo12675f));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: h */
    public final String m13712h(InterfaceC6056z interfaceC6056z) {
        interfaceC6056z.getClass();
        StringBuilder sb2 = new StringBuilder();
        C3679f3 c3679f3 = f10193a;
        c3679f3.m13709d(sb2, interfaceC6056z);
        List listMo12680m = interfaceC6056z.mo12680m();
        listMo12680m.getClass();
        AbstractC5081g0.m20583q0(listMo12680m, sb2, ", ", "(", ")", 0, null, C3674e3.f10186q, 48, null);
        sb2.append(" -> ");
        AbstractC2706r0 abstractC2706r0Mo12675f = interfaceC6056z.mo12675f();
        abstractC2706r0Mo12675f.getClass();
        sb2.append(c3679f3.m13715l(abstractC2706r0Mo12675f));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: j */
    public final String m13713j(C3766z1 c3766z1) {
        c3766z1.getClass();
        StringBuilder sb2 = new StringBuilder();
        int i10 = a.f10195a[c3766z1.mo9077j().ordinal()];
        if (i10 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i10 == 2) {
            sb2.append("instance parameter");
        } else {
            if (i10 != 3) {
                C5729x.m23182a();
                return null;
            }
            sb2.append("parameter #" + c3766z1.getIndex() + ' ' + c3766z1.getName());
        }
        sb2.append(" of ");
        sb2.append(f10193a.m13710e(c3766z1.m13976g().mo13792Z()));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: k */
    public final String m13714k(InterfaceC6055y0 interfaceC6055y0) {
        interfaceC6055y0.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(interfaceC6055y0.mo12681n0() ? "var " : "val ");
        C3679f3 c3679f3 = f10193a;
        c3679f3.m13709d(sb2, interfaceC6055y0);
        AbstractC6569n abstractC6569n = f10194b;
        C5695f name = interfaceC6055y0.getName();
        name.getClass();
        sb2.append(abstractC6569n.mo25910R(name, true));
        sb2.append(": ");
        AbstractC2706r0 type = interfaceC6055y0.getType();
        type.getClass();
        sb2.append(c3679f3.m13715l(type));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: l */
    public final String m13715l(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return f10194b.mo25911S(abstractC2706r0);
    }
}
