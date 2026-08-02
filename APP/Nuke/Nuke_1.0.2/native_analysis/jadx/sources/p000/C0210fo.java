package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: fo */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0210fo {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f3076a;

    public C0210fo(int i) {
        switch (i) {
            case 1:
                this.f3076a = new ArrayDeque();
                break;
            default:
                char[] cArr = b93.f747a;
                this.f3076a = new ArrayDeque(0);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1698a(gp0 gp0Var) {
        gp0Var.f3647b = null;
        gp0Var.f3648c = null;
        this.f3076a.offer(gp0Var);
    }
}
