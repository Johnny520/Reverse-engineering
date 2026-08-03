package p357y1;

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
import androidx.lifecycle.C0119x;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import okio.C3193a;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p016b1.C0166f;
import p020b5.C0184c;
import p028c1.C0372b;
import p057e1.C0807b;
import p057e1.C0808c;
import p057e1.C0809d;
import p069f.AbstractC0938i;
import p069f.AbstractC0940j;
import p069f.AbstractC0942k;
import p069f.AbstractC0944l;
import p069f.AbstractC0946m;
import p069f.AbstractC0957r0;
import p069f.AbstractC0959s0;
import p069f.C0932f;
import p069f.C0943k0;
import p069f.C0945l0;
import p069f.C0961t0;
import p069f.C0962u;
import p069f.C0964v;
import p069f.C0965w;
import p069f.C0966x;
import p071f1.AbstractC0996c0;
import p071f1.C1009j;
import p071f1.C1010j0;
import p071f1.C1012k0;
import p071f1.C1014l0;
import p071f1.InterfaceC1026r0;
import p072f2.AbstractC1049l;
import p072f2.AbstractC1057t;
import p072f2.AbstractC1058u;
import p072f2.AbstractC1063z;
import p072f2.C1038a;
import p072f2.C1046i;
import p072f2.C1047j;
import p072f2.C1050m;
import p072f2.C1054q;
import p072f2.C1055r;
import p072f2.C1061x;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1236q;
import p091g3.AbstractC1299b;
import p099h.Hchat.R;
import p103h3.AbstractC1573b;
import p103h3.C1578g;
import p119i2.C1926g;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p131j0.C2046b;
import p136j8.C2104o;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p293u2.C4241k;
import p308v1.AbstractC4434w;
import p324w2.AbstractC4679a;
import p332wb.AbstractC4855en;
import p332wb.RunnableC4794cr;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.C5602f0;
import p339x1.InterfaceC5612i;
import p339x1.InterfaceC5665z1;
import p352xf.EnumC5799a;
import p356y0.AbstractC5852n;
import p370yf.AbstractC6038c;
import sg.AbstractC3978j;
import sg.C3970b;
import sg.C3971c;
import tf.AbstractC4165l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: y1.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC5958z extends AbstractC1299b implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: T */
    public static final C0964v f24195T;

    /* JADX INFO: renamed from: A */
    public Integer f24196A;

    /* JADX INFO: renamed from: B */
    public final C0932f f24197B;

    /* JADX INFO: renamed from: C */
    public final C3971c f24198C;

    /* JADX INFO: renamed from: D */
    public boolean f24199D;

    /* JADX INFO: renamed from: E */
    public C5942v f24200E;

    /* JADX INFO: renamed from: F */
    public C0965w f24201F;

    /* JADX INFO: renamed from: G */
    public final C0966x f24202G;

    /* JADX INFO: renamed from: H */
    public final C0962u f24203H;

    /* JADX INFO: renamed from: I */
    public final C0962u f24204I;

    /* JADX INFO: renamed from: J */
    public final String f24205J;

    /* JADX INFO: renamed from: K */
    public final String f24206K;

    /* JADX INFO: renamed from: L */
    public final C0184c f24207L;

    /* JADX INFO: renamed from: M */
    public final C0965w f24208M;

    /* JADX INFO: renamed from: N */
    public C5881f2 f24209N;

    /* JADX INFO: renamed from: O */
    public boolean f24210O;

    /* JADX INFO: renamed from: P */
    public final C0962u f24211P;

    /* JADX INFO: renamed from: Q */
    public final RunnableC4794cr f24212Q;

    /* JADX INFO: renamed from: R */
    public final ArrayList f24213R;

    /* JADX INFO: renamed from: S */
    public final C5954y f24214S;

    /* JADX INFO: renamed from: j */
    public final ViewTreeObserverOnGlobalLayoutListenerC5934t f24215j;

    /* JADX INFO: renamed from: k */
    public int f24216k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    public final C5954y f24217l = new C5954y(this, 0);

    /* JADX INFO: renamed from: m */
    public final AccessibilityManager f24218m;

    /* JADX INFO: renamed from: n */
    public long f24219n;

    /* JADX INFO: renamed from: o */
    public List f24220o;

    /* JADX INFO: renamed from: p */
    public final C5938u f24221p;

    /* JADX INFO: renamed from: q */
    public int f24222q;

    /* JADX INFO: renamed from: r */
    public int f24223r;

    /* JADX INFO: renamed from: s */
    public C1578g f24224s;

    /* JADX INFO: renamed from: t */
    public C1578g f24225t;

    /* JADX INFO: renamed from: u */
    public boolean f24226u;

    /* JADX INFO: renamed from: v */
    public final C0965w f24227v;

    /* JADX INFO: renamed from: w */
    public final C0965w f24228w;

    /* JADX INFO: renamed from: x */
    public final C0961t0 f24229x;

    /* JADX INFO: renamed from: y */
    public final C0961t0 f24230y;

    /* JADX INFO: renamed from: z */
    public int f24231z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        C0964v c0964v = AbstractC0940j.f2960a;
        C0964v c0964v2 = new C0964v(32);
        int i9 = c0964v2.f3036b;
        if (i9 < 0) {
            C3193a.m6820i(HttpUrl.FRAGMENT_ENCODE_SET);
            return;
        }
        int i10 = i9 + 32;
        c0964v2.m2370b(i10);
        int[] iArr2 = c0964v2.f3035a;
        int i11 = c0964v2.f3036b;
        if (i9 != i11) {
            AbstractC4165l.m8381p0(iArr2, iArr2, i10, i9, i11);
        }
        AbstractC4165l.m8384s0(iArr, iArr2, i9, 0, 12);
        c0964v2.f3036b += 32;
        f24195T = c0964v2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnAttachStateChangeListenerC5958z(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t) {
        this.f24215j = viewTreeObserverOnGlobalLayoutListenerC5934t;
        Object systemService = viewTreeObserverOnGlobalLayoutListenerC5934t.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.f24218m = (AccessibilityManager) systemService;
        this.f24219n = 100L;
        new Handler(Looper.getMainLooper());
        this.f24221p = new C5938u(this);
        this.f24222q = Integer.MIN_VALUE;
        this.f24223r = Integer.MIN_VALUE;
        this.f24227v = new C0965w();
        this.f24228w = new C0965w();
        this.f24229x = new C0961t0();
        this.f24230y = new C0961t0();
        this.f24231z = -1;
        this.f24197B = new C0932f();
        this.f24198C = AbstractC3978j.m8218a(1, 6, null);
        this.f24199D = true;
        C0965w c0965w = AbstractC0944l.f2974a;
        c0965w.getClass();
        this.f24201F = c0965w;
        this.f24202G = new C0966x();
        this.f24203H = new C0962u();
        this.f24204I = new C0962u();
        this.f24205J = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f24206K = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f24207L = new C0184c(18);
        this.f24208M = new C0965w();
        this.f24209N = new C5881f2(viewTreeObserverOnGlobalLayoutListenerC5934t.getSemanticsOwner().m2668a(), c0965w);
        int i9 = AbstractC0938i.f2955a;
        this.f24211P = new C0962u();
        viewTreeObserverOnGlobalLayoutListenerC5934t.addOnAttachStateChangeListener(this);
        this.f24212Q = new RunnableC4794cr(this, 7);
        this.f24213R = new ArrayList();
        this.f24214S = new C5954y(this, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static Rect m10675E(AbstractC0996c0 abstractC0996c0, float f3, float f10) {
        if (!(abstractC0996c0 instanceof C1012k0) && !(abstractC0996c0 instanceof C1014l0)) {
            return null;
        }
        C0808c c0808cMo2530k = abstractC0996c0.mo2530k();
        return new Rect((int) (c0808cMo2530k.f2416a + f3), (int) (c0808cMo2530k.f2417b + f10), (int) (c0808cMo2530k.f2418c + f3), (int) (c0808cMo2530k.f2419d + f10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static float[] m10676G(AbstractC0996c0 abstractC0996c0) {
        if (!(abstractC0996c0 instanceof C1014l0)) {
            return null;
        }
        C0809d c0809d = ((C1014l0) abstractC0996c0).f3198f;
        long j3 = c0809d.f2427h;
        long j4 = c0809d.f2426g;
        long j5 = c0809d.f2425f;
        long j10 = c0809d.f2424e;
        return new float[]{Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L))};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static Region m10677H(AbstractC0996c0 abstractC0996c0, float f3, float f10) {
        if (!(abstractC0996c0 instanceof C1010j0)) {
            return null;
        }
        C1010j0 c1010j0 = (C1010j0) abstractC0996c0;
        C0808c c0808cM2052h = c1010j0.mo2530k().m2052h(f3, f10);
        Region region = new Region(new Rect((int) (c0808cM2052h.f2416a + 0.0f), (int) (c0808cM2052h.f2417b + 0.0f), (int) (c0808cM2052h.f2418c + 0.0f), (int) (c0808cM2052h.f2419d + 0.0f)));
        Region region2 = new Region();
        C1009j c1009j = c1010j0.f3195f;
        if (!(c1009j instanceof C1009j)) {
            C2104o.m5297w("Unable to obtain android.graphics.Path");
            return null;
        }
        Path path = c1009j.f3191a;
        path.offset(f3, f10);
        region2.setPath(path, region);
        return region2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static CharSequence m10678I(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i9 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i9 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i9);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m10679m(C1054q c1054q) {
        C1926g c1926g;
        if (c1054q != null) {
            C1050m c1050m = c1054q.f3350d;
            C0943k0 c0943k0 = c1050m.f3341g;
            C1061x c1061x = AbstractC1058u.f3376a;
            if (c0943k0.m2316c(c1061x)) {
                return AbstractC4679a.m9170a((List) c1050m.m2646d(c1061x), ",", null, 62);
            }
            C1061x c1061x2 = AbstractC1058u.f3365F;
            if (c0943k0.m2316c(c1061x2)) {
                Object objM2320g = c0943k0.m2320g(c1061x2);
                if (objM2320g == null) {
                    objM2320g = null;
                }
                C1926g c1926g2 = (C1926g) objM2320g;
                if (c1926g2 != null) {
                    return c1926g2.f6529h;
                }
            } else {
                Object objM2320g2 = c0943k0.m2320g(AbstractC1058u.f3361B);
                if (objM2320g2 == null) {
                    objM2320g2 = null;
                }
                List list = (List) objM2320g2;
                if (list != null && (c1926g = (C1926g) AbstractC4166m.m8424v1(list)) != null) {
                    return c1926g.f6529h;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final boolean m10680q(C1047j c1047j, float f3) {
        InterfaceC1220a interfaceC1220a = c1047j.f3288a;
        if (f3 >= 0.0f || ((Number) interfaceC1220a.invoke()).floatValue() <= 0.0f) {
            return f3 > 0.0f && ((Number) interfaceC1220a.invoke()).floatValue() < ((Number) c1047j.f3289b.invoke()).floatValue();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final boolean m10681r(C1047j c1047j) {
        InterfaceC1220a interfaceC1220a = c1047j.f3288a;
        if (((Number) interfaceC1220a.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) interfaceC1220a.invoke()).floatValue();
        ((Number) c1047j.f3289b.invoke()).floatValue();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final boolean m10682s(C1047j c1047j) {
        InterfaceC1220a interfaceC1220a = c1047j.f3288a;
        if (((Number) interfaceC1220a.invoke()).floatValue() < ((Number) c1047j.f3289b.invoke()).floatValue()) {
            return true;
        }
        ((Number) interfaceC1220a.invoke()).floatValue();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m10683x(ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z, int i9, int i10, Integer num, int i11) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        viewOnAttachStateChangeListenerC5958z.m10706w(i9, i10, num, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r12v17, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r12v18, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r12v19, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04cc A[PHI: r37
  0x04cc: PHI (r37v8 int) = (r37v7 int), (r37v7 int), (r37v9 int) binds: [B:216:0x04d5, B:236:0x0506, B:213:0x04ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10684A(AbstractC0942k abstractC0942k) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i9;
        Integer num2;
        int i10;
        int i11;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i12;
        int i13;
        int i14;
        Integer num4;
        int i15;
        C1050m c1050m;
        C1054q c1054q;
        int i16;
        int i17;
        int i18;
        int i19;
        C0943k0 c0943k0;
        C5602f0 c5602f0;
        int i20;
        C1050m c1050m2;
        Integer num5;
        ArrayList arrayList3;
        long j3;
        int i21;
        int i22;
        C5602f0 c5602f02;
        int i23;
        Integer num6;
        int i24;
        C0943k0 c0943k02;
        C5877e2 c5877e2;
        boolean z9;
        C5877e2 c5877e22;
        int i25;
        Object[] objArr;
        InterfaceC3955b interfaceC3955b;
        int i26;
        String str;
        int i27;
        int i28;
        AccessibilityEvent accessibilityEventM10696i;
        ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z = this;
        AbstractC0942k abstractC0942k2 = abstractC0942k;
        Integer num7 = 64;
        ArrayList arrayList4 = viewOnAttachStateChangeListenerC5958z.f24213R;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = abstractC0942k2.f2964b;
        long[] jArr3 = abstractC0942k2.f2963a;
        int i29 = 2;
        int length = jArr3.length - 2;
        int i30 = 0;
        Integer num8 = 0;
        if (length < 0) {
            return;
        }
        int i31 = 0;
        while (true) {
            long j4 = jArr3[i31];
            int i32 = i29;
            int i33 = length;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i34 = 8;
                int i35 = 8 - ((~(i31 - i33)) >>> 31);
                long j5 = j4;
                int i36 = i30;
                while (i36 < i35) {
                    if ((j5 & 255) < 128) {
                        int i37 = iArr3[(i31 << 3) + i36];
                        C5881f2 c5881f2 = (C5881f2) viewOnAttachStateChangeListenerC5958z.f24208M.m2313b(i37);
                        if (c5881f2 == null) {
                            i11 = i36;
                            num3 = num7;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i12 = i35;
                            i13 = i30;
                            i14 = i31;
                            num4 = num8;
                            i15 = i34;
                        } else {
                            C1050m c1050m3 = c5881f2.f23880a;
                            C0943k0 c0943k03 = c1050m3.f3341g;
                            C1055r c1055r = (C1055r) abstractC0942k2.m2313b(i37);
                            int i38 = i34;
                            C1054q c1054q2 = c1055r != null ? c1055r.f3353a : null;
                            if (c1054q2 == null) {
                                throw AbstractC4855en.m9257a("no value for specified key");
                            }
                            C5602f0 c5602f03 = c1054q2.f3349c;
                            C1050m c1050m4 = c1054q2.f3350d;
                            iArr2 = iArr3;
                            int i39 = c1054q2.f3352f;
                            jArr2 = jArr3;
                            C0943k0 c0943k04 = c1050m4.f3341g;
                            i14 = i31;
                            Object[] objArr2 = c0943k04.f2969b;
                            Object[] objArr3 = c0943k04.f2970c;
                            long[] jArr4 = c0943k04.f2968a;
                            i11 = i36;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                C5602f0 c5602f04 = c5602f03;
                                i12 = i35;
                                int i40 = 0;
                                i18 = 0;
                                while (true) {
                                    long j10 = jArr4[i40];
                                    c1054q = c1054q2;
                                    int i41 = i40;
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i42 = 8 - ((~(i41 - length2)) >>> 31);
                                        int i43 = 0;
                                        while (i43 < i42) {
                                            if ((j10 & 255) < 128) {
                                                int i44 = (i41 << 3) + i43;
                                                Object obj = objArr2[i44];
                                                int i45 = length2;
                                                Object obj2 = objArr3[i44];
                                                c1050m2 = c1050m3;
                                                C1061x c1061x = (C1061x) obj;
                                                j3 = j10;
                                                C1061x c1061x2 = AbstractC1058u.f3396u;
                                                if (AbstractC1416l.m3825a(c1061x, c1061x2) || AbstractC1416l.m3825a(c1061x, AbstractC1058u.f3397v)) {
                                                    int size = arrayList5.size();
                                                    i22 = i43;
                                                    int i46 = 0;
                                                    while (true) {
                                                        if (i46 >= size) {
                                                            c5877e2 = null;
                                                            break;
                                                        }
                                                        int i47 = size;
                                                        if (((C5877e2) arrayList5.get(i46)).f23850g == i37) {
                                                            c5877e2 = (C5877e2) arrayList5.get(i46);
                                                            break;
                                                        } else {
                                                            i46++;
                                                            size = i47;
                                                        }
                                                    }
                                                    if (c5877e2 != null) {
                                                        z9 = false;
                                                    } else {
                                                        c5877e2 = new C5877e2(i37, arrayList4);
                                                        z9 = true;
                                                    }
                                                    arrayList4.add(c5877e2);
                                                } else {
                                                    i22 = i43;
                                                    z9 = false;
                                                }
                                                if (z9) {
                                                    C1061x c1061x3 = AbstractC1058u.f3379d;
                                                    if (AbstractC1416l.m3825a(c1061x, c1061x3)) {
                                                        obj2.getClass();
                                                        String str2 = (String) obj2;
                                                        boolean zM2316c = c0943k03.m2316c(c1061x3);
                                                        int i48 = i38;
                                                        if (zM2316c) {
                                                            viewOnAttachStateChangeListenerC5958z.m10707y(i37, i48, str2);
                                                        }
                                                    } else {
                                                        int i49 = i38;
                                                        if (AbstractC1416l.m3825a(c1061x, AbstractC1058u.f3377b)) {
                                                            m10683x(viewOnAttachStateChangeListenerC5958z, viewOnAttachStateChangeListenerC5958z.m10703t(i37), Opcodes.ACC_STRICT, num7, i49);
                                                            m10683x(viewOnAttachStateChangeListenerC5958z, viewOnAttachStateChangeListenerC5958z.m10703t(i37), Opcodes.ACC_STRICT, num8, i49);
                                                        } else if (AbstractC1416l.m3825a(c1061x, AbstractC1058u.f3369J)) {
                                                            m10683x(viewOnAttachStateChangeListenerC5958z, viewOnAttachStateChangeListenerC5958z.m10703t(i37), Opcodes.ACC_STRICT, 8192, 8);
                                                            m10683x(viewOnAttachStateChangeListenerC5958z, viewOnAttachStateChangeListenerC5958z.m10703t(i37), Opcodes.ACC_STRICT, num8, 8);
                                                        } else if (AbstractC1416l.m3825a(c1061x, AbstractC1058u.f3371L)) {
                                                            m10683x(viewOnAttachStateChangeListenerC5958z, viewOnAttachStateChangeListenerC5958z.m10703t(i37), Opcodes.ACC_STRICT, 3072, 8);
                                                        } else if (AbstractC1416l.m3825a(c1061x, AbstractC1058u.f3378c)) {
                                                            m10683x(viewOnAttachStateChangeListenerC5958z, viewOnAttachStateChangeListenerC5958z.m10703t(i37), Opcodes.ACC_STRICT, num7, 8);
                                                            m10683x(viewOnAttachStateChangeListenerC5958z, viewOnAttachStateChangeListenerC5958z.m10703t(i37), Opcodes.ACC_STRICT, num8, 8);
                                                        } else {
                                                            C1061x c1061x4 = AbstractC1058u.f3368I;
                                                            arrayList3 = arrayList5;
                                                            if (AbstractC1416l.m3825a(c1061x, c1061x4)) {
                                                                Object objM2320g = c0943k04.m2320g(AbstractC1058u.f3400y);
                                                                if (objM2320g == null) {
                                                                    objM2320g = null;
                                                                }
                                                                C1046i c1046i = (C1046i) objM2320g;
                                                                if (c1046i != null && c1046i.f3287a == 4) {
                                                                    Object objM2320g2 = c0943k04.m2320g(c1061x4);
                                                                    if (objM2320g2 == null) {
                                                                        objM2320g2 = null;
                                                                    }
                                                                    if (AbstractC1416l.m3825a(objM2320g2, Boolean.TRUE)) {
                                                                        AccessibilityEvent accessibilityEventM10695h = viewOnAttachStateChangeListenerC5958z.m10695h(viewOnAttachStateChangeListenerC5958z.m10703t(i37), 4);
                                                                        C1054q c1054q3 = c1054q;
                                                                        c5602f02 = c5602f04;
                                                                        C1054q c1054q4 = new C1054q(c1054q3.f3347a, true, c5602f02, c1050m4);
                                                                        Object objM2320g3 = c1054q4.m2659k().f3341g.m2320g(AbstractC1058u.f3376a);
                                                                        if (objM2320g3 == null) {
                                                                            objM2320g3 = null;
                                                                        }
                                                                        List list = (List) objM2320g3;
                                                                        c1054q = c1054q3;
                                                                        String strM9170a = list != null ? AbstractC4679a.m9170a(list, ",", null, 62) : null;
                                                                        Object objM2320g4 = c1054q4.m2659k().f3341g.m2320g(AbstractC1058u.f3361B);
                                                                        if (objM2320g4 == null) {
                                                                            objM2320g4 = null;
                                                                        }
                                                                        List list2 = (List) objM2320g4;
                                                                        i21 = i42;
                                                                        String strM9170a2 = list2 != null ? AbstractC4679a.m9170a(list2, ",", null, 62) : null;
                                                                        if (strM9170a != null) {
                                                                            accessibilityEventM10695h.setContentDescription(strM9170a);
                                                                        }
                                                                        if (strM9170a2 != null) {
                                                                            accessibilityEventM10695h.getText().add(strM9170a2);
                                                                        }
                                                                        viewOnAttachStateChangeListenerC5958z.m10705v(accessibilityEventM10695h);
                                                                    } else {
                                                                        i21 = i42;
                                                                        c5602f02 = c5602f04;
                                                                        m10683x(viewOnAttachStateChangeListenerC5958z, viewOnAttachStateChangeListenerC5958z.m10703t(i37), Opcodes.ACC_STRICT, num8, 8);
                                                                    }
                                                                } else {
                                                                    i21 = i42;
                                                                    c5602f02 = c5602f04;
                                                                    m10683x(viewOnAttachStateChangeListenerC5958z, viewOnAttachStateChangeListenerC5958z.m10703t(i37), Opcodes.ACC_STRICT, num7, 8);
                                                                    m10683x(viewOnAttachStateChangeListenerC5958z, viewOnAttachStateChangeListenerC5958z.m10703t(i37), Opcodes.ACC_STRICT, num8, 8);
                                                                }
                                                            } else {
                                                                i21 = i42;
                                                                c5602f02 = c5602f04;
                                                                if (AbstractC1416l.m3825a(c1061x, AbstractC1058u.f3376a)) {
                                                                    int iM10703t = viewOnAttachStateChangeListenerC5958z.m10703t(i37);
                                                                    obj2.getClass();
                                                                    viewOnAttachStateChangeListenerC5958z.m10706w(iM10703t, Opcodes.ACC_STRICT, 4, (List) obj2);
                                                                } else {
                                                                    C1061x c1061x5 = AbstractC1058u.f3365F;
                                                                    boolean zM3825a = AbstractC1416l.m3825a(c1061x, c1061x5);
                                                                    String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                                    if (zM3825a) {
                                                                        if (c0943k04.m2316c(AbstractC1049l.f3325k)) {
                                                                            Object objM2320g5 = c0943k03.m2320g(c1061x5);
                                                                            if (objM2320g5 == null) {
                                                                                objM2320g5 = null;
                                                                            }
                                                                            C1926g c1926g = (C1926g) objM2320g5;
                                                                            if (c1926g == null) {
                                                                                c1926g = HttpUrl.FRAGMENT_ENCODE_SET;
                                                                            }
                                                                            Object objM2320g6 = c0943k04.m2320g(c1061x5);
                                                                            if (objM2320g6 == null) {
                                                                                objM2320g6 = null;
                                                                            }
                                                                            CharSequence charSequence = (C1926g) objM2320g6;
                                                                            if (charSequence == null) {
                                                                                charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
                                                                            }
                                                                            CharSequence charSequenceM10678I = m10678I(charSequence);
                                                                            int length3 = c1926g.length();
                                                                            int length4 = charSequence.length();
                                                                            int i50 = length3 > length4 ? length4 : length3;
                                                                            Integer num9 = num8;
                                                                            int i51 = 0;
                                                                            while (true) {
                                                                                num5 = num7;
                                                                                if (i51 >= i50) {
                                                                                    i27 = length3;
                                                                                    break;
                                                                                }
                                                                                i27 = length3;
                                                                                if (c1926g.charAt(i51) != charSequence.charAt(i51)) {
                                                                                    break;
                                                                                }
                                                                                i51++;
                                                                                length3 = i27;
                                                                                num7 = num5;
                                                                            }
                                                                            int i52 = 0;
                                                                            while (true) {
                                                                                if (i52 >= i50 - i51) {
                                                                                    i28 = i52;
                                                                                    break;
                                                                                }
                                                                                i28 = i52;
                                                                                if (c1926g.charAt((i27 - 1) - i52) != charSequence.charAt((length4 - 1) - i28)) {
                                                                                    break;
                                                                                } else {
                                                                                    i52 = i28 + 1;
                                                                                }
                                                                            }
                                                                            int i53 = (i27 - i28) - i51;
                                                                            int i54 = (length4 - i28) - i51;
                                                                            C1061x c1061x6 = AbstractC1058u.f3370K;
                                                                            boolean zM2316c2 = c0943k03.m2316c(c1061x6);
                                                                            boolean zM2316c3 = c0943k04.m2316c(c1061x6);
                                                                            boolean zM2316c4 = c0943k03.m2316c(AbstractC1058u.f3365F);
                                                                            boolean z10 = zM2316c4 && !zM2316c2 && zM2316c3;
                                                                            boolean z11 = zM2316c4 && zM2316c2 && !zM2316c3;
                                                                            if (z10 || z11) {
                                                                                c0943k02 = c0943k03;
                                                                                i24 = i37;
                                                                                num8 = num9;
                                                                                accessibilityEventM10696i = viewOnAttachStateChangeListenerC5958z.m10696i(viewOnAttachStateChangeListenerC5958z.m10703t(i37), num8, num9, Integer.valueOf(length4), charSequenceM10678I);
                                                                            } else {
                                                                                accessibilityEventM10696i = viewOnAttachStateChangeListenerC5958z.m10695h(viewOnAttachStateChangeListenerC5958z.m10703t(i37), 16);
                                                                                accessibilityEventM10696i.setFromIndex(i51);
                                                                                accessibilityEventM10696i.setRemovedCount(i53);
                                                                                accessibilityEventM10696i.setAddedCount(i54);
                                                                                accessibilityEventM10696i.setBeforeText(c1926g);
                                                                                accessibilityEventM10696i.getText().add(charSequenceM10678I);
                                                                                i24 = i37;
                                                                                c0943k02 = c0943k03;
                                                                                num8 = num9;
                                                                            }
                                                                            accessibilityEventM10696i.setClassName("android.widget.EditText");
                                                                            viewOnAttachStateChangeListenerC5958z.m10705v(accessibilityEventM10696i);
                                                                            if (z10 || z11) {
                                                                                long j11 = ((C1939m0) c1050m4.m2646d(AbstractC1058u.f3366G)).f6575a;
                                                                                accessibilityEventM10696i.setFromIndex((int) (j11 >> 32));
                                                                                accessibilityEventM10696i.setToIndex((int) (j11 & 4294967295L));
                                                                                viewOnAttachStateChangeListenerC5958z.m10705v(accessibilityEventM10696i);
                                                                            }
                                                                        } else {
                                                                            i24 = i37;
                                                                            c0943k02 = c0943k03;
                                                                            num5 = num7;
                                                                            m10683x(viewOnAttachStateChangeListenerC5958z, viewOnAttachStateChangeListenerC5958z.m10703t(i24), Opcodes.ACC_STRICT, Integer.valueOf(i32), 8);
                                                                        }
                                                                        num6 = num8;
                                                                        i23 = i45;
                                                                    } else {
                                                                        i24 = i37;
                                                                        c0943k02 = c0943k03;
                                                                        num5 = num7;
                                                                        i23 = i45;
                                                                        C1061x c1061x7 = AbstractC1058u.f3366G;
                                                                        if (AbstractC1416l.m3825a(c1061x, c1061x7)) {
                                                                            Object objM2320g7 = c0943k04.m2320g(c1061x5);
                                                                            if (objM2320g7 == null) {
                                                                                objM2320g7 = null;
                                                                            }
                                                                            C1926g c1926g2 = (C1926g) objM2320g7;
                                                                            if (c1926g2 != null && (str = c1926g2.f6529h) != null) {
                                                                                str3 = str;
                                                                            }
                                                                            long j12 = ((C1939m0) c1050m4.m2646d(c1061x7)).f6575a;
                                                                            num6 = num8;
                                                                            viewOnAttachStateChangeListenerC5958z = this;
                                                                            viewOnAttachStateChangeListenerC5958z.m10705v(viewOnAttachStateChangeListenerC5958z.m10696i(viewOnAttachStateChangeListenerC5958z.m10703t(i24), Integer.valueOf((int) (j12 >> 32)), Integer.valueOf((int) (j12 & 4294967295L)), Integer.valueOf(str3.length()), m10678I(str3)));
                                                                            viewOnAttachStateChangeListenerC5958z.m10708z(i39);
                                                                        } else {
                                                                            num6 = num8;
                                                                            if (AbstractC1416l.m3825a(c1061x, c1061x2) || AbstractC1416l.m3825a(c1061x, AbstractC1058u.f3397v)) {
                                                                                viewOnAttachStateChangeListenerC5958z.m10702p(c5602f02);
                                                                                int size2 = arrayList4.size();
                                                                                int i55 = 0;
                                                                                while (true) {
                                                                                    if (i55 >= size2) {
                                                                                        c5877e22 = null;
                                                                                        break;
                                                                                    } else {
                                                                                        if (((C5877e2) arrayList4.get(i55)).f23850g == i24) {
                                                                                            c5877e22 = (C5877e2) arrayList4.get(i55);
                                                                                            break;
                                                                                        }
                                                                                        i55++;
                                                                                    }
                                                                                }
                                                                                c5877e22.getClass();
                                                                                Object objM2320g8 = c0943k04.m2320g(c1061x2);
                                                                                if (objM2320g8 == null) {
                                                                                    objM2320g8 = null;
                                                                                }
                                                                                c5877e22.f23854k = (C1047j) objM2320g8;
                                                                                Object objM2320g9 = c0943k04.m2320g(AbstractC1058u.f3397v);
                                                                                if (objM2320g9 == null) {
                                                                                    objM2320g9 = null;
                                                                                }
                                                                                c5877e22.f23855l = (C1047j) objM2320g9;
                                                                                if (c5877e22.f23851h.contains(c5877e22)) {
                                                                                    viewOnAttachStateChangeListenerC5958z.f24215j.getSnapshotObserver().f23001a.m9162c(c5877e22, viewOnAttachStateChangeListenerC5958z.f24214S, new C0372b(c5877e22, 9, viewOnAttachStateChangeListenerC5958z));
                                                                                }
                                                                            } else if (AbstractC1416l.m3825a(c1061x, AbstractC1058u.f3387l)) {
                                                                                obj2.getClass();
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i26 = 8;
                                                                                    viewOnAttachStateChangeListenerC5958z.m10705v(viewOnAttachStateChangeListenerC5958z.m10695h(viewOnAttachStateChangeListenerC5958z.m10703t(i39), 8));
                                                                                } else {
                                                                                    i26 = 8;
                                                                                }
                                                                                m10683x(viewOnAttachStateChangeListenerC5958z, viewOnAttachStateChangeListenerC5958z.m10703t(i39), Opcodes.ACC_STRICT, num6, i26);
                                                                            } else {
                                                                                C1061x c1061x8 = AbstractC1049l.f3338x;
                                                                                if (AbstractC1416l.m3825a(c1061x, c1061x8)) {
                                                                                    List list3 = (List) c1050m4.m2646d(c1061x8);
                                                                                    Object objM2320g10 = c0943k02.m2320g(c1061x8);
                                                                                    if (objM2320g10 == null) {
                                                                                        objM2320g10 = null;
                                                                                    }
                                                                                    List list4 = (List) objM2320g10;
                                                                                    if (list4 != null) {
                                                                                        C0945l0 c0945l0 = AbstractC0959s0.f3019a;
                                                                                        C0945l0 c0945l02 = new C0945l0();
                                                                                        if (list3.size() > 0) {
                                                                                            list3.get(0).getClass();
                                                                                            C0086a.m445d();
                                                                                            return;
                                                                                        }
                                                                                        C0945l0 c0945l03 = new C0945l0();
                                                                                        if (list4.size() > 0) {
                                                                                            list4.get(0).getClass();
                                                                                            C0086a.m445d();
                                                                                            return;
                                                                                        }
                                                                                        i18 = !c0945l02.equals(c0945l03) ? 1 : 0;
                                                                                    } else {
                                                                                        i25 = 1;
                                                                                        if (!list3.isEmpty()) {
                                                                                            i18 = i25;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    i25 = 1;
                                                                                    if (obj2 instanceof C1038a) {
                                                                                        C1038a c1038a = (C1038a) obj2;
                                                                                        Object objM2320g11 = c0943k02.m2320g(c1061x);
                                                                                        if (objM2320g11 == null) {
                                                                                            objM2320g11 = null;
                                                                                        }
                                                                                        if (c1038a != objM2320g11) {
                                                                                            if (objM2320g11 instanceof C1038a) {
                                                                                                String str4 = c1038a.f3269a;
                                                                                                C1038a c1038a2 = (C1038a) objM2320g11;
                                                                                                InterfaceC3955b interfaceC3955b2 = c1038a2.f3270b;
                                                                                                if (AbstractC1416l.m3825a(str4, c1038a2.f3269a) && (((interfaceC3955b = c1038a.f3270b) != null || interfaceC3955b2 == null) && (interfaceC3955b == null || interfaceC3955b2 != null))) {
                                                                                                    objArr = true;
                                                                                                }
                                                                                                if (objArr == false) {
                                                                                                    i18 = 0;
                                                                                                }
                                                                                            }
                                                                                            objArr = false;
                                                                                            if (objArr == false) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            num6 = num8;
                                                            i24 = i37;
                                                            c0943k02 = c0943k03;
                                                            num5 = num7;
                                                            i23 = i45;
                                                        }
                                                    }
                                                    i24 = i37;
                                                    num5 = num7;
                                                    arrayList3 = arrayList5;
                                                    i21 = i42;
                                                    c5602f02 = c5602f04;
                                                    i23 = i45;
                                                    num6 = num8;
                                                    c0943k02 = c0943k03;
                                                } else {
                                                    Object objM2320g12 = c0943k03.m2320g(c1061x);
                                                    if (objM2320g12 == null) {
                                                        objM2320g12 = null;
                                                    }
                                                    if (AbstractC1416l.m3825a(obj2, objM2320g12)) {
                                                        i24 = i37;
                                                        num5 = num7;
                                                        arrayList3 = arrayList5;
                                                        i21 = i42;
                                                        c5602f02 = c5602f04;
                                                        i23 = i45;
                                                        num6 = num8;
                                                        c0943k02 = c0943k03;
                                                    }
                                                }
                                                i38 = 8;
                                                i37 = i24;
                                                c5602f04 = c5602f02;
                                                c1050m3 = c1050m2;
                                                j10 = j3 >> 8;
                                                i43 = i22 + 1;
                                                length2 = i23;
                                                num8 = num6;
                                                c0943k03 = c0943k02;
                                                i42 = i21;
                                                arrayList5 = arrayList3;
                                                num7 = num5;
                                            } else {
                                                c1050m2 = c1050m3;
                                                num5 = num7;
                                                arrayList3 = arrayList5;
                                                j3 = j10;
                                                i21 = i42;
                                                i22 = i43;
                                                c5602f02 = c5602f04;
                                                i23 = length2;
                                                num6 = num8;
                                                i24 = i37;
                                                c0943k02 = c0943k03;
                                            }
                                            i38 = 8;
                                            i37 = i24;
                                            c5602f04 = c5602f02;
                                            c1050m3 = c1050m2;
                                            j10 = j3 >> 8;
                                            i43 = i22 + 1;
                                            length2 = i23;
                                            num8 = num6;
                                            c0943k03 = c0943k02;
                                            i42 = i21;
                                            arrayList5 = arrayList3;
                                            num7 = num5;
                                        }
                                        i17 = i37;
                                        c1050m = c1050m3;
                                        num3 = num7;
                                        arrayList2 = arrayList5;
                                        int i56 = i42;
                                        c5602f0 = c5602f04;
                                        i13 = 0;
                                        i16 = 1;
                                        i20 = length2;
                                        num4 = num8;
                                        c0943k0 = c0943k03;
                                        if (i56 != i38) {
                                            break;
                                        }
                                    } else {
                                        i17 = i37;
                                        c1050m = c1050m3;
                                        c0943k0 = c0943k03;
                                        num3 = num7;
                                        arrayList2 = arrayList5;
                                        c5602f0 = c5602f04;
                                        i13 = 0;
                                        i16 = 1;
                                        i20 = length2;
                                        num4 = num8;
                                    }
                                    if (i41 == i20) {
                                        break;
                                    }
                                    num8 = num4;
                                    i37 = i17;
                                    c0943k03 = c0943k0;
                                    c5602f04 = c5602f0;
                                    c1054q2 = c1054q;
                                    c1050m3 = c1050m;
                                    arrayList5 = arrayList2;
                                    i38 = 8;
                                    i40 = i41 + 1;
                                    length2 = i20;
                                    num7 = num3;
                                }
                            } else {
                                c1050m = c1050m3;
                                num3 = num7;
                                arrayList2 = arrayList5;
                                i12 = i35;
                                c1054q = c1054q2;
                                i16 = 1;
                                num4 = num8;
                                i17 = i37;
                                i13 = 0;
                                i18 = 0;
                            }
                            if (i18 == 0) {
                                Iterator it = c1050m.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i19 = i13;
                                        break;
                                    } else {
                                        if (!c1054q.m2659k().f3341g.m2316c((C1061x) ((Map.Entry) it.next()).getKey())) {
                                            i19 = i16;
                                            break;
                                        }
                                    }
                                }
                                i18 = i19;
                            }
                            if (i18 != 0) {
                                int iM10703t2 = viewOnAttachStateChangeListenerC5958z.m10703t(i17);
                                i15 = 8;
                                m10683x(viewOnAttachStateChangeListenerC5958z, iM10703t2, Opcodes.ACC_STRICT, num4, 8);
                            } else {
                                i15 = 8;
                            }
                        }
                    }
                    j5 >>= i15;
                    i36 = i11 + 1;
                    abstractC0942k2 = abstractC0942k;
                    i30 = i13;
                    num8 = num4;
                    i34 = i15;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i31 = i14;
                    i35 = i12;
                    arrayList5 = arrayList2;
                    num7 = num3;
                }
                num = num7;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i9 = i30;
                int i57 = i31;
                num2 = num8;
                if (i35 != i34) {
                    return;
                } else {
                    i10 = i57;
                }
            } else {
                num = num7;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i9 = i30;
                num2 = num8;
                i10 = i31;
            }
            if (i10 == i33) {
                return;
            }
            i31 = i10 + 1;
            abstractC0942k2 = abstractC0942k;
            length = i33;
            i30 = i9;
            num8 = num2;
            i29 = i32;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num7 = num;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m10685B(C5602f0 c5602f0, C0966x c0966x) {
        C1050m c1050mM10051w;
        if (c5602f0.m10010G() && !this.f24215j.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c5602f0)) {
            C5602f0 c5602f02 = null;
            if (!c5602f0.f22778L.m9982d(8)) {
                c5602f0 = c5602f0.m10049u();
                while (true) {
                    if (c5602f0 == null) {
                        c5602f0 = null;
                        break;
                    } else if (c5602f0.f22778L.m9982d(8)) {
                        break;
                    } else {
                        c5602f0 = c5602f0.m10049u();
                    }
                }
            }
            if (c5602f0 == null || (c1050mM10051w = c5602f0.m10051w()) == null) {
                return;
            }
            if (!c1050mM10051w.f3343i) {
                C5602f0 c5602f0M10049u = c5602f0.m10049u();
                while (true) {
                    if (c5602f0M10049u != null) {
                        C1050m c1050mM10051w2 = c5602f0M10049u.m10051w();
                        if (c1050mM10051w2 != null && c1050mM10051w2.f3343i) {
                            c5602f02 = c5602f0M10049u;
                            break;
                        }
                        c5602f0M10049u = c5602f0M10049u.m10049u();
                    } else {
                        break;
                    }
                }
                if (c5602f02 != null) {
                    c5602f0 = c5602f02;
                }
            }
            int i9 = c5602f0.f22791h;
            if (c0966x.m2380a(i9)) {
                m10683x(this, m10703t(i9), Opcodes.ACC_STRICT, 1, 8);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final void m10686C(C5602f0 c5602f0) {
        if (c5602f0.m10010G() && !this.f24215j.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c5602f0)) {
            int i9 = c5602f0.f22791h;
            C1047j c1047j = (C1047j) this.f24227v.m2313b(i9);
            C1047j c1047j2 = (C1047j) this.f24228w.m2313b(i9);
            if (c1047j == null && c1047j2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventM10695h = m10695h(i9, 4096);
            if (c1047j != null) {
                accessibilityEventM10695h.setScrollX((int) ((Number) c1047j.f3288a.invoke()).floatValue());
                accessibilityEventM10695h.setMaxScrollX((int) ((Number) c1047j.f3289b.invoke()).floatValue());
            }
            if (c1047j2 != null) {
                accessibilityEventM10695h.setScrollY((int) ((Number) c1047j2.f3288a.invoke()).floatValue());
                accessibilityEventM10695h.setMaxScrollY((int) ((Number) c1047j2.f3289b.invoke()).floatValue());
            }
            m10705v(accessibilityEventM10695h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final boolean m10687D(C1054q c1054q, int i9, int i10, boolean z9) {
        String strM10679m;
        C1050m c1050m = c1054q.f3350d;
        int i11 = c1054q.f3352f;
        C1061x c1061x = AbstractC1049l.f3324j;
        if (c1050m.f3341g.m2316c(c1061x) && AbstractC5883g0.m10586b(c1054q)) {
            InterfaceC1236q interfaceC1236q = (InterfaceC1236q) ((C1038a) c1054q.f3350d.m2646d(c1061x)).f3270b;
            if (interfaceC1236q != null) {
                return ((Boolean) interfaceC1236q.mo734b(Integer.valueOf(i9), Integer.valueOf(i10), Boolean.valueOf(z9))).booleanValue();
            }
        } else if ((i9 != i10 || i10 != this.f24231z) && (strM10679m = m10679m(c1054q)) != null) {
            if (i9 < 0 || i9 != i10 || i10 > strM10679m.length()) {
                i9 = -1;
            }
            this.f24231z = i9;
            boolean z10 = strM10679m.length() > 0;
            m10705v(m10696i(m10703t(i11), z10 ? Integer.valueOf(this.f24231z) : null, z10 ? Integer.valueOf(this.f24231z) : null, z10 ? Integer.valueOf(strM10679m.length()) : null, strM10679m));
            m10708z(i11);
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final Rect m10688F(float f3, float f10, float f11, float f12) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = this.f24215j;
        long jM10665w = viewTreeObserverOnGlobalLayoutListenerC5934t.m10665w(jFloatToRawIntBits);
        long jM10665w2 = viewTreeObserverOnGlobalLayoutListenerC5934t.m10665w((((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
        int i9 = (int) (jM10665w >> 32);
        int i10 = (int) (jM10665w2 >> 32);
        int i11 = (int) (jM10665w & 4294967295L);
        int i12 = (int) (jM10665w2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10))), (int) Math.floor(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12))));
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
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10689J() {
        long j3;
        long j4;
        long j5;
        char c10;
        long[] jArr;
        long[] jArr2;
        long j10;
        int i9;
        int i10;
        int iNumberOfTrailingZeros;
        char c11;
        C0966x c0966x = new C0966x();
        C0966x c0966x2 = this.f24202G;
        int[] iArr = c0966x2.f3039b;
        long[] jArr3 = c0966x2.f3038a;
        int length = jArr3.length - 2;
        C0965w c0965w = this.f24208M;
        int i11 = 8;
        if (length >= 0) {
            int i12 = 0;
            j3 = 128;
            j4 = 255;
            while (true) {
                long j11 = jArr3[i12];
                char c12 = 7;
                j5 = -9187201950435737472L;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j11 & 255) < 128) {
                            int i15 = iArr[(i12 << 3) + i14];
                            c11 = c12;
                            C1055r c1055r = (C1055r) m10699l().m2313b(i15);
                            C1054q c1054q = c1055r != null ? c1055r.f3353a : null;
                            if (c1054q != null) {
                                if (!c1054q.f3350d.f3341g.m2316c(AbstractC1058u.f3379d)) {
                                    c0966x.m2380a(i15);
                                    C5881f2 c5881f2 = (C5881f2) c0965w.m2313b(i15);
                                    if (c5881f2 != null) {
                                        Object objM2320g = c5881f2.f23880a.f3341g.m2320g(AbstractC1058u.f3379d);
                                        obj = (String) (objM2320g != null ? objM2320g : null);
                                    }
                                    m10707y(i15, 32, obj);
                                }
                            }
                        } else {
                            c11 = c12;
                        }
                        j11 >>= 8;
                        i14++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i13 != 8) {
                        break;
                    }
                } else {
                    c10 = 7;
                }
                if (i12 == length) {
                    break;
                } else {
                    i12++;
                }
            }
        } else {
            j3 = 128;
            j4 = 255;
            j5 = -9187201950435737472L;
            c10 = 7;
        }
        int[] iArr2 = c0966x.f3039b;
        long[] jArr4 = c0966x.f3038a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i16 = 0;
            while (true) {
                long j12 = jArr4[i16];
                if ((((~j12) << c10) & j12 & j5) != j5) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j12 & j4) < j3) {
                            int i19 = iArr2[(i16 << 3) + i18];
                            int iHashCode = Integer.hashCode(i19) * (-862048943);
                            int i20 = iHashCode ^ (iHashCode << 16);
                            int i21 = i20 & 127;
                            int i22 = c0966x2.f3040c;
                            int i23 = (i20 >>> 7) & i22;
                            i9 = i11;
                            int i24 = 0;
                            while (true) {
                                long[] jArr5 = c0966x2.f3038a;
                                int i25 = i23 >> 3;
                                jArr2 = jArr4;
                                int i26 = (i23 & 7) << 3;
                                j10 = j12;
                                long j13 = (jArr5[i25] >>> i26) | ((jArr5[i25 + 1] << (64 - i26)) & ((-i26) >> 63));
                                int i27 = i22;
                                long j14 = (((long) i21) * 72340172838076673L) ^ j13;
                                long j15 = (j14 - 72340172838076673L) & (~j14) & j5;
                                while (true) {
                                    if (j15 == 0) {
                                        break;
                                    }
                                    iNumberOfTrailingZeros = (i23 + (Long.numberOfTrailingZeros(j15) >> 3)) & i27;
                                    int i28 = i27;
                                    if (c0966x2.f3039b[iNumberOfTrailingZeros] == i19) {
                                        break;
                                    }
                                    j15 &= j15 - 1;
                                    i27 = i28;
                                }
                                i24 += 8;
                                i23 = (i23 + i24) & i10;
                                jArr4 = jArr2;
                                i22 = i10;
                                j12 = j10;
                            }
                            int i29 = iNumberOfTrailingZeros;
                            if (i29 >= 0) {
                                c0966x2.m2385f(i29);
                            }
                        } else {
                            jArr2 = jArr4;
                            j10 = j12;
                            i9 = i11;
                        }
                        j12 = j10 >> i9;
                        i18++;
                        i11 = i9;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i17 != i11) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i16 == length2) {
                    break;
                }
                i16++;
                jArr4 = jArr;
                i11 = 8;
            }
        }
        c0965w.m2374c();
        AbstractC0942k abstractC0942kM10699l = m10699l();
        int[] iArr3 = abstractC0942kM10699l.f2964b;
        Object[] objArr = abstractC0942kM10699l.f2965c;
        long[] jArr6 = abstractC0942kM10699l.f2963a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i30 = 0;
            while (true) {
                long j16 = jArr6[i30];
                if ((((~j16) << c10) & j16 & j5) != j5) {
                    int i31 = 8 - ((~(i30 - length3)) >>> 31);
                    for (int i32 = 0; i32 < i31; i32++) {
                        if ((j16 & j4) < j3) {
                            int i33 = (i30 << 3) + i32;
                            int i34 = iArr3[i33];
                            C1054q c1054q2 = ((C1055r) objArr[i33]).f3353a;
                            C1050m c1050m = c1054q2.f3350d;
                            C1061x c1061x = AbstractC1058u.f3379d;
                            if (c1050m.f3341g.m2316c(c1061x) && c0966x2.m2380a(i34)) {
                                m10707y(i34, 16, (String) c1054q2.f3350d.m2646d(c1061x));
                            }
                            c0965w.m2379h(i34, new C5881f2(c1054q2, m10699l()));
                        }
                        j16 >>= 8;
                    }
                    if (i31 != 8) {
                        break;
                    }
                }
                if (i30 == length3) {
                    break;
                } else {
                    i30++;
                }
            }
        }
        this.f24209N = new C5881f2(this.f24215j.getSemanticsOwner().m2668a(), m10699l());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1299b
    /* JADX INFO: renamed from: a */
    public final C0119x mo3449a(View view) {
        return this.f24221p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m10690c(int i9, C1578g c1578g, String str, Bundle bundle) {
        C1054q c1054q;
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = c1578g.f5248a;
        C1055r c1055r = (C1055r) m10699l().m2313b(i9);
        if (c1055r == null || (c1054q = c1055r.f3353a) == null) {
            return;
        }
        C5602f0 c5602f0 = c1054q.f3349c;
        C1050m c1050m = c1054q.f3350d;
        C0943k0 c0943k0 = c1050m.f3341g;
        String strM10679m = m10679m(c1054q);
        if (AbstractC1416l.m3825a(str, this.f24205J)) {
            int iM2366d = this.f24203H.m2366d(i9);
            if (iM2366d != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM2366d);
                return;
            }
            return;
        }
        if (AbstractC1416l.m3825a(str, this.f24206K)) {
            int iM2366d2 = this.f24204I.m2366d(i9);
            if (iM2366d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM2366d2);
                return;
            }
            return;
        }
        boolean zM2316c = c0943k0.m2316c(AbstractC1049l.f3315a);
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t2 = this.f24215j;
        boolean z9 = false;
        if (zM2316c && bundle != null && AbstractC1416l.m3825a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i10 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i11 > 0 && i10 >= 0) {
                if (i10 < (strM10679m != null ? strM10679m.length() : Integer.MAX_VALUE)) {
                    C1935k0 c1935k0M10599o = AbstractC5883g0.m10599o(c1050m);
                    if (c1935k0M10599o == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i12 = 0;
                    while (i12 < i11) {
                        int i13 = i10 + i12;
                        if (i13 >= c1935k0M10599o.f6561a.f6549a.f6529h.length()) {
                            arrayList.add(z9);
                            viewTreeObserverOnGlobalLayoutListenerC5934t = viewTreeObserverOnGlobalLayoutListenerC5934t2;
                        } else {
                            C0808c c0808cM4802b = c1935k0M10599o.m4802b(i13);
                            AbstractC5614i1 abstractC5614i1M2653d = c1054q.m2653d();
                            long jMo8868m0 = 0;
                            if (abstractC5614i1M2653d != null) {
                                if (!abstractC5614i1M2653d.mo10106r1().f23801t) {
                                    abstractC5614i1M2653d = null;
                                }
                                if (abstractC5614i1M2653d != null) {
                                    jMo8868m0 = abstractC5614i1M2653d.mo8868m0(0L);
                                }
                            }
                            C0808c c0808cM2053i = c0808cM4802b.m2053i(jMo8868m0);
                            C0808c c0808cM2656g = c1054q.m2656g();
                            C0808c c0808cM2049e = c0808cM2053i.m2051g(c0808cM2656g) ? c0808cM2053i.m2049e(c0808cM2656g) : null;
                            if (c0808cM2049e != null) {
                                long jM10665w = viewTreeObserverOnGlobalLayoutListenerC5934t2.m10665w((((long) Float.floatToRawIntBits(c0808cM2049e.f2417b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c0808cM2049e.f2416a)) << 32));
                                long jM10665w2 = viewTreeObserverOnGlobalLayoutListenerC5934t2.m10665w((((long) Float.floatToRawIntBits(c0808cM2049e.f2418c)) << 32) | (((long) Float.floatToRawIntBits(c0808cM2049e.f2419d)) & 4294967295L));
                                viewTreeObserverOnGlobalLayoutListenerC5934t = viewTreeObserverOnGlobalLayoutListenerC5934t2;
                                int i14 = (int) (jM10665w >> 32);
                                int i15 = (int) (jM10665w2 >> 32);
                                float fMin = Math.min(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15));
                                int i16 = (int) (jM10665w & 4294967295L);
                                int i17 = (int) (jM10665w2 & 4294967295L);
                                rectF = new RectF(fMin, Math.min(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17)), Math.max(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15)), Math.max(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17)));
                            } else {
                                viewTreeObserverOnGlobalLayoutListenerC5934t = viewTreeObserverOnGlobalLayoutListenerC5934t2;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i12++;
                        viewTreeObserverOnGlobalLayoutListenerC5934t2 = viewTreeObserverOnGlobalLayoutListenerC5934t;
                        z9 = false;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        C1061x c1061x = AbstractC1058u.f3401z;
        if (c0943k0.m2316c(c1061x) && bundle != null && AbstractC1416l.m3825a(str, "androidx.compose.ui.semantics.testTag")) {
            Object objM2320g = c0943k0.m2320g(c1061x);
            String str2 = (String) (objM2320g == null ? null : objM2320g);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (AbstractC1416l.m3825a(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, c1054q.f3352f);
            return;
        }
        if (AbstractC1416l.m3825a(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objM2320g2 = c0943k0.m2320g(AbstractC1058u.f3375P);
            InterfaceC1026r0 interfaceC1026r0 = (InterfaceC1026r0) (objM2320g2 == null ? null : objM2320g2);
            if (interfaceC1026r0 != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                C0808c c0808cM10700n = m10700n(c1054q, rect, interfaceC1026r0);
                float f3 = c0808cM10700n.f2417b;
                float f10 = c0808cM10700n.f2416a;
                AbstractC0996c0 abstractC0996c0Mo2612a = interfaceC1026r0.mo2612a(c0808cM10700n.m2047c(), c5602f0.f22772F, viewTreeObserverOnGlobalLayoutListenerC5934t2.getDensity());
                if (abstractC0996c0Mo2612a instanceof C1012k0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m10675E(abstractC0996c0Mo2612a, f10, f3));
                    return;
                } else if (abstractC0996c0Mo2612a instanceof C1014l0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m10675E(abstractC0996c0Mo2612a, f10, f3));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m10676G(abstractC0996c0Mo2612a));
                    return;
                } else if (!(abstractC0996c0Mo2612a instanceof C1010j0)) {
                    C3193a.m6822k();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m10677H(abstractC0996c0Mo2612a, f10, f3));
                    return;
                }
            }
            return;
        }
        if (AbstractC1416l.m3825a(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objM2320g3 = c0943k0.m2320g(AbstractC1058u.f3375P);
            InterfaceC1026r0 interfaceC1026r02 = (InterfaceC1026r0) (objM2320g3 == null ? null : objM2320g3);
            if (interfaceC1026r02 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                C0808c c0808cM10700n2 = m10700n(c1054q, rect2, interfaceC1026r02);
                Rect rectM10675E = m10675E(interfaceC1026r02.mo2612a(c0808cM10700n2.m2047c(), c5602f0.f22772F, viewTreeObserverOnGlobalLayoutListenerC5934t2.getDensity()), c0808cM10700n2.f2416a, c0808cM10700n2.f2417b);
                if (rectM10675E != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectM10675E);
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC1416l.m3825a(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objM2320g4 = c0943k0.m2320g(AbstractC1058u.f3375P);
            InterfaceC1026r0 interfaceC1026r03 = (InterfaceC1026r0) (objM2320g4 == null ? null : objM2320g4);
            if (interfaceC1026r03 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrM10676G = m10676G(interfaceC1026r03.mo2612a(m10700n(c1054q, rect3, interfaceC1026r03).m2047c(), c5602f0.f22772F, viewTreeObserverOnGlobalLayoutListenerC5934t2.getDensity()));
                if (fArrM10676G != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM10676G);
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC1416l.m3825a(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objM2320g5 = c0943k0.m2320g(AbstractC1058u.f3375P);
            InterfaceC1026r0 interfaceC1026r04 = (InterfaceC1026r0) (objM2320g5 == null ? null : objM2320g5);
            if (interfaceC1026r04 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                C0808c c0808cM10700n3 = m10700n(c1054q, rect4, interfaceC1026r04);
                Region regionM10677H = m10677H(interfaceC1026r04.mo2612a(c0808cM10700n3.m2047c(), c5602f0.f22772F, viewTreeObserverOnGlobalLayoutListenerC5934t2.getDensity()), c0808cM10700n3.f2416a, c0808cM10700n3.f2417b);
                if (regionM10677H != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionM10677H);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Rect m10691d(C1055r c1055r) {
        C4241k c4241k = c1055r.f3354b;
        return m10688F(c4241k.f13914a, c4241k.f13915b, c4241k.f13916c, c4241k.f13917d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f7, code lost:
    
        if (p249qg.AbstractC3603v.m7552f(r4, r2) == r7) goto L50;
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
    public final Object m10692e(AbstractC6038c abstractC6038c) throws Throwable {
        C5946w c5946w;
        C0932f c0932f;
        C0966x c0966x;
        C3970b c3970b;
        C0966x c0966x2;
        C3970b c3970b2;
        int i9;
        long j3;
        Object objM8185b;
        if (abstractC6038c instanceof C5946w) {
            c5946w = (C5946w) abstractC6038c;
            int i10 = c5946w.f24172k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5946w.f24172k = i10 - Integer.MIN_VALUE;
            } else {
                c5946w = new C5946w(this, abstractC6038c);
            }
        }
        Object obj = c5946w.f24170i;
        int i11 = c5946w.f24172k;
        C0932f c0932f2 = this.f24197B;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        try {
            if (i11 == 0) {
                AbstractC1089i.m2732I0(obj);
                c0966x = new C0966x();
                C3971c c3971c = this.f24198C;
                c3971c.getClass();
                c3970b = new C3970b(c3971c);
                c5946w.f24168g = c0966x;
                c5946w.f24169h = c3970b;
                c5946w.f24172k = 1;
                objM8185b = c3970b.m8185b(c5946w);
                if (objM8185b != enumC5799a) {
                }
            } else if (i11 == 1) {
                c3970b2 = c5946w.f24169h;
                c0966x2 = c5946w.f24168g;
                AbstractC1089i.m2732I0(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i11 != 2) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c3970b2 = c5946w.f24169h;
                c0966x2 = c5946w.f24168g;
                AbstractC1089i.m2732I0(obj);
                char c10 = 2;
                c0932f = c0932f2;
                c0966x = c0966x2;
                c0932f2 = c0932f;
                c3970b = c3970b2;
                c5946w.f24168g = c0966x;
                c5946w.f24169h = c3970b;
                c5946w.f24172k = 1;
                objM8185b = c3970b.m8185b(c5946w);
                if (objM8185b != enumC5799a) {
                    return enumC5799a;
                }
                C3970b c3970b3 = c3970b;
                c0966x2 = c0966x;
                obj = objM8185b;
                c3970b2 = c3970b3;
                if (((Boolean) obj).booleanValue()) {
                    c0932f2.clear();
                    return C3967n.f12976a;
                }
                c3970b2.m8186c();
                if (m10701o()) {
                    int i12 = c0932f2.f2922i;
                    for (int i13 = 0; i13 < i12; i13++) {
                        C5602f0 c5602f0 = (C5602f0) c0932f2.f2921h[i13];
                        m10685B(c5602f0, c0966x2);
                        m10686C(c5602f0);
                    }
                    c0966x2.f3041d = 0;
                    long[] jArr = c0966x2.f3038a;
                    if (jArr != AbstractC0957r0.f3015a) {
                        try {
                            AbstractC4165l.m8388w0(-9187201950435737472L, jArr);
                            long[] jArr2 = c0966x2.f3038a;
                            i9 = c0966x2.f3040c;
                            int i14 = i9 >> 3;
                            jArr2[i14] = ((~j3) & jArr2[i14]) | j3;
                        } catch (Throwable th2) {
                            th = th2;
                            c0932f.clear();
                            throw th;
                        }
                        j3 = 255 << ((i9 & 7) << 3);
                        c0932f = c0932f2;
                    } else {
                        c0932f = c0932f2;
                    }
                    c0966x2.f3042e = AbstractC0957r0.m2355a(c0966x2.f3040c) - c0966x2.f3041d;
                    Handler handler = this.f24215j.getHandler();
                    if (!this.f24210O && handler != null) {
                        this.f24210O = true;
                        handler.post(this.f24212Q);
                    }
                } else {
                    c0932f = c0932f2;
                }
                c0932f.clear();
                this.f24227v.m2374c();
                this.f24228w.m2374c();
                long j4 = this.f24219n;
                c5946w.f24168g = c0966x2;
                c5946w.f24169h = c3970b2;
                c10 = 2;
                c5946w.f24172k = 2;
            }
        } catch (Throwable th3) {
            th = th3;
            c0932f = c0932f2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m10693f(int i9, long j3, boolean z9) {
        C1061x c1061x;
        int i10;
        if (!AbstractC1416l.m3825a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        AbstractC0942k abstractC0942kM10699l = m10699l();
        if (C0807b.m2039b(j3, 9205357640488583168L) || (((9223372034707292159L & j3) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z9) {
            c1061x = AbstractC1058u.f3397v;
        } else {
            if (z9) {
                C3193a.m6822k();
                return false;
            }
            c1061x = AbstractC1058u.f3396u;
        }
        Object[] objArr = abstractC0942kM10699l.f2965c;
        long[] jArr = abstractC0942kM10699l.f2963a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            long j4 = jArr[i11];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j4) < 128) {
                        C1055r c1055r = (C1055r) objArr[(i11 << 3) + i14];
                        C4241k c4241k = c1055r.f3354b;
                        float f3 = c4241k.f13914a;
                        i10 = i12;
                        float f10 = c4241k.f13915b;
                        float f11 = c4241k.f13916c;
                        float f12 = c4241k.f13917d;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
                        if ((fIntBitsToFloat2 < f12) & (fIntBitsToFloat >= f3) & (fIntBitsToFloat < f11) & (fIntBitsToFloat2 >= f10)) {
                            Object objM2320g = c1055r.f3353a.f3350d.f3341g.m2320g(c1061x);
                            if (objM2320g == null) {
                                objM2320g = null;
                            }
                            C1047j c1047j = (C1047j) objM2320g;
                            if (c1047j != null) {
                                InterfaceC1220a interfaceC1220a = c1047j.f3288a;
                                if (i9 < 0) {
                                    if (((Number) interfaceC1220a.invoke()).floatValue() > 0.0f) {
                                        z10 = true;
                                    }
                                } else if (((Number) interfaceC1220a.invoke()).floatValue() < ((Number) c1047j.f3289b.invoke()).floatValue()) {
                                }
                            }
                        }
                    } else {
                        i10 = i12;
                    }
                    j4 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return z10;
                }
            }
            if (i11 == length) {
                return z10;
            }
            i11++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m10694g() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m10701o()) {
                m10704u(this.f24215j.getSemanticsOwner().m2668a(), this.f24209N);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                m10684A(m10699l());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    m10689J();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final AccessibilityEvent m10695h(int i9, int i10) {
        C1055r c1055r;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = this.f24215j;
        accessibilityEventObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC5934t.getContext().getPackageName());
        accessibilityEventObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC5934t, i9);
        if (m10701o() && (c1055r = (C1055r) m10699l().m2313b(i9)) != null) {
            C1054q c1054q = c1055r.f3353a;
            accessibilityEventObtain.setPassword(c1054q.f3350d.f3341g.m2316c(AbstractC1058u.f3370K));
            Object objM2320g = c1054q.f3350d.f3341g.m2320g(AbstractC1058u.f3389n);
            if (objM2320g == null) {
                objM2320g = null;
            }
            boolean zM3825a = AbstractC1416l.m3825a(objM2320g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC1573b.m4098f(accessibilityEventObtain, zM3825a);
            }
        }
        return accessibilityEventObtain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final AccessibilityEvent m10696i(int i9, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventM10695h = m10695h(i9, 8192);
        if (num != null) {
            accessibilityEventM10695h.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventM10695h.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventM10695h.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventM10695h.getText().add(charSequence);
        }
        return accessibilityEventM10695h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m10697j(C1054q c1054q) {
        C1050m c1050m = c1054q.f3350d;
        if (!c1050m.f3341g.m2316c(AbstractC1058u.f3376a)) {
            C1061x c1061x = AbstractC1058u.f3366G;
            if (c1050m.f3341g.m2316c(c1061x)) {
                return (int) (((C1939m0) c1050m.m2646d(c1061x)).f6575a & 4294967295L);
            }
        }
        return this.f24231z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final int m10698k(C1054q c1054q) {
        C1050m c1050m = c1054q.f3350d;
        if (!c1050m.f3341g.m2316c(AbstractC1058u.f3376a)) {
            C1061x c1061x = AbstractC1058u.f3366G;
            if (c1050m.f3341g.m2316c(c1061x)) {
                return (int) (((C1939m0) c1050m.m2646d(c1061x)).f6575a >> 32);
            }
        }
        return this.f24231z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final AbstractC0942k m10699l() {
        if (this.f24199D) {
            this.f24199D = false;
            ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = this.f24215j;
            this.f24201F = AbstractC1057t.m2671b(viewTreeObserverOnGlobalLayoutListenerC5934t.getSemanticsOwner(), C5914o.f23999i);
            if (m10701o()) {
                C0965w c0965w = this.f24201F;
                Resources resources = viewTreeObserverOnGlobalLayoutListenerC5934t.getContext().getResources();
                C0962u c0962u = this.f24203H;
                c0962u.m2363a();
                C0962u c0962u2 = this.f24204I;
                c0962u2.m2363a();
                C1055r c1055r = (C1055r) c0965w.m2313b(-1);
                C1054q c1054q = c1055r != null ? c1055r.f3353a : null;
                c1054q.getClass();
                ArrayList arrayListM2685b = AbstractC1063z.m2685b(c1054q, new C0166f(c0965w, 22), new C0166f(resources, 23), AbstractC0000a.m99x0(c1054q));
                int i9 = 1;
                int size = arrayListM2685b.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i10 = ((C1054q) arrayListM2685b.get(i9 - 1)).f3352f;
                        int i11 = ((C1054q) arrayListM2685b.get(i9)).f3352f;
                        c0962u.m2368f(i10, i11);
                        c0962u2.m2368f(i11, i10);
                        if (i9 == size) {
                            break;
                        }
                        i9++;
                    }
                }
            }
        }
        return this.f24201F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[LOOP:0: B:4:0x0014->B:36:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076 A[EDGE_INSN: B:47:0x0076->B:37:0x0076 BREAK  A[LOOP:0: B:4:0x0014->B:36:0x0073], SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0808c m10700n(C1054q c1054q, Rect rect, InterfaceC1026r0 interfaceC1026r0) {
        C5950x c5950x = new C5950x(interfaceC1026r0);
        C5602f0 c5602f0 = c1054q.f3349c;
        AbstractC5852n abstractC5852n = c5602f0.f22778L.f22719f;
        InterfaceC5612i interfaceC5612i = null;
        if ((abstractC5852n.f23791j & 8) != 0) {
            loop0: while (true) {
                if (abstractC5852n == null) {
                    break;
                }
                if ((abstractC5852n.f23790i & 8) != 0) {
                    AbstractC5852n abstractC5852nM10149e = abstractC5852n;
                    C2046b c2046b = null;
                    while (abstractC5852nM10149e != null) {
                        if (abstractC5852nM10149e instanceof InterfaceC5665z1) {
                            ((InterfaceC5665z1) abstractC5852nM10149e).mo1610X0(c5950x);
                            if (c5950x.f24178g) {
                                interfaceC5612i = abstractC5852nM10149e;
                                break loop0;
                            }
                        } else if ((abstractC5852nM10149e.f23790i & 8) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                            int i9 = 0;
                            for (AbstractC5852n abstractC5852n2 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
                                if ((abstractC5852n2.f23790i & 8) != 0) {
                                    i9++;
                                    if (i9 == 1) {
                                        abstractC5852nM10149e = abstractC5852n2;
                                    } else {
                                        if (c2046b == null) {
                                            c2046b = new C2046b(new AbstractC5852n[16]);
                                        }
                                        if (abstractC5852nM10149e != null) {
                                            c2046b.m5056b(abstractC5852nM10149e);
                                            abstractC5852nM10149e = null;
                                        }
                                        c2046b.m5056b(abstractC5852n2);
                                    }
                                }
                            }
                            if (i9 == 1) {
                            }
                        }
                        abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b);
                    }
                    if ((abstractC5852n.f23791j & 8) != 0) {
                        break;
                    }
                    abstractC5852n = abstractC5852n.f23793l;
                } else if ((abstractC5852n.f23791j & 8) != 0) {
                }
            }
        }
        InterfaceC5612i interfaceC5612i2 = (InterfaceC5665z1) interfaceC5612i;
        if (interfaceC5612i2 == null || !((AbstractC5852n) interfaceC5612i2).f23788g.f23801t) {
            return AbstractC4434w.m8882f(c5602f0.f22778L.f22717d, false);
        }
        AbstractC5614i1 abstractC5614i1M10166v = AbstractC5618k.m10166v(interfaceC5612i2);
        C0808c c0808cMo8866k0 = AbstractC4434w.m8884h(abstractC5614i1M10166v).mo8866k0(abstractC5614i1M10166v, false);
        Rect rectM10688F = m10688F(c0808cMo8866k0.f2416a, c0808cMo8866k0.f2417b, c0808cMo8866k0.f2418c, c0808cMo8866k0.f2419d);
        float f3 = rectM10688F.left - rect.left;
        float f10 = rectM10688F.top - rect.top;
        return new C0808c(f3, f10, rectM10688F.width() + f3, rectM10688F.height() + f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final boolean m10701o() {
        AccessibilityManager accessibilityManager = this.f24218m;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f24220o;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f24220o = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z9) {
        this.f24220o = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z9) {
        this.f24220o = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f24218m;
        if (accessibilityManager.isEnabled()) {
            this.f24220o = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f24215j.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.f24212Q);
        AccessibilityManager accessibilityManager = this.f24218m;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m10702p(C5602f0 c5602f0) {
        if (this.f24197B.add(c5602f0)) {
            this.f24198C.mo8208p(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final int m10703t(int i9) {
        if (i9 == this.f24215j.getSemanticsOwner().m2668a().f3352f) {
            return -1;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10704u(C1054q c1054q, C5881f2 c5881f2) {
        int[] iArr = AbstractC0946m.f2980a;
        C0966x c0966x = new C0966x();
        List listM2649j = C1054q.m2649j(4, c1054q);
        C5602f0 c5602f0 = c1054q.f3349c;
        int size = listM2649j.size();
        for (int i9 = 0; i9 < size; i9++) {
            C1054q c1054q2 = (C1054q) listM2649j.get(i9);
            AbstractC0942k abstractC0942kM10699l = m10699l();
            int i10 = c1054q2.f3352f;
            if (abstractC0942kM10699l.m2312a(i10)) {
                if (!c5881f2.f23881b.m2381b(i10)) {
                    m10702p(c5602f0);
                    return;
                }
                c0966x.m2380a(i10);
            }
        }
        C0966x c0966x2 = c5881f2.f23881b;
        int[] iArr2 = c0966x2.f3039b;
        long[] jArr = c0966x2.f3038a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j3 = jArr[i11];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j3) < 128 && !c0966x.m2381b(iArr2[(i11 << 3) + i13])) {
                            m10702p(c5602f0);
                            return;
                        }
                        j3 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        List listM2649j2 = C1054q.m2649j(4, c1054q);
        int size2 = listM2649j2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            C1054q c1054q3 = (C1054q) listM2649j2.get(i14);
            C5881f2 c5881f22 = (C5881f2) this.f24208M.m2313b(c1054q3.f3352f);
            if (c5881f22 != null && m10699l().m2312a(c1054q3.f3352f)) {
                m10704u(c1054q3, c5881f22);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final boolean m10705v(AccessibilityEvent accessibilityEvent) {
        if (!m10701o()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f24226u = true;
        }
        try {
            return ((Boolean) this.f24217l.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f24226u = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final boolean m10706w(int i9, int i10, Integer num, List list) {
        if (i9 == Integer.MIN_VALUE || !m10701o()) {
            return false;
        }
        AccessibilityEvent accessibilityEventM10695h = m10695h(i9, i10);
        if (num != null) {
            accessibilityEventM10695h.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventM10695h.setContentDescription(AbstractC4679a.m9170a(list, ",", null, 62));
        }
        return m10705v(accessibilityEventM10695h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m10707y(int i9, int i10, String str) {
        AccessibilityEvent accessibilityEventM10695h = m10695h(m10703t(i9), 32);
        accessibilityEventM10695h.setContentChangeTypes(i10);
        if (str != null) {
            accessibilityEventM10695h.getText().add(str);
        }
        m10705v(accessibilityEventM10695h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final void m10708z(int i9) {
        C5942v c5942v = this.f24200E;
        if (c5942v != null) {
            C1054q c1054q = c5942v.f24158a;
            if (i9 != c1054q.f3352f) {
                return;
            }
            if (SystemClock.uptimeMillis() - c5942v.f24163f <= 1000) {
                AccessibilityEvent accessibilityEventM10695h = m10695h(m10703t(c1054q.f3352f), Opcodes.ACC_DEPRECATED);
                accessibilityEventM10695h.setFromIndex(c5942v.f24161d);
                accessibilityEventM10695h.setToIndex(c5942v.f24162e);
                accessibilityEventM10695h.setAction(c5942v.f24159b);
                accessibilityEventM10695h.setMovementGranularity(c5942v.f24160c);
                accessibilityEventM10695h.getText().add(m10679m(c1054q));
                m10705v(accessibilityEventM10695h);
            }
        }
        this.f24200E = null;
    }
}
