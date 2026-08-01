package p131a2;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p000A.C0038T0;
import p078P1.C1147i;
import p078P1.InterfaceC1149k;
import p088R1.InterfaceC1194D;
import p093S1.C1294f;
import p195l2.AbstractC2498b;

/* JADX INFO: renamed from: a2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1797a implements InterfaceC1149k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6132a;

    /* JADX INFO: renamed from: b */
    public final C0038T0 f6133b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1797a(C0038T0 c0038t0, int i5) {
        this.f6132a = i5;
        this.f6133b = c0038t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: a */
    public final InterfaceC1194D mo2202a(Object obj, int i5, int i6, C1147i c1147i) {
        switch (this.f6132a) {
            case 0:
                return C0038T0.m25v(ImageDecoder.createSource((ByteBuffer) obj), i5, i6, c1147i);
            default:
                return C0038T0.m25v(ImageDecoder.createSource(AbstractC2498b.m4439b((InputStream) obj)), i5, i6, c1147i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: b */
    public final boolean mo2203b(Object obj, C1147i c1147i) throws IOException {
        switch (this.f6132a) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM3439v = AbstractC1922d.m3439v((ArrayList) this.f6133b.f169e, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeM3439v == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeM3439v == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
            default:
                C0038T0 c0038t0 = this.f6133b;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM3438u = AbstractC1922d.m3438u((ArrayList) c0038t0.f169e, (InputStream) obj, (C1294f) c0038t0.f170f);
                if (imageHeaderParser$ImageTypeM3438u == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeM3438u == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
        }
        return true;
    }
}
