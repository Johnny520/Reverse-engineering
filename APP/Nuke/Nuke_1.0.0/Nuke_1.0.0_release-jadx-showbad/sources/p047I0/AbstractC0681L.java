package p047I0;

import android.R;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import com.bumptech.glide.AbstractC1926h;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p027E4.C0330q;
import p041H0.C0564I;
import p056K2.InterfaceC0877c;
import p061L2.AbstractC0973m;
import p077P0.AbstractC1124k;
import p077P0.AbstractC1131r;
import p077P0.AbstractC1132s;
import p077P0.C1114a;
import p077P0.C1120g;
import p077P0.C1121h;
import p077P0.C1125l;
import p077P0.C1128o;
import p077P0.C1135v;
import p087R0.EnumC1190a;
import p092S0.C1257J;
import p092S0.C1269g;
import p095T.C1357e;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p158f0.InterfaceC2083o;
import p170h1.AbstractC2218i;
import p186k.C2408E;
import p211o0.AbstractC2752k;
import p211o0.C2750i;
import p234s1.C3172d;
import p234s1.C3175g;

/* JADX INFO: renamed from: I0.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0681L {

    /* JADX INFO: renamed from: a */
    public static final Class[] f2162a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m1179a(View view, View view2) {
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
    public static final boolean m1180b(C1128o c1128o) {
        C1125l c1125lM2173k = c1128o.m2173k();
        return !c1125lM2173k.f3702d.m4268c(AbstractC1132s.f3746i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m1181c(C1128o c1128o, Resources resources) {
        Object objM4272g = c1128o.f3711d.f3702d.m4272g(AbstractC1132s.f3738a);
        if (objM4272g == null) {
            objM4272g = null;
        }
        List list = (List) objM4272g;
        return !AbstractC1131r.m2186e(c1128o) && (c1128o.f3711d.f3704f || (c1128o.m2177o() && ((list != null ? (String) AbstractC0973m.m2013T(list) : null) != null || m1187i(c1128o) != null || m1186h(c1128o, resources) != null || m1185g(c1128o))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m1182d(C1128o c1128o, C3175g c3175g) {
        C1125l c1125l = c1128o.f3711d;
        C2408E c2408e = c1125l.f3702d;
        Object objM4272g = c1125l.f3702d.m4272g(AbstractC1132s.f3762y);
        if (objM4272g == null) {
            objM4272g = null;
        }
        C1121h c1121h = (C1121h) objM4272g;
        if (m1180b(c1128o)) {
            if (c1121h != null && c1121h.f3648a == 8) {
                return;
            }
            Object objM4272g2 = c2408e.m4272g(AbstractC1124k.f3700y);
            if (objM4272g2 == null) {
                objM4272g2 = null;
            }
            C1114a c1114a = (C1114a) objM4272g2;
            if (c1114a != null) {
                c3175g.m5448a(new C3172d(null, R.id.accessibilityActionPageUp, c1114a.f3633a, null));
            }
            Object objM4272g3 = c2408e.m4272g(AbstractC1124k.f3673A);
            if (objM4272g3 == null) {
                objM4272g3 = null;
            }
            C1114a c1114a2 = (C1114a) objM4272g3;
            if (c1114a2 != null) {
                c3175g.m5448a(new C3172d(null, R.id.accessibilityActionPageDown, c1114a2.f3633a, null));
            }
            Object objM4272g4 = c2408e.m4272g(AbstractC1124k.f3701z);
            if (objM4272g4 == null) {
                objM4272g4 = null;
            }
            C1114a c1114a3 = (C1114a) objM4272g4;
            if (c1114a3 != null) {
                c3175g.m5448a(new C3172d(null, R.id.accessibilityActionPageLeft, c1114a3.f3633a, null));
            }
            Object objM4272g5 = c2408e.m4272g(AbstractC1124k.f3674B);
            if (objM4272g5 == null) {
                objM4272g5 = null;
            }
            C1114a c1114a4 = (C1114a) objM4272g5;
            if (c1114a4 != null) {
                c3175g.m5448a(new C3172d(null, R.id.accessibilityActionPageRight, c1114a4.f3633a, null));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final boolean m1183e(Object obj) {
        if (obj instanceof InterfaceC2083o) {
            InterfaceC2083o interfaceC2083o = (InterfaceC2083o) obj;
            if (interfaceC2083o.mo2506d() == C1357e.f4795g || interfaceC2083o.mo2506d() == C1357e.f4798j || interfaceC2083o.mo2506d() == C1357e.f4796h) {
                Object value = interfaceC2083o.getValue();
                if (value == null) {
                    return true;
                }
                return m1183e(value);
            }
        } else {
            if ((obj instanceof InterfaceC0877c) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i5 = 0; i5 < 7; i5++) {
                if (f2162a[i5].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final float m1184f(float[] fArr, int i5, float[] fArr2, int i6) {
        int i7 = i5 * 4;
        return (fArr[i7 + 3] * fArr2[12 + i6]) + (fArr[i7 + 2] * fArr2[8 + i6]) + (fArr[i7 + 1] * fArr2[4 + i6]) + (fArr[i7] * fArr2[i6]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final boolean m1185g(C1128o c1128o) {
        Object objM4272g = c1128o.f3711d.f3702d.m4272g(AbstractC1132s.f3731J);
        if (objM4272g == null) {
            objM4272g = null;
        }
        EnumC1190a enumC1190a = (EnumC1190a) objM4272g;
        C2408E c2408e = c1128o.f3711d.f3702d;
        Object objM4272g2 = c2408e.m4272g(AbstractC1132s.f3762y);
        if (objM4272g2 == null) {
            objM4272g2 = null;
        }
        C1121h c1121h = (C1121h) objM4272g2;
        boolean z5 = enumC1190a != null;
        Object objM4272g3 = c2408e.m4272g(AbstractC1132s.f3730I);
        if (((Boolean) (objM4272g3 != null ? objM4272g3 : null)) == null || (c1121h != null && c1121h.f3648a == 4)) {
            return z5;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final String m1186h(C1128o c1128o, Resources resources) {
        C1125l c1125l = c1128o.f3711d;
        C1125l c1125l2 = c1128o.f3711d;
        Object objM4272g = c1125l.f3702d.m4272g(AbstractC1132s.f3739b);
        String string = null;
        if (objM4272g == null) {
            objM4272g = null;
        }
        C2408E c2408e = c1125l2.f3702d;
        Object objM4272g2 = c2408e.m4272g(AbstractC1132s.f3731J);
        if (objM4272g2 == null) {
            objM4272g2 = null;
        }
        EnumC1190a enumC1190a = (EnumC1190a) objM4272g2;
        Object objM4272g3 = c2408e.m4272g(AbstractC1132s.f3762y);
        if (objM4272g3 == null) {
            objM4272g3 = null;
        }
        C1121h c1121h = (C1121h) objM4272g3;
        if (enumC1190a != null) {
            int iOrdinal = enumC1190a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new C0330q();
                    }
                    if (objM4272g == null) {
                        objM4272g = resources.getString(me.dartcv.nuke.R.string.indeterminate);
                    }
                } else if (c1121h != null && c1121h.f3648a == 2 && objM4272g == null) {
                    objM4272g = resources.getString(me.dartcv.nuke.R.string.state_off);
                }
            } else if (c1121h != null && c1121h.f3648a == 2 && objM4272g == null) {
                objM4272g = resources.getString(me.dartcv.nuke.R.string.state_on);
            }
        }
        Object objM4272g4 = c2408e.m4272g(AbstractC1132s.f3730I);
        if (objM4272g4 == null) {
            objM4272g4 = null;
        }
        Boolean bool = (Boolean) objM4272g4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((c1121h == null || c1121h.f3648a != 4) && objM4272g == null) {
                objM4272g = zBooleanValue ? resources.getString(me.dartcv.nuke.R.string.selected) : resources.getString(me.dartcv.nuke.R.string.not_selected);
            }
        }
        Object objM4272g5 = c2408e.m4272g(AbstractC1132s.f3740c);
        if (objM4272g5 == null) {
            objM4272g5 = null;
        }
        C1120g c1120g = (C1120g) objM4272g5;
        if (c1120g != null) {
            if (c1120g != C1120g.f3645c) {
                if (objM4272g == null) {
                    float f2 = c1120g.f3647b.f6139a;
                    float f5 = f2 - 0.0f == 0.0f ? 0.0f : (c1120g.f3646a - 0.0f) / (f2 - 0.0f);
                    if (f5 < 0.0f) {
                        f5 = 0.0f;
                    }
                    if (f5 > 1.0f) {
                        f5 = 1.0f;
                    }
                    objM4272g = resources.getString(me.dartcv.nuke.R.string.template_percent, Integer.valueOf(f5 == 0.0f ? 0 : f5 == 1.0f ? 100 : AbstractC1926h.m3568k(Math.round(f5 * 100), 1, 99)));
                }
            } else if (objM4272g == null) {
                objM4272g = resources.getString(me.dartcv.nuke.R.string.in_progress);
            }
        }
        C1135v c1135v = AbstractC1132s.f3727F;
        if (c2408e.m4268c(c1135v)) {
            C2408E c2408e2 = new C1128o(c1128o.f3708a, true, c1128o.f3710c, c1125l2).m2173k().f3702d;
            Object objM4272g6 = c2408e2.m4272g(AbstractC1132s.f3738a);
            if (objM4272g6 == null) {
                objM4272g6 = null;
            }
            Collection collection = (Collection) objM4272g6;
            if (collection == null || collection.isEmpty()) {
                Object objM4272g7 = c2408e2.m4272g(AbstractC1132s.f3723B);
                if (objM4272g7 == null) {
                    objM4272g7 = null;
                }
                Collection collection2 = (Collection) objM4272g7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objM4272g8 = c2408e2.m4272g(c1135v);
                    if (objM4272g8 == null) {
                        objM4272g8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objM4272g8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(me.dartcv.nuke.R.string.state_empty);
                    }
                }
            }
            objM4272g = string;
        }
        return (String) objM4272g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final C1269g m1187i(C1128o c1128o) {
        C1125l c1125l = c1128o.f3711d;
        C1135v c1135v = AbstractC1132s.f3738a;
        C1269g c1269g = (C1269g) AbstractC1131r.m2185d(c1125l, AbstractC1132s.f3727F);
        List list = (List) AbstractC1131r.m2185d(c1128o.f3711d, AbstractC1132s.f3723B);
        return c1269g == null ? list != null ? (C1269g) AbstractC0973m.m2013T(list) : null : c1269g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static boolean m1188j() {
        try {
            if (ViewTreeObserverOnGlobalLayoutListenerC0772y.f2420N0 == null) {
                ViewTreeObserverOnGlobalLayoutListenerC0772y.f2420N0 = Class.forName("android.os.SystemProperties");
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC0772y.f2421O0 == null) {
                Class cls = ViewTreeObserverOnGlobalLayoutListenerC0772y.f2420N0;
                ViewTreeObserverOnGlobalLayoutListenerC0772y.f2421O0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = ViewTreeObserverOnGlobalLayoutListenerC0772y.f2421O0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return AbstractC1665j.m2981a(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final C1257J m1189k(C1125l c1125l) {
        InterfaceC1601c interfaceC1601c;
        ArrayList arrayList = new ArrayList();
        Object objM4272g = c1125l.f3702d.m4272g(AbstractC1124k.f3676a);
        if (objM4272g == null) {
            objM4272g = null;
        }
        C1114a c1114a = (C1114a) objM4272g;
        if (c1114a == null || (interfaceC1601c = (InterfaceC1601c) c1114a.f3634b) == null || !((Boolean) interfaceC1601c.mo1h(arrayList)).booleanValue()) {
            return null;
        }
        return (C1257J) arrayList.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final boolean m1190l(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[3];
        float f8 = fArr[4];
        float f9 = fArr[5];
        float f10 = fArr[6];
        float f11 = fArr[7];
        float f12 = fArr[8];
        float f13 = fArr[9];
        float f14 = fArr[10];
        float f15 = fArr[11];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[14];
        float f19 = fArr[15];
        float f20 = (f2 * f9) - (f5 * f8);
        float f21 = (f2 * f10) - (f6 * f8);
        float f22 = (f2 * f11) - (f7 * f8);
        float f23 = (f5 * f10) - (f6 * f9);
        float f24 = (f5 * f11) - (f7 * f9);
        float f25 = (f6 * f11) - (f7 * f10);
        float f26 = (f12 * f17) - (f13 * f16);
        float f27 = (f12 * f18) - (f14 * f16);
        float f28 = (f12 * f19) - (f15 * f16);
        float f29 = (f13 * f18) - (f14 * f17);
        float f30 = (f13 * f19) - (f15 * f17);
        float f31 = (f14 * f19) - (f15 * f18);
        float f32 = (f25 * f26) + (((f23 * f28) + ((f22 * f29) + ((f20 * f31) - (f21 * f30)))) - (f24 * f27));
        if (f32 != 0.0f) {
            float f33 = 1.0f / f32;
            fArr2[0] = ((f11 * f29) + ((f9 * f31) - (f10 * f30))) * f33;
            fArr2[1] = (((f6 * f30) + ((-f5) * f31)) - (f7 * f29)) * f33;
            fArr2[2] = ((f19 * f23) + ((f17 * f25) - (f18 * f24))) * f33;
            fArr2[3] = (((f14 * f24) + ((-f13) * f25)) - (f15 * f23)) * f33;
            float f34 = -f8;
            fArr2[4] = (((f10 * f28) + (f34 * f31)) - (f11 * f27)) * f33;
            fArr2[5] = ((f7 * f27) + ((f31 * f2) - (f6 * f28))) * f33;
            float f35 = -f16;
            fArr2[6] = (((f18 * f22) + (f35 * f25)) - (f19 * f21)) * f33;
            fArr2[7] = ((f15 * f21) + ((f25 * f12) - (f14 * f22))) * f33;
            fArr2[8] = ((f11 * f26) + ((f8 * f30) - (f9 * f28))) * f33;
            fArr2[9] = (((f28 * f5) + ((-f2) * f30)) - (f7 * f26)) * f33;
            fArr2[10] = ((f19 * f20) + ((f16 * f24) - (f17 * f22))) * f33;
            fArr2[11] = (((f22 * f13) + ((-f12) * f24)) - (f15 * f20)) * f33;
            fArr2[12] = (((f9 * f27) + (f34 * f29)) - (f10 * f26)) * f33;
            fArr2[13] = ((f6 * f26) + ((f2 * f29) - (f5 * f27))) * f33;
            fArr2[14] = (((f17 * f21) + (f35 * f23)) - (f18 * f20)) * f33;
            fArr2[15] = ((f14 * f20) + ((f12 * f23) - (f13 * f21))) * f33;
        }
        return !(f32 == 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final boolean m1191m(float f2, float f5, C2750i c2750i) {
        float f6 = f2 - 0.005f;
        float f7 = f5 - 0.005f;
        float f8 = f2 + 0.005f;
        float f9 = f5 + 0.005f;
        C2750i c2750iM4885a = AbstractC2752k.m4885a();
        if (Float.isNaN(f6) || Float.isNaN(f7) || Float.isNaN(f8) || Float.isNaN(f9)) {
            AbstractC2752k.m4886b("Invalid rectangle, make sure no value is NaN");
        }
        if (c2750iM4885a.f8743b == null) {
            c2750iM4885a.f8743b = new RectF();
        }
        RectF rectF = c2750iM4885a.f8743b;
        AbstractC1665j.m2982b(rectF);
        rectF.set(f6, f7, f8, f9);
        Path path = c2750iM4885a.f8742a;
        RectF rectF2 = c2750iM4885a.f8743b;
        AbstractC1665j.m2982b(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
        C2750i c2750iM4885a2 = AbstractC2752k.m4885a();
        c2750iM4885a2.m4882f(c2750i, c2750iM4885a, 1);
        boolean zIsEmpty = c2750iM4885a2.f8742a.isEmpty();
        c2750iM4885a2.m4883g();
        c2750iM4885a.m4883g();
        return !zIsEmpty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final boolean m1192n(float f2, float f5, float f6, float f7, long j5) {
        float f8 = f2 - f6;
        float f9 = f5 - f7;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        return ((f9 * f9) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f8 * f8) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final void m1193o(float[] fArr, float[] fArr2) {
        float fM1184f = m1184f(fArr2, 0, fArr, 0);
        float fM1184f2 = m1184f(fArr2, 0, fArr, 1);
        float fM1184f3 = m1184f(fArr2, 0, fArr, 2);
        float fM1184f4 = m1184f(fArr2, 0, fArr, 3);
        float fM1184f5 = m1184f(fArr2, 1, fArr, 0);
        float fM1184f6 = m1184f(fArr2, 1, fArr, 1);
        float fM1184f7 = m1184f(fArr2, 1, fArr, 2);
        float fM1184f8 = m1184f(fArr2, 1, fArr, 3);
        float fM1184f9 = m1184f(fArr2, 2, fArr, 0);
        float fM1184f10 = m1184f(fArr2, 2, fArr, 1);
        float fM1184f11 = m1184f(fArr2, 2, fArr, 2);
        float fM1184f12 = m1184f(fArr2, 2, fArr, 3);
        float fM1184f13 = m1184f(fArr2, 3, fArr, 0);
        float fM1184f14 = m1184f(fArr2, 3, fArr, 1);
        float fM1184f15 = m1184f(fArr2, 3, fArr, 2);
        float fM1184f16 = m1184f(fArr2, 3, fArr, 3);
        fArr[0] = fM1184f;
        fArr[1] = fM1184f2;
        fArr[2] = fM1184f3;
        fArr[3] = fM1184f4;
        fArr[4] = fM1184f5;
        fArr[5] = fM1184f6;
        fArr[6] = fM1184f7;
        fArr[7] = fM1184f8;
        fArr[8] = fM1184f9;
        fArr[9] = fM1184f10;
        fArr[10] = fM1184f11;
        fArr[11] = fM1184f12;
        fArr[12] = fM1184f13;
        fArr[13] = fM1184f14;
        fArr[14] = fM1184f15;
        fArr[15] = fM1184f16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final AbstractC2218i m1194p(C0720d0 c0720d0, int i5) {
        Object next;
        Iterator<T> it = c0720d0.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C0564I) ((Map.Entry) next).getKey()).f1712e == i5) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AbstractC2218i) entry.getValue();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final String m1195q(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final String m1196r(int i5) {
        if (i5 == 0) {
            return "android.widget.Button";
        }
        if (i5 == 1) {
            return "android.widget.CheckBox";
        }
        if (i5 == 3) {
            return "android.widget.RadioButton";
        }
        if (i5 == 5) {
            return "android.widget.ImageView";
        }
        if (i5 == 6) {
            return "android.widget.Spinner";
        }
        if (i5 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
