package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qc1 {

    /* JADX INFO: renamed from: a */
    public final rc1 f5119a = new rc1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3212a() {
        rc1 rc1Var = this.f5119a;
        if (rc1Var != null && !rc1Var.f5356d) {
            rc1Var.f5356d = true;
            synchronized (rc1Var.f5353a) {
                try {
                    Iterator it = rc1Var.f5354b.values().iterator();
                    while (it.hasNext()) {
                        rc1.m3441a((AutoCloseable) it.next());
                    }
                    Iterator it2 = rc1Var.f5355c.iterator();
                    while (it2.hasNext()) {
                        rc1.m3441a((AutoCloseable) it2.next());
                    }
                    rc1Var.f5355c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mo508b();
    }

    /* JADX INFO: renamed from: b */
    public void mo508b() {
    }
}
