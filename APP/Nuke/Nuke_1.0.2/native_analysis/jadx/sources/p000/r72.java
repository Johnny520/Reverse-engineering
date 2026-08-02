package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r72 implements w53, t23, Comparable {

    /* JADX INFO: renamed from: j */
    public static final ConcurrentHashMap f9417j = new ConcurrentHashMap(10000, 0.75f);

    /* JADX INFO: renamed from: k */
    public static final C0728tb f9418k = new C0728tb(3);

    /* JADX INFO: renamed from: h */
    public final int f9419h;

    /* JADX INFO: renamed from: i */
    public final w53 f9420i;

    public r72(int i, w53 w53Var) {
        if (i < 0) {
            C0676s.m4651j("reg < 0");
            throw null;
        }
        if (w53Var == null) {
            um2.m5516f("type == null");
            throw null;
        }
        this.f9419h = i;
        this.f9420i = w53Var;
    }

    /* JADX INFO: renamed from: e */
    public static r72 m4399e(int i, w53 w53Var) {
        q72 q72Var = (q72) f9418k.get();
        q72Var.f8812a = i;
        q72Var.f8813b = w53Var;
        ConcurrentHashMap concurrentHashMap = f9417j;
        r72 r72Var = (r72) concurrentHashMap.get(q72Var);
        if (r72Var == null) {
            r72Var = new r72(q72Var.f8812a, q72Var.f8813b);
            r72 r72Var2 = (r72) concurrentHashMap.putIfAbsent(r72Var, r72Var);
            if (r72Var2 != null) {
                return r72Var2;
            }
        }
        return r72Var;
    }

    @Override // p000.w53
    /* JADX INFO: renamed from: a */
    public final o43 mo22a() {
        return this.f9420i.mo22a();
    }

    @Override // p000.t23
    /* JADX INFO: renamed from: b */
    public final String mo23b() {
        return m4403h(true);
    }

    @Override // p000.w53
    /* JADX INFO: renamed from: c */
    public final int mo2614c() {
        return this.f9420i.mo2614c();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r72 r72Var = (r72) obj;
        int i = r72Var.f9419h;
        int i2 = this.f9419h;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        if (this == r72Var) {
            return 0;
        }
        int iCompareTo = this.f9420i.mo22a().f7521h.compareTo(r72Var.f9420i.mo22a().f7521h);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m4400d() {
        return this.f9420i.mo22a().m3507e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = obj instanceof r72;
        w53 w53Var = this.f9420i;
        int i = this.f9419h;
        if (z) {
            r72 r72Var = (r72) obj;
            return i == r72Var.f9419h && w53Var.equals(r72Var.f9420i);
        }
        if (obj instanceof q72) {
            q72 q72Var = (q72) obj;
            int i2 = q72Var.f8812a;
            w53 w53Var2 = q72Var.f8813b;
            if (i == i2 && w53Var.equals(w53Var2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4401f() {
        int i = this.f9420i.mo22a().f7522i;
        return i == 4 || i == 7;
    }

    /* JADX INFO: renamed from: g */
    public final String m4402g() {
        return vi0.m5688g("v", this.f9419h);
    }

    /* JADX INFO: renamed from: h */
    public final String m4403h(boolean z) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(m4402g());
        sb.append(":");
        w53 w53Var = this.f9420i;
        o43 o43VarMo22a = w53Var.mo22a();
        sb.append(o43VarMo22a);
        if (o43VarMo22a != w53Var) {
            sb.append("=");
            if (z && (w53Var instanceof q30)) {
                sb.append(((q30) w53Var).m4048g());
            } else if (z && (w53Var instanceof AbstractC0147dz)) {
                sb.append(w53Var.mo23b());
            } else {
                sb.append(w53Var);
            }
        }
        return sb.toString();
    }

    public final int hashCode() {
        return (this.f9420i.hashCode() * 31) + this.f9419h;
    }

    public final String toString() {
        return m4403h(false);
    }
}
