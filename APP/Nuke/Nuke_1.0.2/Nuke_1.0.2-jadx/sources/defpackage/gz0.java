package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gz0 extends b12 {
    public final boolean l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gz0(String str, hz0 hz0Var) {
        super(str, hz0Var, 1);
        this.l = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.b12
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gz0) {
            yo2 yo2Var = (yo2) obj;
            if (this.a.equals(yo2Var.b())) {
                gz0 gz0Var = (gz0) obj;
                if (gz0Var.l && Arrays.equals((yo2[]) this.j.getValue(), (yo2[]) gz0Var.j.getValue())) {
                    int iD = yo2Var.d();
                    int i = this.c;
                    if (i == iD) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (t11.l(j(i2).b(), yo2Var.j(i2).b()) && t11.l(j(i2).c(), yo2Var.j(i2).c())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final boolean f() {
        return this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.b12
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
