package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wb1 {
    public final a22 a;
    public final List b;
    public final String c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wb1(Class cls, Class cls2, Class cls3, List list, a22 a22Var) {
        this.a = a22Var;
        if (list.isEmpty()) {
            s.j("Must not be empty.");
            throw null;
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final d92 a(int i, int i2, dk dkVar, k40 k40Var, ov1 ov1Var) {
        a22 a22Var = this.a;
        List list = (List) a22Var.c();
        fg1.q("Argument must not be null", list);
        try {
            List list2 = this.b;
            int size = list2.size();
            d92 d92VarA = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    d92VarA = ((x40) list2.get(i3)).a(i, i2, dkVar, k40Var, ov1Var);
                } catch (xp0 e) {
                    list.add(e);
                }
                if (d92VarA != null) {
                    break;
                }
            }
            if (d92VarA != null) {
                return d92VarA;
            }
            throw new xp0(this.c, new ArrayList(list));
        } finally {
            a22Var.a(list);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
