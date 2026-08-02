package p000;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gh1 {

    /* JADX INFO: renamed from: b */
    public static final ArrayDeque f3527b;

    /* JADX INFO: renamed from: a */
    public Object f3528a;

    static {
        char[] cArr = b93.f747a;
        f3527b = new ArrayDeque(0);
    }

    /* JADX INFO: renamed from: a */
    public static gh1 m1923a(Object obj) {
        gh1 gh1Var;
        ArrayDeque arrayDeque = f3527b;
        synchronized (arrayDeque) {
            gh1Var = (gh1) arrayDeque.poll();
        }
        if (gh1Var == null) {
            gh1Var = new gh1();
        }
        gh1Var.f3528a = obj;
        return gh1Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gh1) && this.f3528a.equals(((gh1) obj).f3528a);
    }

    public final int hashCode() {
        return this.f3528a.hashCode();
    }
}
