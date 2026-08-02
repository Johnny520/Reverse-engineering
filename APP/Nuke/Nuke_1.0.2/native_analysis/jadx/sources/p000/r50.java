package p000;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r50 implements kx0 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f9350a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b */
    public static final byte[] f9351b = "MPF".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: c */
    public static final int[] f9352c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: g */
    public static int m4332g(q50 q50Var, td1 td1Var) {
        try {
            int iMo2376e = q50Var.mo2376e();
            if ((iMo2376e & 65496) == 65496 || iMo2376e == 19789 || iMo2376e == 18761) {
                int iM4337l = m4337l(q50Var, 225);
                if (iM4337l != -1) {
                    byte[] bArr = (byte[]) td1Var.m5167c(iM4337l, byte[].class);
                    try {
                        return m4338m(q50Var, bArr, iM4337l);
                    } finally {
                        td1Var.m5171g(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo2376e);
                return -1;
            }
        } catch (p50 unused) {
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static ImageHeaderParser$ImageType m4333h(q50 q50Var) {
        try {
            int iMo2376e = q50Var.mo2376e();
            if (iMo2376e == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iMo2375c = (iMo2376e << 8) | q50Var.mo2375c();
            if (iMo2375c == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iMo2375c2 = (iMo2375c << 8) | q50Var.mo2375c();
            if (iMo2375c2 == -1991225785) {
                q50Var.skip(21L);
                try {
                    return q50Var.mo2375c() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (p50 unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iMo2375c2 != 1380533830) {
                return m4339n(q50Var, iMo2375c2);
            }
            q50Var.skip(4L);
            if (((q50Var.mo2376e() << 16) | q50Var.mo2376e()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iMo2376e2 = (q50Var.mo2376e() << 16) | q50Var.mo2376e();
            if ((iMo2376e2 & (-256)) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i = iMo2376e2 & 255;
            if (i == 88) {
                q50Var.skip(4L);
                short sMo2375c = q50Var.mo2375c();
                return (sMo2375c & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sMo2375c & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (i != 76) {
                return ImageHeaderParser$ImageType.WEBP;
            }
            q50Var.skip(4L);
            return (q50Var.mo2375c() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
        } catch (p50 unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4334i(q50 q50Var, td1 td1Var) {
        boolean zM4335j;
        if (m4333h(q50Var) == ImageHeaderParser$ImageType.JPEG) {
            int iM4337l = m4337l(q50Var, 226);
            while (iM4337l > 0) {
                byte[] bArr = (byte[]) td1Var.m5167c(iM4337l, byte[].class);
                try {
                    int iMo2377g = q50Var.mo2377g(iM4337l, bArr);
                    if (iMo2377g != iM4337l) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + iM4337l + ", actually read: " + iMo2377g);
                        }
                        zM4335j = false;
                    } else {
                        zM4335j = m4335j(bArr, iM4337l, f9351b);
                    }
                    if (zM4335j) {
                        td1Var.m5171g(bArr);
                        return true;
                    }
                    td1Var.m5171g(bArr);
                    iM4337l = m4337l(q50Var, 226);
                } catch (Throwable th) {
                    td1Var.m5171g(bArr);
                    throw th;
                }
            }
            if (Log.isLoggable("DfltImageHeaderParser", 2)) {
                Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m4335j(byte[] bArr, int i, byte[] bArr2) {
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
    public static boolean m4336k(int i) {
        return i == 1751476579 || i == 1751476600 || i == 1751479907 || i == 1751479928 || i == 1835623985 || i == 1836279345;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        return -1;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m4337l(q50 q50Var, int i) {
        while (true) {
            short sMo2375c = q50Var.mo2375c();
            if (sMo2375c == 255) {
                short sMo2375c2 = q50Var.mo2375c();
                if (sMo2375c2 == 218) {
                    break;
                }
                if (sMo2375c2 != 217) {
                    int iMo2376e = q50Var.mo2376e() - 2;
                    if (sMo2375c2 == i) {
                        return iMo2376e;
                    }
                    long j = iMo2376e;
                    long jSkip = q50Var.skip(j);
                    if (jSkip != j) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sbM2212k = hk1.m2212k("Unable to skip enough data, type: ", sMo2375c2, iMo2376e, ", wanted to skip: ", ", but actually skipped: ");
                            sbM2212k.append(jSkip);
                            Log.d("DfltImageHeaderParser", sbM2212k.toString());
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in " + i + " segment");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sMo2375c));
                return -1;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m4338m(q50 q50Var, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iMo2377g = q50Var.mo2377g(i, bArr);
        if (iMo2377g != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iMo2377g);
                return -1;
            }
        } else if (m4335j(bArr, i, f9350a)) {
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s != 18761) {
                if (s != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i2 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i3 = i2 + 6;
            short s2 = byteBuffer.remaining() - i3 >= 2 ? byteBuffer.getShort(i3) : (short) -1;
            for (int i4 = 0; i4 < s2; i4++) {
                int i5 = (i4 * 12) + i2 + 8;
                short s3 = byteBuffer.remaining() - i5 >= 2 ? byteBuffer.getShort(i5) : (short) -1;
                if (s3 == 274) {
                    int i6 = i5 + 2;
                    short s4 = byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : (short) -1;
                    if (s4 >= 1 && s4 <= 12) {
                        int i7 = i5 + 4;
                        int i8 = byteBuffer.remaining() - i7 >= 4 ? byteBuffer.getInt(i7) : -1;
                        if (i8 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder sbM2212k = hk1.m2212k("Got tagIndex=", i4, s3, " tagType=", " formatCode=");
                                sbM2212k.append((int) s4);
                                sbM2212k.append(" componentCount=");
                                sbM2212k.append(i8);
                                Log.d("DfltImageHeaderParser", sbM2212k.toString());
                            }
                            int i9 = i8 + f9352c[s4];
                            if (i9 <= 4) {
                                int i10 = i5 + 8;
                                if (i10 >= 0 && i10 <= byteBuffer.remaining()) {
                                    if (i9 >= 0 && i9 + i10 <= byteBuffer.remaining()) {
                                        if (byteBuffer.remaining() - i10 >= 2) {
                                            return byteBuffer.getShort(i10);
                                        }
                                        return -1;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s3));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i10 + " tagType=" + ((int) s3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s4));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s4));
                    }
                }
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public static ImageHeaderParser$ImageType m4339n(q50 q50Var, int i) {
        if (((q50Var.mo2376e() << 16) | q50Var.mo2376e()) != 1718909296) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int iMo2376e = (q50Var.mo2376e() << 16) | q50Var.mo2376e();
        if (iMo2376e == 1635150195) {
            return ImageHeaderParser$ImageType.ANIMATED_AVIF;
        }
        int i2 = 0;
        boolean z = iMo2376e == 1635150182;
        boolean zM4336k = m4336k(iMo2376e);
        q50Var.skip(4L);
        int i3 = i - 16;
        if (i3 % 4 == 0) {
            while (i2 < 5 && i3 > 0) {
                int iMo2376e2 = (q50Var.mo2376e() << 16) | q50Var.mo2376e();
                if (iMo2376e2 == 1635150195) {
                    return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                }
                if (iMo2376e2 == 1635150182) {
                    z = true;
                } else if (m4336k(iMo2376e2)) {
                    zM4336k = true;
                }
                i2++;
                i3 -= 4;
            }
        }
        return z ? ImageHeaderParser$ImageType.AVIF : zM4336k ? ImageHeaderParser$ImageType.HEIF : ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p000.kx0
    /* JADX INFO: renamed from: a */
    public final ImageHeaderParser$ImageType mo2753a(ByteBuffer byteBuffer) {
        fg1.m1642q("Argument must not be null", byteBuffer);
        return m4333h(new C0320io(1, byteBuffer));
    }

    @Override // p000.kx0
    /* JADX INFO: renamed from: b */
    public final int mo2754b(InputStream inputStream, td1 td1Var) {
        C0485n4 c0485n4 = new C0485n4(9, inputStream);
        fg1.m1642q("Argument must not be null", td1Var);
        return m4332g(c0485n4, td1Var);
    }

    @Override // p000.kx0
    /* JADX INFO: renamed from: c */
    public final boolean mo2755c(ByteBuffer byteBuffer, td1 td1Var) {
        C0320io c0320io = new C0320io(1, byteBuffer);
        fg1.m1642q("Argument must not be null", td1Var);
        return m4334i(c0320io, td1Var);
    }

    @Override // p000.kx0
    /* JADX INFO: renamed from: d */
    public final int mo2756d(ByteBuffer byteBuffer, td1 td1Var) {
        C0320io c0320io = new C0320io(1, byteBuffer);
        fg1.m1642q("Argument must not be null", td1Var);
        return m4332g(c0320io, td1Var);
    }

    @Override // p000.kx0
    /* JADX INFO: renamed from: e */
    public final boolean mo2757e(InputStream inputStream, td1 td1Var) {
        fg1.m1642q("Argument must not be null", inputStream);
        C0485n4 c0485n4 = new C0485n4(9, inputStream);
        fg1.m1642q("Argument must not be null", td1Var);
        return m4334i(c0485n4, td1Var);
    }

    @Override // p000.kx0
    /* JADX INFO: renamed from: f */
    public final ImageHeaderParser$ImageType mo2758f(InputStream inputStream) {
        return m4333h(new C0485n4(9, inputStream));
    }
}
