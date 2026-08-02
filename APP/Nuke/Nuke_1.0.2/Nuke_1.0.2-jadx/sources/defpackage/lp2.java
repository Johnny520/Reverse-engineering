package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lp2 implements rd0 {
    public final sd a;
    public final int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lp2(String str, int i) {
        this.a = new sd(str);
        this.b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rd0
    public final void a(sd0 sd0Var) {
        int i = sd0Var.d;
        sd sdVar = this.a;
        if (i != -1) {
            int i2 = sd0Var.e;
            String str = sdVar.i;
            String str2 = sdVar.i;
            sd0Var.i(str, i, i2);
            if (str2.length() > 0) {
                sd0Var.k(i, str2.length() + i);
            }
        } else {
            int i3 = sd0Var.b;
            int i4 = sd0Var.c;
            String str3 = sdVar.i;
            String str4 = sdVar.i;
            sd0Var.i(str3, i3, i4);
            if (str4.length() > 0) {
                sd0Var.k(i3, str4.length() + i3);
            }
        }
        int i5 = sd0Var.b;
        int i6 = sd0Var.c;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.b;
        int iD = ci0.D(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - sdVar.i.length(), 0, ((sx1) sd0Var.f).b());
        sd0Var.l(iD, iD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp2)) {
            return false;
        }
        lp2 lp2Var = (lp2) obj;
        return t11.l(this.a.i, lp2Var.a.i) && this.b == lp2Var.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.a.i.hashCode() * 31) + this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.i);
        sb.append("', newCursorPosition=");
        return vi0.m(sb, this.b, ')');
    }
}
