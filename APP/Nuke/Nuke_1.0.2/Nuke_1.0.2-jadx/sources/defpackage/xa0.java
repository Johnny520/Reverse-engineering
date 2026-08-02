package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.a;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.locks.Lock;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xa0 {
    public static final mv1 f = mv1.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", s40.j);
    public static final mv1 g = new mv1("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, mv1.e);
    public static final mv1 h;
    public static final mv1 i;
    public static final eb j;
    public static final ArrayDeque k;
    public final zk a;
    public final DisplayMetrics b;
    public final td1 c;
    public final ArrayList d;
    public final ds0 e = ds0.a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        va0 va0Var = va0.b;
        Boolean bool = Boolean.FALSE;
        h = mv1.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        i = mv1.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        j = new eb(17);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = b93.a;
        k = new ArrayDeque(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xa0(ArrayList arrayList, DisplayMetrics displayMetrics, zk zkVar, td1 td1Var) {
        this.d = arrayList;
        fg1.q("Argument must not be null", displayMetrics);
        this.b = displayMetrics;
        fg1.q("Argument must not be null", zkVar);
        this.a = zkVar;
        fg1.q("Argument must not be null", td1Var);
        this.c = td1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(b5 b5Var, BitmapFactory.Options options, wa0 wa0Var, zk zkVar) {
        if (!options.inJustDecodeBounds) {
            wa0Var.p();
            switch (b5Var.h) {
                case 15:
                    r62 r62Var = (r62) ((n4) b5Var.i).i;
                    synchronized (r62Var) {
                        r62Var.j = r62Var.h.length;
                        break;
                    }
                    break;
            }
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = p33.d;
        lock.lock();
        try {
            try {
                Bitmap bitmapO = b5Var.o(options);
                lock.unlock();
                return bitmapO;
            } catch (IllegalArgumentException e) {
                StringBuilder sbK = hk1.k("Exception decoding bitmap, outWidth: ", i2, i3, ", outHeight: ", ", outMimeType: ");
                sbK.append(str);
                sbK.append(", inBitmap: ");
                sbK.append(d(options.inBitmap));
                IOException iOException = new IOException(sbK.toString(), e);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    zkVar.h(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapC = c(b5Var, options, wa0Var, zkVar);
                    p33.d.unlock();
                    return bitmapC;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th) {
            p33.d.unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(BitmapFactory.Options options) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final al a(b5 b5Var, int i2, int i3, ov1 ov1Var, wa0 wa0Var) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.c.c(65536, byte[].class);
        synchronized (xa0.class) {
            arrayDeque = k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        s40 s40Var = (s40) ov1Var.c(f);
        n22 n22Var = (n22) ov1Var.c(g);
        va0 va0Var = (va0) ov1Var.c(va0.g);
        boolean zBooleanValue = ((Boolean) ov1Var.c(h)).booleanValue();
        mv1 mv1Var = i;
        try {
            al alVarC = al.c(this.a, b(b5Var, options, va0Var, s40Var, n22Var, ov1Var.c(mv1Var) != null && ((Boolean) ov1Var.c(mv1Var)).booleanValue(), i2, i3, zBooleanValue, wa0Var));
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.c.g(bArr);
            return alVarC;
        } catch (Throwable th) {
            e(options);
            ArrayDeque arrayDeque2 = k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.c.g(bArr);
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[CONST, INVOKE, CHECK_CAST, CONST] complete}, expected: {[CONST, INVOKE, CHECK_CAST] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(b5 b5Var, BitmapFactory.Options options, va0 va0Var, s40 s40Var, n22 n22Var, boolean z, int i2, int i3, boolean z2, wa0 wa0Var) throws Throwable {
        long j2;
        String str;
        int iD;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int iRound;
        String str2;
        int i7;
        boolean zC;
        boolean zHasAlpha;
        boolean z4;
        zk zkVar;
        int iRound2;
        int i8;
        Bitmap bitmapC;
        Bitmap bitmap;
        ColorSpace colorSpace;
        Bitmap.Config config;
        Bitmap.Config config2;
        String str3;
        int i9;
        int i10;
        int iFloor;
        int iFloor2;
        r62 r62Var;
        int i11;
        int i12 = tc1.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        zk zkVar2 = this.a;
        c(b5Var, options, wa0Var, zkVar2);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i13 = iArr[0];
        int i14 = iArr[1];
        String str4 = options.outMimeType;
        boolean z5 = (i13 == -1 || i14 == -1) ? false : z;
        r62 r62Var2 = null;
        switch (b5Var.h) {
            case 14:
                j2 = jElapsedRealtimeNanos;
                str = str4;
                List list = (List) b5Var.j;
                ByteBuffer byteBufferC = lo.c((ByteBuffer) b5Var.i);
                td1 td1Var = (td1) b5Var.k;
                if (byteBufferC != null) {
                    int size = list.size();
                    int i15 = 0;
                    while (i15 < size) {
                        List list2 = list;
                        try {
                            iD = ((kx0) list.get(i15)).d(byteBufferC, td1Var);
                            td1 td1Var2 = td1Var;
                            if (iD == -1) {
                                i15++;
                                list = list2;
                                td1Var = td1Var2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    iD = -1;
                } else {
                    iD = -1;
                }
                break;
            case 15:
                j2 = jElapsedRealtimeNanos;
                str = str4;
                List list3 = (List) b5Var.k;
                r62 r62Var3 = (r62) ((n4) b5Var.i).i;
                r62Var3.reset();
                iD = se.E(list3, r62Var3, (td1) b5Var.j);
                break;
            default:
                List list4 = (List) b5Var.j;
                j2 = jElapsedRealtimeNanos;
                a aVar = (a) b5Var.k;
                td1 td1Var3 = (td1) b5Var.i;
                int size2 = list4.size();
                str = str4;
                int i16 = 0;
                while (true) {
                    if (i16 >= size2) {
                        iD = -1;
                    } else {
                        List list5 = list4;
                        kx0 kx0Var = (kx0) list4.get(i16);
                        int i17 = size2;
                        try {
                            i11 = i16;
                            r62Var = new r62(new FileInputStream(aVar.a().getFileDescriptor()), td1Var3);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            iD = kx0Var.b(r62Var, td1Var3);
                            r62Var.c();
                            aVar.a();
                            if (iD == -1) {
                                i16 = i11 + 1;
                                size2 = i17;
                                list4 = list5;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r62Var2 = r62Var;
                            if (r62Var2 != null) {
                                r62Var2.c();
                            }
                            aVar.a();
                            throw th;
                        }
                    }
                    break;
                }
                break;
        }
        int i18 = iD;
        switch (i18) {
            case 3:
            case 4:
                i4 = 180;
                break;
            case 5:
            case AIChatConfig.DefaultContextRounds /* 6 */:
                i4 = 90;
                break;
            case 7:
            case 8:
                i4 = 270;
                break;
            default:
                i4 = 0;
                break;
        }
        switch (i18) {
            case 2:
            case 3:
            case 4:
            case 5:
            case AIChatConfig.DefaultContextRounds /* 6 */:
            case 7:
            case 8:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        if (i2 == Integer.MIN_VALUE) {
            if (i4 != 90) {
                i5 = 270;
                if (i4 != 270) {
                    i6 = i18;
                    iRound = i13;
                }
            } else {
                i5 = 270;
            }
            i6 = i18;
            iRound = i14;
        } else {
            i5 = 270;
            i6 = i18;
            iRound = i2;
        }
        int i19 = i3 == Integer.MIN_VALUE ? (i4 == 90 || i4 == i5) ? i13 : i14 : i3;
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeS = b5Var.s();
        String str5 = ", density: ";
        boolean z6 = z3;
        if (i13 <= 0 || i14 <= 0) {
            String str6 = "]";
            str2 = ", target density: ";
            i7 = i14;
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeS + " with target [" + iRound + "x" + i19 + str6);
            }
            zC = this.e.c(iRound, i19, z5, z6);
            if (!zC) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                options.inMutable = false;
            }
            if (!zC) {
                if (s40Var != s40.h) {
                    try {
                        zHasAlpha = b5Var.s().hasAlpha();
                    } catch (IOException e) {
                        if (Log.isLoggable("Downsampler", 3)) {
                            Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + s40Var, e);
                        }
                        zHasAlpha = false;
                    }
                    Bitmap.Config config3 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                    options.inPreferredConfig = config3;
                    if (config3 == Bitmap.Config.RGB_565) {
                        z4 = true;
                        options.inDither = true;
                    } else {
                        z4 = true;
                    }
                } else {
                    z4 = true;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                }
            }
            if (i13 >= 0 || i7 < 0 || !z2) {
                int i20 = options.inTargetDensity;
                float f2 = !((i20 > 0 || (i8 = options.inDensity) <= 0 || i20 == i8) ? false : z4) ? i20 / options.inDensity : 1.0f;
                int i21 = options.inSampleSize;
                float f3 = i21;
                zkVar = zkVar2;
                int iCeil = (int) Math.ceil(i13 / f3);
                int iCeil2 = (int) Math.ceil(i7 / f3);
                iRound = Math.round(iCeil * f2);
                iRound2 = Math.round(iCeil2 * f2);
                if (Log.isLoggable("Downsampler", 2)) {
                    StringBuilder sbK = hk1.k("Calculated target [", iRound, iRound2, "x", "] for source [");
                    sbK.append(i13);
                    sbK.append("x");
                    sbK.append(i7);
                    sbK.append("], sampleSize: ");
                    sbK.append(i21);
                    sbK.append(", targetDensity: ");
                    sbK.append(options.inTargetDensity);
                    sbK.append(str5);
                    sbK.append(options.inDensity);
                    sbK.append(", density multiplier: ");
                    sbK.append(f2);
                    Log.v("Downsampler", sbK.toString());
                }
            } else {
                iRound2 = i19;
                zkVar = zkVar2;
            }
            if (iRound > 0 && iRound2 > 0 && (config = options.inPreferredConfig) != Bitmap.Config.HARDWARE) {
                config2 = options.outConfig;
                if (config2 != null) {
                    config = config2;
                }
                options.inBitmap = zkVar.e(iRound, iRound2, config);
            }
            if (n22Var != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    options.inPreferredColorSpace = ColorSpace.get(n22Var == n22.h && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut() ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                } else {
                    options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
            }
            bitmapC = c(b5Var, options, wa0Var, zkVar);
            wa0Var.g(zkVar, bitmapC);
            if (bitmapC != null && i13 > 0 && i7 > 0 && Log.isLoggable("GlideMemoryTracking", 3)) {
                b93.j("Downsampler", va0Var.getClass().getSimpleName(), bitmapC, i13, i7);
            }
            if (Log.isLoggable("Downsampler", 2)) {
                Log.v("Downsampler", "Decoded " + d(bitmapC) + " from [" + i13 + "x" + i7 + "] " + str + " with inBitmap " + d(options.inBitmap) + " for [" + i2 + "x" + i3 + "], sample size: " + options.inSampleSize + str5 + options.inDensity + str2 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + tc1.a(j2));
            }
            if (bitmapC != null) {
                return null;
            }
            bitmapC.setDensity(this.b.densityDpi);
            switch (i6) {
                case 2:
                case 3:
                case 4:
                case 5:
                case AIChatConfig.DefaultContextRounds /* 6 */:
                case 7:
                case 8:
                    Matrix matrix = new Matrix();
                    switch (i6) {
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
                        case AIChatConfig.DefaultContextRounds /* 6 */:
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
                    bitmapC = Bitmap.createBitmap(bitmapC, 0, 0, bitmapC.getWidth(), bitmapC.getHeight(), matrix, true);
                    bitmap = bitmapC;
                    break;
                default:
                    bitmap = bitmapC;
                    break;
            }
            if (!bitmap.equals(bitmapC)) {
                zkVar.h(bitmap);
            }
            return bitmapC;
        }
        if (i4 == 90 || i4 == 270) {
            str3 = ", density: ";
            i9 = i14;
            i10 = i13;
        } else {
            str3 = ", density: ";
            i10 = i14;
            i9 = i13;
        }
        float fB = va0Var.b(i9, i10, iRound, i19);
        if (fB <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + va0Var + ", source: [" + i13 + "x" + i14 + "], target: [" + iRound + "x" + i19 + "]");
        }
        int iA = va0Var.a(i9, i10, iRound, i19);
        if (iA == 0) {
            s.j("Cannot round with null rounding");
            return null;
        }
        int i22 = i4;
        float f4 = i9;
        int i23 = i9;
        int i24 = (int) (((double) (fB * f4)) + 0.5d);
        float f5 = i10;
        int i25 = i23 / i24;
        int i26 = i10 / ((int) (((double) (fB * f5)) + 0.5d));
        int iMax = Math.max(1, Integer.highestOneBit(iA == 1 ? Math.max(i25, i26) : Math.min(i25, i26)));
        if (iA == 1 && iMax < 1.0f / fB) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageHeaderParser$ImageTypeS == ImageHeaderParser$ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f4 / fMin);
            iFloor2 = (int) Math.ceil(f5 / fMin);
            int i27 = iMax / 8;
            if (i27 > 0) {
                iFloor /= i27;
                iFloor2 /= i27;
            }
        } else if (imageHeaderParser$ImageTypeS == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeS == ImageHeaderParser$ImageType.PNG_A) {
            float f6 = iMax;
            iFloor = (int) Math.floor(f4 / f6);
            iFloor2 = (int) Math.floor(f5 / f6);
        } else if (imageHeaderParser$ImageTypeS.isWebp()) {
            float f7 = iMax;
            iFloor = Math.round(f4 / f7);
            iFloor2 = Math.round(f5 / f7);
        } else if (i23 % iMax == 0 && i10 % iMax == 0) {
            int i28 = i10 / iMax;
            iFloor = i23 / iMax;
            iFloor2 = i28;
        } else {
            options.inJustDecodeBounds = true;
            c(b5Var, options, wa0Var, zkVar2);
            options.inJustDecodeBounds = false;
            int[] iArr2 = {options.outWidth, options.outHeight};
            int i29 = iArr2[0];
            iFloor2 = iArr2[1];
            iFloor = i29;
        }
        double dB = va0Var.b(iFloor, iFloor2, iRound, i19);
        int iRound3 = (int) Math.round((dB <= 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
        int i30 = (int) ((((double) iRound3) * dB) + 0.5d);
        options.inTargetDensity = (int) (((dB / ((double) (i30 / iRound3))) * ((double) i30)) + 0.5d);
        int iRound4 = (int) Math.round((dB <= 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
        options.inDensity = iRound4;
        int i31 = options.inTargetDensity;
        if (i31 <= 0 || iRound4 <= 0 || i31 == iRound4) {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        } else {
            options.inScaled = true;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            i7 = i14;
            StringBuilder sbK2 = hk1.k("Calculate scaling, source: [", i13, i7, "x", "], degreesToRotate: ");
            sbK2.append(i22);
            sbK2.append(", target: [");
            sbK2.append(iRound);
            sbK2.append("x");
            sbK2.append(i19);
            sbK2.append("], power of two scaled: [");
            sbK2.append(iFloor);
            sbK2.append("x");
            sbK2.append(iFloor2);
            sbK2.append("], exact scale factor: ");
            sbK2.append(fB);
            sbK2.append(", power of 2 sample size: ");
            sbK2.append(iMax);
            sbK2.append(", adjusted scale factor: ");
            sbK2.append(dB);
            str2 = ", target density: ";
            sbK2.append(str2);
            sbK2.append(options.inTargetDensity);
            str5 = str3;
            sbK2.append(str5);
            sbK2.append(options.inDensity);
            Log.v("Downsampler", sbK2.toString());
        } else {
            str5 = str3;
            str2 = ", target density: ";
            i7 = i14;
        }
        zC = this.e.c(iRound, i19, z5, z6);
        if (!zC) {
        }
        if (!zC) {
        }
        if (i13 >= 0) {
            int i202 = options.inTargetDensity;
            if (i202 > 0) {
                if (!((i202 > 0 || (i8 = options.inDensity) <= 0 || i202 == i8) ? false : z4)) {
                }
                int i212 = options.inSampleSize;
                float f32 = i212;
                zkVar = zkVar2;
                int iCeil3 = (int) Math.ceil(i13 / f32);
                int iCeil22 = (int) Math.ceil(i7 / f32);
                iRound = Math.round(iCeil3 * f2);
                iRound2 = Math.round(iCeil22 * f2);
                if (Log.isLoggable("Downsampler", 2)) {
                }
            }
        }
        if (iRound > 0) {
            config2 = options.outConfig;
            if (config2 != null) {
            }
            options.inBitmap = zkVar.e(iRound, iRound2, config);
        }
        if (n22Var != null) {
        }
        bitmapC = c(b5Var, options, wa0Var, zkVar);
        wa0Var.g(zkVar, bitmapC);
        if (bitmapC != null) {
            b93.j("Downsampler", va0Var.getClass().getSimpleName(), bitmapC, i13, i7);
        }
        if (Log.isLoggable("Downsampler", 2)) {
        }
        if (bitmapC != null) {
        }
    }
}
