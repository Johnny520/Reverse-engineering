package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4375 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m8322(InterfaceC4177 interfaceC4177, int i, byte[] bArr, int i2, int i3, InterfaceC4235 interfaceC4235, C4378 c4378) {
        int iM8323 = m8323(interfaceC4177, bArr, i2, i3, c4378);
        interfaceC4235.add(c4378.f11539);
        while (iM8323 < i3) {
            int iM8336 = m8336(bArr, iM8323, c4378);
            if (i != c4378.f11541) {
                break;
            }
            iM8323 = m8323(interfaceC4177, bArr, iM8336, i3, c4378);
            interfaceC4235.add(c4378.f11539);
        }
        return iM8323;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m8323(InterfaceC4177 interfaceC4177, byte[] bArr, int i, int i2, C4378 c4378) {
        Object objNewInstance = interfaceC4177.newInstance();
        int iM8332 = m8332(objNewInstance, interfaceC4177, bArr, i, i2, c4378);
        interfaceC4177.mo7953(objNewInstance);
        c4378.f11539 = objNewInstance;
        return iM8332;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m8324(InterfaceC4177 interfaceC4177, byte[] bArr, int i, int i2, int i3, C4378 c4378) {
        Object objNewInstance = interfaceC4177.newInstance();
        int iM8331 = m8331(objNewInstance, interfaceC4177, bArr, i, i2, i3, c4378);
        interfaceC4177.mo7953(objNewInstance);
        c4378.f11539 = objNewInstance;
        return iM8331;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static long m8325(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m8326(byte[] bArr, int i) {
        return ((bArr[i + 3] & DefaultClassResolver.NAME) << 24) | (bArr[i] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 16);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m8327(byte[] bArr, int i, C4378 c4378) {
        int iM8336 = m8336(bArr, i, c4378);
        int i2 = c4378.f11541;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - iM8336) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            c4378.f11539 = ByteString.EMPTY;
            return iM8336;
        }
        c4378.f11539 = ByteString.copyFrom(bArr, iM8336, i2);
        return iM8336 + i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static int m8328(byte[] bArr, int i, C4378 c4378) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c4378.f11540 = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        c4378.f11540 = j2;
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static int m8329(int i, byte[] bArr, int i2, int i3, InterfaceC4235 interfaceC4235, C4378 c4378) {
        C4445 c4445 = (C4445) interfaceC4235;
        int iM8336 = m8336(bArr, i2, c4378);
        c4445.m8371(c4378.f11541);
        while (iM8336 < i3) {
            int iM83362 = m8336(bArr, iM8336, c4378);
            if (i != c4378.f11541) {
                break;
            }
            iM8336 = m8336(bArr, iM83362, c4378);
            c4445.m8371(c4378.f11541);
        }
        return iM8336;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static int m8330(int i, byte[] bArr, int i2, int i3, C4378 c4378) {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m8328(bArr, i2, c4378);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return m8336(bArr, i2, c4378) + c4378.f11541;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = m8336(bArr, i2, c4378);
            i6 = c4378.f11541;
            if (i6 == i5) {
                break;
            }
            i2 = m8330(i6, bArr, i2, i3, c4378);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static int m8331(Object obj, InterfaceC4177 interfaceC4177, byte[] bArr, int i, int i2, int i3, C4378 c4378) {
        C4269 c4269 = (C4269) interfaceC4177;
        int i4 = c4378.f11537 + 1;
        c4378.f11537 = i4;
        if (i4 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iM8153 = c4269.m8153(obj, bArr, i, i2, i3, c4378);
        c4378.f11537--;
        c4378.f11539 = obj;
        return iM8153;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static int m8332(Object obj, InterfaceC4177 interfaceC4177, byte[] bArr, int i, int i2, C4378 c4378) {
        int iM8335 = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM8335 = m8335(i3, bArr, iM8335, c4378);
            i3 = c4378.f11541;
        }
        int i4 = iM8335;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i5 = c4378.f11537 + 1;
        c4378.f11537 = i5;
        if (i5 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i6 = i4 + i3;
        interfaceC4177.mo7950(obj, bArr, i4, i6, c4378);
        c4378.f11537--;
        c4378.f11539 = obj;
        return i6;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static int m8333(byte[] bArr, int i, InterfaceC4235 interfaceC4235, C4378 c4378) {
        C4445 c4445 = (C4445) interfaceC4235;
        int iM8336 = m8336(bArr, i, c4378);
        int i2 = c4378.f11541 + iM8336;
        while (iM8336 < i2) {
            iM8336 = m8336(bArr, iM8336, c4378);
            c4445.m8371(c4378.f11541);
        }
        if (iM8336 == i2) {
            return iM8336;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static int m8334(byte[] bArr, int i, InterfaceC4235 interfaceC4235, C4378 c4378) {
        C4262 c4262 = (C4262) interfaceC4235;
        int iM8336 = m8336(bArr, i, c4378);
        int i2 = c4378.f11541 + iM8336;
        while (iM8336 < i2) {
            iM8336 = m8328(bArr, iM8336, c4378);
            c4262.m8125(AbstractC4306.m8250(c4378.f11540));
        }
        if (iM8336 == i2) {
            return iM8336;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static int m8335(int i, byte[] bArr, int i2, C4378 c4378) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c4378.f11541 = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c4378.f11541 = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c4378.f11541 = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c4378.f11541 = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c4378.f11541 = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static int m8336(byte[] bArr, int i, C4378 c4378) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m8335(b, bArr, i2, c4378);
        }
        c4378.f11541 = b;
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static int m8337(byte[] bArr, int i, C4378 c4378) {
        int iM8336 = m8336(bArr, i, c4378);
        int i2 = c4378.f11541;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            c4378.f11539 = "";
            return iM8336;
        }
        c4378.f11539 = new String(bArr, iM8336, i2, AbstractC4234.f11404);
        return iM8336 + i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static int m8338(int i, byte[] bArr, int i2, int i3, C4539 c4539, C4378 c4378) {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM8328 = m8328(bArr, i2, c4378);
            c4539.m8511(i, Long.valueOf(c4378.f11540));
            return iM8328;
        }
        if (i4 == 1) {
            c4539.m8511(i, Long.valueOf(m8325(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM8336 = m8336(bArr, i2, c4378);
            int i5 = c4378.f11541;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 > bArr.length - iM8336) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 == 0) {
                c4539.m8511(i, ByteString.EMPTY);
            } else {
                c4539.m8511(i, ByteString.copyFrom(bArr, iM8336, i5));
            }
            return iM8336 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            c4539.m8511(i, Integer.valueOf(m8326(bArr, i2)));
            return i2 + 4;
        }
        C4539 c45392 = new C4539();
        int i6 = (i & (-8)) | 4;
        int i7 = c4378.f11537 + 1;
        c4378.f11537 = i7;
        if (i7 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iM83362 = m8336(bArr, i2, c4378);
            i8 = c4378.f11541;
            if (i8 == i6) {
                i2 = iM83362;
                break;
            }
            i2 = m8338(i8, bArr, iM83362, i3, c45392, c4378);
        }
        c4378.f11537--;
        if (i2 > i3 || i8 != i6) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        c4539.m8511(i, c45392);
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m8339(byte[] bArr, int i, InterfaceC4235 interfaceC4235, C4378 c4378) {
        C4423 c4423 = (C4423) interfaceC4235;
        int iM8336 = m8336(bArr, i, c4378);
        int i2 = c4378.f11541;
        int i3 = iM8336 + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = (i2 / 8) + c4423.f11558;
        double[] dArr = c4423.f11557;
        if (i4 > dArr.length) {
            if (dArr.length == 0) {
                c4423.f11557 = new double[Math.max(i4, 10)];
            } else {
                int length = dArr.length;
                while (length < i4) {
                    length = AbstractC3275.m5130(length, 3, 2, 1, 10);
                }
                c4423.f11557 = Arrays.copyOf(c4423.f11557, length);
            }
        }
        while (iM8336 < i3) {
            c4423.m8354(Double.longBitsToDouble(m8325(bArr, iM8336)));
            iM8336 += 8;
        }
        if (iM8336 == i3) {
            return iM8336;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m8340(byte[] bArr, int i, InterfaceC4235 interfaceC4235, C4378 c4378) {
        C4367 c4367 = (C4367) interfaceC4235;
        int iM8336 = m8336(bArr, i, c4378);
        int i2 = c4378.f11541 + iM8336;
        while (iM8336 < i2) {
            iM8336 = m8328(bArr, iM8336, c4378);
            c4367.m8320(c4378.f11540 != 0);
        }
        if (iM8336 == i2) {
            return iM8336;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static int m8341(byte[] bArr, int i, InterfaceC4235 interfaceC4235, C4378 c4378) {
        C4471 c4471 = (C4471) interfaceC4235;
        int iM8336 = m8336(bArr, i, c4378);
        int i2 = c4378.f11541;
        int i3 = iM8336 + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = (i2 / 4) + c4471.f11657;
        float[] fArr = c4471.f11656;
        if (i4 > fArr.length) {
            if (fArr.length == 0) {
                c4471.f11656 = new float[Math.max(i4, 10)];
            } else {
                int length = fArr.length;
                while (length < i4) {
                    length = AbstractC3275.m5130(length, 3, 2, 1, 10);
                }
                c4471.f11656 = Arrays.copyOf(c4471.f11656, length);
            }
        }
        while (iM8336 < i3) {
            c4471.m8401(Float.intBitsToFloat(m8326(bArr, iM8336)));
            iM8336 += 4;
        }
        if (iM8336 == i3) {
            return iM8336;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m8342(byte[] bArr, int i, InterfaceC4235 interfaceC4235, C4378 c4378) {
        C4445 c4445 = (C4445) interfaceC4235;
        int iM8336 = m8336(bArr, i, c4378);
        int i2 = c4378.f11541 + iM8336;
        while (iM8336 < i2) {
            iM8336 = m8336(bArr, iM8336, c4378);
            c4445.m8371(AbstractC4306.m8251(c4378.f11541));
        }
        if (iM8336 == i2) {
            return iM8336;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m8343(byte[] bArr, int i, InterfaceC4235 interfaceC4235, C4378 c4378) {
        C4445 c4445 = (C4445) interfaceC4235;
        int iM8336 = m8336(bArr, i, c4378);
        int i2 = c4378.f11541;
        int i3 = iM8336 + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = (i2 / 4) + c4445.f11597;
        int[] iArr = c4445.f11596;
        if (i4 > iArr.length) {
            if (iArr.length == 0) {
                c4445.f11596 = new int[Math.max(i4, 10)];
            } else {
                int length = iArr.length;
                while (length < i4) {
                    length = AbstractC3275.m5130(length, 3, 2, 1, 10);
                }
                c4445.f11596 = Arrays.copyOf(c4445.f11596, length);
            }
        }
        while (iM8336 < i3) {
            c4445.m8371(m8326(bArr, iM8336));
            iM8336 += 4;
        }
        if (iM8336 == i3) {
            return iM8336;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static int m8344(byte[] bArr, int i, InterfaceC4235 interfaceC4235, C4378 c4378) {
        C4262 c4262 = (C4262) interfaceC4235;
        int iM8336 = m8336(bArr, i, c4378);
        int i2 = c4378.f11541;
        int i3 = iM8336 + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = (i2 / 8) + c4262.f11440;
        long[] jArr = c4262.f11439;
        if (i4 > jArr.length) {
            if (jArr.length == 0) {
                c4262.f11439 = new long[Math.max(i4, 10)];
            } else {
                int length = jArr.length;
                while (length < i4) {
                    length = AbstractC3275.m5130(length, 3, 2, 1, 10);
                }
                c4262.f11439 = Arrays.copyOf(c4262.f11439, length);
            }
        }
        while (iM8336 < i3) {
            c4262.m8125(m8325(bArr, iM8336));
            iM8336 += 8;
        }
        if (iM8336 == i3) {
            return iM8336;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
