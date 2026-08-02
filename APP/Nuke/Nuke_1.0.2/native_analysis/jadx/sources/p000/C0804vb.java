package p000;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: vb */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0804vb extends c20 {

    /* JADX INFO: renamed from: t */
    public static final hx2 f11872t = new hx2(C0607q7.f8798s);

    /* JADX INFO: renamed from: u */
    public static final C0728tb f11873u = new C0728tb(0);

    /* JADX INFO: renamed from: j */
    public final Choreographer f11874j;

    /* JADX INFO: renamed from: k */
    public final Handler f11875k;

    /* JADX INFO: renamed from: p */
    public boolean f11880p;

    /* JADX INFO: renamed from: q */
    public boolean f11881q;

    /* JADX INFO: renamed from: s */
    public final C0880xb f11883s;

    /* JADX INFO: renamed from: l */
    public final Object f11876l = new Object();

    /* JADX INFO: renamed from: m */
    public final C0017ag f11877m = new C0017ag();

    /* JADX INFO: renamed from: n */
    public ArrayList f11878n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public ArrayList f11879o = new ArrayList();

    /* JADX INFO: renamed from: r */
    public final ChoreographerFrameCallbackC0767ub f11882r = new ChoreographerFrameCallbackC0767ub(this);

    public C0804vb(Choreographer choreographer, Handler handler) {
        this.f11874j = choreographer;
        this.f11875k = handler;
        this.f11883s = new C0880xb(choreographer, this);
    }

    /* JADX INFO: renamed from: G */
    public static final void m5663G(C0804vb c0804vb) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (c0804vb.f11876l) {
                C0017ag c0017ag = c0804vb.f11877m;
                runnable = (Runnable) (c0017ag.isEmpty() ? null : c0017ag.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (c0804vb.f11876l) {
                    C0017ag c0017ag2 = c0804vb.f11877m;
                    runnable = (Runnable) (c0017ag2.isEmpty() ? null : c0017ag2.removeFirst());
                }
            }
            synchronized (c0804vb.f11876l) {
                if (c0804vb.f11877m.isEmpty()) {
                    z = false;
                    c0804vb.f11880p = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // p000.c20
    /* JADX INFO: renamed from: D */
    public final void mo612D(a20 a20Var, Runnable runnable) {
        synchronized (this.f11876l) {
            this.f11877m.addLast(runnable);
            if (!this.f11880p) {
                this.f11880p = true;
                this.f11875k.post(this.f11882r);
                if (!this.f11881q) {
                    this.f11881q = true;
                    this.f11874j.postFrameCallback(this.f11882r);
                }
            }
        }
    }
}
