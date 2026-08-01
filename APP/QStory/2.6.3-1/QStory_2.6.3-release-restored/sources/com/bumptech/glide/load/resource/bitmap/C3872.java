package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0955;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.C3800;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import io.ktor.client.plugins.api.C4718;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import p238.AbstractC8818;
import p302.C9226;
import p302.C9227;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3872 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C9227 f10023;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final ArrayDeque f10025;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C9227 f10026;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C4718 f10027;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C3864 f10028 = C3864.m7104();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f10029;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3806 f10030;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DisplayMetrics f10031;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3811 f10032;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C9227 f10022 = C9227.m14524(DecodeFormat.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C9227 f10024 = new C9227("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C9227.f23618);

    static {
        C3869 c3869 = C3869.f10014;
        Boolean bool = Boolean.FALSE;
        f10023 = C9227.m14524(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f10026 = C9227.m14524(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f10027 = new C4718(17);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        f10025 = new ArrayDeque(0);
    }

    public C3872(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC3811 interfaceC3811, C3806 c3806) {
        this.f10029 = arrayList;
        AbstractC8818.m14028(displayMetrics, "Argument must not be null");
        this.f10031 = displayMetrics;
        AbstractC8818.m14028(interfaceC3811, "Argument must not be null");
        this.f10032 = interfaceC3811;
        AbstractC8818.m14028(c3806, "Argument must not be null");
        this.f10030 = c3806;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m7140(BitmapFactory.Options options) {
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m7141(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r5;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m7142(C0955 c0955, BitmapFactory.Options options, InterfaceC3868 interfaceC3868, InterfaceC3811 interfaceC3811) {
        if (!options.inJustDecodeBounds) {
            interfaceC3868.mo856();
            switch (c0955.f666) {
                case 12:
                    C3865 c3865 = (C3865) ((C3800) c0955.f664).f9730;
                    synchronized (c3865) {
                        c3865.f10007 = c3865.f10008.length;
                        break;
                    }
                    break;
            }
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = AbstractC3851.f9970;
        lock.lock();
        try {
            try {
                Bitmap bitmapM955 = c0955.m955(options);
                lock.unlock();
                return bitmapM955;
            } catch (IllegalArgumentException e) {
                StringBuilder sbM709 = AbstractC0900.m709(i, i2, "Exception decoding bitmap, outWidth: ", ", outHeight: ", ", outMimeType: ");
                sbM709.append(str);
                sbM709.append(", inBitmap: ");
                sbM709.append(m7141(options.inBitmap));
                IOException iOException = new IOException(sbM709.toString(), e);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    interfaceC3811.mo7015(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapM7142 = m7142(c0955, options, interfaceC3868, interfaceC3811);
                    AbstractC3851.f9970.unlock();
                    return bitmapM7142;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th) {
            AbstractC3851.f9970.unlock();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0294 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0450 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.graphics.Bitmap m7143(androidx.appcompat.app.C0955 r43, android.graphics.BitmapFactory.Options r44, com.bumptech.glide.load.resource.bitmap.C3869 r45, com.bumptech.glide.load.DecodeFormat r46, com.bumptech.glide.load.PreferredColorSpace r47, boolean r48, int r49, int r50, boolean r51, com.bumptech.glide.load.resource.bitmap.InterfaceC3868 r52) {
        /*
            Method dump skipped, instruction units count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C3872.m7143(androidx.appcompat.app.飘花落叶言子苏楪世兰哲, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪哲世苏兰, com.bumptech.glide.load.DecodeFormat, com.bumptech.glide.load.PreferredColorSpace, boolean, int, int, boolean, com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪哲世兰苏):android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3858 m7144(C0955 c0955, int i, int i2, C9226 c9226, InterfaceC3868 interfaceC3868) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f10030.m7006(65536, byte[].class);
        synchronized (C3872.class) {
            arrayDeque = f10025;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m7140(options);
            }
        }
        options.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) c9226.m14523(f10022);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) c9226.m14523(f10024);
        C3869 c3869 = (C3869) c9226.m14523(C3869.f10016);
        boolean zBooleanValue = ((Boolean) c9226.m14523(f10023)).booleanValue();
        C9227 c9227 = f10026;
        try {
            C3858 c3858M7096 = C3858.m7096(m7143(c0955, options, c3869, decodeFormat, preferredColorSpace, c9226.m14523(c9227) != null && ((Boolean) c9226.m14523(c9227)).booleanValue(), i, i2, zBooleanValue, interfaceC3868), this.f10032);
            m7140(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.f10030.m7009(bArr);
            return c3858M7096;
        } catch (Throwable th) {
            m7140(options);
            ArrayDeque arrayDeque2 = f10025;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f10030.m7009(bArr);
                throw th;
            }
        }
    }
}
