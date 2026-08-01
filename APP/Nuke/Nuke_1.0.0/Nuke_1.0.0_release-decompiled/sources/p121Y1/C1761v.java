package p121Y1;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p078P1.InterfaceC1143e;
import p093S1.C1294f;
import p195l2.AbstractC2498b;
import p195l2.C2497a;
import p268y1.C3484c;
import p268y1.C3488g;

/* JADX INFO: renamed from: Y1.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1761v implements InterfaceC1143e {
    @Override // p078P1.InterfaceC1143e
    /* JADX INFO: renamed from: a */
    public final ImageHeaderParser$ImageType mo2193a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p078P1.InterfaceC1143e
    /* JADX INFO: renamed from: b */
    public final int mo2194b(InputStream inputStream, C1294f c1294f) throws Throwable {
        int iM5717e;
        C3488g c3488g = new C3488g(inputStream);
        C3484c c3484cM5724c = c3488g.m5724c("Orientation");
        if (c3484cM5724c == null) {
            iM5717e = 1;
        } else {
            try {
                iM5717e = c3484cM5724c.m5717e(c3488g.f10862f);
            } catch (NumberFormatException unused) {
                iM5717e = 1;
            }
        }
        if (iM5717e == 0) {
            return -1;
        }
        return iM5717e;
    }

    @Override // p078P1.InterfaceC1143e
    /* JADX INFO: renamed from: c */
    public final boolean mo2195c(ByteBuffer byteBuffer, C1294f c1294f) {
        return false;
    }

    @Override // p078P1.InterfaceC1143e
    /* JADX INFO: renamed from: d */
    public final int mo2196d(ByteBuffer byteBuffer, C1294f c1294f) {
        AtomicReference atomicReference = AbstractC2498b.f8007a;
        return mo2194b(new C2497a(byteBuffer), c1294f);
    }

    @Override // p078P1.InterfaceC1143e
    /* JADX INFO: renamed from: e */
    public final ImageHeaderParser$ImageType mo2197e(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p078P1.InterfaceC1143e
    /* JADX INFO: renamed from: f */
    public final boolean mo2198f(InputStream inputStream, C1294f c1294f) {
        return false;
    }
}
