package p166l2;

import p055e.AbstractC1960a;
import p120i2.AbstractC3167a;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p135j2.AbstractC3519f;
import p135j2.InterfaceC3515e;
import p135j2.InterfaceC3578w;
import p151k2.InterfaceC3941h;
import p165l1.InterfaceC4507m;
import p215oc.C5706c;
import p265s1.InterfaceC7064d2;
import p277t2.InterfaceC8089r;
import p349y0.C9508c;

/* JADX INFO: renamed from: l2.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4557k {
    /* JADX INFO: renamed from: c */
    public static final void m18001c(C9508c c9508c, InterfaceC4507m.c cVar, boolean z10) {
        C9508c c9508cM18005g = m18005g(m18015q(cVar), z10);
        int iM37039l = c9508cM18005g.m37039l() - 1;
        Object[] objArr = c9508cM18005g.f32299q;
        if (iM37039l < objArr.length) {
            while (iM37039l >= 0) {
                c9508c.m37029b(((C4554j0) objArr[iM37039l]).m17965v0().m17597k());
                iM37039l--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC4534e0 m18002d(InterfaceC4507m.c cVar) {
        if ((AbstractC4547h1.m17812a(2) & cVar.m17457h2()) != 0) {
            if (cVar instanceof InterfaceC4534e0) {
                return (InterfaceC4534e0) cVar;
            }
            if (cVar instanceof AbstractC4565m) {
                InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) cVar).m18050H2();
                while (cVarM18050H2 != 0) {
                    if (cVarM18050H2 instanceof InterfaceC4534e0) {
                        return (InterfaceC4534e0) cVarM18050H2;
                    }
                    cVarM18050H2 = (!(cVarM18050H2 instanceof AbstractC4565m) || (AbstractC4547h1.m17812a(2) & cVarM18050H2.m17457h2()) == 0) ? cVarM18050H2.m17453d2() : ((AbstractC4565m) cVarM18050H2).m18050H2();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final void m18003e(InterfaceC4553j interfaceC4553j, long j10) {
        m18016r(interfaceC4553j).mo18186x(j10);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC3515e m18004f(InterfaceC4553j interfaceC4553j) {
        C4531d1 c4531d1M17965v0;
        Object obj;
        int iM17812a = AbstractC4547h1.m17812a(8388608) | AbstractC4547h1.m17812a(32);
        if (!interfaceC4553j.mo17471z().m17461m2()) {
            AbstractC3167a.m11956b("visitAncestors called on an unattached node");
        }
        InterfaceC4507m.c cVarM17459j2 = interfaceC4553j.mo17471z().m17459j2();
        C4554j0 c4554j0M18015q = m18015q(interfaceC4553j);
        while (c4554j0M18015q != null) {
            if ((c4554j0M18015q.m17965v0().m17597k().m17452c2() & iM17812a) != 0) {
                while (cVarM17459j2 != null) {
                    if ((cVarM17459j2.m17457h2() & iM17812a) != 0) {
                        if ((AbstractC4547h1.m17812a(8388608) & cVarM17459j2.m17457h2()) != 0) {
                            if (cVarM17459j2 instanceof AbstractC4565m) {
                                for (InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) cVarM17459j2).m18050H2(); cVarM18050H2 != null; cVarM18050H2 = cVarM18050H2.m17453d2()) {
                                }
                            }
                            AbstractC1960a.m7104a(null);
                            return null;
                        }
                        if ((AbstractC4547h1.m17812a(32) & cVarM17459j2.m17457h2()) == 0) {
                            continue;
                        } else {
                            if (cVarM17459j2 instanceof InterfaceC3941h) {
                                obj = cVarM17459j2;
                            } else if (cVarM17459j2 instanceof AbstractC4565m) {
                                obj = null;
                                for (InterfaceC4507m.c cVarM18050H22 = ((AbstractC4565m) cVarM17459j2).m18050H2(); cVarM18050H22 != null; cVarM18050H22 = cVarM18050H22.m17453d2()) {
                                    if (cVarM18050H22 instanceof InterfaceC3941h) {
                                        obj = cVarM18050H22;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            InterfaceC3941h interfaceC3941h = (InterfaceC3941h) obj;
                            if (interfaceC3941h != null && interfaceC3941h.mo1287Y0().mo15632a(AbstractC3519f.m13111a())) {
                                return (InterfaceC3515e) interfaceC3941h.mo1287Y0().mo15633b(AbstractC3519f.m13111a());
                            }
                        }
                    }
                    cVarM17459j2 = cVarM17459j2.m17459j2();
                }
            }
            c4554j0M18015q = c4554j0M18015q.m17848B0();
            cVarM17459j2 = (c4554j0M18015q == null || (c4531d1M17965v0 = c4554j0M18015q.m17965v0()) == null) ? null : c4531d1M17965v0.m17601o();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final C9508c m18005g(C4554j0 c4554j0, boolean z10) {
        return z10 ? c4554j0.m17863I0() : c4554j0.m17866J0();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m18006h(InterfaceC4553j interfaceC4553j, int i10) {
        return (interfaceC4553j.mo17471z().m17452c2() & i10) != 0;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m18007i(InterfaceC4553j interfaceC4553j) {
        return interfaceC4553j.mo17471z() == interfaceC4553j;
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC4507m.c m18008j(C9508c c9508c) {
        if (c9508c == null || c9508c.m37039l() == 0) {
            return null;
        }
        return (InterfaceC4507m.c) c9508c.m37045r(c9508c.m37039l() - 1);
    }

    /* JADX INFO: renamed from: k */
    public static final void m18009k(InterfaceC4553j interfaceC4553j) {
        m18015q(interfaceC4553j).m17849B1();
    }

    /* JADX INFO: renamed from: l */
    public static final AbstractC4539f1 m18010l(InterfaceC4553j interfaceC4553j, int i10) {
        AbstractC4539f1 abstractC4539f1M17454e2 = interfaceC4553j.mo17471z().m17454e2();
        abstractC4539f1M17454e2.getClass();
        if (abstractC4539f1M17454e2.mo17646U2() != interfaceC4553j || !AbstractC4551i1.m17825i(i10)) {
            return abstractC4539f1M17454e2;
        }
        AbstractC4539f1 abstractC4539f1M17715W2 = abstractC4539f1M17454e2.m17715W2();
        abstractC4539f1M17715W2.getClass();
        return abstractC4539f1M17715W2;
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC3175e m18011m(InterfaceC4553j interfaceC4553j) {
        return m18015q(interfaceC4553j).m17886R();
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC7064d2 m18012n(InterfaceC4553j interfaceC4553j) {
        return m18016r(interfaceC4553j).getGraphicsContext();
    }

    /* JADX INFO: renamed from: o */
    public static final InterfaceC3578w m18013o(InterfaceC4553j interfaceC4553j) {
        if (!interfaceC4553j.mo17471z().m17461m2()) {
            AbstractC3167a.m11956b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        InterfaceC3578w interfaceC3578wMo17733n = m18010l(interfaceC4553j, AbstractC4547h1.m17812a(2)).mo17733n();
        if (!interfaceC3578wMo17733n.mo13245d()) {
            AbstractC3167a.m11956b("LayoutCoordinates is not attached.");
        }
        return interfaceC3578wMo17733n;
    }

    /* JADX INFO: renamed from: p */
    public static final EnumC3191u m18014p(InterfaceC4553j interfaceC4553j) {
        return m18015q(interfaceC4553j).getLayoutDirection();
    }

    /* JADX INFO: renamed from: q */
    public static final C4554j0 m18015q(InterfaceC4553j interfaceC4553j) {
        AbstractC4539f1 abstractC4539f1M17454e2 = interfaceC4553j.mo17471z().m17454e2();
        if (abstractC4539f1M17454e2 != null) {
            return abstractC4539f1M17454e2.mo17689I1();
        }
        AbstractC3167a.m11957c("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static final InterfaceC4580q1 m18016r(InterfaceC4553j interfaceC4553j) {
        InterfaceC4580q1 interfaceC4580q1M17845A0 = m18015q(interfaceC4553j).m17845A0();
        if (interfaceC4580q1M17845A0 != null) {
            return interfaceC4580q1M17845A0;
        }
        AbstractC3167a.m11957c("This node does not have an owner.");
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static final InterfaceC8089r m18017s(InterfaceC4553j interfaceC4553j) {
        return m18015q(interfaceC4553j);
    }
}
