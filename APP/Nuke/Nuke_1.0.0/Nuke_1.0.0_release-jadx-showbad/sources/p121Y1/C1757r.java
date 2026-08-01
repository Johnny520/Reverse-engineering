package p121Y1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C1937g;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1757r(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC1289a interfaceC1289a, C1294f c1294f) {
        this.f6049d = arrayList;
        AbstractC2503g.m4445c(displayMetrics, "Argument must not be null");
        this.f6047b = displayMetrics;
        AbstractC2503g.m4445c(interfaceC1289a, "Argument must not be null");
        this.f6046a = interfaceC1289a;
        AbstractC2503g.m4445c(c1294f, "Argument must not be null");
        this.f6048c = c1294f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r1;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m3128c(C0072l0 c0072l0, BitmapFactory.Options options, InterfaceC1756q interfaceC1756q, InterfaceC1289a interfaceC1289a) {
        if (!options.inJustDecodeBounds) {
            interfaceC1756q.mo50s();
            switch (c0072l0.f306d) {
                case 11:
                    C1733A c1733a = (C1733A) ((C1937g) c0072l0.f307e).f6571e;
                    synchronized (c1733a) {
                        c1733a.f5988f = c1733a.f5986d.length;
                        break;
                    }
                    break;
            }
        }
        int i5 = options.outWidth;
        int i6 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = AbstractC1735C.f5995d;
        lock.lock();
        try {
            try {
                Bitmap bitmapM104h = c0072l0.m104h(options);
                lock.unlock();
                return bitmapM104h;
            } catch (IllegalArgumentException e5) {
                IOException iOExceptionM3130e = m3130e(e5, i5, i6, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOExceptionM3130e);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionM3130e;
                }
                try {
                    interfaceC1289a.mo154e(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapM3128c = m3128c(c0072l0, options, interfaceC1756q, interfaceC1289a);
                    AbstractC1735C.f5995d.unlock();
                    return bitmapM3128c;
                } catch (IOException unused) {
                    throw iOExceptionM3130e;
                }
            }
        } catch (Throwable th) {
            AbstractC1735C.f5995d.unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m3129d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static IOException m3130e(IllegalArgumentException illegalArgumentException, int i5, int i6, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i5 + ", outHeight: " + i6 + ", outMimeType: " + str + ", inBitmap: " + m3129d(options.inBitmap), illegalArgumentException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[CONST, INVOKE, CHECK_CAST, CONST] complete}, expected: {[CONST, INVOKE, CHECK_CAST] complete} */
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
    */
    public final android.graphics.Bitmap m3133b(p000A.C0072l0 r43, android.graphics.BitmapFactory.Options r44, p121Y1.C1755p r45, p078P1.EnumC1139a r46, p078P1.EnumC1148j r47, boolean r48, int r49, int r50, boolean r51, p121Y1.InterfaceC1756q r52) {
        /*
            r42 = this;
            r1 = r42
            r2 = r43
            r3 = r44
            r0 = r45
            r6 = r49
            r7 = r50
            r8 = r52
            int r9 = p195l2.AbstractC2505i.f8018b
            long r9 = android.os.SystemClock.elapsedRealtimeNanos()
            r11 = 1
            r3.inJustDecodeBounds = r11
            S1.a r12 = r1.f6046a
            m3128c(r2, r3, r8, r12)
            r13 = 0
            r3.inJustDecodeBounds = r13
            int r14 = r3.outWidth
            int r15 = r3.outHeight
            int[] r14 = new int[]{r14, r15}
            r15 = r14[r13]
            r14 = r14[r11]
            java.lang.String r11 = r3.outMimeType
            r13 = -1
            if (r15 == r13) goto L36
            if (r14 != r13) goto L33
            goto L36
        L33:
            r17 = r48
            goto L38
        L36:
            r17 = 0
        L38:
            int r13 = r2.f306d
            r19 = 0
            switch(r13) {
                case 10: goto Lbb;
                case 11: goto L9f;
                default: goto L3f;
            }
        L3f:
            java.lang.Object r13 = r2.f308f
            java.util.List r13 = (java.util.List) r13
            r20 = r9
            java.lang.Object r9 = r2.f309g
            com.bumptech.glide.load.data.g r9 = (com.bumptech.glide.load.data.C1937g) r9
            java.lang.Object r10 = r2.f307e
            S1.f r10 = (p093S1.C1294f) r10
            r48 = r9
            int r9 = r13.size()
            r22 = r11
            r11 = 0
        L56:
            if (r11 >= r9) goto L9d
            java.lang.Object r23 = r13.get(r11)
            r24 = r9
            r9 = r23
            P1.e r9 = (p078P1.InterfaceC1143e) r9
            r23 = r11
            Y1.A r11 = new Y1.A     // Catch: java.lang.Throwable -> L93
            r25 = r13
            java.io.FileInputStream r13 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L93
            android.os.ParcelFileDescriptor r26 = r48.m3600e()     // Catch: java.lang.Throwable -> L93
            java.io.FileDescriptor r5 = r26.getFileDescriptor()     // Catch: java.lang.Throwable -> L93
            r13.<init>(r5)     // Catch: java.lang.Throwable -> L93
            r11.<init>(r13, r10)     // Catch: java.lang.Throwable -> L93
            int r5 = r9.mo2194b(r11, r10)     // Catch: java.lang.Throwable -> L8f
            r11.m3091c()
            r48.m3600e()
            r9 = -1
            if (r5 == r9) goto L88
        L85:
            r13 = r5
            goto L106
        L88:
            int r11 = r23 + 1
            r9 = r24
            r13 = r25
            goto L56
        L8f:
            r0 = move-exception
            r19 = r11
            goto L94
        L93:
            r0 = move-exception
        L94:
            if (r19 == 0) goto L99
            r19.m3091c()
        L99:
            r48.m3600e()
            throw r0
        L9d:
            r13 = -1
            goto L106
        L9f:
            r20 = r9
            r22 = r11
            java.lang.Object r5 = r2.f309g
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r9 = r2.f307e
            com.bumptech.glide.load.data.g r9 = (com.bumptech.glide.load.data.C1937g) r9
            java.lang.Object r9 = r9.f6571e
            Y1.A r9 = (p121Y1.C1733A) r9
            r9.reset()
            java.lang.Object r10 = r2.f308f
            S1.f r10 = (p093S1.C1294f) r10
            int r13 = com.bumptech.glide.AbstractC1922d.m3432m(r5, r9, r10)
            goto L106
        Lbb:
            r20 = r9
            r22 = r11
            java.lang.Object r5 = r2.f308f
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r9 = r2.f307e
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9
            java.nio.ByteBuffer r9 = p195l2.AbstractC2498b.m4440c(r9)
            java.lang.Object r10 = r2.f309g
            S1.f r10 = (p093S1.C1294f) r10
            if (r9 != 0) goto Ld3
        Ld1:
            r10 = -1
            goto L105
        Ld3:
            int r11 = r5.size()
            r13 = 0
        Ld8:
            if (r13 >= r11) goto Ld1
            java.lang.Object r23 = r5.get(r13)
            r48 = r5
            r5 = r23
            P1.e r5 = (p078P1.InterfaceC1143e) r5
            int r5 = r5.mo2196d(r9, r10)     // Catch: java.lang.Throwable -> Lfc
            r23 = r10
            r10 = 0
            java.nio.Buffer r16 = r9.position(r10)
            java.nio.ByteBuffer r16 = (java.nio.ByteBuffer) r16
            r10 = -1
            if (r5 == r10) goto Lf5
            goto L85
        Lf5:
            int r13 = r13 + 1
            r5 = r48
            r10 = r23
            goto Ld8
        Lfc:
            r0 = move-exception
            r10 = 0
            java.nio.Buffer r2 = r9.position(r10)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            throw r0
        L105:
            r13 = r10
        L106:
            r5 = 90
            switch(r13) {
                case 3: goto L112;
                case 4: goto L112;
                case 5: goto L110;
                case 6: goto L110;
                case 7: goto L10d;
                case 8: goto L10d;
                default: goto L10b;
            }
        L10b:
            r10 = 0
            goto L114
        L10d:
            r10 = 270(0x10e, float:3.78E-43)
            goto L114
        L110:
            r10 = r5
            goto L114
        L112:
            r10 = 180(0xb4, float:2.52E-43)
        L114:
            switch(r13) {
                case 2: goto L119;
                case 3: goto L119;
                case 4: goto L119;
                case 5: goto L119;
                case 6: goto L119;
                case 7: goto L119;
                case 8: goto L119;
                default: goto L117;
            }
        L117:
            r11 = 0
            goto L11a
        L119:
            r11 = 1
        L11a:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r9) goto L12d
            if (r10 == r5) goto L128
            r5 = 270(0x10e, float:3.78E-43)
            if (r10 != r5) goto L125
            goto L12a
        L125:
            r27 = r15
            goto L131
        L128:
            r5 = 270(0x10e, float:3.78E-43)
        L12a:
            r27 = r14
            goto L131
        L12d:
            r5 = 270(0x10e, float:3.78E-43)
            r27 = r6
        L131:
            if (r7 != r9) goto L13e
            r9 = 90
            if (r10 == r9) goto L13c
            if (r10 != r5) goto L13a
            goto L13c
        L13a:
            r5 = r14
            goto L13f
        L13c:
            r5 = r15
            goto L13f
        L13e:
            r5 = r7
        L13f:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = r2.m108l()
            r23 = r13
            java.lang.String r13 = ", target density: "
            java.lang.String r7 = ", density: "
            r26 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r6 = "x"
            java.lang.String r4 = "Downsampler"
            r28 = r11
            java.lang.String r11 = "]"
            if (r15 <= 0) goto L157
            if (r14 > 0) goto L161
        L157:
            r8 = r7
            r0 = r11
            r45 = r12
            r7 = r13
            r1 = r27
            r10 = 3
            goto L363
        L161:
            r1 = 90
            if (r10 == r1) goto L175
            r1 = 270(0x10e, float:3.78E-43)
            if (r10 != r1) goto L16a
            goto L175
        L16a:
            r18 = r7
            r48 = r11
            r7 = r14
            r11 = r15
        L170:
            r1 = r27
            r27 = r13
            goto L17c
        L175:
            r18 = r7
            r48 = r11
            r11 = r14
            r7 = r15
            goto L170
        L17c:
            float r13 = r0.m3127b(r11, r7, r1, r5)
            r29 = 0
            int r29 = (r13 > r29 ? 1 : (r13 == r29 ? 0 : -1))
            if (r29 <= 0) goto L325
            r29 = r13
            int r13 = r0.m3126a(r11, r7, r1, r5)
            if (r13 == 0) goto L31d
            r30 = r10
            float r10 = (float) r11
            r48 = r10
            float r10 = r29 * r48
            r31 = r11
            double r10 = (double) r10
            r32 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r10 = r10 + r32
            int r10 = (int) r10
            float r11 = (float) r7
            r34 = r7
            float r7 = r29 * r11
            r35 = r10
            r36 = r11
            double r10 = (double) r7
            double r10 = r10 + r32
            int r7 = (int) r10
            int r11 = r31 / r35
            int r7 = r34 / r7
            r10 = 1
            if (r13 != r10) goto L1b6
            int r7 = java.lang.Math.max(r11, r7)
            goto L1ba
        L1b6:
            int r7 = java.lang.Math.min(r11, r7)
        L1ba:
            int r7 = java.lang.Integer.highestOneBit(r7)
            int r7 = java.lang.Math.max(r10, r7)
            if (r13 != r10) goto L1cd
            float r10 = (float) r7
            float r11 = r26 / r29
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 >= 0) goto L1cd
            int r7 = r7 << 1
        L1cd:
            r3.inSampleSize = r7
            com.bumptech.glide.load.ImageHeaderParser$ImageType r10 = com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG
            if (r9 != r10) goto L1f4
            r9 = 8
            int r9 = java.lang.Math.min(r7, r9)
            float r9 = (float) r9
            float r10 = r48 / r9
            double r10 = (double) r10
            double r10 = java.lang.Math.ceil(r10)
            int r10 = (int) r10
            float r11 = r36 / r9
            r13 = r10
            double r9 = (double) r11
            double r9 = java.lang.Math.ceil(r9)
            int r9 = (int) r9
            int r10 = r7 / 8
            if (r10 <= 0) goto L234
            int r11 = r13 / r10
            int r9 = r9 / r10
            r10 = r11
            goto L249
        L1f4:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r10 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG
            if (r9 == r10) goto L236
            com.bumptech.glide.load.ImageHeaderParser$ImageType r10 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A
            if (r9 != r10) goto L1fd
            goto L236
        L1fd:
            boolean r9 = r9.isWebp()
            if (r9 == 0) goto L211
            float r9 = (float) r7
            float r10 = r48 / r9
            int r10 = java.lang.Math.round(r10)
            float r11 = r36 / r9
            int r9 = java.lang.Math.round(r11)
            goto L249
        L211:
            int r11 = r31 % r7
            if (r11 != 0) goto L219
            int r9 = r34 % r7
            if (r9 == 0) goto L21b
        L219:
            r10 = 1
            goto L220
        L21b:
            int r10 = r31 / r7
            int r9 = r34 / r7
            goto L249
        L220:
            r3.inJustDecodeBounds = r10
            m3128c(r2, r3, r8, r12)
            r9 = 0
            r3.inJustDecodeBounds = r9
            int r11 = r3.outWidth
            int r13 = r3.outHeight
            int[] r11 = new int[]{r11, r13}
            r13 = r11[r9]
            r9 = r11[r10]
        L234:
            r10 = r13
            goto L249
        L236:
            float r9 = (float) r7
            float r10 = r48 / r9
            double r10 = (double) r10
            double r10 = java.lang.Math.floor(r10)
            int r10 = (int) r10
            float r11 = r36 / r9
            r13 = r10
            double r9 = (double) r11
            double r9 = java.lang.Math.floor(r9)
            int r9 = (int) r9
            goto L234
        L249:
            float r0 = r0.m3127b(r10, r9, r1, r5)
            r13 = r12
            double r11 = (double) r0
            r34 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r11 > r34 ? 1 : (r11 == r34 ? 0 : -1))
            if (r0 > 0) goto L258
            r36 = r11
            goto L25a
        L258:
            double r36 = r34 / r11
        L25a:
            r38 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r36 = r36 * r38
            r40 = r11
            long r11 = java.lang.Math.round(r36)
            int r11 = (int) r11
            r45 = r13
            double r12 = (double) r11
            double r12 = r12 * r40
            double r12 = r12 + r32
            int r12 = (int) r12
            float r13 = (float) r12
            float r11 = (float) r11
            float r13 = r13 / r11
            r11 = r7
            double r7 = (double) r13
            double r7 = r40 / r7
            double r12 = (double) r12
            double r7 = r7 * r12
            double r7 = r7 + r32
            int r7 = (int) r7
            r3.inTargetDensity = r7
            if (r0 > 0) goto L283
            r34 = r40
            goto L285
        L283:
            double r34 = r34 / r40
        L285:
            double r34 = r34 * r38
            long r7 = java.lang.Math.round(r34)
            int r0 = (int) r7
            r3.inDensity = r0
            int r7 = r3.inTargetDensity
            if (r7 <= 0) goto L29b
            if (r0 <= 0) goto L29b
            if (r7 == r0) goto L29b
            r7 = 1
            r3.inScaled = r7
        L299:
            r7 = 2
            goto L2a1
        L29b:
            r7 = 0
            r3.inTargetDensity = r7
            r3.inDensity = r7
            goto L299
        L2a1:
            boolean r0 = android.util.Log.isLoggable(r4, r7)
            if (r0 == 0) goto L318
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "Calculate scaling, source: ["
            r0.<init>(r7)
            r0.append(r15)
            r0.append(r6)
            r0.append(r14)
            java.lang.String r7 = "], degreesToRotate: "
            r0.append(r7)
            r7 = r30
            r0.append(r7)
            java.lang.String r7 = ", target: ["
            r0.append(r7)
            r0.append(r1)
            r0.append(r6)
            r0.append(r5)
            java.lang.String r7 = "], power of two scaled: ["
            r0.append(r7)
            r0.append(r10)
            r0.append(r6)
            r0.append(r9)
            java.lang.String r7 = "], exact scale factor: "
            r0.append(r7)
            r7 = r29
            r0.append(r7)
            java.lang.String r7 = ", power of 2 sample size: "
            r0.append(r7)
            r0.append(r11)
            java.lang.String r7 = ", adjusted scale factor: "
            r0.append(r7)
            r7 = r40
            r0.append(r7)
            r7 = r27
            r0.append(r7)
            int r8 = r3.inTargetDensity
            r0.append(r8)
            r8 = r18
            r0.append(r8)
            int r9 = r3.inDensity
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r4, r0)
        L314:
            r9 = r42
            goto L38c
        L318:
            r8 = r18
            r7 = r27
            goto L314
        L31d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L325:
            r7 = r13
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot scale with factor: "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r4 = " from: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ", source: ["
            r3.append(r0)
            r3.append(r15)
            r3.append(r6)
            r3.append(r14)
            java.lang.String r0 = "], target: ["
            r3.append(r0)
            r3.append(r1)
            r3.append(r6)
            r3.append(r5)
            r0 = r48
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L363:
            boolean r11 = android.util.Log.isLoggable(r4, r10)
            if (r11 == 0) goto L314
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Unable to determine dimensions for: "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = " with target ["
            r10.append(r9)
            r10.append(r1)
            r10.append(r6)
            r10.append(r5)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            android.util.Log.d(r4, r0)
            goto L314
        L38c:
            Y1.z r0 = r9.f6050e
            r10 = r17
            r11 = r28
            boolean r0 = r0.m3154c(r1, r5, r10, r11)
            if (r0 == 0) goto L3a0
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.HARDWARE
            r3.inPreferredConfig = r10
            r10 = 0
            r3.inMutable = r10
            goto L3a1
        L3a0:
            r10 = 0
        L3a1:
            if (r0 == 0) goto L3a5
        L3a3:
            r11 = 1
            goto L3e4
        L3a5:
            P1.a r0 = p078P1.EnumC1139a.f3774d
            r11 = r46
            if (r11 == r0) goto L3df
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r2.m108l()     // Catch: java.io.IOException -> L3b4
            boolean r0 = r0.hasAlpha()     // Catch: java.io.IOException -> L3b4
            goto L3ce
        L3b4:
            r0 = move-exception
            r12 = 3
            boolean r12 = android.util.Log.isLoggable(r4, r12)
            if (r12 == 0) goto L3cd
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Cannot determine whether the image has alpha or not from header, format "
            r12.<init>(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            android.util.Log.d(r4, r11, r0)
        L3cd:
            r0 = r10
        L3ce:
            if (r0 == 0) goto L3d3
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            goto L3d5
        L3d3:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L3d5:
            r3.inPreferredConfig = r0
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.RGB_565
            if (r0 != r11) goto L3a3
            r11 = 1
            r3.inDither = r11
            goto L3e4
        L3df:
            r11 = 1
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r3.inPreferredConfig = r0
        L3e4:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r15 < 0) goto L3ef
            if (r14 < 0) goto L3ef
            if (r51 == 0) goto L3ef
            r10 = r1
            goto L474
        L3ef:
            int r1 = r3.inTargetDensity
            if (r1 <= 0) goto L3fb
            int r5 = r3.inDensity
            if (r5 <= 0) goto L3fb
            if (r1 == r5) goto L3fb
            r5 = r11
            goto L3fc
        L3fb:
            r5 = r10
        L3fc:
            if (r5 == 0) goto L404
            float r1 = (float) r1
            int r5 = r3.inDensity
            float r5 = (float) r5
            float r1 = r1 / r5
            goto L406
        L404:
            r1 = r26
        L406:
            int r5 = r3.inSampleSize
            float r12 = (float) r15
            float r13 = (float) r5
            float r12 = r12 / r13
            double r10 = (double) r12
            double r10 = java.lang.Math.ceil(r10)
            int r10 = (int) r10
            float r11 = (float) r14
            float r11 = r11 / r13
            double r11 = (double) r11
            double r11 = java.lang.Math.ceil(r11)
            int r11 = (int) r11
            float r10 = (float) r10
            float r10 = r10 * r1
            int r10 = java.lang.Math.round(r10)
            float r11 = (float) r11
            float r11 = r11 * r1
            int r11 = java.lang.Math.round(r11)
            r12 = 2
            boolean r13 = android.util.Log.isLoggable(r4, r12)
            if (r13 == 0) goto L473
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Calculated target ["
            r12.<init>(r13)
            r12.append(r10)
            r12.append(r6)
            r12.append(r11)
            java.lang.String r13 = "] for source ["
            r12.append(r13)
            r12.append(r15)
            r12.append(r6)
            r12.append(r14)
            java.lang.String r13 = "], sampleSize: "
            r12.append(r13)
            r12.append(r5)
            java.lang.String r5 = ", targetDensity: "
            r12.append(r5)
            int r5 = r3.inTargetDensity
            r12.append(r5)
            r12.append(r8)
            int r5 = r3.inDensity
            r12.append(r5)
            java.lang.String r5 = ", density multiplier: "
            r12.append(r5)
            r12.append(r1)
            java.lang.String r1 = r12.toString()
            android.util.Log.v(r4, r1)
        L473:
            r5 = r11
        L474:
            if (r10 <= 0) goto L48f
            if (r5 <= 0) goto L48f
            android.graphics.Bitmap$Config r1 = r3.inPreferredConfig
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.HARDWARE
            if (r1 != r11) goto L47f
            goto L48f
        L47f:
            android.graphics.Bitmap$Config r11 = r3.outConfig
            if (r11 != 0) goto L486
        L483:
            r13 = r45
            goto L488
        L486:
            r1 = r11
            goto L483
        L488:
            android.graphics.Bitmap r1 = r13.mo151b(r10, r5, r1)
            r3.inBitmap = r1
            goto L491
        L48f:
            r13 = r45
        L491:
            if (r47 == 0) goto L4b7
            r1 = 28
            if (r0 < r1) goto L4ba
            P1.j r0 = p078P1.EnumC1148j.f3786d
            r5 = r47
            if (r5 != r0) goto L4a9
            android.graphics.ColorSpace r0 = r3.outColorSpace
            if (r0 == 0) goto L4a9
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L4a9
            r11 = 1
            goto L4aa
        L4a9:
            r11 = 0
        L4aa:
            if (r11 == 0) goto L4af
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L4b1
        L4af:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L4b1:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
        L4b7:
            r1 = r52
            goto L4c3
        L4ba:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
            goto L4b7
        L4c3:
            android.graphics.Bitmap r0 = m3128c(r2, r3, r1, r13)
            r1.mo33b(r13, r0)
            r12 = 2
            boolean r1 = android.util.Log.isLoggable(r4, r12)
            if (r1 == 0) goto L554
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Decoded "
            r1.<init>(r2)
            java.lang.String r2 = m3129d(r0)
            r1.append(r2)
            java.lang.String r2 = " from ["
            r1.append(r2)
            r1.append(r15)
            r1.append(r6)
            r1.append(r14)
            java.lang.String r2 = "] "
            r1.append(r2)
            r2 = r22
            r1.append(r2)
            java.lang.String r2 = " with inBitmap "
            r1.append(r2)
            android.graphics.Bitmap r2 = r3.inBitmap
            java.lang.String r2 = m3129d(r2)
            r1.append(r2)
            java.lang.String r2 = " for ["
            r1.append(r2)
            r2 = r49
            r1.append(r2)
            r1.append(r6)
            r2 = r50
            r1.append(r2)
            java.lang.String r2 = "], sample size: "
            r1.append(r2)
            int r2 = r3.inSampleSize
            r1.append(r2)
            r1.append(r8)
            int r2 = r3.inDensity
            r1.append(r2)
            r1.append(r7)
            int r2 = r3.inTargetDensity
            r1.append(r2)
            java.lang.String r2 = ", thread: "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = ", duration: "
            r1.append(r2)
            double r2 = p195l2.AbstractC2505i.m4446a(r20)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r4, r1)
        L554:
            if (r0 == 0) goto L5c9
            android.util.DisplayMetrics r1 = r9.f6047b
            int r1 = r1.densityDpi
            r0.setDensity(r1)
            switch(r23) {
                case 2: goto L562;
                case 3: goto L562;
                case 4: goto L562;
                case 5: goto L562;
                case 6: goto L562;
                case 7: goto L562;
                case 8: goto L562;
                default: goto L560;
            }
        L560:
            r1 = r0
            goto L5be
        L562:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r2 = 1127481344(0x43340000, float:180.0)
            r3 = 1119092736(0x42b40000, float:90.0)
            r4 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r23) {
                case 2: goto L59a;
                case 3: goto L596;
                case 4: goto L58d;
                case 5: goto L584;
                case 6: goto L580;
                case 7: goto L577;
                case 8: goto L573;
                default: goto L572;
            }
        L572:
            goto L59f
        L573:
            r1.setRotate(r4)
            goto L59f
        L577:
            r1.setRotate(r4)
            r4 = r26
            r1.postScale(r5, r4)
            goto L59f
        L580:
            r1.setRotate(r3)
            goto L59f
        L584:
            r4 = r26
            r1.setRotate(r3)
            r1.postScale(r5, r4)
            goto L59f
        L58d:
            r4 = r26
            r1.setRotate(r2)
            r1.postScale(r5, r4)
            goto L59f
        L596:
            r1.setRotate(r2)
            goto L59f
        L59a:
            r4 = r26
            r1.setScale(r5, r4)
        L59f:
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            r4 = 1
            r5 = 0
            r6 = 0
            r43 = r0
            r48 = r1
            r46 = r2
            r47 = r3
            r49 = r4
            r44 = r5
            r45 = r6
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r43, r44, r45, r46, r47, r48, r49)
            r1 = r43
        L5be:
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L5c7
            r13.mo154e(r1)
        L5c7:
            r19 = r0
        L5c9:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: p121Y1.C1757r.m3133b(A.l0, android.graphics.BitmapFactory$Options, Y1.p, P1.a, P1.j, boolean, int, int, boolean, Y1.q):android.graphics.Bitmap");
    }
}
