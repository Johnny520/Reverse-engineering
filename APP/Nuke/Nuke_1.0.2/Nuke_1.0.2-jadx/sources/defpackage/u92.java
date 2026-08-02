package defpackage;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u92 implements Closeable {
    public static final t92 i;
    public s92 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        no noVar = no.k;
        noVar.getClass();
        fn fnVar = new fn();
        fnVar.B(noVar);
        i = new t92(null, noVar.h.length, fnVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InputStream b() {
        return g().C();
    }

    public abstract long c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ug3.b(g());
    }

    public abstract vf1 e();

    public abstract on g();
}
