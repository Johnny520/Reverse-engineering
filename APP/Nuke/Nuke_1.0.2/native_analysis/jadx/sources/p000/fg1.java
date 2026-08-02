package p000;

import android.os.Build;
import android.os.Trace;
import android.window.BackEvent;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fg1 implements om2 {

    /* JADX INFO: renamed from: h */
    public static final Object f2980h = new Object();

    /* JADX INFO: renamed from: i */
    public static final hh1 f2981i = new hh1(19, "NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: j */
    public static final yc2 f2982j = new yc2(26);

    /* JADX INFO: renamed from: k */
    public static final yc2 f2983k = new yc2(27);

    /* JADX INFO: renamed from: l */
    public static final yc2 f2984l = new yc2(28);

    /* JADX INFO: renamed from: A */
    public static final uh1 m1610A(nn0 nn0Var) {
        return new e61(nn0Var);
    }

    /* JADX INFO: renamed from: C */
    public static final uh1 m1611C(uh1 uh1Var, float f) {
        return uh1Var.mo4491c(new gw1(f, f, f, f));
    }

    /* JADX INFO: renamed from: D */
    public static final uh1 m1612D(uh1 uh1Var, float f, float f2) {
        return uh1Var.mo4491c(new gw1(f, f2, f, f2));
    }

    /* JADX INFO: renamed from: E */
    public static uh1 m1613E(uh1 uh1Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return m1612D(uh1Var, f, f2);
    }

    /* JADX INFO: renamed from: F */
    public static final uh1 m1614F(uh1 uh1Var, float f, float f2, float f3, float f4) {
        return uh1Var.mo4491c(new gw1(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: G */
    public static uh1 m1615G(uh1 uh1Var, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return m1614F(uh1Var, f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: H */
    public static void m1616H(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e) {
                m1626S(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                m1626S(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m1626S(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m1626S(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m1617I(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00aa A[SYNTHETIC] */
    /* JADX INFO: renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1618K(HashSet hashSet, LinkedHashSet linkedHashSet, String str, LinkedHashMap linkedHashMap, ArrayList arrayList, Set set, String str2) {
        Set set2;
        String str3;
        si2 si2Var;
        si2 si2Var2;
        IllegalArgumentException illegalArgumentException;
        String strM6107Y;
        String str4;
        String str5 = str2;
        if (hashSet.contains(new oi2(str5))) {
            return;
        }
        boolean zAdd = linkedHashSet.add(new oi2(str5));
        si2 si2Var3 = si2.f10154j;
        if (!zAdd) {
            throw new dg2(str, si2Var3, str5, "Circular module dependency is not supported: ".concat(AbstractC0142du.m1165u0(np2.m3355d0(linkedHashSet, new oi2(str5)), " -> ", null, null, null, 62)), null, 16);
        }
        ii2 ii2Var = (ii2) linkedHashMap.get(new oi2(str5));
        if (ii2Var == null) {
            throw new dg2(str, si2Var3, str5, "Imported module does not exist.", null, 16);
        }
        Set set3 = ig0.f4603a;
        for (String str6 : ig0.m2343a(ii2Var.f4646b)) {
            if (wv2.m6012d0(str6, "nuke:", false)) {
                set2 = set;
                if (!set2.contains(str6)) {
                    throw new dg2(str, si2Var3, str5, vi0.m5691j("Unknown host module '", str6, "'."), null, 16);
                }
                str3 = str5;
                si2Var = si2Var3;
                str4 = null;
            } else {
                set2 = set;
                str3 = str5;
                si2Var = si2Var3;
                try {
                    if (wv2.m6012d0(str6, "./", false)) {
                        strM6107Y = oi2.m3564a(str3, str6);
                        if (!linkedHashMap.containsKey(new oi2(strM6107Y))) {
                        }
                    } else {
                        try {
                            if (wv2.m6012d0(str6, "../", false)) {
                                strM6107Y = oi2.m3564a(str3, str6);
                                if (!linkedHashMap.containsKey(new oi2(strM6107Y))) {
                                    throw new dg2(str, si2Var, str3, vi0.m5691j("Imported module '", str6, "' does not exist."), null, 16);
                                }
                                str4 = strM6107Y;
                            } else {
                                o72 o72Var = oi2.f7689i;
                                strM6107Y = xe1.m6107Y(str6);
                                if (!linkedHashMap.containsKey(new oi2(strM6107Y))) {
                                }
                            }
                        } catch (IllegalArgumentException e) {
                            illegalArgumentException = e;
                            si2Var2 = si2Var;
                            throw new dg2(str, si2Var2, str2, vi0.m5691j("Invalid module specifier '", str6, "'."), illegalArgumentException);
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    si2Var2 = si2Var;
                    illegalArgumentException = e2;
                }
            }
            if (str4 != null) {
                m1618K(hashSet, linkedHashSet, str, linkedHashMap, arrayList, set2, str4);
            }
            str5 = str3;
            si2Var3 = si2Var;
        }
        String str7 = str5;
        linkedHashSet.remove(new oi2(str7));
        hashSet.add(new oi2(str7));
        arrayList.add(ii2Var);
    }

    /* JADX INFO: renamed from: L */
    public static final Object m1619L(Object obj) {
        return obj instanceof C0557ov ? m1644s(((C0557ov) obj).f7856a) : obj;
    }

    /* JADX INFO: renamed from: M */
    public static final void m1620M(a20 a20Var, Object obj) {
        if (obj == f2981i) {
            return;
        }
        if (!(obj instanceof d23)) {
            Object objMo16r = a20Var.mo16r(f2983k, null);
            objMo16r.getClass();
            Trace.endSection();
            return;
        }
        d23 d23Var = (d23) obj;
        a33[] a33VarArr = d23Var.f1844c;
        int length = a33VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            a33VarArr[length].getClass();
            Trace.endSection();
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static uh1 m1621N(uh1 uh1Var, d91 d91Var, qv1 qv1Var, C0685s8 c0685s8, boolean z, n50 n50Var, bk1 bk1Var) {
        qv1 qv1Var2 = qv1.f9205h;
        rh1 rh1Var = rh1.f9587a;
        return uh1Var.mo4491c(qv1Var == qv1Var2 ? ci0.m825z(rh1Var, iu0.f4785c) : ci0.m825z(rh1Var, iu0.f4784b)).mo4491c(new ol2(c0685s8, n50Var, bk1Var, qv1Var, d91Var, z, false));
    }

    /* JADX INFO: renamed from: O */
    public static uh1 m1622O(uh1 uh1Var, float f, eq2 eq2Var, int i) {
        boolean z = false;
        if ((i & 4) != 0 && za0.m6403a(f, 0.0f) > 0) {
            z = true;
        }
        boolean z2 = z;
        long j = tq0.f10898a;
        return (za0.m6403a(f, 0.0f) > 0 || z2) ? uh1Var.mo4491c(new cq2(f, eq2Var, z2, j, j)) : uh1Var;
    }

    /* JADX INFO: renamed from: P */
    public static final long m1623P(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: Q */
    public static String m1624Q(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: R */
    public static final Object m1625R(a20 a20Var) {
        Object objMo16r = a20Var.mo16r(f2982j, 0);
        objMo16r.getClass();
        return objMo16r;
    }

    /* JADX INFO: renamed from: S */
    public static void m1626S(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    /* JADX INFO: renamed from: T */
    public static final void m1627T(Object obj) {
        if (obj instanceof x92) {
            throw ((x92) obj).f12914h;
        }
    }

    /* JADX INFO: renamed from: U */
    public static String m1628U(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + t11.m5072X(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + t11.m5072X(Float.intBitsToFloat(i)) + ", " + t11.m5072X(Float.intBitsToFloat(i2)) + ')';
    }

    /* JADX INFO: renamed from: V */
    public static final Object m1629V(a20 a20Var, Object obj) {
        if (obj == null) {
            obj = m1625R(a20Var);
        }
        if (obj == 0) {
            return f2981i;
        }
        if (obj instanceof Integer) {
            return a20Var.mo16r(f2984l, new d23(((Number) obj).intValue(), a20Var));
        }
        Trace.beginSection(null);
        return a83.f116a;
    }

    /* JADX INFO: renamed from: a */
    public static C0356jn m1630a(int i, int i2, EnumC0283hn enumC0283hn) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        int i3 = i2 & 2;
        EnumC0283hn enumC0283hn2 = EnumC0283hn.f4084h;
        if (i3 != 0) {
            enumC0283hn = enumC0283hn2;
        }
        if (i == -2) {
            if (enumC0283hn != enumC0283hn2) {
                return new C0597py(1, enumC0283hn);
            }
            InterfaceC0212fq.f3107b.getClass();
            return new C0356jn(C0175eq.f2560b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? enumC0283hn == enumC0283hn2 ? new C0356jn(i) : new C0597py(i, enumC0283hn) : new C0356jn(Integer.MAX_VALUE) : enumC0283hn == enumC0283hn2 ? new C0356jn(0) : new C0597py(1, enumC0283hn);
        }
        if (enumC0283hn == enumC0283hn2) {
            return new C0597py(1, EnumC0283hn.f4085i);
        }
        C0676s.m4651j("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final void m1631d(String str, xm0 xm0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        xm0 xm0Var2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-304650921);
        int i3 = 4;
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(xm0Var) ? 32 : 16;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            xm0Var2 = xm0Var;
            qp0.m4249d(true, xm0Var2, null, rg3.m4462P(R.string.display_contact_id_dialog_title, go0Var), null, xe1.m6126i0(-820420684, new C0370k0(xm0Var, i4), go0Var), xe1.m6126i0(462426539, new C0868x1(str, i4), go0Var), go0Var, (i2 & 112) | 1769478, 20);
        } else {
            xm0Var2 = xm0Var;
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0781up(i, i3, str, xm0Var2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final em1 m1632e(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new em1(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    /* JADX INFO: renamed from: f */
    public static final void m1633f(xm0 xm0Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        xm0 xm0Var2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1639938349);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1984h(xm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(in0Var) ? 32 : 16;
        }
        int i3 = 1;
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            Object objM1956L = go0Var.m1956L();
            if (objM1956L == C0520nx.f7360a) {
                objM1956L = op0.m3598u("");
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            xm0Var2 = xm0Var;
            qp0.m4249d(true, xm0Var2, null, rg3.m4462P(R.string.open_user_card_title, go0Var), null, xe1.m6126i0(921525744, new C0746tr(6, xm0Var, in0Var, pv2.m3993I0((String) xk1Var.getValue()).toString()), go0Var), xe1.m6126i0(1082093095, new y30(xk1Var, i3), go0Var), go0Var, ((i2 << 3) & 112) | 1769478, 20);
        } else {
            xm0Var2 = xm0Var;
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0781up(i, 7, xm0Var2, in0Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public static jw1 m1634g(int i) {
        float f = (i & 2) != 0 ? 0.0f : 6.0f;
        return new jw1(0.0f, f, 0.0f, f);
    }

    /* JADX INFO: renamed from: h */
    public static jw1 m1635h() {
        return new jw1(18.0f, 0.0f, 18.0f, 20.0f);
    }

    /* JADX INFO: renamed from: i */
    public static final long m1636i(int i, int i2) {
        if (i < 0 || i2 < 0) {
            lz0.m2988a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = f13.f2738c;
        return j;
    }

    /* JADX INFO: renamed from: j */
    public static final void m1637j(C0411l4 c0411l4, qn2 qn2Var) {
        if (rg3.m4474j(qn2Var)) {
            Object objM4505g = qn2Var.f9050d.f6221h.m4505g(kn2.f5667i);
            if (objM4505g == null) {
                objM4505g = null;
            }
            C0603q3 c0603q3 = (C0603q3) objM4505g;
            if (c0603q3 != null) {
                c0411l4.m2801a(new C0190f4(null, android.R.id.accessibilityActionSetProgress, c0603q3.f8712a, null));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m1638m(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = h21.f3794a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = c02.f1095a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static final uh1 m1639n(uh1 uh1Var, C0548om c0548om) {
        return uh1Var.mo4491c(new C0466mm(c0548om));
    }

    /* JADX INFO: renamed from: o */
    public static void m1640o(String str, boolean z) {
        if (z) {
            return;
        }
        C0676s.m4651j(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m1641p(Object obj) {
        m1642q("Argument must not be null", obj);
    }

    /* JADX INFO: renamed from: q */
    public static void m1642q(String str, Object obj) {
        if (obj != null) {
            return;
        }
        um2.m5516f(str);
    }

    /* JADX INFO: renamed from: r */
    public static final long m1643r(long j, int i) {
        int i2 = f13.f2738c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : m1636i(i4, i);
    }

    /* JADX INFO: renamed from: s */
    public static final x92 m1644s(Throwable th) {
        th.getClass();
        return new x92(th);
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m1645t(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: u */
    public static final int m1646u(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: v */
    public static final int m1647v(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public static final uh1 m1648w(gl0 gl0Var) {
        return new hl0(gl0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0843wd m1649x(DexKitBridge dexKitBridge, C0037b c0037b) {
        Object objValueOf;
        Object x92Var;
        dexKitBridge.getClass();
        ArrayList arrayList = new ArrayList();
        int iM3661b = c0037b.m3661b(4);
        int iM3665f = iM3661b != 0 ? c0037b.m3665f(iM3661b) : 0;
        for (int i = 0; i < iM3665f; i++) {
            C0000a c0000a = new C0000a();
            int iM3661b2 = c0037b.m3661b(4);
            ByteBuffer byteBufferOrder = null;
            if (iM3661b2 != 0) {
                int iM3660a = c0037b.m3660a((i * 4) + c0037b.m3664e(iM3661b2));
                ByteBuffer byteBuffer = c0037b.f7869b;
                byteBuffer.getClass();
                c0000a.m3662c(iM3660a, byteBuffer);
            } else {
                c0000a = null;
            }
            c0000a.getClass();
            int iM3661b3 = c0000a.m3661b(6);
            int iM6143t = xe1.m6143t(iM3661b3 != 0 ? c0000a.f7869b.get(iM3661b3 + c0000a.f7868a) : (byte) 0);
            switch (vi0.m5702u(iM6143t)) {
                case 0:
                    ox2 ox2VarM4k = c0000a.m4k(new C0259h());
                    ox2VarM4k.getClass();
                    C0259h c0259h = (C0259h) ox2VarM4k;
                    int iM3661b4 = c0259h.m3661b(4);
                    objValueOf = Byte.valueOf(iM3661b4 != 0 ? c0259h.f7869b.get(iM3661b4 + c0259h.f7868a) : (byte) 0);
                    break;
                case 1:
                    ox2 ox2VarM4k2 = c0000a.m4k(new C0523o());
                    ox2VarM4k2.getClass();
                    C0523o c0523o = (C0523o) ox2VarM4k2;
                    int iM3661b5 = c0523o.m3661b(4);
                    objValueOf = Short.valueOf(iM3661b5 != 0 ? c0523o.f7869b.getShort(iM3661b5 + c0523o.f7868a) : (short) 0);
                    break;
                case 2:
                    ox2 ox2VarM4k3 = c0000a.m4k(new C0296i());
                    ox2VarM4k3.getClass();
                    C0296i c0296i = (C0296i) ox2VarM4k3;
                    int iM3661b6 = c0296i.m3661b(4);
                    objValueOf = Short.valueOf(iM3661b6 != 0 ? c0296i.f7869b.getShort(iM3661b6 + c0296i.f7868a) : (short) 0);
                    break;
                case 3:
                    ox2 ox2VarM4k4 = c0000a.m4k(new C0406l());
                    ox2VarM4k4.getClass();
                    C0406l c0406l = (C0406l) ox2VarM4k4;
                    int iM3661b7 = c0406l.m3661b(4);
                    objValueOf = Integer.valueOf(iM3661b7 != 0 ? c0406l.f7869b.getInt(iM3661b7 + c0406l.f7868a) : 0);
                    break;
                case 4:
                    ox2 ox2VarM4k5 = c0000a.m4k(new C0443m());
                    ox2VarM4k5.getClass();
                    C0443m c0443m = (C0443m) ox2VarM4k5;
                    int iM3661b8 = c0443m.m3661b(4);
                    objValueOf = Long.valueOf(iM3661b8 != 0 ? c0443m.f7869b.getLong(iM3661b8 + c0443m.f7868a) : 0L);
                    break;
                case 5:
                    ox2 ox2VarM4k6 = c0000a.m4k(new C0369k());
                    ox2VarM4k6.getClass();
                    C0369k c0369k = (C0369k) ox2VarM4k6;
                    int iM3661b9 = c0369k.m3661b(4);
                    objValueOf = Float.valueOf(iM3661b9 != 0 ? c0369k.f7869b.getFloat(iM3661b9 + c0369k.f7868a) : 0.0f);
                    break;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    ox2 ox2VarM4k7 = c0000a.m4k(new C0331j());
                    ox2VarM4k7.getClass();
                    C0331j c0331j = (C0331j) ox2VarM4k7;
                    int iM3661b10 = c0331j.m3661b(4);
                    objValueOf = Double.valueOf(iM3661b10 != 0 ? c0331j.f7869b.getDouble(iM3661b10 + c0331j.f7868a) : 0.0d);
                    break;
                case 7:
                    ox2 ox2VarM4k8 = c0000a.m4k(new C0562p());
                    ox2VarM4k8.getClass();
                    C0562p c0562p = (C0562p) ox2VarM4k8;
                    try {
                        try {
                            int iM3661b11 = c0562p.m3661b(4);
                            String strM3663d = iM3661b11 != 0 ? c0562p.m3663d(iM3661b11 + c0562p.f7868a) : null;
                            strM3663d.getClass();
                            objValueOf = strM3663d;
                        } catch (Throwable th) {
                            x92Var = new x92(th);
                            if (y92.m6237a(x92Var) != null) {
                                x92Var = "";
                            }
                            objValueOf = (String) x92Var;
                            arrayList.add(new C0882xd(iM6143t, objValueOf));
                        }
                    } catch (IllegalArgumentException unused) {
                        int iM3661b12 = c0562p.m3661b(4);
                        if (iM3661b12 != 0) {
                            byteBufferOrder = c0562p.f7869b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
                            int iM3664e = c0562p.m3664e(iM3661b12);
                            byteBufferOrder.position(iM3664e);
                            byteBufferOrder.limit(c0562p.m3665f(iM3661b12) + iM3664e);
                        }
                        byteBufferOrder.getClass();
                        x92Var = AbstractC0570p7.m3780p(gf1.m1899q(byteBufferOrder));
                        if (y92.m6237a(x92Var) != null) {
                        }
                        objValueOf = (String) x92Var;
                        arrayList.add(new C0882xd(iM6143t, objValueOf));
                    }
                    break;
                case 8:
                    ox2 ox2VarM4k9 = c0000a.m4k(new C0185f());
                    ox2VarM4k9.getClass();
                    objValueOf = AbstractC0738tl.m5327z(dexKitBridge, (C0185f) ox2VarM4k9);
                    break;
                case 9:
                    ox2 ox2VarM4k10 = c0000a.m4k(new C0638r());
                    ox2VarM4k10.getClass();
                    objValueOf = p40.m3737t(dexKitBridge, (C0638r) ox2VarM4k10);
                    break;
                case 10:
                    ox2 ox2VarM4k11 = c0000a.m4k(new C0599q());
                    ox2VarM4k11.getClass();
                    objValueOf = AbstractC0691se.m4813B(dexKitBridge, (C0599q) ox2VarM4k11);
                    break;
                case 11:
                    ox2 ox2VarM4k12 = c0000a.m4k(new C0037b());
                    ox2VarM4k12.getClass();
                    objValueOf = m1649x(dexKitBridge, (C0037b) ox2VarM4k12);
                    break;
                case 12:
                    ox2 ox2VarM4k13 = c0000a.m4k(new C0073c());
                    ox2VarM4k13.getClass();
                    objValueOf = gf1.m1902t(dexKitBridge, (C0073c) ox2VarM4k13);
                    break;
                case 13:
                    ox2 ox2VarM4k14 = c0000a.m4k(new C0480n());
                    ox2VarM4k14.getClass();
                    objValueOf = (C0480n) ox2VarM4k14;
                    break;
                case 14:
                    ox2 ox2VarM4k15 = c0000a.m4k(new C0222g());
                    ox2VarM4k15.getClass();
                    C0222g c0222g = (C0222g) ox2VarM4k15;
                    int iM3661b13 = c0222g.m3661b(4);
                    objValueOf = Boolean.valueOf((iM3661b13 == 0 || c0222g.f7869b.get(iM3661b13 + c0222g.f7868a) == 0) ? false : true);
                    break;
                default:
                    c80.m675s();
                    return null;
            }
            arrayList.add(new C0882xd(iM6143t, objValueOf));
        }
        return new C0843wd(dexKitBridge, arrayList);
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m1650y(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m1651z(r61 r61Var) {
        if (r61Var.f9391o == null) {
            return false;
        }
        r61 r61VarM4389u = r61Var.m4389u();
        return (r61VarM4389u != null ? r61VarM4389u.f9391o : null) == null || r61Var.f9373N.f11781b;
    }

    /* JADX INFO: renamed from: B */
    public abstract int mo1652B(int i);

    /* JADX INFO: renamed from: J */
    public abstract int mo1653J(int i);

    @Override // p000.om2
    /* JADX INFO: renamed from: b */
    public int mo1102b(int i) {
        return mo1653J(i);
    }

    @Override // p000.om2
    /* JADX INFO: renamed from: c */
    public int mo1103c(int i) {
        return mo1652B(i);
    }

    @Override // p000.om2
    /* JADX INFO: renamed from: k */
    public int mo1105k(int i) {
        int iMo1652B = mo1652B(i);
        if (iMo1652B == -1 || mo1652B(iMo1652B) == -1) {
            return -1;
        }
        return iMo1652B;
    }

    @Override // p000.om2
    /* JADX INFO: renamed from: l */
    public int mo1106l(int i) {
        int iMo1653J = mo1653J(i);
        if (iMo1653J == -1 || mo1653J(iMo1653J) == -1) {
            return -1;
        }
        return iMo1653J;
    }
}
