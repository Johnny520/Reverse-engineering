package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import androidx.appcompat.app.C0108;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import io.ktor.client.plugins.api.C3886;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import p222.AbstractC7989;
import p286.C8397;
import p286.C8398;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3040 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C8398 f9678;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final ArrayDeque f9680;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C8398 f9681;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C3886 f9682;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C3032 f9683 = C3032.m6544();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f9684;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2974 f9685;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DisplayMetrics f9686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2979 f9687;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8398 f9677 = C8398.m13965(DecodeFormat.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C8398 f9679 = new C8398("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C8398.f23273);

    static {
        C3037 c3037 = C3037.f9669;
        Boolean bool = Boolean.FALSE;
        f9678 = C8398.m13965(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f9681 = C8398.m13965(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f9682 = new C3886(17);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        f9680 = new ArrayDeque(0);
    }

    public C3040(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC2979 interfaceC2979, C2974 c2974) {
        this.f9684 = arrayList;
        AbstractC7989.m13469(displayMetrics, "Argument must not be null");
        this.f9686 = displayMetrics;
        AbstractC7989.m13469(interfaceC2979, "Argument must not be null");
        this.f9687 = interfaceC2979;
        AbstractC7989.m13469(c2974, "Argument must not be null");
        this.f9685 = c2974;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m6580(BitmapFactory.Options options) {
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
    public static String m6581(Bitmap bitmap) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m6582(androidx.appcompat.app.C0108 r9, android.graphics.BitmapFactory.Options r10, com.bumptech.glide.load.resource.bitmap.InterfaceC3036 r11, com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979 r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto L22
            r11.mo296()
            int r1 = r9.f321
            switch(r1) {
                case 11: goto L22;
                case 12: goto Lf;
                default: goto Le;
            }
        Le:
            goto L22
        Lf:
            java.lang.Object r1 = r9.f319
            com.bumptech.glide.load.data.飘花落叶言子楪苏世兰哲 r1 = (com.bumptech.glide.load.data.C2968) r1
            java.lang.Object r1 = r1.f9385
            com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪兰哲苏世 r1 = (com.bumptech.glide.load.resource.bitmap.C3033) r1
            monitor-enter(r1)
            byte[] r2 = r1.f9663     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1f
            r1.f9662 = r2     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            goto L22
        L1f:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r9
        L22:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.AbstractC3019.f9625
            r4.lock()
            android.graphics.Bitmap r9 = r9.m395(r10)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.Throwable -> L7c
            r4.unlock()
            return r9
        L35:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = androidx.activity.AbstractC0053.m149(r1, r2, r6, r7, r8)     // Catch: java.lang.Throwable -> L7c
            r1.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L7c
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = m6581(r2)     // Catch: java.lang.Throwable -> L7c
            r1.append(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7c
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L7c
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L66
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r5)     // Catch: java.lang.Throwable -> L7c
        L66:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L7b
            r12.mo6455(r0)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            android.graphics.Bitmap r9 = m6582(r9, r10, r11, r12)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            java.util.concurrent.locks.Lock r10 = com.bumptech.glide.load.resource.bitmap.AbstractC3019.f9625
            r10.unlock()
            return r9
        L7a:
            throw r5     // Catch: java.lang.Throwable -> L7c
        L7b:
            throw r5     // Catch: java.lang.Throwable -> L7c
        L7c:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = com.bumptech.glide.load.resource.bitmap.AbstractC3019.f9625
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C3040.m6582(androidx.appcompat.app.飘花落叶言子苏楪世兰哲, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪哲世兰苏, com.bumptech.glide.load.engine.bitmap_recycle.飘花落叶言子楪世苏哲兰):android.graphics.Bitmap");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap m6583(androidx.appcompat.app.C0108 r43, android.graphics.BitmapFactory.Options r44, com.bumptech.glide.load.resource.bitmap.C3037 r45, com.bumptech.glide.load.DecodeFormat r46, com.bumptech.glide.load.PreferredColorSpace r47, boolean r48, int r49, int r50, boolean r51, com.bumptech.glide.load.resource.bitmap.InterfaceC3036 r52) {
        /*
            Method dump skipped, instruction units count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C3040.m6583(androidx.appcompat.app.飘花落叶言子苏楪世兰哲, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪哲世苏兰, com.bumptech.glide.load.DecodeFormat, com.bumptech.glide.load.PreferredColorSpace, boolean, int, int, boolean, com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪哲世兰苏):android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3026 m6584(C0108 c0108, int i, int i2, C8397 c8397, InterfaceC3036 interfaceC3036) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f9685.m6446(65536, byte[].class);
        synchronized (C3040.class) {
            arrayDeque = f9680;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m6580(options);
            }
        }
        options.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) c8397.m13964(f9677);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) c8397.m13964(f9679);
        C3037 c3037 = (C3037) c8397.m13964(C3037.f9671);
        boolean zBooleanValue = ((Boolean) c8397.m13964(f9678)).booleanValue();
        C8398 c8398 = f9681;
        try {
            C3026 c3026M6536 = C3026.m6536(m6583(c0108, options, c3037, decodeFormat, preferredColorSpace, c8397.m13964(c8398) != null && ((Boolean) c8397.m13964(c8398)).booleanValue(), i, i2, zBooleanValue, interfaceC3036), this.f9687);
            m6580(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.f9685.m6449(bArr);
            return c3026M6536;
        } catch (Throwable th) {
            m6580(options);
            ArrayDeque arrayDeque2 = f9680;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f9685.m6449(bArr);
                throw th;
            }
        }
    }
}
