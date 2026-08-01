package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3542 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m7776(InterfaceC3344 interfaceC3344, int i, byte[] bArr, int i2, int i3, InterfaceC3402 interfaceC3402, C3545 c3545) {
        int iM7777 = m7777(interfaceC3344, bArr, i2, i3, c3545);
        interfaceC3402.add(c3545.f11189);
        while (iM7777 < i3) {
            int iM7790 = m7790(bArr, iM7777, c3545);
            if (i != c3545.f11191) {
                break;
            }
            iM7777 = m7777(interfaceC3344, bArr, iM7790, i3, c3545);
            interfaceC3402.add(c3545.f11189);
        }
        return iM7777;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m7777(InterfaceC3344 interfaceC3344, byte[] bArr, int i, int i2, C3545 c3545) {
        Object objNewInstance = interfaceC3344.newInstance();
        int iM7786 = m7786(objNewInstance, interfaceC3344, bArr, i, i2, c3545);
        interfaceC3344.mo7407(objNewInstance);
        c3545.f11189 = objNewInstance;
        return iM7786;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m7778(InterfaceC3344 interfaceC3344, byte[] bArr, int i, int i2, int i3, C3545 c3545) {
        Object objNewInstance = interfaceC3344.newInstance();
        int iM7785 = m7785(objNewInstance, interfaceC3344, bArr, i, i2, i3, c3545);
        interfaceC3344.mo7407(objNewInstance);
        c3545.f11189 = objNewInstance;
        return iM7785;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static long m7779(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m7780(byte[] bArr, int i) {
        return ((bArr[i + 3] & DefaultClassResolver.NAME) << 24) | (bArr[i] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 16);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m7781(byte[] bArr, int i, C3545 c3545) {
        int iM7790 = m7790(bArr, i, c3545);
        int i2 = c3545.f11191;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - iM7790) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            c3545.f11189 = ByteString.EMPTY;
            return iM7790;
        }
        c3545.f11189 = ByteString.copyFrom(bArr, iM7790, i2);
        return iM7790 + i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static int m7782(byte[] bArr, int i, C3545 c3545) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c3545.f11190 = j;
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
        c3545.f11190 = j2;
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static int m7783(int i, byte[] bArr, int i2, int i3, InterfaceC3402 interfaceC3402, C3545 c3545) {
        C3612 c3612 = (C3612) interfaceC3402;
        int iM7790 = m7790(bArr, i2, c3545);
        c3612.m7825(c3545.f11191);
        while (iM7790 < i3) {
            int iM77902 = m7790(bArr, iM7790, c3545);
            if (i != c3545.f11191) {
                break;
            }
            iM7790 = m7790(bArr, iM77902, c3545);
            c3612.m7825(c3545.f11191);
        }
        return iM7790;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static int m7784(int i, byte[] bArr, int i2, int i3, C3545 c3545) {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m7782(bArr, i2, c3545);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return m7790(bArr, i2, c3545) + c3545.f11191;
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
            i2 = m7790(bArr, i2, c3545);
            i6 = c3545.f11191;
            if (i6 == i5) {
                break;
            }
            i2 = m7784(i6, bArr, i2, i3, c3545);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static int m7785(Object obj, InterfaceC3344 interfaceC3344, byte[] bArr, int i, int i2, int i3, C3545 c3545) {
        C3436 c3436 = (C3436) interfaceC3344;
        int i4 = c3545.f11187 + 1;
        c3545.f11187 = i4;
        if (i4 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iM7607 = c3436.m7607(obj, bArr, i, i2, i3, c3545);
        c3545.f11187--;
        c3545.f11189 = obj;
        return iM7607;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static int m7786(Object obj, InterfaceC3344 interfaceC3344, byte[] bArr, int i, int i2, C3545 c3545) {
        int iM7789 = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM7789 = m7789(i3, bArr, iM7789, c3545);
            i3 = c3545.f11191;
        }
        int i4 = iM7789;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i5 = c3545.f11187 + 1;
        c3545.f11187 = i5;
        if (i5 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i6 = i4 + i3;
        interfaceC3344.mo7404(obj, bArr, i4, i6, c3545);
        c3545.f11187--;
        c3545.f11189 = obj;
        return i6;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static int m7787(byte[] bArr, int i, InterfaceC3402 interfaceC3402, C3545 c3545) {
        C3612 c3612 = (C3612) interfaceC3402;
        int iM7790 = m7790(bArr, i, c3545);
        int i2 = c3545.f11191 + iM7790;
        while (iM7790 < i2) {
            iM7790 = m7790(bArr, iM7790, c3545);
            c3612.m7825(c3545.f11191);
        }
        if (iM7790 == i2) {
            return iM7790;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static int m7788(byte[] bArr, int i, InterfaceC3402 interfaceC3402, C3545 c3545) {
        C3429 c3429 = (C3429) interfaceC3402;
        int iM7790 = m7790(bArr, i, c3545);
        int i2 = c3545.f11191 + iM7790;
        while (iM7790 < i2) {
            iM7790 = m7782(bArr, iM7790, c3545);
            c3429.m7579(AbstractC3473.m7704(c3545.f11190));
        }
        if (iM7790 == i2) {
            return iM7790;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static int m7789(int i, byte[] bArr, int i2, C3545 c3545) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c3545.f11191 = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c3545.f11191 = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c3545.f11191 = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c3545.f11191 = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c3545.f11191 = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static int m7790(byte[] bArr, int i, C3545 c3545) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m7789(b, bArr, i2, c3545);
        }
        c3545.f11191 = b;
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static int m7791(byte[] bArr, int i, C3545 c3545) {
        int iM7790 = m7790(bArr, i, c3545);
        int i2 = c3545.f11191;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            c3545.f11189 = "";
            return iM7790;
        }
        c3545.f11189 = new String(bArr, iM7790, i2, AbstractC3401.f11054);
        return iM7790 + i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static int m7792(int i, byte[] bArr, int i2, int i3, C3706 c3706, C3545 c3545) {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM7782 = m7782(bArr, i2, c3545);
            c3706.m7965(i, Long.valueOf(c3545.f11190));
            return iM7782;
        }
        if (i4 == 1) {
            c3706.m7965(i, Long.valueOf(m7779(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM7790 = m7790(bArr, i2, c3545);
            int i5 = c3545.f11191;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 > bArr.length - iM7790) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 == 0) {
                c3706.m7965(i, ByteString.EMPTY);
            } else {
                c3706.m7965(i, ByteString.copyFrom(bArr, iM7790, i5));
            }
            return iM7790 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            c3706.m7965(i, Integer.valueOf(m7780(bArr, i2)));
            return i2 + 4;
        }
        C3706 c37062 = new C3706();
        int i6 = (i & (-8)) | 4;
        int i7 = c3545.f11187 + 1;
        c3545.f11187 = i7;
        if (i7 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iM77902 = m7790(bArr, i2, c3545);
            i8 = c3545.f11191;
            if (i8 == i6) {
                i2 = iM77902;
                break;
            }
            i2 = m7792(i8, bArr, iM77902, i3, c37062, c3545);
        }
        c3545.f11187--;
        if (i2 > i3 || i8 != i6) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        c3706.m7965(i, c37062);
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m7793(byte[] bArr, int i, InterfaceC3402 interfaceC3402, C3545 c3545) {
        C3590 c3590 = (C3590) interfaceC3402;
        int iM7790 = m7790(bArr, i, c3545);
        int i2 = c3545.f11191;
        int i3 = iM7790 + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = (i2 / 8) + c3590.f11208;
        double[] dArr = c3590.f11207;
        if (i4 > dArr.length) {
            if (dArr.length == 0) {
                c3590.f11207 = new double[Math.max(i4, 10)];
            } else {
                int length = dArr.length;
                while (length < i4) {
                    length = AbstractC2442.m4560(length, 3, 2, 1, 10);
                }
                c3590.f11207 = Arrays.copyOf(c3590.f11207, length);
            }
        }
        while (iM7790 < i3) {
            c3590.m7808(Double.longBitsToDouble(m7779(bArr, iM7790)));
            iM7790 += 8;
        }
        if (iM7790 == i3) {
            return iM7790;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m7794(byte[] bArr, int i, InterfaceC3402 interfaceC3402, C3545 c3545) {
        C3534 c3534 = (C3534) interfaceC3402;
        int iM7790 = m7790(bArr, i, c3545);
        int i2 = c3545.f11191 + iM7790;
        while (iM7790 < i2) {
            iM7790 = m7782(bArr, iM7790, c3545);
            c3534.m7774(c3545.f11190 != 0);
        }
        if (iM7790 == i2) {
            return iM7790;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static int m7795(byte[] bArr, int i, InterfaceC3402 interfaceC3402, C3545 c3545) {
        C3638 c3638 = (C3638) interfaceC3402;
        int iM7790 = m7790(bArr, i, c3545);
        int i2 = c3545.f11191;
        int i3 = iM7790 + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = (i2 / 4) + c3638.f11307;
        float[] fArr = c3638.f11306;
        if (i4 > fArr.length) {
            if (fArr.length == 0) {
                c3638.f11306 = new float[Math.max(i4, 10)];
            } else {
                int length = fArr.length;
                while (length < i4) {
                    length = AbstractC2442.m4560(length, 3, 2, 1, 10);
                }
                c3638.f11306 = Arrays.copyOf(c3638.f11306, length);
            }
        }
        while (iM7790 < i3) {
            c3638.m7855(Float.intBitsToFloat(m7780(bArr, iM7790)));
            iM7790 += 4;
        }
        if (iM7790 == i3) {
            return iM7790;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m7796(byte[] bArr, int i, InterfaceC3402 interfaceC3402, C3545 c3545) {
        C3612 c3612 = (C3612) interfaceC3402;
        int iM7790 = m7790(bArr, i, c3545);
        int i2 = c3545.f11191 + iM7790;
        while (iM7790 < i2) {
            iM7790 = m7790(bArr, iM7790, c3545);
            c3612.m7825(AbstractC3473.m7705(c3545.f11191));
        }
        if (iM7790 == i2) {
            return iM7790;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m7797(byte[] bArr, int i, InterfaceC3402 interfaceC3402, C3545 c3545) {
        C3612 c3612 = (C3612) interfaceC3402;
        int iM7790 = m7790(bArr, i, c3545);
        int i2 = c3545.f11191;
        int i3 = iM7790 + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = (i2 / 4) + c3612.f11247;
        int[] iArr = c3612.f11246;
        if (i4 > iArr.length) {
            if (iArr.length == 0) {
                c3612.f11246 = new int[Math.max(i4, 10)];
            } else {
                int length = iArr.length;
                while (length < i4) {
                    length = AbstractC2442.m4560(length, 3, 2, 1, 10);
                }
                c3612.f11246 = Arrays.copyOf(c3612.f11246, length);
            }
        }
        while (iM7790 < i3) {
            c3612.m7825(m7780(bArr, iM7790));
            iM7790 += 4;
        }
        if (iM7790 == i3) {
            return iM7790;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static int m7798(byte[] bArr, int i, InterfaceC3402 interfaceC3402, C3545 c3545) {
        C3429 c3429 = (C3429) interfaceC3402;
        int iM7790 = m7790(bArr, i, c3545);
        int i2 = c3545.f11191;
        int i3 = iM7790 + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = (i2 / 8) + c3429.f11090;
        long[] jArr = c3429.f11089;
        if (i4 > jArr.length) {
            if (jArr.length == 0) {
                c3429.f11089 = new long[Math.max(i4, 10)];
            } else {
                int length = jArr.length;
                while (length < i4) {
                    length = AbstractC2442.m4560(length, 3, 2, 1, 10);
                }
                c3429.f11089 = Arrays.copyOf(c3429.f11089, length);
            }
        }
        while (iM7790 < i3) {
            c3429.m7579(m7779(bArr, iM7790));
            iM7790 += 8;
        }
        if (iM7790 == i3) {
            return iM7790;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
