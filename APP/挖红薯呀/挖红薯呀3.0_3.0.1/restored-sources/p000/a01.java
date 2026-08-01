package p000;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class a01 {

    /* JADX INFO: renamed from: a */
    public final b60 f2a;

    /* JADX INFO: renamed from: b */
    public final C0366js f3b;

    /* JADX INFO: renamed from: c */
    public final u20 f4c;

    /* JADX INFO: renamed from: d */
    public final dh0 f5d = new dh0(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a01(b60 b60Var, C0366js c0366js, ug0 ug0Var) {
        this.f2a = b60Var;
        this.f3b = c0366js;
        this.f4c = ug0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final xz0 m2a() {
        return new xz0(this.f3b, false, this.f2a, new sz0());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3b(b60 b60Var, sz0 sz0Var) {
        String str;
        String str2;
        p81 p81Var;
        p81 p81Var2;
        C0460m5 c0460m5;
        C0460m5 c0460m52;
        dh0 dh0Var = this.f5d;
        Object[] objArr = dh0Var.f1108a;
        int i = dh0Var.f1109b;
        for (int i2 = 0; i2 < i; i2++) {
            C0004a3 c0004a3 = (C0004a3) objArr[i2];
            C0910x1 c0910x1 = c0004a3.f30d;
            AutofillManager autofillManager = (AutofillManager) c0910x1.f7232e;
            ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = c0004a3.f32f;
            sz0 sz0VarM317x = b60Var.m317x();
            int i3 = b60Var.f406e;
            if (sz0Var != null) {
                Object objM1701g = sz0Var.f5877d.m1701g(b01.f311D);
                if (objM1701g == null) {
                    objM1701g = null;
                }
                C0200f8 c0200f8 = (C0200f8) objM1701g;
                str = c0200f8 != null ? c0200f8.f1625e : null;
            }
            if (sz0VarM317x != null) {
                Object objM1701g2 = sz0VarM317x.f5877d.m1701g(b01.f311D);
                if (objM1701g2 == null) {
                    objM1701g2 = null;
                }
                C0200f8 c0200f82 = (C0200f8) objM1701g2;
                str2 = c0200f82 != null ? c0200f82.f1625e : null;
            }
            if (str != str2) {
                if (str == null) {
                    c0910x1.m5076p(viewTreeObserverOnGlobalLayoutListenerC0875w3, i3, true);
                } else if (str2 == null) {
                    c0910x1.m5076p(viewTreeObserverOnGlobalLayoutListenerC0875w3, i3, false);
                } else if (p30.m3002l((C0876w4) w60.m4915v(sz0VarM317x, b01.f339r), C0496n2.f4161u)) {
                    autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC0875w3, i3, AutofillValue.forText(str2));
                }
            }
            if (sz0Var != null) {
                Object objM1701g3 = sz0Var.f5877d.m1701g(b01.f315H);
                if (objM1701g3 == null) {
                    objM1701g3 = null;
                }
                p81Var = (p81) objM1701g3;
            } else {
                p81Var = null;
            }
            if (sz0VarM317x != null) {
                Object objM1701g4 = sz0VarM317x.f5877d.m1701g(b01.f315H);
                if (objM1701g4 == null) {
                    objM1701g4 = null;
                }
                p81Var2 = (p81) objM1701g4;
            } else {
                p81Var2 = null;
            }
            if (p81Var != p81Var2) {
                if (p81Var == null) {
                    c0910x1.m5076p(viewTreeObserverOnGlobalLayoutListenerC0875w3, i3, true);
                } else if (p81Var2 == null) {
                    c0910x1.m5076p(viewTreeObserverOnGlobalLayoutListenerC0875w3, i3, false);
                } else if (p30.m3002l((C0876w4) w60.m4915v(sz0VarM317x, b01.f339r), C0496n2.f4162v)) {
                    int iOrdinal = p81Var2.ordinal();
                    Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC0875w3, i3, AutofillValue.forToggle(bool.booleanValue()));
                    }
                }
            }
            if (sz0Var != null) {
                Object objM1701g5 = sz0Var.f5877d.m1701g(b01.f340s);
                if (objM1701g5 == null) {
                    objM1701g5 = null;
                }
                c0460m5 = (C0460m5) objM1701g5;
            } else {
                c0460m5 = null;
            }
            if (sz0VarM317x != null) {
                Object objM1701g6 = sz0VarM317x.f5877d.m1701g(b01.f340s);
                if (objM1701g6 == null) {
                    objM1701g6 = null;
                }
                c0460m52 = (C0460m5) objM1701g6;
            } else {
                c0460m52 = null;
            }
            if (!p30.m3002l(c0460m5, c0460m52)) {
                if (c0460m5 == null) {
                    c0910x1.m5076p(viewTreeObserverOnGlobalLayoutListenerC0875w3, i3, true);
                } else if (c0460m52 == null) {
                    c0910x1.m5076p(viewTreeObserverOnGlobalLayoutListenerC0875w3, i3, false);
                } else {
                    autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC0875w3, i3, c0460m52.f3805a);
                }
            }
            boolean z = sz0Var != null && sz0Var.f5877d.m1696b(b01.f338q);
            boolean z2 = sz0VarM317x != null && sz0VarM317x.f5877d.m1696b(b01.f338q);
            if (z != z2) {
                vg0 vg0Var = c0004a3.f36j;
                if (z2) {
                    vg0Var.m4744a(i3);
                } else {
                    vg0Var.m4748e(i3);
                }
            }
        }
    }
}
