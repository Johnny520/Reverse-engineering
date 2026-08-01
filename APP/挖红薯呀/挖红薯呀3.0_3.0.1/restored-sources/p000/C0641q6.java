package p000;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: q6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0641q6 extends AbstractC0692rk {

    /* JADX INFO: renamed from: p */
    public static final x51 f5044p = new x51(C0342j4.f2701m);

    /* JADX INFO: renamed from: q */
    public static final C0539o6 f5045q = new C0539o6();

    /* JADX INFO: renamed from: f */
    public final Choreographer f5046f;

    /* JADX INFO: renamed from: g */
    public final Handler f5047g;

    /* JADX INFO: renamed from: l */
    public boolean f5052l;

    /* JADX INFO: renamed from: m */
    public boolean f5053m;

    /* JADX INFO: renamed from: o */
    public final C0715s6 f5055o;

    /* JADX INFO: renamed from: h */
    public final Object f5048h = new Object();

    /* JADX INFO: renamed from: i */
    public final C0917x8 f5049i = new C0917x8();

    /* JADX INFO: renamed from: j */
    public ArrayList f5050j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public ArrayList f5051k = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final ChoreographerFrameCallbackC0604p6 f5054n = new ChoreographerFrameCallbackC0604p6(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0641q6(Choreographer choreographer, Handler handler) {
        this.f5046f = choreographer;
        this.f5047g = handler;
        this.f5055o = new C0715s6(choreographer, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final void m3194j(C0641q6 c0641q6) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (c0641q6.f5048h) {
                C0917x8 c0917x8 = c0641q6.f5049i;
                runnable = (Runnable) (c0917x8.isEmpty() ? null : c0917x8.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (c0641q6.f5048h) {
                    C0917x8 c0917x82 = c0641q6.f5049i;
                    runnable = (Runnable) (c0917x82.isEmpty() ? null : c0917x82.removeFirst());
                }
            }
            synchronized (c0641q6.f5048h) {
                if (c0641q6.f5049i.isEmpty()) {
                    z = false;
                    c0641q6.f5052l = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0692rk
    /* JADX INFO: renamed from: e */
    public final void mo358e(InterfaceC0618pk interfaceC0618pk, Runnable runnable) {
        synchronized (this.f5048h) {
            this.f5049i.addLast(runnable);
            if (!this.f5052l) {
                this.f5052l = true;
                this.f5047g.post(this.f5054n);
                if (!this.f5053m) {
                    this.f5053m = true;
                    this.f5046f.postFrameCallback(this.f5054n);
                }
            }
        }
    }
}
