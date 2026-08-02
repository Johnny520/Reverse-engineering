package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import com.dokar.quickjs.binding.JsObject;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.UByteArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sp0 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f10265f = 0;

    /* JADX INFO: renamed from: i */
    public static Method f10268i;

    /* JADX INFO: renamed from: j */
    public static Method f10269j;

    /* JADX INFO: renamed from: k */
    public static boolean f10270k;

    /* JADX INFO: renamed from: l */
    public static sx0 f10271l;

    /* JADX INFO: renamed from: a */
    public static final C0771uf f10260a = new C0771uf(0);

    /* JADX INFO: renamed from: b */
    public static final C0771uf f10261b = new C0771uf(1);

    /* JADX INFO: renamed from: c */
    public static final C0402kw f10262c = new C0402kw(1025014528, false, new C0558ow(10));

    /* JADX INFO: renamed from: d */
    public static final C0402kw f10263d = new C0402kw(1576937791, false, new C0920ye(19));

    /* JADX INFO: renamed from: e */
    public static final C0402kw f10264e = new C0402kw(159076582, false, new C0558ow(11));

    /* JADX INFO: renamed from: g */
    public static final C0160eb f10266g = new C0160eb(15);

    /* JADX INFO: renamed from: h */
    public static final iu0 f10267h = new iu0(2);

    /* JADX INFO: renamed from: A */
    public static final String[] m4905A(k00 k00Var) {
        k00Var.getClass();
        return (String[]) ((C0913y7) k00Var).f13326b.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: B */
    public static void m4906B(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            c80.m664g();
        }
    }

    /* JADX INFO: renamed from: C */
    public static final int m4907C(yo2 yo2Var, u21 u21Var, String str) {
        yo2Var.getClass();
        u21Var.getClass();
        str.getClass();
        m4915N(u21Var, yo2Var);
        int iMo249a = yo2Var.mo249a(str);
        if (iMo249a != -3 || !u21Var.f11072a.f2759f) {
            return iMo249a;
        }
        C0485n4 c0485n4 = u21Var.f11074c;
        C0640r1 c0640r1 = new C0640r1(22, yo2Var, u21Var);
        c0485n4.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0485n4.f6983i;
        Map map = (Map) concurrentHashMap.get(yo2Var);
        C0160eb c0160eb = f10266g;
        Object obj = map != null ? map.get(c0160eb) : null;
        Object objMo6a = obj != null ? obj : null;
        if (objMo6a == null) {
            objMo6a = c0640r1.mo6a();
            Object concurrentHashMap2 = concurrentHashMap.get(yo2Var);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(yo2Var, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c0160eb, objMo6a);
        }
        Integer num = (Integer) ((Map) objMo6a).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX INFO: renamed from: D */
    public static final int m4908D(yo2 yo2Var, u21 u21Var, String str, String str2) {
        yo2Var.getClass();
        u21Var.getClass();
        str.getClass();
        int iM4907C = m4907C(yo2Var, u21Var, str);
        if (iM4907C != -3) {
            return iM4907C;
        }
        throw new o01(yo2Var.mo250b() + " does not contain element with name '" + str + '\'' + str2);
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m4909E(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    /* JADX INFO: renamed from: F */
    public static final int m4910F(yo2 yo2Var, yo2[] yo2VarArr) {
        yo2VarArr.getClass();
        int iHashCode = (yo2Var.mo250b().hashCode() * 31) + Arrays.hashCode(yo2VarArr);
        int iMo252d = yo2Var.mo252d();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iMo252d > 0)) {
                break;
            }
            int i2 = iMo252d - 1;
            int i3 = i * 31;
            String strMo250b = yo2Var.mo256j(yo2Var.mo252d() - iMo252d).mo250b();
            if (strMo250b != null) {
                iHashCode2 = strMo250b.hashCode();
            }
            i = i3 + iHashCode2;
            iMo252d = i2;
        }
        int iMo252d2 = yo2Var.mo252d();
        int iHashCode3 = 1;
        while (true) {
            if (!(iMo252d2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iMo252d2 - 1;
            int i5 = iHashCode3 * 31;
            s11 s11VarMo251c = yo2Var.mo256j(yo2Var.mo252d() - iMo252d2).mo251c();
            iHashCode3 = i5 + (s11VarMo251c != null ? s11VarMo251c.hashCode() : 0);
            iMo252d2 = i4;
        }
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m4911G(u21 u21Var, yo2 yo2Var) {
        yo2Var.getClass();
        u21Var.getClass();
        if (u21Var.f11072a.f2754a) {
            return true;
        }
        List annotations = yo2Var.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof u31) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public static String m4912K(k30 k30Var, int i) {
        StringBuilder sb = new StringBuilder(20);
        sb.append("#");
        long jMo2047h = k30Var instanceof j30 ? ((j30) k30Var).f4885h : k30Var.mo2047h();
        if (i == 4) {
            sb.append(new String(new char[]{Character.forDigit(((int) jMo2047h) & 15, 16)}));
        } else if (i == 8) {
            sb.append(pp0.m3897I((int) jMo2047h));
        } else if (i == 16) {
            sb.append(pp0.m3898J((int) jMo2047h));
        } else if (i == 32) {
            sb.append(pp0.m3899K((int) jMo2047h));
        } else {
            if (i != 64) {
                c80.m667j("shouldn't happen");
                return null;
            }
            sb.append(pp0.m3900L(jMo2047h));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: L */
    public static String m4913L(k30 k30Var) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('#');
        if (k30Var instanceof h30) {
            sb.append("null");
        } else {
            sb.append(k30Var.mo24f());
            sb.append(' ');
            sb.append(k30Var.mo23b());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: M */
    public static int m4914M(int i, int i2) {
        if ((i & 15) != i) {
            C0676s.m4651j("low out of range 0..15");
            return 0;
        }
        if ((i2 & 15) == i2) {
            return i | (i2 << 4);
        }
        C0676s.m4651j("high out of range 0..15");
        return 0;
    }

    /* JADX INFO: renamed from: N */
    public static final void m4915N(u21 u21Var, yo2 yo2Var) {
        yo2Var.getClass();
        u21Var.getClass();
        t11.m5086l(yo2Var.mo251c(), yv2.f13632g);
    }

    /* JADX INFO: renamed from: O */
    public static final String m4916O(String str) {
        String string = pv2.m3993I0(str).toString();
        Pattern patternCompile = Pattern.compile("\\s+");
        patternCompile.getClass();
        string.getClass();
        String strReplaceAll = patternCompile.matcher(string).replaceAll("");
        strReplaceAll.getClass();
        String lowerCase = strReplaceAll.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    /* JADX INFO: renamed from: P */
    public static final void m4917P(AbstractC0255gw abstractC0255gw, View view, xm0 xm0Var) throws Throwable {
        Object x92Var;
        abstractC0255gw.getClass();
        view.getClass();
        xm0Var.getClass();
        try {
            abstractC0255gw.mo323p(view, xm0Var);
            x92Var = a83.f116a;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thM6237a = y92.m6237a(x92Var);
        if (thM6237a == null) {
            return;
        }
        pp1 pp1Var = pp1.f8445a;
        pp1.m3936h(abstractC0255gw, "ui_click", thM6237a, "Hooker UI click failed");
        throw thM6237a;
    }

    /* JADX INFO: renamed from: Q */
    public static short m4918Q(a40 a40Var, int i) {
        if ((i & 255) != i) {
            C0676s.m4651j("arg out of range 0..255");
            return (short) 0;
        }
        int i2 = a40Var.f46b.f7598a;
        if ((i2 & 255) == i2) {
            return (short) (i2 | (i << 8));
        }
        C0676s.m4651j("opcode out of range 0..255");
        return (short) 0;
    }

    /* JADX INFO: renamed from: R */
    public static final boolean m4919R(Context context, String str) {
        Object x92Var;
        context.getClass();
        str.getClass();
        String string = pv2.m3993I0(str).toString();
        if (pv2.m4006s0(string)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(string);
            uri.getClass();
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            x92Var = a83.f116a;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        return !(x92Var instanceof x92);
    }

    /* JADX INFO: renamed from: S */
    public static final JsObject m4920S(String str, Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof JsObject) {
            return (JsObject) obj;
        }
        c80.m672p("INVALID_ARGUMENT", str.concat(" must be an object when configured."), 0, null, null, 28);
        return null;
    }

    /* JADX INFO: renamed from: T */
    public static final String m4921T(JsObject jsObject, String str) {
        Object obj = jsObject.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        c80.m672p("INVALID_ARGUMENT", str.concat(" must be a string when configured."), 0, null, null, 28);
        return null;
    }

    /* JADX INFO: renamed from: U */
    public static String m4922U(s72 s72Var) {
        int length = s72Var.f5590i.length;
        StringBuilder sb = new StringBuilder((length * 5) + 2);
        sb.append('{');
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(((r72) s72Var.m2693e(i)).m4402g());
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: V */
    public static String m4923V(s72 s72Var) {
        int i;
        int i2;
        int length = s72Var.f5590i.length;
        StringBuilder sb = new StringBuilder(30);
        sb.append("{");
        if (length != 0) {
            if (length != 1) {
                r72 r72VarM4399e = (r72) s72Var.m2693e(length - 1);
                if (r72VarM4399e.m4400d() == 2 && i != (i2 = (i = r72VarM4399e.f9419h) + 1)) {
                    r72VarM4399e = r72.m4399e(i2, r72VarM4399e.f9420i);
                }
                sb.append(((r72) s72Var.m2693e(0)).m4402g());
                sb.append("..");
                sb.append(r72VarM4399e.m4402g());
            } else {
                sb.append(((r72) s72Var.m2693e(0)).m4402g());
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: W */
    public static final void m4924W(t60 t60Var) {
        C0119d6 c0119d6;
        r61 r61VarM4933c0 = m4933c0(t60Var);
        if (r61VarM4933c0.f9360A || (c0119d6 = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61VarM4933c0)).f666U) == null) {
            return;
        }
        c0119d6.f1878k.f8751b.m1313v(r61VarM4933c0.f9385i, new C0080c6(c0119d6, r61VarM4933c0));
    }

    /* JADX INFO: renamed from: X */
    public static final boolean m4925X(String str, Object obj) {
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        c80.m672p("INVALID_ARGUMENT", str.concat(" must be a boolean."), 0, null, null, 28);
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public static final byte[] m4926Y(String str, Object obj) {
        if (obj instanceof UByteArray) {
            byte[] bArr = ((UByteArray) obj).f5697h;
            return Arrays.copyOf(bArr, bArr.length);
        }
        if (obj instanceof byte[]) {
            byte[] bArr2 = (byte[]) obj;
            return Arrays.copyOf(bArr2, bArr2.length);
        }
        c80.m672p("INVALID_ARGUMENT", str.concat(" must be a Uint8Array."), 0, null, null, 28);
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public static final zn1 m4927Z(t60 t60Var, int i) {
        zn1 zn1Var = ((th1) t60Var).f10757h.f10764o;
        zn1Var.getClass();
        if (zn1Var.mo2843S0() != t60Var || !ao1.m244g(i)) {
            return zn1Var;
        }
        zn1 zn1Var2 = zn1Var.f13986w;
        zn1Var2.getClass();
        return zn1Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m4928a(float f, float f2, float f3, float f4, AbstractC0708su abstractC0708su) {
        int i;
        int i2;
        int i3;
        float fMo1720b;
        float fMo1719a;
        int i4;
        int i5;
        int i6;
        int i7;
        float fMo1720b2;
        float fMo1719a2;
        int i8;
        int i9;
        int i10;
        float f5;
        if (abstractC0708su.mo2624c()) {
            float f6 = f4 < 0.0f ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i11 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f < 0.0f ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i12 = i11 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i13 = i12 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            long j = ((long) (i13 | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i14 = C0363ju.f5218h;
            return j;
        }
        if (((int) (abstractC0708su.f10369b >> 32)) != 3) {
            jz0.m2596a("Color only works with ColorSpaces with 3 components");
        }
        int i15 = abstractC0708su.f10370c;
        if (i15 == -1) {
            jz0.m2596a("Unknown color space, please use a color space in ColorSpaces");
        }
        float fMo1720b3 = abstractC0708su.mo1720b(0);
        float fMo1719a3 = abstractC0708su.mo1719a(0);
        if (f >= fMo1720b3) {
            fMo1720b3 = f;
        }
        if (fMo1720b3 <= fMo1719a3) {
            fMo1719a3 = fMo1720b3;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(fMo1719a3);
        int i16 = iFloatToRawIntBits >>> 31;
        int i17 = (iFloatToRawIntBits >>> 23) & 255;
        int i18 = iFloatToRawIntBits & 8388607;
        if (i17 == 255) {
            i2 = i18 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i17 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i19 = i18 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i19) + 1) | (i16 << 15);
                    short s = (short) i3;
                    fMo1720b = abstractC0708su.mo1720b(1);
                    fMo1719a = abstractC0708su.mo1719a(1);
                    if (f2 >= fMo1720b) {
                        fMo1720b = f2;
                    }
                    if (fMo1720b <= fMo1719a) {
                        fMo1719a = fMo1720b;
                    }
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo1719a);
                    int i20 = iFloatToRawIntBits2 >>> 31;
                    i4 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i21 = iFloatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i21 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i22 = i21 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i22) + 1) | (i20 << 15);
                                short s2 = (short) i7;
                                fMo1720b2 = abstractC0708su.mo1720b(2);
                                fMo1719a2 = abstractC0708su.mo1719a(2);
                                if (f3 >= fMo1720b2) {
                                    fMo1720b2 = f3;
                                }
                                if (fMo1720b2 <= fMo1719a2) {
                                    fMo1719a2 = fMo1720b2;
                                }
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(fMo1719a2);
                                int i23 = iFloatToRawIntBits3 >>> 31;
                                i8 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i24 = 8388607 & iFloatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i24 != 0 ? 512 : 0;
                                    i = 31;
                                } else {
                                    int i25 = i8 - 112;
                                    if (i25 >= 31) {
                                        i9 = 0;
                                        i = 49;
                                    } else if (i25 > 0) {
                                        int i26 = i24 >> 13;
                                        if ((iFloatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i25 << 10) | i26) + 1) | (i23 << 15);
                                            short s3 = (short) i10;
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            long j2 = (((long) i15) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i27 = C0363ju.f5218h;
                                            return j2;
                                        }
                                        i9 = i26;
                                        i = i25;
                                    } else if (i25 >= -10) {
                                        int i28 = (i24 | 8388608) >> (1 - i25);
                                        if ((i28 & 4096) != 0) {
                                            i28 += 8192;
                                        }
                                        i9 = i28 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i23 << 15) | (i << 10);
                                short s32 = (short) i10;
                                if (f4 >= 0.0f) {
                                }
                                long j22 = (((long) i15) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s32)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i272 = C0363ju.f5218h;
                                return j22;
                            }
                            i6 = i22;
                        } else if (i5 >= -10) {
                            int i29 = (i21 | 8388608) >> (1 - i5);
                            if ((i29 & 4096) != 0) {
                                i29 += 8192;
                            }
                            i6 = i29 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i20 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    fMo1720b2 = abstractC0708su.mo1720b(2);
                    fMo1719a2 = abstractC0708su.mo1719a(2);
                    if (f3 >= fMo1720b2) {
                    }
                    if (fMo1720b2 <= fMo1719a2) {
                    }
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(fMo1719a2);
                    int i232 = iFloatToRawIntBits32 >>> 31;
                    i8 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i242 = 8388607 & iFloatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i232 << 15) | (i << 10);
                    short s322 = (short) i10;
                    if (f4 >= 0.0f) {
                    }
                    long j222 = (((long) i15) & 63) | ((((long) s) & 65535) << 48) | ((((long) s22) & 65535) << 32) | ((65535 & ((long) s322)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i2722 = C0363ju.f5218h;
                    return j222;
                }
                i2 = i19;
            } else if (i >= -10) {
                int i30 = (i18 | 8388608) >> (1 - i);
                if ((i30 & 4096) != 0) {
                    i30 += 8192;
                }
                i2 = i30 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i16 << 15) | (i << 10);
        short s4 = (short) i3;
        fMo1720b = abstractC0708su.mo1720b(1);
        fMo1719a = abstractC0708su.mo1719a(1);
        if (f2 >= fMo1720b) {
        }
        if (fMo1720b <= fMo1719a) {
        }
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(fMo1719a);
        int i202 = iFloatToRawIntBits22 >>> 31;
        i4 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i212 = iFloatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i202 << 15) | (i5 << 10);
        short s222 = (short) i7;
        fMo1720b2 = abstractC0708su.mo1720b(2);
        fMo1719a2 = abstractC0708su.mo1719a(2);
        if (f3 >= fMo1720b2) {
        }
        if (fMo1720b2 <= fMo1719a2) {
        }
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(fMo1719a2);
        int i2322 = iFloatToRawIntBits322 >>> 31;
        i8 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i2422 = 8388607 & iFloatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2322 << 15) | (i << 10);
        short s3222 = (short) i10;
        if (f4 >= 0.0f) {
        }
        long j2222 = (((long) i15) & 63) | ((((long) s4) & 65535) << 48) | ((((long) s222) & 65535) << 32) | ((65535 & ((long) s3222)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i27222 = C0363ju.f5218h;
        return j2222;
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m4929a0(int i, Object[] objArr) {
        objArr.getClass();
        if (objArr.length == i) {
            return;
        }
        throw new sd2("INVALID_ARGUMENT", "Expected " + i + " arguments, received " + objArr.length + ".", false, null, null, 28);
    }

    /* JADX INFO: renamed from: b */
    public static final long m4930b(int i) {
        long j = ((long) i) << 32;
        int i2 = C0363ju.f5218h;
        return j;
    }

    /* JADX INFO: renamed from: b0 */
    public static final zn1 m4931b0(t60 t60Var) {
        if (!((th1) t60Var).f10757h.f10770u) {
            kz0.m2764b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        zn1 zn1VarM4927Z = m4927Z(t60Var, 2);
        if (!zn1VarM4927Z.mo2843S0().f10770u) {
            kz0.m2764b("LayoutCoordinates is not attached.");
        }
        return zn1VarM4927Z;
    }

    /* JADX INFO: renamed from: c */
    public static final long m4932c(long j) {
        long j2 = j << 32;
        int i = C0363ju.f5218h;
        return j2;
    }

    /* JADX INFO: renamed from: c0 */
    public static final r61 m4933c0(t60 t60Var) {
        zn1 zn1Var = ((th1) t60Var).f10757h.f10764o;
        if (zn1Var != null) {
            return zn1Var.f13985v;
        }
        throw vi0.m5686e("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX INFO: renamed from: d */
    public static long m4934d(int i, int i2, int i3) {
        return m4930b(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    /* JADX INFO: renamed from: d0 */
    public static final long m4935d0(Object obj, String str, long j, long j2) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number == null) {
            c80.m672p("INVALID_ARGUMENT", str.concat(" must be a number."), 0, null, null, 28);
            return 0L;
        }
        double dDoubleValue = number.doubleValue();
        if (Math.abs(dDoubleValue) > Double.MAX_VALUE || dDoubleValue % 1.0d != 0.0d) {
            c80.m672p("INVALID_ARGUMENT", str.concat(" must be a finite integer."), 0, null, null, 28);
            return 0L;
        }
        long j3 = (long) dDoubleValue;
        if (j <= j3 && j3 <= j2) {
            return j3;
        }
        throw new sd2("INVALID_ARGUMENT", str + " must be between " + j + " and " + j2 + ".", false, null, null, 28);
    }

    /* JADX INFO: renamed from: e */
    public static final C0913y7 m4936e(String str) {
        return new C0913y7(t11.m5065Q(str));
    }

    /* JADX INFO: renamed from: e0 */
    public static final JsObject m4937e0(String str, Object obj) {
        JsObject jsObject = obj instanceof JsObject ? (JsObject) obj : null;
        if (jsObject != null) {
            return jsObject;
        }
        c80.m672p("INVALID_ARGUMENT", str.concat(" must be an object."), 0, null, null, 28);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final long m4938f(int i) {
        long j = ((long) i) << 32;
        int i2 = b51.f580O;
        return j;
    }

    /* JADX INFO: renamed from: f0 */
    public static final zv1 m4939f0(t60 t60Var) {
        zv1 zv1Var = m4933c0(t60Var).f9397u;
        if (zv1Var != null) {
            return zv1Var;
        }
        throw vi0.m5686e("This node does not have an owner.");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4940g(String str, uh1 uh1Var, String str2, mn0 mn0Var, mn0 mn0Var2, mn0 mn0Var3, boolean z, xm0 xm0Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i, int i2) {
        int i3;
        int i4;
        mn0 mn0Var4;
        int i5;
        mn0 mn0Var5;
        int i6;
        mn0 mn0Var6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        uh1 uh1Var2;
        boolean z2;
        xm0 xm0Var2;
        go0 go0Var;
        mn0 mn0Var7;
        String str3;
        mn0 mn0Var8;
        b62 b62VarM1996r;
        String str4;
        boolean z3;
        uh1 uh1VarM5287O;
        rh1 rh1Var;
        xm0 xm0Var3;
        mn0 mn0Var9;
        String str5;
        boolean z4;
        C0771uf c0771uf = tp0.f10874a;
        C0622qk c0622qk = C0700sn.f10232t;
        yi0 yi0Var = AbstractC0731te.f10693e;
        str.getClass();
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1967X(-1320254907);
        if ((i & 6) == 0) {
            i3 = (go0Var2.m1980f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i3 | 48;
        int i13 = i2 & 4;
        if (i13 != 0) {
            i12 = i3 | 432;
        } else {
            if ((i & 384) == 0) {
                i12 |= go0Var2.m1980f(str2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i12 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    mn0Var4 = mn0Var;
                    i12 |= go0Var2.m1984h(mn0Var4) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i12 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        mn0Var5 = mn0Var2;
                        i12 |= go0Var2.m1984h(mn0Var5) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i12 |= 196608;
                    } else {
                        if ((196608 & i) == 0) {
                            mn0 mn0Var10 = mn0Var3;
                            i12 |= go0Var2.m1984h(mn0Var10) ? 131072 : 65536;
                            mn0Var6 = mn0Var10;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i12 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i12 |= go0Var2.m1982g(z) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i12 |= 12582912;
                        } else {
                            if ((i & 12582912) == 0) {
                                i9 = i8;
                                i12 |= go0Var2.m1984h(xm0Var) ? 8388608 : 4194304;
                            }
                            i10 = i2 & 256;
                            if (i10 != 0) {
                                if ((i & 100663296) == 0) {
                                    i11 = i10;
                                    i12 |= go0Var2.m1984h(in0Var) ? 67108864 : 33554432;
                                }
                                if (go0Var2.m1958O(i12 & 1, (i12 & 38347923) != 38347922)) {
                                    String str6 = i13 != 0 ? null : str2;
                                    if (i4 != 0) {
                                        mn0Var4 = null;
                                    }
                                    if (i5 != 0) {
                                        mn0Var5 = null;
                                    }
                                    if (i6 != 0) {
                                        mn0Var6 = null;
                                    }
                                    boolean z5 = i7 != 0 ? true : z;
                                    xm0 xm0Var4 = i9 != 0 ? null : xm0Var;
                                    in0 in0Var2 = i11 == 0 ? in0Var : null;
                                    int i14 = 6;
                                    rh1 rh1Var2 = rh1.f9587a;
                                    if (!z5) {
                                        str4 = str6;
                                        uh1VarM5287O = rh1Var2;
                                        z3 = z5;
                                    } else if (in0Var2 != null) {
                                        str4 = str6;
                                        z3 = z5;
                                        uh1VarM5287O = AbstractC0738tl.m5320s(rh1Var2, new hp1(i14, in0Var2, true));
                                    } else {
                                        str4 = str6;
                                        z3 = z5;
                                        uh1VarM5287O = xm0Var4 != null ? AbstractC0738tl.m5287O(rh1Var2, xm0Var4) : rh1Var2;
                                    }
                                    if (mn0Var6 == null) {
                                        go0Var2.m1966W(1597230910);
                                        uh1 uh1VarM1612D = fg1.m1612D(yi0Var.mo4491c(uh1VarM5287O), 14.0f, 12.0f);
                                        ob2 ob2VarM3265a = nb2.m3265a(c0771uf, c0622qk, go0Var2, 48);
                                        in0Var = in0Var2;
                                        int iHashCode = Long.hashCode(go0Var2.f3614T);
                                        yy1 yy1VarM1990l = go0Var2.m1990l();
                                        uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var2, uh1VarM1612D);
                                        InterfaceC0293hx.f4166c.getClass();
                                        C0367jy c0367jy = C0256gx.f3727b;
                                        go0Var2.m1969Z();
                                        if (go0Var2.f3613S) {
                                            go0Var2.m1989k(c0367jy);
                                        } else {
                                            go0Var2.m1987i0();
                                        }
                                        yf3.m6268c(go0Var2, C0256gx.f3730e, ob2VarM3265a);
                                        yf3.m6268c(go0Var2, C0256gx.f3729d, yy1VarM1990l);
                                        yf3.m6268c(go0Var2, C0256gx.f3731f, Integer.valueOf(iHashCode));
                                        yf3.m6267b(go0Var2, C0256gx.f3732g);
                                        yf3.m6268c(go0Var2, C0256gx.f3728c, uh1VarM5285M);
                                        m4942h(str, str4, mn0Var4, mn0Var5, z3, go0Var2, 6 | ((i12 << 3) & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | ((i12 >> 3) & 458752));
                                        str5 = str4;
                                        z4 = z3;
                                        go0Var2.m1994p(true);
                                        go0Var2.m1994p(false);
                                        rh1Var = rh1Var2;
                                        xm0Var3 = xm0Var4;
                                        mn0Var9 = mn0Var5;
                                    } else {
                                        boolean z6 = z3;
                                        in0Var = in0Var2;
                                        String str7 = str4;
                                        go0Var2.m1966W(1597751772);
                                        ob2 ob2VarM3265a2 = nb2.m3265a(c0771uf, c0622qk, go0Var2, 48);
                                        rh1Var = rh1Var2;
                                        int iHashCode2 = Long.hashCode(go0Var2.f3614T);
                                        yy1 yy1VarM1990l2 = go0Var2.m1990l();
                                        uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var2, yi0Var);
                                        InterfaceC0293hx.f4166c.getClass();
                                        C0367jy c0367jy2 = C0256gx.f3727b;
                                        go0Var2.m1969Z();
                                        mn0 mn0Var11 = mn0Var4;
                                        if (go0Var2.f3613S) {
                                            go0Var2.m1989k(c0367jy2);
                                        } else {
                                            go0Var2.m1987i0();
                                        }
                                        C0419lc c0419lc = C0256gx.f3730e;
                                        yf3.m6268c(go0Var2, c0419lc, ob2VarM3265a2);
                                        C0419lc c0419lc2 = C0256gx.f3729d;
                                        yf3.m6268c(go0Var2, c0419lc2, yy1VarM1990l2);
                                        Integer numValueOf = Integer.valueOf(iHashCode2);
                                        C0419lc c0419lc3 = C0256gx.f3731f;
                                        yf3.m6268c(go0Var2, c0419lc3, numValueOf);
                                        C0799v6 c0799v6 = C0256gx.f3732g;
                                        yf3.m6267b(go0Var2, c0799v6);
                                        C0419lc c0419lc4 = C0256gx.f3728c;
                                        yf3.m6268c(go0Var2, c0419lc4, uh1VarM5285M2);
                                        xm0Var3 = xm0Var4;
                                        mn0Var9 = mn0Var5;
                                        uh1 uh1VarM1614F = fg1.m1614F(new g71(1.0f, true).mo4491c(uh1VarM5287O), 14.0f, 12.0f, 10.0f, 12.0f);
                                        ob2 ob2VarM3265a3 = nb2.m3265a(c0771uf, c0622qk, go0Var2, 48);
                                        int iHashCode3 = Long.hashCode(go0Var2.f3614T);
                                        yy1 yy1VarM1990l3 = go0Var2.m1990l();
                                        uh1 uh1VarM5285M3 = AbstractC0738tl.m5285M(go0Var2, uh1VarM1614F);
                                        go0Var2.m1969Z();
                                        if (go0Var2.f3613S) {
                                            go0Var2.m1989k(c0367jy2);
                                        } else {
                                            go0Var2.m1987i0();
                                        }
                                        yf3.m6268c(go0Var2, c0419lc, ob2VarM3265a3);
                                        yf3.m6268c(go0Var2, c0419lc2, yy1VarM1990l3);
                                        vi0.m5698q(iHashCode3, go0Var2, c0419lc3, go0Var2, c0799v6);
                                        yf3.m6268c(go0Var2, c0419lc4, uh1VarM5285M3);
                                        m4942h(str, str7, mn0Var11, mn0Var9, z6, go0Var2, 6 | ((i12 << 3) & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | ((i12 >> 3) & 458752));
                                        str5 = str7;
                                        mn0Var4 = mn0Var11;
                                        z4 = z6;
                                        go0Var2.m1994p(true);
                                        mn0Var6.mo12g(go0Var2, Integer.valueOf((i12 >> 15) & 14));
                                        go0Var2.m1994p(true);
                                        go0Var2.m1994p(false);
                                    }
                                    go0Var = go0Var2;
                                    str3 = str5;
                                    z2 = z4;
                                    uh1Var2 = rh1Var;
                                    xm0Var2 = xm0Var3;
                                    mn0Var7 = mn0Var9;
                                    mn0Var8 = mn0Var6;
                                } else {
                                    go0Var2.m1961R();
                                    uh1Var2 = uh1Var;
                                    z2 = z;
                                    xm0Var2 = xm0Var;
                                    go0Var = go0Var2;
                                    mn0Var7 = mn0Var5;
                                    str3 = str2;
                                    mn0Var8 = mn0Var6;
                                }
                                mn0 mn0Var12 = mn0Var4;
                                mn0 mn0Var13 = mn0Var8;
                                in0 in0Var3 = in0Var;
                                b62VarM1996r = go0Var.m1996r();
                                if (b62VarM1996r != null) {
                                    b62VarM1996r.f616d = new zp1(str, uh1Var2, str3, mn0Var12, mn0Var7, mn0Var13, z2, xm0Var2, in0Var3, i, i2);
                                    return;
                                }
                                return;
                            }
                            i12 |= 100663296;
                            i11 = i10;
                            if (go0Var2.m1958O(i12 & 1, (i12 & 38347923) != 38347922)) {
                            }
                            mn0 mn0Var122 = mn0Var4;
                            mn0 mn0Var132 = mn0Var8;
                            in0 in0Var32 = in0Var;
                            b62VarM1996r = go0Var.m1996r();
                            if (b62VarM1996r != null) {
                            }
                        }
                        i9 = i8;
                        i10 = i2 & 256;
                        if (i10 != 0) {
                        }
                        i11 = i10;
                        if (go0Var2.m1958O(i12 & 1, (i12 & 38347923) != 38347922)) {
                        }
                        mn0 mn0Var1222 = mn0Var4;
                        mn0 mn0Var1322 = mn0Var8;
                        in0 in0Var322 = in0Var;
                        b62VarM1996r = go0Var.m1996r();
                        if (b62VarM1996r != null) {
                        }
                    }
                    mn0Var6 = mn0Var3;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    i10 = i2 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if (go0Var2.m1958O(i12 & 1, (i12 & 38347923) != 38347922)) {
                    }
                    mn0 mn0Var12222 = mn0Var4;
                    mn0 mn0Var13222 = mn0Var8;
                    in0 in0Var3222 = in0Var;
                    b62VarM1996r = go0Var.m1996r();
                    if (b62VarM1996r != null) {
                    }
                }
                mn0Var5 = mn0Var2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                mn0Var6 = mn0Var3;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                i11 = i10;
                if (go0Var2.m1958O(i12 & 1, (i12 & 38347923) != 38347922)) {
                }
                mn0 mn0Var122222 = mn0Var4;
                mn0 mn0Var132222 = mn0Var8;
                in0 in0Var32222 = in0Var;
                b62VarM1996r = go0Var.m1996r();
                if (b62VarM1996r != null) {
                }
            }
            mn0Var4 = mn0Var;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mn0Var5 = mn0Var2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            mn0Var6 = mn0Var3;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            if (go0Var2.m1958O(i12 & 1, (i12 & 38347923) != 38347922)) {
            }
            mn0 mn0Var1222222 = mn0Var4;
            mn0 mn0Var1322222 = mn0Var8;
            in0 in0Var322222 = in0Var;
            b62VarM1996r = go0Var.m1996r();
            if (b62VarM1996r != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        mn0Var4 = mn0Var;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mn0Var5 = mn0Var2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        mn0Var6 = mn0Var3;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        if (go0Var2.m1958O(i12 & 1, (i12 & 38347923) != 38347922)) {
        }
        mn0 mn0Var12222222 = mn0Var4;
        mn0 mn0Var13222222 = mn0Var8;
        in0 in0Var3222222 = in0Var;
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static final String m4941g0(String str, Object obj) {
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 != null) {
            return str2;
        }
        c80.m672p("INVALID_ARGUMENT", str.concat(" must be a string."), 0, null, null, 28);
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final void m4942h(String str, String str2, mn0 mn0Var, mn0 mn0Var2, boolean z, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var;
        mn0 mn0Var3;
        long j;
        rh1 rh1Var;
        boolean z2;
        go0 go0Var2;
        mn0 mn0Var4 = mn0Var2;
        go0 go0Var3 = (go0) interfaceC0596px;
        go0Var3.m1967X(1848673515);
        int i3 = i & 6;
        pb2 pb2Var = pb2.f8246a;
        if (i3 == 0) {
            i2 = (go0Var3.m1980f(pb2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var3.m1980f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var3.m1980f(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go0Var3.m1984h(mn0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go0Var3.m1984h(mn0Var4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= go0Var3.m1982g(z) ? 131072 : 65536;
        }
        int i4 = i2;
        if (go0Var3.m1958O(i4 & 1, (i4 & 74899) != 74898)) {
            rh1 rh1Var2 = rh1.f9587a;
            if (mn0Var != null) {
                go0Var3.m1966W(-532726615);
                mn0Var.mo12g(go0Var3, Integer.valueOf((i4 >> 9) & 14));
                rp0.m4529O(go0Var3, AbstractC0731te.m5231q0(rh1Var2, 12.0f));
                go0Var3.m1994p(false);
            } else {
                go0Var3.m1966W(-532651657);
                go0Var3.m1994p(false);
            }
            uh1 uh1VarM3843a = pb2.m3843a(pb2Var);
            C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var3, 0);
            int iHashCode = Long.hashCode(go0Var3.f3614T);
            yy1 yy1VarM1990l = go0Var3.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var3, uh1VarM3843a);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var3.m1969Z();
            if (go0Var3.f3613S) {
                go0Var3.m1989k(c0367jy);
            } else {
                go0Var3.m1987i0();
            }
            yf3.m6268c(go0Var3, C0256gx.f3730e, c0032avM6346a);
            yf3.m6268c(go0Var3, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var3, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var3, C0256gx.f3732g);
            yf3.m6268c(go0Var3, C0256gx.f3728c, uh1VarM5285M);
            if (z) {
                go0Var3.m1966W(-1063527380);
                j = ((lp1) go0Var3.m1988j(ur1.f11452a)).f6237e;
            } else {
                go0Var3.m1966W(-1063526290);
                j = ((lp1) go0Var3.m1988j(ur1.f11452a)).f6238f;
            }
            go0Var3.m1994p(false);
            v03.m5601b(str, null, j, rg3.m4450D(15), im0.f4682l, 0L, rg3.m4450D(20), 0, false, 0, 0, null, go0Var3, ((i4 >> 3) & 14) | 1597440, 48, 260010);
            go0 go0Var4 = go0Var3;
            if (str2 != null) {
                go0Var4.m1966W(1390593043);
                rp0.m4529O(go0Var4, AbstractC0731te.m5186O(rh1Var2, 3.0f));
                rh1Var = rh1Var2;
                v03.m5601b(str2, null, ((lp1) go0Var4.m1988j(ur1.f11452a)).f6238f, rg3.m4450D(12), im0.f4680j, 0L, rg3.m4450D(17), 0, false, 0, 0, null, go0Var4, ((i4 >> 6) & 14) | 1597440, 48, 260010);
                go0 go0Var5 = go0Var4;
                z2 = false;
                go0Var5.m1994p(false);
                go0Var2 = go0Var5;
            } else {
                rh1Var = rh1Var2;
                z2 = false;
                go0Var4.m1966W(1390883265);
                go0Var4.m1994p(false);
                go0Var2 = go0Var4;
            }
            go0Var2.m1994p(true);
            mn0 mn0Var5 = mn0Var2;
            if (mn0Var5 != null) {
                go0Var2.m1966W(-531978523);
                rp0.m4529O(go0Var2, AbstractC0731te.m5231q0(rh1Var, 12.0f));
                mn0Var5.mo12g(go0Var2, Integer.valueOf((i4 >> 12) & 14));
                go0Var2.m1994p(z2);
                mn0Var3 = mn0Var5;
                go0Var = go0Var2;
            } else {
                go0Var2.m1966W(-531899721);
                go0Var2.m1994p(z2);
                mn0Var3 = mn0Var5;
                go0Var = go0Var2;
            }
        } else {
            go0Var3.m1961R();
            mn0Var3 = mn0Var4;
            go0Var = go0Var3;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new gr1(str, str2, mn0Var, mn0Var3, z, i, 1);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m4943h0(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4944i(final boolean z, final in0 in0Var, uh1 uh1Var, boolean z2, int i, InterfaceC0596px interfaceC0596px, final int i2, final int i3) {
        uh1 uh1Var2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        final int i7;
        b62 b62VarM1996r;
        int i8;
        final int i9;
        bk1 bk1Var;
        long jM2565b;
        gd0 gd0Var;
        float f;
        gu2 gu2Var;
        gu2 gu2Var2;
        long jM2565b2;
        uh1 uh1Var3;
        in0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1094553456);
        int i10 = (go0Var.m1982g(z) ? 4 : 2) | i2 | (go0Var.m1984h(in0Var) ? 32 : 16);
        int i11 = i3 & 4;
        if (i11 == 0) {
            if ((i2 & 384) == 0) {
                uh1Var2 = uh1Var;
                i10 |= go0Var.m1980f(uh1Var2) ? 256 : 128;
            }
            i4 = i3 & 8;
            if (i4 == 0) {
                i5 = i10 | 3072;
                z3 = z2;
            } else {
                z3 = z2;
                i5 = i10 | (go0Var.m1982g(z3) ? 2048 : 1024);
            }
            i6 = i5 | 90112;
            if (go0Var.m1958O(i6 & 1, (74899 & i6) == 74898)) {
                go0Var.m1961R();
                i7 = i;
            } else {
                go0Var.m1963T();
                int i12 = i2 & 1;
                rh1 rh1Var = rh1.f9587a;
                if (i12 == 0 || go0Var.m2003y()) {
                    if (i11 != 0) {
                        uh1Var2 = rh1Var;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    i8 = i6 & (-458753);
                    i9 = 21;
                } else {
                    go0Var.m1961R();
                    i8 = i6 & (-458753);
                    i9 = i;
                }
                go0Var.m1995q();
                lp1 lp1Var = (lp1) go0Var.m1988j(ur1.f11452a);
                final bs0 bs0Var = (bs0) go0Var.m1988j(AbstractC0441ly.f6386l);
                go0Var.m1966W(401128866);
                final boolean zBooleanValue = ((Boolean) go0Var.m1988j(ur1.f11453b)).booleanValue();
                go0Var.m1994p(false);
                Object objM1956L = go0Var.m1956L();
                C0160eb c0160eb = C0520nx.f7360a;
                if (objM1956L == c0160eb) {
                    objM1956L = new bk1();
                    go0Var.m1981f0(objM1956L);
                }
                bk1 bk1Var2 = (bk1) objM1956L;
                xk1 xk1VarM4484t = rg3.m4484t(bk1Var2, go0Var);
                if (z) {
                    bk1Var = bk1Var2;
                    jM2565b = C0363ju.m2565b(lp1Var.f6233a ? 0.24f : 0.32f, lp1Var.f6239g);
                } else {
                    bk1Var = bk1Var2;
                    jM2565b = C0363ju.m2565b(lp1Var.f6233a ? 0.18f : 0.26f, lp1Var.f6238f);
                }
                if (z3) {
                    jM2565b = z ? lp1Var.f6239g : lp1Var.f6236d;
                }
                int i13 = i8;
                gu2 gu2VarM269a = ar2.m269a(jM2565b, up0.m5531J(180, null, 6), "TrackColorAnimation", go0Var);
                float f2 = (((Boolean) xk1VarM4484t.getValue()).booleanValue() && z3) ? 27.0f : z ? 24.0f : 22.0f;
                float f3 = (((Boolean) xk1VarM4484t.getValue()).booleanValue() && z3) ? 20.0f : 22.0f;
                gu2 gu2VarM5480a = AbstractC0768uc.m5480a(z ? 42.0f - f2 : 0.0f, up0.m5528G(0.5f, 400.0f, null, 4), "ThumbOffsetAnimation", go0Var);
                gu2 gu2VarM5480a2 = AbstractC0768uc.m5480a(f2, up0.m5528G(0.5f, 1500.0f, null, 4), "ThumbWidthAnimation", go0Var);
                gu2 gu2VarM5480a3 = AbstractC0768uc.m5480a(f3, up0.m5528G(0.5f, 1500.0f, null, 4), "ThumbHeightAnimation", go0Var);
                if (!z3) {
                    gd0Var = null;
                    f = 0.0f;
                } else if (((Boolean) xk1VarM4484t.getValue()).booleanValue()) {
                    gd0Var = null;
                    f = 1.0f;
                } else if (z) {
                    f = 5.0f;
                    gd0Var = null;
                } else {
                    gd0Var = null;
                    f = 3.0f;
                }
                gu2 gu2VarM5480a4 = AbstractC0768uc.m5480a(f, up0.m5531J(180, gd0Var, 6), "ThumbElevationAnimation", go0Var);
                gu2 gu2VarM5481b = AbstractC0768uc.m5481b((((Boolean) xk1VarM4484t.getValue()).booleanValue() && z3) ? 0.98f : 1.0f, up0.m5528G(0.5f, 1500.0f, null, 4), "TrackScaleXAnimation", go0Var, 3120);
                gu2 gu2VarM5481b2 = AbstractC0768uc.m5481b((((Boolean) xk1VarM4484t.getValue()).booleanValue() && z3) ? 1.04f : 1.0f, up0.m5528G(0.5f, 1500.0f, null, 4), "TrackScaleYAnimation", go0Var, 3120);
                gu2 gu2VarM5480a5 = AbstractC0768uc.m5480a(z ? 22.0f : 2.0f, up0.m5528G(0.5f, 200.0f, null, 4), "HighlightOffsetAnimation", go0Var);
                gu2 gu2VarM5481b3 = AbstractC0768uc.m5481b(!z3 ? 0.0f : z ? 0.28f : 0.12f, up0.m5531J(180, null, 6), "HighlightAlphaAnimation", go0Var, 3120);
                if (z3) {
                    jM2565b2 = C0363ju.f5213c;
                    gu2Var = gu2VarM5481b3;
                    gu2Var2 = gu2VarM5480a4;
                } else if (z) {
                    gu2Var = gu2VarM5481b3;
                    gu2Var2 = gu2VarM5480a4;
                    jM2565b2 = C0363ju.m2565b(lp1Var.f6233a ? 0.74f : 0.86f, lp1Var.f6239g);
                } else {
                    gu2Var = gu2VarM5481b3;
                    gu2Var2 = gu2VarM5480a4;
                    jM2565b2 = C0363ju.m2565b(lp1Var.f6233a ? 0.58f : 0.76f, lp1Var.f6238f);
                }
                long j = jM2565b2;
                uh1 uh1VarM5213h0 = AbstractC0731te.m5213h0(uh1Var2, 48.0f, 28.0f);
                boolean zM1980f = go0Var.m1980f(gu2VarM5481b) | go0Var.m1980f(gu2VarM5481b2);
                Object objM1956L2 = go0Var.m1956L();
                if (zM1980f || objM1956L2 == c0160eb) {
                    objM1956L2 = new er1(gu2VarM5481b, gu2VarM5481b2, 1);
                    go0Var.m1981f0(objM1956L2);
                }
                uh1 uh1VarM5183L = AbstractC0731te.m5183L(uh1VarM5213h0, (in0) objM1956L2);
                fb2 fb2Var = gb2.f3387a;
                uh1 uh1VarM1896n = gf1.m1896n(ci0.m825z(uh1VarM5183L, fb2Var), ((C0363ju) gu2VarM269a.getValue()).f5219a, f10267h);
                boolean zM1982g = go0Var.m1982g(zBooleanValue) | go0Var.m1984h(bs0Var) | go0Var.m1976d(i9) | ((i13 & 112) == 32) | ((i13 & 14) == 4);
                Object objM1956L3 = go0Var.m1956L();
                if (zM1982g || objM1956L3 == c0160eb) {
                    uh1Var3 = uh1VarM1896n;
                    xm0 xm0Var = new xm0() { // from class: lr1
                        @Override // p000.xm0
                        /* JADX INFO: renamed from: a */
                        public final Object mo6a() {
                            if (zBooleanValue) {
                                ((b02) bs0Var).m336a(i9);
                            }
                            in0Var.mo5j(Boolean.valueOf(!z));
                            return a83.f116a;
                        }
                    };
                    go0Var.m1981f0(xm0Var);
                    objM1956L3 = xm0Var;
                } else {
                    uh1Var3 = uh1VarM1896n;
                }
                uh1 uh1VarM1611C = fg1.m1611C(AbstractC0731te.m5232r(uh1Var3, bk1Var, z3, (xm0) objM1956L3), 3.0f);
                nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10225m, false);
                int iHashCode = Long.hashCode(go0Var.f3614T);
                yy1 yy1VarM1990l = go0Var.m1990l();
                uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1611C);
                InterfaceC0293hx.f4166c.getClass();
                C0367jy c0367jy = C0256gx.f3727b;
                go0Var.m1969Z();
                if (go0Var.f3613S) {
                    go0Var.m1989k(c0367jy);
                } else {
                    go0Var.m1987i0();
                }
                yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d);
                yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
                yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
                yf3.m6267b(go0Var, C0256gx.f3732g);
                yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
                m4946j(((za0) gu2VarM5480a5.getValue()).f13798h, ((Number) gu2Var.getValue()).floatValue(), go0Var, 0);
                AbstractC0135dm.m1057a(gf1.m1896n(fg1.m1622O(AbstractC0731te.m5213h0(s11.m4675T(rh1Var, ((za0) gu2VarM5480a.getValue()).f13798h, 0.0f, 2), ((za0) gu2VarM5480a2.getValue()).f13798h, ((za0) gu2VarM5480a3.getValue()).f13798h), ((za0) gu2Var2.getValue()).f13798h, fb2Var, 24), j, fb2Var), go0Var, 0);
                go0Var.m1994p(true);
                i7 = i9;
            }
            final uh1 uh1Var4 = uh1Var2;
            final boolean z4 = z3;
            b62VarM1996r = go0Var.m1996r();
            if (b62VarM1996r == null) {
                b62VarM1996r.f616d = new mn0() { // from class: mr1
                    @Override // p000.mn0
                    /* JADX INFO: renamed from: g */
                    public final Object mo12g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        sp0.m4944i(z, in0Var, uh1Var4, z4, i7, (InterfaceC0596px) obj, pp0.m3902N(i2 | 1), i3);
                        return a83.f116a;
                    }
                };
                return;
            }
            return;
        }
        i10 |= 384;
        uh1Var2 = uh1Var;
        i4 = i3 & 8;
        if (i4 == 0) {
        }
        i6 = i5 | 90112;
        if (go0Var.m1958O(i6 & 1, (74899 & i6) == 74898)) {
        }
        final uh1 uh1Var42 = uh1Var2;
        final boolean z42 = z3;
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r == null) {
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final uh1 m4945i0(uz2 uz2Var) {
        return new ty2(uz2Var);
    }

    /* JADX INFO: renamed from: j */
    public static final void m4946j(final float f, final float f2, InterfaceC0596px interfaceC0596px, final int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1749892085);
        int i2 = (go0Var.m1974c(f) ? 4 : 2) | i | (go0Var.m1974c(f2) ? 32 : 16);
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            uh1 uh1VarM5213h0 = AbstractC0731te.m5213h0(s11.m4675T(rh1.f9587a, f, 0.0f, 2), 20.0f, 14.0f);
            boolean z = (i2 & 112) == 32;
            Object objM1956L = go0Var.m1956L();
            if (z || objM1956L == C0520nx.f7360a) {
                objM1956L = new in0() { // from class: nr1
                    @Override // p000.in0
                    /* JADX INFO: renamed from: j */
                    public final Object mo5j(Object obj) {
                        ca2 ca2Var = (ca2) obj;
                        ca2Var.getClass();
                        ca2Var.m719c(f2);
                        return a83.f116a;
                    }
                };
                go0Var.m1981f0(objM1956L);
            }
            AbstractC0135dm.m1057a(gf1.m1896n(AbstractC0731te.m5183L(uh1VarM5213h0, (in0) objM1956L), C0363ju.f5213c, gb2.f3387a), go0Var, 0);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0(f, f2, i) { // from class: or1

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ float f7807h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ float f7808i;

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3902N = pp0.m3902N(1);
                    sp0.m4946j(this.f7807h, this.f7808i, (InterfaceC0596px) obj, iM3902N);
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static final int m4947j0(long j) {
        float[] fArr = C0786uu.f11480a;
        return (int) (C0363ju.m2564a(j, C0786uu.f11484e) >>> 32);
    }

    /* JADX INFO: renamed from: k */
    public static final void m4948k(zk1 zk1Var, th1 th1Var) {
        zk1 zk1VarM4393y = m4933c0(th1Var).m4393y();
        int i = zk1VarM4393y.f13936j - 1;
        Object[] objArr = zk1VarM4393y.f13934h;
        if (i < objArr.length) {
            while (i >= 0) {
                zk1Var.m6423b((th1) ((r61) objArr[i]).f9372M.f12036g);
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static final String m4949k0(yo2 yo2Var) {
        return AbstractC0142du.m1165u0(ci0.m799X(0, yo2Var.mo252d()), ", ", yo2Var.mo250b() + '(', ")", new C0792v(20, yo2Var), 24);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m4950l(int i, KeyEvent keyEvent) {
        return ((int) (qp0.m4271z(keyEvent) >> 32)) == i;
    }

    /* JADX INFO: renamed from: m */
    public static final th1 m4952m(zk1 zk1Var) {
        int i;
        if (zk1Var == null || (i = zk1Var.f13936j) == 0) {
            return null;
        }
        return (th1) zk1Var.m6432k(i - 1);
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m4953m0(int i) {
        return i == (i & 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static final j61 m4954n(th1 th1Var) {
        if ((th1Var.f10759j & 2) != 0) {
            if (th1Var instanceof j61) {
                return (j61) th1Var;
            }
            if (th1Var instanceof u60) {
                th1 th1Var2 = ((u60) th1Var).f11116w;
                while (th1Var2 != 0) {
                    if (th1Var2 instanceof j61) {
                        return (j61) th1Var2;
                    }
                    th1Var2 = (!(th1Var2 instanceof u60) || (th1Var2.f10759j & 2) == 0) ? th1Var2.f10762m : ((u60) th1Var2).f11116w;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m4955n0(int i) {
        return i == (i & 15);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4956o(yw2 yw2Var, i12 i12Var, AbstractC0658rj abstractC0658rj) {
        km0 km0Var;
        k20 k20Var;
        int size;
        int i;
        if (abstractC0658rj instanceof km0) {
            km0Var = (km0) abstractC0658rj;
            int i2 = km0Var.f5636n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                km0Var.f5636n = i2 - Integer.MIN_VALUE;
            } else {
                km0Var = new km0(abstractC0658rj);
            }
        }
        Object objM6363a = km0Var.f5635m;
        int i3 = km0Var.f5636n;
        if (i3 == 0) {
            fg1.m1627T(objM6363a);
            List list = yw2Var.f13658m.f14135z.f3776a;
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                if (((o12) list.get(i4)).f7423d) {
                    km0Var.f5633k = yw2Var;
                    km0Var.f5634l = i12Var;
                    km0Var.f5636n = 1;
                    objM6363a = yw2Var.m6363a(i12Var, km0Var);
                    k20Var = k20.f5323h;
                    if (objM6363a == k20Var) {
                    }
                    List list2 = ((h12) objM6363a).f3776a;
                    size = list2.size();
                    i = 0;
                    while (i < size) {
                    }
                    return a83.f116a;
                }
            }
            return a83.f116a;
        }
        if (i3 != 1) {
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i12 i12Var2 = km0Var.f5634l;
        yw2 yw2Var2 = km0Var.f5633k;
        fg1.m1627T(objM6363a);
        i12Var = i12Var2;
        yw2Var = yw2Var2;
        List list22 = ((h12) objM6363a).f3776a;
        size = list22.size();
        i = 0;
        while (i < size) {
            if (((o12) list22.get(i)).f7423d) {
                km0Var.f5633k = yw2Var;
                km0Var.f5634l = i12Var;
                km0Var.f5636n = 1;
                objM6363a = yw2Var.m6363a(i12Var, km0Var);
                k20Var = k20.f5323h;
                if (objM6363a == k20Var) {
                    return k20Var;
                }
                List list222 = ((h12) objM6363a).f3776a;
                size = list222.size();
                i = 0;
                while (i < size) {
                }
            } else {
                i++;
            }
        }
        return a83.f116a;
    }

    /* JADX INFO: renamed from: o0 */
    public static boolean m4957o0(int i) {
        return i == (65535 & i);
    }

    /* JADX INFO: renamed from: p */
    public static final Object m4958p(s12 s12Var, mn0 mn0Var, t00 t00Var) {
        Object objM6513M0 = ((zw2) s12Var).m6513M0(new lm0(t00Var.mo2508f(), mn0Var, null, 0), t00Var);
        return objM6513M0 == k20.f5323h ? objM6513M0 : a83.f116a;
    }

    /* JADX INFO: renamed from: p0 */
    public static final long m4959p0(long j, long j2) {
        int iM1495d;
        int iM1497f = f13.m1497f(j);
        int iM1496e = f13.m1496e(j);
        if ((f13.m1497f(j2) < f13.m1496e(j)) && (f13.m1497f(j) < f13.m1496e(j2))) {
            if ((f13.m1497f(j2) <= f13.m1497f(j)) && (f13.m1496e(j) <= f13.m1496e(j2))) {
                iM1497f = f13.m1497f(j2);
                iM1496e = iM1497f;
            } else {
                if ((f13.m1497f(j) <= f13.m1497f(j2)) && (f13.m1496e(j2) <= f13.m1496e(j))) {
                    iM1495d = f13.m1495d(j2);
                } else {
                    int iM1497f2 = f13.m1497f(j2);
                    if (iM1497f >= f13.m1496e(j2) || iM1497f2 > iM1497f) {
                        iM1496e = f13.m1497f(j2);
                    } else {
                        iM1497f = f13.m1497f(j2);
                        iM1495d = f13.m1495d(j2);
                    }
                }
                iM1496e -= iM1495d;
            }
        } else if (iM1496e > f13.m1497f(j2)) {
            iM1497f -= f13.m1495d(j2);
            iM1495d = f13.m1495d(j2);
            iM1496e -= iM1495d;
        }
        return fg1.m1636i(iM1497f, iM1496e);
    }

    /* JADX INFO: renamed from: q */
    public static String m4960q(ij0 ij0Var) {
        int iM1207m = ((dy2) ij0Var).m1207m();
        int i = 0;
        if (iM1207m == ((short) iM1207m)) {
            char[] cArr = new char[5];
            if (iM1207m < 0) {
                cArr[0] = '-';
                iM1207m = -iM1207m;
            } else {
                cArr[0] = '+';
            }
            while (i < 4) {
                cArr[4 - i] = Character.forDigit(iM1207m & 15, 16);
                iM1207m >>= 4;
                i++;
            }
            return new String(cArr);
        }
        char[] cArr2 = new char[9];
        if (iM1207m < 0) {
            cArr2[0] = '-';
            iM1207m = -iM1207m;
        } else {
            cArr2[0] = '+';
        }
        while (i < 8) {
            cArr2[8 - i] = Character.forDigit(iM1207m & 15, 16);
            iM1207m >>= 4;
            i++;
        }
        return new String(cArr2);
    }

    /* JADX INFO: renamed from: s */
    public static String m4961s(ij0 ij0Var) {
        int iM61e = ((dy2) ij0Var).f2263e.m61e();
        return iM61e == ((char) iM61e) ? pp0.m3898J(iM61e) : pp0.m3899K(iM61e);
    }

    /* JADX INFO: renamed from: t */
    public static final void m4962t(int i) {
        if (i >= 1) {
            return;
        }
        C0676s.m4645c(vi0.m5688g("Expected positive parallelism level, but got ", i));
    }

    /* JADX INFO: renamed from: u */
    public static void m4963u(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            c80.m673q(hk1.m2212k("fromIndex: ", i, i2, ", toIndex: ", ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            C0676s.m4651j(vi0.m5689h("fromIndex: ", i, " > toIndex: ", i2));
        }
    }

    /* JADX INFO: renamed from: w */
    public static short m4964w(int i, int i2) {
        if ((i & 255) != i) {
            C0676s.m4651j("low out of range 0..255");
            return (short) 0;
        }
        if ((i2 & 255) == i2) {
            return (short) (i | (i2 << 8));
        }
        C0676s.m4651j("high out of range 0..255");
        return (short) 0;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m4965y(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m4965y(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: z */
    public static void m4966z(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f10270k) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f10268i = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f10269j = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f10268i = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f10269j = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f10268i;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f10269j;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f10270k = true;
        }
        if (z) {
            try {
                Method method4 = f10268i;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = f10269j) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    /* JADX INFO: renamed from: H */
    public abstract String mo3314H(ij0 ij0Var);

    /* JADX INFO: renamed from: I */
    public abstract String mo3315I(ij0 ij0Var);

    /* JADX INFO: renamed from: J */
    public abstract boolean mo3316J(a40 a40Var);

    /* JADX INFO: renamed from: q0 */
    public abstract void mo3317q0(C0929yn c0929yn, ij0 ij0Var);

    /* JADX INFO: renamed from: r */
    public boolean mo3318r(dy2 dy2Var) {
        return this instanceof om0;
    }

    /* JADX INFO: renamed from: v */
    public abstract int mo3319v();

    /* JADX INFO: renamed from: x */
    public BitSet mo3320x(a40 a40Var) {
        return new BitSet();
    }
}
