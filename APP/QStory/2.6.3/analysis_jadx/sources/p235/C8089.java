package p235;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p222.AbstractC7984;
import p230.C8053;
import p286.C8397;
import p286.InterfaceC8400;

/* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8089 implements InterfaceC8400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8053 f22315;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22316;

    public /* synthetic */ C8089(C8053 c8053, int i) {
        this.f22316 = i;
        this.f22315 = c8053;
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2989 mo6524(Object obj, int i, int i2, C8397 c8397) {
        switch (this.f22316) {
            case 0:
                return C8053.m13541(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c8397);
            default:
                return C8053.m13541(ImageDecoder.createSource(AbstractC7984.m13465((InputStream) obj)), i, i2, c8397);
        }
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo6525(Object obj, C8397 c8397) throws IOException {
        int i = this.f22316;
        C8053 c8053 = this.f22315;
        switch (i) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM6296 = AbstractC2905.m6296((ArrayList) c8053.f22225, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeM6296 != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || imageHeaderParser$ImageTypeM6296 != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                    }
                }
                break;
            default:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM6297 = AbstractC2905.m6297((ArrayList) c8053.f22225, (InputStream) obj, (C2974) c8053.f22224);
                if (imageHeaderParser$ImageTypeM6297 != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || imageHeaderParser$ImageTypeM6297 != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                    }
                }
                break;
        }
        return false;
    }
}
