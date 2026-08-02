package p000;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class f53 extends q43 {
    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        if (l41Var.m2814I() == 9) {
            l41Var.m2810E();
            return null;
        }
        try {
            String strM2812G = l41Var.m2812G();
            if (strM2812G.equals("null")) {
                return null;
            }
            return new URI(strM2812G);
        } catch (URISyntaxException e) {
            throw new t31(e);
        }
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        URI uri = (URI) obj;
        o41Var.m3487D(uri == null ? null : uri.toASCIIString());
    }
}
