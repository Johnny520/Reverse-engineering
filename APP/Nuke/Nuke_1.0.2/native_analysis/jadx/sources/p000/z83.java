package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z83 {

    /* JADX INFO: renamed from: a */
    public final ji0 f13785a;

    /* JADX INFO: renamed from: b */
    public final int f13786b;

    public z83(ji0 ji0Var, int i) {
        if (i == 0) {
            throw null;
        }
        this.f13785a = ji0Var;
        this.f13786b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z83)) {
            return false;
        }
        z83 z83Var = (z83) obj;
        return this.f13785a.equals(z83Var.f13785a) && this.f13786b == z83Var.f13786b;
    }

    public final int hashCode() {
        return vi0.m5702u(this.f13786b) + (this.f13785a.f5048k.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsingFieldData(field=");
        sb.append(this.f13785a);
        sb.append(", usingType=");
        int i = this.f13786b;
        sb.append(i != 1 ? i != 2 ? "null" : "Write" : "Read");
        sb.append(")");
        return sb.toString();
    }
}
