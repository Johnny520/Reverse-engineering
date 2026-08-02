package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kb2 {
    public final q5 a;
    public final hh1 b;
    public final s52 c;
    public final boolean d;
    public final List e;
    public int f;
    public List g;
    public final ArrayList h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kb2(q5 q5Var, hh1 hh1Var, s52 s52Var, boolean z) {
        List listJ;
        hh1Var.getClass();
        this.a = q5Var;
        this.b = hh1Var;
        this.c = s52Var;
        this.d = z;
        be0 be0Var = be0.h;
        this.e = be0Var;
        this.g = be0Var;
        this.h = new ArrayList();
        yw0 yw0Var = q5Var.i;
        Proxy proxy = q5Var.g;
        s52Var.k.getClass();
        yw0Var.getClass();
        if (proxy != null) {
            listJ = eu.O(proxy);
        } else {
            URI uriH = yw0Var.h();
            if (uriH.getHost() == null) {
                listJ = wg3.j(new Proxy[]{Proxy.NO_PROXY});
            } else {
                List<Proxy> listSelect = q5Var.h.select(uriH);
                listJ = (listSelect == null || listSelect.isEmpty()) ? wg3.j(new Proxy[]{Proxy.NO_PROXY}) : wg3.i(listSelect);
            }
        }
        this.e = listJ;
        this.f = 0;
        kg0 kg0Var = s52Var.k;
        List list = this.e;
        kg0Var.getClass();
        list.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        return this.f < this.e.size() || !this.h.isEmpty();
    }
}
