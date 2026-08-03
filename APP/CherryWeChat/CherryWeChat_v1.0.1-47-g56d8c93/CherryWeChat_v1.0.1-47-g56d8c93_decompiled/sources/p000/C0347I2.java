package p000;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: I2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0347I2 implements InterfaceC2518sw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1163a;

    /* JADX INFO: renamed from: b */
    public final C0649P3 f1164b;

    public /* synthetic */ C0347I2(C0649P3 c0649p3, int i) {
        this.f1163a = i;
        this.f1164b = c0649p3;
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo749a(Object obj, int i, int i2, C2644vt c2644vt) {
        switch (this.f1163a) {
            case 0:
                return C0649P3.m1270l(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c2644vt);
            default:
                return C0649P3.m1270l(ImageDecoder.createSource(AbstractC2529t6.m5010b((InputStream) obj)), i, i2, c2644vt);
        }
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final boolean mo750b(Object obj, C2644vt c2644vt) throws IOException {
        switch (this.f1163a) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM2698X = AbstractC1406fG.m2698X((ArrayList) this.f1164b.f2089b, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeM2698X == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeM2698X == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
            default:
                C0649P3 c0649p3 = this.f1164b;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM2697W = AbstractC1406fG.m2697W((ArrayList) c0649p3.f2089b, (InputStream) obj, (C2812zp) c0649p3.f2090c);
                if (imageHeaderParser$ImageTypeM2697W == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeM2697W == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
        }
        return true;
    }
}
