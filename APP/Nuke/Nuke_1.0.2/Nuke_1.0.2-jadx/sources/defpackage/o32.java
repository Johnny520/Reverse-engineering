package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o32 extends p2 implements fq, ho2 {
    public final jn k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o32(a20 a20Var, jn jnVar) {
        super(a20Var, true);
        this.k = jnVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r21
    public final void D(CancellationException cancellationException) {
        this.k.g(cancellationException, true);
        z(cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ho2
    public final Object a(t00 t00Var, Object obj) {
        return this.k.a(t00Var, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r21, defpackage.k21
    public final void c(CancellationException cancellationException) {
        Object obj = r21.h.get(this);
        if (obj instanceof ov) {
            return;
        }
        if ((obj instanceof q21) && ((q21) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new l21(F(), null, this);
        }
        D(cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.p2
    public final void g0(Throwable th, boolean z) {
        if (this.k.g(th, false) || z) {
            return;
        }
        se.M(this.j, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.p2
    public final void h0(Object obj) {
        this.k.g(null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fq
    public final in iterator() {
        jn jnVar = this.k;
        jnVar.getClass();
        return new in(jnVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fq
    public final Object m() {
        return this.k.m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ho2
    public final Object s(Object obj) {
        return this.k.s(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fq
    public final Object w(t00 t00Var) {
        return this.k.w(t00Var);
    }
}
