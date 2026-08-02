package defpackage;

import java.lang.annotation.Annotation;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dv2 implements ve0, wx {
    public final ox a;
    public final u21 b;
    public final fg3 c;
    public final dv2[] d;
    public final f31 e;
    public boolean f;
    public String g;
    public String h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dv2(ox oxVar, u21 u21Var, fg3 fg3Var, dv2[] dv2VarArr) {
        oxVar.getClass();
        this.a = oxVar;
        this.b = u21Var;
        this.c = fg3Var;
        this.d = dv2VarArr;
        this.e = u21Var.a;
        int iOrdinal = fg3Var.ordinal();
        if (dv2VarArr != null) {
            dv2 dv2Var = dv2VarArr[iOrdinal];
            if (dv2Var == null && dv2Var == this) {
                return;
            }
            dv2VarArr[iOrdinal] = this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wx
    public final void a(yo2 yo2Var) {
        yo2Var.getClass();
        ox oxVar = this.a;
        oxVar.m();
        oxVar.c();
        oxVar.e(this.c.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ve0
    public final wx b(yo2 yo2Var) {
        dv2 dv2Var;
        yo2Var.getClass();
        u21 u21Var = this.b;
        fg3 fg3VarF = gg3.f(u21Var, yo2Var);
        char c = fg3VarF.h;
        ox oxVar = this.a;
        oxVar.e(c);
        oxVar.a();
        String str = this.g;
        if (str != null) {
            String strB = this.h;
            if (strB == null) {
                strB = yo2Var.b();
            }
            oxVar.b();
            oxVar.i(str);
            oxVar.e(':');
            oxVar.k();
            p(strB);
            this.g = null;
            this.h = null;
        }
        if (this.c == fg3VarF) {
            return this;
        }
        dv2[] dv2VarArr = this.d;
        return (dv2VarArr == null || (dv2Var = dv2VarArr[fg3VarF.ordinal()]) == null) ? new dv2(oxVar, u21Var, fg3VarF, dv2VarArr) : dv2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ve0
    public final void c() {
        ox oxVar = this.a;
        oxVar.getClass();
        ((dk) oxVar.i).w("null");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wx
    public final boolean d(yo2 yo2Var) {
        yo2Var.getClass();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    @Override // defpackage.ve0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(w41 w41Var, Object obj) {
        String strDiscriminator;
        String str;
        w41Var.getClass();
        u21 u21Var = this.b;
        f31 f31Var = u21Var.a;
        boolean z = w41Var instanceof e3;
        zs zsVar = f31Var.g;
        if (!z) {
            int iOrdinal = zsVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    s11 s11VarC = w41Var.e().c();
                    if (t11.l(s11VarC, yv2.g) || t11.l(s11VarC, yv2.j)) {
                    }
                } else if (iOrdinal != 2) {
                    c80.s();
                    return;
                }
            }
            strDiscriminator = null;
        } else if (zsVar != zs.h) {
            yo2 yo2VarE = w41Var.e();
            yo2VarE.getClass();
            Iterator it = yo2VarE.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    strDiscriminator = f31Var.e;
                    break;
                }
                Annotation annotation = (Annotation) it.next();
                if (annotation instanceof e31) {
                    strDiscriminator = ((e31) annotation).discriminator();
                    break;
                }
            }
        } else {
            strDiscriminator = null;
        }
        if (z) {
            vi0.t(w41Var);
            obj.getClass();
            throw null;
        }
        if (strDiscriminator != null) {
            yo2 yo2VarE2 = w41Var.e();
            yo2VarE2.getClass();
            sp0.N(u21Var, yo2VarE2);
            if (tl.m(yo2VarE2).contains(strDiscriminator)) {
                String strB = w41Var.e().b();
                String strB2 = w41Var.e().b();
                if (f31Var.g == zs.i && t11.l(strB, strB2)) {
                    str = "in ALL_JSON_OBJECTS class discriminator mode";
                } else {
                    str = "as base class '" + strB + '\'';
                }
                throw new r31(hk1.j(vi0.o("Class '", strB2, "' cannot be serialized ", str, " because it has property name that conflicts with JSON class discriminator '"), strDiscriminator, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
            }
            s11 s11VarC2 = w41Var.e().c();
            s11VarC2.getClass();
            if (s11VarC2 instanceof cp2) {
                s.l("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            }
            if (s11VarC2 instanceof f32) {
                s.l("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            } else if (s11VarC2 instanceof x12) {
                s.l("Actual serializer for polymorphic cannot be polymorphic itself");
                return;
            } else {
                String strB3 = w41Var.e().b();
                this.g = strDiscriminator;
                this.h = strB3;
            }
        }
        w41Var.d(this, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ve0
    public final void f(double d) {
        if (this.f) {
            p(String.valueOf(d));
        } else {
            ((dk) this.a.i).w(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new r31(p7.F(Double.valueOf(d), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ve0
    public final void g(short s) {
        if (this.f) {
            p(String.valueOf((int) s));
        } else {
            this.a.h(s);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wx
    public final void h(yo2 yo2Var, int i, Object obj) {
        nv2 nv2Var = nv2.a;
        yo2Var.getClass();
        if (obj != null || this.e.c) {
            nv2 nv2Var2 = nv2.a;
            yo2Var.getClass();
            s(yo2Var, i);
            nv2.b.getClass();
            if (obj == null) {
                c();
            } else {
                e(nv2Var2, obj);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ve0
    public final void i(byte b) {
        if (this.f) {
            p(String.valueOf((int) b));
        } else {
            this.a.d(b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ve0
    public final void j(boolean z) {
        if (this.f) {
            p(String.valueOf(z));
        } else {
            ((dk) this.a.i).w(String.valueOf(z));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ve0
    public final ve0 k(yo2 yo2Var) {
        yo2Var.getClass();
        boolean zA = ev2.a(yo2Var);
        fg3 fg3Var = this.c;
        u21 u21Var = this.b;
        ox rxVar = this.a;
        if (zA) {
            if (!(rxVar instanceof sx)) {
                rxVar = new sx((dk) rxVar.i, this.f);
            }
            return new dv2(rxVar, u21Var, fg3Var, null);
        }
        if (yo2Var.f() && yo2Var.equals(l31.a)) {
            if (!(rxVar instanceof rx)) {
                rxVar = new rx((dk) rxVar.i, this.f);
            }
            return new dv2(rxVar, u21Var, fg3Var, null);
        }
        if (this.g != null) {
            this.h = yo2Var.b();
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ve0
    public final void l(int i) {
        if (this.f) {
            p(String.valueOf(i));
        } else {
            this.a.f(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ve0
    public final void m(float f) {
        if (this.f) {
            p(String.valueOf(f));
        } else {
            ((dk) this.a.i).w(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw new r31(p7.F(Float.valueOf(f), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ve0
    public final void n(long j) {
        if (this.f) {
            p(String.valueOf(j));
        } else {
            this.a.g(j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ve0
    public final void o(char c) {
        p(String.valueOf(c));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ve0
    public final void p(String str) {
        str.getClass();
        this.a.i(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ve0
    public final void q(yo2 yo2Var, int i) {
        yo2Var.getClass();
        p(yo2Var.e(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(yo2 yo2Var, int i, boolean z) {
        yo2Var.getClass();
        s(yo2Var, i);
        j(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s(yo2 yo2Var, int i) {
        yo2Var.getClass();
        int iOrdinal = this.c.ordinal();
        ox oxVar = this.a;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!oxVar.h) {
                oxVar.e(',');
            }
            oxVar.b();
            return;
        }
        if (iOrdinal == 2) {
            if (oxVar.h) {
                this.f = true;
                oxVar.b();
                return;
            }
            if (i % 2 == 0) {
                oxVar.e(',');
                oxVar.b();
            } else {
                oxVar.e(':');
                oxVar.k();
                z = false;
            }
            this.f = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!oxVar.h) {
                oxVar.e(',');
            }
            oxVar.b();
            sp0.N(this.b, yo2Var);
            p(yo2Var.e(i));
            oxVar.e(':');
            oxVar.k();
            return;
        }
        if (i == 0) {
            this.f = true;
        }
        if (i == 1) {
            oxVar.e(',');
            oxVar.k();
            this.f = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ve0 t(d32 d32Var, int i) {
        d32Var.getClass();
        s(d32Var, i);
        return k(d32Var.j(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u(int i, int i2, yo2 yo2Var) {
        yo2Var.getClass();
        s(yo2Var, i);
        l(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v(yo2 yo2Var, int i, long j) {
        yo2Var.getClass();
        s(yo2Var, i);
        n(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w(yo2 yo2Var, int i, w41 w41Var, Object obj) {
        yo2Var.getClass();
        w41Var.getClass();
        s(yo2Var, i);
        e(w41Var, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x(yo2 yo2Var, int i, String str) {
        yo2Var.getClass();
        str.getClass();
        s(yo2Var, i);
        p(str);
    }
}
