package defpackage;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xc implements g92 {
    public final /* synthetic */ int a;
    public final sz0 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ xc(sz0 sz0Var, int i) {
        this.a = i;
        this.b = sz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g92
    public final d92 a(Object obj, int i, int i2, ov1 ov1Var) {
        switch (this.a) {
            case 0:
                return sz0.z(ImageDecoder.createSource((ByteBuffer) obj), i, i2, ov1Var);
            default:
                return sz0.z(ImageDecoder.createSource(lo.b((InputStream) obj, false)), i, i2, ov1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g92
    public final boolean b(Object obj, ov1 ov1Var) throws IOException {
        int i = this.a;
        sz0 sz0Var = this.b;
        switch (i) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeJ = se.J((ArrayList) sz0Var.i, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeJ != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || imageHeaderParser$ImageTypeJ != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                    }
                }
                break;
            default:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeI = se.I((ArrayList) sz0Var.i, (InputStream) obj, (td1) sz0Var.j);
                if (imageHeaderParser$ImageTypeI != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || imageHeaderParser$ImageTypeI != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                    }
                }
                break;
        }
        return false;
    }
}
