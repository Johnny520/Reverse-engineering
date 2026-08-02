package p000;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class m53 extends q43 {
    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        boolean zM2835t;
        BitSet bitSet = new BitSet();
        l41Var.m2824b();
        int iM2814I = l41Var.m2814I();
        int i = 0;
        while (iM2814I != 2) {
            int iM5702u = vi0.m5702u(iM2814I);
            if (iM5702u == 5 || iM5702u == 6) {
                int iM2837v = l41Var.m2837v();
                if (iM2837v == 0) {
                    zM2835t = false;
                } else {
                    if (iM2837v != 1) {
                        StringBuilder sbM5695n = vi0.m5695n(iM2837v, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        sbM5695n.append(l41Var.m2831o(true));
                        throw new t31(sbM5695n.toString());
                    }
                    zM2835t = true;
                }
            } else {
                if (iM5702u != 7) {
                    um2.m5518h("Invalid bitset value type: ", vi0.m5705x(iM2814I), "; at path ", l41Var.m2831o(false));
                    return null;
                }
                zM2835t = l41Var.m2835t();
            }
            if (zM2835t) {
                bitSet.set(i);
            }
            i++;
            iM2814I = l41Var.m2814I();
        }
        l41Var.m2828h();
        return bitSet;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        o41Var.m3491c();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            o41Var.m3485A(bitSet.get(i) ? 1L : 0L);
        }
        o41Var.m3494h();
    }
}
