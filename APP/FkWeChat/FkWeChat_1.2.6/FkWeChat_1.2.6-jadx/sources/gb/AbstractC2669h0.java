package gb;

import java.util.HashSet;
import p160kb.InterfaceC4229i;
import p160kb.InterfaceC4231k;
import p160kb.InterfaceC4236p;
import p160kb.InterfaceC4237q;

/* JADX INFO: renamed from: gb.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2669h0 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC4229i m9448a(InterfaceC2667g2 interfaceC2667g2, InterfaceC4229i interfaceC4229i) {
        interfaceC2667g2.getClass();
        interfaceC4229i.getClass();
        return m9449b(interfaceC2667g2, interfaceC4229i, new HashSet());
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4229i m9449b(InterfaceC2667g2 interfaceC2667g2, InterfaceC4229i interfaceC4229i, HashSet hashSet) {
        InterfaceC4229i interfaceC4229iM9449b;
        InterfaceC4236p interfaceC4236pMo10897I = interfaceC2667g2.mo10897I(interfaceC4229i);
        if (!hashSet.add(interfaceC4236pMo10897I)) {
            return null;
        }
        InterfaceC4237q interfaceC4237qMo10913X = interfaceC2667g2.mo10913X(interfaceC4236pMo10897I);
        if (interfaceC4237qMo10913X != null) {
            InterfaceC4229i interfaceC4229iMo9440C0 = interfaceC2667g2.mo9440C0(interfaceC4237qMo10913X);
            InterfaceC4229i interfaceC4229iM9449b2 = m9449b(interfaceC2667g2, interfaceC4229iMo9440C0, hashSet);
            if (interfaceC4229iM9449b2 != null) {
                return ((interfaceC4229iM9449b2 instanceof InterfaceC4231k) && interfaceC2667g2.mo10934o((InterfaceC4231k) interfaceC4229iM9449b2) && interfaceC2667g2.mo10924i0(interfaceC4229i) && (interfaceC2667g2.mo9444Q(interfaceC2667g2.mo10897I(interfaceC4229iMo9440C0)) || ((interfaceC4229iMo9440C0 instanceof InterfaceC4231k) && interfaceC2667g2.mo10934o((InterfaceC4231k) interfaceC4229iMo9440C0)))) ? interfaceC2667g2.mo9445i(interfaceC4229iMo9440C0) : (interfaceC2667g2.mo10924i0(interfaceC4229iM9449b2) || !interfaceC2667g2.mo10953y(interfaceC4229i)) ? interfaceC4229iM9449b2 : interfaceC2667g2.mo9445i(interfaceC4229iM9449b2);
            }
            return null;
        }
        if (interfaceC2667g2.mo9444Q(interfaceC4236pMo10897I)) {
            InterfaceC4229i interfaceC4229iMo9443L = interfaceC2667g2.mo9443L(interfaceC4229i);
            if (interfaceC4229iMo9443L == null || (interfaceC4229iM9449b = m9449b(interfaceC2667g2, interfaceC4229iMo9443L, hashSet)) == null) {
                return null;
            }
            if (!interfaceC2667g2.mo10924i0(interfaceC4229i)) {
                return interfaceC4229iM9449b;
            }
            if (!interfaceC2667g2.mo10924i0(interfaceC4229iM9449b) && (!(interfaceC4229iM9449b instanceof InterfaceC4231k) || !interfaceC2667g2.mo10934o((InterfaceC4231k) interfaceC4229iM9449b))) {
                return interfaceC2667g2.mo9445i(interfaceC4229iM9449b);
            }
        }
        return interfaceC4229i;
    }
}
