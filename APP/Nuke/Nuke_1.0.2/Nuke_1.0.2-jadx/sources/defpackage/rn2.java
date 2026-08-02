package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rn2 {
    public final ln2 a;
    public final ak1 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rn2(qn2 qn2Var, x01 x01Var) {
        this.a = qn2Var.d;
        List listJ = qn2.j(4, qn2Var);
        this.b = new ak1(listJ.size());
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            qn2 qn2Var2 = (qn2) listJ.get(i);
            if (x01Var.a(qn2Var2.f)) {
                this.b.a(qn2Var2.f);
            }
        }
    }
}
