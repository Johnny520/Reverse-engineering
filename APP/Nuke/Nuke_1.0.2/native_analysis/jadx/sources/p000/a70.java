package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a70 implements rd0 {

    /* JADX INFO: renamed from: a */
    public final int f101a;

    /* JADX INFO: renamed from: b */
    public final int f102b;

    public a70(int i, int i2) {
        this.f101a = i;
        this.f102b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        lz0.m2988a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // p000.rd0
    /* JADX INFO: renamed from: a */
    public final void mo103a(sd0 sd0Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.f101a) {
                int i4 = i3 + 1;
                int i5 = sd0Var.f10055b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(sd0Var.m4801g((i5 - i4) + (-1))) && Character.isLowSurrogate(sd0Var.m4801g(sd0Var.f10055b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int iM5009b = 0;
        while (true) {
            if (i >= this.f102b) {
                break;
            }
            int i6 = iM5009b + 1;
            int i7 = sd0Var.f10056c;
            sx1 sx1Var = (sx1) sd0Var.f10059f;
            if (i7 + i6 >= sx1Var.m5009b()) {
                iM5009b = sx1Var.m5009b() - sd0Var.f10056c;
                break;
            } else {
                iM5009b = (Character.isHighSurrogate(sd0Var.m4801g((sd0Var.f10056c + i6) + (-1))) && Character.isLowSurrogate(sd0Var.m4801g(sd0Var.f10056c + i6))) ? iM5009b + 2 : i6;
                i++;
            }
        }
        int i8 = sd0Var.f10056c;
        sd0Var.m4798d(i8, iM5009b + i8);
        int i9 = sd0Var.f10055b;
        sd0Var.m4798d(i9 - i3, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a70)) {
            return false;
        }
        a70 a70Var = (a70) obj;
        return this.f101a == a70Var.f101a && this.f102b == a70Var.f102b;
    }

    public final int hashCode() {
        return (this.f101a * 31) + this.f102b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f101a);
        sb.append(", lengthAfterCursor=");
        return vi0.m5694m(sb, this.f102b, ')');
    }
}
