package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sv0 implements ht2 {
    public final on h;
    public int i;
    public int j;
    public int k;
    public int l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sv0(on onVar) {
        onVar.getClass();
        this.h = onVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public final o23 a() {
        return this.h.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public final long n(fn fnVar, long j) throws IOException {
        int i;
        int i2;
        fnVar.getClass();
        do {
            int i3 = this.k;
            on onVar = this.h;
            if (i3 == 0) {
                onVar.skip(this.l);
                this.l = 0;
                if ((this.i & 4) == 0) {
                    i = this.j;
                    int iL = ug3.l(onVar);
                    this.k = iL;
                    int i4 = onVar.readByte() & 255;
                    this.i = onVar.readByte() & 255;
                    Logger logger = tv0.k;
                    if (logger.isLoggable(Level.FINE)) {
                        no noVar = jv0.a;
                        logger.fine(jv0.b(true, this.j, iL, i4, this.i));
                    }
                    i2 = onVar.readInt() & Integer.MAX_VALUE;
                    this.j = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jN = onVar.n(fnVar, Math.min(8192L, i3));
                if (jN != -1) {
                    this.k -= (int) jN;
                    return jN;
                }
            }
            return -1L;
        } while (i2 == i);
        c80.v("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
