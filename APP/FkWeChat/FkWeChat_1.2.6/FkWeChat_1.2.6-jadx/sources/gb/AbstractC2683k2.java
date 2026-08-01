package gb;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p215oc.C5729x;

/* JADX INFO: renamed from: gb.k2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2683k2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final AbstractC2706r0 m9488a(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        if (abstractC2706r0 instanceof InterfaceC2679j2) {
            return ((InterfaceC2679j2) abstractC2706r0).mo9374N();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC2687l2 m9489b(AbstractC2687l2 abstractC2687l2, AbstractC2706r0 abstractC2706r0) {
        abstractC2687l2.getClass();
        abstractC2706r0.getClass();
        return m9491d(abstractC2687l2, m9488a(abstractC2706r0));
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC2687l2 m9490c(AbstractC2687l2 abstractC2687l2, AbstractC2706r0 abstractC2706r0, InterfaceC0184l interfaceC0184l) {
        abstractC2687l2.getClass();
        abstractC2706r0.getClass();
        interfaceC0184l.getClass();
        AbstractC2706r0 abstractC2706r0M9488a = m9488a(abstractC2706r0);
        return m9491d(abstractC2687l2, abstractC2706r0M9488a != null ? (AbstractC2706r0) interfaceC0184l.mo27m(abstractC2706r0M9488a) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final AbstractC2687l2 m9491d(AbstractC2687l2 abstractC2687l2, AbstractC2706r0 abstractC2706r0) {
        abstractC2687l2.getClass();
        if (abstractC2687l2 instanceof InterfaceC2679j2) {
            return m9491d(((InterfaceC2679j2) abstractC2687l2).mo9373J0(), abstractC2706r0);
        }
        if (abstractC2706r0 == null || AbstractC1061t.m3842c(abstractC2706r0, abstractC2687l2)) {
            return abstractC2687l2;
        }
        if (abstractC2687l2 instanceof AbstractC2650c1) {
            return new C2662f1((AbstractC2650c1) abstractC2687l2, abstractC2706r0);
        }
        if (abstractC2687l2 instanceof AbstractC2673i0) {
            return new C2681k0((AbstractC2673i0) abstractC2687l2, abstractC2706r0);
        }
        C5729x.m23182a();
        return null;
    }
}
