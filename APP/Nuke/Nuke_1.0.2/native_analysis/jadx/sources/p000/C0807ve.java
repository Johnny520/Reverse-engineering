package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ve */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0807ve {

    /* JADX INFO: renamed from: a */
    public static final ir0 f11913a = new ir0();

    /* JADX INFO: renamed from: b */
    public static final et1 f11914b;

    static {
        dt1 dt1Var = new dt1();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        dt1Var.f2224y = wg3.m5889b(10L, timeUnit);
        dt1Var.f2225z = wg3.m5889b(20L, timeUnit);
        f11914b = new et1(dt1Var);
    }

    /* JADX INFO: renamed from: a */
    public static final String m5668a(InputStream inputStream) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            int i = 0;
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    String string = byteArrayOutputStream.toString(AbstractC0856wq.f12612a.name());
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
                pp0.m3916n(inputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5669b(String str) throws IOException {
        x92 x92Var;
        try {
            if (f11913a.m2385b(str, AbstractC0731te.class) != null) {
                throw new ClassCastException();
            }
            x92Var = null;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thM6237a = y92.m6237a(x92Var);
        if (thM6237a != null) {
            throw new IOException("Update service returned invalid JSON", thM6237a);
        }
        if (x92Var != null) {
            throw new ClassCastException();
        }
        throw new IOException("Update service returned invalid JSON");
    }
}
