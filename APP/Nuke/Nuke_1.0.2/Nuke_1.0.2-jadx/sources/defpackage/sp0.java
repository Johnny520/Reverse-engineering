package defpackage;

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
    public static final /* synthetic */ int f = 0;
    public static Method i;
    public static Method j;
    public static boolean k;
    public static sx0 l;
    public static final uf a = new uf(0);
    public static final uf b = new uf(1);
    public static final kw c = new kw(1025014528, false, new ow(10));
    public static final kw d = new kw(1576937791, false, new ye(19));
    public static final kw e = new kw(159076582, false, new ow(11));
    public static final eb g = new eb(15);
    public static final iu0 h = new iu0(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String[] A(k00 k00Var) {
        k00Var.getClass();
        return (String[]) ((y7) k00Var).b.toArray(new String[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void B(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            c80.g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int C(yo2 yo2Var, u21 u21Var, String str) {
        yo2Var.getClass();
        u21Var.getClass();
        str.getClass();
        N(u21Var, yo2Var);
        int iA = yo2Var.a(str);
        if (iA != -3 || !u21Var.a.f) {
            return iA;
        }
        n4 n4Var = u21Var.c;
        r1 r1Var = new r1(22, yo2Var, u21Var);
        n4Var.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) n4Var.i;
        Map map = (Map) concurrentHashMap.get(yo2Var);
        eb ebVar = g;
        Object obj = map != null ? map.get(ebVar) : null;
        Object objA = obj != null ? obj : null;
        if (objA == null) {
            objA = r1Var.a();
            Object concurrentHashMap2 = concurrentHashMap.get(yo2Var);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(yo2Var, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(ebVar, objA);
        }
        Integer num = (Integer) ((Map) objA).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int D(yo2 yo2Var, u21 u21Var, String str, String str2) {
        yo2Var.getClass();
        u21Var.getClass();
        str.getClass();
        int iC = C(yo2Var, u21Var, str);
        if (iC != -3) {
            return iC;
        }
        throw new o01(yo2Var.b() + " does not contain element with name '" + str + '\'' + str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean E(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int F(yo2 yo2Var, yo2[] yo2VarArr) {
        yo2VarArr.getClass();
        int iHashCode = (yo2Var.b().hashCode() * 31) + Arrays.hashCode(yo2VarArr);
        int iD = yo2Var.d();
        int i2 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iD > 0)) {
                break;
            }
            int i3 = iD - 1;
            int i4 = i2 * 31;
            String strB = yo2Var.j(yo2Var.d() - iD).b();
            if (strB != null) {
                iHashCode2 = strB.hashCode();
            }
            i2 = i4 + iHashCode2;
            iD = i3;
        }
        int iD2 = yo2Var.d();
        int iHashCode3 = 1;
        while (true) {
            if (!(iD2 > 0)) {
                return (((iHashCode * 31) + i2) * 31) + iHashCode3;
            }
            int i5 = iD2 - 1;
            int i6 = iHashCode3 * 31;
            s11 s11VarC = yo2Var.j(yo2Var.d() - iD2).c();
            iHashCode3 = i6 + (s11VarC != null ? s11VarC.hashCode() : 0);
            iD2 = i5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean G(u21 u21Var, yo2 yo2Var) {
        yo2Var.getClass();
        u21Var.getClass();
        if (u21Var.a.a) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String K(k30 k30Var, int i2) {
        StringBuilder sb = new StringBuilder(20);
        sb.append("#");
        long jH = k30Var instanceof j30 ? ((j30) k30Var).h : k30Var.h();
        if (i2 == 4) {
            sb.append(new String(new char[]{Character.forDigit(((int) jH) & 15, 16)}));
        } else if (i2 == 8) {
            sb.append(pp0.I((int) jH));
        } else if (i2 == 16) {
            sb.append(pp0.J((int) jH));
        } else if (i2 == 32) {
            sb.append(pp0.K((int) jH));
        } else {
            if (i2 != 64) {
                c80.j("shouldn't happen");
                return null;
            }
            sb.append(pp0.L(jH));
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String L(k30 k30Var) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('#');
        if (k30Var instanceof h30) {
            sb.append("null");
        } else {
            sb.append(k30Var.f());
            sb.append(' ');
            sb.append(k30Var.b());
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int M(int i2, int i3) {
        if ((i2 & 15) != i2) {
            s.j("low out of range 0..15");
            return 0;
        }
        if ((i3 & 15) == i3) {
            return i2 | (i3 << 4);
        }
        s.j("high out of range 0..15");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void N(u21 u21Var, yo2 yo2Var) {
        yo2Var.getClass();
        u21Var.getClass();
        t11.l(yo2Var.c(), yv2.g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String O(String str) {
        String string = pv2.I0(str).toString();
        Pattern patternCompile = Pattern.compile("\\s+");
        patternCompile.getClass();
        string.getClass();
        String strReplaceAll = patternCompile.matcher(string).replaceAll("");
        strReplaceAll.getClass();
        String lowerCase = strReplaceAll.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void P(gw gwVar, View view, xm0 xm0Var) throws Throwable {
        Object x92Var;
        gwVar.getClass();
        view.getClass();
        xm0Var.getClass();
        try {
            gwVar.p(view, xm0Var);
            x92Var = a83.a;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thA = y92.a(x92Var);
        if (thA == null) {
            return;
        }
        pp1 pp1Var = pp1.a;
        pp1.h(gwVar, "ui_click", thA, "Hooker UI click failed");
        throw thA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static short Q(a40 a40Var, int i2) {
        if ((i2 & 255) != i2) {
            s.j("arg out of range 0..255");
            return (short) 0;
        }
        int i3 = a40Var.b.a;
        if ((i3 & 255) == i3) {
            return (short) (i3 | (i2 << 8));
        }
        s.j("opcode out of range 0..255");
        return (short) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean R(Context context, String str) {
        Object x92Var;
        context.getClass();
        str.getClass();
        String string = pv2.I0(str).toString();
        if (pv2.s0(string)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(string);
            uri.getClass();
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            x92Var = a83.a;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        return !(x92Var instanceof x92);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final JsObject S(String str, Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof JsObject) {
            return (JsObject) obj;
        }
        c80.p("INVALID_ARGUMENT", str.concat(" must be an object when configured."), 0, null, null, 28);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String T(JsObject jsObject, String str) {
        Object obj = jsObject.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        c80.p("INVALID_ARGUMENT", str.concat(" must be a string when configured."), 0, null, null, 28);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String U(s72 s72Var) {
        int length = s72Var.i.length;
        StringBuilder sb = new StringBuilder((length * 5) + 2);
        sb.append('{');
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0) {
                sb.append(", ");
            }
            sb.append(((r72) s72Var.e(i2)).g());
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String V(s72 s72Var) {
        int i2;
        int i3;
        int length = s72Var.i.length;
        StringBuilder sb = new StringBuilder(30);
        sb.append("{");
        if (length != 0) {
            if (length != 1) {
                r72 r72VarE = (r72) s72Var.e(length - 1);
                if (r72VarE.d() == 2 && i2 != (i3 = (i2 = r72VarE.h) + 1)) {
                    r72VarE = r72.e(i3, r72VarE.i);
                }
                sb.append(((r72) s72Var.e(0)).g());
                sb.append("..");
                sb.append(r72VarE.g());
            } else {
                sb.append(((r72) s72Var.e(0)).g());
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void W(t60 t60Var) {
        d6 d6Var;
        r61 r61VarC0 = c0(t60Var);
        if (r61VarC0.A || (d6Var = ((b7) u61.a(r61VarC0)).U) == null) {
            return;
        }
        d6Var.k.b.v(r61VarC0.i, new c6(d6Var, r61VarC0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean X(String str, Object obj) {
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        c80.p("INVALID_ARGUMENT", str.concat(" must be a boolean."), 0, null, null, 28);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte[] Y(String str, Object obj) {
        if (obj instanceof UByteArray) {
            byte[] bArr = ((UByteArray) obj).h;
            return Arrays.copyOf(bArr, bArr.length);
        }
        if (obj instanceof byte[]) {
            byte[] bArr2 = (byte[]) obj;
            return Arrays.copyOf(bArr2, bArr2.length);
        }
        c80.p("INVALID_ARGUMENT", str.concat(" must be a Uint8Array."), 0, null, null, 28);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final zn1 Z(t60 t60Var, int i2) {
        zn1 zn1Var = ((th1) t60Var).h.o;
        zn1Var.getClass();
        if (zn1Var.S0() != t60Var || !ao1.g(i2)) {
            return zn1Var;
        }
        zn1 zn1Var2 = zn1Var.w;
        zn1Var2.getClass();
        return zn1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(float f2, float f3, float f4, float f5, su suVar) {
        int i2;
        int i3;
        int i4;
        float fB;
        float fA;
        int i5;
        int i6;
        int i7;
        int i8;
        float fB2;
        float fA2;
        int i9;
        int i10;
        int i11;
        float f6;
        if (suVar.c()) {
            float f7 = f5 < 0.0f ? 0.0f : f5;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i12 = ((int) ((f7 * 255.0f) + 0.5f)) << 24;
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i13 = i12 | (((int) ((f8 * 255.0f) + 0.5f)) << 16);
            float f9 = f3 < 0.0f ? 0.0f : f3;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i14 = i13 | (((int) ((f9 * 255.0f) + 0.5f)) << 8);
            f6 = f4 >= 0.0f ? f4 : 0.0f;
            long j2 = ((long) (i14 | ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i15 = ju.h;
            return j2;
        }
        if (((int) (suVar.b >> 32)) != 3) {
            jz0.a("Color only works with ColorSpaces with 3 components");
        }
        int i16 = suVar.c;
        if (i16 == -1) {
            jz0.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float fB3 = suVar.b(0);
        float fA3 = suVar.a(0);
        if (f2 >= fB3) {
            fB3 = f2;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(fA3);
        int i17 = iFloatToRawIntBits >>> 31;
        int i18 = (iFloatToRawIntBits >>> 23) & 255;
        int i19 = iFloatToRawIntBits & 8388607;
        if (i18 == 255) {
            i3 = i19 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i18 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else if (i2 > 0) {
                int i20 = i19 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i20) + 1) | (i17 << 15);
                    short s = (short) i4;
                    fB = suVar.b(1);
                    fA = suVar.a(1);
                    if (f3 >= fB) {
                        fB = f3;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(fA);
                    int i21 = iFloatToRawIntBits2 >>> 31;
                    i5 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i22 = iFloatToRawIntBits2 & 8388607;
                    if (i5 != 255) {
                        i7 = i22 != 0 ? 512 : 0;
                        i6 = 31;
                    } else {
                        i6 = i5 - 112;
                        if (i6 >= 31) {
                            i7 = 0;
                            i6 = 49;
                        } else if (i6 > 0) {
                            int i23 = i22 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i8 = (((i6 << 10) | i23) + 1) | (i21 << 15);
                                short s2 = (short) i8;
                                fB2 = suVar.b(2);
                                fA2 = suVar.a(2);
                                if (f4 >= fB2) {
                                    fB2 = f4;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA2);
                                int i24 = iFloatToRawIntBits3 >>> 31;
                                i9 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i25 = 8388607 & iFloatToRawIntBits3;
                                if (i9 == 255) {
                                    i10 = i25 != 0 ? 512 : 0;
                                    i = 31;
                                } else {
                                    int i26 = i9 - 112;
                                    if (i26 >= 31) {
                                        i10 = 0;
                                        i = 49;
                                    } else if (i26 > 0) {
                                        int i27 = i25 >> 13;
                                        if ((iFloatToRawIntBits3 & 4096) != 0) {
                                            i11 = (((i26 << 10) | i27) + 1) | (i24 << 15);
                                            short s3 = (short) i11;
                                            f6 = f5 >= 0.0f ? f5 : 0.0f;
                                            long j3 = (((long) i16) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i28 = ju.h;
                                            return j3;
                                        }
                                        i10 = i27;
                                        i = i26;
                                    } else if (i26 >= -10) {
                                        int i29 = (i25 | 8388608) >> (1 - i26);
                                        if ((i29 & 4096) != 0) {
                                            i29 += 8192;
                                        }
                                        i10 = i29 >> 13;
                                    } else {
                                        i10 = 0;
                                    }
                                }
                                i11 = i10 | (i24 << 15) | (i << 10);
                                short s32 = (short) i11;
                                if (f5 >= 0.0f) {
                                }
                                long j32 = (((long) i16) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s32)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i282 = ju.h;
                                return j32;
                            }
                            i7 = i23;
                        } else if (i6 >= -10) {
                            int i30 = (i22 | 8388608) >> (1 - i6);
                            if ((i30 & 4096) != 0) {
                                i30 += 8192;
                            }
                            i7 = i30 >> 13;
                            i6 = 0;
                        } else {
                            i7 = 0;
                            i6 = 0;
                        }
                    }
                    i8 = i7 | (i21 << 15) | (i6 << 10);
                    short s22 = (short) i8;
                    fB2 = suVar.b(2);
                    fA2 = suVar.a(2);
                    if (f4 >= fB2) {
                    }
                    if (fB2 <= fA2) {
                    }
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(fA2);
                    int i242 = iFloatToRawIntBits32 >>> 31;
                    i9 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i252 = 8388607 & iFloatToRawIntBits32;
                    if (i9 == 255) {
                    }
                    i11 = i10 | (i242 << 15) | (i << 10);
                    short s322 = (short) i11;
                    if (f5 >= 0.0f) {
                    }
                    long j322 = (((long) i16) & 63) | ((((long) s) & 65535) << 48) | ((((long) s22) & 65535) << 32) | ((65535 & ((long) s322)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i2822 = ju.h;
                    return j322;
                }
                i3 = i20;
            } else if (i2 >= -10) {
                int i31 = (i19 | 8388608) >> (1 - i2);
                if ((i31 & 4096) != 0) {
                    i31 += 8192;
                }
                i3 = i31 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
        }
        i4 = i3 | (i17 << 15) | (i2 << 10);
        short s4 = (short) i4;
        fB = suVar.b(1);
        fA = suVar.a(1);
        if (f3 >= fB) {
        }
        if (fB <= fA) {
        }
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(fA);
        int i212 = iFloatToRawIntBits22 >>> 31;
        i5 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i222 = iFloatToRawIntBits22 & 8388607;
        if (i5 != 255) {
        }
        i8 = i7 | (i212 << 15) | (i6 << 10);
        short s222 = (short) i8;
        fB2 = suVar.b(2);
        fA2 = suVar.a(2);
        if (f4 >= fB2) {
        }
        if (fB2 <= fA2) {
        }
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(fA2);
        int i2422 = iFloatToRawIntBits322 >>> 31;
        i9 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i2522 = 8388607 & iFloatToRawIntBits322;
        if (i9 == 255) {
        }
        i11 = i10 | (i2422 << 15) | (i << 10);
        short s3222 = (short) i11;
        if (f5 >= 0.0f) {
        }
        long j3222 = (((long) i16) & 63) | ((((long) s4) & 65535) << 48) | ((((long) s222) & 65535) << 32) | ((65535 & ((long) s3222)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i28222 = ju.h;
        return j3222;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a0(int i2, Object[] objArr) {
        objArr.getClass();
        if (objArr.length == i2) {
            return;
        }
        throw new sd2("INVALID_ARGUMENT", "Expected " + i2 + " arguments, received " + objArr.length + ".", false, null, null, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long b(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = ju.h;
        return j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final zn1 b0(t60 t60Var) {
        if (!((th1) t60Var).h.u) {
            kz0.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        zn1 zn1VarZ = Z(t60Var, 2);
        if (!zn1VarZ.S0().u) {
            kz0.b("LayoutCoordinates is not attached.");
        }
        return zn1VarZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long c(long j2) {
        long j3 = j2 << 32;
        int i2 = ju.h;
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final r61 c0(t60 t60Var) {
        zn1 zn1Var = ((th1) t60Var).h.o;
        if (zn1Var != null) {
            return zn1Var.v;
        }
        throw vi0.e("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long d(int i2, int i3, int i4) {
        return b(((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long d0(Object obj, String str, long j2, long j3) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number == null) {
            c80.p("INVALID_ARGUMENT", str.concat(" must be a number."), 0, null, null, 28);
            return 0L;
        }
        double dDoubleValue = number.doubleValue();
        if (Math.abs(dDoubleValue) > Double.MAX_VALUE || dDoubleValue % 1.0d != 0.0d) {
            c80.p("INVALID_ARGUMENT", str.concat(" must be a finite integer."), 0, null, null, 28);
            return 0L;
        }
        long j4 = (long) dDoubleValue;
        if (j2 <= j4 && j4 <= j3) {
            return j4;
        }
        throw new sd2("INVALID_ARGUMENT", str + " must be between " + j2 + " and " + j3 + ".", false, null, null, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final y7 e(String str) {
        return new y7(t11.Q(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final JsObject e0(String str, Object obj) {
        JsObject jsObject = obj instanceof JsObject ? (JsObject) obj : null;
        if (jsObject != null) {
            return jsObject;
        }
        c80.p("INVALID_ARGUMENT", str.concat(" must be an object."), 0, null, null, 28);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long f(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = b51.O;
        return j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final zv1 f0(t60 t60Var) {
        zv1 zv1Var = c0(t60Var).u;
        if (zv1Var != null) {
            return zv1Var;
        }
        throw vi0.e("This node does not have an owner.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:100:0x0120 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(String str, uh1 uh1Var, String str2, mn0 mn0Var, mn0 mn0Var2, mn0 mn0Var3, boolean z, xm0 xm0Var, in0 in0Var, px pxVar, int i2, int i3) {
        int i4;
        int i5;
        mn0 mn0Var4;
        int i6;
        mn0 mn0Var5;
        int i7;
        mn0 mn0Var6;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        uh1 uh1Var2;
        boolean z2;
        xm0 xm0Var2;
        go0 go0Var;
        mn0 mn0Var7;
        String str3;
        mn0 mn0Var8;
        b62 b62VarR;
        String str4;
        boolean z3;
        uh1 uh1VarO;
        rh1 rh1Var;
        xm0 xm0Var3;
        mn0 mn0Var9;
        String str5;
        boolean z4;
        uf ufVar = tp0.a;
        qk qkVar = sn.t;
        yi0 yi0Var = te.e;
        str.getClass();
        go0 go0Var2 = (go0) pxVar;
        go0Var2.X(-1320254907);
        if ((i2 & 6) == 0) {
            i4 = (go0Var2.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i13 = i4 | 48;
        int i14 = i3 & 4;
        if (i14 != 0) {
            i13 = i4 | 432;
        } else {
            if ((i2 & 384) == 0) {
                i13 |= go0Var2.f(str2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i13 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    mn0Var4 = mn0Var;
                    i13 |= go0Var2.h(mn0Var4) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i13 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        mn0Var5 = mn0Var2;
                        i13 |= go0Var2.h(mn0Var5) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i13 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            mn0 mn0Var10 = mn0Var3;
                            i13 |= go0Var2.h(mn0Var10) ? 131072 : 65536;
                            mn0Var6 = mn0Var10;
                        }
                        i8 = i3 & 64;
                        if (i8 != 0) {
                            i13 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i13 |= go0Var2.g(z) ? 1048576 : 524288;
                        }
                        i9 = i3 & 128;
                        if (i9 != 0) {
                            i13 |= 12582912;
                        } else {
                            if ((i2 & 12582912) == 0) {
                                i10 = i9;
                                i13 |= go0Var2.h(xm0Var) ? 8388608 : 4194304;
                            }
                            i11 = i3 & 256;
                            if (i11 != 0) {
                                if ((i2 & 100663296) == 0) {
                                    i12 = i11;
                                    i13 |= go0Var2.h(in0Var) ? 67108864 : 33554432;
                                }
                                if (go0Var2.O(i13 & 1, (i13 & 38347923) != 38347922)) {
                                    String str6 = i14 != 0 ? null : str2;
                                    if (i5 != 0) {
                                        mn0Var4 = null;
                                    }
                                    if (i6 != 0) {
                                        mn0Var5 = null;
                                    }
                                    if (i7 != 0) {
                                        mn0Var6 = null;
                                    }
                                    boolean z5 = i8 != 0 ? true : z;
                                    xm0 xm0Var4 = i10 != 0 ? null : xm0Var;
                                    in0 in0Var2 = i12 == 0 ? in0Var : null;
                                    int i15 = 6;
                                    rh1 rh1Var2 = rh1.a;
                                    if (!z5) {
                                        str4 = str6;
                                        uh1VarO = rh1Var2;
                                        z3 = z5;
                                    } else if (in0Var2 != null) {
                                        str4 = str6;
                                        z3 = z5;
                                        uh1VarO = tl.s(rh1Var2, new hp1(i15, in0Var2, true));
                                    } else {
                                        str4 = str6;
                                        z3 = z5;
                                        uh1VarO = xm0Var4 != null ? tl.O(rh1Var2, xm0Var4) : rh1Var2;
                                    }
                                    if (mn0Var6 == null) {
                                        go0Var2.W(1597230910);
                                        uh1 uh1VarD = fg1.D(yi0Var.c(uh1VarO), 14.0f, 12.0f);
                                        ob2 ob2VarA = nb2.a(ufVar, qkVar, go0Var2, 48);
                                        in0Var = in0Var2;
                                        int iHashCode = Long.hashCode(go0Var2.T);
                                        yy1 yy1VarL = go0Var2.l();
                                        uh1 uh1VarM = tl.M(go0Var2, uh1VarD);
                                        hx.c.getClass();
                                        jy jyVar = gx.b;
                                        go0Var2.Z();
                                        if (go0Var2.S) {
                                            go0Var2.k(jyVar);
                                        } else {
                                            go0Var2.i0();
                                        }
                                        yf3.c(go0Var2, gx.e, ob2VarA);
                                        yf3.c(go0Var2, gx.d, yy1VarL);
                                        yf3.c(go0Var2, gx.f, Integer.valueOf(iHashCode));
                                        yf3.b(go0Var2, gx.g);
                                        yf3.c(go0Var2, gx.c, uh1VarM);
                                        h(str, str4, mn0Var4, mn0Var5, z3, go0Var2, 6 | ((i13 << 3) & 112) | (i13 & 896) | (i13 & 7168) | (i13 & 57344) | ((i13 >> 3) & 458752));
                                        str5 = str4;
                                        z4 = z3;
                                        go0Var2.p(true);
                                        go0Var2.p(false);
                                        rh1Var = rh1Var2;
                                        xm0Var3 = xm0Var4;
                                        mn0Var9 = mn0Var5;
                                    } else {
                                        boolean z6 = z3;
                                        in0Var = in0Var2;
                                        String str7 = str4;
                                        go0Var2.W(1597751772);
                                        ob2 ob2VarA2 = nb2.a(ufVar, qkVar, go0Var2, 48);
                                        rh1Var = rh1Var2;
                                        int iHashCode2 = Long.hashCode(go0Var2.T);
                                        yy1 yy1VarL2 = go0Var2.l();
                                        uh1 uh1VarM2 = tl.M(go0Var2, yi0Var);
                                        hx.c.getClass();
                                        jy jyVar2 = gx.b;
                                        go0Var2.Z();
                                        mn0 mn0Var11 = mn0Var4;
                                        if (go0Var2.S) {
                                            go0Var2.k(jyVar2);
                                        } else {
                                            go0Var2.i0();
                                        }
                                        lc lcVar = gx.e;
                                        yf3.c(go0Var2, lcVar, ob2VarA2);
                                        lc lcVar2 = gx.d;
                                        yf3.c(go0Var2, lcVar2, yy1VarL2);
                                        Integer numValueOf = Integer.valueOf(iHashCode2);
                                        lc lcVar3 = gx.f;
                                        yf3.c(go0Var2, lcVar3, numValueOf);
                                        v6 v6Var = gx.g;
                                        yf3.b(go0Var2, v6Var);
                                        lc lcVar4 = gx.c;
                                        yf3.c(go0Var2, lcVar4, uh1VarM2);
                                        xm0Var3 = xm0Var4;
                                        mn0Var9 = mn0Var5;
                                        uh1 uh1VarF = fg1.F(new g71(1.0f, true).c(uh1VarO), 14.0f, 12.0f, 10.0f, 12.0f);
                                        ob2 ob2VarA3 = nb2.a(ufVar, qkVar, go0Var2, 48);
                                        int iHashCode3 = Long.hashCode(go0Var2.T);
                                        yy1 yy1VarL3 = go0Var2.l();
                                        uh1 uh1VarM3 = tl.M(go0Var2, uh1VarF);
                                        go0Var2.Z();
                                        if (go0Var2.S) {
                                            go0Var2.k(jyVar2);
                                        } else {
                                            go0Var2.i0();
                                        }
                                        yf3.c(go0Var2, lcVar, ob2VarA3);
                                        yf3.c(go0Var2, lcVar2, yy1VarL3);
                                        vi0.q(iHashCode3, go0Var2, lcVar3, go0Var2, v6Var);
                                        yf3.c(go0Var2, lcVar4, uh1VarM3);
                                        h(str, str7, mn0Var11, mn0Var9, z6, go0Var2, 6 | ((i13 << 3) & 112) | (i13 & 896) | (i13 & 7168) | (i13 & 57344) | ((i13 >> 3) & 458752));
                                        str5 = str7;
                                        mn0Var4 = mn0Var11;
                                        z4 = z6;
                                        go0Var2.p(true);
                                        mn0Var6.g(go0Var2, Integer.valueOf((i13 >> 15) & 14));
                                        go0Var2.p(true);
                                        go0Var2.p(false);
                                    }
                                    go0Var = go0Var2;
                                    str3 = str5;
                                    z2 = z4;
                                    uh1Var2 = rh1Var;
                                    xm0Var2 = xm0Var3;
                                    mn0Var7 = mn0Var9;
                                    mn0Var8 = mn0Var6;
                                } else {
                                    go0Var2.R();
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
                                b62VarR = go0Var.r();
                                if (b62VarR != null) {
                                    b62VarR.d = new zp1(str, uh1Var2, str3, mn0Var12, mn0Var7, mn0Var13, z2, xm0Var2, in0Var3, i2, i3);
                                    return;
                                }
                                return;
                            }
                            i13 |= 100663296;
                            i12 = i11;
                            if (go0Var2.O(i13 & 1, (i13 & 38347923) != 38347922)) {
                            }
                            mn0 mn0Var122 = mn0Var4;
                            mn0 mn0Var132 = mn0Var8;
                            in0 in0Var32 = in0Var;
                            b62VarR = go0Var.r();
                            if (b62VarR != null) {
                            }
                        }
                        i10 = i9;
                        i11 = i3 & 256;
                        if (i11 != 0) {
                        }
                        i12 = i11;
                        if (go0Var2.O(i13 & 1, (i13 & 38347923) != 38347922)) {
                        }
                        mn0 mn0Var1222 = mn0Var4;
                        mn0 mn0Var1322 = mn0Var8;
                        in0 in0Var322 = in0Var;
                        b62VarR = go0Var.r();
                        if (b62VarR != null) {
                        }
                    }
                    mn0Var6 = mn0Var3;
                    i8 = i3 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    if (go0Var2.O(i13 & 1, (i13 & 38347923) != 38347922)) {
                    }
                    mn0 mn0Var12222 = mn0Var4;
                    mn0 mn0Var13222 = mn0Var8;
                    in0 in0Var3222 = in0Var;
                    b62VarR = go0Var.r();
                    if (b62VarR != null) {
                    }
                }
                mn0Var5 = mn0Var2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                mn0Var6 = mn0Var3;
                i8 = i3 & 64;
                if (i8 != 0) {
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                if (go0Var2.O(i13 & 1, (i13 & 38347923) != 38347922)) {
                }
                mn0 mn0Var122222 = mn0Var4;
                mn0 mn0Var132222 = mn0Var8;
                in0 in0Var32222 = in0Var;
                b62VarR = go0Var.r();
                if (b62VarR != null) {
                }
            }
            mn0Var4 = mn0Var;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            mn0Var5 = mn0Var2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            mn0Var6 = mn0Var3;
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            if (go0Var2.O(i13 & 1, (i13 & 38347923) != 38347922)) {
            }
            mn0 mn0Var1222222 = mn0Var4;
            mn0 mn0Var1322222 = mn0Var8;
            in0 in0Var322222 = in0Var;
            b62VarR = go0Var.r();
            if (b62VarR != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        mn0Var4 = mn0Var;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        mn0Var5 = mn0Var2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        mn0Var6 = mn0Var3;
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        if (go0Var2.O(i13 & 1, (i13 & 38347923) != 38347922)) {
        }
        mn0 mn0Var12222222 = mn0Var4;
        mn0 mn0Var13222222 = mn0Var8;
        in0 in0Var3222222 = in0Var;
        b62VarR = go0Var.r();
        if (b62VarR != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String g0(String str, Object obj) {
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 != null) {
            return str2;
        }
        c80.p("INVALID_ARGUMENT", str.concat(" must be a string."), 0, null, null, 28);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(String str, String str2, mn0 mn0Var, mn0 mn0Var2, boolean z, px pxVar, int i2) {
        int i3;
        go0 go0Var;
        mn0 mn0Var3;
        long j2;
        rh1 rh1Var;
        boolean z2;
        go0 go0Var2;
        mn0 mn0Var4 = mn0Var2;
        go0 go0Var3 = (go0) pxVar;
        go0Var3.X(1848673515);
        int i4 = i2 & 6;
        pb2 pb2Var = pb2.a;
        if (i4 == 0) {
            i3 = (go0Var3.f(pb2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var3.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= go0Var3.f(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= go0Var3.h(mn0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= go0Var3.h(mn0Var4) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= go0Var3.g(z) ? 131072 : 65536;
        }
        int i5 = i3;
        if (go0Var3.O(i5 & 1, (i5 & 74899) != 74898)) {
            rh1 rh1Var2 = rh1.a;
            if (mn0Var != null) {
                go0Var3.W(-532726615);
                mn0Var.g(go0Var3, Integer.valueOf((i5 >> 9) & 14));
                rp0.O(go0Var3, te.q0(rh1Var2, 12.0f));
                go0Var3.p(false);
            } else {
                go0Var3.W(-532651657);
                go0Var3.p(false);
            }
            uh1 uh1VarA = pb2.a(pb2Var);
            av avVarA = yu.a(tp0.c, sn.u, go0Var3, 0);
            int iHashCode = Long.hashCode(go0Var3.T);
            yy1 yy1VarL = go0Var3.l();
            uh1 uh1VarM = tl.M(go0Var3, uh1VarA);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var3.Z();
            if (go0Var3.S) {
                go0Var3.k(jyVar);
            } else {
                go0Var3.i0();
            }
            yf3.c(go0Var3, gx.e, avVarA);
            yf3.c(go0Var3, gx.d, yy1VarL);
            yf3.c(go0Var3, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var3, gx.g);
            yf3.c(go0Var3, gx.c, uh1VarM);
            if (z) {
                go0Var3.W(-1063527380);
                j2 = ((lp1) go0Var3.j(ur1.a)).e;
            } else {
                go0Var3.W(-1063526290);
                j2 = ((lp1) go0Var3.j(ur1.a)).f;
            }
            go0Var3.p(false);
            v03.b(str, null, j2, rg3.D(15), im0.l, 0L, rg3.D(20), 0, false, 0, 0, null, go0Var3, ((i5 >> 3) & 14) | 1597440, 48, 260010);
            go0 go0Var4 = go0Var3;
            if (str2 != null) {
                go0Var4.W(1390593043);
                rp0.O(go0Var4, te.O(rh1Var2, 3.0f));
                rh1Var = rh1Var2;
                v03.b(str2, null, ((lp1) go0Var4.j(ur1.a)).f, rg3.D(12), im0.j, 0L, rg3.D(17), 0, false, 0, 0, null, go0Var4, ((i5 >> 6) & 14) | 1597440, 48, 260010);
                go0 go0Var5 = go0Var4;
                z2 = false;
                go0Var5.p(false);
                go0Var2 = go0Var5;
            } else {
                rh1Var = rh1Var2;
                z2 = false;
                go0Var4.W(1390883265);
                go0Var4.p(false);
                go0Var2 = go0Var4;
            }
            go0Var2.p(true);
            mn0 mn0Var5 = mn0Var2;
            if (mn0Var5 != null) {
                go0Var2.W(-531978523);
                rp0.O(go0Var2, te.q0(rh1Var, 12.0f));
                mn0Var5.g(go0Var2, Integer.valueOf((i5 >> 12) & 14));
                go0Var2.p(z2);
                mn0Var3 = mn0Var5;
                go0Var = go0Var2;
            } else {
                go0Var2.W(-531899721);
                go0Var2.p(z2);
                mn0Var3 = mn0Var5;
                go0Var = go0Var2;
            }
        } else {
            go0Var3.R();
            mn0Var3 = mn0Var4;
            go0Var = go0Var3;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new gr1(str, str2, mn0Var, mn0Var3, z, i2, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h0(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(final boolean z, final in0 in0Var, uh1 uh1Var, boolean z2, int i2, px pxVar, final int i3, final int i4) {
        uh1 uh1Var2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        final int i8;
        b62 b62VarR;
        int i9;
        final int i10;
        bk1 bk1Var;
        long jB;
        gd0 gd0Var;
        float f2;
        gu2 gu2Var;
        gu2 gu2Var2;
        long jB2;
        uh1 uh1Var3;
        in0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1094553456);
        int i11 = (go0Var.g(z) ? 4 : 2) | i3 | (go0Var.h(in0Var) ? 32 : 16);
        int i12 = i4 & 4;
        if (i12 == 0) {
            if ((i3 & 384) == 0) {
                uh1Var2 = uh1Var;
                i11 |= go0Var.f(uh1Var2) ? 256 : 128;
            }
            i5 = i4 & 8;
            if (i5 == 0) {
                i6 = i11 | 3072;
                z3 = z2;
            } else {
                z3 = z2;
                i6 = i11 | (go0Var.g(z3) ? 2048 : 1024);
            }
            i7 = i6 | 90112;
            if (go0Var.O(i7 & 1, (74899 & i7) == 74898)) {
                go0Var.R();
                i8 = i2;
            } else {
                go0Var.T();
                int i13 = i3 & 1;
                rh1 rh1Var = rh1.a;
                if (i13 == 0 || go0Var.y()) {
                    if (i12 != 0) {
                        uh1Var2 = rh1Var;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    i9 = i7 & (-458753);
                    i10 = 21;
                } else {
                    go0Var.R();
                    i9 = i7 & (-458753);
                    i10 = i2;
                }
                go0Var.q();
                lp1 lp1Var = (lp1) go0Var.j(ur1.a);
                final bs0 bs0Var = (bs0) go0Var.j(ly.l);
                go0Var.W(401128866);
                final boolean zBooleanValue = ((Boolean) go0Var.j(ur1.b)).booleanValue();
                go0Var.p(false);
                Object objL = go0Var.L();
                eb ebVar = nx.a;
                if (objL == ebVar) {
                    objL = new bk1();
                    go0Var.f0(objL);
                }
                bk1 bk1Var2 = (bk1) objL;
                xk1 xk1VarT = rg3.t(bk1Var2, go0Var);
                if (z) {
                    bk1Var = bk1Var2;
                    jB = ju.b(lp1Var.a ? 0.24f : 0.32f, lp1Var.g);
                } else {
                    bk1Var = bk1Var2;
                    jB = ju.b(lp1Var.a ? 0.18f : 0.26f, lp1Var.f);
                }
                if (z3) {
                    jB = z ? lp1Var.g : lp1Var.d;
                }
                int i14 = i9;
                gu2 gu2VarA = ar2.a(jB, up0.J(180, null, 6), "TrackColorAnimation", go0Var);
                float f3 = (((Boolean) xk1VarT.getValue()).booleanValue() && z3) ? 27.0f : z ? 24.0f : 22.0f;
                float f4 = (((Boolean) xk1VarT.getValue()).booleanValue() && z3) ? 20.0f : 22.0f;
                gu2 gu2VarA2 = uc.a(z ? 42.0f - f3 : 0.0f, up0.G(0.5f, 400.0f, null, 4), "ThumbOffsetAnimation", go0Var);
                gu2 gu2VarA3 = uc.a(f3, up0.G(0.5f, 1500.0f, null, 4), "ThumbWidthAnimation", go0Var);
                gu2 gu2VarA4 = uc.a(f4, up0.G(0.5f, 1500.0f, null, 4), "ThumbHeightAnimation", go0Var);
                if (!z3) {
                    gd0Var = null;
                    f2 = 0.0f;
                } else if (((Boolean) xk1VarT.getValue()).booleanValue()) {
                    gd0Var = null;
                    f2 = 1.0f;
                } else if (z) {
                    f2 = 5.0f;
                    gd0Var = null;
                } else {
                    gd0Var = null;
                    f2 = 3.0f;
                }
                gu2 gu2VarA5 = uc.a(f2, up0.J(180, gd0Var, 6), "ThumbElevationAnimation", go0Var);
                gu2 gu2VarB = uc.b((((Boolean) xk1VarT.getValue()).booleanValue() && z3) ? 0.98f : 1.0f, up0.G(0.5f, 1500.0f, null, 4), "TrackScaleXAnimation", go0Var, 3120);
                gu2 gu2VarB2 = uc.b((((Boolean) xk1VarT.getValue()).booleanValue() && z3) ? 1.04f : 1.0f, up0.G(0.5f, 1500.0f, null, 4), "TrackScaleYAnimation", go0Var, 3120);
                gu2 gu2VarA6 = uc.a(z ? 22.0f : 2.0f, up0.G(0.5f, 200.0f, null, 4), "HighlightOffsetAnimation", go0Var);
                gu2 gu2VarB3 = uc.b(!z3 ? 0.0f : z ? 0.28f : 0.12f, up0.J(180, null, 6), "HighlightAlphaAnimation", go0Var, 3120);
                if (z3) {
                    jB2 = ju.c;
                    gu2Var = gu2VarB3;
                    gu2Var2 = gu2VarA5;
                } else if (z) {
                    gu2Var = gu2VarB3;
                    gu2Var2 = gu2VarA5;
                    jB2 = ju.b(lp1Var.a ? 0.74f : 0.86f, lp1Var.g);
                } else {
                    gu2Var = gu2VarB3;
                    gu2Var2 = gu2VarA5;
                    jB2 = ju.b(lp1Var.a ? 0.58f : 0.76f, lp1Var.f);
                }
                long j2 = jB2;
                uh1 uh1VarH0 = te.h0(uh1Var2, 48.0f, 28.0f);
                boolean zF = go0Var.f(gu2VarB) | go0Var.f(gu2VarB2);
                Object objL2 = go0Var.L();
                if (zF || objL2 == ebVar) {
                    objL2 = new er1(gu2VarB, gu2VarB2, 1);
                    go0Var.f0(objL2);
                }
                uh1 uh1VarL = te.L(uh1VarH0, (in0) objL2);
                fb2 fb2Var = gb2.a;
                uh1 uh1VarN = gf1.n(ci0.z(uh1VarL, fb2Var), ((ju) gu2VarA.getValue()).a, h);
                boolean zG = go0Var.g(zBooleanValue) | go0Var.h(bs0Var) | go0Var.d(i10) | ((i14 & 112) == 32) | ((i14 & 14) == 4);
                Object objL3 = go0Var.L();
                if (zG || objL3 == ebVar) {
                    uh1Var3 = uh1VarN;
                    xm0 xm0Var = new xm0() { // from class: lr1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.xm0
                        public final Object a() {
                            if (zBooleanValue) {
                                ((b02) bs0Var).a(i10);
                            }
                            in0Var.j(Boolean.valueOf(!z));
                            return a83.a;
                        }
                    };
                    go0Var.f0(xm0Var);
                    objL3 = xm0Var;
                } else {
                    uh1Var3 = uh1VarN;
                }
                uh1 uh1VarC = fg1.C(te.r(uh1Var3, bk1Var, z3, (xm0) objL3), 3.0f);
                nf1 nf1VarD = dm.d(sn.m, false);
                int iHashCode = Long.hashCode(go0Var.T);
                yy1 yy1VarL = go0Var.l();
                uh1 uh1VarM = tl.M(go0Var, uh1VarC);
                hx.c.getClass();
                jy jyVar = gx.b;
                go0Var.Z();
                if (go0Var.S) {
                    go0Var.k(jyVar);
                } else {
                    go0Var.i0();
                }
                yf3.c(go0Var, gx.e, nf1VarD);
                yf3.c(go0Var, gx.d, yy1VarL);
                yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
                yf3.b(go0Var, gx.g);
                yf3.c(go0Var, gx.c, uh1VarM);
                j(((za0) gu2VarA6.getValue()).h, ((Number) gu2Var.getValue()).floatValue(), go0Var, 0);
                dm.a(gf1.n(fg1.O(te.h0(s11.T(rh1Var, ((za0) gu2VarA2.getValue()).h, 0.0f, 2), ((za0) gu2VarA3.getValue()).h, ((za0) gu2VarA4.getValue()).h), ((za0) gu2Var2.getValue()).h, fb2Var, 24), j2, fb2Var), go0Var, 0);
                go0Var.p(true);
                i8 = i10;
            }
            final uh1 uh1Var4 = uh1Var2;
            final boolean z4 = z3;
            b62VarR = go0Var.r();
            if (b62VarR == null) {
                b62VarR.d = new mn0() { // from class: mr1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.mn0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        sp0.i(z, in0Var, uh1Var4, z4, i8, (px) obj, pp0.N(i3 | 1), i4);
                        return a83.a;
                    }
                };
                return;
            }
            return;
        }
        i11 |= 384;
        uh1Var2 = uh1Var;
        i5 = i4 & 8;
        if (i5 == 0) {
        }
        i7 = i6 | 90112;
        if (go0Var.O(i7 & 1, (74899 & i7) == 74898)) {
        }
        final uh1 uh1Var42 = uh1Var2;
        final boolean z42 = z3;
        b62VarR = go0Var.r();
        if (b62VarR == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 i0(uz2 uz2Var) {
        return new ty2(uz2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(final float f2, final float f3, px pxVar, final int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(1749892085);
        int i3 = (go0Var.c(f2) ? 4 : 2) | i2 | (go0Var.c(f3) ? 32 : 16);
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            uh1 uh1VarH0 = te.h0(s11.T(rh1.a, f2, 0.0f, 2), 20.0f, 14.0f);
            boolean z = (i3 & 112) == 32;
            Object objL = go0Var.L();
            if (z || objL == nx.a) {
                objL = new in0() { // from class: nr1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.in0
                    public final Object j(Object obj) {
                        ca2 ca2Var = (ca2) obj;
                        ca2Var.getClass();
                        ca2Var.c(f3);
                        return a83.a;
                    }
                };
                go0Var.f0(objL);
            }
            dm.a(gf1.n(te.L(uh1VarH0, (in0) objL), ju.c, gb2.a), go0Var, 0);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0(f2, f3, i2) { // from class: or1
                public final /* synthetic */ float h;
                public final /* synthetic */ float i;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = pp0.N(1);
                    sp0.j(this.h, this.i, (px) obj, iN);
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int j0(long j2) {
        float[] fArr = uu.a;
        return (int) (ju.a(j2, uu.e) >>> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void k(zk1 zk1Var, th1 th1Var) {
        zk1 zk1VarY = c0(th1Var).y();
        int i2 = zk1VarY.j - 1;
        Object[] objArr = zk1VarY.h;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                zk1Var.b((th1) ((r61) objArr[i2]).M.g);
                i2--;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String k0(yo2 yo2Var) {
        return du.u0(ci0.X(0, yo2Var.d()), ", ", yo2Var.b() + '(', ")", new v(20, yo2Var), 24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean l(int i2, KeyEvent keyEvent) {
        return ((int) (qp0.z(keyEvent) >> 32)) == i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final th1 m(zk1 zk1Var) {
        int i2;
        if (zk1Var == null || (i2 = zk1Var.j) == 0) {
            return null;
        }
        return (th1) zk1Var.k(i2 - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean m0(int i2) {
        return i2 == (i2 & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0016 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0016 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: th1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: th1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: th1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: th1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: th1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: th1 */
    /* JADX WARN: Multi-variable type inference failed */
    public static final j61 n(th1 th1Var) {
        if ((th1Var.j & 2) != 0) {
            if (th1Var instanceof j61) {
                return (j61) th1Var;
            }
            if (th1Var instanceof u60) {
                th1 th1Var2 = ((u60) th1Var).w;
                while (th1Var2 != 0) {
                    if (th1Var2 instanceof j61) {
                        return (j61) th1Var2;
                    }
                    th1Var2 = (!(th1Var2 instanceof u60) || (th1Var2.j & 2) == 0) ? th1Var2.m : ((u60) th1Var2).w;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean n0(int i2) {
        return i2 == (i2 & 15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(yw2 yw2Var, i12 i12Var, rj rjVar) {
        km0 km0Var;
        k20 k20Var;
        int size;
        int i2;
        if (rjVar instanceof km0) {
            km0Var = (km0) rjVar;
            int i3 = km0Var.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                km0Var.n = i3 - Integer.MIN_VALUE;
            } else {
                km0Var = new km0(rjVar);
            }
        }
        Object objA = km0Var.m;
        int i4 = km0Var.n;
        if (i4 == 0) {
            fg1.T(objA);
            List list = yw2Var.m.z.a;
            int size2 = list.size();
            for (int i5 = 0; i5 < size2; i5++) {
                if (((o12) list.get(i5)).d) {
                    km0Var.k = yw2Var;
                    km0Var.l = i12Var;
                    km0Var.n = 1;
                    objA = yw2Var.a(i12Var, km0Var);
                    k20Var = k20.h;
                    if (objA == k20Var) {
                    }
                    List list2 = ((h12) objA).a;
                    size = list2.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return a83.a;
                }
            }
            return a83.a;
        }
        if (i4 != 1) {
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i12 i12Var2 = km0Var.l;
        yw2 yw2Var2 = km0Var.k;
        fg1.T(objA);
        i12Var = i12Var2;
        yw2Var = yw2Var2;
        List list22 = ((h12) objA).a;
        size = list22.size();
        i2 = 0;
        while (i2 < size) {
            if (((o12) list22.get(i2)).d) {
                km0Var.k = yw2Var;
                km0Var.l = i12Var;
                km0Var.n = 1;
                objA = yw2Var.a(i12Var, km0Var);
                k20Var = k20.h;
                if (objA == k20Var) {
                    return k20Var;
                }
                List list222 = ((h12) objA).a;
                size = list222.size();
                i2 = 0;
                while (i2 < size) {
                }
            } else {
                i2++;
            }
        }
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean o0(int i2) {
        return i2 == (65535 & i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object p(s12 s12Var, mn0 mn0Var, t00 t00Var) {
        Object objM0 = ((zw2) s12Var).M0(new lm0(t00Var.f(), mn0Var, null, 0), t00Var);
        return objM0 == k20.h ? objM0 : a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long p0(long j2, long j3) {
        int iD;
        int iF = f13.f(j2);
        int iE = f13.e(j2);
        if ((f13.f(j3) < f13.e(j2)) && (f13.f(j2) < f13.e(j3))) {
            if ((f13.f(j3) <= f13.f(j2)) && (f13.e(j2) <= f13.e(j3))) {
                iF = f13.f(j3);
                iE = iF;
            } else {
                if ((f13.f(j2) <= f13.f(j3)) && (f13.e(j3) <= f13.e(j2))) {
                    iD = f13.d(j3);
                } else {
                    int iF2 = f13.f(j3);
                    if (iF >= f13.e(j3) || iF2 > iF) {
                        iE = f13.f(j3);
                    } else {
                        iF = f13.f(j3);
                        iD = f13.d(j3);
                    }
                }
                iE -= iD;
            }
        } else if (iE > f13.f(j3)) {
            iF -= f13.d(j3);
            iD = f13.d(j3);
            iE -= iD;
        }
        return fg1.i(iF, iE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String q(ij0 ij0Var) {
        int iM = ((dy2) ij0Var).m();
        int i2 = 0;
        if (iM == ((short) iM)) {
            char[] cArr = new char[5];
            if (iM < 0) {
                cArr[0] = '-';
                iM = -iM;
            } else {
                cArr[0] = '+';
            }
            while (i2 < 4) {
                cArr[4 - i2] = Character.forDigit(iM & 15, 16);
                iM >>= 4;
                i2++;
            }
            return new String(cArr);
        }
        char[] cArr2 = new char[9];
        if (iM < 0) {
            cArr2[0] = '-';
            iM = -iM;
        } else {
            cArr2[0] = '+';
        }
        while (i2 < 8) {
            cArr2[8 - i2] = Character.forDigit(iM & 15, 16);
            iM >>= 4;
            i2++;
        }
        return new String(cArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String s(ij0 ij0Var) {
        int iE = ((dy2) ij0Var).e.e();
        return iE == ((char) iE) ? pp0.J(iE) : pp0.K(iE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void t(int i2) {
        if (i2 >= 1) {
            return;
        }
        s.c(vi0.g("Expected positive parallelism level, but got ", i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void u(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            c80.q(hk1.k("fromIndex: ", i2, i3, ", toIndex: ", ", size: "), i4);
        } else {
            if (i2 <= i3) {
                return;
            }
            s.j(vi0.h("fromIndex: ", i2, " > toIndex: ", i3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static short w(int i2, int i3) {
        if ((i2 & 255) != i2) {
            s.j("low out of range 0..255");
            return (short) 0;
        }
        if ((i3 & 255) == i3) {
            return (short) (i2 | (i3 << 8));
        }
        s.j("high out of range 0..255");
        return (short) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean y(File file) {
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
            z = y(file2) && z;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void z(Canvas canvas, boolean z) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!k) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    i = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    j = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    i = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    j = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = i;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = j;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            k = true;
        }
        if (z) {
            try {
                Method method4 = i;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = j) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public abstract String H(ij0 ij0Var);

    public abstract String I(ij0 ij0Var);

    public abstract boolean J(a40 a40Var);

    public abstract void q0(yn ynVar, ij0 ij0Var);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean r(dy2 dy2Var) {
        return this instanceof om0;
    }

    public abstract int v();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BitSet x(a40 a40Var) {
        return new BitSet();
    }
}
