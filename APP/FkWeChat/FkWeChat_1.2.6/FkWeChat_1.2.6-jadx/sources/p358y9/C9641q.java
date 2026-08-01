package p358y9;

import gb.AbstractC2706r0;
import gb.C2731z1;
import java.util.List;
import p011aa.C0200e;
import p050da.C1936i;
import p050da.C1938k;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6000f1;
import p229p9.InterfaceC6039s1;
import sa.C7265o;
import sa.InterfaceC7260j;
import sb.AbstractC7294t;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: y9.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9641q implements InterfaceC7260j {

    /* JADX INFO: renamed from: y9.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32835a;

        static {
            int[] iArr = new int[C7265o.i.a.values().length];
            try {
                iArr[C7265o.i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f32835a = iArr;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC2706r0 m37703d(InterfaceC6039s1 interfaceC6039s1) {
        return interfaceC6039s1.getType();
    }

    @Override // sa.InterfaceC7260j
    /* JADX INFO: renamed from: a */
    public InterfaceC7260j.a mo28774a() {
        return InterfaceC7260j.a.SUCCESS_ONLY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sa.InterfaceC7260j
    /* JADX INFO: renamed from: b */
    public InterfaceC7260j.b mo28775b(InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2, InterfaceC5995e interfaceC5995e) {
        interfaceC5983a.getClass();
        interfaceC5983a2.getClass();
        if (interfaceC5983a2 instanceof C0200e) {
            C0200e c0200e = (C0200e) interfaceC5983a2;
            List typeParameters = c0200e.getTypeParameters();
            typeParameters.getClass();
            if (typeParameters.isEmpty()) {
                C7265o.i iVarM28821w = C7265o.m28821w(interfaceC5983a, interfaceC5983a2);
                C2731z1 c2731z1 = null;
                Object[] objArr = 0;
                if ((iVarM28821w != null ? iVarM28821w.m28842c() : null) != null) {
                    return InterfaceC7260j.b.UNKNOWN;
                }
                List listMo12680m = c0200e.mo12680m();
                listMo12680m.getClass();
                InterfaceC7282h interfaceC7282hM28901I = AbstractC7294t.m28901I(AbstractC5081g0.m20555Y(listMo12680m), C9639p.f32833q);
                AbstractC2706r0 abstractC2706r0Mo12675f = c0200e.mo12675f();
                abstractC2706r0Mo12675f.getClass();
                InterfaceC7282h interfaceC7282hM28904L = AbstractC7294t.m28904L(interfaceC7282hM28901I, abstractC2706r0Mo12675f);
                InterfaceC5988b1 interfaceC5988b1Mo12682q0 = c0200e.mo12682q0();
                for (AbstractC2706r0 abstractC2706r0 : AbstractC7294t.m28903K(interfaceC7282hM28904L, AbstractC5114x.m20804s(interfaceC5988b1Mo12682q0 != null ? interfaceC5988b1Mo12682q0.getType() : null))) {
                    if (!abstractC2706r0.mo9330R0().isEmpty() && !(abstractC2706r0.mo9510W0() instanceof C1938k)) {
                        return InterfaceC7260j.b.UNKNOWN;
                    }
                }
                InterfaceC5983a interfaceC5983aBuild = (InterfaceC5983a) interfaceC5983a.mo7503c(new C1936i(c2731z1, 1, objArr == true ? 1 : 0).m9361c());
                if (interfaceC5983aBuild == null) {
                    return InterfaceC7260j.b.UNKNOWN;
                }
                if (interfaceC5983aBuild instanceof InterfaceC6000f1) {
                    InterfaceC6000f1 interfaceC6000f1 = (InterfaceC6000f1) interfaceC5983aBuild;
                    List typeParameters2 = interfaceC6000f1.getTypeParameters();
                    typeParameters2.getClass();
                    if (!typeParameters2.isEmpty()) {
                        interfaceC5983aBuild = interfaceC6000f1.mo12638y().mo12650l(AbstractC5114x.m20800o()).build();
                        interfaceC5983aBuild.getClass();
                    }
                }
                C7265o.i.a aVarM28842c = C7265o.f24143f.m28827F(interfaceC5983aBuild, interfaceC5983a2, false).m28842c();
                aVarM28842c.getClass();
                return a.f32835a[aVarM28842c.ordinal()] == 1 ? InterfaceC7260j.b.OVERRIDABLE : InterfaceC7260j.b.UNKNOWN;
            }
        }
        return InterfaceC7260j.b.UNKNOWN;
    }
}
