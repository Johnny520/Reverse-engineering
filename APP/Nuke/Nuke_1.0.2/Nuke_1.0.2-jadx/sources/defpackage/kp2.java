package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kp2 implements rd0 {
    public final int a;
    public final int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kp2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rd0
    public final void a(sd0 sd0Var) {
        boolean z = sd0Var.d != -1;
        sx1 sx1Var = (sx1) sd0Var.f;
        if (z) {
            sd0Var.d = -1;
            sd0Var.e = -1;
        }
        int iD = ci0.D(this.a, 0, sx1Var.b());
        int iD2 = ci0.D(this.b, 0, sx1Var.b());
        if (iD != iD2) {
            if (iD < iD2) {
                sd0Var.k(iD, iD2);
            } else {
                sd0Var.k(iD2, iD);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp2)) {
            return false;
        }
        kp2 kp2Var = (kp2) obj;
        return this.a == kp2Var.a && this.b == kp2Var.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return vi0.m(sb, this.b, ')');
    }
}
