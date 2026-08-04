package yyds;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: yyds.ᲁᛴᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2222 implements InterfaceC0849 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final byte[] f10981 = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final byte[] f10982 = "MPF".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final int[] f10983 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static ImageHeaderParser$ImageType m4211(InterfaceC1493 interfaceC1493, int i) {
        if (((interfaceC1493.mo401() << 16) | interfaceC1493.mo401()) != 1718909296) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int iMo401 = (interfaceC1493.mo401() << 16) | interfaceC1493.mo401();
        if (iMo401 == 1635150195) {
            return ImageHeaderParser$ImageType.ANIMATED_AVIF;
        }
        int i2 = 0;
        boolean z = iMo401 == 1635150182;
        boolean zM4216 = m4216(iMo401);
        interfaceC1493.skip(4L);
        int i3 = i - 16;
        if (i3 % 4 == 0) {
            while (i2 < 5 && i3 > 0) {
                int iMo4012 = (interfaceC1493.mo401() << 16) | interfaceC1493.mo401();
                if (iMo4012 == 1635150195) {
                    return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                }
                if (iMo4012 == 1635150182) {
                    z = true;
                } else if (m4216(iMo4012)) {
                    zM4216 = true;
                }
                i2++;
                i3 -= 4;
            }
        }
        return z ? ImageHeaderParser$ImageType.AVIF : zM4216 ? ImageHeaderParser$ImageType.HEIF : ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static ImageHeaderParser$ImageType m4212(InterfaceC1493 interfaceC1493) {
        try {
            int iMo401 = interfaceC1493.mo401();
            if (iMo401 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iMo406 = (iMo401 << 8) | interfaceC1493.mo406();
            if (iMo406 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iMo4062 = (iMo406 << 8) | interfaceC1493.mo406();
            if (iMo4062 == -1991225785) {
                interfaceC1493.skip(21L);
                try {
                    return interfaceC1493.mo406() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (C1130 unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iMo4062 != 1380533830) {
                return m4211(interfaceC1493, iMo4062);
            }
            interfaceC1493.skip(4L);
            if (((interfaceC1493.mo401() << 16) | interfaceC1493.mo401()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iMo4012 = (interfaceC1493.mo401() << 16) | interfaceC1493.mo401();
            if ((iMo4012 & (-256)) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i = iMo4012 & 255;
            if (i == 88) {
                interfaceC1493.skip(4L);
                short sMo406 = interfaceC1493.mo406();
                return (sMo406 & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sMo406 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (i != 76) {
                return ImageHeaderParser$ImageType.WEBP;
            }
            interfaceC1493.skip(4L);
            return (interfaceC1493.mo406() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
        } catch (C1130 unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static int m4213(InterfaceC1493 interfaceC1493, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iMo389 = interfaceC1493.mo389(i, bArr);
        if (iMo389 != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iMo389);
                return -1;
            }
        } else if (m4218(i, bArr, f10981)) {
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
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i4 + " tagType=" + ((int) s3) + " formatCode=" + ((int) s4) + " componentCount=" + i8);
                            }
                            int i9 = i8 + f10983[s4];
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

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static boolean m4214(InterfaceC1493 interfaceC1493, C2267 c2267) {
        boolean zM4218;
        if (m4212(interfaceC1493) == ImageHeaderParser$ImageType.JPEG) {
            int iM4217 = m4217(interfaceC1493, 226);
            while (iM4217 > 0) {
                byte[] bArr = (byte[]) c2267.m4272(byte[].class, iM4217);
                try {
                    int iMo389 = interfaceC1493.mo389(iM4217, bArr);
                    if (iMo389 != iM4217) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + iM4217 + ", actually read: " + iMo389);
                        }
                        zM4218 = false;
                    } else {
                        zM4218 = m4218(iM4217, bArr, f10982);
                    }
                    if (zM4218) {
                        c2267.m4271(bArr);
                        return true;
                    }
                    c2267.m4271(bArr);
                    iM4217 = m4217(interfaceC1493, 226);
                } catch (Throwable th) {
                    c2267.m4271(bArr);
                    throw th;
                }
            }
            if (Log.isLoggable("DfltImageHeaderParser", 2)) {
                Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static int m4215(InterfaceC1493 interfaceC1493, C2267 c2267) {
        try {
            int iMo401 = interfaceC1493.mo401();
            if ((iMo401 & 65496) == 65496 || iMo401 == 19789 || iMo401 == 18761) {
                int iM4217 = m4217(interfaceC1493, 225);
                if (iM4217 != -1) {
                    byte[] bArr = (byte[]) c2267.m4272(byte[].class, iM4217);
                    try {
                        return m4213(interfaceC1493, bArr, iM4217);
                    } finally {
                        c2267.m4271(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo401);
                return -1;
            }
        } catch (C1130 unused) {
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static boolean m4216(int i) {
        return i == 1751476579 || i == 1751476600 || i == 1751479907 || i == 1751479928 || i == 1835623985 || i == 1836279345;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        return -1;
     */
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m4217(InterfaceC1493 interfaceC1493, int i) {
        while (true) {
            short sMo406 = interfaceC1493.mo406();
            if (sMo406 == 255) {
                short sMo4062 = interfaceC1493.mo406();
                if (sMo4062 == 218) {
                    break;
                }
                if (sMo4062 != 217) {
                    int iMo401 = interfaceC1493.mo401() - 2;
                    if (sMo4062 == i) {
                        return iMo401;
                    }
                    long j = iMo401;
                    long jSkip = interfaceC1493.skip(j);
                    if (jSkip != j) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sMo4062) + ", wanted to skip: " + iMo401 + ", but actually skipped: " + jSkip);
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in " + i + " segment");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sMo406));
                return -1;
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static boolean m4218(int i, byte[] bArr, byte[] bArr2) {
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

    @Override // yyds.InterfaceC0849
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final int mo1925(InputStream inputStream, C2267 c2267) {
        C0052 c0052 = new C0052(13, inputStream);
        AbstractC0319.m992(c2267, "Argument must not be null");
        return m4215(c0052, c2267);
    }

    @Override // yyds.InterfaceC0849
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final ImageHeaderParser$ImageType mo1926(ByteBuffer byteBuffer) {
        AbstractC0319.m992(byteBuffer, "Argument must not be null");
        return m4212(new C0340(byteBuffer, 1));
    }

    @Override // yyds.InterfaceC0849
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo1927(ByteBuffer byteBuffer, C2267 c2267) {
        C0340 c0340 = new C0340(byteBuffer, 1);
        AbstractC0319.m992(c2267, "Argument must not be null");
        return m4214(c0340, c2267);
    }

    @Override // yyds.InterfaceC0849
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo1928(InputStream inputStream, C2267 c2267) {
        C0052 c0052 = new C0052(13, inputStream);
        AbstractC0319.m992(c2267, "Argument must not be null");
        return m4214(c0052, c2267);
    }

    @Override // yyds.InterfaceC0849
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final ImageHeaderParser$ImageType mo1929(InputStream inputStream) {
        return m4212(new C0052(13, inputStream));
    }

    @Override // yyds.InterfaceC0849
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final int mo1930(ByteBuffer byteBuffer, C2267 c2267) {
        C0340 c0340 = new C0340(byteBuffer, 1);
        AbstractC0319.m992(c2267, "Argument must not be null");
        return m4215(c0340, c2267);
    }
}
