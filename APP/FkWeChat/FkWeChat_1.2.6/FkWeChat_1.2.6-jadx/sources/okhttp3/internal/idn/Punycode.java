package okhttp3.internal.idn;

import bsh.C1189h4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p080f9.AbstractC2368o;
import p080f9.C2361h;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8612b;
import p299ub.AbstractC8621f0;
import p376zd.C10003m;
import p376zd.C9995i;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010&R\u0018\u0010/\u001a\u00020\u0006*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, m16758d2 = {"Lokhttp3/internal/idn/Punycode;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "string", _UrlKt.FRAGMENT_ENCODE_SET, "pos", "limit", "Lzd/i;", "result", _UrlKt.FRAGMENT_ENCODE_SET, "encodeLabel", "(Ljava/lang/String;IILzd/i;)Z", "decodeLabel", "delta", "numpoints", "first", "adapt", "(IIZ)I", "requiresEncode", "(Ljava/lang/String;II)Z", _UrlKt.FRAGMENT_ENCODE_SET, "codePoints", "(Ljava/lang/String;II)Ljava/util/List;", "encode", "(Ljava/lang/String;)Ljava/lang/String;", "decode", "PREFIX_STRING", "Ljava/lang/String;", "getPREFIX_STRING", "()Ljava/lang/String;", "Lzd/m;", "PREFIX", "Lzd/m;", "getPREFIX", "()Lzd/m;", "BASE", "I", "TMIN", "TMAX", "SKEW", "DAMP", "INITIAL_BIAS", "INITIAL_N", "getPunycodeDigit", "(I)I", "punycodeDigit", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class Punycode {
    private static final int BASE = 36;
    private static final int DAMP = 700;
    private static final int INITIAL_BIAS = 72;
    private static final int INITIAL_N = 128;
    private static final int SKEW = 38;
    private static final int TMAX = 26;
    private static final int TMIN = 1;
    public static final Punycode INSTANCE = new Punycode();
    private static final String PREFIX_STRING = "xn--";
    private static final C10003m PREFIX = C10003m.f33582t.m38794d("xn--");

    private Punycode() {
    }

    private final int adapt(int delta, int numpoints, boolean first) {
        int i10 = first ? delta / DAMP : delta / 2;
        int i11 = i10 + (i10 / numpoints);
        int i12 = 0;
        while (i11 > 455) {
            i11 /= 35;
            i12 += BASE;
        }
        return i12 + ((i11 * BASE) / (i11 + SKEW));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    private final List<Integer> codePoints(String str, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        while (i10 < i11) {
            int iCharAt = str.charAt(i10);
            if (AbstractC8612b.m33081e(iCharAt)) {
                int i12 = i10 + 1;
                char cCharAt = i12 < i11 ? str.charAt(i12) : (char) 0;
                if (Character.isLowSurrogate(iCharAt) || !Character.isLowSurrogate(cCharAt)) {
                    iCharAt = 63;
                } else {
                    iCharAt = 65536 + (((iCharAt & 1023) << 10) | (cCharAt & 1023));
                    i10 = i12;
                }
            }
            arrayList.add(Integer.valueOf(iCharAt));
            i10++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean decodeLabel(String string, int pos, int limit, C9995i result) {
        int i10;
        int i11;
        int i12 = 1;
        if (!AbstractC8611a0.m33063H(string, pos, PREFIX_STRING, 0, 4, true)) {
            result.mo38711i0(string, pos, limit);
            return true;
        }
        int i13 = pos + 4;
        ArrayList arrayList = new ArrayList();
        int iM33164t0 = AbstractC8621f0.m33164t0(string, '-', limit, false, 4, null);
        char c10 = '0';
        char c11 = '[';
        char c12 = '{';
        boolean z10 = false;
        if (iM33164t0 >= i13) {
            while (i13 < iM33164t0) {
                int i14 = i13 + 1;
                char cCharAt = string.charAt(i13);
                if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && (('0' > cCharAt || cCharAt >= ':') && cCharAt != '-'))) {
                    return false;
                }
                arrayList.add(Integer.valueOf(cCharAt));
                i13 = i14;
            }
            i13++;
        }
        int i15 = 128;
        int iAdapt = INITIAL_BIAS;
        int i16 = 0;
        while (i13 < limit) {
            int i17 = i12;
            boolean z11 = z10;
            C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(BASE, Integer.MAX_VALUE), BASE);
            int iM8560o = c2361hM8591r.m8560o();
            int iM8561p = c2361hM8591r.m8561p();
            int iM8562q = c2361hM8591r.m8562q();
            if ((iM8562q > 0 && iM8560o <= iM8561p) || (iM8562q < 0 && iM8561p <= iM8560o)) {
                i10 = i16;
                int i18 = i17;
                while (i13 != limit) {
                    int i19 = i13 + 1;
                    char cCharAt2 = string.charAt(i13);
                    if ('a' <= cCharAt2 && cCharAt2 < c12) {
                        i11 = cCharAt2 - 'a';
                    } else if ('A' <= cCharAt2 && cCharAt2 < c11) {
                        i11 = cCharAt2 - 'A';
                    } else {
                        if (c10 > cCharAt2 || cCharAt2 >= ':') {
                            return z11;
                        }
                        i11 = cCharAt2 - 22;
                    }
                    int i20 = i18;
                    int i21 = i11 * i20;
                    int i22 = i10;
                    if (i22 > Integer.MAX_VALUE - i21) {
                        return z11;
                    }
                    i10 = i22 + i21;
                    int i23 = iM8560o <= iAdapt ? i17 : iM8560o >= iAdapt + TMAX ? TMAX : iM8560o - iAdapt;
                    if (i11 >= i23) {
                        int i24 = 36 - i23;
                        if (i20 > Integer.MAX_VALUE / i24) {
                            return z11;
                        }
                        i18 = i20 * i24;
                        if (iM8560o != iM8561p) {
                            iM8560o += iM8562q;
                            i13 = i19;
                            c10 = '0';
                            c11 = '[';
                            c12 = '{';
                        }
                    }
                    i13 = i19;
                }
                return z11;
            }
            i10 = i16;
            iAdapt = adapt(i10 - i16, arrayList.size() + 1, i16 == 0 ? i17 : z11);
            int size = i10 / (arrayList.size() + 1);
            if (i15 > Integer.MAX_VALUE - size) {
                return z11;
            }
            i15 += size;
            int size2 = i10 % (arrayList.size() + 1);
            if (i15 > 1114111) {
                return z11;
            }
            arrayList.add(size2, Integer.valueOf(i15));
            i16 = size2 + 1;
            z10 = z11;
            i12 = i17;
            c10 = '0';
            c11 = '[';
            c12 = '{';
        }
        boolean z12 = i12;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            result.mo38732w(((Number) it.next()).intValue());
        }
        return z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean encodeLabel(String string, int pos, int limit, C9995i result) {
        int i10;
        int i11;
        int i12;
        int i13 = 1;
        if (!requiresEncode(string, pos, limit)) {
            result.mo38711i0(string, pos, limit);
            return true;
        }
        result.mo38736y0(PREFIX);
        List<Integer> listCodePoints = codePoints(string, pos, limit);
        Iterator<Integer> it = listCodePoints.iterator();
        int i14 = 0;
        while (true) {
            i10 = 128;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = it.next().intValue();
            if (iIntValue < 128) {
                result.writeByte(iIntValue);
                i14++;
            }
        }
        if (i14 > 0) {
            result.writeByte(45);
        }
        int iAdapt = INITIAL_BIAS;
        int i15 = 0;
        int i16 = i14;
        while (i16 < listCodePoints.size()) {
            Iterator<T> it2 = listCodePoints.iterator();
            if (!it2.hasNext()) {
                C1189h4.m4429a();
                return false;
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int iIntValue2 = ((Number) next).intValue();
                if (iIntValue2 < i10) {
                    iIntValue2 = Integer.MAX_VALUE;
                }
                do {
                    Object next2 = it2.next();
                    int iIntValue3 = ((Number) next2).intValue();
                    if (iIntValue3 < i10) {
                        iIntValue3 = Integer.MAX_VALUE;
                    }
                    if (iIntValue2 > iIntValue3) {
                        next = next2;
                        iIntValue2 = iIntValue3;
                    }
                } while (it2.hasNext());
            }
            int iIntValue4 = ((Number) next).intValue();
            int i17 = (iIntValue4 - i10) * (i16 + 1);
            if (i15 > Integer.MAX_VALUE - i17) {
                return false;
            }
            int i18 = i15 + i17;
            Iterator<Integer> it3 = listCodePoints.iterator();
            while (it3.hasNext()) {
                int iIntValue5 = it3.next().intValue();
                if (iIntValue5 < iIntValue4) {
                    if (i18 == Integer.MAX_VALUE) {
                        return false;
                    }
                    i18++;
                } else if (iIntValue5 == iIntValue4) {
                    C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(BASE, Integer.MAX_VALUE), BASE);
                    int iM8560o = c2361hM8591r.m8560o();
                    int iM8561p = c2361hM8591r.m8561p();
                    int iM8562q = c2361hM8591r.m8562q();
                    if ((iM8562q > 0 && iM8560o <= iM8561p) || (iM8562q < 0 && iM8561p <= iM8560o)) {
                        i12 = i18;
                        while (true) {
                            if (iM8560o <= iAdapt) {
                                i11 = i13;
                            } else {
                                i11 = i13;
                                i13 = iM8560o >= iAdapt + TMAX ? TMAX : iM8560o - iAdapt;
                            }
                            if (i12 < i13) {
                                break;
                            }
                            int i19 = i12 - i13;
                            int i20 = 36 - i13;
                            result.writeByte(getPunycodeDigit(i13 + (i19 % i20)));
                            i12 = i19 / i20;
                            if (iM8560o == iM8561p) {
                                break;
                            }
                            iM8560o += iM8562q;
                            i13 = i11;
                        }
                    } else {
                        i11 = i13;
                        i12 = i18;
                    }
                    result.writeByte(getPunycodeDigit(i12));
                    int i21 = i16 + 1;
                    iAdapt = adapt(i18, i21, i16 == i14 ? i11 : false);
                    i16 = i21;
                    i18 = 0;
                    i13 = i11;
                }
            }
            i15 = i18 + 1;
            i10 = iIntValue4 + 1;
        }
        return i13;
    }

    private final int getPunycodeDigit(int i10) {
        if (i10 < TMAX) {
            return i10 + 97;
        }
        if (i10 < BASE) {
            return i10 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i10).toString());
    }

    private final boolean requiresEncode(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) >= 128) {
                return true;
            }
            i10++;
        }
        return false;
    }

    public final String decode(String string) {
        string.getClass();
        int length = string.length();
        C9995i c9995i = new C9995i();
        int i10 = 0;
        while (i10 < length) {
            String str = string;
            int iM33150m0 = AbstractC8621f0.m33150m0(str, '.', i10, false, 4, null);
            if (iM33150m0 == -1) {
                iM33150m0 = length;
            }
            if (!decodeLabel(str, i10, iM33150m0, c9995i)) {
                return null;
            }
            if (iM33150m0 >= length) {
                break;
            }
            c9995i.writeByte(46);
            i10 = iM33150m0 + 1;
            string = str;
        }
        return c9995i.m38684L();
    }

    public final String encode(String string) {
        string.getClass();
        int length = string.length();
        C9995i c9995i = new C9995i();
        int i10 = 0;
        while (i10 < length) {
            String str = string;
            int iM33150m0 = AbstractC8621f0.m33150m0(str, '.', i10, false, 4, null);
            if (iM33150m0 == -1) {
                iM33150m0 = length;
            }
            if (!encodeLabel(str, i10, iM33150m0, c9995i)) {
                return null;
            }
            if (iM33150m0 >= length) {
                break;
            }
            c9995i.writeByte(46);
            i10 = iM33150m0 + 1;
            string = str;
        }
        return c9995i.m38684L();
    }

    public final C10003m getPREFIX() {
        return PREFIX;
    }

    public final String getPREFIX_STRING() {
        return PREFIX_STRING;
    }
}
