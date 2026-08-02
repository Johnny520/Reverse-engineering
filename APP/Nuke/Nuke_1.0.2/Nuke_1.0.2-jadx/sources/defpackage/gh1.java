package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gh1 {
    public static final ArrayDeque b;
    public Object a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        char[] cArr = b93.a;
        b = new ArrayDeque(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static gh1 a(Object obj) {
        gh1 gh1Var;
        ArrayDeque arrayDeque = b;
        synchronized (arrayDeque) {
            gh1Var = (gh1) arrayDeque.poll();
        }
        if (gh1Var == null) {
            gh1Var = new gh1();
        }
        gh1Var.a = obj;
        return gh1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof gh1) && this.a.equals(((gh1) obj).a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.a.hashCode();
    }
}
