package p234;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.engine.InterfaceC2988;
import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import p075.C6960;
import p129.C7486;
import p222.AbstractC7985;
import p230.C8049;
import p230.C8052;
import p285.C8386;
import p285.C8387;
import p285.C8388;
import p286.C8396;
import p286.InterfaceC8399;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8082 implements InterfaceC8399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C6960 f22287 = new C6960(17);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C8049 f22288 = new C8049(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8052 f22289;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6960 f22290 = f22287;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8049 f22291 = f22288;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f22292;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f22293;

    public C8082(Context context, ArrayList arrayList, InterfaceC2978 interfaceC2978, C2973 c2973) {
        this.f22293 = context.getApplicationContext();
        this.f22292 = arrayList;
        this.f22289 = new C8052(interfaceC2978, c2973);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m13532(C8388 c8388, int i, int i2) {
        int iMin = Math.min(c8388.f23255 / i2, c8388.f23248 / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbM151 = AbstractC0053.m151(iMax, i, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            sbM151.append(i2);
            sbM151.append("], actual dimens: [");
            sbM151.append(c8388.f23248);
            sbM151.append("x");
            sbM151.append(c8388.f23255);
            sbM151.append("]");
            Log.v("BufferGifDecoder", sbM151.toString());
        }
        return iMax;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8080 m13533(ByteBuffer byteBuffer, int i, int i2, C8387 c8387, C8396 c8396) {
        StringBuilder sb;
        int i3 = AbstractC7985.f22067;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C8388 c8388M13945 = c8387.m13945();
            if (c8388M13945.f23251 > 0 && c8388M13945.f23252 == 0) {
                Bitmap.Config config = c8396.m13947(AbstractC8085.f22311) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iM13532 = m13532(c8388M13945, i, i2);
                C6960 c6960 = this.f22290;
                C8052 c8052 = this.f22289;
                c6960.getClass();
                C8386 c8386 = new C8386(c8052, c8388M13945, byteBuffer, iM13532);
                c8386.m13938(config);
                c8386.f23240 = (c8386.f23240 + 1) % c8386.f23241.f23251;
                Bitmap bitmapM13939 = c8386.m13939();
                if (bitmapM13939 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(AbstractC7985.m13439(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                C8080 c8080 = new C8080(new C8081(new C7486(new C8083(ComponentCallbacks2C3057.m6722(this.f22293), c8386, i, i2, bitmapM13939), 1)), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC7985.m13439(jElapsedRealtimeNanos));
                }
                return c8080;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(AbstractC7985.m13439(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } finally {
        }
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2988 mo6464(Object obj, int i, int i2, C8396 c8396) {
        C8387 c8387;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C8049 c8049 = this.f22291;
        synchronized (c8049) {
            try {
                C8387 c83872 = (C8387) c8049.f22223.poll();
                if (c83872 == null) {
                    c83872 = new C8387();
                }
                c8387 = c83872;
                c8387.f23246 = null;
                Arrays.fill(c8387.f23247, (byte) 0);
                c8387.f23245 = new C8388();
                c8387.f23244 = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                c8387.f23246 = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                c8387.f23246.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return m13533(byteBuffer, i, i2, c8387, c8396);
        } finally {
            this.f22291.m13511(c8387);
        }
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo6465(Object obj, C8396 c8396) {
        return !((Boolean) c8396.m13947(AbstractC8085.f22310)).booleanValue() && AbstractC2904.m6245(this.f22292, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }
}
