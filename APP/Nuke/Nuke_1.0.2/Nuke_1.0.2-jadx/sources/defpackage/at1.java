package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class at1 extends u92 {
    public final u92 j;
    public final o52 k;
    public IOException l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public at1(u92 u92Var) {
        this.j = u92Var;
        this.k = new o52(new zs1(this, u92Var.g()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.u92
    public final long c() {
        return this.j.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.u92, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.u92
    public final vf1 e() {
        return this.j.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.u92
    public final on g() {
        return this.k;
    }
}
