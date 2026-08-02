package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class qe3 extends ye3 {
    public static boolean n = false;
    public static Method o;
    public static Class p;
    public static Field q;
    public static Field r;
    public final WindowInsets c;
    public zz0[] d;
    public zz0 e;
    public cf3 f;
    public zz0 g;
    public int h;
    public y90 i;
    public int j;
    public int k;
    public Rect[][] l;
    public Rect[][] m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qe3(cf3 cf3Var, WindowInsets windowInsets) {
        super(cf3Var);
        this.e = null;
        this.l = new Rect[10][];
        this.m = new Rect[10][];
        this.c = windowInsets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private y90 D(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.t()) {
            return y90.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        eb2 eb2VarX = gf1.x(display, 0);
        eb2 eb2VarX2 = gf1.x(display, 1);
        eb2 eb2VarX3 = gf1.x(display, 2);
        eb2 eb2VarX4 = gf1.x(display, 3);
        return y90.a(point.x, point.y, false, eb2VarX != null ? eb2VarX.b : 0, eb2VarX2 != null ? eb2VarX2.b : 0, eb2VarX3 != null ? eb2VarX3.b : 0, eb2VarX4 != null ? eb2VarX4.b : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static List<Rect> E(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[ze3.a(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Rect[] F(zz0 zz0Var) {
        ArrayList arrayList = new ArrayList();
        int i = zz0Var.a;
        int i2 = zz0Var.d;
        int i3 = zz0Var.c;
        int i4 = zz0Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, zz0Var.a, this.j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.k, i4));
        }
        if (i3 != 0) {
            int i5 = this.k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
        }
        if (i2 != 0) {
            int i6 = this.j;
            arrayList.add(new Rect(0, i6 - i2, this.k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"WrongConstant"})
    private zz0 G(int i, boolean z) {
        zz0 zz0VarA = zz0.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                zz0VarA = zz0.a(zz0VarA, H(i2, z));
            }
        }
        return zz0VarA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private zz0 I() {
        cf3 cf3Var = this.f;
        return cf3Var != null ? cf3Var.a.l() : zz0.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private zz0 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            c80.t("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!n) {
            L();
        }
        Method method = o;
        if (method != null && p != null && q != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) q.get(r.get(objInvoke));
                if (rect != null) {
                    return zz0.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"PrivateApi"})
    private static void L() {
        try {
            o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            p = cls;
            q = cls.getDeclaredField("mVisibleInsets");
            r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            q.setAccessible(true);
            r.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        n = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean M(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public void A(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public void C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.m = (Rect[][]) rectArr.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zz0 H(int i, boolean z) {
        zz0 zz0VarL;
        int i2;
        zz0 zz0Var = zz0.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    zz0[] zz0VarArr = this.d;
                    zz0VarL = zz0VarArr != null ? zz0VarArr[ze3.a(8)] : null;
                    if (zz0VarL != null) {
                        return zz0VarL;
                    }
                    zz0 zz0VarN = n();
                    zz0 zz0VarI = I();
                    int i3 = zz0VarN.d;
                    if (i3 > zz0VarI.d) {
                        return zz0.b(0, 0, 0, i3);
                    }
                    zz0 zz0Var2 = this.g;
                    if (zz0Var2 != null && !zz0Var2.equals(zz0Var) && (i2 = this.g.d) > zz0VarI.d) {
                        return zz0.b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return m();
                    }
                    if (i == 32) {
                        return k();
                    }
                    if (i == 64) {
                        return o();
                    }
                    if (i == 128) {
                        cf3 cf3Var = this.f;
                        t90 t90VarH = cf3Var != null ? cf3Var.a.h() : h();
                        if (t90VarH != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return zz0.b(i4 >= 28 ? s90.e(t90VarH.a) : 0, i4 >= 28 ? s90.g(t90VarH.a) : 0, i4 >= 28 ? s90.f(t90VarH.a) : 0, i4 >= 28 ? s90.d(t90VarH.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    zz0 zz0VarI2 = I();
                    zz0 zz0VarL2 = l();
                    return zz0.b(Math.max(zz0VarI2.a, zz0VarL2.a), 0, Math.max(zz0VarI2.c, zz0VarL2.c), Math.max(zz0VarI2.d, zz0VarL2.d));
                }
                if ((this.h & 2) == 0) {
                    zz0 zz0VarN2 = n();
                    cf3 cf3Var2 = this.f;
                    zz0VarL = cf3Var2 != null ? cf3Var2.a.l() : null;
                    int iMin = zz0VarN2.d;
                    if (zz0VarL != null) {
                        iMin = Math.min(iMin, zz0VarL.d);
                    }
                    return zz0.b(zz0VarN2.a, 0, zz0VarN2.c, iMin);
                }
            }
        } else {
            if (z) {
                return zz0.b(0, Math.max(I().b, n().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return zz0.b(0, n().b, 0, 0);
            }
        }
        return zz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean K(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !H(i, false).equals(zz0.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public void d(View view) {
        this.k = view.getWidth();
        this.j = view.getHeight();
        zz0 zz0VarJ = J(view);
        if (zz0VarJ == null) {
            zz0VarJ = zz0.e;
        }
        x(zz0VarJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public void e(cf3 cf3Var) {
        cf3Var.a.y(this.f);
        zz0 zz0Var = this.g;
        ye3 ye3Var = cf3Var.a;
        ye3Var.x(zz0Var);
        ye3Var.A(this.h);
        ye3Var.v(this.i);
        ye3Var.B(this.l);
        ye3Var.C(this.m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        qe3 qe3Var = (qe3) obj;
        return Objects.equals(this.g, qe3Var.g) && M(this.h, qe3Var.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public List<Rect> f(int i) {
        return E(this.l, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public List<Rect> g(int i) {
        return E(this.m, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public zz0 i(int i) {
        return G(i, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public zz0 j(int i) {
        return G(i, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public final zz0 n() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = zz0.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public void p(View view) {
        this.i = D(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    @SuppressLint({"WrongConstant"})
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iA = ze3.a(i);
            this.l[iA] = F(i(i));
            if (i != 8) {
                this.m[iA] = F(j(i));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public cf3 r(int i, int i2, int i3, int i4) {
        cf3 cf3VarC = cf3.c(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        pe3 oe3Var = i5 >= 36 ? new oe3(cf3VarC) : i5 >= 35 ? new ne3(cf3VarC) : i5 >= 34 ? new me3(cf3VarC) : i5 >= 31 ? new le3(cf3VarC) : i5 >= 30 ? new ke3(cf3VarC) : i5 >= 29 ? new je3(cf3VarC) : new he3(cf3VarC);
        oe3Var.h(cf3.a(n(), i, i2, i3, i4));
        oe3Var.f(cf3.a(l(), i, i2, i3, i4));
        return oe3Var.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public boolean t() {
        return this.c.isRound();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    @SuppressLint({"WrongConstant"})
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !K(i2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public void v(y90 y90Var) {
        this.i = y90Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public void w(zz0[] zz0VarArr) {
        this.d = zz0VarArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public void x(zz0 zz0Var) {
        this.g = zz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ye3
    public void y(cf3 cf3Var) {
        this.f = cf3Var;
    }

    public qe3(cf3 cf3Var, qe3 qe3Var) {
        this(cf3Var, new WindowInsets(qe3Var.c));
    }
}
