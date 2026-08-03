package p357y1;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.RectF;
import android.inputmethodservice.InputMethodService;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import be.AbstractC0283h;
import gg.AbstractC1416l;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.C3193a;
import p019b4.C0177a;
import p019b4.C0179c;
import p019b4.C0181e;
import p019b4.InterfaceC0180d;
import p031c4.C0393c;
import p031c4.C0394d;
import p031c4.C0396f;
import p069f.C0943k0;
import p071f1.AbstractC1013l;
import p071f1.C1009j;
import p072f2.AbstractC1049l;
import p072f2.AbstractC1057t;
import p072f2.AbstractC1058u;
import p072f2.C1038a;
import p072f2.C1045h;
import p072f2.C1046i;
import p072f2.C1050m;
import p072f2.C1054q;
import p072f2.C1061x;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p092g4.AbstractC1341a;
import p102h2.EnumC1571a;
import p103h3.C1576e;
import p103h3.C1578g;
import p117i0.C1823e;
import p119i2.C1926g;
import p119i2.C1935k0;
import p172lg.C2561a;
import p259r9.AbstractC3754e0;
import p276sf.InterfaceC3955b;
import p293u2.C4235e;
import p322w0.InterfaceC4663n;
import p339x1.C5602f0;
import p340x2.AbstractC5673h;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: y1.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5883g0 {

    /* JADX INFO: renamed from: a */
    public static final Class[] f23882a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m10585a(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m10586b(C1054q c1054q) {
        C1050m c1050mM2659k = c1054q.m2659k();
        return !c1050mM2659k.f3341g.m2316c(AbstractC1058u.f3385j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m10587c(C1054q c1054q, Resources resources) {
        Object objM2320g = c1054q.f3350d.f3341g.m2320g(AbstractC1058u.f3376a);
        if (objM2320g == null) {
            objM2320g = null;
        }
        List list = (List) objM2320g;
        return !AbstractC1057t.m2676g(c1054q) && (c1054q.f3350d.f3343i || (c1054q.m2665q() && ((list != null ? (String) AbstractC4166m.m8424v1(list) : null) != null || m10597m(c1054q) != null || m10596l(c1054q, resources) != null || m10595k(c1054q))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m10588d(C1054q c1054q, C1578g c1578g) {
        C1050m c1050m = c1054q.f3350d;
        C0943k0 c0943k0 = c1050m.f3341g;
        Object objM2320g = c1050m.f3341g.m2320g(AbstractC1058u.f3400y);
        if (objM2320g == null) {
            objM2320g = null;
        }
        C1046i c1046i = (C1046i) objM2320g;
        if (m10586b(c1054q)) {
            if (c1046i != null && c1046i.f3287a == 8) {
                return;
            }
            Object objM2320g2 = c0943k0.m2320g(AbstractC1049l.f3339y);
            if (objM2320g2 == null) {
                objM2320g2 = null;
            }
            C1038a c1038a = (C1038a) objM2320g2;
            if (c1038a != null) {
                c1578g.m4118a(new C1576e(null, R.id.accessibilityActionPageUp, c1038a.f3269a, null));
            }
            Object objM2320g3 = c0943k0.m2320g(AbstractC1049l.f3312A);
            if (objM2320g3 == null) {
                objM2320g3 = null;
            }
            C1038a c1038a2 = (C1038a) objM2320g3;
            if (c1038a2 != null) {
                c1578g.m4118a(new C1576e(null, R.id.accessibilityActionPageDown, c1038a2.f3269a, null));
            }
            Object objM2320g4 = c0943k0.m2320g(AbstractC1049l.f3340z);
            if (objM2320g4 == null) {
                objM2320g4 = null;
            }
            C1038a c1038a3 = (C1038a) objM2320g4;
            if (c1038a3 != null) {
                c1578g.m4118a(new C1576e(null, R.id.accessibilityActionPageLeft, c1038a3.f3269a, null));
            }
            Object objM2320g5 = c0943k0.m2320g(AbstractC1049l.f3313B);
            if (objM2320g5 == null) {
                objM2320g5 = null;
            }
            C1038a c1038a4 = (C1038a) objM2320g5;
            if (c1038a4 != null) {
                c1578g.m4118a(new C1576e(null, R.id.accessibilityActionPageRight, c1038a4.f3269a, null));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final C5896j1 m10589e(View view) {
        Context context = view.getContext();
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
        }
        baseContext = null;
        if (baseContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            C4235e c4235eM1147a = AbstractC0283h.m1147a(context);
            long jM3588d = AbstractC1341a.m3588d(configuration.screenWidthDp, configuration.screenHeightDp);
            return new C5896j1(AbstractC3754e0.m7906p0(c4235eM1147a.mo1593L0(jM3588d)), jM3588d);
        }
        InterfaceC0180d.f463a.getClass();
        C0179c c0179c = C0179c.f461a;
        C0181e c0181e = C0179c.f462b;
        c0181e.getClass();
        ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
        int i9 = Build.VERSION.SDK_INT;
        C0177a c0177aMo1363c = (i9 >= 34 ? C0396f.f1095c : i9 >= 30 ? C0394d.f1093c : C0393c.f1090g).mo1363c(contextWrapper2, c0181e.f464b);
        long jWidth = (((long) c0177aMo1363c.m774a().width()) << 32) | (((long) c0177aMo1363c.m774a().height()) & 4294967295L);
        return new C5896j1(jWidth, AbstractC0283h.m1147a(baseContext).mo1592K(AbstractC3754e0.m7908q0(jWidth)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final boolean m10590f(Object obj) {
        if (obj instanceof InterfaceC4663n) {
            InterfaceC4663n interfaceC4663n = (InterfaceC4663n) obj;
            if (interfaceC4663n.mo4485b() == C1823e.f6049j || interfaceC4663n.mo4485b() == C1823e.f6052m || interfaceC4663n.mo4485b() == C1823e.f6050k) {
                Object value = interfaceC4663n.getValue();
                if (value == null) {
                    return true;
                }
                return m10590f(value);
            }
        } else {
            if ((obj instanceof InterfaceC3955b) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i9 = 0; i9 < 7; i9++) {
                if (f23882a[i9].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final float m10591g(float[] fArr, int i9, float[] fArr2, int i10) {
        int i11 = i9 * 4;
        return (fArr[i11 + 3] * fArr2[12 + i10]) + (fArr[i11 + 2] * fArr2[8 + i10]) + (fArr[i11 + 1] * fArr2[4 + i10]) + (fArr[i11] * fArr2[i10]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final int m10592h(View view, int i9) {
        int i10 = 0;
        int i11 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i9);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i11 = i10;
            }
            i10++;
            Object objM3210t = AbstractC1184v0.m3210t(view);
            view = objM3210t instanceof View ? (View) objM3210t : null;
        }
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final View m10593i(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(m10592h(view, p099h.Hchat.R.id.view_tree_lifecycle_owner), m10592h(view, p099h.Hchat.R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i9 = 0;
        View view3 = view2;
        while (view != null) {
            if (i9 == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (m10594j(view) == null) {
                i9++;
                Object objM3210t = AbstractC1184v0.m3210t(view);
                View view4 = view2;
                view2 = view;
                view = objM3210t instanceof View ? (View) objM3210t : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final C5880f1 m10594j(View view) {
        Object tag = view.getTag(p099h.Hchat.R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (C5880f1) weakReference.get();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final boolean m10595k(C1054q c1054q) {
        Object objM2320g = c1054q.f3350d.f3341g.m2320g(AbstractC1058u.f3369J);
        if (objM2320g == null) {
            objM2320g = null;
        }
        EnumC1571a enumC1571a = (EnumC1571a) objM2320g;
        C0943k0 c0943k0 = c1054q.f3350d.f3341g;
        Object objM2320g2 = c0943k0.m2320g(AbstractC1058u.f3400y);
        if (objM2320g2 == null) {
            objM2320g2 = null;
        }
        C1046i c1046i = (C1046i) objM2320g2;
        boolean z9 = enumC1571a != null;
        Object objM2320g3 = c0943k0.m2320g(AbstractC1058u.f3368I);
        if (((Boolean) (objM2320g3 != null ? objM2320g3 : null)) == null || (c1046i != null && c1046i.f3287a == 4)) {
            return z9;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final String m10596l(C1054q c1054q, Resources resources) {
        C1050m c1050m = c1054q.f3350d;
        C1050m c1050m2 = c1054q.f3350d;
        Object objM2320g = c1050m.f3341g.m2320g(AbstractC1058u.f3377b);
        String string = null;
        if (objM2320g == null) {
            objM2320g = null;
        }
        C0943k0 c0943k0 = c1050m2.f3341g;
        Object objM2320g2 = c0943k0.m2320g(AbstractC1058u.f3369J);
        if (objM2320g2 == null) {
            objM2320g2 = null;
        }
        EnumC1571a enumC1571a = (EnumC1571a) objM2320g2;
        Object objM2320g3 = c0943k0.m2320g(AbstractC1058u.f3400y);
        if (objM2320g3 == null) {
            objM2320g3 = null;
        }
        C1046i c1046i = (C1046i) objM2320g3;
        if (enumC1571a != null) {
            int iOrdinal = enumC1571a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C3193a.m6822k();
                        return null;
                    }
                    if (objM2320g == null) {
                        objM2320g = resources.getString(p099h.Hchat.R.string.indeterminate);
                    }
                } else if (c1046i != null && c1046i.f3287a == 2 && objM2320g == null) {
                    objM2320g = resources.getString(p099h.Hchat.R.string.state_off);
                }
            } else if (c1046i != null && c1046i.f3287a == 2 && objM2320g == null) {
                objM2320g = resources.getString(p099h.Hchat.R.string.state_on);
            }
        }
        Object objM2320g4 = c0943k0.m2320g(AbstractC1058u.f3368I);
        if (objM2320g4 == null) {
            objM2320g4 = null;
        }
        Boolean bool = (Boolean) objM2320g4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((c1046i == null || c1046i.f3287a != 4) && objM2320g == null) {
                objM2320g = zBooleanValue ? resources.getString(p099h.Hchat.R.string.selected) : resources.getString(p099h.Hchat.R.string.not_selected);
            }
        }
        Object objM2320g5 = c0943k0.m2320g(AbstractC1058u.f3378c);
        if (objM2320g5 == null) {
            objM2320g5 = null;
        }
        C1045h c1045h = (C1045h) objM2320g5;
        if (c1045h != null) {
            if (c1045h != C1045h.f3283d) {
                if (objM2320g == null) {
                    C2561a c2561a = c1045h.f3285b;
                    float f3 = c2561a.f8311b;
                    float f10 = c2561a.f8310a;
                    float f11 = f3 - f10 == 0.0f ? 0.0f : (c1045h.f3284a - f10) / (f3 - f10);
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 > 1.0f) {
                        f11 = 1.0f;
                    }
                    objM2320g = resources.getString(p099h.Hchat.R.string.template_percent, Integer.valueOf(f11 == 0.0f ? 0 : f11 == 1.0f ? 100 : AbstractC3754e0.m7909r(Math.round(f11 * 100), 1, 99)));
                }
            } else if (objM2320g == null) {
                objM2320g = resources.getString(p099h.Hchat.R.string.in_progress);
            }
        }
        C1061x c1061x = AbstractC1058u.f3365F;
        if (c0943k0.m2316c(c1061x)) {
            C0943k0 c0943k02 = new C1054q(c1054q.f3347a, true, c1054q.f3349c, c1050m2).m2659k().f3341g;
            Object objM2320g6 = c0943k02.m2320g(AbstractC1058u.f3376a);
            if (objM2320g6 == null) {
                objM2320g6 = null;
            }
            Collection collection = (Collection) objM2320g6;
            if (collection == null || collection.isEmpty()) {
                Object objM2320g7 = c0943k02.m2320g(AbstractC1058u.f3361B);
                if (objM2320g7 == null) {
                    objM2320g7 = null;
                }
                Collection collection2 = (Collection) objM2320g7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objM2320g8 = c0943k02.m2320g(c1061x);
                    if (objM2320g8 == null) {
                        objM2320g8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objM2320g8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(p099h.Hchat.R.string.state_empty);
                    }
                }
            }
            objM2320g = string;
        }
        return (String) objM2320g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final C1926g m10597m(C1054q c1054q) {
        Object objM2320g = c1054q.f3350d.f3341g.m2320g(AbstractC1058u.f3365F);
        if (objM2320g == null) {
            objM2320g = null;
        }
        C1926g c1926g = (C1926g) objM2320g;
        Object objM2320g2 = c1054q.f3350d.f3341g.m2320g(AbstractC1058u.f3361B);
        if (objM2320g2 == null) {
            objM2320g2 = null;
        }
        List list = (List) objM2320g2;
        return c1926g == null ? list != null ? (C1926g) AbstractC4166m.m8424v1(list) : null : c1926g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static boolean m10598n() {
        try {
            if (ViewTreeObserverOnGlobalLayoutListenerC5934t.f24056T0 == null) {
                ViewTreeObserverOnGlobalLayoutListenerC5934t.f24056T0 = Class.forName("android.os.SystemProperties");
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC5934t.f24057U0 == null) {
                Class cls = ViewTreeObserverOnGlobalLayoutListenerC5934t.f24056T0;
                ViewTreeObserverOnGlobalLayoutListenerC5934t.f24057U0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = ViewTreeObserverOnGlobalLayoutListenerC5934t.f24057U0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return AbstractC1416l.m3825a(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final C1935k0 m10599o(C1050m c1050m) {
        InterfaceC1231l interfaceC1231l;
        ArrayList arrayList = new ArrayList();
        Object objM2320g = c1050m.f3341g.m2320g(AbstractC1049l.f3315a);
        if (objM2320g == null) {
            objM2320g = null;
        }
        C1038a c1038a = (C1038a) objM2320g;
        if (c1038a == null || (interfaceC1231l = (InterfaceC1231l) c1038a.f3270b) == null || !((Boolean) interfaceC1231l.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (C1935k0) arrayList.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final boolean m10600p(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f3 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[9];
        float f19 = fArr[10];
        float f20 = fArr[11];
        float f21 = fArr[12];
        float f22 = fArr[13];
        float f23 = fArr[14];
        float f24 = fArr[15];
        float f25 = (f3 * f14) - (f10 * f13);
        float f26 = (f3 * f15) - (f11 * f13);
        float f27 = (f3 * f16) - (f12 * f13);
        float f28 = (f10 * f15) - (f11 * f14);
        float f29 = (f10 * f16) - (f12 * f14);
        float f30 = (f11 * f16) - (f12 * f15);
        float f31 = (f17 * f22) - (f18 * f21);
        float f32 = (f17 * f23) - (f19 * f21);
        float f33 = (f17 * f24) - (f20 * f21);
        float f34 = (f18 * f23) - (f19 * f22);
        float f35 = (f18 * f24) - (f20 * f22);
        float f36 = (f19 * f24) - (f20 * f23);
        float f37 = (f30 * f31) + (((f28 * f33) + ((f27 * f34) + ((f25 * f36) - (f26 * f35)))) - (f29 * f32));
        if (f37 != 0.0f) {
            float f38 = 1.0f / f37;
            fArr2[0] = ((f16 * f34) + ((f14 * f36) - (f15 * f35))) * f38;
            fArr2[1] = (((f11 * f35) + ((-f10) * f36)) - (f12 * f34)) * f38;
            fArr2[2] = ((f24 * f28) + ((f22 * f30) - (f23 * f29))) * f38;
            fArr2[3] = (((f19 * f29) + ((-f18) * f30)) - (f20 * f28)) * f38;
            float f39 = -f13;
            fArr2[4] = (((f15 * f33) + (f39 * f36)) - (f16 * f32)) * f38;
            fArr2[5] = ((f12 * f32) + ((f36 * f3) - (f11 * f33))) * f38;
            float f40 = -f21;
            fArr2[6] = (((f23 * f27) + (f40 * f30)) - (f24 * f26)) * f38;
            fArr2[7] = ((f20 * f26) + ((f30 * f17) - (f19 * f27))) * f38;
            fArr2[8] = ((f16 * f31) + ((f13 * f35) - (f14 * f33))) * f38;
            fArr2[9] = (((f33 * f10) + ((-f3) * f35)) - (f12 * f31)) * f38;
            fArr2[10] = ((f24 * f25) + ((f21 * f29) - (f22 * f27))) * f38;
            fArr2[11] = (((f27 * f18) + ((-f17) * f29)) - (f20 * f25)) * f38;
            fArr2[12] = (((f14 * f32) + (f39 * f34)) - (f15 * f31)) * f38;
            fArr2[13] = ((f11 * f31) + ((f3 * f34) - (f10 * f32))) * f38;
            fArr2[14] = (((f22 * f26) + (f40 * f28)) - (f23 * f25)) * f38;
            fArr2[15] = ((f19 * f25) + ((f17 * f28) - (f18 * f26))) * f38;
        }
        return !(f37 == 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final boolean m10601q(float f3, float f10, C1009j c1009j) {
        float f11 = f3 - 0.005f;
        float f12 = f10 - 0.005f;
        float f13 = f3 + 0.005f;
        float f14 = f10 + 0.005f;
        C1009j c1009jM2609a = AbstractC1013l.m2609a();
        if (Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13) || Float.isNaN(f14)) {
            AbstractC1013l.m2610b("Invalid rectangle, make sure no value is NaN");
        }
        if (c1009jM2609a.f3192b == null) {
            c1009jM2609a.f3192b = new RectF();
        }
        RectF rectF = c1009jM2609a.f3192b;
        rectF.getClass();
        rectF.set(f11, f12, f13, f14);
        Path path = c1009jM2609a.f3191a;
        RectF rectF2 = c1009jM2609a.f3192b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        C1009j c1009jM2609a2 = AbstractC1013l.m2609a();
        c1009jM2609a2.m2605g(c1009j, c1009jM2609a, 1);
        boolean zIsEmpty = c1009jM2609a2.f3191a.isEmpty();
        c1009jM2609a2.m2606h();
        c1009jM2609a.m2606h();
        return !zIsEmpty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final boolean m10602r(float f3, float f10, float f11, float f12, long j3) {
        float f13 = f3 - f11;
        float f14 = f10 - f12;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return ((f14 * f14) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f13 * f13) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final void m10603s(float[] fArr, float[] fArr2) {
        float fM10591g = m10591g(fArr2, 0, fArr, 0);
        float fM10591g2 = m10591g(fArr2, 0, fArr, 1);
        float fM10591g3 = m10591g(fArr2, 0, fArr, 2);
        float fM10591g4 = m10591g(fArr2, 0, fArr, 3);
        float fM10591g5 = m10591g(fArr2, 1, fArr, 0);
        float fM10591g6 = m10591g(fArr2, 1, fArr, 1);
        float fM10591g7 = m10591g(fArr2, 1, fArr, 2);
        float fM10591g8 = m10591g(fArr2, 1, fArr, 3);
        float fM10591g9 = m10591g(fArr2, 2, fArr, 0);
        float fM10591g10 = m10591g(fArr2, 2, fArr, 1);
        float fM10591g11 = m10591g(fArr2, 2, fArr, 2);
        float fM10591g12 = m10591g(fArr2, 2, fArr, 3);
        float fM10591g13 = m10591g(fArr2, 3, fArr, 0);
        float fM10591g14 = m10591g(fArr2, 3, fArr, 1);
        float fM10591g15 = m10591g(fArr2, 3, fArr, 2);
        float fM10591g16 = m10591g(fArr2, 3, fArr, 3);
        fArr[0] = fM10591g;
        fArr[1] = fM10591g2;
        fArr[2] = fM10591g3;
        fArr[3] = fM10591g4;
        fArr[4] = fM10591g5;
        fArr[5] = fM10591g6;
        fArr[6] = fM10591g7;
        fArr[7] = fM10591g8;
        fArr[8] = fM10591g9;
        fArr[9] = fM10591g10;
        fArr[10] = fM10591g11;
        fArr[11] = fM10591g12;
        fArr[12] = fM10591g13;
        fArr[13] = fM10591g14;
        fArr[14] = fM10591g15;
        fArr[15] = fM10591g16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final AbstractC5673h m10604t(C5927r0 c5927r0, int i9) {
        Object next;
        Iterator<T> it = c5927r0.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C5602f0) ((Map.Entry) next).getKey()).f22791h == i9) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AbstractC5673h) entry.getValue();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final String m10605u(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final String m10606v(int i9) {
        if (i9 == 0) {
            return "android.widget.Button";
        }
        if (i9 == 1) {
            return "android.widget.CheckBox";
        }
        if (i9 == 3) {
            return "android.widget.RadioButton";
        }
        if (i9 == 5) {
            return "android.widget.ImageView";
        }
        if (i9 == 6) {
            return "android.widget.Spinner";
        }
        if (i9 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
