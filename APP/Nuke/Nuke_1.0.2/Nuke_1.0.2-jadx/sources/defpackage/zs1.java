package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zs1 extends sm0 {
    public final /* synthetic */ at1 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs1(at1 at1Var, on onVar) {
        super(onVar);
        this.i = at1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public final long n(fn fnVar, long j) throws IOException {
        try {
            fnVar.getClass();
            return this.h.n(fnVar, 8192L);
        } catch (IOException e) {
            this.i.l = e;
            throw e;
        }
    }
}
