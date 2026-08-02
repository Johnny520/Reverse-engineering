package defpackage;

import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ec extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(ab3 ab3Var, r61 r61Var, ab3 ab3Var2) {
        super(1);
        this.i = 0;
        this.j = ab3Var;
        this.l = r61Var;
        this.k = ab3Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.i;
        a83 a83Var = a83.a;
        boolean zBooleanValue = false;
        m33Var = null;
        m33 m33Var = null;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                ab3 ab3Var = (ab3) obj4;
                r61 r61Var = (r61) obj2;
                ab3 ab3Var2 = (ab3) obj3;
                qp qpVarQ = ((nc0) obj).E().q();
                if (ab3Var.getView().getVisibility() != 8) {
                    ab3Var.F = true;
                    zv1 zv1Var = r61Var.u;
                    b7 b7Var = zv1Var instanceof b7 ? (b7) zv1Var : null;
                    if (b7Var != null) {
                        Canvas canvasA = g6.a(qpVarQ);
                        b7Var.getAndroidViewsHandler$ui().getClass();
                        ab3Var2.draw(canvasA);
                    }
                    ab3Var.F = false;
                }
                return a83Var;
            case 1:
                d43 d43Var = (d43) obj;
                gb0 gb0Var = (gb0) d43Var;
                if (!((o8) ((b7) sp0.f0((gb0) obj3)).getDragAndDropManager()).b.contains(gb0Var) || !se.w(gb0Var, te.I((n4) obj2))) {
                    return c43.h;
                }
                ((o72) obj4).i = d43Var;
                return c43.j;
            case 2:
                ca2 ca2Var = (ca2) obj;
                gu2 gu2Var = (gu2) obj3;
                gu2 gu2Var2 = (gu2) obj4;
                ca2Var.c(gu2Var2 != null ? ((Number) gu2Var2.getValue()).floatValue() : 1.0f);
                ca2Var.k(gu2Var != null ? ((Number) gu2Var.getValue()).floatValue() : 1.0f);
                ca2Var.l(gu2Var != null ? ((Number) gu2Var.getValue()).floatValue() : 1.0f);
                gu2 gu2Var3 = (gu2) obj2;
                ca2Var.r(gu2Var3 != null ? ((m33) gu2Var3.getValue()).a : m33.b);
                return a83Var;
            case 3:
                z33 z33Var = ((sf0) obj3).a;
                ph0 ph0Var = (ph0) obj2;
                int iOrdinal = ((if0) obj).ordinal();
                if (iOrdinal == 0) {
                    cd2 cd2Var = z33Var.b;
                    if (cd2Var != null) {
                        m33Var = new m33(cd2Var.a);
                    } else {
                        cd2 cd2Var2 = ph0Var.a.b;
                        if (cd2Var2 != null) {
                            m33Var = new m33(cd2Var2.a);
                        }
                    }
                } else if (iOrdinal == 1) {
                    m33Var = (m33) obj4;
                } else {
                    if (iOrdinal != 2) {
                        c80.s();
                        return null;
                    }
                    cd2 cd2Var3 = ph0Var.a.b;
                    if (cd2Var3 != null) {
                        m33Var = new m33(cd2Var3.a);
                    } else {
                        cd2 cd2Var4 = z33Var.b;
                        if (cd2Var4 != null) {
                            m33Var = new m33(cd2Var4.a);
                        }
                    }
                }
                return new m33(m33Var != null ? m33Var.a : m33.b);
            default:
                pl0 pl0Var = (pl0) obj;
                if (!t11.l(pl0Var, (pl0) obj4)) {
                    if (t11.l(pl0Var, ((bl0) obj3).c)) {
                        s.l("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) ((in0) obj2).j(pl0Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.i = i;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
    }
}
