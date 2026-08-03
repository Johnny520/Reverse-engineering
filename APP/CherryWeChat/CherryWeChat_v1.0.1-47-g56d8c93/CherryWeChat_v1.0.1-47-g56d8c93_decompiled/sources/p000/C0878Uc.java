package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: Uc */
/* JADX INFO: loaded from: classes.dex */
public final class C0878Uc implements InterfaceC1331dl {

    /* JADX INFO: renamed from: a */
    public static final byte[] f2765a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b */
    public static final byte[] f2766b = "MPF".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: c */
    public static final int[] f2767c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: g */
    public static int m1719g(InterfaceC0835Tc interfaceC0835Tc, C2812zp c2812zp) {
        try {
            int iMo236h = interfaceC0835Tc.mo236h();
            if ((iMo236h & 65496) != 65496 && iMo236h != 19789 && iMo236h != 18761) {
                return -1;
            }
            int iM1723k = m1723k(interfaceC0835Tc, 225);
            if (iM1723k != -1) {
                byte[] bArr = (byte[]) c2812zp.m5441c(iM1723k, byte[].class);
                try {
                    return m1724l(interfaceC0835Tc, bArr, iM1723k);
                } finally {
                    c2812zp.m5445g(bArr);
                }
            }
        } catch (C0792Sc unused) {
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static ImageHeaderParser$ImageType m1720h(InterfaceC0835Tc interfaceC0835Tc) {
        try {
            int iMo236h = interfaceC0835Tc.mo236h();
            if (iMo236h == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iMo234f = (iMo236h << 8) | interfaceC0835Tc.mo234f();
            if (iMo234f == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iMo234f2 = (iMo234f << 8) | interfaceC0835Tc.mo234f();
            if (iMo234f2 == -1991225785) {
                interfaceC0835Tc.skip(21L);
                try {
                    return interfaceC0835Tc.mo234f() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (C0792Sc unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iMo234f2 == 1380533830) {
                interfaceC0835Tc.skip(4L);
                if (((interfaceC0835Tc.mo236h() << 16) | interfaceC0835Tc.mo236h()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iMo236h2 = (interfaceC0835Tc.mo236h() << 16) | interfaceC0835Tc.mo236h();
                if ((iMo236h2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iMo236h2 & 255;
                if (i == 88) {
                    interfaceC0835Tc.skip(4L);
                    short sMo234f = interfaceC0835Tc.mo234f();
                    return (sMo234f & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sMo234f & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                interfaceC0835Tc.skip(4L);
                return (interfaceC0835Tc.mo234f() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((interfaceC0835Tc.mo236h() << 16) | interfaceC0835Tc.mo236h()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iMo236h3 = (interfaceC0835Tc.mo236h() << 16) | interfaceC0835Tc.mo236h();
            if (iMo236h3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iMo236h3 == 1635150182;
            interfaceC0835Tc.skip(4L);
            int i3 = iMo234f2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iMo236h4 = (interfaceC0835Tc.mo236h() << 16) | interfaceC0835Tc.mo236h();
                    if (iMo236h4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iMo236h4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (C0792Sc unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1721i(InterfaceC0835Tc interfaceC0835Tc, C2812zp c2812zp) {
        if (m1720h(interfaceC0835Tc) == ImageHeaderParser$ImageType.JPEG) {
            int iM1723k = m1723k(interfaceC0835Tc, 226);
            while (iM1723k > 0) {
                byte[] bArr = (byte[]) c2812zp.m5441c(iM1723k, byte[].class);
                try {
                    if (interfaceC0835Tc.mo239l(iM1723k, bArr) != iM1723k ? false : m1722j(bArr, iM1723k, f2766b)) {
                        c2812zp.m5445g(bArr);
                        return true;
                    }
                    c2812zp.m5445g(bArr);
                    iM1723k = m1723k(interfaceC0835Tc, 226);
                } catch (Throwable th) {
                    c2812zp.m5445g(bArr);
                    throw th;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1722j(byte[] bArr, int i, byte[] bArr2) {
        boolean z = (bArr == null || bArr2 == null || i <= bArr2.length) ? false : true;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: k */
    public static int m1723k(InterfaceC0835Tc interfaceC0835Tc, int i) {
        short sMo234f;
        while (interfaceC0835Tc.mo234f() == 255 && (sMo234f = interfaceC0835Tc.mo234f()) != 218 && sMo234f != 217) {
            int iMo236h = interfaceC0835Tc.mo236h() - 2;
            if (sMo234f == i) {
                return iMo236h;
            }
            long j = iMo236h;
            if (interfaceC0835Tc.skip(j) != j) {
                return -1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public static int m1724l(InterfaceC0835Tc interfaceC0835Tc, byte[] bArr, int i) {
        int i2;
        int i3;
        if (interfaceC0835Tc.mo239l(i, bArr) == i && m1722j(bArr, i, f2765a)) {
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            byteBuffer.order(s != 18761 ? s != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            int i4 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i5 = i4 + 6;
            short s2 = byteBuffer.remaining() - i5 >= 2 ? byteBuffer.getShort(i5) : (short) -1;
            for (int i6 = 0; i6 < s2; i6++) {
                int i7 = (i6 * 12) + i4 + 8;
                if ((byteBuffer.remaining() - i7 >= 2 ? byteBuffer.getShort(i7) : (short) -1) == 274) {
                    int i8 = i7 + 2;
                    short s3 = byteBuffer.remaining() - i8 >= 2 ? byteBuffer.getShort(i8) : (short) -1;
                    if (s3 >= 1 && s3 <= 12) {
                        int i9 = i7 + 4;
                        int i10 = byteBuffer.remaining() - i9 >= 4 ? byteBuffer.getInt(i9) : -1;
                        if (i10 >= 0 && (i2 = i10 + f2767c[s3]) <= 4 && (i3 = i7 + 8) >= 0 && i3 <= byteBuffer.remaining() && i2 >= 0 && i2 + i3 <= byteBuffer.remaining()) {
                            if (byteBuffer.remaining() - i3 >= 2) {
                                return byteBuffer.getShort(i3);
                            }
                            return -1;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: a */
    public final ImageHeaderParser$ImageType mo566a(ByteBuffer byteBuffer) {
        AbstractC0714Qj.m1488j("Argument must not be null", byteBuffer);
        return m1720h(new C2400q6(1, byteBuffer));
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: b */
    public final int mo567b(InputStream inputStream, C2812zp c2812zp) {
        C0132D2 c0132d2 = new C0132D2(15, inputStream);
        AbstractC0714Qj.m1488j("Argument must not be null", c2812zp);
        return m1719g(c0132d2, c2812zp);
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: c */
    public final boolean mo568c(ByteBuffer byteBuffer, C2812zp c2812zp) {
        C2400q6 c2400q6 = new C2400q6(1, byteBuffer);
        AbstractC0714Qj.m1488j("Argument must not be null", c2812zp);
        return m1721i(c2400q6, c2812zp);
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: d */
    public final int mo569d(ByteBuffer byteBuffer, C2812zp c2812zp) {
        C2400q6 c2400q6 = new C2400q6(1, byteBuffer);
        AbstractC0714Qj.m1488j("Argument must not be null", c2812zp);
        return m1719g(c2400q6, c2812zp);
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: e */
    public final boolean mo570e(InputStream inputStream, C2812zp c2812zp) {
        AbstractC0714Qj.m1488j("Argument must not be null", inputStream);
        C0132D2 c0132d2 = new C0132D2(15, inputStream);
        AbstractC0714Qj.m1488j("Argument must not be null", c2812zp);
        return m1721i(c0132d2, c2812zp);
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: f */
    public final ImageHeaderParser$ImageType mo571f(InputStream inputStream) {
        return m1720h(new C0132D2(15, inputStream));
    }
}
