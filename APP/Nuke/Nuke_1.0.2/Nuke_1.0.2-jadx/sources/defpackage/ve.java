package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ve {
    public static final ir0 a = new ir0();
    public static final et1 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        dt1 dt1Var = new dt1();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        dt1Var.y = wg3.b(10L, timeUnit);
        dt1Var.z = wg3.b(20L, timeUnit);
        b = new et1(dt1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final String a(InputStream inputStream) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            int i = 0;
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    String string = byteArrayOutputStream.toString(wq.a.name());
                    inputStream.close();
                    string.getClass();
                    return string;
                }
                i += i2;
                if (i > 131072) {
                    throw new IOException("Update service response is too large");
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                pp0.n(inputStream, th);
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(String str) throws IOException {
        x92 x92Var;
        try {
            if (a.b(str, te.class) != null) {
                throw new ClassCastException();
            }
            x92Var = null;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thA = y92.a(x92Var);
        if (thA != null) {
            throw new IOException("Update service returned invalid JSON", thA);
        }
        if (x92Var != null) {
            throw new ClassCastException();
        }
        throw new IOException("Update service returned invalid JSON");
    }
}
