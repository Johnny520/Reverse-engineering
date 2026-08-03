package okio.internal;

import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONB;
import gg.AbstractC1416l;
import java.util.Arrays;
import okio.Utf8;
import p218og.AbstractC3156t;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class _Utf8Kt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte[] commonAsUtf8ToByteArray(String str) {
        int i9;
        char cCharAt;
        str.getClass();
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt2 = str.charAt(i10);
            if (AbstractC1416l.m3827c(cCharAt2, 128) >= 0) {
                int length2 = str.length();
                int i11 = i10;
                while (i10 < length2) {
                    char cCharAt3 = str.charAt(i10);
                    if (AbstractC1416l.m3827c(cCharAt3, 128) < 0) {
                        int i12 = i11 + 1;
                        bArr[i11] = (byte) cCharAt3;
                        i10++;
                        while (true) {
                            i11 = i12;
                            if (i10 >= length2 || AbstractC1416l.m3827c(str.charAt(i10), 128) >= 0) {
                                break;
                            }
                            i12 = i11 + 1;
                            bArr[i11] = (byte) str.charAt(i10);
                            i10++;
                        }
                    } else {
                        if (AbstractC1416l.m3827c(cCharAt3, Opcodes.ACC_STRICT) < 0) {
                            bArr[i11] = (byte) ((cCharAt3 >> 6) | Opcodes.CHECKCAST);
                            i11 += 2;
                            bArr[i11 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i11] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i11 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i11 += 3;
                            bArr[i11 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (AbstractC1416l.m3827c(cCharAt3, 56319) > 0 || length2 <= (i9 = i10 + 1) || 56320 > (cCharAt = str.charAt(i9)) || cCharAt >= 57344) {
                            bArr[i11] = 63;
                            i10++;
                            i11++;
                        } else {
                            int iCharAt = (str.charAt(i9) + (cCharAt3 << '\n')) - 56613888;
                            bArr[i11] = (byte) ((iCharAt >> 18) | 240);
                            bArr[i11 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i11 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            i11 += 4;
                            bArr[i11 + 3] = (byte) ((iCharAt & 63) | 128);
                            i10 += 2;
                        }
                        i10++;
                    }
                }
                return Arrays.copyOf(bArr, i11);
            }
            bArr[i10] = (byte) cCharAt2;
            i10++;
        }
        return Arrays.copyOf(bArr, str.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if ((r16[r5] & com.alibaba.fastjson2.JSONB.Constants.BC_INT64_SHORT_MIN) == 128) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ea, code lost:
    
        if ((r16[r5] & com.alibaba.fastjson2.JSONB.Constants.BC_INT64_SHORT_MIN) == 128) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String commonToUtf8String(byte[] bArr, int i9, int i10) {
        byte b10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = i9;
        bArr.getClass();
        if (i16 < 0 || i10 > bArr.length || i16 > i10) {
            StringBuilder sb2 = new StringBuilder("size=");
            AbstractC4855en.m9272p(sb2, bArr.length, " beginIndex=", i16, " endIndex=");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        char[] cArr = new char[i10 - i16];
        int i17 = 0;
        while (i16 < i10) {
            byte b11 = bArr[i16];
            if (b11 >= 0) {
                int i18 = i17 + 1;
                cArr[i17] = (char) b11;
                i16++;
                while (true) {
                    i17 = i18;
                    if (i16 >= i10 || (b10 = bArr[i16]) < 0) {
                        break;
                    }
                    i16++;
                    i18 = i17 + 1;
                    cArr[i17] = (char) b10;
                }
            } else {
                if ((b11 >> 5) == -2) {
                    int i19 = i16 + 1;
                    if (i10 <= i19) {
                        i11 = i17 + 1;
                        cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    } else {
                        byte b12 = bArr[i19];
                        if ((b12 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                            int i20 = (b11 << 6) ^ (b12 ^ 3968);
                            if (i20 < 128) {
                                i11 = i17 + 1;
                                cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            } else {
                                i11 = i17 + 1;
                                cArr[i17] = (char) i20;
                            }
                            i17 = i11;
                            i12 = 2;
                        } else {
                            i11 = i17 + 1;
                            cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        }
                    }
                    i17 = i11;
                    i12 = 1;
                } else {
                    if ((b11 >> 4) == -2) {
                        int i21 = i16 + 2;
                        if (i10 <= i21) {
                            i11 = i17 + 1;
                            cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            int i22 = i16 + 1;
                            if (i10 > i22) {
                            }
                            i17 = i11;
                            i12 = 1;
                        } else {
                            byte b13 = bArr[i16 + 1];
                            if ((b13 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                byte b14 = bArr[i21];
                                if ((b14 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                    int i23 = (b11 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                    if (i23 < 2048) {
                                        i13 = i17 + 1;
                                        cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                    } else if (55296 > i23 || i23 >= 57344) {
                                        i13 = i17 + 1;
                                        cArr[i17] = (char) i23;
                                    } else {
                                        i13 = i17 + 1;
                                        cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                    }
                                    i17 = i13;
                                } else {
                                    i11 = i17 + 1;
                                    cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                    i17 = i11;
                                    i12 = 2;
                                }
                            } else {
                                i11 = i17 + 1;
                                cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                i17 = i11;
                                i12 = 1;
                            }
                        }
                    } else if ((b11 >> 3) == -2) {
                        int i24 = i16 + 3;
                        if (i10 <= i24) {
                            i14 = i17 + 1;
                            cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                            int i25 = i16 + 1;
                            if (i10 > i25 && (bArr[i25] & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                int i26 = i16 + 2;
                                if (i10 > i26) {
                                }
                                i17 = i14;
                                i12 = 2;
                            }
                            i17 = i14;
                            i12 = 1;
                        } else {
                            byte b15 = bArr[i16 + 1];
                            if ((b15 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                byte b16 = bArr[i16 + 2];
                                if ((b16 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                    byte b17 = bArr[i24];
                                    if ((b17 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                        int i27 = (b11 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                        if (i27 > 1114111) {
                                            i15 = i17 + 1;
                                            cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if ((55296 > i27 || i27 >= 57344) && i27 >= 65536 && i27 != 65533) {
                                            cArr[i17] = (char) ((i27 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                            cArr[i17 + 1] = (char) ((i27 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                            i15 = i17 + 2;
                                        } else {
                                            i15 = i17 + 1;
                                            cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                        }
                                        i12 = 4;
                                        i17 = i15;
                                    } else {
                                        i14 = i17 + 1;
                                        cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                        i17 = i14;
                                    }
                                } else {
                                    i14 = i17 + 1;
                                    cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                    i17 = i14;
                                    i12 = 2;
                                }
                            } else {
                                i14 = i17 + 1;
                                cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                i17 = i14;
                                i12 = 1;
                            }
                        }
                    } else {
                        cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                        i16++;
                        i17++;
                    }
                    i12 = 3;
                }
                i16 += i12;
            }
        }
        return AbstractC3156t.m6732V(cArr, 0, i17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = bArr.length;
        }
        return commonToUtf8String(bArr, i9, i10);
    }
}
