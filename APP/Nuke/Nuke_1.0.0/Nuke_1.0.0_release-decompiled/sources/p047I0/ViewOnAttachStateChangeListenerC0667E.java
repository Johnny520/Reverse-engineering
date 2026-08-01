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
import java.util.List;
import me.dartcv.nuke.R;
import p000A.C0072l0;
import p007B0.C0172E;
import p027E4.C0330q;
import p028F.RunnableC0346g;
import p041H0.AbstractC0596h0;
import p041H0.C0564I;
import p056K2.C0891q;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p077P0.AbstractC1124k;
import p077P0.AbstractC1131r;
import p077P0.AbstractC1132s;
import p077P0.AbstractC1138y;
import p077P0.C1114a;
import p077P0.C1122i;
import p077P0.C1125l;
import p077P0.C1128o;
import p077P0.C1129p;
import p077P0.C1135v;
import p092S0.C1257J;
import p092S0.C1259L;
import p092S0.C1269g;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p153e1.C2015k;
import p164g1.AbstractC2179a;
import p172h3.AbstractC2250j;
import p172h3.C2243c;
import p179i4.AbstractC2352g;
import p186k.AbstractC2426h;
import p186k.AbstractC2427i;
import p186k.AbstractC2428j;
import p186k.AbstractC2429k;
import p186k.C2408E;
import p186k.C2418O;
import p186k.C2424f;
import p186k.C2437s;
import p186k.C2438t;
import p186k.C2439u;
import p186k.C2440v;
import p192l.AbstractC2477a;
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

    /* JADX INFO: renamed from: E */
    public static Rect m1129E(AbstractC2767z abstractC2767z, float f2, float f5) {
        if (!(abstractC2767z instanceof C2732G) && !(abstractC2767z instanceof C2733H)) {
            return null;
        }
        C2684c c2684cMo4788k = abstractC2767z.mo4788k();
        return new Rect((int) (c2684cMo4788k.f8558a + f2), (int) (c2684cMo4788k.f8559b + f5), (int) (c2684cMo4788k.f8560c + f2), (int) (c2684cMo4788k.f8561d + f5));
    }

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

    /* JADX INFO: renamed from: q */
    public static final boolean m1134q(C1122i c1122i, float f2) {
        InterfaceC1599a interfaceC1599a = c1122i.f3649a;
        if (f2 >= 0.0f || ((Number) interfaceC1599a.mo6a()).floatValue() <= 0.0f) {
            return f2 > 0.0f && ((Number) interfaceC1599a.mo6a()).floatValue() < ((Number) c1122i.f3650b.mo6a()).floatValue();
        }
        return true;
    }

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

    /* JADX INFO: renamed from: s */
    public static final boolean m1136s(C1122i c1122i) {
        InterfaceC1599a interfaceC1599a = c1122i.f3649a;
        if (((Number) interfaceC1599a.mo6a()).floatValue() < ((Number) c1122i.f3650b.mo6a()).floatValue()) {
            return true;
        }
        ((Number) interfaceC1599a.mo6a()).floatValue();
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m1137x(ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E, int i5, int i6, Integer num, int i7) {
        if ((i7 & 4) != 0) {
            num = null;
        }
        viewOnAttachStateChangeListenerC0667E.m1161w(i5, i6, num, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1138A(p186k.AbstractC2428j r59) {
        /*
            Method dump skipped, instruction units count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.ViewOnAttachStateChangeListenerC0667E.m1138A(k.j):void");
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1143J() {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.ViewOnAttachStateChangeListenerC0667E.m1143J():void");
    }

    @Override // p229r1.AbstractC3067b
    /* JADX INFO: renamed from: a */
    public final C1753n mo1144a(View view) {
        return this.f2135n;
    }

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

    /* JADX INFO: renamed from: d */
    public final Rect m1146d(C1129p c1129p) {
        C2015k c2015k = c1129p.f3716b;
        return m1142F(c2015k.f6737a, c2015k.f6738b, c2015k.f6739c, c2015k.f6740d);
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1147e(p084Q2.AbstractC1178c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.ViewOnAttachStateChangeListenerC0667E.m1147e(Q2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1148f(boolean r23, int r24, long r25) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.ViewOnAttachStateChangeListenerC0667E.m1148f(boolean, int, long):boolean");
    }

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

    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[LOOP:0: B:4:0x0014->B:36:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076 A[EDGE_INSN: B:47:0x0076->B:37:0x0076 BREAK  A[LOOP:0: B:4:0x0014->B:36:0x0073], SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p204n0.C2684c m1155n(p077P0.C1128o r10, android.graphics.Rect r11, p211o0.InterfaceC2738M r12) {
        /*
            r9 = this;
            I0.C r0 = new I0.C
            r0.<init>(r12)
            H0.I r10 = r10.f3710c
            H0.e0 r12 = r10.f1699J
            h0.o r12 = r12.f1896f
            int r1 = r12.f7189g
            r1 = r1 & 8
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L76
        L14:
            if (r12 == 0) goto L76
            int r1 = r12.f7188f
            r1 = r1 & 8
            if (r1 == 0) goto L6d
            r1 = r12
            r5 = r4
        L1e:
            if (r1 == 0) goto L6d
            boolean r6 = r1 instanceof p041H0.InterfaceC0632z0
            if (r6 == 0) goto L30
            r6 = r1
            H0.z0 r6 = (p041H0.InterfaceC0632z0) r6
            r6.mo943X(r0)
            boolean r6 = r0.f2102d
            if (r6 == 0) goto L68
            r4 = r1
            goto L76
        L30:
            int r6 = r1.f7188f
            r6 = r6 & 8
            if (r6 == 0) goto L68
            boolean r6 = r1 instanceof p041H0.AbstractC0599j
            if (r6 == 0) goto L68
            r6 = r1
            H0.j r6 = (p041H0.AbstractC0599j) r6
            h0.o r6 = r6.f1943s
            r7 = r3
        L40:
            if (r6 == 0) goto L65
            int r8 = r6.f7188f
            r8 = r8 & 8
            if (r8 == 0) goto L62
            int r7 = r7 + 1
            if (r7 != r2) goto L4e
            r1 = r6
            goto L62
        L4e:
            if (r5 != 0) goto L59
            V.e r5 = new V.e
            r8 = 16
            h0.o[] r8 = new p169h0.AbstractC2206o[r8]
            r5.<init>(r8)
        L59:
            if (r1 == 0) goto L5f
            r5.m2753b(r1)
            r1 = r4
        L5f:
            r5.m2753b(r6)
        L62:
            h0.o r6 = r6.f7191i
            goto L40
        L65:
            if (r7 != r2) goto L68
            goto L1e
        L68:
            h0.o r1 = p041H0.AbstractC0601k.m1029e(r5)
            goto L1e
        L6d:
            int r1 = r12.f7189g
            r1 = r1 & 8
            if (r1 == 0) goto L76
            h0.o r12 = r12.f7191i
            goto L14
        L76:
            H0.z0 r4 = (p041H0.InterfaceC0632z0) r4
            if (r4 == 0) goto Lb9
            r12 = r4
            h0.o r12 = (p169h0.AbstractC2206o) r12
            h0.o r12 = r12.f7186d
            boolean r12 = r12.f7199q
            if (r12 != r2) goto Lb9
            H0.h0 r10 = p041H0.AbstractC0601k.m1043s(r4)
            F0.v r12 = p029F0.AbstractC0435z.m693f(r10)
            n0.c r10 = r12.mo634K(r10, r2)
            float r12 = r10.f8558a
            float r0 = r10.f8559b
            float r1 = r10.f8560c
            float r10 = r10.f8561d
            android.graphics.Rect r10 = r9.m1142F(r12, r0, r1, r10)
            int r12 = r10.left
            int r0 = r11.left
            int r12 = r12 - r0
            float r12 = (float) r12
            int r0 = r10.top
            int r11 = r11.top
            int r0 = r0 - r11
            float r11 = (float) r0
            n0.c r0 = new n0.c
            int r1 = r10.width()
            float r1 = (float) r1
            float r1 = r1 + r12
            int r10 = r10.height()
            float r10 = (float) r10
            float r10 = r10 + r11
            r0.<init>(r12, r11, r1, r10)
            return r0
        Lb9:
            H0.e0 r10 = r10.f1699J
            H0.h0 r10 = r10.f1894d
            n0.c r10 = p029F0.AbstractC0435z.m691d(r10, r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.ViewOnAttachStateChangeListenerC0667E.m1155n(P0.o, android.graphics.Rect, o0.M):n0.c");
    }

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

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z5) {
        this.f2133l = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z5) {
        this.f2133l = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f2131j;
        if (accessibilityManager.isEnabled()) {
            this.f2133l = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2134m.removeCallbacks(this.f2125O);
        AccessibilityManager accessibilityManager = this.f2131j;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m1157p(C0564I c0564i) {
        if (this.f2147z.add(c0564i)) {
            this.f2111A.mo4090o(C0891q.f2780a);
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m1158t(int i5) {
        if (i5 == this.f2128g.getSemanticsOwner().m2180a().f3714g) {
            return -1;
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1159u(p077P0.C1128o r20, p047I0.C0684M0 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = p186k.AbstractC2430l.f7851a
            k.v r3 = new k.v
            r3.<init>()
            r4 = 4
            java.util.List r5 = p077P0.C1128o.m2163j(r4, r1)
            H0.I r6 = r1.f3710c
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            P0.o r10 = (p077P0.C1128o) r10
            k.j r11 = r0.m1154l()
            int r10 = r10.f3714g
            boolean r11 = r11.m4317a(r10)
            if (r11 == 0) goto L3d
            k.v r11 = r2.f2201b
            boolean r11 = r11.m4346b(r10)
            if (r11 != 0) goto L3a
            r0.m1157p(r6)
            return
        L3a:
            r3.m4345a(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            k.v r2 = r2.f2201b
            int[] r5 = r2.f7881b
            long[] r2 = r2.f7880a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r9 = r8
        L4c:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L86
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L66:
            if (r14 >= r12) goto L84
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L80
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.m4346b(r15)
            if (r15 != 0) goto L80
            r0.m1157p(r6)
            return
        L80:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L66
        L84:
            if (r12 != r13) goto L8b
        L86:
            if (r9 == r7) goto L8b
            int r9 = r9 + 1
            goto L4c
        L8b:
            java.util.List r1 = p077P0.C1128o.m2163j(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lb9
            java.lang.Object r3 = r1.get(r8)
            P0.o r3 = (p077P0.C1128o) r3
            k.u r4 = r0.f2121K
            int r5 = r3.f3714g
            java.lang.Object r4 = r4.m4318b(r5)
            I0.M0 r4 = (p047I0.C0684M0) r4
            if (r4 == 0) goto Lb6
            k.j r5 = r0.m1154l()
            int r6 = r3.f3714g
            boolean r5 = r5.m4317a(r6)
            if (r5 == 0) goto Lb6
            r0.m1159u(r3, r4)
        Lb6:
            int r8 = r8 + 1
            goto L93
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.ViewOnAttachStateChangeListenerC0667E.m1159u(P0.o, I0.M0):void");
    }

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

    /* JADX INFO: renamed from: y */
    public final void m1162y(int i5, int i6, String str) {
        AccessibilityEvent accessibilityEventM1150h = m1150h(m1158t(i5), 32);
        accessibilityEventM1150h.setContentChangeTypes(i6);
        if (str != null) {
            accessibilityEventM1150h.getText().add(str);
        }
        m1160v(accessibilityEventM1150h);
    }

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
