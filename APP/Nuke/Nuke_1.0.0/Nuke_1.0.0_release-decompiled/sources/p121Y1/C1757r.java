package p121Y1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import p000A.C0072l0;
import p078P1.C1146h;
import p078P1.C1147i;
import p078P1.EnumC1139a;
import p078P1.EnumC1148j;
import p093S1.C1294f;
import p093S1.InterfaceC1289a;
import p110W0.C1577b;
import p195l2.AbstractC2503g;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: Y1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1757r {

    /* JADX INFO: renamed from: f */
    public static final C1146h f6040f = C1146h.m2200a(EnumC1139a.f3776f, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: g */
    public static final C1146h f6041g = new C1146h("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C1146h.f3780e);

    /* JADX INFO: renamed from: h */
    public static final C1146h f6042h;

    /* JADX INFO: renamed from: i */
    public static final C1146h f6043i;

    /* JADX INFO: renamed from: j */
    public static final C1577b f6044j;

    /* JADX INFO: renamed from: k */
    public static final ArrayDeque f6045k;

    /* JADX INFO: renamed from: a */
    public final InterfaceC1289a f6046a;

    /* JADX INFO: renamed from: b */
    public final DisplayMetrics f6047b;

    /* JADX INFO: renamed from: c */
    public final C1294f f6048c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f6049d;

    /* JADX INFO: renamed from: e */
    public final C1765z f6050e = C1765z.m3152a();

    static {
        C1755p c1755p = C1755p.f6032b;
        Boolean bool = Boolean.FALSE;
        f6042h = C1146h.m2200a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f6043i = C1146h.m2200a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f6044j = new C1577b(5);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = AbstractC2511o.f8029a;
        f6045k = new ArrayDeque(0);
    }

    public C1757r(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC1289a interfaceC1289a, C1294f c1294f) {
        this.f6049d = arrayList;
        AbstractC2503g.m4445c(displayMetrics, "Argument must not be null");
        this.f6047b = displayMetrics;
        AbstractC2503g.m4445c(interfaceC1289a, "Argument must not be null");
        this.f6046a = interfaceC1289a;
        AbstractC2503g.m4445c(c1294f, "Argument must not be null");
        this.f6048c = c1294f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r1;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m3128c(p000A.C0072l0 r5, android.graphics.BitmapFactory.Options r6, p121Y1.InterfaceC1756q r7, p093S1.InterfaceC1289a r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L22
            r7.mo50s()
            int r1 = r5.f306d
            switch(r1) {
                case 10: goto L22;
                case 11: goto Lf;
                default: goto Le;
            }
        Le:
            goto L22
        Lf:
            java.lang.Object r1 = r5.f307e
            com.bumptech.glide.load.data.g r1 = (com.bumptech.glide.load.data.C1937g) r1
            java.lang.Object r1 = r1.f6571e
            Y1.A r1 = (p121Y1.C1733A) r1
            monitor-enter(r1)
            byte[] r2 = r1.f5986d     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1f
            r1.f5988f = r2     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            goto L22
        L1f:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r5
        L22:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = p121Y1.AbstractC1735C.f5995d
            r4.lock()
            android.graphics.Bitmap r5 = r5.m104h(r6)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.Throwable -> L5c
            r4.unlock()
            return r5
        L35:
            r4 = move-exception
            java.io.IOException r1 = m3130e(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L5c
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L46
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L5c
        L46:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5b
            r8.mo154e(r0)     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L5c
            r0 = 0
            r6.inBitmap = r0     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L5c
            android.graphics.Bitmap r5 = m3128c(r5, r6, r7, r8)     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L5c
            java.util.concurrent.locks.Lock r6 = p121Y1.AbstractC1735C.f5995d
            r6.unlock()
            return r5
        L5a:
            throw r1     // Catch: java.lang.Throwable -> L5c
        L5b:
            throw r1     // Catch: java.lang.Throwable -> L5c
        L5c:
            r5 = move-exception
            java.util.concurrent.locks.Lock r6 = p121Y1.AbstractC1735C.f5995d
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p121Y1.C1757r.m3128c(A.l0, android.graphics.BitmapFactory$Options, Y1.q, S1.a):android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: d */
    public static String m3129d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX INFO: renamed from: e */
    public static IOException m3130e(IllegalArgumentException illegalArgumentException, int i5, int i6, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i5 + ", outHeight: " + i6 + ", outMimeType: " + str + ", inBitmap: " + m3129d(options.inBitmap), illegalArgumentException);
    }

    /* JADX INFO: renamed from: f */
    public static void m3131f(BitmapFactory.Options options) {
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
    public final C1743d m3132a(C0072l0 c0072l0, int i5, int i6, C1147i c1147i, InterfaceC1756q interfaceC1756q) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f6048c.m2384c(65536, byte[].class);
        synchronized (C1757r.class) {
            arrayDeque = f6045k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m3131f(options);
            }
        }
        options.inTempStorage = bArr;
        EnumC1139a enumC1139a = (EnumC1139a) c1147i.m2201c(f6040f);
        EnumC1148j enumC1148j = (EnumC1148j) c1147i.m2201c(f6041g);
        C1755p c1755p = (C1755p) c1147i.m2201c(C1755p.f6037g);
        boolean zBooleanValue = ((Boolean) c1147i.m2201c(f6042h)).booleanValue();
        C1146h c1146h = f6043i;
        try {
            C1743d c1743dM3099b = C1743d.m3099b(this.f6046a, m3133b(c0072l0, options, c1755p, enumC1139a, enumC1148j, c1147i.m2201c(c1146h) != null && ((Boolean) c1147i.m2201c(c1146h)).booleanValue(), i5, i6, zBooleanValue, interfaceC1756q));
            m3131f(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.f6048c.m2388g(bArr);
            return c1743dM3099b;
        } catch (Throwable th) {
            m3131f(options);
            ArrayDeque arrayDeque2 = f6045k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f6048c.m2388g(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0292 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0476 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
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
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap m3133b(p000A.C0072l0 r43, android.graphics.BitmapFactory.Options r44, p121Y1.C1755p r45, p078P1.EnumC1139a r46, p078P1.EnumC1148j r47, boolean r48, int r49, int r50, boolean r51, p121Y1.InterfaceC1756q r52) {
        /*
            Method dump skipped, instruction units count: 1560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p121Y1.C1757r.m3133b(A.l0, android.graphics.BitmapFactory$Options, Y1.p, P1.a, P1.j, boolean, int, int, boolean, Y1.q):android.graphics.Bitmap");
    }
}
