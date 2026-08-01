package p236q2;

import p010a9.InterfaceC0173a;
import p024b9.AbstractC1067w;
import p120i2.AbstractC3167a;
import p121i3.AbstractC3190t;
import p135j2.InterfaceC3578w;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4547h1;
import p166l2.AbstractC4557k;
import p166l2.AbstractC4565m;
import p166l2.C4531d1;
import p166l2.C4554j0;
import p166l2.InterfaceC4553j;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p250r1.AbstractC6462l;
import p250r1.C6457g;
import p257r8.AbstractC6533b;
import p349y0.C9508c;

/* JADX INFO: renamed from: q2.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6234b {

    /* JADX INFO: renamed from: q2.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC0173a f19352r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC3578w f19353s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0173a interfaceC0173a, InterfaceC3578w interfaceC3578w) {
            super(0);
            this.f19352r = interfaceC0173a;
            this.f19353s = interfaceC3578w;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6457g invoke() {
            C6457g c6457g;
            InterfaceC0173a interfaceC0173a = this.f19352r;
            if (interfaceC0173a != null && (c6457g = (C6457g) interfaceC0173a.invoke()) != null) {
                return c6457g;
            }
            InterfaceC3578w interfaceC3578w = this.f19353s;
            if (!interfaceC3578w.mo13245d()) {
                interfaceC3578w = null;
            }
            if (interfaceC3578w != null) {
                return AbstractC6462l.m25629b(AbstractC3190t.m12092d(interfaceC3578w.mo13242a()));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m24563a(InterfaceC4553j interfaceC4553j, InterfaceC0173a interfaceC0173a, InterfaceC5976f interfaceC5976f) {
        Object obj;
        C4531d1 c4531d1M17965v0;
        if (!interfaceC4553j.mo17471z().m17461m2()) {
            return C4700i0.f13910a;
        }
        int iM17812a = AbstractC4547h1.m17812a(524288);
        if (!interfaceC4553j.mo17471z().m17461m2()) {
            AbstractC3167a.m11956b("visitAncestors called on an unattached node");
        }
        InterfaceC4507m.c cVarM17459j2 = interfaceC4553j.mo17471z().m17459j2();
        C4554j0 c4554j0M18015q = AbstractC4557k.m18015q(interfaceC4553j);
        loop0: while (true) {
            obj = null;
            if (c4554j0M18015q == null) {
                break;
            }
            if ((c4554j0M18015q.m17965v0().m17597k().m17452c2() & iM17812a) != 0) {
                while (cVarM17459j2 != null) {
                    if ((cVarM17459j2.m17457h2() & iM17812a) != 0) {
                        InterfaceC4507m.c cVarM18008j = cVarM17459j2;
                        C9508c c9508c = null;
                        while (cVarM18008j != null) {
                            if (cVarM18008j instanceof InterfaceC6233a) {
                                obj = cVarM18008j;
                                break loop0;
                            }
                            if ((cVarM18008j.m17457h2() & iM17812a) != 0 && (cVarM18008j instanceof AbstractC4565m)) {
                                int i10 = 0;
                                for (InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) cVarM18008j).m18050H2(); cVarM18050H2 != null; cVarM18050H2 = cVarM18050H2.m17453d2()) {
                                    if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarM18008j = cVarM18050H2;
                                        } else {
                                            if (c9508c == null) {
                                                c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
                                            }
                                            if (cVarM18008j != null) {
                                                AbstractC6533b.m25845a(c9508c.m37029b(cVarM18008j));
                                                cVarM18008j = null;
                                            }
                                            AbstractC6533b.m25845a(c9508c.m37029b(cVarM18050H2));
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarM18008j = AbstractC4557k.m18008j(c9508c);
                        }
                    }
                    cVarM17459j2 = cVarM17459j2.m17459j2();
                }
            }
            c4554j0M18015q = c4554j0M18015q.m17848B0();
            cVarM17459j2 = (c4554j0M18015q == null || (c4531d1M17965v0 = c4554j0M18015q.m17965v0()) == null) ? null : c4531d1M17965v0.m17601o();
        }
        InterfaceC6233a interfaceC6233a = (InterfaceC6233a) obj;
        if (interfaceC6233a == null) {
            return C4700i0.f13910a;
        }
        InterfaceC3578w interfaceC3578wM18013o = AbstractC4557k.m18013o(interfaceC4553j);
        Object objMo19631h0 = interfaceC6233a.mo19631h0(interfaceC3578wM18013o, new a(interfaceC0173a, interfaceC3578wM18013o), interfaceC5976f);
        return objMo19631h0 == AbstractC6325c.m24992g() ? objMo19631h0 : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m24564b(InterfaceC4553j interfaceC4553j, InterfaceC0173a interfaceC0173a, InterfaceC5976f interfaceC5976f, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0173a = null;
        }
        return m24563a(interfaceC4553j, interfaceC0173a, interfaceC5976f);
    }
}
