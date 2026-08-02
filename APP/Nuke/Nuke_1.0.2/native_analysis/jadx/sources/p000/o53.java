package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class o53 extends q43 {
    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        int iM2814I = l41Var.m2814I();
        if (iM2814I != 9) {
            return iM2814I == 6 ? Boolean.valueOf(Boolean.parseBoolean(l41Var.m2812G())) : Boolean.valueOf(l41Var.m2835t());
        }
        l41Var.m2810E();
        return null;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            o41Var.m3498p();
            return;
        }
        o41Var.m3489F();
        o41Var.m3490b();
        o41Var.f7470h.write(bool.booleanValue() ? "true" : "false");
    }
}
