package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.UUID;

/* JADX INFO: renamed from: pa */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0573pa {

    /* JADX INFO: renamed from: a */
    public static final C0478my f8061a = new C0478my(C0607q7.f8796q);

    /* JADX INFO: renamed from: b */
    public static final C0478my f8062b = new C0478my(C0607q7.f8795p);

    /* JADX WARN: Removed duplicated region for block: B:103:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3831a(g22 g22Var, xm0 xm0Var, h22 h22Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i, int i2) {
        int i3;
        xm0 xm0Var2;
        h22 h22Var2;
        xm0 xm0Var3;
        b62 b62VarM1996r;
        int i4;
        String str;
        boolean z;
        d61 d61Var;
        g22 g22Var2 = g22Var;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1772091631);
        if ((i & 6) == 0) {
            i3 = (go0Var.m1980f(g22Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                xm0Var2 = xm0Var;
                i3 |= go0Var.m1984h(xm0Var2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                h22Var2 = h22Var;
                i3 |= go0Var.m1980f(h22Var2) ? 256 : 128;
            } else {
                h22Var2 = h22Var;
            }
            if ((i & 3072) == 0) {
                i3 |= go0Var.m1984h(c0402kw) ? 2048 : 1024;
            }
            if (go0Var.m1958O(i3 & 1, (i3 & 1171) == 1170)) {
                go0Var.m1961R();
                xm0Var3 = xm0Var2;
            } else {
                xm0 xm0Var4 = i5 != 0 ? null : xm0Var2;
                View view = (View) go0Var.m1988j(AbstractC0646r7.f9415f);
                e70 e70Var = (e70) go0Var.m1988j(AbstractC0441ly.f6382h);
                String str2 = (String) go0Var.m1988j(f8061a);
                d61 d61Var2 = (d61) go0Var.m1988j(AbstractC0441ly.f6388n);
                eo0 eo0VarM4458L = rg3.m4458L(go0Var);
                xk1 xk1VarM3601x = op0.m3601x(c0402kw, go0Var);
                Object[] objArr = new Object[0];
                Object objM1956L = go0Var.m1956L();
                C0160eb c0160eb = C0520nx.f7360a;
                Object obj = objM1956L;
                if (objM1956L == c0160eb) {
                    C0607q7 c0607q7 = C0607q7.f8797r;
                    go0Var.m1981f0(c0607q7);
                    obj = c0607q7;
                }
                UUID uuid = (UUID) gf1.m1865M(objArr, (xm0) obj, go0Var, 48);
                boolean zBooleanValue = ((Boolean) go0Var.m1988j(f8062b)).booleanValue();
                Object objM1956L2 = go0Var.m1956L();
                if (objM1956L2 == c0160eb) {
                    str = str2;
                    i4 = i3;
                    z = true;
                    d22 d22Var = new d22(xm0Var4, h22Var2, str, view, e70Var, g22Var2, uuid, zBooleanValue);
                    g22Var2 = g22Var2;
                    d22Var.m930n(eo0VarM4458L, new C0402kw(-297523940, true, new C0536oa(d22Var, xk1VarM3601x, true ? 1 : 0)));
                    go0Var.m1981f0(d22Var);
                    objM1956L2 = d22Var;
                } else {
                    i4 = i3;
                    str = str2;
                    z = true;
                }
                d22 d22Var2 = (d22) objM1956L2;
                int i6 = i4 & 112;
                int i7 = i4 & 896;
                boolean zM1984h = go0Var.m1984h(d22Var2) | (i6 == 32 ? z : false) | (i7 == 256 ? z : false) | go0Var.m1980f(str) | go0Var.m1976d(d61Var2.ordinal());
                Object objM1956L3 = go0Var.m1956L();
                if (zM1984h != 0 || objM1956L3 == c0160eb) {
                    objM1956L3 = new C0307ia(d22Var2, xm0Var4, h22Var, str, d61Var2);
                    go0Var.m1981f0(objM1956L3);
                }
                AbstractC0179eu.m1450c(d22Var2, (in0) objM1956L3, go0Var);
                boolean zM1984h2 = go0Var.m1984h(d22Var2) | (i6 == 32 ? z : false) | (i7 == 256 ? z : false) | go0Var.m1980f(str) | go0Var.m1976d(d61Var2.ordinal());
                Object objM1956L4 = go0Var.m1956L();
                if (zM1984h2 != 0 || objM1956L4 == c0160eb) {
                    objM1956L4 = new C0343ja(d22Var2, xm0Var4, h22Var, str, d61Var2);
                    d61Var = d61Var2;
                    go0Var.m1981f0(objM1956L4);
                } else {
                    d61Var = d61Var2;
                }
                AbstractC0179eu.m1468r((xm0) objM1956L4, go0Var);
                boolean zM1984h3 = go0Var.m1984h(d22Var2) | ((i4 & 14) == 4 ? z : false);
                Object objM1956L5 = go0Var.m1956L();
                Object obj2 = objM1956L5;
                if (zM1984h3 != 0 || objM1956L5 == c0160eb) {
                    C0196fa c0196fa = new C0196fa(2, d22Var2, g22Var2);
                    go0Var.m1981f0(c0196fa);
                    obj2 = c0196fa;
                }
                AbstractC0179eu.m1450c(g22Var2, (in0) obj2, go0Var);
                boolean zM1984h4 = go0Var.m1984h(d22Var2);
                Object objM1956L6 = go0Var.m1956L();
                Object obj3 = objM1956L6;
                if (zM1984h4 || objM1956L6 == c0160eb) {
                    C0003a2 c0003a2 = new C0003a2(d22Var2, null, 5);
                    go0Var.m1981f0(c0003a2);
                    obj3 = c0003a2;
                }
                AbstractC0179eu.m1456f(go0Var, (mn0) obj3, d22Var2);
                boolean zM1984h5 = go0Var.m1984h(d22Var2);
                Object objM1956L7 = go0Var.m1956L();
                Object obj4 = objM1956L7;
                if (zM1984h5 || objM1956L7 == c0160eb) {
                    C0417la c0417la = new C0417la(d22Var2, 0);
                    go0Var.m1981f0(c0417la);
                    obj4 = c0417la;
                }
                uh1 uh1VarM5053E = t11.m5053E(rh1.f9587a, (in0) obj4);
                boolean zM1984h6 = go0Var.m1984h(d22Var2) | go0Var.m1976d(d61Var.ordinal());
                Object objM1956L8 = go0Var.m1956L();
                Object obj5 = objM1956L8;
                if (zM1984h6 || objM1956L8 == c0160eb) {
                    C0454ma c0454ma = new C0454ma(d22Var2, d61Var);
                    go0Var.m1981f0(c0454ma);
                    obj5 = c0454ma;
                }
                nf1 nf1Var = (nf1) obj5;
                int iHashCode = Long.hashCode(go0Var.f3614T);
                yy1 yy1VarM1990l = go0Var.m1990l();
                uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM5053E);
                InterfaceC0293hx.f4166c.getClass();
                C0367jy c0367jy = C0256gx.f3727b;
                go0Var.m1969Z();
                if (go0Var.f3613S) {
                    go0Var.m1989k(c0367jy);
                } else {
                    go0Var.m1987i0();
                }
                yf3.m6268c(go0Var, C0256gx.f3730e, nf1Var);
                yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
                yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
                yf3.m6267b(go0Var, C0256gx.f3732g);
                yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
                go0Var.m1994p(z);
                xm0Var3 = xm0Var4;
            }
            b62VarM1996r = go0Var.m1996r();
            if (b62VarM1996r == null) {
                b62VarM1996r.f616d = new C0491na(g22Var2, xm0Var3, h22Var, c0402kw, i, i2);
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
        if (go0Var.m1958O(i3 & 1, (i3 & 1171) == 1170)) {
        }
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r == null) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m3832b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
