package p000;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bs1 implements r43 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1001h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ q43 f1002i;

    public /* synthetic */ bs1(q43 q43Var, int i) {
        this.f1001h = i;
        this.f1002i = q43Var;
    }

    @Override // p000.r43
    /* JADX INFO: renamed from: a */
    public final q43 mo162a(ir0 ir0Var, j63 j63Var) {
        int i = this.f1001h;
        q43 q43Var = this.f1002i;
        switch (i) {
            case 0:
                if (j63Var.f4904a == Number.class) {
                    return (cs1) q43Var;
                }
                return null;
            default:
                Class cls = j63Var.f4904a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (j53) q43Var;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f1001h) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((j53) this.f1002i) + "]";
            default:
                return super.toString();
        }
    }
}
