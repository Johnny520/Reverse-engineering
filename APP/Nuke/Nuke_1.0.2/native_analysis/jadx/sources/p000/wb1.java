package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wb1 {

    /* JADX INFO: renamed from: a */
    public final a22 f12451a;

    /* JADX INFO: renamed from: b */
    public final List f12452b;

    /* JADX INFO: renamed from: c */
    public final String f12453c;

    public wb1(Class cls, Class cls2, Class cls3, List list, a22 a22Var) {
        this.f12451a = a22Var;
        if (list.isEmpty()) {
            C0676s.m4651j("Must not be empty.");
            throw null;
        }
        this.f12452b = list;
        this.f12453c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX INFO: renamed from: a */
    public final d92 m5864a(int i, int i2, C0133dk c0133dk, k40 k40Var, ov1 ov1Var) {
        a22 a22Var = this.f12451a;
        List list = (List) a22Var.mo19c();
        fg1.m1642q("Argument must not be null", list);
        try {
            List list2 = this.f12452b;
            int size = list2.size();
            d92 d92VarM6034a = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    d92VarM6034a = ((x40) list2.get(i3)).m6034a(i, i2, c0133dk, k40Var, ov1Var);
                } catch (xp0 e) {
                    list.add(e);
                }
                if (d92VarM6034a != null) {
                    break;
                }
            }
            if (d92VarM6034a != null) {
                return d92VarM6034a;
            }
            throw new xp0(this.f12453c, new ArrayList(list));
        } finally {
            a22Var.mo18a(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f12452b.toArray()) + '}';
    }
}
