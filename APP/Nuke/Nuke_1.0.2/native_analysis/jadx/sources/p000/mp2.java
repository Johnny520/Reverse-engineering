package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mp2 implements rd0 {

    /* JADX INFO: renamed from: a */
    public final int f6761a;

    /* JADX INFO: renamed from: b */
    public final int f6762b;

    public mp2(int i, int i2) {
        this.f6761a = i;
        this.f6762b = i2;
    }

    @Override // p000.rd0
    /* JADX INFO: renamed from: a */
    public final void mo103a(sd0 sd0Var) {
        int iM779D = ci0.m779D(this.f6761a, 0, ((sx1) sd0Var.f10059f).m5009b());
        int iM779D2 = ci0.m779D(this.f6762b, 0, ((sx1) sd0Var.f10059f).m5009b());
        if (iM779D < iM779D2) {
            sd0Var.m4806l(iM779D, iM779D2);
        } else {
            sd0Var.m4806l(iM779D2, iM779D);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp2)) {
            return false;
        }
        mp2 mp2Var = (mp2) obj;
        return this.f6761a == mp2Var.f6761a && this.f6762b == mp2Var.f6762b;
    }

    public final int hashCode() {
        return (this.f6761a * 31) + this.f6762b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f6761a);
        sb.append(", end=");
        return vi0.m5694m(sb, this.f6762b, ')');
    }
}
