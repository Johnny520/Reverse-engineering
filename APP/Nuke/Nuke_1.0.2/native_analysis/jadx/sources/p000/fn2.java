package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fn2 {

    /* JADX INFO: renamed from: a */
    public final rr0 f3072a;

    /* JADX INFO: renamed from: b */
    public final long f3073b;

    /* JADX INFO: renamed from: c */
    public final en2 f3074c;

    /* JADX INFO: renamed from: d */
    public final boolean f3075d;

    public fn2(rr0 rr0Var, long j, en2 en2Var, boolean z) {
        this.f3072a = rr0Var;
        this.f3073b = j;
        this.f3074c = en2Var;
        this.f3075d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn2)) {
            return false;
        }
        fn2 fn2Var = (fn2) obj;
        return this.f3072a == fn2Var.f3072a && rs1.m4609b(this.f3073b, fn2Var.f3073b) && this.f3074c == fn2Var.f3074c && this.f3075d == fn2Var.f3075d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3075d) + ((this.f3074c.hashCode() + hk1.m2204c(this.f3072a.hashCode() * 31, 31, this.f3073b)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f3072a + ", position=" + ((Object) rs1.m4614g(this.f3073b)) + ", anchor=" + this.f3074c + ", visible=" + this.f3075d + ')';
    }
}
