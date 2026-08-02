package p000;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class st2 extends q43 {

    /* JADX INFO: renamed from: b */
    public static final C0707a f10366b = new C0707a();

    /* JADX INFO: renamed from: a */
    public final SimpleDateFormat f10367a;

    /* JADX INFO: renamed from: st2$a */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public class C0707a implements r43 {
        @Override // p000.r43
        /* JADX INFO: renamed from: a */
        public final q43 mo162a(ir0 ir0Var, j63 j63Var) {
            if (j63Var.f4904a == Time.class) {
                return new st2(0);
            }
            return null;
        }
    }

    private st2() {
        this.f10367a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        Time time;
        if (l41Var.m2814I() == 9) {
            l41Var.m2810E();
            return null;
        }
        String strM2812G = l41Var.m2812G();
        synchronized (this) {
            TimeZone timeZone = this.f10367a.getTimeZone();
            try {
                try {
                    time = new Time(this.f10367a.parse(strM2812G).getTime());
                } catch (ParseException e) {
                    throw new t31("Failed parsing '" + strM2812G + "' as SQL Time; at path " + l41Var.m2831o(true), e);
                }
            } finally {
                this.f10367a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            o41Var.m3498p();
            return;
        }
        synchronized (this) {
            str = this.f10367a.format((Date) time);
        }
        o41Var.m3487D(str);
    }

    public /* synthetic */ st2(int i) {
        this();
    }
}
