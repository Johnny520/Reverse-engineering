package p000;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x40 {

    /* JADX INFO: renamed from: a */
    public final Class f12801a;

    /* JADX INFO: renamed from: b */
    public final List f12802b;

    /* JADX INFO: renamed from: c */
    public final n92 f12803c;

    /* JADX INFO: renamed from: d */
    public final a22 f12804d;

    /* JADX INFO: renamed from: e */
    public final String f12805e;

    public x40(Class cls, Class cls2, Class cls3, List list, n92 n92Var, a22 a22Var) {
        this.f12801a = cls;
        this.f12802b = list;
        this.f12803c = n92Var;
        this.f12804d = a22Var;
        this.f12805e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX INFO: renamed from: a */
    public final d92 m6034a(int i, int i2, C0133dk c0133dk, k40 k40Var, ov1 ov1Var) {
        d92 d92VarMo247a;
        n33 n33Var;
        int iMo2471h;
        j92 j92VarM6254f;
        d92 d92Var;
        boolean z;
        boolean z2;
        Object d40Var;
        a22 a22Var = this.f12804d;
        List list = (List) a22Var.mo19c();
        fg1.m1642q("Argument must not be null", list);
        try {
            d92 d92VarM6035b = m6035b(k40Var, i, i2, ov1Var, list);
            a22Var.mo18a(list);
            w40 w40Var = (w40) c0133dk.f2082j;
            int i3 = c0133dk.f2081i;
            t40 t40Var = w40Var.f12328h;
            Class<?> cls = d92VarM6035b.get().getClass();
            if (i3 != 4) {
                n33 n33VarM5120e = t40Var.m5120e(cls);
                n33Var = n33VarM5120e;
                d92VarMo247a = n33VarM5120e.mo247a(w40Var.f12335o, d92VarM6035b, w40Var.f12339s, w40Var.f12340t);
            } else {
                d92VarMo247a = d92VarM6035b;
                n33Var = null;
            }
            if (!d92VarM6035b.equals(d92VarMo247a)) {
                d92VarM6035b.mo192e();
            }
            if (t40Var.f10539c.m5748a().f11808d.m6254f(d92VarMo247a.mo191d()) != null) {
                j92VarM6254f = t40Var.f10539c.m5748a().f11808d.m6254f(d92VarMo247a.mo191d());
                if (j92VarM6254f == null) {
                    throw new u72(d92VarMo247a.mo191d());
                }
                iMo2471h = j92VarM6254f.mo2471h(w40Var.f12342v);
            } else {
                iMo2471h = 3;
                j92VarM6254f = null;
            }
            a51 a51Var = w40Var.f12317D;
            ArrayList arrayListM5117b = t40Var.m5117b();
            int size = arrayListM5117b.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    d92Var = null;
                    z = false;
                    break;
                }
                d92Var = null;
                if (((ih1) arrayListM5117b.get(i4)).f4616a.equals(a51Var)) {
                    z = true;
                    break;
                }
                i4++;
            }
            switch (w40Var.f12341u.f745a) {
                default:
                    if (((!z && i3 == 3) || i3 == 1) && iMo2471h == 2) {
                        z2 = true;
                        break;
                    }
                case 0:
                case 1:
                    z2 = false;
                    break;
            }
            if (z2) {
                if (j92VarM6254f == null) {
                    throw new u72(d92VarMo247a.get().getClass());
                }
                int iM5702u = vi0.m5702u(iMo2471h);
                if (iM5702u == 0) {
                    d40Var = new d40(w40Var.f12317D, w40Var.f12336p);
                } else {
                    if (iM5702u != 1) {
                        C0676s.m4651j("Unknown strategy: ".concat(iMo2471h != 1 ? iMo2471h != 2 ? iMo2471h != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                        return d92Var;
                    }
                    d40Var = new f92(t40Var.f10539c.f12099a, w40Var.f12317D, w40Var.f12336p, w40Var.f12339s, w40Var.f12340t, n33Var, cls, w40Var.f12342v);
                }
                sc1 sc1Var = (sc1) sc1.f10033l.mo19c();
                sc1Var.f10037k = false;
                sc1Var.f10036j = true;
                sc1Var.f10035i = d92VarMo247a;
                C0043b5 c0043b5 = w40Var.f12333m;
                c0043b5.f562i = d40Var;
                c0043b5.f563j = j92VarM6254f;
                c0043b5.f564k = sc1Var;
                d92VarMo247a = sc1Var;
            }
            return this.f12803c.mo422i(d92VarMo247a, ov1Var);
        } catch (Throwable th) {
            a22Var.mo18a(list);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final d92 m6035b(k40 k40Var, int i, int i2, ov1 ov1Var, List list) throws xp0 {
        List list2 = this.f12802b;
        int size = list2.size();
        d92 d92VarMo866a = null;
        for (int i3 = 0; i3 < size; i3++) {
            g92 g92Var = (g92) list2.get(i3);
            try {
                if (g92Var.mo867b(k40Var.mo873f(), ov1Var)) {
                    d92VarMo866a = g92Var.mo866a(k40Var.mo873f(), i, i2, ov1Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + g92Var, e);
                }
                list.add(e);
            }
            if (d92VarMo866a != null) {
                break;
            }
        }
        if (d92VarMo866a != null) {
            return d92VarMo866a;
        }
        throw new xp0(this.f12805e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f12801a + ", decoders=" + this.f12802b + ", transcoder=" + this.f12803c + '}';
    }
}
