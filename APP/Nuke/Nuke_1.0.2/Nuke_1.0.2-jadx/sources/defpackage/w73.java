package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w73 {
    public dq1 a;
    public dq1 b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(k03 k03Var) {
        dq1 dq1Var;
        sd sdVar = k03Var.a;
        this.e = false;
        dq1 dq1Var2 = this.a;
        if (k03Var.equals(dq1Var2 != null ? (k03) dq1Var2.j : null)) {
            return;
        }
        String str = sdVar.i;
        dq1 dq1Var3 = this.a;
        boolean zL = t11.l(str, dq1Var3 != null ? ((k03) dq1Var3.j).a.i : null);
        dq1 dq1Var4 = this.a;
        if (zL) {
            if (dq1Var4 != null) {
                dq1Var4.j = k03Var;
                return;
            }
            return;
        }
        this.a = new dq1(18, dq1Var4, k03Var);
        this.b = null;
        int length = sdVar.i.length() + this.c;
        this.c = length;
        if (length > 100000) {
            dq1 dq1Var5 = this.a;
            if ((dq1Var5 != null ? (dq1) dq1Var5.i : null) == null) {
                return;
            }
            while (true) {
                if (dq1Var5 == null) {
                    dq1Var = null;
                } else {
                    dq1 dq1Var6 = (dq1) dq1Var5.i;
                    if (dq1Var6 != null) {
                        dq1Var = (dq1) dq1Var6.i;
                    }
                }
                if (dq1Var == null) {
                    break;
                } else {
                    dq1Var5 = (dq1) dq1Var5.i;
                }
            }
            if (dq1Var5 != null) {
                dq1Var5.i = null;
            }
        }
    }
}
