package defpackage;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class j53 extends q43 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        int iV;
        if (l41Var.I() == 9) {
            l41Var.E();
            return null;
        }
        l41Var.c();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (l41Var.I() == 4) {
                l41Var.j();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }
            String strB = l41Var.B();
            iV = l41Var.v();
            switch (strB) {
                case "dayOfMonth":
                    i3 = iV;
                    break;
                case "minute":
                    i5 = iV;
                    break;
                case "second":
                    i6 = iV;
                    break;
                case "year":
                    i = iV;
                    break;
                case "month":
                    i2 = iV;
                    break;
                case "hourOfDay":
                    i4 = iV;
                    break;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            o41Var.p();
            return;
        }
        o41Var.e();
        o41Var.k("year");
        o41Var.A(r4.get(1));
        o41Var.k("month");
        o41Var.A(r4.get(2));
        o41Var.k("dayOfMonth");
        o41Var.A(r4.get(5));
        o41Var.k("hourOfDay");
        o41Var.A(r4.get(11));
        o41Var.k("minute");
        o41Var.A(r4.get(12));
        o41Var.k("second");
        o41Var.A(r4.get(13));
        o41Var.j();
    }
}
