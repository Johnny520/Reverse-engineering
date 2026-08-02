package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h7 extends t3 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final yj1 U;
    public int A;
    public Integer B;
    public final jg C;
    public final jn D;
    public boolean E;
    public d7 F;
    public zj1 G;
    public final ak1 H;
    public final xj1 I;
    public final xj1 J;
    public final String K;
    public final String L;
    public final vu2 M;
    public final zj1 N;
    public rn2 O;
    public boolean P;
    public final xj1 Q;
    public final m2 R;
    public final ArrayList S;
    public final g7 T;
    public final b7 k;
    public int l = Integer.MIN_VALUE;
    public final g7 m = new g7(this, 0);
    public final AccessibilityManager n;
    public long o;
    public List p;
    public final c7 q;
    public int r;
    public int s;
    public l4 t;
    public l4 u;
    public boolean v;
    public final zj1 w;
    public final zj1 x;
    public final nt2 y;
    public final nt2 z;

    /* JADX DEBUG: Class process forced to load method for inline: mg.e0(int[], int[], int, int, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        yj1 yj1Var = w01.a;
        yj1 yj1Var2 = new yj1(32);
        int i = yj1Var2.b;
        if (i < 0) {
            s.d("");
            return;
        }
        int i2 = i + 32;
        yj1Var2.b(i2);
        int[] iArr2 = yj1Var2.a;
        int i3 = yj1Var2.b;
        if (i != i3) {
            mg.a0(iArr2, iArr2, i2, i, i3);
        }
        mg.e0(iArr, iArr2, i, 0, 12);
        yj1Var2.b += 32;
        U = yj1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h7(b7 b7Var) {
        this.k = b7Var;
        Object systemService = b7Var.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.n = (AccessibilityManager) systemService;
        this.o = 100L;
        new Handler(Looper.getMainLooper());
        this.q = new c7(this);
        this.r = Integer.MIN_VALUE;
        this.s = Integer.MIN_VALUE;
        this.w = new zj1();
        this.x = new zj1();
        this.y = new nt2();
        this.z = new nt2();
        this.A = -1;
        this.C = new jg();
        int i = 1;
        this.D = fg1.a(1, 6, null);
        this.E = true;
        zj1 zj1Var = y01.a;
        zj1Var.getClass();
        this.G = zj1Var;
        this.H = new ak1();
        this.I = new xj1();
        this.J = new xj1();
        this.K = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.L = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.M = new vu2(2);
        this.N = new zj1();
        this.O = new rn2(b7Var.getSemanticsOwner().a(), zj1Var);
        int i2 = u01.a;
        this.Q = new xj1();
        b7Var.addOnAttachStateChangeListener(this);
        this.R = new m2(i, this);
        this.S = new ArrayList();
        this.T = new g7(this, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Rect E(te teVar, float f, float f2) {
        if (!(teVar instanceof tv1) && !(teVar instanceof uv1)) {
            return null;
        }
        o62 o62VarD = teVar.D();
        return new Rect((int) (o62VarD.a + f), (int) (o62VarD.b + f2), (int) (o62VarD.c + f), (int) (o62VarD.d + f2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float[] G(te teVar) {
        if (!(teVar instanceof uv1)) {
            return null;
        }
        db2 db2Var = ((uv1) teVar).j;
        long j = db2Var.h;
        long j2 = db2Var.g;
        long j3 = db2Var.f;
        long j4 = db2Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Region H(te teVar, float f, float f2) {
        if (teVar instanceof sv1) {
            sv1 sv1Var = (sv1) teVar;
            o62 o62VarH = sv1Var.D().h(f, f2);
            Region region = new Region(new Rect((int) (o62VarH.a + 0.0f), (int) (o62VarH.b + 0.0f), (int) (o62VarH.c + 0.0f), (int) (o62VarH.d + 0.0f)));
            Region region2 = new Region();
            y9 y9Var = sv1Var.j;
            if (y9Var instanceof y9) {
                Path path = y9Var.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            c80.t("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static CharSequence I(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String m(qn2 qn2Var) {
        sd sdVar;
        if (qn2Var != null) {
            ln2 ln2Var = qn2Var.d;
            rk1 rk1Var = ln2Var.h;
            yn2 yn2Var = vn2.a;
            if (rk1Var.c(yn2Var)) {
                return sb1.a((List) ln2Var.c(yn2Var), ",", null, 62);
            }
            yn2 yn2Var2 = vn2.G;
            if (rk1Var.c(yn2Var2)) {
                Object objG = rk1Var.g(yn2Var2);
                if (objG == null) {
                    objG = null;
                }
                sd sdVar2 = (sd) objG;
                if (sdVar2 != null) {
                    return sdVar2.i;
                }
            } else {
                Object objG2 = rk1Var.g(vn2.C);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (sdVar = (sd) du.q0(list)) != null) {
                    return sdVar.i;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean q(el2 el2Var, float f) {
        xm0 xm0Var = el2Var.a;
        if (f >= 0.0f || ((Number) xm0Var.a()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) xm0Var.a()).floatValue() < ((Number) el2Var.b.a()).floatValue();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean r(el2 el2Var) {
        xm0 xm0Var = el2Var.a;
        if (((Number) xm0Var.a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) xm0Var.a()).floatValue();
        ((Number) el2Var.b.a()).floatValue();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean s(el2 el2Var) {
        xm0 xm0Var = el2Var.a;
        if (((Number) xm0Var.a()).floatValue() < ((Number) el2Var.b.a()).floatValue()) {
            return true;
        }
        ((Number) xm0Var.a()).floatValue();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void x(h7 h7Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        h7Var.w(i, i2, num, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(x01 x01Var) {
        Integer num;
        Integer num2;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i2;
        int i3;
        Integer num4;
        ln2 ln2Var;
        qn2 qn2Var;
        int i4;
        int i5;
        int i6;
        rk1 rk1Var;
        int i7;
        int i8;
        ln2 ln2Var2;
        Integer num5;
        ArrayList arrayList3;
        int i9;
        long j;
        int i10;
        Integer num6;
        int i11;
        rk1 rk1Var2;
        qn2 qn2Var2;
        int i12;
        jl2 jl2Var;
        int i13;
        int i14;
        jl2 jl2Var2;
        int i15;
        un0 un0Var;
        int i16;
        String str;
        Integer num7;
        int i17;
        int i18;
        Integer num8;
        AccessibilityEvent accessibilityEventI;
        x01 x01Var2 = x01Var;
        Integer num9 = 64;
        ArrayList arrayList4 = this.S;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = x01Var2.b;
        long[] jArr3 = x01Var2.a;
        int i19 = 2;
        int length = jArr3.length - 2;
        int i20 = 0;
        Integer num10 = 0;
        if (length < 0) {
            return;
        }
        int i21 = 0;
        while (true) {
            long j2 = jArr3[i21];
            int i22 = i19;
            int i23 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i24 = 8;
                int i25 = 8 - ((~(i21 - i23)) >>> 31);
                long j3 = j2;
                int i26 = i20;
                while (i26 < i25) {
                    if ((j3 & 255) < 128) {
                        int i27 = iArr3[(i21 << 3) + i26];
                        rn2 rn2Var = (rn2) this.N.b(i27);
                        if (rn2Var == null) {
                            i = i26;
                            num3 = num9;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i2 = i24;
                            i3 = i25;
                            num4 = num10;
                        } else {
                            ln2 ln2Var3 = rn2Var.a;
                            rk1 rk1Var3 = ln2Var3.h;
                            sn2 sn2Var = (sn2) x01Var2.b(i27);
                            qn2 qn2Var3 = sn2Var != null ? sn2Var.a : null;
                            if (qn2Var3 == null) {
                                throw vi0.e("no value for specified key");
                            }
                            int i28 = i24;
                            int i29 = qn2Var3.f;
                            ln2 ln2Var4 = qn2Var3.d;
                            iArr2 = iArr3;
                            rk1 rk1Var4 = ln2Var4.h;
                            jArr2 = jArr3;
                            Object[] objArr = rk1Var4.b;
                            Object[] objArr2 = rk1Var4.c;
                            long[] jArr4 = rk1Var4.a;
                            i = i26;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                i3 = i25;
                                qn2 qn2Var4 = qn2Var3;
                                int i30 = 0;
                                i5 = 0;
                                while (true) {
                                    int i31 = 1;
                                    long j4 = jArr4[i30];
                                    int i32 = i30;
                                    int i33 = i29;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i34 = 8 - ((~(i32 - length2)) >>> 31);
                                        int i35 = 0;
                                        while (i35 < i34) {
                                            if ((j4 & 255) < 128) {
                                                int i36 = (i32 << 3) + i35;
                                                Object obj = objArr[i36];
                                                int i37 = length2;
                                                Object obj2 = objArr2[i36];
                                                ln2Var2 = ln2Var3;
                                                yn2 yn2Var = (yn2) obj;
                                                i9 = i35;
                                                yn2 yn2Var2 = vn2.v;
                                                if (t11.l(yn2Var, yn2Var2)) {
                                                    j = j4;
                                                } else {
                                                    j = j4;
                                                    if (!t11.l(yn2Var, vn2.w)) {
                                                        i13 = 0;
                                                    }
                                                    if (i13 != 0) {
                                                        yn2 yn2Var3 = vn2.d;
                                                        if (t11.l(yn2Var, yn2Var3)) {
                                                            obj2.getClass();
                                                            String str2 = (String) obj2;
                                                            boolean zC = rk1Var3.c(yn2Var3);
                                                            int i38 = i28;
                                                            if (zC) {
                                                                y(str2, i27, i38);
                                                            }
                                                        } else {
                                                            int i39 = i28;
                                                            if (t11.l(yn2Var, vn2.b)) {
                                                                x(this, t(i27), 2048, num9, i39);
                                                                x(this, t(i27), 2048, num10, i39);
                                                            } else if (t11.l(yn2Var, vn2.K)) {
                                                                x(this, t(i27), 2048, 8192, 8);
                                                                x(this, t(i27), 2048, num10, 8);
                                                            } else if (t11.l(yn2Var, vn2.M)) {
                                                                x(this, t(i27), 2048, 3072, 8);
                                                            } else if (t11.l(yn2Var, vn2.c)) {
                                                                x(this, t(i27), 2048, num9, 8);
                                                                x(this, t(i27), 2048, num10, 8);
                                                            } else if (t11.l(yn2Var, vn2.J)) {
                                                                Object objG = rk1Var4.g(vn2.z);
                                                                if (objG == null) {
                                                                    objG = null;
                                                                }
                                                                x(this, t(i27), 2048, num9, 8);
                                                                x(this, t(i27), 2048, num10, 8);
                                                            } else if (t11.l(yn2Var, vn2.a)) {
                                                                int iT = t(i27);
                                                                obj2.getClass();
                                                                w(iT, 2048, 4, (List) obj2);
                                                            } else {
                                                                yn2 yn2Var4 = vn2.G;
                                                                String str3 = "";
                                                                if (t11.l(yn2Var, yn2Var4)) {
                                                                    if (rk1Var4.c(kn2.k)) {
                                                                        Object objG2 = rk1Var3.g(yn2Var4);
                                                                        if (objG2 == null) {
                                                                            objG2 = null;
                                                                        }
                                                                        sd sdVar = (sd) objG2;
                                                                        if (sdVar == null) {
                                                                            sdVar = "";
                                                                        }
                                                                        Object objG3 = rk1Var4.g(yn2Var4);
                                                                        if (objG3 == null) {
                                                                            objG3 = null;
                                                                        }
                                                                        CharSequence charSequence = (sd) objG3;
                                                                        if (charSequence == null) {
                                                                            charSequence = "";
                                                                        }
                                                                        CharSequence charSequenceI = I(charSequence);
                                                                        int length3 = sdVar.length();
                                                                        int length4 = charSequence.length();
                                                                        Integer num11 = num10;
                                                                        int i40 = length3 > length4 ? length4 : length3;
                                                                        num5 = num9;
                                                                        int i41 = 0;
                                                                        while (true) {
                                                                            i17 = i40;
                                                                            if (i41 >= i40) {
                                                                                arrayList3 = arrayList5;
                                                                                break;
                                                                            }
                                                                            arrayList3 = arrayList5;
                                                                            if (sdVar.charAt(i41) != charSequence.charAt(i41)) {
                                                                                break;
                                                                            }
                                                                            i41++;
                                                                            i40 = i17;
                                                                            arrayList5 = arrayList3;
                                                                        }
                                                                        int i42 = 0;
                                                                        while (true) {
                                                                            if (i42 >= i17 - i41) {
                                                                                i18 = i42;
                                                                                break;
                                                                            }
                                                                            i18 = i42;
                                                                            if (sdVar.charAt((length3 - 1) - i42) != charSequence.charAt((length4 - 1) - i18)) {
                                                                                break;
                                                                            } else {
                                                                                i42 = i18 + 1;
                                                                            }
                                                                        }
                                                                        int i43 = (length3 - i18) - i41;
                                                                        int i44 = (length4 - i18) - i41;
                                                                        yn2 yn2Var5 = vn2.L;
                                                                        boolean zC2 = rk1Var3.c(yn2Var5);
                                                                        boolean zC3 = rk1Var4.c(yn2Var5);
                                                                        boolean zC4 = rk1Var3.c(vn2.G);
                                                                        int i45 = (zC4 && !zC2 && zC3) ? i31 : 0;
                                                                        int i46 = (zC4 && zC2 && !zC3) ? i31 : 0;
                                                                        if (i45 == 0 && i46 == 0) {
                                                                            accessibilityEventI = h(t(i27), 16);
                                                                            accessibilityEventI.setFromIndex(i41);
                                                                            accessibilityEventI.setRemovedCount(i43);
                                                                            accessibilityEventI.setAddedCount(i44);
                                                                            accessibilityEventI.setBeforeText(sdVar);
                                                                            accessibilityEventI.getText().add(charSequenceI);
                                                                            i11 = i27;
                                                                            rk1Var2 = rk1Var3;
                                                                            num8 = num11;
                                                                        } else {
                                                                            int iT2 = t(i27);
                                                                            Integer numValueOf = Integer.valueOf(length4);
                                                                            i11 = i27;
                                                                            rk1Var2 = rk1Var3;
                                                                            num8 = num11;
                                                                            accessibilityEventI = i(iT2, num8, num11, numValueOf, charSequenceI);
                                                                        }
                                                                        accessibilityEventI.setClassName("android.widget.EditText");
                                                                        v(accessibilityEventI);
                                                                        if (i45 == 0 && i46 == 0) {
                                                                            num7 = num8;
                                                                        } else {
                                                                            num7 = num8;
                                                                            long j5 = ((f13) ln2Var4.c(vn2.H)).a;
                                                                            accessibilityEventI.setFromIndex((int) (j5 >> 32));
                                                                            accessibilityEventI.setToIndex((int) (j5 & 4294967295L));
                                                                            v(accessibilityEventI);
                                                                        }
                                                                    } else {
                                                                        num7 = num10;
                                                                        rk1Var2 = rk1Var3;
                                                                        num5 = num9;
                                                                        arrayList3 = arrayList5;
                                                                        i11 = i27;
                                                                        x(this, t(i11), 2048, Integer.valueOf(i22), 8);
                                                                    }
                                                                    qn2Var2 = qn2Var4;
                                                                    i12 = i33;
                                                                    i10 = i37;
                                                                    num6 = num7;
                                                                } else {
                                                                    Integer num12 = num10;
                                                                    rk1Var2 = rk1Var3;
                                                                    num5 = num9;
                                                                    arrayList3 = arrayList5;
                                                                    i10 = i37;
                                                                    i11 = i27;
                                                                    yn2 yn2Var6 = vn2.H;
                                                                    if (t11.l(yn2Var, yn2Var6)) {
                                                                        Object objG4 = rk1Var4.g(yn2Var4);
                                                                        if (objG4 == null) {
                                                                            objG4 = null;
                                                                        }
                                                                        sd sdVar2 = (sd) objG4;
                                                                        if (sdVar2 != null && (str = sdVar2.i) != null) {
                                                                            str3 = str;
                                                                        }
                                                                        long j6 = ((f13) ln2Var4.c(yn2Var6)).a;
                                                                        num6 = num12;
                                                                        v(i(t(i11), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str3.length()), I(str3)));
                                                                        i12 = i33;
                                                                        z(i12);
                                                                    } else {
                                                                        i12 = i33;
                                                                        num6 = num12;
                                                                        if (t11.l(yn2Var, yn2Var2)) {
                                                                            i14 = 0;
                                                                            qn2Var2 = qn2Var4;
                                                                        } else if (t11.l(yn2Var, vn2.w)) {
                                                                            qn2Var2 = qn2Var4;
                                                                            i14 = 0;
                                                                        } else if (t11.l(yn2Var, vn2.l)) {
                                                                            obj2.getClass();
                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                i16 = 8;
                                                                                v(h(t(i12), 8));
                                                                            } else {
                                                                                i16 = 8;
                                                                            }
                                                                            x(this, t(i12), 2048, num6, i16);
                                                                        } else {
                                                                            yn2 yn2Var7 = kn2.x;
                                                                            if (t11.l(yn2Var, yn2Var7)) {
                                                                                List list = (List) ln2Var4.c(yn2Var7);
                                                                                Object objG5 = rk1Var2.g(yn2Var7);
                                                                                if (objG5 == null) {
                                                                                    objG5 = null;
                                                                                }
                                                                                List list2 = (List) objG5;
                                                                                if (list2 != null) {
                                                                                    sk1 sk1Var = fd2.a;
                                                                                    sk1 sk1Var2 = new sk1();
                                                                                    if (list.size() > 0) {
                                                                                        list.get(0).getClass();
                                                                                        c80.g();
                                                                                        return;
                                                                                    }
                                                                                    sk1 sk1Var3 = new sk1();
                                                                                    if (list2.size() > 0) {
                                                                                        list2.get(0).getClass();
                                                                                        c80.g();
                                                                                        return;
                                                                                    }
                                                                                    i5 = !sk1Var2.equals(sk1Var3) ? 1 : 0;
                                                                                } else if (!list.isEmpty()) {
                                                                                    i5 = i31;
                                                                                }
                                                                            } else if (obj2 instanceof q3) {
                                                                                q3 q3Var = (q3) obj2;
                                                                                Object objG6 = rk1Var2.g(yn2Var);
                                                                                if (objG6 == null) {
                                                                                    objG6 = null;
                                                                                }
                                                                                if (q3Var != objG6) {
                                                                                    if (objG6 instanceof q3) {
                                                                                        String str4 = q3Var.a;
                                                                                        q3 q3Var2 = (q3) objG6;
                                                                                        un0 un0Var2 = q3Var2.b;
                                                                                        if (t11.l(str4, q3Var2.a) && (((un0Var = q3Var.b) != null || un0Var2 == null) && (un0Var == null || un0Var2 != null))) {
                                                                                            i15 = i31;
                                                                                        }
                                                                                        if (i15 == 0) {
                                                                                            i5 = 0;
                                                                                        }
                                                                                    }
                                                                                    i15 = 0;
                                                                                    if (i15 == 0) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        p(qn2Var2.c);
                                                                        int size = arrayList4.size();
                                                                        int i47 = i14;
                                                                        while (true) {
                                                                            if (i47 >= size) {
                                                                                jl2Var2 = null;
                                                                                break;
                                                                            } else {
                                                                                if (((jl2) arrayList4.get(i47)).h == i11) {
                                                                                    jl2Var2 = (jl2) arrayList4.get(i47);
                                                                                    break;
                                                                                }
                                                                                i47++;
                                                                            }
                                                                        }
                                                                        jl2Var2.getClass();
                                                                        Object objG7 = rk1Var4.g(yn2Var2);
                                                                        if (objG7 == null) {
                                                                            objG7 = null;
                                                                        }
                                                                        jl2Var2.l = (el2) objG7;
                                                                        Object objG8 = rk1Var4.g(vn2.w);
                                                                        if (objG8 == null) {
                                                                            objG8 = null;
                                                                        }
                                                                        jl2Var2.m = (el2) objG8;
                                                                        if (jl2Var2.i.contains(jl2Var2)) {
                                                                            this.k.getSnapshotObserver().a.c(jl2Var2, this.T, new t6(i31, jl2Var2, this));
                                                                        }
                                                                    }
                                                                    qn2Var2 = qn2Var4;
                                                                }
                                                            }
                                                        }
                                                        num6 = num10;
                                                        rk1Var2 = rk1Var3;
                                                        num5 = num9;
                                                        arrayList3 = arrayList5;
                                                        qn2Var2 = qn2Var4;
                                                        i12 = i33;
                                                        i10 = i37;
                                                        i11 = i27;
                                                    } else {
                                                        Object objG9 = rk1Var3.g(yn2Var);
                                                        if (objG9 == null) {
                                                            objG9 = null;
                                                        }
                                                        if (t11.l(obj2, objG9)) {
                                                            num6 = num10;
                                                            rk1Var2 = rk1Var3;
                                                            num5 = num9;
                                                            arrayList3 = arrayList5;
                                                            qn2Var2 = qn2Var4;
                                                            i12 = i33;
                                                            i10 = i37;
                                                            i11 = i27;
                                                        }
                                                    }
                                                }
                                                int size2 = arrayList5.size();
                                                int i48 = 0;
                                                while (true) {
                                                    if (i48 >= size2) {
                                                        jl2Var = null;
                                                        break;
                                                    }
                                                    int i49 = size2;
                                                    if (((jl2) arrayList5.get(i48)).h == i27) {
                                                        jl2Var = (jl2) arrayList5.get(i48);
                                                        break;
                                                    } else {
                                                        i48++;
                                                        size2 = i49;
                                                    }
                                                }
                                                if (jl2Var != null) {
                                                    i13 = 0;
                                                } else {
                                                    jl2Var = new jl2(i27, arrayList4);
                                                    i13 = i31;
                                                }
                                                arrayList4.add(jl2Var);
                                                if (i13 != 0) {
                                                }
                                            } else {
                                                ln2Var2 = ln2Var3;
                                                num5 = num9;
                                                arrayList3 = arrayList5;
                                                i9 = i35;
                                                j = j4;
                                                i10 = length2;
                                                num6 = num10;
                                                i11 = i27;
                                                rk1Var2 = rk1Var3;
                                                qn2Var2 = qn2Var4;
                                                i12 = i33;
                                            }
                                            i35 = i9 + 1;
                                            qn2Var4 = qn2Var2;
                                            i33 = i12;
                                            i28 = 8;
                                            i27 = i11;
                                            length2 = i10;
                                            num10 = num6;
                                            num9 = num5;
                                            arrayList5 = arrayList3;
                                            i31 = 1;
                                            rk1Var3 = rk1Var2;
                                            j4 = j >> 8;
                                            ln2Var3 = ln2Var2;
                                        }
                                        num4 = num10;
                                        ln2Var = ln2Var3;
                                        rk1Var = rk1Var3;
                                        num3 = num9;
                                        arrayList2 = arrayList5;
                                        i7 = i33;
                                        i8 = length2;
                                        i4 = i27;
                                        qn2Var = qn2Var4;
                                        if (i34 != i28) {
                                            break;
                                        }
                                    } else {
                                        num4 = num10;
                                        ln2Var = ln2Var3;
                                        rk1Var = rk1Var3;
                                        num3 = num9;
                                        arrayList2 = arrayList5;
                                        i7 = i33;
                                        i8 = length2;
                                        i4 = i27;
                                        qn2Var = qn2Var4;
                                    }
                                    if (i32 == i8) {
                                        break;
                                    }
                                    i30 = i32 + 1;
                                    qn2Var4 = qn2Var;
                                    i29 = i7;
                                    i27 = i4;
                                    length2 = i8;
                                    num10 = num4;
                                    rk1Var3 = rk1Var;
                                    ln2Var3 = ln2Var;
                                    num9 = num3;
                                    arrayList5 = arrayList2;
                                    i28 = 8;
                                }
                            } else {
                                ln2Var = ln2Var3;
                                num3 = num9;
                                arrayList2 = arrayList5;
                                i3 = i25;
                                qn2Var = qn2Var3;
                                num4 = num10;
                                i4 = i27;
                                i5 = 0;
                            }
                            if (i5 == 0) {
                                Iterator it = ln2Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i6 = 0;
                                        break;
                                    }
                                    if (!qn2Var.k().h.c((yn2) ((Map.Entry) it.next()).getKey())) {
                                        i6 = 1;
                                        break;
                                    }
                                }
                                i5 = i6;
                            }
                            if (i5 != 0) {
                                i2 = 8;
                                x(this, t(i4), 2048, num4, 8);
                            } else {
                                i2 = 8;
                            }
                        }
                    }
                    j3 >>= i2;
                    i26 = i + 1;
                    x01Var2 = x01Var;
                    i24 = i2;
                    num10 = num4;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i25 = i3;
                    num9 = num3;
                    arrayList5 = arrayList2;
                }
                num2 = num9;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i50 = i24;
                int i51 = i25;
                num = num10;
                if (i51 != i50) {
                    return;
                }
            } else {
                num = num10;
                num2 = num9;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
            }
            if (i21 == i23) {
                return;
            }
            i21++;
            x01Var2 = x01Var;
            num10 = num;
            i19 = i22;
            iArr3 = iArr;
            jArr3 = jArr;
            num9 = num2;
            arrayList5 = arrayList;
            i20 = 0;
            length = i23;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(r61 r61Var, ak1 ak1Var) {
        ln2 ln2VarW;
        if (r61Var.H() && !this.k.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(r61Var)) {
            r61 r61Var2 = null;
            if (!r61Var.M.m(8)) {
                r61Var = r61Var.u();
                while (true) {
                    if (r61Var == null) {
                        r61Var = null;
                        break;
                    } else if (r61Var.M.m(8)) {
                        break;
                    } else {
                        r61Var = r61Var.u();
                    }
                }
            }
            if (r61Var == null || (ln2VarW = r61Var.w()) == null) {
                return;
            }
            if (!ln2VarW.j) {
                r61 r61VarU = r61Var.u();
                while (true) {
                    if (r61VarU != null) {
                        ln2 ln2VarW2 = r61VarU.w();
                        if (ln2VarW2 != null && ln2VarW2.j) {
                            r61Var2 = r61VarU;
                            break;
                        }
                        r61VarU = r61VarU.u();
                    } else {
                        break;
                    }
                }
                if (r61Var2 != null) {
                    r61Var = r61Var2;
                }
            }
            int i = r61Var.i;
            if (ak1Var.a(i)) {
                x(this, t(i), 2048, 1, 8);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C(r61 r61Var) {
        if (r61Var.H() && !this.k.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(r61Var)) {
            int i = r61Var.i;
            el2 el2Var = (el2) this.w.b(i);
            el2 el2Var2 = (el2) this.x.b(i);
            if (el2Var == null && el2Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventH = h(i, 4096);
            if (el2Var != null) {
                accessibilityEventH.setScrollX((int) ((Number) el2Var.a.a()).floatValue());
                accessibilityEventH.setMaxScrollX((int) ((Number) el2Var.b.a()).floatValue());
            }
            if (el2Var2 != null) {
                accessibilityEventH.setScrollY((int) ((Number) el2Var2.a.a()).floatValue());
                accessibilityEventH.setMaxScrollY((int) ((Number) el2Var2.b.a()).floatValue());
            }
            v(accessibilityEventH);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean D(qn2 qn2Var, int i, int i2, boolean z) {
        String strM;
        ln2 ln2Var = qn2Var.d;
        int i3 = qn2Var.f;
        yn2 yn2Var = kn2.j;
        if (ln2Var.h.c(yn2Var) && rg3.j(qn2Var)) {
            nn0 nn0Var = (nn0) ((q3) qn2Var.d.c(yn2Var)).b;
            if (nn0Var != null) {
                return ((Boolean) nn0Var.e(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.A) && (strM = m(qn2Var)) != null) {
            if (i < 0 || i != i2 || i2 > strM.length()) {
                i = -1;
            }
            this.A = i;
            boolean z2 = strM.length() > 0;
            v(i(t(i3), z2 ? Integer.valueOf(this.A) : null, z2 ? Integer.valueOf(this.A) : null, z2 ? Integer.valueOf(strM.length()) : null, strM));
            z(i3);
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Rect F(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        b7 b7Var = this.k;
        long jU = b7Var.u(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jU2 = b7Var.u((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jU >> 32);
        int i2 = (int) (jU2 >> 32);
        int i3 = (int) (jU & 4294967295L);
        int i4 = (int) (jU2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v13, resolved type: java.lang.String */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int iNumberOfTrailingZeros;
        char c2;
        ak1 ak1Var = new ak1();
        ak1 ak1Var2 = this.H;
        int[] iArr = ak1Var2.b;
        long[] jArr3 = ak1Var2.a;
        int length = jArr3.length - 2;
        zj1 zj1Var = this.N;
        int i3 = 8;
        if (length >= 0) {
            int i4 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i4];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j5 & 255) < 128) {
                            int i7 = iArr[(i4 << 3) + i6];
                            c2 = c3;
                            sn2 sn2Var = (sn2) l().b(i7);
                            qn2 qn2Var = sn2Var != null ? sn2Var.a : null;
                            if (qn2Var != null) {
                                if (!qn2Var.d.h.c(vn2.d)) {
                                    ak1Var.a(i7);
                                    rn2 rn2Var = (rn2) zj1Var.b(i7);
                                    if (rn2Var != null) {
                                        Object objG = rn2Var.a.h.g(vn2.d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    y(obj, i7, 32);
                                }
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i6++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i4 == length) {
                    break;
                } else {
                    i4++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = ak1Var.b;
        long[] jArr4 = ak1Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j6 = jArr4[i8];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j6 & j2) < j) {
                            int i11 = iArr2[(i8 << 3) + i10];
                            int iHashCode = Integer.hashCode(i11) * (-862048943);
                            int i12 = iHashCode ^ (iHashCode << 16);
                            int i13 = i12 & 127;
                            int i14 = ak1Var2.c;
                            int i15 = (i12 >>> 7) & i14;
                            i = i3;
                            int i16 = 0;
                            while (true) {
                                long[] jArr5 = ak1Var2.a;
                                int i17 = i15 >> 3;
                                jArr2 = jArr4;
                                int i18 = (i15 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i17] >>> i18) | ((jArr5[i17 + 1] << (64 - i18)) & ((-i18) >> 63));
                                int i19 = i14;
                                long j8 = (((long) i13) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j9) >> 3)) & i19;
                                    int i20 = i19;
                                    if (ak1Var2.b[iNumberOfTrailingZeros] == i11) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i19 = i20;
                                }
                                i16 += 8;
                                i15 = (i15 + i16) & i2;
                                jArr4 = jArr2;
                                i14 = i2;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                ak1Var2.f(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i3;
                        }
                        j6 = j4 >> i;
                        i10++;
                        i3 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i9 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                jArr4 = jArr;
                i3 = 8;
            }
        }
        zj1Var.c();
        x01 x01VarL = l();
        int[] iArr3 = x01VarL.b;
        Object[] objArr = x01VarL.c;
        long[] jArr6 = x01VarL.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            qn2 qn2Var2 = ((sn2) objArr[i25]).a;
                            ln2 ln2Var = qn2Var2.d;
                            yn2 yn2Var = vn2.d;
                            if (ln2Var.h.c(yn2Var) && ak1Var2.a(i26)) {
                                y((String) qn2Var2.d.c(yn2Var), i26, 16);
                            }
                            zj1Var.h(i26, new rn2(qn2Var2, l()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.O = new rn2(this.k.getSemanticsOwner().a(), l());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t3
    public final n4 a(View view) {
        return this.q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v16, resolved type: o62 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: o62 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v5, resolved type: o62 */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i, l4 l4Var, String str, Bundle bundle) {
        qn2 qn2Var;
        int i2;
        int i3;
        b7 b7Var;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        sn2 sn2Var = (sn2) l().b(i);
        if (sn2Var == null || (qn2Var = sn2Var.a) == null) {
            return;
        }
        r61 r61Var = qn2Var.c;
        ln2 ln2Var = qn2Var.d;
        rk1 rk1Var = ln2Var.h;
        String strM = m(qn2Var);
        if (t11.l(str, this.K)) {
            int iD = this.I.d(i);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (t11.l(str, this.L)) {
            int iD2 = this.J.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = rk1Var.c(kn2.a);
        b7 b7Var2 = this.k;
        zn1 zn1Var = null;
        if (zC && bundle != null && t11.l(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i5 > 0 && i4 >= 0) {
                if (i4 < (strM != null ? strM.length() : Integer.MAX_VALUE)) {
                    y03 y03VarN = eu.N(ln2Var);
                    if (y03VarN == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i4 + i6;
                        if (i7 >= y03VarN.a.a.i.length()) {
                            arrayList.add(zn1Var);
                            i2 = i4;
                            i3 = i5;
                            b7Var = b7Var2;
                        } else {
                            o62 o62VarB = y03VarN.b(i7);
                            zn1 zn1VarD = qn2Var.d();
                            long jM = 0;
                            if (zn1VarD != null) {
                                if (!zn1VarD.S0().u) {
                                    zn1VarD = zn1Var;
                                }
                                if (zn1VarD != null) {
                                    jM = zn1VarD.M(0L);
                                }
                            }
                            o62 o62VarI = o62VarB.i(jM);
                            o62 o62VarG = qn2Var.g();
                            o62 o62VarE = o62VarI.g(o62VarG) ? o62VarI.e(o62VarG) : zn1Var;
                            if (o62VarE != 0) {
                                long jU = b7Var2.u((((long) Float.floatToRawIntBits(o62VarE.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(o62VarE.a)) << 32));
                                b7Var = b7Var2;
                                long jU2 = b7Var.u((((long) Float.floatToRawIntBits(o62VarE.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(o62VarE.c)) << 32));
                                int i8 = (int) (jU >> 32);
                                i2 = i4;
                                i3 = i5;
                                int i9 = (int) (jU2 >> 32);
                                int i10 = (int) (jU & 4294967295L);
                                int i11 = (int) (jU2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)));
                            } else {
                                i2 = i4;
                                i3 = i5;
                                b7Var = b7Var2;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i6++;
                        i5 = i3;
                        b7Var2 = b7Var;
                        i4 = i2;
                        zn1Var = null;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        yn2 yn2Var = vn2.A;
        if (rk1Var.c(yn2Var) && bundle != null && t11.l(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = rk1Var.g(yn2Var);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (t11.l(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, qn2Var.f);
            return;
        }
        if (t11.l(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = rk1Var.g(vn2.Q);
            eq2 eq2Var = (eq2) (objG2 == null ? null : objG2);
            if (eq2Var != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                o62 o62VarN = n(qn2Var, rect, eq2Var);
                float f = o62VarN.b;
                float f2 = o62VarN.a;
                te teVarA = eq2Var.a(o62VarN.c(), r61Var.G, b7Var2.getDensity());
                if (teVarA instanceof tv1) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", E(teVarA, f2, f));
                    return;
                } else if (teVarA instanceof uv1) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", E(teVarA, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", G(teVarA));
                    return;
                } else if (!(teVarA instanceof sv1)) {
                    c80.s();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", H(teVarA, f2, f));
                    return;
                }
            }
            return;
        }
        if (t11.l(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = rk1Var.g(vn2.Q);
            eq2 eq2Var2 = (eq2) (objG3 == null ? null : objG3);
            if (eq2Var2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                o62 o62VarN2 = n(qn2Var, rect2, eq2Var2);
                Rect rectE = E(eq2Var2.a(o62VarN2.c(), r61Var.G, b7Var2.getDensity()), o62VarN2.a, o62VarN2.b);
                if (rectE != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectE);
                    return;
                }
                return;
            }
            return;
        }
        if (t11.l(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = rk1Var.g(vn2.Q);
            eq2 eq2Var3 = (eq2) (objG4 == null ? null : objG4);
            if (eq2Var3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrG = G(eq2Var3.a(n(qn2Var, rect3, eq2Var3).c(), r61Var.G, b7Var2.getDensity()));
                if (fArrG != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrG);
                    return;
                }
                return;
            }
            return;
        }
        if (t11.l(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = rk1Var.g(vn2.Q);
            eq2 eq2Var4 = (eq2) (objG5 == null ? null : objG5);
            if (eq2Var4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                o62 o62VarN3 = n(qn2Var, rect4, eq2Var4);
                Region regionH = H(eq2Var4.a(o62VarN3.c(), r61Var.G, b7Var2.getDensity()), o62VarN3.a, o62VarN3.b);
                if (regionH != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionH);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Rect d(sn2 sn2Var) {
        d11 d11Var = sn2Var.b;
        return F(d11Var.a, d11Var.b, d11Var.c, d11Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f7, code lost:
    
        if (defpackage.eu.F(r4, r2) == r7) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:34:0x0085, B:35:0x0094, B:37:0x009c, B:20:0x0046, B:23:0x004d), top: B:56:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f7 -> B:51:0x00fa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(u00 u00Var) throws Throwable {
        e7 e7Var;
        jg jgVar;
        ak1 ak1Var;
        in inVar;
        ak1 ak1Var2;
        in inVar2;
        int i;
        long j;
        Object objB;
        if (u00Var instanceof e7) {
            e7Var = (e7) u00Var;
            int i2 = e7Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e7Var.o = i2 - Integer.MIN_VALUE;
            } else {
                e7Var = new e7(this, u00Var);
            }
        }
        Object obj = e7Var.m;
        int i3 = e7Var.o;
        jg jgVar2 = this.C;
        k20 k20Var = k20.h;
        try {
            if (i3 == 0) {
                fg1.T(obj);
                ak1Var = new ak1();
                jn jnVar = this.D;
                jnVar.getClass();
                inVar = new in(jnVar);
                e7Var.k = ak1Var;
                e7Var.l = inVar;
                e7Var.o = 1;
                objB = inVar.b(e7Var);
                if (objB != k20Var) {
                }
            } else if (i3 == 1) {
                inVar2 = e7Var.l;
                ak1Var2 = e7Var.k;
                fg1.T(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i3 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                inVar2 = e7Var.l;
                ak1Var2 = e7Var.k;
                fg1.T(obj);
                char c = 2;
                jgVar = jgVar2;
                ak1Var = ak1Var2;
                jgVar2 = jgVar;
                inVar = inVar2;
                e7Var.k = ak1Var;
                e7Var.l = inVar;
                e7Var.o = 1;
                objB = inVar.b(e7Var);
                if (objB != k20Var) {
                    return k20Var;
                }
                in inVar3 = inVar;
                ak1Var2 = ak1Var;
                obj = objB;
                inVar2 = inVar3;
                if (((Boolean) obj).booleanValue()) {
                    jgVar2.clear();
                    return a83.a;
                }
                inVar2.c();
                if (o()) {
                    int i4 = jgVar2.j;
                    for (int i5 = 0; i5 < i4; i5++) {
                        r61 r61Var = (r61) jgVar2.i[i5];
                        B(r61Var, ak1Var2);
                        C(r61Var);
                    }
                    ak1Var2.d = 0;
                    long[] jArr = ak1Var2.a;
                    if (jArr != ed2.a) {
                        try {
                            mg.j0(-9187201950435737472L, jArr);
                            long[] jArr2 = ak1Var2.a;
                            i = ak1Var2.c;
                            int i6 = i >> 3;
                            jArr2[i6] = ((~j) & jArr2[i6]) | j;
                        } catch (Throwable th) {
                            th = th;
                            jgVar.clear();
                            throw th;
                        }
                        j = 255 << ((i & 7) << 3);
                        jgVar = jgVar2;
                    } else {
                        jgVar = jgVar2;
                    }
                    ak1Var2.e = ed2.a(ak1Var2.c) - ak1Var2.d;
                    Handler handler = this.k.getHandler();
                    if (!this.P && handler != null) {
                        this.P = true;
                        handler.post(this.R);
                    }
                } else {
                    jgVar = jgVar2;
                }
                jgVar.clear();
                this.w.c();
                this.x.c();
                long j2 = this.o;
                e7Var.k = ak1Var2;
                e7Var.l = inVar2;
                c = 2;
                e7Var.o = 2;
            }
        } catch (Throwable th2) {
            th = th2;
            jgVar = jgVar2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(boolean z, int i, long j) {
        yn2 yn2Var;
        int i2;
        if (t11.l(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            x01 x01VarL = l();
            if (!rs1.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    yn2Var = vn2.w;
                } else {
                    if (z) {
                        c80.s();
                        return false;
                    }
                    yn2Var = vn2.v;
                }
                Object[] objArr = x01VarL.c;
                long[] jArr = x01VarL.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    sn2 sn2Var = (sn2) objArr[(i3 << 3) + i6];
                                    d11 d11Var = sn2Var.b;
                                    float f = d11Var.a;
                                    i2 = i4;
                                    float f2 = d11Var.b;
                                    float f3 = d11Var.c;
                                    float f4 = d11Var.d;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                                        Object objG = sn2Var.a.d.h.g(yn2Var);
                                        if (objG == null) {
                                            objG = null;
                                        }
                                        el2 el2Var = (el2) objG;
                                        if (el2Var != null) {
                                            xm0 xm0Var = el2Var.a;
                                            if (i < 0) {
                                                if (((Number) xm0Var.a()).floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (((Number) xm0Var.a()).floatValue() < ((Number) el2Var.b.a()).floatValue()) {
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (o()) {
                u(this.k.getSemanticsOwner().a(), this.O);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                A(l());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    J();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AccessibilityEvent h(int i, int i2) {
        sn2 sn2Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        b7 b7Var = this.k;
        accessibilityEventObtain.setPackageName(b7Var.getContext().getPackageName());
        accessibilityEventObtain.setSource(b7Var, i);
        if (o() && (sn2Var = (sn2) l().b(i)) != null) {
            qn2 qn2Var = sn2Var.a;
            accessibilityEventObtain.setPassword(qn2Var.d.h.c(vn2.L));
            Object objG = qn2Var.d.h.g(vn2.o);
            if (objG == null) {
                objG = null;
            }
            boolean zL = t11.l(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                u3.f(accessibilityEventObtain, zL);
            }
        }
        return accessibilityEventObtain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AccessibilityEvent i(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventH = h(i, 8192);
        if (num != null) {
            accessibilityEventH.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventH.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventH.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventH.getText().add(charSequence);
        }
        return accessibilityEventH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int j(qn2 qn2Var) {
        ln2 ln2Var = qn2Var.d;
        if (!ln2Var.h.c(vn2.a)) {
            yn2 yn2Var = vn2.H;
            if (ln2Var.h.c(yn2Var)) {
                return (int) (((f13) ln2Var.c(yn2Var)).a & 4294967295L);
            }
        }
        return this.A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int k(qn2 qn2Var) {
        ln2 ln2Var = qn2Var.d;
        if (!ln2Var.h.c(vn2.a)) {
            yn2 yn2Var = vn2.H;
            if (ln2Var.h.c(yn2Var)) {
                return (int) (((f13) ln2Var.c(yn2Var)).a >> 32);
            }
        }
        return this.A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final x01 l() {
        if (this.E) {
            this.E = false;
            b7 b7Var = this.k;
            this.G = xe1.v(b7Var.getSemanticsOwner(), v6.k);
            if (o()) {
                zj1 zj1Var = this.G;
                Resources resources = b7Var.getContext().getResources();
                xj1 xj1Var = this.I;
                xj1Var.a();
                xj1 xj1Var2 = this.J;
                xj1Var2.a();
                sn2 sn2Var = (sn2) zj1Var.b(-1);
                qn2 qn2Var = sn2Var != null ? sn2Var.a : null;
                qn2Var.getClass();
                ArrayList arrayListB = ao2.b(qn2Var, new v5(3, zj1Var), new v5(4, resources), eu.O(qn2Var));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((qn2) arrayListB.get(i - 1)).f;
                        int i3 = ((qn2) arrayListB.get(i)).f;
                        xj1Var.f(i2, i3);
                        xj1Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[LOOP:0: B:4:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0075], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o62 n(qn2 qn2Var, Rect rect, eq2 eq2Var) {
        f7 f7Var = new f7(eq2Var);
        r61 r61Var = qn2Var.c;
        th1 th1Var = (th1) r61Var.M.g;
        t60 t60Var = null;
        if ((th1Var.k & 8) != 0) {
            loop0: while (true) {
                if (th1Var == null) {
                    break;
                }
                if ((th1Var.j & 8) != 0) {
                    th1 th1VarM = th1Var;
                    zk1 zk1Var = null;
                    while (th1VarM != null) {
                        if (th1VarM instanceof on2) {
                            ((on2) th1VarM).l0(f7Var);
                            if (f7Var.h) {
                                t60Var = th1VarM;
                                break loop0;
                            }
                        } else if ((th1VarM.j & 8) != 0 && (th1VarM instanceof u60)) {
                            int i = 0;
                            for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                if ((th1Var2.j & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        th1VarM = th1Var2;
                                    } else {
                                        if (zk1Var == null) {
                                            zk1Var = new zk1(new th1[16]);
                                        }
                                        if (th1VarM != null) {
                                            zk1Var.b(th1VarM);
                                            th1VarM = null;
                                        }
                                        zk1Var.b(th1Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        th1VarM = sp0.m(zk1Var);
                    }
                    if ((th1Var.k & 8) != 0) {
                        break;
                    }
                    th1Var = th1Var.m;
                } else if ((th1Var.k & 8) != 0) {
                }
            }
        }
        t60 t60Var2 = (on2) t60Var;
        if (t60Var2 == null || !((th1) t60Var2).h.u) {
            return s11.w((zn1) r61Var.M.e, false);
        }
        zn1 zn1VarB0 = sp0.b0(t60Var2);
        o62 o62VarJ = s11.J(zn1VarB0).J(zn1VarB0, false);
        Rect rectF = F(o62VarJ.a, o62VarJ.b, o62VarJ.c, o62VarJ.d);
        float f = rectF.left - rect.left;
        float f2 = rectF.top - rect.top;
        return new o62(f, f2, rectF.width() + f, rectF.height() + f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean o() {
        AccessibilityManager accessibilityManager = this.n;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.p;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.p = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.p = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.p = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.n;
        if (accessibilityManager.isEnabled()) {
            this.p = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.k.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.R);
        AccessibilityManager accessibilityManager = this.n;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(r61 r61Var) {
        if (this.C.add(r61Var)) {
            this.D.s(a83.a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int t(int i) {
        if (i == this.k.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: qn2.j(int, qn2):java.util.List */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(qn2 qn2Var, rn2 rn2Var) {
        int[] iArr = g11.a;
        ak1 ak1Var = new ak1();
        List listJ = qn2.j(4, qn2Var);
        r61 r61Var = qn2Var.c;
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            qn2 qn2Var2 = (qn2) listJ.get(i);
            x01 x01VarL = l();
            int i2 = qn2Var2.f;
            if (x01VarL.a(i2)) {
                if (!rn2Var.b.b(i2)) {
                    p(r61Var);
                    return;
                }
                ak1Var.a(i2);
            }
        }
        ak1 ak1Var2 = rn2Var.b;
        int[] iArr2 = ak1Var2.b;
        long[] jArr = ak1Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !ak1Var.b(iArr2[(i3 << 3) + i5])) {
                            p(r61Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listJ2 = qn2.j(4, qn2Var);
        int size2 = listJ2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            qn2 qn2Var3 = (qn2) listJ2.get(i6);
            rn2 rn2Var2 = (rn2) this.N.b(qn2Var3.f);
            if (rn2Var2 != null && l().a(qn2Var3.f)) {
                u(qn2Var3, rn2Var2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean v(AccessibilityEvent accessibilityEvent) {
        if (!o()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.v = true;
        }
        try {
            return ((Boolean) this.m.j(accessibilityEvent)).booleanValue();
        } finally {
            this.v = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean w(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !o()) {
            return false;
        }
        AccessibilityEvent accessibilityEventH = h(i, i2);
        if (num != null) {
            accessibilityEventH.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventH.setContentDescription(sb1.a(list, ",", null, 62));
        }
        return v(accessibilityEventH);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y(String str, int i, int i2) {
        AccessibilityEvent accessibilityEventH = h(t(i), 32);
        accessibilityEventH.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventH.getText().add(str);
        }
        v(accessibilityEventH);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z(int i) {
        d7 d7Var = this.F;
        if (d7Var != null) {
            qn2 qn2Var = d7Var.a;
            if (i != qn2Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - d7Var.f <= 1000) {
                AccessibilityEvent accessibilityEventH = h(t(qn2Var.f), 131072);
                accessibilityEventH.setFromIndex(d7Var.d);
                accessibilityEventH.setToIndex(d7Var.e);
                accessibilityEventH.setAction(d7Var.b);
                accessibilityEventH.setMovementGranularity(d7Var.c);
                accessibilityEventH.getText().add(m(qn2Var));
                v(accessibilityEventH);
            }
        }
        this.F = null;
    }
}
