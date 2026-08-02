package defpackage;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tn2 {
    public final r61 a;
    public final de0 b;
    public final x01 c;
    public final lk1 d = new lk1(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tn2(r61 r61Var, de0 de0Var, zj1 zj1Var) {
        this.a = r61Var;
        this.b = de0Var;
        this.c = zj1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final qn2 a() {
        return new qn2(this.b, false, this.a, new ln2());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(r61 r61Var, ln2 ln2Var) {
        String str;
        String strH0;
        u23 u23Var;
        u23 u23Var2;
        v8 v8Var;
        v8 v8Var2;
        lk1 lk1Var = this.d;
        Object[] objArr = lk1Var.a;
        int i = lk1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            d6 d6Var = (d6) objArr[i2];
            hh1 hh1Var = d6Var.h;
            AutofillManager autofillManager = (AutofillManager) hh1Var.i;
            b7 b7Var = d6Var.j;
            ln2 ln2VarW = r61Var.w();
            int i3 = r61Var.i;
            if (ln2Var != null) {
                Object objG = ln2Var.h.g(vn2.F);
                if (objG == null) {
                    objG = null;
                }
                sd sdVar = (sd) objG;
                str = sdVar != null ? sdVar.i : null;
            }
            if (ln2VarW != null) {
                Object objG2 = ln2VarW.h.g(vn2.F);
                if (objG2 == null) {
                    objG2 = null;
                }
                sd sdVar2 = (sd) objG2;
                strH0 = sdVar2 != null ? sdVar2.i : null;
            }
            if (str != strH0) {
                if (str == null) {
                    hh1Var.B(b7Var, i3, true);
                } else if (strH0 == null) {
                    hh1Var.B(b7Var, i3, false);
                } else if (t11.l((x7) pp0.x(ln2VarW, vn2.s), sn.B)) {
                    if (strH0.length() >= 5000) {
                        strH0 = (Character.isHighSurrogate(strH0.charAt(4999)) && Character.isLowSurrogate(strH0.charAt(5000))) ? pv2.H0(strH0, 4999) : pv2.H0(strH0, 5000);
                    }
                    autofillManager.notifyValueChanged(b7Var, i3, AutofillValue.forText(strH0));
                }
            }
            if (ln2Var != null) {
                Object objG3 = ln2Var.h.g(vn2.K);
                if (objG3 == null) {
                    objG3 = null;
                }
                u23Var = (u23) objG3;
            } else {
                u23Var = null;
            }
            if (ln2VarW != null) {
                Object objG4 = ln2VarW.h.g(vn2.K);
                if (objG4 == null) {
                    objG4 = null;
                }
                u23Var2 = (u23) objG4;
            } else {
                u23Var2 = null;
            }
            if (u23Var != u23Var2) {
                if (u23Var == null) {
                    hh1Var.B(b7Var, i3, true);
                } else if (u23Var2 == null) {
                    hh1Var.B(b7Var, i3, false);
                } else if (t11.l((x7) pp0.x(ln2VarW, vn2.s), sn.C)) {
                    int iOrdinal = u23Var2.ordinal();
                    Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        autofillManager.notifyValueChanged(b7Var, i3, AutofillValue.forToggle(bool.booleanValue()));
                    }
                }
            }
            if (ln2Var != null) {
                Object objG5 = ln2Var.h.g(vn2.t);
                if (objG5 == null) {
                    objG5 = null;
                }
                v8Var = (v8) objG5;
            } else {
                v8Var = null;
            }
            if (ln2VarW != null) {
                Object objG6 = ln2VarW.h.g(vn2.t);
                if (objG6 == null) {
                    objG6 = null;
                }
                v8Var2 = (v8) objG6;
            } else {
                v8Var2 = null;
            }
            if (!t11.l(v8Var, v8Var2)) {
                if (v8Var == null) {
                    hh1Var.B(b7Var, i3, true);
                } else if (v8Var2 == null) {
                    hh1Var.B(b7Var, i3, false);
                } else {
                    autofillManager.notifyValueChanged(b7Var, i3, v8Var2.a);
                }
            }
            boolean z = ln2Var != null && ln2Var.h.b(vn2.r);
            boolean z2 = ln2VarW != null && ln2VarW.h.b(vn2.r);
            if (z != z2) {
                ak1 ak1Var = d6Var.o;
                if (z2) {
                    ak1Var.a(i3);
                } else {
                    ak1Var.e(i3);
                }
            }
        }
    }
}
