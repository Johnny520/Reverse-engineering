package p142c2;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.ComponentCallbacks2C1921c;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p000A.C0038T0;
import p073O1.C1040b;
import p073O1.C1041c;
import p073O1.C1042d;
import p078P1.C1147i;
import p078P1.EnumC1139a;
import p078P1.InterfaceC1149k;
import p093S1.C1294f;
import p093S1.InterfaceC1289a;
import p097T1.C1414c;
import p110W0.C1577b;
import p131a2.C1799c;
import p195l2.AbstractC2505i;

/* JADX INFO: renamed from: c2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1890a implements InterfaceC1149k {

    /* JADX INFO: renamed from: f */
    public static final C1577b f6418f = new C1577b(13);

    /* JADX INFO: renamed from: g */
    public static final C1414c f6419g = new C1414c(1);

    /* JADX INFO: renamed from: a */
    public final Context f6420a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f6421b;

    /* JADX INFO: renamed from: e */
    public final C0038T0 f6424e;

    /* JADX INFO: renamed from: d */
    public final C1577b f6423d = f6418f;

    /* JADX INFO: renamed from: c */
    public final C1414c f6422c = f6419g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1890a(Context context, ArrayList arrayList, InterfaceC1289a interfaceC1289a, C1294f c1294f) {
        this.f6420a = context.getApplicationContext();
        this.f6421b = arrayList;
        this.f6424e = new C0038T0(28, interfaceC1289a, c1294f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static int m3374d(C1040b c1040b, int i5, int i6) {
        int iMin = Math.min(c1040b.f3252g / i6, c1040b.f3251f / i5);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i5 + "x" + i6 + "], actual dimens: [" + c1040b.f3251f + "x" + c1040b.f3252g + "]");
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:25:0x0059) to fix multi-entry loop: BACK_EDGE: B:25:0x0059 -> B:22:0x0056 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: a */
    public final p088R1.InterfaceC1194D mo2202a(java.lang.Object r8, int r9, int r10, p078P1.C1147i r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            T1.c r8 = r7.f6422c
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f5060a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            O1.c r0 = (p073O1.C1041c) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            O1.c r0 = new O1.c     // Catch: java.lang.Throwable -> L17
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
            r5.f3258b = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.f3257a     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            O1.b r0 = new O1.b     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.f3259c = r0     // Catch: java.lang.Throwable -> L54
            r5.f3260d = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.f3258b = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.f3258b     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            a2.c r8 = r1.m3375c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            T1.c r9 = r1.f6422c
            r9.m2717a(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            T1.c r9 = r1.f6422c
            r9.m2717a(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: p142c2.C1890a.mo2202a(java.lang.Object, int, int, P1.i):R1.D");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: b */
    public final boolean mo2203b(Object obj, C1147i c1147i) {
        return !((Boolean) c1147i.m2201c(AbstractC1897h.f6461b)).booleanValue() && AbstractC1922d.m3439v(this.f6421b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C1799c m3375c(ByteBuffer byteBuffer, int i5, int i6, C1041c c1041c, C1147i c1147i) {
        StringBuilder sb;
        int i7 = AbstractC2505i.f8018b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C1040b c1040bM2114b = c1041c.m2114b();
            C1799c c1799c = null;
            if (c1040bM2114b.f3248c > 0 && c1040bM2114b.f3247b == 0) {
                Bitmap.Config config = c1147i.m2201c(AbstractC1897h.f6460a) == EnumC1139a.f3775e ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iM3374d = m3374d(c1040bM2114b, i5, i6);
                C1577b c1577b = this.f6423d;
                C0038T0 c0038t0 = this.f6424e;
                c1577b.getClass();
                C1042d c1042d = new C1042d(c0038t0, c1040bM2114b, byteBuffer, iM3374d);
                c1042d.m2121c(config);
                c1042d.f3271k = (c1042d.f3271k + 1) % c1042d.f3272l.f3248c;
                Bitmap bitmapM2120b = c1042d.m2120b();
                if (bitmapM2120b == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                    }
                    return null;
                }
                c1799c = new C1799c(new C1892c(new C1891b(new C1896g(ComponentCallbacks2C1921c.m3413a(this.f6420a), c1042d, i5, i6, bitmapM2120b))), 1);
                if (!Log.isLoggable("BufferGifDecoder", 2)) {
                    return c1799c;
                }
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(AbstractC2505i.m4446a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return c1799c;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(AbstractC2505i.m4446a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return c1799c;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC2505i.m4446a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
