package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.activity.AbstractC0900;
import androidx.core.view.C3075;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p238.AbstractC8818;
import p302.InterfaceC9223;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3877 implements InterfaceC9223 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final byte[] f10038 = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final byte[] f10037 = "MPF".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int[] f10036 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static ImageHeaderParser$ImageType m7145(InterfaceC3876 interfaceC3876) {
        try {
            int iMo4727 = interfaceC3876.mo4727();
            if (iMo4727 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iMo4725 = (iMo4727 << 8) | interfaceC3876.mo4725();
            if (iMo4725 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iMo47252 = (iMo4725 << 8) | interfaceC3876.mo4725();
            if (iMo47252 == -1991225785) {
                interfaceC3876.skip(21L);
                try {
                    return interfaceC3876.mo4725() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iMo47252 == 1380533830) {
                interfaceC3876.skip(4L);
                if (((interfaceC3876.mo4727() << 16) | interfaceC3876.mo4727()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iMo47272 = (interfaceC3876.mo4727() << 16) | interfaceC3876.mo4727();
                if ((iMo47272 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iMo47272 & Opcodes.CONST_METHOD_TYPE;
                if (i == 88) {
                    interfaceC3876.skip(4L);
                    short sMo4725 = interfaceC3876.mo4725();
                    return (sMo4725 & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sMo4725 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                interfaceC3876.skip(4L);
                return (interfaceC3876.mo4725() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((interfaceC3876.mo4727() << 16) | interfaceC3876.mo4727()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iMo47273 = (interfaceC3876.mo4727() << 16) | interfaceC3876.mo4727();
            if (iMo47273 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iMo47273 == 1635150182;
            interfaceC3876.skip(4L);
            int i3 = iMo47252 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iMo47274 = (interfaceC3876.mo4727() << 16) | interfaceC3876.mo4727();
                    if (iMo47274 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iMo47274 == 1635150182) {
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
    public static int m7146(InterfaceC3876 interfaceC3876, C3806 c3806) {
        try {
            int iMo4727 = interfaceC3876.mo4727();
            if ((iMo4727 & 65496) == 65496 || iMo4727 == 19789 || iMo4727 == 18761) {
                int iM7147 = m7147(interfaceC3876, Opcodes.SHR_INT_LIT8);
                if (iM7147 != -1) {
                    byte[] bArr = (byte[]) c3806.m7006(iM7147, byte[].class);
                    try {
                        return m7148(interfaceC3876, bArr, iM7147);
                    } finally {
                        c3806.m7009(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo4727);
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
    */
    public static int m7147(InterfaceC3876 interfaceC3876, int i) {
        while (true) {
            short sMo4725 = interfaceC3876.mo4725();
            if (sMo4725 == 255) {
                short sMo47252 = interfaceC3876.mo4725();
                if (sMo47252 == 218) {
                    break;
                }
                if (sMo47252 != 217) {
                    int iMo4727 = interfaceC3876.mo4727() - 2;
                    if (sMo47252 == i) {
                        return iMo4727;
                    }
                    long j = iMo4727;
                    long jSkip = interfaceC3876.skip(j);
                    if (jSkip != j) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sbM709 = AbstractC0900.m709(sMo47252, iMo4727, "Unable to skip enough data, type: ", ", wanted to skip: ", ", but actually skipped: ");
                            sbM709.append(jSkip);
                            Log.d("DfltImageHeaderParser", sbM709.toString());
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in " + i + " segment");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sMo4725));
                return -1;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m7148(InterfaceC3876 interfaceC3876, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iMo4726 = interfaceC3876.mo4726(bArr, i);
        if (iMo4726 != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iMo4726);
                return -1;
            }
        } else if (m7150(bArr, i, f10038)) {
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
                                StringBuilder sbM709 = AbstractC0900.m709(i4, s3, "Got tagIndex=", " tagType=", " formatCode=");
                                sbM709.append((int) s4);
                                sbM709.append(" componentCount=");
                                sbM709.append(i8);
                                Log.d("DfltImageHeaderParser", sbM709.toString());
                            }
                            int i9 = i8 + f10036[s4];
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
    public static boolean m7149(InterfaceC3876 interfaceC3876, C3806 c3806) {
        boolean zM7150;
        if (m7145(interfaceC3876) == ImageHeaderParser$ImageType.JPEG) {
            int iM7147 = m7147(interfaceC3876, Opcodes.USHR_INT_LIT8);
            while (iM7147 > 0) {
                byte[] bArr = (byte[]) c3806.m7006(iM7147, byte[].class);
                try {
                    int iMo4726 = interfaceC3876.mo4726(bArr, iM7147);
                    if (iMo4726 != iM7147) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + iM7147 + ", actually read: " + iMo4726);
                        }
                        zM7150 = false;
                    } else {
                        zM7150 = m7150(bArr, iM7147, f10037);
                    }
                    if (zM7150) {
                        c3806.m7009(bArr);
                        return true;
                    }
                    c3806.m7009(bArr);
                    iM7147 = m7147(interfaceC3876, Opcodes.USHR_INT_LIT8);
                } catch (Throwable th) {
                    c3806.m7009(bArr);
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
    public static boolean m7150(byte[] bArr, int i, byte[] bArr2) {
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

    @Override // p302.InterfaceC9223
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo7098(InputStream inputStream, C3806 c3806) {
        C3075 c3075 = new C3075(inputStream, 10);
        AbstractC8818.m14028(c3806, "Argument must not be null");
        return m7146(c3075, c3806);
    }

    @Override // p302.InterfaceC9223
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final ImageHeaderParser$ImageType mo7099(InputStream inputStream) {
        return m7145(new C3075(inputStream, 10));
    }

    @Override // p302.InterfaceC9223
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo7100(InputStream inputStream, C3806 c3806) {
        AbstractC8818.m14028(inputStream, "Argument must not be null");
        C3075 c3075 = new C3075(inputStream, 10);
        AbstractC8818.m14028(c3806, "Argument must not be null");
        return m7149(c3075, c3806);
    }

    @Override // p302.InterfaceC9223
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo7101(ByteBuffer byteBuffer, C3806 c3806) {
        C3879 c3879 = new C3879(byteBuffer, 0);
        AbstractC8818.m14028(c3806, "Argument must not be null");
        return m7149(c3879, c3806);
    }

    @Override // p302.InterfaceC9223
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo7102(ByteBuffer byteBuffer, C3806 c3806) {
        C3879 c3879 = new C3879(byteBuffer, 0);
        AbstractC8818.m14028(c3806, "Argument must not be null");
        return m7146(c3879, c3806);
    }

    @Override // p302.InterfaceC9223
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final ImageHeaderParser$ImageType mo7103(ByteBuffer byteBuffer) {
        AbstractC8818.m14028(byteBuffer, "Argument must not be null");
        return m7145(new C3879(byteBuffer, 0));
    }
}
