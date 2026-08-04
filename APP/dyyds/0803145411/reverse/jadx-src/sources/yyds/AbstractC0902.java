package yyds;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import androidx.cardview.widget.CardView;
import java.io.IOException;
import java.io.StringWriter;
import java.net.ProtocolException;
import java.util.Iterator;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: yyds.ᛴᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0902 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C0235 f4112;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static boolean f4113;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final Object f4114 = new Object();

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static void m2008(CharSequence charSequence, String str) {
        if (charSequence == null || charSequence.length() == 0) {
            C0188.m798(str);
        }
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static String m2009(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringWriter stringWriter = new StringWriter(length);
        StringBuilder sb = new StringBuilder(4);
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (z2) {
                sb.append(cCharAt);
                if (sb.length() == 4) {
                    try {
                        stringWriter.write((char) Integer.parseInt(sb.toString(), 16));
                        sb.setLength(0);
                        z = false;
                        z2 = false;
                    } catch (NumberFormatException e) {
                        throw new C1738("Unable to parse unicode value: " + ((Object) sb), e);
                    }
                } else {
                    continue;
                }
            } else if (z) {
                if (cCharAt == '\"') {
                    stringWriter.write(34);
                } else if (cCharAt == '\'') {
                    stringWriter.write(39);
                } else if (cCharAt == '\\') {
                    stringWriter.write(92);
                } else if (cCharAt == 'b') {
                    stringWriter.write(8);
                } else if (cCharAt == 'f') {
                    stringWriter.write(12);
                } else if (cCharAt == 'n') {
                    stringWriter.write(10);
                } else if (cCharAt == 'r') {
                    stringWriter.write(13);
                } else if (cCharAt == 't') {
                    stringWriter.write(9);
                } else if (cCharAt != 'u') {
                    stringWriter.write(cCharAt);
                } else {
                    z = false;
                    z2 = true;
                }
                z = false;
            } else if (cCharAt == '\\') {
                z = true;
            } else {
                stringWriter.write(cCharAt);
            }
        }
        if (z) {
            stringWriter.write(92);
        }
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static void m2010(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C0188.m798(str);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static ColorStateList m2011(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM4942;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM4942 = C2810.m4942(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM4942;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static String m2012(C2534 c2534, C2534[] c2534Arr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int iMo4261 = c2534.mo4261();
        int i5 = 0;
        while (i5 < iMo4261) {
            int i6 = (i5 + iMo4261) / 2;
            while (i6 > -1 && c2534.mo4259(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (c2534.mo4259(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte bMo4259 = c2534Arr[i10].mo4259(i11);
                    byte[] bArr = AbstractC1429.f6782;
                    int i13 = bMo4259 & 255;
                    z = z2;
                    i3 = i13;
                }
                byte bMo42592 = c2534.mo4259(i7 + i12);
                byte[] bArr2 = AbstractC1429.f6782;
                i4 = i3 - (bMo42592 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (c2534Arr[i10].mo4261() != i11) {
                    z2 = z;
                } else {
                    if (i10 == c2534Arr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int iMo42612 = c2534Arr[i10].mo4261() - i11;
                    int length = c2534Arr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iMo42612 += c2534Arr[i15].mo4261();
                    }
                    if (iMo42612 >= i14) {
                        if (iMo42612 <= i14) {
                            return c2534.mo4258(i7, i9 + i7).mo4256(AbstractC0347.f1806);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iMo4261 = i6;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static String m2013(CharSequence... charSequenceArr) {
        if (charSequenceArr.length == 0) {
            return "";
        }
        if (charSequenceArr.length == 1) {
            return charSequenceArr[0].toString();
        }
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < charSequenceArr.length; i3++) {
            int length = charSequenceArr[i3].length();
            i2 += length;
            if (i != -2 && length > 0) {
                i = i == -1 ? i3 : -2;
            }
        }
        if (i2 == 0) {
            return "";
        }
        if (i > 0) {
            return charSequenceArr[i].toString();
        }
        StringBuilder sb = new StringBuilder(i2);
        for (CharSequence charSequence : charSequenceArr) {
            sb.append(charSequence);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static String m2014(String str, String str2, Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(it.next());
        sb.append(str2);
        while (it.hasNext()) {
            sb.append(str);
            sb.append(str2);
            sb.append(it.next());
            sb.append(str2);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static void m2015(C2133 c2133, float f) {
        float f2;
        float f3;
        C1079 c1079 = (C1079) c2133.f10555;
        CardView cardView = (CardView) c2133.f10553;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != c1079.f4969 || c1079.f4976 != useCompatPadding || c1079.f4972 != preventCornerOverlap) {
            c1079.f4969 = f;
            c1079.f4976 = useCompatPadding;
            c1079.f4972 = preventCornerOverlap;
            c1079.m2284(null);
            c1079.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            c2133.m4068(0, 0, 0, 0);
            return;
        }
        C1079 c10792 = (C1079) c2133.f10555;
        float f4 = c10792.f4969;
        float f5 = c10792.f4970;
        if (cardView.getPreventCornerOverlap()) {
            f2 = (float) (((1.0d - AbstractC0720.f3380) * ((double) f5)) + ((double) f4));
        } else {
            int i = AbstractC0720.f3381;
            f2 = f4;
        }
        int iCeil = (int) Math.ceil(f2);
        if (cardView.getPreventCornerOverlap()) {
            f3 = (float) (((1.0d - AbstractC0720.f3380) * ((double) f5)) + ((double) (f4 * 1.5f)));
        } else {
            f3 = f4 * 1.5f;
        }
        int iCeil2 = (int) Math.ceil(f3);
        c2133.m4068(iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final long m2016(long j) {
        long jM1923;
        C0135 c0135 = AbstractC0848.f3910;
        boolean z = j > 0;
        if (!z) {
            if (!z) {
                return 0L;
            }
            C0188.m801();
            return 0L;
        }
        long jM2780 = AbstractC1367.m2780(999999L, EnumC0426.NANOSECONDS);
        int i = ((int) j) & 1;
        if (i != (((int) jM2780) & 1)) {
            jM1923 = i == 1 ? AbstractC0848.m1923(j >> 1, jM2780 >> 1) : AbstractC0848.m1923(jM2780 >> 1, j >> 1);
        } else if (i == 0) {
            long j2 = (j >> 1) + (jM2780 >> 1);
            if (-4611686018426999999L > j2 || j2 >= 4611686018427000000L) {
                jM1923 = AbstractC1367.m2768(j2 / 1000000);
            } else {
                jM1923 = j2 << 1;
                int i2 = AbstractC0542.f2598;
            }
        } else {
            long jM2770 = AbstractC1367.m2770(j >> 1, jM2780 >> 1);
            if (jM2770 == 9223372036854759646L) {
                C0188.m798("Summing infinite durations of different signs yields an undefined result.");
                return 0L;
            }
            if (jM2770 == 4611686018427387903L || jM2770 == -4611686018427387903L) {
                jM1923 = AbstractC1367.m2768(jM2770);
            } else if (-4611686018426L > jM2770 || jM2770 >= 4611686018427L) {
                jM1923 = AbstractC1367.m2768(AbstractC0598.m1488(jM2770, -4611686018427387903L, 4611686018427387903L));
            } else {
                jM1923 = (jM2770 * 1000000) << 1;
                int i3 = AbstractC0542.f2598;
            }
        }
        return ((((int) jM1923) & 1) != 1 || jM1923 == AbstractC0848.f3911 || jM1923 == AbstractC0848.f3909) ? AbstractC0848.m1924(jM1923, EnumC0426.MILLISECONDS) : jM1923 >> 1;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static C1607 m2017(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        EnumC0940 enumC0940 = EnumC0940.HTTP_1_0;
        EnumC0940 enumC09402 = EnumC0940.HTTP_1_1;
        if (zStartsWith) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC0940 = enumC09402;
            }
        } else if (str.startsWith("ICY ")) {
            i = 4;
        } else {
            if (!str.startsWith("SOURCETABLE ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 12;
            enumC0940 = enumC09402;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numM1693 = AbstractC0733.m1693(str.substring(i, i2));
        if (numM1693 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numM1693.intValue();
        if (str.length() <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new C1607(enumC0940, iIntValue, strSubstring);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final Object m2018(long j, AbstractC1320 abstractC1320) throws Throwable {
        if (j > 0) {
            C1853 c1853 = new C1853(1, AbstractC1367.m2783(abstractC1320));
            c1853.m3625();
            if (j < Long.MAX_VALUE) {
                m2019(c1853.f9326).mo1247(j, c1853);
            }
            Object objM3629 = c1853.m3629();
            if (objM3629 == EnumC1765.f8858) {
                return objM3629;
            }
        }
        return C2746.f13459;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final InterfaceC2800 m2019(InterfaceC2213 interfaceC2213) {
        InterfaceC2247 interfaceC2247Mo423 = interfaceC2213.mo423(C0135.f836);
        InterfaceC2800 interfaceC2800 = interfaceC2247Mo423 instanceof InterfaceC2800 ? (InterfaceC2800) interfaceC2247Mo423 : null;
        return interfaceC2800 == null ? AbstractC2465.f12170 : interfaceC2800;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static C2126 m2020(SSLSession sSLSession) throws IOException {
        Object objM1806;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            C0188.m800("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            C0188.m804("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        C1248 c1248M1860 = C1248.f5721.m1860(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            C0188.m800("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            C0188.m804("tlsVersion == NONE");
            return null;
        }
        EnumC2365 enumC2365M1813 = AbstractC0797.m1813(protocol);
        try {
            objM1806 = AbstractC0795.m1806(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objM1806 = C1860.f9345;
        }
        return new C2126(enumC2365M1813, c1248M1860, AbstractC0795.m1806(sSLSession.getLocalCertificates()), new C1223(12, objM1806));
    }
}
