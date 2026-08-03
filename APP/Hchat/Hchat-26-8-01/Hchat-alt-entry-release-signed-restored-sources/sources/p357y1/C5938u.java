package p357y1;

import ac.AbstractC0063p;
import android.R;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.C0119x;
import androidx.lifecycle.EnumC0107l;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;
import okio.C3193a;
import p009a9.C0025b;
import p012ah.C0086a;
import p017b2.AbstractC0170b;
import p020b5.C0184c;
import p041d1.C0670p;
import p057e1.C0807b;
import p057e1.C0808c;
import p068eh.AbstractC0921a;
import p069f.AbstractC0942k;
import p069f.AbstractC0951o0;
import p069f.C0925b0;
import p069f.C0943k0;
import p069f.C0961t0;
import p069f.C0962u;
import p069f.C0964v;
import p071f1.AbstractC0996c0;
import p071f1.C1034w;
import p072f2.AbstractC1049l;
import p072f2.AbstractC1057t;
import p072f2.AbstractC1058u;
import p072f2.AbstractC1059v;
import p072f2.C1038a;
import p072f2.C1041d;
import p072f2.C1045h;
import p072f2.C1046i;
import p072f2.C1047j;
import p072f2.C1050m;
import p072f2.C1054q;
import p072f2.C1055r;
import p072f2.C1061x;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p087g.AbstractC1256a;
import p092g4.AbstractC1341a;
import p102h2.EnumC1571a;
import p103h3.AbstractC1573b;
import p103h3.C1576e;
import p103h3.C1577f;
import p103h3.C1578g;
import p119i2.AbstractC1928h;
import p119i2.AbstractC1938m;
import p119i2.C1922e;
import p119i2.C1925f0;
import p119i2.C1926g;
import p119i2.C1935k0;
import p119i2.C1936l;
import p119i2.C1943o0;
import p119i2.C1945p0;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p172lg.C2561a;
import p177m2.C2765i;
import p177m2.C2767k;
import p219oh.AbstractC3165h;
import p225p2.C3290b;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p280t2.C4087c;
import p280t2.C4096l;
import p280t2.C4098n;
import p280t2.C4100p;
import p280t2.InterfaceC4099o;
import p292u1.AbstractC4229a;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p308v1.AbstractC4434w;
import p308v1.InterfaceC4428t;
import p332wb.AbstractC4855en;
import p339x1.AbstractC5614i1;
import p339x1.C5602f0;
import p340x2.AbstractC5673h;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: y1.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5938u extends C0119x {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC5958z f24154i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5938u(ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z) {
        super(17);
        this.f24154i = viewOnAttachStateChangeListenerC5958z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:128:0x01b0) to fix multi-entry loop: BACK_EDGE: B:128:0x01b0 -> B:129:0x01b1 */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x01b1, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x076f  */
    @Override // androidx.lifecycle.C0119x
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo577H(int i9, int i10, Bundle bundle) {
        C1054q c1054q;
        int i11;
        Integer num;
        AbstractC5862b abstractC5862b;
        int iM10698k;
        int i12;
        C1935k0 c1935k0M10599o;
        InterfaceC1220a interfaceC1220a;
        InterfaceC1220a interfaceC1220a2;
        InterfaceC1220a interfaceC1220a3;
        InterfaceC1220a interfaceC1220a4;
        InterfaceC1220a interfaceC1220a5;
        InterfaceC1220a interfaceC1220a6;
        InterfaceC1220a interfaceC1220a7;
        InterfaceC1220a interfaceC1220a8;
        InterfaceC1220a interfaceC1220a9;
        InterfaceC1231l interfaceC1231l;
        C1038a c1038a;
        long jMo8868m0;
        float f3;
        float f10;
        float f11;
        float f12;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        InterfaceC1231l interfaceC1231l2;
        InterfaceC1220a interfaceC1220a10;
        float f13;
        float f14;
        Float f15;
        boolean z9;
        C1038a c1038a2;
        InterfaceC1220a interfaceC1220a11;
        float fIntBitsToFloat;
        C1038a c1038a3;
        InterfaceC1220a interfaceC1220a12;
        InterfaceC1231l interfaceC1231l3;
        InterfaceC1220a interfaceC1220a13;
        InterfaceC1220a interfaceC1220a14;
        InterfaceC1220a interfaceC1220a15;
        InterfaceC1220a interfaceC1220a16;
        ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z = this.f24154i;
        AccessibilityManager accessibilityManager = viewOnAttachStateChangeListenerC5958z.f24218m;
        Float fValueOf = Float.valueOf(0.0f);
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = viewOnAttachStateChangeListenerC5958z.f24215j;
        C1055r c1055r = (C1055r) viewOnAttachStateChangeListenerC5958z.m10699l().m2313b(i9);
        if (c1055r == null || (c1054q = c1055r.f3353a) == null) {
            return false;
        }
        C5602f0 c5602f0 = c1054q.f3349c;
        int i13 = c1054q.f3352f;
        C1050m c1050m = c1054q.f3350d;
        C0943k0 c0943k0 = c1050m.f3341g;
        Object objM2320g = c0943k0.m2320g(AbstractC1058u.f3389n);
        if (objM2320g == null) {
            objM2320g = null;
        }
        Boolean bool = Boolean.TRUE;
        if (AbstractC1416l.m3825a(objM2320g, bool)) {
            if (!(Build.VERSION.SDK_INT >= 34 ? AbstractC1573b.m4097e(accessibilityManager) : true)) {
                return false;
            }
        }
        if (i10 == 64) {
            if (!(accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())) {
                return false;
            }
            int i14 = viewOnAttachStateChangeListenerC5958z.f24222q;
            if (i14 == i9) {
                return false;
            }
            if (i14 != Integer.MIN_VALUE) {
                i11 = 12;
                num = null;
                ViewOnAttachStateChangeListenerC5958z.m10683x(viewOnAttachStateChangeListenerC5958z, i14, 65536, null, 12);
            } else {
                i11 = 12;
                num = null;
            }
            viewOnAttachStateChangeListenerC5958z.f24222q = i9;
            viewTreeObserverOnGlobalLayoutListenerC5934t.invalidate();
            ViewOnAttachStateChangeListenerC5958z.m10683x(viewOnAttachStateChangeListenerC5958z, i9, 32768, num, i11);
            return true;
        }
        if (i10 == 128) {
            if (!(viewOnAttachStateChangeListenerC5958z.f24222q == i9)) {
                return false;
            }
            viewOnAttachStateChangeListenerC5958z.f24222q = Integer.MIN_VALUE;
            viewOnAttachStateChangeListenerC5958z.f24224s = null;
            viewTreeObserverOnGlobalLayoutListenerC5934t.invalidate();
            ViewOnAttachStateChangeListenerC5958z.m10683x(viewOnAttachStateChangeListenerC5958z, i9, 65536, null, 12);
            return true;
        }
        if (i10 == 256 || i10 == 512) {
            if (bundle == null) {
                return false;
            }
            int i15 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
            boolean z10 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
            boolean z11 = i10 == 256;
            Integer num2 = viewOnAttachStateChangeListenerC5958z.f24196A;
            if (num2 == null || i13 != num2.intValue()) {
                viewOnAttachStateChangeListenerC5958z.f24231z = -1;
                viewOnAttachStateChangeListenerC5958z.f24196A = Integer.valueOf(i13);
            }
            String strM10679m = ViewOnAttachStateChangeListenerC5958z.m10679m(c1054q);
            if (strM10679m == null || strM10679m.length() == 0) {
                return false;
            }
            String strM10679m2 = ViewOnAttachStateChangeListenerC5958z.m10679m(c1054q);
            if (strM10679m2 == null || strM10679m2.length() == 0) {
                abstractC5862b = null;
            } else if (i15 == 1) {
                Locale locale = viewTreeObserverOnGlobalLayoutListenerC5934t.getContext().getResources().getConfiguration().locale;
                if (C5866c.f23824e == null) {
                    C5866c c5866c = new C5866c(0);
                    c5866c.f23830d = BreakIterator.getCharacterInstance(locale);
                    C5866c.f23824e = c5866c;
                }
                C5866c c5866c2 = C5866c.f23824e;
                c5866c2.getClass();
                c5866c2.m10570f(strM10679m2);
                abstractC5862b = c5866c2;
            } else if (i15 == 2) {
                Locale locale2 = viewTreeObserverOnGlobalLayoutListenerC5934t.getContext().getResources().getConfiguration().locale;
                if (C5866c.f23825f == null) {
                    C5866c c5866c3 = new C5866c(1);
                    c5866c3.f23830d = BreakIterator.getWordInstance(locale2);
                    C5866c.f23825f = c5866c3;
                }
                C5866c c5866c4 = C5866c.f23825f;
                c5866c4.getClass();
                c5866c4.m10570f(strM10679m2);
                abstractC5862b = c5866c4;
            } else if (i15 == 4) {
                if (c0943k0.m2316c(AbstractC1049l.f3315a) && (c1935k0M10599o = AbstractC5883g0.m10599o(c1050m)) != null) {
                    if (i15 == 4) {
                        if (C5866c.f23826g == null) {
                            C5866c.f23826g = new C5866c(2);
                        }
                        C5866c c5866c5 = C5866c.f23826g;
                        c5866c5.getClass();
                        c5866c5.f23818a = strM10679m2;
                        c5866c5.f23830d = c1935k0M10599o;
                        abstractC5862b = c5866c5;
                    } else {
                        if (C5870d.f23836e == null) {
                            C5870d c5870d = new C5870d();
                            new Rect();
                            C5870d.f23836e = c5870d;
                        }
                        C5870d c5870d2 = C5870d.f23836e;
                        c5870d2.getClass();
                        c5870d2.f23818a = strM10679m2;
                        c5870d2.f23839c = c1935k0M10599o;
                        c5870d2.f23840d = c1054q;
                        abstractC5862b = c5870d2;
                    }
                }
            } else if (i15 == 8) {
                if (C5874e.f23847c == null) {
                    C5874e.f23847c = new C5874e();
                }
                C5874e c5874e = C5874e.f23847c;
                c5874e.getClass();
                c5874e.f23818a = strM10679m2;
                abstractC5862b = c5874e;
            } else if (i15 != 16) {
            }
            if (abstractC5862b == null) {
                return false;
            }
            int iM10697j = viewOnAttachStateChangeListenerC5958z.m10697j(c1054q);
            if (iM10697j == -1) {
                iM10697j = z11 ? 0 : strM10679m.length();
            }
            int[] iArrMo10564a = z11 ? abstractC5862b.mo10564a(iM10697j) : abstractC5862b.mo10567d(iM10697j);
            if (iArrMo10564a == null) {
                return false;
            }
            int i16 = iArrMo10564a[0];
            int i17 = iArrMo10564a[1];
            if (z10 && !c0943k0.m2316c(AbstractC1058u.f3376a) && c0943k0.m2316c(AbstractC1058u.f3365F)) {
                iM10698k = viewOnAttachStateChangeListenerC5958z.m10698k(c1054q);
                if (iM10698k == -1) {
                    iM10698k = z11 ? i16 : i17;
                }
                i12 = z11 ? i17 : i16;
            } else {
                iM10698k = z11 ? i17 : i16;
                i12 = iM10698k;
            }
            viewOnAttachStateChangeListenerC5958z.f24200E = new C5942v(c1054q, z11 ? 256 : 512, i15, i16, i17, SystemClock.uptimeMillis());
            viewOnAttachStateChangeListenerC5958z.m10687D(c1054q, iM10698k, i12, true);
            return true;
        }
        if (i10 == 16384) {
            Object objM2320g2 = c0943k0.m2320g(AbstractC1049l.f3331q);
            C1038a c1038a4 = (C1038a) (objM2320g2 == null ? null : objM2320g2);
            if (c1038a4 == null || (interfaceC1220a = (InterfaceC1220a) c1038a4.f3270b) == null) {
                return false;
            }
            return ((Boolean) interfaceC1220a.invoke()).booleanValue();
        }
        if (i10 == 131072) {
            boolean zM10687D = viewOnAttachStateChangeListenerC5958z.m10687D(c1054q, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
            if (zM10687D) {
                ViewOnAttachStateChangeListenerC5958z.m10683x(viewOnAttachStateChangeListenerC5958z, viewOnAttachStateChangeListenerC5958z.m10703t(i13), 0, null, 12);
            }
            return zM10687D;
        }
        if (!AbstractC5883g0.m10586b(c1054q)) {
            return false;
        }
        if (i10 == 1) {
            if (viewTreeObserverOnGlobalLayoutListenerC5934t.isInTouchMode()) {
                viewTreeObserverOnGlobalLayoutListenerC5934t.requestFocusFromTouch();
            }
            Object objM2320g3 = c0943k0.m2320g(AbstractC1049l.f3337w);
            C1038a c1038a5 = (C1038a) (objM2320g3 == null ? null : objM2320g3);
            if (c1038a5 == null || (interfaceC1220a2 = (InterfaceC1220a) c1038a5.f3270b) == null) {
                return false;
            }
            return ((Boolean) interfaceC1220a2.invoke()).booleanValue();
        }
        if (i10 == 2) {
            Object objM2320g4 = c0943k0.m2320g(AbstractC1058u.f3387l);
            if (objM2320g4 == null) {
                objM2320g4 = null;
            }
            if (!AbstractC1416l.m3825a(objM2320g4, bool)) {
                return false;
            }
            ((C0670p) viewTreeObserverOnGlobalLayoutListenerC5934t.getFocusOwner()).m1844b(8, false, true);
            return true;
        }
        EnumC4243m enumC4243m = EnumC4243m.f13920h;
        switch (i10) {
            case 16:
                Object objM2320g5 = c0943k0.m2320g(AbstractC1049l.f3316b);
                if (objM2320g5 == null) {
                    objM2320g5 = null;
                }
                C1038a c1038a6 = (C1038a) objM2320g5;
                Boolean bool2 = (c1038a6 == null || (interfaceC1220a3 = (InterfaceC1220a) c1038a6.f3270b) == null) ? null : (Boolean) interfaceC1220a3.invoke();
                ViewOnAttachStateChangeListenerC5958z.m10683x(viewOnAttachStateChangeListenerC5958z, i9, 1, null, 12);
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return false;
            case 32:
                Object objM2320g6 = c0943k0.m2320g(AbstractC1049l.f3317c);
                C1038a c1038a7 = (C1038a) (objM2320g6 == null ? null : objM2320g6);
                if (c1038a7 == null || (interfaceC1220a4 = (InterfaceC1220a) c1038a7.f3270b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1220a4.invoke()).booleanValue();
            case 4096:
            case 8192:
                break;
            case 32768:
                Object objM2320g7 = c0943k0.m2320g(AbstractC1049l.f3333s);
                C1038a c1038a8 = (C1038a) (objM2320g7 == null ? null : objM2320g7);
                if (c1038a8 == null || (interfaceC1220a5 = (InterfaceC1220a) c1038a8.f3270b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1220a5.invoke()).booleanValue();
            case 65536:
                Object objM2320g8 = c0943k0.m2320g(AbstractC1049l.f3332r);
                C1038a c1038a9 = (C1038a) (objM2320g8 == null ? null : objM2320g8);
                if (c1038a9 == null || (interfaceC1220a6 = (InterfaceC1220a) c1038a9.f3270b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1220a6.invoke()).booleanValue();
            case Opcodes.ASM4 /* 262144 */:
                Object objM2320g9 = c0943k0.m2320g(AbstractC1049l.f3334t);
                C1038a c1038a10 = (C1038a) (objM2320g9 == null ? null : objM2320g9);
                if (c1038a10 == null || (interfaceC1220a7 = (InterfaceC1220a) c1038a10.f3270b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1220a7.invoke()).booleanValue();
            case 524288:
                Object objM2320g10 = c0943k0.m2320g(AbstractC1049l.f3335u);
                C1038a c1038a11 = (C1038a) (objM2320g10 == null ? null : objM2320g10);
                if (c1038a11 == null || (interfaceC1220a8 = (InterfaceC1220a) c1038a11.f3270b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1220a8.invoke()).booleanValue();
            case 1048576:
                Object objM2320g11 = c0943k0.m2320g(AbstractC1049l.f3336v);
                C1038a c1038a12 = (C1038a) (objM2320g11 == null ? null : objM2320g11);
                if (c1038a12 == null || (interfaceC1220a9 = (InterfaceC1220a) c1038a12.f3270b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1220a9.invoke()).booleanValue();
            case 2097152:
                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                Object objM2320g12 = c0943k0.m2320g(AbstractC1049l.f3325k);
                C1038a c1038a13 = (C1038a) (objM2320g12 == null ? null : objM2320g12);
                if (c1038a13 == null || (interfaceC1231l = (InterfaceC1231l) c1038a13.f3270b) == null) {
                    return false;
                }
                if (string == null) {
                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return ((Boolean) interfaceC1231l.invoke(new C1926g(string))).booleanValue();
            case R.id.accessibilityActionShowOnScreen:
                C1054q c1054qM2660l = c1054q.m2660l();
                if (c1054qM2660l != null) {
                    Object objM2320g13 = c1054qM2660l.f3350d.f3341g.m2320g(AbstractC1049l.f3318d);
                    if (objM2320g13 == null) {
                        objM2320g13 = null;
                    }
                    c1038a = (C1038a) objM2320g13;
                    while (c1038a == null && c1054qM2660l != null) {
                        c1054qM2660l = c1054qM2660l.m2660l();
                        if (c1054qM2660l != null) {
                            Object objM2320g14 = c1054qM2660l.f3350d.f3341g.m2320g(AbstractC1049l.f3318d);
                            if (objM2320g14 == null) {
                                objM2320g14 = null;
                            }
                            c1038a = (C1038a) objM2320g14;
                        }
                    }
                    if (c1054qM2660l == null) {
                        C0808c c0808cM2656g = c1054q.m2656g();
                        return viewTreeObserverOnGlobalLayoutListenerC5934t.requestRectangleOnScreen(new Rect((int) Math.floor(c0808cM2656g.f2416a), (int) Math.floor(c0808cM2656g.f2417b), AbstractC2043a.m5018X((float) Math.ceil(c0808cM2656g.f2418c)), AbstractC2043a.m5018X((float) Math.ceil(c0808cM2656g.f2419d))));
                    }
                    long j3 = 0;
                    long jM2041d = 0;
                    boolean z12 = false;
                    while (c1054qM2660l != null) {
                        C5602f0 c5602f02 = c1054qM2660l.f3349c;
                        C0943k0 c0943k02 = c1054qM2660l.f3350d.f3341g;
                        Object objM2320g15 = c0943k02.m2320g(AbstractC1049l.f3318d);
                        if (objM2320g15 == null) {
                            objM2320g15 = null;
                        }
                        C1038a c1038a14 = (C1038a) objM2320g15;
                        if (c1038a14 != null) {
                            C0808c c0808cM8881e = AbstractC4434w.m8881e(c5602f02.f22778L.f22716c);
                            InterfaceC4428t interfaceC4428tMo8863b0 = c5602f02.f22778L.f22716c.mo8863b0();
                            C0808c c0808cM2053i = c0808cM8881e.m2053i(interfaceC4428tMo8863b0 != null ? ((AbstractC5614i1) interfaceC4428tMo8863b0).mo8868m0(j3) : j3);
                            AbstractC5614i1 abstractC5614i1M2653d = c1054q.m2653d();
                            if (abstractC5614i1M2653d == null) {
                                jMo8868m0 = j3;
                                long jM2042e = C0807b.m2042e(jMo8868m0, jM2041d);
                                AbstractC5614i1 abstractC5614i1M2653d2 = c1054q.m2653d();
                                C0808c c0808cM408a = AbstractC0063p.m408a(jM2042e, AbstractC3754e0.m7908q0(abstractC5614i1M2653d2 == null ? abstractC5614i1M2653d2.f14595i : 0L));
                                f3 = c0808cM408a.f2416a - c0808cM2053i.f2416a;
                                f10 = c0808cM408a.f2418c - c0808cM2053i.f2418c;
                                if (Math.signum(f3) == Math.signum(f10)) {
                                    f3 = 0.0f;
                                } else if (Math.abs(f3) >= Math.abs(f10)) {
                                    f3 = f10;
                                }
                                f11 = c0808cM408a.f2417b - c0808cM2053i.f2417b;
                                f12 = c0808cM408a.f2419d - c0808cM2053i.f2419d;
                                if (Math.signum(f11) == Math.signum(f12)) {
                                    f11 = 0.0f;
                                } else if (Math.abs(f11) >= Math.abs(f12)) {
                                    f11 = f12;
                                }
                                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
                                if (C0807b.m2039b(jFloatToRawIntBits, 0L)) {
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                                    Object objM2320g16 = c0943k02.m2320g(AbstractC1058u.f3396u);
                                    if (objM2320g16 == null) {
                                        objM2320g16 = null;
                                    }
                                    if (c5602f0.f22772F == enumC4243m) {
                                        fIntBitsToFloat2 = -fIntBitsToFloat2;
                                    }
                                    Object objM2320g17 = c0943k02.m2320g(AbstractC1058u.f3397v);
                                    if (objM2320g17 == null) {
                                        objM2320g17 = null;
                                    }
                                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
                                } else {
                                    jFloatToRawIntBits2 = jFloatToRawIntBits;
                                }
                                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) c1038a14.f3270b;
                                z12 = (interfaceC1235p == null && ((Boolean) interfaceC1235p.invoke(Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))))).booleanValue()) || z12;
                                jM2041d = C0807b.m2041d(jM2041d, jFloatToRawIntBits);
                            } else {
                                if (!abstractC5614i1M2653d.mo10106r1().f23801t) {
                                    abstractC5614i1M2653d = null;
                                }
                                if (abstractC5614i1M2653d != null) {
                                    jMo8868m0 = abstractC5614i1M2653d.mo8868m0(j3);
                                }
                                long jM2042e2 = C0807b.m2042e(jMo8868m0, jM2041d);
                                AbstractC5614i1 abstractC5614i1M2653d22 = c1054q.m2653d();
                                C0808c c0808cM408a2 = AbstractC0063p.m408a(jM2042e2, AbstractC3754e0.m7908q0(abstractC5614i1M2653d22 == null ? abstractC5614i1M2653d22.f14595i : 0L));
                                f3 = c0808cM408a2.f2416a - c0808cM2053i.f2416a;
                                f10 = c0808cM408a2.f2418c - c0808cM2053i.f2418c;
                                if (Math.signum(f3) == Math.signum(f10)) {
                                }
                                f11 = c0808cM408a2.f2417b - c0808cM2053i.f2417b;
                                f12 = c0808cM408a2.f2419d - c0808cM2053i.f2419d;
                                if (Math.signum(f11) == Math.signum(f12)) {
                                }
                                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
                                if (C0807b.m2039b(jFloatToRawIntBits, 0L)) {
                                }
                                InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) c1038a14.f3270b;
                                if (interfaceC1235p2 == null) {
                                    jM2041d = C0807b.m2041d(jM2041d, jFloatToRawIntBits);
                                } else {
                                    jM2041d = C0807b.m2041d(jM2041d, jFloatToRawIntBits);
                                }
                            }
                        }
                        c1054qM2660l = c1054qM2660l.m2660l();
                        j3 = 0;
                    }
                    return z12;
                }
                c1038a = null;
                break;
            case R.id.accessibilityActionSetProgress:
                if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    return false;
                }
                Object objM2320g18 = c0943k0.m2320g(AbstractC1049l.f3323i);
                C1038a c1038a15 = (C1038a) (objM2320g18 == null ? null : objM2320g18);
                if (c1038a15 == null || (interfaceC1231l2 = (InterfaceC1231l) c1038a15.f3270b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1231l2.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
            case R.id.accessibilityActionImeEnter:
                Object objM2320g19 = c0943k0.m2320g(AbstractC1049l.f3330p);
                C1038a c1038a16 = (C1038a) (objM2320g19 == null ? null : objM2320g19);
                if (c1038a16 == null || (interfaceC1220a10 = (InterfaceC1220a) c1038a16.f3270b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1220a10.invoke()).booleanValue();
            default:
                switch (i10) {
                    case R.id.accessibilityActionScrollUp:
                    case R.id.accessibilityActionScrollLeft:
                    case R.id.accessibilityActionScrollDown:
                    case R.id.accessibilityActionScrollRight:
                        break;
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionPageUp:
                                Object objM2320g20 = c0943k0.m2320g(AbstractC1049l.f3339y);
                                C1038a c1038a17 = (C1038a) (objM2320g20 == null ? null : objM2320g20);
                                if (c1038a17 == null || (interfaceC1220a13 = (InterfaceC1220a) c1038a17.f3270b) == null) {
                                    return false;
                                }
                                return ((Boolean) interfaceC1220a13.invoke()).booleanValue();
                            case R.id.accessibilityActionPageDown:
                                Object objM2320g21 = c0943k0.m2320g(AbstractC1049l.f3312A);
                                C1038a c1038a18 = (C1038a) (objM2320g21 == null ? null : objM2320g21);
                                if (c1038a18 == null || (interfaceC1220a14 = (InterfaceC1220a) c1038a18.f3270b) == null) {
                                    return false;
                                }
                                return ((Boolean) interfaceC1220a14.invoke()).booleanValue();
                            case R.id.accessibilityActionPageLeft:
                                Object objM2320g22 = c0943k0.m2320g(AbstractC1049l.f3340z);
                                C1038a c1038a19 = (C1038a) (objM2320g22 == null ? null : objM2320g22);
                                if (c1038a19 == null || (interfaceC1220a15 = (InterfaceC1220a) c1038a19.f3270b) == null) {
                                    return false;
                                }
                                return ((Boolean) interfaceC1220a15.invoke()).booleanValue();
                            case R.id.accessibilityActionPageRight:
                                Object objM2320g23 = c0943k0.m2320g(AbstractC1049l.f3313B);
                                C1038a c1038a20 = (C1038a) (objM2320g23 == null ? null : objM2320g23);
                                if (c1038a20 == null || (interfaceC1220a16 = (InterfaceC1220a) c1038a20.f3270b) == null) {
                                    return false;
                                }
                                return ((Boolean) interfaceC1220a16.invoke()).booleanValue();
                            default:
                                C0961t0 c0961t0 = (C0961t0) viewOnAttachStateChangeListenerC5958z.f24229x.m2360b(i9);
                                if (c0961t0 == null || ((CharSequence) c0961t0.m2360b(i10)) == null) {
                                    return false;
                                }
                                Object objM2320g24 = c0943k0.m2320g(AbstractC1049l.f3338x);
                                List list = (List) (objM2320g24 == null ? null : objM2320g24);
                                if (list == null || list.size() <= 0) {
                                    return false;
                                }
                                list.get(0).getClass();
                                C0086a.m445d();
                                return false;
                        }
                }
                break;
        }
        boolean z13 = i10 == 4096;
        boolean z14 = i10 == 8192;
        boolean z15 = i10 == 16908345;
        boolean z16 = i10 == 16908347;
        boolean z17 = i10 == 16908344;
        boolean z18 = i10 == 16908346;
        boolean z19 = z15 || z16 || z13 || z14;
        boolean z20 = z17 || z18 || z13 || z14;
        if (z13 || z14) {
            Object objM2320g25 = c0943k0.m2320g(AbstractC1058u.f3378c);
            if (objM2320g25 == null) {
                objM2320g25 = null;
            }
            C1045h c1045h = (C1045h) objM2320g25;
            Object objM2320g26 = c0943k0.m2320g(AbstractC1049l.f3323i);
            if (objM2320g26 == null) {
                objM2320g26 = null;
            }
            C1038a c1038a21 = (C1038a) objM2320g26;
            if (c1045h != null) {
                C2561a c2561a = c1045h.f3285b;
                if (c1038a21 != null) {
                    float f16 = c2561a.f8311b;
                    float f17 = c2561a.f8310a;
                    float f18 = f16 < f17 ? f17 : f16;
                    if (f17 <= f16) {
                        f16 = f17;
                    }
                    int i18 = c1045h.f3286c;
                    if (i18 > 0) {
                        f13 = f18 - f16;
                        f14 = i18 + 1;
                    } else {
                        f13 = f18 - f16;
                        f14 = 20;
                    }
                    float f19 = f13 / f14;
                    if (z14) {
                        f19 = -f19;
                    }
                    InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) c1038a21.f3270b;
                    if (interfaceC1231l4 != null) {
                        return ((Boolean) interfaceC1231l4.invoke(Float.valueOf(c1045h.f3284a + f19))).booleanValue();
                    }
                    return false;
                }
            }
        }
        long jM2047c = AbstractC4434w.m8881e(c5602f0.f22778L.f22716c).m2047c();
        ArrayList arrayList = new ArrayList();
        Object objM2320g27 = c0943k0.m2320g(AbstractC1049l.f3314C);
        if (objM2320g27 == null) {
            objM2320g27 = null;
        }
        C1038a c1038a22 = (C1038a) objM2320g27;
        Float f20 = (c1038a22 == null || (interfaceC1231l3 = (InterfaceC1231l) c1038a22.f3270b) == null || !((Boolean) interfaceC1231l3.invoke(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
        Object objM2320g28 = c0943k0.m2320g(AbstractC1049l.f3318d);
        if (objM2320g28 == null) {
            objM2320g28 = null;
        }
        C1038a c1038a23 = (C1038a) objM2320g28;
        if (c1038a23 == null) {
            return false;
        }
        InterfaceC3955b interfaceC3955b = c1038a23.f3270b;
        Object objM2320g29 = c0943k0.m2320g(AbstractC1058u.f3396u);
        if (objM2320g29 == null) {
            objM2320g29 = null;
        }
        C1047j c1047j = (C1047j) objM2320g29;
        if (c1047j == null || !z19) {
            f15 = f20;
            z9 = z20;
        } else {
            if (f20 != null) {
                fIntBitsToFloat = f20.floatValue();
                f15 = f20;
                z9 = z20;
            } else {
                f15 = f20;
                z9 = z20;
                fIntBitsToFloat = Float.intBitsToFloat((int) (jM2047c >> 32));
            }
            if (z15 || z14) {
                fIntBitsToFloat = -fIntBitsToFloat;
            }
            if ((c5602f0.f22772F == enumC4243m) && (z15 || z16)) {
                fIntBitsToFloat = -fIntBitsToFloat;
            }
            if (ViewOnAttachStateChangeListenerC5958z.m10680q(c1047j, fIntBitsToFloat)) {
                C1061x c1061x = AbstractC1049l.f3340z;
                if (!c0943k0.m2316c(c1061x) && !c0943k0.m2316c(AbstractC1049l.f3313B)) {
                    InterfaceC1235p interfaceC1235p3 = (InterfaceC1235p) interfaceC3955b;
                    if (interfaceC1235p3 != null) {
                        return ((Boolean) interfaceC1235p3.invoke(Float.valueOf(fIntBitsToFloat), fValueOf)).booleanValue();
                    }
                    return false;
                }
                if (fIntBitsToFloat > 0.0f) {
                    Object objM2320g30 = c0943k0.m2320g(AbstractC1049l.f3313B);
                    c1038a3 = (C1038a) (objM2320g30 == null ? null : objM2320g30);
                } else {
                    Object objM2320g31 = c0943k0.m2320g(c1061x);
                    c1038a3 = (C1038a) (objM2320g31 == null ? null : objM2320g31);
                }
                if (c1038a3 == null || (interfaceC1220a12 = (InterfaceC1220a) c1038a3.f3270b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1220a12.invoke()).booleanValue();
            }
        }
        Object objM2320g32 = c0943k0.m2320g(AbstractC1058u.f3397v);
        if (objM2320g32 == null) {
            objM2320g32 = null;
        }
        C1047j c1047j2 = (C1047j) objM2320g32;
        if (c1047j2 == null || !z9) {
            return false;
        }
        float fFloatValue = f15 != null ? f15.floatValue() : Float.intBitsToFloat((int) (jM2047c & 4294967295L));
        if (z17 || z14) {
            fFloatValue = -fFloatValue;
        }
        if (!ViewOnAttachStateChangeListenerC5958z.m10680q(c1047j2, fFloatValue)) {
            return false;
        }
        C1061x c1061x2 = AbstractC1049l.f3339y;
        if (!c0943k0.m2316c(c1061x2) && !c0943k0.m2316c(AbstractC1049l.f3312A)) {
            InterfaceC1235p interfaceC1235p4 = (InterfaceC1235p) interfaceC3955b;
            if (interfaceC1235p4 != null) {
                return ((Boolean) interfaceC1235p4.invoke(fValueOf, Float.valueOf(fFloatValue))).booleanValue();
            }
            return false;
        }
        if (fFloatValue > 0.0f) {
            Object objM2320g33 = c0943k0.m2320g(AbstractC1049l.f3312A);
            c1038a2 = (C1038a) (objM2320g33 == null ? null : objM2320g33);
        } else {
            Object objM2320g34 = c0943k0.m2320g(c1061x2);
            c1038a2 = (C1038a) (objM2320g34 == null ? null : objM2320g34);
        }
        if (c1038a2 == null || (interfaceC1220a11 = (InterfaceC1220a) c1038a2.f3270b) == null) {
            return false;
        }
        return ((Boolean) interfaceC1220a11.invoke()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.C0119x
    /* JADX INFO: renamed from: f */
    public final void mo601f(int i9, C1578g c1578g, String str, Bundle bundle) {
        this.f24154i.m10690c(i9, c1578g, str, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:676:0x0387 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:682:0x03eb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:695:0x0849 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0842 A[LOOP:8: B:410:0x0825->B:421:0x0842, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0ad5  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0cf0  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x0849 A[EDGE_INSN: B:695:0x0849->B:423:0x0849 BREAK  A[LOOP:8: B:410:0x0825->B:421:0x0842], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r4v40, types: [tf.t] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r6v169 */
    /* JADX WARN: Type inference failed for: r6v170 */
    /* JADX WARN: Type inference failed for: r6v171 */
    /* JADX WARN: Type inference failed for: r6v55, types: [java.lang.Class, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v77, types: [x1.f0] */
    /* JADX WARN: Type inference failed for: r6v78 */
    /* JADX WARN: Type inference failed for: r6v79, types: [x1.f0] */
    @Override // androidx.lifecycle.C0119x
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1578g mo605l(int i9) {
        C1578g c1578g;
        AccessibilityManager accessibilityManager;
        C0961t0 c0961t0;
        ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z;
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t;
        C0962u c0962u;
        C1054q c1054q;
        C0943k0 c0943k0;
        C5602f0 c5602f0;
        C1046i c1046i;
        C1050m c1050m;
        AccessibilityNodeInfo accessibilityNodeInfo;
        C1578g c1578g2;
        ?? r02;
        ?? r2;
        C1046i c1046i2;
        int i10;
        C1578g c1578g3;
        Object objM2320g;
        int i11;
        Object objM2320g2;
        Object objM2320g3;
        ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z2;
        boolean z9;
        C1054q c1054qM2660l;
        boolean z10;
        Object objM2320g4;
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t2;
        Bundle bundle;
        AbstractC5673h abstractC5673hM10604t;
        C5602f0 c5602f02;
        boolean zM3825a;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean zBooleanValue;
        ?? arrayList;
        int i12;
        boolean zM3825a2;
        C1054q c1054q2;
        int i13;
        ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z3 = this.f24154i;
        AccessibilityManager accessibilityManager2 = viewOnAttachStateChangeListenerC5958z3.f24218m;
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t3 = viewOnAttachStateChangeListenerC5958z3.f24215j;
        if (viewTreeObserverOnGlobalLayoutListenerC5934t3.getComposeViewContext().f23859c.mo550f().f300c == EnumC0107l.f289g) {
            c1578g3 = !accessibilityManager2.isEnabled() ? new C1578g(AccessibilityNodeInfo.obtain()) : null;
            i11 = i9;
            viewOnAttachStateChangeListenerC5958z2 = viewOnAttachStateChangeListenerC5958z3;
        } else {
            C1055r c1055r = (C1055r) viewOnAttachStateChangeListenerC5958z3.m10699l().m2313b(i9);
            if (c1055r == null) {
                if (!accessibilityManager2.isEnabled()) {
                    c1578g3 = new C1578g(AccessibilityNodeInfo.obtain());
                }
                i11 = i9;
                viewOnAttachStateChangeListenerC5958z2 = viewOnAttachStateChangeListenerC5958z3;
            } else {
                C1054q c1054q3 = c1055r.f3353a;
                C1050m c1050mM2659k = c1054q3.m2659k();
                C5602f0 c5602f03 = c1054q3.f3349c;
                Object objM2320g5 = c1050mM2659k.f3341g.m2320g(AbstractC1058u.f3389n);
                if (objM2320g5 == null) {
                    objM2320g5 = null;
                }
                boolean zM3825a3 = AbstractC1416l.m3825a(objM2320g5, Boolean.TRUE);
                if (!zM3825a3) {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    C1578g c1578g4 = new C1578g(accessibilityNodeInfoObtain);
                    int i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 34) {
                        AbstractC1573b.m4099g(accessibilityNodeInfoObtain, zM3825a3);
                    } else {
                        c1578g4.m4122f(64, zM3825a3);
                    }
                    if (i9 == -1) {
                        Object parentForAccessibility = viewTreeObserverOnGlobalLayoutListenerC5934t3.getParentForAccessibility();
                        c1578g = null;
                        View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                        c1578g4.f5249b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        c1578g = null;
                        C1054q c1054qM2660l2 = c1054q3.m2660l();
                        Integer numValueOf = c1054qM2660l2 != null ? Integer.valueOf(c1054qM2660l2.f3352f) : null;
                        if (numValueOf == null) {
                            AbstractC4229a.m8495c("semanticsNode " + i9 + " has null parent");
                            C3193a.m6814c();
                            return null;
                        }
                        int iIntValue = numValueOf.intValue();
                        if (iIntValue == viewTreeObserverOnGlobalLayoutListenerC5934t3.getSemanticsOwner().m2668a().f3352f) {
                            iIntValue = -1;
                        }
                        c1578g4.f5249b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(viewTreeObserverOnGlobalLayoutListenerC5934t3, iIntValue);
                    }
                    c1578g4.f5250c = i9;
                    accessibilityNodeInfoObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC5934t3, i9);
                    accessibilityNodeInfoObtain.setBoundsInScreen(viewOnAttachStateChangeListenerC5958z3.m10691d(c1055r));
                    C0962u c0962u2 = viewOnAttachStateChangeListenerC5958z3.f24211P;
                    C0961t0 c0961t02 = viewOnAttachStateChangeListenerC5958z3.f24230y;
                    Resources resources = viewTreeObserverOnGlobalLayoutListenerC5934t3.getContext().getResources();
                    c1578g4.m4123g("android.view.View");
                    C1050m c1050m2 = c1054q3.f3350d;
                    C0943k0 c0943k02 = c1050m2.f3341g;
                    if (c0943k02.m2316c(AbstractC1058u.f3365F)) {
                        c1578g4.m4123g("android.widget.EditText");
                    }
                    if (c0943k02.m2316c(AbstractC1058u.f3361B)) {
                        c1578g4.m4123g("android.widget.TextView");
                    }
                    Object objM2320g6 = c0943k02.m2320g(AbstractC1058u.f3400y);
                    if (objM2320g6 == null) {
                        objM2320g6 = c1578g;
                    }
                    C1046i c1046i3 = (C1046i) objM2320g6;
                    if (c1046i3 != null) {
                        int i15 = c1046i3.f3287a;
                        if (c1054q3.m2663o()) {
                            accessibilityManager = accessibilityManager2;
                            i13 = 4;
                            c0961t0 = c0961t02;
                        } else {
                            accessibilityManager = accessibilityManager2;
                            i13 = 4;
                            c0961t0 = c0961t02;
                            if (C1054q.m2649j(4, c1054q3).isEmpty()) {
                            }
                        }
                        if (i15 == i13) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(p099h.Hchat.R.string.tab));
                        } else if (i15 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(p099h.Hchat.R.string.switch_role));
                        } else {
                            String strM10606v = AbstractC5883g0.m10606v(i15);
                            if (i15 != 5 || c1054q3.m2665q() || c1050m2.f3343i) {
                                c1578g4.m4123g(strM10606v);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        c0961t0 = c0961t02;
                    }
                    accessibilityNodeInfoObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC5934t3.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(AbstractC1057t.m2677h(c1054q3));
                    boolean zM4097e = i14 >= 34 ? AbstractC1573b.m4097e(accessibilityManager) : true;
                    List listM2649j = C1054q.m2649j(4, c1054q3);
                    int size = listM2649j.size();
                    boolean z14 = zM4097e;
                    int i16 = 0;
                    int i17 = 0;
                    while (i17 < size) {
                        int i18 = size;
                        C1054q c1054q4 = (C1054q) listM2649j.get(i17);
                        List list = listM2649j;
                        AbstractC0942k abstractC0942kM10699l = viewOnAttachStateChangeListenerC5958z3.m10699l();
                        int i19 = i17;
                        int i20 = c1054q4.f3352f;
                        if (abstractC0942kM10699l.m2312a(i20)) {
                            AbstractC5673h abstractC5673h = viewTreeObserverOnGlobalLayoutListenerC5934t3.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(c1054q4.f3349c);
                            if (i20 != -1) {
                                if (abstractC5673h != null) {
                                    accessibilityNodeInfoObtain.addChild(abstractC5673h);
                                } else {
                                    C1055r c1055r2 = (C1055r) viewOnAttachStateChangeListenerC5958z3.m10699l().m2313b(i20);
                                    if (c1055r2 == null || (c1054q2 = c1055r2.f3353a) == null) {
                                        zM3825a2 = false;
                                    } else {
                                        Object objM2320g7 = c1054q2.m2659k().f3341g.m2320g(AbstractC1058u.f3389n);
                                        if (objM2320g7 == null) {
                                            objM2320g7 = c1578g;
                                        }
                                        zM3825a2 = AbstractC1416l.m3825a(objM2320g7, Boolean.TRUE);
                                    }
                                    if (z14 || !zM3825a2) {
                                        accessibilityNodeInfoObtain.addChild(viewTreeObserverOnGlobalLayoutListenerC5934t3, i20);
                                    }
                                }
                                c0962u2.m2368f(i20, i16);
                                i16++;
                            }
                        }
                        i17 = i19 + 1;
                        listM2649j = list;
                        size = i18;
                    }
                    int i21 = viewOnAttachStateChangeListenerC5958z3.f24222q;
                    ?? r32 = c1578g4.f5248a;
                    if (i9 == i21) {
                        r32.setAccessibilityFocused(true);
                        c1578g4.m4118a(C1576e.f5238d);
                    } else {
                        r32.setAccessibilityFocused(false);
                        c1578g4.m4118a(C1576e.f5237c);
                    }
                    C1926g c1926gM10597m = AbstractC5883g0.m10597m(c1054q3);
                    if (c1926gM10597m != null) {
                        viewTreeObserverOnGlobalLayoutListenerC5934t3.getFontFamilyResolver();
                        InterfaceC4233c density = viewTreeObserverOnGlobalLayoutListenerC5934t3.getDensity();
                        C0184c c0184c = viewOnAttachStateChangeListenerC5958z3.f24207L;
                        viewTreeObserverOnGlobalLayoutListenerC5934t = viewTreeObserverOnGlobalLayoutListenerC5934t3;
                        String str = c1926gM10597m.f6529h;
                        c5602f0 = c5602f03;
                        List list2 = c1926gM10597m.f6528g;
                        SpannableString spannableString = new SpannableString(str);
                        ArrayList arrayList2 = c1926gM10597m.f6530i;
                        viewOnAttachStateChangeListenerC5958z = viewOnAttachStateChangeListenerC5958z3;
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            c0962u = c0962u2;
                            int i22 = 0;
                            while (i22 < size2) {
                                int i23 = size2;
                                C1922e c1922e = (C1922e) arrayList2.get(i22);
                                ArrayList arrayList3 = arrayList2;
                                C1925f0 c1925f0 = (C1925f0) c1922e.f6503a;
                                int i24 = i22;
                                int i25 = c1922e.f6504b;
                                int i26 = c1922e.f6505c;
                                C1046i c1046i4 = c1046i3;
                                C1050m c1050m3 = c1050m2;
                                long jMo8268b = c1925f0.f6513a.mo8268b();
                                AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                                C1578g c1578g5 = c1578g4;
                                long j3 = c1925f0.f6514b;
                                C2767k c2767k = c1925f0.f6515c;
                                C2765i c2765i = c1925f0.f6516d;
                                C4100p c4100p = c1925f0.f6522j;
                                C3290b c3290b = c1925f0.f6523k;
                                C1054q c1054q5 = c1054q3;
                                C0184c c0184c2 = c0184c;
                                long j4 = c1925f0.f6524l;
                                C4096l c4096l = c1925f0.f6525m;
                                InterfaceC4099o c4087c = c1925f0.f6513a;
                                C0943k0 c0943k03 = c0943k02;
                                if (!C1034w.m2635c(jMo8268b, c4087c.mo8268b())) {
                                    c4087c = jMo8268b != 16 ? new C4087c(jMo8268b) : C4098n.f13563a;
                                }
                                AbstractC1089i.m2721C0(spannableString, c4087c.mo8268b(), i25, i26);
                                SpannableString spannableString2 = spannableString;
                                AbstractC1089i.m2723D0(spannableString2, j3, density, i25, i26);
                                if (c2767k == null && c2765i == null) {
                                    i12 = 33;
                                } else {
                                    StyleSpan styleSpan = new StyleSpan(AbstractC1341a.m3601q(c2767k == null ? C2767k.f8999i : c2767k, c2765i != null ? c2765i.f8996a : 0));
                                    i12 = 33;
                                    spannableString2.setSpan(styleSpan, i25, i26, 33);
                                }
                                if (c4096l != null) {
                                    int i27 = c4096l.f13561a;
                                    if ((i27 | 1) == i27) {
                                        spannableString2.setSpan(new UnderlineSpan(), i25, i26, i12);
                                    }
                                    if ((i27 | 2) == i27) {
                                        spannableString2.setSpan(new StrikethroughSpan(), i25, i26, i12);
                                    }
                                }
                                if (c4100p != null) {
                                    spannableString2.setSpan(new ScaleXSpan(c4100p.f13565a), i25, i26, i12);
                                }
                                AbstractC1089i.m2725E0(spannableString2, c3290b, i25, i26);
                                if (j4 != 16) {
                                    spannableString2.setSpan(new BackgroundColorSpan(AbstractC0996c0.m2526w(j4)), i25, i26, i12);
                                }
                                i22 = i24 + 1;
                                spannableString = spannableString2;
                                size2 = i23;
                                arrayList2 = arrayList3;
                                c1050m2 = c1050m3;
                                c1046i3 = c1046i4;
                                c1578g4 = c1578g5;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo2;
                                c1054q3 = c1054q5;
                                c0184c = c0184c2;
                                c0943k02 = c0943k03;
                            }
                        } else {
                            c0962u = c0962u2;
                        }
                        c1054q = c1054q3;
                        C0184c c0184c3 = c0184c;
                        c0943k0 = c0943k02;
                        c1046i = c1046i3;
                        c1050m = c1050m2;
                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                        c1578g2 = c1578g4;
                        SpannableString spannableString3 = spannableString;
                        int length = str.length();
                        ?? arrayList4 = C4173t.f13710g;
                        if (list2 != null) {
                            arrayList = new ArrayList(list2.size());
                            int size3 = list2.size();
                            for (int i28 = 0; i28 < size3; i28++) {
                                Object obj = list2.get(i28);
                                C1922e c1922e2 = (C1922e) obj;
                                if ((c1922e2.f6503a instanceof C1945p0) && AbstractC1928h.m4798b(0, length, c1922e2.f6504b, c1922e2.f6505c)) {
                                    arrayList.add(obj);
                                }
                            }
                        } else {
                            arrayList = arrayList4;
                        }
                        int size4 = arrayList.size();
                        for (int i29 = 0; i29 < size4; i29++) {
                            C1922e c1922e3 = (C1922e) arrayList.get(i29);
                            C1945p0 c1945p0 = (C1945p0) c1922e3.f6503a;
                            int i30 = c1922e3.f6504b;
                            int i31 = c1922e3.f6505c;
                            if (!(c1945p0 instanceof C1945p0)) {
                                C3193a.m6822k();
                                return c1578g;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(c1945p0.f6594a).build(), i30, i31, 33);
                        }
                        int length2 = str.length();
                        if (list2 != null) {
                            arrayList4 = new ArrayList(list2.size());
                            int size5 = list2.size();
                            for (int i32 = 0; i32 < size5; i32++) {
                                Object obj2 = list2.get(i32);
                                C1922e c1922e4 = (C1922e) obj2;
                                if ((c1922e4.f6503a instanceof C1943o0) && AbstractC1928h.m4798b(0, length2, c1922e4.f6504b, c1922e4.f6505c)) {
                                    arrayList4.add(obj2);
                                }
                            }
                        }
                        int size6 = arrayList4.size();
                        int i33 = 0;
                        while (i33 < size6) {
                            C1922e c1922e5 = (C1922e) arrayList4.get(i33);
                            C1943o0 c1943o0 = (C1943o0) c1922e5.f6503a;
                            int i34 = c1922e5.f6504b;
                            int i35 = c1922e5.f6505c;
                            C0184c c0184c4 = c0184c3;
                            WeakHashMap weakHashMap = (WeakHashMap) c0184c4.f469a;
                            Object uRLSpan = weakHashMap.get(c1943o0);
                            if (uRLSpan == null) {
                                uRLSpan = new URLSpan(c1943o0.f6591a);
                                weakHashMap.put(c1943o0, uRLSpan);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan, i34, i35, 33);
                            i33++;
                            c0184c3 = c0184c4;
                        }
                        C0184c c0184c5 = c0184c3;
                        List listM4794a = c1926gM10597m.m4794a(str.length());
                        int size7 = listM4794a.size();
                        for (int i36 = 0; i36 < size7; i36++) {
                            C1922e c1922e6 = (C1922e) listM4794a.get(i36);
                            int i37 = c1922e6.f6504b;
                            Object obj3 = c1922e6.f6503a;
                            int i38 = c1922e6.f6505c;
                            if (i37 != i38) {
                                AbstractC1938m abstractC1938m = (AbstractC1938m) obj3;
                                if (abstractC1938m instanceof C1936l) {
                                    obj3.getClass();
                                    C1936l c1936l = (C1936l) obj3;
                                    C1922e c1922e7 = new C1922e(i37, i38, c1936l);
                                    WeakHashMap weakHashMap2 = (WeakHashMap) c0184c5.f470b;
                                    Object uRLSpan2 = weakHashMap2.get(c1922e7);
                                    if (uRLSpan2 == null) {
                                        uRLSpan2 = new URLSpan(c1936l.f6567a);
                                        weakHashMap2.put(c1922e7, uRLSpan2);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan2, i37, i38, 33);
                                } else {
                                    WeakHashMap weakHashMap3 = (WeakHashMap) c0184c5.f471c;
                                    Object c0025b = weakHashMap3.get(c1922e6);
                                    if (c0025b == null) {
                                        c0025b = new C0025b(abstractC1938m);
                                        weakHashMap3.put(c1922e6, c0025b);
                                    }
                                    spannableString3.setSpan((ClickableSpan) c0025b, i37, i38, 33);
                                }
                            }
                        }
                        r02 = (SpannableString) ViewOnAttachStateChangeListenerC5958z.m10678I(spannableString3);
                    } else {
                        viewOnAttachStateChangeListenerC5958z = viewOnAttachStateChangeListenerC5958z3;
                        viewTreeObserverOnGlobalLayoutListenerC5934t = viewTreeObserverOnGlobalLayoutListenerC5934t3;
                        c0962u = c0962u2;
                        c1054q = c1054q3;
                        c0943k0 = c0943k02;
                        c5602f0 = c5602f03;
                        c1046i = c1046i3;
                        c1050m = c1050m2;
                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                        c1578g2 = c1578g4;
                        r02 = c1578g;
                    }
                    r32.setText(r02);
                    C1061x c1061x = AbstractC1058u.f3371L;
                    C0943k0 c0943k04 = c0943k0;
                    if (c0943k04.m2316c(c1061x)) {
                        AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfo;
                        accessibilityNodeInfo3.setContentInvalid(true);
                        Object objM2320g8 = c0943k04.m2320g(c1061x);
                        if (objM2320g8 == null) {
                            objM2320g8 = c1578g;
                        }
                        accessibilityNodeInfo3.setError((CharSequence) objM2320g8);
                        r2 = accessibilityNodeInfo3;
                    } else {
                        r2 = accessibilityNodeInfo;
                    }
                    C1054q c1054q6 = c1054q;
                    String strM10596l = AbstractC5883g0.m10596l(c1054q6, resources);
                    if (Build.VERSION.SDK_INT >= 30) {
                        AbstractC0170b.m764g(r32, strM10596l);
                    } else {
                        r32.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strM10596l);
                    }
                    r2.setCheckable(AbstractC5883g0.m10595k(c1054q6));
                    Object objM2320g9 = c0943k04.m2320g(AbstractC1058u.f3369J);
                    if (objM2320g9 == null) {
                        objM2320g9 = c1578g;
                    }
                    EnumC1571a enumC1571a = (EnumC1571a) objM2320g9;
                    if (enumC1571a != null) {
                        if (enumC1571a == EnumC1571a.f5230g) {
                            r32.setChecked(true);
                        } else if (enumC1571a == EnumC1571a.f5231h) {
                            r32.setChecked(false);
                        }
                    }
                    Object objM2320g10 = c0943k04.m2320g(AbstractC1058u.f3368I);
                    if (objM2320g10 == null) {
                        objM2320g10 = c1578g;
                    }
                    Boolean bool = (Boolean) objM2320g10;
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        if (c1046i == null) {
                            c1046i2 = c1046i;
                            i10 = 4;
                        } else {
                            c1046i2 = c1046i;
                            i10 = 4;
                            if (c1046i2.f3287a == 4) {
                                r2.setSelected(zBooleanValue2);
                            }
                        }
                        r32.setChecked(zBooleanValue2);
                    } else {
                        c1046i2 = c1046i;
                        i10 = 4;
                    }
                    C1050m c1050m4 = c1050m;
                    if (!c1050m4.f3343i || C1054q.m2649j(i10, c1054q6).isEmpty()) {
                        Object objM2320g11 = c0943k04.m2320g(AbstractC1058u.f3376a);
                        if (objM2320g11 == null) {
                            objM2320g11 = c1578g;
                        }
                        List list3 = (List) objM2320g11;
                        r2.setContentDescription(list3 != null ? (String) AbstractC4166m.m8424v1(list3) : c1578g);
                    }
                    Object objM2320g12 = c0943k04.m2320g(AbstractC1058u.f3401z);
                    if (objM2320g12 == null) {
                        objM2320g12 = c1578g;
                    }
                    String str2 = (String) objM2320g12;
                    if (str2 != null) {
                        C1054q c1054qM2660l3 = c1054q6;
                        while (true) {
                            if (c1054qM2660l3 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            C1050m c1050m5 = c1054qM2660l3.f3350d;
                            C1061x c1061x2 = AbstractC1059v.f3402a;
                            if (c1050m5.f3341g.m2316c(c1061x2)) {
                                zBooleanValue = ((Boolean) c1050m5.m2646d(c1061x2)).booleanValue();
                                break;
                            }
                            c1054qM2660l3 = c1054qM2660l3.m2660l();
                        }
                        if (zBooleanValue) {
                            r2.setViewIdResourceName(str2);
                        }
                    }
                    Object objM2320g13 = c0943k04.m2320g(AbstractC1058u.f3383h);
                    if (objM2320g13 == null) {
                        objM2320g13 = c1578g;
                    }
                    if (((C3967n) objM2320g13) == null) {
                        c1578g3 = c1578g2;
                        objM2320g = c0943k04.m2320g(AbstractC1058u.f3384i);
                        if (objM2320g == null) {
                            objM2320g = c1578g;
                        }
                        if (((C3967n) objM2320g) != null) {
                            if (Build.VERSION.SDK_INT >= 29) {
                                r2.setTextEntryKey(true);
                            } else {
                                c1578g3.m4122f(8, true);
                            }
                        }
                        i11 = i9;
                        if (i11 != -1) {
                            int iM2366d = c0962u.m2366d(c1054q6.f3352f);
                            if (iM2366d != -1) {
                                r2.setDrawingOrder(iM2366d);
                            } else {
                                Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                            }
                        }
                        r2.setPassword(c0943k04.m2316c(AbstractC1058u.f3370K));
                        objM2320g2 = c0943k04.m2320g(AbstractC1058u.f3373N);
                        if (objM2320g2 == null) {
                            objM2320g2 = c1578g;
                        }
                        Boolean bool2 = Boolean.TRUE;
                        r2.setEditable(AbstractC1416l.m3825a(objM2320g2, bool2));
                        objM2320g3 = c0943k04.m2320g(AbstractC1058u.f3374O);
                        if (objM2320g3 == null) {
                            objM2320g3 = c1578g;
                        }
                        Integer num = (Integer) objM2320g3;
                        r2.setMaxTextLength(num != null ? num.intValue() : -1);
                        r2.setEnabled(AbstractC5883g0.m10586b(c1054q6));
                        C1061x c1061x3 = AbstractC1058u.f3387l;
                        r2.setFocusable(c0943k04.m2316c(c1061x3));
                        if (r2.isFocusable()) {
                            r2.setFocused(((Boolean) c1050m4.m2646d(c1061x3)).booleanValue());
                            if (r2.isFocused()) {
                                r32.addAction(2);
                                viewOnAttachStateChangeListenerC5958z2 = viewOnAttachStateChangeListenerC5958z;
                                viewOnAttachStateChangeListenerC5958z2.f24223r = i11;
                            } else {
                                viewOnAttachStateChangeListenerC5958z2 = viewOnAttachStateChangeListenerC5958z;
                                z9 = true;
                                r32.addAction(1);
                                r32.setVisibleToUser(AbstractC1057t.m2676g(c1054q6) ^ z9);
                                if (c1054q6.m2663o()) {
                                    c1054qM2660l = c1054q6;
                                } else {
                                    c1054qM2660l = c1054q6.m2660l();
                                    c1054qM2660l.getClass();
                                }
                                if (c1054qM2660l.m2661m().m2050f()) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                    r32.setVisibleToUser(false);
                                }
                                objM2320g4 = c0943k04.m2320g(AbstractC1058u.f3386k);
                                if (objM2320g4 == null) {
                                    objM2320g4 = c1578g;
                                }
                                if (objM2320g4 == null) {
                                    C0086a.m445d();
                                    return null;
                                }
                                r32.setClickable(z10);
                                Object objM2320g14 = c0943k04.m2320g(AbstractC1049l.f3316b);
                                if (objM2320g14 == null) {
                                    objM2320g14 = c1578g;
                                }
                                C1038a c1038a = (C1038a) objM2320g14;
                                if (c1038a != null) {
                                    Object objM2320g15 = c0943k04.m2320g(AbstractC1058u.f3368I);
                                    if (objM2320g15 == null) {
                                        objM2320g15 = c1578g;
                                    }
                                    boolean zM3825a4 = AbstractC1416l.m3825a(objM2320g15, bool2);
                                    if (c1046i2 != null && c1046i2.f3287a == 4) {
                                        z13 = true;
                                        r32.setClickable(z13 || (z13 && !zM3825a4));
                                        if (AbstractC5883g0.m10586b(c1054q6) && r2.isClickable()) {
                                            c1578g3.m4118a(new C1576e(16, c1038a.f3269a));
                                        }
                                    } else {
                                        if (!(c1046i2 != null && c1046i2.f3287a == 3)) {
                                            z13 = false;
                                        }
                                        if (z13) {
                                            r32.setClickable(z13 || (z13 && !zM3825a4));
                                            if (AbstractC5883g0.m10586b(c1054q6)) {
                                                c1578g3.m4118a(new C1576e(16, c1038a.f3269a));
                                            }
                                        }
                                    }
                                }
                                r32.setLongClickable(false);
                                C1038a c1038a2 = (C1038a) AbstractC1057t.m2675f(c1050m4, AbstractC1049l.f3317c);
                                if (c1038a2 != null) {
                                    r32.setLongClickable(true);
                                    if (AbstractC5883g0.m10586b(c1054q6)) {
                                        c1578g3.m4118a(new C1576e(32, c1038a2.f3269a));
                                    }
                                }
                                C1038a c1038a3 = (C1038a) AbstractC1057t.m2675f(c1050m4, AbstractC1049l.f3331q);
                                if (c1038a3 != null) {
                                    c1578g3.m4118a(new C1576e(16384, c1038a3.f3269a));
                                }
                                if (AbstractC5883g0.m10586b(c1054q6)) {
                                    C1038a c1038a4 = (C1038a) AbstractC1057t.m2675f(c1050m4, AbstractC1049l.f3325k);
                                    if (c1038a4 != null) {
                                        c1578g3.m4118a(new C1576e(2097152, c1038a4.f3269a));
                                    }
                                    C1038a c1038a5 = (C1038a) AbstractC1057t.m2675f(c1050m4, AbstractC1049l.f3330p);
                                    if (c1038a5 != null) {
                                        c1578g3.m4118a(new C1576e(R.id.accessibilityActionImeEnter, c1038a5.f3269a));
                                    }
                                    C1038a c1038a6 = (C1038a) AbstractC1057t.m2675f(c1050m4, AbstractC1049l.f3332r);
                                    if (c1038a6 != null) {
                                        c1578g3.m4118a(new C1576e(65536, c1038a6.f3269a));
                                    }
                                    C1038a c1038a7 = (C1038a) AbstractC1057t.m2675f(c1050m4, AbstractC1049l.f3333s);
                                    if (c1038a7 != null && r2.isFocused()) {
                                        ClipDescription primaryClipDescription = viewTreeObserverOnGlobalLayoutListenerC5934t.m11092getClipboardManager().m10610a().getPrimaryClipDescription();
                                        if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                            c1578g3.m4118a(new C1576e(32768, c1038a7.f3269a));
                                        }
                                    }
                                }
                                String strM10679m = ViewOnAttachStateChangeListenerC5958z.m10679m(c1054q6);
                                if (!(strM10679m == null || strM10679m.length() == 0)) {
                                    r2.setTextSelection(viewOnAttachStateChangeListenerC5958z2.m10698k(c1054q6), viewOnAttachStateChangeListenerC5958z2.m10697j(c1054q6));
                                    C1038a c1038a8 = (C1038a) AbstractC1057t.m2675f(c1050m4, AbstractC1049l.f3324j);
                                    c1578g3.m4118a(new C1576e(Opcodes.ACC_DEPRECATED, c1038a8 != null ? c1038a8.f3269a : c1578g));
                                    r32.addAction(Opcodes.ACC_NATIVE);
                                    r32.addAction(Opcodes.ACC_INTERFACE);
                                    r32.setMovementGranularities(11);
                                    List list4 = (List) AbstractC1057t.m2675f(c1050m4, AbstractC1058u.f3376a);
                                    if ((list4 == null || list4.isEmpty()) && c0943k04.m2316c(AbstractC1049l.f3315a)) {
                                        if (!c0943k04.m2316c(AbstractC1058u.f3365F) || AbstractC1416l.m3825a(AbstractC1057t.m2675f(c1050m4, c1061x3), bool2)) {
                                            ?? M10049u = c5602f0.m10049u();
                                            while (true) {
                                                if (M10049u == 0) {
                                                    M10049u = c1578g;
                                                    break;
                                                }
                                                C1050m c1050mM10051w = M10049u.m10051w();
                                                if (c1050mM10051w == null || !c1050mM10051w.f3343i) {
                                                    z11 = false;
                                                    if (!z11) {
                                                        break;
                                                    }
                                                    M10049u = M10049u.m10049u();
                                                } else {
                                                    if (c1050mM10051w.f3341g.m2316c(AbstractC1058u.f3365F)) {
                                                        z11 = true;
                                                    }
                                                    if (!z11) {
                                                    }
                                                }
                                            }
                                            if (M10049u != 0) {
                                                C1050m c1050mM10051w2 = M10049u.m10051w();
                                                if (c1050mM10051w2 != null) {
                                                    Object objM2320g16 = c1050mM10051w2.f3341g.m2320g(AbstractC1058u.f3387l);
                                                    if (objM2320g16 == null) {
                                                        objM2320g16 = c1578g;
                                                    }
                                                    zM3825a = AbstractC1416l.m3825a(objM2320g16, Boolean.TRUE);
                                                } else {
                                                    zM3825a = false;
                                                }
                                                z12 = zM3825a ? false : true;
                                                if (!z12) {
                                                    r32.setMovementGranularities(r2.getMovementGranularities() | 20);
                                                }
                                            }
                                            if (!z12) {
                                            }
                                        }
                                    }
                                }
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.add("androidx.compose.ui.semantics.id");
                                CharSequence charSequenceM4121e = c1578g3.m4121e();
                                if (!(charSequenceM4121e == null || charSequenceM4121e.length() == 0) && c0943k04.m2316c(AbstractC1049l.f3315a)) {
                                    arrayList5.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                }
                                if (c0943k04.m2316c(AbstractC1058u.f3401z)) {
                                    arrayList5.add("androidx.compose.ui.semantics.testTag");
                                }
                                if (c0943k04.m2316c(AbstractC1058u.f3375P)) {
                                    arrayList5.add("androidx.compose.ui.semantics.shapeType");
                                    arrayList5.add("androidx.compose.ui.semantics.shapeRect");
                                    arrayList5.add("androidx.compose.ui.semantics.shapeCorners");
                                    arrayList5.add("androidx.compose.ui.semantics.shapeRegion");
                                }
                                r2.setAvailableExtraData(arrayList5);
                                C1045h c1045h = (C1045h) AbstractC1057t.m2675f(c1050m4, AbstractC1058u.f3378c);
                                if (c1045h != null) {
                                    float f3 = c1045h.f3284a;
                                    C2561a c2561a = c1045h.f3285b;
                                    C1061x c1061x4 = AbstractC1049l.f3323i;
                                    if (c0943k04.m2316c(c1061x4)) {
                                        c1578g3.m4123g("android.widget.SeekBar");
                                    } else {
                                        c1578g3.m4123g("android.widget.ProgressBar");
                                    }
                                    if (c1045h != C1045h.f3283d) {
                                        r32.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new C1577f(AccessibilityNodeInfo.RangeInfo.obtain(1, c2561a.f8310a, c2561a.f8311b, f3)).f5247a);
                                    }
                                    if (c0943k04.m2316c(c1061x4) && AbstractC5883g0.m10586b(c1054q6)) {
                                        float fFloatValue = ((Number) c2561a.m6019a()).floatValue();
                                        float fFloatValue2 = ((Number) c2561a.m6020b()).floatValue();
                                        if (fFloatValue < fFloatValue2) {
                                            fFloatValue = fFloatValue2;
                                        }
                                        if (f3 < fFloatValue) {
                                            c1578g3.m4118a(C1576e.f5239e);
                                        }
                                        float fFloatValue3 = ((Number) c2561a.m6020b()).floatValue();
                                        float fFloatValue4 = ((Number) c2561a.m6019a()).floatValue();
                                        if (fFloatValue3 > fFloatValue4) {
                                            fFloatValue3 = fFloatValue4;
                                        }
                                        if (f3 > fFloatValue3) {
                                            c1578g3.m4118a(C1576e.f5240f);
                                        }
                                    }
                                }
                                if (AbstractC5883g0.m10586b(c1054q6)) {
                                    Object objM2320g17 = c1054q6.f3350d.f3341g.m2320g(AbstractC1049l.f3323i);
                                    if (objM2320g17 == null) {
                                        objM2320g17 = c1578g;
                                    }
                                    C1038a c1038a9 = (C1038a) objM2320g17;
                                    if (c1038a9 != null) {
                                        ?? r62 = c1578g;
                                        c1578g3.m4118a(new C1576e(r62, R.id.accessibilityActionSetProgress, c1038a9.f3269a, r62));
                                    }
                                }
                                Object objM2320g18 = c1054q6.m2659k().f3341g.m2320g(AbstractC1058u.f3381f);
                                if (objM2320g18 == null) {
                                    objM2320g18 = null;
                                }
                                C1041d c1041d = (C1041d) objM2320g18;
                                if (c1041d != null) {
                                    r32.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(c1041d.f3274a, c1041d.f3275b, false, 0));
                                } else {
                                    ArrayList arrayList6 = new ArrayList();
                                    Object objM2320g19 = c1054q6.m2659k().f3341g.m2320g(AbstractC1058u.f3380e);
                                    if (objM2320g19 == null) {
                                        objM2320g19 = null;
                                    }
                                    if (objM2320g19 != null) {
                                        List listM2649j2 = C1054q.m2649j(4, c1054q6);
                                        int size8 = listM2649j2.size();
                                        for (int i39 = 0; i39 < size8; i39++) {
                                            C1054q c1054q7 = (C1054q) listM2649j2.get(i39);
                                            if (c1054q7.m2659k().f3341g.m2316c(AbstractC1058u.f3368I)) {
                                                arrayList6.add(c1054q7);
                                            }
                                        }
                                    }
                                    if (!arrayList6.isEmpty()) {
                                        boolean zM6787n = AbstractC3165h.m6787n(arrayList6);
                                        r32.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zM6787n ? 1 : arrayList6.size(), zM6787n ? arrayList6.size() : 1, false, 0));
                                    }
                                }
                                AbstractC3165h.m6768T(c1054q6, c1578g3);
                                C1047j c1047j = (C1047j) AbstractC1057t.m2675f(c1054q6.m2662n(), AbstractC1058u.f3396u);
                                C1038a c1038a10 = (C1038a) AbstractC1057t.m2675f(c1054q6.m2662n(), AbstractC1049l.f3318d);
                                if (c1047j != null && c1038a10 != null) {
                                    Object objM2320g20 = c1054q6.m2659k().f3341g.m2320g(AbstractC1058u.f3381f);
                                    if (objM2320g20 == null) {
                                        objM2320g20 = null;
                                    }
                                    if (objM2320g20 == null) {
                                        Object objM2320g21 = c1054q6.m2659k().f3341g.m2320g(AbstractC1058u.f3380e);
                                        if (objM2320g21 == null) {
                                            objM2320g21 = null;
                                        }
                                        boolean z15 = objM2320g21 != null;
                                        if (!z15) {
                                            c1578g3.m4123g("android.widget.HorizontalScrollView");
                                        }
                                        if (((Number) c1047j.f3289b.invoke()).floatValue() > 0.0f) {
                                            r32.setScrollable(true);
                                        }
                                        if (AbstractC5883g0.m10586b(c1054q6)) {
                                            boolean zM10682s = ViewOnAttachStateChangeListenerC5958z.m10682s(c1047j);
                                            EnumC4243m enumC4243m = EnumC4243m.f13920h;
                                            if (zM10682s) {
                                                c1578g3.m4118a(C1576e.f5239e);
                                                c5602f02 = c5602f0;
                                                c1578g3.m4118a(!(c5602f02.f22772F == enumC4243m) ? C1576e.f5244j : C1576e.f5242h);
                                            } else {
                                                c5602f02 = c5602f0;
                                            }
                                            if (ViewOnAttachStateChangeListenerC5958z.m10681r(c1047j)) {
                                                c1578g3.m4118a(C1576e.f5240f);
                                                c1578g3.m4118a(!(c5602f02.f22772F == enumC4243m) ? C1576e.f5242h : C1576e.f5244j);
                                            }
                                        }
                                    }
                                }
                                C1047j c1047j2 = (C1047j) AbstractC1057t.m2675f(c1054q6.m2662n(), AbstractC1058u.f3397v);
                                if (c1047j2 != null && c1038a10 != null) {
                                    Object objM2320g22 = c1054q6.m2659k().f3341g.m2320g(AbstractC1058u.f3381f);
                                    if (objM2320g22 == null) {
                                        objM2320g22 = null;
                                    }
                                    if (objM2320g22 == null) {
                                        Object objM2320g23 = c1054q6.m2659k().f3341g.m2320g(AbstractC1058u.f3380e);
                                        if (objM2320g23 == null) {
                                            objM2320g23 = null;
                                        }
                                        boolean z16 = objM2320g23 != null;
                                        if (!z16) {
                                            c1578g3.m4123g("android.widget.ScrollView");
                                        }
                                        if (((Number) c1047j2.f3289b.invoke()).floatValue() > 0.0f) {
                                            r32.setScrollable(true);
                                        }
                                        if (AbstractC5883g0.m10586b(c1054q6)) {
                                            if (ViewOnAttachStateChangeListenerC5958z.m10682s(c1047j2)) {
                                                c1578g3.m4118a(C1576e.f5239e);
                                                c1578g3.m4118a(C1576e.f5243i);
                                            }
                                            if (ViewOnAttachStateChangeListenerC5958z.m10681r(c1047j2)) {
                                                c1578g3.m4118a(C1576e.f5240f);
                                                c1578g3.m4118a(C1576e.f5241g);
                                            }
                                        }
                                    }
                                }
                                int i40 = Build.VERSION.SDK_INT;
                                if (i40 >= 29) {
                                    AbstractC5883g0.m10588d(c1054q6, c1578g3);
                                }
                                CharSequence charSequence = (CharSequence) AbstractC1057t.m2675f(c1054q6.m2662n(), AbstractC1058u.f3379d);
                                if (i40 >= 28) {
                                    r32.setPaneTitle(charSequence);
                                } else {
                                    r32.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                }
                                if (AbstractC5883g0.m10586b(c1054q6)) {
                                    C1038a c1038a11 = (C1038a) AbstractC1057t.m2675f(c1054q6.m2662n(), AbstractC1049l.f3334t);
                                    if (c1038a11 != null) {
                                        c1578g3.m4118a(new C1576e(Opcodes.ASM4, c1038a11.f3269a));
                                    }
                                    C1038a c1038a12 = (C1038a) AbstractC1057t.m2675f(c1054q6.m2662n(), AbstractC1049l.f3335u);
                                    if (c1038a12 != null) {
                                        c1578g3.m4118a(new C1576e(524288, c1038a12.f3269a));
                                    }
                                    C1038a c1038a13 = (C1038a) AbstractC1057t.m2675f(c1054q6.m2662n(), AbstractC1049l.f3336v);
                                    if (c1038a13 != null) {
                                        c1578g3.m4118a(new C1576e(1048576, c1038a13.f3269a));
                                    }
                                    C1050m c1050mM2662n = c1054q6.m2662n();
                                    C1061x c1061x5 = AbstractC1049l.f3338x;
                                    if (c1050mM2662n.f3341g.m2316c(c1061x5)) {
                                        List list5 = (List) c1054q6.m2662n().m2646d(c1061x5);
                                        int size9 = list5.size();
                                        C0964v c0964v = ViewOnAttachStateChangeListenerC5958z.f24195T;
                                        if (size9 >= c0964v.f3036b) {
                                            C2104o.m5276A(AbstractC2091b.m5163j(new StringBuilder("Can't have more than "), c0964v.f3036b, " custom actions for one widget"));
                                            return null;
                                        }
                                        C0961t0 c0961t03 = new C0961t0();
                                        C0925b0 c0925b0M2341a = AbstractC0951o0.m2341a();
                                        C0961t0 c0961t04 = c0961t0;
                                        if (AbstractC1256a.m3379a(c0961t04.f3024g, c0961t04.f3026i, i11) >= 0) {
                                            C0925b0 c0925b0 = (C0925b0) c0961t04.m2360b(i11);
                                            int[] iArr = c0964v.f3035a;
                                            int i41 = c0964v.f3036b;
                                            int[] iArrCopyOf = new int[16];
                                            int i42 = 0;
                                            int i43 = 0;
                                            while (i42 < i41) {
                                                int i44 = iArr[i42];
                                                int i45 = i41;
                                                int i46 = i43 + 1;
                                                C0925b0 c0925b02 = c0925b0;
                                                if (iArrCopyOf.length < i46) {
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i46, (iArrCopyOf.length * 3) / 2));
                                                }
                                                iArrCopyOf[i43] = i44;
                                                i42++;
                                                i43 = i46;
                                                i41 = i45;
                                                c0925b0 = c0925b02;
                                            }
                                            C0925b0 c0925b03 = c0925b0;
                                            ArrayList arrayList7 = new ArrayList();
                                            if (list5.size() > 0) {
                                                AbstractC4855en.m9270n(list5.get(0));
                                                c0925b03.getClass();
                                                throw null;
                                            }
                                            if (arrayList7.size() > 0) {
                                                AbstractC4855en.m9270n(arrayList7.get(0));
                                                if (i43 <= 0) {
                                                    C3193a.m6820i("Index must be between 0 and size");
                                                    return null;
                                                }
                                                int i47 = iArrCopyOf[0];
                                                throw null;
                                            }
                                        } else if (list5.size() > 0) {
                                            AbstractC4855en.m9270n(list5.get(0));
                                            c0964v.m2371c(0);
                                            throw null;
                                        }
                                        viewOnAttachStateChangeListenerC5958z2.f24229x.m2361c(i11, c0961t03);
                                        c0961t04.m2361c(i11, c0925b0M2341a);
                                    }
                                }
                                boolean zM10587c = AbstractC5883g0.m10587c(c1054q6, resources);
                                if (Build.VERSION.SDK_INT >= 28) {
                                    r32.setScreenReaderFocusable(zM10587c);
                                } else {
                                    c1578g3.m4122f(1, zM10587c);
                                }
                                int iM2366d2 = viewOnAttachStateChangeListenerC5958z2.f24203H.m2366d(i11);
                                if (iM2366d2 != -1) {
                                    AbstractC5673h abstractC5673hM10604t2 = AbstractC5883g0.m10604t(viewTreeObserverOnGlobalLayoutListenerC5934t.getAndroidViewsHandler$ui(), iM2366d2);
                                    if (abstractC5673hM10604t2 != null) {
                                        r32.setTraversalBefore(abstractC5673hM10604t2);
                                        viewTreeObserverOnGlobalLayoutListenerC5934t2 = viewTreeObserverOnGlobalLayoutListenerC5934t;
                                    } else {
                                        viewTreeObserverOnGlobalLayoutListenerC5934t2 = viewTreeObserverOnGlobalLayoutListenerC5934t;
                                        r32.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC5934t2, iM2366d2);
                                    }
                                    bundle = null;
                                    viewOnAttachStateChangeListenerC5958z2.m10690c(i11, c1578g3, viewOnAttachStateChangeListenerC5958z2.f24205J, null);
                                } else {
                                    viewTreeObserverOnGlobalLayoutListenerC5934t2 = viewTreeObserverOnGlobalLayoutListenerC5934t;
                                    bundle = null;
                                }
                                int iM2366d3 = viewOnAttachStateChangeListenerC5958z2.f24204I.m2366d(i11);
                                if (iM2366d3 != -1 && (abstractC5673hM10604t = AbstractC5883g0.m10604t(viewTreeObserverOnGlobalLayoutListenerC5934t2.getAndroidViewsHandler$ui(), iM2366d3)) != null) {
                                    r32.setTraversalAfter(abstractC5673hM10604t);
                                    viewOnAttachStateChangeListenerC5958z2.m10690c(i11, c1578g3, viewOnAttachStateChangeListenerC5958z2.f24206K, bundle);
                                }
                                String str3 = (String) AbstractC1057t.m2675f(c1054q6.m2662n(), AbstractC1059v.f3403b);
                                if (str3 != null) {
                                    c1578g3.m4123g(str3);
                                }
                            }
                        } else {
                            viewOnAttachStateChangeListenerC5958z2 = viewOnAttachStateChangeListenerC5958z;
                        }
                        z9 = true;
                        r32.setVisibleToUser(AbstractC1057t.m2676g(c1054q6) ^ z9);
                        if (c1054q6.m2663o()) {
                        }
                        if (c1054qM2660l.m2661m().m2050f()) {
                        }
                        objM2320g4 = c0943k04.m2320g(AbstractC1058u.f3386k);
                        if (objM2320g4 == null) {
                        }
                        if (objM2320g4 == null) {
                        }
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        r32.setHeading(true);
                        c1578g3 = c1578g2;
                        objM2320g = c0943k04.m2320g(AbstractC1058u.f3384i);
                        if (objM2320g == null) {
                        }
                        if (((C3967n) objM2320g) != null) {
                        }
                        i11 = i9;
                        if (i11 != -1) {
                        }
                        r2.setPassword(c0943k04.m2316c(AbstractC1058u.f3370K));
                        objM2320g2 = c0943k04.m2320g(AbstractC1058u.f3373N);
                        if (objM2320g2 == null) {
                        }
                        Boolean bool22 = Boolean.TRUE;
                        r2.setEditable(AbstractC1416l.m3825a(objM2320g2, bool22));
                        objM2320g3 = c0943k04.m2320g(AbstractC1058u.f3374O);
                        if (objM2320g3 == null) {
                        }
                        Integer num2 = (Integer) objM2320g3;
                        r2.setMaxTextLength(num2 != null ? num2.intValue() : -1);
                        r2.setEnabled(AbstractC5883g0.m10586b(c1054q6));
                        C1061x c1061x32 = AbstractC1058u.f3387l;
                        r2.setFocusable(c0943k04.m2316c(c1061x32));
                        if (r2.isFocusable()) {
                        }
                        z9 = true;
                        r32.setVisibleToUser(AbstractC1057t.m2676g(c1054q6) ^ z9);
                        if (c1054q6.m2663o()) {
                        }
                        if (c1054qM2660l.m2661m().m2050f()) {
                        }
                        objM2320g4 = c0943k04.m2320g(AbstractC1058u.f3386k);
                        if (objM2320g4 == null) {
                        }
                        if (objM2320g4 == null) {
                        }
                    } else {
                        c1578g3 = c1578g2;
                        c1578g3.m4122f(2, true);
                        objM2320g = c0943k04.m2320g(AbstractC1058u.f3384i);
                        if (objM2320g == null) {
                        }
                        if (((C3967n) objM2320g) != null) {
                        }
                        i11 = i9;
                        if (i11 != -1) {
                        }
                        r2.setPassword(c0943k04.m2316c(AbstractC1058u.f3370K));
                        objM2320g2 = c0943k04.m2320g(AbstractC1058u.f3373N);
                        if (objM2320g2 == null) {
                        }
                        Boolean bool222 = Boolean.TRUE;
                        r2.setEditable(AbstractC1416l.m3825a(objM2320g2, bool222));
                        objM2320g3 = c0943k04.m2320g(AbstractC1058u.f3374O);
                        if (objM2320g3 == null) {
                        }
                        Integer num22 = (Integer) objM2320g3;
                        r2.setMaxTextLength(num22 != null ? num22.intValue() : -1);
                        r2.setEnabled(AbstractC5883g0.m10586b(c1054q6));
                        C1061x c1061x322 = AbstractC1058u.f3387l;
                        r2.setFocusable(c0943k04.m2316c(c1061x322));
                        if (r2.isFocusable()) {
                        }
                        z9 = true;
                        r32.setVisibleToUser(AbstractC1057t.m2676g(c1054q6) ^ z9);
                        if (c1054q6.m2663o()) {
                        }
                        if (c1054qM2660l.m2661m().m2050f()) {
                        }
                        objM2320g4 = c0943k04.m2320g(AbstractC1058u.f3386k);
                        if (objM2320g4 == null) {
                        }
                        if (objM2320g4 == null) {
                        }
                    }
                } else if (!(Build.VERSION.SDK_INT >= 34 ? AbstractC1573b.m4097e(accessibilityManager2) : true)) {
                    i11 = i9;
                    viewOnAttachStateChangeListenerC5958z2 = viewOnAttachStateChangeListenerC5958z3;
                    c1578g3 = null;
                }
            }
        }
        if (viewOnAttachStateChangeListenerC5958z2.f24226u) {
            if (i11 == viewOnAttachStateChangeListenerC5958z2.f24222q) {
                viewOnAttachStateChangeListenerC5958z2.f24224s = c1578g3;
            }
            if (i11 == viewOnAttachStateChangeListenerC5958z2.f24223r) {
                viewOnAttachStateChangeListenerC5958z2.f24225t = c1578g3;
            }
        }
        return c1578g3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.C0119x
    /* JADX INFO: renamed from: r */
    public final C1578g mo609r(int i9) {
        ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z = this.f24154i;
        if (i9 != 1) {
            if (i9 == 2) {
                return mo605l(viewOnAttachStateChangeListenerC5958z.f24222q);
            }
            C2104o.m5294t(AbstractC0921a.m2249l(i9, "Unknown focus type: "));
            return null;
        }
        int i10 = viewOnAttachStateChangeListenerC5958z.f24223r;
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return mo605l(i10);
    }
}
