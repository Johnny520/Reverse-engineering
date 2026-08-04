package yyds;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C0039;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: yyds.ᲈᛷᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2707 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final C2120 f13279;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final C2120 f13280;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final ArrayDeque f13282;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final C1586 f13283;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C0434 f13285 = C0434.m1208();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2587 f13286;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final DisplayMetrics f13287;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2267 f13288;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ArrayList f13289;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C2120 f13284 = C2120.m4039(EnumC1896.f9603, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C2120 f13281 = new C2120("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C2120.f10466);

    static {
        C1268 c1268 = C1268.f5841;
        Boolean bool = Boolean.FALSE;
        f13279 = C2120.m4039(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f13280 = C2120.m4039(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f13283 = new C1586();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        f13282 = new ArrayDeque(0);
    }

    public C2707(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC2587 interfaceC2587, C2267 c2267) {
        this.f13289 = arrayList;
        AbstractC0319.m992(displayMetrics, "Argument must not be null");
        this.f13287 = displayMetrics;
        AbstractC0319.m992(interfaceC2587, "Argument must not be null");
        this.f13286 = interfaceC2587;
        AbstractC0319.m992(c2267, "Argument must not be null");
        this.f13288 = c2267;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static IOException m4813(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m4816(options.inBitmap), illegalArgumentException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r1;
     */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m4814(C0644 c0644, BitmapFactory.Options options, InterfaceC2614 interfaceC2614, InterfaceC2587 interfaceC2587) {
        if (!options.inJustDecodeBounds) {
            interfaceC2614.mo543();
            switch (c0644.f3100) {
                case 18:
                    C0839 c0839 = (C0839) ((C2014) c0644.f3099).f10074;
                    synchronized (c0839) {
                        c0839.f3863 = c0839.f3865.length;
                        break;
                    }
                    break;
            }
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = AbstractC2663.f13070;
        lock.lock();
        try {
            try {
                Bitmap bitmapM1555 = c0644.m1555(options);
                lock.unlock();
                return bitmapM1555;
            } catch (IllegalArgumentException e) {
                IOException iOExceptionM4813 = m4813(e, i, i2, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOExceptionM4813);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionM4813;
                }
                try {
                    interfaceC2587.mo1856(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapM4814 = m4814(c0644, options, interfaceC2614, interfaceC2587);
                    AbstractC2663.f13070.unlock();
                    return bitmapM4814;
                } catch (IOException unused) {
                    throw iOExceptionM4813;
                }
            }
        } catch (Throwable th) {
            AbstractC2663.f13070.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static void m4815(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static String m4816(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0656 m4817(C0644 c0644, int i, int i2, C0822 c0822, InterfaceC2614 interfaceC2614) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f13288.m4272(byte[].class, 65536);
        synchronized (C2707.class) {
            arrayDeque = f13282;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m4815(options);
            }
        }
        options.inTempStorage = bArr;
        EnumC1896 enumC1896 = (EnumC1896) c0822.m1891(f13284);
        EnumC1891 enumC1891 = (EnumC1891) c0822.m1891(f13281);
        C1268 c1268 = (C1268) c0822.m1891(C1268.f5842);
        boolean zBooleanValue = ((Boolean) c0822.m1891(f13279)).booleanValue();
        C2120 c2120 = f13280;
        try {
            C0656 c0656M1574 = C0656.m1574(m4818(c0644, options, c1268, enumC1896, enumC1891, c0822.m1891(c2120) != null && ((Boolean) c0822.m1891(c2120)).booleanValue(), i, i2, zBooleanValue, interfaceC2614), this.f13286);
            m4815(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.f13288.m4271(bArr);
            return c0656M1574;
        } catch (Throwable th) {
            m4815(options);
            ArrayDeque arrayDeque2 = f13282;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f13288.m4271(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Bitmap m4818(C0644 c0644, BitmapFactory.Options options, C1268 c1268, EnumC1896 enumC1896, EnumC1891 enumC1891, boolean z, int i, int i2, boolean z2, InterfaceC2614 interfaceC2614) throws Throwable {
        long j;
        String str;
        int iMo1930;
        int i3;
        boolean z3;
        int i4;
        int i5;
        int iRound;
        String str2;
        int i6;
        int i7;
        Bitmap bitmap;
        ColorSpace colorSpace;
        Bitmap.Config config;
        boolean zHasAlpha;
        String str3;
        int i8;
        int i9;
        int iFloor;
        int iFloor2;
        C0839 c0839;
        int i10;
        int i11 = AbstractC1382.f6429;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        InterfaceC2587 interfaceC2587 = this.f13286;
        m4814(c0644, options, interfaceC2614, interfaceC2587);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i12 = iArr[0];
        int i13 = iArr[1];
        String str4 = options.outMimeType;
        boolean z4 = (i12 == -1 || i13 == -1) ? false : z;
        C0839 c08392 = null;
        switch (c0644.f3100) {
            case 17:
                j = jElapsedRealtimeNanos;
                str = str4;
                ArrayList arrayList = (ArrayList) c0644.f3102;
                ByteBuffer byteBufferM931 = AbstractC0282.m931((ByteBuffer) c0644.f3099);
                C2267 c2267 = (C2267) c0644.f3101;
                if (byteBufferM931 != null) {
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        ArrayList arrayList2 = arrayList;
                        try {
                            iMo1930 = ((InterfaceC0849) arrayList.get(i14)).mo1930(byteBufferM931, c2267);
                            C2267 c22672 = c2267;
                            if (iMo1930 == -1) {
                                i14++;
                                arrayList = arrayList2;
                                c2267 = c22672;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    iMo1930 = -1;
                } else {
                    iMo1930 = -1;
                }
                break;
            case 18:
                j = jElapsedRealtimeNanos;
                str = str4;
                ArrayList arrayList3 = (ArrayList) c0644.f3101;
                C0839 c08393 = (C0839) ((C2014) c0644.f3099).f10074;
                c08393.reset();
                iMo1930 = AbstractC1741.m3464(arrayList3, c08393, (C2267) c0644.f3102);
                break;
            default:
                ArrayList arrayList4 = (ArrayList) c0644.f3102;
                j = jElapsedRealtimeNanos;
                C0039 c0039 = (C0039) c0644.f3101;
                C2267 c22673 = (C2267) c0644.f3099;
                int size2 = arrayList4.size();
                str = str4;
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        iMo1930 = -1;
                    } else {
                        ArrayList arrayList5 = arrayList4;
                        InterfaceC0849 interfaceC0849 = (InterfaceC0849) arrayList4.get(i15);
                        int i16 = size2;
                        try {
                            i10 = i15;
                            c0839 = new C0839(new FileInputStream(c0039.m243().getFileDescriptor()), c22673);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            iMo1930 = interfaceC0849.mo1925(c0839, c22673);
                            c0839.m1921();
                            c0039.m243();
                            if (iMo1930 == -1) {
                                i15 = i10 + 1;
                                size2 = i16;
                                arrayList4 = arrayList5;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c08392 = c0839;
                            if (c08392 != null) {
                                c08392.m1921();
                            }
                            c0039.m243();
                            throw th;
                        }
                    }
                    break;
                }
                break;
        }
        int i17 = iMo1930;
        switch (i17) {
            case 3:
            case 4:
                i3 = 180;
                break;
            case 5:
            case 6:
                i3 = 90;
                break;
            case 7:
            case 8:
                i3 = 270;
                break;
            default:
                i3 = 0;
                break;
        }
        switch (i17) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        if (i == Integer.MIN_VALUE) {
            if (i3 != 90) {
                i4 = 270;
                if (i3 != 270) {
                    i5 = i17;
                    iRound = i12;
                }
            } else {
                i4 = 270;
            }
            i5 = i17;
            iRound = i13;
        } else {
            i4 = 270;
            i5 = i17;
            iRound = i;
        }
        int iRound2 = i2 == Integer.MIN_VALUE ? (i3 == 90 || i3 == i4) ? i12 : i13 : i2;
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM1552 = c0644.m1552();
        String str5 = ", density: ";
        boolean z5 = z3;
        if (i12 <= 0 || i13 <= 0) {
            str2 = ", target density: ";
            i6 = i13;
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM1552 + " with target [" + iRound + "x" + iRound2 + "]");
            }
        } else {
            if (i3 == 90 || i3 == 270) {
                str3 = ", density: ";
                i8 = i13;
                i9 = i12;
            } else {
                str3 = ", density: ";
                i9 = i13;
                i8 = i12;
            }
            float fM2542 = c1268.m2542(i8, i9, iRound, iRound2);
            if (fM2542 <= 0.0f) {
                throw new IllegalArgumentException("Cannot scale with factor: " + fM2542 + " from: " + c1268 + ", source: [" + i12 + "x" + i13 + "], target: [" + iRound + "x" + iRound2 + "]");
            }
            int iM2541 = c1268.m2541(i8, i9, iRound, iRound2);
            if (iM2541 == 0) {
                C0188.m798("Cannot round with null rounding");
                return null;
            }
            int i18 = i3;
            float f = i8;
            int i19 = i8;
            int i20 = (int) (((double) (fM2542 * f)) + 0.5d);
            float f2 = i9;
            int i21 = i19 / i20;
            int i22 = i9 / ((int) (((double) (fM2542 * f2)) + 0.5d));
            int iMax = Math.max(1, Integer.highestOneBit(iM2541 == 1 ? Math.max(i21, i22) : Math.min(i21, i22)));
            if (iM2541 == 1 && iMax < 1.0f / fM2542) {
                iMax <<= 1;
            }
            options.inSampleSize = iMax;
            if (imageHeaderParser$ImageTypeM1552 == ImageHeaderParser$ImageType.JPEG) {
                float fMin = Math.min(iMax, 8);
                iFloor = (int) Math.ceil(f / fMin);
                iFloor2 = (int) Math.ceil(f2 / fMin);
                int i23 = iMax / 8;
                if (i23 > 0) {
                    iFloor /= i23;
                    iFloor2 /= i23;
                }
            } else if (imageHeaderParser$ImageTypeM1552 == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeM1552 == ImageHeaderParser$ImageType.PNG_A) {
                float f3 = iMax;
                iFloor = (int) Math.floor(f / f3);
                iFloor2 = (int) Math.floor(f2 / f3);
            } else if (imageHeaderParser$ImageTypeM1552.isWebp()) {
                float f4 = iMax;
                iFloor = Math.round(f / f4);
                iFloor2 = Math.round(f2 / f4);
            } else if (i19 % iMax == 0 && i9 % iMax == 0) {
                int i24 = i9 / iMax;
                iFloor = i19 / iMax;
                iFloor2 = i24;
            } else {
                options.inJustDecodeBounds = true;
                m4814(c0644, options, interfaceC2614, interfaceC2587);
                options.inJustDecodeBounds = false;
                int[] iArr2 = {options.outWidth, options.outHeight};
                int i25 = iArr2[0];
                iFloor2 = iArr2[1];
                iFloor = i25;
            }
            double dM2542 = c1268.m2542(iFloor, iFloor2, iRound, iRound2);
            int iRound3 = (int) Math.round((dM2542 <= 1.0d ? dM2542 : 1.0d / dM2542) * 2.147483647E9d);
            int i26 = (int) ((((double) iRound3) * dM2542) + 0.5d);
            options.inTargetDensity = (int) (((dM2542 / ((double) (i26 / iRound3))) * ((double) i26)) + 0.5d);
            int iRound4 = (int) Math.round((dM2542 <= 1.0d ? dM2542 : 1.0d / dM2542) * 2.147483647E9d);
            options.inDensity = iRound4;
            int i27 = options.inTargetDensity;
            if (i27 <= 0 || iRound4 <= 0 || i27 == iRound4) {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            } else {
                options.inScaled = true;
            }
            if (Log.isLoggable("Downsampler", 2)) {
                StringBuilder sb = new StringBuilder("Calculate scaling, source: [");
                sb.append(i12);
                sb.append("x");
                i6 = i13;
                sb.append(i6);
                sb.append("], degreesToRotate: ");
                sb.append(i18);
                sb.append(", target: [");
                sb.append(iRound);
                sb.append("x");
                sb.append(iRound2);
                sb.append("], power of two scaled: [");
                sb.append(iFloor);
                sb.append("x");
                sb.append(iFloor2);
                sb.append("], exact scale factor: ");
                sb.append(fM2542);
                sb.append(", power of 2 sample size: ");
                sb.append(iMax);
                sb.append(", adjusted scale factor: ");
                sb.append(dM2542);
                str2 = ", target density: ";
                sb.append(str2);
                sb.append(options.inTargetDensity);
                str5 = str3;
                sb.append(str5);
                sb.append(options.inDensity);
                Log.v("Downsampler", sb.toString());
            } else {
                str5 = str3;
                str2 = ", target density: ";
                i6 = i13;
            }
        }
        boolean zM1209 = this.f13285.m1209(iRound, iRound2, z4, z5);
        if (zM1209) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        if (!zM1209) {
            if (enumC1896 != EnumC1896.f9604) {
                try {
                    zHasAlpha = c0644.m1552().hasAlpha();
                } catch (IOException e) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC1896, e);
                    }
                    zHasAlpha = false;
                }
                Bitmap.Config config2 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config2;
                if (config2 == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                }
            } else {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
        }
        if (i12 < 0 || i6 < 0 || !z2) {
            int i28 = options.inTargetDensity;
            float f5 = (i28 <= 0 || (i7 = options.inDensity) <= 0 || i28 == i7) ? 1.0f : i28 / i7;
            int i29 = options.inSampleSize;
            float f6 = i29;
            int iCeil = (int) Math.ceil(i12 / f6);
            int iCeil2 = (int) Math.ceil(i6 / f6);
            iRound = Math.round(iCeil * f5);
            iRound2 = Math.round(iCeil2 * f5);
            if (Log.isLoggable("Downsampler", 2)) {
                Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i12 + "x" + i6 + "], sampleSize: " + i29 + ", targetDensity: " + options.inTargetDensity + str5 + options.inDensity + ", density multiplier: " + f5);
            }
        }
        if (iRound > 0 && iRound2 > 0 && (config = options.inPreferredConfig) != Bitmap.Config.HARDWARE) {
            Bitmap.Config config3 = options.outConfig;
            if (config3 != null) {
                config = config3;
            }
            options.inBitmap = interfaceC2587.mo1863(iRound, iRound2, config);
        }
        if (enumC1891 != null) {
            options.inPreferredColorSpace = ColorSpace.get((enumC1891 == EnumC1891.f9531 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        }
        Bitmap bitmapM4814 = m4814(c0644, options, interfaceC2614, interfaceC2587);
        interfaceC2614.mo569(bitmapM4814, interfaceC2587);
        if (bitmapM4814 != null && i12 > 0 && i6 > 0 && Log.isLoggable("GlideMemoryTracking", 3)) {
            AbstractC0181.m740("Downsampler", c1268.getClass().getSimpleName(), bitmapM4814, i12, i6);
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Decoded " + m4816(bitmapM4814) + " from [" + i12 + "x" + i6 + "] " + str + " with inBitmap " + m4816(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str5 + options.inDensity + str2 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC1382.m2794(j));
        }
        if (bitmapM4814 == null) {
            return null;
        }
        bitmapM4814.setDensity(this.f13287.densityDpi);
        switch (i5) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                Matrix matrix = new Matrix();
                switch (i5) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 6:
                        matrix.setRotate(90.0f);
                        break;
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 8:
                        matrix.setRotate(-90.0f);
                        break;
                }
                bitmapM4814 = Bitmap.createBitmap(bitmapM4814, 0, 0, bitmapM4814.getWidth(), bitmapM4814.getHeight(), matrix, true);
                bitmap = bitmapM4814;
                break;
            default:
                bitmap = bitmapM4814;
                break;
        }
        if (!bitmap.equals(bitmapM4814)) {
            interfaceC2587.mo1856(bitmap);
        }
        return bitmapM4814;
    }
}
