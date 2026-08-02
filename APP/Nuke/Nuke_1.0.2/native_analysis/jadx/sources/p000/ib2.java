package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ib2 {

    /* JADX INFO: renamed from: a */
    public final jb2 f4522a;

    /* JADX INFO: renamed from: b */
    public final jb2 f4523b;

    /* JADX INFO: renamed from: c */
    public final Throwable f4524c;

    public ib2(jb2 jb2Var, C0674ry c0674ry, Throwable th) {
        this.f4522a = jb2Var;
        this.f4523b = c0674ry;
        this.f4524c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib2)) {
            return false;
        }
        ib2 ib2Var = (ib2) obj;
        return t11.m5086l(this.f4522a, ib2Var.f4522a) && t11.m5086l(this.f4523b, ib2Var.f4523b) && t11.m5086l(this.f4524c, ib2Var.f4524c);
    }

    public final int hashCode() {
        int iHashCode = this.f4522a.hashCode() * 31;
        jb2 jb2Var = this.f4523b;
        int iHashCode2 = (iHashCode + (jb2Var == null ? 0 : jb2Var.hashCode())) * 31;
        Throwable th = this.f4524c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f4522a + ", nextPlan=" + this.f4523b + ", throwable=" + this.f4524c + ')';
    }

    public /* synthetic */ ib2(jb2 jb2Var, Throwable th, int i) {
        this(jb2Var, (C0674ry) null, (i & 4) != 0 ? null : th);
    }
}
