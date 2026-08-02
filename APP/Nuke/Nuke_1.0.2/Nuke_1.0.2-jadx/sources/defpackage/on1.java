package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class on1 {
    public final String a;
    public final nn1 b;
    public final String c;
    public final int d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public on1(String str, nn1 nn1Var, String str2, int i) {
        this.a = str;
        this.b = nn1Var;
        this.c = str2;
        this.d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(yw0 yw0Var) {
        yw0Var.getClass();
        if (t11.l(yw0Var.a, this.a) && yw0Var.e == this.d) {
            String lowerCase = yw0Var.d.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            int iOrdinal = this.b.ordinal();
            if (iOrdinal != 0) {
                String str = this.c;
                if (iOrdinal == 1) {
                    return lowerCase.equals(str);
                }
                if (iOrdinal != 2) {
                    c80.s();
                    return false;
                }
                if (lowerCase.equals(str) || !wv2.W(lowerCase, ".".concat(str), false)) {
                }
            }
            return true;
        }
        return false;
    }
}
