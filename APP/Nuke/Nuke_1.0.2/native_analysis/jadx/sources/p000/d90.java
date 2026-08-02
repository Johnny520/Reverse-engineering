package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d90 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h90 f1914a;

    public d90(h90 h90Var) {
        this.f1914a = h90Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f1914a) {
            try {
                h90 h90Var = this.f1914a;
                if (h90Var.f3917q == null) {
                    return null;
                }
                h90Var.m2137v();
                if (this.f1914a.m2132o()) {
                    this.f1914a.m2136t();
                    this.f1914a.f3919s = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
