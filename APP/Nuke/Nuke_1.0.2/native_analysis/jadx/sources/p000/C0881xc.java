package p000;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: xc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0881xc implements g92 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12958a;

    /* JADX INFO: renamed from: b */
    public final sz0 f12959b;

    public /* synthetic */ C0881xc(sz0 sz0Var, int i) {
        this.f12958a = i;
        this.f12959b = sz0Var;
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: a */
    public final d92 mo866a(Object obj, int i, int i2, ov1 ov1Var) {
        switch (this.f12958a) {
            case 0:
                return sz0.m5028z(ImageDecoder.createSource((ByteBuffer) obj), i, i2, ov1Var);
            default:
                return sz0.m5028z(ImageDecoder.createSource(AbstractC0431lo.m2951b((InputStream) obj, false)), i, i2, ov1Var);
        }
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: b */
    public final boolean mo867b(Object obj, ov1 ov1Var) throws IOException {
        int i = this.f12958a;
        sz0 sz0Var = this.f12959b;
        switch (i) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM4821J = AbstractC0691se.m4821J((ArrayList) sz0Var.f10436i, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeM4821J != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || imageHeaderParser$ImageTypeM4821J != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                    }
                }
                break;
            default:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM4820I = AbstractC0691se.m4820I((ArrayList) sz0Var.f10436i, (InputStream) obj, (td1) sz0Var.f10437j);
                if (imageHeaderParser$ImageTypeM4820I != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || imageHeaderParser$ImageTypeM4820I != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                    }
                }
                break;
        }
        return false;
    }
}
