package defpackage;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class st2 extends q43 {
    public static final a b = new a();
    public final SimpleDateFormat a;

    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public class a implements r43 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // defpackage.r43
        public final q43 a(ir0 ir0Var, j63 j63Var) {
            if (j63Var.a == Time.class) {
                return new st2(0);
            }
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private st2() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        Time time;
        if (l41Var.I() == 9) {
            l41Var.E();
            return null;
        }
        String strG = l41Var.G();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    time = new Time(this.a.parse(strG).getTime());
                } catch (ParseException e) {
                    throw new t31("Failed parsing '" + strG + "' as SQL Time; at path " + l41Var.o(true), e);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            o41Var.p();
            return;
        }
        synchronized (this) {
            str = this.a.format((Date) time);
        }
        o41Var.D(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:14) call: st2.<init>():void type: THIS */
    public /* synthetic */ st2(int i) {
        this();
    }
}
