package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class za0 {

    /* JADX INFO: renamed from: a */
    public static final za0 f7856a = new za0();

    /* JADX INFO: renamed from: b */
    private static final String f7857b = "LivePhotoCreator";

    /* JADX INFO: renamed from: c */
    public static final int f7858c = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private za0() {
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: a */
    private final boolean m5468a(File file, File file2) throws Throwable {
        Bitmap bitmapDecodeFile;
        Bitmap bitmap = null;
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
            if (bitmapDecodeFile == null) {
                return false;
            }
            try {
                Bitmap bitmapM5470d = m5470d(file, bitmapDecodeFile);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    boolean zCompress = bitmapM5470d.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
                    fileOutputStream.close();
                    if (bitmapM5470d != bitmapDecodeFile && !bitmapM5470d.isRecycled()) {
                        bitmapM5470d.recycle();
                    }
                    if (!bitmapDecodeFile.isRecycled()) {
                        bitmapDecodeFile.recycle();
                    }
                    return zCompress;
                } finally {
                }
            } catch (Exception unused) {
                if (0 != 0 && null != bitmapDecodeFile && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                if (bitmapDecodeFile != null && !bitmapDecodeFile.isRecycled()) {
                    bitmapDecodeFile.recycle();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                if (0 != 0 && null != bitmapDecodeFile && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                if (bitmapDecodeFile != null && !bitmapDecodeFile.isRecycled()) {
                    bitmapDecodeFile.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            bitmapDecodeFile = null;
        } catch (Throwable th2) {
            th = th2;
            bitmapDecodeFile = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    private final void m5469b(File file, File file2) {
        try {
            ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
            ExifInterface exifInterface2 = new ExifInterface(file2.getAbsolutePath());
            String[] strArr = {"Make", "Model", "DateTime", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "ExposureTime", "FNumber", "ISOSpeedRatings", "FocalLength", "FocalLengthIn35mmFilm", "ExposureMode", "Flash", "MeteringMode", "WhiteBalance", "ColorSpace", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSAltitude", "GPSAltitudeRef", "Software", "ImageDescription"};
            for (int i = 0; i < 25; i++) {
                String str = strArr[i];
                String attribute = exifInterface.getAttribute(str);
                if (attribute != null) {
                    exifInterface2.setAttribute(str, attribute);
                }
            }
            exifInterface2.setAttribute("Orientation", "1");
            exifInterface2.saveAttributes();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    private final Bitmap m5470d(File file, Bitmap bitmap) {
        try {
            int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 1);
            if (attributeInt != 0 && attributeInt != 1) {
                Matrix matrix = new Matrix();
                switch (attributeInt) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setScale(1.0f, -1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 6:
                        matrix.setRotate(90.0f);
                        break;
                    case 7:
                        matrix.setRotate(270.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 8:
                        matrix.setRotate(270.0f);
                        break;
                }
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    bitmapCreateBitmap.getClass();
                    return bitmapCreateBitmap;
                } catch (Exception unused) {
                    return bitmap;
                }
            }
        } catch (Exception unused2) {
        }
        return bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m5471c(Context context, File file, File file2, File file3) throws Throwable {
        File file4;
        Constructor<?> constructor;
        Method method;
        context.getClass();
        file.getClass();
        file2.getClass();
        file3.getClass();
        File file5 = null;
        try {
            try {
                file4 = new File(file3.getParentFile(), file3.getName() + ".tmp.jpg");
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            if (!m5468a(file, file4)) {
                lb0.f3404a.m2019h(f7857b, "convertToJpeg failed");
                file4.delete();
                return false;
            }
            AbstractC0627pt.m3154a0(file4, file3);
            file4.delete();
            m5469b(file, file3);
            Class<?> clsM5631m = C1021zy.f8036a.m5631m();
            if (clsM5631m == null) {
                lb0.f3404a.m2014a(f7857b, "impl not found");
                return false;
            }
            Constructor<?>[] constructors = clsM5631m.getConstructors();
            constructors.getClass();
            int length = constructors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == 2 && constructor.getParameterTypes()[0].isAssignableFrom(context.getClass()) && p30.m3002l(constructor.getParameterTypes()[1], String.class)) {
                    break;
                }
                i++;
            }
            if (constructor == null) {
                lb0.f3404a.m2014a(f7857b, "ctor mismatch");
                return false;
            }
            Object objNewInstance = constructor.newInstance(context, file3.getAbsolutePath());
            FileInputStream fileInputStream = new FileInputStream(file2);
            Method[] methods = objNewInstance.getClass().getMethods();
            methods.getClass();
            int length2 = methods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    method = null;
                    break;
                }
                method = methods[i2];
                if (p30.m3002l(method.getName(), "setVideoData") && method.getParameterTypes().length == 5) {
                    break;
                }
                i2++;
            }
            if (method == null) {
                lb0.f3404a.m2014a(f7857b, "method not found");
                fileInputStream.close();
                return false;
            }
            Object objInvoke = method.invoke(objNewInstance, fileInputStream, "video/mp4", 0L, "xhs", Boolean.TRUE);
            fileInputStream.close();
            if (!p30.m3002l(objInvoke, 0)) {
                lb0.f3404a.m2017e(f7857b, "result=" + objInvoke);
            }
            return p30.m3002l(objInvoke, 0);
        } catch (Exception e2) {
            e = e2;
            file5 = file4;
            lb0.f3404a.m2014a(f7857b, e.getClass().getSimpleName() + ": " + e.getMessage());
            file3.delete();
            if (file5 != null) {
                file5.delete();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            file5 = file4;
            if (file5 != null) {
                file5.delete();
            }
            throw th;
        }
    }
}
