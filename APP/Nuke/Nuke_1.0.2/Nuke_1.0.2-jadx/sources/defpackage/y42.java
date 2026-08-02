package defpackage;

import com.dokar.quickjs.QuickJs;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y42 extends q2 implements d20 {
    public final /* synthetic */ QuickJs i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public y42(QuickJs quickJs) {
        gd3 gd3Var = gd3.q;
        this.i = quickJs;
        super(gd3Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d20
    public final void p(a20 a20Var, Throwable th) {
        QuickJs quickJs = this.i;
        if (quickJs.evalException == null) {
            quickJs.evalException = th;
        }
    }
}
