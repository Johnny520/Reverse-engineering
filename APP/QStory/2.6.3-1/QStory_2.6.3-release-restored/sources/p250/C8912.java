package p250;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import p091.C7790;
import p145.C8316;
import p238.AbstractC8815;
import p246.C8879;
import p246.C8882;
import p301.C9216;
import p301.C9217;
import p301.C9218;
import p302.C9226;
import p302.InterfaceC9229;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8912 implements InterfaceC9229 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C7790 f22630 = new C7790(17);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C8879 f22631 = new C8879(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8882 f22632;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7790 f22633 = f22630;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8879 f22634 = f22631;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f22635;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f22636;

    public C8912(Context context, ArrayList arrayList, InterfaceC3811 interfaceC3811, C3806 c3806) {
        this.f22636 = context.getApplicationContext();
        this.f22635 = arrayList;
        this.f22632 = new C8882(interfaceC3811, c3806);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m14120(C9218 c9218, int i, int i2) {
        int iMin = Math.min(c9218.f23599 / i2, c9218.f23592 / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbM709 = AbstractC0900.m709(iMax, i, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            sbM709.append(i2);
            sbM709.append("], actual dimens: [");
            sbM709.append(c9218.f23592);
            sbM709.append("x");
            sbM709.append(c9218.f23599);
            sbM709.append("]");
            Log.v("BufferGifDecoder", sbM709.toString());
        }
        return iMax;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8910 m14121(ByteBuffer byteBuffer, int i, int i2, C9217 c9217, C9226 c9226) {
        StringBuilder sb;
        int i3 = AbstractC8815.f22409;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C9218 c9218M14521 = c9217.m14521();
            if (c9218M14521.f23595 > 0 && c9218M14521.f23596 == 0) {
                Bitmap.Config config = c9226.m14523(AbstractC8915.f22654) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iM14120 = m14120(c9218M14521, i, i2);
                C7790 c7790 = this.f22633;
                C8882 c8882 = this.f22632;
                c7790.getClass();
                C9216 c9216 = new C9216(c8882, c9218M14521, byteBuffer, iM14120);
                c9216.m14514(config);
                c9216.f23584 = (c9216.f23584 + 1) % c9216.f23585.f23595;
                Bitmap bitmapM14515 = c9216.m14515();
                if (bitmapM14515 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(AbstractC8815.m14026(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                C8910 c8910 = new C8910(new C8911(new C8316(new C8913(ComponentCallbacks2C3890.m7327(this.f22636), c9216, i, i2, bitmapM14515), 1)), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC8815.m14026(jElapsedRealtimeNanos));
                }
                return c8910;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(AbstractC8815.m14026(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } finally {
        }
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3821 mo7084(Object obj, int i, int i2, C9226 c9226) {
        C9217 c9217;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C8879 c8879 = this.f22634;
        synchronized (c8879) {
            try {
                C9217 c92172 = (C9217) c8879.f22566.poll();
                if (c92172 == null) {
                    c92172 = new C9217();
                }
                c9217 = c92172;
                c9217.f23590 = null;
                Arrays.fill(c9217.f23591, (byte) 0);
                c9217.f23589 = new C9218();
                c9217.f23588 = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                c9217.f23590 = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                c9217.f23590.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return m14121(byteBuffer, i, i2, c9217, c9226);
        } finally {
            this.f22634.m14099(c9217);
        }
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo7085(Object obj, C9226 c9226) {
        return !((Boolean) c9226.m14523(AbstractC8915.f22653)).booleanValue() && AbstractC3738.m6856(this.f22635, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }
}
