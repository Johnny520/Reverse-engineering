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
    public final ImageHeaderParser$ImageType mo566a(ByteBuffer r1) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: b */
    public final int mo567b(InputStream r1, C2812zp r2) {
        C0238Fg r22 = new C0238Fg(r1);
        C0066Bg r12 = r22.m487c("Orientation");
        if (r12 != null) goto L12;
    L7:
        int r13 = 1;
    L8:
        if (r13 != 0) goto L14;
        return -1;
    L14:
        return r13;
    L12:
        r13 = r12.m110e(r22.f788f);     // Catch: NumberFormatException -> L11
        goto L8
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: c */
    public final boolean mo568c(ByteBuffer r1, C2812zp r2) {
        return false;
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: d */
    public final int mo569d(ByteBuffer r2, C2812zp r3) {
        AtomicReference r0 = AbstractC2529t6.f8828a;
        return mo567b(new C2443r6(r2), r3);
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: e */
    public final boolean mo570e(InputStream r1, C2812zp r2) {
        return false;
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: f */
    public final ImageHeaderParser$ImageType mo571f(InputStream r1) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
