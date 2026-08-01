package com.google.protobuf;

import java.io.IOException;
import java.lang.Character;
import java.math.BigInteger;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4552 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean f11887;

    static {
        Logger.getLogger(AbstractC4552.class.getName());
        f11887 = System.getenv().getOrDefault("SILENT_MARKER_INSERTION_ENABLED", "false").equals("true");
        TextFormat$Parser$SingularOverwritePolicy textFormat$Parser$SingularOverwritePolicy = TextFormat$Parser$SingularOverwritePolicy.ALLOW_SINGULAR_OVERWRITES;
        int i = C4531.f11848;
        C4531 c4531 = AbstractC4532.f11849;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static ByteString m8539(String str) throws IOException {
        int i;
        int i2;
        int length;
        int i3;
        byte bByteAt;
        byte bByteAt2;
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8(str.toString());
        int size = byteStringCopyFromUtf8.size();
        byte[] bArr = new byte[size];
        int i4 = 0;
        int i5 = 0;
        while (i4 < byteStringCopyFromUtf8.size()) {
            byte bByteAt3 = byteStringCopyFromUtf8.byteAt(i4);
            if (bByteAt3 == 92) {
                int i6 = i4 + 1;
                if (i6 >= byteStringCopyFromUtf8.size()) {
                    final String str2 = "Invalid escape sequence: '\\' at end of string.";
                    throw new IOException(str2) { // from class: com.google.protobuf.TextFormat$InvalidEscapeSequenceException
                        private static final long serialVersionUID = -8164033650142593304L;
                    };
                }
                byte bByteAt4 = byteStringCopyFromUtf8.byteAt(i6);
                if (48 > bByteAt4 || bByteAt4 > 55) {
                    if (bByteAt4 == 34) {
                        i = i5 + 1;
                        bArr[i5] = 34;
                    } else if (bByteAt4 == 39) {
                        i = i5 + 1;
                        bArr[i5] = 39;
                    } else if (bByteAt4 != 63) {
                        if (bByteAt4 == 85) {
                            int i7 = i4 + 2;
                            i2 = i4 + 9;
                            final String str3 = "Invalid escape sequence: '\\U' with too few hex chars";
                            if (i2 >= byteStringCopyFromUtf8.size()) {
                                throw new IOException(str3) { // from class: com.google.protobuf.TextFormat$InvalidEscapeSequenceException
                                    private static final long serialVersionUID = -8164033650142593304L;
                                };
                            }
                            int iM8542 = 0;
                            int i8 = i7;
                            while (true) {
                                int i9 = i4 + 10;
                                if (i8 < i9) {
                                    byte bByteAt5 = byteStringCopyFromUtf8.byteAt(i8);
                                    if (!m8541(bByteAt5)) {
                                        throw new IOException(str3) { // from class: com.google.protobuf.TextFormat$InvalidEscapeSequenceException
                                            private static final long serialVersionUID = -8164033650142593304L;
                                        };
                                    }
                                    iM8542 = (iM8542 << 4) | m8542(bByteAt5);
                                    i8++;
                                } else {
                                    if (!Character.isValidCodePoint(iM8542)) {
                                        final String str4 = "Invalid escape sequence: '\\U" + byteStringCopyFromUtf8.substring(i7, i9).toStringUtf8() + "' is not a valid code point value";
                                        throw new IOException(str4) { // from class: com.google.protobuf.TextFormat$InvalidEscapeSequenceException
                                            private static final long serialVersionUID = -8164033650142593304L;
                                        };
                                    }
                                    Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iM8542);
                                    if (unicodeBlockOf != null && (unicodeBlockOf.equals(Character.UnicodeBlock.LOW_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES))) {
                                        final String str5 = "Invalid escape sequence: '\\U" + byteStringCopyFromUtf8.substring(i7, i9).toStringUtf8() + "' refers to a surrogate code unit";
                                        throw new IOException(str5) { // from class: com.google.protobuf.TextFormat$InvalidEscapeSequenceException
                                            private static final long serialVersionUID = -8164033650142593304L;
                                        };
                                    }
                                    byte[] bytes = new String(new int[]{iM8542}, 0, 1).getBytes(AbstractC4234.f11404);
                                    System.arraycopy(bytes, 0, bArr, i5, bytes.length);
                                    length = bytes.length;
                                }
                            }
                        } else if (bByteAt4 == 92) {
                            i = i5 + 1;
                            bArr[i5] = 92;
                        } else if (bByteAt4 == 102) {
                            i = i5 + 1;
                            bArr[i5] = 12;
                        } else if (bByteAt4 == 110) {
                            i = i5 + 1;
                            bArr[i5] = 10;
                        } else if (bByteAt4 == 114) {
                            i = i5 + 1;
                            bArr[i5] = 13;
                        } else if (bByteAt4 == 120) {
                            int i10 = i4 + 2;
                            if (i10 >= byteStringCopyFromUtf8.size() || !m8541(byteStringCopyFromUtf8.byteAt(i10))) {
                                final String str6 = "Invalid escape sequence: '\\x' with no digits";
                                throw new IOException(str6) { // from class: com.google.protobuf.TextFormat$InvalidEscapeSequenceException
                                    private static final long serialVersionUID = -8164033650142593304L;
                                };
                            }
                            int iM85422 = m8542(byteStringCopyFromUtf8.byteAt(i10));
                            i4 += 3;
                            if (i4 >= byteStringCopyFromUtf8.size() || !m8541(byteStringCopyFromUtf8.byteAt(i4))) {
                                i4 = i10;
                            } else {
                                iM85422 = (iM85422 * 16) + m8542(byteStringCopyFromUtf8.byteAt(i4));
                            }
                            i3 = i5 + 1;
                            bArr[i5] = (byte) iM85422;
                        } else if (bByteAt4 == 97) {
                            i = i5 + 1;
                            bArr[i5] = 7;
                        } else if (bByteAt4 != 98) {
                            switch (bByteAt4) {
                                case 116:
                                    i = i5 + 1;
                                    bArr[i5] = 9;
                                    break;
                                case 117:
                                    int i11 = i4 + 2;
                                    i2 = i4 + 5;
                                    if (i2 < byteStringCopyFromUtf8.size() && m8541(byteStringCopyFromUtf8.byteAt(i11))) {
                                        int i12 = i4 + 3;
                                        if (m8541(byteStringCopyFromUtf8.byteAt(i12))) {
                                            int i13 = i4 + 4;
                                            if (m8541(byteStringCopyFromUtf8.byteAt(i13)) && m8541(byteStringCopyFromUtf8.byteAt(i2))) {
                                                char cM8542 = (char) ((m8542(byteStringCopyFromUtf8.byteAt(i13)) << 4) | (m8542(byteStringCopyFromUtf8.byteAt(i11)) << 12) | (m8542(byteStringCopyFromUtf8.byteAt(i12)) << 8) | m8542(byteStringCopyFromUtf8.byteAt(i2)));
                                                if (cM8542 >= 55296 && cM8542 <= 57343) {
                                                    final String str7 = "Invalid escape sequence: '\\u' refers to a surrogate";
                                                    throw new IOException(str7) { // from class: com.google.protobuf.TextFormat$InvalidEscapeSequenceException
                                                        private static final long serialVersionUID = -8164033650142593304L;
                                                    };
                                                }
                                                byte[] bytes2 = Character.toString(cM8542).getBytes(AbstractC4234.f11404);
                                                System.arraycopy(bytes2, 0, bArr, i5, bytes2.length);
                                                length = bytes2.length;
                                                break;
                                            }
                                        }
                                    }
                                    final String str8 = "Invalid escape sequence: '\\u' with too few hex chars";
                                    throw new IOException(str8) { // from class: com.google.protobuf.TextFormat$InvalidEscapeSequenceException
                                        private static final long serialVersionUID = -8164033650142593304L;
                                    };
                                case 118:
                                    i = i5 + 1;
                                    bArr[i5] = 11;
                                    break;
                                default:
                                    final String str9 = "Invalid escape sequence: '\\" + ((char) bByteAt4) + '\'';
                                    throw new IOException(str9) { // from class: com.google.protobuf.TextFormat$InvalidEscapeSequenceException
                                        private static final long serialVersionUID = -8164033650142593304L;
                                    };
                            }
                        } else {
                            i = i5 + 1;
                            bArr[i5] = 8;
                        }
                        i5 += length;
                        i4 = i2;
                    } else {
                        i = i5 + 1;
                        bArr[i5] = 63;
                    }
                    i5 = i;
                    i4 = i6;
                } else {
                    int iM85423 = m8542(bByteAt4);
                    int i14 = i4 + 2;
                    if (i14 < byteStringCopyFromUtf8.size() && 48 <= (bByteAt2 = byteStringCopyFromUtf8.byteAt(i14)) && bByteAt2 <= 55) {
                        iM85423 = (iM85423 * 8) + m8542(byteStringCopyFromUtf8.byteAt(i14));
                        i6 = i14;
                    }
                    i4 = i6 + 1;
                    if (i4 >= byteStringCopyFromUtf8.size() || 48 > (bByteAt = byteStringCopyFromUtf8.byteAt(i4)) || bByteAt > 55) {
                        i4 = i6;
                    } else {
                        iM85423 = (iM85423 * 8) + m8542(byteStringCopyFromUtf8.byteAt(i4));
                    }
                    i3 = i5 + 1;
                    bArr[i5] = (byte) iM85423;
                }
                i5 = i3;
            } else {
                bArr[i5] = bByteAt3;
                i5++;
            }
            i4++;
        }
        return size == i5 ? ByteString.wrap(bArr) : ByteString.copyFrom(bArr, 0, i5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static long m8540(String str, boolean z, boolean z2) {
        int i;
        int i2 = 0;
        if (str.startsWith("-", 0)) {
            if (!z) {
                throw new NumberFormatException("Number must be positive: ".concat(str));
            }
            i2 = 1;
        }
        int i3 = i2;
        if (str.startsWith("0x", i2)) {
            i2 += 2;
            i = 16;
        } else {
            i = str.startsWith("0", i2) ? 8 : 10;
        }
        String strSubstring = str.substring(i2);
        if (strSubstring.length() < 16) {
            long j = Long.parseLong(strSubstring, i);
            if (i3 != 0) {
                j = -j;
            }
            if (!z2) {
                if (z) {
                    if (j > 2147483647L || j < -2147483648L) {
                        throw new NumberFormatException("Number out of range for 32-bit signed integer: ".concat(str));
                    }
                } else if (j >= 4294967296L || j < 0) {
                    throw new NumberFormatException("Number out of range for 32-bit unsigned integer: ".concat(str));
                }
            }
            return j;
        }
        BigInteger bigInteger = new BigInteger(strSubstring, i);
        if (i3 != 0) {
            bigInteger = bigInteger.negate();
        }
        if (z2) {
            if (z) {
                if (bigInteger.bitLength() > 63) {
                    throw new NumberFormatException("Number out of range for 64-bit signed integer: ".concat(str));
                }
            } else if (bigInteger.bitLength() > 64) {
                throw new NumberFormatException("Number out of range for 64-bit unsigned integer: ".concat(str));
            }
        } else if (z) {
            if (bigInteger.bitLength() > 31) {
                throw new NumberFormatException("Number out of range for 32-bit signed integer: ".concat(str));
            }
        } else if (bigInteger.bitLength() > 32) {
            throw new NumberFormatException("Number out of range for 32-bit unsigned integer: ".concat(str));
        }
        return bigInteger.longValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m8541(byte b) {
        if (48 <= b && b <= 57) {
            return true;
        }
        if (97 > b || b > 102) {
            return 65 <= b && b <= 70;
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m8542(byte b) {
        return (48 > b || b > 57) ? (97 > b || b > 122) ? b - 55 : b - 87 : b - 48;
    }
}
