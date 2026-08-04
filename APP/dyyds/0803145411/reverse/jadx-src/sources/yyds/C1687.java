package yyds;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛷᲈᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1687 implements InterfaceC0814 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC1454 f8594;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC2587 f8595;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0469 f8596 = f8592;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C2120 f8593 = new C2120("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C0340(2));

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C2120 f8590 = new C2120("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C0340(3));

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C0469 f8592 = new C0469(27);

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final List f8591 = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    public C1687(InterfaceC2587 interfaceC2587, InterfaceC1454 interfaceC1454) {
        this.f8595 = interfaceC2587;
        this.f8594 = interfaceC1454;
    }

    @Override // yyds.InterfaceC0814
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo427(Object obj, C0822 c0822) {
        return true;
    }

    @Override // yyds.InterfaceC0814
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final InterfaceC2162 mo428(Object obj, int i, int i2, C0822 c0822) throws IOException {
        long jLongValue = ((Long) c0822.m1891(f8593)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) c0822.m1891(f8590);
        if (num == null) {
            num = 2;
        }
        C1268 c1268 = (C1268) c0822.m1891(C1268.f5842);
        if (c1268 == null) {
            c1268 = C1268.f5844;
        }
        C1268 c12682 = c1268;
        this.f8596.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f8594.mo603(mediaMetadataRetriever, obj);
            Bitmap bitmapM3427 = m3427(obj, mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, c12682);
            mediaMetadataRetriever.close();
            return C0656.m1574(bitmapM3427, this.f8595);
        } catch (Throwable th) {
            mediaMetadataRetriever.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #2 {all -> 0x0068, blocks: (B:23:0x005c, B:25:0x0062), top: B:88:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017a  */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m3427(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C1268 c1268) {
        int i4;
        int i5;
        int i6;
        int i7;
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmapCreateBitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
            } catch (Throwable th) {
                th = th;
                mediaExtractor = null;
            }
            try {
                if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    mediaExtractor = new MediaExtractor();
                    try {
                        this.f8594.mo606(mediaExtractor, obj);
                        int trackCount = mediaExtractor.getTrackCount();
                        for (int i8 = 0; i8 < trackCount; i8++) {
                            if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i8).getString("mime"))) {
                                mediaExtractor.release();
                                C0188.m800("Cannot decode VP8 video on CrOS.");
                                return null;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (Log.isLoggable("VideoDecoder", 3)) {
                        }
                        if (mediaExtractor != null) {
                        }
                        if (i2 != Integer.MIN_VALUE) {
                            try {
                                i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                                if (i7 != 90) {
                                    i6 = i5;
                                    i5 = i6;
                                    float fM2542 = c1268.m2542(i5, i6, i2, i3);
                                    bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i5 * fM2542), Math.round(fM2542 * i6));
                                }
                            } catch (Throwable th3) {
                                if (Log.isLoggable("VideoDecoder", 3)) {
                                    Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th3);
                                }
                            }
                        }
                        if (bitmapCreateBitmap == null) {
                        }
                        if (!Build.MODEL.startsWith("Pixel")) {
                            if (Build.VERSION.SDK_INT < 33) {
                            }
                        }
                        if (bitmapCreateBitmap == null) {
                        }
                    }
                    mediaExtractor.release();
                }
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            } catch (Throwable th4) {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
                throw th4;
            }
        }
        if (i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && c1268 != C1268.f5840) {
            i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i7 != 90 || i7 == 270) {
                i6 = i5;
                i5 = i6;
            }
            float fM25422 = c1268.m2542(i5, i6, i2, i3);
            bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i5 * fM25422), Math.round(fM25422 * i6));
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
        }
        if (!Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            Iterator it = f8591.iterator();
            while (it.hasNext()) {
                if (Build.ID.startsWith((String) it.next())) {
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                    i4 = Integer.parseInt(strExtractMetadata);
                    int i9 = Integer.parseInt(strExtractMetadata2);
                    if (i4 != 7) {
                        if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                        }
                    } else if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT < 33) {
            try {
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                String strExtractMetadata22 = mediaMetadataRetriever.extractMetadata(35);
                i4 = Integer.parseInt(strExtractMetadata3);
                int i92 = Integer.parseInt(strExtractMetadata22);
                if ((i4 != 7 || i4 == 6) && i92 == 6) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                        if (Log.isLoggable("VideoDecoder", 3)) {
                            Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                        }
                        Matrix matrix = new Matrix();
                        matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                    }
                }
            } catch (NumberFormatException unused) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                }
            }
        }
        if (bitmapCreateBitmap == null) {
            return bitmapCreateBitmap;
        }
        throw new C1738("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
