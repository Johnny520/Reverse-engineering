package p047I0;

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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import me.dartcv.nuke.R;
import p000A.C0072l0;
import p007B0.C0172E;
import p007B0.C0190d;
import p011B4.AbstractC0231b;
import p027E4.C0330q;
import p028F.RunnableC0346g;
import p029F0.AbstractC0435z;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.InterfaceC0597i;
import p041H0.InterfaceC0632z0;
import p056K2.C0891q;
import p056K2.InterfaceC0877c;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p077P0.AbstractC1124k;
import p077P0.AbstractC1131r;
import p077P0.AbstractC1132s;
import p077P0.AbstractC1138y;
import p077P0.C1114a;
import p077P0.C1121h;
import p077P0.C1122i;
import p077P0.C1125l;
import p077P0.C1128o;
import p077P0.C1129p;
import p077P0.C1135v;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p092S0.C1257J;
import p092S0.C1259L;
import p092S0.C1269g;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p127Z2.AbstractC1784a;
import p153e1.C2015k;
import p164g1.AbstractC2179a;
import p169h0.AbstractC2206o;
import p172h3.AbstractC2250j;
import p172h3.C2242b;
import p172h3.C2243c;
import p179i4.AbstractC2352g;
import p186k.AbstractC2415L;
import p186k.AbstractC2426h;
import p186k.AbstractC2427i;
import p186k.AbstractC2428j;
import p186k.AbstractC2429k;
import p186k.AbstractC2430l;
import p186k.C2408E;
import p186k.C2418O;
import p186k.C2424f;
import p186k.C2437s;
import p186k.C2438t;
import p186k.C2439u;
import p186k.C2440v;
import p192l.AbstractC2477a;
import p204n0.C2683b;
import p204n0.C2684c;
import p204n0.C2685d;
import p211o0.AbstractC2767z;
import p211o0.C2731F;
import p211o0.C2732G;
import p211o0.C2733H;
import p211o0.C2750i;
import p211o0.InterfaceC2738M;
import p229r1.AbstractC3067b;
import p234s1.AbstractC3170b;
import p234s1.C3175g;

/* JADX INFO: renamed from: I0.E */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0667E extends AbstractC3067b implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: R */
    public static final C2438t f2110R;

    /* JADX INFO: renamed from: A */
    public final C2243c f2111A;

    /* JADX INFO: renamed from: B */
    public boolean f2112B;

    /* JADX INFO: renamed from: C */
    public C0659A f2113C;

    /* JADX INFO: renamed from: D */
    public C2439u f2114D;

    /* JADX INFO: renamed from: E */
    public final C2440v f2115E;

    /* JADX INFO: renamed from: F */
    public final C2437s f2116F;

    /* JADX INFO: renamed from: G */
    public final C2437s f2117G;

    /* JADX INFO: renamed from: H */
    public final String f2118H;

    /* JADX INFO: renamed from: I */
    public final String f2119I;

    /* JADX INFO: renamed from: J */
    public final C0072l0 f2120J;

    /* JADX INFO: renamed from: K */
    public final C2439u f2121K;

    /* JADX INFO: renamed from: L */
    public C0684M0 f2122L;

    /* JADX INFO: renamed from: M */
    public boolean f2123M;

    /* JADX INFO: renamed from: N */
    public final C2437s f2124N;

    /* JADX INFO: renamed from: O */
    public final RunnableC0346g f2125O;

    /* JADX INFO: renamed from: P */
    public final ArrayList f2126P;

    /* JADX INFO: renamed from: Q */
    public final C0665D f2127Q;

    /* JADX INFO: renamed from: g */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772y f2128g;

    /* JADX INFO: renamed from: h */
    public int f2129h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    public final C0665D f2130i = new C0665D(this, 0);

    /* JADX INFO: renamed from: j */
    public final AccessibilityManager f2131j;

    /* JADX INFO: renamed from: k */
    public long f2132k;

    /* JADX INFO: renamed from: l */
    public List f2133l;

    /* JADX INFO: renamed from: m */
    public final Handler f2134m;

    /* JADX INFO: renamed from: n */
    public final C0774z f2135n;

    /* JADX INFO: renamed from: o */
    public int f2136o;

    /* JADX INFO: renamed from: p */
    public int f2137p;

    /* JADX INFO: renamed from: q */
    public C3175g f2138q;

    /* JADX INFO: renamed from: r */
    public C3175g f2139r;

    /* JADX INFO: renamed from: s */
    public boolean f2140s;

    /* JADX INFO: renamed from: t */
    public final C2439u f2141t;

    /* JADX INFO: renamed from: u */
    public final C2439u f2142u;

    /* JADX INFO: renamed from: v */
    public final C2418O f2143v;

    /* JADX INFO: renamed from: w */
    public final C2418O f2144w;

    /* JADX INFO: renamed from: x */
    public int f2145x;

    /* JADX INFO: renamed from: y */
    public Integer f2146y;

    /* JADX INFO: renamed from: z */
    public final C2424f f2147z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        C2438t c2438t = AbstractC2427i.f7844a;
        C2438t c2438t2 = new C2438t(32);
        int i5 = c2438t2.f7878b;
        if (i5 < 0) {
            AbstractC2477a.m4423d("");
            throw null;
        }
        int i6 = i5 + 32;
        c2438t2.m4335b(i6);
        int[] iArr2 = c2438t2.f7877a;
        int i7 = c2438t2.f7878b;
        if (i5 != i7) {
            AbstractC0972l.m1991O(iArr2, iArr2, i6, i5, i7);
        }
        AbstractC0972l.m1994R(iArr, iArr2, i5, 0, 12);
        c2438t2.f7878b += 32;
        f2110R = c2438t2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnAttachStateChangeListenerC0667E(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y) {
        this.f2128g = viewTreeObserverOnGlobalLayoutListenerC0772y;
        Object systemService = viewTreeObserverOnGlobalLayoutListenerC0772y.getContext().getSystemService("accessibility");
        AbstractC1665j.m2983c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f2131j = (AccessibilityManager) systemService;
        this.f2132k = 100L;
        this.f2134m = new Handler(Looper.getMainLooper());
        this.f2135n = new C0774z(this);
        this.f2136o = Integer.MIN_VALUE;
        this.f2137p = Integer.MIN_VALUE;
        this.f2141t = new C2439u();
        this.f2142u = new C2439u();
        this.f2143v = new C2418O();
        this.f2144w = new C2418O();
        this.f2145x = -1;
        this.f2147z = new C2424f();
        int i5 = 1;
        this.f2111A = AbstractC2250j.m4101a(1, 6, null);
        this.f2112B = true;
        C2439u c2439u = AbstractC2429k.f7850a;
        AbstractC1665j.m2983c(c2439u, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f2114D = c2439u;
        this.f2115E = new C2440v();
        this.f2116F = new C2437s();
        this.f2117G = new C2437s();
        this.f2118H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f2119I = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f2120J = new C0072l0(15);
        this.f2121K = new C2439u();
        C1128o c1128oM2180a = viewTreeObserverOnGlobalLayoutListenerC0772y.getSemanticsOwner().m2180a();
        AbstractC1665j.m2983c(c2439u, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f2122L = new C0684M0(c1128oM2180a, c2439u);
        int i6 = AbstractC2426h.f7843a;
        this.f2124N = new C2437s();
        viewTreeObserverOnGlobalLayoutListenerC0772y.addOnAttachStateChangeListener(this);
        this.f2125O = new RunnableC0346g(i5, this);
        this.f2126P = new ArrayList();
        this.f2127Q = new C0665D(this, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static Rect m1129E(AbstractC2767z abstractC2767z, float f2, float f5) {
        if (!(abstractC2767z instanceof C2732G) && !(abstractC2767z instanceof C2733H)) {
            return null;
        }
        C2684c c2684cMo4788k = abstractC2767z.mo4788k();
        return new Rect((int) (c2684cMo4788k.f8558a + f2), (int) (c2684cMo4788k.f8559b + f5), (int) (c2684cMo4788k.f8560c + f2), (int) (c2684cMo4788k.f8561d + f5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static float[] m1130G(AbstractC2767z abstractC2767z) {
        if (!(abstractC2767z instanceof C2733H)) {
            return null;
        }
        C2685d c2685d = ((C2733H) abstractC2767z).f8678f;
        long j5 = c2685d.f8569h;
        long j6 = c2685d.f8568g;
        long j7 = c2685d.f8567f;
        long j8 = c2685d.f8566e;
        return new float[]{Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)), Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)), Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L))};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static Region m1131H(AbstractC2767z abstractC2767z, float f2, float f5) {
        if (!(abstractC2767z instanceof C2731F)) {
            return null;
        }
        C2731F c2731f = (C2731F) abstractC2767z;
        C2684c c2684cM4657h = c2731f.mo4788k().m4657h(f2, f5);
        Region region = new Region(new Rect((int) (c2684cM4657h.f8558a + 0.0f), (int) (c2684cM4657h.f8559b + 0.0f), (int) (c2684cM4657h.f8560c + 0.0f), (int) (c2684cM4657h.f8561d + 0.0f)));
        Region region2 = new Region();
        C2750i c2750i = c2731f.f8676f;
        if (!(c2750i instanceof C2750i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = c2750i.f8742a;
        path.offset(f2, f5);
        region2.setPath(path, region);
        return region2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static CharSequence m1132I(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i5 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i5 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i5);
                AbstractC1665j.m2983c(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m1133m(C1128o c1128o) {
        C1269g c1269g;
        if (c1128o != null) {
            C1125l c1125l = c1128o.f3711d;
            C2408E c2408e = c1125l.f3702d;
            C1135v c1135v = AbstractC1132s.f3738a;
            if (c2408e.m4268c(c1135v)) {
                return AbstractC2179a.m4007a((List) c1125l.m2160c(c1135v), ",", null, 62);
            }
            C1135v c1135v2 = AbstractC1132s.f3727F;
            if (c2408e.m4268c(c1135v2)) {
                Object objM4272g = c2408e.m4272g(c1135v2);
                if (objM4272g == null) {
                    objM4272g = null;
                }
                C1269g c1269g2 = (C1269g) objM4272g;
                if (c1269g2 != null) {
                    return c1269g2.f4563e;
                }
            } else {
                Object objM4272g2 = c2408e.m4272g(AbstractC1132s.f3723B);
                if (objM4272g2 == null) {
                    objM4272g2 = null;
                }
                List list = (List) objM4272g2;
                if (list != null && (c1269g = (C1269g) AbstractC0973m.m2013T(list)) != null) {
                    return c1269g.f4563e;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final boolean m1134q(C1122i c1122i, float f2) {
        InterfaceC1599a interfaceC1599a = c1122i.f3649a;
        if (f2 >= 0.0f || ((Number) interfaceC1599a.mo6a()).floatValue() <= 0.0f) {
            return f2 > 0.0f && ((Number) interfaceC1599a.mo6a()).floatValue() < ((Number) c1122i.f3650b.mo6a()).floatValue();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final boolean m1135r(C1122i c1122i) {
        InterfaceC1599a interfaceC1599a = c1122i.f3649a;
        if (((Number) interfaceC1599a.mo6a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) interfaceC1599a.mo6a()).floatValue();
        ((Number) c1122i.f3650b.mo6a()).floatValue();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final boolean m1136s(C1122i c1122i) {
        InterfaceC1599a interfaceC1599a = c1122i.f3649a;
        if (((Number) interfaceC1599a.mo6a()).floatValue() < ((Number) c1122i.f3650b.mo6a()).floatValue()) {
            return true;
        }
        ((Number) interfaceC1599a.mo6a()).floatValue();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m1137x(ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E, int i5, int i6, Integer num, int i7) {
        if ((i7 & 4) != 0) {
            num = null;
        }
        viewOnAttachStateChangeListenerC0667E.m1161w(i5, i6, num, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1138A(AbstractC2428j abstractC2428j) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i5;
        Integer num;
        int i6;
        int i7;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i8;
        int i9;
        int i10;
        Integer num2;
        C1125l c1125l;
        C1128o c1128o;
        int i11;
        int i12;
        int i13;
        int i14;
        C2408E c2408e;
        C0564I c0564i;
        int i15;
        C1125l c1125l2;
        ArrayList arrayList3;
        long j5;
        int i16;
        int i17;
        int i18;
        C0564I c0564i2;
        Integer num3;
        int i19;
        C2408E c2408e2;
        int i20;
        C0682L0 c0682l0;
        boolean z5;
        C0682L0 c0682l02;
        boolean z6;
        InterfaceC0877c interfaceC0877c;
        int i21;
        String str;
        int i22;
        int i23;
        int i24;
        C2408E c2408e3;
        Integer num4;
        AccessibilityEvent accessibilityEventM1151i;
        Integer num5;
        AbstractC2428j abstractC2428j2 = abstractC2428j;
        ArrayList arrayList4 = this.f2126P;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = abstractC2428j2.f7846b;
        long[] jArr3 = abstractC2428j2.f7845a;
        int i25 = 2;
        int length = jArr3.length - 2;
        int i26 = 0;
        Integer num6 = 0;
        if (length < 0) {
            return;
        }
        int i27 = 0;
        while (true) {
            long j6 = jArr3[i27];
            int i28 = i25;
            int i29 = length;
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i30 = 8;
                int i31 = 8 - ((~(i27 - i29)) >>> 31);
                long j7 = j6;
                int i32 = i26;
                while (i32 < i31) {
                    if ((j7 & 255) < 128) {
                        int i33 = iArr3[(i27 << 3) + i32];
                        C0684M0 c0684m0 = (C0684M0) this.f2121K.m4318b(i33);
                        if (c0684m0 == null) {
                            i7 = i32;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i8 = i31;
                            i9 = i26;
                            i10 = i27;
                            num2 = num6;
                        } else {
                            C1125l c1125l3 = c0684m0.f2200a;
                            C2408E c2408e4 = c1125l3.f3702d;
                            C1129p c1129p = (C1129p) abstractC2428j2.m4318b(i33);
                            int i34 = i30;
                            C1128o c1128o2 = c1129p != null ? c1129p.f3715a : null;
                            if (c1128o2 == null) {
                                throw AbstractC0231b.m396g("no value for specified key");
                            }
                            C0564I c0564i3 = c1128o2.f3710c;
                            C1125l c1125l4 = c1128o2.f3711d;
                            iArr2 = iArr3;
                            int i35 = c1128o2.f3714g;
                            jArr2 = jArr3;
                            C2408E c2408e5 = c1125l4.f3702d;
                            i10 = i27;
                            Object[] objArr = c2408e5.f7788b;
                            Object[] objArr2 = c2408e5.f7789c;
                            long[] jArr4 = c2408e5.f7787a;
                            i7 = i32;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                C0564I c0564i4 = c0564i3;
                                i8 = i31;
                                int i36 = 0;
                                i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i36];
                                    c1128o = c1128o2;
                                    int i37 = i36;
                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i38 = 8 - ((~(i37 - length2)) >>> 31);
                                        int i39 = 0;
                                        while (i39 < i38) {
                                            if ((j8 & 255) < 128) {
                                                int i40 = (i37 << 3) + i39;
                                                Object obj = objArr[i40];
                                                int i41 = length2;
                                                Object obj2 = objArr2[i40];
                                                c1125l2 = c1125l3;
                                                C1135v c1135v = (C1135v) obj;
                                                j5 = j8;
                                                C1135v c1135v2 = AbstractC1132s.f3758u;
                                                if (AbstractC1665j.m2981a(c1135v, c1135v2) || AbstractC1665j.m2981a(c1135v, AbstractC1132s.f3759v)) {
                                                    int size = arrayList5.size();
                                                    i17 = i39;
                                                    int i42 = 0;
                                                    while (true) {
                                                        if (i42 >= size) {
                                                            c0682l0 = null;
                                                            break;
                                                        }
                                                        int i43 = size;
                                                        if (((C0682L0) arrayList5.get(i42)).f2163d == i33) {
                                                            c0682l0 = (C0682L0) arrayList5.get(i42);
                                                            break;
                                                        } else {
                                                            i42++;
                                                            size = i43;
                                                        }
                                                    }
                                                    if (c0682l0 != null) {
                                                        z5 = false;
                                                    } else {
                                                        c0682l0 = new C0682L0(i33, arrayList4);
                                                        z5 = true;
                                                    }
                                                    arrayList4.add(c0682l0);
                                                } else {
                                                    i17 = i39;
                                                    z5 = false;
                                                }
                                                if (z5) {
                                                    C1135v c1135v3 = AbstractC1132s.f3741d;
                                                    if (AbstractC1665j.m2981a(c1135v, c1135v3)) {
                                                        AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlin.String");
                                                        String str2 = (String) obj2;
                                                        if (c2408e4.m4268c(c1135v3)) {
                                                            m1162y(i33, i34, str2);
                                                        }
                                                        i19 = i33;
                                                        arrayList3 = arrayList5;
                                                        i16 = i38;
                                                        c0564i2 = c0564i4;
                                                        i18 = 8;
                                                        num3 = num6;
                                                        c2408e2 = c2408e4;
                                                        i20 = i41;
                                                    } else if (AbstractC1665j.m2981a(c1135v, AbstractC1132s.f3739b) || AbstractC1665j.m2981a(c1135v, AbstractC1132s.f3731J)) {
                                                        i19 = i33;
                                                        arrayList3 = arrayList5;
                                                        i16 = i38;
                                                        c0564i2 = c0564i4;
                                                        num3 = num6;
                                                        c2408e2 = c2408e4;
                                                        i20 = i41;
                                                        i18 = 8;
                                                        m1137x(this, m1158t(i19), 2048, 64, 8);
                                                        m1137x(this, m1158t(i19), 2048, num3, 8);
                                                    } else if (AbstractC1665j.m2981a(c1135v, AbstractC1132s.f3740c)) {
                                                        i18 = 8;
                                                        m1137x(this, m1158t(i33), 2048, 64, 8);
                                                        m1137x(this, m1158t(i33), 2048, num6, 8);
                                                        i19 = i33;
                                                        arrayList3 = arrayList5;
                                                        i16 = i38;
                                                        c0564i2 = c0564i4;
                                                        num3 = num6;
                                                        c2408e2 = c2408e4;
                                                        i20 = i41;
                                                    } else {
                                                        C1135v c1135v4 = AbstractC1132s.f3730I;
                                                        arrayList3 = arrayList5;
                                                        if (AbstractC1665j.m2981a(c1135v, c1135v4)) {
                                                            Object objM4272g = c2408e5.m4272g(AbstractC1132s.f3762y);
                                                            if (objM4272g == null) {
                                                                objM4272g = null;
                                                            }
                                                            C1121h c1121h = (C1121h) objM4272g;
                                                            if (c1121h != null && c1121h.f3648a == 4) {
                                                                Object objM4272g2 = c2408e5.m4272g(c1135v4);
                                                                if (objM4272g2 == null) {
                                                                    objM4272g2 = null;
                                                                }
                                                                if (AbstractC1665j.m2981a(objM4272g2, Boolean.TRUE)) {
                                                                    AccessibilityEvent accessibilityEventM1150h = m1150h(m1158t(i33), 4);
                                                                    C1128o c1128o3 = c1128o;
                                                                    c0564i2 = c0564i4;
                                                                    C1128o c1128o4 = new C1128o(c1128o3.f3708a, true, c0564i2, c1125l4);
                                                                    Object objM4272g3 = c1128o4.m2173k().f3702d.m4272g(AbstractC1132s.f3738a);
                                                                    if (objM4272g3 == null) {
                                                                        objM4272g3 = null;
                                                                    }
                                                                    List list = (List) objM4272g3;
                                                                    c1128o = c1128o3;
                                                                    String strM4007a = list != null ? AbstractC2179a.m4007a(list, ",", null, 62) : null;
                                                                    Object objM4272g4 = c1128o4.m2173k().f3702d.m4272g(AbstractC1132s.f3723B);
                                                                    if (objM4272g4 == null) {
                                                                        objM4272g4 = null;
                                                                    }
                                                                    List list2 = (List) objM4272g4;
                                                                    i16 = i38;
                                                                    String strM4007a2 = list2 != null ? AbstractC2179a.m4007a(list2, ",", null, 62) : null;
                                                                    if (strM4007a != null) {
                                                                        accessibilityEventM1150h.setContentDescription(strM4007a);
                                                                    }
                                                                    if (strM4007a2 != null) {
                                                                        accessibilityEventM1150h.getText().add(strM4007a2);
                                                                    }
                                                                    m1160v(accessibilityEventM1150h);
                                                                } else {
                                                                    i16 = i38;
                                                                    c0564i2 = c0564i4;
                                                                    m1137x(this, m1158t(i33), 2048, num6, 8);
                                                                }
                                                            } else {
                                                                i16 = i38;
                                                                c0564i2 = c0564i4;
                                                                m1137x(this, m1158t(i33), 2048, 64, 8);
                                                                m1137x(this, m1158t(i33), 2048, num6, 8);
                                                            }
                                                            num3 = num6;
                                                            i19 = i33;
                                                            c2408e2 = c2408e4;
                                                            i20 = i41;
                                                            i18 = 8;
                                                        } else {
                                                            i16 = i38;
                                                            c0564i2 = c0564i4;
                                                            if (AbstractC1665j.m2981a(c1135v, AbstractC1132s.f3738a)) {
                                                                int iM1158t = m1158t(i33);
                                                                AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                m1161w(iM1158t, 2048, 4, (List) obj2);
                                                                num3 = num6;
                                                                i19 = i33;
                                                                c2408e2 = c2408e4;
                                                            } else {
                                                                C1135v c1135v5 = AbstractC1132s.f3727F;
                                                                String str3 = "";
                                                                if (!AbstractC1665j.m2981a(c1135v, c1135v5)) {
                                                                    Integer num7 = num6;
                                                                    i19 = i33;
                                                                    c2408e2 = c2408e4;
                                                                    C1135v c1135v6 = AbstractC1132s.f3728G;
                                                                    if (AbstractC1665j.m2981a(c1135v, c1135v6)) {
                                                                        Object objM4272g5 = c2408e5.m4272g(c1135v5);
                                                                        if (objM4272g5 == null) {
                                                                            objM4272g5 = null;
                                                                        }
                                                                        C1269g c1269g = (C1269g) objM4272g5;
                                                                        if (c1269g != null && (str = c1269g.f4563e) != null) {
                                                                            str3 = str;
                                                                        }
                                                                        long j9 = ((C1259L) c1125l4.m2160c(c1135v6)).f4538a;
                                                                        num3 = num7;
                                                                        m1160v(m1151i(m1158t(i19), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) (j9 & 4294967295L)), Integer.valueOf(str3.length()), m1132I(str3)));
                                                                        m1163z(i35);
                                                                    } else {
                                                                        i20 = i41;
                                                                        num3 = num7;
                                                                        if (AbstractC1665j.m2981a(c1135v, c1135v2) || AbstractC1665j.m2981a(c1135v, AbstractC1132s.f3759v)) {
                                                                            m1157p(c0564i2);
                                                                            int size2 = arrayList4.size();
                                                                            int i44 = 0;
                                                                            while (true) {
                                                                                if (i44 >= size2) {
                                                                                    c0682l02 = null;
                                                                                    break;
                                                                                } else {
                                                                                    if (((C0682L0) arrayList4.get(i44)).f2163d == i19) {
                                                                                        c0682l02 = (C0682L0) arrayList4.get(i44);
                                                                                        break;
                                                                                    }
                                                                                    i44++;
                                                                                }
                                                                            }
                                                                            AbstractC1665j.m2982b(c0682l02);
                                                                            Object objM4272g6 = c2408e5.m4272g(c1135v2);
                                                                            if (objM4272g6 == null) {
                                                                                objM4272g6 = null;
                                                                            }
                                                                            c0682l02.f2167h = (C1122i) objM4272g6;
                                                                            Object objM4272g7 = c2408e5.m4272g(AbstractC1132s.f3759v);
                                                                            if (objM4272g7 == null) {
                                                                                objM4272g7 = null;
                                                                            }
                                                                            c0682l02.f2168i = (C1122i) objM4272g7;
                                                                            if (c0682l02.f2164e.contains(c0682l02)) {
                                                                                this.f2128g.getSnapshotObserver().f1972a.m3867c(c0682l02, this.f2127Q, new C0190d(4, c0682l02, this));
                                                                            }
                                                                        } else if (AbstractC1665j.m2981a(c1135v, AbstractC1132s.f3748k)) {
                                                                            AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                i21 = 8;
                                                                                m1160v(m1150h(m1158t(i35), 8));
                                                                            } else {
                                                                                i21 = 8;
                                                                            }
                                                                            m1137x(this, m1158t(i35), 2048, num3, i21);
                                                                            i18 = i21;
                                                                        } else {
                                                                            C1135v c1135v7 = AbstractC1124k.f3699x;
                                                                            if (AbstractC1665j.m2981a(c1135v, c1135v7)) {
                                                                                List list3 = (List) c1125l4.m2160c(c1135v7);
                                                                                Object objM4272g8 = c2408e2.m4272g(c1135v7);
                                                                                if (objM4272g8 == null) {
                                                                                    objM4272g8 = null;
                                                                                }
                                                                                List list4 = (List) objM4272g8;
                                                                                if (list4 != null) {
                                                                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                    if (list3.size() > 0) {
                                                                                        list3.get(0).getClass();
                                                                                        throw new ClassCastException();
                                                                                    }
                                                                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                    if (list4.size() > 0) {
                                                                                        list4.get(0).getClass();
                                                                                        throw new ClassCastException();
                                                                                    }
                                                                                    i13 = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? 0 : 1;
                                                                                } else if (!list3.isEmpty()) {
                                                                                    i13 = 1;
                                                                                }
                                                                            } else if (obj2 instanceof C1114a) {
                                                                                C1114a c1114a = (C1114a) obj2;
                                                                                Object objM4272g9 = c2408e2.m4272g(c1135v);
                                                                                if (objM4272g9 == null) {
                                                                                    objM4272g9 = null;
                                                                                }
                                                                                if (c1114a != objM4272g9) {
                                                                                    if (objM4272g9 instanceof C1114a) {
                                                                                        String str4 = c1114a.f3633a;
                                                                                        C1114a c1114a2 = (C1114a) objM4272g9;
                                                                                        InterfaceC0877c interfaceC0877c2 = c1114a2.f3634b;
                                                                                        if (AbstractC1665j.m2981a(str4, c1114a2.f3633a) && (((interfaceC0877c = c1114a.f3634b) != null || interfaceC0877c2 == null) && (interfaceC0877c == null || interfaceC0877c2 != null))) {
                                                                                            z6 = true;
                                                                                        }
                                                                                        if (!z6) {
                                                                                            i13 = 0;
                                                                                        }
                                                                                    }
                                                                                    z6 = false;
                                                                                    if (!z6) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        i18 = 8;
                                                                    }
                                                                } else if (c2408e5.m4268c(AbstractC1124k.f3686k)) {
                                                                    Object objM4272g10 = c2408e4.m4272g(c1135v5);
                                                                    if (objM4272g10 == null) {
                                                                        objM4272g10 = null;
                                                                    }
                                                                    C1269g c1269g2 = (C1269g) objM4272g10;
                                                                    if (c1269g2 == null) {
                                                                        c1269g2 = "";
                                                                    }
                                                                    Object objM4272g11 = c2408e5.m4272g(c1135v5);
                                                                    if (objM4272g11 == null) {
                                                                        objM4272g11 = null;
                                                                    }
                                                                    CharSequence charSequence = (C1269g) objM4272g11;
                                                                    if (charSequence == null) {
                                                                        charSequence = "";
                                                                    }
                                                                    CharSequence charSequenceM1132I = m1132I(charSequence);
                                                                    int length3 = c1269g2.length();
                                                                    int length4 = charSequence.length();
                                                                    int i45 = length3 > length4 ? length4 : length3;
                                                                    Integer num8 = num6;
                                                                    int i46 = 0;
                                                                    while (true) {
                                                                        i22 = length3;
                                                                        if (i46 >= i45) {
                                                                            i23 = length4;
                                                                            break;
                                                                        }
                                                                        i23 = length4;
                                                                        if (c1269g2.charAt(i46) != charSequence.charAt(i46)) {
                                                                            break;
                                                                        }
                                                                        i46++;
                                                                        length3 = i22;
                                                                        length4 = i23;
                                                                    }
                                                                    int i47 = 0;
                                                                    while (true) {
                                                                        if (i47 >= i45 - i46) {
                                                                            i24 = i47;
                                                                            break;
                                                                        }
                                                                        i24 = i47;
                                                                        if (c1269g2.charAt((i22 - 1) - i47) != charSequence.charAt((i23 - 1) - i24)) {
                                                                            break;
                                                                        } else {
                                                                            i47 = i24 + 1;
                                                                        }
                                                                    }
                                                                    int i48 = (i22 - i24) - i46;
                                                                    int i49 = (i23 - i24) - i46;
                                                                    C1135v c1135v8 = AbstractC1132s.f3732K;
                                                                    boolean zM4268c = c2408e4.m4268c(c1135v8);
                                                                    boolean zM4268c2 = c2408e5.m4268c(c1135v8);
                                                                    boolean zM4268c3 = c2408e4.m4268c(AbstractC1132s.f3727F);
                                                                    boolean z7 = zM4268c3 && !zM4268c && zM4268c2;
                                                                    boolean z8 = zM4268c3 && zM4268c && !zM4268c2;
                                                                    if (z7 || z8) {
                                                                        c2408e3 = c2408e4;
                                                                        i19 = i33;
                                                                        num4 = num8;
                                                                        accessibilityEventM1151i = m1151i(m1158t(i33), num4, num8, Integer.valueOf(i23), charSequenceM1132I);
                                                                    } else {
                                                                        c2408e3 = c2408e4;
                                                                        accessibilityEventM1151i = m1150h(m1158t(i33), 16);
                                                                        accessibilityEventM1151i.setFromIndex(i46);
                                                                        accessibilityEventM1151i.setRemovedCount(i48);
                                                                        accessibilityEventM1151i.setAddedCount(i49);
                                                                        accessibilityEventM1151i.setBeforeText(c1269g2);
                                                                        accessibilityEventM1151i.getText().add(charSequenceM1132I);
                                                                        i19 = i33;
                                                                        num4 = num8;
                                                                    }
                                                                    accessibilityEventM1151i.setClassName("android.widget.EditText");
                                                                    m1160v(accessibilityEventM1151i);
                                                                    if (z7 || z8) {
                                                                        long j10 = ((C1259L) c1125l4.m2160c(AbstractC1132s.f3728G)).f4538a;
                                                                        num5 = num4;
                                                                        accessibilityEventM1151i.setFromIndex((int) (j10 >> 32));
                                                                        accessibilityEventM1151i.setToIndex((int) (j10 & 4294967295L));
                                                                        m1160v(accessibilityEventM1151i);
                                                                    } else {
                                                                        num5 = num4;
                                                                    }
                                                                    i20 = i41;
                                                                    num3 = num5;
                                                                    c2408e2 = c2408e3;
                                                                    i18 = 8;
                                                                } else {
                                                                    Integer num9 = num6;
                                                                    i19 = i33;
                                                                    i18 = 8;
                                                                    m1137x(this, m1158t(i19), 2048, Integer.valueOf(i28), 8);
                                                                    i20 = i41;
                                                                    num3 = num9;
                                                                    c2408e2 = c2408e4;
                                                                }
                                                            }
                                                            i20 = i41;
                                                            i18 = 8;
                                                        }
                                                    }
                                                } else {
                                                    Object objM4272g12 = c2408e4.m4272g(c1135v);
                                                    if (objM4272g12 == null) {
                                                        objM4272g12 = null;
                                                    }
                                                    if (AbstractC1665j.m2981a(obj2, objM4272g12)) {
                                                        i19 = i33;
                                                        arrayList3 = arrayList5;
                                                        i16 = i38;
                                                        i18 = i34;
                                                    }
                                                    c0564i2 = c0564i4;
                                                    num3 = num6;
                                                    c2408e2 = c2408e4;
                                                    i20 = i41;
                                                }
                                            } else {
                                                c1125l2 = c1125l3;
                                                arrayList3 = arrayList5;
                                                j5 = j8;
                                                i16 = i38;
                                                i17 = i39;
                                                i18 = i34;
                                                c0564i2 = c0564i4;
                                                num3 = num6;
                                                i19 = i33;
                                                c2408e2 = c2408e4;
                                                i20 = length2;
                                            }
                                            i34 = i18;
                                            c2408e4 = c2408e2;
                                            c0564i4 = c0564i2;
                                            i38 = i16;
                                            i39 = i17 + 1;
                                            length2 = i20;
                                            num6 = num3;
                                            arrayList5 = arrayList3;
                                            i33 = i19;
                                            j8 = j5 >> i18;
                                            c1125l3 = c1125l2;
                                        }
                                        i12 = i33;
                                        c1125l = c1125l3;
                                        arrayList2 = arrayList5;
                                        c0564i = c0564i4;
                                        i11 = 1;
                                        num2 = num6;
                                        i15 = length2;
                                        int i50 = i38;
                                        c2408e = c2408e4;
                                        i9 = 0;
                                        if (i50 != i34) {
                                            break;
                                        }
                                    } else {
                                        i12 = i33;
                                        c1125l = c1125l3;
                                        c2408e = c2408e4;
                                        arrayList2 = arrayList5;
                                        c0564i = c0564i4;
                                        i9 = 0;
                                        i11 = 1;
                                        num2 = num6;
                                        i15 = length2;
                                    }
                                    if (i37 == i15) {
                                        break;
                                    }
                                    i33 = i12;
                                    c2408e4 = c2408e;
                                    c0564i4 = c0564i;
                                    c1128o2 = c1128o;
                                    c1125l3 = c1125l;
                                    i34 = 8;
                                    i36 = i37 + 1;
                                    length2 = i15;
                                    num6 = num2;
                                    arrayList5 = arrayList2;
                                }
                            } else {
                                c1125l = c1125l3;
                                arrayList2 = arrayList5;
                                i8 = i31;
                                c1128o = c1128o2;
                                i9 = 0;
                                i11 = 1;
                                num2 = num6;
                                i12 = i33;
                                i13 = 0;
                            }
                            if (i13 == 0) {
                                Iterator it = c1125l.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i14 = i9;
                                        break;
                                    } else {
                                        if (!c1128o.m2173k().f3702d.m4268c((C1135v) ((Map.Entry) it.next()).getKey())) {
                                            i14 = i11;
                                            break;
                                        }
                                    }
                                }
                                i13 = i14;
                            }
                            if (i13 != 0) {
                                i30 = 8;
                                m1137x(this, m1158t(i12), 2048, num2, 8);
                            } else {
                                i30 = 8;
                            }
                        }
                    }
                    j7 >>= i30;
                    i32 = i7 + 1;
                    abstractC2428j2 = abstractC2428j;
                    i26 = i9;
                    num6 = num2;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i27 = i10;
                    i31 = i8;
                    arrayList5 = arrayList2;
                }
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i5 = i26;
                int i51 = i27;
                num = num6;
                if (i31 != i30) {
                    return;
                } else {
                    i6 = i51;
                }
            } else {
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i5 = i26;
                num = num6;
                i6 = i27;
            }
            if (i6 == i29) {
                return;
            }
            i27 = i6 + 1;
            abstractC2428j2 = abstractC2428j;
            length = i29;
            i26 = i5;
            num6 = num;
            i25 = i28;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m1139B(C0564I c0564i, C2440v c2440v) {
        C1125l c1125lM841w;
        if (c0564i.m799G() && !this.f2128g.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c0564i)) {
            C0564I c0564i2 = null;
            if (!c0564i.f1699J.m962d(8)) {
                c0564i = c0564i.m839u();
                while (true) {
                    if (c0564i == null) {
                        c0564i = null;
                        break;
                    } else if (c0564i.f1699J.m962d(8)) {
                        break;
                    } else {
                        c0564i = c0564i.m839u();
                    }
                }
            }
            if (c0564i == null || (c1125lM841w = c0564i.m841w()) == null) {
                return;
            }
            if (!c1125lM841w.f3704f) {
                C0564I c0564iM839u = c0564i.m839u();
                while (true) {
                    if (c0564iM839u != null) {
                        C1125l c1125lM841w2 = c0564iM839u.m841w();
                        if (c1125lM841w2 != null && c1125lM841w2.f3704f) {
                            c0564i2 = c0564iM839u;
                            break;
                        }
                        c0564iM839u = c0564iM839u.m839u();
                    } else {
                        break;
                    }
                }
                if (c0564i2 != null) {
                    c0564i = c0564i2;
                }
            }
            int i5 = c0564i.f1712e;
            if (c2440v.m4345a(i5)) {
                m1137x(this, m1158t(i5), 2048, 1, 8);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final void m1140C(C0564I c0564i) {
        if (c0564i.m799G() && !this.f2128g.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c0564i)) {
            int i5 = c0564i.f1712e;
            C1122i c1122i = (C1122i) this.f2141t.m4318b(i5);
            C1122i c1122i2 = (C1122i) this.f2142u.m4318b(i5);
            if (c1122i == null && c1122i2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventM1150h = m1150h(i5, 4096);
            if (c1122i != null) {
                accessibilityEventM1150h.setScrollX((int) ((Number) c1122i.f3649a.mo6a()).floatValue());
                accessibilityEventM1150h.setMaxScrollX((int) ((Number) c1122i.f3650b.mo6a()).floatValue());
            }
            if (c1122i2 != null) {
                accessibilityEventM1150h.setScrollY((int) ((Number) c1122i2.f3649a.mo6a()).floatValue());
                accessibilityEventM1150h.setMaxScrollY((int) ((Number) c1122i2.f3650b.mo6a()).floatValue());
            }
            m1160v(accessibilityEventM1150h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final boolean m1141D(C1128o c1128o, int i5, int i6, boolean z5) {
        String strM1133m;
        C1125l c1125l = c1128o.f3711d;
        int i7 = c1128o.f3714g;
        C1135v c1135v = AbstractC1124k.f3685j;
        if (c1125l.f3702d.m4268c(c1135v) && AbstractC0681L.m1180b(c1128o)) {
            InterfaceC1604f interfaceC1604f = (InterfaceC1604f) ((C1114a) c1128o.f3711d.m2160c(c1135v)).f3634b;
            if (interfaceC1604f != null) {
                return ((Boolean) interfaceC1604f.mo5f(Integer.valueOf(i5), Integer.valueOf(i6), Boolean.valueOf(z5))).booleanValue();
            }
        } else if ((i5 != i6 || i6 != this.f2145x) && (strM1133m = m1133m(c1128o)) != null) {
            if (i5 < 0 || i5 != i6 || i6 > strM1133m.length()) {
                i5 = -1;
            }
            this.f2145x = i5;
            boolean z6 = strM1133m.length() > 0;
            m1160v(m1151i(m1158t(i7), z6 ? Integer.valueOf(this.f2145x) : null, z6 ? Integer.valueOf(this.f2145x) : null, z6 ? Integer.valueOf(strM1133m.length()) : null, strM1133m));
            m1163z(i7);
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final Rect m1142F(float f2, float f5, float f6, float f7) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = this.f2128g;
        long jM1314t = viewTreeObserverOnGlobalLayoutListenerC0772y.m1314t(jFloatToRawIntBits);
        long jM1314t2 = viewTreeObserverOnGlobalLayoutListenerC0772y.m1314t((((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
        int i5 = (int) (jM1314t >> 32);
        int i6 = (int) (jM1314t2 >> 32);
        int i7 = (int) (jM1314t & 4294967295L);
        int i8 = (int) (jM1314t2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6))), (int) Math.floor(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8))));
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
    public final void m1143J() {
        long j5;
        long j6;
        long j7;
        char c5;
        long[] jArr;
        long[] jArr2;
        long j8;
        int i5;
        int i6;
        int iNumberOfTrailingZeros;
        char c6;
        C2440v c2440v = new C2440v();
        C2440v c2440v2 = this.f2115E;
        int[] iArr = c2440v2.f7881b;
        long[] jArr3 = c2440v2.f7880a;
        int length = jArr3.length - 2;
        C2439u c2439u = this.f2121K;
        int i7 = 8;
        if (length >= 0) {
            int i8 = 0;
            j5 = 128;
            j6 = 255;
            while (true) {
                long j9 = jArr3[i8];
                char c7 = 7;
                j7 = -9187201950435737472L;
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j9 & 255) < 128) {
                            int i11 = iArr[(i8 << 3) + i10];
                            c6 = c7;
                            C1129p c1129p = (C1129p) m1154l().m4318b(i11);
                            C1128o c1128o = c1129p != null ? c1129p.f3715a : null;
                            if (c1128o != null) {
                                if (!c1128o.f3711d.f3702d.m4268c(AbstractC1132s.f3741d)) {
                                    c2440v.m4345a(i11);
                                    C0684M0 c0684m0 = (C0684M0) c2439u.m4318b(i11);
                                    if (c0684m0 != null) {
                                        Object objM4272g = c0684m0.f2200a.f3702d.m4272g(AbstractC1132s.f3741d);
                                        obj = (String) (objM4272g != null ? objM4272g : null);
                                    }
                                    m1162y(i11, 32, obj);
                                }
                            }
                        } else {
                            c6 = c7;
                        }
                        j9 >>= 8;
                        i10++;
                        c7 = c6;
                    }
                    c5 = c7;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c5 = 7;
                }
                if (i8 == length) {
                    break;
                } else {
                    i8++;
                }
            }
        } else {
            j5 = 128;
            j6 = 255;
            j7 = -9187201950435737472L;
            c5 = 7;
        }
        int[] iArr2 = c2440v.f7881b;
        long[] jArr4 = c2440v.f7880a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i12 = 0;
            while (true) {
                long j10 = jArr4[i12];
                if ((((~j10) << c5) & j10 & j7) != j7) {
                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j10 & j6) < j5) {
                            int i15 = iArr2[(i12 << 3) + i14];
                            int iHashCode = Integer.hashCode(i15) * (-862048943);
                            int i16 = iHashCode ^ (iHashCode << 16);
                            int i17 = i16 & 127;
                            int i18 = c2440v2.f7882c;
                            int i19 = (i16 >>> 7) & i18;
                            i5 = i7;
                            int i20 = 0;
                            while (true) {
                                long[] jArr5 = c2440v2.f7880a;
                                int i21 = i19 >> 3;
                                jArr2 = jArr4;
                                int i22 = (i19 & 7) << 3;
                                j8 = j10;
                                long j11 = (jArr5[i21] >>> i22) | ((jArr5[i21 + 1] << (64 - i22)) & ((-i22) >> 63));
                                int i23 = i18;
                                long j12 = (((long) i17) * 72340172838076673L) ^ j11;
                                long j13 = (j12 - 72340172838076673L) & (~j12) & j7;
                                while (true) {
                                    if (j13 == 0) {
                                        break;
                                    }
                                    iNumberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j13) >> 3)) & i23;
                                    int i24 = i23;
                                    if (c2440v2.f7881b[iNumberOfTrailingZeros] == i15) {
                                        break;
                                    }
                                    j13 &= j13 - 1;
                                    i23 = i24;
                                }
                                i20 += 8;
                                i19 = (i19 + i20) & i6;
                                jArr4 = jArr2;
                                i18 = i6;
                                j10 = j8;
                            }
                            int i25 = iNumberOfTrailingZeros;
                            if (i25 >= 0) {
                                c2440v2.m4350f(i25);
                            }
                        } else {
                            jArr2 = jArr4;
                            j8 = j10;
                            i5 = i7;
                        }
                        j10 = j8 >> i5;
                        i14++;
                        i7 = i5;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i13 != i7) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i12 == length2) {
                    break;
                }
                i12++;
                jArr4 = jArr;
                i7 = 8;
            }
        }
        c2439u.m4339c();
        AbstractC2428j abstractC2428jM1154l = m1154l();
        int[] iArr3 = abstractC2428jM1154l.f7846b;
        Object[] objArr = abstractC2428jM1154l.f7847c;
        long[] jArr6 = abstractC2428jM1154l.f7845a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i26 = 0;
            while (true) {
                long j14 = jArr6[i26];
                if ((((~j14) << c5) & j14 & j7) != j7) {
                    int i27 = 8 - ((~(i26 - length3)) >>> 31);
                    for (int i28 = 0; i28 < i27; i28++) {
                        if ((j14 & j6) < j5) {
                            int i29 = (i26 << 3) + i28;
                            int i30 = iArr3[i29];
                            C1128o c1128o2 = ((C1129p) objArr[i29]).f3715a;
                            C1125l c1125l = c1128o2.f3711d;
                            C1135v c1135v = AbstractC1132s.f3741d;
                            if (c1125l.f3702d.m4268c(c1135v) && c2440v2.m4345a(i30)) {
                                m1162y(i30, 16, (String) c1128o2.f3711d.m2160c(c1135v));
                            }
                            c2439u.m4344h(i30, new C0684M0(c1128o2, m1154l()));
                        }
                        j14 >>= 8;
                    }
                    if (i27 != 8) {
                        break;
                    }
                }
                if (i26 == length3) {
                    break;
                } else {
                    i26++;
                }
            }
        }
        this.f2122L = new C0684M0(this.f2128g.getSemanticsOwner().m2180a(), m1154l());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.AbstractC3067b
    /* JADX INFO: renamed from: a */
    public final C1753n mo1144a(View view) {
        return this.f2135n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1145c(int i5, C3175g c3175g, String str, Bundle bundle) {
        C1128o c1128o;
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = c3175g.f9931a;
        C1129p c1129p = (C1129p) m1154l().m4318b(i5);
        if (c1129p == null || (c1128o = c1129p.f3715a) == null) {
            return;
        }
        C0564I c0564i = c1128o.f3710c;
        C1125l c1125l = c1128o.f3711d;
        C2408E c2408e = c1125l.f3702d;
        String strM1133m = m1133m(c1128o);
        if (AbstractC1665j.m2981a(str, this.f2118H)) {
            int iM4331d = this.f2116F.m4331d(i5);
            if (iM4331d != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM4331d);
                return;
            }
            return;
        }
        if (AbstractC1665j.m2981a(str, this.f2119I)) {
            int iM4331d2 = this.f2117G.m4331d(i5);
            if (iM4331d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM4331d2);
                return;
            }
            return;
        }
        boolean zM4268c = c2408e.m4268c(AbstractC1124k.f3676a);
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y2 = this.f2128g;
        boolean z5 = false;
        if (zM4268c && bundle != null && AbstractC1665j.m2981a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i6 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i7 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i7 > 0 && i6 >= 0) {
                if (i6 < (strM1133m != null ? strM1133m.length() : Integer.MAX_VALUE)) {
                    C1257J c1257jM1189k = AbstractC0681L.m1189k(c1125l);
                    if (c1257jM1189k == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i8 = 0;
                    while (i8 < i7) {
                        int i9 = i6 + i8;
                        if (i9 >= c1257jM1189k.f4526a.f4516a.f4563e.length()) {
                            arrayList.add(z5);
                            viewTreeObserverOnGlobalLayoutListenerC0772y = viewTreeObserverOnGlobalLayoutListenerC0772y2;
                        } else {
                            C2684c c2684cM2325b = c1257jM1189k.m2325b(i9);
                            AbstractC0596h0 abstractC0596h0M2167d = c1128o.m2167d();
                            long jMo638R = 0;
                            if (abstractC0596h0M2167d != null) {
                                if (!abstractC0596h0M2167d.mo981R0().f7199q) {
                                    abstractC0596h0M2167d = null;
                                }
                                if (abstractC0596h0M2167d != null) {
                                    jMo638R = abstractC0596h0M2167d.mo638R(0L);
                                }
                            }
                            C2684c c2684cM4658i = c2684cM2325b.m4658i(jMo638R);
                            C2684c c2684cM2170g = c1128o.m2170g();
                            C2684c c2684cM4654e = c2684cM4658i.m4656g(c2684cM2170g) ? c2684cM4658i.m4654e(c2684cM2170g) : null;
                            if (c2684cM4654e != null) {
                                long jM1314t = viewTreeObserverOnGlobalLayoutListenerC0772y2.m1314t((((long) Float.floatToRawIntBits(c2684cM4654e.f8559b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c2684cM4654e.f8558a)) << 32));
                                long jM1314t2 = viewTreeObserverOnGlobalLayoutListenerC0772y2.m1314t((((long) Float.floatToRawIntBits(c2684cM4654e.f8560c)) << 32) | (((long) Float.floatToRawIntBits(c2684cM4654e.f8561d)) & 4294967295L));
                                viewTreeObserverOnGlobalLayoutListenerC0772y = viewTreeObserverOnGlobalLayoutListenerC0772y2;
                                int i10 = (int) (jM1314t >> 32);
                                int i11 = (int) (jM1314t2 >> 32);
                                float fMin = Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
                                int i12 = (int) (jM1314t & 4294967295L);
                                int i13 = (int) (jM1314t2 & 4294967295L);
                                rectF = new RectF(fMin, Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)));
                            } else {
                                viewTreeObserverOnGlobalLayoutListenerC0772y = viewTreeObserverOnGlobalLayoutListenerC0772y2;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i8++;
                        viewTreeObserverOnGlobalLayoutListenerC0772y2 = viewTreeObserverOnGlobalLayoutListenerC0772y;
                        z5 = false;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        C1135v c1135v = AbstractC1132s.f3763z;
        if (c2408e.m4268c(c1135v) && bundle != null && AbstractC1665j.m2981a(str, "androidx.compose.ui.semantics.testTag")) {
            Object objM4272g = c2408e.m4272g(c1135v);
            String str2 = (String) (objM4272g == null ? null : objM4272g);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (AbstractC1665j.m2981a(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, c1128o.f3714g);
            return;
        }
        if (AbstractC1665j.m2981a(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objM4272g2 = c2408e.m4272g(AbstractC1132s.f3737P);
            InterfaceC2738M interfaceC2738M = (InterfaceC2738M) (objM4272g2 == null ? null : objM4272g2);
            if (interfaceC2738M != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                C2684c c2684cM1155n = m1155n(c1128o, rect, interfaceC2738M);
                float f2 = c2684cM1155n.f8559b;
                float f5 = c2684cM1155n.f8558a;
                AbstractC2767z abstractC2767zMo1116a = interfaceC2738M.mo1116a(c2684cM1155n.m4652c(), c0564i.f1693D, viewTreeObserverOnGlobalLayoutListenerC0772y2.getDensity());
                if (abstractC2767zMo1116a instanceof C2732G) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m1129E(abstractC2767zMo1116a, f5, f2));
                    return;
                } else if (abstractC2767zMo1116a instanceof C2733H) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m1129E(abstractC2767zMo1116a, f5, f2));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m1130G(abstractC2767zMo1116a));
                    return;
                } else {
                    if (!(abstractC2767zMo1116a instanceof C2731F)) {
                        throw new C0330q();
                    }
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m1131H(abstractC2767zMo1116a, f5, f2));
                    return;
                }
            }
            return;
        }
        if (AbstractC1665j.m2981a(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objM4272g3 = c2408e.m4272g(AbstractC1132s.f3737P);
            InterfaceC2738M interfaceC2738M2 = (InterfaceC2738M) (objM4272g3 == null ? null : objM4272g3);
            if (interfaceC2738M2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                C2684c c2684cM1155n2 = m1155n(c1128o, rect2, interfaceC2738M2);
                Rect rectM1129E = m1129E(interfaceC2738M2.mo1116a(c2684cM1155n2.m4652c(), c0564i.f1693D, viewTreeObserverOnGlobalLayoutListenerC0772y2.getDensity()), c2684cM1155n2.f8558a, c2684cM1155n2.f8559b);
                if (rectM1129E != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectM1129E);
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC1665j.m2981a(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objM4272g4 = c2408e.m4272g(AbstractC1132s.f3737P);
            InterfaceC2738M interfaceC2738M3 = (InterfaceC2738M) (objM4272g4 == null ? null : objM4272g4);
            if (interfaceC2738M3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrM1130G = m1130G(interfaceC2738M3.mo1116a(m1155n(c1128o, rect3, interfaceC2738M3).m4652c(), c0564i.f1693D, viewTreeObserverOnGlobalLayoutListenerC0772y2.getDensity()));
                if (fArrM1130G != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM1130G);
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC1665j.m2981a(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objM4272g5 = c2408e.m4272g(AbstractC1132s.f3737P);
            InterfaceC2738M interfaceC2738M4 = (InterfaceC2738M) (objM4272g5 == null ? null : objM4272g5);
            if (interfaceC2738M4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                C2684c c2684cM1155n3 = m1155n(c1128o, rect4, interfaceC2738M4);
                Region regionM1131H = m1131H(interfaceC2738M4.mo1116a(c2684cM1155n3.m4652c(), c0564i.f1693D, viewTreeObserverOnGlobalLayoutListenerC0772y2.getDensity()), c2684cM1155n3.f8558a, c2684cM1155n3.f8559b);
                if (regionM1131H != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionM1131H);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Rect m1146d(C1129p c1129p) {
        C2015k c2015k = c1129p.f3716b;
        return m1142F(c2015k.f6737a, c2015k.f6738b, c2015k.f6739c, c2015k.f6740d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
    
        if (p160f3.AbstractC2162v.m3983e(r4, r2) == r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f2 -> B:50:0x00f5). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1147e(AbstractC1178c abstractC1178c) throws Throwable {
        C0661B c0661b;
        C2424f c2424f;
        C2440v c2440v;
        C2242b c2242b;
        C2440v c2440v2;
        C2242b c2242b2;
        int i5;
        long j5;
        Object objM4068b;
        if (abstractC1178c instanceof C0661B) {
            c0661b = (C0661B) abstractC1178c;
            int i6 = c0661b.f2100k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0661b.f2100k = i6 - Integer.MIN_VALUE;
            } else {
                c0661b = new C0661B(this, abstractC1178c);
            }
        }
        Object obj = c0661b.f2098i;
        int i7 = c0661b.f2100k;
        C2424f c2424f2 = this.f2147z;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        try {
            if (i7 == 0) {
                AbstractC1784a.m3205S(obj);
                c2440v = new C2440v();
                C2243c c2243c = this.f2111A;
                c2243c.getClass();
                c2242b = new C2242b(c2243c);
                c0661b.f2096g = c2440v;
                c0661b.f2097h = c2242b;
                c0661b.f2100k = 1;
                objM4068b = c2242b.m4068b(c0661b);
                if (objM4068b != enumC1152a) {
                }
            } else if (i7 == 1) {
                c2242b2 = c0661b.f2097h;
                c2440v2 = c0661b.f2096g;
                AbstractC1784a.m3205S(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2242b2 = c0661b.f2097h;
                c2440v2 = c0661b.f2096g;
                AbstractC1784a.m3205S(obj);
                char c5 = 2;
                c2424f = c2424f2;
                c2440v = c2440v2;
                c2424f2 = c2424f;
                c2242b = c2242b2;
                c0661b.f2096g = c2440v;
                c0661b.f2097h = c2242b;
                c0661b.f2100k = 1;
                objM4068b = c2242b.m4068b(c0661b);
                if (objM4068b != enumC1152a) {
                    return enumC1152a;
                }
                C2242b c2242b3 = c2242b;
                c2440v2 = c2440v;
                obj = objM4068b;
                c2242b2 = c2242b3;
                if (((Boolean) obj).booleanValue()) {
                    c2424f2.clear();
                    return C0891q.f2780a;
                }
                c2242b2.m4069c();
                if (m1156o()) {
                    int i8 = c2424f2.f7840f;
                    for (int i9 = 0; i9 < i8; i9++) {
                        C0564I c0564i = (C0564I) c2424f2.f7839e[i9];
                        m1139B(c0564i, c2440v2);
                        m1140C(c0564i);
                    }
                    c2440v2.f7883d = 0;
                    long[] jArr = c2440v2.f7880a;
                    if (jArr != AbstractC2415L.f7816a) {
                        try {
                            AbstractC0972l.m1999W(-9187201950435737472L, jArr);
                            long[] jArr2 = c2440v2.f7880a;
                            i5 = c2440v2.f7882c;
                            int i10 = i5 >> 3;
                            jArr2[i10] = ((~j5) & jArr2[i10]) | j5;
                        } catch (Throwable th) {
                            th = th;
                            c2424f.clear();
                            throw th;
                        }
                        j5 = 255 << ((i5 & 7) << 3);
                        c2424f = c2424f2;
                    } else {
                        c2424f = c2424f2;
                    }
                    c2440v2.f7884e = AbstractC2415L.m4295a(c2440v2.f7882c) - c2440v2.f7883d;
                    if (!this.f2123M) {
                        this.f2123M = true;
                        this.f2134m.post(this.f2125O);
                    }
                } else {
                    c2424f = c2424f2;
                }
                c2424f.clear();
                this.f2141t.m4339c();
                this.f2142u.m4339c();
                long j6 = this.f2132k;
                c0661b.f2096g = c2440v2;
                c0661b.f2097h = c2242b2;
                c5 = 2;
                c0661b.f2100k = 2;
            }
        } catch (Throwable th2) {
            th = th2;
            c2424f = c2424f2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1148f(boolean z5, int i5, long j5) {
        C1135v c1135v;
        int i6;
        if (!AbstractC1665j.m2981a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        AbstractC2428j abstractC2428jM1154l = m1154l();
        if (C2683b.m4644b(j5, 9205357640488583168L) || (((9223372034707292159L & j5) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z5) {
            c1135v = AbstractC1132s.f3759v;
        } else {
            if (z5) {
                throw new C0330q();
            }
            c1135v = AbstractC1132s.f3758u;
        }
        Object[] objArr = abstractC2428jM1154l.f7847c;
        long[] jArr = abstractC2428jM1154l.f7845a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i7 = 0;
        boolean z6 = false;
        while (true) {
            long j6 = jArr[i7];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8;
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((255 & j6) < 128) {
                        C1129p c1129p = (C1129p) objArr[(i7 << 3) + i10];
                        C2015k c2015k = c1129p.f3716b;
                        float f2 = c2015k.f6737a;
                        i6 = i8;
                        float f5 = c2015k.f6738b;
                        float f6 = c2015k.f6739c;
                        float f7 = c2015k.f6740d;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
                        if ((fIntBitsToFloat2 < f7) & (fIntBitsToFloat >= f2) & (fIntBitsToFloat < f6) & (fIntBitsToFloat2 >= f5)) {
                            Object objM4272g = c1129p.f3715a.f3711d.f3702d.m4272g(c1135v);
                            if (objM4272g == null) {
                                objM4272g = null;
                            }
                            C1122i c1122i = (C1122i) objM4272g;
                            if (c1122i != null) {
                                InterfaceC1599a interfaceC1599a = c1122i.f3649a;
                                if (i5 < 0) {
                                    if (((Number) interfaceC1599a.mo6a()).floatValue() > 0.0f) {
                                        z6 = true;
                                    }
                                } else if (((Number) interfaceC1599a.mo6a()).floatValue() < ((Number) c1122i.f3650b.mo6a()).floatValue()) {
                                }
                            }
                        }
                    } else {
                        i6 = i8;
                    }
                    j6 >>= i6;
                    i10++;
                    i8 = i6;
                }
                if (i9 != i8) {
                    return z6;
                }
            }
            if (i7 == length) {
                return z6;
            }
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m1149g() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m1156o()) {
                m1159u(this.f2128g.getSemanticsOwner().m2180a(), this.f2122L);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                m1138A(m1154l());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    m1143J();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final AccessibilityEvent m1150h(int i5, int i6) {
        C1129p c1129p;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i6);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = this.f2128g;
        accessibilityEventObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC0772y.getContext().getPackageName());
        accessibilityEventObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC0772y, i5);
        if (m1156o() && (c1129p = (C1129p) m1154l().m4318b(i5)) != null) {
            C1128o c1128o = c1129p.f3715a;
            accessibilityEventObtain.setPassword(c1128o.f3711d.f3702d.m4268c(AbstractC1132s.f3732K));
            Object objM4272g = c1128o.f3711d.f3702d.m4272g(AbstractC1132s.f3751n);
            if (objM4272g == null) {
                objM4272g = null;
            }
            boolean zM2981a = AbstractC1665j.m2981a(objM4272g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC3170b.m5437f(accessibilityEventObtain, zM2981a);
            }
        }
        return accessibilityEventObtain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final AccessibilityEvent m1151i(int i5, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventM1150h = m1150h(i5, 8192);
        if (num != null) {
            accessibilityEventM1150h.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventM1150h.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventM1150h.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventM1150h.getText().add(charSequence);
        }
        return accessibilityEventM1150h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m1152j(C1128o c1128o) {
        C1125l c1125l = c1128o.f3711d;
        C1125l c1125l2 = c1128o.f3711d;
        C1135v c1135v = AbstractC1132s.f3738a;
        if (!c1125l.f3702d.m4268c(AbstractC1132s.f3738a)) {
            C1135v c1135v2 = AbstractC1132s.f3728G;
            if (c1125l2.f3702d.m4268c(c1135v2)) {
                return (int) (((C1259L) c1125l2.m2160c(c1135v2)).f4538a & 4294967295L);
            }
        }
        return this.f2145x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final int m1153k(C1128o c1128o) {
        C1125l c1125l = c1128o.f3711d;
        C1125l c1125l2 = c1128o.f3711d;
        C1135v c1135v = AbstractC1132s.f3738a;
        if (!c1125l.f3702d.m4268c(AbstractC1132s.f3738a)) {
            C1135v c1135v2 = AbstractC1132s.f3728G;
            if (c1125l2.f3702d.m4268c(c1135v2)) {
                return (int) (((C1259L) c1125l2.m2160c(c1135v2)).f4538a >> 32);
            }
        }
        return this.f2145x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final AbstractC2428j m1154l() {
        if (this.f2112B) {
            this.f2112B = false;
            ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = this.f2128g;
            this.f2114D = AbstractC1131r.m2183b(viewTreeObserverOnGlobalLayoutListenerC0772y.getSemanticsOwner(), C0756q.f2347g);
            if (m1156o()) {
                C2439u c2439u = this.f2114D;
                Resources resources = viewTreeObserverOnGlobalLayoutListenerC0772y.getContext().getResources();
                C2437s c2437s = this.f2116F;
                c2437s.m4328a();
                C2437s c2437s2 = this.f2117G;
                c2437s2.m4328a();
                C1129p c1129p = (C1129p) c2439u.m4318b(-1);
                C1128o c1128o = c1129p != null ? c1129p.f3715a : null;
                AbstractC1665j.m2982b(c1128o);
                ArrayList arrayListM2192b = AbstractC1138y.m2192b(c1128o, new C0172E(6, c2439u), new C0172E(7, resources), AbstractC2352g.m4211y(c1128o));
                int iM4208u = AbstractC2352g.m4208u(arrayListM2192b);
                int i5 = 1;
                if (1 <= iM4208u) {
                    while (true) {
                        int i6 = ((C1128o) arrayListM2192b.get(i5 - 1)).f3714g;
                        int i7 = ((C1128o) arrayListM2192b.get(i5)).f3714g;
                        c2437s.m4333f(i6, i7);
                        c2437s2.m4333f(i7, i6);
                        if (i5 == iM4208u) {
                            break;
                        }
                        i5++;
                    }
                }
            }
        }
        return this.f2114D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[LOOP:0: B:4:0x0014->B:36:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076 A[EDGE_INSN: B:47:0x0076->B:37:0x0076 BREAK  A[LOOP:0: B:4:0x0014->B:36:0x0073], SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2684c m1155n(C1128o c1128o, Rect rect, InterfaceC2738M interfaceC2738M) {
        C0663C c0663c = new C0663C(interfaceC2738M);
        C0564I c0564i = c1128o.f3710c;
        AbstractC2206o abstractC2206o = c0564i.f1699J.f1896f;
        InterfaceC0597i interfaceC0597i = null;
        if ((abstractC2206o.f7189g & 8) != 0) {
            loop0: while (true) {
                if (abstractC2206o == null) {
                    break;
                }
                if ((abstractC2206o.f7188f & 8) != 0) {
                    AbstractC2206o abstractC2206oM1029e = abstractC2206o;
                    C1483e c1483e = null;
                    while (abstractC2206oM1029e != null) {
                        if (abstractC2206oM1029e instanceof InterfaceC0632z0) {
                            ((InterfaceC0632z0) abstractC2206oM1029e).mo943X(c0663c);
                            if (c0663c.f2102d) {
                                interfaceC0597i = abstractC2206oM1029e;
                                break loop0;
                            }
                        } else if ((abstractC2206oM1029e.f7188f & 8) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                            int i5 = 0;
                            for (AbstractC2206o abstractC2206o2 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o2 != null; abstractC2206o2 = abstractC2206o2.f7191i) {
                                if ((abstractC2206o2.f7188f & 8) != 0) {
                                    i5++;
                                    if (i5 == 1) {
                                        abstractC2206oM1029e = abstractC2206o2;
                                    } else {
                                        if (c1483e == null) {
                                            c1483e = new C1483e(new AbstractC2206o[16]);
                                        }
                                        if (abstractC2206oM1029e != null) {
                                            c1483e.m2753b(abstractC2206oM1029e);
                                            abstractC2206oM1029e = null;
                                        }
                                        c1483e.m2753b(abstractC2206o2);
                                    }
                                }
                            }
                            if (i5 == 1) {
                            }
                        }
                        abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e);
                    }
                    if ((abstractC2206o.f7189g & 8) != 0) {
                        break;
                    }
                    abstractC2206o = abstractC2206o.f7191i;
                } else if ((abstractC2206o.f7189g & 8) != 0) {
                }
            }
        }
        InterfaceC0597i interfaceC0597i2 = (InterfaceC0632z0) interfaceC0597i;
        if (interfaceC0597i2 == null || !((AbstractC2206o) interfaceC0597i2).f7186d.f7199q) {
            return AbstractC0435z.m691d(c0564i.f1699J.f1894d, false);
        }
        AbstractC0596h0 abstractC0596h0M1043s = AbstractC0601k.m1043s(interfaceC0597i2);
        C2684c c2684cMo634K = AbstractC0435z.m693f(abstractC0596h0M1043s).mo634K(abstractC0596h0M1043s, true);
        Rect rectM1142F = m1142F(c2684cMo634K.f8558a, c2684cMo634K.f8559b, c2684cMo634K.f8560c, c2684cMo634K.f8561d);
        float f2 = rectM1142F.left - rect.left;
        float f5 = rectM1142F.top - rect.top;
        return new C2684c(f2, f5, rectM1142F.width() + f2, rectM1142F.height() + f5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final boolean m1156o() {
        AccessibilityManager accessibilityManager = this.f2131j;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f2133l;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f2133l = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z5) {
        this.f2133l = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z5) {
        this.f2133l = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f2131j;
        if (accessibilityManager.isEnabled()) {
            this.f2133l = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2134m.removeCallbacks(this.f2125O);
        AccessibilityManager accessibilityManager = this.f2131j;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m1157p(C0564I c0564i) {
        if (this.f2147z.add(c0564i)) {
            this.f2111A.mo4090o(C0891q.f2780a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final int m1158t(int i5) {
        if (i5 == this.f2128g.getSemanticsOwner().m2180a().f3714g) {
            return -1;
        }
        return i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1159u(C1128o c1128o, C0684M0 c0684m0) {
        int[] iArr = AbstractC2430l.f7851a;
        C2440v c2440v = new C2440v();
        List listM2163j = C1128o.m2163j(4, c1128o);
        C0564I c0564i = c1128o.f3710c;
        int size = listM2163j.size();
        for (int i5 = 0; i5 < size; i5++) {
            C1128o c1128o2 = (C1128o) listM2163j.get(i5);
            AbstractC2428j abstractC2428jM1154l = m1154l();
            int i6 = c1128o2.f3714g;
            if (abstractC2428jM1154l.m4317a(i6)) {
                if (!c0684m0.f2201b.m4346b(i6)) {
                    m1157p(c0564i);
                    return;
                }
                c2440v.m4345a(i6);
            }
        }
        C2440v c2440v2 = c0684m0.f2201b;
        int[] iArr2 = c2440v2.f7881b;
        long[] jArr = c2440v2.f7880a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j5 = jArr[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j5) < 128 && !c2440v.m4346b(iArr2[(i7 << 3) + i9])) {
                            m1157p(c0564i);
                            return;
                        }
                        j5 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    } else if (i7 == length) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
        }
        List listM2163j2 = C1128o.m2163j(4, c1128o);
        int size2 = listM2163j2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            C1128o c1128o3 = (C1128o) listM2163j2.get(i10);
            C0684M0 c0684m02 = (C0684M0) this.f2121K.m4318b(c1128o3.f3714g);
            if (c0684m02 != null && m1154l().m4317a(c1128o3.f3714g)) {
                m1159u(c1128o3, c0684m02);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final boolean m1160v(AccessibilityEvent accessibilityEvent) {
        if (!m1156o()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f2140s = true;
        }
        try {
            return ((Boolean) this.f2130i.mo1h(accessibilityEvent)).booleanValue();
        } finally {
            this.f2140s = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final boolean m1161w(int i5, int i6, Integer num, List list) {
        if (i5 == Integer.MIN_VALUE || !m1156o()) {
            return false;
        }
        AccessibilityEvent accessibilityEventM1150h = m1150h(i5, i6);
        if (num != null) {
            accessibilityEventM1150h.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventM1150h.setContentDescription(AbstractC2179a.m4007a(list, ",", null, 62));
        }
        return m1160v(accessibilityEventM1150h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m1162y(int i5, int i6, String str) {
        AccessibilityEvent accessibilityEventM1150h = m1150h(m1158t(i5), 32);
        accessibilityEventM1150h.setContentChangeTypes(i6);
        if (str != null) {
            accessibilityEventM1150h.getText().add(str);
        }
        m1160v(accessibilityEventM1150h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final void m1163z(int i5) {
        C0659A c0659a = this.f2113C;
        if (c0659a != null) {
            C1128o c1128o = c0659a.f2085a;
            if (i5 != c1128o.f3714g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c0659a.f2090f <= 1000) {
                AccessibilityEvent accessibilityEventM1150h = m1150h(m1158t(c1128o.f3714g), 131072);
                accessibilityEventM1150h.setFromIndex(c0659a.f2088d);
                accessibilityEventM1150h.setToIndex(c0659a.f2089e);
                accessibilityEventM1150h.setAction(c0659a.f2086b);
                accessibilityEventM1150h.setMovementGranularity(c0659a.f2087c);
                accessibilityEventM1150h.getText().add(m1133m(c1128o));
                m1160v(accessibilityEventM1150h);
            }
        }
        this.f2113C = null;
    }
}
