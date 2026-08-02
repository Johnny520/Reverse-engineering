package defpackage;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class m53 extends q43 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        boolean zT;
        BitSet bitSet = new BitSet();
        l41Var.b();
        int I = l41Var.I();
        int i = 0;
        while (I != 2) {
            int iU = vi0.u(I);
            if (iU == 5 || iU == 6) {
                int iV = l41Var.v();
                if (iV == 0) {
                    zT = false;
                } else {
                    if (iV != 1) {
                        StringBuilder sbN = vi0.n(iV, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        sbN.append(l41Var.o(true));
                        throw new t31(sbN.toString());
                    }
                    zT = true;
                }
            } else {
                if (iU != 7) {
                    um2.h("Invalid bitset value type: ", vi0.x(I), "; at path ", l41Var.o(false));
                    return null;
                }
                zT = l41Var.t();
            }
            if (zT) {
                bitSet.set(i);
            }
            i++;
            I = l41Var.I();
        }
        l41Var.h();
        return bitSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        o41Var.c();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            o41Var.A(bitSet.get(i) ? 1L : 0L);
        }
        o41Var.h();
    }
}
