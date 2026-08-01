package p166l2;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p120i2.AbstractC3167a;
import p165l1.AbstractC4498d;
import p165l1.InterfaceC4507m;
import p349y0.C9508c;

/* JADX INFO: renamed from: l2.k2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4560k2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC4556j2 m18019a(InterfaceC4553j interfaceC4553j, Object obj) {
        C4531d1 c4531d1M17965v0;
        int iM17812a = AbstractC4547h1.m17812a(262144);
        if (!interfaceC4553j.mo17471z().m17461m2()) {
            AbstractC3167a.m11956b("visitAncestors called on an unattached node");
        }
        InterfaceC4507m.c cVarM17459j2 = interfaceC4553j.mo17471z().m17459j2();
        C4554j0 c4554j0M18015q = AbstractC4557k.m18015q(interfaceC4553j);
        while (c4554j0M18015q != null) {
            if ((c4554j0M18015q.m17965v0().m17597k().m17452c2() & iM17812a) != 0) {
                while (cVarM17459j2 != null) {
                    if ((cVarM17459j2.m17457h2() & iM17812a) != 0) {
                        ?? M18008j = cVarM17459j2;
                        ?? c9508c = 0;
                        while (M18008j != 0) {
                            if (M18008j instanceof InterfaceC4556j2) {
                                InterfaceC4556j2 interfaceC4556j2 = (InterfaceC4556j2) M18008j;
                                if (AbstractC1061t.m3842c(obj, interfaceC4556j2.mo1308T())) {
                                    return interfaceC4556j2;
                                }
                            } else if ((M18008j.m17457h2() & iM17812a) != 0 && (M18008j instanceof AbstractC4565m)) {
                                InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) M18008j).m18050H2();
                                int i10 = 0;
                                M18008j = M18008j;
                                c9508c = c9508c;
                                while (cVarM18050H2 != null) {
                                    if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                                        i10++;
                                        c9508c = c9508c;
                                        if (i10 == 1) {
                                            M18008j = cVarM18050H2;
                                        } else {
                                            if (c9508c == 0) {
                                                c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
                                            }
                                            if (M18008j != 0) {
                                                c9508c.m37029b(M18008j);
                                                M18008j = 0;
                                            }
                                            c9508c.m37029b(cVarM18050H2);
                                        }
                                    }
                                    cVarM18050H2 = cVarM18050H2.m17453d2();
                                    M18008j = M18008j;
                                    c9508c = c9508c;
                                }
                                if (i10 == 1) {
                                }
                            }
                            M18008j = AbstractC4557k.m18008j(c9508c);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: b */
    public static final InterfaceC4556j2 m18020b(InterfaceC4556j2 interfaceC4556j2) {
        C4531d1 c4531d1M17965v0;
        int iM17812a = AbstractC4547h1.m17812a(262144);
        if (!interfaceC4556j2.mo17471z().m17461m2()) {
            AbstractC3167a.m11956b("visitAncestors called on an unattached node");
        }
        InterfaceC4507m.c cVarM17459j2 = interfaceC4556j2.mo17471z().m17459j2();
        C4554j0 c4554j0M18015q = AbstractC4557k.m18015q(interfaceC4556j2);
        while (c4554j0M18015q != null) {
            if ((c4554j0M18015q.m17965v0().m17597k().m17452c2() & iM17812a) != 0) {
                while (cVarM17459j2 != null) {
                    if ((cVarM17459j2.m17457h2() & iM17812a) != 0) {
                        ?? M18008j = cVarM17459j2;
                        ?? c9508c = 0;
                        while (M18008j != 0) {
                            if (M18008j instanceof InterfaceC4556j2) {
                                InterfaceC4556j2 interfaceC4556j22 = (InterfaceC4556j2) M18008j;
                                if (AbstractC1061t.m3842c(interfaceC4556j2.mo1308T(), interfaceC4556j22.mo1308T()) && AbstractC4498d.m17409a(interfaceC4556j2, interfaceC4556j22)) {
                                    return interfaceC4556j22;
                                }
                            } else if ((M18008j.m17457h2() & iM17812a) != 0 && (M18008j instanceof AbstractC4565m)) {
                                InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) M18008j).m18050H2();
                                int i10 = 0;
                                M18008j = M18008j;
                                c9508c = c9508c;
                                while (cVarM18050H2 != null) {
                                    if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                                        i10++;
                                        c9508c = c9508c;
                                        if (i10 == 1) {
                                            M18008j = cVarM18050H2;
                                        } else {
                                            if (c9508c == 0) {
                                                c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
                                            }
                                            if (M18008j != 0) {
                                                c9508c.m37029b(M18008j);
                                                M18008j = 0;
                                            }
                                            c9508c.m37029b(cVarM18050H2);
                                        }
                                    }
                                    cVarM18050H2 = cVarM18050H2.m17453d2();
                                    M18008j = M18008j;
                                    c9508c = c9508c;
                                }
                                if (i10 == 1) {
                                }
                            }
                            M18008j = AbstractC4557k.m18008j(c9508c);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [a9.l] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX INFO: renamed from: c */
    public static final void m18021c(InterfaceC4553j interfaceC4553j, Object obj, InterfaceC0184l interfaceC0184l) {
        C4531d1 c4531d1M17965v0;
        int iM17812a = AbstractC4547h1.m17812a(262144);
        if (!interfaceC4553j.mo17471z().m17461m2()) {
            AbstractC3167a.m11956b("visitAncestors called on an unattached node");
        }
        InterfaceC4507m.c cVarM17459j2 = interfaceC4553j.mo17471z().m17459j2();
        C4554j0 c4554j0M18015q = AbstractC4557k.m18015q(interfaceC4553j);
        while (c4554j0M18015q != null) {
            if ((c4554j0M18015q.m17965v0().m17597k().m17452c2() & iM17812a) != 0) {
                while (cVarM17459j2 != null) {
                    if ((cVarM17459j2.m17457h2() & iM17812a) != 0) {
                        ?? M18008j = cVarM17459j2;
                        ?? c9508c = 0;
                        while (M18008j != 0) {
                            if (M18008j instanceof InterfaceC4556j2) {
                                InterfaceC4556j2 interfaceC4556j2 = (InterfaceC4556j2) M18008j;
                                if (!(AbstractC1061t.m3842c(obj, interfaceC4556j2.mo1308T()) ? ((Boolean) interfaceC0184l.mo27m(interfaceC4556j2)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((M18008j.m17457h2() & iM17812a) != 0) && (M18008j instanceof AbstractC4565m)) {
                                    InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) M18008j).m18050H2();
                                    int i10 = 0;
                                    M18008j = M18008j;
                                    c9508c = c9508c;
                                    while (cVarM18050H2 != null) {
                                        if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                                            i10++;
                                            c9508c = c9508c;
                                            if (i10 == 1) {
                                                M18008j = cVarM18050H2;
                                            } else {
                                                if (c9508c == 0) {
                                                    c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
                                                }
                                                if (M18008j != 0) {
                                                    c9508c.m37029b(M18008j);
                                                    M18008j = 0;
                                                }
                                                c9508c.m37029b(cVarM18050H2);
                                            }
                                        }
                                        cVarM18050H2 = cVarM18050H2.m17453d2();
                                        M18008j = M18008j;
                                        c9508c = c9508c;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            M18008j = AbstractC4557k.m18008j(c9508c);
                        }
                    }
                    cVarM17459j2 = cVarM17459j2.m17459j2();
                }
            }
            c4554j0M18015q = c4554j0M18015q.m17848B0();
            cVarM17459j2 = (c4554j0M18015q == null || (c4531d1M17965v0 = c4554j0M18015q.m17965v0()) == null) ? null : c4531d1M17965v0.m17601o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [a9.l] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: d */
    public static final void m18022d(InterfaceC4556j2 interfaceC4556j2, InterfaceC0184l interfaceC0184l) {
        C4531d1 c4531d1M17965v0;
        int iM17812a = AbstractC4547h1.m17812a(262144);
        if (!interfaceC4556j2.mo17471z().m17461m2()) {
            AbstractC3167a.m11956b("visitAncestors called on an unattached node");
        }
        InterfaceC4507m.c cVarM17459j2 = interfaceC4556j2.mo17471z().m17459j2();
        C4554j0 c4554j0M18015q = AbstractC4557k.m18015q(interfaceC4556j2);
        while (c4554j0M18015q != null) {
            if ((c4554j0M18015q.m17965v0().m17597k().m17452c2() & iM17812a) != 0) {
                while (cVarM17459j2 != null) {
                    if ((cVarM17459j2.m17457h2() & iM17812a) != 0) {
                        ?? M18008j = cVarM17459j2;
                        ?? c9508c = 0;
                        while (M18008j != 0) {
                            boolean zBooleanValue = true;
                            if (M18008j instanceof InterfaceC4556j2) {
                                InterfaceC4556j2 interfaceC4556j22 = (InterfaceC4556j2) M18008j;
                                if (AbstractC1061t.m3842c(interfaceC4556j2.mo1308T(), interfaceC4556j22.mo1308T()) && AbstractC4498d.m17409a(interfaceC4556j2, interfaceC4556j22)) {
                                    zBooleanValue = ((Boolean) interfaceC0184l.mo27m(interfaceC4556j22)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((M18008j.m17457h2() & iM17812a) != 0) && (M18008j instanceof AbstractC4565m)) {
                                    InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) M18008j).m18050H2();
                                    int i10 = 0;
                                    M18008j = M18008j;
                                    c9508c = c9508c;
                                    while (cVarM18050H2 != null) {
                                        if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                                            i10++;
                                            c9508c = c9508c;
                                            if (i10 == 1) {
                                                M18008j = cVarM18050H2;
                                            } else {
                                                if (c9508c == 0) {
                                                    c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
                                                }
                                                if (M18008j != 0) {
                                                    c9508c.m37029b(M18008j);
                                                    M18008j = 0;
                                                }
                                                c9508c.m37029b(cVarM18050H2);
                                            }
                                        }
                                        cVarM18050H2 = cVarM18050H2.m17453d2();
                                        M18008j = M18008j;
                                        c9508c = c9508c;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            M18008j = AbstractC4557k.m18008j(c9508c);
                        }
                    }
                    cVarM17459j2 = cVarM17459j2.m17459j2();
                }
            }
            c4554j0M18015q = c4554j0M18015q.m17848B0();
            cVarM17459j2 = (c4554j0M18015q == null || (c4531d1M17965v0 = c4554j0M18015q.m17965v0()) == null) ? null : c4531d1M17965v0.m17601o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [a9.l] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX INFO: renamed from: e */
    public static final void m18023e(InterfaceC4553j interfaceC4553j, Object obj, InterfaceC0184l interfaceC0184l) {
        int iM17812a = AbstractC4547h1.m17812a(262144);
        if (!interfaceC4553j.mo17471z().m17461m2()) {
            AbstractC3167a.m11956b("visitSubtreeIf called on an unattached node");
        }
        C9508c c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
        InterfaceC4507m.c cVarM17453d2 = interfaceC4553j.mo17471z().m17453d2();
        if (cVarM17453d2 == null) {
            AbstractC4557k.m18001c(c9508c, interfaceC4553j.mo17471z(), false);
        } else {
            c9508c.m37029b(cVarM17453d2);
        }
        while (c9508c.m37039l() != 0) {
            InterfaceC4507m.c cVar = (InterfaceC4507m.c) c9508c.m37045r(c9508c.m37039l() - 1);
            if ((cVar.m17452c2() & iM17812a) != 0) {
                for (InterfaceC4507m.c cVarM17453d22 = cVar; cVarM17453d22 != null && cVarM17453d22.m17461m2(); cVarM17453d22 = cVarM17453d22.m17453d2()) {
                    if ((cVarM17453d22.m17457h2() & iM17812a) != 0) {
                        ?? M18008j = cVarM17453d22;
                        ?? c9508c2 = 0;
                        while (M18008j != 0) {
                            if (M18008j instanceof InterfaceC4556j2) {
                                InterfaceC4556j2 interfaceC4556j2 = (InterfaceC4556j2) M18008j;
                                EnumC4552i2 enumC4552i2 = AbstractC1061t.m3842c(obj, interfaceC4556j2.mo1308T()) ? (EnumC4552i2) interfaceC0184l.mo27m(interfaceC4556j2) : EnumC4552i2.f13329q;
                                if (enumC4552i2 == EnumC4552i2.f13331s) {
                                    return;
                                }
                                if (enumC4552i2 == EnumC4552i2.f13330r) {
                                    break;
                                }
                            } else if ((M18008j.m17457h2() & iM17812a) != 0 && (M18008j instanceof AbstractC4565m)) {
                                InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) M18008j).m18050H2();
                                int i10 = 0;
                                M18008j = M18008j;
                                c9508c2 = c9508c2;
                                while (cVarM18050H2 != null) {
                                    if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                                        i10++;
                                        c9508c2 = c9508c2;
                                        if (i10 == 1) {
                                            M18008j = cVarM18050H2;
                                        } else {
                                            if (c9508c2 == 0) {
                                                c9508c2 = new C9508c(new InterfaceC4507m.c[16], 0);
                                            }
                                            if (M18008j != 0) {
                                                c9508c2.m37029b(M18008j);
                                                M18008j = 0;
                                            }
                                            c9508c2.m37029b(cVarM18050H2);
                                        }
                                    }
                                    cVarM18050H2 = cVarM18050H2.m17453d2();
                                    M18008j = M18008j;
                                    c9508c2 = c9508c2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            M18008j = AbstractC4557k.m18008j(c9508c2);
                        }
                    }
                }
            }
            AbstractC4557k.m18001c(c9508c, cVar, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [a9.l] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: f */
    public static final void m18024f(InterfaceC4556j2 interfaceC4556j2, InterfaceC0184l interfaceC0184l) {
        int iM17812a = AbstractC4547h1.m17812a(262144);
        if (!interfaceC4556j2.mo17471z().m17461m2()) {
            AbstractC3167a.m11956b("visitSubtreeIf called on an unattached node");
        }
        C9508c c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
        InterfaceC4507m.c cVarM17453d2 = interfaceC4556j2.mo17471z().m17453d2();
        if (cVarM17453d2 == null) {
            AbstractC4557k.m18001c(c9508c, interfaceC4556j2.mo17471z(), false);
        } else {
            c9508c.m37029b(cVarM17453d2);
        }
        while (c9508c.m37039l() != 0) {
            InterfaceC4507m.c cVar = (InterfaceC4507m.c) c9508c.m37045r(c9508c.m37039l() - 1);
            if ((cVar.m17452c2() & iM17812a) != 0) {
                for (InterfaceC4507m.c cVarM17453d22 = cVar; cVarM17453d22 != null && cVarM17453d22.m17461m2(); cVarM17453d22 = cVarM17453d22.m17453d2()) {
                    if ((cVarM17453d22.m17457h2() & iM17812a) != 0) {
                        ?? M18008j = cVarM17453d22;
                        ?? c9508c2 = 0;
                        while (M18008j != 0) {
                            if (M18008j instanceof InterfaceC4556j2) {
                                InterfaceC4556j2 interfaceC4556j22 = (InterfaceC4556j2) M18008j;
                                EnumC4552i2 enumC4552i2 = (AbstractC1061t.m3842c(interfaceC4556j2.mo1308T(), interfaceC4556j22.mo1308T()) && AbstractC4498d.m17409a(interfaceC4556j2, interfaceC4556j22)) ? (EnumC4552i2) interfaceC0184l.mo27m(interfaceC4556j22) : EnumC4552i2.f13329q;
                                if (enumC4552i2 == EnumC4552i2.f13331s) {
                                    return;
                                }
                                if (enumC4552i2 == EnumC4552i2.f13330r) {
                                    break;
                                }
                            } else if ((M18008j.m17457h2() & iM17812a) != 0 && (M18008j instanceof AbstractC4565m)) {
                                InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) M18008j).m18050H2();
                                int i10 = 0;
                                M18008j = M18008j;
                                c9508c2 = c9508c2;
                                while (cVarM18050H2 != null) {
                                    if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                                        i10++;
                                        c9508c2 = c9508c2;
                                        if (i10 == 1) {
                                            M18008j = cVarM18050H2;
                                        } else {
                                            if (c9508c2 == 0) {
                                                c9508c2 = new C9508c(new InterfaceC4507m.c[16], 0);
                                            }
                                            if (M18008j != 0) {
                                                c9508c2.m37029b(M18008j);
                                                M18008j = 0;
                                            }
                                            c9508c2.m37029b(cVarM18050H2);
                                        }
                                    }
                                    cVarM18050H2 = cVarM18050H2.m17453d2();
                                    M18008j = M18008j;
                                    c9508c2 = c9508c2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            M18008j = AbstractC4557k.m18008j(c9508c2);
                        }
                    }
                }
            }
            AbstractC4557k.m18001c(c9508c, cVar, false);
        }
    }
}
