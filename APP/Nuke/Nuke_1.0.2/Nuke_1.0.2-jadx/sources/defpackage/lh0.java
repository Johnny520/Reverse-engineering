package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lh0 implements kx0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kx0
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kx0
    public final int b(InputStream inputStream, td1 td1Var) throws Throwable {
        int iE;
        kh0 kh0Var = new kh0(inputStream);
        gh0 gh0VarC = kh0Var.c("Orientation");
        if (gh0VarC == null) {
            iE = 1;
        } else {
            try {
                iE = gh0VarC.e(kh0Var.f);
            } catch (NumberFormatException unused) {
                iE = 1;
            }
        }
        if (iE == 0) {
            return -1;
        }
        return iE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kx0
    public final boolean c(ByteBuffer byteBuffer, td1 td1Var) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kx0
    public final int d(ByteBuffer byteBuffer, td1 td1Var) {
        AtomicReference atomicReference = lo.a;
        return b(new jo(byteBuffer), td1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kx0
    public final boolean e(InputStream inputStream, td1 td1Var) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kx0
    public final ImageHeaderParser$ImageType f(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
