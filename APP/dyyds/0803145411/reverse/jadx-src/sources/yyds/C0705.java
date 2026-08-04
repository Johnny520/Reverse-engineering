package yyds;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0040;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᛳᲁᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0705 implements InterfaceC0814 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C0362 f3313 = new C0362(0);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Context f3314;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ArrayList f3315;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0362 f3316 = f3313;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2133 f3317;

    public C0705(Context context, ArrayList arrayList, InterfaceC2587 interfaceC2587, C2267 c2267) {
        this.f3314 = context.getApplicationContext();
        this.f3315 = arrayList;
        this.f3317 = new C2133(interfaceC2587, 25, c2267);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static int m1620(C0069 c0069, int i, int i2) {
        int iMin = Math.min(c0069.f613 / i2, c0069.f617 / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + c0069.f617 + "x" + c0069.f613 + "]");
        }
        return iMax;
    }

    @Override // yyds.InterfaceC0814
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo427(Object obj, C0822 c0822) {
        return !((Boolean) c0822.m1891(AbstractC0875.f3994)).booleanValue() && AbstractC1741.m3463(this.f3315, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // yyds.InterfaceC0814
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final InterfaceC2162 mo428(Object obj, int i, int i2, C0822 c0822) {
        C1929 c1929;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C0362 c0362 = this.f3316;
        synchronized (c0362) {
            try {
                C1929 c19292 = (C1929) c0362.f1876.poll();
                if (c19292 == null) {
                    c19292 = new C1929();
                }
                c1929 = c19292;
                c1929.f9724 = null;
                Arrays.fill(c1929.f9723, (byte) 0);
                c1929.f9725 = new C0069();
                c1929.f9726 = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                c1929.f9724 = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                c1929.f9724.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return m1621(byteBuffer, i, i2, c1929, c0822);
        } finally {
            this.f3316.m1060(c1929);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1003 m1621(ByteBuffer byteBuffer, int i, int i2, C1929 c1929, C0822 c0822) {
        StringBuilder sb;
        int i3 = AbstractC1382.f6429;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C0069 c0069M3724 = c1929.m3724();
            if (c0069M3724.f616 > 0 && c0069M3724.f612 == 0) {
                Bitmap.Config config = c0822.m1891(AbstractC0875.f3993) == EnumC1896.f9606 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                C1575 c1575 = new C1575(this.f3317, c0069M3724, byteBuffer, m1620(c0069M3724, i, i2));
                c1575.m3220(config);
                c1575.f7991 = (c1575.f7991 + 1) % c1575.f7992.f616;
                Bitmap bitmapM3219 = c1575.m3219();
                if (bitmapM3219 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(AbstractC1382.m2794(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                C1003 c1003 = new C1003(new C2380(new C2492(new C2445(ComponentCallbacks2C0040.m249(this.f3314), c1575, i, i2, bitmapM3219))), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC1382.m2794(jElapsedRealtimeNanos));
                }
                return c1003;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(AbstractC1382.m2794(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } finally {
        }
    }
}
