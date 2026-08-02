package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fb3 {

    /* JADX INFO: renamed from: a */
    public final gb3 f2898a = new gb3();

    /* JADX INFO: renamed from: a */
    public final void m1595a() {
        gb3 gb3Var = this.f2898a;
        if (gb3Var != null && !gb3Var.f3391d) {
            gb3Var.f3391d = true;
            synchronized (gb3Var.f3388a) {
                try {
                    Iterator it = gb3Var.f3389b.values().iterator();
                    while (it.hasNext()) {
                        gb3.m1828a((AutoCloseable) it.next());
                    }
                    Iterator it2 = gb3Var.f3390c.iterator();
                    while (it2.hasNext()) {
                        gb3.m1828a((AutoCloseable) it2.next());
                    }
                    gb3Var.f3390c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mo1596b();
    }

    /* JADX INFO: renamed from: b */
    public void mo1596b() {
    }
}
