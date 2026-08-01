package p047I0;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import p049I2.AbstractC0797o;
import p056K2.C0887m;
import p061L2.C0971k;
import p074O2.InterfaceC1051i;
import p160f3.AbstractC2153p;

/* JADX INFO: renamed from: I0.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C0706Y extends AbstractC2153p {

    /* JADX INFO: renamed from: p */
    public static final C0887m f2233p = AbstractC0797o.m1396u(C0683M.f2183k);

    /* JADX INFO: renamed from: q */
    public static final C0702W f2234q = new C0702W(0);

    /* JADX INFO: renamed from: f */
    public final Choreographer f2235f;

    /* JADX INFO: renamed from: g */
    public final Handler f2236g;

    /* JADX INFO: renamed from: l */
    public boolean f2241l;

    /* JADX INFO: renamed from: m */
    public boolean f2242m;

    /* JADX INFO: renamed from: o */
    public final C0711a0 f2244o;

    /* JADX INFO: renamed from: h */
    public final Object f2237h = new Object();

    /* JADX INFO: renamed from: i */
    public final C0971k f2238i = new C0971k();

    /* JADX INFO: renamed from: j */
    public ArrayList f2239j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public ArrayList f2240k = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final ChoreographerFrameCallbackC0704X f2243n = new ChoreographerFrameCallbackC0704X(this);

    public C0706Y(Choreographer choreographer, Handler handler) {
        this.f2235f = choreographer;
        this.f2236g = handler;
        this.f2244o = new C0711a0(choreographer, this);
    }

    /* JADX INFO: renamed from: G */
    public static final void m1206G(C0706Y c0706y) {
        Runnable runnable;
        boolean z5;
        do {
            synchronized (c0706y.f2237h) {
                C0971k c0971k = c0706y.f2238i;
                runnable = (Runnable) (c0971k.isEmpty() ? null : c0971k.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (c0706y.f2237h) {
                    C0971k c0971k2 = c0706y.f2238i;
                    runnable = (Runnable) (c0971k2.isEmpty() ? null : c0971k2.removeFirst());
                }
            }
            synchronized (c0706y.f2237h) {
                if (c0706y.f2238i.isEmpty()) {
                    z5 = false;
                    c0706y.f2241l = false;
                } else {
                    z5 = true;
                }
            }
        } while (z5);
    }

    @Override // p160f3.AbstractC2153p
    /* JADX INFO: renamed from: D */
    public final void mo1207D(InterfaceC1051i interfaceC1051i, Runnable runnable) {
        synchronized (this.f2237h) {
            this.f2238i.addLast(runnable);
            if (!this.f2241l) {
                this.f2241l = true;
                this.f2236g.post(this.f2243n);
                if (!this.f2242m) {
                    this.f2242m = true;
                    this.f2235f.postFrameCallback(this.f2243n);
                }
            }
        }
    }
}
