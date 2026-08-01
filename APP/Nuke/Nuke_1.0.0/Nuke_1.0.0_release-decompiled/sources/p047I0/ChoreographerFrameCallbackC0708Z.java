package p047I0;

import android.view.Choreographer;
import p112W2.InterfaceC1601c;
import p127Z2.AbstractC1784a;
import p160f3.C2135g;

/* JADX INFO: renamed from: I0.Z */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0708Z implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2135g f2245d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1601c f2246e;

    public ChoreographerFrameCallbackC0708Z(C2135g c2135g, C0711a0 c0711a0, InterfaceC1601c interfaceC1601c) {
        this.f2245d = c2135g;
        this.f2246e = interfaceC1601c;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        Object objM3229o;
        try {
            objM3229o = this.f2246e.mo1h(Long.valueOf(j5));
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        this.f2245d.mo278i(objM3229o);
    }
}
