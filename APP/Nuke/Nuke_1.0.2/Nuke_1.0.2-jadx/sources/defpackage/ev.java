package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ev implements rd0 {
    public final sd a;
    public final int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ev(String str, int i) {
        this(new sd(str), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rd0
    public final void a(sd0 sd0Var) {
        int i = sd0Var.d;
        sd sdVar = this.a;
        if (i != -1) {
            sd0Var.i(sdVar.i, i, sd0Var.e);
        } else {
            sd0Var.i(sdVar.i, sd0Var.b, sd0Var.c);
        }
        int i2 = sd0Var.b;
        int i3 = sd0Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int iD = ci0.D(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - sdVar.i.length(), 0, ((sx1) sd0Var.f).b());
        sd0Var.l(iD, iD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev)) {
            return false;
        }
        ev evVar = (ev) obj;
        return t11.l(this.a.i, evVar.a.i) && this.b == evVar.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.a.i.hashCode() * 31) + this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.i);
        sb.append("', newCursorPosition=");
        return vi0.m(sb, this.b, ')');
    }

    public ev(sd sdVar, int i) {
        this.a = sdVar;
        this.b = i;
    }
}
