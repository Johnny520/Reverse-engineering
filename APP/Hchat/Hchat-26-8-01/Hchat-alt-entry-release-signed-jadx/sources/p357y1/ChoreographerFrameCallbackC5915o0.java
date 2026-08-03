package p357y1;

import android.view.Choreographer;
import p085fg.InterfaceC1231l;
import p117i0.C1819d;
import p249qg.C3564g;
import p276sf.C3959f;

/* JADX INFO: renamed from: y1.o0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC5915o0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3564g f24003g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f24004h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ChoreographerFrameCallbackC5915o0(C3564g c3564g, C1819d c1819d, InterfaceC1231l interfaceC1231l) {
        this.f24003g = c3564g;
        this.f24004h = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        Object c3959f;
        try {
            c3959f = this.f24004h.invoke(Long.valueOf(j3));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        this.f24003g.resumeWith(c3959f);
    }
}
