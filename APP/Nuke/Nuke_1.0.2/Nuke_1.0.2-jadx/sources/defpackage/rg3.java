package defpackage;

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
    public static final i51 m;
    public static final n43 v;
    public static sx0 w;
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final double[][] d = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[][] e = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final int[] f = new int[0];
    public static final long[] g = new long[0];
    public static final Object[] h = new Object[0];
    public static vj[] i = new vj[0];
    public static gw[] j = new gw[0];
    public static final qa k = new qa(4);
    public static final StackTraceElement[] l = new StackTraceElement[0];
    public static final n43 n = new n43(new kx2(10), new kx2(27));
    public static final n43 o = new n43(new kx2(11), new kx2(12));
    public static final n43 p = new n43(new kx2(13), new kx2(14));
    public static final n43 q = new n43(new kx2(15), new kx2(16));
    public static final n43 r = new n43(new kx2(17), new kx2(18));
    public static final n43 s = new n43(new kx2(19), new kx2(20));
    public static final n43 t = new n43(new kx2(21), new kx2(22));
    public static final n43 u = new n43(new kx2(23), new kx2(24));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i2 = 26;
        m = new i51(i2);
        v = new n43(new kx2(25), new kx2(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String A(qn2 qn2Var, Resources resources) {
        int iOrdinal;
        ln2 ln2Var = qn2Var.d;
        ln2 ln2Var2 = qn2Var.d;
        Object objG = ln2Var.h.g(vn2.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        rk1 rk1Var = ln2Var2.h;
        Object objG2 = rk1Var.g(vn2.K);
        if (objG2 == null) {
            objG2 = null;
        }
        u23 u23Var = (u23) objG2;
        Object objG3 = rk1Var.g(vn2.z);
        if (objG3 == null) {
            objG3 = null;
        }
        if (u23Var != null && (iOrdinal = u23Var.ordinal()) != 0 && iOrdinal != 1) {
            if (iOrdinal != 2) {
                c80.s();
                return null;
            }
            if (objG == null) {
                objG = resources.getString(R.string.indeterminate);
            }
        }
        Object objG4 = rk1Var.g(vn2.J);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (objG == null) {
                objG = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objG5 = rk1Var.g(vn2.c);
        if (objG5 == null) {
            objG5 = null;
        }
        s32 s32Var = (s32) objG5;
        if (s32Var != null) {
            if (s32Var != s32.c) {
                if (objG == null) {
                    float f2 = s32Var.b.a;
                    float f3 = f2 - 0.0f == 0.0f ? 0.0f : (s32Var.a - 0.0f) / (f2 - 0.0f);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    objG = resources.getString(R.string.template_percent, Integer.valueOf(f3 == 0.0f ? 0 : f3 == 1.0f ? 100 : ci0.D(Math.round(f3 * 100.0f), 1, 99)));
                }
            } else if (objG == null) {
                objG = resources.getString(R.string.in_progress);
            }
        }
        yn2 yn2Var = vn2.G;
        if (rk1Var.c(yn2Var)) {
            rk1 rk1Var2 = new qn2(qn2Var.a, true, qn2Var.c, ln2Var2).k().h;
            Object objG6 = rk1Var2.g(vn2.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = rk1Var2.g(vn2.C);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = rk1Var2.g(yn2Var);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final sd B(qn2 qn2Var) {
        Object objG = qn2Var.d.h.g(vn2.G);
        if (objG == null) {
            objG = null;
        }
        sd sdVar = (sd) objG;
        Object objG2 = qn2Var.d.h.g(vn2.C);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return sdVar == null ? list != null ? (sd) du.q0(list) : null : sdVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long C(double d2) {
        return I((float) d2, 4294967296L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long D(int i2) {
        return I(i2, 4294967296L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int E(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return xu.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void F(go0 go0Var, mn0 mn0Var) {
        mn0Var.getClass();
        xe1.f(2, mn0Var);
        mn0Var.g(go0Var, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float G(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final a20 H(j20 j20Var, a20 a20Var) {
        a20 a20VarW = w(j20Var.g(), a20Var, true);
        c60 c60Var = o90.a;
        return (a20VarW == c60Var || a20VarW.o(gd3.p) != null) ? a20VarW : a20VarW.k(c60Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long I(float f2, long j2) {
        long jFloatToRawIntBits = j2 | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        q13[] q13VarArr = p13.b;
        return jFloatToRawIntBits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final j31 J(kf2 kf2Var, String str, Context context) {
        uf2 uf2Var = kf2Var.b;
        if (pv2.s0(str) && uf2Var != uf2.m) {
            return null;
        }
        int iOrdinal = uf2Var.ordinal();
        if (iOrdinal == 0) {
            s.j(context.getString(R.string.script_settings_boolean_editor_unsupported));
            return null;
        }
        int i2 = 1;
        if (iOrdinal == 1) {
            Long lF0 = wv2.f0(pv2.I0(str).toString());
            if (lF0 != null) {
                return l31.b(lF0);
            }
            s.j(context.getString(R.string.script_settings_invalid_integer));
            return null;
        }
        if (iOrdinal != 2) {
            int i3 = 3;
            if (iOrdinal == 3) {
                return l31.c(str);
            }
            if (iOrdinal == 4) {
                return new z21(wo2.T(new bj0(new bj0(new bj0(new ng(i3, str), pk2.o, 1), qk2.o, 0), new d62(i2, kf2Var, context), 1)));
            }
            c80.s();
            return null;
        }
        Double dV = vv2.V(pv2.I0(str).toString());
        if (dV != null) {
            if (Math.abs(dV.doubleValue()) > Double.MAX_VALUE) {
                dV = null;
            }
            if (dV != null) {
                return l31.b(dV);
            }
        }
        s.j(context.getString(R.string.script_settings_invalid_number));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int K(String str, int i2) {
        char cCharAt = str.charAt(i2);
        return (cCharAt << 7) + str.charAt(i2 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final eo0 L(px pxVar) {
        go0 go0Var = (go0) pxVar;
        go0Var.U(206, tx.e);
        if (go0Var.S) {
            tr2.z(go0Var.I);
        }
        Object objD = go0Var.D();
        lo0 ba2Var = objD instanceof lo0 ? (lo0) objD : null;
        if (ba2Var == null) {
            ba2Var = new ba2(new do0(new eo0(go0Var, go0Var.T, go0Var.q, go0Var.C, go0Var.h.A)), -1);
            go0Var.g0(ba2Var);
        }
        a82 a82Var = ba2Var.a;
        a82Var.getClass();
        eo0 eo0Var = ((do0) a82Var).h;
        eo0Var.f.setValue(go0Var.l());
        go0Var.p(false);
        return eo0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void M(kv1 kv1Var, int i2, Object obj) {
        kv1Var.q[(kv1Var.r - kv1Var.m[kv1Var.n - 1].b) + i2] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void N(kv1 kv1Var, int i2, Object obj, int i3, Object obj2) {
        int i4 = kv1Var.r - kv1Var.m[kv1Var.n - 1].b;
        Object[] objArr = kv1Var.q;
        objArr[i2 + i4] = obj;
        objArr[i4 + i3] = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String[] O(int i2, px pxVar) {
        return ((Resources) ((go0) pxVar).j(r7.c)).getStringArray(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String P(int i2, px pxVar) {
        return ((Resources) ((go0) pxVar).j(r7.c)).getString(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String Q(int i2, Object[] objArr, px pxVar) {
        return ((Resources) ((go0) pxVar).j(r7.c)).getString(i2, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final v73 R(t00 t00Var, a20 a20Var, Object obj) {
        v73 v73Var = null;
        if ((t00Var instanceof l20) && a20Var.o(pp.j) != null) {
            l20 l20VarD = (l20) t00Var;
            while (true) {
                if ((l20VarD instanceof l90) || (l20VarD = l20VarD.d()) == null) {
                    break;
                }
                if (l20VarD instanceof v73) {
                    v73Var = (v73) l20VarD;
                    break;
                }
            }
            if (v73Var != null) {
                v73Var.m0(a20Var, obj);
            }
        }
        return v73Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(de deVar, xm0 xm0Var, in0 in0Var, px pxVar, int i2) {
        int i3;
        in0 in0Var2;
        Object x92Var;
        go0 go0Var = (go0) pxVar;
        go0Var.X(519367357);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.f(deVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(xm0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            in0Var2 = in0Var;
            i3 |= go0Var.h(in0Var2) ? 256 : 128;
        } else {
            in0Var2 = in0Var;
        }
        int i4 = i3;
        int i5 = 0;
        if (go0Var.O(i4 & 1, (i4 & 147) != 146)) {
            int i6 = i4 & 14;
            boolean z = i6 == 4;
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (z || objL == ebVar) {
                objL = op0.u(deVar.a);
                go0Var.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            boolean z2 = i6 == 4;
            Object objL2 = go0Var.L();
            if (z2 || objL2 == ebVar) {
                objL2 = op0.u(deVar.b);
                go0Var.f0(objL2);
            }
            xk1 xk1Var2 = (xk1) objL2;
            boolean zF = go0Var.f((String) xk1Var2.getValue());
            Object objL3 = go0Var.L();
            if (zF || objL3 == ebVar) {
                if (!pv2.s0((String) xk1Var2.getValue())) {
                    try {
                        x92Var = new SimpleDateFormat((String) xk1Var2.getValue(), Locale.getDefault());
                    } catch (Throwable th) {
                        x92Var = new x92(th);
                    }
                    boolean z3 = !(x92Var instanceof x92);
                    objL3 = Boolean.valueOf(z3);
                    go0Var.f0(objL3);
                }
            }
            boolean zBooleanValue = ((Boolean) objL3).booleanValue();
            qp0.d(true, xm0Var, null, P(R.string.anti_revoke_config_title, go0Var), null, xe1.i0(-1900508390, new fe(xm0Var, in0Var2, xk1Var, xk1Var2, !pv2.s0((String) xk1Var.getValue()) && zBooleanValue, 0), go0Var), xe1.i0(1972530961, new ge(i5, xk1Var, xk1Var2, zBooleanValue), go0Var), go0Var, (i4 & 112) | 1769478, 20);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new va(deVar, xm0Var, in0Var, i2, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(String str, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(1688595585);
        int i3 = (go0Var.f(str) ? 4 : 2) | i2;
        if (go0Var.O(i3 & 1, (i3 & 3) != 2)) {
            eu.a(str, fg1.G(rh1.a, 0.0f, 0.0f, 0.0f, 8.0f, 7), new m13(((lp1) go0Var.j(ur1.a)).f, D(13), im0.k, 0L, 0, D(18), null, null, 16646136), 0, false, 0, 0, go0Var, (i3 & 14) | 48, 1016);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new n0(str, i2, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(String str, final xm0 xm0Var, final in0 in0Var, px pxVar, int i2) {
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(482573122);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(xm0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var.h(in0Var) ? 256 : 128;
        }
        final boolean z = false;
        int i4 = 1;
        if (go0Var.O(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (i3 & 14) == 4;
            Object objL = go0Var.L();
            if (z2 || objL == nx.a) {
                objL = op0.u(str);
                go0Var.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            final Long lF0 = wv2.f0(pv2.I0((String) xk1Var.getValue()).toString());
            if (lF0 != null && lF0.longValue() > 0) {
                z = true;
            }
            qp0.d(true, xm0Var, null, P(R.string.chat_avatar_rotator_config_title, go0Var), null, xe1.i0(402976453, new nn0() { // from class: ds
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.nn0
                public final Object e(Object obj, Object obj2, Object obj3) {
                    pb2 pb2Var = (pb2) obj;
                    px pxVar2 = (px) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    pb2Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((go0) pxVar2).f(pb2Var) ? 4 : 2;
                    }
                    go0 go0Var2 = (go0) pxVar2;
                    if (go0Var2.O(iIntValue & 1, (iIntValue & 19) != 18)) {
                        se.r(rg3.P(R.string.home_settings_cancel, go0Var2), xm0Var, pb2.a(pb2Var), false, 0, go0Var2, 0, 56);
                        String strP = rg3.P(R.string.home_settings_save, go0Var2);
                        uh1 uh1VarA = pb2.a(pb2Var);
                        Long l2 = lF0;
                        boolean zF = go0Var2.f(l2);
                        in0 in0Var2 = in0Var;
                        boolean zF2 = zF | go0Var2.f(in0Var2);
                        Object objL2 = go0Var2.L();
                        if (zF2 || objL2 == nx.a) {
                            objL2 = new r1(11, l2, in0Var2);
                            go0Var2.f0(objL2);
                        }
                        se.q(strP, (xm0) objL2, uh1VarA, z, 0, go0Var2, 0, 48);
                    } else {
                        go0Var2.R();
                    }
                    return a83.a;
                }
            }, go0Var), xe1.i0(-1852458386, new cb(i4, xk1Var, z), go0Var), go0Var, (i3 & 112) | 1769478, 20);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new es(str, xm0Var, in0Var, i2, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(int i2, int i3, s8 s8Var, yf yfVar, pk pkVar, px pxVar, n50 n50Var, in0 in0Var, d91 d91Var, uh1 uh1Var, jw1 jw1Var, boolean z) {
        uh1 uh1Var2;
        int i4;
        jw1 jw1Var2;
        yf yfVar2;
        int i5;
        go0 go0Var;
        s8 s8Var2;
        n50 n50Var2;
        boolean z2;
        jw1 jw1Var3;
        yf yfVar3;
        pk pkVar2;
        d91 d91Var2;
        b62 b62VarR;
        yf yfVar4;
        Object s8Var3;
        s8 s8Var4;
        pk pkVar3;
        yf yfVar5;
        n50 n50Var3;
        d91 d91Var3;
        s8 s8Var5;
        int i6;
        boolean z3;
        go0 go0Var2 = (go0) pxVar;
        go0Var2.X(53695811);
        if ((i2 & 6) == 0) {
            uh1Var2 = uh1Var;
            i4 = (go0Var2.f(uh1Var2) ? 4 : 2) | i2;
        } else {
            uh1Var2 = uh1Var;
            i4 = i2;
        }
        int i7 = i4 | 16;
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & 384) == 0) {
                jw1Var2 = jw1Var;
                i7 |= go0Var2.f(jw1Var2) ? 256 : 128;
            }
            int i9 = i7 | 3072;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    yfVar2 = yfVar;
                    int i10 = go0Var2.f(yfVar2) ? 16384 : 8192;
                    i9 |= i10;
                } else {
                    yfVar2 = yfVar;
                }
                i9 |= i10;
            } else {
                yfVar2 = yfVar;
            }
            i5 = i9 | 46858240 | (!go0Var2.h(in0Var) ? 536870912 : 268435456);
            if (go0Var2.O(i5 & 1, (306783379 & i5) == 306783378)) {
                go0Var = go0Var2;
                go0Var.R();
                s8Var2 = s8Var;
                n50Var2 = n50Var;
                z2 = z;
                jw1Var3 = jw1Var2;
                yfVar3 = yfVar2;
                pkVar2 = pkVar;
                d91Var2 = d91Var;
            } else {
                go0Var2.T();
                if ((i2 & 1) == 0 || go0Var2.y()) {
                    x81 x81Var = f91.a;
                    Object[] objArr = new Object[0];
                    dq1 dq1Var = d91.x;
                    boolean zD = go0Var2.d(0) | go0Var2.d(0);
                    Object objL = go0Var2.L();
                    eb ebVar = nx.a;
                    if (zD || objL == ebVar) {
                        objL = new n31(3);
                        go0Var2.f0(objL);
                    }
                    d91 d91Var4 = (d91) gf1.O(objArr, dq1Var, (xm0) objL, go0Var2, 0);
                    int i11 = i5 & (-113);
                    if (i8 != 0) {
                        jw1Var2 = new jw1(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i3 & 16) != 0) {
                        yfVar4 = tp0.c;
                        i11 = i5 & (-57457);
                    } else {
                        yfVar4 = yfVar2;
                    }
                    pk pkVar4 = sn.u;
                    float f2 = ot2.a;
                    e70 e70Var = (e70) go0Var2.j(ly.h);
                    boolean zC = go0Var2.c(e70Var.b());
                    Object objL2 = go0Var2.L();
                    if (zC || objL2 == ebVar) {
                        objL2 = new r40(new hh1(e70Var));
                        go0Var2.f0(objL2);
                    }
                    r40 r40Var = (r40) objL2;
                    boolean zF = go0Var2.f(r40Var);
                    Object objL3 = go0Var2.L();
                    if (zF || objL3 == ebVar) {
                        objL3 = new n50(r40Var);
                        go0Var2.f0(objL3);
                    }
                    n50 n50Var4 = (n50) objL3;
                    my myVar = xv1.a;
                    go0Var2.W(282942128);
                    t8 t8Var = (t8) go0Var2.j(xv1.a);
                    if (t8Var == null) {
                        go0Var2.p(false);
                        s8Var4 = null;
                    } else {
                        boolean zF2 = go0Var2.f(t8Var);
                        Object objL4 = go0Var2.L();
                        if (zF2 || objL4 == ebVar) {
                            s8Var3 = new s8(t8Var.a, t8Var.b, t8Var.c, t8Var.d);
                            go0Var2.f0(s8Var3);
                        } else {
                            s8Var3 = objL4;
                        }
                        s8Var4 = (s8) s8Var3;
                        go0Var2.p(false);
                    }
                    int i12 = i11 & (-238551041);
                    pkVar3 = pkVar4;
                    yfVar5 = yfVar4;
                    n50Var3 = n50Var4;
                    d91Var3 = d91Var4;
                    s8Var5 = s8Var4;
                    i6 = i12;
                    z3 = true;
                } else {
                    go0Var2.R();
                    int i13 = i5 & (-113);
                    if ((i3 & 16) != 0) {
                        i13 = i5 & (-57457);
                    }
                    i6 = i13 & (-238551041);
                    s8Var5 = s8Var;
                    pkVar3 = pkVar;
                    n50Var3 = n50Var;
                    d91Var3 = d91Var;
                    z3 = z;
                    yfVar5 = yfVar2;
                }
                jw1 jw1Var4 = jw1Var2;
                go0Var2.q();
                go0Var = go0Var2;
                ci0.d((i6 & 14) | 24576 | (i6 & 896) | 806882304, ((i6 >> 12) & 14) | ((i6 >> 18) & 7168), s8Var5, yfVar5, pkVar3, go0Var, n50Var3, in0Var, d91Var3, uh1Var2, jw1Var4, z3);
                s8Var2 = s8Var5;
                yfVar3 = yfVar5;
                pkVar2 = pkVar3;
                n50Var2 = n50Var3;
                d91Var2 = d91Var3;
                jw1Var3 = jw1Var4;
                z2 = z3;
            }
            b62VarR = go0Var.r();
            if (b62VarR == null) {
                b62VarR.d = new k71(uh1Var, d91Var2, jw1Var3, yfVar3, pkVar2, n50Var2, z2, s8Var2, in0Var, i2, i3);
                return;
            }
            return;
        }
        i7 = i4 | 400;
        jw1Var2 = jw1Var;
        int i92 = i7 | 3072;
        if ((i2 & 24576) != 0) {
        }
        i5 = i92 | 46858240 | (!go0Var2.h(in0Var) ? 536870912 : 268435456);
        if (go0Var2.O(i5 & 1, (306783379 & i5) == 306783378)) {
        }
        b62VarR = go0Var.r();
        if (b62VarR == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(final kf2 kf2Var, final String str, final String str2, final in0 in0Var, xm0 xm0Var, xm0 xm0Var2, px pxVar, int i2) {
        vf2 vf2Var = kf2Var.s;
        go0 go0Var = (go0) pxVar;
        go0Var.X(429717644);
        int i3 = i2 | (go0Var.h(kf2Var) ? 4 : 2) | (go0Var.f(str) ? 32 : 16) | (go0Var.f(str2) ? 256 : 128) | (go0Var.h(xm0Var2) ? 131072 : 65536);
        int i4 = 1;
        if (go0Var.O(i3 & 1, (74899 & i3) != 74898)) {
            String str3 = kf2Var.n;
            wf2 wf2Var = vf2Var.a;
            final boolean z = wf2Var == wf2.n || wf2Var == wf2.q;
            uf2 uf2Var = kf2Var.b;
            if (uf2Var == uf2.k || uf2Var == uf2.l) {
                i4 = 9;
            } else if (t11.l(str3, "digits")) {
                i4 = 3;
            } else if (t11.l(str3, "uri")) {
                i4 = 5;
            } else if (vf2Var.a == wf2.m) {
                i4 = 7;
            }
            final int i5 = i4;
            qp0.d(true, xm0Var, null, kf2Var.c, null, xe1.i0(2070951913, new x(xm0Var, xm0Var2, 10), go0Var), xe1.i0(-1980458784, new nn0() { // from class: ck2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.nn0
                public final Object e(Object obj, Object obj2, Object obj3) {
                    int iIntValue;
                    bv bvVar = (bv) obj;
                    px pxVar2 = (px) obj2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    bvVar.getClass();
                    if ((iIntValue2 & 6) == 0) {
                        iIntValue2 |= ((go0) pxVar2).f(bvVar) ? 4 : 2;
                    }
                    int iIntValue3 = 1;
                    go0 go0Var2 = (go0) pxVar2;
                    if (go0Var2.O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                        yi0 yi0Var = te.e;
                        vf2 vf2Var2 = kf2Var.s;
                        String str4 = vf2Var2.b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = str4;
                        boolean z2 = z;
                        boolean z3 = !z2;
                        if (z2) {
                            Integer num = vf2Var2.d;
                            iIntValue = num != null ? num.intValue() : 3;
                        } else {
                            iIntValue = 1;
                        }
                        if (z2) {
                            Integer num2 = vf2Var2.e;
                            iIntValue3 = num2 != null ? num2.intValue() : 8;
                        }
                        tp0.b(str, in0Var, yi0Var, str5, null, null, z3, iIntValue, iIntValue3, false, false, vf2Var2.a == wf2.m ? new tx1() : gd3.P, new m51(i5, 123), null, go0Var2, 384, 0, 9776);
                        String str6 = str2;
                        if (str6 == null) {
                            go0Var2.W(118854048);
                            go0Var2.p(false);
                        } else {
                            go0Var2.W(118854049);
                            qp0.e(str6, new bu0(), go0Var2, 0, 0);
                            go0Var2.p(false);
                        }
                    } else {
                        go0Var2.R();
                    }
                    return a83.a;
                }
            }, go0Var), go0Var, 1769526, 20);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new au0(kf2Var, str, str2, in0Var, xm0Var, xm0Var2, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(kf2 kf2Var, j31 j31Var, String str, in0 in0Var, xm0 xm0Var, px pxVar, int i2) {
        String string;
        Boolean boolD;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1861006112);
        int i3 = i2 | (go0Var.h(kf2Var) ? 4 : 2) | (go0Var.h(j31Var) ? 32 : 16) | (go0Var.f(str) ? 256 : 128) | (go0Var.h(in0Var) ? 2048 : 1024) | (go0Var.h(xm0Var) ? 16384 : 8192);
        if (go0Var.O(i3 & 1, (i3 & 9363) != 9362)) {
            String str2 = kf2Var.d;
            List list = kf2Var.h;
            String str3 = kf2Var.c;
            uf2 uf2Var = kf2Var.b;
            String strU0 = du.u0(eu.Q(str2, str), "\n", null, null, null, 62);
            Object obj = null;
            if (pv2.s0(strU0)) {
                strU0 = null;
            }
            uf2 uf2Var2 = uf2.j;
            eb ebVar = nx.a;
            if (uf2Var == uf2Var2) {
                go0Var.W(1795592308);
                i41 i41Var = j31Var instanceof i41 ? (i41) j31Var : null;
                boolean zBooleanValue = (i41Var == null || (boolD = l31.d(i41Var)) == null) ? false : boolD.booleanValue();
                kw kwVarI0 = xe1.i0(1465850092, new rh(kf2Var, zBooleanValue, in0Var), go0Var);
                boolean zG = go0Var.g(zBooleanValue) | ((i3 & 7168) == 2048);
                Object objL = go0Var.L();
                if (zG || objL == ebVar) {
                    objL = new qh(5, in0Var, zBooleanValue);
                    go0Var.f0(objL);
                }
                sp0.g(str3, null, strU0, null, kwVarI0, null, false, (xm0) objL, null, go0Var, 24576, 362);
                go0Var.p(false);
            } else {
                String str4 = strU0;
                if (list.isEmpty()) {
                    go0Var.W(1796929400);
                    if (j31Var == null) {
                        go0Var.W(-1983762116);
                        string = P(R.string.script_settings_unconfigured, go0Var);
                        go0Var.p(false);
                    } else if (kf2Var.g) {
                        go0Var.W(-1983759846);
                        string = P(R.string.script_settings_configured, go0Var);
                        go0Var.p(false);
                    } else if (uf2Var == uf2.n) {
                        go0Var.W(-1983756910);
                        z21 z21Var = j31Var instanceof z21 ? (z21) j31Var : null;
                        string = Q(R.string.script_settings_item_count, new Object[]{Integer.valueOf(z21Var != null ? z21Var.h.size() : 0)}, go0Var);
                        go0Var.p(false);
                    } else if (j31Var instanceof i41) {
                        i41 i41Var2 = (i41) j31Var;
                        if (i41Var2.b()) {
                            go0Var.W(-1983751569);
                            go0Var.p(false);
                            string = pv2.H0(i41Var2.a(), 24);
                        } else {
                            go0Var.W(-1983750703);
                            go0Var.p(false);
                            string = j31Var.toString();
                        }
                    }
                    String str5 = kf2Var.s.c;
                    qp0.h(str3, xm0Var, null, str4, null, hk1.h(string, str5 != null ? " ".concat(str5) : ""), null, false, null, go0Var, (i3 >> 9) & 112, 468);
                    go0Var.p(false);
                } else {
                    go0Var.W(1796462292);
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((jf2) next).a.equals(j31Var)) {
                            obj = next;
                            break;
                        }
                    }
                    jf2 jf2Var = (jf2) obj;
                    if (jf2Var == null) {
                        jf2Var = (jf2) du.o0(list);
                    }
                    jf2 jf2Var2 = jf2Var;
                    boolean z = (i3 & 7168) == 2048;
                    Object objL2 = go0Var.L();
                    if (z || objL2 == ebVar) {
                        objL2 = new wo0(in0Var, 3);
                        go0Var.f0(objL2);
                    }
                    eu.m(str3, list, jf2Var2, (in0) objL2, null, str4, mk2.o, false, go0Var, 0);
                    go0Var = go0Var;
                    go0Var.p(false);
                }
            }
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ze(kf2Var, j31Var, str, in0Var, xm0Var, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(final in0 in0Var, px pxVar, int i2) {
        go0 go0Var;
        int i3;
        Object vi2Var;
        xk1 xk1Var;
        xk1 xk1Var2;
        List list;
        xk1 xk1Var3;
        xk1 xk1Var4;
        xk1 xk1Var5;
        xk1 xk1Var6;
        Object vhVar;
        eb ebVar;
        kf2 kf2Var;
        xk1 xk1Var7;
        xk1 xk1Var8;
        xk1 xk1Var9;
        eb ebVar2;
        boolean z;
        xk1 xk1Var10;
        xk1 xk1Var11;
        j20 j20Var;
        Context context;
        boolean z2;
        eb ebVar3;
        int i4;
        in0Var.getClass();
        go0 go0Var2 = (go0) pxVar;
        go0Var2.X(820665483);
        int i5 = 2;
        int i6 = i2 | (go0Var2.h(in0Var) ? 4 : 2);
        int i7 = 1;
        if (go0Var2.O(i6 & 1, (i6 & 3) != 2)) {
            Context context2 = (Context) go0Var2.j(r7.b);
            Object objL = go0Var2.L();
            eb ebVar4 = nx.a;
            if (objL == ebVar4) {
                objL = eu.C(go0Var2);
                go0Var2.f0(objL);
            }
            final j20 j20Var2 = (j20) objL;
            m52 m52Var = sq1.e;
            Object value = m52Var.h.getValue();
            zd0 zd0Var = zd0.h;
            boolean zH = go0Var2.h(zd0Var) | go0Var2.h(m52Var);
            Object objL2 = go0Var2.L();
            t00 t00Var = null;
            if (zH || objL2 == ebVar4) {
                objL2 = new b2(zd0Var, m52Var, t00Var, 20);
                go0Var2.f0(objL2);
            }
            mn0 mn0Var = (mn0) objL2;
            Object objL3 = go0Var2.L();
            if (objL3 == ebVar4) {
                objL3 = op0.u(value);
                go0Var2.f0(objL3);
            }
            xk1 xk1Var12 = (xk1) objL3;
            boolean zH2 = go0Var2.h(mn0Var);
            Object objL4 = go0Var2.L();
            if (zH2 || objL4 == ebVar4) {
                objL4 = new ms2(mn0Var, xk1Var12, t00Var, i7);
                go0Var2.f0(objL4);
            }
            eu.g(m52Var, zd0Var, (mn0) objL4, go0Var2);
            Object[] objArr = new Object[0];
            Object objL5 = go0Var2.L();
            if (objL5 == ebVar4) {
                objL5 = new hn1(13);
                go0Var2.f0(objL5);
            }
            final xk1 xk1Var13 = (xk1) gf1.M(objArr, (xm0) objL5, go0Var2, 48);
            Object objL6 = go0Var2.L();
            if (objL6 == ebVar4) {
                objL6 = op0.u(null);
                go0Var2.f0(objL6);
            }
            xk1 xk1Var14 = (xk1) objL6;
            Object objL7 = go0Var2.L();
            if (objL7 == ebVar4) {
                objL7 = op0.u(Boolean.FALSE);
                go0Var2.f0(objL7);
            }
            xk1 xk1Var15 = (xk1) objL7;
            Object objL8 = go0Var2.L();
            if (objL8 == ebVar4) {
                objL8 = op0.u(null);
                go0Var2.f0(objL8);
            }
            xk1 xk1Var16 = (xk1) objL8;
            Object objL9 = go0Var2.L();
            if (objL9 == ebVar4) {
                objL9 = op0.u(null);
                go0Var2.f0(objL9);
            }
            final xk1 xk1Var17 = (xk1) objL9;
            Object objL10 = go0Var2.L();
            if (objL10 == ebVar4) {
                objL10 = op0.u("");
                go0Var2.f0(objL10);
            }
            final xk1 xk1Var18 = (xk1) objL10;
            Object objL11 = go0Var2.L();
            if (objL11 == ebVar4) {
                objL11 = op0.u(null);
                go0Var2.f0(objL11);
            }
            final xk1 xk1Var19 = (xk1) objL11;
            Object objL12 = go0Var2.L();
            if (objL12 == ebVar4) {
                objL12 = op0.u(null);
                go0Var2.f0(objL12);
            }
            final xk1 xk1Var20 = (xk1) objL12;
            Object objL13 = go0Var2.L();
            if (objL13 == ebVar4) {
                objL13 = op0.u(Boolean.FALSE);
                go0Var2.f0(objL13);
            }
            xk1 xk1Var21 = (xk1) objL13;
            final String strP = P(R.string.script_settings_permissions_label, go0Var2);
            final String strP2 = P(R.string.script_settings_dangerous_permissions_label, go0Var2);
            final String strP3 = P(R.string.script_settings_granted, go0Var2);
            final String strP4 = P(R.string.script_settings_pending, go0Var2);
            final String strP5 = P(R.string.script_settings_permission_list_separator, go0Var2);
            final String strP6 = P(R.string.script_settings_permission_detail_separator, go0Var2);
            boolean zH3 = go0Var2.h(context2);
            Object objL14 = go0Var2.L();
            if (zH3 || objL14 == ebVar4) {
                objL14 = new u80(context2, t00Var, i5);
                go0Var2.f0(objL14);
            }
            eu.f(go0Var2, (mn0) objL14, context2);
            List list2 = ((tq1) xk1Var12.getValue()).a;
            String str = (String) xk1Var13.getValue();
            boolean zF = go0Var2.f(xk1Var13) | go0Var2.f(xk1Var12);
            Object objL15 = go0Var2.L();
            int i8 = 7;
            if (zF || objL15 == ebVar4) {
                objL15 = new u30(xk1Var13, xk1Var12, t00Var, i8);
                go0Var2.f0(objL15);
            }
            eu.g(list2, str, (mn0) objL15, go0Var2);
            String str2 = (String) xk1Var13.getValue();
            List list3 = ((tq1) xk1Var12.getValue()).a;
            boolean zF2 = go0Var2.f(xk1Var13) | go0Var2.f(xk1Var12) | go0Var2.h(context2);
            Object objL16 = go0Var2.L();
            if (zF2 || objL16 == ebVar4) {
                xk1Var = xk1Var21;
                xk1Var2 = xk1Var15;
                list = list3;
                xk1Var3 = xk1Var12;
                vi2Var = new vi2(xk1Var13, xk1Var3, xk1Var14, xk1Var16, xk1Var2, context2, (t00) null);
                xk1Var4 = xk1Var14;
                context2 = context2;
                xk1Var5 = xk1Var16;
                go0Var2.f0(vi2Var);
            } else {
                list = list3;
                xk1Var3 = xk1Var12;
                xk1Var2 = xk1Var15;
                xk1Var5 = xk1Var16;
                xk1Var = xk1Var21;
                vi2Var = objL16;
                xk1Var4 = xk1Var14;
            }
            eu.g(str2, list, (mn0) vi2Var, go0Var2);
            final Context context3 = context2;
            final xk1 xk1Var22 = xk1Var3;
            final xk1 xk1Var23 = xk1Var4;
            final xk1 xk1Var24 = xk1Var5;
            xk1 xk1Var25 = xk1Var;
            final xk1 xk1Var26 = xk1Var2;
            mn0 mn0Var2 = new mn0() { // from class: lk2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    px pxVar2 = (px) obj;
                    int iIntValue = ((Integer) obj2).intValue();
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
                        tp0.c(rg3.P(R.string.home_settings_scripts, go0Var3), null, null, in0Var, go0Var3, 0, 30);
                        uh1 uh1VarC = te.e.c(new g71(1.0f, true));
                        jw1 jw1VarH = fg1.h();
                        xf xfVar = new xf(12.0f, new s(2));
                        final Context context4 = context3;
                        boolean zH4 = go0Var3.h(context4);
                        final xk1 xk1Var27 = xk1Var22;
                        boolean zF3 = zH4 | go0Var3.f(xk1Var27);
                        final String str3 = strP;
                        boolean zF4 = zF3 | go0Var3.f(str3);
                        final String str4 = strP6;
                        boolean zF5 = zF4 | go0Var3.f(str4);
                        final String str5 = strP5;
                        boolean zF6 = zF5 | go0Var3.f(str5);
                        final String str6 = strP2;
                        boolean zF7 = zF6 | go0Var3.f(str6);
                        final String str7 = strP3;
                        boolean zF8 = zF7 | go0Var3.f(str7);
                        final String str8 = strP4;
                        boolean zF9 = zF8 | go0Var3.f(str8);
                        final j20 j20Var3 = j20Var2;
                        boolean zH5 = zF9 | go0Var3.h(j20Var3);
                        final xk1 xk1Var28 = xk1Var13;
                        boolean zF10 = zH5 | go0Var3.f(xk1Var28);
                        Object objL17 = go0Var3.L();
                        if (zF10 || objL17 == nx.a) {
                            final xk1 xk1Var29 = xk1Var19;
                            final xk1 xk1Var30 = xk1Var24;
                            final xk1 xk1Var31 = xk1Var20;
                            final xk1 xk1Var32 = xk1Var26;
                            final xk1 xk1Var33 = xk1Var23;
                            final xk1 xk1Var34 = xk1Var17;
                            final xk1 xk1Var35 = xk1Var18;
                            objL17 = new in0() { // from class: bk2
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // defpackage.in0
                                public final Object j(Object obj3) {
                                    int i9;
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
                                    int i10 = 2;
                                    s81.a(s81Var, "script_directory", new kw(185293217, true, new wt0(8, context5)), 2);
                                    xk1 xk1Var38 = xk1Var27;
                                    boolean zIsEmpty = ((tq1) xk1Var38.getValue()).a.isEmpty();
                                    final xk1 xk1Var39 = xk1Var28;
                                    final String str13 = str4;
                                    final String str14 = str5;
                                    final String str15 = str7;
                                    final String str16 = str8;
                                    final j20 j20Var5 = j20Var3;
                                    final xk1 xk1Var40 = xk1Var29;
                                    xk1 xk1Var41 = xk1Var30;
                                    if (zIsEmpty) {
                                        s81.a(s81Var, "script_empty", new kw(-819491204, true, new y30(xk1Var38, i10)), 2);
                                        xk1Var37 = xk1Var38;
                                        z3 = true;
                                        i9 = 2;
                                        xk1Var36 = xk1Var41;
                                        str9 = str13;
                                        str10 = str14;
                                        str11 = str15;
                                        str12 = str16;
                                        j20Var4 = j20Var5;
                                    } else {
                                        i9 = 2;
                                        xk1Var36 = xk1Var41;
                                        final String str17 = str3;
                                        final String str18 = str6;
                                        xk1Var37 = xk1Var38;
                                        z3 = true;
                                        nn0 nn0Var = new nn0() { // from class: dk2
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // defpackage.nn0
                                            public final Object e(Object obj4, Object obj5, Object obj6) {
                                                px pxVar3 = (px) obj5;
                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                ((o71) obj4).getClass();
                                                go0 go0Var4 = (go0) pxVar3;
                                                if (go0Var4.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    String strP7 = rg3.P(R.string.script_settings_installed, go0Var4);
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
                                                    eu.n(null, strP7, xe1.i0(940896100, new mn0() { // from class: ik2
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                        @Override // defpackage.mn0
                                                        public final Object g(Object obj7, Object obj8) {
                                                            px pxVar4 = (px) obj7;
                                                            int iIntValue3 = ((Integer) obj8).intValue();
                                                            go0 go0Var5 = (go0) pxVar4;
                                                            if (go0Var5.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                for (cq1 cq1Var : ((tq1) xk1Var42.getValue()).a) {
                                                                    String str25 = cq1Var.b;
                                                                    List list4 = cq1Var.i;
                                                                    StringBuilder sb = new StringBuilder();
                                                                    sb.append(cq1Var.a);
                                                                    sb.append(" · ");
                                                                    sb.append(cq1Var.c);
                                                                    boolean zIsEmpty2 = list4.isEmpty();
                                                                    String str26 = str20;
                                                                    if (!zIsEmpty2) {
                                                                        sb.append("\n" + str19 + str26);
                                                                        sb.append(du.u0(list4, str21, null, null, null, 62));
                                                                    }
                                                                    if (!cq1Var.j.isEmpty()) {
                                                                        sb.append("\n" + str22 + str26);
                                                                        sb.append(cq1Var.k ? str23 : str24);
                                                                    }
                                                                    String str27 = cq1Var.g;
                                                                    if (str27 != null) {
                                                                        sb.append("\n".concat(str27));
                                                                    }
                                                                    String str28 = cq1Var.h;
                                                                    if (str28 != null) {
                                                                        sb.append("\n".concat(str28));
                                                                    }
                                                                    String string = sb.toString();
                                                                    kw kwVarI0 = xe1.i0(-66744860, new ze(cq1Var, j20Var6, context6, xk1Var44, xk1Var45), go0Var5);
                                                                    xk1 xk1Var46 = xk1Var43;
                                                                    boolean zF11 = go0Var5.f(xk1Var46) | go0Var5.h(cq1Var);
                                                                    Object objL18 = go0Var5.L();
                                                                    if (zF11 || objL18 == nx.a) {
                                                                        objL18 = new r1(28, cq1Var, xk1Var46);
                                                                        go0Var5.f0(objL18);
                                                                    }
                                                                    sp0.g(str25, null, string, null, kwVarI0, null, false, (xm0) objL18, null, go0Var5, 24576, 362);
                                                                }
                                                            } else {
                                                                go0Var5.R();
                                                            }
                                                            return a83.a;
                                                        }
                                                    }, go0Var4), go0Var4, 384, 1);
                                                } else {
                                                    go0Var4.R();
                                                }
                                                return a83.a;
                                            }
                                        };
                                        str9 = str13;
                                        str10 = str14;
                                        str11 = str15;
                                        str12 = str16;
                                        j20Var4 = j20Var5;
                                        s81.a(s81Var, "script_list", new kw(1426426437, true, nn0Var), 2);
                                    }
                                    Iterator it = ((tq1) xk1Var37.getValue()).a.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        if (t11.l(((cq1) next).a, (String) xk1Var39.getValue())) {
                                            break;
                                        }
                                    }
                                    final cq1 cq1Var = (cq1) next;
                                    if (cq1Var != null) {
                                        String strI = vi0.i("script_permissions_", cq1Var.a);
                                        final xk1 xk1Var42 = xk1Var31;
                                        final xk1 xk1Var43 = xk1Var36;
                                        xk1Var36 = xk1Var43;
                                        s81.a(s81Var, strI, new kw(2057266291, z3, new nn0() { // from class: ek2
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // defpackage.nn0
                                            public final Object e(Object obj4, Object obj5, Object obj6) {
                                                px pxVar3 = (px) obj5;
                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                ((o71) obj4).getClass();
                                                go0 go0Var4 = (go0) pxVar3;
                                                if (go0Var4.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    String strP7 = rg3.P(R.string.script_settings_permissions_section, go0Var4);
                                                    final cq1 cq1Var2 = cq1Var;
                                                    final String str19 = str10;
                                                    final String str20 = str9;
                                                    final String str21 = str11;
                                                    final String str22 = str12;
                                                    final xk1 xk1Var44 = xk1Var42;
                                                    final xk1 xk1Var45 = xk1Var40;
                                                    final xk1 xk1Var46 = xk1Var43;
                                                    eu.n(null, strP7, xe1.i0(-819387886, new mn0() { // from class: jk2
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                        @Override // defpackage.mn0
                                                        public final Object g(Object obj7, Object obj8) {
                                                            long j2;
                                                            cq1 cq1Var3 = cq1Var2;
                                                            List list4 = cq1Var3.j;
                                                            px pxVar4 = (px) obj7;
                                                            int iIntValue3 = ((Integer) obj8).intValue();
                                                            go0 go0Var5 = (go0) pxVar4;
                                                            if (go0Var5.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                String strP8 = rg3.P(R.string.script_settings_declared_permissions, go0Var5);
                                                                List list5 = cq1Var3.i;
                                                                List list6 = !list5.isEmpty() ? list5 : null;
                                                                String strU0 = list6 != null ? du.u0(list6, str19, null, null, null, 62) : null;
                                                                if (strU0 == null) {
                                                                    go0Var5.W(-1452730289);
                                                                    strU0 = rg3.P(R.string.script_settings_no_extra_permissions, go0Var5);
                                                                } else {
                                                                    go0Var5.W(-1452736861);
                                                                }
                                                                go0Var5.p(false);
                                                                sp0.g(strP8, null, strU0, null, null, null, false, null, null, go0Var5, 0, 506);
                                                                if (list4.isEmpty()) {
                                                                    go0Var5.W(-2082754736);
                                                                    go0Var5.p(false);
                                                                } else {
                                                                    go0Var5.W(-2084700730);
                                                                    String strP9 = rg3.P(R.string.script_settings_dangerous_authorization, go0Var5);
                                                                    String str23 = str20;
                                                                    boolean zF11 = go0Var5.f(str23);
                                                                    Object objL18 = go0Var5.L();
                                                                    eb ebVar5 = nx.a;
                                                                    if (zF11 || objL18 == ebVar5) {
                                                                        objL18 = new v(26, str23);
                                                                        go0Var5.f0(objL18);
                                                                    }
                                                                    String strU02 = du.u0(list4, "\n", null, null, (in0) objL18, 30);
                                                                    boolean z4 = cq1Var3.k;
                                                                    String str24 = z4 ? str21 : str22;
                                                                    if (z4) {
                                                                        go0Var5.W(-2083883198);
                                                                        j2 = ((lp1) go0Var5.j(ur1.a)).f;
                                                                        go0Var5.p(false);
                                                                    } else {
                                                                        go0Var5.W(-2083768343);
                                                                        j2 = ((lp1) go0Var5.j(ur1.a)).g;
                                                                        go0Var5.p(false);
                                                                    }
                                                                    boolean zH6 = go0Var5.h(cq1Var3);
                                                                    Object objL19 = go0Var5.L();
                                                                    if (zH6 || objL19 == ebVar5) {
                                                                        objL19 = new dz0(cq1Var3, xk1Var44, xk1Var45, xk1Var46);
                                                                        go0Var5.f0(objL19);
                                                                    }
                                                                    qp0.h(strP9, (xm0) objL19, null, strU02, null, str24, new ju(j2), false, null, go0Var5, 0, 404);
                                                                    go0Var5.p(false);
                                                                }
                                                            } else {
                                                                go0Var5.R();
                                                            }
                                                            return a83.a;
                                                        }
                                                    }, go0Var4), go0Var4, 384, 1);
                                                } else {
                                                    go0Var4.R();
                                                }
                                                return a83.a;
                                            }
                                        }), i9);
                                    }
                                    if (cq1Var != null && !cq1Var.e) {
                                        s81.a(s81Var, "script_no_schema", new kw(600853236, z3, new fk2(cq1Var, 0)), i9);
                                    }
                                    if (((Boolean) xk1Var32.getValue()).booleanValue()) {
                                        s81.a(s81Var, "script_settings_loading", t11.a, i9);
                                    }
                                    final xk1 xk1Var44 = xk1Var33;
                                    uq1 uq1Var = (uq1) xk1Var44.getValue();
                                    if (uq1Var != null) {
                                        for (final qf2 qf2Var : uq1Var.b.b) {
                                            String strI2 = vi0.i("script_section_", qf2Var.a);
                                            final xk1 xk1Var45 = xk1Var39;
                                            final uq1 uq1Var2 = uq1Var;
                                            final xk1 xk1Var46 = xk1Var34;
                                            final xk1 xk1Var47 = xk1Var35;
                                            final Context context6 = context5;
                                            final xk1 xk1Var48 = xk1Var36;
                                            s81.a(s81Var, strI2, new kw(-1744527234, z3, new nn0() { // from class: gk2
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // defpackage.nn0
                                                public final Object e(Object obj4, Object obj5, Object obj6) {
                                                    px pxVar3 = (px) obj5;
                                                    int iIntValue2 = ((Integer) obj6).intValue();
                                                    ((o71) obj4).getClass();
                                                    go0 go0Var4 = (go0) pxVar3;
                                                    if (go0Var4.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        final qf2 qf2Var2 = qf2Var;
                                                        String str19 = qf2Var2.b;
                                                        final uq1 uq1Var3 = uq1Var2;
                                                        final xk1 xk1Var49 = xk1Var45;
                                                        final j20 j20Var6 = j20Var4;
                                                        final Context context7 = context6;
                                                        final xk1 xk1Var50 = xk1Var44;
                                                        final xk1 xk1Var51 = xk1Var48;
                                                        final xk1 xk1Var52 = xk1Var46;
                                                        final xk1 xk1Var53 = xk1Var47;
                                                        eu.n(null, str19, xe1.i0(-407099201, new mn0() { // from class: hk2
                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                            @Override // defpackage.mn0
                                                            public final Object g(Object obj7, Object obj8) {
                                                                Object next2;
                                                                final xk1 xk1Var54;
                                                                xk1 xk1Var55;
                                                                px pxVar4 = (px) obj7;
                                                                int iIntValue3 = ((Integer) obj8).intValue();
                                                                go0 go0Var5 = (go0) pxVar4;
                                                                if (go0Var5.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                    for (String str20 : qf2Var2.c) {
                                                                        uq1 uq1Var4 = uq1Var3;
                                                                        lf2 lf2Var = uq1Var4.b;
                                                                        rf2 rf2Var = uq1Var4.c;
                                                                        final kf2 kf2Var2 = (kf2) we1.p0(str20, lf2Var.a);
                                                                        j31 j31Var = (j31) rf2Var.b.get(str20);
                                                                        Iterator it2 = rf2Var.c.iterator();
                                                                        while (true) {
                                                                            if (!it2.hasNext()) {
                                                                                next2 = null;
                                                                                break;
                                                                            }
                                                                            next2 = it2.next();
                                                                            if (t11.l(((gf2) next2).a, str20)) {
                                                                                break;
                                                                            }
                                                                        }
                                                                        gf2 gf2Var = (gf2) next2;
                                                                        String str21 = gf2Var != null ? gf2Var.b : null;
                                                                        final xk1 xk1Var56 = xk1Var49;
                                                                        boolean zF11 = go0Var5.f(xk1Var56);
                                                                        final j20 j20Var7 = j20Var6;
                                                                        boolean zH6 = zF11 | go0Var5.h(j20Var7);
                                                                        final Context context8 = context7;
                                                                        boolean zH7 = zH6 | go0Var5.h(context8) | go0Var5.h(kf2Var2);
                                                                        Object objL18 = go0Var5.L();
                                                                        final xk1 xk1Var57 = xk1Var51;
                                                                        xk1 xk1Var58 = xk1Var52;
                                                                        eb ebVar5 = nx.a;
                                                                        if (zH7 || objL18 == ebVar5) {
                                                                            xk1Var54 = xk1Var58;
                                                                            final xk1 xk1Var59 = xk1Var50;
                                                                            in0 in0Var2 = new in0() { // from class: kk2
                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                @Override // defpackage.in0
                                                                                public final Object j(Object obj9) {
                                                                                    j31 j31Var2 = (j31) obj9;
                                                                                    String str22 = (String) xk1Var56.getValue();
                                                                                    if (str22 != null) {
                                                                                        p7.A(j20Var7, null, new ok2(str22, kf2Var2, j31Var2, xk1Var59, xk1Var57, xk1Var54, context8, null), 3);
                                                                                    }
                                                                                    return a83.a;
                                                                                }
                                                                            };
                                                                            xk1Var55 = xk1Var57;
                                                                            go0Var5.f0(in0Var2);
                                                                            objL18 = in0Var2;
                                                                        } else {
                                                                            xk1Var55 = xk1Var57;
                                                                            xk1Var54 = xk1Var58;
                                                                        }
                                                                        in0 in0Var3 = (in0) objL18;
                                                                        boolean zH8 = go0Var5.h(kf2Var2) | go0Var5.h(uq1Var4) | go0Var5.f(str20);
                                                                        Object objL19 = go0Var5.L();
                                                                        if (zH8 || objL19 == ebVar5) {
                                                                            mf mfVar = new mf(kf2Var2, uq1Var4, str20, xk1Var54, xk1Var53, xk1Var55);
                                                                            kf2Var2 = kf2Var2;
                                                                            go0Var5.f0(mfVar);
                                                                            objL19 = mfVar;
                                                                        }
                                                                        rg3.f(kf2Var2, j31Var, str21, in0Var3, (xm0) objL19, go0Var5, 0);
                                                                    }
                                                                } else {
                                                                    go0Var5.R();
                                                                }
                                                                return a83.a;
                                                            }
                                                        }, go0Var4), go0Var4, 384, 1);
                                                    } else {
                                                        go0Var4.R();
                                                    }
                                                    return a83.a;
                                                }
                                            }), i9);
                                            uq1Var = uq1Var2;
                                            xk1Var39 = xk1Var45;
                                            context5 = context6;
                                        }
                                    }
                                    String str19 = (String) xk1Var36.getValue();
                                    if (str19 != null) {
                                        s81.a(s81Var, "script_error", new kw(391755064, z3, new x1(str19, 4)), i9);
                                    }
                                    return a83.a;
                                }
                            };
                            go0Var3.f0(objL17);
                        }
                        rg3.d(24960, 490, null, xfVar, null, go0Var3, null, (in0) objL17, null, uh1VarC, jw1VarH, false);
                        go0Var3.p(true);
                    } else {
                        go0Var3.R();
                    }
                    return a83.a;
                }
            };
            j20 j20Var3 = j20Var2;
            Context context4 = context3;
            go0 go0Var3 = go0Var2;
            ci0.p(xe1.i0(-705894698, mn0Var2, go0Var3), go0Var3, 6);
            kf2 kf2Var2 = (kf2) xk1Var17.getValue();
            if (kf2Var2 == null) {
                go0Var3.W(1505943004);
                go0Var3.p(false);
                xk1Var8 = xk1Var19;
                z = false;
                xk1Var7 = xk1Var24;
                ebVar2 = ebVar4;
                xk1Var9 = xk1Var20;
            } else {
                go0Var3.W(1505943005);
                String str3 = (String) xk1Var18.getValue();
                String str4 = (String) xk1Var24.getValue();
                Object objL17 = go0Var3.L();
                if (objL17 == ebVar4) {
                    objL17 = new pr(xk1Var18, 21);
                    go0Var3.f0(objL17);
                }
                in0 in0Var2 = (in0) objL17;
                Object objL18 = go0Var3.L();
                if (objL18 == ebVar4) {
                    xk1Var6 = xk1Var19;
                    objL18 = new rt0(xk1Var17, xk1Var24, 2);
                    go0Var3.f0(objL18);
                } else {
                    xk1Var6 = xk1Var19;
                }
                xm0 xm0Var = (xm0) objL18;
                boolean zH4 = go0Var3.h(kf2Var2) | go0Var3.h(context4) | go0Var3.f(xk1Var13) | go0Var3.h(j20Var3);
                Object objL19 = go0Var3.L();
                if (zH4 || objL19 == ebVar4) {
                    ebVar = ebVar4;
                    vhVar = new vh(kf2Var2, context4, xk1Var18, j20Var3, xk1Var13, xk1Var23, xk1Var24, xk1Var17);
                    kf2Var = kf2Var2;
                    context4 = context4;
                    j20Var3 = j20Var3;
                    xk1Var7 = xk1Var24;
                    go0Var3.f0(vhVar);
                } else {
                    vhVar = objL19;
                    kf2Var = kf2Var2;
                    ebVar = ebVar4;
                    xk1Var7 = xk1Var24;
                }
                xk1Var8 = xk1Var6;
                xk1Var9 = xk1Var20;
                ebVar2 = ebVar;
                z = false;
                e(kf2Var, str3, str4, in0Var2, xm0Var, (xm0) vhVar, go0Var3, 27648);
                go0Var3.p(false);
            }
            vy1 vy1Var = (vy1) xk1Var8.getValue();
            if (vy1Var == null) {
                go0Var3.W(1506769030);
                go0Var3.p(z);
                z2 = z;
                context = context4;
                ebVar3 = ebVar2;
                xk1Var11 = xk1Var25;
                j20Var = j20Var3;
            } else {
                go0Var3.W(1506769031);
                Object objL20 = go0Var3.L();
                if (objL20 == ebVar2) {
                    xk1Var10 = xk1Var25;
                    objL20 = new rt0(xk1Var10, xk1Var8, 3);
                    go0Var3.f0(objL20);
                } else {
                    xk1Var10 = xk1Var25;
                }
                String strP7 = P(R.string.script_settings_authorize_title, go0Var3);
                xk1 xk1Var27 = xk1Var10;
                boolean z3 = z;
                eb ebVar5 = ebVar2;
                j20 j20Var4 = j20Var3;
                l0 l0Var = new l0(vy1Var, j20Var4, context4, xk1Var27, xk1Var8, xk1Var7, 1);
                xk1Var11 = xk1Var27;
                j20Var = j20Var4;
                xk1Var9 = xk1Var9;
                context = context4;
                z2 = z3;
                ebVar3 = ebVar5;
                qp0.d(true, (xm0) objL20, null, strP7, null, xe1.i0(1470670831, l0Var, go0Var3), xe1.i0(-273080040, new wt0(7, vy1Var), go0Var3), go0Var3, 1769526, 20);
                go0Var3 = go0Var3;
                go0Var3.p(z2);
            }
            cq1 cq1Var = (cq1) xk1Var9.getValue();
            if (cq1Var == null) {
                go0Var3.W(1509859854);
                go0Var3.p(z2);
                go0Var = go0Var3;
                i3 = 1;
            } else {
                go0Var3.W(1509859855);
                Object objL21 = go0Var3.L();
                if (objL21 == ebVar3) {
                    i4 = 1;
                    objL21 = new rt0(xk1Var11, xk1Var9, i4);
                    go0Var3.f0(objL21);
                } else {
                    i4 = 1;
                }
                go0Var = go0Var3;
                i3 = i4;
                qp0.d(true, (xm0) objL21, null, P(R.string.script_settings_revoke_title, go0Var3), null, xe1.i0(1325625704, new l0(j20Var, cq1Var, context, xk1Var11, xk1Var9, xk1Var7, 2), go0Var3), xe1.i0(1055925137, new fk2(cq1Var, i4), go0Var3), go0Var, 1769526, 20);
                go0Var.p(z2);
            }
        } else {
            go0Var = go0Var2;
            i3 = 1;
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new w1(i2, i3, in0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(uh1 uh1Var, kw kwVar, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1854833411);
        int i3 = (go0Var.f(uh1Var) ? 4 : 2) | i2;
        int i4 = 18;
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            Object objL = go0Var.L();
            if (objL == nx.a) {
                objL = k8.g;
                go0Var.f0(objL);
            }
            nf1 nf1Var = (nf1) objL;
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1Var);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, gx.e, nf1Var);
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            kwVar.g(go0Var, 6);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new af(i2, i4, uh1Var, kwVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object i(defpackage.yw2 r6, defpackage.rj r7) {
        /*
            boolean r0 = r7 instanceof defpackage.la2
            if (r0 == 0) goto L13
            r0 = r7
            la2 r0 = (defpackage.la2) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            la2 r0 = new la2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.l
            int r1 = r0.m
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            yw2 r6 = r0.k
            defpackage.fg1.T(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.s.l(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.fg1.T(r7)
        L31:
            r0.k = r6
            r0.m = r2
            i12 r7 = defpackage.i12.i
            java.lang.Object r7 = r6.a(r7, r0)
            k20 r1 = defpackage.k20.h
            if (r7 != r1) goto L40
            return r1
        L40:
            h12 r7 = (defpackage.h12) r7
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            o12 r5 = (defpackage.o12) r5
            boolean r5 = defpackage.tp0.n(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg3.i(yw2, rj):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean j(qn2 qn2Var) {
        ln2 ln2VarK = qn2Var.k();
        return !ln2VarK.h.c(vn2.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean k(qn2 qn2Var, Resources resources) {
        Object objG = qn2Var.d.h.g(vn2.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !xe1.L(qn2Var) && (qn2Var.d.j || (qn2Var.q() && ((list != null ? (String) du.q0(list) : null) != null || B(qn2Var) != null || A(qn2Var, resources) != null || z(qn2Var))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean l(String str, String str2) {
        return !str.equals(str2) && wv2.W(str, ".".concat(str2), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void m(ve0 ve0Var) {
        ve0Var.getClass();
        if ((ve0Var instanceof dv2 ? (dv2) ve0Var : null) != null) {
            return;
        }
        s.n("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ", d72.a(ve0Var.getClass()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int n(double d2) {
        double d3 = (d2 + 16.0d) / 116.0d;
        double d4 = d2 > 8.0d ? d3 * d3 * d3 : d2 / 903.2962962962963d;
        double d5 = d3 * d3 * d3;
        boolean z = d5 > 0.008856451679035631d;
        double d6 = z ? d5 : d2 / 903.2962962962963d;
        if (!z) {
            d5 = d2 / 903.2962962962963d;
        }
        float[] fArr = c;
        double d7 = d6 * ((double) fArr[0]);
        double d8 = d4 * ((double) fArr[1]);
        double d9 = d5 * ((double) fArr[2]);
        double[][] dArr = e;
        double[] dArr2 = dArr[0];
        double d10 = (dArr2[2] * d9) + (dArr2[1] * d8) + (dArr2[0] * d7);
        double[] dArr3 = dArr[1];
        double d11 = (dArr3[2] * d9) + (dArr3[1] * d8) + (dArr3[0] * d7);
        double[] dArr4 = dArr[2];
        return ((u(d10) & 255) << 16) | (-16777216) | ((u(d11) & 255) << 8) | (u((dArr4[2] * d9) + (dArr4[1] * d8) + (dArr4[0] * d7)) & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final cv2 o(y40 y40Var) {
        y40Var.getClass();
        cv2 cv2Var = y40Var instanceof cv2 ? (cv2) y40Var : null;
        if (cv2Var != null) {
            return cv2Var;
        }
        s.n("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ", d72.a(y40Var.getClass()));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int p(int[] iArr, int i2, int i3) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int q(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object r(t60 t60Var, xm0 xm0Var, u00 u00Var) {
        Object obj;
        zn1 zn1VarB0;
        Object objF0;
        vn1 vn1Var;
        if (((th1) t60Var).h.u) {
            th1 th1Var = (th1) t60Var;
            if (!th1Var.h.u) {
                kz0.b("visitAncestors called on an unattached node");
            }
            th1 th1Var2 = th1Var.h.l;
            r61 r61VarC0 = sp0.c0(t60Var);
            loop0: while (true) {
                obj = null;
                if (r61VarC0 == null) {
                    break;
                }
                if ((((th1) r61VarC0.M.g).k & 524288) != 0) {
                    while (th1Var2 != null) {
                        if ((th1Var2.j & 524288) != 0) {
                            th1 th1VarM = th1Var2;
                            zk1 zk1Var = null;
                            while (th1VarM != null) {
                                if (th1VarM instanceof jm) {
                                    obj = th1VarM;
                                    break loop0;
                                }
                                if ((th1VarM.j & 524288) != 0 && (th1VarM instanceof u60)) {
                                    int i2 = 0;
                                    for (th1 th1Var3 = ((u60) th1VarM).w; th1Var3 != null; th1Var3 = th1Var3.m) {
                                        if ((th1Var3.j & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                th1VarM = th1Var3;
                                            } else {
                                                if (zk1Var == null) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (th1VarM != null) {
                                                    zk1Var.b(th1VarM);
                                                    th1VarM = null;
                                                }
                                                zk1Var.b(th1Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                th1VarM = sp0.m(zk1Var);
                            }
                        }
                        th1Var2 = th1Var2.l;
                    }
                }
                r61VarC0 = r61VarC0.u();
                th1Var2 = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
            }
            jm jmVar = (jm) obj;
            if (jmVar != null && (objF0 = jmVar.f0((zn1VarB0 = sp0.b0(t60Var)), new t6(2, xm0Var, zn1VarB0), u00Var)) == k20.h) {
                return objF0;
            }
        }
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void s(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final xk1 t(bk1 bk1Var, px pxVar) {
        go0 go0Var = (go0) pxVar;
        Object objL = go0Var.L();
        eb ebVar = nx.a;
        if (objL == ebVar) {
            objL = op0.u(Boolean.FALSE);
            go0Var.f0(objL);
        }
        xk1 xk1Var = (xk1) objL;
        Object objL2 = go0Var.L();
        if (objL2 == ebVar) {
            objL2 = new a2(bk1Var, xk1Var, null, 21);
            go0Var.f0(objL2);
        }
        eu.f(go0Var, (mn0) objL2, bk1Var);
        return xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int u(double d2) {
        double d3 = d2 / 100.0d;
        int iRound = (int) Math.round((d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (iRound < 0) {
            return 0;
        }
        if (iRound > 255) {
            return 255;
        }
        return iRound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float v(float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f2)) & 8589934591L) / 3)) + 709952852);
        float f3 = fIntBitsToFloat - ((fIntBitsToFloat - (f2 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final a20 w(a20 a20Var, a20 a20Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i2 = 27;
        boolean zBooleanValue = ((Boolean) a20Var.r(new ye(i2), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) a20Var2.r(new ye(i2), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return a20Var.k(a20Var2);
        }
        ye yeVar = new ye(25);
        zd0 zd0Var = zd0.h;
        a20 a20Var3 = (a20) a20Var.r(yeVar, zd0Var);
        Object objR = a20Var2;
        if (zBooleanValue2) {
            objR = a20Var2.r(new ye(26), zd0Var);
        }
        return a20Var3.k((a20) objR);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final m13 x(go0 go0Var) {
        return new m13(((lp1) go0Var.j(ur1.a)).f, D(12), null, 0L, 0, D(17), null, null, 16646140);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final sx0 y() {
        sx0 sx0Var = w;
        if (sx0Var != null) {
            return sx0Var;
        }
        rx0 rx0Var = new rx0("Filled.Download", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = s93.a;
        ft2 ft2Var = new ft2(ju.b);
        ye0 ye0Var = new ye0(3);
        ye0Var.k(5.0f, 20.0f);
        ye0Var.h(14.0f);
        ye0Var.o(-2.0f);
        ay1 ay1Var = new ay1(5.0f);
        ArrayList arrayList = ye0Var.a;
        arrayList.add(ay1Var);
        arrayList.add(new py1(20.0f));
        ye0Var.c();
        ye0Var.k(19.0f, 9.0f);
        ye0Var.h(-4.0f);
        arrayList.add(new py1(3.0f));
        arrayList.add(new ay1(9.0f));
        ye0Var.o(6.0f);
        arrayList.add(new ay1(5.0f));
        ye0Var.j(7.0f, 7.0f);
        ye0Var.i(19.0f, 9.0f);
        ye0Var.c();
        rx0.a(rx0Var, arrayList, ft2Var);
        sx0 sx0VarB = rx0Var.b();
        w = sx0VarB;
        return sx0VarB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean z(qn2 qn2Var) {
        Object objG = qn2Var.d.h.g(vn2.K);
        if (objG == null) {
            objG = null;
        }
        u23 u23Var = (u23) objG;
        rk1 rk1Var = qn2Var.d.h;
        Object objG2 = rk1Var.g(vn2.z);
        if (objG2 == null) {
            objG2 = null;
        }
        boolean z = u23Var != null;
        Object objG3 = rk1Var.g(vn2.J);
        if (((Boolean) (objG3 != null ? objG3 : null)) != null) {
            return true;
        }
        return z;
    }
}
