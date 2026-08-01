package p234;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import p075.C6961;
import p129.C7487;
import p222.AbstractC7986;
import p230.C8050;
import p230.C8053;
import p285.C8387;
import p285.C8388;
import p285.C8389;
import p286.C8397;
import p286.InterfaceC8400;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8083 implements InterfaceC8400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C6961 f22285 = new C6961(17);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C8050 f22286 = new C8050(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8053 f22287;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6961 f22288 = f22285;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8050 f22289 = f22286;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f22290;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f22291;

    public C8083(Context context, ArrayList arrayList, InterfaceC2979 interfaceC2979, C2974 c2974) {
        this.f22291 = context.getApplicationContext();
        this.f22290 = arrayList;
        this.f22287 = new C8053(interfaceC2979, c2974);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m13561(C8389 c8389, int i, int i2) {
        int iMin = Math.min(c8389.f23254 / i2, c8389.f23247 / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbM149 = AbstractC0053.m149(iMax, i, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            sbM149.append(i2);
            sbM149.append("], actual dimens: [");
            sbM149.append(c8389.f23247);
            sbM149.append("x");
            sbM149.append(c8389.f23254);
            sbM149.append("]");
            Log.v("BufferGifDecoder", sbM149.toString());
        }
        return iMax;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8081 m13562(ByteBuffer byteBuffer, int i, int i2, C8388 c8388, C8397 c8397) {
        StringBuilder sb;
        int i3 = AbstractC7986.f22064;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C8389 c8389M13962 = c8388.m13962();
            if (c8389M13962.f23250 > 0 && c8389M13962.f23251 == 0) {
                Bitmap.Config config = c8397.m13964(AbstractC8086.f22309) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iM13561 = m13561(c8389M13962, i, i2);
                C6961 c6961 = this.f22288;
                C8053 c8053 = this.f22287;
                c6961.getClass();
                C8387 c8387 = new C8387(c8053, c8389M13962, byteBuffer, iM13561);
                c8387.m13955(config);
                c8387.f23239 = (c8387.f23239 + 1) % c8387.f23240.f23250;
                Bitmap bitmapM13956 = c8387.m13956();
                if (bitmapM13956 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(AbstractC7986.m13467(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                C8081 c8081 = new C8081(new C8082(new C7487(new C8084(ComponentCallbacks2C3058.m6767(this.f22291), c8387, i, i2, bitmapM13956), 1)), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC7986.m13467(jElapsedRealtimeNanos));
                }
                return c8081;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(AbstractC7986.m13467(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } finally {
        }
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2989 mo6524(Object obj, int i, int i2, C8397 c8397) {
        C8388 c8388;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C8050 c8050 = this.f22289;
        synchronized (c8050) {
            try {
                C8388 c83882 = (C8388) c8050.f22221.poll();
                if (c83882 == null) {
                    c83882 = new C8388();
                }
                c8388 = c83882;
                c8388.f23245 = null;
                Arrays.fill(c8388.f23246, (byte) 0);
                c8388.f23244 = new C8389();
                c8388.f23243 = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                c8388.f23245 = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                c8388.f23245.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return m13562(byteBuffer, i, i2, c8388, c8397);
        } finally {
            this.f22289.m13540(c8388);
        }
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo6525(Object obj, C8397 c8397) {
        return !((Boolean) c8397.m13964(AbstractC8086.f22308)).booleanValue() && AbstractC2905.m6296(this.f22290, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }
}
