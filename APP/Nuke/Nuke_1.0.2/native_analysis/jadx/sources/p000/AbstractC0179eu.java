package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: eu */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0179eu {

    /* JADX INFO: renamed from: e */
    public static final hh1 f2631e;

    /* JADX INFO: renamed from: f */
    public static final hh1 f2632f;

    /* JADX INFO: renamed from: g */
    public static final hh1 f2633g;

    /* JADX INFO: renamed from: h */
    public static final hh1 f2634h;

    /* JADX INFO: renamed from: i */
    public static final hh1 f2635i;

    /* JADX INFO: renamed from: a */
    public static final float[] f2627a = new float[91];

    /* JADX INFO: renamed from: b */
    public static final C0402kw f2628b = new C0402kw(-748796150, false, new C0920ye(17));

    /* JADX INFO: renamed from: c */
    public static final C0402kw f2629c = new C0402kw(-1876006958, false, new C0920ye(18));

    /* JADX INFO: renamed from: d */
    public static final ba0 f2630d = new ba0();

    /* JADX INFO: renamed from: j */
    public static final xd0 f2636j = new xd0(false);

    /* JADX INFO: renamed from: k */
    public static final xd0 f2637k = new xd0(true);

    /* JADX INFO: renamed from: l */
    public static final EnumC0632qu f2638l = EnumC0632qu.f9166h;

    /* JADX INFO: renamed from: m */
    public static final EnumC0632qu f2639m = EnumC0632qu.f9167i;

    /* JADX INFO: renamed from: n */
    public static final StackTraceElement[] f2640n = new StackTraceElement[0];

    static {
        int i = 19;
        f2631e = new hh1(i, "COMPLETING_ALREADY");
        f2632f = new hh1(i, "COMPLETING_WAITING_CHILDREN");
        f2633g = new hh1(i, "COMPLETING_RETRY");
        f2634h = new hh1(i, "TOO_LATE_TO_CANCEL");
        f2635i = new hh1(i, "SEALED");
    }

    /* JADX INFO: renamed from: A */
    public static final byte m1420A(char c) {
        if (c < '~') {
            return C0743tq.f10897b[c];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: B */
    public static int m1421B(Iterable iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    /* JADX INFO: renamed from: C */
    public static final j20 m1422C(InterfaceC0596px interfaceC0596px) {
        return new c82(((go0) interfaceC0596px).f3612R);
    }

    /* JADX INFO: renamed from: D */
    public static final yl0 m1423D(Context context) {
        gd3 gd3Var = new gd3(29);
        context.getApplicationContext();
        return new yl0(gd3Var, new C0914y8(Build.VERSION.SDK_INT >= 31 ? jm0.f5104a.m2514a(context) : 0));
    }

    /* JADX INFO: renamed from: E */
    public static pb1 m1424E() {
        return new pb1(10);
    }

    /* JADX INFO: renamed from: F */
    public static final Object m1425F(long j, u00 u00Var) {
        if (j > 0) {
            C0469mp c0469mp = new C0469mp(1, gf1.m1908z(u00Var));
            c0469mp.m3151u();
            if (j < Long.MAX_VALUE) {
                m1430K(c0469mp.f6743l).mo4185h(j, c0469mp);
            }
            Object objM3150t = c0469mp.m3150t();
            if (objM3150t == k20.f5323h) {
                return objM3150t;
            }
        }
        return a83.f116a;
    }

    /* JADX INFO: renamed from: G */
    public static final int m1426G(int i, List list) {
        int i2;
        int i3 = ((rw1) AbstractC0142du.m1166v0(list)).f9777c;
        if (i > ((rw1) AbstractC0142du.m1166v0(list)).f9777c) {
            lz0.m2988a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            rw1 rw1Var = (rw1) list.get(i2);
            byte b = rw1Var.f9776b > i ? (byte) 1 : rw1Var.f9777c <= i ? (byte) -1 : (byte) 0;
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder sbM5695n = vi0.m5695n(i2, "Found paragraph index ", " should be in range [0, ");
        sbM5695n.append(list.size());
        sbM5695n.append(").\nDebug info: index=");
        sbM5695n.append(i);
        sbM5695n.append(", paragraphs=[");
        sbM5695n.append(sb1.m4781a(list, null, new vi1(8), 31));
        sbM5695n.append(']');
        lz0.m2988a(sbM5695n.toString());
        return i2;
    }

    /* JADX INFO: renamed from: H */
    public static final int m1427H(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            rw1 rw1Var = (rw1) list.get(i3);
            byte b = rw1Var.f9778d > i ? (byte) 1 : rw1Var.f9779e <= i ? (byte) -1 : (byte) 0;
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: I */
    public static final int m1428I(ArrayList arrayList, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((rw1) AbstractC0142du.m1166v0(arrayList)).f9781g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            rw1 rw1Var = (rw1) arrayList.get(i2);
            byte b = rw1Var.f9780f > f ? (byte) 1 : rw1Var.f9781g <= f ? (byte) -1 : (byte) 0;
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: J */
    public static final void m1429J(ArrayList arrayList, long j, in0 in0Var) {
        int size = arrayList.size();
        for (int iM1426G = m1426G(f13.m1497f(j), arrayList); iM1426G < size; iM1426G++) {
            rw1 rw1Var = (rw1) arrayList.get(iM1426G);
            if (rw1Var.f9776b >= f13.m1496e(j)) {
                return;
            }
            if (rw1Var.f9776b != rw1Var.f9777c) {
                in0Var.mo5j(rw1Var);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static final r60 m1430K(a20 a20Var) {
        y10 y10VarMo15o = a20Var.mo15o(gd3.f3438p);
        r60 r60Var = y10VarMo15o instanceof r60 ? (r60) y10VarMo15o : null;
        return r60Var == null ? l50.f5937a : r60Var;
    }

    /* JADX INFO: renamed from: L */
    public static int m1431L(List list) {
        list.getClass();
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: M */
    public static final int m1432M(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    /* JADX INFO: renamed from: N */
    public static final y03 m1433N(ln2 ln2Var) {
        in0 in0Var;
        ArrayList arrayList = new ArrayList();
        Object objM4505g = ln2Var.f6221h.m4505g(kn2.f5659a);
        if (objM4505g == null) {
            objM4505g = null;
        }
        C0603q3 c0603q3 = (C0603q3) objM4505g;
        if (c0603q3 == null || (in0Var = (in0) c0603q3.f8713b) == null || !((Boolean) in0Var.mo5j(arrayList)).booleanValue()) {
            return null;
        }
        return (y03) arrayList.get(0);
    }

    /* JADX INFO: renamed from: O */
    public static List m1434O(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX INFO: renamed from: P */
    public static List m1435P(Object... objArr) {
        if (objArr.length <= 0) {
            return be0.f819h;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    /* JADX INFO: renamed from: Q */
    public static ArrayList m1436Q(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: R */
    public static ArrayList m1437R(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0960zf(objArr, true));
    }

    /* JADX INFO: renamed from: S */
    public static void m1438S(k03 k03Var, iz2 iz2Var, y03 y03Var, c61 c61Var, t03 t03Var, boolean z, us1 us1Var) {
        if (z) {
            int iMo2451p = us1Var.mo2451p(f13.m1496e(k03Var.f5297b));
            String str = lz2.f6414a;
            o62 o62VarM6202b = iMo2451p < y03Var.f13266a.f12754a.f10051i.length() ? y03Var.m6202b(iMo2451p) : iMo2451p != 0 ? y03Var.m6202b(iMo2451p - 1) : new o62(0.0f, 0.0f, 1.0f, (int) (lz2.m3020a(iz2Var.f4848b, iz2Var.f4853g, iz2Var.f4854h, lz2.f6414a, 1) & 4294967295L));
            float f = o62VarM6202b.f7537b;
            float f2 = o62VarM6202b.f7536a;
            long jMo646M = c61Var.mo646M((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            o62 o62VarM1467q = m1467q((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo646M & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo646M >> 32)))) << 32), (((long) Float.floatToRawIntBits(o62VarM6202b.f7538c - f2)) << 32) | (((long) Float.floatToRawIntBits(o62VarM6202b.f7539d - f)) & 4294967295L));
            if (t11.m5086l((t03) t03Var.f10465a.f7409b.get(), t03Var)) {
                t03Var.f10466b.mo2883h(o62VarM1467q);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static final C0492nb m1439T(xm0 xm0Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        View view = (View) go0Var.m1988j(AbstractC0646r7.f9415f);
        boolean zM1980f = go0Var.m1980f(view);
        Object objM1956L = go0Var.m1956L();
        C0160eb c0160eb = C0520nx.f7360a;
        if (zM1980f || objM1956L == c0160eb) {
            objM1956L = new C0492nb(view, null, xm0Var);
            go0Var.m1981f0(objM1956L);
        }
        C0492nb c0492nb = (C0492nb) objM1956L;
        boolean zM1984h = go0Var.m1984h(c0492nb);
        Object objM1956L2 = go0Var.m1956L();
        if (zM1984h || objM1956L2 == c0160eb) {
            objM1956L2 = new C0234gb(c0492nb, 3);
            go0Var.m1981f0(objM1956L2);
        }
        m1450c(c0492nb, (in0) objM1956L2, go0Var);
        return c0492nb;
    }

    /* JADX INFO: renamed from: U */
    public static final float m1440U(long j, float f, e70 e70Var) {
        float fM3675c;
        long jM3674b = p13.m3674b(j);
        if (q13.m4041a(jM3674b, 4294967296L)) {
            if (e70Var.mo697m() <= 1.05d) {
                return e70Var.mo695h0(j);
            }
            fM3675c = p13.m3675c(j) / p13.m3675c(e70Var.mo698p0(f));
        } else {
            if (!q13.m4041a(jM3674b, 8589934592L)) {
                return Float.NaN;
            }
            fM3675c = p13.m3675c(j);
        }
        return fM3675c * f;
    }

    /* JADX INFO: renamed from: V */
    public static final AbstractC0309ic m1441V(C0493nc c0493nc, int i) {
        Object next;
        Iterator<T> it = c0493nc.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((r61) ((Map.Entry) next).getKey()).f9385i == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AbstractC0309ic) entry.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: W */
    public static final void m1442W(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(sp0.m4947j0(j)), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: X */
    public static final void m1443X(Spannable spannable, long j, e70 e70Var, int i, int i2) {
        long jM3674b = p13.m3674b(j);
        if (q13.m4041a(jM3674b, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(gf1.m1869Q(e70Var.mo695h0(j)), false), i, i2, 33);
        } else if (q13.m4041a(jM3674b, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(p13.m3675c(j)), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: Y */
    public static final void m1444Y(Spannable spannable, kc1 kc1Var, int i, int i2) {
        if (kc1Var != null) {
            ArrayList arrayList = new ArrayList(m1421B(kc1Var, 10));
            Iterator it = kc1Var.f5454h.iterator();
            while (it.hasNext()) {
                arrayList.add(((jc1) it.next()).f4962a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m1445Z() {
        throw new ArithmeticException("Count overflow has happened.");
    }

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
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1446a(final String str, uh1 uh1Var, final m13 m13Var, int i, boolean z, int i2, int i3, InterfaceC0596px interfaceC0596px, final int i4, final int i5) {
        int i6;
        uh1 uh1Var2;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        final uh1 uh1Var3;
        final int i15;
        final boolean z3;
        final int i16;
        final int i17;
        b62 b62VarM1996r;
        boolean z4;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1040751001);
        if ((i4 & 6) == 0) {
            i6 = (go0Var.m1980f(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i18 = i5 & 2;
        if (i18 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                uh1Var2 = uh1Var;
                i6 |= go0Var.m1980f(uh1Var2) ? 32 : 16;
            }
            if ((i4 & 384) == 0) {
                i6 |= go0Var.m1980f(m13Var) ? 256 : 128;
            }
            if ((i5 & 8) == 0) {
                i6 |= 3072;
            } else if ((i4 & 3072) == 0) {
                i6 |= go0Var.m1984h(null) ? 2048 : 1024;
            }
            i7 = i5 & 16;
            if (i7 == 0) {
                i6 |= 24576;
            } else {
                if ((i4 & 24576) == 0) {
                    i8 = i;
                    i6 |= go0Var.m1976d(i8) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= 196608;
                } else {
                    if ((196608 & i4) == 0) {
                        z2 = z;
                        i6 |= go0Var.m1982g(z2) ? 131072 : 65536;
                    }
                    i10 = i5 & 64;
                    if (i10 != 0) {
                        if ((1572864 & i4) == 0) {
                            i11 = i2;
                            i6 |= go0Var.m1976d(i11) ? 1048576 : 524288;
                        }
                        i12 = i5 & 128;
                        if (i12 != 0) {
                            i6 |= 12582912;
                            i13 = i3;
                        } else {
                            i13 = i3;
                            if ((i4 & 12582912) == 0) {
                                i6 |= go0Var.m1976d(i13) ? 8388608 : 4194304;
                            }
                        }
                        i14 = i6 | 100663296;
                        int i19 = i6;
                        if ((i5 & AIChatConfig.DefaultMaxTokens) != 0) {
                            i14 = i19 | 905969664;
                        } else if ((805306368 & i4) == 0) {
                            i14 |= (1073741824 & i4) == 0 ? go0Var.m1980f(null) : go0Var.m1984h(null) ? 536870912 : 268435456;
                        }
                        if (go0Var.m1958O(i14 & 1, (i14 & 306783379) != 306783378)) {
                            uh1 uh1Var4 = i18 != 0 ? rh1.f9587a : uh1Var2;
                            if (i7 != 0) {
                                i8 = 1;
                            }
                            boolean z5 = i9 != 0 ? true : z2;
                            int i20 = i10 != 0 ? Integer.MAX_VALUE : i11;
                            if (i12 != 0) {
                                i13 = 1;
                            }
                            op0.m3577C(i13, i20);
                            if (go0Var.m1988j(jn2.f5125a) != null) {
                                c80.m664g();
                                return;
                            }
                            go0Var.m1966W(356914239);
                            go0Var.m1994p(false);
                            xl0 xl0Var = (xl0) go0Var.m1988j(AbstractC0441ly.f6385k);
                            Executor executor = (Executor) go0Var.m1988j(AbstractC0427lk.f6159a);
                            if (executor != null) {
                                int length = str.length();
                                if (Build.VERSION.SDK_INT < 28 || length < 8 || length >= 1000) {
                                    z4 = false;
                                    go0Var.m1966W(1255914055);
                                    go0Var.m1994p(false);
                                    go0Var.m1966W(357875859);
                                    go0Var.m1994p(z4);
                                    boolean z6 = z5;
                                    int i21 = i20;
                                    int i22 = i13;
                                    int i23 = i8;
                                    uh1 uh1VarMo4491c = uh1Var4.mo4491c(new i13(str, m13Var, xl0Var, i23, z6, i21, i22));
                                    C0378k8 c0378k8 = C0378k8.f5383e;
                                    int iHashCode = Long.hashCode(go0Var.f3614T);
                                    uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarMo4491c);
                                    yy1 yy1VarM1990l = go0Var.m1990l();
                                    InterfaceC0293hx.f4166c.getClass();
                                    C0367jy c0367jy = C0256gx.f3727b;
                                    go0Var.m1969Z();
                                    if (go0Var.f3613S) {
                                        go0Var.m1987i0();
                                    } else {
                                        go0Var.m1989k(c0367jy);
                                    }
                                    yf3.m6268c(go0Var, C0256gx.f3730e, c0378k8);
                                    yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
                                    yf3.m6267b(go0Var, C0256gx.f3732g);
                                    yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
                                    yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
                                    go0Var.m1994p(true);
                                    uh1Var3 = uh1Var4;
                                    i15 = i23;
                                    z3 = z6;
                                    i17 = i21;
                                    i16 = i22;
                                } else {
                                    if (AbstractC0427lk.f6160b == null) {
                                        AbstractC0427lk.f6160b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                                    }
                                    Boolean bool = AbstractC0427lk.f6160b;
                                    bool.getClass();
                                    if (bool.booleanValue()) {
                                        go0Var.m1966W(1254298614);
                                        try {
                                            try {
                                                RunnableC0390kk runnableC0390kk = new RunnableC0390kk(m13Var, (d61) go0Var.m1988j(AbstractC0441ly.f6388n), str, (e70) go0Var.m1988j(AbstractC0441ly.f6382h), xl0Var, 0);
                                                xl0Var = xl0Var;
                                                executor.execute(runnableC0390kk);
                                            } catch (RejectedExecutionException unused) {
                                                xl0Var = xl0Var;
                                            }
                                        } catch (RejectedExecutionException unused2) {
                                        }
                                        z4 = false;
                                        go0Var.m1994p(false);
                                    }
                                    go0Var.m1966W(357875859);
                                    go0Var.m1994p(z4);
                                    boolean z62 = z5;
                                    int i212 = i20;
                                    int i222 = i13;
                                    int i232 = i8;
                                    uh1 uh1VarMo4491c2 = uh1Var4.mo4491c(new i13(str, m13Var, xl0Var, i232, z62, i212, i222));
                                    C0378k8 c0378k82 = C0378k8.f5383e;
                                    int iHashCode2 = Long.hashCode(go0Var.f3614T);
                                    uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var, uh1VarMo4491c2);
                                    yy1 yy1VarM1990l2 = go0Var.m1990l();
                                    InterfaceC0293hx.f4166c.getClass();
                                    C0367jy c0367jy2 = C0256gx.f3727b;
                                    go0Var.m1969Z();
                                    if (go0Var.f3613S) {
                                    }
                                    yf3.m6268c(go0Var, C0256gx.f3730e, c0378k82);
                                    yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l2);
                                    yf3.m6267b(go0Var, C0256gx.f3732g);
                                    yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M2);
                                    yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode2));
                                    go0Var.m1994p(true);
                                    uh1Var3 = uh1Var4;
                                    i15 = i232;
                                    z3 = z62;
                                    i17 = i212;
                                    i16 = i222;
                                }
                            }
                        } else {
                            go0Var.m1961R();
                            uh1Var3 = uh1Var2;
                            i15 = i8;
                            z3 = z2;
                            i16 = i13;
                            i17 = i11;
                        }
                        b62VarM1996r = go0Var.m1996r();
                        if (b62VarM1996r != null) {
                            b62VarM1996r.f616d = new mn0() { // from class: jk
                                @Override // p000.mn0
                                /* JADX INFO: renamed from: g */
                                public final Object mo12g(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    AbstractC0179eu.m1446a(str, uh1Var3, m13Var, i15, z3, i17, i16, (InterfaceC0596px) obj, pp0.m3902N(i4 | 1), i5);
                                    return a83.f116a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i6 |= 1572864;
                    i11 = i2;
                    i12 = i5 & 128;
                    if (i12 != 0) {
                    }
                    i14 = i6 | 100663296;
                    int i192 = i6;
                    if ((i5 & AIChatConfig.DefaultMaxTokens) != 0) {
                    }
                    if (go0Var.m1958O(i14 & 1, (i14 & 306783379) != 306783378)) {
                    }
                    b62VarM1996r = go0Var.m1996r();
                    if (b62VarM1996r != null) {
                    }
                }
                z2 = z;
                i10 = i5 & 64;
                if (i10 != 0) {
                }
                i11 = i2;
                i12 = i5 & 128;
                if (i12 != 0) {
                }
                i14 = i6 | 100663296;
                int i1922 = i6;
                if ((i5 & AIChatConfig.DefaultMaxTokens) != 0) {
                }
                if (go0Var.m1958O(i14 & 1, (i14 & 306783379) != 306783378)) {
                }
                b62VarM1996r = go0Var.m1996r();
                if (b62VarM1996r != null) {
                }
            }
            i8 = i;
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            z2 = z;
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i2;
            i12 = i5 & 128;
            if (i12 != 0) {
            }
            i14 = i6 | 100663296;
            int i19222 = i6;
            if ((i5 & AIChatConfig.DefaultMaxTokens) != 0) {
            }
            if (go0Var.m1958O(i14 & 1, (i14 & 306783379) != 306783378)) {
            }
            b62VarM1996r = go0Var.m1996r();
            if (b62VarM1996r != null) {
            }
        }
        uh1Var2 = uh1Var;
        if ((i4 & 384) == 0) {
        }
        if ((i5 & 8) == 0) {
        }
        i7 = i5 & 16;
        if (i7 == 0) {
        }
        i8 = i;
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        z2 = z;
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i2;
        i12 = i5 & 128;
        if (i12 != 0) {
        }
        i14 = i6 | 100663296;
        int i192222 = i6;
        if ((i5 & AIChatConfig.DefaultMaxTokens) != 0) {
        }
        if (go0Var.m1958O(i14 & 1, (i14 & 306783379) != 306783378)) {
        }
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static void m1447a0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX INFO: renamed from: b */
    public static final void m1448b(uh1 uh1Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-932836462);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(uh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (go0Var.m1984h(in0Var) ? 32 : 16);
        int i4 = 0;
        if (go0Var.m1958O(i3 & 1, (i3 & 19) != 18)) {
            rp0.m4529O(go0Var, qp0.m4264s(uh1Var, in0Var));
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0781up(i, i4, uh1Var, in0Var);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m1449b0(int i, int i2, yo2 yo2Var) {
        yo2Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(yo2Var.mo253e(i4));
            }
            i3 >>>= 1;
        }
        String strMo250b = yo2Var.mo250b();
        strMo250b.getClass();
        throw new dh1(arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + strMo250b + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + strMo250b + "', but they were missing", null, arrayList, strMo250b);
    }

    /* JADX INFO: renamed from: c */
    public static final void m1450c(Object obj, in0 in0Var, InterfaceC0596px interfaceC0596px) {
        go0 go0Var = (go0) interfaceC0596px;
        boolean zM1980f = go0Var.m1980f(obj);
        Object objM1956L = go0Var.m1956L();
        if (zM1980f || objM1956L == C0520nx.f7360a) {
            objM1956L = new z90(in0Var);
            go0Var.m1981f0(objM1956L);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final ExtractedText m1451c0(k03 k03Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = k03Var.f5296a.f10051i;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = k03Var.f5297b;
        extractedText.selectionStart = f13.m1497f(j);
        extractedText.selectionEnd = f13.m1496e(j);
        extractedText.flags = !pv2.m3996i0(k03Var.f5296a.f10051i, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX INFO: renamed from: d */
    public static final void m1452d(Object obj, Object obj2, in0 in0Var, InterfaceC0596px interfaceC0596px) {
        go0 go0Var = (go0) interfaceC0596px;
        boolean zM1980f = go0Var.m1980f(obj) | go0Var.m1980f(obj2);
        Object objM1956L = go0Var.m1956L();
        if (zM1980f || objM1956L == C0520nx.f7360a) {
            objM1956L = new z90(in0Var);
            go0Var.m1981f0(objM1956L);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static final String m1453d0(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == 127 ? "invalid token" : "valid token";
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x0a5f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0a70  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1454e(final List list, final List list2, final String str, final in0 in0Var, final boolean z, in0 in0Var2, final rs2 rs2Var, final mn0 mn0Var, final mn0 mn0Var2, final mn0 mn0Var3, InterfaceC0596px interfaceC0596px, final int i) throws Throwable {
        in0 in0Var3;
        go0 go0Var;
        int i2;
        Context context;
        View view;
        Throwable th;
        int i3;
        List list3;
        String str2;
        int i4;
        int size;
        Map map;
        List list4;
        String str3;
        int i5;
        sx0 sx0VarM4625b;
        boolean z2;
        C0160eb c0160eb;
        boolean zM1980f;
        Object objM1956L;
        list.getClass();
        list2.getClass();
        str.getClass();
        in0Var.getClass();
        in0Var2.getClass();
        rs2Var.getClass();
        mn0Var.getClass();
        mn0Var2.getClass();
        mn0Var3.getClass();
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1967X(721039128);
        int i6 = i | (go0Var2.m1980f(list) ? 4 : 2) | (go0Var2.m1980f(list2) ? 32 : 16) | (go0Var2.m1980f(str) ? 256 : 128) | (go0Var2.m1984h(in0Var) ? 2048 : 1024) | (go0Var2.m1982g(z) ? 16384 : 8192) | (go0Var2.m1984h(in0Var2) ? 131072 : 65536) | (go0Var2.m1980f(rs2Var) ? 1048576 : 524288) | (go0Var2.m1984h(mn0Var) ? 8388608 : 4194304) | (go0Var2.m1984h(mn0Var2) ? 67108864 : 33554432) | (go0Var2.m1984h(mn0Var3) ? 536870912 : 268435456);
        if (go0Var2.m1958O(i6 & 1, (i6 & 306783379) != 306783378)) {
            Context context2 = (Context) go0Var2.m1988j(AbstractC0646r7.f9411b);
            View view2 = (View) go0Var2.m1988j(AbstractC0646r7.f9415f);
            Object[] objArr = new Object[0];
            Object objM1956L2 = go0Var2.m1956L();
            C0160eb c0160eb2 = C0520nx.f7360a;
            if (objM1956L2 == c0160eb2) {
                i2 = i6;
                objM1956L2 = new C0146dy(13);
                go0Var2.m1981f0(objM1956L2);
            } else {
                i2 = i6;
            }
            xk1 xk1Var = (xk1) gf1.m1865M(objArr, (xm0) objM1956L2, go0Var2, 48);
            int i7 = i2 & 458752;
            boolean zM1980f2 = ((i2 & 57344) == 16384) | go0Var2.m1980f(xk1Var) | (i7 == 131072);
            Object objM1956L3 = go0Var2.m1956L();
            if (zM1980f2 || objM1956L3 == c0160eb2) {
                objM1956L3 = new dt0(1, in0Var2, xk1Var, z);
                go0Var2.m1981f0(objM1956L3);
            }
            final in0 in0Var4 = (in0) objM1956L3;
            String string = pv2.m3993I0(str).toString();
            int i8 = i2 & 14;
            boolean z3 = i8 == 4;
            Object objM1956L4 = go0Var2.m1956L();
            Object obj = objM1956L4;
            if (z3 || objM1956L4 == c0160eb2) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : list) {
                    wm0 wm0VarMo143n = ((AbstractC0255gw) obj2).mo143n();
                    Object obj3 = linkedHashMap.get(wm0VarMo143n);
                    if (obj3 == null) {
                        ArrayList arrayList = new ArrayList();
                        linkedHashMap.put(wm0VarMo143n, arrayList);
                        obj3 = arrayList;
                    }
                    ((List) obj3).add(obj2);
                }
                go0Var2.m1981f0(linkedHashMap);
                obj = linkedHashMap;
            }
            Map map2 = (Map) obj;
            boolean zM1980f3 = (i8 == 4) | go0Var2.m1980f(string) | go0Var2.m1980f(context2);
            Object objM1956L5 = go0Var2.m1956L();
            if (zM1980f3 || objM1956L5 == c0160eb2) {
                if (pv2.m4006s0(string)) {
                    objM1956L5 = be0.f819h;
                    context = context2;
                    view = view2;
                    th = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC0255gw abstractC0255gw = (AbstractC0255gw) next;
                        String string2 = context2.getString(abstractC0255gw.mo142m());
                        string2.getClass();
                        Integer numMo141k = abstractC0255gw.mo141k();
                        Iterator it2 = it;
                        String string3 = numMo141k != null ? context2.getString(numMo141k.intValue()) : null;
                        if (string3 == null) {
                            string3 = "";
                        }
                        View view3 = view2;
                        String string4 = context2.getString(abstractC0255gw.mo143n().f12584h);
                        string4.getClass();
                        Context context3 = context2;
                        String strM4916O = sp0.m4916O(string);
                        if (!pv2.m4006s0(strM4916O)) {
                            List listM1435P = m1435P(string2, string3, string4, abstractC0255gw.mo9d());
                            if (!listM1435P.isEmpty()) {
                                Iterator it3 = listM1435P.iterator();
                                while (it3.hasNext()) {
                                    String strM4916O2 = sp0.m4916O((String) it3.next());
                                    if (!pv2.m3995h0(strM4916O2, strM4916O, false)) {
                                        int length = strM4916O2.length();
                                        Iterator it4 = it3;
                                        int i9 = 0;
                                        int i10 = 0;
                                        while (i10 < length) {
                                            int i11 = length;
                                            String str4 = strM4916O2;
                                            if (strM4916O2.charAt(i10) != strM4916O.charAt(i9) || (i9 = i9 + 1) != strM4916O.length()) {
                                                i10++;
                                                length = i11;
                                                strM4916O2 = str4;
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
                    objM1956L5 = arrayList2;
                }
                go0Var2.m1981f0(objM1956L5);
            } else {
                context = context2;
                view = view2;
                th = null;
            }
            List list5 = (List) objM1956L5;
            boolean zM1980f4 = go0Var2.m1980f(map2) | ((i2 & 112) == 32);
            Object objM1956L6 = go0Var2.m1956L();
            if (zM1980f4 || objM1956L6 == c0160eb2) {
                if (list2.isEmpty()) {
                    i3 = 0;
                } else {
                    Iterator it5 = list2.iterator();
                    i3 = 0;
                    while (it5.hasNext()) {
                        AbstractC0812vj abstractC0812vj = (AbstractC0812vj) it5.next();
                        pp1 pp1Var = pp1.f8445a;
                        if (pp1.m3933e(abstractC0812vj.mo9d()) || !abstractC0812vj.f11986b.isEmpty()) {
                            i3++;
                            if (i3 < 0) {
                                m1445Z();
                                throw th;
                            }
                        }
                    }
                }
                ArrayList arrayListM1156l0 = AbstractC0142du.m1156l0(3, wm0.f12583q);
                int i12 = 10;
                ArrayList arrayList3 = new ArrayList(m1421B(arrayListM1156l0, 10));
                Iterator it6 = arrayListM1156l0.iterator();
                while (it6.hasNext()) {
                    List list6 = (List) it6.next();
                    Iterator it7 = it6;
                    ArrayList arrayList4 = new ArrayList(m1421B(list6, i12));
                    Iterator it8 = list6.iterator();
                    while (it8.hasNext()) {
                        wm0 wm0Var = (wm0) it8.next();
                        wm0 wm0Var2 = wm0.f12581o;
                        if (wm0Var == wm0Var2) {
                            size = list2.size();
                        } else {
                            List list7 = (List) map2.get(wm0Var);
                            size = list7 != null ? list7.size() : 0;
                        }
                        Iterator it9 = it8;
                        int i13 = wm0Var.f12584h;
                        switch (wm0Var.ordinal()) {
                            case 0:
                                map = map2;
                                list4 = list5;
                                str3 = string;
                                i5 = i7;
                                sx0VarM4625b = sp0.f10271l;
                                if (sx0VarM4625b == null) {
                                    rx0 rx0Var = new rx0("AutoMirrored.Filled.Send", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                                    int i14 = s93.f9998a;
                                    ft2 ft2Var = new ft2(C0363ju.f5212b);
                                    ArrayList arrayList5 = new ArrayList(32);
                                    arrayList5.add(new cy1(2.01f, 21.0f));
                                    arrayList5.add(new by1(23.0f, 12.0f));
                                    arrayList5.add(new by1(2.01f, 3.0f));
                                    arrayList5.add(new by1(2.0f, 10.0f));
                                    arrayList5.add(new jy1(15.0f, 2.0f));
                                    arrayList5.add(new jy1(-15.0f, 2.0f));
                                    arrayList5.add(yx1.f13662c);
                                    rx0.m4624a(rx0Var, arrayList5, ft2Var);
                                    sx0VarM4625b = rx0Var.m4625b();
                                    sp0.f10271l = sx0VarM4625b;
                                }
                                break;
                            case 1:
                                map = map2;
                                list4 = list5;
                                str3 = string;
                                i5 = i7;
                                sx0VarM4625b = qp0.f9077s;
                                if (sx0VarM4625b == null) {
                                    rx0 rx0Var2 = new rx0("Filled.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i15 = s93.f9998a;
                                    ft2 ft2Var2 = new ft2(C0363ju.f5212b);
                                    ye0 ye0Var = new ye0(3);
                                    ye0Var.m6259k(12.0f, 12.0f);
                                    ye0Var.m6253e(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
                                    ye0Var.m6261m(-1.79f, -4.0f, -4.0f, -4.0f);
                                    ye0Var.m6261m(-4.0f, 1.79f, -4.0f, 4.0f);
                                    ye0Var.m6261m(1.79f, 4.0f, 4.0f, 4.0f);
                                    ye0Var.m6251c();
                                    ye0Var.m6259k(12.0f, 14.0f);
                                    ye0Var.m6253e(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
                                    ye0Var.m6263o(2.0f);
                                    ye0Var.m6256h(16.0f);
                                    ye0Var.m6263o(-2.0f);
                                    ye0Var.m6253e(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
                                    ye0Var.m6251c();
                                    rx0.m4624a(rx0Var2, ye0Var.f13428a, ft2Var2);
                                    sx0VarM4625b = rx0Var2.m4625b();
                                    qp0.f9077s = sx0VarM4625b;
                                }
                                break;
                            case 2:
                                map = map2;
                                list4 = list5;
                                str3 = string;
                                i5 = i7;
                                sx0VarM4625b = AbstractC0691se.m4819H();
                                break;
                            case 3:
                                map = map2;
                                list4 = list5;
                                str3 = string;
                                i5 = i7;
                                sx0 sx0Var = up0.f11407o;
                                if (sx0Var != null) {
                                    sx0VarM4625b = sx0Var;
                                } else {
                                    rx0 rx0Var3 = new rx0("Filled.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i16 = s93.f9998a;
                                    ft2 ft2Var3 = new ft2(C0363ju.f5212b);
                                    ye0 ye0Var2 = new ye0(3);
                                    ye0Var2.m6259k(12.0f, 17.27f);
                                    ye0Var2.m6257i(18.18f, 21.0f);
                                    ye0Var2.m6258j(-1.64f, -7.03f);
                                    ye0Var2.m6257i(22.0f, 9.24f);
                                    ye0Var2.m6258j(-7.19f, -0.61f);
                                    ye0Var2.m6257i(12.0f, 2.0f);
                                    ye0Var2.m6257i(9.19f, 8.63f);
                                    ye0Var2.m6257i(2.0f, 9.24f);
                                    ye0Var2.m6258j(5.46f, 4.73f);
                                    ye0Var2.m6257i(5.82f, 21.0f);
                                    ye0Var2.m6251c();
                                    rx0.m4624a(rx0Var3, ye0Var2.f13428a, ft2Var3);
                                    sx0VarM4625b = rx0Var3.m4625b();
                                    up0.f11407o = sx0VarM4625b;
                                }
                                break;
                            case 4:
                                map = map2;
                                list4 = list5;
                                str3 = string;
                                i5 = i7;
                                sx0VarM4625b = AbstractC0570p7.m3785u();
                                break;
                            case 5:
                                map = map2;
                                list4 = list5;
                                str3 = string;
                                i5 = i7;
                                sx0VarM4625b = AbstractC0570p7.m3786v();
                                break;
                            case AIChatConfig.DefaultContextRounds /* 6 */:
                                map = map2;
                                list4 = list5;
                                str3 = string;
                                i5 = i7;
                                sx0VarM4625b = pp0.m3924v();
                                break;
                            case 7:
                                sx0VarM4625b = gf1.f3488e;
                                if (sx0VarM4625b != null) {
                                    map = map2;
                                    list4 = list5;
                                    str3 = string;
                                    i5 = i7;
                                } else {
                                    rx0 rx0Var4 = new rx0("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i17 = s93.f9998a;
                                    map = map2;
                                    str3 = string;
                                    ft2 ft2Var4 = new ft2(C0363ju.f5212b);
                                    ye0 ye0Var3 = new ye0(3);
                                    list4 = list5;
                                    ye0Var3.m6259k(19.14f, 12.94f);
                                    ye0Var3.m6253e(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
                                    ye0Var3.m6253e(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
                                    ye0Var3.m6258j(2.03f, -1.58f);
                                    ye0Var3.m6253e(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
                                    ye0Var3.m6258j(-1.92f, -3.32f);
                                    ye0Var3.m6253e(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
                                    ye0Var3.m6258j(-2.39f, 0.96f);
                                    ye0Var3.m6253e(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
                                    ye0Var3.m6257i(14.4f, 2.81f);
                                    ye0Var3.m6253e(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
                                    ye0Var3.m6256h(-3.84f);
                                    ye0Var3.m6253e(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
                                    ye0Var3.m6257i(9.25f, 5.35f);
                                    ye0Var3.m6252d(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
                                    ye0Var3.m6257i(5.24f, 5.33f);
                                    ye0Var3.m6253e(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
                                    ye0Var3.m6257i(2.74f, 8.87f);
                                    ye0Var3.m6252d(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
                                    ye0Var3.m6258j(2.03f, 1.58f);
                                    ye0Var3.m6252d(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
                                    i5 = i7;
                                    ye0Var3.m6261m(0.02f, 0.64f, 0.07f, 0.94f);
                                    ye0Var3.m6258j(-2.03f, 1.58f);
                                    ye0Var3.m6253e(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
                                    ye0Var3.m6258j(1.92f, 3.32f);
                                    ye0Var3.m6253e(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
                                    ye0Var3.m6258j(2.39f, -0.96f);
                                    ye0Var3.m6253e(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
                                    ye0Var3.m6258j(0.36f, 2.54f);
                                    ye0Var3.m6253e(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
                                    ye0Var3.m6256h(3.84f);
                                    ye0Var3.m6253e(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
                                    ye0Var3.m6258j(0.36f, -2.54f);
                                    ye0Var3.m6253e(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
                                    ye0Var3.m6258j(2.39f, 0.96f);
                                    ye0Var3.m6253e(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
                                    ye0Var3.m6258j(1.92f, -3.32f);
                                    ye0Var3.m6253e(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
                                    ye0Var3.m6257i(19.14f, 12.94f);
                                    ye0Var3.m6251c();
                                    ye0Var3.m6259k(12.0f, 15.6f);
                                    ye0Var3.m6253e(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
                                    ye0Var3.m6261m(1.62f, -3.6f, 3.6f, -3.6f);
                                    ye0Var3.m6261m(3.6f, 1.62f, 3.6f, 3.6f);
                                    ye0Var3.m6260l(13.98f, 15.6f, 12.0f, 15.6f);
                                    ye0Var3.m6251c();
                                    rx0.m4624a(rx0Var4, ye0Var3.f13428a, ft2Var4);
                                    sx0VarM4625b = rx0Var4.m4625b();
                                    gf1.f3488e = sx0VarM4625b;
                                }
                                break;
                            default:
                                c80.m675s();
                                return;
                        }
                        arrayList4.add(new yp2(i13, sx0VarM4625b, wm0Var.name(), (wm0Var != wm0Var2 || i3 <= 0) ? String.valueOf(size) : vi0.m5688g("!", i3), wm0Var == wm0Var2 && i3 > 0));
                        it8 = it9;
                        map2 = map;
                        string = str3;
                        list5 = list4;
                        i7 = i5;
                    }
                    arrayList3.add(arrayList4);
                    it6 = it7;
                    i12 = 10;
                }
                list3 = list5;
                str2 = string;
                i4 = i7;
                go0Var2.m1981f0(arrayList3);
                objM1956L6 = arrayList3;
            } else {
                list3 = list5;
                str2 = string;
                i4 = i7;
            }
            final List list8 = (List) objM1956L6;
            Object objM1956L7 = go0Var2.m1956L();
            if (objM1956L7 == c0160eb2) {
                yp2 yp2Var = new yp2(R.string.home_settings_check_update, AbstractC0570p7.m3785u(), null, null, false);
                sx0 sx0VarM4625b2 = qp0.f9076r;
                if (sx0VarM4625b2 == null) {
                    rx0 rx0Var5 = new rx0("Filled.Code", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i18 = s93.f9998a;
                    ft2 ft2Var5 = new ft2(C0363ju.f5212b);
                    ye0 ye0Var4 = new ye0(3);
                    ye0Var4.m6259k(9.4f, 16.6f);
                    ye0Var4.m6257i(4.8f, 12.0f);
                    ye0Var4.m6258j(4.6f, -4.6f);
                    ye0Var4.m6257i(8.0f, 6.0f);
                    ye0Var4.m6258j(-6.0f, 6.0f);
                    ye0Var4.m6258j(6.0f, 6.0f);
                    ye0Var4.m6258j(1.4f, -1.4f);
                    ye0Var4.m6251c();
                    ye0Var4.m6259k(14.6f, 16.6f);
                    ye0Var4.m6258j(4.6f, -4.6f);
                    ye0Var4.m6258j(-4.6f, -4.6f);
                    ye0Var4.m6257i(16.0f, 6.0f);
                    ye0Var4.m6258j(6.0f, 6.0f);
                    ye0Var4.m6258j(-6.0f, 6.0f);
                    ye0Var4.m6258j(-1.4f, -1.4f);
                    ye0Var4.m6251c();
                    rx0.m4624a(rx0Var5, ye0Var4.f13428a, ft2Var5);
                    sx0VarM4625b2 = rx0Var5.m4625b();
                    qp0.f9076r = sx0VarM4625b2;
                }
                yp2 yp2Var2 = new yp2(R.string.home_settings_scripts, sx0VarM4625b2, null, null, false);
                sx0 sx0VarM4625b3 = rp0.f9682n;
                if (sx0VarM4625b3 == null) {
                    rx0 rx0Var6 = new rx0("Filled.Home", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i19 = s93.f9998a;
                    ft2 ft2Var6 = new ft2(C0363ju.f5212b);
                    ye0 ye0Var5 = new ye0(3);
                    ye0Var5.m6259k(10.0f, 20.0f);
                    ye0Var5.m6263o(-6.0f);
                    ye0Var5.m6256h(4.0f);
                    ye0Var5.m6263o(6.0f);
                    ye0Var5.m6256h(5.0f);
                    ye0Var5.m6263o(-8.0f);
                    ye0Var5.m6256h(3.0f);
                    ye0Var5.m6257i(12.0f, 3.0f);
                    ye0Var5.m6257i(2.0f, 12.0f);
                    ye0Var5.m6256h(3.0f);
                    ye0Var5.m6263o(8.0f);
                    ye0Var5.m6251c();
                    rx0.m4624a(rx0Var6, ye0Var5.f13428a, ft2Var6);
                    sx0VarM4625b3 = rx0Var6.m4625b();
                    rp0.f9682n = sx0VarM4625b3;
                }
                z2 = true;
                objM1956L7 = m1435P(m1435P(yp2Var, yp2Var2, new yp2(R.string.home_settings_appearance, sx0VarM4625b3, null, null, false)), m1435P(new yp2(R.string.home_settings_about_module, pp0.m3924v(), null, null, false), new yp2(R.string.home_settings_reward_us, AbstractC0570p7.m3786v(), null, null, false)));
                go0Var2.m1981f0(objM1956L7);
            } else {
                z2 = true;
            }
            final List list9 = (List) objM1956L7;
            final View view4 = view;
            final Context context4 = context;
            final String str5 = str2;
            final List list10 = list3;
            int i20 = i4;
            ci0.m815p(xe1.m6126i0(-1830109917, new mn0() { // from class: mt0
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj4, Object obj5) {
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    go0 go0Var3 = (go0) interfaceC0596px2;
                    if (go0Var3.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                        yi0 yi0Var = AbstractC0731te.f10695g;
                        C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var3, 0);
                        int iHashCode = Long.hashCode(go0Var3.f3614T);
                        yy1 yy1VarM1990l = go0Var3.m1990l();
                        uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var3, yi0Var);
                        InterfaceC0293hx.f4166c.getClass();
                        C0367jy c0367jy = C0256gx.f3727b;
                        go0Var3.m1969Z();
                        if (go0Var3.f3613S) {
                            go0Var3.m1989k(c0367jy);
                        } else {
                            go0Var3.m1987i0();
                        }
                        yf3.m6268c(go0Var3, C0256gx.f3730e, c0032avM6346a);
                        yf3.m6268c(go0Var3, C0256gx.f3729d, yy1VarM1990l);
                        yf3.m6268c(go0Var3, C0256gx.f3731f, Integer.valueOf(iHashCode));
                        yf3.m6267b(go0Var3, C0256gx.f3732g);
                        yf3.m6268c(go0Var3, C0256gx.f3728c, uh1VarM5285M);
                        tp0.m5358c(rg3.m4462P(R.string.home_settings_title, go0Var3), null, null, null, go0Var3, 0, 62);
                        uh1 uh1VarMo4491c = AbstractC0731te.f10693e.mo4491c(new g71(1.0f, true));
                        jw1 jw1VarM1635h = fg1.m1635h();
                        C0884xf c0884xf = new C0884xf(12.0f, new C0676s(2));
                        final String str6 = str;
                        boolean zM1980f5 = go0Var3.m1980f(str6);
                        final in0 in0Var5 = in0Var;
                        boolean zM1980f6 = zM1980f5 | go0Var3.m1980f(in0Var5);
                        final String str7 = str5;
                        boolean zM1980f7 = zM1980f6 | go0Var3.m1980f(str7);
                        final List list11 = list10;
                        boolean zM1984h = zM1980f7 | go0Var3.m1984h(list11);
                        final View view5 = view4;
                        boolean zM1984h2 = zM1984h | go0Var3.m1984h(view5);
                        final rs2 rs2Var2 = rs2Var;
                        boolean zM1980f8 = zM1984h2 | go0Var3.m1980f(rs2Var2);
                        final mn0 mn0Var4 = mn0Var;
                        boolean zM1980f9 = zM1980f8 | go0Var3.m1980f(mn0Var4);
                        final boolean z4 = z;
                        boolean zM1982g = zM1980f9 | go0Var3.m1982g(z4);
                        final in0 in0Var6 = in0Var4;
                        boolean zM1980f10 = zM1982g | go0Var3.m1980f(in0Var6);
                        final List list12 = list8;
                        boolean zM1984h3 = zM1980f10 | go0Var3.m1984h(list12);
                        final mn0 mn0Var5 = mn0Var2;
                        boolean zM1980f11 = zM1984h3 | go0Var3.m1980f(mn0Var5);
                        final List list13 = list9;
                        boolean zM1984h4 = zM1980f11 | go0Var3.m1984h(list13);
                        final Context context5 = context4;
                        boolean zM1984h5 = zM1984h4 | go0Var3.m1984h(context5);
                        final mn0 mn0Var6 = mn0Var3;
                        boolean zM1980f12 = zM1984h5 | go0Var3.m1980f(mn0Var6);
                        Object objM1956L8 = go0Var3.m1956L();
                        if (zM1980f12 || objM1956L8 == C0520nx.f7360a) {
                            objM1956L8 = new in0() { // from class: ot0
                                @Override // p000.in0
                                /* JADX INFO: renamed from: j */
                                public final Object mo5j(Object obj6) {
                                    s81 s81Var = (s81) obj6;
                                    s81Var.getClass();
                                    String str8 = str6;
                                    in0 in0Var7 = in0Var5;
                                    String str9 = str7;
                                    s81.m4760a(s81Var, null, new C0402kw(-1560095826, true, new C0746tr(str8, in0Var7, str9, 3)), 3);
                                    if (pv2.m4006s0(str9)) {
                                        s81.m4760a(s81Var, null, new C0402kw(-935749851, true, new C0085cb(2, in0Var6, z4)), 3);
                                        final int i21 = 0;
                                        final int i22 = 0;
                                        for (Object obj7 : list12) {
                                            int i23 = i22 + 1;
                                            if (i22 < 0) {
                                                AbstractC0179eu.m1447a0();
                                                throw null;
                                            }
                                            final List list14 = (List) obj7;
                                            String strM5688g = vi0.m5688g("hooker_group_", i22);
                                            final mn0 mn0Var7 = mn0Var5;
                                            s81.m4760a(s81Var, strM5688g, new C0402kw(1517561127, true, new nn0() { // from class: it0
                                                @Override // p000.nn0
                                                /* JADX INFO: renamed from: e */
                                                public final Object mo489e(Object obj8, Object obj9, Object obj10) {
                                                    String strM4462P;
                                                    InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj9;
                                                    int iIntValue2 = ((Integer) obj10).intValue();
                                                    ((o71) obj8).getClass();
                                                    go0 go0Var4 = (go0) interfaceC0596px3;
                                                    if (go0Var4.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        if (i22 == 0) {
                                                            go0Var4.m1966W(837878629);
                                                            strM4462P = rg3.m4462P(R.string.home_settings_modules_section, go0Var4);
                                                            go0Var4.m1994p(false);
                                                        } else {
                                                            go0Var4.m1966W(838000087);
                                                            go0Var4.m1994p(false);
                                                            strM4462P = null;
                                                        }
                                                        mn0 mn0Var8 = mn0Var7;
                                                        boolean zM1980f13 = go0Var4.m1980f(mn0Var8);
                                                        Object objM1956L9 = go0Var4.m1956L();
                                                        if (zM1980f13 || objM1956L9 == C0520nx.f7360a) {
                                                            objM1956L9 = new lt0(0, mn0Var8);
                                                            go0Var4.m1981f0(objM1956L9);
                                                        }
                                                        ci0.m813n(strM4462P, list14, (mn0) objM1956L9, go0Var4, 0);
                                                    } else {
                                                        go0Var4.m1961R();
                                                    }
                                                    return a83.f116a;
                                                }
                                            }), 2);
                                            i22 = i23;
                                        }
                                        for (Object obj8 : list13) {
                                            int i24 = i21 + 1;
                                            if (i21 < 0) {
                                                AbstractC0179eu.m1447a0();
                                                throw null;
                                            }
                                            final List list15 = (List) obj8;
                                            String strM5688g2 = vi0.m5688g("secondary_group_", i21);
                                            final Context context6 = context5;
                                            final mn0 mn0Var8 = mn0Var6;
                                            s81.m4760a(s81Var, strM5688g2, new C0402kw(1755082334, true, new nn0() { // from class: jt0
                                                @Override // p000.nn0
                                                /* JADX INFO: renamed from: e */
                                                public final Object mo489e(Object obj9, Object obj10, Object obj11) {
                                                    String strM4462P;
                                                    InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj10;
                                                    int iIntValue2 = ((Integer) obj11).intValue();
                                                    ((o71) obj9).getClass();
                                                    go0 go0Var4 = (go0) interfaceC0596px3;
                                                    if (go0Var4.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        if (i21 == 0) {
                                                            go0Var4.m1966W(-1273947442);
                                                            strM4462P = rg3.m4462P(R.string.home_settings_general_section, go0Var4);
                                                            go0Var4.m1994p(false);
                                                        } else {
                                                            go0Var4.m1966W(-1273825984);
                                                            go0Var4.m1994p(false);
                                                            strM4462P = null;
                                                        }
                                                        Context context7 = context6;
                                                        boolean zM1984h6 = go0Var4.m1984h(context7);
                                                        mn0 mn0Var9 = mn0Var8;
                                                        boolean zM1980f13 = zM1984h6 | go0Var4.m1980f(mn0Var9);
                                                        Object objM1956L9 = go0Var4.m1956L();
                                                        if (zM1980f13 || objM1956L9 == C0520nx.f7360a) {
                                                            objM1956L9 = new C0016af(9, context7, mn0Var9);
                                                            go0Var4.m1981f0(objM1956L9);
                                                        }
                                                        ci0.m813n(strM4462P, list15, (mn0) objM1956L9, go0Var4, 0);
                                                    } else {
                                                        go0Var4.m1961R();
                                                    }
                                                    return a83.f116a;
                                                }
                                            }), 2);
                                            i21 = i24;
                                        }
                                        s81.m4760a(s81Var, null, sp0.f10264e, 3);
                                    } else {
                                        s81.m4760a(s81Var, null, new C0402kw(954884169, true, new b81(list11, view5, rs2Var2, mn0Var4, 5)), 3);
                                        s81.m4760a(s81Var, null, sp0.f10262c, 3);
                                    }
                                    return a83.f116a;
                                }
                            };
                            go0Var3.m1981f0(objM1956L8);
                        }
                        rg3.m4468d(24960, 490, null, c0884xf, null, go0Var3, null, (in0) objM1956L8, null, uh1VarMo4491c, jw1VarM1635h, false);
                        go0Var3.m1994p(true);
                    } else {
                        go0Var3.m1961R();
                    }
                    return a83.f116a;
                }
            }, go0Var2), go0Var2, 6);
            if (((Boolean) xk1Var.getValue()).booleanValue()) {
                go0Var2.m1966W(1354262211);
                String strM4462P = rg3.m4462P(R.string.home_settings_safety_enable_title, go0Var2);
                String strM4462P2 = rg3.m4462P(R.string.home_settings_safety_enable_message, go0Var2);
                String strM4462P3 = rg3.m4462P(R.string.home_settings_enable, go0Var2);
                String strM4462P4 = rg3.m4462P(R.string.home_settings_cancel, go0Var2);
                boolean zM1980f5 = go0Var2.m1980f(xk1Var);
                Object objM1956L8 = go0Var2.m1956L();
                if (zM1980f5) {
                    c0160eb = c0160eb2;
                } else {
                    c0160eb = c0160eb2;
                    if (objM1956L8 == c0160eb) {
                    }
                    xm0 xm0Var = (xm0) objM1956L8;
                    zM1980f = go0Var2.m1980f(xk1Var) | (i20 != 131072 ? z2 : false);
                    objM1956L = go0Var2.m1956L();
                    if (!zM1980f || objM1956L == c0160eb) {
                        in0Var3 = in0Var2;
                        objM1956L = new C0580ph(in0Var3, xk1Var, 4);
                        go0Var2.m1981f0(objM1956L);
                    } else {
                        in0Var3 = in0Var2;
                    }
                    xm0 xm0Var2 = (xm0) objM1956L;
                    go0 go0Var3 = go0Var2;
                    qp0.m4248c(xm0Var, strM4462P, strM4462P2, strM4462P3, xm0Var2, null, strM4462P4, null, go0Var3, 0, 160);
                    go0Var3.m1994p(false);
                    go0Var = go0Var3;
                }
                objM1956L8 = new C0186f0(xk1Var, 24);
                go0Var2.m1981f0(objM1956L8);
                xm0 xm0Var3 = (xm0) objM1956L8;
                zM1980f = go0Var2.m1980f(xk1Var) | (i20 != 131072 ? z2 : false);
                objM1956L = go0Var2.m1956L();
                if (zM1980f) {
                    in0Var3 = in0Var2;
                    objM1956L = new C0580ph(in0Var3, xk1Var, 4);
                    go0Var2.m1981f0(objM1956L);
                    xm0 xm0Var22 = (xm0) objM1956L;
                    go0 go0Var32 = go0Var2;
                    qp0.m4248c(xm0Var3, strM4462P, strM4462P2, strM4462P3, xm0Var22, null, strM4462P4, null, go0Var32, 0, 160);
                    go0Var32.m1994p(false);
                    go0Var = go0Var32;
                }
            } else {
                in0Var3 = in0Var2;
                go0 go0Var4 = go0Var2;
                go0Var4.m1966W(1354889930);
                go0Var4.m1994p(false);
                go0Var = go0Var4;
            }
        } else {
            go0 go0Var5 = go0Var2;
            in0Var3 = in0Var2;
            go0Var5.m1961R();
            go0Var = go0Var5;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            final in0 in0Var5 = in0Var3;
            b62VarM1996r.f616d = new mn0(list, list2, str, in0Var, z, in0Var5, rs2Var, mn0Var, mn0Var2, mn0Var3, i) { // from class: nt0

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ List f7314h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ List f7315i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ String f7316j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ in0 f7317k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ boolean f7318l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ in0 f7319m;

                /* JADX INFO: renamed from: n */
                public final /* synthetic */ rs2 f7320n;

                /* JADX INFO: renamed from: o */
                public final /* synthetic */ mn0 f7321o;

                /* JADX INFO: renamed from: p */
                public final /* synthetic */ mn0 f7322p;

                /* JADX INFO: renamed from: q */
                public final /* synthetic */ mn0 f7323q;

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj4, Object obj5) throws Throwable {
                    ((Integer) obj5).getClass();
                    int iM3902N = pp0.m3902N(1);
                    AbstractC0179eu.m1454e(this.f7314h, this.f7315i, this.f7316j, this.f7317k, this.f7318l, this.f7319m, this.f7320n, this.f7321o, this.f7322p, this.f7323q, (InterfaceC0596px) obj4, iM3902N);
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static final Object m1455e0(Object obj) {
        cy0 cy0Var;
        dy0 dy0Var = obj instanceof dy0 ? (dy0) obj : null;
        return (dy0Var == null || (cy0Var = dy0Var.f2258a) == null) ? obj : cy0Var;
    }

    /* JADX INFO: renamed from: f */
    public static final void m1456f(InterfaceC0596px interfaceC0596px, mn0 mn0Var, Object obj) {
        a20 a20Var = ((go0) interfaceC0596px).f3612R;
        go0 go0Var = (go0) interfaceC0596px;
        boolean zM1980f = go0Var.m1980f(obj);
        Object objM1956L = go0Var.m1956L();
        if (zM1980f || objM1956L == C0520nx.f7360a) {
            objM1956L = new y51(a20Var, mn0Var);
            go0Var.m1981f0(objM1956L);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m1457g(Object obj, Object obj2, mn0 mn0Var, InterfaceC0596px interfaceC0596px) {
        a20 a20Var = ((go0) interfaceC0596px).f3612R;
        go0 go0Var = (go0) interfaceC0596px;
        boolean zM1980f = go0Var.m1980f(obj) | go0Var.m1980f(obj2);
        Object objM1956L = go0Var.m1956L();
        if (zM1980f || objM1956L == C0520nx.f7360a) {
            objM1956L = new y51(a20Var, mn0Var);
            go0Var.m1981f0(objM1956L);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m1458h(Boolean bool, Object obj, ia1 ia1Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(696924721);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1984h(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go0Var.m1984h(in0Var) ? 2048 : 1024;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 1171) != 1170)) {
            go0Var.m1963T();
            if ((i & 1) == 0 || go0Var.m2003y()) {
                ia1Var = (ia1) go0Var.m1988j(zb1.f13820a);
            } else {
                go0Var.m1961R();
            }
            int i3 = i2 & (-897);
            go0Var.m1995q();
            boolean zM1980f = go0Var.m1980f(bool) | go0Var.m1980f(obj) | go0Var.m1980f(ia1Var);
            Object objM1956L = go0Var.m1956L();
            if (zM1980f || objM1956L == C0520nx.f7360a) {
                objM1956L = new pa1(ia1Var.getLifecycle());
                go0Var.m1981f0(objM1956L);
            }
            m1459i(ia1Var, (pa1) objM1956L, in0Var, go0Var, (i3 >> 3) & 896);
        } else {
            go0Var.m1961R();
        }
        ia1 ia1Var2 = ia1Var;
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0292hw(bool, obj, ia1Var2, in0Var, i);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m1459i(ia1 ia1Var, pa1 pa1Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(228371534);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1984h(ia1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(pa1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(in0Var) ? 256 : 128;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            boolean zM1984h = go0Var.m1984h(pa1Var) | ((i2 & 896) == 256) | go0Var.m1984h(ia1Var);
            Object objM1956L = go0Var.m1956L();
            if (zM1984h || objM1956L == C0520nx.f7360a) {
                objM1956L = new C0444m0(ia1Var, pa1Var, in0Var, 8);
                go0Var.m1981f0(objM1956L);
            }
            m1452d(ia1Var, pa1Var, (in0) objM1956L, go0Var);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0803va(ia1Var, pa1Var, in0Var, i, 10);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m1460j(List list, Object obj, in0 in0Var, in0 in0Var2, boolean z, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        in0 in0Var3;
        in0 in0Var4;
        go0 go0Var;
        int i3;
        long jM2565b;
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1967X(-1647657696);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go0Var2.m1980f(list) : go0Var2.m1984h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? go0Var2.m1980f(obj) : go0Var2.m1984h(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            in0Var3 = in0Var;
            i2 |= go0Var2.m1984h(in0Var3) ? 256 : 128;
        } else {
            in0Var3 = in0Var;
        }
        if ((i & 3072) == 0) {
            in0Var4 = in0Var2;
            i2 |= go0Var2.m1984h(in0Var4) ? 2048 : 1024;
        } else {
            in0Var4 = in0Var2;
        }
        if ((i & 24576) == 0) {
            i2 |= go0Var2.m1982g(z) ? 16384 : 8192;
        }
        int i4 = 0;
        if (go0Var2.m1958O(i2 & 1, (i2 & 9363) != 9362)) {
            Object objM1956L = go0Var2.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                objM1956L = op0.m3598u(Boolean.FALSE);
                go0Var2.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            Object objM1956L2 = go0Var2.m1956L();
            t00 t00Var = null;
            if (objM1956L2 == c0160eb) {
                objM1956L2 = new ir1(xk1Var, t00Var, i4);
                go0Var2.m1981f0(objM1956L2);
            }
            m1456f(go0Var2, (mn0) objM1956L2, a83.f116a);
            gu2 gu2VarM5481b = AbstractC0768uc.m5481b(((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.94f, up0.m5528G(0.5f, 1500.0f, null, 4), "SelectPanelScaleX", go0Var2, 3120);
            gu2 gu2VarM5481b2 = AbstractC0768uc.m5481b(((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.82f, up0.m5528G(0.75f, 400.0f, null, 4), "SelectPanelScaleY", go0Var2, 3120);
            gu2 gu2VarM5481b3 = AbstractC0768uc.m5481b(((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.0f, up0.m5531J(120, null, 6), "SelectPanelAlpha", go0Var2, 3120);
            if (((Boolean) xk1Var.getValue()).booleanValue()) {
                go0Var2.m1966W(1811920791);
                jM2565b = C0363ju.m2565b(0.035f, ((lp1) go0Var2.m1988j(ur1.f11452a)).f6238f);
                go0Var2.m1994p(false);
                i3 = i2;
            } else {
                go0Var2.m1966W(1812000895);
                i3 = i2;
                jM2565b = C0363ju.m2565b(0.14f, ((lp1) go0Var2.m1988j(ur1.f11452a)).f6239g);
                go0Var2.m1994p(false);
            }
            gu2 gu2VarM269a = ar2.m269a(jM2565b, up0.m5531J(150, null, 6), "SelectPanelFluidEdgeColor", go0Var2);
            gu2 gu2VarM5480a = AbstractC0768uc.m5480a(((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 2.0f, up0.m5528G(0.5f, 1500.0f, null, 4), "SelectPanelFluidEdgeThickness", go0Var2);
            kr1 kr1Var = new kr1(14.0f);
            kr1 kr1Var2 = new kr1(10.0f);
            boolean zM1980f = go0Var2.m1980f(gu2VarM5481b3) | go0Var2.m1980f(gu2VarM5481b) | go0Var2.m1980f(gu2VarM5481b2) | ((i3 & 57344) == 16384);
            Object objM1956L3 = go0Var2.m1956L();
            if (zM1980f || objM1956L3 == c0160eb) {
                objM1956L3 = new C0840wa(z, gu2VarM5481b3, gu2VarM5481b, gu2VarM5481b2);
                go0Var2.m1981f0(objM1956L3);
            }
            go0Var = go0Var2;
            ci0.m807h(AbstractC0731te.m5233r0(rp0.m4556q0(AbstractC0731te.m5183L(rh1.f9587a, (in0) objM1956L3)), 160.0f, 280.0f), kr1Var, 0L, ((C0363ju) gu2VarM269a.getValue()).f5219a, ((za0) gu2VarM5480a.getValue()).f13798h, 0L, 0.0f, fg1.m1634g(1), null, xe1.m6126i0(1460532497, new fr1(list, obj, kr1Var2, in0Var3, in0Var4, 0), go0Var2), go0Var, 817889328, 356);
        } else {
            go0Var = go0Var2;
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new gr1(list, obj, in0Var, in0Var2, z, i, 0);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m1461k(uh1 uh1Var, long j, InterfaceC0596px interfaceC0596px, int i) {
        uh1 uh1Var2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1696850451);
        int i2 = i | 6 | (go0Var.m1978e(j) ? 32 : 16);
        int i3 = 0;
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                objM1956L = op0.m3598u(Boolean.FALSE);
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            Object objM1956L2 = go0Var.m1956L();
            t00 t00Var = null;
            if (objM1956L2 == c0160eb) {
                objM1956L2 = new ir1(xk1Var, t00Var, i);
                go0Var.m1981f0(objM1956L2);
            }
            m1456f(go0Var, (mn0) objM1956L2, a83.f116a);
            gu2 gu2VarM5481b = AbstractC0768uc.m5481b(((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.0f, up0.m5528G(0.75f, 1500.0f, null, 4), "SelectCheckmarkScale", go0Var, 3120);
            rh1 rh1Var = rh1.f9587a;
            uh1 uh1VarM5211g0 = AbstractC0731te.m5211g0(rh1Var, 18.0f);
            boolean zM1980f = go0Var.m1980f(gu2VarM5481b);
            Object objM1956L3 = go0Var.m1956L();
            if (zM1980f || objM1956L3 == c0160eb) {
                objM1956L3 = new hr1(gu2VarM5481b, i3);
                go0Var.m1981f0(objM1956L3);
            }
            uh1 uh1VarM5183L = AbstractC0731te.m5183L(uh1VarM5211g0, (in0) objM1956L3);
            i = (i2 & 112) != 32 ? 0 : 1;
            Object objM1956L4 = go0Var.m1956L();
            if (i != 0 || objM1956L4 == c0160eb) {
                objM1956L4 = new C0082c8(j, 5);
                go0Var.m1981f0(objM1956L4);
            }
            m1448b(uh1VarM5183L, (in0) objM1956L4, go0Var, 0);
            uh1Var2 = rh1Var;
        } else {
            go0Var.m1961R();
            uh1Var2 = uh1Var;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0952z7(uh1Var2, j, i, 2);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m1462l(uh1 uh1Var, long j, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-2088328903);
        int i2 = (go0Var.m1980f(uh1Var) ? 4 : 2) | i | (go0Var.m1978e(j) ? 32 : 16);
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            uh1 uh1VarM5213h0 = AbstractC0731te.m5213h0(uh1Var, 14.0f, 14.0f);
            boolean z = (i2 & 112) == 32;
            Object objM1956L = go0Var.m1956L();
            if (z || objM1956L == C0520nx.f7360a) {
                objM1956L = new C0082c8(j, 6);
                go0Var.m1981f0(objM1956L);
            }
            m1448b(uh1VarM5213h0, (in0) objM1956L, go0Var, 0);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0952z7(uh1Var, j, i, 3);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m1463m(final String str, final List list, final Object obj, final in0 in0Var, uh1 uh1Var, final String str2, final in0 in0Var2, boolean z, InterfaceC0596px interfaceC0596px, final int i) {
        final uh1 uh1Var2;
        final boolean z2;
        final int i2;
        Object obj2;
        boolean z3;
        Object obj3;
        str.getClass();
        list.getClass();
        in0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(2053466823);
        int i3 = i | (go0Var.m1980f(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= go0Var.m1980f(list) ? 32 : 16;
        }
        int i4 = i3 | (go0Var.m1980f(obj) ? 256 : 128) | (go0Var.m1984h(in0Var) ? 2048 : 1024) | 24576 | (go0Var.m1980f(str2) ? 131072 : 65536) | (go0Var.m1984h(in0Var2) ? 1048576 : 524288) | 12582912;
        if (go0Var.m1958O(i4 & 1, (4793491 & i4) != 4793490)) {
            e70 e70Var = (e70) go0Var.m1988j(AbstractC0441ly.f6382h);
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            Object obj4 = objM1956L;
            if (objM1956L == c0160eb) {
                yk1 yk1Var = new yk1(Boolean.FALSE);
                go0Var.m1981f0(yk1Var);
                obj4 = yk1Var;
            }
            final yk1 yk1Var2 = (yk1) obj4;
            Object objM1956L2 = go0Var.m1956L();
            Object obj5 = objM1956L2;
            if (objM1956L2 == c0160eb) {
                nx1 nx1VarM3598u = op0.m3598u(Boolean.FALSE);
                go0Var.m1981f0(nx1VarM3598u);
                obj5 = nx1VarM3598u;
            }
            xk1 xk1Var = (xk1) obj5;
            nx1 nx1Var = yk1Var2.f13501c;
            boolean z4 = ((Boolean) nx1Var.getValue()).booleanValue() || ((Boolean) yk1Var2.f13500b.getValue()).booleanValue();
            gu2 gu2VarM5481b = AbstractC0768uc.m5481b(((Boolean) nx1Var.getValue()).booleanValue() ? 180.0f : 0.0f, up0.m5528G(0.5f, 1500.0f, null, 4), "ArrowRotation", go0Var, 3120);
            gu2 gu2VarM5481b2 = AbstractC0768uc.m5481b(((Boolean) nx1Var.getValue()).booleanValue() ? 1.12f : 1.0f, up0.m5528G(0.75f, 400.0f, null, 4), "ArrowScale", go0Var, 3120);
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10222j, false);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            rh1 rh1Var = rh1.f9587a;
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, rh1Var);
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
            C0402kw c0402kwM6126i0 = xe1.m6126i0(-187998779, new C0794v1(in0Var2, obj, gu2VarM5481b, gu2VarM5481b2, 9), go0Var);
            boolean zM1984h = go0Var.m1984h(yk1Var2);
            Object objM1956L3 = go0Var.m1956L();
            if (zM1984h || objM1956L3 == c0160eb) {
                i2 = 0;
                xm0 xm0Var = new xm0() { // from class: cr1
                    @Override // p000.xm0
                    /* JADX INFO: renamed from: a */
                    public final Object mo6a() {
                        int i5 = i2;
                        a83 a83Var = a83.f116a;
                        yk1 yk1Var3 = yk1Var2;
                        switch (i5) {
                            case 0:
                                yk1Var3.f13501c.setValue(Boolean.TRUE);
                                break;
                            default:
                                yk1Var3.f13501c.setValue(Boolean.FALSE);
                                break;
                        }
                        return a83Var;
                    }
                };
                go0Var.m1981f0(xm0Var);
                obj2 = xm0Var;
            } else {
                i2 = 0;
                obj2 = objM1956L3;
            }
            sp0.m4940g(str, null, str2, null, c0402kwM6126i0, null, true, (xm0) obj2, null, go0Var, (i4 & 14) | 24576 | ((i4 >> 9) & 896) | 1572864, 298);
            if (z4) {
                go0Var.m1966W(334106804);
                boolean zM1980f = go0Var.m1980f(e70Var);
                Object objM1956L4 = go0Var.m1956L();
                if (zM1980f || objM1956L4 == c0160eb) {
                    jr1 jr1Var = new jr1(e70Var.mo692T(18.0f), e70Var.mo692T(12.0f), new C0590pr(xk1Var, 17));
                    go0Var.m1981f0(jr1Var);
                    objM1956L4 = jr1Var;
                }
                jr1 jr1Var2 = (jr1) objM1956L4;
                boolean zM1984h2 = go0Var.m1984h(yk1Var2);
                Object objM1956L5 = go0Var.m1956L();
                if (zM1984h2 || objM1956L5 == c0160eb) {
                    z3 = true;
                    final boolean z5 = true ? 1 : 0;
                    xm0 xm0Var2 = new xm0() { // from class: cr1
                        @Override // p000.xm0
                        /* JADX INFO: renamed from: a */
                        public final Object mo6a() {
                            int i5 = z5;
                            a83 a83Var = a83.f116a;
                            yk1 yk1Var3 = yk1Var2;
                            switch (i5) {
                                case 0:
                                    yk1Var3.f13501c.setValue(Boolean.TRUE);
                                    break;
                                default:
                                    yk1Var3.f13501c.setValue(Boolean.FALSE);
                                    break;
                            }
                            return a83Var;
                        }
                    };
                    go0Var.m1981f0(xm0Var2);
                    obj3 = xm0Var2;
                } else {
                    z3 = true;
                    obj3 = objM1956L5;
                }
                AbstractC0573pa.m3831a(jr1Var2, (xm0) obj3, new h22(16), xe1.m6126i0(-930588696, new C0327iw(i4, in0Var, in0Var2, xk1Var, yk1Var2, obj, list), go0Var), go0Var, 3456, 0);
                go0Var.m1994p(false);
            } else {
                z3 = true;
                go0Var.m1966W(335810657);
                go0Var.m1994p(false);
            }
            go0Var.m1994p(z3);
            uh1Var2 = rh1Var;
            z2 = true;
        } else {
            go0Var.m1961R();
            uh1Var2 = uh1Var;
            z2 = z;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0() { // from class: dr1
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    AbstractC0179eu.m1463m(str, list, obj, in0Var, uh1Var2, str2, in0Var2, z2, (InterfaceC0596px) obj6, pp0.m3902N(i | 1));
                    return a83.f116a;
                }
            };
        }
    }

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
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1464n(uh1 uh1Var, String str, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i, int i2) {
        uh1 uh1Var2;
        int i3;
        String str2;
        C0402kw c0402kw2;
        String str3;
        go0 go0Var;
        b62 b62VarM1996r;
        C0419lc c0419lc;
        C0419lc c0419lc2;
        C0799v6 c0799v6;
        C0419lc c0419lc3;
        String str4;
        yi0 yi0Var;
        Object obj;
        kr1 kr1Var;
        gu2 gu2Var;
        C0419lc c0419lc4;
        ?? r4;
        go0 go0Var2;
        xm0 xm0Var;
        go0 go0Var3 = (go0) interfaceC0596px;
        go0Var3.m1967X(1052005233);
        int i4 = i2 & 1;
        int i5 = 2;
        if (i4 != 0) {
            i3 = i | 6;
            uh1Var2 = uh1Var;
        } else if ((i & 6) == 0) {
            uh1Var2 = uh1Var;
            i3 = (go0Var3.m1980f(uh1Var2) ? 4 : 2) | i;
        } else {
            uh1Var2 = uh1Var;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                str2 = str;
                i3 |= go0Var3.m1980f(str2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= go0Var3.m1984h(c0402kw) ? 256 : 128;
            }
            if (go0Var3.m1958O(i3 & 1, (i3 & 147) == 146)) {
                go0 go0Var4 = go0Var3;
                c0402kw2 = c0402kw;
                go0Var4.m1961R();
                str3 = str2;
                go0Var = go0Var4;
            } else {
                rh1 rh1Var = rh1.f9587a;
                uh1 uh1Var3 = i4 != 0 ? rh1Var : uh1Var2;
                t00 t00Var = null;
                String str5 = i6 != 0 ? null : str2;
                Object objM1956L = go0Var3.m1956L();
                Object obj2 = C0520nx.f7360a;
                if (objM1956L == obj2) {
                    objM1956L = op0.m3598u(Boolean.FALSE);
                    go0Var3.m1981f0(objM1956L);
                }
                xk1 xk1Var = (xk1) objM1956L;
                Object objM1956L2 = go0Var3.m1956L();
                if (objM1956L2 == obj2) {
                    objM1956L2 = new ir1(xk1Var, t00Var, i5);
                    go0Var3.m1981f0(objM1956L2);
                }
                m1456f(go0Var3, (mn0) objM1956L2, a83.f116a);
                kr1 kr1Var2 = new kr1(16.0f);
                gu2 gu2VarM5481b = AbstractC0768uc.m5481b(((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.0f, up0.m5531J(160, null, 6), "SettingGroupAlphaAnimation", go0Var3, 3120);
                gu2 gu2VarM5480a = AbstractC0768uc.m5480a(((Boolean) xk1Var.getValue()).booleanValue() ? 0.0f : 6.0f, up0.m5528G(0.5f, 400.0f, null, 4), "SettingGroupOffsetAnimation", go0Var3);
                gu2 gu2VarM5481b2 = AbstractC0768uc.m5481b(((Boolean) xk1Var.getValue()).booleanValue() ? 1.0f : 0.0f, up0.m5531J(180, null, 6), "SettingGroupTitleAlphaAnimation", go0Var3, 3120);
                gu2 gu2VarM5480a2 = AbstractC0768uc.m5480a(((Boolean) xk1Var.getValue()).booleanValue() ? 0.0f : 6.0f, up0.m5528G(0.75f, 1500.0f, null, 4), "SettingGroupTitleOffsetAnimation", go0Var3);
                gu2 gu2VarM5480a3 = AbstractC0768uc.m5480a(((Boolean) xk1Var.getValue()).booleanValue() ? 22.0f : 7.0f, up0.m5528G(0.75f, 400.0f, null, 4), "SettingGroupTitleMarkWidthAnimation", go0Var3);
                yi0 yi0Var2 = AbstractC0731te.f10693e;
                uh1 uh1VarMo4491c = uh1Var3.mo4491c(yi0Var2);
                uh1 uh1Var4 = uh1Var3;
                C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var3, 0);
                int iHashCode = Long.hashCode(go0Var3.f3614T);
                yy1 yy1VarM1990l = go0Var3.m1990l();
                uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var3, uh1VarMo4491c);
                InterfaceC0293hx.f4166c.getClass();
                xm0 xm0Var2 = C0256gx.f3727b;
                go0Var3.m1969Z();
                if (go0Var3.f3613S) {
                    go0Var3.m1989k(xm0Var2);
                } else {
                    go0Var3.m1987i0();
                }
                C0419lc c0419lc5 = C0256gx.f3730e;
                yf3.m6268c(go0Var3, c0419lc5, c0032avM6346a);
                C0419lc c0419lc6 = C0256gx.f3729d;
                yf3.m6268c(go0Var3, c0419lc6, yy1VarM1990l);
                Integer numValueOf = Integer.valueOf(iHashCode);
                C0419lc c0419lc7 = C0256gx.f3731f;
                yf3.m6268c(go0Var3, c0419lc7, numValueOf);
                C0799v6 c0799v62 = C0256gx.f3732g;
                yf3.m6267b(go0Var3, c0799v62);
                C0419lc c0419lc8 = C0256gx.f3728c;
                yf3.m6268c(go0Var3, c0419lc8, uh1VarM5285M);
                if (str5 != null) {
                    go0Var3.m1966W(1697031315);
                    uh1 uh1VarM4675T = s11.m4675T(rh1Var, 0.0f, ((za0) gu2VarM5480a2.getValue()).f13798h, 1);
                    boolean zM1980f = go0Var3.m1980f(gu2VarM5481b2);
                    Object objM1956L3 = go0Var3.m1956L();
                    if (zM1980f || objM1956L3 == obj2) {
                        objM1956L3 = new hr1(gu2VarM5481b2, 1);
                        go0Var3.m1981f0(objM1956L3);
                    }
                    uh1 uh1VarM1615G = fg1.m1615G(AbstractC0731te.m5183L(uh1VarM4675T, (in0) objM1956L3), 8.0f, 0.0f, 0.0f, 8.0f, 6);
                    ob2 ob2VarM3265a = nb2.m3265a(tp0.f10874a, C0700sn.f10232t, go0Var3, 48);
                    int iHashCode2 = Long.hashCode(go0Var3.f3614T);
                    yy1 yy1VarM1990l2 = go0Var3.m1990l();
                    uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var3, uh1VarM1615G);
                    go0Var3.m1969Z();
                    if (go0Var3.f3613S) {
                        go0Var3.m1989k(xm0Var2);
                    } else {
                        go0Var3.m1987i0();
                    }
                    yf3.m6268c(go0Var3, c0419lc5, ob2VarM3265a);
                    yf3.m6268c(go0Var3, c0419lc6, yy1VarM1990l2);
                    vi0.m5698q(iHashCode2, go0Var3, c0419lc7, go0Var3, c0799v62);
                    yf3.m6268c(go0Var3, c0419lc8, uh1VarM5285M2);
                    uh1 uh1VarM825z = ci0.m825z(AbstractC0731te.m5213h0(rh1Var, ((za0) gu2VarM5480a3.getValue()).f13798h, 5.0f), gb2.f3387a);
                    e42 e42Var = ur1.f11452a;
                    AbstractC0135dm.m1057a(gf1.m1896n(uh1VarM825z, ((lp1) go0Var3.m1988j(e42Var)).f6239g, sp0.f10267h), go0Var3, 0);
                    String upperCase = str5.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    xm0Var = xm0Var2;
                    kr1Var = kr1Var2;
                    c0419lc3 = c0419lc7;
                    gu2Var = gu2VarM5481b;
                    str4 = str5;
                    c0419lc2 = c0419lc8;
                    c0799v6 = c0799v62;
                    yi0Var = yi0Var2;
                    r4 = 1;
                    c0419lc = c0419lc5;
                    obj = obj2;
                    c0419lc4 = c0419lc6;
                    v03.m5601b(upperCase, fg1.m1615G(rh1Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), ((lp1) go0Var3.m1988j(e42Var)).f6239g, rg3.m4450D(12), im0.f4683m, rg3.m4449C(0.7d), 0L, 0, false, 0, 0, null, go0Var3, 102260784, 0, 261800);
                    go0Var2 = go0Var3;
                    go0Var2.m1994p(true);
                    go0Var2.m1994p(false);
                } else {
                    c0419lc = c0419lc5;
                    c0419lc2 = c0419lc8;
                    c0799v6 = c0799v62;
                    c0419lc3 = c0419lc7;
                    str4 = str5;
                    yi0Var = yi0Var2;
                    obj = obj2;
                    kr1Var = kr1Var2;
                    gu2Var = gu2VarM5481b;
                    c0419lc4 = c0419lc6;
                    r4 = 1;
                    go0Var2 = go0Var3;
                    xm0Var = xm0Var2;
                    go0Var2.m1966W(1697900059);
                    go0Var2.m1994p(false);
                }
                uh1 uh1VarM4675T2 = s11.m4675T(yi0Var, 0.0f, ((za0) gu2VarM5480a.getValue()).f13798h, r4);
                boolean zM1980f2 = go0Var2.m1980f(gu2Var);
                Object objM1956L4 = go0Var2.m1956L();
                if (zM1980f2 || objM1956L4 == obj) {
                    objM1956L4 = new hr1(gu2Var, 2);
                    go0Var2.m1981f0(objM1956L4);
                }
                uh1 uh1VarM5183L = AbstractC0731te.m5183L(uh1VarM4675T2, (in0) objM1956L4);
                nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10222j, false);
                int iHashCode3 = Long.hashCode(go0Var2.f3614T);
                yy1 yy1VarM1990l3 = go0Var2.m1990l();
                uh1 uh1VarM5285M3 = AbstractC0738tl.m5285M(go0Var2, uh1VarM5183L);
                go0Var2.m1969Z();
                if (go0Var2.f3613S) {
                    go0Var2.m1989k(xm0Var);
                } else {
                    go0Var2.m1987i0();
                }
                yf3.m6268c(go0Var2, c0419lc, nf1VarM1060d);
                yf3.m6268c(go0Var2, c0419lc4, yy1VarM1990l3);
                vi0.m5698q(iHashCode3, go0Var2, c0419lc3, go0Var2, c0799v6);
                yf3.m6268c(go0Var2, c0419lc2, uh1VarM5285M3);
                c0402kw2 = c0402kw;
                go0 go0Var5 = go0Var2;
                ci0.m807h(yi0Var, kr1Var, 0L, 0L, 0.0f, 0L, 0.0f, null, null, xe1.m6126i0(135427166, new wt0((int) r4, c0402kw2), go0Var2), go0Var5, 805306422, 508);
                go0 go0Var6 = go0Var5;
                go0Var6.m1994p(r4);
                go0Var6.m1994p(r4);
                uh1Var2 = uh1Var4;
                str3 = str4;
                go0Var = go0Var6;
            }
            b62VarM1996r = go0Var.m1996r();
            if (b62VarM1996r == null) {
                b62VarM1996r.f616d = new f81(uh1Var2, str3, c0402kw2, i, i2);
                return;
            }
            return;
        }
        i3 |= 48;
        str2 = str;
        if ((i & 384) == 0) {
        }
        if (go0Var3.m1958O(i3 & 1, (i3 & 147) == 146)) {
        }
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r == null) {
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m1465o(uh1 uh1Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(2064964257);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(uh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 32 : 16;
        }
        int i3 = 0;
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            m1466p(uh1Var, c0402kw, go0Var, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0537ob(uh1Var, c0402kw, i, i3);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m1466p(uh1 uh1Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(771959668);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(uh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 256 : 128;
        }
        int i3 = 1;
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                nx1 nx1Var = new nx1(null, gd3.f3416C);
                go0Var.m1981f0(nx1Var);
                objM1956L = nx1Var;
            }
            xk1 xk1Var = (xk1) objM1956L;
            Object objM1956L2 = go0Var.m1956L();
            if (objM1956L2 == c0160eb) {
                objM1956L2 = new C0186f0(xk1Var, 5);
                go0Var.m1981f0(objM1956L2);
            }
            ci0.m800a(az2.f457b.mo1251a(m1439T((xm0) objM1956L2, go0Var, 0)), xe1.m6126i0(-291176396, new tt0(uh1Var, xk1Var, c0402kw), go0Var), go0Var, 56);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0537ob(uh1Var, c0402kw, i, i3);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final o62 m1467q(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new o62(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: r */
    public static final void m1468r(xm0 xm0Var, InterfaceC0596px interfaceC0596px) {
        kv1 kv1Var = ((go0) interfaceC0596px).f3607M.f9262b.f2145t;
        kv1Var.m2743X(av1.f410c);
        rg3.m4459M(kv1Var, 0, xm0Var);
    }

    /* JADX INFO: renamed from: s */
    public static float m1469s(EdgeEffect edgeEffect, float f, float f2, e70 e70Var) {
        float f3 = id0.f4566a;
        double dMo693b = e70Var.mo693b() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) id0.f4566a) * dMo693b;
        float fExp = (float) (Math.exp((id0.f4567b / id0.f4568c) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? AbstractC0495ne.m3288c(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iM1869Q = gf1.m1869Q(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iM1869Q);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iM1869Q);
        }
        return f;
    }

    /* JADX INFO: renamed from: t */
    public static final float m1470t(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: u */
    public static final JsObject m1471u(Throwable th) {
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
        Map map = sd2Var.f10064k;
        if (map.isEmpty()) {
            map = null;
        }
        return new JsObject(we1.m5876q0(new ow1("ok", Boolean.FALSE), new ow1("error", new JsObject(we1.m5876q0(new ow1("code", sd2Var.f10061h), new ow1("message", sd2Var.f10062i), new ow1("retryable", Boolean.valueOf(sd2Var.f10063j)), new ow1("details", map != null ? new JsObject(map) : null))))));
    }

    /* JADX INFO: renamed from: v */
    public static final JsObject m1472v(Object obj) {
        return new JsObject(we1.m5876q0(new ow1("ok", Boolean.TRUE), new ow1("value", obj)));
    }

    /* JADX INFO: renamed from: w */
    public static ArrayList m1473w(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0960zf(objArr, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1474x(u00 u00Var) {
        s60 s60Var;
        if (u00Var instanceof s60) {
            s60Var = (s60) u00Var;
            int i = s60Var.f9935l;
            if ((i & Integer.MIN_VALUE) != 0) {
                s60Var.f9935l = i - Integer.MIN_VALUE;
            } else {
                s60Var = new s60(u00Var);
            }
        }
        Object obj = s60Var.f9934k;
        int i2 = s60Var.f9935l;
        if (i2 == 0) {
            fg1.m1627T(obj);
            s60Var.f9935l = 1;
            C0469mp c0469mp = new C0469mp(1, gf1.m1908z(s60Var));
            c0469mp.m3151u();
            if (c0469mp.m3150t() == k20.f5323h) {
                return;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            fg1.m1627T(obj);
        }
        C0676s.m4644b();
    }

    /* JADX INFO: renamed from: y */
    public static int m1475y(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        int i = 0;
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            um2.m5514d(size, size2, ") is greater than size (", "toIndex (");
            return 0;
        }
        int i2 = size - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            int iM1897o = gf1.m1897o((Comparable) arrayList.get(i3), comparable);
            if (iM1897o < 0) {
                i = i3 + 1;
            } else {
                if (iM1897o <= 0) {
                    return i3;
                }
                i2 = i3 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: z */
    public static pb1 m1476z(pb1 pb1Var) {
        pb1Var.m3838f();
        pb1Var.f8245j = true;
        return pb1Var.f8244i > 0 ? pb1Var : pb1.f8242k;
    }
}
