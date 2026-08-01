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
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.luckypray.dexkit.C0587R;
import org.luckypray.dexkit.result.MethodData;

/* JADX INFO: renamed from: c4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0078c4 extends AbstractC0672r0 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: R */
    public static final tg0 f651R;

    /* JADX INFO: renamed from: A */
    public final C0834vb f652A;

    /* JADX INFO: renamed from: B */
    public boolean f653B;

    /* JADX INFO: renamed from: C */
    public C0949y3 f654C;

    /* JADX INFO: renamed from: D */
    public ug0 f655D;

    /* JADX INFO: renamed from: E */
    public final vg0 f656E;

    /* JADX INFO: renamed from: F */
    public final sg0 f657F;

    /* JADX INFO: renamed from: G */
    public final sg0 f658G;

    /* JADX INFO: renamed from: H */
    public final String f659H;

    /* JADX INFO: renamed from: I */
    public final String f660I;

    /* JADX INFO: renamed from: J */
    public final C0541o8 f661J;

    /* JADX INFO: renamed from: K */
    public final ug0 f662K;

    /* JADX INFO: renamed from: L */
    public yz0 f663L;

    /* JADX INFO: renamed from: M */
    public boolean f664M;

    /* JADX INFO: renamed from: N */
    public final sg0 f665N;

    /* JADX INFO: renamed from: O */
    public final RunnableC0912x3 f666O;

    /* JADX INFO: renamed from: P */
    public final ArrayList f667P;

    /* JADX INFO: renamed from: Q */
    public final C0042b4 f668Q;

    /* JADX INFO: renamed from: g */
    public final ViewTreeObserverOnGlobalLayoutListenerC0875w3 f669g;

    /* JADX INFO: renamed from: h */
    public int f670h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    public final C0042b4 f671i;

    /* JADX INFO: renamed from: j */
    public final AccessibilityManager f672j;

    /* JADX INFO: renamed from: k */
    public long f673k;

    /* JADX INFO: renamed from: l */
    public List f674l;

    /* JADX INFO: renamed from: m */
    public final Handler f675m;

    /* JADX INFO: renamed from: n */
    public final C0111d f676n;

    /* JADX INFO: renamed from: o */
    public int f677o;

    /* JADX INFO: renamed from: p */
    public int f678p;

    /* JADX INFO: renamed from: q */
    public C0156e1 f679q;

    /* JADX INFO: renamed from: r */
    public C0156e1 f680r;

    /* JADX INFO: renamed from: s */
    public boolean f681s;

    /* JADX INFO: renamed from: t */
    public final ug0 f682t;

    /* JADX INFO: renamed from: u */
    public final ug0 f683u;

    /* JADX INFO: renamed from: v */
    public final l31 f684v;

    /* JADX INFO: renamed from: w */
    public final l31 f685w;

    /* JADX INFO: renamed from: x */
    public int f686x;

    /* JADX INFO: renamed from: y */
    public Integer f687y;

    /* JADX INFO: renamed from: z */
    public final C0164e9 f688z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int[] iArr = {C0587R.id.accessibility_custom_action_0, C0587R.id.accessibility_custom_action_1, C0587R.id.accessibility_custom_action_2, C0587R.id.accessibility_custom_action_3, C0587R.id.accessibility_custom_action_4, C0587R.id.accessibility_custom_action_5, C0587R.id.accessibility_custom_action_6, C0587R.id.accessibility_custom_action_7, C0587R.id.accessibility_custom_action_8, C0587R.id.accessibility_custom_action_9, C0587R.id.accessibility_custom_action_10, C0587R.id.accessibility_custom_action_11, C0587R.id.accessibility_custom_action_12, C0587R.id.accessibility_custom_action_13, C0587R.id.accessibility_custom_action_14, C0587R.id.accessibility_custom_action_15, C0587R.id.accessibility_custom_action_16, C0587R.id.accessibility_custom_action_17, C0587R.id.accessibility_custom_action_18, C0587R.id.accessibility_custom_action_19, C0587R.id.accessibility_custom_action_20, C0587R.id.accessibility_custom_action_21, C0587R.id.accessibility_custom_action_22, C0587R.id.accessibility_custom_action_23, C0587R.id.accessibility_custom_action_24, C0587R.id.accessibility_custom_action_25, C0587R.id.accessibility_custom_action_26, C0587R.id.accessibility_custom_action_27, C0587R.id.accessibility_custom_action_28, C0587R.id.accessibility_custom_action_29, C0587R.id.accessibility_custom_action_30, C0587R.id.accessibility_custom_action_31};
        tg0 tg0Var = t20.f5890a;
        tg0 tg0Var2 = new tg0(32);
        int i = tg0Var2.f6001b;
        if (i < 0) {
            C0921xc.m5125f("");
            return;
        }
        int i2 = i + 32;
        int[] iArr2 = tg0Var2.f6000a;
        if (iArr2.length < i2) {
            tg0Var2.f6000a = Arrays.copyOf(iArr2, Math.max(i2, (iArr2.length * 3) / 2));
        }
        int[] iArr3 = tg0Var2.f6000a;
        int i3 = tg0Var2.f6001b;
        if (i != i3) {
            AbstractC0201f9.m1055a0(iArr3, iArr3, i2, i, i3);
        }
        AbstractC0201f9.m1058d0(iArr, iArr3, i, 0, 12);
        tg0Var2.f6001b += 32;
        f651R = tg0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnAttachStateChangeListenerC0078c4(ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3) {
        this.f669g = viewTreeObserverOnGlobalLayoutListenerC0875w3;
        int i = 0;
        this.f671i = new C0042b4(this, i);
        Object systemService = viewTreeObserverOnGlobalLayoutListenerC0875w3.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.f672j = (AccessibilityManager) systemService;
        this.f673k = 100L;
        this.f675m = new Handler(Looper.getMainLooper());
        this.f676n = new C0111d(this);
        this.f677o = Integer.MIN_VALUE;
        this.f678p = Integer.MIN_VALUE;
        this.f682t = new ug0();
        this.f683u = new ug0();
        this.f684v = new l31();
        this.f685w = new l31();
        this.f686x = -1;
        this.f688z = new C0164e9();
        this.f652A = o30.m2765e(1, 6, null);
        this.f653B = true;
        ug0 ug0Var = v20.f6389a;
        ug0Var.getClass();
        this.f655D = ug0Var;
        this.f656E = new vg0();
        this.f657F = new sg0();
        this.f658G = new sg0();
        this.f659H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f660I = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f661J = new C0541o8(11);
        this.f662K = new ug0();
        this.f663L = new yz0(viewTreeObserverOnGlobalLayoutListenerC0875w3.getSemanticsOwner().m2a(), ug0Var);
        int i2 = s20.f5626a;
        this.f665N = new sg0();
        viewTreeObserverOnGlobalLayoutListenerC0875w3.addOnAttachStateChangeListener(this);
        this.f666O = new RunnableC0912x3(i, this);
        this.f667P = new ArrayList();
        this.f668Q = new C0042b4(this, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static Rect m443D(v50 v50Var, float f, float f2) {
        if (!(v50Var instanceof xm0) && !(v50Var instanceof ym0)) {
            return null;
        }
        st0 st0VarMo4418j = v50Var.mo4418j();
        return new Rect((int) (st0VarMo4418j.f5832a + f), (int) (st0VarMo4418j.f5833b + f2), (int) (st0VarMo4418j.f5834c + f), (int) (st0VarMo4418j.f5835d + f2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static float[] m444F(v50 v50Var) {
        if (!(v50Var instanceof ym0)) {
            return null;
        }
        bw0 bw0Var = ((ym0) v50Var).f7657a;
        long j = bw0Var.f603h;
        long j2 = bw0Var.f602g;
        long j3 = bw0Var.f601f;
        long j4 = bw0Var.f600e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static Region m445G(v50 v50Var, float f, float f2) {
        if (!(v50Var instanceof wm0)) {
            return null;
        }
        wm0 wm0Var = (wm0) v50Var;
        st0 st0VarM4104d = wm0Var.mo4418j().m4104d(f, f2);
        Region region = new Region(new Rect((int) (st0VarM4104d.f5832a + 0.0f), (int) (st0VarM4104d.f5833b + 0.0f), (int) (st0VarM4104d.f5834c + 0.0f), (int) (st0VarM4104d.f5835d + 0.0f)));
        Region region2 = new Region();
        C0118d6 c0118d6 = wm0Var.f7150a;
        if (!(c0118d6 instanceof C0118d6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = c0118d6.f973a;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static CharSequence m446H(CharSequence charSequence) {
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
    /* JADX INFO: renamed from: l */
    public static String m447l(xz0 xz0Var) {
        C0200f8 c0200f8;
        if (xz0Var != null) {
            sz0 sz0Var = xz0Var.f7471d;
            jh0 jh0Var = sz0Var.f5877d;
            e01 e01Var = b01.f322a;
            if (jh0Var.m1697c(e01Var)) {
                return ya0.m5226a((List) sz0Var.m4137c(e01Var), ",", null, 62);
            }
            e01 e01Var2 = b01.f312E;
            if (jh0Var.m1697c(e01Var2)) {
                Object objM1701g = jh0Var.m1701g(e01Var2);
                if (objM1701g == null) {
                    objM1701g = null;
                }
                C0200f8 c0200f82 = (C0200f8) objM1701g;
                if (c0200f82 != null) {
                    return c0200f82.f1625e;
                }
            } else {
                Object objM1701g2 = jh0Var.m1701g(b01.f308A);
                if (objM1701g2 == null) {
                    objM1701g2 = null;
                }
                List list = (List) objM1701g2;
                if (list != null && (c0200f8 = (C0200f8) AbstractC0960ye.m5241K(list)) != null) {
                    return c0200f8.f1625e;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final boolean m448p(hy0 hy0Var, float f) {
        InterfaceC0298hw interfaceC0298hw = hy0Var.f2376a;
        if (f >= 0.0f || ((Number) interfaceC0298hw.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) interfaceC0298hw.invoke()).floatValue() < ((Number) hy0Var.f2377b.invoke()).floatValue();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final boolean m449q(hy0 hy0Var) {
        InterfaceC0298hw interfaceC0298hw = hy0Var.f2376a;
        if (((Number) interfaceC0298hw.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) interfaceC0298hw.invoke()).floatValue();
        ((Number) hy0Var.f2377b.invoke()).floatValue();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final boolean m450r(hy0 hy0Var) {
        InterfaceC0298hw interfaceC0298hw = hy0Var.f2376a;
        if (((Number) interfaceC0298hw.invoke()).floatValue() < ((Number) hy0Var.f2377b.invoke()).floatValue()) {
            return true;
        }
        ((Number) interfaceC0298hw.invoke()).floatValue();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m451w(ViewOnAttachStateChangeListenerC0078c4 viewOnAttachStateChangeListenerC0078c4, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        viewOnAttachStateChangeListenerC0078c4.m474v(i, i2, num, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m452A(b60 b60Var, vg0 vg0Var) {
        sz0 sz0VarM317x;
        if (b60Var.m272H() && !this.f669g.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(b60Var)) {
            b60 b60Var2 = null;
            if (!b60Var.f395I.m2600d(8)) {
                b60Var = b60Var.m315v();
                while (true) {
                    if (b60Var == null) {
                        b60Var = null;
                        break;
                    } else if (b60Var.f395I.m2600d(8)) {
                        break;
                    } else {
                        b60Var = b60Var.m315v();
                    }
                }
            }
            if (b60Var == null || (sz0VarM317x = b60Var.m317x()) == null) {
                return;
            }
            if (!sz0VarM317x.f5879f) {
                b60 b60VarM315v = b60Var.m315v();
                while (true) {
                    if (b60VarM315v != null) {
                        sz0 sz0VarM317x2 = b60VarM315v.m317x();
                        if (sz0VarM317x2 != null && sz0VarM317x2.f5879f) {
                            b60Var2 = b60VarM315v;
                            break;
                        }
                        b60VarM315v = b60VarM315v.m315v();
                    } else {
                        break;
                    }
                }
                if (b60Var2 != null) {
                    b60Var = b60Var2;
                }
            }
            int i = b60Var.f406e;
            if (vg0Var.m4744a(i)) {
                m451w(this, m471s(i), 2048, 1, 8);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m453B(b60 b60Var) {
        if (b60Var.m272H() && !this.f669g.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(b60Var)) {
            int i = b60Var.f406e;
            hy0 hy0Var = (hy0) this.f682t.m4248b(i);
            hy0 hy0Var2 = (hy0) this.f683u.m4248b(i);
            if (hy0Var == null && hy0Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventM463g = m463g(i, 4096);
            if (hy0Var != null) {
                accessibilityEventM463g.setScrollX((int) ((Number) hy0Var.f2376a.invoke()).floatValue());
                accessibilityEventM463g.setMaxScrollX((int) ((Number) hy0Var.f2377b.invoke()).floatValue());
            }
            if (hy0Var2 != null) {
                accessibilityEventM463g.setScrollY((int) ((Number) hy0Var2.f2376a.invoke()).floatValue());
                accessibilityEventM463g.setMaxScrollY((int) ((Number) hy0Var2.f2377b.invoke()).floatValue());
            }
            m473u(accessibilityEventM463g);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final boolean m454C(xz0 xz0Var, int i, int i2, boolean z) {
        String strM447l;
        sz0 sz0Var = xz0Var.f7471d;
        int i3 = xz0Var.f7474g;
        e01 e01Var = rz0.f5597j;
        if (sz0Var.f5877d.m1697c(e01Var) && rd0.m3478g(xz0Var)) {
            InterfaceC0941xw interfaceC0941xw = (InterfaceC0941xw) ((C0533o0) xz0Var.f7471d.m4137c(e01Var)).f4378b;
            if (interfaceC0941xw != null) {
                return ((Boolean) interfaceC0941xw.mo353a(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.f686x) && (strM447l = m447l(xz0Var)) != null) {
            if (i < 0 || i != i2 || i2 > strM447l.length()) {
                i = -1;
            }
            this.f686x = i;
            boolean z2 = strM447l.length() > 0;
            m473u(m464h(m471s(i3), z2 ? Integer.valueOf(this.f686x) : null, z2 ? Integer.valueOf(this.f686x) : null, z2 ? Integer.valueOf(strM447l.length()) : null, strM447l));
            m476y(i3);
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final Rect m455E(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = this.f669g;
        long jM4858r = viewTreeObserverOnGlobalLayoutListenerC0875w3.m4858r(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jM4858r2 = viewTreeObserverOnGlobalLayoutListenerC0875w3.m4858r((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jM4858r >> 32);
        int i2 = (int) (jM4858r2 >> 32);
        int i3 = (int) (jM4858r & 4294967295L);
        int i4 = (int) (jM4858r2 & 4294967295L);
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
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m456I() {
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
        vg0 vg0Var = new vg0();
        vg0 vg0Var2 = this.f656E;
        int[] iArr = vg0Var2.f6714b;
        long[] jArr3 = vg0Var2.f6713a;
        int length = jArr3.length - 2;
        ug0 ug0Var = this.f662K;
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
                            zz0 zz0Var = (zz0) m467k().m4248b(i7);
                            xz0 xz0Var = zz0Var != null ? zz0Var.f8062a : null;
                            if (xz0Var != null) {
                                if (!xz0Var.f7471d.f5877d.m1697c(b01.f325d)) {
                                    vg0Var.m4744a(i7);
                                    yz0 yz0Var = (yz0) ug0Var.m4248b(i7);
                                    if (yz0Var != null) {
                                        Object objM1701g = yz0Var.f7742a.f5877d.m1701g(b01.f325d);
                                        obj = (String) (objM1701g != null ? objM1701g : null);
                                    }
                                    m475x(i7, 32, obj);
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
        int[] iArr2 = vg0Var.f6714b;
        long[] jArr4 = vg0Var.f6713a;
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
                            int i14 = vg0Var2.f6715c;
                            int i15 = (i12 >>> 7) & i14;
                            i = i3;
                            int i16 = 0;
                            while (true) {
                                long[] jArr5 = vg0Var2.f6713a;
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
                                    if (vg0Var2.f6714b[iNumberOfTrailingZeros] == i11) {
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
                                vg0Var2.m4749f(i21);
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
        ug0Var.m4324c();
        u20 u20VarM467k = m467k();
        int[] iArr3 = u20VarM467k.f6112b;
        Object[] objArr = u20VarM467k.f6113c;
        long[] jArr6 = u20VarM467k.f6111a;
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
                            xz0 xz0Var2 = ((zz0) objArr[i25]).f8062a;
                            sz0 sz0Var = xz0Var2.f7471d;
                            e01 e01Var = b01.f325d;
                            if (sz0Var.f5877d.m1697c(e01Var) && vg0Var2.m4744a(i26)) {
                                m475x(i26, 16, (String) xz0Var2.f7471d.m4137c(e01Var));
                            }
                            ug0Var.m4330i(i26, new yz0(xz0Var2, m467k()));
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
        this.f663L = new yz0(this.f669g.getSemanticsOwner().m2a(), m467k());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0672r0
    /* JADX INFO: renamed from: a */
    public final C0111d mo457a(View view) {
        return this.f676n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m458b(int i, C0156e1 c0156e1, String str, Bundle bundle) {
        xz0 xz0Var;
        int i2;
        float fM800h;
        float fM800h2;
        float fM799g;
        float fM799g2;
        int i3;
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = c0156e1.f1256a;
        zz0 zz0Var = (zz0) m467k().m4248b(i);
        if (zz0Var == null || (xz0Var = zz0Var.f8062a) == null) {
            return;
        }
        b60 b60Var = xz0Var.f7470c;
        sz0 sz0Var = xz0Var.f7471d;
        jh0 jh0Var = sz0Var.f5877d;
        String strM447l = m447l(xz0Var);
        if (p30.m3002l(str, this.f659H)) {
            int iM4068d = this.f657F.m4068d(i);
            if (iM4068d != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM4068d);
                return;
            }
            return;
        }
        if (p30.m3002l(str, this.f660I)) {
            int iM4068d2 = this.f658G.m4068d(i);
            if (iM4068d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM4068d2);
                return;
            }
            return;
        }
        boolean zM1697c = jh0Var.m1697c(rz0.f5588a);
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w32 = this.f669g;
        boolean z = false;
        if (!zM1697c || bundle == null || !p30.m3002l(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            e01 e01Var = b01.f346y;
            if (jh0Var.m1697c(e01Var) && bundle != null && p30.m3002l(str, "androidx.compose.ui.semantics.testTag")) {
                Object objM1701g = jh0Var.m1701g(e01Var);
                String str2 = (String) (objM1701g == null ? null : objM1701g);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (p30.m3002l(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo.getExtras().putInt(str, xz0Var.f7474g);
                return;
            }
            if (p30.m3002l(str, "androidx.compose.ui.semantics.shapeType")) {
                Object objM1701g2 = jh0Var.m1701g(b01.f321N);
                x01 x01Var = (x01) (objM1701g2 == null ? null : objM1701g2);
                if (x01Var != null) {
                    Rect rect = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect);
                    st0 st0VarM468m = m468m(xz0Var, rect, x01Var);
                    float f = st0VarM468m.f5833b;
                    float f2 = st0VarM468m.f5832a;
                    v50 v50VarMo737a = x01Var.mo737a(st0VarM468m.m4102b(), b60Var.f389C, viewTreeObserverOnGlobalLayoutListenerC0875w32.getDensity());
                    if (v50VarMo737a instanceof xm0) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m443D(v50VarMo737a, f2, f));
                        return;
                    } else if (v50VarMo737a instanceof ym0) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m443D(v50VarMo737a, f2, f));
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m444F(v50VarMo737a));
                        return;
                    } else if (!(v50VarMo737a instanceof wm0)) {
                        C0921xc.m5129j();
                        return;
                    } else {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m445G(v50VarMo737a, f2, f));
                        return;
                    }
                }
                return;
            }
            if (p30.m3002l(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object objM1701g3 = jh0Var.m1701g(b01.f321N);
                x01 x01Var2 = (x01) (objM1701g3 == null ? null : objM1701g3);
                if (x01Var2 != null) {
                    Rect rect2 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect2);
                    st0 st0VarM468m2 = m468m(xz0Var, rect2, x01Var2);
                    Rect rectM443D = m443D(x01Var2.mo737a(st0VarM468m2.m4102b(), b60Var.f389C, viewTreeObserverOnGlobalLayoutListenerC0875w32.getDensity()), st0VarM468m2.f5832a, st0VarM468m2.f5833b);
                    if (rectM443D != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectM443D);
                        return;
                    }
                    return;
                }
                return;
            }
            if (p30.m3002l(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object objM1701g4 = jh0Var.m1701g(b01.f321N);
                x01 x01Var3 = (x01) (objM1701g4 == null ? null : objM1701g4);
                if (x01Var3 != null) {
                    Rect rect3 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect3);
                    float[] fArrM444F = m444F(x01Var3.mo737a(m468m(xz0Var, rect3, x01Var3).m4102b(), b60Var.f389C, viewTreeObserverOnGlobalLayoutListenerC0875w32.getDensity()));
                    if (fArrM444F != null) {
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM444F);
                        return;
                    }
                    return;
                }
                return;
            }
            if (p30.m3002l(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object objM1701g5 = jh0Var.m1701g(b01.f321N);
                x01 x01Var4 = (x01) (objM1701g5 == null ? null : objM1701g5);
                if (x01Var4 != null) {
                    Rect rect4 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect4);
                    st0 st0VarM468m3 = m468m(xz0Var, rect4, x01Var4);
                    Region regionM445G = m445G(x01Var4.mo737a(st0VarM468m3.m4102b(), b60Var.f389C, viewTreeObserverOnGlobalLayoutListenerC0875w32.getDensity()), st0VarM468m3.f5832a, st0VarM468m3.f5833b);
                    if (regionM445G != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionM445G);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i5 > 0 && i4 >= 0) {
            if (i4 < (strM447l != null ? strM447l.length() : Integer.MAX_VALUE)) {
                g71 g71VarM4273p = u50.m4273p(sz0Var);
                if (g71VarM4273p == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i6 = 0;
                while (i6 < i5) {
                    int i7 = i4 + i6;
                    if (i7 >= g71VarM4273p.f1879a.f1614a.f1625e.length()) {
                        arrayList.add(z);
                        i2 = i4;
                        i3 = i5;
                        viewTreeObserverOnGlobalLayoutListenerC0875w3 = viewTreeObserverOnGlobalLayoutListenerC0875w32;
                    } else {
                        ng0 ng0Var = g71VarM4273p.f1880b;
                        C0200f8 c0200f8 = (C0200f8) ((C0681r9) ng0Var.f4260c).f5327a;
                        if (i7 < 0 || i7 >= c0200f8.f1625e.length()) {
                            x10.m5082a("offset(" + i7 + ") is out of bounds [0, " + c0200f8.f1625e.length() + ')');
                        }
                        ArrayList arrayList2 = (ArrayList) ng0Var.f4262e;
                        wo0 wo0Var = (wo0) arrayList2.get(w60.m4910q(i7, arrayList2));
                        C0951y5 c0951y5 = wo0Var.f7159a;
                        int iM5013a = wo0Var.m5013a(i7);
                        CharSequence charSequence = c0951y5.f7541e;
                        if (iM5013a < 0 || iM5013a >= charSequence.length()) {
                            x10.m5082a("offset(" + iM5013a + ") is out of bounds [0," + charSequence.length() + ')');
                        }
                        e71 e71Var = c0951y5.f7540d;
                        Layout layout = e71Var.f1326e;
                        int lineForOffset = layout.getLineForOffset(iM5013a);
                        float fM798f = e71Var.m798f(lineForOffset);
                        float fM796d = e71Var.m796d(lineForOffset);
                        i2 = i4;
                        boolean z2 = layout.getParagraphDirection(lineForOffset) == 1;
                        boolean zIsRtlCharAt = layout.isRtlCharAt(iM5013a);
                        if (!z2 || zIsRtlCharAt) {
                            if (z2 && zIsRtlCharAt) {
                                fM799g = e71Var.m800h(iM5013a, false);
                                fM799g2 = e71Var.m800h(iM5013a + 1, true);
                            } else if (zIsRtlCharAt) {
                                fM799g = e71Var.m799g(iM5013a, false);
                                fM799g2 = e71Var.m799g(iM5013a + 1, true);
                            } else {
                                fM800h = e71Var.m800h(iM5013a, false);
                                fM800h2 = e71Var.m800h(iM5013a + 1, true);
                            }
                            float f3 = fM799g;
                            fM800h = fM799g2;
                            fM800h2 = f3;
                        } else {
                            fM800h = e71Var.m799g(iM5013a, false);
                            fM800h2 = e71Var.m799g(iM5013a + 1, true);
                        }
                        RectF rectF2 = new RectF(fM800h, fM798f, fM800h2, fM796d);
                        float f4 = rectF2.left;
                        float f5 = rectF2.top;
                        float f6 = rectF2.right;
                        float f7 = rectF2.bottom;
                        i3 = i5;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(wo0Var.f7164f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
                        viewTreeObserverOnGlobalLayoutListenerC0875w3 = viewTreeObserverOnGlobalLayoutListenerC0875w32;
                        int i8 = (int) (jFloatToRawIntBits >> 32);
                        int i9 = (int) (jFloatToRawIntBits & 4294967295L);
                        st0 st0Var = new st0(Float.intBitsToFloat(i8) + f4, Float.intBitsToFloat(i9) + f5, Float.intBitsToFloat(i8) + f6, Float.intBitsToFloat(i9) + f7);
                        qj0 qj0VarM5182d = xz0Var.m5182d();
                        long jM3275P0 = 0;
                        if (qj0VarM5182d != null) {
                            if (!qj0VarM5182d.mo436G0().f4542q) {
                                qj0VarM5182d = null;
                            }
                            if (qj0VarM5182d != null) {
                                jM3275P0 = qj0VarM5182d.m3275P0(0L);
                            }
                        }
                        st0 st0VarM4105e = st0Var.m4105e(jM3275P0);
                        st0 st0VarM5185g = xz0Var.m5185g();
                        st0 st0VarM4103c = ((((st0VarM4105e.f5832a > st0VarM5185g.f5834c ? 1 : (st0VarM4105e.f5832a == st0VarM5185g.f5834c ? 0 : -1)) < 0) & ((st0VarM5185g.f5832a > st0VarM4105e.f5834c ? 1 : (st0VarM5185g.f5832a == st0VarM4105e.f5834c ? 0 : -1)) < 0)) & ((st0VarM4105e.f5833b > st0VarM5185g.f5835d ? 1 : (st0VarM4105e.f5833b == st0VarM5185g.f5835d ? 0 : -1)) < 0)) & ((st0VarM5185g.f5833b > st0VarM4105e.f5835d ? 1 : (st0VarM5185g.f5833b == st0VarM4105e.f5835d ? 0 : -1)) < 0) ? st0VarM4105e.m4103c(st0VarM5185g) : null;
                        if (st0VarM4103c != null) {
                            long jM4858r = viewTreeObserverOnGlobalLayoutListenerC0875w3.m4858r((((long) Float.floatToRawIntBits(st0VarM4103c.f5832a)) << 32) | (((long) Float.floatToRawIntBits(st0VarM4103c.f5833b)) & 4294967295L));
                            long jM4858r2 = viewTreeObserverOnGlobalLayoutListenerC0875w3.m4858r((((long) Float.floatToRawIntBits(st0VarM4103c.f5835d)) & 4294967295L) | (((long) Float.floatToRawIntBits(st0VarM4103c.f5834c)) << 32));
                            int i10 = (int) (jM4858r >> 32);
                            int i11 = (int) (jM4858r2 >> 32);
                            int i12 = (int) (jM4858r & 4294967295L);
                            int i13 = (int) (jM4858r2 & 4294967295L);
                            rectF = new RectF(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i6++;
                    i4 = i2;
                    i5 = i3;
                    viewTreeObserverOnGlobalLayoutListenerC0875w32 = viewTreeObserverOnGlobalLayoutListenerC0875w3;
                    z = false;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Rect m459c(zz0 zz0Var) {
        a30 a30Var = zz0Var.f8063b;
        return m455E(a30Var.f39a, a30Var.f40b, a30Var.f41c, a30Var.f42d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
    
        if (p000.s91.m4056u(r4, r2) == r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:34:0x0085, B:35:0x0094, B:37:0x009c, B:20:0x0046, B:23:0x004d), top: B:57:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f1 -> B:50:0x00f4). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m460d(AbstractC0358jk abstractC0358jk) throws Throwable {
        C0986z3 c0986z3;
        C0164e9 c0164e9;
        vg0 vg0Var;
        C0797ub c0797ub;
        vg0 vg0Var2;
        C0797ub c0797ub2;
        int i;
        long j;
        Object objM4292b;
        if (abstractC0358jk instanceof C0986z3) {
            c0986z3 = (C0986z3) abstractC0358jk;
            int i2 = c0986z3.f7784k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0986z3.f7784k = i2 - Integer.MIN_VALUE;
            } else {
                c0986z3 = new C0986z3(this, abstractC0358jk);
            }
        }
        Object obj = c0986z3.f7782i;
        int i3 = c0986z3.f7784k;
        C0164e9 c0164e92 = this.f688z;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        try {
            if (i3 == 0) {
                w60.m4891M(obj);
                vg0Var = new vg0();
                C0834vb c0834vb = this.f652A;
                c0834vb.getClass();
                c0797ub = new C0797ub(c0834vb);
                c0986z3.f7780g = vg0Var;
                c0986z3.f7781h = c0797ub;
                c0986z3.f7784k = 1;
                objM4292b = c0797ub.m4292b(c0986z3);
                if (objM4292b != enumC1007zk) {
                }
            } else if (i3 == 1) {
                c0797ub2 = c0986z3.f7781h;
                vg0Var2 = c0986z3.f7780g;
                w60.m4891M(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i3 != 2) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c0797ub2 = c0986z3.f7781h;
                vg0Var2 = c0986z3.f7780g;
                w60.m4891M(obj);
                char c = 2;
                c0164e9 = c0164e92;
                vg0Var = vg0Var2;
                c0164e92 = c0164e9;
                c0797ub = c0797ub2;
                c0986z3.f7780g = vg0Var;
                c0986z3.f7781h = c0797ub;
                c0986z3.f7784k = 1;
                objM4292b = c0797ub.m4292b(c0986z3);
                if (objM4292b != enumC1007zk) {
                    return enumC1007zk;
                }
                C0797ub c0797ub3 = c0797ub;
                vg0Var2 = vg0Var;
                obj = objM4292b;
                c0797ub2 = c0797ub3;
                if (((Boolean) obj).booleanValue()) {
                    c0164e92.clear();
                    return na1.f4229a;
                }
                c0797ub2.m4293c();
                if (m469n()) {
                    int i4 = c0164e92.f1352f;
                    for (int i5 = 0; i5 < i4; i5++) {
                        b60 b60Var = (b60) c0164e92.f1351e[i5];
                        m452A(b60Var, vg0Var2);
                        m453B(b60Var);
                    }
                    vg0Var2.f6716d = 0;
                    long[] jArr = vg0Var2.f6713a;
                    if (jArr != dy0.f1212a) {
                        try {
                            AbstractC0201f9.m1062h0(-9187201950435737472L, jArr);
                            long[] jArr2 = vg0Var2.f6713a;
                            i = vg0Var2.f6715c;
                            int i6 = i >> 3;
                            jArr2[i6] = ((~j) & jArr2[i6]) | j;
                        } catch (Throwable th) {
                            th = th;
                            c0164e9.clear();
                            throw th;
                        }
                        j = 255 << ((i & 7) << 3);
                        c0164e9 = c0164e92;
                    } else {
                        c0164e9 = c0164e92;
                    }
                    vg0Var2.f6717e = dy0.m738a(vg0Var2.f6715c) - vg0Var2.f6716d;
                    if (!this.f664M) {
                        this.f664M = true;
                        this.f675m.post(this.f666O);
                    }
                } else {
                    c0164e9 = c0164e92;
                }
                c0164e9.clear();
                this.f682t.m4324c();
                this.f683u.m4324c();
                long j2 = this.f673k;
                c0986z3.f7780g = vg0Var2;
                c0986z3.f7781h = c0797ub2;
                c = 2;
                c0986z3.f7784k = 2;
            }
        } catch (Throwable th2) {
            th = th2;
            c0164e9 = c0164e92;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m461e(boolean z, int i, long j) {
        e01 e01Var;
        int i2;
        if (p30.m3002l(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            u20 u20VarM467k = m467k();
            if (!ok0.m2931b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    e01Var = b01.f343v;
                } else {
                    if (z) {
                        C0921xc.m5129j();
                        return false;
                    }
                    e01Var = b01.f342u;
                }
                Object[] objArr = u20VarM467k.f6113c;
                long[] jArr = u20VarM467k.f6111a;
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
                                    zz0 zz0Var = (zz0) objArr[(i3 << 3) + i6];
                                    a30 a30Var = zz0Var.f8063b;
                                    float f = a30Var.f39a;
                                    i2 = i4;
                                    float f2 = a30Var.f40b;
                                    float f3 = a30Var.f41c;
                                    float f4 = a30Var.f42d;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                                        Object objM1701g = zz0Var.f8062a.f7471d.f5877d.m1701g(e01Var);
                                        if (objM1701g == null) {
                                            objM1701g = null;
                                        }
                                        hy0 hy0Var = (hy0) objM1701g;
                                        if (hy0Var != null) {
                                            InterfaceC0298hw interfaceC0298hw = hy0Var.f2376a;
                                            if (i < 0) {
                                                if (((Number) interfaceC0298hw.invoke()).floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (((Number) interfaceC0298hw.invoke()).floatValue() < ((Number) hy0Var.f2377b.invoke()).floatValue()) {
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
    /* JADX INFO: renamed from: f */
    public final void m462f() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m469n()) {
                m472t(this.f669g.getSemanticsOwner().m2a(), this.f663L);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                m477z(m467k());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    m456I();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final AccessibilityEvent m463g(int i, int i2) {
        zz0 zz0Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = this.f669g;
        accessibilityEventObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC0875w3.getContext().getPackageName());
        accessibilityEventObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC0875w3, i);
        if (m469n() && (zz0Var = (zz0) m467k().m4248b(i)) != null) {
            xz0 xz0Var = zz0Var.f8062a;
            accessibilityEventObtain.setPassword(xz0Var.f7471d.f5877d.m1697c(b01.f316I));
            Object objM1701g = xz0Var.f7471d.f5877d.m1701g(b01.f335n);
            if (objM1701g == null) {
                objM1701g = null;
            }
            boolean zM3002l = p30.m3002l(objM1701g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0709s0.m3996f(accessibilityEventObtain, zM3002l);
            }
        }
        return accessibilityEventObtain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final AccessibilityEvent m464h(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventM463g = m463g(i, 8192);
        if (num != null) {
            accessibilityEventM463g.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventM463g.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventM463g.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventM463g.getText().add(charSequence);
        }
        return accessibilityEventM463g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final int m465i(xz0 xz0Var) {
        sz0 sz0Var = xz0Var.f7471d;
        if (!sz0Var.f5877d.m1697c(b01.f322a)) {
            e01 e01Var = b01.f313F;
            if (sz0Var.f5877d.m1697c(e01Var)) {
                return (int) (((l71) sz0Var.m4137c(e01Var)).f3382a & 4294967295L);
            }
        }
        return this.f686x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m466j(xz0 xz0Var) {
        sz0 sz0Var = xz0Var.f7471d;
        if (!sz0Var.f5877d.m1697c(b01.f322a)) {
            e01 e01Var = b01.f313F;
            if (sz0Var.f5877d.m1697c(e01Var)) {
                return (int) (((l71) sz0Var.m4137c(e01Var)).f3382a >> 32);
            }
        }
        return this.f686x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final u20 m467k() {
        if (this.f653B) {
            this.f653B = false;
            ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = this.f669g;
            this.f655D = AbstractC0307i4.m1542r(viewTreeObserverOnGlobalLayoutListenerC0875w3.getSemanticsOwner(), C0601p3.f4712f);
            if (m469n()) {
                ug0 ug0Var = this.f655D;
                Resources resources = viewTreeObserverOnGlobalLayoutListenerC0875w3.getContext().getResources();
                sg0 sg0Var = this.f657F;
                sg0Var.m4065a();
                sg0 sg0Var2 = this.f658G;
                sg0Var2.m4065a();
                zz0 zz0Var = (zz0) ug0Var.m4248b(-1);
                xz0 xz0Var = zz0Var != null ? zz0Var.f8062a : null;
                xz0Var.getClass();
                ArrayList arrayListM1273b = h01.m1273b(xz0Var, new C0711s2(3, ug0Var), new C0711s2(4, resources), o30.m2782v(xz0Var));
                int i = 1;
                int size = arrayListM1273b.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((xz0) arrayListM1273b.get(i - 1)).f7474g;
                        int i3 = ((xz0) arrayListM1273b.get(i)).f7474g;
                        sg0Var.m4070f(i2, i3);
                        sg0Var2.m4070f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.f655D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[LOOP:0: B:4:0x0014->B:36:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076 A[EDGE_INSN: B:47:0x0076->B:37:0x0076 BREAK  A[LOOP:0: B:4:0x0014->B:36:0x0073], SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final st0 m468m(xz0 xz0Var, Rect rect, x01 x01Var) {
        C0005a4 c0005a4 = new C0005a4(x01Var);
        b60 b60Var = xz0Var.f7470c;
        oe0 oe0Var = b60Var.f395I.f3998f;
        InterfaceC0694rm interfaceC0694rm = null;
        if ((oe0Var.f4532g & 8) != 0) {
            loop0: while (true) {
                if (oe0Var == null) {
                    break;
                }
                if ((oe0Var.f4531f & 8) != 0) {
                    oe0 oe0VarM3050f = oe0Var;
                    sh0 sh0Var = null;
                    while (oe0VarM3050f != null) {
                        if (oe0VarM3050f instanceof vz0) {
                            ((vz0) oe0VarM3050f).mo757S(c0005a4);
                            if (c0005a4.f52d) {
                                interfaceC0694rm = oe0VarM3050f;
                                break loop0;
                            }
                        } else if ((oe0VarM3050f.f4531f & 8) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                            int i = 0;
                            for (oe0 oe0Var2 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var2 != null; oe0Var2 = oe0Var2.f4534i) {
                                if ((oe0Var2.f4531f & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        oe0VarM3050f = oe0Var2;
                                    } else {
                                        if (sh0Var == null) {
                                            sh0Var = new sh0(new oe0[16]);
                                        }
                                        if (oe0VarM3050f != null) {
                                            sh0Var.m4072b(oe0VarM3050f);
                                            oe0VarM3050f = null;
                                        }
                                        sh0Var.m4072b(oe0Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        oe0VarM3050f = pf1.m3050f(sh0Var);
                    }
                    if ((oe0Var.f4532g & 8) != 0) {
                        break;
                    }
                    oe0Var = oe0Var.f4534i;
                } else if ((oe0Var.f4532g & 8) != 0) {
                }
            }
        }
        InterfaceC0694rm interfaceC0694rm2 = (vz0) interfaceC0694rm;
        if (interfaceC0694rm2 == null || !((oe0) interfaceC0694rm2).f4529d.f4542q) {
            return j50.m1658h(b60Var.f395I.f3996d, false);
        }
        qj0 qj0VarM3038P = pf1.m3038P(interfaceC0694rm2);
        st0 st0VarMo341B = j50.m1662l(qj0VarM3038P).mo341B(qj0VarM3038P, true);
        Rect rectM455E = m455E(st0VarMo341B.f5832a, st0VarMo341B.f5833b, st0VarMo341B.f5834c, st0VarMo341B.f5835d);
        float f = rectM455E.left - rect.left;
        float f2 = rectM455E.top - rect.top;
        return new st0(f, f2, rectM455E.width() + f, rectM455E.height() + f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final boolean m469n() {
        AccessibilityManager accessibilityManager = this.f672j;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f674l;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f674l = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m470o(b60 b60Var) {
        if (this.f688z.add(b60Var)) {
            this.f652A.mo1710s(na1.f4229a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f674l = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f674l = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f672j;
        if (accessibilityManager.isEnabled()) {
            this.f674l = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f675m.removeCallbacks(this.f666O);
        AccessibilityManager accessibilityManager = this.f672j;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final int m471s(int i) {
        if (i == this.f669g.getSemanticsOwner().m2a().f7474g) {
            return -1;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m472t(xz0 xz0Var, yz0 yz0Var) {
        int[] iArr = c30.f649a;
        vg0 vg0Var = new vg0();
        List listM5178j = xz0.m5178j(4, xz0Var);
        b60 b60Var = xz0Var.f7470c;
        int size = listM5178j.size();
        for (int i = 0; i < size; i++) {
            xz0 xz0Var2 = (xz0) listM5178j.get(i);
            u20 u20VarM467k = m467k();
            int i2 = xz0Var2.f7474g;
            if (u20VarM467k.m4247a(i2)) {
                if (!yz0Var.f7743b.m4745b(i2)) {
                    m470o(b60Var);
                    return;
                }
                vg0Var.m4744a(i2);
            }
        }
        vg0 vg0Var2 = yz0Var.f7743b;
        int[] iArr2 = vg0Var2.f6714b;
        long[] jArr = vg0Var2.f6713a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !vg0Var.m4745b(iArr2[(i3 << 3) + i5])) {
                            m470o(b60Var);
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
        List listM5178j2 = xz0.m5178j(4, xz0Var);
        int size2 = listM5178j2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            xz0 xz0Var3 = (xz0) listM5178j2.get(i6);
            yz0 yz0Var2 = (yz0) this.f662K.m4248b(xz0Var3.f7474g);
            if (yz0Var2 != null && m467k().m4247a(xz0Var3.f7474g)) {
                m472t(xz0Var3, yz0Var2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final boolean m473u(AccessibilityEvent accessibilityEvent) {
        if (!m469n()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f681s = true;
        }
        try {
            return ((Boolean) this.f671i.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f681s = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final boolean m474v(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !m469n()) {
            return false;
        }
        AccessibilityEvent accessibilityEventM463g = m463g(i, i2);
        if (num != null) {
            accessibilityEventM463g.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventM463g.setContentDescription(ya0.m5226a(list, ",", null, 62));
        }
        return m473u(accessibilityEventM463g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m475x(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventM463g = m463g(m471s(i), 32);
        accessibilityEventM463g.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventM463g.getText().add(str);
        }
        m473u(accessibilityEventM463g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m476y(int i) {
        C0949y3 c0949y3 = this.f654C;
        if (c0949y3 != null) {
            xz0 xz0Var = c0949y3.f7500a;
            if (i != xz0Var.f7474g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c0949y3.f7505f <= 1000) {
                AccessibilityEvent accessibilityEventM463g = m463g(m471s(xz0Var.f7474g), MethodData.ACC_DECLARED_SYNCHRONIZED);
                accessibilityEventM463g.setFromIndex(c0949y3.f7503d);
                accessibilityEventM463g.setToIndex(c0949y3.f7504e);
                accessibilityEventM463g.setAction(c0949y3.f7501b);
                accessibilityEventM463g.setMovementGranularity(c0949y3.f7502c);
                accessibilityEventM463g.getText().add(m447l(xz0Var));
                m473u(accessibilityEventM463g);
            }
        }
        this.f654C = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m477z(u20 u20Var) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        Integer num;
        int i;
        int i2;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        int i5;
        int i6;
        Integer num2;
        sz0 sz0Var;
        xz0 xz0Var;
        boolean z;
        int i7;
        boolean z2;
        boolean z3;
        jh0 jh0Var;
        b60 b60Var;
        int i8;
        sz0 sz0Var2;
        ArrayList arrayList3;
        long j;
        int i9;
        int i10;
        int i11;
        b60 b60Var2;
        Integer num3;
        int i12;
        jh0 jh0Var2;
        int i13;
        int i14;
        my0 my0Var;
        boolean z4;
        my0 my0Var2;
        InterfaceC0188ex interfaceC0188ex;
        int i15;
        String str;
        int i16;
        int i17;
        int i18;
        jh0 jh0Var3;
        Integer num4;
        AccessibilityEvent accessibilityEventM464h;
        Integer num5;
        u20 u20Var2 = u20Var;
        ArrayList arrayList4 = this.f667P;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = u20Var2.f6112b;
        long[] jArr3 = u20Var2.f6111a;
        int i19 = 2;
        int length = jArr3.length - 2;
        int i20 = 0;
        Integer num6 = 0;
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
                        yz0 yz0Var = (yz0) this.f662K.m4248b(i27);
                        if (yz0Var == null) {
                            i2 = i26;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i3 = i24;
                            i4 = i25;
                            i5 = i21;
                            i6 = i22;
                            num2 = num6;
                        } else {
                            sz0 sz0Var3 = yz0Var.f7742a;
                            jh0 jh0Var4 = sz0Var3.f5877d;
                            zz0 zz0Var = (zz0) u20Var2.m4248b(i27);
                            int i28 = i24;
                            xz0 xz0Var2 = zz0Var != null ? zz0Var.f8062a : null;
                            if (xz0Var2 == null) {
                                throw AbstractC0748t1.m4149g("no value for specified key");
                            }
                            b60 b60Var3 = xz0Var2.f7470c;
                            sz0 sz0Var4 = xz0Var2.f7471d;
                            iArr2 = iArr3;
                            int i29 = xz0Var2.f7474g;
                            jArr2 = jArr3;
                            jh0 jh0Var5 = sz0Var4.f5877d;
                            i5 = i21;
                            Object[] objArr = jh0Var5.f2879b;
                            Object[] objArr2 = jh0Var5.f2880c;
                            long[] jArr4 = jh0Var5.f2878a;
                            i2 = i26;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                b60 b60Var4 = b60Var3;
                                i4 = i25;
                                int i30 = 0;
                                z2 = false;
                                while (true) {
                                    long j4 = jArr4[i30];
                                    xz0Var = xz0Var2;
                                    int i31 = i30;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i32 = 8 - ((~(i31 - length2)) >>> 31);
                                        int i33 = 0;
                                        while (i33 < i32) {
                                            if ((j4 & 255) < 128) {
                                                int i34 = (i31 << 3) + i33;
                                                Object obj = objArr[i34];
                                                int i35 = length2;
                                                Object obj2 = objArr2[i34];
                                                sz0Var2 = sz0Var3;
                                                e01 e01Var = (e01) obj;
                                                j = j4;
                                                e01 e01Var2 = b01.f342u;
                                                if (p30.m3002l(e01Var, e01Var2) || p30.m3002l(e01Var, b01.f343v)) {
                                                    int size = arrayList5.size();
                                                    i10 = i33;
                                                    int i36 = 0;
                                                    while (true) {
                                                        if (i36 >= size) {
                                                            my0Var = null;
                                                            break;
                                                        }
                                                        int i37 = size;
                                                        if (((my0) arrayList5.get(i36)).f4076d == i27) {
                                                            my0Var = (my0) arrayList5.get(i36);
                                                            break;
                                                        } else {
                                                            i36++;
                                                            size = i37;
                                                        }
                                                    }
                                                    if (my0Var != null) {
                                                        z4 = false;
                                                    } else {
                                                        my0Var = new my0(i27, arrayList4);
                                                        z4 = true;
                                                    }
                                                    arrayList4.add(my0Var);
                                                } else {
                                                    i10 = i33;
                                                    z4 = false;
                                                }
                                                if (z4) {
                                                    e01 e01Var3 = b01.f325d;
                                                    if (p30.m3002l(e01Var, e01Var3)) {
                                                        obj2.getClass();
                                                        String str2 = (String) obj2;
                                                        if (jh0Var4.m1697c(e01Var3)) {
                                                            m475x(i27, i28, str2);
                                                        }
                                                        i12 = i27;
                                                        arrayList3 = arrayList5;
                                                        i9 = i32;
                                                        i11 = i22;
                                                        b60Var2 = b60Var4;
                                                        i13 = 8;
                                                        num3 = num6;
                                                        jh0Var2 = jh0Var4;
                                                        i14 = i35;
                                                    } else if (p30.m3002l(e01Var, b01.f323b) || p30.m3002l(e01Var, b01.f315H)) {
                                                        i12 = i27;
                                                        arrayList3 = arrayList5;
                                                        i9 = i32;
                                                        i11 = i22;
                                                        b60Var2 = b60Var4;
                                                        num3 = num6;
                                                        jh0Var2 = jh0Var4;
                                                        i14 = i35;
                                                        i13 = 8;
                                                        m451w(this, m471s(i12), 2048, 64, 8);
                                                        m451w(this, m471s(i12), 2048, num3, 8);
                                                    } else if (p30.m3002l(e01Var, b01.f324c)) {
                                                        m451w(this, m471s(i27), 2048, 64, 8);
                                                        m451w(this, m471s(i27), 2048, num6, 8);
                                                        i12 = i27;
                                                        arrayList3 = arrayList5;
                                                        i13 = 8;
                                                        i9 = i32;
                                                        i11 = i22;
                                                        b60Var2 = b60Var4;
                                                        num3 = num6;
                                                        jh0Var2 = jh0Var4;
                                                        i14 = i35;
                                                    } else {
                                                        e01 e01Var4 = b01.f314G;
                                                        arrayList3 = arrayList5;
                                                        if (p30.m3002l(e01Var, e01Var4)) {
                                                            Object objM1701g = jh0Var5.m1701g(b01.f345x);
                                                            if (objM1701g == null) {
                                                                objM1701g = null;
                                                            }
                                                            xv0 xv0Var = (xv0) objM1701g;
                                                            if (xv0Var != null && xv0Var.f7427a == 4) {
                                                                Object objM1701g2 = jh0Var5.m1701g(e01Var4);
                                                                if (objM1701g2 == null) {
                                                                    objM1701g2 = null;
                                                                }
                                                                if (p30.m3002l(objM1701g2, Boolean.TRUE)) {
                                                                    AccessibilityEvent accessibilityEventM463g = m463g(m471s(i27), 4);
                                                                    xz0 xz0Var3 = xz0Var;
                                                                    b60Var2 = b60Var4;
                                                                    xz0 xz0Var4 = new xz0(xz0Var3.f7468a, true, b60Var2, sz0Var4);
                                                                    Object objM1701g3 = xz0Var4.m5188k().f5877d.m1701g(b01.f322a);
                                                                    if (objM1701g3 == null) {
                                                                        objM1701g3 = null;
                                                                    }
                                                                    List list = (List) objM1701g3;
                                                                    xz0Var = xz0Var3;
                                                                    String strM5226a = list != null ? ya0.m5226a(list, ",", null, 62) : null;
                                                                    Object objM1701g4 = xz0Var4.m5188k().f5877d.m1701g(b01.f308A);
                                                                    if (objM1701g4 == null) {
                                                                        objM1701g4 = null;
                                                                    }
                                                                    List list2 = (List) objM1701g4;
                                                                    i9 = i32;
                                                                    String strM5226a2 = list2 != null ? ya0.m5226a(list2, ",", null, 62) : null;
                                                                    if (strM5226a != null) {
                                                                        accessibilityEventM463g.setContentDescription(strM5226a);
                                                                    }
                                                                    if (strM5226a2 != null) {
                                                                        accessibilityEventM463g.getText().add(strM5226a2);
                                                                    }
                                                                    m473u(accessibilityEventM463g);
                                                                } else {
                                                                    i9 = i32;
                                                                    b60Var2 = b60Var4;
                                                                    m451w(this, m471s(i27), 2048, num6, 8);
                                                                }
                                                            } else {
                                                                i9 = i32;
                                                                b60Var2 = b60Var4;
                                                                m451w(this, m471s(i27), 2048, 64, 8);
                                                                m451w(this, m471s(i27), 2048, num6, 8);
                                                            }
                                                            num3 = num6;
                                                            i12 = i27;
                                                            jh0Var2 = jh0Var4;
                                                            i11 = i22;
                                                            i14 = i35;
                                                            i13 = 8;
                                                        } else {
                                                            i9 = i32;
                                                            b60Var2 = b60Var4;
                                                            if (p30.m3002l(e01Var, b01.f322a)) {
                                                                int iM471s = m471s(i27);
                                                                obj2.getClass();
                                                                m474v(iM471s, 2048, 4, (List) obj2);
                                                                num3 = num6;
                                                                i12 = i27;
                                                                jh0Var2 = jh0Var4;
                                                            } else {
                                                                e01 e01Var5 = b01.f312E;
                                                                String str3 = "";
                                                                if (!p30.m3002l(e01Var, e01Var5)) {
                                                                    Integer num7 = num6;
                                                                    i12 = i27;
                                                                    jh0Var2 = jh0Var4;
                                                                    e01 e01Var6 = b01.f313F;
                                                                    if (p30.m3002l(e01Var, e01Var6)) {
                                                                        Object objM1701g5 = jh0Var5.m1701g(e01Var5);
                                                                        if (objM1701g5 == null) {
                                                                            objM1701g5 = null;
                                                                        }
                                                                        C0200f8 c0200f8 = (C0200f8) objM1701g5;
                                                                        if (c0200f8 != null && (str = c0200f8.f1625e) != null) {
                                                                            str3 = str;
                                                                        }
                                                                        long j5 = ((l71) sz0Var4.m4137c(e01Var6)).f3382a;
                                                                        num3 = num7;
                                                                        m473u(m464h(m471s(i12), Integer.valueOf((int) (j5 >> 32)), Integer.valueOf((int) (j5 & 4294967295L)), Integer.valueOf(str3.length()), m446H(str3)));
                                                                        m476y(i29);
                                                                    } else {
                                                                        i14 = i35;
                                                                        num3 = num7;
                                                                        if (p30.m3002l(e01Var, e01Var2) || p30.m3002l(e01Var, b01.f343v)) {
                                                                            m470o(b60Var2);
                                                                            int size2 = arrayList4.size();
                                                                            int i38 = 0;
                                                                            while (true) {
                                                                                if (i38 >= size2) {
                                                                                    my0Var2 = null;
                                                                                    break;
                                                                                } else {
                                                                                    if (((my0) arrayList4.get(i38)).f4076d == i12) {
                                                                                        my0Var2 = (my0) arrayList4.get(i38);
                                                                                        break;
                                                                                    }
                                                                                    i38++;
                                                                                }
                                                                            }
                                                                            my0Var2.getClass();
                                                                            Object objM1701g6 = jh0Var5.m1701g(e01Var2);
                                                                            if (objM1701g6 == null) {
                                                                                objM1701g6 = null;
                                                                            }
                                                                            my0Var2.f4080h = (hy0) objM1701g6;
                                                                            Object objM1701g7 = jh0Var5.m1701g(b01.f343v);
                                                                            if (objM1701g7 == null) {
                                                                                objM1701g7 = null;
                                                                            }
                                                                            my0Var2.f4081i = (hy0) objM1701g7;
                                                                            if (my0Var2.f4077e.contains(my0Var2)) {
                                                                                i11 = i22;
                                                                                this.f669g.getSnapshotObserver().f1778a.m777b(my0Var2, this.f668Q, new C0458m3(i11, my0Var2, this));
                                                                            }
                                                                            i13 = 8;
                                                                        } else if (p30.m3002l(e01Var, b01.f332k)) {
                                                                            obj2.getClass();
                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                i15 = 8;
                                                                                m473u(m463g(m471s(i29), 8));
                                                                            } else {
                                                                                i15 = 8;
                                                                            }
                                                                            m451w(this, m471s(i29), 2048, num3, i15);
                                                                            i13 = i15;
                                                                            i11 = i22;
                                                                        } else {
                                                                            e01 e01Var7 = rz0.f5610w;
                                                                            if (p30.m3002l(e01Var, e01Var7)) {
                                                                                List list3 = (List) sz0Var4.m4137c(e01Var7);
                                                                                Object objM1701g8 = jh0Var2.m1701g(e01Var7);
                                                                                if (objM1701g8 == null) {
                                                                                    objM1701g8 = null;
                                                                                }
                                                                                List list4 = (List) objM1701g8;
                                                                                if (list4 != null) {
                                                                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                    if (list3.size() > 0) {
                                                                                        list3.get(0).getClass();
                                                                                        C0921xc.m5123d();
                                                                                        return;
                                                                                    }
                                                                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                    if (list4.size() > 0) {
                                                                                        list4.get(0).getClass();
                                                                                        C0921xc.m5123d();
                                                                                        return;
                                                                                    }
                                                                                    z2 = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                                                                } else if (!list3.isEmpty()) {
                                                                                    z2 = true;
                                                                                }
                                                                            } else if (obj2 instanceof C0533o0) {
                                                                                C0533o0 c0533o0 = (C0533o0) obj2;
                                                                                Object objM1701g9 = jh0Var2.m1701g(e01Var);
                                                                                if (objM1701g9 == null) {
                                                                                    objM1701g9 = null;
                                                                                }
                                                                                if (c0533o0 != objM1701g9) {
                                                                                    if (objM1701g9 instanceof C0533o0) {
                                                                                        String str4 = c0533o0.f4377a;
                                                                                        C0533o0 c0533o02 = (C0533o0) objM1701g9;
                                                                                        InterfaceC0188ex interfaceC0188ex2 = c0533o02.f4378b;
                                                                                        if (p30.m3002l(str4, c0533o02.f4377a) && (((interfaceC0188ex = c0533o0.f4378b) != null || interfaceC0188ex2 == null) && (interfaceC0188ex == null || interfaceC0188ex2 != null))) {
                                                                                        }
                                                                                    }
                                                                                    z2 = true;
                                                                                }
                                                                                z2 = false;
                                                                            }
                                                                        }
                                                                        i11 = i22;
                                                                        i13 = 8;
                                                                    }
                                                                } else if (jh0Var5.m1697c(rz0.f5598k)) {
                                                                    Object objM1701g10 = jh0Var4.m1701g(e01Var5);
                                                                    if (objM1701g10 == null) {
                                                                        objM1701g10 = null;
                                                                    }
                                                                    C0200f8 c0200f82 = (C0200f8) objM1701g10;
                                                                    if (c0200f82 == null) {
                                                                        c0200f82 = "";
                                                                    }
                                                                    Object objM1701g11 = jh0Var5.m1701g(e01Var5);
                                                                    if (objM1701g11 == null) {
                                                                        objM1701g11 = null;
                                                                    }
                                                                    CharSequence charSequence = (C0200f8) objM1701g11;
                                                                    if (charSequence == null) {
                                                                        charSequence = "";
                                                                    }
                                                                    CharSequence charSequenceM446H = m446H(charSequence);
                                                                    int length3 = c0200f82.length();
                                                                    int length4 = charSequence.length();
                                                                    int i39 = length3 > length4 ? length4 : length3;
                                                                    Integer num8 = num6;
                                                                    int i40 = 0;
                                                                    while (true) {
                                                                        i16 = length3;
                                                                        if (i40 >= i39) {
                                                                            i17 = length4;
                                                                            break;
                                                                        }
                                                                        i17 = length4;
                                                                        if (c0200f82.charAt(i40) != charSequence.charAt(i40)) {
                                                                            break;
                                                                        }
                                                                        i40++;
                                                                        length3 = i16;
                                                                        length4 = i17;
                                                                    }
                                                                    int i41 = 0;
                                                                    while (true) {
                                                                        if (i41 >= i39 - i40) {
                                                                            i18 = i41;
                                                                            break;
                                                                        }
                                                                        i18 = i41;
                                                                        if (c0200f82.charAt((i16 - 1) - i41) != charSequence.charAt((i17 - 1) - i18)) {
                                                                            break;
                                                                        } else {
                                                                            i41 = i18 + 1;
                                                                        }
                                                                    }
                                                                    int i42 = (i16 - i18) - i40;
                                                                    int i43 = (i17 - i18) - i40;
                                                                    e01 e01Var8 = b01.f316I;
                                                                    boolean zM1697c = jh0Var4.m1697c(e01Var8);
                                                                    boolean zM1697c2 = jh0Var5.m1697c(e01Var8);
                                                                    boolean zM1697c3 = jh0Var4.m1697c(b01.f312E);
                                                                    boolean z5 = zM1697c3 && !zM1697c && zM1697c2;
                                                                    boolean z6 = zM1697c3 && zM1697c && !zM1697c2;
                                                                    if (z5 || z6) {
                                                                        jh0Var3 = jh0Var4;
                                                                        i12 = i27;
                                                                        num4 = num8;
                                                                        accessibilityEventM464h = m464h(m471s(i27), num4, num8, Integer.valueOf(i17), charSequenceM446H);
                                                                    } else {
                                                                        jh0Var3 = jh0Var4;
                                                                        accessibilityEventM464h = m463g(m471s(i27), 16);
                                                                        accessibilityEventM464h.setFromIndex(i40);
                                                                        accessibilityEventM464h.setRemovedCount(i42);
                                                                        accessibilityEventM464h.setAddedCount(i43);
                                                                        accessibilityEventM464h.setBeforeText(c0200f82);
                                                                        accessibilityEventM464h.getText().add(charSequenceM446H);
                                                                        i12 = i27;
                                                                        num4 = num8;
                                                                    }
                                                                    accessibilityEventM464h.setClassName("android.widget.EditText");
                                                                    m473u(accessibilityEventM464h);
                                                                    if (z5 || z6) {
                                                                        long j6 = ((l71) sz0Var4.m4137c(b01.f313F)).f3382a;
                                                                        num5 = num4;
                                                                        accessibilityEventM464h.setFromIndex((int) (j6 >> 32));
                                                                        accessibilityEventM464h.setToIndex((int) (j6 & 4294967295L));
                                                                        m473u(accessibilityEventM464h);
                                                                    } else {
                                                                        num5 = num4;
                                                                    }
                                                                    i11 = i22;
                                                                    i14 = i35;
                                                                    num3 = num5;
                                                                    jh0Var2 = jh0Var3;
                                                                    i13 = 8;
                                                                } else {
                                                                    Integer num9 = num6;
                                                                    i12 = i27;
                                                                    m451w(this, m471s(i12), 2048, Integer.valueOf(i22), 8);
                                                                    i13 = 8;
                                                                    i11 = i22;
                                                                    i14 = i35;
                                                                    num3 = num9;
                                                                    jh0Var2 = jh0Var4;
                                                                }
                                                            }
                                                            i11 = i22;
                                                            i14 = i35;
                                                            i13 = 8;
                                                        }
                                                    }
                                                } else {
                                                    Object objM1701g12 = jh0Var4.m1701g(e01Var);
                                                    if (objM1701g12 == null) {
                                                        objM1701g12 = null;
                                                    }
                                                    if (p30.m3002l(obj2, objM1701g12)) {
                                                        i12 = i27;
                                                        arrayList3 = arrayList5;
                                                        i9 = i32;
                                                        i11 = i22;
                                                        i13 = i28;
                                                    }
                                                    b60Var2 = b60Var4;
                                                    num3 = num6;
                                                    jh0Var2 = jh0Var4;
                                                    i14 = i35;
                                                }
                                            } else {
                                                sz0Var2 = sz0Var3;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i9 = i32;
                                                i10 = i33;
                                                i11 = i22;
                                                b60Var2 = b60Var4;
                                                num3 = num6;
                                                i12 = i27;
                                                jh0Var2 = jh0Var4;
                                                i13 = i28;
                                                i14 = length2;
                                            }
                                            long j7 = j >> i13;
                                            i28 = i13;
                                            i22 = i11;
                                            i27 = i12;
                                            b60Var4 = b60Var2;
                                            i33 = i10 + 1;
                                            length2 = i14;
                                            j4 = j7;
                                            num6 = num3;
                                            jh0Var4 = jh0Var2;
                                            i32 = i9;
                                            sz0Var3 = sz0Var2;
                                            arrayList5 = arrayList3;
                                        }
                                        i7 = i27;
                                        sz0Var = sz0Var3;
                                        arrayList2 = arrayList5;
                                        i6 = i22;
                                        b60Var = b60Var4;
                                        z = true;
                                        num2 = num6;
                                        i8 = length2;
                                        int i44 = i32;
                                        jh0Var = jh0Var4;
                                        if (i44 != i28) {
                                            break;
                                        }
                                    } else {
                                        i7 = i27;
                                        sz0Var = sz0Var3;
                                        jh0Var = jh0Var4;
                                        arrayList2 = arrayList5;
                                        i6 = i22;
                                        b60Var = b60Var4;
                                        z = true;
                                        num2 = num6;
                                        i8 = length2;
                                    }
                                    if (i31 == i8) {
                                        break;
                                    }
                                    i22 = i6;
                                    i27 = i7;
                                    jh0Var4 = jh0Var;
                                    b60Var4 = b60Var;
                                    xz0Var2 = xz0Var;
                                    sz0Var3 = sz0Var;
                                    i28 = 8;
                                    i30 = i31 + 1;
                                    length2 = i8;
                                    num6 = num2;
                                    arrayList5 = arrayList2;
                                }
                            } else {
                                sz0Var = sz0Var3;
                                arrayList2 = arrayList5;
                                i4 = i25;
                                xz0Var = xz0Var2;
                                i6 = i22;
                                z = true;
                                num2 = num6;
                                i7 = i27;
                                z2 = false;
                            }
                            if (!z2) {
                                Iterator it = sz0Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z3 = false;
                                        break;
                                    } else {
                                        if (!xz0Var.m5188k().f5877d.m1697c((e01) ((Map.Entry) it.next()).getKey())) {
                                            z3 = z;
                                            break;
                                        }
                                    }
                                }
                                z2 = z3;
                            }
                            if (z2) {
                                i3 = 8;
                                m451w(this, m471s(i7), 2048, num2, 8);
                            } else {
                                i3 = 8;
                            }
                        }
                    }
                    j3 >>= i3;
                    i26 = i2 + 1;
                    u20Var2 = u20Var;
                    num6 = num2;
                    i22 = i6;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i21 = i5;
                    i25 = i4;
                    arrayList5 = arrayList2;
                    i24 = i3;
                }
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i45 = i24;
                int i46 = i21;
                i19 = i22;
                num = num6;
                if (i25 != i45) {
                    return;
                } else {
                    i = i46;
                }
            } else {
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i19 = i22;
                num = num6;
                i = i21;
            }
            if (i == i23) {
                return;
            }
            i21 = i + 1;
            u20Var2 = u20Var;
            length = i23;
            num6 = num;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            i20 = 0;
        }
    }
}
