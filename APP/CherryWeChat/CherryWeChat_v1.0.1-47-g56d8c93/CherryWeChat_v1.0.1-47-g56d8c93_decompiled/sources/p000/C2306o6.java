package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: o6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2306o6 implements InterfaceC2518sw {

    /* JADX INFO: renamed from: f */
    public static final C2220m6 f8080f = new C2220m6(1);

    /* JADX INFO: renamed from: g */
    public static final C2263n6 f8081g = new C2263n6(0);

    /* JADX INFO: renamed from: a */
    public final Context f8082a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f8083b;

    /* JADX INFO: renamed from: e */
    public final C0649P3 f8086e;

    /* JADX INFO: renamed from: d */
    public final C2220m6 f8085d = f8080f;

    /* JADX INFO: renamed from: c */
    public final C2263n6 f8084c = f8081g;

    public C2306o6(Context context, ArrayList arrayList, InterfaceC0565N5 interfaceC0565N5, C2812zp c2812zp) {
        this.f8082a = context.getApplicationContext();
        this.f8083b = arrayList;
        this.f8086e = new C0649P3(18, interfaceC0565N5, c2812zp);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    public final p000.InterfaceC2389pw mo749a(java.lang.Object r8, int r9, int r10, p000.C2644vt r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            n6 r8 = r7.f8084c
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f7981a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            Jj r0 = (p000.C0413Jj) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            Jj r0 = new Jj     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L57
        L1b:
            r0 = 0
            r5.f1383b = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.f1382a     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            Ij r0 = new Ij     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.f1384c = r0     // Catch: java.lang.Throwable -> L54
            r5.f1385d = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.f1383b = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.f1383b     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            Bj r8 = r1.m4684c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            n6 r9 = r1.f8084c
            r9.m4602a(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            n6 r9 = r1.f8084c
            r9.m4602a(r5)
            throw r8
        L54:
            r0 = move-exception
            r1 = r7
        L56:
            r9 = r0
        L57:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2306o6.mo749a(java.lang.Object, int, int, vt):pw");
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final boolean mo750b(Object obj, C2644vt c2644vt) {
        return !((Boolean) c2644vt.m5177c(AbstractC0456Kj.f1499b)).booleanValue() && AbstractC1406fG.m2698X(this.f8083b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /* JADX INFO: renamed from: c */
    public final C0069Bj m4684c(ByteBuffer byteBuffer, int i, int i2, C0413Jj c0413Jj, C2644vt c2644vt) {
        int i3 = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        try {
            C0370Ij c0370IjM858b = c0413Jj.m858b();
            if (c0370IjM858b.f1287c > 0 && c0370IjM858b.f1286b == 0) {
                Bitmap.Config config = c2644vt.m5177c(AbstractC0456Kj.f1498a) == EnumC0191Ec.f577b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(c0370IjM858b.f1291g / i2, c0370IjM858b.f1290f / i);
                int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
                C2220m6 c2220m6 = this.f8085d;
                C0649P3 c0649p3 = this.f8086e;
                c2220m6.getClass();
                C0986Wy c0986Wy = new C0986Wy(c0649p3, c0370IjM858b, byteBuffer, iMax);
                c0986Wy.m1865c(config);
                c0986Wy.f3111k = (c0986Wy.f3111k + 1) % c0986Wy.f3112l.f1287c;
                Bitmap bitmapM1864b = c0986Wy.m1864b();
                if (bitmapM1864b != null) {
                    C0069Bj c0069Bj = new C0069Bj(new C0026Aj(new C0476L2(1, new C0327Hj(ComponentCallbacks2C1273a.m2412a(this.f8082a), c0986Wy, i, i2, bitmapM1864b))), 0);
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        SystemClock.elapsedRealtimeNanos();
                    }
                    return c0069Bj;
                }
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                    return null;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
