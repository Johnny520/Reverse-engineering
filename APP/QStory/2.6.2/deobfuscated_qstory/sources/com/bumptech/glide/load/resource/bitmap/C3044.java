package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.activity.AbstractC0053;
import androidx.core.view.C2242;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p222.AbstractC7988;
import p286.InterfaceC8393;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3044 implements InterfaceC8393 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final byte[] f9691 = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final byte[] f9690 = "MPF".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int[] f9689 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static ImageHeaderParser$ImageType m6525(InterfaceC3043 interfaceC3043) {
        try {
            int iMo4158 = interfaceC3043.mo4158();
            if (iMo4158 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iMo4156 = (iMo4158 << 8) | interfaceC3043.mo4156();
            if (iMo4156 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iMo41562 = (iMo4156 << 8) | interfaceC3043.mo4156();
            if (iMo41562 == -1991225785) {
                interfaceC3043.skip(21L);
                try {
                    return interfaceC3043.mo4156() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iMo41562 == 1380533830) {
                interfaceC3043.skip(4L);
                if (((interfaceC3043.mo4158() << 16) | interfaceC3043.mo4158()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iMo41582 = (interfaceC3043.mo4158() << 16) | interfaceC3043.mo4158();
                if ((iMo41582 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iMo41582 & Opcodes.CONST_METHOD_TYPE;
                if (i == 88) {
                    interfaceC3043.skip(4L);
                    short sMo4156 = interfaceC3043.mo4156();
                    return (sMo4156 & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sMo4156 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                interfaceC3043.skip(4L);
                return (interfaceC3043.mo4156() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((interfaceC3043.mo4158() << 16) | interfaceC3043.mo4158()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iMo41583 = (interfaceC3043.mo4158() << 16) | interfaceC3043.mo4158();
            if (iMo41583 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iMo41583 == 1635150182;
            interfaceC3043.skip(4L);
            int i3 = iMo41562 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iMo41584 = (interfaceC3043.mo4158() << 16) | interfaceC3043.mo4158();
                    if (iMo41584 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iMo41584 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m6526(InterfaceC3043 interfaceC3043, C2973 c2973) {
        try {
            int iMo4158 = interfaceC3043.mo4158();
            if ((iMo4158 & 65496) == 65496 || iMo4158 == 19789 || iMo4158 == 18761) {
                int iM6527 = m6527(interfaceC3043, Opcodes.SHR_INT_LIT8);
                if (iM6527 != -1) {
                    byte[] bArr = (byte[]) c2973.m6388(iM6527, byte[].class);
                    try {
                        return m6528(interfaceC3043, bArr, iM6527);
                    } finally {
                        c2973.m6391(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo4158);
                return -1;
            }
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        return -1;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m6527(com.bumptech.glide.load.resource.bitmap.InterfaceC3043 r9, int r10) {
        /*
        L0:
            short r0 = r9.mo4156()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L24
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L79
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unknown segmentId="
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
            return r3
        L24:
            short r0 = r9.mo4156()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L2d
            goto L79
        L2d:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L4e
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L79
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
            int r1 = r9.mo4158()
            int r1 = r1 + (-2)
            if (r0 == r10) goto L7a
            long r5 = (long) r1
            long r7 = r9.skip(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L0
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L79
            java.lang.String r9 = ", wanted to skip: "
            java.lang.String r10 = ", but actually skipped: "
            java.lang.String r2 = "Unable to skip enough data, type: "
            java.lang.StringBuilder r9 = androidx.activity.AbstractC0053.m151(r0, r1, r2, r9, r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L79:
            return r3
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C3044.m6527(com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪苏兰世哲, int):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m6528(InterfaceC3043 interfaceC3043, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iMo4157 = interfaceC3043.mo4157(bArr, i);
        if (iMo4157 != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iMo4157);
                return -1;
            }
        } else if (m6530(bArr, i, f9691)) {
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
                                StringBuilder sbM151 = AbstractC0053.m151(i4, s3, "Got tagIndex=", " tagType=", " formatCode=");
                                sbM151.append((int) s4);
                                sbM151.append(" componentCount=");
                                sbM151.append(i8);
                                Log.d("DfltImageHeaderParser", sbM151.toString());
                            }
                            int i9 = i8 + f9689[s4];
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

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m6529(InterfaceC3043 interfaceC3043, C2973 c2973) {
        boolean zM6530;
        if (m6525(interfaceC3043) == ImageHeaderParser$ImageType.JPEG) {
            int iM6527 = m6527(interfaceC3043, Opcodes.USHR_INT_LIT8);
            while (iM6527 > 0) {
                byte[] bArr = (byte[]) c2973.m6388(iM6527, byte[].class);
                try {
                    int iMo4157 = interfaceC3043.mo4157(bArr, iM6527);
                    if (iMo4157 != iM6527) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + iM6527 + ", actually read: " + iMo4157);
                        }
                        zM6530 = false;
                    } else {
                        zM6530 = m6530(bArr, iM6527, f9690);
                    }
                    if (zM6530) {
                        c2973.m6391(bArr);
                        return true;
                    }
                    c2973.m6391(bArr);
                    iM6527 = m6527(interfaceC3043, Opcodes.USHR_INT_LIT8);
                } catch (Throwable th) {
                    c2973.m6391(bArr);
                    throw th;
                }
            }
            if (Log.isLoggable("DfltImageHeaderParser", 2)) {
                Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m6530(byte[] bArr, int i, byte[] bArr2) {
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

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo6478(InputStream inputStream, C2973 c2973) {
        C2242 c2242 = new C2242(inputStream, 10);
        AbstractC7988.m13441(c2973, "Argument must not be null");
        return m6526(c2242, c2973);
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final ImageHeaderParser$ImageType mo6479(InputStream inputStream) {
        return m6525(new C2242(inputStream, 10));
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo6480(InputStream inputStream, C2973 c2973) {
        AbstractC7988.m13441(inputStream, "Argument must not be null");
        C2242 c2242 = new C2242(inputStream, 10);
        AbstractC7988.m13441(c2973, "Argument must not be null");
        return m6529(c2242, c2973);
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo6481(ByteBuffer byteBuffer, C2973 c2973) {
        C3046 c3046 = new C3046(byteBuffer, 0);
        AbstractC7988.m13441(c2973, "Argument must not be null");
        return m6529(c3046, c2973);
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo6482(ByteBuffer byteBuffer, C2973 c2973) {
        C3046 c3046 = new C3046(byteBuffer, 0);
        AbstractC7988.m13441(c2973, "Argument must not be null");
        return m6526(c3046, c2973);
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final ImageHeaderParser$ImageType mo6483(ByteBuffer byteBuffer) {
        AbstractC7988.m13441(byteBuffer, "Argument must not be null");
        return m6525(new C3046(byteBuffer, 0));
    }
}
