package okhttp3.internal;

import java.io.EOFException;
import kotlin.Metadata;
import okhttp3.internal.idn.IdnaMappingTableInstanceKt;
import okhttp3.internal.idn.Punycode;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5106t;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p299ub.C8632n;
import p376zd.C9987e;
import p376zd.C9995i;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0017\u0010\u0012\u001a\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u0019\"\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m16758d2 = {_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "canParseAsIpAddress", "(Ljava/lang/String;)Z", "containsInvalidLabelLengths", "containsInvalidHostnameAsciiCodes", "input", _UrlKt.FRAGMENT_ENCODE_SET, "pos", "limit", _UrlKt.FRAGMENT_ENCODE_SET, "decodeIpv6", "(Ljava/lang/String;II)[B", "address", "addressOffset", "decodeIpv4Suffix", "(Ljava/lang/String;II[BI)Z", "inet6AddressToAscii", "([B)Ljava/lang/String;", "canonicalizeInetAddress", "([B)[B", "isMappedIpv4Address", "([B)Z", "inet4AddressToAscii", "toCanonicalHost", "(Ljava/lang/String;)Ljava/lang/String;", "host", "idnToAscii", "Lub/n;", "VERIFY_AS_IP_ADDRESS", "Lub/n;", "okhttp"}, m16759k = 2, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class _HostnamesCommonKt {
    private static final C8632n VERIFY_AS_IP_ADDRESS = new C8632n("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean canParseAsIpAddress(String str) {
        str.getClass();
        return VERIFY_AS_IP_ADDRESS.m33217i(str);
    }

    public static final byte[] canonicalizeInetAddress(byte[] bArr) {
        bArr.getClass();
        return isMappedIpv4Address(bArr) ? AbstractC5106t.m20689J0(bArr, AbstractC2368o.m8592s(12, 16)) : bArr;
    }

    public static final boolean containsInvalidHostnameAsciiCodes(String str) {
        str.getClass();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC1061t.m3843d(cCharAt, 31) <= 0 || AbstractC1061t.m3843d(cCharAt, 127) >= 0 || AbstractC8621f0.m33150m0(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean containsInvalidLabelLengths(String str) {
        str.getClass();
        int length = str.length();
        if (1 <= length && length < 254) {
            int i10 = 0;
            while (true) {
                String str2 = str;
                int iM33150m0 = AbstractC8621f0.m33150m0(str2, '.', i10, false, 4, null);
                int length2 = iM33150m0 == -1 ? str2.length() - i10 : iM33150m0 - i10;
                if (1 > length2 || length2 >= 64) {
                    break;
                }
                if (iM33150m0 == -1 || iM33150m0 == str2.length() - 1) {
                    break;
                }
                i10 = iM33150m0 + 1;
                str = str2;
            }
            return false;
        }
        return true;
    }

    public static final boolean decodeIpv4Suffix(String str, int i10, int i11, byte[] bArr, int i12) {
        str.getClass();
        bArr.getClass();
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = str.charAt(i14);
                if (AbstractC1061t.m3843d(cCharAt, 48) < 0 || AbstractC1061t.m3843d(cCharAt, 57) > 0) {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        if (r11 == 16) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
    
        if (r12 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
    
        p185m8.AbstractC5102r.m20655g(r8, r8, 16 - (r11 - r12), r12, r11);
        p185m8.AbstractC5102r.m20669u(r8, (byte) 0, r12, (16 - r11) + r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a5, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] decodeIpv6(java.lang.String r16, int r17, int r18) {
        /*
            r6 = r18
            r16.getClass()
            r7 = 16
            byte[] r8 = new byte[r7]
            r9 = 0
            r10 = -1
            r2 = r17
            r11 = r9
            r12 = r10
            r13 = r12
        L10:
            r14 = 0
            if (r2 >= r6) goto L94
            if (r11 != r7) goto L16
            return r14
        L16:
            int r15 = r2 + 2
            if (r15 > r6) goto L36
            r4 = 4
            r5 = 0
            java.lang.String r1 = "::"
            r3 = 0
            r0 = r16
            boolean r1 = p299ub.AbstractC8611a0.m33074S(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L36
            if (r12 == r10) goto L2a
            return r14
        L2a:
            int r11 = r11 + 2
            if (r15 != r6) goto L31
            r12 = r11
            goto L94
        L31:
            r0 = r16
            r12 = r11
            r13 = r15
            goto L65
        L36:
            if (r11 == 0) goto L47
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r3 = 0
            r0 = r16
            boolean r1 = p299ub.AbstractC8611a0.m33074S(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L4b
            int r2 = r2 + 1
        L47:
            r0 = r16
            r13 = r2
            goto L65
        L4b:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r3 = 0
            r0 = r16
            boolean r1 = p299ub.AbstractC8611a0.m33074S(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L64
            int r1 = r11 + (-2)
            boolean r0 = decodeIpv4Suffix(r0, r13, r6, r8, r1)
            if (r0 != 0) goto L61
            return r14
        L61:
            int r11 = r11 + 2
            goto L94
        L64:
            return r14
        L65:
            r1 = r9
            r2 = r13
        L67:
            if (r2 >= r6) goto L79
            char r3 = r0.charAt(r2)
            int r3 = okhttp3.internal._UtilCommonKt.parseHexDigit(r3)
            if (r3 == r10) goto L79
            int r1 = r1 << 4
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L67
        L79:
            int r3 = r2 - r13
            if (r3 == 0) goto L93
            r4 = 4
            if (r3 <= r4) goto L81
            goto L93
        L81:
            int r3 = r11 + 1
            int r4 = r1 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r8[r11] = r4
            int r11 = r11 + 2
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r8[r3] = r1
            goto L10
        L93:
            return r14
        L94:
            if (r11 == r7) goto La5
            if (r12 != r10) goto L99
            return r14
        L99:
            int r0 = r11 - r12
            int r0 = 16 - r0
            p185m8.AbstractC5102r.m20655g(r8, r8, r0, r12, r11)
            int r7 = r7 - r11
            int r7 = r7 + r12
            p185m8.AbstractC5102r.m20669u(r8, r9, r12, r7)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal._HostnamesCommonKt.decodeIpv6(java.lang.String, int, int):byte[]");
    }

    public static final String idnToAscii(String str) throws EOFException {
        str.getClass();
        C9995i c9995iMo38698a0 = new C9995i().mo38698a0(str);
        C9995i c9995i = new C9995i();
        while (!c9995iMo38698a0.mo38707g()) {
            if (!IdnaMappingTableInstanceKt.getIDNA_MAPPING_TABLE().map(c9995iMo38698a0.mo38709h0(), c9995i)) {
                return null;
            }
        }
        c9995iMo38698a0.mo38698a0(_NormalizeJvmKt.normalizeNfc(c9995i.m38684L()));
        Punycode punycode = Punycode.INSTANCE;
        String strDecode = punycode.decode(c9995iMo38698a0.m38684L());
        if (strDecode != null && AbstractC1061t.m3842c(strDecode, _NormalizeJvmKt.normalizeNfc(strDecode))) {
            return punycode.encode(strDecode);
        }
        return null;
    }

    public static final String inet4AddressToAscii(byte[] bArr) {
        bArr.getClass();
        if (bArr.length == 4) {
            return new C9995i().mo38678H0(_UtilCommonKt.and(bArr[0], 255)).writeByte(46).mo38678H0(_UtilCommonKt.and(bArr[1], 255)).writeByte(46).mo38678H0(_UtilCommonKt.and(bArr[2], 255)).writeByte(46).mo38678H0(_UtilCommonKt.and(bArr[3], 255)).m38684L();
        }
        C9987e.m38645a("Failed requirement.");
        return null;
    }

    public static final String inet6AddressToAscii(byte[] bArr) {
        bArr.getClass();
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        C9995i c9995i = new C9995i();
        while (i11 < bArr.length) {
            if (i11 == i10) {
                c9995i.writeByte(58);
                i11 += i13;
                if (i11 == 16) {
                    c9995i.writeByte(58);
                }
            } else {
                if (i11 > 0) {
                    c9995i.writeByte(58);
                }
                c9995i.mo38715k0((_UtilCommonKt.and(bArr[i11], 255) << 8) | _UtilCommonKt.and(bArr[i11 + 1], 255));
                i11 += 2;
            }
        }
        return c9995i.m38684L();
    }

    private static final boolean isMappedIpv4Address(byte[] bArr) {
        if (bArr.length != 16) {
            return false;
        }
        for (int i10 = 0; i10 < 10; i10++) {
            if (bArr[i10] != 0) {
                return false;
            }
        }
        return bArr[10] == -1 && bArr[11] == -1;
    }

    public static final String toCanonicalHost(String str) {
        str.getClass();
        if (!AbstractC8621f0.m33126a0(str, ":", false, 2, null)) {
            String strIdnToAscii = idnToAscii(str);
            if (strIdnToAscii == null || strIdnToAscii.length() == 0 || containsInvalidHostnameAsciiCodes(strIdnToAscii) || containsInvalidLabelLengths(strIdnToAscii)) {
                return null;
            }
            return strIdnToAscii;
        }
        byte[] bArrDecodeIpv6 = (AbstractC8611a0.m33075T(str, "[", false, 2, null) && AbstractC8611a0.m33060E(str, "]", false, 2, null)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
        if (bArrDecodeIpv6 == null) {
            return null;
        }
        byte[] bArrCanonicalizeInetAddress = canonicalizeInetAddress(bArrDecodeIpv6);
        if (bArrCanonicalizeInetAddress.length == 16) {
            return inet6AddressToAscii(bArrCanonicalizeInetAddress);
        }
        if (bArrCanonicalizeInetAddress.length == 4) {
            return inet4AddressToAscii(bArrCanonicalizeInetAddress);
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
