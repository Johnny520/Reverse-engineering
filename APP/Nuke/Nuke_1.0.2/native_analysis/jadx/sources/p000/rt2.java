package p000;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rt2 extends q43 {

    /* JADX INFO: renamed from: b */
    public static final C0669a f9753b = new C0669a();

    /* JADX INFO: renamed from: a */
    public final SimpleDateFormat f9754a;

    /* JADX INFO: renamed from: rt2$a */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public class C0669a implements r43 {
        @Override // p000.r43
        /* JADX INFO: renamed from: a */
        public final q43 mo162a(ir0 ir0Var, j63 j63Var) {
            if (j63Var.f4904a == Date.class) {
                return new rt2(0);
            }
            return null;
        }
    }

    private rt2() {
        this.f9754a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        Date date;
        if (l41Var.m2814I() == 9) {
            l41Var.m2810E();
            return null;
        }
        String strM2812G = l41Var.m2812G();
        synchronized (this) {
            TimeZone timeZone = this.f9754a.getTimeZone();
            try {
                try {
                    date = new Date(this.f9754a.parse(strM2812G).getTime());
                } catch (ParseException e) {
                    throw new t31("Failed parsing '" + strM2812G + "' as SQL Date; at path " + l41Var.m2831o(true), e);
                }
            } finally {
                this.f9754a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            o41Var.m3498p();
            return;
        }
        synchronized (this) {
            str = this.f9754a.format((java.util.Date) date);
        }
        o41Var.m3487D(str);
    }

    public /* synthetic */ rt2(int i) {
        this();
    }
}
