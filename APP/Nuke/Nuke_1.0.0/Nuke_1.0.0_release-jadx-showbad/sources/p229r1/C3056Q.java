package p229r1;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1925g;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p205n1.C2688b;
import p212o1.AbstractC2768a;

/* JADX INFO: renamed from: r1.Q */
/* JADX INFO: loaded from: classes.dex */
public class C3056Q extends C3064Z {

    /* JADX INFO: renamed from: n */
    public static boolean f9753n;

    /* JADX INFO: renamed from: o */
    public static Method f9754o;

    /* JADX INFO: renamed from: p */
    public static Class f9755p;

    /* JADX INFO: renamed from: q */
    public static Field f9756q;

    /* JADX INFO: renamed from: r */
    public static Field f9757r;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f9758c;

    /* JADX INFO: renamed from: d */
    public C2688b[] f9759d;

    /* JADX INFO: renamed from: e */
    public C2688b f9760e;

    /* JADX INFO: renamed from: f */
    public C3070c0 f9761f;

    /* JADX INFO: renamed from: g */
    public C2688b f9762g;

    /* JADX INFO: renamed from: h */
    public int f9763h;

    /* JADX INFO: renamed from: i */
    public C3075f f9764i;

    /* JADX INFO: renamed from: j */
    public int f9765j;

    /* JADX INFO: renamed from: k */
    public int f9766k;

    /* JADX INFO: renamed from: l */
    public Rect[][] f9767l;

    /* JADX INFO: renamed from: m */
    public Rect[][] f9768m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3056Q(C3070c0 c3070c0, WindowInsets windowInsets) {
        super(c3070c0);
        this.f9760e = null;
        this.f9767l = new Rect[10][];
        this.f9768m = new Rect[10][];
        this.f9758c = windowInsets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    private C3075f m5350D(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f9776a.f9782a.mo5373t()) {
            return C3075f.m5397a(point.x, point.y, true, 0, 0, 0, 0);
        }
        C3083m c3083mM3433n = AbstractC1922d.m3433n(display, 0);
        C3083m c3083mM3433n2 = AbstractC1922d.m3433n(display, 1);
        C3083m c3083mM3433n3 = AbstractC1922d.m3433n(display, 2);
        C3083m c3083mM3433n4 = AbstractC1922d.m3433n(display, 3);
        return C3075f.m5397a(point.x, point.y, false, c3083mM3433n != null ? c3083mM3433n.f9800b : 0, c3083mM3433n2 != null ? c3083mM3433n2.f9800b : 0, c3083mM3433n3 != null ? c3083mM3433n3.f9800b : 0, c3083mM3433n4 != null ? c3083mM3433n4.f9800b : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    private static List<Rect> m5351E(Rect[][] rectArr, int i5) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i6 = 1; i6 <= 512; i6 <<= 1) {
            if ((i5 & i6) != 0 && (rectArr2 = rectArr[AbstractC1925g.m3545v(i6)]) != null) {
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
    /* JADX INFO: renamed from: F */
    private Rect[] m5352F(C2688b c2688b) {
        ArrayList arrayList = new ArrayList();
        int i5 = c2688b.f8572a;
        int i6 = c2688b.f8575d;
        int i7 = c2688b.f8574c;
        int i8 = c2688b.f8573b;
        if (i5 != 0) {
            arrayList.add(new Rect(0, 0, c2688b.f8572a, this.f9765j));
        }
        if (i8 != 0) {
            arrayList.add(new Rect(0, 0, this.f9766k, i8));
        }
        if (i7 != 0) {
            int i9 = this.f9766k;
            arrayList.add(new Rect(i9 - i7, 0, i9, this.f9765j));
        }
        if (i6 != 0) {
            int i10 = this.f9765j;
            arrayList.add(new Rect(0, i10 - i6, this.f9766k, i10));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: G */
    private C2688b m5353G(int i5, boolean z5) {
        C2688b c2688bM4666a = C2688b.f8571e;
        for (int i6 = 1; i6 <= 512; i6 <<= 1) {
            if ((i5 & i6) != 0) {
                c2688bM4666a = C2688b.m4666a(c2688bM4666a, m5361H(i6, z5));
            }
        }
        return c2688bM4666a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    private C2688b m5354I() {
        C3070c0 c3070c0 = this.f9761f;
        return c3070c0 != null ? c3070c0.f9782a.mo5381l() : C2688b.f8571e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    private C2688b m5355J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f9753n) {
            m5356L();
        }
        Method method = f9754o;
        if (method != null && f9755p != null && f9756q != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f9756q.get(f9757r.get(objInvoke));
                if (rect != null) {
                    return C2688b.m4667b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e5) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: L */
    private static void m5356L() {
        try {
            f9754o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f9755p = cls;
            f9756q = cls.getDeclaredField("mVisibleInsets");
            f9757r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f9756q.setAccessible(true);
            f9757r.setAccessible(true);
        } catch (ReflectiveOperationException e5) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
        }
        f9753n = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static boolean m5357M(int i5, int i6) {
        return (i5 & 6) == (i6 & 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: A */
    public void mo5358A(int i5) {
        this.f9763h = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: B */
    public void mo5359B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f9767l = (Rect[][]) rectArr.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: C */
    public void mo5360C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f9768m = (Rect[][]) rectArr.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public C2688b m5361H(int i5, boolean z5) {
        C2688b c2688bMo5381l;
        int i6;
        C2688b c2688b = C2688b.f8571e;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 8) {
                    C2688b[] c2688bArr = this.f9759d;
                    c2688bMo5381l = c2688bArr != null ? c2688bArr[AbstractC1925g.m3545v(8)] : null;
                    if (c2688bMo5381l != null) {
                        return c2688bMo5381l;
                    }
                    C2688b c2688bMo5369n = mo5369n();
                    C2688b c2688bM5354I = m5354I();
                    int i7 = c2688bMo5369n.f8575d;
                    if (i7 > c2688bM5354I.f8575d) {
                        return C2688b.m4667b(0, 0, 0, i7);
                    }
                    C2688b c2688b2 = this.f9762g;
                    if (c2688b2 != null && !c2688b2.equals(c2688b) && (i6 = this.f9762g.f8575d) > c2688bM5354I.f8575d) {
                        return C2688b.m4667b(0, 0, 0, i6);
                    }
                } else {
                    if (i5 == 16) {
                        return mo5387m();
                    }
                    if (i5 == 32) {
                        return mo5386k();
                    }
                    if (i5 == 64) {
                        return mo5388o();
                    }
                    if (i5 == 128) {
                        C3070c0 c3070c0 = this.f9761f;
                        C3071d c3071dMo5385h = c3070c0 != null ? c3070c0.f9782a.mo5385h() : mo5385h();
                        if (c3071dMo5385h != null) {
                            int i8 = Build.VERSION.SDK_INT;
                            return C2688b.m4667b(i8 >= 28 ? AbstractC2768a.m4960e(c3071dMo5385h.f9783a) : 0, i8 >= 28 ? AbstractC2768a.m4962g(c3071dMo5385h.f9783a) : 0, i8 >= 28 ? AbstractC2768a.m4961f(c3071dMo5385h.f9783a) : 0, i8 >= 28 ? AbstractC2768a.m4959d(c3071dMo5385h.f9783a) : 0);
                        }
                    }
                }
            } else {
                if (z5) {
                    C2688b c2688bM5354I2 = m5354I();
                    C2688b c2688bMo5381l2 = mo5381l();
                    return C2688b.m4667b(Math.max(c2688bM5354I2.f8572a, c2688bMo5381l2.f8572a), 0, Math.max(c2688bM5354I2.f8574c, c2688bMo5381l2.f8574c), Math.max(c2688bM5354I2.f8575d, c2688bMo5381l2.f8575d));
                }
                if ((this.f9763h & 2) == 0) {
                    C2688b c2688bMo5369n2 = mo5369n();
                    C3070c0 c3070c02 = this.f9761f;
                    c2688bMo5381l = c3070c02 != null ? c3070c02.f9782a.mo5381l() : null;
                    int iMin = c2688bMo5369n2.f8575d;
                    if (c2688bMo5381l != null) {
                        iMin = Math.min(iMin, c2688bMo5381l.f8575d);
                    }
                    return C2688b.m4667b(c2688bMo5369n2.f8572a, 0, c2688bMo5369n2.f8574c, iMin);
                }
            }
        } else {
            if (z5) {
                return C2688b.m4667b(0, Math.max(m5354I().f8573b, mo5369n().f8573b), 0, 0);
            }
            if ((this.f9763h & 4) == 0) {
                return C2688b.m4667b(0, mo5369n().f8573b, 0, 0);
            }
        }
        return c2688b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public boolean m5362K(int i5) {
        if (i5 != 1 && i5 != 2) {
            if (i5 == 4) {
                return false;
            }
            if (i5 != 8 && i5 != 128) {
                return true;
            }
        }
        return !m5361H(i5, false).equals(C2688b.f8571e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: d */
    public void mo5363d(View view) {
        this.f9766k = view.getWidth();
        this.f9765j = view.getHeight();
        C2688b c2688bM5355J = m5355J(view);
        if (c2688bM5355J == null) {
            c2688bM5355J = C2688b.f8571e;
        }
        mo5377x(c2688bM5355J);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: e */
    public void mo5364e(C3070c0 c3070c0) {
        c3070c0.f9782a.mo5378y(this.f9761f);
        C2688b c2688b = this.f9762g;
        C3064Z c3064z = c3070c0.f9782a;
        c3064z.mo5377x(c2688b);
        c3064z.mo5358A(this.f9763h);
        c3064z.mo5375v(this.f9764i);
        c3064z.mo5359B(this.f9767l);
        c3064z.mo5360C(this.f9768m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        C3056Q c3056q = (C3056Q) obj;
        return Objects.equals(this.f9762g, c3056q.f9762g) && m5357M(this.f9763h, c3056q.f9763h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: f */
    public List<Rect> mo5365f(int i5) {
        return m5351E(this.f9767l, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: g */
    public List<Rect> mo5366g(int i5) {
        return m5351E(this.f9768m, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: i */
    public C2688b mo5367i(int i5) {
        return m5353G(i5, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: j */
    public C2688b mo5368j(int i5) {
        return m5353G(i5, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: n */
    public final C2688b mo5369n() {
        if (this.f9760e == null) {
            WindowInsets windowInsets = this.f9758c;
            this.f9760e = C2688b.m4667b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f9760e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: p */
    public void mo5370p(View view) {
        this.f9764i = m5350D(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: q */
    public void mo5371q() {
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            int iM3545v = AbstractC1925g.m3545v(i5);
            this.f9767l[iM3545v] = m5352F(mo5367i(i5));
            if (i5 != 8) {
                this.f9768m[iM3545v] = m5352F(mo5368j(i5));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: r */
    public C3070c0 mo5372r(int i5, int i6, int i7, int i8) {
        C3070c0 c3070c0M5393c = C3070c0.m5393c(null, this.f9758c);
        int i9 = Build.VERSION.SDK_INT;
        AbstractC3055P c3054o = i9 >= 36 ? new C3054O(c3070c0M5393c) : i9 >= 35 ? new C3053N(c3070c0M5393c) : i9 >= 34 ? new C3052M(c3070c0M5393c) : i9 >= 31 ? new C3051L(c3070c0M5393c) : i9 >= 30 ? new C3050K(c3070c0M5393c) : i9 >= 29 ? new C3048I(c3070c0M5393c) : new C3047H(c3070c0M5393c);
        c3054o.mo5324h(C3070c0.m5392a(mo5369n(), i5, i6, i7, i8));
        c3054o.mo5323f(C3070c0.m5392a(mo5381l(), i5, i6, i7, i8));
        return c3054o.mo5322b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: t */
    public boolean mo5373t() {
        return this.f9758c.isRound();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: u */
    public boolean mo5374u(int i5) {
        for (int i6 = 1; i6 <= 512; i6 <<= 1) {
            if ((i5 & i6) != 0 && !m5362K(i6)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: v */
    public void mo5375v(C3075f c3075f) {
        this.f9764i = c3075f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: w */
    public void mo5376w(C2688b[] c2688bArr) {
        this.f9759d = c2688bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: x */
    public void mo5377x(C2688b c2688b) {
        this.f9762g = c2688b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: y */
    public void mo5378y(C3070c0 c3070c0) {
        this.f9761f = c3070c0;
    }

    public C3056Q(C3070c0 c3070c0, C3056Q c3056q) {
        this(c3070c0, new WindowInsets(c3056q.f9758c));
    }
}
