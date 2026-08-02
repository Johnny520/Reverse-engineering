package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lh0 implements kx0 {
    @Override // p000.kx0
    /* JADX INFO: renamed from: a */
    public final ImageHeaderParser$ImageType mo2753a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p000.kx0
    /* JADX INFO: renamed from: b */
    public final int mo2754b(InputStream inputStream, td1 td1Var) throws Throwable {
        int iM1920e;
        kh0 kh0Var = new kh0(inputStream);
        gh0 gh0VarM2671c = kh0Var.m2671c("Orientation");
        if (gh0VarM2671c == null) {
            iM1920e = 1;
        } else {
            try {
                iM1920e = gh0VarM2671c.m1920e(kh0Var.f5569f);
            } catch (NumberFormatException unused) {
                iM1920e = 1;
            }
        }
        if (iM1920e == 0) {
            return -1;
        }
        return iM1920e;
    }

    @Override // p000.kx0
    /* JADX INFO: renamed from: c */
    public final boolean mo2755c(ByteBuffer byteBuffer, td1 td1Var) {
        return false;
    }

    @Override // p000.kx0
    /* JADX INFO: renamed from: d */
    public final int mo2756d(ByteBuffer byteBuffer, td1 td1Var) {
        AtomicReference atomicReference = AbstractC0431lo.f6225a;
        return mo2754b(new C0357jo(byteBuffer), td1Var);
    }

    @Override // p000.kx0
    /* JADX INFO: renamed from: e */
    public final boolean mo2757e(InputStream inputStream, td1 td1Var) {
        return false;
    }

    @Override // p000.kx0
    /* JADX INFO: renamed from: f */
    public final ImageHeaderParser$ImageType mo2758f(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
