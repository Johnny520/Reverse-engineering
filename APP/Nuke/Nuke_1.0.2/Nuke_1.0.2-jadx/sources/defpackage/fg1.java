package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fg1 implements om2 {
    public static final Object h = new Object();
    public static final hh1 i = new hh1(19, "NO_THREAD_ELEMENTS");
    public static final yc2 j = new yc2(26);
    public static final yc2 k = new yc2(27);
    public static final yc2 l = new yc2(28);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 A(nn0 nn0Var) {
        return new e61(nn0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 C(uh1 uh1Var, float f) {
        return uh1Var.c(new gw1(f, f, f, f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 D(uh1 uh1Var, float f, float f2) {
        return uh1Var.c(new gw1(f, f2, f, f2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uh1 E(uh1 uh1Var, float f, float f2, int i2) {
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return D(uh1Var, f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 F(uh1 uh1Var, float f, float f2, float f3, float f4) {
        return uh1Var.c(new gw1(f, f2, f3, f4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uh1 G(uh1 uh1Var, float f, float f2, float f3, float f4, int i2) {
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f4 = 0.0f;
        }
        return F(uh1Var, f, f2, f3, f4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void H(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e) {
                S(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                S(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                S(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                S(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean I(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00aa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void K(HashSet hashSet, LinkedHashSet linkedHashSet, String str, LinkedHashMap linkedHashMap, ArrayList arrayList, Set set, String str2) {
        Set set2;
        String str3;
        si2 si2Var;
        si2 si2Var2;
        IllegalArgumentException illegalArgumentException;
        String strY;
        String str4;
        String str5 = str2;
        if (hashSet.contains(new oi2(str5))) {
            return;
        }
        boolean zAdd = linkedHashSet.add(new oi2(str5));
        si2 si2Var3 = si2.j;
        if (!zAdd) {
            throw new dg2(str, si2Var3, str5, "Circular module dependency is not supported: ".concat(du.u0(np2.d0(linkedHashSet, new oi2(str5)), " -> ", null, null, null, 62)), null, 16);
        }
        ii2 ii2Var = (ii2) linkedHashMap.get(new oi2(str5));
        if (ii2Var == null) {
            throw new dg2(str, si2Var3, str5, "Imported module does not exist.", null, 16);
        }
        Set set3 = ig0.a;
        for (String str6 : ig0.a(ii2Var.b)) {
            if (wv2.d0(str6, "nuke:", false)) {
                set2 = set;
                if (!set2.contains(str6)) {
                    throw new dg2(str, si2Var3, str5, vi0.j("Unknown host module '", str6, "'."), null, 16);
                }
                str3 = str5;
                si2Var = si2Var3;
                str4 = null;
            } else {
                set2 = set;
                str3 = str5;
                si2Var = si2Var3;
                try {
                    if (wv2.d0(str6, "./", false)) {
                        strY = oi2.a(str3, str6);
                        if (!linkedHashMap.containsKey(new oi2(strY))) {
                        }
                    } else {
                        try {
                            if (wv2.d0(str6, "../", false)) {
                                strY = oi2.a(str3, str6);
                                if (!linkedHashMap.containsKey(new oi2(strY))) {
                                    throw new dg2(str, si2Var, str3, vi0.j("Imported module '", str6, "' does not exist."), null, 16);
                                }
                                str4 = strY;
                            } else {
                                o72 o72Var = oi2.i;
                                strY = xe1.Y(str6);
                                if (!linkedHashMap.containsKey(new oi2(strY))) {
                                }
                            }
                        } catch (IllegalArgumentException e) {
                            illegalArgumentException = e;
                            si2Var2 = si2Var;
                            throw new dg2(str, si2Var2, str2, vi0.j("Invalid module specifier '", str6, "'."), illegalArgumentException);
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    si2Var2 = si2Var;
                    illegalArgumentException = e2;
                }
            }
            if (str4 != null) {
                K(hashSet, linkedHashSet, str, linkedHashMap, arrayList, set2, str4);
            }
            str5 = str3;
            si2Var3 = si2Var;
        }
        String str7 = str5;
        linkedHashSet.remove(new oi2(str7));
        hashSet.add(new oi2(str7));
        arrayList.add(ii2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object L(Object obj) {
        return obj instanceof ov ? s(((ov) obj).a) : obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void M(a20 a20Var, Object obj) {
        if (obj == i) {
            return;
        }
        if (!(obj instanceof d23)) {
            Object objR = a20Var.r(k, null);
            objR.getClass();
            Trace.endSection();
            return;
        }
        d23 d23Var = (d23) obj;
        a33[] a33VarArr = d23Var.c;
        int length = a33VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            a33VarArr[length].getClass();
            Trace.endSection();
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uh1 N(uh1 uh1Var, d91 d91Var, qv1 qv1Var, s8 s8Var, boolean z, n50 n50Var, bk1 bk1Var) {
        qv1 qv1Var2 = qv1.h;
        rh1 rh1Var = rh1.a;
        return uh1Var.c(qv1Var == qv1Var2 ? ci0.z(rh1Var, iu0.c) : ci0.z(rh1Var, iu0.b)).c(new ol2(s8Var, n50Var, bk1Var, qv1Var, d91Var, z, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uh1 O(uh1 uh1Var, float f, eq2 eq2Var, int i2) {
        boolean z = false;
        if ((i2 & 4) != 0 && za0.a(f, 0.0f) > 0) {
            z = true;
        }
        boolean z2 = z;
        long j2 = tq0.a;
        return (za0.a(f, 0.0f) > 0 || z2) ? uh1Var.c(new cq2(f, eq2Var, z2, j2, j2)) : uh1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long P(float f, long j2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String Q(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object R(a20 a20Var) {
        Object objR = a20Var.r(j, 0);
        objR.getClass();
        return objR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void S(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void T(Object obj) {
        if (obj instanceof x92) {
            throw ((x92) obj).h;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String U(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return "CornerRadius.circular(" + t11.X(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + t11.X(Float.intBitsToFloat(i2)) + ", " + t11.X(Float.intBitsToFloat(i3)) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object V(a20 a20Var, Object obj) {
        if (obj == null) {
            obj = R(a20Var);
        }
        if (obj == 0) {
            return i;
        }
        if (obj instanceof Integer) {
            return a20Var.r(l, new d23(((Number) obj).intValue(), a20Var));
        }
        Trace.beginSection(null);
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static jn a(int i2, int i3, hn hnVar) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 2;
        hn hnVar2 = hn.h;
        if (i4 != 0) {
            hnVar = hnVar2;
        }
        if (i2 == -2) {
            if (hnVar != hnVar2) {
                return new py(1, hnVar);
            }
            fq.b.getClass();
            return new jn(eq.b);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? hnVar == hnVar2 ? new jn(i2) : new py(i2, hnVar) : new jn(Integer.MAX_VALUE) : hnVar == hnVar2 ? new jn(0) : new py(1, hnVar);
        }
        if (hnVar == hnVar2) {
            return new py(1, hn.i);
        }
        s.j("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(String str, xm0 xm0Var, px pxVar, int i2) {
        int i3;
        xm0 xm0Var2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-304650921);
        int i4 = 4;
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i3 = (go0Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(xm0Var) ? 32 : 16;
        }
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            xm0Var2 = xm0Var;
            qp0.d(true, xm0Var2, null, rg3.P(R.string.display_contact_id_dialog_title, go0Var), null, xe1.i0(-820420684, new k0(xm0Var, i5), go0Var), xe1.i0(462426539, new x1(str, i5), go0Var), go0Var, (i3 & 112) | 1769478, 20);
        } else {
            xm0Var2 = xm0Var;
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new up(i2, i4, str, xm0Var2);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: zr0.a(android.window.BackEvent):float */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final em1 e(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new em1(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(xm0 xm0Var, in0 in0Var, px pxVar, int i2) {
        int i3;
        xm0 xm0Var2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1639938349);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.h(xm0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(in0Var) ? 32 : 16;
        }
        int i4 = 1;
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            Object objL = go0Var.L();
            if (objL == nx.a) {
                objL = op0.u("");
                go0Var.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            xm0Var2 = xm0Var;
            qp0.d(true, xm0Var2, null, rg3.P(R.string.open_user_card_title, go0Var), null, xe1.i0(921525744, new tr(6, xm0Var, in0Var, pv2.I0((String) xk1Var.getValue()).toString()), go0Var), xe1.i0(1082093095, new y30(xk1Var, i4), go0Var), go0Var, ((i3 << 3) & 112) | 1769478, 20);
        } else {
            xm0Var2 = xm0Var;
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new up(i2, 7, xm0Var2, in0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static jw1 g(int i2) {
        float f = (i2 & 2) != 0 ? 0.0f : 6.0f;
        return new jw1(0.0f, f, 0.0f, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static jw1 h() {
        return new jw1(18.0f, 0.0f, 18.0f, 20.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long i(int i2, int i3) {
        if (i2 < 0 || i3 < 0) {
            lz0.a("start and end cannot be negative. [start: " + i2 + ", end: " + i3 + ']');
        }
        long j2 = (((long) i3) & 4294967295L) | (((long) i2) << 32);
        int i4 = f13.c;
        return j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(l4 l4Var, qn2 qn2Var) {
        if (rg3.j(qn2Var)) {
            Object objG = qn2Var.d.h.g(kn2.i);
            if (objG == null) {
                objG = null;
            }
            q3 q3Var = (q3) objG;
            if (q3Var != null) {
                l4Var.a(new f4(null, android.R.id.accessibilityActionSetProgress, q3Var.a, null));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = h21.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = c02.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 n(uh1 uh1Var, om omVar) {
        return uh1Var.c(new mm(omVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void o(String str, boolean z) {
        if (z) {
            return;
        }
        s.j(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void p(Object obj) {
        q("Argument must not be null", obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void q(String str, Object obj) {
        if (obj != null) {
            return;
        }
        um2.f(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long r(long j2, int i2) {
        int i3 = f13.c;
        int i4 = (int) (j2 >> 32);
        int i5 = i4 < 0 ? 0 : i4;
        if (i5 > i2) {
            i5 = i2;
        }
        int i6 = (int) (4294967295L & j2);
        int i7 = i6 >= 0 ? i6 : 0;
        if (i7 <= i2) {
            i2 = i7;
        }
        return (i5 == i4 && i2 == i6) ? j2 : i(i5, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final x92 s(Throwable th) {
        th.getClass();
        return new x92(th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean t(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int u(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        while (i2 < length) {
            if (charSequence.charAt(i2) == '\n') {
                return i2;
            }
            i2++;
        }
        return charSequence.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int v(CharSequence charSequence, int i2) {
        while (i2 > 0) {
            if (charSequence.charAt(i2 - 1) == '\n') {
                return i2;
            }
            i2--;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 w(gl0 gl0Var) {
        return new hl0(gl0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wd x(DexKitBridge dexKitBridge, b bVar) {
        Object objValueOf;
        Object x92Var;
        dexKitBridge.getClass();
        ArrayList arrayList = new ArrayList();
        int iB = bVar.b(4);
        int iF = iB != 0 ? bVar.f(iB) : 0;
        for (int i2 = 0; i2 < iF; i2++) {
            a aVar = new a();
            int iB2 = bVar.b(4);
            ByteBuffer byteBufferOrder = null;
            if (iB2 != 0) {
                int iA = bVar.a((i2 * 4) + bVar.e(iB2));
                ByteBuffer byteBuffer = bVar.b;
                byteBuffer.getClass();
                aVar.c(iA, byteBuffer);
            } else {
                aVar = null;
            }
            aVar.getClass();
            int iB3 = aVar.b(6);
            int iT = xe1.t(iB3 != 0 ? aVar.b.get(iB3 + aVar.a) : (byte) 0);
            switch (vi0.u(iT)) {
                case 0:
                    ox2 ox2VarK = aVar.k(new h());
                    ox2VarK.getClass();
                    h hVar = (h) ox2VarK;
                    int iB4 = hVar.b(4);
                    objValueOf = Byte.valueOf(iB4 != 0 ? hVar.b.get(iB4 + hVar.a) : (byte) 0);
                    break;
                case 1:
                    ox2 ox2VarK2 = aVar.k(new o());
                    ox2VarK2.getClass();
                    o oVar = (o) ox2VarK2;
                    int iB5 = oVar.b(4);
                    objValueOf = Short.valueOf(iB5 != 0 ? oVar.b.getShort(iB5 + oVar.a) : (short) 0);
                    break;
                case 2:
                    ox2 ox2VarK3 = aVar.k(new i());
                    ox2VarK3.getClass();
                    i iVar = (i) ox2VarK3;
                    int iB6 = iVar.b(4);
                    objValueOf = Short.valueOf(iB6 != 0 ? iVar.b.getShort(iB6 + iVar.a) : (short) 0);
                    break;
                case 3:
                    ox2 ox2VarK4 = aVar.k(new l());
                    ox2VarK4.getClass();
                    l lVar = (l) ox2VarK4;
                    int iB7 = lVar.b(4);
                    objValueOf = Integer.valueOf(iB7 != 0 ? lVar.b.getInt(iB7 + lVar.a) : 0);
                    break;
                case 4:
                    ox2 ox2VarK5 = aVar.k(new m());
                    ox2VarK5.getClass();
                    m mVar = (m) ox2VarK5;
                    int iB8 = mVar.b(4);
                    objValueOf = Long.valueOf(iB8 != 0 ? mVar.b.getLong(iB8 + mVar.a) : 0L);
                    break;
                case 5:
                    ox2 ox2VarK6 = aVar.k(new k());
                    ox2VarK6.getClass();
                    k kVar = (k) ox2VarK6;
                    int iB9 = kVar.b(4);
                    objValueOf = Float.valueOf(iB9 != 0 ? kVar.b.getFloat(iB9 + kVar.a) : 0.0f);
                    break;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    ox2 ox2VarK7 = aVar.k(new j());
                    ox2VarK7.getClass();
                    j jVar = (j) ox2VarK7;
                    int iB10 = jVar.b(4);
                    objValueOf = Double.valueOf(iB10 != 0 ? jVar.b.getDouble(iB10 + jVar.a) : 0.0d);
                    break;
                case 7:
                    ox2 ox2VarK8 = aVar.k(new p());
                    ox2VarK8.getClass();
                    p pVar = (p) ox2VarK8;
                    try {
                        try {
                            int iB11 = pVar.b(4);
                            String strD = iB11 != 0 ? pVar.d(iB11 + pVar.a) : null;
                            strD.getClass();
                            objValueOf = strD;
                        } catch (Throwable th) {
                            x92Var = new x92(th);
                            if (y92.a(x92Var) != null) {
                                x92Var = "";
                            }
                            objValueOf = (String) x92Var;
                            arrayList.add(new xd(iT, objValueOf));
                        }
                    } catch (IllegalArgumentException unused) {
                        int iB12 = pVar.b(4);
                        if (iB12 != 0) {
                            byteBufferOrder = pVar.b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
                            int iE = pVar.e(iB12);
                            byteBufferOrder.position(iE);
                            byteBufferOrder.limit(pVar.f(iB12) + iE);
                        }
                        byteBufferOrder.getClass();
                        x92Var = p7.p(gf1.q(byteBufferOrder));
                        if (y92.a(x92Var) != null) {
                        }
                        objValueOf = (String) x92Var;
                        arrayList.add(new xd(iT, objValueOf));
                    }
                    break;
                case 8:
                    ox2 ox2VarK9 = aVar.k(new f());
                    ox2VarK9.getClass();
                    objValueOf = tl.z(dexKitBridge, (f) ox2VarK9);
                    break;
                case 9:
                    ox2 ox2VarK10 = aVar.k(new r());
                    ox2VarK10.getClass();
                    objValueOf = p40.t(dexKitBridge, (r) ox2VarK10);
                    break;
                case 10:
                    ox2 ox2VarK11 = aVar.k(new q());
                    ox2VarK11.getClass();
                    objValueOf = se.B(dexKitBridge, (q) ox2VarK11);
                    break;
                case 11:
                    ox2 ox2VarK12 = aVar.k(new b());
                    ox2VarK12.getClass();
                    objValueOf = x(dexKitBridge, (b) ox2VarK12);
                    break;
                case 12:
                    ox2 ox2VarK13 = aVar.k(new c());
                    ox2VarK13.getClass();
                    objValueOf = gf1.t(dexKitBridge, (c) ox2VarK13);
                    break;
                case 13:
                    ox2 ox2VarK14 = aVar.k(new n());
                    ox2VarK14.getClass();
                    objValueOf = (n) ox2VarK14;
                    break;
                case 14:
                    ox2 ox2VarK15 = aVar.k(new g());
                    ox2VarK15.getClass();
                    g gVar = (g) ox2VarK15;
                    int iB13 = gVar.b(4);
                    objValueOf = Boolean.valueOf((iB13 == 0 || gVar.b.get(iB13 + gVar.a) == 0) ? false : true);
                    break;
                default:
                    c80.s();
                    return null;
            }
            arrayList.add(new xd(iT, objValueOf));
        }
        return new wd(dexKitBridge, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean y(float[] fArr, float[] fArr2) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean z(r61 r61Var) {
        if (r61Var.o == null) {
            return false;
        }
        r61 r61VarU = r61Var.u();
        return (r61VarU != null ? r61VarU.o : null) == null || r61Var.N.b;
    }

    public abstract int B(int i2);

    public abstract int J(int i2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.om2
    public int b(int i2) {
        return J(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.om2
    public int c(int i2) {
        return B(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.om2
    public int k(int i2) {
        int iB = B(i2);
        if (iB == -1 || B(iB) == -1) {
            return -1;
        }
        return iB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.om2
    public int l(int i2) {
        int iJ = J(i2);
        if (iJ == -1 || J(iJ) == -1) {
            return -1;
        }
        return iJ;
    }
}
