package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Gg */
/* JADX INFO: loaded from: classes.dex */
public final class C0281Gg implements InterfaceC1331dl {
    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: a */
    public final ImageHeaderParser$ImageType mo566a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: b */
    public final int mo567b(InputStream inputStream, C2812zp c2812zp) throws Throwable {
        int iM110e;
        C0238Fg c0238Fg = new C0238Fg(inputStream);
        C0066Bg c0066BgM487c = c0238Fg.m487c("Orientation");
        if (c0066BgM487c == null) {
            iM110e = 1;
        } else {
            try {
                iM110e = c0066BgM487c.m110e(c0238Fg.f788f);
            } catch (NumberFormatException unused) {
                iM110e = 1;
            }
        }
        if (iM110e == 0) {
            return -1;
        }
        return iM110e;
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: c */
    public final boolean mo568c(ByteBuffer byteBuffer, C2812zp c2812zp) {
        return false;
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: d */
    public final int mo569d(ByteBuffer byteBuffer, C2812zp c2812zp) {
        AtomicReference atomicReference = AbstractC2529t6.f8828a;
        return mo567b(new C2443r6(byteBuffer), c2812zp);
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: e */
    public final boolean mo570e(InputStream inputStream, C2812zp c2812zp) {
        return false;
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: f */
    public final ImageHeaderParser$ImageType mo571f(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
