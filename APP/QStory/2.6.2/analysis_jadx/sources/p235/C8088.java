package p235;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.engine.InterfaceC2988;
import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p222.AbstractC7983;
import p230.C8052;
import p286.C8396;
import p286.InterfaceC8399;

/* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8088 implements InterfaceC8399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8052 f22317;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22318;

    public /* synthetic */ C8088(C8052 c8052, int i) {
        this.f22318 = i;
        this.f22317 = c8052;
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2988 mo6464(Object obj, int i, int i2, C8396 c8396) {
        switch (this.f22318) {
            case 0:
                return C8052.m13512(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c8396);
            default:
                return C8052.m13512(ImageDecoder.createSource(AbstractC7983.m13437((InputStream) obj)), i, i2, c8396);
        }
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo6465(Object obj, C8396 c8396) throws IOException {
        int i = this.f22318;
        C8052 c8052 = this.f22317;
        switch (i) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM6245 = AbstractC2904.m6245((ArrayList) c8052.f22227, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeM6245 != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || imageHeaderParser$ImageTypeM6245 != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                    }
                }
                break;
            default:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM6246 = AbstractC2904.m6246((ArrayList) c8052.f22227, (InputStream) obj, (C2973) c8052.f22226);
                if (imageHeaderParser$ImageTypeM6246 != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || imageHeaderParser$ImageTypeM6246 != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                    }
                }
                break;
        }
        return false;
    }
}
