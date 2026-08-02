package p000;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ci0 {

    /* JADX INFO: renamed from: a */
    public static volatile ExecutorService f1545a;

    /* JADX INFO: renamed from: h */
    public static final C0402kw f1552h;

    /* JADX INFO: renamed from: l */
    public static final C0402kw f1556l;

    /* JADX INFO: renamed from: x */
    public static final C0270ha f1568x;

    /* JADX INFO: renamed from: y */
    public static final b23 f1569y;

    /* JADX INFO: renamed from: z */
    public static final char[] f1570z;

    /* JADX INFO: renamed from: b */
    public static final int[] f1546b = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: c */
    public static final int[] f1547c = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: d */
    public static final int[] f1548d = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: e */
    public static final int[] f1549e = {R.attr.name, R.attr.pathData};

    /* JADX INFO: renamed from: f */
    public static final C0402kw f1550f = new C0402kw(-793224480, false, new C0920ye(3));

    /* JADX INFO: renamed from: g */
    public static final C0402kw f1551g = new C0402kw(-170430427, false, new C0920ye(14));

    /* JADX INFO: renamed from: i */
    public static final C0402kw f1553i = new C0402kw(408669589, false, new C0920ye(15));

    /* JADX INFO: renamed from: j */
    public static final C0402kw f1554j = new C0402kw(601600790, false, new C0920ye(16));

    /* JADX INFO: renamed from: k */
    public static final C0402kw f1555k = new C0402kw(-907257638, false, new C0920ye(4));

    /* JADX INFO: renamed from: m */
    public static final C0402kw f1557m = new C0402kw(-634806131, false, new C0920ye(6));

    /* JADX INFO: renamed from: n */
    public static final C0402kw f1558n = new C0402kw(1537998623, false, new C0920ye(7));

    /* JADX INFO: renamed from: o */
    public static final C0402kw f1559o = new C0402kw(-359254876, false, new C0920ye(8));

    /* JADX INFO: renamed from: p */
    public static final C0402kw f1560p = new C0402kw(-2730867, false, new C0920ye(9));

    /* JADX INFO: renamed from: q */
    public static final C0402kw f1561q = new C0402kw(-2103219128, false, new C0920ye(10));

    /* JADX INFO: renamed from: r */
    public static final C0402kw f1562r = new C0402kw(1440199015, false, new C0920ye(11));

    /* JADX INFO: renamed from: s */
    public static final C0402kw f1563s = new C0402kw(1587835904, false, new C0920ye(12));

    /* JADX INFO: renamed from: t */
    public static final C0402kw f1564t = new C0402kw(1712782185, false, new C0920ye(13));

    /* JADX INFO: renamed from: u */
    public static final Class[] f1565u = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: v */
    public static final hh1 f1566v = new hh1(19, "NO_OWNER");

    /* JADX INFO: renamed from: w */
    public static final C0270ha f1567w = new C0270ha(1000);

    static {
        int i = 5;
        f1552h = new C0402kw(469827654, false, new C0558ow(i));
        f1556l = new C0402kw(-2093624668, false, new C0920ye(i));
        new C0270ha(1007);
        f1568x = new C0270ha(1008);
        new C0270ha(1002);
        f1569y = new b23(0, new long[0], new Object[0]);
        f1570z = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    /* JADX INFO: renamed from: A */
    public static float m776A(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: B */
    public static double m777B(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    /* JADX INFO: renamed from: C */
    public static float m778C(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    /* JADX INFO: renamed from: D */
    public static int m779D(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* JADX INFO: renamed from: E */
    public static long m780E(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    /* JADX INFO: renamed from: F */
    public static final void m781F(int i, int i2) {
        if (i <= i2) {
            return;
        }
        um2.m5514d(i, i2, ") is greater than size (", "toIndex (");
    }

    /* JADX INFO: renamed from: G */
    public static fb3 m782G(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                c80.m663A("Cannot create an instance of ", cls);
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (fb3) objNewInstance;
            } catch (IllegalAccessException e) {
                c80.m671o("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                c80.m671o("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            c80.m671o("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r1.mo181m(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:50:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m783H(ak0 ak0Var, InterfaceC0212fq interfaceC0212fq, boolean z, t00 t00Var) throws Throwable {
        ck0 ck0Var;
        C0319in it;
        C0319in c0319in;
        ak0 ak0Var2;
        Object objM2373b;
        if (t00Var instanceof ck0) {
            ck0Var = (ck0) t00Var;
            int i = ck0Var.f1597p;
            if ((i & Integer.MIN_VALUE) != 0) {
                ck0Var.f1597p = i - Integer.MIN_VALUE;
            } else {
                ck0Var = new ck0(t00Var);
            }
        }
        Object obj = ck0Var.f1596o;
        int i2 = ck0Var.f1597p;
        CancellationException cancellationException = null;
        k20 k20Var = k20.f5323h;
        try {
            if (i2 == 0) {
                fg1.m1627T(obj);
                if (ak0Var instanceof i23) {
                    throw ((i23) ak0Var).f4244h;
                }
                it = interfaceC0212fq.iterator();
                ck0Var.f1592k = ak0Var;
                ck0Var.f1593l = interfaceC0212fq;
                ck0Var.f1594m = it;
                ck0Var.f1595n = z;
                ck0Var.f1597p = 1;
                objM2373b = it.m2373b(ck0Var);
                if (objM2373b != k20Var) {
                }
            } else if (i2 == 1) {
                z = ck0Var.f1595n;
                c0319in = ck0Var.f1594m;
                interfaceC0212fq = ck0Var.f1593l;
                ak0Var2 = ck0Var.f1592k;
                fg1.m1627T(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = ck0Var.f1595n;
                c0319in = ck0Var.f1594m;
                interfaceC0212fq = ck0Var.f1593l;
                ak0Var2 = ck0Var.f1592k;
                fg1.m1627T(obj);
                it = c0319in;
                ak0Var = ak0Var2;
                ck0Var.f1592k = ak0Var;
                ck0Var.f1593l = interfaceC0212fq;
                ck0Var.f1594m = it;
                ck0Var.f1595n = z;
                ck0Var.f1597p = 1;
                objM2373b = it.m2373b(ck0Var);
                if (objM2373b != k20Var) {
                    return k20Var;
                }
                ak0Var2 = ak0Var;
                c0319in = it;
                obj = objM2373b;
                if (((Boolean) obj).booleanValue()) {
                    if (z) {
                        interfaceC0212fq.mo1712c(null);
                    }
                    return a83.f116a;
                }
                Object objM2374c = c0319in.m2374c();
                ck0Var.f1592k = ak0Var2;
                ck0Var.f1593l = interfaceC0212fq;
                ck0Var.f1594m = c0319in;
                ck0Var.f1595n = z;
                ck0Var.f1597p = 2;
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: I */
    public static bh1 m784I(bh1 bh1Var, d61 d61Var, m13 m13Var, e70 e70Var, xl0 xl0Var) {
        if (bh1Var != null && d61Var == bh1Var.f855a && xe1.m6130k0(m13Var, d61Var).equals(bh1Var.f856b) && e70Var.mo693b() == bh1Var.f857c.f3880h && xl0Var == bh1Var.f858d) {
            return bh1Var;
        }
        bh1 bh1Var2 = bh1.f854h;
        if (bh1Var2 != null && d61Var == bh1Var2.f855a && xe1.m6130k0(m13Var, d61Var).equals(bh1Var2.f856b) && e70Var.mo693b() == bh1Var2.f857c.f3880h && xl0Var == bh1Var2.f858d) {
            return bh1Var2;
        }
        bh1 bh1Var3 = new bh1(d61Var, xe1.m6130k0(m13Var, d61Var), new h70(e70Var.mo693b(), e70Var.mo697m()), xl0Var);
        bh1.f854h = bh1Var3;
        return bh1Var3;
    }

    /* JADX INFO: renamed from: J */
    public static Executor m785J() {
        if (f1545a == null) {
            synchronized (ci0.class) {
                try {
                    if (f1545a == null) {
                        f1545a = Executors.newCachedThreadPool();
                    }
                } finally {
                }
            }
        }
        return f1545a;
    }

    /* JADX INFO: renamed from: K */
    public static final Bundle m786K(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        C0676s.m4651j(vi0.m5691j("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static final c92 m787L(y03 y03Var, int i) {
        x03 x03Var = y03Var.f13266a;
        lj1 lj1Var = y03Var.f13267b;
        if (x03Var.f12754a.f10051i.length() != 0) {
            int iM2917d = lj1Var.m2917d(i);
            if ((i != 0 && iM2917d == lj1Var.m2917d(i - 1)) || (i != x03Var.f12754a.f10051i.length() && iM2917d == lj1Var.m2917d(i + 1))) {
                return y03Var.m6201a(i);
            }
        }
        return y03Var.m6207g(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public static final void m788M(mc0 mc0Var) {
        if (((th1) mc0Var).f10757h.f10770u) {
            sp0.m4927Z(mc0Var, 1).m6457Z0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m789N(gx2 gx2Var) {
        gx2Var.getClass();
        if (gx2Var.f11985a) {
            pp1 pp1Var = pp1.f8445a;
            if (!pp1.m3931c().m3604a(gx2Var.mo9d(), true)) {
                pp1 pp1Var2 = pp1.f8445a;
                if (!pp1.m3931c().m3604a(gx2Var.mo9d(), false)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m790O(String str, int i, int i2) {
        str.getClass();
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && ug3.m5503k(str.charAt(i + 1)) != -1 && ug3.m5503k(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: P */
    public static js0 m791P(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            C0676s.m4651j("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr3[i2] == null) {
                C0676s.m4651j("Headers cannot be null");
                return null;
            }
            strArr3[i2] = pv2.m3993I0(strArr2[i2]).toString();
        }
        int iM3693C = p40.m3693C(0, strArr3.length - 1, 2);
        if (iM3693C >= 0) {
            while (true) {
                String str = strArr3[i];
                String str2 = strArr3[i + 1];
                n93.m3262c(str);
                n93.m3263d(str2, str);
                if (i == iM3693C) {
                    break;
                }
                i += 2;
            }
        }
        return new js0(strArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0550oo m792Q(js0 js0Var) {
        int i;
        int i2;
        int i3;
        String string;
        js0 js0Var2 = js0Var;
        js0Var2.getClass();
        int size = js0Var2.size();
        int i4 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iM5505m = -1;
        int iM5505m2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iM5505m3 = -1;
        int iM5505m4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i4 < size) {
            String strM2558b = js0Var2.m2558b(i4);
            String strM2560d = js0Var2.m2560d(i4);
            if (strM2558b.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strM2560d;
                }
                i = 0;
                while (i < strM2560d.length()) {
                    int length = strM2560d.length();
                    int length2 = i;
                    while (true) {
                        if (length2 >= length) {
                            i2 = size;
                            length2 = strM2560d.length();
                            break;
                        }
                        i2 = size;
                        if (pv2.m3996i0("=,;", strM2560d.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i2;
                    }
                    String string2 = pv2.m3993I0(strM2560d.substring(i, length2)).toString();
                    if (length2 == strM2560d.length() || strM2560d.charAt(length2) == ',' || strM2560d.charAt(length2) == ';') {
                        i3 = length2 + 1;
                        string = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = ug3.f11300a;
                        int length4 = strM2560d.length();
                        while (true) {
                            if (length3 < length4) {
                                char cCharAt = strM2560d.charAt(length3);
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                            } else {
                                length3 = strM2560d.length();
                                break;
                            }
                        }
                        if (length3 >= strM2560d.length() || strM2560d.charAt(length3) != '\"') {
                            int length5 = strM2560d.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strM2560d.length();
                                    break;
                                }
                                int i5 = length5;
                                if (pv2.m3996i0(",;", strM2560d.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i5;
                            }
                            int i6 = length6;
                            string = pv2.m3993I0(strM2560d.substring(length3, length6)).toString();
                            i3 = i6;
                        } else {
                            int i7 = length3 + 1;
                            int iM4003p0 = pv2.m4003p0(strM2560d, '\"', i7, 4);
                            string = strM2560d.substring(i7, iM4003p0);
                            i3 = iM4003p0 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string2)) {
                        i = i3;
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(string2)) {
                        i = i3;
                        z3 = true;
                    } else {
                        if ("max-age".equalsIgnoreCase(string2)) {
                            iM5505m = ug3.m5505m(string, -1);
                        } else if ("s-maxage".equalsIgnoreCase(string2)) {
                            iM5505m2 = ug3.m5505m(string, -1);
                        } else if ("private".equalsIgnoreCase(string2)) {
                            i = i3;
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(string2)) {
                            i = i3;
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(string2)) {
                            i = i3;
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(string2)) {
                            iM5505m3 = ug3.m5505m(string, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(string2)) {
                            iM5505m4 = ug3.m5505m(string, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(string2)) {
                            i = i3;
                            z7 = true;
                        } else if ("no-transform".equalsIgnoreCase(string2)) {
                            i = i3;
                            z8 = true;
                        } else if ("immutable".equalsIgnoreCase(string2)) {
                            i = i3;
                            z9 = true;
                        }
                        i = i3;
                    }
                    size = i2;
                }
                i4++;
                js0Var2 = js0Var;
                size = size;
            } else if (!strM2558b.equalsIgnoreCase("Pragma")) {
                i4++;
                js0Var2 = js0Var;
                size = size;
            }
            z = false;
            i = 0;
            while (i < strM2560d.length()) {
            }
            i4++;
            js0Var2 = js0Var;
            size = size;
        }
        return new C0550oo(z2, z3, iM5505m, iM5505m2, z4, z5, z6, iM5505m3, iM5505m4, z7, z8, z9, !z ? null : str);
    }

    /* JADX INFO: renamed from: R */
    public static String m793R(String str, int i, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C0209fn c0209fn = new C0209fn();
                c0209fn.m1676K(str, i, iCharCount);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iM5503k = ug3.m5503k(str.charAt(iCharCount + 1));
                        int iM5503k2 = ug3.m5503k(str.charAt(i4));
                        if (iM5503k == -1 || iM5503k2 == -1) {
                            c0209fn.m1677L(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c0209fn.m1670E((iM5503k << 4) + iM5503k2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        c0209fn.m1670E(32);
                        iCharCount++;
                    } else {
                        c0209fn.m1677L(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c0209fn.m1692u();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: S */
    public static final long m794S(oy0 oy0Var, qv1 qv1Var, ny0 ny0Var, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = oy0Var.f7881g;
        if (qv1Var != null) {
            int i = ny0Var.f7366a;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (qv1Var == qv1.f9206i) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jM4611d = rs1.m4611d(m795T(oy0Var, qv1Var, ny0Var), j2);
        if (z || !oy0Var.f7883i) {
            return jM4611d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: T */
    public static final long m795T(oy0 oy0Var, qv1 qv1Var, ny0 ny0Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (qv1Var == null) {
            return oy0Var.f7877c;
        }
        int i = ny0Var.f7366a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (oy0Var.f7877c >> 32));
        } else {
            if (i != 2) {
                return oy0Var.f7877c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (oy0Var.f7877c & 4294967295L));
        }
        if (qv1Var == qv1.f9206i) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    /* JADX INFO: renamed from: U */
    public static final void m796U(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    /* JADX INFO: renamed from: V */
    public static final void m797V(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    /* JADX INFO: renamed from: W */
    public static a11 m798W(c11 c11Var, int i) {
        c11Var.getClass();
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = c11Var.f25h;
        int i3 = c11Var.f26i;
        if (c11Var.f27j <= 0) {
            i = -i;
        }
        return new a11(i2, i3, i);
    }

    /* JADX INFO: renamed from: X */
    public static c11 m799X(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new c11(i, i2 - 1, 1);
        }
        c11 c11Var = c11.f1105k;
        return c11.f1105k;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m800a(f42 f42Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        m93 m93Var;
        boolean z;
        b62 b62VarM1996r;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-149765515);
        i11 i11Var = go0Var.f3639x;
        yy1 yy1VarM1990l = go0Var.m1990l();
        go0Var.m1964U(201, AbstractC0752tx.f10987b);
        Object objM1956L = go0Var.m1956L();
        if (t11.m5086l(objM1956L, C0520nx.f7360a)) {
            m93Var = null;
        } else {
            objM1956L.getClass();
            m93Var = (m93) objM1956L;
        }
        e42 e42Var = f42Var.f2787a;
        m93 m93VarM1253c = e42Var.m1253c(f42Var, m93Var);
        boolean zEquals = m93VarM1253c.equals(m93Var);
        if (!zEquals) {
            go0Var.m1981f0(m93VarM1253c);
        }
        if (!go0Var.f3613S) {
            pr2 pr2Var = go0Var.f3601G;
            Object objM3949b = pr2Var.m3949b(pr2Var.f8516b, pr2Var.f8521g);
            objM3949b.getClass();
            yy1 yy1Var = (yy1) objM3949b;
            if (!(go0Var.m1945A() && zEquals) && (f42Var.f2792f || !yy1VarM1990l.containsKey(e42Var))) {
                yy1VarM1990l = yy1VarM1990l.m6370d(e42Var, m93VarM1253c);
            } else if ((zEquals && !go0Var.f3638w) || !go0Var.f3638w) {
                yy1VarM1990l = yy1Var;
            }
            if (go0Var.f3640y || yy1Var != yy1VarM1990l) {
                z = true;
            }
            if (z && !go0Var.f3613S) {
                go0Var.m1954J(yy1VarM1990l);
            }
            i11Var.m2243c(go0Var.f3638w ? 1 : 0);
            go0Var.f3638w = z;
            go0Var.f3605K = yy1VarM1990l;
            go0Var.m1962S(202, 0, AbstractC0752tx.f10988c, yy1VarM1990l);
            c0402kw.mo12g(go0Var, Integer.valueOf((i >> 3) & 14));
            go0Var.m1994p(false);
            go0Var.m1994p(false);
            go0Var.f3638w = i11Var.m2242b() != 0;
            go0Var.f3605K = null;
            b62VarM1996r = go0Var.m1996r();
            if (b62VarM1996r == null) {
                b62VarM1996r.f616d = new C0781up(i, 2, f42Var, c0402kw);
                return;
            }
            return;
        }
        if (f42Var.f2792f || !yy1VarM1990l.containsKey(e42Var)) {
            yy1VarM1990l = yy1VarM1990l.m6370d(e42Var, m93VarM1253c);
        }
        go0Var.f3604J = true;
        z = false;
        if (z) {
            go0Var.m1954J(yy1VarM1990l);
        }
        i11Var.m2243c(go0Var.f3638w ? 1 : 0);
        go0Var.f3638w = z;
        go0Var.f3605K = yy1VarM1990l;
        go0Var.m1962S(202, 0, AbstractC0752tx.f10988c, yy1VarM1990l);
        c0402kw.mo12g(go0Var, Integer.valueOf((i >> 3) & 14));
        go0Var.m1994p(false);
        go0Var.m1994p(false);
        go0Var.f3638w = i11Var.m2242b() != 0;
        go0Var.f3605K = null;
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m801b(f42[] f42VarArr, mn0 mn0Var, InterfaceC0596px interfaceC0596px, int i) {
        yy1 yy1VarM6199d;
        boolean z;
        b62 b62VarM1996r;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(415205898);
        i11 i11Var = go0Var.f3639x;
        yy1 yy1VarM1990l = go0Var.m1990l();
        go0Var.m1964U(201, AbstractC0752tx.f10987b);
        boolean z2 = go0Var.f3613S;
        yt1 yt1Var = AbstractC0752tx.f10989d;
        if (z2) {
            yy1 yy1VarM3576B = op0.m3576B(f42VarArr, yy1VarM1990l, yy1.f13674k);
            yy1VarM1990l.getClass();
            xy1 xy1Var = new xy1(yy1VarM1990l);
            xy1Var.f13236n = yy1VarM1990l;
            xy1Var.putAll(yy1VarM3576B);
            yy1VarM6199d = xy1Var.mo608a();
            go0Var.m1964U(204, yt1Var);
            go0Var.m1948D();
            go0Var.m1983g0(yy1VarM6199d);
            go0Var.m1948D();
            go0Var.m1983g0(yy1VarM3576B);
            go0Var.m1994p(false);
            go0Var.f3604J = true;
        } else {
            pr2 pr2Var = go0Var.f3601G;
            Object objM3955h = pr2Var.m3955h(pr2Var.f8521g, 0);
            objM3955h.getClass();
            yy1 yy1Var = (yy1) objM3955h;
            pr2 pr2Var2 = go0Var.f3601G;
            Object objM3955h2 = pr2Var2.m3955h(pr2Var2.f8521g, 1);
            objM3955h2.getClass();
            yy1 yy1Var2 = (yy1) objM3955h2;
            yy1 yy1VarM3576B2 = op0.m3576B(f42VarArr, yy1VarM1990l, yy1Var2);
            if (!go0Var.m1945A() || go0Var.f3640y || !yy1Var2.equals(yy1VarM3576B2)) {
                yy1VarM1990l.getClass();
                xy1 xy1Var2 = new xy1(yy1VarM1990l);
                xy1Var2.f13236n = yy1VarM1990l;
                xy1Var2.putAll(yy1VarM3576B2);
                yy1VarM6199d = xy1Var2.mo608a();
                go0Var.m1964U(204, yt1Var);
                go0Var.m1948D();
                go0Var.m1983g0(yy1VarM6199d);
                go0Var.m1948D();
                go0Var.m1983g0(yy1VarM3576B2);
                go0Var.m1994p(false);
                if (go0Var.f3640y || !t11.m5086l(yy1VarM6199d, yy1Var)) {
                    z = true;
                }
                if (z && !go0Var.f3613S) {
                    go0Var.m1954J(yy1VarM6199d);
                }
                i11Var.m2243c(go0Var.f3638w ? 1 : 0);
                go0Var.f3638w = z;
                go0Var.f3605K = yy1VarM6199d;
                go0Var.m1962S(202, 0, AbstractC0752tx.f10988c, yy1VarM6199d);
                mn0Var.mo12g(go0Var, Integer.valueOf((i >> 3) & 14));
                go0Var.m1994p(false);
                go0Var.m1994p(false);
                go0Var.f3638w = i11Var.m2242b() != 0;
                go0Var.f3605K = null;
                b62VarM1996r = go0Var.m1996r();
                if (b62VarM1996r == null) {
                    b62VarM1996r.f616d = new C0781up(i, 3, f42VarArr, mn0Var);
                    return;
                }
                return;
            }
            go0Var.f3627l = go0Var.f3601G.m3966s() + go0Var.f3627l;
            yy1VarM6199d = yy1Var;
        }
        z = false;
        if (z) {
            go0Var.m1954J(yy1VarM6199d);
        }
        i11Var.m2243c(go0Var.f3638w ? 1 : 0);
        go0Var.f3638w = z;
        go0Var.f3605K = yy1VarM6199d;
        go0Var.m1962S(202, 0, AbstractC0752tx.f10988c, yy1VarM6199d);
        mn0Var.mo12g(go0Var, Integer.valueOf((i >> 3) & 14));
        go0Var.m1994p(false);
        go0Var.m1994p(false);
        go0Var.f3638w = i11Var.m2242b() != 0;
        go0Var.f3605K = null;
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r == null) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m802c(String str, xm0 xm0Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1936686629);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(xm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(in0Var) ? 256 : 128;
        }
        int i3 = 0;
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 14) == 4;
            Object objM1956L = go0Var.m1956L();
            if (z || objM1956L == C0520nx.f7360a) {
                objM1956L = op0.m3598u(str);
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            qp0.m4249d(true, xm0Var, null, rg3.m4462P(me.dartcv.nuke.R.string.custom_input_hint_config_title, go0Var), null, xe1.m6126i0(-61595080, new C0313ih(xm0Var, in0Var, xk1Var, 3), go0Var), xe1.m6126i0(-483523025, new y30(xk1Var, i3), go0Var), go0Var, (i2 & 112) | 1769478, 20);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0177es(str, xm0Var, in0Var, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0351  */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r14v1, types: [go0, px] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r4v1, types: [go0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [go0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [px] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m803d(int i, int i2, C0685s8 c0685s8, InterfaceC0921yf interfaceC0921yf, C0583pk c0583pk, InterfaceC0596px interfaceC0596px, n50 n50Var, in0 in0Var, d91 d91Var, uh1 uh1Var, jw1 jw1Var, boolean z) {
        int i3;
        int i4;
        d91 d91Var2;
        ?? r4;
        int i5;
        int i6;
        Object w81Var;
        d91 d91Var3;
        l81 l81Var;
        ?? r10;
        boolean z2;
        u81 u81Var;
        uh1 uh1VarM6101S;
        ?? r14 = (go0) interfaceC0596px;
        r14.m1967X(924924659);
        if ((i & 6) == 0) {
            i3 = (r14.m1980f(uh1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= r14.m1980f(d91Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= r14.m1980f(jw1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= r14.m1982g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= r14.m1982g(true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= r14.m1980f(n50Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= r14.m1982g(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= r14.m1980f(c0685s8) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= r14.m1980f(c0583pk) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (r14.m1980f(interfaceC0921yf) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i7 = i4 | 432;
        if ((i2 & 3072) == 0) {
            i7 |= r14.m1984h(in0Var) ? 2048 : 1024;
        }
        if (r14.m1958O(i3 & 1, ((306783379 & i3) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            r14.m1963T();
            if ((i & 1) != 0 && !r14.m2003y()) {
                r14.m1961R();
            }
            int i8 = i3 & (-234881025);
            r14.m1995q();
            int i9 = i8 >> 3;
            int i10 = i9 & 14;
            int i11 = i10 | ((i7 >> 6) & 112);
            xk1 xk1VarM3601x = op0.m3601x(in0Var, r14);
            boolean z3 = (((i11 & 14) ^ 6) > 4 && r14.m1980f(d91Var)) || (i11 & 6) == 4;
            Object objM1956L = r14.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (z3 || objM1956L == c0160eb) {
                o71 o71Var = new o71();
                i5 = i10;
                o71Var.f7571a = new kx1(Integer.MAX_VALUE);
                o71Var.f7572b = new kx1(Integer.MAX_VALUE);
                C0700sn c0700sn = C0700sn.f10212P;
                i6 = i7;
                C0186f0 c0186f0 = new C0186f0(xk1VarM3601x, 28);
                C0043b5 c0043b5 = ls2.f6293a;
                objM1956L = new u81(0, 0, gu2.class, new n70(new C0678s1(new n70(c0186f0, c0700sn), d91Var, o71Var, 14), c0700sn), "value", "getValue()Ljava/lang/Object;");
                r14.m1981f0(objM1956L);
            } else {
                i5 = i10;
                i6 = i7;
            }
            u81 u81Var2 = (u81) objM1956L;
            int i12 = i8 >> 9;
            int i13 = i5 | (i12 & 112);
            boolean z4 = ((((i13 & 112) ^ 48) > 32 && r14.m1982g(true)) || (i13 & 48) == 32) | ((((i13 & 14) ^ 6) > 4 && r14.m1980f(d91Var)) || (i13 & 6) == 4);
            Object objM1956L2 = r14.m1956L();
            if (z4 || objM1956L2 == c0160eb) {
                objM1956L2 = new l81(d91Var);
                r14.m1981f0(objM1956L2);
            }
            l81 l81Var2 = (l81) objM1956L2;
            Object objM1956L3 = r14.m1956L();
            if (objM1956L3 == c0160eb) {
                objM1956L3 = AbstractC0179eu.m1422C(r14);
                r14.m1981f0(objM1956L3);
            }
            j20 j20Var = (j20) objM1956L3;
            nq0 nq0Var = (nq0) r14.m1988j(AbstractC0441ly.f6381g);
            j51 j51Var = !((Boolean) r14.m1988j(AbstractC0441ly.f6397w)).booleanValue() ? xu2.f13180a : null;
            int i14 = i6 << 18;
            int i15 = (i8 & 65520) | (i12 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | ((i6 << 27) & 1879048192);
            boolean z5 = ((((i15 & 112) ^ 48) > 32 && r14.m1980f(d91Var)) || (i15 & 48) == 32) | ((((i15 & 896) ^ 384) > 256 && r14.m1980f(jw1Var)) || (i15 & 384) == 256) | ((((i15 & 7168) ^ 3072) > 2048 && r14.m1982g(false)) || (i15 & 3072) == 2048);
            if (((57344 & i15) ^ 24576) <= 16384 || !r14.m1982g(true)) {
                boolean z6 = (i15 & 24576) == 16384;
                boolean zM1976d = (((i15 & 234881024) ^ 100663296) > 67108864 && r14.m1980f(null)) | z5 | z6 | r14.m1976d(0) | ((((i15 & 3670016) ^ 1572864) > 1048576 && r14.m1980f(c0583pk)) || (i15 & 1572864) == 1048576) | (((i15 & 29360128) ^ 12582912) > 8388608 && r14.m1980f(null)) | ((((i15 & 1879048192) ^ 805306368) > 536870912 && r14.m1980f(interfaceC0921yf)) || (i15 & 805306368) == 536870912) | r14.m1980f(nq0Var) | r14.m1980f(j51Var);
                Object objM1956L4 = r14.m1956L();
                if (zM1976d || objM1956L4 == c0160eb) {
                    d91Var3 = d91Var;
                    l81Var = l81Var2;
                    r10 = 0;
                    z2 = true;
                    w81Var = new w81(d91Var3, jw1Var, u81Var2, interfaceC0921yf, j20Var, nq0Var, j51Var, c0583pk);
                    u81Var = u81Var2;
                    r14.m1981f0(w81Var);
                } else {
                    w81Var = objM1956L4;
                    u81Var = u81Var2;
                    l81Var = l81Var2;
                    r10 = 0;
                    z2 = true;
                    d91Var3 = d91Var;
                }
                w81 w81Var2 = (w81) w81Var;
                qv1 qv1Var = qv1.f9205h;
                if (z) {
                    r14.m1966W(-2077147368);
                    if (((i9 & 14) ^ 6) > 4) {
                        ?? r26 = z2;
                        if (!r14.m1980f(d91Var3)) {
                            r26 = z2;
                            if ((i9 & 6) != 4) {
                                r26 = r10;
                            }
                        }
                        int i16 = r26 | (r14.m1976d(r10) ? 1 : 0);
                        Object objM1956L5 = r14.m1956L();
                        if (i16 != 0 || objM1956L5 == c0160eb) {
                            objM1956L5 = new r81(d91Var3);
                            r14.m1981f0(objM1956L5);
                        }
                        uh1VarM6101S = xe1.m6101S((r81) objM1956L5, d91Var3.f1930o, qv1Var);
                        r14.m1994p(r10);
                    }
                } else {
                    r14.m1966W(-2076718545);
                    r14.m1994p(r10);
                    uh1VarM6101S = rh1.f9587a;
                }
                d91Var2 = d91Var3;
                ?? r42 = r14;
                AbstractC0738tl.m5300b(u81Var, fg1.m1621N(AbstractC0570p7.m3748D(uh1Var.mo4491c(d91Var3.f1927l).mo4491c(d91Var3.f1928m), u81Var, l81Var, qv1Var, z).mo4491c(uh1VarM6101S).mo4491c(d91Var3.f1929n.f12863i), d91Var3, qv1Var, c0685s8, z, n50Var, d91Var3.f1922g), d91Var2.f1931p, w81Var2, r42, 0);
                r4 = r42;
            }
        } else {
            d91Var2 = d91Var;
            ?? r43 = r14;
            r43.m1961R();
            r4 = r43;
        }
        b62 b62VarM1996r = r4.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new k71(uh1Var, d91Var2, jw1Var, n50Var, z, c0685s8, c0583pk, interfaceC0921yf, in0Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m804e(uh1 uh1Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        uh1 uh1Var2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1695544428);
        int i3 = i | 6;
        int i4 = 2;
        if (go0Var.m1958O(i3 & 1, (i3 & 3) != 2)) {
            long j = ((lp1) go0Var.m1988j(ur1.f11452a)).f6239g;
            Context context = (Context) go0Var.m1988j(AbstractC0646r7.f9411b);
            pp1 pp1Var = pp1.f8445a;
            x83 x83Var = pp1.f8447c;
            if (x83Var == null) {
                t11.m5067S("mUser");
                throw null;
            }
            String strM6064l = x83Var.m6064l();
            uh1Var2 = rh1.f9587a;
            uh1 uh1VarM5211g0 = AbstractC0731te.m5211g0(uh1Var2, 38.0f);
            fb2 fb2Var = gb2.f3387a;
            uh1 uh1VarM1896n = gf1.m1896n(m825z(uh1VarM5211g0, fb2Var), C0363ju.m2565b(0.14f, j), sp0.f10267h);
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10226n, false);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1896n);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            uh1 uh1VarM5211g02 = AbstractC0731te.m5211g0(uh1Var2, 22.0f);
            boolean zM1978e = go0Var.m1978e(j);
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (zM1978e || objM1956L == c0160eb) {
                objM1956L = new C0082c8(j, 3);
                go0Var.m1981f0(objM1956L);
            }
            AbstractC0179eu.m1448b(uh1VarM5211g02, (in0) objM1956L, go0Var, 6);
            if (pv2.m4006s0(strM6064l)) {
                go0Var.m1966W(242606888);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(242057847);
                uh1 uh1VarM825z = m825z(AbstractC0731te.m5211g0(uh1Var2, 38.0f), fb2Var);
                Object objM1956L2 = go0Var.m1956L();
                if (objM1956L2 == c0160eb) {
                    objM1956L2 = new C0251gs(26);
                    go0Var.m1981f0(objM1956L2);
                }
                in0 in0Var = (in0) objM1956L2;
                boolean zM1984h = go0Var.m1984h(context) | go0Var.m1980f(strM6064l);
                Object objM1956L3 = go0Var.m1956L();
                if (zM1984h || objM1956L3 == c0160eb) {
                    objM1956L3 = new C0757u1(context, strM6064l, i4);
                    go0Var.m1981f0(objM1956L3);
                }
                pp0.m3904b(in0Var, uh1VarM825z, (in0) objM1956L3, go0Var, 6, 0);
                go0Var.m1994p(false);
            }
            i2 = 1;
            go0Var.m1994p(true);
        } else {
            i2 = 1;
            go0Var.m1961R();
            uh1Var2 = uh1Var;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0096cm(uh1Var2, i, i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m805f(final float f, InterfaceC0596px interfaceC0596px, final int i, final int i2) {
        int i3;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(339296263);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (go0Var.m1974c(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (go0Var.m1958O(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                f = 16.0f;
            }
            float f2 = f;
            f = f2;
            op0.m3579a(fg1.m1615G(rh1.f9587a, f2, 0.0f, 16.0f, 0.0f, 10), 0.5f, ((lp1) go0Var.m1988j(ur1.f11452a)).f6236d, go0Var, 48, 0);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0() { // from class: ft0
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3902N = pp0.m3902N(i | 1);
                    ci0.m805f(f, (InterfaceC0596px) obj, iM3902N, i2);
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m806g(uh1 uh1Var, String str, String str2, InterfaceC0596px interfaceC0596px, int i, int i2) {
        int i3;
        String str3;
        int i4;
        uh1 uh1Var2;
        String str4;
        String str5;
        String strM4462P;
        String strM4462P2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(346352169);
        int i5 = i | 6;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i | 54;
        } else {
            i3 = i5 | (go0Var.m1980f(str) ? 32 : 16);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | 384;
            str3 = str2;
        } else {
            str3 = str2;
            i4 = i3 | (go0Var.m1980f(str3) ? 256 : 128);
        }
        if (go0Var.m1958O(i4 & 1, (i4 & 147) != 146)) {
            String str6 = i6 != 0 ? null : str;
            String str7 = i7 == 0 ? str3 : null;
            if (str6 == null) {
                go0Var.m1966W(2131957371);
                strM4462P = rg3.m4462P(me.dartcv.nuke.R.string.home_settings_empty_title, go0Var);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(2131957092);
                go0Var.m1994p(false);
                strM4462P = str6;
            }
            if (str7 == null) {
                go0Var.m1966W(2131960189);
                strM4462P2 = rg3.m4462P(me.dartcv.nuke.R.string.home_settings_empty_message, go0Var);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(2131959848);
                go0Var.m1994p(false);
                strM4462P2 = str7;
            }
            C0402kw c0402kwM6126i0 = xe1.m6126i0(823288904, new ct0(strM4462P, strM4462P2), go0Var);
            rh1 rh1Var = rh1.f9587a;
            AbstractC0179eu.m1464n(rh1Var, null, c0402kwM6126i0, go0Var, 390, 2);
            str5 = str7;
            uh1Var2 = rh1Var;
            str4 = str6;
        } else {
            go0Var.m1961R();
            uh1Var2 = uh1Var;
            str4 = str;
            str5 = str3;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0803va(uh1Var2, str4, str5, i, i2, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0100  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m807h(final uh1 uh1Var, final kr1 kr1Var, long j, long j2, float f, long j3, float f2, jw1 jw1Var, InterfaceC0644r5 interfaceC0644r5, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, final int i, final int i2) {
        int i3;
        long j4;
        int i4;
        float f3;
        int i5;
        long j5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C0402kw c0402kw2;
        float f4;
        jw1 jw1Var2;
        long j6;
        InterfaceC0644r5 interfaceC0644r52;
        b62 b62VarM1996r;
        int i12;
        long j7;
        float f5;
        za0 za0Var;
        za0 za0Var2;
        za0 za0Var3;
        za0 za0Var4;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1341778111);
        if ((i & 6) == 0) {
            i3 = i | (go0Var.m1980f(uh1Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= go0Var.m1980f(kr1Var) ? 32 : 16;
        }
        int i13 = i3 | (((i2 & 4) == 0 && go0Var.m1978e(j)) ? 256 : 128);
        int i14 = i2 & 8;
        if (i14 != 0) {
            i4 = i13 | 3072;
            j4 = j2;
        } else {
            j4 = j2;
            i4 = i13 | (go0Var.m1978e(j4) ? 2048 : 1024);
        }
        int i15 = i2 & 16;
        if (i15 != 0) {
            i5 = i4 | 24576;
            f3 = f;
        } else {
            f3 = f;
            i5 = i4 | (go0Var.m1974c(f3) ? 16384 : 8192);
        }
        int i16 = i2 & 32;
        if (i16 != 0) {
            i6 = i5 | 196608;
            j5 = j3;
        } else {
            j5 = j3;
            i6 = i5 | (go0Var.m1978e(j5) ? 131072 : 65536);
        }
        int i17 = i2 & 64;
        if (i17 != 0) {
            i7 = i6 | 1572864;
        } else {
            i7 = i6 | (go0Var.m1974c(f2) ? 1048576 : 524288);
        }
        int i18 = i2 & 128;
        if (i18 == 0) {
            if ((i & 12582912) == 0) {
                i8 = i18;
                i7 |= go0Var.m1980f(jw1Var) ? 8388608 : 4194304;
            }
            i9 = i2 & 256;
            if (i9 == 0) {
                i11 = i7 | 100663296;
                i10 = i9;
            } else {
                i10 = i9;
                i11 = i7 | (go0Var.m1980f(interfaceC0644r5) ? 67108864 : 33554432);
            }
            if (go0Var.m1958O(i11 & 1, (i11 & 306783379) == 306783378)) {
                c0402kw2 = c0402kw;
                go0Var.m1961R();
                f4 = f2;
                jw1Var2 = jw1Var;
                j6 = j5;
                interfaceC0644r52 = interfaceC0644r5;
            } else {
                go0Var.m1963T();
                if ((i & 1) == 0 || go0Var.m2003y()) {
                    if ((i2 & 4) != 0) {
                        i12 = i14;
                        j7 = ((lp1) go0Var.m1988j(ur1.f11452a)).f6235c;
                    } else {
                        i12 = i14;
                        j7 = j;
                    }
                    if (i12 != 0) {
                        j4 = C0363ju.f5216f;
                    }
                    if (i15 != 0) {
                        f3 = 0.0f;
                    }
                    j6 = i16 != 0 ? C0363ju.f5216f : j5;
                    f5 = i17 != 0 ? 0.0f : f2;
                    jw1Var2 = i8 != 0 ? new jw1(0.0f, 0.0f, 0.0f, 0.0f) : jw1Var;
                    if (i10 != 0) {
                        interfaceC0644r52 = C0700sn.f10222j;
                    }
                    go0Var.m1995q();
                    za0Var = new za0(f3);
                    za0Var2 = new za0(0.0f);
                    if (za0Var.compareTo(za0Var2) < 0) {
                        za0Var = za0Var2;
                    }
                    za0Var3 = new za0(f5);
                    f4 = f5;
                    za0Var4 = new za0(0.0f);
                    if (za0Var3.compareTo(za0Var4) < 0) {
                        za0Var3 = za0Var4;
                    }
                    uh1 uh1VarM825z = m825z(uh1Var, kr1Var);
                    iu0 iu0Var = sp0.f10267h;
                    uh1 uh1VarMo4491c = gf1.m1896n(m825z(fg1.m1611C(gf1.m1896n(uh1VarM825z, j4, iu0Var), za0Var.f13798h), kr1Var), j7, iu0Var).mo4491c(new C0660rl(za0Var3.f13798h, new ft2(j6), kr1Var)).mo4491c(new iw1(jw1Var2));
                    nf1 nf1VarM1060d = AbstractC0135dm.m1060d(interfaceC0644r52, false);
                    j = j7;
                    int iHashCode = Long.hashCode(go0Var.f3614T);
                    yy1 yy1VarM1990l = go0Var.m1990l();
                    uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarMo4491c);
                    InterfaceC0293hx.f4166c.getClass();
                    C0367jy c0367jy = C0256gx.f3727b;
                    go0Var.m1969Z();
                    if (go0Var.f3613S) {
                        go0Var.m1987i0();
                    } else {
                        go0Var.m1989k(c0367jy);
                    }
                    yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d);
                    yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
                    yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
                    yf3.m6267b(go0Var, C0256gx.f3732g);
                    yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
                    c0402kw2 = c0402kw;
                    c0402kw2.mo489e(C0282hm.f4075a, go0Var, 54);
                    go0Var.m1994p(true);
                } else {
                    go0Var.m1961R();
                    j7 = j;
                    f5 = f2;
                    jw1Var2 = jw1Var;
                    j6 = j5;
                }
                interfaceC0644r52 = interfaceC0644r5;
                go0Var.m1995q();
                za0Var = new za0(f3);
                za0Var2 = new za0(0.0f);
                if (za0Var.compareTo(za0Var2) < 0) {
                }
                za0Var3 = new za0(f5);
                f4 = f5;
                za0Var4 = new za0(0.0f);
                if (za0Var3.compareTo(za0Var4) < 0) {
                }
                uh1 uh1VarM825z2 = m825z(uh1Var, kr1Var);
                iu0 iu0Var2 = sp0.f10267h;
                uh1 uh1VarMo4491c2 = gf1.m1896n(m825z(fg1.m1611C(gf1.m1896n(uh1VarM825z2, j4, iu0Var2), za0Var.f13798h), kr1Var), j7, iu0Var2).mo4491c(new C0660rl(za0Var3.f13798h, new ft2(j6), kr1Var)).mo4491c(new iw1(jw1Var2));
                nf1 nf1VarM1060d2 = AbstractC0135dm.m1060d(interfaceC0644r52, false);
                j = j7;
                int iHashCode2 = Long.hashCode(go0Var.f3614T);
                yy1 yy1VarM1990l2 = go0Var.m1990l();
                uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var, uh1VarMo4491c2);
                InterfaceC0293hx.f4166c.getClass();
                C0367jy c0367jy2 = C0256gx.f3727b;
                go0Var.m1969Z();
                if (go0Var.f3613S) {
                }
                yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d2);
                yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l2);
                yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode2));
                yf3.m6267b(go0Var, C0256gx.f3732g);
                yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M2);
                c0402kw2 = c0402kw;
                c0402kw2.mo489e(C0282hm.f4075a, go0Var, 54);
                go0Var.m1994p(true);
            }
            final long j8 = j;
            b62VarM1996r = go0Var.m1996r();
            if (b62VarM1996r == null) {
                final InterfaceC0644r5 interfaceC0644r53 = interfaceC0644r52;
                final C0402kw c0402kw3 = c0402kw2;
                final long j9 = j4;
                final float f6 = f3;
                final float f7 = f4;
                final long j10 = j6;
                final jw1 jw1Var3 = jw1Var2;
                b62VarM1996r.f616d = new mn0() { // from class: vp1
                    @Override // p000.mn0
                    /* JADX INFO: renamed from: g */
                    public final Object mo12g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM3902N = pp0.m3902N(i | 1);
                        ci0.m807h(uh1Var, kr1Var, j8, j9, f6, j10, f7, jw1Var3, interfaceC0644r53, c0402kw3, (InterfaceC0596px) obj, iM3902N, i2);
                        return a83.f116a;
                    }
                };
                return;
            }
            return;
        }
        i7 |= 12582912;
        i8 = i18;
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        if (go0Var.m1958O(i11 & 1, (i11 & 306783379) == 306783378)) {
        }
        final long j82 = j;
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r == null) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m808i(String str, in0 in0Var, boolean z, InterfaceC0596px interfaceC0596px, int i) {
        boolean z2 = z;
        str.getClass();
        in0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1496453591);
        int i2 = 2;
        int i3 = i | (go0Var.m1980f(str) ? 4 : 2) | (go0Var.m1984h(in0Var) ? 32 : 16) | (go0Var.m1982g(z2) ? 256 : 128);
        if (go0Var.m1958O(i3 & 1, (i3 & 147) != 146)) {
            C0032av c0032avM6346a = AbstractC0938yu.m6346a(new C0884xf(12.0f, new C0676s(i2)), C0700sn.f10233u, go0Var, 6);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, rh1.f9587a);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, c0032avM6346a);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            tp0.m5357b(str, in0Var, null, rg3.m4462P(me.dartcv.nuke.R.string.home_settings_search_placeholder, go0Var), AbstractC0179eu.f2628b, null, false, 0, 0, false, false, null, null, null, go0Var, (i3 & 14) | 24576 | (i3 & 112), 0, 16356);
            z2 = z;
            if (z2) {
                go0Var.m1966W(1594666828);
                m814o(null, null, go0Var, 0);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(1594706229);
                go0Var.m1994p(false);
            }
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0656rh(str, in0Var, z2, i);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m809j(List list, mn0 mn0Var, rs2 rs2Var, mn0 mn0Var2, String str, InterfaceC0596px interfaceC0596px, int i) {
        String str2;
        list.getClass();
        mn0Var.getClass();
        rs2Var.getClass();
        mn0Var2.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1054270619);
        int i2 = (go0Var.m1980f(list) ? 4 : 2) | i | (go0Var.m1984h(mn0Var) ? 32 : 16) | (go0Var.m1980f(rs2Var) ? 256 : 128) | (go0Var.m1984h(mn0Var2) ? 2048 : 1024) | (go0Var.m1980f(str) ? 16384 : 8192);
        if (go0Var.m1958O(i2 & 1, (i2 & 9363) != 9362)) {
            AbstractC0179eu.m1464n(null, str, xe1.m6126i0(258950630, new C0794v1(list, rs2Var, mn0Var2, mn0Var), go0Var), go0Var, ((i2 >> 9) & 112) | 384, 1);
            str2 = str;
        } else {
            str2 = str;
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0959ze(list, mn0Var, rs2Var, mn0Var2, str2, i);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m810k(AbstractC0255gw abstractC0255gw, rs2 rs2Var, mn0 mn0Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        String strM4462P;
        Object x92Var;
        boolean zBooleanValue;
        boolean z;
        boolean z2;
        C0402kw c0402kw;
        String strM4671P;
        C0363ju c0363ju;
        xm0 xm0Var;
        boolean z3;
        C0402kw c0402kwM6126i0;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1411334829);
        int i2 = (go0Var.m1984h(in0Var) ? 2048 : 1024) | i | (go0Var.m1984h(abstractC0255gw) ? 4 : 2) | (go0Var.m1980f(rs2Var) ? 32 : 16) | (go0Var.m1984h(mn0Var) ? 256 : 128);
        if (go0Var.m1958O(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) go0Var.m1988j(AbstractC0646r7.f9411b);
            String strM4462P2 = rg3.m4462P(abstractC0255gw.mo142m(), go0Var);
            Integer numMo141k = abstractC0255gw.mo141k();
            if (numMo141k == null) {
                go0Var.m1966W(-1640689969);
                go0Var.m1994p(false);
                strM4462P = null;
            } else {
                go0Var.m1966W(-1640689968);
                strM4462P = rg3.m4462P(numMo141k.intValue(), go0Var);
                go0Var.m1994p(false);
            }
            String str = (strM4462P == null || pv2.m4006s0(strM4462P)) ? null : strM4462P;
            pp1 pp1Var = pp1.f8445a;
            boolean zM3933e = pp1.m3933e(abstractC0255gw.mo9d());
            zt0 zt0Var = zt0.f14092j;
            zt0 zt0Var2 = zt0.f14090h;
            zt0 zt0Var3 = (zM3933e || !abstractC0255gw.f11986b.isEmpty()) ? zt0Var : !abstractC0255gw.f11987c ? zt0.f14091i : zt0Var2;
            final boolean z4 = zt0Var3 != zt0Var2;
            final boolean z5 = zt0Var3 != zt0Var;
            if (abstractC0255gw.mo322l()) {
                zBooleanValue = true;
            } else {
                try {
                    x92Var = Boolean.valueOf(!t11.m5086l(abstractC0255gw.getClass().getMethod("onClick", View.class).getDeclaringClass(), AbstractC0255gw.class));
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                Object obj = Boolean.FALSE;
                if (x92Var instanceof x92) {
                    x92Var = obj;
                }
                zBooleanValue = ((Boolean) x92Var).booleanValue();
            }
            boolean zM1980f = go0Var.m1980f(abstractC0255gw.mo9d());
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (zM1980f || objM1956L == c0160eb) {
                objM1956L = new kx1(0);
                go0Var.m1981f0(objM1956L);
            }
            kx1 kx1Var = (kx1) objM1956L;
            int i3 = i2 & 14;
            boolean zM1976d = go0Var.m1976d(kx1Var.m2759g()) | (i3 == 4 || go0Var.m1980f(abstractC0255gw)) | go0Var.m1980f(context);
            Object objM1956L2 = go0Var.m1956L();
            if (zM1976d || objM1956L2 == c0160eb) {
                String strMo321j = abstractC0255gw.mo321j(context);
                objM1956L2 = (strMo321j == null || pv2.m4006s0(strMo321j)) ? null : strMo321j;
                go0Var.m1981f0(objM1956L2);
            }
            String strM4462P3 = (String) objM1956L2;
            if (zBooleanValue) {
                go0Var.m1966W(-1640094489);
                if (strM4462P3 == null) {
                    go0Var.m1966W(916925795);
                    strM4462P3 = rg3.m4462P(me.dartcv.nuke.R.string.home_settings_configure, go0Var);
                    z = false;
                } else {
                    z = false;
                    go0Var.m1966W(916925051);
                }
                go0Var.m1994p(z);
                go0Var.m1994p(z);
            } else {
                z = false;
                go0Var.m1966W(-1640012773);
                go0Var.m1994p(false);
                strM4462P3 = null;
            }
            if (z4) {
                go0Var.m1966W(-1639921168);
                z2 = zBooleanValue;
                C0402kw c0402kwM6126i02 = xe1.m6126i0(-1415363503, new bt0(zt0Var3), go0Var);
                go0Var.m1994p(z);
                c0402kw = c0402kwM6126i02;
            } else {
                z2 = zBooleanValue;
                go0Var.m1966W(-1639854053);
                go0Var.m1994p(z);
                c0402kw = null;
            }
            if (abstractC0255gw instanceof gx2) {
                go0Var.m1966W(-1639661760);
                Boolean bool = (Boolean) rs2Var.get(abstractC0255gw.mo9d());
                final boolean zBooleanValue2 = bool != null ? bool.booleanValue() : m789N((gx2) abstractC0255gw);
                boolean zM1982g = (i3 == 4 || go0Var.m1984h(abstractC0255gw)) | go0Var.m1982g(zBooleanValue2) | ((i2 & 896) == 256);
                Object objM1956L3 = go0Var.m1956L();
                if (zM1982g || objM1956L3 == c0160eb) {
                    objM1956L3 = new dt0(0, abstractC0255gw, mn0Var, zBooleanValue2);
                    go0Var.m1981f0(objM1956L3);
                }
                final in0 in0Var2 = (in0) objM1956L3;
                if (z2) {
                    go0Var.m1966W(-1638327024);
                    boolean zM1980f2 = ((i2 & 7168) == 2048) | go0Var.m1980f(kx1Var);
                    Object objM1956L4 = go0Var.m1956L();
                    if (zM1980f2 || objM1956L4 == c0160eb) {
                        objM1956L4 = new C0640r1(18, in0Var, kx1Var);
                        go0Var.m1981f0(objM1956L4);
                    }
                    xm0Var = (xm0) objM1956L4;
                    z3 = false;
                    go0Var.m1994p(false);
                } else {
                    go0Var.m1966W(-1638197444);
                    boolean zM1980f3 = go0Var.m1980f(in0Var2) | go0Var.m1982g(zBooleanValue2);
                    Object objM1956L5 = go0Var.m1956L();
                    if (zM1980f3 || objM1956L5 == c0160eb) {
                        objM1956L5 = new C0619qh(3, in0Var2, zBooleanValue2);
                        go0Var.m1981f0(objM1956L5);
                    }
                    xm0Var = (xm0) objM1956L5;
                    z3 = false;
                    go0Var.m1994p(false);
                }
                if (z2) {
                    go0Var.m1966W(-1636290479);
                    c0402kwM6126i0 = xe1.m6126i0(918261136, new mn0() { // from class: gt0
                        @Override // p000.mn0
                        /* JADX INFO: renamed from: g */
                        public final Object mo12g(Object obj2, Object obj3) {
                            InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            go0 go0Var2 = (go0) interfaceC0596px2;
                            if (go0Var2.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                                rh1 rh1Var = rh1.f9587a;
                                uh1 uh1VarM1615G = fg1.m1615G(rh1Var, 0.0f, 0.0f, 14.0f, 0.0f, 11);
                                ob2 ob2VarM3265a = nb2.m3265a(tp0.f10874a, C0700sn.f10232t, go0Var2, 48);
                                int iHashCode = Long.hashCode(go0Var2.f3614T);
                                yy1 yy1VarM1990l = go0Var2.m1990l();
                                uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var2, uh1VarM1615G);
                                InterfaceC0293hx.f4166c.getClass();
                                C0367jy c0367jy = C0256gx.f3727b;
                                go0Var2.m1969Z();
                                if (go0Var2.f3613S) {
                                    go0Var2.m1989k(c0367jy);
                                } else {
                                    go0Var2.m1987i0();
                                }
                                yf3.m6268c(go0Var2, C0256gx.f3730e, ob2VarM3265a);
                                yf3.m6268c(go0Var2, C0256gx.f3729d, yy1VarM1990l);
                                yf3.m6268c(go0Var2, C0256gx.f3731f, Integer.valueOf(iHashCode));
                                yf3.m6267b(go0Var2, C0256gx.f3732g);
                                yf3.m6268c(go0Var2, C0256gx.f3728c, uh1VarM5285M);
                                uh1 uh1VarM5186O = AbstractC0731te.m5186O(rh1Var, 28.0f);
                                long j = ((lp1) go0Var2.m1988j(ur1.f11452a)).f6238f;
                                boolean z6 = z5;
                                op0.m3581c(uh1VarM5186O, 1.0f, C0363ju.m2565b(z6 ? 0.18f : 0.1f, j), go0Var2, 54);
                                rp0.m4529O(go0Var2, AbstractC0731te.m5231q0(rh1Var, 12.0f));
                                sp0.m4944i(zBooleanValue2, in0Var2, null, z6, 0, go0Var2, 0, 52);
                                go0Var2.m1994p(true);
                            } else {
                                go0Var2.m1961R();
                            }
                            return a83.f116a;
                        }
                    }, go0Var);
                    go0Var.m1994p(z3);
                } else {
                    go0Var.m1966W(-1635424277);
                    go0Var.m1994p(z3);
                    c0402kwM6126i0 = null;
                }
                final boolean z6 = zBooleanValue2;
                final zt0 zt0Var4 = zt0Var3;
                final boolean z7 = z5;
                final String str2 = strM4462P3;
                sp0.m4940g(strM4462P2, null, str, c0402kw, xe1.m6126i0(-1996044068, new mn0() { // from class: ht0
                    @Override // p000.mn0
                    /* JADX INFO: renamed from: g */
                    public final Object mo12g(Object obj2, Object obj3) {
                        InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        go0 go0Var2 = (go0) interfaceC0596px2;
                        if (go0Var2.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                            ob2 ob2VarM3265a = nb2.m3265a(tp0.f10874a, C0700sn.f10232t, go0Var2, 48);
                            int iHashCode = Long.hashCode(go0Var2.f3614T);
                            yy1 yy1VarM1990l = go0Var2.m1990l();
                            rh1 rh1Var = rh1.f9587a;
                            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var2, rh1Var);
                            InterfaceC0293hx.f4166c.getClass();
                            C0367jy c0367jy = C0256gx.f3727b;
                            go0Var2.m1969Z();
                            if (go0Var2.f3613S) {
                                go0Var2.m1989k(c0367jy);
                            } else {
                                go0Var2.m1987i0();
                            }
                            yf3.m6268c(go0Var2, C0256gx.f3730e, ob2VarM3265a);
                            yf3.m6268c(go0Var2, C0256gx.f3729d, yy1VarM1990l);
                            yf3.m6268c(go0Var2, C0256gx.f3731f, Integer.valueOf(iHashCode));
                            yf3.m6267b(go0Var2, C0256gx.f3732g);
                            yf3.m6268c(go0Var2, C0256gx.f3728c, uh1VarM5285M);
                            if (z4) {
                                go0Var2.m1966W(-1547828369);
                                s11.m4706m(zt0Var4, go0Var2, 0);
                                rp0.m4529O(go0Var2, AbstractC0731te.m5231q0(rh1Var, 8.0f));
                                go0Var2.m1994p(false);
                            } else {
                                go0Var2.m1966W(-1547679414);
                                go0Var2.m1994p(false);
                            }
                            String str3 = str2;
                            boolean z8 = z7;
                            if (str3 != null) {
                                go0Var2.m1966W(-1547597140);
                                uh1 uh1VarM5233r0 = AbstractC0731te.m5233r0(rh1Var, Float.NaN, 96.0f);
                                tu2 tu2Var = ur1.f11452a;
                                AbstractC0179eu.m1446a(str3, uh1VarM5233r0, new m13(C0363ju.m2565b(z8 ? 0.86f : 0.42f, ((lp1) go0Var2.m1988j(tu2Var)).f6238f), rg3.m4450D(12), im0.f4681k, 0L, 0, 0L, null, null, 16777208), 2, false, 1, 0, go0Var2, 1597488, 936);
                                rp0.m4529O(go0Var2, AbstractC0731te.m5231q0(rh1Var, 4.0f));
                                qp0.m4252g(null, C0363ju.m2565b(z8 ? 0.72f : 0.34f, ((lp1) go0Var2.m1988j(tu2Var)).f6239g), go0Var2, 0);
                                go0Var2.m1994p(false);
                            } else {
                                go0Var2.m1966W(-1546632327);
                                sp0.m4944i(z6, in0Var2, null, z8, 0, go0Var2, 0, 52);
                                go0Var2 = go0Var2;
                                go0Var2.m1994p(false);
                            }
                            go0Var2.m1994p(true);
                        } else {
                            go0Var2.m1961R();
                        }
                        return a83.f116a;
                    }
                }, go0Var), c0402kwM6126i0, z7, xm0Var, null, go0Var, 24576, 258);
                go0Var.m1994p(z3);
            } else {
                boolean z8 = z5;
                String str3 = str;
                zt0 zt0Var5 = zt0Var3;
                C0402kw c0402kw2 = c0402kw;
                go0Var.m1966W(-1635315374);
                if (z4) {
                    go0Var.m1966W(917084378);
                    strM4671P = s11.m4671P(zt0Var5, go0Var);
                    go0Var.m1994p(false);
                } else {
                    go0Var.m1966W(-1635142550);
                    go0Var.m1994p(false);
                    strM4671P = null;
                }
                if (z4) {
                    go0Var.m1966W(917086874);
                    long jM4656A = s11.m4656A(zt0Var5);
                    go0Var.m1994p(false);
                    c0363ju = new C0363ju(jM4656A);
                } else {
                    go0Var.m1966W(-1635065174);
                    go0Var.m1994p(false);
                    c0363ju = null;
                }
                boolean z9 = (i2 & 7168) == 2048;
                Object objM1956L6 = go0Var.m1956L();
                if (z9 || objM1956L6 == c0160eb) {
                    objM1956L6 = new C0727ta(9, in0Var);
                    go0Var.m1981f0(objM1956L6);
                }
                qp0.m4253h(strM4462P2, (xm0) objM1956L6, null, str3, c0402kw2, strM4671P, c0363ju, z8, null, go0Var, 0, 260);
                go0Var.m1994p(false);
            }
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0794v1(abstractC0255gw, rs2Var, mn0Var, in0Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m811l(sx0 sx0Var, uh1 uh1Var, long j, InterfaceC0596px interfaceC0596px, int i, int i2) {
        long j2;
        int i3;
        uh1 uh1Var2;
        b62 b62VarM1996r;
        uh1 uh1Var3;
        sx0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-2001813114);
        int i4 = i | (go0Var.m1980f(sx0Var) ? 4 : 2) | 48;
        if ((i2 & 4) == 0) {
            j2 = j;
            int i5 = go0Var.m1978e(j2) ? 256 : 128;
            i3 = i4 | i5;
            if (go0Var.m1958O(i3 & 1, (i3 & 147) == 146)) {
                go0Var.m1961R();
                uh1Var2 = uh1Var;
            } else {
                go0Var.m1963T();
                int i6 = i & 1;
                rh1 rh1Var = rh1.f9587a;
                if (i6 == 0 || go0Var.m2003y()) {
                    if ((i2 & 4) != 0) {
                        j2 = ((lp1) go0Var.m1988j(ur1.f11452a)).f6239g;
                        i3 &= -897;
                    }
                    uh1Var3 = rh1Var;
                } else {
                    go0Var.m1961R();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    uh1Var3 = uh1Var;
                }
                go0Var.m1995q();
                uh1 uh1VarM1896n = gf1.m1896n(m825z(AbstractC0731te.m5211g0(uh1Var3, 34.0f), gb2.m1827a(11.0f)), C0363ju.m2565b(0.12f, j2), sp0.f10267h);
                nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10226n, false);
                int iHashCode = Long.hashCode(go0Var.f3614T);
                yy1 yy1VarM1990l = go0Var.m1990l();
                uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1896n);
                InterfaceC0293hx.f4166c.getClass();
                C0367jy c0367jy = C0256gx.f3727b;
                go0Var.m1969Z();
                if (go0Var.f3613S) {
                    go0Var.m1989k(c0367jy);
                } else {
                    go0Var.m1987i0();
                }
                yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d);
                yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
                yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
                yf3.m6267b(go0Var, C0256gx.f3732g);
                yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
                fx0.m1724a(sx0Var, AbstractC0731te.m5211g0(rh1Var, 18.0f), j2, go0Var, ((i3 << 3) & 7168) | (i3 & 14) | 432);
                go0Var.m1994p(true);
                uh1Var2 = uh1Var3;
            }
            long j3 = j2;
            b62VarM1996r = go0Var.m1996r();
            if (b62VarM1996r == null) {
                b62VarM1996r.f616d = new et0(sx0Var, uh1Var2, j3, i, i2);
                return;
            }
            return;
        }
        j2 = j;
        i3 = i4 | i5;
        if (go0Var.m1958O(i3 & 1, (i3 & 147) == 146)) {
        }
        long j32 = j2;
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r == null) {
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m812m(String str, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(705214894);
        int i2 = (go0Var.m1980f(str) ? 4 : 2) | i;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            uh1 uh1VarM825z = m825z(rh1.f9587a, gb2.m1827a(999.0f));
            tu2 tu2Var = ur1.f11452a;
            uh1 uh1VarM1612D = fg1.m1612D(gf1.m1896n(uh1VarM825z, C0363ju.m2565b(0.13f, ((lp1) go0Var.m1988j(tu2Var)).f6239g), sp0.f10267h), 9.0f, 4.0f);
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10226n, false);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1612D);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            AbstractC0179eu.m1446a(str, null, new m13(((lp1) go0Var.m1988j(tu2Var)).f6239g, rg3.m4450D(11), im0.f4682l, 0L, 0, 0L, null, null, 16777208), 2, false, 1, 0, go0Var, (i2 & 14) | 1597440, 938);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0481n0(str, i, 10);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m813n(String str, List list, mn0 mn0Var, InterfaceC0596px interfaceC0596px, int i) {
        list.getClass();
        mn0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1402237935);
        int i2 = (go0Var.m1980f(str) ? 4 : 2) | i | (go0Var.m1980f(list) ? 32 : 16) | (go0Var.m1984h(mn0Var) ? 256 : 128);
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            AbstractC0179eu.m1464n(null, str, xe1.m6126i0(-2092900688, new C0016af(8, list, mn0Var), go0Var), go0Var, ((i2 << 3) & 112) | 384, 1);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new tt0(str, list, mn0Var, i, 8);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m814o(String str, String str2, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-961555668);
        int i2 = i | 402;
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            go0Var.m1963T();
            if ((i & 1) == 0 || go0Var.m2003y()) {
                pp1 pp1Var = pp1.f8445a;
                x83 x83Var = pp1.f8447c;
                if (x83Var == null) {
                    t11.m5067S("mUser");
                    throw null;
                }
                str = x83Var.m6071s();
                x83 x83Var2 = pp1.f8447c;
                if (x83Var2 == null) {
                    t11.m5067S("mUser");
                    throw null;
                }
                str2 = x83Var2.m6070r();
            } else {
                go0Var.m1961R();
            }
            go0Var.m1995q();
            go0Var.m1966W(-637022177);
            String strM4462P = rg3.m4462P(me.dartcv.nuke.R.string.home_settings_user_regular, go0Var);
            go0Var.m1994p(false);
            AbstractC0179eu.m1464n(null, null, xe1.m6126i0(162208045, new tt0(str, str2, strM4462P, 7), go0Var), go0Var, 384, 3);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new ct0(i, str, str2);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m815p(C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1761377134);
        if (go0Var.m1958O(i & 1, (i & 3) != 2)) {
            uh1 uh1VarM1896n = gf1.m1896n(AbstractC0731te.f10695g, ((lp1) go0Var.m1988j(ur1.f11452a)).f6234b, sp0.f10267h);
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10222j, false);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1896n);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            c0402kw.mo12g(go0Var, 6);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0524o0(c0402kw, i, 4);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m816q(String str, uh1 uh1Var, InterfaceC0596px interfaceC0596px, int i) {
        uh1 uh1Var2;
        str.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-169013635);
        int i2 = (go0Var.m1980f(str) ? 4 : 2) | i | 48;
        int i3 = 1;
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            uh1 uh1VarM1615G = fg1.m1615G(AbstractC0731te.f10693e, 0.0f, 4.0f, 0.0f, 2.0f, 5);
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10226n, false);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1615G);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            AbstractC0179eu.m1446a(str, null, new m13(C0363ju.m2565b(0.74f, ((lp1) go0Var.m1988j(ur1.f11452a)).f6238f), rg3.m4450D(12), im0.f4681k, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, go0Var, i2 & 14, 1018);
            go0Var.m1994p(true);
            uh1Var2 = rh1.f9587a;
        } else {
            go0Var.m1961R();
            uh1Var2 = uh1Var;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0946z1(str, uh1Var2, i, i3);
        }
    }

    /* JADX INFO: renamed from: r */
    public static C0726t9 m817r(String str, m13 m13Var, long j, e70 e70Var, xl0 xl0Var, int i, int i2) {
        be0 be0Var = be0.f819h;
        return new C0726t9(new C0878x9(str, m13Var, be0Var, be0Var, xl0Var, e70Var), i, 1, j);
    }

    /* JADX INFO: renamed from: s */
    public static final void m818s(hh1 hh1Var, oy0 oy0Var, qv1 qv1Var, ny0 ny0Var, C0133dk c0133dk, long j) {
        float fIntBitsToFloat;
        lk1 lk1Var = (lk1) c0133dk.f2082j;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (oy0Var.f7877c >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (oy0Var.f7877c & 4294967295L));
        if (m824y(oy0Var)) {
            c0133dk.f2081i = 0;
            lk1Var.m2928d();
        }
        if (!m819t(oy0Var) && !m824y(oy0Var)) {
            if (lk1Var.f6164b == 3) {
                int i = c0133dk.f2081i;
                c0133dk.f2081i = i + 1;
                lk1Var.m2938n(i, oy0Var);
            } else {
                lk1Var.m2925a(oy0Var);
            }
            if (c0133dk.f2081i == 3) {
                c0133dk.f2081i = 0;
            }
            Object[] objArr = lk1Var.f6163a;
            int i2 = lk1Var.f6164b;
            float fIntBitsToFloat4 = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((oy0) objArr[i3]).f7877c >> 32));
            }
            int i4 = lk1Var.f6164b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = lk1Var.f6163a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((oy0) objArr2[i5]).f7877c & 4294967295L));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / lk1Var.f6164b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (qv1Var != null) {
            int i6 = ny0Var.f7366a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = qv1Var == qv1.f9206i ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((m60) hh1Var.f4019i).m3032a(oy0Var.f7876b, rs1.m4612e(jFloatToRawIntBits, j));
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m819t(oy0 oy0Var) {
        return oy0Var.f7882h && !oy0Var.f7878d;
    }

    /* JADX INFO: renamed from: u */
    public static final int m820u(long j, long[] jArr) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m821v(Object obj) {
        if (obj instanceof is2) {
            is2 is2Var = (is2) obj;
            if (is2Var.mo2391d() == gd3.f3416C || is2Var.mo2391d() == C0700sn.f10216T || is2Var.mo2391d() == C0700sn.f10212P) {
                Object value = is2Var.getValue();
                if (value == null) {
                    return true;
                }
                return m821v(value);
            }
        } else if (!(obj instanceof un0) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (f1565u[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static String m822w(String str, int i, int i2, String str2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        int i5 = i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        str.getClass();
        return m823x(str, i4, i5, str2, z, z2, z3, z4, 128);
    }

    /* JADX INFO: renamed from: x */
    public static String m823x(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 64) == 0 ? z4 : false;
        str.getClass();
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z7) || pv2.m3996i0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !m790O(str, iCharCount, length)))) || (iCodePointAt == 43 && z3)))) {
                C0209fn c0209fn = new C0209fn();
                c0209fn.m1676K(str, i4, iCharCount);
                C0209fn c0209fn2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            c0209fn.m1675J("+");
                        } else if (iCodePointAt2 == 43 && z3) {
                            c0209fn.m1675J(z5 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z7) || pv2.m3996i0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !m790O(str, iCharCount, length)))))) {
                            if (c0209fn2 == null) {
                                c0209fn2 = new C0209fn();
                            }
                            c0209fn2.m1677L(iCodePointAt2);
                            while (!c0209fn2.m1683k()) {
                                byte b = c0209fn2.readByte();
                                c0209fn.m1670E(37);
                                char[] cArr = f1570z;
                                c0209fn.m1670E(cArr[((b & 255) >> 4) & 15]);
                                c0209fn.m1670E(cArr[b & 15]);
                            }
                        } else {
                            c0209fn.m1677L(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 128;
                }
                return c0209fn.m1692u();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, length);
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m824y(oy0 oy0Var) {
        return !oy0Var.f7882h && oy0Var.f7878d;
    }

    /* JADX INFO: renamed from: z */
    public static final uh1 m825z(uh1 uh1Var, eq2 eq2Var) {
        return AbstractC0731te.m5185N(uh1Var, 0.0f, 0.0f, 0.0f, eq2Var, 518143);
    }
}
