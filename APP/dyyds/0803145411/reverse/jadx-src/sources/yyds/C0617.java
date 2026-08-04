package yyds;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛳᛶᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0617 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0617 f2984;

    static {
        AbstractC2328.m4341(-1735441238360942L);
        f2984 = new C0617();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m1511(Bitmap bitmap, C0471 c0471) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width];
        bitmap.setHasAlpha(true);
        int i = 0;
        while (i < height) {
            Bitmap bitmap2 = bitmap;
            bitmap2.getPixels(iArr, 0, width, 0, i, width, 1);
            for (int i2 = 0; i2 < width; i2++) {
                int i3 = c0471.f2366[(i * width) + i2] & 255;
                C0980 c0980 = C0980.f4487;
                int i4 = c0471.f2367;
                c0980.getClass();
                int iM1487 = AbstractC0598.m1487(i3, 0, 255) - AbstractC0598.m1487(i4, 0, 255);
                if (iM1487 < 0) {
                    iM1487 = 0;
                }
                iArr[i2] = (iM1487 << 24) | (iArr[i2] & 16777215);
            }
            bitmap2.setPixels(iArr, 0, width, 0, i, width, 1);
            i++;
            bitmap = bitmap2;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static C1854 m1512(String str) throws IOException {
        Bitmap bitmapDecodeBitmap;
        long j;
        C2792 c2792M2267;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        C2443 c2443M2268;
        File file;
        RandomAccessFile randomAccessFile;
        Throwable th;
        Object next6;
        Object next7;
        AbstractC2328.m4341(-1734689619084142L);
        File file2 = new File(str);
        C0404 c0404 = null;
        if (file2.isFile()) {
            try {
                ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(file2);
                AbstractC2328.m4341(-1735093346009966L);
                bitmapDecodeBitmap = ImageDecoder.decodeBitmap(sourceCreateSource, new C1146());
            } catch (Throwable th2) {
                Log.w(AbstractC2328.m4341(-1735170655421294L), AbstractC2328.m4341(-1735243669865326L) + file2.getPath(), th2);
                bitmapDecodeBitmap = null;
            }
            if (bitmapDecodeBitmap != null) {
                C1068 c1068 = new C1068(str);
                String str2 = c1068.f4884;
                C0343 c0343M2274 = c1068.m2274();
                if (c0343M2274 == null) {
                    return new C1854(bitmapDecodeBitmap, false, false);
                }
                if (!c0343M2274.f1796) {
                    return new C1854(bitmapDecodeBitmap, true, false);
                }
                try {
                    file = new File(str2);
                } catch (Throwable unused) {
                    j = 4;
                }
                if (file.isFile()) {
                    try {
                        randomAccessFile = new RandomAccessFile(file, AbstractC2328.m4341(-1726563540960110L));
                    } catch (Throwable unused2) {
                    }
                    try {
                        Iterator it = C1068.m2263(randomAccessFile, 0L, randomAccessFile.length()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next6 = null;
                                break;
                            }
                            try {
                                next6 = it.next();
                                if (((C0794) next6).f3649.equals(AbstractC2328.m4341(-1726572130894702L))) {
                                    break;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                j = 4;
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    AbstractC1367.m2774(randomAccessFile, th);
                                    throw th4;
                                }
                            }
                        }
                        C0794 c0794 = (C0794) next6;
                        if (c0794 == null) {
                            randomAccessFile.close();
                            c2792M2267 = null;
                            j = 4;
                        } else {
                            j = 4;
                            try {
                                if (C1068.m2262(c0794.f3652, 4L, c0794.f3648)) {
                                    Iterator it2 = C1068.m2263(randomAccessFile, c0794.f3652 + 4, c0794.f3648).iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            next7 = null;
                                            break;
                                        }
                                        next7 = it2.next();
                                        if (((C0794) next7).f3649.equals(AbstractC2328.m4341(-1726593605731182L))) {
                                            break;
                                        }
                                    }
                                    C0794 c07942 = (C0794) next7;
                                    if (c07942 == null) {
                                        randomAccessFile.close();
                                    } else {
                                        c2792M2267 = C1068.m2267(randomAccessFile, c07942);
                                        randomAccessFile.close();
                                    }
                                } else {
                                    randomAccessFile.close();
                                }
                                c2792M2267 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                th = th;
                                throw th;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        j = 4;
                    }
                } else {
                    c2792M2267 = null;
                    j = 4;
                }
                if (c2792M2267 != null) {
                    int i = c2792M2267.f13651;
                    int i2 = c0343M2274.f1794;
                    if (i == i2) {
                        int i3 = c0343M2274.f1795;
                        if (i2 > 0 && i3 > 0 && i2 != i3) {
                            try {
                                File file3 = new File(str2);
                                if (file3.isFile()) {
                                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file3, AbstractC2328.m4341(-1726615080567662L));
                                    try {
                                        Iterator it3 = C1068.m2263(randomAccessFile2, 0L, randomAccessFile2.length()).iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it3.next();
                                            if (((C0794) next).f3649.equals(AbstractC2328.m4341(-1726623670502254L))) {
                                                break;
                                            }
                                        }
                                        C0794 c07943 = (C0794) next;
                                        if (c07943 != null && C1068.m2262(c07943.f3652, 4L, c07943.f3648)) {
                                            List listM2263 = C1068.m2263(randomAccessFile2, c07943.f3652 + j, c07943.f3648);
                                            Iterator it4 = listM2263.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    next2 = null;
                                                    break;
                                                }
                                                next2 = it4.next();
                                                if (((C0794) next2).f3649.equals(AbstractC2328.m4341(-1726645145338734L))) {
                                                    break;
                                                }
                                            }
                                            C0794 c07944 = (C0794) next2;
                                            if (c07944 != null && C1068.m2272(randomAccessFile2, c07944, i3)) {
                                                Iterator it5 = listM2263.iterator();
                                                while (true) {
                                                    if (!it5.hasNext()) {
                                                        next3 = null;
                                                        break;
                                                    }
                                                    next3 = it5.next();
                                                    if (((C0794) next3).f3649.equals(AbstractC2328.m4341(-1726666620175214L))) {
                                                        break;
                                                    }
                                                }
                                                C0794 c07945 = (C0794) next3;
                                                if (c07945 == null) {
                                                    randomAccessFile2.close();
                                                } else {
                                                    Iterator it6 = listM2263.iterator();
                                                    while (true) {
                                                        if (!it6.hasNext()) {
                                                            next4 = null;
                                                            break;
                                                        }
                                                        next4 = it6.next();
                                                        if (((C0794) next4).f3649.equals(AbstractC2328.m4341(-1726688095011694L))) {
                                                            break;
                                                        }
                                                    }
                                                    ArrayList arrayListM2266 = C1068.m2266(randomAccessFile2, c07945, i3, (C0794) next4);
                                                    if (arrayListM2266 == null || arrayListM2266.isEmpty()) {
                                                        randomAccessFile2.close();
                                                    } else {
                                                        Iterator it7 = listM2263.iterator();
                                                        while (true) {
                                                            if (!it7.hasNext()) {
                                                                next5 = null;
                                                                break;
                                                            }
                                                            next5 = it7.next();
                                                            if (((C0794) next5).f3649.equals(AbstractC2328.m4341(-1726709569848174L))) {
                                                                break;
                                                            }
                                                        }
                                                        C0794 c07946 = (C0794) next5;
                                                        if (c07946 == null || (c2443M2268 = C1068.m2268(randomAccessFile2, c07946, i3, i2)) == null) {
                                                            randomAccessFile2.close();
                                                        } else {
                                                            C0404 c04042 = new C0404(i3, arrayListM2266, c2443M2268.f12021, c2443M2268.f12022, c2443M2268.f12023, c2443M2268.f12024, c2443M2268.f12020);
                                                            randomAccessFile2.close();
                                                            c0404 = c04042;
                                                        }
                                                    }
                                                }
                                            } else {
                                                randomAccessFile2.close();
                                            }
                                        } else {
                                            randomAccessFile2.close();
                                        }
                                    } finally {
                                    }
                                }
                            } catch (Throwable unused3) {
                            }
                        }
                        if (c0404 == null) {
                            return new C1854(bitmapDecodeBitmap, true, false);
                        }
                        if (c0404.f2130 != bitmapDecodeBitmap.getWidth() || c0404.f2132 != bitmapDecodeBitmap.getHeight()) {
                            return new C1854(bitmapDecodeBitmap, true, false);
                        }
                        try {
                            C0980 c0980 = C0980.f4487;
                            int width = bitmapDecodeBitmap.getWidth();
                            int height = bitmapDecodeBitmap.getHeight();
                            c0980.getClass();
                            C0471 c0471M2129 = C0980.m2129(file2, c0404, width, height);
                            if (c0471M2129 == null) {
                                return new C1854(bitmapDecodeBitmap, true, false);
                            }
                            if (c0471M2129.f2364 == bitmapDecodeBitmap.getWidth() && c0471M2129.f2365 == bitmapDecodeBitmap.getHeight()) {
                                m1511(bitmapDecodeBitmap, c0471M2129);
                                return new C1854(bitmapDecodeBitmap, true, true);
                            }
                            Log.w(AbstractC2328.m4341(-1734732568757102L), AbstractC2328.m4341(-1734805583201134L) + bitmapDecodeBitmap.getWidth() + 'x' + bitmapDecodeBitmap.getHeight() + AbstractC2328.m4341(-1734900072481646L) + c0471M2129.f2364 + 'x' + c0471M2129.f2365);
                            return new C1854(bitmapDecodeBitmap, true, false);
                        } catch (Throwable th7) {
                            Log.w(AbstractC2328.m4341(-1734938727187310L), AbstractC2328.m4341(-1735011741631342L), th7);
                            return new C1854(bitmapDecodeBitmap, true, false);
                        }
                    }
                }
                return new C1854(bitmapDecodeBitmap, true, false);
            }
        }
        return null;
    }
}
