package okio;

import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONB;
import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p136j8.C2104o;
import p222p.AbstractC3199a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean isIsoControl(int i9) {
        if (i9 < 0 || i9 >= 32) {
            return 127 <= i9 && i9 < 160;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean isUtf8Continuation(byte b10) {
        return (b10 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int process2Utf8Bytes(byte[] bArr, int i9, int i10, InterfaceC1231l interfaceC1231l) {
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        bArr.getClass();
        interfaceC1231l.getClass();
        int i11 = i9 + 1;
        if (i10 <= i11) {
            interfaceC1231l.invoke(numValueOf);
            return 1;
        }
        byte b10 = bArr[i9];
        byte b11 = bArr[i11];
        if ((b11 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
            interfaceC1231l.invoke(numValueOf);
            return 1;
        }
        int i12 = (b11 ^ 3968) ^ (b10 << 6);
        if (i12 < 128) {
            interfaceC1231l.invoke(numValueOf);
            return 2;
        }
        interfaceC1231l.invoke(Integer.valueOf(i12));
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int process3Utf8Bytes(byte[] bArr, int i9, int i10, InterfaceC1231l interfaceC1231l) {
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        bArr.getClass();
        interfaceC1231l.getClass();
        int i11 = i9 + 2;
        if (i10 <= i11) {
            interfaceC1231l.invoke(numValueOf);
            int i12 = i9 + 1;
            return (i10 <= i12 || (bArr[i12] & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) ? 1 : 2;
        }
        byte b10 = bArr[i9];
        byte b11 = bArr[i9 + 1];
        if ((b11 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
            interfaceC1231l.invoke(numValueOf);
            return 1;
        }
        byte b12 = bArr[i11];
        if ((b12 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
            interfaceC1231l.invoke(numValueOf);
            return 2;
        }
        int i13 = ((b12 ^ (-123008)) ^ (b11 << 6)) ^ (b10 << 12);
        if (i13 < 2048) {
            interfaceC1231l.invoke(numValueOf);
            return 3;
        }
        if (55296 > i13 || i13 >= 57344) {
            interfaceC1231l.invoke(Integer.valueOf(i13));
            return 3;
        }
        interfaceC1231l.invoke(numValueOf);
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int process4Utf8Bytes(byte[] bArr, int i9, int i10, InterfaceC1231l interfaceC1231l) {
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        bArr.getClass();
        interfaceC1231l.getClass();
        int i11 = i9 + 3;
        if (i10 <= i11) {
            interfaceC1231l.invoke(numValueOf);
            int i12 = i9 + 1;
            if (i10 <= i12 || (bArr[i12] & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                return 1;
            }
            int i13 = i9 + 2;
            return (i10 <= i13 || (bArr[i13] & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) ? 2 : 3;
        }
        byte b10 = bArr[i9];
        byte b11 = bArr[i9 + 1];
        if ((b11 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
            interfaceC1231l.invoke(numValueOf);
            return 1;
        }
        byte b12 = bArr[i9 + 2];
        if ((b12 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
            interfaceC1231l.invoke(numValueOf);
            return 2;
        }
        byte b13 = bArr[i11];
        if ((b13 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
            interfaceC1231l.invoke(numValueOf);
            return 3;
        }
        int i14 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b10 << 18);
        if (i14 > 1114111) {
            interfaceC1231l.invoke(numValueOf);
            return 4;
        }
        if (55296 <= i14 && i14 < 57344) {
            interfaceC1231l.invoke(numValueOf);
            return 4;
        }
        if (i14 < 65536) {
            interfaceC1231l.invoke(numValueOf);
            return 4;
        }
        interfaceC1231l.invoke(Integer.valueOf(i14));
        return 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void processUtf16Chars(byte[] bArr, int i9, int i10, InterfaceC1231l interfaceC1231l) {
        Character chValueOf = Character.valueOf(REPLACEMENT_CHARACTER);
        bArr.getClass();
        interfaceC1231l.getClass();
        while (i9 < i10) {
            byte b10 = bArr[i9];
            if (b10 >= 0) {
                interfaceC1231l.invoke(Character.valueOf((char) b10));
                i9++;
                while (i9 < i10) {
                    byte b11 = bArr[i9];
                    if (b11 >= 0) {
                        i9++;
                        interfaceC1231l.invoke(Character.valueOf((char) b11));
                    }
                }
            } else {
                int i11 = 2;
                if ((b10 >> 5) == -2) {
                    int i12 = i9 + 1;
                    if (i10 > i12) {
                        byte b12 = bArr[i12];
                        if ((b12 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                            int i13 = (b10 << 6) ^ (b12 ^ 3968);
                            interfaceC1231l.invoke(Character.valueOf(i13 < 128 ? (char) REPLACEMENT_CODE_POINT : (char) i13));
                            i9 += i11;
                        }
                    }
                    interfaceC1231l.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                    i11 = 1;
                    i9 += i11;
                } else if ((b10 >> 4) == -2) {
                    int i14 = i9 + 2;
                    if (i10 <= i14) {
                        interfaceC1231l.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                        int i15 = i9 + 1;
                        if (i10 <= i15 || (bArr[i15] & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                            i11 = 1;
                        }
                        i9 += i11;
                    } else {
                        byte b13 = bArr[i9 + 1];
                        if ((b13 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                            byte b14 = bArr[i14];
                            if ((b14 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                int i16 = (b10 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                interfaceC1231l.invoke(Character.valueOf((i16 >= 2048 && (55296 > i16 || i16 >= 57344)) ? (char) i16 : (char) REPLACEMENT_CODE_POINT));
                                i11 = 3;
                                i9 += i11;
                            } else {
                                interfaceC1231l.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                                i9 += i11;
                            }
                        } else {
                            interfaceC1231l.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                            i11 = 1;
                            i9 += i11;
                        }
                    }
                } else if ((b10 >> 3) == -2) {
                    int i17 = i9 + 3;
                    if (i10 <= i17) {
                        interfaceC1231l.invoke(chValueOf);
                        int i18 = i9 + 1;
                        if (i10 > i18 && (bArr[i18] & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                            int i19 = i9 + 2;
                            if (i10 > i19 && (bArr[i19] & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                i11 = 3;
                            }
                        }
                        i9 += i11;
                    } else {
                        byte b15 = bArr[i9 + 1];
                        if ((b15 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                            byte b16 = bArr[i9 + 2];
                            if ((b16 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                byte b17 = bArr[i17];
                                if ((b17 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                    int i20 = (b10 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                    if (i20 <= 1114111 && ((55296 > i20 || i20 >= 57344) && i20 >= 65536 && i20 != 65533)) {
                                        interfaceC1231l.invoke(Character.valueOf((char) ((i20 >>> 10) + HIGH_SURROGATE_HEADER)));
                                        interfaceC1231l.invoke(Character.valueOf((char) ((i20 & 1023) + LOG_SURROGATE_HEADER)));
                                    } else {
                                        interfaceC1231l.invoke(chValueOf);
                                    }
                                    i11 = 4;
                                } else {
                                    interfaceC1231l.invoke(chValueOf);
                                    i11 = 3;
                                }
                            } else {
                                interfaceC1231l.invoke(chValueOf);
                            }
                            i9 += i11;
                        } else {
                            interfaceC1231l.invoke(chValueOf);
                            i11 = 1;
                            i9 += i11;
                        }
                    }
                } else {
                    interfaceC1231l.invoke(chValueOf);
                    i9++;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void processUtf8Bytes(String str, int i9, int i10, InterfaceC1231l interfaceC1231l) {
        int i11;
        char cCharAt;
        str.getClass();
        interfaceC1231l.getClass();
        while (i9 < i10) {
            char cCharAt2 = str.charAt(i9);
            if (AbstractC1416l.m3827c(cCharAt2, 128) < 0) {
                interfaceC1231l.invoke(Byte.valueOf((byte) cCharAt2));
                i9++;
                while (i9 < i10 && AbstractC1416l.m3827c(str.charAt(i9), 128) < 0) {
                    interfaceC1231l.invoke(Byte.valueOf((byte) str.charAt(i9)));
                    i9++;
                }
            } else {
                if (AbstractC1416l.m3827c(cCharAt2, Opcodes.ACC_STRICT) < 0) {
                    interfaceC1231l.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | Opcodes.CHECKCAST)));
                    interfaceC1231l.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 > cCharAt2 || cCharAt2 >= 57344) {
                    interfaceC1231l.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
                    interfaceC1231l.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    interfaceC1231l.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (AbstractC1416l.m3827c(cCharAt2, 56319) > 0 || i10 <= (i11 = i9 + 1) || 56320 > (cCharAt = str.charAt(i11)) || cCharAt >= 57344) {
                    interfaceC1231l.invoke((byte) 63);
                } else {
                    int iCharAt = (str.charAt(i11) + (cCharAt2 << '\n')) - 56613888;
                    interfaceC1231l.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                    interfaceC1231l.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                    interfaceC1231l.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                    interfaceC1231l.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                    i9 += 2;
                }
                i9++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void processUtf8CodePoints(byte[] bArr, int i9, int i10, InterfaceC1231l interfaceC1231l) {
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        bArr.getClass();
        interfaceC1231l.getClass();
        while (i9 < i10) {
            byte b10 = bArr[i9];
            if (b10 >= 0) {
                interfaceC1231l.invoke(Integer.valueOf(b10));
                i9++;
                while (i9 < i10) {
                    byte b11 = bArr[i9];
                    if (b11 >= 0) {
                        i9++;
                        interfaceC1231l.invoke(Integer.valueOf(b11));
                    }
                }
            } else {
                int i11 = 2;
                if ((b10 >> 5) == -2) {
                    int i12 = i9 + 1;
                    if (i10 > i12) {
                        byte b12 = bArr[i12];
                        if ((b12 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                            int i13 = (b10 << 6) ^ (b12 ^ 3968);
                            if (i13 < 128) {
                                interfaceC1231l.invoke(numValueOf);
                            } else {
                                interfaceC1231l.invoke(Integer.valueOf(i13));
                            }
                            i9 += i11;
                        }
                    }
                    interfaceC1231l.invoke(numValueOf);
                    i11 = 1;
                    i9 += i11;
                } else if ((b10 >> 4) == -2) {
                    int i14 = i9 + 2;
                    if (i10 <= i14) {
                        interfaceC1231l.invoke(numValueOf);
                        int i15 = i9 + 1;
                        if (i10 <= i15 || (bArr[i15] & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                            i11 = 1;
                        }
                        i9 += i11;
                    } else {
                        byte b13 = bArr[i9 + 1];
                        if ((b13 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                            byte b14 = bArr[i14];
                            if ((b14 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                int i16 = (b10 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                if (i16 >= 2048 && (55296 > i16 || i16 >= 57344)) {
                                    interfaceC1231l.invoke(Integer.valueOf(i16));
                                } else {
                                    interfaceC1231l.invoke(numValueOf);
                                }
                                i11 = 3;
                                i9 += i11;
                            } else {
                                interfaceC1231l.invoke(numValueOf);
                                i9 += i11;
                            }
                        } else {
                            interfaceC1231l.invoke(numValueOf);
                            i11 = 1;
                            i9 += i11;
                        }
                    }
                } else if ((b10 >> 3) == -2) {
                    int i17 = i9 + 3;
                    if (i10 <= i17) {
                        interfaceC1231l.invoke(numValueOf);
                        int i18 = i9 + 1;
                        if (i10 > i18 && (bArr[i18] & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                            int i19 = i9 + 2;
                            if (i10 > i19 && (bArr[i19] & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                i11 = 3;
                            }
                        }
                        i9 += i11;
                    } else {
                        byte b15 = bArr[i9 + 1];
                        if ((b15 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                            byte b16 = bArr[i9 + 2];
                            if ((b16 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                byte b17 = bArr[i17];
                                if ((b17 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                    int i20 = (b10 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                    if (i20 <= 1114111 && ((55296 > i20 || i20 >= 57344) && i20 >= 65536)) {
                                        interfaceC1231l.invoke(Integer.valueOf(i20));
                                    } else {
                                        interfaceC1231l.invoke(numValueOf);
                                    }
                                    i11 = 4;
                                } else {
                                    interfaceC1231l.invoke(numValueOf);
                                    i11 = 3;
                                }
                            } else {
                                interfaceC1231l.invoke(numValueOf);
                            }
                            i9 += i11;
                        } else {
                            interfaceC1231l.invoke(numValueOf);
                            i11 = 1;
                            i9 += i11;
                        }
                    }
                } else {
                    interfaceC1231l.invoke(numValueOf);
                    i9++;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long size(String str, int i9, int i10) {
        int i11;
        str.getClass();
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2249l(i9, "beginIndex < 0: "));
            return 0L;
        }
        if (i10 < i9) {
            C2104o.m5291q(AbstractC3199a.m6837j(i10, "endIndex < beginIndex: ", " < ", i9));
            return 0L;
        }
        if (i10 > str.length()) {
            C3193a.m6816e(str.length(), AbstractC0921a.m2257t(i10, "endIndex > string.length: ", " > "));
            return 0L;
        }
        long j3 = 0;
        while (i9 < i10) {
            char cCharAt = str.charAt(i9);
            if (cCharAt < 128) {
                j3++;
            } else {
                if (cCharAt < 2048) {
                    i11 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i11 = 3;
                } else {
                    int i12 = i9 + 1;
                    char cCharAt2 = i12 < i10 ? str.charAt(i12) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j3++;
                        i9 = i12;
                    } else {
                        j3 += (long) 4;
                        i9 += 2;
                    }
                }
                j3 += (long) i11;
            }
            i9++;
        }
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ long size$default(String str, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return size(str, i9, i10);
    }

    public static final long size(String str, int i9) {
        str.getClass();
        return size$default(str, i9, 0, 2, null);
    }

    public static final long size(String str) {
        str.getClass();
        return size$default(str, 0, 0, 3, null);
    }
}
