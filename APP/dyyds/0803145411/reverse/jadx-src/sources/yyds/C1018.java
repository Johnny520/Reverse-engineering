package yyds;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛵᛱᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1018 {
    static {
        AbstractC2328.m4341(-1733718956475246L);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static C1757 m2203(MediaFormat mediaFormat, int i, int i2) {
        int i3;
        int integer;
        int integer2 = -1;
        if (mediaFormat != null) {
            try {
                integer = mediaFormat.getInteger(AbstractC2328.m4341(-1733246510072686L));
            } catch (Exception unused) {
                integer = -1;
            }
            try {
                integer2 = mediaFormat.getInteger(AbstractC2328.m4341(-1733310934582126L));
            } catch (Exception unused2) {
            }
            i3 = integer2;
            integer2 = integer;
        } else {
            i3 = -1;
        }
        if (integer2 <= 0) {
            integer2 = (i2 >= 720 || i >= 1280) ? 1 : 2;
        }
        if (i3 <= 0) {
            i3 = 2;
        }
        return new C1757(integer2, i3);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static boolean m2204(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bitmap bitmap = (Bitmap) it.next();
            if (bitmap.hasAlpha()) {
                int width = bitmap.getWidth();
                int[] iArr = new int[width];
                int height = bitmap.getHeight();
                for (int i = 0; i < height; i++) {
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i, bitmap.getWidth(), 1);
                    for (int i2 = 0; i2 < width; i2++) {
                        if (((iArr[i2] >>> 24) & 255) < 128) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static Bitmap m2205(Image image, C1757 c1757) {
        int width;
        int height;
        int i;
        int i2;
        char c;
        float[] fArr;
        Rect cropRect = image.getCropRect();
        if (cropRect == null || cropRect.isEmpty()) {
            width = image.getWidth();
            height = image.getHeight();
            i = 0;
            i2 = 0;
        } else {
            i = cropRect.left;
            i2 = cropRect.top;
            width = cropRect.width();
            height = cropRect.height();
        }
        int i3 = height;
        int i4 = width;
        Image.Plane plane = image.getPlanes()[0];
        Image.Plane plane2 = image.getPlanes()[1];
        Image.Plane plane3 = image.getPlanes()[2];
        ByteBuffer buffer = plane.getBuffer();
        ByteBuffer buffer2 = plane2.getBuffer();
        ByteBuffer buffer3 = plane3.getBuffer();
        int rowStride = plane.getRowStride();
        int rowStride2 = plane2.getRowStride();
        int rowStride3 = plane3.getRowStride();
        int pixelStride = plane2.getPixelStride();
        int pixelStride2 = plane3.getPixelStride();
        int i5 = 0;
        int iLimit = buffer.limit();
        int iLimit2 = buffer2.limit();
        int iLimit3 = buffer3.limit();
        int i6 = c1757.f8829;
        int i7 = i;
        if (i6 != 1) {
            c = 1;
            fArr = i6 != 6 ? new float[]{1.402f, 0.344136f, 0.714136f, 1.772f} : new float[]{1.4746f, 0.16455f, 0.57135f, 1.8814f};
        } else {
            c = 1;
            fArr = new float[]{1.5748f, 0.1873f, 0.4681f, 1.8556f};
        }
        float f = fArr[0];
        float f2 = fArr[c];
        float f3 = fArr[2];
        float f4 = fArr[3];
        if (c1757.f8830 != 2) {
            c = 0;
        }
        float f5 = c != 0 ? 1.1643835f : 1.0f;
        float f6 = c != 0 ? 16.0f : 0.0f;
        float f7 = c != 0 ? 1.1383928f : 1.0f;
        int[] iArr = new int[i4 * i3];
        int i8 = 0;
        while (i8 < i3) {
            int i9 = i8 + i2;
            int i10 = i9 * rowStride;
            int i11 = i9 / 2;
            int i12 = i11 * rowStride2;
            int i13 = i11 * rowStride3;
            int i14 = i8;
            int i15 = i5;
            while (i15 < i4) {
                int i16 = i15 + i7;
                int i17 = i15;
                int i18 = i10 + i16;
                int i19 = i16 / 2;
                float f8 = f5;
                int i20 = (i19 * pixelStride) + i12;
                float f9 = f;
                int i21 = (i19 * pixelStride2) + i13;
                int i22 = i2;
                float f10 = ((i18 < iLimit ? buffer.get(i18) & 255 : i5) - f6) * f8;
                float f11 = ((i20 < iLimit2 ? buffer2.get(i20) & 255 : 128) - 128) * f7;
                float f12 = ((i21 < iLimit3 ? buffer3.get(i21) & 255 : 128) - 128) * f7;
                int i23 = (int) ((f9 * f12) + f10);
                int i24 = (int) ((f10 - (f2 * f11)) - (f12 * f3));
                int i25 = (int) ((f11 * f4) + f10);
                int i26 = i5;
                iArr[(i14 * i4) + i17] = AbstractC0598.m1487(i25, i26, 255) | (AbstractC0598.m1487(i24, i26, 255) << 8) | (AbstractC0598.m1487(i23, i26, 255) << 16) | (-16777216);
                i15 = i17 + 1;
                i5 = i26;
                iLimit = iLimit;
                i2 = i22;
                f = f9;
                f5 = f8;
            }
            i8 = i14 + 1;
            i5 = i5;
            iLimit = iLimit;
            f5 = f5;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i3, Bitmap.Config.ARGB_8888);
        AbstractC2328.m4341(-1733521387979630L);
        bitmapCreateBitmap.setPixels(iArr, 0, i4, 0, 0, i4, i3);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static Bitmap m2206(Image image, C1757 c1757) {
        try {
            if (image.getFormat() == 35) {
                return m2205(image, c1757);
            }
            C2701 c2701 = C2701.f13261;
            String str = AbstractC2328.m4341(-1733362474189678L) + image.getFormat();
            c2701.getClass();
            C2701.m4802(str);
            return null;
        } catch (Exception e) {
            Log.e(AbstractC2328.m4341(-1733409718829934L), AbstractC2328.m4341(-1733491323208558L), e);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(5:159|3|(1:5)(1:10)|11|147)|(4:62|63|(1:67)|(4:69|167|70|71)(6:72|73|(1:(4:150|75|(2:81|(5:172|83|(2:86|84)|175|87)(2:90|(6:92|(1:97)(1:96)|(1:99)(1:100)|(1:102)|103|174)(0)))(2:104|173)|105)(3:171|106|(1:108)(8:109|157|110|111|(1:114)|176|(4:121|161|122|123)|124)))|152|88|134))(2:15|(6:19|(1:58)|59|145|60|61)(3:20|21|(4:23|148|24|25)(12:(3:29|(1:31)(1:32)|(1:34))|35|163|36|(1:38)(1:39)|40|41|(4:48|169|49|50)|51|154|52|53)))|131|132|152|88|134|(2:(0)|(1:156))) */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ae  */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0934 m2207(String str, File file, ArrayList arrayList) {
        C0934 c0934;
        C1068 c1068;
        C2347 c2347M2273;
        int iIntValue;
        long j;
        long j2;
        int iIntValue2;
        Bitmap frameAtIndex;
        long j3;
        long j4;
        Integer numM1693;
        Bitmap bitmap;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                c1068 = new C1068(str);
                c2347M2273 = c1068.m2273();
                iIntValue = 1;
                j = 64000000;
                j2 = 0;
                iIntValue2 = 0;
                try {
                } catch (Exception e) {
                    e = e;
                    Log.e(AbstractC2328.m4341(-1733023171773294L), AbstractC2328.m4341(-1733104776151918L), e);
                    arrayList.add(AbstractC2328.m4341(-1733169200661358L) + e.getClass().getSimpleName() + AbstractC2328.m4341(-1733233625170798L) + e.getMessage());
                    file.delete();
                }
            } catch (Exception e2) {
                e = e2;
                c0934 = null;
            }
            if ((c2347M2273 != null ? c2347M2273.f11526 : 1) <= 1 && c1068.m2274() != null) {
                C0617.f2984.getClass();
                C1854 c1854M1512 = C0617.m1512(str);
                if (c1854M1512 == null || !c1854M1512.f9330) {
                    if (c1854M1512 != null) {
                        bitmap = c1854M1512.f9328;
                    }
                    arrayList.add(AbstractC2328.m4341(-1732185653150574L));
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused) {
                    }
                    return null;
                }
                bitmap = c1854M1512.f9328;
                if (((long) bitmap.getWidth()) * ((long) bitmap.getHeight()) > 64000000) {
                    bitmap.recycle();
                    arrayList.add(AbstractC2328.m4341(-1732314502169454L));
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused2) {
                    }
                    return null;
                }
                if (c2347M2273 != null) {
                    int[] iArr = c2347M2273.f11527;
                    Integer numValueOf = iArr.length == 0 ? null : Integer.valueOf(iArr[0]);
                    if (numValueOf != null) {
                        iIntValue2 = numValueOf.intValue();
                    }
                }
                int i = iIntValue2;
                try {
                    if (m2208(Collections.singletonList(bitmap), new int[]{i < 20 ? 100 : i}, file) && file.exists() && file.length() != 0) {
                        C0934 c09342 = new C0934(file.getPath(), 1, 8, null, true);
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Exception unused3) {
                        }
                        return c09342;
                    }
                    file.delete();
                    arrayList.add(AbstractC2328.m4341(-1732469120992110L));
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused4) {
                    }
                    return null;
                } finally {
                    bitmap.recycle();
                }
            }
            c0934 = null;
            mediaMetadataRetriever.setDataSource(str);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(27);
            if (strExtractMetadata != null && (numM1693 = AbstractC0733.m1693(strExtractMetadata)) != null) {
                iIntValue = numM1693.intValue();
            }
            if (iIntValue <= 0) {
                arrayList.add(AbstractC2328.m4341(-1732555020338030L));
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused5) {
                }
                return null;
            }
            C2336.f11496.m4354(AbstractC2328.m4341(-1732628034782062L) + iIntValue);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            long width = 0;
            int i2 = 0;
            while (true) {
                if (i2 < iIntValue) {
                    try {
                        try {
                            frameAtIndex = mediaMetadataRetriever.getImageAtIndex(i2);
                        } catch (Exception unused6) {
                            frameAtIndex = mediaMetadataRetriever.getFrameAtIndex(i2);
                        }
                    } catch (Exception unused7) {
                        frameAtIndex = null;
                    }
                    if (frameAtIndex != null) {
                        j3 = j;
                        j4 = j2;
                        width = (((long) frameAtIndex.getWidth()) * ((long) frameAtIndex.getHeight())) + width;
                        if (width > j3) {
                            frameAtIndex.recycle();
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                ((Bitmap) it.next()).recycle();
                            }
                            arrayList.add(AbstractC2328.m4341(-1732692459291502L));
                        } else {
                            arrayList2.add(frameAtIndex);
                            if (c2347M2273 != null) {
                                int[] iArr2 = c2347M2273.f11527;
                                Integer numValueOf2 = (i2 < 0 || i2 >= iArr2.length) ? null : Integer.valueOf(iArr2[i2]);
                                int iIntValue3 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                                if (iIntValue3 < 20) {
                                    iIntValue3 = 100;
                                }
                                arrayList3.add(Integer.valueOf(iIntValue3));
                            }
                        }
                    } else {
                        j3 = j;
                        j4 = j2;
                    }
                    i2++;
                    j = j3;
                    j2 = j4;
                } else {
                    long j5 = j2;
                    if (arrayList2.isEmpty()) {
                        arrayList.add(AbstractC2328.m4341(-1732847078114158L));
                    } else {
                        int size = arrayList2.size();
                        try {
                            if (m2208(arrayList2, AbstractC1595.m3268(arrayList3), file) && file.exists() && file.length() != j5) {
                                C0934 c09343 = new C0934(file.getPath(), size, 8, null, true);
                                try {
                                    mediaMetadataRetriever.release();
                                } catch (Exception unused8) {
                                }
                                return c09343;
                            }
                            file.delete();
                            arrayList.add(AbstractC2328.m4341(-1732937272427374L));
                        } finally {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                ((Bitmap) it2.next()).recycle();
                            }
                        }
                    }
                }
            }
            mediaMetadataRetriever.release();
            return c0934;
            Log.e(AbstractC2328.m4341(-1733023171773294L), AbstractC2328.m4341(-1733104776151918L), e);
            arrayList.add(AbstractC2328.m4341(-1733169200661358L) + e.getClass().getSimpleName() + AbstractC2328.m4341(-1733233625170798L) + e.getMessage());
            file.delete();
            mediaMetadataRetriever.release();
            return c0934;
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean m2208(List list, int[] iArr, File file) {
        int size;
        int i;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 65536);
        boolean z = false;
        try {
            try {
                C1383 c1383 = new C1383(bufferedOutputStream);
                BufferedOutputStream bufferedOutputStream2 = c1383.f6435;
                c1383.f6431 = 10;
                boolean zM2204 = m2204(list);
                c1383.f6440 = zM2204;
                if (zM2204) {
                    c1383.f6433 = 2;
                }
                C1383.m2795(c1383, list);
                try {
                    byte[] bytes = AbstractC2328.m4341(-1734341726733166L).getBytes(AbstractC0347.f1806);
                    AbstractC2328.m4341(-1734629489541998L);
                    bufferedOutputStream2.write(bytes);
                    c1383.f6434 = true;
                    size = list.size();
                    i = 0;
                } catch (Exception unused) {
                }
                while (i < size) {
                    c1383.f6443 = (i < 0 || i >= iArr.length) ? 100 : iArr[i];
                    if (c1383.m2797((Bitmap) list.get(i))) {
                        i++;
                    }
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (Exception unused3) {
                    }
                    return false;
                }
                if (c1383.f6434) {
                    try {
                        bufferedOutputStream2.write(59);
                        bufferedOutputStream2.flush();
                        c1383.f6434 = false;
                        c1383.f6442 = true;
                        z = true;
                    } catch (Exception unused4) {
                    }
                }
            } finally {
            }
        } catch (Exception e) {
            Log.e(AbstractC2328.m4341(-1733598697390958L), AbstractC2328.m4341(-1733680301769582L), e);
        }
        try {
            bufferedOutputStream.close();
        } catch (Exception unused5) {
        }
        try {
            fileOutputStream.close();
        } catch (Exception unused6) {
        }
        return z;
    }
}
