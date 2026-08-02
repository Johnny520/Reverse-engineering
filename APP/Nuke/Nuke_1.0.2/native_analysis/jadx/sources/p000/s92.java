package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s92 extends Reader {

    /* JADX INFO: renamed from: h */
    public final InterfaceC0549on f9994h;

    /* JADX INFO: renamed from: i */
    public final Charset f9995i;

    /* JADX INFO: renamed from: j */
    public boolean f9996j;

    /* JADX INFO: renamed from: k */
    public InputStreamReader f9997k;

    public s92(InterfaceC0549on interfaceC0549on, Charset charset) {
        interfaceC0549on.getClass();
        charset.getClass();
        this.f9994h = interfaceC0549on;
        this.f9995i = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9996j = true;
        InputStreamReader inputStreamReader = this.f9997k;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.f9994h.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        cArr.getClass();
        if (this.f9996j) {
            c80.m678v("Stream closed");
            return 0;
        }
        InputStreamReader inputStreamReader = this.f9997k;
        if (inputStreamReader == null) {
            InputStream inputStreamMo1668C = this.f9994h.mo1668C();
            InterfaceC0549on interfaceC0549on = this.f9994h;
            Charset charsetForName = this.f9995i;
            TimeZone timeZone = wg3.f12507a;
            interfaceC0549on.getClass();
            charsetForName.getClass();
            int iMo1685m = interfaceC0549on.mo1685m(ug3.f11301b);
            if (iMo1685m != -1) {
                if (iMo1685m == 0) {
                    charsetForName = AbstractC0856wq.f12612a;
                } else if (iMo1685m == 1) {
                    charsetForName = AbstractC0856wq.f12613b;
                } else if (iMo1685m == 2) {
                    Charset charset = AbstractC0856wq.f12612a;
                    charsetForName = AbstractC0856wq.f12615d;
                    if (charsetForName == null) {
                        charsetForName = Charset.forName("UTF-32LE");
                        charsetForName.getClass();
                        AbstractC0856wq.f12615d = charsetForName;
                    }
                } else if (iMo1685m == 3) {
                    charsetForName = AbstractC0856wq.f12614c;
                } else {
                    if (iMo1685m != 4) {
                        throw new AssertionError();
                    }
                    Charset charset2 = AbstractC0856wq.f12612a;
                    charsetForName = AbstractC0856wq.f12616e;
                    if (charsetForName == null) {
                        charsetForName = Charset.forName("UTF-32BE");
                        charsetForName.getClass();
                        AbstractC0856wq.f12616e = charsetForName;
                    }
                }
            }
            inputStreamReader = new InputStreamReader(inputStreamMo1668C, charsetForName);
            this.f9997k = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i, i2);
    }
}
