package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fb3 {
    public final gb3 a = new gb3();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        gb3 gb3Var = this.a;
        if (gb3Var != null && !gb3Var.d) {
            gb3Var.d = true;
            synchronized (gb3Var.a) {
                try {
                    Iterator it = gb3Var.b.values().iterator();
                    while (it.hasNext()) {
                        gb3.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = gb3Var.c.iterator();
                    while (it2.hasNext()) {
                        gb3.a((AutoCloseable) it2.next());
                    }
                    gb3Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
