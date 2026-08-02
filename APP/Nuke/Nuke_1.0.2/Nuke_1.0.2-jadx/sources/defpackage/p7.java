package defpackage;

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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p7 {
    public static final hh1 b;
    public static final hh1 f;
    public static sx0 h;
    public static sx0 i;
    public static d9 j;
    public static f6 k;
    public static sp l;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final k20 c = k20.h;
    public static final qa d = new qa(1);
    public static final StackTraceElement[] e = new StackTraceElement[0];
    public static final jx2 g = new jx2(7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i2 = 19;
        b = new hh1(i2, "RESUME_TOKEN");
        f = new hh1(i2, "NO_VALUE");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static zt2 A(j20 j20Var, a20 a20Var, mn0 mn0Var, int i2) {
        if ((i2 & 1) != 0) {
            a20Var = zd0.h;
        }
        m20 m20Var = (i2 & 2) != 0 ? m20.h : m20.k;
        a20 a20VarH = rg3.H(j20Var, a20Var);
        zt2 h91Var = m20Var == m20.i ? new h91(a20VarH, mn0Var) : new zt2(a20VarH, true);
        h91Var.i0(m20Var, h91Var, mn0Var);
        return h91Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static j71 B(i91 i91Var, xm0 xm0Var) {
        sn snVar = sn.V;
        int iOrdinal = i91Var.ordinal();
        if (iOrdinal == 0) {
            return new hx2(xm0Var);
        }
        if (iOrdinal == 1) {
            ac2 ac2Var = new ac2();
            ac2Var.h = xm0Var;
            ac2Var.i = snVar;
            return ac2Var;
        }
        if (iOrdinal != 2) {
            c80.s();
            return null;
        }
        n83 n83Var = new n83();
        n83Var.h = xm0Var;
        n83Var.i = snVar;
        return n83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static hx2 C(xm0 xm0Var) {
        xm0Var.getClass();
        return new hx2(xm0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 D(uh1 uh1Var, u81 u81Var, l81 l81Var, qv1 qv1Var, boolean z) {
        return uh1Var.c(new m81(u81Var, l81Var, qv1Var, z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final CharSequence E(CharSequence charSequence, int i2) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i2 != -1) {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                String str = i3 <= 0 ? "" : ".....";
                String str2 = i4 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length = charSequence.length();
                if (i4 > length) {
                    i4 = length;
                }
                sb.append(charSequence.subSequence(i3, i4).toString());
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String F(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return hk1.j(sb, str != null ? vi0.j(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String G(String str) {
        str.getClass();
        String strY0 = pv2.y0(pv2.I0(str).toString(), "#");
        if (strY0.length() != 6) {
            return null;
        }
        for (int i2 = 0; i2 < strY0.length(); i2++) {
            char cCharAt = strY0.charAt(i2);
            if (('0' > cCharAt || cCharAt >= ':') && (('a' > cCharAt || cCharAt >= 'g') && ('A' > cCharAt || cCharAt >= 'G'))) {
                return null;
            }
        }
        String upperCase = strY0.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return "#".concat(upperCase);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final b73 H(b73 b73Var, lp1 lp1Var) {
        String strG;
        b73Var.getClass();
        lp1Var.getClass();
        long j2 = lp1Var.g;
        String strO = O(j2);
        String str = b73Var.a;
        String str2 = null;
        if (str != null && (strG = G(str)) != null && !strG.equals(O(j2))) {
            str2 = strG;
        }
        List listI = I(strO, b73Var.b);
        if (str2 != null) {
            listI = S(str2, strO, listI);
        }
        return new b73(str2, listI);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List I(String str, List list) {
        list.getClass();
        str.getClass();
        Set setK0 = du.K0(M(str));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strG = G((String) it.next());
            if (strG != null) {
                arrayList.add(strG);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!setK0.contains((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return du.B0(12, du.F0(du.J0(arrayList2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void J(float[] fArr, float[] fArr2) {
        float fO = o(fArr2, 0, fArr, 0);
        float fO2 = o(fArr2, 0, fArr, 1);
        float fO3 = o(fArr2, 0, fArr, 2);
        float fO4 = o(fArr2, 0, fArr, 3);
        float fO5 = o(fArr2, 1, fArr, 0);
        float fO6 = o(fArr2, 1, fArr, 1);
        float fO7 = o(fArr2, 1, fArr, 2);
        float fO8 = o(fArr2, 1, fArr, 3);
        float fO9 = o(fArr2, 2, fArr, 0);
        float fO10 = o(fArr2, 2, fArr, 1);
        float fO11 = o(fArr2, 2, fArr, 2);
        float fO12 = o(fArr2, 2, fArr, 3);
        float fO13 = o(fArr2, 3, fArr, 0);
        float fO14 = o(fArr2, 3, fArr, 1);
        float fO15 = o(fArr2, 3, fArr, 2);
        float fO16 = o(fArr2, 3, fArr, 3);
        fArr[0] = fO;
        fArr[1] = fO2;
        fArr[2] = fO3;
        fArr[3] = fO4;
        fArr[4] = fO5;
        fArr[5] = fO6;
        fArr[6] = fO7;
        fArr[7] = fO8;
        fArr[8] = fO9;
        fArr[9] = fO10;
        fArr[10] = fO11;
        fArr[11] = fO12;
        fArr[12] = fO13;
        fArr[13] = fO14;
        fArr[14] = fO15;
        fArr[15] = fO16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void K(tr2 tr2Var, int i2, Object obj) {
        int iH = tr2Var.h(i2);
        Object[] objArr = tr2Var.c;
        Object obj2 = objArr[iH];
        objArr[iH] = nx.a;
        if (obj == obj2) {
            return;
        }
        tx.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final lp1 L(b73 b73Var, boolean z) {
        b73Var.getClass();
        lp1 lp1VarQ = z ? p40.q(po1.a) : p40.M(po1.a);
        ju juVarN = N(H(b73Var, lp1VarQ).a);
        return new lp1(lp1VarQ.a, lp1VarQ.b, lp1VarQ.c, lp1VarQ.d, lp1VarQ.e, lp1VarQ.f, juVarN != null ? juVarN.a : lp1VarQ.g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List M(String str) {
        str.getClass();
        pb1 pb1VarE = eu.E();
        String strG = G(str);
        if (strG != null) {
            pb1VarE.add(strG);
        }
        List list = po1.b;
        ArrayList arrayList = new ArrayList(eu.B(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(O(((ju) it.next()).a));
        }
        pb1VarE.addAll(arrayList);
        return du.n0(eu.z(pb1VarE));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ju N(String str) {
        String strG;
        Long lG0;
        if (str == null || (strG = G(str)) == null || (lG0 = wv2.g0(pv2.j0(strG, 1), 16)) == null) {
            return null;
        }
        return new ju(sp0.c(lG0.longValue() | 4278190080L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String O(long j2) {
        return String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(sp0.j0(j2) & 16777215)}, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x000d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x000d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j52, sj] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList P(pr2 pr2Var, int i2, Integer num) {
        ?? j52Var = new j52(pr2Var);
        int iQ = pr2Var.q(i2);
        ao0 ao0VarA = pr2Var.a(i2);
        while (i2 >= 0) {
            j52Var.h(pr2Var.i(i2), pr2Var.k(i2) ? pr2Var.p(pr2Var.b, i2) : nx.a, pr2Var.a.f(i2), num);
            if (iQ >= 0) {
                ao0 ao0Var = ao0VarA;
                ao0VarA = pr2Var.a(iQ);
                i2 = iQ;
                iQ = pr2Var.q(iQ);
                num = ao0Var;
            } else {
                i2 = iQ;
                num = ao0VarA;
            }
        }
        return (ArrayList) j52Var.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void Q(qn2 qn2Var, int i2, fl2 fl2Var) {
        qn2 qn2Var2;
        zk1 zk1Var = new zk1(new qn2[16]);
        List listI = qn2Var.i(false, false);
        while (true) {
            zk1Var.d(zk1Var.j, listI);
            while (true) {
                int i3 = zk1Var.j;
                if (i3 == 0) {
                    return;
                }
                qn2Var2 = (qn2) zk1Var.k(i3 - 1);
                boolean zL = xe1.L(qn2Var2);
                ln2 ln2Var = qn2Var2.d;
                rk1 rk1Var = ln2Var.h;
                if (!zL && !rk1Var.c(vn2.j)) {
                    zn1 zn1VarD = qn2Var2.d();
                    if (zn1VarD == null) {
                        throw vi0.e("Expected semantics node to have a coordinator.");
                    }
                    d11 d11VarF = up0.F(s11.w(zn1VarD, true));
                    if (d11VarF.a < d11VarF.c && d11VarF.b < d11VarF.d) {
                        Object objG = ln2Var.h.g(kn2.e);
                        if (objG == null) {
                            objG = null;
                        }
                        mn0 mn0Var = (mn0) objG;
                        Object objG2 = rk1Var.g(vn2.w);
                        el2 el2Var = (el2) (objG2 != null ? objG2 : null);
                        if (mn0Var == null || el2Var == null || ((Number) el2Var.b.a()).floatValue() <= 0.0f) {
                            break;
                        }
                        int i4 = 1 + i2;
                        fl2Var.j(new gl2(qn2Var2, i4, d11VarF, zn1VarD));
                        Q(qn2Var2, i4, fl2Var);
                    }
                }
            }
            listI = qn2Var2.i(false, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object R(a20 a20Var, mn0 mn0Var, t00 t00Var) throws Throwable {
        a20 a20VarF = t00Var.f();
        a20 a20VarK = !((Boolean) a20Var.r(new ye(27), Boolean.FALSE)).booleanValue() ? a20VarF.k(a20Var) : rg3.w(a20VarF, a20Var, false);
        xe1.n(a20VarK);
        if (a20VarK == a20VarF) {
            hd2 hd2Var = new hd2(t00Var, a20VarK);
            return ze3.b(hd2Var, true, hd2Var, mn0Var);
        }
        gd3 gd3Var = gd3.p;
        if (t11.l(a20VarK.o(gd3Var), a20VarF.o(gd3Var))) {
            v73 v73Var = new v73(t00Var, a20VarK);
            a20 a20Var2 = v73Var.j;
            Object objV = fg1.V(a20Var2, null);
            try {
                return ze3.b(v73Var, true, v73Var, mn0Var);
            } finally {
                fg1.M(a20Var2, objV);
            }
        }
        l90 l90Var = new l90(t00Var, a20VarK);
        try {
            p40.Q(gf1.z(gf1.p(l90Var, l90Var, mn0Var)), a83.a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l90.l;
            do {
                int i2 = atomicIntegerFieldUpdater.get(l90Var);
                if (i2 != 0) {
                    if (i2 != 2) {
                        s.l("Already suspended");
                        return null;
                    }
                    Object objE0 = eu.e0(r21.h.get(l90Var));
                    if (objE0 instanceof ov) {
                        throw ((ov) objE0).a;
                    }
                    return objE0;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(l90Var, 0, 1));
            return k20.h;
        } catch (Throwable th) {
            th = th;
            if (th instanceof j90) {
                th = ((j90) th).h;
            }
            l90Var.h(fg1.s(th));
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List S(String str, String str2, List list) {
        list.getClass();
        str.getClass();
        str2.getClass();
        List listI = I(str2, list);
        String strG = G(str);
        return (strG == null || M(str2).contains(strG)) ? listI : du.B0(12, du.F0(du.J0(du.x0(eu.O(strG), listI))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class T(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long a(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* JADX DEBUG: Class process forced to load method for inline: f9.d():android.graphics.ColorSpace$Named */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d9 b(int i2, int i3, int i4) {
        ColorSpace rgb;
        ColorSpace.Rgb rgb2;
        ColorSpace colorSpace;
        ka2 ka2Var = uu.e;
        p40.W(i4);
        Bitmap.Config configW = p40.W(i4);
        if (t11.l(ka2Var, ka2Var)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (t11.l(ka2Var, uu.q)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (t11.l(ka2Var, uu.r)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (t11.l(ka2Var, uu.o)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (t11.l(ka2Var, uu.j)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (t11.l(ka2Var, uu.i)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (t11.l(ka2Var, uu.t)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (t11.l(ka2Var, uu.s)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (t11.l(ka2Var, uu.k)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (t11.l(ka2Var, uu.l)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (t11.l(ka2Var, uu.g)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (t11.l(ka2Var, uu.h)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (t11.l(ka2Var, uu.f)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (t11.l(ka2Var, uu.m)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (t11.l(ka2Var, uu.p)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!t11.l(ka2Var, uu.n)) {
                if (Build.VERSION.SDK_INT >= 34) {
                    ColorSpace colorSpace2 = t11.l(ka2Var, uu.v) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : t11.l(ka2Var, uu.w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    if (colorSpace2 != null) {
                        colorSpace = colorSpace2;
                    }
                } else if (ka2Var != null) {
                    String str = ka2Var.a;
                    float[] fArrA = ka2Var.d.a();
                    l33 l33Var = ka2Var.g;
                    ColorSpace.Rgb.TransferParameters transferParameters = l33Var != null ? new ColorSpace.Rgb.TransferParameters(l33Var.b, l33Var.c, l33Var.d, l33Var.e, l33Var.f, l33Var.g, l33Var.a) : null;
                    float[] fArr = ka2Var.i;
                    final int i5 = 0;
                    if (transferParameters != null) {
                        rgb2 = new ColorSpace.Rgb(str, ka2Var.h, fArrA, transferParameters);
                        if (!Float.isNaN(fArr[0]) && !Arrays.equals(rgb2.getTransform(), fArr)) {
                            rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                    } else {
                        float[] fArr2 = ka2Var.h;
                        final ja2 ja2Var = ka2Var.l;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: tu
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d2) {
                                int i6 = i5;
                                in0 in0Var = ja2Var;
                                switch (i6) {
                                }
                                return ((Number) in0Var.j(Double.valueOf(d2))).doubleValue();
                            }
                        };
                        final ja2 ja2Var2 = ka2Var.o;
                        final int i6 = 1;
                        rgb2 = new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: tu
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d2) {
                                int i62 = i6;
                                in0 in0Var = ja2Var2;
                                switch (i62) {
                                }
                                return ((Number) in0Var.j(Double.valueOf(d2))).doubleValue();
                            }
                        }, ka2Var.e, ka2Var.f);
                    }
                    colorSpace = rgb2;
                } else {
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new d9(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, configW, true, colorSpace));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        colorSpace = rgb;
        return new d9(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, configW, true, colorSpace));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final r31 c(yo2 yo2Var) {
        String str = "Value of type '" + yo2Var.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + yo2Var.c() + '\'';
        yo2Var.b();
        return new r31(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final lq2 d(int i2, int i3, hn hnVar) {
        if (i2 < 0) {
            s.c(vi0.g("replay cannot be negative, but was ", i2));
            return null;
        }
        if (i3 < 0) {
            s.c(vi0.g("extraBufferCapacity cannot be negative, but was ", i3));
            return null;
        }
        if (i2 <= 0 && i3 <= 0 && hnVar != hn.h) {
            c80.z("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", hnVar);
            return null;
        }
        int i4 = i3 + i2;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new lq2(i2, i4, hnVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ lq2 e(int i2, int i3, hn hnVar) {
        int i4 = (i3 & 1) != 0 ? 0 : 1;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return d(i4, i2, hnVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final db2 f(float f2, float f3, float f4, float f5, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new db2(f2, f3, f4, f5, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean g(View view, View view2) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final th1 h(t60 t60Var, int i2) {
        th1 th1Var = ((th1) t60Var).h.m;
        if (th1Var == null || (th1Var.k & i2) == 0) {
            return null;
        }
        while (th1Var != null) {
            int i3 = th1Var.j;
            if ((i3 & 2) != 0) {
                return null;
            }
            if ((i3 & i2) != 0) {
                return th1Var;
            }
            th1Var = th1Var.m;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(List list, int i2, int i3) {
        int iQ = q(i2, list);
        if (iQ < 0) {
            iQ = -(iQ + 1);
        }
        while (iQ < list.size() && ((b21) list.get(iQ)).b < i3) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static o60 k(j20 j20Var, mn0 mn0Var) {
        o60 o60Var = new o60(rg3.H(j20Var, zd0.h), true);
        o60Var.i0(m20.h, o60Var, mn0Var);
        return o60Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:35:0x0092) to fix multi-entry loop: BACK_EDGE: B:35:0x0092 -> B:27:0x0061 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [j52, sj] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [ao0] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List l(tr2 tr2Var, Integer num, int i2, Integer num2) {
        int iE;
        int iS;
        lk1 lk1Var;
        if (tr2Var.w || tr2Var.p() == 0) {
            return be0.h;
        }
        ?? j52Var = new j52(tr2Var);
        if (num2 != null) {
            iE = num2.intValue();
        } else {
            iE = tr2Var.v;
            if (iE < 0) {
                iE = tr2Var.E(tr2Var.b, i2);
            }
        }
        if (num == 0) {
            int iN = tr2Var.i - tr2Var.N(tr2Var.b, tr2Var.r(i2));
            zj1 zj1Var = tr2Var.s;
            num = Integer.valueOf(iN + ((zj1Var == null || (lk1Var = (lk1) zj1Var.b(i2)) == null) ? 0 : lk1Var.b));
        }
        int iR = tr2Var.r(i2) * 5;
        int[] iArr = tr2Var.b;
        if (iR < iArr.length) {
            iS = tr2Var.s(i2);
        } else {
            int iE2 = iE >= 0 ? tr2Var.E(iArr, iE) : iE;
            iS = tr2Var.s(iE);
            int i3 = iE;
            iE = iE2;
            i2 = i3;
        }
        while (i2 >= 0) {
            j52Var.h(iS, (tr2Var.b[(tr2Var.r(i2) * 5) + 1] & 536870912) != 0 ? tr2Var.t(i2) : nx.a, tr2Var.O(i2), num);
            num = tr2Var.b(i2);
            if (iE >= 0) {
                int iE3 = tr2Var.E(tr2Var.b, iE);
                iS = tr2Var.s(iE);
                int i4 = iE;
                iE = iE3;
                i2 = i4;
            } else {
                i2 = iE;
            }
        }
        return (ArrayList) j52Var.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void m(pr2 pr2Var, ArrayList arrayList, int i2) {
        boolean zL = pr2Var.l(i2);
        int[] iArr = pr2Var.b;
        if (zL) {
            arrayList.add(pr2Var.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            m(pr2Var, arrayList, i4);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: l7.m(java.lang.Object):android.view.translation.ViewTranslationResponse */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void n(w7 w7Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        sn2 sn2Var;
        qn2 qn2Var;
        in0 in0Var;
        int size = longSparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            long jKeyAt = longSparseArray.keyAt(i2);
            ViewTranslationResponse viewTranslationResponseM = l7.m(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM != null && (value = viewTranslationResponseM.getValue("android:text")) != null && (text = value.getText()) != null && (sn2Var = (sn2) w7Var.f().b((int) jKeyAt)) != null && (qn2Var = sn2Var.a) != null) {
                Object objG = qn2Var.d.h.g(kn2.l);
                if (objG == null) {
                    objG = null;
                }
                q3 q3Var = (q3) objG;
                if (q3Var != null && (in0Var = (in0) q3Var.b) != null) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float o(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String p(String str) {
        StringBuilder sb = new StringBuilder();
        if (!str.isEmpty()) {
            int i2 = 0;
            while (i2 < str.length()) {
                int iCodePointAt = Character.codePointAt(str, i2);
                StringBuilder sb2 = new StringBuilder("\\u");
                String hexString = Integer.toHexString(iCodePointAt);
                if (hexString.startsWith("0")) {
                    hexString = hexString.substring(1);
                }
                if (hexString.length() <= 4) {
                    int length = hexString.length();
                    StringBuilder sb3 = new StringBuilder();
                    for (int i3 = 0; i3 < 4 - length; i3++) {
                        sb3.append("0");
                    }
                    sb2.append(sb3.toString());
                }
                sb2.append(hexString);
                sb.append(sb2.toString());
                if (Character.isHighSurrogate(str.charAt(i2))) {
                    i2++;
                }
                i2++;
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int q(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iO = t11.o(((b21) list.get(i4)).b, i2);
            if (iO < 0) {
                i3 = i4 + 1;
            } else {
                if (iO <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Integer r(pr2 pr2Var, yx yxVar, int i2, int i3) {
        Integer numR;
        int[] iArr = pr2Var.b;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (pr2Var.j(i2) && pr2Var.i(i2) == 206 && t11.l(pr2Var.p(iArr, i2), tx.e)) {
                Object objH = pr2Var.h(i2, 0);
                lo0 lo0Var = objH instanceof lo0 ? (lo0) objH : null;
                a82 a82Var = lo0Var != null ? lo0Var.a : null;
                do0 do0Var = a82Var instanceof do0 ? (do0) a82Var : null;
                if (do0Var != null && do0Var.h == yxVar) {
                    return Integer.valueOf(i2);
                }
            }
            if (pr2Var.d(i2) && (numR = r(pr2Var, yxVar, i2 + 1, i4)) != null) {
                return Integer.valueOf(numR.intValue());
            }
            i2 = i4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String s(int i2, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i2 >= 0) {
            sb.append("Unexpected JSON token at offset " + i2 + ": ");
        }
        sb.append(str);
        if (str2 != null && !pv2.s0(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !pv2.s0(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long t(long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final sx0 u() {
        sx0 sx0Var = h;
        if (sx0Var != null) {
            return sx0Var;
        }
        rx0 rx0Var = new rx0("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = s93.a;
        ft2 ft2Var = new ft2(ju.b);
        ye0 ye0Var = new ye0(3);
        ye0Var.k(12.0f, 2.0f);
        ye0Var.d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        ye0Var.m(4.48f, 10.0f, 10.0f, 10.0f);
        ye0Var.m(10.0f, -4.48f, 10.0f, -10.0f);
        ye0Var.l(17.52f, 2.0f, 12.0f, 2.0f);
        ye0Var.c();
        ye0Var.k(10.0f, 17.0f);
        ye0Var.j(-5.0f, -5.0f);
        ye0Var.j(1.41f, -1.41f);
        ye0Var.i(10.0f, 14.17f);
        ye0Var.j(7.59f, -7.59f);
        ye0Var.i(19.0f, 8.0f);
        ye0Var.j(-9.0f, 9.0f);
        ye0Var.c();
        rx0.a(rx0Var, ye0Var.a, ft2Var);
        sx0 sx0VarB = rx0Var.b();
        h = sx0VarB;
        return sx0VarB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final sx0 v() {
        sx0 sx0Var = i;
        if (sx0Var != null) {
            return sx0Var;
        }
        rx0 rx0Var = new rx0("Filled.Favorite", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = s93.a;
        ft2 ft2Var = new ft2(ju.b);
        ye0 ye0Var = new ye0(3);
        ye0Var.k(12.0f, 21.35f);
        ye0Var.j(-1.45f, -1.32f);
        ye0Var.d(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
        ye0Var.d(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
        ye0Var.e(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
        ye0Var.d(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
        ye0Var.d(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
        ye0Var.e(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
        ye0Var.i(12.0f, 21.35f);
        ye0Var.c();
        rx0.a(rx0Var, ye0Var.a, ft2Var);
        sx0 sx0VarB = rx0Var.b();
        i = sx0VarB;
        return sx0VarB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void w(a20 a20Var, Throwable th) {
        Throwable runtimeException;
        Iterator it = e20.a.iterator();
        while (it.hasNext()) {
            try {
                ((d20) it.next()).p(a20Var, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    fg1.m(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                try {
                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
                } catch (Throwable unused) {
                }
            }
        }
        try {
            fg1.m(th, new k80(a20Var));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused3) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void x(qb2 qb2Var, String str) {
        qb2Var.l(qb2Var.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean y(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean z(db2 db2Var) {
        long j2 = db2Var.e;
        return (j2 >>> 32) == (4294967295L & j2) && j2 == db2Var.f && j2 == db2Var.g && j2 == db2Var.h;
    }
}
