package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r72 implements w53, t23, Comparable {
    public static final ConcurrentHashMap j = new ConcurrentHashMap(10000, 0.75f);
    public static final tb k = new tb(3);
    public final int h;
    public final w53 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r72(int i, w53 w53Var) {
        if (i < 0) {
            s.j("reg < 0");
            throw null;
        }
        if (w53Var == null) {
            um2.f("type == null");
            throw null;
        }
        this.h = i;
        this.i = w53Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static r72 e(int i, w53 w53Var) {
        q72 q72Var = (q72) k.get();
        q72Var.a = i;
        q72Var.b = w53Var;
        ConcurrentHashMap concurrentHashMap = j;
        r72 r72Var = (r72) concurrentHashMap.get(q72Var);
        if (r72Var == null) {
            r72Var = new r72(q72Var.a, q72Var.b);
            r72 r72Var2 = (r72) concurrentHashMap.putIfAbsent(r72Var, r72Var);
            if (r72Var2 != null) {
                return r72Var2;
            }
        }
        return r72Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w53
    public final o43 a() {
        return this.i.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t23
    public final String b() {
        return h(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w53
    public final int c() {
        return this.i.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r72 r72Var = (r72) obj;
        int i = r72Var.h;
        int i2 = this.h;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        if (this == r72Var) {
            return 0;
        }
        int iCompareTo = this.i.a().h.compareTo(r72Var.i.a().h);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d() {
        return this.i.a().e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = obj instanceof r72;
        w53 w53Var = this.i;
        int i = this.h;
        if (z) {
            r72 r72Var = (r72) obj;
            return i == r72Var.h && w53Var.equals(r72Var.i);
        }
        if (obj instanceof q72) {
            q72 q72Var = (q72) obj;
            int i2 = q72Var.a;
            w53 w53Var2 = q72Var.b;
            if (i == i2 && w53Var.equals(w53Var2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f() {
        int i = this.i.a().i;
        return i == 4 || i == 7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String g() {
        return vi0.g("v", this.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String h(boolean z) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(g());
        sb.append(":");
        w53 w53Var = this.i;
        o43 o43VarA = w53Var.a();
        sb.append(o43VarA);
        if (o43VarA != w53Var) {
            sb.append("=");
            if (z && (w53Var instanceof q30)) {
                sb.append(((q30) w53Var).g());
            } else if (z && (w53Var instanceof dz)) {
                sb.append(w53Var.b());
            } else {
                sb.append(w53Var);
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.i.hashCode() * 31) + this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return h(false);
    }
}
