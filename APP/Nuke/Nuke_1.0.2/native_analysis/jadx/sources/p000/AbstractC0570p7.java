package p000;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewParent;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: p7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0570p7 {

    /* JADX INFO: renamed from: b */
    public static final hh1 f7993b;

    /* JADX INFO: renamed from: f */
    public static final hh1 f7997f;

    /* JADX INFO: renamed from: h */
    public static sx0 f7999h;

    /* JADX INFO: renamed from: i */
    public static sx0 f8000i;

    /* JADX INFO: renamed from: j */
    public static C0122d9 f8001j;

    /* JADX INFO: renamed from: k */
    public static C0192f6 f8002k;

    /* JADX INFO: renamed from: l */
    public static C0702sp f8003l;

    /* JADX INFO: renamed from: a */
    public static final char[] f7992a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c */
    public static final k20 f7994c = k20.f5323h;

    /* JADX INFO: renamed from: d */
    public static final C0612qa f7995d = new C0612qa(1);

    /* JADX INFO: renamed from: e */
    public static final StackTraceElement[] f7996e = new StackTraceElement[0];

    /* JADX INFO: renamed from: g */
    public static final jx2 f7998g = new jx2(7);

    static {
        int i = 19;
        f7993b = new hh1(i, "RESUME_TOKEN");
        f7997f = new hh1(i, "NO_VALUE");
    }

    /* JADX INFO: renamed from: A */
    public static zt2 m3745A(j20 j20Var, a20 a20Var, mn0 mn0Var, int i) {
        if ((i & 1) != 0) {
            a20Var = zd0.f13837h;
        }
        m20 m20Var = (i & 2) != 0 ? m20.f6440h : m20.f6443k;
        a20 a20VarM4454H = rg3.m4454H(j20Var, a20Var);
        zt2 h91Var = m20Var == m20.f6441i ? new h91(a20VarM4454H, mn0Var) : new zt2(a20VarM4454H, true);
        h91Var.m3680i0(m20Var, h91Var, mn0Var);
        return h91Var;
    }

    /* JADX INFO: renamed from: B */
    public static j71 m3746B(i91 i91Var, xm0 xm0Var) {
        C0700sn c0700sn = C0700sn.f10218V;
        int iOrdinal = i91Var.ordinal();
        if (iOrdinal == 0) {
            return new hx2(xm0Var);
        }
        if (iOrdinal == 1) {
            ac2 ac2Var = new ac2();
            ac2Var.f146h = xm0Var;
            ac2Var.f147i = c0700sn;
            return ac2Var;
        }
        if (iOrdinal != 2) {
            c80.m675s();
            return null;
        }
        n83 n83Var = new n83();
        n83Var.f7054h = xm0Var;
        n83Var.f7055i = c0700sn;
        return n83Var;
    }

    /* JADX INFO: renamed from: C */
    public static hx2 m3747C(xm0 xm0Var) {
        xm0Var.getClass();
        return new hx2(xm0Var);
    }

    /* JADX INFO: renamed from: D */
    public static final uh1 m3748D(uh1 uh1Var, u81 u81Var, l81 l81Var, qv1 qv1Var, boolean z) {
        return uh1Var.mo4491c(new m81(u81Var, l81Var, qv1Var, z));
    }

    /* JADX INFO: renamed from: E */
    public static final CharSequence m3749E(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: F */
    public static final String m3750F(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return hk1.m2211j(sb, str != null ? vi0.m5691j(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    /* JADX INFO: renamed from: G */
    public static final String m3751G(String str) {
        str.getClass();
        String strM4012y0 = pv2.m4012y0(pv2.m3993I0(str).toString(), "#");
        if (strM4012y0.length() != 6) {
            return null;
        }
        for (int i = 0; i < strM4012y0.length(); i++) {
            char cCharAt = strM4012y0.charAt(i);
            if (('0' > cCharAt || cCharAt >= ':') && (('a' > cCharAt || cCharAt >= 'g') && ('A' > cCharAt || cCharAt >= 'G'))) {
                return null;
            }
        }
        String upperCase = strM4012y0.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return "#".concat(upperCase);
    }

    /* JADX INFO: renamed from: H */
    public static final b73 m3752H(b73 b73Var, lp1 lp1Var) {
        String strM3751G;
        b73Var.getClass();
        lp1Var.getClass();
        long j = lp1Var.f6239g;
        String strM3759O = m3759O(j);
        String str = b73Var.f724a;
        String str2 = null;
        if (str != null && (strM3751G = m3751G(str)) != null && !strM3751G.equals(m3759O(j))) {
            str2 = strM3751G;
        }
        List listM3753I = m3753I(strM3759O, b73Var.f725b);
        if (str2 != null) {
            listM3753I = m3763S(str2, strM3759O, listM3753I);
        }
        return new b73(str2, listM3753I);
    }

    /* JADX INFO: renamed from: I */
    public static final List m3753I(String str, List list) {
        list.getClass();
        str.getClass();
        Set setM1153K0 = AbstractC0142du.m1153K0(m3757M(str));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strM3751G = m3751G((String) it.next());
            if (strM3751G != null) {
                arrayList.add(strM3751G);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!setM1153K0.contains((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return AbstractC0142du.m1144B0(12, AbstractC0142du.m1148F0(AbstractC0142du.m1152J0(arrayList2)));
    }

    /* JADX INFO: renamed from: J */
    public static final void m3754J(float[] fArr, float[] fArr2) {
        float fM3779o = m3779o(fArr2, 0, fArr, 0);
        float fM3779o2 = m3779o(fArr2, 0, fArr, 1);
        float fM3779o3 = m3779o(fArr2, 0, fArr, 2);
        float fM3779o4 = m3779o(fArr2, 0, fArr, 3);
        float fM3779o5 = m3779o(fArr2, 1, fArr, 0);
        float fM3779o6 = m3779o(fArr2, 1, fArr, 1);
        float fM3779o7 = m3779o(fArr2, 1, fArr, 2);
        float fM3779o8 = m3779o(fArr2, 1, fArr, 3);
        float fM3779o9 = m3779o(fArr2, 2, fArr, 0);
        float fM3779o10 = m3779o(fArr2, 2, fArr, 1);
        float fM3779o11 = m3779o(fArr2, 2, fArr, 2);
        float fM3779o12 = m3779o(fArr2, 2, fArr, 3);
        float fM3779o13 = m3779o(fArr2, 3, fArr, 0);
        float fM3779o14 = m3779o(fArr2, 3, fArr, 1);
        float fM3779o15 = m3779o(fArr2, 3, fArr, 2);
        float fM3779o16 = m3779o(fArr2, 3, fArr, 3);
        fArr[0] = fM3779o;
        fArr[1] = fM3779o2;
        fArr[2] = fM3779o3;
        fArr[3] = fM3779o4;
        fArr[4] = fM3779o5;
        fArr[5] = fM3779o6;
        fArr[6] = fM3779o7;
        fArr[7] = fM3779o8;
        fArr[8] = fM3779o9;
        fArr[9] = fM3779o10;
        fArr[10] = fM3779o11;
        fArr[11] = fM3779o12;
        fArr[12] = fM3779o13;
        fArr[13] = fM3779o14;
        fArr[14] = fM3779o15;
        fArr[15] = fM3779o16;
    }

    /* JADX INFO: renamed from: K */
    public static final void m3755K(tr2 tr2Var, int i, Object obj) {
        int iM5417h = tr2Var.m5417h(i);
        Object[] objArr = tr2Var.f10915c;
        Object obj2 = objArr[iM5417h];
        objArr[iM5417h] = C0520nx.f7360a;
        if (obj == obj2) {
            return;
        }
        AbstractC0752tx.m5443a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    /* JADX INFO: renamed from: L */
    public static final lp1 m3756L(b73 b73Var, boolean z) {
        b73Var.getClass();
        lp1 lp1VarM3734q = z ? p40.m3734q(po1.f8422a) : p40.m3703M(po1.f8422a);
        C0363ju c0363juM3758N = m3758N(m3752H(b73Var, lp1VarM3734q).f724a);
        return new lp1(lp1VarM3734q.f6233a, lp1VarM3734q.f6234b, lp1VarM3734q.f6235c, lp1VarM3734q.f6236d, lp1VarM3734q.f6237e, lp1VarM3734q.f6238f, c0363juM3758N != null ? c0363juM3758N.f5219a : lp1VarM3734q.f6239g);
    }

    /* JADX INFO: renamed from: M */
    public static final List m3757M(String str) {
        str.getClass();
        pb1 pb1VarM1424E = AbstractC0179eu.m1424E();
        String strM3751G = m3751G(str);
        if (strM3751G != null) {
            pb1VarM1424E.add(strM3751G);
        }
        List list = po1.f8423b;
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m3759O(((C0363ju) it.next()).f5219a));
        }
        pb1VarM1424E.addAll(arrayList);
        return AbstractC0142du.m1158n0(AbstractC0179eu.m1476z(pb1VarM1424E));
    }

    /* JADX INFO: renamed from: N */
    public static final C0363ju m3758N(String str) {
        String strM3751G;
        Long lM6015g0;
        if (str == null || (strM3751G = m3751G(str)) == null || (lM6015g0 = wv2.m6015g0(pv2.m3997j0(strM3751G, 1), 16)) == null) {
            return null;
        }
        return new C0363ju(sp0.m4932c(lM6015g0.longValue() | 4278190080L));
    }

    /* JADX INFO: renamed from: O */
    public static final String m3759O(long j) {
        return String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(sp0.m4947j0(j) & 16777215)}, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j52, sj] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: P */
    public static final ArrayList m3760P(pr2 pr2Var, int i, Integer num) {
        ?? j52Var = new j52(pr2Var);
        int iM3964q = pr2Var.m3964q(i);
        ao0 ao0VarM3948a = pr2Var.m3948a(i);
        while (i >= 0) {
            j52Var.m4876h(pr2Var.m3956i(i), pr2Var.m3958k(i) ? pr2Var.m3963p(pr2Var.f8516b, i) : C0520nx.f7360a, pr2Var.f8515a.m4277f(i), num);
            if (iM3964q >= 0) {
                ao0 ao0Var = ao0VarM3948a;
                ao0VarM3948a = pr2Var.m3948a(iM3964q);
                i = iM3964q;
                iM3964q = pr2Var.m3964q(iM3964q);
                num = ao0Var;
            } else {
                i = iM3964q;
                num = ao0VarM3948a;
            }
        }
        return (ArrayList) j52Var.f10161h;
    }

    /* JADX INFO: renamed from: Q */
    public static final void m3761Q(qn2 qn2Var, int i, fl2 fl2Var) {
        qn2 qn2Var2;
        zk1 zk1Var = new zk1(new qn2[16]);
        List listM4208i = qn2Var.m4208i(false, false);
        while (true) {
            zk1Var.m6425d(zk1Var.f13936j, listM4208i);
            while (true) {
                int i2 = zk1Var.f13936j;
                if (i2 == 0) {
                    return;
                }
                qn2Var2 = (qn2) zk1Var.m6432k(i2 - 1);
                boolean zM6094L = xe1.m6094L(qn2Var2);
                ln2 ln2Var = qn2Var2.f9050d;
                rk1 rk1Var = ln2Var.f6221h;
                if (!zM6094L && !rk1Var.m4501c(vn2.f12067j)) {
                    zn1 zn1VarM4203d = qn2Var2.m4203d();
                    if (zn1VarM4203d == null) {
                        throw vi0.m5686e("Expected semantics node to have a coordinator.");
                    }
                    d11 d11VarM5527F = up0.m5527F(s11.m4724w(zn1VarM4203d, true));
                    if (d11VarM5527F.f1807a < d11VarM5527F.f1809c && d11VarM5527F.f1808b < d11VarM5527F.f1810d) {
                        Object objM4505g = ln2Var.f6221h.m4505g(kn2.f5663e);
                        if (objM4505g == null) {
                            objM4505g = null;
                        }
                        mn0 mn0Var = (mn0) objM4505g;
                        Object objM4505g2 = rk1Var.m4505g(vn2.f12080w);
                        el2 el2Var = (el2) (objM4505g2 != null ? objM4505g2 : null);
                        if (mn0Var == null || el2Var == null || ((Number) el2Var.f2498b.mo6a()).floatValue() <= 0.0f) {
                            break;
                        }
                        int i3 = 1 + i;
                        fl2Var.mo5j(new gl2(qn2Var2, i3, d11VarM5527F, zn1VarM4203d));
                        m3761Q(qn2Var2, i3, fl2Var);
                    }
                }
            }
            listM4208i = qn2Var2.m4208i(false, false);
        }
    }

    /* JADX INFO: renamed from: R */
    public static final Object m3762R(a20 a20Var, mn0 mn0Var, t00 t00Var) throws Throwable {
        a20 a20VarMo2508f = t00Var.mo2508f();
        a20 a20VarMo14k = !((Boolean) a20Var.mo16r(new C0920ye(27), Boolean.FALSE)).booleanValue() ? a20VarMo2508f.mo14k(a20Var) : rg3.m4487w(a20VarMo2508f, a20Var, false);
        xe1.m6135n(a20VarMo14k);
        if (a20VarMo14k == a20VarMo2508f) {
            hd2 hd2Var = new hd2(t00Var, a20VarMo14k);
            return ze3.m6410b(hd2Var, true, hd2Var, mn0Var);
        }
        gd3 gd3Var = gd3.f3438p;
        if (t11.m5086l(a20VarMo14k.mo15o(gd3Var), a20VarMo2508f.mo15o(gd3Var))) {
            v73 v73Var = new v73(t00Var, a20VarMo14k);
            a20 a20Var2 = v73Var.f7930j;
            Object objM1629V = fg1.m1629V(a20Var2, null);
            try {
                return ze3.m6410b(v73Var, true, v73Var, mn0Var);
            } finally {
                fg1.m1620M(a20Var2, objM1629V);
            }
        }
        l90 l90Var = new l90(t00Var, a20VarMo14k);
        try {
            p40.m3706Q(gf1.m1908z(gf1.m1898p(l90Var, l90Var, mn0Var)), a83.f116a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l90.f5990l;
            do {
                int i = atomicIntegerFieldUpdater.get(l90Var);
                if (i != 0) {
                    if (i != 2) {
                        C0676s.m4653l("Already suspended");
                        return null;
                    }
                    Object objM1455e0 = AbstractC0179eu.m1455e0(r21.f9330h.get(l90Var));
                    if (objM1455e0 instanceof C0557ov) {
                        throw ((C0557ov) objM1455e0).f7856a;
                    }
                    return objM1455e0;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(l90Var, 0, 1));
            return k20.f5323h;
        } catch (Throwable th) {
            th = th;
            if (th instanceof j90) {
                th = ((j90) th).f4923h;
            }
            l90Var.mo2509h(fg1.m1644s(th));
            throw th;
        }
    }

    /* JADX INFO: renamed from: S */
    public static final List m3763S(String str, String str2, List list) {
        list.getClass();
        str.getClass();
        str2.getClass();
        List listM3753I = m3753I(str2, list);
        String strM3751G = m3751G(str);
        return (strM3751G == null || m3757M(str2).contains(strM3751G)) ? listM3753I : AbstractC0142du.m1144B0(12, AbstractC0142du.m1148F0(AbstractC0142du.m1152J0(AbstractC0142du.m1168x0(AbstractC0179eu.m1434O(strM3751G), listM3753I))));
    }

    /* JADX INFO: renamed from: T */
    public static Class m3764T(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    /* JADX INFO: renamed from: a */
    public static final long m3765a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0122d9 m3766b(int i, int i2, int i3) {
        ColorSpace rgb;
        ColorSpace.Rgb rgb2;
        ColorSpace colorSpace;
        ka2 ka2Var = C0786uu.f11484e;
        p40.m3712W(i3);
        Bitmap.Config configM3712W = p40.m3712W(i3);
        if (t11.m5086l(ka2Var, ka2Var)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (t11.m5086l(ka2Var, C0786uu.f11496q)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (t11.m5086l(ka2Var, C0786uu.f11497r)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (t11.m5086l(ka2Var, C0786uu.f11494o)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (t11.m5086l(ka2Var, C0786uu.f11489j)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (t11.m5086l(ka2Var, C0786uu.f11488i)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (t11.m5086l(ka2Var, C0786uu.f11499t)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (t11.m5086l(ka2Var, C0786uu.f11498s)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (t11.m5086l(ka2Var, C0786uu.f11490k)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (t11.m5086l(ka2Var, C0786uu.f11491l)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (t11.m5086l(ka2Var, C0786uu.f11486g)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (t11.m5086l(ka2Var, C0786uu.f11487h)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (t11.m5086l(ka2Var, C0786uu.f11485f)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (t11.m5086l(ka2Var, C0786uu.f11492m)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (t11.m5086l(ka2Var, C0786uu.f11495p)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!t11.m5086l(ka2Var, C0786uu.f11493n)) {
                if (Build.VERSION.SDK_INT >= 34) {
                    ColorSpace colorSpace2 = t11.m5086l(ka2Var, C0786uu.f11501v) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : t11.m5086l(ka2Var, C0786uu.f11502w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    if (colorSpace2 != null) {
                        colorSpace = colorSpace2;
                    }
                } else if (ka2Var != null) {
                    String str = ka2Var.f10368a;
                    float[] fArrM4147a = ka2Var.f5419d.m4147a();
                    l33 l33Var = ka2Var.f5422g;
                    ColorSpace.Rgb.TransferParameters transferParameters = l33Var != null ? new ColorSpace.Rgb.TransferParameters(l33Var.f5908b, l33Var.f5909c, l33Var.f5910d, l33Var.f5911e, l33Var.f5912f, l33Var.f5913g, l33Var.f5907a) : null;
                    float[] fArr = ka2Var.f5424i;
                    final int i4 = 0;
                    if (transferParameters != null) {
                        rgb2 = new ColorSpace.Rgb(str, ka2Var.f5423h, fArrM4147a, transferParameters);
                        if (!Float.isNaN(fArr[0]) && !Arrays.equals(rgb2.getTransform(), fArr)) {
                            rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                    } else {
                        float[] fArr2 = ka2Var.f5423h;
                        final ja2 ja2Var = ka2Var.f5427l;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: tu
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i5 = i4;
                                in0 in0Var = ja2Var;
                                switch (i5) {
                                }
                                return ((Number) in0Var.mo5j(Double.valueOf(d))).doubleValue();
                            }
                        };
                        final ja2 ja2Var2 = ka2Var.f5430o;
                        final int i5 = 1;
                        rgb2 = new ColorSpace.Rgb(str, fArr2, fArrM4147a, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: tu
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i52 = i5;
                                in0 in0Var = ja2Var2;
                                switch (i52) {
                                }
                                return ((Number) in0Var.mo5j(Double.valueOf(d))).doubleValue();
                            }
                        }, ka2Var.f5420e, ka2Var.f5421f);
                    }
                    colorSpace = rgb2;
                } else {
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new C0122d9(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM3712W, true, colorSpace));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        colorSpace = rgb;
        return new C0122d9(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM3712W, true, colorSpace));
    }

    /* JADX INFO: renamed from: c */
    public static final r31 m3767c(yo2 yo2Var) {
        String str = "Value of type '" + yo2Var.mo250b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + yo2Var.mo251c() + '\'';
        yo2Var.mo250b();
        return new r31(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX INFO: renamed from: d */
    public static final lq2 m3768d(int i, int i2, EnumC0283hn enumC0283hn) {
        if (i < 0) {
            C0676s.m4645c(vi0.m5688g("replay cannot be negative, but was ", i));
            return null;
        }
        if (i2 < 0) {
            C0676s.m4645c(vi0.m5688g("extraBufferCapacity cannot be negative, but was ", i2));
            return null;
        }
        if (i <= 0 && i2 <= 0 && enumC0283hn != EnumC0283hn.f4084h) {
            c80.m682z("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", enumC0283hn);
            return null;
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new lq2(i, i3, enumC0283hn);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ lq2 m3769e(int i, int i2, EnumC0283hn enumC0283hn) {
        int i3 = (i2 & 1) != 0 ? 0 : 1;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m3768d(i3, i, enumC0283hn);
    }

    /* JADX INFO: renamed from: f */
    public static final db2 m3770f(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new db2(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m3771g(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final th1 m3772h(t60 t60Var, int i) {
        th1 th1Var = ((th1) t60Var).f10757h.f10762m;
        if (th1Var == null || (th1Var.f10760k & i) == 0) {
            return null;
        }
        while (th1Var != null) {
            int i2 = th1Var.f10759j;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return th1Var;
            }
            th1Var = th1Var.f10762m;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final void m3773i(List list, int i, int i2) {
        int iM3781q = m3781q(i, list);
        if (iM3781q < 0) {
            iM3781q = -(iM3781q + 1);
        }
        while (iM3781q < list.size() && ((b21) list.get(iM3781q)).f536b < i2) {
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m3774j(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    /* JADX INFO: renamed from: k */
    public static o60 m3775k(j20 j20Var, mn0 mn0Var) {
        o60 o60Var = new o60(rg3.m4454H(j20Var, zd0.f13837h), true);
        o60Var.m3680i0(m20.f6440h, o60Var, mn0Var);
        return o60Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [j52, sj] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [ao0] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    /* JADX INFO: renamed from: l */
    public static final List m3776l(tr2 tr2Var, Integer num, int i, Integer num2) {
        int iM5393E;
        int iM5427s;
        lk1 lk1Var;
        if (tr2Var.f10935w || tr2Var.m5424p() == 0) {
            return be0.f819h;
        }
        ?? j52Var = new j52(tr2Var);
        if (num2 != null) {
            iM5393E = num2.intValue();
        } else {
            iM5393E = tr2Var.f10934v;
            if (iM5393E < 0) {
                iM5393E = tr2Var.m5393E(tr2Var.f10914b, i);
            }
        }
        if (num == 0) {
            int iM5402N = tr2Var.f10921i - tr2Var.m5402N(tr2Var.f10914b, tr2Var.m5426r(i));
            zj1 zj1Var = tr2Var.f10931s;
            num = Integer.valueOf(iM5402N + ((zj1Var == null || (lk1Var = (lk1) zj1Var.m6022b(i)) == null) ? 0 : lk1Var.f6164b));
        }
        int iM5426r = tr2Var.m5426r(i) * 5;
        int[] iArr = tr2Var.f10914b;
        if (iM5426r < iArr.length) {
            iM5427s = tr2Var.m5427s(i);
        } else {
            int iM5393E2 = iM5393E >= 0 ? tr2Var.m5393E(iArr, iM5393E) : iM5393E;
            iM5427s = tr2Var.m5427s(iM5393E);
            int i2 = iM5393E;
            iM5393E = iM5393E2;
            i = i2;
        }
        while (i >= 0) {
            j52Var.m4876h(iM5427s, (tr2Var.f10914b[(tr2Var.m5426r(i) * 5) + 1] & 536870912) != 0 ? tr2Var.m5428t(i) : C0520nx.f7360a, tr2Var.m5403O(i), num);
            num = tr2Var.m5411b(i);
            if (iM5393E >= 0) {
                int iM5393E3 = tr2Var.m5393E(tr2Var.f10914b, iM5393E);
                iM5427s = tr2Var.m5427s(iM5393E);
                int i3 = iM5393E;
                iM5393E = iM5393E3;
                i = i3;
            } else {
                i = iM5393E;
            }
        }
        return (ArrayList) j52Var.f10161h;
    }

    /* JADX INFO: renamed from: m */
    public static final void m3777m(pr2 pr2Var, ArrayList arrayList, int i) {
        boolean zM3959l = pr2Var.m3959l(i);
        int[] iArr = pr2Var.f8516b;
        if (zM3959l) {
            arrayList.add(pr2Var.m3961n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            m3777m(pr2Var, arrayList, i3);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m3778n(ViewOnAttachStateChangeListenerC0837w7 viewOnAttachStateChangeListenerC0837w7, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        sn2 sn2Var;
        qn2 qn2Var;
        in0 in0Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseM2861m = AbstractC0414l7.m2861m(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM2861m != null && (value = viewTranslationResponseM2861m.getValue("android:text")) != null && (text = value.getText()) != null && (sn2Var = (sn2) viewOnAttachStateChangeListenerC0837w7.m5852f().m6022b((int) jKeyAt)) != null && (qn2Var = sn2Var.f10248a) != null) {
                Object objM4505g = qn2Var.f9050d.f6221h.m4505g(kn2.f5670l);
                if (objM4505g == null) {
                    objM4505g = null;
                }
                C0603q3 c0603q3 = (C0603q3) objM4505g;
                if (c0603q3 != null && (in0Var = (in0) c0603q3.f8713b) != null) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static final float m3779o(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    /* JADX INFO: renamed from: p */
    public static String m3780p(String str) {
        StringBuilder sb = new StringBuilder();
        if (!str.isEmpty()) {
            int i = 0;
            while (i < str.length()) {
                int iCodePointAt = Character.codePointAt(str, i);
                StringBuilder sb2 = new StringBuilder("\\u");
                String hexString = Integer.toHexString(iCodePointAt);
                if (hexString.startsWith("0")) {
                    hexString = hexString.substring(1);
                }
                if (hexString.length() <= 4) {
                    int length = hexString.length();
                    StringBuilder sb3 = new StringBuilder();
                    for (int i2 = 0; i2 < 4 - length; i2++) {
                        sb3.append("0");
                    }
                    sb2.append(sb3.toString());
                }
                sb2.append(hexString);
                sb.append(sb2.toString());
                if (Character.isHighSurrogate(str.charAt(i))) {
                    i++;
                }
                i++;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: q */
    public static final int m3781q(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iM5089o = t11.m5089o(((b21) list.get(i3)).f536b, i);
            if (iM5089o < 0) {
                i2 = i3 + 1;
            } else {
                if (iM5089o <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: r */
    public static final Integer m3782r(pr2 pr2Var, AbstractC0941yx abstractC0941yx, int i, int i2) {
        Integer numM3782r;
        int[] iArr = pr2Var.f8516b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (pr2Var.m3957j(i) && pr2Var.m3956i(i) == 206 && t11.m5086l(pr2Var.m3963p(iArr, i), AbstractC0752tx.f10990e)) {
                Object objM3955h = pr2Var.m3955h(i, 0);
                lo0 lo0Var = objM3955h instanceof lo0 ? (lo0) objM3955h : null;
                a82 a82Var = lo0Var != null ? lo0Var.f6226a : null;
                do0 do0Var = a82Var instanceof do0 ? (do0) a82Var : null;
                if (do0Var != null && do0Var.f2127h == abstractC0941yx) {
                    return Integer.valueOf(i);
                }
            }
            if (pr2Var.m3951d(i) && (numM3782r = m3782r(pr2Var, abstractC0941yx, i + 1, i3)) != null) {
                return Integer.valueOf(numM3782r.intValue());
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: s */
    public static final String m3783s(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !pv2.m4006s0(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !pv2.m4006s0(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: t */
    public static final long m3784t(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: u */
    public static final sx0 m3785u() {
        sx0 sx0Var = f7999h;
        if (sx0Var != null) {
            return sx0Var;
        }
        rx0 rx0Var = new rx0("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = s93.f9998a;
        ft2 ft2Var = new ft2(C0363ju.f5212b);
        ye0 ye0Var = new ye0(3);
        ye0Var.m6259k(12.0f, 2.0f);
        ye0Var.m6252d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        ye0Var.m6261m(4.48f, 10.0f, 10.0f, 10.0f);
        ye0Var.m6261m(10.0f, -4.48f, 10.0f, -10.0f);
        ye0Var.m6260l(17.52f, 2.0f, 12.0f, 2.0f);
        ye0Var.m6251c();
        ye0Var.m6259k(10.0f, 17.0f);
        ye0Var.m6258j(-5.0f, -5.0f);
        ye0Var.m6258j(1.41f, -1.41f);
        ye0Var.m6257i(10.0f, 14.17f);
        ye0Var.m6258j(7.59f, -7.59f);
        ye0Var.m6257i(19.0f, 8.0f);
        ye0Var.m6258j(-9.0f, 9.0f);
        ye0Var.m6251c();
        rx0.m4624a(rx0Var, ye0Var.f13428a, ft2Var);
        sx0 sx0VarM4625b = rx0Var.m4625b();
        f7999h = sx0VarM4625b;
        return sx0VarM4625b;
    }

    /* JADX INFO: renamed from: v */
    public static final sx0 m3786v() {
        sx0 sx0Var = f8000i;
        if (sx0Var != null) {
            return sx0Var;
        }
        rx0 rx0Var = new rx0("Filled.Favorite", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = s93.f9998a;
        ft2 ft2Var = new ft2(C0363ju.f5212b);
        ye0 ye0Var = new ye0(3);
        ye0Var.m6259k(12.0f, 21.35f);
        ye0Var.m6258j(-1.45f, -1.32f);
        ye0Var.m6252d(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
        ye0Var.m6252d(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
        ye0Var.m6253e(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
        ye0Var.m6252d(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
        ye0Var.m6252d(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
        ye0Var.m6253e(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
        ye0Var.m6257i(12.0f, 21.35f);
        ye0Var.m6251c();
        rx0.m4624a(rx0Var, ye0Var.f13428a, ft2Var);
        sx0 sx0VarM4625b = rx0Var.m4625b();
        f8000i = sx0VarM4625b;
        return sx0VarM4625b;
    }

    /* JADX INFO: renamed from: w */
    public static final void m3787w(a20 a20Var, Throwable th) {
        Throwable runtimeException;
        Iterator it = e20.f2297a.iterator();
        while (it.hasNext()) {
            try {
                ((d20) it.next()).mo490p(a20Var, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    fg1.m1638m(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                try {
                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
                } catch (Throwable unused) {
                }
            }
        }
        try {
            fg1.m1638m(th, new k80(a20Var));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m3788x(qb2 qb2Var, String str) {
        qb2Var.m4125l(qb2Var.f8874b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m3789y(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m3790z(db2 db2Var) {
        long j = db2Var.f1960e;
        return (j >>> 32) == (4294967295L & j) && j == db2Var.f1961f && j == db2Var.f1962g && j == db2Var.f1963h;
    }
}
