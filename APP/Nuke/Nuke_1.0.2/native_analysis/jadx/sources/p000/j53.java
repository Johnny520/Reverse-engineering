package p000;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class j53 extends q43 {
    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        int iM2837v;
        if (l41Var.m2814I() == 9) {
            l41Var.m2810E();
            return null;
        }
        l41Var.m2825c();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (l41Var.m2814I() == 4) {
                l41Var.m2829j();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }
            String strM2808B = l41Var.m2808B();
            iM2837v = l41Var.m2837v();
            switch (strM2808B) {
                case "dayOfMonth":
                    i3 = iM2837v;
                    break;
                case "minute":
                    i5 = iM2837v;
                    break;
                case "second":
                    i6 = iM2837v;
                    break;
                case "year":
                    i = iM2837v;
                    break;
                case "month":
                    i2 = iM2837v;
                    break;
                case "hourOfDay":
                    i4 = iM2837v;
                    break;
            }
        }
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            o41Var.m3498p();
            return;
        }
        o41Var.m3492e();
        o41Var.m3496k("year");
        o41Var.m3485A(r4.get(1));
        o41Var.m3496k("month");
        o41Var.m3485A(r4.get(2));
        o41Var.m3496k("dayOfMonth");
        o41Var.m3485A(r4.get(5));
        o41Var.m3496k("hourOfDay");
        o41Var.m3485A(r4.get(11));
        o41Var.m3496k("minute");
        o41Var.m3485A(r4.get(12));
        o41Var.m3496k("second");
        o41Var.m3485A(r4.get(13));
        o41Var.m3495j();
    }
}
