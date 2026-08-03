package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: o6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2306o6 implements InterfaceC2518sw {

    /* JADX INFO: renamed from: f */
    public static final C2220m6 f8080f = null;

    /* JADX INFO: renamed from: g */
    public static final C2263n6 f8081g = null;

    /* JADX INFO: renamed from: a */
    public final Context f8082a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f8083b;

    /* JADX INFO: renamed from: c */
    public final C2263n6 f8084c;

    /* JADX INFO: renamed from: d */
    public final C2220m6 f8085d;

    /* JADX INFO: renamed from: e */
    public final C0649P3 f8086e;

    static {
        f8080f = new C2220m6(1);
        f8081g = new C2263n6(0);
    }

    public C2306o6(Context r1, ArrayList r2, InterfaceC0565N5 r3, C2812zp r4) {
        this.f8082a = r1.getApplicationContext();
        this.f8083b = r2;
        this.f8085d = f8080f;
        this.f8086e = new C0649P3(18, r3, r4);
        this.f8084c = f8081g;
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo749a(Object r8, int r9, int r10, C2644vt r11) {
        ByteBuffer r2 = (ByteBuffer) r8;
        C2263n6 r82 = this.f8084c;
        monitor-enter(r82);
        C0413Jj r0 = (C0413Jj) r82.f7981a.poll();     // Catch: Throwable -> L20
        if (r0 == null) goto L29;
    L7:
        C0413Jj r5 = r0;
        r5.f1383b = null;     // Catch: Throwable -> L20
        Arrays.fill(r5.f1382a, (byte) 0);     // Catch: Throwable -> L20
        r5.f1384c = new C0370Ij();     // Catch: Throwable -> L20
        r5.f1385d = 0;     // Catch: Throwable -> L20
        ByteBuffer r02 = r2.asReadOnlyBuffer();     // Catch: Throwable -> L20
        r5.f1383b = r02;     // Catch: Throwable -> L20
        r02.position(0);     // Catch: Throwable -> L20
        r5.f1383b.order(ByteOrder.LITTLE_ENDIAN);     // Catch: Throwable -> L20
        monitor-exit(r82);
        C0069Bj r83 = m4684c(r2, r9, r10, r5, r11);     // Catch: Throwable -> L17
        this.f8084c.m4602a(r5);
        return r83;
    L17:
        th = move-exception;
        this.f8084c.m4602a(r5);
        throw th;
    L29:
        r0 = new C0413Jj();     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        Throwable r92 = th;
    L31:
        monitor-exit(r82);     // Catch: Throwable -> L25
        throw r92;
    L25:
        th = th;
    L22:
        r92 = th;
        goto L31
    L35:
        th = th;
    L20:
        th = th;
        goto L22
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final boolean mo750b(Object r2, C2644vt r3) {
        ByteBuffer r22 = (ByteBuffer) r2;
        if (((Boolean) r3.m5177c(AbstractC0456Kj.f1499b)).booleanValue() == false) goto L5;
        return false;
    L5:
        if (AbstractC1406fG.m2698X(this.f8083b, r22) != ImageHeaderParser$ImageType.GIF) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final C0069Bj m4684c(ByteBuffer r18, int r19, int r20, C0413Jj r21, C2644vt r22) {
        int r0 = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        C0370Ij r02 = r21.m858b();     // Catch: Throwable -> L11
        if (r02.f1287c <= 0) goto L30;
        if (r02.f1286b != 0) goto L30;
        if (r22.m5177c(AbstractC0456Kj.f1498a) != EnumC0191Ec.f577b) goto L13;
        Bitmap.Config r4 = Bitmap.Config.RGB_565;     // Catch: Throwable -> L11
    L14:
        int r6 = Math.min(r02.f1291g / r20, r02.f1290f / r19);     // Catch: Throwable -> L11
        if (r6 != 0) goto L17;
        int r62 = 0;
    L18:
        int r63 = Math.max(1, r62);     // Catch: Throwable -> L11
        C2220m6 r9 = this.f8085d;     // Catch: Throwable -> L11
        C0649P3 r10 = this.f8086e;     // Catch: Throwable -> L11
        r9.getClass();     // Catch: Throwable -> L11
        C0986Wy r13 = new C0986Wy(r10, r02, r18, r63);     // Catch: Throwable -> L11
        r13.m1865c(r4);     // Catch: Throwable -> L11
        r13.f3111k = (r13.f3111k + 1) % r13.f3112l.f1287c;     // Catch: Throwable -> L11
        Bitmap r16 = r13.m1864b();     // Catch: Throwable -> L11
        if (r16 == null) goto L21;
        C0069Bj r42 = new C0069Bj(new C0026Aj(new C0476L2(1, new C0327Hj(ComponentCallbacks2C1273a.m2412a(this.f8082a), r13, r19, r20, r16))), 0);     // Catch: Throwable -> L11
        if (Log.isLoggable("BufferGifDecoder", 2) == false) goto L28;
        SystemClock.elapsedRealtimeNanos();
    L28:
        return r42;
    L21:
        if (Log.isLoggable("BufferGifDecoder", 2) == false) goto L32;
        SystemClock.elapsedRealtimeNanos();
        return null;
    L32:
        return null;
    L17:
        r62 = Integer.highestOneBit(r6);     // Catch: Throwable -> L11
        goto L18
    L13:
        r4 = Bitmap.Config.ARGB_8888;     // Catch: Throwable -> L11
    L30:
        if (Log.isLoggable("BufferGifDecoder", 2) == false) goto L32;
        SystemClock.elapsedRealtimeNanos();
    L11:
        th = move-exception;
        if (Log.isLoggable("BufferGifDecoder", 2) == false) goto L36;
        SystemClock.elapsedRealtimeNanos();
    L36:
        throw th;
    }
}
