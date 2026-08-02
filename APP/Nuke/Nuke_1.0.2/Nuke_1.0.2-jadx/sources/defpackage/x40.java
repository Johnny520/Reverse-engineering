package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x40 {
    public final Class a;
    public final List b;
    public final n92 c;
    public final a22 d;
    public final String e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x40(Class cls, Class cls2, Class cls3, List list, n92 n92Var, a22 a22Var) {
        this.a = cls;
        this.b = list;
        this.c = n92Var;
        this.d = a22Var;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final d92 a(int i, int i2, dk dkVar, k40 k40Var, ov1 ov1Var) {
        d92 d92VarA;
        n33 n33Var;
        int iH;
        j92 j92VarF;
        d92 d92Var;
        boolean z;
        boolean z2;
        Object d40Var;
        a22 a22Var = this.d;
        List list = (List) a22Var.c();
        fg1.q("Argument must not be null", list);
        try {
            d92 d92VarB = b(k40Var, i, i2, ov1Var, list);
            a22Var.a(list);
            w40 w40Var = (w40) dkVar.j;
            int i3 = dkVar.i;
            t40 t40Var = w40Var.h;
            Class<?> cls = d92VarB.get().getClass();
            if (i3 != 4) {
                n33 n33VarE = t40Var.e(cls);
                n33Var = n33VarE;
                d92VarA = n33VarE.a(w40Var.o, d92VarB, w40Var.s, w40Var.t);
            } else {
                d92VarA = d92VarB;
                n33Var = null;
            }
            if (!d92VarB.equals(d92VarA)) {
                d92VarB.e();
            }
            if (t40Var.c.a().d.f(d92VarA.d()) != null) {
                j92VarF = t40Var.c.a().d.f(d92VarA.d());
                if (j92VarF == null) {
                    throw new u72(d92VarA.d());
                }
                iH = j92VarF.h(w40Var.v);
            } else {
                iH = 3;
                j92VarF = null;
            }
            a51 a51Var = w40Var.D;
            ArrayList arrayListB = t40Var.b();
            int size = arrayListB.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    d92Var = null;
                    z = false;
                    break;
                }
                d92Var = null;
                if (((ih1) arrayListB.get(i4)).a.equals(a51Var)) {
                    z = true;
                    break;
                }
                i4++;
            }
            switch (w40Var.u.a) {
                default:
                    if (((!z && i3 == 3) || i3 == 1) && iH == 2) {
                        z2 = true;
                        break;
                    }
                case 0:
                case 1:
                    z2 = false;
                    break;
            }
            if (z2) {
                if (j92VarF == null) {
                    throw new u72(d92VarA.get().getClass());
                }
                int iU = vi0.u(iH);
                if (iU == 0) {
                    d40Var = new d40(w40Var.D, w40Var.p);
                } else {
                    if (iU != 1) {
                        s.j("Unknown strategy: ".concat(iH != 1 ? iH != 2 ? iH != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                        return d92Var;
                    }
                    d40Var = new f92(t40Var.c.a, w40Var.D, w40Var.p, w40Var.s, w40Var.t, n33Var, cls, w40Var.v);
                }
                sc1 sc1Var = (sc1) sc1.l.c();
                sc1Var.k = false;
                sc1Var.j = true;
                sc1Var.i = d92VarA;
                b5 b5Var = w40Var.m;
                b5Var.i = d40Var;
                b5Var.j = j92VarF;
                b5Var.k = sc1Var;
                d92VarA = sc1Var;
            }
            return this.c.i(d92VarA, ov1Var);
        } catch (Throwable th) {
            a22Var.a(list);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final d92 b(k40 k40Var, int i, int i2, ov1 ov1Var, List list) throws xp0 {
        List list2 = this.b;
        int size = list2.size();
        d92 d92VarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            g92 g92Var = (g92) list2.get(i3);
            try {
                if (g92Var.b(k40Var.f(), ov1Var)) {
                    d92VarA = g92Var.a(k40Var.f(), i, i2, ov1Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + g92Var, e);
                }
                list.add(e);
            }
            if (d92VarA != null) {
                break;
            }
        }
        if (d92VarA != null) {
            return d92VarA;
        }
        throw new xp0(this.e, new ArrayList(list));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
