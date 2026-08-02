package p000;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tn2 {

    /* JADX INFO: renamed from: a */
    public final r61 f10859a;

    /* JADX INFO: renamed from: b */
    public final de0 f10860b;

    /* JADX INFO: renamed from: c */
    public final x01 f10861c;

    /* JADX INFO: renamed from: d */
    public final lk1 f10862d = new lk1(2);

    public tn2(r61 r61Var, de0 de0Var, zj1 zj1Var) {
        this.f10859a = r61Var;
        this.f10860b = de0Var;
        this.f10861c = zj1Var;
    }

    /* JADX INFO: renamed from: a */
    public final qn2 m5334a() {
        return new qn2(this.f10860b, false, this.f10859a, new ln2());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5335b(r61 r61Var, ln2 ln2Var) {
        String str;
        String strM3992H0;
        u23 u23Var;
        u23 u23Var2;
        C0801v8 c0801v8;
        C0801v8 c0801v82;
        lk1 lk1Var = this.f10862d;
        Object[] objArr = lk1Var.f6163a;
        int i = lk1Var.f6164b;
        for (int i2 = 0; i2 < i; i2++) {
            C0119d6 c0119d6 = (C0119d6) objArr[i2];
            hh1 hh1Var = c0119d6.f1875h;
            AutofillManager autofillManager = (AutofillManager) hh1Var.f4019i;
            ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = c0119d6.f1877j;
            ln2 ln2VarM4391w = r61Var.m4391w();
            int i3 = r61Var.f9385i;
            if (ln2Var != null) {
                Object objM4505g = ln2Var.f6221h.m4505g(vn2.f12046F);
                if (objM4505g == null) {
                    objM4505g = null;
                }
                C0690sd c0690sd = (C0690sd) objM4505g;
                str = c0690sd != null ? c0690sd.f10051i : null;
            }
            if (ln2VarM4391w != null) {
                Object objM4505g2 = ln2VarM4391w.f6221h.m4505g(vn2.f12046F);
                if (objM4505g2 == null) {
                    objM4505g2 = null;
                }
                C0690sd c0690sd2 = (C0690sd) objM4505g2;
                strM3992H0 = c0690sd2 != null ? c0690sd2.f10051i : null;
            }
            if (str != strM3992H0) {
                if (str == null) {
                    hh1Var.m2179B(viewTreeObserverOnGlobalLayoutListenerC0045b7, i3, true);
                } else if (strM3992H0 == null) {
                    hh1Var.m2179B(viewTreeObserverOnGlobalLayoutListenerC0045b7, i3, false);
                } else if (t11.m5086l((C0874x7) pp0.m3926x(ln2VarM4391w, vn2.f12076s), C0700sn.f10198B)) {
                    if (strM3992H0.length() >= 5000) {
                        strM3992H0 = (Character.isHighSurrogate(strM3992H0.charAt(4999)) && Character.isLowSurrogate(strM3992H0.charAt(5000))) ? pv2.m3992H0(strM3992H0, 4999) : pv2.m3992H0(strM3992H0, 5000);
                    }
                    autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC0045b7, i3, AutofillValue.forText(strM3992H0));
                }
            }
            if (ln2Var != null) {
                Object objM4505g3 = ln2Var.f6221h.m4505g(vn2.f12051K);
                if (objM4505g3 == null) {
                    objM4505g3 = null;
                }
                u23Var = (u23) objM4505g3;
            } else {
                u23Var = null;
            }
            if (ln2VarM4391w != null) {
                Object objM4505g4 = ln2VarM4391w.f6221h.m4505g(vn2.f12051K);
                if (objM4505g4 == null) {
                    objM4505g4 = null;
                }
                u23Var2 = (u23) objM4505g4;
            } else {
                u23Var2 = null;
            }
            if (u23Var != u23Var2) {
                if (u23Var == null) {
                    hh1Var.m2179B(viewTreeObserverOnGlobalLayoutListenerC0045b7, i3, true);
                } else if (u23Var2 == null) {
                    hh1Var.m2179B(viewTreeObserverOnGlobalLayoutListenerC0045b7, i3, false);
                } else if (t11.m5086l((C0874x7) pp0.m3926x(ln2VarM4391w, vn2.f12076s), C0700sn.f10199C)) {
                    int iOrdinal = u23Var2.ordinal();
                    Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC0045b7, i3, AutofillValue.forToggle(bool.booleanValue()));
                    }
                }
            }
            if (ln2Var != null) {
                Object objM4505g5 = ln2Var.f6221h.m4505g(vn2.f12077t);
                if (objM4505g5 == null) {
                    objM4505g5 = null;
                }
                c0801v8 = (C0801v8) objM4505g5;
            } else {
                c0801v8 = null;
            }
            if (ln2VarM4391w != null) {
                Object objM4505g6 = ln2VarM4391w.f6221h.m4505g(vn2.f12077t);
                if (objM4505g6 == null) {
                    objM4505g6 = null;
                }
                c0801v82 = (C0801v8) objM4505g6;
            } else {
                c0801v82 = null;
            }
            if (!t11.m5086l(c0801v8, c0801v82)) {
                if (c0801v8 == null) {
                    hh1Var.m2179B(viewTreeObserverOnGlobalLayoutListenerC0045b7, i3, true);
                } else if (c0801v82 == null) {
                    hh1Var.m2179B(viewTreeObserverOnGlobalLayoutListenerC0045b7, i3, false);
                } else {
                    autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC0045b7, i3, c0801v82.f11816a);
                }
            }
            boolean z = ln2Var != null && ln2Var.f6221h.m4500b(vn2.f12075r);
            boolean z2 = ln2VarM4391w != null && ln2VarM4391w.f6221h.m4500b(vn2.f12075r);
            if (z != z2) {
                ak1 ak1Var = c0119d6.f1882o;
                if (z2) {
                    ak1Var.m182a(i3);
                } else {
                    ak1Var.m186e(i3);
                }
            }
        }
    }
}
