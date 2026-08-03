package p357y1;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import p046d6.C0716m;
import p117i0.C1819d;
import p249qg.AbstractC3591p;
import p276sf.C3962i;
import tf.C4164k;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: y1.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5911n0 extends AbstractC3591p {

    /* JADX INFO: renamed from: s */
    public static final C3962i f23984s = new C3962i(C5887h0.f23904m);

    /* JADX INFO: renamed from: t */
    public static final C0716m f23985t = new C0716m(3);

    /* JADX INFO: renamed from: i */
    public final Choreographer f23986i;

    /* JADX INFO: renamed from: j */
    public final Handler f23987j;

    /* JADX INFO: renamed from: o */
    public boolean f23992o;

    /* JADX INFO: renamed from: p */
    public boolean f23993p;

    /* JADX INFO: renamed from: r */
    public final C1819d f23995r;

    /* JADX INFO: renamed from: k */
    public final Object f23988k = new Object();

    /* JADX INFO: renamed from: l */
    public final C4164k f23989l = new C4164k();

    /* JADX INFO: renamed from: m */
    public ArrayList f23990m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public ArrayList f23991n = new ArrayList();

    /* JADX INFO: renamed from: q */
    public final ChoreographerFrameCallbackC5907m0 f23994q = new ChoreographerFrameCallbackC5907m0(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5911n0(Choreographer choreographer, Handler handler) {
        this.f23986i = choreographer;
        this.f23987j = handler;
        this.f23995r = new C1819d(choreographer, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final void m10622z(C5911n0 c5911n0) {
        Runnable runnable;
        boolean z9;
        do {
            synchronized (c5911n0.f23988k) {
                C4164k c4164k = c5911n0.f23989l;
                runnable = (Runnable) (c4164k.isEmpty() ? null : c4164k.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (c5911n0.f23988k) {
                    C4164k c4164k2 = c5911n0.f23989l;
                    runnable = (Runnable) (c4164k2.isEmpty() ? null : c4164k2.removeFirst());
                }
            }
            synchronized (c5911n0.f23988k) {
                if (c5911n0.f23989l.isEmpty()) {
                    z9 = false;
                    c5911n0.f23992o = false;
                } else {
                    z9 = true;
                }
            }
        } while (z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3591p
    /* JADX INFO: renamed from: w */
    public final void mo7538w(InterfaceC5561g interfaceC5561g, Runnable runnable) {
        synchronized (this.f23988k) {
            this.f23989l.addLast(runnable);
            if (!this.f23992o) {
                this.f23992o = true;
                this.f23987j.post(this.f23994q);
                if (!this.f23993p) {
                    this.f23993p = true;
                    this.f23986i.postFrameCallback(this.f23994q);
                }
            }
        }
    }
}
