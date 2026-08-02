package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class w43 extends q43 {
    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        if (l41Var.m2814I() == 9) {
            l41Var.m2810E();
            return null;
        }
        String strM2812G = l41Var.m2812G();
        if (strM2812G.length() == 1) {
            return Character.valueOf(strM2812G.charAt(0));
        }
        um2.m5518h("Expecting character, got: ", strM2812G, "; at ", l41Var.m2831o(true));
        return null;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        Character ch = (Character) obj;
        o41Var.m3487D(ch == null ? null : String.valueOf(ch));
    }
}
