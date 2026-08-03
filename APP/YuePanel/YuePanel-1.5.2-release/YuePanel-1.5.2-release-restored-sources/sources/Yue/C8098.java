package Yue;

import java.io.IOException;
import java.io.UncheckedIOException;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C8098 extends UncheckedIOException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8098(IOException iOException) {
        super(iOException);
    }

    /* JADX INFO: renamed from: ۥ */
    public IOException m4134() {
        return getCause();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8098(String str) {
        super(new IOException(str));
    }
}
