package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C1274a;
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
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: te */
/* JADX INFO: loaded from: classes.dex */
public final class C2543te {

    /* JADX INFO: renamed from: f */
    public static final C2601ut f8847f = C2601ut.m5116a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC0191Ec.f578c);

    /* JADX INFO: renamed from: g */
    public static final C2601ut f8848g = new C2601ut("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C2601ut.f8986e);

    /* JADX INFO: renamed from: h */
    public static final C2601ut f8849h;

    /* JADX INFO: renamed from: i */
    public static final C2601ut f8850i;

    /* JADX INFO: renamed from: j */
    public static final C2220m6 f8851j;

    /* JADX INFO: renamed from: k */
    public static final ArrayDeque f8852k;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0565N5 f8853a;

    /* JADX INFO: renamed from: b */
    public final DisplayMetrics f8854b;

    /* JADX INFO: renamed from: c */
    public final C2812zp f8855c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f8856d;

    /* JADX INFO: renamed from: e */
    public final C2377pk f8857e = C2377pk.m4818a();

    static {
        C2457re c2457re = C2457re.f8656b;
        Boolean bool = Boolean.FALSE;
        f8849h = C2601ut.m5116a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f8850i = C2601ut.m5116a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f8851j = new C2220m6(14);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = AbstractC2622vD.f9104a;
        f8852k = new ArrayDeque(0);
    }

    public C2543te(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC0565N5 interfaceC0565N5, C2812zp c2812zp) {
        this.f8856d = arrayList;
        AbstractC0714Qj.m1488j("Argument must not be null", displayMetrics);
        this.f8854b = displayMetrics;
        AbstractC0714Qj.m1488j("Argument must not be null", interfaceC0565N5);
        this.f8853a = interfaceC0565N5;
        AbstractC0714Qj.m1488j("Argument must not be null", c2812zp);
        this.f8855c = c2812zp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        throw r0;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m5020c(C2656w4 c2656w4, BitmapFactory.Options options, InterfaceC2500se interfaceC2500se, InterfaceC0565N5 interfaceC0565N5) {
        if (!options.inJustDecodeBounds) {
            interfaceC2500se.mo639f();
            switch (c2656w4.f9195a) {
                case 16:
                    C1340dv c1340dv = (C1340dv) ((C0132D2) c2656w4.f9196b).f328b;
                    synchronized (c1340dv) {
                        c1340dv.f4827c = c1340dv.f4825a.length;
                        break;
                    }
                    break;
            }
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = AbstractC0184EB.f548d;
        lock.lock();
        try {
            try {
                Bitmap bitmapM5206k = c2656w4.m5206k(options);
                lock.unlock();
                return bitmapM5206k;
            } catch (IllegalArgumentException e) {
                IOException iOExceptionM5022e = m5022e(e, i, i2, str, options);
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionM5022e;
                }
                try {
                    interfaceC0565N5.mo53h(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapM5020c = m5020c(c2656w4, options, interfaceC2500se, interfaceC0565N5);
                    AbstractC0184EB.f548d.unlock();
                    return bitmapM5020c;
                } catch (IOException unused) {
                    throw iOExceptionM5022e;
                }
            }
        } catch (Throwable th) {
            AbstractC0184EB.f548d.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m5021d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX INFO: renamed from: e */
    public static IOException m5022e(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m5021d(options.inBitmap), illegalArgumentException);
    }

    /* JADX INFO: renamed from: f */
    public static void m5023f(BitmapFactory.Options options) {
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
    public final C0608O5 m5024a(C2656w4 c2656w4, int i, int i2, C2644vt c2644vt, InterfaceC2500se interfaceC2500se) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f8855c.m5441c(65536, byte[].class);
        synchronized (C2543te.class) {
            arrayDeque = f8852k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m5023f(options);
            }
        }
        options.inTempStorage = bArr;
        EnumC0191Ec enumC0191Ec = (EnumC0191Ec) c2644vt.m5177c(f8847f);
        EnumC1383eu enumC1383eu = (EnumC1383eu) c2644vt.m5177c(f8848g);
        C2457re c2457re = (C2457re) c2644vt.m5177c(C2457re.f8661g);
        boolean zBooleanValue = ((Boolean) c2644vt.m5177c(f8849h)).booleanValue();
        C2601ut c2601ut = f8850i;
        try {
            C0608O5 c0608o5M1187c = C0608O5.m1187c(this.f8853a, m5025b(c2656w4, options, c2457re, enumC0191Ec, enumC1383eu, c2644vt.m5177c(c2601ut) != null && ((Boolean) c2644vt.m5177c(c2601ut)).booleanValue(), i, i2, zBooleanValue, interfaceC2500se));
            m5023f(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.f8855c.m5445g(bArr);
            return c0608o5M1187c;
        } catch (Throwable th) {
            m5023f(options);
            ArrayDeque arrayDeque2 = f8852k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f8855c.m5445g(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ce  */
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
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m5025b(C2656w4 c2656w4, BitmapFactory.Options options, C2457re c2457re, EnumC0191Ec enumC0191Ec, EnumC1383eu enumC1383eu, boolean z, int i, int i2, boolean z2, InterfaceC2500se interfaceC2500se) throws Throwable {
        int iM2696V;
        char c;
        boolean z3;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        float f;
        C2543te c2543te;
        boolean z6;
        boolean zHasAlpha;
        boolean z7;
        int i5;
        Bitmap bitmapCreateBitmap;
        ColorSpace colorSpace;
        Bitmap.Config config;
        int i6;
        int i7;
        int iFloor;
        int iFloor2;
        C1340dv c1340dv;
        C1340dv c1340dv2;
        int i8;
        List list;
        int i9 = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        InterfaceC0565N5 interfaceC0565N5 = this.f8853a;
        m5020c(c2656w4, options, interfaceC2500se, interfaceC0565N5);
        int i10 = 0;
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i11 = iArr[0];
        int i12 = iArr[1];
        boolean z8 = (i11 == -1 || i12 == -1) ? false : z;
        switch (c2656w4.f9195a) {
            case 15:
                List list2 = (List) c2656w4.f9197c;
                ByteBuffer byteBufferM5011c = AbstractC2529t6.m5011c((ByteBuffer) c2656w4.f9196b);
                C2812zp c2812zp = (C2812zp) c2656w4.f9198d;
                if (byteBufferM5011c != null) {
                    int size = list2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        try {
                            int iMo569d = ((InterfaceC1331dl) list2.get(i13)).mo569d(byteBufferM5011c, c2812zp);
                            List list3 = list2;
                            if (iMo569d != -1) {
                                iM2696V = iMo569d;
                            } else {
                                i13++;
                                list2 = list3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    iM2696V = -1;
                } else {
                    iM2696V = -1;
                }
                break;
            case 16:
                List list4 = (List) c2656w4.f9198d;
                C1340dv c1340dv3 = (C1340dv) ((C0132D2) c2656w4.f9196b).f328b;
                c1340dv3.reset();
                iM2696V = AbstractC1406fG.m2696V(list4, c1340dv3, (C2812zp) c2656w4.f9197c);
                break;
            default:
                List list5 = (List) c2656w4.f9197c;
                C1274a c1274a = (C1274a) c2656w4.f9198d;
                C2812zp c2812zp2 = (C2812zp) c2656w4.f9196b;
                int size2 = list5.size();
                while (true) {
                    if (i10 >= size2) {
                        iM2696V = -1;
                    } else {
                        InterfaceC1331dl interfaceC1331dl = (InterfaceC1331dl) list5.get(i10);
                        int i14 = size2;
                        try {
                            i8 = i10;
                            list = list5;
                            c1340dv2 = new C1340dv(new FileInputStream(c1274a.m2416a().getFileDescriptor()), c2812zp2);
                        } catch (Throwable th2) {
                            th = th2;
                            c1340dv = null;
                        }
                        try {
                            int iMo567b = interfaceC1331dl.mo567b(c1340dv2, c2812zp2);
                            c1340dv2.m2597f();
                            c1274a.m2416a();
                            if (iMo567b != -1) {
                                iM2696V = iMo567b;
                            } else {
                                i10 = i8 + 1;
                                size2 = i14;
                                list5 = list;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c1340dv = c1340dv2;
                            if (c1340dv != null) {
                                c1340dv.m2597f();
                            }
                            c1274a.m2416a();
                            throw th;
                        }
                    }
                    break;
                }
                break;
        }
        switch (iM2696V) {
            case 3:
            case 4:
                c = 180;
                break;
            case 5:
            case 6:
                c = 'Z';
                break;
            case 7:
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                c = 270;
                break;
            default:
                c = 0;
                break;
        }
        switch (iM2696V) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        int i15 = i;
        if (i15 == Integer.MIN_VALUE) {
            i15 = (c == 'Z' || c == 270) ? i12 : i11;
        }
        int i16 = iM2696V;
        int iRound = i2;
        if (iRound == Integer.MIN_VALUE) {
            iRound = (c == 'Z' || c == 270) ? i11 : i12;
        }
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM5213t = c2656w4.m5213t();
        if (i11 <= 0 || i12 <= 0) {
            i3 = i12;
            i4 = i11;
            z4 = z8;
            z5 = z3;
            f = 1.0f;
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(imageHeaderParser$ImageTypeM5213t);
            }
            c2543te = this;
        } else {
            f = 1.0f;
            if (c == 'Z' || c == 270) {
                i6 = i12;
                i7 = i11;
            } else {
                i7 = i12;
                i6 = i11;
            }
            z4 = z8;
            float fM4949b = c2457re.m4949b(i6, i7, i15, iRound);
            if (fM4949b <= 0.0f) {
                throw new IllegalArgumentException("Cannot scale with factor: " + fM4949b + " from: " + c2457re + ", source: [" + i11 + "x" + i12 + "], target: [" + i15 + "x" + iRound + "]");
            }
            z5 = z3;
            int iM4948a = c2457re.m4948a(i6, i7, i15, iRound);
            if (iM4948a == 0) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            float f2 = i6;
            float f3 = i7;
            int i17 = i6 / ((int) (((double) (fM4949b * f2)) + 0.5d));
            int i18 = i7 / ((int) (((double) (fM4949b * f3)) + 0.5d));
            int iMax = Math.max(1, Integer.highestOneBit(iM4948a == 1 ? Math.max(i17, i18) : Math.min(i17, i18)));
            if (iM4948a == 1 && iMax < 1.0f / fM4949b) {
                iMax <<= 1;
            }
            options.inSampleSize = iMax;
            if (imageHeaderParser$ImageTypeM5213t == ImageHeaderParser$ImageType.JPEG) {
                float fMin = Math.min(iMax, 8);
                iFloor = (int) Math.ceil(f2 / fMin);
                iFloor2 = (int) Math.ceil(f3 / fMin);
                int i19 = iMax / 8;
                if (i19 > 0) {
                    iFloor /= i19;
                    iFloor2 /= i19;
                }
            } else if (imageHeaderParser$ImageTypeM5213t == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeM5213t == ImageHeaderParser$ImageType.PNG_A) {
                float f4 = iMax;
                iFloor = (int) Math.floor(f2 / f4);
                iFloor2 = (int) Math.floor(f3 / f4);
            } else if (imageHeaderParser$ImageTypeM5213t.isWebp()) {
                float f5 = iMax;
                iFloor = Math.round(f2 / f5);
                iFloor2 = Math.round(f3 / f5);
            } else if (i6 % iMax == 0 && i7 % iMax == 0) {
                iFloor = i6 / iMax;
                iFloor2 = i7 / iMax;
            } else {
                options.inJustDecodeBounds = true;
                m5020c(c2656w4, options, interfaceC2500se, interfaceC0565N5);
                options.inJustDecodeBounds = false;
                int[] iArr2 = {options.outWidth, options.outHeight};
                iFloor = iArr2[0];
                iFloor2 = iArr2[1];
            }
            double dM4949b = c2457re.m4949b(iFloor, iFloor2, i15, iRound);
            int iRound2 = (int) Math.round((dM4949b <= 1.0d ? dM4949b : 1.0d / dM4949b) * 2.147483647E9d);
            int i20 = (int) ((((double) iRound2) * dM4949b) + 0.5d);
            options.inTargetDensity = (int) (((dM4949b / ((double) (i20 / iRound2))) * ((double) i20)) + 0.5d);
            if (dM4949b > 1.0d) {
                dM4949b = 1.0d / dM4949b;
            }
            int iRound3 = (int) Math.round(dM4949b * 2.147483647E9d);
            options.inDensity = iRound3;
            int i21 = options.inTargetDensity;
            if (i21 <= 0 || iRound3 <= 0 || i21 == iRound3) {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            } else {
                options.inScaled = true;
            }
            c2543te = this;
            i4 = i11;
            i3 = i12;
        }
        boolean zM4820c = c2543te.f8857e.m4820c(i15, iRound, z4, z5);
        if (zM4820c) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            z6 = false;
            options.inMutable = false;
        } else {
            z6 = false;
        }
        if (!zM4820c) {
            if (enumC0191Ec != EnumC0191Ec.f576a) {
                try {
                    zHasAlpha = c2656w4.m5213t().hasAlpha();
                } catch (IOException unused) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        Objects.toString(enumC0191Ec);
                    }
                    zHasAlpha = z6;
                }
                Bitmap.Config config2 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config2;
                if (config2 == Bitmap.Config.RGB_565) {
                    z7 = true;
                    options.inDither = true;
                } else {
                    z7 = true;
                }
            } else {
                z7 = true;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
        }
        if (i4 < 0 || i3 < 0 || !z2) {
            int i22 = options.inTargetDensity;
            float f6 = (i22 <= 0 || (i5 = options.inDensity) <= 0 || i22 == i5) ? z6 : z7 ? i22 / options.inDensity : f;
            float f7 = options.inSampleSize;
            int iCeil = (int) Math.ceil(i4 / f7);
            int iCeil2 = (int) Math.ceil(i3 / f7);
            int iRound4 = Math.round(iCeil * f6);
            iRound = Math.round(iCeil2 * f6);
            i15 = iRound4;
        }
        if (i15 > 0 && iRound > 0 && (config = options.inPreferredConfig) != Bitmap.Config.HARDWARE) {
            Bitmap.Config config3 = options.outConfig;
            if (config3 != null) {
                config = config3;
            }
            options.inBitmap = interfaceC0565N5.mo51e(i15, iRound, config);
        }
        if (enumC1383eu != null) {
            if (enumC1383eu != EnumC1383eu.f4928a || (colorSpace = options.outColorSpace) == null || !colorSpace.isWideGamut()) {
                z7 = z6;
            }
            options.inPreferredColorSpace = ColorSpace.get(z7 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        }
        Bitmap bitmapM5020c = m5020c(c2656w4, options, interfaceC2500se, interfaceC0565N5);
        interfaceC2500se.mo636c(interfaceC0565N5, bitmapM5020c);
        if (Log.isLoggable("Downsampler", 2)) {
            m5021d(bitmapM5020c);
            m5021d(options.inBitmap);
            Thread.currentThread().getName();
            SystemClock.elapsedRealtimeNanos();
        }
        if (bitmapM5020c == null) {
            return null;
        }
        bitmapM5020c.setDensity(c2543te.f8854b.densityDpi);
        switch (i16) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                Matrix matrix = new Matrix();
                switch (i16) {
                    case 2:
                        matrix.setScale(-1.0f, f);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, f);
                        break;
                    case 6:
                        matrix.setRotate(90.0f);
                        break;
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, f);
                        break;
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        matrix.setRotate(-90.0f);
                        break;
                }
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapM5020c, 0, 0, bitmapM5020c.getWidth(), bitmapM5020c.getHeight(), matrix, true);
                break;
            default:
                bitmapCreateBitmap = bitmapM5020c;
                break;
        }
        if (bitmapM5020c.equals(bitmapCreateBitmap)) {
            return bitmapCreateBitmap;
        }
        interfaceC0565N5.mo53h(bitmapM5020c);
        return bitmapCreateBitmap;
    }
}
