package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q72 {

    /* JADX INFO: renamed from: a */
    public int f8812a;

    /* JADX INFO: renamed from: b */
    public w53 f8813b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof r72)) {
            return false;
        }
        r72 r72Var = (r72) obj;
        int i = this.f8812a;
        w53 w53Var = this.f8813b;
        ConcurrentHashMap concurrentHashMap = r72.f9417j;
        return r72Var.f9419h == i && r72Var.f9420i.equals(w53Var);
    }

    public final int hashCode() {
        int i = this.f8812a;
        w53 w53Var = this.f8813b;
        ConcurrentHashMap concurrentHashMap = r72.f9417j;
        return (w53Var.hashCode() * 31) + i;
    }
}
