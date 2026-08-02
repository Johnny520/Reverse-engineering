package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wb implements Choreographer.FrameCallback {
    public final /* synthetic */ mp h;
    public final /* synthetic */ in0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wb(mp mpVar, xb xbVar, in0 in0Var) {
        this.h = mpVar;
        this.i = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object x92Var;
        try {
            x92Var = this.i.j(Long.valueOf(j));
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        this.h.h(x92Var);
    }
}
