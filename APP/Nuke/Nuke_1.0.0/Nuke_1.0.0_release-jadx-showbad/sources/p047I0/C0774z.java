package p047I0;

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
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1924f;
import com.bumptech.glide.AbstractC1925g;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import p000A.C0072l0;
import p002A1.AbstractC0142o;
import p002A1.C0147t;
import p002A1.EnumC0141n;
import p011B4.AbstractC0231b;
import p023E0.AbstractC0277a;
import p027E4.C0330q;
import p029F0.AbstractC0435z;
import p029F0.InterfaceC0430v;
import p041H0.AbstractC0596h0;
import p041H0.C0564I;
import p049I2.AbstractC0797o;
import p056K2.C0891q;
import p056K2.InterfaceC0877c;
import p059L0.AbstractC0956b;
import p061L2.AbstractC0973m;
import p061L2.C0981u;
import p077P0.AbstractC1124k;
import p077P0.AbstractC1131r;
import p077P0.AbstractC1132s;
import p077P0.AbstractC1133t;
import p077P0.C1114a;
import p077P0.C1120g;
import p077P0.C1121h;
import p077P0.C1122i;
import p077P0.C1125l;
import p077P0.C1128o;
import p077P0.C1129p;
import p077P0.C1135v;
import p087R0.EnumC1190a;
import p092S0.AbstractC1270h;
import p092S0.AbstractC1275m;
import p092S0.C1252E;
import p092S0.C1257J;
import p092S0.C1261N;
import p092S0.C1262O;
import p092S0.C1267e;
import p092S0.C1269g;
import p092S0.C1274l;
import p110W0.C1585j;
import p110W0.C1587l;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p114X.C1616e;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p125Z0.C1781b;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;
import p130a1.C1794g;
import p132a3.C1801a;
import p147d1.C1953c;
import p147d1.C1962l;
import p147d1.C1964n;
import p147d1.C1966p;
import p147d1.InterfaceC1965o;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p170h1.AbstractC2218i;
import p186k.AbstractC2412I;
import p186k.AbstractC2428j;
import p186k.C2408E;
import p186k.C2418O;
import p186k.C2437s;
import p186k.C2438t;
import p186k.C2444z;
import p192l.AbstractC2477a;
import p198m0.C2584o;
import p204n0.C2684c;
import p211o0.AbstractC2767z;
import p211o0.C2762u;
import p234s1.AbstractC3170b;
import p234s1.C3172d;
import p234s1.C3175g;

/* JADX INFO: renamed from: I0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0774z extends C1753n {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0667E f2515f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0774z(ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E) {
        super(25);
        this.f2515f = viewOnAttachStateChangeListenerC0667E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121Y1.C1753n
    /* JADX INFO: renamed from: A */
    public final C3175g mo1321A(int i5) {
        ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E = this.f2515f;
        if (i5 != 1) {
            if (i5 == 2) {
                return mo1324z(viewOnAttachStateChangeListenerC0667E.f2136o);
            }
            throw new IllegalArgumentException(AbstractC0231b.m398i("Unknown focus type: ", i5));
        }
        int i6 = viewOnAttachStateChangeListenerC0667E.f2137p;
        if (i6 == Integer.MIN_VALUE) {
            return null;
        }
        return mo1324z(i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:127:0x01a8) to fix multi-entry loop: BACK_EDGE: B:127:0x01a8 -> B:128:0x01a9 */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x01a9, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x06ec  */
    @Override // p121Y1.C1753n
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1322H(int i5, int i6, Bundle bundle) {
        C1128o c1128o;
        int i7;
        Integer num;
        AbstractC0716c abstractC0716c;
        int iM1153k;
        int i8;
        C1257J c1257jM1189k;
        InterfaceC1599a interfaceC1599a;
        InterfaceC1599a interfaceC1599a2;
        InterfaceC1599a interfaceC1599a3;
        InterfaceC1599a interfaceC1599a4;
        Float f2;
        boolean z5;
        C1114a c1114a;
        InterfaceC1599a interfaceC1599a5;
        float fIntBitsToFloat;
        C1114a c1114a2;
        InterfaceC1599a interfaceC1599a6;
        InterfaceC1601c interfaceC1601c;
        InterfaceC1599a interfaceC1599a7;
        InterfaceC1599a interfaceC1599a8;
        InterfaceC1599a interfaceC1599a9;
        InterfaceC1599a interfaceC1599a10;
        InterfaceC1599a interfaceC1599a11;
        InterfaceC1601c interfaceC1601c2;
        C1114a c1114a3;
        long jMo638R;
        InterfaceC1603e interfaceC1603e;
        InterfaceC1601c interfaceC1601c3;
        InterfaceC1599a interfaceC1599a12;
        InterfaceC1599a interfaceC1599a13;
        InterfaceC1599a interfaceC1599a14;
        InterfaceC1599a interfaceC1599a15;
        InterfaceC1599a interfaceC1599a16;
        ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E = this.f2515f;
        AccessibilityManager accessibilityManager = viewOnAttachStateChangeListenerC0667E.f2131j;
        Float fValueOf = Float.valueOf(0.0f);
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = viewOnAttachStateChangeListenerC0667E.f2128g;
        C1129p c1129p = (C1129p) viewOnAttachStateChangeListenerC0667E.m1154l().m4318b(i5);
        if (c1129p == null || (c1128o = c1129p.f3715a) == null) {
            return false;
        }
        C0564I c0564i = c1128o.f3710c;
        int i9 = c1128o.f3714g;
        C1125l c1125l = c1128o.f3711d;
        C2408E c2408e = c1125l.f3702d;
        Object objM4272g = c2408e.m4272g(AbstractC1132s.f3751n);
        if (objM4272g == null) {
            objM4272g = null;
        }
        Boolean bool = Boolean.TRUE;
        if (AbstractC1665j.m2981a(objM4272g, bool)) {
            if (!(Build.VERSION.SDK_INT >= 34 ? AbstractC3170b.m5436e(accessibilityManager) : true)) {
                return false;
            }
        }
        if (i6 == 64) {
            if (!(accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())) {
                return false;
            }
            int i10 = viewOnAttachStateChangeListenerC0667E.f2136o;
            if (i10 == i5) {
                return false;
            }
            if (i10 != Integer.MIN_VALUE) {
                i7 = 12;
                num = null;
                ViewOnAttachStateChangeListenerC0667E.m1137x(viewOnAttachStateChangeListenerC0667E, i10, 65536, null, 12);
            } else {
                i7 = 12;
                num = null;
            }
            viewOnAttachStateChangeListenerC0667E.f2136o = i5;
            viewTreeObserverOnGlobalLayoutListenerC0772y.invalidate();
            ViewOnAttachStateChangeListenerC0667E.m1137x(viewOnAttachStateChangeListenerC0667E, i5, 32768, num, i7);
            return true;
        }
        if (i6 == 128) {
            if (!(viewOnAttachStateChangeListenerC0667E.f2136o == i5)) {
                return false;
            }
            viewOnAttachStateChangeListenerC0667E.f2136o = Integer.MIN_VALUE;
            viewOnAttachStateChangeListenerC0667E.f2138q = null;
            viewTreeObserverOnGlobalLayoutListenerC0772y.invalidate();
            ViewOnAttachStateChangeListenerC0667E.m1137x(viewOnAttachStateChangeListenerC0667E, i5, 65536, null, 12);
            return true;
        }
        if (i6 == 256 || i6 == 512) {
            if (bundle == null) {
                return false;
            }
            int i11 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
            boolean z6 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
            boolean z7 = i6 == 256;
            Integer num2 = viewOnAttachStateChangeListenerC0667E.f2146y;
            if (num2 == null || i9 != num2.intValue()) {
                viewOnAttachStateChangeListenerC0667E.f2145x = -1;
                viewOnAttachStateChangeListenerC0667E.f2146y = Integer.valueOf(i9);
            }
            String strM1133m = ViewOnAttachStateChangeListenerC0667E.m1133m(c1128o);
            if (strM1133m == null || strM1133m.length() == 0) {
                return false;
            }
            String strM1133m2 = ViewOnAttachStateChangeListenerC0667E.m1133m(c1128o);
            if (strM1133m2 == null || strM1133m2.length() == 0) {
                abstractC0716c = null;
            } else if (i11 == 1) {
                Locale locale = viewTreeObserverOnGlobalLayoutListenerC0772y.getContext().getResources().getConfiguration().locale;
                if (C0719d.f2269h == null) {
                    C0719d c0719d = new C0719d(0);
                    c0719d.f2275g = BreakIterator.getCharacterInstance(locale);
                    C0719d.f2269h = c0719d;
                }
                C0719d c0719d2 = C0719d.f2269h;
                AbstractC1665j.m2983c(c0719d2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                c0719d2.m1222f(strM1133m2);
                abstractC0716c = c0719d2;
            } else if (i11 == 2) {
                Locale locale2 = viewTreeObserverOnGlobalLayoutListenerC0772y.getContext().getResources().getConfiguration().locale;
                if (C0719d.f2270i == null) {
                    C0719d c0719d3 = new C0719d(1);
                    c0719d3.f2275g = BreakIterator.getWordInstance(locale2);
                    C0719d.f2270i = c0719d3;
                }
                C0719d c0719d4 = C0719d.f2270i;
                AbstractC1665j.m2983c(c0719d4, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                c0719d4.m1222f(strM1133m2);
                abstractC0716c = c0719d4;
            } else if (i11 == 4) {
                if (c2408e.m4268c(AbstractC1124k.f3676a) && (c1257jM1189k = AbstractC0681L.m1189k(c1125l)) != null) {
                    if (i11 == 4) {
                        if (C0719d.f2271j == null) {
                            C0719d.f2271j = new C0719d(2);
                        }
                        C0719d c0719d5 = C0719d.f2271j;
                        AbstractC1665j.m2983c(c0719d5, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                        c0719d5.f2265d = strM1133m2;
                        c0719d5.f2275g = c1257jM1189k;
                        abstractC0716c = c0719d5;
                    } else {
                        if (C0722e.f2280h == null) {
                            C0722e c0722e = new C0722e();
                            new Rect();
                            C0722e.f2280h = c0722e;
                        }
                        C0722e c0722e2 = C0722e.f2280h;
                        AbstractC1665j.m2983c(c0722e2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                        c0722e2.f2265d = strM1133m2;
                        c0722e2.f2283f = c1257jM1189k;
                        c0722e2.f2284g = c1128o;
                        abstractC0716c = c0722e2;
                    }
                }
            } else if (i11 == 8) {
                if (C0725f.f2294f == null) {
                    C0725f.f2294f = new C0725f();
                }
                C0725f c0725f = C0725f.f2294f;
                AbstractC1665j.m2983c(c0725f, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                c0725f.f2265d = strM1133m2;
                abstractC0716c = c0725f;
            } else if (i11 != 16) {
            }
            if (abstractC0716c == null) {
                return false;
            }
            int iM1152j = viewOnAttachStateChangeListenerC0667E.m1152j(c1128o);
            if (iM1152j == -1) {
                iM1152j = z7 ? 0 : strM1133m.length();
            }
            int[] iArrMo1217a = z7 ? abstractC0716c.mo1217a(iM1152j) : abstractC0716c.mo1220d(iM1152j);
            if (iArrMo1217a == null) {
                return false;
            }
            int i12 = iArrMo1217a[0];
            int i13 = iArrMo1217a[1];
            if (z6 && !c2408e.m4268c(AbstractC1132s.f3738a) && c2408e.m4268c(AbstractC1132s.f3727F)) {
                iM1153k = viewOnAttachStateChangeListenerC0667E.m1153k(c1128o);
                if (iM1153k == -1) {
                    iM1153k = z7 ? i12 : i13;
                }
                i8 = z7 ? i13 : i12;
            } else {
                iM1153k = z7 ? i13 : i12;
                i8 = iM1153k;
            }
            viewOnAttachStateChangeListenerC0667E.f2113C = new C0659A(c1128o, z7 ? 256 : 512, i11, i12, i13, SystemClock.uptimeMillis());
            viewOnAttachStateChangeListenerC0667E.m1141D(c1128o, iM1153k, i8, true);
            return true;
        }
        if (i6 == 16384) {
            Object objM4272g2 = c2408e.m4272g(AbstractC1124k.f3692q);
            C1114a c1114a4 = (C1114a) (objM4272g2 == null ? null : objM4272g2);
            if (c1114a4 == null || (interfaceC1599a = (InterfaceC1599a) c1114a4.f3634b) == null) {
                return false;
            }
            return ((Boolean) interfaceC1599a.mo6a()).booleanValue();
        }
        if (i6 == 131072) {
            boolean zM1141D = viewOnAttachStateChangeListenerC0667E.m1141D(c1128o, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
            if (zM1141D) {
                ViewOnAttachStateChangeListenerC0667E.m1137x(viewOnAttachStateChangeListenerC0667E, viewOnAttachStateChangeListenerC0667E.m1158t(i9), 0, null, 12);
            }
            return zM1141D;
        }
        if (!AbstractC0681L.m1180b(c1128o)) {
            return false;
        }
        if (i6 == 1) {
            if (viewTreeObserverOnGlobalLayoutListenerC0772y.isInTouchMode()) {
                viewTreeObserverOnGlobalLayoutListenerC0772y.requestFocusFromTouch();
            }
            Object objM4272g3 = c2408e.m4272g(AbstractC1124k.f3698w);
            C1114a c1114a5 = (C1114a) (objM4272g3 == null ? null : objM4272g3);
            if (c1114a5 == null || (interfaceC1599a2 = (InterfaceC1599a) c1114a5.f3634b) == null) {
                return false;
            }
            return ((Boolean) interfaceC1599a2.mo6a()).booleanValue();
        }
        if (i6 == 2) {
            Object objM4272g4 = c2408e.m4272g(AbstractC1132s.f3748k);
            if (objM4272g4 == null) {
                objM4272g4 = null;
            }
            if (!AbstractC1665j.m2981a(objM4272g4, bool)) {
                return false;
            }
            ((C2584o) viewTreeObserverOnGlobalLayoutListenerC0772y.getFocusOwner()).m4527b(8, false, true);
            return true;
        }
        EnumC2017m enumC2017m = EnumC2017m.f6743e;
        switch (i6) {
            case 16:
                Object objM4272g5 = c2408e.m4272g(AbstractC1124k.f3677b);
                if (objM4272g5 == null) {
                    objM4272g5 = null;
                }
                C1114a c1114a6 = (C1114a) objM4272g5;
                Boolean bool2 = (c1114a6 == null || (interfaceC1599a3 = (InterfaceC1599a) c1114a6.f3634b) == null) ? null : (Boolean) interfaceC1599a3.mo6a();
                ViewOnAttachStateChangeListenerC0667E.m1137x(viewOnAttachStateChangeListenerC0667E, i5, 1, null, 12);
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return false;
            case 32:
                Object objM4272g6 = c2408e.m4272g(AbstractC1124k.f3678c);
                C1114a c1114a7 = (C1114a) (objM4272g6 == null ? null : objM4272g6);
                if (c1114a7 == null || (interfaceC1599a4 = (InterfaceC1599a) c1114a7.f3634b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1599a4.mo6a()).booleanValue();
            case 4096:
            case 8192:
                break;
            case 32768:
                Object objM4272g7 = c2408e.m4272g(AbstractC1124k.f3694s);
                C1114a c1114a8 = (C1114a) (objM4272g7 == null ? null : objM4272g7);
                if (c1114a8 == null || (interfaceC1599a7 = (InterfaceC1599a) c1114a8.f3634b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1599a7.mo6a()).booleanValue();
            case 65536:
                Object objM4272g8 = c2408e.m4272g(AbstractC1124k.f3693r);
                C1114a c1114a9 = (C1114a) (objM4272g8 == null ? null : objM4272g8);
                if (c1114a9 == null || (interfaceC1599a8 = (InterfaceC1599a) c1114a9.f3634b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1599a8.mo6a()).booleanValue();
            case 262144:
                Object objM4272g9 = c2408e.m4272g(AbstractC1124k.f3695t);
                C1114a c1114a10 = (C1114a) (objM4272g9 == null ? null : objM4272g9);
                if (c1114a10 == null || (interfaceC1599a9 = (InterfaceC1599a) c1114a10.f3634b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1599a9.mo6a()).booleanValue();
            case 524288:
                Object objM4272g10 = c2408e.m4272g(AbstractC1124k.f3696u);
                C1114a c1114a11 = (C1114a) (objM4272g10 == null ? null : objM4272g10);
                if (c1114a11 == null || (interfaceC1599a10 = (InterfaceC1599a) c1114a11.f3634b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1599a10.mo6a()).booleanValue();
            case 1048576:
                Object objM4272g11 = c2408e.m4272g(AbstractC1124k.f3697v);
                C1114a c1114a12 = (C1114a) (objM4272g11 == null ? null : objM4272g11);
                if (c1114a12 == null || (interfaceC1599a11 = (InterfaceC1599a) c1114a12.f3634b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1599a11.mo6a()).booleanValue();
            case 2097152:
                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                Object objM4272g12 = c2408e.m4272g(AbstractC1124k.f3686k);
                C1114a c1114a13 = (C1114a) (objM4272g12 == null ? null : objM4272g12);
                if (c1114a13 == null || (interfaceC1601c2 = (InterfaceC1601c) c1114a13.f3634b) == null) {
                    return false;
                }
                if (string == null) {
                    string = "";
                }
                return ((Boolean) interfaceC1601c2.mo1h(new C1269g(string))).booleanValue();
            case R.id.accessibilityActionShowOnScreen:
                C1128o c1128oM2174l = c1128o.m2174l();
                if (c1128oM2174l != null) {
                    Object objM4272g13 = c1128oM2174l.f3711d.f3702d.m4272g(AbstractC1124k.f3679d);
                    if (objM4272g13 == null) {
                        objM4272g13 = null;
                    }
                    c1114a3 = (C1114a) objM4272g13;
                    while (c1128oM2174l != null && c1114a3 == null) {
                        c1128oM2174l = c1128oM2174l.m2174l();
                        if (c1128oM2174l != null) {
                            Object objM4272g14 = c1128oM2174l.f3711d.f3702d.m4272g(AbstractC1124k.f3679d);
                            if (objM4272g14 == null) {
                                objM4272g14 = null;
                            }
                            c1114a3 = (C1114a) objM4272g14;
                        }
                    }
                    if (c1128oM2174l == null) {
                        C2684c c2684cM2170g = c1128o.m2170g();
                        return viewTreeObserverOnGlobalLayoutListenerC0772y.requestRectangleOnScreen(new Rect((int) Math.floor(c2684cM2170g.f8558a), (int) Math.floor(c2684cM2170g.f8559b), AbstractC1784a.m3200N((float) Math.ceil(c2684cM2170g.f8560c)), AbstractC1784a.m3200N((float) Math.ceil(c2684cM2170g.f8561d))));
                    }
                    C2408E c2408e2 = c1128oM2174l.f3711d.f3702d;
                    C0564I c0564i2 = c1128oM2174l.f3710c;
                    C2684c c2684cM690c = AbstractC0435z.m690c(c0564i2.f1699J.f1893c);
                    InterfaceC0430v interfaceC0430vMo643n = c0564i2.f1699J.f1893c.mo643n();
                    C2684c c2684cM4658i = c2684cM690c.m4658i(interfaceC0430vMo643n != null ? ((AbstractC0596h0) interfaceC0430vMo643n).mo638R(0L) : 0L);
                    AbstractC0596h0 abstractC0596h0M2167d = c1128o.m2167d();
                    if (abstractC0596h0M2167d == null) {
                        jMo638R = 0;
                    } else {
                        if (!abstractC0596h0M2167d.mo981R0().f7199q) {
                            abstractC0596h0M2167d = null;
                        }
                        if (abstractC0596h0M2167d != null) {
                            jMo638R = abstractC0596h0M2167d.mo638R(0L);
                        }
                    }
                    AbstractC0596h0 abstractC0596h0M2167d2 = c1128o.m2167d();
                    C2684c c2684cM3425d = AbstractC1922d.m3425d(jMo638R, AbstractC1925g.m3523F(abstractC0596h0M2167d2 != null ? abstractC0596h0M2167d2.f1208f : 0L));
                    Object objM4272g15 = c2408e2.m4272g(AbstractC1132s.f3758u);
                    if (objM4272g15 == null) {
                        objM4272g15 = null;
                    }
                    Object objM4272g16 = c2408e2.m4272g(AbstractC1132s.f3759v);
                    float f5 = c2684cM3425d.f8558a - c2684cM4658i.f8558a;
                    float f6 = c2684cM3425d.f8560c - c2684cM4658i.f8560c;
                    if (Math.signum(f5) != Math.signum(f6)) {
                        f5 = 0.0f;
                    } else if (Math.abs(f5) >= Math.abs(f6)) {
                        f5 = f6;
                    }
                    if (c0564i.f1693D == enumC2017m) {
                        f5 = -f5;
                    }
                    float f7 = c2684cM3425d.f8559b - c2684cM4658i.f8559b;
                    float f8 = c2684cM3425d.f8561d - c2684cM4658i.f8561d;
                    return (c1114a3 == null || (interfaceC1603e = (InterfaceC1603e) c1114a3.f3634b) == null || !((Boolean) interfaceC1603e.mo0g(Float.valueOf(f5), Float.valueOf((Math.signum(f7) > Math.signum(f8) ? 1 : (Math.signum(f7) == Math.signum(f8) ? 0 : -1)) == 0 ? (Math.abs(f7) > Math.abs(f8) ? 1 : (Math.abs(f7) == Math.abs(f8) ? 0 : -1)) < 0 ? f7 : f8 : 0.0f))).booleanValue()) ? false : true;
                }
                c1114a3 = null;
                break;
            case R.id.accessibilityActionSetProgress:
                if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    return false;
                }
                Object objM4272g17 = c2408e.m4272g(AbstractC1124k.f3684i);
                C1114a c1114a14 = (C1114a) (objM4272g17 == null ? null : objM4272g17);
                if (c1114a14 == null || (interfaceC1601c3 = (InterfaceC1601c) c1114a14.f3634b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1601c3.mo1h(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
            case R.id.accessibilityActionImeEnter:
                Object objM4272g18 = c2408e.m4272g(AbstractC1124k.f3691p);
                C1114a c1114a15 = (C1114a) (objM4272g18 == null ? null : objM4272g18);
                if (c1114a15 == null || (interfaceC1599a12 = (InterfaceC1599a) c1114a15.f3634b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1599a12.mo6a()).booleanValue();
            default:
                switch (i6) {
                    case R.id.accessibilityActionScrollUp:
                    case R.id.accessibilityActionScrollLeft:
                    case R.id.accessibilityActionScrollDown:
                    case R.id.accessibilityActionScrollRight:
                        break;
                    default:
                        switch (i6) {
                            case R.id.accessibilityActionPageUp:
                                Object objM4272g19 = c2408e.m4272g(AbstractC1124k.f3700y);
                                C1114a c1114a16 = (C1114a) (objM4272g19 == null ? null : objM4272g19);
                                if (c1114a16 == null || (interfaceC1599a13 = (InterfaceC1599a) c1114a16.f3634b) == null) {
                                    return false;
                                }
                                return ((Boolean) interfaceC1599a13.mo6a()).booleanValue();
                            case R.id.accessibilityActionPageDown:
                                Object objM4272g20 = c2408e.m4272g(AbstractC1124k.f3673A);
                                C1114a c1114a17 = (C1114a) (objM4272g20 == null ? null : objM4272g20);
                                if (c1114a17 == null || (interfaceC1599a14 = (InterfaceC1599a) c1114a17.f3634b) == null) {
                                    return false;
                                }
                                return ((Boolean) interfaceC1599a14.mo6a()).booleanValue();
                            case R.id.accessibilityActionPageLeft:
                                Object objM4272g21 = c2408e.m4272g(AbstractC1124k.f3701z);
                                C1114a c1114a18 = (C1114a) (objM4272g21 == null ? null : objM4272g21);
                                if (c1114a18 == null || (interfaceC1599a15 = (InterfaceC1599a) c1114a18.f3634b) == null) {
                                    return false;
                                }
                                return ((Boolean) interfaceC1599a15.mo6a()).booleanValue();
                            case R.id.accessibilityActionPageRight:
                                Object objM4272g22 = c2408e.m4272g(AbstractC1124k.f3674B);
                                C1114a c1114a19 = (C1114a) (objM4272g22 == null ? null : objM4272g22);
                                if (c1114a19 == null || (interfaceC1599a16 = (InterfaceC1599a) c1114a19.f3634b) == null) {
                                    return false;
                                }
                                return ((Boolean) interfaceC1599a16.mo6a()).booleanValue();
                            default:
                                C2418O c2418o = (C2418O) viewOnAttachStateChangeListenerC0667E.f2143v.m4311g(i5);
                                if (c2418o == null || ((CharSequence) c2418o.m4311g(i6)) == null) {
                                    return false;
                                }
                                Object objM4272g23 = c2408e.m4272g(AbstractC1124k.f3699x);
                                List list = (List) (objM4272g23 == null ? null : objM4272g23);
                                if (list == null || list.size() <= 0) {
                                    return false;
                                }
                                list.get(0).getClass();
                                throw new ClassCastException();
                        }
                }
                break;
        }
        boolean z8 = i6 == 4096;
        boolean z9 = i6 == 8192;
        boolean z10 = i6 == 16908345;
        boolean z11 = i6 == 16908347;
        boolean z12 = i6 == 16908344;
        boolean z13 = i6 == 16908346;
        boolean z14 = z10 || z11 || z8 || z9;
        boolean z15 = z12 || z13 || z8 || z9;
        if (z8 || z9) {
            Object objM4272g24 = c2408e.m4272g(AbstractC1132s.f3740c);
            if (objM4272g24 == null) {
                objM4272g24 = null;
            }
            C1120g c1120g = (C1120g) objM4272g24;
            Object objM4272g25 = c2408e.m4272g(AbstractC1124k.f3684i);
            if (objM4272g25 == null) {
                objM4272g25 = null;
            }
            C1114a c1114a20 = (C1114a) objM4272g25;
            if (c1120g != null) {
                C1801a c1801a = c1120g.f3647b;
                if (c1114a20 != null) {
                    float f9 = c1801a.f6139a;
                    float f10 = ((f9 < 0.0f ? 0.0f : f9) - (0.0f > f9 ? f9 : 0.0f)) / 20;
                    if (z9) {
                        f10 = -f10;
                    }
                    InterfaceC1601c interfaceC1601c4 = (InterfaceC1601c) c1114a20.f3634b;
                    if (interfaceC1601c4 != null) {
                        return ((Boolean) interfaceC1601c4.mo1h(Float.valueOf(c1120g.f3646a + f10))).booleanValue();
                    }
                    return false;
                }
            }
        }
        long jM4652c = AbstractC0435z.m690c(c0564i.f1699J.f1893c).m4652c();
        ArrayList arrayList = new ArrayList();
        Object objM4272g26 = c2408e.m4272g(AbstractC1124k.f3675C);
        if (objM4272g26 == null) {
            objM4272g26 = null;
        }
        C1114a c1114a21 = (C1114a) objM4272g26;
        Float f11 = (c1114a21 == null || (interfaceC1601c = (InterfaceC1601c) c1114a21.f3634b) == null || !((Boolean) interfaceC1601c.mo1h(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
        Object objM4272g27 = c2408e.m4272g(AbstractC1124k.f3679d);
        if (objM4272g27 == null) {
            objM4272g27 = null;
        }
        C1114a c1114a22 = (C1114a) objM4272g27;
        if (c1114a22 == null) {
            return false;
        }
        InterfaceC0877c interfaceC0877c = c1114a22.f3634b;
        Object objM4272g28 = c2408e.m4272g(AbstractC1132s.f3758u);
        if (objM4272g28 == null) {
            objM4272g28 = null;
        }
        C1122i c1122i = (C1122i) objM4272g28;
        if (c1122i == null || !z14) {
            f2 = f11;
            z5 = z15;
        } else {
            if (f11 != null) {
                fIntBitsToFloat = f11.floatValue();
                f2 = f11;
                z5 = z15;
            } else {
                f2 = f11;
                z5 = z15;
                fIntBitsToFloat = Float.intBitsToFloat((int) (jM4652c >> 32));
            }
            if (z10 || z9) {
                fIntBitsToFloat = -fIntBitsToFloat;
            }
            if ((c0564i.f1693D == enumC2017m) && (z10 || z11)) {
                fIntBitsToFloat = -fIntBitsToFloat;
            }
            if (ViewOnAttachStateChangeListenerC0667E.m1134q(c1122i, fIntBitsToFloat)) {
                C1135v c1135v = AbstractC1124k.f3701z;
                if (!c2408e.m4268c(c1135v) && !c2408e.m4268c(AbstractC1124k.f3674B)) {
                    InterfaceC1603e interfaceC1603e2 = (InterfaceC1603e) interfaceC0877c;
                    if (interfaceC1603e2 != null) {
                        return ((Boolean) interfaceC1603e2.mo0g(Float.valueOf(fIntBitsToFloat), fValueOf)).booleanValue();
                    }
                    return false;
                }
                if (fIntBitsToFloat > 0.0f) {
                    Object objM4272g29 = c2408e.m4272g(AbstractC1124k.f3674B);
                    c1114a2 = (C1114a) (objM4272g29 == null ? null : objM4272g29);
                } else {
                    Object objM4272g30 = c2408e.m4272g(c1135v);
                    c1114a2 = (C1114a) (objM4272g30 == null ? null : objM4272g30);
                }
                if (c1114a2 == null || (interfaceC1599a6 = (InterfaceC1599a) c1114a2.f3634b) == null) {
                    return false;
                }
                return ((Boolean) interfaceC1599a6.mo6a()).booleanValue();
            }
        }
        Object objM4272g31 = c2408e.m4272g(AbstractC1132s.f3759v);
        if (objM4272g31 == null) {
            objM4272g31 = null;
        }
        C1122i c1122i2 = (C1122i) objM4272g31;
        if (c1122i2 == null || !z5) {
            return false;
        }
        float fFloatValue = f2 != null ? f2.floatValue() : Float.intBitsToFloat((int) (4294967295L & jM4652c));
        if (z12 || z9) {
            fFloatValue = -fFloatValue;
        }
        if (!ViewOnAttachStateChangeListenerC0667E.m1134q(c1122i2, fFloatValue)) {
            return false;
        }
        C1135v c1135v2 = AbstractC1124k.f3700y;
        if (!c2408e.m4268c(c1135v2) && !c2408e.m4268c(AbstractC1124k.f3673A)) {
            InterfaceC1603e interfaceC1603e3 = (InterfaceC1603e) interfaceC0877c;
            if (interfaceC1603e3 != null) {
                return ((Boolean) interfaceC1603e3.mo0g(fValueOf, Float.valueOf(fFloatValue))).booleanValue();
            }
            return false;
        }
        if (fFloatValue > 0.0f) {
            Object objM4272g32 = c2408e.m4272g(AbstractC1124k.f3673A);
            c1114a = (C1114a) (objM4272g32 == null ? null : objM4272g32);
        } else {
            Object objM4272g33 = c2408e.m4272g(c1135v2);
            c1114a = (C1114a) (objM4272g33 == null ? null : objM4272g33);
        }
        if (c1114a == null || (interfaceC1599a5 = (InterfaceC1599a) c1114a.f3634b) == null) {
            return false;
        }
        return ((Boolean) interfaceC1599a5.mo6a()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121Y1.C1753n
    /* JADX INFO: renamed from: y */
    public final void mo1323y(int i5, C3175g c3175g, String str, Bundle bundle) {
        this.f2515f.m1145c(i5, c3175g, str, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:630:0x0387 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:636:0x03ee */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:643:0x0455 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x080c A[LOOP:9: B:396:0x07ef->B:407:0x080c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0a96  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0aa9  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0c0d  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0c29  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0c55  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0812 A[EDGE_INSN: B:653:0x0812->B:409:0x0812 BREAK  A[LOOP:9: B:396:0x07ef->B:407:0x080c], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v61, types: [L2.u] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v75, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v76, types: [java.util.ArrayList] */
    @Override // p121Y1.C1753n
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3175g mo1324z(int i5) {
        C3175g c3175g;
        AccessibilityManager accessibilityManager;
        C2418O c2418o;
        C1121h c1121h;
        ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E;
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y;
        C2437s c2437s;
        C1125l c1125l;
        C0564I c0564i;
        Resources resources;
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        C1121h c1121h2;
        int i6;
        int i7;
        ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E2;
        boolean z5;
        C1114a c1114a;
        C1114a c1114a2;
        C1114a c1114a3;
        String strM1133m;
        ArrayList arrayList;
        CharSequence charSequenceM5451e;
        C1120g c1120g;
        int i8;
        C1122i c1122i;
        C1122i c1122i2;
        int iM4331d;
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y2;
        Bundle bundle;
        int iM4331d2;
        String str;
        AbstractC2218i abstractC2218iM1194p;
        Object objM4272g;
        Object objM4272g2;
        C0564I c0564i2;
        boolean zM2981a;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean zBooleanValue;
        ?? arrayList2;
        ?? arrayList3;
        int i9;
        boolean zM2981a2;
        C1128o c1128o;
        int i10;
        C3175g c3175g2;
        AbstractC0142o lifecycle;
        Float fValueOf = Float.valueOf(0.0f);
        ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E3 = this.f2515f;
        AccessibilityManager accessibilityManager2 = viewOnAttachStateChangeListenerC0667E3.f2131j;
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y3 = viewOnAttachStateChangeListenerC0667E3.f2128g;
        C0752o viewTreeOwners = viewTreeObserverOnGlobalLayoutListenerC0772y3.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycle = viewTreeOwners.f2337a.getLifecycle()) == null) ? null : ((C0147t) lifecycle).f541c) == EnumC0141n.f531d) {
            c3175g2 = !accessibilityManager2.isEnabled() ? new C3175g(AccessibilityNodeInfo.obtain()) : null;
            i7 = i5;
            c3175g = c3175g2;
            viewOnAttachStateChangeListenerC0667E2 = viewOnAttachStateChangeListenerC0667E3;
        } else {
            C1129p c1129p = (C1129p) viewOnAttachStateChangeListenerC0667E3.m1154l().m4318b(i5);
            if (c1129p == null) {
                if (!accessibilityManager2.isEnabled()) {
                    c3175g2 = new C3175g(AccessibilityNodeInfo.obtain());
                }
                i7 = i5;
                c3175g = c3175g2;
                viewOnAttachStateChangeListenerC0667E2 = viewOnAttachStateChangeListenerC0667E3;
            } else {
                C1128o c1128o2 = c1129p.f3715a;
                C1125l c1125lM2173k = c1128o2.m2173k();
                C0564I c0564i3 = c1128o2.f3710c;
                Object objM4272g3 = c1125lM2173k.f3702d.m4272g(AbstractC1132s.f3751n);
                if (objM4272g3 == null) {
                    objM4272g3 = null;
                }
                boolean zM2981a3 = AbstractC1665j.m2981a(objM4272g3, Boolean.TRUE);
                if (!zM2981a3) {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    c3175g = new C3175g(accessibilityNodeInfoObtain);
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 34) {
                        AbstractC3170b.m5438g(accessibilityNodeInfoObtain, zM2981a3);
                    } else {
                        c3175g.m5452f(64, zM2981a3);
                    }
                    if (i5 == -1) {
                        Object parentForAccessibility = viewTreeObserverOnGlobalLayoutListenerC0772y3.getParentForAccessibility();
                        View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                        c3175g.f9932b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        C1128o c1128oM2174l = c1128o2.m2174l();
                        Integer numValueOf = c1128oM2174l != null ? Integer.valueOf(c1128oM2174l.f3714g) : null;
                        if (numValueOf == null) {
                            AbstractC0277a.m484c("semanticsNode " + i5 + " has null parent");
                            throw new C0330q();
                        }
                        int iIntValue = numValueOf.intValue();
                        if (iIntValue == viewTreeObserverOnGlobalLayoutListenerC0772y3.getSemanticsOwner().m2180a().f3714g) {
                            iIntValue = -1;
                        }
                        c3175g.f9932b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(viewTreeObserverOnGlobalLayoutListenerC0772y3, iIntValue);
                    }
                    c3175g.f9933c = i5;
                    accessibilityNodeInfoObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC0772y3, i5);
                    accessibilityNodeInfoObtain.setBoundsInScreen(viewOnAttachStateChangeListenerC0667E3.m1146d(c1129p));
                    C2437s c2437s2 = viewOnAttachStateChangeListenerC0667E3.f2124N;
                    C2418O c2418o2 = viewOnAttachStateChangeListenerC0667E3.f2144w;
                    Resources resources2 = viewTreeObserverOnGlobalLayoutListenerC0772y3.getContext().getResources();
                    c3175g.m5453g("android.view.View");
                    C1125l c1125l2 = c1128o2.f3711d;
                    C2408E c2408e = c1125l2.f3702d;
                    if (c2408e.m4268c(AbstractC1132s.f3727F)) {
                        c3175g.m5453g("android.widget.EditText");
                    }
                    if (c2408e.m4268c(AbstractC1132s.f3723B)) {
                        c3175g.m5453g("android.widget.TextView");
                    }
                    Object objM4272g4 = c2408e.m4272g(AbstractC1132s.f3762y);
                    if (objM4272g4 == null) {
                        objM4272g4 = null;
                    }
                    C1121h c1121h3 = (C1121h) objM4272g4;
                    if (c1121h3 != null) {
                        int i12 = c1121h3.f3648a;
                        accessibilityManager = accessibilityManager2;
                        if (c1128o2.f3712e) {
                            i10 = 4;
                            c2418o = c2418o2;
                        } else {
                            i10 = 4;
                            c2418o = c2418o2;
                            if (C1128o.m2163j(4, c1128o2).isEmpty()) {
                            }
                        }
                        if (i12 == i10) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(me.dartcv.nuke.R.string.tab));
                        } else if (i12 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(me.dartcv.nuke.R.string.switch_role));
                        } else {
                            String strM1196r = AbstractC0681L.m1196r(i12);
                            if (i12 != 5 || c1128o2.m2177o() || c1125l2.f3704f) {
                                c3175g.m5453g(strM1196r);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        c2418o = c2418o2;
                    }
                    accessibilityNodeInfoObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC0772y3.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(AbstractC1131r.m2187f(c1128o2));
                    boolean zM5436e = i11 >= 34 ? AbstractC3170b.m5436e(accessibilityManager) : true;
                    List listM2163j = C1128o.m2163j(4, c1128o2);
                    int size = listM2163j.size();
                    boolean z9 = zM5436e;
                    int i13 = 0;
                    int i14 = 0;
                    while (i14 < size) {
                        List list = listM2163j;
                        C1128o c1128o3 = (C1128o) listM2163j.get(i14);
                        int i15 = size;
                        AbstractC2428j abstractC2428jM1154l = viewOnAttachStateChangeListenerC0667E3.m1154l();
                        int i16 = i14;
                        int i17 = c1128o3.f3714g;
                        if (abstractC2428jM1154l.m4317a(i17)) {
                            AbstractC2218i abstractC2218i = viewTreeObserverOnGlobalLayoutListenerC0772y3.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(c1128o3.f3710c);
                            if (i17 != -1) {
                                if (abstractC2218i != null) {
                                    accessibilityNodeInfoObtain.addChild(abstractC2218i);
                                } else {
                                    C1129p c1129p2 = (C1129p) viewOnAttachStateChangeListenerC0667E3.m1154l().m4318b(i17);
                                    if (c1129p2 == null || (c1128o = c1129p2.f3715a) == null) {
                                        zM2981a2 = false;
                                    } else {
                                        Object objM4272g5 = c1128o.m2173k().f3702d.m4272g(AbstractC1132s.f3751n);
                                        if (objM4272g5 == null) {
                                            objM4272g5 = null;
                                        }
                                        zM2981a2 = AbstractC1665j.m2981a(objM4272g5, Boolean.TRUE);
                                    }
                                    if (z9 || !zM2981a2) {
                                        accessibilityNodeInfoObtain.addChild(viewTreeObserverOnGlobalLayoutListenerC0772y3, i17);
                                    }
                                }
                                c2437s2.m4333f(i17, i13);
                                i13++;
                            }
                        }
                        i14 = i16 + 1;
                        size = i15;
                        listM2163j = list;
                    }
                    int i18 = viewOnAttachStateChangeListenerC0667E3.f2136o;
                    AccessibilityNodeInfo accessibilityNodeInfo4 = c3175g.f9931a;
                    if (i5 == i18) {
                        accessibilityNodeInfo4.setAccessibilityFocused(true);
                        c3175g.m5448a(C3172d.f9922d);
                    } else {
                        accessibilityNodeInfo4.setAccessibilityFocused(false);
                        c3175g.m5448a(C3172d.f9921c);
                    }
                    C1269g c1269gM1187i = AbstractC0681L.m1187i(c1128o2);
                    if (c1269gM1187i != null) {
                        viewTreeObserverOnGlobalLayoutListenerC0772y3.getFontFamilyResolver();
                        InterfaceC2007c density = viewTreeObserverOnGlobalLayoutListenerC0772y3.getDensity();
                        C0072l0 c0072l0 = viewOnAttachStateChangeListenerC0667E3.f2120J;
                        viewTreeObserverOnGlobalLayoutListenerC0772y = viewTreeObserverOnGlobalLayoutListenerC0772y3;
                        String str2 = c1269gM1187i.f4563e;
                        c0564i = c0564i3;
                        List list2 = c1269gM1187i.f4562d;
                        SpannableString spannableString2 = new SpannableString(str2);
                        ArrayList arrayList4 = c1269gM1187i.f4564f;
                        if (arrayList4 != null) {
                            int size2 = arrayList4.size();
                            viewOnAttachStateChangeListenerC0667E = viewOnAttachStateChangeListenerC0667E3;
                            int i19 = 0;
                            while (i19 < size2) {
                                ArrayList arrayList5 = arrayList4;
                                C1267e c1267e = (C1267e) arrayList4.get(i19);
                                int i20 = i19;
                                C1252E c1252e = (C1252E) c1267e.f4557a;
                                int i21 = size2;
                                int i22 = c1267e.f4558b;
                                int i23 = c1267e.f4559c;
                                C2437s c2437s3 = c2437s2;
                                C1125l c1125l3 = c1125l2;
                                long jMo3620b = c1252e.f4494a.mo3620b();
                                Resources resources3 = resources2;
                                AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfoObtain;
                                long j5 = c1252e.f4495b;
                                C1587l c1587l = c1252e.f4496c;
                                C1585j c1585j = c1252e.f4497d;
                                C1966p c1966p = c1252e.f4503j;
                                C1781b c1781b = c1252e.f4504k;
                                C1121h c1121h4 = c1121h3;
                                AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo4;
                                long j6 = c1252e.f4505l;
                                C1962l c1962l = c1252e.f4506m;
                                InterfaceC1965o interfaceC1965o = c1252e.f4494a;
                                AbstractC0797o.m1373A(spannableString2, (C2762u.m4921c(jMo3620b, interfaceC1965o.mo3620b()) ? interfaceC1965o : jMo3620b != 16 ? new C1953c(jMo3620b) : C1964n.f6645a).mo3620b(), i22, i23);
                                SpannableString spannableString3 = spannableString2;
                                AbstractC0797o.m1374B(spannableString3, j5, density, i22, i23);
                                if (c1587l == null && c1585j == null) {
                                    i9 = 33;
                                } else {
                                    i9 = 33;
                                    spannableString3.setSpan(new StyleSpan(AbstractC1785a.m3251l(c1587l == null ? C1587l.f5502f : c1587l, c1585j != null ? c1585j.f5499a : 0)), i22, i23, 33);
                                }
                                if (c1962l != null) {
                                    int i24 = c1962l.f6643a;
                                    if ((i24 | 1) == i24) {
                                        spannableString3.setSpan(new UnderlineSpan(), i22, i23, i9);
                                    }
                                    if ((i24 | 2) == i24) {
                                        spannableString3.setSpan(new StrikethroughSpan(), i22, i23, i9);
                                    }
                                }
                                if (c1966p != null) {
                                    spannableString3.setSpan(new ScaleXSpan(c1966p.f6647a), i22, i23, i9);
                                }
                                AbstractC0797o.m1375C(spannableString3, c1781b, i22, i23);
                                if (j6 != 16) {
                                    spannableString3.setSpan(new BackgroundColorSpan(AbstractC2767z.m4952w(j6)), i22, i23, i9);
                                }
                                i19 = i20 + 1;
                                spannableString2 = spannableString3;
                                arrayList4 = arrayList5;
                                size2 = i21;
                                c2437s2 = c2437s3;
                                c1125l2 = c1125l3;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo5;
                                resources2 = resources3;
                                c1121h3 = c1121h4;
                                accessibilityNodeInfo4 = accessibilityNodeInfo6;
                            }
                        } else {
                            viewOnAttachStateChangeListenerC0667E = viewOnAttachStateChangeListenerC0667E3;
                        }
                        c1121h = c1121h3;
                        AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfo4;
                        c2437s = c2437s2;
                        c1125l = c1125l2;
                        SpannableString spannableString4 = spannableString2;
                        resources = resources2;
                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                        int length = str2.length();
                        ?? arrayList6 = C0981u.f3047d;
                        if (list2 != null) {
                            arrayList2 = new ArrayList(list2.size());
                            int size3 = list2.size();
                            for (int i25 = 0; i25 < size3; i25++) {
                                Object obj = list2.get(i25);
                                C1267e c1267e2 = (C1267e) obj;
                                if ((c1267e2.f4557a instanceof C1262O) && AbstractC1270h.m2357b(0, length, c1267e2.f4558b, c1267e2.f4559c)) {
                                    arrayList2.add(obj);
                                }
                            }
                        } else {
                            arrayList2 = arrayList6;
                        }
                        int size4 = arrayList2.size();
                        for (int i26 = 0; i26 < size4; i26++) {
                            C1267e c1267e3 = (C1267e) arrayList2.get(i26);
                            C1262O c1262o = (C1262O) c1267e3.f4557a;
                            int i27 = c1267e3.f4558b;
                            int i28 = c1267e3.f4559c;
                            if (!(c1262o instanceof C1262O)) {
                                throw new C0330q();
                            }
                            spannableString4.setSpan(new TtsSpan.VerbatimBuilder(c1262o.f4544a).build(), i27, i28, 33);
                        }
                        int length2 = str2.length();
                        if (list2 != null) {
                            arrayList3 = new ArrayList(list2.size());
                            int size5 = list2.size();
                            for (int i29 = 0; i29 < size5; i29++) {
                                Object obj2 = list2.get(i29);
                                C1267e c1267e4 = (C1267e) obj2;
                                if ((c1267e4.f4557a instanceof C1261N) && AbstractC1270h.m2357b(0, length2, c1267e4.f4558b, c1267e4.f4559c)) {
                                    arrayList3.add(obj2);
                                }
                            }
                        } else {
                            arrayList3 = arrayList6;
                        }
                        int size6 = arrayList3.size();
                        for (int i30 = 0; i30 < size6; i30++) {
                            C1267e c1267e5 = (C1267e) arrayList3.get(i30);
                            C1261N c1261n = (C1261N) c1267e5.f4557a;
                            int i31 = c1267e5.f4558b;
                            int i32 = c1267e5.f4559c;
                            WeakHashMap weakHashMap = (WeakHashMap) c0072l0.f307e;
                            Object uRLSpan = weakHashMap.get(c1261n);
                            if (uRLSpan == null) {
                                uRLSpan = new URLSpan(c1261n.f4543a);
                                weakHashMap.put(c1261n, uRLSpan);
                            }
                            spannableString4.setSpan((URLSpan) uRLSpan, i31, i32, 33);
                        }
                        int length3 = str2.length();
                        if (list2 != null) {
                            arrayList6 = new ArrayList(list2.size());
                            int size7 = list2.size();
                            for (int i33 = 0; i33 < size7; i33++) {
                                Object obj3 = list2.get(i33);
                                C1267e c1267e6 = (C1267e) obj3;
                                if ((c1267e6.f4557a instanceof AbstractC1275m) && AbstractC1270h.m2357b(0, length3, c1267e6.f4558b, c1267e6.f4559c)) {
                                    arrayList6.add(obj3);
                                }
                            }
                        }
                        int size8 = arrayList6.size();
                        for (int i34 = 0; i34 < size8; i34++) {
                            C1267e c1267e7 = (C1267e) arrayList6.get(i34);
                            int i35 = c1267e7.f4558b;
                            Object obj4 = c1267e7.f4557a;
                            int i36 = c1267e7.f4559c;
                            if (i35 != i36) {
                                AbstractC1275m abstractC1275m = (AbstractC1275m) obj4;
                                if (abstractC1275m instanceof C1274l) {
                                    AbstractC1665j.m2983c(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                    C1274l c1274l = (C1274l) obj4;
                                    C1267e c1267e8 = new C1267e(i35, i36, c1274l);
                                    WeakHashMap weakHashMap2 = (WeakHashMap) c0072l0.f308f;
                                    Object uRLSpan2 = weakHashMap2.get(c1267e8);
                                    if (uRLSpan2 == null) {
                                        uRLSpan2 = new URLSpan(c1274l.f4578a);
                                        weakHashMap2.put(c1267e8, uRLSpan2);
                                    }
                                    spannableString4.setSpan((URLSpan) uRLSpan2, i35, i36, 33);
                                } else {
                                    WeakHashMap weakHashMap3 = (WeakHashMap) c0072l0.f309g;
                                    Object c1794g = weakHashMap3.get(c1267e7);
                                    if (c1794g == null) {
                                        c1794g = new C1794g(abstractC1275m);
                                        weakHashMap3.put(c1267e7, c1794g);
                                    }
                                    spannableString4.setSpan((ClickableSpan) c1794g, i35, i36, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) ViewOnAttachStateChangeListenerC0667E.m1132I(spannableString4);
                        accessibilityNodeInfo2 = accessibilityNodeInfo7;
                    } else {
                        c1121h = c1121h3;
                        viewOnAttachStateChangeListenerC0667E = viewOnAttachStateChangeListenerC0667E3;
                        viewTreeObserverOnGlobalLayoutListenerC0772y = viewTreeObserverOnGlobalLayoutListenerC0772y3;
                        c2437s = c2437s2;
                        c1125l = c1125l2;
                        c0564i = c0564i3;
                        resources = resources2;
                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                        accessibilityNodeInfo2 = accessibilityNodeInfo4;
                        spannableString = null;
                    }
                    accessibilityNodeInfo2.setText(spannableString);
                    C1135v c1135v = AbstractC1132s.f3733L;
                    if (c2408e.m4268c(c1135v)) {
                        accessibilityNodeInfo3 = accessibilityNodeInfo;
                        accessibilityNodeInfo3.setContentInvalid(true);
                        Object objM4272g6 = c2408e.m4272g(c1135v);
                        if (objM4272g6 == null) {
                            objM4272g6 = null;
                        }
                        accessibilityNodeInfo3.setError((CharSequence) objM4272g6);
                    } else {
                        accessibilityNodeInfo3 = accessibilityNodeInfo;
                    }
                    Resources resources4 = resources;
                    String strM1186h = AbstractC0681L.m1186h(c1128o2, resources4);
                    if (Build.VERSION.SDK_INT >= 30) {
                        AbstractC0956b.m1970h(accessibilityNodeInfo2, strM1186h);
                    } else {
                        accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strM1186h);
                    }
                    accessibilityNodeInfo3.setCheckable(AbstractC0681L.m1185g(c1128o2));
                    Object objM4272g7 = c2408e.m4272g(AbstractC1132s.f3731J);
                    if (objM4272g7 == null) {
                        objM4272g7 = null;
                    }
                    EnumC1190a enumC1190a = (EnumC1190a) objM4272g7;
                    if (enumC1190a != null) {
                        if (enumC1190a == EnumC1190a.f3906d) {
                            accessibilityNodeInfo2.setChecked(true);
                        } else if (enumC1190a == EnumC1190a.f3907e) {
                            accessibilityNodeInfo2.setChecked(false);
                        }
                    }
                    Object objM4272g8 = c2408e.m4272g(AbstractC1132s.f3730I);
                    if (objM4272g8 == null) {
                        objM4272g8 = null;
                    }
                    Boolean bool = (Boolean) objM4272g8;
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        if (c1121h == null) {
                            c1121h2 = c1121h;
                            i6 = 4;
                        } else {
                            c1121h2 = c1121h;
                            i6 = 4;
                            if (c1121h2.f3648a == 4) {
                                accessibilityNodeInfo3.setSelected(zBooleanValue2);
                            }
                        }
                        accessibilityNodeInfo2.setChecked(zBooleanValue2);
                    } else {
                        c1121h2 = c1121h;
                        i6 = 4;
                    }
                    C1125l c1125l4 = c1125l;
                    if (!c1125l4.f3704f || C1128o.m2163j(i6, c1128o2).isEmpty()) {
                        Object objM4272g9 = c2408e.m4272g(AbstractC1132s.f3738a);
                        if (objM4272g9 == null) {
                            objM4272g9 = null;
                        }
                        List list3 = (List) objM4272g9;
                        accessibilityNodeInfo3.setContentDescription(list3 != null ? (String) AbstractC0973m.m2013T(list3) : null);
                    }
                    Object objM4272g10 = c2408e.m4272g(AbstractC1132s.f3763z);
                    if (objM4272g10 == null) {
                        objM4272g10 = null;
                    }
                    String str3 = (String) objM4272g10;
                    if (str3 != null) {
                        C1128o c1128oM2174l2 = c1128o2;
                        while (true) {
                            if (c1128oM2174l2 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            C1125l c1125l5 = c1128oM2174l2.f3711d;
                            C1135v c1135v2 = AbstractC1133t.f3764a;
                            if (c1125l5.f3702d.m4268c(c1135v2)) {
                                zBooleanValue = ((Boolean) c1125l5.m2160c(c1135v2)).booleanValue();
                                break;
                            }
                            c1128oM2174l2 = c1128oM2174l2.m2174l();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo3.setViewIdResourceName(str3);
                        }
                    }
                    Object objM4272g11 = c2408e.m4272g(AbstractC1132s.f3745h);
                    if (objM4272g11 == null) {
                        objM4272g11 = null;
                    }
                    if (((C0891q) objM4272g11) != null) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo2.setHeading(true);
                        } else {
                            c3175g.m5452f(2, true);
                        }
                    }
                    i7 = i5;
                    if (i7 != -1) {
                        int iM4331d3 = c2437s.m4331d(c1128o2.f3714g);
                        if (iM4331d3 != -1) {
                            accessibilityNodeInfo3.setDrawingOrder(iM4331d3);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    accessibilityNodeInfo3.setPassword(c2408e.m4268c(AbstractC1132s.f3732K));
                    accessibilityNodeInfo3.setEditable(c2408e.m4268c(AbstractC1132s.f3735N));
                    Object objM4272g12 = c2408e.m4272g(AbstractC1132s.f3736O);
                    if (objM4272g12 == null) {
                        objM4272g12 = null;
                    }
                    Integer num = (Integer) objM4272g12;
                    accessibilityNodeInfo3.setMaxTextLength(num != null ? num.intValue() : -1);
                    accessibilityNodeInfo3.setEnabled(AbstractC0681L.m1180b(c1128o2));
                    C1135v c1135v3 = AbstractC1132s.f3748k;
                    accessibilityNodeInfo3.setFocusable(c2408e.m4268c(c1135v3));
                    if (accessibilityNodeInfo3.isFocusable()) {
                        accessibilityNodeInfo3.setFocused(((Boolean) c1125l4.m2160c(c1135v3)).booleanValue());
                        if (accessibilityNodeInfo3.isFocused()) {
                            accessibilityNodeInfo2.addAction(2);
                            viewOnAttachStateChangeListenerC0667E2 = viewOnAttachStateChangeListenerC0667E;
                            viewOnAttachStateChangeListenerC0667E2.f2137p = i7;
                        } else {
                            viewOnAttachStateChangeListenerC0667E2 = viewOnAttachStateChangeListenerC0667E;
                            z5 = true;
                            accessibilityNodeInfo2.addAction(1);
                            accessibilityNodeInfo2.setVisibleToUser(AbstractC1131r.m2186e(c1128o2) ^ z5);
                            AbstractC0231b.m408s(AbstractC1131r.m2185d(c1125l4, AbstractC1132s.f3747j));
                            accessibilityNodeInfo2.setClickable(false);
                            c1114a = (C1114a) AbstractC1131r.m2185d(c1125l4, AbstractC1124k.f3677b);
                            if (c1114a != null) {
                                boolean zM2981a4 = AbstractC1665j.m2981a(AbstractC1131r.m2185d(c1125l4, AbstractC1132s.f3730I), Boolean.TRUE);
                                if (c1121h2 != null && c1121h2.f3648a == 4) {
                                    z8 = true;
                                    accessibilityNodeInfo2.setClickable(z8 || (z8 && !zM2981a4));
                                    if (AbstractC0681L.m1180b(c1128o2) && accessibilityNodeInfo3.isClickable()) {
                                        c3175g.m5448a(new C3172d(c1114a.f3633a, 16));
                                    }
                                } else {
                                    if (!(c1121h2 != null && c1121h2.f3648a == 3)) {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        accessibilityNodeInfo2.setClickable(z8 || (z8 && !zM2981a4));
                                        if (AbstractC0681L.m1180b(c1128o2)) {
                                            c3175g.m5448a(new C3172d(c1114a.f3633a, 16));
                                        }
                                    }
                                }
                            }
                            accessibilityNodeInfo2.setLongClickable(false);
                            c1114a2 = (C1114a) AbstractC1131r.m2185d(c1125l4, AbstractC1124k.f3678c);
                            if (c1114a2 != null) {
                                accessibilityNodeInfo2.setLongClickable(true);
                                if (AbstractC0681L.m1180b(c1128o2)) {
                                    c3175g.m5448a(new C3172d(c1114a2.f3633a, 32));
                                }
                            }
                            c1114a3 = (C1114a) AbstractC1131r.m2185d(c1125l4, AbstractC1124k.f3692q);
                            if (c1114a3 != null) {
                                c3175g.m5448a(new C3172d(c1114a3.f3633a, 16384));
                            }
                            if (AbstractC0681L.m1180b(c1128o2)) {
                                C1114a c1114a4 = (C1114a) AbstractC1131r.m2185d(c1125l4, AbstractC1124k.f3686k);
                                if (c1114a4 != null) {
                                    c3175g.m5448a(new C3172d(c1114a4.f3633a, 2097152));
                                }
                                C1114a c1114a5 = (C1114a) AbstractC1131r.m2185d(c1125l4, AbstractC1124k.f3691p);
                                if (c1114a5 != null) {
                                    c3175g.m5448a(new C3172d(c1114a5.f3633a, R.id.accessibilityActionImeEnter));
                                }
                                C1114a c1114a6 = (C1114a) AbstractC1131r.m2185d(c1125l4, AbstractC1124k.f3693r);
                                if (c1114a6 != null) {
                                    c3175g.m5448a(new C3172d(c1114a6.f3633a, 65536));
                                }
                                C1114a c1114a7 = (C1114a) AbstractC1131r.m2185d(c1125l4, AbstractC1124k.f3694s);
                                if (c1114a7 != null && accessibilityNodeInfo3.isFocused()) {
                                    ClipDescription primaryClipDescription = viewTreeObserverOnGlobalLayoutListenerC0772y.m5898getClipboardManager().f2315a.getPrimaryClipDescription();
                                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                        c3175g.m5448a(new C3172d(c1114a7.f3633a, 32768));
                                    }
                                }
                            }
                            strM1133m = ViewOnAttachStateChangeListenerC0667E.m1133m(c1128o2);
                            if (!(strM1133m != null || strM1133m.length() == 0)) {
                                accessibilityNodeInfo3.setTextSelection(viewOnAttachStateChangeListenerC0667E2.m1153k(c1128o2), viewOnAttachStateChangeListenerC0667E2.m1152j(c1128o2));
                                C1114a c1114a8 = (C1114a) AbstractC1131r.m2185d(c1125l4, AbstractC1124k.f3685j);
                                c3175g.m5448a(new C3172d(c1114a8 != null ? c1114a8.f3633a : null, 131072));
                                accessibilityNodeInfo2.addAction(256);
                                accessibilityNodeInfo2.addAction(512);
                                accessibilityNodeInfo2.setMovementGranularities(11);
                                List list4 = (List) AbstractC1131r.m2185d(c1125l4, AbstractC1132s.f3738a);
                                if ((list4 == null || list4.isEmpty()) && c2408e.m4268c(AbstractC1124k.f3676a)) {
                                    if (!c2408e.m4268c(AbstractC1132s.f3727F) || AbstractC1665j.m2981a(AbstractC1131r.m2185d(c1125l4, c1135v3), Boolean.TRUE)) {
                                        C0564I c0564iM839u = c0564i.m839u();
                                        while (true) {
                                            if (c0564iM839u == null) {
                                                c0564iM839u = null;
                                                break;
                                            }
                                            C1125l c1125lM841w = c0564iM839u.m841w();
                                            if (c1125lM841w == null || !c1125lM841w.f3704f) {
                                                z6 = false;
                                                if (!z6) {
                                                    break;
                                                }
                                                c0564iM839u = c0564iM839u.m839u();
                                            } else {
                                                if (c1125lM841w.f3702d.m4268c(AbstractC1132s.f3727F)) {
                                                    z6 = true;
                                                }
                                                if (!z6) {
                                                }
                                            }
                                        }
                                        if (c0564iM839u != null) {
                                            C1125l c1125lM841w2 = c0564iM839u.m841w();
                                            if (c1125lM841w2 != null) {
                                                Object objM4272g13 = c1125lM841w2.f3702d.m4272g(c1135v3);
                                                if (objM4272g13 == null) {
                                                    objM4272g13 = null;
                                                }
                                                zM2981a = AbstractC1665j.m2981a(objM4272g13, Boolean.TRUE);
                                            } else {
                                                zM2981a = false;
                                            }
                                            z7 = zM2981a ? false : true;
                                            if (!z7) {
                                                accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                            }
                                        }
                                        if (!z7) {
                                        }
                                    }
                                }
                            }
                            arrayList = new ArrayList();
                            arrayList.add("androidx.compose.ui.semantics.id");
                            charSequenceM5451e = c3175g.m5451e();
                            if (!(charSequenceM5451e != null || charSequenceM5451e.length() == 0) && c2408e.m4268c(AbstractC1124k.f3676a)) {
                                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (c2408e.m4268c(AbstractC1132s.f3763z)) {
                                arrayList.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (c2408e.m4268c(AbstractC1132s.f3737P)) {
                                arrayList.add("androidx.compose.ui.semantics.shapeType");
                                arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            c1125l4.getClass();
                            accessibilityNodeInfo2.setAvailableExtraData(arrayList);
                            c1120g = (C1120g) AbstractC1131r.m2185d(c1128o2.m2175m(), AbstractC1132s.f3740c);
                            if (c1120g != null) {
                                float f2 = c1120g.f3646a;
                                C1125l c1125lM2175m = c1128o2.m2175m();
                                C1135v c1135v4 = AbstractC1124k.f3684i;
                                if (c1125lM2175m.f3702d.m4268c(c1135v4)) {
                                    c3175g.m5453g("android.widget.SeekBar");
                                } else {
                                    c3175g.m5453g("android.widget.ProgressBar");
                                }
                                C1120g c1120g2 = C1120g.f3645c;
                                if (c1120g != C1120g.f3645c) {
                                    c1120g.m2158a().getClass();
                                    accessibilityNodeInfo2.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new C1616e(AccessibilityNodeInfo.RangeInfo.obtain(1, fValueOf.floatValue(), Float.valueOf(c1120g.m2158a().f6139a).floatValue(), f2)).f5559a);
                                }
                                if (c1128o2.m2175m().f3702d.m4268c(c1135v4) && AbstractC0681L.m1180b(c1128o2)) {
                                    float fFloatValue = Float.valueOf(c1120g.m2158a().f6139a).floatValue();
                                    c1120g.m2158a().getClass();
                                    float fFloatValue2 = fValueOf.floatValue();
                                    if (fFloatValue < fFloatValue2) {
                                        fFloatValue = fFloatValue2;
                                    }
                                    if (f2 < fFloatValue) {
                                        c3175g.m5448a(C3172d.f9923e);
                                    }
                                    c1120g.m2158a().getClass();
                                    float fFloatValue3 = fValueOf.floatValue();
                                    float fFloatValue4 = Float.valueOf(c1120g.m2158a().f6139a).floatValue();
                                    if (fFloatValue3 > fFloatValue4) {
                                        fFloatValue3 = fFloatValue4;
                                    }
                                    if (f2 > fFloatValue3) {
                                        c3175g.m5448a(C3172d.f9924f);
                                    }
                                }
                            }
                            i8 = Build.VERSION.SDK_INT;
                            if (AbstractC0681L.m1180b(c1128o2)) {
                                Object objM4272g14 = c1128o2.f3711d.f3702d.m4272g(AbstractC1124k.f3684i);
                                if (objM4272g14 == null) {
                                    objM4272g14 = null;
                                }
                                C1114a c1114a9 = (C1114a) objM4272g14;
                                if (c1114a9 != null) {
                                    c3175g.m5448a(new C3172d(null, R.id.accessibilityActionSetProgress, c1114a9.f3633a, null));
                                }
                            }
                            AbstractC1924f.m3509w(c1128o2, c3175g);
                            AbstractC1924f.m3510x(c1128o2, c3175g);
                            c1122i = (C1122i) AbstractC1131r.m2185d(c1128o2.m2175m(), AbstractC1132s.f3758u);
                            C1114a c1114a10 = (C1114a) AbstractC1131r.m2185d(c1128o2.m2175m(), AbstractC1124k.f3679d);
                            if (c1122i != null && c1114a10 != null) {
                                objM4272g2 = c1128o2.m2173k().f3702d.m4272g(AbstractC1132s.f3743f);
                                if (objM4272g2 == null) {
                                    objM4272g2 = null;
                                }
                                if (objM4272g2 != null) {
                                    Object objM4272g15 = c1128o2.m2173k().f3702d.m4272g(AbstractC1132s.f3742e);
                                    if (objM4272g15 == null) {
                                        objM4272g15 = null;
                                    }
                                    boolean z10 = objM4272g15 != null;
                                    if (!z10) {
                                        c3175g.m5453g("android.widget.HorizontalScrollView");
                                    }
                                    if (((Number) c1122i.f3650b.mo6a()).floatValue() > 0.0f) {
                                        accessibilityNodeInfo2.setScrollable(true);
                                    }
                                    if (AbstractC0681L.m1180b(c1128o2)) {
                                        boolean zM1136s = ViewOnAttachStateChangeListenerC0667E.m1136s(c1122i);
                                        EnumC2017m enumC2017m = EnumC2017m.f6743e;
                                        if (zM1136s) {
                                            c3175g.m5448a(C3172d.f9923e);
                                            c0564i2 = c0564i;
                                            c3175g.m5448a(!(c0564i2.f1693D == enumC2017m) ? C3172d.f9928j : C3172d.f9926h);
                                        } else {
                                            c0564i2 = c0564i;
                                        }
                                        if (ViewOnAttachStateChangeListenerC0667E.m1135r(c1122i)) {
                                            c3175g.m5448a(C3172d.f9924f);
                                            c3175g.m5448a(!(c0564i2.f1693D == enumC2017m) ? C3172d.f9926h : C3172d.f9928j);
                                        }
                                    }
                                }
                            }
                            c1122i2 = (C1122i) AbstractC1131r.m2185d(c1128o2.m2175m(), AbstractC1132s.f3759v);
                            if (c1122i2 != null && c1114a10 != null) {
                                objM4272g = c1128o2.m2173k().f3702d.m4272g(AbstractC1132s.f3743f);
                                if (objM4272g == null) {
                                    objM4272g = null;
                                }
                                if (objM4272g != null) {
                                    Object objM4272g16 = c1128o2.m2173k().f3702d.m4272g(AbstractC1132s.f3742e);
                                    if (objM4272g16 == null) {
                                        objM4272g16 = null;
                                    }
                                    boolean z11 = objM4272g16 != null;
                                    if (!z11) {
                                        c3175g.m5453g("android.widget.ScrollView");
                                    }
                                    if (((Number) c1122i2.f3650b.mo6a()).floatValue() > 0.0f) {
                                        accessibilityNodeInfo2.setScrollable(true);
                                    }
                                    if (AbstractC0681L.m1180b(c1128o2)) {
                                        if (ViewOnAttachStateChangeListenerC0667E.m1136s(c1122i2)) {
                                            c3175g.m5448a(C3172d.f9923e);
                                            c3175g.m5448a(C3172d.f9927i);
                                        }
                                        if (ViewOnAttachStateChangeListenerC0667E.m1135r(c1122i2)) {
                                            c3175g.m5448a(C3172d.f9924f);
                                            c3175g.m5448a(C3172d.f9925g);
                                        }
                                    }
                                }
                            }
                            if (i8 >= 29) {
                                AbstractC0681L.m1182d(c1128o2, c3175g);
                            }
                            CharSequence charSequence = (CharSequence) AbstractC1131r.m2185d(c1128o2.m2175m(), AbstractC1132s.f3741d);
                            if (i8 < 28) {
                                accessibilityNodeInfo2.setPaneTitle(charSequence);
                            } else {
                                accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                            }
                            if (AbstractC0681L.m1180b(c1128o2)) {
                                C1114a c1114a11 = (C1114a) AbstractC1131r.m2185d(c1128o2.m2175m(), AbstractC1124k.f3695t);
                                if (c1114a11 != null) {
                                    c3175g.m5448a(new C3172d(c1114a11.f3633a, 262144));
                                }
                                C1114a c1114a12 = (C1114a) AbstractC1131r.m2185d(c1128o2.m2175m(), AbstractC1124k.f3696u);
                                if (c1114a12 != null) {
                                    c3175g.m5448a(new C3172d(c1114a12.f3633a, 524288));
                                }
                                C1114a c1114a13 = (C1114a) AbstractC1131r.m2185d(c1128o2.m2175m(), AbstractC1124k.f3697v);
                                if (c1114a13 != null) {
                                    c3175g.m5448a(new C3172d(c1114a13.f3633a, 1048576));
                                }
                                C1125l c1125lM2175m2 = c1128o2.m2175m();
                                C1135v c1135v5 = AbstractC1124k.f3699x;
                                if (c1125lM2175m2.f3702d.m4268c(c1135v5)) {
                                    List list5 = (List) c1128o2.m2175m().m2160c(c1135v5);
                                    int size9 = list5.size();
                                    C2438t c2438t = ViewOnAttachStateChangeListenerC0667E.f2110R;
                                    if (size9 >= c2438t.f7878b) {
                                        throw new IllegalStateException("Can't have more than " + c2438t.f7878b + " custom actions for one widget");
                                    }
                                    C2418O c2418o3 = new C2418O();
                                    C2444z c2444zM4292a = AbstractC2412I.m4292a();
                                    C2418O c2418o4 = c2418o;
                                    if (c2418o4.m4310e(i7)) {
                                        C2444z c2444z = (C2444z) c2418o4.m4311g(i7);
                                        int[] iArr = c2438t.f7877a;
                                        int i37 = c2438t.f7878b;
                                        int i38 = 0;
                                        int[] iArr2 = new int[16];
                                        int i39 = 0;
                                        while (i39 < i37) {
                                            int i40 = iArr[i39];
                                            int i41 = i37;
                                            int i42 = i38 + 1;
                                            C2444z c2444z2 = c2444z;
                                            if (iArr2.length < i42) {
                                                int[] iArrCopyOf = Arrays.copyOf(iArr2, Math.max(i42, (iArr2.length * 3) / 2));
                                                AbstractC1665j.m2984d(iArrCopyOf, "copyOf(...)");
                                                iArr2 = iArrCopyOf;
                                            }
                                            iArr2[i38] = i40;
                                            i39++;
                                            i38 = i42;
                                            i37 = i41;
                                            c2444z = c2444z2;
                                        }
                                        C2444z c2444z3 = c2444z;
                                        ArrayList arrayList7 = new ArrayList();
                                        if (list5.size() > 0) {
                                            AbstractC0231b.m408s(list5.get(0));
                                            AbstractC1665j.m2982b(c2444z3);
                                            throw null;
                                        }
                                        if (arrayList7.size() > 0) {
                                            AbstractC0231b.m408s(arrayList7.get(0));
                                            if (i38 > 0) {
                                                int i43 = iArr2[0];
                                                throw null;
                                            }
                                            AbstractC2477a.m4423d("Index must be between 0 and size");
                                            throw null;
                                        }
                                    } else if (list5.size() > 0) {
                                        AbstractC0231b.m408s(list5.get(0));
                                        c2438t.m4336c(0);
                                        throw null;
                                    }
                                    viewOnAttachStateChangeListenerC0667E2.f2143v.m4312h(i7, c2418o3);
                                    c2418o4.m4312h(i7, c2444zM4292a);
                                }
                            }
                            boolean zM1181c = AbstractC0681L.m1181c(c1128o2, resources4);
                            if (Build.VERSION.SDK_INT < 28) {
                                accessibilityNodeInfo2.setScreenReaderFocusable(zM1181c);
                            } else {
                                c3175g.m5452f(1, zM1181c);
                            }
                            iM4331d = viewOnAttachStateChangeListenerC0667E2.f2116F.m4331d(i7);
                            if (iM4331d == -1) {
                                AbstractC2218i abstractC2218iM1194p2 = AbstractC0681L.m1194p(viewTreeObserverOnGlobalLayoutListenerC0772y.getAndroidViewsHandler$ui(), iM4331d);
                                if (abstractC2218iM1194p2 != null) {
                                    accessibilityNodeInfo2.setTraversalBefore(abstractC2218iM1194p2);
                                    viewTreeObserverOnGlobalLayoutListenerC0772y2 = viewTreeObserverOnGlobalLayoutListenerC0772y;
                                } else {
                                    viewTreeObserverOnGlobalLayoutListenerC0772y2 = viewTreeObserverOnGlobalLayoutListenerC0772y;
                                    accessibilityNodeInfo2.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC0772y2, iM4331d);
                                }
                                bundle = null;
                                viewOnAttachStateChangeListenerC0667E2.m1145c(i7, c3175g, viewOnAttachStateChangeListenerC0667E2.f2118H, null);
                            } else {
                                viewTreeObserverOnGlobalLayoutListenerC0772y2 = viewTreeObserverOnGlobalLayoutListenerC0772y;
                                bundle = null;
                            }
                            iM4331d2 = viewOnAttachStateChangeListenerC0667E2.f2117G.m4331d(i7);
                            if (iM4331d2 != -1 && (abstractC2218iM1194p = AbstractC0681L.m1194p(viewTreeObserverOnGlobalLayoutListenerC0772y2.getAndroidViewsHandler$ui(), iM4331d2)) != null) {
                                accessibilityNodeInfo2.setTraversalAfter(abstractC2218iM1194p);
                                viewOnAttachStateChangeListenerC0667E2.m1145c(i7, c3175g, viewOnAttachStateChangeListenerC0667E2.f2119I, bundle);
                            }
                            str = (String) AbstractC1131r.m2185d(c1128o2.m2175m(), AbstractC1133t.f3765b);
                            if (str != null) {
                                c3175g.m5453g(str);
                            }
                        }
                    } else {
                        viewOnAttachStateChangeListenerC0667E2 = viewOnAttachStateChangeListenerC0667E;
                    }
                    z5 = true;
                    accessibilityNodeInfo2.setVisibleToUser(AbstractC1131r.m2186e(c1128o2) ^ z5);
                    AbstractC0231b.m408s(AbstractC1131r.m2185d(c1125l4, AbstractC1132s.f3747j));
                    accessibilityNodeInfo2.setClickable(false);
                    c1114a = (C1114a) AbstractC1131r.m2185d(c1125l4, AbstractC1124k.f3677b);
                    if (c1114a != null) {
                    }
                    accessibilityNodeInfo2.setLongClickable(false);
                    c1114a2 = (C1114a) AbstractC1131r.m2185d(c1125l4, AbstractC1124k.f3678c);
                    if (c1114a2 != null) {
                    }
                    c1114a3 = (C1114a) AbstractC1131r.m2185d(c1125l4, AbstractC1124k.f3692q);
                    if (c1114a3 != null) {
                    }
                    if (AbstractC0681L.m1180b(c1128o2)) {
                    }
                    strM1133m = ViewOnAttachStateChangeListenerC0667E.m1133m(c1128o2);
                    if (strM1133m != null) {
                        if (!(strM1133m != null || strM1133m.length() == 0)) {
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceM5451e = c3175g.m5451e();
                        if (charSequenceM5451e != null) {
                            if (!(charSequenceM5451e != null || charSequenceM5451e.length() == 0)) {
                                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (c2408e.m4268c(AbstractC1132s.f3763z)) {
                            }
                            if (c2408e.m4268c(AbstractC1132s.f3737P)) {
                            }
                            c1125l4.getClass();
                            accessibilityNodeInfo2.setAvailableExtraData(arrayList);
                            c1120g = (C1120g) AbstractC1131r.m2185d(c1128o2.m2175m(), AbstractC1132s.f3740c);
                            if (c1120g != null) {
                            }
                            i8 = Build.VERSION.SDK_INT;
                            if (AbstractC0681L.m1180b(c1128o2)) {
                            }
                            AbstractC1924f.m3509w(c1128o2, c3175g);
                            AbstractC1924f.m3510x(c1128o2, c3175g);
                            c1122i = (C1122i) AbstractC1131r.m2185d(c1128o2.m2175m(), AbstractC1132s.f3758u);
                            C1114a c1114a102 = (C1114a) AbstractC1131r.m2185d(c1128o2.m2175m(), AbstractC1124k.f3679d);
                            if (c1122i != null) {
                                objM4272g2 = c1128o2.m2173k().f3702d.m4272g(AbstractC1132s.f3743f);
                                if (objM4272g2 == null) {
                                }
                                if (objM4272g2 != null) {
                                }
                            }
                            c1122i2 = (C1122i) AbstractC1131r.m2185d(c1128o2.m2175m(), AbstractC1132s.f3759v);
                            if (c1122i2 != null) {
                                objM4272g = c1128o2.m2173k().f3702d.m4272g(AbstractC1132s.f3743f);
                                if (objM4272g == null) {
                                }
                                if (objM4272g != null) {
                                }
                            }
                            if (i8 >= 29) {
                            }
                            CharSequence charSequence2 = (CharSequence) AbstractC1131r.m2185d(c1128o2.m2175m(), AbstractC1132s.f3741d);
                            if (i8 < 28) {
                            }
                            if (AbstractC0681L.m1180b(c1128o2)) {
                            }
                            boolean zM1181c2 = AbstractC0681L.m1181c(c1128o2, resources4);
                            if (Build.VERSION.SDK_INT < 28) {
                            }
                            iM4331d = viewOnAttachStateChangeListenerC0667E2.f2116F.m4331d(i7);
                            if (iM4331d == -1) {
                            }
                            iM4331d2 = viewOnAttachStateChangeListenerC0667E2.f2117G.m4331d(i7);
                            if (iM4331d2 != -1) {
                                accessibilityNodeInfo2.setTraversalAfter(abstractC2218iM1194p);
                                viewOnAttachStateChangeListenerC0667E2.m1145c(i7, c3175g, viewOnAttachStateChangeListenerC0667E2.f2119I, bundle);
                            }
                            str = (String) AbstractC1131r.m2185d(c1128o2.m2175m(), AbstractC1133t.f3765b);
                            if (str != null) {
                            }
                        }
                    }
                } else if (!(Build.VERSION.SDK_INT >= 34 ? AbstractC3170b.m5436e(accessibilityManager2) : true)) {
                    i7 = i5;
                    viewOnAttachStateChangeListenerC0667E2 = viewOnAttachStateChangeListenerC0667E3;
                    c3175g = null;
                }
            }
        }
        if (viewOnAttachStateChangeListenerC0667E2.f2140s) {
            if (i7 == viewOnAttachStateChangeListenerC0667E2.f2136o) {
                viewOnAttachStateChangeListenerC0667E2.f2138q = c3175g;
            }
            if (i7 == viewOnAttachStateChangeListenerC0667E2.f2137p) {
                viewOnAttachStateChangeListenerC0667E2.f2139r = c3175g;
            }
        }
        return c3175g;
    }
}
