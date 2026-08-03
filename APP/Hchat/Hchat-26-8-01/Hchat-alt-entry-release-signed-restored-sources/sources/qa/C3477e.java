package qa;

import android.animation.ValueAnimator;
import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.math.BigDecimal;
import java.math.RoundingMode;
import okhttp3.HttpUrl;
import p099h.Hchat.utils.KavaReflector;
import p218og.C3147k;
import p276sf.C3959f;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: qa.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3477e extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11277a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3478f f11278b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3477e(C3478f c3478f, int i9) {
        this.f11277a = i9;
        this.f11278b = c3478f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        String str;
        int i9 = this.f11277a;
        methodHookParam.getClass();
        switch (i9) {
            case 0:
                C3478f.m7272c(this.f11278b);
                return;
            case 1:
                C3478f.m7272c(this.f11278b);
                return;
            case 2:
                C3478f.m7272c(this.f11278b);
                return;
            default:
                Object obj = methodHookParam.thisObject;
                View view = obj instanceof View ? (View) obj : null;
                if (view != null) {
                    EnumC3474b enumC3474bM7278i = C3478f.m7278i(this.f11278b, view);
                    if (enumC3474bM7278i == null) {
                        enumC3474bM7278i = EnumC3474b.f11269g;
                    }
                    if (C3478f.m7273d(this.f11278b, enumC3474bM7278i)) {
                        ValueAnimator valueAnimatorM7284s = C3478f.m7284s(view);
                        if (valueAnimatorM7284s != null) {
                            valueAnimatorM7284s.setCurrentFraction(1.0f);
                        }
                        if (C3478f.m7277h(this.f11278b, enumC3474bM7278i) && AbstractC1416l.m3825a(this.f11278b.f11284d.get(view), Boolean.TRUE)) {
                            C3478f c3478f = this.f11278b;
                            synchronized (c3478f.f11285e) {
                                C3475c c3475c = (C3475c) c3478f.f11285e.get(view);
                                str = c3475c != null ? c3475c.f11274b : null;
                                break;
                            }
                            if (str == null) {
                                Object objInvokeMethod = KavaReflector.invokeMethod(view, "getText", new Object[0]);
                                String str2 = objInvokeMethod instanceof String ? (String) objInvokeMethod : null;
                                if (str2 == null) {
                                    return;
                                } else {
                                    str = str2;
                                }
                            }
                            for (int i10 = 0; i10 < str.length(); i10++) {
                                if (Character.isDigit(str.charAt(i10))) {
                                    KavaReflector.invokeMethod(view, "setText", str);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object c3959f;
        int i9 = this.f11277a;
        EnumC3474b enumC3474b = EnumC3474b.f11270h;
        EnumC3474b enumC3474b2 = EnumC3474b.f11269g;
        C3478f c3478f = this.f11278b;
        methodHookParam.getClass();
        switch (i9) {
            case 0:
                if (!C3478f.m7271b(c3478f, null, null) && C3478f.m7273d(c3478f, enumC3474b)) {
                    Object[] objArr = methodHookParam.args;
                    Object objM8366C0 = objArr != null ? AbstractC4165l.m8366C0(1, objArr) : null;
                    Long l10 = objM8366C0 instanceof Long ? (Long) objM8366C0 : null;
                    if (l10 != null) {
                        String plainString = BigDecimal.valueOf(l10.longValue(), 2).toPlainString();
                        plainString.getClass();
                        String strM7270a = C3478f.m7270a(c3478f, enumC3474b, plainString);
                        try {
                            C3147k c3147k = C3479g.f11292a;
                            c3959f = Long.valueOf(C3479g.m7289a(strM7270a).movePointRight(2).setScale(0, RoundingMode.HALF_UP).longValue());
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        Long l11 = (Long) (c3959f instanceof C3959f ? null : c3959f);
                        if (l11 != null) {
                            C3478f.m7274e(c3478f, enumC3474b, plainString);
                            Object[] objArr2 = methodHookParam.args;
                            if (objArr2 != null) {
                                objArr2[1] = l11;
                            }
                        }
                    }
                }
                break;
            case 1:
                Object[] objArr3 = methodHookParam.args;
                Object obj = methodHookParam.thisObject;
                View view = obj instanceof View ? (View) obj : null;
                Object objM8366C02 = objArr3 != null ? AbstractC4165l.m8366C0(3, objArr3) : null;
                String str = objM8366C02 instanceof String ? (String) objM8366C02 : null;
                if (!C3478f.m7271b(c3478f, view, str) && objArr3 != null) {
                    Object field = KavaReflector.readField(AbstractC4165l.m8366C0(0, objArr3), "i");
                    String str2 = field instanceof String ? (String) field : null;
                    if (AbstractC1416l.m3825a(str2, "balance_cell")) {
                        enumC3474b = enumC3474b2;
                    } else if (!AbstractC1416l.m3825a(str2, "lqt_cell")) {
                    }
                    if (C3478f.m7273d(c3478f, enumC3474b)) {
                        if (str == null) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        String strM7275f = C3478f.m7275f(c3478f, view, enumC3474b, str);
                        String strM7281l = C3478f.m7281l(strM7275f, C3478f.m7270a(c3478f, enumC3474b, strM7275f));
                        C3478f.m7276g(c3478f, view, enumC3474b, strM7281l);
                        C3478f.m7274e(c3478f, enumC3474b, strM7275f);
                        objArr3[3] = strM7281l;
                        break;
                    }
                }
                break;
            case 2:
                Object[] objArr4 = methodHookParam.args;
                Object objM8366C03 = objArr4 != null ? AbstractC4165l.m8366C0(0, objArr4) : null;
                String str3 = objM8366C03 instanceof String ? (String) objM8366C03 : null;
                Object obj2 = methodHookParam.thisObject;
                View view2 = obj2 instanceof View ? (View) obj2 : null;
                if (!C3478f.m7271b(c3478f, view2, str3) && view2 != null) {
                    EnumC3474b enumC3474bM7278i = C3478f.m7278i(c3478f, view2);
                    if (enumC3474bM7278i != null) {
                        enumC3474b2 = enumC3474bM7278i;
                    }
                    if (C3478f.m7277h(c3478f, enumC3474b2)) {
                        View viewM7280k = C3478f.m7280k(view2);
                        if (!(viewM7280k != null ? AbstractC1416l.m3825a(c3478f.f11284d.get(viewM7280k), Boolean.TRUE) : false)) {
                        }
                    }
                    if (str3 != null && C3478f.m7273d(c3478f, enumC3474b2)) {
                        String strM7275f2 = C3478f.m7275f(c3478f, view2, enumC3474b2, str3);
                        String strM7281l2 = C3478f.m7281l(strM7275f2, C3478f.m7270a(c3478f, enumC3474b2, strM7275f2));
                        C3478f.m7276g(c3478f, view2, enumC3474b2, strM7281l2);
                        C3478f.m7274e(c3478f, enumC3474b2, strM7275f2);
                        Object[] objArr5 = methodHookParam.args;
                        if (objArr5 != null) {
                            objArr5[0] = strM7281l2;
                        }
                        break;
                    }
                }
                break;
            default:
                Object obj3 = methodHookParam.thisObject;
                View view3 = obj3 instanceof View ? (View) obj3 : null;
                if (view3 != null) {
                    EnumC3474b enumC3474bM7278i2 = C3478f.m7278i(c3478f, view3);
                    if (enumC3474bM7278i2 != null) {
                        enumC3474b2 = enumC3474bM7278i2;
                    }
                    if (C3478f.m7273d(c3478f, enumC3474b2)) {
                        ValueAnimator valueAnimatorM7284s = C3478f.m7284s(view3);
                        if (valueAnimatorM7284s != null && valueAnimatorM7284s.isStarted()) {
                            valueAnimatorM7284s.end();
                        }
                        if (view3.getParent() != null && C3478f.m7277h(c3478f, enumC3474b2)) {
                            c3478f.f11284d.put(view3, Boolean.TRUE);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
