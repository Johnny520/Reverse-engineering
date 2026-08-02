package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kp2 implements rd0 {

    /* JADX INFO: renamed from: a */
    public final int f5702a;

    /* JADX INFO: renamed from: b */
    public final int f5703b;

    public kp2(int i, int i2) {
        this.f5702a = i;
        this.f5703b = i2;
    }

    @Override // p000.rd0
    /* JADX INFO: renamed from: a */
    public final void mo103a(sd0 sd0Var) {
        boolean z = sd0Var.f10057d != -1;
        sx1 sx1Var = (sx1) sd0Var.f10059f;
        if (z) {
            sd0Var.f10057d = -1;
            sd0Var.f10058e = -1;
        }
        int iM779D = ci0.m779D(this.f5702a, 0, sx1Var.m5009b());
        int iM779D2 = ci0.m779D(this.f5703b, 0, sx1Var.m5009b());
        if (iM779D != iM779D2) {
            if (iM779D < iM779D2) {
                sd0Var.m4805k(iM779D, iM779D2);
            } else {
                sd0Var.m4805k(iM779D2, iM779D);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp2)) {
            return false;
        }
        kp2 kp2Var = (kp2) obj;
        return this.f5702a == kp2Var.f5702a && this.f5703b == kp2Var.f5703b;
    }

    public final int hashCode() {
        return (this.f5702a * 31) + this.f5703b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f5702a);
        sb.append(", end=");
        return vi0.m5694m(sb, this.f5703b, ')');
    }
}
