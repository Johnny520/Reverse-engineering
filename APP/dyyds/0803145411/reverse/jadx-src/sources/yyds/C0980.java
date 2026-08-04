package yyds;

import android.graphics.Rect;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛴᲇᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0980 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0980 f4487;

    static {
        AbstractC2328.m4341(-1737051851096942L);
        f4487 = new C0980();
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static byte[] m2127(File file, ArrayList arrayList, int i) throws IOException {
        if (arrayList.isEmpty() || i <= 0) {
            return null;
        }
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            C1771 c1771 = (C1771) it.next();
            long j2 = c1771.f8881;
            long j3 = c1771.f8882;
            if (j2 < 0 || j3 <= 0 || j2 > file.length() - j3 || j > ((long) i) - j3) {
                return null;
            }
            j += j3;
        }
        if (j <= 0 || j > i) {
            return null;
        }
        byte[] bArr = new byte[(int) j];
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, AbstractC2328.m4341(-1736403311035246L));
        try {
            Iterator it2 = arrayList.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                C1771 c17712 = (C1771) it2.next();
                int i3 = (int) c17712.f8882;
                randomAccessFile.seek(c17712.f8881);
                randomAccessFile.readFully(bArr, i2, i3);
                i2 += i3;
            }
            randomAccessFile.close();
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1367.m2774(randomAccessFile, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static byte[] m2128(int i, byte[] bArr) {
        AbstractC2328.m4341(-1736411900969838L);
        if (bArr.length == 0 || 1 > i || i >= 5) {
            return null;
        }
        long j = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            i3++;
            if (i3 > 100000 || i2 > bArr.length - i) {
                return null;
            }
            long j2 = 0;
            int i4 = 0;
            while (i4 < i) {
                j2 = (j2 << 8) | (((long) bArr[i2]) & 255);
                i4++;
                i2++;
            }
            if (j2 <= 0 || j2 > bArr.length - i2 || j > 16777212 - j2) {
                return null;
            }
            j += 4 + j2;
            i2 += (int) j2;
        }
        if (i2 != bArr.length || j > 2147483647L) {
            return null;
        }
        byte[] bArr2 = new byte[(int) j];
        int i5 = 0;
        int i6 = 0;
        while (i5 < bArr.length) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < i) {
                i8 = (i8 << 8) | (bArr[i5] & 255);
                i7++;
                i5++;
            }
            bArr2[i6] = 0;
            bArr2[i6 + 1] = 0;
            int i9 = i6 + 3;
            bArr2[i6 + 2] = 0;
            int i10 = i6 + 4;
            bArr2[i9] = 1;
            int i11 = i5 + i8;
            AbstractC2070.m3938(bArr, bArr2, i10, i5, i11);
            i6 = i10 + i8;
            i5 = i11;
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static C0471 m2129(File file, C0404 c0404, int i, int i2) {
        byte[] bArrM2128;
        AbstractC2328.m4341(-1736158497899374L);
        AbstractC2328.m4341(-1736197152605038L);
        if (file.isFile() && i > 0 && i2 > 0 && c0404.f2130 == i && c0404.f2132 == i2) {
            long j = ((long) i) * ((long) i2);
            if (j <= 16000000) {
                try {
                    byte[] bArrM2127 = m2127(file, c0404.f2128, (int) AbstractC0598.m1488((j * 4) + 65536, 262144L, 16777216L));
                    if (bArrM2127 != null && (bArrM2128 = m2128(c0404.f2126, bArrM2127)) != null) {
                        return m2130(bArrM2128, c0404.f2131, i, i2, c0404.f2129);
                    }
                } catch (Throwable th) {
                    Log.w(AbstractC2328.m4341(-1736235807310702L), AbstractC2328.m4341(-1736321706656622L), th);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static C0471 m2130(byte[] bArr, byte[] bArr2, int i, int i2, Boolean bool) throws Throwable {
        boolean z;
        MediaCodec mediaCodecCreateDecoderByType;
        int i3;
        long j;
        boolean z2;
        Image outputImage;
        C0471 c0471M2131;
        int iDequeueInputBuffer;
        MediaCodec mediaCodec = null;
        Image image = null;
        if (bArr.length != 0 && bArr2.length != 0) {
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(AbstractC2328.m4341(-1736441965740910L), i, i2);
            mediaFormatCreateVideoFormat.setInteger(AbstractC2328.m4341(-1736489210381166L), 2135033992);
            mediaFormatCreateVideoFormat.setInteger(AbstractC2328.m4341(-1736545044956014L), bArr.length);
            mediaFormatCreateVideoFormat.setInteger(AbstractC2328.m4341(-1736609469465454L), 1);
            mediaFormatCreateVideoFormat.setByteBuffer(AbstractC2328.m4341(-1736656714105710L), ByteBuffer.wrap(bArr2));
            if (bool != null) {
                mediaFormatCreateVideoFormat.setInteger(AbstractC2328.m4341(-1736682483909486L), bool.booleanValue() ? 1 : 2);
            }
            AbstractC2328.m4341(-1736734023517038L);
            try {
                mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(AbstractC2328.m4341(-1736781268157294L));
                try {
                    mediaCodecCreateDecoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 0);
                    mediaCodecCreateDecoderByType.start();
                } catch (Throwable th) {
                    th = th;
                    z = false;
                    mediaCodec = mediaCodecCreateDecoderByType;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            try {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                long j2 = 10000;
                long jElapsedRealtime = SystemClock.elapsedRealtime() + 10000;
                int i4 = 0;
                boolean z3 = false;
                boolean z4 = false;
                int i5 = 0;
                while (i4 <= 500 && SystemClock.elapsedRealtime() <= jElapsedRealtime) {
                    if (z3 || (iDequeueInputBuffer = mediaCodecCreateDecoderByType.dequeueInputBuffer(j2)) < 0) {
                        i3 = i4;
                        j = j2;
                        z2 = false;
                    } else if (z4) {
                        i3 = i4;
                        j = j2;
                        mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                        z2 = true;
                        z3 = true;
                    } else {
                        ByteBuffer inputBuffer = mediaCodecCreateDecoderByType.getInputBuffer(iDequeueInputBuffer);
                        if (inputBuffer != null && inputBuffer.capacity() >= bArr.length) {
                            inputBuffer.clear();
                            inputBuffer.put(bArr);
                            i3 = i4;
                            j = j2;
                            mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, 0L, 1);
                            z2 = true;
                            z4 = true;
                        }
                    }
                    int iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, j);
                    if (iDequeueOutputBuffer == -2) {
                        z2 = true;
                    } else if (iDequeueOutputBuffer >= 0) {
                        int i6 = i5 + 1;
                        if (i6 > 8) {
                            mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            break;
                        }
                        try {
                            if (bufferInfo.size <= 0 || (bufferInfo.flags & 2) != 0) {
                                outputImage = null;
                                c0471M2131 = null;
                            } else {
                                outputImage = mediaCodecCreateDecoderByType.getOutputImage(iDequeueOutputBuffer);
                                if (outputImage != null) {
                                    try {
                                        c0471M2131 = m2131(outputImage, i, i2, AbstractC1544.m3188(bool, Boolean.TRUE) ? 0 : 16);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        image = outputImage;
                                        if (image != null) {
                                            image.close();
                                        }
                                        mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                        throw th;
                                    }
                                } else {
                                    c0471M2131 = null;
                                }
                            }
                            if (outputImage != null) {
                                outputImage.close();
                            }
                            mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            if (c0471M2131 != null) {
                                try {
                                    mediaCodecCreateDecoderByType.stop();
                                } catch (Throwable unused) {
                                }
                                try {
                                    mediaCodecCreateDecoderByType.release();
                                } catch (Throwable unused2) {
                                }
                                return c0471M2131;
                            }
                            if ((bufferInfo.flags & 4) != 0) {
                                break;
                            }
                            i5 = i6;
                            z2 = true;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    if (z2) {
                        j2 = j;
                        i4 = 0;
                    } else {
                        j2 = j;
                        i4 = i3 + 1;
                    }
                }
                Log.w(AbstractC2328.m4341(-1736828512797550L), AbstractC2328.m4341(-1736914412143470L));
                try {
                    mediaCodecCreateDecoderByType.stop();
                } catch (Throwable unused3) {
                }
                try {
                    mediaCodecCreateDecoderByType.release();
                } catch (Throwable unused4) {
                }
            } catch (Throwable th5) {
                th = th5;
                mediaCodec = mediaCodecCreateDecoderByType;
                z = true;
                if (mediaCodec != null) {
                    if (z) {
                        try {
                            mediaCodec.stop();
                        } catch (Throwable unused5) {
                        }
                    }
                    try {
                        mediaCodec.release();
                    } catch (Throwable unused6) {
                    }
                }
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static C0471 m2131(Image image, int i, int i2, int i3) {
        if (image.getFormat() != 35) {
            return null;
        }
        Image.Plane[] planes = image.getPlanes();
        AbstractC2328.m4341(-1736987426587502L);
        if (planes.length == 0) {
            return null;
        }
        Rect cropRect = image.getCropRect();
        if (cropRect.left < 0 || cropRect.top < 0 || cropRect.right > image.getWidth() || cropRect.bottom > image.getHeight() || cropRect.width() != i || cropRect.height() != i2) {
            return null;
        }
        int i4 = 0;
        Image.Plane plane = image.getPlanes()[0];
        ByteBuffer buffer = plane.getBuffer();
        int iPosition = buffer.position();
        int iLimit = buffer.limit();
        int rowStride = plane.getRowStride();
        int pixelStride = plane.getPixelStride();
        if (rowStride <= 0 || pixelStride <= 0) {
            return null;
        }
        byte[] bArr = new byte[i * i2];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2) {
            int i7 = cropRect.top + i5;
            int i8 = i4;
            while (i8 < i) {
                ByteBuffer byteBuffer = buffer;
                long j = (((long) pixelStride) * ((long) (cropRect.left + i8))) + (((long) rowStride) * ((long) i7));
                Rect rect = cropRect;
                int i9 = pixelStride;
                long j2 = iPosition;
                long j3 = j + j2;
                if (j3 >= iLimit || j2 > j3) {
                    return null;
                }
                bArr[i6] = byteBuffer.get((int) j3);
                i8++;
                i6++;
                cropRect = rect;
                buffer = byteBuffer;
                pixelStride = i9;
            }
            i5++;
            i4 = 0;
        }
        return new C0471(i, i2, i3, bArr);
    }
}
