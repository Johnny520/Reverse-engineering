package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C0100a;
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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xa0 {

    /* JADX INFO: renamed from: f */
    public static final mv1 f12918f = mv1.m3211a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", s40.f9904j);

    /* JADX INFO: renamed from: g */
    public static final mv1 f12919g = new mv1("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, mv1.f6895e);

    /* JADX INFO: renamed from: h */
    public static final mv1 f12920h;

    /* JADX INFO: renamed from: i */
    public static final mv1 f12921i;

    /* JADX INFO: renamed from: j */
    public static final C0160eb f12922j;

    /* JADX INFO: renamed from: k */
    public static final ArrayDeque f12923k;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0965zk f12924a;

    /* JADX INFO: renamed from: b */
    public final DisplayMetrics f12925b;

    /* JADX INFO: renamed from: c */
    public final td1 f12926c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f12927d;

    /* JADX INFO: renamed from: e */
    public final ds0 f12928e = ds0.m1114a();

    static {
        va0 va0Var = va0.f11856b;
        Boolean bool = Boolean.FALSE;
        f12920h = mv1.m3211a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f12921i = mv1.m3211a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f12922j = new C0160eb(17);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = b93.f747a;
        f12923k = new ArrayDeque(0);
    }

    public xa0(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC0965zk interfaceC0965zk, td1 td1Var) {
        this.f12927d = arrayList;
        fg1.m1642q("Argument must not be null", displayMetrics);
        this.f12925b = displayMetrics;
        fg1.m1642q("Argument must not be null", interfaceC0965zk);
        this.f12924a = interfaceC0965zk;
        fg1.m1642q("Argument must not be null", td1Var);
        this.f12926c = td1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r5;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m6075c(C0043b5 c0043b5, BitmapFactory.Options options, wa0 wa0Var, InterfaceC0965zk interfaceC0965zk) {
        if (!options.inJustDecodeBounds) {
            wa0Var.mo1107p();
            switch (c0043b5.f561h) {
                case 15:
                    r62 r62Var = (r62) ((C0485n4) c0043b5.f562i).f6983i;
                    synchronized (r62Var) {
                        r62Var.f9405j = r62Var.f9403h.length;
                        break;
                    }
                    break;
            }
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = p33.f7963d;
        lock.lock();
        try {
            try {
                Bitmap bitmapM428o = c0043b5.m428o(options);
                lock.unlock();
                return bitmapM428o;
            } catch (IllegalArgumentException e) {
                StringBuilder sbM2212k = hk1.m2212k("Exception decoding bitmap, outWidth: ", i, i2, ", outHeight: ", ", outMimeType: ");
                sbM2212k.append(str);
                sbM2212k.append(", inBitmap: ");
                sbM2212k.append(m6076d(options.inBitmap));
                IOException iOException = new IOException(sbM2212k.toString(), e);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    interfaceC0965zk.mo1325h(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapM6075c = m6075c(c0043b5, options, wa0Var, interfaceC0965zk);
                    p33.f7963d.unlock();
                    return bitmapM6075c;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th) {
            p33.f7963d.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m6076d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX INFO: renamed from: e */
    public static void m6077e(BitmapFactory.Options options) {
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

    /* JADX INFO: renamed from: a */
    public final C0022al m6078a(C0043b5 c0043b5, int i, int i2, ov1 ov1Var, wa0 wa0Var) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f12926c.m5167c(65536, byte[].class);
        synchronized (xa0.class) {
            arrayDeque = f12923k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m6077e(options);
            }
        }
        options.inTempStorage = bArr;
        s40 s40Var = (s40) ov1Var.m3643c(f12918f);
        n22 n22Var = (n22) ov1Var.m3643c(f12919g);
        va0 va0Var = (va0) ov1Var.m3643c(va0.f11861g);
        boolean zBooleanValue = ((Boolean) ov1Var.m3643c(f12920h)).booleanValue();
        mv1 mv1Var = f12921i;
        try {
            C0022al c0022alM188c = C0022al.m188c(this.f12924a, m6079b(c0043b5, options, va0Var, s40Var, n22Var, ov1Var.m3643c(mv1Var) != null && ((Boolean) ov1Var.m3643c(mv1Var)).booleanValue(), i, i2, zBooleanValue, wa0Var));
            m6077e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.f12926c.m5171g(bArr);
            return c0022alM188c;
        } catch (Throwable th) {
            m6077e(options);
            ArrayDeque arrayDeque2 = f12923k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f12926c.m5171g(bArr);
                throw th;
            }
        }
    }

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
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m6079b(C0043b5 c0043b5, BitmapFactory.Options options, va0 va0Var, s40 s40Var, n22 n22Var, boolean z, int i, int i2, boolean z2, wa0 wa0Var) throws Throwable {
        long j;
        String str;
        int iMo2756d;
        int i3;
        boolean z3;
        int i4;
        int i5;
        int iRound;
        String str2;
        int i6;
        boolean zM1116c;
        boolean zHasAlpha;
        boolean z4;
        InterfaceC0965zk interfaceC0965zk;
        int iRound2;
        int i7;
        Bitmap bitmapM6075c;
        Bitmap bitmap;
        ColorSpace colorSpace;
        Bitmap.Config config;
        Bitmap.Config config2;
        String str3;
        int i8;
        int i9;
        int iFloor;
        int iFloor2;
        r62 r62Var;
        int i10;
        int i11 = tc1.f10678b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        InterfaceC0965zk interfaceC0965zk2 = this.f12924a;
        m6075c(c0043b5, options, wa0Var, interfaceC0965zk2);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i12 = iArr[0];
        int i13 = iArr[1];
        String str4 = options.outMimeType;
        boolean z5 = (i12 == -1 || i13 == -1) ? false : z;
        r62 r62Var2 = null;
        switch (c0043b5.f561h) {
            case 14:
                j = jElapsedRealtimeNanos;
                str = str4;
                List list = (List) c0043b5.f563j;
                ByteBuffer byteBufferM2952c = AbstractC0431lo.m2952c((ByteBuffer) c0043b5.f562i);
                td1 td1Var = (td1) c0043b5.f564k;
                if (byteBufferM2952c != null) {
                    int size = list.size();
                    int i14 = 0;
                    while (i14 < size) {
                        List list2 = list;
                        try {
                            iMo2756d = ((kx0) list.get(i14)).mo2756d(byteBufferM2952c, td1Var);
                            td1 td1Var2 = td1Var;
                            if (iMo2756d == -1) {
                                i14++;
                                list = list2;
                                td1Var = td1Var2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    iMo2756d = -1;
                } else {
                    iMo2756d = -1;
                }
                break;
            case 15:
                j = jElapsedRealtimeNanos;
                str = str4;
                List list3 = (List) c0043b5.f564k;
                r62 r62Var3 = (r62) ((C0485n4) c0043b5.f562i).f6983i;
                r62Var3.reset();
                iMo2756d = AbstractC0691se.m4816E(list3, r62Var3, (td1) c0043b5.f563j);
                break;
            default:
                List list4 = (List) c0043b5.f563j;
                j = jElapsedRealtimeNanos;
                C0100a c0100a = (C0100a) c0043b5.f564k;
                td1 td1Var3 = (td1) c0043b5.f562i;
                int size2 = list4.size();
                str = str4;
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        iMo2756d = -1;
                    } else {
                        List list5 = list4;
                        kx0 kx0Var = (kx0) list4.get(i15);
                        int i16 = size2;
                        try {
                            i10 = i15;
                            r62Var = new r62(new FileInputStream(c0100a.m871a().getFileDescriptor()), td1Var3);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            iMo2756d = kx0Var.mo2754b(r62Var, td1Var3);
                            r62Var.m4397c();
                            c0100a.m871a();
                            if (iMo2756d == -1) {
                                i15 = i10 + 1;
                                size2 = i16;
                                list4 = list5;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r62Var2 = r62Var;
                            if (r62Var2 != null) {
                                r62Var2.m4397c();
                            }
                            c0100a.m871a();
                            throw th;
                        }
                    }
                    break;
                }
                break;
        }
        int i17 = iMo2756d;
        switch (i17) {
            case 3:
            case 4:
                i3 = 180;
                break;
            case 5:
            case AIChatConfig.DefaultContextRounds /* 6 */:
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
            case AIChatConfig.DefaultContextRounds /* 6 */:
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
        int i18 = i2 == Integer.MIN_VALUE ? (i3 == 90 || i3 == i4) ? i12 : i13 : i2;
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM432s = c0043b5.m432s();
        String str5 = ", density: ";
        boolean z6 = z3;
        if (i12 <= 0 || i13 <= 0) {
            String str6 = "]";
            str2 = ", target density: ";
            i6 = i13;
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM432s + " with target [" + iRound + "x" + i18 + str6);
            }
            zM1116c = this.f12928e.m1116c(iRound, i18, z5, z6);
            if (!zM1116c) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                options.inMutable = false;
            }
            if (!zM1116c) {
                if (s40Var != s40.f9902h) {
                    try {
                        zHasAlpha = c0043b5.m432s().hasAlpha();
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
            if (i12 >= 0 || i6 < 0 || !z2) {
                int i19 = options.inTargetDensity;
                float f = !((i19 > 0 || (i7 = options.inDensity) <= 0 || i19 == i7) ? false : z4) ? i19 / options.inDensity : 1.0f;
                int i20 = options.inSampleSize;
                float f2 = i20;
                interfaceC0965zk = interfaceC0965zk2;
                int iCeil = (int) Math.ceil(i12 / f2);
                int iCeil2 = (int) Math.ceil(i6 / f2);
                iRound = Math.round(iCeil * f);
                iRound2 = Math.round(iCeil2 * f);
                if (Log.isLoggable("Downsampler", 2)) {
                    StringBuilder sbM2212k = hk1.m2212k("Calculated target [", iRound, iRound2, "x", "] for source [");
                    sbM2212k.append(i12);
                    sbM2212k.append("x");
                    sbM2212k.append(i6);
                    sbM2212k.append("], sampleSize: ");
                    sbM2212k.append(i20);
                    sbM2212k.append(", targetDensity: ");
                    sbM2212k.append(options.inTargetDensity);
                    sbM2212k.append(str5);
                    sbM2212k.append(options.inDensity);
                    sbM2212k.append(", density multiplier: ");
                    sbM2212k.append(f);
                    Log.v("Downsampler", sbM2212k.toString());
                }
            } else {
                iRound2 = i18;
                interfaceC0965zk = interfaceC0965zk2;
            }
            if (iRound > 0 && iRound2 > 0 && (config = options.inPreferredConfig) != Bitmap.Config.HARDWARE) {
                config2 = options.outConfig;
                if (config2 != null) {
                    config = config2;
                }
                options.inBitmap = interfaceC0965zk.mo1323e(iRound, iRound2, config);
            }
            if (n22Var != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    options.inPreferredColorSpace = ColorSpace.get(n22Var == n22.f6971h && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut() ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                } else {
                    options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
            }
            bitmapM6075c = m6075c(c0043b5, options, wa0Var, interfaceC0965zk);
            wa0Var.mo1104g(interfaceC0965zk, bitmapM6075c);
            if (bitmapM6075c != null && i12 > 0 && i6 > 0 && Log.isLoggable("GlideMemoryTracking", 3)) {
                b93.m503j("Downsampler", va0Var.getClass().getSimpleName(), bitmapM6075c, i12, i6);
            }
            if (Log.isLoggable("Downsampler", 2)) {
                Log.v("Downsampler", "Decoded " + m6076d(bitmapM6075c) + " from [" + i12 + "x" + i6 + "] " + str + " with inBitmap " + m6076d(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str5 + options.inDensity + str2 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + tc1.m5161a(j));
            }
            if (bitmapM6075c != null) {
                return null;
            }
            bitmapM6075c.setDensity(this.f12925b.densityDpi);
            switch (i5) {
                case 2:
                case 3:
                case 4:
                case 5:
                case AIChatConfig.DefaultContextRounds /* 6 */:
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
                    bitmapM6075c = Bitmap.createBitmap(bitmapM6075c, 0, 0, bitmapM6075c.getWidth(), bitmapM6075c.getHeight(), matrix, true);
                    bitmap = bitmapM6075c;
                    break;
                default:
                    bitmap = bitmapM6075c;
                    break;
            }
            if (!bitmap.equals(bitmapM6075c)) {
                interfaceC0965zk.mo1325h(bitmap);
            }
            return bitmapM6075c;
        }
        if (i3 == 90 || i3 == 270) {
            str3 = ", density: ";
            i8 = i13;
            i9 = i12;
        } else {
            str3 = ", density: ";
            i9 = i13;
            i8 = i12;
        }
        float fM5659b = va0Var.m5659b(i8, i9, iRound, i18);
        if (fM5659b <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fM5659b + " from: " + va0Var + ", source: [" + i12 + "x" + i13 + "], target: [" + iRound + "x" + i18 + "]");
        }
        int iM5658a = va0Var.m5658a(i8, i9, iRound, i18);
        if (iM5658a == 0) {
            C0676s.m4651j("Cannot round with null rounding");
            return null;
        }
        int i21 = i3;
        float f3 = i8;
        int i22 = i8;
        int i23 = (int) (((double) (fM5659b * f3)) + 0.5d);
        float f4 = i9;
        int i24 = i22 / i23;
        int i25 = i9 / ((int) (((double) (fM5659b * f4)) + 0.5d));
        int iMax = Math.max(1, Integer.highestOneBit(iM5658a == 1 ? Math.max(i24, i25) : Math.min(i24, i25)));
        if (iM5658a == 1 && iMax < 1.0f / fM5659b) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageHeaderParser$ImageTypeM432s == ImageHeaderParser$ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f3 / fMin);
            iFloor2 = (int) Math.ceil(f4 / fMin);
            int i26 = iMax / 8;
            if (i26 > 0) {
                iFloor /= i26;
                iFloor2 /= i26;
            }
        } else if (imageHeaderParser$ImageTypeM432s == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeM432s == ImageHeaderParser$ImageType.PNG_A) {
            float f5 = iMax;
            iFloor = (int) Math.floor(f3 / f5);
            iFloor2 = (int) Math.floor(f4 / f5);
        } else if (imageHeaderParser$ImageTypeM432s.isWebp()) {
            float f6 = iMax;
            iFloor = Math.round(f3 / f6);
            iFloor2 = Math.round(f4 / f6);
        } else if (i22 % iMax == 0 && i9 % iMax == 0) {
            int i27 = i9 / iMax;
            iFloor = i22 / iMax;
            iFloor2 = i27;
        } else {
            options.inJustDecodeBounds = true;
            m6075c(c0043b5, options, wa0Var, interfaceC0965zk2);
            options.inJustDecodeBounds = false;
            int[] iArr2 = {options.outWidth, options.outHeight};
            int i28 = iArr2[0];
            iFloor2 = iArr2[1];
            iFloor = i28;
        }
        double dM5659b = va0Var.m5659b(iFloor, iFloor2, iRound, i18);
        int iRound3 = (int) Math.round((dM5659b <= 1.0d ? dM5659b : 1.0d / dM5659b) * 2.147483647E9d);
        int i29 = (int) ((((double) iRound3) * dM5659b) + 0.5d);
        options.inTargetDensity = (int) (((dM5659b / ((double) (i29 / iRound3))) * ((double) i29)) + 0.5d);
        int iRound4 = (int) Math.round((dM5659b <= 1.0d ? dM5659b : 1.0d / dM5659b) * 2.147483647E9d);
        options.inDensity = iRound4;
        int i30 = options.inTargetDensity;
        if (i30 <= 0 || iRound4 <= 0 || i30 == iRound4) {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        } else {
            options.inScaled = true;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            i6 = i13;
            StringBuilder sbM2212k2 = hk1.m2212k("Calculate scaling, source: [", i12, i6, "x", "], degreesToRotate: ");
            sbM2212k2.append(i21);
            sbM2212k2.append(", target: [");
            sbM2212k2.append(iRound);
            sbM2212k2.append("x");
            sbM2212k2.append(i18);
            sbM2212k2.append("], power of two scaled: [");
            sbM2212k2.append(iFloor);
            sbM2212k2.append("x");
            sbM2212k2.append(iFloor2);
            sbM2212k2.append("], exact scale factor: ");
            sbM2212k2.append(fM5659b);
            sbM2212k2.append(", power of 2 sample size: ");
            sbM2212k2.append(iMax);
            sbM2212k2.append(", adjusted scale factor: ");
            sbM2212k2.append(dM5659b);
            str2 = ", target density: ";
            sbM2212k2.append(str2);
            sbM2212k2.append(options.inTargetDensity);
            str5 = str3;
            sbM2212k2.append(str5);
            sbM2212k2.append(options.inDensity);
            Log.v("Downsampler", sbM2212k2.toString());
        } else {
            str5 = str3;
            str2 = ", target density: ";
            i6 = i13;
        }
        zM1116c = this.f12928e.m1116c(iRound, i18, z5, z6);
        if (!zM1116c) {
        }
        if (!zM1116c) {
        }
        if (i12 >= 0) {
            int i192 = options.inTargetDensity;
            if (i192 > 0) {
                if (!((i192 > 0 || (i7 = options.inDensity) <= 0 || i192 == i7) ? false : z4)) {
                }
                int i202 = options.inSampleSize;
                float f22 = i202;
                interfaceC0965zk = interfaceC0965zk2;
                int iCeil3 = (int) Math.ceil(i12 / f22);
                int iCeil22 = (int) Math.ceil(i6 / f22);
                iRound = Math.round(iCeil3 * f);
                iRound2 = Math.round(iCeil22 * f);
                if (Log.isLoggable("Downsampler", 2)) {
                }
            }
        }
        if (iRound > 0) {
            config2 = options.outConfig;
            if (config2 != null) {
            }
            options.inBitmap = interfaceC0965zk.mo1323e(iRound, iRound2, config);
        }
        if (n22Var != null) {
        }
        bitmapM6075c = m6075c(c0043b5, options, wa0Var, interfaceC0965zk);
        wa0Var.mo1104g(interfaceC0965zk, bitmapM6075c);
        if (bitmapM6075c != null) {
            b93.m503j("Downsampler", va0Var.getClass().getSimpleName(), bitmapM6075c, i12, i6);
        }
        if (Log.isLoggable("Downsampler", 2)) {
        }
        if (bitmapM6075c != null) {
        }
    }
}
