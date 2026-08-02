package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r50 implements kx0 {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final byte[] b = "MPF".getBytes(Charset.forName("UTF-8"));
    public static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int g(q50 q50Var, td1 td1Var) {
        try {
            int iE = q50Var.e();
            if ((iE & 65496) == 65496 || iE == 19789 || iE == 18761) {
                int iL = l(q50Var, 225);
                if (iL != -1) {
                    byte[] bArr = (byte[]) td1Var.c(iL, byte[].class);
                    try {
                        return m(q50Var, bArr, iL);
                    } finally {
                        td1Var.g(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iE);
                return -1;
            }
        } catch (p50 unused) {
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ImageHeaderParser$ImageType h(q50 q50Var) {
        try {
            int iE = q50Var.e();
            if (iE == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iC = (iE << 8) | q50Var.c();
            if (iC == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iC2 = (iC << 8) | q50Var.c();
            if (iC2 == -1991225785) {
                q50Var.skip(21L);
                try {
                    return q50Var.c() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (p50 unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iC2 != 1380533830) {
                return n(q50Var, iC2);
            }
            q50Var.skip(4L);
            if (((q50Var.e() << 16) | q50Var.e()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iE2 = (q50Var.e() << 16) | q50Var.e();
            if ((iE2 & (-256)) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i = iE2 & 255;
            if (i == 88) {
                q50Var.skip(4L);
                short sC = q50Var.c();
                return (sC & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sC & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (i != 76) {
                return ImageHeaderParser$ImageType.WEBP;
            }
            q50Var.skip(4L);
            return (q50Var.c() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
        } catch (p50 unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean i(q50 q50Var, td1 td1Var) {
        boolean zJ;
        if (h(q50Var) == ImageHeaderParser$ImageType.JPEG) {
            int iL = l(q50Var, 226);
            while (iL > 0) {
                byte[] bArr = (byte[]) td1Var.c(iL, byte[].class);
                try {
                    int iG = q50Var.g(iL, bArr);
                    if (iG != iL) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + iL + ", actually read: " + iG);
                        }
                        zJ = false;
                    } else {
                        zJ = j(bArr, iL, b);
                    }
                    if (zJ) {
                        td1Var.g(bArr);
                        return true;
                    }
                    td1Var.g(bArr);
                    iL = l(q50Var, 226);
                } catch (Throwable th) {
                    td1Var.g(bArr);
                    throw th;
                }
            }
            if (Log.isLoggable("DfltImageHeaderParser", 2)) {
                Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean j(byte[] bArr, int i, byte[] bArr2) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean k(int i) {
        return i == 1751476579 || i == 1751476600 || i == 1751479907 || i == 1751479928 || i == 1835623985 || i == 1836279345;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int l(q50 q50Var, int i) {
        while (true) {
            short sC = q50Var.c();
            if (sC == 255) {
                short sC2 = q50Var.c();
                if (sC2 == 218) {
                    break;
                }
                if (sC2 != 217) {
                    int iE = q50Var.e() - 2;
                    if (sC2 == i) {
                        return iE;
                    }
                    long j = iE;
                    long jSkip = q50Var.skip(j);
                    if (jSkip != j) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sbK = hk1.k("Unable to skip enough data, type: ", sC2, iE, ", wanted to skip: ", ", but actually skipped: ");
                            sbK.append(jSkip);
                            Log.d("DfltImageHeaderParser", sbK.toString());
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in " + i + " segment");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sC));
                return -1;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int m(q50 q50Var, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iG = q50Var.g(i, bArr);
        if (iG != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iG);
                return -1;
            }
        } else if (j(bArr, i, a)) {
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
                                StringBuilder sbK = hk1.k("Got tagIndex=", i4, s3, " tagType=", " formatCode=");
                                sbK.append((int) s4);
                                sbK.append(" componentCount=");
                                sbK.append(i8);
                                Log.d("DfltImageHeaderParser", sbK.toString());
                            }
                            int i9 = i8 + c[s4];
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ImageHeaderParser$ImageType n(q50 q50Var, int i) {
        if (((q50Var.e() << 16) | q50Var.e()) != 1718909296) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int iE = (q50Var.e() << 16) | q50Var.e();
        if (iE == 1635150195) {
            return ImageHeaderParser$ImageType.ANIMATED_AVIF;
        }
        int i2 = 0;
        boolean z = iE == 1635150182;
        boolean zK = k(iE);
        q50Var.skip(4L);
        int i3 = i - 16;
        if (i3 % 4 == 0) {
            while (i2 < 5 && i3 > 0) {
                int iE2 = (q50Var.e() << 16) | q50Var.e();
                if (iE2 == 1635150195) {
                    return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                }
                if (iE2 == 1635150182) {
                    z = true;
                } else if (k(iE2)) {
                    zK = true;
                }
                i2++;
                i3 -= 4;
            }
        }
        return z ? ImageHeaderParser$ImageType.AVIF : zK ? ImageHeaderParser$ImageType.HEIF : ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kx0
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        fg1.q("Argument must not be null", byteBuffer);
        return h(new io(1, byteBuffer));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kx0
    public final int b(InputStream inputStream, td1 td1Var) {
        n4 n4Var = new n4(9, inputStream);
        fg1.q("Argument must not be null", td1Var);
        return g(n4Var, td1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kx0
    public final boolean c(ByteBuffer byteBuffer, td1 td1Var) {
        io ioVar = new io(1, byteBuffer);
        fg1.q("Argument must not be null", td1Var);
        return i(ioVar, td1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kx0
    public final int d(ByteBuffer byteBuffer, td1 td1Var) {
        io ioVar = new io(1, byteBuffer);
        fg1.q("Argument must not be null", td1Var);
        return g(ioVar, td1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kx0
    public final boolean e(InputStream inputStream, td1 td1Var) {
        fg1.q("Argument must not be null", inputStream);
        n4 n4Var = new n4(9, inputStream);
        fg1.q("Argument must not be null", td1Var);
        return i(n4Var, td1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kx0
    public final ImageHeaderParser$ImageType f(InputStream inputStream) {
        return h(new n4(9, inputStream));
    }
}
