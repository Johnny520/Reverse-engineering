package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q72 {
    public int a;
    public w53 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof r72)) {
            return false;
        }
        r72 r72Var = (r72) obj;
        int i = this.a;
        w53 w53Var = this.b;
        ConcurrentHashMap concurrentHashMap = r72.j;
        return r72Var.h == i && r72Var.i.equals(w53Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = this.a;
        w53 w53Var = this.b;
        ConcurrentHashMap concurrentHashMap = r72.j;
        return (w53Var.hashCode() * 31) + i;
    }
}
