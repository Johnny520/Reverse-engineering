package yyds;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛶᛶᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1364 implements InterfaceC0814 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6355;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2133 f6356;

    public /* synthetic */ C1364(C2133 c2133, int i) {
        this.f6355 = i;
        this.f6356 = c2133;
    }

    @Override // yyds.InterfaceC0814
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo427(Object obj, C0822 c0822) throws IOException {
        int i = this.f6355;
        C2133 c2133 = this.f6356;
        switch (i) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM3463 = AbstractC1741.m3463((ArrayList) c2133.f10555, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeM3463 != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || imageHeaderParser$ImageTypeM3463 != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                    }
                }
                break;
            default:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM3475 = AbstractC1741.m3475((ArrayList) c2133.f10555, (InputStream) obj, (C2267) c2133.f10553);
                if (imageHeaderParser$ImageTypeM3475 != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || imageHeaderParser$ImageTypeM3475 != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // yyds.InterfaceC0814
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final InterfaceC2162 mo428(Object obj, int i, int i2, C0822 c0822) {
        switch (this.f6355) {
            case 0:
                return C2133.m4042(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c0822);
            default:
                return C2133.m4042(ImageDecoder.createSource(AbstractC0282.m930((InputStream) obj, false)), i, i2, c0822);
        }
    }
}
