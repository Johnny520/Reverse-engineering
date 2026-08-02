package p000;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fh1 extends wd1 {
    @Override // p000.wd1
    /* JADX INFO: renamed from: e */
    public final void mo1655e(Object obj, Object obj2) {
        gh1 gh1Var = (gh1) obj;
        gh1Var.getClass();
        ArrayDeque arrayDeque = gh1.f3527b;
        synchronized (arrayDeque) {
            arrayDeque.offer(gh1Var);
        }
    }
}
