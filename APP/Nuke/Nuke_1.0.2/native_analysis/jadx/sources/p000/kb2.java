package p000;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kb2 {

    /* JADX INFO: renamed from: a */
    public final C0605q5 f5439a;

    /* JADX INFO: renamed from: b */
    public final hh1 f5440b;

    /* JADX INFO: renamed from: c */
    public final s52 f5441c;

    /* JADX INFO: renamed from: d */
    public final boolean f5442d;

    /* JADX INFO: renamed from: e */
    public final List f5443e;

    /* JADX INFO: renamed from: f */
    public int f5444f;

    /* JADX INFO: renamed from: g */
    public List f5445g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f5446h;

    public kb2(C0605q5 c0605q5, hh1 hh1Var, s52 s52Var, boolean z) {
        List listM5897j;
        hh1Var.getClass();
        this.f5439a = c0605q5;
        this.f5440b = hh1Var;
        this.f5441c = s52Var;
        this.f5442d = z;
        be0 be0Var = be0.f819h;
        this.f5443e = be0Var;
        this.f5445g = be0Var;
        this.f5446h = new ArrayList();
        yw0 yw0Var = c0605q5.f8739i;
        Proxy proxy = c0605q5.f8737g;
        s52Var.f9916k.getClass();
        yw0Var.getClass();
        if (proxy != null) {
            listM5897j = AbstractC0179eu.m1434O(proxy);
        } else {
            URI uriM6362h = yw0Var.m6362h();
            if (uriM6362h.getHost() == null) {
                listM5897j = wg3.m5897j(new Proxy[]{Proxy.NO_PROXY});
            } else {
                List<Proxy> listSelect = c0605q5.f8738h.select(uriM6362h);
                listM5897j = (listSelect == null || listSelect.isEmpty()) ? wg3.m5897j(new Proxy[]{Proxy.NO_PROXY}) : wg3.m5896i(listSelect);
            }
        }
        this.f5443e = listM5897j;
        this.f5444f = 0;
        kg0 kg0Var = s52Var.f9916k;
        List list = this.f5443e;
        kg0Var.getClass();
        list.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2625a() {
        return this.f5444f < this.f5443e.size() || !this.f5446h.isEmpty();
    }
}
