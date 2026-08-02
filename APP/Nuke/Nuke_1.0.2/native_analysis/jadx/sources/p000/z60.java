package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z60 implements rd0 {

    /* JADX INFO: renamed from: a */
    public final int f13739a;

    /* JADX INFO: renamed from: b */
    public final int f13740b;

    public z60(int i, int i2) {
        this.f13739a = i;
        this.f13740b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        lz0.m2988a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // p000.rd0
    /* JADX INFO: renamed from: a */
    public final void mo103a(sd0 sd0Var) {
        int i = sd0Var.f10056c;
        sx1 sx1Var = (sx1) sd0Var.f10059f;
        int i2 = this.f13740b;
        int iM5009b = i + i2;
        if (((i ^ iM5009b) & (i2 ^ iM5009b)) < 0) {
            iM5009b = sx1Var.m5009b();
        }
        sd0Var.m4798d(sd0Var.f10056c, Math.min(iM5009b, sx1Var.m5009b()));
        int i3 = sd0Var.f10055b;
        int i4 = this.f13739a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        sd0Var.m4798d(Math.max(0, i5), sd0Var.f10055b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z60)) {
            return false;
        }
        z60 z60Var = (z60) obj;
        return this.f13739a == z60Var.f13739a && this.f13740b == z60Var.f13740b;
    }

    public final int hashCode() {
        return (this.f13739a * 31) + this.f13740b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f13739a);
        sb.append(", lengthAfterCursor=");
        return vi0.m5694m(sb, this.f13740b, ')');
    }
}
