package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rd1 implements y12 {

    /* JADX INFO: renamed from: a */
    public final sd1 f9518a;

    /* JADX INFO: renamed from: b */
    public int f9519b;

    /* JADX INFO: renamed from: c */
    public Class f9520c;

    public rd1(sd1 sd1Var) {
        this.f9518a = sd1Var;
    }

    @Override // p000.y12
    /* JADX INFO: renamed from: a */
    public final void mo2390a() {
        this.f9518a.m4875g(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rd1) {
            rd1 rd1Var = (rd1) obj;
            if (this.f9519b == rd1Var.f9519b && this.f9520c == rd1Var.f9520c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f9519b * 31;
        Class cls = this.f9520c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f9519b + "array=" + this.f9520c + '}';
    }
}
