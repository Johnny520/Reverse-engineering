package okhttp3.internal;

import gg.AbstractC1416l;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import okio.Buffer;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class HostnamesKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = str.charAt(i9);
            if (AbstractC1416l.m3827c(cCharAt, 31) <= 0 || AbstractC1416l.m3827c(cCharAt, 127) >= 0 || AbstractC3149m.m6718q0(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final boolean decodeIpv4Suffix(String str, int i9, int i10, byte[] bArr, int i11) {
        int i12 = i11;
        while (i9 < i10) {
            if (i12 == bArr.length) {
                return false;
            }
            if (i12 != i11) {
                if (str.charAt(i9) != '.') {
                    return false;
                }
                i9++;
            }
            int i13 = i9;
            int i14 = 0;
            while (i13 < i10) {
                char cCharAt = str.charAt(i13);
                if (AbstractC1416l.m3827c(cCharAt, 48) < 0 || AbstractC1416l.m3827c(cCharAt, 57) > 0) {
                    break;
                }
                if ((i14 == 0 && i9 != i13) || (i14 = ((i14 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i13++;
            }
            if (i13 - i9 == 0) {
                return false;
            }
            bArr[i12] = (byte) i14;
            i12++;
            i9 = i13;
        }
        return i12 == i11 + 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        if (r4 == 16) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        if (r5 != (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
    
        r10 = r4 - r5;
        java.lang.System.arraycopy(r1, r5, r1, 16 - r10, r10);
        java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        return java.net.InetAddress.getByAddress(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final InetAddress decodeIpv6(String str, int i9, int i10) {
        int i11;
        byte[] bArr = new byte[16];
        int i12 = 0;
        int i13 = -1;
        int i14 = -1;
        while (true) {
            if (i9 >= i10) {
                break;
            }
            if (i12 == 16) {
                return null;
            }
            int i15 = i9 + 2;
            if (i15 <= i10 && AbstractC3156t.m6739c0(str, "::", i9, false)) {
                if (i13 != -1) {
                    return null;
                }
                i12 += 2;
                i13 = i12;
                if (i15 == i10) {
                    break;
                }
                i14 = i15;
                int i16 = 0;
                i9 = i14;
                while (i9 < i10) {
                }
                i11 = i9 - i14;
                return i11 == 0 ? null : null;
            }
            if (i12 != 0) {
                if (AbstractC3156t.m6739c0(str, ":", i9, false)) {
                    i9++;
                } else {
                    if (!AbstractC3156t.m6739c0(str, ".", i9, false) || !decodeIpv4Suffix(str, i14, i10, bArr, i12 - 2)) {
                        return null;
                    }
                    i12 += 2;
                }
            }
            i14 = i9;
            int i162 = 0;
            i9 = i14;
            while (i9 < i10) {
                int hexDigit = Util.parseHexDigit(str.charAt(i9));
                if (hexDigit == -1) {
                    break;
                }
                i162 = (i162 << 4) + hexDigit;
                i9++;
            }
            i11 = i9 - i14;
            if (i11 == 0 && i11 <= 4) {
                int i17 = i12 + 1;
                bArr[i12] = (byte) ((i162 >>> 8) & 255);
                i12 += 2;
                bArr[i17] = (byte) (i162 & 255);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final String inet6AddressToAscii(byte[] bArr) {
        int i9 = -1;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr.length) {
            int i13 = i11;
            while (i13 < 16 && bArr[i13] == 0 && bArr[i13 + 1] == 0) {
                i13 += 2;
            }
            int i14 = i13 - i11;
            if (i14 > i12 && i14 >= 4) {
                i9 = i11;
                i12 = i14;
            }
            i11 = i13 + 2;
        }
        Buffer buffer = new Buffer();
        while (i10 < bArr.length) {
            if (i10 == i9) {
                buffer.writeByte(58);
                i10 += i12;
                if (i10 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i10 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((Util.and(bArr[i10], 255) << 8) | Util.and(bArr[i10 + 1], 255));
                i10 += 2;
            }
        }
        return buffer.readUtf8();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String toCanonicalHost(String str) {
        str.getClass();
        if (AbstractC3149m.m6709h0(str, ":", false)) {
            InetAddress inetAddressDecodeIpv6 = (AbstractC3156t.m6740d0(str, "[", false) && AbstractC3156t.m6733W(str, "]", false)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
            if (inetAddressDecodeIpv6 == null) {
                return null;
            }
            byte[] address = inetAddressDecodeIpv6.getAddress();
            if (address.length == 16) {
                return inet6AddressToAscii(address);
            }
            if (address.length == 4) {
                return inetAddressDecodeIpv6.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        try {
            String ascii = IDN.toASCII(str);
            ascii.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = ascii.toLowerCase(locale);
            lowerCase.getClass();
            if (lowerCase.length() == 0) {
                return null;
            }
            if (containsInvalidHostnameAsciiCodes(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
