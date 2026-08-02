package p000;

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

    /* JADX INFO: renamed from: n */
    public static boolean f8933n = false;

    /* JADX INFO: renamed from: o */
    public static Method f8934o;

    /* JADX INFO: renamed from: p */
    public static Class f8935p;

    /* JADX INFO: renamed from: q */
    public static Field f8936q;

    /* JADX INFO: renamed from: r */
    public static Field f8937r;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f8938c;

    /* JADX INFO: renamed from: d */
    public zz0[] f8939d;

    /* JADX INFO: renamed from: e */
    public zz0 f8940e;

    /* JADX INFO: renamed from: f */
    public cf3 f8941f;

    /* JADX INFO: renamed from: g */
    public zz0 f8942g;

    /* JADX INFO: renamed from: h */
    public int f8943h;

    /* JADX INFO: renamed from: i */
    public y90 f8944i;

    /* JADX INFO: renamed from: j */
    public int f8945j;

    /* JADX INFO: renamed from: k */
    public int f8946k;

    /* JADX INFO: renamed from: l */
    public Rect[][] f8947l;

    /* JADX INFO: renamed from: m */
    public Rect[][] f8948m;

    public qe3(cf3 cf3Var, WindowInsets windowInsets) {
        super(cf3Var);
        this.f8940e = null;
        this.f8947l = new Rect[10][];
        this.f8948m = new Rect[10][];
        this.f8938c = windowInsets;
    }

    /* JADX INFO: renamed from: D */
    private y90 m4148D(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f13432a.f1518a.mo4171t()) {
            return y90.m6236a(point.x, point.y, true, 0, 0, 0, 0);
        }
        eb2 eb2VarM1906x = gf1.m1906x(display, 0);
        eb2 eb2VarM1906x2 = gf1.m1906x(display, 1);
        eb2 eb2VarM1906x3 = gf1.m1906x(display, 2);
        eb2 eb2VarM1906x4 = gf1.m1906x(display, 3);
        return y90.m6236a(point.x, point.y, false, eb2VarM1906x != null ? eb2VarM1906x.f2382b : 0, eb2VarM1906x2 != null ? eb2VarM1906x2.f2382b : 0, eb2VarM1906x3 != null ? eb2VarM1906x3.f2382b : 0, eb2VarM1906x4 != null ? eb2VarM1906x4.f2382b : 0);
    }

    /* JADX INFO: renamed from: E */
    private static List<Rect> m4149E(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[ze3.m6409a(i2)]) != null) {
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

    /* JADX INFO: renamed from: F */
    private Rect[] m4150F(zz0 zz0Var) {
        ArrayList arrayList = new ArrayList();
        int i = zz0Var.f14157a;
        int i2 = zz0Var.f14160d;
        int i3 = zz0Var.f14159c;
        int i4 = zz0Var.f14158b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, zz0Var.f14157a, this.f8945j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.f8946k, i4));
        }
        if (i3 != 0) {
            int i5 = this.f8946k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.f8945j));
        }
        if (i2 != 0) {
            int i6 = this.f8945j;
            arrayList.add(new Rect(0, i6 - i2, this.f8946k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: G */
    private zz0 m4151G(int i, boolean z) {
        zz0 zz0VarM6517a = zz0.f14156e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                zz0VarM6517a = zz0.m6517a(zz0VarM6517a, m4159H(i2, z));
            }
        }
        return zz0VarM6517a;
    }

    /* JADX INFO: renamed from: I */
    private zz0 m4152I() {
        cf3 cf3Var = this.f8941f;
        return cf3Var != null ? cf3Var.f1518a.mo4441l() : zz0.f14156e;
    }

    /* JADX INFO: renamed from: J */
    private zz0 m4153J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            c80.m676t("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!f8933n) {
            m4154L();
        }
        Method method = f8934o;
        if (method != null && f8935p != null && f8936q != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f8936q.get(f8937r.get(objInvoke));
                if (rect != null) {
                    return zz0.m6518b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: L */
    private static void m4154L() {
        try {
            f8934o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f8935p = cls;
            f8936q = cls.getDeclaredField("mVisibleInsets");
            f8937r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f8936q.setAccessible(true);
            f8937r.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f8933n = true;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m4155M(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: A */
    public void mo4156A(int i) {
        this.f8943h = i;
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: B */
    public void mo4157B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f8947l = (Rect[][]) rectArr.clone();
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: C */
    public void mo4158C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f8948m = (Rect[][]) rectArr.clone();
    }

    /* JADX INFO: renamed from: H */
    public zz0 m4159H(int i, boolean z) {
        zz0 zz0VarMo4441l;
        int i2;
        zz0 zz0Var = zz0.f14156e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    zz0[] zz0VarArr = this.f8939d;
                    zz0VarMo4441l = zz0VarArr != null ? zz0VarArr[ze3.m6409a(8)] : null;
                    if (zz0VarMo4441l != null) {
                        return zz0VarMo4441l;
                    }
                    zz0 zz0VarMo4167n = mo4167n();
                    zz0 zz0VarM4152I = m4152I();
                    int i3 = zz0VarMo4167n.f14160d;
                    if (i3 > zz0VarM4152I.f14160d) {
                        return zz0.m6518b(0, 0, 0, i3);
                    }
                    zz0 zz0Var2 = this.f8942g;
                    if (zz0Var2 != null && !zz0Var2.equals(zz0Var) && (i2 = this.f8942g.f14160d) > zz0VarM4152I.f14160d) {
                        return zz0.m6518b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return mo5246m();
                    }
                    if (i == 32) {
                        return mo5245k();
                    }
                    if (i == 64) {
                        return mo5247o();
                    }
                    if (i == 128) {
                        cf3 cf3Var = this.f8941f;
                        t90 t90VarMo4858h = cf3Var != null ? cf3Var.f1518a.mo4858h() : mo4858h();
                        if (t90VarMo4858h != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return zz0.m6518b(i4 >= 28 ? s90.m4775e(t90VarMo4858h.f10619a) : 0, i4 >= 28 ? s90.m4777g(t90VarMo4858h.f10619a) : 0, i4 >= 28 ? s90.m4776f(t90VarMo4858h.f10619a) : 0, i4 >= 28 ? s90.m4774d(t90VarMo4858h.f10619a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    zz0 zz0VarM4152I2 = m4152I();
                    zz0 zz0VarMo4441l2 = mo4441l();
                    return zz0.m6518b(Math.max(zz0VarM4152I2.f14157a, zz0VarMo4441l2.f14157a), 0, Math.max(zz0VarM4152I2.f14159c, zz0VarMo4441l2.f14159c), Math.max(zz0VarM4152I2.f14160d, zz0VarMo4441l2.f14160d));
                }
                if ((this.f8943h & 2) == 0) {
                    zz0 zz0VarMo4167n2 = mo4167n();
                    cf3 cf3Var2 = this.f8941f;
                    zz0VarMo4441l = cf3Var2 != null ? cf3Var2.f1518a.mo4441l() : null;
                    int iMin = zz0VarMo4167n2.f14160d;
                    if (zz0VarMo4441l != null) {
                        iMin = Math.min(iMin, zz0VarMo4441l.f14160d);
                    }
                    return zz0.m6518b(zz0VarMo4167n2.f14157a, 0, zz0VarMo4167n2.f14159c, iMin);
                }
            }
        } else {
            if (z) {
                return zz0.m6518b(0, Math.max(m4152I().f14158b, mo4167n().f14158b), 0, 0);
            }
            if ((this.f8943h & 4) == 0) {
                return zz0.m6518b(0, mo4167n().f14158b, 0, 0);
            }
        }
        return zz0Var;
    }

    /* JADX INFO: renamed from: K */
    public boolean m4160K(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m4159H(i, false).equals(zz0.f14156e);
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: d */
    public void mo4161d(View view) {
        this.f8946k = view.getWidth();
        this.f8945j = view.getHeight();
        zz0 zz0VarM4153J = m4153J(view);
        if (zz0VarM4153J == null) {
            zz0VarM4153J = zz0.f14156e;
        }
        mo4175x(zz0VarM4153J);
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: e */
    public void mo4162e(cf3 cf3Var) {
        cf3Var.f1518a.mo4176y(this.f8941f);
        zz0 zz0Var = this.f8942g;
        ye3 ye3Var = cf3Var.f1518a;
        ye3Var.mo4175x(zz0Var);
        ye3Var.mo4156A(this.f8943h);
        ye3Var.mo4173v(this.f8944i);
        ye3Var.mo4157B(this.f8947l);
        ye3Var.mo4158C(this.f8948m);
    }

    @Override // p000.ye3
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        qe3 qe3Var = (qe3) obj;
        return Objects.equals(this.f8942g, qe3Var.f8942g) && m4155M(this.f8943h, qe3Var.f8943h);
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: f */
    public List<Rect> mo4163f(int i) {
        return m4149E(this.f8947l, i);
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: g */
    public List<Rect> mo4164g(int i) {
        return m4149E(this.f8948m, i);
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: i */
    public zz0 mo4165i(int i) {
        return m4151G(i, false);
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: j */
    public zz0 mo4166j(int i) {
        return m4151G(i, true);
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: n */
    public final zz0 mo4167n() {
        if (this.f8940e == null) {
            WindowInsets windowInsets = this.f8938c;
            this.f8940e = zz0.m6518b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f8940e;
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: p */
    public void mo4168p(View view) {
        this.f8944i = m4148D(view);
    }

    @Override // p000.ye3
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: q */
    public void mo4169q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iM6409a = ze3.m6409a(i);
            this.f8947l[iM6409a] = m4150F(mo4165i(i));
            if (i != 8) {
                this.f8948m[iM6409a] = m4150F(mo4166j(i));
            }
        }
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: r */
    public cf3 mo4170r(int i, int i2, int i3, int i4) {
        cf3 cf3VarM769c = cf3.m769c(null, this.f8938c);
        int i5 = Build.VERSION.SDK_INT;
        pe3 oe3Var = i5 >= 36 ? new oe3(cf3VarM769c) : i5 >= 35 ? new ne3(cf3VarM769c) : i5 >= 34 ? new me3(cf3VarM769c) : i5 >= 31 ? new le3(cf3VarM769c) : i5 >= 30 ? new ke3(cf3VarM769c) : i5 >= 29 ? new je3(cf3VarM769c) : new he3(cf3VarM769c);
        oe3Var.mo2152h(cf3.m768a(mo4167n(), i, i2, i3, i4));
        oe3Var.mo2151f(cf3.m768a(mo4441l(), i, i2, i3, i4));
        return oe3Var.mo2150b();
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: t */
    public boolean mo4171t() {
        return this.f8938c.isRound();
    }

    @Override // p000.ye3
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: u */
    public boolean mo4172u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !m4160K(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: v */
    public void mo4173v(y90 y90Var) {
        this.f8944i = y90Var;
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: w */
    public void mo4174w(zz0[] zz0VarArr) {
        this.f8939d = zz0VarArr;
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: x */
    public void mo4175x(zz0 zz0Var) {
        this.f8942g = zz0Var;
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: y */
    public void mo4176y(cf3 cf3Var) {
        this.f8941f = cf3Var;
    }

    public qe3(cf3 cf3Var, qe3 qe3Var) {
        this(cf3Var, new WindowInsets(qe3Var.f8938c));
    }
}
