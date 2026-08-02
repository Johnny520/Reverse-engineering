package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bs1 implements r43 {
    public final /* synthetic */ int h;
    public final /* synthetic */ q43 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ bs1(q43 q43Var, int i) {
        this.h = i;
        this.i = q43Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r43
    public final q43 a(ir0 ir0Var, j63 j63Var) {
        int i = this.h;
        q43 q43Var = this.i;
        switch (i) {
            case 0:
                if (j63Var.a == Number.class) {
                    return (cs1) q43Var;
                }
                return null;
            default:
                Class cls = j63Var.a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (j53) q43Var;
                }
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((j53) this.i) + "]";
            default:
                return super.toString();
        }
    }
}
