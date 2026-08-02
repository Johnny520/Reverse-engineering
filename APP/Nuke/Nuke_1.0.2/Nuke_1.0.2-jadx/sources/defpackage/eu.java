package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.widget.EdgeEffect;
import com.dokar.quickjs.binding.JsObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eu {
    public static final hh1 e;
    public static final hh1 f;
    public static final hh1 g;
    public static final hh1 h;
    public static final hh1 i;
    public static final float[] a = new float[91];
    public static final kw b = new kw(-748796150, false, new ye(17));
    public static final kw c = new kw(-1876006958, false, new ye(18));
    public static final ba0 d = new ba0();
    public static final xd0 j = new xd0(false);
    public static final xd0 k = new xd0(true);
    public static final qu l = qu.h;
    public static final qu m = qu.i;
    public static final StackTraceElement[] n = new StackTraceElement[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i2 = 19;
        e = new hh1(i2, "COMPLETING_ALREADY");
        f = new hh1(i2, "COMPLETING_WAITING_CHILDREN");
        g = new hh1(i2, "COMPLETING_RETRY");
        h = new hh1(i2, "TOO_LATE_TO_CANCEL");
        i = new hh1(i2, "SEALED");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte A(char c2) {
        if (c2 < '~') {
            return tq.b[c2];
        }
        return (byte) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int B(Iterable iterable, int i2) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final j20 C(px pxVar) {
        return new c82(((go0) pxVar).R);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final yl0 D(Context context) {
        gd3 gd3Var = new gd3(29);
        context.getApplicationContext();
        return new yl0(gd3Var, new y8(Build.VERSION.SDK_INT >= 31 ? jm0.a.a(context) : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static pb1 E() {
        return new pb1(10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object F(long j2, u00 u00Var) {
        if (j2 > 0) {
            mp mpVar = new mp(1, gf1.z(u00Var));
            mpVar.u();
            if (j2 < Long.MAX_VALUE) {
                K(mpVar.l).h(j2, mpVar);
            }
            Object objT = mpVar.t();
            if (objT == k20.h) {
                return objT;
            }
        }
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int G(int i2, List list) {
        int i3;
        int i4 = ((rw1) du.v0(list)).c;
        if (i2 > ((rw1) du.v0(list)).c) {
            lz0.a("Index " + i2 + " should be less or equal than last line's end " + i4);
        }
        int size = list.size() - 1;
        int i5 = 0;
        while (true) {
            if (i5 > size) {
                i3 = -(i5 + 1);
                break;
            }
            i3 = (i5 + size) >>> 1;
            rw1 rw1Var = (rw1) list.get(i3);
            byte b2 = rw1Var.b > i2 ? (byte) 1 : rw1Var.c <= i2 ? (byte) -1 : (byte) 0;
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i3 - 1;
            } else {
                i5 = i3 + 1;
            }
        }
        if (i3 >= 0 && i3 < list.size()) {
            return i3;
        }
        StringBuilder sbN = vi0.n(i3, "Found paragraph index ", " should be in range [0, ");
        sbN.append(list.size());
        sbN.append(").\nDebug info: index=");
        sbN.append(i2);
        sbN.append(", paragraphs=[");
        sbN.append(sb1.a(list, null, new vi1(8), 31));
        sbN.append(']');
        lz0.a(sbN.toString());
        return i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int H(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            rw1 rw1Var = (rw1) list.get(i4);
            byte b2 = rw1Var.d > i2 ? (byte) 1 : rw1Var.e <= i2 ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i3 = i4 + 1;
            } else {
                if (b2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int I(ArrayList arrayList, float f2) {
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((rw1) du.v0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            rw1 rw1Var = (rw1) arrayList.get(i3);
            byte b2 = rw1Var.f > f2 ? (byte) 1 : rw1Var.g <= f2 ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void J(ArrayList arrayList, long j2, in0 in0Var) {
        int size = arrayList.size();
        for (int iG = G(f13.f(j2), arrayList); iG < size; iG++) {
            rw1 rw1Var = (rw1) arrayList.get(iG);
            if (rw1Var.b >= f13.e(j2)) {
                return;
            }
            if (rw1Var.b != rw1Var.c) {
                in0Var.j(rw1Var);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final r60 K(a20 a20Var) {
        y10 y10VarO = a20Var.o(gd3.p);
        r60 r60Var = y10VarO instanceof r60 ? (r60) y10VarO : null;
        return r60Var == null ? l50.a : r60Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int L(List list) {
        list.getClass();
        return list.size() - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int M(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final y03 N(ln2 ln2Var) {
        in0 in0Var;
        ArrayList arrayList = new ArrayList();
        Object objG = ln2Var.h.g(kn2.a);
        if (objG == null) {
            objG = null;
        }
        q3 q3Var = (q3) objG;
        if (q3Var == null || (in0Var = (in0) q3Var.b) == null || !((Boolean) in0Var.j(arrayList)).booleanValue()) {
            return null;
        }
        return (y03) arrayList.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List O(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List P(Object... objArr) {
        if (objArr.length <= 0) {
            return be0.h;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList Q(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList R(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new zf(objArr, true));
    }

    /* JADX DEBUG: Class process forced to load method for inline: lz2.b(m13, e70, xl0):long */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void S(k03 k03Var, iz2 iz2Var, y03 y03Var, c61 c61Var, t03 t03Var, boolean z, us1 us1Var) {
        if (z) {
            int iP = us1Var.p(f13.e(k03Var.b));
            String str = lz2.a;
            o62 o62VarB = iP < y03Var.a.a.i.length() ? y03Var.b(iP) : iP != 0 ? y03Var.b(iP - 1) : new o62(0.0f, 0.0f, 1.0f, (int) (lz2.a(iz2Var.b, iz2Var.g, iz2Var.h, lz2.a, 1) & 4294967295L));
            float f2 = o62VarB.b;
            float f3 = o62VarB.a;
            long jM = c61Var.M((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
            o62 o62VarQ = q((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM >> 32)))) << 32), (((long) Float.floatToRawIntBits(o62VarB.c - f3)) << 32) | (((long) Float.floatToRawIntBits(o62VarB.d - f2)) & 4294967295L));
            if (t11.l((t03) t03Var.a.b.get(), t03Var)) {
                t03Var.b.h(o62VarQ);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final nb T(xm0 xm0Var, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        View view = (View) go0Var.j(r7.f);
        boolean zF = go0Var.f(view);
        Object objL = go0Var.L();
        eb ebVar = nx.a;
        if (zF || objL == ebVar) {
            objL = new nb(view, null, xm0Var);
            go0Var.f0(objL);
        }
        nb nbVar = (nb) objL;
        boolean zH = go0Var.h(nbVar);
        Object objL2 = go0Var.L();
        if (zH || objL2 == ebVar) {
            objL2 = new gb(nbVar, 3);
            go0Var.f0(objL2);
        }
        c(nbVar, (in0) objL2, go0Var);
        return nbVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float U(long j2, float f2, e70 e70Var) {
        float fC;
        long jB = p13.b(j2);
        if (q13.a(jB, 4294967296L)) {
            if (e70Var.m() <= 1.05d) {
                return e70Var.h0(j2);
            }
            fC = p13.c(j2) / p13.c(e70Var.p0(f2));
        } else {
            if (!q13.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = p13.c(j2);
        }
        return fC * f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ic V(nc ncVar, int i2) {
        Object next;
        Iterator<T> it = ncVar.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((r61) ((Map.Entry) next).getKey()).i == i2) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (ic) entry.getValue();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void W(Spannable spannable, long j2, int i2, int i3) {
        if (j2 != 16) {
            spannable.setSpan(new ForegroundColorSpan(sp0.j0(j2)), i2, i3, 33);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void X(Spannable spannable, long j2, e70 e70Var, int i2, int i3) {
        long jB = p13.b(j2);
        if (q13.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(gf1.Q(e70Var.h0(j2)), false), i2, i3, 33);
        } else if (q13.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(p13.c(j2)), i2, i3, 33);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void Y(Spannable spannable, kc1 kc1Var, int i2, int i3) {
        if (kc1Var != null) {
            ArrayList arrayList = new ArrayList(B(kc1Var, 10));
            Iterator it = kc1Var.h.iterator();
            while (it.hasNext()) {
                arrayList.add(((jc1) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i2, i3, 33);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void Z() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, uh1 uh1Var, final m13 m13Var, int i2, boolean z, int i3, int i4, px pxVar, final int i5, final int i6) {
        int i7;
        uh1 uh1Var2;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final uh1 uh1Var3;
        final int i16;
        final boolean z3;
        final int i17;
        final int i18;
        b62 b62VarR;
        boolean z4;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1040751001);
        if ((i5 & 6) == 0) {
            i7 = (go0Var.f(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i19 = i6 & 2;
        if (i19 != 0) {
            i7 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                uh1Var2 = uh1Var;
                i7 |= go0Var.f(uh1Var2) ? 32 : 16;
            }
            if ((i5 & 384) == 0) {
                i7 |= go0Var.f(m13Var) ? 256 : 128;
            }
            if ((i6 & 8) == 0) {
                i7 |= 3072;
            } else if ((i5 & 3072) == 0) {
                i7 |= go0Var.h(null) ? 2048 : 1024;
            }
            i8 = i6 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else {
                if ((i5 & 24576) == 0) {
                    i9 = i2;
                    i7 |= go0Var.d(i9) ? 16384 : 8192;
                }
                i10 = i6 & 32;
                if (i10 != 0) {
                    i7 |= 196608;
                } else {
                    if ((196608 & i5) == 0) {
                        z2 = z;
                        i7 |= go0Var.g(z2) ? 131072 : 65536;
                    }
                    i11 = i6 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i5) == 0) {
                            i12 = i3;
                            i7 |= go0Var.d(i12) ? 1048576 : 524288;
                        }
                        i13 = i6 & 128;
                        if (i13 != 0) {
                            i7 |= 12582912;
                            i14 = i4;
                        } else {
                            i14 = i4;
                            if ((i5 & 12582912) == 0) {
                                i7 |= go0Var.d(i14) ? 8388608 : 4194304;
                            }
                        }
                        i15 = i7 | 100663296;
                        int i20 = i7;
                        if ((i6 & AIChatConfig.DefaultMaxTokens) != 0) {
                            i15 = i20 | 905969664;
                        } else if ((805306368 & i5) == 0) {
                            i15 |= (1073741824 & i5) == 0 ? go0Var.f(null) : go0Var.h(null) ? 536870912 : 268435456;
                        }
                        if (go0Var.O(i15 & 1, (i15 & 306783379) != 306783378)) {
                            uh1 uh1Var4 = i19 != 0 ? rh1.a : uh1Var2;
                            if (i8 != 0) {
                                i9 = 1;
                            }
                            boolean z5 = i10 != 0 ? true : z2;
                            int i21 = i11 != 0 ? Integer.MAX_VALUE : i12;
                            if (i13 != 0) {
                                i14 = 1;
                            }
                            op0.C(i14, i21);
                            if (go0Var.j(jn2.a) != null) {
                                c80.g();
                                return;
                            }
                            go0Var.W(356914239);
                            go0Var.p(false);
                            xl0 xl0Var = (xl0) go0Var.j(ly.k);
                            Executor executor = (Executor) go0Var.j(lk.a);
                            if (executor != null) {
                                int length = str.length();
                                if (Build.VERSION.SDK_INT < 28 || length < 8 || length >= 1000) {
                                    z4 = false;
                                    go0Var.W(1255914055);
                                    go0Var.p(false);
                                    go0Var.W(357875859);
                                    go0Var.p(z4);
                                    boolean z6 = z5;
                                    int i22 = i21;
                                    int i23 = i14;
                                    int i24 = i9;
                                    uh1 uh1VarC = uh1Var4.c(new i13(str, m13Var, xl0Var, i24, z6, i22, i23));
                                    k8 k8Var = k8.e;
                                    int iHashCode = Long.hashCode(go0Var.T);
                                    uh1 uh1VarM = tl.M(go0Var, uh1VarC);
                                    yy1 yy1VarL = go0Var.l();
                                    hx.c.getClass();
                                    jy jyVar = gx.b;
                                    go0Var.Z();
                                    if (go0Var.S) {
                                        go0Var.i0();
                                    } else {
                                        go0Var.k(jyVar);
                                    }
                                    yf3.c(go0Var, gx.e, k8Var);
                                    yf3.c(go0Var, gx.d, yy1VarL);
                                    yf3.b(go0Var, gx.g);
                                    yf3.c(go0Var, gx.c, uh1VarM);
                                    yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
                                    go0Var.p(true);
                                    uh1Var3 = uh1Var4;
                                    i16 = i24;
                                    z3 = z6;
                                    i18 = i22;
                                    i17 = i23;
                                } else {
                                    if (lk.b == null) {
                                        lk.b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                                    }
                                    Boolean bool = lk.b;
                                    bool.getClass();
                                    if (bool.booleanValue()) {
                                        go0Var.W(1254298614);
                                        try {
                                            try {
                                                kk kkVar = new kk(m13Var, (d61) go0Var.j(ly.n), str, (e70) go0Var.j(ly.h), xl0Var, 0);
                                                xl0Var = xl0Var;
                                                executor.execute(kkVar);
                                            } catch (RejectedExecutionException unused) {
                                                xl0Var = xl0Var;
                                            }
                                        } catch (RejectedExecutionException unused2) {
                                        }
                                        z4 = false;
                                        go0Var.p(false);
                                    }
                                    go0Var.W(357875859);
                                    go0Var.p(z4);
                                    boolean z62 = z5;
                                    int i222 = i21;
                                    int i232 = i14;
                                    int i242 = i9;
                                    uh1 uh1VarC2 = uh1Var4.c(new i13(str, m13Var, xl0Var, i242, z62, i222, i232));
                                    k8 k8Var2 = k8.e;
                                    int iHashCode2 = Long.hashCode(go0Var.T);
                                    uh1 uh1VarM2 = tl.M(go0Var, uh1VarC2);
                                    yy1 yy1VarL2 = go0Var.l();
                                    hx.c.getClass();
                                    jy jyVar2 = gx.b;
                                    go0Var.Z();
                                    if (go0Var.S) {
                                    }
                                    yf3.c(go0Var, gx.e, k8Var2);
                                    yf3.c(go0Var, gx.d, yy1VarL2);
                                    yf3.b(go0Var, gx.g);
                                    yf3.c(go0Var, gx.c, uh1VarM2);
                                    yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode2));
                                    go0Var.p(true);
                                    uh1Var3 = uh1Var4;
                                    i16 = i242;
                                    z3 = z62;
                                    i18 = i222;
                                    i17 = i232;
                                }
                            }
                        } else {
                            go0Var.R();
                            uh1Var3 = uh1Var2;
                            i16 = i9;
                            z3 = z2;
                            i17 = i14;
                            i18 = i12;
                        }
                        b62VarR = go0Var.r();
                        if (b62VarR != null) {
                            b62VarR.d = new mn0() { // from class: jk
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // defpackage.mn0
                                public final Object g(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    eu.a(str, uh1Var3, m13Var, i16, z3, i18, i17, (px) obj, pp0.N(i5 | 1), i6);
                                    return a83.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i7 |= 1572864;
                    i12 = i3;
                    i13 = i6 & 128;
                    if (i13 != 0) {
                    }
                    i15 = i7 | 100663296;
                    int i202 = i7;
                    if ((i6 & AIChatConfig.DefaultMaxTokens) != 0) {
                    }
                    if (go0Var.O(i15 & 1, (i15 & 306783379) != 306783378)) {
                    }
                    b62VarR = go0Var.r();
                    if (b62VarR != null) {
                    }
                }
                z2 = z;
                i11 = i6 & 64;
                if (i11 != 0) {
                }
                i12 = i3;
                i13 = i6 & 128;
                if (i13 != 0) {
                }
                i15 = i7 | 100663296;
                int i2022 = i7;
                if ((i6 & AIChatConfig.DefaultMaxTokens) != 0) {
                }
                if (go0Var.O(i15 & 1, (i15 & 306783379) != 306783378)) {
                }
                b62VarR = go0Var.r();
                if (b62VarR != null) {
                }
            }
            i9 = i2;
            i10 = i6 & 32;
            if (i10 != 0) {
            }
            z2 = z;
            i11 = i6 & 64;
            if (i11 != 0) {
            }
            i12 = i3;
            i13 = i6 & 128;
            if (i13 != 0) {
            }
            i15 = i7 | 100663296;
            int i20222 = i7;
            if ((i6 & AIChatConfig.DefaultMaxTokens) != 0) {
            }
            if (go0Var.O(i15 & 1, (i15 & 306783379) != 306783378)) {
            }
            b62VarR = go0Var.r();
            if (b62VarR != null) {
            }
        }
        uh1Var2 = uh1Var;
        if ((i5 & 384) == 0) {
        }
        if ((i6 & 8) == 0) {
        }
        i8 = i6 & 16;
        if (i8 == 0) {
        }
        i9 = i2;
        i10 = i6 & 32;
        if (i10 != 0) {
        }
        z2 = z;
        i11 = i6 & 64;
        if (i11 != 0) {
        }
        i12 = i3;
        i13 = i6 & 128;
        if (i13 != 0) {
        }
        i15 = i7 | 100663296;
        int i202222 = i7;
        if ((i6 & AIChatConfig.DefaultMaxTokens) != 0) {
        }
        if (go0Var.O(i15 & 1, (i15 & 306783379) != 306783378)) {
        }
        b62VarR = go0Var.r();
        if (b62VarR != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(uh1 uh1Var, in0 in0Var, px pxVar, int i2) {
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-932836462);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.f(uh1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (go0Var.h(in0Var) ? 32 : 16);
        int i5 = 0;
        if (go0Var.O(i4 & 1, (i4 & 19) != 18)) {
            rp0.O(go0Var, qp0.s(uh1Var, in0Var));
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new up(i2, i5, uh1Var, in0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b0(int i2, int i3, yo2 yo2Var) {
        yo2Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i4 = (~i2) & i3;
        for (int i5 = 0; i5 < 32; i5++) {
            if ((i4 & 1) != 0) {
                arrayList.add(yo2Var.e(i5));
            }
            i4 >>>= 1;
        }
        String strB = yo2Var.b();
        strB.getClass();
        throw new dh1(arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + strB + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + strB + "', but they were missing", null, arrayList, strB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(Object obj, in0 in0Var, px pxVar) {
        go0 go0Var = (go0) pxVar;
        boolean zF = go0Var.f(obj);
        Object objL = go0Var.L();
        if (zF || objL == nx.a) {
            objL = new z90(in0Var);
            go0Var.f0(objL);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ExtractedText c0(k03 k03Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = k03Var.a.i;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = k03Var.b;
        extractedText.selectionStart = f13.f(j2);
        extractedText.selectionEnd = f13.e(j2);
        extractedText.flags = !pv2.i0(k03Var.a.i, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(Object obj, Object obj2, in0 in0Var, px pxVar) {
        go0 go0Var = (go0) pxVar;
        boolean zF = go0Var.f(obj) | go0Var.f(obj2);
        Object objL = go0Var.L();
        if (zF || objL == nx.a) {
            objL = new z90(in0Var);
            go0Var.f0(objL);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String d0(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == 127 ? "invalid token" : "valid token";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0a5f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0a70  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final List list, final List list2, final String str, final in0 in0Var, final boolean z, in0 in0Var2, final rs2 rs2Var, final mn0 mn0Var, final mn0 mn0Var2, final mn0 mn0Var3, px pxVar, final int i2) throws Throwable {
        in0 in0Var3;
        go0 go0Var;
        int i3;
        Context context;
        View view;
        Throwable th;
        int i4;
        List list3;
        String str2;
        int i5;
        int size;
        Map map;
        List list4;
        String str3;
        int i6;
        sx0 sx0VarB;
        boolean z2;
        eb ebVar;
        boolean zF;
        Object objL;
        list.getClass();
        list2.getClass();
        str.getClass();
        in0Var.getClass();
        in0Var2.getClass();
        rs2Var.getClass();
        mn0Var.getClass();
        mn0Var2.getClass();
        mn0Var3.getClass();
        go0 go0Var2 = (go0) pxVar;
        go0Var2.X(721039128);
        int i7 = i2 | (go0Var2.f(list) ? 4 : 2) | (go0Var2.f(list2) ? 32 : 16) | (go0Var2.f(str) ? 256 : 128) | (go0Var2.h(in0Var) ? 2048 : 1024) | (go0Var2.g(z) ? 16384 : 8192) | (go0Var2.h(in0Var2) ? 131072 : 65536) | (go0Var2.f(rs2Var) ? 1048576 : 524288) | (go0Var2.h(mn0Var) ? 8388608 : 4194304) | (go0Var2.h(mn0Var2) ? 67108864 : 33554432) | (go0Var2.h(mn0Var3) ? 536870912 : 268435456);
        if (go0Var2.O(i7 & 1, (i7 & 306783379) != 306783378)) {
            Context context2 = (Context) go0Var2.j(r7.b);
            View view2 = (View) go0Var2.j(r7.f);
            Object[] objArr = new Object[0];
            Object objL2 = go0Var2.L();
            eb ebVar2 = nx.a;
            if (objL2 == ebVar2) {
                i3 = i7;
                objL2 = new dy(13);
                go0Var2.f0(objL2);
            } else {
                i3 = i7;
            }
            xk1 xk1Var = (xk1) gf1.M(objArr, (xm0) objL2, go0Var2, 48);
            int i8 = i3 & 458752;
            boolean zF2 = ((i3 & 57344) == 16384) | go0Var2.f(xk1Var) | (i8 == 131072);
            Object objL3 = go0Var2.L();
            if (zF2 || objL3 == ebVar2) {
                objL3 = new dt0(1, in0Var2, xk1Var, z);
                go0Var2.f0(objL3);
            }
            final in0 in0Var4 = (in0) objL3;
            String string = pv2.I0(str).toString();
            int i9 = i3 & 14;
            boolean z3 = i9 == 4;
            Object objL4 = go0Var2.L();
            Object obj = objL4;
            if (z3 || objL4 == ebVar2) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : list) {
                    wm0 wm0VarN = ((gw) obj2).n();
                    Object obj3 = linkedHashMap.get(wm0VarN);
                    if (obj3 == null) {
                        ArrayList arrayList = new ArrayList();
                        linkedHashMap.put(wm0VarN, arrayList);
                        obj3 = arrayList;
                    }
                    ((List) obj3).add(obj2);
                }
                go0Var2.f0(linkedHashMap);
                obj = linkedHashMap;
            }
            Map map2 = (Map) obj;
            boolean zF3 = (i9 == 4) | go0Var2.f(string) | go0Var2.f(context2);
            Object objL5 = go0Var2.L();
            if (zF3 || objL5 == ebVar2) {
                if (pv2.s0(string)) {
                    objL5 = be0.h;
                    context = context2;
                    view = view2;
                    th = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        gw gwVar = (gw) next;
                        String string2 = context2.getString(gwVar.m());
                        string2.getClass();
                        Integer numK = gwVar.k();
                        Iterator it2 = it;
                        String string3 = numK != null ? context2.getString(numK.intValue()) : null;
                        if (string3 == null) {
                            string3 = "";
                        }
                        View view3 = view2;
                        String string4 = context2.getString(gwVar.n().h);
                        string4.getClass();
                        Context context3 = context2;
                        String strO = sp0.O(string);
                        if (!pv2.s0(strO)) {
                            List listP = P(string2, string3, string4, gwVar.d());
                            if (!listP.isEmpty()) {
                                Iterator it3 = listP.iterator();
                                while (it3.hasNext()) {
                                    String strO2 = sp0.O((String) it3.next());
                                    if (!pv2.h0(strO2, strO, false)) {
                                        int length = strO2.length();
                                        Iterator it4 = it3;
                                        int i10 = 0;
                                        int i11 = 0;
                                        while (i11 < length) {
                                            int i12 = length;
                                            String str4 = strO2;
                                            if (strO2.charAt(i11) != strO.charAt(i10) || (i10 = i10 + 1) != strO.length()) {
                                                i11++;
                                                length = i12;
                                                strO2 = str4;
                                            }
                                        }
                                        it3 = it4;
                                    }
                                    arrayList2.add(next);
                                }
                            }
                        }
                        view2 = view3;
                        it = it2;
                        context2 = context3;
                    }
                    context = context2;
                    view = view2;
                    th = null;
                    objL5 = arrayList2;
                }
                go0Var2.f0(objL5);
            } else {
                context = context2;
                view = view2;
                th = null;
            }
            List list5 = (List) objL5;
            boolean zF4 = go0Var2.f(map2) | ((i3 & 112) == 32);
            Object objL6 = go0Var2.L();
            if (zF4 || objL6 == ebVar2) {
                if (list2.isEmpty()) {
                    i4 = 0;
                } else {
                    Iterator it5 = list2.iterator();
                    i4 = 0;
                    while (it5.hasNext()) {
                        vj vjVar = (vj) it5.next();
                        pp1 pp1Var = pp1.a;
                        if (pp1.e(vjVar.d()) || !vjVar.b.isEmpty()) {
                            i4++;
                            if (i4 < 0) {
                                Z();
                                throw th;
                            }
                        }
                    }
                }
                ArrayList arrayListL0 = du.l0(3, wm0.q);
                int i13 = 10;
                ArrayList arrayList3 = new ArrayList(B(arrayListL0, 10));
                Iterator it6 = arrayListL0.iterator();
                while (it6.hasNext()) {
                    List list6 = (List) it6.next();
                    Iterator it7 = it6;
                    ArrayList arrayList4 = new ArrayList(B(list6, i13));
                    Iterator it8 = list6.iterator();
                    while (it8.hasNext()) {
                        wm0 wm0Var = (wm0) it8.next();
                        wm0 wm0Var2 = wm0.o;
                        if (wm0Var == wm0Var2) {
                            size = list2.size();
                        } else {
                            List list7 = (List) map2.get(wm0Var);
                            size = list7 != null ? list7.size() : 0;
                        }
                        Iterator it9 = it8;
                        int i14 = wm0Var.h;
                        switch (wm0Var.ordinal()) {
                            case 0:
                                map = map2;
                                list4 = list5;
                                str3 = string;
                                i6 = i8;
                                sx0VarB = sp0.l;
                                if (sx0VarB == null) {
                                    rx0 rx0Var = new rx0("AutoMirrored.Filled.Send", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                                    int i15 = s93.a;
                                    ft2 ft2Var = new ft2(ju.b);
                                    ArrayList arrayList5 = new ArrayList(32);
                                    arrayList5.add(new cy1(2.01f, 21.0f));
                                    arrayList5.add(new by1(23.0f, 12.0f));
                                    arrayList5.add(new by1(2.01f, 3.0f));
                                    arrayList5.add(new by1(2.0f, 10.0f));
                                    arrayList5.add(new jy1(15.0f, 2.0f));
                                    arrayList5.add(new jy1(-15.0f, 2.0f));
                                    arrayList5.add(yx1.c);
                                    rx0.a(rx0Var, arrayList5, ft2Var);
                                    sx0VarB = rx0Var.b();
                                    sp0.l = sx0VarB;
                                }
                                break;
                            case 1:
                                map = map2;
                                list4 = list5;
                                str3 = string;
                                i6 = i8;
                                sx0VarB = qp0.s;
                                if (sx0VarB == null) {
                                    rx0 rx0Var2 = new rx0("Filled.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i16 = s93.a;
                                    ft2 ft2Var2 = new ft2(ju.b);
                                    ye0 ye0Var = new ye0(3);
                                    ye0Var.k(12.0f, 12.0f);
                                    ye0Var.e(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
                                    ye0Var.m(-1.79f, -4.0f, -4.0f, -4.0f);
                                    ye0Var.m(-4.0f, 1.79f, -4.0f, 4.0f);
                                    ye0Var.m(1.79f, 4.0f, 4.0f, 4.0f);
                                    ye0Var.c();
                                    ye0Var.k(12.0f, 14.0f);
                                    ye0Var.e(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
                                    ye0Var.o(2.0f);
                                    ye0Var.h(16.0f);
                                    ye0Var.o(-2.0f);
                                    ye0Var.e(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
                                    ye0Var.c();
                                    rx0.a(rx0Var2, ye0Var.a, ft2Var2);
                                    sx0VarB = rx0Var2.b();
                                    qp0.s = sx0VarB;
                                }
                                break;
                            case 2:
                                map = map2;
                                list4 = list5;
                                str3 = string;
                                i6 = i8;
                                sx0VarB = se.H();
                                break;
                            case 3:
                                map = map2;
                                list4 = list5;
                                str3 = string;
                                i6 = i8;
                                sx0 sx0Var = up0.o;
                                if (sx0Var != null) {
                                    sx0VarB = sx0Var;
                                } else {
                                    rx0 rx0Var3 = new rx0("Filled.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i17 = s93.a;
                                    ft2 ft2Var3 = new ft2(ju.b);
                                    ye0 ye0Var2 = new ye0(3);
                                    ye0Var2.k(12.0f, 17.27f);
                                    ye0Var2.i(18.18f, 21.0f);
                                    ye0Var2.j(-1.64f, -7.03f);
                                    ye0Var2.i(22.0f, 9.24f);
                                    ye0Var2.j(-7.19f, -0.61f);
                                    ye0Var2.i(12.0f, 2.0f);
                                    ye0Var2.i(9.19f, 8.63f);
                                    ye0Var2.i(2.0f, 9.24f);
                                    ye0Var2.j(5.46f, 4.73f);
                                    ye0Var2.i(5.82f, 21.0f);
                                    ye0Var2.c();
                                    rx0.a(rx0Var3, ye0Var2.a, ft2Var3);
                                    sx0VarB = rx0Var3.b();
                                    up0.o = sx0VarB;
                                }
                                break;
                            case 4:
                                map = map2;
                                list4 = list5;
                                str3 = string;
                                i6 = i8;
                                sx0VarB = p7.u();
                                break;
                            case 5:
                                map = map2;
                                list4 = list5;
                                str3 = string;
                                i6 = i8;
                                sx0VarB = p7.v();
                                break;
                            case AIChatConfig.DefaultContextRounds /* 6 */:
                                map = map2;
                                list4 = list5;
                                str3 = string;
                                i6 = i8;
                                sx0VarB = pp0.v();
                                break;
                            case 7:
                                sx0VarB = gf1.e;
                                if (sx0VarB != null) {
                                    map = map2;
                                    list4 = list5;
                                    str3 = string;
                                    i6 = i8;
                                } else {
                                    rx0 rx0Var4 = new rx0("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i18 = s93.a;
                                    map = map2;
                                    str3 = string;
                                    ft2 ft2Var4 = new ft2(ju.b);
                                    ye0 ye0Var3 = new ye0(3);
                                    list4 = list5;
                                    ye0Var3.k(19.14f, 12.94f);
                                    ye0Var3.e(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
                                    ye0Var3.e(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
                                    ye0Var3.j(2.03f, -1.58f);
                                    ye0Var3.e(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
                                    ye0Var3.j(-1.92f, -3.32f);
                                    ye0Var3.e(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
                                    ye0Var3.j(-2.39f, 0.96f);
                                    ye0Var3.e(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
                                    ye0Var3.i(14.4f, 2.81f);
                                    ye0Var3.e(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
                                    ye0Var3.h(-3.84f);
                                    ye0Var3.e(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
                                    ye0Var3.i(9.25f, 5.35f);
                                    ye0Var3.d(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
                                    ye0Var3.i(5.24f, 5.33f);
                                    ye0Var3.e(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
                                    ye0Var3.i(2.74f, 8.87f);
                                    ye0Var3.d(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
                                    ye0Var3.j(2.03f, 1.58f);
                                    ye0Var3.d(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
                                    i6 = i8;
                                    ye0Var3.m(0.02f, 0.64f, 0.07f, 0.94f);
                                    ye0Var3.j(-2.03f, 1.58f);
                                    ye0Var3.e(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
                                    ye0Var3.j(1.92f, 3.32f);
                                    ye0Var3.e(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
                                    ye0Var3.j(2.39f, -0.96f);
                                    ye0Var3.e(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
                                    ye0Var3.j(0.36f, 2.54f);
                                    ye0Var3.e(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
                                    ye0Var3.h(3.84f);
                                    ye0Var3.e(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
                                    ye0Var3.j(0.36f, -2.54f);
                                    ye0Var3.e(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
                                    ye0Var3.j(2.39f, 0.96f);
                                    ye0Var3.e(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
                                    ye0Var3.j(1.92f, -3.32f);
                                    ye0Var3.e(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
                                    ye0Var3.i(19.14f, 12.94f);
                                    ye0Var3.c();
                                    ye0Var3.k(12.0f, 15.6f);
                                    ye0Var3.e(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
                                    ye0Var3.m(1.62f, -3.6f, 3.6f, -3.6f);
                                    ye0Var3.m(3.6f, 1.62f, 3.6f, 3.6f);
                                    ye0Var3.l(13.98f, 15.6f, 12.0f, 15.6f);
                                    ye0Var3.c();
                                    rx0.a(rx0Var4, ye0Var3.a, ft2Var4);
                                    sx0VarB = rx0Var4.b();
                                    gf1.e = sx0VarB;
                                }
                                break;
                            default:
                                c80.s();
                                return;
                        }
                        arrayList4.add(new yp2(i14, sx0VarB, wm0Var.name(), (wm0Var != wm0Var2 || i4 <= 0) ? String.valueOf(size) : vi0.g("!", i4), wm0Var == wm0Var2 && i4 > 0));
                        it8 = it9;
                        map2 = map;
                        string = str3;
                        list5 = list4;
                        i8 = i6;
                    }
                    arrayList3.add(arrayList4);
                    it6 = it7;
                    i13 = 10;
                }
                list3 = list5;
                str2 = string;
                i5 = i8;
                go0Var2.f0(arrayList3);
                objL6 = arrayList3;
            } else {
                list3 = list5;
                str2 = string;
                i5 = i8;
            }
            final List list8 = (List) objL6;
            Object objL7 = go0Var2.L();
            if (objL7 == ebVar2) {
                yp2 yp2Var = new yp2(R.string.home_settings_check_update, p7.u(), null, null, false);
                sx0 sx0VarB2 = qp0.r;
                if (sx0VarB2 == null) {
                    rx0 rx0Var5 = new rx0("Filled.Code", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i19 = s93.a;
                    ft2 ft2Var5 = new ft2(ju.b);
                    ye0 ye0Var4 = new ye0(3);
                    ye0Var4.k(9.4f, 16.6f);
                    ye0Var4.i(4.8f, 12.0f);
                    ye0Var4.j(4.6f, -4.6f);
                    ye0Var4.i(8.0f, 6.0f);
                    ye0Var4.j(-6.0f, 6.0f);
                    ye0Var4.j(6.0f, 6.0f);
                    ye0Var4.j(1.4f, -1.4f);
                    ye0Var4.c();
                    ye0Var4.k(14.6f, 16.6f);
                    ye0Var4.j(4.6f, -4.6f);
                    ye0Var4.j(-4.6f, -4.6f);
                    ye0Var4.i(16.0f, 6.0f);
                    ye0Var4.j(6.0f, 6.0f);
                    ye0Var4.j(-6.0f, 6.0f);
                    ye0Var4.j(-1.4f, -1.4f);
                    ye0Var4.c();
                    rx0.a(rx0Var5, ye0Var4.a, ft2Var5);
                    sx0VarB2 = rx0Var5.b();
                    qp0.r = sx0VarB2;
                }
                yp2 yp2Var2 = new yp2(R.string.home_settings_scripts, sx0VarB2, null, null, false);
                sx0 sx0VarB3 = rp0.n;
                if (sx0VarB3 == null) {
                    rx0 rx0Var6 = new rx0("Filled.Home", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i20 = s93.a;
                    ft2 ft2Var6 = new ft2(ju.b);
                    ye0 ye0Var5 = new ye0(3);
                    ye0Var5.k(10.0f, 20.0f);
                    ye0Var5.o(-6.0f);
                    ye0Var5.h(4.0f);
                    ye0Var5.o(6.0f);
                    ye0Var5.h(5.0f);
                    ye0Var5.o(-8.0f);
                    ye0Var5.h(3.0f);
                    ye0Var5.i(12.0f, 3.0f);
                    ye0Var5.i(2.0f, 12.0f);
                    ye0Var5.h(3.0f);
                    ye0Var5.o(8.0f);
                    ye0Var5.c();
                    rx0.a(rx0Var6, ye0Var5.a, ft2Var6);
                    sx0VarB3 = rx0Var6.b();
                    rp0.n = sx0VarB3;
                }
                z2 = true;
                objL7 = P(P(yp2Var, yp2Var2, new yp2(R.string.home_settings_appearance, sx0VarB3, null, null, false)), P(new yp2(R.string.home_settings_about_module, pp0.v(), null, null, false), new yp2(R.string.home_settings_reward_us, p7.v(), null, null, false)));
                go0Var2.f0(objL7);
            } else {
                z2 = true;
            }
            final List list9 = (List) objL7;
            final View view4 = view;
            final Context context4 = context;
            final String str5 = str2;
            final List list10 = list3;
            int i21 = i5;
            ci0.p(xe1.i0(-1830109917, new mn0() { // from class: mt0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj4, Object obj5) {
                    px pxVar2 = (px) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    go0 go0Var3 = (go0) pxVar2;
                    if (go0Var3.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                        yi0 yi0Var = te.g;
                        av avVarA = yu.a(tp0.c, sn.u, go0Var3, 0);
                        int iHashCode = Long.hashCode(go0Var3.T);
                        yy1 yy1VarL = go0Var3.l();
                        uh1 uh1VarM = tl.M(go0Var3, yi0Var);
                        hx.c.getClass();
                        jy jyVar = gx.b;
                        go0Var3.Z();
                        if (go0Var3.S) {
                            go0Var3.k(jyVar);
                        } else {
                            go0Var3.i0();
                        }
                        yf3.c(go0Var3, gx.e, avVarA);
                        yf3.c(go0Var3, gx.d, yy1VarL);
                        yf3.c(go0Var3, gx.f, Integer.valueOf(iHashCode));
                        yf3.b(go0Var3, gx.g);
                        yf3.c(go0Var3, gx.c, uh1VarM);
                        tp0.c(rg3.P(R.string.home_settings_title, go0Var3), null, null, null, go0Var3, 0, 62);
                        uh1 uh1VarC = te.e.c(new g71(1.0f, true));
                        jw1 jw1VarH = fg1.h();
                        xf xfVar = new xf(12.0f, new s(2));
                        final String str6 = str;
                        boolean zF5 = go0Var3.f(str6);
                        final in0 in0Var5 = in0Var;
                        boolean zF6 = zF5 | go0Var3.f(in0Var5);
                        final String str7 = str5;
                        boolean zF7 = zF6 | go0Var3.f(str7);
                        final List list11 = list10;
                        boolean zH = zF7 | go0Var3.h(list11);
                        final View view5 = view4;
                        boolean zH2 = zH | go0Var3.h(view5);
                        final rs2 rs2Var2 = rs2Var;
                        boolean zF8 = zH2 | go0Var3.f(rs2Var2);
                        final mn0 mn0Var4 = mn0Var;
                        boolean zF9 = zF8 | go0Var3.f(mn0Var4);
                        final boolean z4 = z;
                        boolean zG = zF9 | go0Var3.g(z4);
                        final in0 in0Var6 = in0Var4;
                        boolean zF10 = zG | go0Var3.f(in0Var6);
                        final List list12 = list8;
                        boolean zH3 = zF10 | go0Var3.h(list12);
                        final mn0 mn0Var5 = mn0Var2;
                        boolean zF11 = zH3 | go0Var3.f(mn0Var5);
                        final List list13 = list9;
                        boolean zH4 = zF11 | go0Var3.h(list13);
                        final Context context5 = context4;
                        boolean zH5 = zH4 | go0Var3.h(context5);
                        final mn0 mn0Var6 = mn0Var3;
                        boolean zF12 = zH5 | go0Var3.f(mn0Var6);
                        Object objL8 = go0Var3.L();
                        if (zF12 || objL8 == nx.a) {
                            objL8 = new in0() { // from class: ot0
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // defpackage.in0
                                public final Object j(Object obj6) {
                                    s81 s81Var = (s81) obj6;
                                    s81Var.getClass();
                                    String str8 = str6;
                                    in0 in0Var7 = in0Var5;
                                    String str9 = str7;
                                    s81.a(s81Var, null, new kw(-1560095826, true, new tr(str8, in0Var7, str9, 3)), 3);
                                    if (pv2.s0(str9)) {
                                        s81.a(s81Var, null, new kw(-935749851, true, new cb(2, in0Var6, z4)), 3);
                                        final int i22 = 0;
                                        final int i23 = 0;
                                        for (Object obj7 : list12) {
                                            int i24 = i23 + 1;
                                            if (i23 < 0) {
                                                eu.a0();
                                                throw null;
                                            }
                                            final List list14 = (List) obj7;
                                            String strG = vi0.g("hooker_group_", i23);
                                            final mn0 mn0Var7 = mn0Var5;
                                            s81.a(s81Var, strG, new kw(1517561127, true, new nn0() { // from class: it0
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // defpackage.nn0
                                                public final Object e(Object obj8, Object obj9, Object obj10) {
                                                    String strP;
                                                    px pxVar3 = (px) obj9;
                                                    int iIntValue2 = ((Integer) obj10).intValue();
                                                    ((o71) obj8).getClass();
                                                    go0 go0Var4 = (go0) pxVar3;
                                                    if (go0Var4.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        if (i23 == 0) {
                                                            go0Var4.W(837878629);
                                                            strP = rg3.P(R.string.home_settings_modules_section, go0Var4);
                                                            go0Var4.p(false);
                                                        } else {
                                                            go0Var4.W(838000087);
                                                            go0Var4.p(false);
                                                            strP = null;
                                                        }
                                                        mn0 mn0Var8 = mn0Var7;
                                                        boolean zF13 = go0Var4.f(mn0Var8);
                                                        Object objL9 = go0Var4.L();
                                                        if (zF13 || objL9 == nx.a) {
                                                            objL9 = new lt0(0, mn0Var8);
                                                            go0Var4.f0(objL9);
                                                        }
                                                        ci0.n(strP, list14, (mn0) objL9, go0Var4, 0);
                                                    } else {
                                                        go0Var4.R();
                                                    }
                                                    return a83.a;
                                                }
                                            }), 2);
                                            i23 = i24;
                                        }
                                        for (Object obj8 : list13) {
                                            int i25 = i22 + 1;
                                            if (i22 < 0) {
                                                eu.a0();
                                                throw null;
                                            }
                                            final List list15 = (List) obj8;
                                            String strG2 = vi0.g("secondary_group_", i22);
                                            final Context context6 = context5;
                                            final mn0 mn0Var8 = mn0Var6;
                                            s81.a(s81Var, strG2, new kw(1755082334, true, new nn0() { // from class: jt0
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // defpackage.nn0
                                                public final Object e(Object obj9, Object obj10, Object obj11) {
                                                    String strP;
                                                    px pxVar3 = (px) obj10;
                                                    int iIntValue2 = ((Integer) obj11).intValue();
                                                    ((o71) obj9).getClass();
                                                    go0 go0Var4 = (go0) pxVar3;
                                                    if (go0Var4.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        if (i22 == 0) {
                                                            go0Var4.W(-1273947442);
                                                            strP = rg3.P(R.string.home_settings_general_section, go0Var4);
                                                            go0Var4.p(false);
                                                        } else {
                                                            go0Var4.W(-1273825984);
                                                            go0Var4.p(false);
                                                            strP = null;
                                                        }
                                                        Context context7 = context6;
                                                        boolean zH6 = go0Var4.h(context7);
                                                        mn0 mn0Var9 = mn0Var8;
                                                        boolean zF13 = zH6 | go0Var4.f(mn0Var9);
                                                        Object objL9 = go0Var4.L();
                                                        if (zF13 || objL9 == nx.a) {
                                                            objL9 = new af(9, context7, mn0Var9);
                                                            go0Var4.f0(objL9);
                                                        }
                                                        ci0.n(strP, list15, (mn0) objL9, go0Var4, 0);
                                                    } else {
                                                        go0Var4.R();
                                                    }
                                                    return a83.a;
                                                }
                                            }), 2);
                                            i22 = i25;
                                        }
                                        s81.a(s81Var, null, sp0.e, 3);
                                    } else {
                                        s81.a(s81Var, null, new kw(954884169, true, new b81(list11, view5, rs2Var2, mn0Var4, 5)), 3);
                                        s81.a(s81Var, null, sp0.c, 3);
                                    }
                                    return a83.a;
                                }
                            };
                            go0Var3.f0(objL8);
                        }
                        rg3.d(24960, 490, null, xfVar, null, go0Var3, null, (in0) objL8, null, uh1VarC, jw1VarH, false);
                        go0Var3.p(true);
                    } else {
                        go0Var3.R();
                    }
                    return a83.a;
                }
            }, go0Var2), go0Var2, 6);
            if (((Boolean) xk1Var.getValue()).booleanValue()) {
                go0Var2.W(1354262211);
                String strP = rg3.P(R.string.home_settings_safety_enable_title, go0Var2);
                String strP2 = rg3.P(R.string.home_settings_safety_enable_message, go0Var2);
                String strP3 = rg3.P(R.string.home_settings_enable, go0Var2);
                String strP4 = rg3.P(R.string.home_settings_cancel, go0Var2);
                boolean zF5 = go0Var2.f(xk1Var);
                Object objL8 = go0Var2.L();
                if (zF5) {
                    ebVar = ebVar2;
                } else {
                    ebVar = ebVar2;
                    if (objL8 == ebVar) {
                    }
                    xm0 xm0Var = (xm0) objL8;
                    zF = go0Var2.f(xk1Var) | (i21 != 131072 ? z2 : false);
                    objL = go0Var2.L();
                    if (!zF || objL == ebVar) {
                        in0Var3 = in0Var2;
                        objL = new ph(in0Var3, xk1Var, 4);
                        go0Var2.f0(objL);
                    } else {
                        in0Var3 = in0Var2;
                    }
                    xm0 xm0Var2 = (xm0) objL;
                    go0 go0Var3 = go0Var2;
                    qp0.c(xm0Var, strP, strP2, strP3, xm0Var2, null, strP4, null, go0Var3, 0, 160);
                    go0Var3.p(false);
                    go0Var = go0Var3;
                }
                objL8 = new f0(xk1Var, 24);
                go0Var2.f0(objL8);
                xm0 xm0Var3 = (xm0) objL8;
                zF = go0Var2.f(xk1Var) | (i21 != 131072 ? z2 : false);
                objL = go0Var2.L();
                if (zF) {
                    in0Var3 = in0Var2;
                    objL = new ph(in0Var3, xk1Var, 4);
                    go0Var2.f0(objL);
                    xm0 xm0Var22 = (xm0) objL;
                    go0 go0Var32 = go0Var2;
                    qp0.c(xm0Var3, strP, strP2, strP3, xm0Var22, null, strP4, null, go0Var32, 0, 160);
                    go0Var32.p(false);
                    go0Var = go0Var32;
                }
            } else {
                in0Var3 = in0Var2;
                go0 go0Var4 = go0Var2;
                go0Var4.W(1354889930);
                go0Var4.p(false);
                go0Var = go0Var4;
            }
        } else {
            go0 go0Var5 = go0Var2;
            in0Var3 = in0Var2;
            go0Var5.R();
            go0Var = go0Var5;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            final in0 in0Var5 = in0Var3;
            b62VarR.d = new mn0(list, list2, str, in0Var, z, in0Var5, rs2Var, mn0Var, mn0Var2, mn0Var3, i2) { // from class: nt0
                public final /* synthetic */ List h;
                public final /* synthetic */ List i;
                public final /* synthetic */ String j;
                public final /* synthetic */ in0 k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ in0 m;
                public final /* synthetic */ rs2 n;
                public final /* synthetic */ mn0 o;
                public final /* synthetic */ mn0 p;
                public final /* synthetic */ mn0 q;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj4, Object obj5) throws Throwable {
                    ((Integer) obj5).getClass();
                    int iN = pp0.N(1);
                    eu.e(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (px) obj4, iN);
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object e0(Object obj) {
        cy0 cy0Var;
        dy0 dy0Var = obj instanceof dy0 ? (dy0) obj : null;
        return (dy0Var == null || (cy0Var = dy0Var.a) == null) ? obj : cy0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(px pxVar, mn0 mn0Var, Object obj) {
        a20 a20Var = ((go0) pxVar).R;
        go0 go0Var = (go0) pxVar;
        boolean zF = go0Var.f(obj);
        Object objL = go0Var.L();
        if (zF || objL == nx.a) {
            objL = new y51(a20Var, mn0Var);
            go0Var.f0(objL);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(Object obj, Object obj2, mn0 mn0Var, px pxVar) {
        a20 a20Var = ((go0) pxVar).R;
        go0 go0Var = (go0) pxVar;
        boolean zF = go0Var.f(obj) | go0Var.f(obj2);
        Object objL = go0Var.L();
        if (zF || objL == nx.a) {
            objL = new y51(a20Var, mn0Var);
            go0Var.f0(objL);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(Boolean bool, Object obj, ia1 ia1Var, in0 in0Var, px pxVar, int i2) {
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(696924721);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.h(bool) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go0Var.h(in0Var) ? 2048 : 1024;
        }
        if (go0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            go0Var.T();
            if ((i2 & 1) == 0 || go0Var.y()) {
                ia1Var = (ia1) go0Var.j(zb1.a);
            } else {
                go0Var.R();
            }
            int i4 = i3 & (-897);
            go0Var.q();
            boolean zF = go0Var.f(bool) | go0Var.f(obj) | go0Var.f(ia1Var);
            Object objL = go0Var.L();
            if (zF || objL == nx.a) {
                objL = new pa1(ia1Var.getLifecycle());
                go0Var.f0(objL);
            }
            i(ia1Var, (pa1) objL, in0Var, go0Var, (i4 >> 3) & 896);
        } else {
            go0Var.R();
        }
        ia1 ia1Var2 = ia1Var;
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new hw(bool, obj, ia1Var2, in0Var, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(ia1 ia1Var, pa1 pa1Var, in0 in0Var, px pxVar, int i2) {
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(228371534);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.h(ia1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(pa1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var.h(in0Var) ? 256 : 128;
        }
        if (go0Var.O(i3 & 1, (i3 & 147) != 146)) {
            boolean zH = go0Var.h(pa1Var) | ((i3 & 896) == 256) | go0Var.h(ia1Var);
            Object objL = go0Var.L();
            if (zH || objL == nx.a) {
                objL = new m0(ia1Var, pa1Var, in0Var, 8);
                go0Var.f0(objL);
            }
            d(ia1Var, pa1Var, (in0) objL, go0Var);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new va(ia1Var, pa1Var, in0Var, i2, 10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(List list, Object obj, in0 in0Var, in0 in0Var2, boolean z, px pxVar, int i2) {
        int i3;
        in0 in0Var3;
        in0 in0Var4;
        go0 go0Var;
        int i4;
        long jB;
        go0 go0Var2 = (go0) pxVar;
        go0Var2.X(-1647657696);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? go0Var2.f(list) : go0Var2.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? go0Var2.f(obj) : go0Var2.h(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            in0Var3 = in0Var;
            i3 |= go0Var2.h(in0Var3) ? 256 : 128;
        } else {
            in0Var3 = in0Var;
        }
        if ((i2 & 3072) == 0) {
            in0Var4 = in0Var2;
            i3 |= go0Var2.h(in0Var4) ? 2048 : 1024;
        } else {
            in0Var4 = in0Var2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= go0Var2.g(z) ? 16384 : 8192;
        }
        int i5 = 0;
        if (go0Var2.O(i3 & 1, (i3 & 9363) != 9362)) {
            Object objL = go0Var2.L();
            eb ebVar = nx.a;
            if (objL == ebVar) {
                objL = op0.u(Boolean.FALSE);
                go0Var2.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            Object objL2 = go0Var2.L();
            t00 t00Var = null;
            if (objL2 == ebVar) {
                objL2 = new ir1(xk1Var, t00Var, i5);
                go0Var2.f0(objL2);
            }
            f(go0Var2, (mn0) objL2, a83.a);
            gu2 gu2VarB = uc.b(((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.94f, up0.G(0.5f, 1500.0f, null, 4), "SelectPanelScaleX", go0Var2, 3120);
            gu2 gu2VarB2 = uc.b(((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.82f, up0.G(0.75f, 400.0f, null, 4), "SelectPanelScaleY", go0Var2, 3120);
            gu2 gu2VarB3 = uc.b(((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.0f, up0.J(120, null, 6), "SelectPanelAlpha", go0Var2, 3120);
            if (((Boolean) xk1Var.getValue()).booleanValue()) {
                go0Var2.W(1811920791);
                jB = ju.b(0.035f, ((lp1) go0Var2.j(ur1.a)).f);
                go0Var2.p(false);
                i4 = i3;
            } else {
                go0Var2.W(1812000895);
                i4 = i3;
                jB = ju.b(0.14f, ((lp1) go0Var2.j(ur1.a)).g);
                go0Var2.p(false);
            }
            gu2 gu2VarA = ar2.a(jB, up0.J(150, null, 6), "SelectPanelFluidEdgeColor", go0Var2);
            gu2 gu2VarA2 = uc.a(((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 2.0f, up0.G(0.5f, 1500.0f, null, 4), "SelectPanelFluidEdgeThickness", go0Var2);
            kr1 kr1Var = new kr1(14.0f);
            kr1 kr1Var2 = new kr1(10.0f);
            boolean zF = go0Var2.f(gu2VarB3) | go0Var2.f(gu2VarB) | go0Var2.f(gu2VarB2) | ((i4 & 57344) == 16384);
            Object objL3 = go0Var2.L();
            if (zF || objL3 == ebVar) {
                objL3 = new wa(z, gu2VarB3, gu2VarB, gu2VarB2);
                go0Var2.f0(objL3);
            }
            go0Var = go0Var2;
            ci0.h(te.r0(rp0.q0(te.L(rh1.a, (in0) objL3)), 160.0f, 280.0f), kr1Var, 0L, ((ju) gu2VarA.getValue()).a, ((za0) gu2VarA2.getValue()).h, 0L, 0.0f, fg1.g(1), null, xe1.i0(1460532497, new fr1(list, obj, kr1Var2, in0Var3, in0Var4, 0), go0Var2), go0Var, 817889328, 356);
        } else {
            go0Var = go0Var2;
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new gr1(list, obj, in0Var, in0Var2, z, i2, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void k(uh1 uh1Var, long j2, px pxVar, int i2) {
        uh1 uh1Var2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1696850451);
        int i3 = i2 | 6 | (go0Var.e(j2) ? 32 : 16);
        int i4 = 0;
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (objL == ebVar) {
                objL = op0.u(Boolean.FALSE);
                go0Var.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            Object objL2 = go0Var.L();
            t00 t00Var = null;
            if (objL2 == ebVar) {
                objL2 = new ir1(xk1Var, t00Var, i);
                go0Var.f0(objL2);
            }
            f(go0Var, (mn0) objL2, a83.a);
            gu2 gu2VarB = uc.b(((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.0f, up0.G(0.75f, 1500.0f, null, 4), "SelectCheckmarkScale", go0Var, 3120);
            rh1 rh1Var = rh1.a;
            uh1 uh1VarG0 = te.g0(rh1Var, 18.0f);
            boolean zF = go0Var.f(gu2VarB);
            Object objL3 = go0Var.L();
            if (zF || objL3 == ebVar) {
                objL3 = new hr1(gu2VarB, i4);
                go0Var.f0(objL3);
            }
            uh1 uh1VarL = te.L(uh1VarG0, (in0) objL3);
            i = (i3 & 112) != 32 ? 0 : 1;
            Object objL4 = go0Var.L();
            if (i != 0 || objL4 == ebVar) {
                objL4 = new c8(j2, 5);
                go0Var.f0(objL4);
            }
            b(uh1VarL, (in0) objL4, go0Var, 0);
            uh1Var2 = rh1Var;
        } else {
            go0Var.R();
            uh1Var2 = uh1Var;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new z7(uh1Var2, j2, i2, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void l(uh1 uh1Var, long j2, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-2088328903);
        int i3 = (go0Var.f(uh1Var) ? 4 : 2) | i2 | (go0Var.e(j2) ? 32 : 16);
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            uh1 uh1VarH0 = te.h0(uh1Var, 14.0f, 14.0f);
            boolean z = (i3 & 112) == 32;
            Object objL = go0Var.L();
            if (z || objL == nx.a) {
                objL = new c8(j2, 6);
                go0Var.f0(objL);
            }
            b(uh1VarH0, (in0) objL, go0Var, 0);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new z7(uh1Var, j2, i2, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void m(final String str, final List list, final Object obj, final in0 in0Var, uh1 uh1Var, final String str2, final in0 in0Var2, boolean z, px pxVar, final int i2) {
        final uh1 uh1Var2;
        final boolean z2;
        final int i3;
        Object obj2;
        boolean z3;
        Object obj3;
        str.getClass();
        list.getClass();
        in0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(2053466823);
        int i4 = i2 | (go0Var.f(str) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i4 |= go0Var.f(list) ? 32 : 16;
        }
        int i5 = i4 | (go0Var.f(obj) ? 256 : 128) | (go0Var.h(in0Var) ? 2048 : 1024) | 24576 | (go0Var.f(str2) ? 131072 : 65536) | (go0Var.h(in0Var2) ? 1048576 : 524288) | 12582912;
        if (go0Var.O(i5 & 1, (4793491 & i5) != 4793490)) {
            e70 e70Var = (e70) go0Var.j(ly.h);
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            Object obj4 = objL;
            if (objL == ebVar) {
                yk1 yk1Var = new yk1(Boolean.FALSE);
                go0Var.f0(yk1Var);
                obj4 = yk1Var;
            }
            final yk1 yk1Var2 = (yk1) obj4;
            Object objL2 = go0Var.L();
            Object obj5 = objL2;
            if (objL2 == ebVar) {
                nx1 nx1VarU = op0.u(Boolean.FALSE);
                go0Var.f0(nx1VarU);
                obj5 = nx1VarU;
            }
            xk1 xk1Var = (xk1) obj5;
            nx1 nx1Var = yk1Var2.c;
            boolean z4 = ((Boolean) nx1Var.getValue()).booleanValue() || ((Boolean) yk1Var2.b.getValue()).booleanValue();
            gu2 gu2VarB = uc.b(((Boolean) nx1Var.getValue()).booleanValue() ? 180.0f : 0.0f, up0.G(0.5f, 1500.0f, null, 4), "ArrowRotation", go0Var, 3120);
            gu2 gu2VarB2 = uc.b(((Boolean) nx1Var.getValue()).booleanValue() ? 1.12f : 1.0f, up0.G(0.75f, 400.0f, null, 4), "ArrowScale", go0Var, 3120);
            nf1 nf1VarD = dm.d(sn.j, false);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            rh1 rh1Var = rh1.a;
            uh1 uh1VarM = tl.M(go0Var, rh1Var);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, gx.e, nf1VarD);
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            kw kwVarI0 = xe1.i0(-187998779, new v1(in0Var2, obj, gu2VarB, gu2VarB2, 9), go0Var);
            boolean zH = go0Var.h(yk1Var2);
            Object objL3 = go0Var.L();
            if (zH || objL3 == ebVar) {
                i3 = 0;
                xm0 xm0Var = new xm0() { // from class: cr1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.xm0
                    public final Object a() {
                        int i6 = i3;
                        a83 a83Var = a83.a;
                        yk1 yk1Var3 = yk1Var2;
                        switch (i6) {
                            case 0:
                                yk1Var3.c.setValue(Boolean.TRUE);
                                break;
                            default:
                                yk1Var3.c.setValue(Boolean.FALSE);
                                break;
                        }
                        return a83Var;
                    }
                };
                go0Var.f0(xm0Var);
                obj2 = xm0Var;
            } else {
                i3 = 0;
                obj2 = objL3;
            }
            sp0.g(str, null, str2, null, kwVarI0, null, true, (xm0) obj2, null, go0Var, (i5 & 14) | 24576 | ((i5 >> 9) & 896) | 1572864, 298);
            if (z4) {
                go0Var.W(334106804);
                boolean zF = go0Var.f(e70Var);
                Object objL4 = go0Var.L();
                if (zF || objL4 == ebVar) {
                    jr1 jr1Var = new jr1(e70Var.T(18.0f), e70Var.T(12.0f), new pr(xk1Var, 17));
                    go0Var.f0(jr1Var);
                    objL4 = jr1Var;
                }
                jr1 jr1Var2 = (jr1) objL4;
                boolean zH2 = go0Var.h(yk1Var2);
                Object objL5 = go0Var.L();
                if (zH2 || objL5 == ebVar) {
                    z3 = true;
                    final boolean z5 = true ? 1 : 0;
                    xm0 xm0Var2 = new xm0() { // from class: cr1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.xm0
                        public final Object a() {
                            int i6 = z5;
                            a83 a83Var = a83.a;
                            yk1 yk1Var3 = yk1Var2;
                            switch (i6) {
                                case 0:
                                    yk1Var3.c.setValue(Boolean.TRUE);
                                    break;
                                default:
                                    yk1Var3.c.setValue(Boolean.FALSE);
                                    break;
                            }
                            return a83Var;
                        }
                    };
                    go0Var.f0(xm0Var2);
                    obj3 = xm0Var2;
                } else {
                    z3 = true;
                    obj3 = objL5;
                }
                pa.a(jr1Var2, (xm0) obj3, new h22(16), xe1.i0(-930588696, new iw(i5, in0Var, in0Var2, xk1Var, yk1Var2, obj, list), go0Var), go0Var, 3456, 0);
                go0Var.p(false);
            } else {
                z3 = true;
                go0Var.W(335810657);
                go0Var.p(false);
            }
            go0Var.p(z3);
            uh1Var2 = rh1Var;
            z2 = true;
        } else {
            go0Var.R();
            uh1Var2 = uh1Var;
            z2 = z;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0() { // from class: dr1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    eu.m(str, list, obj, in0Var, uh1Var2, str2, in0Var2, z2, (px) obj6, pp0.N(i2 | 1));
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v11, resolved type: go0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(uh1 uh1Var, String str, kw kwVar, px pxVar, int i2, int i3) {
        uh1 uh1Var2;
        int i4;
        String str2;
        kw kwVar2;
        String str3;
        go0 go0Var;
        b62 b62VarR;
        lc lcVar;
        lc lcVar2;
        v6 v6Var;
        lc lcVar3;
        String str4;
        yi0 yi0Var;
        Object obj;
        kr1 kr1Var;
        gu2 gu2Var;
        lc lcVar4;
        ?? r4;
        go0 go0Var2;
        xm0 xm0Var;
        go0 go0Var3 = (go0) pxVar;
        go0Var3.X(1052005233);
        int i5 = i3 & 1;
        int i6 = 2;
        if (i5 != 0) {
            i4 = i2 | 6;
            uh1Var2 = uh1Var;
        } else if ((i2 & 6) == 0) {
            uh1Var2 = uh1Var;
            i4 = (go0Var3.f(uh1Var2) ? 4 : 2) | i2;
        } else {
            uh1Var2 = uh1Var;
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                str2 = str;
                i4 |= go0Var3.f(str2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i4 |= go0Var3.h(kwVar) ? 256 : 128;
            }
            if (go0Var3.O(i4 & 1, (i4 & 147) == 146)) {
                go0 go0Var4 = go0Var3;
                kwVar2 = kwVar;
                go0Var4.R();
                str3 = str2;
                go0Var = go0Var4;
            } else {
                rh1 rh1Var = rh1.a;
                uh1 uh1Var3 = i5 != 0 ? rh1Var : uh1Var2;
                t00 t00Var = null;
                String str5 = i7 != 0 ? null : str2;
                Object objL = go0Var3.L();
                Object obj2 = nx.a;
                if (objL == obj2) {
                    objL = op0.u(Boolean.FALSE);
                    go0Var3.f0(objL);
                }
                xk1 xk1Var = (xk1) objL;
                Object objL2 = go0Var3.L();
                if (objL2 == obj2) {
                    objL2 = new ir1(xk1Var, t00Var, i6);
                    go0Var3.f0(objL2);
                }
                f(go0Var3, (mn0) objL2, a83.a);
                kr1 kr1Var2 = new kr1(16.0f);
                gu2 gu2VarB = uc.b(((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.0f, up0.J(160, null, 6), "SettingGroupAlphaAnimation", go0Var3, 3120);
                gu2 gu2VarA = uc.a(((Boolean) xk1Var.getValue()).booleanValue() ? 0.0f : 6.0f, up0.G(0.5f, 400.0f, null, 4), "SettingGroupOffsetAnimation", go0Var3);
                gu2 gu2VarB2 = uc.b(((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.0f, up0.J(180, null, 6), "SettingGroupTitleAlphaAnimation", go0Var3, 3120);
                gu2 gu2VarA2 = uc.a(((Boolean) xk1Var.getValue()).booleanValue() ? 0.0f : 6.0f, up0.G(0.75f, 1500.0f, null, 4), "SettingGroupTitleOffsetAnimation", go0Var3);
                gu2 gu2VarA3 = uc.a(((Boolean) xk1Var.getValue()).booleanValue() ? 22.0f : 7.0f, up0.G(0.75f, 400.0f, null, 4), "SettingGroupTitleMarkWidthAnimation", go0Var3);
                yi0 yi0Var2 = te.e;
                uh1 uh1VarC = uh1Var3.c(yi0Var2);
                uh1 uh1Var4 = uh1Var3;
                av avVarA = yu.a(tp0.c, sn.u, go0Var3, 0);
                int iHashCode = Long.hashCode(go0Var3.T);
                yy1 yy1VarL = go0Var3.l();
                uh1 uh1VarM = tl.M(go0Var3, uh1VarC);
                hx.c.getClass();
                xm0 xm0Var2 = gx.b;
                go0Var3.Z();
                if (go0Var3.S) {
                    go0Var3.k(xm0Var2);
                } else {
                    go0Var3.i0();
                }
                lc lcVar5 = gx.e;
                yf3.c(go0Var3, lcVar5, avVarA);
                lc lcVar6 = gx.d;
                yf3.c(go0Var3, lcVar6, yy1VarL);
                Integer numValueOf = Integer.valueOf(iHashCode);
                lc lcVar7 = gx.f;
                yf3.c(go0Var3, lcVar7, numValueOf);
                v6 v6Var2 = gx.g;
                yf3.b(go0Var3, v6Var2);
                lc lcVar8 = gx.c;
                yf3.c(go0Var3, lcVar8, uh1VarM);
                if (str5 != null) {
                    go0Var3.W(1697031315);
                    uh1 uh1VarT = s11.T(rh1Var, 0.0f, ((za0) gu2VarA2.getValue()).h, 1);
                    boolean zF = go0Var3.f(gu2VarB2);
                    Object objL3 = go0Var3.L();
                    if (zF || objL3 == obj2) {
                        objL3 = new hr1(gu2VarB2, 1);
                        go0Var3.f0(objL3);
                    }
                    uh1 uh1VarG = fg1.G(te.L(uh1VarT, (in0) objL3), 8.0f, 0.0f, 0.0f, 8.0f, 6);
                    ob2 ob2VarA = nb2.a(tp0.a, sn.t, go0Var3, 48);
                    int iHashCode2 = Long.hashCode(go0Var3.T);
                    yy1 yy1VarL2 = go0Var3.l();
                    uh1 uh1VarM2 = tl.M(go0Var3, uh1VarG);
                    go0Var3.Z();
                    if (go0Var3.S) {
                        go0Var3.k(xm0Var2);
                    } else {
                        go0Var3.i0();
                    }
                    yf3.c(go0Var3, lcVar5, ob2VarA);
                    yf3.c(go0Var3, lcVar6, yy1VarL2);
                    vi0.q(iHashCode2, go0Var3, lcVar7, go0Var3, v6Var2);
                    yf3.c(go0Var3, lcVar8, uh1VarM2);
                    uh1 uh1VarZ = ci0.z(te.h0(rh1Var, ((za0) gu2VarA3.getValue()).h, 5.0f), gb2.a);
                    e42 e42Var = ur1.a;
                    dm.a(gf1.n(uh1VarZ, ((lp1) go0Var3.j(e42Var)).g, sp0.h), go0Var3, 0);
                    String upperCase = str5.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    xm0Var = xm0Var2;
                    kr1Var = kr1Var2;
                    lcVar3 = lcVar7;
                    gu2Var = gu2VarB;
                    str4 = str5;
                    lcVar2 = lcVar8;
                    v6Var = v6Var2;
                    yi0Var = yi0Var2;
                    r4 = 1;
                    lcVar = lcVar5;
                    obj = obj2;
                    lcVar4 = lcVar6;
                    v03.b(upperCase, fg1.G(rh1Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), ((lp1) go0Var3.j(e42Var)).g, rg3.D(12), im0.m, rg3.C(0.7d), 0L, 0, false, 0, 0, null, go0Var3, 102260784, 0, 261800);
                    go0Var2 = go0Var3;
                    go0Var2.p(true);
                    go0Var2.p(false);
                } else {
                    lcVar = lcVar5;
                    lcVar2 = lcVar8;
                    v6Var = v6Var2;
                    lcVar3 = lcVar7;
                    str4 = str5;
                    yi0Var = yi0Var2;
                    obj = obj2;
                    kr1Var = kr1Var2;
                    gu2Var = gu2VarB;
                    lcVar4 = lcVar6;
                    r4 = 1;
                    go0Var2 = go0Var3;
                    xm0Var = xm0Var2;
                    go0Var2.W(1697900059);
                    go0Var2.p(false);
                }
                uh1 uh1VarT2 = s11.T(yi0Var, 0.0f, ((za0) gu2VarA.getValue()).h, r4);
                boolean zF2 = go0Var2.f(gu2Var);
                Object objL4 = go0Var2.L();
                if (zF2 || objL4 == obj) {
                    objL4 = new hr1(gu2Var, 2);
                    go0Var2.f0(objL4);
                }
                uh1 uh1VarL = te.L(uh1VarT2, (in0) objL4);
                nf1 nf1VarD = dm.d(sn.j, false);
                int iHashCode3 = Long.hashCode(go0Var2.T);
                yy1 yy1VarL3 = go0Var2.l();
                uh1 uh1VarM3 = tl.M(go0Var2, uh1VarL);
                go0Var2.Z();
                if (go0Var2.S) {
                    go0Var2.k(xm0Var);
                } else {
                    go0Var2.i0();
                }
                yf3.c(go0Var2, lcVar, nf1VarD);
                yf3.c(go0Var2, lcVar4, yy1VarL3);
                vi0.q(iHashCode3, go0Var2, lcVar3, go0Var2, v6Var);
                yf3.c(go0Var2, lcVar2, uh1VarM3);
                kwVar2 = kwVar;
                go0 go0Var5 = go0Var2;
                ci0.h(yi0Var, kr1Var, 0L, 0L, 0.0f, 0L, 0.0f, null, null, xe1.i0(135427166, new wt0((int) r4, kwVar2), go0Var2), go0Var5, 805306422, 508);
                go0 go0Var6 = go0Var5;
                go0Var6.p(r4);
                go0Var6.p(r4);
                uh1Var2 = uh1Var4;
                str3 = str4;
                go0Var = go0Var6;
            }
            b62VarR = go0Var.r();
            if (b62VarR == null) {
                b62VarR.d = new f81(uh1Var2, str3, kwVar2, i2, i3);
                return;
            }
            return;
        }
        i4 |= 48;
        str2 = str;
        if ((i2 & 384) == 0) {
        }
        if (go0Var3.O(i4 & 1, (i4 & 147) == 146)) {
        }
        b62VarR = go0Var.r();
        if (b62VarR == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void o(uh1 uh1Var, kw kwVar, px pxVar, int i2) {
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(2064964257);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.f(uh1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(kwVar) ? 32 : 16;
        }
        int i4 = 0;
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            p(uh1Var, kwVar, go0Var, ((i3 << 3) & 896) | (i3 & 14) | 48);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ob(uh1Var, kwVar, i2, i4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void p(uh1 uh1Var, kw kwVar, px pxVar, int i2) {
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(771959668);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.f(uh1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var.h(kwVar) ? 256 : 128;
        }
        int i4 = 1;
        if (go0Var.O(i3 & 1, (i3 & 147) != 146)) {
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (objL == ebVar) {
                nx1 nx1Var = new nx1(null, gd3.C);
                go0Var.f0(nx1Var);
                objL = nx1Var;
            }
            xk1 xk1Var = (xk1) objL;
            Object objL2 = go0Var.L();
            if (objL2 == ebVar) {
                objL2 = new f0(xk1Var, 5);
                go0Var.f0(objL2);
            }
            ci0.a(az2.b.a(T((xm0) objL2, go0Var, 0)), xe1.i0(-291176396, new tt0(uh1Var, xk1Var, kwVar), go0Var), go0Var, 56);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ob(uh1Var, kwVar, i2, i4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final o62 q(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new o62(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void r(xm0 xm0Var, px pxVar) {
        kv1 kv1Var = ((go0) pxVar).M.b.t;
        kv1Var.X(av1.c);
        rg3.M(kv1Var, 0, xm0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float s(EdgeEffect edgeEffect, float f2, float f3, e70 e70Var) {
        float f4 = id0.a;
        double dB = e70Var.b() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f2) * 0.35f;
        double d2 = ((double) id0.a) * dB;
        float fExp = (float) (Math.exp((id0.b / id0.c) * Math.log(dAbs / d2)) * d2);
        int i2 = Build.VERSION.SDK_INT;
        if (fExp > (i2 >= 31 ? ne.c(edgeEffect) : 0.0f) * f3) {
            return 0.0f;
        }
        int iQ = gf1.Q(f2);
        if (i2 >= 31) {
            edgeEffect.onAbsorb(iQ);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iQ);
        }
        return f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float t(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final JsObject u(Throwable th) {
        sd2 sd2Var;
        if (th instanceof sd2) {
            sd2Var = (sd2) th;
        } else if (th instanceof IllegalArgumentException) {
            String message = th.getMessage();
            if (message == null) {
                message = "Invalid API argument.";
            }
            sd2Var = new sd2("INVALID_ARGUMENT", message, false, null, th, 12);
        } else {
            sd2Var = new sd2("INTERNAL_ERROR", "The script API operation failed.", false, null, th, 12);
        }
        Map map = sd2Var.k;
        if (map.isEmpty()) {
            map = null;
        }
        return new JsObject(we1.q0(new ow1("ok", Boolean.FALSE), new ow1("error", new JsObject(we1.q0(new ow1("code", sd2Var.h), new ow1("message", sd2Var.i), new ow1("retryable", Boolean.valueOf(sd2Var.j)), new ow1("details", map != null ? new JsObject(map) : null))))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final JsObject v(Object obj) {
        return new JsObject(we1.q0(new ow1("ok", Boolean.TRUE), new ow1("value", obj)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList w(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new zf(objArr, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void x(u00 u00Var) {
        s60 s60Var;
        if (u00Var instanceof s60) {
            s60Var = (s60) u00Var;
            int i2 = s60Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s60Var.l = i2 - Integer.MIN_VALUE;
            } else {
                s60Var = new s60(u00Var);
            }
        }
        Object obj = s60Var.k;
        int i3 = s60Var.l;
        if (i3 == 0) {
            fg1.T(obj);
            s60Var.l = 1;
            mp mpVar = new mp(1, gf1.z(s60Var));
            mpVar.u();
            if (mpVar.t() == k20.h) {
                return;
            }
        } else {
            if (i3 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            fg1.T(obj);
        }
        s.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int y(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        int i2 = 0;
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            um2.d(size, size2, ") is greater than size (", "toIndex (");
            return 0;
        }
        int i3 = size - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int iO = gf1.o((Comparable) arrayList.get(i4), comparable);
            if (iO < 0) {
                i2 = i4 + 1;
            } else {
                if (iO <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static pb1 z(pb1 pb1Var) {
        pb1Var.f();
        pb1Var.j = true;
        return pb1Var.i > 0 ? pb1Var : pb1.k;
    }
}
