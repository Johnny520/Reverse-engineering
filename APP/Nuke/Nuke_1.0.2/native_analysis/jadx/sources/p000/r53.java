package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class r53 extends q43 {
    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        if (l41Var.m2814I() == 9) {
            l41Var.m2810E();
            return null;
        }
        try {
            int iM2837v = l41Var.m2837v();
            if (iM2837v <= 65535 && iM2837v >= -32768) {
                return Short.valueOf((short) iM2837v);
            }
            StringBuilder sbM5695n = vi0.m5695n(iM2837v, "Lossy conversion from ", " to short; at path ");
            sbM5695n.append(l41Var.m2831o(true));
            throw new t31(sbM5695n.toString());
        } catch (NumberFormatException e) {
            throw new t31(e);
        }
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        if (((Number) obj) == null) {
            o41Var.m3498p();
        } else {
            o41Var.m3485A(r4.shortValue());
        }
    }
}
