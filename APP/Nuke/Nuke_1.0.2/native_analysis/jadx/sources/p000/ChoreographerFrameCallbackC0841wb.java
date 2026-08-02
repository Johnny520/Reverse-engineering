package p000;

import android.view.Choreographer;

/* JADX INFO: renamed from: wb */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0841wb implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0469mp f12445h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ in0 f12446i;

    public ChoreographerFrameCallbackC0841wb(C0469mp c0469mp, C0880xb c0880xb, in0 in0Var) {
        this.f12445h = c0469mp;
        this.f12446i = in0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object x92Var;
        try {
            x92Var = this.f12446i.mo5j(Long.valueOf(j));
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        this.f12445h.mo2509h(x92Var);
    }
}
