package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s92 extends Reader {
    public final on h;
    public final Charset i;
    public boolean j;
    public InputStreamReader k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s92(on onVar, Charset charset) {
        onVar.getClass();
        charset.getClass();
        this.h = onVar;
        this.i = charset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.j = true;
        InputStreamReader inputStreamReader = this.k;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.h.close();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        cArr.getClass();
        if (this.j) {
            c80.v("Stream closed");
            return 0;
        }
        InputStreamReader inputStreamReader = this.k;
        if (inputStreamReader == null) {
            InputStream inputStreamC = this.h.C();
            on onVar = this.h;
            Charset charsetForName = this.i;
            TimeZone timeZone = wg3.a;
            onVar.getClass();
            charsetForName.getClass();
            int iM = onVar.m(ug3.b);
            if (iM != -1) {
                if (iM == 0) {
                    charsetForName = wq.a;
                } else if (iM == 1) {
                    charsetForName = wq.b;
                } else if (iM == 2) {
                    Charset charset = wq.a;
                    charsetForName = wq.d;
                    if (charsetForName == null) {
                        charsetForName = Charset.forName("UTF-32LE");
                        charsetForName.getClass();
                        wq.d = charsetForName;
                    }
                } else if (iM == 3) {
                    charsetForName = wq.c;
                } else {
                    if (iM != 4) {
                        throw new AssertionError();
                    }
                    Charset charset2 = wq.a;
                    charsetForName = wq.e;
                    if (charsetForName == null) {
                        charsetForName = Charset.forName("UTF-32BE");
                        charsetForName.getClass();
                        wq.e = charsetForName;
                    }
                }
            }
            inputStreamReader = new InputStreamReader(inputStreamC, charsetForName);
            this.k = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i, i2);
    }
}
