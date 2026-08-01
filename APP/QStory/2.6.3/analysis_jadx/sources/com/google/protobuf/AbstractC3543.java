package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3543 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m7763(InterfaceC3345 interfaceC3345, int i, byte[] bArr, int i2, int i3, InterfaceC3403 interfaceC3403, C3546 c3546) {
        int iM7764 = m7764(interfaceC3345, bArr, i2, i3, c3546);
        interfaceC3403.add(c3546.f11194);
        while (iM7764 < i3) {
            int iM7777 = m7777(bArr, iM7764, c3546);
            if (i != c3546.f11196) {
                break;
            }
            iM7764 = m7764(interfaceC3345, bArr, iM7777, i3, c3546);
            interfaceC3403.add(c3546.f11194);
        }
        return iM7764;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m7764(InterfaceC3345 interfaceC3345, byte[] bArr, int i, int i2, C3546 c3546) {
        Object objNewInstance = interfaceC3345.newInstance();
        int iM7773 = m7773(objNewInstance, interfaceC3345, bArr, i, i2, c3546);
        interfaceC3345.mo7394(objNewInstance);
        c3546.f11194 = objNewInstance;
        return iM7773;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m7765(InterfaceC3345 interfaceC3345, byte[] bArr, int i, int i2, int i3, C3546 c3546) {
        Object objNewInstance = interfaceC3345.newInstance();
        int iM7772 = m7772(objNewInstance, interfaceC3345, bArr, i, i2, i3, c3546);
        interfaceC3345.mo7394(objNewInstance);
        c3546.f11194 = objNewInstance;
        return iM7772;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static long m7766(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m7767(byte[] bArr, int i) {
        return ((bArr[i + 3] & DefaultClassResolver.NAME) << 24) | (bArr[i] & DefaultClassResolver.NAME) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 16);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m7768(byte[] bArr, int i, C3546 c3546) {
        int iM7777 = m7777(bArr, i, c3546);
        int i2 = c3546.f11196;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - iM7777) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            c3546.f11194 = ByteString.EMPTY;
            return iM7777;
        }
        c3546.f11194 = ByteString.copyFrom(bArr, iM7777, i2);
        return iM7777 + i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static int m7769(byte[] bArr, int i, C3546 c3546) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c3546.f11195 = j;
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
        c3546.f11195 = j2;
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static int m7770(int i, byte[] bArr, int i2, int i3, InterfaceC3403 interfaceC3403, C3546 c3546) {
        C3613 c3613 = (C3613) interfaceC3403;
        int iM7777 = m7777(bArr, i2, c3546);
        c3613.m7812(c3546.f11196);
        while (iM7777 < i3) {
            int iM77772 = m7777(bArr, iM7777, c3546);
            if (i != c3546.f11196) {
                break;
            }
            iM7777 = m7777(bArr, iM77772, c3546);
            c3613.m7812(c3546.f11196);
        }
        return iM7777;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static int m7771(int i, byte[] bArr, int i2, int i3, C3546 c3546) {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m7769(bArr, i2, c3546);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return m7777(bArr, i2, c3546) + c3546.f11196;
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
            i2 = m7777(bArr, i2, c3546);
            i6 = c3546.f11196;
            if (i6 == i5) {
                break;
            }
            i2 = m7771(i6, bArr, i2, i3, c3546);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static int m7772(Object obj, InterfaceC3345 interfaceC3345, byte[] bArr, int i, int i2, int i3, C3546 c3546) {
        C3437 c3437 = (C3437) interfaceC3345;
        int i4 = c3546.f11192 + 1;
        c3546.f11192 = i4;
        if (i4 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iM7594 = c3437.m7594(obj, bArr, i, i2, i3, c3546);
        c3546.f11192--;
        c3546.f11194 = obj;
        return iM7594;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static int m7773(Object obj, InterfaceC3345 interfaceC3345, byte[] bArr, int i, int i2, C3546 c3546) {
        int iM7776 = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM7776 = m7776(i3, bArr, iM7776, c3546);
            i3 = c3546.f11196;
        }
        int i4 = iM7776;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i5 = c3546.f11192 + 1;
        c3546.f11192 = i5;
        if (i5 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i6 = i4 + i3;
        interfaceC3345.mo7391(obj, bArr, i4, i6, c3546);
        c3546.f11192--;
        c3546.f11194 = obj;
        return i6;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static int m7774(byte[] bArr, int i, InterfaceC3403 interfaceC3403, C3546 c3546) {
        C3613 c3613 = (C3613) interfaceC3403;
        int iM7777 = m7777(bArr, i, c3546);
        int i2 = c3546.f11196 + iM7777;
        while (iM7777 < i2) {
            iM7777 = m7777(bArr, iM7777, c3546);
            c3613.m7812(c3546.f11196);
        }
        if (iM7777 == i2) {
            return iM7777;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static int m7775(byte[] bArr, int i, InterfaceC3403 interfaceC3403, C3546 c3546) {
        C3430 c3430 = (C3430) interfaceC3403;
        int iM7777 = m7777(bArr, i, c3546);
        int i2 = c3546.f11196 + iM7777;
        while (iM7777 < i2) {
            iM7777 = m7769(bArr, iM7777, c3546);
            c3430.m7566(AbstractC3474.m7691(c3546.f11195));
        }
        if (iM7777 == i2) {
            return iM7777;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static int m7776(int i, byte[] bArr, int i2, C3546 c3546) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c3546.f11196 = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c3546.f11196 = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c3546.f11196 = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c3546.f11196 = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c3546.f11196 = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static int m7777(byte[] bArr, int i, C3546 c3546) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m7776(b, bArr, i2, c3546);
        }
        c3546.f11196 = b;
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static int m7778(byte[] bArr, int i, C3546 c3546) {
        int iM7777 = m7777(bArr, i, c3546);
        int i2 = c3546.f11196;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            c3546.f11194 = "";
            return iM7777;
        }
        c3546.f11194 = new String(bArr, iM7777, i2, AbstractC3402.f11059);
        return iM7777 + i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static int m7779(int i, byte[] bArr, int i2, int i3, C3707 c3707, C3546 c3546) {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM7769 = m7769(bArr, i2, c3546);
            c3707.m7952(i, Long.valueOf(c3546.f11195));
            return iM7769;
        }
        if (i4 == 1) {
            c3707.m7952(i, Long.valueOf(m7766(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM7777 = m7777(bArr, i2, c3546);
            int i5 = c3546.f11196;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 > bArr.length - iM7777) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 == 0) {
                c3707.m7952(i, ByteString.EMPTY);
            } else {
                c3707.m7952(i, ByteString.copyFrom(bArr, iM7777, i5));
            }
            return iM7777 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            c3707.m7952(i, Integer.valueOf(m7767(bArr, i2)));
            return i2 + 4;
        }
        C3707 c37072 = new C3707();
        int i6 = (i & (-8)) | 4;
        int i7 = c3546.f11192 + 1;
        c3546.f11192 = i7;
        if (i7 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iM77772 = m7777(bArr, i2, c3546);
            i8 = c3546.f11196;
            if (i8 == i6) {
                i2 = iM77772;
                break;
            }
            i2 = m7779(i8, bArr, iM77772, i3, c37072, c3546);
        }
        c3546.f11192--;
        if (i2 > i3 || i8 != i6) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        c3707.m7952(i, c37072);
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m7780(byte[] bArr, int i, InterfaceC3403 interfaceC3403, C3546 c3546) {
        C3591 c3591 = (C3591) interfaceC3403;
        int iM7777 = m7777(bArr, i, c3546);
        int i2 = c3546.f11196;
        int i3 = iM7777 + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = (i2 / 8) + c3591.f11213;
        double[] dArr = c3591.f11212;
        if (i4 > dArr.length) {
            if (dArr.length == 0) {
                c3591.f11212 = new double[Math.max(i4, 10)];
            } else {
                int length = dArr.length;
                while (length < i4) {
                    length = AbstractC2442.m4570(length, 3, 2, 1, 10);
                }
                c3591.f11212 = Arrays.copyOf(c3591.f11212, length);
            }
        }
        while (iM7777 < i3) {
            c3591.m7795(Double.longBitsToDouble(m7766(bArr, iM7777)));
            iM7777 += 8;
        }
        if (iM7777 == i3) {
            return iM7777;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m7781(byte[] bArr, int i, InterfaceC3403 interfaceC3403, C3546 c3546) {
        C3535 c3535 = (C3535) interfaceC3403;
        int iM7777 = m7777(bArr, i, c3546);
        int i2 = c3546.f11196 + iM7777;
        while (iM7777 < i2) {
            iM7777 = m7769(bArr, iM7777, c3546);
            c3535.m7761(c3546.f11195 != 0);
        }
        if (iM7777 == i2) {
            return iM7777;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static int m7782(byte[] bArr, int i, InterfaceC3403 interfaceC3403, C3546 c3546) {
        C3639 c3639 = (C3639) interfaceC3403;
        int iM7777 = m7777(bArr, i, c3546);
        int i2 = c3546.f11196;
        int i3 = iM7777 + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = (i2 / 4) + c3639.f11312;
        float[] fArr = c3639.f11311;
        if (i4 > fArr.length) {
            if (fArr.length == 0) {
                c3639.f11311 = new float[Math.max(i4, 10)];
            } else {
                int length = fArr.length;
                while (length < i4) {
                    length = AbstractC2442.m4570(length, 3, 2, 1, 10);
                }
                c3639.f11311 = Arrays.copyOf(c3639.f11311, length);
            }
        }
        while (iM7777 < i3) {
            c3639.m7842(Float.intBitsToFloat(m7767(bArr, iM7777)));
            iM7777 += 4;
        }
        if (iM7777 == i3) {
            return iM7777;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m7783(byte[] bArr, int i, InterfaceC3403 interfaceC3403, C3546 c3546) {
        C3613 c3613 = (C3613) interfaceC3403;
        int iM7777 = m7777(bArr, i, c3546);
        int i2 = c3546.f11196 + iM7777;
        while (iM7777 < i2) {
            iM7777 = m7777(bArr, iM7777, c3546);
            c3613.m7812(AbstractC3474.m7692(c3546.f11196));
        }
        if (iM7777 == i2) {
            return iM7777;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m7784(byte[] bArr, int i, InterfaceC3403 interfaceC3403, C3546 c3546) {
        C3613 c3613 = (C3613) interfaceC3403;
        int iM7777 = m7777(bArr, i, c3546);
        int i2 = c3546.f11196;
        int i3 = iM7777 + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = (i2 / 4) + c3613.f11252;
        int[] iArr = c3613.f11251;
        if (i4 > iArr.length) {
            if (iArr.length == 0) {
                c3613.f11251 = new int[Math.max(i4, 10)];
            } else {
                int length = iArr.length;
                while (length < i4) {
                    length = AbstractC2442.m4570(length, 3, 2, 1, 10);
                }
                c3613.f11251 = Arrays.copyOf(c3613.f11251, length);
            }
        }
        while (iM7777 < i3) {
            c3613.m7812(m7767(bArr, iM7777));
            iM7777 += 4;
        }
        if (iM7777 == i3) {
            return iM7777;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static int m7785(byte[] bArr, int i, InterfaceC3403 interfaceC3403, C3546 c3546) {
        C3430 c3430 = (C3430) interfaceC3403;
        int iM7777 = m7777(bArr, i, c3546);
        int i2 = c3546.f11196;
        int i3 = iM7777 + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = (i2 / 8) + c3430.f11095;
        long[] jArr = c3430.f11094;
        if (i4 > jArr.length) {
            if (jArr.length == 0) {
                c3430.f11094 = new long[Math.max(i4, 10)];
            } else {
                int length = jArr.length;
                while (length < i4) {
                    length = AbstractC2442.m4570(length, 3, 2, 1, 10);
                }
                c3430.f11094 = Arrays.copyOf(c3430.f11094, length);
            }
        }
        while (iM7777 < i3) {
            c3430.m7566(m7766(bArr, iM7777));
            iM7777 += 8;
        }
        if (iM7777 == i3) {
            return iM7777;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
