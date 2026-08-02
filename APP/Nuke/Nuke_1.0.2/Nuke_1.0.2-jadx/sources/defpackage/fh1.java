package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fh1 extends wd1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wd1
    public final void e(Object obj, Object obj2) {
        gh1 gh1Var = (gh1) obj;
        gh1Var.getClass();
        ArrayDeque arrayDeque = gh1.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(gh1Var);
        }
    }
}
