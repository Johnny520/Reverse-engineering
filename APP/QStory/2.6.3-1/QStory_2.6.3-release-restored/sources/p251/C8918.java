package p251;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p238.AbstractC8813;
import p246.C8882;
import p302.C9226;
import p302.InterfaceC9229;

/* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8918 implements InterfaceC9229 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8882 f22660;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22661;

    public /* synthetic */ C8918(C8882 c8882, int i) {
        this.f22661 = i;
        this.f22660 = c8882;
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3821 mo7084(Object obj, int i, int i2, C9226 c9226) {
        switch (this.f22661) {
            case 0:
                return C8882.m14100(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c9226);
            default:
                return C8882.m14100(ImageDecoder.createSource(AbstractC8813.m14024((InputStream) obj)), i, i2, c9226);
        }
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo7085(Object obj, C9226 c9226) throws IOException {
        int i = this.f22661;
        C8882 c8882 = this.f22660;
        switch (i) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM6856 = AbstractC3738.m6856((ArrayList) c8882.f22570, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeM6856 != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || imageHeaderParser$ImageTypeM6856 != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                    }
                }
                break;
            default:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM6857 = AbstractC3738.m6857((ArrayList) c8882.f22570, (InputStream) obj, (C3806) c8882.f22569);
                if (imageHeaderParser$ImageTypeM6857 != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || imageHeaderParser$ImageTypeM6857 != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                    }
                }
                break;
        }
        return false;
    }
}
