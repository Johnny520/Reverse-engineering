package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class v43 extends q43 {
    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        if (l41Var.m2814I() != 9) {
            return Double.valueOf(l41Var.m2836u());
        }
        l41Var.m2810E();
        return null;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            o41Var.m3498p();
        } else {
            o41Var.m3503v(number.doubleValue());
        }
    }
}
