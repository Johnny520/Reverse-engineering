package p095T;

import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: T.r0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1384r0 {

    /* JADX INFO: renamed from: a */
    public final C1340U f4910a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1384r0(InterfaceC1599a interfaceC1599a) {
        this.f4910a = new C1340U(interfaceC1599a);
    }

    /* JADX INFO: renamed from: a */
    public abstract C1386s0 mo2399a(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public InterfaceC1345W0 mo2400b() {
        return this.f4910a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final InterfaceC1345W0 m2608c(C1386s0 c1386s0, InterfaceC1345W0 interfaceC1345W0) {
        InterfaceC1345W0 interfaceC1345W02 = null;
        interfaceC1345W02 = null;
        interfaceC1345W02 = null;
        interfaceC1345W02 = null;
        interfaceC1345W02 = null;
        interfaceC1345W02 = null;
        if (interfaceC1345W0 instanceof C1319J) {
            if (c1386s0.f4917d) {
                C1319J c1319j = (C1319J) interfaceC1345W0;
                c1319j.f4716a.setValue(c1386s0.m2637a());
                interfaceC1345W02 = c1319j;
            }
        } else if (interfaceC1345W0 instanceof C1343V0) {
            if ((c1386s0.f4915b || c1386s0.f4918e != null) && !c1386s0.f4917d) {
                C1343V0 c1343v0 = (C1343V0) interfaceC1345W0;
                if (AbstractC1665j.m2981a(c1386s0.m2637a(), c1343v0.f4782a)) {
                    interfaceC1345W02 = c1343v0;
                }
            }
        } else if (interfaceC1345W0 instanceof C1307D) {
            c1386s0.getClass();
        }
        if (interfaceC1345W02 != null) {
            return interfaceC1345W02;
        }
        if (!c1386s0.f4917d) {
            return new C1343V0(c1386s0.m2637a());
        }
        Object obj = c1386s0.f4918e;
        InterfaceC1334Q0 interfaceC1334Q0 = c1386s0.f4916c;
        if (interfaceC1334Q0 == null) {
            interfaceC1334Q0 = C1357e.f4798j;
        }
        return new C1319J(new C1366i0(obj, interfaceC1334Q0));
    }
}
