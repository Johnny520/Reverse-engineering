package p235q1;

import p120i2.AbstractC3167a;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4547h1;
import p166l2.AbstractC4557k;
import p166l2.AbstractC4565m;
import p349y0.C9508c;

/* JADX INFO: renamed from: q1.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6229w {
    /* JADX INFO: renamed from: a */
    public static final void m24548a(InterfaceC6228v interfaceC6228v) {
        int iM17812a = AbstractC4547h1.m17812a(1024);
        if (!interfaceC6228v.mo17471z().m17461m2()) {
            AbstractC3167a.m11956b("visitChildren called on an unattached node");
        }
        C9508c c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
        InterfaceC4507m.c cVarM17453d2 = interfaceC6228v.mo17471z().m17453d2();
        if (cVarM17453d2 == null) {
            AbstractC4557k.m18001c(c9508c, interfaceC6228v.mo17471z(), false);
        } else {
            c9508c.m37029b(cVarM17453d2);
        }
        while (c9508c.m37039l() != 0) {
            InterfaceC4507m.c cVarM18008j = (InterfaceC4507m.c) c9508c.m37045r(c9508c.m37039l() - 1);
            if ((cVarM18008j.m17452c2() & iM17812a) == 0) {
                AbstractC4557k.m18001c(c9508c, cVarM18008j, false);
            } else {
                while (true) {
                    if (cVarM18008j == null) {
                        break;
                    }
                    if ((cVarM18008j.m17457h2() & iM17812a) != 0) {
                        C9508c c9508c2 = null;
                        while (cVarM18008j != null) {
                            if (cVarM18008j instanceof C6206h0) {
                                AbstractC6208i0.m24406a((C6206h0) cVarM18008j);
                            } else if ((cVarM18008j.m17457h2() & iM17812a) != 0 && (cVarM18008j instanceof AbstractC4565m)) {
                                int i10 = 0;
                                for (InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) cVarM18008j).m18050H2(); cVarM18050H2 != null; cVarM18050H2 = cVarM18050H2.m17453d2()) {
                                    if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarM18008j = cVarM18050H2;
                                        } else {
                                            if (c9508c2 == null) {
                                                c9508c2 = new C9508c(new InterfaceC4507m.c[16], 0);
                                            }
                                            if (cVarM18008j != null) {
                                                c9508c2.m37029b(cVarM18008j);
                                                cVarM18008j = null;
                                            }
                                            c9508c2.m37029b(cVarM18050H2);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarM18008j = AbstractC4557k.m18008j(c9508c2);
                        }
                    } else {
                        cVarM18008j = cVarM18008j.m17453d2();
                    }
                }
            }
        }
    }
}
