package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a70 implements rd0 {
    public final int a;
    public final int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a70(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        lz0.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rd0
    public final void a(sd0 sd0Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = sd0Var.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(sd0Var.g((i5 - i4) + (-1))) && Character.isLowSurrogate(sd0Var.g(sd0Var.b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int iB = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i6 = iB + 1;
            int i7 = sd0Var.c;
            sx1 sx1Var = (sx1) sd0Var.f;
            if (i7 + i6 >= sx1Var.b()) {
                iB = sx1Var.b() - sd0Var.c;
                break;
            } else {
                iB = (Character.isHighSurrogate(sd0Var.g((sd0Var.c + i6) + (-1))) && Character.isLowSurrogate(sd0Var.g(sd0Var.c + i6))) ? iB + 2 : i6;
                i++;
            }
        }
        int i8 = sd0Var.c;
        sd0Var.d(i8, iB + i8);
        int i9 = sd0Var.b;
        sd0Var.d(i9 - i3, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a70)) {
            return false;
        }
        a70 a70Var = (a70) obj;
        return this.a == a70Var.a && this.b == a70Var.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return vi0.m(sb, this.b, ')');
    }
}
