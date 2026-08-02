package p000;

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

/* JADX INFO: renamed from: h7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0267h7 extends AbstractC0720t3 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: U */
    public static final yj1 f3843U;

    /* JADX INFO: renamed from: A */
    public int f3844A;

    /* JADX INFO: renamed from: B */
    public Integer f3845B;

    /* JADX INFO: renamed from: C */
    public final C0349jg f3846C;

    /* JADX INFO: renamed from: D */
    public final C0356jn f3847D;

    /* JADX INFO: renamed from: E */
    public boolean f3848E;

    /* JADX INFO: renamed from: F */
    public C0120d7 f3849F;

    /* JADX INFO: renamed from: G */
    public zj1 f3850G;

    /* JADX INFO: renamed from: H */
    public final ak1 f3851H;

    /* JADX INFO: renamed from: I */
    public final xj1 f3852I;

    /* JADX INFO: renamed from: J */
    public final xj1 f3853J;

    /* JADX INFO: renamed from: K */
    public final String f3854K;

    /* JADX INFO: renamed from: L */
    public final String f3855L;

    /* JADX INFO: renamed from: M */
    public final vu2 f3856M;

    /* JADX INFO: renamed from: N */
    public final zj1 f3857N;

    /* JADX INFO: renamed from: O */
    public rn2 f3858O;

    /* JADX INFO: renamed from: P */
    public boolean f3859P;

    /* JADX INFO: renamed from: Q */
    public final xj1 f3860Q;

    /* JADX INFO: renamed from: R */
    public final RunnableC0446m2 f3861R;

    /* JADX INFO: renamed from: S */
    public final ArrayList f3862S;

    /* JADX INFO: renamed from: T */
    public final C0230g7 f3863T;

    /* JADX INFO: renamed from: k */
    public final ViewTreeObserverOnGlobalLayoutListenerC0045b7 f3864k;

    /* JADX INFO: renamed from: l */
    public int f3865l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    public final C0230g7 f3866m = new C0230g7(this, 0);

    /* JADX INFO: renamed from: n */
    public final AccessibilityManager f3867n;

    /* JADX INFO: renamed from: o */
    public long f3868o;

    /* JADX INFO: renamed from: p */
    public List f3869p;

    /* JADX INFO: renamed from: q */
    public final C0081c7 f3870q;

    /* JADX INFO: renamed from: r */
    public int f3871r;

    /* JADX INFO: renamed from: s */
    public int f3872s;

    /* JADX INFO: renamed from: t */
    public C0411l4 f3873t;

    /* JADX INFO: renamed from: u */
    public C0411l4 f3874u;

    /* JADX INFO: renamed from: v */
    public boolean f3875v;

    /* JADX INFO: renamed from: w */
    public final zj1 f3876w;

    /* JADX INFO: renamed from: x */
    public final zj1 f3877x;

    /* JADX INFO: renamed from: y */
    public final nt2 f3878y;

    /* JADX INFO: renamed from: z */
    public final nt2 f3879z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        yj1 yj1Var = w01.f12239a;
        yj1 yj1Var2 = new yj1(32);
        int i = yj1Var2.f13491b;
        if (i < 0) {
            C0676s.m4646d("");
            return;
        }
        int i2 = i + 32;
        yj1Var2.m6282b(i2);
        int[] iArr2 = yj1Var2.f13490a;
        int i3 = yj1Var2.f13491b;
        if (i != i3) {
            AbstractC0460mg.m3086a0(iArr2, iArr2, i2, i, i3);
        }
        AbstractC0460mg.m3090e0(iArr, iArr2, i, 0, 12);
        yj1Var2.f13491b += 32;
        f3843U = yj1Var2;
    }

    public ViewOnAttachStateChangeListenerC0267h7(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7) {
        this.f3864k = viewTreeObserverOnGlobalLayoutListenerC0045b7;
        Object systemService = viewTreeObserverOnGlobalLayoutListenerC0045b7.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.f3867n = (AccessibilityManager) systemService;
        this.f3868o = 100L;
        new Handler(Looper.getMainLooper());
        this.f3870q = new C0081c7(this);
        this.f3871r = Integer.MIN_VALUE;
        this.f3872s = Integer.MIN_VALUE;
        this.f3876w = new zj1();
        this.f3877x = new zj1();
        this.f3878y = new nt2();
        this.f3879z = new nt2();
        this.f3844A = -1;
        this.f3846C = new C0349jg();
        int i = 1;
        this.f3847D = fg1.m1630a(1, 6, null);
        this.f3848E = true;
        zj1 zj1Var = y01.f13265a;
        zj1Var.getClass();
        this.f3850G = zj1Var;
        this.f3851H = new ak1();
        this.f3852I = new xj1();
        this.f3853J = new xj1();
        this.f3854K = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f3855L = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f3856M = new vu2(2);
        this.f3857N = new zj1();
        this.f3858O = new rn2(viewTreeObserverOnGlobalLayoutListenerC0045b7.getSemanticsOwner().m5334a(), zj1Var);
        int i2 = u01.f11031a;
        this.f3860Q = new xj1();
        viewTreeObserverOnGlobalLayoutListenerC0045b7.addOnAttachStateChangeListener(this);
        this.f3861R = new RunnableC0446m2(i, this);
        this.f3862S = new ArrayList();
        this.f3863T = new C0230g7(this, i);
    }

    /* JADX INFO: renamed from: E */
    public static Rect m2081E(AbstractC0731te abstractC0731te, float f, float f2) {
        if (!(abstractC0731te instanceof tv1) && !(abstractC0731te instanceof uv1)) {
            return null;
        }
        o62 o62VarMo5004D = abstractC0731te.mo5004D();
        return new Rect((int) (o62VarMo5004D.f7536a + f), (int) (o62VarMo5004D.f7537b + f2), (int) (o62VarMo5004D.f7538c + f), (int) (o62VarMo5004D.f7539d + f2));
    }

    /* JADX INFO: renamed from: G */
    public static float[] m2082G(AbstractC0731te abstractC0731te) {
        if (!(abstractC0731te instanceof uv1)) {
            return null;
        }
        db2 db2Var = ((uv1) abstractC0731te).f11514j;
        long j = db2Var.f1963h;
        long j2 = db2Var.f1962g;
        long j3 = db2Var.f1961f;
        long j4 = db2Var.f1960e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    /* JADX INFO: renamed from: H */
    public static Region m2083H(AbstractC0731te abstractC0731te, float f, float f2) {
        if (abstractC0731te instanceof sv1) {
            sv1 sv1Var = (sv1) abstractC0731te;
            o62 o62VarM3520h = sv1Var.mo5004D().m3520h(f, f2);
            Region region = new Region(new Rect((int) (o62VarM3520h.f7536a + 0.0f), (int) (o62VarM3520h.f7537b + 0.0f), (int) (o62VarM3520h.f7538c + 0.0f), (int) (o62VarM3520h.f7539d + 0.0f)));
            Region region2 = new Region();
            C0915y9 c0915y9 = sv1Var.f10384j;
            if (c0915y9 instanceof C0915y9) {
                Path path = c0915y9.f13365a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            c80.m676t("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static CharSequence m2084I(CharSequence charSequence) {
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

    /* JADX INFO: renamed from: m */
    public static String m2085m(qn2 qn2Var) {
        C0690sd c0690sd;
        if (qn2Var != null) {
            ln2 ln2Var = qn2Var.f9050d;
            rk1 rk1Var = ln2Var.f6221h;
            yn2 yn2Var = vn2.f12058a;
            if (rk1Var.m4501c(yn2Var)) {
                return sb1.m4781a((List) ln2Var.m2948c(yn2Var), ",", null, 62);
            }
            yn2 yn2Var2 = vn2.f12047G;
            if (rk1Var.m4501c(yn2Var2)) {
                Object objM4505g = rk1Var.m4505g(yn2Var2);
                if (objM4505g == null) {
                    objM4505g = null;
                }
                C0690sd c0690sd2 = (C0690sd) objM4505g;
                if (c0690sd2 != null) {
                    return c0690sd2.f10051i;
                }
            } else {
                Object objM4505g2 = rk1Var.m4505g(vn2.f12043C);
                if (objM4505g2 == null) {
                    objM4505g2 = null;
                }
                List list = (List) objM4505g2;
                if (list != null && (c0690sd = (C0690sd) AbstractC0142du.m1161q0(list)) != null) {
                    return c0690sd.f10051i;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m2086q(el2 el2Var, float f) {
        xm0 xm0Var = el2Var.f2497a;
        if (f >= 0.0f || ((Number) xm0Var.mo6a()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) xm0Var.mo6a()).floatValue() < ((Number) el2Var.f2498b.mo6a()).floatValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m2087r(el2 el2Var) {
        xm0 xm0Var = el2Var.f2497a;
        if (((Number) xm0Var.mo6a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) xm0Var.mo6a()).floatValue();
        ((Number) el2Var.f2498b.mo6a()).floatValue();
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m2088s(el2 el2Var) {
        xm0 xm0Var = el2Var.f2497a;
        if (((Number) xm0Var.mo6a()).floatValue() < ((Number) el2Var.f2498b.mo6a()).floatValue()) {
            return true;
        }
        ((Number) xm0Var.mo6a()).floatValue();
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m2089x(ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h7, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        viewOnAttachStateChangeListenerC0267h7.m2113w(i, i2, num, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2090A(x01 x01Var) {
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
        AccessibilityEvent accessibilityEventM2103i;
        x01 x01Var2 = x01Var;
        Integer num9 = 64;
        ArrayList arrayList4 = this.f3862S;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = x01Var2.f12750b;
        long[] jArr3 = x01Var2.f12749a;
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
                        rn2 rn2Var = (rn2) this.f3857N.m6022b(i27);
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
                            ln2 ln2Var3 = rn2Var.f9650a;
                            rk1 rk1Var3 = ln2Var3.f6221h;
                            sn2 sn2Var = (sn2) x01Var2.m6022b(i27);
                            qn2 qn2Var3 = sn2Var != null ? sn2Var.f10248a : null;
                            if (qn2Var3 == null) {
                                throw vi0.m5686e("no value for specified key");
                            }
                            int i28 = i24;
                            int i29 = qn2Var3.f9052f;
                            ln2 ln2Var4 = qn2Var3.f9050d;
                            iArr2 = iArr3;
                            rk1 rk1Var4 = ln2Var4.f6221h;
                            jArr2 = jArr3;
                            Object[] objArr = rk1Var4.f9619b;
                            Object[] objArr2 = rk1Var4.f9620c;
                            long[] jArr4 = rk1Var4.f9618a;
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
                                                yn2 yn2Var2 = vn2.f12079v;
                                                if (t11.m5086l(yn2Var, yn2Var2)) {
                                                    j = j4;
                                                } else {
                                                    j = j4;
                                                    if (!t11.m5086l(yn2Var, vn2.f12080w)) {
                                                        i13 = 0;
                                                    }
                                                    if (i13 != 0) {
                                                        yn2 yn2Var3 = vn2.f12061d;
                                                        if (t11.m5086l(yn2Var, yn2Var3)) {
                                                            obj2.getClass();
                                                            String str2 = (String) obj2;
                                                            boolean zM4501c = rk1Var3.m4501c(yn2Var3);
                                                            int i38 = i28;
                                                            if (zM4501c) {
                                                                m2114y(str2, i27, i38);
                                                            }
                                                        } else {
                                                            int i39 = i28;
                                                            if (t11.m5086l(yn2Var, vn2.f12059b)) {
                                                                m2089x(this, m2110t(i27), 2048, num9, i39);
                                                                m2089x(this, m2110t(i27), 2048, num10, i39);
                                                            } else if (t11.m5086l(yn2Var, vn2.f12051K)) {
                                                                m2089x(this, m2110t(i27), 2048, 8192, 8);
                                                                m2089x(this, m2110t(i27), 2048, num10, 8);
                                                            } else if (t11.m5086l(yn2Var, vn2.f12053M)) {
                                                                m2089x(this, m2110t(i27), 2048, 3072, 8);
                                                            } else if (t11.m5086l(yn2Var, vn2.f12060c)) {
                                                                m2089x(this, m2110t(i27), 2048, num9, 8);
                                                                m2089x(this, m2110t(i27), 2048, num10, 8);
                                                            } else if (t11.m5086l(yn2Var, vn2.f12050J)) {
                                                                Object objM4505g = rk1Var4.m4505g(vn2.f12083z);
                                                                if (objM4505g == null) {
                                                                    objM4505g = null;
                                                                }
                                                                m2089x(this, m2110t(i27), 2048, num9, 8);
                                                                m2089x(this, m2110t(i27), 2048, num10, 8);
                                                            } else if (t11.m5086l(yn2Var, vn2.f12058a)) {
                                                                int iM2110t = m2110t(i27);
                                                                obj2.getClass();
                                                                m2113w(iM2110t, 2048, 4, (List) obj2);
                                                            } else {
                                                                yn2 yn2Var4 = vn2.f12047G;
                                                                String str3 = "";
                                                                if (t11.m5086l(yn2Var, yn2Var4)) {
                                                                    if (rk1Var4.m4501c(kn2.f5669k)) {
                                                                        Object objM4505g2 = rk1Var3.m4505g(yn2Var4);
                                                                        if (objM4505g2 == null) {
                                                                            objM4505g2 = null;
                                                                        }
                                                                        C0690sd c0690sd = (C0690sd) objM4505g2;
                                                                        if (c0690sd == null) {
                                                                            c0690sd = "";
                                                                        }
                                                                        Object objM4505g3 = rk1Var4.m4505g(yn2Var4);
                                                                        if (objM4505g3 == null) {
                                                                            objM4505g3 = null;
                                                                        }
                                                                        CharSequence charSequence = (C0690sd) objM4505g3;
                                                                        if (charSequence == null) {
                                                                            charSequence = "";
                                                                        }
                                                                        CharSequence charSequenceM2084I = m2084I(charSequence);
                                                                        int length3 = c0690sd.length();
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
                                                                            if (c0690sd.charAt(i41) != charSequence.charAt(i41)) {
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
                                                                            if (c0690sd.charAt((length3 - 1) - i42) != charSequence.charAt((length4 - 1) - i18)) {
                                                                                break;
                                                                            } else {
                                                                                i42 = i18 + 1;
                                                                            }
                                                                        }
                                                                        int i43 = (length3 - i18) - i41;
                                                                        int i44 = (length4 - i18) - i41;
                                                                        yn2 yn2Var5 = vn2.f12052L;
                                                                        boolean zM4501c2 = rk1Var3.m4501c(yn2Var5);
                                                                        boolean zM4501c3 = rk1Var4.m4501c(yn2Var5);
                                                                        boolean zM4501c4 = rk1Var3.m4501c(vn2.f12047G);
                                                                        int i45 = (zM4501c4 && !zM4501c2 && zM4501c3) ? i31 : 0;
                                                                        int i46 = (zM4501c4 && zM4501c2 && !zM4501c3) ? i31 : 0;
                                                                        if (i45 == 0 && i46 == 0) {
                                                                            accessibilityEventM2103i = m2102h(m2110t(i27), 16);
                                                                            accessibilityEventM2103i.setFromIndex(i41);
                                                                            accessibilityEventM2103i.setRemovedCount(i43);
                                                                            accessibilityEventM2103i.setAddedCount(i44);
                                                                            accessibilityEventM2103i.setBeforeText(c0690sd);
                                                                            accessibilityEventM2103i.getText().add(charSequenceM2084I);
                                                                            i11 = i27;
                                                                            rk1Var2 = rk1Var3;
                                                                            num8 = num11;
                                                                        } else {
                                                                            int iM2110t2 = m2110t(i27);
                                                                            Integer numValueOf = Integer.valueOf(length4);
                                                                            i11 = i27;
                                                                            rk1Var2 = rk1Var3;
                                                                            num8 = num11;
                                                                            accessibilityEventM2103i = m2103i(iM2110t2, num8, num11, numValueOf, charSequenceM2084I);
                                                                        }
                                                                        accessibilityEventM2103i.setClassName("android.widget.EditText");
                                                                        m2112v(accessibilityEventM2103i);
                                                                        if (i45 == 0 && i46 == 0) {
                                                                            num7 = num8;
                                                                        } else {
                                                                            num7 = num8;
                                                                            long j5 = ((f13) ln2Var4.m2948c(vn2.f12048H)).f2739a;
                                                                            accessibilityEventM2103i.setFromIndex((int) (j5 >> 32));
                                                                            accessibilityEventM2103i.setToIndex((int) (j5 & 4294967295L));
                                                                            m2112v(accessibilityEventM2103i);
                                                                        }
                                                                    } else {
                                                                        num7 = num10;
                                                                        rk1Var2 = rk1Var3;
                                                                        num5 = num9;
                                                                        arrayList3 = arrayList5;
                                                                        i11 = i27;
                                                                        m2089x(this, m2110t(i11), 2048, Integer.valueOf(i22), 8);
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
                                                                    yn2 yn2Var6 = vn2.f12048H;
                                                                    if (t11.m5086l(yn2Var, yn2Var6)) {
                                                                        Object objM4505g4 = rk1Var4.m4505g(yn2Var4);
                                                                        if (objM4505g4 == null) {
                                                                            objM4505g4 = null;
                                                                        }
                                                                        C0690sd c0690sd2 = (C0690sd) objM4505g4;
                                                                        if (c0690sd2 != null && (str = c0690sd2.f10051i) != null) {
                                                                            str3 = str;
                                                                        }
                                                                        long j6 = ((f13) ln2Var4.m2948c(yn2Var6)).f2739a;
                                                                        num6 = num12;
                                                                        m2112v(m2103i(m2110t(i11), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str3.length()), m2084I(str3)));
                                                                        i12 = i33;
                                                                        m2115z(i12);
                                                                    } else {
                                                                        i12 = i33;
                                                                        num6 = num12;
                                                                        if (t11.m5086l(yn2Var, yn2Var2)) {
                                                                            i14 = 0;
                                                                            qn2Var2 = qn2Var4;
                                                                        } else if (t11.m5086l(yn2Var, vn2.f12080w)) {
                                                                            qn2Var2 = qn2Var4;
                                                                            i14 = 0;
                                                                        } else if (t11.m5086l(yn2Var, vn2.f12069l)) {
                                                                            obj2.getClass();
                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                i16 = 8;
                                                                                m2112v(m2102h(m2110t(i12), 8));
                                                                            } else {
                                                                                i16 = 8;
                                                                            }
                                                                            m2089x(this, m2110t(i12), 2048, num6, i16);
                                                                        } else {
                                                                            yn2 yn2Var7 = kn2.f5682x;
                                                                            if (t11.m5086l(yn2Var, yn2Var7)) {
                                                                                List list = (List) ln2Var4.m2948c(yn2Var7);
                                                                                Object objM4505g5 = rk1Var2.m4505g(yn2Var7);
                                                                                if (objM4505g5 == null) {
                                                                                    objM4505g5 = null;
                                                                                }
                                                                                List list2 = (List) objM4505g5;
                                                                                if (list2 != null) {
                                                                                    sk1 sk1Var = fd2.f2911a;
                                                                                    sk1 sk1Var2 = new sk1();
                                                                                    if (list.size() > 0) {
                                                                                        list.get(0).getClass();
                                                                                        c80.m664g();
                                                                                        return;
                                                                                    }
                                                                                    sk1 sk1Var3 = new sk1();
                                                                                    if (list2.size() > 0) {
                                                                                        list2.get(0).getClass();
                                                                                        c80.m664g();
                                                                                        return;
                                                                                    }
                                                                                    i5 = !sk1Var2.equals(sk1Var3) ? 1 : 0;
                                                                                } else if (!list.isEmpty()) {
                                                                                    i5 = i31;
                                                                                }
                                                                            } else if (obj2 instanceof C0603q3) {
                                                                                C0603q3 c0603q3 = (C0603q3) obj2;
                                                                                Object objM4505g6 = rk1Var2.m4505g(yn2Var);
                                                                                if (objM4505g6 == null) {
                                                                                    objM4505g6 = null;
                                                                                }
                                                                                if (c0603q3 != objM4505g6) {
                                                                                    if (objM4505g6 instanceof C0603q3) {
                                                                                        String str4 = c0603q3.f8712a;
                                                                                        C0603q3 c0603q32 = (C0603q3) objM4505g6;
                                                                                        un0 un0Var2 = c0603q32.f8713b;
                                                                                        if (t11.m5086l(str4, c0603q32.f8712a) && (((un0Var = c0603q3.f8713b) != null || un0Var2 == null) && (un0Var == null || un0Var2 != null))) {
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
                                                                        m2109p(qn2Var2.f9049c);
                                                                        int size = arrayList4.size();
                                                                        int i47 = i14;
                                                                        while (true) {
                                                                            if (i47 >= size) {
                                                                                jl2Var2 = null;
                                                                                break;
                                                                            } else {
                                                                                if (((jl2) arrayList4.get(i47)).f5098h == i11) {
                                                                                    jl2Var2 = (jl2) arrayList4.get(i47);
                                                                                    break;
                                                                                }
                                                                                i47++;
                                                                            }
                                                                        }
                                                                        jl2Var2.getClass();
                                                                        Object objM4505g7 = rk1Var4.m4505g(yn2Var2);
                                                                        if (objM4505g7 == null) {
                                                                            objM4505g7 = null;
                                                                        }
                                                                        jl2Var2.f5102l = (el2) objM4505g7;
                                                                        Object objM4505g8 = rk1Var4.m4505g(vn2.f12080w);
                                                                        if (objM4505g8 == null) {
                                                                            objM4505g8 = null;
                                                                        }
                                                                        jl2Var2.f5103m = (el2) objM4505g8;
                                                                        if (jl2Var2.f5099i.contains(jl2Var2)) {
                                                                            this.f3864k.getSnapshotObserver().f1051a.m5436c(jl2Var2, this.f3863T, new C0723t6(i31, jl2Var2, this));
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
                                                        Object objM4505g9 = rk1Var3.m4505g(yn2Var);
                                                        if (objM4505g9 == null) {
                                                            objM4505g9 = null;
                                                        }
                                                        if (t11.m5086l(obj2, objM4505g9)) {
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
                                                    if (((jl2) arrayList5.get(i48)).f5098h == i27) {
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
                                    if (!qn2Var.m4209k().f6221h.m4501c((yn2) ((Map.Entry) it.next()).getKey())) {
                                        i6 = 1;
                                        break;
                                    }
                                }
                                i5 = i6;
                            }
                            if (i5 != 0) {
                                i2 = 8;
                                m2089x(this, m2110t(i4), 2048, num4, 8);
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

    /* JADX INFO: renamed from: B */
    public final void m2091B(r61 r61Var, ak1 ak1Var) {
        ln2 ln2VarM4391w;
        if (r61Var.m4350H() && !this.f3864k.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(r61Var)) {
            r61 r61Var2 = null;
            if (!r61Var.f9372M.m5731m(8)) {
                r61Var = r61Var.m4389u();
                while (true) {
                    if (r61Var == null) {
                        r61Var = null;
                        break;
                    } else if (r61Var.f9372M.m5731m(8)) {
                        break;
                    } else {
                        r61Var = r61Var.m4389u();
                    }
                }
            }
            if (r61Var == null || (ln2VarM4391w = r61Var.m4391w()) == null) {
                return;
            }
            if (!ln2VarM4391w.f6223j) {
                r61 r61VarM4389u = r61Var.m4389u();
                while (true) {
                    if (r61VarM4389u != null) {
                        ln2 ln2VarM4391w2 = r61VarM4389u.m4391w();
                        if (ln2VarM4391w2 != null && ln2VarM4391w2.f6223j) {
                            r61Var2 = r61VarM4389u;
                            break;
                        }
                        r61VarM4389u = r61VarM4389u.m4389u();
                    } else {
                        break;
                    }
                }
                if (r61Var2 != null) {
                    r61Var = r61Var2;
                }
            }
            int i = r61Var.f9385i;
            if (ak1Var.m182a(i)) {
                m2089x(this, m2110t(i), 2048, 1, 8);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m2092C(r61 r61Var) {
        if (r61Var.m4350H() && !this.f3864k.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(r61Var)) {
            int i = r61Var.f9385i;
            el2 el2Var = (el2) this.f3876w.m6022b(i);
            el2 el2Var2 = (el2) this.f3877x.m6022b(i);
            if (el2Var == null && el2Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventM2102h = m2102h(i, 4096);
            if (el2Var != null) {
                accessibilityEventM2102h.setScrollX((int) ((Number) el2Var.f2497a.mo6a()).floatValue());
                accessibilityEventM2102h.setMaxScrollX((int) ((Number) el2Var.f2498b.mo6a()).floatValue());
            }
            if (el2Var2 != null) {
                accessibilityEventM2102h.setScrollY((int) ((Number) el2Var2.f2497a.mo6a()).floatValue());
                accessibilityEventM2102h.setMaxScrollY((int) ((Number) el2Var2.f2498b.mo6a()).floatValue());
            }
            m2112v(accessibilityEventM2102h);
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m2093D(qn2 qn2Var, int i, int i2, boolean z) {
        String strM2085m;
        ln2 ln2Var = qn2Var.f9050d;
        int i3 = qn2Var.f9052f;
        yn2 yn2Var = kn2.f5668j;
        if (ln2Var.f6221h.m4501c(yn2Var) && rg3.m4474j(qn2Var)) {
            nn0 nn0Var = (nn0) ((C0603q3) qn2Var.f9050d.m2948c(yn2Var)).f8713b;
            if (nn0Var != null) {
                return ((Boolean) nn0Var.mo489e(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.f3844A) && (strM2085m = m2085m(qn2Var)) != null) {
            if (i < 0 || i != i2 || i2 > strM2085m.length()) {
                i = -1;
            }
            this.f3844A = i;
            boolean z2 = strM2085m.length() > 0;
            m2112v(m2103i(m2110t(i3), z2 ? Integer.valueOf(this.f3844A) : null, z2 ? Integer.valueOf(this.f3844A) : null, z2 ? Integer.valueOf(strM2085m.length()) : null, strM2085m));
            m2115z(i3);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final Rect m2094F(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = this.f3864k;
        long jM477u = viewTreeObserverOnGlobalLayoutListenerC0045b7.m477u(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jM477u2 = viewTreeObserverOnGlobalLayoutListenerC0045b7.m477u((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jM477u >> 32);
        int i2 = (int) (jM477u2 >> 32);
        int i3 = (int) (jM477u & 4294967295L);
        int i4 = (int) (jM477u2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

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
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2095J() {
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
        ak1 ak1Var2 = this.f3851H;
        int[] iArr = ak1Var2.f234b;
        long[] jArr3 = ak1Var2.f233a;
        int length = jArr3.length - 2;
        zj1 zj1Var = this.f3857N;
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
                            sn2 sn2Var = (sn2) m2106l().m6022b(i7);
                            qn2 qn2Var = sn2Var != null ? sn2Var.f10248a : null;
                            if (qn2Var != null) {
                                if (!qn2Var.f9050d.f6221h.m4501c(vn2.f12061d)) {
                                    ak1Var.m182a(i7);
                                    rn2 rn2Var = (rn2) zj1Var.m6022b(i7);
                                    if (rn2Var != null) {
                                        Object objM4505g = rn2Var.f9650a.f6221h.m4505g(vn2.f12061d);
                                        obj = (String) (objM4505g != null ? objM4505g : null);
                                    }
                                    m2114y(obj, i7, 32);
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
        int[] iArr2 = ak1Var.f234b;
        long[] jArr4 = ak1Var.f233a;
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
                            int i14 = ak1Var2.f235c;
                            int i15 = (i12 >>> 7) & i14;
                            i = i3;
                            int i16 = 0;
                            while (true) {
                                long[] jArr5 = ak1Var2.f233a;
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
                                    if (ak1Var2.f234b[iNumberOfTrailingZeros] == i11) {
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
                                ak1Var2.m187f(i21);
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
        zj1Var.m6416c();
        x01 x01VarM2106l = m2106l();
        int[] iArr3 = x01VarM2106l.f12750b;
        Object[] objArr = x01VarM2106l.f12751c;
        long[] jArr6 = x01VarM2106l.f12749a;
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
                            qn2 qn2Var2 = ((sn2) objArr[i25]).f10248a;
                            ln2 ln2Var = qn2Var2.f9050d;
                            yn2 yn2Var = vn2.f12061d;
                            if (ln2Var.f6221h.m4501c(yn2Var) && ak1Var2.m182a(i26)) {
                                m2114y((String) qn2Var2.f9050d.m2948c(yn2Var), i26, 16);
                            }
                            zj1Var.m6421h(i26, new rn2(qn2Var2, m2106l()));
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
        this.f3858O = new rn2(this.f3864k.getSemanticsOwner().m5334a(), m2106l());
    }

    @Override // p000.AbstractC0720t3
    /* JADX INFO: renamed from: a */
    public final C0485n4 mo2096a(View view) {
        return this.f3870q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m2097c(int i, C0411l4 c0411l4, String str, Bundle bundle) {
        qn2 qn2Var;
        int i2;
        int i3;
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = c0411l4.f5914a;
        sn2 sn2Var = (sn2) m2106l().m6022b(i);
        if (sn2Var == null || (qn2Var = sn2Var.f10248a) == null) {
            return;
        }
        r61 r61Var = qn2Var.f9049c;
        ln2 ln2Var = qn2Var.f9050d;
        rk1 rk1Var = ln2Var.f6221h;
        String strM2085m = m2085m(qn2Var);
        if (t11.m5086l(str, this.f3854K)) {
            int iM6155d = this.f3852I.m6155d(i);
            if (iM6155d != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM6155d);
                return;
            }
            return;
        }
        if (t11.m5086l(str, this.f3855L)) {
            int iM6155d2 = this.f3853J.m6155d(i);
            if (iM6155d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM6155d2);
                return;
            }
            return;
        }
        boolean zM4501c = rk1Var.m4501c(kn2.f5659a);
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b72 = this.f3864k;
        zn1 zn1Var = null;
        if (zM4501c && bundle != null && t11.m5086l(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i5 > 0 && i4 >= 0) {
                if (i4 < (strM2085m != null ? strM2085m.length() : Integer.MAX_VALUE)) {
                    y03 y03VarM1433N = AbstractC0179eu.m1433N(ln2Var);
                    if (y03VarM1433N == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i4 + i6;
                        if (i7 >= y03VarM1433N.f13266a.f12754a.f10051i.length()) {
                            arrayList.add(zn1Var);
                            i2 = i4;
                            i3 = i5;
                            viewTreeObserverOnGlobalLayoutListenerC0045b7 = viewTreeObserverOnGlobalLayoutListenerC0045b72;
                        } else {
                            o62 o62VarM6202b = y03VarM1433N.m6202b(i7);
                            zn1 zn1VarM4203d = qn2Var.m4203d();
                            long jMo646M = 0;
                            if (zn1VarM4203d != null) {
                                if (!zn1VarM4203d.mo2843S0().f10770u) {
                                    zn1VarM4203d = zn1Var;
                                }
                                if (zn1VarM4203d != null) {
                                    jMo646M = zn1VarM4203d.mo646M(0L);
                                }
                            }
                            o62 o62VarM3521i = o62VarM6202b.m3521i(jMo646M);
                            o62 o62VarM4206g = qn2Var.m4206g();
                            o62 o62VarM3517e = o62VarM3521i.m3519g(o62VarM4206g) ? o62VarM3521i.m3517e(o62VarM4206g) : zn1Var;
                            if (o62VarM3517e != 0) {
                                long jM477u = viewTreeObserverOnGlobalLayoutListenerC0045b72.m477u((((long) Float.floatToRawIntBits(o62VarM3517e.f7537b)) & 4294967295L) | (((long) Float.floatToRawIntBits(o62VarM3517e.f7536a)) << 32));
                                viewTreeObserverOnGlobalLayoutListenerC0045b7 = viewTreeObserverOnGlobalLayoutListenerC0045b72;
                                long jM477u2 = viewTreeObserverOnGlobalLayoutListenerC0045b7.m477u((((long) Float.floatToRawIntBits(o62VarM3517e.f7539d)) & 4294967295L) | (((long) Float.floatToRawIntBits(o62VarM3517e.f7538c)) << 32));
                                int i8 = (int) (jM477u >> 32);
                                i2 = i4;
                                i3 = i5;
                                int i9 = (int) (jM477u2 >> 32);
                                int i10 = (int) (jM477u & 4294967295L);
                                int i11 = (int) (jM477u2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)));
                            } else {
                                i2 = i4;
                                i3 = i5;
                                viewTreeObserverOnGlobalLayoutListenerC0045b7 = viewTreeObserverOnGlobalLayoutListenerC0045b72;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i6++;
                        i5 = i3;
                        viewTreeObserverOnGlobalLayoutListenerC0045b72 = viewTreeObserverOnGlobalLayoutListenerC0045b7;
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
        yn2 yn2Var = vn2.f12041A;
        if (rk1Var.m4501c(yn2Var) && bundle != null && t11.m5086l(str, "androidx.compose.ui.semantics.testTag")) {
            Object objM4505g = rk1Var.m4505g(yn2Var);
            String str2 = (String) (objM4505g == null ? null : objM4505g);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (t11.m5086l(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, qn2Var.f9052f);
            return;
        }
        if (t11.m5086l(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objM4505g2 = rk1Var.m4505g(vn2.f12057Q);
            eq2 eq2Var = (eq2) (objM4505g2 == null ? null : objM4505g2);
            if (eq2Var != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                o62 o62VarM2107n = m2107n(qn2Var, rect, eq2Var);
                float f = o62VarM2107n.f7537b;
                float f2 = o62VarM2107n.f7536a;
                AbstractC0731te abstractC0731teMo248a = eq2Var.mo248a(o62VarM2107n.m3515c(), r61Var.f9366G, viewTreeObserverOnGlobalLayoutListenerC0045b72.getDensity());
                if (abstractC0731teMo248a instanceof tv1) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m2081E(abstractC0731teMo248a, f2, f));
                    return;
                } else if (abstractC0731teMo248a instanceof uv1) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m2081E(abstractC0731teMo248a, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m2082G(abstractC0731teMo248a));
                    return;
                } else if (!(abstractC0731teMo248a instanceof sv1)) {
                    c80.m675s();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m2083H(abstractC0731teMo248a, f2, f));
                    return;
                }
            }
            return;
        }
        if (t11.m5086l(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objM4505g3 = rk1Var.m4505g(vn2.f12057Q);
            eq2 eq2Var2 = (eq2) (objM4505g3 == null ? null : objM4505g3);
            if (eq2Var2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                o62 o62VarM2107n2 = m2107n(qn2Var, rect2, eq2Var2);
                Rect rectM2081E = m2081E(eq2Var2.mo248a(o62VarM2107n2.m3515c(), r61Var.f9366G, viewTreeObserverOnGlobalLayoutListenerC0045b72.getDensity()), o62VarM2107n2.f7536a, o62VarM2107n2.f7537b);
                if (rectM2081E != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectM2081E);
                    return;
                }
                return;
            }
            return;
        }
        if (t11.m5086l(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objM4505g4 = rk1Var.m4505g(vn2.f12057Q);
            eq2 eq2Var3 = (eq2) (objM4505g4 == null ? null : objM4505g4);
            if (eq2Var3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrM2082G = m2082G(eq2Var3.mo248a(m2107n(qn2Var, rect3, eq2Var3).m3515c(), r61Var.f9366G, viewTreeObserverOnGlobalLayoutListenerC0045b72.getDensity()));
                if (fArrM2082G != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM2082G);
                    return;
                }
                return;
            }
            return;
        }
        if (t11.m5086l(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objM4505g5 = rk1Var.m4505g(vn2.f12057Q);
            eq2 eq2Var4 = (eq2) (objM4505g5 == null ? null : objM4505g5);
            if (eq2Var4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                o62 o62VarM2107n3 = m2107n(qn2Var, rect4, eq2Var4);
                Region regionM2083H = m2083H(eq2Var4.mo248a(o62VarM2107n3.m3515c(), r61Var.f9366G, viewTreeObserverOnGlobalLayoutListenerC0045b72.getDensity()), o62VarM2107n3.f7536a, o62VarM2107n3.f7537b);
                if (regionM2083H != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionM2083H);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Rect m2098d(sn2 sn2Var) {
        d11 d11Var = sn2Var.f10249b;
        return m2094F(d11Var.f1807a, d11Var.f1808b, d11Var.f1809c, d11Var.f1810d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f7, code lost:
    
        if (p000.AbstractC0179eu.m1425F(r4, r2) == r7) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:34:0x0085, B:35:0x0094, B:37:0x009c, B:20:0x0046, B:23:0x004d), top: B:56:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f7 -> B:51:0x00fa). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2099e(u00 u00Var) throws Throwable {
        C0156e7 c0156e7;
        C0349jg c0349jg;
        ak1 ak1Var;
        C0319in c0319in;
        ak1 ak1Var2;
        C0319in c0319in2;
        int i;
        long j;
        Object objM2373b;
        if (u00Var instanceof C0156e7) {
            c0156e7 = (C0156e7) u00Var;
            int i2 = c0156e7.f2335o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0156e7.f2335o = i2 - Integer.MIN_VALUE;
            } else {
                c0156e7 = new C0156e7(this, u00Var);
            }
        }
        Object obj = c0156e7.f2333m;
        int i3 = c0156e7.f2335o;
        C0349jg c0349jg2 = this.f3846C;
        k20 k20Var = k20.f5323h;
        try {
            if (i3 == 0) {
                fg1.m1627T(obj);
                ak1Var = new ak1();
                C0356jn c0356jn = this.f3847D;
                c0356jn.getClass();
                c0319in = new C0319in(c0356jn);
                c0156e7.f2331k = ak1Var;
                c0156e7.f2332l = c0319in;
                c0156e7.f2335o = 1;
                objM2373b = c0319in.m2373b(c0156e7);
                if (objM2373b != k20Var) {
                }
            } else if (i3 == 1) {
                c0319in2 = c0156e7.f2332l;
                ak1Var2 = c0156e7.f2331k;
                fg1.m1627T(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i3 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c0319in2 = c0156e7.f2332l;
                ak1Var2 = c0156e7.f2331k;
                fg1.m1627T(obj);
                char c = 2;
                c0349jg = c0349jg2;
                ak1Var = ak1Var2;
                c0349jg2 = c0349jg;
                c0319in = c0319in2;
                c0156e7.f2331k = ak1Var;
                c0156e7.f2332l = c0319in;
                c0156e7.f2335o = 1;
                objM2373b = c0319in.m2373b(c0156e7);
                if (objM2373b != k20Var) {
                    return k20Var;
                }
                C0319in c0319in3 = c0319in;
                ak1Var2 = ak1Var;
                obj = objM2373b;
                c0319in2 = c0319in3;
                if (((Boolean) obj).booleanValue()) {
                    c0349jg2.clear();
                    return a83.f116a;
                }
                c0319in2.m2374c();
                if (m2108o()) {
                    int i4 = c0349jg2.f5022j;
                    for (int i5 = 0; i5 < i4; i5++) {
                        r61 r61Var = (r61) c0349jg2.f5021i[i5];
                        m2091B(r61Var, ak1Var2);
                        m2092C(r61Var);
                    }
                    ak1Var2.f236d = 0;
                    long[] jArr = ak1Var2.f233a;
                    if (jArr != ed2.f2401a) {
                        try {
                            AbstractC0460mg.m3095j0(-9187201950435737472L, jArr);
                            long[] jArr2 = ak1Var2.f233a;
                            i = ak1Var2.f235c;
                            int i6 = i >> 3;
                            jArr2[i6] = ((~j) & jArr2[i6]) | j;
                        } catch (Throwable th) {
                            th = th;
                            c0349jg.clear();
                            throw th;
                        }
                        j = 255 << ((i & 7) << 3);
                        c0349jg = c0349jg2;
                    } else {
                        c0349jg = c0349jg2;
                    }
                    ak1Var2.f237e = ed2.m1336a(ak1Var2.f235c) - ak1Var2.f236d;
                    Handler handler = this.f3864k.getHandler();
                    if (!this.f3859P && handler != null) {
                        this.f3859P = true;
                        handler.post(this.f3861R);
                    }
                } else {
                    c0349jg = c0349jg2;
                }
                c0349jg.clear();
                this.f3876w.m6416c();
                this.f3877x.m6416c();
                long j2 = this.f3868o;
                c0156e7.f2331k = ak1Var2;
                c0156e7.f2332l = c0319in2;
                c = 2;
                c0156e7.f2335o = 2;
            }
        } catch (Throwable th2) {
            th = th2;
            c0349jg = c0349jg2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2100f(boolean z, int i, long j) {
        yn2 yn2Var;
        int i2;
        if (t11.m5086l(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            x01 x01VarM2106l = m2106l();
            if (!rs1.m4609b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    yn2Var = vn2.f12080w;
                } else {
                    if (z) {
                        c80.m675s();
                        return false;
                    }
                    yn2Var = vn2.f12079v;
                }
                Object[] objArr = x01VarM2106l.f12751c;
                long[] jArr = x01VarM2106l.f12749a;
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
                                    d11 d11Var = sn2Var.f10249b;
                                    float f = d11Var.f1807a;
                                    i2 = i4;
                                    float f2 = d11Var.f1808b;
                                    float f3 = d11Var.f1809c;
                                    float f4 = d11Var.f1810d;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                                        Object objM4505g = sn2Var.f10248a.f9050d.f6221h.m4505g(yn2Var);
                                        if (objM4505g == null) {
                                            objM4505g = null;
                                        }
                                        el2 el2Var = (el2) objM4505g;
                                        if (el2Var != null) {
                                            xm0 xm0Var = el2Var.f2497a;
                                            if (i < 0) {
                                                if (((Number) xm0Var.mo6a()).floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (((Number) xm0Var.mo6a()).floatValue() < ((Number) el2Var.f2498b.mo6a()).floatValue()) {
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

    /* JADX INFO: renamed from: g */
    public final void m2101g() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m2108o()) {
                m2111u(this.f3864k.getSemanticsOwner().m5334a(), this.f3858O);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                m2090A(m2106l());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    m2095J();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: h */
    public final AccessibilityEvent m2102h(int i, int i2) {
        sn2 sn2Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = this.f3864k;
        accessibilityEventObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC0045b7.getContext().getPackageName());
        accessibilityEventObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC0045b7, i);
        if (m2108o() && (sn2Var = (sn2) m2106l().m6022b(i)) != null) {
            qn2 qn2Var = sn2Var.f10248a;
            accessibilityEventObtain.setPassword(qn2Var.f9050d.f6221h.m4501c(vn2.f12052L));
            Object objM4505g = qn2Var.f9050d.f6221h.m4505g(vn2.f12072o);
            if (objM4505g == null) {
                objM4505g = null;
            }
            boolean zM5086l = t11.m5086l(objM4505g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0759u3.m5460f(accessibilityEventObtain, zM5086l);
            }
        }
        return accessibilityEventObtain;
    }

    /* JADX INFO: renamed from: i */
    public final AccessibilityEvent m2103i(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventM2102h = m2102h(i, 8192);
        if (num != null) {
            accessibilityEventM2102h.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventM2102h.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventM2102h.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventM2102h.getText().add(charSequence);
        }
        return accessibilityEventM2102h;
    }

    /* JADX INFO: renamed from: j */
    public final int m2104j(qn2 qn2Var) {
        ln2 ln2Var = qn2Var.f9050d;
        if (!ln2Var.f6221h.m4501c(vn2.f12058a)) {
            yn2 yn2Var = vn2.f12048H;
            if (ln2Var.f6221h.m4501c(yn2Var)) {
                return (int) (((f13) ln2Var.m2948c(yn2Var)).f2739a & 4294967295L);
            }
        }
        return this.f3844A;
    }

    /* JADX INFO: renamed from: k */
    public final int m2105k(qn2 qn2Var) {
        ln2 ln2Var = qn2Var.f9050d;
        if (!ln2Var.f6221h.m4501c(vn2.f12058a)) {
            yn2 yn2Var = vn2.f12048H;
            if (ln2Var.f6221h.m4501c(yn2Var)) {
                return (int) (((f13) ln2Var.m2948c(yn2Var)).f2739a >> 32);
            }
        }
        return this.f3844A;
    }

    /* JADX INFO: renamed from: l */
    public final x01 m2106l() {
        if (this.f3848E) {
            this.f3848E = false;
            ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = this.f3864k;
            this.f3850G = xe1.m6145v(viewTreeObserverOnGlobalLayoutListenerC0045b7.getSemanticsOwner(), C0799v6.f11762k);
            if (m2108o()) {
                zj1 zj1Var = this.f3850G;
                Resources resources = viewTreeObserverOnGlobalLayoutListenerC0045b7.getContext().getResources();
                xj1 xj1Var = this.f3852I;
                xj1Var.m6152a();
                xj1 xj1Var2 = this.f3853J;
                xj1Var2.m6152a();
                sn2 sn2Var = (sn2) zj1Var.m6022b(-1);
                qn2 qn2Var = sn2Var != null ? sn2Var.f10248a : null;
                qn2Var.getClass();
                ArrayList arrayListM246b = ao2.m246b(qn2Var, new C0798v5(3, zj1Var), new C0798v5(4, resources), AbstractC0179eu.m1434O(qn2Var));
                int i = 1;
                int size = arrayListM246b.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((qn2) arrayListM246b.get(i - 1)).f9052f;
                        int i3 = ((qn2) arrayListM246b.get(i)).f9052f;
                        xj1Var.m6157f(i2, i3);
                        xj1Var2.m6157f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.f3850G;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[LOOP:0: B:4:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0075], SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o62 m2107n(qn2 qn2Var, Rect rect, eq2 eq2Var) {
        C0193f7 c0193f7 = new C0193f7(eq2Var);
        r61 r61Var = qn2Var.f9049c;
        th1 th1Var = (th1) r61Var.f9372M.f12036g;
        t60 t60Var = null;
        if ((th1Var.f10760k & 8) != 0) {
            loop0: while (true) {
                if (th1Var == null) {
                    break;
                }
                if ((th1Var.f10759j & 8) != 0) {
                    th1 th1VarM4952m = th1Var;
                    zk1 zk1Var = null;
                    while (th1VarM4952m != null) {
                        if (th1VarM4952m instanceof on2) {
                            ((on2) th1VarM4952m).mo232l0(c0193f7);
                            if (c0193f7.f2824h) {
                                t60Var = th1VarM4952m;
                                break loop0;
                            }
                        } else if ((th1VarM4952m.f10759j & 8) != 0 && (th1VarM4952m instanceof u60)) {
                            int i = 0;
                            for (th1 th1Var2 = ((u60) th1VarM4952m).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                                if ((th1Var2.f10759j & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        th1VarM4952m = th1Var2;
                                    } else {
                                        if (zk1Var == null) {
                                            zk1Var = new zk1(new th1[16]);
                                        }
                                        if (th1VarM4952m != null) {
                                            zk1Var.m6423b(th1VarM4952m);
                                            th1VarM4952m = null;
                                        }
                                        zk1Var.m6423b(th1Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        th1VarM4952m = sp0.m4952m(zk1Var);
                    }
                    if ((th1Var.f10760k & 8) != 0) {
                        break;
                    }
                    th1Var = th1Var.f10762m;
                } else if ((th1Var.f10760k & 8) != 0) {
                }
            }
        }
        t60 t60Var2 = (on2) t60Var;
        if (t60Var2 == null || !((th1) t60Var2).f10757h.f10770u) {
            return s11.m4724w((zn1) r61Var.f9372M.f12034e, false);
        }
        zn1 zn1VarM4931b0 = sp0.m4931b0(t60Var2);
        o62 o62VarMo644J = s11.m4665J(zn1VarM4931b0).mo644J(zn1VarM4931b0, false);
        Rect rectM2094F = m2094F(o62VarMo644J.f7536a, o62VarMo644J.f7537b, o62VarMo644J.f7538c, o62VarMo644J.f7539d);
        float f = rectM2094F.left - rect.left;
        float f2 = rectM2094F.top - rect.top;
        return new o62(f, f2, rectM2094F.width() + f, rectM2094F.height() + f2);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2108o() {
        AccessibilityManager accessibilityManager = this.f3867n;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f3869p;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f3869p = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f3869p = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f3869p = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f3867n;
        if (accessibilityManager.isEnabled()) {
            this.f3869p = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f3864k.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.f3861R);
        AccessibilityManager accessibilityManager = this.f3867n;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m2109p(r61 r61Var) {
        if (this.f3846C.add(r61Var)) {
            this.f3847D.mo2225s(a83.f116a);
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m2110t(int i) {
        if (i == this.f3864k.getSemanticsOwner().m5334a().f9052f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2111u(qn2 qn2Var, rn2 rn2Var) {
        int[] iArr = g11.f3247a;
        ak1 ak1Var = new ak1();
        List listM4199j = qn2.m4199j(4, qn2Var);
        r61 r61Var = qn2Var.f9049c;
        int size = listM4199j.size();
        for (int i = 0; i < size; i++) {
            qn2 qn2Var2 = (qn2) listM4199j.get(i);
            x01 x01VarM2106l = m2106l();
            int i2 = qn2Var2.f9052f;
            if (x01VarM2106l.m6021a(i2)) {
                if (!rn2Var.f9651b.m183b(i2)) {
                    m2109p(r61Var);
                    return;
                }
                ak1Var.m182a(i2);
            }
        }
        ak1 ak1Var2 = rn2Var.f9651b;
        int[] iArr2 = ak1Var2.f234b;
        long[] jArr = ak1Var2.f233a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !ak1Var.m183b(iArr2[(i3 << 3) + i5])) {
                            m2109p(r61Var);
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
        List listM4199j2 = qn2.m4199j(4, qn2Var);
        int size2 = listM4199j2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            qn2 qn2Var3 = (qn2) listM4199j2.get(i6);
            rn2 rn2Var2 = (rn2) this.f3857N.m6022b(qn2Var3.f9052f);
            if (rn2Var2 != null && m2106l().m6021a(qn2Var3.f9052f)) {
                m2111u(qn2Var3, rn2Var2);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m2112v(AccessibilityEvent accessibilityEvent) {
        if (!m2108o()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f3875v = true;
        }
        try {
            return ((Boolean) this.f3866m.mo5j(accessibilityEvent)).booleanValue();
        } finally {
            this.f3875v = false;
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m2113w(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !m2108o()) {
            return false;
        }
        AccessibilityEvent accessibilityEventM2102h = m2102h(i, i2);
        if (num != null) {
            accessibilityEventM2102h.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventM2102h.setContentDescription(sb1.m4781a(list, ",", null, 62));
        }
        return m2112v(accessibilityEventM2102h);
    }

    /* JADX INFO: renamed from: y */
    public final void m2114y(String str, int i, int i2) {
        AccessibilityEvent accessibilityEventM2102h = m2102h(m2110t(i), 32);
        accessibilityEventM2102h.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventM2102h.getText().add(str);
        }
        m2112v(accessibilityEventM2102h);
    }

    /* JADX INFO: renamed from: z */
    public final void m2115z(int i) {
        C0120d7 c0120d7 = this.f3849F;
        if (c0120d7 != null) {
            qn2 qn2Var = c0120d7.f1891a;
            if (i != qn2Var.f9052f) {
                return;
            }
            if (SystemClock.uptimeMillis() - c0120d7.f1896f <= 1000) {
                AccessibilityEvent accessibilityEventM2102h = m2102h(m2110t(qn2Var.f9052f), 131072);
                accessibilityEventM2102h.setFromIndex(c0120d7.f1894d);
                accessibilityEventM2102h.setToIndex(c0120d7.f1895e);
                accessibilityEventM2102h.setAction(c0120d7.f1892b);
                accessibilityEventM2102h.setMovementGranularity(c0120d7.f1893c);
                accessibilityEventM2102h.getText().add(m2085m(qn2Var));
                m2112v(accessibilityEventM2102h);
            }
        }
        this.f3849F = null;
    }
}
