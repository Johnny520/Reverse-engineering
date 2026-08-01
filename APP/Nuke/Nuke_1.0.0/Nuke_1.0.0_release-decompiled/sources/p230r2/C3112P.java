package p230r2;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import p213o2.AbstractC2770B;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.P */
/* JADX INFO: loaded from: classes.dex */
public class C3112P extends AbstractC2770B {
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) throws IOException {
        int iM5622A;
        if (c3390a.m5630J() == 9) {
            c3390a.m5626F();
            return null;
        }
        c3390a.m5640c();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (c3390a.m5630J() == 4) {
                c3390a.m5644j();
                return new GregorianCalendar(i5, i6, i7, i8, i9, i10);
            }
            String strM5624D = c3390a.m5624D();
            iM5622A = c3390a.m5622A();
            strM5624D.getClass();
            switch (strM5624D) {
                case "dayOfMonth":
                    i7 = iM5622A;
                    break;
                case "minute":
                    i9 = iM5622A;
                    break;
                case "second":
                    i10 = iM5622A;
                    break;
                case "year":
                    i5 = iM5622A;
                    break;
                case "month":
                    i6 = iM5622A;
                    break;
                case "hourOfDay":
                    i8 = iM5622A;
                    break;
            }
        }
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            c3391b.m5666n();
            return;
        }
        c3391b.m5660d();
        c3391b.m5664l("year");
        c3391b.m5653C(r4.get(1));
        c3391b.m5664l("month");
        c3391b.m5653C(r4.get(2));
        c3391b.m5664l("dayOfMonth");
        c3391b.m5653C(r4.get(5));
        c3391b.m5664l("hourOfDay");
        c3391b.m5653C(r4.get(11));
        c3391b.m5664l("minute");
        c3391b.m5653C(r4.get(12));
        c3391b.m5664l("second");
        c3391b.m5653C(r4.get(13));
        c3391b.m5663j();
    }
}
