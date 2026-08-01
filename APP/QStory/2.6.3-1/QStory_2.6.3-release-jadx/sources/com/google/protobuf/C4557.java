package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏楪世哲子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4557 extends AbstractC4245 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f11889;

    public /* synthetic */ C4557(int i) {
        this.f11889 = i;
    }

    @Override // com.google.protobuf.AbstractC4245
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo8088(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        switch (this.f11889) {
            case 0:
                int length = str.length();
                int i5 = i + i2;
                int i6 = 0;
                while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
                    bArr[i4] = (byte) cCharAt;
                    i6++;
                }
                if (i6 == length) {
                    return i + length;
                }
                int i7 = i + i6;
                while (i6 < length) {
                    char cCharAt2 = str.charAt(i6);
                    if (cCharAt2 < 128 && i7 < i5) {
                        bArr[i7] = (byte) cCharAt2;
                        i7++;
                    } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                        int i8 = i7 + 1;
                        bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                        i7 += 2;
                        bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                            if (i7 > i5 - 4) {
                                if (55296 > cCharAt2 || cCharAt2 > 57343 || ((i3 = i6 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                    throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                                }
                                return AbstractC4245.m8074(str, bArr, i, i2);
                            }
                            i6++;
                            if (i6 != str.length()) {
                                char cCharAt3 = str.charAt(i6);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i9 = i7 + 3;
                                    bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i7 += 4;
                                    bArr[i9] = (byte) ((codePoint & 63) | 128);
                                }
                            }
                            return AbstractC4245.m8074(str, bArr, i, i2);
                        }
                        bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                        int i10 = i7 + 2;
                        bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i7 += 3;
                        bArr[i10] = (byte) ((cCharAt2 & '?') | 128);
                    }
                    i6++;
                }
                return i7;
            default:
                return AbstractC4245.m8074(str, bArr, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @Override // com.google.protobuf.AbstractC4245
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo8089(int i, byte[] bArr, int i2) throws InvalidProtocolBufferException {
        switch (this.f11889) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (b < 0) {
                        while (i < i3) {
                            int i5 = i + 1;
                            byte b2 = bArr[i];
                            if (b2 >= 0) {
                                int i6 = i4 + 1;
                                cArr[i4] = (char) b2;
                                while (i5 < i3) {
                                    byte b3 = bArr[i5];
                                    if (b3 >= 0) {
                                        i5++;
                                        cArr[i6] = (char) b3;
                                        i6++;
                                    } else {
                                        i4 = i6;
                                        i = i5;
                                    }
                                }
                                i4 = i6;
                                i = i5;
                            } else if (b2 < -32) {
                                if (i5 >= i3) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                i += 2;
                                byte b4 = bArr[i5];
                                int i7 = i4 + 1;
                                if (b2 < -62 || AbstractC4245.m8087(b4)) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                                i4 = i7;
                            } else {
                                if (b2 >= -16) {
                                    if (i5 >= i3 - 2) {
                                        throw InvalidProtocolBufferException.invalidUtf8();
                                    }
                                    byte b5 = bArr[i5];
                                    int i8 = i + 3;
                                    byte b6 = bArr[i + 2];
                                    i += 4;
                                    byte b7 = bArr[i8];
                                    int i9 = i4 + 1;
                                    if (!AbstractC4245.m8087(b5)) {
                                        if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !AbstractC4245.m8087(b6) && !AbstractC4245.m8087(b7)) {
                                            int i10 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
                                            cArr[i4] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i4 += 2;
                                        }
                                    }
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                if (i5 >= i3 - 1) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                int i11 = i + 2;
                                byte b8 = bArr[i5];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i4 + 1;
                                if (AbstractC4245.m8087(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || AbstractC4245.m8087(b9)))) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                cArr[i4] = (char) (((b8 & 63) << 6) | ((b2 & 15) << 12) | (b9 & 63));
                                i4 = i12;
                            }
                        }
                        return new String(cArr, 0, i4);
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                while (i < i3) {
                }
                return new String(cArr, 0, i4);
            default:
                Charset charset = AbstractC4234.f11404;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                return str;
        }
    }

    @Override // com.google.protobuf.AbstractC4245
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public boolean mo8090(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        switch (this.f11889) {
            case 1:
                if (!byteBuffer.isDirect()) {
                    C6755.m11869("ByteBuffer must be direct");
                    return false;
                }
                if ((i | i2 | (byteBuffer.limit() - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                long jM8580 = AbstractC4558.f11893.m8580(byteBuffer, AbstractC4558.f11897) + ((long) i);
                int i4 = i2 - i;
                if (i4 < 16) {
                    i3 = 0;
                } else {
                    int i5 = (int) ((-jM8580) & 7);
                    long j = jM8580;
                    int i6 = i5;
                    while (true) {
                        if (i6 > 0) {
                            long j2 = j + 1;
                            if (AbstractC4558.f11893.mo8562(j) < 0) {
                                i3 = i5 - i6;
                            } else {
                                i6--;
                                j = j2;
                            }
                        } else {
                            int i7 = i4 - i5;
                            while (i7 >= 8 && (AbstractC4558.f11893.mo8579(j) & (-9187201950435737472L)) == 0) {
                                j += 8;
                                i7 -= 8;
                            }
                            i3 = i4 - i7;
                        }
                    }
                }
                long j3 = jM8580 + ((long) i3);
                int i8 = i4 - i3;
                while (true) {
                    byte bMo8562 = 0;
                    while (true) {
                        if (i8 > 0) {
                            long j4 = j3 + 1;
                            bMo8562 = AbstractC4558.f11893.mo8562(j3);
                            if (bMo8562 >= 0) {
                                i8--;
                                j3 = j4;
                            } else {
                                j3 = j4;
                            }
                        }
                    }
                    if (i8 == 0) {
                        return true;
                    }
                    int i9 = i8 - 1;
                    if (bMo8562 < -32) {
                        if (i9 == 0) {
                            return false;
                        }
                        i8 -= 2;
                        if (bMo8562 < -62) {
                            return false;
                        }
                        long j5 = j3 + 1;
                        if (AbstractC4558.f11893.mo8562(j3) > -65) {
                            return false;
                        }
                        j3 = j5;
                    } else if (bMo8562 < -16) {
                        if (i9 < 2) {
                            return false;
                        }
                        i8 -= 3;
                        long j6 = j3 + 1;
                        AbstractC4559 abstractC4559 = AbstractC4558.f11893;
                        byte bMo85622 = abstractC4559.mo8562(j3);
                        if (bMo85622 > -65) {
                            return false;
                        }
                        if (bMo8562 == -32 && bMo85622 < -96) {
                            return false;
                        }
                        if (bMo8562 == -19 && bMo85622 >= -96) {
                            return false;
                        }
                        j3 += 2;
                        if (abstractC4559.mo8562(j6) > -65) {
                            return false;
                        }
                    } else {
                        if (i9 < 3) {
                            return false;
                        }
                        i8 -= 4;
                        long j7 = j3 + 1;
                        AbstractC4559 abstractC45592 = AbstractC4558.f11893;
                        byte bMo85623 = abstractC45592.mo8562(j3);
                        if (bMo85623 > -65) {
                            return false;
                        }
                        if ((((bMo85623 + 112) + (bMo8562 << 28)) >> 30) != 0) {
                            return false;
                        }
                        long j8 = 2 + j3;
                        if (abstractC45592.mo8562(j7) > -65) {
                            return false;
                        }
                        j3 += 3;
                        if (abstractC45592.mo8562(j8) > -65) {
                            return false;
                        }
                    }
                }
                break;
            default:
                return super.mo8090(byteBuffer, i, i2);
        }
    }

    @Override // com.google.protobuf.AbstractC4245
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo8091(int i, byte[] bArr, int i2) {
        int i3;
        long j;
        long j2;
        int i4 = i;
        switch (this.f11889) {
            case 0:
                break;
            default:
                if ((i4 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i2)));
                }
                long j3 = i4;
                int i5 = i2 - i4;
                if (i5 < 16) {
                    i3 = 0;
                    j2 = j3;
                    j = 1;
                } else {
                    int i6 = 8 - (((int) j3) & 7);
                    i3 = 0;
                    long j4 = j3;
                    j = 1;
                    while (true) {
                        if (i3 < i6) {
                            long j5 = j4 + 1;
                            if (AbstractC4558.m8555(j4, bArr) < 0) {
                                j2 = j3;
                            } else {
                                i3++;
                                j4 = j5;
                            }
                        } else {
                            while (true) {
                                int i7 = i3 + 8;
                                if (i7 <= i5) {
                                    j2 = j3;
                                    if ((AbstractC4558.f11893.m8580(bArr, AbstractC4558.f11890 + j4) & (-9187201950435737472L)) == 0) {
                                        j4 += 8;
                                        i3 = i7;
                                        j3 = j2;
                                    }
                                } else {
                                    j2 = j3;
                                }
                            }
                            while (true) {
                                if (i3 < i5) {
                                    long j6 = j4 + 1;
                                    if (AbstractC4558.m8555(j4, bArr) >= 0) {
                                        i3++;
                                        j4 = j6;
                                    }
                                } else {
                                    i3 = i5;
                                }
                            }
                        }
                    }
                }
                int i8 = i5 - i3;
                long j7 = j2 + ((long) i3);
                while (true) {
                    byte b = 0;
                    while (true) {
                        if (i8 > 0) {
                            long j8 = j7 + j;
                            byte bM8555 = AbstractC4558.m8555(j7, bArr);
                            if (bM8555 >= 0) {
                                i8--;
                                j7 = j8;
                                b = bM8555;
                            } else {
                                j7 = j8;
                                b = bM8555;
                            }
                        }
                    }
                    if (i8 == 0) {
                        return true;
                    }
                    int i9 = i8 - 1;
                    if (b < -32) {
                        if (i9 == 0) {
                            return false;
                        }
                        i8 -= 2;
                        if (b < -62) {
                            return false;
                        }
                        long j9 = j7 + j;
                        if (AbstractC4558.m8555(j7, bArr) > -65) {
                            return false;
                        }
                        j7 = j9;
                    } else if (b < -16) {
                        if (i9 < 2) {
                            return false;
                        }
                        i8 -= 3;
                        long j10 = j7 + j;
                        byte bM85552 = AbstractC4558.m8555(j7, bArr);
                        if (bM85552 > -65) {
                            return false;
                        }
                        if (b == -32 && bM85552 < -96) {
                            return false;
                        }
                        if (b == -19 && bM85552 >= -96) {
                            return false;
                        }
                        j7 += 2;
                        if (AbstractC4558.m8555(j10, bArr) > -65) {
                            return false;
                        }
                    } else {
                        if (i9 < 3) {
                            return false;
                        }
                        i8 -= 4;
                        long j11 = j7 + j;
                        byte bM85553 = AbstractC4558.m8555(j7, bArr);
                        if (bM85553 > -65) {
                            return false;
                        }
                        if ((((bM85553 + 112) + (b << 28)) >> 30) != 0) {
                            return false;
                        }
                        long j12 = j7 + 2;
                        if (AbstractC4558.m8555(j11, bArr) > -65) {
                            return false;
                        }
                        j7 += 3;
                        if (AbstractC4558.m8555(j12, bArr) > -65) {
                            return false;
                        }
                    }
                }
                break;
        }
        while (i4 < i2 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 < i2) {
            while (i4 < i2) {
                int i10 = i4 + 1;
                byte b2 = bArr[i4];
                if (b2 >= 0) {
                    i4 = i10;
                } else if (b2 < -32) {
                    if (i10 >= i2 || b2 < -62) {
                        return false;
                    }
                    i4 += 2;
                    if (bArr[i10] > -65) {
                        return false;
                    }
                } else if (b2 < -16) {
                    if (i10 >= i2 - 1) {
                        return false;
                    }
                    int i11 = i4 + 2;
                    byte b3 = bArr[i10];
                    if (b3 > -65) {
                        return false;
                    }
                    if (b2 == -32 && b3 < -96) {
                        return false;
                    }
                    if (b2 == -19 && b3 >= -96) {
                        return false;
                    }
                    i4 += 3;
                    if (bArr[i11] > -65) {
                        return false;
                    }
                } else {
                    if (i10 >= i2 - 2) {
                        return false;
                    }
                    int i12 = i4 + 2;
                    byte b4 = bArr[i10];
                    if (b4 > -65) {
                        return false;
                    }
                    if ((((b4 + 112) + (b2 << 28)) >> 30) != 0) {
                        return false;
                    }
                    int i13 = i4 + 3;
                    if (bArr[i12] > -65) {
                        return false;
                    }
                    i4 += 4;
                    if (bArr[i13] > -65) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
