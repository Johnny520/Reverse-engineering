package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import androidx.profileinstaller.AbstractC3275;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import p302.C9226;
import p302.C9227;
import p302.InterfaceC9229;
import p321.C9452;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3854 implements InterfaceC9229 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9452 f9978 = f9974;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3811 f9979;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3855 f9980;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C9227 f9976 = new C9227("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C3879(1));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C9227 f9975 = new C9227("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C3879(2));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C9452 f9974 = new C9452(18);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final List f9977 = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    public C3854(InterfaceC3811 interfaceC3811, InterfaceC3855 interfaceC3855) {
        this.f9979 = interfaceC3811;
        this.f9980 = interfaceC3855;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #2 {all -> 0x0068, blocks: (B:23:0x005c, B:25:0x0062), top: B:89:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m7092(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C3869 c3869) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
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
                        this.f9980.mo7094(mediaExtractor, obj);
                        int trackCount = mediaExtractor.getTrackCount();
                        for (int i9 = 0; i9 < trackCount; i9++) {
                            if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i9).getString("mime"))) {
                                mediaExtractor.release();
                                C6755.m11870("Cannot decode VP8 video on CrOS.");
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
                                i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                i8 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                                if (i8 != 90) {
                                    i7 = i6;
                                    i6 = i7;
                                    float fM7134 = c3869.m7134(i6, i7, i2, i3);
                                    bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i6 * fM7134), Math.round(fM7134 * i7));
                                }
                            } catch (Throwable th3) {
                                if (Log.isLoggable("VideoDecoder", 3)) {
                                    Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th3);
                                }
                            }
                        }
                        if (bitmapCreateBitmap == null) {
                        }
                        if (Build.MODEL.startsWith("Pixel")) {
                            i4 = Build.VERSION.SDK_INT;
                            if (i4 >= 30) {
                                try {
                                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                    i5 = Integer.parseInt(strExtractMetadata);
                                    int i10 = Integer.parseInt(strExtractMetadata2);
                                    if (i5 == 7) {
                                    }
                                } catch (NumberFormatException unused) {
                                    if (Log.isLoggable("VideoDecoder", 3)) {
                                        Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                                    }
                                }
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
        if (i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && c3869 != C3869.f10011) {
            i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            i8 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i8 != 90 || i8 == 270) {
                i7 = i6;
                i6 = i7;
            }
            float fM71342 = c3869.m7134(i6, i7, i2, i3);
            bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i6 * fM71342), Math.round(fM71342 * i7));
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
        }
        if (Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && i4 < 33) {
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                String strExtractMetadata22 = mediaMetadataRetriever.extractMetadata(35);
                i5 = Integer.parseInt(strExtractMetadata3);
                int i102 = Integer.parseInt(strExtractMetadata22);
                if ((i5 == 7 || i5 == 6) && i102 == 6) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                        if (Log.isLoggable("VideoDecoder", 3)) {
                            Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                        }
                        Matrix matrix = new Matrix();
                        matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                    }
                }
            }
        } else {
            Iterator it = f9977.iterator();
            while (it.hasNext()) {
                if (Build.ID.startsWith((String) it.next())) {
                    String strExtractMetadata32 = mediaMetadataRetriever.extractMetadata(36);
                    String strExtractMetadata222 = mediaMetadataRetriever.extractMetadata(35);
                    i5 = Integer.parseInt(strExtractMetadata32);
                    int i1022 = Integer.parseInt(strExtractMetadata222);
                    if (i5 == 7) {
                        if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                        }
                    } else if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    }
                }
            }
        }
        if (bitmapCreateBitmap == null) {
            return bitmapCreateBitmap;
        }
        throw new RuntimeException() { // from class: com.bumptech.glide.load.resource.bitmap.VideoDecoder$VideoDecoderException
            private static final long serialVersionUID = -2556382523004027815L;
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3821 mo7084(Object obj, int i, int i2, C9226 c9226) throws Exception {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        long jLongValue = ((Long) c9226.m14523(f9976)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            C6755.m11869(AbstractC3275.m5143(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
            return null;
        }
        int i3 = (Integer) c9226.m14523(f9975);
        if (i3 == null) {
            i3 = 2;
        }
        C3869 c3869 = (C3869) c9226.m14523(C3869.f10016);
        if (c3869 == null) {
            c3869 = C3869.f10010;
        }
        C3869 c38692 = c3869;
        this.f9978.getClass();
        Integer num = i3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        boolean z = false;
        try {
            this.f9980.mo7093(mediaMetadataRetriever, obj);
            Bitmap bitmapM7092 = m7092(obj, mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, c38692);
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated2) {
                        try {
                            zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            return C3858.m7096(bitmapM7092, this.f9979);
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService2 = (ExecutorService) mediaMetadataRetriever;
                if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                    executorService2.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                        } catch (InterruptedException unused2) {
                            if (!z) {
                                executorService2.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            throw th;
        }
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo7085(Object obj, C9226 c9226) {
        return true;
    }
}
