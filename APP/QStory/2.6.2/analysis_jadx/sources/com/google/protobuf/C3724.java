package com.google.protobuf;

import java.nio.ByteBuffer;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏楪世哲子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3724 extends AbstractC3412 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f11539;

    public /* synthetic */ C3724(int i) {
        this.f11539 = i;
    }

    @Override // com.google.protobuf.AbstractC3412
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo7542(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        switch (this.f11539) {
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
                                return AbstractC3412.m7528(str, bArr, i, i2);
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
                            return AbstractC3412.m7528(str, bArr, i, i2);
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
                return AbstractC3412.m7528(str, bArr, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @Override // com.google.protobuf.AbstractC3412
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo7543(int r10, byte[] r11, int r12) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3724.mo7543(int, byte[], int):java.lang.String");
    }

    @Override // com.google.protobuf.AbstractC3412
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public boolean mo7544(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        switch (this.f11539) {
            case 1:
                if (!byteBuffer.isDirect()) {
                    C5919.m11249("ByteBuffer must be direct");
                    return false;
                }
                if ((i | i2 | (byteBuffer.limit() - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                long jM8034 = AbstractC3725.f11543.m8034(byteBuffer, AbstractC3725.f11547) + ((long) i);
                int i4 = i2 - i;
                if (i4 < 16) {
                    i3 = 0;
                } else {
                    int i5 = (int) ((-jM8034) & 7);
                    long j = jM8034;
                    int i6 = i5;
                    while (true) {
                        if (i6 > 0) {
                            long j2 = j + 1;
                            if (AbstractC3725.f11543.mo8016(j) < 0) {
                                i3 = i5 - i6;
                            } else {
                                i6--;
                                j = j2;
                            }
                        } else {
                            int i7 = i4 - i5;
                            while (i7 >= 8 && (AbstractC3725.f11543.mo8033(j) & (-9187201950435737472L)) == 0) {
                                j += 8;
                                i7 -= 8;
                            }
                            i3 = i4 - i7;
                        }
                    }
                }
                long j3 = jM8034 + ((long) i3);
                int i8 = i4 - i3;
                while (true) {
                    byte bMo8016 = 0;
                    while (true) {
                        if (i8 > 0) {
                            long j4 = j3 + 1;
                            bMo8016 = AbstractC3725.f11543.mo8016(j3);
                            if (bMo8016 >= 0) {
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
                    if (bMo8016 < -32) {
                        if (i9 == 0) {
                            return false;
                        }
                        i8 -= 2;
                        if (bMo8016 < -62) {
                            return false;
                        }
                        long j5 = j3 + 1;
                        if (AbstractC3725.f11543.mo8016(j3) > -65) {
                            return false;
                        }
                        j3 = j5;
                    } else if (bMo8016 < -16) {
                        if (i9 < 2) {
                            return false;
                        }
                        i8 -= 3;
                        long j6 = j3 + 1;
                        AbstractC3726 abstractC3726 = AbstractC3725.f11543;
                        byte bMo80162 = abstractC3726.mo8016(j3);
                        if (bMo80162 > -65) {
                            return false;
                        }
                        if (bMo8016 == -32 && bMo80162 < -96) {
                            return false;
                        }
                        if (bMo8016 == -19 && bMo80162 >= -96) {
                            return false;
                        }
                        j3 += 2;
                        if (abstractC3726.mo8016(j6) > -65) {
                            return false;
                        }
                    } else {
                        if (i9 < 3) {
                            return false;
                        }
                        i8 -= 4;
                        long j7 = j3 + 1;
                        AbstractC3726 abstractC37262 = AbstractC3725.f11543;
                        byte bMo80163 = abstractC37262.mo8016(j3);
                        if (bMo80163 > -65) {
                            return false;
                        }
                        if ((((bMo80163 + 112) + (bMo8016 << 28)) >> 30) != 0) {
                            return false;
                        }
                        long j8 = 2 + j3;
                        if (abstractC37262.mo8016(j7) > -65) {
                            return false;
                        }
                        j3 += 3;
                        if (abstractC37262.mo8016(j8) > -65) {
                            return false;
                        }
                    }
                }
                break;
            default:
                return super.mo7544(byteBuffer, i, i2);
        }
    }

    @Override // com.google.protobuf.AbstractC3412
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo7545(int i, byte[] bArr, int i2) {
        int i3;
        long j;
        long j2;
        int i4 = i;
        switch (this.f11539) {
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
                            if (AbstractC3725.m8009(j4, bArr) < 0) {
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
                                    if ((AbstractC3725.f11543.m8034(bArr, AbstractC3725.f11540 + j4) & (-9187201950435737472L)) == 0) {
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
                                    if (AbstractC3725.m8009(j4, bArr) >= 0) {
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
                            byte bM8009 = AbstractC3725.m8009(j7, bArr);
                            if (bM8009 >= 0) {
                                i8--;
                                j7 = j8;
                                b = bM8009;
                            } else {
                                j7 = j8;
                                b = bM8009;
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
                        if (AbstractC3725.m8009(j7, bArr) > -65) {
                            return false;
                        }
                        j7 = j9;
                    } else if (b < -16) {
                        if (i9 < 2) {
                            return false;
                        }
                        i8 -= 3;
                        long j10 = j7 + j;
                        byte bM80092 = AbstractC3725.m8009(j7, bArr);
                        if (bM80092 > -65) {
                            return false;
                        }
                        if (b == -32 && bM80092 < -96) {
                            return false;
                        }
                        if (b == -19 && bM80092 >= -96) {
                            return false;
                        }
                        j7 += 2;
                        if (AbstractC3725.m8009(j10, bArr) > -65) {
                            return false;
                        }
                    } else {
                        if (i9 < 3) {
                            return false;
                        }
                        i8 -= 4;
                        long j11 = j7 + j;
                        byte bM80093 = AbstractC3725.m8009(j7, bArr);
                        if (bM80093 > -65) {
                            return false;
                        }
                        if ((((bM80093 + 112) + (b << 28)) >> 30) != 0) {
                            return false;
                        }
                        long j12 = j7 + 2;
                        if (AbstractC3725.m8009(j11, bArr) > -65) {
                            return false;
                        }
                        j7 += 3;
                        if (AbstractC3725.m8009(j12, bArr) > -65) {
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
