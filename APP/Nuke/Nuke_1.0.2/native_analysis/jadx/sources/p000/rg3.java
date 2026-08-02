package p000;

import android.content.Context;
import android.content.res.Resources;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rg3 {

    /* JADX INFO: renamed from: m */
    public static final i51 f9571m;

    /* JADX INFO: renamed from: v */
    public static final n43 f9580v;

    /* JADX INFO: renamed from: w */
    public static sx0 f9581w;

    /* JADX INFO: renamed from: a */
    public static final float[][] f9559a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b */
    public static final float[][] f9560b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c */
    public static final float[] f9561c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d */
    public static final double[][] f9562d = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* JADX INFO: renamed from: e */
    public static final double[][] f9563e = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    /* JADX INFO: renamed from: f */
    public static final int[] f9564f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final long[] f9565g = new long[0];

    /* JADX INFO: renamed from: h */
    public static final Object[] f9566h = new Object[0];

    /* JADX INFO: renamed from: i */
    public static AbstractC0812vj[] f9567i = new AbstractC0812vj[0];

    /* JADX INFO: renamed from: j */
    public static AbstractC0255gw[] f9568j = new AbstractC0255gw[0];

    /* JADX INFO: renamed from: k */
    public static final C0612qa f9569k = new C0612qa(4);

    /* JADX INFO: renamed from: l */
    public static final StackTraceElement[] f9570l = new StackTraceElement[0];

    /* JADX INFO: renamed from: n */
    public static final n43 f9572n = new n43(new kx2(10), new kx2(27));

    /* JADX INFO: renamed from: o */
    public static final n43 f9573o = new n43(new kx2(11), new kx2(12));

    /* JADX INFO: renamed from: p */
    public static final n43 f9574p = new n43(new kx2(13), new kx2(14));

    /* JADX INFO: renamed from: q */
    public static final n43 f9575q = new n43(new kx2(15), new kx2(16));

    /* JADX INFO: renamed from: r */
    public static final n43 f9576r = new n43(new kx2(17), new kx2(18));

    /* JADX INFO: renamed from: s */
    public static final n43 f9577s = new n43(new kx2(19), new kx2(20));

    /* JADX INFO: renamed from: t */
    public static final n43 f9578t = new n43(new kx2(21), new kx2(22));

    /* JADX INFO: renamed from: u */
    public static final n43 f9579u = new n43(new kx2(23), new kx2(24));

    static {
        int i = 26;
        f9571m = new i51(i);
        f9580v = new n43(new kx2(25), new kx2(i));
    }

    /* JADX INFO: renamed from: A */
    public static final String m4447A(qn2 qn2Var, Resources resources) {
        int iOrdinal;
        ln2 ln2Var = qn2Var.f9050d;
        ln2 ln2Var2 = qn2Var.f9050d;
        Object objM4505g = ln2Var.f6221h.m4505g(vn2.f12059b);
        String string = null;
        if (objM4505g == null) {
            objM4505g = null;
        }
        rk1 rk1Var = ln2Var2.f6221h;
        Object objM4505g2 = rk1Var.m4505g(vn2.f12051K);
        if (objM4505g2 == null) {
            objM4505g2 = null;
        }
        u23 u23Var = (u23) objM4505g2;
        Object objM4505g3 = rk1Var.m4505g(vn2.f12083z);
        if (objM4505g3 == null) {
            objM4505g3 = null;
        }
        if (u23Var != null && (iOrdinal = u23Var.ordinal()) != 0 && iOrdinal != 1) {
            if (iOrdinal != 2) {
                c80.m675s();
                return null;
            }
            if (objM4505g == null) {
                objM4505g = resources.getString(R.string.indeterminate);
            }
        }
        Object objM4505g4 = rk1Var.m4505g(vn2.f12050J);
        if (objM4505g4 == null) {
            objM4505g4 = null;
        }
        Boolean bool = (Boolean) objM4505g4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (objM4505g == null) {
                objM4505g = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objM4505g5 = rk1Var.m4505g(vn2.f12060c);
        if (objM4505g5 == null) {
            objM4505g5 = null;
        }
        s32 s32Var = (s32) objM4505g5;
        if (s32Var != null) {
            if (s32Var != s32.f9897c) {
                if (objM4505g == null) {
                    float f = s32Var.f9899b.f10957a;
                    float f2 = f - 0.0f == 0.0f ? 0.0f : (s32Var.f9898a - 0.0f) / (f - 0.0f);
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    objM4505g = resources.getString(R.string.template_percent, Integer.valueOf(f2 == 0.0f ? 0 : f2 == 1.0f ? 100 : ci0.m779D(Math.round(f2 * 100.0f), 1, 99)));
                }
            } else if (objM4505g == null) {
                objM4505g = resources.getString(R.string.in_progress);
            }
        }
        yn2 yn2Var = vn2.f12047G;
        if (rk1Var.m4501c(yn2Var)) {
            rk1 rk1Var2 = new qn2(qn2Var.f9047a, true, qn2Var.f9049c, ln2Var2).m4209k().f6221h;
            Object objM4505g6 = rk1Var2.m4505g(vn2.f12058a);
            if (objM4505g6 == null) {
                objM4505g6 = null;
            }
            Collection collection = (Collection) objM4505g6;
            if (collection == null || collection.isEmpty()) {
                Object objM4505g7 = rk1Var2.m4505g(vn2.f12043C);
                if (objM4505g7 == null) {
                    objM4505g7 = null;
                }
                Collection collection2 = (Collection) objM4505g7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objM4505g8 = rk1Var2.m4505g(yn2Var);
                    if (objM4505g8 == null) {
                        objM4505g8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objM4505g8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objM4505g = string;
        }
        return (String) objM4505g;
    }

    /* JADX INFO: renamed from: B */
    public static final C0690sd m4448B(qn2 qn2Var) {
        Object objM4505g = qn2Var.f9050d.f6221h.m4505g(vn2.f12047G);
        if (objM4505g == null) {
            objM4505g = null;
        }
        C0690sd c0690sd = (C0690sd) objM4505g;
        Object objM4505g2 = qn2Var.f9050d.f6221h.m4505g(vn2.f12043C);
        if (objM4505g2 == null) {
            objM4505g2 = null;
        }
        List list = (List) objM4505g2;
        return c0690sd == null ? list != null ? (C0690sd) AbstractC0142du.m1161q0(list) : null : c0690sd;
    }

    /* JADX INFO: renamed from: C */
    public static final long m4449C(double d) {
        return m4455I((float) d, 4294967296L);
    }

    /* JADX INFO: renamed from: D */
    public static final long m4450D(int i) {
        return m4455I(i, 4294967296L);
    }

    /* JADX INFO: renamed from: E */
    public static int m4451E(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f9561c;
        return AbstractC0899xu.m6181a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: F */
    public static final void m4452F(go0 go0Var, mn0 mn0Var) {
        mn0Var.getClass();
        xe1.m6119f(2, mn0Var);
        mn0Var.mo12g(go0Var, 1);
    }

    /* JADX INFO: renamed from: G */
    public static float m4453G(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: H */
    public static final a20 m4454H(j20 j20Var, a20 a20Var) {
        a20 a20VarM4487w = m4487w(j20Var.mo705g(), a20Var, true);
        c60 c60Var = o90.f7590a;
        return (a20VarM4487w == c60Var || a20VarM4487w.mo15o(gd3.f3438p) != null) ? a20VarM4487w : a20VarM4487w.mo14k(c60Var);
    }

    /* JADX INFO: renamed from: I */
    public static final long m4455I(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        q13[] q13VarArr = p13.f7927b;
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: J */
    public static final j31 m4456J(kf2 kf2Var, String str, Context context) {
        uf2 uf2Var = kf2Var.f5500b;
        if (pv2.m4006s0(str) && uf2Var != uf2.f11273m) {
            return null;
        }
        int iOrdinal = uf2Var.ordinal();
        if (iOrdinal == 0) {
            C0676s.m4651j(context.getString(R.string.script_settings_boolean_editor_unsupported));
            return null;
        }
        int i = 1;
        if (iOrdinal == 1) {
            Long lM6014f0 = wv2.m6014f0(pv2.m3993I0(str).toString());
            if (lM6014f0 != null) {
                return l31.m2794b(lM6014f0);
            }
            C0676s.m4651j(context.getString(R.string.script_settings_invalid_integer));
            return null;
        }
        if (iOrdinal != 2) {
            int i2 = 3;
            if (iOrdinal == 3) {
                return l31.m2795c(str);
            }
            if (iOrdinal == 4) {
                return new z21(wo2.m5947T(new bj0(new bj0(new bj0(new C0497ng(i2, str), pk2.f8379o, 1), qk2.f9017o, 0), new d62(i, kf2Var, context), 1)));
            }
            c80.m675s();
            return null;
        }
        Double dM5802V = vv2.m5802V(pv2.m3993I0(str).toString());
        if (dM5802V != null) {
            if (Math.abs(dM5802V.doubleValue()) > Double.MAX_VALUE) {
                dM5802V = null;
            }
            if (dM5802V != null) {
                return l31.m2794b(dM5802V);
            }
        }
        C0676s.m4651j(context.getString(R.string.script_settings_invalid_number));
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static final int m4457K(String str, int i) {
        char cCharAt = str.charAt(i);
        return (cCharAt << 7) + str.charAt(i + 1);
    }

    /* JADX INFO: renamed from: L */
    public static final eo0 m4458L(InterfaceC0596px interfaceC0596px) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1964U(206, AbstractC0752tx.f10990e);
        if (go0Var.f3613S) {
            tr2.m5388z(go0Var.f3603I);
        }
        Object objM1948D = go0Var.m1948D();
        lo0 ba2Var = objM1948D instanceof lo0 ? (lo0) objM1948D : null;
        if (ba2Var == null) {
            ba2Var = new ba2(new do0(new eo0(go0Var, go0Var.f3614T, go0Var.f3632q, go0Var.f3597C, go0Var.f3623h.f3172A)), -1);
            go0Var.m1983g0(ba2Var);
        }
        a82 a82Var = ba2Var.f6226a;
        a82Var.getClass();
        eo0 eo0Var = ((do0) a82Var).f2127h;
        eo0Var.f2528f.setValue(go0Var.m1990l());
        go0Var.m1994p(false);
        return eo0Var;
    }

    /* JADX INFO: renamed from: M */
    public static final void m4459M(kv1 kv1Var, int i, Object obj) {
        kv1Var.f5829q[(kv1Var.f5830r - kv1Var.f5825m[kv1Var.f5826n - 1].f4805b) + i] = obj;
    }

    /* JADX INFO: renamed from: N */
    public static final void m4460N(kv1 kv1Var, int i, Object obj, int i2, Object obj2) {
        int i3 = kv1Var.f5830r - kv1Var.f5825m[kv1Var.f5826n - 1].f4805b;
        Object[] objArr = kv1Var.f5829q;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    /* JADX INFO: renamed from: O */
    public static final String[] m4461O(int i, InterfaceC0596px interfaceC0596px) {
        return ((Resources) ((go0) interfaceC0596px).m1988j(AbstractC0646r7.f9412c)).getStringArray(i);
    }

    /* JADX INFO: renamed from: P */
    public static final String m4462P(int i, InterfaceC0596px interfaceC0596px) {
        return ((Resources) ((go0) interfaceC0596px).m1988j(AbstractC0646r7.f9412c)).getString(i);
    }

    /* JADX INFO: renamed from: Q */
    public static final String m4463Q(int i, Object[] objArr, InterfaceC0596px interfaceC0596px) {
        return ((Resources) ((go0) interfaceC0596px).m1988j(AbstractC0646r7.f9412c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: R */
    public static final v73 m4464R(t00 t00Var, a20 a20Var, Object obj) {
        v73 v73Var = null;
        if ((t00Var instanceof l20) && a20Var.mo15o(C0588pp.f8430j) != null) {
            l20 l20VarMo2144d = (l20) t00Var;
            while (true) {
                if ((l20VarMo2144d instanceof l90) || (l20VarMo2144d = l20VarMo2144d.mo2144d()) == null) {
                    break;
                }
                if (l20VarMo2144d instanceof v73) {
                    v73Var = (v73) l20VarMo2144d;
                    break;
                }
            }
            if (v73Var != null) {
                v73Var.m5653m0(a20Var, obj);
            }
        }
        return v73Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4465a(C0127de c0127de, xm0 xm0Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        in0 in0Var2;
        Object x92Var;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(519367357);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(c0127de) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(xm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            in0Var2 = in0Var;
            i2 |= go0Var.m1984h(in0Var2) ? 256 : 128;
        } else {
            in0Var2 = in0Var;
        }
        int i3 = i2;
        int i4 = 0;
        if (go0Var.m1958O(i3 & 1, (i3 & 147) != 146)) {
            int i5 = i3 & 14;
            boolean z = i5 == 4;
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (z || objM1956L == c0160eb) {
                objM1956L = op0.m3598u(c0127de.f2003a);
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            boolean z2 = i5 == 4;
            Object objM1956L2 = go0Var.m1956L();
            if (z2 || objM1956L2 == c0160eb) {
                objM1956L2 = op0.m3598u(c0127de.f2004b);
                go0Var.m1981f0(objM1956L2);
            }
            xk1 xk1Var2 = (xk1) objM1956L2;
            boolean zM1980f = go0Var.m1980f((String) xk1Var2.getValue());
            Object objM1956L3 = go0Var.m1956L();
            if (zM1980f || objM1956L3 == c0160eb) {
                if (!pv2.m4006s0((String) xk1Var2.getValue())) {
                    try {
                        x92Var = new SimpleDateFormat((String) xk1Var2.getValue(), Locale.getDefault());
                    } catch (Throwable th) {
                        x92Var = new x92(th);
                    }
                    boolean z3 = !(x92Var instanceof x92);
                    objM1956L3 = Boolean.valueOf(z3);
                    go0Var.m1981f0(objM1956L3);
                }
            }
            boolean zBooleanValue = ((Boolean) objM1956L3).booleanValue();
            qp0.m4249d(true, xm0Var, null, m4462P(R.string.anti_revoke_config_title, go0Var), null, xe1.m6126i0(-1900508390, new C0200fe(xm0Var, in0Var2, xk1Var, xk1Var2, !pv2.m4006s0((String) xk1Var.getValue()) && zBooleanValue, 0), go0Var), xe1.m6126i0(1972530961, new C0237ge(i4, xk1Var, xk1Var2, zBooleanValue), go0Var), go0Var, (i3 & 112) | 1769478, 20);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0803va(c0127de, xm0Var, in0Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4466b(String str, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1688595585);
        int i2 = (go0Var.m1980f(str) ? 4 : 2) | i;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            AbstractC0179eu.m1446a(str, fg1.m1615G(rh1.f9587a, 0.0f, 0.0f, 0.0f, 8.0f, 7), new m13(((lp1) go0Var.m1988j(ur1.f11452a)).f6238f, m4450D(13), im0.f4681k, 0L, 0, m4450D(18), null, null, 16646136), 0, false, 0, 0, go0Var, (i2 & 14) | 48, 1016);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0481n0(str, i, 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4467c(String str, final xm0 xm0Var, final in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(482573122);
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
        final boolean z = false;
        int i3 = 1;
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 14) == 4;
            Object objM1956L = go0Var.m1956L();
            if (z2 || objM1956L == C0520nx.f7360a) {
                objM1956L = op0.m3598u(str);
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            final Long lM6014f0 = wv2.m6014f0(pv2.m3993I0((String) xk1Var.getValue()).toString());
            if (lM6014f0 != null && lM6014f0.longValue() > 0) {
                z = true;
            }
            qp0.m4249d(true, xm0Var, null, m4462P(R.string.chat_avatar_rotator_config_title, go0Var), null, xe1.m6126i0(402976453, new nn0() { // from class: ds
                @Override // p000.nn0
                /* JADX INFO: renamed from: e */
                public final Object mo489e(Object obj, Object obj2, Object obj3) {
                    pb2 pb2Var = (pb2) obj;
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    pb2Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((go0) interfaceC0596px2).m1980f(pb2Var) ? 4 : 2;
                    }
                    go0 go0Var2 = (go0) interfaceC0596px2;
                    if (go0Var2.m1958O(iIntValue & 1, (iIntValue & 19) != 18)) {
                        AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var2), xm0Var, pb2.m3843a(pb2Var), false, 0, go0Var2, 0, 56);
                        String strM4462P = rg3.m4462P(R.string.home_settings_save, go0Var2);
                        uh1 uh1VarM3843a = pb2.m3843a(pb2Var);
                        Long l = lM6014f0;
                        boolean zM1980f = go0Var2.m1980f(l);
                        in0 in0Var2 = in0Var;
                        boolean zM1980f2 = zM1980f | go0Var2.m1980f(in0Var2);
                        Object objM1956L2 = go0Var2.m1956L();
                        if (zM1980f2 || objM1956L2 == C0520nx.f7360a) {
                            objM1956L2 = new C0640r1(11, l, in0Var2);
                            go0Var2.m1981f0(objM1956L2);
                        }
                        AbstractC0691se.m4846q(strM4462P, (xm0) objM1956L2, uh1VarM3843a, z, 0, go0Var2, 0, 48);
                    } else {
                        go0Var2.m1961R();
                    }
                    return a83.f116a;
                }
            }, go0Var), xe1.m6126i0(-1852458386, new C0085cb(i3, xk1Var, z), go0Var), go0Var, (i2 & 112) | 1769478, 20);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0177es(str, xm0Var, in0Var, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4468d(int i, int i2, C0685s8 c0685s8, InterfaceC0921yf interfaceC0921yf, C0583pk c0583pk, InterfaceC0596px interfaceC0596px, n50 n50Var, in0 in0Var, d91 d91Var, uh1 uh1Var, jw1 jw1Var, boolean z) {
        uh1 uh1Var2;
        int i3;
        jw1 jw1Var2;
        InterfaceC0921yf interfaceC0921yf2;
        int i4;
        go0 go0Var;
        C0685s8 c0685s82;
        n50 n50Var2;
        boolean z2;
        jw1 jw1Var3;
        InterfaceC0921yf interfaceC0921yf3;
        C0583pk c0583pk2;
        d91 d91Var2;
        b62 b62VarM1996r;
        InterfaceC0921yf interfaceC0921yf4;
        Object c0685s83;
        C0685s8 c0685s84;
        C0583pk c0583pk3;
        InterfaceC0921yf interfaceC0921yf5;
        n50 n50Var3;
        d91 d91Var3;
        C0685s8 c0685s85;
        int i5;
        boolean z3;
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1967X(53695811);
        if ((i & 6) == 0) {
            uh1Var2 = uh1Var;
            i3 = (go0Var2.m1980f(uh1Var2) ? 4 : 2) | i;
        } else {
            uh1Var2 = uh1Var;
            i3 = i;
        }
        int i6 = i3 | 16;
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                jw1Var2 = jw1Var;
                i6 |= go0Var2.m1980f(jw1Var2) ? 256 : 128;
            }
            int i8 = i6 | 3072;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    interfaceC0921yf2 = interfaceC0921yf;
                    int i9 = go0Var2.m1980f(interfaceC0921yf2) ? 16384 : 8192;
                    i8 |= i9;
                } else {
                    interfaceC0921yf2 = interfaceC0921yf;
                }
                i8 |= i9;
            } else {
                interfaceC0921yf2 = interfaceC0921yf;
            }
            i4 = i8 | 46858240 | (!go0Var2.m1984h(in0Var) ? 536870912 : 268435456);
            if (go0Var2.m1958O(i4 & 1, (306783379 & i4) == 306783378)) {
                go0Var = go0Var2;
                go0Var.m1961R();
                c0685s82 = c0685s8;
                n50Var2 = n50Var;
                z2 = z;
                jw1Var3 = jw1Var2;
                interfaceC0921yf3 = interfaceC0921yf2;
                c0583pk2 = c0583pk;
                d91Var2 = d91Var;
            } else {
                go0Var2.m1963T();
                if ((i & 1) == 0 || go0Var2.m2003y()) {
                    x81 x81Var = f91.f2866a;
                    Object[] objArr = new Object[0];
                    dq1 dq1Var = d91.f1915x;
                    boolean zM1976d = go0Var2.m1976d(0) | go0Var2.m1976d(0);
                    Object objM1956L = go0Var2.m1956L();
                    C0160eb c0160eb = C0520nx.f7360a;
                    if (zM1976d || objM1956L == c0160eb) {
                        objM1956L = new n31(3);
                        go0Var2.m1981f0(objM1956L);
                    }
                    d91 d91Var4 = (d91) gf1.m1867O(objArr, dq1Var, (xm0) objM1956L, go0Var2, 0);
                    int i10 = i4 & (-113);
                    if (i7 != 0) {
                        jw1Var2 = new jw1(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        interfaceC0921yf4 = tp0.f10876c;
                        i10 = i4 & (-57457);
                    } else {
                        interfaceC0921yf4 = interfaceC0921yf2;
                    }
                    C0583pk c0583pk4 = C0700sn.f10233u;
                    float f = ot2.f7844a;
                    e70 e70Var = (e70) go0Var2.m1988j(AbstractC0441ly.f6382h);
                    boolean zM1974c = go0Var2.m1974c(e70Var.mo693b());
                    Object objM1956L2 = go0Var2.m1956L();
                    if (zM1974c || objM1956L2 == c0160eb) {
                        objM1956L2 = new r40(new hh1(e70Var));
                        go0Var2.m1981f0(objM1956L2);
                    }
                    r40 r40Var = (r40) objM1956L2;
                    boolean zM1980f = go0Var2.m1980f(r40Var);
                    Object objM1956L3 = go0Var2.m1956L();
                    if (zM1980f || objM1956L3 == c0160eb) {
                        objM1956L3 = new n50(r40Var);
                        go0Var2.m1981f0(objM1956L3);
                    }
                    n50 n50Var4 = (n50) objM1956L3;
                    C0478my c0478my = xv1.f13194a;
                    go0Var2.m1966W(282942128);
                    C0725t8 c0725t8 = (C0725t8) go0Var2.m1988j(xv1.f13194a);
                    if (c0725t8 == null) {
                        go0Var2.m1994p(false);
                        c0685s84 = null;
                    } else {
                        boolean zM1980f2 = go0Var2.m1980f(c0725t8);
                        Object objM1956L4 = go0Var2.m1956L();
                        if (zM1980f2 || objM1956L4 == c0160eb) {
                            c0685s83 = new C0685s8(c0725t8.f10599a, c0725t8.f10600b, c0725t8.f10601c, c0725t8.f10602d);
                            go0Var2.m1981f0(c0685s83);
                        } else {
                            c0685s83 = objM1956L4;
                        }
                        c0685s84 = (C0685s8) c0685s83;
                        go0Var2.m1994p(false);
                    }
                    int i11 = i10 & (-238551041);
                    c0583pk3 = c0583pk4;
                    interfaceC0921yf5 = interfaceC0921yf4;
                    n50Var3 = n50Var4;
                    d91Var3 = d91Var4;
                    c0685s85 = c0685s84;
                    i5 = i11;
                    z3 = true;
                } else {
                    go0Var2.m1961R();
                    int i12 = i4 & (-113);
                    if ((i2 & 16) != 0) {
                        i12 = i4 & (-57457);
                    }
                    i5 = i12 & (-238551041);
                    c0685s85 = c0685s8;
                    c0583pk3 = c0583pk;
                    n50Var3 = n50Var;
                    d91Var3 = d91Var;
                    z3 = z;
                    interfaceC0921yf5 = interfaceC0921yf2;
                }
                jw1 jw1Var4 = jw1Var2;
                go0Var2.m1995q();
                go0Var = go0Var2;
                ci0.m803d((i5 & 14) | 24576 | (i5 & 896) | 806882304, ((i5 >> 12) & 14) | ((i5 >> 18) & 7168), c0685s85, interfaceC0921yf5, c0583pk3, go0Var, n50Var3, in0Var, d91Var3, uh1Var2, jw1Var4, z3);
                c0685s82 = c0685s85;
                interfaceC0921yf3 = interfaceC0921yf5;
                c0583pk2 = c0583pk3;
                n50Var2 = n50Var3;
                d91Var2 = d91Var3;
                jw1Var3 = jw1Var4;
                z2 = z3;
            }
            b62VarM1996r = go0Var.m1996r();
            if (b62VarM1996r == null) {
                b62VarM1996r.f616d = new k71(uh1Var, d91Var2, jw1Var3, interfaceC0921yf3, c0583pk2, n50Var2, z2, c0685s82, in0Var, i, i2);
                return;
            }
            return;
        }
        i6 = i3 | 400;
        jw1Var2 = jw1Var;
        int i82 = i6 | 3072;
        if ((i & 24576) != 0) {
        }
        i4 = i82 | 46858240 | (!go0Var2.m1984h(in0Var) ? 536870912 : 268435456);
        if (go0Var2.m1958O(i4 & 1, (306783379 & i4) == 306783378)) {
        }
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r == null) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m4469e(final kf2 kf2Var, final String str, final String str2, final in0 in0Var, xm0 xm0Var, xm0 xm0Var2, InterfaceC0596px interfaceC0596px, int i) {
        vf2 vf2Var = kf2Var.f5517s;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(429717644);
        int i2 = i | (go0Var.m1984h(kf2Var) ? 4 : 2) | (go0Var.m1980f(str) ? 32 : 16) | (go0Var.m1980f(str2) ? 256 : 128) | (go0Var.m1984h(xm0Var2) ? 131072 : 65536);
        int i3 = 1;
        if (go0Var.m1958O(i2 & 1, (74899 & i2) != 74898)) {
            String str3 = kf2Var.f5512n;
            wf2 wf2Var = vf2Var.f11931a;
            final boolean z = wf2Var == wf2.f12487n || wf2Var == wf2.f12490q;
            uf2 uf2Var = kf2Var.f5500b;
            if (uf2Var == uf2.f11271k || uf2Var == uf2.f11272l) {
                i3 = 9;
            } else if (t11.m5086l(str3, "digits")) {
                i3 = 3;
            } else if (t11.m5086l(str3, "uri")) {
                i3 = 5;
            } else if (vf2Var.f11931a == wf2.f12486m) {
                i3 = 7;
            }
            final int i4 = i3;
            qp0.m4249d(true, xm0Var, null, kf2Var.f5501c, null, xe1.m6126i0(2070951913, new C0866x(xm0Var, xm0Var2, 10), go0Var), xe1.m6126i0(-1980458784, new nn0() { // from class: ck2
                @Override // p000.nn0
                /* JADX INFO: renamed from: e */
                public final Object mo489e(Object obj, Object obj2, Object obj3) {
                    int iIntValue;
                    C0069bv c0069bv = (C0069bv) obj;
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    c0069bv.getClass();
                    if ((iIntValue2 & 6) == 0) {
                        iIntValue2 |= ((go0) interfaceC0596px2).m1980f(c0069bv) ? 4 : 2;
                    }
                    int iIntValue3 = 1;
                    go0 go0Var2 = (go0) interfaceC0596px2;
                    if (go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                        yi0 yi0Var = AbstractC0731te.f10693e;
                        vf2 vf2Var2 = kf2Var.f5517s;
                        String str4 = vf2Var2.f11932b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = str4;
                        boolean z2 = z;
                        boolean z3 = !z2;
                        if (z2) {
                            Integer num = vf2Var2.f11934d;
                            iIntValue = num != null ? num.intValue() : 3;
                        } else {
                            iIntValue = 1;
                        }
                        if (z2) {
                            Integer num2 = vf2Var2.f11935e;
                            iIntValue3 = num2 != null ? num2.intValue() : 8;
                        }
                        tp0.m5357b(str, in0Var, yi0Var, str5, null, null, z3, iIntValue, iIntValue3, false, false, vf2Var2.f11931a == wf2.f12486m ? new tx1() : gd3.f3429P, new m51(i4, 123), null, go0Var2, 384, 0, 9776);
                        String str6 = str2;
                        if (str6 == null) {
                            go0Var2.m1966W(118854048);
                            go0Var2.m1994p(false);
                        } else {
                            go0Var2.m1966W(118854049);
                            qp0.m4250e(str6, new bu0(), go0Var2, 0, 0);
                            go0Var2.m1994p(false);
                        }
                    } else {
                        go0Var2.m1961R();
                    }
                    return a83.f116a;
                }
            }, go0Var), go0Var, 1769526, 20);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new au0(kf2Var, str, str2, in0Var, xm0Var, xm0Var2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01cc  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4470f(kf2 kf2Var, j31 j31Var, String str, in0 in0Var, xm0 xm0Var, InterfaceC0596px interfaceC0596px, int i) {
        String string;
        Boolean boolM2796d;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1861006112);
        int i2 = i | (go0Var.m1984h(kf2Var) ? 4 : 2) | (go0Var.m1984h(j31Var) ? 32 : 16) | (go0Var.m1980f(str) ? 256 : 128) | (go0Var.m1984h(in0Var) ? 2048 : 1024) | (go0Var.m1984h(xm0Var) ? 16384 : 8192);
        if (go0Var.m1958O(i2 & 1, (i2 & 9363) != 9362)) {
            String str2 = kf2Var.f5502d;
            List list = kf2Var.f5506h;
            String str3 = kf2Var.f5501c;
            uf2 uf2Var = kf2Var.f5500b;
            String strM1165u0 = AbstractC0142du.m1165u0(AbstractC0179eu.m1436Q(str2, str), "\n", null, null, null, 62);
            Object obj = null;
            if (pv2.m4006s0(strM1165u0)) {
                strM1165u0 = null;
            }
            uf2 uf2Var2 = uf2.f11270j;
            C0160eb c0160eb = C0520nx.f7360a;
            if (uf2Var == uf2Var2) {
                go0Var.m1966W(1795592308);
                i41 i41Var = j31Var instanceof i41 ? (i41) j31Var : null;
                boolean zBooleanValue = (i41Var == null || (boolM2796d = l31.m2796d(i41Var)) == null) ? false : boolM2796d.booleanValue();
                C0402kw c0402kwM6126i0 = xe1.m6126i0(1465850092, new C0656rh(kf2Var, zBooleanValue, in0Var), go0Var);
                boolean zM1982g = go0Var.m1982g(zBooleanValue) | ((i2 & 7168) == 2048);
                Object objM1956L = go0Var.m1956L();
                if (zM1982g || objM1956L == c0160eb) {
                    objM1956L = new C0619qh(5, in0Var, zBooleanValue);
                    go0Var.m1981f0(objM1956L);
                }
                sp0.m4940g(str3, null, strM1165u0, null, c0402kwM6126i0, null, false, (xm0) objM1956L, null, go0Var, 24576, 362);
                go0Var.m1994p(false);
            } else {
                String str4 = strM1165u0;
                if (list.isEmpty()) {
                    go0Var.m1966W(1796929400);
                    if (j31Var == null) {
                        go0Var.m1966W(-1983762116);
                        string = m4462P(R.string.script_settings_unconfigured, go0Var);
                        go0Var.m1994p(false);
                    } else if (kf2Var.f5505g) {
                        go0Var.m1966W(-1983759846);
                        string = m4462P(R.string.script_settings_configured, go0Var);
                        go0Var.m1994p(false);
                    } else if (uf2Var == uf2.f11274n) {
                        go0Var.m1966W(-1983756910);
                        z21 z21Var = j31Var instanceof z21 ? (z21) j31Var : null;
                        string = m4463Q(R.string.script_settings_item_count, new Object[]{Integer.valueOf(z21Var != null ? z21Var.f13709h.size() : 0)}, go0Var);
                        go0Var.m1994p(false);
                    } else if (j31Var instanceof i41) {
                        i41 i41Var2 = (i41) j31Var;
                        if (i41Var2.mo2264b()) {
                            go0Var.m1966W(-1983751569);
                            go0Var.m1994p(false);
                            string = pv2.m3992H0(i41Var2.mo2263a(), 24);
                        } else {
                            go0Var.m1966W(-1983750703);
                            go0Var.m1994p(false);
                            string = j31Var.toString();
                        }
                    }
                    String str5 = kf2Var.f5517s.f11933c;
                    qp0.m4253h(str3, xm0Var, null, str4, null, hk1.m2209h(string, str5 != null ? " ".concat(str5) : ""), null, false, null, go0Var, (i2 >> 9) & 112, 468);
                    go0Var.m1994p(false);
                } else {
                    go0Var.m1966W(1796462292);
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((jf2) next).f5016a.equals(j31Var)) {
                            obj = next;
                            break;
                        }
                    }
                    jf2 jf2Var = (jf2) obj;
                    if (jf2Var == null) {
                        jf2Var = (jf2) AbstractC0142du.m1159o0(list);
                    }
                    jf2 jf2Var2 = jf2Var;
                    boolean z = (i2 & 7168) == 2048;
                    Object objM1956L2 = go0Var.m1956L();
                    if (z || objM1956L2 == c0160eb) {
                        objM1956L2 = new wo0(in0Var, 3);
                        go0Var.m1981f0(objM1956L2);
                    }
                    AbstractC0179eu.m1463m(str3, list, jf2Var2, (in0) objM1956L2, null, str4, mk2.f6710o, false, go0Var, 0);
                    go0Var = go0Var;
                    go0Var.m1994p(false);
                }
            }
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0959ze(kf2Var, j31Var, str, in0Var, xm0Var, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m4471g(final in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var;
        int i2;
        Object vi2Var;
        xk1 xk1Var;
        xk1 xk1Var2;
        List list;
        xk1 xk1Var3;
        xk1 xk1Var4;
        xk1 xk1Var5;
        xk1 xk1Var6;
        Object c0810vh;
        C0160eb c0160eb;
        kf2 kf2Var;
        xk1 xk1Var7;
        xk1 xk1Var8;
        xk1 xk1Var9;
        C0160eb c0160eb2;
        boolean z;
        xk1 xk1Var10;
        xk1 xk1Var11;
        j20 j20Var;
        Context context;
        boolean z2;
        C0160eb c0160eb3;
        int i3;
        in0Var.getClass();
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1967X(820665483);
        int i4 = 2;
        int i5 = i | (go0Var2.m1984h(in0Var) ? 4 : 2);
        int i6 = 1;
        if (go0Var2.m1958O(i5 & 1, (i5 & 3) != 2)) {
            Context context2 = (Context) go0Var2.m1988j(AbstractC0646r7.f9411b);
            Object objM1956L = go0Var2.m1956L();
            C0160eb c0160eb4 = C0520nx.f7360a;
            if (objM1956L == c0160eb4) {
                objM1956L = AbstractC0179eu.m1422C(go0Var2);
                go0Var2.m1981f0(objM1956L);
            }
            final j20 j20Var2 = (j20) objM1956L;
            m52 m52Var = sq1.f10309e;
            Object value = m52Var.f6484h.getValue();
            zd0 zd0Var = zd0.f13837h;
            boolean zM1984h = go0Var2.m1984h(zd0Var) | go0Var2.m1984h(m52Var);
            Object objM1956L2 = go0Var2.m1956L();
            t00 t00Var = null;
            if (zM1984h || objM1956L2 == c0160eb4) {
                objM1956L2 = new C0040b2(zd0Var, m52Var, t00Var, 20);
                go0Var2.m1981f0(objM1956L2);
            }
            mn0 mn0Var = (mn0) objM1956L2;
            Object objM1956L3 = go0Var2.m1956L();
            if (objM1956L3 == c0160eb4) {
                objM1956L3 = op0.m3598u(value);
                go0Var2.m1981f0(objM1956L3);
            }
            xk1 xk1Var12 = (xk1) objM1956L3;
            boolean zM1984h2 = go0Var2.m1984h(mn0Var);
            Object objM1956L4 = go0Var2.m1956L();
            if (zM1984h2 || objM1956L4 == c0160eb4) {
                objM1956L4 = new ms2(mn0Var, xk1Var12, t00Var, i6);
                go0Var2.m1981f0(objM1956L4);
            }
            AbstractC0179eu.m1457g(m52Var, zd0Var, (mn0) objM1956L4, go0Var2);
            Object[] objArr = new Object[0];
            Object objM1956L5 = go0Var2.m1956L();
            if (objM1956L5 == c0160eb4) {
                objM1956L5 = new hn1(13);
                go0Var2.m1981f0(objM1956L5);
            }
            final xk1 xk1Var13 = (xk1) gf1.m1865M(objArr, (xm0) objM1956L5, go0Var2, 48);
            Object objM1956L6 = go0Var2.m1956L();
            if (objM1956L6 == c0160eb4) {
                objM1956L6 = op0.m3598u(null);
                go0Var2.m1981f0(objM1956L6);
            }
            xk1 xk1Var14 = (xk1) objM1956L6;
            Object objM1956L7 = go0Var2.m1956L();
            if (objM1956L7 == c0160eb4) {
                objM1956L7 = op0.m3598u(Boolean.FALSE);
                go0Var2.m1981f0(objM1956L7);
            }
            xk1 xk1Var15 = (xk1) objM1956L7;
            Object objM1956L8 = go0Var2.m1956L();
            if (objM1956L8 == c0160eb4) {
                objM1956L8 = op0.m3598u(null);
                go0Var2.m1981f0(objM1956L8);
            }
            xk1 xk1Var16 = (xk1) objM1956L8;
            Object objM1956L9 = go0Var2.m1956L();
            if (objM1956L9 == c0160eb4) {
                objM1956L9 = op0.m3598u(null);
                go0Var2.m1981f0(objM1956L9);
            }
            final xk1 xk1Var17 = (xk1) objM1956L9;
            Object objM1956L10 = go0Var2.m1956L();
            if (objM1956L10 == c0160eb4) {
                objM1956L10 = op0.m3598u("");
                go0Var2.m1981f0(objM1956L10);
            }
            final xk1 xk1Var18 = (xk1) objM1956L10;
            Object objM1956L11 = go0Var2.m1956L();
            if (objM1956L11 == c0160eb4) {
                objM1956L11 = op0.m3598u(null);
                go0Var2.m1981f0(objM1956L11);
            }
            final xk1 xk1Var19 = (xk1) objM1956L11;
            Object objM1956L12 = go0Var2.m1956L();
            if (objM1956L12 == c0160eb4) {
                objM1956L12 = op0.m3598u(null);
                go0Var2.m1981f0(objM1956L12);
            }
            final xk1 xk1Var20 = (xk1) objM1956L12;
            Object objM1956L13 = go0Var2.m1956L();
            if (objM1956L13 == c0160eb4) {
                objM1956L13 = op0.m3598u(Boolean.FALSE);
                go0Var2.m1981f0(objM1956L13);
            }
            xk1 xk1Var21 = (xk1) objM1956L13;
            final String strM4462P = m4462P(R.string.script_settings_permissions_label, go0Var2);
            final String strM4462P2 = m4462P(R.string.script_settings_dangerous_permissions_label, go0Var2);
            final String strM4462P3 = m4462P(R.string.script_settings_granted, go0Var2);
            final String strM4462P4 = m4462P(R.string.script_settings_pending, go0Var2);
            final String strM4462P5 = m4462P(R.string.script_settings_permission_list_separator, go0Var2);
            final String strM4462P6 = m4462P(R.string.script_settings_permission_detail_separator, go0Var2);
            boolean zM1984h3 = go0Var2.m1984h(context2);
            Object objM1956L14 = go0Var2.m1956L();
            if (zM1984h3 || objM1956L14 == c0160eb4) {
                objM1956L14 = new u80(context2, t00Var, i4);
                go0Var2.m1981f0(objM1956L14);
            }
            AbstractC0179eu.m1456f(go0Var2, (mn0) objM1956L14, context2);
            List list2 = ((tq1) xk1Var12.getValue()).f10899a;
            String str = (String) xk1Var13.getValue();
            boolean zM1980f = go0Var2.m1980f(xk1Var13) | go0Var2.m1980f(xk1Var12);
            Object objM1956L15 = go0Var2.m1956L();
            int i7 = 7;
            if (zM1980f || objM1956L15 == c0160eb4) {
                objM1956L15 = new u30(xk1Var13, xk1Var12, t00Var, i7);
                go0Var2.m1981f0(objM1956L15);
            }
            AbstractC0179eu.m1457g(list2, str, (mn0) objM1956L15, go0Var2);
            String str2 = (String) xk1Var13.getValue();
            List list3 = ((tq1) xk1Var12.getValue()).f10899a;
            boolean zM1980f2 = go0Var2.m1980f(xk1Var13) | go0Var2.m1980f(xk1Var12) | go0Var2.m1984h(context2);
            Object objM1956L16 = go0Var2.m1956L();
            if (zM1980f2 || objM1956L16 == c0160eb4) {
                xk1Var = xk1Var21;
                xk1Var2 = xk1Var15;
                list = list3;
                xk1Var3 = xk1Var12;
                vi2Var = new vi2(xk1Var13, xk1Var3, xk1Var14, xk1Var16, xk1Var2, context2, (t00) null);
                xk1Var4 = xk1Var14;
                context2 = context2;
                xk1Var5 = xk1Var16;
                go0Var2.m1981f0(vi2Var);
            } else {
                list = list3;
                xk1Var3 = xk1Var12;
                xk1Var2 = xk1Var15;
                xk1Var5 = xk1Var16;
                xk1Var = xk1Var21;
                vi2Var = objM1956L16;
                xk1Var4 = xk1Var14;
            }
            AbstractC0179eu.m1457g(str2, list, (mn0) vi2Var, go0Var2);
            final Context context3 = context2;
            final xk1 xk1Var22 = xk1Var3;
            final xk1 xk1Var23 = xk1Var4;
            final xk1 xk1Var24 = xk1Var5;
            xk1 xk1Var25 = xk1Var;
            final xk1 xk1Var26 = xk1Var2;
            mn0 mn0Var2 = new mn0() { // from class: lk2
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                    int iIntValue = ((Integer) obj2).intValue();
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
                        tp0.m5358c(rg3.m4462P(R.string.home_settings_scripts, go0Var3), null, null, in0Var, go0Var3, 0, 30);
                        uh1 uh1VarMo4491c = AbstractC0731te.f10693e.mo4491c(new g71(1.0f, true));
                        jw1 jw1VarM1635h = fg1.m1635h();
                        C0884xf c0884xf = new C0884xf(12.0f, new C0676s(2));
                        final Context context4 = context3;
                        boolean zM1984h4 = go0Var3.m1984h(context4);
                        final xk1 xk1Var27 = xk1Var22;
                        boolean zM1980f3 = zM1984h4 | go0Var3.m1980f(xk1Var27);
                        final String str3 = strM4462P;
                        boolean zM1980f4 = zM1980f3 | go0Var3.m1980f(str3);
                        final String str4 = strM4462P6;
                        boolean zM1980f5 = zM1980f4 | go0Var3.m1980f(str4);
                        final String str5 = strM4462P5;
                        boolean zM1980f6 = zM1980f5 | go0Var3.m1980f(str5);
                        final String str6 = strM4462P2;
                        boolean zM1980f7 = zM1980f6 | go0Var3.m1980f(str6);
                        final String str7 = strM4462P3;
                        boolean zM1980f8 = zM1980f7 | go0Var3.m1980f(str7);
                        final String str8 = strM4462P4;
                        boolean zM1980f9 = zM1980f8 | go0Var3.m1980f(str8);
                        final j20 j20Var3 = j20Var2;
                        boolean zM1984h5 = zM1980f9 | go0Var3.m1984h(j20Var3);
                        final xk1 xk1Var28 = xk1Var13;
                        boolean zM1980f10 = zM1984h5 | go0Var3.m1980f(xk1Var28);
                        Object objM1956L17 = go0Var3.m1956L();
                        if (zM1980f10 || objM1956L17 == C0520nx.f7360a) {
                            final xk1 xk1Var29 = xk1Var19;
                            final xk1 xk1Var30 = xk1Var24;
                            final xk1 xk1Var31 = xk1Var20;
                            final xk1 xk1Var32 = xk1Var26;
                            final xk1 xk1Var33 = xk1Var23;
                            final xk1 xk1Var34 = xk1Var17;
                            final xk1 xk1Var35 = xk1Var18;
                            objM1956L17 = new in0() { // from class: bk2
                                @Override // p000.in0
                                /* JADX INFO: renamed from: j */
                                public final Object mo5j(Object obj3) {
                                    int i8;
                                    final xk1 xk1Var36;
                                    final xk1 xk1Var37;
                                    boolean z3;
                                    final String str9;
                                    final String str10;
                                    final String str11;
                                    final String str12;
                                    final j20 j20Var4;
                                    Object next;
                                    s81 s81Var = (s81) obj3;
                                    s81Var.getClass();
                                    final Context context5 = context4;
                                    int i9 = 2;
                                    s81.m4760a(s81Var, "script_directory", new C0402kw(185293217, true, new wt0(8, context5)), 2);
                                    xk1 xk1Var38 = xk1Var27;
                                    boolean zIsEmpty = ((tq1) xk1Var38.getValue()).f10899a.isEmpty();
                                    final xk1 xk1Var39 = xk1Var28;
                                    final String str13 = str4;
                                    final String str14 = str5;
                                    final String str15 = str7;
                                    final String str16 = str8;
                                    final j20 j20Var5 = j20Var3;
                                    final xk1 xk1Var40 = xk1Var29;
                                    xk1 xk1Var41 = xk1Var30;
                                    if (zIsEmpty) {
                                        s81.m4760a(s81Var, "script_empty", new C0402kw(-819491204, true, new y30(xk1Var38, i9)), 2);
                                        xk1Var37 = xk1Var38;
                                        z3 = true;
                                        i8 = 2;
                                        xk1Var36 = xk1Var41;
                                        str9 = str13;
                                        str10 = str14;
                                        str11 = str15;
                                        str12 = str16;
                                        j20Var4 = j20Var5;
                                    } else {
                                        i8 = 2;
                                        xk1Var36 = xk1Var41;
                                        final String str17 = str3;
                                        final String str18 = str6;
                                        xk1Var37 = xk1Var38;
                                        z3 = true;
                                        nn0 nn0Var = new nn0() { // from class: dk2
                                            @Override // p000.nn0
                                            /* JADX INFO: renamed from: e */
                                            public final Object mo489e(Object obj4, Object obj5, Object obj6) {
                                                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj5;
                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                ((o71) obj4).getClass();
                                                go0 go0Var4 = (go0) interfaceC0596px3;
                                                if (go0Var4.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    String strM4462P7 = rg3.m4462P(R.string.script_settings_installed, go0Var4);
                                                    final xk1 xk1Var42 = xk1Var37;
                                                    final xk1 xk1Var43 = xk1Var39;
                                                    final String str19 = str17;
                                                    final String str20 = str13;
                                                    final String str21 = str14;
                                                    final String str22 = str18;
                                                    final String str23 = str15;
                                                    final String str24 = str16;
                                                    final j20 j20Var6 = j20Var5;
                                                    final Context context6 = context5;
                                                    final xk1 xk1Var44 = xk1Var40;
                                                    final xk1 xk1Var45 = xk1Var36;
                                                    AbstractC0179eu.m1464n(null, strM4462P7, xe1.m6126i0(940896100, new mn0() { // from class: ik2
                                                        @Override // p000.mn0
                                                        /* JADX INFO: renamed from: g */
                                                        public final Object mo12g(Object obj7, Object obj8) {
                                                            InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj7;
                                                            int iIntValue3 = ((Integer) obj8).intValue();
                                                            go0 go0Var5 = (go0) interfaceC0596px4;
                                                            if (go0Var5.m1958O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                for (cq1 cq1Var : ((tq1) xk1Var42.getValue()).f10899a) {
                                                                    String str25 = cq1Var.f1676b;
                                                                    List list4 = cq1Var.f1683i;
                                                                    StringBuilder sb = new StringBuilder();
                                                                    sb.append(cq1Var.f1675a);
                                                                    sb.append(" · ");
                                                                    sb.append(cq1Var.f1677c);
                                                                    boolean zIsEmpty2 = list4.isEmpty();
                                                                    String str26 = str20;
                                                                    if (!zIsEmpty2) {
                                                                        sb.append("\n" + str19 + str26);
                                                                        sb.append(AbstractC0142du.m1165u0(list4, str21, null, null, null, 62));
                                                                    }
                                                                    if (!cq1Var.f1684j.isEmpty()) {
                                                                        sb.append("\n" + str22 + str26);
                                                                        sb.append(cq1Var.f1685k ? str23 : str24);
                                                                    }
                                                                    String str27 = cq1Var.f1681g;
                                                                    if (str27 != null) {
                                                                        sb.append("\n".concat(str27));
                                                                    }
                                                                    String str28 = cq1Var.f1682h;
                                                                    if (str28 != null) {
                                                                        sb.append("\n".concat(str28));
                                                                    }
                                                                    String string = sb.toString();
                                                                    C0402kw c0402kwM6126i0 = xe1.m6126i0(-66744860, new C0959ze(cq1Var, j20Var6, context6, xk1Var44, xk1Var45), go0Var5);
                                                                    xk1 xk1Var46 = xk1Var43;
                                                                    boolean zM1980f11 = go0Var5.m1980f(xk1Var46) | go0Var5.m1984h(cq1Var);
                                                                    Object objM1956L18 = go0Var5.m1956L();
                                                                    if (zM1980f11 || objM1956L18 == C0520nx.f7360a) {
                                                                        objM1956L18 = new C0640r1(28, cq1Var, xk1Var46);
                                                                        go0Var5.m1981f0(objM1956L18);
                                                                    }
                                                                    sp0.m4940g(str25, null, string, null, c0402kwM6126i0, null, false, (xm0) objM1956L18, null, go0Var5, 24576, 362);
                                                                }
                                                            } else {
                                                                go0Var5.m1961R();
                                                            }
                                                            return a83.f116a;
                                                        }
                                                    }, go0Var4), go0Var4, 384, 1);
                                                } else {
                                                    go0Var4.m1961R();
                                                }
                                                return a83.f116a;
                                            }
                                        };
                                        str9 = str13;
                                        str10 = str14;
                                        str11 = str15;
                                        str12 = str16;
                                        j20Var4 = j20Var5;
                                        s81.m4760a(s81Var, "script_list", new C0402kw(1426426437, true, nn0Var), 2);
                                    }
                                    Iterator it = ((tq1) xk1Var37.getValue()).f10899a.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        if (t11.m5086l(((cq1) next).f1675a, (String) xk1Var39.getValue())) {
                                            break;
                                        }
                                    }
                                    final cq1 cq1Var = (cq1) next;
                                    if (cq1Var != null) {
                                        String strM5690i = vi0.m5690i("script_permissions_", cq1Var.f1675a);
                                        final xk1 xk1Var42 = xk1Var31;
                                        final xk1 xk1Var43 = xk1Var36;
                                        xk1Var36 = xk1Var43;
                                        s81.m4760a(s81Var, strM5690i, new C0402kw(2057266291, z3, new nn0() { // from class: ek2
                                            @Override // p000.nn0
                                            /* JADX INFO: renamed from: e */
                                            public final Object mo489e(Object obj4, Object obj5, Object obj6) {
                                                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj5;
                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                ((o71) obj4).getClass();
                                                go0 go0Var4 = (go0) interfaceC0596px3;
                                                if (go0Var4.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    String strM4462P7 = rg3.m4462P(R.string.script_settings_permissions_section, go0Var4);
                                                    final cq1 cq1Var2 = cq1Var;
                                                    final String str19 = str10;
                                                    final String str20 = str9;
                                                    final String str21 = str11;
                                                    final String str22 = str12;
                                                    final xk1 xk1Var44 = xk1Var42;
                                                    final xk1 xk1Var45 = xk1Var40;
                                                    final xk1 xk1Var46 = xk1Var43;
                                                    AbstractC0179eu.m1464n(null, strM4462P7, xe1.m6126i0(-819387886, new mn0() { // from class: jk2
                                                        @Override // p000.mn0
                                                        /* JADX INFO: renamed from: g */
                                                        public final Object mo12g(Object obj7, Object obj8) {
                                                            long j;
                                                            cq1 cq1Var3 = cq1Var2;
                                                            List list4 = cq1Var3.f1684j;
                                                            InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj7;
                                                            int iIntValue3 = ((Integer) obj8).intValue();
                                                            go0 go0Var5 = (go0) interfaceC0596px4;
                                                            if (go0Var5.m1958O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                String strM4462P8 = rg3.m4462P(R.string.script_settings_declared_permissions, go0Var5);
                                                                List list5 = cq1Var3.f1683i;
                                                                List list6 = !list5.isEmpty() ? list5 : null;
                                                                String strM1165u0 = list6 != null ? AbstractC0142du.m1165u0(list6, str19, null, null, null, 62) : null;
                                                                if (strM1165u0 == null) {
                                                                    go0Var5.m1966W(-1452730289);
                                                                    strM1165u0 = rg3.m4462P(R.string.script_settings_no_extra_permissions, go0Var5);
                                                                } else {
                                                                    go0Var5.m1966W(-1452736861);
                                                                }
                                                                go0Var5.m1994p(false);
                                                                sp0.m4940g(strM4462P8, null, strM1165u0, null, null, null, false, null, null, go0Var5, 0, 506);
                                                                if (list4.isEmpty()) {
                                                                    go0Var5.m1966W(-2082754736);
                                                                    go0Var5.m1994p(false);
                                                                } else {
                                                                    go0Var5.m1966W(-2084700730);
                                                                    String strM4462P9 = rg3.m4462P(R.string.script_settings_dangerous_authorization, go0Var5);
                                                                    String str23 = str20;
                                                                    boolean zM1980f11 = go0Var5.m1980f(str23);
                                                                    Object objM1956L18 = go0Var5.m1956L();
                                                                    C0160eb c0160eb5 = C0520nx.f7360a;
                                                                    if (zM1980f11 || objM1956L18 == c0160eb5) {
                                                                        objM1956L18 = new C0792v(26, str23);
                                                                        go0Var5.m1981f0(objM1956L18);
                                                                    }
                                                                    String strM1165u02 = AbstractC0142du.m1165u0(list4, "\n", null, null, (in0) objM1956L18, 30);
                                                                    boolean z4 = cq1Var3.f1685k;
                                                                    String str24 = z4 ? str21 : str22;
                                                                    if (z4) {
                                                                        go0Var5.m1966W(-2083883198);
                                                                        j = ((lp1) go0Var5.m1988j(ur1.f11452a)).f6238f;
                                                                        go0Var5.m1994p(false);
                                                                    } else {
                                                                        go0Var5.m1966W(-2083768343);
                                                                        j = ((lp1) go0Var5.m1988j(ur1.f11452a)).f6239g;
                                                                        go0Var5.m1994p(false);
                                                                    }
                                                                    boolean zM1984h6 = go0Var5.m1984h(cq1Var3);
                                                                    Object objM1956L19 = go0Var5.m1956L();
                                                                    if (zM1984h6 || objM1956L19 == c0160eb5) {
                                                                        objM1956L19 = new dz0(cq1Var3, xk1Var44, xk1Var45, xk1Var46);
                                                                        go0Var5.m1981f0(objM1956L19);
                                                                    }
                                                                    qp0.m4253h(strM4462P9, (xm0) objM1956L19, null, strM1165u02, null, str24, new C0363ju(j), false, null, go0Var5, 0, 404);
                                                                    go0Var5.m1994p(false);
                                                                }
                                                            } else {
                                                                go0Var5.m1961R();
                                                            }
                                                            return a83.f116a;
                                                        }
                                                    }, go0Var4), go0Var4, 384, 1);
                                                } else {
                                                    go0Var4.m1961R();
                                                }
                                                return a83.f116a;
                                            }
                                        }), i8);
                                    }
                                    if (cq1Var != null && !cq1Var.f1679e) {
                                        s81.m4760a(s81Var, "script_no_schema", new C0402kw(600853236, z3, new fk2(cq1Var, 0)), i8);
                                    }
                                    if (((Boolean) xk1Var32.getValue()).booleanValue()) {
                                        s81.m4760a(s81Var, "script_settings_loading", t11.f10479a, i8);
                                    }
                                    final xk1 xk1Var44 = xk1Var33;
                                    uq1 uq1Var = (uq1) xk1Var44.getValue();
                                    if (uq1Var != null) {
                                        for (final qf2 qf2Var : uq1Var.f11442b.f6100b) {
                                            String strM5690i2 = vi0.m5690i("script_section_", qf2Var.f8953a);
                                            final xk1 xk1Var45 = xk1Var39;
                                            final uq1 uq1Var2 = uq1Var;
                                            final xk1 xk1Var46 = xk1Var34;
                                            final xk1 xk1Var47 = xk1Var35;
                                            final Context context6 = context5;
                                            final xk1 xk1Var48 = xk1Var36;
                                            s81.m4760a(s81Var, strM5690i2, new C0402kw(-1744527234, z3, new nn0() { // from class: gk2
                                                @Override // p000.nn0
                                                /* JADX INFO: renamed from: e */
                                                public final Object mo489e(Object obj4, Object obj5, Object obj6) {
                                                    InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj5;
                                                    int iIntValue2 = ((Integer) obj6).intValue();
                                                    ((o71) obj4).getClass();
                                                    go0 go0Var4 = (go0) interfaceC0596px3;
                                                    if (go0Var4.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        final qf2 qf2Var2 = qf2Var;
                                                        String str19 = qf2Var2.f8954b;
                                                        final uq1 uq1Var3 = uq1Var2;
                                                        final xk1 xk1Var49 = xk1Var45;
                                                        final j20 j20Var6 = j20Var4;
                                                        final Context context7 = context6;
                                                        final xk1 xk1Var50 = xk1Var44;
                                                        final xk1 xk1Var51 = xk1Var48;
                                                        final xk1 xk1Var52 = xk1Var46;
                                                        final xk1 xk1Var53 = xk1Var47;
                                                        AbstractC0179eu.m1464n(null, str19, xe1.m6126i0(-407099201, new mn0() { // from class: hk2
                                                            @Override // p000.mn0
                                                            /* JADX INFO: renamed from: g */
                                                            public final Object mo12g(Object obj7, Object obj8) {
                                                                Object next2;
                                                                final xk1 xk1Var54;
                                                                xk1 xk1Var55;
                                                                InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj7;
                                                                int iIntValue3 = ((Integer) obj8).intValue();
                                                                go0 go0Var5 = (go0) interfaceC0596px4;
                                                                if (go0Var5.m1958O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                    for (String str20 : qf2Var2.f8955c) {
                                                                        uq1 uq1Var4 = uq1Var3;
                                                                        lf2 lf2Var = uq1Var4.f11442b;
                                                                        rf2 rf2Var = uq1Var4.f11443c;
                                                                        final kf2 kf2Var2 = (kf2) we1.m5875p0(str20, lf2Var.f6099a);
                                                                        j31 j31Var = (j31) rf2Var.f9545b.get(str20);
                                                                        Iterator it2 = rf2Var.f9546c.iterator();
                                                                        while (true) {
                                                                            if (!it2.hasNext()) {
                                                                                next2 = null;
                                                                                break;
                                                                            }
                                                                            next2 = it2.next();
                                                                            if (t11.m5086l(((gf2) next2).f3489a, str20)) {
                                                                                break;
                                                                            }
                                                                        }
                                                                        gf2 gf2Var = (gf2) next2;
                                                                        String str21 = gf2Var != null ? gf2Var.f3490b : null;
                                                                        final xk1 xk1Var56 = xk1Var49;
                                                                        boolean zM1980f11 = go0Var5.m1980f(xk1Var56);
                                                                        final j20 j20Var7 = j20Var6;
                                                                        boolean zM1984h6 = zM1980f11 | go0Var5.m1984h(j20Var7);
                                                                        final Context context8 = context7;
                                                                        boolean zM1984h7 = zM1984h6 | go0Var5.m1984h(context8) | go0Var5.m1984h(kf2Var2);
                                                                        Object objM1956L18 = go0Var5.m1956L();
                                                                        final xk1 xk1Var57 = xk1Var51;
                                                                        xk1 xk1Var58 = xk1Var52;
                                                                        C0160eb c0160eb5 = C0520nx.f7360a;
                                                                        if (zM1984h7 || objM1956L18 == c0160eb5) {
                                                                            xk1Var54 = xk1Var58;
                                                                            final xk1 xk1Var59 = xk1Var50;
                                                                            in0 in0Var2 = new in0() { // from class: kk2
                                                                                @Override // p000.in0
                                                                                /* JADX INFO: renamed from: j */
                                                                                public final Object mo5j(Object obj9) {
                                                                                    j31 j31Var2 = (j31) obj9;
                                                                                    String str22 = (String) xk1Var56.getValue();
                                                                                    if (str22 != null) {
                                                                                        AbstractC0570p7.m3745A(j20Var7, null, new ok2(str22, kf2Var2, j31Var2, xk1Var59, xk1Var57, xk1Var54, context8, null), 3);
                                                                                    }
                                                                                    return a83.f116a;
                                                                                }
                                                                            };
                                                                            xk1Var55 = xk1Var57;
                                                                            go0Var5.m1981f0(in0Var2);
                                                                            objM1956L18 = in0Var2;
                                                                        } else {
                                                                            xk1Var55 = xk1Var57;
                                                                            xk1Var54 = xk1Var58;
                                                                        }
                                                                        in0 in0Var3 = (in0) objM1956L18;
                                                                        boolean zM1984h8 = go0Var5.m1984h(kf2Var2) | go0Var5.m1984h(uq1Var4) | go0Var5.m1980f(str20);
                                                                        Object objM1956L19 = go0Var5.m1956L();
                                                                        if (zM1984h8 || objM1956L19 == c0160eb5) {
                                                                            C0459mf c0459mf = new C0459mf(kf2Var2, uq1Var4, str20, xk1Var54, xk1Var53, xk1Var55);
                                                                            kf2Var2 = kf2Var2;
                                                                            go0Var5.m1981f0(c0459mf);
                                                                            objM1956L19 = c0459mf;
                                                                        }
                                                                        rg3.m4470f(kf2Var2, j31Var, str21, in0Var3, (xm0) objM1956L19, go0Var5, 0);
                                                                    }
                                                                } else {
                                                                    go0Var5.m1961R();
                                                                }
                                                                return a83.f116a;
                                                            }
                                                        }, go0Var4), go0Var4, 384, 1);
                                                    } else {
                                                        go0Var4.m1961R();
                                                    }
                                                    return a83.f116a;
                                                }
                                            }), i8);
                                            uq1Var = uq1Var2;
                                            xk1Var39 = xk1Var45;
                                            context5 = context6;
                                        }
                                    }
                                    String str19 = (String) xk1Var36.getValue();
                                    if (str19 != null) {
                                        s81.m4760a(s81Var, "script_error", new C0402kw(391755064, z3, new C0868x1(str19, 4)), i8);
                                    }
                                    return a83.f116a;
                                }
                            };
                            go0Var3.m1981f0(objM1956L17);
                        }
                        rg3.m4468d(24960, 490, null, c0884xf, null, go0Var3, null, (in0) objM1956L17, null, uh1VarMo4491c, jw1VarM1635h, false);
                        go0Var3.m1994p(true);
                    } else {
                        go0Var3.m1961R();
                    }
                    return a83.f116a;
                }
            };
            j20 j20Var3 = j20Var2;
            Context context4 = context3;
            go0 go0Var3 = go0Var2;
            ci0.m815p(xe1.m6126i0(-705894698, mn0Var2, go0Var3), go0Var3, 6);
            kf2 kf2Var2 = (kf2) xk1Var17.getValue();
            if (kf2Var2 == null) {
                go0Var3.m1966W(1505943004);
                go0Var3.m1994p(false);
                xk1Var8 = xk1Var19;
                z = false;
                xk1Var7 = xk1Var24;
                c0160eb2 = c0160eb4;
                xk1Var9 = xk1Var20;
            } else {
                go0Var3.m1966W(1505943005);
                String str3 = (String) xk1Var18.getValue();
                String str4 = (String) xk1Var24.getValue();
                Object objM1956L17 = go0Var3.m1956L();
                if (objM1956L17 == c0160eb4) {
                    objM1956L17 = new C0590pr(xk1Var18, 21);
                    go0Var3.m1981f0(objM1956L17);
                }
                in0 in0Var2 = (in0) objM1956L17;
                Object objM1956L18 = go0Var3.m1956L();
                if (objM1956L18 == c0160eb4) {
                    xk1Var6 = xk1Var19;
                    objM1956L18 = new rt0(xk1Var17, xk1Var24, 2);
                    go0Var3.m1981f0(objM1956L18);
                } else {
                    xk1Var6 = xk1Var19;
                }
                xm0 xm0Var = (xm0) objM1956L18;
                boolean zM1984h4 = go0Var3.m1984h(kf2Var2) | go0Var3.m1984h(context4) | go0Var3.m1980f(xk1Var13) | go0Var3.m1984h(j20Var3);
                Object objM1956L19 = go0Var3.m1956L();
                if (zM1984h4 || objM1956L19 == c0160eb4) {
                    c0160eb = c0160eb4;
                    c0810vh = new C0810vh(kf2Var2, context4, xk1Var18, j20Var3, xk1Var13, xk1Var23, xk1Var24, xk1Var17);
                    kf2Var = kf2Var2;
                    context4 = context4;
                    j20Var3 = j20Var3;
                    xk1Var7 = xk1Var24;
                    go0Var3.m1981f0(c0810vh);
                } else {
                    c0810vh = objM1956L19;
                    kf2Var = kf2Var2;
                    c0160eb = c0160eb4;
                    xk1Var7 = xk1Var24;
                }
                xk1Var8 = xk1Var6;
                xk1Var9 = xk1Var20;
                c0160eb2 = c0160eb;
                z = false;
                m4469e(kf2Var, str3, str4, in0Var2, xm0Var, (xm0) c0810vh, go0Var3, 27648);
                go0Var3.m1994p(false);
            }
            vy1 vy1Var = (vy1) xk1Var8.getValue();
            if (vy1Var == null) {
                go0Var3.m1966W(1506769030);
                go0Var3.m1994p(z);
                z2 = z;
                context = context4;
                c0160eb3 = c0160eb2;
                xk1Var11 = xk1Var25;
                j20Var = j20Var3;
            } else {
                go0Var3.m1966W(1506769031);
                Object objM1956L20 = go0Var3.m1956L();
                if (objM1956L20 == c0160eb2) {
                    xk1Var10 = xk1Var25;
                    objM1956L20 = new rt0(xk1Var10, xk1Var8, 3);
                    go0Var3.m1981f0(objM1956L20);
                } else {
                    xk1Var10 = xk1Var25;
                }
                String strM4462P7 = m4462P(R.string.script_settings_authorize_title, go0Var3);
                xk1 xk1Var27 = xk1Var10;
                boolean z3 = z;
                C0160eb c0160eb5 = c0160eb2;
                j20 j20Var4 = j20Var3;
                C0407l0 c0407l0 = new C0407l0(vy1Var, j20Var4, context4, xk1Var27, xk1Var8, xk1Var7, 1);
                xk1Var11 = xk1Var27;
                j20Var = j20Var4;
                xk1Var9 = xk1Var9;
                context = context4;
                z2 = z3;
                c0160eb3 = c0160eb5;
                qp0.m4249d(true, (xm0) objM1956L20, null, strM4462P7, null, xe1.m6126i0(1470670831, c0407l0, go0Var3), xe1.m6126i0(-273080040, new wt0(7, vy1Var), go0Var3), go0Var3, 1769526, 20);
                go0Var3 = go0Var3;
                go0Var3.m1994p(z2);
            }
            cq1 cq1Var = (cq1) xk1Var9.getValue();
            if (cq1Var == null) {
                go0Var3.m1966W(1509859854);
                go0Var3.m1994p(z2);
                go0Var = go0Var3;
                i2 = 1;
            } else {
                go0Var3.m1966W(1509859855);
                Object objM1956L21 = go0Var3.m1956L();
                if (objM1956L21 == c0160eb3) {
                    i3 = 1;
                    objM1956L21 = new rt0(xk1Var11, xk1Var9, i3);
                    go0Var3.m1981f0(objM1956L21);
                } else {
                    i3 = 1;
                }
                go0Var = go0Var3;
                i2 = i3;
                qp0.m4249d(true, (xm0) objM1956L21, null, m4462P(R.string.script_settings_revoke_title, go0Var3), null, xe1.m6126i0(1325625704, new C0407l0(j20Var, cq1Var, context, xk1Var11, xk1Var9, xk1Var7, 2), go0Var3), xe1.m6126i0(1055925137, new fk2(cq1Var, i3), go0Var3), go0Var, 1769526, 20);
                go0Var.m1994p(z2);
            }
        } else {
            go0Var = go0Var2;
            i2 = 1;
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0831w1(i, i2, in0Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m4472h(uh1 uh1Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1854833411);
        int i2 = (go0Var.m1980f(uh1Var) ? 4 : 2) | i;
        int i3 = 18;
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            Object objM1956L = go0Var.m1956L();
            if (objM1956L == C0520nx.f7360a) {
                objM1956L = C0378k8.f5385g;
                go0Var.m1981f0(objM1956L);
            }
            nf1 nf1Var = (nf1) objM1956L;
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1Var);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, nf1Var);
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
            b62VarM1996r.f616d = new C0016af(i, i3, uh1Var, c0402kw);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m4473i(p000.yw2 r6, p000.AbstractC0658rj r7) {
        /*
            boolean r0 = r7 instanceof p000.la2
            if (r0 == 0) goto L13
            r0 = r7
            la2 r0 = (p000.la2) r0
            int r1 = r0.f6013m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6013m = r1
            goto L18
        L13:
            la2 r0 = new la2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6012l
            int r1 = r0.f6013m
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            yw2 r6 = r0.f6011k
            p000.fg1.m1627T(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C0676s.m4653l(r6)
            r6 = 0
            return r6
        L2e:
            p000.fg1.m1627T(r7)
        L31:
            r0.f6011k = r6
            r0.f6013m = r2
            i12 r7 = p000.i12.f4217i
            java.lang.Object r7 = r6.m6363a(r7, r0)
            k20 r1 = p000.k20.f5323h
            if (r7 != r1) goto L40
            return r1
        L40:
            h12 r7 = (p000.h12) r7
            int r1 = r7.f3779d
            java.util.List r7 = r7.f3776a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            o12 r5 = (p000.o12) r5
            boolean r5 = p000.tp0.m5366n(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rg3.m4473i(yw2, rj):java.lang.Object");
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m4474j(qn2 qn2Var) {
        ln2 ln2VarM4209k = qn2Var.m4209k();
        return !ln2VarM4209k.f6221h.m4501c(vn2.f12067j);
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m4475k(qn2 qn2Var, Resources resources) {
        Object objM4505g = qn2Var.f9050d.f6221h.m4505g(vn2.f12058a);
        if (objM4505g == null) {
            objM4505g = null;
        }
        List list = (List) objM4505g;
        return !xe1.m6094L(qn2Var) && (qn2Var.f9050d.f6223j || (qn2Var.m4215q() && ((list != null ? (String) AbstractC0142du.m1161q0(list) : null) != null || m4448B(qn2Var) != null || m4447A(qn2Var, resources) != null || m4490z(qn2Var))));
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m4476l(String str, String str2) {
        return !str.equals(str2) && wv2.m6005W(str, ".".concat(str2), false);
    }

    /* JADX INFO: renamed from: m */
    public static final void m4477m(ve0 ve0Var) {
        ve0Var.getClass();
        if ((ve0Var instanceof dv2 ? (dv2) ve0Var : null) != null) {
            return;
        }
        C0676s.m4655n("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ", d72.m967a(ve0Var.getClass()));
    }

    /* JADX INFO: renamed from: n */
    public static int m4478n(double d) {
        double d2 = (d + 16.0d) / 116.0d;
        double d3 = d > 8.0d ? d2 * d2 * d2 : d / 903.2962962962963d;
        double d4 = d2 * d2 * d2;
        boolean z = d4 > 0.008856451679035631d;
        double d5 = z ? d4 : d / 903.2962962962963d;
        if (!z) {
            d4 = d / 903.2962962962963d;
        }
        float[] fArr = f9561c;
        double d6 = d5 * ((double) fArr[0]);
        double d7 = d3 * ((double) fArr[1]);
        double d8 = d4 * ((double) fArr[2]);
        double[][] dArr = f9563e;
        double[] dArr2 = dArr[0];
        double d9 = (dArr2[2] * d8) + (dArr2[1] * d7) + (dArr2[0] * d6);
        double[] dArr3 = dArr[1];
        double d10 = (dArr3[2] * d8) + (dArr3[1] * d7) + (dArr3[0] * d6);
        double[] dArr4 = dArr[2];
        return ((m4485u(d9) & 255) << 16) | (-16777216) | ((m4485u(d10) & 255) << 8) | (m4485u((dArr4[2] * d8) + (dArr4[1] * d7) + (dArr4[0] * d6)) & 255);
    }

    /* JADX INFO: renamed from: o */
    public static final cv2 m4479o(y40 y40Var) {
        y40Var.getClass();
        cv2 cv2Var = y40Var instanceof cv2 ? (cv2) y40Var : null;
        if (cv2Var != null) {
            return cv2Var;
        }
        C0676s.m4655n("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ", d72.m967a(y40Var.getClass()));
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static final int m4480p(int[] iArr, int i, int i2) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: q */
    public static final int m4481q(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: r */
    public static final Object m4482r(t60 t60Var, xm0 xm0Var, u00 u00Var) {
        Object obj;
        zn1 zn1VarM4931b0;
        Object objMo2513f0;
        vn1 vn1Var;
        if (((th1) t60Var).f10757h.f10770u) {
            th1 th1Var = (th1) t60Var;
            if (!th1Var.f10757h.f10770u) {
                kz0.m2764b("visitAncestors called on an unattached node");
            }
            th1 th1Var2 = th1Var.f10757h.f10761l;
            r61 r61VarM4933c0 = sp0.m4933c0(t60Var);
            loop0: while (true) {
                obj = null;
                if (r61VarM4933c0 == null) {
                    break;
                }
                if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 524288) != 0) {
                    while (th1Var2 != null) {
                        if ((th1Var2.f10759j & 524288) != 0) {
                            th1 th1VarM4952m = th1Var2;
                            zk1 zk1Var = null;
                            while (th1VarM4952m != null) {
                                if (th1VarM4952m instanceof InterfaceC0355jm) {
                                    obj = th1VarM4952m;
                                    break loop0;
                                }
                                if ((th1VarM4952m.f10759j & 524288) != 0 && (th1VarM4952m instanceof u60)) {
                                    int i = 0;
                                    for (th1 th1Var3 = ((u60) th1VarM4952m).f11116w; th1Var3 != null; th1Var3 = th1Var3.f10762m) {
                                        if ((th1Var3.f10759j & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                th1VarM4952m = th1Var3;
                                            } else {
                                                if (zk1Var == null) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (th1VarM4952m != null) {
                                                    zk1Var.m6423b(th1VarM4952m);
                                                    th1VarM4952m = null;
                                                }
                                                zk1Var.m6423b(th1Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                th1VarM4952m = sp0.m4952m(zk1Var);
                            }
                        }
                        th1Var2 = th1Var2.f10761l;
                    }
                }
                r61VarM4933c0 = r61VarM4933c0.m4389u();
                th1Var2 = (r61VarM4933c0 == null || (vn1Var = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
            }
            InterfaceC0355jm interfaceC0355jm = (InterfaceC0355jm) obj;
            if (interfaceC0355jm != null && (objMo2513f0 = interfaceC0355jm.mo2513f0((zn1VarM4931b0 = sp0.m4931b0(t60Var)), new C0723t6(2, xm0Var, zn1VarM4931b0), u00Var)) == k20.f5323h) {
                return objMo2513f0;
            }
        }
        return a83.f116a;
    }

    /* JADX INFO: renamed from: s */
    public static void m4483s(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: t */
    public static final xk1 m4484t(bk1 bk1Var, InterfaceC0596px interfaceC0596px) {
        go0 go0Var = (go0) interfaceC0596px;
        Object objM1956L = go0Var.m1956L();
        C0160eb c0160eb = C0520nx.f7360a;
        if (objM1956L == c0160eb) {
            objM1956L = op0.m3598u(Boolean.FALSE);
            go0Var.m1981f0(objM1956L);
        }
        xk1 xk1Var = (xk1) objM1956L;
        Object objM1956L2 = go0Var.m1956L();
        if (objM1956L2 == c0160eb) {
            objM1956L2 = new C0003a2(bk1Var, xk1Var, null, 21);
            go0Var.m1981f0(objM1956L2);
        }
        AbstractC0179eu.m1456f(go0Var, (mn0) objM1956L2, bk1Var);
        return xk1Var;
    }

    /* JADX INFO: renamed from: u */
    public static int m4485u(double d) {
        double d2 = d / 100.0d;
        int iRound = (int) Math.round((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (iRound < 0) {
            return 0;
        }
        if (iRound > 255) {
            return 255;
        }
        return iRound;
    }

    /* JADX INFO: renamed from: v */
    public static final float m4486v(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    /* JADX INFO: renamed from: w */
    public static final a20 m4487w(a20 a20Var, a20 a20Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 27;
        boolean zBooleanValue = ((Boolean) a20Var.mo16r(new C0920ye(i), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) a20Var2.mo16r(new C0920ye(i), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return a20Var.mo14k(a20Var2);
        }
        C0920ye c0920ye = new C0920ye(25);
        zd0 zd0Var = zd0.f13837h;
        a20 a20Var3 = (a20) a20Var.mo16r(c0920ye, zd0Var);
        Object objMo16r = a20Var2;
        if (zBooleanValue2) {
            objMo16r = a20Var2.mo16r(new C0920ye(26), zd0Var);
        }
        return a20Var3.mo14k((a20) objMo16r);
    }

    /* JADX INFO: renamed from: x */
    public static final m13 m4488x(go0 go0Var) {
        return new m13(((lp1) go0Var.m1988j(ur1.f11452a)).f6238f, m4450D(12), null, 0L, 0, m4450D(17), null, null, 16646140);
    }

    /* JADX INFO: renamed from: y */
    public static final sx0 m4489y() {
        sx0 sx0Var = f9581w;
        if (sx0Var != null) {
            return sx0Var;
        }
        rx0 rx0Var = new rx0("Filled.Download", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = s93.f9998a;
        ft2 ft2Var = new ft2(C0363ju.f5212b);
        ye0 ye0Var = new ye0(3);
        ye0Var.m6259k(5.0f, 20.0f);
        ye0Var.m6256h(14.0f);
        ye0Var.m6263o(-2.0f);
        ay1 ay1Var = new ay1(5.0f);
        ArrayList arrayList = ye0Var.f13428a;
        arrayList.add(ay1Var);
        arrayList.add(new py1(20.0f));
        ye0Var.m6251c();
        ye0Var.m6259k(19.0f, 9.0f);
        ye0Var.m6256h(-4.0f);
        arrayList.add(new py1(3.0f));
        arrayList.add(new ay1(9.0f));
        ye0Var.m6263o(6.0f);
        arrayList.add(new ay1(5.0f));
        ye0Var.m6258j(7.0f, 7.0f);
        ye0Var.m6257i(19.0f, 9.0f);
        ye0Var.m6251c();
        rx0.m4624a(rx0Var, arrayList, ft2Var);
        sx0 sx0VarM4625b = rx0Var.m4625b();
        f9581w = sx0VarM4625b;
        return sx0VarM4625b;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m4490z(qn2 qn2Var) {
        Object objM4505g = qn2Var.f9050d.f6221h.m4505g(vn2.f12051K);
        if (objM4505g == null) {
            objM4505g = null;
        }
        u23 u23Var = (u23) objM4505g;
        rk1 rk1Var = qn2Var.f9050d.f6221h;
        Object objM4505g2 = rk1Var.m4505g(vn2.f12083z);
        if (objM4505g2 == null) {
            objM4505g2 = null;
        }
        boolean z = u23Var != null;
        Object objM4505g3 = rk1Var.m4505g(vn2.f12050J);
        if (((Boolean) (objM4505g3 != null ? objM4505g3 : null)) != null) {
            return true;
        }
        return z;
    }
}
