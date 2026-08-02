package p000;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class h53 extends q43 {
    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        if (l41Var.m2814I() == 9) {
            l41Var.m2810E();
            return null;
        }
        String strM2812G = l41Var.m2812G();
        try {
            return UUID.fromString(strM2812G);
        } catch (IllegalArgumentException e) {
            um2.m5515e(strM2812G, "' as UUID; at path ", l41Var.m2831o(true), e);
            return null;
        }
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        o41Var.m3487D(uuid == null ? null : uuid.toString());
    }
}
