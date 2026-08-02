package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pa {
    public static final my a = new my(q7.q);
    public static final my b = new my(q7.p);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(g22 g22Var, xm0 xm0Var, h22 h22Var, kw kwVar, px pxVar, int i, int i2) {
        int i3;
        xm0 xm0Var2;
        h22 h22Var2;
        xm0 xm0Var3;
        b62 b62VarR;
        int i4;
        String str;
        boolean z;
        d61 d61Var;
        g22 g22Var2 = g22Var;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1772091631);
        if ((i & 6) == 0) {
            i3 = (go0Var.f(g22Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                xm0Var2 = xm0Var;
                i3 |= go0Var.h(xm0Var2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                h22Var2 = h22Var;
                i3 |= go0Var.f(h22Var2) ? 256 : 128;
            } else {
                h22Var2 = h22Var;
            }
            if ((i & 3072) == 0) {
                i3 |= go0Var.h(kwVar) ? 2048 : 1024;
            }
            if (go0Var.O(i3 & 1, (i3 & 1171) == 1170)) {
                go0Var.R();
                xm0Var3 = xm0Var2;
            } else {
                xm0 xm0Var4 = i5 != 0 ? null : xm0Var2;
                View view = (View) go0Var.j(r7.f);
                e70 e70Var = (e70) go0Var.j(ly.h);
                String str2 = (String) go0Var.j(a);
                d61 d61Var2 = (d61) go0Var.j(ly.n);
                eo0 eo0VarL = rg3.L(go0Var);
                xk1 xk1VarX = op0.x(kwVar, go0Var);
                Object[] objArr = new Object[0];
                Object objL = go0Var.L();
                eb ebVar = nx.a;
                Object obj = objL;
                if (objL == ebVar) {
                    q7 q7Var = q7.r;
                    go0Var.f0(q7Var);
                    obj = q7Var;
                }
                UUID uuid = (UUID) gf1.M(objArr, (xm0) obj, go0Var, 48);
                boolean zBooleanValue = ((Boolean) go0Var.j(b)).booleanValue();
                Object objL2 = go0Var.L();
                if (objL2 == ebVar) {
                    str = str2;
                    i4 = i3;
                    z = true;
                    d22 d22Var = new d22(xm0Var4, h22Var2, str, view, e70Var, g22Var2, uuid, zBooleanValue);
                    g22Var2 = g22Var2;
                    d22Var.n(eo0VarL, new kw(-297523940, true, new oa(d22Var, xk1VarX, true ? 1 : 0)));
                    go0Var.f0(d22Var);
                    objL2 = d22Var;
                } else {
                    i4 = i3;
                    str = str2;
                    z = true;
                }
                d22 d22Var2 = (d22) objL2;
                int i6 = i4 & 112;
                int i7 = i4 & 896;
                boolean zH = go0Var.h(d22Var2) | (i6 == 32 ? z : false) | (i7 == 256 ? z : false) | go0Var.f(str) | go0Var.d(d61Var2.ordinal());
                Object objL3 = go0Var.L();
                if (zH != 0 || objL3 == ebVar) {
                    objL3 = new ia(d22Var2, xm0Var4, h22Var, str, d61Var2);
                    go0Var.f0(objL3);
                }
                eu.c(d22Var2, (in0) objL3, go0Var);
                boolean zH2 = go0Var.h(d22Var2) | (i6 == 32 ? z : false) | (i7 == 256 ? z : false) | go0Var.f(str) | go0Var.d(d61Var2.ordinal());
                Object objL4 = go0Var.L();
                if (zH2 != 0 || objL4 == ebVar) {
                    objL4 = new ja(d22Var2, xm0Var4, h22Var, str, d61Var2);
                    d61Var = d61Var2;
                    go0Var.f0(objL4);
                } else {
                    d61Var = d61Var2;
                }
                eu.r((xm0) objL4, go0Var);
                boolean zH3 = go0Var.h(d22Var2) | ((i4 & 14) == 4 ? z : false);
                Object objL5 = go0Var.L();
                Object obj2 = objL5;
                if (zH3 != 0 || objL5 == ebVar) {
                    fa faVar = new fa(2, d22Var2, g22Var2);
                    go0Var.f0(faVar);
                    obj2 = faVar;
                }
                eu.c(g22Var2, (in0) obj2, go0Var);
                boolean zH4 = go0Var.h(d22Var2);
                Object objL6 = go0Var.L();
                Object obj3 = objL6;
                if (zH4 || objL6 == ebVar) {
                    a2 a2Var = new a2(d22Var2, null, 5);
                    go0Var.f0(a2Var);
                    obj3 = a2Var;
                }
                eu.f(go0Var, (mn0) obj3, d22Var2);
                boolean zH5 = go0Var.h(d22Var2);
                Object objL7 = go0Var.L();
                Object obj4 = objL7;
                if (zH5 || objL7 == ebVar) {
                    la laVar = new la(d22Var2, 0);
                    go0Var.f0(laVar);
                    obj4 = laVar;
                }
                uh1 uh1VarE = t11.E(rh1.a, (in0) obj4);
                boolean zH6 = go0Var.h(d22Var2) | go0Var.d(d61Var.ordinal());
                Object objL8 = go0Var.L();
                Object obj5 = objL8;
                if (zH6 || objL8 == ebVar) {
                    ma maVar = new ma(d22Var2, d61Var);
                    go0Var.f0(maVar);
                    obj5 = maVar;
                }
                nf1 nf1Var = (nf1) obj5;
                int iHashCode = Long.hashCode(go0Var.T);
                yy1 yy1VarL = go0Var.l();
                uh1 uh1VarM = tl.M(go0Var, uh1VarE);
                hx.c.getClass();
                jy jyVar = gx.b;
                go0Var.Z();
                if (go0Var.S) {
                    go0Var.k(jyVar);
                } else {
                    go0Var.i0();
                }
                yf3.c(go0Var, gx.e, nf1Var);
                yf3.c(go0Var, gx.d, yy1VarL);
                yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
                yf3.b(go0Var, gx.g);
                yf3.c(go0Var, gx.c, uh1VarM);
                go0Var.p(z);
                xm0Var3 = xm0Var4;
            }
            b62VarR = go0Var.r();
            if (b62VarR == null) {
                b62VarR.d = new na(g22Var2, xm0Var3, h22Var, kwVar, i, i2);
                return;
            }
            return;
        }
        i3 |= 48;
        xm0Var2 = xm0Var;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        if (go0Var.O(i3 & 1, (i3 & 1171) == 1170)) {
        }
        b62VarR = go0Var.r();
        if (b62VarR == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
