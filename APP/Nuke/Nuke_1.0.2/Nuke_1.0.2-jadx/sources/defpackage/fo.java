package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fo {
    public final ArrayDeque a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fo(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayDeque();
                break;
            default:
                char[] cArr = b93.a;
                this.a = new ArrayDeque(0);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized void a(gp0 gp0Var) {
        gp0Var.b = null;
        gp0Var.c = null;
        this.a.offer(gp0Var);
    }
}
