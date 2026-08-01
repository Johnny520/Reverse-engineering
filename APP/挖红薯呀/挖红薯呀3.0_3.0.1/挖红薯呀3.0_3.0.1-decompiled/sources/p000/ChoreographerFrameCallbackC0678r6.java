package p000;

import android.view.Choreographer;

/* JADX INFO: renamed from: r6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0678r6 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0884wc f5303d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0742sw f5304e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ChoreographerFrameCallbackC0678r6(C0884wc c0884wc, C0715s6 c0715s6, InterfaceC0742sw interfaceC0742sw) {
        this.f5303d = c0884wc;
        this.f5304e = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object bv0Var;
        try {
            bv0Var = this.f5304e.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            bv0Var = new bv0(th);
        }
        this.f5303d.mo541i(bv0Var);
    }
}
