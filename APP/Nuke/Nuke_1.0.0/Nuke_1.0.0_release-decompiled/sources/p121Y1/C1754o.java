package p121Y1;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p078P1.InterfaceC1143e;
import p093S1.C1294f;
import p195l2.AbstractC2503g;

/* JADX INFO: renamed from: Y1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1754o implements InterfaceC1143e {

    /* JADX INFO: renamed from: a */
    public static final byte[] f6029a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b */
    public static final byte[] f6030b = "MPF".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: c */
    public static final int[] f6031c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: g */
    public static int m3120g(InterfaceC1752m interfaceC1752m, C1294f c1294f) {
        try {
            int iMo3104l = interfaceC1752m.mo3104l();
            if ((iMo3104l & 65496) == 65496 || iMo3104l == 19789 || iMo3104l == 18761) {
                int iM3124k = m3124k(interfaceC1752m, 225);
                if (iM3124k != -1) {
                    byte[] bArr = (byte[]) c1294f.m2384c(iM3124k, byte[].class);
                    try {
                        return m3125l(interfaceC1752m, bArr, iM3124k);
                    } finally {
                        c1294f.m2388g(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo3104l);
                return -1;
            }
        } catch (C1751l unused) {
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static ImageHeaderParser$ImageType m3121h(InterfaceC1752m interfaceC1752m) {
        try {
            int iMo3104l = interfaceC1752m.mo3104l();
            if (iMo3104l == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iMo3103g = (iMo3104l << 8) | interfaceC1752m.mo3103g();
            if (iMo3103g == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iMo3103g2 = (iMo3103g << 8) | interfaceC1752m.mo3103g();
            if (iMo3103g2 == -1991225785) {
                interfaceC1752m.skip(21L);
                try {
                    return interfaceC1752m.mo3103g() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (C1751l unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iMo3103g2 == 1380533830) {
                interfaceC1752m.skip(4L);
                if (((interfaceC1752m.mo3104l() << 16) | interfaceC1752m.mo3104l()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iMo3104l2 = (interfaceC1752m.mo3104l() << 16) | interfaceC1752m.mo3104l();
                if ((iMo3104l2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i5 = iMo3104l2 & 255;
                if (i5 == 88) {
                    interfaceC1752m.skip(4L);
                    short sMo3103g = interfaceC1752m.mo3103g();
                    return (sMo3103g & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sMo3103g & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i5 != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                interfaceC1752m.skip(4L);
                return (interfaceC1752m.mo3103g() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((interfaceC1752m.mo3104l() << 16) | interfaceC1752m.mo3104l()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iMo3104l3 = (interfaceC1752m.mo3104l() << 16) | interfaceC1752m.mo3104l();
            if (iMo3104l3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i6 = 0;
            boolean z5 = iMo3104l3 == 1635150182;
            interfaceC1752m.skip(4L);
            int i7 = iMo3103g2 - 16;
            if (i7 % 4 == 0) {
                while (i6 < 5 && i7 > 0) {
                    int iMo3104l4 = (interfaceC1752m.mo3104l() << 16) | interfaceC1752m.mo3104l();
                    if (iMo3104l4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iMo3104l4 == 1635150182) {
                        z5 = true;
                    }
                    i6++;
                    i7 -= 4;
                }
            }
            return z5 ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (C1751l unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m3122i(InterfaceC1752m interfaceC1752m, C1294f c1294f) {
        boolean zM3123j;
        if (m3121h(interfaceC1752m) == ImageHeaderParser$ImageType.JPEG) {
            int iM3124k = m3124k(interfaceC1752m, 226);
            while (iM3124k > 0) {
                byte[] bArr = (byte[]) c1294f.m2384c(iM3124k, byte[].class);
                try {
                    int iMo3105q = interfaceC1752m.mo3105q(iM3124k, bArr);
                    if (iMo3105q != iM3124k) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + iM3124k + ", actually read: " + iMo3105q);
                        }
                        zM3123j = false;
                    } else {
                        zM3123j = m3123j(bArr, iM3124k, f6030b);
                    }
                    if (zM3123j) {
                        c1294f.m2388g(bArr);
                        return true;
                    }
                    c1294f.m2388g(bArr);
                    iM3124k = m3124k(interfaceC1752m, 226);
                } catch (Throwable th) {
                    c1294f.m2388g(bArr);
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
    public static boolean m3123j(byte[] bArr, int i5, byte[] bArr2) {
        boolean z5 = (bArr == null || bArr2 == null || i5 <= bArr2.length) ? false : true;
        if (z5) {
            for (int i6 = 0; i6 < bArr2.length; i6++) {
                if (bArr[i6] != bArr2[i6]) {
                    return false;
                }
            }
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        return -1;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m3124k(p121Y1.InterfaceC1752m r9, int r10) {
        /*
        L0:
            short r0 = r9.mo3103g()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L24
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L86
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unknown segmentId="
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
            return r3
        L24:
            short r0 = r9.mo3103g()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L2d
            goto L86
        L2d:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L4e
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L86
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Found MARKER_EOI in "
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r10 = " segment"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
            return r3
        L4e:
            int r1 = r9.mo3104l()
            int r1 = r1 + (-2)
            if (r0 == r10) goto L87
            long r5 = (long) r1
            long r7 = r9.skip(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L0
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L86
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unable to skip enough data, type: "
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r10 = ", wanted to skip: "
            r9.append(r10)
            r9.append(r1)
            java.lang.String r10 = ", but actually skipped: "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L86:
            return r3
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p121Y1.C1754o.m3124k(Y1.m, int):int");
    }

    /* JADX INFO: renamed from: l */
    public static int m3125l(InterfaceC1752m interfaceC1752m, byte[] bArr, int i5) {
        ByteOrder byteOrder;
        int iMo3105q = interfaceC1752m.mo3105q(i5, bArr);
        if (iMo3105q != i5) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i5 + ", actually read: " + iMo3105q);
                return -1;
            }
        } else if (m3123j(bArr, i5, f6029a)) {
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i5);
            short s5 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s5 != 18761) {
                if (s5 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s5));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i6 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i7 = i6 + 6;
            short s6 = byteBuffer.remaining() - i7 >= 2 ? byteBuffer.getShort(i7) : (short) -1;
            for (int i8 = 0; i8 < s6; i8++) {
                int i9 = (i8 * 12) + i6 + 8;
                short s7 = byteBuffer.remaining() - i9 >= 2 ? byteBuffer.getShort(i9) : (short) -1;
                if (s7 == 274) {
                    int i10 = i9 + 2;
                    short s8 = byteBuffer.remaining() - i10 >= 2 ? byteBuffer.getShort(i10) : (short) -1;
                    if (s8 >= 1 && s8 <= 12) {
                        int i11 = i9 + 4;
                        int i12 = byteBuffer.remaining() - i11 >= 4 ? byteBuffer.getInt(i11) : -1;
                        if (i12 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i8 + " tagType=" + ((int) s7) + " formatCode=" + ((int) s8) + " componentCount=" + i12);
                            }
                            int i13 = i12 + f6031c[s8];
                            if (i13 <= 4) {
                                int i14 = i9 + 8;
                                if (i14 >= 0 && i14 <= byteBuffer.remaining()) {
                                    if (i13 >= 0 && i13 + i14 <= byteBuffer.remaining()) {
                                        if (byteBuffer.remaining() - i14 >= 2) {
                                            return byteBuffer.getShort(i14);
                                        }
                                        return -1;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s7));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i14 + " tagType=" + ((int) s7));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s8));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s8));
                    }
                }
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // p078P1.InterfaceC1143e
    /* JADX INFO: renamed from: a */
    public final ImageHeaderParser$ImageType mo2193a(ByteBuffer byteBuffer) {
        AbstractC2503g.m4445c(byteBuffer, "Argument must not be null");
        return m3121h(new C1750k(0, byteBuffer));
    }

    @Override // p078P1.InterfaceC1143e
    /* JADX INFO: renamed from: b */
    public final int mo2194b(InputStream inputStream, C1294f c1294f) {
        C1753n c1753n = new C1753n(0, inputStream);
        AbstractC2503g.m4445c(c1294f, "Argument must not be null");
        return m3120g(c1753n, c1294f);
    }

    @Override // p078P1.InterfaceC1143e
    /* JADX INFO: renamed from: c */
    public final boolean mo2195c(ByteBuffer byteBuffer, C1294f c1294f) {
        C1750k c1750k = new C1750k(0, byteBuffer);
        AbstractC2503g.m4445c(c1294f, "Argument must not be null");
        return m3122i(c1750k, c1294f);
    }

    @Override // p078P1.InterfaceC1143e
    /* JADX INFO: renamed from: d */
    public final int mo2196d(ByteBuffer byteBuffer, C1294f c1294f) {
        C1750k c1750k = new C1750k(0, byteBuffer);
        AbstractC2503g.m4445c(c1294f, "Argument must not be null");
        return m3120g(c1750k, c1294f);
    }

    @Override // p078P1.InterfaceC1143e
    /* JADX INFO: renamed from: e */
    public final ImageHeaderParser$ImageType mo2197e(InputStream inputStream) {
        return m3121h(new C1753n(0, inputStream));
    }

    @Override // p078P1.InterfaceC1143e
    /* JADX INFO: renamed from: f */
    public final boolean mo2198f(InputStream inputStream, C1294f c1294f) {
        AbstractC2503g.m4445c(inputStream, "Argument must not be null");
        C1753n c1753n = new C1753n(0, inputStream);
        AbstractC2503g.m4445c(c1294f, "Argument must not be null");
        return m3122i(c1753n, c1294f);
    }
}
