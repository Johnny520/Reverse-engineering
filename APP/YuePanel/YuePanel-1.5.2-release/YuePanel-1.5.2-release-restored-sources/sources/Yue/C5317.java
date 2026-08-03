package Yue;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5317 {
    /* JADX INFO: renamed from: ۥ */
    public static final boolean m2097(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (C5499.m17107(cCharAt, 31) <= 0 || C5499.m17107(cCharAt, 127) >= 0 || C7628.m24056(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean m2098(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char cCharAt = str.charAt(i5);
                if (C5499.m17107(cCharAt, 48) < 0 || C5499.m17107(cCharAt, 57) > 0) {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        if (r13 == 16) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
    
        if (r14 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
    
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress m16317(String str, int i, int i2) {
        int i3;
        byte[] bArr = new byte[16];
        int i4 = i;
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        while (true) {
            if (i4 < i2) {
                if (i7 != 16) {
                    int i8 = i4 + 2;
                    if (i8 <= i2 && C7627.m24007(str, "::", i4, false, 4, null)) {
                        if (i5 == -1) {
                            i7 += 2;
                            if (i8 != i2) {
                                i6 = i8;
                                i5 = i7;
                                i4 = i6;
                                int i9 = 0;
                                while (i4 < i2) {
                                }
                                i3 = i4 - i6;
                                if (i3 == 0) {
                                    break;
                                }
                                break;
                                break;
                            }
                            i5 = i7;
                            break;
                        }
                        return null;
                    }
                    if (i7 != 0) {
                        if (C7627.m24007(str, ":", i4, false, 4, null)) {
                            i4++;
                        } else {
                            if (!C7627.m24007(str, ".", i4, false, 4, null) || !m2098(str, i6, i2, bArr, i7 - 2)) {
                                return null;
                            }
                            i7 += 2;
                        }
                    }
                    i6 = i4;
                    i4 = i6;
                    int i92 = 0;
                    while (i4 < i2) {
                        int iM26873 = C8158.m26873(str.charAt(i4));
                        if (iM26873 == -1) {
                            break;
                        }
                        i92 = (i92 << 4) + iM26873;
                        i4++;
                    }
                    i3 = i4 - i6;
                    if (i3 == 0 || i3 > 4) {
                        break;
                    }
                    int i10 = i7 + 1;
                    bArr[i7] = (byte) ((i92 >>> 8) & 255);
                    i7 += 2;
                    bArr[i10] = (byte) (i92 & 255);
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String m16318(byte[] bArr) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C3600 c3600 = new C3600();
        while (i2 < bArr.length) {
            if (i2 == i) {
                c3600.writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    c3600.writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    c3600.writeByte(58);
                }
                c3600.mo9646((C8158.m26833(bArr[i2], 255) << 8) | C8158.m26833(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return c3600.mo9662();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String m16319(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        if (!C7628.m24035(str, ":", false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                C5499.m17102(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                C5499.m17102(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                if (m2097(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM16317 = (C7627.m24008(str, "[", false, 2, null) && C7627.m23973(str, "]", false, 2, null)) ? m16317(str, 1, str.length() - 1) : m16317(str, 0, str.length());
        if (inetAddressM16317 == null) {
            return null;
        }
        byte[] address = inetAddressM16317.getAddress();
        if (address.length == 16) {
            C5499.m17102(address, "address");
            return m16318(address);
        }
        if (address.length == 4) {
            return inetAddressM16317.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
