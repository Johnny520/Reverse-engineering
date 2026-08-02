package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sm2 {

    /* JADX INFO: renamed from: a */
    public final c92 f10194a;

    /* JADX INFO: renamed from: b */
    public final int f10195b;

    /* JADX INFO: renamed from: c */
    public final long f10196c;

    public sm2(c92 c92Var, int i, long j) {
        this.f10194a = c92Var;
        this.f10195b = i;
        this.f10196c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm2)) {
            return false;
        }
        sm2 sm2Var = (sm2) obj;
        return this.f10194a == sm2Var.f10194a && this.f10195b == sm2Var.f10195b && this.f10196c == sm2Var.f10196c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10196c) + vi0.m5685d(this.f10195b, this.f10194a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f10194a + ", offset=" + this.f10195b + ", selectableId=" + this.f10196c + ')';
    }
}
